package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class pn1 {

    /* JADX INFO: renamed from: a */
    public final boolean f8412a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f8413b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f8414c;

    /* JADX INFO: renamed from: d */
    public final boolean f8415d;

    /* JADX INFO: renamed from: e */
    public final boolean f8416e;

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
        boolean zM4476l;
        boolean z2;
        nn1 nn1Var;
        boolean z3;
        pi2Var.getClass();
        boolean z4 = false;
        this.f8412a = ji2Var != null && ji2Var.f5054c && pi2Var.f8366c;
        List list = ji2Var != null ? ji2Var.f5052a : null;
        list = list == null ? be0.f819h : list;
        ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(xe1.m6116d0((String) it.next()));
        }
        this.f8413b = arrayList;
        Set set = pi2Var.f8364a;
        ArrayList arrayList2 = new ArrayList(AbstractC0179eu.m1421B(set, 10));
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList2.add(xe1.m6116d0((String) it2.next()));
        }
        this.f8414c = arrayList2;
        if (this.f8412a) {
            z = true;
        } else {
            ArrayList<on1> arrayList3 = this.f8413b;
            if (arrayList3 == null || !arrayList3.isEmpty()) {
                for (on1 on1Var : arrayList3) {
                    ArrayList<on1> arrayList4 = this.f8414c;
                    if (arrayList4 == null || !arrayList4.isEmpty()) {
                        for (on1 on1Var2 : arrayList4) {
                            String str = on1Var.f7735c;
                            on1Var2.getClass();
                            String str2 = on1Var2.f7735c;
                            if (!t11.m5086l(on1Var.f7733a, on1Var2.f7733a) || on1Var.f7736d != on1Var2.f7736d) {
                                zM4476l = false;
                                if (zM4476l) {
                                    z2 = true;
                                    break;
                                }
                            } else {
                                nn1 nn1Var2 = on1Var.f7734b;
                                nn1 nn1Var3 = nn1.f7261h;
                                if (nn1Var2 == nn1Var3 || (nn1Var = on1Var2.f7734b) == nn1Var3) {
                                    zM4476l = true;
                                    if (zM4476l) {
                                    }
                                } else {
                                    nn1 nn1Var4 = nn1.f7262i;
                                    if (nn1Var2 == nn1Var4 && nn1Var == nn1Var4) {
                                        zM4476l = str.equals(str2);
                                    } else if (nn1Var2 == nn1Var4) {
                                        zM4476l = rg3.m4476l(str, str2);
                                    } else if (nn1Var == nn1Var4) {
                                        zM4476l = rg3.m4476l(str2, str);
                                    } else if (str.equals(str2) || rg3.m4476l(str, str2) || rg3.m4476l(str2, str)) {
                                    }
                                    if (zM4476l) {
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
        this.f8415d = z;
        if (z) {
            if (!(ji2Var != null && ji2Var.f5054c)) {
                boolean z5 = (ji2Var != null && ji2Var.f5053b) && pi2Var.f8365b;
                if (z5) {
                    z4 = true;
                }
            }
        }
        this.f8416e = z4;
    }
}
