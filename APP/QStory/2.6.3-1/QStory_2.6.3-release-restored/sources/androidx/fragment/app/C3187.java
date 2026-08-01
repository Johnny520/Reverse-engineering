package androidx.fragment.app;

import android.view.View;
import p025.AbstractC7012;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3187 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static SpecialEffectsController$Operation$State m5034(int i) {
        if (i == 0) {
            return SpecialEffectsController$Operation$State.VISIBLE;
        }
        if (i == 4) {
            return SpecialEffectsController$Operation$State.INVISIBLE;
        }
        if (i == 8) {
            return SpecialEffectsController$Operation$State.GONE;
        }
        C6755.m11869(AbstractC7012.m12147(i, "Unknown visibility "));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static SpecialEffectsController$Operation$State m5035(View view) {
        view.getClass();
        return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? SpecialEffectsController$Operation$State.INVISIBLE : m5034(view.getVisibility());
    }
}
