package top.suzhelan.qstory.ui.components;

import lin.xposed.hook.view.main.SearchHelper$MatchType;

/* JADX INFO: renamed from: top.suzhelan.qstory.ui.components.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5975 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f16208;

    static {
        int[] iArr = new int[SearchHelper$MatchType.values().length];
        try {
            iArr[SearchHelper$MatchType.FUNCTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SearchHelper$MatchType.DIRECTORY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SearchHelper$MatchType.GROUP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f16208 = iArr;
    }
}
