package org.prabu.spring.excel.objectbinding.domain;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class Example extends Base {


    /**
     *
     */
    private static final long serialVersionUID = -6451393943123878568L;

    private String key;
    private String value;

    public Example() {
        // TODO Auto-generated constructor stub
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Example{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
