package p000;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: q1 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0601q1 implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f8681h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ List f8682i;

    public /* synthetic */ C0601q1(int i, List list) {
        this.f8681h = i;
        this.f8682i = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo12g(Object obj, Object obj2) {
        Object next;
        ow1 ow1Var;
        Object next2;
        int i = this.f8681h;
        a83 a83Var = a83.f116a;
        List list = this.f8682i;
        switch (i) {
            case 0:
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj;
                int iIntValue = ((Integer) obj2).intValue();
                go0 go0Var = (go0) interfaceC0596px;
                if (go0Var.m1958O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC0731te.m5202c(list, go0Var, 0);
                } else {
                    go0Var.m1961R();
                }
                return a83Var;
            case 1:
                InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                go0 go0Var2 = (go0) interfaceC0596px2;
                if (go0Var2.m1958O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC0731te.m5212h(list, go0Var2, 0);
                } else {
                    go0Var2.m1961R();
                }
                return a83Var;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC0731te.m5212h(list, (InterfaceC0596px) obj, pp0.m3902N(1));
                return a83Var;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC0731te.m5202c(list, (InterfaceC0596px) obj, pp0.m3902N(1));
                return a83Var;
            case 4:
                ((Integer) obj2).getClass();
                s11.m4708n(list, (InterfaceC0596px) obj, pp0.m3902N(1));
                return a83Var;
            default:
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                charSequence.getClass();
                if (list.size() == 1) {
                    int size = list.size();
                    if (size == 0) {
                        um2.m5519i("List is empty.");
                        return null;
                    }
                    if (size != 1) {
                        C0676s.m4651j("List has more than one element.");
                        return null;
                    }
                    String str = (String) list.get(0);
                    int iM4004q0 = pv2.m4004q0(charSequence, str, iIntValue3, false, 4);
                    ow1Var = iM4004q0 < 0 ? null : new ow1(Integer.valueOf(iM4004q0), str);
                } else {
                    if (iIntValue3 < 0) {
                        iIntValue3 = 0;
                    }
                    c11 c11Var = new c11(iIntValue3, charSequence.length(), 1);
                    boolean z = charSequence instanceof String;
                    int i2 = c11Var.f27j;
                    int i3 = c11Var.f26i;
                    if (z) {
                        if ((i2 > 0 && iIntValue3 <= i3) || (i2 < 0 && i3 <= iIntValue3)) {
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        String str2 = (String) next2;
                                        if (str2.regionMatches(0, (String) charSequence, iIntValue3, str2.length())) {
                                        }
                                    } else {
                                        next2 = null;
                                    }
                                }
                                String str3 = (String) next2;
                                if (str3 != null) {
                                    ow1Var = new ow1(Integer.valueOf(iIntValue3), str3);
                                } else if (iIntValue3 != i3) {
                                    iIntValue3 += i2;
                                }
                            }
                        }
                    } else if ((i2 > 0 && iIntValue3 <= i3) || (i2 < 0 && i3 <= iIntValue3)) {
                        int i4 = iIntValue3;
                        while (true) {
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    String str4 = (String) next;
                                    if (pv2.m4011x0(str4, 0, charSequence, i4, str4.length(), false)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            String str5 = (String) next;
                            if (str5 != null) {
                                ow1Var = new ow1(Integer.valueOf(i4), str5);
                            } else if (i4 != i3) {
                                i4 += i2;
                            }
                        }
                    }
                }
                if (ow1Var != null) {
                    return new ow1(ow1Var.f7862h, Integer.valueOf(((String) ow1Var.f7863i).length()));
                }
                return null;
        }
    }

    public /* synthetic */ C0601q1(List list, int i, int i2) {
        this.f8681h = i2;
        this.f8682i = list;
    }
}
