package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1061t;
import p166l2.AbstractC4606z0;
import p219p.EnumC5898w0;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, m16758d2 = {"Landroidx/compose/foundation/lazy/layout/k;", "Ll2/z0;", "Landroidx/compose/foundation/lazy/layout/n;", "Landroidx/compose/foundation/lazy/layout/o;", "state", "Landroidx/compose/foundation/lazy/layout/j;", "beyondBoundsInfo", _UrlKt.FRAGMENT_ENCODE_SET, "reverseLayout", "Lp/w0;", "orientation", "<init>", "(Landroidx/compose/foundation/lazy/layout/o;Landroidx/compose/foundation/lazy/layout/j;ZLp/w0;)V", "m", "()Landroidx/compose/foundation/lazy/layout/n;", "node", "Ll8/i0;", "n", "(Landroidx/compose/foundation/lazy/layout/n;)V", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", _UrlKt.FRAGMENT_ENCODE_SET, "other", "equals", "(Ljava/lang/Object;)Z", "b", "Landroidx/compose/foundation/lazy/layout/o;", "getState", "()Landroidx/compose/foundation/lazy/layout/o;", "c", "Landroidx/compose/foundation/lazy/layout/j;", "getBeyondBoundsInfo", "()Landroidx/compose/foundation/lazy/layout/j;", "d", "Z", "getReverseLayout", "()Z", "e", "Lp/w0;", "getOrientation", "()Lp/w0;", "foundation_release"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
final class C0390k extends AbstractC4606z0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final InterfaceC0406o state;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final C0386j beyondBoundsInfo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean reverseLayout;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final EnumC5898w0 orientation;

    public C0390k(InterfaceC0406o interfaceC0406o, C0386j c0386j, boolean z10, EnumC5898w0 enumC5898w0) {
        this.state = interfaceC0406o;
        this.beyondBoundsInfo = c0386j;
        this.reverseLayout = z10;
        this.orientation = enumC5898w0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C0390k)) {
            return false;
        }
        C0390k c0390k = (C0390k) other;
        return AbstractC1061t.m3842c(this.state, c0390k.state) && AbstractC1061t.m3842c(this.beyondBoundsInfo, c0390k.beyondBoundsInfo) && this.reverseLayout == c0390k.reverseLayout && this.orientation == c0390k.orientation;
    }

    public int hashCode() {
        return (((((this.state.hashCode() * 31) + this.beyondBoundsInfo.hashCode()) * 31) + Boolean.hashCode(this.reverseLayout)) * 31) + this.orientation.hashCode();
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C0402n mo1191j() {
        return new C0402n(this.state, this.beyondBoundsInfo, this.reverseLayout, this.orientation);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1192k(C0402n node) {
        node.m1286M2(this.state, this.beyondBoundsInfo, this.reverseLayout, this.orientation);
    }
}
