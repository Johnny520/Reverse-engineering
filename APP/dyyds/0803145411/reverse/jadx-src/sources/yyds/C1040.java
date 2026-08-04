package yyds;

/* JADX INFO: renamed from: yyds.ᛵᛲᛶᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1040 extends AbstractC1320 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f4736;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ C2592 f4737;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public /* synthetic */ Object f4738;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1040(C2592 c2592, AbstractC1320 abstractC1320) {
        super(abstractC1320);
        this.f4737 = c2592;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final Object mo474(Object obj) {
        this.f4738 = obj;
        this.f4736 |= Integer.MIN_VALUE;
        Object objM4668 = this.f4737.m4668(null, this);
        return objM4668 == EnumC1765.f8858 ? objM4668 : new C2248(objM4668);
    }
}
