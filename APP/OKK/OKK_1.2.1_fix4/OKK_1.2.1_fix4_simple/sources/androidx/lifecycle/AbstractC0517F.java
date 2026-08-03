package androidx.lifecycle;

import android.app.Activity;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: androidx.lifecycle.F */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0517F {
    static {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static void m1246c(Activity r1, EnumC0535l r2) {
        AbstractC0307g.m703e(r1, "activity");
        AbstractC0307g.m703e(r2, "event");
        if ((r1 instanceof InterfaceC0541r) == false) goto L8;
        C0543t r12 = ((InterfaceC0541r) r1).mo1231d();
        if ((r12 instanceof C0543t) == false) goto L9;
        r12.m1257d(r2);
        return;
    L9:
        return;
    }
}
