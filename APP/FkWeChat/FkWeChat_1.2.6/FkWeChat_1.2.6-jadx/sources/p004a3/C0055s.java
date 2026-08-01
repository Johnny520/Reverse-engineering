package p004a3;

import android.content.Context;
import android.os.Build;

/* JADX INFO: renamed from: a3.s */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0055s {

    /* JADX INFO: renamed from: a */
    public static final C0055s f130a = new C0055s();

    /* JADX INFO: renamed from: a */
    public final int m210a(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C0056t.f131a.m211a(context);
        }
        return 0;
    }
}
