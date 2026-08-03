package b5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends b5.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f465h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b5.f f466i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b5.f f467j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b5.f f468k;

    public b(a5.a r3, b5.h r4, int r5, java.lang.String r6, int r7, int r8, int r9) {
            r2 = this;
            r2.<init>(r5)
            r2.f465h = r6
            b5.f r0 = new b5.f
            java.lang.String r1 = "try_start_"
            r0.<init>(r3, r7, r1)
            b5.f r7 = r4.b(r0)
            r2.f466i = r7
            b5.e r7 = new b5.e
            java.lang.String r0 = "try_end_"
            r7.<init>(r3, r5, r0)
            r7.f472i = r8
            b5.f r5 = r4.b(r7)
            r2.f467j = r5
            if (r6 != 0) goto L31
            b5.f r5 = new b5.f
            java.lang.String r6 = "catchall_"
            r5.<init>(r3, r9, r6)
            b5.f r3 = r4.b(r5)
            r2.f468k = r3
            return
        L31:
            b5.f r5 = new b5.f
            java.lang.String r6 = "catch_"
            r5.<init>(r3, r9, r6)
            b5.f r3 = r4.b(r5)
            r2.f468k = r3
            return
    }

    @Override // b5.j
    public final double b() {
            r2 = this;
            r0 = 4636878028842991616(0x4059800000000000, double:102.0)
            return r0
    }

    @Override // b5.j
    public final boolean c(e5.a r3) {
            r2 = this;
            java.lang.String r0 = r2.f465h
            if (r0 != 0) goto La
            java.lang.String r0 = ".catchall"
            r3.write(r0)
            goto L12
        La:
            java.lang.String r1 = ".catch "
            r3.write(r1)
            r3.write(r0)
        L12:
            java.lang.String r0 = " {"
            r3.write(r0)
            b5.f r0 = r2.f466i
            r0.c(r3)
            java.lang.String r0 = " .. "
            r3.write(r0)
            b5.f r0 = r2.f467j
            r0.c(r3)
            java.lang.String r0 = "} "
            r3.write(r0)
            b5.f r0 = r2.f468k
            r0.c(r3)
            r3 = 1
            return r3
    }
}
