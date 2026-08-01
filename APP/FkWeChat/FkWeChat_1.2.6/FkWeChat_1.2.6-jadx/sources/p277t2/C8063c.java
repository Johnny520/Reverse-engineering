package p277t2;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0184l;
import p166l2.AbstractC4606z0;

/* JADX INFO: renamed from: t2.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m16758d2 = {"Lt2/c;", "Ll2/z0;", "Lt2/f;", "Lt2/u;", "Lkotlin/Function1;", "Lt2/h0;", "Ll8/i0;", "properties", "<init>", "(La9/l;)V", "m", "()Lt2/f;", "node", "n", "(Lt2/f;)V", _UrlKt.FRAGMENT_ENCODE_SET, "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", "b", "La9/l;", "getProperties", "()La9/l;", "Lt2/p;", "c", "()Lt2/p;", "semanticsConfiguration", "ui"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
public final class C8063c extends AbstractC4606z0 implements InterfaceC8092u {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final InterfaceC0184l properties;

    public C8063c(InterfaceC0184l interfaceC0184l) {
        this.properties = interfaceC0184l;
    }

    @Override // p277t2.InterfaceC8092u
    /* JADX INFO: renamed from: c */
    public C8087p mo30993c() {
        C8087p c8087p = new C8087p();
        c8087p.m31261y(false);
        c8087p.m31260x(true);
        this.properties.mo27m(c8087p);
        return c8087p;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C8063c) && this.properties == ((C8063c) other).properties;
    }

    public int hashCode() {
        return this.properties.hashCode();
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C8069f mo1191j() {
        return new C8069f(false, true, this.properties);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1192k(C8069f node) {
        node.m31071H2(this.properties);
    }
}
