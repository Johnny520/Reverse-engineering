package p063e9;

import gg.AbstractC1416l;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import p025bc.AbstractC0255e;
import p025bc.C0262l;
import p025bc.InterfaceC0254d;
import p065eb.C0853a0;
import p065eb.C0877k0;
import p080fb.C1107c;
import p085fg.InterfaceC1231l;
import p099h.Hchat.hooks.items.script.ScriptPluginRuntime;
import p099h.Hchat.hooks.items.script.ScriptWaBridge;
import p218og.AbstractC3149m;
import p222p.AbstractC3199a;
import p276sf.C3958e;
import p276sf.C3967n;

/* JADX INFO: renamed from: e9.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0837h implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2547g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [c9.a2.beforeHookedMethod(de.robv.android.xposed.XC_MethodHook$MethodHookParam):void, e9.q.i(r8.g):void, ea.c.d():java.lang.reflect.Constructor, ea.c.e():java.lang.reflect.Method, ea.c.h():java.lang.reflect.Method, eb.b.a(k8.o):void, f0.u.<init>(android.view.View, f0.a, f0.n):void, fb.u.D(android.content.Context, fb.v, fb.b1, fb.b, eb.o, wb.qb):java.lang.Object, fb.u.v(android.content.Context, fb.v, fb.b1, fb.b, c9.k, boolean, boolean, boolean, fb.s):fb.t1, fb.u.x0(fb.b, int, java.lang.Throwable):void, h.Hchat.hooks.items.script.ScriptPluginRuntime.dispatchOnClickSendBtn(java.lang.String):eb.d0, h.Hchat.hooks.items.script.ScriptPluginRuntime.dispatchOnHandleMsg(h.Hchat.hooks.items.script.ScriptMessageBean):void, h.Hchat.hooks.items.script.ScriptPluginRuntime.dispatchOnImageDownload$lambda$2(h.Hchat.hooks.items.script.ScriptPluginBridge, h.Hchat.hooks.items.script.ScriptMessageBean, java.lang.Object):void, h.Hchat.hooks.items.script.ScriptPluginRuntime.dispatchOnMemberChange(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void, h.Hchat.hooks.items.script.ScriptPluginRuntime.dispatchOnNewFriend(java.lang.String, java.lang.String, int):void, h.Hchat.hooks.items.script.ScriptPluginRuntime.dispatchOnProtobufPacket$lambda$1(h.Hchat.hooks.items.protobuf.ProtobufPacketRuntime$Packet):void, h.Hchat.hooks.items.script.ScriptPluginRuntime.listPlugins(android.content.Context):java.util.List<eb.c0>, h.Hchat.hooks.items.script.ScriptPluginRuntime.refreshPluginDirObservers(java.io.File):void, h.Hchat.hooks.items.script.ScriptWaBridge.buildPostBody(java.util.Map<?, ?>, java.util.Map<java.lang.String, java.lang.String>):java.lang.String] */
    public /* synthetic */ C0837h(int i9) {
        this.f2547g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b6  */
    @Override // p085fg.InterfaceC1231l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z9;
        String str;
        switch (this.f2547g) {
            case 0:
                Method method = (Method) obj;
                method.getClass();
                return Boolean.valueOf(AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE));
            case 1:
                Method method2 = (Method) obj;
                method2.getClass();
                if (AbstractC1416l.m3825a(method2.getReturnType(), Void.TYPE)) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    parameterTypes.getClass();
                    z9 = parameterTypes.length == 0;
                }
                return Boolean.valueOf(z9);
            case 2:
                String str2 = (String) obj;
                return AbstractC3199a.m6839l(str2, str2);
            case 3:
                Field field = (Field) obj;
                field.getClass();
                return Boolean.valueOf(AbstractC1416l.m3825a(field.getType(), String.class));
            case 4:
                Method method3 = (Method) obj;
                method3.getClass();
                String genericString = method3.toGenericString();
                genericString.getClass();
                return genericString;
            case 5:
                Constructor constructor = (Constructor) obj;
                constructor.getClass();
                String genericString2 = constructor.toGenericString();
                genericString2.getClass();
                return genericString2;
            case 6:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object key = entry.getKey();
                key.getClass();
                String string = AbstractC3149m.m6703R0((String) key).toString();
                Object value = entry.getValue();
                value.getClass();
                return new C3958e(string, AbstractC3149m.m6703R0((String) value).toString());
            case 7:
                String str3 = (String) obj;
                return AbstractC3199a.m6839l(str3, str3);
            case 8:
                String str4 = (String) obj;
                str4.getClass();
                return Boolean.valueOf(str4.length() > 0);
            case 9:
                String str5 = (String) obj;
                return AbstractC3199a.m6839l(str5, str5);
            case 10:
                String str6 = (String) obj;
                str6.getClass();
                return Boolean.valueOf(str6.length() > 0);
            case 11:
                return Boolean.valueOf(ScriptPluginRuntime.dispatchOnHandleMsg$lambda$0((C0853a0) obj));
            case 12:
                return Boolean.valueOf(ScriptPluginRuntime.dispatchOnNewFriend$lambda$0((C0853a0) obj));
            case 13:
                return ScriptPluginRuntime.listPlugins$lambda$0((File) obj);
            case 14:
                return Boolean.valueOf(ScriptPluginRuntime.dispatchOnImageDownload$lambda$2$0((C0853a0) obj));
            case 15:
                return ((File) obj).getName();
            case 16:
                return Boolean.valueOf(ScriptPluginRuntime.dispatchOnMemberChange$lambda$0((C0853a0) obj));
            case 17:
                return Boolean.valueOf(ScriptPluginRuntime.dispatchOnClickSendBtn$lambda$0((C0853a0) obj));
            case 18:
                return Boolean.valueOf(ScriptPluginRuntime.dispatchOnProtobufPacket$lambda$1$0((C0853a0) obj));
            case 19:
                ((C0877k0) obj).getClass();
                return true;
            case 20:
                return ScriptWaBridge.buildPostBody$lambda$1((Map.Entry) obj);
            case 21:
                return C3967n.f12976a;
            case 22:
                return C3967n.f12976a;
            case 23:
                Method method4 = (Method) obj;
                method4.getClass();
                String genericString3 = method4.toGenericString();
                genericString3.getClass();
                return genericString3;
            case 24:
                return String.format("%02x", Arrays.copyOf(new Object[]{Integer.valueOf(((Byte) obj).byteValue() & 255)}, 1));
            case 25:
                C1107c c1107c = (C1107c) obj;
                c1107c.getClass();
                return Boolean.valueOf(AbstractC1416l.m3825a(c1107c.f3584a, "user"));
            case 26:
                C1107c c1107c2 = (C1107c) obj;
                c1107c2.getClass();
                return c1107c2.f3585b;
            case 27:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                return th2.getCause();
            case 28:
                C0262l c0262l = (C0262l) obj;
                c0262l.getClass();
                InterfaceC0254d interfaceC0254dM1044b = c0262l.m1044b();
                if (interfaceC0254dM1044b == null) {
                    interfaceC0254dM1044b = c0262l.f777b.m8651V();
                }
                String strMo1010b = interfaceC0254dM1044b.mo1010b();
                strMo1010b.getClass();
                return strMo1010b;
            default:
                File file = (File) obj;
                if (file.isDirectory()) {
                    str = "/";
                } else {
                    str = " (" + file.length() + " bytes)";
                }
                return AbstractC0255e.m1020i(file.getName(), str);
        }
    }
}
