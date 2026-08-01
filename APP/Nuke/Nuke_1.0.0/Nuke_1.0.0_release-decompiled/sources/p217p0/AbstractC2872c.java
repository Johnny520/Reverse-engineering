package p217p0;

import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: p0.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2872c {

    /* JADX INFO: renamed from: a */
    public final String f9068a;

    /* JADX INFO: renamed from: b */
    public final long f9069b;

    /* JADX INFO: renamed from: c */
    public final int f9070c;

    public AbstractC2872c(String str, long j5, int i5) {
        this.f9068a = str;
        this.f9069b = j5;
        this.f9070c = i5;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i5 < -1 || i5 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract float mo5070a(int i5);

    /* JADX INFO: renamed from: b */
    public abstract float mo5071b(int i5);

    /* JADX INFO: renamed from: c */
    public boolean mo5072c() {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public abstract long mo5073d(float f2, float f5, float f6);

    /* JADX INFO: renamed from: e */
    public abstract float mo5074e(float f2, float f5, float f6);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC2872c abstractC2872c = (AbstractC2872c) obj;
        if (this.f9070c == abstractC2872c.f9070c && AbstractC1665j.m2981a(this.f9068a, abstractC2872c.f9068a)) {
            return AbstractC2871b.m5068a(this.f9069b, abstractC2872c.f9069b);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public abstract long mo5075f(float f2, float f5, float f6, float f7, AbstractC2872c abstractC2872c);

    public int hashCode() {
        int iHashCode = this.f9068a.hashCode() * 31;
        int i5 = AbstractC2871b.f9067e;
        return AbstractC0231b.m392c(iHashCode, 31, this.f9069b) + this.f9070c;
    }

    public final String toString() {
        return this.f9068a + " (id=" + this.f9070c + ", model=" + ((Object) AbstractC2871b.m5069b(this.f9069b)) + ')';
    }
}
