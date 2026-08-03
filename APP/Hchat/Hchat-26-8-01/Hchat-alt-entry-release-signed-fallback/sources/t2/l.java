package t2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t2.l f13015b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t2.l f13016c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t2.l f13017d = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13018a;

    static {
            t2.l r0 = new t2.l
            r1 = 0
            r0.<init>(r1)
            t2.l.f13015b = r0
            t2.l r0 = new t2.l
            r1 = 1
            r0.<init>(r1)
            t2.l.f13016c = r0
            t2.l r0 = new t2.l
            r1 = 2
            r0.<init>(r1)
            t2.l.f13017d = r0
            return
    }

    public l(int r1) {
            r0 = this;
            r0.<init>()
            r0.f13018a = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof t2.l
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            t2.l r4 = (t2.l) r4
            int r4 = r4.f13018a
            int r1 = r3.f13018a
            if (r1 == r4) goto L13
            return r2
        L13:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.f13018a
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            int r0 = r5.f13018a
            if (r0 != 0) goto L7
            java.lang.String r0 = "TextDecoration.None"
            return r0
        L7:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = r0 & 1
            if (r2 == 0) goto L15
            java.lang.String r2 = "Underline"
            r1.add(r2)
        L15:
            r0 = r0 & 2
            if (r0 == 0) goto L1e
            java.lang.String r0 = "LineThrough"
            r1.add(r0)
        L1e:
            int r0 = r1.size()
            r2 = 1
            if (r0 != r2) goto L3b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "TextDecoration."
            r0.<init>(r2)
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L3b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "TextDecoration["
            r0.<init>(r2)
            r2 = 0
            r3 = 62
            java.lang.String r4 = ", "
            java.lang.String r1 = w2.a.a(r1, r4, r2, r3)
            r2 = 93
            java.lang.String r0 = eh.a.q(r0, r1, r2)
            return r0
    }
}
