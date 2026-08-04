package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.HashSet;
import java.util.List;
import yyds.AbstractC2804;
import yyds.C0188;
import yyds.C0644;
import yyds.C0910;
import yyds.C1293;
import yyds.C1860;
import yyds.C2402;
import yyds.EnumC0637;
import yyds.InterfaceC1283;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC1283 {
    @Override // yyds.InterfaceC1283
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final List mo116() {
        return C1860.f9345;
    }

    @Override // yyds.InterfaceC1283
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final Object mo117(Context context) {
        if (!((HashSet) C0644.m1547(context).f3102).contains(ProcessLifecycleInitializer.class)) {
            C0188.m800("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!AbstractC2804.f13681.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C1293());
        }
        C0910 c0910 = C0910.f4138;
        c0910.getClass();
        c0910.f4142 = new Handler();
        c0910.f4139.m127(EnumC0637.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C2402(c0910));
        return c0910;
    }
}
