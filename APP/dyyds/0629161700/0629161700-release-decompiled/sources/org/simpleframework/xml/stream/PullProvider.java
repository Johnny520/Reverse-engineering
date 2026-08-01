package org.simpleframework.xml.stream;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class PullProvider implements org.simpleframework.xml.stream.Provider {
    private final org.xmlpull.v1.XmlPullParserFactory factory;

    public PullProvider() {
            r1 = this;
            r1.<init>()
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()
            r1.factory = r0
            r1 = 1
            r0.setNamespaceAware(r1)
            return
    }

    @Override // org.simpleframework.xml.stream.Provider
    public org.simpleframework.xml.stream.EventReader provide(java.io.InputStream r2) {
            r1 = this;
            org.xmlpull.v1.XmlPullParserFactory r1 = r1.factory
            org.xmlpull.v1.XmlPullParser r1 = r1.newPullParser()
            if (r2 == 0) goto Lc
            r0 = 0
            r1.setInput(r2, r0)
        Lc:
            org.simpleframework.xml.stream.PullReader r2 = new org.simpleframework.xml.stream.PullReader
            r2.<init>(r1)
            return r2
    }

    @Override // org.simpleframework.xml.stream.Provider
    public org.simpleframework.xml.stream.EventReader provide(java.io.Reader r1) {
            r0 = this;
            org.xmlpull.v1.XmlPullParserFactory r0 = r0.factory
            org.xmlpull.v1.XmlPullParser r0 = r0.newPullParser()
            if (r1 == 0) goto Lb
            r0.setInput(r1)
        Lb:
            org.simpleframework.xml.stream.PullReader r1 = new org.simpleframework.xml.stream.PullReader
            r1.<init>(r0)
            return r1
    }
}
