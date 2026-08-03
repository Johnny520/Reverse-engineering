package p109hb;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p000a.AbstractC0000a;
import p036c9.C0415a0;
import p036c9.C0505z;
import p096g8.C1368i;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.ContactLabelBean;
import p099h.Hchat.hooks.api.model.WeChatContact;
import p106h8.C1624a;
import p167l8.C2527b;
import p218og.AbstractC3149m;
import p259r9.AbstractC3754e0;
import p276sf.C3958e;
import p276sf.C3959f;
import p332wb.AbstractC4855en;
import p332wb.C5026jv;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.AbstractC4171r;
import tf.AbstractC4178y;
import tf.C4173t;

/* JADX INFO: renamed from: hb.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1690m {

    /* JADX INFO: renamed from: a */
    public static volatile C1689l f5615a;

    /* JADX INFO: renamed from: b */
    public static volatile C1689l f5616b;

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f5617c = new AtomicBoolean(false);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static List m4307a(boolean z9) {
        C1689l c1689l = f5615a;
        if (c1689l == null || !c1689l.m4306a()) {
            c1689l = null;
        }
        if (z9) {
            if (c1689l != null) {
                List list = c1689l.f5613a;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    C5026jv c5026jv = (C5026jv) obj;
                    if ((c5026jv.f18251c || c5026jv.f18255g) ? false : true) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
            C1689l c1689l2 = f5616b;
            if (c1689l2 != null) {
                if (!c1689l2.m4306a()) {
                    c1689l2 = null;
                }
                if (c1689l2 != null) {
                    return c1689l2.f5613a;
                }
            }
        } else if (c1689l != null) {
            return c1689l.f5613a;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static C0415a0 m4308b() {
        C1624a c1624aConversations = WeChatApis.conversations();
        Iterable iterableM4144c = c1624aConversations != null ? c1624aConversations.m4144c() : null;
        if (iterableM4144c == null) {
            iterableM4144c = C4173t.f13710g;
        }
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(iterableM4144c));
        int i9 = 0;
        for (Object obj : iterableM4144c) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                AbstractC0000a.m32Q0();
                throw null;
            }
            arrayList.add(new C3958e(((C2527b) obj).f8167a, Integer.valueOf(i9)));
            i9 = i10;
        }
        return new C0415a0(new C0415a0(new C0415a0(new C0505z(AbstractC4178y.m8442e0(arrayList), 1), 16), 17), 18);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static List m4309c(boolean z9) {
        Object c3959f;
        List listM4307a = m4307a(z9);
        if (listM4307a != null) {
            return listM4307a;
        }
        List listM8402K1 = C4173t.f13710g;
        C1368i c1368iM9259c = AbstractC4855en.m9259c();
        if (c1368iM9259c != null && c1368iM9259c.m3704G()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                c3959f = c1368iM9259c.m3727p();
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            if (c3959f instanceof C3959f) {
                c3959f = listM8402K1;
            }
            for (ContactLabelBean contactLabelBean : (Iterable) c3959f) {
                String str = contactLabelBean.labelName;
                if (AbstractC3149m.m6721t0(str)) {
                    str = contactLabelBean.labelId;
                }
                if (!AbstractC3149m.m6721t0(str)) {
                    for (String str2 : contactLabelBean.userNameList) {
                        if (!AbstractC3149m.m6721t0(str2)) {
                            Object arrayList = linkedHashMap.get(str2);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(str2, arrayList);
                            }
                            ((List) arrayList).add(str);
                        }
                    }
                }
            }
            if (z9) {
                ArrayList<WeChatContact> arrayListM3736y = c1368iM9259c.m3736y();
                ArrayList arrayList2 = new ArrayList();
                for (WeChatContact weChatContact : arrayListM3736y) {
                    List list = (List) linkedHashMap.get(weChatContact.wxId);
                    if (list == null) {
                        list = listM8402K1;
                    }
                    C5026jv c5026jvM4310d = m4310d(weChatContact, false, list, false);
                    if (c5026jvM4310d != null) {
                        arrayList2.add(c5026jvM4310d);
                    }
                }
                listM8402K1 = AbstractC4166m.m8402K1(arrayList2, m4308b());
            } else {
                ArrayList arrayList3 = new ArrayList();
                ArrayList<WeChatContact> arrayListM3736y2 = c1368iM9259c.m3736y();
                ArrayList arrayList4 = new ArrayList();
                for (WeChatContact weChatContact2 : arrayListM3736y2) {
                    List list2 = (List) linkedHashMap.get(weChatContact2.wxId);
                    if (list2 == null) {
                        list2 = listM8402K1;
                    }
                    C5026jv c5026jvM4310d2 = m4310d(weChatContact2, false, list2, false);
                    if (c5026jvM4310d2 != null) {
                        arrayList4.add(c5026jvM4310d2);
                    }
                }
                AbstractC4171r.m8432h1(arrayList3, arrayList4);
                ArrayList arrayListM3713U = c1368iM9259c.m3713U("SELECT r.username, r.alias, r.conRemark, r.nickname, r.encryptUsername, r.type, r.lvbuff AS lvbuff, i.reserved1 AS avatarUrl, i.reserved2 AS avatarBackupUrl FROM rcontact r LEFT JOIN img_flag i ON r.username = i.username WHERE r.username LIKE 'gh\\_%' ESCAPE '\\' OR (r.verifyFlag IS NOT NULL AND r.verifyFlag!=0)", null);
                ArrayList arrayList5 = new ArrayList();
                Iterator it = arrayListM3713U.iterator();
                while (it.hasNext()) {
                    C5026jv c5026jvM4310d3 = m4310d((WeChatContact) it.next(), false, listM8402K1, true);
                    if (c5026jvM4310d3 != null) {
                        arrayList5.add(c5026jvM4310d3);
                    }
                }
                AbstractC4171r.m8432h1(arrayList3, arrayList5);
                ArrayList arrayListM3735x = c1368iM9259c.m3735x();
                ArrayList arrayList6 = new ArrayList();
                Iterator it2 = arrayListM3735x.iterator();
                while (it2.hasNext()) {
                    C5026jv c5026jvM4310d4 = m4310d((WeChatContact) it2.next(), true, listM8402K1, false);
                    if (c5026jvM4310d4 != null) {
                        arrayList6.add(c5026jvM4310d4);
                    }
                }
                AbstractC4171r.m8432h1(arrayList3, arrayList6);
                HashSet hashSet = new HashSet();
                ArrayList arrayList7 = new ArrayList();
                for (Object obj : arrayList3) {
                    if (hashSet.add(((C5026jv) obj).f18249a)) {
                        arrayList7.add(obj);
                    }
                }
                listM8402K1 = AbstractC4166m.m8402K1(arrayList7, m4308b());
            }
        }
        C1689l c1689l = new C1689l(listM8402K1, System.currentTimeMillis());
        if (z9) {
            f5616b = c1689l;
        } else {
            f5615a = c1689l;
            ArrayList arrayList8 = new ArrayList();
            for (Object obj2 : listM8402K1) {
                C5026jv c5026jv = (C5026jv) obj2;
                if (!c5026jv.f18251c && !c5026jv.f18255g) {
                    arrayList8.add(obj2);
                }
            }
            f5616b = new C1689l(arrayList8, c1689l.f5614b);
        }
        return listM8402K1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static C5026jv m4310d(WeChatContact weChatContact, boolean z9, List list, boolean z10) {
        if (weChatContact == null || AbstractC3149m.m6721t0(weChatContact.wxId)) {
            return null;
        }
        String str = weChatContact.wxId;
        String strM7883Z = AbstractC3754e0.m7883Z(weChatContact, z9);
        String str2 = weChatContact.avatarUrl;
        String str3 = weChatContact.avatarBackupUrl;
        List listM8407P1 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(list));
        List listM101y0 = AbstractC0000a.m101y0(weChatContact.remarkName, weChatContact.nickname, weChatContact.customWxId);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM101y0) {
            if (!AbstractC3149m.m6721t0((String) obj)) {
                arrayList.add(obj);
            }
        }
        return new C5026jv(str, strM7883Z, z9, str2, str3, listM8407P1, z10, AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList)));
    }
}
