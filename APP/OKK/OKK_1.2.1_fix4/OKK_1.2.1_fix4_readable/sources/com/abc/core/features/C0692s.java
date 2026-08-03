package com.abc.core.features;

import java.lang.reflect.Method;
import java.util.Comparator;
import p001A0.AbstractC0040p;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;

/* JADX INFO: renamed from: c0.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0692s implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2186a;

    public /* synthetic */ C0692s(int i2) {
        this.f2186a = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2186a) {
            case 2:
                Method method = (Method) obj2;
                String name = method.getName();
                AbstractC0307g.m702d(name, "getName(...)");
                int length = method.getParameterTypes().length;
                MessageDetailHook messageDetailHook = MessageDetailHook.f1967a;
                Integer numValueOf = Integer.valueOf(AbstractC0358S.m876a0(name, length, MessageDetailHook.m1564U(method)));
                Method method2 = (Method) obj;
                String name2 = method2.getName();
                AbstractC0307g.m702d(name2, "getName(...)");
                break;
        }
        return AbstractC0040p.m112q(Integer.valueOf(((Method) obj).getParameterTypes().length), Integer.valueOf(((Method) obj2).getParameterTypes().length));
    }
}
