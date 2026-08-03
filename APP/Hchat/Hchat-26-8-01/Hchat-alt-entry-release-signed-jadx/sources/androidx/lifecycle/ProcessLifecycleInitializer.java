package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import p136j8.C2104o;
import p341x3.C5688a;
import p341x3.InterfaceC5689b;
import tf.C4173t;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC5689b {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p341x3.InterfaceC5689b
    /* JADX INFO: renamed from: a */
    public final List mo506a() {
        return C4173t.f13710g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p341x3.InterfaceC5689b
    /* JADX INFO: renamed from: b */
    public final Object mo507b(Context context) {
        context.getClass();
        C5688a c5688aM10241c = C5688a.m10241c(context);
        c5688aM10241c.getClass();
        if (!c5688aM10241c.f23147b.contains(ProcessLifecycleInitializer.class)) {
            C2104o.m5276A("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!AbstractC0109n.f295a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0108m());
        }
        C0120y c0120y = C0120y.f311o;
        c0120y.getClass();
        c0120y.f316k = new Handler();
        c0120y.f317l.m555d(EnumC0106k.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new C0118w(c0120y));
        return c0120y;
    }
}
