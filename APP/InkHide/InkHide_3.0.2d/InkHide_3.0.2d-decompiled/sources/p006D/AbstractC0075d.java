package p006D;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.CompoundButton;

/* JADX INFO: renamed from: D.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0075d {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static ColorStateList m155a(CompoundButton compoundButton) {
        return compoundButton.getButtonTintList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static PorterDuff.Mode m156b(CompoundButton compoundButton) {
        return compoundButton.getButtonTintMode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m157c(CompoundButton compoundButton, ColorStateList colorStateList) {
        compoundButton.setButtonTintList(colorStateList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m158d(CompoundButton compoundButton, PorterDuff.Mode mode) {
        compoundButton.setButtonTintMode(mode);
    }
}
