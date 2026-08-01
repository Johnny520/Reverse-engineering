package androidx.compose.p001ui;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7383;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.ui.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2963 implements InterfaceC2962 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC2962 f6638;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC2962 f6639;

    public C2963(InterfaceC2962 interfaceC2962, InterfaceC2962 interfaceC29622) {
        this.f6639 = interfaceC2962;
        this.f6638 = interfaceC29622;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2963)) {
            return false;
        }
        C2963 c2963 = (C2963) obj;
        return this.f6639.equals(c2963.f6639) && AbstractC5227.m9466(this.f6638, c2963.f6638);
    }

    public final int hashCode() {
        return (this.f6638.hashCode() * 31) + this.f6639.hashCode();
    }

    public final String toString() {
        return AbstractC0900.m708(new StringBuilder("["), (String) mo4424("", new InterfaceC7383() { // from class: androidx.compose.ui.CombinedModifier$toString$1
            @Override // p068.InterfaceC7383
            public final String invoke(String str, InterfaceC2957 interfaceC2957) {
                if (str.length() == 0) {
                    return interfaceC2957.toString();
                }
                return str + ", " + interfaceC2957;
            }
        }), ']');
    }

    @Override // androidx.compose.p001ui.InterfaceC2962
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo4424(Object obj, InterfaceC7383 interfaceC7383) {
        return this.f6638.mo4424(this.f6639.mo4424(obj, interfaceC7383), interfaceC7383);
    }

    @Override // androidx.compose.p001ui.InterfaceC2962
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo4425(InterfaceC7387 interfaceC7387) {
        return this.f6639.mo4425(interfaceC7387) && this.f6638.mo4425(interfaceC7387);
    }
}
