package ca;

import ac.RunnableC0059l;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import bb.C0250l;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import gg.AbstractC1416l;
import gg.C1423s;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import okio.C3193a;
import p000a.AbstractC0000a;
import p014b.C0126e;
import p024b9.RunnableC0217c;
import p025bc.AbstractC0255e;
import p050da.C0756b;
import p050da.C0757c;
import p050da.C0762h;
import p065eb.C0859c0;
import p065eb.RunnableC0900w;
import p068eh.AbstractC0921a;
import p080fb.AbstractC1184v0;
import p080fb.C1099a;
import p080fb.C1113d1;
import p080fb.C1125g1;
import p080fb.EnumC1182u2;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1236q;
import p096g8.C1368i;
import p099h.Hchat.ModuleEntry;
import p099h.Hchat.R;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.items.script.ScriptPluginBridge;
import p099h.Hchat.hooks.items.script.ScriptPluginRuntime;
import p109hb.C1669b;
import p109hb.C1678f0;
import p109hb.C1684i0;
import p109hb.C1701x;
import p109hb.EnumC1680g0;
import p117i0.InterfaceC1809a1;
import p119i2.AbstractC1923e0;
import p119i2.C1941n0;
import p126ia.C2016j;
import p126ia.C2023q;
import p126ia.C2026t;
import p129ig.AbstractC2043a;
import p144k.C2209s1;
import p154k9.C2374r;
import p177m2.InterfaceC2760d;
import p211o9.C3097j;
import p211o9.C3101n;
import p211o9.C3103p;
import p211o9.C3104q;
import p218og.AbstractC3149m;
import p222p.AbstractC3199a;
import p237q2.C3430d;
import p244qb.C3488i;
import p244qb.C3490k;
import p244qb.RunnableC3483d;
import p259r9.AbstractC3754e0;
import p261rb.RunnableC3791g;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;
import p300ub.C4301a;
import p322w0.AbstractC4655f;
import p322w0.AbstractC4662m;
import p322w0.C4651b;
import p332wb.AbstractC4955ho;
import p332wb.C4731au;
import p332wb.C4925gr;
import p332wb.C4958hr;
import p332wb.C5026jv;
import p332wb.C5108me;
import p332wb.C5491y2;
import p332wb.EnumC5092lv;
import p332wb.InterfaceC5059kv;
import p332wb.RunnableC5421vu;
import p347xa.C5745f;
import p347xa.C5748i;
import p347xa.C5752m;
import p365y9.C6008d;
import p365y9.C6009e;
import tf.AbstractC4167n;
import tf.AbstractC4178y;
import tf.C4173t;

/* JADX INFO: renamed from: ca.x */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0537x implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1690g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f1691h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f1692i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f1693j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f1694k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f1695l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0537x(Object obj, Map map, Context context, C0859c0 c0859c0, InterfaceC1809a1 interfaceC1809a1) {
        this.f1690g = 15;
        this.f1693j = obj;
        this.f1691h = map;
        this.f1692i = context;
        this.f1694k = c0859c0;
        this.f1695l = interfaceC1809a1;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:123:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x026d A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        View decorView;
        String str;
        String strM6573b;
        String strM1003c;
        String strM1004d;
        String strReplaceAll;
        String str2;
        String strM6582m;
        String str3;
        String strM3737z;
        String string;
        boolean z9;
        C4651b c4651bMo9085C;
        View decorView2;
        File file;
        Object c3959f;
        Throwable thM8182b;
        C1099a c1099a;
        String strM9309C6;
        String str4;
        String strSubstring;
        File file2;
        InputStream inputStreamOpenInputStream;
        Object c3959f2;
        View decorView3;
        int i9 = this.f1690g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Object c3959f3 = C3967n.f12976a;
        int i10 = 0;
        Object obj = this.f1693j;
        Object obj2 = this.f1695l;
        Object obj3 = this.f1694k;
        Object obj4 = this.f1692i;
        Object obj5 = this.f1691h;
        switch (i9) {
            case 0:
                Activity activity = (Activity) obj4;
                C0525l c0525l = (C0525l) obj3;
                C0517e0 c0517e0 = (C0517e0) obj2;
                if (((AtomicBoolean) obj5).get() || activity.isFinishing() || activity.isDestroyed()) {
                    return;
                }
                if (!(obj instanceof C3959f)) {
                    c0525l.invoke(obj);
                }
                Throwable thM8182b2 = C3960g.m8182b(obj);
                if (thM8182b2 != null) {
                    c0517e0.f1581c.invoke("转发读取联系人失败", thM8182b2);
                    c0517e0.m1532r(activity, "联系人列表不可用");
                    return;
                }
                return;
            case 1:
                ((ModuleEntry) obj5).lambda$initModule$4((XC_LoadPackage.LoadPackageParam) obj4, (Context) obj, (Context) obj3, (C4301a) obj2);
                return;
            case 2:
                ((ModuleEntry) obj5).lambda$installTabletHookForAttach$3((XC_MethodHook.MethodHookParam) obj4, (Context) obj, (XC_LoadPackage.LoadPackageParam) obj3, (String) obj2);
                return;
            case 3:
                View view = (View) obj5;
                C0756b c0756b = (C0756b) obj4;
                C0762h c0762h = (C0762h) obj;
                TextView textView = (TextView) obj3;
                C0757c c0757c = (C0757c) obj2;
                if (view.getTag(R.id.hchat_message_text_color_original) == c0756b) {
                    c0762h.m1974B(view, textView, c0757c, c0756b);
                    return;
                }
                return;
            case 4:
                ScriptPluginBridge.callOnMainForResult$lambda$1((AtomicInteger) obj5, 0, 1, (CountDownLatch) obj4, (AtomicReference) obj, (InterfaceC1220a) obj3, (AtomicReference) obj2, 2);
                return;
            case 5:
                InterfaceC1236q interfaceC1236q = (InterfaceC1236q) obj5;
                C1423s c1423s = (C1423s) obj4;
                ArrayList arrayList = (ArrayList) obj;
                List list = (List) obj3;
                C1669b c1669b = (C1669b) obj2;
                if (interfaceC1236q != null) {
                    interfaceC1236q.mo734b(Integer.valueOf(c1423s.f4736g), Integer.valueOf(list.size() * arrayList.size()), Boolean.valueOf(c1669b.f5510b.get()));
                    return;
                }
                return;
            case 6:
                Activity activity2 = (Activity) obj4;
                C1701x c1701x = (C1701x) obj3;
                C1684i0 c1684i0 = (C1684i0) obj2;
                if (((AtomicBoolean) obj5).get() || activity2.isFinishing() || activity2.isDestroyed()) {
                    return;
                }
                if (!(obj instanceof C3959f)) {
                    c1701x.invoke((List) obj);
                }
                Throwable thM8182b3 = C3960g.m8182b(obj);
                if (thM8182b3 != null) {
                    c1684i0.f5583b.invoke("群发助手读取联系人失败", thM8182b3);
                    c1684i0.m4288e(activity2, "联系人列表不可用");
                    return;
                }
                return;
            case 7:
                Activity activity3 = (Activity) obj4;
                EnumC1680g0 enumC1680g0 = (EnumC1680g0) obj5;
                C1684i0 c1684i02 = (C1684i0) obj;
                List list2 = (List) obj3;
                C0126e c0126e = (C0126e) obj2;
                if (activity3.isFinishing()) {
                    return;
                }
                int iOrdinal = enumC1680g0.ordinal();
                int i11 = 7;
                EnumC5092lv enumC5092lv = EnumC5092lv.f18824j;
                if (iOrdinal == 0) {
                    c1684i02.getClass();
                    C5491y2.m9799Q1(activity3, "选择群发通道", AbstractC0921a.m2250m(list2.size(), "已选 ", " 条消息"), AbstractC0000a.m101y0(new C3958e("模块通道", "支持好友、群聊、公众号和好友标签"), new C3958e("微信原生群发助手", "按微信当前人数上限自动分批")), new C1678f0(0, activity3, c0126e, c1684i02, list2), new C2209s1(i11), enumC5092lv);
                    return;
                } else if (iOrdinal != 1) {
                    C3193a.m6822k();
                    return;
                } else {
                    c1684i02.getClass();
                    C5491y2.m9799Q1(activity3, "选择定时转发通道", AbstractC0921a.m2250m(list2.size(), "已选 ", " 条消息"), AbstractC0000a.m101y0(new C3958e("模块通道", "支持好友、群聊、公众号和标签"), new C3958e("微信原生群发助手", "仅选择好友并按原生队列发送")), new C1678f0(activity3, list2, c1684i02, c0126e), new C2209s1(i11), enumC5092lv);
                    return;
                }
            case 8:
                Activity activity4 = (Activity) obj4;
                List list3 = (List) obj;
                C2023q c2023q = (C2023q) obj3;
                C2016j c2016j = (C2016j) obj2;
                ((InterfaceC5059kv) obj5).close();
                Window window = activity4.getWindow();
                if (window == null || (decorView = window.getDecorView()) == null) {
                    return;
                }
                decorView.postOnAnimation(new RunnableC0059l(activity4, list3, c2023q, c2016j));
                return;
            case 9:
                Activity activity5 = (Activity) obj4;
                ViewGroup viewGroup = (ViewGroup) obj5;
                FrameLayout frameLayout = (FrameLayout) obj;
                ScrollView scrollView = (ScrollView) obj3;
                C2374r c2374r = C2374r.f7799a;
                C2374r.m5684m(activity5, viewGroup, frameLayout, scrollView, (LinearLayout) obj2);
                scrollView.postOnAnimation(new RunnableC0217c(scrollView, viewGroup, activity5, frameLayout, 11));
                return;
            case 10:
                C3103p c3103p = (C3103p) obj5;
                String str5 = (String) obj4;
                String str6 = (String) obj;
                String str7 = (String) obj3;
                C3104q c3104q = (C3104q) obj2;
                try {
                    SharedPreferences sharedPreferences = c3103p.f10026b;
                    C0250l c0250l = c3103p.f10027c;
                    C3103p.m6575F(((long) AbstractC3754e0.m7909r(sharedPreferences.getInt("group_member_reply_delay_seconds", 0), 0, 600)) * 1000);
                    C3097j c3097jM6605u = c3103p.m6605u(str5, str6);
                    String str8 = c3097jM6605u.f10002b;
                    if (AbstractC3149m.m6721t0(str8)) {
                        str8 = c3097jM6605u.f10003c;
                        if (AbstractC3149m.m6721t0(str8)) {
                            str8 = c3097jM6605u.f10004d;
                        }
                    }
                    str = str8;
                    strM6573b = c3097jM6605u.m6573b();
                    strM1003c = c0250l.m1003c(str6);
                    WeChatApis.contact().getClass();
                    C1368i c1368i = WeChatApis.contactApi;
                    strM1004d = c0250l.m1004d(c1368i != null ? c1368i.m3730s(str6) : 0);
                    WeChatApis.contact().getClass();
                    C1368i c1368i2 = WeChatApis.contactApi;
                    if (c1368i2 == null || (strM3737z = c1368i2.m3737z(str6)) == null || (string = AbstractC3149m.m6703R0(strM3737z).toString()) == null) {
                        strReplaceAll = null;
                    } else {
                        Pattern patternCompile = Pattern.compile("\\s+");
                        patternCompile.getClass();
                        strReplaceAll = patternCompile.matcher(string).replaceAll(" ");
                        strReplaceAll.getClass();
                    }
                    str2 = strReplaceAll == null ? HttpUrl.FRAGMENT_ENCODE_SET : strReplaceAll;
                    strM6582m = C3103p.m6582m(str5);
                    str3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date());
                    str3.getClass();
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    C3101n c3101n = new C3101n(str6, str, strM6573b, strM1003c, strM1004d, str2, strM6582m, str3);
                    str6 = str6;
                    c3103p.m6599l(str7, str5, c3101n, c3104q);
                    break;
                } catch (Throwable th3) {
                    th = th3;
                    str6 = str6;
                    c3959f3 = new C3959f(th);
                }
                Throwable thM8182b4 = C3960g.m8182b(c3959f3);
                if (thM8182b4 != null) {
                    C2026t c2026t = c3103p.f10025a;
                    StringBuilder sbM1027p = AbstractC0255e.m1027p("进退群自动回复异常: ", str5, "/", str6, "/");
                    sbM1027p.append(str7);
                    c2026t.invoke(sbM1027p.toString(), thM8182b4);
                    return;
                }
                return;
            case 11:
                List list4 = (List) obj5;
                Handler handler = (Handler) obj;
                C3490k c3490k = (C3490k) obj3;
                C3488i c3488i = (C3488i) obj2;
                Activity activity6 = (Activity) obj4;
                C1423s c1423s2 = new C1423s();
                int i12 = 0;
                for (Object obj6 : list4) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        AbstractC0000a.m32Q0();
                        throw null;
                    }
                    if (c3490k.m7315G(c3488i, ((C5026jv) obj6).f18249a)) {
                        c1423s2.f4736g++;
                    }
                    if (i12 < list4.size() - 1) {
                        try {
                            timeUnit.sleep(500L);
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }
                    i12 = i13;
                }
                handler.post(new RunnableC0059l(activity6, list4, c1423s2, c3490k));
                return;
            case 12:
                List list5 = (List) obj5;
                List list6 = (List) obj;
                Handler handler2 = (Handler) obj3;
                C3490k c3490k2 = (C3490k) obj2;
                Activity activity7 = (Activity) obj4;
                try {
                    C1423s c1423s3 = new C1423s();
                    int size = list5.size() * list6.size();
                    Iterator it = list5.iterator();
                    int i14 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            C5026jv c5026jv = (C5026jv) it.next();
                            Iterator it2 = list6.iterator();
                            while (it2.hasNext()) {
                                if (c3490k2.m7315G((C3488i) it2.next(), c5026jv.f18249a)) {
                                    c1423s3.f4736g++;
                                }
                                i14++;
                                if (i14 < size) {
                                    try {
                                        timeUnit.sleep(500L);
                                        z9 = true;
                                    } catch (InterruptedException unused2) {
                                        Thread.currentThread().interrupt();
                                        z9 = false;
                                    }
                                    if (!z9) {
                                    }
                                }
                            }
                        } else {
                            handler2.post(new RunnableC3483d(activity7, c3490k2, c1423s3, size));
                            c3490k2.getClass();
                        }
                    }
                    C3490k.m7298e(list6);
                    return;
                } catch (Throwable th4) {
                    c3490k2.getClass();
                    C3490k.m7298e(list6);
                    throw th4;
                }
            case 13:
                C1941n0 c1941n0 = (C1941n0) obj5;
                EnumC4243m enumC4243m = (EnumC4243m) obj4;
                String str9 = (String) obj;
                InterfaceC4233c interfaceC4233c = (InterfaceC4233c) obj3;
                InterfaceC2760d interfaceC2760d = (InterfaceC2760d) obj2;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    AbstractC4655f abstractC4655fM9129j = AbstractC4662m.m9129j();
                    C4651b c4651b = abstractC4655fM9129j instanceof C4651b ? (C4651b) abstractC4655fM9129j : null;
                    if (c4651b == null || (c4651bMo9085C = c4651b.mo9085C(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        AbstractC4655f abstractC4655fM9110j = c4651bMo9085C.m9110j();
                        try {
                            C1941n0 c1941n0M4790h = AbstractC1923e0.m4790h(c1941n0, enumC4243m);
                            C4173t c4173t = C4173t.f13710g;
                            C3430d c3430d = new C3430d(str9, c1941n0M4790h, c4173t, c4173t, interfaceC2760d, interfaceC4233c);
                            c3430d.mo1194c();
                            c3430d.mo1193b();
                            c4651bMo9085C.mo9091w().mo9114d();
                            return;
                        } finally {
                            AbstractC4655f.m9106q(abstractC4655fM9110j);
                        }
                    } catch (Throwable th5) {
                        try {
                            throw th5;
                        } finally {
                            c4651bMo9085C.mo9086c();
                        }
                    }
                } finally {
                    Trace.endSection();
                }
            case 14:
                Context context = (Context) obj5;
                SharedPreferences sharedPreferences2 = (SharedPreferences) obj4;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) obj;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) obj3;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) obj2;
                List<C0859c0> listListPlugins = ScriptPluginRuntime.INSTANCE.listPlugins(context);
                int iM8438a0 = AbstractC4178y.m8438a0(AbstractC4167n.m8429e1(listListPlugins));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM8438a0 < 16 ? 16 : iM8438a0);
                Iterator<T> it3 = listListPlugins.iterator();
                while (it3.hasNext()) {
                    String str10 = ((C0859c0) it3.next()).f2626a;
                    linkedHashMap.put(str10, Boolean.valueOf(ScriptPluginRuntime.INSTANCE.isPluginEnabled(context, str10)));
                }
                interfaceC1809a1.setValue(linkedHashMap);
                interfaceC1809a12.setValue(Boolean.valueOf(sharedPreferences2.getBoolean("script_plugin_enable", false)));
                AbstractC3199a.m6848u((Number) interfaceC1809a13.getValue(), 1, interfaceC1809a13);
                return;
            case 15:
                Map map = (Map) obj5;
                Context context2 = (Context) obj4;
                C0859c0 c0859c0 = (C0859c0) obj3;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) obj2;
                if (obj instanceof C3959f) {
                    interfaceC1809a14.setValue(map);
                    String str11 = c0859c0.f2633h;
                    if (str11 == null) {
                        str11 = "未知";
                    }
                    Toast.makeText(context2, "加载[" + str11 + "]失败，已自动关闭", 0).show();
                    return;
                }
                return;
            case 16:
                Activity activity8 = (Activity) obj4;
                List list7 = (List) obj;
                Set set = (Set) obj3;
                C5108me c5108me = (C5108me) obj2;
                ((InterfaceC5059kv) obj5).close();
                Window window2 = activity8.getWindow();
                if (window2 == null || (decorView2 = window2.getDecorView()) == null) {
                    return;
                }
                decorView2.postOnAnimation(new RunnableC0217c(activity8, list7, set, c5108me, 21));
                return;
            case 17:
                Activity activity9 = (Activity) obj4;
                File file3 = (File) obj;
                HashSet hashSet = (HashSet) obj3;
                C4925gr c4925gr = (C4925gr) obj2;
                ArrayList arrayList2 = new ArrayList();
                for (Uri uri : (List) obj5) {
                    C4958hr c4958hr = C4958hr.f17734a;
                    boolean zContains = hashSet.contains(uri.toString());
                    try {
                        strM9309C6 = AbstractC4955ho.m9309C6(activity9, uri);
                        str4 = "attachment";
                        if (strM9309C6 == null && (strM9309C6 = uri.getLastPathSegment()) == null) {
                            strM9309C6 = "attachment";
                        }
                        Pattern patternCompile2 = Pattern.compile("[\\\\/:*?\"<>|]");
                        patternCompile2.getClass();
                        String strReplaceAll2 = patternCompile2.matcher(strM9309C6).replaceAll("_");
                        strReplaceAll2.getClass();
                        if (!AbstractC3149m.m6721t0(strReplaceAll2)) {
                            str4 = strReplaceAll2;
                        }
                        String string2 = UUID.randomUUID().toString();
                        string2.getClass();
                        strSubstring = string2.substring(i10, 8);
                        file2 = file3;
                    } catch (Throwable th6) {
                        th = th6;
                    }
                    try {
                        file3 = file2;
                        file = new File(file3, System.currentTimeMillis() + "_" + strSubstring + "_" + str4);
                        try {
                            inputStreamOpenInputStream = activity9.getContentResolver().openInputStream(uri);
                        } catch (Throwable th7) {
                            th = th7;
                            c3959f = new C3959f(th);
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        file3 = file2;
                        file = null;
                        c3959f = new C3959f(th);
                        thM8182b = C3960g.m8182b(c3959f);
                        if (thM8182b != null) {
                        }
                        c1099a = (C1099a) c3959f;
                        if (c1099a != null) {
                        }
                        i10 = 0;
                    }
                    if (inputStreamOpenInputStream != null) {
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            try {
                                byte[] bArr = new byte[32768];
                                while (true) {
                                    int i15 = inputStreamOpenInputStream.read(bArr);
                                    if (i15 < 0) {
                                        fileOutputStream.close();
                                        inputStreamOpenInputStream.close();
                                        String absolutePath = file.getAbsolutePath();
                                        absolutePath.getClass();
                                        String type = activity9.getContentResolver().getType(uri);
                                        if (type == null) {
                                            type = HttpUrl.FRAGMENT_ENCODE_SET;
                                        }
                                        if (AbstractC3149m.m6721t0(type)) {
                                            type = "application/octet-stream";
                                        }
                                        String str12 = type;
                                        long length = file.length();
                                        String string3 = uri.toString();
                                        if (!zContains) {
                                            string3 = null;
                                        }
                                        c3959f = new C1099a(strM9309C6, absolutePath, str12, string3 == null ? HttpUrl.FRAGMENT_ENCODE_SET : string3, length);
                                        if (!file.isFile() || file.length() <= 0) {
                                            c3959f = null;
                                        }
                                        if (c3959f == null) {
                                            file.delete();
                                            c3959f = null;
                                        }
                                    } else {
                                        String str13 = strM9309C6;
                                        fileOutputStream.write(bArr, 0, i15);
                                        strM9309C6 = str13;
                                    }
                                }
                            } catch (Throwable th9) {
                                try {
                                    throw th9;
                                } catch (Throwable th10) {
                                    AbstractC2043a.m5035i(fileOutputStream, th9);
                                    throw th10;
                                }
                            }
                        } finally {
                        }
                    } else {
                        c1099a = null;
                        if (c1099a != null) {
                            arrayList2.add(c1099a);
                        }
                        i10 = 0;
                    }
                    thM8182b = C3960g.m8182b(c3959f);
                    if (thM8182b != null) {
                        if (file != null) {
                            file.delete();
                        }
                        new Handler(Looper.getMainLooper()).post(new RunnableC3791g(activity9, 15, thM8182b));
                        c3959f = null;
                    }
                    c1099a = (C1099a) c3959f;
                    if (c1099a != null) {
                    }
                    i10 = 0;
                }
                HashSet hashSet2 = new HashSet();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj7 : arrayList2) {
                    C1099a c1099a2 = (C1099a) obj7;
                    String str14 = c1099a2.f3543e;
                    if (AbstractC3149m.m6721t0(str14)) {
                        str14 = c1099a2.f3540b;
                    }
                    if (hashSet2.add(str14)) {
                        arrayList3.add(obj7);
                    }
                }
                if (arrayList3.isEmpty()) {
                    return;
                }
                new Handler(Looper.getMainLooper()).post(new RunnableC3791g(c4925gr, 16, arrayList3));
                return;
            case 18:
                C4731au c4731au = (C4731au) obj4;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) obj3;
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) obj2;
                if (!AbstractC1416l.m3825a((String) ((InterfaceC1809a1) obj).getValue(), (String) obj5)) {
                    c4731au.m9244a(EnumC1182u2.f3972g);
                    return;
                } else {
                    interfaceC1809a15.setValue(c4731au);
                    C5491y2.m9802S0(interfaceC1809a16, true);
                    return;
                }
            case 19:
                C1113d1 c1113d1 = (C1113d1) obj5;
                String str15 = (String) obj4;
                Context context3 = (Context) obj;
                List list8 = (List) obj3;
                String str16 = (String) obj2;
                try {
                    C1125g1 c1125g1 = C1125g1.f3676a;
                    if (C1125g1.m2864h(c1113d1.f3640e)) {
                        str15.getClass();
                        C1125g1.f3683h.remove(C1125g1.m2869m(str15));
                        C1125g1.m2870n(context3, c1113d1);
                    } else {
                        C1125g1.m2861e(context3, str15);
                    }
                    c3959f2 = c3959f3;
                } catch (Throwable th11) {
                    c3959f2 = new C3959f(th11);
                }
                if (!(c3959f2 instanceof C3959f)) {
                    try {
                        if (!list8.isEmpty()) {
                            C5491y2.m9772E0(context3, list8);
                        }
                    } catch (Throwable th12) {
                        c3959f3 = new C3959f(th12);
                    }
                    Throwable thM8182b5 = C3960g.m8182b(c3959f3);
                    if (thM8182b5 != null) {
                        AbstractC1184v0.m3204n("[Hchat:ScriptAgent] " + str16 + "清理工具结果失败", thM8182b5);
                    }
                    break;
                }
                Throwable thM8182b6 = C3960g.m8182b(c3959f2);
                if (thM8182b6 != null) {
                    AbstractC1184v0.m3204n("[Hchat:ScriptAgent] " + str16 + "保存会话失败", thM8182b6);
                    new Handler(Looper.getMainLooper()).post(new RunnableC0900w(context3, str16, 5));
                    return;
                }
                return;
            case 20:
                C5752m c5752m = (C5752m) obj3;
                Activity activity10 = (Activity) obj4;
                ((InterfaceC5059kv) obj5).close();
                C5745f c5745f = new C5745f(this.f1693j, c5752m, activity10, (C5748i) obj2, 0);
                c5752m.getClass();
                Window window3 = activity10.getWindow();
                if (window3 == null || (decorView3 = window3.getDecorView()) == null) {
                    return;
                }
                decorView3.postOnAnimation(new RunnableC5421vu(c5752m, activity10, c5745f));
                return;
            default:
                C6009e c6009e = (C6009e) obj5;
                TextView textView2 = (TextView) obj4;
                String str17 = (String) obj3;
                String str18 = (String) obj2;
                if (AbstractC1416l.m3825a(c6009e.f24394e.get(textView2), (C6008d) obj)) {
                    c6009e.m10764a(textView2, str17, str18);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ RunnableC0537x(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i9) {
        this.f1690g = i9;
        this.f1691h = obj;
        this.f1692i = obj2;
        this.f1693j = obj3;
        this.f1694k = obj4;
        this.f1695l = obj5;
    }

    public /* synthetic */ RunnableC0537x(int i9, Activity activity, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f1690g = i9;
        this.f1692i = activity;
        this.f1691h = obj;
        this.f1693j = obj2;
        this.f1694k = obj3;
        this.f1695l = obj4;
    }

    public /* synthetic */ RunnableC0537x(List list, Object obj, Object obj2, Object obj3, Activity activity, int i9) {
        this.f1690g = i9;
        this.f1691h = list;
        this.f1693j = obj;
        this.f1694k = obj2;
        this.f1695l = obj3;
        this.f1692i = activity;
    }

    public /* synthetic */ RunnableC0537x(InterfaceC5059kv interfaceC5059kv, C5752m c5752m, Activity activity, Object obj, C5748i c5748i) {
        this.f1690g = 20;
        this.f1691h = interfaceC5059kv;
        this.f1694k = c5752m;
        this.f1692i = activity;
        this.f1693j = obj;
        this.f1695l = c5748i;
    }
}
