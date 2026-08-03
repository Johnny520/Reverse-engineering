package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;

/* JADX INFO: renamed from: j3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2082j3 {

    /* JADX INFO: renamed from: a */
    public ColorStateList f7338a = null;

    /* JADX INFO: renamed from: b */
    public PorterDuff.Mode f7339b = null;

    /* JADX INFO: renamed from: c */
    public boolean f7340c = false;

    /* JADX INFO: renamed from: d */
    public boolean f7341d = false;

    /* JADX INFO: renamed from: e */
    public boolean f7342e;

    /* JADX INFO: renamed from: f */
    public final TextView f7343f;

    public /* synthetic */ C2082j3(TextView textView) {
        this.f7343f = textView;
    }

    /* JADX INFO: renamed from: a */
    public void m4246a() {
        CompoundButton compoundButton = (CompoundButton) this.f7343f;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f7340c || this.f7341d) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.f7340c) {
                    drawableMutate.setTintList(this.f7338a);
                }
                if (this.f7341d) {
                    drawableMutate.setTintMode(this.f7339b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m4247b() {
        C1525i3 c1525i3 = (C1525i3) this.f7343f;
        Drawable checkMarkDrawable = c1525i3.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f7340c || this.f7341d) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f7340c) {
                    drawableMutate.setTintList(this.f7338a);
                }
                if (this.f7341d) {
                    drawableMutate.setTintMode(this.f7339b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(c1525i3.getDrawableState());
                }
                c1525i3.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m4248c(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f7343f;
        Context context = compoundButton.getContext();
        int[] iArr = AbstractC0982Wu.f3078m;
        C2656w4 c2656w4M5186A = C2656w4.m5186A(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c2656w4M5186A.f9196b;
        AbstractC2185lE.m4398k(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) c2656w4M5186A.f9196b, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(AbstractC1406fG.m2695U(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(AbstractC1406fG.m2695U(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(AbstractC1406fG.m2695U(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(c2656w4M5186A.m5209p(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(AbstractC0107Ce.m161c(typedArray.getInt(3, -1), null));
            }
            c2656w4M5186A.m5195E();
        } catch (Throwable th) {
            c2656w4M5186A.m5195E();
            throw th;
        }
    }
}
