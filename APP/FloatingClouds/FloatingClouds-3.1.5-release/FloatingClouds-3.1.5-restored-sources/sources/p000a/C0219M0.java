package p000a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.appcompat.C0983R;
import p000a.C0893w5;

/* JADX INFO: renamed from: a.M0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0219M0 {

    /* JADX INFO: renamed from: a */
    public final CompoundButton f734a;

    /* JADX INFO: renamed from: b */
    public ColorStateList f735b = null;

    /* JADX INFO: renamed from: c */
    public PorterDuff.Mode f736c = null;

    /* JADX INFO: renamed from: d */
    public boolean f737d = false;

    /* JADX INFO: renamed from: e */
    public boolean f738e = false;

    /* JADX INFO: renamed from: f */
    public boolean f739f;

    public C0219M0(CompoundButton compoundButton) {
        this.f734a = compoundButton;
    }

    /* JADX INFO: renamed from: a */
    public final void m596a() {
        CompoundButton compoundButton = this.f734a;
        Drawable drawableM305a = C0114G3.m305a(compoundButton);
        if (drawableM305a != null) {
            if (this.f737d || this.f738e) {
                Drawable drawableMutate = drawableM305a.mutate();
                if (this.f737d) {
                    C0893w5.a.m2176h(drawableMutate, this.f735b);
                }
                if (this.f738e) {
                    C0893w5.a.m2177i(drawableMutate, this.f736c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m597b(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = this.f734a;
        C0751of c0751ofM1768e = C0751of.m1768e(compoundButton.getContext(), attributeSet, C0983R.styleable.CompoundButton, i);
        TypedArray typedArray = c0751ofM1768e.f2960b;
        C0866ug.m2002i(compoundButton, compoundButton.getContext(), C0983R.styleable.CompoundButton, attributeSet, c0751ofM1768e.f2960b, i);
        try {
            if (typedArray.hasValue(C0983R.styleable.CompoundButton_buttonCompat) && (resourceId2 = typedArray.getResourceId(C0983R.styleable.CompoundButton_buttonCompat, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(C0889w1.m2115A(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(C0983R.styleable.CompoundButton_android_button)) {
                        compoundButton.setButtonDrawable(C0889w1.m2115A(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(C0983R.styleable.CompoundButton_android_button) && (resourceId = typedArray.getResourceId(C0983R.styleable.CompoundButton_android_button, 0)) != 0) {
                compoundButton.setButtonDrawable(C0889w1.m2115A(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(C0983R.styleable.CompoundButton_buttonTint)) {
                C0096F3.m257c(compoundButton, c0751ofM1768e.m1769a(C0983R.styleable.CompoundButton_buttonTint));
            }
            if (typedArray.hasValue(C0983R.styleable.CompoundButton_buttonTintMode)) {
                C0096F3.m258d(compoundButton, C0912x5.m2200c(typedArray.getInt(C0983R.styleable.CompoundButton_buttonTintMode, -1), null));
            }
            c0751ofM1768e.m1773f();
        } catch (Throwable th) {
            c0751ofM1768e.m1773f();
            throw th;
        }
    }
}
