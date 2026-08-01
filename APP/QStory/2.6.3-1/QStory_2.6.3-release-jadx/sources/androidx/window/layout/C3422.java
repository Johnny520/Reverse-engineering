package androidx.window.layout;

import p163.C8396;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.window.layout.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3422 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C3423 f8108;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3423 f8109;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8396 f8110;

    public C3422(C8396 c8396, C3423 c3423, C3423 c34232) {
        this.f8110 = c8396;
        this.f8109 = c3423;
        this.f8108 = c34232;
        if (c8396.m13352() == 0 && c8396.m13353() == 0) {
            C6755.m11869("Bounds must be non zero");
            throw null;
        }
        if (c8396.f20827 == 0 || c8396.f20826 == 0) {
            return;
        }
        C6755.m11869("Bounding rectangle must start at the top or left window edge for folding features");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (C3422.class.equals(obj != null ? obj.getClass() : null)) {
            obj.getClass();
            C3422 c3422 = (C3422) obj;
            return this.f8110.equals(c3422.f8110) && this.f8109 == c3422.f8109 && this.f8108 == c3422.f8108;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8108.hashCode() + ((this.f8109.hashCode() + (this.f8110.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return C3422.class.getSimpleName() + " { " + this.f8110 + ", type=" + this.f8109 + ", state=" + this.f8108 + " }";
    }
}
