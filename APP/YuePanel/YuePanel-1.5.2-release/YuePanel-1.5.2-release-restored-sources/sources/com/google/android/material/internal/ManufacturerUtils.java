package com.google.android.material.internal;

import Yue.InterfaceC6391;
import Yue.InterfaceC7144;
import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class ManufacturerUtils {
    private static final String LGE = "lge";
    private static final String MEIZU = "meizu";
    private static final String SAMSUNG = "samsung";

    private ManufacturerUtils() {
    }

    @InterfaceC6391
    private static String getManufacturer() {
        String str = Build.MANUFACTURER;
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    public static boolean isDateInputKeyboardMissingSeparatorCharacters() {
        return isLGEDevice() || isSamsungDevice();
    }

    public static boolean isLGEDevice() {
        return getManufacturer().equals(LGE);
    }

    public static boolean isMeizuDevice() {
        return getManufacturer().equals(MEIZU);
    }

    public static boolean isSamsungDevice() {
        return getManufacturer().equals(SAMSUNG);
    }
}
