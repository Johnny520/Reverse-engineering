package defpackage;

/* JADX INFO: renamed from: ᲁᛲᲇᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1824 extends defpackage.C1418 {

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final java.util.HashMap f7957;

    public C1824() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f7957 = r0
            return
    }

    @Override // defpackage.C1418
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final defpackage.C0672 mo2601(java.lang.Object r1) {
            r0 = this;
            java.util.HashMap r0 = r0.f7957
            java.lang.Object r0 = r0.get(r1)
            ᛴᛵᛳ r0 = (defpackage.C0672) r0
            return r0
    }

    @Override // defpackage.C1418
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final java.lang.Object mo2602(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = super.mo2602(r2)
            java.util.HashMap r1 = r1.f7957
            r1.remove(r2)
            return r0
    }
}
