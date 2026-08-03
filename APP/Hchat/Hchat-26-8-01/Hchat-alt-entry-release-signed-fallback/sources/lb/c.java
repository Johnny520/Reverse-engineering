package lb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f7955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object f7957c;

    public c(long r1, java.lang.String r3, java.lang.Object r4) {
            r0 = this;
            r0.<init>()
            r0.f7955a = r3
            r0.f7956b = r1
            r0.f7957c = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L2a
        L3:
            boolean r0 = r5 instanceof lb.c
            if (r0 != 0) goto L8
            goto L28
        L8:
            lb.c r5 = (lb.c) r5
            java.lang.String r0 = r4.f7955a
            java.lang.String r1 = r5.f7955a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L28
        L15:
            long r0 = r4.f7956b
            long r2 = r5.f7956b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1e
            goto L28
        L1e:
            java.lang.Object r0 = r4.f7957c
            java.lang.Object r5 = r5.f7957c
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L2a
        L28:
            r5 = 0
            return r5
        L2a:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f7955a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.f7956b
            int r0 = eh.a.f(r0, r1, r2)
            java.lang.Object r1 = r4.f7957c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = "QuoteTarget(talker="
            java.lang.String r1 = ", msgId="
            java.lang.String r2 = r5.f7955a
            long r3 = r5.f7956b
            java.lang.StringBuilder r0 = eh.a.v(r0, r2, r1, r3)
            java.lang.String r1 = ", nativeMessage="
            r0.append(r1)
            java.lang.Object r1 = r5.f7957c
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
