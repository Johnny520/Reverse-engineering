package defpackage;

/* JADX INFO: renamed from: ᲀᲈᲁᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1786 implements defpackage.InterfaceC1631 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String f7866;

    public C1786(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            java.lang.String r1 = defpackage.AbstractC0859.m1820(r1)
            r0.f7866 = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r1 = 1
            return r1
        L4:
            boolean r0 = r2 instanceof defpackage.C1786
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            ᲀᲈᲁᛳ r2 = (defpackage.C1786) r2
            java.lang.String r2 = r2.f7866
            java.lang.String r1 = r1.f7866
            boolean r1 = r1.equals(r2)
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.lang.String r0 = r0.f7866
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = r0.f7866
            java.lang.String r0 = defpackage.AbstractC0859.m1817(r0)
            return r0
    }
}
