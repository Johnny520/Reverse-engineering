package p255r4;

import p000a.AbstractC0000a;
import p326w4.C4682b;
import p326w4.C4683c;
import p326w4.InterfaceC4685e;
import p376z4.C6090d;

/* JADX INFO: renamed from: r4.t0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3698t0 extends AbstractC3682l0 {

    /* JADX INFO: renamed from: k */
    public final InterfaceC4685e f12032k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3698t0(InterfaceC4685e interfaceC4685e) {
        super(4, (interfaceC4685e.size() * 2) + 4);
        this.f12032k = interfaceC4685e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: a */
    public final void mo7638a(C3689p c3689p) {
        C3674h0 c3674h0 = c3689p.f12005g;
        InterfaceC4685e interfaceC4685e = this.f12032k;
        int size = interfaceC4685e.size();
        for (int i9 = 0; i9 < size; i9++) {
            c3674h0.m7664t(interfaceC4685e.getType(i9));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: b */
    public final EnumC3662b0 mo7639b() {
        return EnumC3662b0.f11890t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3682l0
    /* JADX INFO: renamed from: e */
    public final int mo7640e(AbstractC3682l0 abstractC3682l0) {
        InterfaceC4685e interfaceC4685e = ((C3698t0) abstractC3682l0).f12032k;
        C4682b c4682b = C4682b.f15591i;
        InterfaceC4685e interfaceC4685e2 = this.f12032k;
        int size = interfaceC4685e2.size();
        int size2 = interfaceC4685e.size();
        int iMin = Math.min(size, size2);
        for (int i9 = 0; i9 < iMin; i9++) {
            int iCompareTo = interfaceC4685e2.getType(i9).f15648g.compareTo(interfaceC4685e.getType(i9).f15648g);
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        C4682b c4682b = C4682b.f15591i;
        InterfaceC4685e interfaceC4685e = this.f12032k;
        int size = interfaceC4685e.size();
        int iHashCode = 0;
        for (int i9 = 0; i9 < size; i9++) {
            iHashCode = (iHashCode * 31) + interfaceC4685e.getType(i9).f15648g.hashCode();
        }
        return iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3682l0
    /* JADX INFO: renamed from: l */
    public final String mo7642l() {
        throw new RuntimeException("unsupported");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3682l0
    /* JADX INFO: renamed from: m */
    public final void mo7643m(C3689p c3689p, C6090d c6090d) {
        C3674h0 c3674h0 = c3689p.f12005g;
        InterfaceC4685e interfaceC4685e = this.f12032k;
        int size = interfaceC4685e.size();
        if (c6090d.m10829d()) {
            c6090d.m10827b(0, m7682g().concat(" type_list"));
            c6090d.m10827b(4, "  size: ".concat(AbstractC0000a.m48Y0(size)));
            for (int i9 = 0; i9 < size; i9++) {
                C4683c type = interfaceC4685e.getType(i9);
                c6090d.m10827b(2, "  " + AbstractC0000a.m46X0(c3674h0.m7659o(type)) + " // " + type.mo4901a());
            }
        }
        c6090d.m10835k(size);
        for (int i10 = 0; i10 < size; i10++) {
            c6090d.m10836l(c3674h0.m7659o(interfaceC4685e.getType(i10)));
        }
    }
}
