package p189n;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1061t;
import p166l2.AbstractC4606z0;

/* JADX INFO: renamed from: n.l3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u0007\u0010\u001e¨\u0006 "}, m16758d2 = {"Ln/l3;", "Ll2/z0;", "Ln/a3;", "Ln/g3;", "scrollState", _UrlKt.FRAGMENT_ENCODE_SET, "reverseScrolling", "isVertical", "<init>", "(Ln/g3;ZZ)V", "m", "()Ln/a3;", "node", "Ll8/i0;", "n", "(Ln/a3;)V", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", _UrlKt.FRAGMENT_ENCODE_SET, "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ln/g3;", "getScrollState", "()Ln/g3;", "c", "Z", "getReverseScrolling", "()Z", "d", "foundation_release"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
public final class C5246l3 extends AbstractC4606z0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final C5221g3 scrollState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean reverseScrolling;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean isVertical;

    public C5246l3(C5221g3 c5221g3, boolean z10, boolean z11) {
        this.scrollState = c5221g3;
        this.reverseScrolling = z10;
        this.isVertical = z11;
    }

    public boolean equals(Object other) {
        if (!(other instanceof C5246l3)) {
            return false;
        }
        C5246l3 c5246l3 = (C5246l3) other;
        return AbstractC1061t.m3842c(this.scrollState, c5246l3.scrollState) && this.reverseScrolling == c5246l3.reverseScrolling && this.isVertical == c5246l3.isVertical;
    }

    public int hashCode() {
        return (((this.scrollState.hashCode() * 31) + Boolean.hashCode(this.reverseScrolling)) * 31) + Boolean.hashCode(this.isVertical);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C5191a3 mo1191j() {
        return new C5191a3(this.scrollState, this.reverseScrolling, this.isVertical);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1192k(C5191a3 node) {
        node.m21286L2(this.scrollState);
        node.m21285K2(this.reverseScrolling);
        node.m21287M2(this.isVertical);
    }
}
