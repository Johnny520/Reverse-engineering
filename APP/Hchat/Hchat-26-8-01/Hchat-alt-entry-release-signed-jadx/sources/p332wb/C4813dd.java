package p332wb;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.os.PowerManager;
import android.widget.Toast;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import okhttp3.HttpUrl;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1220a;
import p096g8.C1368i;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatContact;
import p117i0.InterfaceC1809a1;
import p261rb.C3785a;
import p261rb.C3792h;
import p261rb.C3794j;
import p261rb.C3795k;
import p261rb.C3797m;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p330w9.C4689a;
import tf.AbstractC4156d0;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.C4173t;

/* JADX INFO: renamed from: wb.dd */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4813dd implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f16599g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Context f16600h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f16601i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4813dd(Context context, InterfaceC1809a1 interfaceC1809a1) {
        this.f16599g = 8;
        this.f16601i = interfaceC1809a1;
        this.f16600h = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0294 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p085fg.InterfaceC1220a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        C3785a c3785aM3182I;
        Object c3959f;
        Object c3959f2;
        PowerManager powerManager;
        C3785a c3785a;
        ScheduledFuture scheduledFuture;
        switch (this.f16599g) {
            case 0:
                AbstractC4955ho.m9527d5(this.f16600h, "Hchat 纬度", (String) this.f16601i.getValue());
                break;
            case 1:
                AbstractC4955ho.m9527d5(this.f16600h, "Hchat 经度", (String) this.f16601i.getValue());
                break;
            case 2:
                Context context = this.f16600h;
                this.f16601i.setValue(Boolean.valueOf(C4689a.m9198b(context)));
                Toast.makeText(context, "状态已刷新", 0).show();
                break;
            case 3:
                Context context2 = this.f16600h;
                InterfaceC1809a1 interfaceC1809a1 = this.f16601i;
                C4689a.m9197a(context2, null);
                interfaceC1809a1.setValue(Boolean.valueOf(C4689a.m9198b(context2)));
                Toast.makeText(context2, "已应用", 0).show();
                break;
            case 4:
                Context context3 = this.f16600h;
                this.f16601i.setValue("提醒,搜一搜,收藏");
                Toast.makeText(context3, "已恢复默认，保存后生效", 0).show();
                break;
            case 5:
                Context context4 = this.f16600h;
                InterfaceC1809a1 interfaceC1809a12 = this.f16601i;
                Activity activity = context4 instanceof Activity ? (Activity) context4 : null;
                if (activity == null) {
                    Toast.makeText(context4, "当前页面无法打开铃声选择器", 0).show();
                } else {
                    C5417vq.f21502a.m9756d(activity, (String) interfaceC1809a12.getValue(), new C5227q1(context4, interfaceC1809a12, 3));
                }
                return C3967n.f12976a;
            case 6:
                Context context5 = this.f16600h;
                InterfaceC1809a1 interfaceC1809a13 = this.f16601i;
                Activity activity2 = context5 instanceof Activity ? (Activity) context5 : null;
                if (activity2 == null) {
                    Toast.makeText(context5, "当前页面无法打开文件选择器", 0).show();
                } else {
                    C5417vq.f21502a.m9755c(activity2, new C5227q1(context5, interfaceC1809a13, 4));
                }
                return C3967n.f12976a;
            case 7:
                Context context6 = this.f16600h;
                this.f16601i.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                Toast.makeText(context6, "铃声已清空，保存后生效", 0).show();
                break;
            case 8:
                InterfaceC1809a1 interfaceC1809a14 = this.f16601i;
                Context context7 = this.f16600h;
                if (((C3797m) interfaceC1809a14.getValue()).f12467b || ((C3797m) interfaceC1809a14.getValue()).f12474i) {
                    c3785aM3182I = AbstractC1184v0.m3182I();
                } else {
                    C3795k c3795k = AbstractC1184v0.f3987a;
                    if (c3795k == null) {
                        c3785aM3182I = new C3785a(false, "检测运行时尚未就绪");
                    } else if (!c3795k.f12443c.f12465a.getBoolean("zombie_check_enable", false)) {
                        c3785aM3182I = new C3785a(false, "请先启用僵尸粉检测");
                    } else if (!c3795k.f12452l || c3795k.f12451k == null) {
                        c3785aM3182I = new C3785a(false, "检测接口尚未就绪");
                    } else {
                        synchronized (c3795k.f12444d) {
                            if (c3795k.f12453m) {
                                c3785aM3182I = new C3785a(false, "检测正在运行");
                            } else if (c3795k.f12459s) {
                                c3785aM3182I = new C3785a(false, "正在批量删除好友");
                            } else {
                                try {
                                    C1368i c1368iContacts = WeChatApis.contacts();
                                    c3959f = c1368iContacts != null ? c1368iContacts.m3713U("SELECT r.username, r.alias, r.conRemark, r.nickname, r.encryptUsername, r.type, r.lvbuff AS lvbuff, i.reserved1 AS avatarUrl, i.reserved2 AS avatarBackupUrl FROM rcontact r LEFT JOIN img_flag i ON r.username = i.username WHERE (r.encryptUsername!='' OR r.username=(SELECT value FROM userinfo WHERE id=2)) AND r.verifyFlag=0 AND (r.type & 1)!=0 AND (r.type & 8)=0 AND (r.type & 32)=0 AND r.username NOT LIKE '%chatroom'", null) : null;
                                    if (c3959f == null) {
                                        c3959f = C4173t.f13710g;
                                    }
                                } catch (Throwable th2) {
                                    c3959f = new C3959f(th2);
                                }
                                Throwable thM8182b = C3960g.m8182b(c3959f);
                                if (thM8182b == null) {
                                    List<WeChatContact> list = (List) c3959f;
                                    ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list));
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((WeChatContact) it.next()).wxId);
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Object obj : arrayList) {
                                        if (C3795k.m7974g((String) obj)) {
                                            arrayList2.add(obj);
                                        }
                                    }
                                    Set setM8412U1 = AbstractC4166m.m8412U1(arrayList2);
                                    Set setM7989c = c3795k.f12443c.m7989c("zombie_check_excluded_ids");
                                    for (WeChatContact weChatContact : list) {
                                        c3795k.f12450j.put(weChatContact.wxId, weChatContact.displayName());
                                    }
                                    synchronized (c3795k.f12444d) {
                                        if (c3795k.f12447g.isEmpty()) {
                                            Set setM7989c2 = c3795k.f12443c.m7989c("zombie_check_target_ids");
                                            if (!setM7989c2.isEmpty()) {
                                                setM8412U1 = AbstractC4166m.m8426x1(setM7989c2, setM8412U1);
                                            }
                                            Set setM8352T = AbstractC4156d0.m8352T(setM8412U1, setM7989c);
                                            if (setM8352T.isEmpty()) {
                                                c3785aM3182I = new C3785a(false, "没有可检测的好友");
                                            } else {
                                                c3795k.f12448h.clear();
                                                Iterator it2 = setM8352T.iterator();
                                                while (it2.hasNext()) {
                                                    c3795k.f12447g.addLast(new C3794j((String) it2.next(), 0));
                                                }
                                                c3795k.f12456p = c3795k.f12447g.size();
                                                c3795k.f12453m = true;
                                                c3795k.f12454n = "检测运行中";
                                                c3795k.f12455o = HttpUrl.FRAGMENT_ENCODE_SET;
                                                c3795k.m7976b("开始检测，待检测 " + c3795k.f12447g.size() + " 位好友");
                                                c3795k.m7981h();
                                                if (c3795k.f12443c.f12465a.getBoolean("zombie_check_keep_awake", false)) {
                                                    try {
                                                        Object systemService = c3795k.f12442b.getSystemService("power");
                                                        powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
                                                    } catch (Throwable th3) {
                                                        c3959f2 = new C3959f(th3);
                                                    }
                                                    if (powerManager != null) {
                                                        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "Hchat:ZombieCheck");
                                                        wakeLockNewWakeLock.setReferenceCounted(false);
                                                        wakeLockNewWakeLock.acquire(3600000L);
                                                        c3795k.f12464x = wakeLockNewWakeLock;
                                                        c3959f2 = C3967n.f12976a;
                                                        Throwable thM8182b2 = C3960g.m8182b(c3959f2);
                                                        if (thM8182b2 != null) {
                                                            c3795k.f12441a.invoke("申请僵尸粉检测 WakeLock 失败", thM8182b2);
                                                        }
                                                    }
                                                }
                                                c3795k.m7986m();
                                                c3795k.m7984k(0L);
                                                c3785aM3182I = new C3785a(true, "检测已开始");
                                            }
                                        } else {
                                            ArrayDeque arrayDeque = c3795k.f12447g;
                                            ArrayList arrayList3 = new ArrayList();
                                            for (Object obj2 : arrayDeque) {
                                                C3794j c3794j = (C3794j) obj2;
                                                if (setM8412U1.contains(c3794j.f12439a) && !setM7989c.contains(c3794j.f12439a)) {
                                                    arrayList3.add(obj2);
                                                }
                                            }
                                            c3795k.f12447g.clear();
                                            ArrayDeque arrayDeque2 = c3795k.f12447g;
                                            Iterator it3 = arrayList3.iterator();
                                            while (it3.hasNext()) {
                                                arrayDeque2.addLast((C3794j) it3.next());
                                            }
                                            c3795k.f12456p = c3795k.f12447g.size() + c3795k.f12448h.size();
                                            if (c3795k.f12447g.isEmpty()) {
                                                c3785aM3182I = new C3785a(false, "没有可继续的好友");
                                            }
                                            c3795k.f12453m = true;
                                            c3795k.f12454n = "检测运行中";
                                            c3795k.f12455o = HttpUrl.FRAGMENT_ENCODE_SET;
                                            c3795k.m7976b("开始检测，待检测 " + c3795k.f12447g.size() + " 位好友");
                                            c3795k.m7981h();
                                            if (c3795k.f12443c.f12465a.getBoolean("zombie_check_keep_awake", false)) {
                                            }
                                            c3795k.m7986m();
                                            c3795k.m7984k(0L);
                                            c3785aM3182I = new C3785a(true, "检测已开始");
                                        }
                                    }
                                } else {
                                    c3795k.f12441a.invoke("读取好友列表失败", thM8182b);
                                    c3785aM3182I = new C3785a(false, "读取好友列表失败");
                                }
                            }
                        }
                    }
                }
                AbstractC4955ho.m9670t4(context7, interfaceC1809a14, c3785aM3182I);
                break;
            default:
                Context context8 = this.f16600h;
                InterfaceC1809a1 interfaceC1809a15 = this.f16601i;
                C3795k c3795k2 = AbstractC1184v0.f3987a;
                if (c3795k2 != null) {
                    synchronized (c3795k2.f12444d) {
                        try {
                            c3795k2.f12453m = false;
                            c3795k2.f12459s = false;
                            c3795k2.f12458r++;
                            C3792h c3792h = c3795k2.f12457q;
                            if (c3792h != null && (scheduledFuture = c3792h.f12436c) != null) {
                                scheduledFuture.cancel(false);
                            }
                            c3795k2.f12457q = null;
                            c3795k2.f12447g.clear();
                            c3795k2.f12448h.clear();
                            c3795k2.f12449i.clear();
                            c3795k2.f12450j.clear();
                            c3795k2.f12456p = 0;
                            c3795k2.f12460t = 0;
                            c3795k2.f12461u = 0;
                            c3795k2.f12462v = 0;
                            c3795k2.f12463w = 0;
                            c3795k2.f12455o = HttpUrl.FRAGMENT_ENCODE_SET;
                            c3795k2.f12454n = "等待检测";
                            c3795k2.f12443c.f12465a.edit().remove("zombie_check_pending_ids").remove("zombie_check_total_count").remove("zombie_check_results").apply();
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    c3795k2.m7983j();
                    try {
                        Object systemService2 = c3795k2.f12442b.getSystemService("notification");
                        NotificationManager notificationManager = systemService2 instanceof NotificationManager ? (NotificationManager) systemService2 : null;
                        if (notificationManager != null) {
                            notificationManager.cancel(1212373571);
                        }
                        break;
                    } catch (Throwable unused) {
                    }
                    c3785a = new C3785a(true, "检测进度已重置");
                } else {
                    c3785a = new C3785a(false, "检测运行时尚未就绪");
                }
                AbstractC4955ho.m9670t4(context8, interfaceC1809a15, c3785a);
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4813dd(Context context, InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f16599g = i9;
        this.f16600h = context;
        this.f16601i = interfaceC1809a1;
    }
}
