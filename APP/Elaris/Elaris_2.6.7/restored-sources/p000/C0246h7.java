package p000;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.p001mr.elaris.AbstractC0152f;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: h7 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0246h7 extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ClassLoader f351a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0548y7 f352b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f353c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0246h7(ClassLoader classLoader, C0548y7 c0548y7, String str) {
        super(100);
        this.f351a = classLoader;
        this.f352b = c0548y7;
        this.f353c = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object obj = methodHookParam.thisObject;
        Application application = obj instanceof Application ? (Application) obj : null;
        ClassLoader classLoaderPrepareHostApplication = HookEntry.prepareHostApplication(application, this.f351a, this.f352b, this.f353c, "Application.onCreate");
        if (AbstractC0009a8.f36c) {
            if (this.f352b.f1093b && application != null) {
                String str = this.f353c;
                if (AbstractC0309l3.f511a.compareAndSet(false, true)) {
                    Thread thread = new Thread(new RunnableC0258i3(application.getApplicationContext() == null ? application : application.getApplicationContext(), str, 0), "ElarisAnalytics");
                    thread.setDaemon(true);
                    try {
                        thread.setPriority(1);
                    } catch (Throwable unused) {
                    }
                    thread.start();
                }
                String packageName = this.f353c;
                String[] strArr = AbstractC0463t2.f879a;
                Context applicationContext = application.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = application;
                }
                if (packageName == null || packageName.length() == 0) {
                    packageName = applicationContext.getPackageName();
                }
                if (AbstractC0463t2.f888j.put(HookEntry.hostVersionSummary() + "@" + packageName, Boolean.TRUE) == null) {
                    SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("elaris_dexkit_locator", 0);
                    int iM1007h = AbstractC0463t2.m1007h(sharedPreferences, AbstractC0463t2.m1003d(applicationContext));
                    if (AbstractC0463t2.m1013n(applicationContext, sharedPreferences).length() == 0) {
                        HookEntry.log("dexkit locator ready schema=7 cacheHits=" + iM1007h + " qq=" + HookEntry.hostVersionSummary());
                        HookEntry.log("dexkit locator maintenance skipped reason=verified_cache");
                    } else {
                        AbstractC0361o7.m769a("Elaris-DexKitLocator", new RunnableC0239h0(1, applicationContext));
                    }
                }
            }
            if (this.f352b.f1093b) {
                if (application != null) {
                    AbstractC0008a7.f27b = application;
                }
                if (classLoaderPrepareHostApplication != null) {
                    AbstractC0008a7.f28c = classLoaderPrepareHostApplication;
                } else {
                    AtomicBoolean atomicBoolean = AbstractC0008a7.f26a;
                }
                if (application != null) {
                    AbstractC0152f.f121b = application;
                }
                if (classLoaderPrepareHostApplication != null) {
                    AbstractC0152f.f122c = classLoaderPrepareHostApplication;
                }
                AtomicBoolean atomicBoolean2 = AbstractC0152f.f120a;
                long jCurrentTimeMillis = System.currentTimeMillis() + 60000;
                if (jCurrentTimeMillis > AbstractC0152f.f127h) {
                    AbstractC0152f.f127h = jCurrentTimeMillis;
                }
            }
        }
    }
}
