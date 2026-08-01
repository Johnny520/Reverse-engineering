package p219p;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0189q;
import p024b9.AbstractC1061t;
import p073f2.C2236d0;
import p166l2.AbstractC4606z0;
import p248r.InterfaceC6434j;

/* JADX INFO: renamed from: p.e0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0012\b\u0001\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00011B\u008d\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012(\u0010\u0012\u001a$\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f\u0012(\u0010\u0014\u001a$\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f\u0012\u0006\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010(R6\u0010\u0012\u001a$\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R6\u0010\u0014\u001a$\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010-R\u0014\u0010\u0015\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010(¨\u00062"}, m16758d2 = {"Lp/e0;", "Ll2/z0;", "Lp/h0;", "Lp/i0;", "state", "Lp/w0;", "orientation", _UrlKt.FRAGMENT_ENCODE_SET, "enabled", "Lr/j;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "Lec/o0;", "Lr1/e;", "Lp8/f;", "Ll8/i0;", _UrlKt.FRAGMENT_ENCODE_SET, "onDragStarted", _UrlKt.FRAGMENT_ENCODE_SET, "onDragStopped", "reverseDirection", "<init>", "(Lp/i0;Lp/w0;ZLr/j;ZLa9/q;La9/q;Z)V", "n", "()Lp/h0;", "node", "p", "(Lp/h0;)V", "other", "equals", "(Ljava/lang/Object;)Z", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", "b", "Lp/i0;", "c", "Lp/w0;", "d", "Z", "e", "Lr/j;", "f", "g", "La9/q;", "h", "i", "j", "a", "foundation_release"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
public final class C5843e0 extends AbstractC4606z0 {

    /* JADX INFO: renamed from: k */
    public static final InterfaceC0184l f18334k = new InterfaceC0184l() { // from class: p.d0
        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public final Object mo27m(Object obj) {
            return Boolean.valueOf(C5843e0.m23541m((C2236d0) obj));
        }
    };

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final InterfaceC5856i0 state;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final EnumC5898w0 orientation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean enabled;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final InterfaceC6434j interactionSource;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final boolean startDragImmediately;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final InterfaceC0189q onDragStarted;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final InterfaceC0189q onDragStopped;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final boolean reverseDirection;

    public C5843e0(InterfaceC5856i0 interfaceC5856i0, EnumC5898w0 enumC5898w0, boolean z10, InterfaceC6434j interfaceC6434j, boolean z11, InterfaceC0189q interfaceC0189q, InterfaceC0189q interfaceC0189q2, boolean z12) {
        this.state = interfaceC5856i0;
        this.orientation = enumC5898w0;
        this.enabled = z10;
        this.interactionSource = interfaceC6434j;
        this.startDragImmediately = z11;
        this.onDragStarted = interfaceC0189q;
        this.onDragStopped = interfaceC0189q2;
        this.reverseDirection = z12;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m23541m(C2236d0 c2236d0) {
        return true;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || C5843e0.class != other.getClass()) {
            return false;
        }
        C5843e0 c5843e0 = (C5843e0) other;
        return AbstractC1061t.m3842c(this.state, c5843e0.state) && this.orientation == c5843e0.orientation && this.enabled == c5843e0.enabled && AbstractC1061t.m3842c(this.interactionSource, c5843e0.interactionSource) && this.startDragImmediately == c5843e0.startDragImmediately && AbstractC1061t.m3842c(this.onDragStarted, c5843e0.onDragStarted) && AbstractC1061t.m3842c(this.onDragStopped, c5843e0.onDragStopped) && this.reverseDirection == c5843e0.reverseDirection;
    }

    public int hashCode() {
        int iHashCode = ((((this.state.hashCode() * 31) + this.orientation.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31;
        InterfaceC6434j interfaceC6434j = this.interactionSource;
        return ((((((((iHashCode + (interfaceC6434j != null ? interfaceC6434j.hashCode() : 0)) * 31) + Boolean.hashCode(this.startDragImmediately)) * 31) + this.onDragStarted.hashCode()) * 31) + this.onDragStopped.hashCode()) * 31) + Boolean.hashCode(this.reverseDirection);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public C5853h0 mo1191j() {
        return new C5853h0(this.state, f18334k, this.orientation, this.enabled, this.interactionSource, this.startDragImmediately, this.onDragStarted, this.onDragStopped, this.reverseDirection);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo1192k(C5853h0 node) {
        node.m23602r3(this.state, f18334k, this.orientation, this.enabled, this.interactionSource, this.startDragImmediately, this.onDragStarted, this.onDragStopped, this.reverseDirection);
    }
}
