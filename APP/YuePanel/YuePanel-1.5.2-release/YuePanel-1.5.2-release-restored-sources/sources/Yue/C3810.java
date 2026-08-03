package Yue;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۥۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3810 {

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۥۤ$ۥ */
    @InterfaceC7113(21)
    public static class C0260 {
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ */
        public static ColorStateList m857(@InterfaceC6391 CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintList();
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟ */
        public static PorterDuff.Mode m858(@InterfaceC6391 CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintMode();
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m10516(@InterfaceC6391 CheckedTextView checkedTextView, @InterfaceC6490 ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static void m10517(@InterfaceC6391 CheckedTextView checkedTextView, @InterfaceC6490 PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ */
    public static Drawable m855(@InterfaceC6391 CheckedTextView checkedTextView) {
        return checkedTextView.getCheckMarkDrawable();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟ */
    public static ColorStateList m856(@InterfaceC6391 CheckedTextView checkedTextView) {
        return C0260.m857(checkedTextView);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static PorterDuff.Mode m10513(@InterfaceC6391 CheckedTextView checkedTextView) {
        return C0260.m858(checkedTextView);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m10514(@InterfaceC6391 CheckedTextView checkedTextView, @InterfaceC6490 ColorStateList colorStateList) {
        C0260.m10516(checkedTextView, colorStateList);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m10515(@InterfaceC6391 CheckedTextView checkedTextView, @InterfaceC6490 PorterDuff.Mode mode) {
        C0260.m10517(checkedTextView, mode);
    }
}
