package defpackage;

/* JADX INFO: renamed from: ᲈᲁᲀᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2341 implements defpackage.InterfaceC2139 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.Class f10099;

    public C2341(java.lang.Class r1) {
            r0 = this;
            r0.<init>()
            r0.f10099 = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.C2341
            if (r0 == 0) goto L12
            ᲈᲁᲀᛴ r2 = (defpackage.C2341) r2
            java.lang.Class r2 = r2.f10099
            java.lang.Class r1 = r1.f10099
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.lang.Class r0 = r0.f10099
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r1.f10099
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = " (Kotlin reflection is not available)"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    @Override // defpackage.InterfaceC2139
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final java.lang.Class mo1084() {
            r0 = this;
            java.lang.Class r0 = r0.f10099
            return r0
    }
}
