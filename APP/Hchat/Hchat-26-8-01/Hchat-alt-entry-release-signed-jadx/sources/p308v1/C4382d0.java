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
import p339x1.EnumC5586b0;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: v1.d0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4382d0 implements InterfaceC4404k1 {

    /* JADX INFO: renamed from: g */
    public EnumC4243m f14610g = EnumC4243m.f13920h;

    /* JADX INFO: renamed from: h */
    public float f14611h;

    /* JADX INFO: renamed from: i */
    public float f14612i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C4400j0 f14613j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4382d0(C4400j0 c4400j0) {
        this.f14613j = c4400j0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4418p0
    /* JADX INFO: renamed from: D0 */
    public final InterfaceC4415o0 mo8008D0(int i9, int i10, Map map, InterfaceC1231l interfaceC1231l, InterfaceC1231l interfaceC1231l2) {
        if ((i9 & (-16777216)) != 0 || ((-16777216) & i10) != 0) {
            AbstractC4229a.m8494b("Size(" + i9 + " x " + i10 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C4379c0(i9, i10, map, interfaceC1231l, this, this.f14613j, interfaceC1231l2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4404k1
    /* JADX INFO: renamed from: N */
    public final List mo8808N(InterfaceC1235p interfaceC1235p, Object obj) {
        C4400j0 c4400j0 = this.f14613j;
        c4400j0.m8848h();
        C5602f0 c5602f0 = c4400j0.f14648g;
        EnumC5586b0 enumC5586b0 = c5602f0.f22779M.f22879d;
        EnumC5586b0 enumC5586b02 = EnumC5586b0.f22710i;
        EnumC5586b0 enumC5586b03 = EnumC5586b0.f22708g;
        if (enumC5586b0 != enumC5586b03 && enumC5586b0 != enumC5586b02 && enumC5586b0 != EnumC5586b0.f22709h && enumC5586b0 != EnumC5586b0.f22711j) {
            AbstractC4229a.m8494b("subcompose can only be used inside the measure or layout blocks");
        }
        C0943k0 c0943k0 = c4400j0.f14654m;
        Object objM2320g = c0943k0.m2320g(obj);
        if (objM2320g == null) {
            objM2320g = (C5602f0) c4400j0.f14657p.m2324k(obj);
            if (objM2320g != null) {
                if (c4400j0.f14662u <= 0) {
                    AbstractC4229a.m8494b("Check failed.");
                }
                c4400j0.f14662u--;
            } else {
                objM2320g = c4400j0.m8854n(obj);
                if (objM2320g == null) {
                    int i9 = c4400j0.f14651j;
                    C5602f0 c5602f02 = new C5602f0(2);
                    c5602f0.f22806w = true;
                    c5602f0.m10004A(i9, c5602f02);
                    c5602f0.f22806w = false;
                    objM2320g = c5602f02;
                }
            }
            c0943k0.m2326m(obj, objM2320g);
        }
        C5602f0 c5602f03 = (C5602f0) objM2320g;
        if (AbstractC4166m.m8425w1(c4400j0.f14651j, c5602f0.m10043o()) != c5602f03) {
            int iM5063i = ((C2046b) ((C0929d0) c5602f0.m10043o()).f2909h).m5063i(c5602f03);
            if (iM5063i < c4400j0.f14651j) {
                AbstractC4229a.m8493a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i10 = c4400j0.f14651j;
            if (i10 != iM5063i) {
                c4400j0.m8850j(iM5063i, i10);
            }
        }
        c4400j0.f14651j++;
        c4400j0.m8853m(c5602f03, obj, false, interfaceC1235p);
        return (enumC5586b0 == enumC5586b03 || enumC5586b0 == enumC5586b02) ? c5602f03.m10041m() : c5602f03.m10040l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: d */
    public final float mo1333d() {
        return this.f14611h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4414o
    public final EnumC4243m getLayoutDirection() {
        return this.f14610g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: q0 */
    public final float mo1335q0() {
        return this.f14612i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4414o
    /* JADX INFO: renamed from: u0 */
    public final boolean mo8009u0() {
        EnumC5586b0 enumC5586b0 = this.f14613j.f14648g.f22779M.f22879d;
        return enumC5586b0 == EnumC5586b0.f22711j || enumC5586b0 == EnumC5586b0.f22709h;
    }
}
