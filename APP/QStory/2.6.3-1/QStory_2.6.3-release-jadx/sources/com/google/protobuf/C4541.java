package com.google.protobuf;

import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏子兰楪哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4541 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C4541 f11868 = new C4540().m8519();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public List f11869;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public List f11870;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C4262 f11871;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C4445 f11872;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C4262 f11873;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m8521(C4541 c4541, int i, InterfaceC4560 interfaceC4560) {
        c4541.getClass();
        C4259 c4259 = (C4259) interfaceC4560;
        if (Writer$FieldOrder.ASCENDING == Writer$FieldOrder.DESCENDING) {
            for (int size = c4541.f11870.size() - 1; size >= 0; size--) {
                c4259.m8110(i, (ByteString) c4541.f11870.get(size));
            }
            return;
        }
        for (int i2 = 0; i2 < c4541.f11870.size(); i2++) {
            c4259.m8110(i, (ByteString) c4541.f11870.get(i2));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4541)) {
            return false;
        }
        C4541 c4541 = (C4541) obj;
        return Objects.equals(this.f11873, c4541.f11873) && Objects.equals(this.f11872, c4541.f11872) && Objects.equals(this.f11871, c4541.f11871) && Objects.equals(this.f11870, c4541.f11870) && Objects.equals(this.f11869, c4541.f11869);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f11869) + ((Objects.hashCode(this.f11870) + ((Objects.hashCode(this.f11871) + ((Objects.hashCode(this.f11872) + ((Objects.hashCode(this.f11873) + 31) * 31)) * 31)) * 31)) * 31);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m8522(int i, InterfaceC4560 interfaceC4560) {
        C4262 c4262 = this.f11873;
        C4259 c4259 = (C4259) interfaceC4560;
        AbstractC4294 abstractC4294 = (AbstractC4294) c4259.f11434;
        c4259.m8105(i, c4262, false);
        c4259.m8112(i, this.f11872, false);
        c4259.m8115(i, this.f11871, false);
        List list = this.f11870;
        for (int i2 = 0; i2 < list.size(); i2++) {
            abstractC4294.mo8225(i, (ByteString) list.get(i2));
        }
        Writer$FieldOrder writer$FieldOrder = Writer$FieldOrder.ASCENDING;
        for (int i3 = 0; i3 < this.f11869.size(); i3++) {
            abstractC4294.mo8214(i, 3);
            ((C4536) this.f11869.get(i3)).writeTo(c4259);
            abstractC4294.mo8214(i, 4);
        }
    }
}
