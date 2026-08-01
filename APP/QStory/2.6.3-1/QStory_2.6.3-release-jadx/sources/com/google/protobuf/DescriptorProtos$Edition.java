package com.google.protobuf;

import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public enum DescriptorProtos$Edition implements InterfaceC4213 {
    EDITION_UNKNOWN(0),
    EDITION_LEGACY(EDITION_LEGACY_VALUE),
    EDITION_PROTO2(EDITION_PROTO2_VALUE),
    EDITION_PROTO3(999),
    EDITION_2023(EDITION_2023_VALUE),
    EDITION_2024(EDITION_2024_VALUE),
    EDITION_UNSTABLE(EDITION_UNSTABLE_VALUE),
    EDITION_1_TEST_ONLY(1),
    EDITION_2_TEST_ONLY(2),
    EDITION_99997_TEST_ONLY(EDITION_99997_TEST_ONLY_VALUE),
    EDITION_99998_TEST_ONLY(EDITION_99998_TEST_ONLY_VALUE),
    EDITION_99999_TEST_ONLY(EDITION_99999_TEST_ONLY_VALUE),
    EDITION_MAX(Integer.MAX_VALUE);

    public static final int EDITION_1_TEST_ONLY_VALUE = 1;
    public static final int EDITION_2023_VALUE = 1000;
    public static final int EDITION_2024_VALUE = 1001;
    public static final int EDITION_2_TEST_ONLY_VALUE = 2;
    public static final int EDITION_99997_TEST_ONLY_VALUE = 99997;
    public static final int EDITION_99998_TEST_ONLY_VALUE = 99998;
    public static final int EDITION_99999_TEST_ONLY_VALUE = 99999;
    public static final int EDITION_LEGACY_VALUE = 900;
    public static final int EDITION_MAX_VALUE = Integer.MAX_VALUE;
    public static final int EDITION_PROTO2_VALUE = 998;
    public static final int EDITION_PROTO3_VALUE = 999;
    public static final int EDITION_UNKNOWN_VALUE = 0;
    public static final int EDITION_UNSTABLE_VALUE = 9999;
    private static final DescriptorProtos$Edition[] VALUES;
    private static final InterfaceC4230 internalValueMap;
    private final int value;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "Edition");
        internalValueMap = new C4305(3);
        VALUES = values();
    }

    DescriptorProtos$Edition(int i) {
        this.value = i;
    }

    public static DescriptorProtos$Edition forNumber(int i) {
        if (i == 0) {
            return EDITION_UNKNOWN;
        }
        if (i == 1) {
            return EDITION_1_TEST_ONLY;
        }
        if (i == 2) {
            return EDITION_2_TEST_ONLY;
        }
        if (i == 900) {
            return EDITION_LEGACY;
        }
        if (i == 9999) {
            return EDITION_UNSTABLE;
        }
        if (i == Integer.MAX_VALUE) {
            return EDITION_MAX;
        }
        switch (i) {
            case EDITION_PROTO2_VALUE:
                return EDITION_PROTO2;
            case 999:
                return EDITION_PROTO3;
            case EDITION_2023_VALUE:
                return EDITION_2023;
            case EDITION_2024_VALUE:
                return EDITION_2024;
            default:
                switch (i) {
                    case EDITION_99997_TEST_ONLY_VALUE:
                        return EDITION_99997_TEST_ONLY;
                    case EDITION_99998_TEST_ONLY_VALUE:
                        return EDITION_99998_TEST_ONLY;
                    case EDITION_99999_TEST_ONLY_VALUE:
                        return EDITION_99999_TEST_ONLY;
                    default:
                        return null;
                }
        }
    }

    public static C4498 getDescriptor() {
        return AbstractC4502.f11802.f11679[0];
    }

    public static InterfaceC4230 internalGetValueMap() {
        return internalValueMap;
    }

    public static DescriptorProtos$Edition valueOf(C4496 c4496) {
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
    public static DescriptorProtos$Edition valueOf(int i) {
        return forNumber(i);
    }
}
