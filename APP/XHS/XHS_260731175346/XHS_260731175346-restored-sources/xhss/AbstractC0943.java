package xhss;

/* JADX INFO: renamed from: xhss.ᲁᛴᛱᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0943 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final xhss.C0380 f3060 = null;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final xhss.C0564 f3061 = null;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final xhss.C0380 f3062 = null;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static final int f3063 = 0;

    static {
            xhss.ᛴᛶᛲᛶ r0 = new xhss.ᛴᛶᛲᛶ
            r1 = 8
            r0.<init>(r1)
            xhss.ᛴᛷᛱ r1 = new xhss.ᛴᛷᛱ
            r1.<init>(r0)
            xhss.AbstractC0943.f3062 = r1
            xhss.ᛴᛶᛲᛶ r0 = new xhss.ᛴᛶᛲᛶ
            r1 = 9
            r0.<init>(r1)
            xhss.ᛴᛷᛱ r1 = new xhss.ᛴᛷᛱ
            r1.<init>(r0)
            xhss.AbstractC0943.f3060 = r1
            xhss.ᛶᛵᲇᛸ r0 = new xhss.ᛶᛵᲇᛸ
            r2 = 6
            r0.<init>(r2)
            xhss.AbstractC0943.f3061 = r0
            r0 = 3
            xhss.AbstractC0943.f3063 = r0
            java.lang.Object r1 = r1.m734()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L3a
            java.lang.String r1 = "org.slf4j.simpleLogger.defaultLogLevel"
            java.lang.String r2 = "warn"
            java.lang.System.setProperty(r1, r2)
        L3a:
            xhss.AbstractC0943.f3063 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static void m1537(java.lang.String r2, java.lang.Throwable r3) {
            int r0 = xhss.AbstractC0943.f3063
            int r0 = xhss.AbstractC0390.m784(r0)
            r1 = 3
            int r1 = xhss.AbstractC0390.m784(r1)
            if (r0 > r1) goto L39
            xhss.ᛶᛵᲇᛸ r0 = xhss.AbstractC0943.f3061
            r0.getClass()
            xhss.ᛴᛷᛱ r0 = xhss.AbstractC0943.f3060
            java.lang.Object r0 = r0.m734()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L30
            xhss.ᛴᛷᛱ r0 = xhss.AbstractC0943.f3062
            java.lang.Object r0 = r0.m734()
            xhss.ᲀᛶᛶᲀ r0 = (xhss.InterfaceC0869) r0
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.mo378(r2, r3)
            return
        L30:
            java.lang.String r0 = "KavaRef"
            java.lang.String r2 = java.lang.String.valueOf(r2)
            android.util.Log.w(r0, r2, r3)
        L39:
            return
    }
}
