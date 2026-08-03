package fun.box001.internal.dexformat;

import fun.box001.internal.dexformat.output.AbstractC0203e;

/* JADX INFO: renamed from: e.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0028e extends AbstractC0203e implements Comparable {

    /* JADX INFO: renamed from: c */
    public static final C0028e f92c = null;

    static {
        f92c = new C0028e(0);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r8) {
        C0028e r82 = (C0028e) r8;
        if (this == r82) goto L21;
        int r1 = m504B();
        int r2 = r82.m504B();
        int r3 = Math.min(r1, r2);
        int r4 = 0;
    L6:
        if (r4 >= r3) goto L11;
        int r5 = m508k(r4).m108a(r82.m508k(r4));
        if (r5 != 0) goto L18;
        r4 = r4 + 1;
        goto L6
    L18:
        return r5;
    L11:
        if (r1 >= r2) goto L13;
        return -1;
    L13:
        if (r1 <= r2) goto L20;
        return 1;
    L20:
        return 0;
    L21:
        return 0;
    }
}
