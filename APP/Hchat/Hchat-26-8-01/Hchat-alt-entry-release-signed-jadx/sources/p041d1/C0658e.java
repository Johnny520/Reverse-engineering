package p041d1;

import gg.AbstractC1416l;
import p085fg.InterfaceC1231l;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: d1.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0658e extends AbstractC5852n implements InterfaceC0661g {

    /* JADX INFO: renamed from: u */
    public InterfaceC1231l f2032u;

    /* JADX INFO: renamed from: v */
    public EnumC0680z f2033v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041d1.InterfaceC0661g
    /* JADX INFO: renamed from: E */
    public final void mo1835E(EnumC0680z enumC0680z) {
        if (AbstractC1416l.m3825a(this.f2033v, enumC0680z)) {
            return;
        }
        this.f2033v = enumC0680z;
        this.f2032u.invoke(enumC0680z);
    }
}
