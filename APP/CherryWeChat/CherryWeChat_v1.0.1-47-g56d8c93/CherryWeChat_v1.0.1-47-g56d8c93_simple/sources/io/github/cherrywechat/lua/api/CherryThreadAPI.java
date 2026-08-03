package io.github.cherrywechat.lua.api;

import android.os.Handler;
import android.os.Looper;
import io.github.cherrywechat.lua.LuaLocks;
import io.github.cherrywechat.lua.LuaUiScheduler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p000.AbstractC0213Ey;
import p000.AbstractC0295Gu;
import p000.AbstractC0585Nj;
import p000.AbstractC2453ra;
import p000.AbstractC2496sa;
import p000.C0353I8;
import p000.C0396J8;
import p000.C0693Q4;
import p000.C0829TC;
import p000.C2087j8;
import p000.C2789z8;
import p000.InterfaceC0884Ui;
import p000.RunnableC0310H8;
import p000.RunnableC0562N2;
import p000.RunnableC2222m8;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
public final class CherryThreadAPI {
    public static final CherryThreadAPI INSTANCE = null;
    private static final String TAG = null;
    private static final ExecutorService executor = null;
    private static final Handler mainHandler = null;
    private static final ScheduledExecutorService scheduledExecutor = null;
    private static final ConcurrentHashMap<String, ScheduledFuture<?>> scheduledTasks = null;
    private static final AtomicLong taskCounter = null;
    private static final ConcurrentHashMap<String, LuaTaskRef> taskRefs = null;

    public static final class LuaTaskRef {
        private final Lua lua;
        private final int ref;

        public LuaTaskRef(Lua r3, int r4) {
            AbstractC0295Gu.m625r(-534104953059381L);
            this.lua = r3;
            this.ref = r4;
        }

        public static /* synthetic */ LuaTaskRef copy$default(LuaTaskRef r0, Lua r1, int r2, int r3, Object r4) {
            if ((r3 & 1) == 0) goto L6;
            r1 = r0.lua;
        L6:
            if ((r3 & 2) == 0) goto L9;
            r2 = r0.ref;
        L9:
            return r0.copy(r1, r2);
        }

        public final Lua component1() {
            return this.lua;
        }

        public final int component2() {
            return this.ref;
        }

        public final LuaTaskRef copy(Lua r3, int r4) {
            AbstractC0295Gu.m625r(-534122132928565L);
            return new LuaTaskRef(r3, r4);
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof LuaTaskRef) == true) goto L8;
            return false;
        L8:
            LuaTaskRef r52 = (LuaTaskRef) r5;
            if (AbstractC0585Nj.m1134a(this.lua, r52.lua) == true) goto L12;
            return false;
        L12:
            if (this.ref == r52.ref) goto L14;
            return false;
        L14:
            return true;
        }

        public final Lua getLua() {
            return this.lua;
        }

        public final int getRef() {
            return this.ref;
        }

        public int hashCode() {
            int r0 = this.lua.hashCode() * 31;
            return Integer.hashCode(this.ref) + r0;
        }

        public String toString() {
            StringBuilder r0 = new StringBuilder();
            r0.append(AbstractC0295Gu.m625r(-534139312797749L));
            r0.append(this.lua);
            r0.append(AbstractC0295Gu.m625r(-534208032274485L));
            return AbstractC0213Ey.m408f(r0, this.ref, ')');
        }
    }

    static {
        TAG = AbstractC0295Gu.m625r(-532142153005109L);
        INSTANCE = new CherryThreadAPI();
        mainHandler = new Handler(Looper.getMainLooper());
        executor = Executors.newCachedThreadPool();
        ScheduledExecutorService r0 = Executors.newScheduledThreadPool(2);
        AbstractC0295Gu.m625r(-531661116667957L);
        scheduledExecutor = r0;
        scheduledTasks = new ConcurrentHashMap();
        taskRefs = new ConcurrentHashMap();
        taskCounter = new AtomicLong(0);
    }

    private CherryThreadAPI() {
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ C0829TC m3173A(Lua r0, int r1, Object r2) {
        return register$lambda$15$lambda$14$lambda$10$lambda$9(r0, r1, r2);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m3174B(Lua r0, int r1) {
        register$lambda$19$lambda$18(r0, r1);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ C0829TC m3175C(Lua r0, int r1) {
        return register$lambda$19$lambda$18$lambda$17(r0, r1);
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ int m3176D(Lua r0) {
        return register$lambda$23(r0);
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ C0829TC m3177E(LuaTaskRef r0) {
        return register$lambda$23$lambda$22$lambda$21$lambda$20(r0);
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ C0829TC m3178F(Lua r0, int r1) {
        return register$lambda$15$lambda$14$lambda$13(r0, r1);
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ int m3179G(Lua r0) {
        return register$lambda$19(r0);
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ C0829TC m3180H(Lua r0, int r1) {
        return register$lambda$6$lambda$5$lambda$4(r0, r1);
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ int m3181I(Lua r0) {
        return register$lambda$35(r0);
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ int m3182J(Lua r0) {
        return register$lambda$37(r0);
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m3183K(boolean r0, Lua r1, int r2, int r3) {
        register$lambda$15$lambda$14(r0, r1, r2, r3);
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ C0829TC m3184L(Lua r0, int r1) {
        return register$lambda$2$lambda$1(r0, r1);
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ C0829TC m3185M(LuaTaskRef r0) {
        return register$lambda$23$lambda$22$lambda$21(r0);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m3186a(Lua r0) {
        return register$lambda$31(r0);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m3187b(Lua r0) {
        return register$lambda$32(r0);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m3188c(Lua r0) {
        return register$lambda$15(r0);
    }

    private static final C0829TC cleanup$lambda$47(List r5) {
        Iterator r52 = r5.iterator();
    L4:
        if (r52.hasNext() == false) goto L7;
        LuaTaskRef r0 = (LuaTaskRef) r52.next();
        LuaLocks.INSTANCE.withLock(r0.getLua(), new C1555a(r0, 6));
        goto L4
    L7:
        return C0829TC.f2620a;
    }

    private static final C0829TC cleanup$lambda$47$lambda$46$lambda$45(LuaTaskRef r1) {
        r1.getLua().unref(r1.getRef());
        return C0829TC.f2620a;
    }

    private static final C0829TC cleanupFor$lambda$43(List r5) {
        Iterator r52 = r5.iterator();
    L4:
        if (r52.hasNext() == false) goto L7;
        LuaTaskRef r0 = (LuaTaskRef) r52.next();
        LuaLocks.INSTANCE.withLock(r0.getLua(), new C1555a(r0, 3));
        goto L4
    L7:
        return C0829TC.f2620a;
    }

    private static final C0829TC cleanupFor$lambda$43$lambda$42$lambda$41(LuaTaskRef r1) {
        r1.getLua().unref(r1.getRef());
        return C0829TC.f2620a;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C0829TC m3189d(Lua r0, int r1, Object r2) {
        return register$lambda$15$lambda$14$lambda$10(r0, r1, r2);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C0829TC m3190e(Lua r0, int r1) {
        return register$lambda$15$lambda$14$lambda$12$lambda$11(r0, r1);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m3191f(Lua r0) {
        return register$lambda$34(r0);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ C0829TC m3192g(List r0) {
        return register$lambda$31$lambda$30(r0);
    }

    private final String generateTaskId() {
        return AbstractC0295Gu.m625r(-532219462416437L) + taskCounter.incrementAndGet();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ C0829TC m3193h(List r0) {
        return cleanup$lambda$47(r0);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ C0829TC m3194i(LuaTaskRef r0) {
        return cleanup$lambda$47$lambda$46$lambda$45(r0);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ C0829TC m3195j(LuaTaskRef r0) {
        return register$lambda$31$lambda$30$lambda$29$lambda$28(r0);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ C0829TC m3196k(LuaTaskRef r0) {
        return cleanupFor$lambda$43$lambda$42$lambda$41(r0);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ C0829TC m3197l(Lua r0, int r1) {
        return register$lambda$15$lambda$14$lambda$12(r0, r1);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ int m3198m(Lua r0) {
        return register$lambda$2(r0);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ int m3199n(Lua r0) {
        return register$lambda$6(r0);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m3200o(String r0) {
        register$lambda$23$lambda$22(r0);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ C0829TC m3201p(LuaTaskRef r0) {
        return register$lambda$26$lambda$25$lambda$24(r0);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ int m3202q(Lua r0) {
        return register$lambda$26(r0);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ C0829TC m3203r(Lua r0, int r1) {
        return register$lambda$15$lambda$14$lambda$8(r0, r1);
    }

    private static final int register$lambda$15(final Lua r6) {
        AbstractC0295Gu.m625r(-531515087779893L);
        final boolean r0 = true;
        if (r6.isFunction(1) == true) goto L5;
        return 0;
    L5:
        r6.pushValue(1);
        final int r1 = r6.ref();
        if (r6.getTop() >= 2) goto L8;
    L10:
        r0 = false;
    L11:
        if (r0 == false) goto L13;
        r6.pushValue(2);
        final int r3 = r6.ref();
    L14:
        executor.execute(new RunnableC0310H8(r0, r6, r1, r3));
        return 0;
    L13:
        r3 = -1;
        goto L14
    L8:
        if (r6.isFunction(2) == false) goto L10;
        goto L10
    }

    private static final void register$lambda$15$lambda$14(boolean r4, Lua r5, int r6, int r7) {
        if (r4 == false) goto L6;
        Object r0 = LuaLocks.INSTANCE.withLock(r5, new C2087j8(r5, r6, 18));     // Catch: Throwable -> L4 Exception -> L12
    L7:
        if (r4 == false) goto L9;
        INSTANCE.runOnUiThread(new C0396J8(r5, r7, r0, 1));     // Catch: Throwable -> L4 Exception -> L12
    L9:
        LuaLocks r42 = LuaLocks.INSTANCE;
        C2087j8 r72 = new C2087j8(r5, r6, 20);
    L10:
        r42.withLock(r5, r72);
        return;
    L6:
        LuaLocks.INSTANCE.withLock(r5, new C2087j8(r5, r6, 19));     // Catch: Throwable -> L4 Exception -> L12
        r0 = null;
    L4:
        th = move-exception;
        LuaLocks.INSTANCE.withLock(r5, new C2087j8(r5, r6, 20));
        throw th;
    L13:
        AbstractC0295Gu.m625r(-531394828695605L);     // Catch: Throwable -> L4
        AbstractC0295Gu.m625r(-531463548172341L);     // Catch: Throwable -> L4
        if (r4 == false) goto L16;
        INSTANCE.runOnUiThread(new C2087j8(r5, r7, 21));     // Catch: Throwable -> L4
    L16:
        r42 = LuaLocks.INSTANCE;
        r72 = new C2087j8(r5, r6, 20);
        goto L10
    }

    private static final C0829TC register$lambda$15$lambda$14$lambda$10(Lua r3, int r4, Object r5) {
        LuaLocks.INSTANCE.withLock(r3, new C0396J8(r3, r4, r5, 0));
        return C0829TC.f2620a;
    }

    private static final C0829TC register$lambda$15$lambda$14$lambda$10$lambda$9(Lua r1, int r2, Object r3) {
        r1.refGet(r2);
        if (r3 == null) goto L5;
        r1.push(r3, Lua.Conversion.SEMI);
    L6:
        r1.pCall(1, 0);
        r1.unref(r2);
        return C0829TC.f2620a;
    L5:
        r1.pushNil();
        goto L6
    }

    private static final C0829TC register$lambda$15$lambda$14$lambda$12(Lua r3, int r4) {
        LuaLocks.INSTANCE.withLock(r3, new C2087j8(r3, r4, 14));
        return C0829TC.f2620a;
    }

    private static final C0829TC register$lambda$15$lambda$14$lambda$12$lambda$11(Lua r2, int r3) {
        r2.refGet(r3);
        r2.pushNil();
        r2.pCall(1, 0);
        r2.unref(r3);
        return C0829TC.f2620a;
    }

    private static final C0829TC register$lambda$15$lambda$14$lambda$13(Lua r0, int r1) {
        r0.unref(r1);
        return C0829TC.f2620a;
    }

    private static final Object register$lambda$15$lambda$14$lambda$7(Lua r1, int r2) {
        r1.refGet(r2);
        r1.pCall(0, 1);
        Object r22 = r1.toObject(-1);
        r1.pop(1);
        return r22;
    }

    private static final C0829TC register$lambda$15$lambda$14$lambda$8(Lua r0, int r1) {
        r0.refGet(r1);
        r0.pCall(0, 0);
        return C0829TC.f2620a;
    }

    private static final int register$lambda$19(Lua r10) {
        AbstractC0295Gu.m625r(-531132835690549L);
        long r5 = (long) r10.toNumber(1);
        long r7 = (long) r10.toNumber(2);
        if (r10.isFunction(3) == true) goto L6;
        return 0;
    L6:
        r10.pushValue(3);
        int r1 = r10.ref();
        String r2 = INSTANCE.generateTaskId();
        ScheduledFuture<?> r3 = scheduledExecutor.scheduleAtFixedRate(new RunnableC2222m8(r10, r1, 5), r5, r7, TimeUnit.MILLISECONDS);
        scheduledTasks.put(r2, r3);
        taskRefs.put(r2, new LuaTaskRef(r10, r1));
        r10.push(r2);
        return 1;
    }

    private static final void register$lambda$19$lambda$18(Lua r3, int r4) {
        INSTANCE.runOnUiThread(new C2087j8(r3, r4, 24));     // Catch: Exception -> L4
        return;
    L4:
        AbstractC0295Gu.m625r(-531523677714485L);
        AbstractC0295Gu.m625r(-531592397191221L);
    }

    private static final C0829TC register$lambda$19$lambda$18$lambda$17(Lua r3, int r4) {
        LuaLocks.INSTANCE.withLock(r3, new C2087j8(r3, r4, 22));
        return C0829TC.f2620a;
    }

    private static final C0829TC register$lambda$19$lambda$18$lambda$17$lambda$16(Lua r0, int r1) {
        r0.refGet(r1);
        r0.pCall(0, 0);
        return C0829TC.f2620a;
    }

    private static final int register$lambda$2(Lua r5) {
        AbstractC0295Gu.m625r(-531377648826421L);
        if (r5.isFunction(1) == true) goto L5;
        return 0;
    L5:
        r5.pushValue(1);
        int r0 = r5.ref();
        INSTANCE.runOnUiThread(new C2087j8(r5, r0, 17));
        return 0;
    }

    private static final C0829TC register$lambda$2$lambda$1(Lua r3, int r4) {
        LuaLocks.INSTANCE.withLock(r3, new C2087j8(r3, r4, 15));
        return C0829TC.f2620a;
    }

    private static final C0829TC register$lambda$2$lambda$1$lambda$0(Lua r1, int r2) {
        r1.refGet(r2);     // Catch: Throwable -> L5
        r1.pCall(0, 0);     // Catch: Throwable -> L5
        r1.unref(r2);
        return C0829TC.f2620a;
    L5:
        th = move-exception;
        r1.unref(r2);
        throw th;
    }

    private static final int register$lambda$23(Lua r8) {
        AbstractC0295Gu.m625r(-531300339415093L);
        long r1 = (long) r8.toNumber(1);
        if (r8.isFunction(2) == true) goto L6;
        return 0;
    L6:
        r8.pushValue(2);
        int r3 = r8.ref();
        String r4 = INSTANCE.generateTaskId();
        ScheduledFuture<?> r12 = scheduledExecutor.schedule(new RunnableC0562N2(4, r4), r1, TimeUnit.MILLISECONDS);
        scheduledTasks.put(r4, r12);
        taskRefs.put(r4, new LuaTaskRef(r8, r3));
        r8.push(r4);
        return 1;
    }

    private static final void register$lambda$23$lambda$22(String r4) {
        LuaTaskRef r0 = taskRefs.remove(r4);     // Catch: Throwable -> L6 Exception -> L10
        if (r0 == null) goto L8;
        INSTANCE.runOnUiThread(new C1555a(r0, 5));     // Catch: Throwable -> L6 Exception -> L10
    L8:
        scheduledTasks.remove(r4);
        return;
    L6:
        th = move-exception;
        scheduledTasks.remove(r4);
        throw th;
    L11:
        AbstractC0295Gu.m625r(-531141425625141L);     // Catch: Throwable -> L6
        AbstractC0295Gu.m625r(-531210145101877L);     // Catch: Throwable -> L6
        goto L8
    }

    private static final C0829TC register$lambda$23$lambda$22$lambda$21(LuaTaskRef r4) {
        LuaLocks.INSTANCE.withLock(r4.getLua(), new C1555a(r4, 4));
        return C0829TC.f2620a;
    }

    private static final C0829TC register$lambda$23$lambda$22$lambda$21$lambda$20(LuaTaskRef r2) {
        r2.getLua().refGet(r2.getRef());
        r2.getLua().pCall(0, 0);
        r2.getLua().unref(r2.getRef());
        return C0829TC.f2620a;
    }

    private static final int register$lambda$26(Lua r7) {
        AbstractC0295Gu.m625r(-531308929349685L);
        String r1 = r7.toString(1);
        boolean r2 = false;
        if (r1 != null) goto L5;
        return 0;
    L5:
        ScheduledFuture<?> r3 = scheduledTasks.remove(r1);
        LuaTaskRef r12 = taskRefs.remove(r1);
        if (r3 == null) goto L8;
        r3.cancel(false);
    L8:
        if (r12 == null) goto L10;
        INSTANCE.runOnUiThread(new C1555a(r12, 1));
    L10:
        if (r3 != null) goto L12;
        if (r12 != null) goto L12;
    L13:
        r7.push(r2);
        return 1;
    L12:
        r2 = true;
        goto L13
    }

    private static final C0829TC register$lambda$26$lambda$25(LuaTaskRef r4) {
        LuaLocks.INSTANCE.withLock(r4.getLua(), new C1555a(r4, 0));
        return C0829TC.f2620a;
    }

    private static final C0829TC register$lambda$26$lambda$25$lambda$24(LuaTaskRef r1) {
        r1.getLua().unref(r1.getRef());
        return C0829TC.f2620a;
    }

    private static final int register$lambda$31(Lua r5) {
        AbstractC0295Gu.m625r(-531317519284277L);
        ConcurrentHashMap<String, ScheduledFuture<?>> r0 = scheduledTasks;
        int r1 = r0.size();
        Collection<ScheduledFuture<?>> r02 = r0.values();
        AbstractC0295Gu.m625r(-531326109218869L);
        Iterator<T> r03 = r02.iterator();
    L4:
        if (r03.hasNext() == false) goto L6;
        ((ScheduledFuture) r03.next()).cancel(false);
        goto L4
    L6:
        scheduledTasks.clear();
        ConcurrentHashMap<String, LuaTaskRef> r04 = taskRefs;
        Collection<LuaTaskRef> r2 = r04.values();
        AbstractC0295Gu.m625r(-531953174444085L);
        List r22 = AbstractC2453ra.m4908r0(r2);
        r04.clear();
        if (r22.isEmpty() == true) goto L9;
        INSTANCE.runOnUiThread(new C0353I8(0, r22));
    L9:
        r5.push(Double.valueOf(r1));
        return 1;
    }

    private static final C0829TC register$lambda$31$lambda$30(List r5) {
        Iterator r52 = r5.iterator();
    L4:
        if (r52.hasNext() == false) goto L7;
        LuaTaskRef r0 = (LuaTaskRef) r52.next();
        LuaLocks.INSTANCE.withLock(r0.getLua(), new C1555a(r0, 2));
        goto L4
    L7:
        return C0829TC.f2620a;
    }

    private static final C0829TC register$lambda$31$lambda$30$lambda$29$lambda$28(LuaTaskRef r1) {
        r1.getLua().unref(r1.getRef());
        return C0829TC.f2620a;
    }

    private static final int register$lambda$32(Lua r4) {
        AbstractC0295Gu.m625r(-532030483855413L);
        long r0 = (long) r4.toNumber(1);
        if (r0 <= 0) goto L7;
        Thread.sleep(r0);
        return 0;
    L7:
        return 0;
    }

    private static final int register$lambda$33(Lua r2) {
        AbstractC0295Gu.m625r(-532039073790005L);
        r2.push(AbstractC0585Nj.m1134a(Looper.myLooper(), Looper.getMainLooper()));
        return 1;
    }

    private static final int register$lambda$34(Lua r2) {
        AbstractC0295Gu.m625r(-532047663724597L);
        r2.push(Thread.currentThread().getName());
        return 1;
    }

    private static final int register$lambda$35(Lua r2) {
        AbstractC0295Gu.m625r(-532056253659189L);
        Thread.yield();
        return 0;
    }

    private static final int register$lambda$37(Lua r4) {
        AbstractC0295Gu.m625r(-532064843593781L);
        Set<String> r0 = scheduledTasks.keySet();
        AbstractC0295Gu.m625r(-532073433528373L);
        List r02 = AbstractC2453ra.m4908r0(r0);
        int r2 = 0;
        r4.createTable(r02.size(), 0);
        Iterator r03 = r02.iterator();
    L4:
        if (r03.hasNext() == false) goto L10;
        Object r1 = r03.next();
        int r3 = r2 + 1;
        if (r2 < 0) goto L8;
        r4.push((String) r1);
        r4.rawSetI(-2, r3);
        r2 = r3;
        goto L4
    L8:
        AbstractC2496sa.m4978c0();
        throw null;
    L10:
        return 1;
    }

    private static final int register$lambda$6(Lua r8) {
        AbstractC0295Gu.m625r(-531386238761013L);
        long r1 = (long) r8.toNumber(1);
        if (r8.isFunction(2) == true) goto L6;
        return 0;
    L6:
        r8.pushValue(2);
        int r3 = r8.ref();
        String r4 = INSTANCE.generateTaskId();
        mainHandler.postDelayed(new RunnableC2222m8(r8, r3, 4), r1);
        r8.push(r4);
        return 1;
    }

    private static final void register$lambda$6$lambda$5(Lua r3, int r4) {
        LuaUiScheduler.INSTANCE.runOnUiThread(new C2087j8(r3, r4, 23));
    }

    private static final C0829TC register$lambda$6$lambda$5$lambda$4(Lua r3, int r4) {
        LuaLocks.INSTANCE.withLock(r3, new C2087j8(r3, r4, 16));
        return C0829TC.f2620a;
    }

    private static final C0829TC register$lambda$6$lambda$5$lambda$4$lambda$3(Lua r1, int r2) {
        r1.refGet(r2);     // Catch: Throwable -> L5
        r1.pCall(0, 0);     // Catch: Throwable -> L5
        r1.unref(r2);
        return C0829TC.f2620a;
    L5:
        th = move-exception;
        r1.unref(r2);
        throw th;
    }

    private final void runOnUiThread(InterfaceC0884Ui r2) {
        LuaUiScheduler.INSTANCE.runOnUiThread(r2);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m3204s(Lua r0, int r1) {
        register$lambda$6$lambda$5(r0, r1);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ Object m3205t(Lua r0, int r1) {
        return register$lambda$15$lambda$14$lambda$7(r0, r1);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ C0829TC m3206u(ArrayList r0) {
        return cleanupFor$lambda$43(r0);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ C0829TC m3207v(Lua r0, int r1) {
        return register$lambda$19$lambda$18$lambda$17$lambda$16(r0, r1);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ C0829TC m3208w(LuaTaskRef r0) {
        return register$lambda$26$lambda$25(r0);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ C0829TC m3209x(Lua r0, int r1) {
        return register$lambda$6$lambda$5$lambda$4$lambda$3(r0, r1);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ int m3210y(Lua r0) {
        return register$lambda$33(r0);
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ C0829TC m3211z(Lua r0, int r1) {
        return register$lambda$2$lambda$1$lambda$0(r0, r1);
    }

    public final void cleanup() {
        Collection<ScheduledFuture<?>> r0 = scheduledTasks.values();
        AbstractC0295Gu.m625r(-533207304894517L);
        Iterator<T> r02 = r0.iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        ((ScheduledFuture) r02.next()).cancel(true);
        goto L4
    L6:
        scheduledTasks.clear();
        ConcurrentHashMap<String, LuaTaskRef> r03 = taskRefs;
        Collection<LuaTaskRef> r1 = r03.values();
        AbstractC0295Gu.m625r(-532734858491957L);
        List r12 = AbstractC2453ra.m4908r0(r1);
        r03.clear();
        if (r12.isEmpty() == true) goto L9;
        runOnUiThread(new C0353I8(1, r12));
    L9:
        AbstractC0295Gu.m625r(-532812167903285L);
        AbstractC0295Gu.m625r(-532880887380021L);
    }

    public final void cleanupFor(Lua r6) {
        AbstractC0295Gu.m625r(-532245232220213L);
        Set<Map.Entry<String, LuaTaskRef>> r0 = taskRefs.entrySet();
        AbstractC0295Gu.m625r(-532262412089397L);
        List r02 = AbstractC2453ra.m4908r0(r0);
        if (r02.isEmpty() == true) goto L38;
        ArrayList r1 = new ArrayList();
        Iterator r03 = r02.iterator();
    L7:
        if (r03.hasNext() == false) goto L12;
        Map.Entry r2 = (Map.Entry) r03.next();
        if (AbstractC0585Nj.m1134a(((LuaTaskRef) r2.getValue()).getLua(), r6) == false) goto L7;
        Object r22 = r2.getKey();
        AbstractC0295Gu.m625r(-532344016468021L);
        r1.add(r22);
        goto L7
    L12:
        if (r1.isEmpty() == false) goto L14;
        return;
    L14:
        ArrayList r62 = new ArrayList();
        Iterator r04 = r1.iterator();
    L16:
        if (r04.hasNext() == false) goto L24;
        String r23 = (String) r04.next();
        ScheduledFuture<?> r3 = scheduledTasks.remove(r23);
        if (r3 == null) goto L20;
        r3.cancel(true);
    L20:
        LuaTaskRef r24 = taskRefs.remove(r23);
        if (r24 == null) goto L16;
        r62.add(r24);
        goto L16
    L24:
        if (r62.isEmpty() == true) goto L26;
        runOnUiThread(new C0693Q4(3, r62));
    L26:
        AbstractC0295Gu.m625r(-532408440977461L);
        AbstractC0295Gu.m625r(-533026916268085L);
        r1.size();
        return;
    }

    public final void register(Lua r5) {
        AbstractC0295Gu.m625r(-534238097045557L);
        r5.createTable(0, 15);
        r5.push(new C2789z8(7));
        r5.setField(-2, AbstractC0295Gu.m625r(-534255276914741L));
        r5.push(new C2789z8(12));
        r5.setField(-2, AbstractC0295Gu.m625r(-534315406456885L));
        r5.push(new C2789z8(13));
        r5.setField(-2, AbstractC0295Gu.m625r(-533817190250549L));
        r5.push(new C2789z8(14));
        r5.setField(-2, AbstractC0295Gu.m625r(-533842960054325L));
        r5.push(new C2789z8(15));
        r5.setField(-2, AbstractC0295Gu.m625r(-533881614759989L));
        r5.push(new C2789z8(16));
        r5.setField(-2, AbstractC0295Gu.m625r(-533937449334837L));
        r5.push(new C2789z8(17));
        r5.setField(-2, AbstractC0295Gu.m625r(-533967514105909L));
        r5.push(new C2789z8(18));
        r5.setField(-2, AbstractC0295Gu.m625r(-534010463778869L));
        r5.push(new C2789z8(8));
        r5.setField(-2, AbstractC0295Gu.m625r(-534036233582645L));
        r5.push(new C2789z8(9));
        r5.setField(-2, AbstractC0295Gu.m625r(-534083478222901L));
        r5.push(new C2789z8(10));
        r5.setField(-2, AbstractC0295Gu.m625r(-532494340323381L));
        r5.push(new C2789z8(11));
        r5.setField(-2, AbstractC0295Gu.m625r(-532520110127157L));
        AbstractC0295Gu.m625r(-532584534636597L);
        AbstractC0295Gu.m625r(-532653254113333L);
    }
}
