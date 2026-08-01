package p198m0;

import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: m0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2574e extends AbstractC2206o implements InterfaceC2576g {

    /* JADX INFO: renamed from: r */
    public InterfaceC1601c f8208r;

    /* JADX INFO: renamed from: s */
    public EnumC2594y f8209s;

    @Override // p198m0.InterfaceC2576g
    /* JADX INFO: renamed from: W */
    public final void mo942W(EnumC2594y enumC2594y) {
        if (AbstractC1665j.m2981a(this.f8209s, enumC2594y)) {
            return;
        }
        this.f8209s = enumC2594y;
        this.f8208r.mo1h(enumC2594y);
    }
}
