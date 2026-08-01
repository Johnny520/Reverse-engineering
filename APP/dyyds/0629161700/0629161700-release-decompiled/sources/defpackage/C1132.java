package defpackage;

/* JADX INFO: renamed from: ᛶᛸᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1132 extends defpackage.AbstractC2160 {

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final defpackage.C2056 f5034;

    public C1132(defpackage.C2056 r1) {
            r0 = this;
            r0.<init>()
            r0.f5034 = r1
            return
    }

    @Override // defpackage.AbstractC1804
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final void mo788(java.lang.String r3, defpackage.AbstractC1109 r4, java.lang.Object r5, defpackage.C0323 r6) {
            r2 = this;
            ᲇᛵᲁᛷ r4 = r2.f5034
            java.util.List r4 = r4.f8852
            boolean r0 = r2.m3568(r3, r5, r6)
            if (r0 != 0) goto Lb
            goto L39
        Lb:
            int r0 = r4.size()
            r1 = 1
            if (r0 != r1) goto L21
            r0 = 0
            java.lang.Object r4 = r4.get(r0)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.m3198(r4, r3, r5, r6)
            return
        L21:
            java.util.Iterator r4 = r4.iterator()
        L25:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L39
            java.lang.Object r0 = r4.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2.m3198(r0, r3, r5, r6)
            goto L25
        L39:
            return
    }

    @Override // defpackage.AbstractC1804
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final java.lang.String mo789() {
            r0 = this;
            ᲇᛵᲁᛷ r0 = r0.f5034
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // defpackage.AbstractC1804
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public final boolean mo790() {
            r1 = this;
            ᲇᛵᲁᛷ r1 = r1.f5034
            java.util.List r1 = r1.f8852
            int r1 = r1.size()
            r0 = 1
            if (r1 != r0) goto Lc
            return r0
        Lc:
            r1 = 0
            return r1
    }
}
