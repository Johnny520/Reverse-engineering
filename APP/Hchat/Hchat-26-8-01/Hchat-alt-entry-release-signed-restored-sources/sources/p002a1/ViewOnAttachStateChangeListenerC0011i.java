package p002a1;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import androidx.lifecycle.AbstractC0092a0;
import androidx.lifecycle.C0119x;
import androidx.lifecycle.InterfaceC0097d;
import androidx.lifecycle.InterfaceC0112q;
import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.List;
import okio.C3193a;
import p015b0.C0156v;
import p017b2.AbstractC0169a;
import p057e1.C0808c;
import p069f.AbstractC0942k;
import p069f.AbstractC0944l;
import p069f.C0943k0;
import p069f.C0965w;
import p070f0.C0982n;
import p072f2.AbstractC1049l;
import p072f2.AbstractC1057t;
import p072f2.AbstractC1058u;
import p072f2.C1038a;
import p072f2.C1046i;
import p072f2.C1050m;
import p072f2.C1054q;
import p072f2.C1055r;
import p072f2.C1061x;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p119i2.C1926g;
import p119i2.C1933j0;
import p119i2.C1935k0;
import p119i2.C1941n0;
import p136j8.C2104o;
import p249qg.AbstractC3603v;
import p276sf.C3967n;
import p293u2.C4245o;
import p293u2.InterfaceC4233c;
import p324w2.AbstractC4679a;
import p332wb.AbstractC4855en;
import p339x1.AbstractC5614i1;
import p352xf.EnumC5799a;
import p357y1.AbstractC5883g0;
import p357y1.C5881f2;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;
import p370yf.AbstractC6038c;
import sg.AbstractC3978j;
import sg.C3970b;
import sg.C3971c;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: a1.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0011i implements InterfaceC0097d, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: g */
    public final ViewTreeObserverOnGlobalLayoutListenerC5934t f28g;

    /* JADX INFO: renamed from: h */
    public final C0156v f29h;

    /* JADX INFO: renamed from: i */
    public C0982n f30i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f31j = new ArrayList();

    /* JADX INFO: renamed from: k */
    public final long f32k = 100;

    /* JADX INFO: renamed from: l */
    public EnumC0004b f33l = EnumC0004b.f12g;

    /* JADX INFO: renamed from: m */
    public boolean f34m = true;

    /* JADX INFO: renamed from: n */
    public final C3971c f35n = AbstractC3978j.m8218a(1, 6, null);

    /* JADX INFO: renamed from: o */
    public C0965w f36o;

    /* JADX INFO: renamed from: p */
    public long f37p;

    /* JADX INFO: renamed from: q */
    public final C0965w f38q;

    /* JADX INFO: renamed from: r */
    public C5881f2 f39r;

    /* JADX INFO: renamed from: s */
    public boolean f40s;

    /* JADX INFO: renamed from: t */
    public final RunnableC0003a f41t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnAttachStateChangeListenerC0011i(ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t, C0156v c0156v) {
        this.f28g = viewTreeObserverOnGlobalLayoutListenerC5934t;
        this.f29h = c0156v;
        new Handler(Looper.getMainLooper());
        C0965w c0965w = AbstractC0944l.f2974a;
        c0965w.getClass();
        this.f36o = c0965w;
        this.f38q = new C0965w();
        this.f39r = new C5881f2(viewTreeObserverOnGlobalLayoutListenerC5934t.getSemanticsOwner().m2668a(), c0965w);
        this.f41t = new RunnableC0003a(this, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0097d
    /* JADX INFO: renamed from: c */
    public final void mo152c(InterfaceC0112q interfaceC0112q) {
        m163n(this.f28g.getSemanticsOwner().m2668a());
        m159j();
        this.f30i = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0097d
    /* JADX INFO: renamed from: d */
    public final void mo153d(InterfaceC0112q interfaceC0112q) {
        this.f30i = (C0982n) this.f29h.invoke();
        m162m(-1, this.f28g.getSemanticsOwner().m2668a());
        m159j();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0082 -> B:17:0x0046). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m154e(AbstractC6038c abstractC6038c) throws Throwable {
        C0007e c0007e;
        C3970b c3970b;
        if (abstractC6038c instanceof C0007e) {
            c0007e = (C0007e) abstractC6038c;
            int i9 = c0007e.f21j;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c0007e.f21j = i9 - Integer.MIN_VALUE;
            } else {
                c0007e = new C0007e(this, abstractC6038c);
            }
        }
        Object objM8185b = c0007e.f19h;
        int i10 = c0007e.f21j;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        if (i10 == 0) {
            AbstractC1089i.m2732I0(objM8185b);
            C3971c c3971c = this.f35n;
            c3971c.getClass();
            c3970b = new C3970b(c3971c);
        } else {
            if (i10 == 1) {
                c3970b = c0007e.f18g;
                AbstractC1089i.m2732I0(objM8185b);
                if (((Boolean) objM8185b).booleanValue()) {
                    return C3967n.f12976a;
                }
                c3970b.m8186c();
                if (m158i()) {
                    m159j();
                }
                Handler handler = this.f28g.getHandler();
                if (!this.f40s && handler != null) {
                    this.f40s = true;
                    handler.post(this.f41t);
                }
                c0007e.f18g = c3970b;
                c0007e.f21j = 2;
                if (AbstractC3603v.m7552f(this.f32k, c0007e) != enumC5799a) {
                }
                return enumC5799a;
            }
            if (i10 != 2) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c3970b = c0007e.f18g;
            AbstractC1089i.m2732I0(objM8185b);
        }
        c0007e.f18g = c3970b;
        c0007e.f21j = 1;
        objM8185b = c3970b.m8185b(c0007e);
        if (objM8185b != enumC5799a) {
            if (((Boolean) objM8185b).booleanValue()) {
            }
        }
        return enumC5799a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016a  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m155f(AbstractC0942k abstractC0942k) {
        int[] iArr;
        int[] iArr2;
        long j3;
        char c10;
        long j4;
        int i9;
        int i10;
        long j5;
        long j10;
        AbstractC0942k abstractC0942k2 = abstractC0942k;
        int[] iArr3 = abstractC0942k2.f2964b;
        long[] jArr = abstractC0942k2.f2963a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            char c11 = 7;
            long j12 = -9187201950435737472L;
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((j11 & 255) < 128) {
                        int i15 = iArr3[(i11 << 3) + i14];
                        c10 = c11;
                        C5881f2 c5881f2 = (C5881f2) this.f38q.m2313b(i15);
                        C1055r c1055r = (C1055r) abstractC0942k2.m2313b(i15);
                        C1054q c1054q = c1055r != null ? c1055r.f3353a : null;
                        if (c1054q == null) {
                            throw AbstractC4855en.m9257a("no value for specified key");
                        }
                        j4 = j12;
                        int i16 = c1054q.f3352f;
                        C0943k0 c0943k0 = c1054q.f3350d.f3341g;
                        if (c5881f2 == null) {
                            Object[] objArr = c0943k0.f2969b;
                            long[] jArr2 = c0943k0.f2968a;
                            int length2 = jArr2.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i17 = i12;
                                int i18 = 0;
                                while (true) {
                                    long j13 = jArr2[i18];
                                    j3 = j11;
                                    if ((((~j13) << c10) & j13 & j4) != j4) {
                                        int i19 = 8 - ((~(i18 - length2)) >>> 31);
                                        for (int i20 = 0; i20 < i19; i20++) {
                                            if ((j13 & 255) < 128) {
                                                j10 = j13;
                                                C1061x c1061x = (C1061x) objArr[(i18 << 3) + i20];
                                                C1061x c1061x2 = AbstractC1058u.f3361B;
                                                if (AbstractC1416l.m3825a(c1061x, c1061x2)) {
                                                    Object objM2320g = c0943k0.m2320g(c1061x2);
                                                    if (objM2320g == null) {
                                                        objM2320g = null;
                                                    }
                                                    List list = (List) objM2320g;
                                                    m161l(i16, String.valueOf(list != null ? (C1926g) AbstractC4166m.m8424v1(list) : null));
                                                }
                                            } else {
                                                j10 = j13;
                                            }
                                            j13 = j10 >> i17;
                                        }
                                        if (i19 != i17) {
                                            break;
                                        }
                                        if (i18 == length2) {
                                            break;
                                        }
                                        i18++;
                                        j11 = j3;
                                        i17 = 8;
                                    }
                                }
                            } else {
                                j3 = j11;
                            }
                        } else {
                            iArr2 = iArr3;
                            j3 = j11;
                            Object[] objArr2 = c0943k0.f2969b;
                            long[] jArr3 = c0943k0.f2968a;
                            int length3 = jArr3.length - 2;
                            if (length3 >= 0) {
                                long[] jArr4 = jArr3;
                                int i21 = 0;
                                while (true) {
                                    long j14 = jArr4[i21];
                                    long[] jArr5 = jArr4;
                                    i9 = i14;
                                    if ((((~j14) << c10) & j14 & j4) != j4) {
                                        int i22 = 8 - ((~(i21 - length3)) >>> 31);
                                        int i23 = 0;
                                        while (i23 < i22) {
                                            if ((j14 & 255) < 128) {
                                                j5 = j14;
                                                C1061x c1061x3 = (C1061x) objArr2[(i21 << 3) + i23];
                                                C1061x c1061x4 = AbstractC1058u.f3361B;
                                                if (AbstractC1416l.m3825a(c1061x3, c1061x4)) {
                                                    Object objM2320g2 = c5881f2.f23880a.f3341g.m2320g(c1061x4);
                                                    if (objM2320g2 == null) {
                                                        objM2320g2 = null;
                                                    }
                                                    List list2 = (List) objM2320g2;
                                                    C1926g c1926g = list2 != null ? (C1926g) AbstractC4166m.m8424v1(list2) : null;
                                                    Object objM2320g3 = c0943k0.m2320g(c1061x4);
                                                    if (objM2320g3 == null) {
                                                        objM2320g3 = null;
                                                    }
                                                    List list3 = (List) objM2320g3;
                                                    C1926g c1926g2 = list3 != null ? (C1926g) AbstractC4166m.m8424v1(list3) : null;
                                                    if (!AbstractC1416l.m3825a(c1926g, c1926g2)) {
                                                        m161l(i16, String.valueOf(c1926g2));
                                                    }
                                                }
                                            } else {
                                                j5 = j14;
                                            }
                                            i23++;
                                            j14 = j5 >> 8;
                                        }
                                        if (i22 != 8) {
                                            break;
                                        }
                                        if (i21 == length3) {
                                            break;
                                        }
                                        i21++;
                                        i14 = i9;
                                        jArr4 = jArr5;
                                    }
                                }
                            }
                            i10 = 8;
                        }
                        i9 = i14;
                        i10 = 8;
                    } else {
                        iArr2 = iArr3;
                        j3 = j11;
                        c10 = c11;
                        j4 = j12;
                        i9 = i14;
                        i10 = i12;
                    }
                    j11 = j3 >> i10;
                    i14 = i9 + 1;
                    i12 = i10;
                    c11 = c10;
                    j12 = j4;
                    iArr3 = iArr2;
                    abstractC0942k2 = abstractC0942k;
                }
                iArr = iArr3;
                if (i13 != i12) {
                    return;
                }
            } else {
                iArr = iArr3;
            }
            if (i11 == length) {
                return;
            }
            i11++;
            abstractC0942k2 = abstractC0942k;
            iArr3 = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m156g(C1054q c1054q, InterfaceC1235p interfaceC1235p) {
        c1054q.getClass();
        List listM2649j = C1054q.m2649j(4, c1054q);
        int size = listM2649j.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = listM2649j.get(i10);
            if (m157h().m2312a(((C1054q) obj).f3352f)) {
                interfaceC1235p.invoke(Integer.valueOf(i9), obj);
                i9++;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final AbstractC0942k m157h() {
        if (this.f34m) {
            this.f34m = false;
            this.f36o = AbstractC1057t.m2671b(this.f28g.getSemanticsOwner(), C0008f.f22g);
            this.f37p = System.currentTimeMillis();
        }
        return this.f36o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final boolean m158i() {
        return this.f30i != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m159j() {
        C0982n c0982n = this.f30i;
        if (c0982n == null) {
            return;
        }
        Object obj = c0982n.f3095a;
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        ArrayList arrayList = this.f31j;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            C0012j c0012j = (C0012j) arrayList.get(i9);
            int iOrdinal = c0012j.f44c.ordinal();
            if (iOrdinal == 0) {
                C0119x c0119x = c0012j.f45d;
                if (c0119x != null) {
                    ViewStructure viewStructure = (ViewStructure) c0119x.f310h;
                    if (Build.VERSION.SDK_INT >= 29) {
                        AbstractC0169a.m753d(AbstractC0092a0.m515c(obj), viewStructure);
                    }
                }
            } else {
                if (iOrdinal != 1) {
                    C3193a.m6822k();
                    return;
                }
                AutofillId autofillIdM2430b = c0982n.m2430b(c0012j.f42a);
                if (autofillIdM2430b != null && Build.VERSION.SDK_INT >= 29) {
                    AbstractC0169a.m754e(AbstractC0092a0.m515c(obj), autofillIdM2430b);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0169a.m756g(AbstractC0092a0.m515c(obj), c0982n.f3096b.getAutofillId(), new long[]{Long.MIN_VALUE});
        }
        arrayList.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m160k(C1054q c1054q, C5881f2 c5881f2) {
        m156g(c1054q, new C0009g(c5881f2, 0, this));
        List listM2649j = C1054q.m2649j(4, c1054q);
        int size = listM2649j.size();
        for (int i9 = 0; i9 < size; i9++) {
            C1054q c1054q2 = (C1054q) listM2649j.get(i9);
            AbstractC0942k abstractC0942kM157h = m157h();
            int i10 = c1054q2.f3352f;
            if (abstractC0942kM157h.m2312a(i10)) {
                C0965w c0965w = this.f38q;
                if (c0965w.m2312a(i10)) {
                    Object objM2313b = c0965w.m2313b(i10);
                    if (objM2313b == null) {
                        throw AbstractC4855en.m9257a("node not present in pruned tree before this change");
                    }
                    m160k(c1054q2, (C5881f2) objM2313b);
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m161l(int i9, String str) {
        C0982n c0982n;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29 && (c0982n = this.f30i) != null) {
            AutofillId autofillIdM2430b = c0982n.m2430b(i9);
            if (autofillIdM2430b == null) {
                throw AbstractC4855en.m9257a("Invalid content capture ID");
            }
            if (i10 >= 29) {
                AbstractC0169a.m755f(AbstractC0092a0.m515c(c0982n.f3095a), autofillIdM2430b, str);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m162m(int i9, C1054q c1054q) {
        InterfaceC1231l interfaceC1231l;
        int i10;
        C0808c c0808cM2650a;
        C0119x c0119x;
        String strM10606v;
        InterfaceC1231l interfaceC1231l2;
        if (m158i()) {
            C0943k0 c0943k0 = c1054q.f3350d.f3341g;
            Object objM2320g = c0943k0.m2320g(AbstractC1058u.f3363D);
            if (objM2320g == null) {
                objM2320g = null;
            }
            Boolean bool = (Boolean) objM2320g;
            if (this.f33l == EnumC0004b.f12g && AbstractC1416l.m3825a(bool, Boolean.TRUE)) {
                Object objM2320g2 = c0943k0.m2320g(AbstractC1049l.f3327m);
                if (objM2320g2 == null) {
                    objM2320g2 = null;
                }
                C1038a c1038a = (C1038a) objM2320g2;
                if (c1038a != null && (interfaceC1231l2 = (InterfaceC1231l) c1038a.f3270b) != null) {
                }
            } else if (this.f33l == EnumC0004b.f13h && AbstractC1416l.m3825a(bool, Boolean.FALSE)) {
                Object objM2320g3 = c0943k0.m2320g(AbstractC1049l.f3327m);
                if (objM2320g3 == null) {
                    objM2320g3 = null;
                }
                C1038a c1038a2 = (C1038a) objM2320g3;
                if (c1038a2 != null && (interfaceC1231l = (InterfaceC1231l) c1038a2.f3270b) != null) {
                }
            }
            int i11 = c1054q.f3352f;
            C0982n c0982n = this.f30i;
            if (c0982n != null && (i10 = Build.VERSION.SDK_INT) >= 29) {
                AutofillId autofillId = this.f28g.getAutofillId();
                C1054q c1054qM2660l = c1054q.m2660l();
                int i12 = c1054q.f3352f;
                if (c1054qM2660l == null || (autofillId = c0982n.m2430b(c1054qM2660l.f3352f)) != null) {
                    C0119x c0119x2 = i10 >= 29 ? new C0119x(AbstractC0169a.m752c(AbstractC0092a0.m515c(c0982n.f3095a), autofillId, i12), 2) : null;
                    if (c0119x2 == null) {
                        c0119x = null;
                    } else {
                        ViewStructure viewStructure = (ViewStructure) c0119x2.f310h;
                        C1050m c1050m = c1054q.f3350d;
                        C1061x c1061x = AbstractC1058u.f3370K;
                        C0943k0 c0943k02 = c1050m.f3341g;
                        if (!c0943k02.m2316c(c1061x)) {
                            Bundle extras = viewStructure.getExtras();
                            if (extras != null) {
                                extras.putLong("android.view.contentcapture.EventTimestamp", this.f37p);
                                extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i9);
                            }
                            Object objM2320g4 = c0943k02.m2320g(AbstractC1058u.f3401z);
                            if (objM2320g4 == null) {
                                objM2320g4 = null;
                            }
                            String str = (String) objM2320g4;
                            if (str != null) {
                                viewStructure.setId(i12, null, null, str);
                            }
                            Object objM2320g5 = c0943k02.m2320g(AbstractC1058u.f3388m);
                            if (objM2320g5 == null) {
                                objM2320g5 = null;
                            }
                            if (((Boolean) objM2320g5) != null) {
                                viewStructure.setClassName("android.widget.ViewGroup");
                            }
                            Object objM2320g6 = c0943k02.m2320g(AbstractC1058u.f3361B);
                            if (objM2320g6 == null) {
                                objM2320g6 = null;
                            }
                            List list = (List) objM2320g6;
                            if (list != null) {
                                viewStructure.setClassName("android.widget.TextView");
                                viewStructure.setText(AbstractC4679a.m9170a(list, "\n", null, 62));
                            }
                            Object objM2320g7 = c0943k02.m2320g(AbstractC1058u.f3365F);
                            if (objM2320g7 == null) {
                                objM2320g7 = null;
                            }
                            C1926g c1926g = (C1926g) objM2320g7;
                            if (c1926g != null) {
                                viewStructure.setClassName("android.widget.EditText");
                                viewStructure.setText(c1926g);
                            }
                            Object objM2320g8 = c0943k02.m2320g(AbstractC1058u.f3376a);
                            if (objM2320g8 == null) {
                                objM2320g8 = null;
                            }
                            List list2 = (List) objM2320g8;
                            if (list2 != null) {
                                viewStructure.setContentDescription(AbstractC4679a.m9170a(list2, "\n", null, 62));
                            }
                            Object objM2320g9 = c0943k02.m2320g(AbstractC1058u.f3400y);
                            if (objM2320g9 == null) {
                                objM2320g9 = null;
                            }
                            C1046i c1046i = (C1046i) objM2320g9;
                            if (c1046i != null && (strM10606v = AbstractC5883g0.m10606v(c1046i.f3287a)) != null) {
                                viewStructure.setClassName(strM10606v);
                            }
                            C1935k0 c1935k0M10599o = AbstractC5883g0.m10599o(c1050m);
                            if (c1935k0M10599o != null) {
                                C1933j0 c1933j0 = c1935k0M10599o.f6561a;
                                C1941n0 c1941n0 = c1933j0.f6550b;
                                InterfaceC4233c interfaceC4233c = c1933j0.f6555g;
                                viewStructure.setTextStyle(interfaceC4233c.mo1335q0() * interfaceC4233c.mo1333d() * C4245o.m8540c(c1941n0.f6580a.f6514b), 0, 0, 0);
                            }
                            AbstractC5614i1 abstractC5614i1M2653d = c1054q.m2653d();
                            if (abstractC5614i1M2653d == null) {
                                c0808cM2650a = C0808c.f2415e;
                                float f3 = c0808cM2650a.f2416a;
                                float f10 = c0808cM2650a.f2417b;
                                viewStructure.setDimens((int) f3, (int) f10, 0, 0, (int) (c0808cM2650a.f2418c - f3), (int) (c0808cM2650a.f2419d - f10));
                                c0119x = c0119x2;
                            } else {
                                AbstractC5614i1 abstractC5614i1 = abstractC5614i1M2653d.mo10106r1().f23801t ? abstractC5614i1M2653d : null;
                                if (abstractC5614i1 != null) {
                                    c0808cM2650a = c1054q.m2650a(abstractC5614i1);
                                }
                                float f32 = c0808cM2650a.f2416a;
                                float f102 = c0808cM2650a.f2417b;
                                viewStructure.setDimens((int) f32, (int) f102, 0, 0, (int) (c0808cM2650a.f2418c - f32), (int) (c0808cM2650a.f2419d - f102));
                                c0119x = c0119x2;
                            }
                        }
                    }
                }
            }
            if (c0119x != null) {
                this.f31j.add(new C0012j(i11, this.f37p, EnumC0013k.f46g, c0119x));
            }
            m156g(c1054q, new C0010h(this, 0));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m163n(C1054q c1054q) {
        if (m158i()) {
            this.f31j.add(new C0012j(c1054q.f3352f, this.f37p, EnumC0013k.f47h, null));
            List listM2649j = C1054q.m2649j(4, c1054q);
            int size = listM2649j.size();
            for (int i9 = 0; i9 < size; i9++) {
                m163n((C1054q) listM2649j.get(i9));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m164o() {
        C0965w c0965w = this.f38q;
        c0965w.m2374c();
        AbstractC0942k abstractC0942kM157h = m157h();
        int[] iArr = abstractC0942kM157h.f2964b;
        Object[] objArr = abstractC0942kM157h.f2965c;
        long[] jArr = abstractC0942kM157h.f2963a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i9 = 0;
            while (true) {
                long j3 = jArr[i9];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j3) < 128) {
                            int i12 = (i9 << 3) + i11;
                            c0965w.m2379h(iArr[i12], new C5881f2(((C1055r) objArr[i12]).f3353a, m157h()));
                        }
                        j3 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    } else if (i9 == length) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
        }
        this.f39r = new C5881f2(this.f28g.getSemanticsOwner().m2668a(), m157h());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.f28g.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.f41t);
        this.f30i = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
