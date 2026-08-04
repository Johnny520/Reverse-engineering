package com.thegrizzlylabs.sardineandroid.model;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Converter;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;
import org.w3c.dom.Element;
import yyds.AbstractC0578;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
@Namespace(prefix = "D", reference = "DAV:")
@Root(strict = false)
public class Property {
    private Element property;

    /* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
    public static class PropertyConverter implements Converter<Property> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.simpleframework.xml.convert.Converter
        public Property read(InputNode inputNode) {
            Property property = new Property();
            InputNode next = inputNode.getNext();
            if (next != null) {
                property.setProperty(AbstractC0578.m1449(next));
            }
            return property;
        }

        @Override // org.simpleframework.xml.convert.Converter
        public void write(OutputNode outputNode, Property property) {
            Element element = property.property;
            OutputNode child = outputNode.getChild(element.getNodeName());
            child.getNamespaces().setReference(element.getNamespaceURI(), element.getPrefix());
            child.setValue(element.getTextContent());
            child.commit();
        }
    }

    public Element getProperty() {
        return this.property;
    }

    public void setProperty(Element element) {
        this.property = element;
    }
}
