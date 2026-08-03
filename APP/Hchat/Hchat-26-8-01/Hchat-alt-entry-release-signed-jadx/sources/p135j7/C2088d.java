package p135j7;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p152k7.AbstractC2331a;
import p152k7.AbstractC2332b;
import p166l7.C2525m;
import p209o7.C3076j;
import p229p7.C3337g;
import p229p7.C3341k;
import p257r7.C3716f;
import p257r7.C3726p;

/* JADX INFO: renamed from: j7.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2088d extends AbstractC2332b implements Comparator {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p209o7.C3068b
    /* JADX INFO: renamed from: V */
    public final void mo5143V() {
        HashMap map = new HashMap();
        Iterator it = this.f9926k.iterator();
        while (true) {
            int i9 = 0;
            if (!it.hasNext()) {
                break;
            }
            C3076j c3076j = (C3076j) it.next();
            Iterator it2 = c3076j.f9949m.f9926k.iterator();
            while (it2.hasNext()) {
                int size = ((C2525m) it2.next()).f8159o.f9926k.size();
                if (size > i9) {
                    i9 = size;
                }
            }
            byte bM5924V = c3076j.f9948l.m5924V();
            Integer num = (Integer) map.get(Byte.valueOf(bM5924V));
            if (num == null || i9 > num.intValue()) {
                map.put(Byte.valueOf(bM5924V), Integer.valueOf(i9));
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            byte bByteValue = ((Byte) entry.getKey()).byteValue();
            int iIntValue = ((Integer) entry.getValue()).intValue();
            C3076j c3076jM5144k0 = m5144k0(bByteValue);
            C3726p c3726p = (C3726p) c3076jM5144k0.f9948l.f8152p;
            c3726p.m7738N(iIntValue);
            c3726p.f12099m.mo633k(c3726p.f12076k.length / 4);
            for (C2525m c2525m : c3076jM5144k0.f9949m.f9926k) {
                if ((((C3341k) c2525m.f8138m).f10752s.get() & 3) != 1) {
                    C3716f c3716f = ((C3341k) c2525m.f8138m).f10753t;
                    if (iIntValue != c3716f.f12083n) {
                        c3716f.mo633k(iIntValue);
                        c2525m.f8159o.mo6520d0(iIntValue, false);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Integer.compare(((C3337g) ((C3076j) obj).f9948l.f8138m).f10739r.get(), ((C3337g) ((C3076j) obj2).f9948l.f8138m).f10739r.get());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k0 */
    public final C3076j m5144k0(byte b10) {
        C3076j c3076j = (C3076j) m6524Q((b10 & 255) - 1);
        if (c3076j != null && c3076j.f9948l.m5924V() == b10) {
            return c3076j;
        }
        for (C3076j c3076j2 : this.f9926k) {
            if (c3076j2 != null && c3076j2.f9948l.m5924V() == b10) {
                return c3076j2;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.InterfaceC2334d
    /* JADX INFO: renamed from: n */
    public final AbstractC2331a mo1892n() {
        return new C3076j();
    }

    @Override // p209o7.C3068b
    /* JADX INFO: renamed from: X */
    public final void mo5141X() {
    }
}
