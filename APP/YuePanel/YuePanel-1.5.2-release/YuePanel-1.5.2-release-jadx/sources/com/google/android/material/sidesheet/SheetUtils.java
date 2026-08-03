package com.google.android.material.sidesheet;

import Yue.InterfaceC7144;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
final class SheetUtils {
    private SheetUtils() {
    }

    public static boolean isSwipeMostlyHorizontal(float f, float f2) {
        return Math.abs(f) > Math.abs(f2);
    }
}
