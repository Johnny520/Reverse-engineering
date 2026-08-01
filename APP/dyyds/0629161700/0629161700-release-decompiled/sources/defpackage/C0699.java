package defpackage;

/* JADX INFO: renamed from: ᛴᛶᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0699 extends defpackage.AbstractC0758 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.AbstractC0758 f3349;

    public C0699(defpackage.AbstractC0758 r1) {
            r0 = this;
            r0.<init>()
            r0.f3349 = r1
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "NullSafeTypeAdapter["
            r0.<init>(r1)
            ᛴᲀᲈᛴ r2 = r2.f3349
            r0.append(r2)
            java.lang.String r2 = "]"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo561(defpackage.C0353 r1, java.lang.Object r2) {
            r0 = this;
            if (r2 != 0) goto L6
            r1.m1067()
            return
        L6:
            ᛴᲀᲈᛴ r0 = r0.f3349
            r0.mo561(r1, r2)
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final java.lang.Object mo562(defpackage.C1103 r3) {
            r2 = this;
            int r0 = r3.m2090()
            r1 = 9
            if (r0 != r1) goto Ld
            r3.m2108()
            r2 = 0
            return r2
        Ld:
            ᛴᲀᲈᛴ r2 = r2.f3349
            java.lang.Object r2 = r2.mo562(r3)
            return r2
    }
}
