package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tk implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object r5, Object r6) {
        byte[] r52 = (byte[]) r5;
        byte[] r62 = (byte[]) r6;
        if (r52.length != r62.length) goto L5;
        int r1 = 0;
    L8:
        if (r1 >= r52.length) goto L14;
        byte r2 = r52[r1];
        byte r3 = r62[r1];
        if (r2 != r3) goto L12;
        r1 = r1 + 1;
        goto L8
    L12:
        return r2 - r3;
    L14:
        return 0;
    L5:
        return r52.length - r62.length;
    }
}
