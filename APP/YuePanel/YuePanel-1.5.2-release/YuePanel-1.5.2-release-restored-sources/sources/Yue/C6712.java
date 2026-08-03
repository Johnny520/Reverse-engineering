package Yue;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;

/* JADX INFO: renamed from: Yue.ۥۡۤۤۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6712 {
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final PorterDuffColorFilter m3193(@InterfaceC6399 PorterDuff.Mode mode, int i) {
        return new PorterDuffColorFilter(i, mode);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public static final PorterDuffXfermode m3194(@InterfaceC6399 PorterDuff.Mode mode) {
        return new PorterDuffXfermode(mode);
    }
}
