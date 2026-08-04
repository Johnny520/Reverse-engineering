package yyds;

/* JADX INFO: renamed from: yyds.ᛷᛶᛴᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C1574 extends AbstractC1955 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public AbstractC2720 f7978 = null;

    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final Object mo484(C1942 c1942) {
        AbstractC2720 abstractC2720 = this.f7978;
        if (abstractC2720 != null) {
            return abstractC2720.mo484(c1942);
        }
        C0188.m800("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }

    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo485(C1405 c1405, Object obj) {
        AbstractC2720 abstractC2720 = this.f7978;
        if (abstractC2720 != null) {
            abstractC2720.mo485(c1405, obj);
        } else {
            C0188.m800("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
    }

    @Override // yyds.AbstractC1955
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final AbstractC2720 mo3217() {
        AbstractC2720 abstractC2720 = this.f7978;
        if (abstractC2720 != null) {
            return abstractC2720;
        }
        C0188.m800("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }
}
