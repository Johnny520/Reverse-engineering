package p051d;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* JADX INFO: renamed from: d.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0739a implements TransformationMethod {

    /* JADX INFO: renamed from: a */
    public Locale f2575a;

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence r1, View r2) {
        if (r1 != null) goto L6;
        return null;
    L6:
        return r1.toString().toUpperCase(this.f2575a);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View r1, CharSequence r2, boolean r3, int r4, Rect r5) {
    }
}
