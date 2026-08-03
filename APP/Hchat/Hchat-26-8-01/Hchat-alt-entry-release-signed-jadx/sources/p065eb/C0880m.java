package p065eb;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.widget.Toast;
import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import na.C2921i;
import na.C2922j;
import okhttp3.HttpUrl;
import org.json.JSONException;
import p007a7.AbstractC0018a;
import p016b1.C0166f;
import p028c1.C0374d;
import p036c9.C0443h0;
import p071f1.C1009j;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p099h.Hchat.hooks.items.script.ScriptPluginBridge;
import p101h1.C1570g;
import p117i0.C1808a0;
import p117i0.C1891w1;
import p117i0.InterfaceC1809a1;
import p117i0.InterfaceC1854l2;
import p218og.AbstractC3149m;
import p251r.C3623h;
import p259r9.AbstractC3754e0;
import p266s0.C3874d;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p321w.C4600g1;
import p332wb.AbstractC4855en;
import p332wb.AbstractC4955ho;
import p332wb.AbstractC5193p0;
import p332wb.C4812dc;
import p332wb.C4957hq;
import p332wb.C5099m5;
import p332wb.C5140nd;
import p332wb.C5157nu;
import p332wb.C5170oa;
import p332wb.C5203pa;
import p332wb.C5238qc;
import p332wb.C5292s0;
import p332wb.C5293s1;
import p332wb.C5326t1;
import p332wb.C5332t7;
import p332wb.C5348tn;
import p332wb.C5359u1;
import p332wb.C5392v1;
import p332wb.C5403vc;
import p332wb.C5463x6;
import p332wb.C5469xc;
import p345x8.C5709b;
import p345x8.C5725r;
import sh.C4024l;
import tf.AbstractC4166m;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: eb.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0880m implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2699g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f2700h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f2701i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f2702j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f2703k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f2704l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f2705m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f2706n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0880m(String str, String str2, ArrayList arrayList, Set set, String str3, ScriptPluginBridge scriptPluginBridge, Consumer consumer) {
        this.f2699g = 1;
        this.f2700h = str;
        this.f2701i = str2;
        this.f2705m = arrayList;
        this.f2706n = set;
        this.f2702j = str3;
        this.f2703k = scriptPluginBridge;
        this.f2704l = consumer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014f  */
    @Override // p085fg.InterfaceC1231l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) throws JSONException {
        Object next;
        Object obj2;
        Object next2;
        String strM241e;
        String str;
        String str2;
        Object c3959f;
        switch (this.f2699g) {
            case 0:
                return ScriptPluginBridge.showModuleInputDialog$lambda$0((String) this.f2700h, (String) this.f2701i, (String) this.f2702j, (String) this.f2705m, (String) this.f2706n, (ScriptPluginBridge) this.f2703k, (Consumer) this.f2704l, (Activity) obj);
            case 1:
                return ScriptPluginBridge.showModuleMultiChoiceDialog$lambda$3((String) this.f2700h, (String) this.f2701i, (ArrayList) this.f2705m, (Set) this.f2706n, (String) this.f2702j, (ScriptPluginBridge) this.f2703k, (Consumer) this.f2704l, (Activity) obj);
            case 2:
                InterfaceC1854l2 interfaceC1854l2 = (InterfaceC1854l2) this.f2700h;
                InterfaceC1854l2 interfaceC1854l22 = (InterfaceC1854l2) this.f2701i;
                InterfaceC1854l2 interfaceC1854l23 = (InterfaceC1854l2) this.f2702j;
                InterfaceC1854l2 interfaceC1854l24 = (InterfaceC1854l2) this.f2705m;
                InterfaceC1854l2 interfaceC1854l25 = (InterfaceC1854l2) this.f2706n;
                InterfaceC1854l2 interfaceC1854l26 = (InterfaceC1854l2) this.f2703k;
                C1009j c1009j = (C1009j) this.f2704l;
                C0374d c0374d = (C0374d) obj;
                c0374d.getClass();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (c0374d.f1051g.mo1324a() >> 32)) * 0.09f;
                float f3 = 2;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c0374d.f1051g.mo1324a() >> 32)) / f3;
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (c0374d.f1051g.mo1324a() & 4294967295L)) / f3;
                float f10 = 23.0f / f3;
                return c0374d.m1334e(new C0166f(new C1891w1(interfaceC1854l2, interfaceC1854l22, interfaceC1854l23, interfaceC1854l24, interfaceC1854l25, interfaceC1854l26, c1009j, new C4024l((((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (c0374d.f1051g.mo1324a() >> 32)) * ((5.0f - f10) / 23.0f)) + fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (c0374d.f1051g.mo1324a() & 4294967295L)) * ((9.4f - f10) / 23.0f)) + fIntBitsToFloat3)) & 4294967295L), (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (c0374d.f1051g.mo1324a() >> 32)) * ((10.3f - f10) / 23.0f)) + fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (c0374d.f1051g.mo1324a() & 4294967295L)) * ((14.9f - f10) / 23.0f)) + fIntBitsToFloat3)) & 4294967295L), (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (c0374d.f1051g.mo1324a() >> 32)) * ((17.9f - f10) / 23.0f)) + fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (c0374d.f1051g.mo1324a() & 4294967295L)) * ((5.1f - f10) / 23.0f)) + fIntBitsToFloat3)) & 4294967295L), fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat), new C1570g(fIntBitsToFloat, 10.0f, 1, 1, 16), 1), 1));
            case 3:
                SharedPreferences sharedPreferences = (SharedPreferences) this.f2700h;
                Set set = (Set) this.f2701i;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f2702j;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f2705m;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f2706n;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f2703k;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f2704l;
                C3623h c3623h = (C3623h) obj;
                c3623h.getClass();
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19672T1, 3);
                C3623h.m7604a(c3623h, null, new C3874d(1600118507, new C0443h0(sharedPreferences, set, interfaceC1220a, 19), true), 3);
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19679U1, 3);
                C3623h.m7604a(c3623h, null, new C3874d(-862466579, new C5403vc(sharedPreferences, interfaceC1809a1, 1), true), 3);
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19686V1, 3);
                C3623h.m7604a(c3623h, null, new C3874d(969915631, new C5203pa(sharedPreferences, interfaceC1809a12, interfaceC1809a13, interfaceC1809a14, 2), true), 3);
                return C3967n.f12976a;
            case 4:
                ArrayList arrayList = (ArrayList) this.f2700h;
                List list = (List) this.f2701i;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f2702j;
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f2705m;
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) this.f2706n;
                InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) this.f2703k;
                InterfaceC1809a1 interfaceC1809a19 = (InterfaceC1809a1) this.f2704l;
                C3623h c3623h2 = (C3623h) obj;
                c3623h2.getClass();
                C3623h.m7604a(c3623h2, null, new C3874d(-750269058, new C5359u1(list, interfaceC1809a15, interfaceC1809a16, 2), true), 3);
                C3623h.m7604a(c3623h2, null, new C3874d(619113077, new C5293s1(interfaceC1809a17, 17), true), 3);
                if (((Boolean) interfaceC1809a18.getValue()).booleanValue()) {
                    C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19562D3, 3);
                } else if (((String) interfaceC1809a19.getValue()).length() > 0) {
                    C3623h.m7604a(c3623h2, null, new C3874d(1042522399, new C5293s1(interfaceC1809a19, 18), true), 3);
                } else if (arrayList.isEmpty()) {
                    C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19576F3, 3);
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C3623h.m7604a(c3623h2, null, new C3874d(1117928861, new C5392v1((C5292s0) it.next(), interfaceC1809a17, 1), true), 3);
                    }
                }
                return C3967n.f12976a;
            case 5:
                C4957hq c4957hq = (C4957hq) this.f2701i;
                String str3 = (String) this.f2700h;
                InterfaceC1809a1 interfaceC1809a110 = (InterfaceC1809a1) this.f2702j;
                InterfaceC1809a1 interfaceC1809a111 = (InterfaceC1809a1) this.f2705m;
                List list2 = (List) this.f2706n;
                InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) this.f2703k;
                Context context = (Context) this.f2704l;
                C3623h c3623h3 = (C3623h) obj;
                c3623h3.getClass();
                C3623h.m7604a(c3623h3, null, AbstractC5193p0.f19647P4, 3);
                C3623h.m7604a(c3623h3, null, new C3874d(1333967688, new C0443h0(22, c4957hq, interfaceC1809a110, str3), true), 3);
                C3623h.m7604a(c3623h3, null, AbstractC5193p0.f19654Q4, 3);
                C3623h.m7604a(c3623h3, null, new C3874d(-284015098, new C5238qc(interfaceC1809a111, list2, 5), true), 3);
                if (c4957hq.f17733c) {
                    C3623h.m7604a(c3623h3, null, AbstractC5193p0.f19661R4, 3);
                    C3623h.m7604a(c3623h3, null, new C3874d(-1648013363, new C4812dc(interfaceC1220a2, context, 3), true), 3);
                }
                return C3967n.f12976a;
            case 6:
                C5157nu c5157nu = (C5157nu) this.f2700h;
                InterfaceC1809a1 interfaceC1809a112 = (InterfaceC1809a1) this.f2701i;
                List list3 = (List) this.f2702j;
                InterfaceC1809a1 interfaceC1809a113 = (InterfaceC1809a1) this.f2705m;
                InterfaceC1809a1 interfaceC1809a114 = (InterfaceC1809a1) this.f2706n;
                Context context2 = (Context) this.f2703k;
                InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) this.f2704l;
                C3623h c3623h4 = (C3623h) obj;
                c3623h4.getClass();
                C3623h.m7604a(c3623h4, null, AbstractC5193p0.f19905x5, 3);
                C3623h.m7604a(c3623h4, null, new C3874d(233409089, new C5293s1(interfaceC1809a112, 13), true), 3);
                C3623h.m7604a(c3623h4, null, AbstractC5193p0.f19912y5, 3);
                C3623h.m7604a(c3623h4, null, new C3874d(1615550275, new C5238qc(list3, interfaceC1809a112, 2), true), 3);
                C3623h.m7604a(c3623h4, null, AbstractC5193p0.f19919z5, 3);
                C3623h.m7604a(c3623h4, null, new C3874d(-1297275835, new C5326t1(9, interfaceC1809a112, interfaceC1809a113), true), 3);
                C3623h.m7604a(c3623h4, null, AbstractC5193p0.f19543A5, 3);
                C3623h.m7604a(c3623h4, null, new C3874d(84865351, new C5326t1(10, interfaceC1809a112, interfaceC1809a114), true), 3);
                C3623h.m7604a(c3623h4, null, AbstractC5193p0.f19550B5, 3);
                C3623h.m7604a(c3623h4, null, new C3874d(1467006537, new C5170oa(context2, interfaceC1809a112, 2), true), 3);
                if (c5157nu.f19304c) {
                    C3623h.m7604a(c3623h4, null, AbstractC5193p0.f19557C5, 3);
                    C3623h.m7604a(c3623h4, null, new C3874d(-2013690276, new C5463x6(interfaceC1220a3, 16), true), 3);
                }
                return C3967n.f12976a;
            case 7:
                InterfaceC1809a1 interfaceC1809a115 = (InterfaceC1809a1) this.f2700h;
                SharedPreferences sharedPreferences2 = (SharedPreferences) this.f2701i;
                InterfaceC1809a1 interfaceC1809a116 = (InterfaceC1809a1) this.f2702j;
                List list4 = (List) this.f2705m;
                InterfaceC1235p interfaceC1235p = (InterfaceC1235p) this.f2706n;
                List list5 = (List) this.f2703k;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f2704l;
                C3623h c3623h5 = (C3623h) obj;
                c3623h5.getClass();
                if (AbstractC3149m.m6721t0((String) interfaceC1809a115.getValue())) {
                    C3623h.m7604a(c3623h5, null, new C3874d(1453046780, new C5332t7(sharedPreferences2, interfaceC1809a115, interfaceC1809a116), true), 3);
                } else {
                    C3623h.m7604a(c3623h5, null, new C3874d(-201818235, new C5140nd(4, list4), true), 3);
                    C3623h.m7604a(c3623h5, null, new C3874d(-1860152964, new C5469xc((Object) list4, (Object) sharedPreferences2, (Object) interfaceC1809a115, interfaceC1235p, (Object) interfaceC1809a116, 10), true), 3);
                    C3623h.m7604a(c3623h5, null, new C3874d(303149245, new C5140nd(5, list5), true), 3);
                    C3623h.m7604a(c3623h5, null, new C3874d(-1828515842, new C5469xc(list5, sharedPreferences2, interfaceC1809a115, interfaceC1231l, interfaceC1809a116), true), 3);
                }
                return C3967n.f12976a;
            case 8:
                C5725r c5725r = (C5725r) this.f2700h;
                Context context3 = (Context) this.f2701i;
                InterfaceC1809a1 interfaceC1809a117 = (InterfaceC1809a1) this.f2702j;
                InterfaceC1809a1 interfaceC1809a118 = (InterfaceC1809a1) this.f2705m;
                InterfaceC1809a1 interfaceC1809a119 = (InterfaceC1809a1) this.f2706n;
                InterfaceC1809a1 interfaceC1809a120 = (InterfaceC1809a1) this.f2703k;
                InterfaceC1809a1 interfaceC1809a121 = (InterfaceC1809a1) this.f2704l;
                List list6 = (List) obj;
                list6.getClass();
                String str4 = (String) interfaceC1809a117.getValue();
                C5709b c5709bM10314a = null;
                if (AbstractC1416l.m3825a(str4, "autoAccept")) {
                    c5725r.getClass();
                    c5725r.m10391k("auto_accept_steps_v1", AbstractC3754e0.m7859B(list6));
                } else {
                    if (!AbstractC1416l.m3825a(str4, "greetAccepted")) {
                        String str5 = (String) interfaceC1809a118.getValue();
                        if (str5 != null) {
                            C5709b c5709b = (C5709b) interfaceC1809a119.getValue();
                            if (c5709b == null) {
                                Iterator it2 = ((List) interfaceC1809a120.getValue()).iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        next = it2.next();
                                        if (AbstractC1416l.m3825a(((C5709b) next).f23199a, str5)) {
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                c5709b = (C5709b) next;
                            }
                            C5709b c5709b2 = c5709b;
                            if (c5709b2 != null) {
                                obj2 = null;
                                c5709bM10314a = C5709b.m10314a(c5709b2, null, false, null, null, 0, 0, null, null, null, null, 0, 0, null, null, 0, 0L, false, list6, 262143);
                            } else {
                                obj2 = null;
                            }
                            if (c5709bM10314a != null) {
                                interfaceC1809a119.setValue(c5709bM10314a);
                                List<C5709b> list7 = (List) interfaceC1809a120.getValue();
                                ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(list7));
                                for (C5709b c5709b3 : list7) {
                                    if (AbstractC1416l.m3825a(c5709b3.f23199a, str5)) {
                                        c5709b3 = c5709bM10314a;
                                    }
                                    arrayList2.add(c5709b3);
                                }
                                AbstractC4955ho.m9294B(c5725r, interfaceC1809a120, arrayList2);
                            }
                        }
                        Toast.makeText(context3, "回复步骤已保存", 0).show();
                        interfaceC1809a121.setValue(obj2);
                        return C3967n.f12976a;
                    }
                    c5725r.getClass();
                    c5725r.m10391k("greet_accepted_steps_v1", AbstractC3754e0.m7859B(list6));
                }
                obj2 = null;
                Toast.makeText(context3, "回复步骤已保存", 0).show();
                interfaceC1809a121.setValue(obj2);
                return C3967n.f12976a;
            case 9:
                Context context4 = (Context) this.f2700h;
                InterfaceC1809a1 interfaceC1809a122 = (InterfaceC1809a1) this.f2701i;
                InterfaceC1809a1 interfaceC1809a123 = (InterfaceC1809a1) this.f2702j;
                InterfaceC1809a1 interfaceC1809a124 = (InterfaceC1809a1) this.f2705m;
                SharedPreferences sharedPreferences3 = (SharedPreferences) this.f2706n;
                InterfaceC1809a1 interfaceC1809a125 = (InterfaceC1809a1) this.f2703k;
                InterfaceC1809a1 interfaceC1809a126 = (InterfaceC1809a1) this.f2704l;
                List<C5099m5> list8 = (List) obj;
                list8.getClass();
                ArrayList arrayList3 = new ArrayList(AbstractC4167n.m8429e1(list8));
                for (C5099m5 c5099m5 : list8) {
                    List list9 = (List) interfaceC1809a122.getValue();
                    List list10 = (List) interfaceC1809a123.getValue();
                    String strM241e2 = AbstractC0018a.m241e(c5099m5.f18836a.f20550a);
                    Iterator it3 = list10.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next2 = it3.next();
                            if (AbstractC1416l.m3825a(AbstractC0018a.m241e(((C2921i) next2).f9494b), strM241e2)) {
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    C2921i c2921i = (C2921i) next2;
                    C5292s0 c5292s0 = c5099m5.f18836a;
                    String string = AbstractC3149m.m6703R0(c5292s0.f20550a).toString();
                    if (c2921i == null || (strM241e = c2921i.f9493a) == null) {
                        strM241e = AbstractC0018a.m241e(string);
                    }
                    String str6 = strM241e;
                    if (c2921i == null || (str = c2921i.f9495c) == null) {
                        String str7 = c5292s0.f20551b;
                        str = AbstractC3149m.m6721t0(str7) ? string : str7;
                    } else {
                        if (AbstractC3149m.m6721t0(str)) {
                            str = null;
                        }
                        if (str == null) {
                        }
                    }
                    String str8 = str;
                    boolean z9 = c2921i != null ? c2921i.f9496d : false;
                    if (c2921i == null || (str2 = c2921i.f9497e) == null) {
                        str2 = list9.size() == 1 ? ((C2922j) AbstractC4166m.m8422t1(list9)).f9512a : HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    arrayList3.add(new C2921i(str6, string, str8, z9, str2, false, null));
                }
                if (arrayList3.size() == 1) {
                    C2921i c2921i2 = (C2921i) AbstractC4166m.m8422t1(arrayList3);
                    Iterator it4 = ((List) interfaceC1809a123.getValue()).iterator();
                    int i9 = 0;
                    while (true) {
                        if (!it4.hasNext()) {
                            i9 = -1;
                        } else if (!AbstractC1416l.m3825a(((C2921i) it4.next()).f9494b, c2921i2.f9494b)) {
                            i9++;
                        }
                    }
                    Integer numValueOf = Integer.valueOf(i9);
                    if (i9 < 0) {
                        numValueOf = null;
                    }
                    interfaceC1809a124.setValue(new C4957hq(numValueOf != null ? numValueOf.intValue() : ((List) interfaceC1809a123.getValue()).size(), c2921i2, i9 >= 0));
                } else if (!arrayList3.isEmpty()) {
                    List listM9673t7 = AbstractC4955ho.m9673t7((List) interfaceC1809a123.getValue(), arrayList3);
                    interfaceC1809a123.setValue(listM9673t7);
                    AbstractC4955ho.m9481Y2(sharedPreferences3, interfaceC1809a122, interfaceC1809a123, interfaceC1809a125, null, listM9673t7, null, 80);
                    AbstractC4855en.m9271o("已添加 ", arrayList3.size(), " 个适用聊天", context4, 0);
                }
                interfaceC1809a126.setValue(null);
                return C3967n.f12976a;
            case 10:
                SharedPreferences sharedPreferences4 = (SharedPreferences) this.f2700h;
                InterfaceC1809a1 interfaceC1809a127 = (InterfaceC1809a1) this.f2701i;
                InterfaceC1809a1 interfaceC1809a128 = (InterfaceC1809a1) this.f2702j;
                InterfaceC1809a1 interfaceC1809a129 = (InterfaceC1809a1) this.f2705m;
                InterfaceC1809a1 interfaceC1809a130 = (InterfaceC1809a1) this.f2706n;
                InterfaceC1809a1 interfaceC1809a131 = (InterfaceC1809a1) this.f2703k;
                InterfaceC1809a1 interfaceC1809a132 = (InterfaceC1809a1) this.f2704l;
                ((C1808a0) obj).getClass();
                return new C5348tn(sharedPreferences4, interfaceC1809a127, interfaceC1809a128, interfaceC1809a129, interfaceC1809a130, interfaceC1809a131, interfaceC1809a132);
            default:
                String str9 = (String) this.f2700h;
                final InterfaceC1809a1 interfaceC1809a133 = (InterfaceC1809a1) this.f2701i;
                final InterfaceC1809a1 interfaceC1809a134 = (InterfaceC1809a1) this.f2702j;
                final InterfaceC1809a1 interfaceC1809a135 = (InterfaceC1809a1) this.f2705m;
                final InterfaceC1809a1 interfaceC1809a136 = (InterfaceC1809a1) this.f2706n;
                final InterfaceC1809a1 interfaceC1809a137 = (InterfaceC1809a1) this.f2703k;
                InterfaceC1809a1 interfaceC1809a138 = (InterfaceC1809a1) this.f2704l;
                final C1808a0 c1808a0 = (C1808a0) obj;
                c1808a0.getClass();
                if (str9 != null && !AbstractC3149m.m6721t0(str9)) {
                    try {
                        MediaPlayer mediaPlayer = new MediaPlayer();
                        mediaPlayer.setDataSource(str9);
                        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: wb.fv
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // android.media.MediaPlayer.OnPreparedListener
                            public final void onPrepared(MediaPlayer mediaPlayer2) {
                                int duration = mediaPlayer2.getDuration();
                                if (duration < 0) {
                                    duration = 0;
                                }
                                interfaceC1809a133.setValue(Integer.valueOf(duration));
                                interfaceC1809a134.setValue(Boolean.TRUE);
                                interfaceC1809a135.setValue(Boolean.FALSE);
                                interfaceC1809a136.setValue(0);
                            }
                        });
                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener(c1808a0, interfaceC1809a135, interfaceC1809a136) { // from class: wb.gv

                            /* JADX INFO: renamed from: a */
                            public final /* synthetic */ InterfaceC1809a1 f17501a;

                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ InterfaceC1809a1 f17502b;

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            {
                                this.f17501a = interfaceC1809a135;
                                this.f17502b = interfaceC1809a136;
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // android.media.MediaPlayer.OnCompletionListener
                            public final void onCompletion(MediaPlayer mediaPlayer2) {
                                this.f17501a.setValue(Boolean.FALSE);
                                try {
                                    mediaPlayer2.seekTo(0);
                                } catch (Throwable unused) {
                                }
                                this.f17502b.setValue(0);
                            }
                        });
                        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: wb.hv
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // android.media.MediaPlayer.OnErrorListener
                            public final boolean onError(MediaPlayer mediaPlayer2, int i10, int i11) {
                                Boolean bool = Boolean.FALSE;
                                interfaceC1809a134.setValue(bool);
                                interfaceC1809a135.setValue(bool);
                                interfaceC1809a137.setValue("预览播放失败");
                                return true;
                            }
                        });
                        interfaceC1809a138.setValue(mediaPlayer);
                        mediaPlayer.prepareAsync();
                        c3959f = mediaPlayer;
                    } catch (Throwable th2) {
                        c3959f = new C3959f(th2);
                    }
                    if (C3960g.m8182b(c3959f) != null) {
                        Boolean bool = Boolean.FALSE;
                        interfaceC1809a134.setValue(bool);
                        interfaceC1809a135.setValue(bool);
                        interfaceC1809a137.setValue("预览播放失败");
                    }
                    break;
                }
                return new C4600g1(interfaceC1809a138, c1808a0);
        }
    }

    public /* synthetic */ C0880m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i9) {
        this.f2699g = i9;
        this.f2700h = obj;
        this.f2701i = obj2;
        this.f2702j = obj3;
        this.f2705m = obj4;
        this.f2706n = obj5;
        this.f2703k = obj6;
        this.f2704l = obj7;
    }

    public /* synthetic */ C0880m(C4957hq c4957hq, String str, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, List list, InterfaceC1220a interfaceC1220a, Context context) {
        this.f2699g = 5;
        this.f2701i = c4957hq;
        this.f2700h = str;
        this.f2702j = interfaceC1809a1;
        this.f2705m = interfaceC1809a12;
        this.f2706n = list;
        this.f2703k = interfaceC1220a;
        this.f2704l = context;
    }
}
