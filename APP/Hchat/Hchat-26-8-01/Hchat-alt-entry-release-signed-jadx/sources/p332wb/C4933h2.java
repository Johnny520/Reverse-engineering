package p332wb;

import android.content.Context;
import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import okhttp3.HttpUrl;
import okio.C3193a;
import p000a.AbstractC0000a;
import p015b0.C0144j;
import p015b0.C0145k;
import p015b0.C0160z;
import p025bc.AbstractC0255e;
import p036c9.AbstractC0473o2;
import p036c9.C0414a;
import p036c9.C0429d2;
import p036c9.C0455k0;
import p036c9.C0506z0;
import p070f0.C0970b;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p096g8.C1368i;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.ContactLabelBean;
import p099h.Hchat.hooks.api.model.WeChatContact;
import p100h0.C1528j0;
import p106h8.C1624a;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.C1876r1;
import p117i0.InterfaceC1809a1;
import p126ia.C2022p;
import p136j8.AbstractC2091b;
import p136j8.C2104o;
import p167l8.C2527b;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p219oh.AbstractC3165h;
import p251r.AbstractC3617b0;
import p251r.C3641z;
import p259r9.AbstractC3754e0;
import p266s0.AbstractC3879i;
import p266s0.C3873c;
import p276sf.C3959f;
import p276sf.C3967n;
import p276sf.InterfaceC3955b;
import p300ub.AbstractC4302b;
import p304uf.C4333g;
import p317vb.InterfaceC4544a;
import p322w0.C4661l;
import sh.AbstractC4045s;
import sh.C4027m;
import sh.C4060x;
import tf.AbstractC4156d0;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.AbstractC4171r;
import tf.AbstractC4178y;
import tf.C4173t;
import tf.C4175v;

/* JADX INFO: renamed from: wb.h2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4933h2 {

    /* JADX INFO: renamed from: a */
    public static final C4933h2 f17518a = new C4933h2();

    /* JADX INFO: renamed from: b */
    public static final Set f17519b = AbstractC4156d0.m8355W("message_fold", "conversationboxservice", "officialaccounts", "appbrand_notify_message", "notifymessage", "qmessage", "floatbottle");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:271:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x043b  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C4867f2 m9278f(String str, List list) {
        Iterable iterableM3736y;
        Object c3959f;
        Iterable iterableM3713U;
        Object c3959f2;
        Object c3959f3;
        Object objM3727p;
        boolean z9;
        Object c3959f4;
        Object objM3725n;
        boolean z10;
        boolean z11;
        Object c3959f5;
        Object objM3725n2;
        C1624a c1624aConversations = WeChatApis.conversations();
        if (c1624aConversations == null) {
            C2104o.m5276A("会话列表不可用");
            return null;
        }
        C1368i c1368iM9259c = AbstractC4855en.m9259c();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC4171r.m8432h1(arrayList, ((C0414a) it.next()).f1183e);
        }
        Set setM8412U1 = AbstractC4166m.m8412U1(arrayList);
        C4173t c4173t = C4173t.f13710g;
        if (c1368iM9259c != null) {
            try {
                iterableM3736y = c1368iM9259c.m3736y();
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
        } else {
            iterableM3736y = null;
        }
        if (iterableM3736y == null) {
            iterableM3736y = c4173t;
        }
        ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(iterableM3736y));
        Iterator it2 = iterableM3736y.iterator();
        while (it2.hasNext()) {
            arrayList2.add(AbstractC3149m.m6703R0(((WeChatContact) it2.next()).wxId).toString());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (!AbstractC3149m.m6721t0((String) obj)) {
                arrayList3.add(obj);
            }
        }
        c3959f = AbstractC4166m.m8412U1(arrayList3);
        boolean z12 = c3959f instanceof C3959f;
        Object obj2 = C4175v.f13712g;
        if (z12) {
            c3959f = obj2;
        }
        Set set = (Set) c3959f;
        if (c1368iM9259c != null) {
            try {
                iterableM3713U = c1368iM9259c.m3713U("SELECT r.username, r.alias, r.conRemark, r.nickname, r.encryptUsername, r.type, r.lvbuff AS lvbuff, i.reserved1 AS avatarUrl, i.reserved2 AS avatarBackupUrl FROM rcontact r LEFT JOIN img_flag i ON r.username = i.username WHERE r.username LIKE 'gh\\_%' ESCAPE '\\' OR (r.verifyFlag IS NOT NULL AND r.verifyFlag!=0)", null);
            } catch (Throwable th3) {
                c3959f2 = new C3959f(th3);
            }
        } else {
            iterableM3713U = null;
        }
        if (iterableM3713U == null) {
            iterableM3713U = c4173t;
        }
        ArrayList arrayList4 = new ArrayList(AbstractC4167n.m8429e1(iterableM3713U));
        Iterator it3 = iterableM3713U.iterator();
        while (it3.hasNext()) {
            arrayList4.add(AbstractC3149m.m6703R0(((WeChatContact) it3.next()).wxId).toString());
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : arrayList4) {
            if (!AbstractC3149m.m6721t0((String) obj3)) {
                arrayList5.add(obj3);
            }
        }
        c3959f2 = AbstractC4166m.m8412U1(arrayList5);
        if (!(c3959f2 instanceof C3959f)) {
            obj2 = c3959f2;
        }
        Set set2 = (Set) obj2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (c1368iM9259c != null) {
            try {
                objM3727p = c1368iM9259c.m3727p();
            } catch (Throwable th4) {
                c3959f3 = new C3959f(th4);
            }
        } else {
            objM3727p = null;
        }
        c3959f3 = objM3727p == null ? c4173t : objM3727p;
        if (c3959f3 instanceof C3959f) {
            c3959f3 = c4173t;
        }
        for (ContactLabelBean contactLabelBean : (Iterable) c3959f3) {
            String str2 = contactLabelBean.labelName;
            if (AbstractC3149m.m6721t0(str2)) {
                str2 = contactLabelBean.labelId;
            }
            if (!AbstractC3149m.m6721t0(str2)) {
                for (String str3 : contactLabelBean.userNameList) {
                    if (!AbstractC3149m.m6721t0(str3)) {
                        Object arrayList6 = linkedHashMap.get(str3);
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                            linkedHashMap.put(str3, arrayList6);
                        }
                        ((List) arrayList6).add(str2);
                    }
                }
            }
        }
        ArrayList<C4900g2> arrayListM9279g = m9279g(list);
        int iM8438a0 = AbstractC4178y.m8438a0(AbstractC4167n.m8429e1(arrayListM9279g));
        if (iM8438a0 < 16) {
            iM8438a0 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM8438a0);
        for (C4900g2 c4900g2 : arrayListM9279g) {
            linkedHashMap2.put(c4900g2.f17324a.f1179a, c4900g2.f17326c);
        }
        C4333g c4333g = new C4333g();
        ArrayList<C0414a> arrayList7 = new ArrayList();
        for (Object obj4 : list) {
            if (!AbstractC1416l.m3825a(((C0414a) obj4).f1179a, str)) {
                arrayList7.add(obj4);
            }
        }
        for (C0414a c0414a : arrayList7) {
            for (String str4 : c0414a.f1183e) {
                String str5 = (String) linkedHashMap2.get(c0414a.f1179a);
                if (str5 != null) {
                    if (AbstractC3149m.m6721t0(str5)) {
                        str5 = null;
                    }
                    if (str5 != null) {
                        c4333g.put(str4, "已在：".concat(str5));
                    }
                }
            }
        }
        C4333g c4333gM8780c = c4333g.m8780c();
        ArrayList arrayListM4144c = c1624aConversations.m4144c();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        Iterator it4 = arrayListM4144c.iterator();
        while (true) {
            z9 = true;
            if (!it4.hasNext()) {
                break;
            }
            String string = AbstractC3149m.m6703R0(((C2527b) it4.next()).f8167a).toString();
            if (!AbstractC3149m.m6721t0(string) && !C0429d2.m1438q(string) && !f17519b.contains(string)) {
                if (c1368iM9259c != null) {
                    try {
                        objM3725n2 = c1368iM9259c.m3725n(string);
                    } catch (Throwable th5) {
                        c3959f5 = new C3959f(th5);
                    }
                } else {
                    objM3725n2 = null;
                }
                c3959f5 = objM3725n2;
                if (c3959f5 instanceof C3959f) {
                    c3959f5 = null;
                }
                WeChatContact weChatContact = (WeChatContact) c3959f5;
                if (weChatContact != null || string.equals("filehelper") || setM8412U1.contains(string)) {
                    boolean z13 = weChatContact != null && weChatContact.isGroup();
                    String strM7883Z = weChatContact != null ? AbstractC3754e0.m7883Z(weChatContact, z13) : null;
                    if (strM7883Z == null) {
                        strM7883Z = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    if (AbstractC3149m.m6721t0(strM7883Z)) {
                        strM7883Z = c1624aConversations.m4143b(string);
                        if (AbstractC3149m.m6721t0(strM7883Z)) {
                            strM7883Z = string;
                        }
                    }
                    String str6 = strM7883Z;
                    String str7 = weChatContact != null ? weChatContact.avatarUrl : null;
                    String str8 = str7 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str7;
                    String str9 = weChatContact != null ? weChatContact.avatarBackupUrl : null;
                    String str10 = str9 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str9;
                    List list2 = (List) linkedHashMap.get(string);
                    if (list2 == null) {
                        list2 = c4173t;
                    }
                    List listM8407P1 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(list2));
                    boolean z14 = weChatContact != null ? weChatContact.isOfficialAccount() : false;
                    String str11 = (String) c4333gM8780c.get(string);
                    String str12 = str11 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str11;
                    ArrayList arrayListM103z0 = AbstractC0000a.m103z0(weChatContact != null ? weChatContact.remarkName : null, weChatContact != null ? weChatContact.nickname : null, weChatContact != null ? weChatContact.customWxId : null, string);
                    ArrayList arrayList8 = new ArrayList();
                    for (Object obj5 : arrayListM103z0) {
                        if (!AbstractC3149m.m6721t0((String) obj5)) {
                            arrayList8.add(obj5);
                        }
                    }
                    linkedHashMap3.put(string, new C5292s0(string, str6, z13, str8, str10, listM8407P1, z14, str12, AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList8))));
                }
            }
        }
        ArrayList<String> arrayList9 = new ArrayList();
        for (Object obj6 : setM8412U1) {
            if (!linkedHashMap3.containsKey((String) obj6)) {
                arrayList9.add(obj6);
            }
        }
        for (String str13 : arrayList9) {
            if (c1368iM9259c != null) {
                try {
                    objM3725n = c1368iM9259c.m3725n(str13);
                } catch (Throwable th6) {
                    c3959f4 = new C3959f(th6);
                }
            } else {
                objM3725n = null;
            }
            c3959f4 = objM3725n;
            if (c3959f4 instanceof C3959f) {
                c3959f4 = null;
            }
            WeChatContact weChatContact2 = (WeChatContact) c3959f4;
            boolean z15 = ((weChatContact2 != null && weChatContact2.isGroup() == z9) || AbstractC3156t.m6733W(str13, "@chatroom", false) || AbstractC3156t.m6733W(str13, "@im.chatroom", false)) ? z9 : false;
            String strM7883Z2 = weChatContact2 != null ? AbstractC3754e0.m7883Z(weChatContact2, z15) : null;
            if (strM7883Z2 == null) {
                strM7883Z2 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (AbstractC3149m.m6721t0(strM7883Z2)) {
                strM7883Z2 = c1624aConversations.m4143b(str13);
                if (AbstractC3149m.m6721t0(strM7883Z2)) {
                    strM7883Z2 = str13;
                }
            }
            String str14 = strM7883Z2;
            str14.getClass();
            String str15 = weChatContact2 != null ? weChatContact2.avatarUrl : null;
            String str16 = str15 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str15;
            String str17 = weChatContact2 != null ? weChatContact2.avatarBackupUrl : null;
            String str18 = str17 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str17;
            List list3 = (List) linkedHashMap.get(str13);
            if (list3 == null) {
                list3 = c4173t;
            }
            List listM8407P12 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(list3));
            if (weChatContact2 == null || weChatContact2.isOfficialAccount() != z9) {
                z10 = false;
                if (!AbstractC3156t.m6740d0(str13, "gh_", false)) {
                    z11 = false;
                }
                String str19 = (String) c4333gM8780c.get(str13);
                String str20 = str19 != null ? HttpUrl.FRAGMENT_ENCODE_SET : str19;
                ArrayList arrayListM103z02 = AbstractC0000a.m103z0(weChatContact2 == null ? weChatContact2.remarkName : null, weChatContact2 == null ? weChatContact2.nickname : null, weChatContact2 == null ? weChatContact2.customWxId : null, str13);
                ArrayList arrayList10 = new ArrayList();
                for (Object obj7 : arrayListM103z02) {
                    if (!AbstractC3149m.m6721t0((String) obj7)) {
                        arrayList10.add(obj7);
                    }
                }
                linkedHashMap3.put(str13, new C5292s0(str13, str14, z15, str16, str18, listM8407P12, z11, str20, AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList10))));
                z9 = true;
            } else {
                z10 = false;
            }
            z11 = z9;
            String str192 = (String) c4333gM8780c.get(str13);
            if (str192 != null) {
            }
            ArrayList arrayListM103z022 = AbstractC0000a.m103z0(weChatContact2 == null ? weChatContact2.remarkName : null, weChatContact2 == null ? weChatContact2.nickname : null, weChatContact2 == null ? weChatContact2.customWxId : null, str13);
            ArrayList arrayList102 = new ArrayList();
            while (r0.hasNext()) {
            }
            linkedHashMap3.put(str13, new C5292s0(str13, str14, z15, str16, str18, listM8407P12, z11, str20, AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList102))));
            z9 = true;
        }
        Collection collectionValues = linkedHashMap3.values();
        collectionValues.getClass();
        List listM8407P13 = AbstractC4166m.m8407P1(collectionValues);
        Collection collectionValues2 = linkedHashMap3.values();
        collectionValues2.getClass();
        ArrayList arrayList11 = new ArrayList();
        for (Object obj8 : collectionValues2) {
            if (((C5292s0) obj8).f20556g) {
                arrayList11.add(obj8);
            }
        }
        ArrayList arrayList12 = new ArrayList(AbstractC4167n.m8429e1(arrayList11));
        Iterator it5 = arrayList11.iterator();
        while (it5.hasNext()) {
            arrayList12.add(((C5292s0) it5.next()).f20550a);
        }
        return new C4867f2(listM8407P13, set, AbstractC4156d0.m8353U(set2, arrayList12));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static ArrayList m9279g(List list) {
        ArrayList arrayListM1488l = AbstractC0473o2.m1488l(list);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayListM1488l) {
            String str = ((C0414a) obj).f1181c;
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        ArrayList arrayList2 = new ArrayList();
        m9280h(linkedHashMap, new HashSet(), arrayList2, null, 0, C4173t.f13710g);
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final void m9280h(LinkedHashMap linkedHashMap, HashSet hashSet, ArrayList arrayList, String str, int i9, List list) {
        HashSet hashSet2;
        ArrayList arrayList2;
        LinkedHashMap linkedHashMap2;
        Iterable iterable = (List) linkedHashMap.get(str);
        if (iterable == null) {
            iterable = C4173t.f13710g;
        }
        for (C0414a c0414a : AbstractC4166m.m8402K1(iterable, new C4834e2(1))) {
            if (hashSet.add(c0414a.f1179a)) {
                ArrayList arrayListM8398G1 = AbstractC4166m.m8398G1(list, c0414a.f1180b);
                arrayList.add(new C4900g2(c0414a, i9, AbstractC4166m.m8392A1(arrayListM8398G1, " / ", null, null, null, 62)));
                hashSet2 = hashSet;
                arrayList2 = arrayList;
                linkedHashMap2 = linkedHashMap;
                m9280h(linkedHashMap2, hashSet2, arrayList2, c0414a.f1179a, i9 + 1, arrayListM8398G1);
            } else {
                linkedHashMap2 = linkedHashMap;
                hashSet2 = hashSet;
                arrayList2 = arrayList;
            }
            linkedHashMap = linkedHashMap2;
            hashSet = hashSet2;
            arrayList = arrayList2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m9281a(Context context, C0414a c0414a, List list, InterfaceC1220a interfaceC1220a, InterfaceC1231l interfaceC1231l, C1836h0 c1836h0, int i9) {
        Object c0970b;
        InterfaceC1809a1 interfaceC1809a1;
        Set set;
        List list2;
        InterfaceC1809a1 interfaceC1809a12;
        InterfaceC1809a1 interfaceC1809a13;
        boolean z9;
        Iterator it;
        boolean zContains;
        c1836h0.m4527b0(-2123217869);
        int i10 = i9 | (c1836h0.m4534f(c0414a) ? 32 : 16) | (c1836h0.m4534f(list) ? Opcodes.ACC_NATIVE : 128) | (c1836h0.m4538h(interfaceC1220a) ? Opcodes.ACC_STRICT : 1024) | (c1836h0.m4538h(interfaceC1231l) ? 16384 : 8192);
        if (c1836h0.m4516S(i10 & 1, (i10 & 9361) != 9360)) {
            Object obj = c0414a.f1179a;
            boolean zM4534f = c1836h0.m4534f(obj);
            Object objM4514P = c1836h0.m4514P();
            Object obj2 = C1851l.f6155a;
            if (zM4534f || objM4514P == obj2) {
                objM4514P = AbstractC1874r.m4639u(Boolean.TRUE);
                c1836h0.m4545k0(objM4514P);
            }
            InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) objM4514P;
            boolean zM4534f2 = c1836h0.m4534f(obj);
            Object objM4514P2 = c1836h0.m4514P();
            if (zM4534f2 || objM4514P2 == obj2) {
                objM4514P2 = AbstractC1874r.m4639u(HttpUrl.FRAGMENT_ENCODE_SET);
                c1836h0.m4545k0(objM4514P2);
            }
            InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) objM4514P2;
            boolean zM4534f3 = c1836h0.m4534f(obj);
            Object objM4514P3 = c1836h0.m4514P();
            if (zM4534f3 || objM4514P3 == obj2) {
                C4175v c4175v = C4175v.f13712g;
                objM4514P3 = AbstractC1874r.m4639u(new C4867f2(C4173t.f13710g, c4175v, c4175v));
                c1836h0.m4545k0(objM4514P3);
            }
            InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) objM4514P3;
            boolean zM4534f4 = c1836h0.m4534f(obj);
            Object objM4514P4 = c1836h0.m4514P();
            if (zM4534f4 || objM4514P4 == obj2) {
                objM4514P4 = AbstractC1874r.m4639u(HttpUrl.FRAGMENT_ENCODE_SET);
                c1836h0.m4545k0(objM4514P4);
            }
            InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) objM4514P4;
            boolean zM4534f5 = c1836h0.m4534f(obj);
            Object objM4514P5 = c1836h0.m4514P();
            if (zM4534f5 || objM4514P5 == obj2) {
                objM4514P5 = AbstractC1874r.m4639u(EnumC5325t0.f20735m);
                c1836h0.m4545k0(objM4514P5);
            }
            InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) objM4514P5;
            boolean zM4534f6 = c1836h0.m4534f(obj);
            Object objM4514P6 = c1836h0.m4514P();
            if (zM4534f6 || objM4514P6 == obj2) {
                objM4514P6 = AbstractC1874r.m4639u(HttpUrl.FRAGMENT_ENCODE_SET);
                c1836h0.m4545k0(objM4514P6);
            }
            InterfaceC1809a1 interfaceC1809a19 = (InterfaceC1809a1) objM4514P6;
            int i11 = i10 & 112;
            boolean z10 = i11 == 32;
            Object objM4514P7 = c1836h0.m4514P();
            if (z10 || objM4514P7 == obj2) {
                objM4514P7 = AbstractC4166m.m8412U1(c0414a.f1183e);
                c1836h0.m4545k0(objM4514P7);
            }
            Set set2 = (Set) objM4514P7;
            boolean z11 = i11 == 32;
            Object objM4514P8 = c1836h0.m4514P();
            if (z11 || objM4514P8 == obj2) {
                objM4514P8 = AbstractC1874r.m4639u(set2);
                c1836h0.m4545k0(objM4514P8);
            }
            InterfaceC1809a1 interfaceC1809a110 = (InterfaceC1809a1) objM4514P8;
            int i12 = 1;
            C3641z c3641zM7603a = AbstractC3617b0.m7603a(c1836h0);
            C4060x c4060xM8245i = AbstractC4045s.m8245i(c1836h0);
            boolean zM4534f7 = ((i10 & 896) == 256) | c1836h0.m4534f(interfaceC1809a14) | c1836h0.m4534f(interfaceC1809a15) | (i11 == 32) | c1836h0.m4534f(interfaceC1809a16);
            Object objM4514P9 = c1836h0.m4514P();
            if (zM4534f7 || objM4514P9 == obj2) {
                interfaceC1809a1 = interfaceC1809a16;
                set = set2;
                c0970b = new C0970b(interfaceC1809a14, interfaceC1809a15, list, c0414a, interfaceC1809a1, null, 7);
                interfaceC1809a14 = interfaceC1809a14;
                list2 = list;
                c1836h0.m4545k0(c0970b);
            } else {
                c0970b = objM4514P9;
                list2 = list;
                interfaceC1809a1 = interfaceC1809a16;
                set = set2;
            }
            AbstractC1874r.m4625g(obj, list2, (InterfaceC1235p) c0970b, c1836h0);
            List list3 = ((C4867f2) interfaceC1809a1.getValue()).f17044a;
            boolean zM4534f8 = c1836h0.m4534f(list3);
            Object objM4514P10 = c1836h0.m4514P();
            if (zM4534f8 || objM4514P10 == obj2) {
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    AbstractC4171r.m8432h1(arrayList, ((C5292s0) it2.next()).f20555f);
                }
                objM4514P10 = AbstractC4166m.m8402K1(AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList)), new C4834e2(0));
                c1836h0.m4545k0(objM4514P10);
            }
            List list4 = (List) objM4514P10;
            EnumC5325t0 enumC5325t0 = (EnumC5325t0) interfaceC1809a18.getValue();
            boolean zM4534f9 = c1836h0.m4534f(interfaceC1809a18) | c1836h0.m4534f(interfaceC1809a19) | c1836h0.m4538h(list4);
            Object objM4514P11 = c1836h0.m4514P();
            if (zM4534f9 || objM4514P11 == obj2) {
                objM4514P11 = new C4802d2(list4, interfaceC1809a18, interfaceC1809a19, null, 0);
                interfaceC1809a12 = interfaceC1809a18;
                interfaceC1809a13 = interfaceC1809a19;
                c1836h0.m4545k0(objM4514P11);
            } else {
                interfaceC1809a12 = interfaceC1809a18;
                interfaceC1809a13 = interfaceC1809a19;
            }
            AbstractC1874r.m4625g(enumC5325t0, list4, (InterfaceC1235p) objM4514P11, c1836h0);
            String string = AbstractC3149m.m6703R0((String) interfaceC1809a17.getValue()).toString();
            Locale locale = Locale.US;
            String strM5165l = AbstractC2091b.m5165l(locale, string, locale);
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                C5292s0 c5292s0 = (C5292s0) next;
                int iOrdinal = ((EnumC5325t0) interfaceC1809a12.getValue()).ordinal();
                if (iOrdinal != 0) {
                    it = it3;
                    if (iOrdinal == i12) {
                        zContains = c5292s0.f20552c;
                    } else if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            if (iOrdinal != 4) {
                                C3193a.m6822k();
                                return;
                            }
                        } else if (AbstractC3149m.m6721t0((String) interfaceC1809a13.getValue()) || !((C4867f2) interfaceC1809a1.getValue()).f17045b.contains(c5292s0.f20550a) || !c5292s0.f20555f.contains((String) interfaceC1809a13.getValue())) {
                            zContains = false;
                        }
                        zContains = true;
                    } else {
                        zContains = ((C4867f2) interfaceC1809a1.getValue()).f17046c.contains(c5292s0.f20550a);
                    }
                } else {
                    it = it3;
                    zContains = ((C4867f2) interfaceC1809a1.getValue()).f17045b.contains(c5292s0.f20550a);
                }
                if (zContains) {
                    arrayList2.add(next);
                }
                it3 = it;
                i12 = 1;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : arrayList2) {
                if (AbstractC4955ho.m9573i6((C5292s0) obj3, strM5165l)) {
                    arrayList3.add(obj3);
                }
            }
            boolean zM4538h = c1836h0.m4538h(set);
            Object objM4514P12 = c1836h0.m4514P();
            if (zM4538h || objM4514P12 == obj2) {
                objM4514P12 = new C2022p(set, 1);
                c1836h0.m4545k0(objM4514P12);
            }
            ArrayList arrayListM9547f7 = AbstractC4955ho.m9547f7((InterfaceC1231l) objM4514P12, arrayList3);
            ArrayList arrayList4 = new ArrayList(AbstractC4167n.m8429e1(arrayListM9547f7));
            Iterator it4 = arrayListM9547f7.iterator();
            while (it4.hasNext()) {
                arrayList4.add(((C5292s0) it4.next()).f20550a);
            }
            Set setM8412U1 = AbstractC4166m.m8412U1(arrayList4);
            if (setM8412U1.isEmpty()) {
                z9 = false;
                AbstractC4955ho.m9297B2("选择分组会话", "选择分组会话", c4060xM8245i, null, null, AbstractC3879i.m8071e(468628114, new C4027m(interfaceC1231l, interfaceC1809a110, interfaceC1220a, setM8412U1, z9, 1), c1836h0), AbstractC3879i.m8071e(-1788958376, new C4801d1(c4060xM8245i, c3641zM7603a, interfaceC1809a12, interfaceC1809a17, list4, interfaceC1809a13, arrayListM9547f7, interfaceC1809a14, interfaceC1809a15, interfaceC1809a110), c1836h0), c1836h0, 1769526, 24);
            } else {
                Set set3 = setM8412U1;
                Set set4 = (Set) interfaceC1809a110.getValue();
                if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                    Iterator it5 = set3.iterator();
                    while (it5.hasNext()) {
                        if (!set4.contains((String) it5.next())) {
                            z9 = false;
                            break;
                        }
                    }
                }
                z9 = true;
                AbstractC4955ho.m9297B2("选择分组会话", "选择分组会话", c4060xM8245i, null, null, AbstractC3879i.m8071e(468628114, new C4027m(interfaceC1231l, interfaceC1809a110, interfaceC1220a, setM8412U1, z9, 1), c1836h0), AbstractC3879i.m8071e(-1788958376, new C4801d1(c4060xM8245i, c3641zM7603a, interfaceC1809a12, interfaceC1809a17, list4, interfaceC1809a13, arrayListM9547f7, interfaceC1809a14, interfaceC1809a15, interfaceC1809a110), c1836h0), c1836h0, 1769526, 24);
            }
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0506z0(this, context, c0414a, list, interfaceC1220a, interfaceC1231l, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m9282b(final Context context, C0414a c0414a, final List list, final boolean z9, final InterfaceC1220a interfaceC1220a, final InterfaceC1231l interfaceC1231l, final InterfaceC1231l interfaceC1231l2, final InterfaceC1231l interfaceC1231l3, final InterfaceC1220a interfaceC1220a2, C1836h0 c1836h0, final int i9) {
        C0414a c0414a2;
        C1836h0 c1836h02;
        Object next;
        c1836h0.m4527b0(110994553);
        int i10 = i9 | (c1836h0.m4538h(context) ? 4 : 2) | (c1836h0.m4534f(c0414a) ? 32 : 16) | (c1836h0.m4534f(list) ? Opcodes.ACC_NATIVE : 128) | (c1836h0.m4536g(z9) ? Opcodes.ACC_STRICT : 1024) | (c1836h0.m4538h(interfaceC1231l) ? Opcodes.ACC_DEPRECATED : 65536) | (c1836h0.m4538h(interfaceC1231l2) ? 1048576 : 524288) | (c1836h0.m4538h(interfaceC1231l3) ? 8388608 : 4194304) | (c1836h0.m4538h(interfaceC1220a2) ? 67108864 : 33554432);
        if (c1836h0.m4516S(i10 & 1, (38347923 & i10) != 38347922)) {
            boolean z10 = (i10 & 112) == 32;
            Object objM4514P = c1836h0.m4514P();
            C1823e c1823e = C1851l.f6155a;
            if (z10 || objM4514P == c1823e) {
                objM4514P = AbstractC1874r.m4639u(c0414a.f1180b);
                c1836h0.m4545k0(objM4514P);
            }
            InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) objM4514P;
            boolean zM4534f = c1836h0.m4534f(c0414a.f1179a);
            Object objM4514P2 = c1836h0.m4514P();
            if (zM4534f || objM4514P2 == c1823e) {
                objM4514P2 = AbstractC1874r.m4639u(Boolean.FALSE);
                c1836h0.m4545k0(objM4514P2);
            }
            InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) objM4514P2;
            C3641z c3641zM7603a = AbstractC3617b0.m7603a(c1836h0);
            C4060x c4060xM8245i = AbstractC4045s.m8245i(c1836h0);
            C0414a c0414aM1401a = C0414a.m1401a(c0414a, null, AbstractC3149m.m6703R0((String) interfaceC1809a1.getValue()).toString(), null, 0, null, null, false, null, false, false, false, 4093);
            String str = c0414a.f1181c;
            if (str != null) {
                Iterator it = m9279g(list).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (AbstractC1416l.m3825a(((C4900g2) next).f17324a.f1179a, str)) {
                            break;
                        }
                    }
                }
                C4900g2 c4900g2 = (C4900g2) next;
                str = c4900g2 != null ? c4900g2.f17326c : null;
                if (str == null) {
                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                }
            }
            c0414a2 = c0414a;
            c1836h02 = c1836h0;
            AbstractC4955ho.m9297B2(z9 ? "编辑聊天分组" : "新增聊天分组", z9 ? "编辑聊天分组" : "新增聊天分组", c4060xM8245i, null, null, AbstractC3879i.m8071e(1482803736, new C0455k0((Object) c0414aM1401a, (Object) context, interfaceC1231l3, (Object) interfaceC1220a, 4), c1836h0), AbstractC3879i.m8071e(266155358, new C4996j1(c4060xM8245i, c3641zM7603a, interfaceC1809a1, str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str, interfaceC1231l, c0414aM1401a, c0414a, interfaceC1231l2, z9, interfaceC1809a12), c1836h0), c1836h02, 1769472, 24);
            if (((Boolean) interfaceC1809a12.getValue()).booleanValue()) {
                c1836h02.m4525a0(-483188608);
                boolean zM4534f2 = c1836h02.m4534f(interfaceC1809a12);
                Object objM4514P3 = c1836h02.m4514P();
                if (zM4534f2 || objM4514P3 == c1823e) {
                    objM4514P3 = new C0144j(interfaceC1809a12, 16);
                    c1836h02.m4545k0(objM4514P3);
                }
                AbstractC3165h.m6777d(null, "删除聊天分组", 0L, 0L, 0L, false, (InterfaceC1220a) objM4514P3, 0L, 0L, false, AbstractC3879i.m8071e(-1926522721, new C0145k(c0414a2, interfaceC1809a12, interfaceC1220a2, 5), c1836h02), c1836h02, 390, 3072);
                c1836h02.m4553p(false);
            } else {
                c1836h02.m4525a0(-481826871);
                c1836h02.m4553p(false);
            }
        } else {
            c0414a2 = c0414a;
            c1836h02 = c1836h0;
            c1836h02.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h02.m4557t();
        if (c1876r1M4557t != null) {
            final C0414a c0414a3 = c0414a2;
            c1876r1M4557t.f6241d = new InterfaceC1235p(context, c0414a3, list, z9, interfaceC1220a, interfaceC1231l, interfaceC1231l2, interfaceC1231l3, interfaceC1220a2, i9) { // from class: wb.k1

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ Context f18260h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ C0414a f18261i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ List f18262j;

                /* JADX INFO: renamed from: k */
                public final /* synthetic */ boolean f18263k;

                /* JADX INFO: renamed from: l */
                public final /* synthetic */ InterfaceC1220a f18264l;

                /* JADX INFO: renamed from: m */
                public final /* synthetic */ InterfaceC1231l f18265m;

                /* JADX INFO: renamed from: n */
                public final /* synthetic */ InterfaceC1231l f18266n;

                /* JADX INFO: renamed from: o */
                public final /* synthetic */ InterfaceC1231l f18267o;

                /* JADX INFO: renamed from: p */
                public final /* synthetic */ InterfaceC1220a f18268p;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p085fg.InterfaceC1235p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM4617C = AbstractC1874r.m4617C(805330945);
                    this.f18259g.m9282b(this.f18260h, this.f18261i, this.f18262j, this.f18263k, this.f18264l, this.f18265m, this.f18266n, this.f18267o, this.f18268p, (C1836h0) obj, iM4617C);
                    return C3967n.f12976a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e1  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m9283c(String str, boolean z9, List list, InterfaceC1231l interfaceC1231l, InterfaceC1220a interfaceC1220a, InterfaceC1220a interfaceC1220a2, InterfaceC1231l interfaceC1231l2, C1836h0 c1836h0, int i9) {
        boolean z10;
        c1836h0.m4527b0(-1043104329);
        int i10 = i9 | (c1836h0.m4534f(str) ? 4 : 2) | (c1836h0.m4536g(z9) ? 32 : 16) | (c1836h0.m4534f(list) ? 256 : 128) | (c1836h0.m4538h(interfaceC1231l) ? Opcodes.ACC_STRICT : 1024) | (c1836h0.m4538h(interfaceC1220a) ? 16384 : 8192);
        if (c1836h0.m4516S(i10 & 1, (599187 & i10) != 599186)) {
            Object objM4514P = c1836h0.m4514P();
            C1823e c1823e = C1851l.f6155a;
            if (objM4514P == c1823e) {
                objM4514P = AbstractC1874r.m4639u(HttpUrl.FRAGMENT_ENCODE_SET);
                c1836h0.m4545k0(objM4514P);
            }
            InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) objM4514P;
            C3641z c3641zM7603a = AbstractC3617b0.m7603a(c1836h0);
            C4060x c4060xM8245i = AbstractC4045s.m8245i(c1836h0);
            boolean z11 = (i10 & 896) == 256;
            Object objM4514P2 = c1836h0.m4514P();
            if (z11 || objM4514P2 == c1823e) {
                objM4514P2 = m9279g(list);
                c1836h0.m4545k0(objM4514P2);
            }
            String string = AbstractC3149m.m6703R0((String) interfaceC1809a1.getValue()).toString();
            Locale locale = Locale.US;
            String strM5165l = AbstractC2091b.m5165l(locale, string, locale);
            ArrayList arrayList = new ArrayList();
            for (Object obj : (List) objM4514P2) {
                C4900g2 c4900g2 = (C4900g2) obj;
                if (strM5165l.length() == 0) {
                    z10 = true;
                } else {
                    String str2 = c4900g2.f17324a.f1180b;
                    Locale locale2 = Locale.US;
                    if (!AbstractC0255e.m1032u(locale2, str2, locale2, strM5165l, false) && !AbstractC0255e.m1031t(c4900g2.f17326c, locale2, strM5165l, false)) {
                        z10 = false;
                    }
                }
                if (z10) {
                    arrayList.add(obj);
                }
            }
            AbstractC4955ho.m9297B2(str, str, c4060xM8245i, null, null, AbstractC3879i.m8071e(9785336, new C4899g1(interfaceC1220a2, interfaceC1220a, 0), c1836h0), AbstractC3879i.m8071e(2055976306, new C4932h1(c4060xM8245i, c3641zM7603a, z9, interfaceC1231l, list, arrayList, interfaceC1231l2, interfaceC1809a1), c1836h0), c1836h0, (i10 & 14) | 1769472 | ((i10 << 3) & 112), 24);
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C4965i1(this, str, z9, list, interfaceC1231l, interfaceC1220a, interfaceC1220a2, interfaceC1231l2, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m9284d(C0414a c0414a, List list, InterfaceC1220a interfaceC1220a, InterfaceC1231l interfaceC1231l, C1836h0 c1836h0, int i9) {
        c1836h0.m4527b0(-1431763793);
        int i10 = i9 | (c1836h0.m4534f(c0414a) ? 4 : 2) | (c1836h0.m4534f(list) ? 32 : 16) | (c1836h0.m4538h(interfaceC1220a) ? Opcodes.ACC_NATIVE : 128) | (c1836h0.m4538h(interfaceC1231l) ? Opcodes.ACC_STRICT : 1024);
        if (c1836h0.m4516S(i10 & 1, (i10 & 1171) != 1170)) {
            String str = c0414a.f1179a;
            int i11 = i10 & 112;
            boolean zM4534f = (i11 == 32) | c1836h0.m4534f(str);
            Object objM4514P = c1836h0.m4514P();
            Object obj = C1851l.f6155a;
            if (zM4534f || objM4514P == obj) {
                objM4514P = AbstractC4156d0.m8354V(AbstractC0473o2.m1482f(str, list), str);
                c1836h0.m4545k0(objM4514P);
            }
            Set set = (Set) objM4514P;
            boolean zM4534f2 = c1836h0.m4534f(set) | (i11 == 32);
            Object objM4514P2 = c1836h0.m4514P();
            Object obj2 = objM4514P2;
            if (zM4534f2 || objM4514P2 == obj) {
                ArrayList arrayListM9279g = m9279g(list);
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : arrayListM9279g) {
                    if (!set.contains(((C4900g2) obj3).f17324a.f1179a)) {
                        arrayList.add(obj3);
                    }
                }
                c1836h0.m4545k0(arrayList);
                obj2 = arrayList;
            }
            C3641z c3641zM7603a = AbstractC3617b0.m7603a(c1836h0);
            C4060x c4060xM8245i = AbstractC4045s.m8245i(c1836h0);
            AbstractC4955ho.m9297B2("选择上级分组", "选择上级分组", c4060xM8245i, null, null, AbstractC3879i.m8071e(1059222862, new C1528j0(interfaceC1231l, interfaceC1220a), c1836h0), AbstractC3879i.m8071e(40836756, new C4866f1(c4060xM8245i, c3641zM7603a, (List) obj2, interfaceC1231l, 0), c1836h0), c1836h0, 1769526, 24);
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0160z((Object) this, (Object) c0414a, (Object) list, interfaceC1220a, (InterfaceC3955b) interfaceC1231l, i9, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m9285e(Context context, InterfaceC4544a interfaceC4544a, InterfaceC1220a interfaceC1220a, C1836h0 c1836h0, int i9) {
        int i10;
        interfaceC4544a.getClass();
        interfaceC1220a.getClass();
        c1836h0.m4527b0(2101163619);
        if ((i9 & 6) == 0) {
            i10 = (c1836h0.m4538h(context) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= (i9 & 64) == 0 ? c1836h0.m4534f(interfaceC4544a) : c1836h0.m4538h(interfaceC4544a) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i10 |= c1836h0.m4538h(interfaceC1220a) ? Opcodes.ACC_NATIVE : 128;
        }
        if (c1836h0.m4516S(i10 & 1, (i10 & 147) != 146)) {
            Object objM4514P = c1836h0.m4514P();
            C1823e c1823e = C1851l.f6155a;
            if (objM4514P == c1823e) {
                objM4514P = AbstractC1874r.m4639u(Boolean.valueOf(AbstractC4302b.m8640c(context, "Hchat_conversation_groups").getBoolean("enabled", false)));
                c1836h0.m4545k0(objM4514P);
            }
            InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) objM4514P;
            Object objM4514P2 = c1836h0.m4514P();
            if (objM4514P2 == c1823e) {
                objM4514P2 = AbstractC1874r.m4639u(AbstractC0473o2.m1485i(context));
                c1836h0.m4545k0(objM4514P2);
            }
            InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) objM4514P2;
            Object objM4514P3 = c1836h0.m4514P();
            if (objM4514P3 == c1823e) {
                objM4514P3 = AbstractC1874r.m4639u(C5489y0.f22055a);
                c1836h0.m4545k0(objM4514P3);
            }
            InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) objM4514P3;
            AbstractC4702a1 abstractC4702a1 = (AbstractC4702a1) interfaceC1809a13.getValue();
            Object objM4514P4 = c1836h0.m4514P();
            if (objM4514P4 == c1823e) {
                objM4514P4 = new C4661l(1);
                c1836h0.m4545k0(objM4514P4);
            }
            AbstractC4955ho.m9322E3(abstractC4702a1, null, "ConversationGroupRoute", (InterfaceC1231l) objM4514P4, false, AbstractC3879i.m8071e(-657345589, new C4833e1(interfaceC4544a, context, interfaceC1220a, interfaceC1809a1, interfaceC1809a12, interfaceC1809a13, 0), c1836h0), c1836h0, 200064, 18);
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C3873c(this, context, interfaceC4544a, interfaceC1220a, i9, 1);
        }
    }
}
