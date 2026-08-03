package io.github.cherrywechat.lua.api;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import dalvik.system.DexClassLoader;
import io.github.cherrywechat.lua.LuaEngine;
import io.github.cherrywechat.lua.LuaLocks;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
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
import org.json.JSONObject;
import p000.AbstractC0213Ey;
import p000.AbstractC0295Gu;
import p000.AbstractC0585Nj;
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
import p000.RunnableC0138D8;
import p000.RunnableC0224F8;
import p000.RunnableC0267G8;
import p000.RunnableC2222m8;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
public final class CherryNetworkAPI {
    private static final int DEFAULT_TIMEOUT = 30000;
    public static final CherryNetworkAPI INSTANCE = null;
    private static final String TAG = null;
    private static final ExecutorService executor = null;
    private static final Handler mainHandler = null;

    static {
        TAG = AbstractC0295Gu.m625r(-533482182801461L);
        INSTANCE = new CherryNetworkAPI();
        executor = Executors.newCachedThreadPool();
        mainHandler = new Handler(Looper.getMainLooper());
    }

    private CherryNetworkAPI() {
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m3145A(String r0, Map r1, Lua r2, int r3) {
        register$lambda$6$lambda$5(r0, r1, r2, r3);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ C0829TC m3146B(Lua r0, int r1, Exception r2) {
        return register$lambda$20$lambda$19$lambda$18$lambda$17(r0, r1, r2);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m3147a(Lua r0) {
        return register$lambda$23(r0);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m3148b(Lua r0) {
        return register$lambda$32(r0);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m3149c(String r0, String r1, Map r2, Lua r3, int r4) {
        register$lambda$13$lambda$12(r0, r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C0829TC m3150d(String r0, Lua r1, int r2) {
        return register$lambda$6$lambda$5$lambda$2$lambda$1(r1, r2, r0);
    }

    private final void downloadFile(String r4, String r5) {
        URLConnection r42 = new URL(r4).openConnection();
        AbstractC0295Gu.m625r(-536273911543861L);
        HttpURLConnection r43 = (HttpURLConnection) r42;
        r43.setConnectTimeout(DEFAULT_TIMEOUT);     // Catch: Throwable -> L10
        InputStream r0 = r43.getInputStream();     // Catch: Throwable -> L10
        FileOutputStream r1 = new FileOutputStream(new File(r5));     // Catch: Throwable -> L12
        AbstractC1293cr.m2555p(r0, r1);     // Catch: Throwable -> L14
        r1.close();     // Catch: Throwable -> L12
        r0.close();     // Catch: Throwable -> L10
        r43.disconnect();
        return;
    L14:
        th = move-exception;
        throw th;     // Catch: Throwable -> L16
    L16:
        th = move-exception;
        AbstractC0585Nj.m1138f(r1, th);     // Catch: Throwable -> L12
        throw th;     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        throw th;     // Catch: Throwable -> L20
    L20:
        th = move-exception;
        AbstractC0585Nj.m1138f(r0, th);     // Catch: Throwable -> L10
        throw th;     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        r43.disconnect();
        throw th;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int m3151e(Lua r0) {
        return register$lambda$20(r0);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m3152f(Lua r0) {
        return register$lambda$6(r0);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ int m3153g(Lua r0) {
        return register$lambda$13(r0);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ C0829TC m3154h(String r0, Lua r1, int r2) {
        return register$lambda$13$lambda$12$lambda$9$lambda$8(r1, r2, r0);
    }

    private final String httpGet(String r4, Map<String, String> r5) {
        URLConnection r42 = new URL(r4).openConnection();
        AbstractC0295Gu.m625r(-535926019192885L);
        HttpURLConnection r43 = (HttpURLConnection) r42;
        r43.setRequestMethod(AbstractC0295Gu.m625r(-535651141285941L));     // Catch: Throwable -> L7
        r43.setConnectTimeout(DEFAULT_TIMEOUT);     // Catch: Throwable -> L7
        r43.setReadTimeout(DEFAULT_TIMEOUT);     // Catch: Throwable -> L7
        Iterator<Map.Entry<String, String>> r52 = r5.entrySet().iterator();     // Catch: Throwable -> L7
    L5:
        if (r52.hasNext() == false) goto L10;
        Map.Entry<String, String> r0 = r52.next();     // Catch: Throwable -> L7
        r43.setRequestProperty(r0.getKey(), r0.getValue());     // Catch: Throwable -> L7
        goto L5
    L10:
        if (r43.getResponseCode() != 200) goto L22;
        BufferedReader r53 = new BufferedReader(new InputStreamReader(r43.getInputStream()));     // Catch: Throwable -> L7
        String r02 = AbstractC1406fG.m2708h0(r53);     // Catch: Throwable -> L16
        r53.close();     // Catch: Throwable -> L7
        r43.disconnect();
        return r02;
    L16:
        th = move-exception;
        throw th;     // Catch: Throwable -> L18
    L18:
        th = move-exception;
        AbstractC0585Nj.m1138f(r53, th);     // Catch: Throwable -> L7
        throw th;     // Catch: Throwable -> L7
    L22:
        throw new RuntimeException(AbstractC0295Gu.m625r(-535668321155125L) + r43.getResponseCode());     // Catch: Throwable -> L7
    L7:
        th = move-exception;
        r43.disconnect();
        throw th;
    }

    private final String httpPost(String r4, String r5, Map<String, String> r6) {
        URLConnection r42 = new URL(r4).openConnection();
        AbstractC0295Gu.m625r(-535694090958901L);
        HttpURLConnection r43 = (HttpURLConnection) r42;
        r43.setRequestMethod(AbstractC0295Gu.m625r(-536518724679733L));     // Catch: Throwable -> L6
        r43.setDoOutput(true);     // Catch: Throwable -> L6
        r43.setConnectTimeout(DEFAULT_TIMEOUT);     // Catch: Throwable -> L6
        r43.setReadTimeout(DEFAULT_TIMEOUT);     // Catch: Throwable -> L6
        if (r6.containsKey(AbstractC0295Gu.m625r(-536540199516213L)) == true) goto L8;
        r43.setRequestProperty(AbstractC0295Gu.m625r(-536046278277173L), AbstractC0295Gu.m625r(-536102112852021L));     // Catch: Throwable -> L6
    L8:
        Iterator<Map.Entry<String, String>> r62 = r6.entrySet().iterator();     // Catch: Throwable -> L6
    L10:
        if (r62.hasNext() == false) goto L12;
        Map.Entry<String, String> r0 = r62.next();     // Catch: Throwable -> L6
        r43.setRequestProperty(r0.getKey(), r0.getValue());     // Catch: Throwable -> L6
        goto L10
    L12:
        OutputStreamWriter r63 = new OutputStreamWriter(r43.getOutputStream());     // Catch: Throwable -> L6
        r63.write(r5);     // Catch: Throwable -> L28
        r63.flush();     // Catch: Throwable -> L28
        r63.close();     // Catch: Throwable -> L6
        if (r43.getResponseCode() != 200) goto L27;
        BufferedReader r52 = new BufferedReader(new InputStreamReader(r43.getInputStream()));     // Catch: Throwable -> L6
        String r64 = AbstractC1406fG.m2708h0(r52);     // Catch: Throwable -> L21
        r52.close();     // Catch: Throwable -> L6
        r43.disconnect();
        return r64;
    L21:
        th = move-exception;
        throw th;     // Catch: Throwable -> L23
    L23:
        th = move-exception;
        AbstractC0585Nj.m1138f(r52, th);     // Catch: Throwable -> L6
        throw th;     // Catch: Throwable -> L6
    L27:
        throw new RuntimeException(AbstractC0295Gu.m625r(-536248141740085L) + r43.getResponseCode());     // Catch: Throwable -> L6
    L28:
        th = move-exception;
        throw th;     // Catch: Throwable -> L30
    L30:
        th = move-exception;
        AbstractC0585Nj.m1138f(r63, th);     // Catch: Throwable -> L6
        throw th;     // Catch: Throwable -> L6
    L6:
        th = move-exception;
        r43.disconnect();
        throw th;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ CharSequence m3155i(Map.Entry r0) {
        return tableToFormData$lambda$41(r0);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m3156j(String r0, String r1, boolean r2, Lua r3, int r4) {
        register$lambda$20$lambda$19(r0, r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m3157k(Lua r0, int r1, Exception r2) {
        register$lambda$6$lambda$5$lambda$4(r0, r1, r2);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ int m3158l(Lua r0) {
        return register$lambda$30(r0);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ C0829TC m3159m(Lua r0, int r1, Exception r2) {
        return register$lambda$13$lambda$12$lambda$11$lambda$10(r0, r1, r2);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ int m3160n(Lua r0) {
        return register$lambda$31(r0);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ int m3161o(Lua r0) {
        return register$lambda$14(r0);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ C0829TC m3162p(Lua r0, int r1) {
        return register$lambda$20$lambda$19$lambda$16$lambda$15(r0, r1);
    }

    private final void pushJsonArray(Lua r5, JSONArray r6) {
        int r1 = 0;
        r5.createTable(r6.length(), 0);
        int r0 = r6.length();
    L3:
        if (r1 >= r0) goto L21;
        Object r2 = r6.get(r1);
        if ((r2 instanceof JSONObject) == false) goto L8;
        pushJsonObject(r5, (JSONObject) r2);
    L20:
        r1 = r1 + 1;
        r5.rawSetI(-2, r1);
        goto L3
    L8:
        if ((r2 instanceof JSONArray) == false) goto L11;
        pushJsonArray(r5, (JSONArray) r2);
        goto L20
    L11:
        if ((r2 instanceof String) == false) goto L14;
        r5.push((String) r2);
        goto L20
    L14:
        if ((r2 instanceof Number) == false) goto L17;
        r5.push(Double.valueOf(((Number) r2).doubleValue()));
        goto L20
    L17:
        if ((r2 instanceof Boolean) == false) goto L19;
        r5.push(((Boolean) r2).booleanValue());
        goto L20
    L19:
        r5.pushNil();
        goto L20
    }

    private final void pushJsonObject(Lua r5, JSONObject r6) {
        r5.createTable(0, r6.length());
        Iterator<String> r0 = r6.keys();
        AbstractC0295Gu.m625r(-534418485671989L);
    L4:
        if (r0.hasNext() == false) goto L22;
        String r1 = r0.next();
        Object r2 = r6.get(r1);
        if ((r2 instanceof JSONObject) == false) goto L9;
        INSTANCE.pushJsonObject(r5, (JSONObject) r2);
    L21:
        r5.setField(-2, r1);
        goto L4
    L9:
        if ((r2 instanceof JSONArray) == false) goto L12;
        INSTANCE.pushJsonArray(r5, (JSONArray) r2);
        goto L21
    L12:
        if ((r2 instanceof String) == false) goto L15;
        r5.push((String) r2);
        goto L21
    L15:
        if ((r2 instanceof Number) == false) goto L18;
        r5.push(Double.valueOf(((Number) r2).doubleValue()));
        goto L21
    L18:
        if ((r2 instanceof Boolean) == false) goto L20;
        r5.push(((Boolean) r2).booleanValue());
        goto L21
    L20:
        r5.pushNil();
        goto L21
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m3163q(String r0, Lua r1, int r2) {
        register$lambda$6$lambda$5$lambda$2(r1, r2, r0);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m3164r(Lua r0, int r1, Exception r2) {
        register$lambda$13$lambda$12$lambda$11(r0, r1, r2);
    }

    private final Map<String, String> readTableAsMap(Lua r4, int r5) {
        LinkedHashMap r0 = new LinkedHashMap();
        r4.pushValue(r5);
        r4.pushNil();
    L4:
        if (r4.next(-2) == 0) goto L10;
        String r52 = r4.toString(-2);
        String r1 = r4.toString(-1);
        if (r52 == null) goto L9;
        if (r1 == null) goto L9;
        r0.put(r52, r1);
    L9:
        r4.pop(1);
        goto L4
    L10:
        r4.pop(1);
        return r0;
    }

    private static final int register$lambda$0(Lua r6) {
        AbstractC0295Gu.m625r(-534461435344949L);
        String r1 = r6.toString(1);
        if (r1 != null) goto L7;
        return 0;
    L7:
        if (r6.getTop() >= 2) goto L9;
    L11:
        Map<String, String> r2 = C0495Lf.f1620a;
    L17:
        r6.push(INSTANCE.httpGet(r1, r2));     // Catch: Exception -> L14
        return 1;
    L14:
        e = move-exception;
        r6.pushNil();
        AbstractC0213Ey.m415m(-534470025279541L, new StringBuilder(), e, r6);
        return 2;
    L9:
        if (r6.isTable(2) == false) goto L11;
        r2 = INSTANCE.readTableAsMap(r6, 2);
        goto L17
    }

    private static final int register$lambda$13(final Lua r8) {
        AbstractC0295Gu.m625r(-534633234036789L);
        final String r2 = r8.toString(1);
        if (r2 != null) goto L6;
    L17:
        return 0;
    L6:
        if (r8.isTable(2) == false) goto L10;
        String r1 = INSTANCE.tableToFormData(r8, 2);
    L8:
        final String r3 = r1;
        if (r8.isFunction(3) == false) goto L17;
        if (r8.getTop() >= 4) goto L21;
    L23:
        final Map<String, String> r4 = C0495Lf.f1620a;
    L24:
        r8.pushValue(3);
        final int r6 = r8.ref();
        executor.execute(new RunnableC0138D8(r2, r3, r4, r8, r6));
        return 0;
    L21:
        if (r8.isTable(4) == false) goto L23;
        r4 = INSTANCE.readTableAsMap(r8, 4);
        goto L24
    L10:
        if (r8.isString(2) == false) goto L14;
        r1 = r8.toString(2);
        if (r1 != null) goto L8;
        r1 = AbstractC0295Gu.m625r(-535191579785269L);
        goto L8
    L14:
        r1 = AbstractC0295Gu.m625r(-535195874752565L);
        goto L8
    }

    private static final void register$lambda$13$lambda$12(String r1, String r2, Map r3, Lua r4, int r5) {
        String r12 = INSTANCE.httpPost(r1, r2, r3);     // Catch: Exception -> L4
        mainHandler.post(new RunnableC0009A8(r4, r5, r12, 1));     // Catch: Exception -> L4
        return;
    L4:
        e = move-exception;
        mainHandler.post(new RunnableC0052B8(r4, r5, e, 2));
    }

    private static final void register$lambda$13$lambda$12$lambda$11(Lua r3, int r4, Exception r5) {
        LuaLocks.INSTANCE.withLock(r3, new C0095C8(r3, r4, r5, 0));
    }

    private static final C0829TC register$lambda$13$lambda$12$lambda$11$lambda$10(Lua r3, int r4, Exception r5) {
        r3.refGet(r4);
        r3.pushNil();
        AbstractC0213Ey.m415m(-534598874298421L, new StringBuilder(), r5, r3);
        r3.pCall(2, 0);
        r3.unref(r4);
        return C0829TC.f2620a;
    }

    private static final void register$lambda$13$lambda$12$lambda$9(Lua r3, int r4, String r5) {
        LuaLocks.INSTANCE.withLock(r3, new C0181E8(r3, r4, r5, 0));
    }

    private static final C0829TC register$lambda$13$lambda$12$lambda$9$lambda$8(Lua r1, int r2, String r3) {
        r1.refGet(r2);
        r1.push(r3);
        r1.pushNil();
        r1.pCall(2, 0);
        r1.unref(r2);
        return C0829TC.f2620a;
    }

    private static final int register$lambda$14(Lua r8) {
        AbstractC0295Gu.m625r(-535200169719861L);
        String r1 = r8.toString(1);
        if (r1 != null) goto L7;
        return 0;
    L7:
        if (r8.isTable(2) == false) goto L10;
        String r3 = INSTANCE.tableToJson(r8, 2);
    L16:
        if (r8.getTop() >= 3) goto L18;
    L20:
        LinkedHashMap r5 = new LinkedHashMap();
    L21:
        r5.put(AbstractC0295Gu.m625r(-535234529458229L), AbstractC0295Gu.m625r(-535290364033077L));
        r8.push(INSTANCE.httpPost(r1, r3, r5));     // Catch: Exception -> L24
        return 1;
    L24:
        e = move-exception;
        r8.pushNil();
        AbstractC0213Ey.m415m(-535363378477109L, new StringBuilder(), e, r8);
        return 2;
    L18:
        if (r8.isTable(3) == false) goto L20;
        r5 = new LinkedHashMap(INSTANCE.readTableAsMap(r8, 3));
        goto L21
    L10:
        if (r8.isString(2) == false) goto L14;
        r3 = r8.toString(2);
        if (r3 != null) goto L16;
        r3 = AbstractC0295Gu.m625r(-535208759654453L);
        goto L16
    L14:
        r3 = AbstractC0295Gu.m625r(-535221644556341L);
        goto L16
    }

    private static final int register$lambda$20(final Lua r9) {
        AbstractC0295Gu.m625r(-535432097953845L);
        boolean r0 = true;
        final String r2 = r9.toString(1);
        if (r2 == null) goto L7;
        final String r3 = r9.toString(2);
        if (r3 == null) goto L7;
        if (r9.getTop() >= 3) goto L11;
    L13:
        r0 = false;
    L14:
        if (r0 == false) goto L17;
        r9.pushValue(3);
        int r1 = r9.ref();
    L16:
        final int r6 = r1;
        final boolean r4 = r0;
        executor.execute(new RunnableC0224F8(r2, r3, r4, r9, r6));
        return 0;
    L17:
        r1 = -1;
        goto L16
    L11:
        if (r9.isFunction(3) == false) goto L13;
    L7:
        return 0;
    }

    private static final void register$lambda$20$lambda$19(String r1, String r2, boolean r3, Lua r4, int r5) {
        INSTANCE.downloadFile(r1, r2);     // Catch: Exception -> L6
        if (r3 == false) goto L12;
        mainHandler.post(new RunnableC2222m8(r4, r5, 3));     // Catch: Exception -> L6
        return;
    L12:
        return;
    L6:
        e = move-exception;
        if (r3 == false) goto L13;
        mainHandler.post(new RunnableC0052B8(r4, r5, e, 1));
        return;
    }

    private static final void register$lambda$20$lambda$19$lambda$16(Lua r3, int r4) {
        LuaLocks.INSTANCE.withLock(r3, new C2087j8(r3, r4, 13));
    }

    private static final C0829TC register$lambda$20$lambda$19$lambda$16$lambda$15(Lua r2, int r3) {
        r2.refGet(r3);
        r2.push(true);
        r2.pushNil();
        r2.pCall(2, 0);
        r2.unref(r3);
        return C0829TC.f2620a;
    }

    private static final void register$lambda$20$lambda$19$lambda$18(Lua r3, int r4, Exception r5) {
        LuaLocks.INSTANCE.withLock(r3, new C0095C8(r3, r4, r5, 1));
    }

    private static final C0829TC register$lambda$20$lambda$19$lambda$18$lambda$17(Lua r4, int r5, Exception r6) {
        r4.refGet(r5);
        r4.push(false);
        AbstractC0213Ey.m415m(-535397738215477L, new StringBuilder(), r6, r4);
        r4.pCall(2, 0);
        r4.unref(r5);
        return C0829TC.f2620a;
    }

    private static final int register$lambda$23(Lua r6) {
        AbstractC0295Gu.m625r(-535440687888437L);
        String r1 = r6.toString(1);
        if (r1 != null) goto L24;
        return 0;
    L24:
        File r3 = new File(r1);     // Catch: Exception -> L11
        if (r3.exists() == true) goto L13;
        r6.pushNil();     // Catch: Exception -> L11
        r6.push(AbstractC0295Gu.m625r(-535449277823029L).concat(r1));     // Catch: Exception -> L11
        return 2;
    L13:
        Object r12 = LuaEngine.INSTANCE.m5465executeIoAF18A(AbstractC2675wh.m5244g0(r3));     // Catch: Exception -> L11
        Throwable r32 = C0340Hw.m726a(r12);     // Catch: Exception -> L11
        if (r32 != null) goto L20;
        if (r12 == null) goto L18;
        r6.push(r12, Lua.Conversion.SEMI);     // Catch: Exception -> L11
        return 1;
    L18:
        r6.push(true);     // Catch: Exception -> L11
        return 1;
    L20:
        r6.pushNil();     // Catch: Exception -> L11
        r6.push(AbstractC0295Gu.m625r(-534972536453173L) + r32.getMessage());     // Catch: Exception -> L11
        return 2;
    L11:
        e = move-exception;
        r6.pushNil();
        AbstractC0213Ey.m415m(-535006896191541L, new StringBuilder(), e, r6);
        return 2;
    }

    private static final int register$lambda$25(Lua r10) {
        AbstractC0295Gu.m625r(-535041255929909L);
        String r1 = r10.toString(1);
        if (r1 != null) goto L7;
        return 0;
    L7:
        if (r10.getTop() < 2) goto L9;
        String r2 = r10.toString(2);
    L30:
        Context r5 = CherryGlobalAPI.INSTANCE.getCurrentContext();     // Catch: Exception -> L14
        if (r5 != null) goto L16;
        r10.pushNil();     // Catch: Exception -> L14
        r10.push(AbstractC0295Gu.m625r(-535049845864501L));     // Catch: Exception -> L14
        return 2;
    L16:
        File r6 = new File(r1);     // Catch: Exception -> L14
        if (r6.exists() == true) goto L20;
        r10.pushNil();     // Catch: Exception -> L14
        r10.push(AbstractC0295Gu.m625r(-535097090504757L));     // Catch: Exception -> L14
        return 2;
    L20:
        File r12 = new File(r5.getCacheDir(), AbstractC0295Gu.m625r(-535161515014197L));     // Catch: Exception -> L14
        if (r12.exists() == true) goto L23;
        r12.mkdirs();     // Catch: Exception -> L14
    L23:
        DexClassLoader r7 = new DexClassLoader(r6.getAbsolutePath(), r12.getAbsolutePath(), null, r5.getClassLoader());     // Catch: Exception -> L14
        LuaEngine.INSTANCE.addClassLoader(r7);     // Catch: Exception -> L14
        if (r2 == null) goto L26;
        r10.push(r7.loadClass(r2), Lua.Conversion.SEMI);     // Catch: Exception -> L14
    L27:
        return 1;
    L26:
        r10.push(r7, Lua.Conversion.SEMI);     // Catch: Exception -> L14
    L14:
        e = move-exception;
        r10.pushNil();
        AbstractC0213Ey.m415m(-533546607310901L, new StringBuilder(), e, r10);
        return 2;
    L9:
        r2 = null;
        goto L30
    }

    private static final int register$lambda$30(Lua r9) {
        AbstractC0295Gu.m625r(-533580967049269L);
        String r1 = r9.toString(1);
        if (r1 != null) goto L6;
        return 0;
    L6:
        Context r2 = CherryGlobalAPI.INSTANCE.getCurrentContext();
        if (r2 != null) goto L34;
        File r4 = null;
    L12:
        Iterator r22 = AbstractC2496sa.m4977b0(new String[]{r1.concat(AbstractC0295Gu.m625r(-533641096591413L)), r1.concat(AbstractC0295Gu.m625r(-533662571427893L)), r1.replace('.', '/') + AbstractC0295Gu.m625r(-533705521100853L)}).iterator();     // Catch: Exception -> L9
    L14:
        if (r22.hasNext() == false) goto L29;
        String r5 = (String) r22.next();     // Catch: Exception -> L9
        if (r4 == null) goto L18;
        File r6 = new File(r4, r5);     // Catch: Exception -> L9
    L19:
        if (r6 == null) goto L14;
        if (r6.exists() != true) goto L14;
        Object r52 = LuaEngine.INSTANCE.m5465executeIoAF18A(AbstractC2675wh.m5244g0(r6));     // Catch: Exception -> L9
        if (C0340Hw.m726a(r52) != null) goto L14;
        if (r52 == null) goto L27;
        r9.push(r52, Lua.Conversion.SEMI);     // Catch: Exception -> L9
        return 1;
    L27:
        r9.push(true);     // Catch: Exception -> L9
        return 1;
    L18:
        r6 = null;
        goto L19
    L29:
        r9.pushNil();     // Catch: Exception -> L9
        r9.push(AbstractC0295Gu.m625r(-533726995937333L) + r1);     // Catch: Exception -> L9
        return 2;
    L34:
        r4 = new File(r2.getFilesDir(), AbstractC0295Gu.m625r(-533589556983861L));     // Catch: Exception -> L9
    L9:
        e = move-exception;
        r9.pushNil();
        AbstractC0213Ey.m415m(-533808600315957L, new StringBuilder(), e, r9);
        return 2;
    }

    private static final int register$lambda$31(Lua r5) {
        AbstractC0295Gu.m625r(-533293204240437L);
        String r1 = r5.toString(1);
        if (r1 != null) goto L13;
        r1 = AbstractC0295Gu.m625r(-533301794175029L);
    L13:
    L11:
        r5.pushNil();
        return 1;
    L6:
        if (AbstractC2564tz.m5070e0(r1).toString().startsWith(AbstractC0295Gu.m625r(-533314679076917L)) == false) goto L9;
        JSONArray r2 = new JSONArray(r1);     // Catch: Exception -> L11
        INSTANCE.pushJsonArray(r5, r2);     // Catch: Exception -> L11
        return 1;
    L9:
        JSONObject r22 = new JSONObject(r1);     // Catch: Exception -> L11
        INSTANCE.pushJsonObject(r5, r22);     // Catch: Exception -> L11
        return 1;
    }

    private static final int register$lambda$32(Lua r3) {
        AbstractC0295Gu.m625r(-533323269011509L);
        if (r3.isTable(1) == true) goto L6;
        r3.push(AbstractC0295Gu.m625r(-533331858946101L));
        return 1;
    L6:
        r3.push(INSTANCE.tableToJson(r3, 1));
        return 1;
    }

    private static final int register$lambda$33(Lua r4) {
        AbstractC0295Gu.m625r(-533344743847989L);
        String r1 = r4.toString(1);
        if (r1 != null) goto L5;
        r1 = AbstractC0295Gu.m625r(-533353333782581L);
    L5:
        r4.push(URLEncoder.encode(r1, AbstractC0295Gu.m625r(-533357628749877L)));
        return 1;
    }

    private static final int register$lambda$6(Lua r8) {
        AbstractC0295Gu.m625r(-534538744756277L);
        String r2 = r8.toString(1);
        if (r2 != null) goto L6;
    L7:
        return 0;
    L6:
        if (r8.isFunction(2) == false) goto L7;
        if (r8.getTop() >= 3) goto L11;
    L13:
        Map<String, String> r3 = C0495Lf.f1620a;
    L14:
        r8.pushValue(2);
        int r5 = r8.ref();
        executor.execute(new RunnableC0267G8(r2, r3, r8, r5, 0));
        return 0;
    L11:
        if (r8.isTable(3) == false) goto L13;
        r3 = INSTANCE.readTableAsMap(r8, 3);
        goto L14
    }

    private static final void register$lambda$6$lambda$5(String r2, Map r3, Lua r4, int r5) {
        String r22 = INSTANCE.httpGet(r2, r3);     // Catch: Exception -> L4
        mainHandler.post(new RunnableC0009A8(r4, r5, r22, 0));     // Catch: Exception -> L4
        return;
    L4:
        e = move-exception;
        mainHandler.post(new RunnableC0052B8(r4, r5, e, 0));
    }

    private static final void register$lambda$6$lambda$5$lambda$2(Lua r3, int r4, String r5) {
        LuaLocks.INSTANCE.withLock(r3, new C0181E8(r3, r4, r5, 1));
    }

    private static final C0829TC register$lambda$6$lambda$5$lambda$2$lambda$1(Lua r1, int r2, String r3) {
        r1.refGet(r2);
        r1.push(r3);
        r1.pushNil();
        r1.pCall(2, 0);
        r1.unref(r2);
        return C0829TC.f2620a;
    }

    private static final void register$lambda$6$lambda$5$lambda$4(Lua r3, int r4, Exception r5) {
        LuaLocks.INSTANCE.withLock(r3, new C0095C8(r3, r4, r5, 2));
    }

    private static final C0829TC register$lambda$6$lambda$5$lambda$4$lambda$3(Lua r3, int r4, Exception r5) {
        r3.refGet(r4);
        r3.pushNil();
        AbstractC0213Ey.m415m(-534504385017909L, new StringBuilder(), r5, r3);
        r3.pCall(2, 0);
        r3.unref(r4);
        return C0829TC.f2620a;
    }

    private static final int register$lambda$7(Lua r6) {
        AbstractC0295Gu.m625r(-534547334690869L);
        String r1 = r6.toString(1);
        if (r1 != null) goto L7;
        return 0;
    L7:
        if (r6.isTable(2) == false) goto L10;
        String r3 = INSTANCE.tableToFormData(r6, 2);
    L16:
        if (r6.getTop() >= 3) goto L18;
    L20:
        Map<String, String> r4 = C0495Lf.f1620a;
    L26:
        r6.push(INSTANCE.httpPost(r1, r3, r4));     // Catch: Exception -> L23
        return 1;
    L23:
        e = move-exception;
        r6.pushNil();
        AbstractC0213Ey.m415m(-534564514560053L, new StringBuilder(), e, r6);
        return 2;
    L18:
        if (r6.isTable(3) == false) goto L20;
        r4 = INSTANCE.readTableAsMap(r6, 3);
        goto L26
    L10:
        if (r6.isString(2) == false) goto L14;
        r3 = r6.toString(2);
        if (r3 != null) goto L16;
        r3 = AbstractC0295Gu.m625r(-534555924625461L);
        goto L16
    L14:
        r3 = AbstractC0295Gu.m625r(-534560219592757L);
        goto L16
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ int m3165s(Lua r0) {
        return register$lambda$0(r0);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ int m3166t(Lua r0) {
        return register$lambda$25(r0);
    }

    private final String tableToFormData(Lua r7, int r8) {
        return AbstractC2453ra.m4901k0(readTableAsMap(r7, r8).entrySet(), AbstractC0295Gu.m625r(-534899522009141L), null, null, new C0223F7(16), 30);
    }

    private static final CharSequence tableToFormData$lambda$41(Map.Entry r4) {
        AbstractC0295Gu.m625r(-533383398553653L);
        return URLEncoder.encode((String) r4.getKey(), AbstractC0295Gu.m625r(-533430643193909L)) + '=' + URLEncoder.encode((String) r4.getValue(), AbstractC0295Gu.m625r(-533456412997685L));
    }

    private final String tableToJson(Lua r4, int r5) {
        JSONObject r0 = new JSONObject();
        r4.pushValue(r5);
        r4.pushNil();
    L4:
        if (r4.next(-2) == 0) goto L9;
        String r52 = r4.toString(-2);
        Object r1 = r4.toObject(-1);
        if (r52 == null) goto L8;
        r0.put(r52, r1);
    L8:
        r4.pop(1);
        goto L4
    L9:
        r4.pop(1);
        String r42 = r0.toString();
        AbstractC0295Gu.m625r(-534908111943733L);
        return r42;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m3167u(Lua r0, int r1, Exception r2) {
        register$lambda$20$lambda$19$lambda$18(r0, r1, r2);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ int m3168v(Lua r0) {
        return register$lambda$33(r0);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m3169w(String r0, Lua r1, int r2) {
        register$lambda$13$lambda$12$lambda$9(r1, r2, r0);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ C0829TC m3170x(Lua r0, int r1, Exception r2) {
        return register$lambda$6$lambda$5$lambda$4$lambda$3(r0, r1, r2);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m3171y(Lua r0, int r1) {
        register$lambda$20$lambda$19$lambda$16(r0, r1);
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ int m3172z(Lua r0) {
        return register$lambda$7(r0);
    }

    public final void register(Lua r5) {
        AbstractC0295Gu.m625r(-555090163267637L);
        r5.createTable(0, 20);
        r5.push(new C2789z8(1));
        r5.setField(-2, AbstractC0295Gu.m625r(-555107343136821L));
        r5.push(new C2789z8(4));
        r5.setField(-2, AbstractC0295Gu.m625r(-555124523006005L));
        r5.push(new C2789z8(5));
        r5.setField(-2, AbstractC0295Gu.m625r(-555163177711669L));
        r5.push(new C2789z8(6));
        r5.setField(-2, AbstractC0295Gu.m625r(-555184652548149L));
        r5.push(new C2617v8(25));
        r5.setField(-2, AbstractC0295Gu.m625r(-555227602221109L));
        r5.push(new C2617v8(26));
        r5.setField(-2, AbstractC0295Gu.m625r(-554716501112885L));
        r5.push(new C2617v8(27));
        r5.setField(-2, AbstractC0295Gu.m625r(-554755155818549L));
        r5.push(new C2617v8(28));
        r5.setField(-2, AbstractC0295Gu.m625r(-554789515556917L));
        r5.push(new C2617v8(29));
        r5.setField(-2, AbstractC0295Gu.m625r(-554823875295285L));
        r5.push(new C2789z8(0));
        r5.setField(-2, AbstractC0295Gu.m625r(-554858235033653L));
        r5.push(new C2789z8(2));
        r5.setField(-2, AbstractC0295Gu.m625r(-554901184706613L));
        r5.push(new C2789z8(3));
        r5.setField(-2, AbstractC0295Gu.m625r(-554931249477685L));
        AbstractC0295Gu.m625r(-554974199150645L);
        AbstractC0295Gu.m625r(-535805760108597L);
    }
}
