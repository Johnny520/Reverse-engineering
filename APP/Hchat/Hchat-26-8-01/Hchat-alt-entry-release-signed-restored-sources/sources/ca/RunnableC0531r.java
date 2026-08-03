package ca;

import android.app.Activity;
import bi.C0315c;
import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p002a1.RunnableC0006d;
import p011ab.C0042b;
import p096g8.C1368i;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.ContactLabelBean;
import p099h.Hchat.hooks.items.script.ScriptWaBridge;
import p108ha.C1635c0;
import p108ha.C1644h;
import p108ha.EnumC1637d0;
import p108ha.EnumC1660t;
import p198nb.C2954w;
import p210o8.C3086j;
import p218og.AbstractC3149m;
import p219oh.AbstractC3165h;
import p230p8.C3351d0;
import p230p8.C3370v;
import p259r9.AbstractC3754e0;
import p261rb.C3787c;
import p261rb.C3788d;
import p261rb.C3795k;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;
import p332wb.C5491y2;
import p332wb.EnumC5092lv;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.C4173t;

/* JADX INFO: renamed from: ca.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0531r implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1656g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ long f1657h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f1658i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f1659j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0531r(long j3, C2954w c2954w, String str) {
        this.f1656g = 3;
        this.f1657h = j3;
        this.f1658i = c2954w;
        this.f1659j = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0150  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object c3959f;
        boolean zContains;
        long j3;
        Object c3959f2;
        String strM3716a;
        Object c3959f3;
        Object c3959f4;
        Object c3959f5;
        boolean zBooleanValue;
        switch (this.f1656g) {
            case 0:
                Activity activity = (Activity) this.f1658i;
                C0517e0 c0517e0 = (C0517e0) this.f1659j;
                long j4 = this.f1657h;
                if (activity.isFinishing() || activity.isDestroyed()) {
                    return;
                }
                c0517e0.getClass();
                C5491y2.m9799Q1(activity, "转发[H]", HttpUrl.FRAGMENT_ENCODE_SET, AbstractC0000a.m101y0(new C3958e("转发到朋友圈", HttpUrl.FRAGMENT_ENCODE_SET), new C3958e("转发给好友", HttpUrl.FRAGMENT_ENCODE_SET), new C3958e("分享", HttpUrl.FRAGMENT_ENCODE_SET), new C3958e("群发助手", HttpUrl.FRAGMENT_ENCODE_SET), new C3958e("转发至标签", HttpUrl.FRAGMENT_ENCODE_SET)), new C0522i(c0517e0, activity, j4, 0), new C0315c(7), EnumC5092lv.f18824j);
                return;
            case 1:
                ScriptWaBridge.delay$lambda$1((ScriptWaBridge) this.f1658i, this.f1657h, (RunnableC0006d) this.f1659j);
                return;
            case 2:
                C1644h c1644h = (C1644h) this.f1658i;
                Object obj = this.f1659j;
                long j5 = this.f1657h;
                C0042b c0042b = c1644h.f5395a;
                if (c1644h.m4185g(j5)) {
                    C3351d0 c3351d0SnsApi = WeChatApis.snsApi();
                    if (c3351d0SnsApi == null) {
                        c0042b.invoke("朋友圈自动转发 API 未就绪", null);
                        return;
                    }
                    try {
                        c3959f = AbstractC3165h.m6799z(obj, c3351d0SnsApi);
                        break;
                    } catch (Throwable th2) {
                        c3959f = new C3959f(th2);
                    }
                    Throwable thM8182b = C3960g.m8182b(c3959f);
                    if (thM8182b != null) {
                        c0042b.invoke("解析朋友圈记录失败", thM8182b);
                    }
                    if (c3959f instanceof C3959f) {
                        c3959f = null;
                    }
                    C1635c0 c1635c0 = (C1635c0) c3959f;
                    if (c1635c0 != null) {
                        String str = c1635c0.f5350a;
                        synchronized (c1644h.f5400f) {
                            zContains = c1644h.f5402h.contains(str);
                        }
                        if (zContains || c1644h.f5403i.containsKey(str)) {
                            return;
                        }
                        String strM4194q = c1644h.m4194q(c1635c0);
                        if (strM4194q != null && !strM4194q.equals("暂时无法确认当前账号")) {
                            c1644h.m4187i("忽略 " + c1644h.m4180b(c1635c0.f5352c) + "：" + strM4194q);
                            return;
                        }
                        C3370v c3370vM7139u = c1644h.f5397c.m7139u(obj);
                        if (c3370vM7139u == null) {
                            c0042b.invoke("暂时无法解析朋友圈原生内容: snsId=".concat(str), null);
                            return;
                        }
                        int i9 = c3370vM7139u.f10881c;
                        EnumC1660t enumC1660t = i9 == 54 ? EnumC1660t.LIVE_PHOTO : i9 == 1 ? EnumC1660t.IMAGE : (i9 == 5 || i9 == 15) ? EnumC1660t.VIDEO : (c1635c0.f5354e == EnumC1637d0.TEXT && c3370vM7139u.f10882d.isEmpty()) ? EnumC1660t.TEXT : EnumC1660t.UNKNOWN;
                        String strM4192o = c1644h.m4192o(c1635c0, c3370vM7139u, enumC1660t);
                        if (strM4192o == null) {
                            c1644h.m4193p(c1635c0, c3370vM7139u, enumC1660t, j5, c1644h.m4190l());
                            return;
                        } else if (strM4192o.equals("暂时无法确认当前账号")) {
                            c1644h.m4193p(c1635c0, c3370vM7139u, enumC1660t, j5, c1644h.m4190l());
                            return;
                        } else {
                            c1644h.m4182d(c1635c0, j5, strM4192o);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 3:
                long j10 = this.f1657h;
                C2954w c2954w = (C2954w) this.f1658i;
                String str2 = (String) this.f1659j;
                if (j10 == c2954w.f9682i && c2954w.f9681h) {
                    c2954w.f9683j = null;
                    if (AbstractC3149m.m6721t0(str2)) {
                        str2 = "系统默认";
                    }
                    c2954w.m6371v(new IllegalStateException("引擎 " + ((Object) str2) + " 初始化超时"));
                    return;
                }
                return;
            case 4:
                ((C3086j) this.f1658i).m6551b(this.f1657h, (String) this.f1659j);
                return;
            default:
                C3795k c3795k = (C3795k) this.f1658i;
                C3788d c3788d = (C3788d) this.f1659j;
                long j11 = this.f1657h;
                if (c3795k.f12443c.f12465a.getBoolean("zombie_check_auto_tag", true)) {
                    String str3 = c3788d.f12418a;
                    String string = c3795k.f12443c.f12465a.getString("zombie_check_label_name", "僵尸粉");
                    if (string == null) {
                        string = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    String string2 = AbstractC3149m.m6703R0(string).toString();
                    String str4 = AbstractC3149m.m6721t0(string2) ? "僵尸粉" : string2;
                    Object obj2 = C4173t.f13710g;
                    if (c3795k.m7975a(j11)) {
                        C1368i c1368iContacts = WeChatApis.contacts();
                        if (c1368iContacts != null) {
                            try {
                                c3959f2 = c1368iContacts.m3727p();
                            } catch (Throwable th3) {
                                c3959f2 = new C3959f(th3);
                            }
                            if (c3959f2 instanceof C3959f) {
                                c3959f2 = obj2;
                            }
                            List list = (List) c3959f2;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj3 : list) {
                                if (((ContactLabelBean) obj3).userNameList.contains(str3)) {
                                    arrayList.add(obj3);
                                }
                            }
                            j3 = 1000;
                            ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(arrayList));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((ContactLabelBean) it.next()).labelName);
                            }
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj4 : arrayList2) {
                                if (!AbstractC3149m.m6721t0((String) obj4)) {
                                    arrayList3.add(obj4);
                                }
                            }
                            Set setM8411T1 = AbstractC4166m.m8411T1(arrayList3);
                            if (list.isEmpty()) {
                                strM3716a = c1368iContacts.m3716a(str4);
                                strM3716a.getClass();
                                if (!AbstractC3149m.m6721t0(strM3716a)) {
                                    int i10 = 0;
                                    while (i10 < 15) {
                                        if (!list.isEmpty()) {
                                            Iterator it2 = list.iterator();
                                            while (it2.hasNext()) {
                                                if (AbstractC1416l.m3825a(((ContactLabelBean) it2.next()).labelName, str4)) {
                                                    if (!list.isEmpty()) {
                                                        Iterator it3 = list.iterator();
                                                        while (true) {
                                                            if (it3.hasNext()) {
                                                                if (AbstractC1416l.m3825a(((ContactLabelBean) it3.next()).labelName, str4)) {
                                                                    if (c3795k.m7975a(j11)) {
                                                                        setM8411T1.add(str4);
                                                                        try {
                                                                            c3959f4 = Boolean.valueOf(c1368iContacts.m3709P(str3, AbstractC4166m.m8407P1(setM8411T1)));
                                                                        } catch (Throwable th4) {
                                                                            c3959f4 = new C3959f(th4);
                                                                        }
                                                                        Object obj5 = Boolean.FALSE;
                                                                        if (c3959f4 instanceof C3959f) {
                                                                            c3959f4 = obj5;
                                                                        }
                                                                        if (((Boolean) c3959f4).booleanValue()) {
                                                                            try {
                                                                                c3959f5 = Boolean.valueOf(c1368iContacts.m3702C(str3, str4));
                                                                            } catch (Throwable th5) {
                                                                                c3959f5 = new C3959f(th5);
                                                                            }
                                                                            Object obj6 = Boolean.FALSE;
                                                                            if (c3959f5 instanceof C3959f) {
                                                                                c3959f5 = obj6;
                                                                            }
                                                                            zBooleanValue = ((Boolean) c3959f5).booleanValue();
                                                                            break;
                                                                        }
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        i10++;
                                        if (c3795k.m7975a(j11)) {
                                            try {
                                                Thread.sleep(1000L);
                                                break;
                                            } catch (Throwable unused) {
                                            }
                                            try {
                                                c3959f3 = c1368iContacts.m3727p();
                                            } catch (Throwable th6) {
                                                c3959f3 = new C3959f(th6);
                                            }
                                            if (c3959f3 instanceof C3959f) {
                                                c3959f3 = obj2;
                                            }
                                            list = (List) c3959f3;
                                            break;
                                        }
                                    }
                                    if (!list.isEmpty()) {
                                    }
                                }
                            } else {
                                Iterator it4 = list.iterator();
                                while (it4.hasNext()) {
                                    if (AbstractC1416l.m3825a(((ContactLabelBean) it4.next()).labelName, str4)) {
                                        if (!list.isEmpty()) {
                                        }
                                    }
                                }
                                strM3716a = c1368iContacts.m3716a(str4);
                                strM3716a.getClass();
                                if (!AbstractC3149m.m6721t0(strM3716a)) {
                                }
                            }
                        } else {
                            j3 = 1000;
                        }
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = false;
                        j3 = 1000;
                    }
                    synchronized (c3795k.f12444d) {
                        try {
                            c3795k.m7976b(c3788d.f12419b + ": " + (zBooleanValue ? "已追加标签" : "标签处理失败"));
                        } catch (Throwable th7) {
                            throw th7;
                        }
                    }
                    break;
                } else {
                    j3 = 1000;
                }
                if (c3795k.f12443c.f12465a.getBoolean("zombie_check_auto_delete", false)) {
                    long jM7909r = AbstractC3754e0.m7909r(c3795k.f12443c.f12465a.getInt("zombie_check_delete_delay_seconds", 3), 0, 300);
                    if (jM7909r > 0) {
                        try {
                            Thread.sleep(jM7909r * j3);
                            break;
                        } catch (Throwable unused2) {
                        }
                    }
                    if (c3795k.f12443c.f12465a.getBoolean("zombie_check_auto_delete", false) && c3795k.m7975a(j11)) {
                        C3787c c3787c = c3795k.f12451k;
                        boolean z9 = c3787c != null ? c3787c.m7968b(c3788d.f12418a, c3795k.f12443c.f12465a.getBoolean("zombie_check_clear_record", false)) : false;
                        synchronized (c3795k.f12444d) {
                            try {
                                c3795k.m7976b(c3788d.f12419b + ": " + (z9 ? "已提交删除好友" : "删除好友失败"));
                            } catch (Throwable th8) {
                                throw th8;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ RunnableC0531r(ScriptWaBridge scriptWaBridge, long j3, RunnableC0006d runnableC0006d) {
        this.f1656g = 1;
        this.f1658i = scriptWaBridge;
        this.f1657h = j3;
        this.f1659j = runnableC0006d;
    }

    public /* synthetic */ RunnableC0531r(Object obj, Object obj2, long j3, int i9) {
        this.f1656g = i9;
        this.f1658i = obj;
        this.f1659j = obj2;
        this.f1657h = j3;
    }
}
