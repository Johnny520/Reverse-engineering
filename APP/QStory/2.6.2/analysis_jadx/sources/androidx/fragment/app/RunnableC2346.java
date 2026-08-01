package androidx.fragment.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.LinearLayout;
import com.alibaba.fastjson2.InterfaceC2915;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.AbstractC3056;
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
import kotlin.reflect.jvm.internal.impl.types.C4870;
import lin.xposed.hook.javaplugin.PluginCallback;
import lin.xposed.hook.javaplugin.controller.PluginLoader;
import lin.xposed.hook.javaplugin.controller.PluginManager;
import lin.xposed.hook.javaplugin.view.menu.PluginMenuGroupView;
import p010.AbstractC6154;
import p032.AbstractC6317;
import p034.C6335;
import p037.C6358;
import p038.C6372;
import p038.C6384;
import p038.C6401;
import p167.C7697;
import p167.C7705;
import p167.C7710;
import p167.C7711;
import p167.InterfaceC7708;
import p175.AbstractC7738;
import p251.AbstractC8174;
import p251.SharedPreferencesC8175;
import p257.AbstractC8210;
import p257.C8197;
import p257.C8207;
import p337.C8809;
import p352.C8873;
import p352.C8874;
import retrofit2.C5754;
import retrofit2.C5792;
import retrofit2.InterfaceC5794;
import top.linl.dexparser.DexFinder;
import top.suzhelan.qstory.hook.item.C5922;
import top.suzhelan.qstory.hook.item.C5923;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2346 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f6946;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f6947;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f6948;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f6949;

    public /* synthetic */ RunnableC2346(Object obj, Object obj2, Object obj3, int i) {
        this.f6949 = i;
        this.f6947 = obj;
        this.f6948 = obj2;
        this.f6946 = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 1;
        switch (this.f6949) {
            case 0:
                C2349 c2349 = (C2349) this.f6947;
                View view = (View) this.f6948;
                C2329 c2329 = (C2329) this.f6946;
                c2349.f6956.endViewTransition(view);
                c2329.m305();
                return;
            case 1:
                PluginManager.lambda$invokeToPluginMethod$0((PluginLoader) this.f6947, (String) this.f6948, (Object[]) this.f6946);
                return;
            case 2:
                C4870 c4870 = (C4870) this.f6947;
                InterfaceC5794 interfaceC5794 = (InterfaceC5794) this.f6948;
                C5754 c5754 = (C5754) this.f6946;
                C5792 c5792 = (C5792) c4870.f14161;
                if (c5792.f15890.mo11105()) {
                    interfaceC5794.onFailure(c5792, new IOException("Canceled"));
                    return;
                } else {
                    interfaceC5794.onResponse(c5792, c5754);
                    return;
                }
            case 3:
                ((InterfaceC5794) this.f6948).onFailure((C5792) ((C4870) this.f6947).f14161, (Throwable) this.f6946);
                return;
            case 4:
                C5922 c5922 = (C5922) this.f6947;
                String str = (String) this.f6948;
                C8809 c8809 = (C8809) this.f6946;
                try {
                    JSONObject jSONObjectM6316 = InterfaceC2915.m6316(str);
                    String string = jSONObjectM6316.getString(AbstractC3056.m6668(-3937611800716248487L));
                    c8809.f24793 = string;
                    if (string == null) {
                        return;
                    }
                    long j = Long.parseLong(String.valueOf(c5922.f16107.m11812(0, AbstractC3056.m6668(-3937662300941714855L))));
                    if (j > 0) {
                        JSONObject jSONObject = jSONObjectM6316.getJSONObject(AbstractC3056.m6668(-3937611727701804455L));
                        if (Integer.parseInt(jSONObject.getString(AbstractC3056.m6668(-3937661098350871975L))) / Integer.parseInt(jSONObject.getString(AbstractC3056.m6668(-3937661089760937383L))) < j) {
                            return;
                        }
                    }
                    TimeUnit.MILLISECONDS.sleep(Long.parseLong(String.valueOf(c5922.f16107.m11812(0, AbstractC3056.m6668(-3937662610179360167L)))));
                    c8809.m14453(new C5923(c5922, c8809, i));
                    return;
                } catch (Exception e) {
                    c5922.getExceptionCollectionToolInstance().m11804(e);
                    return;
                }
            case 5:
                ((PluginMenuGroupView) this.f6947).lambda$new$0((PluginLoader) this.f6948, (String) this.f6946);
                return;
            case 6:
                ((StringBuilder) this.f6947).append(C6335.m11894((String) this.f6948, (String) this.f6946));
                return;
            case 7:
                String str2 = (String) this.f6947;
                String str3 = (String) this.f6948;
                String str4 = (String) this.f6946;
                String strM11911 = C6358.m11911(str2);
                String strM119112 = C6358.m11911(str3);
                if (strM11911.isEmpty()) {
                    for (int i2 = 0; i2 < 10; i2++) {
                        strM11911 = C6358.m11911(str2);
                        if (strM11911.isEmpty()) {
                        }
                    }
                }
                PluginCallback.onJoinTroop(str4, strM11911, strM119112);
                return;
            case 8:
                C6401 c6401 = (C6401) this.f6947;
                LinearLayout linearLayout = (LinearLayout) this.f6948;
                linearLayout.addView(C6384.m11918(c6401.f17558, (Context) this.f6946), 1, linearLayout.getChildAt(0).getLayoutParams());
                return;
            case 9:
                C6372 c6372 = (C6372) this.f6947;
                Object obj = this.f6948;
                Method method = (Method) this.f6946;
                try {
                    AbstractC6317.m11835(obj, AbstractC3056.m6668(-3937583441047192999L), Boolean.TYPE, Boolean.TRUE);
                    method.invoke(obj, null);
                    return;
                } catch (Exception e2) {
                    AbstractC6154.m11561(AbstractC3056.m6668(-3937583415277389223L) + e2);
                    c6372.getExceptionCollectionToolInstance().m11804(e2);
                    return;
                }
            case 10:
                C7711 c7711 = (C7711) this.f6947;
                AbstractC8174 abstractC8174 = (AbstractC8174) this.f6948;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f6946;
                try {
                    C7697 c7697M13055 = AbstractC7738.m13055(c7711.f20920);
                    if (c7697M13055 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    C7705 c7705 = (C7705) ((InterfaceC7708) c7697M13055.f7308);
                    synchronized (c7705.f20908) {
                        c7705.f20910 = threadPoolExecutor;
                        break;
                    }
                    ((InterfaceC7708) c7697M13055.f7308).mo12977(new C7710(abstractC8174, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    abstractC8174.mo12962(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 11:
                ((SharedPreferences.OnSharedPreferenceChangeListener) this.f6948).onSharedPreferenceChanged((SharedPreferencesC8175) this.f6947, (String) this.f6946);
                return;
            case 12:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f6947;
                C8873 c8873 = (C8873) this.f6948;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.f6946;
                C8197.m13693();
                if (((ArrayList) ref$ObjectRef.element).isEmpty()) {
                    AbstractC8210.m13718(AbstractC3056.m6668(-3937327873313211815L), WaitDialog$TYPE.WARNING);
                    return;
                }
                ArrayList arrayList = (ArrayList) ref$ObjectRef.element;
                Map map = (Map) ref$ObjectRef2.element;
                C8207 c8207 = new C8207();
                c8207.f22615 = AbstractC3056.m6668(-3937328195435759015L) + arrayList.size() + ')';
                c8207.mo13704();
                c8207.f22627 = AbstractC3056.m6668(-3937328234090464679L);
                c8207.mo13704();
                c8207.mo13703(true);
                c8207.mo13706(new C8874(c8873, arrayList, map));
                c8207.f22626 = AbstractC3056.m6668(-3937581662930732455L);
                c8207.mo13704();
                c8207.m13714();
                c8873.f25010 = c8207;
                return;
            default:
                ((DexFinder.Builder) this.f6947).lambda$initializeDexParserList$1((ZipEntry) this.f6948, (AtomicInteger) this.f6946);
                return;
        }
    }
}
