package org.luckypray.dexkit.util;

import java.lang.reflect.Method;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0308h;
import p031Q0.C0313m;

/* JADX INFO: loaded from: classes.dex */
public final class InstanceUtil$getMethodInstance$declaredMethods$1 extends AbstractC0308h implements InterfaceC0275a {
    final /* synthetic */ C0313m $clz;

    public InstanceUtil$getMethodInstance$declaredMethods$1(C0313m r1) {
        this.$clz = r1;
        super(0);
    }

    @Override // p029P0.InterfaceC0275a
    public /* bridge */ /* synthetic */ Object invoke() {
        return invoke();
    }

    @Override // p029P0.InterfaceC0275a
    public final Method[] invoke() {
        Method[] r02 = ((Class) this.$clz.f595a).getDeclaredMethods();
        AbstractC0307g.m702d(r02, "clz.declaredMethods");
        return r02;
    }
}
