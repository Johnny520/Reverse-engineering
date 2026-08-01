package p293u4;

import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;
import p279t4.C8106a;

/* JADX INFO: renamed from: u4.v */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8525v implements InterfaceC8523t {

    /* JADX INFO: renamed from: b */
    public static final C8525v f28415b = new C8525v();

    @Override // p293u4.InterfaceC8523t
    /* JADX INFO: renamed from: a */
    public C8106a mo32776a(Context context, InterfaceC8514k interfaceC8514k) {
        context.getClass();
        interfaceC8514k.getClass();
        WindowManager windowManager = context.isUiContext() ? (WindowManager) context.getSystemService(WindowManager.class) : (WindowManager) context.getApplicationContext().getSystemService(WindowManager.class);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new C8106a(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }
}
