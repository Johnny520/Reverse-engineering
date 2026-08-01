package com.thegrizzlylabs.sardineandroid.model;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
@org.simpleframework.xml.Namespace(prefix = "D", reference = "DAV:")
@org.simpleframework.xml.Root(strict = false)
public class Property {
    private org.w3c.dom.Element property;

    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
    public static class PropertyConverter implements org.simpleframework.xml.convert.Converter<com.thegrizzlylabs.sardineandroid.model.Property> {
        public PropertyConverter() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.simpleframework.xml.convert.Converter
        public com.thegrizzlylabs.sardineandroid.model.Property read(org.simpleframework.xml.stream.InputNode r1) {
                r0 = this;
                com.thegrizzlylabs.sardineandroid.model.Property r0 = new com.thegrizzlylabs.sardineandroid.model.Property
                r0.<init>()
                org.simpleframework.xml.stream.InputNode r1 = r1.getNext()
                if (r1 == 0) goto L12
                org.w3c.dom.Element r1 = defpackage.AbstractC0762.m1679(r1)
                r0.setProperty(r1)
            L12:
                return r0
        }

        @Override // org.simpleframework.xml.convert.Converter
        public /* bridge */ /* synthetic */ com.thegrizzlylabs.sardineandroid.model.Property read(org.simpleframework.xml.stream.InputNode r1) {
                r0 = this;
                com.thegrizzlylabs.sardineandroid.model.Property r0 = r0.read(r1)
                return r0
        }

        /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
        public void write2(org.simpleframework.xml.stream.OutputNode r3, com.thegrizzlylabs.sardineandroid.model.Property r4) {
                r2 = this;
                org.w3c.dom.Element r2 = com.thegrizzlylabs.sardineandroid.model.Property.m317(r4)
                java.lang.String r4 = r2.getNodeName()
                org.simpleframework.xml.stream.OutputNode r3 = r3.getChild(r4)
                org.simpleframework.xml.stream.NamespaceMap r4 = r3.getNamespaces()
                java.lang.String r0 = r2.getNamespaceURI()
                java.lang.String r1 = r2.getPrefix()
                r4.setReference(r0, r1)
                java.lang.String r2 = r2.getTextContent()
                r3.setValue(r2)
                r3.commit()
                return
        }

        @Override // org.simpleframework.xml.convert.Converter
        public /* bridge */ /* synthetic */ void write(org.simpleframework.xml.stream.OutputNode r1, com.thegrizzlylabs.sardineandroid.model.Property r2) {
                r0 = this;
                com.thegrizzlylabs.sardineandroid.model.Property r2 = (com.thegrizzlylabs.sardineandroid.model.Property) r2
                r0.write2(r1, r2)
                return
        }
    }

    public Property() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ org.w3c.dom.Element m317(com.thegrizzlylabs.sardineandroid.model.Property r0) {
            org.w3c.dom.Element r0 = r0.property
            return r0
    }

    public org.w3c.dom.Element getProperty() {
            r0 = this;
            org.w3c.dom.Element r0 = r0.property
            return r0
    }

    public void setProperty(org.w3c.dom.Element r1) {
            r0 = this;
            r0.property = r1
            return
    }
}
