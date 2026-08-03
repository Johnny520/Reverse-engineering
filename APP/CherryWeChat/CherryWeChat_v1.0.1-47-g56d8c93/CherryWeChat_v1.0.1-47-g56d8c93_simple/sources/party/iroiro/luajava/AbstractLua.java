package party.iroiro.luajava;

import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import party.iroiro.luajava.Lua;
import party.iroiro.luajava.LuaException;
import party.iroiro.luajava.LuaInstances;
import party.iroiro.luajava.cleaner.LuaReferable;
import party.iroiro.luajava.cleaner.LuaReference;
import party.iroiro.luajava.util.ClassUtils;
import party.iroiro.luajava.util.Type;
import party.iroiro.luajava.value.AbstractRefLuaValue;
import party.iroiro.luajava.value.ImmutableLuaValue;
import party.iroiro.luajava.value.LuaFunction;
import party.iroiro.luajava.value.LuaTableValue;
import party.iroiro.luajava.value.LuaValue;
import party.iroiro.luajava.value.RefLuaValue;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractLua implements Lua {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Object[] EMPTY = null;
    protected static final LuaInstances<AbstractLua> instances = null;

    /* JADX INFO: renamed from: C */
    protected final LuaNatives f8312C;

    /* JADX INFO: renamed from: L */
    protected final long f8313L;

    /* JADX INFO: renamed from: id */
    protected volatile int f8314id;
    protected volatile ExternalLoader loader;
    protected final AbstractLua mainThread;
    protected final ConcurrentHashMap<Integer, LuaReference<?>> recordedReferences;
    protected final ReferenceQueue<LuaReferable> recyclableReferences;
    protected volatile LuaValue requireFunction;
    protected final List<Lua> subThreads;

    /* JADX INFO: renamed from: party.iroiro.luajava.AbstractLua$1 */
    public static /* synthetic */ class C23601 {
        static final /* synthetic */ int[] $SwitchMap$party$iroiro$luajava$Lua$LuaType = null;

        static {
            int[] r0 = new int[Lua.LuaType.values().length];
            $SwitchMap$party$iroiro$luajava$Lua$LuaType = r0;
            r0[Lua.LuaType.NIL.ordinal()] = 1;     // Catch: NoSuchFieldError -> L12
        L20:
            $SwitchMap$party$iroiro$luajava$Lua$LuaType[Lua.LuaType.NONE.ordinal()] = 2;     // Catch: NoSuchFieldError -> L13
        L24:
            $SwitchMap$party$iroiro$luajava$Lua$LuaType[Lua.LuaType.BOOLEAN.ordinal()] = 3;     // Catch: NoSuchFieldError -> L14
        L34:
            $SwitchMap$party$iroiro$luajava$Lua$LuaType[Lua.LuaType.NUMBER.ordinal()] = 4;     // Catch: NoSuchFieldError -> L15
        L22:
            $SwitchMap$party$iroiro$luajava$Lua$LuaType[Lua.LuaType.STRING.ordinal()] = 5;     // Catch: NoSuchFieldError -> L16
        L26:
            $SwitchMap$party$iroiro$luajava$Lua$LuaType[Lua.LuaType.TABLE.ordinal()] = 6;     // Catch: NoSuchFieldError -> L17
        L28:
            $SwitchMap$party$iroiro$luajava$Lua$LuaType[Lua.LuaType.USERDATA.ordinal()] = 7;     // Catch: NoSuchFieldError -> L18
        L30:
            $SwitchMap$party$iroiro$luajava$Lua$LuaType[Lua.LuaType.FUNCTION.ordinal()] = 8;     // Catch: NoSuchFieldError -> L19
            return;
        }
    }

    public static class LuaFunctionWrapper implements JFunction {
        private final LuaFunction function;

        public LuaFunctionWrapper(LuaFunction r1) {
            this.function = r1;
        }

        @Override // party.iroiro.luajava.JFunction
        public int __call(Lua r7) {
            int r0 = r7.getTop();
            LuaValue[] r1 = new LuaValue[r0];
            int r3 = 0;
        L3:
            if (r3 >= r0) goto L5;
            r1[(r0 - r3) - 1] = r7.get();
            r3 = r3 + 1;
            goto L3
        L5:
            LuaValue[] r02 = this.function.call(r7, r1);
            if (r02 == null) goto L10;
            int r12 = r02.length;
            int r32 = 0;
        L8:
            if (r32 >= r12) goto L10;
            r7.push(r02[r32]);
            r32 = r32 + 1;
        L10:
            if (r02 != null) goto L13;
            return 0;
        L13:
            return r02.length;
        }
    }

    static {
        EMPTY = new Object[0];
        instances = new LuaInstances();
    }

    public AbstractLua(LuaNatives r3) {
        this.f8312C = r3;
        this.f8314id = instances.add(this);
        this.f8313L = r3.luaL_newstate(this.f8314id);
        this.mainThread = this;
        this.subThreads = new LinkedList();
        this.loader = null;
        this.requireFunction = null;
        this.recyclableReferences = new ReferenceQueue();
        this.recordedReferences = new ConcurrentHashMap();
    }

    public static int adopt(int r2, long r3) {
        AbstractLua r22 = getInstance(r2);
        LuaInstances.Token<AbstractLua> r0 = instances.add();
        AbstractLua r32 = r22.newThread(r3, r0.f8317id, r22);
        r22.addSubThread(r32);
        r0.setter.accept(r32);
        return r0.f8317id;
    }

    private void appendCustomDescriptor(Class<?> r2, StringBuilder r3) {
        if (r2.isPrimitive() == false) goto L6;
        r3.append(Type.getPrimitiveDescriptor(r2));
        return;
    L6:
        r3.append("_");
    }

    public static AbstractLua getInstance(int r1) {
        AbstractLua r12 = instances.get(r1);
        Objects.requireNonNull(r12);
        return r12;
    }

    private void recycleReferences() {
        LuaReference r0 = (LuaReference) this.mainThread.recyclableReferences.poll();
    L3:
        if (r0 == null) goto L5;
        this.mainThread.recordedReferences.remove(Integer.valueOf(r0.getReference()));
        unref(r0.getReference());
        r0 = (LuaReference) this.mainThread.recyclableReferences.poll();
        goto L3
    }

    public void addSubThread(Lua r3) {
        List<Lua> r0 = this.subThreads;
        Objects.requireNonNull(r0);
        List<Lua> r02 = r0;
        monitor-enter(r02);
        this.subThreads.add(r3);     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public void checkError(int r3, boolean r4) {
        if (r4 == false) goto L6;
        if (r3 != 0) goto L5;
        LuaException.LuaError r32 = LuaException.LuaError.f8316OK;
    L8:
        if (r32 != LuaException.LuaError.f8316OK) goto L11;
        return;
    L11:
        if (type(-1) != Lua.LuaType.STRING) goto L13;
        String r42 = toString(-1);
        Objects.requireNonNull(r42);
        pop(1);
    L14:
        LuaException r0 = new LuaException(r32, r42);
        Throwable r33 = getJavaError();
        if (r33 == null) goto L18;
        r0.initCause(r33);
        error(null);
        throw r0;
    L18:
        throw r0;
    L13:
        r42 = "Lua-side error";
        goto L14
    L5:
        r32 = LuaException.LuaError.RUNTIME;
        goto L8
    L6:
        r32 = convertError(r3);
        goto L8
    }

    @Override // party.iroiro.luajava.Lua
    public void checkStack(int r4) {
        recycleReferences();
        if (this.f8312C.lua_checkstack(this.f8313L, r4) == 0) goto L6;
        return;
    L6:
        throw new RuntimeException("No more stack space available");
    }

    @Override // party.iroiro.luajava.Lua, java.lang.AutoCloseable
    public void close() {
        AbstractLua r0 = this.mainThread;
        monitor-enter(r0);
        AbstractLua r1 = this.mainThread;     // Catch: Throwable -> L10
        if (r1 == this) goto L7;
        List<Lua> r12 = r1.subThreads;     // Catch: Throwable -> L10
        monitor-enter(r12);     // Catch: Throwable -> L10
    L32:
        th = move-exception;
        throw th;     // Catch: Throwable -> L10
    L28:
        if (this.mainThread.isClosed() == false) goto L30;
    L34:
        monitor-exit(r12);     // Catch: Throwable -> L32
    L35:
        monitor-exit(r0);     // Catch: Throwable -> L10
        return;
    L30:
        if (this.mainThread.subThreads.remove(this) == false) goto L34;
        this.f8312C.luaJ_removestateindex(this.f8313L);     // Catch: Throwable -> L32
        instances.remove(this.f8314id);     // Catch: Throwable -> L32
        goto L34
    L7:
        if (isClosed() == false) goto L12;
        monitor-exit(r0);     // Catch: Throwable -> L10
        return;
    L12:
        List<Lua> r13 = this.subThreads;     // Catch: Throwable -> L10
        monitor-enter(r13);     // Catch: Throwable -> L10
        Iterator<Lua> r2 = this.subThreads.iterator();     // Catch: Throwable -> L18
    L16:
        if (r2.hasNext() == false) goto L20;
        Lua r3 = r2.next();     // Catch: Throwable -> L18
        instances.remove(r3.getId());     // Catch: Throwable -> L18
        goto L16
    L20:
        this.subThreads.clear();     // Catch: Throwable -> L18
        instances.remove(this.f8314id);     // Catch: Throwable -> L18
        this.f8314id = -1;     // Catch: Throwable -> L18
        this.f8312C.lua_close(this.f8313L);     // Catch: Throwable -> L18
        monitor-exit(r13);     // Catch: Throwable -> L18
    L18:
        th = move-exception;
        throw th;     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        throw th;
    }

    @Override // party.iroiro.luajava.Lua
    public void concat(int r4) {
        if (r4 != 0) goto L4;
        checkStack(1);
    L4:
        this.f8312C.lua_concat(this.f8313L, r4);
    }

    public abstract LuaException.LuaError convertError(int r1);

    public abstract Lua.LuaType convertType(int r1);

    @Override // party.iroiro.luajava.Lua
    public Object createProxy(Class<?>[] r5, Lua.Conversion r6) {
        if (r5.length < 1) goto L18;
        int[] r0 = C23601.$SwitchMap$party$iroiro$luajava$Lua$LuaType;
        Lua.LuaType r2 = type(-1);
        Objects.requireNonNull(r2);
        int r02 = r0[r2.ordinal()];
        if (r02 != 6) goto L7;
    L20:
        LuaProxy r03 = new LuaProxy(ref(), this, r6, r5);     // Catch: Throwable -> L15
        this.mainThread.recordedReferences.put(Integer.valueOf(r03.getReference()), new LuaReference(r03, this.mainThread.recyclableReferences));     // Catch: Throwable -> L15
        return Proxy.newProxyInstance(ClassUtils.getDefaultClassLoader(), r5, r03);
    L15:
        th = move-exception;
        throw new IllegalArgumentException(th);
    L7:
        if (r02 != 8) goto L18;
        String r04 = ClassUtils.getLuaFunctionalDescriptor(r5);
        if (r04 == null) goto L11;
        createTable(0, 1);
        insert(getTop() - 1);
        setField(-2, r04);
        goto L20
    L11:
        pop(1);
        throw new IllegalArgumentException("Unable to merge interfaces into a functional one");
    L18:
        pop(1);
        throw new IllegalArgumentException("Expecting a table / function and interfaces");
    }

    @Override // party.iroiro.luajava.Lua
    public void createTable(int r4, int r5) {
        checkStack(1);
        this.f8312C.lua_createtable(this.f8313L, r4, r5);
    }

    @Override // party.iroiro.luajava.Lua
    public ByteBuffer dump() {
        return (ByteBuffer) this.f8312C.luaJ_dumptobuffer(this.f8313L);
    }

    @Override // party.iroiro.luajava.Lua
    public boolean equal(int r7, int r8) {
        if (this.f8312C.luaJ_compare(this.f8313L, r7, r8, 0) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // party.iroiro.luajava.Lua
    public void error(String r2) {
        throw new RuntimeException(r2);
    }

    @Override // party.iroiro.luajava.value.LuaThread
    public LuaValue[] eval(String r2) {
        load(r2);
        return get().call(new Object[0]);
    }

    @Override // party.iroiro.luajava.value.LuaThread
    public LuaValue from(boolean r1) {
        if (r1 == false) goto L6;
        return ImmutableLuaValue.TRUE(this);
    L6:
        return ImmutableLuaValue.FALSE(this);
    }

    @Override // party.iroiro.luajava.value.LuaThread
    public LuaValue fromNull() {
        return ImmutableLuaValue.NIL(this);
    }

    @Override // party.iroiro.luajava.Lua
    /* JADX INFO: renamed from: gc */
    public void mo4795gc() {
        recycleReferences();
        this.f8312C.luaJ_gc(this.f8313L);
    }

    @Override // party.iroiro.luajava.value.LuaThread
    public LuaValue get(String r1) {
        getGlobal(r1);
        return get();
    }

    @Override // party.iroiro.luajava.Lua
    public void getField(int r4, String r5) {
        checkStack(1);
        this.f8312C.luaJ_getfield(this.f8313L, r4, r5);
    }

    @Override // party.iroiro.luajava.Lua
    public void getGlobal(String r4) {
        checkStack(1);
        this.f8312C.luaJ_getglobal(this.f8313L, r4);
    }

    @Override // party.iroiro.luajava.Lua
    public int getId() {
        return this.f8314id;
    }

    @Override // party.iroiro.luajava.Lua
    public Throwable getJavaError() {
        getGlobal(Lua.GLOBAL_THROWABLE);
        Object r0 = toJavaObject(-1);
        pop(1);
        if ((r0 instanceof Throwable) == true) goto L5;
        return null;
    L5:
        return (Throwable) r0;
    }

    @Override // party.iroiro.luajava.Lua
    public LuaNatives getLuaNatives() {
        return this.f8312C;
    }

    @Override // party.iroiro.luajava.Lua
    public /* bridge */ /* synthetic */ Lua getMainState() {
        return getMainState();
    }

    @Override // party.iroiro.luajava.Lua
    public int getMetaField(int r4, String r5) {
        checkStack(1);
        return this.f8312C.luaL_getmetafield(this.f8313L, r4, r5);
    }

    @Override // party.iroiro.luajava.Lua
    public int getMetatable(int r4) {
        checkStack(1);
        return this.f8312C.lua_getmetatable(this.f8313L, r4);
    }

    @Override // party.iroiro.luajava.Lua
    public long getPointer() {
        return this.f8313L;
    }

    @Override // party.iroiro.luajava.Lua
    public void getRegisteredMetatable(String r4) {
        checkStack(1);
        this.f8312C.luaJ_getmetatable(this.f8313L, r4);
    }

    @Override // party.iroiro.luajava.Lua
    public void getTable(int r4) {
        this.f8312C.luaJ_gettable(this.f8313L, r4);
    }

    @Override // party.iroiro.luajava.Lua
    public int getTop() {
        return this.f8312C.lua_gettop(this.f8313L);
    }

    @Override // party.iroiro.luajava.Lua
    public void insert(int r4) {
        this.f8312C.lua_insert(this.f8313L, r4);
    }

    public Object invokeSpecial(Object r11, Method r12, Object[] r13) {
        if (ClassUtils.isDefault(r12) == false) goto L27;
        if (r13 != null) goto L6;
        r13 = EMPTY;
    L6:
        int r0 = r13.length - 1;
    L7:
        if (r0 < 0) goto L13;
        Object r2 = r13[r0];
        if (r2 != null) goto L11;
        pushNil();
    L12:
        r0 = r0 - 1;
        goto L7
    L11:
        pushJavaObject(r2);
        goto L12
    L13:
        StringBuilder r02 = new StringBuilder(r13.length + 1);
        Class<?>[] r132 = r12.getParameterTypes();
        int r22 = r132.length;
        int r3 = 0;
    L14:
        if (r3 >= r22) goto L16;
        appendCustomDescriptor(r132[r3], r02);
        r3 = r3 + 1;
        goto L14
    L16:
        appendCustomDescriptor(r12.getReturnType(), r02);
        if (this.f8312C.luaJ_invokespecial(this.f8313L, r12.getDeclaringClass(), r12.getName(), Type.getMethodDescriptor(r12), r11, r02.toString()) != (-1)) goto L19;
        Throwable r112 = getJavaError();
        pop(1);
        Objects.requireNonNull(r112);
        throw r112;
    L19:
        if (r12.getReturnType() != Void.TYPE) goto L22;
        return null;
    L22:
        Object r113 = toJavaObject(-1);
        pop(1);
        return r113;
    L27:
        throw new IncompatibleClassChangeError("Unable to invoke non-default method");
    }

    @Override // party.iroiro.luajava.Lua
    public boolean isBoolean(int r4) {
        if (this.f8312C.lua_isboolean(this.f8313L, r4) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean isClosed() {
        if (this.f8314id != (-1)) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // party.iroiro.luajava.Lua
    public boolean isFunction(int r4) {
        if (this.f8312C.lua_isfunction(this.f8313L, r4) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // party.iroiro.luajava.Lua
    public boolean isInteger(int r4) {
        if (this.f8312C.luaJ_isinteger(this.f8313L, r4) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // party.iroiro.luajava.Lua
    public boolean isJavaObject(int r4) {
        if (this.f8312C.luaJ_isobject(this.f8313L, r4) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // party.iroiro.luajava.Lua
    public boolean isNil(int r4) {
        if (this.f8312C.lua_isnil(this.f8313L, r4) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // party.iroiro.luajava.Lua
    public boolean isNone(int r4) {
        if (this.f8312C.lua_isnone(this.f8313L, r4) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // party.iroiro.luajava.Lua
    public boolean isNoneOrNil(int r4) {
        if (this.f8312C.lua_isnoneornil(this.f8313L, r4) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // party.iroiro.luajava.Lua
    public boolean isNumber(int r4) {
        if (this.f8312C.lua_isnumber(this.f8313L, r4) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // party.iroiro.luajava.Lua
    public boolean isString(int r4) {
        if (this.f8312C.lua_isstring(this.f8313L, r4) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // party.iroiro.luajava.Lua
    public boolean isTable(int r4) {
        if (this.f8312C.lua_istable(this.f8313L, r4) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // party.iroiro.luajava.Lua
    public boolean isThread(int r4) {
        if (this.f8312C.lua_isthread(this.f8313L, r4) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // party.iroiro.luajava.Lua
    public boolean isUserdata(int r4) {
        if (this.f8312C.lua_isuserdata(this.f8313L, r4) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // party.iroiro.luajava.Lua
    public boolean lessThan(int r7, int r8) {
        if (this.f8312C.luaJ_compare(this.f8313L, r7, r8, -1) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // party.iroiro.luajava.Lua
    public void load(String r4) {
        checkStack(1);
        checkError(this.f8312C.luaL_loadstring(this.f8313L, r4), false);
    }

    @Override // party.iroiro.luajava.Lua
    public void loadExternal(String r3) {
        ExternalLoader r0 = this.mainThread.loader;
        if (r0 == null) goto L11;
        Buffer r02 = r0.load(r3, this);
        if (r02 == null) goto L9;
        load(r02, r3);
        return;
    L9:
        throw new LuaException(LuaException.LuaError.FILE, "Loader returned null");
    L11:
        throw new LuaException(LuaException.LuaError.RUNTIME, "External loader not set");
    }

    @Override // party.iroiro.luajava.Lua
    public int newRegisteredMetatable(String r4) {
        checkStack(1);
        return this.f8312C.luaL_newmetatable(this.f8313L, r4);
    }

    @Override // party.iroiro.luajava.Lua
    public void newTable() {
        createTable(0, 0);
    }

    public abstract AbstractLua newThread(long r1, int r3, AbstractLua r4);

    @Override // party.iroiro.luajava.Lua
    public /* bridge */ /* synthetic */ Lua newThread() {
        return newThread();
    }

    @Override // party.iroiro.luajava.Lua
    public int next(int r4) {
        checkStack(1);
        return this.f8312C.lua_next(this.f8313L, r4);
    }

    @Override // party.iroiro.luajava.Lua
    public void openLibraries() {
        checkStack(1);
        this.f8312C.luaL_openlibs(this.f8313L);
        this.f8312C.luaJ_initloader(this.f8313L);
    }

    @Override // party.iroiro.luajava.Lua
    public void openLibrary(String r4) {
        checkStack(1);
        this.f8312C.luaJ_openlib(this.f8313L, r4);
        if ("package".equals(r4) == false) goto L6;
        this.f8312C.luaJ_initloader(this.f8313L);
        return;
    }

    @Override // party.iroiro.luajava.Lua
    public void pCall(int r9, int r10) {
        checkStack(Math.max((r10 - r9) - 1, 0));
        checkError(this.f8312C.lua_pcall(this.f8313L, r9, r10, 0), false);
    }

    @Override // party.iroiro.luajava.Lua
    public void pop(int r4) {
        if (r4 < 0) goto L8;
        if (getTop() < r4) goto L8;
        this.f8312C.lua_pop(this.f8313L, r4);
        return;
    L8:
        throw new LuaException(LuaException.LuaError.MEMORY, "invalid number of items to pop");
    }

    @Override // party.iroiro.luajava.Lua
    public void push(Object r2, Lua.Conversion r3) {
        checkStack(1);
        if (r2 != null) goto L7;
        pushNil();
        return;
    L7:
        if ((r2 instanceof LuaValue) == false) goto L11;
        ((LuaValue) r2).push(this);
        return;
    L11:
        if ((r2 instanceof LuaFunction) == false) goto L15;
        push((LuaFunction) r2);
        return;
    L15:
        if (r3 != Lua.Conversion.NONE) goto L19;
        pushJavaObjectOrArray(r2);
        return;
    L19:
        if ((r2 instanceof Boolean) == false) goto L23;
        push(((Boolean) r2).booleanValue());
        return;
    L23:
        if ((r2 instanceof String) == false) goto L27;
        push((String) r2);
        return;
    L27:
        if ((r2 instanceof Integer) == false) goto L29;
    L78:
        push(((Number) r2).intValue());
        return;
    L29:
        if ((r2 instanceof Byte) == true) goto L78;
        if ((r2 instanceof Short) == true) goto L78;
        if ((r2 instanceof Character) == false) goto L38;
        push(((Character) r2).charValue());
        return;
    L38:
        if ((r2 instanceof Long) == false) goto L42;
        push(((Long) r2).longValue());
        return;
    L42:
        if ((r2 instanceof Float) == false) goto L44;
    L76:
        push((Number) r2);
        return;
    L44:
        if ((r2 instanceof Double) == true) goto L76;
        if ((r2 instanceof JFunction) == false) goto L51;
        push((JFunction) r2);
        return;
    L51:
        if (r3 != Lua.Conversion.SEMI) goto L55;
        pushJavaObjectOrArray(r2);
        return;
    L55:
        if ((r2 instanceof Class) == false) goto L59;
        pushJavaClass((Class) r2);
        return;
    L59:
        if ((r2 instanceof Map) == false) goto L63;
        push((Map) r2);
        return;
    L63:
        if ((r2 instanceof Collection) == false) goto L67;
        push((Collection) r2);
        return;
    L67:
        if (r2.getClass().isArray() == false) goto L71;
        pushArray(r2);
        return;
    L71:
        if ((r2 instanceof ByteBuffer) == false) goto L74;
        push((ByteBuffer) r2);
        return;
    L74:
        pushJavaObject(r2);
    }

    @Override // party.iroiro.luajava.Lua
    public void pushArray(Object r7) {
        checkStack(2);
        if (r7.getClass().isArray() == false) goto L9;
        int r0 = Array.getLength(r7);
        int r4 = 0;
        this.f8312C.lua_createtable(this.f8313L, r0, 0);
    L5:
        if (r4 == r0) goto L7;
        push(Array.get(r7, r4), Lua.Conversion.FULL);
        r4 = r4 + 1;
        this.f8312C.lua_rawseti(this.f8313L, -2, r4);
        goto L5
    L7:
        return;
    L9:
        throw new IllegalArgumentException("Not an array");
    }

    @Override // party.iroiro.luajava.Lua
    public void pushJavaArray(Object r4) {
        if (r4.getClass().isArray() == false) goto L7;
        checkStack(1);
        this.f8312C.luaJ_pusharray(this.f8313L, r4);
        return;
    L7:
        throw new IllegalArgumentException("Expecting non-array argument");
    }

    @Override // party.iroiro.luajava.Lua
    public void pushJavaClass(Class<?> r4) {
        checkStack(1);
        this.f8312C.luaJ_pushclass(this.f8313L, r4);
    }

    @Override // party.iroiro.luajava.Lua
    public void pushJavaObject(Object r4) {
        if (r4.getClass().isArray() == true) goto L7;
        checkStack(1);
        this.f8312C.luaJ_pushobject(this.f8313L, r4);
        return;
    L7:
        throw new IllegalArgumentException("Expecting non-array argument");
    }

    public void pushJavaObjectOrArray(Object r2) {
        checkStack(1);
        if (r2.getClass().isArray() == false) goto L6;
        pushJavaArray(r2);
        return;
    L6:
        pushJavaObject(r2);
    }

    @Override // party.iroiro.luajava.Lua
    public void pushNil() {
        checkStack(1);
        this.f8312C.lua_pushnil(this.f8313L);
    }

    @Override // party.iroiro.luajava.Lua
    public void pushThread() {
        checkStack(1);
        this.f8312C.lua_pushthread(this.f8313L);
    }

    @Override // party.iroiro.luajava.Lua
    public void pushValue(int r4) {
        checkStack(1);
        this.f8312C.lua_pushvalue(this.f8313L, r4);
    }

    @Override // party.iroiro.luajava.Lua
    public boolean rawEqual(int r4, int r5) {
        if (this.f8312C.lua_rawequal(this.f8313L, r4, r5) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // party.iroiro.luajava.Lua
    public void rawGet(int r4) {
        this.f8312C.luaJ_rawget(this.f8313L, r4);
    }

    @Override // party.iroiro.luajava.Lua
    public void rawGetI(int r4, int r5) {
        checkStack(1);
        this.f8312C.luaJ_rawgeti(this.f8313L, r4, r5);
    }

    @Override // party.iroiro.luajava.Lua
    public int rawLength(int r4) {
        checkStack(1);
        return this.f8312C.luaJ_len(this.f8313L, r4);
    }

    @Override // party.iroiro.luajava.Lua
    public void rawSet(int r4) {
        this.f8312C.lua_rawset(this.f8313L, r4);
    }

    @Override // party.iroiro.luajava.Lua
    public void rawSetI(int r4, int r5) {
        this.f8312C.lua_rawseti(this.f8313L, r4, r5);
    }

    @Override // party.iroiro.luajava.Lua
    public int ref(int r4) {
        return this.f8312C.luaL_ref(this.f8313L, r4);
    }

    @Override // party.iroiro.luajava.Lua
    public void refGet(int r2) {
        rawGetI(this.f8312C.getRegistryIndex(), r2);
    }

    @Override // party.iroiro.luajava.value.LuaThread
    public void register(String r1, LuaFunction r2) {
        push(r2);
        setGlobal(r1);
    }

    @Override // party.iroiro.luajava.Lua
    public void remove(int r4) {
        this.f8312C.lua_remove(this.f8313L, r4);
    }

    @Override // party.iroiro.luajava.Lua
    public void replace(int r4) {
        this.f8312C.lua_replace(this.f8313L, r4);
    }

    @Override // party.iroiro.luajava.value.LuaThread
    public LuaValue require(String r5) {
        LuaValue r0 = this.requireFunction;
        if (r0 != null) goto L9;
        LuaValue r1 = get("require");
        if (r1.type() == Lua.LuaType.FUNCTION) goto L7;
        openLibrary("package");
        r0 = get("require");
        this.requireFunction = r0;
        goto L9
    L7:
        r0 = r1;
    L9:
        return r0.call(new Object[]{r5})[0];
    }

    @Override // party.iroiro.luajava.Lua
    public boolean resume(int r4) {
        int r42 = this.f8312C.luaJ_resume(this.f8313L, r4);
        if (convertError(r42) != LuaException.LuaError.YIELD) goto L6;
        return true;
    L6:
        checkError(r42, false);
        return false;
    }

    @Override // party.iroiro.luajava.Lua
    public void run(String r5) {
        checkStack(1);
        checkError(this.f8312C.luaL_dostring(this.f8313L, r5), true);
    }

    @Override // party.iroiro.luajava.value.LuaThread
    public void set(String r2, Object r3) {
        push(r3, Lua.Conversion.SEMI);
        setGlobal(r2);
    }

    @Override // party.iroiro.luajava.Lua
    public void setExternalLoader(ExternalLoader r2) {
        this.mainThread.loader = r2;
    }

    @Override // party.iroiro.luajava.Lua
    public void setField(int r4, String r5) {
        this.f8312C.lua_setfield(this.f8313L, r4, r5);
    }

    @Override // party.iroiro.luajava.Lua
    public void setGlobal(String r4) {
        this.f8312C.lua_setglobal(this.f8313L, r4);
    }

    @Override // party.iroiro.luajava.Lua
    public void setMetatable(int r4) {
        this.f8312C.luaJ_setmetatable(this.f8313L, r4);
    }

    @Override // party.iroiro.luajava.Lua
    public void setTable(int r4) {
        this.f8312C.lua_settable(this.f8313L, r4);
    }

    @Override // party.iroiro.luajava.Lua
    public void setTop(int r4) {
        this.f8312C.lua_settop(this.f8313L, r4);
    }

    public boolean shouldSynchronize() {
        return true;
    }

    @Override // party.iroiro.luajava.Lua
    public LuaException.LuaError status() {
        return convertError(this.f8312C.lua_status(this.f8313L));
    }

    public int toAbsoluteIndex(int r2) {
        if (r2 <= 0) goto L5;
    L6:
        return r2;
    L5:
        if (r2 <= this.f8312C.getRegistryIndex()) goto L6;
        if (r2 == 0) goto L11;
        return (getTop() + 1) + r2;
    L11:
        throw new IllegalArgumentException("Stack index should not be 0");
    }

    @Override // party.iroiro.luajava.Lua
    public boolean toBoolean(int r4) {
        if (this.f8312C.lua_toboolean(this.f8313L, r4) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // party.iroiro.luajava.Lua
    public ByteBuffer toBuffer(int r4) {
        return (ByteBuffer) this.f8312C.luaJ_tobuffer(this.f8313L, r4);
    }

    @Override // party.iroiro.luajava.Lua
    public ByteBuffer toDirectBuffer(int r4) {
        ByteBuffer r42 = (ByteBuffer) this.f8312C.luaJ_todirectbuffer(this.f8313L, r4);
        if (r42 != null) goto L7;
        return null;
    L7:
        return r42.asReadOnlyBuffer();
    }

    @Override // party.iroiro.luajava.Lua
    public long toInteger(int r4) {
        return this.f8312C.lua_tointeger(this.f8313L, r4);
    }

    @Override // party.iroiro.luajava.Lua
    public Object toJavaObject(int r4) {
        return this.f8312C.luaJ_toobject(this.f8313L, r4);
    }

    @Override // party.iroiro.luajava.Lua
    public List<?> toList(int r8) {
        Object r0 = toJavaObject(r8);
        if ((r0 instanceof List) == true) goto L5;
        checkStack(1);
        if (this.f8312C.lua_istable(this.f8313L, r8) != 1) goto L12;
        int r1 = rawLength(r8);
        ArrayList r2 = new ArrayList();
        r2.ensureCapacity(r1);
        int r3 = 1;
    L9:
        if (r3 > r1) goto L11;
        this.f8312C.luaJ_rawgeti(this.f8313L, r8, r3);
        r2.add(toObject(-1));
        pop(1);
        r3 = r3 + 1;
        goto L9
    L11:
        return r2;
    L12:
        return null;
    L5:
        return (List) r0;
    }

    @Override // party.iroiro.luajava.Lua
    public Map<?, ?> toMap(int r6) {
        Object r0 = toJavaObject(r6);
        if ((r0 instanceof Map) == true) goto L5;
        checkStack(2);
        int r62 = toAbsoluteIndex(r6);
        if (this.f8312C.lua_istable(this.f8313L, r62) != 1) goto L13;
        this.f8312C.lua_pushnil(this.f8313L);
        HashMap r02 = new HashMap();
    L10:
        if (this.f8312C.lua_next(this.f8313L, r62) == 0) goto L12;
        r02.put(toObject(-2), toObject(-1));
        pop(1);
        goto L10
    L12:
        return r02;
    L13:
        return null;
    L5:
        return (Map) r0;
    }

    @Override // party.iroiro.luajava.Lua
    public double toNumber(int r4) {
        return this.f8312C.lua_tonumber(this.f8313L, r4);
    }

    @Override // party.iroiro.luajava.Lua
    public Object toObject(int r4) {
        Lua.LuaType r0 = type(r4);
        if (r0 != null) goto L6;
        return null;
    L6:
        switch(C23601.$SwitchMap$party$iroiro$luajava$Lua$LuaType[r0.ordinal()]) {
            case 1: goto L19;
            case 2: goto L19;
            case 3: goto L18;
            case 4: goto L16;
            case 5: goto L14;
            case 6: goto L12;
            case 7: goto L10;
            default: goto L7;
        };
    L7:
        pushValue(r4);
        return get();
    L19:
        return null;
    L10:
        return toJavaObject(r4);
    L12:
        return toMap(r4);
    L14:
        return toString(r4);
    L16:
        return Double.valueOf(toNumber(r4));
    L18:
        return Boolean.valueOf(toBoolean(r4));
    }

    @Override // party.iroiro.luajava.Lua
    public String toString(int r4) {
        return this.f8312C.lua_tostring(this.f8313L, r4);
    }

    @Override // party.iroiro.luajava.Lua
    public Lua.LuaType type(int r4) {
        return convertType(this.f8312C.lua_type(this.f8313L, r4));
    }

    @Override // party.iroiro.luajava.Lua
    public void unRef(int r4, int r5) {
        this.f8312C.luaL_unref(this.f8313L, r4, r5);
    }

    @Override // party.iroiro.luajava.Lua
    public void unref(int r2) {
        unRef(this.f8312C.getRegistryIndex(), r2);
    }

    @Override // party.iroiro.luajava.Lua
    public void xMove(Lua r9, int r10) {
        if ((r9 instanceof AbstractLua) == false) goto L9;
        if (((AbstractLua) r9).mainThread != this.mainThread) goto L9;
        r9.checkStack(r10);
        this.f8312C.lua_xmove(this.f8313L, r9.getPointer(), r10);
        return;
    L9:
        throw new IllegalArgumentException("Not sharing same global state");
    }

    @Override // party.iroiro.luajava.Lua
    public void yield(int r2) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override // party.iroiro.luajava.Lua
    public int error(Throwable r2) {
        if (r2 != null) goto L6;
        pushNil();
        setGlobal(Lua.GLOBAL_THROWABLE);
        return 0;
    L6:
        pushJavaObject(r2);
        setGlobal(Lua.GLOBAL_THROWABLE);
        push(r2.toString());
        return -1;
    }

    @Override // party.iroiro.luajava.value.LuaThread
    public LuaValue from(double r1) {
        return ImmutableLuaValue.NUMBER(this, r1);
    }

    @Override // party.iroiro.luajava.Lua
    public AbstractLua getMainState() {
        return this.mainThread;
    }

    @Override // party.iroiro.luajava.Lua
    public AbstractLua newThread() {
        checkStack(1);
        LuaInstances.Token<AbstractLua> r0 = instances.add();
        AbstractLua r1 = newThread(this.f8312C.luaJ_newthread(this.f8313L, r0.f8317id), r0.f8317id, this.mainThread);
        this.mainThread.addSubThread(r1);
        r0.setter.accept(r1);
        return r1;
    }

    @Override // party.iroiro.luajava.Lua
    public int ref() {
        return ref(this.f8312C.getRegistryIndex());
    }

    @Override // party.iroiro.luajava.value.LuaThread
    public LuaValue from(long r1) {
        return ImmutableLuaValue.LONG(this, r1);
    }

    @Override // party.iroiro.luajava.Lua
    public LuaValue get() {
        Lua.LuaType r1 = type(-1);
        int[] r2 = C23601.$SwitchMap$party$iroiro$luajava$Lua$LuaType;
        Objects.requireNonNull(r1);
        int r22 = r2[r1.ordinal()];
        if (r22 != 1) goto L5;
    L28:
        pop(1);
        return fromNull();
    L5:
        if (r22 == 2) goto L28;
        if (r22 != 3) goto L9;
        boolean r0 = toBoolean(-1);
        pop(1);
        return from(r0);
    L9:
        if (r22 == 4) goto L21;
        if (r22 != 5) goto L13;
        ByteBuffer r02 = toBuffer(-1);
        pop(1);
        return from(r02);
    L13:
        if (r1 != Lua.LuaType.TABLE) goto L15;
        AbstractRefLuaValue r03 = new LuaTableValue(this, r1);
    L16:
        this.mainThread.recordedReferences.put(Integer.valueOf(r03.getReference()), new LuaReference(r03, this.mainThread.recyclableReferences));
        return r03;
    L15:
        r03 = new RefLuaValue(this, r1);
        goto L16
    L21:
        if (isInteger(-1) == false) goto L23;
        LuaValue r04 = from(toInteger(-1));
    L24:
        pop(1);
        return r04;
    L23:
        r04 = from(toNumber(-1));
        goto L24
    }

    @Override // party.iroiro.luajava.Lua
    public void load(Buffer r9, String r10) {
        if (r9.isDirect() == false) goto L7;
        checkStack(1);
        checkError(this.f8312C.luaJ_loadbuffer(this.f8313L, r9, r9.position(), r9.remaining(), r10), false);
        return;
    L7:
        throw new LuaException(LuaException.LuaError.MEMORY, "Expecting a direct buffer");
    }

    @Override // party.iroiro.luajava.Lua
    public void run(Buffer r9, String r10) {
        if (r9.isDirect() == false) goto L7;
        checkStack(1);
        checkError(this.f8312C.luaJ_dobuffer(this.f8313L, r9, r9.position(), r9.remaining(), r10), true);
        return;
    L7:
        throw new LuaException(LuaException.LuaError.MEMORY, "Expecting a direct buffer");
    }

    @Override // party.iroiro.luajava.value.LuaThread
    public LuaValue from(String r1) {
        return ImmutableLuaValue.STRING(this, r1);
    }

    @Override // party.iroiro.luajava.value.LuaThread
    public LuaValue from(ByteBuffer r1) {
        return ImmutableLuaValue.BUFFER(this, r1);
    }

    @Override // party.iroiro.luajava.Lua
    public Object toObject(int r1, Class<?> r2) {
        return JuaAPI.convertFromLua(this, r2, r1);
    L4:
        return null;
    }

    public AbstractLua(LuaNatives r2, long r3, int r5, AbstractLua r6) {
        this.loader = null;
        this.f8312C = r2;
        this.f8313L = r3;
        this.mainThread = r6;
        this.f8314id = r5;
        this.subThreads = null;
        this.recyclableReferences = null;
        this.recordedReferences = null;
    }

    @Override // party.iroiro.luajava.Lua
    public void push(boolean r4) {
        checkStack(1);
        this.f8312C.lua_pushboolean(this.f8313L, r4 ? 1 : 0);
    }

    @Override // party.iroiro.luajava.Lua
    public void push(Number r6) {
        checkStack(1);
        this.f8312C.lua_pushnumber(this.f8313L, r6.doubleValue());
    }

    @Override // party.iroiro.luajava.Lua
    public void push(long r4) {
        checkStack(1);
        this.f8312C.lua_pushinteger(this.f8313L, r4);
    }

    @Override // party.iroiro.luajava.Lua
    public void push(String r4) {
        checkStack(1);
        this.f8312C.luaJ_pushstring(this.f8313L, r4);
    }

    @Override // party.iroiro.luajava.Lua
    public void push(ByteBuffer r8) {
        checkStack(1);
        if (r8.isDirect() == true) goto L5;
        ByteBuffer r0 = ByteBuffer.allocateDirect(r8.remaining());
        r0.put(r8);
        r0.flip();
        ByteBuffer r4 = r0;
    L6:
        this.f8312C.luaJ_pushlstring(this.f8313L, r4, r4.position(), r4.remaining());
        return;
    L5:
        r4 = r8;
        goto L6
    }

    @Override // party.iroiro.luajava.Lua
    public void push(Map<?, ?> r6) {
        checkStack(3);
        this.f8312C.lua_createtable(this.f8313L, 0, r6.size());
        Iterator<Map.Entry<?, ?>> r62 = r6.entrySet().iterator();
    L4:
        if (r62.hasNext() == false) goto L6;
        Map.Entry<?, ?> r0 = r62.next();
        Object r1 = r0.getKey();
        Lua.Conversion r2 = Lua.Conversion.FULL;
        push(r1, r2);
        push(r0.getValue(), r2);
        this.f8312C.lua_rawset(this.f8313L, -3);
        goto L4
    }

    @Override // party.iroiro.luajava.Lua
    public void push(Collection<?> r7) {
        checkStack(2);
        this.f8312C.lua_createtable(this.f8313L, r7.size(), 0);
        Iterator<?> r72 = r7.iterator();
        int r1 = 1;
    L4:
        if (r72.hasNext() == false) goto L6;
        push(r72.next(), Lua.Conversion.FULL);
        this.f8312C.lua_rawseti(this.f8313L, -2, r1);
        r1 = r1 + 1;
        goto L4
    }

    @Override // party.iroiro.luajava.Lua
    public void push(JFunction r4) {
        checkStack(1);
        this.f8312C.luaJ_pushfunction(this.f8313L, r4);
    }

    @Override // party.iroiro.luajava.Lua
    public void push(LuaValue r2) {
        checkStack(1);
        r2.push(this);
    }

    @Override // party.iroiro.luajava.Lua
    public void push(LuaFunction r2) {
        checkStack(1);
        push(new LuaFunctionWrapper(r2));
    }
}
