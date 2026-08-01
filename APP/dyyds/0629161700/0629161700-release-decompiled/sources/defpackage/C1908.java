package defpackage;

/* JADX INFO: renamed from: ᲁᲀᛳᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C1908 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public defpackage.InterfaceC1469 f8271;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final defpackage.C2009 f8272;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public defpackage.AbstractC1173 f8273;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public android.view.View f8274;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final int f8275;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final boolean f8276;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final android.content.Context f8277;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public android.widget.PopupWindow.OnDismissListener f8278;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.MenuC1701 f8279;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public int f8280;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public boolean f8281;

    public C1908(android.content.Context r1, defpackage.MenuC1701 r2, android.view.View r3, boolean r4, int r5, int r6) {
            r0 = this;
            r0.<init>()
            r6 = 8388611(0x800003, float:1.1754948E-38)
            r0.f8280 = r6
            ᲇᛲᲇᲀ r6 = new ᲇᛲᲇᲀ
            r6.<init>(r0)
            r0.f8272 = r6
            r0.f8277 = r1
            r0.f8279 = r2
            r0.f8274 = r3
            r0.f8276 = r4
            r0.f8275 = r5
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final void m3337(int r3, int r4, boolean r5, boolean r6) {
            r2 = this;
            ᛶᲇᲀᛵ r0 = r2.m3338()
            r0.mo2281(r6)
            if (r5 == 0) goto L49
            int r5 = r2.f8280
            android.view.View r6 = r2.f8274
            java.util.WeakHashMap r1 = defpackage.AbstractC0858.f3911
            int r6 = r6.getLayoutDirection()
            int r5 = android.view.Gravity.getAbsoluteGravity(r5, r6)
            r5 = r5 & 7
            r6 = 5
            if (r5 != r6) goto L23
            android.view.View r5 = r2.f8274
            int r5 = r5.getWidth()
            int r3 = r3 - r5
        L23:
            r0.mo2282(r3)
            r0.mo2277(r4)
            android.content.Context r2 = r2.f8277
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r5 = 1111490560(0x42400000, float:48.0)
            float r2 = r2 * r5
            r5 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r5
            int r2 = (int) r2
            android.graphics.Rect r5 = new android.graphics.Rect
            int r6 = r3 - r2
            int r1 = r4 - r2
            int r3 = r3 + r2
            int r4 = r4 + r2
            r5.<init>(r6, r1, r3, r4)
            r0.f5294 = r5
        L49:
            r0.show()
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public void mo1135() {
            r1 = this;
            r0 = 0
            r1.f8273 = r0
            android.widget.PopupWindow$OnDismissListener r1 = r1.f8278
            if (r1 == 0) goto La
            r1.onDismiss()
        La:
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.AbstractC1173 m3338() {
            r8 = this;
            ᛶᲇᲀᛵ r0 = r8.f8273
            if (r0 != 0) goto L6b
            java.lang.String r0 = "window"
            android.content.Context r1 = r8.f8277
            java.lang.Object r0 = r1.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>()
            defpackage.AbstractC0482.m1262(r0, r2)
            int r0 = r2.x
            int r2 = r2.y
            int r0 = java.lang.Math.min(r0, r2)
            android.content.res.Resources r1 = r1.getResources()
            r2 = 1711734806(0x66070016, float:1.5938027E23)
            int r1 = r1.getDimensionPixelSize(r2)
            android.content.Context r3 = r8.f8277
            if (r0 < r1) goto L3d
            ᛸᛱᛷᛸ r0 = new ᛸᛱᛷᛸ
            android.view.View r1 = r8.f8274
            int r2 = r8.f8275
            boolean r4 = r8.f8276
            r0.<init>(r3, r1, r2, r4)
            goto L4b
        L3d:
            ᲇᲇᲇᲇ r2 = new ᲇᲇᲇᲇ
            android.view.View r5 = r8.f8274
            int r6 = r8.f8275
            boolean r7 = r8.f8276
            ᲀᛷᛱᲇ r4 = r8.f8279
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = r2
        L4b:
            ᲀᛷᛱᲇ r1 = r8.f8279
            r0.mo2275(r1)
            ᲇᛲᲇᲀ r1 = r8.f8272
            r0.mo2280(r1)
            android.view.View r1 = r8.f8274
            r0.mo2278(r1)
            ᛸᛴᛲᛶ r1 = r8.f8271
            r0.mo851(r1)
            boolean r1 = r8.f8281
            r0.mo2279(r1)
            int r1 = r8.f8280
            r0.mo2276(r1)
            r8.f8273 = r0
        L6b:
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final boolean m3339() {
            r0 = this;
            ᛶᲇᲀᛵ r0 = r0.f8273
            if (r0 == 0) goto Lc
            boolean r0 = r0.mo2605()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }
}
