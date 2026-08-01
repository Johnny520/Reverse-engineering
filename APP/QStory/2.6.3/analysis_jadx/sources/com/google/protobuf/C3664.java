package com.google.protobuf;

import net.bytebuddy.pool.TypePool;
import net.bytebuddy.utility.JavaConstant;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪子哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3664 extends AbstractC3658 implements InterfaceC3399 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final String f11382;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public volatile DescriptorProtos$EnumValueOptions f11383;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C3666 f11384;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f11385;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final DescriptorProtos$EnumValueDescriptorProto f11386;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C3537 f11381 = new C3537(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final C3667 f11380 = new C3667(0);

    public C3664(C3666 c3666, Integer num) {
        DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProtoBuild = DescriptorProtos$EnumValueDescriptorProto.newBuilder().setName("UNKNOWN_ENUM_VALUE_" + c3666.f11400.getName() + JavaConstant.Dynamic.DEFAULT_NAME + num).setNumber(num.intValue()).build();
        this.f11385 = -1;
        this.f11386 = descriptorProtos$EnumValueDescriptorProtoBuild;
        this.f11384 = c3666;
        this.f11382 = c3666.f11401 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + descriptorProtos$EnumValueDescriptorProtoBuild.getName();
    }

    @Override // com.google.protobuf.InterfaceC3399
    public final int getNumber() {
        return this.f11386.getNumber();
    }

    public final String toString() {
        return this.f11386.getName();
    }

    @Override // com.google.protobuf.AbstractC3658
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final AbstractC3658 mo7799() {
        return this.f11384;
    }

    @Override // com.google.protobuf.AbstractC3658
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final String mo7800() {
        return this.f11386.getName();
    }

    @Override // com.google.protobuf.AbstractC3658
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo7801() {
        return this.f11382;
    }

    @Override // com.google.protobuf.AbstractC3658
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final C3656 mo7802() {
        return this.f11384.mo7802();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final DescriptorProtos$EnumValueOptions m7879() {
        if (this.f11383 == null) {
            DescriptorProtos$EnumValueOptions options = this.f11386.getOptions();
            if (options.hasFeatures()) {
                options = options.toBuilder().clearFeatures().build();
            }
            synchronized (this) {
                try {
                    if (this.f11383 == null) {
                        this.f11383 = options;
                    }
                } finally {
                }
            }
        }
        return this.f11383;
    }

    @Override // com.google.protobuf.AbstractC3658
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final InterfaceC3453 mo7803() {
        return this.f11386;
    }

    public C3664(DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto, C3666 c3666, int i) {
        this.f11385 = i;
        this.f11386 = descriptorProtos$EnumValueDescriptorProto;
        this.f11384 = c3666;
        this.f11382 = c3666.f11401 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + descriptorProtos$EnumValueDescriptorProto.getName();
        c3666.f11395.mo7802().f11336.m7871(this);
    }
}
