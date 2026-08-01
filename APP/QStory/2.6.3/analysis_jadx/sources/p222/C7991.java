package p222;

import androidx.profileinstaller.AbstractC2442;

/* JADX INFO: renamed from: 飘花落叶言楪世哲兰苏子.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7991 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Class f22074;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Class f22075;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Class f22076;

    public C7991(Class cls, Class cls2, Class cls3) {
        this.f22076 = cls;
        this.f22075 = cls2;
        this.f22074 = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7991.class != obj.getClass()) {
            return false;
        }
        C7991 c7991 = (C7991) obj;
        return this.f22076.equals(c7991.f22076) && this.f22075.equals(c7991.f22075) && AbstractC7989.m13472(this.f22074, c7991.f22074);
    }

    public final int hashCode() {
        int iM4569 = AbstractC2442.m4569(this.f22076.hashCode() * 31, 31, this.f22075);
        Class cls = this.f22074;
        return iM4569 + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f22076 + ", second=" + this.f22075 + '}';
    }
}
