package io.github.cherrywechat.lua.api;

import android.app.Activity;
import android.app.AndroidAppHelper;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import io.github.cherrywechat.application.MainApplication;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.AbstractC0085Bz;
import p000.AbstractC0213Ey;
import p000.AbstractC0295Gu;
import p000.AbstractC0513Lx;
import p000.AbstractC0585Nj;
import p000.AbstractC0671Pj;
import p000.AbstractC1257cG;
import p000.AbstractC1450gG;
import p000.AbstractC2496sa;
import p000.AbstractC2564tz;
import p000.AbstractC2598uq;
import p000.C0208Et;
import p000.C0954W8;
import p000.C1207b9;
import p000.C1214bG;
import p000.C1456gf;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
public final class CherryWeChatAPI {
    public static final CherryWeChatAPI INSTANCE = null;
    private static final String TAG = null;

    static {
        TAG = AbstractC0295Gu.m625r(-313979289204789L);
        INSTANCE = new CherryWeChatAPI();
    }

    private CherryWeChatAPI() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m3344a(Lua r0) {
        return register$lambda$2(r0);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m3345b(Lua r0) {
        return register$lambda$10(r0);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m3346c(Lua r0) {
        return register$lambda$30(r0);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m3347d(Lua r0) {
        return register$lambda$9(r0);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int m3348e(Lua r0) {
        return register$lambda$31(r0);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m3349f(Lua r0) {
        return register$lambda$7(r0);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ int m3350g(Lua r0) {
        return register$lambda$28(r0);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ int m3351h(Lua r0) {
        return register$lambda$0(r0);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ int m3352i(Lua r0) {
        return register$lambda$25(r0);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ int m3353j(Lua r0) {
        return register$lambda$23(r0);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ int m3354k(Lua r0) {
        return register$lambda$1(r0);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ int m3355l(Lua r0) {
        return register$lambda$29(r0);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ int m3356m(Lua r0) {
        return register$lambda$26(r0);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ int m3357n(Lua r0) {
        return register$lambda$24(r0);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ int m3358o(Lua r0) {
        return register$lambda$16(r0);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ int m3359p(Lua r0) {
        return register$lambda$20(r0);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ int m3360q(Lua r0) {
        return register$lambda$8(r0);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ int m3361r(Lua r0) {
        return register$lambda$6(r0);
    }

    private static final int register$lambda$0(Lua r2) {
        AbstractC0295Gu.m625r(-304418692003893L);
        r2.push(C1456gf.m2791I());     // Catch: Exception -> L5
        return 1;
    L5:
        AbstractC0295Gu.m625r(-304427281938485L);
        AbstractC0295Gu.m625r(-304496001415221L);
        r2.push(AbstractC0295Gu.m625r(-304556130957365L));
        return 1;
    }

    private static final int register$lambda$1(Lua r2) {
        AbstractC0295Gu.m625r(-304560425924661L);
        r2.push(C1456gf.m2794L());     // Catch: Exception -> L5
        return 1;
    L5:
        AbstractC0295Gu.m625r(-304019260045365L);
        AbstractC0295Gu.m625r(-304087979522101L);
        r2.push(AbstractC0295Gu.m625r(-304160993966133L));
        return 1;
    }

    private static final int register$lambda$10(Lua r3) {
        AbstractC0295Gu.m625r(-302941223254069L);
        Context r0 = MainApplication.f5549a;     // Catch: Exception -> L12
        if (r0 != null) goto L10;
        r0 = C1456gf.f5172p;     // Catch: Exception -> L12
        if (r0 != null) goto L10;
        r0 = AndroidAppHelper.currentApplication();     // Catch: Exception -> L12
        AbstractC0295Gu.m625r(-836852902787125L);     // Catch: Exception -> L12
    L10:
        String r02 = r0.getApplicationInfo().packageName;     // Catch: Exception -> L12
        AbstractC0295Gu.m625r(-837656061671477L);     // Catch: Exception -> L12
        r3.push(r02);     // Catch: Exception -> L12
        return 1;
    L12:
        ApplicationInfo r03 = AbstractC1450gG.f5072f;
        if (r03 != null) goto L16;
        AbstractC0295Gu.m625r(-579206404634677L);
        r03 = null;
    L16:
        r3.push(r03.packageName);
        return 1;
    }

    private static final int register$lambda$11(Lua r3) {
        AbstractC0295Gu.m625r(-302949813188661L);
        Context r0 = MainApplication.f5549a;     // Catch: Exception -> L15
        if (r0 != null) goto L10;
        r0 = C1456gf.f5172p;     // Catch: Exception -> L15
        if (r0 != null) goto L10;
        r0 = AndroidAppHelper.currentApplication();     // Catch: Exception -> L15
        AbstractC0295Gu.m625r(-836852902787125L);     // Catch: Exception -> L15
    L10:
        String r02 = r0.getPackageManager().getPackageInfo(r0.getPackageName(), 0).versionName;     // Catch: Exception -> L15
        if (r02 != null) goto L13;
        r02 = AbstractC0295Gu.m625r(-302958403123253L);     // Catch: Exception -> L15
    L13:
        r3.push(r02);     // Catch: Exception -> L15
        return 1;
    L15:
        r3.push(AbstractC0295Gu.m625r(-302992762861621L));
        return 1;
    }

    private static final int register$lambda$12(Lua r3) {
        AbstractC0295Gu.m625r(-303027122599989L);
        Context r0 = MainApplication.f5549a;     // Catch: Exception -> L12
        if (r0 != null) goto L10;
        r0 = C1456gf.f5172p;     // Catch: Exception -> L12
        if (r0 != null) goto L10;
        r0 = AndroidAppHelper.currentApplication();     // Catch: Exception -> L12
        AbstractC0295Gu.m625r(-836852902787125L);     // Catch: Exception -> L12
    L10:
        r3.push(Double.valueOf(r0.getPackageManager().getPackageInfo(r0.getPackageName(), 0).getLongVersionCode()));     // Catch: Exception -> L12
        return 1;
    L12:
        r3.push(Double.valueOf(0.0d));
        return 1;
    }

    private static final int register$lambda$16(Lua r13) {
        AbstractC0295Gu.m625r(-303035712534581L);
        Cursor r0 = AbstractC0671Pj.m1357w(AbstractC0295Gu.m625r(-303044302469173L), null);     // Catch: Exception -> L45
        if (r0 != null) goto L7;
        AbstractC0295Gu.m625r(-302129474435125L);     // Catch: Exception -> L45
        AbstractC0295Gu.m625r(-302198193911861L);     // Catch: Exception -> L45
        r13.createTable(0, 0);     // Catch: Exception -> L45
        return 1;
    L7:
        ArrayList r4 = new ArrayList();     // Catch: Exception -> L45
    L47:
        if (r0.moveToNext() == false) goto L20;
        String r5 = r0.getString(r0.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-301854596528181L)));     // Catch: Throwable -> L13
        if (r5 != null) goto L15;
        r5 = AbstractC0295Gu.m625r(-301893251233845L);     // Catch: Throwable -> L13
    L15:
        String r6 = r0.getString(r0.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-301897546201141L)));     // Catch: Throwable -> L13
        if (r6 != null) goto L18;
        r6 = AbstractC0295Gu.m625r(-301949085808693L);     // Catch: Throwable -> L13
    L18:
        r4.add(AbstractC2598uq.m5110L(new C0208Et[]{new C0208Et(AbstractC0295Gu.m625r(-301953380775989L), r0.getString(r0.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-301974855612469L)))), new C0208Et(AbstractC0295Gu.m625r(-302030690187317L), Integer.valueOf(r0.getInt(r0.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-302082229794869L))))), new C0208Et(AbstractC0295Gu.m625r(-300484501960757L), r5), new C0208Et(AbstractC0295Gu.m625r(-300505976797237L), r6)}));     // Catch: Throwable -> L13
        goto L47
    L20:
        r0.close();     // Catch: Exception -> L45
        r13.createTable(r4.size(), 0);     // Catch: Exception -> L45
        Iterator r02 = r4.iterator();     // Catch: Exception -> L45
        int r52 = 0;
    L22:
        if (r02.hasNext() == false) goto L39;
        Object r62 = r02.next();     // Catch: Exception -> L45
        int r7 = r52 + 1;     // Catch: Exception -> L45
        if (r52 < 0) goto L37;
        Map r63 = (Map) r62;     // Catch: Exception -> L45
        r13.createTable(0, r63.size());     // Catch: Exception -> L45
        Iterator r53 = r63.entrySet().iterator();     // Catch: Exception -> L45
    L27:
        if (r53.hasNext() == false) goto L36;
        Map.Entry r64 = (Map.Entry) r53.next();     // Catch: Exception -> L45
        String r9 = (String) r64.getKey();     // Catch: Exception -> L45
        Object r65 = r64.getValue();     // Catch: Exception -> L45
        if ((r65 instanceof Integer) == false) goto L32;
        r13.push(Double.valueOf(((Number) r65).intValue()));     // Catch: Exception -> L45
    L35:
        r13.setField(-2, r9);     // Catch: Exception -> L45
        goto L27
    L32:
        if ((r65 instanceof String) == false) goto L34;
        r13.push((String) r65);     // Catch: Exception -> L45
        goto L35
    L34:
        r13.pushNil();     // Catch: Exception -> L45
        goto L35
    L36:
        r13.rawSetI(-2, r7);     // Catch: Exception -> L45
        r52 = r7;
        goto L22
    L37:
        AbstractC2496sa.m4978c0();     // Catch: Exception -> L45
        throw null;     // Catch: Exception -> L45
    L39:
        AbstractC0295Gu.m625r(-300557516404789L);     // Catch: Exception -> L45
        AbstractC0295Gu.m625r(-300626235881525L);     // Catch: Exception -> L45
        r4.size();     // Catch: Exception -> L45
        AbstractC0295Gu.m625r(-300703545292853L);     // Catch: Exception -> L45
        return 1;
    L13:
        th = move-exception;
        throw th;     // Catch: Throwable -> L42
    L42:
        th = move-exception;
        AbstractC0585Nj.m1138f(r0, th);     // Catch: Exception -> L45
        throw th;     // Catch: Exception -> L45
    L45:
        AbstractC0295Gu.m625r(-300188149217333L);
        AbstractC0295Gu.m625r(-300256868694069L);
        r13.createTable(0, 0);
        return 1;
    }

    private static final int register$lambda$2(Lua r2) {
        AbstractC0295Gu.m625r(-304165288933429L);
        r2.push(C1456gf.m2793K());     // Catch: Exception -> L5
        return 1;
    L5:
        AbstractC0295Gu.m625r(-304173878868021L);
        AbstractC0295Gu.m625r(-304242598344757L);
        r2.push(AbstractC0295Gu.m625r(-302670640314421L));
        return 1;
    }

    private static final int register$lambda$20(Lua r12) {
        AbstractC0295Gu.m625r(-300325588170805L);
        Cursor r0 = AbstractC0671Pj.m1357w(AbstractC0295Gu.m625r(-300334178105397L), null);     // Catch: Exception -> L44
        ArrayList r4 = new ArrayList();     // Catch: Exception -> L44
        if (r0 != null) goto L49;
    L23:
        r12.createTable(r4.size(), 0);     // Catch: Exception -> L44
        Iterator r02 = r4.iterator();     // Catch: Exception -> L44
        int r5 = 0;
    L25:
        if (r02.hasNext() == false) goto L42;
        Object r6 = r02.next();     // Catch: Exception -> L44
        int r7 = r5 + 1;     // Catch: Exception -> L44
        if (r5 < 0) goto L40;
        Map r62 = (Map) r6;     // Catch: Exception -> L44
        r12.createTable(0, r62.size());     // Catch: Exception -> L44
        Iterator r52 = r62.entrySet().iterator();     // Catch: Exception -> L44
    L30:
        if (r52.hasNext() == false) goto L39;
        Map.Entry r63 = (Map.Entry) r52.next();     // Catch: Exception -> L44
        String r9 = (String) r63.getKey();     // Catch: Exception -> L44
        Object r64 = r63.getValue();     // Catch: Exception -> L44
        if ((r64 instanceof Integer) == false) goto L35;
        r12.push(Double.valueOf(((Number) r64).intValue()));     // Catch: Exception -> L44
    L38:
        r12.setField(-2, r9);     // Catch: Exception -> L44
        goto L30
    L35:
        if ((r64 instanceof String) == false) goto L37;
        r12.push((String) r64);     // Catch: Exception -> L44
        goto L38
    L37:
        r12.pushNil();     // Catch: Exception -> L44
        goto L38
    L39:
        r12.rawSetI(-2, r7);     // Catch: Exception -> L44
        r5 = r7;
        goto L25
    L40:
        AbstractC2496sa.m4978c0();     // Catch: Exception -> L44
        throw null;     // Catch: Exception -> L44
    L42:
        AbstractC0295Gu.m625r(-299071457720373L);     // Catch: Exception -> L44
        AbstractC0295Gu.m625r(-299140177197109L);     // Catch: Exception -> L44
        r4.size();     // Catch: Exception -> L44
        AbstractC0295Gu.m625r(-299226076543029L);     // Catch: Exception -> L44
        return 1;
    L49:
        if (r0.moveToNext() == false) goto L17;
        C0208Et r72 = new C0208Et(AbstractC0295Gu.m625r(-299359220529205L), r0.getString(r0.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-299380695365685L))));     // Catch: Throwable -> L10
        String r53 = AbstractC0295Gu.m625r(-299419350071349L);     // Catch: Throwable -> L10
        String r65 = r0.getString(r0.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-299458004777013L)));     // Catch: Throwable -> L10
        if (r65 != null) goto L12;
        r65 = AbstractC0295Gu.m625r(-299496659482677L);     // Catch: Throwable -> L10
    L12:
        C0208Et r8 = new C0208Et(r53, r65);     // Catch: Throwable -> L10
        String r54 = AbstractC0295Gu.m625r(-299500954449973L);     // Catch: Throwable -> L10
        String r66 = r0.getString(r0.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-299531019221045L)));     // Catch: Throwable -> L10
        if (r66 != null) goto L15;
        r66 = AbstractC0295Gu.m625r(-299573968894005L);     // Catch: Throwable -> L10
    L15:
        r4.add(AbstractC2598uq.m5110L(new C0208Et[]{r72, r8, new C0208Et(r54, r66), new C0208Et(AbstractC0295Gu.m625r(-299578263861301L), Integer.valueOf(r0.getInt(r0.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-299599738697781L)))))}));     // Catch: Throwable -> L10
        goto L49
    L17:
        r0.close();     // Catch: Exception -> L44
        goto L23
    L10:
        th = move-exception;
        throw th;     // Catch: Throwable -> L20
    L20:
        th = move-exception;
        AbstractC0585Nj.m1138f(r0, th);     // Catch: Exception -> L44
        throw th;     // Catch: Exception -> L44
    L44:
        AbstractC0295Gu.m625r(-299269026215989L);
        AbstractC0295Gu.m625r(-299337745692725L);
        r12.createTable(0, 0);
        return 1;
    }

    private static final int register$lambda$23(Lua r7) {
        AbstractC0295Gu.m625r(-299964810917941L);
        String r1 = r7.toString(1);
        if (r1 != null) goto L5;
    L39:
        r7.createTable(0, 0);
        return 1;
    L5:
        if (r1.length() == 0) goto L39;
        Cursor r12 = AbstractC0671Pj.m1357w(AbstractC0295Gu.m625r(-299973400852533L), new String[]{r1});     // Catch: Exception -> L15
        if (r12 != null) goto L11;
    L33:
        if (r12 == null) goto L35;
        r12.close();     // Catch: Exception -> L15
    L35:
        AbstractC0295Gu.m625r(-315886254684213L);     // Catch: Exception -> L15
        AbstractC0295Gu.m625r(-315954974160949L);     // Catch: Exception -> L15
        AbstractC0295Gu.m625r(-316027988604981L);     // Catch: Exception -> L15
        r7.createTable(0, 0);     // Catch: Exception -> L15
        return 1;
    L11:
        if (r12.moveToFirst() != true) goto L33;
        String r3 = r12.getString(r12.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-299659868239925L)));     // Catch: Exception -> L15
        if (r3 != null) goto L17;
        r3 = AbstractC0295Gu.m625r(-299707112880181L);     // Catch: Exception -> L15
    L17:
        r12.close();     // Catch: Exception -> L15
        List r13 = AbstractC2564tz.m5065Z(r3, new String[]{AbstractC0295Gu.m625r(-299711407847477L)}, 6);     // Catch: Exception -> L15
        ArrayList r32 = new ArrayList();     // Catch: Exception -> L15
        Iterator r14 = r13.iterator();     // Catch: Exception -> L15
    L19:
        if (r14.hasNext() == false) goto L23;
        Object r4 = r14.next();     // Catch: Exception -> L15
        if (((String) r4).length() <= 0) goto L19;
        r32.add(r4);     // Catch: Exception -> L15
        goto L19
    L23:
        r7.createTable(r32.size(), 0);     // Catch: Exception -> L15
        Iterator r15 = r32.iterator();     // Catch: Exception -> L15
        int r42 = 0;
    L25:
        if (r15.hasNext() == false) goto L31;
        Object r5 = r15.next();     // Catch: Exception -> L15
        int r6 = r42 + 1;     // Catch: Exception -> L15
        if (r42 < 0) goto L29;
        r7.push((String) r5);     // Catch: Exception -> L15
        r7.rawSetI(-2, r6);     // Catch: Exception -> L15
        r42 = r6;
        goto L25
    L29:
        AbstractC2496sa.m4978c0();     // Catch: Exception -> L15
        throw null;     // Catch: Exception -> L15
    L31:
        AbstractC0295Gu.m625r(-299719997782069L);     // Catch: Exception -> L15
        AbstractC0295Gu.m625r(-299788717258805L);     // Catch: Exception -> L15
        AbstractC0295Gu.m625r(-299861731702837L);     // Catch: Exception -> L15
        r32.size();     // Catch: Exception -> L15
        AbstractC0295Gu.m625r(-315847599978549L);     // Catch: Exception -> L15
        return 1;
    L15:
        e = move-exception;
        AbstractC0295Gu.m625r(-315615671744565L);
        AbstractC0213Ey.m411i(-315684391221301L, -315757405665333L, e);
        r7.createTable(0, 0);
        return 1;
    }

    private static final int register$lambda$24(Lua r7) {
        Double r0 = Double.valueOf(0.0d);
        AbstractC0295Gu.m625r(-315774585534517L);
        String r2 = r7.toString(1);
        if (r2 != null) goto L5;
    L22:
        r7.push(r0);
        return 1;
    L5:
        if (r2.length() == 0) goto L22;
        Cursor r22 = AbstractC0671Pj.m1357w(AbstractC0295Gu.m625r(-315783175469109L), new String[]{r2});     // Catch: Exception -> L14
        if (r22 != null) goto L11;
    L16:
        if (r22 == null) goto L18;
        r22.close();     // Catch: Exception -> L14
    L18:
        AbstractC0295Gu.m625r(-316251326904373L);     // Catch: Exception -> L14
        AbstractC0295Gu.m625r(-316320046381109L);     // Catch: Exception -> L14
        AbstractC0295Gu.m625r(-314760973252661L);     // Catch: Exception -> L14
        r7.push(r0);     // Catch: Exception -> L14
        return 1;
    L11:
        if (r22.moveToFirst() != true) goto L16;
        int r3 = r22.getInt(r22.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-316573449451573L)));     // Catch: Exception -> L14
        r22.close();     // Catch: Exception -> L14
        r7.push(Double.valueOf(r3));     // Catch: Exception -> L14
        AbstractC0295Gu.m625r(-316624989059125L);     // Catch: Exception -> L14
        AbstractC0295Gu.m625r(-316143952721973L);     // Catch: Exception -> L14
        AbstractC0295Gu.m625r(-316234147035189L);     // Catch: Exception -> L14
        return 1;
    L14:
        e = move-exception;
        AbstractC0295Gu.m625r(-314898412206133L);
        AbstractC0213Ey.m411i(-314967131682869L, -314507570182197L, e);
        r7.push(r0);
        return 1;
    }

    private static final int register$lambda$25(Lua r4) {
        AbstractC0295Gu.m625r(-314524750051381L);
        String r1 = r4.toString(1);
        if (r1 != null) goto L5;
    L23:
        r4.push(AbstractC0295Gu.m625r(-314533339985973L));
        return 1;
    L5:
        if (r1.length() == 0) goto L23;
        Cursor r12 = AbstractC0671Pj.m1357w(AbstractC0295Gu.m625r(-314537634953269L), new String[]{r1});     // Catch: Exception -> L21
        if (r12 != null) goto L11;
    L17:
        if (r12 == null) goto L19;
        r12.close();     // Catch: Exception -> L21
    L19:
        r4.push(AbstractC0295Gu.m625r(-315340793837621L));     // Catch: Exception -> L21
        return 1;
    L11:
        if (r12.moveToFirst() != true) goto L17;
        String r2 = r12.getString(r12.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-315297844164661L)));     // Catch: Exception -> L21
        if (r2 != null) goto L15;
        r2 = AbstractC0295Gu.m625r(-315336498870325L);     // Catch: Exception -> L21
    L15:
        r12.close();     // Catch: Exception -> L21
        r4.push(r2);     // Catch: Exception -> L21
        return 1;
    L21:
        AbstractC0295Gu.m625r(-315345088804917L);
        AbstractC0295Gu.m625r(-315413808281653L);
        r4.push(AbstractC0295Gu.m625r(-315508297562165L));
        return 1;
    }

    private static final int register$lambda$26(Lua r4) {
        AbstractC0295Gu.m625r(-315512592529461L);
        String r1 = r4.toString(1);
        if (r1 != null) goto L5;
    L23:
        r4.push(AbstractC0295Gu.m625r(-315521182464053L));
        return 1;
    L5:
        if (r1.length() == 0) goto L23;
        Cursor r12 = AbstractC0671Pj.m1357w(AbstractC0295Gu.m625r(-315525477431349L), new String[]{r1});     // Catch: Exception -> L21
        if (r12 != null) goto L11;
    L17:
        if (r12 == null) goto L19;
        r12.close();     // Catch: Exception -> L21
    L19:
        r4.push(AbstractC0295Gu.m625r(-315237714622517L));     // Catch: Exception -> L21
        return 1;
    L11:
        if (r12.moveToFirst() != true) goto L17;
        String r2 = r12.getString(r12.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-315190469982261L)));     // Catch: Exception -> L21
        if (r2 != null) goto L15;
        r2 = AbstractC0295Gu.m625r(-315233419655221L);     // Catch: Exception -> L21
    L15:
        r12.close();     // Catch: Exception -> L21
        r4.push(r2);     // Catch: Exception -> L21
        return 1;
    L21:
        AbstractC0295Gu.m625r(-315242009589813L);
        AbstractC0295Gu.m625r(-313661461624885L);
        r4.push(AbstractC0295Gu.m625r(-313747360970805L));
        return 1;
    }

    private static final int register$lambda$28(Lua r5) {
        AbstractC0295Gu.m625r(-313751655938101L);
        String r1 = r5.toString(1);
        if (r1 != null) goto L5;
    L29:
        r5.push(AbstractC0295Gu.m625r(-313760245872693L));
        return 1;
    L5:
        if (r1.length() == 0) goto L29;
        Cursor r12 = AbstractC0671Pj.m1357w(AbstractC0295Gu.m625r(-313764540839989L), new String[]{r1});     // Catch: Exception -> L27
        if (r12 != null) goto L11;
    L23:
        if (r12 == null) goto L25;
        r12.close();     // Catch: Exception -> L27
    L25:
        r5.push(AbstractC0295Gu.m625r(-313562677377077L));     // Catch: Exception -> L27
        return 1;
    L11:
        if (r12.moveToFirst() != true) goto L23;
        String r2 = r12.getString(r12.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-313472483063861L)));     // Catch: Exception -> L27
        if (r2 != null) goto L15;
        r2 = AbstractC0295Gu.m625r(-313515432736821L);     // Catch: Exception -> L27
    L15:
        String r3 = r12.getString(r12.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-313519727704117L)));     // Catch: Exception -> L27
        if (r3 != null) goto L18;
        r3 = AbstractC0295Gu.m625r(-313558382409781L);     // Catch: Exception -> L27
    L18:
        r12.close();     // Catch: Exception -> L27
        if (r2.length() != 0) goto L21;
        r2 = r3;
    L21:
        r5.push(r2);     // Catch: Exception -> L27
        return 1;
    L27:
        AbstractC0295Gu.m625r(-313566972344373L);
        AbstractC0295Gu.m625r(-313635691821109L);
        r5.push(AbstractC0295Gu.m625r(-314292821817397L));
        return 1;
    }

    private static final int register$lambda$29(Lua r6) {
        AbstractC0295Gu.m625r(-314297116784693L);
        if (r6.getTop() < 1) goto L5;
        String r0 = r6.toString(1);
    L6:
        if (r0 != null) goto L20;
    L16:
        r6.push(C1456gf.m2790H(), Lua.Conversion.SEMI);     // Catch: Exception -> L18
        return 1;
    L20:
    L18:
        AbstractC0213Ey.m412j(-314305706719285L, -314374426196021L, r6);
        return 1;
    L8:
        if (r0.length() == 0) goto L16;
        Drawable r02 = C1456gf.m2785C(r0);     // Catch: Exception -> L18
        if (r02 == null) goto L14;
        r6.push(r02, Lua.Conversion.SEMI);     // Catch: Exception -> L18
        return 1;
    L14:
        r6.pushNil();     // Catch: Exception -> L18
        return 1;
    L5:
        r0 = null;
        goto L6
    }

    private static final int register$lambda$30(Lua r4) {
        AbstractC0295Gu.m625r(-314443145672757L);
        String r1 = r4.toString(1);
        if (r1 != null) goto L5;
        r1 = AbstractC0295Gu.m625r(-314451735607349L);
    L5:
        r4.push(AbstractC0085Bz.m132J(r1, false, AbstractC0295Gu.m625r(-314456030574645L)));
        return 1;
    }

    private static final int register$lambda$31(Lua r4) {
        AbstractC0295Gu.m625r(-313949224433717L);
        String r1 = r4.toString(1);
        if (r1 != null) goto L5;
        r1 = AbstractC0295Gu.m625r(-313957814368309L);
    L5:
        r4.push(r1.startsWith(AbstractC0295Gu.m625r(-313962109335605L)));
        return 1;
    }

    private static final int register$lambda$6(Lua r10) {
        AbstractC0295Gu.m625r(-302674935281717L);
        C1214bG r1 = (C1214bG) AbstractC1257cG.f4258a.get(AbstractC0295Gu.m625r(-587212223674421L));     // Catch: Exception -> L34
        if (r1 == null) goto L6;
        Object r12 = r1.f4146a;     // Catch: Exception -> L34
    L8:
        if ((r12 instanceof Method) == false) goto L10;
        Method r13 = (Method) r12;     // Catch: Exception -> L34
    L11:
        Object r14 = r13.invoke(null, null);     // Catch: Exception -> L34
        AbstractC0295Gu.m625r(-837707601279029L);     // Catch: Exception -> L34
        Set r2 = AbstractC0513Lx.m997B(new String[]{AbstractC0295Gu.m625r(-302683525216309L), AbstractC0295Gu.m625r(-302713589987381L), AbstractC0295Gu.m625r(-302760834627637L), AbstractC0295Gu.m625r(-302790899398709L), AbstractC0295Gu.m625r(-302803784300597L), AbstractC0295Gu.m625r(-302829554104373L)});     // Catch: Exception -> L34
        LinkedHashMap r3 = new LinkedHashMap();     // Catch: Exception -> L34
        Iterator r15 = ((HashMap) r14).entrySet().iterator();     // Catch: Exception -> L34
    L13:
        if (r15.hasNext() == false) goto L26;
        Map.Entry r4 = (Map.Entry) r15.next();     // Catch: Exception -> L34
        Object r5 = r4.getKey();     // Catch: Exception -> L34
        if ((r5 instanceof String) == false) goto L13;
        if (r2.isEmpty() == true) goto L25;
        Iterator r6 = r2.iterator();     // Catch: Exception -> L34
    L21:
        if (r6.hasNext() == false) goto L25;
        if (((String) r5).equalsIgnoreCase((String) r6.next()) == false) goto L21;
    L25:
        r3.put(r4.getKey(), r4.getValue());     // Catch: Exception -> L34
        goto L13
    L26:
        r10.createTable(0, r3.size());     // Catch: Exception -> L34
        Iterator r16 = r3.entrySet().iterator();     // Catch: Exception -> L34
    L27:
        if (r16.hasNext() == false) goto L56;
        Map.Entry r22 = (Map.Entry) r16.next();     // Catch: Exception -> L34
        Object r32 = r22.getKey();     // Catch: Exception -> L34
        Object r23 = r22.getValue();     // Catch: Exception -> L34
        if ((r32 instanceof String) == false) goto L27;
        if (r23 == null) goto L27;
        r10.push(r23.toString());     // Catch: Exception -> L34
        r10.setField(-2, (String) r32);     // Catch: Exception -> L34
        goto L27
    L56:
        return 1;
    L10:
        r13 = null;
        goto L11
    L6:
        r12 = null;
    L34:
        AbstractC0295Gu.m625r(-302872503777333L);
        AbstractC0295Gu.m625r(-302391467440181L);
        r10.createTable(0, 0);
        return 1;
    }

    private static final int register$lambda$7(Lua r4) {
        AbstractC0295Gu.m625r(-302468776851509L);
        Object r0 = MainApplication.f5549a;     // Catch: Exception -> L12
        if (r0 != null) goto L10;
        r0 = C1456gf.f5172p;     // Catch: Exception -> L12
        if (r0 != null) goto L10;
        r0 = AndroidAppHelper.currentApplication();     // Catch: Exception -> L12
        AbstractC0295Gu.m625r(-836852902787125L);     // Catch: Exception -> L12
    L10:
        r4.push(r0, Lua.Conversion.SEMI);     // Catch: Exception -> L12
        return 1;
    L12:
        AbstractC0213Ey.m412j(-302477366786101L, -302546086262837L, r4);
        return 1;
    }

    private static final int register$lambda$8(Lua r4) {
        AbstractC0295Gu.m625r(-302619100706869L);
        int r0 = AbstractC1450gG.f5067a;     // Catch: Exception -> L5
        r4.push(AbstractC1450gG.f5069c, Lua.Conversion.SEMI);     // Catch: Exception -> L5
        return 1;
    L5:
        AbstractC0213Ey.m412j(-302627690641461L, -303246165932085L, r4);
        return 1;
    }

    private static final int register$lambda$9(Lua r4) {
        AbstractC0295Gu.m625r(-303336360245301L);
        WeakReference r0 = C1456gf.f5173q;     // Catch: Exception -> L11
        if (r0 == null) goto L6;
        Activity r02 = (Activity) r0.get();     // Catch: Exception -> L11
    L7:
        if (r02 == null) goto L9;
        r4.push(r02, Lua.Conversion.SEMI);     // Catch: Exception -> L11
        return 1;
    L9:
        r4.pushNil();     // Catch: Exception -> L11
        return 1;
    L6:
        r02 = null;
    L11:
        AbstractC0213Ey.m412j(-303344950179893L, -303413669656629L, r4);
        return 1;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ int m3362s(Lua r0) {
        return register$lambda$12(r0);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ int m3363t(Lua r0) {
        return register$lambda$11(r0);
    }

    public final void register(Lua r5) {
        AbstractC0295Gu.m625r(-304757994420277L);
        r5.createTable(0, 25);
        r5.push(new C0954W8(25));
        r5.setField(-2, AbstractC0295Gu.m625r(-304775174289461L));
        r5.push(new C0954W8(27));
        r5.setField(-2, AbstractC0295Gu.m625r(-304809534027829L));
        r5.push(new C0954W8(28));
        r5.setField(-2, AbstractC0295Gu.m625r(-305406534481973L));
        r5.push(new C0954W8(29));
        r5.setField(-2, AbstractC0295Gu.m625r(-305458074089525L));
        r5.push(new C1207b9(0));
        r5.setField(-2, AbstractC0295Gu.m625r(-305509613697077L));
        r5.push(new C1207b9(1));
        r5.setField(-2, AbstractC0295Gu.m625r(-305556858337333L));
        r5.push(new C1207b9(2));
        r5.setField(-2, AbstractC0295Gu.m625r(-305621282846773L));
        r5.push(new C1207b9(3));
        r5.setField(-2, AbstractC0295Gu.m625r(-305123066640437L));
        r5.push(new C1207b9(4));
        r5.setField(-2, AbstractC0295Gu.m625r(-305187491149877L));
        r5.push(new C1207b9(5));
        r5.setField(-2, AbstractC0295Gu.m625r(-305234735790133L));
        r5.push(new C1207b9(6));
        r5.setField(-2, AbstractC0295Gu.m625r(-305299160299573L));
        r5.push(new C1207b9(7));
        r5.setField(-2, AbstractC0295Gu.m625r(-305342109972533L));
        r5.push(new C1207b9(8));
        r5.setField(-2, AbstractC0295Gu.m625r(-303744382138421L));
        r5.push(new C1207b9(9));
        r5.setField(-2, AbstractC0295Gu.m625r(-303813101615157L));
        r5.push(new C1207b9(10));
        r5.setField(-2, AbstractC0295Gu.m625r(-303899000961077L));
        r5.push(new C1207b9(11));
        r5.setField(-2, AbstractC0295Gu.m625r(-303967720437813L));
        r5.push(new C1207b9(12));
        r5.setField(-2, AbstractC0295Gu.m625r(-303478094166069L));
        r5.push(new C1207b9(13));
        r5.setField(-2, AbstractC0295Gu.m625r(-303559698544693L));
        r5.push(new C1207b9(14));
        r5.setField(-2, AbstractC0295Gu.m625r(-303602648217653L));
        r5.push(new C0954W8(26));
        r5.setField(-2, AbstractC0295Gu.m625r(-303637007956021L));
        AbstractC0295Gu.m625r(-303684252596277L);
        AbstractC0295Gu.m625r(-304302727886901L);
    }
}
