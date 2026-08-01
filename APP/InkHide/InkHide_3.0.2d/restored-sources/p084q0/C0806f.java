package p084q0;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.RunnableC0040m;
import p054c0.AbstractC0514f;
import p062e0.InterfaceC0551a;
import p069i.C0709q1;
import p070i0.AbstractC0731a;
import p090t0.C1010e;
import p102z0.AbstractC1135r;

/* JADX INFO: renamed from: q0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0806f implements InterfaceC0551a {

    /* JADX INFO: renamed from: a */
    public boolean f2678a;

    /* JADX INFO: renamed from: b */
    public boolean f2679b;

    /* JADX INFO: renamed from: c */
    public int f2680c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m1470a(C0806f c0806f, Activity activity, Intent intent) {
        boolean zM2498t;
        c0806f.getClass();
        boolean booleanExtra = intent.getBooleanExtra("KEY_INTENT_FROM_MASK", false);
        c0806f.f2680c = intent.getIntExtra("KEY_INTENT_PLUGIN_MODE", -1);
        if (!booleanExtra) {
            AbstractC0731a.m1384a("ignore not from mask");
            return;
        }
        switch (AbstractC1135r.m2494p()) {
            case 2140:
            case 2300:
            case 2320:
            case 2340:
            case 2360:
            case 2380:
            case 2400:
            case 2420:
            case 2429:
            case 2441:
            case 2460:
            case 2480:
            case 2502:
            case 2521:
            case 2540:
            case 2560:
            case 2589:
            case 2600:
            case 2701:
            case 2720:
            case 2740:
            case 2800:
            case 2841:
            case 2860:
            case 3060:
            case 3080:
            case 3100:
            case 3120:
            case 3141:
                zM2498t = true;
                break;
            default:
                zM2498t = AbstractC1135r.m2498t();
                break;
        }
        if (zM2498t) {
            c0806f.m1471b(activity);
            return;
        }
        new AlertDialog.Builder(activity).setIcon(activity.getApplicationInfo().icon).setTitle("提示").setMessage("Current WeiXin version " + AbstractC1135r.m2493o() + " is not supported. Please check supported versions on MaskWechat home page.").setNegativeButton("继续使用", new DialogInterfaceOnClickListenerC0802b(c0806f, activity, intent)).setPositiveButton("糊脸主页", new DialogInterfaceOnClickListenerC0802b(intent, activity, 1)).show();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m1471b(Activity activity) {
        int i2 = this.f2680c;
        if (i2 == 2 && !this.f2679b) {
            activity.runOnUiThread(new RunnableC0040m((InterfaceC0551a) this, activity, 5));
            return;
        }
        if (i2 != 1) {
            AbstractC0731a.m1386c("entry wechat ui, but support plugin mode", Integer.valueOf(i2));
            return;
        }
        C0709q1 c0709q1 = new C0709q1(activity);
        if (((AtomicBoolean) c0709q1.f2401g).get()) {
            return;
        }
        ((C1010e) c0709q1.f2395a).m2209g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p062e0.InterfaceC0551a
    public final void handleHook(Context context, XC_LoadPackage.LoadPackageParam loadPackageParam) {
        if (loadPackageParam.packageName.equals(loadPackageParam.processName)) {
            AbstractC0514f.m1026c("com.tencent.mm.ui.LauncherUI", context.getClassLoader(), "onCreate", Bundle.class.getName(), new C0805e(this, 0));
            AbstractC0514f.m1026c("com.tencent.mm.ui.LauncherUI", context.getClassLoader(), "onNewIntent", Intent.class.getName(), new C0805e(this, 1));
        }
    }
}
