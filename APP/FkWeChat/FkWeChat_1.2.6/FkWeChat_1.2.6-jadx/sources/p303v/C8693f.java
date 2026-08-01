package p303v;

import androidx.compose.runtime.AbstractC0570q4;
import androidx.compose.runtime.InterfaceC0498g2;
import p165l1.InterfaceC4507m;

/* JADX INFO: renamed from: v.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8693f implements InterfaceC8691e {

    /* JADX INFO: renamed from: a */
    public InterfaceC0498g2 f28859a = AbstractC0570q4.m2141a(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: b */
    public InterfaceC0498g2 f28860b = AbstractC0570q4.m2141a(Integer.MAX_VALUE);

    @Override // p303v.InterfaceC8691e
    /* JADX INFO: renamed from: a */
    public InterfaceC4507m mo33385a(InterfaceC4507m interfaceC4507m, float f10) {
        return interfaceC4507m.mo17445i(new C8732y0(f10, this.f28859a, this.f28860b, "fillParentMaxSize"));
    }

    @Override // p303v.InterfaceC8691e
    /* JADX INFO: renamed from: b */
    public InterfaceC4507m mo33386b(InterfaceC4507m interfaceC4507m, float f10) {
        return interfaceC4507m.mo17445i(new C8732y0(f10, this.f28859a, null, "fillParentMaxWidth", 4, null));
    }

    /* JADX INFO: renamed from: e */
    public final void m33407e(int i10, int i11) {
        this.f28859a.mo1687j(i10);
        this.f28860b.mo1687j(i11);
    }
}
