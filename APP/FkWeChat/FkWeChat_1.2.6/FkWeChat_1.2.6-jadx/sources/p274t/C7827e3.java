package p274t;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p121i3.C3179i;
import p166l2.AbstractC4606z0;

/* JADX INFO: renamed from: t.e3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, m16758d2 = {"Lt/e3;", "Ll2/z0;", "Lt/h3;", "Li3/i;", "minWidth", "minHeight", "maxWidth", "maxHeight", _UrlKt.FRAGMENT_ENCODE_SET, "enforceIncoming", "Lkotlin/Function1;", "Lm2/g2;", "Ll8/i0;", "inspectorInfo", "<init>", "(FFFFZLa9/l;Lb9/k;)V", "m", "()Lt/h3;", "node", "n", "(Lt/h3;)V", _UrlKt.FRAGMENT_ENCODE_SET, "other", "equals", "(Ljava/lang/Object;)Z", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", "b", "F", "c", "d", "e", "f", "Z", "g", "La9/l;", "foundation-layout"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
final class C7827e3 extends AbstractC4606z0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final float minWidth;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final float minHeight;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final float maxWidth;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final float maxHeight;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final boolean enforceIncoming;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final InterfaceC0184l inspectorInfo;

    public /* synthetic */ C7827e3(float f10, float f11, float f12, float f13, boolean z10, InterfaceC0184l interfaceC0184l, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? C3179i.f8458r.m12012c() : f10, (i10 & 2) != 0 ? C3179i.f8458r.m12012c() : f11, (i10 & 4) != 0 ? C3179i.f8458r.m12012c() : f12, (i10 & 8) != 0 ? C3179i.f8458r.m12012c() : f13, z10, interfaceC0184l, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C7827e3)) {
            return false;
        }
        C7827e3 c7827e3 = (C7827e3) other;
        return C3179i.m12005m(this.minWidth, c7827e3.minWidth) && C3179i.m12005m(this.minHeight, c7827e3.minHeight) && C3179i.m12005m(this.maxWidth, c7827e3.maxWidth) && C3179i.m12005m(this.maxHeight, c7827e3.maxHeight) && this.enforceIncoming == c7827e3.enforceIncoming;
    }

    public int hashCode() {
        return (((((((C3179i.m12006n(this.minWidth) * 31) + C3179i.m12006n(this.minHeight)) * 31) + C3179i.m12006n(this.maxWidth)) * 31) + C3179i.m12006n(this.maxHeight)) * 31) + Boolean.hashCode(this.enforceIncoming);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C7843h3 mo1191j() {
        return new C7843h3(this.minWidth, this.minHeight, this.maxWidth, this.maxHeight, this.enforceIncoming, null);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1192k(C7843h3 node) {
        node.m30381M2(this.minWidth);
        node.m30380L2(this.minHeight);
        node.m30379K2(this.maxWidth);
        node.m30378J2(this.maxHeight);
        node.m30377I2(this.enforceIncoming);
    }

    public /* synthetic */ C7827e3(float f10, float f11, float f12, float f13, boolean z10, InterfaceC0184l interfaceC0184l, AbstractC1043k abstractC1043k) {
        this(f10, f11, f12, f13, z10, interfaceC0184l);
    }

    public C7827e3(float f10, float f11, float f12, float f13, boolean z10, InterfaceC0184l interfaceC0184l) {
        this.minWidth = f10;
        this.minHeight = f11;
        this.maxWidth = f12;
        this.maxHeight = f13;
        this.enforceIncoming = z10;
        this.inspectorInfo = interfaceC0184l;
    }
}
