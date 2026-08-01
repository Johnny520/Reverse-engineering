package p000;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* JADX INFO: renamed from: ti */
/* JADX INFO: loaded from: classes.dex */
public final class C0746ti implements TransformationMethod {

    /* JADX INFO: renamed from: a */
    public final TransformationMethod f4576a;

    public C0746ti(TransformationMethod transformationMethod) {
        this.f4576a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f4576a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || C0188ei.m1029a().m1030b() != 1) {
            return charSequence;
        }
        C0188ei c0188eiM1029a = C0188ei.m1029a();
        c0188eiM1029a.getClass();
        return c0188eiM1029a.m1033e(charSequence, 0, charSequence.length());
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f4576a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
