package p152k3;

import android.os.Build;
import android.os.Trace;

/* JADX INFO: renamed from: k3.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3948b {
    /* JADX INFO: renamed from: a */
    public static final void m15652a(String str, long j10) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j10);
        }
    }
}
