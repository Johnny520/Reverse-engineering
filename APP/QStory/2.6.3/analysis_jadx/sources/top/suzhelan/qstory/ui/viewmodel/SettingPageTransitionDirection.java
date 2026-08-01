package top.suzhelan.qstory.ui.viewmodel;

import kotlin.Metadata;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import net.bytebuddy.description.method.MethodDescription;
import p287.AbstractC8405;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Ltop/suzhelan/qstory/ui/viewmodel/SettingPageTransitionDirection;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "Forward", "Backward", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class SettingPageTransitionDirection {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ SettingPageTransitionDirection[] $VALUES;
    public static final SettingPageTransitionDirection Forward = new SettingPageTransitionDirection(AbstractC8405.m13973("喵喵呜呜喵呜喵呜~喵喵喵呜呜喵呜喵~喵喵喵喵呜喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵喵喵呜喵喵~喵喵喵呜呜呜呜喵~喵喵喵喵喵呜喵呜"), 0);
    public static final SettingPageTransitionDirection Backward = new SettingPageTransitionDirection(AbstractC8405.m13972(3234), 1);

    private static final /* synthetic */ SettingPageTransitionDirection[] $values() {
        return new SettingPageTransitionDirection[]{Forward, Backward};
    }

    static {
        SettingPageTransitionDirection[] settingPageTransitionDirectionArr$values = $values();
        $VALUES = settingPageTransitionDirectionArr$values;
        $ENTRIES = AbstractC4364.m8866(settingPageTransitionDirectionArr$values);
    }

    private SettingPageTransitionDirection(String str, int i) {
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static SettingPageTransitionDirection valueOf(String str) {
        return (SettingPageTransitionDirection) Enum.valueOf(SettingPageTransitionDirection.class, str);
    }

    public static SettingPageTransitionDirection[] values() {
        return (SettingPageTransitionDirection[]) $VALUES.clone();
    }
}
