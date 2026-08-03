package a;

/* JADX INFO: renamed from: a.of, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0306of {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f628a;
    public final android.content.res.TypedArray b;
    public android.util.TypedValue c;

    public C0306of(android.content.Context r1, android.content.res.TypedArray r2) {
            r0 = this;
            r0.<init>()
            r0.f628a = r1
            r0.b = r2
            return
    }

    public static a.C0306of e(android.content.Context r2, android.util.AttributeSet r3, int[] r4, int r5) {
            a.of r0 = new a.of
            r1 = 0
            android.content.res.TypedArray r3 = r2.obtainStyledAttributes(r3, r4, r5, r1)
            r0.<init>(r2, r3)
            return r0
    }

    public final android.content.res.ColorStateList a(int r4) {
            r3 = this;
            android.content.res.TypedArray r0 = r3.b
            boolean r1 = r0.hasValue(r4)
            if (r1 == 0) goto L18
            r1 = 0
            int r1 = r0.getResourceId(r4, r1)
            if (r1 == 0) goto L18
            android.content.Context r2 = r3.f628a
            android.content.res.ColorStateList r1 = a.Y3.a(r2, r1)
            if (r1 == 0) goto L18
            return r1
        L18:
            android.content.res.ColorStateList r4 = r0.getColorStateList(r4)
            return r4
    }

    public final android.graphics.drawable.Drawable b(int r3) {
            r2 = this;
            android.content.res.TypedArray r0 = r2.b
            boolean r1 = r0.hasValue(r3)
            if (r1 == 0) goto L16
            r1 = 0
            int r1 = r0.getResourceId(r3, r1)
            if (r1 == 0) goto L16
            android.content.Context r3 = r2.f628a
            android.graphics.drawable.Drawable r3 = a.C0435w1.A(r3, r1)
            return r3
        L16:
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r3)
            return r3
    }

    public final android.graphics.drawable.Drawable c(int r5) {
            r4 = this;
            android.content.res.TypedArray r0 = r4.b
            boolean r0 = r0.hasValue(r5)
            if (r0 == 0) goto L24
            android.content.res.TypedArray r0 = r4.b
            r1 = 0
            int r5 = r0.getResourceId(r5, r1)
            if (r5 == 0) goto L24
            a.Y0 r0 = a.Y0.a()
            android.content.Context r1 = r4.f628a
            monitor-enter(r0)
            a.pd r2 = r0.f347a     // Catch: java.lang.Throwable -> L21
            r3 = 1
            android.graphics.drawable.Drawable r5 = r2.d(r1, r5, r3)     // Catch: java.lang.Throwable -> L21
            monitor-exit(r0)
            return r5
        L21:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r5
        L24:
            r5 = 0
            return r5
    }

    public final android.graphics.Typeface d(int r10, int r11, a.C0310p1.a r12) {
            r9 = this;
            android.content.res.TypedArray r0 = r9.b
            r1 = 0
            int r3 = r0.getResourceId(r10, r1)
            if (r3 != 0) goto La
            goto L21
        La:
            android.util.TypedValue r10 = r9.c
            if (r10 != 0) goto L15
            android.util.TypedValue r10 = new android.util.TypedValue
            r10.<init>()
            r9.c = r10
        L15:
            android.util.TypedValue r4 = r9.c
            java.lang.ThreadLocal<android.util.TypedValue> r10 = a.C0340qd.f657a
            android.content.Context r2 = r9.f628a
            boolean r10 = r2.isRestricted()
            if (r10 == 0) goto L23
        L21:
            r10 = 0
            return r10
        L23:
            r8 = 0
            r7 = 1
            r5 = r11
            r6 = r12
            android.graphics.Typeface r10 = a.C0340qd.b(r2, r3, r4, r5, r6, r7, r8)
            return r10
    }

    public final void f() {
            r1 = this;
            android.content.res.TypedArray r0 = r1.b
            r0.recycle()
            return
    }
}
