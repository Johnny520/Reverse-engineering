package p000;

import android.text.Layout;
import java.io.Serializable;

/* JADX INFO: renamed from: pl */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0584pl implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f8380h = 1;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ long f8381i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f8382j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Serializable f8383k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f8384l;

    public /* synthetic */ C0584pl(long j, float[] fArr, a72 a72Var, z62 z62Var) {
        this.f8381i = j;
        this.f8382j = fArr;
        this.f8383k = a72Var;
        this.f8384l = z62Var;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        long j;
        a83 a83Var;
        float[] fArr;
        int i;
        float fM1477a;
        float fM1477a2;
        int i2 = this.f8380h;
        a83 a83Var2 = a83.f116a;
        Object obj2 = this.f8384l;
        Serializable serializable = this.f8383k;
        Object obj3 = this.f8382j;
        switch (i2) {
            case 0:
                o62 o62Var = (o62) obj3;
                o72 o72Var = (o72) serializable;
                long j2 = this.f8381i;
                C0095cl c0095cl = (C0095cl) obj2;
                t61 t61Var = (t61) obj;
                t61Var.m5125a();
                float f = o62Var.f7536a;
                float f2 = o62Var.f7537b;
                C0702sp c0702sp = t61Var.f10581h;
                ((C0485n4) c0702sp.f10257i.f562i).m3235C(f, f2);
                try {
                    nc0.m3269V(t61Var, (C0122d9) o72Var.f7574i, j2, 0L, 0.0f, c0095cl, 0, 890);
                    return a83Var2;
                } finally {
                    ((C0485n4) c0702sp.f10257i.f562i).m3235C(-f, -f2);
                }
            default:
                float[] fArr2 = (float[]) obj3;
                a72 a72Var = (a72) serializable;
                z62 z62Var = (z62) obj2;
                rw1 rw1Var = (rw1) obj;
                int i3 = rw1Var.f9776b;
                C0726t9 c0726t9 = rw1Var.f9775a;
                int iM1496e = rw1Var.f9777c;
                long j3 = this.f8381i;
                int iM1497f = i3 > f13.m1497f(j3) ? rw1Var.f9776b : f13.m1497f(j3);
                if (iM1496e >= f13.m1496e(j3)) {
                    iM1496e = f13.m1496e(j3);
                }
                long jM1636i = fg1.m1636i(rw1Var.m4623d(iM1497f), rw1Var.m4623d(iM1496e));
                int i4 = a72Var.f108h;
                w03 w03Var = c0726t9.f10616d;
                int iM1497f2 = f13.m1497f(jM1636i);
                int iM1496e2 = f13.m1496e(jM1636i);
                Layout layout = w03Var.f12246f;
                int length = layout.getText().length();
                if (iM1497f2 < 0) {
                    lz0.m2988a("startOffset must be > 0");
                }
                if (iM1497f2 >= length) {
                    lz0.m2988a("startOffset must be less than text length");
                }
                if (iM1496e2 <= iM1497f2) {
                    lz0.m2988a("endOffset must be greater than startOffset");
                }
                if (iM1496e2 > length) {
                    lz0.m2988a("endOffset must be smaller or equal to text length");
                }
                if (fArr2.length - i4 < (iM1496e2 - iM1497f2) * 4) {
                    lz0.m2988a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int iM5820g = w03Var.m5820g(iM1497f2);
                int iM5820g2 = w03Var.m5820g(iM1496e2 - 1);
                eu0 eu0Var = new eu0(w03Var);
                if (iM5820g <= iM5820g2) {
                    while (true) {
                        int lineStart = layout.getLineStart(iM5820g);
                        j = jM1636i;
                        int iM5819f = w03Var.m5819f(iM5820g);
                        int iMax = Math.max(iM1497f2, lineStart);
                        int iMin = Math.min(iM1496e2, iM5819f);
                        float fM5821h = w03Var.m5821h(iM5820g);
                        float fM5818e = w03Var.m5818e(iM5820g);
                        a83Var = a83Var2;
                        fArr = fArr2;
                        boolean z = false;
                        boolean z2 = layout.getParagraphDirection(iM5820g) == 1;
                        int i5 = i4;
                        int i6 = iMax;
                        while (i6 < iMin) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(i6);
                            if (!z2 || zIsRtlCharAt) {
                                if (z2 && zIsRtlCharAt) {
                                    z = false;
                                    float fM1477a3 = eu0Var.m1477a(i6, false, false, false);
                                    i = iMin;
                                    fM1477a = eu0Var.m1477a(i6 + 1, true, true, false);
                                    fM1477a2 = fM1477a3;
                                } else {
                                    i = iMin;
                                    z = false;
                                    if (z2 || !zIsRtlCharAt) {
                                        fM1477a = eu0Var.m1477a(i6, false, false, false);
                                        fM1477a2 = eu0Var.m1477a(i6 + 1, true, true, false);
                                    } else {
                                        fM1477a2 = eu0Var.m1477a(i6, false, false, true);
                                        fM1477a = eu0Var.m1477a(i6 + 1, true, true, true);
                                    }
                                }
                                fArr[i5] = fM1477a;
                                fArr[i5 + 1] = fM5821h;
                                fArr[i5 + 2] = fM1477a2;
                                fArr[i5 + 3] = fM5818e;
                                i5 += 4;
                                i6++;
                                iMin = i;
                            } else {
                                fM1477a = eu0Var.m1477a(i6, z, z, true);
                                i = iMin;
                                fM1477a2 = eu0Var.m1477a(i6 + 1, true, true, true);
                            }
                            z = false;
                            fArr[i5] = fM1477a;
                            fArr[i5 + 1] = fM5821h;
                            fArr[i5 + 2] = fM1477a2;
                            fArr[i5 + 3] = fM5818e;
                            i5 += 4;
                            i6++;
                            iMin = i;
                        }
                        if (iM5820g != iM5820g2) {
                            iM5820g++;
                            jM1636i = j;
                            i4 = i5;
                            a83Var2 = a83Var;
                            fArr2 = fArr;
                        }
                    }
                } else {
                    j = jM1636i;
                    a83Var = a83Var2;
                    fArr = fArr2;
                }
                int iM1495d = (f13.m1495d(j) * 4) + a72Var.f108h;
                for (int i7 = a72Var.f108h; i7 < iM1495d; i7 += 4) {
                    int i8 = i7 + 1;
                    float f3 = fArr[i8];
                    float f4 = z62Var.f13745h;
                    fArr[i8] = f3 + f4;
                    int i9 = i7 + 3;
                    fArr[i9] = fArr[i9] + f4;
                }
                a72Var.f108h = iM1495d;
                z62Var.f13745h = c0726t9.m5136b() + z62Var.f13745h;
                return a83Var;
        }
    }

    public /* synthetic */ C0584pl(o62 o62Var, o72 o72Var, long j, C0095cl c0095cl) {
        this.f8382j = o62Var;
        this.f8383k = o72Var;
        this.f8381i = j;
        this.f8384l = c0095cl;
    }
}
