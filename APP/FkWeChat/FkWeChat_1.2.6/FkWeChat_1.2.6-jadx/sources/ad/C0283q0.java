package ad;

import p329wc.InterfaceC9218f;
import p375zc.AbstractC9939c;
import p375zc.AbstractC9957l;
import p375zc.C9941d;

/* JADX INFO: renamed from: ad.q0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0283q0 extends AbstractC0245c {

    /* JADX INFO: renamed from: h */
    public final C9941d f689h;

    /* JADX INFO: renamed from: i */
    public final int f690i;

    /* JADX INFO: renamed from: j */
    public int f691j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0283q0(AbstractC9939c abstractC9939c, C9941d c9941d) {
        super(abstractC9939c, c9941d, null, 4, null);
        abstractC9939c.getClass();
        c9941d.getClass();
        this.f689h = c9941d;
        this.f690i = mo693y0().size();
        this.f691j = -1;
    }

    @Override // ad.AbstractC0245c
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public C9941d mo693y0() {
        return this.f689h;
    }

    @Override // p361yc.AbstractC9748q1
    /* JADX INFO: renamed from: e0 */
    public String mo839e0(InterfaceC9218f interfaceC9218f, int i10) {
        interfaceC9218f.getClass();
        return String.valueOf(i10);
    }

    @Override // ad.AbstractC0245c
    /* JADX INFO: renamed from: k0 */
    public AbstractC9957l mo678k0(String str) {
        str.getClass();
        return mo693y0().get(Integer.parseInt(str));
    }

    @Override // p345xc.InterfaceC9485c
    /* JADX INFO: renamed from: v */
    public int mo788v(InterfaceC9218f interfaceC9218f) {
        interfaceC9218f.getClass();
        int i10 = this.f691j;
        if (i10 >= this.f690i - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.f691j = i11;
        return i11;
    }
}
