package u4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends z4.i {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13369j;

    public c(int r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = -1
            r0.f13369j = r1
            return
    }

    public final int r() {
            r8 = this;
            int r0 = r8.f13369j
            r1 = -1
            if (r0 != r1) goto L34
            i4.i r0 = new i4.i
            r0.<init>()
            r1 = 0
            r0.f6461g = r1
            java.lang.Object[] r2 = r8.f22543h
            int r2 = r2.length
            r3 = r1
        L11:
            if (r3 >= r2) goto L30
            java.lang.Object r4 = r8.l(r3)
            u4.b r4 = (u4.b) r4
            h4.u r4 = r4.f13366b
            java.lang.Object[] r5 = r4.f22543h
            int r5 = r5.length
            r6 = r1
        L1f:
            if (r6 >= r5) goto L2d
            java.lang.Object r7 = r4.l(r6)
            u4.i r7 = (u4.i) r7
            r7.d(r0)
            int r6 = r6 + 1
            goto L1f
        L2d:
            int r3 = r3 + 1
            goto L11
        L30:
            int r0 = r0.f6461g
            r8.f13369j = r0
        L34:
            int r0 = r8.f13369j
            return r0
    }

    public final u4.b s(int r2) {
            r1 = this;
            int r0 = r1.p(r2)
            if (r0 < 0) goto Ld
            java.lang.Object r2 = r1.l(r0)
            u4.b r2 = (u4.b) r2
            return r2
        Ld:
            java.lang.String r2 = a.a.X0(r2)
            java.lang.String r0 = "no such label: "
            java.lang.String r2 = r0.concat(r2)
            j8.o.t(r2)
            r2 = 0
            return r2
    }
}
