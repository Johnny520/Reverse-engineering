package p073f2;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1061t;
import p166l2.AbstractC4606z0;
import p166l2.C4584s;

/* JADX INFO: renamed from: f2.v0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, m16758d2 = {"Lf2/v0;", "Ll2/z0;", "Lf2/w0;", "Lf2/y;", "icon", _UrlKt.FRAGMENT_ENCODE_SET, "overrideDescendants", "Ll2/s;", "touchBoundsExpansion", "<init>", "(Lf2/y;ZLl2/s;)V", "m", "()Lf2/w0;", "node", "Ll8/i0;", "n", "(Lf2/w0;)V", _UrlKt.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", _UrlKt.FRAGMENT_ENCODE_SET, "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lf2/y;", "getIcon", "()Lf2/y;", "c", "Z", "getOverrideDescendants", "()Z", "d", "Ll2/s;", "getTouchBoundsExpansion", "()Ll2/s;", "ui"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
public final /* data */ class C2272v0 extends AbstractC4606z0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final InterfaceC2277y icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean overrideDescendants;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final C4584s touchBoundsExpansion;

    public C2272v0(InterfaceC2277y interfaceC2277y, boolean z10, C4584s c4584s) {
        this.icon = interfaceC2277y;
        this.overrideDescendants = z10;
        this.touchBoundsExpansion = c4584s;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C2272v0)) {
            return false;
        }
        C2272v0 c2272v0 = (C2272v0) other;
        return AbstractC1061t.m3842c(this.icon, c2272v0.icon) && this.overrideDescendants == c2272v0.overrideDescendants && AbstractC1061t.m3842c(this.touchBoundsExpansion, c2272v0.touchBoundsExpansion);
    }

    public int hashCode() {
        int iHashCode = ((this.icon.hashCode() * 31) + Boolean.hashCode(this.overrideDescendants)) * 31;
        C4584s c4584s = this.touchBoundsExpansion;
        return iHashCode + (c4584s == null ? 0 : c4584s.hashCode());
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C2274w0 mo1191j() {
        return new C2274w0(this.icon, this.overrideDescendants, this.touchBoundsExpansion);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1192k(C2274w0 node) {
        node.m8113U2(this.icon);
        node.m8114V2(this.overrideDescendants);
        node.m8112T2(this.touchBoundsExpansion);
    }

    public String toString() {
        return "StylusHoverIconModifierElement(icon=" + this.icon + ", overrideDescendants=" + this.overrideDescendants + ", touchBoundsExpansion=" + this.touchBoundsExpansion + ')';
    }
}
