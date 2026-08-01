package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: v4 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0827v4 implements InterfaceC0177em, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: d */
    public final ViewTreeObserverOnGlobalLayoutListenerC0875w3 f6394d;

    /* JADX INFO: renamed from: e */
    public final C0417l3 f6395e;

    /* JADX INFO: renamed from: f */
    public C0111d f6396f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f6397g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public final long f6398h = 100;

    /* JADX INFO: renamed from: i */
    public EnumC0713s4 f6399i = EnumC0713s4.f5633d;

    /* JADX INFO: renamed from: j */
    public boolean f6400j = true;

    /* JADX INFO: renamed from: k */
    public final C0834vb f6401k = o30.m2765e(1, 6, null);

    /* JADX INFO: renamed from: l */
    public final Handler f6402l = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: m */
    public ug0 f6403m;

    /* JADX INFO: renamed from: n */
    public long f6404n;

    /* JADX INFO: renamed from: o */
    public final ug0 f6405o;

    /* JADX INFO: renamed from: p */
    public yz0 f6406p;

    /* JADX INFO: renamed from: q */
    public boolean f6407q;

    /* JADX INFO: renamed from: r */
    public final RunnableC0912x3 f6408r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnAttachStateChangeListenerC0827v4(ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3, C0417l3 c0417l3) {
        this.f6394d = viewTreeObserverOnGlobalLayoutListenerC0875w3;
        this.f6395e = c0417l3;
        ug0 ug0Var = v20.f6389a;
        ug0Var.getClass();
        this.f6403m = ug0Var;
        this.f6405o = new ug0();
        this.f6406p = new yz0(viewTreeObserverOnGlobalLayoutListenerC0875w3.getSemanticsOwner().m2a(), ug0Var);
        this.f6408r = new RunnableC0912x3(1, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0177em
    /* JADX INFO: renamed from: a */
    public final void mo938a(x90 x90Var) {
        m4395m(this.f6394d.getSemanticsOwner().m2a());
        m4392j();
        this.f6396f = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0177em
    /* JADX INFO: renamed from: b */
    public final void mo939b(x90 x90Var) {
        this.f6396f = (C0111d) this.f6395e.invoke();
        m4394l(-1, this.f6394d.getSemanticsOwner().m2a());
        m4392j();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007c -> B:17:0x0046). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4387d(AbstractC0358jk abstractC0358jk) {
        C0790u4 c0790u4;
        C0797ub c0797ub;
        if (abstractC0358jk instanceof C0790u4) {
            c0790u4 = (C0790u4) abstractC0358jk;
            int i = c0790u4.f6129j;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0790u4.f6129j = i - Integer.MIN_VALUE;
            } else {
                c0790u4 = new C0790u4(this, abstractC0358jk);
            }
        }
        Object objM4292b = c0790u4.f6127h;
        int i2 = c0790u4.f6129j;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        if (i2 == 0) {
            w60.m4891M(objM4292b);
            C0834vb c0834vb = this.f6401k;
            c0834vb.getClass();
            c0797ub = new C0797ub(c0834vb);
        } else {
            if (i2 == 1) {
                c0797ub = c0790u4.f6126g;
                w60.m4891M(objM4292b);
                if (((Boolean) objM4292b).booleanValue()) {
                    return na1.f4229a;
                }
                c0797ub.m4293c();
                if (m4391i()) {
                    m4392j();
                }
                if (!this.f6407q) {
                    this.f6407q = true;
                    this.f6402l.post(this.f6408r);
                }
                c0790u4.f6126g = c0797ub;
                c0790u4.f6129j = 2;
                if (s91.m4056u(this.f6398h, c0790u4) != enumC1007zk) {
                }
                return enumC1007zk;
            }
            if (i2 != 2) {
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c0797ub = c0790u4.f6126g;
            w60.m4891M(objM4292b);
        }
        c0790u4.f6126g = c0797ub;
        c0790u4.f6129j = 1;
        objM4292b = c0797ub.m4292b(c0790u4);
        if (objM4292b != enumC1007zk) {
            if (((Boolean) objM4292b).booleanValue()) {
            }
        }
        return enumC1007zk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m4388f(u20 u20Var) {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        long[] jArr3;
        yz0 yz0Var;
        int i3;
        long[] jArr4;
        yz0 yz0Var2;
        String str;
        long j3;
        String str2;
        int i4;
        u20 u20Var2 = u20Var;
        int[] iArr3 = u20Var2.f6112b;
        long[] jArr5 = u20Var2.f6111a;
        int length = jArr5.length - 2;
        if (length < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j4 = jArr5[i5];
            char c2 = 7;
            long j5 = -9187201950435737472L;
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8;
                int i7 = 8 - ((~(i5 - length)) >>> 31);
                int i8 = 0;
                while (i8 < i7) {
                    if ((j4 & 255) < 128) {
                        int i9 = iArr3[(i5 << 3) + i8];
                        c = c2;
                        yz0 yz0Var3 = (yz0) this.f6405o.m4248b(i9);
                        zz0 zz0Var = (zz0) u20Var2.m4248b(i9);
                        xz0 xz0Var = zz0Var != null ? zz0Var.f8062a : null;
                        if (xz0Var == null) {
                            throw AbstractC0748t1.m4149g("no value for specified key");
                        }
                        j2 = j5;
                        int i10 = xz0Var.f7474g;
                        jh0 jh0Var = xz0Var.f7471d.f5877d;
                        String str3 = "Invalid content capture ID";
                        if (yz0Var3 == null) {
                            Object[] objArr = jh0Var.f2879b;
                            long[] jArr6 = jh0Var.f2878a;
                            int i11 = i6;
                            int length2 = jArr6.length - 2;
                            iArr2 = iArr3;
                            jArr2 = jArr5;
                            if (length2 >= 0) {
                                int i12 = 0;
                                while (true) {
                                    long j6 = jArr6[i12];
                                    j = j4;
                                    if ((((~j6) << c) & j6 & j2) != j2) {
                                        int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                        int i14 = 0;
                                        while (i14 < i13) {
                                            if ((j6 & 255) < 128) {
                                                j3 = j6;
                                                e01 e01Var = (e01) objArr[(i12 << 3) + i14];
                                                e01 e01Var2 = b01.f308A;
                                                if (p30.m3002l(e01Var, e01Var2)) {
                                                    Object objM1701g = jh0Var.m1701g(e01Var2);
                                                    if (objM1701g == null) {
                                                        objM1701g = null;
                                                    }
                                                    List list = (List) objM1701g;
                                                    String strValueOf = String.valueOf(list != null ? (C0200f8) AbstractC0960ye.m5241K(list) : null);
                                                    C0111d c0111d = this.f6396f;
                                                    if (c0111d != null) {
                                                        str2 = str3;
                                                        i4 = i8;
                                                        AutofillId autofillIdM617n = c0111d.m617n(i10);
                                                        if (autofillIdM617n == null) {
                                                            throw AbstractC0748t1.m4149g(str2);
                                                        }
                                                        ((ContentCaptureSession) c0111d.f919e).notifyViewTextChanged(autofillIdM617n, strValueOf);
                                                    }
                                                }
                                                j6 = j3 >> i11;
                                                i14++;
                                                i8 = i4;
                                                str3 = str2;
                                            } else {
                                                j3 = j6;
                                            }
                                            str2 = str3;
                                            i4 = i8;
                                            j6 = j3 >> i11;
                                            i14++;
                                            i8 = i4;
                                            str3 = str2;
                                        }
                                        str = str3;
                                        i = i8;
                                        if (i13 != i11) {
                                            break;
                                        }
                                    } else {
                                        str = str3;
                                        i = i8;
                                    }
                                    if (i12 == length2) {
                                        break;
                                    }
                                    i12++;
                                    j4 = j;
                                    i8 = i;
                                    str3 = str;
                                    i11 = 8;
                                }
                            } else {
                                j = j4;
                                i = i8;
                            }
                        } else {
                            iArr2 = iArr3;
                            jArr2 = jArr5;
                            j = j4;
                            i = i8;
                            Object[] objArr2 = jh0Var.f2879b;
                            long[] jArr7 = jh0Var.f2878a;
                            int length3 = jArr7.length - 2;
                            if (length3 >= 0) {
                                int i15 = 0;
                                while (true) {
                                    long j7 = jArr7[i15];
                                    Object[] objArr3 = objArr2;
                                    long[] jArr8 = jArr7;
                                    if ((((~j7) << c) & j7 & j2) != j2) {
                                        int i16 = 8 - ((~(i15 - length3)) >>> 31);
                                        int i17 = 0;
                                        while (i17 < i16) {
                                            if ((j7 & 255) < 128) {
                                                e01 e01Var3 = (e01) objArr3[(i15 << 3) + i17];
                                                i3 = i17;
                                                e01 e01Var4 = b01.f308A;
                                                if (p30.m3002l(e01Var3, e01Var4)) {
                                                    Object objM1701g2 = yz0Var3.f7742a.f5877d.m1701g(e01Var4);
                                                    if (objM1701g2 == null) {
                                                        objM1701g2 = null;
                                                    }
                                                    List list2 = (List) objM1701g2;
                                                    C0200f8 c0200f8 = list2 != null ? (C0200f8) AbstractC0960ye.m5241K(list2) : null;
                                                    Object objM1701g3 = jh0Var.m1701g(e01Var4);
                                                    if (objM1701g3 == null) {
                                                        objM1701g3 = null;
                                                    }
                                                    List list3 = (List) objM1701g3;
                                                    C0200f8 c0200f82 = list3 != null ? (C0200f8) AbstractC0960ye.m5241K(list3) : null;
                                                    if (!p30.m3002l(c0200f8, c0200f82)) {
                                                        String strValueOf2 = String.valueOf(c0200f82);
                                                        C0111d c0111d2 = this.f6396f;
                                                        if (c0111d2 != null) {
                                                            jArr4 = jArr8;
                                                            yz0Var2 = yz0Var3;
                                                            AutofillId autofillIdM617n2 = c0111d2.m617n(i10);
                                                            if (autofillIdM617n2 == null) {
                                                                throw AbstractC0748t1.m4149g("Invalid content capture ID");
                                                            }
                                                            ((ContentCaptureSession) c0111d2.f919e).notifyViewTextChanged(autofillIdM617n2, strValueOf2);
                                                        }
                                                    }
                                                }
                                                j7 >>= 8;
                                                i17 = i3 + 1;
                                                yz0Var3 = yz0Var2;
                                                jArr8 = jArr4;
                                            } else {
                                                i3 = i17;
                                            }
                                            jArr4 = jArr8;
                                            yz0Var2 = yz0Var3;
                                            j7 >>= 8;
                                            i17 = i3 + 1;
                                            yz0Var3 = yz0Var2;
                                            jArr8 = jArr4;
                                        }
                                        jArr3 = jArr8;
                                        yz0Var = yz0Var3;
                                        if (i16 != 8) {
                                            break;
                                        }
                                    } else {
                                        jArr3 = jArr8;
                                        yz0Var = yz0Var3;
                                    }
                                    if (i15 == length3) {
                                        break;
                                    }
                                    i15++;
                                    objArr2 = objArr3;
                                    yz0Var3 = yz0Var;
                                    jArr7 = jArr3;
                                }
                            }
                        }
                        i2 = 8;
                    } else {
                        iArr2 = iArr3;
                        jArr2 = jArr5;
                        j = j4;
                        c = c2;
                        j2 = j5;
                        i = i8;
                        i2 = i6;
                    }
                    j4 = j >> i2;
                    i8 = i + 1;
                    u20Var2 = u20Var;
                    i6 = i2;
                    c2 = c;
                    j5 = j2;
                    iArr3 = iArr2;
                    jArr5 = jArr2;
                }
                iArr = iArr3;
                jArr = jArr5;
                if (i7 != i6) {
                    return;
                }
            } else {
                iArr = iArr3;
                jArr = jArr5;
            }
            if (i5 == length) {
                return;
            }
            i5++;
            u20Var2 = u20Var;
            iArr3 = iArr;
            jArr5 = jArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m4389g(xz0 xz0Var, InterfaceC0904ww interfaceC0904ww) {
        xz0Var.getClass();
        List listM5178j = xz0.m5178j(4, xz0Var);
        int size = listM5178j.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = listM5178j.get(i2);
            if (m4390h().m4247a(((xz0) obj).f7474g)) {
                interfaceC0904ww.invoke(Integer.valueOf(i), obj);
                i++;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final u20 m4390h() {
        if (this.f6400j) {
            this.f6400j = false;
            this.f6403m = AbstractC0307i4.m1542r(this.f6394d.getSemanticsOwner(), C0601p3.f4713g);
            this.f6404n = System.currentTimeMillis();
        }
        return this.f6403m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final boolean m4391i() {
        return this.f6396f != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m4392j() {
        C0111d c0111d = this.f6396f;
        if (c0111d == null) {
            return;
        }
        ContentCaptureSession contentCaptureSession = (ContentCaptureSession) c0111d.f919e;
        ArrayList arrayList = this.f6397g;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0805uj c0805uj = (C0805uj) arrayList.get(i);
            int iOrdinal = c0805uj.f6244c.ordinal();
            if (iOrdinal == 0) {
                qb1 qb1Var = c0805uj.f6245d;
                if (qb1Var != null) {
                    contentCaptureSession.notifyViewAppeared((ViewStructure) qb1Var.f5106d);
                }
            } else if (iOrdinal != 1) {
                C0921xc.m5129j();
                return;
            } else {
                AutofillId autofillIdM617n = c0111d.m617n(c0805uj.f6242a);
                if (autofillIdM617n != null) {
                    contentCaptureSession.notifyViewDisappeared(autofillIdM617n);
                }
            }
        }
        contentCaptureSession.notifyViewsDisappeared(((View) c0111d.f920f).getAutofillId(), new long[]{Long.MIN_VALUE});
        arrayList.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m4393k(xz0 xz0Var, yz0 yz0Var) {
        m4389g(xz0Var, new C0459m4(1, yz0Var, this));
        List listM5178j = xz0.m5178j(4, xz0Var);
        int size = listM5178j.size();
        for (int i = 0; i < size; i++) {
            xz0 xz0Var2 = (xz0) listM5178j.get(i);
            u20 u20VarM4390h = m4390h();
            int i2 = xz0Var2.f7474g;
            if (u20VarM4390h.m4247a(i2)) {
                ug0 ug0Var = this.f6405o;
                if (ug0Var.m4247a(i2)) {
                    Object objM4248b = ug0Var.m4248b(i2);
                    if (objM4248b == null) {
                        throw AbstractC0748t1.m4149g("node not present in pruned tree before this change");
                    }
                    m4393k(xz0Var2, (yz0) objM4248b);
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0176  */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4394l(int i, xz0 xz0Var) {
        InterfaceC0742sw interfaceC0742sw;
        st0 st0VarM5179a;
        qb1 qb1Var;
        String strM4260D;
        InterfaceC0742sw interfaceC0742sw2;
        if (m4391i()) {
            jh0 jh0Var = xz0Var.f7471d.f5877d;
            Object objM1701g = jh0Var.m1701g(b01.f310C);
            if (objM1701g == null) {
                objM1701g = null;
            }
            Boolean bool = (Boolean) objM1701g;
            if (this.f6399i == EnumC0713s4.f5633d && p30.m3002l(bool, Boolean.TRUE)) {
                Object objM1701g2 = jh0Var.m1701g(rz0.f5600m);
                if (objM1701g2 == null) {
                    objM1701g2 = null;
                }
                C0533o0 c0533o0 = (C0533o0) objM1701g2;
                if (c0533o0 != null && (interfaceC0742sw2 = (InterfaceC0742sw) c0533o0.f4378b) != null) {
                }
            } else if (this.f6399i == EnumC0713s4.f5634e && p30.m3002l(bool, Boolean.FALSE)) {
                Object objM1701g3 = jh0Var.m1701g(rz0.f5600m);
                if (objM1701g3 == null) {
                    objM1701g3 = null;
                }
                C0533o0 c0533o02 = (C0533o0) objM1701g3;
                if (c0533o02 != null && (interfaceC0742sw = (InterfaceC0742sw) c0533o02.f4378b) != null) {
                }
            }
            int i2 = xz0Var.f7474g;
            C0111d c0111d = this.f6396f;
            if (c0111d == null) {
                qb1Var = null;
            } else {
                AutofillId autofillId = this.f6394d.getAutofillId();
                xz0 xz0VarM5189l = xz0Var.m5189l();
                int i3 = xz0Var.f7474g;
                if (xz0VarM5189l == null || (autofillId = c0111d.m617n(xz0VarM5189l.f7474g)) != null) {
                    ViewStructure viewStructureNewVirtualViewStructure = ((ContentCaptureSession) c0111d.f919e).newVirtualViewStructure(autofillId, i3);
                    qb1 qb1Var2 = new qb1(viewStructureNewVirtualViewStructure);
                    sz0 sz0Var = xz0Var.f7471d;
                    e01 e01Var = b01.f316I;
                    jh0 jh0Var2 = sz0Var.f5877d;
                    if (!jh0Var2.m1697c(e01Var)) {
                        Bundle extras = viewStructureNewVirtualViewStructure.getExtras();
                        if (extras != null) {
                            extras.putLong("android.view.contentcapture.EventTimestamp", this.f6404n);
                            extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
                        }
                        Object objM1701g4 = jh0Var2.m1701g(b01.f346y);
                        if (objM1701g4 == null) {
                            objM1701g4 = null;
                        }
                        String str = (String) objM1701g4;
                        if (str != null) {
                            viewStructureNewVirtualViewStructure.setId(i3, null, null, str);
                        }
                        Object objM1701g5 = jh0Var2.m1701g(b01.f334m);
                        if (objM1701g5 == null) {
                            objM1701g5 = null;
                        }
                        if (((Boolean) objM1701g5) != null) {
                            viewStructureNewVirtualViewStructure.setClassName("android.widget.ViewGroup");
                        }
                        Object objM1701g6 = jh0Var2.m1701g(b01.f308A);
                        if (objM1701g6 == null) {
                            objM1701g6 = null;
                        }
                        List list = (List) objM1701g6;
                        if (list != null) {
                            viewStructureNewVirtualViewStructure.setClassName("android.widget.TextView");
                            viewStructureNewVirtualViewStructure.setText(ya0.m5226a(list, "\n", null, 62));
                        }
                        Object objM1701g7 = jh0Var2.m1701g(b01.f312E);
                        if (objM1701g7 == null) {
                            objM1701g7 = null;
                        }
                        C0200f8 c0200f8 = (C0200f8) objM1701g7;
                        if (c0200f8 != null) {
                            viewStructureNewVirtualViewStructure.setClassName("android.widget.EditText");
                            viewStructureNewVirtualViewStructure.setText(c0200f8);
                        }
                        Object objM1701g8 = jh0Var2.m1701g(b01.f322a);
                        if (objM1701g8 == null) {
                            objM1701g8 = null;
                        }
                        List list2 = (List) objM1701g8;
                        if (list2 != null) {
                            viewStructureNewVirtualViewStructure.setContentDescription(ya0.m5226a(list2, "\n", null, 62));
                        }
                        Object objM1701g9 = jh0Var2.m1701g(b01.f345x);
                        if (objM1701g9 == null) {
                            objM1701g9 = null;
                        }
                        xv0 xv0Var = (xv0) objM1701g9;
                        if (xv0Var != null && (strM4260D = u50.m4260D(xv0Var.f7427a)) != null) {
                            viewStructureNewVirtualViewStructure.setClassName(strM4260D);
                        }
                        g71 g71VarM4273p = u50.m4273p(sz0Var);
                        if (g71VarM4273p != null) {
                            f71 f71Var = g71VarM4273p.f1879a;
                            s71 s71Var = f71Var.f1615b;
                            InterfaceC0968ym interfaceC0968ym = f71Var.f1620g;
                            viewStructureNewVirtualViewStructure.setTextStyle(interfaceC0968ym.mo49h() * interfaceC0968ym.mo48b() * u71.m4288c(s71Var.f5669a.f2671b), 0, 0, 0);
                        }
                        qj0 qj0VarM5182d = xz0Var.m5182d();
                        if (qj0VarM5182d == null) {
                            st0VarM5179a = st0.f5831e;
                            float f = st0VarM5179a.f5832a;
                            float f2 = st0VarM5179a.f5833b;
                            viewStructureNewVirtualViewStructure.setDimens((int) f, (int) f2, 0, 0, (int) (st0VarM5179a.f5834c - f), (int) (st0VarM5179a.f5835d - f2));
                            qb1Var = qb1Var2;
                        } else {
                            qj0 qj0Var = qj0VarM5182d.mo436G0().f4542q ? qj0VarM5182d : null;
                            if (qj0Var != null) {
                                st0VarM5179a = xz0Var.m5179a(qj0Var);
                            }
                            float f3 = st0VarM5179a.f5832a;
                            float f22 = st0VarM5179a.f5833b;
                            viewStructureNewVirtualViewStructure.setDimens((int) f3, (int) f22, 0, 0, (int) (st0VarM5179a.f5834c - f3), (int) (st0VarM5179a.f5835d - f22));
                            qb1Var = qb1Var2;
                        }
                    }
                }
            }
            if (qb1Var != null) {
                this.f6397g.add(new C0805uj(i2, this.f6404n, EnumC0854vj.f6723d, qb1Var));
            }
            m4389g(xz0Var, new C0634q(1, this));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m4395m(xz0 xz0Var) {
        if (m4391i()) {
            this.f6397g.add(new C0805uj(xz0Var.f7474g, this.f6404n, EnumC0854vj.f6724e, null));
            List listM5178j = xz0.m5178j(4, xz0Var);
            int size = listM5178j.size();
            for (int i = 0; i < size; i++) {
                m4395m((xz0) listM5178j.get(i));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4396n() {
        ug0 ug0Var = this.f6405o;
        ug0Var.m4324c();
        u20 u20VarM4390h = m4390h();
        int[] iArr = u20VarM4390h.f6112b;
        Object[] objArr = u20VarM4390h.f6113c;
        long[] jArr = u20VarM4390h.f6111a;
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
                            ug0Var.m4330i(iArr[i4], new yz0(((zz0) objArr[i4]).f8062a, m4390h()));
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
        this.f6406p = new yz0(this.f6394d.getSemanticsOwner().m2a(), m4390h());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f6402l.removeCallbacks(this.f6408r);
        this.f6396f = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
