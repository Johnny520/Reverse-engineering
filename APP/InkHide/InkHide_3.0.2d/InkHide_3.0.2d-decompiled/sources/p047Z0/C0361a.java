package p047Z0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p006D.AbstractC0079h;
import p011F0.AbstractC0123k;
import p011F0.AbstractC0125m;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;
import p035S.C0246b;
import p050a1.C0369b;

/* JADX INFO: renamed from: Z0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0361a extends AbstractC0079h {

    /* JADX INFO: renamed from: d */
    public C0369b f847d;

    /* JADX INFO: renamed from: e */
    public C0363c f848e;

    /* JADX INFO: renamed from: f */
    public ArrayList f849f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public final void m617Y(String str, int i2, boolean z2) {
        AbstractC0223g.m418e(str, "className");
        AbstractC0174d.m359o(i2, "matchType");
        this.f847d = new C0369b(str, i2, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public final int m618Z(C0246b c0246b) {
        int iM465e;
        int iM464d;
        int iM464d2;
        C0369b c0369b = this.f847d;
        int iM631Y = c0369b != null ? c0369b.m631Y(c0246b) : 0;
        C0363c c0363c = this.f848e;
        if (c0363c != null) {
            List list = c0363c.f856d;
            if (list != null) {
                ArrayList arrayList = new ArrayList(AbstractC0125m.m289c0(list));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((C0362b) it.next()).m624Z(c0246b)));
                }
                iM464d2 = c0246b.m464d(AbstractC0123k.m280v0(arrayList));
            } else {
                iM464d2 = 0;
            }
            c0246b.m470j(3);
            c0246b.m461a(2, 0);
            c0246b.m461a(0, iM464d2);
            iM465e = c0246b.m465e();
            c0246b.m466f(iM465e);
        } else {
            iM465e = 0;
        }
        ArrayList arrayList2 = this.f849f;
        if (arrayList2 != null) {
            ArrayList arrayList3 = new ArrayList(AbstractC0125m.m289c0(arrayList2));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(Integer.valueOf(((C0369b) it2.next()).m631Y(c0246b)));
            }
            iM464d = c0246b.m464d(AbstractC0123k.m280v0(arrayList3));
        } else {
            iM464d = 0;
        }
        c0246b.m470j(9);
        c0246b.m461a(8, iM464d);
        c0246b.m461a(7, iM465e);
        c0246b.m461a(6, 0);
        c0246b.m461a(5, 0);
        c0246b.m461a(4, 0);
        c0246b.m461a(3, 0);
        c0246b.m461a(2, 0);
        c0246b.m461a(1, iM631Y);
        c0246b.m461a(0, 0);
        int iM465e2 = c0246b.m465e();
        c0246b.m466f(iM465e2);
        return iM465e2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public final void m619a0(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new C0369b(str));
        }
        this.f849f = AbstractC0123k.m283y0(arrayList);
    }
}
