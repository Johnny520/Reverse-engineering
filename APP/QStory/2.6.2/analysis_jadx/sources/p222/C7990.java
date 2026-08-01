package p222;

import androidx.profileinstaller.AbstractC2442;

/* JADX INFO: renamed from: 飘花落叶言楪世哲兰苏子.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7990 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Class f22077;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Class f22078;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Class f22079;

    public C7990(Class cls, Class cls2, Class cls3) {
        this.f22079 = cls;
        this.f22078 = cls2;
        this.f22077 = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7990.class != obj.getClass()) {
            return false;
        }
        C7990 c7990 = (C7990) obj;
        return this.f22079.equals(c7990.f22079) && this.f22078.equals(c7990.f22078) && AbstractC7988.m13444(this.f22077, c7990.f22077);
    }

    public final int hashCode() {
        int iM4559 = AbstractC2442.m4559(this.f22079.hashCode() * 31, 31, this.f22078);
        Class cls = this.f22077;
        return iM4559 + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f22079 + ", second=" + this.f22078 + '}';
    }
}
