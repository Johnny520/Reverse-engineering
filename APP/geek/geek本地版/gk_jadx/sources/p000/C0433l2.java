package p000;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* JADX INFO: renamed from: l2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0433l2 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public e90 f2992a;

    /* JADX INFO: renamed from: b */
    public AnimatorSet f2993b;

    /* JADX INFO: renamed from: c */
    public ArrayList f2994c;

    /* JADX INFO: renamed from: d */
    public C0511n6 f2995d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
