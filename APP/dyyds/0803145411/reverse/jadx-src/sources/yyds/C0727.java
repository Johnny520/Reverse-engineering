package yyds;

/* JADX INFO: renamed from: yyds.ᛳᲇᛸᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0727 extends AbstractC2720 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2720 f3394;

    public C0727(AbstractC2720 abstractC2720) {
        this.f3394 = abstractC2720;
    }

    public final String toString() {
        return "NullSafeTypeAdapter[" + this.f3394 + "]";
    }

    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final Object mo484(C1942 c1942) {
        if (c1942.m3744() != 9) {
            return this.f3394.mo484(c1942);
        }
        c1942.m3767();
        return null;
    }

    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo485(C1405 c1405, Object obj) {
        if (obj == null) {
            c1405.m2857();
        } else {
            this.f3394.mo485(c1405, obj);
        }
    }
}
