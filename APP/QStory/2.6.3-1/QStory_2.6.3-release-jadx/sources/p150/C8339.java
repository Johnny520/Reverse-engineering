package p150;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;
import androidx.window.layout.C3432;
import p163.C8396;

/* JADX INFO: renamed from: 飘花落叶言子兰哲世楪苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8339 implements InterfaceC8341, InterfaceC8343 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8339 f20723 = new C8339();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C8339 f20722 = new C8339();

    @Override // p150.InterfaceC8343
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public C3432 mo13288(Context context, InterfaceC8338 interfaceC8338) {
        context.getClass();
        interfaceC8338.getClass();
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        float f = context.getResources().getDisplayMetrics().density;
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new C3432(bounds, f);
    }

    @Override // p150.InterfaceC8343
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public C3432 mo13289(Activity activity, InterfaceC8338 interfaceC8338) {
        activity.getClass();
        interfaceC8338.getClass();
        InterfaceC8341.f20730.getClass();
        return new C3432(new C8396(C8342.m13291().mo13290(activity)), interfaceC8338.mo13287(activity));
    }

    @Override // p150.InterfaceC8341
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Rect mo13290(Activity activity) {
        activity.getClass();
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }
}
