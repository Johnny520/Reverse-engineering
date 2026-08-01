package p134;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;
import androidx.window.layout.C2599;
import p147.C7567;

/* JADX INFO: renamed from: 飘花落叶言子兰哲世楪苏.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7508 implements InterfaceC7509, InterfaceC7514 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7508 f20376 = new C7508();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7508 f20375 = new C7508();

    @Override // p134.InterfaceC7509
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public float mo12728(Context context) {
        context.getClass();
        return ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }

    @Override // p134.InterfaceC7514
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C2599 mo12729(Context context, InterfaceC7509 interfaceC7509) {
        context.getClass();
        interfaceC7509.getClass();
        WindowManager windowManager = context.isUiContext() ? (WindowManager) context.getSystemService(WindowManager.class) : (WindowManager) context.getApplicationContext().getSystemService(WindowManager.class);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new C2599(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }

    @Override // p134.InterfaceC7514
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C2599 mo12730(Activity activity, InterfaceC7509 interfaceC7509) {
        activity.getClass();
        interfaceC7509.getClass();
        InterfaceC7512.f20385.getClass();
        return new C2599(new C7567(C7513.m12732().mo12731(activity)), interfaceC7509.mo12728(activity));
    }
}
