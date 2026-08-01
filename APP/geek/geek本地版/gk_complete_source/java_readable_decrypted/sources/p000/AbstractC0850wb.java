package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.CompoundButton;

/* JADX INFO: renamed from: wb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0850wb {
    /* JADX INFO: renamed from: a */
    public static ColorStateList m2558a(CompoundButton compoundButton) {
        return compoundButton.getButtonTintList();
    }

    /* JADX INFO: renamed from: b */
    public static PorterDuff.Mode m2559b(CompoundButton compoundButton) {
        return compoundButton.getButtonTintMode();
    }

    /* JADX INFO: renamed from: c */
    public static void m2560c(CompoundButton compoundButton, ColorStateList colorStateList) {
        compoundButton.setButtonTintList(colorStateList);
    }

    /* JADX INFO: renamed from: d */
    public static void m2561d(CompoundButton compoundButton, PorterDuff.Mode mode) {
        compoundButton.setButtonTintMode(mode);
    }
}
