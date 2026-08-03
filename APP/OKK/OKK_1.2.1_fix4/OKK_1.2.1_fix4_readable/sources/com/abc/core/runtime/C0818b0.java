package com.abc.core.runtime;

import android.app.Application;
import android.content.Context;
import com.abc.loader.ModernHookEntry;
import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import java.util.concurrent.atomic.AtomicBoolean;
import p009E0.AbstractC0179j;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: f0.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0818b0 extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2969b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ClassLoader f2970c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f2971d;

    public /* synthetic */ C0818b0(ClassLoader classLoader, String str, int i2) {
        this.f2969b = i2;
        this.f2970c = classLoader;
        this.f2971d = str;
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: a */
    public final void mo1385a(C0760b c0760b) {
        Context context;
        ClassLoader classLoader = this.f2970c;
        String str = this.f2971d;
        switch (this.f2969b) {
            case 0:
                Object obj = c0760b.f2669b;
                context = obj instanceof Application ? (Application) obj : null;
                if (context != null && AbstractC0307g.m699a(context.getPackageName(), ModernHookEntry.WECHAT_PACKAGE)) {
                    AtomicBoolean atomicBoolean = ModuleBootstrap.f2976a;
                    ClassLoader classLoader2 = context.getClassLoader();
                    if (classLoader2 != null) {
                        classLoader = classLoader2;
                    }
                    ModuleBootstrap.m2127a(context, classLoader, str + ".onCreate");
                }
                break;
            default:
                Object[] objArr = c0760b.f2670c;
                AbstractC0307g.m702d(objArr, "args");
                Object objM536m0 = AbstractC0179j.m536m0(objArr);
                context = objM536m0 instanceof Context ? (Context) objM536m0 : null;
                if (context != null) {
                    AtomicBoolean atomicBoolean2 = ModuleBootstrap.f2976a;
                    ModuleBootstrap.m2127a(context, classLoader, "Tinker.onBaseContextAttached(" + str + ")");
                    break;
                }
                break;
        }
    }
}
