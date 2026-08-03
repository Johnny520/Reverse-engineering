package p036c9;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import bi.C0315c;
import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p010aa.C0035c;
import p025bc.AbstractC0255e;
import p049d9.AbstractC0754o;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p096g8.C1368i;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatContact;
import p106h8.C1624a;
import p136j8.AbstractC2091b;
import p167l8.C2527b;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p276sf.C3958e;
import p276sf.C3959f;
import p332wb.AbstractC4855en;
import p332wb.C5026jv;
import p332wb.C5491y2;
import p332wb.EnumC5092lv;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.AbstractC4178y;
import tf.C4173t;

/* JADX INFO: renamed from: c9.b0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0419b0 {

    /* JADX INFO: renamed from: a */
    public static final Handler f1202a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    public static final ExecutorService f1203b = Executors.newSingleThreadExecutor(new ThreadFactoryC0478q(0));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static List m1403a(Activity activity, String str) {
        List listM1485i = AbstractC0473o2.m1485i(activity);
        C0429d2 c0429d2 = C0429d2.f1235a;
        return AbstractC4166m.m8407P1(C0429d2.m1431j(str, listM1485i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static List m1404b(Collection collection) {
        Object c3959f;
        Object objM3728q;
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(collection2));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            AbstractC2091b.m5171r((String) it.next(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!AbstractC3149m.m6721t0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        List<String> listM8407P1 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList2));
        C1368i c1368iM9259c = AbstractC4855en.m9259c();
        Iterable iterable = C4173t.f13710g;
        if (c1368iM9259c != null) {
            try {
                objM3728q = c1368iM9259c.m3728q(listM8407P1);
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
        } else {
            objM3728q = null;
        }
        c3959f = objM3728q == null ? iterable : objM3728q;
        if (c3959f instanceof C3959f) {
            c3959f = iterable;
        }
        Iterable iterable2 = (Iterable) c3959f;
        int iM8438a0 = AbstractC4178y.m8438a0(AbstractC4167n.m8429e1(iterable2));
        if (iM8438a0 < 16) {
            iM8438a0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM8438a0);
        for (Object obj2 : iterable2) {
            linkedHashMap.put(((WeChatContact) obj2).wxId, obj2);
        }
        C1624a c1624aConversations = WeChatApis.conversations();
        ArrayList arrayListM4144c = c1624aConversations != null ? c1624aConversations.m4144c() : null;
        if (arrayListM4144c != null) {
            iterable = arrayListM4144c;
        }
        ArrayList arrayList3 = new ArrayList(AbstractC4167n.m8429e1(iterable));
        int i9 = 0;
        for (Object obj3 : iterable) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                AbstractC0000a.m32Q0();
                throw null;
            }
            arrayList3.add(new C3958e(((C2527b) obj3).f8167a, Integer.valueOf(i9)));
            i9 = i10;
        }
        Map mapM8442e0 = AbstractC4178y.m8442e0(arrayList3);
        ArrayList arrayList4 = new ArrayList(AbstractC4167n.m8429e1(listM8407P1));
        for (String str : listM8407P1) {
            WeChatContact weChatContact = (WeChatContact) linkedHashMap.get(str);
            boolean z9 = (weChatContact != null && weChatContact.isGroup()) || AbstractC3156t.m6733W(str, "@chatroom", false) || AbstractC3156t.m6733W(str, "@im.chatroom", false);
            String strDisplayName = weChatContact != null ? weChatContact.displayName() : null;
            if (strDisplayName == null) {
                strDisplayName = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (AbstractC3149m.m6721t0(strDisplayName)) {
                C1624a c1624aConversations2 = WeChatApis.conversations();
                strDisplayName = c1624aConversations2 != null ? c1624aConversations2.m4143b(str) : null;
                if (strDisplayName == null) {
                    strDisplayName = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                if (AbstractC3149m.m6721t0(strDisplayName)) {
                    strDisplayName = str;
                }
            }
            String str2 = weChatContact != null ? weChatContact.avatarUrl : null;
            if (str2 == null) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            String str3 = weChatContact != null ? weChatContact.avatarBackupUrl : null;
            if (str3 == null) {
                str3 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            boolean zM6740d0 = AbstractC3156t.m6740d0(str, "gh_", false);
            ArrayList arrayListM103z0 = AbstractC0000a.m103z0(weChatContact != null ? weChatContact.nickname : null, weChatContact != null ? weChatContact.remarkName : null, weChatContact != null ? weChatContact.customWxId : null);
            ArrayList arrayList5 = new ArrayList();
            for (Object obj4 : arrayListM103z0) {
                if (!AbstractC3149m.m6721t0((String) obj4)) {
                    arrayList5.add(obj4);
                }
            }
            arrayList4.add(new C5026jv(str, strDisplayName, z9, str2, str3, null, zM6740d0, arrayList5, 32));
        }
        return AbstractC4166m.m8402K1(arrayList4, new C0415a0(new C0505z(mapM8442e0, 0), 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static C0414a m1405c(Activity activity, String str) {
        Object next;
        Iterator it = AbstractC0473o2.m1485i(activity).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC1416l.m3825a(((C0414a) next).f1179a, str)) {
                break;
            }
        }
        C0414a c0414a = (C0414a) next;
        if (c0414a != null) {
            return c0414a;
        }
        m1410h(activity, "聊天分组不存在");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m1406d(Activity activity, String str, String str2, InterfaceC1231l interfaceC1231l, InterfaceC1231l interfaceC1231l2) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        f1203b.execute(new RunnableC0496w(interfaceC1231l, atomicBoolean, str, C5491y2.m9813X1(activity, new C0493v(atomicBoolean, 0), str, str2), activity, interfaceC1231l2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m1407e(Activity activity, String str, boolean z9, C0035c c0035c) {
        List listM1403a = m1403a(activity, str);
        if (listM1403a.isEmpty()) {
            m1410h(activity, "当前分组没有会话");
        } else {
            String str2 = z9 ? "开启消息免打扰" : "解除消息免打扰";
            C5491y2.m9803S1(activity, str2, AbstractC0921a.m2250m(listM1403a.size(), "将对当前分组及子分组内 ", " 个会话执行此操作。"), new C0490u(activity, str2, listM1403a, z9, c0035c), new C0315c(6), EnumC5092lv.f18824j);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static void m1408f(Activity activity, List list, String str, String str2, boolean z9, InterfaceC1231l interfaceC1231l) {
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC2091b.m5171r((String) it.next(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!AbstractC3149m.m6721t0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        List listM8407P1 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList2));
        if (listM8407P1.isEmpty()) {
            m1410h(activity, "没有可选择的会话");
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        f1203b.execute(new RunnableC0462m(listM8407P1, atomicBoolean2, C5491y2.m9813X1(activity, new C0442h(atomicBoolean2, atomicBoolean, 0), str, "正在载入会话..."), activity, atomicBoolean, interfaceC1231l, str, str2, z9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static void m1409g(Activity activity, String str, C0035c c0035c) {
        C0414a c0414aM1405c = m1405c(activity, str);
        if (c0414aM1405c != null) {
            boolean zM1947d = AbstractC0754o.m1947d(activity, C0429d2.m1421F(str));
            String str2 = c0414aM1405c.f1180b;
            C5491y2.m9811W1(activity, "设置", str2, AbstractC0000a.m101y0(new C3958e("主页置顶", c0414aM1405c.f1185g ? "已开启" : "已关闭"), new C3958e("自定义头像", zM1947d ? "已设置" : "未设置"), new C3958e("命名", str2), new C3958e("显示未读数字", c0414aM1405c.f1187i ? "已开启" : "已关闭"), new C3958e("预览最新一条消息", c0414aM1405c.f1188j ? "已开启" : "已关闭"), new C3958e("显示无消息", c0414aM1405c.f1190l ? "已开启" : "已关闭")), new C0466n(activity, c0414aM1405c, c0035c, str, 1), new C0315c(6));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static void m1410h(Activity activity, String str) {
        f1202a.post(new RunnableC0487t(activity, str, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m1411i(Activity activity, C0502y c0502y) {
        String strM1020i;
        boolean z9 = c0502y.f1536d;
        String str = c0502y.f1535c;
        if (z9) {
            strM1020i = AbstractC0255e.m1020i(str, "失败");
        } else {
            int i9 = c0502y.f1533a;
            int i10 = c0502y.f1534b;
            if (i9 == i10) {
                strM1020i = str + "完成: " + i9 + "/" + i10;
            } else {
                strM1020i = str + "部分完成: " + i9 + "/" + i10;
            }
        }
        m1410h(activity, strM1020i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static void m1412j(Activity activity, C0414a c0414a, InterfaceC1220a interfaceC1220a) {
        boolean zM1497u = AbstractC0473o2.m1497u(activity, c0414a);
        m1410h(activity, zM1497u ? "设置已保存" : "保存设置失败");
        if (zM1497u) {
            interfaceC1220a.invoke();
        }
    }
}
