package p000;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* JADX INFO: renamed from: vi */
/* JADX INFO: loaded from: classes.dex */
public final class C0819vi implements TransformationMethod {

    /* JADX INFO: renamed from: a */
    public final TransformationMethod f4959a;

    public C0819vi(TransformationMethod transformationMethod) {
        this.f4959a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f4959a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || C0262gi.m1277a().m1278b() != 1) {
            return charSequence;
        }
        C0262gi c0262giM1277a = C0262gi.m1277a();
        c0262giM1277a.getClass();
        return c0262giM1277a.m1281e(charSequence, 0, charSequence.length());
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f4959a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
