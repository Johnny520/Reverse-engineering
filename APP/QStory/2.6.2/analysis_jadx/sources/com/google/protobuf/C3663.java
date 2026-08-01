package com.google.protobuf;

import net.bytebuddy.pool.TypePool;
import net.bytebuddy.utility.JavaConstant;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪子哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3663 extends AbstractC3657 implements InterfaceC3398 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final String f11377;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public volatile DescriptorProtos$EnumValueOptions f11378;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C3665 f11379;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f11380;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final DescriptorProtos$EnumValueDescriptorProto f11381;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C3536 f11376 = new C3536(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final C3666 f11375 = new C3666(0);

    public C3663(C3665 c3665, Integer num) {
        DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProtoBuild = DescriptorProtos$EnumValueDescriptorProto.newBuilder().setName("UNKNOWN_ENUM_VALUE_" + c3665.f11395.getName() + JavaConstant.Dynamic.DEFAULT_NAME + num).setNumber(num.intValue()).build();
        this.f11380 = -1;
        this.f11381 = descriptorProtos$EnumValueDescriptorProtoBuild;
        this.f11379 = c3665;
        this.f11377 = c3665.f11396 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + descriptorProtos$EnumValueDescriptorProtoBuild.getName();
    }

    @Override // com.google.protobuf.InterfaceC3398
    public final int getNumber() {
        return this.f11381.getNumber();
    }

    public final String toString() {
        return this.f11381.getName();
    }

    @Override // com.google.protobuf.AbstractC3657
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final AbstractC3657 mo7812() {
        return this.f11379;
    }

    @Override // com.google.protobuf.AbstractC3657
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final String mo7813() {
        return this.f11381.getName();
    }

    @Override // com.google.protobuf.AbstractC3657
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo7814() {
        return this.f11377;
    }

    @Override // com.google.protobuf.AbstractC3657
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C3655 mo7815() {
        return this.f11379.mo7815();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final DescriptorProtos$EnumValueOptions m7892() {
        if (this.f11378 == null) {
            DescriptorProtos$EnumValueOptions options = this.f11381.getOptions();
            if (options.hasFeatures()) {
                options = options.toBuilder().clearFeatures().build();
            }
            synchronized (this) {
                try {
                    if (this.f11378 == null) {
                        this.f11378 = options;
                    }
                } finally {
                }
            }
        }
        return this.f11378;
    }

    @Override // com.google.protobuf.AbstractC3657
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final InterfaceC3452 mo7816() {
        return this.f11381;
    }

    public C3663(DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto, C3665 c3665, int i) {
        this.f11380 = i;
        this.f11381 = descriptorProtos$EnumValueDescriptorProto;
        this.f11379 = c3665;
        this.f11377 = c3665.f11396 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + descriptorProtos$EnumValueDescriptorProto.getName();
        c3665.f11390.mo7815().f11331.m7884(this);
    }
}
