package p275t0;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0184l;
import p166l2.AbstractC4528c2;
import p166l2.AbstractC4606z0;

/* JADX INFO: renamed from: t0.o0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m16758d2 = {"Lt0/o0;", "Ll2/z0;", "Lt0/n0;", "Lkotlin/Function1;", "Lt2/h0;", "Ll8/i0;", "properties", "<init>", "(La9/l;)V", "m", "()Lt0/n0;", "node", "n", "(Lt0/n0;)V", _UrlKt.FRAGMENT_ENCODE_SET, "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", "b", "La9/l;", "getProperties", "()La9/l;", "material3"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
public final class C7988o0 extends AbstractC4606z0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final InterfaceC0184l properties;

    public C7988o0(InterfaceC0184l interfaceC0184l) {
        this.properties = interfaceC0184l;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C7988o0) && this.properties == ((C7988o0) other).properties;
    }

    public int hashCode() {
        return this.properties.hashCode();
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C7985n0 mo1191j() {
        return new C7985n0(this.properties);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1192k(C7985n0 node) {
        node.m30754I2(this.properties);
        AbstractC4528c2.m17573b(node);
    }
}
