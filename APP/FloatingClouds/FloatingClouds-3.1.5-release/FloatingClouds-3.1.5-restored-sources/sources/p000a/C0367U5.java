package p000a;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.C1094c;

/* JADX INFO: renamed from: a.U5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0367U5 implements TransformationMethod {

    /* JADX INFO: renamed from: a */
    public final TransformationMethod f1376a;

    public C0367U5(TransformationMethod transformationMethod) {
        this.f1376a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f1376a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || C1094c.m2505a().m2506b() != 1) {
            return charSequence;
        }
        C1094c c1094cM2505a = C1094c.m2505a();
        c1094cM2505a.getClass();
        return c1094cM2505a.m2509e(charSequence, 0, charSequence.length());
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f1376a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
