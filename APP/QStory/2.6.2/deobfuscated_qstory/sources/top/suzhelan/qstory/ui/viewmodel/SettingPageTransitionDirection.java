package top.suzhelan.qstory.ui.viewmodel;

import com.bumptech.glide.AbstractC3056;
import kotlin.Metadata;
import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Ltop/suzhelan/qstory/ui/viewmodel/SettingPageTransitionDirection;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "Forward", "Backward", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class SettingPageTransitionDirection {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ SettingPageTransitionDirection[] $VALUES;
    public static final SettingPageTransitionDirection Forward = new SettingPageTransitionDirection("Forward", 0);
    public static final SettingPageTransitionDirection Backward = new SettingPageTransitionDirection("Backward", 1);

    private static final /* synthetic */ SettingPageTransitionDirection[] $values() {
        return new SettingPageTransitionDirection[]{Forward, Backward};
    }

    static {
        SettingPageTransitionDirection[] settingPageTransitionDirectionArr$values = $values();
        $VALUES = settingPageTransitionDirectionArr$values;
        $ENTRIES = AbstractC4363.m8876(settingPageTransitionDirectionArr$values);
    }

    private SettingPageTransitionDirection(String str, int i) {
    }

    public static InterfaceC4364 getEntries() {
        return $ENTRIES;
    }

    public static SettingPageTransitionDirection valueOf(String str) {
        return (SettingPageTransitionDirection) Enum.valueOf(SettingPageTransitionDirection.class, str);
    }

    public static SettingPageTransitionDirection[] values() {
        return (SettingPageTransitionDirection[]) $VALUES.clone();
    }
}
