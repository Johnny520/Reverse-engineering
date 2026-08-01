package defpackage;

/* JADX INFO: renamed from: ᛲᛵᲁᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0297 implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            byte[] r4 = (byte[]) r4
            byte[] r5 = (byte[]) r5
            int r3 = r4.length
            int r0 = r5.length
            if (r3 == r0) goto Lc
            int r3 = r4.length
            int r4 = r5.length
            int r3 = r3 - r4
            return r3
        Lc:
            r3 = 0
            r0 = r3
        Le:
            int r1 = r4.length
            if (r0 >= r1) goto L1c
            r1 = r4[r0]
            r2 = r5[r0]
            if (r1 == r2) goto L19
            int r1 = r1 - r2
            return r1
        L19:
            int r0 = r0 + 1
            goto Le
        L1c:
            return r3
    }
}
