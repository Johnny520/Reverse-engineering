package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class v2 {
    public final View a;
    public final u3 b;
    public int c;
    public y60 d;
    public y60 e;
    public y60 f;

    public v2(View r2) {
        this.c = -1;
        this.a = r2;
        this.b = u3.a();
    }

    public final void a() {
        View r0 = this.a;
        Drawable r1 = r0.getBackground();
        if (r1 != null) goto L5;
        return;
    L5:
        if (this.d != null) goto L7;
    L21:
        y60 r2 = this.e;
        if (r2 == null) goto L25;
        u3.e(r1, r2, r0.getDrawableState());
        return;
    L25:
        y60 r22 = this.d;
        if (r22 == null) goto L30;
        u3.e(r1, r22, r0.getDrawableState());
        return;
    L30:
        return;
    L7:
        if (this.f != null) goto L9;
        this.f = new y60();
    L9:
        y60 r23 = this.f;
        r23.a = null;
        r23.d = false;
        r23.b = null;
        r23.c = false;
        WeakHashMap r3 = ja0.a;
        ColorStateList r32 = y90.g(r0);
        if (r32 == null) goto L12;
        r23.d = true;
        r23.a = r32;
    L12:
        PorterDuff.Mode r33 = y90.h(r0);
        if (r33 == null) goto L16;
        r23.c = true;
        r23.b = r33;
    L16:
        if (r23.d == false) goto L18;
    L19:
        u3.e(r1, r23, r0.getDrawableState());
        return;
    L18:
        if (r23.c == false) goto L21;
        goto L19
    }

    public final ColorStateList b() {
        y60 r0 = this.e;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.a;
    }

    public final PorterDuff.Mode c() {
        y60 r0 = this.e;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.b;
    }

    public final void d(AttributeSet r10, int r11) {
        View r0 = this.a;
        Context r1 = r0.getContext();
        int[] r4 = xy.z;
        r5 r12 = r5.y(r1, r10, r4, r11);
        TypedArray r8 = (TypedArray) r12.b;
        View r2 = this.a;
        ja0.k(r2, r2.getContext(), r4, r10, (TypedArray) r12.b, r11);
    L12:
        th = move-exception;
        r12.z();
        throw th;
    L4:
        if (r8.hasValue(0) == false) goto L19;
        this.c = r8.getResourceId(0, -1);     // Catch: Throwable -> L12
        u3 r102 = this.b;     // Catch: Throwable -> L12
        Context r112 = r0.getContext();     // Catch: Throwable -> L12
        int r3 = this.c;     // Catch: Throwable -> L12
        monitor-enter(r102);     // Catch: Throwable -> L12
        ColorStateList r113 = r102.a.f(r112, r3);     // Catch: Throwable -> L14
        monitor-exit(r102);     // Catch: Throwable -> L12
        if (r113 == null) goto L19;
        g(r113);     // Catch: Throwable -> L12
        goto L19
    L14:
        th = move-exception;
        throw th;     // Catch: Throwable -> L12
    L19:
        if (r8.hasValue(1) == false) goto L22;
        y90.q(r0, r12.l(1));     // Catch: Throwable -> L12
    L22:
        if (r8.hasValue(2) == false) goto L24;
        y90.r(r0, eh.b(r8.getInt(2, -1), null));     // Catch: Throwable -> L12
    L24:
        r12.z();
    }

    public final void e() {
        this.c = -1;
        g(null);
        a();
    }

    public final void f(int r4) {
        this.c = r4;
        u3 r0 = this.b;
        if (r0 == null) goto L12;
        Context r1 = this.a.getContext();
        monitor-enter(r0);
        ColorStateList r42 = r0.a.f(r1, r4);     // Catch: Throwable -> L9
        monitor-exit(r0);
    L13:
        g(r42);
        a();
        return;
    L9:
        th = move-exception;
        throw th;
    L12:
        r42 = null;
        goto L13
    }

    public final void g(ColorStateList r2) {
        if (r2 != null) goto L4;
        this.d = null;
    L8:
        a();
        return;
    L4:
        if (this.d != null) goto L6;
        this.d = new y60();
    L6:
        y60 r0 = this.d;
        r0.a = r2;
        r0.d = true;
        goto L8
    }

    public final void h(ColorStateList r2) {
        if (this.e != null) goto L5;
        this.e = new y60();
    L5:
        y60 r0 = this.e;
        r0.a = r2;
        r0.d = true;
        a();
    }

    public final void i(PorterDuff.Mode r2) {
        if (this.e != null) goto L5;
        this.e = new y60();
    L5:
        y60 r0 = this.e;
        r0.b = r2;
        r0.c = true;
        a();
    }
}
