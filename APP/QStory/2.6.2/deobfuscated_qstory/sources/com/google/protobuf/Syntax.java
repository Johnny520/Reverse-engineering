package com.google.protobuf;

import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public enum Syntax implements InterfaceC3380 {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    SYNTAX_EDITIONS(2),
    UNRECOGNIZED(-1);

    public static final int SYNTAX_EDITIONS_VALUE = 2;
    public static final int SYNTAX_PROTO2_VALUE = 0;
    public static final int SYNTAX_PROTO3_VALUE = 1;
    private static final Syntax[] VALUES;
    private static final InterfaceC3397 internalValueMap;
    private final int value;

    static {
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "Syntax");
        internalValueMap = new C3472(7);
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

    public static C3665 getDescriptor() {
        return AbstractC3700.f11508.f11329[0];
    }

    public static InterfaceC3397 internalGetValueMap() {
        return internalValueMap;
    }

    public static Syntax valueOf(C3663 c3663) {
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
    public static Syntax valueOf(int i) {
        return forNumber(i);
    }
}
