package yyds;

/* JADX INFO: renamed from: yyds.ᛱᛵᲈᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C0136 extends C1397 {

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public int f841;

    public C0136(AbstractC1413 abstractC1413) {
        super(abstractC1413);
        if (abstractC1413 instanceof C1833) {
            this.f6514 = 2;
        } else {
            this.f6514 = 3;
        }
    }

    @Override // yyds.C1397
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void mo612(int i) {
        if (this.f6520) {
            return;
        }
        this.f6520 = true;
        this.f6517 = i;
        for (InterfaceC2299 interfaceC2299 : this.f6518) {
            interfaceC2299.mo1395(interfaceC2299);
        }
    }
}
