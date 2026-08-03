package Yue;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: Yue.ۥۢۤۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8271 {
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ */
    public static <T extends View> T m4244(View view, @InterfaceC5411 int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            T t = (T) viewGroup.getChildAt(i2).findViewById(i);
            if (t != null) {
                return t;
            }
        }
        return null;
    }
}
