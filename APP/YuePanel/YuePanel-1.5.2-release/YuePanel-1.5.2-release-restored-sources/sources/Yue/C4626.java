package Yue;

import Yue.InterfaceC7144;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.C8812;

/* JADX INFO: renamed from: Yue.ۥۣ۠۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
@InterfaceC7113(19)
public class C4626 implements TransformationMethod {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6490
    public final TransformationMethod f1024;

    public C4626(@InterfaceC6490 TransformationMethod transformationMethod) {
        this.f1024 = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(@InterfaceC6490 CharSequence charSequence, @InterfaceC6391 View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f1024;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || C8812.m29617().m29632() != 1) ? charSequence : C8812.m29617().m29641(charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f1024;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public TransformationMethod m1586() {
        return this.f1024;
    }
}
