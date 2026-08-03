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

    public /* synthetic */ C0818b0(ClassLoader r1, String r2, int r3) {
        this.f2969b = r3;
        this.f2970c = r1;
        this.f2971d = r2;
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: a */
    public final void mo1385a(C0760b r5) {
        ClassLoader r02 = this.f2970c;
        String r1 = this.f2971d;
        Context r2 = null;
        switch(this.f2969b) {
            case 0: goto L11;
            default: goto L4;
        };
    L4:
        Object[] r52 = r5.f2670c;
        AbstractC0307g.m702d(r52, "args");
        Object r53 = AbstractC0179j.m536m0(r52);
        if ((r53 instanceof Context) == false) goto L7;
        r2 = (Context) r53;
    L7:
        if (r2 == null) goto L25;
        AtomicBoolean r54 = ModuleBootstrap.f2976a;
        ModuleBootstrap.m2127a(r2, r02, "Tinker.onBaseContextAttached(" + r1 + ")");
        return;
    L25:
        return;
    L11:
        Object r55 = r5.f2669b;
        if ((r55 instanceof Application) == false) goto L14;
        r2 = (Application) r55;
    L14:
        if (r2 != null) goto L17;
        return;
    L17:
        if (AbstractC0307g.m699a(r2.getPackageName(), ModernHookEntry.WECHAT_PACKAGE) == false) goto L27;
        AtomicBoolean r56 = ModuleBootstrap.f2976a;
        ClassLoader r57 = r2.getClassLoader();
        if (r57 == null) goto L23;
        r02 = r57;
    L23:
        ModuleBootstrap.m2127a(r2, r02, r1 + ".onCreate");
        return;
    }
}
