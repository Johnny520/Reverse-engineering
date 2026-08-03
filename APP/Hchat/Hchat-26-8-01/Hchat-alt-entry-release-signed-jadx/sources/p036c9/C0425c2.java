package p036c9;

import ac.RunnableC0059l;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import be.AbstractC0283h;
import ca.C0513c0;
import ca.C0517e0;
import ca.RunnableC0537x;
import de.robv.android.xposed.XC_MethodHook;
import gg.AbstractC1416l;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import na.C2914b;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p009a9.C0031h;
import p011ab.C0042b;
import p014b.C0126e;
import p020b5.C0184c;
import p024b9.RunnableC0217c;
import p025bc.C0260j;
import p068eh.AbstractC0921a;
import p077f8.C1082b;
import p077f8.C1083c;
import p077f8.C1087g;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p096g8.C1360a;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.utils.KavaReflector;
import p107h9.C1629d;
import p108ha.C1649j0;
import p109hb.C1671c;
import p109hb.C1684i0;
import p109hb.C1697t;
import p109hb.EnumC1680g0;
import p125i8.C2005i;
import p126ia.C2026t;
import p144k.C2209s1;
import p153k8.AbstractC2338b;
import p153k8.C2343g;
import p153k8.C2347k;
import p153k8.C2353q;
import p167l8.C2530e;
import p183m8.C2815c;
import p184m9.C2819d;
import p184m9.C2820e;
import p184m9.EnumC2818c;
import p198nb.C2924a;
import p212oa.AbstractC3107b;
import p212oa.C3106a;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p222p.AbstractC3199a;
import p242q8.C3454i;
import p242q8.C3455j;
import p242q8.C3460o;
import p242q8.C3462q;
import p242q8.InterfaceC3461p;
import p244qb.C3481b;
import p244qb.C3488i;
import p244qb.C3490k;
import p258r8.C3742g;
import p259r9.AbstractC3754e0;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p300ub.AbstractC4302b;
import p332wb.C5491y2;
import p332wb.EnumC5092lv;
import p343x6.AbstractC5700d;
import p347xa.C5748i;
import p347xa.C5752m;
import p347xa.RunnableC5743d;
import p365y9.C6006b;
import p380z8.C6126b;
import p380z8.C6128d;
import p380z8.C6130f;
import p380z8.C6131g;
import qa.C3478f;
import qa.EnumC3474b;
import tf.AbstractC4165l;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: c9.c2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0425c2 extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1220a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1221b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f1222c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0425c2(Context context, InterfaceC1235p interfaceC1235p) {
        this.f1220a = 3;
        ConcurrentHashMap.KeySetView keySetView = C1629d.f5334a;
        this.f1221b = context;
        this.f1222c = interfaceC1235p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    private final void m1414a(XC_MethodHook.MethodHookParam methodHookParam) {
        Object c3959f;
        C6130f c6130f = (C6130f) this.f1222c;
        C6131g c6131g = (C6131g) this.f1221b;
        methodHookParam.getClass();
        Object[] objArr = methodHookParam.args;
        Object objM8366C0 = objArr != null ? AbstractC4165l.m8366C0(3, objArr) : null;
        Boolean bool = objM8366C0 instanceof Boolean ? (Boolean) objM8366C0 : null;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            SharedPreferences sharedPreferences = c6131g.f24708c;
            if (!zBooleanValue ? sharedPreferences.getBoolean("call_block_outgoing_ringtone", false) : sharedPreferences.getBoolean("call_block_incoming_ringtone", false)) {
                Object[] objArr2 = methodHookParam.args;
                Object objM8366C02 = objArr2 != null ? AbstractC4165l.m8366C0(0, objArr2) : null;
                Long l10 = objM8366C02 instanceof Long ? (Long) objM8366C02 : null;
                if (l10 != null) {
                    try {
                        c3959f = KavaReflector.invokeOrThrow(c6130f.f24703b, methodHookParam.thisObject, l10);
                    } catch (Throwable th2) {
                        c3959f = new C3959f(th2);
                    }
                    if (!(c3959f instanceof C3959f)) {
                        methodHookParam.setResult((Object) null);
                    }
                    Throwable thM8182b = C3960g.m8182b(c3959f);
                    if (thM8182b != null) {
                        String genericString = c6130f.f24702a.toGenericString();
                        if (c6131g.f24710e.add(genericString)) {
                            c6131g.f24707b.invoke("CoreV2 通话铃声确认回调失败: " + genericString, thM8182b);
                        }
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i9 = this.f1220a;
        Object obj = this.f1222c;
        Object obj2 = this.f1221b;
        switch (i9) {
            case 0:
                C3742g c3742g = (C3742g) obj;
                methodHookParam.getClass();
                try {
                    if (AbstractC1416l.m3825a((String) obj2, "onResume")) {
                        C0429d2.m1445y(c3742g.f12143a);
                        C0429d2 c0429d2 = C0429d2.f1235a;
                        C0429d2.m1417B(methodHookParam.thisObject);
                        C0429d2.m1416A(methodHookParam.thisObject, c3742g.f12143a);
                        break;
                    }
                    return;
                } finally {
                    C0429d2.f1245k.remove();
                }
            case 12:
                Object obj3 = methodHookParam.thisObject;
                if (obj3 instanceof Activity) {
                    C3462q c3462q = (C3462q) obj;
                    Activity activity = (Activity) obj3;
                    C0184c c0184c = new C0184c();
                    c0184c.f469a = (String) obj2;
                    c0184c.f470b = activity;
                    c0184c.f471c = activity != null ? activity.getClass().getName() : HttpUrl.FRAGMENT_ENCODE_SET;
                    Iterator it = c3462q.f11229b.iterator();
                    while (it.hasNext()) {
                        try {
                            ((InterfaceC3461p) it.next()).mo5670a(c0184c);
                        } catch (Throwable th2) {
                            c3462q.m7265b("生命周期回调失败: " + th2.getMessage());
                        }
                    }
                    return;
                }
                return;
            case 13:
                methodHookParam.getClass();
                C3478f.m7272c((C3478f) obj2);
                return;
            case 16:
                methodHookParam.getClass();
                C6128d c6128d = (C6128d) obj2;
                ThreadLocal threadLocal = c6128d.f24697d;
                C6006b c6006b = c6128d.f24695b;
                ConcurrentHashMap.KeySetView keySetView = c6128d.f24699f;
                Integer num = (Integer) threadLocal.get();
                if (((num != null ? num.intValue() : 0) > 0) && AbstractC4302b.m8640c(c6128d.f24694a.f12143a, "Hchat_call_media_limit_config").getBoolean("call_media_limit_enable", false)) {
                    Object field = KavaReflector.readField(((C6126b) obj).f24690b, methodHookParam.thisObject);
                    if (field == null) {
                        if (keySetView.add("result")) {
                            c6006b.invoke("微信通话状态事件结果为空", null);
                            return;
                        }
                        return;
                    }
                    Object objComputeIfAbsent = c6128d.f24698e.computeIfAbsent(field.getClass(), new C0260j(new C2924a(c6128d, 29), 16));
                    objComputeIfAbsent.getClass();
                    List list = (List) objComputeIfAbsent;
                    if (list.isEmpty()) {
                        if (keySetView.add("fields")) {
                            c6006b.invoke("微信通话状态事件未找到布尔结果字段", null);
                            return;
                        }
                        return;
                    }
                    Iterator it2 = list.iterator();
                    while (true) {
                        boolean z9 = false;
                        while (it2.hasNext()) {
                            if (KavaReflector.writeField((Field) it2.next(), field, Boolean.FALSE) || z9) {
                                z9 = true;
                            }
                        }
                        if (z9 || !keySetView.add("write")) {
                            return;
                        }
                        c6006b.invoke("微信通话状态事件结果改写失败", null);
                        return;
                    }
                }
                return;
                break;
            default:
                super.afterHookedMethod(methodHookParam);
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v58, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r0v64, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r0v66, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r4v41, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r4v42, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r4v46, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0704  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object[] objArr;
        MenuItem menuItem;
        Object c3959f;
        EnumC1680g0 enumC1680g0;
        Object c3959f2;
        Iterator it;
        Object obj;
        Object[] objArr2;
        Object objM8366C0;
        Object obj2;
        boolean z9;
        String strM10271c0;
        String str;
        String str2;
        int iIndexOf;
        Object[] objArr3;
        Object[] objArr4;
        Object[] objArr5;
        MenuItem menuItem2;
        int i9 = 6;
        int i10 = 2;
        intent = null;
        Intent intent = null;
        int i11 = 0;
        switch (this.f1220a) {
            case 0:
                methodHookParam.getClass();
                ThreadLocal threadLocal = C0429d2.f1245k;
                threadLocal.remove();
                C0429d2 c0429d2 = C0429d2.f1235a;
                String strM1442v = C0429d2.m1442v(methodHookParam.thisObject);
                if (strM1442v != null) {
                    threadLocal.set(strM1442v);
                    return;
                }
                return;
            case 1:
                methodHookParam.getClass();
                C0517e0 c0517e0 = (C0517e0) this.f1221b;
                Method method = (Method) this.f1222c;
                C0042b c0042b = c0517e0.f1581c;
                int i12 = 0;
                if (c0517e0.f1583e.getBoolean("message_forward_multi_moments_enable", false) && (objArr = methodHookParam.args) != null) {
                    int length = objArr.length;
                    while (true) {
                        if (i12 < length) {
                            Object obj3 = objArr[i12];
                            menuItem = obj3 instanceof MenuItem ? (MenuItem) obj3 : null;
                            if (menuItem == null) {
                                i12++;
                            }
                        } else {
                            menuItem = null;
                        }
                    }
                    if (menuItem == null || menuItem.getItemId() != 1212370256) {
                        return;
                    }
                    methodHookParam.setResult((Object) null);
                    Activity activityM1516b = C0517e0.m1516b();
                    if (activityM1516b != null) {
                        List listM5564b = AbstractC2338b.m5564b(methodHookParam.thisObject);
                        ArrayList arrayList = new ArrayList();
                        Iterator it2 = listM5564b.iterator();
                        while (it2.hasNext()) {
                            C1697t c1697tM10298y = AbstractC5700d.m10298y(it2.next());
                            if (c1697tM10298y != null) {
                                arrayList.add(c1697tM10298y);
                            }
                        }
                        List listM8402K1 = AbstractC4166m.m8402K1(arrayList, new C0415a0(new C0031h(i9), i10));
                        if (listM5564b.isEmpty() || listM8402K1.size() != listM5564b.size()) {
                            c0517e0.m1532r(activityM1516b, "部分选中消息暂不支持转发到朋友圈");
                            return;
                        }
                        C0513c0 c0513c0M1525j = c0517e0.m1525j(activityM1516b, listM8402K1);
                        Intent intent2 = c0513c0M1525j.f1566a;
                        if (intent2 == null) {
                            c0517e0.m1532r(activityM1516b, c0513c0M1525j.f1567b);
                            return;
                        }
                        C0126e c0126eM1144X = AbstractC0283h.m1144X(methodHookParam.thisObject, method, c0042b);
                        if (c0126eM1144X == null) {
                            c0517e0.m1532r(activityM1516b, "无法退出多选状态，请稍后重试");
                            return;
                        } else {
                            c0126eM1144X.m640r(c0042b);
                            c0517e0.f1582d.post(new RunnableC0059l(activityM1516b, c0517e0, intent2, 8));
                            return;
                        }
                    }
                    return;
                }
                return;
            case 2:
                methodHookParam.getClass();
                if (AbstractC4302b.m8640c((Context) this.f1221b, "Hchat_fake_location_config").getBoolean("fake_location_enable", false)) {
                    methodHookParam.setResult(((InterfaceC1220a) this.f1222c).invoke());
                    return;
                }
                return;
            case 3:
                methodHookParam.getClass();
                ConcurrentHashMap.KeySetView keySetView = C1629d.f5334a;
                Context context = (Context) this.f1221b;
                InterfaceC1235p interfaceC1235p = (InterfaceC1235p) this.f1222c;
                try {
                    Object[] objArr6 = methodHookParam.args;
                    C1629d.m4152a(context, objArr6 != null ? AbstractC4165l.m8391z0(objArr6) : null, interfaceC1235p);
                    c3959f = C3967n.f12976a;
                    break;
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                Throwable thM8182b = C3960g.m8182b(c3959f);
                if (thM8182b != null) {
                    interfaceC1235p.invoke("虚拟定位运行时 Hook 失败", thM8182b);
                    return;
                }
                return;
            case 4:
                Method method2 = (Method) this.f1222c;
                C1649j0 c1649j0 = (C1649j0) this.f1221b;
                methodHookParam.getClass();
                try {
                    if (C1649j0.m4202m(method2)) {
                        C1649j0.m4196b(c1649j0, methodHookParam.thisObject, methodHookParam.args, C1649j0.m4201l(method2));
                    } else if (C1649j0.m4200k(method2) && !AbstractC1416l.m3825a(c1649j0.f5426e.get(), Boolean.TRUE) && c1649j0.f5423b.getBoolean("sns_anti_recall_enable", false)) {
                        C1649j0.m4195a(c1649j0, methodHookParam.args);
                    }
                    return;
                } catch (Throwable th3) {
                    AbstractC1184v0.m3204n("[Hchat:SnsAntiRecall] Hook处理失败", th3);
                    return;
                }
            case 5:
                methodHookParam.getClass();
                C1684i0 c1684i0 = (C1684i0) this.f1221b;
                Method method3 = (Method) this.f1222c;
                if (c1684i0.f5585d.getBoolean("selected_messages_enable", true)) {
                    Object[] objArr7 = methodHookParam.args;
                    Object objM8366C02 = objArr7 != null ? AbstractC4165l.m8366C0(0, objArr7) : null;
                    MenuItem menuItem3 = objM8366C02 instanceof MenuItem ? (MenuItem) objM8366C02 : null;
                    if (menuItem3 != null) {
                        int itemId = menuItem3.getItemId();
                        if (itemId == 1212371789) {
                            enumC1680g0 = EnumC1680g0.f5568g;
                        } else if (itemId != 1212371796) {
                            return;
                        } else {
                            enumC1680g0 = EnumC1680g0.f5569h;
                        }
                        EnumC1680g0 enumC1680g02 = enumC1680g0;
                        methodHookParam.setResult((Object) null);
                        C3460o c3460oCurrentActivity = WeChatApis.currentActivity();
                        Activity activityM7263a = c3460oCurrentActivity != null ? c3460oCurrentActivity.m7263a() : null;
                        if (activityM7263a == null) {
                            activityM7263a = null;
                        }
                        Activity activity = (activityM7263a == null || activityM7263a.isFinishing()) ? null : activityM7263a;
                        if (activity == null) {
                            return;
                        }
                        List listM5564b2 = AbstractC2338b.m5564b(methodHookParam.thisObject);
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it3 = listM5564b2.iterator();
                        while (it3.hasNext()) {
                            C1697t c1697tM10298y2 = AbstractC5700d.m10298y(it3.next());
                            if (c1697tM10298y2 != null) {
                                arrayList2.add(c1697tM10298y2);
                            }
                        }
                        int i13 = 19;
                        List listM8402K12 = AbstractC4166m.m8402K1(arrayList2, new C0415a0(new C0031h(i13), i13));
                        if (listM5564b2.isEmpty() || listM8402K12.size() != listM5564b2.size()) {
                            c1684i0.m4288e(activity, "部分选中消息暂不支持发送");
                            return;
                        }
                        C0126e c0126eM1144X2 = AbstractC0283h.m1144X(methodHookParam.thisObject, method3, c1684i0.f5583b);
                        if (c0126eM1144X2 == null) {
                            c1684i0.m4288e(activity, "无法退出多选状态，请稍后重试");
                            return;
                        } else {
                            c1684i0.f5584c.post(new RunnableC0537x(7, activity, enumC1680g02, c1684i0, listM8402K12, c0126eM1144X2));
                            return;
                        }
                    }
                    return;
                }
                return;
            case 6:
                methodHookParam.getClass();
                C1671c c1671c = (C1671c) this.f1221b;
                Method method4 = (Method) this.f1222c;
                C2026t c2026t = (C2026t) c1671c.f5521h;
                if (((SharedPreferences) c1671c.f5522i).getBoolean("multi_recall_enable", false)) {
                    Object[] objArr8 = methodHookParam.args;
                    Object objM8366C03 = objArr8 != null ? AbstractC4165l.m8366C0(0, objArr8) : null;
                    MenuItem menuItem4 = objM8366C03 instanceof MenuItem ? (MenuItem) objM8366C03 : null;
                    if (menuItem4 == null || menuItem4.getItemId() != 1212371523) {
                        return;
                    }
                    C3460o c3460oCurrentActivity2 = WeChatApis.currentActivity();
                    Activity activityM7263a2 = c3460oCurrentActivity2 != null ? c3460oCurrentActivity2.m7263a() : null;
                    if (activityM7263a2 == null) {
                        activityM7263a2 = null;
                    }
                    Activity activity2 = (activityM7263a2 == null || activityM7263a2.isFinishing()) ? null : activityM7263a2;
                    List listM5564b3 = AbstractC2338b.m5564b(methodHookParam.thisObject);
                    List listM4267t = C1671c.m4267t(listM5564b3);
                    if (listM4267t == null) {
                        C1671c.m4263A(activity2, listM5564b3.isEmpty() ? "未找到选中的消息" : "只能批量撤回自己发送的消息");
                        methodHookParam.setResult((Object) null);
                        return;
                    }
                    C0126e c0126eM1144X3 = AbstractC0283h.m1144X(methodHookParam.thisObject, method4, c2026t);
                    if (c0126eM1144X3 == null) {
                        C1671c.m4263A(activity2, "无法退出多选状态，请稍后重试");
                        methodHookParam.setResult((Object) null);
                        return;
                    }
                    C2343g c2343gM6844q = AbstractC3199a.m6844q();
                    if (!listM4267t.isEmpty()) {
                        int i14 = 0;
                        for (Object obj4 : listM4267t) {
                            if (c2343gM6844q != null) {
                                try {
                                    boolean z10 = c2343gM6844q.m5597s(obj4) ? 1 : i11;
                                    c3959f2 = Boolean.valueOf(z10);
                                } catch (Throwable th4) {
                                    c3959f2 = new C3959f(th4);
                                }
                            }
                            Throwable thM8182b2 = C3960g.m8182b(c3959f2);
                            List list = listM4267t;
                            if (thM8182b2 != null) {
                                c2026t.invoke("批量撤回消息异常: msgId=" + C1671c.m4265q(obj4), thM8182b2);
                            }
                            Boolean bool = Boolean.FALSE;
                            if (c3959f2 instanceof C3959f) {
                                c3959f2 = bool;
                            }
                            if (((Boolean) c3959f2).booleanValue() && (i14 = i14 + 1) < 0) {
                                AbstractC0000a.m30P0();
                                throw null;
                            }
                            listM4267t = list;
                            i11 = 0;
                        }
                        i11 = i14;
                    }
                    C1671c.m4263A(activity2, AbstractC0921a.m2248k(i11, listM4267t.size(), "已发起撤回 ", "/", " 条消息"));
                    c0126eM1144X3.m640r(c2026t);
                    methodHookParam.setResult((Object) null);
                    return;
                }
                return;
            case 7:
                if (methodHookParam.args == null) {
                    return;
                }
                Iterator it4 = ((ArrayList) this.f1221b).iterator();
                while (it4.hasNext()) {
                    int iIntValue = ((Integer) it4.next()).intValue();
                    if (iIntValue >= 0) {
                        Object[] objArr9 = methodHookParam.args;
                        if (iIntValue >= objArr9.length || (obj = objArr9[iIntValue]) == null) {
                            it = it4;
                        } else {
                            C2347k c2347k = (C2347k) this.f1222c;
                            C1083c c1083c = c2347k.f7704d;
                            try {
                                C1360a c1360a = c2347k.f7702b;
                                String strM3652c = c1360a != null ? c1360a.m3652c() : HttpUrl.FRAGMENT_ENCODE_SET;
                                c2347k.f7703c.getClass();
                                C2530e c2530eM5651k = C2353q.m5651k(obj, strM3652c);
                                if (c2530eM5651k == null) {
                                    it = it4;
                                } else {
                                    it = it4;
                                    try {
                                        c1083c.m2715b(new C1087g(c2530eM5651k.f8179f, c2530eM5651k.f8180g, c2530eM5651k.f8181h, c2530eM5651k.f8178e, String.valueOf(c2530eM5651k.f8175b), c2530eM5651k.f8176c, c2530eM5651k.f8177d, c2530eM5651k.f8183j, c2530eM5651k.f8184k, null, false));
                                        if (c2530eM5651k.f8174a) {
                                            c1083c.m2715b(new C1082b());
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        c2347k.m5613d("派发消息事件失败: " + th.getMessage());
                                    }
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                it = it4;
                            }
                        }
                    }
                    it4 = it;
                }
                return;
            case 8:
                Method method5 = (Method) this.f1221b;
                C2815c c2815c = (C2815c) this.f1222c;
                if (c2815c.f9082c == null || C2815c.m6208f(method5) > C2815c.m6208f((Method) c2815c.f9083d)) {
                    c2815c.m6211b(methodHookParam.thisObject, "网络发包器已缓存", method5);
                    return;
                }
                return;
            case 9:
                EnumC2818c enumC2818c = EnumC2818c.DICE;
                methodHookParam.getClass();
                C2820e c2820e = (C2820e) this.f1221b;
                ThreadLocal threadLocal2 = c2820e.f9108d;
                C3742g c3742g = c2820e.f9105a;
                if (AbstractC1416l.m3825a(threadLocal2.get(), Boolean.TRUE) || (objArr2 = methodHookParam.args) == null || (objM8366C0 = AbstractC4165l.m8366C0(1, objArr2)) == null) {
                    return;
                }
                String strM6221b = c2820e.m6221b(objM8366C0, "field_name");
                String strM6221b2 = c2820e.m6221b(objM8366C0, "field_content");
                String strM6221b3 = c2820e.m6221b(objM8366C0, "field_md5");
                EnumC2818c enumC2818c2 = (AbstractC3156t.m6740d0(strM6221b, "dice", true) || AbstractC3149m.m6709h0(strM6221b2, "type=\"2\"", false) || C2820e.f9104l.contains(strM6221b3)) ? enumC2818c : (AbstractC3156t.m6740d0(strM6221b, "jsb", true) || AbstractC3149m.m6709h0(strM6221b2, "type=\"1\"", false) || C2820e.f9103k.contains(strM6221b3)) ? EnumC2818c.RPS : null;
                if (enumC2818c2 != null) {
                    if (!AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_game_emoji_config").getBoolean("game_emoji_pick_before_send", false)) {
                        if (AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_game_emoji_config").getBoolean("game_emoji_fixed_result", false)) {
                            if (c2820e.m6220a(objM8366C0, enumC2818c2, enumC2818c2 == enumC2818c ? AbstractC3754e0.m7909r(AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_game_emoji_config").getInt("game_emoji_dice_result", 1), 1, 6) : AbstractC3754e0.m7909r(AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_game_emoji_config").getInt("game_emoji_rps_result", 1), 1, 3))) {
                                return;
                            }
                            c2820e.f9106b.invoke("改写游戏表情结果失败", null);
                            return;
                        }
                        return;
                    }
                    Method method6 = (Method) this.f1222c;
                    C3460o c3460oCurrentActivity3 = WeChatApis.currentActivity();
                    Activity activityM7263a3 = c3460oCurrentActivity3 != null ? c3460oCurrentActivity3.m7263a() : null;
                    if (activityM7263a3 == null) {
                        activityM7263a3 = null;
                    }
                    if (activityM7263a3 != null) {
                        Activity activity3 = (activityM7263a3.isFinishing() || activityM7263a3.isDestroyed()) ? null : activityM7263a3;
                        if (activity3 != null) {
                            if (!c2820e.f9109e.compareAndSet(false, true)) {
                                methodHookParam.setResult((Object) null);
                                return;
                            }
                            Object obj5 = methodHookParam.thisObject;
                            Object[] objArr10 = methodHookParam.args;
                            objArr10.getClass();
                            C2819d c2819d = new C2819d(method6, obj5, Arrays.copyOf(objArr10, objArr10.length), enumC2818c2);
                            methodHookParam.setResult((Object) null);
                            c2820e.f9107c.post(new RunnableC0217c(activity3, c2820e, c2819d, enumC2818c2, 12));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 10:
                if (methodHookParam.args == null) {
                    return;
                }
                Iterator it5 = ((ArrayList) this.f1221b).iterator();
                while (it5.hasNext()) {
                    int iIntValue2 = ((Integer) it5.next()).intValue();
                    if (iIntValue2 >= 0) {
                        Object[] objArr11 = methodHookParam.args;
                        if (iIntValue2 < objArr11.length && (obj2 = objArr11[iIntValue2]) != null) {
                            C3106a c3106a = (C3106a) this.f1222c;
                            try {
                                z9 = c3106a.f10074a.m5853b().getBoolean("hb_auto_enable", false);
                            } catch (Throwable unused) {
                                z9 = false;
                            }
                            if (z9) {
                                try {
                                    String[] strArr = {"h", "i", "m"};
                                    int i15 = 0;
                                    while (true) {
                                        if (i15 < 3) {
                                            strM10271c0 = AbstractC5700d.m10271c0(obj2, strArr[i15]);
                                            if (TextUtils.isEmpty(strM10271c0) || !strM10271c0.contains("<wcpayinfo>")) {
                                                i15++;
                                            }
                                        } else {
                                            strM10271c0 = AbstractC5700d.m10271c0(obj2, "h");
                                            if (TextUtils.isEmpty(strM10271c0) || strM10271c0.matches("^-?\\d+$")) {
                                                strM10271c0 = null;
                                            }
                                        }
                                    }
                                    if (!TextUtils.isEmpty(strM10271c0) && strM10271c0.contains("<wcpayinfo>")) {
                                        int iIndexOf2 = strM10271c0.indexOf(":\n");
                                        String strSubstring = (iIndexOf2 <= 0 || strM10271c0.indexOf("<") <= iIndexOf2) ? strM10271c0 : strM10271c0.substring(iIndexOf2 + 2);
                                        String strM6615e = AbstractC3107b.m6615e(strSubstring, "nativeurl");
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("AddMsg wcpayinfo nativeurl=");
                                        sb2.append(TextUtils.isEmpty(strM6615e) ? "EMPTY" : strM6615e.substring(0, Math.min(50, strM6615e.length())));
                                        c3106a.m6610c(sb2.toString());
                                        if (TextUtils.isEmpty(strM6615e)) {
                                            String strM6615e2 = AbstractC3107b.m6615e(strM10271c0, "nativeurl");
                                            StringBuilder sb3 = new StringBuilder();
                                            sb3.append("  原始content中nativeurl=");
                                            sb3.append(TextUtils.isEmpty(strM6615e2) ? "EMPTY" : strM6615e2.substring(0, Math.min(50, strM6615e2.length())));
                                            c3106a.m6610c(sb3.toString());
                                            if (TextUtils.isEmpty(strM6615e2)) {
                                                str = strSubstring;
                                                str2 = strM6615e;
                                            } else {
                                                str2 = strM6615e2;
                                                str = strM10271c0;
                                            }
                                            if (TextUtils.isEmpty(str2)) {
                                                c3106a.m6610c("  放弃: 无法提取nativeurl");
                                            } else {
                                                String strM10271c02 = AbstractC5700d.m10271c0(obj2, "e");
                                                String strM10271c03 = AbstractC5700d.m10271c0(obj2, "f");
                                                String strM6324a = ((C2914b) c3106a.f10077d).f9449h.m6324a();
                                                String str3 = (!AbstractC3107b.m6616f(strM10271c03) && (AbstractC3107b.m6616f(strM10271c02) || TextUtils.isEmpty(strM6324a) || !strM6324a.equals(strM10271c02) || TextUtils.isEmpty(strM10271c03))) ? strM10271c02 : strM10271c03;
                                                if (TextUtils.isEmpty(str3)) {
                                                    str3 = strM10271c03;
                                                }
                                                String strM6615e3 = AbstractC3107b.m6615e(str, "fromusername");
                                                if (TextUtils.isEmpty(strM6615e3) && !TextUtils.isEmpty(strM10271c0) && (iIndexOf = strM10271c0.indexOf(":\n")) > 0) {
                                                    strM6615e3 = strM10271c0.substring(0, iIndexOf);
                                                }
                                                if (TextUtils.isEmpty(strM6615e3)) {
                                                    strM6615e3 = strM10271c02;
                                                }
                                                String strM6617g = AbstractC3107b.m6617g(strM6615e3);
                                                String strM6617g2 = AbstractC3107b.m6617g(str3);
                                                String strM6615e4 = AbstractC3107b.m6615e(str, "exclusive_recv_username");
                                                c3106a.m6610c("  from=" + strM10271c02 + " to=" + strM10271c03 + " talker=" + strM6617g2 + " sender=" + strM6617g);
                                                ((C2914b) c3106a.f10078e).f9449h.m6328e("AddMsg", str, strM6617g, strM6617g2, str2, strM6615e4);
                                            }
                                        }
                                    }
                                } catch (Throwable th7) {
                                    c3106a.m6610c("ERROR handleAddMsg: " + th7.getMessage());
                                }
                            }
                            break;
                        }
                    }
                }
                return;
            case 11:
                C3454i c3454i = (C3454i) this.f1222c;
                Object[] objArr12 = methodHookParam.args;
                if (objArr12 != null) {
                    int length2 = objArr12.length;
                    while (true) {
                        if (i11 < length2) {
                            Object obj6 = objArr12[i11];
                            if (obj6 instanceof Intent) {
                                intent = (Intent) obj6;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                if (intent != null) {
                    Method method7 = (Method) this.f1221b;
                    Iterator it6 = c3454i.f11204b.iterator();
                    while (it6.hasNext()) {
                        try {
                            ((C3455j) it6.next()).m7255a(intent, method7);
                        } catch (Throwable th8) {
                            String str4 = "Activity启动监听回调失败: " + th8.getMessage();
                            if (c3454i.f11203a != null) {
                                C2005i.m4939f("[WeChatActivityStartApi] ".concat(str4));
                            }
                        }
                    }
                    return;
                }
                return;
            case 12:
            case 16:
            default:
                super.beforeHookedMethod(methodHookParam);
                return;
            case 13:
                C3478f c3478f = (C3478f) this.f1221b;
                methodHookParam.getClass();
                Object[] objArr13 = methodHookParam.args;
                Object objM8366C04 = objArr13 != null ? AbstractC4165l.m8366C0(0, objArr13) : null;
                String str5 = objM8366C04 instanceof String ? (String) objM8366C04 : null;
                Object obj7 = methodHookParam.thisObject;
                View view = obj7 instanceof View ? (View) obj7 : null;
                if (C3478f.m7271b(c3478f, view, str5) || str5 == null) {
                    return;
                }
                for (int i16 = 0; i16 < str5.length(); i16++) {
                    if (Character.isDigit(str5.charAt(i16))) {
                        if (view != null) {
                            EnumC3474b enumC3474bM7278i = C3478f.m7278i(c3478f, view);
                            if (enumC3474bM7278i == null) {
                                enumC3474bM7278i = EnumC3474b.f11269g;
                            }
                            if ((!C3478f.m7277h(c3478f, enumC3474bM7278i) || AbstractC1416l.m3825a(c3478f.f11284d.get(view), Boolean.TRUE)) && C3478f.m7273d(c3478f, enumC3474bM7278i)) {
                                String strM7275f = C3478f.m7275f(c3478f, view, enumC3474bM7278i, str5);
                                String strM7270a = C3478f.m7270a(c3478f, enumC3474bM7278i, strM7275f);
                                ValueAnimator valueAnimatorM7284s = C3478f.m7284s(view);
                                if (valueAnimatorM7284s != null && valueAnimatorM7284s.isStarted()) {
                                    valueAnimatorM7284s.end();
                                }
                                String strM7281l = C3478f.m7281l(strM7275f, strM7270a);
                                C3478f.m7276g(c3478f, view, enumC3474bM7278i, strM7281l);
                                C3478f.m7274e(c3478f, enumC3474bM7278i, strM7275f);
                                Object[] objArr14 = methodHookParam.args;
                                if (objArr14 != null) {
                                    objArr14[0] = strM7281l;
                                }
                                if (((Method) this.f1222c).getParameterTypes().length != 2 || (objArr3 = methodHookParam.args) == null) {
                                    return;
                                }
                                objArr3[1] = Boolean.FALSE;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                return;
            case 14:
                methodHookParam.getClass();
                C3490k c3490k = (C3490k) this.f1221b;
                Method method8 = (Method) this.f1222c;
                if (c3490k.m7330p() && (objArr4 = methodHookParam.args) != null) {
                    Object objM8366C05 = AbstractC4165l.m8366C0(0, objArr4);
                    MenuItem menuItem5 = objM8366C05 instanceof MenuItem ? (MenuItem) objM8366C05 : null;
                    if (menuItem5 != null) {
                        Object[] objArr15 = menuItem5.getItemId() == 1212372557;
                        boolean z11 = menuItem5.getItemId() == 1212372558;
                        if (objArr15 == true || z11) {
                            if (!objArr15 == true || c3490k.m7321O("voice_forward_chat_multi_forward_enable")) {
                                if (!z11 || c3490k.f11332c.getBoolean("voice_forward_chat_multi_merge_enable", false)) {
                                    C3460o c3460oCurrentActivity4 = WeChatApis.currentActivity();
                                    Activity activityM7263a4 = c3460oCurrentActivity4 != null ? c3460oCurrentActivity4.m7263a() : null;
                                    Activity activity4 = activityM7263a4 != null ? activityM7263a4 : null;
                                    List listM5564b4 = AbstractC2338b.m5564b(methodHookParam.thisObject);
                                    if (!listM5564b4.isEmpty()) {
                                        if (!listM5564b4.isEmpty()) {
                                            Iterator it7 = listM5564b4.iterator();
                                            while (it7.hasNext()) {
                                                if (!C3490k.m7307u(it7.next())) {
                                                }
                                            }
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator it8 = listM5564b4.iterator();
                                        while (it8.hasNext()) {
                                            C3488i c3488iM7312D = c3490k.m7312D(it8.next());
                                            if (c3488iM7312D != null) {
                                                arrayList3.add(c3488iM7312D);
                                            }
                                        }
                                        if (arrayList3.size() != listM5564b4.size()) {
                                            C3490k.m7295N(activity4, "部分语音文件不存在");
                                            methodHookParam.setResult((Object) null);
                                            return;
                                        }
                                        C0126e c0126eM1144X4 = AbstractC0283h.m1144X(methodHookParam.thisObject, method8, c3490k.f11331b);
                                        if (c0126eM1144X4 == null) {
                                            C3490k.m7295N(activity4, "无法退出多选状态，请稍后重试");
                                            methodHookParam.setResult((Object) null);
                                            return;
                                        }
                                        if (activity4 == null) {
                                            C3490k.m7295N(null, "当前页面不可用");
                                        } else if (objArr15 == true) {
                                            c3490k.m7317I(activity4, arrayList3, c0126eM1144X4, null);
                                        } else {
                                            C5491y2.m9799Q1(activity4, "合并语音", "请选择合并语音的操作", AbstractC0000a.m101y0(new C3958e("转发", "选择好友或群聊发送合并语音"), new C3958e("保存", "保存合并后的 MP3 文件")), new C3481b(c3490k, activity4, arrayList3, c0126eM1144X4, 1), new C2209s1(7), EnumC5092lv.f18824j);
                                        }
                                        methodHookParam.setResult((Object) null);
                                        return;
                                    }
                                    C3490k.m7295N(activity4, "未找到选中的语音消息");
                                    methodHookParam.setResult((Object) null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 15:
                methodHookParam.getClass();
                C5752m c5752m = (C5752m) this.f1221b;
                Method method9 = (Method) this.f1222c;
                if (c5752m.m10445b() && (objArr5 = methodHookParam.args) != null) {
                    int length3 = objArr5.length;
                    while (true) {
                        if (i11 < length3) {
                            Object obj8 = objArr5[i11];
                            menuItem2 = obj8 instanceof MenuItem ? (MenuItem) obj8 : null;
                            if (menuItem2 == null) {
                                i11++;
                            }
                        } else {
                            menuItem2 = null;
                        }
                    }
                    if (menuItem2 == null || menuItem2.getItemId() != 1212371539) {
                        return;
                    }
                    C5748i c5748i = (C5748i) c5752m.f23419g.remove(menuItem2);
                    if (c5748i == null && (c5748i = c5752m.f23420h) == null) {
                        return;
                    }
                    c5752m.f23420h = null;
                    methodHookParam.setResult(AbstractC1416l.m3825a(method9.getReturnType(), Boolean.TYPE) ? Boolean.TRUE : null);
                    c5752m.f23416d.post(new RunnableC5743d(c5752m, c5748i, 1));
                    return;
                }
                return;
            case 17:
                m1414a(methodHookParam);
                return;
        }
    }

    public /* synthetic */ C0425c2(Object obj, int i9, Object obj2) {
        this.f1220a = i9;
        this.f1221b = obj;
        this.f1222c = obj2;
    }

    public /* synthetic */ C0425c2(int i9, Object obj, Object obj2, boolean z9) {
        this.f1220a = i9;
        this.f1222c = obj;
        this.f1221b = obj2;
    }
}
