package com.abc.core.runtime;

import p007D0.InterfaceC0135a;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: f0.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0817b implements InterfaceC0135a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2967a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DialogC0823e f2968b;

    public /* synthetic */ C0817b(DialogC0823e r1, int r2) {
        this.f2967a = r2;
        this.f2968b = r1;
    }

    /* JADX INFO: renamed from: a */
    public final void m2126a(Integer r9, Integer r10, final String r11) {
        int r02 = this.f2967a;
        final int r2 = r9.intValue();
        final int r3 = r10.intValue();
        switch(r02) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        final DialogC0823e r1 = this.f2968b;
        AbstractC0307g.m703e(r1, "$progress");
        AbstractC0307g.m703e(r11, "title");
        final int r5 = 1;
        HookDiagnostics.f3001b.post(new RunnableC0815a(r1, r2, r3, r11, r5));
        return;
    L6:
        final DialogC0823e r12 = this.f2968b;
        AbstractC0307g.m703e(r12, "$progress");
        AbstractC0307g.m703e(r11, "title");
        final int r52 = 0;
        HookDiagnostics.f3001b.post(new RunnableC0815a(r12, r2, r3, r11, r52));
    }
}
