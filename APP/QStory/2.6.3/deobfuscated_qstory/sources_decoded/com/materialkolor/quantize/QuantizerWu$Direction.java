package com.materialkolor.quantize;

import kotlin.Metadata;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/materialkolor/quantize/QuantizerWu$Direction", "", "Lcom/materialkolor/quantize/QuantizerWu$Direction;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "RED", "GREEN", "BLUE", "material-color-utilities"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class QuantizerWu$Direction {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ QuantizerWu$Direction[] $VALUES;
    public static final QuantizerWu$Direction RED = new QuantizerWu$Direction("RED", 0);
    public static final QuantizerWu$Direction GREEN = new QuantizerWu$Direction("GREEN", 1);
    public static final QuantizerWu$Direction BLUE = new QuantizerWu$Direction("BLUE", 2);

    private static final /* synthetic */ QuantizerWu$Direction[] $values() {
        return new QuantizerWu$Direction[]{RED, GREEN, BLUE};
    }

    static {
        QuantizerWu$Direction[] quantizerWu$DirectionArr$values = $values();
        $VALUES = quantizerWu$DirectionArr$values;
        $ENTRIES = AbstractC4364.m8866(quantizerWu$DirectionArr$values);
    }

    private QuantizerWu$Direction(String str, int i) {
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static QuantizerWu$Direction valueOf(String str) {
        return (QuantizerWu$Direction) Enum.valueOf(QuantizerWu$Direction.class, str);
    }

    public static QuantizerWu$Direction[] values() {
        return (QuantizerWu$Direction[]) $VALUES.clone();
    }
}
