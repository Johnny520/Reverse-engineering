package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yg1 extends qp0 {
    public ah1 A;
    public lv2 t;
    public p3 u;
    public at v;
    public at w;
    public ix1 x;
    public ArrayList y;
    public ArrayList z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void c0(yg1 yg1Var, int i) {
        yg1Var.getClass();
        p3 p3Var = new p3(0);
        p3Var.u = i;
        p3Var.v = 1;
        yg1Var.u = p3Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qp0
    public final int D(mj0 mj0Var) {
        int iF;
        int iH;
        int iH2;
        byte b;
        lv2 lv2Var = this.t;
        int iD = lv2Var != null ? lv2Var.D(mj0Var) : 0;
        p3 p3Var = this.u;
        int iD2 = p3Var != null ? p3Var.D(mj0Var) : 0;
        at atVar = this.v;
        int iD3 = atVar != null ? atVar.D(mj0Var) : 0;
        at atVar2 = this.w;
        int iD4 = atVar2 != null ? atVar2.D(mj0Var) : 0;
        ix1 ix1Var = this.x;
        int iD5 = ix1Var != null ? ix1Var.D(mj0Var) : 0;
        ArrayList<lv2> arrayList = this.y;
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
        ArrayList arrayList3 = this.z;
        if (arrayList3 != null) {
            ArrayList arrayList4 = new ArrayList(eu.B(arrayList3, 10));
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                int i = ((as1) it.next()).b;
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
                bArr[i2] = ((s63) it2.next()).h;
                i2++;
            }
            mj0Var.n(1, size, 1);
            for (int i3 = size - 1; -1 < i3; i3--) {
                mj0Var.a(bArr[i3]);
            }
            iH = mj0Var.h();
        } else {
            iH = 0;
        }
        ArrayList arrayList5 = this.z;
        if (arrayList5 != null) {
            ArrayList arrayList6 = new ArrayList(eu.B(arrayList5, 10));
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                Object obj = ((as1) it3.next()).a;
                obj.getClass();
                arrayList6.add(Integer.valueOf(((qp0) obj).D(mj0Var)));
            }
            int[] iArrE0 = du.E0(arrayList6);
            mj0Var.n(4, iArrE0.length, 4);
            for (int length = iArrE0.length - 1; -1 < length; length--) {
                mj0Var.b(iArrE0[length]);
            }
            iH2 = mj0Var.h();
        } else {
            iH2 = 0;
        }
        ah1 ah1Var = this.A;
        int iD6 = ah1Var != null ? ah1Var.D(mj0Var) : 0;
        mj0Var.m(17);
        mj0Var.c(16, 0);
        mj0Var.c(15, 0);
        mj0Var.c(14, 0);
        mj0Var.c(13, 0);
        mj0Var.c(12, 0);
        mj0Var.c(11, iD6);
        mj0Var.c(10, iH2);
        mj0Var.c(9, iH);
        mj0Var.c(8, 0);
        mj0Var.c(7, iF);
        mj0Var.c(6, 0);
        mj0Var.c(5, 0);
        mj0Var.c(4, iD5);
        mj0Var.c(3, iD4);
        mj0Var.c(2, iD3);
        mj0Var.c(1, iD2);
        mj0Var.c(0, iD);
        int iG = mj0Var.g();
        mj0Var.i(iG);
        return iG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b0(Class cls) {
        cls.getClass();
        at atVar = new at();
        at.b0(atVar, i80.b(cls), 6);
        this.v = atVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d0(int i) {
        if (this.x == null) {
            this.x = new ix1();
        }
        ix1 ix1Var = this.x;
        ix1Var.getClass();
        p3 p3Var = new p3(1);
        p3Var.u = i;
        p3Var.v = i;
        ix1Var.u = p3Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e0(Class... clsArr) {
        hx1 hx1Var;
        ix1 ix1Var = new ix1();
        ix1Var.t = new ArrayList(be0.h);
        for (Class cls : clsArr) {
            if (cls != null) {
                hx1Var = new hx1();
                at atVar = new at();
                at.b0(atVar, i80.b(cls), 6);
                hx1Var.t = atVar;
            } else {
                hx1Var = null;
            }
            List arrayList = ix1Var.t;
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            ix1Var.t = arrayList;
            arrayList.add(hx1Var);
        }
        this.x = ix1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f0(Class cls) {
        cls.getClass();
        at atVar = new at();
        at.b0(atVar, i80.b(cls), 6);
        this.w = atVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g0(String str) {
        this.t = new lv2(str, 5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h0(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new lv2(str, 5));
        }
        this.y = new ArrayList(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i0(Number... numberArr) {
        ArrayList arrayList = new ArrayList(numberArr.length);
        for (Number number : numberArr) {
            as1 as1Var = new as1();
            number.getClass();
            if (number instanceof Byte) {
                as1Var.a = new le0(number.byteValue());
                as1Var.b = 1;
            } else if (number instanceof Short) {
                as1Var.a = new qe0(number.shortValue());
                as1Var.b = 2;
            } else if (number instanceof Integer) {
                as1Var.a = new oe0(number.intValue());
                as1Var.b = 3;
            } else if (number instanceof Long) {
                as1Var.a = new pe0(number.longValue());
                as1Var.b = 4;
            } else if (number instanceof Float) {
                as1Var.a = new ne0(number.floatValue());
                as1Var.b = 5;
            } else if (number instanceof Double) {
                as1Var.a = new me0(number.doubleValue());
                as1Var.b = 6;
            }
            arrayList.add(as1Var);
        }
        this.z = new ArrayList(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j0(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new lv2(str, 1));
        }
        this.y = new ArrayList(arrayList);
    }
}
