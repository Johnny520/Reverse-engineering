package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$FieldOptions;
import java.util.AbstractList;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世子苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4237 extends AbstractList {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC4238 f11405;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4227 f11406;

    public C4237(InterfaceC4227 interfaceC4227, InterfaceC4238 interfaceC4238) {
        this.f11406 = interfaceC4227;
        this.f11405 = interfaceC4238;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iM8373 = ((C4445) this.f11406).m8373(i);
        ((C4358) this.f11405).getClass();
        DescriptorProtos$FieldOptions.OptionTargetType optionTargetTypeForNumber = DescriptorProtos$FieldOptions.OptionTargetType.forNumber(iM8373);
        return optionTargetTypeForNumber == null ? DescriptorProtos$FieldOptions.OptionTargetType.TARGET_TYPE_UNKNOWN : optionTargetTypeForNumber;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return ((C4445) this.f11406).f11597;
    }
}
