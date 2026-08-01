package com.materialkolor.dynamiccolor;

import kotlin.InterfaceC5168;
import kotlin.Metadata;
import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/materialkolor/dynamiccolor/TonePolarity;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "DARKER", "LIGHTER", "RELATIVE_DARKER", "RELATIVE_LIGHTER", "NEARER", "FARTHER", "material-color-utilities"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TonePolarity {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ TonePolarity[] $VALUES;
    public static final TonePolarity DARKER = new TonePolarity("DARKER", 0);
    public static final TonePolarity LIGHTER = new TonePolarity("LIGHTER", 1);
    public static final TonePolarity RELATIVE_DARKER = new TonePolarity("RELATIVE_DARKER", 2);
    public static final TonePolarity RELATIVE_LIGHTER = new TonePolarity("RELATIVE_LIGHTER", 3);

    @InterfaceC5168
    public static final TonePolarity NEARER = new TonePolarity("NEARER", 4);

    @InterfaceC5168
    public static final TonePolarity FARTHER = new TonePolarity("FARTHER", 5);

    private static final /* synthetic */ TonePolarity[] $values() {
        return new TonePolarity[]{DARKER, LIGHTER, RELATIVE_DARKER, RELATIVE_LIGHTER, NEARER, FARTHER};
    }

    static {
        TonePolarity[] tonePolarityArr$values = $values();
        $VALUES = tonePolarityArr$values;
        $ENTRIES = AbstractC4363.m8876(tonePolarityArr$values);
    }

    private TonePolarity(String str, int i) {
    }

    public static InterfaceC4364 getEntries() {
        return $ENTRIES;
    }

    public static TonePolarity valueOf(String str) {
        return (TonePolarity) Enum.valueOf(TonePolarity.class, str);
    }

    public static TonePolarity[] values() {
        return (TonePolarity[]) $VALUES.clone();
    }
}
