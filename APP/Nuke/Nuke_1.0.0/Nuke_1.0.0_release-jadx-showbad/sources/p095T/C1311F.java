package p095T;

import p000A.C0056d0;
import p000A.C0072l0;
import p105V.C1483e;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p136b0.C1844f;
import p158f0.AbstractC2074f;
import p158f0.AbstractC2082n;
import p158f0.AbstractC2086r;
import p158f0.AbstractC2091w;
import p158f0.AbstractC2092x;
import p158f0.InterfaceC2090v;
import p186k.C2444z;

/* JADX INFO: renamed from: T.F */
/* JADX INFO: loaded from: classes.dex */
public final class C1311F extends AbstractC2091w implements InterfaceC1339T0 {

    /* JADX INFO: renamed from: e */
    public final InterfaceC1599a f4682e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC1334Q0 f4683f;

    /* JADX INFO: renamed from: g */
    public C1309E f4684g = new C1309E(AbstractC2082n.m3834j().mo3791g());

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1311F(InterfaceC1599a interfaceC1599a, C1357e c1357e) {
        this.f4682e = interfaceC1599a;
        this.f4683f = c1357e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p158f0.InterfaceC2090v
    /* JADX INFO: renamed from: a */
    public final AbstractC2092x mo2410a() {
        return this.f4684g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p158f0.InterfaceC2090v
    /* JADX INFO: renamed from: c */
    public final void mo2411c(AbstractC2092x abstractC2092x) {
        AbstractC1665j.m2983c(abstractC2092x, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.f4684g = (C1309E) abstractC2092x;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IGET, IGET, CONST]}, finally: {[IGET, IGET, CONST, AGET, CHECK_CAST, INVOKE, ARITH, IF] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1309E m2412g(C1309E c1309e, AbstractC2074f abstractC2074f, boolean z5, InterfaceC1599a interfaceC1599a) {
        C1483e c1483eM2623m;
        C1309E c1309e2;
        InterfaceC1334Q0 interfaceC1334Q0;
        int i5;
        if (c1309e.m2407c(this, abstractC2074f)) {
            if (z5) {
                c1483eM2623m = AbstractC1385s.m2623m();
                Object[] objArr = c1483eM2623m.f5181d;
                int i6 = c1483eM2623m.f5183f;
                for (int i7 = 0; i7 < i6; i7++) {
                    ((C1381q) objArr[i7]).m2545b();
                }
                try {
                    C2444z c2444z = c1309e.f4677e;
                    C0072l0 c0072l0 = AbstractC1335R0.f4766a;
                    C1844f c1844f = (C1844f) c0072l0.m105i();
                    if (c1844f == null) {
                        c1844f = new C1844f();
                        c0072l0.m115u(c1844f);
                    }
                    int i8 = c1844f.f6246a;
                    Object[] objArr2 = c2444z.f7899b;
                    int[] iArr = c2444z.f7900c;
                    long[] jArr = c2444z.f7898a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i9 = 0;
                        while (true) {
                            long j5 = jArr[i9];
                            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i10 = 8;
                                int i11 = 8 - ((~(i9 - length)) >>> 31);
                                int i12 = 0;
                                while (i12 < i11) {
                                    if ((j5 & 255) < 128) {
                                        int i13 = (i9 << 3) + i12;
                                        i5 = i10;
                                        InterfaceC2090v interfaceC2090v = (InterfaceC2090v) objArr2[i13];
                                        c1844f.f6246a = i8 + iArr[i13];
                                        InterfaceC1601c interfaceC1601cMo3789e = abstractC2074f.mo3789e();
                                        if (interfaceC1601cMo3789e != null) {
                                            interfaceC1601cMo3789e.mo1h(interfaceC2090v);
                                        }
                                    } else {
                                        i5 = i10;
                                    }
                                    j5 >>= i5;
                                    i12++;
                                    i10 = i5;
                                }
                                if (i11 != i10) {
                                    break;
                                }
                                if (i9 == length) {
                                    break;
                                }
                                i9++;
                            }
                        }
                    }
                    c1844f.f6246a = i8;
                    Object[] objArr3 = c1483eM2623m.f5181d;
                    int i14 = c1483eM2623m.f5183f;
                    for (int i15 = 0; i15 < i14; i15++) {
                        ((C1381q) objArr3[i15]).m2544a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c1309e;
        }
        C2444z c2444z2 = new C2444z();
        C0072l0 c0072l02 = AbstractC1335R0.f4766a;
        C1844f c1844f2 = (C1844f) c0072l02.m105i();
        if (c1844f2 == null) {
            c1844f2 = new C1844f();
            c0072l02.m115u(c1844f2);
        }
        int i16 = c1844f2.f6246a;
        c1483eM2623m = AbstractC1385s.m2623m();
        Object[] objArr4 = c1483eM2623m.f5181d;
        int i17 = c1483eM2623m.f5183f;
        for (int i18 = 0; i18 < i17; i18++) {
            ((C1381q) objArr4[i18]).m2545b();
        }
        try {
            c1844f2.f6246a = i16 + 1;
            Object objM3858j = AbstractC2086r.m3858j(new C0056d0(this, c1844f2, c2444z2, i16, 2), interfaceC1599a);
            c1844f2.f6246a = i16;
            Object[] objArr5 = c1483eM2623m.f5181d;
            int i19 = c1483eM2623m.f5183f;
            for (int i20 = 0; i20 < i19; i20++) {
                ((C1381q) objArr5[i20]).m2544a();
            }
            Object obj = AbstractC2082n.f6972c;
            synchronized (obj) {
                try {
                    AbstractC2074f abstractC2074fM3834j = AbstractC2082n.m3834j();
                    Object obj2 = c1309e.f4678f;
                    if (obj2 == C1309E.f4674h || (interfaceC1334Q0 = this.f4683f) == null || !interfaceC1334Q0.mo2498a(objM3858j, obj2)) {
                        C1309E c1309e3 = this.f4684g;
                        synchronized (obj) {
                            AbstractC2092x abstractC2092xM3837m = AbstractC2082n.m3837m(c1309e3, this);
                            abstractC2092xM3837m.mo2405a(c1309e3);
                            abstractC2092xM3837m.f7010a = abstractC2074fM3834j.mo3791g();
                            c1309e2 = (C1309E) abstractC2092xM3837m;
                            c1309e2.f4677e = c2444z2;
                            c1309e2.f4679g = c1309e2.m2408d(this, abstractC2074fM3834j);
                            c1309e2.f4678f = objM3858j;
                        }
                        return c1309e2;
                    }
                    c1309e.f4677e = c2444z2;
                    c1309e.f4679g = c1309e.m2408d(this, abstractC2074fM3834j);
                    c1309e2 = c1309e;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C1844f c1844f3 = (C1844f) AbstractC1335R0.f4766a.m105i();
            if (c1844f3 == null || c1844f3.f6246a != 0) {
                return c1309e2;
            }
            AbstractC2082n.m3834j().mo3795m();
            synchronized (obj) {
                AbstractC2074f abstractC2074fM3834j2 = AbstractC2082n.m3834j();
                c1309e2.f4675c = abstractC2074fM3834j2.mo3791g();
                c1309e2.f4676d = abstractC2074fM3834j2.mo3804h();
                return c1309e2;
            }
        } finally {
            Object[] objArr6 = c1483eM2623m.f5181d;
            int i21 = c1483eM2623m.f5183f;
            for (int i22 = 0; i22 < i21; i22++) {
                ((C1381q) objArr6[i22]).m2544a();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.InterfaceC1339T0
    public final Object getValue() {
        InterfaceC1601c interfaceC1601cMo3789e = AbstractC2082n.m3834j().mo3789e();
        if (interfaceC1601cMo3789e != null) {
            interfaceC1601cMo3789e.mo1h(this);
        }
        AbstractC2074f abstractC2074fM3834j = AbstractC2082n.m3834j();
        return m2412g((C1309E) AbstractC2082n.m3833i(this.f4684g, abstractC2074fM3834j), abstractC2074fM3834j, true, this.f4682e).f4678f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final C1309E m2413h() {
        AbstractC2074f abstractC2074fM3834j = AbstractC2082n.m3834j();
        return m2412g((C1309E) AbstractC2082n.m3833i(this.f4684g, abstractC2074fM3834j), abstractC2074fM3834j, false, this.f4682e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        C1309E c1309e = (C1309E) AbstractC2082n.m3832h(this.f4684g);
        sb.append(c1309e.m2407c(this, AbstractC2082n.m3834j()) ? String.valueOf(c1309e.f4678f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
