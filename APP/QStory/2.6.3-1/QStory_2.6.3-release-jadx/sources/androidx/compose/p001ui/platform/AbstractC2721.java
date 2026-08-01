package androidx.compose.p001ui.platform;

import androidx.compose.p001ui.state.ToggleableState;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2721 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f5888;

    static {
        int[] iArr = new int[ToggleableState.values().length];
        try {
            iArr[ToggleableState.f12On.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ToggleableState.Off.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ToggleableState.Indeterminate.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f5888 = iArr;
    }
}
