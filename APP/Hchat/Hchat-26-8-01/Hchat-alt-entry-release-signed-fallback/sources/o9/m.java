package o9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f9646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fg.a f9648c;

    public m(java.lang.String r1, long r2, fg.a r4) {
            r0 = this;
            r0.<init>()
            r0.f9646a = r1
            r0.f9647b = r2
            r0.f9648c = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L2a
        L3:
            boolean r0 = r5 instanceof o9.m
            if (r0 != 0) goto L8
            goto L28
        L8:
            o9.m r5 = (o9.m) r5
            java.lang.String r0 = r4.f9646a
            java.lang.String r1 = r5.f9646a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L28
        L15:
            long r0 = r4.f9647b
            long r2 = r5.f9647b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1e
            goto L28
        L1e:
            fg.a r0 = r4.f9648c
            fg.a r5 = r5.f9648c
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
            java.lang.String r0 = r4.f9646a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.f9647b
            int r0 = eh.a.f(r0, r1, r2)
            fg.a r1 = r4.f9648c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = "ReplyTask(type="
            java.lang.String r1 = ", delayMs="
            java.lang.String r2 = r5.f9646a
            long r3 = r5.f9647b
            java.lang.StringBuilder r0 = eh.a.v(r0, r2, r1, r3)
            java.lang.String r1 = ", action="
            r0.append(r1)
            fg.a r1 = r5.f9648c
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
