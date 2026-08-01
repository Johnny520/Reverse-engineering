package androidx.fragment.app;

import android.view.View;
import p007.AbstractC6136;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2354 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static SpecialEffectsController$Operation$State m4464(int i) {
        if (i == 0) {
            return SpecialEffectsController$Operation$State.VISIBLE;
        }
        if (i == 4) {
            return SpecialEffectsController$Operation$State.INVISIBLE;
        }
        if (i == 8) {
            return SpecialEffectsController$Operation$State.GONE;
        }
        C5919.m11249(AbstractC6136.m11556(i, "Unknown visibility "));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static SpecialEffectsController$Operation$State m4465(View view) {
        view.getClass();
        return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? SpecialEffectsController$Operation$State.INVISIBLE : m4464(view.getVisibility());
    }
}
