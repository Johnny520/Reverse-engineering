package p181j0;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import java.util.ArrayList;
import java.util.List;
import p000A.C0066i0;
import p002A1.AbstractC0151x;
import p002A1.InterfaceC0132e;
import p002A1.InterfaceC0145r;
import p011B4.AbstractC0231b;
import p027E4.C0330q;
import p028F.C0354o;
import p028F.RunnableC0346g;
import p029F0.C0372J;
import p041H0.AbstractC0596h0;
import p047I0.AbstractC0681L;
import p047I0.C0684M0;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p051J.C0822n;
import p056K2.C0891q;
import p059L0.AbstractC0955a;
import p061L2.AbstractC0973m;
import p077P0.AbstractC1124k;
import p077P0.AbstractC1131r;
import p077P0.AbstractC1132s;
import p077P0.C1114a;
import p077P0.C1121h;
import p077P0.C1125l;
import p077P0.C1128o;
import p077P0.C1129p;
import p077P0.C1135v;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1178c;
import p092S0.C1256I;
import p092S0.C1257J;
import p092S0.C1260M;
import p092S0.C1269g;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p127Z2.AbstractC1784a;
import p153e1.C2019o;
import p153e1.InterfaceC2007c;
import p160f3.AbstractC2162v;
import p164g1.AbstractC2179a;
import p172h3.AbstractC2250j;
import p172h3.C2242b;
import p172h3.C2243c;
import p186k.AbstractC2428j;
import p186k.AbstractC2429k;
import p186k.C2408E;
import p186k.C2439u;
import p204n0.C2684c;

/* JADX INFO: renamed from: j0.d */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC2369d implements InterfaceC0132e, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: d */
    public final ViewTreeObserverOnGlobalLayoutListenerC0772y f7681d;

    /* JADX INFO: renamed from: e */
    public final C0354o f7682e;

    /* JADX INFO: renamed from: f */
    public C0822n f7683f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f7684g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public final long f7685h = 100;

    /* JADX INFO: renamed from: i */
    public EnumC2366a f7686i = EnumC2366a.f7673d;

    /* JADX INFO: renamed from: j */
    public boolean f7687j = true;

    /* JADX INFO: renamed from: k */
    public final C2243c f7688k = AbstractC2250j.m4101a(1, 6, null);

    /* JADX INFO: renamed from: l */
    public final Handler f7689l = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: m */
    public C2439u f7690m;

    /* JADX INFO: renamed from: n */
    public long f7691n;

    /* JADX INFO: renamed from: o */
    public final C2439u f7692o;

    /* JADX INFO: renamed from: p */
    public C0684M0 f7693p;

    /* JADX INFO: renamed from: q */
    public boolean f7694q;

    /* JADX INFO: renamed from: r */
    public final RunnableC0346g f7695r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnAttachStateChangeListenerC2369d(ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y, C0354o c0354o) {
        this.f7681d = viewTreeObserverOnGlobalLayoutListenerC0772y;
        this.f7682e = c0354o;
        C2439u c2439u = AbstractC2429k.f7850a;
        AbstractC1665j.m2983c(c2439u, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f7690m = c2439u;
        this.f7692o = new C2439u();
        C1128o c1128oM2180a = viewTreeObserverOnGlobalLayoutListenerC0772y.getSemanticsOwner().m2180a();
        AbstractC1665j.m2983c(c2439u, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f7693p = new C0684M0(c1128oM2180a, c2439u);
        this.f7695r = new RunnableC0346g(7, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007d -> B:17:0x0047). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4218a(AbstractC1178c abstractC1178c) throws Throwable {
        C2367b c2367b;
        C2242b c2242b;
        if (abstractC1178c instanceof C2367b) {
            c2367b = (C2367b) abstractC1178c;
            int i5 = c2367b.f7679j;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c2367b.f7679j = i5 - Integer.MIN_VALUE;
            } else {
                c2367b = new C2367b(this, abstractC1178c);
            }
        }
        Object objM4068b = c2367b.f7677h;
        int i6 = c2367b.f7679j;
        EnumC1152a enumC1152a = EnumC1152a.f3788d;
        if (i6 == 0) {
            AbstractC1784a.m3205S(objM4068b);
            C2243c c2243c = this.f7688k;
            c2243c.getClass();
            c2242b = new C2242b(c2243c);
        } else {
            if (i6 == 1) {
                c2242b = c2367b.f7676g;
                AbstractC1784a.m3205S(objM4068b);
                if (((Boolean) objM4068b).booleanValue()) {
                    return C0891q.f2780a;
                }
                c2242b.m4069c();
                if (m4221h()) {
                    m4222i();
                }
                if (!this.f7694q) {
                    this.f7694q = true;
                    this.f7689l.post(this.f7695r);
                }
                c2367b.f7676g = c2242b;
                c2367b.f7679j = 2;
                if (AbstractC2162v.m3983e(this.f7685h, c2367b) != enumC1152a) {
                }
                return enumC1152a;
            }
            if (i6 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2242b = c2367b.f7676g;
            AbstractC1784a.m3205S(objM4068b);
        }
        c2367b.f7676g = c2242b;
        c2367b.f7679j = 1;
        objM4068b = c2242b.m4068b(c2367b);
        if (objM4068b != enumC1152a) {
            if (((Boolean) objM4068b).booleanValue()) {
            }
        }
        return enumC1152a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p002A1.InterfaceC0132e
    /* JADX INFO: renamed from: b */
    public final void mo180b(InterfaceC0145r interfaceC0145r) {
        this.f7683f = (C0822n) this.f7682e.mo6a();
        m4225l(-1, this.f7681d.getSemanticsOwner().m2180a());
        m4222i();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4219e(AbstractC2428j abstractC2428j) {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        long j5;
        char c5;
        long j6;
        int i5;
        long[] jArr3;
        long[] jArr4;
        long j7;
        long j8;
        AbstractC2428j abstractC2428j2 = abstractC2428j;
        int[] iArr3 = abstractC2428j2.f7846b;
        long[] jArr5 = abstractC2428j2.f7845a;
        int length = jArr5.length - 2;
        if (length < 0) {
            return;
        }
        int i6 = 0;
        while (true) {
            long j9 = jArr5[i6];
            char c6 = 7;
            long j10 = -9187201950435737472L;
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8;
                int i8 = 8 - ((~(i6 - length)) >>> 31);
                int i9 = 0;
                while (i9 < i8) {
                    if ((j9 & 255) < 128) {
                        int i10 = iArr3[(i6 << 3) + i9];
                        c5 = c6;
                        C0684M0 c0684m0 = (C0684M0) this.f7692o.m4318b(i10);
                        C1129p c1129p = (C1129p) abstractC2428j2.m4318b(i10);
                        C1128o c1128o = c1129p != null ? c1129p.f3715a : null;
                        if (c1128o == null) {
                            throw AbstractC0231b.m396g("no value for specified key");
                        }
                        j6 = j10;
                        int i11 = c1128o.f3714g;
                        C1125l c1125l = c1128o.f3711d;
                        if (c0684m0 == null) {
                            C2408E c2408e = c1125l.f3702d;
                            Object[] objArr = c2408e.f7788b;
                            long[] jArr6 = c2408e.f7787a;
                            int length2 = jArr6.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i12 = i7;
                                int i13 = 0;
                                while (true) {
                                    long j11 = jArr6[i13];
                                    j5 = j9;
                                    if ((((~j11) << c5) & j11 & j6) != j6) {
                                        int i14 = 8 - ((~(i13 - length2)) >>> 31);
                                        for (int i15 = 0; i15 < i14; i15++) {
                                            if ((j11 & 255) < 128) {
                                                j8 = j11;
                                                C1135v c1135v = (C1135v) objArr[(i13 << 3) + i15];
                                                C1135v c1135v2 = AbstractC1132s.f3738a;
                                                C1135v c1135v3 = AbstractC1132s.f3723B;
                                                if (AbstractC1665j.m2981a(c1135v, c1135v3)) {
                                                    List list = (List) AbstractC1131r.m2185d(c1125l, c1135v3);
                                                    m4224k(String.valueOf(list != null ? (C1269g) AbstractC0973m.m2013T(list) : null), i11);
                                                }
                                            } else {
                                                j8 = j11;
                                            }
                                            j11 = j8 >> i12;
                                        }
                                        if (i14 != i12) {
                                            break;
                                        }
                                        if (i13 == length2) {
                                            break;
                                        }
                                        i13++;
                                        j9 = j5;
                                        i12 = 8;
                                    }
                                    j9 = j5 >> 8;
                                    i9 = i5 + 1;
                                    jArr5 = jArr2;
                                    c6 = c5;
                                    j10 = j6;
                                    iArr3 = iArr2;
                                    i7 = 8;
                                    abstractC2428j2 = abstractC2428j;
                                }
                            } else {
                                j5 = j9;
                            }
                        } else {
                            iArr2 = iArr3;
                            j5 = j9;
                            C2408E c2408e2 = c1125l.f3702d;
                            Object[] objArr2 = c2408e2.f7788b;
                            long[] jArr7 = c2408e2.f7787a;
                            int length3 = jArr7.length - 2;
                            if (length3 >= 0) {
                                Object[] objArr3 = objArr2;
                                jArr2 = jArr5;
                                int i16 = 0;
                                while (true) {
                                    long j12 = jArr7[i16];
                                    Object[] objArr4 = objArr3;
                                    i5 = i9;
                                    if ((((~j12) << c5) & j12 & j6) != j6) {
                                        int i17 = 8 - ((~(i16 - length3)) >>> 31);
                                        int i18 = 0;
                                        while (i18 < i17) {
                                            if ((j12 & 255) < 128) {
                                                jArr4 = jArr7;
                                                C1135v c1135v4 = (C1135v) objArr4[(i16 << 3) + i18];
                                                C1135v c1135v5 = AbstractC1132s.f3738a;
                                                j7 = j12;
                                                C1135v c1135v6 = AbstractC1132s.f3723B;
                                                if (AbstractC1665j.m2981a(c1135v4, c1135v6)) {
                                                    List list2 = (List) AbstractC1131r.m2185d(c0684m0.f2200a, c1135v6);
                                                    C1269g c1269g = list2 != null ? (C1269g) AbstractC0973m.m2013T(list2) : null;
                                                    List list3 = (List) AbstractC1131r.m2185d(c1125l, c1135v6);
                                                    C1269g c1269g2 = list3 != null ? (C1269g) AbstractC0973m.m2013T(list3) : null;
                                                    if (!AbstractC1665j.m2981a(c1269g, c1269g2)) {
                                                        m4224k(String.valueOf(c1269g2), i11);
                                                    }
                                                }
                                            } else {
                                                jArr4 = jArr7;
                                                j7 = j12;
                                            }
                                            j12 = j7 >> 8;
                                            i18++;
                                            jArr7 = jArr4;
                                        }
                                        jArr3 = jArr7;
                                        if (i17 != 8) {
                                            break;
                                        }
                                    } else {
                                        jArr3 = jArr7;
                                    }
                                    if (i16 == length3) {
                                        break;
                                    }
                                    i16++;
                                    i9 = i5;
                                    objArr3 = objArr4;
                                    jArr7 = jArr3;
                                }
                                j9 = j5 >> 8;
                                i9 = i5 + 1;
                                jArr5 = jArr2;
                                c6 = c5;
                                j10 = j6;
                                iArr3 = iArr2;
                                i7 = 8;
                                abstractC2428j2 = abstractC2428j;
                            }
                        }
                        jArr2 = jArr5;
                    } else {
                        iArr2 = iArr3;
                        jArr2 = jArr5;
                        j5 = j9;
                        c5 = c6;
                        j6 = j10;
                    }
                    i5 = i9;
                    j9 = j5 >> 8;
                    i9 = i5 + 1;
                    jArr5 = jArr2;
                    c6 = c5;
                    j10 = j6;
                    iArr3 = iArr2;
                    i7 = 8;
                    abstractC2428j2 = abstractC2428j;
                }
                iArr = iArr3;
                int i19 = i7;
                jArr = jArr5;
                if (i8 != i19) {
                    return;
                }
            } else {
                iArr = iArr3;
                jArr = jArr5;
            }
            if (i6 == length) {
                return;
            }
            i6++;
            abstractC2428j2 = abstractC2428j;
            jArr5 = jArr;
            iArr3 = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p002A1.InterfaceC0132e
    /* JADX INFO: renamed from: f */
    public final void mo182f(InterfaceC0145r interfaceC0145r) {
        m4226m(this.f7681d.getSemanticsOwner().m2180a());
        m4222i();
        this.f7683f = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final AbstractC2428j m4220g() {
        if (this.f7687j) {
            this.f7687j = false;
            this.f7690m = AbstractC1131r.m2183b(this.f7681d.getSemanticsOwner(), C2368c.f7680e);
            this.f7691n = System.currentTimeMillis();
        }
        return this.f7690m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final boolean m4221h() {
        return this.f7683f != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m4222i() {
        C0822n c0822n = this.f7683f;
        if (c0822n == null) {
            return;
        }
        Object obj = c0822n.f2640a;
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        ArrayList arrayList = this.f7684g;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            C2370e c2370e = (C2370e) arrayList.get(i5);
            int iOrdinal = c2370e.f7698c.ordinal();
            if (iOrdinal == 0) {
                C0066i0 c0066i0 = c2370e.f7699d;
                if (c0066i0 != null) {
                    ViewStructure viewStructure = (ViewStructure) c0066i0.f297e;
                    if (Build.VERSION.SDK_INT >= 29) {
                        AbstractC0955a.m1958d(AbstractC0151x.m205f(obj), viewStructure);
                    }
                }
            } else {
                if (iOrdinal != 1) {
                    throw new C0330q();
                }
                AutofillId autofillIdM1455b = c0822n.m1455b(c2370e.f7696a);
                if (autofillIdM1455b != null && Build.VERSION.SDK_INT >= 29) {
                    AbstractC0955a.m1959e(AbstractC0151x.m205f(obj), autofillIdM1455b);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0955a.m1961g(AbstractC0151x.m205f(obj), c0822n.f2641b.getAutofillId(), new long[]{Long.MIN_VALUE});
        }
        arrayList.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m4223j(C1128o c1128o, C0684M0 c0684m0) {
        C0372J c0372j = new C0372J(3, c0684m0, this);
        c1128o.getClass();
        List listM2163j = C1128o.m2163j(4, c1128o);
        int size = listM2163j.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            Object obj = listM2163j.get(i6);
            if (m4220g().m4317a(((C1128o) obj).f3714g)) {
                c0372j.mo0g(Integer.valueOf(i5), obj);
                i5++;
            }
        }
        List listM2163j2 = C1128o.m2163j(4, c1128o);
        int size2 = listM2163j2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            C1128o c1128o2 = (C1128o) listM2163j2.get(i7);
            AbstractC2428j abstractC2428jM4220g = m4220g();
            int i8 = c1128o2.f3714g;
            if (abstractC2428jM4220g.m4317a(i8)) {
                C2439u c2439u = this.f7692o;
                if (c2439u.m4317a(i8)) {
                    Object objM4318b = c2439u.m4318b(i8);
                    if (objM4318b == null) {
                        throw AbstractC0231b.m396g("node not present in pruned tree before this change");
                    }
                    m4223j(c1128o2, (C0684M0) objM4318b);
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m4224k(String str, int i5) {
        C0822n c0822n;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 29 && (c0822n = this.f7683f) != null) {
            AutofillId autofillIdM1455b = c0822n.m1455b(i5);
            if (autofillIdM1455b == null) {
                throw AbstractC0231b.m396g("Invalid content capture ID");
            }
            if (i6 >= 29) {
                AbstractC0955a.m1960f(AbstractC0151x.m205f(c0822n.f2640a), autofillIdM1455b, str);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4225l(int i5, C1128o c1128o) {
        InterfaceC1601c interfaceC1601c;
        int i6;
        C2684c c2684cM2164a;
        C0066i0 c0066i0;
        String strM1196r;
        InterfaceC1601c interfaceC1601c2;
        if (m4221h()) {
            C2408E c2408e = c1128o.f3711d.f3702d;
            Object objM4272g = c2408e.m4272g(AbstractC1132s.f3725D);
            if (objM4272g == null) {
                objM4272g = null;
            }
            Boolean bool = (Boolean) objM4272g;
            if (this.f7686i == EnumC2366a.f7673d && AbstractC1665j.m2981a(bool, Boolean.TRUE)) {
                Object objM4272g2 = c2408e.m4272g(AbstractC1124k.f3688m);
                if (objM4272g2 == null) {
                    objM4272g2 = null;
                }
                C1114a c1114a = (C1114a) objM4272g2;
                if (c1114a != null && (interfaceC1601c2 = (InterfaceC1601c) c1114a.f3634b) != null) {
                }
            } else if (this.f7686i == EnumC2366a.f7674e && AbstractC1665j.m2981a(bool, Boolean.FALSE)) {
                Object objM4272g3 = c2408e.m4272g(AbstractC1124k.f3688m);
                if (objM4272g3 == null) {
                    objM4272g3 = null;
                }
                C1114a c1114a2 = (C1114a) objM4272g3;
                if (c1114a2 != null && (interfaceC1601c = (InterfaceC1601c) c1114a2.f3634b) != null) {
                }
            }
            int i7 = c1128o.f3714g;
            C0822n c0822n = this.f7683f;
            if (c0822n != null && (i6 = Build.VERSION.SDK_INT) >= 29) {
                AutofillId autofillId = this.f7681d.getAutofillId();
                C1128o c1128oM2174l = c1128o.m2174l();
                int i8 = c1128o.f3714g;
                if (c1128oM2174l == null || (autofillId = c0822n.m1455b(c1128oM2174l.f3714g)) != null) {
                    C0066i0 c0066i02 = i6 >= 29 ? new C0066i0(10, AbstractC0955a.m1957c(AbstractC0151x.m205f(c0822n.f2640a), autofillId, i8)) : null;
                    if (c0066i02 == null) {
                        c0066i0 = null;
                    } else {
                        ViewStructure viewStructure = (ViewStructure) c0066i02.f297e;
                        C1125l c1125l = c1128o.f3711d;
                        C1135v c1135v = AbstractC1132s.f3732K;
                        C2408E c2408e2 = c1125l.f3702d;
                        if (!c2408e2.m4268c(c1135v)) {
                            Bundle extras = viewStructure.getExtras();
                            if (extras != null) {
                                extras.putLong("android.view.contentcapture.EventTimestamp", this.f7691n);
                                extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i5);
                            }
                            Object objM4272g4 = c2408e2.m4272g(AbstractC1132s.f3763z);
                            if (objM4272g4 == null) {
                                objM4272g4 = null;
                            }
                            String str = (String) objM4272g4;
                            if (str != null) {
                                viewStructure.setId(i8, null, null, str);
                            }
                            Object objM4272g5 = c2408e2.m4272g(AbstractC1132s.f3750m);
                            if (objM4272g5 == null) {
                                objM4272g5 = null;
                            }
                            if (((Boolean) objM4272g5) != null) {
                                viewStructure.setClassName("android.widget.ViewGroup");
                            }
                            Object objM4272g6 = c2408e2.m4272g(AbstractC1132s.f3723B);
                            if (objM4272g6 == null) {
                                objM4272g6 = null;
                            }
                            List list = (List) objM4272g6;
                            if (list != null) {
                                viewStructure.setClassName("android.widget.TextView");
                                viewStructure.setText(AbstractC2179a.m4007a(list, "\n", null, 62));
                            }
                            Object objM4272g7 = c2408e2.m4272g(AbstractC1132s.f3727F);
                            if (objM4272g7 == null) {
                                objM4272g7 = null;
                            }
                            C1269g c1269g = (C1269g) objM4272g7;
                            if (c1269g != null) {
                                viewStructure.setClassName("android.widget.EditText");
                                viewStructure.setText(c1269g);
                            }
                            Object objM4272g8 = c2408e2.m4272g(AbstractC1132s.f3738a);
                            if (objM4272g8 == null) {
                                objM4272g8 = null;
                            }
                            List list2 = (List) objM4272g8;
                            if (list2 != null) {
                                viewStructure.setContentDescription(AbstractC2179a.m4007a(list2, "\n", null, 62));
                            }
                            Object objM4272g9 = c2408e2.m4272g(AbstractC1132s.f3762y);
                            if (objM4272g9 == null) {
                                objM4272g9 = null;
                            }
                            C1121h c1121h = (C1121h) objM4272g9;
                            if (c1121h != null && (strM1196r = AbstractC0681L.m1196r(c1121h.f3648a)) != null) {
                                viewStructure.setClassName(strM1196r);
                            }
                            C1257J c1257jM1189k = AbstractC0681L.m1189k(c1125l);
                            if (c1257jM1189k != null) {
                                C1256I c1256i = c1257jM1189k.f4526a;
                                C1260M c1260m = c1256i.f4517b;
                                InterfaceC2007c interfaceC2007c = c1256i.f4522g;
                                viewStructure.setTextStyle(interfaceC2007c.mo282p() * interfaceC2007c.mo272b() * C2019o.m3710c(c1260m.f4540a.f4495b), 0, 0, 0);
                            }
                            AbstractC0596h0 abstractC0596h0M2167d = c1128o.m2167d();
                            if (abstractC0596h0M2167d == null) {
                                c2684cM2164a = C2684c.f8557e;
                                float f2 = c2684cM2164a.f8558a;
                                float f5 = c2684cM2164a.f8559b;
                                viewStructure.setDimens((int) f2, (int) f5, 0, 0, (int) (c2684cM2164a.f8560c - f2), (int) (c2684cM2164a.f8561d - f5));
                                c0066i0 = c0066i02;
                            } else {
                                AbstractC0596h0 abstractC0596h0 = abstractC0596h0M2167d.mo981R0().f7199q ? abstractC0596h0M2167d : null;
                                if (abstractC0596h0 != null) {
                                    c2684cM2164a = c1128o.m2164a(abstractC0596h0);
                                }
                                float f22 = c2684cM2164a.f8558a;
                                float f52 = c2684cM2164a.f8559b;
                                viewStructure.setDimens((int) f22, (int) f52, 0, 0, (int) (c2684cM2164a.f8560c - f22), (int) (c2684cM2164a.f8561d - f52));
                                c0066i0 = c0066i02;
                            }
                        }
                    }
                }
            }
            if (c0066i0 != null) {
                this.f7684g.add(new C2370e(i7, this.f7691n, EnumC2371f.f7700d, c0066i0));
            }
            List listM2163j = C1128o.m2163j(4, c1128o);
            int size = listM2163j.size();
            int i9 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = listM2163j.get(i10);
                if (m4220g().m4317a(((C1128o) obj).f3714g)) {
                    m4225l(i9, (C1128o) obj);
                    i9++;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m4226m(C1128o c1128o) {
        if (m4221h()) {
            this.f7684g.add(new C2370e(c1128o.f3714g, this.f7691n, EnumC2371f.f7701e, null));
            List listM2163j = C1128o.m2163j(4, c1128o);
            int size = listM2163j.size();
            for (int i5 = 0; i5 < size; i5++) {
                m4226m((C1128o) listM2163j.get(i5));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4227n() {
        C2439u c2439u = this.f7692o;
        c2439u.m4339c();
        AbstractC2428j abstractC2428jM4220g = m4220g();
        int[] iArr = abstractC2428jM4220g.f7846b;
        Object[] objArr = abstractC2428jM4220g.f7847c;
        long[] jArr = abstractC2428jM4220g.f7845a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j5 = jArr[i5];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j5) < 128) {
                            int i8 = (i5 << 3) + i7;
                            c2439u.m4344h(iArr[i8], new C0684M0(((C1129p) objArr[i8]).f3715a, m4220g()));
                        }
                        j5 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    } else if (i5 == length) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
        }
        this.f7693p = new C0684M0(this.f7681d.getSemanticsOwner().m2180a(), m4220g());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f7689l.removeCallbacks(this.f7695r);
        this.f7683f = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
