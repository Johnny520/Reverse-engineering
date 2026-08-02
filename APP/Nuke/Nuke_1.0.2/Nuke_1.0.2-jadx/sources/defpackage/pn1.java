package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class pn1 {
    public final boolean a;
    public final ArrayList b;
    public final ArrayList c;
    public final boolean d;
    public final boolean e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[LOOP:2: B:32:0x0082->B:106:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[LOOP:3: B:40:0x009f->B:114:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pn1(ji2 ji2Var, pi2 pi2Var) {
        boolean z;
        boolean zL;
        boolean z2;
        nn1 nn1Var;
        boolean z3;
        pi2Var.getClass();
        boolean z4 = false;
        this.a = ji2Var != null && ji2Var.c && pi2Var.c;
        List list = ji2Var != null ? ji2Var.a : null;
        list = list == null ? be0.h : list;
        ArrayList arrayList = new ArrayList(eu.B(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(xe1.d0((String) it.next()));
        }
        this.b = arrayList;
        Set set = pi2Var.a;
        ArrayList arrayList2 = new ArrayList(eu.B(set, 10));
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList2.add(xe1.d0((String) it2.next()));
        }
        this.c = arrayList2;
        if (this.a) {
            z = true;
        } else {
            ArrayList<on1> arrayList3 = this.b;
            if (arrayList3 == null || !arrayList3.isEmpty()) {
                for (on1 on1Var : arrayList3) {
                    ArrayList<on1> arrayList4 = this.c;
                    if (arrayList4 == null || !arrayList4.isEmpty()) {
                        for (on1 on1Var2 : arrayList4) {
                            String str = on1Var.c;
                            on1Var2.getClass();
                            String str2 = on1Var2.c;
                            if (!t11.l(on1Var.a, on1Var2.a) || on1Var.d != on1Var2.d) {
                                zL = false;
                                if (zL) {
                                    z2 = true;
                                    break;
                                }
                            } else {
                                nn1 nn1Var2 = on1Var.b;
                                nn1 nn1Var3 = nn1.h;
                                if (nn1Var2 == nn1Var3 || (nn1Var = on1Var2.b) == nn1Var3) {
                                    zL = true;
                                    if (zL) {
                                    }
                                } else {
                                    nn1 nn1Var4 = nn1.i;
                                    if (nn1Var2 == nn1Var4 && nn1Var == nn1Var4) {
                                        zL = str.equals(str2);
                                    } else if (nn1Var2 == nn1Var4) {
                                        zL = rg3.l(str, str2);
                                    } else if (nn1Var == nn1Var4) {
                                        zL = rg3.l(str2, str);
                                    } else if (str.equals(str2) || rg3.l(str, str2) || rg3.l(str2, str)) {
                                    }
                                    if (zL) {
                                    }
                                }
                            }
                        }
                        z2 = false;
                        if (!z2) {
                            z3 = true;
                            break;
                        }
                    } else {
                        z2 = false;
                        if (!z2) {
                        }
                    }
                }
                z3 = false;
                if (z3) {
                    z = false;
                }
            } else {
                z3 = false;
                if (z3) {
                }
            }
        }
        this.d = z;
        if (z) {
            if (!(ji2Var != null && ji2Var.c)) {
                boolean z5 = (ji2Var != null && ji2Var.b) && pi2Var.b;
                if (z5) {
                    z4 = true;
                }
            }
        }
        this.e = z4;
    }
}
