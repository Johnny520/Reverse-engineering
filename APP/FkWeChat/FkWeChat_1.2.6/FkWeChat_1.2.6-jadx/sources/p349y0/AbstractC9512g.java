package p349y0;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p117i.AbstractC3044c1;
import p117i.C3082r0;
import p117i.C3084s0;

/* JADX INFO: renamed from: y0.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9512g {
    /* JADX INFO: renamed from: a */
    public static final void m37067a(C3082r0 c3082r0, Object obj, Object obj2) {
        int iM11519n = c3082r0.m11519n(obj);
        boolean z10 = iM11519n < 0;
        Object obj3 = z10 ? null : c3082r0.f8072c[iM11519n];
        if (obj3 != null) {
            if (obj3 instanceof C3084s0) {
                ((C3084s0) obj3).m11536h(obj2);
            } else if (obj3 != obj2) {
                C3084s0 c3084s0 = new C3084s0(0, 1, null);
                c3084s0.m11536h(obj3);
                c3084s0.m11536h(obj2);
                obj2 = c3084s0;
            }
            obj2 = obj3;
        }
        if (!z10) {
            c3082r0.f8072c[iM11519n] = obj2;
            return;
        }
        int i10 = ~iM11519n;
        c3082r0.f8071b[i10] = obj;
        c3082r0.f8072c[i10] = obj2;
    }

    /* JADX INFO: renamed from: b */
    public static final void m37068b(C3082r0 c3082r0) {
        c3082r0.m11516k();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C3082r0 m37070d(C3082r0 c3082r0, int i10, AbstractC1043k abstractC1043k) {
        if ((i10 & 1) != 0) {
            c3082r0 = AbstractC3044c1.m11262b();
        }
        return m37069c(c3082r0);
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m37071e(C3082r0 c3082r0, Object obj) {
        return c3082r0.m11236c(obj);
    }

    /* JADX INFO: renamed from: f */
    public static final int m37072f(C3082r0 c3082r0) {
        return c3082r0.m11240g();
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m37073g(C3082r0 c3082r0, Object obj, Object obj2) {
        Object objM11238e = c3082r0.m11238e(obj);
        if (objM11238e == null) {
            return false;
        }
        if (!(objM11238e instanceof C3084s0)) {
            if (!AbstractC1061t.m3842c(objM11238e, obj2)) {
                return false;
            }
            c3082r0.m11526u(obj);
            return true;
        }
        C3084s0 c3084s0 = (C3084s0) objM11238e;
        boolean zM11553y = c3084s0.m11553y(obj2);
        if (zM11553y && c3084s0.m11271d()) {
            c3082r0.m11526u(obj);
        }
        return zM11553y;
    }

    /* JADX INFO: renamed from: h */
    public static final void m37074h(C3082r0 c3082r0, Object obj) {
        boolean zM11271d;
        long[] jArr = c3082r0.f8070a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj2 = c3082r0.f8071b[i13];
                        Object obj3 = c3082r0.f8072c[i13];
                        if (obj3 instanceof C3084s0) {
                            C3084s0 c3084s0 = (C3084s0) obj3;
                            c3084s0.m11553y(obj);
                            zM11271d = c3084s0.m11271d();
                        } else {
                            zM11271d = obj3 == obj;
                        }
                        if (zM11271d) {
                            c3082r0.m11527v(i13);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m37075i(C3082r0 c3082r0, Object obj, Object obj2) {
        c3082r0.m11529x(obj, obj2);
    }

    /* JADX INFO: renamed from: c */
    public static C3082r0 m37069c(C3082r0 c3082r0) {
        return c3082r0;
    }
}
