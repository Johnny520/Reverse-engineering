package gb;

import java.util.List;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p229p9.InterfaceC6004h;
import p229p9.InterfaceC6018l1;

/* JADX INFO: renamed from: gb.m0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2689m0 extends AbstractC2655d2 {

    /* JADX INFO: renamed from: c */
    public final InterfaceC6018l1[] f7034c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2643a2[] f7035d;

    /* JADX INFO: renamed from: e */
    public final boolean f7036e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2689m0(List list, List list2) {
        this((InterfaceC6018l1[]) list.toArray(new InterfaceC6018l1[0]), (InterfaceC2643a2[]) list2.toArray(new InterfaceC2643a2[0]), false, 4, null);
        list.getClass();
        list2.getClass();
    }

    @Override // gb.AbstractC2655d2
    /* JADX INFO: renamed from: b */
    public boolean mo9356b() {
        return this.f7036e;
    }

    @Override // gb.AbstractC2655d2
    /* JADX INFO: renamed from: e */
    public InterfaceC2643a2 mo7021e(AbstractC2706r0 abstractC2706r0) {
        abstractC2706r0.getClass();
        InterfaceC6004h interfaceC6004hMo5602u = abstractC2706r0.mo9332T0().mo5602u();
        InterfaceC6018l1 interfaceC6018l1 = interfaceC6004hMo5602u instanceof InterfaceC6018l1 ? (InterfaceC6018l1) interfaceC6004hMo5602u : null;
        if (interfaceC6018l1 == null) {
            return null;
        }
        int index = interfaceC6018l1.getIndex();
        InterfaceC6018l1[] interfaceC6018l1Arr = this.f7034c;
        if (index >= interfaceC6018l1Arr.length || !AbstractC1061t.m3842c(interfaceC6018l1Arr[index].mo5591o(), interfaceC6018l1.mo5591o())) {
            return null;
        }
        return this.f7035d[index];
    }

    @Override // gb.AbstractC2655d2
    /* JADX INFO: renamed from: f */
    public boolean mo7022f() {
        return this.f7035d.length == 0;
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC2643a2[] m9511i() {
        return this.f7035d;
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC6018l1[] m9512j() {
        return this.f7034c;
    }

    public C2689m0(InterfaceC6018l1[] interfaceC6018l1Arr, InterfaceC2643a2[] interfaceC2643a2Arr, boolean z10) {
        interfaceC6018l1Arr.getClass();
        interfaceC2643a2Arr.getClass();
        this.f7034c = interfaceC6018l1Arr;
        this.f7035d = interfaceC2643a2Arr;
        this.f7036e = z10;
        int length = interfaceC6018l1Arr.length;
        int length2 = interfaceC2643a2Arr.length;
    }

    public /* synthetic */ C2689m0(InterfaceC6018l1[] interfaceC6018l1Arr, InterfaceC2643a2[] interfaceC2643a2Arr, boolean z10, int i10, AbstractC1043k abstractC1043k) {
        this(interfaceC6018l1Arr, interfaceC2643a2Arr, (i10 & 4) != 0 ? false : z10);
    }
}
