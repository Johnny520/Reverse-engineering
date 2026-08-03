package ac;

import af.C0081d;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.view.ActionMode;
import android.widget.Toast;
import bi.C0315c;
import ca.C0517e0;
import ca.C0521h;
import ch.C0570e;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import gg.AbstractC1416l;
import gg.C1423s;
import gg.C1424t;
import gg.C1425u;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;
import org.luckypray.dexkit.DexKitBridge;
import p000a.AbstractC0000a;
import p007a7.AbstractC0018a;
import p010aa.C0035c;
import p011ab.C0042b;
import p015b0.ActionModeCallbackC0158x;
import p015b0.C0137e;
import p015b0.C0139f;
import p015b0.C0142h;
import p025bc.AbstractC0255e;
import p036c9.AbstractC0473o2;
import p036c9.C0414a;
import p036c9.C0418b;
import p036c9.C0419b0;
import p036c9.C0422c;
import p036c9.C0426d;
import p036c9.C0429d2;
import p036c9.C0430e;
import p036c9.C0437f2;
import p036c9.C0452j1;
import p036c9.C0477p2;
import p036c9.C0490u;
import p036c9.RunnableC0487t;
import p037cb.C0545f;
import p048d8.C0739b;
import p051db.C0765c;
import p063e9.C0832c;
import p063e9.C0841l;
import p063e9.C0846q;
import p068eh.AbstractC0921a;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p086fh.C1253k;
import p092g4.AbstractC1341a;
import p096g8.C1368i;
import p097g9.C1373b;
import p097g9.C1375d;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;
import p099h.Hchat.hooks.items.script.ScriptMessageBean;
import p099h.Hchat.hooks.items.script.ScriptPluginBridge;
import p099h.Hchat.hooks.items.script.ScriptPluginRuntime;
import p099h.Hchat.utils.KavaReflector;
import p106h8.C1624a;
import p109hb.C1695r;
import p109hb.C1697t;
import p115hh.C1730o;
import p115hh.C1731p;
import p126ia.C2016j;
import p126ia.C2023q;
import p126ia.C2026t;
import p129ig.AbstractC2043a;
import p136j8.C2095f;
import p136j8.C2105p;
import p136j8.C2110u;
import p136j8.C2114y;
import p153k8.C2343g;
import p154k9.C2361e;
import p154k9.C2362f;
import p154k9.C2364h;
import p162l3.C2457k;
import p162l3.C2458l;
import p162l3.C2464r;
import p162l3.C2465s;
import p174m.C2576b;
import p198nb.AbstractC2935f0;
import p198nb.C2946o;
import p198nb.C2954w;
import p213ob.C3121n;
import p218og.AbstractC3137a;
import p218og.AbstractC3149m;
import p218og.C3147k;
import p222p.AbstractC3199a;
import p230p8.C3356h;
import p230p8.C3357i;
import p230p8.C3360l;
import p243q9.C3468d;
import p243q9.C3470f;
import p243q9.C3471g;
import p244qb.C3487h;
import p244qb.C3488i;
import p244qb.C3490k;
import p259r9.AbstractC3754e0;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p332wb.AbstractC4855en;
import p332wb.C5491y2;
import p332wb.EnumC5092lv;
import p343x6.AbstractC5700d;
import tf.AbstractC4166m;
import tf.C4173t;

/* JADX INFO: renamed from: ac.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0059l implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f179g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f180h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f181i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f182j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0059l(Activity activity, List list, C1423s c1423s, C3490k c3490k) {
        this.f179g = 28;
        this.f180h = activity;
        this.f181i = list;
        this.f182j = c1423s;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:451:0x028e */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 0, expect 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0577, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x057b, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:460:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v47, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r4v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v49, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v51, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v58 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object c3959f;
        Object c0477p2;
        Throwable thM8182b;
        AbstractC0473o2 abstractC0473o2;
        boolean zInvokeSuccessfully;
        Object c3958e;
        Object obj;
        Object c1373b;
        String strM9263g;
        C2095f c2095f;
        Object objInvokeOrThrow;
        Object objM5019Y;
        C2114y c2114y;
        ?? c3959f2;
        Object objM4350r;
        Throwable thM8182b2;
        final C3471g c3471gM4328q;
        SharedPreferences sharedPreferences;
        String strM10259Q;
        List listM99x0;
        Object c3959f3;
        String strM9263g2;
        File file;
        int i9 = 2;
        switch (this.f179g) {
            case 0:
                ((SharedPreferences.OnSharedPreferenceChangeListener) this.f181i).onSharedPreferenceChanged((SharedPreferencesC0062o) this.f180h, (String) this.f182j);
                return;
            case 1:
                C0142h c0142h = (C0142h) this.f180h;
                C0137e c0137e = (C0137e) this.f181i;
                C0139f c0139f = (C0139f) this.f182j;
                ActionMode actionModeStartActionMode = c0142h.f367a.startActionMode(new ActionModeCallbackC0158x(c0137e), 1);
                AbstractC1416l.m3825a(c0142h.f374h, actionModeStartActionMode);
                if (actionModeStartActionMode == null) {
                    c0139f.close();
                    return;
                }
                return;
            case 2:
                Activity activity = (Activity) this.f180h;
                C0426d c0426d = (C0426d) this.f181i;
                C0477p2 c0477p22 = (C0477p2) this.f182j;
                if (activity.isFinishing() || activity.isDestroyed()) {
                    return;
                }
                c0426d.f1225c.invoke(c0477p22);
                return;
            case 3:
                Activity activity2 = (Activity) this.f180h;
                C0426d c0426d2 = (C0426d) this.f181i;
                Uri uri = (Uri) this.f182j;
                C0430e c0430e = C0430e.f1252a;
                try {
                    abstractC0473o2 = c0426d2.f1224b;
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                if (abstractC0473o2 instanceof C0418b) {
                    OutputStream outputStreamOpenOutputStream = activity2.getContentResolver().openOutputStream(uri, "wt");
                    if (outputStreamOpenOutputStream == null) {
                        throw new IllegalStateException("无法写入所选文件");
                    }
                    try {
                        byte[] bytes = ((C0418b) abstractC0473o2).f1201b.getBytes(AbstractC3137a.f10177a);
                        bytes.getClass();
                        outputStreamOpenOutputStream.write(bytes);
                        outputStreamOpenOutputStream.close();
                        c0477p2 = new C0477p2("聊天分组已导出", false);
                        thM8182b = C3960g.m8182b(c0477p2);
                        if (thM8182b != null) {
                            AbstractC1184v0.m3204n("[Hchat:ConversationGroup] 处理聊天分组文件失败: " + thM8182b.getMessage(), thM8182b);
                            String message = thM8182b.getMessage();
                            if (message == null) {
                                message = "处理聊天分组文件失败";
                            }
                            c0477p2 = new C0477p2(message, false);
                        }
                        c0426d2.m1415a((C0477p2) c0477p2);
                        return;
                    } finally {
                    }
                } else {
                    if (!abstractC0473o2.equals(C0422c.f1208b)) {
                        throw new C0081d();
                    }
                    C0437f2 c0437f2M1484h = AbstractC0473o2.m1484h(activity2, C0430e.m1449c(activity2, uri));
                    c3959f = new C0477p2(c0437f2M1484h.f1291c, c0437f2M1484h.f1289a);
                }
                c0477p2 = c3959f;
                thM8182b = C3960g.m8182b(c0477p2);
                if (thM8182b != null) {
                }
                c0426d2.m1415a((C0477p2) c0477p2);
                return;
            case 4:
                Activity activity3 = (Activity) this.f180h;
                String str = (String) this.f182j;
                C0035c c0035c = (C0035c) this.f181i;
                Handler handler = C0419b0.f1202a;
                C0419b0.m1409g(activity3, str, c0035c);
                return;
            case 5:
                Activity activity4 = (Activity) this.f180h;
                String str2 = (String) this.f182j;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f181i;
                C0452j1 c0452j1 = C0452j1.f1326a;
                C0452j1.m1459v(activity4, str2, interfaceC1220a);
                return;
            case 6:
                Activity activity5 = (Activity) this.f180h;
                Object obj2 = this.f181i;
                String str3 = (String) this.f182j;
                Iterator it = AbstractC0473o2.m1485i(activity5).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (C0429d2.m1421F(((C0414a) next).f1179a).equals(str3)) {
                            obj = next;
                        }
                    }
                }
                C0414a c0414a = (C0414a) obj;
                if (c0414a != null) {
                    C0429d2 c0429d2 = C0429d2.f1235a;
                    C0429d2.m1429h(activity5, c0414a.f1179a);
                    return;
                }
                C0429d2 c0429d22 = C0429d2.f1235a;
                Object field = KavaReflector.readField(obj2, "ui");
                if (field != null) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("finish_direct", false);
                    Class<?> cls = field.getClass();
                    Boolean bool = Boolean.TRUE;
                    zInvokeSuccessfully = KavaReflector.invokeSuccessfully(KavaReflector.findCompatibleMethod(cls, "startChatting", str3, bundle, bool), field, str3, bundle, bool);
                } else {
                    zInvokeSuccessfully = false;
                }
                if (zInvokeSuccessfully) {
                    return;
                }
                C1624a c1624aConversations = WeChatApis.conversations();
                if ((c1624aConversations != null ? !c1624aConversations.m4147h(str3) ? 0 : 1 : 0) == 0) {
                    AbstractC1184v0.m3203m("[Hchat:ConversationGroup] 打开分组内会话失败: talker=" + str3);
                    return;
                }
                return;
            case 7:
                Activity activity6 = (Activity) this.f180h;
                C0517e0 c0517e0 = (C0517e0) this.f181i;
                C1697t c1697t = (C1697t) this.f182j;
                if (activity6.isFinishing() || activity6.isDestroyed()) {
                    return;
                }
                c0517e0.getClass();
                C5491y2.m9799Q1(activity6, "转发[H]", HttpUrl.FRAGMENT_ENCODE_SET, AbstractC0000a.m101y0(new C3958e("转发到朋友圈", HttpUrl.FRAGMENT_ENCODE_SET), new C3958e("转发给好友", HttpUrl.FRAGMENT_ENCODE_SET), new C3958e("分享", HttpUrl.FRAGMENT_ENCODE_SET), new C3958e("群发助手", HttpUrl.FRAGMENT_ENCODE_SET), new C3958e("转发至标签", HttpUrl.FRAGMENT_ENCODE_SET)), new C0521h(c0517e0, activity6, c1697t, i), new C0315c(7), EnumC5092lv.f18824j);
                return;
            case 8:
                Activity activity7 = (Activity) this.f180h;
                C0517e0 c0517e02 = (C0517e0) this.f181i;
                Intent intent = (Intent) this.f182j;
                if (activity7.isFinishing() || activity7.isDestroyed()) {
                    return;
                }
                c0517e02.m1531q(activity7, intent);
                return;
            case 9:
                ((C0739b) this.f180h).f2199c.initModule((Application) this.f181i, (XC_LoadPackage.LoadPackageParam) this.f182j);
                return;
            case 10:
                C0545f c0545f = (C0545f) this.f180h;
                C0765c c0765c = (C0765c) this.f181i;
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f182j;
                try {
                    c3958e = c0545f.m1556t(c0765c);
                    break;
                } finally {
                }
                Throwable thM8182b3 = C3960g.m8182b(c3958e);
                if (thM8182b3 != null) {
                    ((C0042b) c0545f.f1721d).invoke("定时任务执行异常", thM8182b3);
                    c3958e = new C3958e(0, Integer.valueOf(C0545f.m1535b(c0765c)));
                }
                C3958e c3958e2 = (C3958e) c3958e;
                c0545f.m1546d(c0765c, ((Number) c3958e2.f12961g).intValue(), ((Number) c3958e2.f12962h).intValue());
                return;
            case 11:
                Context context = (Context) this.f180h;
                C0832c c0832c = (C0832c) this.f181i;
                C0841l c0841l = (C0841l) this.f182j;
                try {
                    AtomicBoolean atomicBoolean = C0846q.f2580a;
                    C0846q.m2141z(context, c0832c, c0841l);
                    obj = C3967n.f12976a;
                    break;
                } catch (Throwable th3) {
                }
                Throwable thM8182b4 = C3960g.m8182b(obj);
                if (thM8182b4 != null) {
                    AbstractC0921a.m2261x("[Hchat:CustomNotification] 转发微信原生通知失败: ", thM8182b4.getMessage(), thM8182b4);
                    return;
                }
                return;
            case 12:
                ScriptPluginBridge.showOnMain$lambda$0((Activity) this.f180h, (ScriptPluginBridge) this.f181i, (InterfaceC1231l) this.f182j);
                return;
            case 13:
                ScriptPluginRuntime.dispatchOnImageDownload$lambda$2((ScriptPluginBridge) this.f180h, (ScriptMessageBean) this.f181i, this.f182j);
                return;
            case 14:
                C1375d c1375d = (C1375d) this.f180h;
                Activity activity8 = (Activity) this.f181i;
                String str4 = (String) this.f182j;
                try {
                    C2105p c2105pMedia = WeChatApis.media();
                    byte[] bArrM5203c = (c2105pMedia == null || (c2095f = c2105pMedia.f7038d) == null) ? null : c2095f.m5203c(str4);
                    if (bArrM5203c == null || bArrM5203c.length == 0) {
                        c1373b = new C1373b(null, "表情文件不存在或尚未下载");
                    } else {
                        File fileM3747a = c1375d.m3747a(bArrM5203c);
                        c1373b = fileM3747a != null ? !C1375d.m3746f(fileM3747a, bArrM5203c) ? new C1373b(null, "表情保存失败") : new C1373b(fileM3747a, HttpUrl.FRAGMENT_ENCODE_SET) : new C1373b(null, "创建保存目录失败");
                    }
                } catch (Throwable th4) {
                }
                Throwable thM8182b5 = C3960g.m8182b(c1373b);
                if (thM8182b5 != null) {
                    c1375d.f4566b.invoke("保存表情失败", thM8182b5);
                    c1373b = new C1373b(null, "表情保存失败");
                }
                C1373b c1373b2 = (C1373b) c1373b;
                File file2 = c1373b2.f4559a;
                if (file2 != null) {
                    strM9263g = AbstractC4855en.m9263g("表情已保存: ", file2.getAbsolutePath());
                } else {
                    String str5 = c1373b2.f4560b;
                    strM9263g = AbstractC3149m.m6721t0(str5) ? "表情保存失败" : str5;
                }
                c1375d.f4568d.post(new RunnableC0487t(activity8, strM9263g, 5));
                return;
            case 15:
                Activity activity9 = (Activity) this.f180h;
                C0490u c0490u = (C0490u) this.f181i;
                List list = (List) this.f182j;
                if (activity9.isFinishing() || activity9.isDestroyed()) {
                    return;
                }
                c0490u.invoke(list);
                return;
            case 16:
                Activity activity10 = (Activity) this.f180h;
                List list2 = (List) this.f181i;
                C2016j c2016j = (C2016j) this.f182j;
                if (activity10.isFinishing() || activity10.isDestroyed()) {
                    return;
                }
                if (list2.isEmpty()) {
                    C2023q.m4975j(activity10, "没有可选择的好友");
                    return;
                } else {
                    c2016j.invoke(list2);
                    return;
                }
            case 17:
                Method method = (Method) this.f180h;
                Object obj3 = this.f181i;
                C2026t c2026t = (C2026t) this.f182j;
                try {
                    objInvokeOrThrow = KavaReflector.invokeOrThrow(method, null, obj3, Boolean.TRUE);
                    break;
                } catch (Throwable th5) {
                }
                Throwable thM8182b6 = C3960g.m8182b(objInvokeOrThrow);
                if (thM8182b6 != null) {
                    c2026t.invoke("收藏语音启动下载失败", thM8182b6);
                    return;
                }
                return;
            case 18:
                Activity activity11 = (Activity) this.f180h;
                C2364h c2364h = (C2364h) this.f181i;
                try {
                    objM5019Y = AbstractC2043a.m5019Y(activity11, c2364h.f7765b, (Uri) this.f182j);
                    break;
                } catch (Throwable th6) {
                }
                activity11.runOnUiThread(new RunnableC0059l(19, activity11, c2364h, (String) (objM5019Y instanceof C3959f ? null : objM5019Y)));
                return;
            case 19:
                Activity activity12 = (Activity) this.f180h;
                String str6 = (String) this.f182j;
                C2364h c2364h2 = (C2364h) this.f181i;
                if (activity12.isFinishing() || activity12.isDestroyed()) {
                    AbstractC2043a.m5039m(activity12, str6);
                    return;
                } else {
                    c2364h2.f7766c.invoke(str6 != null ? new C2362f(str6) : C2361e.f7762b);
                    return;
                }
            case 20:
                C2458l c2458l = (C2458l) this.f180h;
                AbstractC0018a abstractC0018a = (AbstractC0018a) this.f181i;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f182j;
                try {
                    C2465s c2465sM2B = AbstractC0000a.m2B(c2458l.f8074a);
                    if (c2465sM2B == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    C2464r c2464r = (C2464r) c2465sM2B.f8089a;
                    synchronized (c2464r.f8083d) {
                        c2464r.f8085f = threadPoolExecutor;
                        break;
                    }
                    c2465sM2B.f8089a.mo5845a(new C2457k(abstractC0018a, threadPoolExecutor));
                    return;
                } catch (Throwable th7) {
                    abstractC0018a.mo263D(th7);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 21:
                C2954w c2954w = (C2954w) this.f180h;
                C1425u c1425u = (C1425u) this.f181i;
                C2946o c2946o = (C2946o) this.f182j;
                Runnable runnable = c2954w.f9698y;
                Object obj4 = c1425u.f4738g;
                if (obj4 == null) {
                    AbstractC1416l.m3831g("runnable");
                    throw null;
                }
                if (runnable == ((Runnable) obj4) && c2954w.f9688o == c2946o && !c2954w.f9691r) {
                    c2954w.f9698y = null;
                    AbstractC1184v0.m3203m("[Hchat:TextSpeech] 原语音播放完成回调超时，已跳过当前语音");
                    C2105p c2105pMedia2 = WeChatApis.media();
                    if (c2105pMedia2 != null && (c2114y = c2105pMedia2.f7036b) != null) {
                        c2114y.m5322r(new C2110u(c2114y, i9));
                    }
                    c2954w.f9688o = null;
                    c2954w.m6366n();
                    return;
                }
                return;
            case 22:
                C1424t c1424t = (C1424t) this.f180h;
                C1425u c1425u2 = (C1425u) this.f181i;
                C1425u c1425u3 = (C1425u) this.f182j;
                c1424t.f4737g++;
                AbstractC2935f0.m6345d(c1425u2, c1425u3);
                return;
            case 23:
                Activity activity13 = (Activity) this.f180h;
                C3121n c3121n = (C3121n) this.f181i;
                String str7 = (String) this.f182j;
                if (activity13 == null || activity13.isFinishing() || activity13.isDestroyed()) {
                    Toast.makeText(c3121n.f10110a.f12143a, str7, 0).show();
                    return;
                } else {
                    Toast.makeText(activity13, str7, 0).show();
                    return;
                }
            case 24:
                C1425u c1425u4 = (C1425u) this.f180h;
                C3356h c3356h = (C3356h) this.f181i;
                List list3 = (List) this.f182j;
                try {
                    DexKitBridge dexKitBridge = c3356h.f10816c;
                    C0570e c0570e = new C0570e();
                    C1253k c1253k = new C1253k();
                    C1253k.m3367u0(c1253k, list3);
                    c0570e.f1764h = c1253k;
                    C1731p c1731pFindMethod = dexKitBridge.findMethod(c0570e);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = c1731pFindMethod.iterator();
                    while (it2.hasNext()) {
                        try {
                            objM4350r = ((C1730o) it2.next()).m4350r(c3356h.f10815b);
                        } catch (Throwable th8) {
                        }
                        if (objM4350r instanceof C3959f) {
                            objM4350r = null;
                        }
                        Method method2 = (Method) objM4350r;
                        if (method2 != null) {
                            arrayList.add(method2);
                        }
                        break;
                    }
                    HashSet hashSet = new HashSet();
                    c3959f2 = new ArrayList();
                    for (Object obj5 : arrayList) {
                        if (hashSet.add(((Method) obj5).toGenericString())) {
                            c3959f2.add(obj5);
                        }
                        break;
                    }
                } catch (Throwable th9) {
                    c3959f2 = new C3959f(th9);
                }
                Throwable thM8182b7 = C3960g.m8182b(c3959f2);
                if (thM8182b7 != null) {
                    c3356h.f10817d.invoke("定位朋友圈缓存查询入口失败: " + thM8182b7.getMessage());
                }
                C4173t c4173t = C4173t.f13710g;
                boolean z9 = c3959f2 instanceof C3959f;
                ?? r42 = c3959f2;
                if (z9) {
                    r42 = c4173t;
                }
                c1425u4.f4738g = r42;
                return;
            case 25:
                Activity activity14 = (Activity) this.f180h;
                C3357i c3357i = (C3357i) this.f181i;
                C3360l c3360l = (C3360l) this.f182j;
                if (activity14.isFinishing() || activity14.isDestroyed()) {
                    return;
                }
                c3357i.f10832i.invoke(activity14, c3360l);
                return;
            case 26:
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f180h;
                InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) this.f181i;
                CountDownLatch countDownLatch = (CountDownLatch) this.f182j;
                try {
                    atomicBoolean2.set(((Boolean) interfaceC1220a2.invoke()).booleanValue());
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            case 27:
                final C1695r c1695r = (C1695r) this.f180h;
                final String str8 = (String) this.f182j;
                C3468d c3468d = (C3468d) this.f181i;
                try {
                    c3471gM4328q = c1695r.m4328q(str8);
                    sharedPreferences = (SharedPreferences) c1695r.f5638c;
                } catch (Throwable th10) {
                }
                if (c3471gM4328q == null || c3471gM4328q.f11257c) {
                    long jM7909r = ((long) AbstractC3754e0.m7909r(c3471gM4328q != null ? c3471gM4328q.f11258d : sharedPreferences.getInt("group_rename_delay_seconds", 0), 0, 600)) * 1000;
                    if (jM7909r > 0) {
                        try {
                            Thread.sleep(jM7909r);
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                        break;
                    }
                    final C3470f c3470fM4329r = c1695r.m4329r(str8, c3468d);
                    if (c3471gM4328q != null) {
                        strM10259Q = c3471gM4328q.f11259e;
                    } else {
                        String str9 = WeChatSnsPost.TYPE_TEXT;
                        String string = sharedPreferences.getString(AbstractC5700d.m10249E("group_rename_prompt_type", str8), "global");
                        if (string == null) {
                            string = "global";
                        }
                        if (string.equals("global")) {
                            String string2 = sharedPreferences.getString("group_rename_prompt_type", WeChatSnsPost.TYPE_TEXT);
                            if (string2 != null) {
                                str9 = string2;
                            }
                            string = str9;
                        }
                        strM10259Q = AbstractC5700d.m10259Q(string);
                    }
                    final int i10 = 0;
                    InterfaceC1220a interfaceC1220a3 = new InterfaceC1220a() { // from class: q9.c
                        /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
                        /* JADX DEBUG: Multi-variable search result rejected for r6v6, resolved type: byte[] */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // p085fg.InterfaceC1220a
                        public final Object invoke() {
                            boolean zM5601x;
                            String str10;
                            Object c3959f4;
                            switch (i10) {
                                case 0:
                                    C1695r c1695r2 = c1695r;
                                    String str11 = str8;
                                    C3471g c3471g = c3471gM4328q;
                                    String strM4311b = C1695r.m4311b(C1695r.m4317o(c3471g != null ? c3471g.f11261g : c1695r2.m4325k(str11, "group_rename_text", "%userName% 将群内昵称从“%oldGroupNickname%”修改为“%newGroupNickname%”")), c3470fM4329r);
                                    if (!AbstractC3149m.m6721t0(strM4311b)) {
                                        C2343g c2343gM6844q = AbstractC3199a.m6844q();
                                        if (c2343gM6844q == null) {
                                            c2343gM6844q = WeChatApis.messages();
                                        }
                                        if (c2343gM6844q == null) {
                                            ((C2026t) c1695r2.f5637b).invoke("改名提醒发送失败: 消息发送 API 未就绪", null);
                                        } else {
                                            ArrayList arrayList2 = new ArrayList();
                                            C3469e c3469e = arrayList2.isEmpty() ? null : new C3469e(((C3147k) c1695r2.f5644i).m6684e(strM4311b, new C2576b(arrayList2, c1695r2, str11)), AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList2)));
                                            if (c3469e == null) {
                                                zM5601x = c2343gM6844q.m5601x(str11, strM4311b);
                                            } else {
                                                List list4 = c3469e.f11244b;
                                                boolean zIsEmpty = list4.isEmpty();
                                                String str12 = c3469e.f11243a;
                                                zM5601x = zIsEmpty ? c2343gM6844q.m5601x(str11, str12) : c2343gM6844q.m5602y(str11, str12, list4);
                                            }
                                            if (!zM5601x) {
                                                boolean z10 = false;
                                                if (c3469e != null && (str10 = c3469e.f11243a) != null && (!AbstractC3149m.m6721t0(str10))) {
                                                    z10 = true;
                                                }
                                                if (z10) {
                                                    c2343gM6844q.m5601x(str11, c3469e.f11243a);
                                                }
                                            }
                                        }
                                    }
                                    return C3967n.f12976a;
                                default:
                                    C1695r c1695r3 = c1695r;
                                    String str13 = str8;
                                    C3471g c3471g2 = c3471gM4328q;
                                    String strM4325k = c3471g2 != null ? c3471g2.f11262h : c1695r3.m4325k(str13, "group_rename_card_title", "%userName% 修改了群内昵称");
                                    String strM4325k2 = c3471g2 != null ? c3471g2.f11263i : c1695r3.m4325k(str13, "group_rename_card_desc", "旧昵称：%oldGroupNickname%\n新昵称：%newGroupNickname%\n时间：%time%");
                                    String strM4317o = C1695r.m4317o(strM4325k);
                                    C3470f c3470f = c3470fM4329r;
                                    String strM4311b2 = C1695r.m4311b(strM4317o, c3470f);
                                    String strM4311b3 = C1695r.m4311b(C1695r.m4317o(strM4325k2), c3470f);
                                    if (!AbstractC3149m.m6721t0(strM4311b2) || !AbstractC3149m.m6721t0(strM4311b3)) {
                                        C1368i c1368iM9259c = AbstractC4855en.m9259c();
                                        String strM3724m = c1368iM9259c != null ? c1368iM9259c.m3724m(c3470f.f11245a, true) : null;
                                        if (strM3724m == null) {
                                            strM3724m = HttpUrl.FRAGMENT_ENCODE_SET;
                                        }
                                        String str14 = strM3724m;
                                        if (!AbstractC3149m.m6721t0(str14)) {
                                            try {
                                                URLConnection uRLConnectionOpenConnection = new URL(str14).openConnection();
                                                uRLConnectionOpenConnection.getClass();
                                                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                                                httpURLConnection.setConnectTimeout(1200);
                                                httpURLConnection.setReadTimeout(1200);
                                                httpURLConnection.setRequestMethod("GET");
                                                InputStream inputStream = httpURLConnection.getInputStream();
                                                try {
                                                    inputStream.getClass();
                                                    c3959f4 = AbstractC1341a.m3576G(inputStream);
                                                    inputStream.close();
                                                    httpURLConnection.disconnect();
                                                } finally {
                                                }
                                            } catch (Throwable th11) {
                                                c3959f4 = new C3959f(th11);
                                            }
                                            obj = (byte[]) (c3959f4 instanceof C3959f ? null : c3959f4);
                                        }
                                        byte[] bArr = obj;
                                        C2105p c2105pMedia3 = WeChatApis.media();
                                        if (c2105pMedia3 == null || !c2105pMedia3.m5303c(str13, strM4311b2, strM4311b3, str14, bArr, HttpUrl.FRAGMENT_ENCODE_SET)) {
                                            C2343g c2343gM6844q2 = AbstractC3199a.m6844q();
                                            if (c2343gM6844q2 == null) {
                                                c2343gM6844q2 = WeChatApis.messages();
                                            }
                                            if (c2343gM6844q2 != null) {
                                                List listM101y0 = AbstractC0000a.m101y0(strM4311b2, strM4311b3);
                                                ArrayList arrayList3 = new ArrayList();
                                                for (Object obj6 : listM101y0) {
                                                    if (!AbstractC3149m.m6721t0((String) obj6)) {
                                                        arrayList3.add(obj6);
                                                    }
                                                }
                                                c2343gM6844q2.m5601x(str13, AbstractC4166m.m8392A1(arrayList3, "\n", null, null, null, 62));
                                            }
                                        }
                                    }
                                    return C3967n.f12976a;
                            }
                        }
                    };
                    final int i11 = 1;
                    InterfaceC1220a interfaceC1220a4 = new InterfaceC1220a() { // from class: q9.c
                        /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
                        /* JADX DEBUG: Multi-variable search result rejected for r6v6, resolved type: byte[] */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // p085fg.InterfaceC1220a
                        public final Object invoke() {
                            boolean zM5601x;
                            String str10;
                            Object c3959f4;
                            switch (i11) {
                                case 0:
                                    C1695r c1695r2 = c1695r;
                                    String str11 = str8;
                                    C3471g c3471g = c3471gM4328q;
                                    String strM4311b = C1695r.m4311b(C1695r.m4317o(c3471g != null ? c3471g.f11261g : c1695r2.m4325k(str11, "group_rename_text", "%userName% 将群内昵称从“%oldGroupNickname%”修改为“%newGroupNickname%”")), c3470fM4329r);
                                    if (!AbstractC3149m.m6721t0(strM4311b)) {
                                        C2343g c2343gM6844q = AbstractC3199a.m6844q();
                                        if (c2343gM6844q == null) {
                                            c2343gM6844q = WeChatApis.messages();
                                        }
                                        if (c2343gM6844q == null) {
                                            ((C2026t) c1695r2.f5637b).invoke("改名提醒发送失败: 消息发送 API 未就绪", null);
                                        } else {
                                            ArrayList arrayList2 = new ArrayList();
                                            C3469e c3469e = arrayList2.isEmpty() ? null : new C3469e(((C3147k) c1695r2.f5644i).m6684e(strM4311b, new C2576b(arrayList2, c1695r2, str11)), AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList2)));
                                            if (c3469e == null) {
                                                zM5601x = c2343gM6844q.m5601x(str11, strM4311b);
                                            } else {
                                                List list4 = c3469e.f11244b;
                                                boolean zIsEmpty = list4.isEmpty();
                                                String str12 = c3469e.f11243a;
                                                zM5601x = zIsEmpty ? c2343gM6844q.m5601x(str11, str12) : c2343gM6844q.m5602y(str11, str12, list4);
                                            }
                                            if (!zM5601x) {
                                                boolean z10 = false;
                                                if (c3469e != null && (str10 = c3469e.f11243a) != null && (!AbstractC3149m.m6721t0(str10))) {
                                                    z10 = true;
                                                }
                                                if (z10) {
                                                    c2343gM6844q.m5601x(str11, c3469e.f11243a);
                                                }
                                            }
                                        }
                                    }
                                    return C3967n.f12976a;
                                default:
                                    C1695r c1695r3 = c1695r;
                                    String str13 = str8;
                                    C3471g c3471g2 = c3471gM4328q;
                                    String strM4325k = c3471g2 != null ? c3471g2.f11262h : c1695r3.m4325k(str13, "group_rename_card_title", "%userName% 修改了群内昵称");
                                    String strM4325k2 = c3471g2 != null ? c3471g2.f11263i : c1695r3.m4325k(str13, "group_rename_card_desc", "旧昵称：%oldGroupNickname%\n新昵称：%newGroupNickname%\n时间：%time%");
                                    String strM4317o = C1695r.m4317o(strM4325k);
                                    C3470f c3470f = c3470fM4329r;
                                    String strM4311b2 = C1695r.m4311b(strM4317o, c3470f);
                                    String strM4311b3 = C1695r.m4311b(C1695r.m4317o(strM4325k2), c3470f);
                                    if (!AbstractC3149m.m6721t0(strM4311b2) || !AbstractC3149m.m6721t0(strM4311b3)) {
                                        C1368i c1368iM9259c = AbstractC4855en.m9259c();
                                        String strM3724m = c1368iM9259c != null ? c1368iM9259c.m3724m(c3470f.f11245a, true) : null;
                                        if (strM3724m == null) {
                                            strM3724m = HttpUrl.FRAGMENT_ENCODE_SET;
                                        }
                                        String str14 = strM3724m;
                                        if (!AbstractC3149m.m6721t0(str14)) {
                                            try {
                                                URLConnection uRLConnectionOpenConnection = new URL(str14).openConnection();
                                                uRLConnectionOpenConnection.getClass();
                                                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                                                httpURLConnection.setConnectTimeout(1200);
                                                httpURLConnection.setReadTimeout(1200);
                                                httpURLConnection.setRequestMethod("GET");
                                                InputStream inputStream = httpURLConnection.getInputStream();
                                                try {
                                                    inputStream.getClass();
                                                    c3959f4 = AbstractC1341a.m3576G(inputStream);
                                                    inputStream.close();
                                                    httpURLConnection.disconnect();
                                                } finally {
                                                }
                                            } catch (Throwable th11) {
                                                c3959f4 = new C3959f(th11);
                                            }
                                            obj = (byte[]) (c3959f4 instanceof C3959f ? null : c3959f4);
                                        }
                                        byte[] bArr = obj;
                                        C2105p c2105pMedia3 = WeChatApis.media();
                                        if (c2105pMedia3 == null || !c2105pMedia3.m5303c(str13, strM4311b2, strM4311b3, str14, bArr, HttpUrl.FRAGMENT_ENCODE_SET)) {
                                            C2343g c2343gM6844q2 = AbstractC3199a.m6844q();
                                            if (c2343gM6844q2 == null) {
                                                c2343gM6844q2 = WeChatApis.messages();
                                            }
                                            if (c2343gM6844q2 != null) {
                                                List listM101y0 = AbstractC0000a.m101y0(strM4311b2, strM4311b3);
                                                ArrayList arrayList3 = new ArrayList();
                                                for (Object obj6 : listM101y0) {
                                                    if (!AbstractC3149m.m6721t0((String) obj6)) {
                                                        arrayList3.add(obj6);
                                                    }
                                                }
                                                c2343gM6844q2.m5601x(str13, AbstractC4166m.m8392A1(arrayList3, "\n", null, null, null, 62));
                                            }
                                        }
                                    }
                                    return C3967n.f12976a;
                            }
                        }
                    };
                    if (strM10259Q.equals(WeChatSnsPost.TYPE_CARD)) {
                        listM99x0 = AbstractC0000a.m99x0(interfaceC1220a4);
                    } else if (strM10259Q.equals("both")) {
                        listM99x0 = (c3471gM4328q != null ? c3471gM4328q.f11260f : c1695r.m4320c(str8)).equals("card_first") ? AbstractC0000a.m101y0(interfaceC1220a4, interfaceC1220a3) : AbstractC0000a.m101y0(interfaceC1220a3, interfaceC1220a4);
                    } else {
                        listM99x0 = AbstractC0000a.m99x0(interfaceC1220a3);
                    }
                    for (Object obj6 : listM99x0) {
                        int i12 = i + 1;
                        if (i < 0) {
                            AbstractC0000a.m32Q0();
                            throw null;
                        }
                        ((InterfaceC1220a) obj6).invoke();
                        if (i < listM99x0.size() - 1) {
                            try {
                                Thread.sleep(300L);
                            } catch (InterruptedException unused2) {
                                Thread.currentThread().interrupt();
                            }
                        }
                        i = i12;
                        thM8182b2 = C3960g.m8182b(obj);
                        if (thM8182b2 == null) {
                            ((C2026t) c1695r.f5637b).invoke(AbstractC0255e.m1021j("改名提醒发送异常: ", str8, "/", c3468d.f11240a), thM8182b2);
                            return;
                        }
                        return;
                    }
                }
                Object obj7 = C3967n.f12976a;
                thM8182b2 = C3960g.m8182b(obj7);
                if (thM8182b2 == null) {
                }
                break;
            case 28:
                Activity activity15 = (Activity) this.f180h;
                List list4 = (List) this.f181i;
                C1423s c1423s = (C1423s) this.f182j;
                if (activity15.isFinishing()) {
                    return;
                }
                int size = list4.size();
                int i13 = c1423s.f4736g;
                C3490k.m7295N(activity15, size == 1 ? i13 == 1 ? "语音转发成功" : "语音转发失败" : AbstractC3199a.m6837j(i13, "语音转发完成: ", "/", list4.size()));
                return;
            default:
                C3490k c3490k = (C3490k) this.f180h;
                Activity activity16 = (Activity) this.f181i;
                C3488i c3488i = (C3488i) this.f182j;
                try {
                    File fileM7322c = c3490k.m7322c();
                    if (fileM7322c != null) {
                        boolean zM7313E = c3490k.m7313E(new File(c3488i.f11325a), fileM7322c);
                        if (!zM7313E) {
                            fileM7322c = null;
                        }
                        c3959f3 = new C3487h(fileM7322c, zM7313E ? HttpUrl.FRAGMENT_ENCODE_SET : "语音转 MP3 失败", zM7313E);
                    } else {
                        c3959f3 = new C3487h(null, "创建保存目录失败", false);
                    }
                    break;
                } catch (Throwable th11) {
                    c3959f3 = new C3959f(th11);
                }
                Throwable thM8182b8 = C3960g.m8182b(c3959f3);
                if (thM8182b8 != null) {
                    c3490k.f11331b.invoke("保存语音失败", thM8182b8);
                    c3959f3 = new C3487h(null, "语音保存失败", false);
                }
                C3487h c3487h = (C3487h) c3959f3;
                if (!c3487h.f11322a || (file = c3487h.f11323b) == null) {
                    String str10 = c3487h.f11324c;
                    strM9263g2 = AbstractC3149m.m6721t0(str10) ? "语音保存失败" : str10;
                } else {
                    strM9263g2 = AbstractC4855en.m9263g("语音已保存: ", file.getAbsolutePath());
                }
                C3490k.m7295N(activity16, strM9263g2);
                return;
        }
    }

    public /* synthetic */ RunnableC0059l(int i9, Object obj, Object obj2, String str) {
        this.f179g = i9;
        this.f180h = obj;
        this.f182j = str;
        this.f181i = obj2;
    }

    public /* synthetic */ RunnableC0059l(Activity activity, List list, C2023q c2023q, C2016j c2016j) {
        this.f179g = 16;
        this.f180h = activity;
        this.f181i = list;
        this.f182j = c2016j;
    }

    public /* synthetic */ RunnableC0059l(Object obj, Context context, Object obj2, Object obj3, int i9) {
        this.f179g = i9;
        this.f180h = context;
        this.f181i = obj2;
        this.f182j = obj3;
    }

    public /* synthetic */ RunnableC0059l(Object obj, Object obj2, Object obj3, int i9) {
        this.f179g = i9;
        this.f180h = obj;
        this.f181i = obj2;
        this.f182j = obj3;
    }
}
