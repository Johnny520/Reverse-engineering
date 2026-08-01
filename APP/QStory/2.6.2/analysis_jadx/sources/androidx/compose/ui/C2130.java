package androidx.compose.ui;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6553;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.ui.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2130 implements InterfaceC2129 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC2129 f6292;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC2129 f6293;

    public C2130(InterfaceC2129 interfaceC2129, InterfaceC2129 interfaceC21292) {
        this.f6293 = interfaceC2129;
        this.f6292 = interfaceC21292;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2130)) {
            return false;
        }
        C2130 c2130 = (C2130) obj;
        return this.f6293.equals(c2130.f6293) && AbstractC4394.m8917(this.f6292, c2130.f6292);
    }

    public final int hashCode() {
        return (this.f6292.hashCode() * 31) + this.f6293.hashCode();
    }

    public final String toString() {
        return AbstractC0053.m155(new StringBuilder("["), (String) mo3854("", new InterfaceC6553() { // from class: androidx.compose.ui.CombinedModifier$toString$1
            @Override // p052.InterfaceC6553
            public final String invoke(String str, InterfaceC2124 interfaceC2124) {
                if (str.length() == 0) {
                    return interfaceC2124.toString();
                }
                return str + ", " + interfaceC2124;
            }
        }), ']');
    }

    @Override // androidx.compose.ui.InterfaceC2129
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo3854(Object obj, InterfaceC6553 interfaceC6553) {
        return this.f6292.mo3854(this.f6293.mo3854(obj, interfaceC6553), interfaceC6553);
    }

    @Override // androidx.compose.ui.InterfaceC2129
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo3855(InterfaceC6557 interfaceC6557) {
        return this.f6293.mo3855(interfaceC6557) && this.f6292.mo3855(interfaceC6557);
    }
}
