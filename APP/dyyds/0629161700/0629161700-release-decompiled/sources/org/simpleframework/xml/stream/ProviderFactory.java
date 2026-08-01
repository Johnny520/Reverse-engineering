package org.simpleframework.xml.stream;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
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
