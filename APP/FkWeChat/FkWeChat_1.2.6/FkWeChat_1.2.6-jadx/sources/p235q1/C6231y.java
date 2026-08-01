package p235q1;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1061t;
import p166l2.AbstractC4606z0;

/* JADX INFO: renamed from: q1.y */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m16758d2 = {"Lq1/y;", "Ll2/z0;", "Lq1/c0;", "Lq1/x;", "focusRequester", "<init>", "(Lq1/x;)V", "m", "()Lq1/c0;", "node", "Ll8/i0;", "n", "(Lq1/c0;)V", _UrlKt.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", _UrlKt.FRAGMENT_ENCODE_SET, "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", "b", "Lq1/x;", "getFocusRequester", "()Lq1/x;", "ui"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
final /* data */ class C6231y extends AbstractC4606z0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final C6230x focusRequester;

    public C6231y(C6230x c6230x) {
        this.focusRequester = c6230x;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C6231y) && AbstractC1061t.m3842c(this.focusRequester, ((C6231y) other).focusRequester);
    }

    public int hashCode() {
        return this.focusRequester.hashCode();
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C6196c0 mo1191j() {
        return new C6196c0(this.focusRequester);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1192k(C6196c0 node) {
        node.m24351G2().m24554e().m37043p(node);
        node.m24352H2(this.focusRequester);
        node.m24351G2().m24554e().m37029b(node);
    }

    public String toString() {
        return "FocusRequesterElement(focusRequester=" + this.focusRequester + ')';
    }
}
