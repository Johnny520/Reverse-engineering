package p073f2;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1061t;
import p166l2.AbstractC4606z0;

/* JADX INFO: renamed from: f2.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, m16758d2 = {"Lf2/w;", "Ll2/z0;", "Lf2/x;", "Lf2/y;", "icon", _UrlKt.FRAGMENT_ENCODE_SET, "overrideDescendants", "<init>", "(Lf2/y;Z)V", "m", "()Lf2/x;", "node", "Ll8/i0;", "n", "(Lf2/x;)V", _UrlKt.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", _UrlKt.FRAGMENT_ENCODE_SET, "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lf2/y;", "getIcon", "()Lf2/y;", "c", "Z", "getOverrideDescendants", "()Z", "ui"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
public final /* data */ class C2273w extends AbstractC4606z0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final InterfaceC2277y icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean overrideDescendants;

    public C2273w(InterfaceC2277y interfaceC2277y, boolean z10) {
        this.icon = interfaceC2277y;
        this.overrideDescendants = z10;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C2273w)) {
            return false;
        }
        C2273w c2273w = (C2273w) other;
        return AbstractC1061t.m3842c(this.icon, c2273w.icon) && this.overrideDescendants == c2273w.overrideDescendants;
    }

    public int hashCode() {
        return (this.icon.hashCode() * 31) + Boolean.hashCode(this.overrideDescendants);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C2275x mo1191j() {
        return new C2275x(this.icon, this.overrideDescendants);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1192k(C2275x node) {
        node.m8113U2(this.icon);
        node.m8114V2(this.overrideDescendants);
    }

    public String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.icon + ", overrideDescendants=" + this.overrideDescendants + ')';
    }
}
