package org.simpleframework.xml.strategy;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class Loader {
    public Loader() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.ClassLoader getCallerClassLoader() {
            java.lang.Class<org.simpleframework.xml.strategy.Loader> r0 = org.simpleframework.xml.strategy.Loader.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            return r0
    }

    private static java.lang.ClassLoader getClassLoader() {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r0 = r0.getContextClassLoader()
            return r0
    }

    public java.lang.Class load(java.lang.String r1) {
            r0 = this;
            java.lang.ClassLoader r0 = getClassLoader()
            if (r0 != 0) goto La
            java.lang.ClassLoader r0 = getCallerClassLoader()
        La:
            java.lang.Class r0 = r0.loadClass(r1)
            return r0
    }
}
