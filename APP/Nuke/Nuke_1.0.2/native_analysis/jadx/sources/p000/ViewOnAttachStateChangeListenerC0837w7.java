package p000;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: w7 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0837w7 implements w50, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: h */
    public final ViewTreeObserverOnGlobalLayoutListenerC0045b7 f12368h;

    /* JADX INFO: renamed from: i */
    public final C0645r6 f12369i;

    /* JADX INFO: renamed from: j */
    public sz0 f12370j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f12371k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public final long f12372l = 100;

    /* JADX INFO: renamed from: m */
    public EnumC0684s7 f12373m = EnumC0684s7.f9949h;

    /* JADX INFO: renamed from: n */
    public boolean f12374n = true;

    /* JADX INFO: renamed from: o */
    public final C0356jn f12375o = fg1.m1630a(1, 6, null);

    /* JADX INFO: renamed from: p */
    public zj1 f12376p;

    /* JADX INFO: renamed from: q */
    public long f12377q;

    /* JADX INFO: renamed from: r */
    public final zj1 f12378r;

    /* JADX INFO: renamed from: s */
    public rn2 f12379s;

    /* JADX INFO: renamed from: t */
    public boolean f12380t;

    /* JADX INFO: renamed from: u */
    public final RunnableC0446m2 f12381u;

    public ViewOnAttachStateChangeListenerC0837w7(ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7, C0645r6 c0645r6) {
        this.f12368h = viewTreeObserverOnGlobalLayoutListenerC0045b7;
        this.f12369i = c0645r6;
        new Handler(Looper.getMainLooper());
        zj1 zj1Var = y01.f13265a;
        zj1Var.getClass();
        this.f12376p = zj1Var;
        this.f12378r = new zj1();
        this.f12379s = new rn2(viewTreeObserverOnGlobalLayoutListenerC0045b7.getSemanticsOwner().m5334a(), zj1Var);
        this.f12381u = new RunnableC0446m2(2, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0082 -> B:17:0x0046). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5850a(u00 u00Var) throws Throwable {
        C0763u7 c0763u7;
        C0319in c0319in;
        if (u00Var instanceof C0763u7) {
            c0763u7 = (C0763u7) u00Var;
            int i = c0763u7.f11123n;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0763u7.f11123n = i - Integer.MIN_VALUE;
            } else {
                c0763u7 = new C0763u7(this, u00Var);
            }
        }
        Object objM2373b = c0763u7.f11121l;
        int i2 = c0763u7.f11123n;
        k20 k20Var = k20.f5323h;
        if (i2 == 0) {
            fg1.m1627T(objM2373b);
            C0356jn c0356jn = this.f12375o;
            c0356jn.getClass();
            c0319in = new C0319in(c0356jn);
        } else {
            if (i2 == 1) {
                c0319in = c0763u7.f11120k;
                fg1.m1627T(objM2373b);
                if (((Boolean) objM2373b).booleanValue()) {
                    return a83.f116a;
                }
                c0319in.m2374c();
                if (m5853h()) {
                    m5854i();
                }
                Handler handler = this.f12368h.getHandler();
                if (!this.f12380t && handler != null) {
                    this.f12380t = true;
                    handler.post(this.f12381u);
                }
                c0763u7.f11120k = c0319in;
                c0763u7.f11123n = 2;
                if (AbstractC0179eu.m1425F(this.f12372l, c0763u7) != k20Var) {
                }
                return k20Var;
            }
            if (i2 != 2) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c0319in = c0763u7.f11120k;
            fg1.m1627T(objM2373b);
        }
        c0763u7.f11120k = c0319in;
        c0763u7.f11123n = 1;
        objM2373b = c0319in.m2373b(c0763u7);
        if (objM2373b != k20Var) {
            if (((Boolean) objM2373b).booleanValue()) {
            }
        }
        return k20Var;
    }

    @Override // p000.w50
    /* JADX INFO: renamed from: b */
    public final void mo469b(ia1 ia1Var) {
        m5858m(this.f12368h.getSemanticsOwner().m5334a());
        m5854i();
        this.f12370j = null;
    }

    @Override // p000.w50
    /* JADX INFO: renamed from: c */
    public final void mo5849c(ia1 ia1Var) {
        this.f12370j = (sz0) this.f12369i.mo6a();
        m5857l(-1, this.f12368h.getSemanticsOwner().m5334a());
        m5854i();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016a  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5851d(x01 x01Var) {
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
        int[] iArr3 = x01Var2.f12750b;
        long[] jArr = x01Var2.f12749a;
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
                        rn2 rn2Var = (rn2) this.f12378r.m6022b(i7);
                        sn2 sn2Var = (sn2) x01Var2.m6022b(i7);
                        qn2 qn2Var = sn2Var != null ? sn2Var.f10248a : null;
                        if (qn2Var == null) {
                            throw vi0.m5686e("no value for specified key");
                        }
                        j2 = j6;
                        int i8 = qn2Var.f9052f;
                        rk1 rk1Var = qn2Var.f9050d.f6221h;
                        if (rn2Var == null) {
                            Object[] objArr = rk1Var.f9619b;
                            long[] jArr2 = rk1Var.f9618a;
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
                                                yn2 yn2Var2 = vn2.f12043C;
                                                if (t11.m5086l(yn2Var, yn2Var2)) {
                                                    Object objM4505g = rk1Var.m4505g(yn2Var2);
                                                    if (objM4505g == null) {
                                                        objM4505g = null;
                                                    }
                                                    List list = (List) objM4505g;
                                                    m5856k(String.valueOf(list != null ? (C0690sd) AbstractC0142du.m1161q0(list) : null), i8);
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
                            Object[] objArr2 = rk1Var.f9619b;
                            long[] jArr3 = rk1Var.f9618a;
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
                                                yn2 yn2Var4 = vn2.f12043C;
                                                if (t11.m5086l(yn2Var3, yn2Var4)) {
                                                    Object objM4505g2 = rn2Var.f9650a.f6221h.m4505g(yn2Var4);
                                                    if (objM4505g2 == null) {
                                                        objM4505g2 = null;
                                                    }
                                                    List list2 = (List) objM4505g2;
                                                    C0690sd c0690sd = list2 != null ? (C0690sd) AbstractC0142du.m1161q0(list2) : null;
                                                    Object objM4505g3 = rk1Var.m4505g(yn2Var4);
                                                    if (objM4505g3 == null) {
                                                        objM4505g3 = null;
                                                    }
                                                    List list3 = (List) objM4505g3;
                                                    C0690sd c0690sd2 = list3 != null ? (C0690sd) AbstractC0142du.m1161q0(list3) : null;
                                                    if (!t11.m5086l(c0690sd, c0690sd2)) {
                                                        m5856k(String.valueOf(c0690sd2), i8);
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

    /* JADX INFO: renamed from: f */
    public final x01 m5852f() {
        if (this.f12374n) {
            this.f12374n = false;
            this.f12376p = xe1.m6145v(this.f12368h.getSemanticsOwner(), C0799v6.f11764m);
            this.f12377q = System.currentTimeMillis();
        }
        return this.f12376p;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m5853h() {
        return this.f12370j != null;
    }

    /* JADX INFO: renamed from: i */
    public final void m5854i() {
        sz0 sz0Var = this.f12370j;
        if (sz0Var == null) {
            return;
        }
        Object obj = sz0Var.f10437j;
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        ArrayList arrayList = this.f12371k;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0980zz c0980zz = (C0980zz) arrayList.get(i);
            int iOrdinal = c0980zz.f14154c.ordinal();
            if (iOrdinal == 0) {
                mb3 mb3Var = c0980zz.f14155d;
                if (mb3Var != null) {
                    ViewStructure viewStructure = (ViewStructure) mb3Var.f6554a;
                    if (Build.VERSION.SDK_INT >= 29) {
                        b00.m327d(AbstractC0155e6.m1263e(obj), viewStructure);
                    }
                }
            } else {
                if (iOrdinal != 1) {
                    c80.m675s();
                    return;
                }
                AutofillId autofillIdM5036I = sz0Var.m5036I(c0980zz.f14152a);
                if (autofillIdM5036I != null && Build.VERSION.SDK_INT >= 29) {
                    b00.m328e(AbstractC0155e6.m1263e(obj), autofillIdM5036I);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            b00.m330g(AbstractC0155e6.m1263e(obj), ((View) sz0Var.f10436i).getAutofillId(), new long[]{Long.MIN_VALUE});
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: j */
    public final void m5855j(qn2 qn2Var, rn2 rn2Var) {
        int i = 0;
        C0800v7 c0800v7 = new C0800v7(i, rn2Var, this);
        qn2Var.getClass();
        List listM4199j = qn2.m4199j(4, qn2Var);
        int size = listM4199j.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = listM4199j.get(i3);
            if (m5852f().m6021a(((qn2) obj).f9052f)) {
                c0800v7.mo12g(Integer.valueOf(i2), obj);
                i2++;
            }
        }
        List listM4199j2 = qn2.m4199j(4, qn2Var);
        int size2 = listM4199j2.size();
        while (i < size2) {
            qn2 qn2Var2 = (qn2) listM4199j2.get(i);
            x01 x01VarM5852f = m5852f();
            int i4 = qn2Var2.f9052f;
            if (x01VarM5852f.m6021a(i4)) {
                zj1 zj1Var = this.f12378r;
                if (zj1Var.m6021a(i4)) {
                    Object objM6022b = zj1Var.m6022b(i4);
                    if (objM6022b == null) {
                        throw vi0.m5686e("node not present in pruned tree before this change");
                    }
                    m5855j(qn2Var2, (rn2) objM6022b);
                } else {
                    continue;
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m5856k(String str, int i) {
        sz0 sz0Var;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29 && (sz0Var = this.f12370j) != null) {
            AutofillId autofillIdM5036I = sz0Var.m5036I(i);
            if (autofillIdM5036I == null) {
                throw vi0.m5686e("Invalid content capture ID");
            }
            if (i2 >= 29) {
                b00.m329f(AbstractC0155e6.m1263e(sz0Var.f10437j), autofillIdM5036I, str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5857l(int i, qn2 qn2Var) {
        in0 in0Var;
        int i2;
        o62 o62VarM4200a;
        mb3 mb3Var;
        in0 in0Var2;
        if (m5853h()) {
            rk1 rk1Var = qn2Var.f9050d.f6221h;
            Object objM4505g = rk1Var.m4505g(vn2.f12045E);
            if (objM4505g == null) {
                objM4505g = null;
            }
            Boolean bool = (Boolean) objM4505g;
            if (this.f12373m == EnumC0684s7.f9949h && t11.m5086l(bool, Boolean.TRUE)) {
                Object objM4505g2 = rk1Var.m4505g(kn2.f5671m);
                if (objM4505g2 == null) {
                    objM4505g2 = null;
                }
                C0603q3 c0603q3 = (C0603q3) objM4505g2;
                if (c0603q3 != null && (in0Var2 = (in0) c0603q3.f8713b) != null) {
                }
            } else if (this.f12373m == EnumC0684s7.f9950i && t11.m5086l(bool, Boolean.FALSE)) {
                Object objM4505g3 = rk1Var.m4505g(kn2.f5671m);
                if (objM4505g3 == null) {
                    objM4505g3 = null;
                }
                C0603q3 c0603q32 = (C0603q3) objM4505g3;
                if (c0603q32 != null && (in0Var = (in0) c0603q32.f8713b) != null) {
                }
            }
            int i3 = qn2Var.f9052f;
            sz0 sz0Var = this.f12370j;
            if (sz0Var != null && (i2 = Build.VERSION.SDK_INT) >= 29) {
                AutofillId autofillId = this.f12368h.getAutofillId();
                qn2 qn2VarM4210l = qn2Var.m4210l();
                int i4 = qn2Var.f9052f;
                if (qn2VarM4210l == null || (autofillId = sz0Var.m5036I(qn2VarM4210l.f9052f)) != null) {
                    mb3 mb3Var2 = i2 >= 29 ? new mb3(b00.m326c(AbstractC0155e6.m1263e(sz0Var.f10437j), autofillId, i4)) : null;
                    if (mb3Var2 == null) {
                        mb3Var = null;
                    } else {
                        ViewStructure viewStructure = (ViewStructure) mb3Var2.f6554a;
                        ln2 ln2Var = qn2Var.f9050d;
                        yn2 yn2Var = vn2.f12052L;
                        rk1 rk1Var2 = ln2Var.f6221h;
                        if (!rk1Var2.m4501c(yn2Var)) {
                            Bundle extras = viewStructure.getExtras();
                            if (extras != null) {
                                extras.putLong("android.view.contentcapture.EventTimestamp", this.f12377q);
                                extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
                            }
                            Object objM4505g4 = rk1Var2.m4505g(vn2.f12041A);
                            if (objM4505g4 == null) {
                                objM4505g4 = null;
                            }
                            String str = (String) objM4505g4;
                            if (str != null) {
                                viewStructure.setId(i4, null, null, str);
                            }
                            Object objM4505g5 = rk1Var2.m4505g(vn2.f12071n);
                            if (objM4505g5 == null) {
                                objM4505g5 = null;
                            }
                            if (((Boolean) objM4505g5) != null) {
                                viewStructure.setClassName("android.widget.ViewGroup");
                            }
                            Object objM4505g6 = rk1Var2.m4505g(vn2.f12043C);
                            if (objM4505g6 == null) {
                                objM4505g6 = null;
                            }
                            List list = (List) objM4505g6;
                            if (list != null) {
                                viewStructure.setClassName("android.widget.TextView");
                                viewStructure.setText(sb1.m4781a(list, "\n", null, 62));
                            }
                            Object objM4505g7 = rk1Var2.m4505g(vn2.f12047G);
                            if (objM4505g7 == null) {
                                objM4505g7 = null;
                            }
                            C0690sd c0690sd = (C0690sd) objM4505g7;
                            if (c0690sd != null) {
                                viewStructure.setClassName("android.widget.EditText");
                                viewStructure.setText(c0690sd);
                            }
                            Object objM4505g8 = rk1Var2.m4505g(vn2.f12058a);
                            if (objM4505g8 == null) {
                                objM4505g8 = null;
                            }
                            List list2 = (List) objM4505g8;
                            if (list2 != null) {
                                viewStructure.setContentDescription(sb1.m4781a(list2, "\n", null, 62));
                            }
                            Object objM4505g9 = rk1Var2.m4505g(vn2.f12083z);
                            if (objM4505g9 == null) {
                                objM4505g9 = null;
                            }
                            if (((va2) objM4505g9) != null) {
                                viewStructure.setClassName("android.widget.ImageView");
                            }
                            y03 y03VarM1433N = AbstractC0179eu.m1433N(ln2Var);
                            if (y03VarM1433N != null) {
                                x03 x03Var = y03VarM1433N.f13266a;
                                m13 m13Var = x03Var.f12755b;
                                e70 e70Var = x03Var.f12760g;
                                viewStructure.setTextStyle(e70Var.mo697m() * e70Var.mo693b() * p13.m3675c(m13Var.f6435a.f6302b), 0, 0, 0);
                            }
                            zn1 zn1VarM4203d = qn2Var.m4203d();
                            if (zn1VarM4203d == null) {
                                o62VarM4200a = o62.f7535e;
                                float f = o62VarM4200a.f7536a;
                                float f2 = o62VarM4200a.f7537b;
                                viewStructure.setDimens((int) f, (int) f2, 0, 0, (int) (o62VarM4200a.f7538c - f), (int) (o62VarM4200a.f7539d - f2));
                                mb3Var = mb3Var2;
                            } else {
                                zn1 zn1Var = zn1VarM4203d.mo2843S0().f10770u ? zn1VarM4203d : null;
                                if (zn1Var != null) {
                                    o62VarM4200a = qn2Var.m4200a(zn1Var);
                                }
                                float f3 = o62VarM4200a.f7536a;
                                float f22 = o62VarM4200a.f7537b;
                                viewStructure.setDimens((int) f3, (int) f22, 0, 0, (int) (o62VarM4200a.f7538c - f3), (int) (o62VarM4200a.f7539d - f22));
                                mb3Var = mb3Var2;
                            }
                        }
                    }
                }
            }
            if (mb3Var != null) {
                this.f12371k.add(new C0980zz(i3, this.f12377q, a00.f5h, mb3Var));
            }
            List listM4199j = qn2.m4199j(4, qn2Var);
            int size = listM4199j.size();
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                Object obj = listM4199j.get(i6);
                if (m5852f().m6021a(((qn2) obj).f9052f)) {
                    m5857l(i5, (qn2) obj);
                    i5++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m5858m(qn2 qn2Var) {
        if (m5853h()) {
            this.f12371k.add(new C0980zz(qn2Var.f9052f, this.f12377q, a00.f6i, null));
            List listM4199j = qn2.m4199j(4, qn2Var);
            int size = listM4199j.size();
            for (int i = 0; i < size; i++) {
                m5858m((qn2) listM4199j.get(i));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5859n() {
        zj1 zj1Var = this.f12378r;
        zj1Var.m6416c();
        x01 x01VarM5852f = m5852f();
        int[] iArr = x01VarM5852f.f12750b;
        Object[] objArr = x01VarM5852f.f12751c;
        long[] jArr = x01VarM5852f.f12749a;
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
                            zj1Var.m6421h(iArr[i4], new rn2(((sn2) objArr[i4]).f10248a, m5852f()));
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
        this.f12379s = new rn2(this.f12368h.getSemanticsOwner().m5334a(), m5852f());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.f12368h.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.f12381u);
        this.f12370j = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
