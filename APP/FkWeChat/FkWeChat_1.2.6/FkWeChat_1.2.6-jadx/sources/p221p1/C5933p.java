package p221p1;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1061t;
import p135j2.InterfaceC3527h;
import p165l1.InterfaceC4499e;
import p166l2.AbstractC4546h0;
import p166l2.AbstractC4590u;
import p166l2.AbstractC4606z0;
import p250r1.C6461k;
import p265s1.AbstractC7133r1;
import p334x1.AbstractC9307c;

/* JADX INFO: renamed from: p1.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u00069"}, m16758d2 = {"Lp1/p;", "Ll2/z0;", "Lp1/r;", "Lx1/c;", "painter", _UrlKt.FRAGMENT_ENCODE_SET, "sizeToIntrinsics", "Ll1/e;", "alignment", "Lj2/h;", "contentScale", _UrlKt.FRAGMENT_ENCODE_SET, "alpha", "Ls1/r1;", "colorFilter", "<init>", "(Lx1/c;ZLl1/e;Lj2/h;FLs1/r1;)V", "m", "()Lp1/r;", "node", "Ll8/i0;", "n", "(Lp1/r;)V", _UrlKt.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", _UrlKt.FRAGMENT_ENCODE_SET, "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lx1/c;", "getPainter", "()Lx1/c;", "c", "Z", "getSizeToIntrinsics", "()Z", "d", "Ll1/e;", "getAlignment", "()Ll1/e;", "e", "Lj2/h;", "getContentScale", "()Lj2/h;", "f", "F", "getAlpha", "()F", "g", "Ls1/r1;", "getColorFilter", "()Ls1/r1;", "ui"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
final /* data */ class C5933p extends AbstractC4606z0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final AbstractC9307c painter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean sizeToIntrinsics;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final InterfaceC4499e alignment;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final InterfaceC3527h contentScale;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final float alpha;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final AbstractC7133r1 colorFilter;

    public C5933p(AbstractC9307c abstractC9307c, boolean z10, InterfaceC4499e interfaceC4499e, InterfaceC3527h interfaceC3527h, float f10, AbstractC7133r1 abstractC7133r1) {
        this.painter = abstractC9307c;
        this.sizeToIntrinsics = z10;
        this.alignment = interfaceC4499e;
        this.contentScale = interfaceC3527h;
        this.alpha = f10;
        this.colorFilter = abstractC7133r1;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C5933p)) {
            return false;
        }
        C5933p c5933p = (C5933p) other;
        return AbstractC1061t.m3842c(this.painter, c5933p.painter) && this.sizeToIntrinsics == c5933p.sizeToIntrinsics && AbstractC1061t.m3842c(this.alignment, c5933p.alignment) && AbstractC1061t.m3842c(this.contentScale, c5933p.contentScale) && Float.compare(this.alpha, c5933p.alpha) == 0 && AbstractC1061t.m3842c(this.colorFilter, c5933p.colorFilter);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.painter.hashCode() * 31) + Boolean.hashCode(this.sizeToIntrinsics)) * 31) + this.alignment.hashCode()) * 31) + this.contentScale.hashCode()) * 31) + Float.hashCode(this.alpha)) * 31;
        AbstractC7133r1 abstractC7133r1 = this.colorFilter;
        return iHashCode + (abstractC7133r1 == null ? 0 : abstractC7133r1.hashCode());
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C5935r mo1191j() {
        return new C5935r(this.painter, this.sizeToIntrinsics, this.alignment, this.contentScale, this.alpha, this.colorFilter);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1192k(C5935r node) {
        boolean zM23857I2 = node.m23857I2();
        boolean z10 = this.sizeToIntrinsics;
        boolean z11 = zM23857I2 != z10 || (z10 && !C6461k.m25618f(node.m23856H2().mo36269h(), this.painter.mo36269h()));
        node.m23864P2(this.painter);
        node.m23865Q2(this.sizeToIntrinsics);
        node.m23862N2(this.alignment);
        node.m23863O2(this.contentScale);
        node.m23866e(this.alpha);
        node.m23867f(this.colorFilter);
        if (z11) {
            AbstractC4546h0.m17808b(node);
        }
        AbstractC4590u.m18259a(node);
    }

    public String toString() {
        return "PainterElement(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", contentScale=" + this.contentScale + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }
}
