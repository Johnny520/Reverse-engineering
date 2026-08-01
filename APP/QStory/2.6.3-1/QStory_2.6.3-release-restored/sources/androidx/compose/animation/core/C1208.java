package androidx.compose.animation.core;

import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1208 implements InterfaceC1184 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC1181 f1579;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f1580;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f1581;

    public C1208(int i, int i2, InterfaceC1181 interfaceC1181) {
        this.f1581 = i;
        this.f1580 = i2;
        this.f1579 = interfaceC1181;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1208) {
            C1208 c1208 = (C1208) obj;
            if (c1208.f1581 == this.f1581 && c1208.f1580 == this.f1580 && AbstractC5227.m9466(c1208.f1579, this.f1579)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f1579.hashCode() + (this.f1581 * 31)) * 31) + this.f1580;
    }

    @Override // androidx.compose.animation.core.InterfaceC1195
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC1206 mo1487(InterfaceC1204 interfaceC1204) {
        return new C1164(this.f1581, this.f1580, this.f1579);
    }

    @Override // androidx.compose.animation.core.InterfaceC1184, androidx.compose.animation.core.InterfaceC1195
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC1168 mo1487(InterfaceC1204 interfaceC1204) {
        return new C1164(this.f1581, this.f1580, this.f1579);
    }
}
