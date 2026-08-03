package a;

/* JADX INFO: renamed from: a.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0095d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.widget.ImageView f430a;
    public a.C0270mf b;
    public int c;

    public C0095d1(android.widget.ImageView r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.c = r0
            r1.f430a = r2
            return
    }

    public final void a() {
            r3 = this;
            android.widget.ImageView r0 = r3.f430a
            android.graphics.drawable.Drawable r1 = r0.getDrawable()
            if (r1 == 0) goto Lb
            a.C0457x5.a(r1)
        Lb:
            if (r1 == 0) goto L18
            a.mf r2 = r3.b
            if (r2 == 0) goto L18
            int[] r0 = r0.getDrawableState()
            a.Y0.e(r1, r2, r0)
        L18:
            return
    }

    public final void b(android.util.AttributeSet r8, int r9) {
            r7 = this;
            android.widget.ImageView r0 = r7.f430a
            android.content.Context r1 = r0.getContext()
            int[] r2 = androidx.appcompat.R.styleable.AppCompatImageView
            a.of r6 = a.C0306of.e(r1, r8, r2, r9)
            android.content.Context r1 = r0.getContext()
            int[] r2 = androidx.appcompat.R.styleable.AppCompatImageView
            android.content.res.TypedArray r4 = r6.b
            r3 = r8
            r5 = r9
            a.C0414ug.i(r0, r1, r2, r3, r4, r5)
            android.graphics.drawable.Drawable r8 = r0.getDrawable()     // Catch: java.lang.Throwable -> L38
            r9 = -1
            android.content.res.TypedArray r1 = r6.b
            if (r8 != 0) goto L3b
            int r2 = androidx.appcompat.R.styleable.AppCompatImageView_srcCompat     // Catch: java.lang.Throwable -> L38
            int r2 = r1.getResourceId(r2, r9)     // Catch: java.lang.Throwable -> L38
            if (r2 == r9) goto L3b
            android.content.Context r8 = r0.getContext()     // Catch: java.lang.Throwable -> L38
            android.graphics.drawable.Drawable r8 = a.C0435w1.A(r8, r2)     // Catch: java.lang.Throwable -> L38
            if (r8 == 0) goto L3b
            r0.setImageDrawable(r8)     // Catch: java.lang.Throwable -> L38
            goto L3b
        L38:
            r0 = move-exception
            r8 = r0
            goto L6b
        L3b:
            if (r8 == 0) goto L40
            a.C0457x5.a(r8)     // Catch: java.lang.Throwable -> L38
        L40:
            int r8 = androidx.appcompat.R.styleable.AppCompatImageView_tint     // Catch: java.lang.Throwable -> L38
            boolean r8 = r1.hasValue(r8)     // Catch: java.lang.Throwable -> L38
            if (r8 == 0) goto L51
            int r8 = androidx.appcompat.R.styleable.AppCompatImageView_tint     // Catch: java.lang.Throwable -> L38
            android.content.res.ColorStateList r8 = r6.a(r8)     // Catch: java.lang.Throwable -> L38
            a.S8.c(r0, r8)     // Catch: java.lang.Throwable -> L38
        L51:
            int r8 = androidx.appcompat.R.styleable.AppCompatImageView_tintMode     // Catch: java.lang.Throwable -> L38
            boolean r8 = r1.hasValue(r8)     // Catch: java.lang.Throwable -> L38
            if (r8 == 0) goto L67
            int r8 = androidx.appcompat.R.styleable.AppCompatImageView_tintMode     // Catch: java.lang.Throwable -> L38
            int r8 = r1.getInt(r8, r9)     // Catch: java.lang.Throwable -> L38
            r9 = 0
            android.graphics.PorterDuff$Mode r8 = a.C0457x5.c(r8, r9)     // Catch: java.lang.Throwable -> L38
            a.S8.d(r0, r8)     // Catch: java.lang.Throwable -> L38
        L67:
            r6.f()
            return
        L6b:
            r6.f()
            throw r8
    }
}
