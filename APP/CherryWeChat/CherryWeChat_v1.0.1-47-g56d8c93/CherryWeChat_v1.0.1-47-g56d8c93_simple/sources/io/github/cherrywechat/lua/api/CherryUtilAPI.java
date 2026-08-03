package io.github.cherrywechat.lua.api;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.util.Base64;
import io.github.cherrywechat.lua.LuaUiScheduler;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import p000.AbstractC0295Gu;
import p000.AbstractC2453ra;
import p000.AbstractC2496sa;
import p000.AbstractC2564tz;
import p000.AbstractC2659w7;
import p000.AbstractC2822zz;
import p000.C0439K8;
import p000.C2789z8;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
public final class CherryUtilAPI {
    public static final CherryUtilAPI INSTANCE = null;
    private static final String TAG = null;

    static {
        TAG = AbstractC0295Gu.m625r(-545254688159797L);
        INSTANCE = new CherryUtilAPI();
    }

    private CherryUtilAPI() {
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ int m3212A(Lua r0) {
        return register$lambda$16(r0);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ int m3213B(Lua r0) {
        return register$lambda$15(r0);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ int m3214C(Lua r0) {
        return register$lambda$28(r0);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m3215a(Lua r0) {
        return register$lambda$32(r0);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m3216b(Lua r0) {
        return register$lambda$13(r0);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m3217c(Lua r0) {
        return register$lambda$5(r0);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m3218d(Lua r0) {
        return register$lambda$11(r0);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int m3219e(Lua r0) {
        return register$lambda$9(r0);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m3220f(Lua r0) {
        return register$lambda$6(r0);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ int m3221g(Lua r0) {
        return register$lambda$2(r0);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ int m3222h(Lua r0) {
        return register$lambda$33(r0);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ int m3223i(Lua r0) {
        return register$lambda$23(r0);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ int m3224j(Lua r0) {
        return register$lambda$31(r0);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ int m3225k(Lua r0) {
        return register$lambda$34(r0);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ int m3226l(Lua r0) {
        return register$lambda$10(r0);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ int m3227m(Lua r0) {
        return register$lambda$7(r0);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ int m3228n(Lua r0) {
        return register$lambda$19(r0);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ int m3229o(Lua r0) {
        return register$lambda$3(r0);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ int m3230p(Lua r0) {
        return register$lambda$4(r0);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ int m3231q(Lua r0) {
        return register$lambda$26(r0);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ int m3232r(Lua r0) {
        return register$lambda$0(r0);
    }

    private static final int register$lambda$0(Lua r2) {
        AbstractC0295Gu.m625r(-529165740668981L);
        r2.push(Double.valueOf(System.currentTimeMillis()));
        return 1;
    }

    private static final int register$lambda$1(Lua r4) {
        AbstractC0295Gu.m625r(-529174330603573L);
        r4.push(Double.valueOf(System.currentTimeMillis() / ((long) 1000)));
        return 1;
    }

    private static final int register$lambda$10(Lua r4) {
        AbstractC0295Gu.m625r(-529582352496693L);
        int r1 = (int) r4.toNumber(1);
        int r2 = (int) r4.toNumber(2);
        r4.push(Double.valueOf(new Random().nextInt((r2 - r1) + 1) + r1));
        return 1;
    }

    private static final int register$lambda$11(Lua r3) {
        AbstractC0295Gu.m625r(-529590942431285L);
        String r1 = r3.toString(1);
        if (r1 != null) goto L5;
        r1 = AbstractC0295Gu.m625r(-529599532365877L);
    L5:
        r3.push(AbstractC2564tz.m5070e0(r1).toString());
        return 1;
    }

    private static final int register$lambda$13(Lua r5) {
        AbstractC0295Gu.m625r(-529603827333173L);
        String r1 = r5.toString(1);
        if (r1 != null) goto L5;
        r1 = AbstractC0295Gu.m625r(-529612417267765L);
    L5:
        String r2 = r5.toString(2);
        if (r2 != null) goto L8;
        r2 = AbstractC0295Gu.m625r(-529616712235061L);
    L8:
        List r12 = AbstractC2564tz.m5065Z(r1, new String[]{r2}, 6);
        int r3 = 0;
        r5.createTable(r12.size(), 0);
        Iterator r13 = r12.iterator();
    L10:
        if (r13.hasNext() == false) goto L16;
        Object r22 = r13.next();
        int r4 = r3 + 1;
        if (r3 < 0) goto L14;
        r5.push((String) r22);
        r5.rawSetI(-2, r4);
        r3 = r4;
        goto L10
    L14:
        AbstractC2496sa.m4978c0();
        throw null;
    L16:
        return 1;
    }

    private static final int register$lambda$15(Lua r8) {
        AbstractC0295Gu.m625r(-529625302169653L);
        if (r8.isTable(1) == true) goto L7;
        r8.push(AbstractC0295Gu.m625r(-529633892104245L));
        return 1;
    L7:
        if (r8.getTop() < 2) goto L13;
        String r1 = r8.toString(2);
        if (r1 != null) goto L12;
        long r12 = -529638187071541L;
    L11:
        r1 = AbstractC0295Gu.m625r(r12);
    L12:
        String r3 = r1;
        ArrayList r2 = new ArrayList();
        r8.pushValue(1);
        r8.pushNil();
    L16:
        if (r8.next(-2) == 0) goto L21;
        String r13 = r8.toString(-1);
        if (r13 == null) goto L20;
        r2.add(r13);
    L20:
        r8.pop(1);
        goto L16
    L21:
        r8.pop(1);
        r8.push(AbstractC2453ra.m4901k0(r2, r3, null, null, null, 62));
        return 1;
    L13:
        r12 = -529646777006133L;
        goto L11
    }

    private static final int register$lambda$16(Lua r4) {
        AbstractC0295Gu.m625r(-529655366940725L);
        String r1 = r4.toString(1);
        if (r1 != null) goto L5;
        r1 = AbstractC0295Gu.m625r(-529663956875317L);
    L5:
        byte[] r12 = r1.getBytes(AbstractC2659w7.f9201a);
        AbstractC0295Gu.m625r(-529668251842613L);
        r4.push(Base64.encodeToString(r12, 2));
        return 1;
    }

    private static final int register$lambda$17(Lua r4) {
        AbstractC0295Gu.m625r(-528079113943093L);
        String r1 = r4.toString(1);
        if (r1 != null) goto L10;
        r1 = AbstractC0295Gu.m625r(-528087703877685L);
    L10:
        byte[] r12 = Base64.decode(r1, 2);     // Catch: Exception -> L8
        AbstractC0295Gu.m625r(-528091998844981L);     // Catch: Exception -> L8
        r4.push(new String(r12, AbstractC2659w7.f9201a));     // Catch: Exception -> L8
    L9:
        return 1;
    L8:
        r4.push(AbstractC0295Gu.m625r(-528143538452533L));
        goto L9
    }

    private static final int register$lambda$18(Lua r4) {
        AbstractC0295Gu.m625r(-528147833419829L);
        String r1 = r4.toString(1);
        if (r1 != null) goto L5;
        r1 = AbstractC0295Gu.m625r(-528156423354421L);
    L5:
        r4.push(URLEncoder.encode(r1, AbstractC0295Gu.m625r(-528160718321717L)));
        return 1;
    }

    private static final int register$lambda$19(Lua r4) {
        AbstractC0295Gu.m625r(-528186488125493L);
        String r1 = r4.toString(1);
        if (r1 != null) goto L10;
        r1 = AbstractC0295Gu.m625r(-528195078060085L);
    L10:
        r4.push(URLDecoder.decode(r1, AbstractC0295Gu.m625r(-528199373027381L)));     // Catch: Exception -> L8
    L9:
        return 1;
    L8:
        r4.push(r1);
        goto L9
    }

    private static final int register$lambda$2(Lua r6) {
        AbstractC0295Gu.m625r(-529182920538165L);
        if (r6.getTop() >= 1) goto L5;
    L7:
        long r2 = System.currentTimeMillis();
    L9:
        if (r6.getTop() < 2) goto L14;
        String r0 = r6.toString(2);
        if (r0 != null) goto L19;
        long r4 = -529191510472757L;
    L13:
        r0 = AbstractC0295Gu.m625r(r4);
    L19:
        r6.push(new SimpleDateFormat(r0, Locale.getDefault()).format(new Date(r2)));     // Catch: Exception -> L17
    L18:
        return 1;
    L17:
        r6.push(AbstractC0295Gu.m625r(-529363309164597L));
        goto L18
    L14:
        r4 = -529277409818677L;
        goto L13
    L5:
        if (r6.isNil(1) == true) goto L7;
        r2 = (long) r6.toNumber(1);
        goto L9
    }

    private static final int register$lambda$21(Lua r9) {
        AbstractC0295Gu.m625r(-528298157275189L);
        String r1 = r9.toString(1);
        if (r1 != null) goto L5;
        r1 = AbstractC0295Gu.m625r(-528306747209781L);
    L5:
        MessageDigest r2 = MessageDigest.getInstance(AbstractC0295Gu.m625r(-528311042177077L));
        byte[] r12 = r1.getBytes(AbstractC2659w7.f9201a);
        AbstractC0295Gu.m625r(-527778466232373L);
        byte[] r13 = r2.digest(r12);
        AbstractC0295Gu.m625r(-527838595774517L);
        String r22 = AbstractC0295Gu.m625r(-527890135382069L);
        StringBuilder r3 = new StringBuilder();
        r3.append("");
        int r5 = r13.length;
        int r6 = 0;
        int r7 = 0;
    L6:
        if (r6 >= r5) goto L11;
        byte r8 = r13[r6];
        r7 = r7 + 1;
        if (r7 <= 1) goto L10;
        r3.append(r22);
    L10:
        r3.append(register$lambda$21$lambda$20(r8));
        r6 = r6 + 1;
        goto L6
    L11:
        r3.append("");
        r9.push(r3.toString());
        return 1;
    }

    private static final CharSequence register$lambda$21$lambda$20(byte r2) {
        String r22 = String.format(AbstractC0295Gu.m625r(-528225142831157L), Arrays.copyOf(new Object[]{Byte.valueOf(r2)}, 1));
        AbstractC0295Gu.m625r(-528246617667637L);
        return r22;
    }

    private static final int register$lambda$23(Lua r9) {
        AbstractC0295Gu.m625r(-527967444793397L);
        String r1 = r9.toString(1);
        if (r1 != null) goto L5;
        r1 = AbstractC0295Gu.m625r(-527976034727989L);
    L5:
        MessageDigest r2 = MessageDigest.getInstance(AbstractC0295Gu.m625r(-527980329695285L));
        byte[] r12 = r1.getBytes(AbstractC2659w7.f9201a);
        AbstractC0295Gu.m625r(-528006099499061L);
        byte[] r13 = r2.digest(r12);
        AbstractC0295Gu.m625r(-528615984855093L);
        String r22 = AbstractC0295Gu.m625r(-528667524462645L);
        StringBuilder r3 = new StringBuilder();
        r3.append("");
        int r5 = r13.length;
        int r6 = 0;
        int r7 = 0;
    L6:
        if (r6 >= r5) goto L11;
        byte r8 = r13[r6];
        r7 = r7 + 1;
        if (r7 <= 1) goto L10;
        r3.append(r22);
    L10:
        r3.append(register$lambda$23$lambda$22(r8));
        r6 = r6 + 1;
        goto L6
    L11:
        r3.append("");
        r9.push(r3.toString());
        return 1;
    }

    private static final CharSequence register$lambda$23$lambda$22(byte r2) {
        String r22 = String.format(AbstractC0295Gu.m625r(-527894430349365L), Arrays.copyOf(new Object[]{Byte.valueOf(r2)}, 1));
        AbstractC0295Gu.m625r(-527915905185845L);
        return r22;
    }

    private static final int register$lambda$25(Lua r9) {
        AbstractC0295Gu.m625r(-528744833873973L);
        String r1 = r9.toString(1);
        if (r1 != null) goto L5;
        r1 = AbstractC0295Gu.m625r(-528753423808565L);
    L5:
        MessageDigest r2 = MessageDigest.getInstance(AbstractC0295Gu.m625r(-528757718775861L));
        byte[] r12 = r1.getBytes(AbstractC2659w7.f9201a);
        AbstractC0295Gu.m625r(-528792078514229L);
        byte[] r13 = r2.digest(r12);
        AbstractC0295Gu.m625r(-528852208056373L);
        String r22 = AbstractC0295Gu.m625r(-528353991850037L);
        StringBuilder r3 = new StringBuilder();
        r3.append("");
        int r5 = r13.length;
        int r6 = 0;
        int r7 = 0;
    L6:
        if (r6 >= r5) goto L11;
        byte r8 = r13[r6];
        r7 = r7 + 1;
        if (r7 <= 1) goto L10;
        r3.append(r22);
    L10:
        r3.append(register$lambda$25$lambda$24(r8));
        r6 = r6 + 1;
        goto L6
    L11:
        r3.append("");
        r9.push(r3.toString());
        return 1;
    }

    private static final CharSequence register$lambda$25$lambda$24(byte r2) {
        String r22 = String.format(AbstractC0295Gu.m625r(-528671819429941L), Arrays.copyOf(new Object[]{Byte.valueOf(r2)}, 1));
        AbstractC0295Gu.m625r(-528693294266421L);
        return r22;
    }

    private static final int register$lambda$26(Lua r6) {
        AbstractC0295Gu.m625r(-528358286817333L);
        String r1 = r6.toString(1);
        if (r1 != null) goto L5;
        return 0;
    L5:
        Context r3 = CherryGlobalAPI.INSTANCE.getCurrentContext();
        if (r3 == null) goto L8;
        Object r2 = r3.getSystemService(AbstractC0295Gu.m625r(-528366876751925L));
        AbstractC0295Gu.m625r(-528409826424885L);
        ((ClipboardManager) r2).setPrimaryClip(ClipData.newPlainText(AbstractC0295Gu.m625r(-544653392738357L), r1));
        r6.push(true);
    L9:
        return 1;
    L8:
        r6.push(false);
        goto L9
    }

    private static final int register$lambda$27(Lua r3) {
        AbstractC0295Gu.m625r(-544692047444021L);
        Context r0 = CherryGlobalAPI.INSTANCE.getCurrentContext();
        if (r0 == null) goto L15;
        Object r02 = r0.getSystemService(AbstractC0295Gu.m625r(-544700637378613L));
        AbstractC0295Gu.m625r(-544743587051573L);
        ClipData r03 = ((ClipboardManager) r02).getPrimaryClip();
        if (r03 == null) goto L11;
        ClipData.Item r04 = r03.getItemAt(0);
        if (r04 == null) goto L11;
        CharSequence r05 = r04.getText();
        if (r05 == null) goto L11;
        String r06 = r05.toString();
    L12:
        if (r06 == null) goto L14;
        r3.push(r06);
        return 1;
    L14:
        r3.pushNil();
        return 1;
    L11:
        r06 = null;
        goto L12
    L15:
        r3.pushNil();
        return 1;
    }

    private static final int register$lambda$28(Lua r3) {
        AbstractC0295Gu.m625r(-544494478948405L);
        Object r1 = r3.toObject(1);
        if (r1 != null) goto L6;
        String r12 = AbstractC0295Gu.m625r(-544503068882997L);
    L15:
        r3.push(r12);
        return 1;
    L6:
        if ((r1 instanceof String) == false) goto L9;
        r12 = AbstractC0295Gu.m625r(-544520248752181L);
        goto L15
    L9:
        if ((r1 instanceof Number) == false) goto L12;
        r12 = AbstractC0295Gu.m625r(-545100069337141L);
        goto L15
    L12:
        if ((r1 instanceof Boolean) == false) goto L14;
        r12 = AbstractC0295Gu.m625r(-545130134108213L);
        goto L15
    L14:
        r12 = r1.getClass().getSimpleName();
        goto L15
    }

    private static final int register$lambda$29(Lua r3) {
        AbstractC0295Gu.m625r(-545164493846581L);
        Object r1 = r3.toObject(1);
        if (r1 == null) goto L5;
        r3.push(r1.getClass().getName());
    L6:
        return 1;
    L5:
        r3.push(AbstractC0295Gu.m625r(-545173083781173L));
        goto L6
    }

    private static final int register$lambda$3(Lua r7) {
        AbstractC0295Gu.m625r(-529367604131893L);
        String r1 = r7.toString(1);
        if (r1 != null) goto L7;
        return 0;
    L7:
        if (r7.getTop() < 2) goto L12;
        String r2 = r7.toString(2);
        if (r2 != null) goto L22;
        long r22 = -529376194066485L;
    L11:
        r2 = AbstractC0295Gu.m625r(r22);
    L22:
        Date r12 = new SimpleDateFormat(r2, Locale.getDefault()).parse(r1);     // Catch: Exception -> L20
        if (r12 == null) goto L17;
        double r13 = r12.getTime();     // Catch: Exception -> L20
    L18:
        r7.push(Double.valueOf(r13));     // Catch: Exception -> L20
    L21:
        return 1;
    L17:
        r13 = 0.0d;
    L20:
        r7.push(Double.valueOf(0.0d));
        goto L21
    L12:
        r22 = -528912337598517L;
        goto L11
    }

    private static final int register$lambda$30(Lua r4) {
        AbstractC0295Gu.m625r(-545190263650357L);
        Object r1 = r4.toObject(1);
        String r2 = r4.toString(2);
        if (r1 == null) goto L8;
        if (r2 == null) goto L8;
        r4.push(Class.forName(r2).isInstance(r1));     // Catch: ClassNotFoundException -> L7
    L9:
        return 1;
    L7:
        r4.push(false);
    L8:
        r4.push(false);
        goto L9
    }

    private static final int register$lambda$31(Lua r4) {
        AbstractC0295Gu.m625r(-545198853584949L);
        Object r1 = r4.toObject(1);
        if (r1 != null) goto L5;
    L4:
        boolean r3 = true;
    L21:
        r4.push(r3);
        return 1;
    L5:
        r3 = false;
        if ((r1 instanceof String) == false) goto L11;
        if (((CharSequence) r1).length() != 0) goto L21;
    L11:
        if ((r1 instanceof Collection) == false) goto L14;
        r3 = ((Collection) r1).isEmpty();
        goto L21
    L14:
        if ((r1 instanceof Map) == false) goto L17;
        r3 = ((Map) r1).isEmpty();
        goto L21
    L17:
        if ((r1 instanceof Object[]) == false) goto L21;
        if (((Object[]) r1).length != 0) goto L21;
        goto L21
    }

    private static final int register$lambda$32(Lua r2) {
        AbstractC0295Gu.m625r(-545207443519541L);
        String r1 = r2.toString(1);
        if (r1 != null) goto L5;
    L8:
        boolean r12 = true;
    L9:
        r2.push(r12);
        return 1;
    L5:
        if (AbstractC2564tz.m5059T(r1) == true) goto L8;
        r12 = false;
        goto L9
    }

    private static final int register$lambda$33(Lua r4) {
        AbstractC0295Gu.m625r(-545216033454133L);
        String r1 = r4.toString(1);
        if (r1 != null) goto L6;
        r1 = AbstractC0295Gu.m625r(-545224623388725L);
    L6:
        if (r4.getTop() < 2) goto L8;
        double r2 = r4.toNumber(2);
    L9:
        Double r12 = AbstractC2822zz.m5461F(r1);
        if (r12 == null) goto L12;
        r2 = r12.doubleValue();
    L12:
        r4.push(Double.valueOf(r2));
        return 1;
    L8:
        r2 = 0.0d;
        goto L9
    }

    private static final int register$lambda$34(Lua r3) {
        AbstractC0295Gu.m625r(-545228918356021L);
        Object r1 = r3.toObject(1);
        if (r1 == null) goto L6;
        String r12 = r1.toString();
        if (r12 == null) goto L6;
    L7:
        r3.push(r12);
        return 1;
    L6:
        r12 = AbstractC0295Gu.m625r(-545237508290613L);
        goto L7
    }

    private static final int register$lambda$4(Lua r4) {
        AbstractC0295Gu.m625r(-528998236944437L);
        long r0 = (long) r4.toNumber(1);
        if (r0 <= 0) goto L7;
        Thread.sleep(r0);
        return 0;
    L7:
        return 0;
    }

    private static final int register$lambda$5(Lua r2) {
        AbstractC0295Gu.m625r(-529006826879029L);
        r2.push(LuaUiScheduler.INSTANCE.isForeground());
        return 1;
    }

    private static final int register$lambda$6(Lua r2) {
        AbstractC0295Gu.m625r(-529015416813621L);
        r2.push(!LuaUiScheduler.INSTANCE.isForeground());
        return 1;
    }

    private static final int register$lambda$7(Lua r2) {
        AbstractC0295Gu.m625r(-529024006748213L);
        r2.push(UUID.randomUUID().toString());
        return 1;
    }

    private static final int register$lambda$9(Lua r7) {
        AbstractC0295Gu.m625r(-529032596682805L);
        int r1 = (int) r7.toNumber(1);
        if (r7.getTop() < 2) goto L7;
        String r2 = r7.toString(2);
        if (r2 != null) goto L8;
        r2 = AbstractC0295Gu.m625r(-529041186617397L);
    L8:
        Random r3 = new Random();
        StringBuilder r4 = new StringBuilder();
        int r5 = 0;
    L9:
        if (r5 >= r1) goto L11;
        r4.append(r2.charAt(r3.nextInt(r2.length())));
        r5 = r5 + 1;
        goto L9
    L11:
        r7.push(r4.toString());
        return 1;
    L7:
        r2 = AbstractC0295Gu.m625r(-529861525370933L);
        goto L8
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ int m3233s(Lua r0) {
        return register$lambda$17(r0);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ int m3234t(Lua r0) {
        return register$lambda$27(r0);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ int m3235u(Lua r0) {
        return register$lambda$21(r0);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ int m3236v(Lua r0) {
        return register$lambda$30(r0);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ int m3237w(Lua r0) {
        return register$lambda$18(r0);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ int m3238x(Lua r0) {
        return register$lambda$1(r0);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ int m3239y(Lua r0) {
        return register$lambda$29(r0);
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ int m3240z(Lua r0) {
        return register$lambda$25(r0);
    }

    public final void register(Lua r5) {
        AbstractC0295Gu.m625r(-531781375752245L);
        r5.createTable(0, 30);
        r5.push(new C2789z8(19));
        r5.setField(-2, AbstractC0295Gu.m625r(-531798555621429L));
        r5.push(new C2789z8(21));
        r5.setField(-2, AbstractC0295Gu.m625r(-531820030457909L));
        r5.push(new C0439K8(2));
        r5.setField(-2, AbstractC0295Gu.m625r(-531871570065461L));
        r5.push(new C0439K8(3));
        r5.setField(-2, AbstractC0295Gu.m625r(-530269547264053L));
        r5.push(new C0439K8(4));
        r5.setField(-2, AbstractC0295Gu.m625r(-530312496937013L));
        r5.push(new C0439K8(5));
        r5.setField(-2, AbstractC0295Gu.m625r(-530338266740789L));
        r5.push(new C0439K8(6));
        r5.setField(-2, AbstractC0295Gu.m625r(-530394101315637L));
        r5.push(new C0439K8(7));
        r5.setField(-2, AbstractC0295Gu.m625r(-530449935890485L));
        r5.push(new C0439K8(8));
        r5.setField(-2, AbstractC0295Gu.m625r(-530471410726965L));
        r5.push(new C0439K8(9));
        r5.setField(-2, AbstractC0295Gu.m625r(-529977489487925L));
        r5.push(new C0439K8(0));
        r5.setField(-2, AbstractC0295Gu.m625r(-530020439160885L));
        r5.push(new C0439K8(10));
        r5.setField(-2, AbstractC0295Gu.m625r(-530041913997365L));
        r5.push(new C0439K8(11));
        r5.setField(-2, AbstractC0295Gu.m625r(-530067683801141L));
        r5.push(new C0439K8(12));
        r5.setField(-2, AbstractC0295Gu.m625r(-530089158637621L));
        r5.push(new C0439K8(13));
        r5.setField(-2, AbstractC0295Gu.m625r(-530144993212469L));
        r5.push(new C0439K8(14));
        r5.setField(-2, AbstractC0295Gu.m625r(-530200827787317L));
        r5.push(new C0439K8(15));
        r5.setField(-2, AbstractC0295Gu.m625r(-530793533274165L));
        r5.push(new C0439K8(16));
        r5.setField(-2, AbstractC0295Gu.m625r(-530836482947125L));
        r5.push(new C0439K8(17));
        r5.setField(-2, AbstractC0295Gu.m625r(-530853662816309L));
        r5.push(new C2789z8(20));
        r5.setField(-2, AbstractC0295Gu.m625r(-530875137652789L));
        r5.push(new C2789z8(22));
        r5.setField(-2, AbstractC0295Gu.m625r(-530905202423861L));
        r5.push(new C2789z8(23));
        r5.setField(-2, AbstractC0295Gu.m625r(-530926677260341L));
        r5.push(new C2789z8(24));
        r5.setField(-2, AbstractC0295Gu.m625r(-530952447064117L));
        r5.push(new C2789z8(25));
        r5.setField(-2, AbstractC0295Gu.m625r(-530973921900597L));
        r5.push(new C2789z8(26));
        r5.setField(-2, AbstractC0295Gu.m625r(-531003986671669L));
        r5.push(new C2789z8(27));
        r5.setField(-2, AbstractC0295Gu.m625r(-531051231311925L));
        r5.push(new C2789z8(28));
        r5.setField(-2, AbstractC0295Gu.m625r(-530535835236405L));
        r5.push(new C2789z8(29));
        r5.setField(-2, AbstractC0295Gu.m625r(-530570194974773L));
        r5.push(new C0439K8(1));
        r5.setField(-2, AbstractC0295Gu.m625r(-530608849680437L));
        AbstractC0295Gu.m625r(-530647504386101L);
        AbstractC0295Gu.m625r(-530707633928245L);
    }
}
