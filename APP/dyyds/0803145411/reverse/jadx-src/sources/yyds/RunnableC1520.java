package yyds;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: yyds.ᛷᛳᲇᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1520 implements Runnable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f7337;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Context f7338;

    public /* synthetic */ RunnableC1520(Context context, int i) {
        this.f7337 = i;
        this.f7338 = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        C1773 c1773;
        Object systemService;
        Context context;
        int i = this.f7337;
        Context context2 = this.f7338;
        switch (i) {
            case 0:
                if (Build.VERSION.SDK_INT >= 33) {
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (AbstractC1827.m3586()) {
                            C1970 c1970 = AbstractC2423.f11960;
                            c1970.getClass();
                            C1070 c1070 = new C1070(c1970);
                            while (true) {
                                if (c1070.hasNext()) {
                                    AbstractC2423 abstractC2423 = (AbstractC2423) ((WeakReference) c1070.next()).get();
                                    if (abstractC2423 != null && (context = ((LayoutInflaterFactory2C2181) abstractC2423).f10680) != null) {
                                        systemService = context.getSystemService("locale");
                                    }
                                } else {
                                    systemService = null;
                                }
                            }
                            c1773 = systemService != null ? new C1773(new C1839(AbstractC2476.m4526(systemService))) : C1773.f8883;
                            if (c1773.f8884.f9217.isEmpty()) {
                                String strM4330 = AbstractC2328.m4330(context2);
                                Object systemService2 = context2.getSystemService("locale");
                                if (systemService2 != null) {
                                    AbstractC2476.m4527(systemService2, AbstractC2525.m4574(strM4330));
                                }
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        } else {
                            c1773 = AbstractC2423.f11961;
                            if (c1773 == null) {
                            }
                            if (c1773.f8884.f9217.isEmpty()) {
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        }
                    }
                }
                AbstractC2423.f11959 = true;
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC1520(context2, 2));
                break;
            default:
                AbstractC1544.m3190(context2, new ExecutorC0511(1), AbstractC1544.f7845, false);
                break;
        }
    }
}
