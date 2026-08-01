package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/material3/DrawerValue;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "Closed", "Open", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DrawerValue {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ DrawerValue[] $VALUES;
    public static final DrawerValue Closed = new DrawerValue("Closed", 0);
    public static final DrawerValue Open = new DrawerValue("Open", 1);

    private static final /* synthetic */ DrawerValue[] $values() {
        return new DrawerValue[]{Closed, Open};
    }

    static {
        DrawerValue[] drawerValueArr$values = $values();
        $VALUES = drawerValueArr$values;
        $ENTRIES = AbstractC4364.m8866(drawerValueArr$values);
    }

    private DrawerValue(String str, int i) {
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static DrawerValue valueOf(String str) {
        return (DrawerValue) Enum.valueOf(DrawerValue.class, str);
    }

    public static DrawerValue[] values() {
        return (DrawerValue[]) $VALUES.clone();
    }
}
