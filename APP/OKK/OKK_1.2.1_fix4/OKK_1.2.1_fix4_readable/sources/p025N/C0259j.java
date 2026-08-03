package p025N;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.C0485j;

/* JADX INFO: renamed from: N.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0259j implements TransformationMethod {

    /* JADX INFO: renamed from: a */
    public final TransformationMethod f547a;

    public C0259j(TransformationMethod transformationMethod) {
        this.f547a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f547a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || C0485j.m1199a().m1200b() != 1) {
            return charSequence;
        }
        C0485j c0485jM1199a = C0485j.m1199a();
        c0485jM1199a.getClass();
        return c0485jM1199a.m1204f(charSequence, 0, charSequence.length());
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z2, int i2, Rect rect) {
        TransformationMethod transformationMethod = this.f547a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z2, i2, rect);
        }
    }
}
