package p134;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;
import androidx.window.layout.C2598;
import p147.C7566;

/* JADX INFO: renamed from: 飘花落叶言子兰哲世楪苏.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7507 implements InterfaceC7508, InterfaceC7513 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7507 f20381 = new C7507();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7507 f20380 = new C7507();

    @Override // p134.InterfaceC7508
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public float mo12699(Context context) {
        context.getClass();
        return ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }

    @Override // p134.InterfaceC7513
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C2598 mo12700(Context context, InterfaceC7508 interfaceC7508) {
        context.getClass();
        interfaceC7508.getClass();
        WindowManager windowManager = context.isUiContext() ? (WindowManager) context.getSystemService(WindowManager.class) : (WindowManager) context.getApplicationContext().getSystemService(WindowManager.class);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new C2598(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }

    @Override // p134.InterfaceC7513
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C2598 mo12701(Activity activity, InterfaceC7508 interfaceC7508) {
        activity.getClass();
        interfaceC7508.getClass();
        InterfaceC7511.f20390.getClass();
        return new C2598(new C7566(C7512.m12703().mo12702(activity)), interfaceC7508.mo12699(activity));
    }
}
