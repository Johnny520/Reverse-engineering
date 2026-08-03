package p321w;

import gg.AbstractC1416l;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p119i2.C1926g;
import p190n2.C2884s;
import p276sf.C3958e;
import p276sf.C3967n;
import p332wb.C5491y2;

/* JADX INFO: renamed from: w.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4598g implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f15152g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1231l f15153h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f15154i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f15155j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4598g(InterfaceC1231l interfaceC1231l, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, int i9) {
        this.f15152g = i9;
        this.f15153h = interfaceC1231l;
        this.f15154i = interfaceC1809a1;
        this.f15155j = interfaceC1809a12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        String strM9782I1;
        switch (this.f15152g) {
            case 0:
                C2884s c2884s = (C2884s) obj;
                this.f15154i.setValue(c2884s);
                InterfaceC1809a1 interfaceC1809a1 = this.f15155j;
                boolean zM3825a = AbstractC1416l.m3825a((String) interfaceC1809a1.getValue(), c2884s.f9316a.f6529h);
                C1926g c1926g = c2884s.f9316a;
                interfaceC1809a1.setValue(c1926g.f6529h);
                if (!zM3825a) {
                    this.f15153h.invoke(c1926g.f6529h);
                }
                break;
            default:
                String str = (String) obj;
                str.getClass();
                C3958e c3958eM9780H1 = C5491y2.m9780H1((String) this.f15154i.getValue());
                if (((Boolean) this.f15155j.getValue()).booleanValue()) {
                    CharSequence charSequence = (CharSequence) c3958eM9780H1.f12961g;
                    if (charSequence.length() == 0) {
                        charSequence = str;
                    }
                    strM9782I1 = C5491y2.m9782I1((String) charSequence, str);
                } else {
                    strM9782I1 = C5491y2.m9782I1(str, (String) c3958eM9780H1.f12962h);
                }
                this.f15153h.invoke(strM9782I1);
                break;
        }
        return C3967n.f12976a;
    }
}
