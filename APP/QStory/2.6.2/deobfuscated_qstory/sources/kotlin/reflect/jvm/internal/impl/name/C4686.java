package kotlin.reflect.jvm.internal.impl.name;

import kotlin.jvm.internal.AbstractC4394;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4686 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4686 f13690 = new C4686("");

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public transient C4686 f13691;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4685 f13692;

    public C4686(String str) {
        str.getClass();
        this.f13692 = new C4685(str, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4686) {
            return AbstractC4394.m8917(this.f13692, ((C4686) obj).f13692);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13692.f13689.hashCode();
    }

    public final String toString() {
        return this.f13692.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4686 m9330() {
        C4686 c4686 = this.f13691;
        if (c4686 != null) {
            return c4686;
        }
        C4685 c4685 = this.f13692;
        if (c4685.m9324()) {
            C5919.m11250("root");
            return null;
        }
        C4686 c46862 = new C4686(c4685.m9322());
        this.f13691 = c46862;
        return c46862;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4686 m9331(C4690 c4690) {
        c4690.getClass();
        return new C4686(this.f13692.m9326(c4690), this);
    }

    public C4686(C4685 c4685) {
        this.f13692 = c4685;
    }

    public C4686(C4685 c4685, C4686 c4686) {
        this.f13692 = c4685;
        this.f13691 = c4686;
    }
}
