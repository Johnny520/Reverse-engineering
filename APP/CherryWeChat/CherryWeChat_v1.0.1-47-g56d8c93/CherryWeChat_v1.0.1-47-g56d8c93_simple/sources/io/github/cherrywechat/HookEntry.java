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
    public final String f5515a;

    /* JADX INFO: renamed from: b */
    public final String f5516b;

    public HookEntry() {
        this.f5515a = AbstractC0295Gu.m625r(-508412458694709L);
        this.f5516b = AbstractC0295Gu.m625r(-508476883204149L);
        System.loadLibrary(AbstractC0295Gu.m625r(-507991551899701L));
        System.loadLibrary(AbstractC0295Gu.m625r(-508021616670773L));
    }

    public final void handleLoadPackage(XC_LoadPackage.LoadPackageParam r5) {
        AbstractC0295Gu.m625r(-508051681441845L);
        AbstractC1450gG.f5074h = true;
        if (r5.packageName.equals(AbstractC0295Gu.m625r(-508086041180213L)) == false) goto L6;
        ClassLoader r0 = r5.classLoader;
        AbstractC0295Gu.m625r(-508184825428021L);
        AbstractC0295Gu.m625r(-578454785357877L);
        AbstractC1450gG.f5069c = r0;
        String r02 = MainActivity.class.getName();
        AbstractC0295Gu.m625r(-508236365035573L);
        AbstractC0295Gu.m625r(-578300166535221L);
        C1538iG r1 = new C1538iG(AbstractC1406fG.m2718r0(r02));
        r1.m2924i(Long.TYPE);
        r1.m2923h(0L);
    L6:
        if (r5.packageName.equals(this.f5515a) == false) goto L8;
    L11:
        XposedHelpers.findAndHookMethod(Application.class, AbstractC0295Gu.m625r(-508841955424309L), new Object[]{Context.class, new C0715Qk(this, r5)});
        return;
    L8:
        if (r5.packageName.equals(this.f5516b) == true) goto L11;
    }

    public final void initZygote(IXposedHookZygoteInit.StartupParam r3) {
        AbstractC0295Gu.m625r(-508872020195381L);
        int r0 = AbstractC1450gG.f5067a;
        String r32 = r3.modulePath;
        AbstractC0295Gu.m625r(-508927854770229L);
        AbstractC0295Gu.m625r(-578536389736501L);
        AbstractC1450gG.f5070d = r32;
    }
}
