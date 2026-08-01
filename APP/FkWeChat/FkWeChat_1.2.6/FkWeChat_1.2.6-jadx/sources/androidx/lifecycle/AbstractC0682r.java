package androidx.lifecycle;

import androidx.lifecycle.AbstractC0668k;

/* JADX INFO: renamed from: androidx.lifecycle.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0682r {
    /* JADX INFO: renamed from: a */
    public static final void m2680a(InterfaceC0676o interfaceC0676o, AbstractC0668k.b bVar, AbstractC0668k.b bVar2) {
        bVar.getClass();
        bVar2.getClass();
        if (bVar == AbstractC0668k.b.f1969r && bVar2 == AbstractC0668k.b.f1968q) {
            throw new IllegalStateException(("State must be at least '" + AbstractC0668k.b.f1970s + "' to be moved to '" + bVar2 + "' in component " + interfaceC0676o).toString());
        }
        AbstractC0668k.b bVar3 = AbstractC0668k.b.f1968q;
        if (bVar != bVar3 || bVar == bVar2) {
            return;
        }
        throw new IllegalStateException(("State is '" + bVar3 + "' and cannot be moved to `" + bVar2 + "` in component " + interfaceC0676o).toString());
    }
}
