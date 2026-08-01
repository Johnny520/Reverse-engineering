package p189n;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1061t;
import p166l2.AbstractC4606z0;
import p248r.InterfaceC6434j;

/* JADX INFO: renamed from: n.v0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m16758d2 = {"Ln/v0;", "Ll2/z0;", "Ln/z0;", "Lr/j;", "interactionSource", "<init>", "(Lr/j;)V", "m", "()Ln/z0;", "node", "Ll8/i0;", "n", "(Ln/z0;)V", _UrlKt.FRAGMENT_ENCODE_SET, "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", "b", "Lr/j;", "foundation_release"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
final class C5291v0 extends AbstractC4606z0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final InterfaceC6434j interactionSource;

    public C5291v0(InterfaceC6434j interfaceC6434j) {
        this.interactionSource = interfaceC6434j;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C5291v0) && AbstractC1061t.m3842c(this.interactionSource, ((C5291v0) other).interactionSource);
    }

    public int hashCode() {
        InterfaceC6434j interfaceC6434j = this.interactionSource;
        if (interfaceC6434j != null) {
            return interfaceC6434j.hashCode();
        }
        return 0;
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C5307z0 mo1191j() {
        return new C5307z0(this.interactionSource, 0, null, 6, null);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1192k(C5307z0 node) {
        node.m21634X2(this.interactionSource);
    }
}
