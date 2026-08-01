package com.highcapable.kavaref.extension;

/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class ClassLoaderProvider {
    public static final com.highcapable.kavaref.extension.ClassLoaderProvider INSTANCE = null;
    private static java.lang.ClassLoader classLoader;

    static {
            com.highcapable.kavaref.extension.ClassLoaderProvider r0 = new com.highcapable.kavaref.extension.ClassLoaderProvider
            r0.<init>()
            com.highcapable.kavaref.extension.ClassLoaderProvider.INSTANCE = r0
            return
    }

    private ClassLoaderProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    public final java.lang.ClassLoader getClassLoader() {
            r0 = this;
            java.lang.ClassLoader r0 = com.highcapable.kavaref.extension.ClassLoaderProvider.classLoader
            return r0
    }

    public final void setClassLoader(java.lang.ClassLoader r1) {
            r0 = this;
            com.highcapable.kavaref.extension.ClassLoaderProvider.classLoader = r1
            return
    }
}
