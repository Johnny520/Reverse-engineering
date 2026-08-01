package top.yukonga.miuix.kmp.basic;

import kotlin.Metadata;
import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m151d2 = {"Ltop/yukonga/miuix/kmp/basic/ScaffoldLayoutContent;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "TopBar", "BottomBar", "Snackbar", "FloatingToolbar", "Fab", "Popup", "MainContent", "miuix"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
final class ScaffoldLayoutContent {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ ScaffoldLayoutContent[] $VALUES;
    public static final ScaffoldLayoutContent TopBar = new ScaffoldLayoutContent("TopBar", 0);
    public static final ScaffoldLayoutContent BottomBar = new ScaffoldLayoutContent("BottomBar", 1);
    public static final ScaffoldLayoutContent Snackbar = new ScaffoldLayoutContent("Snackbar", 2);
    public static final ScaffoldLayoutContent FloatingToolbar = new ScaffoldLayoutContent("FloatingToolbar", 3);
    public static final ScaffoldLayoutContent Fab = new ScaffoldLayoutContent("Fab", 4);
    public static final ScaffoldLayoutContent Popup = new ScaffoldLayoutContent("Popup", 5);
    public static final ScaffoldLayoutContent MainContent = new ScaffoldLayoutContent("MainContent", 6);

    private static final /* synthetic */ ScaffoldLayoutContent[] $values() {
        return new ScaffoldLayoutContent[]{TopBar, BottomBar, Snackbar, FloatingToolbar, Fab, Popup, MainContent};
    }

    static {
        ScaffoldLayoutContent[] scaffoldLayoutContentArr$values = $values();
        $VALUES = scaffoldLayoutContentArr$values;
        $ENTRIES = AbstractC5196.m9425(scaffoldLayoutContentArr$values);
    }

    private ScaffoldLayoutContent(String str, int i) {
    }

    public static InterfaceC5197 getEntries() {
        return $ENTRIES;
    }

    public static ScaffoldLayoutContent valueOf(String str) {
        return (ScaffoldLayoutContent) Enum.valueOf(ScaffoldLayoutContent.class, str);
    }

    public static ScaffoldLayoutContent[] values() {
        return (ScaffoldLayoutContent[]) $VALUES.clone();
    }
}
