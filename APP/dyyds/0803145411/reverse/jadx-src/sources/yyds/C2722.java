package yyds;

import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᲈᛸᲀᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2722 implements InterfaceC1240 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f13372;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final InterfaceC1549 f13373;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Object f13374;

    public /* synthetic */ C2722(Object obj, InterfaceC1549 interfaceC1549, int i) {
        this.f13372 = i;
        this.f13374 = obj;
        this.f13373 = interfaceC1549;
    }

    @Override // yyds.InterfaceC1240
    public final Iterator iterator() {
        switch (this.f13372) {
            case 0:
                return new C0969(new C1119((C0497) this.f13374), this.f13373);
            case 1:
                return new C0025(this);
            default:
                return new C1119(this);
        }
    }
}
