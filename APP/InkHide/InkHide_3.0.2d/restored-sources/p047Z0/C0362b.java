package p047Z0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p006D.AbstractC0079h;
import p011F0.AbstractC0123k;
import p011F0.AbstractC0125m;
import p011F0.C0131s;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;
import p035S.C0246b;
import p043W0.C0353a;
import p050a1.C0368a;
import p050a1.C0369b;

/* JADX INFO: renamed from: Z0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0362b extends AbstractC0079h {

    /* JADX INFO: renamed from: d */
    public C0369b f850d;

    /* JADX INFO: renamed from: e */
    public C0368a f851e;

    /* JADX INFO: renamed from: f */
    public C0361a f852f;

    /* JADX INFO: renamed from: g */
    public C0361a f853g;

    /* JADX INFO: renamed from: h */
    public C0353a f854h;

    /* JADX INFO: renamed from: i */
    public ArrayList f855i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public static void m620Y(C0362b c0362b, String str) {
        AbstractC0223g.m418e(str, "className");
        AbstractC0174d.m359o(5, "matchType");
        C0361a c0361a = new C0361a();
        c0361a.m617Y(str, 5, false);
        c0362b.f852f = c0361a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public static void m621a0(C0362b c0362b, int i2) {
        AbstractC0174d.m359o(1, "matchType");
        C0368a c0368a = new C0368a(0);
        c0368a.f864e = i2;
        c0368a.f865f = 1;
        c0362b.f851e = c0368a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public static void m622b0(C0362b c0362b, String str) {
        AbstractC0174d.m359o(5, "matchType");
        c0362b.f850d = new C0369b(str, 5, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0 */
    public static void m623e0(C0362b c0362b, List list) {
        AbstractC0174d.m359o(1, "matchType");
        ArrayList arrayList = new ArrayList(AbstractC0125m.m289c0(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C0369b((String) it.next(), 1, false));
        }
        c0362b.f855i = AbstractC0123k.m283y0(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public final int m624Z(C0246b c0246b) {
        int iM464d;
        C0369b c0369b = this.f850d;
        int iM631Y = c0369b != null ? c0369b.m631Y(c0246b) : 0;
        C0368a c0368a = this.f851e;
        int iM630Y = c0368a != null ? c0368a.m630Y(c0246b) : 0;
        C0361a c0361a = this.f852f;
        int iM618Z = c0361a != null ? c0361a.m618Z(c0246b) : 0;
        C0361a c0361a2 = this.f853g;
        int iM618Z2 = c0361a2 != null ? c0361a2.m618Z(c0246b) : 0;
        C0353a c0353a = this.f854h;
        int iM607Y = c0353a != null ? c0353a.m607Y(c0246b) : 0;
        ArrayList arrayList = this.f855i;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC0125m.m289c0(arrayList));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(((C0369b) it.next()).m631Y(c0246b)));
            }
            iM464d = c0246b.m464d(AbstractC0123k.m280v0(arrayList2));
        } else {
            iM464d = 0;
        }
        c0246b.m470j(14);
        c0246b.m461a(13, 0);
        c0246b.m461a(12, 0);
        c0246b.m461a(11, 0);
        c0246b.m461a(10, 0);
        c0246b.m461a(9, 0);
        c0246b.m461a(8, 0);
        c0246b.m461a(7, iM464d);
        c0246b.m461a(6, 0);
        c0246b.m461a(5, 0);
        c0246b.m461a(4, iM607Y);
        c0246b.m461a(3, iM618Z2);
        c0246b.m461a(2, iM618Z);
        c0246b.m461a(1, iM630Y);
        c0246b.m461a(0, iM631Y);
        int iM465e = c0246b.m465e();
        c0246b.m466f(iM465e);
        return iM465e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public final void m625c0(String... strArr) {
        C0364d c0364d;
        C0353a c0353a = new C0353a(2);
        c0353a.f827e = AbstractC0123k.m283y0(C0131s.f426a);
        for (String str : strArr) {
            if (str != null) {
                c0364d = new C0364d();
                C0361a c0361a = new C0361a();
                c0361a.m617Y(str, 5, false);
                c0364d.f857d = c0361a;
            } else {
                c0364d = null;
            }
            List arrayList = c0353a.f827e;
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            c0353a.f827e = arrayList;
            arrayList.add(c0364d);
        }
        this.f854h = c0353a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    public final void m626d0(String... strArr) {
        AbstractC0223g.m418e(strArr, "usingStrings");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new C0369b(str, 5, false));
        }
        this.f855i = AbstractC0123k.m283y0(arrayList);
    }
}
