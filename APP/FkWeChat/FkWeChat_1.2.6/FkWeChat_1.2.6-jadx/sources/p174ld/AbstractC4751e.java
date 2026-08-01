package p174ld;

import android.app.Application;
import android.app.Instrumentation;
import java.lang.reflect.Method;
import md.InterfaceC5154i;
import md.InterfaceC5156k;
import me.yun.fkwechat.core.config.AppConfig;
import me.yun.fkwechat.loader.LoaderCore;
import me.yun.fkwechat.loader.api.HookEngine;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: ld.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4751e {
    /* JADX INFO: renamed from: a */
    public static void m19001a(InterfaceC5154i interfaceC5154i) {
        interfaceC5154i.getClass();
        Application application = (Application) interfaceC5154i.arg(0);
        if (AbstractC1061t.m3842c(application.getPackageName(), AppConfig.APP_PACKAGE)) {
            AppConfig.hostApplication = application;
            AppConfig.hostContext = application.getBaseContext();
            LoaderCore.bootstrap(application);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m19002b() throws NoSuchMethodException {
        Method declaredMethod = Instrumentation.class.getDeclaredMethod("callApplicationOnCreate", Application.class);
        declaredMethod.getClass();
        HookEngine.hookBefore(declaredMethod, new InterfaceC5156k() { // from class: ld.d
            @Override // md.InterfaceC5156k
            /* JADX INFO: renamed from: a */
            public final void mo8716a(InterfaceC5154i interfaceC5154i) {
                AbstractC4751e.m19001a(interfaceC5154i);
            }
        });
    }
}
