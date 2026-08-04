package yyds;

/* JADX INFO: renamed from: yyds.ᛴᲇᛴᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0974 extends AbstractC1754 implements InterfaceC2247 {
    public AbstractC0974() {
        super(C0135.f836);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC2408.m4457(this);
    }

    /* JADX INFO: renamed from: ᛲᛱᲁᛳ, reason: contains not printable characters */
    public AbstractC0974 mo2116(int i) {
        AbstractC0319.m983(i);
        return new C1134(this, i);
    }

    @Override // yyds.AbstractC1754, yyds.InterfaceC2213
    /* JADX INFO: renamed from: ᛳᲁᲁᲇ */
    public final InterfaceC2213 mo421(InterfaceC2289 interfaceC2289) {
        if (!(interfaceC2289 instanceof AbstractC2253)) {
            return C0135.f836 == interfaceC2289 ? C2586.f12764 : this;
        }
        if (this.f8826 != ((AbstractC2253) interfaceC2289)) {
            return this;
        }
        throw null;
    }

    @Override // yyds.AbstractC1754, yyds.InterfaceC2213
    /* JADX INFO: renamed from: ᛷᛸᲇᛶ */
    public final InterfaceC2247 mo423(InterfaceC2289 interfaceC2289) {
        if (!(interfaceC2289 instanceof AbstractC2253)) {
            if (C0135.f836 == interfaceC2289) {
                return this;
            }
            return null;
        }
        if (this.f8826 != ((AbstractC2253) interfaceC2289)) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ᛷᲇᛲᛱ */
    public abstract void mo1251(InterfaceC2213 interfaceC2213, Runnable runnable);

    /* JADX INFO: renamed from: ᲈᛷᲈᛶ, reason: contains not printable characters */
    public boolean mo2117(InterfaceC2213 interfaceC2213) {
        return !(this instanceof AbstractC1742);
    }
}
