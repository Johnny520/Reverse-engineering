package Yue;

import Yue.C3542;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3540 {

    /* JADX INFO: renamed from: Yue.ۥ۟ۢۧۦ$ۥ */
    @InterfaceC7113(29)
    public static class C0175 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static ColorFilter m616(int i, Object obj) {
            return new BlendModeColorFilter(i, (BlendMode) obj);
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ */
    public static ColorFilter m615(int i, @InterfaceC6391 EnumC3541 enumC3541) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object objM619 = C3542.C0177.m619(enumC3541);
            if (objM619 != null) {
                return C0175.m616(i, objM619);
            }
            return null;
        }
        PorterDuff.Mode modeM618 = C3542.m618(enumC3541);
        if (modeM618 != null) {
            return new PorterDuffColorFilter(i, modeM618);
        }
        return null;
    }
}
