package top.suzhelan.qstory.hook.item.stickerpanel;

import kotlin.Metadata;
import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import net.bytebuddy.description.method.MethodDescription;
import p303.AbstractC9234;
import p337.C9524;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\u000b\u0010\nj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, m151d2 = {"top/suzhelan/qstory/hook/item/stickerpanel/StickerPanelSettingsConfig$SortMode", "", "Ltop/suzhelan/qstory/hook/item/stickerpanel/StickerPanelSettingsConfig$SortMode;", "", "key", "label", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "getLabel", "Companion", "飘花落叶言苏世兰子哲楪/飘花落叶言子楪苏兰世哲", "RECENT_USAGE", "NAME_ASC", "NAME_DESC", "TIME_ASC", "TIME_DESC", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class StickerPanelSettingsConfig$SortMode {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ StickerPanelSettingsConfig$SortMode[] $VALUES;
    public static final C9524 Companion;
    private final String key;
    private final String label;
    public static final StickerPanelSettingsConfig$SortMode RECENT_USAGE = new StickerPanelSettingsConfig$SortMode(AbstractC9234.m14531(2688), 0, AbstractC9234.m14531(2689), AbstractC9234.m14531(2690));
    public static final StickerPanelSettingsConfig$SortMode NAME_ASC = new StickerPanelSettingsConfig$SortMode(AbstractC9234.m14531(2691), 1, AbstractC9234.m14531(2692), AbstractC9234.m14531(2693));
    public static final StickerPanelSettingsConfig$SortMode NAME_DESC = new StickerPanelSettingsConfig$SortMode(AbstractC9234.m14531(2694), 2, AbstractC9234.m14531(2695), AbstractC9234.m14531(2696));
    public static final StickerPanelSettingsConfig$SortMode TIME_ASC = new StickerPanelSettingsConfig$SortMode(AbstractC9234.m14531(2697), 3, AbstractC9234.m14531(2698), AbstractC9234.m14531(2699));
    public static final StickerPanelSettingsConfig$SortMode TIME_DESC = new StickerPanelSettingsConfig$SortMode(AbstractC9234.m14531(2700), 4, AbstractC9234.m14531(2701), AbstractC9234.m14531(2702));

    private static final /* synthetic */ StickerPanelSettingsConfig$SortMode[] $values() {
        return new StickerPanelSettingsConfig$SortMode[]{RECENT_USAGE, NAME_ASC, NAME_DESC, TIME_ASC, TIME_DESC};
    }

    static {
        StickerPanelSettingsConfig$SortMode[] stickerPanelSettingsConfig$SortModeArr$values = $values();
        $VALUES = stickerPanelSettingsConfig$SortModeArr$values;
        $ENTRIES = AbstractC5196.m9425(stickerPanelSettingsConfig$SortModeArr$values);
        Companion = new C9524();
    }

    private StickerPanelSettingsConfig$SortMode(String str, int i, String str2, String str3) {
        this.key = str2;
        this.label = str3;
    }

    public static InterfaceC5197 getEntries() {
        return $ENTRIES;
    }

    public static StickerPanelSettingsConfig$SortMode valueOf(String str) {
        return (StickerPanelSettingsConfig$SortMode) Enum.valueOf(StickerPanelSettingsConfig$SortMode.class, str);
    }

    public static StickerPanelSettingsConfig$SortMode[] values() {
        return (StickerPanelSettingsConfig$SortMode[]) $VALUES.clone();
    }

    public final String getKey() {
        return this.key;
    }

    public final String getLabel() {
        return this.label;
    }
}
