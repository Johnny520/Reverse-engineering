package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.m8;
import defpackage.n8;
import defpackage.nz;
import defpackage.o8;
import defpackage.oz;
import defpackage.p8;
import defpackage.tz;
import defpackage.vh;
import defpackage.wy;
import defpackage.xz;
import defpackage.yz;

/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends nz implements xz {
    public p8 p;
    public final View.OnLayoutChangeListener q;

    public CarouselLayoutManager() {
        new vh(27);
        new o8();
        this.q = new m8(this);
        j0();
        A0(0);
    }

    public final void A0(int r4) {
        if (r4 == 0) goto L8;
        if (r4 == 1) goto L8;
        throw new IllegalArgumentException("invalid orientation:" + r4);
    L8:
        c(null);
        p8 r1 = this.p;
        if (r1 != null) goto L11;
    L14:
        if (r4 == 0) goto L19;
        if (r4 != 1) goto L18;
        p8 r42 = new p8(this, 0);
    L20:
        this.p = r42;
        j0();
        return;
    L18:
        throw new IllegalArgumentException("invalid orientation");
    L19:
        r42 = new p8(this, 1);
        goto L20
    L11:
        if (r4 != r1.a) goto L14;
    }

    @Override // defpackage.nz
    public final void O(RecyclerView r2) {
        j0();
        r2.addOnLayoutChangeListener(this.q);
    }

    @Override // defpackage.nz
    public final void P(RecyclerView r2) {
        r2.removeOnLayoutChangeListener(this.q);
    }

    @Override // defpackage.nz
    public final View Q(View r4, int r5, tz r6, yz r7) {
        if (v() == 0) goto L67;
        int r62 = this.p.a;
        if (r5 != 1) goto L8;
    L24:
        byte r52 = -1;
    L31:
        if (r52 == (-2147483648)) goto L68;
        int r63 = 0;
        if (r52 != (-1)) goto L51;
        if (nz.F(r4) == 0) goto L69;
        int r42 = nz.F(u(0)) - 1;
        if (r42 < 0) goto L46;
        if (r42 >= z()) goto L46;
        this.p.a();
        throw null;
    L46:
        if (z0() == false) goto L49;
        r63 = v() - 1;
    L49:
        return u(r63);
    L69:
        return null;
    L51:
        if (nz.F(r4) != (z() - 1)) goto L54;
        return null;
    L54:
        int r43 = nz.F(u(v() - 1)) + 1;
        if (r43 < 0) goto L62;
        if (r43 >= z()) goto L62;
        this.p.a();
        throw null;
    L62:
        if (z0() == true) goto L66;
        r63 = v() - 1;
    L66:
        return u(r63);
    L68:
        return null;
    L8:
        if (r5 != 2) goto L10;
    L20:
        r52 = 1;
        goto L31
    L10:
        if (r5 != 17) goto L12;
        if (r62 == 0) goto L29;
    L18:
        r52 = -2147483648;
        goto L31
    L29:
        if (z0() == false) goto L24;
    L12:
        if (r5 != 33) goto L14;
        if (r62 != 1) goto L18;
    L14:
        if (r5 != 66) goto L16;
        if (r62 != 0) goto L18;
        if (z0() == false) goto L20;
    L16:
        if (r5 == 130) goto L19;
        Log.d("CarouselLayoutManager", "Unknown focus request:" + r5);
        goto L18
    L19:
        if (r62 != 1) goto L18;
    L67:
        return null;
    }

    @Override // defpackage.nz
    public final void R(AccessibilityEvent r2) {
        super.R(r2);
        if (v() <= 0) goto L6;
        r2.setFromIndex(nz.F(u(0)));
        r2.setToIndex(nz.F(u(v() - 1)));
        return;
    }

    @Override // defpackage.nz
    public final void U(int r1, int r2) {
        z();
    }

    @Override // defpackage.nz
    public final void X(int r1, int r2) {
        z();
    }

    @Override // defpackage.nz
    public final void Z(tz r3, yz r4) {
        if (r4.b() > 0) goto L5;
    L13:
        e0(r3);
        return;
    L5:
        if (y0() == false) goto L7;
        int r42 = this.n;
    L9:
        if (r42 <= 0.0f) goto L13;
        z0();
        View r32 = r3.i(0, Long.MAX_VALUE).a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    L7:
        r42 = this.o;
        goto L9
    }

    @Override // defpackage.xz
    public final PointF a(int r1) {
        return null;
    }

    @Override // defpackage.nz
    public final void a0(yz r1) {
        if (v() != 0) goto L5;
        return;
    L5:
        nz.F(u(0));
    }

    @Override // defpackage.nz
    public final boolean d() {
        return y0();
    }

    @Override // defpackage.nz
    public final boolean e() {
        return !y0();
    }

    @Override // defpackage.nz
    public final boolean i0(RecyclerView r1, View r2, Rect r3, boolean r4, boolean r5) {
        return false;
    }

    @Override // defpackage.nz
    public final int j(yz r1) {
        v();
        return 0;
    }

    @Override // defpackage.nz
    public final int k(yz r1) {
        return 0;
    }

    @Override // defpackage.nz
    public final int k0(int r4, tz r5, yz r6) {
        if (y0() == true) goto L5;
    L10:
        return 0;
    L5:
        if (v() == 0) goto L10;
        if (r4 == 0) goto L10;
        View r42 = r5.i(0, Long.MAX_VALUE).a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // defpackage.nz
    public final int l(yz r1) {
        return 0;
    }

    @Override // defpackage.nz
    public final int m(yz r1) {
        v();
        return 0;
    }

    @Override // defpackage.nz
    public final int m0(int r4, tz r5, yz r6) {
        if (e() == true) goto L5;
    L10:
        return 0;
    L5:
        if (v() == 0) goto L10;
        if (r4 == 0) goto L10;
        View r42 = r5.i(0, Long.MAX_VALUE).a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // defpackage.nz
    public final int n(yz r1) {
        return 0;
    }

    @Override // defpackage.nz
    public final int o(yz r1) {
        return 0;
    }

    @Override // defpackage.nz
    public final oz r() {
        return new oz(-2, -2);
    }

    @Override // defpackage.nz
    public final void v0(RecyclerView r2, int r3) {
        n8 r0 = new n8(this, r2.getContext());
        r0.a = r3;
        w0(r0);
    }

    @Override // defpackage.nz
    public final void y(View r1, Rect r2) {
        super.y(r1, r2);
        r2.centerY();
        if (y0() == false) goto L6;
        r2.centerX();
    L6:
        throw null;
    }

    public final boolean y0() {
        if (this.p.a != 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean z0() {
        if (y0() == true) goto L5;
        return false;
    L5:
        if (A() != 1) goto L9;
        return true;
    L9:
        return false;
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context r1, AttributeSet r2, int r3, int r4) {
        new o8();
        this.q = new m8(this);
        new vh(27);
        j0();
        if (r2 == null) goto L6;
        TypedArray r12 = r1.obtainStyledAttributes(r2, wy.b);
        r12.getInt(0, 0);
        j0();
        A0(r12.getInt(0, 0));
        r12.recycle();
        return;
    }

    @Override // defpackage.nz
    public final void l0(int r1) {
    }
}
