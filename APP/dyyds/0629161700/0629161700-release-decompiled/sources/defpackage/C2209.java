package defpackage;

/* JADX INFO: renamed from: ᲈᛳᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2209 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C2209 f9419 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.util.Set f9420;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.AbstractC2193 f9421;

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            ᲈᛳᛷ r1 = new ᲈᛳᛷ
            java.util.Set r0 = defpackage.AbstractC1107.m2121(r0)
            r2 = 0
            r1.<init>(r0, r2)
            defpackage.C2209.f9419 = r1
            return
    }

    public C2209(java.util.Set r1, defpackage.AbstractC2193 r2) {
            r0 = this;
            r0.<init>()
            r0.f9420 = r1
            r0.f9421 = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.C2209
            if (r0 == 0) goto L1c
            ᲈᛳᛷ r3 = (defpackage.C2209) r3
            java.util.Set r0 = r3.f9420
            java.util.Set r1 = r2.f9420
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1c
            ᲈᛲᲀᛳ r3 = r3.f9421
            ᲈᛲᲀᛳ r2 = r2.f9421
            boolean r2 = defpackage.AbstractC0498.m1280(r3, r2)
            if (r2 == 0) goto L1c
            r2 = 1
            return r2
        L1c:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.util.Set r0 = r1.f9420
            int r0 = r0.hashCode()
            int r0 = r0 + 1517
            int r0 = r0 * 41
            ᲈᛲᲀᛳ r1 = r1.f9421
            if (r1 == 0) goto L13
            int r1 = r1.hashCode()
            goto L14
        L13:
            r1 = 0
        L14:
            int r0 = r0 + r1
            return r0
    }
}
