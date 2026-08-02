package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zs1 extends sm0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ at1 f14087i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zs1(at1 at1Var, InterfaceC0549on interfaceC0549on) {
        super(interfaceC0549on);
        this.f14087i = at1Var;
    }

    @Override // p000.ht2
    /* JADX INFO: renamed from: n */
    public final long mo891n(C0209fn c0209fn, long j) throws IOException {
        try {
            c0209fn.getClass();
            return this.f10190h.mo891n(c0209fn, 8192L);
        } catch (IOException e) {
            this.f14087i.f385l = e;
            throw e;
        }
    }
}
