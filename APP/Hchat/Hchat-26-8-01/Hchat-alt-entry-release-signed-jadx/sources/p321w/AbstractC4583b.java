package p321w;

import ca.C0512c;
import p028c1.AbstractC0378h;
import p065eb.C0896u;
import p072f2.AbstractC1052o;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p100h0.AbstractC1535l1;
import p100h0.C1532k1;
import p100h0.InterfaceC1533l;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.C1876r1;
import p198nb.C2924a;
import p219oh.AbstractC3165h;
import p222p.AbstractC3208d;
import p222p.AbstractC3222h1;
import p222p.C3235m;
import p266s0.AbstractC3879i;
import p276sf.C3967n;
import p356y0.C5840b;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;

/* JADX INFO: renamed from: w.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4583b {

    /* JADX INFO: renamed from: a */
    public static final float f15099a;

    /* JADX INFO: renamed from: b */
    public static final float f15100b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        float f3 = 25;
        f15099a = f3;
        f15100b = (f3 * 2.0f) / 2.4142137f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m9027a(final InterfaceC1533l interfaceC1533l, final InterfaceC5853o interfaceC5853o, long j3, C1836h0 c1836h0, final int i9) {
        int i10;
        c1836h0.m4527b0(1776202187);
        int i11 = (c1836h0.m4534f(interfaceC1533l) ? 4 : 2) | i9 | (c1836h0.m4534f(interfaceC5853o) ? 32 : 16) | 128;
        if (c1836h0.m4516S(i11 & 1, (i11 & 147) != 146)) {
            c1836h0.m4521X();
            if ((i9 & 1) == 0 || c1836h0.m4500B()) {
                i10 = i11 & (-897);
                j3 = 9205357640488583168L;
            } else {
                c1836h0.m4519V();
                i10 = i11 & (-897);
            }
            c1836h0.m4554q();
            int i12 = i10 & 14;
            boolean z9 = i12 == 4;
            Object objM4514P = c1836h0.m4514P();
            if (z9 || objM4514P == C1851l.f6155a) {
                objM4514P = new C2924a(interfaceC1533l, 20);
                c1836h0.m4545k0(objM4514P);
            }
            AbstractC3165h.m6774a(interfaceC1533l, C5840b.f23762h, AbstractC3879i.m8071e(-1653527038, new C0896u(j3, AbstractC1052o.m2648a(interfaceC5853o, (InterfaceC1231l) objM4514P), 1), c1836h0), c1836h0, i12 | 432);
        } else {
            c1836h0.m4519V();
        }
        final long j4 = j3;
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new InterfaceC1235p(interfaceC5853o, j4, i9) { // from class: w.a

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ InterfaceC5853o f15090h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ long f15091i;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p085fg.InterfaceC1235p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM4617C = AbstractC1874r.m4617C(1);
                    AbstractC4583b.m9027a(this.f15089g, this.f15090h, this.f15091i, (C1836h0) obj, iM4617C);
                    return C3967n.f12976a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m9028b(InterfaceC5853o interfaceC5853o, C1836h0 c1836h0, int i9, int i10) {
        int i11;
        c1836h0.m4527b0(694251107);
        int i12 = i10 & 1;
        if (i12 != 0) {
            i11 = i9 | 6;
        } else {
            i11 = (c1836h0.m4534f(interfaceC5853o) ? 4 : 2) | i9;
        }
        if (c1836h0.m4516S(i11 & 1, (i11 & 3) != 2)) {
            if (i12 != 0) {
                interfaceC5853o = C5850l.f23787a;
            }
            AbstractC3208d.m6873c(c1836h0, AbstractC0378h.m1340e(AbstractC3222h1.m6908k(interfaceC5853o, f15100b, f15099a), new C0512c(((C1532k1) c1836h0.m4542j(AbstractC1535l1.f5116a)).f5111a, 15)));
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C3235m(interfaceC5853o, i9, i10);
        }
    }
}
