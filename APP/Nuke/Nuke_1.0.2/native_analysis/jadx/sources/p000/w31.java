package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class w31 extends i41 {

    /* JADX INFO: renamed from: h */
    public final boolean f12292h;

    /* JADX INFO: renamed from: i */
    public final String f12293i;

    public w31(Serializable serializable, boolean z) {
        serializable.getClass();
        this.f12292h = z;
        this.f12293i = serializable.toString();
    }

    @Override // p000.i41
    /* JADX INFO: renamed from: a */
    public final String mo2263a() {
        return this.f12293i;
    }

    @Override // p000.i41
    /* JADX INFO: renamed from: b */
    public final boolean mo2264b() {
        return this.f12292h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w31.class != obj.getClass()) {
            return false;
        }
        w31 w31Var = (w31) obj;
        return this.f12292h == w31Var.f12292h && t11.m5086l(this.f12293i, w31Var.f12293i);
    }

    public final int hashCode() {
        return this.f12293i.hashCode() + (Boolean.hashCode(this.f12292h) * 31);
    }

    @Override // p000.i41
    public final String toString() {
        boolean z = this.f12292h;
        String str = this.f12293i;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        mv2.m3212a(sb, str);
        return sb.toString();
    }
}
