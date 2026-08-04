package yyds;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: yyds.ᲀᛲᛴᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1941 implements InterfaceC1971 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C1424 f9761;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ ComponentCallbacks2C2272 f9762;

    public C1941(ComponentCallbacks2C2272 componentCallbacks2C2272, C1424 c1424) {
        this.f9762 = componentCallbacks2C2272;
        this.f9761 = c1424;
    }

    @Override // yyds.InterfaceC1971
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void mo3740(boolean z) {
        if (z) {
            synchronized (this.f9762) {
                C1424 c1424 = this.f9761;
                for (InterfaceC1823 interfaceC1823 : AbstractC0181.m741((Set) c1424.f6732)) {
                    if (!interfaceC1823.mo450() && !interfaceC1823.mo457()) {
                        interfaceC1823.clear();
                        if (c1424.f6735) {
                            ((HashSet) c1424.f6734).add(interfaceC1823);
                        } else {
                            interfaceC1823.mo454();
                        }
                    }
                }
            }
        }
    }
}
