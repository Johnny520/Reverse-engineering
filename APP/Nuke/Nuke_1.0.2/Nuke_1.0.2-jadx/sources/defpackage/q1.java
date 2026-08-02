package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q1 implements mn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ List i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ q1(int i, List list) {
        this.h = i;
        this.i = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    @Override // defpackage.mn0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj, Object obj2) {
        Object next;
        ow1 ow1Var;
        Object next2;
        int i = this.h;
        a83 a83Var = a83.a;
        List list = this.i;
        switch (i) {
            case 0:
                px pxVar = (px) obj;
                int iIntValue = ((Integer) obj2).intValue();
                go0 go0Var = (go0) pxVar;
                if (go0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    te.c(list, go0Var, 0);
                } else {
                    go0Var.R();
                }
                return a83Var;
            case 1:
                px pxVar2 = (px) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                go0 go0Var2 = (go0) pxVar2;
                if (go0Var2.O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    te.h(list, go0Var2, 0);
                } else {
                    go0Var2.R();
                }
                return a83Var;
            case 2:
                ((Integer) obj2).getClass();
                te.h(list, (px) obj, pp0.N(1));
                return a83Var;
            case 3:
                ((Integer) obj2).getClass();
                te.c(list, (px) obj, pp0.N(1));
                return a83Var;
            case 4:
                ((Integer) obj2).getClass();
                s11.n(list, (px) obj, pp0.N(1));
                return a83Var;
            default:
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                charSequence.getClass();
                if (list.size() == 1) {
                    int size = list.size();
                    if (size == 0) {
                        um2.i("List is empty.");
                        return null;
                    }
                    if (size != 1) {
                        s.j("List has more than one element.");
                        return null;
                    }
                    String str = (String) list.get(0);
                    int iQ0 = pv2.q0(charSequence, str, iIntValue3, false, 4);
                    ow1Var = iQ0 < 0 ? null : new ow1(Integer.valueOf(iQ0), str);
                } else {
                    if (iIntValue3 < 0) {
                        iIntValue3 = 0;
                    }
                    c11 c11Var = new c11(iIntValue3, charSequence.length(), 1);
                    boolean z = charSequence instanceof String;
                    int i2 = c11Var.j;
                    int i3 = c11Var.i;
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
                                    if (pv2.x0(str4, 0, charSequence, i4, str4.length(), false)) {
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
                    return new ow1(ow1Var.h, Integer.valueOf(((String) ow1Var.i).length()));
                }
                return null;
        }
    }

    public /* synthetic */ q1(List list, int i, int i2) {
        this.h = i2;
        this.i = list;
    }
}
