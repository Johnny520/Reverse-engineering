package p264s0;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p163l.InterfaceC4317k;
import p166l2.AbstractC4606z0;

/* JADX INFO: renamed from: s0.z0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, m16758d2 = {"Ls0/z0;", "Ll2/z0;", "Ls0/c1;", "Ls0/i;", "state", _UrlKt.FRAGMENT_ENCODE_SET, "autoSwitchToMinute", "Ls0/kd;", "selection", "Ll/k;", _UrlKt.FRAGMENT_ENCODE_SET, "animationSpec", "<init>", "(Ls0/i;ZILl/k;Lb9/k;)V", "m", "()Ls0/c1;", "node", "Ll8/i0;", "n", "(Ls0/c1;)V", _UrlKt.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", _UrlKt.FRAGMENT_ENCODE_SET, "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ls0/i;", "c", "Z", "d", "I", "e", "Ll/k;", "material3"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
public final /* data */ class C7032z0 extends AbstractC4606z0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final C6767i state;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean autoSwitchToMinute;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int selection;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final InterfaceC4317k animationSpec;

    public C7032z0(C6767i c6767i, boolean z10, int i10, InterfaceC4317k interfaceC4317k) {
        this.state = c6767i;
        this.autoSwitchToMinute = z10;
        this.selection = i10;
        this.animationSpec = interfaceC4317k;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C7032z0)) {
            return false;
        }
        C7032z0 c7032z0 = (C7032z0) other;
        return AbstractC1061t.m3842c(this.state, c7032z0.state) && this.autoSwitchToMinute == c7032z0.autoSwitchToMinute && C6813kd.m27007f(this.selection, c7032z0.selection) && AbstractC1061t.m3842c(this.animationSpec, c7032z0.animationSpec);
    }

    public int hashCode() {
        return (((((this.state.hashCode() * 31) + Boolean.hashCode(this.autoSwitchToMinute)) * 31) + C6813kd.m27008g(this.selection)) * 31) + this.animationSpec.hashCode();
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C6673c1 mo1191j() {
        return new C6673c1(this.state, this.autoSwitchToMinute, this.selection, this.animationSpec, null);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1192k(C6673c1 node) {
        node.m26454Y2(this.state, this.autoSwitchToMinute, this.selection, this.animationSpec);
    }

    public String toString() {
        return "ClockDialModifier(state=" + this.state + ", autoSwitchToMinute=" + this.autoSwitchToMinute + ", selection=" + ((Object) C6813kd.m27009h(this.selection)) + ", animationSpec=" + this.animationSpec + ')';
    }

    public /* synthetic */ C7032z0(C6767i c6767i, boolean z10, int i10, InterfaceC4317k interfaceC4317k, AbstractC1043k abstractC1043k) {
        this(c6767i, z10, i10, interfaceC4317k);
    }
}
