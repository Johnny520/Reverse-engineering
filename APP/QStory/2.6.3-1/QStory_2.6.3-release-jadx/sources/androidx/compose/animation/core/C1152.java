package androidx.compose.animation.core;

import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1152 implements InterfaceC1195 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f1385;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final RepeatMode f1386;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC1184 f1387;

    public C1152(InterfaceC1184 interfaceC1184, RepeatMode repeatMode, long j) {
        this.f1387 = interfaceC1184;
        this.f1386 = repeatMode;
        this.f1385 = j;
        if (interfaceC1184 instanceof C1208) {
            C1208 c1208 = (C1208) interfaceC1184;
            if (c1208.f1581 != 0 || c1208.f1580 != 0) {
                return;
            }
        } else if (!(interfaceC1184 instanceof C1143)) {
            return;
        }
        C6755.m11869("Animation to be infinitely repeated cannot have a 0-duration");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1152) {
            C1152 c1152 = (C1152) obj;
            if (c1152.f1387.equals(this.f1387) && c1152.f1386 == this.f1386 && c1152.f1385 == this.f1385) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1385) + ((this.f1386.hashCode() + (this.f1387.hashCode() * 31)) * 31);
    }

    @Override // androidx.compose.animation.core.InterfaceC1195
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC1206 mo1487(InterfaceC1204 interfaceC1204) {
        return new C1169(this.f1387.mo1487(interfaceC1204), this.f1386, this.f1385);
    }
}
