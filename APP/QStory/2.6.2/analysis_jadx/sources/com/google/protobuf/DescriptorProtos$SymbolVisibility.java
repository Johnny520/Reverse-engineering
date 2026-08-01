package com.google.protobuf;

import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public enum DescriptorProtos$SymbolVisibility implements InterfaceC3380 {
    VISIBILITY_UNSET(0),
    VISIBILITY_LOCAL(1),
    VISIBILITY_EXPORT(2);

    private static final DescriptorProtos$SymbolVisibility[] VALUES;
    public static final int VISIBILITY_EXPORT_VALUE = 2;
    public static final int VISIBILITY_LOCAL_VALUE = 1;
    public static final int VISIBILITY_UNSET_VALUE = 0;
    private static final InterfaceC3397 internalValueMap;
    private final int value;

    static {
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "SymbolVisibility");
        internalValueMap = new C3472(4);
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

    public static C3665 getDescriptor() {
        return AbstractC3669.f11452.f11329[1];
    }

    public static InterfaceC3397 internalGetValueMap() {
        return internalValueMap;
    }

    public static DescriptorProtos$SymbolVisibility valueOf(C3663 c3663) {
        if (c3663.f11379 == getDescriptor()) {
            return VALUES[c3663.f11380];
        }
        C5919.m11249("EnumValueDescriptor is not for this type.");
        return null;
    }

    public final C3665 getDescriptorForType() {
        return getDescriptor();
    }

    @Override // com.google.protobuf.InterfaceC3398
    public final int getNumber() {
        return this.value;
    }

    public final C3663 getValueDescriptor() {
        C3665 descriptor = getDescriptor();
        return descriptor.f11389[ordinal()];
    }

    @Deprecated
    public static DescriptorProtos$SymbolVisibility valueOf(int i) {
        return forNumber(i);
    }
}
