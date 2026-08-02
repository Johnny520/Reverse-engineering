package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class at extends qp0 {
    public lv2 t;
    public k11 u;
    public ah1 v;
    public ArrayList w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b0(at atVar, String str, int i) {
        int i2 = (i & 2) != 0 ? 5 : 2;
        atVar.getClass();
        atVar.t = new lv2(str, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qp0
    public final int D(mj0 mj0Var) {
        int iF;
        lv2 lv2Var = this.t;
        int iD = lv2Var != null ? lv2Var.D(mj0Var) : 0;
        k11 k11Var = this.u;
        int iD2 = k11Var != null ? k11Var.D(mj0Var) : 0;
        ah1 ah1Var = this.v;
        int iD3 = ah1Var != null ? ah1Var.D(mj0Var) : 0;
        ArrayList<lv2> arrayList = this.w;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(eu.B(arrayList, 10));
            for (lv2 lv2Var2 : arrayList) {
                lv2Var2.getClass();
                arrayList2.add(Integer.valueOf(lv2Var2.D(mj0Var)));
            }
            iF = mj0Var.f(du.E0(arrayList2));
        } else {
            iF = 0;
        }
        mj0Var.m(12);
        mj0Var.c(11, 0);
        mj0Var.c(10, 0);
        mj0Var.c(9, 0);
        mj0Var.c(8, iF);
        mj0Var.c(7, iD3);
        mj0Var.c(6, 0);
        mj0Var.c(5, 0);
        mj0Var.c(4, iD2);
        mj0Var.c(3, 0);
        mj0Var.c(2, 0);
        mj0Var.c(1, iD);
        mj0Var.c(0, 0);
        int iG = mj0Var.g();
        mj0Var.i(iG);
        return iG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c0(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new lv2(str, 5));
        }
        this.w = new ArrayList(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d0(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new lv2(str, 1));
        }
        this.w = new ArrayList(arrayList);
    }
}
