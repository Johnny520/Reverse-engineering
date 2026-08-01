package p189n;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p121i3.C3179i;
import p166l2.AbstractC4606z0;
import p265s1.AbstractC7078g1;
import p265s1.InterfaceC7090i3;

/* JADX INFO: renamed from: n.v */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, m16758d2 = {"Ln/v;", "Ll2/z0;", "Ln/u;", "Li3/i;", "width", "Ls1/g1;", "brush", "Ls1/i3;", "shape", "<init>", "(FLs1/g1;Ls1/i3;Lb9/k;)V", "m", "()Ln/u;", "node", "Ll8/i0;", "n", "(Ln/u;)V", _UrlKt.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", _UrlKt.FRAGMENT_ENCODE_SET, "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", "b", "F", "getWidth-D9Ej5fM", "()F", "c", "Ls1/g1;", "getBrush", "()Ls1/g1;", "d", "Ls1/i3;", "getShape", "()Ls1/i3;", "foundation_release"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
public final /* data */ class C5290v extends AbstractC4606z0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final float width;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final AbstractC7078g1 brush;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final InterfaceC7090i3 shape;

    public C5290v(float f10, AbstractC7078g1 abstractC7078g1, InterfaceC7090i3 interfaceC7090i3) {
        this.width = f10;
        this.brush = abstractC7078g1;
        this.shape = interfaceC7090i3;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C5290v)) {
            return false;
        }
        C5290v c5290v = (C5290v) other;
        return C3179i.m12005m(this.width, c5290v.width) && AbstractC1061t.m3842c(this.brush, c5290v.brush) && AbstractC1061t.m3842c(this.shape, c5290v.shape);
    }

    public int hashCode() {
        return (((C3179i.m12006n(this.width) * 31) + this.brush.hashCode()) * 31) + this.shape.hashCode();
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C5286u mo1191j() {
        return new C5286u(this.width, this.brush, this.shape, null);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1192k(C5286u node) {
        node.m21560U2(this.width);
        node.m21559T2(this.brush);
        node.m21561r1(this.shape);
    }

    public String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) C3179i.m12007p(this.width)) + ", brush=" + this.brush + ", shape=" + this.shape + ')';
    }

    public /* synthetic */ C5290v(float f10, AbstractC7078g1 abstractC7078g1, InterfaceC7090i3 interfaceC7090i3, AbstractC1043k abstractC1043k) {
        this(f10, abstractC7078g1, interfaceC7090i3);
    }
}
