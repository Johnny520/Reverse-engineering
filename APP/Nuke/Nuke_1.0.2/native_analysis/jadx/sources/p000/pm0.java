package p000;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class pm0 extends o82 {

    /* JADX INFO: renamed from: d */
    public static final vf1 f8404d;

    /* JADX INFO: renamed from: b */
    public final List f8405b;

    /* JADX INFO: renamed from: c */
    public final List f8406c;

    static {
        o72 o72Var = vf1.f11926d;
        f8404d = AbstractC0731te.m5175C("application/x-www-form-urlencoded");
    }

    public pm0(ArrayList arrayList, ArrayList arrayList2) {
        arrayList.getClass();
        arrayList2.getClass();
        this.f8405b = wg3.m5896i(arrayList);
        this.f8406c = wg3.m5896i(arrayList2);
    }

    @Override // p000.o82
    /* JADX INFO: renamed from: a */
    public final long mo3042a() {
        return m3882e(null, true);
    }

    @Override // p000.o82
    /* JADX INFO: renamed from: b */
    public final vf1 mo3043b() {
        return f8404d;
    }

    @Override // p000.o82
    /* JADX INFO: renamed from: d */
    public final void mo3044d(InterfaceC0504nn interfaceC0504nn) throws EOFException {
        m3882e(interfaceC0504nn, false);
    }

    /* JADX INFO: renamed from: e */
    public final long m3882e(InterfaceC0504nn interfaceC0504nn, boolean z) throws EOFException {
        C0209fn c0209fnMo1684l;
        if (z) {
            c0209fnMo1684l = new C0209fn();
        } else {
            interfaceC0504nn.getClass();
            c0209fnMo1684l = interfaceC0504nn.mo1684l();
        }
        List list = this.f8405b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                c0209fnMo1684l.m1670E(38);
            }
            c0209fnMo1684l.m1675J((String) list.get(i));
            c0209fnMo1684l.m1670E(61);
            c0209fnMo1684l.m1675J((String) this.f8406c.get(i));
        }
        if (!z) {
            return 0L;
        }
        long j = c0209fnMo1684l.f3068i;
        c0209fnMo1684l.m1679g();
        return j;
    }
}
