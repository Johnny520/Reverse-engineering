package defpackage;

/* JADX INFO: renamed from: ᛷᲁᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1377 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static final android.os.Handler f6009 = null;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public boolean f6010;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public boolean f6011;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f6012;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C1200 f6013;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public defpackage.C1598 f6014;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final defpackage.RunnableC2163 f6015;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.RunnableC2163 f6016;

    static {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            defpackage.C1377.f6009 = r0
            return
    }

    public C1377(android.content.ContextWrapper r3, defpackage.C1200 r4) {
            r2 = this;
            r2.<init>()
            ᲇᲈᛷᛳ r0 = new ᲇᲈᛷᛳ
            r1 = 0
            r0.<init>(r2, r1)
            r2.f6015 = r0
            ᲇᲈᛷᛳ r0 = new ᲇᲈᛷᛳ
            r1 = 1
            r0.<init>(r2, r1)
            r2.f6016 = r0
            r2.f6013 = r4
            java.lang.String r3 = r3.getPackageName()
            r2.f6012 = r3
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static void m2544(android.view.View r4) {
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

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m2545() {
            r3 = this;
            boolean r0 = r3.f6011
            if (r0 != 0) goto L5
            return
        L5:
            ᲇᲈᛷᛳ r0 = r3.f6015
            android.os.Handler r1 = defpackage.C1377.f6009
            r1.removeCallbacks(r0)
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            ᲇᲈᛷᛳ r3 = r3.f6016
            if (r0 != r2) goto L1c
            r3.run()
            return
        L1c:
            r1.removeCallbacks(r3)
            r1.post(r3)
            return
    }
}
