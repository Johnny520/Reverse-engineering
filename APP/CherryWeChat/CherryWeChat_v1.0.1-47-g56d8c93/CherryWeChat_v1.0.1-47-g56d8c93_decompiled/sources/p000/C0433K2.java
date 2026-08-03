package p000;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* JADX INFO: renamed from: K2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0433K2 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public C0530MD f1420a;

    /* JADX INFO: renamed from: b */
    public AnimatorSet f1421b;

    /* JADX INFO: renamed from: c */
    public ArrayList f1422c;

    /* JADX INFO: renamed from: d */
    public C0521M4 f1423d;

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
