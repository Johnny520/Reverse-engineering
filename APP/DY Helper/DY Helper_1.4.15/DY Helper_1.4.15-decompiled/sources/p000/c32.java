package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class c32 {

    /* JADX INFO: renamed from: β */
    public static final p000.c32 f1958 = null;

    /* JADX INFO: renamed from: γ */
    public static final p000.c32 f1959 = null;

    /* JADX INFO: renamed from: α */
    public final int f1960;

    static {
            c32 r0 = new c32
            r1 = 0
            r0.<init>(r1)
            p000.c32.f1958 = r0
            c32 r0 = new c32
            r1 = 1
            r0.<init>(r1)
            p000.c32.f1959 = r0
            return
    }

    public c32(int r1) {
            r0 = this;
            r0.<init>()
            r0.f1960 = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof p000.c32
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            c32 r4 = (p000.c32) r4
            int r4 = r4.f1960
            int r3 = r3.f1960
            if (r3 == r4) goto L13
            return r2
        L13:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            int r0 = r0.f1960
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            int r4 = r4.f1960
            if (r4 != 0) goto L7
            java.lang.String r4 = "TextDecoration.None"
            return r4
        L7:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r4 & 1
            if (r1 == 0) goto L15
            java.lang.String r1 = "Underline"
            r0.add(r1)
        L15:
            r4 = r4 & 2
            if (r4 == 0) goto L1e
            java.lang.String r4 = "LineThrough"
            r0.add(r4)
        L1e:
            int r4 = r0.size()
            r1 = 1
            if (r4 != r1) goto L3b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "TextDecoration."
            r4.<init>(r1)
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            return r4
        L3b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "TextDecoration["
            r4.<init>(r1)
            r1 = 0
            r2 = 62
            java.lang.String r3 = ", "
            java.lang.String r0 = p000.hu0.m2541(r0, r3, r1, r2)
            r1 = 93
            java.lang.String r4 = p000.AbstractC0602nx.m4132(r4, r0, r1)
            return r4
    }
}
