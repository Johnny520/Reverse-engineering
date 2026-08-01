package p238;

import androidx.profileinstaller.AbstractC3275;

/* JADX INFO: renamed from: 飘花落叶言楪世哲兰苏子.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8820 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Class f22419;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Class f22420;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Class f22421;

    public C8820(Class cls, Class cls2, Class cls3) {
        this.f22421 = cls;
        this.f22420 = cls2;
        this.f22419 = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8820.class != obj.getClass()) {
            return false;
        }
        C8820 c8820 = (C8820) obj;
        return this.f22421.equals(c8820.f22421) && this.f22420.equals(c8820.f22420) && AbstractC8818.m14031(this.f22419, c8820.f22419);
    }

    public final int hashCode() {
        int iM5129 = AbstractC3275.m5129(this.f22421.hashCode() * 31, 31, this.f22420);
        Class cls = this.f22419;
        return iM5129 + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f22421 + ", second=" + this.f22420 + '}';
    }
}
