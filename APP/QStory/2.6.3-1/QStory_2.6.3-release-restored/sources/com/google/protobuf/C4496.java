package com.google.protobuf;

import net.bytebuddy.pool.TypePool;
import net.bytebuddy.utility.JavaConstant;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪子哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4496 extends AbstractC4490 implements InterfaceC4231 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final String f11727;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public volatile DescriptorProtos$EnumValueOptions f11728;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C4498 f11729;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f11730;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final DescriptorProtos$EnumValueDescriptorProto f11731;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C4369 f11726 = new C4369(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final C4499 f11725 = new C4499(0);

    public C4496(C4498 c4498, Integer num) {
        DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProtoBuild = DescriptorProtos$EnumValueDescriptorProto.newBuilder().setName("UNKNOWN_ENUM_VALUE_" + c4498.f11745.getName() + JavaConstant.Dynamic.DEFAULT_NAME + num).setNumber(num.intValue()).build();
        this.f11730 = -1;
        this.f11731 = descriptorProtos$EnumValueDescriptorProtoBuild;
        this.f11729 = c4498;
        this.f11727 = c4498.f11746 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + descriptorProtos$EnumValueDescriptorProtoBuild.getName();
    }

    @Override // com.google.protobuf.InterfaceC4231
    public final int getNumber() {
        return this.f11731.getNumber();
    }

    public final String toString() {
        return this.f11731.getName();
    }

    @Override // com.google.protobuf.AbstractC4490
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final AbstractC4490 mo8358() {
        return this.f11729;
    }

    @Override // com.google.protobuf.AbstractC4490
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final String mo8359() {
        return this.f11731.getName();
    }

    @Override // com.google.protobuf.AbstractC4490
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo8360() {
        return this.f11727;
    }

    @Override // com.google.protobuf.AbstractC4490
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final C4488 mo8361() {
        return this.f11729.mo8361();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final DescriptorProtos$EnumValueOptions m8438() {
        if (this.f11728 == null) {
            DescriptorProtos$EnumValueOptions options = this.f11731.getOptions();
            if (options.hasFeatures()) {
                options = options.toBuilder().clearFeatures().build();
            }
            synchronized (this) {
                try {
                    if (this.f11728 == null) {
                        this.f11728 = options;
                    }
                } finally {
                }
            }
        }
        return this.f11728;
    }

    @Override // com.google.protobuf.AbstractC4490
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final InterfaceC4285 mo8362() {
        return this.f11731;
    }

    public C4496(DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto, C4498 c4498, int i) {
        this.f11730 = i;
        this.f11731 = descriptorProtos$EnumValueDescriptorProto;
        this.f11729 = c4498;
        this.f11727 = c4498.f11746 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + descriptorProtos$EnumValueDescriptorProto.getName();
        c4498.f11740.mo8361().f11681.m8430(this);
    }
}
