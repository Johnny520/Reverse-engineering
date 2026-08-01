package p274t;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0184l;
import p166l2.AbstractC4606z0;

/* JADX INFO: renamed from: t.p1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, m16758d2 = {"Lt/p1;", "Ll2/z0;", "Lt/q1;", "Lt/t1;", "height", _UrlKt.FRAGMENT_ENCODE_SET, "enforceIncoming", "Lkotlin/Function1;", "Lm2/g2;", "Ll8/i0;", "inspectorInfo", "<init>", "(Lt/t1;ZLa9/l;)V", "m", "()Lt/q1;", "node", "n", "(Lt/q1;)V", _UrlKt.FRAGMENT_ENCODE_SET, "other", "equals", "(Ljava/lang/Object;)Z", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", "b", "Lt/t1;", "getHeight", "()Lt/t1;", "c", "Z", "getEnforceIncoming", "()Z", "d", "La9/l;", "getInspectorInfo", "()La9/l;", "foundation-layout"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
final class C7881p1 extends AbstractC4606z0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final EnumC7901t1 height;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean enforceIncoming;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final InterfaceC0184l inspectorInfo;

    public C7881p1(EnumC7901t1 enumC7901t1, boolean z10, InterfaceC0184l interfaceC0184l) {
        this.height = enumC7901t1;
        this.enforceIncoming = z10;
        this.inspectorInfo = interfaceC0184l;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        C7881p1 c7881p1 = other instanceof C7881p1 ? (C7881p1) other : null;
        return c7881p1 != null && this.height == c7881p1.height && this.enforceIncoming == c7881p1.enforceIncoming;
    }

    public int hashCode() {
        return (this.height.hashCode() * 31) + Boolean.hashCode(this.enforceIncoming);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C7886q1 mo1191j() {
        return new C7886q1(this.height, this.enforceIncoming);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1192k(C7886q1 node) {
        node.m30477K2(this.height);
        node.m30476J2(this.enforceIncoming);
    }
}
