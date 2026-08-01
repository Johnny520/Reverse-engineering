package defpackage;

/* JADX INFO: renamed from: ᛳᛲᲇᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0432 extends defpackage.AbstractC0278 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.util.Iterator f2127;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final defpackage.C0495 f2128;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final java.util.HashSet f2129;

    public C0432(java.util.Iterator r1, defpackage.C0495 r2) {
            r0 = this;
            r0.<init>()
            r0.f2127 = r1
            r0.f2128 = r2
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0.f2129 = r1
            return
    }

    @Override // defpackage.AbstractC0278
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final void mo912() {
            r3 = this;
        L0:
            java.util.Iterator r0 = r3.f2127
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r0 = r0.next()
            ᛳᛶᛱᛷ r1 = r3.f2128
            java.lang.Object r1 = r1.mo617(r0)
            java.util.HashSet r2 = r3.f2129
            boolean r1 = r2.add(r1)
            if (r1 == 0) goto L0
            r3.f1553 = r0
            r0 = 1
            r3.f1554 = r0
            return
        L20:
            r0 = 2
            r3.f1554 = r0
            return
    }
}
