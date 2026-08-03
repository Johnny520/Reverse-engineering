package a;

/* JADX INFO: loaded from: classes.dex */
public final class M0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.widget.CompoundButton f168a;
    public android.content.res.ColorStateList b;
    public android.graphics.PorterDuff.Mode c;
    public boolean d;
    public boolean e;
    public boolean f;

    public M0(android.widget.CompoundButton r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.b = r0
            r1.c = r0
            r0 = 0
            r1.d = r0
            r1.e = r0
            r1.f168a = r2
            return
    }

    public final void a() {
            r3 = this;
            android.widget.CompoundButton r0 = r3.f168a
            android.graphics.drawable.Drawable r1 = a.G3.a(r0)
            if (r1 == 0) goto L36
            boolean r2 = r3.d
            if (r2 != 0) goto L10
            boolean r2 = r3.e
            if (r2 == 0) goto L36
        L10:
            android.graphics.drawable.Drawable r1 = r1.mutate()
            boolean r2 = r3.d
            if (r2 == 0) goto L1d
            android.content.res.ColorStateList r2 = r3.b
            a.C0439w5.a.h(r1, r2)
        L1d:
            boolean r2 = r3.e
            if (r2 == 0) goto L26
            android.graphics.PorterDuff$Mode r2 = r3.c
            a.C0439w5.a.i(r1, r2)
        L26:
            boolean r2 = r1.isStateful()
            if (r2 == 0) goto L33
            int[] r2 = r0.getDrawableState()
            r1.setState(r2)
        L33:
            r0.setButtonDrawable(r1)
        L36:
            return
    }

    public final void b(android.util.AttributeSet r9, int r10) {
            r8 = this;
            android.widget.CompoundButton r0 = r8.f168a
            android.content.Context r1 = r0.getContext()
            int[] r2 = androidx.appcompat.R.styleable.CompoundButton
            a.of r6 = a.C0306of.e(r1, r9, r2, r10)
            android.content.res.TypedArray r7 = r6.b
            android.content.Context r1 = r0.getContext()
            int[] r2 = androidx.appcompat.R.styleable.CompoundButton
            android.content.res.TypedArray r4 = r6.b
            r3 = r9
            r5 = r10
            a.C0414ug.i(r0, r1, r2, r3, r4, r5)
            int r9 = androidx.appcompat.R.styleable.CompoundButton_buttonCompat     // Catch: java.lang.Throwable -> L38
            boolean r9 = r7.hasValue(r9)     // Catch: java.lang.Throwable -> L38
            r10 = 0
            if (r9 == 0) goto L3b
            int r9 = androidx.appcompat.R.styleable.CompoundButton_buttonCompat     // Catch: java.lang.Throwable -> L38
            int r9 = r7.getResourceId(r9, r10)     // Catch: java.lang.Throwable -> L38
            if (r9 == 0) goto L3b
            android.content.Context r1 = r0.getContext()     // Catch: java.lang.Throwable -> L38 android.content.res.Resources.NotFoundException -> L3b
            android.graphics.drawable.Drawable r9 = a.C0435w1.A(r1, r9)     // Catch: java.lang.Throwable -> L38 android.content.res.Resources.NotFoundException -> L3b
            r0.setButtonDrawable(r9)     // Catch: java.lang.Throwable -> L38 android.content.res.Resources.NotFoundException -> L3b
            goto L56
        L38:
            r0 = move-exception
            r9 = r0
            goto L82
        L3b:
            int r9 = androidx.appcompat.R.styleable.CompoundButton_android_button     // Catch: java.lang.Throwable -> L38
            boolean r9 = r7.hasValue(r9)     // Catch: java.lang.Throwable -> L38
            if (r9 == 0) goto L56
            int r9 = androidx.appcompat.R.styleable.CompoundButton_android_button     // Catch: java.lang.Throwable -> L38
            int r9 = r7.getResourceId(r9, r10)     // Catch: java.lang.Throwable -> L38
            if (r9 == 0) goto L56
            android.content.Context r10 = r0.getContext()     // Catch: java.lang.Throwable -> L38
            android.graphics.drawable.Drawable r9 = a.C0435w1.A(r10, r9)     // Catch: java.lang.Throwable -> L38
            r0.setButtonDrawable(r9)     // Catch: java.lang.Throwable -> L38
        L56:
            int r9 = androidx.appcompat.R.styleable.CompoundButton_buttonTint     // Catch: java.lang.Throwable -> L38
            boolean r9 = r7.hasValue(r9)     // Catch: java.lang.Throwable -> L38
            if (r9 == 0) goto L67
            int r9 = androidx.appcompat.R.styleable.CompoundButton_buttonTint     // Catch: java.lang.Throwable -> L38
            android.content.res.ColorStateList r9 = r6.a(r9)     // Catch: java.lang.Throwable -> L38
            a.F3.c(r0, r9)     // Catch: java.lang.Throwable -> L38
        L67:
            int r9 = androidx.appcompat.R.styleable.CompoundButton_buttonTintMode     // Catch: java.lang.Throwable -> L38
            boolean r9 = r7.hasValue(r9)     // Catch: java.lang.Throwable -> L38
            if (r9 == 0) goto L7e
            int r9 = androidx.appcompat.R.styleable.CompoundButton_buttonTintMode     // Catch: java.lang.Throwable -> L38
            r10 = -1
            int r9 = r7.getInt(r9, r10)     // Catch: java.lang.Throwable -> L38
            r10 = 0
            android.graphics.PorterDuff$Mode r9 = a.C0457x5.c(r9, r10)     // Catch: java.lang.Throwable -> L38
            a.F3.d(r0, r9)     // Catch: java.lang.Throwable -> L38
        L7e:
            r6.f()
            return
        L82:
            r6.f()
            throw r9
    }
}
