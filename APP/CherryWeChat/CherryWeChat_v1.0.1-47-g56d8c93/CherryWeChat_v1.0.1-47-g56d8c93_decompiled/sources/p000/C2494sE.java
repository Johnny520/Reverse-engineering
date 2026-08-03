package p000;

import androidx.recyclerview.widget.AbstractC1166o;

/* JADX INFO: renamed from: sE */
/* JADX INFO: loaded from: classes.dex */
public final class C2494sE {

    /* JADX INFO: renamed from: a */
    public final C2520sy f8756a = new C2520sy(0);

    /* JADX INFO: renamed from: b */
    public final C2640vp f8757b = new C2640vp();

    /* JADX INFO: renamed from: a */
    public final void m4971a(AbstractC1166o abstractC1166o, C2208lv c2208lv) {
        C2520sy c2520sy = this.f8756a;
        C2408qE c2408qEM4846a = (C2408qE) c2520sy.get(abstractC1166o);
        if (c2408qEM4846a == null) {
            c2408qEM4846a = C2408qE.m4846a();
            c2520sy.put(abstractC1166o, c2408qEM4846a);
        }
        c2408qEM4846a.f8445c = c2208lv;
        c2408qEM4846a.f8443a |= 8;
    }

    /* JADX INFO: renamed from: b */
    public final C2208lv m4972b(AbstractC1166o abstractC1166o, int i) {
        C2408qE c2408qE;
        C2208lv c2208lv;
        C2520sy c2520sy = this.f8756a;
        int iM5000d = c2520sy.m5000d(abstractC1166o);
        if (iM5000d >= 0 && (c2408qE = (C2408qE) c2520sy.m5003j(iM5000d)) != null) {
            int i2 = c2408qE.f8443a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                c2408qE.f8443a = i3;
                if (i == 4) {
                    c2208lv = c2408qE.f8444b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c2208lv = c2408qE.f8445c;
                }
                if ((i3 & 12) == 0) {
                    c2520sy.mo4h(iM5000d);
                    c2408qE.f8443a = 0;
                    c2408qE.f8444b = null;
                    c2408qE.f8445c = null;
                    C2408qE.f8442d.mo1934a(c2408qE);
                }
                return c2208lv;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m4973c(AbstractC1166o abstractC1166o) {
        C2408qE c2408qE = (C2408qE) this.f8756a.get(abstractC1166o);
        if (c2408qE == null) {
            return;
        }
        c2408qE.f8443a &= -2;
    }

    /* JADX INFO: renamed from: d */
    public final void m4974d(AbstractC1166o abstractC1166o) {
        C2640vp c2640vp = this.f8757b;
        int iM5172g = c2640vp.m5172g() - 1;
        while (true) {
            if (iM5172g < 0) {
                break;
            }
            if (abstractC1166o == c2640vp.m5173h(iM5172g)) {
                Object[] objArr = c2640vp.f9152c;
                Object obj = objArr[iM5172g];
                Object obj2 = AbstractC1406fG.f4985d;
                if (obj != obj2) {
                    objArr[iM5172g] = obj2;
                    c2640vp.f9150a = true;
                }
            } else {
                iM5172g--;
            }
        }
        C2408qE c2408qE = (C2408qE) this.f8756a.remove(abstractC1166o);
        if (c2408qE != null) {
            c2408qE.f8443a = 0;
            c2408qE.f8444b = null;
            c2408qE.f8445c = null;
            C2408qE.f8442d.mo1934a(c2408qE);
        }
    }
}
