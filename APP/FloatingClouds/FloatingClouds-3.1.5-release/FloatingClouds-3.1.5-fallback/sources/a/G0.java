package a;

/* JADX INFO: loaded from: classes.dex */
public final class G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.view.View f93a;
    public final a.Y0 b;
    public int c;
    public a.C0270mf d;
    public a.C0270mf e;
    public a.C0270mf f;

    public G0(android.view.View r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.c = r0
            r1.f93a = r2
            a.Y0 r2 = a.Y0.a()
            r1.b = r2
            return
    }

    public final void a() {
            r5 = this;
            android.view.View r0 = r5.f93a
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            if (r1 == 0) goto L61
            a.mf r2 = r5.d
            if (r2 == 0) goto L4a
            a.mf r2 = r5.f
            if (r2 != 0) goto L17
            a.mf r2 = new a.mf
            r2.<init>()
            r5.f = r2
        L17:
            a.mf r2 = r5.f
            r3 = 0
            r2.f580a = r3
            r4 = 0
            r2.d = r4
            r2.b = r3
            r2.c = r4
            java.util.WeakHashMap<android.view.View, a.Jg> r3 = a.C0414ug.f721a
            android.content.res.ColorStateList r3 = a.C0414ug.d.g(r0)
            r4 = 1
            if (r3 == 0) goto L30
            r2.d = r4
            r2.f580a = r3
        L30:
            android.graphics.PorterDuff$Mode r3 = a.C0414ug.d.h(r0)
            if (r3 == 0) goto L3a
            r2.c = r4
            r2.b = r3
        L3a:
            boolean r3 = r2.d
            if (r3 != 0) goto L42
            boolean r3 = r2.c
            if (r3 == 0) goto L4a
        L42:
            int[] r0 = r0.getDrawableState()
            a.Y0.e(r1, r2, r0)
            return
        L4a:
            a.mf r2 = r5.e
            if (r2 == 0) goto L56
            int[] r0 = r0.getDrawableState()
            a.Y0.e(r1, r2, r0)
            return
        L56:
            a.mf r2 = r5.d
            if (r2 == 0) goto L61
            int[] r0 = r0.getDrawableState()
            a.Y0.e(r1, r2, r0)
        L61:
            return
    }

    public final android.content.res.ColorStateList b() {
            r1 = this;
            a.mf r0 = r1.e
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.f580a
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final android.graphics.PorterDuff.Mode c() {
            r1 = this;
            a.mf r0 = r1.e
            if (r0 == 0) goto L7
            android.graphics.PorterDuff$Mode r0 = r0.b
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final void d(android.util.AttributeSet r10, int r11) {
            r9 = this;
            android.view.View r0 = r9.f93a
            android.content.Context r1 = r0.getContext()
            int[] r2 = androidx.appcompat.R.styleable.ViewBackgroundHelper
            a.of r1 = a.C0306of.e(r1, r10, r2, r11)
            android.content.res.TypedArray r2 = r1.b
            android.view.View r3 = r9.f93a
            android.content.Context r4 = r3.getContext()
            int[] r5 = androidx.appcompat.R.styleable.ViewBackgroundHelper
            android.content.res.TypedArray r7 = r1.b
            r6 = r10
            r8 = r11
            a.C0414ug.i(r3, r4, r5, r6, r7, r8)
            int r10 = androidx.appcompat.R.styleable.ViewBackgroundHelper_android_background     // Catch: java.lang.Throwable -> L44
            boolean r10 = r2.hasValue(r10)     // Catch: java.lang.Throwable -> L44
            r11 = -1
            if (r10 == 0) goto L4b
            int r10 = androidx.appcompat.R.styleable.ViewBackgroundHelper_android_background     // Catch: java.lang.Throwable -> L44
            int r10 = r2.getResourceId(r10, r11)     // Catch: java.lang.Throwable -> L44
            r9.c = r10     // Catch: java.lang.Throwable -> L44
            a.Y0 r10 = r9.b     // Catch: java.lang.Throwable -> L44
            android.content.Context r3 = r0.getContext()     // Catch: java.lang.Throwable -> L44
            int r4 = r9.c     // Catch: java.lang.Throwable -> L44
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L44
            a.pd r5 = r10.f347a     // Catch: java.lang.Throwable -> L47
            android.content.res.ColorStateList r3 = r5.f(r3, r4)     // Catch: java.lang.Throwable -> L47
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L4b
            r9.g(r3)     // Catch: java.lang.Throwable -> L44
            goto L4b
        L44:
            r0 = move-exception
            r10 = r0
            goto L76
        L47:
            r0 = move-exception
            r11 = r0
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L47
            throw r11     // Catch: java.lang.Throwable -> L44
        L4b:
            int r10 = androidx.appcompat.R.styleable.ViewBackgroundHelper_backgroundTint     // Catch: java.lang.Throwable -> L44
            boolean r10 = r2.hasValue(r10)     // Catch: java.lang.Throwable -> L44
            if (r10 == 0) goto L5c
            int r10 = androidx.appcompat.R.styleable.ViewBackgroundHelper_backgroundTint     // Catch: java.lang.Throwable -> L44
            android.content.res.ColorStateList r10 = r1.a(r10)     // Catch: java.lang.Throwable -> L44
            a.C0414ug.d.q(r0, r10)     // Catch: java.lang.Throwable -> L44
        L5c:
            int r10 = androidx.appcompat.R.styleable.ViewBackgroundHelper_backgroundTintMode     // Catch: java.lang.Throwable -> L44
            boolean r10 = r2.hasValue(r10)     // Catch: java.lang.Throwable -> L44
            if (r10 == 0) goto L72
            int r10 = androidx.appcompat.R.styleable.ViewBackgroundHelper_backgroundTintMode     // Catch: java.lang.Throwable -> L44
            int r10 = r2.getInt(r10, r11)     // Catch: java.lang.Throwable -> L44
            r11 = 0
            android.graphics.PorterDuff$Mode r10 = a.C0457x5.c(r10, r11)     // Catch: java.lang.Throwable -> L44
            a.C0414ug.d.r(r0, r10)     // Catch: java.lang.Throwable -> L44
        L72:
            r1.f()
            return
        L76:
            r1.f()
            throw r10
    }

    public final void e() {
            r1 = this;
            r0 = -1
            r1.c = r0
            r0 = 0
            r1.g(r0)
            r1.a()
            return
    }

    public final void f(int r4) {
            r3 = this;
            r3.c = r4
            a.Y0 r0 = r3.b
            if (r0 == 0) goto L18
            android.view.View r1 = r3.f93a
            android.content.Context r1 = r1.getContext()
            monitor-enter(r0)
            a.pd r2 = r0.f347a     // Catch: java.lang.Throwable -> L15
            android.content.res.ColorStateList r4 = r2.f(r1, r4)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)
            goto L19
        L15:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r4
        L18:
            r4 = 0
        L19:
            r3.g(r4)
            r3.a()
            return
    }

    public final void g(android.content.res.ColorStateList r2) {
            r1 = this;
            if (r2 == 0) goto L15
            a.mf r0 = r1.d
            if (r0 != 0) goto Ld
            a.mf r0 = new a.mf
            r0.<init>()
            r1.d = r0
        Ld:
            a.mf r0 = r1.d
            r0.f580a = r2
            r2 = 1
            r0.d = r2
            goto L18
        L15:
            r2 = 0
            r1.d = r2
        L18:
            r1.a()
            return
    }

    public final void h(android.content.res.ColorStateList r2) {
            r1 = this;
            a.mf r0 = r1.e
            if (r0 != 0) goto Lb
            a.mf r0 = new a.mf
            r0.<init>()
            r1.e = r0
        Lb:
            a.mf r0 = r1.e
            r0.f580a = r2
            r2 = 1
            r0.d = r2
            r1.a()
            return
    }

    public final void i(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            a.mf r0 = r1.e
            if (r0 != 0) goto Lb
            a.mf r0 = new a.mf
            r0.<init>()
            r1.e = r0
        Lb:
            a.mf r0 = r1.e
            r0.b = r2
            r2 = 1
            r0.c = r2
            r1.a()
            return
    }
}
