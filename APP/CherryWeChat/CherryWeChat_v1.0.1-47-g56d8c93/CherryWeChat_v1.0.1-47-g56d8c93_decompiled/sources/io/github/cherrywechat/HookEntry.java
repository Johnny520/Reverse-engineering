package io.github.cherrywechat;

import android.app.Application;
import android.content.Context;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.IXposedHookZygoteInit;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import io.github.cherrywechat.p002ui.activity.MainActivity;
import p000.AbstractC0295Gu;
import p000.AbstractC1406fG;
import p000.AbstractC1450gG;
import p000.C0715Qk;
import p000.C1538iG;

/* JADX INFO: loaded from: classes.dex */
public final class HookEntry implements IXposedHookLoadPackage, IXposedHookZygoteInit {

    /* JADX INFO: renamed from: a */
    public final String f5515a = AbstractC0295Gu.m625r(-508412458694709L);

    /* JADX INFO: renamed from: b */
    public final String f5516b = AbstractC0295Gu.m625r(-508476883204149L);

    public HookEntry() {
        System.loadLibrary(AbstractC0295Gu.m625r(-507991551899701L));
        System.loadLibrary(AbstractC0295Gu.m625r(-508021616670773L));
    }

    public final void handleLoadPackage(XC_LoadPackage.LoadPackageParam loadPackageParam) {
        AbstractC0295Gu.m625r(-508051681441845L);
        AbstractC1450gG.f5074h = true;
        if (loadPackageParam.packageName.equals(AbstractC0295Gu.m625r(-508086041180213L))) {
            ClassLoader classLoader = loadPackageParam.classLoader;
            AbstractC0295Gu.m625r(-508184825428021L);
            AbstractC0295Gu.m625r(-578454785357877L);
            AbstractC1450gG.f5069c = classLoader;
            String name = MainActivity.class.getName();
            AbstractC0295Gu.m625r(-508236365035573L);
            AbstractC0295Gu.m625r(-578300166535221L);
            C1538iG c1538iG = new C1538iG(AbstractC1406fG.m2718r0(name));
            c1538iG.m2924i(Long.TYPE);
            c1538iG.m2923h(0L);
        }
        if (loadPackageParam.packageName.equals(this.f5515a) || loadPackageParam.packageName.equals(this.f5516b)) {
            XposedHelpers.findAndHookMethod(Application.class, AbstractC0295Gu.m625r(-508841955424309L), new Object[]{Context.class, new C0715Qk(this, loadPackageParam)});
        }
    }

    public final void initZygote(IXposedHookZygoteInit.StartupParam startupParam) {
        AbstractC0295Gu.m625r(-508872020195381L);
        int i = AbstractC1450gG.f5067a;
        String str = startupParam.modulePath;
        AbstractC0295Gu.m625r(-508927854770229L);
        AbstractC0295Gu.m625r(-578536389736501L);
        AbstractC1450gG.f5070d = str;
    }
}
