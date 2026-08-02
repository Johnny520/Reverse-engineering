package p000;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ss2 {

    /* JADX INFO: renamed from: a */
    public final in0 f10349a;

    /* JADX INFO: renamed from: b */
    public Object f10350b;

    /* JADX INFO: renamed from: c */
    public gk1 f10351c;

    /* JADX INFO: renamed from: j */
    public boolean f10358j;

    /* JADX INFO: renamed from: k */
    public int f10359k;

    /* JADX INFO: renamed from: d */
    public int f10352d = -1;

    /* JADX INFO: renamed from: e */
    public final rk1 f10353e = qp0.m4260o();

    /* JADX INFO: renamed from: f */
    public final rk1 f10354f = new rk1();

    /* JADX INFO: renamed from: g */
    public final sk1 f10355g = new sk1();

    /* JADX INFO: renamed from: h */
    public final zk1 f10356h = new zk1(new n70[16]);

    /* JADX INFO: renamed from: i */
    public final fo0 f10357i = new fo0(1, this);

    /* JADX INFO: renamed from: l */
    public final rk1 f10360l = qp0.m4260o();

    /* JADX INFO: renamed from: m */
    public final HashMap f10361m = new HashMap();

    public ss2(in0 in0Var) {
        this.f10349a = in0Var;
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX INFO: renamed from: a */
    public final boolean m4996a(java.util.Set r46) {
        /*
            Method dump skipped, instruction units count: 1678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ss2.m4996a(java.util.Set):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4997b(Object obj, int i, Object obj2, gk1 gk1Var) {
        int i2;
        if (this.f10359k > 0) {
            return;
        }
        int iM1932c = gk1Var.m1932c(obj);
        if (iM1932c < 0) {
            iM1932c = ~iM1932c;
            i2 = -1;
        } else {
            i2 = gk1Var.f3554c[iM1932c];
        }
        gk1Var.f3553b[iM1932c] = obj;
        gk1Var.f3554c[iM1932c] = i;
        if ((obj instanceof n70) && i2 != i) {
            m70 m70VarM3254h = ((n70) obj).m3254h();
            this.f10361m.put(obj, m70VarM3254h.f6496f);
            gk1 gk1Var2 = m70VarM3254h.f6495e;
            rk1 rk1Var = this.f10360l;
            qp0.m4238T(rk1Var, obj);
            Object[] objArr = gk1Var2.f3553b;
            long[] jArr = gk1Var2.f3552a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((j & 255) < 128) {
                                pu2 pu2Var = (pu2) objArr[(i3 << 3) + i5];
                                if (pu2Var instanceof qu2) {
                                    ((qu2) pu2Var).m4280f(2);
                                }
                                qp0.m4256k(rk1Var, pu2Var, obj);
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            break;
                        } else if (i3 == length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
        }
        if (i2 == -1) {
            if (obj instanceof qu2) {
                ((qu2) obj).m4280f(2);
            }
            qp0.m4256k(this.f10353e, obj, obj2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4998c(Object obj, Object obj2) {
        rk1 rk1Var = this.f10353e;
        qp0.m4237S(rk1Var, obj2, obj);
        if (!(obj2 instanceof n70) || rk1Var.m4501c(obj2)) {
            return;
        }
        qp0.m4238T(this.f10360l, obj2);
        this.f10361m.remove(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4999d() {
        long[] jArr;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        boolean z;
        long j3;
        rk1 rk1Var = this.f10354f;
        long[] jArr3 = rk1Var.f9618a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j4 = jArr3[i2];
            char c2 = 7;
            long j5 = -9187201950435737472L;
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j4 & 255) < 128) {
                        int i6 = (i2 << 3) + i5;
                        c = c2;
                        Object obj = rk1Var.f9619b[i6];
                        j2 = j5;
                        gk1 gk1Var = (gk1) rk1Var.f9620c[i6];
                        obj.getClass();
                        boolean zMo298B = ((aw1) obj).mo298B();
                        if (!zMo298B) {
                            Object[] objArr = gk1Var.f3553b;
                            int[] iArr = gk1Var.f3554c;
                            long[] jArr4 = gk1Var.f3552a;
                            int i7 = i3;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j = j4;
                                int i8 = 0;
                                while (true) {
                                    long j6 = jArr4[i8];
                                    long[] jArr5 = jArr4;
                                    z = zMo298B;
                                    if ((((~j6) << c) & j6 & j2) != j2) {
                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                        for (int i10 = 0; i10 < i9; i10++) {
                                            if ((j6 & 255) < 128) {
                                                int i11 = (i8 << 3) + i10;
                                                j3 = j6;
                                                Object obj2 = objArr[i11];
                                                int i12 = iArr[i11];
                                                m4998c(obj, obj2);
                                            } else {
                                                j3 = j6;
                                            }
                                            j6 = j3 >> i7;
                                        }
                                        if (i9 != i7) {
                                            break;
                                        }
                                        if (i8 == length2) {
                                            break;
                                        }
                                        i8++;
                                        zMo298B = z;
                                        jArr4 = jArr5;
                                        i7 = 8;
                                    }
                                }
                            } else {
                                jArr2 = jArr3;
                                j = j4;
                                z = zMo298B;
                            }
                            if (!z) {
                                rk1Var.m4510l(i6);
                            }
                            i = 8;
                        }
                    } else {
                        jArr2 = jArr3;
                        j = j4;
                        c = c2;
                        j2 = j5;
                        i = i3;
                    }
                    i5++;
                    i3 = i;
                    j4 = j >> i;
                    c2 = c;
                    j5 = j2;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                if (i4 != i3) {
                    return;
                }
            } else {
                jArr = jArr3;
            }
            if (i2 == length) {
                return;
            }
            i2++;
            jArr3 = jArr;
        }
    }
}
