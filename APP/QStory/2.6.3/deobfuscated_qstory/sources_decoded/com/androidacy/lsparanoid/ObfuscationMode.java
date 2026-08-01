package com.androidacy.lsparanoid;

import androidx.activity.AbstractC0053;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import net.bytebuddy.description.method.MethodDescription;
import p287.C8403;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/androidacy/lsparanoid/ObfuscationMode;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "Companion", "飘花落叶言楪子兰苏世哲/飘花落叶言子楪世哲兰苏", "BASE64", "HEX", "BYTES", "CUSTOM", "core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ObfuscationMode {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ ObfuscationMode[] $VALUES;
    public static final C8403 Companion;
    public static final ObfuscationMode BASE64 = new ObfuscationMode("BASE64", 0);
    public static final ObfuscationMode HEX = new ObfuscationMode("HEX", 1);
    public static final ObfuscationMode BYTES = new ObfuscationMode("BYTES", 2);
    public static final ObfuscationMode CUSTOM = new ObfuscationMode("CUSTOM", 3);

    private static final /* synthetic */ ObfuscationMode[] $values() {
        return new ObfuscationMode[]{BASE64, HEX, BYTES, CUSTOM};
    }

    static {
        ObfuscationMode[] obfuscationModeArr$values = $values();
        $VALUES = obfuscationModeArr$values;
        $ENTRIES = AbstractC4364.m8866(obfuscationModeArr$values);
        Companion = new C8403();
    }

    private ObfuscationMode(String str, int i) {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final ObfuscationMode fromString(String str) {
        Companion.getClass();
        str.getClass();
        String upperCase = str.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        switch (upperCase.hashCode()) {
            case 71419:
                if (upperCase.equals("HEX")) {
                    return HEX;
                }
                break;
            case 63686731:
                if (upperCase.equals("BYTES")) {
                    return BYTES;
                }
                break;
            case 1952093519:
                if (upperCase.equals("BASE64")) {
                    return BASE64;
                }
                break;
            case 1999208305:
                if (upperCase.equals("CUSTOM")) {
                    return CUSTOM;
                }
                break;
        }
        C5925.m11310(AbstractC0053.m158("Unknown obfuscation mode: '", str, "'. Supported modes: bytes, base64, hex, custom"));
        return null;
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static ObfuscationMode valueOf(String str) {
        return (ObfuscationMode) Enum.valueOf(ObfuscationMode.class, str);
    }

    public static ObfuscationMode[] values() {
        return (ObfuscationMode[]) $VALUES.clone();
    }
}
