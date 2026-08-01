package p337;

import top.suzhelan.qstory.hook.item.stickerpanel.StickerPanelSettingsConfig$SortMode;

/* JADX INFO: renamed from: 飘花落叶言苏世兰子哲楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC9520 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f24854;

    static {
        int[] iArr = new int[StickerPanelSettingsConfig$SortMode.values().length];
        try {
            iArr[StickerPanelSettingsConfig$SortMode.RECENT_USAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StickerPanelSettingsConfig$SortMode.NAME_ASC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[StickerPanelSettingsConfig$SortMode.NAME_DESC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[StickerPanelSettingsConfig$SortMode.TIME_ASC.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[StickerPanelSettingsConfig$SortMode.TIME_DESC.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f24854 = iArr;
    }
}
