package com.abc.core.features;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.O */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0612O implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1889a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC0286l f1890b;

    public /* synthetic */ C0612O(InterfaceC0286l r1, int r2) {
        this.f1889a = r2;
        this.f1890b = r1;
    }

    @Override // java.util.function.Function
    public final Object apply(Object r3) {
        switch(this.f1889a) {
            case 0: goto L18;
            case 1: goto L16;
            case 2: goto L14;
            case 3: goto L12;
            case 4: goto L10;
            case 5: goto L8;
            case 6: goto L6;
            default: goto L4;
        };
    L4:
        InterfaceC0286l r1 = this.f1890b;
        AbstractC0307g.m703e(r1, "$tmp0");
        return (CopyOnWriteArrayList) r1.invoke(r3);
    L6:
        InterfaceC0286l r12 = this.f1890b;
        AbstractC0307g.m703e(r12, "$tmp0");
        return (Field) r12.invoke(r3);
    L8:
        InterfaceC0286l r13 = this.f1890b;
        AbstractC0307g.m703e(r13, "$tmp0");
        return (Method) r13.invoke(r3);
    L10:
        InterfaceC0286l r14 = this.f1890b;
        AbstractC0307g.m703e(r14, "$tmp0");
        return (Method) r14.invoke(r3);
    L12:
        InterfaceC0286l r15 = this.f1890b;
        AbstractC0307g.m703e(r15, "$tmp0");
        return (Boolean) r15.invoke(r3);
    L14:
        InterfaceC0286l r16 = this.f1890b;
        AbstractC0307g.m703e(r16, "$tmp0");
        return (Field) r16.invoke(r3);
    L16:
        InterfaceC0286l r17 = this.f1890b;
        AbstractC0307g.m703e(r17, "$tmp0");
        return (C0622S) r17.invoke(r3);
    L18:
        InterfaceC0286l r18 = this.f1890b;
        AbstractC0307g.m703e(r18, "$tmp0");
        return (C0622S) r18.invoke(r3);
    }
}
