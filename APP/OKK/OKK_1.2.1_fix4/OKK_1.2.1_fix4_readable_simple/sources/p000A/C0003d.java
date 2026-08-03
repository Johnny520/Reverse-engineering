package p000A;

import java.util.Comparator;

/* JADX INFO: renamed from: A.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0003d implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object r5, Object r6) {
        byte[] r52 = (byte[]) r5;
        byte[] r62 = (byte[]) r6;
        if (r52.length != r62.length) goto L16;
        int r1 = 0;
    L7:
        if (r1 >= r52.length) goto L13;
        byte r2 = r52[r1];
        byte r3 = r62[r1];
        if (r2 != r3) goto L17;
        r1 = r1 + 1;
        goto L7
    L17:
        return r2 - r3;
    L13:
        return 0;
    L16:
        return r52.length - r62.length;
    }
}
