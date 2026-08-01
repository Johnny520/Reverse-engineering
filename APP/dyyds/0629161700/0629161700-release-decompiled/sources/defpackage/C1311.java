package defpackage;

/* JADX INFO: renamed from: ᛷᛷᛳᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1311 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public android.widget.Button f5782;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public android.widget.ImageView f5783;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public android.widget.TextView f5784;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public androidx.core.widget.NestedScrollView f5785;

    /* JADX INFO: renamed from: ᛲᲈᛷᛵ, reason: contains not printable characters */
    public final boolean f5786;

    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public final int f5787;

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public android.widget.ListAdapter f5788;

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public final int f5789;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public androidx.appcompat.app.AlertController$RecycleListView f5790;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public android.widget.TextView f5791;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public java.lang.CharSequence f5792;

    /* JADX INFO: renamed from: ᛷᛷᲀᛴ, reason: contains not printable characters */
    public final defpackage.HandlerC0471 f5793;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final android.view.Window f5794;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final android.content.Context f5795;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public android.graphics.drawable.Drawable f5796;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public android.view.View f5797;

    /* JADX INFO: renamed from: ᲀᲀᛴᛳ, reason: contains not printable characters */
    public final defpackage.ViewOnClickListenerC0310 f5798;

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public final int f5799;

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public final int f5800;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.DialogC1507 f5801;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public android.widget.Button f5802;

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public int f5803;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public android.widget.Button f5804;

    public C1311(android.content.Context r5, defpackage.DialogC1507 r6, android.view.Window r7) {
            r4 = this;
            r4.<init>()
            r0 = -1
            r4.f5803 = r0
            ᛲᛶᛷᛲ r0 = new ᛲᛶᛷᛲ
            r1 = 1
            r0.<init>(r1, r4)
            r4.f5798 = r0
            r4.f5795 = r5
            r4.f5801 = r6
            r4.f5794 = r7
            ᛳᛴᲈᲁ r7 = new ᛳᛴᲈᲁ
            r7.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r6)
            r7.f2352 = r0
            r4.f5793 = r7
            int[] r7 = defpackage.AbstractC1070.f4787
            r0 = 1711538216(0x66040028, float:1.5583881E23)
            r2 = 0
            r3 = 0
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r2, r7, r0, r3)
            int r7 = r5.getResourceId(r3, r3)
            r4.f5799 = r7
            r7 = 2
            r5.getResourceId(r7, r3)
            r7 = 4
            int r7 = r5.getResourceId(r7, r3)
            r4.f5800 = r7
            r7 = 5
            r5.getResourceId(r7, r3)
            r7 = 7
            int r7 = r5.getResourceId(r7, r3)
            r4.f5789 = r7
            r7 = 3
            int r7 = r5.getResourceId(r7, r3)
            r4.f5787 = r7
            r7 = 6
            boolean r7 = r5.getBoolean(r7, r1)
            r4.f5786 = r7
            r5.getDimensionPixelSize(r1, r3)
            r5.recycle()
            ᲈᲇᲀ r4 = r6.m2739()
            r4.mo2583(r1)
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static android.view.ViewGroup m2439(android.view.View r2, android.view.View r3) {
            if (r2 != 0) goto Lf
            boolean r2 = r3 instanceof android.view.ViewStub
            if (r2 == 0) goto Lc
            android.view.ViewStub r3 = (android.view.ViewStub) r3
            android.view.View r3 = r3.inflate()
        Lc:
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            return r3
        Lf:
            if (r3 == 0) goto L1e
            android.view.ViewParent r0 = r3.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L1e
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeView(r3)
        L1e:
            boolean r3 = r2 instanceof android.view.ViewStub
            if (r3 == 0) goto L28
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            android.view.View r2 = r2.inflate()
        L28:
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            return r2
    }
}
