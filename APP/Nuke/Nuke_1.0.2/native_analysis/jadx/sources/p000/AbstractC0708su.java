package p000;

/* JADX INFO: renamed from: su */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0708su {

    /* JADX INFO: renamed from: a */
    public final String f10368a;

    /* JADX INFO: renamed from: b */
    public final long f10369b;

    /* JADX INFO: renamed from: c */
    public final int f10370c;

    public AbstractC0708su(String str, long j, int i) {
        this.f10368a = str;
        this.f10369b = j;
        this.f10370c = i;
        if (str.length() == 0) {
            C0676s.m4651j("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i < -1 || i > 63) {
            C0676s.m4651j("The id must be between -1 and 63");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract float mo1719a(int i);

    /* JADX INFO: renamed from: b */
    public abstract float mo1720b(int i);

    /* JADX INFO: renamed from: c */
    public boolean mo2624c() {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public abstract long mo1721d(float f, float f2, float f3);

    /* JADX INFO: renamed from: e */
    public abstract float mo1722e(float f, float f2, float f3);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC0708su abstractC0708su = (AbstractC0708su) obj;
        if (this.f10370c == abstractC0708su.f10370c && this.f10368a.equals(abstractC0708su.f10368a)) {
            return tp0.m5371s(this.f10369b, abstractC0708su.f10369b);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public abstract long mo1723f(float f, float f2, float f3, float f4, AbstractC0708su abstractC0708su);

    public int hashCode() {
        return hk1.m2204c(this.f10368a.hashCode() * 31, 31, this.f10369b) + this.f10370c;
    }

    public final String toString() {
        return this.f10368a + " (id=" + this.f10370c + ", model=" + ((Object) tp0.m5353Q(this.f10369b)) + ')';
    }
}
