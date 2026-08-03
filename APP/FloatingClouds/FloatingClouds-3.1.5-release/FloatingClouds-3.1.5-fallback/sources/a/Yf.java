package a;

/* JADX INFO: loaded from: classes.dex */
public final class Yf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.C0350r6 f364a;
    public final a.EnumC0404u6 b;

    public Yf(a.C0350r6 r1, a.EnumC0404u6 r2) {
            r0 = this;
            r0.<init>()
            r0.f364a = r1
            r0.b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof a.Yf
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            a.Yf r5 = (a.Yf) r5
            a.r6 r1 = r5.f364a
            a.r6 r3 = r4.f364a
            boolean r1 = a.C0193i9.a(r3, r1)
            if (r1 != 0) goto L17
            return r2
        L17:
            a.u6 r1 = r4.b
            a.u6 r5 = r5.b
            if (r1 == r5) goto L1e
            return r2
        L1e:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            a.r6 r0 = r2.f364a
            java.lang.String r0 = r0.d
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            a.u6 r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "UsingFieldData(field="
            r0.<init>(r1)
            a.r6 r1 = r2.f364a
            r0.append(r1)
            java.lang.String r1 = ", usingType="
            r0.append(r1)
            a.u6 r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
