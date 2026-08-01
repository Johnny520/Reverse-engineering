package com.google.protobuf;

import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public enum Syntax implements InterfaceC4213 {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    SYNTAX_EDITIONS(2),
    UNRECOGNIZED(-1);

    public static final int SYNTAX_EDITIONS_VALUE = 2;
    public static final int SYNTAX_PROTO2_VALUE = 0;
    public static final int SYNTAX_PROTO3_VALUE = 1;
    private static final Syntax[] VALUES;
    private static final InterfaceC4230 internalValueMap;
    private final int value;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "Syntax");
        internalValueMap = new C4305(7);
        VALUES = values();
    }

    Syntax(int i) {
        this.value = i;
    }

    public static Syntax forNumber(int i) {
        if (i == 0) {
            return SYNTAX_PROTO2;
        }
        if (i == 1) {
            return SYNTAX_PROTO3;
        }
        if (i != 2) {
            return null;
        }
        return SYNTAX_EDITIONS;
    }

    public static C4498 getDescriptor() {
        return AbstractC4533.f11858.f11679[0];
    }

    public static InterfaceC4230 internalGetValueMap() {
        return internalValueMap;
    }

    public static Syntax valueOf(C4496 c4496) {
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
    public static Syntax valueOf(int i) {
        return forNumber(i);
    }
}
