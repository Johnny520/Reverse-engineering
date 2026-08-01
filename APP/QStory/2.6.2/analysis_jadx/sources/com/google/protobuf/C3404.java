package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$FieldOptions;
import java.util.AbstractList;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世子苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3404 extends AbstractList {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC3405 f11055;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC3394 f11056;

    public C3404(InterfaceC3394 interfaceC3394, InterfaceC3405 interfaceC3405) {
        this.f11056 = interfaceC3394;
        this.f11055 = interfaceC3405;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iM7827 = ((C3612) this.f11056).m7827(i);
        ((C3525) this.f11055).getClass();
        DescriptorProtos$FieldOptions.OptionTargetType optionTargetTypeForNumber = DescriptorProtos$FieldOptions.OptionTargetType.forNumber(iM7827);
        return optionTargetTypeForNumber == null ? DescriptorProtos$FieldOptions.OptionTargetType.TARGET_TYPE_UNKNOWN : optionTargetTypeForNumber;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return ((C3612) this.f11056).f11247;
    }
}
