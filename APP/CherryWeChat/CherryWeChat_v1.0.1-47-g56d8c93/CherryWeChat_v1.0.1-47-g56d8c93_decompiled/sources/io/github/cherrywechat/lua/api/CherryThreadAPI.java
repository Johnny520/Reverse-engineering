package io.github.cherrywechat.lua.api;

import android.os.Handler;
import android.os.Looper;
import io.github.cherrywechat.lua.LuaLocks;
import io.github.cherrywechat.lua.LuaUiScheduler;
import io.github.cherrywechat.lua.api.CherryThreadAPI;
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
import p000.RunnableC0562N2;
import p000.RunnableC2222m8;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
public final class CherryThreadAPI {
    private static final ScheduledExecutorService scheduledExecutor;
    private static final ConcurrentHashMap<String, ScheduledFuture<?>> scheduledTasks;
    private static final AtomicLong taskCounter;
    private static final ConcurrentHashMap<String, LuaTaskRef> taskRefs;
    private static final String TAG = AbstractC0295Gu.m625r(-532142153005109L);
    public static final CherryThreadAPI INSTANCE = new CherryThreadAPI();
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());
    private static final ExecutorService executor = Executors.newCachedThreadPool();

    public static final class LuaTaskRef {
        private final Lua lua;
        private final int ref;

        public LuaTaskRef(Lua lua, int i) {
            AbstractC0295Gu.m625r(-534104953059381L);
            this.lua = lua;
            this.ref = i;
        }

        public static /* synthetic */ LuaTaskRef copy$default(LuaTaskRef luaTaskRef, Lua lua, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                lua = luaTaskRef.lua;
            }
            if ((i2 & 2) != 0) {
                i = luaTaskRef.ref;
            }
            return luaTaskRef.copy(lua, i);
        }

        public final Lua component1() {
            return this.lua;
        }

        public final int component2() {
            return this.ref;
        }

        public final LuaTaskRef copy(Lua lua, int i) {
            AbstractC0295Gu.m625r(-534122132928565L);
            return new LuaTaskRef(lua, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LuaTaskRef)) {
                return false;
            }
            LuaTaskRef luaTaskRef = (LuaTaskRef) obj;
            return AbstractC0585Nj.m1134a(this.lua, luaTaskRef.lua) && this.ref == luaTaskRef.ref;
        }

        public final Lua getLua() {
            return this.lua;
        }

        public final int getRef() {
            return this.ref;
        }

        public int hashCode() {
            return Integer.hashCode(this.ref) + (this.lua.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC0295Gu.m625r(-534139312797749L));
            sb.append(this.lua);
            sb.append(AbstractC0295Gu.m625r(-534208032274485L));
            return AbstractC0213Ey.m408f(sb, this.ref, ')');
        }
    }

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(2);
        AbstractC0295Gu.m625r(-531661116667957L);
        scheduledExecutor = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledTasks = new ConcurrentHashMap<>();
        taskRefs = new ConcurrentHashMap<>();
        taskCounter = new AtomicLong(0L);
    }

    private CherryThreadAPI() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC cleanup$lambda$47(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LuaTaskRef luaTaskRef = (LuaTaskRef) it.next();
            LuaLocks.INSTANCE.withLock(luaTaskRef.getLua(), new C1555a(luaTaskRef, 6));
        }
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC cleanup$lambda$47$lambda$46$lambda$45(LuaTaskRef luaTaskRef) {
        luaTaskRef.getLua().unref(luaTaskRef.getRef());
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC cleanupFor$lambda$43(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LuaTaskRef luaTaskRef = (LuaTaskRef) it.next();
            LuaLocks.INSTANCE.withLock(luaTaskRef.getLua(), new C1555a(luaTaskRef, 3));
        }
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC cleanupFor$lambda$43$lambda$42$lambda$41(LuaTaskRef luaTaskRef) {
        luaTaskRef.getLua().unref(luaTaskRef.getRef());
        return C0829TC.f2620a;
    }

    private final String generateTaskId() {
        return AbstractC0295Gu.m625r(-532219462416437L) + taskCounter.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$15(final Lua lua) {
        final int iRef;
        AbstractC0295Gu.m625r(-531515087779893L);
        if (!lua.isFunction(1)) {
            return 0;
        }
        lua.pushValue(1);
        final int iRef2 = lua.ref();
        final boolean z = lua.getTop() >= 2 && lua.isFunction(2);
        if (z) {
            lua.pushValue(2);
            iRef = lua.ref();
        } else {
            iRef = -1;
        }
        executor.execute(new Runnable() { // from class: H8
            @Override // java.lang.Runnable
            public final void run() {
                CherryThreadAPI.register$lambda$15$lambda$14(z, lua, iRef2, iRef);
            }
        });
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$15$lambda$14(boolean z, Lua lua, int i, int i2) {
        LuaLocks luaLocks;
        C2087j8 c2087j8;
        Object objWithLock;
        try {
            try {
                if (z) {
                    objWithLock = LuaLocks.INSTANCE.withLock(lua, new C2087j8(lua, i, 18));
                } else {
                    LuaLocks.INSTANCE.withLock(lua, new C2087j8(lua, i, 19));
                    objWithLock = null;
                }
                if (z) {
                    INSTANCE.runOnUiThread(new C0396J8(lua, i2, objWithLock, 1));
                }
                luaLocks = LuaLocks.INSTANCE;
                c2087j8 = new C2087j8(lua, i, 20);
            } catch (Exception unused) {
                AbstractC0295Gu.m625r(-531394828695605L);
                AbstractC0295Gu.m625r(-531463548172341L);
                if (z) {
                    INSTANCE.runOnUiThread(new C2087j8(lua, i2, 21));
                }
                luaLocks = LuaLocks.INSTANCE;
                c2087j8 = new C2087j8(lua, i, 20);
            }
            luaLocks.withLock(lua, c2087j8);
        } catch (Throwable th) {
            LuaLocks.INSTANCE.withLock(lua, new C2087j8(lua, i, 20));
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$15$lambda$14$lambda$10(Lua lua, int i, Object obj) {
        LuaLocks.INSTANCE.withLock(lua, new C0396J8(lua, i, obj, 0));
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$15$lambda$14$lambda$10$lambda$9(Lua lua, int i, Object obj) {
        lua.refGet(i);
        if (obj != null) {
            lua.push(obj, Lua.Conversion.SEMI);
        } else {
            lua.pushNil();
        }
        lua.pCall(1, 0);
        lua.unref(i);
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$15$lambda$14$lambda$12(Lua lua, int i) {
        LuaLocks.INSTANCE.withLock(lua, new C2087j8(lua, i, 14));
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$15$lambda$14$lambda$12$lambda$11(Lua lua, int i) {
        lua.refGet(i);
        lua.pushNil();
        lua.pCall(1, 0);
        lua.unref(i);
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$15$lambda$14$lambda$13(Lua lua, int i) {
        lua.unref(i);
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object register$lambda$15$lambda$14$lambda$7(Lua lua, int i) {
        lua.refGet(i);
        lua.pCall(0, 1);
        Object object = lua.toObject(-1);
        lua.pop(1);
        return object;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$15$lambda$14$lambda$8(Lua lua, int i) {
        lua.refGet(i);
        lua.pCall(0, 0);
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$19(Lua lua) {
        AbstractC0295Gu.m625r(-531132835690549L);
        long number = (long) lua.toNumber(1);
        long number2 = (long) lua.toNumber(2);
        if (!lua.isFunction(3)) {
            return 0;
        }
        lua.pushValue(3);
        int iRef = lua.ref();
        String strGenerateTaskId = INSTANCE.generateTaskId();
        scheduledTasks.put(strGenerateTaskId, scheduledExecutor.scheduleAtFixedRate(new RunnableC2222m8(lua, iRef, 5), number, number2, TimeUnit.MILLISECONDS));
        taskRefs.put(strGenerateTaskId, new LuaTaskRef(lua, iRef));
        lua.push(strGenerateTaskId);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$19$lambda$18(Lua lua, int i) {
        try {
            INSTANCE.runOnUiThread(new C2087j8(lua, i, 24));
        } catch (Exception unused) {
            AbstractC0295Gu.m625r(-531523677714485L);
            AbstractC0295Gu.m625r(-531592397191221L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$19$lambda$18$lambda$17(Lua lua, int i) {
        LuaLocks.INSTANCE.withLock(lua, new C2087j8(lua, i, 22));
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$19$lambda$18$lambda$17$lambda$16(Lua lua, int i) {
        lua.refGet(i);
        lua.pCall(0, 0);
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$2(Lua lua) {
        AbstractC0295Gu.m625r(-531377648826421L);
        if (!lua.isFunction(1)) {
            return 0;
        }
        lua.pushValue(1);
        INSTANCE.runOnUiThread(new C2087j8(lua, lua.ref(), 17));
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$2$lambda$1(Lua lua, int i) {
        LuaLocks.INSTANCE.withLock(lua, new C2087j8(lua, i, 15));
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$2$lambda$1$lambda$0(Lua lua, int i) {
        try {
            lua.refGet(i);
            lua.pCall(0, 0);
            lua.unref(i);
            return C0829TC.f2620a;
        } catch (Throwable th) {
            lua.unref(i);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$23(Lua lua) {
        AbstractC0295Gu.m625r(-531300339415093L);
        long number = (long) lua.toNumber(1);
        if (!lua.isFunction(2)) {
            return 0;
        }
        lua.pushValue(2);
        int iRef = lua.ref();
        String strGenerateTaskId = INSTANCE.generateTaskId();
        scheduledTasks.put(strGenerateTaskId, scheduledExecutor.schedule(new RunnableC0562N2(4, strGenerateTaskId), number, TimeUnit.MILLISECONDS));
        taskRefs.put(strGenerateTaskId, new LuaTaskRef(lua, iRef));
        lua.push(strGenerateTaskId);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$23$lambda$22(String str) {
        try {
            try {
                LuaTaskRef luaTaskRefRemove = taskRefs.remove(str);
                if (luaTaskRefRemove != null) {
                    INSTANCE.runOnUiThread(new C1555a(luaTaskRefRemove, 5));
                }
            } catch (Exception unused) {
                AbstractC0295Gu.m625r(-531141425625141L);
                AbstractC0295Gu.m625r(-531210145101877L);
            }
        } finally {
            scheduledTasks.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$23$lambda$22$lambda$21(LuaTaskRef luaTaskRef) {
        LuaLocks.INSTANCE.withLock(luaTaskRef.getLua(), new C1555a(luaTaskRef, 4));
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$23$lambda$22$lambda$21$lambda$20(LuaTaskRef luaTaskRef) {
        luaTaskRef.getLua().refGet(luaTaskRef.getRef());
        luaTaskRef.getLua().pCall(0, 0);
        luaTaskRef.getLua().unref(luaTaskRef.getRef());
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$26(Lua lua) {
        AbstractC0295Gu.m625r(-531308929349685L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        ScheduledFuture<?> scheduledFutureRemove = scheduledTasks.remove(string);
        LuaTaskRef luaTaskRefRemove = taskRefs.remove(string);
        if (scheduledFutureRemove != null) {
            scheduledFutureRemove.cancel(false);
        }
        if (luaTaskRefRemove != null) {
            INSTANCE.runOnUiThread(new C1555a(luaTaskRefRemove, 1));
        }
        lua.push((scheduledFutureRemove == null && luaTaskRefRemove == null) ? false : true);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$26$lambda$25(LuaTaskRef luaTaskRef) {
        LuaLocks.INSTANCE.withLock(luaTaskRef.getLua(), new C1555a(luaTaskRef, 0));
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$26$lambda$25$lambda$24(LuaTaskRef luaTaskRef) {
        luaTaskRef.getLua().unref(luaTaskRef.getRef());
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$31(Lua lua) {
        AbstractC0295Gu.m625r(-531317519284277L);
        ConcurrentHashMap<String, ScheduledFuture<?>> concurrentHashMap = scheduledTasks;
        int size = concurrentHashMap.size();
        Collection<ScheduledFuture<?>> collectionValues = concurrentHashMap.values();
        AbstractC0295Gu.m625r(-531326109218869L);
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((ScheduledFuture) it.next()).cancel(false);
        }
        scheduledTasks.clear();
        ConcurrentHashMap<String, LuaTaskRef> concurrentHashMap2 = taskRefs;
        Collection<LuaTaskRef> collectionValues2 = concurrentHashMap2.values();
        AbstractC0295Gu.m625r(-531953174444085L);
        List listM4908r0 = AbstractC2453ra.m4908r0(collectionValues2);
        concurrentHashMap2.clear();
        if (!listM4908r0.isEmpty()) {
            INSTANCE.runOnUiThread(new C0353I8(0, listM4908r0));
        }
        lua.push(Double.valueOf(size));
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$31$lambda$30(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LuaTaskRef luaTaskRef = (LuaTaskRef) it.next();
            LuaLocks.INSTANCE.withLock(luaTaskRef.getLua(), new C1555a(luaTaskRef, 2));
        }
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$31$lambda$30$lambda$29$lambda$28(LuaTaskRef luaTaskRef) {
        luaTaskRef.getLua().unref(luaTaskRef.getRef());
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$32(Lua lua) throws InterruptedException {
        AbstractC0295Gu.m625r(-532030483855413L);
        long number = (long) lua.toNumber(1);
        if (number <= 0) {
            return 0;
        }
        Thread.sleep(number);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$33(Lua lua) {
        AbstractC0295Gu.m625r(-532039073790005L);
        lua.push(AbstractC0585Nj.m1134a(Looper.myLooper(), Looper.getMainLooper()));
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$34(Lua lua) {
        AbstractC0295Gu.m625r(-532047663724597L);
        lua.push(Thread.currentThread().getName());
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$35(Lua lua) {
        AbstractC0295Gu.m625r(-532056253659189L);
        Thread.yield();
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$37(Lua lua) {
        AbstractC0295Gu.m625r(-532064843593781L);
        Set<String> setKeySet = scheduledTasks.keySet();
        AbstractC0295Gu.m625r(-532073433528373L);
        List listM4908r0 = AbstractC2453ra.m4908r0(setKeySet);
        int i = 0;
        lua.createTable(listM4908r0.size(), 0);
        for (Object obj : listM4908r0) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC2496sa.m4978c0();
                throw null;
            }
            lua.push((String) obj);
            lua.rawSetI(-2, i2);
            i = i2;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$6(Lua lua) {
        AbstractC0295Gu.m625r(-531386238761013L);
        long number = (long) lua.toNumber(1);
        if (!lua.isFunction(2)) {
            return 0;
        }
        lua.pushValue(2);
        int iRef = lua.ref();
        String strGenerateTaskId = INSTANCE.generateTaskId();
        mainHandler.postDelayed(new RunnableC2222m8(lua, iRef, 4), number);
        lua.push(strGenerateTaskId);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$6$lambda$5(Lua lua, int i) {
        LuaUiScheduler.INSTANCE.runOnUiThread(new C2087j8(lua, i, 23));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$6$lambda$5$lambda$4(Lua lua, int i) {
        LuaLocks.INSTANCE.withLock(lua, new C2087j8(lua, i, 16));
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$6$lambda$5$lambda$4$lambda$3(Lua lua, int i) {
        try {
            lua.refGet(i);
            lua.pCall(0, 0);
            lua.unref(i);
            return C0829TC.f2620a;
        } catch (Throwable th) {
            lua.unref(i);
            throw th;
        }
    }

    private final void runOnUiThread(InterfaceC0884Ui interfaceC0884Ui) {
        LuaUiScheduler.INSTANCE.runOnUiThread(interfaceC0884Ui);
    }

    public final void cleanup() {
        Collection<ScheduledFuture<?>> collectionValues = scheduledTasks.values();
        AbstractC0295Gu.m625r(-533207304894517L);
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((ScheduledFuture) it.next()).cancel(true);
        }
        scheduledTasks.clear();
        ConcurrentHashMap<String, LuaTaskRef> concurrentHashMap = taskRefs;
        Collection<LuaTaskRef> collectionValues2 = concurrentHashMap.values();
        AbstractC0295Gu.m625r(-532734858491957L);
        List listM4908r0 = AbstractC2453ra.m4908r0(collectionValues2);
        concurrentHashMap.clear();
        if (!listM4908r0.isEmpty()) {
            runOnUiThread(new C0353I8(1, listM4908r0));
        }
        AbstractC0295Gu.m625r(-532812167903285L);
        AbstractC0295Gu.m625r(-532880887380021L);
    }

    public final void cleanupFor(Lua lua) {
        AbstractC0295Gu.m625r(-532245232220213L);
        Set<Map.Entry<String, LuaTaskRef>> setEntrySet = taskRefs.entrySet();
        AbstractC0295Gu.m625r(-532262412089397L);
        List<Map.Entry> listM4908r0 = AbstractC2453ra.m4908r0(setEntrySet);
        if (listM4908r0.isEmpty()) {
            return;
        }
        ArrayList<String> arrayList = new ArrayList();
        for (Map.Entry entry : listM4908r0) {
            if (AbstractC0585Nj.m1134a(((LuaTaskRef) entry.getValue()).getLua(), lua)) {
                Object key = entry.getKey();
                AbstractC0295Gu.m625r(-532344016468021L);
                arrayList.add(key);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            ScheduledFuture<?> scheduledFutureRemove = scheduledTasks.remove(str);
            if (scheduledFutureRemove != null) {
                scheduledFutureRemove.cancel(true);
            }
            LuaTaskRef luaTaskRefRemove = taskRefs.remove(str);
            if (luaTaskRefRemove != null) {
                arrayList2.add(luaTaskRefRemove);
            }
        }
        if (!arrayList2.isEmpty()) {
            runOnUiThread(new C0693Q4(3, arrayList2));
        }
        AbstractC0295Gu.m625r(-532408440977461L);
        AbstractC0295Gu.m625r(-533026916268085L);
        arrayList.size();
    }

    public final void register(Lua lua) {
        AbstractC0295Gu.m625r(-534238097045557L);
        lua.createTable(0, 15);
        lua.push(new C2789z8(7));
        lua.setField(-2, AbstractC0295Gu.m625r(-534255276914741L));
        lua.push(new C2789z8(12));
        lua.setField(-2, AbstractC0295Gu.m625r(-534315406456885L));
        lua.push(new C2789z8(13));
        lua.setField(-2, AbstractC0295Gu.m625r(-533817190250549L));
        lua.push(new C2789z8(14));
        lua.setField(-2, AbstractC0295Gu.m625r(-533842960054325L));
        lua.push(new C2789z8(15));
        lua.setField(-2, AbstractC0295Gu.m625r(-533881614759989L));
        lua.push(new C2789z8(16));
        lua.setField(-2, AbstractC0295Gu.m625r(-533937449334837L));
        lua.push(new C2789z8(17));
        lua.setField(-2, AbstractC0295Gu.m625r(-533967514105909L));
        lua.push(new C2789z8(18));
        lua.setField(-2, AbstractC0295Gu.m625r(-534010463778869L));
        lua.push(new C2789z8(8));
        lua.setField(-2, AbstractC0295Gu.m625r(-534036233582645L));
        lua.push(new C2789z8(9));
        lua.setField(-2, AbstractC0295Gu.m625r(-534083478222901L));
        lua.push(new C2789z8(10));
        lua.setField(-2, AbstractC0295Gu.m625r(-532494340323381L));
        lua.push(new C2789z8(11));
        lua.setField(-2, AbstractC0295Gu.m625r(-532520110127157L));
        AbstractC0295Gu.m625r(-532584534636597L);
        AbstractC0295Gu.m625r(-532653254113333L);
    }
}
