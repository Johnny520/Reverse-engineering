package p179m2;

import android.content.Context;
import android.os.Build;
import android.os.Vibrator;

/* JADX INFO: renamed from: m2.z1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4938z1 {

    /* JADX INFO: renamed from: a */
    public static final C4938z1 f14948a = new C4938z1();

    /* JADX INFO: renamed from: a */
    public final boolean m19943a(Context context) {
        return Build.VERSION.SDK_INT >= 31 && ((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2);
    }
}
