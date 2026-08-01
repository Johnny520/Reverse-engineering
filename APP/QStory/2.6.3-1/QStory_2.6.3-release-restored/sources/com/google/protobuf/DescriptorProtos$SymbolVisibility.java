package com.google.protobuf;

import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public enum DescriptorProtos$SymbolVisibility implements InterfaceC4213 {
    VISIBILITY_UNSET(0),
    VISIBILITY_LOCAL(1),
    VISIBILITY_EXPORT(2);

    private static final DescriptorProtos$SymbolVisibility[] VALUES;
    public static final int VISIBILITY_EXPORT_VALUE = 2;
    public static final int VISIBILITY_LOCAL_VALUE = 1;
    public static final int VISIBILITY_UNSET_VALUE = 0;
    private static final InterfaceC4230 internalValueMap;
    private final int value;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "SymbolVisibility");
        internalValueMap = new C4305(4);
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

    public static C4498 getDescriptor() {
        return AbstractC4502.f11802.f11679[1];
    }

    public static InterfaceC4230 internalGetValueMap() {
        return internalValueMap;
    }

    public static DescriptorProtos$SymbolVisibility valueOf(C4496 c4496) {
        if (c4496.f11729 == getDescriptor()) {
            return VALUES[c4496.f11730];
        }
        C6755.m11869("EnumValueDescriptor is not for this type.");
        return null;
    }

    public final C4498 getDescriptorForType() {
        return getDescriptor();
    }

    @Override // com.google.protobuf.InterfaceC4231
    public final int getNumber() {
        return this.value;
    }

    public final C4496 getValueDescriptor() {
        C4498 descriptor = getDescriptor();
        return descriptor.f11739[ordinal()];
    }

    @Deprecated
    public static DescriptorProtos$SymbolVisibility valueOf(int i) {
        return forNumber(i);
    }
}
