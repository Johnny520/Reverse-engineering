package s1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0.b f12257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f.f0 f12258b;

    public j() {
            r2 = this;
            r2.<init>()
            j0.b r0 = new j0.b
            r1 = 16
            s1.i[] r1 = new s1.i[r1]
            r0.<init>(r1)
            r2.f12257a = r0
            f.f0 r0 = new f.f0
            r1 = 10
            r0.<init>(r1)
            r2.f12258b = r0
            return
    }

    public boolean a(f.p r7, v1.t r8, h0.q0 r9, boolean r10) {
            r6 = this;
            j0.b r0 = r6.f12257a
            java.lang.Object[] r1 = r0.f6671g
            int r0 = r0.f6673i
            r2 = 0
            r3 = r2
            r4 = r3
        L9:
            if (r3 >= r0) goto L1e
            r5 = r1[r3]
            s1.i r5 = (s1.i) r5
            boolean r5 = r5.a(r7, r8, r9, r10)
            if (r5 != 0) goto L1a
            if (r4 == 0) goto L18
            goto L1a
        L18:
            r4 = r2
            goto L1b
        L1a:
            r4 = 1
        L1b:
            int r3 = r3 + 1
            goto L9
        L1e:
            return r4
    }

    public void b(h0.q0 r3) {
            r2 = this;
            j0.b r3 = r2.f12257a
            int r0 = r3.f6673i
            int r0 = r0 + (-1)
        L6:
            r1 = -1
            if (r1 >= r0) goto L1b
            java.lang.Object[] r1 = r3.f6671g
            r1 = r1[r0]
            s1.i r1 = (s1.i) r1
            a5.a r1 = r1.f12246d
            int r1 = r1.f56h
            if (r1 != 0) goto L18
            r3.k(r0)
        L18:
            int r0 = r0 + (-1)
            goto L6
        L1b:
            return
    }
}
