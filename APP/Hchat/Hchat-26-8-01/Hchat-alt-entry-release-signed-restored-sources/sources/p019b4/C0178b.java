package p019b4;

import android.app.Notification;
import android.view.MenuItem;
import ca.C0509a0;
import gg.AbstractC1416l;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p036c9.C0414a;
import p051db.C0763a;
import p054dg.C0795n;
import p062e8.C0828b;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1231l;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.utils.KavaReflector;
import p106h8.C1624a;
import p109hb.C1697t;
import p136j8.C2104o;
import p153k8.C2356t;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3143g;
import p218og.C3145i;
import p218og.InterfaceC3142f;
import p222p.AbstractC3199a;
import p276sf.C3959f;
import p276sf.C3967n;
import p332wb.C5026jv;
import tf.AbstractC4165l;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: b4.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0178b implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f460g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [e8.b.j(android.content.SharedPreferences, java.lang.String, java.lang.String, java.util.List):void] */
    public /* synthetic */ C0178b(C0828b c0828b) {
        this.f460g = 29;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:143:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014e  */
    @Override // p085fg.InterfaceC1231l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        C1624a c1624aConversations;
        boolean z9;
        boolean z10;
        Object c3959f;
        int i9;
        switch (this.f460g) {
            case 0:
                InterfaceC0180d interfaceC0180d = (InterfaceC0180d) obj;
                interfaceC0180d.getClass();
                return interfaceC0180d;
            case 1:
                List list = (List) obj;
                list.getClass();
                C5026jv c5026jv = (C5026jv) AbstractC4166m.m8400I1(list);
                if (c5026jv != null && (c1624aConversations = WeChatApis.conversations()) != null) {
                    c1624aConversations.m4147h(c5026jv.f18249a);
                }
                return C3967n.f12976a;
            case 2:
                obj.getClass();
                Class<?> cls = obj.getClass();
                Class cls2 = Integer.TYPE;
                cls2.getClass();
                return KavaReflector.findMethod(cls, "onMMMenuItemSelected", MenuItem.class, cls2);
            case 3:
                Constructor constructor = (Constructor) obj;
                constructor.getClass();
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                parameterTypes.getClass();
                return AbstractC4165l.m8376k0(parameterTypes);
            case 4:
                Field field = (Field) obj;
                field.getClass();
                return Boolean.valueOf(AbstractC1416l.m3825a(field.getType(), String.class) && !Modifier.isStatic(field.getModifiers()));
            case 5:
                Field field2 = (Field) obj;
                field2.getClass();
                return Boolean.valueOf(Modifier.isStatic(field2.getModifiers()));
            case 6:
                C0414a c0414a = (C0414a) obj;
                c0414a.getClass();
                return c0414a.f1179a;
            case 7:
                String str = (String) obj;
                str.getClass();
                boolean z11 = false;
                if (str.length() > 0 && !AbstractC3156t.m6740d0(str, "wxid_hchat_group_", false)) {
                    z11 = true;
                }
                return Boolean.valueOf(z11);
            case 8:
                Method method = (Method) obj;
                method.getClass();
                if (!Modifier.isStatic(method.getModifiers())) {
                    Class<?>[] parameterTypes2 = method.getParameterTypes();
                    parameterTypes2.getClass();
                    z9 = parameterTypes2.length == 0 && AbstractC1416l.m3825a(method.getReturnType(), String.class);
                }
                return Boolean.valueOf(z9);
            case 9:
                String str2 = (String) obj;
                return AbstractC3199a.m6839l(str2, str2);
            case 10:
                C1697t c1697t = (C1697t) obj;
                c1697t.getClass();
                int i10 = c1697t.f5647b;
                if (i10 > 0) {
                    int i11 = i10 & 255;
                    int i12 = 65535 & i10;
                    if ((i10 >>> 16) != 0) {
                        if (i12 == 10000 || i12 == 10002) {
                            i10 = i12;
                        } else if (i11 != 0 && i12 == i11) {
                            i10 = i11;
                        }
                    }
                }
                return Boolean.valueOf(i10 == 1);
            case 11:
                C1697t c1697t2 = (C1697t) obj;
                c1697t2.getClass();
                C2356t c2356t = c1697t2.f5652g;
                String str3 = c2356t != null ? c2356t.f7743c : null;
                if (str3 == null) {
                    str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                return AbstractC3149m.m6721t0(str3) ? c1697t2.f5649d : str3;
            case 12:
                ((String) obj).getClass();
                return Boolean.valueOf(!AbstractC3149m.m6721t0(r5));
            case 13:
                C1697t c1697t3 = (C1697t) obj;
                c1697t3.getClass();
                int i13 = c1697t3.f5647b;
                if (i13 > 0) {
                    int i14 = i13 & 255;
                    int i15 = 65535 & i13;
                    if ((i13 >>> 16) != 0) {
                        if (i15 == 10000 || i15 == 10002) {
                            i13 = i15;
                        } else if (i14 != 0 && i15 == i14) {
                            i13 = i14;
                        }
                    }
                }
                return Boolean.valueOf(i13 == 3);
            case 14:
                C5026jv c5026jv2 = (C5026jv) obj;
                c5026jv2.getClass();
                return Boolean.valueOf(c5026jv2.f18251c);
            case 15:
                C5026jv c5026jv3 = (C5026jv) obj;
                c5026jv3.getClass();
                return c5026jv3.f18249a;
            case 16:
                C0509a0 c0509a0 = (C0509a0) obj;
                c0509a0.getClass();
                return new C0795n(c0509a0.f1559c, 6);
            case 17:
                Method method2 = (Method) obj;
                Class<?>[] parameterTypes3 = method2.getParameterTypes();
                if (AbstractC1416l.m3825a(method2.getName(), "notify")) {
                    parameterTypes3.getClass();
                    if (parameterTypes3.length != 0) {
                        if (parameterTypes3.length == 0) {
                            C2104o.m5287l("Array is empty.");
                            return null;
                        }
                        z10 = AbstractC1416l.m3825a(parameterTypes3[parameterTypes3.length - 1], Notification.class);
                    }
                }
                return Boolean.valueOf(z10);
            case 18:
                Field field3 = (Field) obj;
                field3.getClass();
                return Boolean.valueOf(Modifier.isStatic(field3.getModifiers()));
            case 19:
                obj.getClass();
                Class<?> cls3 = obj.getClass();
                Class cls4 = Integer.TYPE;
                cls4.getClass();
                return KavaReflector.findMethod(cls3, "onMMMenuItemSelected", MenuItem.class, cls4);
            case 20:
                Field field4 = (Field) obj;
                field4.getClass();
                return Boolean.valueOf(AbstractC1416l.m3825a(field4.getType(), String.class));
            case 21:
                String str4 = (String) obj;
                return AbstractC3199a.m6839l(str4, str4);
            case 22:
                String str5 = (String) obj;
                str5.getClass();
                return Boolean.valueOf(str5.length() > 0);
            case 23:
                InterfaceC3142f interfaceC3142f = (InterfaceC3142f) obj;
                interfaceC3142f.getClass();
                C3145i c3145i = (C3145i) interfaceC3142f;
                String str6 = (String) ((C3143g) c3145i.m6676a()).get(1);
                try {
                    if (AbstractC3156t.m6740d0(str6, "x", true)) {
                        String strSubstring = str6.substring(1);
                        AbstractC0000a.m96w(16);
                        i9 = Integer.parseInt(strSubstring, 16);
                    } else {
                        i9 = Integer.parseInt(str6);
                    }
                    c3959f = Integer.valueOf(i9);
                    break;
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                if (c3959f instanceof C3959f) {
                    c3959f = null;
                }
                Integer num = (Integer) c3959f;
                if (num == null) {
                    return c3145i.m6678c();
                }
                char[] chars = Character.toChars(num.intValue());
                chars.getClass();
                return new String(chars);
            case 24:
                return Boolean.valueOf(((Long) obj).longValue() > 0);
            case 25:
                C0763a c0763a = (C0763a) obj;
                c0763a.getClass();
                return Boolean.valueOf(c0763a.f2286a == 1);
            case 26:
                C0763a c0763a2 = (C0763a) obj;
                c0763a2.getClass();
                return AbstractC3149m.m6703R0(c0763a2.f2287b).toString();
            case 27:
                String str7 = (String) obj;
                str7.getClass();
                return Boolean.valueOf(!AbstractC3149m.m6721t0(str7) && AbstractC0921a.m2262y(str7));
            case 28:
                String str8 = (String) obj;
                str8.getClass();
                return new C0763a(1, str8);
            default:
                Method method3 = (Method) obj;
                method3.getClass();
                return C0828b.m2095l(method3);
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [a2.a.u(db.c):java.util.List, a2.a.v(db.c):java.util.List, b5.c.L(java.lang.Object, long):ca.a, b9.e.b(de.robv.android.xposed.XC_MethodHook$MethodHookParam):void, ba.f.afterHookedMethod(de.robv.android.xposed.XC_MethodHook$MethodHookParam):void, c9.d2.t(java.lang.reflect.Method):java.lang.Class, c9.i.invoke(java.lang.Object):java.lang.Object, c9.o2.f(java.lang.String, java.util.List):java.util.Set, c9.o2.t(android.content.Context, java.lang.String, java.util.ArrayList):boolean, ca.e0.j(android.app.Activity, java.util.List):ca.c0] */
    public /* synthetic */ C0178b(int i9) {
        this.f460g = i9;
    }
}
