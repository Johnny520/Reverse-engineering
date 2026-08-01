package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.CompoundButton;

/* JADX INFO: loaded from: classes.dex */
public abstract class wb {
    public static ColorStateList a(CompoundButton r0) {
        return r0.getButtonTintList();
    }

    public static PorterDuff.Mode b(CompoundButton r0) {
        return r0.getButtonTintMode();
    }

    public static void c(CompoundButton r0, ColorStateList r1) {
        r0.setButtonTintList(r1);
    }

    public static void d(CompoundButton r0, PorterDuff.Mode r1) {
        r0.setButtonTintMode(r1);
    }
}
