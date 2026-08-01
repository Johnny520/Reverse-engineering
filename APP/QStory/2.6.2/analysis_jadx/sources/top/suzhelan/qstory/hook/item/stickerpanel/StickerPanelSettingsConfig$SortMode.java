package top.suzhelan.qstory.hook.item.stickerpanel;

import com.bumptech.glide.AbstractC3056;
import kotlin.Metadata;
import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;
import net.bytebuddy.description.method.MethodDescription;
import p324.C8745;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\u000b\u0010\nj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"top/suzhelan/qstory/hook/item/stickerpanel/StickerPanelSettingsConfig$SortMode", "", "Ltop/suzhelan/qstory/hook/item/stickerpanel/StickerPanelSettingsConfig$SortMode;", "", "key", "label", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "getLabel", "Companion", "飘花落叶言苏世兰楪子哲/飘花落叶言子楪苏兰世哲", "RECENT_USAGE", "NAME_ASC", "NAME_DESC", "TIME_ASC", "TIME_DESC", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class StickerPanelSettingsConfig$SortMode {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ StickerPanelSettingsConfig$SortMode[] $VALUES;
    public static final C8745 Companion;
    private final String key;
    private final String label;
    public static final StickerPanelSettingsConfig$SortMode RECENT_USAGE = new StickerPanelSettingsConfig$SortMode(AbstractC3056.m6668(-3937833403848852903L), 0, AbstractC3056.m6668(-3937833287884735911L), AbstractC3056.m6668(-3937833206280357287L));
    public static final StickerPanelSettingsConfig$SortMode NAME_ASC = new StickerPanelSettingsConfig$SortMode(AbstractC3056.m6668(-3937833262114932135L), 1, AbstractC3056.m6668(-3937833163330684327L), AbstractC3056.m6668(-3937833201985389991L));
    public static final StickerPanelSettingsConfig$SortMode NAME_DESC = new StickerPanelSettingsConfig$SortMode(AbstractC3056.m6668(-3937833098906174887L), 2, AbstractC3056.m6668(-3937833107496109479L), AbstractC3056.m6668(-3937833013006828967L));
    public static final StickerPanelSettingsConfig$SortMode TIME_ASC = new StickerPanelSettingsConfig$SortMode(AbstractC3056.m6668(-3937833047366567335L), 3, AbstractC3056.m6668(-3937832982942057895L), AbstractC3056.m6668(-3937832884157810087L));
    public static final StickerPanelSettingsConfig$SortMode TIME_DESC = new StickerPanelSettingsConfig$SortMode(AbstractC3056.m6668(-3937832922812515751L), 4, AbstractC3056.m6668(-3937832793963496871L), AbstractC3056.m6668(-3937832836913169831L));

    private static final /* synthetic */ StickerPanelSettingsConfig$SortMode[] $values() {
        return new StickerPanelSettingsConfig$SortMode[]{RECENT_USAGE, NAME_ASC, NAME_DESC, TIME_ASC, TIME_DESC};
    }

    static {
        StickerPanelSettingsConfig$SortMode[] stickerPanelSettingsConfig$SortModeArr$values = $values();
        $VALUES = stickerPanelSettingsConfig$SortModeArr$values;
        $ENTRIES = AbstractC4363.m8876(stickerPanelSettingsConfig$SortModeArr$values);
        Companion = new C8745();
    }

    private StickerPanelSettingsConfig$SortMode(String str, int i, String str2, String str3) {
        this.key = str2;
        this.label = str3;
    }

    public static InterfaceC4364 getEntries() {
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
