package com.kyant.shapes;

import kotlin.Metadata;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/kyant/shapes/RoundedCornerStyle;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "Circular", "Continuous", "shapes"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RoundedCornerStyle {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ RoundedCornerStyle[] $VALUES;
    public static final RoundedCornerStyle Circular = new RoundedCornerStyle("Circular", 0);
    public static final RoundedCornerStyle Continuous = new RoundedCornerStyle("Continuous", 1);

    private static final /* synthetic */ RoundedCornerStyle[] $values() {
        return new RoundedCornerStyle[]{Circular, Continuous};
    }

    static {
        RoundedCornerStyle[] roundedCornerStyleArr$values = $values();
        $VALUES = roundedCornerStyleArr$values;
        $ENTRIES = AbstractC4364.m8866(roundedCornerStyleArr$values);
    }

    private RoundedCornerStyle(String str, int i) {
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static RoundedCornerStyle valueOf(String str) {
        return (RoundedCornerStyle) Enum.valueOf(RoundedCornerStyle.class, str);
    }

    public static RoundedCornerStyle[] values() {
        return (RoundedCornerStyle[]) $VALUES.clone();
    }
}
