package yyds;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᛴᲇᛱᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0969 extends AbstractC1418 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final Iterator f4450;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final HashSet f4451 = new HashSet();

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final InterfaceC1549 f4452;

    public C0969(Iterator it, InterfaceC1549 interfaceC1549) {
        this.f4450 = it;
        this.f4452 = interfaceC1549;
    }

    @Override // yyds.AbstractC1418
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final void mo573() {
        Object next;
        do {
            Iterator it = this.f4450;
            if (!it.hasNext()) {
                this.f6703 = 2;
                return;
            } else {
                next = it.next();
            }
        } while (!this.f4451.add(this.f4452.mo371(next)));
        this.f6704 = next;
        this.f6703 = 1;
    }
}
