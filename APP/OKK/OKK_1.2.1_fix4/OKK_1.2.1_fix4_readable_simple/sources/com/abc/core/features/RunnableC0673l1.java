package com.abc.core.features;

import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p009E0.AbstractC0188s;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.l1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0673l1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2097a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f2098b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0685p1 f2099c;

    public /* synthetic */ RunnableC0673l1(String r1, AbstractC0685p1 r2, int r3) {
        this.f2097a = r3;
        this.f2098b = r1;
        this.f2099c = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String r02 = this.f2098b;
        AbstractC0685p1 r2 = this.f2099c;
        switch(this.f2097a) {
            case 0: goto L16;
            default: goto L4;
        };
    L4:
        AbstractC0307g.m703e(r2, "$result");
        CopyOnWriteArrayList r1 = (CopyOnWriteArrayList) RealNameTailHook.f2172j.get(r02);
        if (r1 == null) goto L15;
        Iterator r12 = r1.iterator();
    L8:
        if (r12.hasNext() == false) goto L27;
        TextView r3 = (TextView) ((WeakReference) r12.next()).get();
        if (r3 == null) goto L8;
        if (AbstractC0307g.m699a(r3.getTag(2113929217), r02) == false) goto L8;
        RealNameTailHook r4 = RealNameTailHook.f2163a;
        RealNameTailHook.m1766a(r3, r02, ((C0679n1) r2).f2136a);
        goto L8
    L27:
        return;
    L15:
        return;
    L16:
        AbstractC0307g.m703e(r02, "$sender");
        AbstractC0307g.m703e(r2, "$result");
        RealNameTailHook r13 = RealNameTailHook.f2163a;
        C0679n1 r22 = (C0679n1) r2;
        CopyOnWriteArrayList r14 = (CopyOnWriteArrayList) RealNameTailHook.f2172j.get(r02);
        if (r14 == null) goto L28;
        AbstractC0188s.m562n0(r14, new C0615P(1, r02, r22.f2136a));
        return;
    }
}
