package p221p1;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0184l;
import p166l2.AbstractC4606z0;

/* JADX INFO: renamed from: p1.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m16758d2 = {"Lp1/l;", "Ll2/z0;", "Lp1/d;", "Lkotlin/Function1;", "Lp1/e;", "Lp1/k;", "onBuildDrawCache", "<init>", "(La9/l;)V", "m", "()Lp1/d;", "node", "Ll8/i0;", "n", "(Lp1/d;)V", _UrlKt.FRAGMENT_ENCODE_SET, "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", "b", "La9/l;", "getOnBuildDrawCache", "()La9/l;", "ui"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
final class C5929l extends AbstractC4606z0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final InterfaceC0184l onBuildDrawCache;

    public C5929l(InterfaceC0184l interfaceC0184l) {
        this.onBuildDrawCache = interfaceC0184l;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C5929l) && this.onBuildDrawCache == ((C5929l) other).onBuildDrawCache;
    }

    public int hashCode() {
        return this.onBuildDrawCache.hashCode();
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C5921d mo1191j() {
        return new C5921d(new C5922e(), this.onBuildDrawCache);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1192k(C5921d node) {
        node.m23824J2(this.onBuildDrawCache);
    }
}
