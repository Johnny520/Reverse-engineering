package xhss;

/* JADX INFO: renamed from: xhss.ᛲᛲᲀᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0137 {

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public static final android.os.Handler f596 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public xhss.C0239 f597;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.lang.String f598;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public boolean f599;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C1118 f600;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final xhss.RunnableC0778 f601;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public boolean f602;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final xhss.RunnableC0778 f603;

    static {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            xhss.C0137.f596 = r0
            return
    }

    public C0137(android.content.ContextWrapper r3, xhss.C1118 r4) {
            r2 = this;
            r2.<init>()
            xhss.ᛸᛶᲀᲁ r0 = new xhss.ᛸᛶᲀᲁ
            r1 = 0
            r0.<init>(r2, r1)
            r2.f603 = r0
            xhss.ᛸᛶᲀᲁ r0 = new xhss.ᛸᛶᲀᲁ
            r1 = 1
            r0.<init>(r2, r1)
            r2.f601 = r0
            r2.f600 = r4
            java.lang.String r3 = r3.getPackageName()
            r2.f598 = r3
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static void m366(android.view.View r4) {
            android.content.Context r0 = r4.getContext()
            java.lang.String r1 = "accessibility"
            java.lang.Object r1 = r0.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 != 0) goto L13
            return
        L13:
            android.view.accessibility.AccessibilityEvent r2 = new android.view.accessibility.AccessibilityEvent
            r2.<init>()
            r3 = 64
            r2.setEventType(r3)
            java.lang.Class<android.widget.Toast> r3 = android.widget.Toast.class
            java.lang.String r3 = r3.getName()
            r2.setClassName(r3)
            java.lang.String r0 = r0.getPackageName()
            r2.setPackageName(r0)
            r4.dispatchPopulateAccessibilityEvent(r2)
            r1.sendAccessibilityEvent(r2)
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void m367() {
            r3 = this;
            boolean r0 = r3.f602
            if (r0 != 0) goto L5
            return
        L5:
            xhss.ᛸᛶᲀᲁ r0 = r3.f603
            android.os.Handler r1 = xhss.C0137.f596
            r1.removeCallbacks(r0)
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            xhss.ᛸᛶᲀᲁ r3 = r3.f601
            if (r0 != r2) goto L1c
            r3.run()
            return
        L1c:
            r1.removeCallbacks(r3)
            r1.post(r3)
            return
    }
}
