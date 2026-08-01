package kotlin.reflect.jvm.internal.impl.name;

import kotlin.jvm.internal.AbstractC4395;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4687 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4687 f13694 = new C4687("");

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public transient C4687 f13695;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4686 f13696;

    public C4687(String str) {
        str.getClass();
        this.f13696 = new C4686(str, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4687) {
            return AbstractC4395.m8907(this.f13696, ((C4687) obj).f13696);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13696.f13693.hashCode();
    }

    public final String toString() {
        return this.f13696.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4687 m9320() {
        C4687 c4687 = this.f13695;
        if (c4687 != null) {
            return c4687;
        }
        C4686 c4686 = this.f13696;
        if (c4686.m9314()) {
            C5925.m11311("root");
            return null;
        }
        C4687 c46872 = new C4687(c4686.m9312());
        this.f13695 = c46872;
        return c46872;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4687 m9321(C4691 c4691) {
        c4691.getClass();
        return new C4687(this.f13696.m9316(c4691), this);
    }

    public C4687(C4686 c4686) {
        this.f13696 = c4686;
    }

    public C4687(C4686 c4686, C4687 c4687) {
        this.f13696 = c4686;
        this.f13695 = c4687;
    }
}
