package yyds;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᲈᛵᛱᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2650 implements InterfaceC1021 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Set f13048 = Collections.newSetFromMap(new WeakHashMap());

    @Override // yyds.InterfaceC1021
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ */
    public final void mo1202() {
        Iterator it = AbstractC0181.m741(this.f13048).iterator();
        while (it.hasNext()) {
            ((InterfaceC2156) it.next()).mo1202();
        }
    }

    @Override // yyds.InterfaceC1021
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public final void mo1203() {
        Iterator it = AbstractC0181.m741(this.f13048).iterator();
        while (it.hasNext()) {
            ((InterfaceC2156) it.next()).mo1203();
        }
    }

    @Override // yyds.InterfaceC1021
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo1204() {
        Iterator it = AbstractC0181.m741(this.f13048).iterator();
        while (it.hasNext()) {
            ((InterfaceC2156) it.next()).mo1204();
        }
    }
}
