package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {
    public static i0 b;
    public final Object a;

    public i0() {
        this.a = new Object();
        new Handler(Looper.getMainLooper(), new v30(this));
    }

    public static i0 a(boolean r7, int r8, int r9, int r10, int r11) {
        return new i0(AccessibilityNodeInfo.CollectionItemInfo.obtain(r8, r9, r10, r11, false, r7));
    }

    public i0(AccessibilityNodeInfo.CollectionItemInfo r1) {
        this.a = r1;
    }
}
