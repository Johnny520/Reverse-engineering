package p000;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* JADX INFO: renamed from: y2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2740y2 implements TransformationMethod {

    /* JADX INFO: renamed from: a */
    public Locale f9344a;

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence r1, View r2) {
        if (r1 != null) goto L4;
        return null;
    L4:
        return r1.toString().toUpperCase(this.f9344a);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View r1, CharSequence r2, boolean r3, int r4, Rect r5) {
    }
}
