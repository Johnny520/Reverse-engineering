package androidx.lifecycle;

import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: androidx.lifecycle.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0533j {
    /* JADX INFO: renamed from: a */
    public static EnumC0535l m1251a(EnumC0536m r1) {
        AbstractC0307g.m703e(r1, "state");
        int r12 = r1.ordinal();
        if (r12 == 1) goto L12;
        if (r12 == 2) goto L15;
        if (r12 == 3) goto L14;
        return null;
    L14:
        return EnumC0535l.ON_RESUME;
    L15:
        return EnumC0535l.ON_START;
    L12:
        return EnumC0535l.ON_CREATE;
    }
}
