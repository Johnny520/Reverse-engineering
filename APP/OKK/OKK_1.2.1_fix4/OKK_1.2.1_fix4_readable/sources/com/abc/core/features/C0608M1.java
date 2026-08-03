package com.abc.core.features;

import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import java.lang.reflect.Method;
import p007D0.C0143i;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.M1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0608M1 extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f1867b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Method f1868c;

    public C0608M1(boolean z2, Method method) {
        this.f1867b = z2;
        this.f1868c = method;
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: b */
    public final void mo1386b(C0760b c0760b) {
        VirtualLocationHook virtualLocationHook = VirtualLocationHook.f1854a;
        if (((Boolean) VirtualLocationHook.m1490e(virtualLocationHook).f334a).booleanValue()) {
            C0143i c0143iM1490e = VirtualLocationHook.m1490e(virtualLocationHook);
            boolean zBooleanValue = ((Boolean) c0143iM1490e.f334a).booleanValue();
            double dDoubleValue = ((Number) c0143iM1490e.f335b).doubleValue();
            double dDoubleValue2 = ((Number) c0143iM1490e.f336c).doubleValue();
            if (zBooleanValue) {
                if (!this.f1867b) {
                    dDoubleValue = dDoubleValue2;
                }
                Class<?> returnType = this.f1868c.getReturnType();
                c0760b.m1946c((AbstractC0307g.m699a(returnType, Float.TYPE) || AbstractC0307g.m699a(returnType, Float.class)) ? Float.valueOf((float) dDoubleValue) : Double.valueOf(dDoubleValue));
            }
        }
    }
}
