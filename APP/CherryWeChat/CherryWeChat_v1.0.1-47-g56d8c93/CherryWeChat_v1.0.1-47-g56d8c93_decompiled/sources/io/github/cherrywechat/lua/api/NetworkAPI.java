package io.github.cherrywechat.lua.api;

import android.app.Activity;
import android.content.Context;
import dalvik.system.DexClassLoader;
import io.github.cherrywechat.lua.LuaEngine;
import io.github.cherrywechat.lua.LuaLocks;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p000.AbstractC0213Ey;
import p000.AbstractC0295Gu;
import p000.AbstractC1406fG;
import p000.AbstractC2453ra;
import p000.AbstractC2496sa;
import p000.AbstractC2675wh;
import p000.C0095C8;
import p000.C0181E8;
import p000.C0340Hw;
import p000.C0465Ks;
import p000.C0495Lf;
import p000.C0829TC;
import p000.C0848Tp;
import p000.C1355e9;
import p000.RunnableC0009A8;
import p000.RunnableC0052B8;
import p000.RunnableC0267G8;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
public final class NetworkAPI {
    private static final int DEFAULT_TIMEOUT = 30000;
    private static final String TAG = AbstractC0295Gu.m625r(-339663193634869L);
    public static final NetworkAPI INSTANCE = new NetworkAPI();
    private static final ExecutorService executor = Executors.newCachedThreadPool();

    private NetworkAPI() {
    }

    private final String httpGet(String str, Map<String, String> map) throws IOException {
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        AbstractC0295Gu.m625r(-342751275120693L);
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        try {
            httpURLConnection.setRequestMethod(AbstractC0295Gu.m625r(-341376885585973L));
            httpURLConnection.setConnectTimeout(DEFAULT_TIMEOUT);
            httpURLConnection.setReadTimeout(DEFAULT_TIMEOUT);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 200) {
                throw new RuntimeException(AbstractC0295Gu.m625r(-341394065455157L) + responseCode + AbstractC0295Gu.m625r(-340870079445045L) + httpURLConnection.getResponseMessage());
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            try {
                String strM2708h0 = AbstractC1406fG.m2708h0(bufferedReader);
                bufferedReader.close();
                httpURLConnection.disconnect();
                return strM2708h0;
            } finally {
            }
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }

    private final String httpPost(String str, String str2, Map<String, String> map) throws IOException {
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        AbstractC0295Gu.m625r(-340882964346933L);
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        try {
            httpURLConnection.setRequestMethod(AbstractC0295Gu.m625r(-341707598067765L));
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setConnectTimeout(DEFAULT_TIMEOUT);
            httpURLConnection.setReadTimeout(DEFAULT_TIMEOUT);
            if (!map.containsKey(AbstractC0295Gu.m625r(-341729072904245L))) {
                httpURLConnection.setRequestProperty(AbstractC0295Gu.m625r(-341784907479093L), AbstractC0295Gu.m625r(-341840742053941L));
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream());
            try {
                outputStreamWriter.write(str2);
                outputStreamWriter.flush();
                outputStreamWriter.close();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 200) {
                    throw new RuntimeException(AbstractC0295Gu.m625r(-341437015128117L) + responseCode + AbstractC0295Gu.m625r(-341462784931893L) + httpURLConnection.getResponseMessage());
                }
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                try {
                    String strM2708h0 = AbstractC1406fG.m2708h0(bufferedReader);
                    bufferedReader.close();
                    httpURLConnection.disconnect();
                    return strM2708h0;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }

    private final Map<String, String> readTableAsMap(Lua lua, int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        lua.pushValue(i);
        lua.pushNil();
        while (lua.next(-2) != 0) {
            String string = lua.toString(-2);
            String string2 = lua.toString(-1);
            if (string != null && string2 != null) {
                linkedHashMap.put(string, string2);
            }
            lua.pop(1);
        }
        lua.pop(1);
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$0(Lua lua) {
        AbstractC0295Gu.m625r(-341475669833781L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        try {
            lua.push(INSTANCE.httpGet(string, (lua.getTop() < 2 || !lua.isTable(2)) ? C0495Lf.f1620a : INSTANCE.readTableAsMap(lua, 2)));
            return 1;
        } catch (Exception e) {
            AbstractC0295Gu.m625r(-341484259768373L);
            AbstractC0295Gu.m625r(-341531504408629L);
            lua.pushNil();
            AbstractC0213Ey.m415m(-341621698721845L, new StringBuilder(), e, lua);
            return 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$15(Lua lua) {
        AbstractC0295Gu.m625r(-340732640491573L);
        String string = lua.toString(1);
        if (string != null) {
            String string2 = lua.toString(2);
            if (string2 == null) {
                string2 = AbstractC0295Gu.m625r(-340741230426165L);
            }
            String str = string2;
            if (lua.isFunction(3)) {
                lua.pushValue(3);
                executor.execute(new RunnableC0267G8(string, str, lua, lua.ref(), 1));
                return 0;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$15$lambda$14(String str, String str2, Lua lua, int i) {
        try {
            String strHttpPost = INSTANCE.httpPost(str, str2, C0495Lf.f1620a);
            Activity currentActivity = CherryAPI.INSTANCE.getCurrentActivity();
            if (currentActivity != null) {
                currentActivity.runOnUiThread(new RunnableC0009A8(lua, i, strHttpPost, 4));
            }
        } catch (Exception e) {
            Activity currentActivity2 = CherryAPI.INSTANCE.getCurrentActivity();
            if (currentActivity2 != null) {
                currentActivity2.runOnUiThread(new RunnableC0052B8(lua, i, e, 4));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$15$lambda$14$lambda$11(Lua lua, int i, String str) {
        LuaLocks.INSTANCE.withLock(lua, new C0181E8(lua, i, str, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$15$lambda$14$lambda$11$lambda$10(Lua lua, int i, String str) {
        lua.refGet(i);
        lua.push(str);
        lua.pushNil();
        lua.pCall(2, 0);
        lua.unref(i);
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$15$lambda$14$lambda$13(Lua lua, int i, Exception exc) {
        LuaLocks.INSTANCE.withLock(lua, new C0095C8(lua, i, exc, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$15$lambda$14$lambda$13$lambda$12(Lua lua, int i, Exception exc) {
        lua.refGet(i);
        lua.pushNil();
        AbstractC0213Ey.m415m(-340698280753205L, new StringBuilder(), exc, lua);
        lua.pCall(2, 0);
        lua.unref(i);
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$18(Lua lua) {
        AbstractC0295Gu.m625r(-340745525393461L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        try {
            File file = new File(string);
            if (!file.exists()) {
                lua.pushNil();
                lua.push(AbstractC0295Gu.m625r(-340754115328053L).concat(string));
                return 2;
            }
            Object objM5465executeIoAF18A = LuaEngine.INSTANCE.m5465executeIoAF18A(AbstractC2675wh.m5244g0(file));
            Throwable thM726a = C0340Hw.m726a(objM5465executeIoAF18A);
            if (thM726a == null) {
                if (objM5465executeIoAF18A != null) {
                    lua.push(objM5465executeIoAF18A, Lua.Conversion.SEMI);
                    return 1;
                }
                lua.push(true);
                return 1;
            }
            lua.pushNil();
            lua.push(AbstractC0295Gu.m625r(-340827129772085L) + thM726a.getMessage());
            return 2;
        } catch (Exception e) {
            AbstractC0295Gu.m625r(-340311733696565L);
            AbstractC0295Gu.m625r(-340358978336821L);
            lua.pushNil();
            AbstractC0213Ey.m415m(-340431992780853L, new StringBuilder(), e, lua);
            return 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$19(Lua lua) {
        AbstractC0295Gu.m625r(-340466352519221L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        String string2 = lua.getTop() >= 2 ? lua.toString(2) : null;
        try {
            Context currentContext = CherryAPI.INSTANCE.getCurrentContext();
            if (currentContext == null) {
                lua.pushNil();
                lua.push(AbstractC0295Gu.m625r(-340474942453813L));
                return 2;
            }
            File file = new File(string);
            if (!file.exists()) {
                lua.pushNil();
                lua.push(AbstractC0295Gu.m625r(-340565136767029L).concat(string));
                return 2;
            }
            File file2 = new File(currentContext.getCacheDir(), AbstractC0295Gu.m625r(-338988883769397L));
            if (!file2.exists()) {
                file2.mkdirs();
            }
            DexClassLoader dexClassLoader = new DexClassLoader(file.getAbsolutePath(), file2.getAbsolutePath(), null, currentContext.getClassLoader());
            if (string2 != null) {
                lua.push(dexClassLoader.loadClass(string2), Lua.Conversion.SEMI);
            } else {
                lua.push(dexClassLoader, Lua.Conversion.SEMI);
            }
            LuaEngine.INSTANCE.addClassLoader(dexClassLoader);
            AbstractC0295Gu.m625r(-339023243507765L);
            AbstractC0295Gu.m625r(-339070488148021L);
            return 1;
        } catch (Exception e) {
            AbstractC0295Gu.m625r(-339126322722869L);
            AbstractC0295Gu.m625r(-339173567363125L);
            lua.pushNil();
            AbstractC0213Ey.m415m(-338696825993269L, new StringBuilder(), e, lua);
            return 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$2(Lua lua) {
        String strM625r;
        AbstractC0295Gu.m625r(-340105575266357L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        if (lua.isTable(2)) {
            strM625r = AbstractC2453ra.m4901k0(INSTANCE.readTableAsMap(lua, 2).entrySet(), AbstractC0295Gu.m625r(-340114165200949L), null, null, new C0848Tp(15), 30);
        } else if (lua.isString(2)) {
            strM625r = lua.toString(2);
            if (strM625r == null) {
                strM625r = AbstractC0295Gu.m625r(-340122755135541L);
            }
        } else {
            strM625r = AbstractC0295Gu.m625r(-340127050102837L);
        }
        try {
            lua.push(INSTANCE.httpPost(string, strM625r, (lua.getTop() < 3 || !lua.isTable(3)) ? C0495Lf.f1620a : INSTANCE.readTableAsMap(lua, 3)));
            return 1;
        } catch (Exception e) {
            AbstractC0295Gu.m625r(-340131345070133L);
            AbstractC0295Gu.m625r(-340178589710389L);
            lua.pushNil();
            AbstractC0213Ey.m415m(-340273078990901L, new StringBuilder(), e, lua);
            return 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence register$lambda$2$lambda$1(Map.Entry entry) {
        AbstractC0295Gu.m625r(-341656058460213L);
        return URLEncoder.encode((String) entry.getKey(), AbstractC0295Gu.m625r(-340054035658805L)) + '=' + URLEncoder.encode((String) entry.getValue(), AbstractC0295Gu.m625r(-340079805462581L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$24(Lua lua) {
        File file;
        AbstractC0295Gu.m625r(-338731185731637L);
        String string = lua.toString(1);
        boolean z = false;
        if (string == null) {
            return 0;
        }
        Context currentContext = CherryAPI.INSTANCE.getCurrentContext();
        if (currentContext != null) {
            try {
                file = new File(currentContext.getFilesDir(), AbstractC0295Gu.m625r(-338739775666229L));
            } catch (Exception e) {
                AbstractC0295Gu.m625r(-339508574812213L);
                AbstractC0295Gu.m625r(-339555819452469L);
                lua.pushNil();
                AbstractC0213Ey.m415m(-339628833896501L, new StringBuilder(), e, lua);
                return 2;
            }
        } else {
            file = null;
        }
        Iterator it = AbstractC2496sa.m4977b0(string.concat(AbstractC0295Gu.m625r(-338791315273781L)), string.concat(AbstractC0295Gu.m625r(-338812790110261L)), string.replace('.', '/') + AbstractC0295Gu.m625r(-338855739783221L)).iterator();
        while (it.hasNext()) {
            File file2 = file != null ? new File(file, (String) it.next()) : null;
            if (file2 != null && file2.exists()) {
                Object objM5465executeIoAF18A = LuaEngine.INSTANCE.m5465executeIoAF18A(AbstractC2675wh.m5244g0(file2));
                if (C0340Hw.m726a(objM5465executeIoAF18A) == null) {
                    if (objM5465executeIoAF18A != null) {
                        lua.push(objM5465executeIoAF18A, Lua.Conversion.SEMI);
                    } else {
                        lua.push(true);
                    }
                    z = true;
                }
                if (z) {
                    break;
                }
            }
        }
        if (z) {
            return 1;
        }
        lua.pushNil();
        lua.push(AbstractC0295Gu.m625r(-338877214619701L) + string);
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$3(Lua lua) {
        AbstractC0295Gu.m625r(-339757682915381L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        String string2 = lua.toString(2);
        if (string2 == null) {
            string2 = AbstractC0295Gu.m625r(-339766272849973L);
        }
        LinkedHashMap linkedHashMap = (lua.getTop() < 3 || !lua.isTable(3)) ? new LinkedHashMap() : new LinkedHashMap(INSTANCE.readTableAsMap(lua, 3));
        linkedHashMap.put(AbstractC0295Gu.m625r(-339779157751861L), AbstractC0295Gu.m625r(-339834992326709L));
        try {
            lua.push(INSTANCE.httpPost(string, string2, linkedHashMap));
            return 1;
        } catch (Exception e) {
            AbstractC0295Gu.m625r(-339908006770741L);
            AbstractC0295Gu.m625r(-339955251410997L);
            lua.pushNil();
            AbstractC0213Ey.m415m(-340620971341877L, new StringBuilder(), e, lua);
            return 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$9(Lua lua) {
        AbstractC0295Gu.m625r(-340689690818613L);
        String string = lua.toString(1);
        if (string == null || !lua.isFunction(2)) {
            return 0;
        }
        lua.pushValue(2);
        executor.execute(new RunnableC0009A8(string, lua, lua.ref()));
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$9$lambda$8(String str, Lua lua, int i) {
        try {
            String strHttpGet = INSTANCE.httpGet(str, C0495Lf.f1620a);
            Activity currentActivity = CherryAPI.INSTANCE.getCurrentActivity();
            if (currentActivity != null) {
                currentActivity.runOnUiThread(new RunnableC0009A8(lua, i, strHttpGet, 2));
            }
        } catch (Exception e) {
            Activity currentActivity2 = CherryAPI.INSTANCE.getCurrentActivity();
            if (currentActivity2 != null) {
                currentActivity2.runOnUiThread(new RunnableC0052B8(lua, i, e, 3));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$9$lambda$8$lambda$5(Lua lua, int i, String str) {
        LuaLocks.INSTANCE.withLock(lua, new C0181E8(lua, i, str, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$9$lambda$8$lambda$5$lambda$4(Lua lua, int i, String str) {
        lua.refGet(i);
        lua.push(str);
        lua.pushNil();
        lua.pCall(2, 0);
        lua.unref(i);
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$9$lambda$8$lambda$7(Lua lua, int i, Exception exc) {
        LuaLocks.INSTANCE.withLock(lua, new C0095C8(lua, i, exc, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$9$lambda$8$lambda$7$lambda$6(Lua lua, int i, Exception exc) {
        lua.refGet(i);
        lua.pushNil();
        AbstractC0213Ey.m415m(-340655331080245L, new StringBuilder(), exc, lua);
        lua.pCall(2, 0);
        lua.unref(i);
        return C0829TC.f2620a;
    }

    public final void register(Lua lua) {
        AbstractC0295Gu.m625r(-342845764401205L);
        lua.createTable(0, 10);
        lua.push(new C0465Ks(6));
        lua.setField(-2, AbstractC0295Gu.m625r(-342862944270389L));
        lua.push(new C1355e9(29));
        lua.setField(-2, AbstractC0295Gu.m625r(-342880124139573L));
        lua.push(new C0465Ks(0));
        lua.setField(-2, AbstractC0295Gu.m625r(-342901598976053L));
        lua.push(new C0465Ks(1));
        lua.setField(-2, AbstractC0295Gu.m625r(-342940253681717L));
        lua.push(new C0465Ks(2));
        lua.setField(-2, AbstractC0295Gu.m625r(-342978908387381L));
        lua.push(new C0465Ks(3));
        lua.setField(-2, AbstractC0295Gu.m625r(-343021858060341L));
        lua.push(new C0465Ks(4));
        lua.setField(-2, AbstractC0295Gu.m625r(-342506461984821L));
        lua.push(new C0465Ks(5));
        lua.setField(-2, AbstractC0295Gu.m625r(-342540821723189L));
        lua.setGlobal(AbstractC0295Gu.m625r(-342575181461557L));
        AbstractC0295Gu.m625r(-342609541199925L);
        AbstractC0295Gu.m625r(-342656785840181L);
    }
}
