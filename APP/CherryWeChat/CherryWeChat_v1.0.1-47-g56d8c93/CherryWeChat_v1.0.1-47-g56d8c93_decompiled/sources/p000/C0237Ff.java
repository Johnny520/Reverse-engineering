package p000;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* JADX INFO: renamed from: Ff */
/* JADX INFO: loaded from: classes.dex */
public final class C0237Ff implements TransformationMethod {

    /* JADX INFO: renamed from: a */
    public final TransformationMethod f753a;

    public C0237Ff(TransformationMethod transformationMethod) {
        this.f753a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f753a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || C2372pf.m4798a().m4799b() != 1) {
            return charSequence;
        }
        C2372pf c2372pfM4798a = C2372pf.m4798a();
        c2372pfM4798a.getClass();
        return c2372pfM4798a.m4802e(charSequence, 0, charSequence.length());
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f753a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
