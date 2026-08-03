package p000;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.lang.Integer f84;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.util.List<java.lang.String> f85;

    public a0(java.lang.Integer r1, java.util.ArrayList r2) {
            r0 = this;
            r0.<init>()
            r0.f84 = r1
            r0.f85 = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.a0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ۟.a0 r5 = (p000.a0) r5
            java.lang.Integer r1 = r4.f84
            java.lang.Integer r3 = r5.f84
            boolean r1 = p000.h4.m185(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.util.List<java.lang.String> r1 = r4.f85
            java.util.List<java.lang.String> r5 = r5.f85
            boolean r5 = p000.h4.m185(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.Integer r0 = r3.f84
            r1 = 0
            if (r0 != 0) goto L7
            r0 = r1
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            int r0 = r0 * 31
            java.util.List<java.lang.String> r2 = r3.f85
            if (r2 != 0) goto L12
            goto L16
        L12:
            int r1 = r2.hashCode()
        L16:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = super.toString()
            return r0
    }
}
