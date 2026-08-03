package com.android.dex.util;

/* JADX INFO: loaded from: classes.dex */
public final class Unsigned {
    private Unsigned() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int compare(int r4, int r5) {
            if (r4 != r5) goto L4
            r4 = 0
            return r4
        L4:
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r4 = (long) r5
            long r4 = r4 & r2
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 >= 0) goto L13
            r4 = -1
            goto L14
        L13:
            r4 = 1
        L14:
            return r4
    }

    public static int compare(short r1, short r2) {
            if (r1 != r2) goto L4
            r1 = 0
            return r1
        L4:
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            r2 = r2 & r0
            if (r1 >= r2) goto Ld
            r1 = -1
            goto Le
        Ld:
            r1 = 1
        Le:
            return r1
    }
}
