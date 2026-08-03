package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import org.luckypray.dexkit.C1031R;
import p034S.AbstractC0324d;
import p037U.AbstractC0343C;
import p037U.C0344D;
import p037U.C0349I;
import p037U.C0352L;
import p058g0.AbstractC0942a;
import p072n0.AbstractC1010e;
import p072n0.C1007b;
import p072n0.C1008c;
import p072n0.C1009d;
import p072n0.C1011f;
import p072n0.ViewOnLayoutChangeListenerC1006a;

/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends AbstractC0343C {

    /* JADX INFO: renamed from: k */
    public final C1011f f2364k;

    /* JADX INFO: renamed from: l */
    public C1009d f2365l;

    /* JADX INFO: renamed from: m */
    public final View.OnLayoutChangeListener f2366m;

    public CarouselLayoutManager() {
        C1011f r02 = new C1011f();
        new C1007b();
        this.f2366m = new ViewOnLayoutChangeListenerC1006a(this);
        this.f2364k = r02;
        m793Y();
        m1867g0(0);
    }

    /* JADX INFO: renamed from: d0 */
    public static C1008c m1863d0(List r13, float r14, boolean r15) {
        float r2 = Float.MAX_VALUE;
        int r7 = -1;
        int r8 = -1;
        int r9 = -1;
        int r10 = -1;
        float r5 = -3.4028235E38f;
        int r6 = 0;
        float r3 = Float.MAX_VALUE;
        float r4 = Float.MAX_VALUE;
    L4:
        if (r6 >= r13.size()) goto L22;
        ((AbstractC1010e) r13.get(r6)).getClass();
        float r11 = Math.abs(0.0f - r14);
        if (0.0f > r14) goto L11;
        if (r11 > r2) goto L11;
        r7 = r6;
        r2 = r11;
    L11:
        if (0.0f <= r14) goto L16;
        if (r11 > r3) goto L16;
        r9 = r6;
        r3 = r11;
    L16:
        if (0.0f > r4) goto L19;
        r4 = 0.0f;
        r8 = r6;
    L19:
        if (0.0f <= r5) goto L21;
        r5 = 0.0f;
        r10 = r6;
    L21:
        r6 = r6 + 1;
        goto L4
    L22:
        if (r7 != (-1)) goto L24;
        r7 = r8;
    L24:
        if (r9 != (-1)) goto L26;
        r9 = r10;
    L26:
        AbstractC1010e r152 = (AbstractC1010e) r13.get(r7);
        AbstractC1010e r132 = (AbstractC1010e) r13.get(r9);
        C1008c r142 = new C1008c();
        r152.getClass();
        r132.getClass();
        if (0.0f > 0.0f) goto L30;
        return r142;
    L30:
        throw new IllegalArgumentException();
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: H */
    public final boolean mo777H() {
        return true;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: J */
    public final void mo778J(RecyclerView r6) {
        C1011f r02 = this.f2364k;
        Context r1 = r6.getContext();
        float r2 = r02.f3722a;
        if (r2 > 0.0f) goto L6;
        r2 = r1.getResources().getDimension(C1031R.dimen.m3_carousel_small_item_size_min);
    L6:
        r02.f3722a = r2;
        float r22 = r02.f3723b;
        if (r22 > 0.0f) goto L10;
        r22 = r1.getResources().getDimension(C1031R.dimen.m3_carousel_small_item_size_max);
    L10:
        r02.f3723b = r22;
        m787S();
        r6.addOnLayoutChangeListener(this.f2366m);
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: K */
    public final void mo779K(RecyclerView r2) {
        r2.removeOnLayoutChangeListener(this.f2366m);
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: L */
    public final View mo780L(View r7, int r8, C0349I r9, C0352L r10) {
        if (m813r() != 0) goto L5;
        return null;
    L5:
        int r102 = this.f2365l.f3719a;
        if (r8 != 1) goto L8;
    L30:
        byte r82 = -1;
    L31:
        if (r82 != (-2147483648)) goto L33;
        return null;
    L33:
        int r1 = 0;
        if (r82 != (-1)) goto L50;
        if (AbstractC0343C.m765D(r7) != 0) goto L38;
        return null;
    L38:
        int r72 = AbstractC0343C.m765D(m812q(0)) - 1;
        if (r72 < 0) goto L46;
        if (r72 >= m816x()) goto L46;
        m1864c0(r72);
        r9.m829i(r72, Long.MAX_VALUE);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    L46:
        if (m1866f0() == false) goto L65;
        r1 = m813r() - 1;
    L65:
        return m812q(r1);
    L50:
        if (AbstractC0343C.m765D(r7) != (m816x() - 1)) goto L52;
        return null;
    L52:
        int r73 = AbstractC0343C.m765D(m812q(m813r() - 1)) + 1;
        if (r73 < 0) goto L60;
        if (r73 >= m816x()) goto L60;
        m1864c0(r73);
        r9.m829i(r73, Long.MAX_VALUE);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    L60:
        if (m1866f0() == true) goto L64;
        r1 = m813r() - 1;
    L64:
        return m812q(r1);
    L8:
        if (r8 != 2) goto L10;
    L29:
        r82 = 1;
        goto L31
    L10:
        if (r8 != 17) goto L12;
        if (r102 == 0) goto L28;
    L17:
        r82 = -2147483648;
        goto L31
    L28:
        if (m1866f0() == false) goto L30;
    L12:
        if (r8 != 33) goto L14;
        if (r102 != 1) goto L17;
    L14:
        if (r8 != 66) goto L16;
        if (r102 != 0) goto L17;
        if (m1866f0() == false) goto L29;
    L16:
        if (r8 != 130) goto L17;
        if (r102 != 1) goto L17;
        goto L17
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: M */
    public final void mo781M(AccessibilityEvent r2) {
        super.mo781M(r2);
        if (m813r() <= 0) goto L6;
        r2.setFromIndex(AbstractC0343C.m765D(m812q(0)));
        r2.setToIndex(AbstractC0343C.m765D(m812q(m813r() - 1)));
        return;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: X */
    public final boolean mo792X(RecyclerView r1, View r2, Rect r3, boolean r4, boolean r5) {
        return false;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: c */
    public final boolean mo799c() {
        return m1865e0();
    }

    /* JADX INFO: renamed from: c0 */
    public final float m1864c0(int r1) {
        this.f2365l.m2443d();
        throw null;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: d */
    public final boolean mo800d() {
        return !m1865e0();
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m1865e0() {
        if (this.f2365l.f3719a != 0) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m1866f0() {
        if (m1865e0() == true) goto L5;
    L7:
        return false;
    L5:
        if (m817y() != 1) goto L7;
        return true;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: g */
    public final int mo802g(C0352L r1) {
        m813r();
        return 0;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m1867g0(int r3) {
        if (r3 == 0) goto L8;
        if (r3 == 1) goto L8;
        throw new IllegalArgumentException(AbstractC0324d.m720c("invalid orientation:", r3));
    L8:
        mo797b(null);
        C1009d r1 = this.f2365l;
        if (r1 != null) goto L11;
    L12:
        if (r3 == 0) goto L17;
        if (r3 != 1) goto L16;
        C1009d r32 = new C1009d(this, 0);
    L18:
        this.f2365l = r32;
        m793Y();
        return;
    L16:
        throw new IllegalArgumentException("invalid orientation");
    L17:
        r32 = new C1009d(this, 1);
        goto L18
    L11:
        if (r3 != r1.f3719a) goto L12;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: h */
    public final int mo803h(C0352L r1) {
        return 0;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: i */
    public final int mo804i(C0352L r1) {
        return 0;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: j */
    public final int mo805j(C0352L r1) {
        m813r();
        return 0;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: k */
    public final int mo806k(C0352L r1) {
        return 0;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: l */
    public final int mo807l(C0352L r1) {
        return 0;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: n */
    public final C0344D mo809n() {
        return new C0344D(-2, -2);
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: u */
    public final void mo815u(View r1, Rect r2) {
        super.mo815u(r1, r2);
        r2.centerY();
        if (m1865e0() == false) goto L6;
        r2.centerX();
    L6:
        throw null;
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context r1, AttributeSet r2, int r3, int r4) {
        new C1007b();
        this.f2366m = new ViewOnLayoutChangeListenerC1006a(this);
        this.f2364k = new C1011f();
        m793Y();
        if (r2 == null) goto L6;
        TypedArray r12 = r1.obtainStyledAttributes(r2, AbstractC0942a.f3330b);
        r12.getInt(0, 0);
        m793Y();
        m1867g0(r12.getInt(0, 0));
        r12.recycle();
        return;
    }
}
