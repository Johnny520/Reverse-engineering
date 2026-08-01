package p076P;

import android.R;
import android.content.Context;
import p000A.C0000A;
import p000A.C0071l;
import p056K2.C0891q;
import p071O.C1023b;
import p077P0.AbstractC1126m;
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
import p136b0.AbstractC1848j;
import p136b0.C1843e;
import p153e1.C2010f;
import p169h0.C2204m;
import p169h0.InterfaceC2207p;
import p176i1.C2307w;
import p211o0.AbstractC2767z;
import p211o0.C2762u;
import p211o0.InterfaceC2738M;
import p232s.C3162i;
import p244u.C3251U;

/* JADX INFO: renamed from: P.S */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1072S {

    /* JADX INFO: renamed from: a */
    public static final C1023b f3340a = new C1023b();

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

    /* JADX WARN: Removed duplicated region for block: B:42:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0084  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2133c(p169h0.InterfaceC2207p r12, final float r13, final long r14, p095T.InterfaceC1373m r16, final int r17, final int r18) {
        /*
            r0 = r16
            T.r r0 = (p095T.C1383r) r0
            r1 = 75144485(0x47a9d25, float:2.9459516E-36)
            r0.m2569X(r1)
            r1 = r18 & 1
            if (r1 == 0) goto L12
            r5 = r17 | 6
            r6 = r5
            goto L24
        L12:
            r5 = r17 & 6
            if (r5 != 0) goto L22
            boolean r6 = r0.m2582f(r12)
            if (r6 == 0) goto L1e
            r6 = 4
            goto L1f
        L1e:
            r6 = 2
        L1f:
            r6 = r17 | r6
            goto L24
        L22:
            r6 = r17
        L24:
            boolean r7 = r0.m2580e(r14)
            r8 = 256(0x100, float:3.59E-43)
            if (r7 == 0) goto L2e
            r7 = r8
            goto L30
        L2e:
            r7 = 128(0x80, float:1.8E-43)
        L30:
            r6 = r6 | r7
            r7 = r6 & 147(0x93, float:2.06E-43)
            r9 = 146(0x92, float:2.05E-43)
            r10 = 0
            r11 = 1
            if (r7 == r9) goto L3b
            r7 = r11
            goto L3c
        L3b:
            r7 = r10
        L3c:
            r9 = r6 & 1
            boolean r7 = r0.m2560O(r9, r7)
            if (r7 == 0) goto L92
            r0.m2565T()
            r7 = r17 & 1
            if (r7 == 0) goto L57
            boolean r7 = r0.m2606y()
            if (r7 == 0) goto L52
            goto L57
        L52:
            r0.m2563R()
        L55:
            r1 = r12
            goto L5b
        L57:
            if (r1 == 0) goto L55
            h0.m r1 = p169h0.C2204m.f7185a
        L5b:
            r0.m2598q()
            u.z r5 = p244u.AbstractC3261c.f10087c
            h0.p r5 = r1.mo4021c(r5)
            h0.p r5 = p244u.AbstractC3261c.m5521h(r5, r13)
            r7 = r6 & 896(0x380, float:1.256E-42)
            r7 = r7 ^ 384(0x180, float:5.38E-43)
            if (r7 <= r8) goto L74
            boolean r7 = r0.m2580e(r14)
            if (r7 != 0) goto L7a
        L74:
            r6 = r6 & 384(0x180, float:5.38E-43)
            if (r6 != r8) goto L79
            goto L7a
        L79:
            r11 = r10
        L7a:
            java.lang.Object r6 = r0.m2558L()
            if (r11 != 0) goto L84
            T.e r7 = p095T.C1371l.f4833a
            if (r6 != r7) goto L8c
        L84:
            P.y r6 = new P.y
            r6.<init>()
            r0.m2585g0(r6)
        L8c:
            W2.c r6 = (p112W2.InterfaceC1601c) r6
            p216p.AbstractC2856m.m5047a(r5, r6, r0, r10)
            goto L96
        L92:
            r0.m2563R()
            r1 = r12
        L96:
            T.t0 r7 = r0.m2599r()
            if (r7 == 0) goto La9
            P.z r0 = new P.z
            r2 = r13
            r3 = r14
            r5 = r17
            r6 = r18
            r0.<init>()
            r7.f4928d = r0
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p076P.AbstractC1072S.m2133c(h0.p, float, long, T.m, int, int):void");
    }

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

    /* JADX INFO: renamed from: f */
    public static long m2136f(Context context, int i5) {
        return AbstractC2767z.m4933c(context.getResources().getColor(i5, context.getTheme()));
    }

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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long m2137g(float r46, long r47) {
        /*
            Method dump skipped, instruction units count: 1433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p076P.AbstractC1072S.m2137g(float, long):long");
    }
}
