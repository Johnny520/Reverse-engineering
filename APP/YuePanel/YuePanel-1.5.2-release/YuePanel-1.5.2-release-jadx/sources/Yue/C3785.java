package Yue;

import android.text.TextUtils;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۤۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3785 {
    /* JADX INFO: renamed from: ۥ */
    public static final boolean m832(@InterfaceC6399 CharSequence charSequence) {
        return TextUtils.isDigitsOnly(charSequence);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int m833(@InterfaceC6399 CharSequence charSequence) {
        return TextUtils.getTrimmedLength(charSequence);
    }
}
