package p036c9;

import ac.RunnableC0059l;
import android.app.Activity;
import android.app.Notification;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import be.C0285i;
import bi.C0315c;
import ca.C0512c;
import com.alibaba.fastjson2.codec.FieldInfo;
import de.robv.android.xposed.XC_MethodHook;
import gg.AbstractC1416l;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import ng.AbstractC3015m;
import ng.C3006d;
import ng.C3010h;
import ng.C3011i;
import ng.C3018p;
import ng.C3022t;
import okhttp3.HttpUrl;
import org.json.JSONObject;
import p000a.AbstractC0000a;
import p010aa.C0035c;
import p024b9.RunnableC0217c;
import p054dg.C0795n;
import p063e9.C0832c;
import p063e9.C0837h;
import p063e9.C0838i;
import p063e9.C0839j;
import p063e9.C0841l;
import p063e9.C0842m;
import p063e9.C0846q;
import p063e9.C0848s;
import p080fb.AbstractC1184v0;
import p092g4.AbstractC1341a;
import p096g8.C1360a;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p099h.Hchat.utils.KavaReflector;
import p116i.C1746e0;
import p167l8.C2529d;
import p167l8.EnumC2528c;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p219oh.AbstractC3165h;
import p258r8.C3742g;
import p276sf.C3958e;
import p276sf.C3959f;
import p286t8.AbstractC4137b;
import p286t8.C4136a;
import p300ub.AbstractC4302b;
import p332wb.C5491y2;
import tf.AbstractC4165l;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.AbstractC4178y;
import tf.C4173t;
import tf.C4176w;
import ua.C4296g;

/* JADX INFO: renamed from: c9.a2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0417a2 extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1199a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3742g f1200b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0417a2(C3742g c3742g, int i9) {
        this.f1199a = i9;
        this.f1200b = c3742g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:181:0x02e5 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v10, resolved type: android.database.MatrixCursor */
    /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: android.database.MatrixCursor */
    /* JADX DEBUG: Multi-variable search result rejected for r6v3, resolved type: android.database.MatrixCursor */
    /* JADX DEBUG: Multi-variable search result rejected for r6v4, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r6v5, resolved type: android.database.MatrixCursor */
    /* JADX WARN: Multi-variable type inference failed */
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object next;
        int columnIndex;
        String strM1442v;
        Object next2;
        int i9 = 0;
        int i10 = 1;
        switch (this.f1199a) {
            case 0:
                methodHookParam.getClass();
                String str = (String) C0429d2.f1244j.get();
                if (str != null) {
                    if (!C0429d2.m1438q(str)) {
                        str = null;
                    }
                    if (str != null) {
                        Object result = methodHookParam.getResult();
                        MatrixCursor matrixCursor = result instanceof Cursor ? (Cursor) result : 0;
                        if (matrixCursor != 0) {
                            Iterator it = AbstractC0473o2.m1485i(this.f1200b.f12143a).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next = it.next();
                                    if (C0429d2.m1421F(((C0414a) next).f1179a).equals(str)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            C0414a c0414a = (C0414a) next;
                            List list = c0414a != null ? c0414a.f1184f : null;
                            if (list == null) {
                                list = C4173t.f13710g;
                            }
                            if (matrixCursor.getCount() > 0 && (columnIndex = matrixCursor.getColumnIndex("username")) >= 0) {
                                int columnIndex2 = matrixCursor.getColumnIndex("flag");
                                int i11 = 2;
                                C3018p c3018p = new C3018p(new C1746e0(list, 25), i11);
                                int iM8438a0 = AbstractC4178y.m8438a0(AbstractC4167n.m8429e1(c3018p));
                                if (iM8438a0 < 16) {
                                    iM8438a0 = 16;
                                }
                                LinkedHashMap linkedHashMap = new LinkedHashMap(iM8438a0);
                                Iterator it2 = c3018p.iterator();
                                while (true) {
                                    C3006d c3006d = (C3006d) it2;
                                    if (c3006d.f9795i.hasNext()) {
                                        C4176w c4176w = (C4176w) c3006d.next();
                                        linkedHashMap.put((String) c4176w.f13714b, Integer.valueOf(c4176w.f13713a));
                                    } else {
                                        String[] columnNames = matrixCursor.getColumnNames();
                                        ArrayList arrayList = new ArrayList();
                                        int i12 = 0;
                                        while (matrixCursor.moveToNext()) {
                                            int length = columnNames.length;
                                            Object[] objArr = new Object[length];
                                            int i13 = i9;
                                            while (i13 < length) {
                                                int type = matrixCursor.getType(i13);
                                                objArr[i13] = type != 0 ? type != 1 ? type != i11 ? type != 4 ? matrixCursor.getString(i13) : matrixCursor.getBlob(i13) : Double.valueOf(matrixCursor.getDouble(i13)) : Long.valueOf(matrixCursor.getLong(i13)) : null;
                                                i13++;
                                                i11 = 2;
                                            }
                                            Object obj = objArr[columnIndex];
                                            String string = obj != null ? obj.toString() : null;
                                            if (string == null) {
                                                string = HttpUrl.FRAGMENT_ENCODE_SET;
                                            }
                                            if (columnIndex2 >= 0) {
                                                Object obj2 = objArr[columnIndex2];
                                                Number number = obj2 instanceof Number ? (Number) obj2 : null;
                                                long jLongValue = number != null ? number.longValue() : 0L;
                                                objArr[columnIndex2] = Long.valueOf(linkedHashMap.containsKey(string) ? jLongValue | FieldInfo.RECORD : jLongValue & (-4611686018427387905L));
                                            }
                                            Integer num = (Integer) linkedHashMap.get(string);
                                            arrayList.add(new C3958e(Integer.valueOf(num != null ? num.intValue() : list.size() + i12), objArr));
                                            i12++;
                                            i9 = 0;
                                            i11 = 2;
                                        }
                                        try {
                                            matrixCursor.close();
                                            break;
                                        } catch (Throwable unused) {
                                        }
                                        matrixCursor = new MatrixCursor(columnNames, arrayList.size());
                                        Iterator it3 = AbstractC4166m.m8402K1(arrayList, new C0444h1(i10)).iterator();
                                        while (it3.hasNext()) {
                                            matrixCursor.addRow((Object[]) ((C3958e) it3.next()).f12962h);
                                        }
                                    }
                                }
                            }
                            methodHookParam.setResult(matrixCursor);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                methodHookParam.getClass();
                C0429d2 c0429d2 = C0429d2.f1235a;
                final Object obj3 = methodHookParam.thisObject;
                final Context context = this.f1200b.f12143a;
                if (obj3 == null || (strM1442v = C0429d2.m1442v(obj3)) == null) {
                    return;
                }
                Iterator it4 = AbstractC0473o2.m1485i(context).iterator();
                while (true) {
                    if (it4.hasNext()) {
                        next2 = it4.next();
                        if (C0429d2.m1421F(((C0414a) next2).f1179a).equals(strM1442v)) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                C0414a c0414a2 = (C0414a) next2;
                if (c0414a2 == null) {
                    return;
                }
                Object field = KavaReflector.readField(obj3, "adapter");
                if (field != null) {
                    Map map = C0429d2.f1242h;
                    map.getClass();
                    map.put(field, strM1442v);
                }
                Object field2 = KavaReflector.readField(obj3, "emptyTipTv");
                TextView textView = field2 instanceof TextView ? (TextView) field2 : null;
                if (textView != null) {
                    textView.setText("当前分组没有会话");
                }
                Object field3 = KavaReflector.readField(obj3, "appbrandMessageLV");
                AdapterView adapterView = field3 instanceof AdapterView ? (AdapterView) field3 : null;
                if (adapterView != null) {
                    final String str2 = c0414a2.f1179a;
                    Map map2 = C0429d2.f1243i;
                    map2.getClass();
                    synchronized (map2) {
                        if (!map2.containsKey(adapterView)) {
                            final AdapterView.OnItemLongClickListener onItemLongClickListener = adapterView.getOnItemLongClickListener();
                            map2.put(adapterView, onItemLongClickListener);
                            adapterView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: c9.m1
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // android.widget.AdapterView.OnItemLongClickListener
                                public final boolean onItemLongClick(AdapterView adapterView2, View view, int i14, long j3) {
                                    Object c3959f;
                                    ThreadLocal threadLocal = C0429d2.f1246l;
                                    C0429d2 c0429d22 = C0429d2.f1235a;
                                    try {
                                        c3959f = adapterView2.getItemAtPosition(i14);
                                    } catch (Throwable th2) {
                                        c3959f = new C3959f(th2);
                                    }
                                    if (c3959f instanceof C3959f) {
                                        c3959f = null;
                                    }
                                    String strM1430i = c3959f != null ? C0429d2.m1430i(c3959f) : null;
                                    boolean zM1438q = C0429d2.m1438q(strM1430i);
                                    Object obj4 = obj3;
                                    boolean zOnItemLongClick = false;
                                    if (zM1438q) {
                                        Activity activityM1433l = C0429d2.m1433l(view.getContext());
                                        if (activityM1433l == null) {
                                            return false;
                                        }
                                        C0429d2.f1248n.post(new RunnableC0217c((Object) activityM1433l, strM1430i, obj4, (Object) context, 4));
                                        return true;
                                    }
                                    Activity activityM1433l2 = C0429d2.m1433l(view.getContext());
                                    if (activityM1433l2 == null) {
                                        return false;
                                    }
                                    if (strM1430i == null) {
                                        strM1430i = HttpUrl.FRAGMENT_ENCODE_SET;
                                    }
                                    threadLocal.set(new C0492u1(activityM1433l2, strM1430i, str2, obj4));
                                    AdapterView.OnItemLongClickListener onItemLongClickListener2 = onItemLongClickListener;
                                    if (onItemLongClickListener2 != null) {
                                        try {
                                            zOnItemLongClick = onItemLongClickListener2.onItemLongClick(adapterView2, view, i14, j3);
                                        } finally {
                                            threadLocal.remove();
                                        }
                                    }
                                    return zOnItemLongClick;
                                }
                            });
                        }
                    }
                }
                if (field != null && KavaReflector.invokeSuccessfully(C0429d2.f1250p, field, new Object[0])) {
                    i9 = 1;
                }
                if (field != null && i9 == 0) {
                    AbstractC1184v0.m3203m("[Hchat:ConversationGroup] 刷新微信原生分组列表失败: adapter=".concat(field.getClass().getName()));
                }
                C0429d2.m1444x(strM1442v, obj3, c0414a2.f1180b, field);
                final String str3 = c0414a2.f1179a;
                Class<?> cls = obj3.getClass();
                Class cls2 = Integer.TYPE;
                cls2.getClass();
                Method methodFindMethodRecursive = KavaReflector.findMethodRecursive(cls, "addTextOptionMenu", cls2, String.class, MenuItem.OnMenuItemClickListener.class);
                if (KavaReflector.invokeSuccessfully(methodFindMethodRecursive, obj3, 1212368717, "菜单", new MenuItem.OnMenuItemClickListener() { // from class: c9.l1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        menuItem.getClass();
                        Object obj4 = obj3;
                        Object objInvokeMethod = KavaReflector.invokeMethod(obj4, "getActivity", new Object[0]);
                        if (objInvokeMethod == null) {
                            objInvokeMethod = KavaReflector.invokeMethod(obj4, "thisActivity", new Object[0]);
                        }
                        Activity activity = objInvokeMethod instanceof Activity ? (Activity) objInvokeMethod : null;
                        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                            return true;
                        }
                        Handler handler = C0419b0.f1202a;
                        C0035c c0035c = new C0035c(context, 6, obj4);
                        String str4 = str3;
                        str4.getClass();
                        C0414a c0414aM1405c = C0419b0.m1405c(activity, str4);
                        if (c0414aM1405c == null) {
                            return true;
                        }
                        C5491y2.m9811W1(activity, c0414aM1405c.f1180b, HttpUrl.FRAGMENT_ENCODE_SET, AbstractC0000a.m101y0(new C3958e("Hchat模块", "打开 Hchat 设置"), new C3958e("所有消息标为已读", "标记当前分组及子分组内全部会话"), new C3958e("批量删除消息", "选择会话并清空聊天记录"), new C3958e("消息免打扰", "开启当前分组内会话的微信免打扰"), new C3958e("解除消息免打扰", "关闭当前分组内会话的微信免打扰"), new C3958e("发送", "向当前分组内会话批量发送文字"), new C3958e("发送群聊邀请", "选择群聊并邀请当前分组内好友"), new C3958e("添加", "选择会话加入当前分组"), new C3958e("移出", "将直属会话移回微信首页"), new C3958e("移至", "将直属会话移到其他分组"), new C3958e("搜索", "搜索当前分组及子分组内会话"), new C3958e("设置", "设置当前分组的显示方式")), new C0481r(activity, str4, c0035c, 0), new C0315c(6));
                        return true;
                    }
                })) {
                    return;
                }
                String name = obj3.getClass().getName();
                String genericString = methodFindMethodRecursive != null ? methodFindMethodRecursive.toGenericString() : null;
                if (genericString == null) {
                    genericString = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                AbstractC1184v0.m3203m("[Hchat:ConversationGroup] 添加微信原生分组页菜单失败: fragment=" + name + " method=" + genericString);
                return;
            case 2:
            case 4:
            default:
                super.afterHookedMethod(methodHookParam);
                return;
            case 3:
                methodHookParam.getClass();
                ThreadLocal threadLocal = C0846q.f2591l;
                ArrayDeque arrayDeque = (ArrayDeque) threadLocal.get();
                if (arrayDeque != null) {
                    if (!arrayDeque.isEmpty()) {
                        arrayDeque.removeLast();
                    }
                    if (arrayDeque.isEmpty()) {
                        threadLocal.remove();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                methodHookParam.getClass();
                AtomicBoolean atomicBoolean = C0846q.f2580a;
                C0846q.m2117b(methodHookParam.thisObject, this.f1200b.f12143a);
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        boolean z9;
        Object[] objArr;
        Object objM2121f;
        Object[] objArr2;
        Object obj;
        Object next;
        String str;
        boolean z10;
        boolean z11;
        EnumC2528c enumC2528cM5937c;
        Object obj2;
        boolean z12;
        Object objM2121f2;
        C0832c c0832cM2150a;
        String channelId;
        String channelId2;
        long j3;
        long j4;
        C0848s c0848s;
        C0832c c0832cM2150a2;
        ConcurrentHashMap concurrentHashMap;
        boolean z13;
        CharSequence charSequence;
        int iIntValue;
        int i9 = this.f1199a;
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        long j5 = 0;
        C3742g c3742g = this.f1200b;
        switch (i9) {
            case 0:
                methodHookParam.getClass();
                String str3 = (String) C0429d2.f1244j.get();
                if (str3 != null) {
                    if (!Boolean.valueOf(C0429d2.m1438q(str3)).booleanValue()) {
                        str3 = null;
                    }
                    if (str3 != null) {
                        Object[] objArr3 = methodHookParam.args;
                        if (AbstractC1416l.m3825a(objArr3 != null ? AbstractC4165l.m8366C0(2, objArr3) : null, "conversationboxservice")) {
                            methodHookParam.args[0] = 0;
                            methodHookParam.args[2] = str3;
                        }
                    }
                }
                break;
            case 1:
            case 5:
            default:
                super.beforeHookedMethod(methodHookParam);
                break;
            case 2:
                methodHookParam.getClass();
                AtomicBoolean atomicBoolean = C0846q.f2580a;
                Context context = c3742g.f12143a;
                Object[] objArr4 = methodHookParam.args;
                if (objArr4 != null) {
                    objArr = objArr4;
                    z9 = false;
                } else {
                    z9 = false;
                    objArr = new Object[0];
                }
                boolean z14 = AbstractC4302b.m8640c(context, "Hchat_block_at_all_notification_config").getBoolean("block_at_all_notification_enable", z9);
                C0848s c0848s2 = new C0848s(context);
                boolean zM2151b = c0848s2.m2151b("custom_notification_enable");
                if ((z14 || zM2151b) && (objM2121f = C0846q.m2121f(objArr)) != null) {
                    C3022t c3022tM6413W = AbstractC3015m.m6413W(new C3011i(AbstractC4165l.m8376k0(objArr), true, C0842m.f2564h), new C0837h(2));
                    Iterator it = c3022tM6413W.f9822a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            objArr2 = objArr;
                            Object objInvoke = c3022tM6413W.f9823b.invoke(it.next());
                            String str4 = (String) objInvoke;
                            obj = objInvoke;
                            if (!AbstractC3156t.m6733W(str4, "@chatroom", false) && !AbstractC3156t.m6733W(str4, "@im.chatroom", false)) {
                                objArr = objArr2;
                            }
                        } else {
                            objArr2 = objArr;
                            obj = null;
                        }
                    }
                    String strM2138w = (String) obj;
                    if (strM2138w == null) {
                        strM2138w = C0846q.m2138w(objM2121f, "field_talker", "talker");
                    }
                    String str5 = strM2138w;
                    if (AbstractC3156t.m6733W(str5, "@chatroom", false) || AbstractC3156t.m6733W(str5, "@im.chatroom", false)) {
                        boolean z15 = z14 && AbstractC3165h.m6782i(context, str5);
                        C0832c c0832cM2150a3 = zM2151b ? c0848s2.m2150a(str5) : null;
                        boolean z16 = c0832cM2150a3 != null ? c0832cM2150a3.f2515f && c0832cM2150a3.f2513d && (c0832cM2150a3.f2529t || c0832cM2150a3.f2530u) : false;
                        if (z15 || z16) {
                            List listM6418b0 = AbstractC3015m.m6418b0(AbstractC3015m.m6414X(new C3011i(new C0795n(C0846q.m2125j(objM2121f.getClass()), 6), true, new C0837h(3)), new C0456k1(objM2121f, 6)));
                            Iterator it2 = listM6418b0.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    String str6 = (String) next;
                                    if (AbstractC3149m.m6709h0(str6, "<msgsource", true) || AbstractC3149m.m6709h0(str6, "atuserlist", true)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            String str7 = (String) next;
                            if (str7 == null) {
                                str7 = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
                            String[] strArr = {"field_content", "content"};
                            int i10 = 0;
                            while (true) {
                                if (i10 >= 2) {
                                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                                } else {
                                    Object field = KavaReflector.readField(objM2121f, strArr[i10]);
                                    str = field instanceof String ? (String) field : null;
                                    if (str == null || str.length() <= 0) {
                                        i10++;
                                    }
                                }
                            }
                            List listM6418b02 = AbstractC3015m.m6418b0(AbstractC3015m.m6415Y(new C3011i(AbstractC4165l.m8376k0(objArr2), true, C0842m.f2565i), new C0795n(listM6418b0, 6)));
                            if (listM6418b02.isEmpty()) {
                                z10 = false;
                            } else {
                                Iterator it3 = listM6418b02.iterator();
                                while (it3.hasNext()) {
                                    if (AbstractC3149m.m6709h0((String) it3.next(), "announcement@all", true)) {
                                        z10 = true;
                                    }
                                }
                                z10 = false;
                            }
                            if (listM6418b02.isEmpty()) {
                                z11 = false;
                            } else {
                                Iterator it4 = listM6418b02.iterator();
                                while (it4.hasNext()) {
                                    if (AbstractC3149m.m6709h0((String) it4.next(), "notify@all", true)) {
                                        z11 = true;
                                    }
                                }
                                z11 = false;
                            }
                            ConcurrentHashMap concurrentHashMap2 = AbstractC4137b.f13632a;
                            C1360a c1360aAccount = WeChatApis.account();
                            String strM3652c = c1360aAccount != null ? c1360aAccount.m3652c() : null;
                            if (strM3652c == null) {
                                strM3652c = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
                            WeChatMessage.Companion.getClass();
                            EnumC2528c enumC2528cM5937c2 = C2529d.m5937c(str7, str, strM3652c);
                            EnumC2528c enumC2528c = EnumC2528c.f8170i;
                            boolean z17 = enumC2528cM5937c2 == enumC2528c;
                            if (z10) {
                                enumC2528cM5937c = EnumC2528c.f8171j;
                            } else if (z11 || z17) {
                                enumC2528cM5937c = enumC2528c;
                            } else {
                                C1360a c1360aAccount2 = WeChatApis.account();
                                String strM3652c2 = c1360aAccount2 != null ? c1360aAccount2.m3652c() : null;
                                if (strM3652c2 != null) {
                                    str2 = strM3652c2;
                                }
                                enumC2528cM5937c = C2529d.m5937c(str7, str, str2);
                            }
                            C3010h c3010h = new C3010h(new C3011i(AbstractC4165l.m8376k0(objArr2), true, C0842m.f2566j));
                            while (true) {
                                if (c3010h.hasNext()) {
                                    Object next2 = c3010h.next();
                                    if (((Number) next2).longValue() > 0) {
                                        obj2 = next2;
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            Long l10 = (Long) obj2;
                            long jLongValue = l10 != null ? l10.longValue() : C0846q.m2137v(objM2121f, "field_msgSvrId", "msgSvrId");
                            if (z16 && jLongValue > 0 && enumC2528cM5937c != EnumC2528c.f8168g && enumC2528cM5937c != EnumC2528c.f8172k) {
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                ConcurrentHashMap concurrentHashMap3 = C0846q.f2588i;
                                concurrentHashMap3.put(new C0839j(str5, jLongValue), new C0838i(enumC2528cM5937c, jCurrentTimeMillis));
                                if (concurrentHashMap3.size() >= 128) {
                                    concurrentHashMap3.entrySet().removeIf(new C0285i(new C0512c(jCurrentTimeMillis, 1), 7));
                                }
                            }
                            if (z15 && enumC2528cM5937c == enumC2528c) {
                                AbstractC4137b.m8327c(context, str5, jLongValue);
                                break;
                            }
                        }
                    }
                }
                break;
            case 3:
                methodHookParam.getClass();
                ThreadLocal threadLocal = C0846q.f2591l;
                ArrayDeque arrayDeque = (ArrayDeque) threadLocal.get();
                if (arrayDeque == null) {
                    arrayDeque = new ArrayDeque();
                    threadLocal.set(arrayDeque);
                }
                AtomicBoolean atomicBoolean2 = C0846q.f2580a;
                Context context2 = c3742g.f12143a;
                Object[] objArr5 = methodHookParam.args;
                if (objArr5 == null) {
                    objArr5 = new Object[0];
                }
                C0848s c0848s3 = new C0848s(context2);
                if (c0848s3.m2151b("custom_notification_enable") && (objM2121f2 = C0846q.m2121f(objArr5)) != null) {
                    String strM2138w2 = C0846q.m2138w(objM2121f2, "field_talker", "talker");
                    long jM2137v = C0846q.m2137v(objM2121f2, "field_msgSvrId", "msgSvrId");
                    int iM2136u = C0846q.m2136u(objM2121f2, "field_type", "type");
                    boolean z18 = C0846q.m2136u(objM2121f2, "field_isSend", "isSend") == 1;
                    if (AbstractC3149m.m6721t0(strM2138w2) || jM2137v <= 0 || z18) {
                        z12 = false;
                    } else {
                        if (iM2136u > 0) {
                            int i11 = iM2136u & 255;
                            int i12 = 65535 & iM2136u;
                            if ((iM2136u >>> 16) != 0) {
                                if (i12 == 10000 || i12 == 10002) {
                                    iM2136u = i12;
                                } else if (i11 != 0 && i12 == i11) {
                                    iM2136u = i11;
                                }
                            }
                        }
                        if (iM2136u != 10000 && iM2136u != 10002 && (c0832cM2150a = c0848s3.m2150a(strM2138w2)) != null && c0832cM2150a.f2515f && c0832cM2150a.f2516g != 0 && !C0846q.m2126k(c0832cM2150a) && !C0846q.m2115A(c0832cM2150a, strM2138w2)) {
                            z12 = true;
                        }
                    }
                }
                arrayDeque.addLast(Boolean.valueOf(z12));
                break;
            case 4:
                methodHookParam.getClass();
                AtomicBoolean atomicBoolean3 = C0846q.f2580a;
                C0846q.m2117b(methodHookParam.thisObject, c3742g.f12143a);
                break;
            case 6:
                methodHookParam.getClass();
                Object[] objArr6 = methodHookParam.args;
                Object obj3 = (objArr6 == null || objArr6.length == 0) ? null : objArr6[objArr6.length - 1];
                Notification notification = obj3 instanceof Notification ? (Notification) obj3 : null;
                if (notification != null) {
                    Context context3 = c3742g.f12143a;
                    AtomicBoolean atomicBoolean4 = C0846q.f2580a;
                    Bundle bundle = notification.extras;
                    boolean z19 = (bundle != null && bundle.getBoolean("hchat_custom_notification", false)) || (bundle != null && bundle.getBoolean("hchat_keyword_notification", false)) || (((channelId = notification.getChannelId()) != null && AbstractC3156t.m6740d0(channelId, "Hchat_custom_notification_", false)) || ((channelId2 = notification.getChannelId()) != null && AbstractC3156t.m6740d0(channelId2, "Hchat_keyword_notification_", false)));
                    Bundle bundle2 = notification.extras;
                    String string = bundle2 != null ? bundle2.getString("hchat_custom_notification_talker") : null;
                    if (string == null) {
                        string = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    Bundle bundle3 = notification.extras;
                    if (bundle3 != null) {
                        j3 = 0;
                        j5 = bundle3.getLong("hchat_custom_notification_native_msg_svr_id", 0L);
                    } else {
                        j3 = 0;
                    }
                    if (!z19 && !AbstractC3149m.m6721t0(string)) {
                        ConcurrentHashMap concurrentHashMap4 = AbstractC4137b.f13632a;
                        if (AbstractC4302b.m8640c(context3, "Hchat_block_at_all_notification_config").getBoolean("block_at_all_notification_enable", false)) {
                            String string2 = AbstractC3149m.m6703R0(string).toString();
                            if (string2 == null) {
                                string2 = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
                            if (AbstractC4137b.m8326b(string2) && j5 > j3) {
                                if (AbstractC3165h.m6782i(context3, string2)) {
                                    j4 = 15000;
                                    C4136a c4136a = new C4136a(string2, j5);
                                    Long l11 = (Long) concurrentHashMap4.get(c4136a);
                                    if (l11 != null) {
                                        if (System.currentTimeMillis() - l11.longValue() <= 15000) {
                                            methodHookParam.setResult((Object) null);
                                        } else {
                                            concurrentHashMap4.remove(c4136a, l11);
                                        }
                                    }
                                } else {
                                    j4 = 15000;
                                    concurrentHashMap4.remove(new C4136a(string2, j5));
                                }
                                break;
                            }
                            c0848s = new C0848s(context3);
                            if (c0848s.m2151b("custom_notification_enable") && (c0832cM2150a2 = c0848s.m2150a(string)) != null && c0832cM2150a2.f2515f) {
                                concurrentHashMap = C0846q.f2587h;
                                concurrentHashMap.put(string, Long.valueOf(System.currentTimeMillis()));
                                if (concurrentHashMap.size() > 128) {
                                    concurrentHashMap.entrySet().removeIf(new C0285i(new C0512c(System.currentTimeMillis(), 2), 8));
                                }
                                if (j5 <= j3) {
                                    if (C0846q.m2115A(c0832cM2150a2, string)) {
                                        methodHookParam.setResult((Object) null);
                                        break;
                                    } else {
                                        if (!c0832cM2150a2.f2513d || j5 <= j3) {
                                            z13 = false;
                                        } else {
                                            C0839j c0839j = new C0839j(string, j5);
                                            ConcurrentHashMap concurrentHashMap5 = C0846q.f2588i;
                                            C0838i c0838i = (C0838i) concurrentHashMap5.get(c0839j);
                                            if (c0838i != null) {
                                                if (System.currentTimeMillis() - c0838i.f2549b > j4) {
                                                    concurrentHashMap5.remove(c0839j, c0838i);
                                                } else {
                                                    int iOrdinal = c0838i.f2548a.ordinal();
                                                    if (iOrdinal == 1) {
                                                        z13 = c0832cM2150a2.f2530u;
                                                    } else if (iOrdinal == 2) {
                                                        z13 = c0832cM2150a2.f2529t;
                                                    }
                                                }
                                                z13 = false;
                                            }
                                        }
                                        if (z13) {
                                            methodHookParam.setResult((Object) null);
                                            break;
                                        } else {
                                            methodHookParam.setResult((Object) null);
                                            if (c0832cM2150a2.f2516g != 0 && !C0846q.m2126k(c0832cM2150a2)) {
                                                String str8 = c0832cM2150a2.f2511b;
                                                String strM3595k = AbstractC1341a.m3595k(str8);
                                                if (AbstractC3149m.m6721t0(strM3595k)) {
                                                    strM3595k = c0832cM2150a2.f2512c;
                                                    if (AbstractC3149m.m6721t0(strM3595k)) {
                                                        strM3595k = str8;
                                                    }
                                                }
                                                String str9 = strM3595k;
                                                String strM2135t = C0846q.m2135t(notification, "hchat_custom_notification_native_text");
                                                String strM2135t2 = C0846q.m2135t(notification, "hchat_custom_notification_native_summary");
                                                String strM2135t3 = C0846q.m2135t(notification, "android.bigText");
                                                String strM2135t4 = C0846q.m2135t(notification, "android.text");
                                                Bundle bundle4 = notification.extras;
                                                CharSequence[] charSequenceArray = bundle4 != null ? bundle4.getCharSequenceArray("android.textLines") : null;
                                                if (charSequenceArray == null) {
                                                    charSequenceArray = new CharSequence[0];
                                                }
                                                CharSequence[] charSequenceArr = charSequenceArray;
                                                int length = charSequenceArr.length - 1;
                                                if (length >= 0) {
                                                    while (true) {
                                                        int i13 = length - 1;
                                                        CharSequence charSequence2 = charSequenceArr[length];
                                                        if (charSequence2 != null && !AbstractC3149m.m6721t0(charSequence2)) {
                                                            charSequence = charSequence2;
                                                        } else if (i13 >= 0) {
                                                            length = i13;
                                                        }
                                                    }
                                                } else {
                                                    charSequence = null;
                                                }
                                                String string3 = charSequence != null ? charSequence.toString() : null;
                                                String str10 = string3 == null ? HttpUrl.FRAGMENT_ENCODE_SET : string3;
                                                String strM2135t5 = C0846q.m2135t(notification, "android.summaryText");
                                                CharSequence charSequence3 = notification.tickerText;
                                                String strM2122g = C0846q.m2122g(strM2135t, strM2135t2, strM2135t3, strM2135t4, str10, strM2135t5, charSequence3 != null ? charSequence3.toString() : null);
                                                String str11 = "[收到一条新消息]";
                                                if (c0832cM2150a2.f2523n) {
                                                    String strM2140y = C0846q.m2140y(strM2122g);
                                                    if (!AbstractC3149m.m6721t0(strM2140y)) {
                                                        str11 = strM2140y;
                                                    }
                                                }
                                                String str12 = str11;
                                                Bundle bundle5 = notification.extras;
                                                if (bundle5 != null) {
                                                    int i14 = bundle5.getInt("hchat_custom_notification_unread_count", 0);
                                                    Integer numValueOf = Integer.valueOf(i14);
                                                    if (!(i14 > 0)) {
                                                        numValueOf = null;
                                                    }
                                                    iIntValue = numValueOf != null ? numValueOf.intValue() : C0846q.m2119d(context3, str8) + 1;
                                                }
                                                int i15 = iIntValue;
                                                Bitmap bitmapM2131p = C0846q.m2131p(context3, str8);
                                                long j10 = notification.when;
                                                Long lValueOf = Long.valueOf(j10);
                                                if (!(j10 > j3)) {
                                                    lValueOf = null;
                                                }
                                                long jLongValue2 = lValueOf != null ? lValueOf.longValue() : System.currentTimeMillis();
                                                Bundle bundle6 = notification.extras;
                                                C0846q.f2583d.execute(new RunnableC0059l(this, context3, c0832cM2150a2, new C0841l(str9, str12, i15, bitmapM2131p, jLongValue2, 0L, bundle6 != null ? bundle6.getLong("hchat_custom_notification_native_msg_svr_id", j3) : 0L, notification.contentIntent, 32), 11));
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            concurrentHashMap4.clear();
                        }
                        j4 = 15000;
                        c0848s = new C0848s(context3);
                        if (c0848s.m2151b("custom_notification_enable")) {
                            concurrentHashMap = C0846q.f2587h;
                            concurrentHashMap.put(string, Long.valueOf(System.currentTimeMillis()));
                            if (concurrentHashMap.size() > 128) {
                            }
                            if (j5 <= j3) {
                            }
                        }
                    }
                }
                break;
            case 7:
                methodHookParam.getClass();
                Object[] objArr7 = methodHookParam.args;
                objArr7.getClass();
                Object objM8391z0 = AbstractC4165l.m8391z0(objArr7);
                JSONObject jSONObject = objM8391z0 instanceof JSONObject ? (JSONObject) objM8391z0 : null;
                if (jSONObject != null) {
                    Context context4 = c3742g.f12143a;
                    List listM8629i = C4296g.m8629i(jSONObject);
                    if (!listM8629i.isEmpty()) {
                        C4296g.m8630j(context4, AbstractC4166m.m8397F1(C4296g.m8627g(context4), listM8629i));
                        break;
                    }
                }
                break;
        }
    }
}
