package com.abc.core.features;

import android.view.View;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.L */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0603L implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1850a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f1851b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f1852c;

    public /* synthetic */ RunnableC0603L(int i2, View view, Object obj) {
        this.f1850a = i2;
        this.f1851b = view;
        this.f1852c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.f1851b;
        Object obj = this.f1852c;
        switch (this.f1850a) {
            case 0:
                AbstractC0307g.m703e(obj, "$currentMsg");
                MessageDetailHook messageDetailHook = MessageDetailHook.f1967a;
                Object objM1587i0 = MessageDetailHook.m1587i0(view, obj);
                if (!MessageDetailHook.m1562S(objM1587i0) && !MessageDetailHook.m1561R(objM1587i0)) {
                    MessageDetailHook.m1601p0("left swipe quote retry failed for ".concat(objM1587i0.getClass().getName()));
                }
                break;
            default:
                AbstractC0307g.m703e(obj, "$currentMsg");
                MessageDetailHook messageDetailHook2 = MessageDetailHook.f1967a;
                if (!MessageDetailHook.m1562S(MessageDetailHook.m1587i0(view, obj)) && !MessageDetailHook.m1561R(obj)) {
                    MessageDetailHook.m1601p0("left swipe quote retry after clear failed for ".concat(obj.getClass().getName()));
                }
                break;
        }
    }
}
