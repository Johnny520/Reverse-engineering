package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: n3 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0484n3 {

    /* JADX INFO: renamed from: h */
    public AbstractC0527o3[] f6973h;

    /* JADX INFO: renamed from: i */
    public int f6974i;

    /* JADX INFO: renamed from: j */
    public int f6975j;

    /* JADX INFO: renamed from: k */
    public kw2 f6976k;

    /* JADX INFO: renamed from: b */
    public final AbstractC0527o3 m3229b() {
        AbstractC0527o3 abstractC0527o3Mo2573c;
        kw2 kw2Var;
        synchronized (this) {
            try {
                AbstractC0527o3[] abstractC0527o3ArrMo2574d = this.f6973h;
                if (abstractC0527o3ArrMo2574d == null) {
                    abstractC0527o3ArrMo2574d = mo2574d();
                    this.f6973h = abstractC0527o3ArrMo2574d;
                } else if (this.f6974i >= abstractC0527o3ArrMo2574d.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(abstractC0527o3ArrMo2574d, abstractC0527o3ArrMo2574d.length * 2);
                    this.f6973h = (AbstractC0527o3[]) objArrCopyOf;
                    abstractC0527o3ArrMo2574d = (AbstractC0527o3[]) objArrCopyOf;
                }
                int i = this.f6975j;
                do {
                    abstractC0527o3Mo2573c = abstractC0527o3ArrMo2574d[i];
                    if (abstractC0527o3Mo2573c == null) {
                        abstractC0527o3Mo2573c = mo2573c();
                        abstractC0527o3ArrMo2574d[i] = abstractC0527o3Mo2573c;
                    }
                    i++;
                    if (i >= abstractC0527o3ArrMo2574d.length) {
                        i = 0;
                    }
                } while (!abstractC0527o3Mo2573c.mo2738a(this));
                this.f6975j = i;
                this.f6974i++;
                kw2Var = this.f6976k;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (kw2Var != null) {
            kw2Var.m2752v(1);
        }
        return abstractC0527o3Mo2573c;
    }

    /* JADX INFO: renamed from: c */
    public abstract AbstractC0527o3 mo2573c();

    /* JADX INFO: renamed from: d */
    public abstract AbstractC0527o3[] mo2574d();

    /* JADX INFO: renamed from: e */
    public final void m3230e(AbstractC0527o3 abstractC0527o3) {
        kw2 kw2Var;
        int i;
        t00[] t00VarArrMo2739b;
        synchronized (this) {
            try {
                int i2 = this.f6974i - 1;
                this.f6974i = i2;
                kw2Var = this.f6976k;
                if (i2 == 0) {
                    this.f6975j = 0;
                }
                abstractC0527o3.getClass();
                t00VarArrMo2739b = abstractC0527o3.mo2739b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (t00 t00Var : t00VarArrMo2739b) {
            if (t00Var != null) {
                t00Var.mo2509h(a83.f116a);
            }
        }
        if (kw2Var != null) {
            kw2Var.m2752v(-1);
        }
    }

    /* JADX INFO: renamed from: f */
    public final kw2 m3231f() {
        kw2 kw2Var;
        synchronized (this) {
            kw2Var = this.f6976k;
            if (kw2Var == null) {
                int i = this.f6974i;
                kw2Var = new kw2(1, Integer.MAX_VALUE, EnumC0283hn.f4085i);
                kw2Var.m2963p(Integer.valueOf(i));
                this.f6976k = kw2Var;
            }
        }
        return kw2Var;
    }
}
