package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ar0 extends i93 {
    public float[] b;
    public final ArrayList c = new ArrayList();
    public boolean d = true;
    public long e = ju.g;
    public List f;
    public boolean g;
    public y9 h;
    public in0 i;
    public final v5 j;
    public String k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ar0() {
        int i = s93.a;
        this.f = be0.h;
        this.g = true;
        this.j = new v5(14, this);
        this.k = "";
        this.o = 1.0f;
        this.p = 1.0f;
        this.s = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.i93
    public final void a(nc0 nc0Var) {
        if (this.s) {
            float[] fArrA = this.b;
            if (fArrA == null) {
                fArrA = hf1.a();
                this.b = fArrA;
            } else {
                hf1.d(fArrA);
            }
            hf1.f(fArrA, this.q + this.m, this.r + this.n);
            float f = this.l;
            if (fArrA.length >= 16) {
                double d = ((double) f) * 0.017453292519943295d;
                float fSin = (float) Math.sin(d);
                float fCos = (float) Math.cos(d);
                float f2 = fArrA[0];
                float f3 = fArrA[4];
                float f4 = (fSin * f3) + (fCos * f2);
                float f5 = -fSin;
                float f6 = (f3 * fCos) + (f2 * f5);
                float f7 = fArrA[1];
                float f8 = fArrA[5];
                float f9 = (fSin * f8) + (fCos * f7);
                float f10 = (f8 * fCos) + (f7 * f5);
                float f11 = fArrA[2];
                float f12 = fArrA[6];
                float f13 = (fSin * f12) + (fCos * f11);
                float f14 = (f12 * fCos) + (f11 * f5);
                float f15 = fArrA[3];
                float f16 = fArrA[7];
                float f17 = (fSin * f16) + (fCos * f15);
                fArrA[0] = f4;
                fArrA[1] = f9;
                fArrA[2] = f13;
                fArrA[3] = f17;
                fArrA[4] = f6;
                fArrA[5] = f10;
                fArrA[6] = f14;
                fArrA[7] = (fCos * f16) + (f5 * f15);
            }
            float f18 = this.o;
            float f19 = this.p;
            if (fArrA.length >= 16) {
                fArrA[0] = fArrA[0] * f18;
                fArrA[1] = fArrA[1] * f18;
                fArrA[2] = fArrA[2] * f18;
                fArrA[3] = fArrA[3] * f18;
                fArrA[4] = fArrA[4] * f19;
                fArrA[5] = fArrA[5] * f19;
                fArrA[6] = fArrA[6] * f19;
                fArrA[7] = fArrA[7] * f19;
                fArrA[8] = fArrA[8] * 1.0f;
                fArrA[9] = fArrA[9] * 1.0f;
                fArrA[10] = fArrA[10] * 1.0f;
                fArrA[11] = fArrA[11] * 1.0f;
            }
            hf1.f(fArrA, -this.m, -this.n);
            this.s = false;
        }
        if (this.g) {
            if (!this.f.isEmpty()) {
                y9 y9VarA = this.h;
                if (y9VarA == null) {
                    y9VarA = aa.a();
                    this.h = y9VarA;
                }
                pp0.H(this.f, y9VarA);
            }
            this.g = false;
        }
        b5 b5VarE = nc0Var.E();
        long jU = b5VarE.u();
        b5VarE.q().l();
        try {
            b5 b5Var = (b5) ((n4) b5VarE.i).i;
            float[] fArr = this.b;
            if (fArr != null) {
                b5Var.q().q(fArr);
            }
            y9 y9Var = this.h;
            if (!this.f.isEmpty() && y9Var != null) {
                b5Var.q().s(y9Var);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((i93) arrayList.get(i)).a(nc0Var);
            }
        } finally {
            vi0.r(b5VarE, jU);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.i93
    public final in0 b() {
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.i93
    public final void d(v5 v5Var) {
        this.i = v5Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(int i, i93 i93Var) {
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            arrayList.set(i, i93Var);
        } else {
            arrayList.add(i93Var);
        }
        g(i93Var);
        i93Var.d(this.j);
        c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(long j) {
        if (this.d && j != 16) {
            long j2 = this.e;
            if (j2 == 16) {
                this.e = j;
                return;
            }
            int i = s93.a;
            if (ju.h(j2) == ju.h(j) && ju.g(j2) == ju.g(j) && ju.e(j2) == ju.e(j)) {
                return;
            }
            this.d = false;
            this.e = ju.g;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(i93 i93Var) {
        if (!(i93Var instanceof wx1)) {
            if (i93Var instanceof ar0) {
                ar0 ar0Var = (ar0) i93Var;
                if (ar0Var.d && this.d) {
                    f(ar0Var.e);
                    return;
                } else {
                    this.d = false;
                    this.e = ju.g;
                    return;
                }
            }
            return;
        }
        wx1 wx1Var = (wx1) i93Var;
        an anVar = wx1Var.b;
        if (this.d && anVar != null) {
            if (anVar instanceof ft2) {
                f(((ft2) anVar).a);
            } else {
                this.d = false;
                this.e = ju.g;
            }
        }
        an anVar2 = wx1Var.g;
        if (this.d && anVar2 != null) {
            if (anVar2 instanceof ft2) {
                f(((ft2) anVar2).a);
            } else {
                this.d = false;
                this.e = ju.g;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.k);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            i93 i93Var = (i93) arrayList.get(i);
            sb.append("\t");
            sb.append(i93Var.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
