package p000a;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import androidx.profileinstaller.C1150c;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000a.AbstractC0255O0;
import p000a.AbstractC0461Z9;

/* JADX INFO: renamed from: a.N0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0237N0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f780a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f781b;

    public /* synthetic */ RunnableC0237N0(Context context, int i) {
        this.f780a = i;
        this.f781b = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        C0174J9 c0174j9;
        Object systemService;
        Context contextMo701f;
        switch (this.f780a) {
            case 0:
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    Context context = this.f781b;
                    ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i >= 33) {
                            Iterator<WeakReference<AbstractC0255O0>> it = AbstractC0255O0.f892g.iterator();
                            while (true) {
                                AbstractC0461Z9.a aVar = (AbstractC0461Z9.a) it;
                                if (aVar.hasNext()) {
                                    AbstractC0255O0 abstractC0255O0 = (AbstractC0255O0) ((WeakReference) aVar.next()).get();
                                    if (abstractC0255O0 != null && (contextMo701f = abstractC0255O0.mo701f()) != null) {
                                        systemService = contextMo701f.getSystemService("locale");
                                    }
                                } else {
                                    systemService = null;
                                }
                            }
                            c0174j9 = systemService != null ? new C0174J9(new C0210L9(AbstractC0255O0.b.m721a(systemService))) : C0174J9.f611b;
                            if (c0174j9.f612a.f697a.isEmpty()) {
                                String strM2132S = C0889w1.m2132S(context);
                                Object systemService2 = context.getSystemService("locale");
                                if (systemService2 != null) {
                                    AbstractC0255O0.b.m722b(systemService2, AbstractC0255O0.a.m720a(strM2132S));
                                }
                            }
                            context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        } else {
                            c0174j9 = AbstractC0255O0.f888c;
                            if (c0174j9 == null) {
                            }
                            if (c0174j9.f612a.f697a.isEmpty()) {
                            }
                            context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        }
                    }
                }
                AbstractC0255O0.f891f = true;
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC0237N0(this.f781b, 2));
                break;
            default:
                C1150c.m2625b(this.f781b, new ExecutorC0159Ic(), C1150c.f4732a, false);
                break;
        }
    }
}
