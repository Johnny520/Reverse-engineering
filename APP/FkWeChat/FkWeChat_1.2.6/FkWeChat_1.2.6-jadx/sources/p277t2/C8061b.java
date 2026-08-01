package p277t2;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0184l;
import p166l2.AbstractC4606z0;

/* JADX INFO: renamed from: t2.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010!¨\u0006#"}, m16758d2 = {"Lt2/b;", "Ll2/z0;", "Lt2/f;", "Lt2/u;", _UrlKt.FRAGMENT_ENCODE_SET, "mergeDescendants", "Lkotlin/Function1;", "Lt2/h0;", "Ll8/i0;", "properties", "<init>", "(ZLa9/l;)V", "m", "()Lt2/f;", "node", "n", "(Lt2/f;)V", _UrlKt.FRAGMENT_ENCODE_SET, "other", "equals", "(Ljava/lang/Object;)Z", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", "b", "Z", "getMergeDescendants", "()Z", "c", "La9/l;", "getProperties", "()La9/l;", "Lt2/p;", "()Lt2/p;", "semanticsConfiguration", "ui"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
public final class C8061b extends AbstractC4606z0 implements InterfaceC8092u {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean mergeDescendants;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final InterfaceC0184l properties;

    public C8061b(boolean z10, InterfaceC0184l interfaceC0184l) {
        this.mergeDescendants = z10;
        this.properties = interfaceC0184l;
    }

    @Override // p277t2.InterfaceC8092u
    /* JADX INFO: renamed from: c */
    public C8087p mo30993c() {
        C8087p c8087p = new C8087p();
        c8087p.m31261y(this.mergeDescendants);
        this.properties.mo27m(c8087p);
        return c8087p;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C8061b)) {
            return false;
        }
        C8061b c8061b = (C8061b) other;
        return this.mergeDescendants == c8061b.mergeDescendants && this.properties == c8061b.properties;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.mergeDescendants) * 31) + this.properties.hashCode();
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C8069f mo1191j() {
        return new C8069f(this.mergeDescendants, false, this.properties);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1192k(C8069f node) {
        node.m31070G2(this.mergeDescendants);
        node.m31071H2(this.properties);
    }
}
