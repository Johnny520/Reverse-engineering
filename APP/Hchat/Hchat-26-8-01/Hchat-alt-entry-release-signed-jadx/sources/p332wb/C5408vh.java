package p332wb;

import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p117i0.C1851l;
import p144k.C2209s1;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.vh */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5408vh implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21407g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f21408h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f21409i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5408vh(int i9, String str, String str2) {
        this.f21407g = 1;
        this.f21408h = str;
        this.f21409i = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f21407g) {
            case 0:
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objM4514P = c1836h0.m4514P();
                    if (objM4514P == C1851l.f6155a) {
                        objM4514P = new C2209s1(25);
                        c1836h0.m4545k0(objM4514P);
                    }
                    AbstractC4955ho.m9704x3(this.f21408h, this.f21409i, (InterfaceC1220a) objM4514P, c1836h0, 384);
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9688v4(this.f21408h, this.f21409i, (C1836h0) obj, AbstractC1874r.m4617C(1));
                break;
            default:
                C1836h0 c1836h02 = (C1836h0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC4955ho.m9296B1("版本", this.f21408h, null, c1836h02, 6, 4);
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    AbstractC4955ho.m9296B1("宿主", this.f21409i, null, c1836h02, 6, 4);
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    AbstractC4955ho.m9296B1("作者", "。。", null, c1836h02, 54, 4);
                } else {
                    c1836h02.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5408vh(String str, String str2, int i9, byte b10) {
        this.f21407g = i9;
        this.f21408h = str;
        this.f21409i = str2;
    }
}
