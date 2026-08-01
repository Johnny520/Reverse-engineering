package p274t;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p166l2.AbstractC4606z0;

/* JADX INFO: renamed from: t.z1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m16758d2 = {"Lt/z1;", "Ll2/z0;", "Lt/a2;", _UrlKt.FRAGMENT_ENCODE_SET, "weight", _UrlKt.FRAGMENT_ENCODE_SET, "fill", "<init>", "(FZ)V", "m", "()Lt/a2;", "node", "Ll8/i0;", "n", "(Lt/a2;)V", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", _UrlKt.FRAGMENT_ENCODE_SET, "other", "equals", "(Ljava/lang/Object;)Z", "b", "F", "getWeight", "()F", "c", "Z", "getFill", "()Z", "foundation-layout"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
public final class C7931z1 extends AbstractC4606z0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final float weight;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean fill;

    public C7931z1(float f10, boolean z10) {
        this.weight = f10;
        this.fill = z10;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        C7931z1 c7931z1 = other instanceof C7931z1 ? (C7931z1) other : null;
        return c7931z1 != null && this.weight == c7931z1.weight && this.fill == c7931z1.fill;
    }

    public int hashCode() {
        return (Float.hashCode(this.weight) * 31) + Boolean.hashCode(this.fill);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C7802a2 mo1191j() {
        return new C7802a2(this.weight, this.fill);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1192k(C7802a2 node) {
        node.m30238I2(this.weight);
        node.m30237H2(this.fill);
    }
}
