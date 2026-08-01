package defpackage;

/* JADX INFO: renamed from: ᛲᲀᛵᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0350 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final /* synthetic */ int f1814 = 0;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static java.lang.Class m1058(java.lang.String r1, java.lang.ClassLoader r2, int r3) {
            r3 = r3 & 1
            r0 = 0
            if (r3 == 0) goto L6
            r2 = r0
        L6:
            java.lang.Class r1 = m1059(r2, r1)     // Catch: java.lang.Throwable -> Lb
            goto L12
        Lb:
            r1 = move-exception
            ᛴᛸᛲᲀ r2 = new ᛴᛸᛲᲀ
            r2.<init>(r1)
            r1 = r2
        L12:
            boolean r2 = r1 instanceof defpackage.C0723
            if (r2 == 0) goto L17
            goto L18
        L17:
            r0 = r1
        L18:
            java.lang.Class r0 = (java.lang.Class) r0
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final java.lang.Class m1059(java.lang.ClassLoader r1, java.lang.String r2) {
            if (r1 != 0) goto L4
            java.lang.ClassLoader r1 = defpackage.C0292.f1593
        L4:
            if (r1 == 0) goto Lc
            r0 = 0
            java.lang.Class r1 = java.lang.Class.forName(r2, r0, r1)
            goto L10
        Lc:
            java.lang.Class r1 = java.lang.Class.forName(r2)
        L10:
            if (r1 == 0) goto L13
            return r1
        L13:
            java.lang.String r1 = "JVM class not resolved: "
            defpackage.C2264.m3681(r2, r1)
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Class m1060(java.lang.String r0, java.lang.ClassLoader r1, int r2) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            java.lang.Class r0 = m1059(r1, r0)
            return r0
    }
}
