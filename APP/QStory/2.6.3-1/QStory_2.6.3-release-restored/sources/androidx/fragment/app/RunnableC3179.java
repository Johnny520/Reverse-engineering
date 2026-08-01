package androidx.fragment.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import com.alibaba.fastjson2.InterfaceC3749;
import com.alibaba.fastjson2.JSONObject;
import com.kongzue.dialogx.dialogs.WaitDialog$TYPE;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.ZipEntry;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import lin.xposed.hook.javaplugin.PluginCallback;
import lin.xposed.hook.javaplugin.controller.PluginLoader;
import lin.xposed.hook.javaplugin.controller.PluginManager;
import lin.xposed.hook.javaplugin.view.menu.PluginMenuGroupView;
import p026.AbstractC7014;
import p049.AbstractC7165;
import p051.C7182;
import p054.C7204;
import p055.C7223;
import p055.C7250;
import p055.C7254;
import p183.C8527;
import p183.C8535;
import p183.C8540;
import p183.C8541;
import p183.InterfaceC8538;
import p267.SharedPreferencesC9005;
import p273.AbstractC9040;
import p273.C9027;
import p273.C9037;
import p332.C9496;
import p354.C9636;
import p371.C9719;
import p371.C9720;
import retrofit2.C6585;
import retrofit2.C6623;
import retrofit2.InterfaceC6625;
import top.linl.dexparser.DexFinder;
import top.suzhelan.qstory.hook.item.C6758;
import top.suzhelan.qstory.hook.item.C6759;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3179 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f7292;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f7293;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f7294;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f7295;

    public /* synthetic */ RunnableC3179(Object obj, Object obj2, Object obj3, int i) {
        this.f7295 = i;
        this.f7293 = obj;
        this.f7294 = obj2;
        this.f7292 = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 1;
        switch (this.f7295) {
            case 0:
                C3182 c3182 = (C3182) this.f7293;
                View view = (View) this.f7294;
                C3162 c3162 = (C3162) this.f7292;
                c3182.f7302.endViewTransition(view);
                c3162.m866();
                return;
            case 1:
                PluginManager.lambda$invokeToPluginMethod$0((PluginLoader) this.f7293, (String) this.f7294, (Object[]) this.f7292);
                return;
            case 2:
                C5703 c5703 = (C5703) this.f7293;
                InterfaceC6625 interfaceC6625 = (InterfaceC6625) this.f7294;
                C6585 c6585 = (C6585) this.f7292;
                C6623 c6623 = (C6623) c5703.f14510;
                if (c6623.f16235.mo11721()) {
                    interfaceC6625.onFailure(c6623, new IOException("Canceled"));
                    return;
                } else {
                    interfaceC6625.onResponse(c6623, c6585);
                    return;
                }
            case 3:
                ((InterfaceC6625) this.f7294).onFailure((C6623) ((C5703) this.f7293).f14510, (Throwable) this.f7292);
                return;
            case 4:
                C6758 c6758 = (C6758) this.f7293;
                String str = (String) this.f7294;
                C9636 c9636 = (C9636) this.f7292;
                try {
                    JSONObject jSONObjectM6934 = InterfaceC3749.m6934(str);
                    String string = jSONObjectM6934.getString("pre_grap_token");
                    c9636.f25136 = string;
                    if (string == null) {
                        return;
                    }
                    long j = Long.parseLong(String.valueOf(c6758.f16461.m12399(0, "expectAmount")));
                    if (j > 0) {
                        JSONObject jSONObject = jSONObjectM6934.getJSONObject("send_object");
                        if (Integer.parseInt(jSONObject.getString("total_amount")) / Integer.parseInt(jSONObject.getString("total_num")) < j) {
                            return;
                        }
                    }
                    TimeUnit.MILLISECONDS.sleep(Long.parseLong(String.valueOf(c6758.f16461.m12399(0, "delay"))));
                    c9636.m15035(new C6759(c6758, c9636, i));
                    return;
                } catch (Exception e) {
                    c6758.getExceptionCollectionToolInstance().m12391(e);
                    return;
                }
            case 5:
                ((PluginMenuGroupView) this.f7293).lambda$new$0((PluginLoader) this.f7294, (String) this.f7292);
                return;
            case 6:
                ((StringBuilder) this.f7293).append(C7182.m12501((String) this.f7294, (String) this.f7292));
                return;
            case 7:
                String str2 = (String) this.f7293;
                String str3 = (String) this.f7294;
                String str4 = (String) this.f7292;
                String strM12518 = C7204.m12518(str2);
                String strM125182 = C7204.m12518(str3);
                if (strM12518.isEmpty()) {
                    for (int i2 = 0; i2 < 10; i2++) {
                        strM12518 = C7204.m12518(str2);
                        if (strM12518.isEmpty()) {
                        }
                    }
                }
                PluginCallback.onJoinTroop(str4, strM12518, strM125182);
                return;
            case 8:
                C7254 c7254 = (C7254) this.f7293;
                LinearLayout linearLayout = (LinearLayout) this.f7294;
                linearLayout.addView(C7250.m12531(c7254.f17956, (Context) this.f7292), 1, linearLayout.getChildAt(0).getLayoutParams());
                return;
            case 9:
                C7223 c7223 = (C7223) this.f7293;
                Object obj = this.f7294;
                Method method = (Method) this.f7292;
                try {
                    AbstractC7165.m12422(obj, "I", Boolean.TYPE, Boolean.TRUE);
                    method.invoke(obj, null);
                    return;
                } catch (Exception e2) {
                    AbstractC7014.m12151("跳广告错误:" + e2);
                    c7223.getExceptionCollectionToolInstance().m12391(e2);
                    return;
                }
            case 10:
                C8541 c8541 = (C8541) this.f7293;
                AbstractC1298 abstractC1298 = (AbstractC1298) this.f7294;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f7292;
                try {
                    C8527 c8527M14948 = C9496.m14948(c8541.f21260);
                    if (c8527M14948 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    C8535 c8535 = (C8535) ((InterfaceC8538) c8527M14948.f7654);
                    synchronized (c8535.f21248) {
                        c8535.f21250 = threadPoolExecutor;
                        break;
                    }
                    ((InterfaceC8538) c8527M14948.f7654).mo13566(new C8540(abstractC1298, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    abstractC1298.mo1739(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 11:
                ((SharedPreferences.OnSharedPreferenceChangeListener) this.f7294).onSharedPreferenceChanged((SharedPreferencesC9005) this.f7293, (String) this.f7292);
                return;
            case 12:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f7293;
                C9719 c9719 = (C9719) this.f7294;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.f7292;
                C9027.m14269();
                if (((ArrayList) ref$ObjectRef.element).isEmpty()) {
                    AbstractC9040.m14294("好友列表为空", WaitDialog$TYPE.WARNING);
                    return;
                }
                ArrayList arrayList = (ArrayList) ref$ObjectRef.element;
                Map map = (Map) ref$ObjectRef2.element;
                C9037 c9037 = new C9037();
                c9037.f22959 = "批量管理好友 (" + arrayList.size() + ')';
                c9037.mo14280();
                c9037.f22971 = "勾选需要删除的好友";
                c9037.mo14280();
                c9037.mo14279(true);
                c9037.mo14282(new C9720(c9719, arrayList, map));
                c9037.f22970 = "关闭";
                c9037.mo14280();
                c9037.m14290();
                c9719.f25406 = c9037;
                return;
            default:
                ((DexFinder.Builder) this.f7293).lambda$initializeDexParserList$1((ZipEntry) this.f7294, (AtomicInteger) this.f7292);
                return;
        }
    }
}
