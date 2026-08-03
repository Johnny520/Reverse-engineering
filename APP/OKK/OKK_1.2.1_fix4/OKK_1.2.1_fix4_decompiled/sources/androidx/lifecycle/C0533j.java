package androidx.lifecycle;

import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: androidx.lifecycle.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0533j {
    /* JADX INFO: renamed from: a */
    public static EnumC0535l m1251a(EnumC0536m enumC0536m) {
        AbstractC0307g.m703e(enumC0536m, "state");
        int iOrdinal = enumC0536m.ordinal();
        if (iOrdinal == 1) {
            return EnumC0535l.ON_CREATE;
        }
        if (iOrdinal == 2) {
            return EnumC0535l.ON_START;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return EnumC0535l.ON_RESUME;
    }
}
