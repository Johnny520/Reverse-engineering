package p000;

/* JADX INFO: renamed from: xy */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1001xy {

    /* JADX INFO: renamed from: α */
    public final int f12379;

    public /* synthetic */ C1001xy(int r1) {
            r0 = this;
            r0.<init>()
            r0.f12379 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.lang.String m6799(int r2) {
            if (r2 != 0) goto L5
            java.lang.String r2 = "EmojiSupportMatch.Default"
            return r2
        L5:
            r0 = 1
            if (r2 != r0) goto Lb
            java.lang.String r2 = "EmojiSupportMatch.None"
            return r2
        Lb:
            r0 = 2
            if (r2 != r0) goto L11
            java.lang.String r2 = "EmojiSupportMatch.All"
            return r2
        L11:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid(value="
            r0.<init>(r1)
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000.C1001xy
            if (r0 != 0) goto L5
            goto Ld
        L5:
            xy r2 = (p000.C1001xy) r2
            int r2 = r2.f12379
            int r1 = r1.f12379
            if (r1 == r2) goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            int r0 = r0.f12379
            int r0 = java.lang.Integer.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            int r0 = r0.f12379
            java.lang.String r0 = m6799(r0)
            return r0
    }
}
