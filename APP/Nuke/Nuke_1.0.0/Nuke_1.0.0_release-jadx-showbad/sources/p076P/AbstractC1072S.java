package p076P;

import android.R;
import android.content.Context;
import p000A.C0000A;
import p000A.C0071l;
import p056K2.C0891q;
import p071O.C1023b;
import p077P0.AbstractC1126m;
import p086R.AbstractC1188b;
import p086R.C1187a;
import p086R.C1189c;
import p091S.AbstractC1230b;
import p091S.AbstractC1234f;
import p091S.AbstractC1239k;
import p091S.EnumC1233e;
import p095T.AbstractC1385s;
import p095T.C1305C;
import p095T.C1357e;
import p095T.C1371l;
import p095T.C1383r;
import p095T.C1386s0;
import p095T.C1388t0;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p136b0.AbstractC1848j;
import p136b0.C1843e;
import p153e1.C2010f;
import p169h0.C2204m;
import p169h0.InterfaceC2207p;
import p176i1.C2307w;
import p211o0.AbstractC2767z;
import p211o0.C2762u;
import p211o0.InterfaceC2738M;
import p216p.AbstractC2856m;
import p222q0.InterfaceC2903d;
import p232s.C3162i;
import p244u.AbstractC3261c;
import p244u.C3251U;

/* JADX INFO: renamed from: P.S */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1072S {

    /* JADX INFO: renamed from: a */
    public static final C1023b f3340a = new C1023b();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m2131a(final InterfaceC1599a interfaceC1599a, final C1843e c1843e, InterfaceC2207p interfaceC2207p, final InterfaceC1603e interfaceC1603e, final InterfaceC1603e interfaceC1603e2, InterfaceC2738M interfaceC2738M, long j5, long j6, long j7, long j8, float f2, C2307w c2307w, InterfaceC1373m interfaceC1373m, final int i5) {
        int i6;
        final InterfaceC2207p interfaceC2207p2;
        final InterfaceC2738M interfaceC2738M2;
        final long j9;
        final long j10;
        final long j11;
        final float f5;
        final C2307w c2307w2;
        final long j12;
        int i7;
        long j13;
        long j14;
        long j15;
        long j16;
        C2307w c2307w3;
        float f6;
        InterfaceC2738M interfaceC2738M3;
        InterfaceC2207p interfaceC2207p3;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(94478519);
        if ((i5 & 6) == 0) {
            i6 = i5 | (c1383r.m2586h(interfaceC1599a) ? 4 : 2);
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= c1383r.m2586h(c1843e) ? 32 : 16;
        }
        int i8 = i6 | 28032;
        if ((i5 & 196608) == 0) {
            i8 |= c1383r.m2586h(interfaceC1603e) ? 131072 : 65536;
        }
        if ((i5 & 1572864) == 0) {
            i8 |= c1383r.m2586h(interfaceC1603e2) ? 1048576 : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i8 |= 4194304;
        }
        if ((i5 & 100663296) == 0) {
            i8 |= 33554432;
        }
        if ((i5 & 805306368) == 0) {
            i8 |= 268435456;
        }
        if (c1383r.m2560O(i8 & 1, (306783379 & i8) != 306783378)) {
            c1383r.m2565T();
            if ((i5 & 1) == 0 || c1383r.m2606y()) {
                float f7 = AbstractC1080a.f3365a;
                InterfaceC2738M interfaceC2738MM2140a = AbstractC1078Y.m2140a(AbstractC1234f.f4205d, c1383r);
                long jM2155c = AbstractC1105r.m2155c(AbstractC1234f.f4204c, c1383r);
                long jM2155c2 = AbstractC1105r.m2155c(AbstractC1234f.f4210i, c1383r);
                i7 = i8 & (-2143289345);
                long jM2155c3 = AbstractC1105r.m2155c(AbstractC1234f.f4206e, c1383r);
                long jM2155c4 = AbstractC1105r.m2155c(AbstractC1234f.f4208g, c1383r);
                float f8 = AbstractC1080a.f3365a;
                j13 = jM2155c;
                j14 = jM2155c2;
                j15 = jM2155c3;
                j16 = jM2155c4;
                c2307w3 = new C2307w();
                f6 = f8;
                interfaceC2738M3 = interfaceC2738MM2140a;
                interfaceC2207p3 = C2204m.f7185a;
            } else {
                c1383r.m2563R();
                i7 = i8 & (-2143289345);
                interfaceC2207p3 = interfaceC2207p;
                interfaceC2738M3 = interfaceC2738M;
                j13 = j5;
                j14 = j6;
                j15 = j7;
                j16 = j8;
                f6 = f2;
                c2307w3 = c2307w;
            }
            c1383r.m2598q();
            AbstractC1096i.m2151c(interfaceC1599a, c1843e, interfaceC2207p3, interfaceC1603e, interfaceC1603e2, interfaceC2738M3, j13, j14, j15, j16, f6, c2307w3, c1383r, i7 & 2147483646, 3456);
            f5 = f6;
            c2307w2 = c2307w3;
            c1383r = c1383r;
            j12 = j16;
            j11 = j15;
            j10 = j14;
            interfaceC2738M2 = interfaceC2738M3;
            j9 = j13;
            interfaceC2207p2 = interfaceC2207p3;
        } else {
            c1383r.m2563R();
            interfaceC2207p2 = interfaceC2207p;
            interfaceC2738M2 = interfaceC2738M;
            j9 = j5;
            j10 = j6;
            j11 = j7;
            f5 = f2;
            c2307w2 = c2307w;
            j12 = j8;
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new InterfaceC1603e() { // from class: P.j
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p112W2.InterfaceC1603e
                /* JADX INFO: renamed from: g */
                public final Object mo0g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM2609A = AbstractC1385s.m2609A(i5 | 1);
                    AbstractC1072S.m2131a(interfaceC1599a, c1843e, interfaceC2207p2, interfaceC1603e, interfaceC1603e2, interfaceC2738M2, j9, j10, j11, j12, f5, c2307w2, (InterfaceC1373m) obj, iM2609A);
                    return C0891q.f2780a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m2132b(InterfaceC1599a interfaceC1599a, InterfaceC2207p interfaceC2207p, boolean z5, InterfaceC2738M interfaceC2738M, C1098k c1098k, AbstractC1072S abstractC1072S, C3251U c3251u, C1843e c1843e, InterfaceC1373m interfaceC1373m, int i5) {
        int i6;
        InterfaceC2738M interfaceC2738M2;
        C1383r c1383r;
        boolean z6;
        C1383r c1383r2 = (C1383r) interfaceC1373m;
        c1383r2.m2569X(-1310015664);
        if ((i5 & 6) == 0) {
            i6 = i5 | (c1383r2.m2586h(interfaceC1599a) ? 4 : 2);
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= c1383r2.m2582f(interfaceC2207p) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= c1383r2.m2584g(z5) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            interfaceC2738M2 = interfaceC2738M;
            i6 |= c1383r2.m2582f(interfaceC2738M2) ? 2048 : 1024;
        } else {
            interfaceC2738M2 = interfaceC2738M;
        }
        if ((i5 & 24576) == 0) {
            i6 |= c1383r2.m2582f(c1098k) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            i6 |= c1383r2.m2582f(abstractC1072S) ? 131072 : 65536;
        }
        if ((1572864 & i5) == 0) {
            i6 |= c1383r2.m2582f(null) ? 1048576 : 524288;
        }
        if ((12582912 & i5) == 0) {
            i6 |= c1383r2.m2582f(c3251u) ? 8388608 : 4194304;
        }
        if ((100663296 & i5) == 0) {
            i6 |= c1383r2.m2582f(null) ? 67108864 : 33554432;
        }
        if ((805306368 & i5) == 0) {
            i6 |= c1383r2.m2586h(c1843e) ? 536870912 : 268435456;
        }
        if (c1383r2.m2560O(i6 & 1, (306783379 & i6) != 306783378)) {
            c1383r2.m2565T();
            if ((i5 & 1) != 0 && !c1383r2.m2606y()) {
                c1383r2.m2563R();
            }
            c1383r2.m2598q();
            c1383r2.m2568W(1691738187);
            Object objM2558L = c1383r2.m2558L();
            C1357e c1357e = C1371l.f4833a;
            if (objM2558L == c1357e) {
                objM2558L = new C3162i();
                c1383r2.m2585g0(objM2558L);
            }
            C3162i c3162i = (C3162i) objM2558L;
            c1383r2.m2597p(false);
            long j5 = z5 ? c1098k.f3538a : c1098k.f3540c;
            long j6 = z5 ? c1098k.f3539b : c1098k.f3541d;
            c1383r2.m2568W(1691921830);
            c1383r2.m2597p(false);
            long j7 = j5;
            float f2 = 0;
            Object objM2558L2 = c1383r2.m2558L();
            if (objM2558L2 == c1357e) {
                objM2558L2 = new C0071l(27);
                c1383r2.m2585g0(objM2558L2);
            }
            InterfaceC2207p interfaceC2207pM2162a = AbstractC1126m.m2162a(interfaceC2207p, false, (InterfaceC1601c) objM2558L2);
            C1843e c1843eM3314c = AbstractC1848j.m3314c(-535639973, new C1103p(j6, c3251u, c1843e), c1383r2);
            C1305C c1305c = AbstractC1085c0.f3406a;
            float f5 = 0;
            if (c3162i == null) {
                c1383r2.m2568W(-1701037204);
                Object objM2558L3 = c1383r2.m2558L();
                if (objM2558L3 == c1357e) {
                    objM2558L3 = new C3162i();
                    c1383r2.m2585g0(objM2558L3);
                }
                c3162i = (C3162i) objM2558L3;
                z6 = false;
            } else {
                z6 = false;
                c1383r2.m2568W(2023337163);
            }
            c1383r2.m2597p(z6);
            C1305C c1305c2 = AbstractC1085c0.f3406a;
            float f6 = ((C2010f) c1383r2.m2590j(c1305c2)).f6732d + f5;
            c1383r = c1383r2;
            AbstractC1385s.m2612b(new C1386s0[]{AbstractC1107t.f3615a.mo2399a(new C2762u(j6)), c1305c2.mo2399a(new C2010f(f6))}, AbstractC1848j.m3314c(849208527, new C1083b0(interfaceC2207pM2162a, interfaceC2738M2, j7, f6, c3162i, z5, interfaceC1599a, f2, c1843eM3314c), c1383r), c1383r, 56);
        } else {
            c1383r = c1383r2;
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0000A(interfaceC1599a, interfaceC2207p, z5, interfaceC2738M, c1098k, abstractC1072S, c3251u, c1843e, i5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0084  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2133c(InterfaceC2207p interfaceC2207p, final float f2, final long j5, InterfaceC1373m interfaceC1373m, final int i5, final int i6) {
        int i7;
        final InterfaceC2207p interfaceC2207p2;
        Object objM2558L;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(75144485);
        int i8 = i6 & 1;
        if (i8 != 0) {
            i7 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            i7 = i5 | (c1383r.m2582f(interfaceC2207p) ? 4 : 2);
        } else {
            i7 = i5;
        }
        int i9 = i7 | (c1383r.m2580e(j5) ? 256 : 128);
        boolean z5 = true;
        if (c1383r.m2560O(i9 & 1, (i9 & 147) != 146)) {
            c1383r.m2565T();
            if ((i5 & 1) == 0 || c1383r.m2606y()) {
                if (i8 != 0) {
                    interfaceC2207p2 = C2204m.f7185a;
                }
                c1383r.m2598q();
                InterfaceC2207p interfaceC2207pM5521h = AbstractC3261c.m5521h(interfaceC2207p2.mo4021c(AbstractC3261c.f10087c), f2);
                if ((((i9 & 896) ^ 384) > 256 || !c1383r.m2580e(j5)) && (i9 & 384) != 256) {
                    z5 = false;
                }
                objM2558L = c1383r.m2558L();
                if (z5 || objM2558L == C1371l.f4833a) {
                    objM2558L = new InterfaceC1601c() { // from class: P.y
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p112W2.InterfaceC1601c
                        /* JADX INFO: renamed from: h */
                        public final Object mo1h(Object obj) {
                            InterfaceC2903d interfaceC2903d = (InterfaceC2903d) obj;
                            float f5 = f2;
                            float fMo268G = interfaceC2903d.mo268G(f5);
                            float f6 = 2;
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(interfaceC2903d.mo268G(f5) / f6)) & 4294967295L);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC2903d.mo859c() >> 32));
                            interfaceC2903d.mo855V(j5, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(interfaceC2903d.mo268G(f5) / f6)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), fMo268G, (480 & 16) != 0 ? 0 : 0);
                            return C0891q.f2780a;
                        }
                    };
                    c1383r.m2585g0(objM2558L);
                }
                AbstractC2856m.m5047a(interfaceC2207pM5521h, (InterfaceC1601c) objM2558L, c1383r, 0);
            } else {
                c1383r.m2563R();
            }
            interfaceC2207p2 = interfaceC2207p;
            c1383r.m2598q();
            InterfaceC2207p interfaceC2207pM5521h2 = AbstractC3261c.m5521h(interfaceC2207p2.mo4021c(AbstractC3261c.f10087c), f2);
            if (((i9 & 896) ^ 384) > 256) {
                z5 = false;
                objM2558L = c1383r.m2558L();
                if (z5) {
                    objM2558L = new InterfaceC1601c() { // from class: P.y
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p112W2.InterfaceC1601c
                        /* JADX INFO: renamed from: h */
                        public final Object mo1h(Object obj) {
                            InterfaceC2903d interfaceC2903d = (InterfaceC2903d) obj;
                            float f5 = f2;
                            float fMo268G = interfaceC2903d.mo268G(f5);
                            float f6 = 2;
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(interfaceC2903d.mo268G(f5) / f6)) & 4294967295L);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC2903d.mo859c() >> 32));
                            interfaceC2903d.mo855V(j5, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(interfaceC2903d.mo268G(f5) / f6)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), fMo268G, (480 & 16) != 0 ? 0 : 0);
                            return C0891q.f2780a;
                        }
                    };
                    c1383r.m2585g0(objM2558L);
                    AbstractC2856m.m5047a(interfaceC2207pM5521h2, (InterfaceC1601c) objM2558L, c1383r, 0);
                }
            } else {
                z5 = false;
                objM2558L = c1383r.m2558L();
                if (z5) {
                }
            }
        } else {
            c1383r.m2563R();
            interfaceC2207p2 = interfaceC2207p;
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new InterfaceC1603e() { // from class: P.z
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p112W2.InterfaceC1603e
                /* JADX INFO: renamed from: g */
                public final Object mo0g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC1072S.m2133c(interfaceC2207p2, f2, j5, (InterfaceC1373m) obj, AbstractC1385s.m2609A(i5 | 1), i6);
                    return C0891q.f2780a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final void m2134d(final InterfaceC1599a interfaceC1599a, InterfaceC2207p interfaceC2207p, boolean z5, InterfaceC2738M interfaceC2738M, C1098k c1098k, C3251U c3251u, final C1843e c1843e, InterfaceC1373m interfaceC1373m, final int i5) {
        final InterfaceC2207p interfaceC2207p2;
        final boolean z6;
        final InterfaceC2738M interfaceC2738M2;
        final C1098k c1098k2;
        final C3251U c3251u2;
        C1098k c1098k3;
        int i6;
        C3251U c3251u3;
        boolean z7;
        InterfaceC2738M interfaceC2738M3;
        InterfaceC2207p interfaceC2207p3;
        C1098k c1098k4;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(-1061374109);
        int i7 = i5 | (c1383r.m2586h(interfaceC1599a) ? 4 : 2) | 115025328;
        if (c1383r.m2560O(i7 & 1, (306783379 & i7) != 306783378)) {
            c1383r.m2565T();
            if ((i5 & 1) == 0 || c1383r.m2606y()) {
                C3251U c3251u4 = AbstractC1099l.f3542a;
                InterfaceC2738M interfaceC2738MM2140a = AbstractC1078Y.m2140a(AbstractC1230b.f4103b, c1383r);
                C1104q c1104q = (C1104q) c1383r.m2590j(AbstractC1105r.f3612a);
                C1098k c1098k5 = c1104q.f3585W;
                if (c1098k5 == null) {
                    long j5 = C2762u.f8761f;
                    c1098k3 = new C1098k(j5, AbstractC1105r.m2154b(c1104q, EnumC1233e.f4197f), j5, C2762u.m4920b(AbstractC1239k.f4269d, AbstractC1105r.m2154b(c1104q, AbstractC1239k.f4268c)));
                    c1104q.f3585W = c1098k3;
                } else {
                    c1098k3 = c1098k5;
                }
                i6 = i7 & (-64513);
                c3251u3 = AbstractC1099l.f3542a;
                z7 = true;
                interfaceC2738M3 = interfaceC2738MM2140a;
                interfaceC2207p3 = C2204m.f7185a;
                c1098k4 = c1098k3;
            } else {
                c1383r.m2563R();
                i6 = i7 & (-64513);
                interfaceC2207p3 = interfaceC2207p;
                z7 = z5;
                interfaceC2738M3 = interfaceC2738M;
                c1098k4 = c1098k;
                c3251u3 = c3251u;
            }
            c1383r.m2598q();
            m2132b(interfaceC1599a, interfaceC2207p3, z7, interfaceC2738M3, c1098k4, null, c3251u3, c1843e, c1383r, i6 & 2147483646);
            interfaceC2207p2 = interfaceC2207p3;
            z6 = z7;
            interfaceC2738M2 = interfaceC2738M3;
            c1098k2 = c1098k4;
            c3251u2 = c3251u3;
        } else {
            c1383r.m2563R();
            interfaceC2207p2 = interfaceC2207p;
            z6 = z5;
            interfaceC2738M2 = interfaceC2738M;
            c1098k2 = c1098k;
            c3251u2 = c3251u;
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new InterfaceC1603e(interfaceC2207p2, z6, interfaceC2738M2, c1098k2, c3251u2, c1843e, i5) { // from class: P.n

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ InterfaceC2207p f3551e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ boolean f3552f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ InterfaceC2738M f3553g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ C1098k f3554h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ C3251U f3555i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ C1843e f3556j;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p112W2.InterfaceC1603e
                /* JADX INFO: renamed from: g */
                public final Object mo0g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM2609A = AbstractC1385s.m2609A(805306369);
                    AbstractC1072S.m2134d(this.f3550d, this.f3551e, this.f3552f, this.f3553g, this.f3554h, this.f3555i, this.f3556j, (InterfaceC1373m) obj, iM2609A);
                    return C0891q.f2780a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final C1091f0 m2135e(Context context) {
        m2136f(context, R.color.system_neutral1_0);
        m2136f(context, R.color.system_neutral1_10);
        m2137g(98.0f, m2136f(context, R.color.system_neutral1_600));
        m2137g(96.0f, m2136f(context, R.color.system_neutral1_600));
        m2136f(context, R.color.system_neutral1_50);
        m2137g(94.0f, m2136f(context, R.color.system_neutral1_600));
        m2137g(92.0f, m2136f(context, R.color.system_neutral1_600));
        m2136f(context, R.color.system_neutral1_100);
        m2137g(87.0f, m2136f(context, R.color.system_neutral1_600));
        m2136f(context, R.color.system_neutral1_200);
        m2136f(context, R.color.system_neutral1_300);
        m2136f(context, R.color.system_neutral1_400);
        m2136f(context, R.color.system_neutral1_500);
        m2136f(context, R.color.system_neutral1_600);
        m2136f(context, R.color.system_neutral1_700);
        m2137g(24.0f, m2136f(context, R.color.system_neutral1_600));
        m2137g(22.0f, m2136f(context, R.color.system_neutral1_600));
        m2136f(context, R.color.system_neutral1_800);
        m2137g(17.0f, m2136f(context, R.color.system_neutral1_600));
        m2137g(12.0f, m2136f(context, R.color.system_neutral1_600));
        m2136f(context, R.color.system_neutral1_900);
        m2137g(6.0f, m2136f(context, R.color.system_neutral1_600));
        m2137g(4.0f, m2136f(context, R.color.system_neutral1_600));
        m2136f(context, R.color.system_neutral1_1000);
        long jM2136f = m2136f(context, R.color.system_neutral2_0);
        m2136f(context, R.color.system_neutral2_10);
        long jM2137g = m2137g(98.0f, m2136f(context, R.color.system_neutral2_600));
        long jM2137g2 = m2137g(96.0f, m2136f(context, R.color.system_neutral2_600));
        long jM2136f2 = m2136f(context, R.color.system_neutral2_50);
        long jM2137g3 = m2137g(94.0f, m2136f(context, R.color.system_neutral2_600));
        long jM2137g4 = m2137g(92.0f, m2136f(context, R.color.system_neutral2_600));
        long jM2136f3 = m2136f(context, R.color.system_neutral2_100);
        long jM2137g5 = m2137g(87.0f, m2136f(context, R.color.system_neutral2_600));
        long jM2136f4 = m2136f(context, R.color.system_neutral2_200);
        m2136f(context, R.color.system_neutral2_300);
        long jM2136f5 = m2136f(context, R.color.system_neutral2_400);
        long jM2136f6 = m2136f(context, R.color.system_neutral2_500);
        m2136f(context, R.color.system_neutral2_600);
        long jM2136f7 = m2136f(context, R.color.system_neutral2_700);
        long jM2137g6 = m2137g(24.0f, m2136f(context, R.color.system_neutral2_600));
        long jM2137g7 = m2137g(22.0f, m2136f(context, R.color.system_neutral2_600));
        long jM2136f8 = m2136f(context, R.color.system_neutral2_800);
        long jM2137g8 = m2137g(17.0f, m2136f(context, R.color.system_neutral2_600));
        long jM2137g9 = m2137g(12.0f, m2136f(context, R.color.system_neutral2_600));
        long jM2136f9 = m2136f(context, R.color.system_neutral2_900);
        long jM2137g10 = m2137g(6.0f, m2136f(context, R.color.system_neutral2_600));
        long jM2137g11 = m2137g(4.0f, m2136f(context, R.color.system_neutral2_600));
        long jM2136f10 = m2136f(context, R.color.system_neutral2_1000);
        long jM2136f11 = m2136f(context, R.color.system_accent1_0);
        m2136f(context, R.color.system_accent1_10);
        m2136f(context, R.color.system_accent1_50);
        long jM2136f12 = m2136f(context, R.color.system_accent1_100);
        long jM2136f13 = m2136f(context, R.color.system_accent1_200);
        m2136f(context, R.color.system_accent1_300);
        m2136f(context, R.color.system_accent1_400);
        m2136f(context, R.color.system_accent1_500);
        long jM2136f14 = m2136f(context, R.color.system_accent1_600);
        long jM2136f15 = m2136f(context, R.color.system_accent1_700);
        long jM2136f16 = m2136f(context, R.color.system_accent1_800);
        long jM2136f17 = m2136f(context, R.color.system_accent1_900);
        m2136f(context, R.color.system_accent1_1000);
        long jM2136f18 = m2136f(context, R.color.system_accent2_0);
        m2136f(context, R.color.system_accent2_10);
        m2136f(context, R.color.system_accent2_50);
        long jM2136f19 = m2136f(context, R.color.system_accent2_100);
        long jM2136f20 = m2136f(context, R.color.system_accent2_200);
        m2136f(context, R.color.system_accent2_300);
        m2136f(context, R.color.system_accent2_400);
        m2136f(context, R.color.system_accent2_500);
        long jM2136f21 = m2136f(context, R.color.system_accent2_600);
        long jM2136f22 = m2136f(context, R.color.system_accent2_700);
        long jM2136f23 = m2136f(context, R.color.system_accent2_800);
        long jM2136f24 = m2136f(context, R.color.system_accent2_900);
        m2136f(context, R.color.system_accent2_1000);
        long jM2136f25 = m2136f(context, R.color.system_accent3_0);
        m2136f(context, R.color.system_accent3_10);
        m2136f(context, R.color.system_accent3_50);
        long jM2136f26 = m2136f(context, R.color.system_accent3_100);
        long jM2136f27 = m2136f(context, R.color.system_accent3_200);
        m2136f(context, R.color.system_accent3_300);
        m2136f(context, R.color.system_accent3_400);
        m2136f(context, R.color.system_accent3_500);
        long jM2136f28 = m2136f(context, R.color.system_accent3_600);
        long jM2136f29 = m2136f(context, R.color.system_accent3_700);
        long jM2136f30 = m2136f(context, R.color.system_accent3_800);
        long jM2136f31 = m2136f(context, R.color.system_accent3_900);
        m2136f(context, R.color.system_accent3_1000);
        return new C1091f0(jM2136f, jM2137g, jM2137g2, jM2136f2, jM2137g3, jM2137g4, jM2136f3, jM2137g5, jM2136f4, jM2136f5, jM2136f6, jM2136f7, jM2137g6, jM2137g7, jM2136f8, jM2137g8, jM2137g9, jM2136f9, jM2137g10, jM2137g11, jM2136f10, jM2136f11, jM2136f12, jM2136f13, jM2136f14, jM2136f15, jM2136f16, jM2136f17, jM2136f18, jM2136f19, jM2136f20, jM2136f21, jM2136f22, jM2136f23, jM2136f24, jM2136f25, jM2136f26, jM2136f27, jM2136f28, jM2136f29, jM2136f30, jM2136f31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static long m2136f(Context context, int i5) {
        return AbstractC2767z.m4933c(context.getResources().getColor(i5, context.getTheme()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0210, code lost:
    
        if (r38 > 100.01d) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0214, code lost:
    
        if (r40 > 100.01d) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0218, code lost:
    
        if (r0 <= 100.01d) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x021b, code lost:
    
        r0 = (p086R.AbstractC1188b.m2242d(r0) & 255) | ((((p086R.AbstractC1188b.m2242d(r38) & 255) << 16) | (-16777216)) | ((p086R.AbstractC1188b.m2242d(r40) & 255) << 8));
     */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0320 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02f6  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m2137g(float f2, long j5) {
        int iM2246h;
        boolean z5;
        float f5;
        float f6;
        double[] dArr;
        int i5;
        double d5;
        int iCeil;
        double dFloor;
        double[] dArr2;
        double[] dArr3;
        double d6 = f2;
        if ((d6 < 1.0E-4d) || (d6 > 99.9999d)) {
            return AbstractC2767z.m4933c(AbstractC1188b.m2240b(d6));
        }
        C1187a c1187aM2243e = AbstractC1188b.m2243e(AbstractC2767z.m4952w(j5));
        float f7 = c1187aM2243e.f3880a;
        float f8 = c1187aM2243e.f3881b;
        C1189c c1189c = C1189c.f3895k;
        if (AbstractC1665j.m2981a(c1189c, c1189c)) {
            double d7 = f7;
            double d8 = f8;
            double[] dArr4 = AbstractC1188b.f3893h;
            if (d8 < 1.0E-4d || d6 < 1.0E-4d || d6 > 99.9999d) {
                iM2246h = AbstractC1188b.m2240b(d6);
            } else {
                double d9 = d7 % 360.0d;
                if (d9 < 0.0d) {
                    d9 += 360.0d;
                }
                double radians = Math.toRadians(d9);
                double dPow = (d6 > 8.0d ? Math.pow((d6 + 16.0d) / 116.0d, 3.0d) : d6 / 903.2962962962963d) * 100.0d;
                double dSqrt = Math.sqrt(dPow) * 11.0d;
                int i6 = 1;
                double dPow2 = ((double) 1) / Math.pow(1.64d - Math.pow(0.29d, c1189c.f3896a), 0.73d);
                int i7 = 2;
                double dCos = (Math.cos(radians + 2.0d) + 3.8d) * 0.25d * 3846.153846153846d * ((double) c1189c.f3901f) * ((double) c1189c.f3899d);
                double dSin = Math.sin(radians);
                double dCos2 = Math.cos(radians);
                int i8 = 0;
                while (true) {
                    dArr = dArr4;
                    i5 = 8;
                    if (i8 >= 5) {
                        d5 = dPow;
                        break;
                    }
                    d5 = dPow;
                    double d10 = dSqrt / 100.0d;
                    double d11 = dSqrt;
                    double dPow3 = Math.pow(((d8 == 0.0d || dSqrt == 0.0d) ? 0.0d : d8 / Math.sqrt(d10)) * dPow2, 1.1111111111111112d);
                    double dPow4 = (Math.pow(d10, (1.0d / ((double) c1189c.f3900e)) / ((double) c1189c.f3905j)) * ((double) c1189c.f3897b)) / ((double) c1189c.f3898c);
                    double d12 = (((0.305d + dPow4) * 23.0d) * dPow3) / (((108.0d * dPow3) * dSin) + (((((double) 11) * dPow3) * dCos2) + (23.0d * dCos)));
                    double d13 = d12 * dCos2;
                    double d14 = d12 * dSin;
                    double d15 = 460.0d * dPow4;
                    double d16 = ((288.0d * d14) + ((451.0d * d13) + d15)) / 1403.0d;
                    double d17 = ((d15 - (891.0d * d13)) - (261.0d * d14)) / 1403.0d;
                    double d18 = ((d15 - (d13 * 220.0d)) - (d14 * 6300.0d)) / 1403.0d;
                    double dM2247i = AbstractC1188b.m2247i(d16);
                    double dM2247i2 = AbstractC1188b.m2247i(d17);
                    double dM2247i3 = AbstractC1188b.m2247i(d18);
                    double[][] dArr5 = AbstractC1188b.f3892g;
                    double[] dArr6 = dArr5[0];
                    double d19 = (dArr6[i7] * dM2247i3) + (dArr6[1] * dM2247i2) + (dArr6[0] * dM2247i);
                    double[] dArr7 = dArr5[1];
                    double d20 = (dArr7[i7] * dM2247i3) + (dArr7[1] * dM2247i2) + (dArr7[0] * dM2247i);
                    double[] dArr8 = dArr5[i7];
                    double d21 = (dM2247i3 * dArr8[i7]) + (dM2247i2 * dArr8[1]) + (dM2247i * dArr8[0]);
                    if (d19 < 0.0d || d20 < 0.0d || d21 < 0.0d) {
                        break;
                    }
                    double d22 = (dArr[i7] * d21) + (dArr[1] * d20) + (dArr[0] * d19);
                    if (d22 <= 0.0d) {
                        break;
                    }
                    if (i8 == 4) {
                        break;
                    }
                    double d23 = d22 - d5;
                    if (Math.abs(d23) < 0.002d) {
                        break;
                    }
                    dSqrt = d11 - ((d23 * d11) / (((double) i7) * d22));
                    i8++;
                    dArr4 = dArr;
                    dPow = d5;
                    i7 = 2;
                }
                iM2246h = 0;
                if (iM2246h == 0) {
                    double d24 = -1.0d;
                    char c5 = 2;
                    double[] dArr9 = {-1.0d, -1.0d, -1.0d};
                    double d25 = 0.0d;
                    double d26 = 0.0d;
                    double[] dArr10 = dArr9;
                    boolean z6 = true;
                    boolean z7 = false;
                    int i9 = 0;
                    while (i9 < 12) {
                        double d27 = dArr[0];
                        double d28 = dArr[i6];
                        double d29 = dArr[c5];
                        double d30 = d24;
                        double d31 = i9 % 4 <= i6 ? 0.0d : 100.0d;
                        double d32 = i9 % 2 == 0 ? 0.0d : 100.0d;
                        if (i9 < 4) {
                            double d33 = ((d5 - (d28 * d31)) - (d29 * d32)) / d27;
                            dArr2 = AbstractC1188b.m2248j(d33) ? new double[]{d33, d31, d32} : new double[]{d30, d30, d30};
                        } else {
                            if (i9 < i5) {
                                double d34 = ((d5 - (d27 * d32)) - (d29 * d31)) / d28;
                                if (AbstractC1188b.m2248j(d34)) {
                                    dArr3 = new double[]{d32, d34, d31};
                                } else {
                                    dArr2 = new double[]{d30, d30, d30};
                                }
                            } else {
                                double d35 = ((d5 - (d27 * d31)) - (d28 * d32)) / d29;
                                if (AbstractC1188b.m2248j(d35)) {
                                    dArr3 = new double[]{d31, d32, d35};
                                } else {
                                    dArr2 = new double[]{d30, d30, d30};
                                }
                            }
                            if (dArr3[0] < 0.0d) {
                                double dM2245g = AbstractC1188b.m2245g(dArr3);
                                if (!z7) {
                                    dArr9 = dArr3;
                                    dArr10 = dArr9;
                                    d25 = dM2245g;
                                    d26 = d25;
                                    z7 = true;
                                } else if (z6 || AbstractC1188b.m2239a(d26, dM2245g, d25)) {
                                    if (AbstractC1188b.m2239a(d26, radians, dM2245g)) {
                                        dArr10 = dArr3;
                                        d25 = dM2245g;
                                    } else {
                                        dArr9 = dArr3;
                                        d26 = dM2245g;
                                    }
                                    z6 = false;
                                }
                            }
                            i9++;
                            d24 = d30;
                            c5 = 2;
                            i6 = 1;
                            i5 = 8;
                        }
                        dArr3 = dArr2;
                        if (dArr3[0] < 0.0d) {
                        }
                        i9++;
                        d24 = d30;
                        c5 = 2;
                        i6 = 1;
                        i5 = 8;
                    }
                    double[][] dArr11 = {dArr9, dArr10};
                    double[] dArr12 = dArr11[0];
                    double dM2245g2 = AbstractC1188b.m2245g(dArr12);
                    double[] dArr13 = dArr11[1];
                    for (int i10 = 0; i10 < 3; i10++) {
                        double d36 = dArr12[i10];
                        double d37 = dArr13[i10];
                        if (d36 != d37) {
                            if (d36 < d37) {
                                iCeil = (int) Math.floor(AbstractC1188b.m2250l(d36) - 0.5d);
                                dFloor = Math.ceil(AbstractC1188b.m2250l(dArr13[i10]) - 0.5d);
                            } else {
                                iCeil = (int) Math.ceil(AbstractC1188b.m2250l(d36) - 0.5d);
                                dFloor = Math.floor(AbstractC1188b.m2250l(dArr13[i10]) - 0.5d);
                            }
                            int i11 = (int) dFloor;
                            double d38 = dM2245g2;
                            for (int i12 = 0; i12 < 8 && Math.abs(i11 - iCeil) > 1.0d; i12++) {
                                int iFloor = (int) Math.floor(((double) (iCeil + i11)) / 2.0d);
                                double d39 = AbstractC1188b.f3894i[iFloor];
                                double d40 = dArr12[i10];
                                double d41 = dArr13[i10];
                                if (d41 != d40) {
                                    d41 = (d39 - d40) / (d41 - d40);
                                }
                                double d42 = dArr12[0];
                                double d43 = ((dArr13[0] - d42) * d41) + d42;
                                double d44 = dArr12[1];
                                double d45 = ((dArr13[1] - d44) * d41) + d44;
                                double d46 = dArr12[2];
                                double[] dArr14 = {d43, d45, ((dArr13[2] - d46) * d41) + d46};
                                double dM2245g3 = AbstractC1188b.m2245g(dArr14);
                                if (AbstractC1188b.m2239a(d38, radians, dM2245g3)) {
                                    i11 = iFloor;
                                    dArr13 = dArr14;
                                } else {
                                    iCeil = iFloor;
                                    dArr12 = dArr14;
                                    d38 = dM2245g3;
                                }
                            }
                            dM2245g2 = d38;
                        }
                    }
                    double d47 = 2;
                    iM2246h = ((AbstractC1188b.m2242d((dArr12[0] + dArr13[0]) / d47) & 255) << 16) | (-16777216) | ((AbstractC1188b.m2242d((dArr12[1] + dArr13[1]) / d47) & 255) << 8) | (AbstractC1188b.m2242d((dArr12[2] + dArr13[2]) / d47) & 255);
                }
            }
        } else if (f8 < 1.0d || Math.round(f2) <= 0.0d || Math.round(f2) >= 100.0d) {
            iM2246h = AbstractC1188b.m2246h(f2);
        } else {
            float f9 = 0.0f;
            float fMin = f7 < 0.0f ? 0.0f : Math.min(360.0f, f7);
            float f10 = 0.0f;
            float f11 = f8;
            boolean z8 = true;
            C1187a c1187a = null;
            while (true) {
                if (Math.abs(f10 - f8) >= 0.4000000059604645d) {
                    float f12 = 1000.0f;
                    float f13 = f9;
                    float f14 = f13;
                    float f15 = 1000.0f;
                    float f16 = 100.0f;
                    C1187a c1187a2 = null;
                    while (true) {
                        z5 = z8;
                        if (Math.abs(f14 - f16) <= 0.009999999776482582d) {
                            f5 = f11;
                            break;
                        }
                        float f17 = ((f16 - f14) / 2) + f14;
                        int iM2237c = AbstractC1188b.m2244f(f17, f11, fMin).m2237c(C1189c.f3895k);
                        float fM2249k = AbstractC1188b.m2249k((iM2237c >> 16) & 255);
                        float fM2249k2 = AbstractC1188b.m2249k((iM2237c >> 8) & 255);
                        float fM2249k3 = AbstractC1188b.m2249k(iM2237c & 255);
                        double d48 = fM2249k;
                        double[] dArr15 = AbstractC1188b.f3889d[1];
                        float f18 = ((float) ((((double) fM2249k3) * dArr15[2]) + ((((double) fM2249k2) * dArr15[1]) + (d48 * dArr15[0])))) / 100.0f;
                        float fCbrt = f18 <= 0.008856452f ? f18 * 903.2963f : (((float) Math.cbrt(f18)) * 116.0f) - 16.0f;
                        f5 = f11;
                        float fAbs = (float) Math.abs(f2 - fCbrt);
                        if (fAbs < 0.2f) {
                            C1187a c1187aM2243e2 = AbstractC1188b.m2243e(iM2237c);
                            C1187a c1187aM2244f = AbstractC1188b.m2244f(c1187aM2243e2.f3882c, c1187aM2243e2.f3881b, fMin);
                            float f19 = c1187aM2243e2.f3883d - c1187aM2244f.f3883d;
                            f6 = fCbrt;
                            float f20 = c1187aM2243e2.f3884e - c1187aM2244f.f3884e;
                            float f21 = c1187aM2243e2.f3885f - c1187aM2244f.f3885f;
                            float fPow = (float) (Math.pow(Math.sqrt((f21 * f21) + (f20 * f20) + (f19 * f19)), 0.63d) * 1.41d);
                            if (fPow <= 1.0f) {
                                f15 = fPow;
                                c1187a2 = c1187aM2243e2;
                                f12 = fAbs;
                            }
                        } else {
                            f6 = fCbrt;
                        }
                        if (f12 == f13 && f15 == f13) {
                            break;
                        }
                        if (f6 < f2) {
                            f11 = f5;
                            z8 = z5;
                            f14 = f17;
                        } else {
                            f11 = f5;
                            z8 = z5;
                            f16 = f17;
                        }
                    }
                    C1187a c1187a3 = c1187a2;
                    if (!z5) {
                        if (c1187a3 == null) {
                            f8 = f5;
                        } else {
                            c1187a = c1187a3;
                            f10 = f5;
                        }
                        f11 = ((f8 - f10) / 2.0f) + f10;
                        f9 = f13;
                        z8 = z5;
                    } else {
                        if (c1187a3 != null) {
                            iM2246h = c1187a3.m2237c(c1189c);
                            break;
                        }
                        f11 = ((f8 - f10) / 2.0f) + f10;
                        f9 = f13;
                        z8 = false;
                    }
                } else {
                    iM2246h = c1187a == null ? AbstractC1188b.m2246h(f2) : c1187a.m2237c(c1189c);
                }
            }
        }
        return AbstractC2767z.m4933c(iM2246h);
    }
}
