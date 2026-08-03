package fun.box001.internal.dexformat.writer.code;

import fun.box001.internal.dexformat.output.AbstractC0203e;

/* JADX INFO: renamed from: k.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0172b extends AbstractC0203e implements Comparable {
    /* JADX INFO: renamed from: F */
    public final int m428F(C0172b r8) {
        int r0 = m504B();
        int r1 = r8.m504B();
        if (r0 >= r1) goto L5;
        int r2 = r0;
    L6:
        int r4 = 0;
    L7:
        if (r4 >= r2) goto L12;
        int r5 = ((AbstractC0171a) m516s(r4)).m425b((AbstractC0171a) r8.m516s(r4));
        if (r5 != 0) goto L10;
        r4 = r4 + 1;
        goto L7
    L10:
        return r5;
    L12:
        if (r0 >= r1) goto L15;
        return -1;
    L15:
        if (r0 <= r1) goto L18;
        return 1;
    L18:
        return 0;
    L5:
        r2 = r1;
        goto L6
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object r1) {
        return m428F((C0172b) r1);
    }
}
