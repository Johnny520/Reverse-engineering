package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: kh */
/* JADX INFO: loaded from: classes.dex */
public final class C2147kh extends AbstractC0828TB {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f7511l;

    /* JADX INFO: renamed from: m */
    public AbstractC0828TB f7512m;

    public /* synthetic */ C2147kh(int i) {
        this.f7511l = i;
    }

    /* JADX INFO: renamed from: N */
    public final int m4332N(C0110Ch c0110Ch) {
        int iM165d;
        int iM165d2;
        int iM164c;
        int iM164c2;
        switch (this.f7511l) {
            case 0:
                C0243Fl c0243Fl = (C0243Fl) this.f7512m;
                int iM515N = c0243Fl != null ? c0243Fl.m515N(c0110Ch) : 0;
                c0110Ch.m170i(3);
                c0110Ch.m162a(2, iM515N);
                c0110Ch.m162a(0, 0);
                int iM165d3 = c0110Ch.m165d();
                c0110Ch.m166e(iM165d3);
                return iM165d3;
            case 1:
                C0182E9 c0182e9 = (C0182E9) this.f7512m;
                int iM371N = c0182e9 != null ? c0182e9.m371N(c0110Ch) : 0;
                c0110Ch.m170i(6);
                c0110Ch.m162a(5, iM371N);
                c0110Ch.m162a(3, 0);
                c0110Ch.m162a(1, 0);
                c0110Ch.m162a(0, 0);
                int iM165d4 = c0110Ch.m165d();
                c0110Ch.m166e(iM165d4);
                return iM165d4;
            default:
                C0850Tr c0850Tr = (C0850Tr) this.f7512m;
                if (c0850Tr != null) {
                    C2435qz c2435qz = c0850Tr.f2697l;
                    int iM4889N = c2435qz != null ? c2435qz.m4889N(c0110Ch) : 0;
                    C0182E9 c0182e92 = c0850Tr.f2698m;
                    int iM371N2 = c0182e92 != null ? c0182e92.m371N(c0110Ch) : 0;
                    C0182E9 c0182e93 = c0850Tr.f2699n;
                    int iM371N3 = c0182e93 != null ? c0182e93.m371N(c0110Ch) : 0;
                    C0294Gt c0294Gt = c0850Tr.f2700o;
                    if (c0294Gt != null) {
                        List<C0251Ft> list = c0294Gt.f994l;
                        if (list != null) {
                            ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(list, 10));
                            for (C0251Ft c0251Ft : list) {
                                if (c0251Ft == null) {
                                    c0251Ft = new C0251Ft();
                                }
                                arrayList.add(Integer.valueOf(c0251Ft.m522N(c0110Ch)));
                            }
                            iM164c2 = c0110Ch.m164c(AbstractC2453ra.m4907q0(arrayList));
                        } else {
                            iM164c2 = 0;
                        }
                        C0243Fl c0243Fl2 = c0294Gt.f995m;
                        int iM515N2 = c0243Fl2 != null ? c0243Fl2.m515N(c0110Ch) : 0;
                        c0110Ch.m170i(2);
                        c0110Ch.m162a(1, iM515N2);
                        c0110Ch.m162a(0, iM164c2);
                        iM165d2 = c0110Ch.m165d();
                        c0110Ch.m166e(iM165d2);
                    } else {
                        iM165d2 = 0;
                    }
                    ArrayList arrayList2 = c0850Tr.f2701p;
                    if (arrayList2 != null) {
                        ArrayList arrayList3 = new ArrayList(AbstractC2539ta.m5019d0(arrayList2, 10));
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(Integer.valueOf(((C2435qz) it.next()).m4889N(c0110Ch)));
                        }
                        iM164c = c0110Ch.m164c(AbstractC2453ra.m4907q0(arrayList3));
                    } else {
                        iM164c = 0;
                    }
                    c0110Ch.m170i(14);
                    c0110Ch.m162a(13, 0);
                    c0110Ch.m162a(12, 0);
                    c0110Ch.m162a(11, 0);
                    c0110Ch.m162a(10, 0);
                    c0110Ch.m162a(9, 0);
                    c0110Ch.m162a(8, 0);
                    c0110Ch.m162a(7, iM164c);
                    c0110Ch.m162a(6, 0);
                    c0110Ch.m162a(5, 0);
                    c0110Ch.m162a(4, iM165d2);
                    c0110Ch.m162a(3, iM371N3);
                    c0110Ch.m162a(2, iM371N2);
                    c0110Ch.m162a(1, 0);
                    c0110Ch.m162a(0, iM4889N);
                    iM165d = c0110Ch.m165d();
                    c0110Ch.m166e(iM165d);
                } else {
                    iM165d = 0;
                }
                c0110Ch.m170i(7);
                c0110Ch.m162a(6, iM165d);
                c0110Ch.m162a(4, 0);
                c0110Ch.m162a(3, 0);
                c0110Ch.m162a(1, 0);
                c0110Ch.m162a(0, 0);
                int iM165d5 = c0110Ch.m165d();
                c0110Ch.m166e(iM165d5);
                return iM165d5;
        }
    }
}
