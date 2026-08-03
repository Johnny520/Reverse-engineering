package p321w;

import p057e1.C0807b;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p119i2.AbstractC1923e0;
import p119i2.C1926g;
import p119i2.C1935k0;
import p119i2.C1939m0;
import p190n2.C2884s;
import p218og.AbstractC3149m;
import p259r9.AbstractC3754e0;
import p276sf.C3967n;
import p345x8.C5709b;

/* JADX INFO: renamed from: w.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4622o implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f15302g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f15303h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1231l f15304i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4622o(InterfaceC1231l interfaceC1231l, InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f15302g = i9;
        this.f15304i = interfaceC1231l;
        this.f15303h = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        int i9 = this.f15302g;
        C3967n c3967n = C3967n.f12976a;
        InterfaceC1809a1 interfaceC1809a1 = this.f15303h;
        InterfaceC1231l interfaceC1231l = this.f15304i;
        switch (i9) {
            case 0:
                C1935k0 c1935k0 = (C1935k0) obj;
                interfaceC1809a1.setValue(c1935k0);
                interfaceC1231l.invoke(c1935k0);
                break;
            case 1:
                C0807b c0807b = (C0807b) obj;
                C1935k0 c1935k02 = (C1935k0) interfaceC1809a1.getValue();
                if (c1935k02 != null) {
                    interfaceC1231l.invoke(Integer.valueOf(c1935k02.f6562b.m4830g(c0807b.f2414a)));
                }
                break;
            case 2:
                C5709b c5709b = (C5709b) obj;
                c5709b.getClass();
                interfaceC1809a1.setValue(c5709b);
                interfaceC1231l.invoke(c5709b);
                break;
            case 3:
                String str = (String) obj;
                str.getClass();
                interfaceC1231l.invoke(str);
                interfaceC1809a1.setValue(Boolean.FALSE);
                break;
            case 4:
                C2884s c2884s = (C2884s) obj;
                c2884s.getClass();
                interfaceC1809a1.setValue(c2884s);
                interfaceC1231l.invoke(c2884s.f9316a.f6529h);
                break;
            default:
                String str2 = (String) obj;
                str2.getClass();
                C2884s c2884s2 = (C2884s) interfaceC1809a1.getValue();
                long j3 = c2884s2.f9317b;
                int i10 = C1939m0.f6574c;
                C1926g c1926g = c2884s2.f9316a;
                int iM7909r = AbstractC3754e0.m7909r((int) (j3 >> 32), 0, c1926g.f6529h.length());
                int i11 = (int) (c2884s2.f9317b & 4294967295L);
                String str3 = c1926g.f6529h;
                int iM7909r2 = AbstractC3754e0.m7909r(i11, 0, str3.length());
                int iMin = Math.min(iM7909r, iM7909r2);
                String string = AbstractC3149m.m6688C0(str3, iMin, Math.max(iM7909r, iM7909r2), str2).toString();
                int length = str2.length() + iMin;
                C2884s c2884s3 = new C2884s(4, string, AbstractC1923e0.m4784b(length, length));
                interfaceC1809a1.setValue(c2884s3);
                interfaceC1231l.invoke(c2884s3.f9316a.f6529h);
                break;
        }
        return c3967n;
    }

    public /* synthetic */ C4622o(InterfaceC1809a1 interfaceC1809a1, InterfaceC1231l interfaceC1231l, int i9) {
        this.f15302g = i9;
        this.f15303h = interfaceC1809a1;
        this.f15304i = interfaceC1231l;
    }
}
