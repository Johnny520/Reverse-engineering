package p036c9;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import ba.C0226f;
import ch.C0570e;
import gg.AbstractC1426v;
import gh.C1431c;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import p000a.AbstractC0000a;
import p024b9.SharedPreferencesOnSharedPreferenceChangeListenerC0216b;
import p027c0.C0361f;
import p062e8.C0828b;
import p065eb.C0852a;
import p065eb.C0855b;
import p065eb.C0861d;
import p065eb.C0864e;
import p065eb.C0866f;
import p065eb.C0876k;
import p065eb.C0881m0;
import p068eh.AbstractC0921a;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1220a;
import p086fh.C1253k;
import p096g8.C1366g;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.runtime.WeChatDatabaseApi;
import p099h.Hchat.utils.KavaReflector;
import p106h8.C1625b;
import p115hh.C1730o;
import p115hh.C1731p;
import p153k8.C2345i;
import p153k8.C2352p;
import p210o8.C3080d;
import p258r8.C3742g;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;
import p347xa.C5740a;
import p366ya.AbstractC6019i;
import tf.AbstractC4166m;
import tf.AbstractC4171r;

/* JADX INFO: renamed from: c9.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0434f implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1278g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C3742g f1279h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0434f(C3742g c3742g, int i9) {
        this.f1278g = i9;
        this.f1279h = c3742g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v12, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:253:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x07ce  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0814  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0817  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0819  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4 A[DONT_GENERATE] */
    @Override // p085fg.InterfaceC1220a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        String str;
        boolean z9;
        boolean z10;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Object c3959f;
        Throwable thM8182b;
        C0498w1 c0498w1;
        C0570e c0570e;
        C1253k c1253k;
        Object c3959f2;
        Object c3959f3;
        Method methodM10439d;
        boolean z11;
        boolean z12;
        int i9;
        int i10;
        Method methodFindDeclaredMethod;
        Class<?> clsLoadClass;
        Method methodFindDeclaredMethod2;
        boolean z13;
        C2345i c2345i;
        Object c3959f4;
        WeChatDatabaseApi weChatDatabaseApiDatabase;
        int i11 = 0;
        switch (this.f1278g) {
            case 0:
                C3742g c3742g = this.f1279h;
                C0429d2 c0429d2 = C0429d2.f1235a;
                c3742g.getClass();
                C0429d2 c0429d22 = C0429d2.f1235a;
                AbstractC1426v.m3834a(C0429d2.class).mo3818a().getClass();
                SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_conversation_group_method_cache");
                Context context = c3742g.f12143a;
                ClassLoader classLoader = c3742g.f12145c;
                Method methodM2087c = C0828b.m2087c(sharedPreferencesM8640c, C0828b.m2091g(context, classLoader), classLoader, "main_conversation_query");
                if (methodM2087c == null || !C0429d2.m1428g(c0429d22, methodM2087c)) {
                    methodM2087c = null;
                }
                if (methodM2087c != null) {
                    str = "Hchat_conversation_group_method_cache";
                } else {
                    C0570e c0570e2 = new C0570e();
                    C1253k c1253k2 = new C1253k();
                    c1253k2.m3369l0(1, "com.tencent.mm.storage.");
                    C1253k.m3367u0(c1253k2, AbstractC0000a.m101y0("select unReadCount, status, isSend, conversationTime, rconversation.username, content", "parentRef is null", "message_fold"));
                    c0570e2.f1764h = c1253k2;
                    str = "Hchat_conversation_group_method_cache";
                    methodM2087c = c0429d22.m1447r(c3742g, "main_conversation_query", c0570e2, new C0361f(1, c0429d22, AbstractC0921a.m2246i(C0429d2.class), "isQueryMethod", "isQueryMethod(Ljava/lang/reflect/Method;)Z", 0, 0, 9));
                }
                Method method7 = methodM2087c;
                if (method7 != null) {
                    AbstractC1426v.m3834a(C0429d2.class).mo3818a().getClass();
                    SharedPreferences sharedPreferencesM8640c2 = AbstractC4302b.m8640c(c3742g.f12143a, str);
                    Context context2 = c3742g.f12143a;
                    ClassLoader classLoader2 = c3742g.f12145c;
                    Method methodM2087c2 = C0828b.m2087c(sharedPreferencesM8640c2, C0828b.m2091g(context2, classLoader2), classLoader2, "conversation_parent_update");
                    if (methodM2087c2 == null || !C0429d2.m1427f(c0429d22, methodM2087c2)) {
                        methodM2087c2 = null;
                    }
                    if (methodM2087c2 == null) {
                        C0570e c0570e3 = new C0570e();
                        C1253k c1253k3 = new C1253k();
                        c1253k3.m3369l0(1, "com.tencent.mm.storage.");
                        C1253k.m3367u0(c1253k3, AbstractC0000a.m101y0("Update rconversation set parentRef = '", "' where 1 != 1 "));
                        c0570e3.f1764h = c1253k3;
                        methodM2087c2 = c0429d22.m1447r(c3742g, "conversation_parent_update", c0570e3, new C0361f(1, c0429d22, AbstractC0921a.m2246i(C0429d2.class), "isParentUpdateMethod", "isParentUpdateMethod(Ljava/lang/reflect/Method;)Z", 0, 0, 8));
                    }
                    Method method8 = methodM2087c2;
                    if (method8 != null) {
                        AbstractC1426v.m3834a(C0429d2.class).mo3818a().getClass();
                        SharedPreferences sharedPreferencesM8640c3 = AbstractC4302b.m8640c(c3742g.f12143a, str);
                        Context context3 = c3742g.f12143a;
                        ClassLoader classLoader3 = c3742g.f12145c;
                        Method methodM2087c3 = C0828b.m2087c(sharedPreferencesM8640c3, C0828b.m2091g(context3, classLoader3), classLoader3, "main_conversation_click");
                        if (methodM2087c3 == null || !C0429d2.m1422a(c0429d22, methodM2087c3)) {
                            methodM2087c3 = null;
                        }
                        if (methodM2087c3 != null) {
                            method = method7;
                        } else {
                            C0570e c0570e4 = new C0570e();
                            C1253k c1253k4 = new C1253k();
                            c1253k4.m3369l0(1, "com.tencent.mm.ui.conversation.");
                            C1253k.m3367u0(c1253k4, AbstractC0000a.m101y0("MicroMsg.ConversationClickListener", "null user at position = "));
                            c0570e4.f1764h = c1253k4;
                            method = method7;
                            methodM2087c3 = c0429d22.m1447r(c3742g, "main_conversation_click", c0570e4, new C0361f(1, c0429d22, AbstractC0921a.m2246i(C0429d2.class), "isClickMethod", "isClickMethod(Ljava/lang/reflect/Method;)Z", 0, 0, 2));
                        }
                        Method method9 = methodM2087c3;
                        if (method9 != null) {
                            AbstractC1426v.m3834a(C0429d2.class).mo3818a().getClass();
                            SharedPreferences sharedPreferencesM8640c4 = AbstractC4302b.m8640c(c3742g.f12143a, str);
                            Context context4 = c3742g.f12143a;
                            ClassLoader classLoader4 = c3742g.f12145c;
                            Method methodM2087c4 = C0828b.m2087c(sharedPreferencesM8640c4, C0828b.m2091g(context4, classLoader4), classLoader4, "fold_group_conversation_query");
                            if (methodM2087c4 == null || !C0429d2.m1424c(c0429d22, methodM2087c4)) {
                                methodM2087c4 = null;
                            }
                            if (methodM2087c4 != null) {
                                method2 = method9;
                            } else {
                                C0570e c0570e5 = new C0570e();
                                C1253k c1253k5 = new C1253k();
                                c1253k5.m3369l0(1, "com.tencent.mm.storage.");
                                C1253k.m3367u0(c1253k5, AbstractC0000a.m101y0("select * from rconversation where", "parentRef = '"));
                                c0570e5.f1764h = c1253k5;
                                method2 = method9;
                                methodM2087c4 = c0429d22.m1447r(c3742g, "fold_group_conversation_query", c0570e5, new C0361f(1, c0429d22, AbstractC0921a.m2246i(C0429d2.class), "isNativeGroupQueryMethod", "isNativeGroupQueryMethod(Ljava/lang/reflect/Method;)Z", 0, 0, 5));
                            }
                            Method method10 = methodM2087c4;
                            if (method10 != null) {
                                AbstractC1426v.m3834a(C0429d2.class).mo3818a().getClass();
                                SharedPreferences sharedPreferencesM8640c5 = AbstractC4302b.m8640c(c3742g.f12143a, str);
                                Context context5 = c3742g.f12143a;
                                ClassLoader classLoader5 = c3742g.f12145c;
                                Method methodM2087c5 = C0828b.m2087c(sharedPreferencesM8640c5, C0828b.m2091g(context5, classLoader5), classLoader5, "fold_group_conversation_click");
                                if (methodM2087c5 == null || !C0429d2.m1422a(c0429d22, methodM2087c5)) {
                                    methodM2087c5 = null;
                                }
                                if (methodM2087c5 != null) {
                                    method3 = method10;
                                } else {
                                    C0570e c0570e6 = new C0570e();
                                    C1253k c1253k6 = new C1253k();
                                    c1253k6.m3369l0(1, "com.tencent.mm.ui.conversation.");
                                    C1253k.m3367u0(c1253k6, AbstractC0000a.m101y0("MicroMsg.ConvBoxServiceConversationFmUI", "user should not be null. position:%d, size:%d", "specific_chat_from_scene", "chat_from_scene_for_group_chats"));
                                    c0570e6.f1764h = c1253k6;
                                    method3 = method10;
                                    methodM2087c5 = c0429d22.m1447r(c3742g, "fold_group_conversation_click", c0570e6, new C0361f(1, c0429d22, AbstractC0921a.m2246i(C0429d2.class), "isClickMethod", "isClickMethod(Ljava/lang/reflect/Method;)Z", 0, 0, 3));
                                }
                                Method method11 = methodM2087c5;
                                if (method11 != null) {
                                    AbstractC1426v.m3834a(C0429d2.class).mo3818a().getClass();
                                    SharedPreferences sharedPreferencesM8640c6 = AbstractC4302b.m8640c(c3742g.f12143a, str);
                                    Context context6 = c3742g.f12143a;
                                    ClassLoader classLoader6 = c3742g.f12145c;
                                    Method methodM2087c6 = C0828b.m2087c(sharedPreferencesM8640c6, C0828b.m2091g(context6, classLoader6), classLoader6, "fold_group_adapter_refresh");
                                    if (methodM2087c6 == null || !C0429d2.m1425d(c0429d22, methodM2087c6)) {
                                        methodM2087c6 = null;
                                    }
                                    if (methodM2087c6 != null) {
                                        method4 = method11;
                                    } else {
                                        C0570e c0570e7 = new C0570e();
                                        C1253k c1253k7 = new C1253k();
                                        c1253k7.m3369l0(1, "com.tencent.mm.ui.conversation.");
                                        c1253k7.m3374r0("conversationboxservice");
                                        c0570e7.f1764h = c1253k7;
                                        method4 = method11;
                                        methodM2087c6 = c0429d22.m1447r(c3742g, "fold_group_adapter_refresh", c0570e7, new C0361f(1, c0429d22, AbstractC0921a.m2246i(C0429d2.class), "isNativeGroupRefreshMethod", "isNativeGroupRefreshMethod(Ljava/lang/reflect/Method;)Z", 0, 0, 6));
                                    }
                                    Method method12 = methodM2087c6;
                                    if (method12 != null) {
                                        AbstractC1426v.m3834a(C0429d2.class).mo3818a().getClass();
                                        SharedPreferences sharedPreferencesM8640c7 = AbstractC4302b.m8640c(c3742g.f12143a, str);
                                        Context context7 = c3742g.f12143a;
                                        ClassLoader classLoader7 = c3742g.f12145c;
                                        Method methodM2087c7 = C0828b.m2087c(sharedPreferencesM8640c7, C0828b.m2091g(context7, classLoader7), classLoader7, "fold_group_mark_read");
                                        if (methodM2087c7 == null || !C0429d2.m1423b(c0429d22, methodM2087c7)) {
                                            methodM2087c7 = null;
                                        }
                                        if (methodM2087c7 == null) {
                                            C0570e c0570e8 = new C0570e();
                                            C1253k c1253k8 = new C1253k();
                                            c1253k8.m3369l0(1, "com.tencent.mm.storage.");
                                            C1253k.m3367u0(c1253k8, AbstractC0000a.m101y0("update conversation failed", "updateUnreadByTalker %s"));
                                            c0570e8.f1764h = c1253k8;
                                            methodM2087c7 = c0429d22.m1447r(c3742g, "fold_group_mark_read", c0570e8, new C0361f(1, c0429d22, AbstractC0921a.m2246i(C0429d2.class), "isNativeGroupMarkReadMethod", "isNativeGroupMarkReadMethod(Ljava/lang/reflect/Method;)Z", 0, 0, 4));
                                        }
                                        Method method13 = methodM2087c7;
                                        if (method13 != null) {
                                            AbstractC1426v.m3834a(C0429d2.class).mo3818a().getClass();
                                            SharedPreferences sharedPreferencesM8640c8 = AbstractC4302b.m8640c(c3742g.f12143a, str);
                                            Context context8 = c3742g.f12143a;
                                            ClassLoader classLoader8 = c3742g.f12145c;
                                            Method methodM2087c8 = C0828b.m2087c(sharedPreferencesM8640c8, C0828b.m2091g(context8, classLoader8), classLoader8, "fold_group_status_notify");
                                            if (methodM2087c8 == null || !C0429d2.m1426e(c0429d22, methodM2087c8)) {
                                                methodM2087c8 = null;
                                            }
                                            if (methodM2087c8 != null) {
                                                method5 = method13;
                                            } else {
                                                C0570e c0570e9 = new C0570e();
                                                C1253k c1253k9 = new C1253k();
                                                c1253k9.m3374r0("enterSession %s %s");
                                                c0570e9.f1764h = c1253k9;
                                                method5 = method13;
                                                methodM2087c8 = c0429d22.m1447r(c3742g, "fold_group_status_notify", c0570e9, new C0361f(1, c0429d22, AbstractC0921a.m2246i(C0429d2.class), "isNativeGroupStatusNotifyMethod", "isNativeGroupStatusNotifyMethod(Ljava/lang/reflect/Method;)Z", 0, 0, 7));
                                            }
                                            Context context9 = c3742g.f12143a;
                                            DexKitBridge dexKitBridge = c3742g.f12146d;
                                            SharedPreferences sharedPreferencesM8640c9 = AbstractC4302b.m8640c(context9, str);
                                            Context context10 = c3742g.f12143a;
                                            ClassLoader classLoader9 = c3742g.f12145c;
                                            String strM2091g = C0828b.m2091g(context10, classLoader9);
                                            Method methodM2087c9 = C0828b.m2087c(sharedPreferencesM8640c9, strM2091g, classLoader9, "fold_group_menu_create");
                                            Method methodM2087c10 = C0828b.m2087c(sharedPreferencesM8640c9, strM2091g, classLoader9, "fold_group_menu_click");
                                            if (methodM2087c9 == null || methodM2087c10 == null || C0429d2.m1441u(methodM2087c9, methodM2087c10) == null) {
                                                try {
                                                    c0570e = new C0570e();
                                                    c1253k = new C1253k();
                                                    c1253k.m3369l0(2, "com.tencent.mm.ui.conversation.");
                                                    method6 = methodM2087c8;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    method6 = methodM2087c8;
                                                }
                                                try {
                                                    c1253k.f4103g = new C1431c("onCreateContextMenu", 5);
                                                    C1253k.m3366q0(c1253k, "void");
                                                    c1253k.m3372o0("android.view.ContextMenu", "android.view.View", "android.view.ContextMenu$ContextMenuInfo");
                                                    c0570e.f1764h = c1253k;
                                                    C1731p<C1730o> c1731pFindMethod = dexKitBridge.findMethod(c0570e);
                                                    ArrayList arrayList = new ArrayList();
                                                    for (C1730o c1730o : c1731pFindMethod) {
                                                        try {
                                                            c1730o.getClass();
                                                            c3959f3 = c1730o.m4348p().m6023b(classLoader9);
                                                        } catch (Throwable th3) {
                                                            c3959f3 = new C3959f(th3);
                                                        }
                                                        if (c3959f3 instanceof C3959f) {
                                                            c3959f3 = null;
                                                        }
                                                        Method method14 = (Method) c3959f3;
                                                        if (method14 != null) {
                                                            arrayList.add(method14);
                                                        }
                                                        break;
                                                    }
                                                    ArrayList<Method> arrayList2 = new ArrayList();
                                                    for (Object obj : arrayList) {
                                                        if (C0429d2.m1437p((Method) obj)) {
                                                            arrayList2.add(obj);
                                                        }
                                                    }
                                                    C0570e c0570e10 = new C0570e();
                                                    C1253k c1253k10 = new C1253k();
                                                    c1253k10.m3369l0(2, "com.tencent.mm.ui.conversation.");
                                                    c1253k10.f4103g = new C1431c("onMMMenuItemSelected", 5);
                                                    C1253k.m3366q0(c1253k10, "void");
                                                    c1253k10.m3372o0("android.view.MenuItem", "int");
                                                    c0570e10.f1764h = c1253k10;
                                                    C1731p<C1730o> c1731pFindMethod2 = dexKitBridge.findMethod(c0570e10);
                                                    ArrayList arrayList3 = new ArrayList();
                                                    for (C1730o c1730o2 : c1731pFindMethod2) {
                                                        try {
                                                            c1730o2.getClass();
                                                            c3959f2 = c1730o2.m4348p().m6023b(classLoader9);
                                                        } catch (Throwable th4) {
                                                            c3959f2 = new C3959f(th4);
                                                        }
                                                        if (c3959f2 instanceof C3959f) {
                                                            c3959f2 = null;
                                                        }
                                                        Method method15 = (Method) c3959f2;
                                                        if (method15 != null) {
                                                            arrayList3.add(method15);
                                                        }
                                                        break;
                                                    }
                                                    ArrayList<Method> arrayList4 = new ArrayList();
                                                    for (Object obj2 : arrayList3) {
                                                        if (C0429d2.m1436o((Method) obj2)) {
                                                            arrayList4.add(obj2);
                                                        }
                                                    }
                                                    ArrayList arrayList5 = new ArrayList();
                                                    for (Method method16 : arrayList2) {
                                                        ArrayList arrayList6 = new ArrayList();
                                                        for (Method method17 : arrayList4) {
                                                            C0498w1 c0498w12 = C0429d2.m1441u(method16, method17) != null ? new C0498w1(method16, method17) : null;
                                                            if (c0498w12 != null) {
                                                                arrayList6.add(c0498w12);
                                                            }
                                                        }
                                                        AbstractC4171r.m8432h1(arrayList5, arrayList6);
                                                    }
                                                    HashSet hashSet = new HashSet();
                                                    ArrayList arrayList7 = new ArrayList();
                                                    for (Object obj3 : arrayList5) {
                                                        C0498w1 c0498w13 = (C0498w1) obj3;
                                                        if (hashSet.add(c0498w13.f1522a.toGenericString() + c0498w13.f1523b.toGenericString())) {
                                                            arrayList7.add(obj3);
                                                        }
                                                    }
                                                    c3959f = (C0498w1) AbstractC4166m.m8400I1(arrayList7);
                                                    break;
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    c3959f = new C3959f(th);
                                                    thM8182b = C3960g.m8182b(c3959f);
                                                    if (thM8182b != null) {
                                                    }
                                                    if (c3959f instanceof C3959f) {
                                                    }
                                                    c0498w1 = (C0498w1) c3959f;
                                                    if (c0498w1 != null) {
                                                    }
                                                    byte b10 = 0;
                                                    methodM10439d = C5740a.f23386a.m10439d(c3742g, new C0468n1(b10, b10));
                                                    if (methodM10439d == null) {
                                                    }
                                                }
                                                thM8182b = C3960g.m8182b(c3959f);
                                                if (thM8182b != null) {
                                                    AbstractC0921a.m2261x("[Hchat:ConversationGroup] 定位微信原生分组长按菜单失败: ", thM8182b.getMessage(), thM8182b);
                                                }
                                                if (c3959f instanceof C3959f) {
                                                    c3959f = null;
                                                }
                                                c0498w1 = (C0498w1) c3959f;
                                                if (c0498w1 != null) {
                                                    C0828b.m2085a(sharedPreferencesM8640c9, strM2091g, "fold_group_menu_create");
                                                    C0828b.m2085a(sharedPreferencesM8640c9, strM2091g, "fold_group_menu_click");
                                                    AbstractC1184v0.m3203m("[Hchat:ConversationGroup] 微信原生分组长按菜单缺失或候选不唯一");
                                                } else {
                                                    C0828b.m2092h(sharedPreferencesM8640c9, strM2091g, "fold_group_menu_create", c0498w1.f1522a);
                                                    C0828b.m2092h(sharedPreferencesM8640c9, strM2091g, "fold_group_menu_click", c0498w1.f1523b);
                                                }
                                            } else {
                                                c0498w1 = new C0498w1(methodM2087c9, methodM2087c10);
                                                method6 = methodM2087c8;
                                            }
                                            byte b102 = 0;
                                            methodM10439d = C5740a.f23386a.m10439d(c3742g, new C0468n1(b102, b102));
                                            if (methodM10439d == null) {
                                                C0429d2.f1249o = method8;
                                                C0429d2.f1250p = method12;
                                                int i12 = 1;
                                                if (C0429d2.f1236b.compareAndSet(false, true)) {
                                                    AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_conversation_groups").registerOnSharedPreferenceChangeListener(new SharedPreferencesOnSharedPreferenceChangeListenerC0216b(c3742g, i12));
                                                    C1625b c1625bConversationChanges = WeChatApis.conversationChanges();
                                                    if (c1625bConversationChanges != null) {
                                                        c1625bConversationChanges.f5324d.addIfAbsent(new C0480q1(c3742g));
                                                    }
                                                    C0429d2.m1445y(c3742g.f12143a);
                                                }
                                                boolean zM1434m = C0429d2.m1434m(method, new C0421b2(method8, c3742g));
                                                boolean zM1434m2 = C0429d2.m1434m(method2, new C0226f(2));
                                                boolean zM1434m3 = C0429d2.m1434m(method3, new C0417a2(c3742g, 0));
                                                boolean zM1434m4 = C0429d2.m1434m(method4, new C0226f(11));
                                                boolean zM1434m5 = C0429d2.m1434m(method12, new C0226f(7));
                                                boolean zM1434m6 = C0429d2.m1434m(method5, new C0226f(6));
                                                boolean zM1434m7 = method6 != null ? C0429d2.m1434m(method6, new C0226f(8)) : true;
                                                Class<?> clsLoadClass2 = KavaReflector.loadClass("com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI", c3742g.f12145c);
                                                if (clsLoadClass2 == null || (methodFindDeclaredMethod = KavaReflector.findDeclaredMethod(clsLoadClass2, "onActivityCreated", Bundle.class)) == null || (clsLoadClass = KavaReflector.loadClass("com.tencent.mm.ui.FragmentActivitySupport", c3742g.f12145c)) == null || (methodFindDeclaredMethod2 = KavaReflector.findDeclaredMethod(clsLoadClass, "getStringExtra", String.class)) == null) {
                                                    z11 = zM1434m;
                                                    z12 = zM1434m5;
                                                    i9 = 0;
                                                } else {
                                                    boolean zM1434m8 = C0429d2.m1434m(methodFindDeclaredMethod2, new C0226f(10));
                                                    boolean zM1434m9 = C0429d2.m1434m(methodFindDeclaredMethod, new C0417a2(c3742g, 1));
                                                    List listM101y0 = AbstractC0000a.m101y0("onPause", "onResume");
                                                    if (listM101y0.isEmpty()) {
                                                        z11 = zM1434m;
                                                        z12 = zM1434m5;
                                                        z13 = true;
                                                        i9 = 0;
                                                    } else {
                                                        Iterator it = listM101y0.iterator();
                                                        while (true) {
                                                            if (it.hasNext()) {
                                                                String str2 = (String) it.next();
                                                                z11 = zM1434m;
                                                                i9 = 0;
                                                                Method methodFindDeclaredMethod3 = KavaReflector.findDeclaredMethod(clsLoadClass2, str2, new Class[0]);
                                                                z12 = zM1434m5;
                                                                if (methodFindDeclaredMethod3 != null ? C0429d2.m1434m(methodFindDeclaredMethod3, new C0425c2(str2, i9, c3742g)) : false) {
                                                                    zM1434m = z11;
                                                                    zM1434m5 = z12;
                                                                } else {
                                                                    z13 = false;
                                                                }
                                                            } else {
                                                                z11 = zM1434m;
                                                                z12 = zM1434m5;
                                                                i9 = 0;
                                                                z13 = true;
                                                            }
                                                        }
                                                    }
                                                    if (!zM1434m8 || !zM1434m9 || !z13) {
                                                        AbstractC1184v0.m3203m("[Hchat:ConversationGroup] 微信原生分组页面 Hook 安装不完整: fragment=com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI");
                                                    }
                                                    if (zM1434m8 && zM1434m9 && z13) {
                                                        i10 = 1;
                                                    }
                                                    if (c0498w1 != null) {
                                                        boolean zM1434m10 = C0429d2.m1434m(c0498w1.f1523b, new C0226f(3));
                                                        int i13 = (zM1434m10 && C0429d2.m1434m(c0498w1.f1522a, new C0226f(4))) ? 1 : i9;
                                                        if (!zM1434m10 || i13 == 0) {
                                                            AbstractC1184v0.m3203m("[Hchat:ConversationGroup] 微信原生分组长按菜单 Hook 安装不完整，已保留原生菜单");
                                                        }
                                                    }
                                                    z10 = (!z11 && zM1434m2 && zM1434m3 && zM1434m4 && z12 && zM1434m6 && zM1434m7 && i10 != 0 && C0429d2.m1434m(methodM10439d, new C0226f(5))) ? 1 : i9;
                                                }
                                                i10 = i9;
                                                if (c0498w1 != null) {
                                                }
                                                if (!z11) {
                                                    z10 = (!z11 && zM1434m2 && zM1434m3 && zM1434m4 && z12 && zM1434m6 && zM1434m7 && i10 != 0 && C0429d2.m1434m(methodM10439d, new C0226f(5))) ? 1 : i9;
                                                }
                                            } else {
                                                z9 = false;
                                            }
                                        } else {
                                            z9 = false;
                                        }
                                        z10 = z9;
                                    }
                                }
                            }
                        }
                    }
                }
                return Boolean.valueOf(z10);
            case 1:
                return Boolean.valueOf(C0881m0.f2707a.m2204g(this.f1279h));
            case 2:
                C3742g c3742g2 = this.f1279h;
                synchronized (C0866f.f2660a) {
                    try {
                        c3742g2.getClass();
                        if (!C0866f.f2662c) {
                            try {
                                WeChatApis.message().getClass();
                                c2345i = WeChatApis.messageChangeApi;
                            } catch (Throwable unused) {
                                c2345i = null;
                            }
                            if (c2345i != null && c2345i.m5607b()) {
                                try {
                                    c2345i.m5606a();
                                    break;
                                } catch (Throwable unused2) {
                                }
                                c2345i.m5608e(new C0864e());
                                C0866f.f2662c = true;
                            }
                            z = C0866f.f2662c;
                            break;
                        }
                    } finally {
                    }
                }
                return Boolean.valueOf(z);
            case 3:
                C0876k.f2687a.m2191j(this.f1279h);
                return Boolean.TRUE;
            case 4:
                C3742g c3742g3 = this.f1279h;
                synchronized (C0861d.f2640a) {
                    try {
                        c3742g3.getClass();
                        if (!C0861d.f2641b) {
                            C1366g c1366gChatroomChanges = WeChatApis.chatroomChanges();
                            if (c1366gChatroomChanges == null) {
                                z = false;
                            } else {
                                C3080d c3080d = c1366gChatroomChanges.f4525a;
                                if (c3080d != null && c3080d.m6548f()) {
                                    try {
                                        C0861d.m2169g();
                                        break;
                                    } catch (Throwable unused3) {
                                    }
                                    c1366gChatroomChanges.m3683a(new C0852a());
                                    try {
                                        c3959f4 = WeChatApis.messageObserve();
                                    } catch (Throwable th6) {
                                        c3959f4 = new C3959f(th6);
                                    }
                                    C2352p c2352p = (C2352p) (c3959f4 instanceof C3959f ? null : c3959f4);
                                    if (c2352p != null && c2352p.m5638c()) {
                                        try {
                                            c2352p.m5637b();
                                            break;
                                        } catch (Throwable unused4) {
                                        }
                                        c2352p.m5640e(new C0855b(i11));
                                    }
                                    C0861d.f2641b = true;
                                    break;
                                }
                            }
                        }
                    } finally {
                    }
                }
                return Boolean.valueOf(z);
            case 5:
                return Boolean.valueOf(C0881m0.f2707a.m2204g(this.f1279h));
            case 6:
                return Boolean.valueOf(C0881m0.f2707a.m2204g(this.f1279h));
            case 7:
                return this.f1279h.f12146d;
            case 8:
                return this.f1279h.f12146d;
            case 9:
                Method methodM10783d = AbstractC6019i.m10783d(this.f1279h, true);
                return Boolean.valueOf((methodM10783d == null || (weChatDatabaseApiDatabase = WeChatApis.database()) == null || AbstractC6019i.m10786g(weChatDatabaseApiDatabase, methodM10783d) == null) ? false : true);
            default:
                return Boolean.valueOf(C0881m0.f2707a.m2204g(this.f1279h));
        }
    }
}
