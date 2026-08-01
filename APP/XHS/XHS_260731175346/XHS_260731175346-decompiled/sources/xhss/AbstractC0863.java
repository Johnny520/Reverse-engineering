package xhss;

/* JADX INFO: renamed from: xhss.ᲀᛵᛷᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0863 {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final java.lang.ThreadLocal f2793 = null;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            xhss.AbstractC0863.f2793 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static xhss.AbstractC0503 m1439() {
            java.lang.ThreadLocal r0 = xhss.AbstractC0863.f2793
            java.lang.Object r1 = r0.get()
            xhss.ᛵᛸᛲᛲ r1 = (xhss.AbstractC0503) r1
            if (r1 != 0) goto L16
            xhss.ᛷᛵᛱᲀ r1 = new xhss.ᛷᛵᛱᲀ
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r1.<init>(r2)
            r0.set(r1)
        L16:
            return r1
    }
}
