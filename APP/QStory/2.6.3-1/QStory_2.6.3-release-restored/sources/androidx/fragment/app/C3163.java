package androidx.fragment.app;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.core.os.InterfaceC3003;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Method;
import p042.InterfaceC7141;
import p049.AbstractC7165;
import p055.C7223;
import top.suzhelan.qstory.hook.item.RunnableC6769;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3163 implements InterfaceC3003, InterfaceC7141 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f7182;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f7183;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f7184;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Object f7185;

    public /* synthetic */ C3163(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f7185 = obj;
        this.f7183 = obj2;
        this.f7184 = obj3;
        this.f7182 = obj4;
    }

    @Override // androidx.core.os.InterfaceC3003
    public void onCancel() {
        View view = (View) this.f7185;
        C3182 c3182 = (C3182) this.f7183;
        C3162 c3162 = (C3162) this.f7184;
        C3190 c3190 = (C3190) this.f7182;
        view.clearAnimation();
        c3182.f7302.endViewTransition(view);
        c3162.m866();
        if (AbstractC3146.m4922(2)) {
            Log.v("FragmentManager", "Animation from operation " + c3190 + " has been cancelled.");
        }
    }

    @Override // p042.InterfaceC7141
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
        C7223 c7223 = (C7223) this.f7185;
        Class cls = (Class) this.f7183;
        Method method = (Method) this.f7184;
        Method method2 = (Method) this.f7182;
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC6769(c7223, method, AbstractC7165.m12417(cls, methodHookParam.thisObject), method2), 1200L);
    }
}
