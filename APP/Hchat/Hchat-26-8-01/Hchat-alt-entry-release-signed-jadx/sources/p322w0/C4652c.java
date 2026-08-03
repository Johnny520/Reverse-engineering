package p322w0;

import gg.AbstractC1416l;
import java.util.Arrays;
import java.util.HashMap;
import p069f.C0945l0;
import p085fg.InterfaceC1231l;

/* JADX INFO: renamed from: w0.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4652c extends C4651b {

    /* JADX INFO: renamed from: o */
    public final C4651b f15483o;

    /* JADX INFO: renamed from: p */
    public boolean f15484p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4652c(long j3, C4659j c4659j, InterfaceC1231l interfaceC1231l, InterfaceC1231l interfaceC1231l2, C4651b c4651b) {
        super(j3, c4659j, interfaceC1231l, interfaceC1231l2);
        this.f15483o = c4651b;
        c4651b.mo9087k();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.C4651b, p322w0.AbstractC4655f
    /* JADX INFO: renamed from: c */
    public final void mo9086c() {
        if (this.f15491c) {
            return;
        }
        super.mo9086c();
        if (this.f15484p) {
            return;
        }
        this.f15484p = true;
        this.f15483o.mo9088l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.C4651b
    /* JADX INFO: renamed from: w */
    public final AbstractC4666q mo9091w() throws Throwable {
        C4652c c4652c;
        C4651b c4651b = this.f15483o;
        if (c4651b.f15482m || c4651b.f15491c) {
            return new C4656g(this);
        }
        C0945l0 c0945l0 = this.f15477h;
        long j3 = this.f15490b;
        HashMap mapM9121b = c0945l0 != null ? AbstractC4662m.m9121b(c4651b.mo9109g(), this, this.f15483o.mo9108d()) : null;
        Object obj = AbstractC4662m.f15512c;
        synchronized (obj) {
            try {
                AbstractC4662m.m9122c(this);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                if (c0945l0 == null || c0945l0.f2978d == 0) {
                    c4652c = this;
                    m9107a();
                } else {
                    c4652c = this;
                    AbstractC4666q abstractC4666qM9105z = c4652c.m9105z(this.f15483o.mo9109g(), c0945l0, mapM9121b, this.f15483o.mo9108d());
                    if (!abstractC4666qM9105z.equals(C4657h.f15494b)) {
                        return abstractC4666qM9105z;
                    }
                    C0945l0 c0945l0Mo9103x = c4652c.f15483o.mo9103x();
                    if (c0945l0Mo9103x != null) {
                        c0945l0Mo9103x.m2337j(c0945l0);
                    } else {
                        c4652c.f15483o.mo9093B(c0945l0);
                        c4652c.f15477h = null;
                    }
                }
                if (AbstractC1416l.m3828d(c4652c.f15483o.mo9109g(), j3) < 0) {
                    c4652c.f15483o.m9102v();
                }
                C4651b c4651b2 = c4652c.f15483o;
                c4651b2.mo9112r(c4651b2.mo9108d().m9116c(j3).m9115a(c4652c.f15479j));
                c4652c.f15483o.m9092A(j3);
                C4651b c4651b3 = c4652c.f15483o;
                int i9 = c4652c.f15492d;
                c4652c.f15492d = -1;
                if (i9 >= 0) {
                    int[] iArr = c4651b3.f15480k;
                    iArr.getClass();
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i9;
                    c4651b3.f15480k = iArrCopyOf;
                } else {
                    c4651b3.getClass();
                }
                C4651b c4651b4 = c4652c.f15483o;
                C4659j c4659j = c4652c.f15479j;
                c4651b4.getClass();
                synchronized (obj) {
                    c4651b4.f15479j = c4651b4.f15479j.m9118e(c4659j);
                    C4651b c4651b5 = c4652c.f15483o;
                    int[] iArr2 = c4652c.f15480k;
                    c4651b5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = c4651b5.f15480k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            iArr2 = iArrCopyOf2;
                        }
                        c4651b5.f15480k = iArr2;
                    }
                }
                c4652c.f15482m = true;
                if (!c4652c.f15484p) {
                    c4652c.f15484p = true;
                    c4652c.f15483o.mo9088l();
                }
                return C4657h.f15494b;
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }
}
