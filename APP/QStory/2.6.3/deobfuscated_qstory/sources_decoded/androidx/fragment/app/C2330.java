package androidx.fragment.app;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.core.os.InterfaceC2170;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Method;
import p026.InterfaceC6312;
import p033.AbstractC6336;
import p039.C6394;
import top.suzhelan.qstory.hook.item.RunnableC5939;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2330 implements InterfaceC2170, InterfaceC6312 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f6837;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f6838;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f6839;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Object f6840;

    public /* synthetic */ C2330(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f6840 = obj;
        this.f6838 = obj2;
        this.f6839 = obj3;
        this.f6837 = obj4;
    }

    @Override // androidx.core.os.InterfaceC2170
    public void onCancel() {
        View view = (View) this.f6840;
        C2349 c2349 = (C2349) this.f6838;
        C2329 c2329 = (C2329) this.f6839;
        C2357 c2357 = (C2357) this.f6837;
        view.clearAnimation();
        c2349.f6957.endViewTransition(view);
        c2329.m306();
        if (AbstractC2313.m4362(2)) {
            Log.v("FragmentManager", "Animation from operation " + c2357 + " has been cancelled.");
        }
    }

    @Override // p026.InterfaceC6312
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo1479(XC_MethodHook.MethodHookParam methodHookParam) {
        C6394 c6394 = (C6394) this.f6840;
        Class cls = (Class) this.f6838;
        Method method = (Method) this.f6839;
        Method method2 = (Method) this.f6837;
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC5939(c6394, method, AbstractC6336.m11858(cls, methodHookParam.thisObject), method2), 1200L);
    }
}
