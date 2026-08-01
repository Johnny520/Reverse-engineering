package p293u4;

import android.app.Activity;
import android.graphics.Rect;
import android.view.WindowManager;

/* JADX INFO: renamed from: u4.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8509f implements InterfaceC8505b {

    /* JADX INFO: renamed from: b */
    public static final C8509f f28404b = new C8509f();

    @Override // p293u4.InterfaceC8505b
    /* JADX INFO: renamed from: a */
    public Rect mo32753a(Activity activity) {
        activity.getClass();
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }
}
