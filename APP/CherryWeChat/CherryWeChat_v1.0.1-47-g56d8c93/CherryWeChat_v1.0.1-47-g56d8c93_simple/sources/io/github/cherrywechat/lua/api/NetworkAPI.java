package io.github.cherrywechat.lua.api;

import android.app.Activity;
import android.content.Context;
import dalvik.system.DexClassLoader;
import io.github.cherrywechat.lua.LuaEngine;
import io.github.cherrywechat.lua.LuaLocks;
import java.io.BufferedReader;
import java.io.File;
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
import p000.AbstractC0585Nj;
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
    public static final NetworkAPI INSTANCE = null;
    private static final String TAG = null;
    private static final ExecutorService executor = null;

    static {
        TAG = AbstractC0295Gu.m625r(-339663193634869L);
        INSTANCE = new NetworkAPI();
        executor = Executors.newCachedThreadPool();
    }

    private NetworkAPI() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m3470a(Lua r0) {
        return register$lambda$3(r0);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m3471b(String r0, Lua r1, int r2) {
        register$lambda$15$lambda$14$lambda$11(r1, r2, r0);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m3472c(Lua r0) {
        return register$lambda$24(r0);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m3473d(Lua r0, int r1, Exception r2) {
        register$lambda$15$lambda$14$lambda$13(r0, r1, r2);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m3474e(String r0, Lua r1, int r2) {
        register$lambda$9$lambda$8(r0, r1, r2);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m3475f(Lua r0) {
        return register$lambda$0(r0);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ int m3476g(Lua r0) {
        return register$lambda$15(r0);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m3477h(String r0, Lua r1, int r2) {
        register$lambda$9$lambda$8$lambda$5(r1, r2, r0);
    }

    private final String httpGet(String r5, Map<String, String> r6) {
        URLConnection r52 = new URL(r5).openConnection();
        AbstractC0295Gu.m625r(-342751275120693L);
        HttpURLConnection r53 = (HttpURLConnection) r52;
        r53.setRequestMethod(AbstractC0295Gu.m625r(-341376885585973L));     // Catch: Throwable -> L7
        r53.setConnectTimeout(DEFAULT_TIMEOUT);     // Catch: Throwable -> L7
        r53.setReadTimeout(DEFAULT_TIMEOUT);     // Catch: Throwable -> L7
        Iterator<Map.Entry<String, String>> r62 = r6.entrySet().iterator();     // Catch: Throwable -> L7
    L5:
        if (r62.hasNext() == false) goto L9;
        Map.Entry<String, String> r0 = r62.next();     // Catch: Throwable -> L7
        r53.setRequestProperty(r0.getKey(), r0.getValue());     // Catch: Throwable -> L7
        goto L5
    L9:
        int r63 = r53.getResponseCode();     // Catch: Throwable -> L7
        if (r63 != 200) goto L22;
        BufferedReader r64 = new BufferedReader(new InputStreamReader(r53.getInputStream()));     // Catch: Throwable -> L7
        String r02 = AbstractC1406fG.m2708h0(r64);     // Catch: Throwable -> L16
        r64.close();     // Catch: Throwable -> L7
        r53.disconnect();
        return r02;
    L16:
        th = move-exception;
        throw th;     // Catch: Throwable -> L18
    L18:
        th = move-exception;
        AbstractC0585Nj.m1138f(r64, th);     // Catch: Throwable -> L7
        throw th;     // Catch: Throwable -> L7
    L22:
        throw new RuntimeException(AbstractC0295Gu.m625r(-341394065455157L) + r63 + AbstractC0295Gu.m625r(-340870079445045L) + r53.getResponseMessage());     // Catch: Throwable -> L7
    L7:
        th = move-exception;
        r53.disconnect();
        throw th;
    }

    private final String httpPost(String r4, String r5, Map<String, String> r6) {
        URLConnection r42 = new URL(r4).openConnection();
        AbstractC0295Gu.m625r(-340882964346933L);
        HttpURLConnection r43 = (HttpURLConnection) r42;
        r43.setRequestMethod(AbstractC0295Gu.m625r(-341707598067765L));     // Catch: Throwable -> L6
        r43.setDoOutput(true);     // Catch: Throwable -> L6
        r43.setConnectTimeout(DEFAULT_TIMEOUT);     // Catch: Throwable -> L6
        r43.setReadTimeout(DEFAULT_TIMEOUT);     // Catch: Throwable -> L6
        if (r6.containsKey(AbstractC0295Gu.m625r(-341729072904245L)) == true) goto L8;
        r43.setRequestProperty(AbstractC0295Gu.m625r(-341784907479093L), AbstractC0295Gu.m625r(-341840742053941L));     // Catch: Throwable -> L6
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
        int r52 = r43.getResponseCode();     // Catch: Throwable -> L6
        if (r52 != 200) goto L27;
        BufferedReader r53 = new BufferedReader(new InputStreamReader(r43.getInputStream()));     // Catch: Throwable -> L6
        String r64 = AbstractC1406fG.m2708h0(r53);     // Catch: Throwable -> L21
        r53.close();     // Catch: Throwable -> L6
        r43.disconnect();
        return r64;
    L21:
        th = move-exception;
        throw th;     // Catch: Throwable -> L23
    L23:
        th = move-exception;
        AbstractC0585Nj.m1138f(r53, th);     // Catch: Throwable -> L6
        throw th;     // Catch: Throwable -> L6
    L27:
        throw new RuntimeException(AbstractC0295Gu.m625r(-341437015128117L) + r52 + AbstractC0295Gu.m625r(-341462784931893L) + r43.getResponseMessage());     // Catch: Throwable -> L6
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
    public static /* synthetic */ C0829TC m3478i(Lua r0, int r1, Exception r2) {
        return register$lambda$9$lambda$8$lambda$7$lambda$6(r0, r1, r2);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ CharSequence m3479j(Map.Entry r0) {
        return register$lambda$2$lambda$1(r0);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ C0829TC m3480k(String r0, Lua r1, int r2) {
        return register$lambda$15$lambda$14$lambda$11$lambda$10(r1, r2, r0);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ int m3481l(Lua r0) {
        return register$lambda$19(r0);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ int m3482m(Lua r0) {
        return register$lambda$9(r0);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ int m3483n(Lua r0) {
        return register$lambda$18(r0);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ int m3484o(Lua r0) {
        return register$lambda$2(r0);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ C0829TC m3485p(Lua r0, int r1, Exception r2) {
        return register$lambda$15$lambda$14$lambda$13$lambda$12(r0, r1, r2);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m3486q(String r0, String r1, int r2, Lua r3) {
        register$lambda$15$lambda$14(r0, r1, r3, r2);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m3487r(Lua r0, int r1, Exception r2) {
        register$lambda$9$lambda$8$lambda$7(r0, r1, r2);
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
        AbstractC0295Gu.m625r(-341475669833781L);
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
        AbstractC0295Gu.m625r(-341484259768373L);
        AbstractC0295Gu.m625r(-341531504408629L);
        r6.pushNil();
        AbstractC0213Ey.m415m(-341621698721845L, new StringBuilder(), e, r6);
        return 2;
    L9:
        if (r6.isTable(2) == false) goto L11;
        r2 = INSTANCE.readTableAsMap(r6, 2);
        goto L17
    }

    private static final int register$lambda$15(Lua r8) {
        AbstractC0295Gu.m625r(-340732640491573L);
        String r2 = r8.toString(1);
        if (r2 == null) goto L10;
        String r1 = r8.toString(2);
        if (r1 != null) goto L8;
        r1 = AbstractC0295Gu.m625r(-340741230426165L);
    L8:
        String r3 = r1;
        if (r8.isFunction(3) == false) goto L10;
        r8.pushValue(3);
        int r5 = r8.ref();
        executor.execute(new RunnableC0267G8(r2, r3, r8, r5, 1));
        return 0;
    L10:
        return 0;
    }

    private static final void register$lambda$15$lambda$14(String r2, String r3, Lua r4, int r5) {
        String r22 = INSTANCE.httpPost(r2, r3, C0495Lf.f1620a);     // Catch: Exception -> L6
        Activity r32 = CherryAPI.INSTANCE.getCurrentActivity();     // Catch: Exception -> L6
        if (r32 == null) goto L13;
        r32.runOnUiThread(new RunnableC0009A8(r4, r5, r22, 4));     // Catch: Exception -> L6
        return;
    L13:
        return;
    L6:
        e = move-exception;
        Activity r33 = CherryAPI.INSTANCE.getCurrentActivity();
        if (r33 == null) goto L14;
        r33.runOnUiThread(new RunnableC0052B8(r4, r5, e, 4));
        return;
    }

    private static final void register$lambda$15$lambda$14$lambda$11(Lua r3, int r4, String r5) {
        LuaLocks.INSTANCE.withLock(r3, new C0181E8(r3, r4, r5, 5));
    }

    private static final C0829TC register$lambda$15$lambda$14$lambda$11$lambda$10(Lua r1, int r2, String r3) {
        r1.refGet(r2);
        r1.push(r3);
        r1.pushNil();
        r1.pCall(2, 0);
        r1.unref(r2);
        return C0829TC.f2620a;
    }

    private static final void register$lambda$15$lambda$14$lambda$13(Lua r3, int r4, Exception r5) {
        LuaLocks.INSTANCE.withLock(r3, new C0095C8(r3, r4, r5, 4));
    }

    private static final C0829TC register$lambda$15$lambda$14$lambda$13$lambda$12(Lua r3, int r4, Exception r5) {
        r3.refGet(r4);
        r3.pushNil();
        AbstractC0213Ey.m415m(-340698280753205L, new StringBuilder(), r5, r3);
        r3.pCall(2, 0);
        r3.unref(r4);
        return C0829TC.f2620a;
    }

    private static final int register$lambda$18(Lua r6) {
        AbstractC0295Gu.m625r(-340745525393461L);
        String r1 = r6.toString(1);
        if (r1 != null) goto L24;
        return 0;
    L24:
        File r3 = new File(r1);     // Catch: Exception -> L11
        if (r3.exists() == true) goto L13;
        r6.pushNil();     // Catch: Exception -> L11
        r6.push(AbstractC0295Gu.m625r(-340754115328053L).concat(r1));     // Catch: Exception -> L11
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
        r6.push(AbstractC0295Gu.m625r(-340827129772085L) + r32.getMessage());     // Catch: Exception -> L11
        return 2;
    L11:
        e = move-exception;
        AbstractC0295Gu.m625r(-340311733696565L);
        AbstractC0295Gu.m625r(-340358978336821L);
        r6.pushNil();
        AbstractC0213Ey.m415m(-340431992780853L, new StringBuilder(), e, r6);
        return 2;
    }

    private static final int register$lambda$19(Lua r10) {
        AbstractC0295Gu.m625r(-340466352519221L);
        String r1 = r10.toString(1);
        if (r1 != null) goto L7;
        return 0;
    L7:
        if (r10.getTop() < 2) goto L9;
        String r2 = r10.toString(2);
    L31:
        Context r5 = CherryAPI.INSTANCE.getCurrentContext();     // Catch: Exception -> L14
        if (r5 != null) goto L16;
        r10.pushNil();     // Catch: Exception -> L14
        r10.push(AbstractC0295Gu.m625r(-340474942453813L));     // Catch: Exception -> L14
        return 2;
    L16:
        File r6 = new File(r1);     // Catch: Exception -> L14
        if (r6.exists() == true) goto L20;
        r10.pushNil();     // Catch: Exception -> L14
        r10.push(AbstractC0295Gu.m625r(-340565136767029L).concat(r1));     // Catch: Exception -> L14
        return 2;
    L20:
        File r12 = new File(r5.getCacheDir(), AbstractC0295Gu.m625r(-338988883769397L));     // Catch: Exception -> L14
        if (r12.exists() == true) goto L23;
        r12.mkdirs();     // Catch: Exception -> L14
    L23:
        DexClassLoader r7 = new DexClassLoader(r6.getAbsolutePath(), r12.getAbsolutePath(), null, r5.getClassLoader());     // Catch: Exception -> L14
        if (r2 == null) goto L26;
        r10.push(r7.loadClass(r2), Lua.Conversion.SEMI);     // Catch: Exception -> L14
    L27:
        LuaEngine.INSTANCE.addClassLoader(r7);     // Catch: Exception -> L14
        AbstractC0295Gu.m625r(-339023243507765L);     // Catch: Exception -> L14
        AbstractC0295Gu.m625r(-339070488148021L);     // Catch: Exception -> L14
        return 1;
    L26:
        r10.push(r7, Lua.Conversion.SEMI);     // Catch: Exception -> L14
    L14:
        e = move-exception;
        AbstractC0295Gu.m625r(-339126322722869L);
        AbstractC0295Gu.m625r(-339173567363125L);
        r10.pushNil();
        AbstractC0213Ey.m415m(-338696825993269L, new StringBuilder(), e, r10);
        return 2;
    L9:
        r2 = null;
        goto L31
    }

    private static final int register$lambda$2(Lua r10) {
        AbstractC0295Gu.m625r(-340105575266357L);
        String r1 = r10.toString(1);
        if (r1 != null) goto L7;
        return 0;
    L7:
        if (r10.isTable(2) == false) goto L10;
        String r3 = AbstractC2453ra.m4901k0(INSTANCE.readTableAsMap(r10, 2).entrySet(), AbstractC0295Gu.m625r(-340114165200949L), null, null, new C0848Tp(15), 30);
    L16:
        if (r10.getTop() >= 3) goto L18;
    L20:
        Map<String, String> r4 = C0495Lf.f1620a;
    L26:
        r10.push(INSTANCE.httpPost(r1, r3, r4));     // Catch: Exception -> L23
        return 1;
    L23:
        e = move-exception;
        AbstractC0295Gu.m625r(-340131345070133L);
        AbstractC0295Gu.m625r(-340178589710389L);
        r10.pushNil();
        AbstractC0213Ey.m415m(-340273078990901L, new StringBuilder(), e, r10);
        return 2;
    L18:
        if (r10.isTable(3) == false) goto L20;
        r4 = INSTANCE.readTableAsMap(r10, 3);
        goto L26
    L10:
        if (r10.isString(2) == false) goto L14;
        r3 = r10.toString(2);
        if (r3 != null) goto L16;
        r3 = AbstractC0295Gu.m625r(-340122755135541L);
        goto L16
    L14:
        r3 = AbstractC0295Gu.m625r(-340127050102837L);
        goto L16
    }

    private static final CharSequence register$lambda$2$lambda$1(Map.Entry r4) {
        AbstractC0295Gu.m625r(-341656058460213L);
        return URLEncoder.encode((String) r4.getKey(), AbstractC0295Gu.m625r(-340054035658805L)) + '=' + URLEncoder.encode((String) r4.getValue(), AbstractC0295Gu.m625r(-340079805462581L));
    }

    private static final int register$lambda$24(Lua r11) {
        AbstractC0295Gu.m625r(-338731185731637L);
        String r1 = r11.toString(1);
        boolean r2 = false;
        if (r1 != null) goto L5;
        return 0;
    L5:
        Context r3 = CherryAPI.INSTANCE.getCurrentContext();
        if (r3 != null) goto L34;
        File r6 = null;
    L11:
        Iterator r32 = AbstractC2496sa.m4977b0(new String[]{r1.concat(AbstractC0295Gu.m625r(-338791315273781L)), r1.concat(AbstractC0295Gu.m625r(-338812790110261L)), r1.replace('.', '/') + AbstractC0295Gu.m625r(-338855739783221L)}).iterator();     // Catch: Exception -> L8
    L13:
        if (r32.hasNext() == false) goto L28;
        String r7 = (String) r32.next();     // Catch: Exception -> L8
        if (r6 == null) goto L17;
        File r8 = new File(r6, r7);     // Catch: Exception -> L8
    L18:
        if (r8 == null) goto L13;
        if (r8.exists() != true) goto L13;
        Object r72 = LuaEngine.INSTANCE.m5465executeIoAF18A(AbstractC2675wh.m5244g0(r8));     // Catch: Exception -> L8
        if (C0340Hw.m726a(r72) != null) goto L27;
        if (r72 == null) goto L25;
        r11.push(r72, Lua.Conversion.SEMI);     // Catch: Exception -> L8
    L26:
        r2 = true;
        goto L27
    L25:
        r11.push(true);     // Catch: Exception -> L8
    L27:
        if (r2 == false) goto L13;
    L17:
        r8 = null;
    L28:
        if (r2 == true) goto L31;
        r11.pushNil();     // Catch: Exception -> L8
        r11.push(AbstractC0295Gu.m625r(-338877214619701L) + r1);     // Catch: Exception -> L8
        return 2;
    L8:
        e = move-exception;
        AbstractC0295Gu.m625r(-339508574812213L);
        AbstractC0295Gu.m625r(-339555819452469L);
        r11.pushNil();
        AbstractC0213Ey.m415m(-339628833896501L, new StringBuilder(), e, r11);
        return 2;
    L31:
        return 1;
    L34:
        r6 = new File(r3.getFilesDir(), AbstractC0295Gu.m625r(-338739775666229L));     // Catch: Exception -> L8
        goto L11
    }

    private static final int register$lambda$3(Lua r8) {
        AbstractC0295Gu.m625r(-339757682915381L);
        String r1 = r8.toString(1);
        if (r1 != null) goto L6;
        return 0;
    L6:
        String r3 = r8.toString(2);
        if (r3 != null) goto L10;
        r3 = AbstractC0295Gu.m625r(-339766272849973L);
    L10:
        if (r8.getTop() >= 3) goto L12;
    L14:
        LinkedHashMap r5 = new LinkedHashMap();
    L15:
        r5.put(AbstractC0295Gu.m625r(-339779157751861L), AbstractC0295Gu.m625r(-339834992326709L));
        r8.push(INSTANCE.httpPost(r1, r3, r5));     // Catch: Exception -> L18
        return 1;
    L18:
        e = move-exception;
        AbstractC0295Gu.m625r(-339908006770741L);
        AbstractC0295Gu.m625r(-339955251410997L);
        r8.pushNil();
        AbstractC0213Ey.m415m(-340620971341877L, new StringBuilder(), e, r8);
        return 2;
    L12:
        if (r8.isTable(3) == false) goto L14;
        r5 = new LinkedHashMap(INSTANCE.readTableAsMap(r8, 3));
        goto L15
    }

    private static final int register$lambda$9(Lua r5) {
        AbstractC0295Gu.m625r(-340689690818613L);
        String r0 = r5.toString(1);
        if (r0 != null) goto L6;
    L7:
        return 0;
    L6:
        if (r5.isFunction(2) == false) goto L7;
        r5.pushValue(2);
        int r2 = r5.ref();
        executor.execute(new RunnableC0009A8(r0, r5, r2));
        return 0;
    }

    private static final void register$lambda$9$lambda$8(String r3, Lua r4, int r5) {
        String r32 = INSTANCE.httpGet(r3, C0495Lf.f1620a);     // Catch: Exception -> L6
        Activity r0 = CherryAPI.INSTANCE.getCurrentActivity();     // Catch: Exception -> L6
        if (r0 == null) goto L13;
        r0.runOnUiThread(new RunnableC0009A8(r4, r5, r32, 2));     // Catch: Exception -> L6
        return;
    L13:
        return;
    L6:
        e = move-exception;
        Activity r02 = CherryAPI.INSTANCE.getCurrentActivity();
        if (r02 == null) goto L14;
        r02.runOnUiThread(new RunnableC0052B8(r4, r5, e, 3));
        return;
    }

    private static final void register$lambda$9$lambda$8$lambda$5(Lua r3, int r4, String r5) {
        LuaLocks.INSTANCE.withLock(r3, new C0181E8(r3, r4, r5, 6));
    }

    private static final C0829TC register$lambda$9$lambda$8$lambda$5$lambda$4(Lua r1, int r2, String r3) {
        r1.refGet(r2);
        r1.push(r3);
        r1.pushNil();
        r1.pCall(2, 0);
        r1.unref(r2);
        return C0829TC.f2620a;
    }

    private static final void register$lambda$9$lambda$8$lambda$7(Lua r3, int r4, Exception r5) {
        LuaLocks.INSTANCE.withLock(r3, new C0095C8(r3, r4, r5, 3));
    }

    private static final C0829TC register$lambda$9$lambda$8$lambda$7$lambda$6(Lua r3, int r4, Exception r5) {
        r3.refGet(r4);
        r3.pushNil();
        AbstractC0213Ey.m415m(-340655331080245L, new StringBuilder(), r5, r3);
        r3.pCall(2, 0);
        r3.unref(r4);
        return C0829TC.f2620a;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ C0829TC m3488s(String r0, Lua r1, int r2) {
        return register$lambda$9$lambda$8$lambda$5$lambda$4(r1, r2, r0);
    }

    public final void register(Lua r5) {
        AbstractC0295Gu.m625r(-342845764401205L);
        r5.createTable(0, 10);
        r5.push(new C0465Ks(6));
        r5.setField(-2, AbstractC0295Gu.m625r(-342862944270389L));
        r5.push(new C1355e9(29));
        r5.setField(-2, AbstractC0295Gu.m625r(-342880124139573L));
        r5.push(new C0465Ks(0));
        r5.setField(-2, AbstractC0295Gu.m625r(-342901598976053L));
        r5.push(new C0465Ks(1));
        r5.setField(-2, AbstractC0295Gu.m625r(-342940253681717L));
        r5.push(new C0465Ks(2));
        r5.setField(-2, AbstractC0295Gu.m625r(-342978908387381L));
        r5.push(new C0465Ks(3));
        r5.setField(-2, AbstractC0295Gu.m625r(-343021858060341L));
        r5.push(new C0465Ks(4));
        r5.setField(-2, AbstractC0295Gu.m625r(-342506461984821L));
        r5.push(new C0465Ks(5));
        r5.setField(-2, AbstractC0295Gu.m625r(-342540821723189L));
        r5.setGlobal(AbstractC0295Gu.m625r(-342575181461557L));
        AbstractC0295Gu.m625r(-342609541199925L);
        AbstractC0295Gu.m625r(-342656785840181L);
    }
}
