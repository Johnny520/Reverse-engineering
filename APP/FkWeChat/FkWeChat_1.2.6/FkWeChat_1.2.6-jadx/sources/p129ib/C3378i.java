package p129ib;

import gb.AbstractC2650c1;
import gb.C2704q1;
import gb.InterfaceC2716u1;
import java.util.Arrays;
import java.util.List;
import p024b9.AbstractC1043k;
import p024b9.C1062t0;
import p112hb.AbstractC2949h;
import p185m8.AbstractC5114x;
import za.InterfaceC9913k;

/* JADX INFO: renamed from: ib.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3378i extends AbstractC2650c1 {

    /* JADX INFO: renamed from: r */
    public final InterfaceC2716u1 f9231r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC9913k f9232s;

    /* JADX INFO: renamed from: t */
    public final EnumC3380k f9233t;

    /* JADX INFO: renamed from: u */
    public final List f9234u;

    /* JADX INFO: renamed from: v */
    public final boolean f9235v;

    /* JADX INFO: renamed from: w */
    public final String[] f9236w;

    /* JADX INFO: renamed from: x */
    public final String f9237x;

    public C3378i(InterfaceC2716u1 interfaceC2716u1, InterfaceC9913k interfaceC9913k, EnumC3380k enumC3380k, List list, boolean z10, String... strArr) {
        interfaceC2716u1.getClass();
        interfaceC9913k.getClass();
        enumC3380k.getClass();
        list.getClass();
        strArr.getClass();
        this.f9231r = interfaceC2716u1;
        this.f9232s = interfaceC9913k;
        this.f9233t = enumC3380k;
        this.f9234u = list;
        this.f9235v = z10;
        this.f9236w = strArr;
        C1062t0 c1062t0 = C1062t0.f3215a;
        String strM12699c = enumC3380k.m12699c();
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f9237x = String.format(strM12699c, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // gb.AbstractC2706r0
    /* JADX INFO: renamed from: R0 */
    public List mo9330R0() {
        return this.f9234u;
    }

    @Override // gb.AbstractC2706r0
    /* JADX INFO: renamed from: S0 */
    public C2704q1 mo9331S0() {
        return C2704q1.f7069r.m9585k();
    }

    @Override // gb.AbstractC2706r0
    /* JADX INFO: renamed from: T0 */
    public InterfaceC2716u1 mo9332T0() {
        return this.f9231r;
    }

    @Override // gb.AbstractC2706r0
    /* JADX INFO: renamed from: U0 */
    public boolean mo9258U0() {
        return this.f9235v;
    }

    @Override // gb.AbstractC2687l2
    /* JADX INFO: renamed from: a1 */
    public AbstractC2650c1 mo7032X0(boolean z10) {
        InterfaceC2716u1 interfaceC2716u1Mo9332T0 = mo9332T0();
        InterfaceC9913k interfaceC9913kMo7040v = mo7040v();
        EnumC3380k enumC3380k = this.f9233t;
        List listMo9330R0 = mo9330R0();
        String[] strArr = this.f9236w;
        return new C3378i(interfaceC2716u1Mo9332T0, interfaceC9913kMo7040v, enumC3380k, listMo9330R0, z10, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // gb.AbstractC2687l2
    /* JADX INFO: renamed from: b1 */
    public AbstractC2650c1 mo7034Z0(C2704q1 c2704q1) {
        c2704q1.getClass();
        return this;
    }

    /* JADX INFO: renamed from: c1 */
    public final String m12692c1() {
        return this.f9237x;
    }

    /* JADX INFO: renamed from: d1 */
    public final EnumC3380k m12693d1() {
        return this.f9233t;
    }

    @Override // gb.AbstractC2687l2
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
    public C3378i mo9325d1(AbstractC2949h abstractC2949h) {
        abstractC2949h.getClass();
        return this;
    }

    /* JADX INFO: renamed from: f1 */
    public final C3378i m12695f1(List list) {
        list.getClass();
        InterfaceC2716u1 interfaceC2716u1Mo9332T0 = mo9332T0();
        InterfaceC9913k interfaceC9913kMo7040v = mo7040v();
        EnumC3380k enumC3380k = this.f9233t;
        boolean zMo9258U0 = mo9258U0();
        String[] strArr = this.f9236w;
        return new C3378i(interfaceC2716u1Mo9332T0, interfaceC9913kMo7040v, enumC3380k, list, zMo9258U0, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // gb.AbstractC2706r0
    /* JADX INFO: renamed from: v */
    public InterfaceC9913k mo7040v() {
        return this.f9232s;
    }

    public /* synthetic */ C3378i(InterfaceC2716u1 interfaceC2716u1, InterfaceC9913k interfaceC9913k, EnumC3380k enumC3380k, List list, boolean z10, String[] strArr, int i10, AbstractC1043k abstractC1043k) {
        this(interfaceC2716u1, interfaceC9913k, enumC3380k, (i10 & 8) != 0 ? AbstractC5114x.m20800o() : list, (i10 & 16) != 0 ? false : z10, strArr);
    }
}
