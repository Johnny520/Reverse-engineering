package com.google.protobuf;

import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public enum NullValue implements InterfaceC4213 {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);

    public static final int NULL_VALUE_VALUE = 0;
    private static final NullValue[] VALUES;
    private static final InterfaceC4230 internalValueMap;
    private final int value;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "NullValue");
        internalValueMap = new C4305(6);
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

    public static C4498 getDescriptor() {
        return AbstractC4169.f11306.f11679[0];
    }

    public static InterfaceC4230 internalGetValueMap() {
        return internalValueMap;
    }

    public static NullValue valueOf(C4496 c4496) {
        if (c4496.f11729 == getDescriptor()) {
            int i = c4496.f11730;
            return i == -1 ? UNRECOGNIZED : VALUES[i];
        }
        C6755.m11869("EnumValueDescriptor is not for this type.");
        return null;
    }

    public final C4498 getDescriptorForType() {
        return getDescriptor();
    }

    @Override // com.google.protobuf.InterfaceC4231
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        C6755.m11869("Can't get the number of an unknown enum value.");
        return 0;
    }

    public final C4496 getValueDescriptor() {
        if (this == UNRECOGNIZED) {
            C6755.m11870("Can't get the descriptor of an unrecognized enum value.");
            return null;
        }
        C4498 descriptor = getDescriptor();
        return descriptor.f11739[ordinal()];
    }

    @Deprecated
    public static NullValue valueOf(int i) {
        return forNumber(i);
    }
}
