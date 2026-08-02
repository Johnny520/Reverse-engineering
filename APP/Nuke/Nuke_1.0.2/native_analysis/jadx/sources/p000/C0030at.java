package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: at */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0030at extends qp0 {

    /* JADX INFO: renamed from: t */
    public lv2 f370t;

    /* JADX INFO: renamed from: u */
    public k11 f371u;

    /* JADX INFO: renamed from: v */
    public ah1 f372v;

    /* JADX INFO: renamed from: w */
    public ArrayList f373w;

    /* JADX INFO: renamed from: b0 */
    public static void m270b0(C0030at c0030at, String str, int i) {
        int i2 = (i & 2) != 0 ? 5 : 2;
        c0030at.getClass();
        c0030at.f370t = new lv2(str, i2);
    }

    @Override // p000.qp0
    /* JADX INFO: renamed from: D */
    public final int mo170D(mj0 mj0Var) {
        int iM3115f;
        lv2 lv2Var = this.f370t;
        int iMo170D = lv2Var != null ? lv2Var.mo170D(mj0Var) : 0;
        k11 k11Var = this.f371u;
        int iMo170D2 = k11Var != null ? k11Var.mo170D(mj0Var) : 0;
        ah1 ah1Var = this.f372v;
        int iMo170D3 = ah1Var != null ? ah1Var.mo170D(mj0Var) : 0;
        ArrayList<lv2> arrayList = this.f373w;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC0179eu.m1421B(arrayList, 10));
            for (lv2 lv2Var2 : arrayList) {
                lv2Var2.getClass();
                arrayList2.add(Integer.valueOf(lv2Var2.mo170D(mj0Var)));
            }
            iM3115f = mj0Var.m3115f(AbstractC0142du.m1147E0(arrayList2));
        } else {
            iM3115f = 0;
        }
        mj0Var.m3122m(12);
        mj0Var.m3112c(11, 0);
        mj0Var.m3112c(10, 0);
        mj0Var.m3112c(9, 0);
        mj0Var.m3112c(8, iM3115f);
        mj0Var.m3112c(7, iMo170D3);
        mj0Var.m3112c(6, 0);
        mj0Var.m3112c(5, 0);
        mj0Var.m3112c(4, iMo170D2);
        mj0Var.m3112c(3, 0);
        mj0Var.m3112c(2, 0);
        mj0Var.m3112c(1, iMo170D);
        mj0Var.m3112c(0, 0);
        int iM3116g = mj0Var.m3116g();
        mj0Var.m3118i(iM3116g);
        return iM3116g;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m271c0(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new lv2(str, 5));
        }
        this.f373w = new ArrayList(arrayList);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m272d0(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new lv2(str, 1));
        }
        this.f373w = new ArrayList(arrayList);
    }
}
