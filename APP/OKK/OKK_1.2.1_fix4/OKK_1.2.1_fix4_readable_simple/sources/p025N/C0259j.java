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

    public C0259j(TransformationMethod r1) {
        this.f547a = r1;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence r3, View r4) {
        if (r4.isInEditMode() == false) goto L5;
        return r3;
    L5:
        TransformationMethod r02 = this.f547a;
        if (r02 == null) goto L8;
        r3 = r02.getTransformation(r3, r4);
    L8:
        if (r3 != null) goto L10;
        return r3;
    L10:
        if (C0485j.m1199a().m1200b() != 1) goto L15;
        C0485j r42 = C0485j.m1199a();
        r42.getClass();
        return r42.m1204f(r3, 0, r3.length());
    L15:
        return r3;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View r7, CharSequence r8, boolean r9, int r10, Rect r11) {
        TransformationMethod r02 = this.f547a;
        if (r02 == null) goto L6;
        r02.onFocusChanged(r7, r8, r9, r10, r11);
        return;
    }
}
