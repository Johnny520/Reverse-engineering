package org.simpleframework.xml.stream;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class DocumentProvider implements org.simpleframework.xml.stream.Provider {
    private final javax.xml.parsers.DocumentBuilderFactory factory;

    public DocumentProvider() {
            r1 = this;
            r1.<init>()
            javax.xml.parsers.DocumentBuilderFactory r0 = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            r1.factory = r0
            r1 = 1
            r0.setNamespaceAware(r1)
            return
    }

    private org.simpleframework.xml.stream.EventReader provide(org.xml.sax.InputSource r1) {
            r0 = this;
            javax.xml.parsers.DocumentBuilderFactory r0 = r0.factory
            javax.xml.parsers.DocumentBuilder r0 = r0.newDocumentBuilder()
            org.w3c.dom.Document r0 = r0.parse(r1)
            org.simpleframework.xml.stream.DocumentReader r1 = new org.simpleframework.xml.stream.DocumentReader
            r1.<init>(r0)
            return r1
    }

    @Override // org.simpleframework.xml.stream.Provider
    public org.simpleframework.xml.stream.EventReader provide(java.io.InputStream r2) {
            r1 = this;
            org.xml.sax.InputSource r0 = new org.xml.sax.InputSource
            r0.<init>(r2)
            org.simpleframework.xml.stream.EventReader r1 = r1.provide(r0)
            return r1
    }

    @Override // org.simpleframework.xml.stream.Provider
    public org.simpleframework.xml.stream.EventReader provide(java.io.Reader r2) {
            r1 = this;
            org.xml.sax.InputSource r0 = new org.xml.sax.InputSource
            r0.<init>(r2)
            org.simpleframework.xml.stream.EventReader r1 = r1.provide(r0)
            return r1
    }
}
