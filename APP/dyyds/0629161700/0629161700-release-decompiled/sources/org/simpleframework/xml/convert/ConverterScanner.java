package org.simpleframework.xml.convert;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
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

    private <T extends java.lang.annotation.Annotation> T getAnnotation(java.lang.Class<?> r1, java.lang.Class<T> r2) {
            r0 = this;
            org.simpleframework.xml.convert.ScannerBuilder r0 = r0.builder
            org.simpleframework.xml.convert.Scanner r0 = r0.build(r1)
            java.lang.annotation.Annotation r0 = r0.scan(r2)
            return r0
    }

    private org.simpleframework.xml.convert.Convert getConvert(java.lang.Class r3) {
            r2 = this;
            java.lang.Class<org.simpleframework.xml.convert.Convert> r0 = org.simpleframework.xml.convert.Convert.class
            java.lang.annotation.Annotation r0 = r2.getAnnotation(r3, r0)
            org.simpleframework.xml.convert.Convert r0 = (org.simpleframework.xml.convert.Convert) r0
            if (r0 == 0) goto L21
            java.lang.Class<org.simpleframework.xml.Root> r1 = org.simpleframework.xml.Root.class
            java.lang.annotation.Annotation r2 = r2.getAnnotation(r3, r1)
            org.simpleframework.xml.Root r2 = (org.simpleframework.xml.Root) r2
            if (r2 == 0) goto L15
            goto L21
        L15:
            org.simpleframework.xml.convert.ConvertException r2 = new org.simpleframework.xml.convert.ConvertException
            java.lang.String r0 = "Root annotation required for %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            r2.<init>(r0, r3)
            throw r2
        L21:
            return r0
    }

    private org.simpleframework.xml.convert.Convert getConvert(org.simpleframework.xml.strategy.Type r2) {
            r1 = this;
            java.lang.Class<org.simpleframework.xml.convert.Convert> r1 = org.simpleframework.xml.convert.Convert.class
            java.lang.annotation.Annotation r1 = r2.getAnnotation(r1)
            org.simpleframework.xml.convert.Convert r1 = (org.simpleframework.xml.convert.Convert) r1
            if (r1 == 0) goto L21
            java.lang.Class<org.simpleframework.xml.Element> r0 = org.simpleframework.xml.Element.class
            java.lang.annotation.Annotation r0 = r2.getAnnotation(r0)
            org.simpleframework.xml.Element r0 = (org.simpleframework.xml.Element) r0
            if (r0 == 0) goto L15
            goto L21
        L15:
            org.simpleframework.xml.convert.ConvertException r1 = new org.simpleframework.xml.convert.ConvertException
            java.lang.String r0 = "Element annotation required for %s"
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r1.<init>(r0, r2)
            throw r1
        L21:
            return r1
    }

    private org.simpleframework.xml.convert.Convert getConvert(org.simpleframework.xml.strategy.Type r1, java.lang.Class r2) {
            r0 = this;
            org.simpleframework.xml.convert.Convert r1 = r0.getConvert(r1)
            if (r1 != 0) goto Lb
            org.simpleframework.xml.convert.Convert r0 = r0.getConvert(r2)
            return r0
        Lb:
            return r1
    }

    private java.lang.Class getType(org.simpleframework.xml.strategy.Type r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Class r0 = r1.getType()
            if (r2 == 0) goto La
            java.lang.Class r0 = r2.getClass()
        La:
            return r0
    }

    private java.lang.Class getType(org.simpleframework.xml.strategy.Type r1, org.simpleframework.xml.strategy.Value r2) {
            r0 = this;
            java.lang.Class r0 = r1.getType()
            if (r2 == 0) goto La
            java.lang.Class r0 = r2.getType()
        La:
            return r0
    }

    public org.simpleframework.xml.convert.Converter getConverter(org.simpleframework.xml.strategy.Type r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Class r2 = r0.getType(r1, r2)
            org.simpleframework.xml.convert.Convert r1 = r0.getConvert(r1, r2)
            if (r1 == 0) goto L11
            org.simpleframework.xml.convert.ConverterFactory r0 = r0.factory
            org.simpleframework.xml.convert.Converter r0 = r0.getInstance(r1)
            return r0
        L11:
            r0 = 0
            return r0
    }

    public org.simpleframework.xml.convert.Converter getConverter(org.simpleframework.xml.strategy.Type r1, org.simpleframework.xml.strategy.Value r2) {
            r0 = this;
            java.lang.Class r2 = r0.getType(r1, r2)
            org.simpleframework.xml.convert.Convert r1 = r0.getConvert(r1, r2)
            if (r1 == 0) goto L11
            org.simpleframework.xml.convert.ConverterFactory r0 = r0.factory
            org.simpleframework.xml.convert.Converter r0 = r0.getInstance(r1)
            return r0
        L11:
            r0 = 0
            return r0
    }
}
