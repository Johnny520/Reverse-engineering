package p189n;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1061t;
import p166l2.AbstractC4606z0;
import p219p.EnumC5898w0;
import p219p.InterfaceC5842e;
import p219p.InterfaceC5859j0;
import p219p.InterfaceC5881q1;
import p248r.InterfaceC6434j;

/* JADX INFO: renamed from: n.h3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010'R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, m16758d2 = {"Ln/h3;", "Ll2/z0;", "Ln/k3;", "Lp/q1;", "state", "Lp/w0;", "orientation", _UrlKt.FRAGMENT_ENCODE_SET, "enabled", "reverseScrolling", "Lp/j0;", "flingBehavior", "Lr/j;", "interactionSource", "Lp/e;", "bringIntoViewSpec", "useLocalOverscrollFactory", "Ln/h2;", "overscrollEffect", "<init>", "(Lp/q1;Lp/w0;ZZLp/j0;Lr/j;Lp/e;ZLn/h2;)V", "m", "()Ln/k3;", "node", "Ll8/i0;", "n", "(Ln/k3;)V", _UrlKt.FRAGMENT_ENCODE_SET, "other", "equals", "(Ljava/lang/Object;)Z", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", "b", "Lp/q1;", "c", "Lp/w0;", "d", "Z", "e", "f", "Lp/j0;", "g", "Lr/j;", "h", "Lp/e;", "i", "j", "Ln/h2;", "foundation_release"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
final class C5226h3 extends AbstractC4606z0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final InterfaceC5881q1 state;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final EnumC5898w0 orientation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean enabled;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean reverseScrolling;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final InterfaceC5859j0 flingBehavior;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final InterfaceC6434j interactionSource;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final InterfaceC5842e bringIntoViewSpec;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final boolean useLocalOverscrollFactory;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final InterfaceC5225h2 overscrollEffect;

    public C5226h3(InterfaceC5881q1 interfaceC5881q1, EnumC5898w0 enumC5898w0, boolean z10, boolean z11, InterfaceC5859j0 interfaceC5859j0, InterfaceC6434j interfaceC6434j, InterfaceC5842e interfaceC5842e, boolean z12, InterfaceC5225h2 interfaceC5225h2) {
        this.state = interfaceC5881q1;
        this.orientation = enumC5898w0;
        this.enabled = z10;
        this.reverseScrolling = z11;
        this.flingBehavior = interfaceC5859j0;
        this.interactionSource = interfaceC6434j;
        this.bringIntoViewSpec = interfaceC5842e;
        this.useLocalOverscrollFactory = z12;
        this.overscrollEffect = interfaceC5225h2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || C5226h3.class != other.getClass()) {
            return false;
        }
        C5226h3 c5226h3 = (C5226h3) other;
        return AbstractC1061t.m3842c(this.state, c5226h3.state) && this.orientation == c5226h3.orientation && this.enabled == c5226h3.enabled && this.reverseScrolling == c5226h3.reverseScrolling && AbstractC1061t.m3842c(this.flingBehavior, c5226h3.flingBehavior) && AbstractC1061t.m3842c(this.interactionSource, c5226h3.interactionSource) && AbstractC1061t.m3842c(this.bringIntoViewSpec, c5226h3.bringIntoViewSpec) && this.useLocalOverscrollFactory == c5226h3.useLocalOverscrollFactory && AbstractC1061t.m3842c(this.overscrollEffect, c5226h3.overscrollEffect);
    }

    public int hashCode() {
        int iHashCode = ((((((this.state.hashCode() * 31) + this.orientation.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.reverseScrolling)) * 31;
        InterfaceC5859j0 interfaceC5859j0 = this.flingBehavior;
        int iHashCode2 = (iHashCode + (interfaceC5859j0 != null ? interfaceC5859j0.hashCode() : 0)) * 31;
        InterfaceC6434j interfaceC6434j = this.interactionSource;
        int iHashCode3 = (iHashCode2 + (interfaceC6434j != null ? interfaceC6434j.hashCode() : 0)) * 31;
        InterfaceC5842e interfaceC5842e = this.bringIntoViewSpec;
        int iHashCode4 = (((iHashCode3 + (interfaceC5842e != null ? interfaceC5842e.hashCode() : 0)) * 31) + Boolean.hashCode(this.useLocalOverscrollFactory)) * 31;
        InterfaceC5225h2 interfaceC5225h2 = this.overscrollEffect;
        return iHashCode4 + (interfaceC5225h2 != null ? interfaceC5225h2.hashCode() : 0);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C5241k3 mo1191j() {
        return new C5241k3(this.state, this.orientation, this.enabled, this.reverseScrolling, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec, this.useLocalOverscrollFactory, this.overscrollEffect);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1192k(C5241k3 node) {
        node.m21471Q2(this.state, this.orientation, this.useLocalOverscrollFactory, this.overscrollEffect, this.enabled, this.reverseScrolling, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec);
    }
}
