package Yue;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4068 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f646 = "CompoundButtonCompat";

    /* JADX INFO: renamed from: ۥ۟ */
    public static Field f647;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean f8127;

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۥ$ۥ */
    @InterfaceC7113(21)
    public static class C0316 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static ColorStateList m1023(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static PorterDuff.Mode m1024(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m11504(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static void m11505(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۥ$ۥ۟ */
    @InterfaceC7113(23)
    public static class C0317 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static Drawable m1025(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ */
    public static Drawable m1021(@InterfaceC6391 CompoundButton compoundButton) {
        return C0317.m1025(compoundButton);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟ */
    public static ColorStateList m1022(@InterfaceC6391 CompoundButton compoundButton) {
        return C0316.m1023(compoundButton);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static PorterDuff.Mode m11501(@InterfaceC6391 CompoundButton compoundButton) {
        return C0316.m1024(compoundButton);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m11502(@InterfaceC6391 CompoundButton compoundButton, @InterfaceC6490 ColorStateList colorStateList) {
        C0316.m11504(compoundButton, colorStateList);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m11503(@InterfaceC6391 CompoundButton compoundButton, @InterfaceC6490 PorterDuff.Mode mode) {
        C0316.m11505(compoundButton, mode);
    }
}
