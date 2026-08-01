package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a3 {
    public android.os.Parcelable a;
    public java.lang.Object b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final java.lang.Object f;

    public a3() {
            r1 = this;
            r1.<init>()
            o10 r0 = new o10
            r0.<init>()
            r1.f = r0
            r0 = 1
            r1.e = r0
            return
    }

    public /* synthetic */ a3(android.widget.TextView r2) {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.b = r0
            r0 = 0
            r1.c = r0
            r1.d = r0
            r1.f = r2
            r1.<init>()
            return
    }

    public void a() {
            r3 = this;
            java.lang.Object r0 = r3.f
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            android.graphics.drawable.Drawable r1 = defpackage.xb.a(r0)
            if (r1 == 0) goto L3c
            boolean r2 = r3.c
            if (r2 != 0) goto L12
            boolean r2 = r3.d
            if (r2 == 0) goto L3c
        L12:
            android.graphics.drawable.Drawable r1 = r1.mutate()
            boolean r2 = r3.c
            if (r2 == 0) goto L21
            android.os.Parcelable r2 = r3.a
            android.content.res.ColorStateList r2 = (android.content.res.ColorStateList) r2
            defpackage.ch.h(r1, r2)
        L21:
            boolean r2 = r3.d
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r3.b
            android.graphics.PorterDuff$Mode r2 = (android.graphics.PorterDuff.Mode) r2
            defpackage.ch.i(r1, r2)
        L2c:
            boolean r2 = r1.isStateful()
            if (r2 == 0) goto L39
            int[] r2 = r0.getDrawableState()
            r1.setState(r2)
        L39:
            r0.setButtonDrawable(r1)
        L3c:
            return
    }

    public void b() {
            r3 = this;
            java.lang.Object r0 = r3.f
            z2 r0 = (defpackage.z2) r0
            android.graphics.drawable.Drawable r1 = r0.getCheckMarkDrawable()
            if (r1 == 0) goto L3c
            boolean r2 = r3.c
            if (r2 != 0) goto L12
            boolean r2 = r3.d
            if (r2 == 0) goto L3c
        L12:
            android.graphics.drawable.Drawable r1 = r1.mutate()
            boolean r2 = r3.c
            if (r2 == 0) goto L21
            android.os.Parcelable r2 = r3.a
            android.content.res.ColorStateList r2 = (android.content.res.ColorStateList) r2
            defpackage.ch.h(r1, r2)
        L21:
            boolean r2 = r3.d
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r3.b
            android.graphics.PorterDuff$Mode r2 = (android.graphics.PorterDuff.Mode) r2
            defpackage.ch.i(r1, r2)
        L2c:
            boolean r2 = r1.isStateful()
            if (r2 == 0) goto L39
            int[] r2 = r0.getDrawableState()
            r1.setState(r2)
        L39:
            r0.setCheckMarkDrawable(r1)
        L3c:
            return
    }

    public android.os.Bundle c(java.lang.String r4) {
            r3 = this;
            boolean r0 = r3.d
            if (r0 == 0) goto L29
            android.os.Parcelable r0 = r3.a
            android.os.Bundle r0 = (android.os.Bundle) r0
            r1 = 0
            if (r0 == 0) goto L28
            android.os.Bundle r0 = r0.getBundle(r4)
            android.os.Parcelable r2 = r3.a
            android.os.Bundle r2 = (android.os.Bundle) r2
            if (r2 == 0) goto L18
            r2.remove(r4)
        L18:
            android.os.Parcelable r4 = r3.a
            android.os.Bundle r4 = (android.os.Bundle) r4
            if (r4 == 0) goto L25
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L25
            return r0
        L25:
            r3.a = r1
            return r0
        L28:
            return r1
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "You can consumeRestoredStateForKey only after super.onCreate of corresponding component"
            r4.<init>(r0)
            throw r4
    }

    public void d(android.util.AttributeSet r9, int r10) {
            r8 = this;
            java.lang.Object r0 = r8.f
            r1 = r0
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            android.content.Context r0 = r1.getContext()
            int[] r3 = defpackage.xy.m
            r5 r7 = defpackage.r5.y(r0, r9, r3, r10)
            java.lang.Object r0 = r7.b
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            android.content.Context r2 = r1.getContext()
            java.lang.Object r4 = r7.b
            r5 = r4
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            r4 = r9
            r6 = r10
            defpackage.ja0.k(r1, r2, r3, r4, r5, r6)
            r9 = 1
            boolean r10 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L3b
            r2 = 0
            if (r10 == 0) goto L3e
            int r9 = r0.getResourceId(r9, r2)     // Catch: java.lang.Throwable -> L3b
            if (r9 == 0) goto L3e
            android.content.Context r10 = r1.getContext()     // Catch: java.lang.Throwable -> L3b android.content.res.Resources.NotFoundException -> L3e
            android.graphics.drawable.Drawable r9 = defpackage.ff.r(r10, r9)     // Catch: java.lang.Throwable -> L3b android.content.res.Resources.NotFoundException -> L3e
            r1.setButtonDrawable(r9)     // Catch: java.lang.Throwable -> L3b android.content.res.Resources.NotFoundException -> L3e
            goto L55
        L3b:
            r0 = move-exception
            r9 = r0
            goto L7b
        L3e:
            boolean r9 = r0.hasValue(r2)     // Catch: java.lang.Throwable -> L3b
            if (r9 == 0) goto L55
            int r9 = r0.getResourceId(r2, r2)     // Catch: java.lang.Throwable -> L3b
            if (r9 == 0) goto L55
            android.content.Context r10 = r1.getContext()     // Catch: java.lang.Throwable -> L3b
            android.graphics.drawable.Drawable r9 = defpackage.ff.r(r10, r9)     // Catch: java.lang.Throwable -> L3b
            r1.setButtonDrawable(r9)     // Catch: java.lang.Throwable -> L3b
        L55:
            r9 = 2
            boolean r10 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L3b
            if (r10 == 0) goto L63
            android.content.res.ColorStateList r9 = r7.l(r9)     // Catch: java.lang.Throwable -> L3b
            defpackage.wb.c(r1, r9)     // Catch: java.lang.Throwable -> L3b
        L63:
            r9 = 3
            boolean r10 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L3b
            if (r10 == 0) goto L77
            r10 = -1
            int r9 = r0.getInt(r9, r10)     // Catch: java.lang.Throwable -> L3b
            r10 = 0
            android.graphics.PorterDuff$Mode r9 = defpackage.eh.b(r9, r10)     // Catch: java.lang.Throwable -> L3b
            defpackage.wb.d(r1, r9)     // Catch: java.lang.Throwable -> L3b
        L77:
            r7.z()
            return
        L7b:
            r7.z()
            throw r9
    }

    public void e(java.lang.String r3, defpackage.t10 r4) {
            r2 = this;
            java.lang.Object r0 = r2.f
            o10 r0 = (defpackage.o10) r0
            l10 r1 = r0.a(r3)
            if (r1 == 0) goto Ld
            java.lang.Object r3 = r1.b
            goto L28
        Ld:
            l10 r1 = new l10
            r1.<init>(r3, r4)
            int r3 = r0.d
            int r3 = r3 + 1
            r0.d = r3
            l10 r3 = r0.b
            if (r3 != 0) goto L21
            r0.a = r1
            r0.b = r1
            goto L27
        L21:
            r3.c = r1
            r1.d = r3
            r0.b = r1
        L27:
            r3 = 0
        L28:
            t10 r3 = (defpackage.t10) r3
            if (r3 != 0) goto L2d
            return
        L2d:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "SavedStateProvider with the given key is already registered"
            r3.<init>(r4)
            throw r3
    }
}
