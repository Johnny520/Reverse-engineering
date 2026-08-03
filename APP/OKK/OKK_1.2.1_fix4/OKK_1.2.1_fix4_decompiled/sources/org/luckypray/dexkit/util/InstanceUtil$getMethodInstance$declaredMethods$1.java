package org.luckypray.dexkit.util;

import java.lang.reflect.Method;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0308h;
import p031Q0.C0313m;

/* JADX INFO: loaded from: classes.dex */
public final class InstanceUtil$getMethodInstance$declaredMethods$1 extends AbstractC0308h implements InterfaceC0275a {
    final /* synthetic */ C0313m $clz;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstanceUtil$getMethodInstance$declaredMethods$1(C0313m c0313m) {
        super(0);
        this.$clz = c0313m;
    }

    @Override // p029P0.InterfaceC0275a
    public final Method[] invoke() {
        Method[] declaredMethods = ((Class) this.$clz.f595a).getDeclaredMethods();
        AbstractC0307g.m702d(declaredMethods, "clz.declaredMethods");
        return declaredMethods;
    }
}
