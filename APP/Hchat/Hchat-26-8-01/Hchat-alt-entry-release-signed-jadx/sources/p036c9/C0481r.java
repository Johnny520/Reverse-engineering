package p036c9;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Handler;
import bi.C0315c;
import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p007a7.AbstractC0018a;
import p010aa.C0035c;
import p019b4.C0178b;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1231l;
import p096g8.C1368i;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatContact;
import p106h8.C1624a;
import p167l8.C2527b;
import p218og.AbstractC3149m;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3967n;
import p332wb.AbstractC4855en;
import p332wb.C5026jv;
import p332wb.C5491y2;
import p332wb.EnumC5092lv;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.C4173t;

/* JADX INFO: renamed from: c9.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0481r implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1423g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Activity f1424h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f1425i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0035c f1426j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0481r(Activity activity, String str, C0035c c0035c, int i9) {
        this.f1423g = i9;
        this.f1424h = activity;
        this.f1425i = str;
        this.f1426j = c0035c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:106:0x028c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:60:0x01c2 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:107:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0252  */
    @Override // p085fg.InterfaceC1231l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) throws PendingIntent.CanceledException {
        Object c3959f;
        int i9 = this.f1423g;
        Object c3959f2 = null;
        C0035c c0035c = this.f1426j;
        String str = this.f1425i;
        C3967n c3967n = C3967n.f12976a;
        switch (i9) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                Handler handler = C0419b0.f1202a;
                int i10 = 2;
                int i11 = 1;
                Activity activity = this.f1424h;
                List list = C4173t.f13710g;
                switch (iIntValue) {
                    case 0:
                        AbstractC0018a.m231S(activity, null, false);
                        break;
                    case 1:
                        List listM1403a = C0419b0.m1403a(activity, str);
                        if (listM1403a.isEmpty()) {
                            C0419b0.m1410h(activity, "当前分组没有会话");
                        } else {
                            C0419b0.m1406d(activity, "所有消息标为已读", AbstractC0921a.m2250m(listM1403a.size(), "正在标记 ", " 个会话..."), new C0484s(listM1403a, activity), new C0458l(c0035c, activity, 1));
                        }
                        break;
                    case 2:
                        C0419b0.m1408f(activity, C0419b0.m1403a(activity, str), "批量删除消息", "继续", false, new C0481r(activity, str, c0035c, 3));
                        break;
                    case 3:
                        C0419b0.m1407e(activity, str, true, c0035c);
                        break;
                    case 4:
                        C0419b0.m1407e(activity, str, false, c0035c);
                        break;
                    case 5:
                        List listM1403a2 = C0419b0.m1403a(activity, str);
                        if (listM1403a2.isEmpty()) {
                            C0419b0.m1410h(activity, "当前分组没有会话");
                        } else {
                            C5491y2.m9824c2(activity, "发送", AbstractC0921a.m2250m(listM1403a2.size(), "发送给当前分组及子分组内 ", " 个会话"), null, "输入要发送的文字", 5000, false, new C0484s(activity, listM1403a2), new C0315c(6), 584);
                        }
                        break;
                    case 6:
                        List listM1403a3 = C0419b0.m1403a(activity, str);
                        C1368i c1368iM9259c = AbstractC4855en.m9259c();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : listM1403a3) {
                            String str2 = (String) obj2;
                            if (c1368iM9259c != null) {
                                try {
                                    boolean z9 = c1368iM9259c.m3705H(str2);
                                    c3959f = Boolean.valueOf(z9);
                                } catch (Throwable th2) {
                                    c3959f = new C3959f(th2);
                                }
                            }
                            Boolean bool = Boolean.FALSE;
                            boolean z10 = c3959f instanceof C3959f;
                            Object obj3 = c3959f;
                            if (z10) {
                                obj3 = bool;
                            }
                            if (((Boolean) obj3).booleanValue()) {
                                arrayList.add(obj2);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            C0419b0.m1410h(activity, "当前分组没有可邀请的好友");
                        } else if (c1368iM9259c != null) {
                            try {
                                c3959f2 = c1368iM9259c.m3735x();
                                if (c3959f2 == null) {
                                    c3959f2 = list;
                                }
                            } catch (Throwable th3) {
                                c3959f2 = new C3959f(th3);
                            }
                            Object obj4 = list;
                            if (!(c3959f2 instanceof C3959f)) {
                                obj4 = c3959f2;
                            }
                            Iterable<WeChatContact> iterable = (Iterable) obj4;
                            ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(iterable));
                            for (WeChatContact weChatContact : iterable) {
                                String str3 = weChatContact.wxId;
                                String strDisplayName = weChatContact.displayName();
                                String str4 = weChatContact.avatarUrl;
                                String str5 = weChatContact.avatarBackupUrl;
                                List listM101y0 = AbstractC0000a.m101y0(weChatContact.nickname, weChatContact.remarkName, weChatContact.customWxId);
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj5 : listM101y0) {
                                    if (!AbstractC3149m.m6721t0((String) obj5)) {
                                        arrayList3.add(obj5);
                                    }
                                }
                                arrayList2.add(new C5026jv(str3, strDisplayName, true, str4, str5, null, false, arrayList3, 96));
                            }
                            C5491y2.m9807U1(activity, arrayList2, new C0446i(activity, 2, arrayList), new C0315c(6), "选择群聊", "下一步", false, null, null, true, 3008);
                        } else {
                            if (c3959f2 == null) {
                            }
                            Object obj42 = list;
                            if (!(c3959f2 instanceof C3959f)) {
                            }
                            Iterable<WeChatContact> iterable2 = (Iterable) obj42;
                            ArrayList arrayList22 = new ArrayList(AbstractC4167n.m8429e1(iterable2));
                            while (r0.hasNext()) {
                            }
                            C5491y2.m9807U1(activity, arrayList22, new C0446i(activity, 2, arrayList), new C0315c(6), "选择群聊", "下一步", false, null, null, true, 3008);
                        }
                        break;
                    case 7:
                        List listM1403a4 = C0419b0.m1403a(activity, str);
                        C1624a c1624aConversations = WeChatApis.conversations();
                        ArrayList arrayListM4144c = c1624aConversations != null ? c1624aConversations.m4144c() : null;
                        if (arrayListM4144c != null) {
                            list = arrayListM4144c;
                        }
                        ArrayList arrayList4 = new ArrayList(AbstractC4167n.m8429e1(list));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList4.add(((C2527b) it.next()).f8167a);
                        }
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj6 : arrayList4) {
                            String str6 = (String) obj6;
                            if (!AbstractC3149m.m6721t0(str6) && !C0429d2.m1438q(str6) && !listM1403a4.contains(str6)) {
                                arrayList5.add(obj6);
                            }
                        }
                        C0419b0.m1408f(activity, AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList5)), "添加到当前分组", "添加", false, new C0481r(activity, str, c0035c, i11));
                        break;
                    case 8:
                        C0414a c0414aM1405c = C0419b0.m1405c(activity, str);
                        List list2 = c0414aM1405c != null ? c0414aM1405c.f1183e : null;
                        C0419b0.m1408f(activity, list2 == null ? list : list2, "移出当前分组", "移出", false, new C0458l(activity, c0035c));
                        break;
                    case 9:
                        C0414a c0414aM1405c2 = C0419b0.m1405c(activity, str);
                        List list3 = c0414aM1405c2 != null ? c0414aM1405c2.f1183e : null;
                        C0419b0.m1408f(activity, list3 == null ? list : list3, "选择要移动的会话", "下一步", false, new C0481r(activity, str, c0035c, i10));
                        break;
                    case 10:
                        C0419b0.m1408f(activity, C0419b0.m1403a(activity, str), "搜索分组会话", "打开", true, new C0178b(1));
                        break;
                    case 11:
                        C0419b0.m1409g(activity, str, c0035c);
                        break;
                }
                break;
            case 1:
                List list4 = (List) obj;
                list4.getClass();
                ArrayList arrayList6 = new ArrayList(AbstractC4167n.m8429e1(list4));
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList6.add(((C5026jv) it2.next()).f18249a);
                }
                Activity activity2 = this.f1424h;
                boolean zM1496t = AbstractC0473o2.m1496t(activity2, str, arrayList6);
                Handler handler2 = C0419b0.f1202a;
                C0419b0.m1410h(activity2, zM1496t ? AbstractC0921a.m2250m(list4.size(), "已添加 ", " 个会话") : "添加会话失败");
                if (zM1496t) {
                    c0035c.invoke();
                }
                break;
            case 2:
                List list5 = (List) obj;
                list5.getClass();
                Activity activity3 = this.f1424h;
                List listM1485i = AbstractC0473o2.m1485i(activity3);
                List listM99x0 = AbstractC0000a.m99x0(new C3958e(null, "微信首页"));
                ArrayList<C0414a> arrayList7 = new ArrayList();
                for (Object obj7 : listM1485i) {
                    if (!AbstractC1416l.m3825a(((C0414a) obj7).f1179a, str)) {
                        arrayList7.add(obj7);
                    }
                }
                ArrayList arrayList8 = new ArrayList(AbstractC4167n.m8429e1(arrayList7));
                for (C0414a c0414a : arrayList7) {
                    arrayList8.add(new C3958e(c0414a.f1179a, c0414a.f1180b));
                }
                ArrayList arrayListM8397F1 = AbstractC4166m.m8397F1(listM99x0, arrayList8);
                String strM2250m = AbstractC0921a.m2250m(list5.size(), "已选择 ", " 个会话");
                ArrayList arrayList9 = new ArrayList(AbstractC4167n.m8429e1(arrayListM8397F1));
                Iterator it3 = arrayListM8397F1.iterator();
                while (it3.hasNext()) {
                    arrayList9.add(new C3958e((String) ((C3958e) it3.next()).f12962h, HttpUrl.FRAGMENT_ENCODE_SET));
                }
                C5491y2.m9811W1(activity3, "移至", strM2250m, arrayList9, new C0454k(arrayListM8397F1, activity3, list5, c0035c), new C0315c(6));
                break;
            default:
                List list6 = (List) obj;
                list6.getClass();
                ArrayList arrayList10 = new ArrayList(AbstractC4167n.m8429e1(list6));
                Iterator it4 = list6.iterator();
                while (it4.hasNext()) {
                    arrayList10.add(((C5026jv) it4.next()).f18249a);
                }
                String strM2250m2 = AbstractC0921a.m2250m(arrayList10.size(), "将清空所选 ", " 个会话的本地聊天记录，联系人、群聊和聊天分组归属不会删除。此操作无法撤销。");
                Activity activity4 = this.f1424h;
                C5491y2.m9803S1(activity4, "清空聊天记录", strM2250m2, new C0454k(activity4, this.f1425i, arrayList10, this.f1426j, 0), new C0315c(6), EnumC5092lv.f18824j);
                break;
        }
        return c3967n;
    }
}
