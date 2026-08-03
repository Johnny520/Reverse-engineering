package p045d5;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;
import p020b5.C0190i;
import p046d6.C0709f;
import p061e5.C0826a;
import p093g5.AbstractC1352a;
import p164l5.C2478a;
import p164l5.C2480b;
import p283t5.InterfaceC4121d;

/* JADX INFO: renamed from: d5.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0690a extends C0694e {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f2102j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0690a(C0190i c0190i, int i9, InterfaceC4121d interfaceC4121d, int i10) {
        super(c0190i, i9, interfaceC4121d);
        this.f2102j = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p045d5.C0694e, p020b5.AbstractC0191j
    /* JADX INFO: renamed from: c */
    public final boolean mo776c(C0826a c0826a) throws IOException {
        C2478a c2478a;
        List<Number> list;
        switch (this.f2102j) {
            case 0:
                C2480b c2480b = (C2480b) this.f2110i;
                int iM5879t = c2480b.m5879t();
                c0826a.write(".array-data ");
                c0826a.m2084z(c2480b.m5879t());
                c0826a.write(10);
                c0826a.m2081w();
                int i9 = c2480b.f8118c + 8;
                if (c2480b.f8121e == 0) {
                    list = Collections.EMPTY_LIST;
                } else {
                    int i10 = c2480b.f8120d;
                    if (i10 == 1) {
                        c2478a = new C2478a(c2480b, i9, 0);
                    } else if (i10 == 2) {
                        c2478a = new C2478a(c2480b, i9, 1);
                    } else if (i10 == 4) {
                        c2478a = new C2478a(c2480b, i9, 2);
                    } else {
                        if (i10 != 8) {
                            throw new C0709f(null, "Invalid element width: %d", Integer.valueOf(i10));
                        }
                        c2478a = new C2478a(c2480b, i9, 3);
                    }
                    list = c2478a;
                }
                String str = iM5879t != 1 ? iM5879t != 2 ? HttpUrl.FRAGMENT_ENCODE_SET : "s" : "t";
                for (Number number : list) {
                    c0826a.m2069A(number.longValue());
                    c0826a.write(str);
                    if (iM5879t == 8) {
                        C0694e.m1862d(c0826a, number.longValue());
                    } else if (iM5879t == 4) {
                        int iIntValue = number.intValue();
                        if (!m1864f(c0826a, iIntValue)) {
                            C0694e.m1863e(c0826a, iIntValue);
                        }
                    }
                    c0826a.write("\n");
                }
                c0826a.m2080u();
                c0826a.write(".end array-data");
                return true;
            default:
                c0826a.write("#Replaced unresolvable odex instruction with a throw\n");
                c0826a.write("throw ");
                ((AbstractC1352a) this.f2110i).getClass();
                m1869l(c0826a, 0);
                return true;
        }
    }
}
