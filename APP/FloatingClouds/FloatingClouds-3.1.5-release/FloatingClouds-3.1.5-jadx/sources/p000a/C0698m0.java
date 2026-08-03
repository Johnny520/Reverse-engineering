package p000a;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: a.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0698m0 {

    /* JADX INFO: renamed from: a */
    public static final C0698m0 f2635a = new C0698m0();

    /* JADX INFO: renamed from: b */
    public static final Handler f2636b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c */
    public static volatile boolean f2637c;

    /* JADX INFO: renamed from: d */
    public static volatile WeakReference<Activity> f2638d;

    /* JADX INFO: renamed from: a */
    public static void m1588a(AlertDialog alertDialog, Activity activity) {
        try {
            boolean z = (activity.getResources().getConfiguration().uiMode & 48) == 32;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(z ? -13816531 : -1);
            gradientDrawable.setCornerRadius(16.0f * activity.getResources().getDisplayMetrics().density);
            Window window = alertDialog.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(gradientDrawable);
            }
            int i = z ? -7288071 : -15108398;
            Button button = alertDialog.getButton(-1);
            if (button != null) {
                button.setTextColor(i);
            }
            Button button2 = alertDialog.getButton(-2);
            if (button2 != null) {
                button2.setTextColor(i);
            }
            Button button3 = alertDialog.getButton(-3);
            if (button3 != null) {
                button3.setTextColor(i);
            }
            int i2 = z ? -2039584 : -14606047;
            TextView textView = (TextView) alertDialog.findViewById(R.id.title);
            if (textView != null) {
                textView.setTextColor(i2);
            }
            TextView textView2 = (TextView) alertDialog.findViewById(R.id.message);
            if (textView2 != null) {
                textView2.setTextColor(i2);
                C0413Wf c0413Wf = C0413Wf.f1577a;
            }
        } catch (Throwable th) {
            C0920xd.m2206a(th);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m1589b(Activity activity) {
        if (f2637c) {
            C0908x1.m2194b("AdaptationManager", "checkAndStartAdaptation: already adapting, skip");
            return;
        }
        WeakReference<Activity> weakReference = f2638d;
        Activity activity2 = weakReference != null ? weakReference.get() : null;
        if (activity2 != null && activity2 == activity) {
            C0908x1.m2194b("AdaptationManager", "checkAndStartAdaptation: same activity already shown, skip");
            return;
        }
        SharedPreferences sharedPreferences = activity.getSharedPreferences("adaptation_state_v2", 0);
        C0631i9.m1481d(sharedPreferences, "getSharedPreferences(...)");
        boolean z = true;
        boolean z2 = sharedPreferences.getInt("last_plugin_version_code", 0) != 316;
        boolean z3 = sharedPreferences.getLong("last_plugin_update_time", 0L) != 1785635034120L;
        boolean z4 = sharedPreferences.getInt("last_wechat_version_code", 0) != m1591d(activity);
        if (!z2 && !z3 && !z4) {
            z = false;
        }
        C0908x1.m2194b("AdaptationManager", "shouldAdapt plugin=316 lastPlugin=" + sharedPreferences.getInt("last_plugin_version_code", 0) + " pluginUpdate=1785635034120 lastPluginUpdate=" + sharedPreferences.getLong("last_plugin_update_time", 0L) + " wechat=" + m1591d(activity) + " lastWechat=" + sharedPreferences.getInt("last_wechat_version_code", 0) + " should=" + z);
        if (z) {
            f2638d = new WeakReference<>(activity);
            C0908x1.m2194b("AdaptationManager", "showConfirmDialog on ".concat(activity.getClass().getSimpleName()));
            AlertDialog alertDialogShow = m1592e(activity).setTitle("需要重新扫描适配").setMessage("检测到插件版本或微信版本发生变化，需要重新扫描适配。\n\n适配过程需要一些时间，请保持在前台。完成后将自动重启微信。").setCancelable(false).setPositiveButton("开始扫描适配", new DialogInterfaceOnClickListenerC0565f0(activity, 0)).setNegativeButton("稍后手动处理", new DialogInterfaceOnClickListenerC0584g0(0)).show();
            C0631i9.m1479b(alertDialogShow);
            m1588a(alertDialogShow, activity);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m1590c(Activity activity) {
        String str;
        if (f2637c) {
            return;
        }
        f2637c = true;
        C0908x1.m2194b("AdaptationManager", "doAdaptation start");
        try {
            str = activity.getPackageManager().getApplicationInfo("com.tencent.mm", 0).sourceDir;
        } catch (Exception e) {
            C0908x1.m2193a("AdaptationManager", "getWechatApkPath failed", e);
            str = null;
        }
        if (str == null || C0034Be.m101P(str)) {
            f2637c = false;
            AlertDialog alertDialogShow = m1592e(activity).setTitle("适配失败").setMessage("无法获取微信 APK 路径，请确认微信已安装。").setPositiveButton("确定", (DialogInterface.OnClickListener) null).show();
            C0631i9.m1479b(alertDialogShow);
            m1588a(alertDialogShow, activity);
            return;
        }
        C0513c5 c0513c5 = new C0513c5(activity, str);
        ProgressDialog progressDialog = new ProgressDialog(activity);
        progressDialog.setTitle("正在扫描适配");
        progressDialog.setMessage("初始化 DexKit...");
        progressDialog.setProgressStyle(1);
        progressDialog.setIndeterminate(false);
        progressDialog.setMax(100);
        progressDialog.setCancelable(false);
        progressDialog.show();
        Thread thread = new Thread(new RunnableC0603h0(c0513c5, progressDialog, activity, 0));
        thread.setDaemon(true);
        thread.setName("AdaptationScan");
        thread.start();
    }

    /* JADX INFO: renamed from: d */
    public static int m1591d(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.tencent.mm", 0).versionCode;
        } catch (Exception e) {
            C0908x1.m2193a("AdaptationManager", "getWechatVersionCode failed", e);
            return -1;
        }
    }

    /* JADX INFO: renamed from: e */
    public static AlertDialog.Builder m1592e(Activity activity) {
        return new AlertDialog.Builder(activity, (activity.getResources().getConfiguration().uiMode & 48) == 32 ? R.style.Theme.Material.Dialog.Alert : R.style.Theme.Material.Light.Dialog.Alert);
    }
}
