package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ua extends th1 implements gy, mc0, a61 {
    public os A;
    public float B;
    public boolean D;
    public qa2 F;
    public ra2 G;
    public final bk1 v;
    public final boolean w;
    public final float x;
    public final n4 y;
    public final w60 z;
    public long C = 0;
    public final lk1 E = new lk1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ua(bk1 bk1Var, boolean z, float f, n4 n4Var, w60 w60Var) {
        this.v = bk1Var;
        this.w = z;
        this.x = f;
        this.y = n4Var;
        this.z = w60Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final boolean B0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void E0() {
        p7.A(A0(), null, new a2(this, null, 23), 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void F0() {
        qa2 qa2Var = this.F;
        if (qa2Var != null) {
            this.G = null;
            ci0.M(this);
            dq1 dq1Var = qa2Var.k;
            ra2 ra2Var = (ra2) ((LinkedHashMap) dq1Var.i).get(this);
            if (ra2Var != null) {
                ra2Var.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) dq1Var.i;
                ra2 ra2Var2 = (ra2) linkedHashMap.get(this);
                if (ra2Var2 != null) {
                }
                linkedHashMap.remove(this);
                qa2Var.j.add(ra2Var);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void M0(b32 b32Var) {
        ra2 ra2Var;
        if (!(b32Var instanceof z22)) {
            if (b32Var instanceof a32) {
                ra2 ra2Var2 = this.G;
                if (ra2Var2 != null) {
                    ra2Var2.d();
                    return;
                }
                return;
            }
            if (!(b32Var instanceof y22) || (ra2Var = this.G) == null) {
                return;
            }
            ra2Var.d();
            return;
        }
        z22 z22Var = (z22) b32Var;
        long j = this.C;
        float f = this.B;
        qa2 qa2Var = this.F;
        int i = 0;
        if (qa2Var == null) {
            Object obj = (View) p40.p(this, r7.f);
            while (!(obj instanceof ViewGroup)) {
                ViewParent parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    c80.n("Couldn't find a valid parent for ", obj, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?");
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
            this.F = qa2Var;
        }
        ArrayList arrayList = qa2Var.i;
        dq1 dq1Var = qa2Var.k;
        LinkedHashMap linkedHashMap = (LinkedHashMap) dq1Var.i;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) dq1Var.i;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) dq1Var.j;
        ra2 ra2Var3 = (ra2) linkedHashMap.get(this);
        if (ra2Var3 == null) {
            ArrayList arrayList2 = qa2Var.j;
            arrayList2.getClass();
            ra2Var3 = (ra2) (arrayList2.isEmpty() ? null : arrayList2.remove(0));
            if (ra2Var3 == null) {
                if (qa2Var.l > eu.L(arrayList)) {
                    ra2Var3 = new ra2(qa2Var.getContext());
                    qa2Var.addView(ra2Var3);
                    arrayList.add(ra2Var3);
                } else {
                    ra2Var3 = (ra2) arrayList.get(qa2Var.l);
                    ua uaVar = (ua) linkedHashMap3.get(ra2Var3);
                    if (uaVar != null) {
                        uaVar.G = null;
                        ci0.M(uaVar);
                        ra2 ra2Var4 = (ra2) linkedHashMap2.get(uaVar);
                        if (ra2Var4 != null) {
                        }
                        linkedHashMap2.remove(uaVar);
                        ra2Var3.c();
                    }
                }
                int i3 = qa2Var.l;
                if (i3 < qa2Var.h - 1) {
                    qa2Var.l = i3 + 1;
                } else {
                    qa2Var.l = 0;
                }
            }
            linkedHashMap2.put(this, ra2Var3);
            linkedHashMap3.put(ra2Var3, this);
        }
        int iQ = gf1.Q(f);
        long jD = this.y.d();
        this.z.a();
        ra2 ra2Var5 = ra2Var3;
        ra2Var5.b(z22Var, this.w, j, iQ, jD, new ta(i, this));
        this.G = ra2Var5;
        ci0.M(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mc0
    public final void P(t61 t61Var) {
        sp spVar = t61Var.h;
        t61Var.a();
        os osVar = this.A;
        if (osVar != null) {
            float f = this.B;
            long jD = this.y.d();
            float fFloatValue = ((Number) ((sc) osVar.c).d()).floatValue();
            if (fFloatValue > 0.0f) {
                long jB = ju.b(fFloatValue, jD);
                if (osVar.a) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (spVar.d() >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (spVar.d() & 4294967295L));
                    b5 b5Var = spVar.i;
                    long jU = b5Var.u();
                    b5Var.q().l();
                    try {
                        ((b5) ((n4) b5Var.i).i).q().f(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                        nc0.O(t61Var, jB, f, 0L, null, 124);
                    } finally {
                        vi0.r(b5Var, jU);
                    }
                } else {
                    nc0.O(t61Var, jB, f, 0L, null, 124);
                }
            }
        }
        qp qpVarQ = spVar.i.q();
        ra2 ra2Var = this.G;
        if (ra2Var != null) {
            long j = this.C;
            int iQ = gf1.Q(this.B);
            long jD2 = this.y.d();
            this.z.a();
            ra2Var.e(iQ, j, jD2);
            ra2Var.draw(g6.a(qpVarQ));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a61, defpackage.qf1
    public final void c(long j) {
        float fA;
        this.D = true;
        e70 e70Var = sp0.c0(this).F;
        this.C = s11.q0(j);
        float f = this.x;
        if (Float.isNaN(f)) {
            long j2 = this.C;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            fA = rs1.c((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)) / 2.0f;
            if (this.w) {
                fA += e70Var.A(10.0f);
            }
        } else {
            fA = e70Var.A(f);
        }
        this.B = fA;
        lk1 lk1Var = this.E;
        Object[] objArr = lk1Var.a;
        int i = lk1Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            M0((b32) objArr[i2]);
        }
        lk1Var.d();
    }
}
