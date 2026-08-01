package defpackage;

/* JADX INFO: renamed from: ᛴᲈᛶᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0798 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static java.lang.Integer f3693;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public defpackage.ViewTreeObserverOnPreDrawListenerC2343 f3694;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final android.widget.ImageView f3695;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.util.ArrayList f3696;

    public C0798(android.widget.ImageView r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f3696 = r0
            r1.f3695 = r2
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final int m1743(int r2, int r3, int r4) {
            r1 = this;
            int r0 = r3 - r4
            if (r0 <= 0) goto L5
            return r0
        L5:
            int r2 = r2 - r4
            if (r2 <= 0) goto L9
            return r2
        L9:
            android.widget.ImageView r1 = r1.f3695
            boolean r2 = r1.isLayoutRequested()
            if (r2 != 0) goto L56
            r2 = -2
            if (r3 != r2) goto L56
            r2 = 4
            java.lang.String r3 = "ViewTarget"
            boolean r2 = android.util.Log.isLoggable(r3, r2)
            if (r2 == 0) goto L22
            java.lang.String r2 = "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions."
            android.util.Log.i(r3, r2)
        L22:
            android.content.Context r1 = r1.getContext()
            java.lang.Integer r2 = defpackage.C0798.f3693
            if (r2 != 0) goto L51
            java.lang.String r2 = "window"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            java.lang.String r2 = "Argument must not be null"
            defpackage.C0292.m944(r1, r2)
            android.view.Display r1 = r1.getDefaultDisplay()
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>()
            r1.getSize(r2)
            int r1 = r2.x
            int r2 = r2.y
            int r1 = java.lang.Math.max(r1, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            defpackage.C0798.f3693 = r2
        L51:
            int r1 = r2.intValue()
            return r1
        L56:
            r1 = 0
            return r1
    }
}
