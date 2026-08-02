package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class w7 implements w50, View.OnAttachStateChangeListener {
    public final b7 h;
    public final r6 i;
    public sz0 j;
    public final ArrayList k = new ArrayList();
    public final long l = 100;
    public s7 m = s7.h;
    public boolean n = true;
    public final jn o = fg1.a(1, 6, null);
    public zj1 p;
    public long q;
    public final zj1 r;
    public rn2 s;
    public boolean t;
    public final m2 u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public w7(b7 b7Var, r6 r6Var) {
        this.h = b7Var;
        this.i = r6Var;
        new Handler(Looper.getMainLooper());
        zj1 zj1Var = y01.a;
        zj1Var.getClass();
        this.p = zj1Var;
        this.r = new zj1();
        this.s = new rn2(b7Var.getSemanticsOwner().a(), zj1Var);
        this.u = new m2(2, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0082 -> B:17:0x0046). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(u00 u00Var) throws Throwable {
        u7 u7Var;
        in inVar;
        if (u00Var instanceof u7) {
            u7Var = (u7) u00Var;
            int i = u7Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                u7Var.n = i - Integer.MIN_VALUE;
            } else {
                u7Var = new u7(this, u00Var);
            }
        }
        Object objB = u7Var.l;
        int i2 = u7Var.n;
        k20 k20Var = k20.h;
        if (i2 == 0) {
            fg1.T(objB);
            jn jnVar = this.o;
            jnVar.getClass();
            inVar = new in(jnVar);
        } else {
            if (i2 == 1) {
                inVar = u7Var.k;
                fg1.T(objB);
                if (((Boolean) objB).booleanValue()) {
                    return a83.a;
                }
                inVar.c();
                if (h()) {
                    i();
                }
                Handler handler = this.h.getHandler();
                if (!this.t && handler != null) {
                    this.t = true;
                    handler.post(this.u);
                }
                u7Var.k = inVar;
                u7Var.n = 2;
                if (eu.F(this.l, u7Var) != k20Var) {
                }
                return k20Var;
            }
            if (i2 != 2) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            inVar = u7Var.k;
            fg1.T(objB);
        }
        u7Var.k = inVar;
        u7Var.n = 1;
        objB = inVar.b(u7Var);
        if (objB != k20Var) {
            if (((Boolean) objB).booleanValue()) {
            }
        }
        return k20Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w50
    public final void b(ia1 ia1Var) {
        m(this.h.getSemanticsOwner().a());
        i();
        this.j = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w50
    public final void c(ia1 ia1Var) {
        this.j = (sz0) this.i.a();
        l(-1, this.h.getSemanticsOwner().a());
        i();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(x01 x01Var) {
        int[] iArr;
        int[] iArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        long j3;
        long j4;
        x01 x01Var2 = x01Var;
        int[] iArr3 = x01Var2.b;
        long[] jArr = x01Var2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j5 = jArr[i3];
            char c2 = 7;
            long j6 = -9187201950435737472L;
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j5 & 255) < 128) {
                        int i7 = iArr3[(i3 << 3) + i6];
                        c = c2;
                        rn2 rn2Var = (rn2) this.r.b(i7);
                        sn2 sn2Var = (sn2) x01Var2.b(i7);
                        qn2 qn2Var = sn2Var != null ? sn2Var.a : null;
                        if (qn2Var == null) {
                            throw vi0.e("no value for specified key");
                        }
                        j2 = j6;
                        int i8 = qn2Var.f;
                        rk1 rk1Var = qn2Var.d.h;
                        if (rn2Var == null) {
                            Object[] objArr = rk1Var.b;
                            long[] jArr2 = rk1Var.a;
                            int length2 = jArr2.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i9 = i4;
                                int i10 = 0;
                                while (true) {
                                    long j7 = jArr2[i10];
                                    j = j5;
                                    if ((((~j7) << c) & j7 & j2) != j2) {
                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                        for (int i12 = 0; i12 < i11; i12++) {
                                            if ((j7 & 255) < 128) {
                                                j4 = j7;
                                                yn2 yn2Var = (yn2) objArr[(i10 << 3) + i12];
                                                yn2 yn2Var2 = vn2.C;
                                                if (t11.l(yn2Var, yn2Var2)) {
                                                    Object objG = rk1Var.g(yn2Var2);
                                                    if (objG == null) {
                                                        objG = null;
                                                    }
                                                    List list = (List) objG;
                                                    k(String.valueOf(list != null ? (sd) du.q0(list) : null), i8);
                                                }
                                            } else {
                                                j4 = j7;
                                            }
                                            j7 = j4 >> i9;
                                        }
                                        if (i11 != i9) {
                                            break;
                                        }
                                        if (i10 == length2) {
                                            break;
                                        }
                                        i10++;
                                        j5 = j;
                                        i9 = 8;
                                    }
                                }
                            } else {
                                j = j5;
                            }
                        } else {
                            iArr2 = iArr3;
                            j = j5;
                            Object[] objArr2 = rk1Var.b;
                            long[] jArr3 = rk1Var.a;
                            int length3 = jArr3.length - 2;
                            if (length3 >= 0) {
                                long[] jArr4 = jArr3;
                                int i13 = 0;
                                while (true) {
                                    long j8 = jArr4[i13];
                                    long[] jArr5 = jArr4;
                                    i = i6;
                                    if ((((~j8) << c) & j8 & j2) != j2) {
                                        int i14 = 8 - ((~(i13 - length3)) >>> 31);
                                        int i15 = 0;
                                        while (i15 < i14) {
                                            if ((j8 & 255) < 128) {
                                                j3 = j8;
                                                yn2 yn2Var3 = (yn2) objArr2[(i13 << 3) + i15];
                                                yn2 yn2Var4 = vn2.C;
                                                if (t11.l(yn2Var3, yn2Var4)) {
                                                    Object objG2 = rn2Var.a.h.g(yn2Var4);
                                                    if (objG2 == null) {
                                                        objG2 = null;
                                                    }
                                                    List list2 = (List) objG2;
                                                    sd sdVar = list2 != null ? (sd) du.q0(list2) : null;
                                                    Object objG3 = rk1Var.g(yn2Var4);
                                                    if (objG3 == null) {
                                                        objG3 = null;
                                                    }
                                                    List list3 = (List) objG3;
                                                    sd sdVar2 = list3 != null ? (sd) du.q0(list3) : null;
                                                    if (!t11.l(sdVar, sdVar2)) {
                                                        k(String.valueOf(sdVar2), i8);
                                                    }
                                                }
                                            } else {
                                                j3 = j8;
                                            }
                                            i15++;
                                            j8 = j3 >> 8;
                                        }
                                        if (i14 != 8) {
                                            break;
                                        }
                                        if (i13 == length3) {
                                            break;
                                        }
                                        i13++;
                                        i6 = i;
                                        jArr4 = jArr5;
                                    }
                                }
                            }
                            i2 = 8;
                        }
                        i = i6;
                        i2 = 8;
                    } else {
                        iArr2 = iArr3;
                        j = j5;
                        c = c2;
                        j2 = j6;
                        i = i6;
                        i2 = i4;
                    }
                    j5 = j >> i2;
                    i6 = i + 1;
                    i4 = i2;
                    c2 = c;
                    j6 = j2;
                    iArr3 = iArr2;
                    x01Var2 = x01Var;
                }
                iArr = iArr3;
                if (i5 != i4) {
                    return;
                }
            } else {
                iArr = iArr3;
            }
            if (i3 == length) {
                return;
            }
            i3++;
            x01Var2 = x01Var;
            iArr3 = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final x01 f() {
        if (this.n) {
            this.n = false;
            this.p = xe1.v(this.h.getSemanticsOwner(), v6.m);
            this.q = System.currentTimeMillis();
        }
        return this.p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean h() {
        return this.j != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i() {
        sz0 sz0Var = this.j;
        if (sz0Var == null) {
            return;
        }
        Object obj = sz0Var.j;
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        ArrayList arrayList = this.k;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zz zzVar = (zz) arrayList.get(i);
            int iOrdinal = zzVar.c.ordinal();
            if (iOrdinal == 0) {
                mb3 mb3Var = zzVar.d;
                if (mb3Var != null) {
                    ViewStructure viewStructure = (ViewStructure) mb3Var.a;
                    if (Build.VERSION.SDK_INT >= 29) {
                        b00.d(e6.e(obj), viewStructure);
                    }
                }
            } else {
                if (iOrdinal != 1) {
                    c80.s();
                    return;
                }
                AutofillId autofillIdI = sz0Var.I(zzVar.a);
                if (autofillIdI != null && Build.VERSION.SDK_INT >= 29) {
                    b00.e(e6.e(obj), autofillIdI);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            b00.g(e6.e(obj), ((View) sz0Var.i).getAutofillId(), new long[]{Long.MIN_VALUE});
        }
        arrayList.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(qn2 qn2Var, rn2 rn2Var) {
        int i = 0;
        v7 v7Var = new v7(i, rn2Var, this);
        qn2Var.getClass();
        List listJ = qn2.j(4, qn2Var);
        int size = listJ.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = listJ.get(i3);
            if (f().a(((qn2) obj).f)) {
                v7Var.g(Integer.valueOf(i2), obj);
                i2++;
            }
        }
        List listJ2 = qn2.j(4, qn2Var);
        int size2 = listJ2.size();
        while (i < size2) {
            qn2 qn2Var2 = (qn2) listJ2.get(i);
            x01 x01VarF = f();
            int i4 = qn2Var2.f;
            if (x01VarF.a(i4)) {
                zj1 zj1Var = this.r;
                if (zj1Var.a(i4)) {
                    Object objB = zj1Var.b(i4);
                    if (objB == null) {
                        throw vi0.e("node not present in pruned tree before this change");
                    }
                    j(qn2Var2, (rn2) objB);
                } else {
                    continue;
                }
            }
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k(String str, int i) {
        sz0 sz0Var;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29 && (sz0Var = this.j) != null) {
            AutofillId autofillIdI = sz0Var.I(i);
            if (autofillIdI == null) {
                throw vi0.e("Invalid content capture ID");
            }
            if (i2 >= 29) {
                b00.f(e6.e(sz0Var.j), autofillIdI, str);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(int i, qn2 qn2Var) {
        in0 in0Var;
        int i2;
        o62 o62VarA;
        mb3 mb3Var;
        in0 in0Var2;
        if (h()) {
            rk1 rk1Var = qn2Var.d.h;
            Object objG = rk1Var.g(vn2.E);
            if (objG == null) {
                objG = null;
            }
            Boolean bool = (Boolean) objG;
            if (this.m == s7.h && t11.l(bool, Boolean.TRUE)) {
                Object objG2 = rk1Var.g(kn2.m);
                if (objG2 == null) {
                    objG2 = null;
                }
                q3 q3Var = (q3) objG2;
                if (q3Var != null && (in0Var2 = (in0) q3Var.b) != null) {
                }
            } else if (this.m == s7.i && t11.l(bool, Boolean.FALSE)) {
                Object objG3 = rk1Var.g(kn2.m);
                if (objG3 == null) {
                    objG3 = null;
                }
                q3 q3Var2 = (q3) objG3;
                if (q3Var2 != null && (in0Var = (in0) q3Var2.b) != null) {
                }
            }
            int i3 = qn2Var.f;
            sz0 sz0Var = this.j;
            if (sz0Var != null && (i2 = Build.VERSION.SDK_INT) >= 29) {
                AutofillId autofillId = this.h.getAutofillId();
                qn2 qn2VarL = qn2Var.l();
                int i4 = qn2Var.f;
                if (qn2VarL == null || (autofillId = sz0Var.I(qn2VarL.f)) != null) {
                    mb3 mb3Var2 = i2 >= 29 ? new mb3(b00.c(e6.e(sz0Var.j), autofillId, i4)) : null;
                    if (mb3Var2 == null) {
                        mb3Var = null;
                    } else {
                        ViewStructure viewStructure = (ViewStructure) mb3Var2.a;
                        ln2 ln2Var = qn2Var.d;
                        yn2 yn2Var = vn2.L;
                        rk1 rk1Var2 = ln2Var.h;
                        if (!rk1Var2.c(yn2Var)) {
                            Bundle extras = viewStructure.getExtras();
                            if (extras != null) {
                                extras.putLong("android.view.contentcapture.EventTimestamp", this.q);
                                extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
                            }
                            Object objG4 = rk1Var2.g(vn2.A);
                            if (objG4 == null) {
                                objG4 = null;
                            }
                            String str = (String) objG4;
                            if (str != null) {
                                viewStructure.setId(i4, null, null, str);
                            }
                            Object objG5 = rk1Var2.g(vn2.n);
                            if (objG5 == null) {
                                objG5 = null;
                            }
                            if (((Boolean) objG5) != null) {
                                viewStructure.setClassName("android.widget.ViewGroup");
                            }
                            Object objG6 = rk1Var2.g(vn2.C);
                            if (objG6 == null) {
                                objG6 = null;
                            }
                            List list = (List) objG6;
                            if (list != null) {
                                viewStructure.setClassName("android.widget.TextView");
                                viewStructure.setText(sb1.a(list, "\n", null, 62));
                            }
                            Object objG7 = rk1Var2.g(vn2.G);
                            if (objG7 == null) {
                                objG7 = null;
                            }
                            sd sdVar = (sd) objG7;
                            if (sdVar != null) {
                                viewStructure.setClassName("android.widget.EditText");
                                viewStructure.setText(sdVar);
                            }
                            Object objG8 = rk1Var2.g(vn2.a);
                            if (objG8 == null) {
                                objG8 = null;
                            }
                            List list2 = (List) objG8;
                            if (list2 != null) {
                                viewStructure.setContentDescription(sb1.a(list2, "\n", null, 62));
                            }
                            Object objG9 = rk1Var2.g(vn2.z);
                            if (objG9 == null) {
                                objG9 = null;
                            }
                            if (((va2) objG9) != null) {
                                viewStructure.setClassName("android.widget.ImageView");
                            }
                            y03 y03VarN = eu.N(ln2Var);
                            if (y03VarN != null) {
                                x03 x03Var = y03VarN.a;
                                m13 m13Var = x03Var.b;
                                e70 e70Var = x03Var.g;
                                viewStructure.setTextStyle(e70Var.m() * e70Var.b() * p13.c(m13Var.a.b), 0, 0, 0);
                            }
                            zn1 zn1VarD = qn2Var.d();
                            if (zn1VarD == null) {
                                o62VarA = o62.e;
                                float f = o62VarA.a;
                                float f2 = o62VarA.b;
                                viewStructure.setDimens((int) f, (int) f2, 0, 0, (int) (o62VarA.c - f), (int) (o62VarA.d - f2));
                                mb3Var = mb3Var2;
                            } else {
                                zn1 zn1Var = zn1VarD.S0().u ? zn1VarD : null;
                                if (zn1Var != null) {
                                    o62VarA = qn2Var.a(zn1Var);
                                }
                                float f3 = o62VarA.a;
                                float f22 = o62VarA.b;
                                viewStructure.setDimens((int) f3, (int) f22, 0, 0, (int) (o62VarA.c - f3), (int) (o62VarA.d - f22));
                                mb3Var = mb3Var2;
                            }
                        }
                    }
                }
            }
            if (mb3Var != null) {
                this.k.add(new zz(i3, this.q, a00.h, mb3Var));
            }
            List listJ = qn2.j(4, qn2Var);
            int size = listJ.size();
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                Object obj = listJ.get(i6);
                if (f().a(((qn2) obj).f)) {
                    l(i5, (qn2) obj);
                    i5++;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m(qn2 qn2Var) {
        if (h()) {
            this.k.add(new zz(qn2Var.f, this.q, a00.i, null));
            List listJ = qn2.j(4, qn2Var);
            int size = listJ.size();
            for (int i = 0; i < size; i++) {
                m((qn2) listJ.get(i));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n() {
        zj1 zj1Var = this.r;
        zj1Var.c();
        x01 x01VarF = f();
        int[] iArr = x01VarF.b;
        Object[] objArr = x01VarF.c;
        long[] jArr = x01VarF.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            zj1Var.h(iArr[i4], new rn2(((sn2) objArr[i4]).a, f()));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.s = new rn2(this.h.getSemanticsOwner().a(), f());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.h.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.u);
        this.j = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
