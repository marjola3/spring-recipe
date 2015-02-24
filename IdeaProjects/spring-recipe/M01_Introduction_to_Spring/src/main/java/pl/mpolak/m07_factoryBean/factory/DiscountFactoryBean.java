package pl.mpolak.m07_factoryBean.factory;

import org.springframework.beans.factory.config.AbstractFactoryBean;
import pl.mpolak.m07_factoryBean.product.Product;

/**
 * Created by Mariola on 2015-02-24.
 */
public class DiscountFactoryBean extends AbstractFactoryBean{

    private Product product;
    private double discount;

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public Class<?> getObjectType() {
        return product.getClass();
    }

    @Override
    protected Object createInstance() throws Exception {
        product.setPrice(product.getPrice() * (1 - discount));
        return product;
    }
}
