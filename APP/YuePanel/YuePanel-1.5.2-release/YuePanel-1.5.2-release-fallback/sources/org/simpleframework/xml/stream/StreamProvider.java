package org.simpleframework.xml.stream;

/* JADX INFO: loaded from: classes2.dex */
class StreamProvider implements org.simpleframework.xml.stream.Provider {
    private final Yue.AbstractC7152 factory;

    public StreamProvider() {
            r1 = this;
            r1.<init>()
            Yue.ۥۢۦۡۧ r0 = Yue.AbstractC7152.m27518()
            r1.factory = r0
            return
    }

    private org.simpleframework.xml.stream.EventReader provide(Yue.InterfaceC7148 r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.stream.StreamReader r0 = new org.simpleframework.xml.stream.StreamReader
            r0.<init>(r2)
            return r0
    }

    @Override // org.simpleframework.xml.stream.Provider
    public org.simpleframework.xml.stream.EventReader provide(java.io.InputStream r2) throws java.lang.Exception {
            r1 = this;
            Yue.ۥۢۦۡۧ r0 = r1.factory
            Yue.ۥۢۦۣۡ r2 = r0.mo15558(r2)
            org.simpleframework.xml.stream.EventReader r2 = r1.provide(r2)
            return r2
    }

    @Override // org.simpleframework.xml.stream.Provider
    public org.simpleframework.xml.stream.EventReader provide(java.io.Reader r2) throws java.lang.Exception {
            r1 = this;
            Yue.ۥۢۦۡۧ r0 = r1.factory
            Yue.ۥۢۦۣۡ r2 = r0.mo15560(r2)
            org.simpleframework.xml.stream.EventReader r2 = r1.provide(r2)
            return r2
    }
}
