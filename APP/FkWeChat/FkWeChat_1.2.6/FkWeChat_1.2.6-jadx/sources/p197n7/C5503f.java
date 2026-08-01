package p197n7;

import p024b9.AbstractC1061t;
import p281t6.C8140d;

/* JADX INFO: renamed from: n7.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5503f {

    /* JADX INFO: renamed from: a */
    public final C8140d f17157a;

    /* JADX INFO: renamed from: b */
    public final double f17158b;

    public C5503f(C8140d c8140d, double d10) {
        c8140d.getClass();
        this.f17157a = c8140d;
        this.f17158b = d10;
        if (0.0d > d10 || d10 > 1.0d) {
            throw new IllegalArgumentException(("Quality should be in range [0, 1]: " + d10).toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public final C8140d m22359a() {
        return this.f17157a;
    }

    /* JADX INFO: renamed from: b */
    public final C8140d m22360b() {
        return this.f17157a;
    }

    /* JADX INFO: renamed from: c */
    public final double m22361c() {
        return this.f17158b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5503f)) {
            return false;
        }
        C5503f c5503f = (C5503f) obj;
        return AbstractC1061t.m3842c(this.f17157a, c5503f.f17157a) && Double.compare(this.f17158b, c5503f.f17158b) == 0;
    }

    public int hashCode() {
        return (this.f17157a.hashCode() * 31) + Double.hashCode(this.f17158b);
    }

    public String toString() {
        return "ContentTypeWithQuality(contentType=" + this.f17157a + ", quality=" + this.f17158b + ')';
    }
}
