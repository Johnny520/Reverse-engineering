package Yue;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3655 {
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public static Handler m726() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}
