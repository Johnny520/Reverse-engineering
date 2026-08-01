package p349y0;

import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1064u0;
import p080f9.AbstractC2368o;
import p080f9.C2363j;
import p117i.AbstractC3094x0;
import p117i.C3076o0;
import p117i.C3082r0;
import p185m8.AbstractC5102r;

/* JADX INFO: renamed from: y0.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9507b {

    /* JADX INFO: renamed from: a */
    public final C3082r0 f32297a;

    public /* synthetic */ C9507b(C3082r0 c3082r0) {
        this.f32297a = c3082r0;
    }

    /* JADX INFO: renamed from: a */
    public static final void m37012a(C3082r0 c3082r0, Object obj, Object obj2) {
        int iM11519n = c3082r0.m11519n(obj);
        boolean z10 = iM11519n < 0;
        Object obj3 = z10 ? null : c3082r0.f8072c[iM11519n];
        AbstractC1064u0.m3866n(obj3);
        if (obj3 != null) {
            if (obj3 instanceof C3076o0) {
                C3076o0 c3076o0 = (C3076o0) obj3;
                c3076o0.m11461n(obj2);
                obj2 = c3076o0;
            } else {
                obj2 = AbstractC3094x0.m11606h(obj3, obj2);
            }
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
    public static final /* synthetic */ C9507b m37013b(C3082r0 c3082r0) {
        return new C9507b(c3082r0);
    }

    /* JADX INFO: renamed from: c */
    public static final void m37014c(C3082r0 c3082r0) {
        c3082r0.m11516k();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C3082r0 m37016e(C3082r0 c3082r0, int i10, AbstractC1043k abstractC1043k) {
        if ((i10 & 1) != 0) {
            c3082r0 = new C3082r0(0, 1, null);
        }
        return m37015d(c3082r0);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m37017f(C3082r0 c3082r0, Object obj) {
        return c3082r0.m11235b(obj);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m37018g(C3082r0 c3082r0, Object obj) {
        return (obj instanceof C9507b) && AbstractC1061t.m3842c(c3082r0, ((C9507b) obj).m37027o());
    }

    /* JADX INFO: renamed from: h */
    public static int m37019h(C3082r0 c3082r0) {
        return c3082r0.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m37020i(C3082r0 c3082r0) {
        return c3082r0.m11241h();
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m37021j(C3082r0 c3082r0) {
        return c3082r0.m11242i();
    }

    /* JADX INFO: renamed from: k */
    public static final Object m37022k(C3082r0 c3082r0, Object obj) {
        Object objM11238e = c3082r0.m11238e(obj);
        if (objM11238e == null) {
            return null;
        }
        if (!(objM11238e instanceof C3076o0)) {
            c3082r0.m11526u(obj);
            return objM11238e;
        }
        C3076o0 c3076o0 = (C3076o0) objM11238e;
        Object objM11454B = c3076o0.m11454B(0);
        if (c3076o0.m11589g()) {
            c3082r0.m11526u(obj);
        }
        if (c3076o0.m11587e() == 1) {
            c3082r0.m11529x(obj, c3076o0.m11585c());
        }
        return objM11454B;
    }

    /* JADX INFO: renamed from: l */
    public static final Object m37023l(C3082r0 c3082r0, Object obj) {
        Object objM11238e = c3082r0.m11238e(obj);
        if (objM11238e == null) {
            return null;
        }
        if (!(objM11238e instanceof C3076o0)) {
            c3082r0.m11526u(obj);
            return objM11238e;
        }
        C3076o0 c3076o0 = (C3076o0) objM11238e;
        Object objM37011a = AbstractC9506a.m37011a(c3076o0);
        objM37011a.getClass();
        if (c3076o0.m11589g()) {
            c3082r0.m11526u(obj);
        }
        if (c3076o0.m11587e() == 1) {
            c3082r0.m11529x(obj, c3076o0.m11585c());
        }
        return objM37011a;
    }

    /* JADX INFO: renamed from: m */
    public static final void m37024m(C3082r0 c3082r0, Object obj, InterfaceC0184l interfaceC0184l) {
        Object objM11238e = c3082r0.m11238e(obj);
        if (objM11238e != null) {
            if (!(objM11238e instanceof C3076o0)) {
                if (((Boolean) interfaceC0184l.mo27m(objM11238e)).booleanValue()) {
                    c3082r0.m11526u(obj);
                    return;
                }
                return;
            }
            C3076o0 c3076o0 = (C3076o0) objM11238e;
            int i10 = c3076o0.f8236b;
            Object[] objArr = c3076o0.f8235a;
            int i11 = 0;
            C2363j c2363jM8592s = AbstractC2368o.m8592s(0, i10);
            int iM8560o = c2363jM8592s.m8560o();
            int iM8561p = c2363jM8592s.m8561p();
            if (iM8560o <= iM8561p) {
                while (true) {
                    objArr[iM8560o - i11] = objArr[iM8560o];
                    if (((Boolean) interfaceC0184l.mo27m(objArr[iM8560o])).booleanValue()) {
                        i11++;
                    }
                    if (iM8560o == iM8561p) {
                        break;
                    } else {
                        iM8560o++;
                    }
                }
            }
            AbstractC5102r.m20672x(objArr, null, i10 - i11, i10);
            c3076o0.f8236b -= i11;
            if (c3076o0.m11589g()) {
                c3082r0.m11526u(obj);
            }
            if (c3076o0.m11587e() == 0) {
                c3082r0.m11529x(obj, c3076o0.m11585c());
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static String m37025n(C3082r0 c3082r0) {
        return "MultiValueMap(map=" + c3082r0 + ')';
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p117i.AbstractC3092w0 m37026p(p117i.C3082r0 r14) {
        /*
            boolean r0 = r14.m11241h()
            if (r0 == 0) goto Lb
            i.w0 r14 = p117i.AbstractC3094x0.m11604f()
            return r14
        Lb:
            i.o0 r0 = new i.o0
            r1 = 0
            r2 = 0
            r3 = 1
            r0.<init>(r2, r3, r1)
            java.lang.Object[] r1 = r14.f8072c
            long[] r14 = r14.f8070a
            int r3 = r14.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L62
            r4 = r2
        L1d:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L5d
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r2
        L37:
            if (r9 >= r7) goto L5b
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L57
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            boolean r11 = r10 instanceof p117i.C3076o0
            if (r11 == 0) goto L51
            i.o0 r10 = (p117i.C3076o0) r10
            r0.m11463p(r10)
            goto L57
        L51:
            r10.getClass()
            r0.m11461n(r10)
        L57:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L37
        L5b:
            if (r7 != r8) goto L62
        L5d:
            if (r4 == r3) goto L62
            int r4 = r4 + 1
            goto L1d
        L62:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p349y0.C9507b.m37026p(i.r0):i.w0");
    }

    public boolean equals(Object obj) {
        return m37018g(this.f32297a, obj);
    }

    public int hashCode() {
        return m37019h(this.f32297a);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ C3082r0 m37027o() {
        return this.f32297a;
    }

    public String toString() {
        return m37025n(this.f32297a);
    }

    /* JADX INFO: renamed from: d */
    public static C3082r0 m37015d(C3082r0 c3082r0) {
        return c3082r0;
    }
}
