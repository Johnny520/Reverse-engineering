package yyds;

import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᛷᲈᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1694 extends AbstractC0476 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ C2505 f8624;

    public C1694(C2505 c2505) {
        this.f8624 = c2505;
    }

    @Override // yyds.AbstractC0476
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public final void mo1333(Throwable th) {
        ((C0331) this.f8624.f12332).m1006(th);
    }

    @Override // yyds.AbstractC0476
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public final void mo1334(C0299 c0299) {
        C2505 c2505 = this.f8624;
        c2505.f12334 = c0299;
        c2505.f12333 = new C2133((C0299) c2505.f12334, new C1985(13), ((C0331) c2505.f12332).f1746);
        C0331 c0331 = (C0331) c2505.f12332;
        ArrayList arrayList = new ArrayList();
        c0331.f1748.writeLock().lock();
        try {
            c0331.f1751 = 1;
            arrayList.addAll(c0331.f1749);
            c0331.f1749.clear();
            c0331.f1748.writeLock().unlock();
            c0331.f1753.post(new RunnableC1421(arrayList, c0331.f1751, null));
        } catch (Throwable th) {
            c0331.f1748.writeLock().unlock();
            throw th;
        }
    }
}
