package nd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements oc.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f9356g;

    public c0() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f9356g = r0
            return
    }

    @Override // oc.b
    public final /* bridge */ /* synthetic */ oc.a a() {
            r1 = this;
            md.b r0 = md.b.f8869x
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PHI:"
            r0.<init>(r1)
            java.util.ArrayList r1 = r5.f9356g
            java.util.Iterator r2 = r1.iterator()
        Ld:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L28
            java.lang.Object r3 = r2.next()
            pd.q r3 = (pd.q) r3
            qd.r r3 = r3.f13714l
            if (r3 == 0) goto Ld
            java.lang.String r4 = " r"
            r0.append(r4)
            int r3 = r3.f10922l
            r0.append(r3)
            goto Ld
        L28:
            java.util.Iterator r1 = r1.iterator()
        L2c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L41
            java.lang.Object r2 = r1.next()
            pd.q r2 = (pd.q) r2
            java.lang.String r3 = "\n  "
            r0.append(r3)
            r0.append(r2)
            goto L2c
        L41:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
