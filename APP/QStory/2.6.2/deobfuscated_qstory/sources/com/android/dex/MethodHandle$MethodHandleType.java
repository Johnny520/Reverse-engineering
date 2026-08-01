package com.android.dex;

import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
        C5919.m11249(String.valueOf(i));
        return null;
    }

    public boolean isField() {
        int iOrdinal = ordinal();
        return iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3;
    }
}
