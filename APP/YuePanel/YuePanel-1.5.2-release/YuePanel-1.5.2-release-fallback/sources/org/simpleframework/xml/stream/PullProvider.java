package org.simpleframework.xml.stream;

/* JADX INFO: loaded from: classes2.dex */
class PullProvider implements org.simpleframework.xml.stream.Provider {
    private final org.xmlpull.v1.XmlPullParserFactory factory;

    public PullProvider() throws java.lang.Exception {
            r2 = this;
            r2.<init>()
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()
            r2.factory = r0
            r1 = 1
            r0.setNamespaceAware(r1)
            return
    }

    @Override // org.simpleframework.xml.stream.Provider
    public org.simpleframework.xml.stream.EventReader provide(java.io.InputStream r3) throws java.lang.Exception {
            r2 = this;
            org.xmlpull.v1.XmlPullParserFactory r0 = r2.factory
            org.xmlpull.v1.XmlPullParser r0 = r0.newPullParser()
            if (r3 == 0) goto Lc
            r1 = 0
            r0.setInput(r3, r1)
        Lc:
            org.simpleframework.xml.stream.PullReader r3 = new org.simpleframework.xml.stream.PullReader
            r3.<init>(r0)
            return r3
    }

    @Override // org.simpleframework.xml.stream.Provider
    public org.simpleframework.xml.stream.EventReader provide(java.io.Reader r2) throws java.lang.Exception {
            r1 = this;
            org.xmlpull.v1.XmlPullParserFactory r0 = r1.factory
            org.xmlpull.v1.XmlPullParser r0 = r0.newPullParser()
            if (r2 == 0) goto Lb
            r0.setInput(r2)
        Lb:
            org.simpleframework.xml.stream.PullReader r2 = new org.simpleframework.xml.stream.PullReader
            r2.<init>(r0)
            return r2
    }
}
