package v4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends z4.e implements java.lang.Comparable {
    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            v4.c r1 = (v4.c) r1
            int r1 = r0.o(r1)
            return r1
    }

    public final int o(v4.c r8) {
            r7 = this;
            java.lang.Object[] r0 = r7.f22543h
            int r0 = r0.length
            java.lang.Object[] r1 = r8.f22543h
            int r1 = r1.length
            if (r0 >= r1) goto La
            r2 = r0
            goto Lb
        La:
            r2 = r1
        Lb:
            r3 = 0
            r4 = r3
        Ld:
            if (r4 >= r2) goto L25
            java.lang.Object r5 = r7.l(r4)
            v4.a r5 = (v4.a) r5
            java.lang.Object r6 = r8.l(r4)
            v4.a r6 = (v4.a) r6
            int r5 = r5.d(r6)
            if (r5 == 0) goto L22
            return r5
        L22:
            int r4 = r4 + 1
            goto Ld
        L25:
            if (r0 >= r1) goto L29
            r8 = -1
            return r8
        L29:
            if (r0 <= r1) goto L2d
            r8 = 1
            return r8
        L2d:
            return r3
    }
}
