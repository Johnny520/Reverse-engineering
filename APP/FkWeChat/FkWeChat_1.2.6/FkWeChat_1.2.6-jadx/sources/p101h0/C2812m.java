package p101h0;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0184l;
import p166l2.AbstractC4606z0;

/* JADX INFO: renamed from: h0.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Be\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u001e\u0010\t\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0005\u0012\u001e\u0010\n\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0005\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR,\u0010\t\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR,\u0010\n\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\"\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001f¨\u0006\""}, m16758d2 = {"Lh0/m;", "Ll2/z0;", "Lh0/p;", "Lh0/q;", "requester", "Lkotlin/Function1;", "Lp8/f;", "Ll8/i0;", _UrlKt.FRAGMENT_ENCODE_SET, "onShow", "onHide", "Lj2/w;", "Lr1/g;", "computeContentBounds", "<init>", "(Lh0/q;La9/l;La9/l;La9/l;)V", "m", "()Lh0/p;", "node", "n", "(Lh0/p;)V", "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", "b", "Lh0/q;", "c", "La9/l;", "d", "e", "foundation_release"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
final class C2812m extends AbstractC4606z0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final AbstractC2816q requester;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final InterfaceC0184l onShow;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final InterfaceC0184l onHide;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final InterfaceC0184l computeContentBounds;

    public C2812m(AbstractC2816q abstractC2816q, InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2, InterfaceC0184l interfaceC0184l3) {
        this.requester = abstractC2816q;
        this.onShow = interfaceC0184l;
        this.onHide = interfaceC0184l2;
        this.computeContentBounds = interfaceC0184l3;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C2812m)) {
            return false;
        }
        C2812m c2812m = (C2812m) other;
        return this.requester == c2812m.requester && this.onShow == c2812m.onShow && this.onHide == c2812m.onHide && this.computeContentBounds == c2812m.computeContentBounds;
    }

    public int hashCode() {
        int iHashCode = this.requester.hashCode() * 31;
        InterfaceC0184l interfaceC0184l = this.onShow;
        int iHashCode2 = (iHashCode + (interfaceC0184l != null ? interfaceC0184l.hashCode() : 0)) * 31;
        InterfaceC0184l interfaceC0184l2 = this.onHide;
        return ((iHashCode2 + (interfaceC0184l2 != null ? interfaceC0184l2.hashCode() : 0)) * 31) + this.computeContentBounds.hashCode();
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C2815p mo1191j() {
        return new C2815p(this.requester, this.onShow, this.onHide, this.computeContentBounds);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1192k(C2815p node) {
        node.m10021Q2().m10031d(null);
        node.m10026V2(this.requester);
        node.m10021Q2().m10031d(node);
        node.m10025U2(this.onShow);
        node.m10024T2(this.onHide);
        node.m10023S2(this.computeContentBounds);
    }
}
