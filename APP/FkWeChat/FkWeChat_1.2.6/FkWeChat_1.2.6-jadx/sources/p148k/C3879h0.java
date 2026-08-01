package p148k;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1061t;
import p163l.InterfaceC4303h0;
import p165l1.InterfaceC4499e;
import p166l2.AbstractC4606z0;

/* JADX INFO: renamed from: k.h0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R+\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, m16758d2 = {"Lk/h0;", "Ll2/z0;", "Lk/i0;", "Ll/h0;", "Li3/s;", "animationSpec", "Ll1/e;", "alignment", "Lkotlin/Function2;", "Ll8/i0;", "finishedListener", "<init>", "(Ll/h0;Ll1/e;La9/p;)V", "m", "()Lk/i0;", "node", "n", "(Lk/i0;)V", _UrlKt.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", _UrlKt.FRAGMENT_ENCODE_SET, "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", "b", "Ll/h0;", "getAnimationSpec", "()Ll/h0;", "c", "Ll1/e;", "getAlignment", "()Ll1/e;", "d", "La9/p;", "getFinishedListener", "()La9/p;", "animation"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
final /* data */ class C3879h0 extends AbstractC4606z0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final InterfaceC4303h0 animationSpec;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final InterfaceC4499e alignment;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final InterfaceC0188p finishedListener;

    public C3879h0(InterfaceC4303h0 interfaceC4303h0, InterfaceC4499e interfaceC4499e, InterfaceC0188p interfaceC0188p) {
        this.animationSpec = interfaceC4303h0;
        this.alignment = interfaceC4499e;
        this.finishedListener = interfaceC0188p;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3879h0)) {
            return false;
        }
        C3879h0 c3879h0 = (C3879h0) other;
        return AbstractC1061t.m3842c(this.animationSpec, c3879h0.animationSpec) && AbstractC1061t.m3842c(this.alignment, c3879h0.alignment) && AbstractC1061t.m3842c(this.finishedListener, c3879h0.finishedListener);
    }

    public int hashCode() {
        int iHashCode = ((this.animationSpec.hashCode() * 31) + this.alignment.hashCode()) * 31;
        InterfaceC0188p interfaceC0188p = this.finishedListener;
        return iHashCode + (interfaceC0188p == null ? 0 : interfaceC0188p.hashCode());
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C3881i0 mo1191j() {
        return new C3881i0(this.animationSpec, this.alignment, this.finishedListener);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1192k(C3881i0 node) {
        node.m15417N2(this.animationSpec);
        node.m15418O2(this.finishedListener);
        node.m15415L2(this.alignment);
    }

    public String toString() {
        return "SizeAnimationModifierElement(animationSpec=" + this.animationSpec + ", alignment=" + this.alignment + ", finishedListener=" + this.finishedListener + ')';
    }
}
