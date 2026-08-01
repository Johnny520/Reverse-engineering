package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v2 {
    public final android.view.View a;
    public final defpackage.u3 b;
    public int c;
    public defpackage.y60 d;
    public defpackage.y60 e;
    public defpackage.y60 f;

    public v2(android.view.View r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.c = r0
            r1.a = r2
            u3 r2 = defpackage.u3.a()
            r1.b = r2
            return
    }

    public final void a() {
            r5 = this;
            android.view.View r0 = r5.a
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            if (r1 == 0) goto L61
            y60 r2 = r5.d
            if (r2 == 0) goto L4a
            y60 r2 = r5.f
            if (r2 != 0) goto L17
            y60 r2 = new y60
            r2.<init>()
            r5.f = r2
        L17:
            y60 r2 = r5.f
            r3 = 0
            r2.a = r3
            r4 = 0
            r2.d = r4
            r2.b = r3
            r2.c = r4
            java.util.WeakHashMap r3 = defpackage.ja0.a
            android.content.res.ColorStateList r3 = defpackage.y90.g(r0)
            r4 = 1
            if (r3 == 0) goto L30
            r2.d = r4
            r2.a = r3
        L30:
            android.graphics.PorterDuff$Mode r3 = defpackage.y90.h(r0)
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
            defpackage.u3.e(r1, r2, r0)
            return
        L4a:
            y60 r2 = r5.e
            if (r2 == 0) goto L56
            int[] r0 = r0.getDrawableState()
            defpackage.u3.e(r1, r2, r0)
            return
        L56:
            y60 r2 = r5.d
            if (r2 == 0) goto L61
            int[] r0 = r0.getDrawableState()
            defpackage.u3.e(r1, r2, r0)
        L61:
            return
    }

    public final android.content.res.ColorStateList b() {
            r1 = this;
            y60 r0 = r1.e
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.a
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final android.graphics.PorterDuff.Mode c() {
            r1 = this;
            y60 r0 = r1.e
            if (r0 == 0) goto L7
            android.graphics.PorterDuff$Mode r0 = r0.b
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final void d(android.util.AttributeSet r10, int r11) {
            r9 = this;
            android.view.View r0 = r9.a
            android.content.Context r1 = r0.getContext()
            int[] r4 = defpackage.xy.z
            r5 r1 = defpackage.r5.y(r1, r10, r4, r11)
            java.lang.Object r2 = r1.b
            r8 = r2
            android.content.res.TypedArray r8 = (android.content.res.TypedArray) r8
            android.view.View r2 = r9.a
            android.content.Context r3 = r2.getContext()
            java.lang.Object r5 = r1.b
            r6 = r5
            android.content.res.TypedArray r6 = (android.content.res.TypedArray) r6
            r5 = r10
            r7 = r11
            defpackage.ja0.k(r2, r3, r4, r5, r6, r7)
            r10 = 0
            boolean r11 = r8.hasValue(r10)     // Catch: java.lang.Throwable -> L45
            r2 = -1
            if (r11 == 0) goto L4c
            int r10 = r8.getResourceId(r10, r2)     // Catch: java.lang.Throwable -> L45
            r9.c = r10     // Catch: java.lang.Throwable -> L45
            u3 r10 = r9.b     // Catch: java.lang.Throwable -> L45
            android.content.Context r11 = r0.getContext()     // Catch: java.lang.Throwable -> L45
            int r3 = r9.c     // Catch: java.lang.Throwable -> L45
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L45
            w00 r4 = r10.a     // Catch: java.lang.Throwable -> L48
            android.content.res.ColorStateList r11 = r4.f(r11, r3)     // Catch: java.lang.Throwable -> L48
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L45
            if (r11 == 0) goto L4c
            r9.g(r11)     // Catch: java.lang.Throwable -> L45
            goto L4c
        L45:
            r0 = move-exception
            r10 = r0
            goto L71
        L48:
            r0 = move-exception
            r11 = r0
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L48
            throw r11     // Catch: java.lang.Throwable -> L45
        L4c:
            r10 = 1
            boolean r11 = r8.hasValue(r10)     // Catch: java.lang.Throwable -> L45
            if (r11 == 0) goto L5a
            android.content.res.ColorStateList r10 = r1.l(r10)     // Catch: java.lang.Throwable -> L45
            defpackage.y90.q(r0, r10)     // Catch: java.lang.Throwable -> L45
        L5a:
            r10 = 2
            boolean r11 = r8.hasValue(r10)     // Catch: java.lang.Throwable -> L45
            if (r11 == 0) goto L6d
            int r10 = r8.getInt(r10, r2)     // Catch: java.lang.Throwable -> L45
            r11 = 0
            android.graphics.PorterDuff$Mode r10 = defpackage.eh.b(r10, r11)     // Catch: java.lang.Throwable -> L45
            defpackage.y90.r(r0, r10)     // Catch: java.lang.Throwable -> L45
        L6d:
            r1.z()
            return
        L71:
            r1.z()
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
            u3 r0 = r3.b
            if (r0 == 0) goto L18
            android.view.View r1 = r3.a
            android.content.Context r1 = r1.getContext()
            monitor-enter(r0)
            w00 r2 = r0.a     // Catch: java.lang.Throwable -> L15
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
            y60 r0 = r1.d
            if (r0 != 0) goto Ld
            y60 r0 = new y60
            r0.<init>()
            r1.d = r0
        Ld:
            y60 r0 = r1.d
            r0.a = r2
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
            y60 r0 = r1.e
            if (r0 != 0) goto Lb
            y60 r0 = new y60
            r0.<init>()
            r1.e = r0
        Lb:
            y60 r0 = r1.e
            r0.a = r2
            r2 = 1
            r0.d = r2
            r1.a()
            return
    }

    public final void i(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            y60 r0 = r1.e
            if (r0 != 0) goto Lb
            y60 r0 = new y60
            r0.<init>()
            r1.e = r0
        Lb:
            y60 r0 = r1.e
            r0.b = r2
            r2 = 1
            r0.c = r2
            r1.a()
            return
    }
}
