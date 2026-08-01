package com.google.protobuf;

import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏子兰楪哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3709 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C3709 f11523 = new C3708().m7960();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public List f11524;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public List f11525;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C3430 f11526;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C3613 f11527;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C3430 f11528;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m7962(C3709 c3709, int i, InterfaceC3728 interfaceC3728) {
        c3709.getClass();
        C3427 c3427 = (C3427) interfaceC3728;
        if (Writer$FieldOrder.ASCENDING == Writer$FieldOrder.DESCENDING) {
            for (int size = c3709.f11525.size() - 1; size >= 0; size--) {
                c3427.m7551(i, (ByteString) c3709.f11525.get(size));
            }
            return;
        }
        for (int i2 = 0; i2 < c3709.f11525.size(); i2++) {
            c3427.m7551(i, (ByteString) c3709.f11525.get(i2));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3709)) {
            return false;
        }
        C3709 c3709 = (C3709) obj;
        return Objects.equals(this.f11528, c3709.f11528) && Objects.equals(this.f11527, c3709.f11527) && Objects.equals(this.f11526, c3709.f11526) && Objects.equals(this.f11525, c3709.f11525) && Objects.equals(this.f11524, c3709.f11524);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f11524) + ((Objects.hashCode(this.f11525) + ((Objects.hashCode(this.f11526) + ((Objects.hashCode(this.f11527) + ((Objects.hashCode(this.f11528) + 31) * 31)) * 31)) * 31)) * 31);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7963(int i, InterfaceC3728 interfaceC3728) {
        C3430 c3430 = this.f11528;
        C3427 c3427 = (C3427) interfaceC3728;
        AbstractC3462 abstractC3462 = (AbstractC3462) c3427.f11089;
        c3427.m7546(i, c3430, false);
        c3427.m7553(i, this.f11527, false);
        c3427.m7556(i, this.f11526, false);
        List list = this.f11525;
        for (int i2 = 0; i2 < list.size(); i2++) {
            abstractC3462.mo7666(i, (ByteString) list.get(i2));
        }
        Writer$FieldOrder writer$FieldOrder = Writer$FieldOrder.ASCENDING;
        for (int i3 = 0; i3 < this.f11524.size(); i3++) {
            abstractC3462.mo7655(i, 3);
            ((C3704) this.f11524.get(i3)).writeTo(c3427);
            abstractC3462.mo7655(i, 4);
        }
    }
}
