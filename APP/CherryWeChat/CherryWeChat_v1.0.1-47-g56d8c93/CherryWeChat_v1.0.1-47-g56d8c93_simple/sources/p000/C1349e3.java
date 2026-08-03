package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: e3 */
/* JADX INFO: loaded from: classes.dex */
public final class C1349e3 {

    /* JADX INFO: renamed from: a */
    public final View f4847a;

    /* JADX INFO: renamed from: b */
    public final C0262G3 f4848b;

    /* JADX INFO: renamed from: c */
    public int f4849c;

    /* JADX INFO: renamed from: d */
    public C2090jB f4850d;

    /* JADX INFO: renamed from: e */
    public C2090jB f4851e;

    /* JADX INFO: renamed from: f */
    public C2090jB f4852f;

    public C1349e3(View r2) {
        this.f4849c = -1;
        this.f4847a = r2;
        this.f4848b = C0262G3.m539a();
    }

    /* JADX INFO: renamed from: a */
    public final void m2600a() {
        View r0 = this.f4847a;
        Drawable r1 = r0.getBackground();
        if (r1 != null) goto L5;
        return;
    L5:
        if (this.f4850d != null) goto L7;
    L21:
        C2090jB r2 = this.f4851e;
        if (r2 == null) goto L25;
        C0262G3.m542e(r1, r2, r0.getDrawableState());
        return;
    L25:
        C2090jB r22 = this.f4850d;
        if (r22 == null) goto L30;
        C0262G3.m542e(r1, r22, r0.getDrawableState());
        return;
    L30:
        return;
    L7:
        if (this.f4852f != null) goto L9;
        this.f4852f = new C2090jB();
    L9:
        C2090jB r23 = this.f4852f;
        r23.f7358a = null;
        r23.f7361d = false;
        r23.f7359b = null;
        r23.f7360c = false;
        WeakHashMap r3 = AbstractC2185lE.f7617a;
        ColorStateList r32 = AbstractC1360eE.m2631c(r0);
        if (r32 == null) goto L12;
        r23.f7361d = true;
        r23.f7358a = r32;
    L12:
        PorterDuff.Mode r33 = AbstractC1360eE.m2632d(r0);
        if (r33 == null) goto L16;
        r23.f7360c = true;
        r23.f7359b = r33;
    L16:
        if (r23.f7361d == false) goto L18;
    L19:
        C0262G3.m542e(r1, r23, r0.getDrawableState());
        return;
    L18:
        if (r23.f7360c == false) goto L21;
        goto L19
    }

    /* JADX INFO: renamed from: b */
    public final ColorStateList m2601b() {
        C2090jB r0 = this.f4851e;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.f7358a;
    }

    /* JADX INFO: renamed from: c */
    public final PorterDuff.Mode m2602c() {
        C2090jB r0 = this.f4851e;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.f7359b;
    }

    /* JADX INFO: renamed from: d */
    public final void m2603d(AttributeSet r10, int r11) {
        View r0 = this.f4847a;
        Context r1 = r0.getContext();
        int[] r4 = AbstractC0982Wu.f3091z;
        C2656w4 r12 = C2656w4.m5186A(r1, r10, r4, r11);
        TypedArray r8 = (TypedArray) r12.f9196b;
        View r2 = this.f4847a;
        AbstractC2185lE.m4398k(r2, r2.getContext(), r4, r10, (TypedArray) r12.f9196b, r11);
    L12:
        th = move-exception;
        r12.m5195E();
        throw th;
    L4:
        if (r8.hasValue(0) == false) goto L19;
        this.f4849c = r8.getResourceId(0, -1);     // Catch: Throwable -> L12
        C0262G3 r102 = this.f4848b;     // Catch: Throwable -> L12
        Context r112 = r0.getContext();     // Catch: Throwable -> L12
        int r3 = this.f4849c;     // Catch: Throwable -> L12
        monitor-enter(r102);     // Catch: Throwable -> L12
        ColorStateList r113 = r102.f844a.m5352f(r112, r3);     // Catch: Throwable -> L14
        monitor-exit(r102);     // Catch: Throwable -> L12
        if (r113 == null) goto L19;
        m2606g(r113);     // Catch: Throwable -> L12
        goto L19
    L14:
        th = move-exception;
        throw th;     // Catch: Throwable -> L12
    L19:
        if (r8.hasValue(1) == false) goto L22;
        AbstractC1360eE.m2637i(r0, r12.m5209p(1));     // Catch: Throwable -> L12
    L22:
        if (r8.hasValue(2) == false) goto L24;
        AbstractC1360eE.m2638j(r0, AbstractC0107Ce.m161c(r8.getInt(2, -1), null));     // Catch: Throwable -> L12
    L24:
        r12.m5195E();
    }

    /* JADX INFO: renamed from: e */
    public final void m2604e() {
        this.f4849c = -1;
        m2606g(null);
        m2600a();
    }

    /* JADX INFO: renamed from: f */
    public final void m2605f(int r4) {
        this.f4849c = r4;
        C0262G3 r0 = this.f4848b;
        if (r0 == null) goto L12;
        Context r1 = this.f4847a.getContext();
        monitor-enter(r0);
        ColorStateList r42 = r0.f844a.m5352f(r1, r4);     // Catch: Throwable -> L9
        monitor-exit(r0);
    L13:
        m2606g(r42);
        m2600a();
        return;
    L9:
        th = move-exception;
        throw th;
    L12:
        r42 = null;
        goto L13
    }

    /* JADX INFO: renamed from: g */
    public final void m2606g(ColorStateList r2) {
        if (r2 != null) goto L4;
        this.f4850d = null;
    L8:
        m2600a();
        return;
    L4:
        if (this.f4850d != null) goto L6;
        this.f4850d = new C2090jB();
    L6:
        C2090jB r0 = this.f4850d;
        r0.f7358a = r2;
        r0.f7361d = true;
        goto L8
    }

    /* JADX INFO: renamed from: h */
    public final void m2607h(ColorStateList r2) {
        if (this.f4851e != null) goto L5;
        this.f4851e = new C2090jB();
    L5:
        C2090jB r0 = this.f4851e;
        r0.f7358a = r2;
        r0.f7361d = true;
        m2600a();
    }

    /* JADX INFO: renamed from: i */
    public final void m2608i(PorterDuff.Mode r2) {
        if (this.f4851e != null) goto L5;
        this.f4851e = new C2090jB();
    L5:
        C2090jB r0 = this.f4851e;
        r0.f7359b = r2;
        r0.f7360c = true;
        m2600a();
    }
}
