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
    public static final CherryGlobalAPI INSTANCE = null;
    private static final String TAG = null;
    private static volatile Activity currentActivity;
    private static volatile Context currentContext;
    private static final Handler mainHandler = null;
    private static volatile InterfaceC1416fj printListener;

    static {
        TAG = AbstractC0295Gu.m625r(-548381424351285L);
        INSTANCE = new CherryGlobalAPI();
        mainHandler = new Handler(Looper.getMainLooper());
    }

    private CherryGlobalAPI() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m3090a(Lua r0, int r1) {
        register$lambda$27$lambda$26(r0, r1);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m3091b(Lua r0) {
        return register$lambda$27(r0);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m3092c(Lua r0) {
        return register$lambda$18(r0);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m3093d(Lua r0) {
        return register$lambda$15(r0);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int m3094e(Lua r0) {
        return register$lambda$1(r0);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m3095f(Lua r0) {
        return register$lambda$3(r0);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ int m3096g(Lua r0) {
        return register$lambda$10(r0);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ C0829TC m3097h(int r0, String r1) {
        return register$lambda$17$lambda$16(r1, r0);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ int m3098i(Lua r0) {
        return register$lambda$23(r0);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ C0829TC m3099j(Lua r0, int r1) {
        return register$lambda$27$lambda$26$lambda$25(r0, r1);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ int m3100k(Lua r0) {
        return register$lambda$19(r0);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ C0829TC m3101l(Lua r0, int r1) {
        return register$lambda$27$lambda$26$lambda$25$lambda$24(r0, r1);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ int m3102m(Lua r0) {
        return register$lambda$28(r0);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ int m3103n(Lua r0) {
        return register$lambda$20(r0);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ int m3104o(Lua r0) {
        return register$lambda$7(r0);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ C0829TC m3105p(Lua r0, int r1) {
        return register$lambda$23$lambda$22(r0, r1);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ int m3106q(Lua r0) {
        return register$lambda$6(r0);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ int m3107r(Lua r0) {
        return register$lambda$8(r0);
    }

    private static final int register$lambda$1(Lua r9) {
        AbstractC0295Gu.m625r(-549532475586613L);
        C0286Gl r0 = new C0286Gl(1, r9.getTop(), 1);
        ArrayList r3 = new ArrayList(AbstractC2539ta.m5019d0(r0, 10));
        Iterator r02 = r0.iterator();
    L3:
        C0200El r1 = (C0200El) r02;
        if (r1.f605c == false) goto L11;
        Object r12 = r9.toObject(r1.nextInt());
        if (r12 == null) goto L9;
        String r13 = r12.toString();
        if (r13 == null) goto L9;
    L10:
        r3.add(r13);
    L9:
        r13 = AbstractC0295Gu.m625r(-549541065521205L);
        goto L10
    L11:
        String r92 = AbstractC2453ra.m4901k0(r3, AbstractC0295Gu.m625r(-549558245390389L), null, null, null, 62);
        LogInterceptor.INSTANCE.print(r92);
        InterfaceC1416fj r03 = printListener;
        if (r03 == null) goto L19;
        r03.mo90g(r92);
        return 0;
    L19:
        return 0;
    }

    private static final int register$lambda$10(Lua r6) {
        AbstractC0295Gu.m625r(-547939042719797L);
        int r0 = 1;
        String r1 = r6.toString(1);
        if (r1 != null) goto L6;
        r1 = AbstractC0295Gu.m625r(-547947632654389L);
    L6:
        if (r6.getTop() > 1) goto L8;
    L10:
        r0 = 0;
    L11:
        INSTANCE.runOnUiThread(new C2308o8(r1, r0, 1));
        return 0;
    L8:
        if (((int) r6.toNumber(2)) <= 0) goto L10;
        goto L10
    }

    private static final C0829TC register$lambda$10$lambda$9(String r1, int r2) {
        Context r0 = currentActivity;
        if (r0 != null) goto L6;
        r0 = currentContext;
    L6:
        if (r0 == null) goto L9;
        Toast.makeText(r0, r1, r2).show();
    L9:
        return C0829TC.f2620a;
    }

    private static final int register$lambda$15(Lua r10) {
        AbstractC0295Gu.m625r(-548033532000309L);
        Object r1 = r10.toObject(1);
        StringBuilder r2 = new StringBuilder();
        r2.append(AbstractC0295Gu.m625r(-548042121934901L));
        r2.append('\n');
        String r4 = AbstractC0295Gu.m625r(-548097956509749L);
        if (r1 == null) goto L5;
        String r5 = r1.getClass().getName();
    L6:
        r2.append(r4.concat(r5));
        r2.append('\n');
        if (r1 == null) goto L25;
        r2.append(AbstractC0295Gu.m625r(-547595445336117L) + r1);
        r2.append('\n');
        if ((r1 instanceof String) == true) goto L25;
        if ((r1 instanceof Number) == true) goto L25;
        if ((r1 instanceof Boolean) == true) goto L25;
        r2.append(AbstractC0295Gu.m625r(-547629805074485L));
        r2.append('\n');
        Field[] r42 = r1.getClass().getDeclaredFields();
        AbstractC0295Gu.m625r(-547664164812853L);
        Iterator r43 = AbstractC0650P4.m1315J(r42, 15).iterator();
    L16:
        if (r43.hasNext() == false) goto L21;
        Field r52 = (Field) r43.next();
        r52.setAccessible(true);
        r2.append(AbstractC0295Gu.m625r(-547762949060661L) + r52.getName() + AbstractC0295Gu.m625r(-547775833962549L) + r52.get(r1));     // Catch: Exception -> L20
        r2.append('\n');     // Catch: Exception -> L20
    L20:
        r2.append(AbstractC0295Gu.m625r(-547788718864437L) + r52.getName() + AbstractC0295Gu.m625r(-547801603766325L));
        r2.append('\n');
        goto L16
    L21:
        r2.append(AbstractC0295Gu.m625r(-548394309253173L));
        r2.append('\n');
        Method[] r12 = r1.getClass().getDeclaredMethods();
        AbstractC0295Gu.m625r(-548432963958837L);
        Iterator r13 = AbstractC0650P4.m1315J(r12, 10).iterator();
    L23:
        if (r13.hasNext() == false) goto L25;
        Method r44 = (Method) r13.next();
        StringBuilder r53 = new StringBuilder();
        r53.append(AbstractC0295Gu.m625r(-548536043173941L));
        r53.append(r44.getName());
        r53.append('(');
        Class<?>[] r45 = r44.getParameterTypes();
        AbstractC0295Gu.m625r(-548548928075829L);
        r53.append(AbstractC0650P4.m1314I(r45, new C0223F7(15), 31));
        r53.append(')');
        r2.append(r53.toString());
        r2.append('\n');
    L25:
        r2.append(AbstractC0295Gu.m625r(-548647712323637L));
        r2.append('\n');
        String r14 = r2.toString();
        LogInterceptor.INSTANCE.m3526d(AbstractC0295Gu.m625r(-548153791084597L), r14);
        InterfaceC1416fj r22 = printListener;
        if (r22 == null) goto L28;
        r22.mo90g(r14);
    L28:
        r10.push(r14);
        return 1;
    L5:
        r5 = AbstractC0295Gu.m625r(-547578265466933L);
        goto L6
    }

    private static final CharSequence register$lambda$15$lambda$14$lambda$13$lambda$12(Class r2) {
        String r22 = r2.getSimpleName();
        AbstractC0295Gu.m625r(-547951927621685L);
        return r22;
    }

    private static final int register$lambda$17(Lua r6) {
        AbstractC0295Gu.m625r(-548188150822965L);
        int r0 = 1;
        String r1 = r6.toString(1);
        if (r1 != null) goto L6;
        r1 = AbstractC0295Gu.m625r(-548196740757557L);
    L6:
        if (r6.getTop() > 1) goto L8;
    L10:
        r0 = 0;
    L11:
        INSTANCE.runOnUiThread(new C2308o8(r1, r0, 2));
        return 0;
    L8:
        if (((int) r6.toNumber(2)) <= 0) goto L10;
        goto L10
    }

    private static final C0829TC register$lambda$17$lambda$16(String r1, int r2) {
        Context r0 = currentActivity;
        if (r0 != null) goto L6;
        r0 = currentContext;
    L6:
        if (r0 == null) goto L9;
        Toast.makeText(r0, r1, r2).show();
    L9:
        return C0829TC.f2620a;
    }

    private static final int register$lambda$18(Lua r5) {
        AbstractC0295Gu.m625r(-548201035724853L);
        if (r5.getTop() != 1) goto L8;
        LogInterceptor r0 = LogInterceptor.INSTANCE;
        String r2 = AbstractC0295Gu.m625r(-548209625659445L);
        String r52 = r5.toString(1);
        if (r52 != null) goto L7;
        r52 = AbstractC0295Gu.m625r(-548252575332405L);
    L7:
        r0.m3526d(r2, r52);
        return 0;
    L8:
        String r02 = r5.toString(1);
        if (r02 != null) goto L11;
        r02 = AbstractC0295Gu.m625r(-548269755201589L);
    L11:
        String r53 = r5.toString(2);
        if (r53 != null) goto L14;
        r53 = AbstractC0295Gu.m625r(-548312704874549L);
    L14:
        LogInterceptor.INSTANCE.m3526d(r02, r53);
        return 0;
    }

    private static final int register$lambda$19(Lua r4) {
        AbstractC0295Gu.m625r(-548329884743733L);
        long r0 = (long) r4.toNumber(1);
        if (r0 <= 0) goto L7;
        Thread.sleep(r0);
        return 0;
    L7:
        return 0;
    }

    private static final int register$lambda$20(Lua r2) {
        AbstractC0295Gu.m625r(-548338474678325L);
        r2.push(Double.valueOf(System.currentTimeMillis()));
        return 1;
    }

    private static final int register$lambda$23(Lua r5) {
        AbstractC0295Gu.m625r(-548347064612917L);
        if (r5.isFunction(1) == true) goto L5;
        return 0;
    L5:
        r5.pushValue(1);
        int r0 = r5.ref();
        INSTANCE.runOnUiThread(new C2087j8(r5, r0, 11));
        return 0;
    }

    private static final C0829TC register$lambda$23$lambda$22(Lua r3, int r4) {
        LuaLocks.INSTANCE.withLock(r3, new C2087j8(r3, r4, 12));
        return C0829TC.f2620a;
    }

    private static final C0829TC register$lambda$23$lambda$22$lambda$21(Lua r1, int r2) {
        r1.refGet(r2);     // Catch: Throwable -> L5
        r1.pCall(0, 0);     // Catch: Throwable -> L5
        r1.unref(r2);
        return C0829TC.f2620a;
    L5:
        th = move-exception;
        r1.unref(r2);
        throw th;
    }

    private static final int register$lambda$27(Lua r7) {
        AbstractC0295Gu.m625r(-548355654547509L);
        long r0 = (long) r7.toNumber(1);
        if (r7.isFunction(2) == true) goto L5;
        return 0;
    L5:
        r7.pushValue(2);
        int r2 = r7.ref();
        mainHandler.postDelayed(new RunnableC2222m8(r7, r2, 2), r0);
        return 0;
    }

    private static final void register$lambda$27$lambda$26(Lua r3, int r4) {
        LuaUiScheduler.INSTANCE.runOnUiThread(new C2087j8(r3, r4, 10));
    }

    private static final C0829TC register$lambda$27$lambda$26$lambda$25(Lua r3, int r4) {
        LuaLocks.INSTANCE.withLock(r3, new C2087j8(r3, r4, 9));
        return C0829TC.f2620a;
    }

    private static final C0829TC register$lambda$27$lambda$26$lambda$25$lambda$24(Lua r1, int r2) {
        r1.refGet(r2);     // Catch: Throwable -> L5
        r1.pCall(0, 0);     // Catch: Throwable -> L5
        r1.unref(r2);
        return C0829TC.f2620a;
    L5:
        th = move-exception;
        r1.unref(r2);
        throw th;
    }

    private static final int register$lambda$28(Lua r2) {
        AbstractC0295Gu.m625r(-548364244482101L);
        Object r0 = currentActivity;
        if (r0 != null) goto L6;
        r0 = currentContext;
    L6:
        if (r0 == null) goto L8;
        r2.push(r0, Lua.Conversion.SEMI);
        return 1;
    L8:
        r2.pushNil();
        return 1;
    }

    private static final int register$lambda$29(Lua r2) {
        AbstractC0295Gu.m625r(-548372834416693L);
        if (currentActivity == null) goto L5;
        r2.push(currentActivity, Lua.Conversion.SEMI);
        return 1;
    L5:
        r2.pushNil();
        return 1;
    }

    private static final int register$lambda$3(Lua r8) {
        AbstractC0295Gu.m625r(-549566835324981L);
        if (r8.getTop() >= 1) goto L5;
        return 0;
    L5:
        String r0 = r8.toString(1);
        if (r0 != null) goto L8;
        return 0;
    L8:
        C0286Gl r3 = new C0286Gl(2, r8.getTop(), 1);
        ArrayList r2 = new ArrayList(AbstractC2539ta.m5019d0(r3, 10));
        Iterator r32 = r3.iterator();
    L10:
        if (r32.hasNext() == false) goto L12;
        r2.add(r8.toObject(((C0200El) r32).nextInt()));
        goto L10
    L12:
        Object[] r82 = r2.toArray(new Object[0]);
        Object[] r83 = Arrays.copyOf(r82, r82.length);     // Catch: Exception -> L17
        String r84 = String.format(r0, Arrays.copyOf(r83, r83.length));     // Catch: Exception -> L17
        AbstractC0295Gu.m625r(-549575425259573L);     // Catch: Exception -> L17
        LogInterceptor.INSTANCE.print(r84);     // Catch: Exception -> L17
        InterfaceC1416fj r02 = printListener;     // Catch: Exception -> L17
        if (r02 == null) goto L19;
        r02.mo90g(r84);     // Catch: Exception -> L17
    L19:
        return 0;
    L17:
        e = move-exception;
        LogInterceptor.e$default(LogInterceptor.INSTANCE, AbstractC0295Gu.m625r(-549626964867125L), AbstractC0213Ey.m405c(-549669914540085L, new StringBuilder(), e), null, 4, null);
        goto L19
    }

    private static final int register$lambda$4(Lua r5) {
        AbstractC0295Gu.m625r(-549734339049525L);
        if (r5.getTop() != 1) goto L8;
        LogInterceptor r0 = LogInterceptor.INSTANCE;
        String r2 = AbstractC0295Gu.m625r(-549742928984117L);
        String r52 = r5.toString(1);
        if (r52 != null) goto L7;
        r52 = AbstractC0295Gu.m625r(-549236122843189L);
    L7:
        r0.m3526d(r2, r52);
        return 0;
    L8:
        String r02 = r5.toString(1);
        if (r02 != null) goto L11;
        r02 = AbstractC0295Gu.m625r(-549253302712373L);
    L11:
        String r53 = r5.toString(2);
        if (r53 != null) goto L14;
        r53 = AbstractC0295Gu.m625r(-549296252385333L);
    L14:
        LogInterceptor.INSTANCE.m3526d(r02, r53);
        return 0;
    }

    private static final int register$lambda$5(Lua r3) {
        AbstractC0295Gu.m625r(-549313432254517L);
        String r32 = r3.toString(1);
        if (r32 != null) goto L5;
        r32 = AbstractC0295Gu.m625r(-549322022189109L);
    L5:
        LogInterceptor.INSTANCE.m3526d(AbstractC0295Gu.m625r(-549339202058293L), r32);
        return 0;
    }

    private static final int register$lambda$6(Lua r3) {
        AbstractC0295Gu.m625r(-549382151731253L);
        String r32 = r3.toString(1);
        if (r32 != null) goto L5;
        r32 = AbstractC0295Gu.m625r(-549390741665845L);
    L5:
        LogInterceptor.INSTANCE.m3528i(AbstractC0295Gu.m625r(-549407921535029L), r32);
        return 0;
    }

    private static final int register$lambda$7(Lua r3) {
        AbstractC0295Gu.m625r(-549450871207989L);
        String r32 = r3.toString(1);
        if (r32 != null) goto L5;
        r32 = AbstractC0295Gu.m625r(-549459461142581L);
    L5:
        LogInterceptor.INSTANCE.m3530w(AbstractC0295Gu.m625r(-549476641011765L), r32);
        return 0;
    }

    private static final int register$lambda$8(Lua r6) {
        AbstractC0295Gu.m625r(-547870323243061L);
        String r62 = r6.toString(1);
        if (r62 != null) goto L5;
        r62 = AbstractC0295Gu.m625r(-547878913177653L);
    L5:
        LogInterceptor r0 = LogInterceptor.INSTANCE;
        String r1 = AbstractC0295Gu.m625r(-547896093046837L);
        LogInterceptor.e$default(r0, r1, r62, null, 4, null);
        return 0;
    }

    private final void runOnUiThread(InterfaceC0884Ui r2) {
        LuaUiScheduler.INSTANCE.runOnUiThread(r2);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ int m3108s(Lua r0) {
        return register$lambda$29(r0);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ int m3109t(Lua r0) {
        return register$lambda$4(r0);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ int m3110u(Lua r0) {
        return register$lambda$5(r0);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ C0829TC m3111v(Lua r0, int r1) {
        return register$lambda$23$lambda$22$lambda$21(r0, r1);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ CharSequence m3112w(Class r0) {
        return register$lambda$15$lambda$14$lambda$13$lambda$12(r0);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ int m3113x(Lua r0) {
        return register$lambda$17(r0);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ C0829TC m3114y(int r0, String r1) {
        return register$lambda$10$lambda$9(r1, r0);
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

    public final void register(Lua r5) {
        AbstractC0295Gu.m625r(-550443008653365L);
        r5.push(new C2617v8(3));
        r5.setGlobal(AbstractC0295Gu.m625r(-550460188522549L));
        r5.push(new C2574u8(24));
        r5.setGlobal(AbstractC0295Gu.m625r(-550485958326325L));
        r5.push(new C2574u8(25));
        r5.setGlobal(AbstractC0295Gu.m625r(-550516023097397L));
        r5.push(new C2574u8(26));
        r5.setGlobal(AbstractC0295Gu.m625r(-550533202966581L));
        r5.push(new C2574u8(27));
        r5.setGlobal(AbstractC0295Gu.m625r(-550554677803061L));
        r5.push(new C2574u8(28));
        r5.setGlobal(AbstractC0295Gu.m625r(-550576152639541L));
        r5.push(new C2574u8(29));
        r5.setGlobal(AbstractC0295Gu.m625r(-548948360034357L));
        r5.push(new C2617v8(0));
        r5.setGlobal(AbstractC0295Gu.m625r(-548969834870837L));
        r5.push(new C2617v8(1));
        r5.setGlobal(AbstractC0295Gu.m625r(-548995604674613L));
        r5.getGlobal(AbstractC0295Gu.m625r(-549017079511093L));
        if (r5.isNil(-1) == true) goto L5;
        r5.push(new C2617v8(2));
        r5.setField(-2, AbstractC0295Gu.m625r(-549047144282165L));
        r5.push(new C2617v8(4));
        r5.setField(-2, AbstractC0295Gu.m625r(-549072914085941L));
        r5.push(new C2617v8(5));
        r5.setField(-2, AbstractC0295Gu.m625r(-549090093955125L));
        r5.push(new C2617v8(6));
        r5.setField(-2, AbstractC0295Gu.m625r(-549115863758901L));
        r5.push(new C2574u8(20));
        r5.setField(-2, AbstractC0295Gu.m625r(-549137338595381L));
        r5.push(new C2574u8(21));
        r5.setField(-2, AbstractC0295Gu.m625r(-549197468137525L));
        r5.push(new C2574u8(22));
        r5.setField(-2, AbstractC0295Gu.m625r(-548699251931189L));
        r5.push(new C2574u8(23));
        r5.setField(-2, AbstractC0295Gu.m625r(-548746496571445L));
    L5:
        r5.pop(1);
        AbstractC0295Gu.m625r(-548798036178997L);
        AbstractC0295Gu.m625r(-548866755655733L);
    }

    public final void setCurrentActivity(Activity r1) {
        currentActivity = r1;
    }

    public final void setCurrentContext(Context r1) {
        currentContext = r1;
    }

    public final void setPrintListener(InterfaceC1416fj r1) {
        printListener = r1;
    }
}
