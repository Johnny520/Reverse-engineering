package io.github.cherrywechat.lua.api;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;
import io.github.cherrywechat.lua.LuaLocks;
import io.github.cherrywechat.lua.LuaUiScheduler;
import io.github.cherrywechat.lua.api.CherryAPI;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import p000.AbstractC0213Ey;
import p000.AbstractC0295Gu;
import p000.AbstractC0650P4;
import p000.AbstractC2453ra;
import p000.AbstractC2539ta;
import p000.AbstractC2598uq;
import p000.AbstractC2675wh;
import p000.C0200El;
import p000.C0208Et;
import p000.C0286Gl;
import p000.C0309H7;
import p000.C0829TC;
import p000.C1227bm;
import p000.C2087j8;
import p000.C2131k8;
import p000.C2265n8;
import p000.C2308o8;
import p000.C2402q8;
import p000.DialogInterfaceOnClickListenerC2179l8;
import p000.InterfaceC0884Ui;
import p000.InterfaceC1416fj;
import p000.RunnableC2222m8;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"StaticFieldLeak"})
public final class CherryAPI {
    private static volatile Activity currentActivity;
    private static volatile Context currentContext;
    private static volatile InterfaceC1416fj printListener;
    private static final String TAG = AbstractC0295Gu.m625r(-502481108858933L);
    public static final CherryAPI INSTANCE = new CherryAPI();
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());

    private CherryAPI() {
    }

    private final void registerConfigApi(Lua lua) {
        lua.createTable(0, 4);
        lua.push(new C2131k8(23));
        lua.setField(-2, AbstractC0295Gu.m625r(-506067406551093L));
        lua.push(new C2131k8(24));
        lua.setField(-2, AbstractC0295Gu.m625r(-506084586420277L));
        lua.push(new C2131k8(25));
        lua.setField(-2, AbstractC0295Gu.m625r(-506101766289461L));
        lua.push(new C2131k8(26));
        lua.setField(-2, AbstractC0295Gu.m625r(-506131831060533L));
        lua.setField(-2, AbstractC0295Gu.m625r(-506157600864309L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerConfigApi$lambda$32(Lua lua) {
        AbstractC0295Gu.m625r(-503657929898037L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        String string2 = lua.getTop() > 1 ? lua.toString(2) : null;
        Context context = currentContext;
        if (context == null) {
            context = currentActivity;
        }
        if (context != null) {
            String string3 = context.getSharedPreferences(AbstractC0295Gu.m625r(-503666519832629L), 0).getString(string, string2);
            if (string3 != null) {
                lua.push(string3);
            } else {
                lua.pushNil();
            }
        } else if (string2 != null) {
            lua.push(string2);
        } else {
            lua.pushNil();
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerConfigApi$lambda$33(Lua lua) {
        AbstractC0295Gu.m625r(-503713764472885L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        String string2 = lua.toString(2);
        Context context = currentContext;
        if (context == null) {
            context = currentActivity;
        }
        if (context != null) {
            context.getSharedPreferences(AbstractC0295Gu.m625r(-503722354407477L), 0).edit().putString(string, string2).apply();
            lua.push(true);
        } else {
            lua.push(false);
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerConfigApi$lambda$34(Lua lua) {
        AbstractC0295Gu.m625r(-503769599047733L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        Context context = currentContext;
        if (context == null) {
            context = currentActivity;
        }
        if (context != null) {
            context.getSharedPreferences(AbstractC0295Gu.m625r(-503778188982325L), 0).edit().remove(string).apply();
            lua.push(true);
        } else {
            lua.push(false);
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerConfigApi$lambda$35(Lua lua) {
        AbstractC0295Gu.m625r(-503825433622581L);
        Context context = currentContext;
        if (context == null) {
            context = currentActivity;
        }
        if (context != null) {
            context.getSharedPreferences(AbstractC0295Gu.m625r(-503834023557173L), 0).edit().clear().apply();
            lua.push(true);
        } else {
            lua.push(false);
        }
        return 1;
    }

    private final void registerFileApi(Lua lua) {
        lua.createTable(0, 6);
        lua.push(new C2131k8(3));
        lua.setField(-2, AbstractC0295Gu.m625r(-506325104588853L));
        lua.push(new C2131k8(4));
        lua.setField(-2, AbstractC0295Gu.m625r(-505796823611445L));
        lua.push(new C2131k8(5));
        lua.setField(-2, AbstractC0295Gu.m625r(-505822593415221L));
        lua.push(new C2131k8(6));
        lua.setField(-2, AbstractC0295Gu.m625r(-505852658186293L));
        lua.push(new C2131k8(7));
        lua.setField(-2, AbstractC0295Gu.m625r(-505882722957365L));
        lua.push(new C2131k8(8));
        lua.setField(-2, AbstractC0295Gu.m625r(-505908492761141L));
        lua.push(new C2131k8(9));
        lua.setField(-2, AbstractC0295Gu.m625r(-505929967597621L));
        lua.setField(-2, AbstractC0295Gu.m625r(-505985802172469L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerFileApi$lambda$46(Lua lua) {
        AbstractC0295Gu.m625r(-504456793815093L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        try {
            lua.push(AbstractC2675wh.m5244g0(new File(string)));
            return 1;
        } catch (Exception unused) {
            lua.pushNil();
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerFileApi$lambda$47(Lua lua) {
        AbstractC0295Gu.m625r(-504465383749685L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        String string2 = lua.toString(2);
        if (string2 == null) {
            string2 = AbstractC0295Gu.m625r(-504473973684277L);
        }
        try {
            AbstractC2675wh.m5246i0(new File(string), string2);
            lua.push(true);
            return 1;
        } catch (Exception unused) {
            lua.push(false);
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerFileApi$lambda$48(Lua lua) {
        AbstractC0295Gu.m625r(-504478268651573L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        lua.push(new File(string).exists());
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerFileApi$lambda$49(Lua lua) {
        AbstractC0295Gu.m625r(-504486858586165L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        lua.push(new File(string).delete());
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerFileApi$lambda$50(Lua lua) {
        AbstractC0295Gu.m625r(-504495448520757L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        lua.push(new File(string).mkdirs());
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerFileApi$lambda$52(Lua lua) {
        AbstractC0295Gu.m625r(-504504038455349L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        File[] fileArrListFiles = new File(string).listFiles();
        if (fileArrListFiles != null) {
            lua.createTable(fileArrListFiles.length, 0);
            int i = 0;
            for (File file : fileArrListFiles) {
                i++;
                lua.push(file.getName());
                lua.rawSetI(-2, i);
            }
        } else {
            lua.createTable(0, 0);
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerFileApi$lambda$53(Lua lua) {
        AbstractC0295Gu.m625r(-504512628389941L);
        Context context = currentContext;
        if (context == null) {
            context = currentActivity;
        }
        if (context == null) {
            lua.pushNil();
            return 1;
        }
        File file = new File(context.getFilesDir(), AbstractC0295Gu.m625r(-504521218324533L));
        if (!file.exists()) {
            file.mkdirs();
        }
        lua.push(file.getAbsolutePath());
        return 1;
    }

    private final void registerGlobalFunctions(Lua lua) {
        lua.push(new C2131k8(19));
        lua.setGlobal(AbstractC0295Gu.m625r(-506007277008949L));
        lua.push(new C2131k8(20));
        lua.setGlobal(AbstractC0295Gu.m625r(-506033046812725L));
        lua.push(new C2131k8(21));
        lua.setGlobal(AbstractC0295Gu.m625r(-506612867397685L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerGlobalFunctions$lambda$55(Lua lua) {
        String strM625r;
        AbstractC0295Gu.m625r(-504572757932085L);
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
                strM625r = AbstractC0295Gu.m625r(-504581347866677L);
            }
            arrayList.add(strM625r);
        }
        String strM4901k0 = AbstractC2453ra.m4901k0(arrayList, AbstractC0295Gu.m625r(-504598527735861L), null, null, null, 62);
        AbstractC0295Gu.m625r(-504607117670453L);
        InterfaceC1416fj interfaceC1416fj = printListener;
        if (interfaceC1416fj == null) {
            return 0;
        }
        interfaceC1416fj.mo90g(strM4901k0);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerGlobalFunctions$lambda$57(Lua lua) {
        String string;
        AbstractC0295Gu.m625r(-504650067343413L);
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
            String.format(string, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            AbstractC0295Gu.m625r(-504658657278005L);
            AbstractC0295Gu.m625r(-504160441071669L);
        } catch (Exception e) {
            AbstractC0213Ey.m411i(-504203390744629L, -504246340417589L, e);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerGlobalFunctions$lambda$60(Lua lua) {
        AbstractC0295Gu.m625r(-504310764927029L);
        Object object = lua.toObject(1);
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC0295Gu.m625r(-504319354861621L));
        sb.append('\n');
        sb.append(AbstractC0295Gu.m625r(-504345124665397L).concat(object != null ? object.getClass().getName() : AbstractC0295Gu.m625r(-504375189436469L)));
        sb.append('\n');
        if (object != null) {
            sb.append(AbstractC0295Gu.m625r(-504392369305653L) + object);
            sb.append('\n');
            if (!(object instanceof String) && !(object instanceof Number) && !(object instanceof Boolean)) {
                sb.append(AbstractC0295Gu.m625r(-502777461602357L));
                sb.append('\n');
                Field[] declaredFields = object.getClass().getDeclaredFields();
                AbstractC0295Gu.m625r(-502811821340725L);
                for (Field field : AbstractC0650P4.m1315J(declaredFields, 10)) {
                    field.setAccessible(true);
                    try {
                        sb.append(AbstractC0295Gu.m625r(-502910605588533L) + field.getName() + AbstractC0295Gu.m625r(-502923490490421L) + field.get(object));
                        sb.append('\n');
                    } catch (Exception unused) {
                        sb.append(AbstractC0295Gu.m625r(-502936375392309L) + field.getName() + AbstractC0295Gu.m625r(-502949260294197L));
                        sb.append('\n');
                    }
                }
            }
        }
        sb.append(AbstractC0295Gu.m625r(-502992209967157L));
        sb.append('\n');
        String string = sb.toString();
        AbstractC0295Gu.m625r(-502996504934453L);
        lua.push(string);
        return 1;
    }

    private final void registerLogApi(Lua lua) {
        lua.push(new C2131k8(10));
        lua.setField(-2, AbstractC0295Gu.m625r(-507119673538613L));
        for (Map.Entry entry : AbstractC2598uq.m5110L(new C0208Et(AbstractC0295Gu.m625r(-507136853407797L), new C0309H7(1)), new C0208Et(AbstractC0295Gu.m625r(-507708084058165L), new C0309H7(2)), new C0208Et(AbstractC0295Gu.m625r(-507729558894645L), new C0309H7(3)), new C0208Et(AbstractC0295Gu.m625r(-507751033731125L), new C0309H7(4))).entrySet()) {
            String str = (String) entry.getKey();
            lua.push(new C1227bm(3, (Function2) entry.getValue()));
            lua.setField(-2, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerLogApi$lambda$0(Lua lua) {
        AbstractC0295Gu.m625r(-506634342234165L);
        if (lua.getTop() == 1) {
            if (lua.toString(1) == null) {
                AbstractC0295Gu.m625r(-506642932168757L);
            }
            AbstractC0295Gu.m625r(-506660112037941L);
            return 0;
        }
        if (lua.toString(1) == null) {
            AbstractC0295Gu.m625r(-506703061710901L);
        }
        if (lua.toString(2) != null) {
            return 0;
        }
        AbstractC0295Gu.m625r(-506746011383861L);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerLogApi$lambda$1(String str, String str2) {
        AbstractC0295Gu.m625r(-506763191253045L);
        AbstractC0295Gu.m625r(-506780371122229L);
        return Log.d(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerLogApi$lambda$2(String str, String str2) {
        AbstractC0295Gu.m625r(-506797550991413L);
        AbstractC0295Gu.m625r(-506814730860597L);
        return Log.i(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerLogApi$lambda$3(String str, String str2) {
        AbstractC0295Gu.m625r(-506831910729781L);
        AbstractC0295Gu.m625r(-506849090598965L);
        return Log.w(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerLogApi$lambda$4(String str, String str2) {
        AbstractC0295Gu.m625r(-506866270468149L);
        AbstractC0295Gu.m625r(-506333694523445L);
        return Log.e(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int registerLogApi$lambda$6$lambda$5(Function2 function2, Lua lua) {
        String strM625r;
        String string;
        long j;
        long j2;
        AbstractC0295Gu.m625r(-506350874392629L);
        if (lua.getTop() > 1) {
            strM625r = lua.toString(1);
            j2 = strM625r == null ? -506359464327221L : -506402414000181L;
            if (lua.getTop() <= 1) {
                string = lua.toString(2);
                if (string == null) {
                    j = -506445363673141L;
                    string = AbstractC0295Gu.m625r(j);
                }
            } else {
                string = lua.toString(1);
                if (string == null) {
                    j = -506462543542325L;
                    string = AbstractC0295Gu.m625r(j);
                }
            }
            function2.mo446d(strM625r, string);
            return 0;
        }
        strM625r = AbstractC0295Gu.m625r(j2);
        if (lua.getTop() <= 1) {
        }
        function2.mo446d(strM625r, string);
        return 0;
    }

    private final void registerThreadApi(Lua lua) {
        lua.push(new C2131k8(11));
        lua.setField(-2, AbstractC0295Gu.m625r(-506187665635381L));
        lua.push(new C2131k8(12));
        lua.setField(-2, AbstractC0295Gu.m625r(-506247795177525L));
        lua.push(new C2131k8(13));
        lua.setField(-2, AbstractC0295Gu.m625r(-506299334785077L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerThreadApi$lambda$38(Lua lua) {
        AbstractC0295Gu.m625r(-504431024011317L);
        if (!lua.isFunction(1)) {
            return 0;
        }
        lua.pushValue(1);
        INSTANCE.runOnUiThread(new C2087j8(lua, lua.ref(), 0));
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC registerThreadApi$lambda$38$lambda$37(Lua lua, int i) {
        LuaLocks.INSTANCE.withLock(lua, new C2087j8(lua, i, 8));
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC registerThreadApi$lambda$38$lambda$37$lambda$36(Lua lua, int i) {
        lua.refGet(i);
        lua.pCall(0, 0);
        lua.unref(i);
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerThreadApi$lambda$42(Lua lua) {
        AbstractC0295Gu.m625r(-504439613945909L);
        if (!lua.isFunction(1)) {
            return 0;
        }
        long number = (long) lua.toNumber(2);
        lua.pushValue(1);
        mainHandler.postDelayed(new RunnableC2222m8(lua, lua.ref(), 0), number);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerThreadApi$lambda$42$lambda$41(Lua lua, int i) {
        LuaUiScheduler.INSTANCE.runOnUiThread(new C2087j8(lua, i, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC registerThreadApi$lambda$42$lambda$41$lambda$40(Lua lua, int i) {
        LuaLocks.INSTANCE.withLock(lua, new C2087j8(lua, i, 6));
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC registerThreadApi$lambda$42$lambda$41$lambda$40$lambda$39(Lua lua, int i) {
        lua.refGet(i);
        lua.pCall(0, 0);
        lua.unref(i);
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerThreadApi$lambda$45(Lua lua) {
        AbstractC0295Gu.m625r(-504448203880501L);
        if (!lua.isFunction(1)) {
            return 0;
        }
        lua.pushValue(1);
        new Thread(new RunnableC2222m8(lua, lua.ref(), 1)).start();
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerThreadApi$lambda$45$lambda$44(Lua lua, int i) {
        LuaLocks.INSTANCE.withLock(lua, new C2087j8(lua, i, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC registerThreadApi$lambda$45$lambda$44$lambda$43(Lua lua, int i) {
        lua.refGet(i);
        lua.pCall(0, 0);
        lua.unref(i);
        return C0829TC.f2620a;
    }

    private final void registerUiApi(Lua lua) {
        lua.push(new C2131k8(14));
        lua.setField(-2, AbstractC0295Gu.m625r(-507772508567605L));
        lua.push(new C2131k8(15));
        lua.setField(-2, AbstractC0295Gu.m625r(-507798278371381L));
        lua.push(new C2131k8(16));
        lua.setField(-2, AbstractC0295Gu.m625r(-507824048175157L));
        lua.push(new C2131k8(17));
        lua.setField(-2, AbstractC0295Gu.m625r(-507858407913525L));
        lua.push(new C2131k8(18));
        lua.setField(-2, AbstractC0295Gu.m625r(-507909947521077L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerUiApi$lambda$12(Lua lua) {
        int iRef;
        AbstractC0295Gu.m625r(-505148283549749L);
        String string = lua.toString(1);
        if (string == null) {
            string = AbstractC0295Gu.m625r(-505156873484341L);
        }
        String str = string;
        String string2 = lua.toString(2);
        if (string2 == null) {
            string2 = AbstractC0295Gu.m625r(-505161168451637L);
        }
        String str2 = string2;
        if (lua.getTop() < 3 || !lua.isFunction(3)) {
            iRef = -1;
        } else {
            lua.pushValue(3);
            iRef = lua.ref();
        }
        INSTANCE.runOnUiThread(new C2265n8(str, str2, iRef, lua, 1));
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC registerUiApi$lambda$12$lambda$11(String str, String str2, int i, Lua lua) {
        Activity activity = currentActivity;
        if (activity == null || activity.isFinishing()) {
            AbstractC0295Gu.m625r(-505010844596277L);
            AbstractC0295Gu.m625r(-505053794269237L);
        } else {
            new AlertDialog.Builder(activity).setTitle(str).setMessage(str2).setPositiveButton(AbstractC0295Gu.m625r(-504997959694389L), new DialogInterfaceOnClickListenerC2179l8(i, lua, 0)).show();
        }
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerUiApi$lambda$12$lambda$11$lambda$10(int i, Lua lua, DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        if (i != -1) {
            LuaLocks.INSTANCE.withLock(lua, new C2087j8(lua, i, 4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC registerUiApi$lambda$12$lambda$11$lambda$10$lambda$9(Lua lua, int i) {
        lua.refGet(i);
        lua.push(true);
        lua.pCall(1, 0);
        lua.unref(i);
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerUiApi$lambda$20(Lua lua) {
        int iRef;
        AbstractC0295Gu.m625r(-505208413091893L);
        String string = lua.toString(1);
        if (string == null) {
            string = AbstractC0295Gu.m625r(-505217003026485L);
        }
        String str = string;
        String string2 = lua.toString(2);
        if (string2 == null) {
            string2 = AbstractC0295Gu.m625r(-505221297993781L);
        }
        String str2 = string2;
        if (lua.getTop() < 3 || !lua.isFunction(3)) {
            iRef = -1;
        } else {
            lua.pushValue(3);
            iRef = lua.ref();
        }
        INSTANCE.runOnUiThread(new C2265n8(str, str2, iRef, lua, 0));
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC registerUiApi$lambda$20$lambda$19(String str, String str2, final int i, final Lua lua) {
        Activity activity = currentActivity;
        if (activity != null && !activity.isFinishing()) {
            new AlertDialog.Builder(activity).setTitle(str).setMessage(str2).setPositiveButton(AbstractC0295Gu.m625r(-505165463418933L), new DialogInterfaceOnClickListenerC2179l8(i, lua, 1)).setNegativeButton(AbstractC0295Gu.m625r(-505178348320821L), new DialogInterfaceOnClickListenerC2179l8(i, lua, 2)).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: p8
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    CherryAPI.registerUiApi$lambda$20$lambda$19$lambda$18(i, lua, dialogInterface);
                }
            }).show();
        }
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerUiApi$lambda$20$lambda$19$lambda$14(int i, Lua lua, DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        if (i != -1) {
            LuaLocks.INSTANCE.withLock(lua, new C2087j8(lua, i, 5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC registerUiApi$lambda$20$lambda$19$lambda$14$lambda$13(Lua lua, int i) {
        lua.refGet(i);
        lua.push(true);
        lua.pCall(1, 0);
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerUiApi$lambda$20$lambda$19$lambda$16(int i, Lua lua, DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        if (i != -1) {
            LuaLocks.INSTANCE.withLock(lua, new C2087j8(lua, i, 7));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC registerUiApi$lambda$20$lambda$19$lambda$16$lambda$15(Lua lua, int i) {
        lua.refGet(i);
        lua.push(false);
        lua.pCall(1, 0);
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerUiApi$lambda$20$lambda$19$lambda$18(int i, Lua lua, DialogInterface dialogInterface) {
        if (i != -1) {
            LuaLocks.INSTANCE.withLock(lua, new C2087j8(lua, i, 3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC registerUiApi$lambda$20$lambda$19$lambda$18$lambda$17(Lua lua, int i) {
        lua.unref(i);
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerUiApi$lambda$21(Lua lua) {
        AbstractC0295Gu.m625r(-505225592961077L);
        Activity activity = currentActivity;
        if (activity != null) {
            lua.push(activity, Lua.Conversion.SEMI);
            return 1;
        }
        lua.pushNil();
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerUiApi$lambda$22(Lua lua) {
        AbstractC0295Gu.m625r(-504684427081781L);
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
    public static final int registerUiApi$lambda$8(Lua lua) {
        AbstractC0295Gu.m625r(-504972189890613L);
        String string = lua.toString(1);
        if (string == null) {
            string = AbstractC0295Gu.m625r(-504980779825205L);
        }
        INSTANCE.runOnUiThread(new C2308o8(string, (lua.getTop() <= 1 || ((int) lua.toNumber(2)) <= 0) ? 0 : 1, 0));
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC registerUiApi$lambda$8$lambda$7(String str, int i) {
        Context context = currentActivity;
        if (context == null) {
            context = currentContext;
        }
        if (context != null) {
            Toast.makeText(context, str, i).show();
        } else {
            AbstractC0295Gu.m625r(-506479723411509L);
            AbstractC0295Gu.m625r(-506522673084469L);
        }
        return C0829TC.f2620a;
    }

    private final void registerUtilApi(Lua lua) {
        lua.push(new C2131k8(22));
        lua.setField(-2, AbstractC0295Gu.m625r(-507957192161333L));
        lua.push(new C2131k8(27));
        lua.setField(-2, AbstractC0295Gu.m625r(-507433206151221L));
        lua.push(new C2131k8(28));
        lua.setField(-2, AbstractC0295Gu.m625r(-507489040726069L));
        lua.push(new C2131k8(29));
        lua.setField(-2, AbstractC0295Gu.m625r(-507544875300917L));
        lua.push(new C2402q8(0));
        lua.setField(-2, AbstractC0295Gu.m625r(-507566350137397L));
        lua.push(new C2402q8(1));
        lua.setField(-2, AbstractC0295Gu.m625r(-507587824973877L));
        lua.push(new C2131k8(0));
        lua.setField(-2, AbstractC0295Gu.m625r(-507613594777653L));
        lua.push(new C2131k8(1));
        lua.setField(-2, AbstractC0295Gu.m625r(-507647954516021L));
        lua.push(new C2131k8(2));
        lua.setField(-2, AbstractC0295Gu.m625r(-507669429352501L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerUtilApi$lambda$23(Lua lua) throws InterruptedException {
        AbstractC0295Gu.m625r(-504693017016373L);
        long number = (long) lua.toNumber(1);
        if (number <= 0) {
            return 0;
        }
        Thread.sleep(number);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerUtilApi$lambda$24(Lua lua) {
        AbstractC0295Gu.m625r(-504701606950965L);
        lua.push(LuaUiScheduler.INSTANCE.isForeground());
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerUtilApi$lambda$25(Lua lua) {
        AbstractC0295Gu.m625r(-504710196885557L);
        lua.push(!LuaUiScheduler.INSTANCE.isForeground());
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerUtilApi$lambda$26(Lua lua) {
        AbstractC0295Gu.m625r(-504718786820149L);
        lua.push(Double.valueOf(System.currentTimeMillis()));
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerUtilApi$lambda$27(Lua lua) {
        AbstractC0295Gu.m625r(-504727376754741L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        Context context = currentActivity;
        if (context == null) {
            context = currentContext;
        }
        if (context != null) {
            Object systemService = context.getSystemService(AbstractC0295Gu.m625r(-504735966689333L));
            AbstractC0295Gu.m625r(-504778916362293L);
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(AbstractC0295Gu.m625r(-505629319886901L), string));
            lua.push(true);
        } else {
            lua.push(false);
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerUtilApi$lambda$28(Lua lua) {
        ClipData.Item itemAt;
        CharSequence text;
        AbstractC0295Gu.m625r(-505667974592565L);
        Context context = currentActivity;
        if (context == null) {
            context = currentContext;
        }
        if (context == null) {
            lua.pushNil();
            return 1;
        }
        Object systemService = context.getSystemService(AbstractC0295Gu.m625r(-505676564527157L));
        AbstractC0295Gu.m625r(-505719514200117L);
        ClipData primaryClip = ((ClipboardManager) systemService).getPrimaryClip();
        String string = (primaryClip == null || (itemAt = primaryClip.getItemAt(0)) == null || (text = itemAt.getText()) == null) ? null : text.toString();
        if (string != null) {
            lua.push(string);
            return 1;
        }
        lua.pushNil();
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerUtilApi$lambda$29(Lua lua) {
        AbstractC0295Gu.m625r(-505470406096949L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        Context context = currentActivity;
        if (context == null) {
            context = currentContext;
        }
        if (context != null) {
            try {
                Intent intent = new Intent(AbstractC0295Gu.m625r(-505478996031541L), Uri.parse(string));
                intent.addFlags(268435456);
                context.startActivity(intent);
                lua.push(true);
            } catch (Exception unused) {
                AbstractC0295Gu.m625r(-503945692706869L);
                AbstractC0295Gu.m625r(-503988642379829L);
                lua.push(false);
            }
        } else {
            lua.push(false);
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerUtilApi$lambda$30(Lua lua) {
        AbstractC0295Gu.m625r(-504078836693045L);
        Object object = lua.toObject(1);
        lua.push(object == null ? AbstractC0295Gu.m625r(-504087426627637L) : object instanceof String ? AbstractC0295Gu.m625r(-504104606496821L) : object instanceof Number ? AbstractC0295Gu.m625r(-503584915454005L) : object instanceof Boolean ? AbstractC0295Gu.m625r(-503614980225077L) : object.getClass().getSimpleName());
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerUtilApi$lambda$31(Lua lua) {
        AbstractC0295Gu.m625r(-503649339963445L);
        Object object = lua.toObject(1);
        String string = lua.toString(2);
        if (object == null || string == null) {
            lua.push(false);
        } else {
            try {
                lua.push(Class.forName(string).isInstance(object));
            } catch (ClassNotFoundException unused) {
                lua.push(false);
            }
        }
        return 1;
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
        AbstractC0295Gu.m625r(-506939284912181L);
        lua.createTable(0, 20);
        registerLogApi(lua);
        registerUiApi(lua);
        registerUtilApi(lua);
        registerConfigApi(lua);
        registerThreadApi(lua);
        registerFileApi(lua);
        lua.setGlobal(AbstractC0295Gu.m625r(-506956464781365L));
        registerGlobalFunctions(lua);
        AbstractC0295Gu.m625r(-506986529552437L);
        AbstractC0295Gu.m625r(-507029479225397L);
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
