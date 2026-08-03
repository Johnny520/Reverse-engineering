package androidx.lifecycle;

import android.app.Activity;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: androidx.lifecycle.F */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0517F {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static void m1246c(Activity activity, EnumC0535l enumC0535l) {
        AbstractC0307g.m703e(activity, "activity");
        AbstractC0307g.m703e(enumC0535l, "event");
        if (activity instanceof InterfaceC0541r) {
            C0543t c0543tMo1231d = ((InterfaceC0541r) activity).mo1231d();
            if (c0543tMo1231d instanceof C0543t) {
                c0543tMo1231d.m1257d(enumC0535l);
            }
        }
    }
}
