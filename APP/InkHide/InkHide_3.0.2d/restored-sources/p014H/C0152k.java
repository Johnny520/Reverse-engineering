package p014H;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.C0396k;

/* JADX INFO: renamed from: H.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0152k implements TransformationMethod {

    /* JADX INFO: renamed from: a */
    public final TransformationMethod f464a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0152k(TransformationMethod transformationMethod) {
        this.f464a = transformationMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f464a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || C0396k.m761a().m762b() != 1) {
            return charSequence;
        }
        C0396k c0396kM761a = C0396k.m761a();
        c0396kM761a.getClass();
        return c0396kM761a.m765e(charSequence, 0, charSequence.length());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z2, int i2, Rect rect) {
        TransformationMethod transformationMethod = this.f464a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z2, i2, rect);
        }
    }
}
