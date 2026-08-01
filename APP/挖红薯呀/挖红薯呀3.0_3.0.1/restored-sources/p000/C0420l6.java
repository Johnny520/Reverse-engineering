package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l6 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0420l6 extends oe0 implements InterfaceC1005zi, InterfaceC0775tq, g50 {

    /* JADX INFO: renamed from: B */
    public sv0 f3349B;

    /* JADX INFO: renamed from: C */
    public tv0 f3350C;

    /* JADX INFO: renamed from: r */
    public final g30 f3351r;

    /* JADX INFO: renamed from: s */
    public final boolean f3352s;

    /* JADX INFO: renamed from: t */
    public final float f3353t;

    /* JADX INFO: renamed from: u */
    public final C0910x1 f3354u;

    /* JADX INFO: renamed from: v */
    public final C0769tm f3355v;

    /* JADX INFO: renamed from: w */
    public C0206fe f3356w;

    /* JADX INFO: renamed from: x */
    public float f3357x;

    /* JADX INFO: renamed from: z */
    public boolean f3359z;

    /* JADX INFO: renamed from: y */
    public long f3358y = 0;

    /* JADX INFO: renamed from: A */
    public final dh0 f3348A = new dh0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0420l6(g30 g30Var, boolean z, float f, C0910x1 c0910x1, C0769tm c0769tm) {
        this.f3351r = g30Var;
        this.f3352s = z;
        this.f3353t = f;
        this.f3354u = c0910x1;
        this.f3355v = c0769tm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0775tq
    /* JADX INFO: renamed from: B */
    public final void mo1679B(d60 d60Var) {
        C0125dd c0125dd = d60Var.f976d;
        d60Var.m648a();
        C0206fe c0206fe = this.f3356w;
        if (c0206fe != null) {
            float f = this.f3357x;
            long jM5072l = this.f3354u.m5072l();
            float fFloatValue = ((Number) ((C0045b7) c0206fe.f1698c).m323d()).floatValue();
            if (fFloatValue > 0.0f) {
                long jM1093b = C0207ff.m1093b(fFloatValue, jM5072l);
                if (c0206fe.f1696a) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (c0125dd.mo649c() >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c0125dd.mo649c() & 4294967295L));
                    C0541o8 c0541o8 = c0125dd.f1053e;
                    long jM2803h = c0541o8.m2803h();
                    c0541o8.m2802f().mo243i();
                    try {
                        ((C0541o8) ((C0910x1) c0541o8.f4480a).f7232e).m2802f().mo238d(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                        InterfaceC0812uq.m4335W(d60Var, jM1093b, f);
                    } finally {
                        c0541o8.m2802f().mo241g();
                        c0541o8.m2812q(jM2803h);
                    }
                } else {
                    InterfaceC0812uq.m4335W(d60Var, jM1093b, f);
                }
            }
        }
        InterfaceC0051bd interfaceC0051bdM2802f = c0125dd.f1053e.m2802f();
        tv0 tv0Var = this.f3350C;
        if (tv0Var != null) {
            long j = this.f3358y;
            int iM3458Q = rd0.m3458Q(this.f3357x);
            long jM5072l2 = this.f3354u.m5072l();
            this.f3355v.invoke();
            tv0Var.m4235e(iM3458Q, j, jM5072l2);
            tv0Var.draw(AbstractC0077c3.m439a(interfaceC0051bdM2802f));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.g50
    /* JADX INFO: renamed from: l */
    public final void mo547l(long j) {
        float fMo654p;
        this.f3359z = true;
        InterfaceC0968ym interfaceC0968ym = pf1.m3039Q(this).f388B;
        this.f3358y = o30.m2759C(j);
        float f = this.f3353t;
        if (Float.isNaN(f)) {
            long j2 = this.f3358y;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            fMo654p = ok0.m2932c((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)) / 2.0f;
            if (this.f3352s) {
                fMo654p += interfaceC0968ym.mo654p(10.0f);
            }
        } else {
            fMo654p = interfaceC0968ym.mo654p(f);
        }
        this.f3357x = fMo654p;
        dh0 dh0Var = this.f3348A;
        Object[] objArr = dh0Var.f1108a;
        int i = dh0Var.f1109b;
        for (int i2 = 0; i2 < i; i2++) {
            m1977w0((ls0) objArr[i2]);
        }
        dh0Var.m700d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: l0 */
    public final boolean mo548l0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: o0 */
    public final void mo656o0() {
        AbstractC0307i4.m1547w(m2879k0(), null, new C0154e(this, null, 9), 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: p0 */
    public final void mo657p0() {
        sv0 sv0Var = this.f3349B;
        if (sv0Var != null) {
            this.f3350C = null;
            AbstractC0398kl.m1932r(this);
            C0111d c0111d = sv0Var.f5849g;
            tv0 tv0Var = (tv0) ((LinkedHashMap) c0111d.f919e).get(this);
            if (tv0Var != null) {
                tv0Var.m4233c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) c0111d.f919e;
                tv0 tv0Var2 = (tv0) linkedHashMap.get(this);
                if (tv0Var2 != null) {
                }
                linkedHashMap.remove(this);
                sv0Var.f5848f.add(tv0Var);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w0 */
    public final void m1977w0(ls0 ls0Var) {
        tv0 tv0Var;
        if (!(ls0Var instanceof js0)) {
            if (ls0Var instanceof ks0) {
                tv0 tv0Var2 = this.f3350C;
                if (tv0Var2 != null) {
                    tv0Var2.m4234d();
                    return;
                }
                return;
            }
            if (!(ls0Var instanceof is0) || (tv0Var = this.f3350C) == null) {
                return;
            }
            tv0Var.m4234d();
            return;
        }
        js0 js0Var = (js0) ls0Var;
        long j = this.f3358y;
        float f = this.f3357x;
        sv0 sv0Var = this.f3349B;
        int i = 0;
        if (sv0Var == null) {
            Object obj = (View) pf1.m3058r(this, AbstractC0676r4.f5294e);
            while (!(obj instanceof ViewGroup)) {
                ViewParent parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    C0921xc.m5127h("Couldn't find a valid parent for ", obj, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?");
                    return;
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    sv0 sv0Var2 = new sv0(viewGroup.getContext());
                    viewGroup.addView(sv0Var2);
                    sv0Var = sv0Var2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt instanceof sv0) {
                        sv0Var = (sv0) childAt;
                        break;
                    }
                    i2++;
                }
            }
            this.f3349B = sv0Var;
        }
        ArrayList arrayList = sv0Var.f5847e;
        C0111d c0111d = sv0Var.f5849g;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0111d.f919e;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) c0111d.f919e;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) c0111d.f920f;
        tv0 tv0Var3 = (tv0) linkedHashMap.get(this);
        if (tv0Var3 == null) {
            ArrayList arrayList2 = sv0Var.f5848f;
            arrayList2.getClass();
            tv0Var3 = (tv0) (arrayList2.isEmpty() ? null : arrayList2.remove(0));
            if (tv0Var3 == null) {
                if (sv0Var.f5850h > o30.m2778r(arrayList)) {
                    tv0Var3 = new tv0(sv0Var.getContext());
                    sv0Var.addView(tv0Var3);
                    arrayList.add(tv0Var3);
                } else {
                    tv0Var3 = (tv0) arrayList.get(sv0Var.f5850h);
                    C0420l6 c0420l6 = (C0420l6) linkedHashMap3.get(tv0Var3);
                    if (c0420l6 != null) {
                        c0420l6.f3350C = null;
                        AbstractC0398kl.m1932r(c0420l6);
                        tv0 tv0Var4 = (tv0) linkedHashMap2.get(c0420l6);
                        if (tv0Var4 != null) {
                        }
                        linkedHashMap2.remove(c0420l6);
                        tv0Var3.m4233c();
                    }
                }
                int i3 = sv0Var.f5850h;
                if (i3 < sv0Var.f5846d - 1) {
                    sv0Var.f5850h = i3 + 1;
                } else {
                    sv0Var.f5850h = 0;
                }
            }
            linkedHashMap2.put(this, tv0Var3);
            linkedHashMap3.put(tv0Var3, this);
        }
        int iM3458Q = rd0.m3458Q(f);
        long jM5072l = this.f3354u.m5072l();
        this.f3355v.invoke();
        tv0 tv0Var5 = tv0Var3;
        tv0Var5.m4232b(js0Var, this.f3352s, j, iM3458Q, jM5072l, new C0381k6(i, this));
        this.f3350C = tv0Var5;
        AbstractC0398kl.m1932r(this);
    }
}
