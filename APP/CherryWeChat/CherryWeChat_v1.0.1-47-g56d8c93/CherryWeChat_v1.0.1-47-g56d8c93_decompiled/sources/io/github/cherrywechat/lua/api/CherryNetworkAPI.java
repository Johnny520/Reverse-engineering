package io.github.cherrywechat.lua.api;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import dalvik.system.DexClassLoader;
import io.github.cherrywechat.lua.LuaEngine;
import io.github.cherrywechat.lua.LuaLocks;
import io.github.cherrywechat.lua.api.CherryNetworkAPI;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC0213Ey;
import p000.AbstractC0295Gu;
import p000.AbstractC1293cr;
import p000.AbstractC1406fG;
import p000.AbstractC2453ra;
import p000.AbstractC2496sa;
import p000.AbstractC2564tz;
import p000.AbstractC2675wh;
import p000.C0095C8;
import p000.C0181E8;
import p000.C0223F7;
import p000.C0340Hw;
import p000.C0495Lf;
import p000.C0829TC;
import p000.C2087j8;
import p000.C2617v8;
import p000.C2789z8;
import p000.RunnableC0009A8;
import p000.RunnableC0052B8;
import p000.RunnableC0267G8;
import p000.RunnableC2222m8;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
public final class CherryNetworkAPI {
    private static final int DEFAULT_TIMEOUT = 30000;
    private static final String TAG = AbstractC0295Gu.m625r(-533482182801461L);
    public static final CherryNetworkAPI INSTANCE = new CherryNetworkAPI();
    private static final ExecutorService executor = Executors.newCachedThreadPool();
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());

    private CherryNetworkAPI() {
    }

    private final void downloadFile(String str, String str2) throws IOException {
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        AbstractC0295Gu.m625r(-536273911543861L);
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        try {
            httpURLConnection.setConnectTimeout(DEFAULT_TIMEOUT);
            InputStream inputStream = httpURLConnection.getInputStream();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(str2));
                try {
                    AbstractC1293cr.m2555p(inputStream, fileOutputStream);
                    fileOutputStream.close();
                    inputStream.close();
                } finally {
                }
            } finally {
            }
        } finally {
            httpURLConnection.disconnect();
        }
    }

    private final String httpGet(String str, Map<String, String> map) throws IOException {
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        AbstractC0295Gu.m625r(-535926019192885L);
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        try {
            httpURLConnection.setRequestMethod(AbstractC0295Gu.m625r(-535651141285941L));
            httpURLConnection.setConnectTimeout(DEFAULT_TIMEOUT);
            httpURLConnection.setReadTimeout(DEFAULT_TIMEOUT);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
            if (httpURLConnection.getResponseCode() != 200) {
                throw new RuntimeException(AbstractC0295Gu.m625r(-535668321155125L) + httpURLConnection.getResponseCode());
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
        AbstractC0295Gu.m625r(-535694090958901L);
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        try {
            httpURLConnection.setRequestMethod(AbstractC0295Gu.m625r(-536518724679733L));
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setConnectTimeout(DEFAULT_TIMEOUT);
            httpURLConnection.setReadTimeout(DEFAULT_TIMEOUT);
            if (!map.containsKey(AbstractC0295Gu.m625r(-536540199516213L))) {
                httpURLConnection.setRequestProperty(AbstractC0295Gu.m625r(-536046278277173L), AbstractC0295Gu.m625r(-536102112852021L));
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream());
            try {
                outputStreamWriter.write(str2);
                outputStreamWriter.flush();
                outputStreamWriter.close();
                if (httpURLConnection.getResponseCode() != 200) {
                    throw new RuntimeException(AbstractC0295Gu.m625r(-536248141740085L) + httpURLConnection.getResponseCode());
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

    private final void pushJsonArray(Lua lua, JSONArray jSONArray) throws JSONException {
        int i = 0;
        lua.createTable(jSONArray.length(), 0);
        int length = jSONArray.length();
        while (i < length) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                pushJsonObject(lua, (JSONObject) obj);
            } else if (obj instanceof JSONArray) {
                pushJsonArray(lua, (JSONArray) obj);
            } else if (obj instanceof String) {
                lua.push((String) obj);
            } else if (obj instanceof Number) {
                lua.push(Double.valueOf(((Number) obj).doubleValue()));
            } else if (obj instanceof Boolean) {
                lua.push(((Boolean) obj).booleanValue());
            } else {
                lua.pushNil();
            }
            i++;
            lua.rawSetI(-2, i);
        }
    }

    private final void pushJsonObject(Lua lua, JSONObject jSONObject) throws JSONException {
        lua.createTable(0, jSONObject.length());
        Iterator<String> itKeys = jSONObject.keys();
        AbstractC0295Gu.m625r(-534418485671989L);
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                INSTANCE.pushJsonObject(lua, (JSONObject) obj);
            } else if (obj instanceof JSONArray) {
                INSTANCE.pushJsonArray(lua, (JSONArray) obj);
            } else if (obj instanceof String) {
                lua.push((String) obj);
            } else if (obj instanceof Number) {
                lua.push(Double.valueOf(((Number) obj).doubleValue()));
            } else if (obj instanceof Boolean) {
                lua.push(((Boolean) obj).booleanValue());
            } else {
                lua.pushNil();
            }
            lua.setField(-2, next);
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
        AbstractC0295Gu.m625r(-534461435344949L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        try {
            lua.push(INSTANCE.httpGet(string, (lua.getTop() < 2 || !lua.isTable(2)) ? C0495Lf.f1620a : INSTANCE.readTableAsMap(lua, 2)));
            return 1;
        } catch (Exception e) {
            lua.pushNil();
            AbstractC0213Ey.m415m(-534470025279541L, new StringBuilder(), e, lua);
            return 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$13(final Lua lua) {
        String strM625r;
        AbstractC0295Gu.m625r(-534633234036789L);
        final String string = lua.toString(1);
        if (string != null) {
            if (lua.isTable(2)) {
                strM625r = INSTANCE.tableToFormData(lua, 2);
            } else if (lua.isString(2)) {
                strM625r = lua.toString(2);
                if (strM625r == null) {
                    strM625r = AbstractC0295Gu.m625r(-535191579785269L);
                }
            } else {
                strM625r = AbstractC0295Gu.m625r(-535195874752565L);
            }
            final String str = strM625r;
            if (lua.isFunction(3)) {
                final Map<String, String> tableAsMap = (lua.getTop() < 4 || !lua.isTable(4)) ? C0495Lf.f1620a : INSTANCE.readTableAsMap(lua, 4);
                lua.pushValue(3);
                final int iRef = lua.ref();
                executor.execute(new Runnable() { // from class: D8
                    @Override // java.lang.Runnable
                    public final void run() {
                        CherryNetworkAPI.register$lambda$13$lambda$12(string, str, tableAsMap, lua, iRef);
                    }
                });
                return 0;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$13$lambda$12(String str, String str2, Map map, Lua lua, int i) {
        try {
            mainHandler.post(new RunnableC0009A8(lua, i, INSTANCE.httpPost(str, str2, map), 1));
        } catch (Exception e) {
            mainHandler.post(new RunnableC0052B8(lua, i, e, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$13$lambda$12$lambda$11(Lua lua, int i, Exception exc) {
        LuaLocks.INSTANCE.withLock(lua, new C0095C8(lua, i, exc, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$13$lambda$12$lambda$11$lambda$10(Lua lua, int i, Exception exc) {
        lua.refGet(i);
        lua.pushNil();
        AbstractC0213Ey.m415m(-534598874298421L, new StringBuilder(), exc, lua);
        lua.pCall(2, 0);
        lua.unref(i);
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$13$lambda$12$lambda$9(Lua lua, int i, String str) {
        LuaLocks.INSTANCE.withLock(lua, new C0181E8(lua, i, str, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$13$lambda$12$lambda$9$lambda$8(Lua lua, int i, String str) {
        lua.refGet(i);
        lua.push(str);
        lua.pushNil();
        lua.pCall(2, 0);
        lua.unref(i);
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$14(Lua lua) throws JSONException {
        String strM625r;
        AbstractC0295Gu.m625r(-535200169719861L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        if (lua.isTable(2)) {
            strM625r = INSTANCE.tableToJson(lua, 2);
        } else if (lua.isString(2)) {
            strM625r = lua.toString(2);
            if (strM625r == null) {
                strM625r = AbstractC0295Gu.m625r(-535208759654453L);
            }
        } else {
            strM625r = AbstractC0295Gu.m625r(-535221644556341L);
        }
        LinkedHashMap linkedHashMap = (lua.getTop() < 3 || !lua.isTable(3)) ? new LinkedHashMap() : new LinkedHashMap(INSTANCE.readTableAsMap(lua, 3));
        linkedHashMap.put(AbstractC0295Gu.m625r(-535234529458229L), AbstractC0295Gu.m625r(-535290364033077L));
        try {
            lua.push(INSTANCE.httpPost(string, strM625r, linkedHashMap));
            return 1;
        } catch (Exception e) {
            lua.pushNil();
            AbstractC0213Ey.m415m(-535363378477109L, new StringBuilder(), e, lua);
            return 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$20(final Lua lua) {
        final String string;
        int iRef;
        AbstractC0295Gu.m625r(-535432097953845L);
        final String string2 = lua.toString(1);
        if (string2 == null || (string = lua.toString(2)) == null) {
            return 0;
        }
        boolean z = lua.getTop() >= 3 && lua.isFunction(3);
        if (z) {
            lua.pushValue(3);
            iRef = lua.ref();
        } else {
            iRef = -1;
        }
        final int i = iRef;
        final boolean z2 = z;
        executor.execute(new Runnable() { // from class: F8
            @Override // java.lang.Runnable
            public final void run() {
                CherryNetworkAPI.register$lambda$20$lambda$19(string2, string, z2, lua, i);
            }
        });
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$20$lambda$19(String str, String str2, boolean z, Lua lua, int i) {
        try {
            INSTANCE.downloadFile(str, str2);
            if (z) {
                mainHandler.post(new RunnableC2222m8(lua, i, 3));
            }
        } catch (Exception e) {
            if (z) {
                mainHandler.post(new RunnableC0052B8(lua, i, e, 1));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$20$lambda$19$lambda$16(Lua lua, int i) {
        LuaLocks.INSTANCE.withLock(lua, new C2087j8(lua, i, 13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$20$lambda$19$lambda$16$lambda$15(Lua lua, int i) {
        lua.refGet(i);
        lua.push(true);
        lua.pushNil();
        lua.pCall(2, 0);
        lua.unref(i);
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$20$lambda$19$lambda$18(Lua lua, int i, Exception exc) {
        LuaLocks.INSTANCE.withLock(lua, new C0095C8(lua, i, exc, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$20$lambda$19$lambda$18$lambda$17(Lua lua, int i, Exception exc) {
        lua.refGet(i);
        lua.push(false);
        AbstractC0213Ey.m415m(-535397738215477L, new StringBuilder(), exc, lua);
        lua.pCall(2, 0);
        lua.unref(i);
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$23(Lua lua) {
        AbstractC0295Gu.m625r(-535440687888437L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        try {
            File file = new File(string);
            if (!file.exists()) {
                lua.pushNil();
                lua.push(AbstractC0295Gu.m625r(-535449277823029L).concat(string));
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
            lua.push(AbstractC0295Gu.m625r(-534972536453173L) + thM726a.getMessage());
            return 2;
        } catch (Exception e) {
            lua.pushNil();
            AbstractC0213Ey.m415m(-535006896191541L, new StringBuilder(), e, lua);
            return 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$25(Lua lua) {
        AbstractC0295Gu.m625r(-535041255929909L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        String string2 = lua.getTop() >= 2 ? lua.toString(2) : null;
        try {
            Context currentContext = CherryGlobalAPI.INSTANCE.getCurrentContext();
            if (currentContext == null) {
                lua.pushNil();
                lua.push(AbstractC0295Gu.m625r(-535049845864501L));
                return 2;
            }
            File file = new File(string);
            if (!file.exists()) {
                lua.pushNil();
                lua.push(AbstractC0295Gu.m625r(-535097090504757L));
                return 2;
            }
            File file2 = new File(currentContext.getCacheDir(), AbstractC0295Gu.m625r(-535161515014197L));
            if (!file2.exists()) {
                file2.mkdirs();
            }
            DexClassLoader dexClassLoader = new DexClassLoader(file.getAbsolutePath(), file2.getAbsolutePath(), null, currentContext.getClassLoader());
            LuaEngine.INSTANCE.addClassLoader(dexClassLoader);
            if (string2 != null) {
                lua.push(dexClassLoader.loadClass(string2), Lua.Conversion.SEMI);
            } else {
                lua.push(dexClassLoader, Lua.Conversion.SEMI);
            }
            return 1;
        } catch (Exception e) {
            lua.pushNil();
            AbstractC0213Ey.m415m(-533546607310901L, new StringBuilder(), e, lua);
            return 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$30(Lua lua) {
        File file;
        AbstractC0295Gu.m625r(-533580967049269L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        Context currentContext = CherryGlobalAPI.INSTANCE.getCurrentContext();
        if (currentContext != null) {
            try {
                file = new File(currentContext.getFilesDir(), AbstractC0295Gu.m625r(-533589556983861L));
            } catch (Exception e) {
                lua.pushNil();
                AbstractC0213Ey.m415m(-533808600315957L, new StringBuilder(), e, lua);
                return 2;
            }
        } else {
            file = null;
        }
        Iterator it = AbstractC2496sa.m4977b0(string.concat(AbstractC0295Gu.m625r(-533641096591413L)), string.concat(AbstractC0295Gu.m625r(-533662571427893L)), string.replace('.', '/') + AbstractC0295Gu.m625r(-533705521100853L)).iterator();
        while (it.hasNext()) {
            File file2 = file != null ? new File(file, (String) it.next()) : null;
            if (file2 != null && file2.exists()) {
                Object objM5465executeIoAF18A = LuaEngine.INSTANCE.m5465executeIoAF18A(AbstractC2675wh.m5244g0(file2));
                if (C0340Hw.m726a(objM5465executeIoAF18A) == null) {
                    if (objM5465executeIoAF18A != null) {
                        lua.push(objM5465executeIoAF18A, Lua.Conversion.SEMI);
                        return 1;
                    }
                    lua.push(true);
                    return 1;
                }
            }
        }
        lua.pushNil();
        lua.push(AbstractC0295Gu.m625r(-533726995937333L) + string);
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$31(Lua lua) {
        AbstractC0295Gu.m625r(-533293204240437L);
        String string = lua.toString(1);
        if (string == null) {
            string = AbstractC0295Gu.m625r(-533301794175029L);
        }
        try {
            if (AbstractC2564tz.m5070e0(string).toString().startsWith(AbstractC0295Gu.m625r(-533314679076917L))) {
                INSTANCE.pushJsonArray(lua, new JSONArray(string));
                return 1;
            }
            INSTANCE.pushJsonObject(lua, new JSONObject(string));
            return 1;
        } catch (Exception unused) {
            lua.pushNil();
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$32(Lua lua) {
        AbstractC0295Gu.m625r(-533323269011509L);
        if (lua.isTable(1)) {
            lua.push(INSTANCE.tableToJson(lua, 1));
            return 1;
        }
        lua.push(AbstractC0295Gu.m625r(-533331858946101L));
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$33(Lua lua) {
        AbstractC0295Gu.m625r(-533344743847989L);
        String string = lua.toString(1);
        if (string == null) {
            string = AbstractC0295Gu.m625r(-533353333782581L);
        }
        lua.push(URLEncoder.encode(string, AbstractC0295Gu.m625r(-533357628749877L)));
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$6(Lua lua) {
        AbstractC0295Gu.m625r(-534538744756277L);
        String string = lua.toString(1);
        if (string == null || !lua.isFunction(2)) {
            return 0;
        }
        Map<String, String> tableAsMap = (lua.getTop() < 3 || !lua.isTable(3)) ? C0495Lf.f1620a : INSTANCE.readTableAsMap(lua, 3);
        lua.pushValue(2);
        executor.execute(new RunnableC0267G8(string, tableAsMap, lua, lua.ref(), 0));
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$6$lambda$5(String str, Map map, Lua lua, int i) {
        try {
            mainHandler.post(new RunnableC0009A8(lua, i, INSTANCE.httpGet(str, map), 0));
        } catch (Exception e) {
            mainHandler.post(new RunnableC0052B8(lua, i, e, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$6$lambda$5$lambda$2(Lua lua, int i, String str) {
        LuaLocks.INSTANCE.withLock(lua, new C0181E8(lua, i, str, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$6$lambda$5$lambda$2$lambda$1(Lua lua, int i, String str) {
        lua.refGet(i);
        lua.push(str);
        lua.pushNil();
        lua.pCall(2, 0);
        lua.unref(i);
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$6$lambda$5$lambda$4(Lua lua, int i, Exception exc) {
        LuaLocks.INSTANCE.withLock(lua, new C0095C8(lua, i, exc, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$6$lambda$5$lambda$4$lambda$3(Lua lua, int i, Exception exc) {
        lua.refGet(i);
        lua.pushNil();
        AbstractC0213Ey.m415m(-534504385017909L, new StringBuilder(), exc, lua);
        lua.pCall(2, 0);
        lua.unref(i);
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$7(Lua lua) {
        String strM625r;
        AbstractC0295Gu.m625r(-534547334690869L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        if (lua.isTable(2)) {
            strM625r = INSTANCE.tableToFormData(lua, 2);
        } else if (lua.isString(2)) {
            strM625r = lua.toString(2);
            if (strM625r == null) {
                strM625r = AbstractC0295Gu.m625r(-534555924625461L);
            }
        } else {
            strM625r = AbstractC0295Gu.m625r(-534560219592757L);
        }
        try {
            lua.push(INSTANCE.httpPost(string, strM625r, (lua.getTop() < 3 || !lua.isTable(3)) ? C0495Lf.f1620a : INSTANCE.readTableAsMap(lua, 3)));
            return 1;
        } catch (Exception e) {
            lua.pushNil();
            AbstractC0213Ey.m415m(-534564514560053L, new StringBuilder(), e, lua);
            return 2;
        }
    }

    private final String tableToFormData(Lua lua, int i) {
        return AbstractC2453ra.m4901k0(readTableAsMap(lua, i).entrySet(), AbstractC0295Gu.m625r(-534899522009141L), null, null, new C0223F7(16), 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence tableToFormData$lambda$41(Map.Entry entry) {
        AbstractC0295Gu.m625r(-533383398553653L);
        return URLEncoder.encode((String) entry.getKey(), AbstractC0295Gu.m625r(-533430643193909L)) + '=' + URLEncoder.encode((String) entry.getValue(), AbstractC0295Gu.m625r(-533456412997685L));
    }

    private final String tableToJson(Lua lua, int i) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        lua.pushValue(i);
        lua.pushNil();
        while (lua.next(-2) != 0) {
            String string = lua.toString(-2);
            Object object = lua.toObject(-1);
            if (string != null) {
                jSONObject.put(string, object);
            }
            lua.pop(1);
        }
        lua.pop(1);
        String string2 = jSONObject.toString();
        AbstractC0295Gu.m625r(-534908111943733L);
        return string2;
    }

    public final void register(Lua lua) {
        AbstractC0295Gu.m625r(-555090163267637L);
        lua.createTable(0, 20);
        lua.push(new C2789z8(1));
        lua.setField(-2, AbstractC0295Gu.m625r(-555107343136821L));
        lua.push(new C2789z8(4));
        lua.setField(-2, AbstractC0295Gu.m625r(-555124523006005L));
        lua.push(new C2789z8(5));
        lua.setField(-2, AbstractC0295Gu.m625r(-555163177711669L));
        lua.push(new C2789z8(6));
        lua.setField(-2, AbstractC0295Gu.m625r(-555184652548149L));
        lua.push(new C2617v8(25));
        lua.setField(-2, AbstractC0295Gu.m625r(-555227602221109L));
        lua.push(new C2617v8(26));
        lua.setField(-2, AbstractC0295Gu.m625r(-554716501112885L));
        lua.push(new C2617v8(27));
        lua.setField(-2, AbstractC0295Gu.m625r(-554755155818549L));
        lua.push(new C2617v8(28));
        lua.setField(-2, AbstractC0295Gu.m625r(-554789515556917L));
        lua.push(new C2617v8(29));
        lua.setField(-2, AbstractC0295Gu.m625r(-554823875295285L));
        lua.push(new C2789z8(0));
        lua.setField(-2, AbstractC0295Gu.m625r(-554858235033653L));
        lua.push(new C2789z8(2));
        lua.setField(-2, AbstractC0295Gu.m625r(-554901184706613L));
        lua.push(new C2789z8(3));
        lua.setField(-2, AbstractC0295Gu.m625r(-554931249477685L));
        AbstractC0295Gu.m625r(-554974199150645L);
        AbstractC0295Gu.m625r(-535805760108597L);
    }
}
