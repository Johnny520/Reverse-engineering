package a;

/* JADX INFO: renamed from: a.p6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0315p6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f635a;
    public final a.EnumC0333q6 b;
    public final long c;
    public final long d;
    public final int e;
    public final int f;
    public final java.lang.String g;
    public final java.lang.String h;
    public final long i;

    public C0315p6(java.lang.String r2, a.EnumC0333q6 r3, long r4, long r6, int r8, int r9, java.lang.String r10, java.lang.String r11, long r12) {
            r1 = this;
            java.lang.String r0 = "state"
            a.C0193i9.e(r3, r0)
            r1.<init>()
            r1.f635a = r2
            r1.b = r3
            r1.c = r4
            r1.d = r6
            r1.e = r8
            r1.f = r9
            r1.g = r10
            r1.h = r11
            r1.i = r12
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof a.C0315p6
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            a.p6 r8 = (a.C0315p6) r8
            java.lang.String r1 = r8.f635a
            java.lang.String r3 = r7.f635a
            boolean r1 = a.C0193i9.a(r3, r1)
            if (r1 != 0) goto L17
            return r2
        L17:
            a.q6 r1 = r7.b
            a.q6 r3 = r8.b
            if (r1 == r3) goto L1e
            return r2
        L1e:
            long r3 = r7.c
            long r5 = r8.c
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L27
            return r2
        L27:
            long r3 = r7.d
            long r5 = r8.d
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L30
            return r2
        L30:
            int r1 = r7.e
            int r3 = r8.e
            if (r1 == r3) goto L37
            return r2
        L37:
            int r1 = r7.f
            int r3 = r8.f
            if (r1 == r3) goto L3e
            return r2
        L3e:
            java.lang.String r1 = r7.g
            java.lang.String r3 = r8.g
            boolean r1 = a.C0193i9.a(r1, r3)
            if (r1 != 0) goto L49
            return r2
        L49:
            java.lang.String r1 = r7.h
            java.lang.String r3 = r8.h
            boolean r1 = a.C0193i9.a(r1, r3)
            if (r1 != 0) goto L54
            return r2
        L54:
            long r3 = r7.i
            long r5 = r8.i
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L5d
            return r2
        L5d:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f635a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            a.q6 r1 = r4.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            long r2 = r4.c
            int r0 = java.lang.Long.hashCode(r2)
            int r0 = r0 + r1
            int r0 = r0 * 31
            long r1 = r4.d
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r4.e
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r4.f
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            int r1 = r1 * 31
            r0 = 0
            java.lang.String r2 = r4.g
            if (r2 != 0) goto L3c
            r2 = r0
            goto L40
        L3c:
            int r2 = r2.hashCode()
        L40:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.String r2 = r4.h
            if (r2 != 0) goto L48
            goto L4c
        L48:
            int r0 = r2.hashCode()
        L4c:
            int r1 = r1 + r0
            int r1 = r1 * 31
            long r2 = r4.i
            int r0 = java.lang.Long.hashCode(r2)
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FeatureGuardStatus(featureId="
            r0.<init>(r1)
            java.lang.String r1 = r3.f635a
            r0.append(r1)
            java.lang.String r1 = ", state="
            r0.append(r1)
            a.q6 r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", totalInvocations="
            r0.append(r1)
            long r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", totalErrors="
            r0.append(r1)
            long r1 = r3.d
            r0.append(r1)
            java.lang.String r1 = ", consecutiveFailures="
            r0.append(r1)
            int r1 = r3.e
            r0.append(r1)
            java.lang.String r1 = ", sessionFailureCount="
            r0.append(r1)
            int r1 = r3.f
            r0.append(r1)
            java.lang.String r1 = ", lastErrorType="
            r0.append(r1)
            java.lang.String r1 = r3.g
            r0.append(r1)
            java.lang.String r1 = ", lastErrorMessage="
            r0.append(r1)
            java.lang.String r1 = r3.h
            r0.append(r1)
            java.lang.String r1 = ", lastErrorAt="
            r0.append(r1)
            long r1 = r3.i
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
