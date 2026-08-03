package p000a;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p000a.C0186K3;
import p000a.C0816s4;
import top.mmjz.floatingclouds.bean.MaskItemBean;

/* JADX INFO: renamed from: a.j0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0641j0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2355a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f2356b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2357c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f2358d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f2359e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0641j0(C0816s4.a.C1338a.EnumC1339a enumC1339a, boolean z, C0816s4 c0816s4, InterfaceC0819s7 interfaceC0819s7) {
        this.f2357c = enumC1339a;
        this.f2356b = z;
        this.f2358d = c0816s4;
        this.f2359e = interfaceC0819s7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2355a) {
            case 0:
                boolean z = this.f2356b;
                Activity activity = (Activity) this.f2357c;
                String str = (String) this.f2358d;
                try {
                    ((ProgressDialog) this.f2359e).dismiss();
                    C0413Wf c0413Wf = C0413Wf.f1577a;
                    break;
                } catch (Throwable th) {
                    C0920xd.m2206a(th);
                }
                if (!z) {
                    C0698m0.f2637c = false;
                    C0698m0 c0698m0 = C0698m0.f2635a;
                    if (str == null) {
                        str = "扫描失败，请查看日志确认详情。";
                    }
                    c0698m0.getClass();
                    AlertDialog alertDialogShow = C0698m0.m1592e(activity).setTitle("适配异常").setMessage(str.concat("\n\n可稍后从设置页手动重新扫描适配。")).setPositiveButton("确定", (DialogInterface.OnClickListener) null).show();
                    C0631i9.m1479b(alertDialogShow);
                    C0698m0.m1588a(alertDialogShow, activity);
                    return;
                }
                C0698m0.f2635a.getClass();
                try {
                    SharedPreferences sharedPreferences = activity.getSharedPreferences("adaptation_state_v2", 0);
                    C0631i9.m1481d(sharedPreferences, "getSharedPreferences(...)");
                    sharedPreferences.edit().putInt("last_plugin_version_code", 316).putInt("last_wechat_version_code", C0698m0.m1591d(activity)).putLong("last_plugin_update_time", 1785635034120L).putLong("last_adaptation_time", System.currentTimeMillis()).apply();
                    C0908x1.m2194b("AdaptationManager", "saveVersionInfo plugin=316 wechat=" + C0698m0.m1591d(activity) + " pluginUpdate=1785635034120");
                    break;
                } catch (Exception e) {
                    C0908x1.m2193a("AdaptationManager", "saveVersionInfo failed", e);
                }
                C0698m0.f2635a.getClass();
                AlertDialog alertDialogShow2 = C0698m0.m1592e(activity).setTitle("适配完成").setMessage("扫描适配已完成，即将自动重启微信以生效。").setCancelable(false).setPositiveButton("立即重启", new DialogInterfaceOnClickListenerC0565f0(activity, 1)).show();
                C0631i9.m1479b(alertDialogShow2);
                C0698m0.m1588a(alertDialogShow2, activity);
                return;
            default:
                C0816s4.a.C1338a.EnumC1339a enumC1339a = (C0816s4.a.C1338a.EnumC1339a) this.f2357c;
                boolean z2 = this.f2356b;
                C0816s4 c0816s4 = (C0816s4) this.f2358d;
                InterfaceC0819s7 interfaceC0819s7 = (InterfaceC0819s7) this.f2359e;
                C0816s4.a.C1338a c1338a = C0816s4.a.C1338a.f3260a;
                if (!C0816s4.a.C1338a.m1918a(enumC1339a)) {
                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"[HideMainUI] toggleHide(" + z2 + ") STALE: expected=" + enumC1339a + " actual=" + c1338a}, 1));
                    return;
                }
                if (z2) {
                    C0186K3.f638a.getClass();
                    if (!C0186K3.a.m508i().f2447q) {
                        return;
                    }
                }
                C0816s4.f3221J = true;
                try {
                    C0186K3.f638a.getClass();
                    ArrayList arrayListM505f = C0186K3.a.m505f();
                    ArrayList arrayList = new ArrayList(C0758p3.m1800g0(arrayListM505f, 10));
                    Iterator it = arrayListM505f.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((MaskItemBean) it.next()).getMaskId());
                    }
                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"[HideMainUI] toggleHide: " + C0569f4.m1412a(arrayList, z2, new C0004A3(1, enumC1339a)) + "/" + arrayList.size() + " hide=" + z2}, 1));
                    C0816s4.f3221J = false;
                    if (z2) {
                        c0816s4.m1899f();
                    }
                    if (interfaceC0819s7 != null) {
                        new Handler(Looper.getMainLooper()).post(new RunnableC0221M2(6, interfaceC0819s7));
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    C0816s4.f3221J = false;
                    if (z2) {
                        c0816s4.m1899f();
                    }
                    throw th2;
                }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ RunnableC0641j0(boolean z, Activity activity, String str, ProgressDialog progressDialog) {
        this.f2356b = z;
        this.f2357c = activity;
        this.f2358d = str;
        this.f2359e = progressDialog;
    }
}
