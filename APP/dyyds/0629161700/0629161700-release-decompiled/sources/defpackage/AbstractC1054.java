package defpackage;

/* JADX INFO: renamed from: ᛶᛴᛱᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1054 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final java.lang.ThreadLocal f4655 = null;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            defpackage.AbstractC1054.f4655 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static defpackage.AbstractC0092 m2007() {
            java.lang.ThreadLocal r0 = defpackage.AbstractC1054.f4655
            java.lang.Object r1 = r0.get()
            ᛱᛵᛶᲇ r1 = (defpackage.AbstractC0092) r1
            if (r1 != 0) goto L16
            ᛶᲇᛸᛵ r1 = new ᛶᲇᛸᛵ
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r1.<init>(r2)
            r0.set(r1)
        L16:
            return r1
    }
}
