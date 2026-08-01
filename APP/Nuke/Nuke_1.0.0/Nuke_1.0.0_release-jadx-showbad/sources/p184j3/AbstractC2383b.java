package p184j3;

import java.util.Arrays;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p117X2.AbstractC1665j;
import p172h3.EnumC2241a;

/* JADX INFO: renamed from: j3.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2383b {

    /* JADX INFO: renamed from: d */
    public AbstractC2385d[] f7725d;

    /* JADX INFO: renamed from: e */
    public int f7726e;

    /* JADX INFO: renamed from: f */
    public int f7727f;

    /* JADX INFO: renamed from: g */
    public C2402u f7728g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final AbstractC2385d m4233a() {
        AbstractC2385d abstractC2385dMo4145b;
        C2402u c2402u;
        synchronized (this) {
            try {
                AbstractC2385d[] abstractC2385dArrMo4146d = this.f7725d;
                if (abstractC2385dArrMo4146d == null) {
                    abstractC2385dArrMo4146d = mo4146d();
                    this.f7725d = abstractC2385dArrMo4146d;
                } else if (this.f7726e >= abstractC2385dArrMo4146d.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(abstractC2385dArrMo4146d, abstractC2385dArrMo4146d.length * 2);
                    AbstractC1665j.m2984d(objArrCopyOf, "copyOf(...)");
                    this.f7725d = (AbstractC2385d[]) objArrCopyOf;
                    abstractC2385dArrMo4146d = (AbstractC2385d[]) objArrCopyOf;
                }
                int i5 = this.f7727f;
                do {
                    abstractC2385dMo4145b = abstractC2385dArrMo4146d[i5];
                    if (abstractC2385dMo4145b == null) {
                        abstractC2385dMo4145b = mo4145b();
                        abstractC2385dArrMo4146d[i5] = abstractC2385dMo4145b;
                    }
                    i5++;
                    if (i5 >= abstractC2385dArrMo4146d.length) {
                        i5 = 0;
                    }
                } while (!abstractC2385dMo4145b.mo4149a(this));
                this.f7727f = i5;
                this.f7726e++;
                c2402u = this.f7728g;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c2402u != null) {
            c2402u.m4242w(1);
        }
        return abstractC2385dMo4145b;
    }

    /* JADX INFO: renamed from: b */
    public abstract AbstractC2385d mo4145b();

    /* JADX INFO: renamed from: d */
    public abstract AbstractC2385d[] mo4146d();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m4234e(AbstractC2385d abstractC2385d) {
        C2402u c2402u;
        int i5;
        InterfaceC1046d[] interfaceC1046dArrMo4150b;
        synchronized (this) {
            try {
                int i6 = this.f7726e - 1;
                this.f7726e = i6;
                c2402u = this.f7728g;
                if (i6 == 0) {
                    this.f7727f = 0;
                }
                AbstractC1665j.m2983c(abstractC2385d, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                interfaceC1046dArrMo4150b = abstractC2385d.mo4150b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC1046d interfaceC1046d : interfaceC1046dArrMo4150b) {
            if (interfaceC1046d != null) {
                interfaceC1046d.mo278i(C0891q.f2780a);
            }
        }
        if (c2402u != null) {
            c2402u.m4242w(-1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final C2402u m4235f() {
        C2402u c2402u;
        synchronized (this) {
            c2402u = this.f7728g;
            if (c2402u == null) {
                int i5 = this.f7726e;
                c2402u = new C2402u(1, Integer.MAX_VALUE, EnumC2241a.f7352e);
                c2402u.m4159q(Integer.valueOf(i5));
                this.f7728g = c2402u;
            }
        }
        return c2402u;
    }
}
