package p293u4;

import android.content.Context;
import android.view.WindowManager;

/* JADX INFO: renamed from: u4.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8515l implements InterfaceC8514k {

    /* JADX INFO: renamed from: b */
    public static final C8515l f28408b = new C8515l();

    @Override // p293u4.InterfaceC8514k
    /* JADX INFO: renamed from: a */
    public float mo32765a(Context context) {
        context.getClass();
        return ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }
}
