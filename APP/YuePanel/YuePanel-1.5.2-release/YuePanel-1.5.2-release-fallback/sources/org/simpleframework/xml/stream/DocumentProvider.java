package org.simpleframework.xml.stream;

/* JADX INFO: loaded from: classes2.dex */
class DocumentProvider implements org.simpleframework.xml.stream.Provider {
    private final javax.xml.parsers.DocumentBuilderFactory factory;

    public DocumentProvider() {
            r2 = this;
            r2.<init>()
            javax.xml.parsers.DocumentBuilderFactory r0 = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            r2.factory = r0
            r1 = 1
            r0.setNamespaceAware(r1)
            return
    }

    private org.simpleframework.xml.stream.EventReader provide(org.xml.sax.InputSource r2) throws java.lang.Exception {
            r1 = this;
            javax.xml.parsers.DocumentBuilderFactory r0 = r1.factory
            javax.xml.parsers.DocumentBuilder r0 = r0.newDocumentBuilder()
            org.w3c.dom.Document r2 = r0.parse(r2)
            org.simpleframework.xml.stream.DocumentReader r0 = new org.simpleframework.xml.stream.DocumentReader
            r0.<init>(r2)
            return r0
    }

    @Override // org.simpleframework.xml.stream.Provider
    public org.simpleframework.xml.stream.EventReader provide(java.io.InputStream r2) throws java.lang.Exception {
            r1 = this;
            org.xml.sax.InputSource r0 = new org.xml.sax.InputSource
            r0.<init>(r2)
            org.simpleframework.xml.stream.EventReader r2 = r1.provide(r0)
            return r2
    }

    @Override // org.simpleframework.xml.stream.Provider
    public org.simpleframework.xml.stream.EventReader provide(java.io.Reader r2) throws java.lang.Exception {
            r1 = this;
            org.xml.sax.InputSource r0 = new org.xml.sax.InputSource
            r0.<init>(r2)
            org.simpleframework.xml.stream.EventReader r2 = r1.provide(r0)
            return r2
    }
}
