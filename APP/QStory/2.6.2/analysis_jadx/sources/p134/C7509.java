package p134;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;
import androidx.window.layout.C2598;
import p147.C7566;

/* JADX INFO: renamed from: 飘花落叶言子兰哲世楪苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7509 implements InterfaceC7511, InterfaceC7513 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7509 f20383 = new C7509();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7509 f20382 = new C7509();

    @Override // p134.InterfaceC7513
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public C2598 mo12700(Context context, InterfaceC7508 interfaceC7508) {
        context.getClass();
        interfaceC7508.getClass();
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        float f = context.getResources().getDisplayMetrics().density;
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new C2598(bounds, f);
    }

    @Override // p134.InterfaceC7513
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public C2598 mo12701(Activity activity, InterfaceC7508 interfaceC7508) {
        activity.getClass();
        interfaceC7508.getClass();
        InterfaceC7511.f20390.getClass();
        return new C2598(new C7566(C7512.m12703().mo12702(activity)), interfaceC7508.mo12699(activity));
    }

    @Override // p134.InterfaceC7511
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Rect mo12702(Activity activity) {
        activity.getClass();
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }
}
