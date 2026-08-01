package p000A;

import com.bumptech.glide.AbstractC1922d;
import p029F0.C0363A;
import p056K2.C0891q;
import p092S0.C1260M;
import p092S0.C1269g;
import p095T.AbstractC1385s;
import p095T.C1357e;
import p095T.C1371l;
import p095T.C1383r;
import p095T.C1388t0;
import p095T.InterfaceC1347Y;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p115X0.C1636k;
import p115X0.C1637l;
import p115X0.C1638m;
import p115X0.C1646u;
import p125Z0.C1781b;
import p136b0.C1843e;
import p169h0.InterfaceC2207p;
import p211o0.C2740O;

/* JADX INFO: renamed from: A.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0079p {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f363a = 0;

    static {
        float f2 = 40;
        AbstractC1922d.m3423b(f2, f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m126a(final String str, final InterfaceC1601c interfaceC1601c, final InterfaceC2207p interfaceC2207p, final boolean z5, final C1260M c1260m, final C0076n0 c0076n0, final C0074m0 c0074m0, final boolean z6, final int i5, final int i6, final C0363A c0363a, InterfaceC1601c interfaceC1601c2, final C2740O c2740o, final C1843e c1843e, InterfaceC1373m interfaceC1373m, final int i7) {
        C1383r c1383r;
        final InterfaceC1601c interfaceC1601c3;
        InterfaceC1601c interfaceC1601c4;
        int i8;
        C1383r c1383r2 = (C1383r) interfaceC1373m;
        c1383r2.m2569X(2026950908);
        int i9 = i7 | (c1383r2.m2582f(str) ? 4 : 2) | (c1383r2.m2586h(interfaceC1601c) ? 32 : 16) | (c1383r2.m2582f(interfaceC2207p) ? 256 : 128) | (c1383r2.m2584g(z5) ? 2048 : 1024) | (c1383r2.m2584g(false) ? 16384 : 8192) | (c1383r2.m2582f(c1260m) ? 131072 : 65536) | (c1383r2.m2582f(c0076n0) ? 1048576 : 524288) | (c1383r2.m2582f(c0074m0) ? 8388608 : 4194304) | (c1383r2.m2584g(z6) ? 67108864 : 33554432) | (c1383r2.m2578d(i5) ? 536870912 : 268435456);
        int i10 = 196608 | (c1383r2.m2578d(i6) ? 4 : 2) | (c1383r2.m2582f(c0363a) ? 32 : 16) | 3456 | (c1383r2.m2582f(c2740o) ? 16384 : 8192);
        if (c1383r2.m2560O(i9 & 1, ((306783379 & i9) == 306783378 && (i10 & 74899) == 74898) ? false : true)) {
            c1383r2.m2565T();
            int i11 = i7 & 1;
            C1357e c1357e = C1371l.f4833a;
            if (i11 == 0 || c1383r2.m2606y()) {
                Object objM2558L = c1383r2.m2558L();
                if (objM2558L == c1357e) {
                    objM2558L = new C0071l(0);
                    c1383r2.m2585g0(objM2558L);
                }
                interfaceC1601c4 = (InterfaceC1601c) objM2558L;
            } else {
                c1383r2.m2563R();
                interfaceC1601c4 = interfaceC1601c2;
            }
            c1383r2.m2598q();
            Object objM2558L2 = c1383r2.m2558L();
            if (objM2558L2 == c1357e) {
                i8 = 1;
                objM2558L2 = AbstractC1385s.m2629s(new C1646u(str, 0L, 6));
                c1383r2.m2585g0(objM2558L2);
            } else {
                i8 = 1;
            }
            InterfaceC1347Y interfaceC1347Y = (InterfaceC1347Y) objM2558L2;
            C1646u c1646u = (C1646u) interfaceC1347Y.getValue();
            C1646u c1646u2 = new C1646u(new C1269g(str), c1646u.f5651b, c1646u.f5652c);
            boolean zM2582f = c1383r2.m2582f(c1646u2);
            Object objM2558L3 = c1383r2.m2558L();
            if (zM2582f || objM2558L3 == c1357e) {
                objM2558L3 = new C0073m(0, c1646u2, interfaceC1347Y);
                c1383r2.m2585g0(objM2558L3);
            }
            AbstractC1385s.m2617g((InterfaceC1599a) objM2558L3, c1383r2);
            int i12 = (i9 & 14) == 4 ? i8 : 0;
            Object objM2558L4 = c1383r2.m2558L();
            if (i12 != 0 || objM2558L4 == c1357e) {
                objM2558L4 = AbstractC1385s.m2629s(str);
                c1383r2.m2585g0(objM2558L4);
            }
            InterfaceC1347Y interfaceC1347Y2 = (InterfaceC1347Y) objM2558L4;
            c0076n0.getClass();
            int i13 = c0076n0.f319a;
            C1637l c1637l = new C1637l(i13);
            if (i13 == -1) {
                c1637l = null;
            }
            int i14 = c1637l != null ? c1637l.f5632a : 0;
            int i15 = c0076n0.f320b;
            C1638m c1638m = new C1638m(i15);
            if (i15 == 0) {
                c1638m = null;
            }
            boolean z7 = i8;
            C1636k c1636k = new C1636k(z6, i14, z7, c1638m != null ? c1638m.f5633a : i8, i8, C1781b.f6089f);
            boolean z8 = !z6;
            int i16 = z6 ? z7 ? 1 : 0 : i6;
            int i17 = z6 ? z7 ? 1 : 0 : i5;
            boolean zM2582f2 = c1383r2.m2582f(interfaceC1347Y2);
            boolean z9 = z7;
            if ((i9 & 112) != 32) {
                z9 = 0;
            }
            int i18 = (zM2582f2 ? 1 : 0) | z9;
            Object objM2558L5 = c1383r2.m2558L();
            if (i18 != 0 || objM2558L5 == c1357e) {
                objM2558L5 = new C0075n(interfaceC1601c, interfaceC1347Y, interfaceC1347Y2, 0);
                c1383r2.m2585g0(objM2558L5);
            }
            int i19 = i10 << 9;
            interfaceC1601c3 = interfaceC1601c4;
            c1383r = c1383r2;
            AbstractC0070k0.m77d(c1646u2, (InterfaceC1601c) objM2558L5, interfaceC2207p, c1260m, c0363a, interfaceC1601c3, c2740o, z8, i17, i16, c1636k, c0074m0, z5, c1843e, c1383r, (i9 & 896) | ((i9 >> 6) & 7168) | (i19 & 57344) | 1769472 | (i19 & 29360128), ((i9 >> 15) & 896) | (i9 & 7168) | (i9 & 57344) | 196608);
        } else {
            c1383r = c1383r2;
            c1383r.m2563R();
            interfaceC1601c3 = interfaceC1601c2;
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new InterfaceC1603e(str, interfaceC1601c, interfaceC2207p, z5, c1260m, c0076n0, c0074m0, z6, i5, i6, c0363a, interfaceC1601c3, c2740o, c1843e, i7) { // from class: A.o

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ String f321d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ InterfaceC1601c f322e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ InterfaceC2207p f323f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ boolean f324g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ C1260M f325h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ C0076n0 f326i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ C0074m0 f327j;

                /* JADX INFO: renamed from: k */
                public final /* synthetic */ boolean f328k;

                /* JADX INFO: renamed from: l */
                public final /* synthetic */ int f329l;

                /* JADX INFO: renamed from: m */
                public final /* synthetic */ int f330m;

                /* JADX INFO: renamed from: n */
                public final /* synthetic */ C0363A f331n;

                /* JADX INFO: renamed from: o */
                public final /* synthetic */ InterfaceC1601c f332o;

                /* JADX INFO: renamed from: p */
                public final /* synthetic */ C2740O f333p;

                /* JADX INFO: renamed from: q */
                public final /* synthetic */ C1843e f334q;

                @Override // p112W2.InterfaceC1603e
                /* JADX INFO: renamed from: g */
                public final Object mo0g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM2609A = AbstractC1385s.m2609A(1);
                    AbstractC0079p.m126a(this.f321d, this.f322e, this.f323f, this.f324g, this.f325h, this.f326i, this.f327j, this.f328k, this.f329l, this.f330m, this.f331n, this.f332o, this.f333p, this.f334q, (InterfaceC1373m) obj, iM2609A);
                    return C0891q.f2780a;
                }
            };
        }
    }
}
