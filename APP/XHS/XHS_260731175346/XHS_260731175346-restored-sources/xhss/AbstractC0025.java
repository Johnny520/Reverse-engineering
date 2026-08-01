package xhss;

/* JADX INFO: renamed from: xhss.ᛱᛳᛵᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0025 {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final /* synthetic */ int f204 = 0;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Class m127(java.lang.String r0, java.lang.ClassLoader r1, int r2) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            java.lang.Class r0 = m129(r1, r0)
            return r0
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static java.lang.Class m128(java.lang.String r1, java.lang.ClassLoader r2, int r3) {
            r3 = r3 & 1
            r0 = 0
            if (r3 == 0) goto L6
            r2 = r0
        L6:
            java.lang.Class r1 = m129(r2, r1)     // Catch: java.lang.Throwable -> Lb
            goto L12
        Lb:
            r1 = move-exception
            xhss.ᲈᛳᛱᲇ r2 = new xhss.ᲈᛳᛱᲇ
            r2.<init>(r1)
            r1 = r2
        L12:
            boolean r2 = r1 instanceof xhss.C1129
            if (r2 == 0) goto L17
            goto L18
        L17:
            r0 = r1
        L18:
            java.lang.Class r0 = (java.lang.Class) r0
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final java.lang.Class m129(java.lang.ClassLoader r1, java.lang.String r2) {
            if (r1 != 0) goto L8
            com.highcapable.kavaref.extension.ClassLoaderProvider r1 = com.highcapable.kavaref.extension.ClassLoaderProvider.INSTANCE
            java.lang.ClassLoader r1 = r1.getClassLoader()
        L8:
            if (r1 == 0) goto L10
            r0 = 0
            java.lang.Class r1 = java.lang.Class.forName(r2, r0, r1)
            goto L14
        L10:
            java.lang.Class r1 = java.lang.Class.forName(r2)
        L14:
            if (r1 == 0) goto L17
            return r1
        L17:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "JVM class not resolved: "
            java.lang.String r2 = r0.concat(r2)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }
}
