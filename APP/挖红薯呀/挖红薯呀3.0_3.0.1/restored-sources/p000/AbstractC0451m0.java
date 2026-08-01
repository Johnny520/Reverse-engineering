package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: m0 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0451m0 {

    /* JADX INFO: renamed from: d */
    public AbstractC0494n0[] f3636d;

    /* JADX INFO: renamed from: e */
    public int f3637e;

    /* JADX INFO: renamed from: f */
    public int f3638f;

    /* JADX INFO: renamed from: g */
    public b51 f3639g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final AbstractC0494n0 m2099a() {
        AbstractC0494n0 abstractC0494n0Mo982d;
        b51 b51Var;
        synchronized (this) {
            try {
                AbstractC0494n0[] abstractC0494n0ArrMo983e = this.f3636d;
                if (abstractC0494n0ArrMo983e == null) {
                    abstractC0494n0ArrMo983e = mo983e();
                    this.f3636d = abstractC0494n0ArrMo983e;
                } else if (this.f3637e >= abstractC0494n0ArrMo983e.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(abstractC0494n0ArrMo983e, abstractC0494n0ArrMo983e.length * 2);
                    this.f3636d = (AbstractC0494n0[]) objArrCopyOf;
                    abstractC0494n0ArrMo983e = (AbstractC0494n0[]) objArrCopyOf;
                }
                int i = this.f3638f;
                do {
                    abstractC0494n0Mo982d = abstractC0494n0ArrMo983e[i];
                    if (abstractC0494n0Mo982d == null) {
                        abstractC0494n0Mo982d = mo982d();
                        abstractC0494n0ArrMo983e[i] = abstractC0494n0Mo982d;
                    }
                    i++;
                    if (i >= abstractC0494n0ArrMo983e.length) {
                        i = 0;
                    }
                } while (!abstractC0494n0Mo982d.mo20a(this));
                this.f3638f = i;
                this.f3637e++;
                b51Var = this.f3639g;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (b51Var != null) {
            b51Var.m258w(1);
        }
        return abstractC0494n0Mo982d;
    }

    /* JADX INFO: renamed from: d */
    public abstract AbstractC0494n0 mo982d();

    /* JADX INFO: renamed from: e */
    public abstract AbstractC0494n0[] mo983e();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m2100g(AbstractC0494n0 abstractC0494n0) {
        b51 b51Var;
        int i;
        InterfaceC0322ik[] interfaceC0322ikArrMo21b;
        synchronized (this) {
            try {
                int i2 = this.f3637e - 1;
                this.f3637e = i2;
                b51Var = this.f3639g;
                if (i2 == 0) {
                    this.f3638f = 0;
                }
                abstractC0494n0.getClass();
                interfaceC0322ikArrMo21b = abstractC0494n0.mo21b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC0322ik interfaceC0322ik : interfaceC0322ikArrMo21b) {
            if (interfaceC0322ik != null) {
                interfaceC0322ik.mo541i(na1.f4229a);
            }
        }
        if (b51Var != null) {
            b51Var.m258w(-1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final b51 m2101h() {
        b51 b51Var;
        synchronized (this) {
            b51Var = this.f3639g;
            if (b51Var == null) {
                int i = this.f3637e;
                b51Var = new b51(1, Integer.MAX_VALUE, EnumC0758tb.f5969e);
                b51Var.m991q(Integer.valueOf(i));
                this.f3639g = b51Var;
            }
        }
        return b51Var;
    }
}
