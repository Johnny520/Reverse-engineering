package p036c9;

import ac.RunnableC0059l;
import ac.SharedPreferencesC0062o;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.view.Window;
import android.widget.Toast;
import ba.C0223c;
import ba.C0224d;
import ba.C0227g;
import ba.EnumC0222b;
import ba.EnumC0234n;
import be.AbstractC0283h;
import bi.C0315c;
import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import gg.C1424t;
import gg.C1425u;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p003a2.C0014a;
import p007a7.AbstractC0018a;
import p015b0.C0153s;
import p025bc.AbstractC0255e;
import p051db.C0765c;
import p068eh.AbstractC0921a;
import p078f9.C1092c;
import p078f9.C1094e;
import p078f9.C1095f;
import p078f9.C1096g;
import p078f9.C1097h;
import p080fb.AbstractC1184v0;
import p080fb.C1113d1;
import p080fb.C1125g1;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p099h.Hchat.hooks.items.script.ScriptPluginBridge;
import p099h.Hchat.hooks.items.script.ScriptWaBridge;
import p116i.AbstractC1742d;
import p116i.C1740c0;
import p116i.C1743d0;
import p116i.C1806z0;
import p117i0.C1845j1;
import p117i0.InterfaceC1809a1;
import p136j8.AbstractC2091b;
import p144k.C2209s1;
import p153k8.C2355s;
import p197n9.C2912a;
import p198nb.AbstractC2935f0;
import p218og.AbstractC3149m;
import p237q2.C3431e;
import p244qb.C3488i;
import p244qb.C3490k;
import p249qg.InterfaceC3599t;
import p251r.C3641z;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p300ub.AbstractC4302b;
import p315v8.C4521a;
import p315v8.C4538r;
import p332wb.AbstractC4702a1;
import p332wb.AbstractC4855en;
import p332wb.AbstractC4955ho;
import p332wb.AbstractC5394v3;
import p332wb.C4737b3;
import p332wb.C4799d;
import p332wb.C4819dj;
import p332wb.C4925gr;
import p332wb.C4958hr;
import p332wb.C4969i5;
import p332wb.C5047kj;
import p332wb.C5071la;
import p332wb.C5155ns;
import p332wb.C5292s0;
import p332wb.C5295s3;
import p332wb.C5330t5;
import p332wb.C5361u3;
import p332wb.C5387ut;
import p332wb.C5391v0;
import p332wb.C5457x0;
import p332wb.C5489y0;
import p332wb.C5491y2;
import p332wb.EnumC4897g;
import p332wb.EnumC5092lv;
import p332wb.EnumC5358u0;
import p332wb.RunnableC5421vu;
import p345x8.C5726s;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.C4175v;

/* JADX INFO: renamed from: c9.n0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0467n0 implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1380g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f1381h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f1382i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f1383j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f1384k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0467n0(C3490k c3490k, C3488i c3488i, String str, Activity activity) {
        this.f1380g = 8;
        this.f1381h = c3490k;
        this.f1383j = c3488i;
        this.f1382i = str;
        this.f1384k = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:149:0x045c  */
    @Override // p085fg.InterfaceC1220a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        C1096g c1096g;
        C2355s c2355s;
        WeChatMessage weChatMessageM5661c;
        Object c3959f;
        Object c3959f2;
        C0224d c0224d;
        Object c3959f3;
        SharedPreferences sharedPreferencesM8638a;
        View decorView;
        View decorView2;
        int i9 = 0;
        switch (this.f1380g) {
            case 0:
                AbstractC0473o2 abstractC0473o2 = (AbstractC0473o2) this.f1381h;
                String str = (String) this.f1382i;
                String str2 = ((C0424c1) this.f1383j).f1216a;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f1384k;
                if ((abstractC0473o2 instanceof C0436f1) && AbstractC1416l.m3825a(str, str2)) {
                    interfaceC1231l.invoke(null);
                } else {
                    interfaceC1231l.invoke(str2);
                }
                return C3967n.f12976a;
            case 1:
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f1381h;
                Activity activity = (Activity) this.f1382i;
                InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) this.f1383j;
                InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) this.f1384k;
                interfaceC1220a.invoke();
                C0430e c0430e = C0430e.f1252a;
                C0153s c0153s = new C0153s(interfaceC1220a2, activity, interfaceC1220a3, 3);
                activity.getClass();
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType("application/json");
                intent.addFlags(1);
                C0430e.m1448b(activity, intent);
                c0430e.m1450a(activity, C0422c.f1208b, intent, c0153s, new C0315c(5));
                return C3967n.f12976a;
            case 2:
                return ScriptPluginBridge.applyModuleFloatingGlassBar$lambda$1((ScriptPluginBridge) this.f1381h, (View) this.f1383j, (Map) this.f1384k, (String) this.f1382i);
            case 3:
                return ScriptWaBridge.downloadImages$lambda$1((Consumer) this.f1381h, (ScriptWaBridge) this.f1383j, (List) this.f1384k, (String) this.f1382i);
            case 4:
                C1094e c1094e = (C1094e) this.f1381h;
                C1097h c1097h = (C1097h) this.f1382i;
                C1092c c1092c = (C1092c) this.f1383j;
                Activity activity2 = (Activity) this.f1384k;
                Context context = c1094e.f3512a.f12143a;
                long j3 = c1097h.f3529a;
                Object obj = c1092c.f3508b;
                String string = AbstractC4302b.m8640c(context, "Hchat_edit_message_backup").getString(AbstractC0283h.m1169l(j3), HttpUrl.FRAGMENT_ENCODE_SET);
                if (string == null) {
                    c1096g = new C1096g();
                } else {
                    String str3 = string.length() > 0 ? string : null;
                    if (str3 == null || WeChatApis.message() == null || (c2355s = WeChatApis.messageStoreApi) == null || (weChatMessageM5661c = c2355s.m5661c(j3)) == null) {
                        c1096g = new C1096g();
                    } else {
                        String str4 = weChatMessageM5661c.content;
                        C1095f c1095fM1158f0 = AbstractC0283h.m1158f0(weChatMessageM5661c, str3, obj);
                        if (c1095fM1158f0.f3519a) {
                            AbstractC0283h.m1148a0(weChatMessageM5661c, str3);
                            AbstractC4302b.m8640c(context, "Hchat_edit_message_backup").edit().remove(AbstractC0283h.m1169l(j3)).apply();
                        }
                        boolean z9 = c1095fM1158f0.f3519a;
                        c1096g = new C1096g(weChatMessageM5661c.msgId, str4, str3, AbstractC0283h.m1181s(weChatMessageM5661c, str4), AbstractC0283h.m1181s(weChatMessageM5661c, str3), z9, z9 && !c1095fM1158f0.f3520b, weChatMessageM5661c.isTransfer());
                    }
                }
                boolean z10 = c1096g.f3521a;
                C1094e.m2816d(activity2, !z10 ? "没有可恢复内容" : c1096g.f3522b ? "已恢复，退出重进聊天后生效" : "已恢复");
                return Boolean.valueOf(z10);
            case 5:
                Float f3 = (Float) this.f1381h;
                C1743d0 c1743d0 = (C1743d0) this.f1382i;
                Float f10 = (Float) this.f1383j;
                C1740c0 c1740c0 = (C1740c0) this.f1384k;
                if (!f3.equals(c1743d0.f5819g) || !f10.equals(c1743d0.f5820h)) {
                    c1743d0.f5819g = f3;
                    c1743d0.f5820h = f10;
                    c1743d0.f5822j = new C1806z0(c1740c0, AbstractC1742d.f5810j, f3, f10, null);
                    c1743d0.f5826n.f5845b.setValue(Boolean.TRUE);
                    c1743d0.f5823k = false;
                    c1743d0.f5824l = true;
                }
                return C3967n.f12976a;
            case 6:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f1381h;
                C1424t c1424t = (C1424t) this.f1382i;
                C1425u c1425u = (C1425u) this.f1383j;
                C1425u c1425u2 = (C1425u) this.f1384k;
                if (atomicBoolean.compareAndSet(false, true)) {
                    AbstractC2935f0.f9623a.post(new RunnableC0059l(c1424t, c1425u, c1425u2, 22));
                }
                return C3967n.f12976a;
            case 7:
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f1381h;
                C3490k c3490k = (C3490k) this.f1382i;
                ArrayList arrayList = (ArrayList) this.f1383j;
                Activity activity3 = (Activity) this.f1384k;
                if (!atomicBoolean2.get()) {
                    C3490k.m7298e(arrayList);
                }
                c3490k.f11341l.remove(activity3);
                return C3967n.f12976a;
            case 8:
                C3490k c3490k2 = (C3490k) this.f1381h;
                C3488i c3488i = (C3488i) this.f1383j;
                String str5 = (String) this.f1382i;
                Activity activity4 = (Activity) this.f1384k;
                boolean zM7315G = c3490k2.m7315G(c3488i, str5);
                C3490k.m7295N(activity4, zM7315G ? "收藏语音已发送" : "收藏语音发送失败");
                if (zM7315G && !activity4.isFinishing()) {
                    activity4.finish();
                }
                return C3967n.f12976a;
            case 9:
                Context context2 = (Context) this.f1381h;
                AbstractC4702a1 abstractC4702a1 = (AbstractC4702a1) this.f1382i;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f1383j;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f1384k;
                String str6 = ((C5457x0) abstractC4702a1).f21842a.f1179a;
                str6.getClass();
                boolean zM1481e = AbstractC0473o2.m1481e(context2, AbstractC0000a.m99x0(str6));
                Toast.makeText(context2, zM1481e ? "分组已删除" : "分组删除失败", 0).show();
                if (zM1481e) {
                    interfaceC1809a1.setValue(AbstractC0473o2.m1485i(context2));
                    C0429d2.m1445y(context2);
                    interfaceC1809a12.setValue(C5489y0.f22055a);
                }
                return C3967n.f12976a;
            case 10:
                ((InterfaceC1236q) this.f1381h).mo734b((String) ((InterfaceC1809a1) this.f1382i).getValue(), AbstractC0018a.m246j((String) ((InterfaceC1809a1) this.f1383j).getValue()), AbstractC0018a.m246j((String) ((InterfaceC1809a1) this.f1384k).getValue()));
                return C3967n.f12976a;
            case 11:
                C5330t5 c5330t5 = (C5330t5) this.f1381h;
                InterfaceC1220a interfaceC1220a4 = (InterfaceC1220a) this.f1382i;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f1383j;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f1384k;
                if (c5330t5 == null) {
                    interfaceC1220a4.invoke();
                } else {
                    interfaceC1809a13.setValue(null);
                    interfaceC1809a14.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                }
                return C3967n.f12976a;
            case 12:
                C4737b3 c4737b3 = (C4737b3) this.f1381h;
                Context context3 = (Context) this.f1382i;
                InterfaceC1220a interfaceC1220a5 = (InterfaceC1220a) this.f1383j;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f1384k;
                if (c4737b3.f15965d || !((Set) interfaceC1809a15.getValue()).isEmpty()) {
                    InterfaceC1231l interfaceC1231l2 = c4737b3.f15964c;
                    Set set = (Set) interfaceC1809a15.getValue();
                    String str7 = c4737b3.f15966e;
                    boolean z11 = c4737b3.f15965d;
                    ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(set));
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        AbstractC2091b.m5171r((String) it.next(), arrayList2);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : arrayList2) {
                        if (((String) obj2).length() > 0) {
                            arrayList3.add(obj2);
                        }
                    }
                    List listM8407P1 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList3));
                    interfaceC1231l2.invoke(listM8407P1.isEmpty() ? HttpUrl.FRAGMENT_ENCODE_SET : z11 ? AbstractC4166m.m8392A1(listM8407P1, str7, null, null, null, 62) : (String) AbstractC4166m.m8422t1(listM8407P1));
                    interfaceC1220a5.invoke();
                } else {
                    Toast.makeText(context3, "请选择收藏", 0).show();
                }
                return C3967n.f12976a;
            case 13:
                C5292s0 c5292s0 = (C5292s0) this.f1381h;
                Context context4 = (Context) this.f1382i;
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f1383j;
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) this.f1384k;
                interfaceC1809a16.setValue(c5292s0.f20550a);
                Activity activity5 = context4 instanceof Activity ? (Activity) context4 : null;
                if (activity5 != null) {
                    C5491y2.m9799Q1(activity5, c5292s0.f20551b, "管理自定义好友头像", AbstractC0000a.m101y0(new C3958e("更换头像", "重新选择一张本地图片"), new C3958e("恢复微信头像", "删除当前自定义头像")), new C0454k(activity5, c5292s0, context4, interfaceC1809a17, 17), new C2209s1(25), EnumC5092lv.f18824j);
                }
                return C3967n.f12976a;
            case 14:
                Context context5 = (Context) this.f1381h;
                List list = (List) this.f1382i;
                InterfaceC1231l interfaceC1231l3 = (InterfaceC1231l) this.f1384k;
                C0765c c0765c = (C0765c) this.f1383j;
                Activity activity6 = context5 instanceof Activity ? (Activity) context5 : null;
                if (activity6 == null) {
                    Toast.makeText(context5, "当前页面无法打开时间选择器", 0).show();
                } else {
                    Long l10 = (Long) AbstractC4166m.m8394C1(list);
                    AbstractC4955ho.m9556g7(activity6, (l10 != null ? l10.longValue() : System.currentTimeMillis()) + 300000, new C4819dj(interfaceC1231l3, c0765c, list, 0));
                }
                return C3967n.f12976a;
            case 15:
                Activity activity7 = (Activity) this.f1381h;
                EnumC0234n enumC0234n = (EnumC0234n) this.f1382i;
                C4819dj c4819dj = new C4819dj((InterfaceC1220a) this.f1383j, (Context) this.f1384k, enumC0234n, 1);
                C0227g c0227g = C0227g.f563a;
                C3967n c3967n = C3967n.f12976a;
                enumC0234n.getClass();
                C0227g c0227g2 = C0227g.f563a;
                c0227g2.m921a(activity7.getClass());
                c0227g2.m921a(Activity.class);
                int iUpdateAndGet = C0227g.f564b.updateAndGet(new C0223c(0));
                ConcurrentHashMap concurrentHashMap = C0227g.f565c;
                concurrentHashMap.put(Integer.valueOf(iUpdateAndGet), new C0224d(activity7, enumC0234n, c4819dj));
                Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent2.addCategory("android.intent.category.OPENABLE");
                intent2.setType("image/*");
                intent2.addFlags(1);
                intent2.addFlags(64);
                try {
                    activity7.startActivityForResult(intent2, iUpdateAndGet);
                    c3959f = c3967n;
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                if (C3960g.m8182b(c3959f) != null) {
                    Intent intent3 = new Intent("android.intent.action.GET_CONTENT");
                    intent3.addCategory("android.intent.category.OPENABLE");
                    intent3.setType("image/*");
                    intent3.addFlags(1);
                    try {
                        activity7.startActivityForResult(Intent.createChooser(intent3, "选择消息气泡图片"), iUpdateAndGet);
                        c3959f2 = c3967n;
                    } catch (Throwable th3) {
                        c3959f2 = new C3959f(th3);
                    }
                    if (C3960g.m8182b(c3959f2) != null && (c0224d = (C0224d) concurrentHashMap.remove(Integer.valueOf(iUpdateAndGet))) != null) {
                        c0224d.f558c.invoke(EnumC0222b.f553i);
                    }
                }
                return c3967n;
            case 16:
                AbstractC4955ho.m9656s((InterfaceC3599t) this.f1381h, (InterfaceC1809a1) this.f1382i, (InterfaceC1809a1) this.f1383j, (InterfaceC1809a1) this.f1384k, true);
                return C3967n.f12976a;
            case 17:
                InterfaceC1231l interfaceC1231l4 = (InterfaceC1231l) this.f1384k;
                C5726s c5726s = (C5726s) this.f1381h;
                interfaceC1231l4.invoke(new C5391v0(AbstractC4955ho.m9395N4(c5726s.f23313b), (EnumC5358u0) this.f1382i, true, AbstractC4955ho.m9316D5(AbstractC4955ho.m9411P4(c5726s.f23314c)), new C5047kj((InterfaceC1231l) this.f1383j, c5726s, 2), c5726s.f23313b == 6, Opcodes.CHECKCAST));
                return C3967n.f12976a;
            case 18:
                Context context6 = (Context) this.f1381h;
                InterfaceC1220a interfaceC1220a6 = (InterfaceC1220a) this.f1382i;
                InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) this.f1383j;
                InterfaceC1809a1 interfaceC1809a19 = (InterfaceC1809a1) this.f1384k;
                if (((Number) interfaceC1809a18.getValue()).intValue() <= 0) {
                    if (AbstractC1416l.m3825a(AbstractC3149m.m6703R0((String) interfaceC1809a19.getValue()).toString(), "我同意")) {
                        ConcurrentHashMap concurrentHashMap2 = AbstractC4302b.f14346a;
                        Context applicationContext = context6.getApplicationContext();
                        Context context7 = applicationContext != null ? applicationContext : context6;
                        File fileM8641d = AbstractC4302b.m8641d(context7);
                        if (AbstractC4302b.m8639b(fileM8641d)) {
                            sharedPreferencesM8638a = AbstractC4302b.m8640c(context7, "Hchat_global_config");
                        } else {
                            String strM1020i = AbstractC0255e.m1020i(context7.getPackageName(), ":Hchat_global_config");
                            ConcurrentHashMap concurrentHashMap3 = AbstractC4302b.f14346a;
                            synchronized (concurrentHashMap3) {
                                if (AbstractC4302b.m8639b(fileM8641d)) {
                                    sharedPreferencesM8638a = AbstractC4302b.m8640c(context7, "Hchat_global_config");
                                } else {
                                    SharedPreferences sharedPreferences = (SharedPreferences) concurrentHashMap3.remove(strM1020i);
                                    if (sharedPreferences instanceof SharedPreferencesC0062o) {
                                        try {
                                            ((SharedPreferencesC0062o) sharedPreferences).m377c();
                                            c3959f3 = C3967n.f12976a;
                                        } catch (Throwable th4) {
                                            c3959f3 = new C3959f(th4);
                                        }
                                        Throwable thM8182b = C3960g.m8182b(c3959f3);
                                        if (thM8182b != null) {
                                            AbstractC1184v0.m3204n("[Hchat:Storage] 关闭失效配置失败: Hchat_global_config " + thM8182b.getMessage(), thM8182b);
                                        }
                                    }
                                    sharedPreferencesM8638a = AbstractC4302b.m8638a(context7, "Hchat_global_config");
                                    AbstractC4302b.f14346a.put(strM1020i, sharedPreferencesM8638a);
                                }
                            }
                        }
                        try {
                        } catch (Throwable th5) {
                            AbstractC0921a.m2261x("[Hchat:TermsGate] 保存协议状态失败: ", th5.getMessage(), th5);
                        }
                        if (!sharedPreferencesM8638a.edit().putBoolean("terms_accepted", true).putInt("terms_version", 1).commit() || !sharedPreferencesM8638a.getBoolean("terms_accepted", false)) {
                            Toast.makeText(context6, "协议状态保存失败，请重试", 0).show();
                        } else if (sharedPreferencesM8638a.getInt("terms_version", 0) == 1) {
                            interfaceC1220a6.invoke();
                        }
                    } else {
                        Toast.makeText(context6, "请输入“我同意”后继续", 0).show();
                    }
                    break;
                } else {
                    AbstractC4855en.m9271o("请等待 ", ((Number) interfaceC1809a18.getValue()).intValue(), " 秒后继续", context6, 0);
                }
                return C3967n.f12976a;
            case 19:
                C4969i5 c4969i5 = (C4969i5) this.f1381h;
                SharedPreferences sharedPreferences2 = (SharedPreferences) this.f1382i;
                InterfaceC1809a1 interfaceC1809a110 = (InterfaceC1809a1) this.f1383j;
                InterfaceC1809a1 interfaceC1809a111 = (InterfaceC1809a1) this.f1384k;
                int size = ((List) interfaceC1809a110.getValue()).size();
                int i10 = c4969i5.f17771a;
                if (i10 >= 0 && i10 < size) {
                    ArrayList arrayListM8409R1 = AbstractC4166m.m8409R1((List) interfaceC1809a110.getValue());
                    arrayListM8409R1.remove(i10);
                    interfaceC1809a110.setValue(arrayListM8409R1);
                    sharedPreferences2.edit().putString("message_block_bindings", C0014a.m175e(arrayListM8409R1)).apply();
                }
                interfaceC1809a111.setValue(null);
                return C3967n.f12976a;
            case 20:
                Context context8 = (Context) this.f1381h;
                InterfaceC1809a1 interfaceC1809a112 = (InterfaceC1809a1) this.f1382i;
                InterfaceC1809a1 interfaceC1809a113 = (InterfaceC1809a1) this.f1383j;
                InterfaceC1809a1 interfaceC1809a114 = (InterfaceC1809a1) this.f1384k;
                Activity activity8 = context8 instanceof Activity ? (Activity) context8 : null;
                if (activity8 != null) {
                    C4799d c4799d = C4799d.f16474a;
                    C5071la c5071la = new C5071la(interfaceC1809a113, interfaceC1809a114, interfaceC1809a112, 14);
                    synchronized (c4799d) {
                        C4799d.f16476c = c5071la;
                        C4799d.f16478e = activity8;
                        c4799d.m9253a(activity8.getClass());
                        c4799d.m9253a(Activity.class);
                        Intent intent4 = new Intent("android.intent.action.OPEN_DOCUMENT");
                        intent4.addCategory("android.intent.category.OPENABLE");
                        intent4.setType("*/*");
                        intent4.addFlags(1);
                        intent4.addFlags(64);
                        AbstractC4955ho.m9299B4(activity8, intent4);
                        try {
                            activity8.startActivityForResult(intent4, 1212371547);
                        } catch (Throwable unused) {
                            Intent intent5 = new Intent("android.intent.action.GET_CONTENT");
                            intent5.addCategory("android.intent.category.OPENABLE");
                            intent5.setType("*/*");
                            intent5.addFlags(1);
                            activity8.startActivityForResult(Intent.createChooser(intent5, "选择音频文件"), 1212371547);
                        }
                        break;
                    }
                } else {
                    AbstractC4955ho.m9557h(context8, interfaceC1809a112, "当前页面无法打开文件选择器");
                }
                return C3967n.f12976a;
            case 21:
                C4538r c4538r = (C4538r) this.f1381h;
                InterfaceC1809a1 interfaceC1809a115 = (InterfaceC1809a1) this.f1382i;
                InterfaceC1809a1 interfaceC1809a116 = (InterfaceC1809a1) this.f1383j;
                InterfaceC1809a1 interfaceC1809a117 = (InterfaceC1809a1) this.f1384k;
                int size2 = ((List) interfaceC1809a115.getValue()).size() + 1;
                c4538r.getClass();
                String string2 = UUID.randomUUID().toString();
                string2.getClass();
                String strM2249l = AbstractC0921a.m2249l(size2, "转发规则 ");
                C4175v c4175v = C4175v.f13712g;
                interfaceC1809a116.setValue(new C4521a(string2, strM2249l, true, false, c4175v, c4175v, c4175v, C4538r.f14979b, false, 0L, false, HttpUrl.FRAGMENT_ENCODE_SET, false, HttpUrl.FRAGMENT_ENCODE_SET));
                interfaceC1809a117.setValue(EnumC4897g.f17315i);
                return C3967n.f12976a;
            case 22:
                Context context9 = (Context) this.f1381h;
                InterfaceC1809a1 interfaceC1809a118 = (InterfaceC1809a1) this.f1382i;
                AbstractC5394v3 abstractC5394v3 = (AbstractC5394v3) this.f1383j;
                InterfaceC1809a1 interfaceC1809a119 = (InterfaceC1809a1) this.f1384k;
                List list2 = (List) interfaceC1809a118.getValue();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : list2) {
                    if (!AbstractC1416l.m3825a(((C2912a) obj3).f9409a, ((C5295s3) abstractC5394v3).f20564a.f9409a)) {
                        arrayList4.add(obj3);
                    }
                }
                AbstractC4955ho.m9532e1(context9, interfaceC1809a118, arrayList4);
                Toast.makeText(context9, "群聊标签已删除", 0).show();
                interfaceC1809a119.setValue(C5361u3.f20988a);
                return C3967n.f12976a;
            case 23:
                InterfaceC1235p interfaceC1235p = (InterfaceC1235p) this.f1381h;
                C1113d1 c1113d1 = (C1113d1) this.f1382i;
                InterfaceC1809a1 interfaceC1809a120 = (InterfaceC1809a1) this.f1383j;
                InterfaceC1809a1 interfaceC1809a121 = (InterfaceC1809a1) this.f1384k;
                if (!AbstractC3149m.m6721t0((String) interfaceC1809a120.getValue())) {
                    interfaceC1235p.invoke(c1113d1, (String) interfaceC1809a120.getValue());
                    interfaceC1809a121.setValue(null);
                }
                return C3967n.f12976a;
            case 24:
                Context context10 = (Context) this.f1381h;
                String str8 = (String) this.f1382i;
                C1845j1 c1845j1 = (C1845j1) this.f1383j;
                C1845j1 c1845j12 = (C1845j1) this.f1384k;
                if (!((Boolean) c1845j1.getValue()).booleanValue()) {
                    Activity activity9 = context10 instanceof Activity ? (Activity) context10 : null;
                    if (activity9 == null) {
                        Toast.makeText(context10, "当前页面无法打开文件选择器", 0).show();
                    } else {
                        C4958hr c4958hr = C4958hr.f17734a;
                        C1125g1 c1125g1 = C1125g1.f3676a;
                        str8.getClass();
                        File file = new File(C1125g1.m2858a(context10), C1125g1.m2869m(str8));
                        file.mkdirs();
                        C5155ns c5155ns = new C5155ns(context10, c1845j12, 2);
                        synchronized (c4958hr) {
                            file.mkdirs();
                            C4958hr.f17736c = new C4925gr(activity9, file, c5155ns);
                            c4958hr.m9724a(activity9.getClass());
                            c4958hr.m9724a(Activity.class);
                            Intent intent6 = new Intent("android.intent.action.OPEN_DOCUMENT");
                            intent6.addCategory("android.intent.category.OPENABLE");
                            intent6.setType("*/*");
                            intent6.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                            intent6.addFlags(1);
                            intent6.addFlags(64);
                            AbstractC4955ho.m9299B4(activity9, intent6);
                            try {
                                activity9.startActivityForResult(intent6, 1212371550);
                            } catch (Throwable unused2) {
                                Intent intent7 = new Intent("android.intent.action.GET_CONTENT");
                                intent7.addCategory("android.intent.category.OPENABLE");
                                intent7.setType("*/*");
                                intent7.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                                intent7.addFlags(1);
                                activity9.startActivityForResult(Intent.createChooser(intent7, "选择文件或图片"), 1212371550);
                            }
                        }
                    }
                    break;
                }
                return C3967n.f12976a;
            case 25:
                List list3 = (List) this.f1381h;
                C3641z c3641z = (C3641z) this.f1382i;
                InterfaceC1231l interfaceC1231l5 = (InterfaceC1231l) this.f1384k;
                InterfaceC1809a1 interfaceC1809a122 = (InterfaceC1809a1) this.f1383j;
                String str9 = (String) interfaceC1809a122.getValue();
                interfaceC1809a122.setValue(null);
                if (str9 != null) {
                    Iterator it2 = list3.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            i9 = -1;
                        } else if (!AbstractC1416l.m3825a(((C5387ut) it2.next()).f21251b.f3586c, str9)) {
                            i9++;
                        }
                    }
                    if (i9 >= 0) {
                        C3641z.m7617l(c3641z, i9);
                    }
                    interfaceC1231l5.invoke(str9);
                }
                return C3967n.f12976a;
            case 26:
                InterfaceC1231l interfaceC1231l6 = (InterfaceC1231l) this.f1384k;
                InterfaceC1231l interfaceC1231l7 = (InterfaceC1231l) this.f1381h;
                InterfaceC1809a1 interfaceC1809a123 = (InterfaceC1809a1) this.f1382i;
                InterfaceC1809a1 interfaceC1809a124 = (InterfaceC1809a1) this.f1383j;
                if (!AbstractC3149m.m6721t0((String) interfaceC1809a123.getValue())) {
                    if (AbstractC1416l.m3825a((String) interfaceC1809a124.getValue(), "rename")) {
                        interfaceC1231l6.invoke((String) interfaceC1809a123.getValue());
                    } else {
                        interfaceC1231l7.invoke((String) interfaceC1809a123.getValue());
                    }
                    interfaceC1809a124.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                }
                return C3967n.f12976a;
            case 27:
                C1113d1 c1113d12 = (C1113d1) this.f1381h;
                InterfaceC1809a1 interfaceC1809a125 = (InterfaceC1809a1) this.f1382i;
                InterfaceC1809a1 interfaceC1809a126 = (InterfaceC1809a1) this.f1383j;
                InterfaceC1809a1 interfaceC1809a127 = (InterfaceC1809a1) this.f1384k;
                interfaceC1809a125.setValue(c1113d12.f3637b);
                interfaceC1809a126.setValue(c1113d12.f3636a);
                interfaceC1809a127.setValue(null);
                return C3967n.f12976a;
            case 28:
                AtomicBoolean atomicBoolean3 = (AtomicBoolean) this.f1381h;
                InterfaceC1220a interfaceC1220a7 = (InterfaceC1220a) this.f1382i;
                Activity activity10 = (Activity) this.f1383j;
                InterfaceC1231l interfaceC1231l8 = (InterfaceC1231l) this.f1384k;
                if (atomicBoolean3.compareAndSet(false, true)) {
                    interfaceC1220a7.invoke();
                    C0471o0 c0471o0 = new C0471o0(interfaceC1231l8, 10);
                    Window window = activity10.getWindow();
                    if (window != null && (decorView = window.getDecorView()) != null) {
                        decorView.postOnAnimation(new RunnableC5421vu(activity10, c0471o0));
                    }
                }
                return C3967n.f12976a;
            default:
                Long l11 = (Long) this.f1381h;
                InterfaceC1220a interfaceC1220a8 = (InterfaceC1220a) this.f1382i;
                Activity activity11 = (Activity) this.f1383j;
                InterfaceC1231l interfaceC1231l9 = (InterfaceC1231l) this.f1384k;
                if (l11 != null) {
                    long jLongValue = l11.longValue();
                    interfaceC1220a8.invoke();
                    C3431e c3431e = new C3431e(interfaceC1231l9, jLongValue, 1);
                    Window window2 = activity11.getWindow();
                    if (window2 != null && (decorView2 = window2.getDecorView()) != null) {
                        decorView2.postOnAnimation(new RunnableC5421vu(activity11, c3431e));
                    }
                }
                return C3967n.f12976a;
        }
    }

    public /* synthetic */ C0467n0(Object obj, Object obj2, InterfaceC1231l interfaceC1231l, Object obj3, int i9) {
        this.f1380g = i9;
        this.f1381h = obj;
        this.f1382i = obj2;
        this.f1384k = interfaceC1231l;
        this.f1383j = obj3;
    }

    public /* synthetic */ C0467n0(Object obj, Object obj2, Object obj3, Object obj4, int i9) {
        this.f1380g = i9;
        this.f1381h = obj;
        this.f1382i = obj2;
        this.f1383j = obj3;
        this.f1384k = obj4;
    }

    public /* synthetic */ C0467n0(Object obj, String str, Object obj2, Object obj3, int i9) {
        this.f1380g = i9;
        this.f1381h = obj;
        this.f1383j = obj2;
        this.f1384k = obj3;
        this.f1382i = str;
    }

    public /* synthetic */ C0467n0(InterfaceC1231l interfaceC1231l, Object obj, Object obj2, Object obj3, int i9) {
        this.f1380g = i9;
        this.f1384k = interfaceC1231l;
        this.f1381h = obj;
        this.f1382i = obj2;
        this.f1383j = obj3;
    }
}
