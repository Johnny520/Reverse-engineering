package p017J;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.CompoundButton;

/* JADX INFO: renamed from: J.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0213b {
    /* JADX INFO: renamed from: a */
    public static ColorStateList m593a(CompoundButton r02) {
        return r02.getButtonTintList();
    }

    /* JADX INFO: renamed from: b */
    public static PorterDuff.Mode m594b(CompoundButton r02) {
        return r02.getButtonTintMode();
    }

    /* JADX INFO: renamed from: c */
    public static void m595c(CompoundButton r02, ColorStateList r1) {
        r02.setButtonTintList(r1);
    }

    /* JADX INFO: renamed from: d */
    public static void m596d(CompoundButton r02, PorterDuff.Mode r1) {
        r02.setButtonTintMode(r1);
    }
}
