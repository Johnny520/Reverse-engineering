package p189n;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p121i3.C3179i;
import p121i3.C3182l;
import p166l2.AbstractC4606z0;

/* JADX INFO: renamed from: n.t1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u008f\u0001\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010)R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010)R\u0014\u0010\u0013\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010+R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, m16758d2 = {"Ln/t1;", "Ll2/z0;", "Ln/y1;", "Lkotlin/Function1;", "Li3/e;", "Lr1/e;", "sourceCenter", "magnifierCenter", "Li3/l;", "Ll8/i0;", "onSizeChanged", _UrlKt.FRAGMENT_ENCODE_SET, "zoom", _UrlKt.FRAGMENT_ENCODE_SET, "useTextDefault", "size", "Li3/i;", "cornerRadius", "elevation", "clippingEnabled", "Ln/m2;", "platformMagnifierFactory", "<init>", "(La9/l;La9/l;La9/l;FZJFFZLn/m2;Lb9/k;)V", "m", "()Ln/y1;", "node", "n", "(Ln/y1;)V", _UrlKt.FRAGMENT_ENCODE_SET, "other", "equals", "(Ljava/lang/Object;)Z", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", "b", "La9/l;", "c", "d", "e", "F", "f", "Z", "g", "J", "h", "i", "j", "k", "Ln/m2;", "foundation_release"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
public final class C5284t1 extends AbstractC4606z0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final InterfaceC0184l sourceCenter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final InterfaceC0184l magnifierCenter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final InterfaceC0184l onSizeChanged;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final float zoom;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final boolean useTextDefault;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final long size;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final float cornerRadius;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final float elevation;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final boolean clippingEnabled;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final InterfaceC5250m2 platformMagnifierFactory;

    public C5284t1(InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2, InterfaceC0184l interfaceC0184l3, float f10, boolean z10, long j10, float f11, float f12, boolean z11, InterfaceC5250m2 interfaceC5250m2) {
        this.sourceCenter = interfaceC0184l;
        this.magnifierCenter = interfaceC0184l2;
        this.onSizeChanged = interfaceC0184l3;
        this.zoom = f10;
        this.useTextDefault = z10;
        this.size = j10;
        this.cornerRadius = f11;
        this.elevation = f12;
        this.clippingEnabled = z11;
        this.platformMagnifierFactory = interfaceC5250m2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C5284t1)) {
            return false;
        }
        C5284t1 c5284t1 = (C5284t1) other;
        return this.sourceCenter == c5284t1.sourceCenter && this.magnifierCenter == c5284t1.magnifierCenter && this.zoom == c5284t1.zoom && this.useTextDefault == c5284t1.useTextDefault && C3182l.m12031h(this.size, c5284t1.size) && C3179i.m12005m(this.cornerRadius, c5284t1.cornerRadius) && C3179i.m12005m(this.elevation, c5284t1.elevation) && this.clippingEnabled == c5284t1.clippingEnabled && this.onSizeChanged == c5284t1.onSizeChanged && AbstractC1061t.m3842c(this.platformMagnifierFactory, c5284t1.platformMagnifierFactory);
    }

    public int hashCode() {
        int iHashCode = this.sourceCenter.hashCode() * 31;
        InterfaceC0184l interfaceC0184l = this.magnifierCenter;
        int iHashCode2 = (((((((((((((iHashCode + (interfaceC0184l != null ? interfaceC0184l.hashCode() : 0)) * 31) + Float.hashCode(this.zoom)) * 31) + Boolean.hashCode(this.useTextDefault)) * 31) + C3182l.m12034k(this.size)) * 31) + C3179i.m12006n(this.cornerRadius)) * 31) + C3179i.m12006n(this.elevation)) * 31) + Boolean.hashCode(this.clippingEnabled)) * 31;
        InterfaceC0184l interfaceC0184l2 = this.onSizeChanged;
        return ((iHashCode2 + (interfaceC0184l2 != null ? interfaceC0184l2.hashCode() : 0)) * 31) + this.platformMagnifierFactory.hashCode();
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C5304y1 mo1191j() {
        return new C5304y1(this.sourceCenter, this.magnifierCenter, this.onSizeChanged, this.zoom, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, this.platformMagnifierFactory, null);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1192k(C5304y1 node) {
        node.m21617O2(this.sourceCenter, this.magnifierCenter, this.zoom, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, this.onSizeChanged, this.platformMagnifierFactory);
    }

    public /* synthetic */ C5284t1(InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2, InterfaceC0184l interfaceC0184l3, float f10, boolean z10, long j10, float f11, float f12, boolean z11, InterfaceC5250m2 interfaceC5250m2, AbstractC1043k abstractC1043k) {
        this(interfaceC0184l, interfaceC0184l2, interfaceC0184l3, f10, z10, j10, f11, f12, z11, interfaceC5250m2);
    }
}
