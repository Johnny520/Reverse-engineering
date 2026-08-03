package p070f0;

import android.view.autofill.AutofillValue;
import java.util.List;
import p000a.AbstractC0000a;
import p014b.C0126e;
import p072f2.InterfaceC1062y;
import p085fg.InterfaceC1231l;
import p117i0.C1845j1;
import p119i2.AbstractC1923e0;
import p119i2.C1926g;
import p119i2.C1939m0;
import p190n2.C2865a;
import p190n2.C2873h;
import p190n2.C2884s;
import p190n2.C2890y;
import p218og.AbstractC3149m;
import p321w.C4618m1;
import p321w.C4629q0;
import p321w.C4642w;
import p373z0.C6066f;

/* JADX INFO: renamed from: f0.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0975g implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f3076g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0977i f3077h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0975g(C0977i c0977i, InterfaceC1062y interfaceC1062y) {
        this.f3076g = 3;
        this.f3077h = c0977i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        int i9 = this.f3076g;
        boolean z9 = false;
        C0977i c0977i = this.f3077h;
        switch (i9) {
            case 0:
                C1845j1 c1845j1 = c0977i.f3086y.f15345t;
                Boolean bool = Boolean.TRUE;
                c1845j1.setValue(bool);
                c0977i.f3086y.f15344s.setValue(bool);
                C4629q0 c4629q0 = c0977i.f3086y;
                AutofillValue autofillValue = ((C6066f) obj).f24547a;
                CharSequence textValue = autofillValue.isText() ? autofillValue.getTextValue() : null;
                textValue.getClass();
                C0977i.m2405n1(c4629q0, (String) textValue, c0977i.f3087z);
                return bool;
            case 1:
                List list = (List) obj;
                if (c0977i.f3086y.m9051d() != null) {
                    C4618m1 c4618m1M9051d = c0977i.f3086y.m9051d();
                    c4618m1M9051d.getClass();
                    list.add(c4618m1M9051d.f15293a);
                    z9 = true;
                }
                return Boolean.valueOf(z9);
            case 2:
                C0977i.m2405n1(c0977i.f3086y, ((C1926g) obj).f6529h, c0977i.f3087z);
                return Boolean.TRUE;
            default:
                C1926g c1926g = (C1926g) obj;
                if (c0977i.f3087z) {
                    C2890y c2890y = c0977i.f3086y.f15330e;
                    if (c2890y != null) {
                        List listM101y0 = AbstractC0000a.m101y0(new C2873h(), new C2865a(c1926g, 1));
                        C4629q0 c4629q02 = c0977i.f3086y;
                        C0126e c0126e = c4629q02.f15329d;
                        C4642w c4642w = c4629q02.f15347v;
                        C2884s c2884sM634l = c0126e.m634l(listM101y0);
                        c2890y.m6292a(null, c2884sM634l);
                        c4642w.invoke(c2884sM634l);
                    } else {
                        C2884s c2884s = c0977i.f3085x;
                        String str = c2884s.f9316a.f6529h;
                        long j3 = c2884s.f9317b;
                        int i10 = C1939m0.f6574c;
                        String string = AbstractC3149m.m6688C0(str, (int) (j3 >> 32), (int) (j3 & 4294967295L), c1926g).toString();
                        int length = c1926g.f6529h.length() + ((int) (c0977i.f3085x.f9317b >> 32));
                        c0977i.f3086y.f15347v.invoke(new C2884s(4, string, AbstractC1923e0.m4784b(length, length)));
                    }
                    z9 = true;
                }
                return Boolean.valueOf(z9);
        }
    }

    public /* synthetic */ C0975g(C0977i c0977i, int i9) {
        this.f3076g = i9;
        this.f3077h = c0977i;
    }
}
