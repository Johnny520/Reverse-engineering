package androidx.fragment.app;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.core.os.InterfaceC2170;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Method;
import p026.InterfaceC6294;
import p032.AbstractC6317;
import p038.C6372;
import top.suzhelan.qstory.hook.item.RunnableC5949;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2330 implements InterfaceC2170, InterfaceC6294 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f6836;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f6837;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f6838;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Object f6839;

    public /* synthetic */ C2330(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f6839 = obj;
        this.f6837 = obj2;
        this.f6838 = obj3;
        this.f6836 = obj4;
    }

    @Override // androidx.core.os.InterfaceC2170
    public void onCancel() {
        View view = (View) this.f6839;
        C2349 c2349 = (C2349) this.f6837;
        C2329 c2329 = (C2329) this.f6838;
        C2357 c2357 = (C2357) this.f6836;
        view.clearAnimation();
        c2349.f6956.endViewTransition(view);
        c2329.m305();
        if (AbstractC2313.m4352(2)) {
            Log.v("FragmentManager", "Animation from operation " + c2357 + " has been cancelled.");
        }
    }

    @Override // p026.InterfaceC6294
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo1469(XC_MethodHook.MethodHookParam methodHookParam) {
        C6372 c6372 = (C6372) this.f6839;
        Class cls = (Class) this.f6837;
        Method method = (Method) this.f6838;
        Method method2 = (Method) this.f6836;
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC5949(c6372, method, AbstractC6317.m11830(cls, methodHookParam.thisObject), method2), 1200L);
    }
}
