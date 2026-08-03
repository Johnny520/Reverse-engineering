package io.github.cherrywechat.lua.api;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import io.github.cherrywechat.lua.LuaLocks;
import io.github.cherrywechat.lua.LuaUiScheduler;
import io.github.cherrywechat.lua.dev.LogInterceptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p000.AbstractC0213Ey;
import p000.AbstractC0295Gu;
import p000.AbstractC0650P4;
import p000.AbstractC2453ra;
import p000.AbstractC2539ta;
import p000.C0200El;
import p000.C0223F7;
import p000.C0286Gl;
import p000.C0829TC;
import p000.C2087j8;
import p000.C2308o8;
import p000.C2574u8;
import p000.C2617v8;
import p000.InterfaceC0884Ui;
import p000.InterfaceC1416fj;
import p000.RunnableC2222m8;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"StaticFieldLeak"})
public final class CherryGlobalAPI {
    private static volatile Activity currentActivity;
    private static volatile Context currentContext;
    private static volatile InterfaceC1416fj printListener;
    private static final String TAG = AbstractC0295Gu.m625r(-548381424351285L);
    public static final CherryGlobalAPI INSTANCE = new CherryGlobalAPI();
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());

    private CherryGlobalAPI() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$1(Lua lua) {
        String strM625r;
        AbstractC0295Gu.m625r(-549532475586613L);
        C0286Gl c0286Gl = new C0286Gl(1, lua.getTop(), 1);
        ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(c0286Gl, 10));
        Iterator it = c0286Gl.iterator();
        while (true) {
            C0200El c0200El = (C0200El) it;
            if (!c0200El.f605c) {
                break;
            }
            Object object = lua.toObject(c0200El.nextInt());
            if (object == null || (strM625r = object.toString()) == null) {
                strM625r = AbstractC0295Gu.m625r(-549541065521205L);
            }
            arrayList.add(strM625r);
        }
        String strM4901k0 = AbstractC2453ra.m4901k0(arrayList, AbstractC0295Gu.m625r(-549558245390389L), null, null, null, 62);
        LogInterceptor.INSTANCE.print(strM4901k0);
        InterfaceC1416fj interfaceC1416fj = printListener;
        if (interfaceC1416fj == null) {
            return 0;
        }
        interfaceC1416fj.mo90g(strM4901k0);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$10(Lua lua) {
        AbstractC0295Gu.m625r(-547939042719797L);
        String string = lua.toString(1);
        if (string == null) {
            string = AbstractC0295Gu.m625r(-547947632654389L);
        }
        INSTANCE.runOnUiThread(new C2308o8(string, (lua.getTop() <= 1 || ((int) lua.toNumber(2)) <= 0) ? 0 : 1, 1));
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$10$lambda$9(String str, int i) {
        Context context = currentActivity;
        if (context == null) {
            context = currentContext;
        }
        if (context != null) {
            Toast.makeText(context, str, i).show();
        }
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$15(Lua lua) {
        AbstractC0295Gu.m625r(-548033532000309L);
        Object object = lua.toObject(1);
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC0295Gu.m625r(-548042121934901L));
        sb.append('\n');
        sb.append(AbstractC0295Gu.m625r(-548097956509749L).concat(object != null ? object.getClass().getName() : AbstractC0295Gu.m625r(-547578265466933L)));
        sb.append('\n');
        if (object != null) {
            sb.append(AbstractC0295Gu.m625r(-547595445336117L) + object);
            sb.append('\n');
            if (!(object instanceof String) && !(object instanceof Number) && !(object instanceof Boolean)) {
                sb.append(AbstractC0295Gu.m625r(-547629805074485L));
                sb.append('\n');
                Field[] declaredFields = object.getClass().getDeclaredFields();
                AbstractC0295Gu.m625r(-547664164812853L);
                for (Field field : AbstractC0650P4.m1315J(declaredFields, 15)) {
                    field.setAccessible(true);
                    try {
                        sb.append(AbstractC0295Gu.m625r(-547762949060661L) + field.getName() + AbstractC0295Gu.m625r(-547775833962549L) + field.get(object));
                        sb.append('\n');
                    } catch (Exception unused) {
                        sb.append(AbstractC0295Gu.m625r(-547788718864437L) + field.getName() + AbstractC0295Gu.m625r(-547801603766325L));
                        sb.append('\n');
                    }
                }
                sb.append(AbstractC0295Gu.m625r(-548394309253173L));
                sb.append('\n');
                Method[] declaredMethods = object.getClass().getDeclaredMethods();
                AbstractC0295Gu.m625r(-548432963958837L);
                for (Method method : AbstractC0650P4.m1315J(declaredMethods, 10)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(AbstractC0295Gu.m625r(-548536043173941L));
                    sb2.append(method.getName());
                    sb2.append('(');
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    AbstractC0295Gu.m625r(-548548928075829L);
                    sb2.append(AbstractC0650P4.m1314I(parameterTypes, new C0223F7(15), 31));
                    sb2.append(')');
                    sb.append(sb2.toString());
                    sb.append('\n');
                }
            }
        }
        sb.append(AbstractC0295Gu.m625r(-548647712323637L));
        sb.append('\n');
        String string = sb.toString();
        LogInterceptor.INSTANCE.m3526d(AbstractC0295Gu.m625r(-548153791084597L), string);
        InterfaceC1416fj interfaceC1416fj = printListener;
        if (interfaceC1416fj != null) {
            interfaceC1416fj.mo90g(string);
        }
        lua.push(string);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence register$lambda$15$lambda$14$lambda$13$lambda$12(Class cls) {
        String simpleName = cls.getSimpleName();
        AbstractC0295Gu.m625r(-547951927621685L);
        return simpleName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$17(Lua lua) {
        AbstractC0295Gu.m625r(-548188150822965L);
        String string = lua.toString(1);
        if (string == null) {
            string = AbstractC0295Gu.m625r(-548196740757557L);
        }
        INSTANCE.runOnUiThread(new C2308o8(string, (lua.getTop() <= 1 || ((int) lua.toNumber(2)) <= 0) ? 0 : 1, 2));
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$17$lambda$16(String str, int i) {
        Context context = currentActivity;
        if (context == null) {
            context = currentContext;
        }
        if (context != null) {
            Toast.makeText(context, str, i).show();
        }
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$18(Lua lua) {
        AbstractC0295Gu.m625r(-548201035724853L);
        if (lua.getTop() == 1) {
            LogInterceptor logInterceptor = LogInterceptor.INSTANCE;
            String strM625r = AbstractC0295Gu.m625r(-548209625659445L);
            String string = lua.toString(1);
            if (string == null) {
                string = AbstractC0295Gu.m625r(-548252575332405L);
            }
            logInterceptor.m3526d(strM625r, string);
            return 0;
        }
        String string2 = lua.toString(1);
        if (string2 == null) {
            string2 = AbstractC0295Gu.m625r(-548269755201589L);
        }
        String string3 = lua.toString(2);
        if (string3 == null) {
            string3 = AbstractC0295Gu.m625r(-548312704874549L);
        }
        LogInterceptor.INSTANCE.m3526d(string2, string3);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$19(Lua lua) throws InterruptedException {
        AbstractC0295Gu.m625r(-548329884743733L);
        long number = (long) lua.toNumber(1);
        if (number <= 0) {
            return 0;
        }
        Thread.sleep(number);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$20(Lua lua) {
        AbstractC0295Gu.m625r(-548338474678325L);
        lua.push(Double.valueOf(System.currentTimeMillis()));
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$23(Lua lua) {
        AbstractC0295Gu.m625r(-548347064612917L);
        if (!lua.isFunction(1)) {
            return 0;
        }
        lua.pushValue(1);
        INSTANCE.runOnUiThread(new C2087j8(lua, lua.ref(), 11));
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$23$lambda$22(Lua lua, int i) {
        LuaLocks.INSTANCE.withLock(lua, new C2087j8(lua, i, 12));
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$23$lambda$22$lambda$21(Lua lua, int i) {
        try {
            lua.refGet(i);
            lua.pCall(0, 0);
            lua.unref(i);
            return C0829TC.f2620a;
        } catch (Throwable th) {
            lua.unref(i);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$27(Lua lua) {
        AbstractC0295Gu.m625r(-548355654547509L);
        long number = (long) lua.toNumber(1);
        if (!lua.isFunction(2)) {
            return 0;
        }
        lua.pushValue(2);
        mainHandler.postDelayed(new RunnableC2222m8(lua, lua.ref(), 2), number);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$27$lambda$26(Lua lua, int i) {
        LuaUiScheduler.INSTANCE.runOnUiThread(new C2087j8(lua, i, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$27$lambda$26$lambda$25(Lua lua, int i) {
        LuaLocks.INSTANCE.withLock(lua, new C2087j8(lua, i, 9));
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$27$lambda$26$lambda$25$lambda$24(Lua lua, int i) {
        try {
            lua.refGet(i);
            lua.pCall(0, 0);
            lua.unref(i);
            return C0829TC.f2620a;
        } catch (Throwable th) {
            lua.unref(i);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$28(Lua lua) {
        AbstractC0295Gu.m625r(-548364244482101L);
        Object obj = currentActivity;
        if (obj == null) {
            obj = currentContext;
        }
        if (obj != null) {
            lua.push(obj, Lua.Conversion.SEMI);
            return 1;
        }
        lua.pushNil();
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$29(Lua lua) {
        AbstractC0295Gu.m625r(-548372834416693L);
        if (currentActivity != null) {
            lua.push(currentActivity, Lua.Conversion.SEMI);
            return 1;
        }
        lua.pushNil();
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$3(Lua lua) {
        String string;
        AbstractC0295Gu.m625r(-549566835324981L);
        if (lua.getTop() < 1 || (string = lua.toString(1)) == null) {
            return 0;
        }
        C0286Gl c0286Gl = new C0286Gl(2, lua.getTop(), 1);
        ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(c0286Gl, 10));
        Iterator it = c0286Gl.iterator();
        while (it.hasNext()) {
            arrayList.add(lua.toObject(((C0200El) it).nextInt()));
        }
        Object[] array = arrayList.toArray(new Object[0]);
        try {
            Object[] objArrCopyOf = Arrays.copyOf(array, array.length);
            String str = String.format(string, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            AbstractC0295Gu.m625r(-549575425259573L);
            LogInterceptor.INSTANCE.print(str);
            InterfaceC1416fj interfaceC1416fj = printListener;
            if (interfaceC1416fj != null) {
                interfaceC1416fj.mo90g(str);
            }
        } catch (Exception e) {
            LogInterceptor.e$default(LogInterceptor.INSTANCE, AbstractC0295Gu.m625r(-549626964867125L), AbstractC0213Ey.m405c(-549669914540085L, new StringBuilder(), e), null, 4, null);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$4(Lua lua) {
        AbstractC0295Gu.m625r(-549734339049525L);
        if (lua.getTop() == 1) {
            LogInterceptor logInterceptor = LogInterceptor.INSTANCE;
            String strM625r = AbstractC0295Gu.m625r(-549742928984117L);
            String string = lua.toString(1);
            if (string == null) {
                string = AbstractC0295Gu.m625r(-549236122843189L);
            }
            logInterceptor.m3526d(strM625r, string);
            return 0;
        }
        String string2 = lua.toString(1);
        if (string2 == null) {
            string2 = AbstractC0295Gu.m625r(-549253302712373L);
        }
        String string3 = lua.toString(2);
        if (string3 == null) {
            string3 = AbstractC0295Gu.m625r(-549296252385333L);
        }
        LogInterceptor.INSTANCE.m3526d(string2, string3);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$5(Lua lua) {
        AbstractC0295Gu.m625r(-549313432254517L);
        String string = lua.toString(1);
        if (string == null) {
            string = AbstractC0295Gu.m625r(-549322022189109L);
        }
        LogInterceptor.INSTANCE.m3526d(AbstractC0295Gu.m625r(-549339202058293L), string);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$6(Lua lua) {
        AbstractC0295Gu.m625r(-549382151731253L);
        String string = lua.toString(1);
        if (string == null) {
            string = AbstractC0295Gu.m625r(-549390741665845L);
        }
        LogInterceptor.INSTANCE.m3528i(AbstractC0295Gu.m625r(-549407921535029L), string);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$7(Lua lua) {
        AbstractC0295Gu.m625r(-549450871207989L);
        String string = lua.toString(1);
        if (string == null) {
            string = AbstractC0295Gu.m625r(-549459461142581L);
        }
        LogInterceptor.INSTANCE.m3530w(AbstractC0295Gu.m625r(-549476641011765L), string);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$8(Lua lua) {
        AbstractC0295Gu.m625r(-547870323243061L);
        String string = lua.toString(1);
        if (string == null) {
            string = AbstractC0295Gu.m625r(-547878913177653L);
        }
        LogInterceptor.e$default(LogInterceptor.INSTANCE, AbstractC0295Gu.m625r(-547896093046837L), string, null, 4, null);
        return 0;
    }

    private final void runOnUiThread(InterfaceC0884Ui interfaceC0884Ui) {
        LuaUiScheduler.INSTANCE.runOnUiThread(interfaceC0884Ui);
    }

    public final Activity getCurrentActivity() {
        return currentActivity;
    }

    public final Context getCurrentContext() {
        return currentContext;
    }

    public final InterfaceC1416fj getPrintListener() {
        return printListener;
    }

    public final void register(Lua lua) {
        AbstractC0295Gu.m625r(-550443008653365L);
        lua.push(new C2617v8(3));
        lua.setGlobal(AbstractC0295Gu.m625r(-550460188522549L));
        lua.push(new C2574u8(24));
        lua.setGlobal(AbstractC0295Gu.m625r(-550485958326325L));
        lua.push(new C2574u8(25));
        lua.setGlobal(AbstractC0295Gu.m625r(-550516023097397L));
        lua.push(new C2574u8(26));
        lua.setGlobal(AbstractC0295Gu.m625r(-550533202966581L));
        lua.push(new C2574u8(27));
        lua.setGlobal(AbstractC0295Gu.m625r(-550554677803061L));
        lua.push(new C2574u8(28));
        lua.setGlobal(AbstractC0295Gu.m625r(-550576152639541L));
        lua.push(new C2574u8(29));
        lua.setGlobal(AbstractC0295Gu.m625r(-548948360034357L));
        lua.push(new C2617v8(0));
        lua.setGlobal(AbstractC0295Gu.m625r(-548969834870837L));
        lua.push(new C2617v8(1));
        lua.setGlobal(AbstractC0295Gu.m625r(-548995604674613L));
        lua.getGlobal(AbstractC0295Gu.m625r(-549017079511093L));
        if (!lua.isNil(-1)) {
            lua.push(new C2617v8(2));
            lua.setField(-2, AbstractC0295Gu.m625r(-549047144282165L));
            lua.push(new C2617v8(4));
            lua.setField(-2, AbstractC0295Gu.m625r(-549072914085941L));
            lua.push(new C2617v8(5));
            lua.setField(-2, AbstractC0295Gu.m625r(-549090093955125L));
            lua.push(new C2617v8(6));
            lua.setField(-2, AbstractC0295Gu.m625r(-549115863758901L));
            lua.push(new C2574u8(20));
            lua.setField(-2, AbstractC0295Gu.m625r(-549137338595381L));
            lua.push(new C2574u8(21));
            lua.setField(-2, AbstractC0295Gu.m625r(-549197468137525L));
            lua.push(new C2574u8(22));
            lua.setField(-2, AbstractC0295Gu.m625r(-548699251931189L));
            lua.push(new C2574u8(23));
            lua.setField(-2, AbstractC0295Gu.m625r(-548746496571445L));
        }
        lua.pop(1);
        AbstractC0295Gu.m625r(-548798036178997L);
        AbstractC0295Gu.m625r(-548866755655733L);
    }

    public final void setCurrentActivity(Activity activity) {
        currentActivity = activity;
    }

    public final void setCurrentContext(Context context) {
        currentContext = context;
    }

    public final void setPrintListener(InterfaceC1416fj interfaceC1416fj) {
        printListener = interfaceC1416fj;
    }
}
