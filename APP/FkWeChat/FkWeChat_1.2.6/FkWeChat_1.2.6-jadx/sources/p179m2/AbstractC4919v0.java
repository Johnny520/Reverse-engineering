package p179m2;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.inputmethodservice.InputMethodService;
import android.view.View;
import p121i3.AbstractC3170a;
import p121i3.AbstractC3180j;
import p121i3.C3179i;
import p121i3.C3189s;
import p279t4.C8106a;
import p279t4.InterfaceC8108c;

/* JADX INFO: renamed from: m2.v0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4919v0 {
    /* JADX INFO: renamed from: a */
    public static final C4885o1 m19881a(View view) {
        Context context = view.getContext();
        Context contextM19882b = m19882b(context);
        if (contextM19882b == null) {
            Configuration configuration = context.getResources().getConfiguration();
            return C4885o1.f14591c.m19532a(AbstractC3180j.m12013a(C3179i.m12003k(configuration.screenWidthDp), C3179i.m12003k(configuration.screenHeightDp)), AbstractC3170a.m11960a(context));
        }
        C8106a c8106aMo31327a = InterfaceC8108c.f27055a.m31329b().mo31327a(contextM19882b);
        return C4885o1.f14591c.m19533b(C3189s.m12082c((((long) c8106aMo31327a.m31326a().width()) << 32) | (((long) c8106aMo31327a.m31326a().height()) & 4294967295L)), AbstractC3170a.m11960a(contextM19882b));
    }

    /* JADX INFO: renamed from: b */
    public static final Context m19882b(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return context;
            }
            if (context instanceof InputMethodService) {
                return context;
            }
            if (context instanceof Application) {
                return context;
            }
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext() == null) {
                return null;
            }
            context = contextWrapper.getBaseContext();
        }
        return null;
    }
}
