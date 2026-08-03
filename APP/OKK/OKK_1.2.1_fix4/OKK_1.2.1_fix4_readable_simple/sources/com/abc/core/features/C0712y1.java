package com.abc.core.features;

import java.util.Map;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.y1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0712y1 implements InterfaceC0286l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f2244a;

    public /* synthetic */ C0712y1(long r1) {
        this.f2244a = r1;
    }

    @Override // p029P0.InterfaceC0286l
    public final Object invoke(Object r5) {
        Map.Entry r52 = (Map.Entry) r5;
        AbstractC0307g.m703e(r52, "<destruct>");
        Object r53 = r52.getValue();
        AbstractC0307g.m702d(r53, "component2(...)");
        long r02 = ((Long) r53).longValue();
        if ((this.f2244a - r02) <= 604800000) goto L5;
        boolean r54 = true;
    L7:
        return Boolean.valueOf(r54);
    L5:
        r54 = false;
        goto L7
    }
}
