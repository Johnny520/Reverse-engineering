package com.abc.core.runtime;

import android.content.Context;
import de.robv.android.xposed.AbstractC0761c;
import java.lang.reflect.Field;
import p007D0.C0146l;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;

/* JADX INFO: renamed from: f0.a0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0816a0 implements InterfaceC0286l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2965a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Class f2966b;

    public /* synthetic */ C0816a0(int r1, Class r2) {
        this.f2965a = r1;
        this.f2966b = r2;
    }

    @Override // p029P0.InterfaceC0286l
    public final Object invoke(Object r3) {
        switch(this.f2965a) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        Field r32 = (Field) r3;
        Class r1 = this.f2966b;
        AbstractC0307g.m703e(r1, "$plusClass");
        AbstractC0307g.m703e(r32, "it");
        return Boolean.valueOf(r1.isAssignableFrom(r32.getType()));
    L6:
        AbstractC0761c r33 = (AbstractC0761c) r3;
        AbstractC0307g.m703e(r33, "it");
        Class r02 = Long.TYPE;
        AbstractC0307g.m700b(r02);
        Class r12 = this.f2966b;
        AbstractC0358S.m904q(r12, "onBaseContextAttached", new Object[]{Context.class, r02, r02, r33});
        return C0146l.f339a;
    L8:
        AbstractC0761c r34 = (AbstractC0761c) r3;
        AbstractC0307g.m703e(r34, "it");
        Class r13 = this.f2966b;
        AbstractC0358S.m904q(r13, "onBaseContextAttached", new Object[]{Context.class, r34});
        return C0146l.f339a;
    }
}
