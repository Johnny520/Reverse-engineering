package androidx.fragment.app;

import android.view.View;
import p009.AbstractC6183;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2354 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static SpecialEffectsController$Operation$State m4474(int i) {
        if (i == 0) {
            return SpecialEffectsController$Operation$State.VISIBLE;
        }
        if (i == 4) {
            return SpecialEffectsController$Operation$State.INVISIBLE;
        }
        if (i == 8) {
            return SpecialEffectsController$Operation$State.GONE;
        }
        C5925.m11310(AbstractC6183.m11588(i, "Unknown visibility "));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static SpecialEffectsController$Operation$State m4475(View view) {
        view.getClass();
        return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? SpecialEffectsController$Operation$State.INVISIBLE : m4474(view.getVisibility());
    }
}
