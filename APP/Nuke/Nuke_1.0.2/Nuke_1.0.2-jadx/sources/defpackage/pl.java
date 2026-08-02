package defpackage;

import android.text.Layout;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pl implements in0 {
    public final /* synthetic */ int h = 1;
    public final /* synthetic */ long i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Serializable k;
    public final /* synthetic */ Object l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ pl(long j, float[] fArr, a72 a72Var, z62 z62Var) {
        this.i = j;
        this.j = fArr;
        this.k = a72Var;
        this.l = z62Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        long j;
        a83 a83Var;
        float[] fArr;
        int i;
        float fA;
        float fA2;
        int i2 = this.h;
        a83 a83Var2 = a83.a;
        Object obj2 = this.l;
        Serializable serializable = this.k;
        Object obj3 = this.j;
        switch (i2) {
            case 0:
                o62 o62Var = (o62) obj3;
                o72 o72Var = (o72) serializable;
                long j2 = this.i;
                cl clVar = (cl) obj2;
                t61 t61Var = (t61) obj;
                t61Var.a();
                float f = o62Var.a;
                float f2 = o62Var.b;
                sp spVar = t61Var.h;
                ((n4) spVar.i.i).C(f, f2);
                try {
                    nc0.V(t61Var, (d9) o72Var.i, j2, 0L, 0.0f, clVar, 0, 890);
                    return a83Var2;
                } finally {
                    ((n4) spVar.i.i).C(-f, -f2);
                }
            default:
                float[] fArr2 = (float[]) obj3;
                a72 a72Var = (a72) serializable;
                z62 z62Var = (z62) obj2;
                rw1 rw1Var = (rw1) obj;
                int i3 = rw1Var.b;
                t9 t9Var = rw1Var.a;
                int iE = rw1Var.c;
                long j3 = this.i;
                int iF = i3 > f13.f(j3) ? rw1Var.b : f13.f(j3);
                if (iE >= f13.e(j3)) {
                    iE = f13.e(j3);
                }
                long jI = fg1.i(rw1Var.d(iF), rw1Var.d(iE));
                int i4 = a72Var.h;
                w03 w03Var = t9Var.d;
                int iF2 = f13.f(jI);
                int iE2 = f13.e(jI);
                Layout layout = w03Var.f;
                int length = layout.getText().length();
                if (iF2 < 0) {
                    lz0.a("startOffset must be > 0");
                }
                if (iF2 >= length) {
                    lz0.a("startOffset must be less than text length");
                }
                if (iE2 <= iF2) {
                    lz0.a("endOffset must be greater than startOffset");
                }
                if (iE2 > length) {
                    lz0.a("endOffset must be smaller or equal to text length");
                }
                if (fArr2.length - i4 < (iE2 - iF2) * 4) {
                    lz0.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int iG = w03Var.g(iF2);
                int iG2 = w03Var.g(iE2 - 1);
                eu0 eu0Var = new eu0(w03Var);
                if (iG <= iG2) {
                    while (true) {
                        int lineStart = layout.getLineStart(iG);
                        j = jI;
                        int iF3 = w03Var.f(iG);
                        int iMax = Math.max(iF2, lineStart);
                        int iMin = Math.min(iE2, iF3);
                        float fH = w03Var.h(iG);
                        float fE = w03Var.e(iG);
                        a83Var = a83Var2;
                        fArr = fArr2;
                        boolean z = false;
                        boolean z2 = layout.getParagraphDirection(iG) == 1;
                        int i5 = i4;
                        int i6 = iMax;
                        while (i6 < iMin) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(i6);
                            if (!z2 || zIsRtlCharAt) {
                                if (z2 && zIsRtlCharAt) {
                                    z = false;
                                    float fA3 = eu0Var.a(i6, false, false, false);
                                    i = iMin;
                                    fA = eu0Var.a(i6 + 1, true, true, false);
                                    fA2 = fA3;
                                } else {
                                    i = iMin;
                                    z = false;
                                    if (z2 || !zIsRtlCharAt) {
                                        fA = eu0Var.a(i6, false, false, false);
                                        fA2 = eu0Var.a(i6 + 1, true, true, false);
                                    } else {
                                        fA2 = eu0Var.a(i6, false, false, true);
                                        fA = eu0Var.a(i6 + 1, true, true, true);
                                    }
                                }
                                fArr[i5] = fA;
                                fArr[i5 + 1] = fH;
                                fArr[i5 + 2] = fA2;
                                fArr[i5 + 3] = fE;
                                i5 += 4;
                                i6++;
                                iMin = i;
                            } else {
                                fA = eu0Var.a(i6, z, z, true);
                                i = iMin;
                                fA2 = eu0Var.a(i6 + 1, true, true, true);
                            }
                            z = false;
                            fArr[i5] = fA;
                            fArr[i5 + 1] = fH;
                            fArr[i5 + 2] = fA2;
                            fArr[i5 + 3] = fE;
                            i5 += 4;
                            i6++;
                            iMin = i;
                        }
                        if (iG != iG2) {
                            iG++;
                            jI = j;
                            i4 = i5;
                            a83Var2 = a83Var;
                            fArr2 = fArr;
                        }
                    }
                } else {
                    j = jI;
                    a83Var = a83Var2;
                    fArr = fArr2;
                }
                int iD = (f13.d(j) * 4) + a72Var.h;
                for (int i7 = a72Var.h; i7 < iD; i7 += 4) {
                    int i8 = i7 + 1;
                    float f3 = fArr[i8];
                    float f4 = z62Var.h;
                    fArr[i8] = f3 + f4;
                    int i9 = i7 + 3;
                    fArr[i9] = fArr[i9] + f4;
                }
                a72Var.h = iD;
                z62Var.h = t9Var.b() + z62Var.h;
                return a83Var;
        }
    }

    public /* synthetic */ pl(o62 o62Var, o72 o72Var, long j, cl clVar) {
        this.j = o62Var;
        this.k = o72Var;
        this.i = j;
        this.l = clVar;
    }
}
