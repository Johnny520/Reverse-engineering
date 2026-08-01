package p274t;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p165l1.InterfaceC4499e;
import p166l2.AbstractC4606z0;

/* JADX INFO: renamed from: t.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, m16758d2 = {"Lt/j;", "Ll2/z0;", "Lt/k;", "Ll1/e;", "alignment", _UrlKt.FRAGMENT_ENCODE_SET, "matchParentSize", "Lkotlin/Function1;", "Lm2/g2;", "Ll8/i0;", "inspectorInfo", "<init>", "(Ll1/e;ZLa9/l;)V", "m", "()Lt/k;", "node", "n", "(Lt/k;)V", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", _UrlKt.FRAGMENT_ENCODE_SET, "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ll1/e;", "getAlignment", "()Ll1/e;", "c", "Z", "getMatchParentSize", "()Z", "d", "La9/l;", "getInspectorInfo", "()La9/l;", "foundation-layout"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
final class C7849j extends AbstractC4606z0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final InterfaceC4499e alignment;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean matchParentSize;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final InterfaceC0184l inspectorInfo;

    public C7849j(InterfaceC4499e interfaceC4499e, boolean z10, InterfaceC0184l interfaceC0184l) {
        this.alignment = interfaceC4499e;
        this.matchParentSize = z10;
        this.inspectorInfo = interfaceC0184l;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        C7849j c7849j = other instanceof C7849j ? (C7849j) other : null;
        return c7849j != null && AbstractC1061t.m3842c(this.alignment, c7849j.alignment) && this.matchParentSize == c7849j.matchParentSize;
    }

    public int hashCode() {
        return (this.alignment.hashCode() * 31) + Boolean.hashCode(this.matchParentSize);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C7854k mo1191j() {
        return new C7854k(this.alignment, this.matchParentSize);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1192k(C7854k node) {
        node.m30407J2(this.alignment);
        node.m30408K2(this.matchParentSize);
    }
}
