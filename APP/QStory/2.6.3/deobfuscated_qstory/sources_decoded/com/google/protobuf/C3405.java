package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$FieldOptions;
import java.util.AbstractList;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世子苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3405 extends AbstractList {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC3406 f11060;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC3395 f11061;

    public C3405(InterfaceC3395 interfaceC3395, InterfaceC3406 interfaceC3406) {
        this.f11061 = interfaceC3395;
        this.f11060 = interfaceC3406;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iM7814 = ((C3613) this.f11061).m7814(i);
        ((C3526) this.f11060).getClass();
        DescriptorProtos$FieldOptions.OptionTargetType optionTargetTypeForNumber = DescriptorProtos$FieldOptions.OptionTargetType.forNumber(iM7814);
        return optionTargetTypeForNumber == null ? DescriptorProtos$FieldOptions.OptionTargetType.TARGET_TYPE_UNKNOWN : optionTargetTypeForNumber;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return ((C3613) this.f11061).f11252;
    }
}
