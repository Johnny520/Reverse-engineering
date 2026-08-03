package p000;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* JADX INFO: renamed from: Ff */
/* JADX INFO: loaded from: classes.dex */
public final class C0237Ff implements TransformationMethod {

    /* JADX INFO: renamed from: a */
    public final TransformationMethod f753a;

    public C0237Ff(TransformationMethod r1) {
        this.f753a = r1;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence r3, View r4) {
        if (r4.isInEditMode() == false) goto L5;
        return r3;
    L5:
        TransformationMethod r0 = this.f753a;
        if (r0 == null) goto L8;
        r3 = r0.getTransformation(r3, r4);
    L8:
        if (r3 != null) goto L10;
        return r3;
    L10:
        if (C2372pf.m4798a().m4799b() != 1) goto L15;
        C2372pf r42 = C2372pf.m4798a();
        r42.getClass();
        return r42.m4802e(r3, 0, r3.length());
    L15:
        return r3;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View r7, CharSequence r8, boolean r9, int r10, Rect r11) {
        TransformationMethod r0 = this.f753a;
        if (r0 == null) goto L6;
        r0.onFocusChanged(r7, r8, r9, r10, r11);
        return;
    }
}
