package yyds;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᲇᛷᲀᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2487 implements InterfaceC1971 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C1424 f12286;

    public C2487(C1424 c1424) {
        this.f12286 = c1424;
    }

    @Override // yyds.InterfaceC1971
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final void mo3740(boolean z) {
        ArrayList arrayList;
        AbstractC0181.m744();
        synchronized (this.f12286) {
            arrayList = new ArrayList((HashSet) this.f12286.f6734);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC1971) it.next()).mo3740(z);
        }
    }
}
