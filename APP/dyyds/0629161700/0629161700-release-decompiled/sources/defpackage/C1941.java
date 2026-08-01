package defpackage;

/* JADX INFO: renamed from: ᲁᲇᛴᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1941 implements java.lang.Appendable {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public boolean f8453;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.Appendable f8454;

    public C1941(java.lang.Appendable r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f8453 = r0
            r1.f8454 = r2
            return
    }

    @Override // java.lang.Appendable
    public final java.lang.Appendable append(char r4) {
            r3 = this;
            boolean r0 = r3.f8453
            java.lang.Appendable r1 = r3.f8454
            r2 = 0
            if (r0 == 0) goto Le
            r3.f8453 = r2
            java.lang.String r0 = "  "
            r1.append(r0)
        Le:
            r0 = 10
            if (r4 != r0) goto L13
            r2 = 1
        L13:
            r3.f8453 = r2
            r1.append(r4)
            return r3
    }

    @Override // java.lang.Appendable
    public final java.lang.Appendable append(java.lang.CharSequence r3) {
            r2 = this;
            if (r3 != 0) goto L4
            java.lang.String r3 = ""
        L4:
            r0 = 0
            int r1 = r3.length()
            r2.append(r3, r0, r1)
            return r2
    }

    @Override // java.lang.Appendable
    public final java.lang.Appendable append(java.lang.CharSequence r5, int r6, int r7) {
            r4 = this;
            if (r5 != 0) goto L4
            java.lang.String r5 = ""
        L4:
            boolean r0 = r4.f8453
            java.lang.Appendable r1 = r4.f8454
            r2 = 0
            if (r0 == 0) goto L12
            r4.f8453 = r2
            java.lang.String r0 = "  "
            r1.append(r0)
        L12:
            int r0 = r5.length()
            if (r0 <= 0) goto L23
            int r0 = r7 + (-1)
            char r0 = r5.charAt(r0)
            r3 = 10
            if (r0 != r3) goto L23
            r2 = 1
        L23:
            r4.f8453 = r2
            r1.append(r5, r6, r7)
            return r4
    }
}
