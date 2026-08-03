package p308v1;

import java.util.List;
import java.util.Map;
import p069f.C0929d0;
import p069f.C0943k0;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p131j0.C2046b;
import p292u1.AbstractC4229a;
import p293u2.EnumC4243m;
import p339x1.C5602f0;
import p339x1.C5652v0;
import tf.C4173t;

/* JADX INFO: renamed from: v1.a0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4373a0 implements InterfaceC4404k1, InterfaceC4418p0 {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4382d0 f14581g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C4400j0 f14582h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4373a0(C4400j0 c4400j0) {
        this.f14582h = c4400j0;
        this.f14581g = c4400j0.f14655n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4418p0
    /* JADX INFO: renamed from: D0 */
    public final InterfaceC4415o0 mo8008D0(int i9, int i10, Map map, InterfaceC1231l interfaceC1231l, InterfaceC1231l interfaceC1231l2) {
        return this.f14581g.mo8008D0(i9, i10, map, interfaceC1231l, interfaceC1231l2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: G0 */
    public final int mo1590G0(float f3) {
        return this.f14581g.mo1590G0(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: J */
    public final long mo1591J(float f3) {
        return this.f14581g.mo1591J(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: K */
    public final long mo1592K(long j3) {
        return this.f14581g.mo1592K(j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: L0 */
    public final long mo1593L0(long j3) {
        return this.f14581g.mo1593L0(j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4404k1
    /* JADX INFO: renamed from: N */
    public final List mo8808N(InterfaceC1235p interfaceC1235p, Object obj) {
        C4400j0 c4400j0 = this.f14582h;
        C5602f0 c5602f0 = c4400j0.f14648g;
        C0943k0 c0943k0 = c4400j0.f14654m;
        C5602f0 c5602f02 = (C5602f0) c0943k0.m2320g(obj);
        if (c5602f02 != null && ((C2046b) ((C0929d0) c5602f0.m10043o()).f2909h).m5063i(c5602f02) < c4400j0.f14651j) {
            return c5602f02.m10041m();
        }
        C0943k0 c0943k02 = c4400j0.f14659r;
        C0943k0 c0943k03 = c4400j0.f14657p;
        C2046b c2046b = c4400j0.f14660s;
        if (c2046b.f6893i < c4400j0.f14652k) {
            AbstractC4229a.m8493a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        C5602f0 c5602f03 = (C5602f0) c0943k0.m2320g(obj);
        int i9 = c2046b.f6893i;
        int i10 = c4400j0.f14652k;
        if (i9 == i10) {
            c2046b.m5056b(obj);
        } else {
            Object[] objArr = c2046b.f6891g;
            Object obj2 = objArr[i10];
            objArr[i10] = obj;
        }
        c4400j0.f14652k++;
        boolean zM2315b = c0943k03.m2315b(obj);
        if (zM2315b || c5602f03 != null) {
            if (!zM2315b && c5602f03 != null) {
                c4400j0.m8850j(((C2046b) ((C0929d0) c5602f0.m10043o()).f2909h).m5063i(c5602f03), ((C2046b) ((C0929d0) c5602f0.m10043o()).f2909h).f6893i);
                c4400j0.f14662u++;
                c0943k0.m2324k(obj);
                c0943k03.m2326m(obj, c5602f03);
                c0943k02.m2326m(obj, c4400j0.m8846f(obj));
                if (c5602f0.m10010G()) {
                    c4400j0.m8848h();
                }
            }
            C5602f0 c5602f04 = (C5602f0) c0943k03.m2320g(obj);
            C4376b0 c4376b0 = c5602f04 != null ? (C4376b0) c4400j0.f14653l.m2320g(c5602f04) : null;
            if (c4376b0 != null && c4376b0.f14588d) {
                c4400j0.m8853m(c5602f04, obj, false, interfaceC1235p);
            }
            if ((c4376b0 != null ? c4376b0.f14590f : null) != null) {
                c4400j0.m8845d(c4376b0, true);
            }
        } else {
            c4400j0.m8851k(obj, interfaceC1235p, false);
            c0943k02.m2326m(obj, c4400j0.m8846f(obj));
        }
        C5602f0 c5602f05 = (C5602f0) c0943k03.m2320g(obj);
        if (c5602f05 == null) {
            return C4173t.f13710g;
        }
        List listM10214J0 = c5602f05.f22779M.f22891p.m10214J0();
        C0929d0 c0929d0 = (C0929d0) listM10214J0;
        int i11 = ((C2046b) c0929d0.f2909h).f6893i;
        for (int i12 = 0; i12 < i11; i12++) {
            ((C5652v0) c0929d0.get(i12)).f23029l.f22877b = true;
        }
        return listM10214J0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: O0 */
    public final float mo1594O0(long j3) {
        return this.f14581g.mo1594O0(j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: S */
    public final float mo1595S(long j3) {
        return this.f14581g.mo1595S(j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: d */
    public final float mo1333d() {
        return this.f14581g.f14611h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: e0 */
    public final long mo1598e0(float f3) {
        return this.f14581g.mo1598e0(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4414o
    public final EnumC4243m getLayoutDirection() {
        return this.f14581g.f14610g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: i0 */
    public final float mo1599i0(int i9) {
        return this.f14581g.mo1599i0(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: l0 */
    public final float mo1600l0(float f3) {
        return f3 / this.f14581g.mo1333d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: q0 */
    public final float mo1335q0() {
        return this.f14581g.f14612i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4414o
    /* JADX INFO: renamed from: u0 */
    public final boolean mo8009u0() {
        return this.f14581g.mo8009u0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: x0 */
    public final float mo1601x0(float f3) {
        return this.f14581g.mo1333d() * f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4418p0
    /* JADX INFO: renamed from: z */
    public final InterfaceC4415o0 mo8010z(int i9, int i10, Map map, InterfaceC1231l interfaceC1231l) {
        return this.f14581g.mo8008D0(i9, i10, map, null, interfaceC1231l);
    }
}
