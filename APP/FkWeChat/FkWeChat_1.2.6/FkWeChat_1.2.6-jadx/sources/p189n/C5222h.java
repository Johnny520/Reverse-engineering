package p189n;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p166l2.AbstractC4590u;
import p166l2.AbstractC4606z0;
import p265s1.AbstractC7078g1;
import p265s1.C7128q1;
import p265s1.InterfaceC7090i3;

/* JADX INFO: renamed from: n.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, m16758d2 = {"Ln/h;", "Ll2/z0;", "Ln/k;", "Ls1/q1;", "color", "Ls1/g1;", "brush", _UrlKt.FRAGMENT_ENCODE_SET, "alpha", "Ls1/i3;", "shape", "Lkotlin/Function1;", "Lm2/g2;", "Ll8/i0;", "inspectorInfo", "<init>", "(JLs1/g1;FLs1/i3;La9/l;Lb9/k;)V", "m", "()Ln/k;", "node", "n", "(Ln/k;)V", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", _UrlKt.FRAGMENT_ENCODE_SET, "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", "b", "J", "c", "Ls1/g1;", "d", "F", "e", "Ls1/i3;", "f", "La9/l;", "foundation_release"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
final class C5222h extends AbstractC4606z0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final long color;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final AbstractC7078g1 brush;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final float alpha;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final InterfaceC7090i3 shape;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final InterfaceC0184l inspectorInfo;

    public /* synthetic */ C5222h(long j10, AbstractC7078g1 abstractC7078g1, float f10, InterfaceC7090i3 interfaceC7090i3, InterfaceC0184l interfaceC0184l, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? C7128q1.f23644b.m28147h() : j10, (i10 & 2) != 0 ? null : abstractC7078g1, f10, interfaceC7090i3, interfaceC0184l, null);
    }

    public boolean equals(Object other) {
        C5222h c5222h = other instanceof C5222h ? (C5222h) other : null;
        return c5222h != null && C7128q1.m28131q(this.color, c5222h.color) && AbstractC1061t.m3842c(this.brush, c5222h.brush) && this.alpha == c5222h.alpha && AbstractC1061t.m3842c(this.shape, c5222h.shape);
    }

    public int hashCode() {
        int iM28137w = C7128q1.m28137w(this.color) * 31;
        AbstractC7078g1 abstractC7078g1 = this.brush;
        return ((((iM28137w + (abstractC7078g1 != null ? abstractC7078g1.hashCode() : 0)) * 31) + Float.hashCode(this.alpha)) * 31) + this.shape.hashCode();
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C5237k mo1191j() {
        return new C5237k(this.color, this.brush, this.alpha, this.shape, null);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1192k(C5237k node) {
        node.m21441L2(this.color);
        node.m21440K2(this.brush);
        node.m21442e(this.alpha);
        node.m21443r1(this.shape);
        AbstractC4590u.m18259a(node);
    }

    public /* synthetic */ C5222h(long j10, AbstractC7078g1 abstractC7078g1, float f10, InterfaceC7090i3 interfaceC7090i3, InterfaceC0184l interfaceC0184l, AbstractC1043k abstractC1043k) {
        this(j10, abstractC7078g1, f10, interfaceC7090i3, interfaceC0184l);
    }

    public C5222h(long j10, AbstractC7078g1 abstractC7078g1, float f10, InterfaceC7090i3 interfaceC7090i3, InterfaceC0184l interfaceC0184l) {
        this.color = j10;
        this.brush = abstractC7078g1;
        this.alpha = f10;
        this.shape = interfaceC7090i3;
        this.inspectorInfo = interfaceC0184l;
    }
}
