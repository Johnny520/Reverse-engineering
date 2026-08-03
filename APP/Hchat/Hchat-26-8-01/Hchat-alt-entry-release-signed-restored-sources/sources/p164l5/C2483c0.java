package p164l5;

import java.util.List;
import p074f5.EnumC1070f;
import p150k5.C2267r;
import p150k5.C2270u;
import p283t5.InterfaceC4127j;

/* JADX INFO: renamed from: l5.c0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2483c0 extends AbstractC2479a0 implements InterfaceC4127j {

    /* JADX INFO: renamed from: d */
    public final int f8126d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2483c0(C2270u c2270u, int i9) {
        super(c2270u, EnumC1070f.PACKED_SWITCH_PAYLOAD, i9);
        this.f8126d = c2270u.f7532b.m585P(i9 + 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p164l5.AbstractC2479a0, p283t5.InterfaceC4121d
    /* JADX INFO: renamed from: c */
    public final int mo5877c() {
        return (this.f8126d * 2) + 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p283t5.InterfaceC4127j
    /* JADX INFO: renamed from: s */
    public final List mo5883s() {
        return new C2267r(this.f8116a.f7532b.m579J(this.f8118c + 4), 1, this);
    }
}
