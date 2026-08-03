package org.simpleframework.xml.stream;

/* JADX INFO: loaded from: classes2.dex */
final class ProviderFactory {
    public ProviderFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public static org.simpleframework.xml.stream.Provider getInstance() {
            org.simpleframework.xml.stream.StreamProvider r0 = new org.simpleframework.xml.stream.StreamProvider     // Catch: java.lang.Throwable -> L6
            r0.<init>()     // Catch: java.lang.Throwable -> L6
            return r0
        L6:
            org.simpleframework.xml.stream.PullProvider r0 = new org.simpleframework.xml.stream.PullProvider     // Catch: java.lang.Throwable -> Lc
            r0.<init>()     // Catch: java.lang.Throwable -> Lc
            return r0
        Lc:
            org.simpleframework.xml.stream.DocumentProvider r0 = new org.simpleframework.xml.stream.DocumentProvider
            r0.<init>()
            return r0
    }
}
