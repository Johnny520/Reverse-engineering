package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yg1 extends qp0 {

    /* JADX INFO: renamed from: A */
    public ah1 f13444A;

    /* JADX INFO: renamed from: t */
    public lv2 f13445t;

    /* JADX INFO: renamed from: u */
    public C0566p3 f13446u;

    /* JADX INFO: renamed from: v */
    public C0030at f13447v;

    /* JADX INFO: renamed from: w */
    public C0030at f13448w;

    /* JADX INFO: renamed from: x */
    public ix1 f13449x;

    /* JADX INFO: renamed from: y */
    public ArrayList f13450y;

    /* JADX INFO: renamed from: z */
    public ArrayList f13451z;

    /* JADX INFO: renamed from: c0 */
    public static void m6269c0(yg1 yg1Var, int i) {
        yg1Var.getClass();
        C0566p3 c0566p3 = new C0566p3(0);
        c0566p3.f7956u = i;
        c0566p3.f7957v = 1;
        yg1Var.f13446u = c0566p3;
    }

    @Override // p000.qp0
    /* JADX INFO: renamed from: D */
    public final int mo170D(mj0 mj0Var) {
        int iM3115f;
        int iM3117h;
        int iM3117h2;
        byte b;
        lv2 lv2Var = this.f13445t;
        int iMo170D = lv2Var != null ? lv2Var.mo170D(mj0Var) : 0;
        C0566p3 c0566p3 = this.f13446u;
        int iMo170D2 = c0566p3 != null ? c0566p3.mo170D(mj0Var) : 0;
        C0030at c0030at = this.f13447v;
        int iMo170D3 = c0030at != null ? c0030at.mo170D(mj0Var) : 0;
        C0030at c0030at2 = this.f13448w;
        int iMo170D4 = c0030at2 != null ? c0030at2.mo170D(mj0Var) : 0;
        ix1 ix1Var = this.f13449x;
        int iMo170D5 = ix1Var != null ? ix1Var.mo170D(mj0Var) : 0;
        ArrayList<lv2> arrayList = this.f13450y;
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
        ArrayList arrayList3 = this.f13451z;
        if (arrayList3 != null) {
            ArrayList arrayList4 = new ArrayList(AbstractC0179eu.m1421B(arrayList3, 10));
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                int i = ((as1) it.next()).f363b;
                if (i == 0) {
                    throw null;
                }
                switch (i) {
                    case 1:
                        b = 1;
                        break;
                    case 2:
                        b = 2;
                        break;
                    case 3:
                        b = 3;
                        break;
                    case 4:
                        b = 4;
                        break;
                    case 5:
                        b = 5;
                        break;
                    case AIChatConfig.DefaultContextRounds /* 6 */:
                        b = 6;
                        break;
                    default:
                        throw null;
                }
                arrayList4.add(new s63(b));
            }
            int size = arrayList4.size();
            byte[] bArr = new byte[size];
            Iterator it2 = arrayList4.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                bArr[i2] = ((s63) it2.next()).f9948h;
                i2++;
            }
            mj0Var.m3123n(1, size, 1);
            for (int i3 = size - 1; -1 < i3; i3--) {
                mj0Var.m3110a(bArr[i3]);
            }
            iM3117h = mj0Var.m3117h();
        } else {
            iM3117h = 0;
        }
        ArrayList arrayList5 = this.f13451z;
        if (arrayList5 != null) {
            ArrayList arrayList6 = new ArrayList(AbstractC0179eu.m1421B(arrayList5, 10));
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                Object obj = ((as1) it3.next()).f362a;
                obj.getClass();
                arrayList6.add(Integer.valueOf(((qp0) obj).mo170D(mj0Var)));
            }
            int[] iArrM1147E0 = AbstractC0142du.m1147E0(arrayList6);
            mj0Var.m3123n(4, iArrM1147E0.length, 4);
            for (int length = iArrM1147E0.length - 1; -1 < length; length--) {
                mj0Var.m3111b(iArrM1147E0[length]);
            }
            iM3117h2 = mj0Var.m3117h();
        } else {
            iM3117h2 = 0;
        }
        ah1 ah1Var = this.f13444A;
        int iMo170D6 = ah1Var != null ? ah1Var.mo170D(mj0Var) : 0;
        mj0Var.m3122m(17);
        mj0Var.m3112c(16, 0);
        mj0Var.m3112c(15, 0);
        mj0Var.m3112c(14, 0);
        mj0Var.m3112c(13, 0);
        mj0Var.m3112c(12, 0);
        mj0Var.m3112c(11, iMo170D6);
        mj0Var.m3112c(10, iM3117h2);
        mj0Var.m3112c(9, iM3117h);
        mj0Var.m3112c(8, 0);
        mj0Var.m3112c(7, iM3115f);
        mj0Var.m3112c(6, 0);
        mj0Var.m3112c(5, 0);
        mj0Var.m3112c(4, iMo170D5);
        mj0Var.m3112c(3, iMo170D4);
        mj0Var.m3112c(2, iMo170D3);
        mj0Var.m3112c(1, iMo170D2);
        mj0Var.m3112c(0, iMo170D);
        int iM3116g = mj0Var.m3116g();
        mj0Var.m3118i(iM3116g);
        return iM3116g;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m6270b0(Class cls) {
        cls.getClass();
        C0030at c0030at = new C0030at();
        C0030at.m270b0(c0030at, i80.m2299b(cls), 6);
        this.f13447v = c0030at;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m6271d0(int i) {
        if (this.f13449x == null) {
            this.f13449x = new ix1();
        }
        ix1 ix1Var = this.f13449x;
        ix1Var.getClass();
        C0566p3 c0566p3 = new C0566p3(1);
        c0566p3.f7956u = i;
        c0566p3.f7957v = i;
        ix1Var.f4828u = c0566p3;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m6272e0(Class... clsArr) {
        hx1 hx1Var;
        ix1 ix1Var = new ix1();
        ix1Var.f4827t = new ArrayList(be0.f819h);
        for (Class cls : clsArr) {
            if (cls != null) {
                hx1Var = new hx1();
                C0030at c0030at = new C0030at();
                C0030at.m270b0(c0030at, i80.m2299b(cls), 6);
                hx1Var.f4167t = c0030at;
            } else {
                hx1Var = null;
            }
            List arrayList = ix1Var.f4827t;
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            ix1Var.f4827t = arrayList;
            arrayList.add(hx1Var);
        }
        this.f13449x = ix1Var;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m6273f0(Class cls) {
        cls.getClass();
        C0030at c0030at = new C0030at();
        C0030at.m270b0(c0030at, i80.m2299b(cls), 6);
        this.f13448w = c0030at;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m6274g0(String str) {
        this.f13445t = new lv2(str, 5);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m6275h0(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new lv2(str, 5));
        }
        this.f13450y = new ArrayList(arrayList);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m6276i0(Number... numberArr) {
        ArrayList arrayList = new ArrayList(numberArr.length);
        for (Number number : numberArr) {
            as1 as1Var = new as1();
            number.getClass();
            if (number instanceof Byte) {
                as1Var.f362a = new le0(number.byteValue());
                as1Var.f363b = 1;
            } else if (number instanceof Short) {
                as1Var.f362a = new qe0(number.shortValue());
                as1Var.f363b = 2;
            } else if (number instanceof Integer) {
                as1Var.f362a = new oe0(number.intValue());
                as1Var.f363b = 3;
            } else if (number instanceof Long) {
                as1Var.f362a = new pe0(number.longValue());
                as1Var.f363b = 4;
            } else if (number instanceof Float) {
                as1Var.f362a = new ne0(number.floatValue());
                as1Var.f363b = 5;
            } else if (number instanceof Double) {
                as1Var.f362a = new me0(number.doubleValue());
                as1Var.f363b = 6;
            }
            arrayList.add(as1Var);
        }
        this.f13451z = new ArrayList(arrayList);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m6277j0(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new lv2(str, 1));
        }
        this.f13450y = new ArrayList(arrayList);
    }
}
