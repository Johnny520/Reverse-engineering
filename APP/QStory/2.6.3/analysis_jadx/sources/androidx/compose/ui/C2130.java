package androidx.compose.ui;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6554;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.ui.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2130 implements InterfaceC2129 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC2129 f6293;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC2129 f6294;

    public C2130(InterfaceC2129 interfaceC2129, InterfaceC2129 interfaceC21292) {
        this.f6294 = interfaceC2129;
        this.f6293 = interfaceC21292;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2130)) {
            return false;
        }
        C2130 c2130 = (C2130) obj;
        return this.f6294.equals(c2130.f6294) && AbstractC4395.m8907(this.f6293, c2130.f6293);
    }

    public final int hashCode() {
        return (this.f6293.hashCode() * 31) + this.f6294.hashCode();
    }

    public final String toString() {
        return AbstractC0053.m148(new StringBuilder("["), (String) mo3864("", new InterfaceC6554() { // from class: androidx.compose.ui.CombinedModifier$toString$1
            @Override // p052.InterfaceC6554
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
    public final Object mo3864(Object obj, InterfaceC6554 interfaceC6554) {
        return this.f6293.mo3864(this.f6294.mo3864(obj, interfaceC6554), interfaceC6554);
    }

    @Override // androidx.compose.ui.InterfaceC2129
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo3865(InterfaceC6558 interfaceC6558) {
        return this.f6294.mo3865(interfaceC6558) && this.f6293.mo3865(interfaceC6558);
    }
}
