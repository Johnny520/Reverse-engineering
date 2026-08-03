package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0.b f8101a;

    public c(int r2) {
            r1 = this;
            switch(r2) {
                case 1: goto L12;
                default: goto L3;
            }
        L3:
            r1.<init>()
            j0.b r2 = new j0.b
            r0 = 16
            m.i[] r0 = new m.i[r0]
            r2.<init>(r0)
            r1.f8101a = r2
            return
        L12:
            r1.<init>()
            j0.b r2 = new j0.b
            r0 = 16
            s.m[] r0 = new s.m[r0]
            r2.<init>(r0)
            r1.f8101a = r2
            return
    }

    public void a(java.util.concurrent.CancellationException r7) {
            r6 = this;
            j0.b r0 = r6.f8101a
            int r1 = r0.f6673i
            qg.f[] r2 = new qg.f[r1]
            r3 = 0
            r4 = r3
        L8:
            if (r4 >= r1) goto L17
            java.lang.Object[] r5 = r0.f6671g
            r5 = r5[r4]
            m.i r5 = (m.i) r5
            qg.g r5 = r5.f8187b
            r2[r4] = r5
            int r4 = r4 + 1
            goto L8
        L17:
            if (r3 >= r1) goto L21
            r4 = r2[r3]
            r4.w(r7)
            int r3 = r3 + 1
            goto L17
        L21:
            int r7 = r0.f6673i
            if (r7 != 0) goto L26
            return
        L26:
            java.lang.String r7 = "uncancelled requests present"
            o.b.c(r7)
            return
    }

    public void b() {
            r5 = this;
            r0 = 0
            j0.b r1 = r5.f8101a
            int r2 = r1.f6673i
            lg.d r0 = r9.e0.r0(r0, r2)
            int r2 = r0.f8042g
            int r0 = r0.f8043h
            if (r2 > r0) goto L21
        Lf:
            java.lang.Object[] r3 = r1.f6671g
            r3 = r3[r2]
            m.i r3 = (m.i) r3
            qg.g r3 = r3.f8187b
            sf.n r4 = sf.n.f12433a
            r3.resumeWith(r4)
            if (r2 == r0) goto L21
            int r2 = r2 + 1
            goto Lf
        L21:
            r1.g()
            return
    }
}
