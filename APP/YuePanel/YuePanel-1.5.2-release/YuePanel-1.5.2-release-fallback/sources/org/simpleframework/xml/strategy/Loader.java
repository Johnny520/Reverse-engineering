package org.simpleframework.xml.strategy;

/* JADX INFO: loaded from: classes2.dex */
class Loader {
    public Loader() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.ClassLoader getCallerClassLoader() throws java.lang.Exception {
            java.lang.Class<org.simpleframework.xml.strategy.Loader> r0 = org.simpleframework.xml.strategy.Loader.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            return r0
    }

    private static java.lang.ClassLoader getClassLoader() throws java.lang.Exception {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r0 = r0.getContextClassLoader()
            return r0
    }

    public java.lang.Class load(java.lang.String r2) throws java.lang.Exception {
            r1 = this;
            java.lang.ClassLoader r0 = getClassLoader()
            if (r0 != 0) goto La
            java.lang.ClassLoader r0 = getCallerClassLoader()
        La:
            java.lang.Class r2 = r0.loadClass(r2)
            return r2
    }
}
