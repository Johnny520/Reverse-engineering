package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class l21 {
    /* JADX INFO: renamed from: α */
    public static final void m3471(int r0, java.util.List r1) {
            int r1 = r1.size()
            if (r0 < 0) goto La
            if (r0 < r1) goto L9
            goto La
        L9:
            return
        La:
            m3473(r0, r1)
            return
    }

    /* JADX INFO: renamed from: β */
    public static final void m3472(java.util.List r0, int r1, int r2) {
            if (r1 <= r2) goto L5
            m3476(r1, r2)
        L5:
            if (r1 >= 0) goto La
            m3474(r1)
        La:
            int r1 = r0.size()
            if (r2 <= r1) goto L17
            int r0 = r0.size()
            m3475(r2, r0)
        L17:
            return
    }

    /* JADX INFO: renamed from: γ */
    private static final void m3473(int r4, int r5) {
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = " is out of bounds. The list has "
            java.lang.String r2 = " elements."
            java.lang.String r3 = "Index "
            java.lang.String r4 = p000.AbstractC0602nx.m4128(r3, r4, r1, r5, r2)
            r0.<init>(r4)
            throw r0
    }

    /* JADX INFO: renamed from: δ */
    private static final void m3474(int r3) {
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = "fromIndex ("
            java.lang.String r2 = ") is less than 0."
            java.lang.String r3 = p000.AbstractC0602nx.m4127(r1, r3, r2)
            r0.<init>(r3)
            throw r0
    }

    /* JADX INFO: renamed from: ε */
    private static final void m3475(int r3, int r4) {
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "toIndex ("
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = ") is more than than the list size ("
            r1.append(r3)
            r1.append(r4)
            r3 = 41
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    /* JADX INFO: renamed from: ζ */
    private static final void m3476(int r4, int r5) {
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = ") is greater than toIndex ("
            java.lang.String r2 = ")."
            java.lang.String r3 = "Indices are out of order. fromIndex ("
            java.lang.String r4 = p000.AbstractC0602nx.m4128(r3, r4, r1, r5, r2)
            r0.<init>(r4)
            throw r0
    }
}
