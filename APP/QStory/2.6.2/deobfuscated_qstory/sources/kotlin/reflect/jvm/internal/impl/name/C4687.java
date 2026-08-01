package kotlin.reflect.jvm.internal.impl.name;

import kotlin.jvm.internal.AbstractC4394;
import kotlin.text.AbstractC5138;
import kotlin.text.AbstractC5143;
import net.bytebuddy.pool.TypePool;
import p007.AbstractC6136;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4687 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f13693;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4686 f13694;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4686 f13695;

    public C4687(C4686 c4686, C4686 c46862, boolean z) {
        c4686.getClass();
        c46862.getClass();
        this.f13695 = c4686;
        this.f13694 = c46862;
        this.f13693 = z;
        c46862.f13692.m9324();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String m9332(C4686 c4686) {
        String str = c4686.f13692.f13689;
        return AbstractC5143.m10172(str, '/') ? AbstractC6136.m11558('`', "`", str) : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4687)) {
            return false;
        }
        C4687 c4687 = (C4687) obj;
        return AbstractC4394.m8917(this.f13695, c4687.f13695) && AbstractC4394.m8917(this.f13694, c4687.f13694) && this.f13693 == c4687.f13693;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13693) + ((this.f13694.hashCode() + (this.f13695.hashCode() * 31)) * 31);
    }

    public final String toString() {
        boolean zM9324 = this.f13695.f13692.m9324();
        String strM9336 = m9336();
        return zM9324 ? "/".concat(strM9336) : strM9336;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C4690 m9333() {
        return this.f13694.f13692.m9328();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C4687 m9334() {
        C4686 c4686M9330 = this.f13694.m9330();
        if (c4686M9330.f13692.m9324()) {
            return null;
        }
        return new C4687(this.f13695, c4686M9330, this.f13693);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4687 m9335(C4690 c4690) {
        c4690.getClass();
        return new C4687(this.f13695, this.f13694.m9331(c4690), this.f13693);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String m9336() {
        C4686 c4686 = this.f13695;
        boolean zM9324 = c4686.f13692.m9324();
        C4686 c46862 = this.f13694;
        if (zM9324) {
            return m9332(c46862);
        }
        return AbstractC5138.m10129(c4686.f13692.f13689, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/') + "/" + m9332(c46862);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4686 m9337() {
        C4686 c4686 = this.f13695;
        boolean zM9324 = c4686.f13692.m9324();
        C4686 c46862 = this.f13694;
        if (zM9324) {
            return c46862;
        }
        return new C4686(c4686.f13692.f13689 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + c46862.f13692.f13689);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean m9338() {
        return !this.f13694.m9330().f13692.m9324();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4687(C4686 c4686, C4690 c4690) {
        this(c4686, AbstractC4683.m9318(c4690), false);
        c4686.getClass();
        c4690.getClass();
        C4686 c46862 = C4686.f13690;
    }
}
