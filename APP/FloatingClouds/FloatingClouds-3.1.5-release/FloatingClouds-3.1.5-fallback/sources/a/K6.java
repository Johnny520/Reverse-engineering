package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class K6 implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object r5, java.lang.Object r6) {
            r4 = this;
            byte[] r5 = (byte[]) r5
            byte[] r6 = (byte[]) r6
            int r0 = r5.length
            int r1 = r6.length
            if (r0 == r1) goto Lc
            int r5 = r5.length
            int r6 = r6.length
            int r5 = r5 - r6
            return r5
        Lc:
            r0 = 0
            r1 = r0
        Le:
            int r2 = r5.length
            if (r1 >= r2) goto L1c
            r2 = r5[r1]
            r3 = r6[r1]
            if (r2 == r3) goto L19
            int r2 = r2 - r3
            return r2
        L19:
            int r1 = r1 + 1
            goto Le
        L1c:
            return r0
    }
}
