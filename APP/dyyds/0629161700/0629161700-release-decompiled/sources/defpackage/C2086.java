package defpackage;

/* JADX INFO: renamed from: ᲇᛷᛳᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2086 implements defpackage.InterfaceC0887 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final boolean f8932;

    public C2086(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.f8932 = r1
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Empty{"
            r0.<init>(r1)
            boolean r2 = r2.f8932
            if (r2 == 0) goto Le
            java.lang.String r2 = "Active"
            goto L10
        Le:
            java.lang.String r2 = "New"
        L10:
            r1 = 125(0x7d, float:1.75E-43)
            java.lang.String r2 = defpackage.AbstractC0225.m823(r0, r2, r1)
            return r2
    }

    @Override // defpackage.InterfaceC0887
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final defpackage.C0825 mo1407() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.InterfaceC0887
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final boolean mo1409() {
            r0 = this;
            boolean r0 = r0.f8932
            return r0
    }
}
