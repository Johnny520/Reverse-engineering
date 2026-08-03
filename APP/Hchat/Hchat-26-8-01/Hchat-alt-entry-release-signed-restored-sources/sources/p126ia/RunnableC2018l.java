package p126ia;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import be.AbstractC0283h;
import ca.RunnableC0537x;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000a.AbstractC0000a;
import p024b9.RunnableC0217c;
import p036c9.C0490u;
import p036c9.C0505z;
import p065eb.C0859c0;
import p085fg.InterfaceC1235p;
import p096g8.C1368i;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.ContactLabelBean;
import p099h.Hchat.hooks.api.model.WeChatContact;
import p099h.Hchat.hooks.items.script.ScriptPluginRuntime;
import p106h8.C1624a;
import p117i0.InterfaceC1809a1;
import p167l8.C2527b;
import p218og.AbstractC3149m;
import p222p.AbstractC3199a;
import p261rb.RunnableC3791g;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;
import p332wb.AbstractC4855en;
import p332wb.AbstractC4955ho;
import p332wb.C5051kn;
import p332wb.C5108me;
import p332wb.C5292s0;
import p332wb.EnumC5358u0;
import p332wb.InterfaceC5059kv;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.AbstractC4171r;
import tf.AbstractC4178y;
import tf.C4173t;

/* JADX INFO: renamed from: ia.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2018l implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f6812g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f6813h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f6814i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean f6815j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f6816k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f6817l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC2018l(Activity activity, boolean z9, InterfaceC5059kv interfaceC5059kv, Set set, C5108me c5108me) {
        this.f6812g = 5;
        this.f6814i = activity;
        this.f6815j = z9;
        this.f6816k = interfaceC5059kv;
        this.f6813h = set;
        this.f6817l = c5108me;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        Object c3959f;
        Object c3959f2;
        Object c3959f3;
        Object c3959f4;
        switch (this.f6812g) {
            case 0:
                C2023q c2023q = (C2023q) this.f6813h;
                Activity activity = (Activity) this.f6814i;
                boolean z9 = this.f6815j;
                InterfaceC5059kv interfaceC5059kv = (InterfaceC5059kv) this.f6816k;
                C2016j c2016j = (C2016j) this.f6817l;
                try {
                    c3959f = AbstractC0283h.m1130J(z9);
                    break;
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                Throwable thM8182b = C3960g.m8182b(c3959f);
                if (thM8182b != null) {
                    c2023q.f6843c.invoke("加载朋友圈伪互动好友失败", thM8182b);
                }
                if (c3959f instanceof C3959f) {
                    c3959f = C4173t.f13710g;
                }
                activity.runOnUiThread(new RunnableC0537x(interfaceC5059kv, activity, (List) c3959f, c2023q, c2016j, 8));
                return;
            case 1:
                C2023q c2023q2 = (C2023q) this.f6813h;
                Activity activity2 = (Activity) this.f6814i;
                boolean z10 = this.f6815j;
                InterfaceC5059kv interfaceC5059kv2 = (InterfaceC5059kv) this.f6816k;
                C0490u c0490u = (C0490u) this.f6817l;
                try {
                    c3959f2 = AbstractC0283h.m1130J(z10);
                    break;
                } catch (Throwable th3) {
                    c3959f2 = new C3959f(th3);
                }
                Throwable thM8182b2 = C3960g.m8182b(c3959f2);
                if (thM8182b2 != null) {
                    c2023q2.f6843c.invoke("加载朋友圈伪集赞候选人失败", thM8182b2);
                }
                if (c3959f2 instanceof C3959f) {
                    c3959f2 = C4173t.f13710g;
                }
                activity2.runOnUiThread(new RunnableC0217c(interfaceC5059kv2, activity2, c0490u, (List) c3959f2, 6));
                return;
            case 2:
                String str = (String) this.f6813h;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f6814i;
                Context context = (Context) this.f6816k;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f6817l;
                interfaceC1809a1.setValue(Boolean.FALSE);
                AbstractC4955ho.m9557h(context, interfaceC1809a12, this.f6815j ? AbstractC4855en.m9263g("已发送到 ", str) : "发送失败，请稍后重试");
                return;
            case 3:
                Context context2 = (Context) this.f6813h;
                C0859c0 c0859c0 = (C0859c0) this.f6814i;
                new Handler(Looper.getMainLooper()).post(new RunnableC0537x(ScriptPluginRuntime.INSTANCE.m10926setPluginEnabled0E7RQCE(context2, c0859c0.f2626a, this.f6815j), (Map) this.f6816k, context2, c0859c0, (InterfaceC1809a1) this.f6817l));
                return;
            case 4:
                Context context3 = (Context) this.f6814i;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f6816k;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f6817l;
                Object obj = this.f6813h;
                if (!(obj instanceof C3959f)) {
                    AbstractC3199a.m6848u((Number) interfaceC1809a14.getValue(), 1, interfaceC1809a14);
                    return;
                }
                interfaceC1809a13.setValue(Boolean.valueOf(this.f6815j));
                Throwable thM8182b3 = C3960g.m8182b(obj);
                Toast.makeText(context3, "切换失败: " + (thM8182b3 != null ? thM8182b3.getMessage() : null), 0).show();
                return;
            case 5:
                Activity activity3 = (Activity) this.f6814i;
                boolean z11 = this.f6815j;
                InterfaceC5059kv interfaceC5059kv3 = (InterfaceC5059kv) this.f6816k;
                Set set = (Set) this.f6813h;
                C5108me c5108me = (C5108me) this.f6817l;
                try {
                    c3959f3 = AbstractC0283h.m1130J(z11);
                    break;
                } catch (Throwable th4) {
                    c3959f3 = new C3959f(th4);
                }
                if (c3959f3 instanceof C3959f) {
                    c3959f3 = C4173t.f13710g;
                }
                activity3.runOnUiThread(new RunnableC0537x(interfaceC5059kv3, activity3, (List) c3959f3, set, c5108me, 16));
                return;
            default:
                EnumC5358u0 enumC5358u0 = (EnumC5358u0) this.f6813h;
                C1368i c1368i = (C1368i) this.f6814i;
                Handler handler = (Handler) this.f6816k;
                InterfaceC1235p interfaceC1235p = (InterfaceC1235p) this.f6817l;
                try {
                    ArrayList arrayList = new ArrayList();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    boolean z12 = this.f6815j;
                    List list = C4173t.f13710g;
                    if (z12) {
                        try {
                            c3959f4 = c1368i.m3727p();
                        } catch (Throwable th5) {
                            c3959f4 = new C3959f(th5);
                        }
                        if (c3959f4 instanceof C3959f) {
                            c3959f4 = list;
                        }
                        for (ContactLabelBean contactLabelBean : (Iterable) c3959f4) {
                            String str2 = contactLabelBean.labelName;
                            if (AbstractC3149m.m6721t0(str2)) {
                                str2 = contactLabelBean.labelId;
                            }
                            if (!AbstractC3149m.m6721t0(str2)) {
                                for (String str3 : contactLabelBean.userNameList) {
                                    if (!AbstractC3149m.m6721t0(str3)) {
                                        Object arrayList2 = linkedHashMap.get(str3);
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList();
                                            linkedHashMap.put(str3, arrayList2);
                                        }
                                        ((List) arrayList2).add(str2);
                                    }
                                }
                            }
                        }
                        break;
                    }
                    EnumC5358u0 enumC5358u02 = EnumC5358u0.f20978g;
                    EnumC5358u0 enumC5358u03 = EnumC5358u0.f20980i;
                    int i9 = 0;
                    EnumC5358u0 enumC5358u04 = EnumC5358u0.f20981j;
                    if (enumC5358u0 == enumC5358u02 || enumC5358u0 == enumC5358u03 || enumC5358u0 == enumC5358u04) {
                        ArrayList<WeChatContact> arrayListM3736y = c1368i.m3736y();
                        ArrayList arrayList3 = new ArrayList();
                        for (WeChatContact weChatContact : arrayListM3736y) {
                            List list2 = (List) linkedHashMap.get(weChatContact.wxId);
                            if (list2 == null) {
                                list2 = list;
                            }
                            C5292s0 c5292s0M9583j7 = AbstractC4955ho.m9583j7(weChatContact, false, list2, 4);
                            if (c5292s0M9583j7 != null) {
                                arrayList3.add(c5292s0M9583j7);
                            }
                        }
                        AbstractC4171r.m8432h1(arrayList, arrayList3);
                    }
                    if (enumC5358u0 == EnumC5358u0.f20979h || enumC5358u0 == enumC5358u03 || enumC5358u0 == enumC5358u04) {
                        ArrayList arrayListM3735x = c1368i.m3735x();
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it = arrayListM3735x.iterator();
                        while (it.hasNext()) {
                            C5292s0 c5292s0M9583j72 = AbstractC4955ho.m9583j7((WeChatContact) it.next(), true, null, 6);
                            if (c5292s0M9583j72 != null) {
                                arrayList4.add(c5292s0M9583j72);
                            }
                        }
                        AbstractC4171r.m8432h1(arrayList, arrayList4);
                    }
                    if (enumC5358u0 == enumC5358u04) {
                        ArrayList arrayListM3713U = c1368i.m3713U("SELECT r.username, r.alias, r.conRemark, r.nickname, r.encryptUsername, r.type, r.lvbuff AS lvbuff, i.reserved1 AS avatarUrl, i.reserved2 AS avatarBackupUrl FROM rcontact r LEFT JOIN img_flag i ON r.username = i.username WHERE r.username LIKE 'gh\\_%' ESCAPE '\\' OR (r.verifyFlag IS NOT NULL AND r.verifyFlag!=0)", null);
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it2 = arrayListM3713U.iterator();
                        while (it2.hasNext()) {
                            C5292s0 c5292s0M9583j73 = AbstractC4955ho.m9583j7((WeChatContact) it2.next(), false, null, 2);
                            if (c5292s0M9583j73 != null) {
                                arrayList5.add(c5292s0M9583j73);
                            }
                        }
                        AbstractC4171r.m8432h1(arrayList, arrayList5);
                    }
                    C1624a c1624aConversations = WeChatApis.conversations();
                    ArrayList arrayListM4144c = c1624aConversations != null ? c1624aConversations.m4144c() : null;
                    if (arrayListM4144c != null) {
                        list = arrayListM4144c;
                    }
                    ArrayList arrayList6 = new ArrayList(AbstractC4167n.m8429e1(list));
                    for (Object obj2 : list) {
                        int i10 = i9 + 1;
                        if (i9 < 0) {
                            AbstractC0000a.m32Q0();
                            throw null;
                        }
                        arrayList6.add(new C3958e(((C2527b) obj2).f8167a, Integer.valueOf(i9)));
                        i9 = i10;
                    }
                    Map mapM8442e0 = AbstractC4178y.m8442e0(arrayList6);
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj3 : arrayList) {
                        if (hashSet.add(((C5292s0) obj3).f20550a)) {
                            arrayList7.add(obj3);
                        }
                    }
                    handler.post(new RunnableC3791g(interfaceC1235p, 6, AbstractC4166m.m8402K1(arrayList7, new C5051kn(new C5051kn(new C5051kn(new C0505z(mapM8442e0, 4), 5), 6), 7))));
                    return;
                } catch (Throwable th6) {
                    handler.post(new RunnableC3791g(interfaceC1235p, 7, th6));
                    return;
                }
        }
    }

    public /* synthetic */ RunnableC2018l(Object obj, Object obj2, boolean z9, Object obj3, Object obj4, int i9) {
        this.f6812g = i9;
        this.f6813h = obj;
        this.f6814i = obj2;
        this.f6815j = z9;
        this.f6816k = obj3;
        this.f6817l = obj4;
    }

    public /* synthetic */ RunnableC2018l(Object obj, boolean z9, Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12) {
        this.f6812g = 4;
        this.f6813h = obj;
        this.f6815j = z9;
        this.f6814i = context;
        this.f6816k = interfaceC1809a1;
        this.f6817l = interfaceC1809a12;
    }

    public /* synthetic */ RunnableC2018l(boolean z9, Object obj, Object obj2, Object obj3, Object obj4, int i9) {
        this.f6812g = i9;
        this.f6815j = z9;
        this.f6813h = obj;
        this.f6814i = obj2;
        this.f6816k = obj3;
        this.f6817l = obj4;
    }
}
