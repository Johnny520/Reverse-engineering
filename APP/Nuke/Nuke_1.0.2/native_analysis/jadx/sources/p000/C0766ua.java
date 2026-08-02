package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: ua */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0766ua extends th1 implements InterfaceC0257gy, mc0, a61 {

    /* JADX INFO: renamed from: A */
    public C0554os f11178A;

    /* JADX INFO: renamed from: B */
    public float f11179B;

    /* JADX INFO: renamed from: D */
    public boolean f11181D;

    /* JADX INFO: renamed from: F */
    public qa2 f11183F;

    /* JADX INFO: renamed from: G */
    public ra2 f11184G;

    /* JADX INFO: renamed from: v */
    public final bk1 f11185v;

    /* JADX INFO: renamed from: w */
    public final boolean f11186w;

    /* JADX INFO: renamed from: x */
    public final float f11187x;

    /* JADX INFO: renamed from: y */
    public final C0485n4 f11188y;

    /* JADX INFO: renamed from: z */
    public final w60 f11189z;

    /* JADX INFO: renamed from: C */
    public long f11180C = 0;

    /* JADX INFO: renamed from: E */
    public final lk1 f11182E = new lk1();

    public C0766ua(bk1 bk1Var, boolean z, float f, C0485n4 c0485n4, w60 w60Var) {
        this.f11185v = bk1Var;
        this.f11186w = z;
        this.f11187x = f;
        this.f11188y = c0485n4;
        this.f11189z = w60Var;
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: B0 */
    public final boolean mo210B0() {
        return false;
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: E0 */
    public final void mo212E0() {
        AbstractC0570p7.m3745A(m5255A0(), null, new C0003a2(this, null, 23), 3);
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: F0 */
    public final void mo213F0() {
        qa2 qa2Var = this.f11183F;
        if (qa2Var != null) {
            this.f11184G = null;
            ci0.m788M(this);
            dq1 dq1Var = qa2Var.f8858k;
            ra2 ra2Var = (ra2) ((LinkedHashMap) dq1Var.f2147i).get(this);
            if (ra2Var != null) {
                ra2Var.m4421c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) dq1Var.f2147i;
                ra2 ra2Var2 = (ra2) linkedHashMap.get(this);
                if (ra2Var2 != null) {
                }
                linkedHashMap.remove(this);
                qa2Var.f8857j.add(ra2Var);
            }
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final void m5477M0(b32 b32Var) {
        ra2 ra2Var;
        if (!(b32Var instanceof z22)) {
            if (b32Var instanceof a32) {
                ra2 ra2Var2 = this.f11184G;
                if (ra2Var2 != null) {
                    ra2Var2.m4422d();
                    return;
                }
                return;
            }
            if (!(b32Var instanceof y22) || (ra2Var = this.f11184G) == null) {
                return;
            }
            ra2Var.m4422d();
            return;
        }
        z22 z22Var = (z22) b32Var;
        long j = this.f11180C;
        float f = this.f11179B;
        qa2 qa2Var = this.f11183F;
        int i = 0;
        if (qa2Var == null) {
            Object obj = (View) p40.m3733p(this, AbstractC0646r7.f9415f);
            while (!(obj instanceof ViewGroup)) {
                ViewParent parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    c80.m670n("Couldn't find a valid parent for ", obj, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?");
                    return;
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    qa2 qa2Var2 = new qa2(viewGroup.getContext());
                    viewGroup.addView(qa2Var2);
                    qa2Var = qa2Var2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt instanceof qa2) {
                        qa2Var = (qa2) childAt;
                        break;
                    }
                    i2++;
                }
            }
            this.f11183F = qa2Var;
        }
        ArrayList arrayList = qa2Var.f8856i;
        dq1 dq1Var = qa2Var.f8858k;
        LinkedHashMap linkedHashMap = (LinkedHashMap) dq1Var.f2147i;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) dq1Var.f2147i;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) dq1Var.f2148j;
        ra2 ra2Var3 = (ra2) linkedHashMap.get(this);
        if (ra2Var3 == null) {
            ArrayList arrayList2 = qa2Var.f8857j;
            arrayList2.getClass();
            ra2Var3 = (ra2) (arrayList2.isEmpty() ? null : arrayList2.remove(0));
            if (ra2Var3 == null) {
                if (qa2Var.f8859l > AbstractC0179eu.m1431L(arrayList)) {
                    ra2Var3 = new ra2(qa2Var.getContext());
                    qa2Var.addView(ra2Var3);
                    arrayList.add(ra2Var3);
                } else {
                    ra2Var3 = (ra2) arrayList.get(qa2Var.f8859l);
                    C0766ua c0766ua = (C0766ua) linkedHashMap3.get(ra2Var3);
                    if (c0766ua != null) {
                        c0766ua.f11184G = null;
                        ci0.m788M(c0766ua);
                        ra2 ra2Var4 = (ra2) linkedHashMap2.get(c0766ua);
                        if (ra2Var4 != null) {
                        }
                        linkedHashMap2.remove(c0766ua);
                        ra2Var3.m4421c();
                    }
                }
                int i3 = qa2Var.f8859l;
                if (i3 < qa2Var.f8855h - 1) {
                    qa2Var.f8859l = i3 + 1;
                } else {
                    qa2Var.f8859l = 0;
                }
            }
            linkedHashMap2.put(this, ra2Var3);
            linkedHashMap3.put(ra2Var3, this);
        }
        int iM1869Q = gf1.m1869Q(f);
        long jMo2185d = this.f11188y.mo2185d();
        this.f11189z.mo6a();
        ra2 ra2Var5 = ra2Var3;
        ra2Var5.m4420b(z22Var, this.f11186w, j, iM1869Q, jMo2185d, new C0727ta(i, this));
        this.f11184G = ra2Var5;
        ci0.m788M(this);
    }

    @Override // p000.mc0
    /* JADX INFO: renamed from: P */
    public final void mo1851P(t61 t61Var) {
        C0702sp c0702sp = t61Var.f10581h;
        t61Var.m5125a();
        C0554os c0554os = this.f11178A;
        if (c0554os != null) {
            float f = this.f11179B;
            long jMo2185d = this.f11188y.mo2185d();
            float fFloatValue = ((Number) ((C0689sc) c0554os.f7822c).m4788d()).floatValue();
            if (fFloatValue > 0.0f) {
                long jM2565b = C0363ju.m2565b(fFloatValue, jMo2185d);
                if (c0554os.f7820a) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (c0702sp.mo3280d() >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c0702sp.mo3280d() & 4294967295L));
                    C0043b5 c0043b5 = c0702sp.f10257i;
                    long jM434u = c0043b5.m434u();
                    c0043b5.m430q().mo1522l();
                    try {
                        ((C0043b5) ((C0485n4) c0043b5.f562i).f6983i).m430q().mo1517f(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                        nc0.m3267O(t61Var, jM2565b, f, 0L, null, 124);
                    } finally {
                        vi0.m5699r(c0043b5, jM434u);
                    }
                } else {
                    nc0.m3267O(t61Var, jM2565b, f, 0L, null, 124);
                }
            }
        }
        InterfaceC0627qp interfaceC0627qpM430q = c0702sp.f10257i.m430q();
        ra2 ra2Var = this.f11184G;
        if (ra2Var != null) {
            long j = this.f11180C;
            int iM1869Q = gf1.m1869Q(this.f11179B);
            long jMo2185d2 = this.f11188y.mo2185d();
            this.f11189z.mo6a();
            ra2Var.m4423e(iM1869Q, j, jMo2185d2);
            ra2Var.draw(AbstractC0229g6.m1806a(interfaceC0627qpM430q));
        }
    }

    @Override // p000.a61, p000.qf1
    /* JADX INFO: renamed from: c */
    public final void mo99c(long j) {
        float fMo689A;
        this.f11181D = true;
        e70 e70Var = sp0.m4933c0(this).f9365F;
        this.f11180C = s11.m4715q0(j);
        float f = this.f11187x;
        if (Float.isNaN(f)) {
            long j2 = this.f11180C;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            fMo689A = rs1.m4610c((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)) / 2.0f;
            if (this.f11186w) {
                fMo689A += e70Var.mo689A(10.0f);
            }
        } else {
            fMo689A = e70Var.mo689A(f);
        }
        this.f11179B = fMo689A;
        lk1 lk1Var = this.f11182E;
        Object[] objArr = lk1Var.f6163a;
        int i = lk1Var.f6164b;
        for (int i2 = 0; i2 < i; i2++) {
            m5477M0((b32) objArr[i2]);
        }
        lk1Var.m2928d();
    }
}
