package yyds;

/* JADX INFO: renamed from: yyds.ᛸᛱᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1706 extends AbstractC1320 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f8643;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ C2592 f8644;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public /* synthetic */ Object f8645;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1706(C2592 c2592, AbstractC1320 abstractC1320) {
        super(abstractC1320);
        this.f8644 = c2592;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final Object mo474(Object obj) {
        this.f8645 = obj;
        this.f8643 |= Integer.MIN_VALUE;
        Object objM4669 = this.f8644.m4669(null, this);
        return objM4669 == EnumC1765.f8858 ? objM4669 : new C2248(objM4669);
    }
}
