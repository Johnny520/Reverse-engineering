package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: k5 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0375k5 implements wn0, Serializable {

    /* JADX INFO: renamed from: h */
    public final Object f5339h;

    /* JADX INFO: renamed from: i */
    public final Class f5340i;

    /* JADX INFO: renamed from: j */
    public final String f5341j;

    /* JADX INFO: renamed from: k */
    public final String f5342k;

    /* JADX INFO: renamed from: l */
    public final boolean f5343l = false;

    /* JADX INFO: renamed from: m */
    public final int f5344m;

    /* JADX INFO: renamed from: n */
    public final int f5345n;

    public AbstractC0375k5(int i, int i2, Class cls, Object obj, String str, String str2) {
        this.f5339h = obj;
        this.f5340i = cls;
        this.f5341j = str;
        this.f5342k = str2;
        this.f5344m = i;
        this.f5345n = i2 >> 1;
    }

    @Override // p000.wn0
    /* JADX INFO: renamed from: c */
    public final int mo2601c() {
        return this.f5344m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC0375k5)) {
            return false;
        }
        AbstractC0375k5 abstractC0375k5 = (AbstractC0375k5) obj;
        return this.f5343l == abstractC0375k5.f5343l && this.f5344m == abstractC0375k5.f5344m && this.f5345n == abstractC0375k5.f5345n && this.f5339h.equals(abstractC0375k5.f5339h) && this.f5340i.equals(abstractC0375k5.f5340i) && this.f5341j.equals(abstractC0375k5.f5341j) && this.f5342k.equals(abstractC0375k5.f5342k);
    }

    public final int hashCode() {
        return ((((hk1.m2207f(this.f5342k, hk1.m2207f(this.f5341j, (this.f5340i.hashCode() + (this.f5339h.hashCode() * 31)) * 31, 31), 31) + (this.f5343l ? 1231 : 1237)) * 31) + this.f5344m) * 31) + this.f5345n;
    }

    public final String toString() {
        d72.f1901a.getClass();
        return e72.m1288a(this);
    }
}
