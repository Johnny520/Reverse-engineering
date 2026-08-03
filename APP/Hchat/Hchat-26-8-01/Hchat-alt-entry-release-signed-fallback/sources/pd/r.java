package pd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends ud.p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f10531o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int[] f10532p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int[] f10533q;

    public r(tc.a r3) {
            r2 = this;
            pd.k r0 = pd.k.f10515x
            r1 = 0
            r2.<init>(r0, r1)
            int r0 = r3.f13116a
            r2.f10531o = r0
            int[] r0 = r3.f13117b
            r2.f10532p = r0
            int[] r3 = r3.f13118c
            r2.f10533q = r3
            return
    }

    @Override // ud.p
    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "switch-data {"
            r0.append(r1)
            r1 = 0
        Lb:
            int r2 = r3.f10531o
            if (r1 >= r2) goto L2e
            int[] r2 = r3.f10532p
            r2 = r2[r1]
            r0.append(r2)
            java.lang.String r2 = "->"
            r0.append(r2)
            int[] r2 = r3.f10533q
            r2 = r2[r1]
            java.lang.String r2 = xe.m.d(r2)
            r0.append(r2)
            java.lang.String r2 = ", "
            r0.append(r2)
            int r1 = r1 + 1
            goto Lb
        L2e:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            r3.K(r0)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
