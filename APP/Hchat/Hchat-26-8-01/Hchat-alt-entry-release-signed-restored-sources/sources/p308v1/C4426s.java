package p308v1;

import java.util.Map;
import p085fg.InterfaceC1231l;
import p292u1.AbstractC4229a;
import p293u2.EnumC4243m;

/* JADX INFO: renamed from: v1.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4426s implements InterfaceC4418p0, InterfaceC4414o {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC4414o f14734g;

    /* JADX INFO: renamed from: h */
    public final EnumC4243m f14735h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4426s(InterfaceC4414o interfaceC4414o, EnumC4243m enumC4243m) {
        this.f14734g = interfaceC4414o;
        this.f14735h = enumC4243m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4418p0
    /* JADX INFO: renamed from: D0 */
    public final InterfaceC4415o0 mo8008D0(int i9, int i10, Map map, InterfaceC1231l interfaceC1231l, InterfaceC1231l interfaceC1231l2) {
        if (i9 < 0) {
            i9 = 0;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        if ((i9 & (-16777216)) != 0 || ((-16777216) & i10) != 0) {
            AbstractC4229a.m8494b("Size(" + i9 + " x " + i10 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C4423r(i9, i10, map, interfaceC1231l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: G0 */
    public final int mo1590G0(float f3) {
        return this.f14734g.mo1590G0(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: J */
    public final long mo1591J(float f3) {
        return this.f14734g.mo1591J(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: K */
    public final long mo1592K(long j3) {
        return this.f14734g.mo1592K(j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: L0 */
    public final long mo1593L0(long j3) {
        return this.f14734g.mo1593L0(j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: O0 */
    public final float mo1594O0(long j3) {
        return this.f14734g.mo1594O0(j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: S */
    public final float mo1595S(long j3) {
        return this.f14734g.mo1595S(j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: d */
    public final float mo1333d() {
        return this.f14734g.mo1333d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: e0 */
    public final long mo1598e0(float f3) {
        return this.f14734g.mo1598e0(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4414o
    public final EnumC4243m getLayoutDirection() {
        return this.f14735h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: i0 */
    public final float mo1599i0(int i9) {
        return this.f14734g.mo1599i0(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: l0 */
    public final float mo1600l0(float f3) {
        return this.f14734g.mo1600l0(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: q0 */
    public final float mo1335q0() {
        return this.f14734g.mo1335q0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4414o
    /* JADX INFO: renamed from: u0 */
    public final boolean mo8009u0() {
        return this.f14734g.mo8009u0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: x0 */
    public final float mo1601x0(float f3) {
        return this.f14734g.mo1601x0(f3);
    }
}
