package a;

/* JADX INFO: loaded from: classes.dex */
public final class C2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.graphics.Rect f40a;
    public final android.content.res.ColorStateList b;
    public final android.content.res.ColorStateList c;
    public final android.content.res.ColorStateList d;
    public final int e;
    public final a.Vd f;

    public C2(android.content.res.ColorStateList r2, android.content.res.ColorStateList r3, android.content.res.ColorStateList r4, int r5, a.Vd r6, android.graphics.Rect r7) {
            r1 = this;
            r1.<init>()
            int r0 = r7.left
            a.C0282n9.g(r0)
            int r0 = r7.top
            a.C0282n9.g(r0)
            int r0 = r7.right
            a.C0282n9.g(r0)
            int r0 = r7.bottom
            a.C0282n9.g(r0)
            r1.f40a = r7
            r1.b = r3
            r1.c = r2
            r1.d = r4
            r1.e = r5
            r1.f = r6
            return
    }

    public static a.C2 a(android.content.Context r12, int r13) {
            r0 = 0
            if (r13 == 0) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = r0
        L6:
            java.lang.String r2 = "Cannot create a CalendarItemStyle with a styleResId of 0"
            a.C0282n9.f(r2, r1)
            int[] r1 = com.google.android.material.R.styleable.MaterialCalendarItem
            android.content.res.TypedArray r13 = r12.obtainStyledAttributes(r13, r1)
            int r1 = com.google.android.material.R.styleable.MaterialCalendarItem_android_insetLeft
            int r1 = r13.getDimensionPixelOffset(r1, r0)
            int r2 = com.google.android.material.R.styleable.MaterialCalendarItem_android_insetTop
            int r2 = r13.getDimensionPixelOffset(r2, r0)
            int r3 = com.google.android.material.R.styleable.MaterialCalendarItem_android_insetRight
            int r3 = r13.getDimensionPixelOffset(r3, r0)
            int r4 = com.google.android.material.R.styleable.MaterialCalendarItem_android_insetBottom
            int r4 = r13.getDimensionPixelOffset(r4, r0)
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>(r1, r2, r3, r4)
            int r1 = com.google.android.material.R.styleable.MaterialCalendarItem_itemFillColor
            android.content.res.ColorStateList r6 = a.Sa.b(r12, r13, r1)
            int r1 = com.google.android.material.R.styleable.MaterialCalendarItem_itemTextColor
            android.content.res.ColorStateList r7 = a.Sa.b(r12, r13, r1)
            int r1 = com.google.android.material.R.styleable.MaterialCalendarItem_itemStrokeColor
            android.content.res.ColorStateList r8 = a.Sa.b(r12, r13, r1)
            int r1 = com.google.android.material.R.styleable.MaterialCalendarItem_itemStrokeWidth
            int r9 = r13.getDimensionPixelSize(r1, r0)
            int r1 = com.google.android.material.R.styleable.MaterialCalendarItem_itemShapeAppearance
            int r1 = r13.getResourceId(r1, r0)
            int r2 = com.google.android.material.R.styleable.MaterialCalendarItem_itemShapeAppearanceOverlay
            int r2 = r13.getResourceId(r2, r0)
            a.s r3 = new a.s
            float r0 = (float) r0
            r3.<init>(r0)
            a.Vd$a r12 = a.Vd.a(r12, r1, r2, r3)
            a.Vd r10 = r12.a()
            r13.recycle()
            a.C2 r5 = new a.C2
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r5
    }

    public final void b(android.widget.TextView r10) {
            r9 = this;
            a.Ta r0 = new a.Ta
            r0.<init>()
            a.Ta r1 = new a.Ta
            r1.<init>()
            a.Vd r2 = r9.f
            r0.setShapeAppearanceModel(r2)
            r1.setShapeAppearanceModel(r2)
            android.content.res.ColorStateList r2 = r9.c
            r0.k(r2)
            int r2 = r9.e
            float r2 = (float) r2
            a.Ta$b r3 = r0.f278a
            r3.j = r2
            r0.invalidateSelf()
            a.Ta$b r2 = r0.f278a
            android.content.res.ColorStateList r3 = r2.d
            android.content.res.ColorStateList r4 = r9.d
            if (r3 == r4) goto L32
            r2.d = r4
            int[] r2 = r0.getState()
            r0.onStateChange(r2)
        L32:
            android.content.res.ColorStateList r2 = r9.b
            r10.setTextColor(r2)
            android.graphics.drawable.RippleDrawable r4 = new android.graphics.drawable.RippleDrawable
            r3 = 30
            android.content.res.ColorStateList r2 = r2.withAlpha(r3)
            r4.<init>(r2, r0, r1)
            android.graphics.drawable.InsetDrawable r3 = new android.graphics.drawable.InsetDrawable
            android.graphics.Rect r0 = r9.f40a
            int r5 = r0.left
            int r6 = r0.top
            int r7 = r0.right
            int r8 = r0.bottom
            r3.<init>(r4, r5, r6, r7, r8)
            java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
            r10.setBackground(r3)
            return
    }
}
