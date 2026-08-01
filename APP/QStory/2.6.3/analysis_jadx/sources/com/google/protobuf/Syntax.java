package com.google.protobuf;

import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public enum Syntax implements InterfaceC3381 {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    SYNTAX_EDITIONS(2),
    UNRECOGNIZED(-1);

    public static final int SYNTAX_EDITIONS_VALUE = 2;
    public static final int SYNTAX_PROTO2_VALUE = 0;
    public static final int SYNTAX_PROTO3_VALUE = 1;
    private static final Syntax[] VALUES;
    private static final InterfaceC3398 internalValueMap;
    private final int value;

    static {
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "Syntax");
        internalValueMap = new C3473(7);
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

    public static C3666 getDescriptor() {
        return AbstractC3701.f11513.f11334[0];
    }

    public static InterfaceC3398 internalGetValueMap() {
        return internalValueMap;
    }

    public static Syntax valueOf(C3664 c3664) {
        if (c3664.f11384 == getDescriptor()) {
            int i = c3664.f11385;
            return i == -1 ? UNRECOGNIZED : VALUES[i];
        }
        C5925.m11310("EnumValueDescriptor is not for this type.");
        return null;
    }

    public final C3666 getDescriptorForType() {
        return getDescriptor();
    }

    @Override // com.google.protobuf.InterfaceC3399
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        C5925.m11310("Can't get the number of an unknown enum value.");
        return 0;
    }

    public final C3664 getValueDescriptor() {
        if (this == UNRECOGNIZED) {
            C5925.m11311("Can't get the descriptor of an unrecognized enum value.");
            return null;
        }
        C3666 descriptor = getDescriptor();
        return descriptor.f11394[ordinal()];
    }

    @Deprecated
    public static Syntax valueOf(int i) {
        return forNumber(i);
    }
}
