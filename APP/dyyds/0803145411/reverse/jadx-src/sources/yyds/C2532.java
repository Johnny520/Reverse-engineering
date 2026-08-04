package yyds;

/* JADX INFO: renamed from: yyds.ᲇᲁᛸᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2532 extends AbstractC1320 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f12469;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ C2592 f12470;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public /* synthetic */ Object f12471;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2532(C2592 c2592, AbstractC1320 abstractC1320) {
        super(abstractC1320);
        this.f12470 = c2592;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final Object mo474(Object obj) throws Throwable {
        this.f12471 = obj;
        this.f12469 |= Integer.MIN_VALUE;
        Object objM4673 = this.f12470.m4673(null, this);
        return objM4673 == EnumC1765.f8858 ? objM4673 : new C2248(objM4673);
    }
}
