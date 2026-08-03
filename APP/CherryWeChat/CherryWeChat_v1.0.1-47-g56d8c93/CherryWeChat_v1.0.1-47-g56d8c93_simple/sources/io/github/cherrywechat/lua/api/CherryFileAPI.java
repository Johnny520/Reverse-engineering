package io.github.cherrywechat.lua.api;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p000.AbstractC0295Gu;
import p000.AbstractC0585Nj;
import p000.AbstractC2496sa;
import p000.AbstractC2564tz;
import p000.AbstractC2659w7;
import p000.AbstractC2675wh;
import p000.C2402q8;
import p000.C2574u8;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
public final class CherryFileAPI {
    public static final CherryFileAPI INSTANCE = null;
    private static final String TAG = null;

    static {
        TAG = AbstractC0295Gu.m625r(-550382879111221L);
        INSTANCE = new CherryFileAPI();
    }

    private CherryFileAPI() {
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ int m3062A(Lua r0) {
        return register$lambda$23(r0);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ int m3063B(Lua r0) {
        return register$lambda$4(r0);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m3064a(Lua r0) {
        return register$lambda$15(r0);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m3065b(Lua r0) {
        return register$lambda$12(r0);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m3066c(Lua r0) {
        return register$lambda$25(r0);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m3067d(Lua r0) {
        return register$lambda$34(r0);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int m3068e(Lua r0) {
        return register$lambda$29(r0);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m3069f(Lua r0) {
        return register$lambda$3(r0);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ int m3070g(Lua r0) {
        return register$lambda$35(r0);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ int m3071h(Lua r0) {
        return register$lambda$0(r0);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ int m3072i(Lua r0) {
        return register$lambda$19(r0);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ int m3073j(Lua r0) {
        return register$lambda$13(r0);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ int m3074k(Lua r0) {
        return register$lambda$5(r0);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ int m3075l(Lua r0) {
        return register$lambda$17(r0);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ int m3076m(Lua r0) {
        return register$lambda$6(r0);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ int m3077n(Lua r0) {
        return register$lambda$8(r0);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ int m3078o(Lua r0) {
        return register$lambda$18(r0);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ int m3079p(Lua r0) {
        return register$lambda$7(r0);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ int m3080q(Lua r0) {
        return register$lambda$33(r0);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ int m3081r(Lua r0) {
        return register$lambda$14(r0);
    }

    private static final int register$lambda$0(Lua r3) {
        AbstractC0295Gu.m625r(-550176720681013L);
        String r1 = r3.toString(1);
        if (r1 != null) goto L10;
        return 0;
    L10:
        r3.push(AbstractC2675wh.m5244g0(new File(r1)));     // Catch: Exception -> L8
        return 1;
    L8:
        r3.pushNil();
        return 1;
    }

    private static final int register$lambda$1(Lua r3) {
        AbstractC0295Gu.m625r(-550185310615605L);
        String r1 = r3.toString(1);
        if (r1 != null) goto L10;
        return 0;
    L10:
        r3.push(AbstractC2675wh.m5242e0(new File(r1)), Lua.Conversion.SEMI);     // Catch: Exception -> L8
    L9:
        return 1;
    L8:
        r3.pushNil();
        goto L9
    }

    private static final int register$lambda$10(Lua r3) {
        AbstractC0295Gu.m625r(-550262620026933L);
        if (r3.toString(1) != null) goto L6;
        return 0;
    L6:
        r3.push(Double.valueOf(new File(r1).length()));
        return 1;
    }

    private static final int register$lambda$11(Lua r3) {
        AbstractC0295Gu.m625r(-550271209961525L);
        if (r3.toString(1) != null) goto L6;
        return 0;
    L6:
        r3.push(Double.valueOf(new File(r1).lastModified()));
        return 1;
    }

    private static final int register$lambda$12(Lua r3) {
        AbstractC0295Gu.m625r(-550279799896117L);
        String r1 = r3.toString(1);
        if (r1 != null) goto L6;
        return 0;
    L6:
        r3.push(new File(r1).getName());
        return 1;
    }

    private static final int register$lambda$13(Lua r3) {
        AbstractC0295Gu.m625r(-550288389830709L);
        String r1 = r3.toString(1);
        if (r1 != null) goto L6;
        return 0;
    L6:
        String r12 = new File(r1).getParent();
        if (r12 == null) goto L9;
        r3.push(r12);
    L10:
        return 1;
    L9:
        r3.pushNil();
        goto L10
    }

    private static final int register$lambda$14(Lua r4) {
        AbstractC0295Gu.m625r(-550296979765301L);
        String r1 = r4.toString(1);
        if (r1 != null) goto L6;
        return 0;
    L6:
        String r12 = new File(r1).getName();
        int r2 = AbstractC2564tz.m5061V(r12, '.');
        if (r2 != (-1)) goto L9;
        String r13 = "";
    L10:
        r4.push(r13);
        return 1;
    L9:
        r13 = r12.substring(r2 + 1, r12.length());
        goto L10
    }

    private static final int register$lambda$15(Lua r3) {
        AbstractC0295Gu.m625r(-550305569699893L);
        String r1 = r3.toString(1);
        if (r1 != null) goto L6;
        return 0;
    L6:
        r3.push(new File(r1).getAbsolutePath());
        return 1;
    }

    private static final int register$lambda$16(Lua r3) {
        AbstractC0295Gu.m625r(-549764403820597L);
        String r1 = r3.toString(1);
        if (r1 != null) goto L6;
        return 0;
    L6:
        r3.push(new File(r1).delete());
        return 1;
    }

    private static final int register$lambda$17(Lua r3) {
        AbstractC0295Gu.m625r(-549772993755189L);
        String r1 = r3.toString(1);
        if (r1 != null) goto L6;
        return 0;
    L6:
        r3.push(AbstractC2675wh.m5239b0(new File(r1)));
        return 1;
    }

    private static final int register$lambda$18(Lua r3) {
        AbstractC0295Gu.m625r(-549781583689781L);
        String r1 = r3.toString(1);
        if (r1 != null) goto L6;
        return 0;
    L6:
        r3.push(new File(r1).mkdirs());
        return 1;
    }

    private static final int register$lambda$19(Lua r4) {
        AbstractC0295Gu.m625r(-549790173624373L);
        String r1 = r4.toString(1);
        if (r1 != null) goto L5;
        return 0;
    L5:
        String r3 = r4.toString(2);
        if (r3 != null) goto L8;
        return 0;
    L8:
        r4.push(new File(r1).renameTo(new File(r3)));
        return 1;
    }

    private static final int register$lambda$20(Lua r5) {
        AbstractC0295Gu.m625r(-549798763558965L);
        String r1 = r5.toString(1);
        if (r1 == null) goto L7;
        String r3 = r5.toString(2);
        if (r3 == null) goto L7;
        AbstractC2675wh.m5238a0(new File(r1), new File(r3));     // Catch: Exception -> L10
        r5.push(true);     // Catch: Exception -> L10
        return 1;
    L10:
        r5.push(false);
        return 1;
    L7:
        return 0;
    }

    private static final int register$lambda$21(Lua r6) {
        AbstractC0295Gu.m625r(-549807353493557L);
        String r1 = r6.toString(1);
        if (r1 == null) goto L7;
        String r3 = r6.toString(2);
        if (r3 == null) goto L7;
        AbstractC2675wh.m5238a0(new File(r1), new File(r3));     // Catch: Exception -> L10
        new File(r1).delete();     // Catch: Exception -> L10
        r6.push(true);     // Catch: Exception -> L10
        return 1;
    L10:
        r6.push(false);
        return 1;
    L7:
        return 0;
    }

    private static final int register$lambda$23(Lua r6) {
        AbstractC0295Gu.m625r(-549815943428149L);
        String r1 = r6.toString(1);
        int r2 = 0;
        if (r1 != null) goto L5;
        return 0;
    L5:
        File[] r12 = new File(r1).listFiles();
        if (r12 == null) goto L10;
        r6.createTable(r12.length, 0);
        int r3 = r12.length;
        int r4 = 0;
    L8:
        if (r2 >= r3) goto L11;
        r4 = r4 + 1;
        r6.push(r12[r2].getName());
        r6.rawSetI(-2, r4);
        r2 = r2 + 1;
    L11:
        return 1;
    L10:
        r6.createTable(0, 0);
        goto L11
    }

    private static final int register$lambda$25(Lua r11) {
        AbstractC0295Gu.m625r(-549824533362741L);
        String r1 = r11.toString(1);
        if (r1 != null) goto L5;
        return 0;
    L5:
        File[] r12 = new File(r1).listFiles();
        if (r12 == null) goto L10;
        r11.createTable(r12.length, 0);
        int r3 = r12.length;
        int r4 = 0;
        int r5 = 0;
    L8:
        if (r4 >= r3) goto L11;
        File r6 = r12[r4];
        r5 = r5 + 1;
        r11.createTable(0, 5);
        r11.push(r6.getName());
        r11.setField(-2, AbstractC0295Gu.m625r(-549833123297333L));
        r11.push(r6.getAbsolutePath());
        r11.setField(-2, AbstractC0295Gu.m625r(-549854598133813L));
        r11.push(r6.isDirectory());
        r11.setField(-2, AbstractC0295Gu.m625r(-549876072970293L));
        r11.push(Double.valueOf(r6.length()));
        r11.setField(-2, AbstractC0295Gu.m625r(-549901842774069L));
        r11.push(Double.valueOf(r6.lastModified()));
        r11.setField(-2, AbstractC0295Gu.m625r(-549923317610549L));
        r11.rawSetI(-2, r5);
        r4 = r4 + 1;
    L11:
        return 1;
    L10:
        r11.createTable(0, 0);
        goto L11
    }

    private static final int register$lambda$29(Lua r9) {
        AbstractC0295Gu.m625r(-550601922443317L);
        String r1 = r9.toString(1);
        int r2 = 0;
        if (r1 != null) goto L33;
        return 0;
    L33:
        MessageDigest r3 = MessageDigest.getInstance(AbstractC0295Gu.m625r(-550610512377909L));     // Catch: Exception -> L27
        FileInputStream r4 = new FileInputStream(new File(r1));     // Catch: Exception -> L27
        byte[] r12 = new byte[8192];     // Catch: Throwable -> L13
    L9:
        int r5 = r4.read(r12);     // Catch: Throwable -> L13
        if (r5 == (-1)) goto L15;
        r3.update(r12, 0, r5);     // Catch: Throwable -> L13
        goto L9
    L15:
        r4.close();     // Catch: Exception -> L27
        byte[] r13 = r3.digest();     // Catch: Exception -> L27
        AbstractC0295Gu.m625r(-550627692247093L);     // Catch: Exception -> L27
        String r32 = AbstractC0295Gu.m625r(-550679231854645L);     // Catch: Exception -> L27
        StringBuilder r52 = new StringBuilder();     // Catch: Exception -> L27
        r52.append("");     // Catch: Exception -> L27
        int r6 = r13.length;     // Catch: Exception -> L27
        int r7 = 0;
    L16:
        if (r2 >= r6) goto L21;
        byte r8 = r13[r2];     // Catch: Exception -> L27
        r7 = r7 + 1;     // Catch: Exception -> L27
        if (r7 <= 1) goto L20;
        r52.append(r32);     // Catch: Exception -> L27
    L20:
        r52.append(register$lambda$29$lambda$28(r8));     // Catch: Exception -> L27
        r2 = r2 + 1;     // Catch: Exception -> L27
        goto L16
    L21:
        r52.append("");     // Catch: Exception -> L27
        r9.push(r52.toString());     // Catch: Exception -> L27
        return 1;
    L13:
        th = move-exception;
        throw th;     // Catch: Throwable -> L24
    L24:
        th = move-exception;
        AbstractC0585Nj.m1138f(r4, th);     // Catch: Exception -> L27
        throw th;     // Catch: Exception -> L27
    L27:
        r9.pushNil();
        return 1;
    }

    private static final CharSequence register$lambda$29$lambda$28(byte r2) {
        String r22 = String.format(AbstractC0295Gu.m625r(-549979152185397L), Arrays.copyOf(new Object[]{Byte.valueOf(r2)}, 1));
        AbstractC0295Gu.m625r(-550000627021877L);
        return r22;
    }

    private static final int register$lambda$3(Lua r6) {
        AbstractC0295Gu.m625r(-550193900550197L);
        String r1 = r6.toString(1);
        if (r1 != null) goto L16;
        return 0;
    L16:
        ArrayList r12 = AbstractC2675wh.m5243f0(new File(r1));     // Catch: Exception -> L14
        r6.createTable(r12.size(), 0);     // Catch: Exception -> L14
        Iterator r13 = r12.iterator();     // Catch: Exception -> L14
        int r3 = 0;
    L7:
        if (r13.hasNext() == false) goto L13;
        Object r4 = r13.next();     // Catch: Exception -> L14
        int r5 = r3 + 1;     // Catch: Exception -> L14
        if (r3 < 0) goto L11;
        r6.push((String) r4);     // Catch: Exception -> L14
        r6.rawSetI(-2, r5);     // Catch: Exception -> L14
        r3 = r5;
        goto L7
    L11:
        AbstractC2496sa.m4978c0();     // Catch: Exception -> L14
        throw null;     // Catch: Exception -> L14
    L13:
        return 1;
    L14:
        r6.createTable(0, 0);
        return 1;
    }

    private static final int register$lambda$33(Lua r9) {
        AbstractC0295Gu.m625r(-550756541265973L);
        String r1 = r9.toString(1);
        int r2 = 0;
        if (r1 != null) goto L33;
        return 0;
    L33:
        MessageDigest r3 = MessageDigest.getInstance(AbstractC0295Gu.m625r(-550765131200565L));     // Catch: Exception -> L27
        FileInputStream r4 = new FileInputStream(new File(r1));     // Catch: Exception -> L27
        byte[] r12 = new byte[8192];     // Catch: Throwable -> L13
    L9:
        int r5 = r4.read(r12);     // Catch: Throwable -> L13
        if (r5 == (-1)) goto L15;
        r3.update(r12, 0, r5);     // Catch: Throwable -> L13
        goto L9
    L15:
        r4.close();     // Catch: Exception -> L27
        byte[] r13 = r3.digest();     // Catch: Exception -> L27
        AbstractC0295Gu.m625r(-550799490938933L);     // Catch: Exception -> L27
        String r32 = AbstractC0295Gu.m625r(-550851030546485L);     // Catch: Exception -> L27
        StringBuilder r52 = new StringBuilder();     // Catch: Exception -> L27
        r52.append("");     // Catch: Exception -> L27
        int r6 = r13.length;     // Catch: Exception -> L27
        int r7 = 0;
    L16:
        if (r2 >= r6) goto L21;
        byte r8 = r13[r2];     // Catch: Exception -> L27
        r7 = r7 + 1;     // Catch: Exception -> L27
        if (r7 <= 1) goto L20;
        r52.append(r32);     // Catch: Exception -> L27
    L20:
        r52.append(register$lambda$33$lambda$32(r8));     // Catch: Exception -> L27
        r2 = r2 + 1;     // Catch: Exception -> L27
        goto L16
    L21:
        r52.append("");     // Catch: Exception -> L27
        r9.push(r52.toString());     // Catch: Exception -> L27
        return 1;
    L13:
        th = move-exception;
        throw th;     // Catch: Throwable -> L24
    L24:
        th = move-exception;
        AbstractC0585Nj.m1138f(r4, th);     // Catch: Exception -> L27
        throw th;     // Catch: Exception -> L27
    L27:
        r9.pushNil();
        return 1;
    }

    private static final CharSequence register$lambda$33$lambda$32(byte r2) {
        String r22 = String.format(AbstractC0295Gu.m625r(-550683526821941L), Arrays.copyOf(new Object[]{Byte.valueOf(r2)}, 1));
        AbstractC0295Gu.m625r(-550705001658421L);
        return r22;
    }

    private static final int register$lambda$34(Lua r4) {
        AbstractC0295Gu.m625r(-550855325513781L);
        Context r0 = CherryGlobalAPI.INSTANCE.getCurrentContext();
        if (r0 == null) goto L8;
        File r1 = new File(r0.getFilesDir(), AbstractC0295Gu.m625r(-550314159634485L));
        if (r1.exists() == true) goto L7;
        r1.mkdirs();
    L7:
        r4.push(r1.getAbsolutePath());
        return 1;
    L8:
        r4.pushNil();
        return 1;
    }

    private static final int register$lambda$35(Lua r2) {
        AbstractC0295Gu.m625r(-550365699242037L);
        Context r0 = CherryGlobalAPI.INSTANCE.getCurrentContext();
        if (r0 == null) goto L5;
        r2.push(r0.getCacheDir().getAbsolutePath());
        return 1;
    L5:
        r2.pushNil();
        return 1;
    }

    private static final int register$lambda$36(Lua r2) {
        AbstractC0295Gu.m625r(-550374289176629L);
        Context r0 = CherryGlobalAPI.INSTANCE.getCurrentContext();
        if (r0 == null) goto L5;
        r2.push(r0.getFilesDir().getAbsolutePath());
        return 1;
    L5:
        r2.pushNil();
        return 1;
    }

    private static final int register$lambda$4(Lua r5) {
        AbstractC0295Gu.m625r(-550202490484789L);
        String r1 = r5.toString(1);
        if (r1 != null) goto L5;
        return 0;
    L5:
        String r3 = r5.toString(2);
        if (r3 != null) goto L12;
        r3 = AbstractC0295Gu.m625r(-550211080419381L);
    L12:
        AbstractC2675wh.m5246i0(new File(r1), r3);     // Catch: Exception -> L10
        r5.push(true);     // Catch: Exception -> L10
        return 1;
    L10:
        r5.push(false);
        return 1;
    }

    private static final int register$lambda$5(Lua r5) {
        AbstractC0295Gu.m625r(-550215375386677L);
        String r1 = r5.toString(1);
        if (r1 != null) goto L5;
        return 0;
    L5:
        Object r3 = r5.toObject(2);
        if ((r3 instanceof byte[]) == false) goto L8;
        byte[] r32 = (byte[]) r3;
    L9:
        if (r32 != null) goto L22;
        return 0;
    L22:
        FileOutputStream r12 = new FileOutputStream(new File(r1));     // Catch: Exception -> L20
        r12.write(r32);     // Catch: Throwable -> L15
        r12.close();     // Catch: Exception -> L20
        r5.push(true);     // Catch: Exception -> L20
    L21:
        return 1;
    L15:
        th = move-exception;
        throw th;     // Catch: Throwable -> L17
    L17:
        th = move-exception;
        AbstractC0585Nj.m1138f(r12, th);     // Catch: Exception -> L20
        throw th;     // Catch: Exception -> L20
    L20:
        r5.push(false);
        goto L21
    L8:
        r32 = null;
        goto L9
    }

    private static final int register$lambda$6(Lua r6) {
        AbstractC0295Gu.m625r(-550223965321269L);
        String r1 = r6.toString(1);
        if (r1 != null) goto L5;
        return 0;
    L5:
        String r3 = r6.toString(2);
        if (r3 != null) goto L19;
        r3 = AbstractC0295Gu.m625r(-550232555255861L);
    L19:
        File r4 = new File(r1);     // Catch: Exception -> L17
        Charset r12 = AbstractC2659w7.f9201a;     // Catch: Exception -> L17
        FileOutputStream r5 = new FileOutputStream(r4, true);     // Catch: Exception -> L17
        AbstractC2675wh.m5247j0(r5, r3, r12);     // Catch: Throwable -> L12
        r5.close();     // Catch: Exception -> L17
        r6.push(true);     // Catch: Exception -> L17
        return 1;
    L12:
        th = move-exception;
        throw th;     // Catch: Throwable -> L14
    L14:
        th = move-exception;
        AbstractC0585Nj.m1138f(r5, th);     // Catch: Exception -> L17
        throw th;     // Catch: Exception -> L17
    L17:
        r6.push(false);
        return 1;
    }

    private static final int register$lambda$7(Lua r3) {
        AbstractC0295Gu.m625r(-550236850223157L);
        String r1 = r3.toString(1);
        if (r1 != null) goto L6;
        return 0;
    L6:
        r3.push(new File(r1).exists());
        return 1;
    }

    private static final int register$lambda$8(Lua r3) {
        AbstractC0295Gu.m625r(-550245440157749L);
        String r1 = r3.toString(1);
        if (r1 != null) goto L6;
        return 0;
    L6:
        r3.push(new File(r1).isFile());
        return 1;
    }

    private static final int register$lambda$9(Lua r3) {
        AbstractC0295Gu.m625r(-550254030092341L);
        String r1 = r3.toString(1);
        if (r1 != null) goto L6;
        return 0;
    L6:
        r3.push(new File(r1).isDirectory());
        return 1;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ int m3082s(Lua r0) {
        return register$lambda$16(r0);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ int m3083t(Lua r0) {
        return register$lambda$20(r0);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ int m3084u(Lua r0) {
        return register$lambda$1(r0);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ int m3085v(Lua r0) {
        return register$lambda$36(r0);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ int m3086w(Lua r0) {
        return register$lambda$21(r0);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ int m3087x(Lua r0) {
        return register$lambda$11(r0);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ int m3088y(Lua r0) {
        return register$lambda$10(r0);
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ int m3089z(Lua r0) {
        return register$lambda$9(r0);
    }

    public final void register(Lua r5) {
        AbstractC0295Gu.m625r(-552594787268661L);
        r5.createTable(0, 25);
        r5.push(new C2402q8(22));
        r5.setField(-2, AbstractC0295Gu.m625r(-552611967137845L));
        r5.push(new C2402q8(24));
        r5.setField(-2, AbstractC0295Gu.m625r(-552650621843509L));
        r5.push(new C2574u8(4));
        r5.setField(-2, AbstractC0295Gu.m625r(-552693571516469L));
        r5.push(new C2574u8(5));
        r5.setField(-2, AbstractC0295Gu.m625r(-552736521189429L));
        r5.push(new C2574u8(6));
        r5.setField(-2, AbstractC0295Gu.m625r(-552779470862389L));
        r5.push(new C2574u8(7));
        r5.setField(-2, AbstractC0295Gu.m625r(-551177448060981L));
        r5.push(new C2574u8(8));
        r5.setField(-2, AbstractC0295Gu.m625r(-551224692701237L));
        r5.push(new C2574u8(9));
        r5.setField(-2, AbstractC0295Gu.m625r(-551254757472309L));
        r5.push(new C2574u8(10));
        r5.setField(-2, AbstractC0295Gu.m625r(-551284822243381L));
        r5.push(new C2574u8(11));
        r5.setField(-2, AbstractC0295Gu.m625r(-551310592047157L));
        r5.push(new C2574u8(3));
        r5.setField(-2, AbstractC0295Gu.m625r(-551344951785525L));
        r5.push(new C2574u8(12));
        r5.setField(-2, AbstractC0295Gu.m625r(-550863915448373L));
        r5.push(new C2574u8(13));
        r5.setField(-2, AbstractC0295Gu.m625r(-550898275186741L));
        r5.push(new C2574u8(14));
        r5.setField(-2, AbstractC0295Gu.m625r(-550941224859701L));
        r5.push(new C2574u8(15));
        r5.setField(-2, AbstractC0295Gu.m625r(-550997059434549L));
        r5.push(new C2574u8(16));
        r5.setField(-2, AbstractC0295Gu.m625r(-551065778911285L));
        r5.push(new C2574u8(17));
        r5.setField(-2, AbstractC0295Gu.m625r(-551113023551541L));
        r5.push(new C2574u8(18));
        r5.setField(-2, AbstractC0295Gu.m625r(-551731498842165L));
        r5.push(new C2574u8(19));
        r5.setField(-2, AbstractC0295Gu.m625r(-551774448515125L));
        r5.push(new C2402q8(23));
        r5.setField(-2, AbstractC0295Gu.m625r(-551821693155381L));
        r5.push(new C2402q8(25));
        r5.setField(-2, AbstractC0295Gu.m625r(-551860347861045L));
        r5.push(new C2402q8(26));
        r5.setField(-2, AbstractC0295Gu.m625r(-551899002566709L));
        r5.push(new C2402q8(27));
        r5.setField(-2, AbstractC0295Gu.m625r(-551933362305077L));
        r5.push(new C2402q8(28));
        r5.setField(-2, AbstractC0295Gu.m625r(-551426556164149L));
        r5.push(new C2402q8(29));
        r5.setField(-2, AbstractC0295Gu.m625r(-551456620935221L));
        r5.push(new C2574u8(0));
        r5.setField(-2, AbstractC0295Gu.m625r(-551499570608181L));
        r5.push(new C2574u8(1));
        r5.setField(-2, AbstractC0295Gu.m625r(-551555405183029L));
        r5.push(new C2574u8(2));
        r5.setField(-2, AbstractC0295Gu.m625r(-551606944790581L));
        AbstractC0295Gu.m625r(-551658484398133L);
        AbstractC0295Gu.m625r(-550069346498613L);
    }
}
