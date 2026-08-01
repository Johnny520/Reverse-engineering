package top.suzhelan.qstory.hook.item.stickerpanel.adapter;

import kotlin.Metadata;
import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import net.bytebuddy.description.method.MethodDescription;
import p303.AbstractC9234;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m151d2 = {"top/suzhelan/qstory/hook/item/stickerpanel/adapter/StickerDirAdapter$SpecialAction", "", "Ltop/suzhelan/qstory/hook/item/stickerpanel/adapter/StickerDirAdapter$SpecialAction;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "SORT_CONFIG", "ONLINE_STICKER", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class StickerDirAdapter$SpecialAction {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ StickerDirAdapter$SpecialAction[] $VALUES;
    public static final StickerDirAdapter$SpecialAction SORT_CONFIG = new StickerDirAdapter$SpecialAction(AbstractC9234.m14531(2714), 0);
    public static final StickerDirAdapter$SpecialAction ONLINE_STICKER = new StickerDirAdapter$SpecialAction(AbstractC9234.m14531(2715), 1);

    private static final /* synthetic */ StickerDirAdapter$SpecialAction[] $values() {
        return new StickerDirAdapter$SpecialAction[]{SORT_CONFIG, ONLINE_STICKER};
    }

    static {
        StickerDirAdapter$SpecialAction[] stickerDirAdapter$SpecialActionArr$values = $values();
        $VALUES = stickerDirAdapter$SpecialActionArr$values;
        $ENTRIES = AbstractC5196.m9425(stickerDirAdapter$SpecialActionArr$values);
    }

    private StickerDirAdapter$SpecialAction(String str, int i) {
    }

    public static InterfaceC5197 getEntries() {
        return $ENTRIES;
    }

    public static StickerDirAdapter$SpecialAction valueOf(String str) {
        return (StickerDirAdapter$SpecialAction) Enum.valueOf(StickerDirAdapter$SpecialAction.class, str);
    }

    public static StickerDirAdapter$SpecialAction[] values() {
        return (StickerDirAdapter$SpecialAction[]) $VALUES.clone();
    }
}
