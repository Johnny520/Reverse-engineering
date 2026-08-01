package p000A;

import me.dartcv.nuke.BuildConfig;
import p029F0.AbstractC0389a0;
import p029F0.AbstractC0391b0;
import p056K2.C0891q;
import p095T.C1311F;
import p095T.C1388t0;
import p095T.C1397y;
import p095T.InterfaceC1389u;
import p112W2.InterfaceC1601c;
import p115X0.C1624B;
import p117X2.AbstractC1665j;
import p179i4.AbstractC2352g;
import p186k.C2408E;
import p186k.C2444z;
import p216p.C2844f0;
import p227r.EnumC2983d0;

/* JADX INFO: renamed from: A.W0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0044W0 implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f188d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f189e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f190f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f191g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0044W0(int i5, int i6, Object obj, Object obj2) {
        this.f188d = i6;
        this.f190f = obj;
        this.f189e = i5;
        this.f191g = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        InterfaceC1389u interfaceC1389u;
        long[] jArr;
        InterfaceC1389u interfaceC1389u2;
        long[] jArr2;
        int i5;
        switch (this.f188d) {
            case 0:
                C0046X0 c0046x0 = (C0046X0) this.f190f;
                AbstractC0391b0 abstractC0391b0 = (AbstractC0391b0) this.f191g;
                AbstractC0389a0 abstractC0389a0 = (AbstractC0389a0) obj;
                int i6 = c0046x0.f196b;
                C0029O0 c0029o0 = c0046x0.f195a;
                C1624B c1624b = c0046x0.f197c;
                C0036S0 c0036s0 = (C0036S0) c0046x0.f198d.mo6a();
                c0029o0.m18a(EnumC2983d0.f9447d, AbstractC0070k0.m81h(abstractC0389a0, i6, c1624b, c0036s0 != null ? c0036s0.f161a : null, false, abstractC0391b0.f1206d), this.f189e, abstractC0391b0.f1207e);
                AbstractC0389a0.m660k(abstractC0389a0, abstractC0391b0, 0, Math.round(-c0029o0.f142a.m2507g()));
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                C1388t0 c1388t0 = (C1388t0) this.f190f;
                C2444z c2444z = (C2444z) this.f191g;
                InterfaceC1389u interfaceC1389u3 = (InterfaceC1389u) obj;
                int i7 = c1388t0.f4929e;
                int i8 = this.f189e;
                if (i7 == i8 && AbstractC1665j.m2981a(c2444z, c1388t0.f4930f) && (interfaceC1389u3 instanceof C1397y)) {
                    long[] jArr3 = c2444z.f7898a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i9 = 0;
                        while (true) {
                            long j5 = jArr3[i9];
                            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i10 = 8;
                                int i11 = 8 - ((~(i9 - length)) >>> 31);
                                int i12 = 0;
                                while (i12 < i11) {
                                    if ((255 & j5) < 128) {
                                        int i13 = (i9 << 3) + i12;
                                        Object obj2 = c2444z.f7899b[i13];
                                        boolean z5 = c2444z.f7900c[i13] != i8;
                                        if (z5) {
                                            i5 = i10;
                                            C1397y c1397y = (C1397y) interfaceC1389u3;
                                            interfaceC1389u2 = interfaceC1389u3;
                                            C2408E c2408e = c1397y.f4961j;
                                            AbstractC2352g.m4180C(c2408e, obj2, c1388t0);
                                            jArr2 = jArr3;
                                            if (obj2 instanceof C1311F) {
                                                C1311F c1311f = (C1311F) obj2;
                                                if (!c2408e.m4268c(c1311f)) {
                                                    AbstractC2352g.m4181D(c1397y.f4964m, c1311f);
                                                }
                                                C2408E c2408e2 = c1388t0.f4931g;
                                                if (c2408e2 != null) {
                                                    c2408e2.m4276k(obj2);
                                                }
                                            }
                                        } else {
                                            interfaceC1389u2 = interfaceC1389u3;
                                            jArr2 = jArr3;
                                            i5 = i10;
                                        }
                                        if (z5) {
                                            c2444z.m4366f(i13);
                                        }
                                    } else {
                                        interfaceC1389u2 = interfaceC1389u3;
                                        jArr2 = jArr3;
                                        i5 = i10;
                                    }
                                    j5 >>= i5;
                                    i12++;
                                    i10 = i5;
                                    interfaceC1389u3 = interfaceC1389u2;
                                    jArr3 = jArr2;
                                }
                                interfaceC1389u = interfaceC1389u3;
                                jArr = jArr3;
                                if (i11 == i10) {
                                }
                            } else {
                                interfaceC1389u = interfaceC1389u3;
                                jArr = jArr3;
                            }
                            if (i9 != length) {
                                i9++;
                                interfaceC1389u3 = interfaceC1389u;
                                jArr3 = jArr;
                            }
                        }
                    }
                }
                return C0891q.f2780a;
            default:
                C2844f0 c2844f0 = (C2844f0) this.f190f;
                AbstractC0391b0 abstractC0391b02 = (AbstractC0391b0) this.f191g;
                AbstractC0389a0 abstractC0389a02 = (AbstractC0389a0) obj;
                int iM2509g = c2844f0.f8934r.f8952a.m2509g();
                if (iM2509g < 0) {
                    iM2509g = 0;
                }
                int i14 = this.f189e;
                if (iM2509g > i14) {
                    iM2509g = i14;
                }
                int i15 = -iM2509g;
                boolean z6 = c2844f0.f8935s;
                int i16 = z6 ? 0 : i15;
                if (!z6) {
                    i15 = 0;
                }
                abstractC0389a02.f1204d = true;
                AbstractC0389a0.m661l(abstractC0389a02, abstractC0391b02, i16, i15);
                abstractC0389a02.f1204d = false;
                break;
        }
        return C0891q.f2780a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C0044W0(C0046X0 c0046x0, AbstractC0391b0 abstractC0391b0, int i5) {
        this.f188d = 0;
        this.f190f = c0046x0;
        this.f191g = abstractC0391b0;
        this.f189e = i5;
    }
}
