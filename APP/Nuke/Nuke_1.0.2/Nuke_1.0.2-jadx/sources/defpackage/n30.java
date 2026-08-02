package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class n30 extends m30 {
    public final d42 j;
    public d42 k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0205  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n30(r30 r30Var, o30 o30Var) {
        super(r30Var, o30Var);
        q30 q30Var = o30Var.h;
        String str = o30Var.i.h;
        if (r30Var.equals(r30.l)) {
            String str2 = q30Var.h;
            str2.getClass();
            if (str2.equals("invoke") || str2.equals("invokeExact")) {
                this.j = d42.b(str);
            } else {
                if (str != null) {
                    ConcurrentHashMap concurrentHashMap = d42.l;
                    um2.f("descriptor == null");
                    throw null;
                }
                ConcurrentHashMap concurrentHashMap2 = d42.l;
                d42 d42VarB = (d42) concurrentHashMap2.get(str);
                if (d42VarB == null) {
                    d42VarB = d42.b(str);
                    d42 d42Var = (d42) concurrentHashMap2.putIfAbsent(d42VarB.h, d42VarB);
                    if (d42Var != null) {
                        d42VarB = d42Var;
                    }
                }
                this.j = d42VarB;
            }
        } else {
            if (r30Var.equals(r30.m)) {
                String str3 = q30Var.h;
                str3.getClass();
                switch (str3) {
                }
            }
            if (str != null) {
            }
        }
        this.k = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w53
    public final o43 a() {
        return this.j.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.dz
    public final int e(dz dzVar) {
        m30 m30Var = (m30) dzVar;
        int iCompareTo = this.h.compareTo(m30Var.h);
        if (iCompareTo == 0) {
            iCompareTo = this.i.h.compareTo(m30Var.i.h);
        }
        return iCompareTo != 0 ? iCompareTo : this.j.compareTo(((n30) dzVar).j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.dz
    public final String f() {
        return "method";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int g(boolean z) {
        d42 d42Var = this.j;
        if (!z) {
            if (this.k == null) {
                o43 o43Var = this.h.h;
                d42Var.getClass();
                String str = "(" + o43Var.h + d42Var.h.substring(1);
                Object[] objArr = d42Var.j.i;
                int length = objArr.length;
                wu2 wu2Var = new wu2(length + 1);
                wu2Var.f(0, o43Var);
                int i = 0;
                while (i < length) {
                    int i2 = i + 1;
                    wu2Var.f(i2, objArr[i]);
                    i = i2;
                }
                wu2Var.h = false;
                d42 d42Var2 = new d42(str, d42Var.i, wu2Var);
                d42 d42Var3 = (d42) d42.l.putIfAbsent(str, d42Var2);
                if (d42Var3 != null) {
                    d42Var2 = d42Var3;
                }
                this.k = d42Var2;
            }
            d42Var = this.k;
        }
        wu2 wu2Var2 = d42Var.j;
        int length2 = wu2Var2.i.length;
        int iE = 0;
        for (int i3 = 0; i3 < length2; i3++) {
            iE += ((o43) wu2Var2.e(i3)).e();
        }
        return iE;
    }
}
