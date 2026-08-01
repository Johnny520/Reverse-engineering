package p076P;

import p000A.C0072l0;
import p037G2.C0494f;
import p056K2.C0891q;
import p058L.C0927b0;
import p077P0.AbstractC1126m;
import p081Q.AbstractC1159b;
import p091S.AbstractC1236h;
import p091S.AbstractC1237i;
import p091S.AbstractC1239k;
import p095T.AbstractC1385s;
import p095T.C1357e;
import p095T.C1371l;
import p095T.C1383r;
import p095T.C1388t0;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p121Y1.C1753n;
import p153e1.EnumC2017m;
import p169h0.InterfaceC2207p;
import p216p.AbstractC2856m;
import p222q0.InterfaceC2903d;
import p244u.AbstractC3261c;

/* JADX INFO: renamed from: P.P */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1070P {

    /* JADX INFO: renamed from: a */
    public static final float f3336a = 240;

    /* JADX INFO: renamed from: b */
    public static final float f3337b = AbstractC1236h.f4212a;

    /* JADX INFO: renamed from: c */
    public static final float f3338c = 6;

    static {
        int i5 = AbstractC1237i.f4215a;
    }

    /* JADX INFO: renamed from: a */
    public static final void m2129a(final InterfaceC1599a interfaceC1599a, InterfaceC2207p interfaceC2207p, long j5, long j6, int i5, float f2, InterfaceC1601c interfaceC1601c, InterfaceC1373m interfaceC1373m, final int i6) {
        InterfaceC2207p interfaceC2207p2;
        final long j7;
        final long j8;
        final int i7;
        final float f5;
        final InterfaceC1601c interfaceC1601c2;
        final long jM2155c;
        long jM2155c2;
        InterfaceC1601c interfaceC1601c3;
        int i8;
        final int i9;
        final float f6;
        final long j9;
        final InterfaceC1601c interfaceC1601c4;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(-339970038);
        int i10 = i6 | (c1383r.m2586h(interfaceC1599a) ? 4 : 2) | 746624;
        if (c1383r.m2560O(i10 & 1, (599187 & i10) != 599186)) {
            c1383r.m2565T();
            int i11 = i6 & 1;
            C1357e c1357e = C1371l.f4833a;
            if (i11 == 0 || c1383r.m2606y()) {
                int i12 = AbstractC1066L.f3318a;
                jM2155c = AbstractC1105r.m2155c(AbstractC1239k.f4266a, c1383r);
                jM2155c2 = AbstractC1105r.m2155c(AbstractC1239k.f4267b, c1383r);
                final int i13 = AbstractC1066L.f3318a;
                float f7 = AbstractC1066L.f3320c;
                boolean zM2580e = c1383r.m2580e(jM2155c);
                Object objM2558L = c1383r.m2558L();
                if (zM2580e || objM2558L == c1357e) {
                    objM2558L = new InterfaceC1601c() { // from class: P.M
                        @Override // p112W2.InterfaceC1601c
                        /* JADX INFO: renamed from: h */
                        public final Object mo1h(Object obj) {
                            InterfaceC2903d interfaceC2903d = (InterfaceC2903d) obj;
                            float fMin = Math.min(interfaceC2903d.mo268G(AbstractC1066L.f3319b), Float.intBitsToFloat((int) (interfaceC2903d.mo859c() & 4294967295L)));
                            float fMo268G = interfaceC2903d.mo268G(AbstractC1070P.f3338c);
                            float fIntBitsToFloat = (Float.intBitsToFloat((int) (interfaceC2903d.mo859c() & 4294967295L)) - fMin) / 2;
                            float f8 = fIntBitsToFloat > fMo268G ? fMo268G : fIntBitsToFloat;
                            EnumC2017m layoutDirection = interfaceC2903d.getLayoutDirection();
                            EnumC2017m enumC2017m = EnumC2017m.f6743e;
                            long j10 = jM2155c;
                            int i14 = i13;
                            if (layoutDirection == enumC2017m) {
                                long jMo856Y = interfaceC2903d.mo856Y();
                                C0072l0 c0072l0Mo854L = interfaceC2903d.mo854L();
                                long jM110n = c0072l0Mo854L.m110n();
                                c0072l0Mo854L.m106j().mo4852n();
                                try {
                                    ((C1753n) c0072l0Mo854L.f307e).m3113I(-1.0f, 1.0f, jMo856Y);
                                    AbstractC1066L.m2128a(interfaceC2903d, i14, j10, fMin, f8);
                                } finally {
                                    c0072l0Mo854L.m106j().mo4851l();
                                    c0072l0Mo854L.m119y(jM110n);
                                }
                            } else {
                                AbstractC1066L.m2128a(interfaceC2903d, i14, j10, fMin, f8);
                            }
                            return C0891q.f2780a;
                        }
                    };
                    c1383r.m2585g0(objM2558L);
                }
                interfaceC1601c3 = (InterfaceC1601c) objM2558L;
                i8 = i10 & (-3678081);
                i9 = i13;
                f6 = f7;
            } else {
                c1383r.m2563R();
                i8 = i10 & (-3678081);
                jM2155c = j5;
                jM2155c2 = j6;
                i9 = i5;
                f6 = f2;
                interfaceC1601c3 = interfaceC1601c;
            }
            c1383r.m2598q();
            boolean z5 = (i8 & 14) == 4;
            Object objM2558L2 = c1383r.m2558L();
            if (z5 || objM2558L2 == c1357e) {
                objM2558L2 = new C0494f(interfaceC1599a, 3);
                c1383r.m2585g0(objM2558L2);
            }
            final InterfaceC1599a interfaceC1599a2 = (InterfaceC1599a) objM2558L2;
            interfaceC2207p2 = interfaceC2207p;
            InterfaceC2207p interfaceC2207pMo4021c = interfaceC2207p2.mo4021c(AbstractC1159b.f3803c);
            boolean zM2582f = c1383r.m2582f(interfaceC1599a2);
            Object objM2558L3 = c1383r.m2558L();
            if (zM2582f || objM2558L3 == c1357e) {
                objM2558L3 = new C0927b0(interfaceC1599a2, 1);
                c1383r.m2585g0(objM2558L3);
            }
            InterfaceC2207p interfaceC2207pM5534u = AbstractC3261c.m5534u(AbstractC1126m.m2162a(interfaceC2207pMo4021c, true, (InterfaceC1601c) objM2558L3), f3336a, f3337b);
            boolean zM2582f2 = c1383r.m2582f(interfaceC1599a2) | c1383r.m2580e(jM2155c2) | c1383r.m2580e(jM2155c) | c1383r.m2582f(interfaceC1601c3);
            Object objM2558L4 = c1383r.m2558L();
            if (zM2582f2 || objM2558L4 == c1357e) {
                j7 = jM2155c;
                j9 = jM2155c2;
                interfaceC1601c4 = interfaceC1601c3;
                InterfaceC1601c interfaceC1601c5 = new InterfaceC1601c() { // from class: P.N
                    @Override // p112W2.InterfaceC1601c
                    /* JADX INFO: renamed from: h */
                    public final Object mo1h(Object obj) {
                        InterfaceC2903d interfaceC2903d = (InterfaceC2903d) obj;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC2903d.mo859c() & 4294967295L));
                        int i14 = i9;
                        float fMo284u0 = f6;
                        if (i14 != 0 && Float.intBitsToFloat((int) (interfaceC2903d.mo859c() & 4294967295L)) <= Float.intBitsToFloat((int) (interfaceC2903d.mo859c() >> 32))) {
                            fMo284u0 += interfaceC2903d.mo284u0(fIntBitsToFloat);
                        }
                        float fMo284u02 = fMo284u0 / interfaceC2903d.mo284u0(Float.intBitsToFloat((int) (interfaceC2903d.mo859c() >> 32)));
                        float fFloatValue = ((Number) interfaceC1599a2.mo6a()).floatValue();
                        float fMin = Math.min(fFloatValue, fMo284u02) + fFloatValue;
                        if (fMin <= 1.0f) {
                            AbstractC1070P.m2130b(interfaceC2903d, fMin, 1.0f, j9, fIntBitsToFloat, i14);
                        }
                        AbstractC1070P.m2130b(interfaceC2903d, 0.0f, fFloatValue, j7, fIntBitsToFloat, i14);
                        interfaceC1601c4.mo1h(interfaceC2903d);
                        return C0891q.f2780a;
                    }
                };
                c1383r.m2585g0(interfaceC1601c5);
                objM2558L4 = interfaceC1601c5;
            } else {
                j7 = jM2155c;
                j9 = jM2155c2;
                interfaceC1601c4 = interfaceC1601c3;
            }
            AbstractC2856m.m5047a(interfaceC2207pM5534u, (InterfaceC1601c) objM2558L4, c1383r, 0);
            i7 = i9;
            f5 = f6;
            j8 = j9;
            interfaceC1601c2 = interfaceC1601c4;
        } else {
            interfaceC2207p2 = interfaceC2207p;
            c1383r.m2563R();
            j7 = j5;
            j8 = j6;
            i7 = i5;
            f5 = f2;
            interfaceC1601c2 = interfaceC1601c;
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            final InterfaceC2207p interfaceC2207p3 = interfaceC2207p2;
            final long j10 = j7;
            c1388t0M2599r.f4928d = new InterfaceC1603e(interfaceC2207p3, j10, j8, i7, f5, interfaceC1601c2, i6) { // from class: P.O

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ InterfaceC2207p f3330e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ long f3331f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ long f3332g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ int f3333h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ float f3334i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ InterfaceC1601c f3335j;

                @Override // p112W2.InterfaceC1603e
                /* JADX INFO: renamed from: g */
                public final Object mo0g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM2609A = AbstractC1385s.m2609A(49);
                    AbstractC1070P.m2129a(this.f3329d, this.f3330e, this.f3331f, this.f3332g, this.f3333h, this.f3334i, this.f3335j, (InterfaceC1373m) obj, iM2609A);
                    return C0891q.f2780a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m2130b(InterfaceC2903d interfaceC2903d, float f2, float f5, long j5, float f6, int i5) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC2903d.mo859c() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC2903d.mo859c() & 4294967295L));
        float f7 = 2;
        float f8 = fIntBitsToFloat2 / f7;
        boolean z5 = interfaceC2903d.getLayoutDirection() == EnumC2017m.f6742d;
        float f9 = (z5 ? f2 : 1.0f - f5) * fIntBitsToFloat;
        float f10 = (z5 ? f5 : 1.0f - f2) * fIntBitsToFloat;
        if (i5 == 0 || fIntBitsToFloat2 > fIntBitsToFloat) {
            interfaceC2903d.mo855V(j5, (((long) Float.floatToRawIntBits(f9)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L), (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L), f6, (480 & 16) != 0 ? 0 : 0);
            return;
        }
        float f11 = f6 / f7;
        float f12 = fIntBitsToFloat - f11;
        if (f9 < f11) {
            f9 = f11;
        }
        if (f9 > f12) {
            f9 = f12;
        }
        if (f10 < f11) {
            f10 = f11;
        }
        if (f10 <= f12) {
            f12 = f10;
        }
        if (Math.abs(f5 - f2) > 0.0f) {
            interfaceC2903d.mo855V(j5, (((long) Float.floatToRawIntBits(f9)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L), (((long) Float.floatToRawIntBits(f12)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L), f6, (480 & 16) != 0 ? 0 : i5);
        }
    }
}
