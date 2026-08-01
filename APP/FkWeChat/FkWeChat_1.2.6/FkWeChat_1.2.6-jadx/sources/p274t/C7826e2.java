package p274t;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0184l;
import p166l2.AbstractC4606z0;

/* JADX INFO: renamed from: t.e2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00038\u0006¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010 ¨\u0006'"}, m16758d2 = {"Lt/e2;", "Ll2/z0;", "Lt/g2;", "Lkotlin/Function1;", "Li3/e;", "Li3/o;", "offset", _UrlKt.FRAGMENT_ENCODE_SET, "rtlAware", "Lm2/g2;", "Ll8/i0;", "inspectorInfo", "<init>", "(La9/l;ZLa9/l;)V", "m", "()Lt/g2;", "node", "n", "(Lt/g2;)V", _UrlKt.FRAGMENT_ENCODE_SET, "other", "equals", "(Ljava/lang/Object;)Z", _UrlKt.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", "b", "La9/l;", "getOffset", "()La9/l;", "c", "Z", "getRtlAware", "()Z", "d", "getInspectorInfo", "foundation-layout"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
final class C7826e2 extends AbstractC4606z0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final InterfaceC0184l offset;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean rtlAware;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final InterfaceC0184l inspectorInfo;

    public C7826e2(InterfaceC0184l interfaceC0184l, boolean z10, InterfaceC0184l interfaceC0184l2) {
        this.offset = interfaceC0184l;
        this.rtlAware = z10;
        this.inspectorInfo = interfaceC0184l2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        C7826e2 c7826e2 = other instanceof C7826e2 ? (C7826e2) other : null;
        return c7826e2 != null && this.offset == c7826e2.offset && this.rtlAware == c7826e2.rtlAware;
    }

    public int hashCode() {
        return (this.offset.hashCode() * 31) + Boolean.hashCode(this.rtlAware);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C7837g2 mo1191j() {
        return new C7837g2(this.offset, this.rtlAware);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1192k(C7837g2 node) {
        node.m30367H2(this.offset, this.rtlAware);
    }

    public String toString() {
        return "OffsetPxModifier(offset=" + this.offset + ", rtlAware=" + this.rtlAware + ')';
    }
}
