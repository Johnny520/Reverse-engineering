package p109hb;

import ac.AbstractC0063p;
import android.app.Activity;
import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import okio.Utf8;
import p020b5.C0192k;
import p036c9.C0443h0;
import p036c9.C0455k0;
import p057e1.C0808c;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p100h0.C1511d1;
import p100h0.C1515f;
import p117i0.C1815c;
import p117i0.C1829f1;
import p117i0.C1845j1;
import p117i0.InterfaceC1809a1;
import p119i2.C1935k0;
import p119i2.C1939m0;
import p144k.C2209s1;
import p189n1.C2864c;
import p189n1.InterfaceC2862a;
import p190n2.C2884s;
import p190n2.C2890y;
import p197n9.C2912a;
import p251r.C3623h;
import p259r9.AbstractC3754e0;
import p266s0.C3874d;
import p276sf.C3967n;
import p308v1.InterfaceC4428t;
import p321w.AbstractC4634s;
import p321w.C4618m1;
import p321w.C4629q0;
import p321w.EnumC4602h0;
import p332wb.AbstractC5193p0;
import p332wb.C5293s1;
import p332wb.C5463x6;
import p332wb.C5491y2;
import p357y1.C5944v1;
import p357y1.InterfaceC5917o2;

/* JADX INFO: renamed from: hb.x */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1701x implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5671g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f5672h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f5673i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f5674j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f5675k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f5676l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f5677m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1701x(Activity activity, C1684i0 c1684i0, InterfaceC1231l interfaceC1231l, String str, String str2, boolean z9) {
        this.f5671g = 0;
        this.f5673i = activity;
        this.f5674j = c1684i0;
        this.f5675k = interfaceC1231l;
        this.f5676l = str;
        this.f5677m = str2;
        this.f5672h = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x021f  */
    @Override // p085fg.InterfaceC1231l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        C2890y c2890y;
        InterfaceC4428t interfaceC4428t;
        InterfaceC4428t interfaceC4428t2;
        switch (this.f5671g) {
            case 0:
                Activity activity = (Activity) this.f5673i;
                C1684i0 c1684i0 = (C1684i0) this.f5674j;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f5675k;
                String str = (String) this.f5676l;
                String str2 = (String) this.f5677m;
                List list = (List) obj;
                list.getClass();
                if (!activity.isFinishing() && !activity.isDestroyed()) {
                    if (list.isEmpty()) {
                        c1684i0.m4288e(activity, "没有可用联系人");
                    } else {
                        C5491y2.m9807U1(activity, list, interfaceC1231l, new C2209s1(7), str, str2, !this.f5672h, null, null, false, Utf8.MASK_2BYTES);
                    }
                }
                break;
            case 1:
                InterfaceC2862a interfaceC2862a = (InterfaceC2862a) this.f5673i;
                C1829f1 c1829f1 = (C1829f1) this.f5674j;
                C1829f1 c1829f12 = (C1829f1) this.f5675k;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f5676l;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f5677m;
                c1829f1.m4489h((((Float) obj).floatValue() / 2.0f) + c1829f1.m4488g());
                boolean z9 = this.f5672h;
                c1829f12.m4489h(z9 ? AbstractC3754e0.m7907q(c1829f1.m4488g(), -21.0f, 0.0f) : AbstractC3754e0.m7907q(c1829f1.m4488g(), 0.0f, 21.0f));
                float fM4488g = c1829f12.m4488g();
                if (-11.0f > fM4488g || fM4488g > -10.0f) {
                    float fM4488g2 = c1829f12.m4488g();
                    if (10.0f > fM4488g2 || fM4488g2 > 11.0f) {
                        float fM4488g3 = c1829f12.m4488g();
                        if (-20.0f > fM4488g3 || fM4488g3 > -1.0f) {
                            float fM4488g4 = c1829f12.m4488g();
                            if (1.0f <= fM4488g4 && fM4488g4 <= 20.0f) {
                                interfaceC1809a12.setValue(Boolean.FALSE);
                            } else if (!((Boolean) interfaceC1809a12.getValue()).booleanValue()) {
                                if ((z9 && c1829f12.m4488g() == -21.0f) || (!z9 && c1829f12.m4488g() == 0.0f)) {
                                    ((C2864c) interfaceC2862a).m6283a(22);
                                    Boolean bool = Boolean.TRUE;
                                    interfaceC1809a12.setValue(bool);
                                    interfaceC1809a1.setValue(bool);
                                } else if ((z9 && c1829f12.m4488g() == 0.0f) || (!z9 && c1829f12.m4488g() == 21.0f)) {
                                    ((C2864c) interfaceC2862a).m6283a(21);
                                    Boolean bool2 = Boolean.TRUE;
                                    interfaceC1809a12.setValue(bool2);
                                    interfaceC1809a1.setValue(bool2);
                                }
                            }
                        }
                    } else {
                        interfaceC1809a1.setValue(Boolean.FALSE);
                    }
                }
                break;
            case 2:
                C4629q0 c4629q0 = (C4629q0) this.f5673i;
                C1845j1 c1845j1 = c4629q0.f15340o;
                InterfaceC5917o2 interfaceC5917o2 = (InterfaceC5917o2) this.f5674j;
                C1511d1 c1511d1 = (C1511d1) this.f5675k;
                C2884s c2884s = (C2884s) this.f5676l;
                C0192k c0192k = (C0192k) this.f5677m;
                InterfaceC4428t interfaceC4428t3 = (InterfaceC4428t) obj;
                c4629q0.f15333h = interfaceC4428t3;
                C4618m1 c4618m1M9051d = c4629q0.m9051d();
                if (c4618m1M9051d != null) {
                    c4618m1M9051d.f15294b = interfaceC4428t3;
                }
                if (this.f5672h) {
                    if (c4629q0.m9048a() == EnumC4602h0.f15181h) {
                        if (((Boolean) c4629q0.f15337l.getValue()).booleanValue() && ((Boolean) ((C5944v1) interfaceC5917o2).f24166c.getValue()).booleanValue()) {
                            c1511d1.m4032r();
                        } else {
                            c1511d1.m4029o();
                        }
                        c4629q0.f15338m.setValue(Boolean.valueOf(AbstractC1184v0.m3216z(c1511d1, true)));
                        c4629q0.f15339n.setValue(Boolean.valueOf(AbstractC1184v0.m3216z(c1511d1, false)));
                        c1845j1.setValue(Boolean.valueOf(C1939m0.m4813c(c2884s.f9317b)));
                    } else if (c4629q0.m9048a() == EnumC4602h0.f15182i) {
                        c1845j1.setValue(Boolean.valueOf(AbstractC1184v0.m3216z(c1511d1, true)));
                    }
                    AbstractC4634s.m9080w(c4629q0, c2884s, c0192k);
                    C4618m1 c4618m1M9051d2 = c4629q0.m9051d();
                    if (c4618m1M9051d2 != null && (c2890y = c4629q0.f15330e) != null && c4629q0.m9049b() && (interfaceC4428t = c4618m1M9051d2.f15294b) != null && interfaceC4428t.mo8856C() && (interfaceC4428t2 = c4618m1M9051d2.f15295c) != null) {
                        C1935k0 c1935k0 = c4618m1M9051d2.f15293a;
                        C1815c c1815c = new C1815c(interfaceC4428t, 2);
                        C0808c c0808cM405O = AbstractC0063p.m405O(interfaceC4428t);
                        C0808c c0808cMo8866k0 = interfaceC4428t.mo8866k0(interfaceC4428t2, false);
                        if (AbstractC1416l.m3825a((C2890y) c2890y.f9343a.f9320b.get(), c2890y)) {
                            c2890y.f9344b.mo2400g(c2884s, c0192k, c1935k0, c1815c, c0808cM405O, c0808cMo8866k0);
                        }
                    }
                }
                break;
            case 3:
                InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) this.f5675k;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f5673i;
                List list2 = (List) this.f5674j;
                ArrayList arrayList = (ArrayList) this.f5676l;
                InterfaceC1231l interfaceC1231l3 = (InterfaceC1231l) this.f5677m;
                C3623h c3623h = (C3623h) obj;
                c3623h.getClass();
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19763f3, 3);
                C3623h.m7604a(c3623h, null, new C3874d(2094552550, new C1515f(this.f5672h, interfaceC1231l2, 2), true), 3);
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19771g3, 3);
                C3623h.m7604a(c3623h, null, new C3874d(-187052252, new C5293s1(interfaceC1809a13, 0), true), 3);
                C3623h.m7604a(c3623h, null, new C3874d(819628995, new C0443h0(list2, arrayList, interfaceC1231l3, 2), true), 3);
                break;
            default:
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f5673i;
                Set set = (Set) this.f5674j;
                InterfaceC1231l interfaceC1231l4 = (InterfaceC1231l) this.f5675k;
                C2912a c2912a = (C2912a) this.f5676l;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f5677m;
                C3623h c3623h2 = (C3623h) obj;
                c3623h2.getClass();
                C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19843p3, 3);
                C3623h.m7604a(c3623h2, null, new C3874d(65567868, new C0455k0((Object) interfaceC1809a14, (Object) set, interfaceC1231l4, (Object) c2912a, 11), true), 3);
                if (this.f5672h) {
                    C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19851q3, 3);
                    C3623h.m7604a(c3623h2, null, new C3874d(-875035711, new C5463x6(interfaceC1220a, 9), true), 3);
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C1701x(C4629q0 c4629q0, boolean z9, InterfaceC5917o2 interfaceC5917o2, C1511d1 c1511d1, C2884s c2884s, C0192k c0192k) {
        this.f5671g = 2;
        this.f5673i = c4629q0;
        this.f5672h = z9;
        this.f5674j = interfaceC5917o2;
        this.f5675k = c1511d1;
        this.f5676l = c2884s;
        this.f5677m = c0192k;
    }

    public /* synthetic */ C1701x(boolean z9, InterfaceC1231l interfaceC1231l, InterfaceC1809a1 interfaceC1809a1, List list, ArrayList arrayList, InterfaceC1231l interfaceC1231l2) {
        this.f5671g = 3;
        this.f5672h = z9;
        this.f5675k = interfaceC1231l;
        this.f5673i = interfaceC1809a1;
        this.f5674j = list;
        this.f5676l = arrayList;
        this.f5677m = interfaceC1231l2;
    }

    public /* synthetic */ C1701x(boolean z9, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i9) {
        this.f5671g = i9;
        this.f5672h = z9;
        this.f5673i = obj;
        this.f5674j = obj2;
        this.f5675k = obj3;
        this.f5676l = obj4;
        this.f5677m = obj5;
    }
}
