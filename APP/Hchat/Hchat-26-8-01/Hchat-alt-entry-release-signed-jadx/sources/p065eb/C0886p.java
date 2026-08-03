package p065eb;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.widget.Toast;
import gg.AbstractC1416l;
import gg.C1423s;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.function.Consumer;
import na.C2920h;
import na.C2921i;
import na.C2922j;
import okhttp3.HttpUrl;
import okio.C3193a;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.AbstractC0000a;
import p003a2.C0014a;
import p010aa.C0034b;
import p020b5.C0184c;
import p036c9.C0439g0;
import p036c9.C0443h0;
import p036c9.C0455k0;
import p051db.C0768f;
import p063e9.C0832c;
import p063e9.C0847r;
import p063e9.C0848s;
import p070f0.C0976h;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p099h.Hchat.hooks.items.script.ScriptPluginBridge;
import p117i0.C1808a0;
import p117i0.InterfaceC1809a1;
import p126ia.C2008b;
import p126ia.C2009c;
import p126ia.C2023q;
import p153k8.C2351o;
import p174m.C2571a;
import p196n8.C2910b;
import p198nb.AbstractC2935f0;
import p213ob.AbstractC3123p;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p222p.AbstractC3241o;
import p222p.C3247q;
import p227p4.C3315t;
import p230p8.C3360l;
import p251r.C3623h;
import p261rb.C3796l;
import p266s0.C3874d;
import p276sf.C3967n;
import p300ub.AbstractC4302b;
import p308v1.AbstractC4374a1;
import p308v1.AbstractC4377b1;
import p308v1.InterfaceC4409m0;
import p308v1.InterfaceC4418p0;
import p315v8.C4521a;
import p332wb.AbstractC4740b6;
import p332wb.AbstractC4855en;
import p332wb.AbstractC4955ho;
import p332wb.AbstractC5193p0;
import p332wb.AbstractC5230q4;
import p332wb.AbstractC5422vv;
import p332wb.C4880ff;
import p332wb.C4889fo;
import p332wb.C4957hq;
import p332wb.C5007jc;
import p332wb.C5026jv;
import p332wb.C5096m2;
import p332wb.C5131n4;
import p332wb.C5197p4;
import p332wb.C5292s0;
import p332wb.C5323sv;
import p332wb.C5326t1;
import p332wb.C5356tv;
import p332wb.C5384uq;
import p332wb.C5389uv;
import p332wb.C5462x5;
import p332wb.C5463x6;
import p332wb.C5467xa;
import p332wb.C5500yb;
import p332wb.C5532zb;
import p346x9.C5738e;
import p346x9.C5739f;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.C4173t;
import ua.C4291b;
import ua.C4292c;
import ua.C4293d;
import ua.C4295f;
import ua.C4296g;
import ua.C4297h;

/* JADX INFO: renamed from: eb.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0886p implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2741g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f2742h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f2743i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f2744j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f2745k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f2746l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f2747m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0886p(Context context, InterfaceC1809a1 interfaceC1809a1, String str, SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13) {
        this.f2741g = 16;
        this.f2743i = context;
        this.f2744j = interfaceC1809a1;
        this.f2742h = str;
        this.f2745k = sharedPreferences;
        this.f2746l = interfaceC1809a12;
        this.f2747m = interfaceC1809a13;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) throws JSONException {
        int i9;
        C0034b c0034bM291a;
        SharedPreferences.Editor editorPutString;
        SharedPreferences.Editor editorPutString2;
        SharedPreferences.Editor editorPutString3;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorEdit2;
        SharedPreferences.Editor editorEdit3;
        ArrayList arrayListM8398G1;
        List list;
        int i10 = this.f2741g;
        C4173t c4173t = C4173t.f13710g;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        int i11 = 0;
        int i12 = 1;
        C2571a c2571aM6342a = null;
        C3967n c3967n = C3967n.f12976a;
        Object obj2 = this.f2747m;
        Object obj3 = this.f2746l;
        Object obj4 = this.f2745k;
        Object obj5 = this.f2742h;
        Object obj6 = this.f2744j;
        Object obj7 = this.f2743i;
        switch (i10) {
            case 0:
                return ScriptPluginBridge.showModuleChoiceDialog$lambda$1((String) obj5, (String) obj7, (ArrayList) obj4, (String) obj6, (ScriptPluginBridge) obj3, (Consumer) obj2, (Activity) obj);
            case 1:
                C2023q c2023q = (C2023q) obj6;
                String str2 = (String) obj5;
                C5026jv c5026jv = (C5026jv) obj4;
                String str3 = (String) obj7;
                Activity activity = (Activity) obj3;
                C3360l c3360l = (C3360l) obj2;
                long jLongValue = ((Long) obj).longValue();
                C0184c c0184c = c2023q.f6841a;
                C2009c c2009cM815l = c0184c.m815l(str2);
                ArrayList arrayListM8409R1 = AbstractC4166m.m8409R1(c2009cM815l.f6779b);
                String str4 = c5026jv.f18249a;
                String str5 = c5026jv.f18250b;
                str4.getClass();
                str5.getClass();
                str3.getClass();
                String string = UUID.randomUUID().toString();
                string.getClass();
                arrayListM8409R1.add(new C2008b(string, AbstractC3149m.m6703R0(str4).toString(), AbstractC3149m.m6703R0(str5).toString(), AbstractC3149m.m6703R0(str3).toString(), jLongValue < 1 ? 1L : jLongValue));
                c0184c.m799Q(str2, arrayListM8409R1);
                c2023q.f6842b.m4947a(activity, c3360l, c2009cM815l);
                C2023q.m4975j(activity, "伪评论已添加");
                c2023q.m4980g(activity, c3360l);
                return c3967n;
            case 2:
                AbstractC4377b1[] abstractC4377b1Arr = (AbstractC4377b1[]) obj5;
                List list2 = (List) obj7;
                InterfaceC4418p0 interfaceC4418p0 = (InterfaceC4418p0) obj6;
                C1423s c1423s = (C1423s) obj4;
                C1423s c1423s2 = (C1423s) obj3;
                C3247q c3247q = (C3247q) obj2;
                AbstractC4374a1 abstractC4374a1 = (AbstractC4374a1) obj;
                int length = abstractC4377b1Arr.length;
                int i13 = 0;
                while (i11 < length) {
                    AbstractC4377b1 abstractC4377b1 = abstractC4377b1Arr[i11];
                    abstractC4377b1.getClass();
                    AbstractC3241o.m6928b(abstractC4374a1, abstractC4377b1, (InterfaceC4409m0) list2.get(i13), interfaceC4418p0.getLayoutDirection(), c1423s.f4736g, c1423s2.f4736g, c3247q.f10349a);
                    i11++;
                    i13++;
                }
                return c3967n;
            case 3:
                C3315t c3315t = (C3315t) obj7;
                String str6 = (String) obj5;
                C4291b c4291b = (C4291b) obj6;
                C4292c c4292c = (C4292c) obj4;
                C2351o c2351o = (C2351o) obj3;
                C4293d c4293d = (C4293d) obj2;
                C2910b c2910b = (C2910b) obj;
                List list3 = c4173t;
                if (c2910b != null) {
                    list3 = c4173t;
                    if (c2910b.f9401a == 0) {
                        Context context = (Context) c3315t.f10677h;
                        JSONObject jSONObject = c2910b.f9403c;
                        list3 = c4173t;
                        if (jSONObject != null) {
                            ArrayList arrayList = new ArrayList();
                            C4296g.m8624c(jSONObject, arrayList);
                            HashSet hashSet = new HashSet();
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj8 : arrayList) {
                                if (hashSet.add(((C4295f) obj8).f14280a)) {
                                    arrayList2.add(obj8);
                                }
                            }
                            boolean zIsEmpty = arrayList2.isEmpty();
                            list3 = arrayList2;
                            if (!zIsEmpty) {
                                C4296g.m8630j(context, arrayList2);
                                list3 = arrayList2;
                            }
                        }
                    }
                }
                c4291b.m8619k(c4292c, c2351o, c4293d, C4296g.m8625d(str6, list3));
                return c3967n;
            case 4:
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) obj5;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) obj7;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) obj6;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) obj4;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) obj3;
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) obj2;
                C3623h c3623h = (C3623h) obj;
                c3623h.getClass();
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19559D0, 3);
                C3623h.m7604a(c3623h, null, new C3874d(-726300321, new C5326t1(13, interfaceC1809a1, interfaceC1809a12), true), 3);
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19566E0, 3);
                C3623h.m7604a(c3623h, null, new C3874d(897919517, new C5326t1(14, interfaceC1809a13, interfaceC1809a14), true), 3);
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19573F0, 3);
                C3623h.m7604a(c3623h, null, new C3874d(-1772827941, new C5326t1(15, interfaceC1809a15, interfaceC1809a16), true), 3);
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19580G0, 3);
                C3623h.m7604a(c3623h, null, new C3874d(-148608103, new C5007jc(interfaceC1809a1, interfaceC1809a12, interfaceC1809a13, interfaceC1809a14, interfaceC1809a15, interfaceC1809a16, 1), true), 3);
                return c3967n;
            case 5:
                C4521a c4521a = (C4521a) obj5;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) obj7;
                C3623h c3623h2 = (C3623h) obj;
                c3623h2.getClass();
                C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19629N0, 3);
                C3623h.m7604a(c3623h2, null, new C3874d(1153374578, new C0768f(c4521a, 11, interfaceC1231l), true), 3);
                C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19636O0, 3);
                C3623h.m7604a(c3623h2, null, new C3874d(-1755275984, new C0455k0(c4521a, (InterfaceC1235p) obj6, (Context) obj4, (InterfaceC1231l) obj3, 12), true), 3);
                C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19643P0, 3);
                C3623h.m7604a(c3623h2, null, new C3874d(-368959250, new C0443h0(20, c4521a, (InterfaceC1231l) obj2, interfaceC1231l, false), true), 3);
                return c3967n;
            case 6:
                List list4 = (List) obj7;
                ArrayList arrayList3 = (ArrayList) obj4;
                InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) obj3;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) obj2;
                C3623h c3623h3 = (C3623h) obj;
                c3623h3.getClass();
                int i14 = 3;
                C3623h.m7604a(c3623h3, null, new C3874d(1403582678, new C0439g0(4, (InterfaceC1231l) obj6, (String) obj5), true), 3);
                C3623h.m7604a(c3623h3, null, new C3874d(-410498163, new C0976h(arrayList3, 8), true), 3);
                if (list4.isEmpty()) {
                    C3623h.m7604a(c3623h3, null, AbstractC5193p0.f19762f2, 3);
                } else if (arrayList3.isEmpty()) {
                    C3623h.m7604a(c3623h3, null, AbstractC5193p0.f19778h2, 3);
                } else {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        C3623h.m7604a(c3623h3, null, new C3874d(1211961861, new C0768f((C5739f) it.next(), 13, interfaceC1231l2), true), 3);
                    }
                    i14 = 3;
                }
                if (!list4.isEmpty()) {
                    C3623h.m7604a(c3623h3, null, new C3874d(-500295759, new C5463x6(interfaceC1220a, 25), true), i14);
                }
                return c3967n;
            case 7:
                List list5 = (List) obj5;
                InterfaceC1231l interfaceC1231l3 = (InterfaceC1231l) obj7;
                InterfaceC1231l interfaceC1231l4 = (InterfaceC1231l) obj6;
                InterfaceC1231l interfaceC1231l5 = (InterfaceC1231l) obj4;
                InterfaceC1231l interfaceC1231l6 = (InterfaceC1231l) obj3;
                InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) obj2;
                C3623h c3623h4 = (C3623h) obj;
                c3623h4.getClass();
                C3623h.m7604a(c3623h4, null, AbstractC5193p0.f19830n6, 3);
                if (list5.isEmpty()) {
                    C3623h.m7604a(c3623h4, null, AbstractC5193p0.f19846p6, 3);
                    i9 = 3;
                } else {
                    int i15 = 0;
                    for (Object obj9 : list5) {
                        int i16 = i15 + 1;
                        if (i15 < 0) {
                            AbstractC0000a.m32Q0();
                            throw null;
                        }
                        C3623h.m7604a(c3623h4, null, new C3874d(1104642109, new C5500yb(i15, 3), true), 3);
                        C3623h.m7604a(c3623h4, null, new C3874d(1897229094, new C5532zb((C2920h) obj9, interfaceC1231l3, i15, list5, interfaceC1231l4, interfaceC1231l5, interfaceC1231l6), true), 3);
                        i15 = i16;
                    }
                    i9 = 3;
                }
                C3623h.m7604a(c3623h4, null, AbstractC5193p0.f19854q6, i9);
                C3623h.m7604a(c3623h4, null, new C3874d(814656835, new C4880ff(interfaceC1220a2, 17), true), i9);
                return c3967n;
            case 8:
                Context context2 = (Context) obj7;
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) obj6;
                InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) obj4;
                InterfaceC1809a1 interfaceC1809a19 = (InterfaceC1809a1) obj3;
                InterfaceC1809a1 interfaceC1809a110 = (InterfaceC1809a1) obj2;
                C0034b c0034b = (C0034b) obj;
                c0034b.getClass();
                C5462x5 c5462x5 = (C5462x5) ((AbstractC4740b6) obj5);
                int iOrdinal = c5462x5.f21850a.ordinal();
                if (iOrdinal == 0) {
                    c0034bM291a = C0034b.m291a(c0034b, false, "默认私聊规则", false, false, null, false, false, null, null, 504);
                } else if (iOrdinal == 1) {
                    c0034bM291a = C0034b.m291a(c0034b, true, "默认群聊规则", false, false, null, false, false, null, null, 504);
                } else {
                    if (iOrdinal != 2) {
                        C3193a.m6822k();
                        return null;
                    }
                    c0034bM291a = C0034b.m291a(c0034b, false, "默认公众号规则", true, false, null, false, false, null, null, 504);
                }
                int iOrdinal2 = c5462x5.f21850a.ordinal();
                if (iOrdinal2 == 0) {
                    interfaceC1809a17.setValue(c0034bM291a);
                    SharedPreferences.Editor editorEdit4 = AbstractC4302b.m8640c(context2, "Hchat_message_block_config").edit();
                    if (editorEdit4 != null && (editorPutString = editorEdit4.putString("message_block_default_private", C0014a.m176f(c0034bM291a, false, false))) != null) {
                        editorPutString.commit();
                    }
                } else if (iOrdinal2 == 1) {
                    interfaceC1809a18.setValue(c0034bM291a);
                    SharedPreferences.Editor editorEdit5 = AbstractC4302b.m8640c(context2, "Hchat_message_block_config").edit();
                    if (editorEdit5 != null && (editorPutString2 = editorEdit5.putString("message_block_default_group", C0014a.m176f(c0034bM291a, true, false))) != null) {
                        editorPutString2.commit();
                    }
                } else {
                    if (iOrdinal2 != 2) {
                        C3193a.m6822k();
                        return null;
                    }
                    interfaceC1809a19.setValue(c0034bM291a);
                    SharedPreferences.Editor editorEdit6 = AbstractC4302b.m8640c(context2, "Hchat_message_block_config").edit();
                    if (editorEdit6 != null && (editorPutString3 = editorEdit6.putString("message_block_default_official", C0014a.m176f(c0034bM291a, false, true))) != null) {
                        editorPutString3.commit();
                    }
                }
                Toast.makeText(context2, "默认规则已保存", 0).show();
                interfaceC1809a110.setValue(null);
                return c3967n;
            case 9:
                AbstractC5230q4 abstractC5230q4 = (AbstractC5230q4) obj5;
                Context context3 = (Context) obj7;
                C5738e c5738e = (C5738e) obj6;
                InterfaceC1809a1 interfaceC1809a111 = (InterfaceC1809a1) obj4;
                InterfaceC1809a1 interfaceC1809a112 = (InterfaceC1809a1) obj3;
                InterfaceC1809a1 interfaceC1809a113 = (InterfaceC1809a1) obj2;
                List list6 = (List) obj;
                list6.getClass();
                ArrayList arrayList4 = new ArrayList(AbstractC4167n.m8429e1(list6));
                Iterator it2 = list6.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((C5292s0) it2.next()).f20550a);
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj10 : arrayList4) {
                    if (!AbstractC3149m.m6721t0((String) obj10)) {
                        arrayList5.add(obj10);
                    }
                }
                AbstractC4955ho.m9360J1(c5738e, interfaceC1809a111, interfaceC1809a112, ((C5131n4) abstractC5230q4).f19104b, AbstractC4166m.m8412U1(arrayList5));
                Toast.makeText(context3, "名单已保存", 0).show();
                interfaceC1809a113.setValue(C5197p4.f19927b);
                return c3967n;
            case 10:
                Context context4 = (Context) obj5;
                C0848s c0848s = (C0848s) obj7;
                InterfaceC1809a1 interfaceC1809a114 = (InterfaceC1809a1) obj6;
                InterfaceC1809a1 interfaceC1809a115 = (InterfaceC1809a1) obj4;
                InterfaceC1809a1 interfaceC1809a116 = (InterfaceC1809a1) obj3;
                InterfaceC1809a1 interfaceC1809a117 = (InterfaceC1809a1) obj2;
                C0832c c0832c = (C0832c) obj;
                c0832c.getClass();
                if (c0832c.f2514e) {
                    interfaceC1809a114.setValue(c0832c);
                    c0848s.getClass();
                    SharedPreferences sharedPreferences = c0848s.f2596a;
                    if (sharedPreferences != null && (editorEdit3 = sharedPreferences.edit()) != null) {
                        Set set = C0848s.f2595b;
                        SharedPreferences.Editor editorPutString4 = editorEdit3.putString("custom_notification_default_official", C0847r.m2143b(c0832c, false, true));
                        if (editorPutString4 != null) {
                            editorPutString4.commit();
                        }
                    }
                } else if (c0832c.f2513d) {
                    interfaceC1809a115.setValue(c0832c);
                    c0848s.getClass();
                    SharedPreferences sharedPreferences2 = c0848s.f2596a;
                    if (sharedPreferences2 != null && (editorEdit2 = sharedPreferences2.edit()) != null) {
                        Set set2 = C0848s.f2595b;
                        SharedPreferences.Editor editorPutString5 = editorEdit2.putString("custom_notification_default_group", C0847r.m2143b(c0832c, true, false));
                        if (editorPutString5 != null) {
                            editorPutString5.commit();
                        }
                    }
                } else {
                    interfaceC1809a116.setValue(c0832c);
                    c0848s.getClass();
                    SharedPreferences sharedPreferences3 = c0848s.f2596a;
                    if (sharedPreferences3 != null && (editorEdit = sharedPreferences3.edit()) != null) {
                        Set set3 = C0848s.f2595b;
                        SharedPreferences.Editor editorPutString6 = editorEdit.putString("custom_notification_default_private", C0847r.m2143b(c0832c, false, false));
                        if (editorPutString6 != null) {
                            editorPutString6.commit();
                        }
                    }
                }
                Toast.makeText(context4, "默认规则已保存", 0).show();
                interfaceC1809a117.setValue(C5096m2.f18832b);
                return c3967n;
            case 11:
                AbstractC5422vv abstractC5422vv = (AbstractC5422vv) obj5;
                C3796l c3796l = (C3796l) obj7;
                InterfaceC1809a1 interfaceC1809a118 = (InterfaceC1809a1) obj6;
                InterfaceC1809a1 interfaceC1809a119 = (InterfaceC1809a1) obj4;
                InterfaceC1809a1 interfaceC1809a120 = (InterfaceC1809a1) obj3;
                InterfaceC1809a1 interfaceC1809a121 = (InterfaceC1809a1) obj2;
                List<C5292s0> list7 = (List) obj;
                list7.getClass();
                ArrayList arrayList6 = new ArrayList(AbstractC4167n.m8429e1(list7));
                Iterator it3 = list7.iterator();
                while (it3.hasNext()) {
                    arrayList6.add(((C5292s0) it3.next()).f20550a);
                }
                ArrayList arrayList7 = new ArrayList();
                for (Object obj11 : arrayList6) {
                    if (!AbstractC3149m.m6721t0((String) obj11)) {
                        arrayList7.add(obj11);
                    }
                }
                Set setM8412U1 = AbstractC4166m.m8412U1(arrayList7);
                int iOrdinal3 = ((C5356tv) abstractC5422vv).f20975a.ordinal();
                if (iOrdinal3 == 0) {
                    interfaceC1809a118.setValue(setM8412U1);
                    c3796l.getClass();
                    c3796l.f12465a.edit().putString("zombie_check_target_ids", C3796l.m7987a(setM8412U1)).apply();
                } else if (iOrdinal3 == 1) {
                    interfaceC1809a119.setValue(setM8412U1);
                    c3796l.getClass();
                    c3796l.f12465a.edit().putString("zombie_check_excluded_ids", C3796l.m7987a(setM8412U1)).apply();
                } else {
                    if (iOrdinal3 != 2) {
                        C3193a.m6822k();
                        return null;
                    }
                    ArrayList arrayList8 = new ArrayList(AbstractC4167n.m8429e1(list7));
                    for (C5292s0 c5292s0 : list7) {
                        String str7 = c5292s0.f20550a;
                        String str8 = c5292s0.f20551b;
                        if (AbstractC3149m.m6721t0(str8)) {
                            str8 = c5292s0.f20550a;
                        }
                        arrayList8.add(new C5323sv(str7, str8));
                    }
                    interfaceC1809a120.setValue(arrayList8);
                }
                interfaceC1809a121.setValue(C5389uv.f21257a);
                return c3967n;
            case 12:
                InterfaceC1809a1 interfaceC1809a122 = (InterfaceC1809a1) obj7;
                InterfaceC1809a1 interfaceC1809a123 = (InterfaceC1809a1) obj6;
                SharedPreferences sharedPreferences4 = (SharedPreferences) obj4;
                InterfaceC1809a1 interfaceC1809a124 = (InterfaceC1809a1) obj3;
                InterfaceC1809a1 interfaceC1809a125 = (InterfaceC1809a1) obj2;
                C2922j c2922j = (C2922j) obj;
                c2922j.getClass();
                int size = ((List) interfaceC1809a122.getValue()).size();
                int i17 = ((C5384uq) obj5).f21198a;
                if (i17 < 0 || i17 >= size) {
                    arrayListM8398G1 = AbstractC4166m.m8398G1((List) interfaceC1809a122.getValue(), c2922j);
                } else {
                    arrayListM8398G1 = AbstractC4166m.m8409R1((List) interfaceC1809a122.getValue());
                    arrayListM8398G1.set(i17, c2922j);
                }
                String str9 = (String) interfaceC1809a123.getValue();
                if (arrayListM8398G1.isEmpty()) {
                    str9 = null;
                } else {
                    Iterator it4 = arrayListM8398G1.iterator();
                    while (it4.hasNext()) {
                        if (((C2922j) it4.next()).f9512a.equals(str9)) {
                        }
                    }
                    str9 = null;
                }
                if (str9 == null) {
                    C2922j c2922j2 = (C2922j) AbstractC4166m.m8424v1(arrayListM8398G1);
                    String str10 = c2922j2 != null ? c2922j2.f9512a : null;
                    if (str10 != null) {
                        str = str10;
                    }
                    str9 = str;
                }
                interfaceC1809a122.setValue(arrayListM8398G1);
                interfaceC1809a123.setValue(str9);
                AbstractC4955ho.m9481Y2(sharedPreferences4, interfaceC1809a122, interfaceC1809a124, interfaceC1809a123, arrayListM8398G1, null, str9, 32);
                interfaceC1809a125.setValue(null);
                return c3967n;
            case 13:
                InterfaceC1809a1 interfaceC1809a126 = (InterfaceC1809a1) obj7;
                SharedPreferences sharedPreferences5 = (SharedPreferences) obj6;
                InterfaceC1809a1 interfaceC1809a127 = (InterfaceC1809a1) obj4;
                InterfaceC1809a1 interfaceC1809a128 = (InterfaceC1809a1) obj3;
                InterfaceC1809a1 interfaceC1809a129 = (InterfaceC1809a1) obj2;
                C2921i c2921i = (C2921i) obj;
                c2921i.getClass();
                C2921i c2921iM9681u6 = AbstractC4955ho.m9681u6(c2921i);
                int size2 = ((List) interfaceC1809a126.getValue()).size();
                int i18 = ((C4957hq) obj5).f17731a;
                if (i18 < 0 || i18 >= size2) {
                    list = (List) interfaceC1809a126.getValue();
                } else {
                    ArrayList arrayListM8409R12 = AbstractC4166m.m8409R1((List) interfaceC1809a126.getValue());
                    arrayListM8409R12.remove(i18);
                    list = arrayListM8409R12;
                }
                List listM9673t7 = AbstractC4955ho.m9673t7(list, AbstractC0000a.m99x0(c2921iM9681u6));
                interfaceC1809a126.setValue(listM9673t7);
                AbstractC4955ho.m9481Y2(sharedPreferences5, interfaceC1809a127, interfaceC1809a126, interfaceC1809a128, null, listM9673t7, null, 80);
                interfaceC1809a129.setValue(null);
                return c3967n;
            case 14:
                String str11 = (String) obj5;
                Context context5 = (Context) obj7;
                InterfaceC1809a1 interfaceC1809a130 = (InterfaceC1809a1) obj6;
                InterfaceC1809a1 interfaceC1809a131 = (InterfaceC1809a1) obj4;
                InterfaceC1809a1 interfaceC1809a132 = (InterfaceC1809a1) obj3;
                InterfaceC1809a1 interfaceC1809a133 = (InterfaceC1809a1) obj2;
                ((C1808a0) obj).getClass();
                List list8 = AbstractC3123p.f10127a;
                str11.getClass();
                boolean zM6740d0 = AbstractC3156t.m6740d0(str11, "tts:", false);
                interfaceC1809a130.setValue(Boolean.valueOf(zM6740d0));
                interfaceC1809a131.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                interfaceC1809a132.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                interfaceC1809a133.setValue(c4173t);
                if (zM6740d0) {
                    Handler handler = AbstractC2935f0.f9623a;
                    c2571aM6342a = AbstractC2935f0.m6342a(context5, AbstractC3123p.m6633c(str11), new C5467xa(interfaceC1809a133, interfaceC1809a131, interfaceC1809a132, interfaceC1809a130, 1));
                }
                return new C4889fo(c2571aM6342a, i12);
            case 15:
                InterfaceC1809a1 interfaceC1809a134 = (InterfaceC1809a1) obj7;
                InterfaceC1809a1 interfaceC1809a135 = (InterfaceC1809a1) obj6;
                InterfaceC1809a1 interfaceC1809a136 = (InterfaceC1809a1) obj4;
                InterfaceC1809a1 interfaceC1809a137 = (InterfaceC1809a1) obj3;
                ((C1808a0) obj).getClass();
                interfaceC1809a134.setValue(Boolean.TRUE);
                interfaceC1809a135.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                interfaceC1809a136.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                interfaceC1809a137.setValue(c4173t);
                Handler handler2 = AbstractC2935f0.f9623a;
                return new C4889fo(AbstractC2935f0.m6342a((Context) obj5, (String) ((InterfaceC1809a1) obj2).getValue(), new C5467xa(interfaceC1809a137, interfaceC1809a135, interfaceC1809a136, interfaceC1809a134, 0)), i11);
            default:
                Context context6 = (Context) obj7;
                InterfaceC1809a1 interfaceC1809a138 = (InterfaceC1809a1) obj6;
                String str12 = (String) obj5;
                SharedPreferences sharedPreferences6 = (SharedPreferences) obj4;
                InterfaceC1809a1 interfaceC1809a139 = (InterfaceC1809a1) obj3;
                InterfaceC1809a1 interfaceC1809a140 = (InterfaceC1809a1) obj2;
                String str13 = (String) obj;
                str13.getClass();
                Set setM9715y6 = AbstractC4955ho.m9715y6(str13);
                List list9 = (List) interfaceC1809a138.getValue();
                ArrayList arrayList9 = new ArrayList();
                for (Object obj12 : list9) {
                    C4297h c4297h = (C4297h) obj12;
                    if (!AbstractC1416l.m3825a(c4297h.f14292e, str12) || setM9715y6.contains(c4297h.f14289b)) {
                        arrayList9.add(obj12);
                    }
                }
                Set<String> set4 = setM9715y6;
                ArrayList arrayList10 = new ArrayList(AbstractC4167n.m8429e1(set4));
                for (String str14 : set4) {
                    arrayList10.add(new C4297h(str14, str14, AbstractC4955ho.m9592k7(str14), str12, true));
                }
                interfaceC1809a138.setValue(AbstractC4955ho.m9682u7(arrayList9, arrayList10));
                AbstractC4955ho.m9358J(sharedPreferences6, interfaceC1809a139, interfaceC1809a138, interfaceC1809a140, null, (List) interfaceC1809a138.getValue(), null, 80);
                AbstractC4855en.m9271o("模板已套用到 ", setM9715y6.size(), " 个聊天", context6, 0);
                return c3967n;
        }
    }

    public /* synthetic */ C0886p(C2023q c2023q, String str, C5026jv c5026jv, String str2, Activity activity, C3360l c3360l) {
        this.f2741g = 1;
        this.f2744j = c2023q;
        this.f2742h = str;
        this.f2745k = c5026jv;
        this.f2743i = str2;
        this.f2746l = activity;
        this.f2747m = c3360l;
    }

    public /* synthetic */ C0886p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i9) {
        this.f2741g = i9;
        this.f2742h = obj;
        this.f2743i = obj2;
        this.f2744j = obj3;
        this.f2745k = obj4;
        this.f2746l = obj5;
        this.f2747m = obj6;
    }

    public /* synthetic */ C0886p(String str, String str2, ArrayList arrayList, String str3, ScriptPluginBridge scriptPluginBridge, Consumer consumer) {
        this.f2741g = 0;
        this.f2742h = str;
        this.f2743i = str2;
        this.f2745k = arrayList;
        this.f2744j = str3;
        this.f2746l = scriptPluginBridge;
        this.f2747m = consumer;
    }

    public /* synthetic */ C0886p(String str, C2351o c2351o, C3315t c3315t, C4291b c4291b, C4292c c4292c, C4293d c4293d) {
        this.f2741g = 3;
        this.f2743i = c3315t;
        this.f2742h = str;
        this.f2744j = c4291b;
        this.f2745k = c4292c;
        this.f2746l = c2351o;
        this.f2747m = c4293d;
    }

    public /* synthetic */ C0886p(List list, ArrayList arrayList, String str, InterfaceC1231l interfaceC1231l, InterfaceC1231l interfaceC1231l2, InterfaceC1220a interfaceC1220a) {
        this.f2741g = 6;
        this.f2743i = list;
        this.f2745k = arrayList;
        this.f2742h = str;
        this.f2744j = interfaceC1231l;
        this.f2746l = interfaceC1231l2;
        this.f2747m = interfaceC1220a;
    }
}
