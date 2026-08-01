package com.google.protobuf;

import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public enum DescriptorProtos$SymbolVisibility implements InterfaceC3381 {
    VISIBILITY_UNSET(0),
    VISIBILITY_LOCAL(1),
    VISIBILITY_EXPORT(2);

    private static final DescriptorProtos$SymbolVisibility[] VALUES;
    public static final int VISIBILITY_EXPORT_VALUE = 2;
    public static final int VISIBILITY_LOCAL_VALUE = 1;
    public static final int VISIBILITY_UNSET_VALUE = 0;
    private static final InterfaceC3398 internalValueMap;
    private final int value;

    static {
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "SymbolVisibility");
        internalValueMap = new C3473(4);
        VALUES = values();
    }

    DescriptorProtos$SymbolVisibility(int i) {
        this.value = i;
    }

    public static DescriptorProtos$SymbolVisibility forNumber(int i) {
        if (i == 0) {
            return VISIBILITY_UNSET;
        }
        if (i == 1) {
            return VISIBILITY_LOCAL;
        }
        if (i != 2) {
            return null;
        }
        return VISIBILITY_EXPORT;
    }

    public static C3666 getDescriptor() {
        return AbstractC3670.f11457.f11334[1];
    }

    public static InterfaceC3398 internalGetValueMap() {
        return internalValueMap;
    }

    public static DescriptorProtos$SymbolVisibility valueOf(C3664 c3664) {
        if (c3664.f11384 == getDescriptor()) {
            return VALUES[c3664.f11385];
        }
        C5925.m11310("EnumValueDescriptor is not for this type.");
        return null;
    }

    public final C3666 getDescriptorForType() {
        return getDescriptor();
    }

    @Override // com.google.protobuf.InterfaceC3399
    public final int getNumber() {
        return this.value;
    }

    public final C3664 getValueDescriptor() {
        C3666 descriptor = getDescriptor();
        return descriptor.f11394[ordinal()];
    }

    @Deprecated
    public static DescriptorProtos$SymbolVisibility valueOf(int i) {
        return forNumber(i);
    }
}
