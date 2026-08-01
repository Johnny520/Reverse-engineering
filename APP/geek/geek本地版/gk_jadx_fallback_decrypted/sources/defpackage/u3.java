package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u3 {
    public static final android.graphics.PorterDuff.Mode b = null;
    public static defpackage.u3 c;
    public defpackage.w00 a;

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            defpackage.u3.b = r0
            return
    }

    public static synchronized defpackage.u3 a() {
            java.lang.Class<u3> r0 = defpackage.u3.class
            monitor-enter(r0)
            u3 r1 = defpackage.u3.c     // Catch: java.lang.Throwable -> Lb
            if (r1 != 0) goto Ld
            d()     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r1 = move-exception
            goto L11
        Ld:
            u3 r1 = defpackage.u3.c     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return r1
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    public static synchronized android.graphics.PorterDuffColorFilter c(int r1, android.graphics.PorterDuff.Mode r2) {
            java.lang.Class<u3> r0 = defpackage.u3.class
            monitor-enter(r0)
            android.graphics.PorterDuffColorFilter r1 = defpackage.w00.e(r1, r2)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)
            return r1
        L9:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    public static synchronized void d() {
            java.lang.Class<u3> r0 = defpackage.u3.class
            monitor-enter(r0)
            u3 r1 = defpackage.u3.c     // Catch: java.lang.Throwable -> L25
            if (r1 != 0) goto L27
            u3 r1 = new u3     // Catch: java.lang.Throwable -> L25
            r1.<init>()     // Catch: java.lang.Throwable -> L25
            defpackage.u3.c = r1     // Catch: java.lang.Throwable -> L25
            w00 r2 = defpackage.w00.b()     // Catch: java.lang.Throwable -> L25
            r1.a = r2     // Catch: java.lang.Throwable -> L25
            u3 r1 = defpackage.u3.c     // Catch: java.lang.Throwable -> L25
            w00 r1 = r1.a     // Catch: java.lang.Throwable -> L25
            t3 r2 = new t3     // Catch: java.lang.Throwable -> L25
            r2.<init>()     // Catch: java.lang.Throwable -> L25
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L25
            r1.e = r2     // Catch: java.lang.Throwable -> L22
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L25
            goto L27
        L22:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L22
            throw r2     // Catch: java.lang.Throwable -> L25
        L25:
            r1 = move-exception
            goto L29
        L27:
            monitor-exit(r0)
            return
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            throw r1
    }

    public static void e(android.graphics.drawable.Drawable r4, defpackage.y60 r5, int[] r6) {
            android.graphics.PorterDuff$Mode r0 = defpackage.w00.f
            int[] r0 = r4.getState()
            int[] r1 = defpackage.eh.a
            android.graphics.drawable.Drawable r1 = r4.mutate()
            if (r1 != r4) goto L4f
            boolean r1 = r4 instanceof android.graphics.drawable.LayerDrawable
            r2 = 0
            if (r1 == 0) goto L21
            boolean r1 = r4.isStateful()
            if (r1 == 0) goto L21
            int[] r1 = new int[r2]
            r4.setState(r1)
            r4.setState(r0)
        L21:
            boolean r0 = r5.d
            if (r0 != 0) goto L2e
            boolean r1 = r5.c
            if (r1 == 0) goto L2a
            goto L2e
        L2a:
            r4.clearColorFilter()
            return
        L2e:
            r1 = 0
            if (r0 == 0) goto L34
            android.content.res.ColorStateList r0 = r5.a
            goto L35
        L34:
            r0 = r1
        L35:
            boolean r3 = r5.c
            if (r3 == 0) goto L3c
            android.graphics.PorterDuff$Mode r5 = r5.b
            goto L3e
        L3c:
            android.graphics.PorterDuff$Mode r5 = defpackage.w00.f
        L3e:
            if (r0 == 0) goto L4b
            if (r5 != 0) goto L43
            goto L4b
        L43:
            int r6 = r0.getColorForState(r6, r2)
            android.graphics.PorterDuffColorFilter r1 = defpackage.w00.e(r6, r5)
        L4b:
            r4.setColorFilter(r1)
            return
        L4f:
            java.lang.String r4 = "ResourceManagerInternal"
            java.lang.String r5 = "Mutated drawable is not the same instance as the input."
            android.util.Log.d(r4, r5)
            return
    }

    public final synchronized android.graphics.drawable.Drawable b(android.content.Context r2, int r3) {
            r1 = this;
            monitor-enter(r1)
            w00 r0 = r1.a     // Catch: java.lang.Throwable -> L9
            android.graphics.drawable.Drawable r2 = r0.c(r2, r3)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r2
    }
}
