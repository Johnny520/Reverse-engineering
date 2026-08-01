package androidx.fragment.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import com.alibaba.fastjson2.InterfaceC2916;
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
import kotlin.reflect.jvm.internal.impl.types.C4871;
import lin.xposed.hook.javaplugin.PluginCallback;
import lin.xposed.hook.javaplugin.controller.PluginLoader;
import lin.xposed.hook.javaplugin.controller.PluginManager;
import lin.xposed.hook.javaplugin.view.menu.PluginMenuGroupView;
import p010.AbstractC6185;
import p033.AbstractC6336;
import p035.C6353;
import p038.C6375;
import p039.C6394;
import p039.C6421;
import p039.C6425;
import p167.C7698;
import p167.C7706;
import p167.C7711;
import p167.C7712;
import p167.InterfaceC7709;
import p251.SharedPreferencesC8176;
import p257.AbstractC8211;
import p257.C8198;
import p257.C8208;
import p287.AbstractC8405;
import p316.C8667;
import p338.C8807;
import p355.C8890;
import p355.C8891;
import retrofit2.C5755;
import retrofit2.C5793;
import retrofit2.InterfaceC5795;
import top.linl.dexparser.DexFinder;
import top.suzhelan.qstory.hook.item.C5928;
import top.suzhelan.qstory.hook.item.C5929;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2346 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f6947;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f6948;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f6949;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f6950;

    public /* synthetic */ RunnableC2346(Object obj, Object obj2, Object obj3, int i) {
        this.f6950 = i;
        this.f6948 = obj;
        this.f6949 = obj2;
        this.f6947 = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 1;
        switch (this.f6950) {
            case 0:
                C2349 c2349 = (C2349) this.f6948;
                View view = (View) this.f6949;
                C2329 c2329 = (C2329) this.f6947;
                c2349.f6957.endViewTransition(view);
                c2329.m306();
                return;
            case 1:
                PluginManager.lambda$invokeToPluginMethod$0((PluginLoader) this.f6948, (String) this.f6949, (Object[]) this.f6947);
                return;
            case 2:
                C4871 c4871 = (C4871) this.f6948;
                InterfaceC5795 interfaceC5795 = (InterfaceC5795) this.f6949;
                C5755 c5755 = (C5755) this.f6947;
                C5793 c5793 = (C5793) c4871.f14165;
                if (c5793.f15890.mo11162()) {
                    interfaceC5795.onFailure(c5793, new IOException("Canceled"));
                    return;
                } else {
                    interfaceC5795.onResponse(c5793, c5755);
                    return;
                }
            case 3:
                ((InterfaceC5795) this.f6949).onFailure((C5793) ((C4871) this.f6948).f14165, (Throwable) this.f6947);
                return;
            case 4:
                C5928 c5928 = (C5928) this.f6948;
                String str = (String) this.f6949;
                C8807 c8807 = (C8807) this.f6947;
                try {
                    JSONObject jSONObjectM6374 = InterfaceC2916.m6374(str);
                    String string = jSONObjectM6374.getString(AbstractC8405.m13972(477));
                    c8807.f24791 = string;
                    if (string == null) {
                        return;
                    }
                    long j = Long.parseLong(String.valueOf(c5928.f16116.m11840(0, AbstractC8405.m13972(1060))));
                    if (j > 0) {
                        JSONObject jSONObject = jSONObjectM6374.getJSONObject(AbstractC8405.m13972(478));
                        if (Integer.parseInt(jSONObject.getString(AbstractC8405.m13972(1079))) / Integer.parseInt(jSONObject.getString(AbstractC8405.m13972(1078))) < j) {
                            return;
                        }
                    }
                    TimeUnit.MILLISECONDS.sleep(Long.parseLong(String.valueOf(c5928.f16116.m11840(0, AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵")))));
                    c8807.m14476(new C5929(c5928, c8807, i));
                    return;
                } catch (Exception e) {
                    c5928.getExceptionCollectionToolInstance().m11832(e);
                    return;
                }
            case 5:
                ((PluginMenuGroupView) this.f6948).lambda$new$0((PluginLoader) this.f6949, (String) this.f6947);
                return;
            case 6:
                ((StringBuilder) this.f6948).append(C6353.m11942((String) this.f6949, (String) this.f6947));
                return;
            case 7:
                String str2 = (String) this.f6948;
                String str3 = (String) this.f6949;
                String str4 = (String) this.f6947;
                String strM11959 = C6375.m11959(str2);
                String strM119592 = C6375.m11959(str3);
                if (strM11959.isEmpty()) {
                    for (int i2 = 0; i2 < 10; i2++) {
                        strM11959 = C6375.m11959(str2);
                        if (strM11959.isEmpty()) {
                        }
                    }
                }
                PluginCallback.onJoinTroop(str4, strM11959, strM119592);
                return;
            case 8:
                C6425 c6425 = (C6425) this.f6948;
                LinearLayout linearLayout = (LinearLayout) this.f6949;
                linearLayout.addView(C6421.m11972(c6425.f17611, (Context) this.f6947), 1, linearLayout.getChildAt(0).getLayoutParams());
                return;
            case 9:
                C6394 c6394 = (C6394) this.f6948;
                Object obj = this.f6949;
                Method method = (Method) this.f6947;
                try {
                    AbstractC6336.m11863(obj, AbstractC8405.m13973("喵喵呜呜呜喵呜喵"), Boolean.TYPE, Boolean.TRUE);
                    method.invoke(obj, null);
                    return;
                } catch (Exception e2) {
                    AbstractC6185.m11592(AbstractC8405.m13972(260) + e2);
                    c6394.getExceptionCollectionToolInstance().m11832(e2);
                    return;
                }
            case 10:
                C7712 c7712 = (C7712) this.f6948;
                AbstractC0455 abstractC0455 = (AbstractC0455) this.f6949;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f6947;
                try {
                    C7698 c7698M14389 = C8667.m14389(c7712.f20915);
                    if (c7698M14389 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    C7706 c7706 = (C7706) ((InterfaceC7709) c7698M14389.f7309);
                    synchronized (c7706.f20903) {
                        c7706.f20905 = threadPoolExecutor;
                        break;
                    }
                    ((InterfaceC7709) c7698M14389.f7309).mo13007(new C7711(abstractC0455, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    abstractC0455.mo1179(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 11:
                ((SharedPreferences.OnSharedPreferenceChangeListener) this.f6949).onSharedPreferenceChanged((SharedPreferencesC8176) this.f6948, (String) this.f6947);
                return;
            case 12:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f6948;
                C8890 c8890 = (C8890) this.f6949;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.f6947;
                C8198.m13710();
                if (((ArrayList) ref$ObjectRef.element).isEmpty()) {
                    AbstractC8211.m13735(AbstractC8405.m13972(3110), WaitDialog$TYPE.WARNING);
                    return;
                }
                ArrayList arrayList = (ArrayList) ref$ObjectRef.element;
                Map map = (Map) ref$ObjectRef2.element;
                C8208 c8208 = new C8208();
                c8208.f22614 = AbstractC8405.m13972(3102) + arrayList.size() + ')';
                c8208.mo13721();
                c8208.f22626 = AbstractC8405.m13972(3103);
                c8208.mo13721();
                c8208.mo13720(true);
                c8208.mo13723(new C8891(c8890, arrayList, map));
                c8208.f22625 = AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜呜呜喵喵喵喵~呜呜喵喵呜喵喵呜~呜喵喵喵喵喵喵呜~呜呜呜呜喵喵呜喵~呜呜喵喵喵喵喵呜");
                c8208.mo13721();
                c8208.m13731();
                c8890.f25061 = c8208;
                return;
            default:
                ((DexFinder.Builder) this.f6948).lambda$initializeDexParserList$1((ZipEntry) this.f6949, (AtomicInteger) this.f6947);
                return;
        }
    }
}
