package top.yukonga.miuix.kmp.basic;

import kotlin.Metadata;
import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m151d2 = {"top/yukonga/miuix/kmp/basic/PopupPositionProvider$Align", "", "Ltop/yukonga/miuix/kmp/basic/PopupPositionProvider$Align;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "Start", "End", "TopStart", "TopEnd", "BottomStart", "BottomEnd", "miuix"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
public final class PopupPositionProvider$Align {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ PopupPositionProvider$Align[] $VALUES;
    public static final PopupPositionProvider$Align Start = new PopupPositionProvider$Align("Start", 0);
    public static final PopupPositionProvider$Align End = new PopupPositionProvider$Align("End", 1);
    public static final PopupPositionProvider$Align TopStart = new PopupPositionProvider$Align("TopStart", 2);
    public static final PopupPositionProvider$Align TopEnd = new PopupPositionProvider$Align("TopEnd", 3);
    public static final PopupPositionProvider$Align BottomStart = new PopupPositionProvider$Align("BottomStart", 4);
    public static final PopupPositionProvider$Align BottomEnd = new PopupPositionProvider$Align("BottomEnd", 5);

    private static final /* synthetic */ PopupPositionProvider$Align[] $values() {
        return new PopupPositionProvider$Align[]{Start, End, TopStart, TopEnd, BottomStart, BottomEnd};
    }

    static {
        PopupPositionProvider$Align[] popupPositionProvider$AlignArr$values = $values();
        $VALUES = popupPositionProvider$AlignArr$values;
        $ENTRIES = AbstractC5196.m9425(popupPositionProvider$AlignArr$values);
    }

    private PopupPositionProvider$Align(String str, int i) {
    }

    public static InterfaceC5197 getEntries() {
        return $ENTRIES;
    }

    public static PopupPositionProvider$Align valueOf(String str) {
        return (PopupPositionProvider$Align) Enum.valueOf(PopupPositionProvider$Align.class, str);
    }

    public static PopupPositionProvider$Align[] values() {
        return (PopupPositionProvider$Align[]) $VALUES.clone();
    }
}
