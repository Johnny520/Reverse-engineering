package ad;

import java.util.List;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5109u0;
import p329wc.InterfaceC9218f;
import p375zc.AbstractC9939c;
import p375zc.AbstractC9957l;
import p375zc.AbstractC9961n;
import p375zc.C9950h0;

/* JADX INFO: renamed from: ad.s0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0287s0 extends C0279o0 {

    /* JADX INFO: renamed from: l */
    public final C9950h0 f693l;

    /* JADX INFO: renamed from: m */
    public final List f694m;

    /* JADX INFO: renamed from: n */
    public final int f695n;

    /* JADX INFO: renamed from: o */
    public int f696o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0287s0(AbstractC9939c abstractC9939c, C9950h0 c9950h0) {
        super(abstractC9939c, c9950h0, null, null, 12, null);
        abstractC9939c.getClass();
        c9950h0.getClass();
        this.f693l = c9950h0;
        List listM20554X0 = AbstractC5081g0.m20554X0(mo693y0().keySet());
        this.f694m = listM20554X0;
        this.f695n = listM20554X0.size() * 2;
        this.f696o = -1;
    }

    @Override // ad.C0279o0, ad.AbstractC0245c
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public C9950h0 mo693y0() {
        return this.f693l;
    }

    @Override // ad.C0279o0, ad.AbstractC0245c, p345xc.InterfaceC9485c
    /* JADX INFO: renamed from: d */
    public void mo675d(InterfaceC9218f interfaceC9218f) {
        interfaceC9218f.getClass();
    }

    @Override // ad.C0279o0, p361yc.AbstractC9748q1
    /* JADX INFO: renamed from: e0 */
    public String mo839e0(InterfaceC9218f interfaceC9218f, int i10) {
        interfaceC9218f.getClass();
        return (String) this.f694m.get(i10 / 2);
    }

    @Override // ad.C0279o0, ad.AbstractC0245c
    /* JADX INFO: renamed from: k0 */
    public AbstractC9957l mo678k0(String str) {
        str.getClass();
        return this.f696o % 2 == 0 ? AbstractC9961n.m38576c(str) : (AbstractC9957l) AbstractC5109u0.m20769j(mo693y0(), str);
    }

    @Override // ad.C0279o0, p345xc.InterfaceC9485c
    /* JADX INFO: renamed from: v */
    public int mo788v(InterfaceC9218f interfaceC9218f) {
        interfaceC9218f.getClass();
        int i10 = this.f696o;
        if (i10 >= this.f695n - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.f696o = i11;
        return i11;
    }
}
