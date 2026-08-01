package com.google.protobuf;

import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public enum NullValue implements InterfaceC3380 {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);

    public static final int NULL_VALUE_VALUE = 0;
    private static final NullValue[] VALUES;
    private static final InterfaceC3397 internalValueMap;
    private final int value;

    static {
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "NullValue");
        internalValueMap = new C3472(6);
        VALUES = values();
    }

    NullValue(int i) {
        this.value = i;
    }

    public static NullValue forNumber(int i) {
        if (i != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    public static C3665 getDescriptor() {
        return AbstractC3336.f10956.f11329[0];
    }

    public static InterfaceC3397 internalGetValueMap() {
        return internalValueMap;
    }

    public static NullValue valueOf(C3663 c3663) {
        if (c3663.f11379 == getDescriptor()) {
            int i = c3663.f11380;
            return i == -1 ? UNRECOGNIZED : VALUES[i];
        }
        C5919.m11249("EnumValueDescriptor is not for this type.");
        return null;
    }

    public final C3665 getDescriptorForType() {
        return getDescriptor();
    }

    @Override // com.google.protobuf.InterfaceC3398
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        C5919.m11249("Can't get the number of an unknown enum value.");
        return 0;
    }

    public final C3663 getValueDescriptor() {
        if (this == UNRECOGNIZED) {
            C5919.m11250("Can't get the descriptor of an unrecognized enum value.");
            return null;
        }
        C3665 descriptor = getDescriptor();
        return descriptor.f11389[ordinal()];
    }

    @Deprecated
    public static NullValue valueOf(int i) {
        return forNumber(i);
    }
}
