package com.android.dex;

import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public enum MethodHandle$MethodHandleType {
    METHOD_HANDLE_TYPE_STATIC_PUT(0),
    METHOD_HANDLE_TYPE_STATIC_GET(1),
    METHOD_HANDLE_TYPE_INSTANCE_PUT(2),
    METHOD_HANDLE_TYPE_INSTANCE_GET(3),
    METHOD_HANDLE_TYPE_INVOKE_STATIC(4),
    METHOD_HANDLE_TYPE_INVOKE_INSTANCE(5),
    METHOD_HANDLE_TYPE_INVOKE_DIRECT(6),
    METHOD_HANDLE_TYPE_INVOKE_CONSTRUCTOR(7),
    METHOD_HANDLE_TYPE_INVOKE_INTERFACE(8);

    private final int value;

    MethodHandle$MethodHandleType(int i) {
        this.value = i;
    }

    public static MethodHandle$MethodHandleType fromValue(int i) {
        for (MethodHandle$MethodHandleType methodHandle$MethodHandleType : values()) {
            if (methodHandle$MethodHandleType.value == i) {
                return methodHandle$MethodHandleType;
            }
        }
        C6755.m11869(String.valueOf(i));
        return null;
    }

    public boolean isField() {
        int iOrdinal = ordinal();
        return iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3;
    }
}
