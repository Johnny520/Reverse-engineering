package org.simpleframework.xml.convert;

/* JADX INFO: loaded from: classes2.dex */
class ConverterScanner {
    private final org.simpleframework.xml.convert.ScannerBuilder builder;
    private final org.simpleframework.xml.convert.ConverterFactory factory;

    public ConverterScanner() {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.convert.ConverterFactory r0 = new org.simpleframework.xml.convert.ConverterFactory
            r0.<init>()
            r1.factory = r0
            org.simpleframework.xml.convert.ScannerBuilder r0 = new org.simpleframework.xml.convert.ScannerBuilder
            r0.<init>()
            r1.builder = r0
            return
    }

    private <T extends java.lang.annotation.Annotation> T getAnnotation(java.lang.Class<?> r2, java.lang.Class<T> r3) {
            r1 = this;
            org.simpleframework.xml.convert.ScannerBuilder r0 = r1.builder
            org.simpleframework.xml.convert.Scanner r2 = r0.build(r2)
            java.lang.annotation.Annotation r2 = r2.scan(r3)
            return r2
    }

    private org.simpleframework.xml.convert.Convert getConvert(java.lang.Class r3) throws java.lang.Exception {
            r2 = this;
            java.lang.Class<org.simpleframework.xml.convert.Convert> r0 = org.simpleframework.xml.convert.Convert.class
            java.lang.annotation.Annotation r0 = r2.getAnnotation(r3, r0)
            org.simpleframework.xml.convert.Convert r0 = (org.simpleframework.xml.convert.Convert) r0
            if (r0 == 0) goto L21
            java.lang.Class<org.simpleframework.xml.Root> r1 = org.simpleframework.xml.Root.class
            java.lang.annotation.Annotation r1 = r2.getAnnotation(r3, r1)
            org.simpleframework.xml.Root r1 = (org.simpleframework.xml.Root) r1
            if (r1 == 0) goto L15
            goto L21
        L15:
            org.simpleframework.xml.convert.ConvertException r0 = new org.simpleframework.xml.convert.ConvertException
            java.lang.String r1 = "Root annotation required for %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            r0.<init>(r1, r3)
            throw r0
        L21:
            return r0
    }

    private org.simpleframework.xml.convert.Convert getConvert(org.simpleframework.xml.strategy.Type r3) throws java.lang.Exception {
            r2 = this;
            java.lang.Class<org.simpleframework.xml.convert.Convert> r0 = org.simpleframework.xml.convert.Convert.class
            java.lang.annotation.Annotation r0 = r3.getAnnotation(r0)
            org.simpleframework.xml.convert.Convert r0 = (org.simpleframework.xml.convert.Convert) r0
            if (r0 == 0) goto L21
            java.lang.Class<org.simpleframework.xml.Element> r1 = org.simpleframework.xml.Element.class
            java.lang.annotation.Annotation r1 = r3.getAnnotation(r1)
            org.simpleframework.xml.Element r1 = (org.simpleframework.xml.Element) r1
            if (r1 == 0) goto L15
            goto L21
        L15:
            org.simpleframework.xml.convert.ConvertException r0 = new org.simpleframework.xml.convert.ConvertException
            java.lang.String r1 = "Element annotation required for %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            r0.<init>(r1, r3)
            throw r0
        L21:
            return r0
    }

    private org.simpleframework.xml.convert.Convert getConvert(org.simpleframework.xml.strategy.Type r1, java.lang.Class r2) throws java.lang.Exception {
            r0 = this;
            org.simpleframework.xml.convert.Convert r1 = r0.getConvert(r1)
            if (r1 != 0) goto La
            org.simpleframework.xml.convert.Convert r1 = r0.getConvert(r2)
        La:
            return r1
    }

    private java.lang.Class getType(org.simpleframework.xml.strategy.Type r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Class r1 = r1.getType()
            if (r2 == 0) goto La
            java.lang.Class r1 = r2.getClass()
        La:
            return r1
    }

    private java.lang.Class getType(org.simpleframework.xml.strategy.Type r1, org.simpleframework.xml.strategy.Value r2) {
            r0 = this;
            java.lang.Class r1 = r1.getType()
            if (r2 == 0) goto La
            java.lang.Class r1 = r2.getType()
        La:
            return r1
    }

    public org.simpleframework.xml.convert.Converter getConverter(org.simpleframework.xml.strategy.Type r1, java.lang.Object r2) throws java.lang.Exception {
            r0 = this;
            java.lang.Class r2 = r0.getType(r1, r2)
            org.simpleframework.xml.convert.Convert r1 = r0.getConvert(r1, r2)
            if (r1 == 0) goto L11
            org.simpleframework.xml.convert.ConverterFactory r2 = r0.factory
            org.simpleframework.xml.convert.Converter r1 = r2.getInstance(r1)
            return r1
        L11:
            r1 = 0
            return r1
    }

    public org.simpleframework.xml.convert.Converter getConverter(org.simpleframework.xml.strategy.Type r1, org.simpleframework.xml.strategy.Value r2) throws java.lang.Exception {
            r0 = this;
            java.lang.Class r2 = r0.getType(r1, r2)
            org.simpleframework.xml.convert.Convert r1 = r0.getConvert(r1, r2)
            if (r1 == 0) goto L11
            org.simpleframework.xml.convert.ConverterFactory r2 = r0.factory
            org.simpleframework.xml.convert.Converter r1 = r2.getInstance(r1)
            return r1
        L11:
            r1 = 0
            return r1
    }
}
