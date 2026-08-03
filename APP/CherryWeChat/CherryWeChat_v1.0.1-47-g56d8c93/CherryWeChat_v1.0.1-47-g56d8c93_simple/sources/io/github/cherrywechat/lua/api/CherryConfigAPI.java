package io.github.cherrywechat.lua.api;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;
import p000.AbstractC0295Gu;
import p000.C2402q8;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
public final class CherryConfigAPI {
    public static final CherryConfigAPI INSTANCE = null;
    private static final String PREFS_NAME = null;
    private static final String TAG = null;

    static {
        TAG = AbstractC0295Gu.m625r(-553831737849909L);
        PREFS_NAME = AbstractC0295Gu.m625r(-552251189884981L);
        INSTANCE = new CherryConfigAPI();
    }

    private CherryConfigAPI() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m3042a(Lua r0) {
        return register$lambda$6(r0);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m3043b(Lua r0) {
        return register$lambda$1(r0);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m3044c(Lua r0) {
        return register$lambda$10(r0);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m3045d(Lua r0) {
        return register$lambda$22(r0);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int m3046e(Lua r0) {
        return register$lambda$20(r0);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m3047f(Lua r0) {
        return register$lambda$16(r0);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ int m3048g(Lua r0) {
        return register$lambda$18(r0);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ int m3049h(Lua r0) {
        return register$lambda$4(r0);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ int m3050i(Lua r0) {
        return register$lambda$3(r0);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ int m3051j(Lua r0) {
        return register$lambda$8(r0);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ int m3052k(Lua r0) {
        return register$lambda$5(r0);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ int m3053l(Lua r0) {
        return register$lambda$14(r0);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ int m3054m(Lua r0) {
        return register$lambda$12(r0);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ int m3055n(Lua r0) {
        return register$lambda$2(r0);
    }

    private static final int register$lambda$1(Lua r7) {
        AbstractC0295Gu.m625r(-502051612129333L);
        String r1 = r7.toString(1);
        if (r1 != null) goto L5;
        return 0;
    L5:
        Context r3 = CherryGlobalAPI.INSTANCE.getCurrentContext();
        if (r3 == null) goto L8;
        SharedPreferences r2 = r3.getSharedPreferences(AbstractC0295Gu.m625r(-502060202063925L), 0);
        if (r2.contains(r1) == false) goto L31;
        Object r12 = r2.getAll().get(r1);
        if ((r12 instanceof String) == false) goto L18;
        r7.push((String) r12);
    L34:
        return 1;
    L18:
        if ((r12 instanceof Integer) == false) goto L21;
        r7.push(Double.valueOf(((Number) r12).intValue()));
        goto L34
    L21:
        if ((r12 instanceof Long) == false) goto L24;
        r7.push(Double.valueOf(((Number) r12).longValue()));
        goto L34
    L24:
        if ((r12 instanceof Float) == false) goto L27;
        r7.push(Double.valueOf(((Number) r12).floatValue()));
        goto L34
    L27:
        if ((r12 instanceof Boolean) == false) goto L29;
        r7.push(((Boolean) r12).booleanValue());
        goto L34
    L29:
        r7.pushNil();
        goto L34
    L31:
        if (r7.getTop() <= 1) goto L33;
        r7.pushValue(2);
        goto L34
    L33:
        r7.pushNil();
        goto L34
    L8:
        if (r7.getTop() <= 1) goto L10;
        r7.pushValue(2);
    L11:
        return 1;
    L10:
        r7.pushNil();
        goto L11
    }

    private static final int register$lambda$10(Lua r7) {
        AbstractC0295Gu.m625r(-553230442428469L);
        String r1 = r7.toString(1);
        if (r1 != null) goto L5;
        return 0;
    L5:
        String r3 = r7.toString(2);
        Context r4 = CherryGlobalAPI.INSTANCE.getCurrentContext();
        if (r4 != null) goto L9;
        r7.push(false);
        return 1;
    L9:
        r4.getSharedPreferences(AbstractC0295Gu.m625r(-553239032363061L), 0).edit().putString(r1, r3).apply();
        r7.push(true);
        return 1;
    }

    private static final int register$lambda$12(Lua r7) {
        AbstractC0295Gu.m625r(-553316341774389L);
        String r1 = r7.toString(1);
        if (r1 != null) goto L5;
        return 0;
    L5:
        int r3 = (int) r7.toNumber(2);
        Context r4 = CherryGlobalAPI.INSTANCE.getCurrentContext();
        if (r4 != null) goto L9;
        r7.push(false);
        return 1;
    L9:
        r4.getSharedPreferences(AbstractC0295Gu.m625r(-553324931708981L), 0).edit().putInt(r1, r3).apply();
        r7.push(true);
        return 1;
    }

    private static final int register$lambda$14(Lua r7) {
        AbstractC0295Gu.m625r(-553951996934197L);
        String r1 = r7.toString(1);
        if (r1 != null) goto L5;
        return 0;
    L5:
        boolean r3 = r7.toBoolean(2);
        Context r4 = CherryGlobalAPI.INSTANCE.getCurrentContext();
        if (r4 != null) goto L9;
        r7.push(false);
        return 1;
    L9:
        r4.getSharedPreferences(AbstractC0295Gu.m625r(-553960586868789L), 0).edit().putBoolean(r1, r3).apply();
        r7.push(true);
        return 1;
    }

    private static final int register$lambda$16(Lua r6) {
        AbstractC0295Gu.m625r(-554037896280117L);
        String r1 = r6.toString(1);
        if (r1 != null) goto L5;
        return 0;
    L5:
        Context r3 = CherryGlobalAPI.INSTANCE.getCurrentContext();
        if (r3 != null) goto L9;
        r6.push(false);
        return 1;
    L9:
        r3.getSharedPreferences(AbstractC0295Gu.m625r(-554046486214709L), 0).edit().remove(r1).apply();
        r6.push(true);
        return 1;
    }

    private static final int register$lambda$18(Lua r6) {
        AbstractC0295Gu.m625r(-554123795626037L);
        String r1 = r6.toString(1);
        if (r1 != null) goto L5;
        return 0;
    L5:
        Context r3 = CherryGlobalAPI.INSTANCE.getCurrentContext();
        if (r3 != null) goto L9;
        r6.push(false);
        return 1;
    L9:
        r6.push(r3.getSharedPreferences(AbstractC0295Gu.m625r(-554132385560629L), 0).contains(r1));
        return 1;
    }

    private static final int register$lambda$2(Lua r7) {
        AbstractC0295Gu.m625r(-502137511475253L);
        String r1 = r7.toString(1);
        if (r1 != null) goto L6;
        return 0;
    L6:
        if (r7.getTop() <= 1) goto L8;
        String r3 = r7.toString(2);
    L9:
        Context r4 = CherryGlobalAPI.INSTANCE.getCurrentContext();
        if (r4 == null) goto L15;
        String r12 = r4.getSharedPreferences(AbstractC0295Gu.m625r(-502146101409845L), 0).getString(r1, r3);
        if (r12 == null) goto L14;
        r7.push(r12);
    L18:
        return 1;
    L14:
        r7.pushNil();
        goto L18
    L15:
        if (r3 == null) goto L17;
        r7.push(r3);
        goto L18
    L17:
        r7.pushNil();
        goto L18
    L8:
        r3 = null;
        goto L9
    }

    private static final int register$lambda$20(Lua r5) {
        AbstractC0295Gu.m625r(-553659939158069L);
        Context r0 = CherryGlobalAPI.INSTANCE.getCurrentContext();
        if (r0 != null) goto L6;
        r5.push(false);
        return 1;
    L6:
        r0.getSharedPreferences(AbstractC0295Gu.m625r(-553668529092661L), 0).edit().clear().apply();
        r5.push(true);
        return 1;
    }

    private static final int register$lambda$22(Lua r6) {
        AbstractC0295Gu.m625r(-553745838503989L);
        Context r0 = CherryGlobalAPI.INSTANCE.getCurrentContext();
        if (r0 != null) goto L6;
        r6.createTable(0, 0);
        return 1;
    L6:
        Map<String, ?> r02 = r0.getSharedPreferences(AbstractC0295Gu.m625r(-553754428438581L), 0).getAll();
        r6.createTable(0, r02.size());
        Iterator<Map.Entry<String, ?>> r03 = r02.entrySet().iterator();
    L8:
        if (r03.hasNext() == false) goto L26;
        Map.Entry<String, ?> r2 = r03.next();
        String r3 = r2.getKey();
        Object r22 = r2.getValue();
        if ((r22 instanceof String) == false) goto L13;
        r6.push((String) r22);
    L25:
        r6.setField(-2, r3);
        goto L8
    L13:
        if ((r22 instanceof Integer) == false) goto L16;
        r6.push(Double.valueOf(((Number) r22).intValue()));
        goto L25
    L16:
        if ((r22 instanceof Long) == false) goto L19;
        r6.push(Double.valueOf(((Number) r22).longValue()));
        goto L25
    L19:
        if ((r22 instanceof Float) == false) goto L22;
        r6.push(Double.valueOf(((Number) r22).floatValue()));
        goto L25
    L22:
        if ((r22 instanceof Boolean) == false) goto L24;
        r6.push(((Boolean) r22).booleanValue());
        goto L25
    L24:
        r6.pushNil();
        goto L25
    L26:
        return 1;
    }

    private static final int register$lambda$3(Lua r7) {
        AbstractC0295Gu.m625r(-553350701512757L);
        if (r7.toString(1) != null) goto L5;
        return 0;
    L5:
        int r3 = (int) r7.toNumber(2);
        if (CherryGlobalAPI.INSTANCE.getCurrentContext() == null) goto L8;
        r7.push(Double.valueOf(r4.getSharedPreferences(AbstractC0295Gu.m625r(-553359291447349L), 0).getInt(r1, r3)));
    L9:
        return 1;
    L8:
        r7.push(Double.valueOf(r3));
        goto L9
    }

    private static final int register$lambda$4(Lua r8) {
        AbstractC0295Gu.m625r(-553436600858677L);
        if (r8.toString(1) != null) goto L5;
        return 0;
    L5:
        long r3 = (long) r8.toNumber(2);
        if (CherryGlobalAPI.INSTANCE.getCurrentContext() == null) goto L8;
        r8.push(Double.valueOf(r5.getSharedPreferences(AbstractC0295Gu.m625r(-553445190793269L), 0).getLong(r1, r3)));
    L9:
        return 1;
    L8:
        r8.push(Double.valueOf(r3));
        goto L9
    }

    private static final int register$lambda$5(Lua r7) {
        AbstractC0295Gu.m625r(-553522500204597L);
        if (r7.toString(1) != null) goto L5;
        return 0;
    L5:
        float r3 = (float) r7.toNumber(2);
        if (CherryGlobalAPI.INSTANCE.getCurrentContext() == null) goto L8;
        r7.push(Double.valueOf(r4.getSharedPreferences(AbstractC0295Gu.m625r(-553531090139189L), 0).getFloat(r1, r3)));
    L9:
        return 1;
    L8:
        r7.push(Double.valueOf(r3));
        goto L9
    }

    private static final int register$lambda$6(Lua r7) {
        AbstractC0295Gu.m625r(-553058643736629L);
        String r1 = r7.toString(1);
        if (r1 != null) goto L6;
        return 0;
    L6:
        if (r7.getTop() <= 1) goto L8;
        boolean r3 = r7.toBoolean(2);
    L9:
        Context r4 = CherryGlobalAPI.INSTANCE.getCurrentContext();
        if (r4 == null) goto L12;
        r7.push(r4.getSharedPreferences(AbstractC0295Gu.m625r(-553067233671221L), 0).getBoolean(r1, r3));
    L13:
        return 1;
    L12:
        r7.push(r3);
        goto L13
    L8:
        r3 = false;
        goto L9
    }

    private static final int register$lambda$8(Lua r10) {
        AbstractC0295Gu.m625r(-553144543082549L);
        String r1 = r10.toString(1);
        if (r1 != null) goto L5;
        return 0;
    L5:
        Context r3 = CherryGlobalAPI.INSTANCE.getCurrentContext();
        if (r3 != null) goto L9;
        r10.push(false);
        return 1;
    L9:
        SharedPreferences.Editor r32 = r3.getSharedPreferences(AbstractC0295Gu.m625r(-553153133017141L), 0).edit();
        if (r10.isString(2) == false) goto L13;
        r32.putString(r1, r10.toString(2));
    L24:
        r32.apply();
        r10.push(true);
        return 1;
    L13:
        if (r10.isNumber(2) == false) goto L19;
        double r4 = r10.toNumber(2);
        long r6 = (long) r4;
        if (r4 != r6) goto L17;
        r32.putLong(r1, r6);
        goto L24
    L17:
        r32.putFloat(r1, (float) r4);
        goto L24
    L19:
        if (r10.isBoolean(2) == false) goto L22;
        r32.putBoolean(r1, r10.toBoolean(2));
        goto L24
    L22:
        if (r10.isNil(2) == false) goto L26;
        r32.remove(r1);
        goto L24
    L26:
        r10.push(false);
        return 1;
    }

    public final void register(Lua r5) {
        AbstractC0295Gu.m625r(-501403072067637L);
        r5.createTable(0, 15);
        r5.push(new C2402q8(2));
        r5.setField(-2, AbstractC0295Gu.m625r(-501420251936821L));
        r5.push(new C2402q8(11));
        r5.setField(-2, AbstractC0295Gu.m625r(-501437431806005L));
        r5.push(new C2402q8(12));
        r5.setField(-2, AbstractC0295Gu.m625r(-501480381478965L));
        r5.push(new C2402q8(13));
        r5.setField(-2, AbstractC0295Gu.m625r(-501510446250037L));
        r5.push(new C2402q8(14));
        r5.setField(-2, AbstractC0295Gu.m625r(-501544805988405L));
        r5.push(new C2402q8(15));
        r5.setField(-2, AbstractC0295Gu.m625r(-501583460694069L));
        r5.push(new C2402q8(3));
        r5.setField(-2, AbstractC0295Gu.m625r(-501617820432437L));
        r5.push(new C2402q8(4));
        r5.setField(-2, AbstractC0295Gu.m625r(-501635000301621L));
        r5.push(new C2402q8(5));
        r5.setField(-2, AbstractC0295Gu.m625r(-502227705788469L));
        r5.push(new C2402q8(6));
        r5.setField(-2, AbstractC0295Gu.m625r(-502257770559541L));
        r5.push(new C2402q8(7));
        r5.setField(-2, AbstractC0295Gu.m625r(-502292130297909L));
        r5.push(new C2402q8(8));
        r5.setField(-2, AbstractC0295Gu.m625r(-502322195068981L));
        r5.push(new C2402q8(9));
        r5.setField(-2, AbstractC0295Gu.m625r(-502360849774645L));
        r5.push(new C2402q8(10));
        r5.setField(-2, AbstractC0295Gu.m625r(-502386619578421L));
        AbstractC0295Gu.m625r(-502416684349493L);
        AbstractC0295Gu.m625r(-501935648012341L);
    }
}
