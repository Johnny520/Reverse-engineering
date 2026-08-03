package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Process;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: k3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2126k3 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7458a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f7459b;

    public /* synthetic */ RunnableC2126k3(Context context, int i) {
        this.f7458a = i;
        this.f7459b = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        C1105Zo c1105Zo;
        Object systemService;
        Context context;
        switch (this.f7458a) {
            case 0:
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    Context context2 = this.f7459b;
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i >= 33) {
                            C0607O4 c0607o4 = AbstractC2397q3.f8404g;
                            c0607o4.getClass();
                            C0349I4 c0349i4 = new C0349I4(c0607o4);
                            while (true) {
                                if (c0349i4.hasNext()) {
                                    AbstractC2397q3 abstractC2397q3 = (AbstractC2397q3) ((WeakReference) c0349i4.next()).get();
                                    if (abstractC2397q3 != null && (context = ((LayoutInflaterFactory2C0176E3) abstractC2397q3).f494k) != null) {
                                        systemService = context.getSystemService("locale");
                                    }
                                } else {
                                    systemService = null;
                                }
                            }
                            c1105Zo = systemService != null ? new C1105Zo(new C1186ap(AbstractC2217m3.m4461a(systemService))) : C1105Zo.f3498b;
                            if (c1105Zo.f3499a.f4071a.isEmpty()) {
                                String strM1131L = AbstractC0585Nj.m1131L(context2);
                                Object systemService2 = context2.getSystemService("locale");
                                if (systemService2 != null) {
                                    AbstractC2217m3.m4462b(systemService2, AbstractC2174l3.m4371a(strM1131L));
                                }
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        } else {
                            c1105Zo = AbstractC2397q3.f8400c;
                            if (c1105Zo == null) {
                            }
                            if (c1105Zo.f3499a.f4071a.isEmpty()) {
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        }
                    }
                }
                AbstractC2397q3.f8403f = true;
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC2126k3(this.f7459b, 2));
                break;
            case 2:
                AbstractC0828TB.m1634M(this.f7459b, new ExecutorC0037Au(), AbstractC0828TB.f2611c, false);
                break;
            default:
                Context context3 = this.f7459b;
                Intent launchIntentForPackage = context3.getPackageManager().getLaunchIntentForPackage(context3.getPackageName());
                if (launchIntentForPackage != null) {
                    launchIntentForPackage.addFlags(335544320);
                }
                context3.startActivity(launchIntentForPackage);
                Process.killProcess(Process.myPid());
                break;
        }
    }
}
