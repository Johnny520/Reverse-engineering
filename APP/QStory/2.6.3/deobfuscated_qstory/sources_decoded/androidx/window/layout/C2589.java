package androidx.window.layout;

import p147.C7567;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.window.layout.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2589 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2590 f7763;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2590 f7764;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7567 f7765;

    public C2589(C7567 c7567, C2590 c2590, C2590 c25902) {
        this.f7765 = c7567;
        this.f7764 = c2590;
        this.f7763 = c25902;
        if (c7567.m12793() == 0 && c7567.m12794() == 0) {
            C5925.m11310("Bounds must be non zero");
            throw null;
        }
        if (c7567.f20482 == 0 || c7567.f20481 == 0) {
            return;
        }
        C5925.m11310("Bounding rectangle must start at the top or left window edge for folding features");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (C2589.class.equals(obj != null ? obj.getClass() : null)) {
            obj.getClass();
            C2589 c2589 = (C2589) obj;
            return this.f7765.equals(c2589.f7765) && this.f7764 == c2589.f7764 && this.f7763 == c2589.f7763;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7763.hashCode() + ((this.f7764.hashCode() + (this.f7765.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return C2589.class.getSimpleName() + " { " + this.f7765 + ", type=" + this.f7764 + ", state=" + this.f7763 + " }";
    }
}
