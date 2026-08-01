package com.google.protobuf;

import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏子兰楪哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3708 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C3708 f11518 = new C3707().m7973();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public List f11519;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public List f11520;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C3429 f11521;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C3612 f11522;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C3429 f11523;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m7975(C3708 c3708, int i, InterfaceC3727 interfaceC3727) {
        c3708.getClass();
        C3426 c3426 = (C3426) interfaceC3727;
        if (Writer$FieldOrder.ASCENDING == Writer$FieldOrder.DESCENDING) {
            for (int size = c3708.f11520.size() - 1; size >= 0; size--) {
                c3426.m7564(i, (ByteString) c3708.f11520.get(size));
            }
            return;
        }
        for (int i2 = 0; i2 < c3708.f11520.size(); i2++) {
            c3426.m7564(i, (ByteString) c3708.f11520.get(i2));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3708)) {
            return false;
        }
        C3708 c3708 = (C3708) obj;
        return Objects.equals(this.f11523, c3708.f11523) && Objects.equals(this.f11522, c3708.f11522) && Objects.equals(this.f11521, c3708.f11521) && Objects.equals(this.f11520, c3708.f11520) && Objects.equals(this.f11519, c3708.f11519);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f11519) + ((Objects.hashCode(this.f11520) + ((Objects.hashCode(this.f11521) + ((Objects.hashCode(this.f11522) + ((Objects.hashCode(this.f11523) + 31) * 31)) * 31)) * 31)) * 31);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7976(int i, InterfaceC3727 interfaceC3727) {
        C3429 c3429 = this.f11523;
        C3426 c3426 = (C3426) interfaceC3727;
        AbstractC3461 abstractC3461 = (AbstractC3461) c3426.f11084;
        c3426.m7559(i, c3429, false);
        c3426.m7566(i, this.f11522, false);
        c3426.m7569(i, this.f11521, false);
        List list = this.f11520;
        for (int i2 = 0; i2 < list.size(); i2++) {
            abstractC3461.mo7679(i, (ByteString) list.get(i2));
        }
        Writer$FieldOrder writer$FieldOrder = Writer$FieldOrder.ASCENDING;
        for (int i3 = 0; i3 < this.f11519.size(); i3++) {
            abstractC3461.mo7668(i, 3);
            ((C3703) this.f11519.get(i3)).writeTo(c3426);
            abstractC3461.mo7668(i, 4);
        }
    }
}
