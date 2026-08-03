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
    private static final Object[] EMPTY = new Object[0];
    protected static final LuaInstances<AbstractLua> instances = new LuaInstances<>();

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
        static final /* synthetic */ int[] $SwitchMap$party$iroiro$luajava$Lua$LuaType;

        static {
            int[] iArr = new int[Lua.LuaType.values().length];
            $SwitchMap$party$iroiro$luajava$Lua$LuaType = iArr;
            try {
                iArr[Lua.LuaType.NIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$party$iroiro$luajava$Lua$LuaType[Lua.LuaType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$party$iroiro$luajava$Lua$LuaType[Lua.LuaType.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$party$iroiro$luajava$Lua$LuaType[Lua.LuaType.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$party$iroiro$luajava$Lua$LuaType[Lua.LuaType.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$party$iroiro$luajava$Lua$LuaType[Lua.LuaType.TABLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$party$iroiro$luajava$Lua$LuaType[Lua.LuaType.USERDATA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$party$iroiro$luajava$Lua$LuaType[Lua.LuaType.FUNCTION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static class LuaFunctionWrapper implements JFunction {
        private final LuaFunction function;

        public LuaFunctionWrapper(LuaFunction luaFunction) {
            this.function = luaFunction;
        }

        @Override // party.iroiro.luajava.JFunction
        public int __call(Lua lua) {
            int top = lua.getTop();
            LuaValue[] luaValueArr = new LuaValue[top];
            for (int i = 0; i < top; i++) {
                luaValueArr[(top - i) - 1] = lua.get();
            }
            LuaValue[] luaValueArrCall = this.function.call(lua, luaValueArr);
            if (luaValueArrCall != null) {
                for (LuaValue luaValue : luaValueArrCall) {
                    lua.push(luaValue);
                }
            }
            if (luaValueArrCall == null) {
                return 0;
            }
            return luaValueArrCall.length;
        }
    }

    public AbstractLua(LuaNatives luaNatives) {
        this.f8312C = luaNatives;
        this.f8314id = instances.add(this);
        this.f8313L = luaNatives.luaL_newstate(this.f8314id);
        this.mainThread = this;
        this.subThreads = new LinkedList();
        this.loader = null;
        this.requireFunction = null;
        this.recyclableReferences = new ReferenceQueue<>();
        this.recordedReferences = new ConcurrentHashMap<>();
    }

    public static int adopt(int i, long j) {
        AbstractLua abstractLua = getInstance(i);
        LuaInstances.Token<AbstractLua> tokenAdd = instances.add();
        AbstractLua abstractLuaNewThread = abstractLua.newThread(j, tokenAdd.f8317id, abstractLua);
        abstractLua.addSubThread(abstractLuaNewThread);
        tokenAdd.setter.accept(abstractLuaNewThread);
        return tokenAdd.f8317id;
    }

    private void appendCustomDescriptor(Class<?> cls, StringBuilder sb) {
        if (cls.isPrimitive()) {
            sb.append(Type.getPrimitiveDescriptor(cls));
        } else {
            sb.append("_");
        }
    }

    public static AbstractLua getInstance(int i) {
        AbstractLua abstractLua = instances.get(i);
        Objects.requireNonNull(abstractLua);
        return abstractLua;
    }

    private void recycleReferences() {
        LuaReference luaReference = (LuaReference) this.mainThread.recyclableReferences.poll();
        while (luaReference != null) {
            this.mainThread.recordedReferences.remove(Integer.valueOf(luaReference.getReference()));
            unref(luaReference.getReference());
            luaReference = (LuaReference) this.mainThread.recyclableReferences.poll();
        }
    }

    public void addSubThread(Lua lua) {
        List<Lua> list = this.subThreads;
        Objects.requireNonNull(list);
        synchronized (list) {
            this.subThreads.add(lua);
        }
    }

    public void checkError(int i, boolean z) {
        String string;
        LuaException.LuaError luaErrorConvertError = z ? i == 0 ? LuaException.LuaError.OK : LuaException.LuaError.RUNTIME : convertError(i);
        if (luaErrorConvertError == LuaException.LuaError.OK) {
            return;
        }
        if (type(-1) == Lua.LuaType.STRING) {
            string = toString(-1);
            Objects.requireNonNull(string);
            pop(1);
        } else {
            string = "Lua-side error";
        }
        LuaException luaException = new LuaException(luaErrorConvertError, string);
        Throwable javaError = getJavaError();
        if (javaError == null) {
            throw luaException;
        }
        luaException.initCause(javaError);
        error((Throwable) null);
        throw luaException;
    }

    @Override // party.iroiro.luajava.Lua
    public void checkStack(int i) {
        recycleReferences();
        if (this.f8312C.lua_checkstack(this.f8313L, i) == 0) {
            throw new RuntimeException("No more stack space available");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000f, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0076, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0078, code lost:
    
        throw r1;
     */
    @Override // party.iroiro.luajava.Lua, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void close() {
        synchronized (this.mainThread) {
            try {
                AbstractLua abstractLua = this.mainThread;
                if (abstractLua != this) {
                    synchronized (abstractLua.subThreads) {
                        if (!this.mainThread.isClosed() && this.mainThread.subThreads.remove(this)) {
                            this.f8312C.luaJ_removestateindex(this.f8313L);
                            instances.remove(this.f8314id);
                        }
                    }
                } else {
                    if (isClosed()) {
                        return;
                    }
                    synchronized (this.subThreads) {
                        Iterator<Lua> it = this.subThreads.iterator();
                        while (it.hasNext()) {
                            instances.remove(it.next().getId());
                        }
                        this.subThreads.clear();
                        instances.remove(this.f8314id);
                        this.f8314id = -1;
                        this.f8312C.lua_close(this.f8313L);
                    }
                }
            } finally {
            }
        }
    }

    @Override // party.iroiro.luajava.Lua
    public void concat(int i) {
        if (i == 0) {
            checkStack(1);
        }
        this.f8312C.lua_concat(this.f8313L, i);
    }

    public abstract LuaException.LuaError convertError(int i);

    public abstract Lua.LuaType convertType(int i);

    @Override // party.iroiro.luajava.Lua
    public Object createProxy(Class<?>[] clsArr, Lua.Conversion conversion) {
        if (clsArr.length >= 1) {
            int[] iArr = C23601.$SwitchMap$party$iroiro$luajava$Lua$LuaType;
            Lua.LuaType luaTypeType = type(-1);
            Objects.requireNonNull(luaTypeType);
            int i = iArr[luaTypeType.ordinal()];
            if (i != 6) {
                if (i == 8) {
                    String luaFunctionalDescriptor = ClassUtils.getLuaFunctionalDescriptor(clsArr);
                    if (luaFunctionalDescriptor == null) {
                        pop(1);
                        throw new IllegalArgumentException("Unable to merge interfaces into a functional one");
                    }
                    createTable(0, 1);
                    insert(getTop() - 1);
                    setField(-2, luaFunctionalDescriptor);
                }
            }
            try {
                LuaProxy luaProxy = new LuaProxy(ref(), this, conversion, clsArr);
                this.mainThread.recordedReferences.put(Integer.valueOf(luaProxy.getReference()), new LuaReference<>(luaProxy, this.mainThread.recyclableReferences));
                return Proxy.newProxyInstance(ClassUtils.getDefaultClassLoader(), clsArr, luaProxy);
            } catch (Throwable th) {
                throw new IllegalArgumentException(th);
            }
        }
        pop(1);
        throw new IllegalArgumentException("Expecting a table / function and interfaces");
    }

    @Override // party.iroiro.luajava.Lua
    public void createTable(int i, int i2) {
        checkStack(1);
        this.f8312C.lua_createtable(this.f8313L, i, i2);
    }

    @Override // party.iroiro.luajava.Lua
    public ByteBuffer dump() {
        return (ByteBuffer) this.f8312C.luaJ_dumptobuffer(this.f8313L);
    }

    @Override // party.iroiro.luajava.Lua
    public boolean equal(int i, int i2) {
        return this.f8312C.luaJ_compare(this.f8313L, i, i2, 0) != 0;
    }

    @Override // party.iroiro.luajava.Lua
    public void error(String str) {
        throw new RuntimeException(str);
    }

    @Override // party.iroiro.luajava.value.LuaThread
    public LuaValue[] eval(String str) {
        load(str);
        return get().call(new Object[0]);
    }

    @Override // party.iroiro.luajava.value.LuaThread
    public LuaValue from(boolean z) {
        return z ? ImmutableLuaValue.TRUE(this) : ImmutableLuaValue.FALSE(this);
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
    public LuaValue get(String str) {
        getGlobal(str);
        return get();
    }

    @Override // party.iroiro.luajava.Lua
    public void getField(int i, String str) {
        checkStack(1);
        this.f8312C.luaJ_getfield(this.f8313L, i, str);
    }

    @Override // party.iroiro.luajava.Lua
    public void getGlobal(String str) {
        checkStack(1);
        this.f8312C.luaJ_getglobal(this.f8313L, str);
    }

    @Override // party.iroiro.luajava.Lua
    public int getId() {
        return this.f8314id;
    }

    @Override // party.iroiro.luajava.Lua
    public Throwable getJavaError() {
        getGlobal(Lua.GLOBAL_THROWABLE);
        Object javaObject = toJavaObject(-1);
        pop(1);
        if (javaObject instanceof Throwable) {
            return (Throwable) javaObject;
        }
        return null;
    }

    @Override // party.iroiro.luajava.Lua
    public LuaNatives getLuaNatives() {
        return this.f8312C;
    }

    @Override // party.iroiro.luajava.Lua
    public int getMetaField(int i, String str) {
        checkStack(1);
        return this.f8312C.luaL_getmetafield(this.f8313L, i, str);
    }

    @Override // party.iroiro.luajava.Lua
    public int getMetatable(int i) {
        checkStack(1);
        return this.f8312C.lua_getmetatable(this.f8313L, i);
    }

    @Override // party.iroiro.luajava.Lua
    public long getPointer() {
        return this.f8313L;
    }

    @Override // party.iroiro.luajava.Lua
    public void getRegisteredMetatable(String str) {
        checkStack(1);
        this.f8312C.luaJ_getmetatable(this.f8313L, str);
    }

    @Override // party.iroiro.luajava.Lua
    public void getTable(int i) {
        this.f8312C.luaJ_gettable(this.f8313L, i);
    }

    @Override // party.iroiro.luajava.Lua
    public int getTop() {
        return this.f8312C.lua_gettop(this.f8313L);
    }

    @Override // party.iroiro.luajava.Lua
    public void insert(int i) {
        this.f8312C.lua_insert(this.f8313L, i);
    }

    public Object invokeSpecial(Object obj, Method method, Object[] objArr) throws Throwable {
        if (!ClassUtils.isDefault(method)) {
            throw new IncompatibleClassChangeError("Unable to invoke non-default method");
        }
        if (objArr == null) {
            objArr = EMPTY;
        }
        for (int length = objArr.length - 1; length >= 0; length--) {
            Object obj2 = objArr[length];
            if (obj2 == null) {
                pushNil();
            } else {
                pushJavaObject(obj2);
            }
        }
        StringBuilder sb = new StringBuilder(objArr.length + 1);
        for (Class<?> cls : method.getParameterTypes()) {
            appendCustomDescriptor(cls, sb);
        }
        appendCustomDescriptor(method.getReturnType(), sb);
        if (this.f8312C.luaJ_invokespecial(this.f8313L, method.getDeclaringClass(), method.getName(), Type.getMethodDescriptor(method), obj, sb.toString()) == -1) {
            Throwable javaError = getJavaError();
            pop(1);
            Objects.requireNonNull(javaError);
            throw javaError;
        }
        if (method.getReturnType() == Void.TYPE) {
            return null;
        }
        Object javaObject = toJavaObject(-1);
        pop(1);
        return javaObject;
    }

    @Override // party.iroiro.luajava.Lua
    public boolean isBoolean(int i) {
        return this.f8312C.lua_isboolean(this.f8313L, i) != 0;
    }

    public boolean isClosed() {
        return this.f8314id == -1;
    }

    @Override // party.iroiro.luajava.Lua
    public boolean isFunction(int i) {
        return this.f8312C.lua_isfunction(this.f8313L, i) != 0;
    }

    @Override // party.iroiro.luajava.Lua
    public boolean isInteger(int i) {
        return this.f8312C.luaJ_isinteger(this.f8313L, i) != 0;
    }

    @Override // party.iroiro.luajava.Lua
    public boolean isJavaObject(int i) {
        return this.f8312C.luaJ_isobject(this.f8313L, i) != 0;
    }

    @Override // party.iroiro.luajava.Lua
    public boolean isNil(int i) {
        return this.f8312C.lua_isnil(this.f8313L, i) != 0;
    }

    @Override // party.iroiro.luajava.Lua
    public boolean isNone(int i) {
        return this.f8312C.lua_isnone(this.f8313L, i) != 0;
    }

    @Override // party.iroiro.luajava.Lua
    public boolean isNoneOrNil(int i) {
        return this.f8312C.lua_isnoneornil(this.f8313L, i) != 0;
    }

    @Override // party.iroiro.luajava.Lua
    public boolean isNumber(int i) {
        return this.f8312C.lua_isnumber(this.f8313L, i) != 0;
    }

    @Override // party.iroiro.luajava.Lua
    public boolean isString(int i) {
        return this.f8312C.lua_isstring(this.f8313L, i) != 0;
    }

    @Override // party.iroiro.luajava.Lua
    public boolean isTable(int i) {
        return this.f8312C.lua_istable(this.f8313L, i) != 0;
    }

    @Override // party.iroiro.luajava.Lua
    public boolean isThread(int i) {
        return this.f8312C.lua_isthread(this.f8313L, i) != 0;
    }

    @Override // party.iroiro.luajava.Lua
    public boolean isUserdata(int i) {
        return this.f8312C.lua_isuserdata(this.f8313L, i) != 0;
    }

    @Override // party.iroiro.luajava.Lua
    public boolean lessThan(int i, int i2) {
        return this.f8312C.luaJ_compare(this.f8313L, i, i2, -1) != 0;
    }

    @Override // party.iroiro.luajava.Lua
    public void load(String str) {
        checkStack(1);
        checkError(this.f8312C.luaL_loadstring(this.f8313L, str), false);
    }

    @Override // party.iroiro.luajava.Lua
    public void loadExternal(String str) {
        ExternalLoader externalLoader = this.mainThread.loader;
        if (externalLoader == null) {
            throw new LuaException(LuaException.LuaError.RUNTIME, "External loader not set");
        }
        Buffer bufferLoad = externalLoader.load(str, this);
        if (bufferLoad == null) {
            throw new LuaException(LuaException.LuaError.FILE, "Loader returned null");
        }
        load(bufferLoad, str);
    }

    @Override // party.iroiro.luajava.Lua
    public int newRegisteredMetatable(String str) {
        checkStack(1);
        return this.f8312C.luaL_newmetatable(this.f8313L, str);
    }

    @Override // party.iroiro.luajava.Lua
    public void newTable() {
        createTable(0, 0);
    }

    public abstract AbstractLua newThread(long j, int i, AbstractLua abstractLua);

    @Override // party.iroiro.luajava.Lua
    public int next(int i) {
        checkStack(1);
        return this.f8312C.lua_next(this.f8313L, i);
    }

    @Override // party.iroiro.luajava.Lua
    public void openLibraries() {
        checkStack(1);
        this.f8312C.luaL_openlibs(this.f8313L);
        this.f8312C.luaJ_initloader(this.f8313L);
    }

    @Override // party.iroiro.luajava.Lua
    public void openLibrary(String str) {
        checkStack(1);
        this.f8312C.luaJ_openlib(this.f8313L, str);
        if ("package".equals(str)) {
            this.f8312C.luaJ_initloader(this.f8313L);
        }
    }

    @Override // party.iroiro.luajava.Lua
    public void pCall(int i, int i2) {
        checkStack(Math.max((i2 - i) - 1, 0));
        checkError(this.f8312C.lua_pcall(this.f8313L, i, i2, 0), false);
    }

    @Override // party.iroiro.luajava.Lua
    public void pop(int i) {
        if (i < 0 || getTop() < i) {
            throw new LuaException(LuaException.LuaError.MEMORY, "invalid number of items to pop");
        }
        this.f8312C.lua_pop(this.f8313L, i);
    }

    @Override // party.iroiro.luajava.Lua
    public void push(Object obj, Lua.Conversion conversion) {
        checkStack(1);
        if (obj == null) {
            pushNil();
            return;
        }
        if (obj instanceof LuaValue) {
            ((LuaValue) obj).push(this);
            return;
        }
        if (obj instanceof LuaFunction) {
            push((LuaFunction) obj);
            return;
        }
        if (conversion == Lua.Conversion.NONE) {
            pushJavaObjectOrArray(obj);
            return;
        }
        if (obj instanceof Boolean) {
            push(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof String) {
            push((String) obj);
            return;
        }
        if ((obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short)) {
            push(((Number) obj).intValue());
            return;
        }
        if (obj instanceof Character) {
            push(((Character) obj).charValue());
            return;
        }
        if (obj instanceof Long) {
            push(((Long) obj).longValue());
            return;
        }
        if ((obj instanceof Float) || (obj instanceof Double)) {
            push((Number) obj);
            return;
        }
        if (obj instanceof JFunction) {
            push((JFunction) obj);
            return;
        }
        if (conversion == Lua.Conversion.SEMI) {
            pushJavaObjectOrArray(obj);
            return;
        }
        if (obj instanceof Class) {
            pushJavaClass((Class) obj);
            return;
        }
        if (obj instanceof Map) {
            push((Map<?, ?>) obj);
            return;
        }
        if (obj instanceof Collection) {
            push((Collection<?>) obj);
            return;
        }
        if (obj.getClass().isArray()) {
            pushArray(obj);
        } else if (obj instanceof ByteBuffer) {
            push((ByteBuffer) obj);
        } else {
            pushJavaObject(obj);
        }
    }

    @Override // party.iroiro.luajava.Lua
    public void pushArray(Object obj) {
        checkStack(2);
        if (!obj.getClass().isArray()) {
            throw new IllegalArgumentException("Not an array");
        }
        int length = Array.getLength(obj);
        int i = 0;
        this.f8312C.lua_createtable(this.f8313L, length, 0);
        while (i != length) {
            push(Array.get(obj, i), Lua.Conversion.FULL);
            i++;
            this.f8312C.lua_rawseti(this.f8313L, -2, i);
        }
    }

    @Override // party.iroiro.luajava.Lua
    public void pushJavaArray(Object obj) {
        if (!obj.getClass().isArray()) {
            throw new IllegalArgumentException("Expecting non-array argument");
        }
        checkStack(1);
        this.f8312C.luaJ_pusharray(this.f8313L, obj);
    }

    @Override // party.iroiro.luajava.Lua
    public void pushJavaClass(Class<?> cls) {
        checkStack(1);
        this.f8312C.luaJ_pushclass(this.f8313L, cls);
    }

    @Override // party.iroiro.luajava.Lua
    public void pushJavaObject(Object obj) {
        if (obj.getClass().isArray()) {
            throw new IllegalArgumentException("Expecting non-array argument");
        }
        checkStack(1);
        this.f8312C.luaJ_pushobject(this.f8313L, obj);
    }

    public void pushJavaObjectOrArray(Object obj) {
        checkStack(1);
        if (obj.getClass().isArray()) {
            pushJavaArray(obj);
        } else {
            pushJavaObject(obj);
        }
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
    public void pushValue(int i) {
        checkStack(1);
        this.f8312C.lua_pushvalue(this.f8313L, i);
    }

    @Override // party.iroiro.luajava.Lua
    public boolean rawEqual(int i, int i2) {
        return this.f8312C.lua_rawequal(this.f8313L, i, i2) != 0;
    }

    @Override // party.iroiro.luajava.Lua
    public void rawGet(int i) {
        this.f8312C.luaJ_rawget(this.f8313L, i);
    }

    @Override // party.iroiro.luajava.Lua
    public void rawGetI(int i, int i2) {
        checkStack(1);
        this.f8312C.luaJ_rawgeti(this.f8313L, i, i2);
    }

    @Override // party.iroiro.luajava.Lua
    public int rawLength(int i) {
        checkStack(1);
        return this.f8312C.luaJ_len(this.f8313L, i);
    }

    @Override // party.iroiro.luajava.Lua
    public void rawSet(int i) {
        this.f8312C.lua_rawset(this.f8313L, i);
    }

    @Override // party.iroiro.luajava.Lua
    public void rawSetI(int i, int i2) {
        this.f8312C.lua_rawseti(this.f8313L, i, i2);
    }

    @Override // party.iroiro.luajava.Lua
    public int ref(int i) {
        return this.f8312C.luaL_ref(this.f8313L, i);
    }

    @Override // party.iroiro.luajava.Lua
    public void refGet(int i) {
        rawGetI(this.f8312C.getRegistryIndex(), i);
    }

    @Override // party.iroiro.luajava.value.LuaThread
    public void register(String str, LuaFunction luaFunction) {
        push(luaFunction);
        setGlobal(str);
    }

    @Override // party.iroiro.luajava.Lua
    public void remove(int i) {
        this.f8312C.lua_remove(this.f8313L, i);
    }

    @Override // party.iroiro.luajava.Lua
    public void replace(int i) {
        this.f8312C.lua_replace(this.f8313L, i);
    }

    @Override // party.iroiro.luajava.value.LuaThread
    public LuaValue require(String str) {
        LuaValue luaValue = this.requireFunction;
        if (luaValue == null) {
            LuaValue luaValue2 = get("require");
            if (luaValue2.type() != Lua.LuaType.FUNCTION) {
                openLibrary("package");
                luaValue = get("require");
                this.requireFunction = luaValue;
            } else {
                luaValue = luaValue2;
            }
        }
        return luaValue.call(str)[0];
    }

    @Override // party.iroiro.luajava.Lua
    public boolean resume(int i) {
        int iLuaJ_resume = this.f8312C.luaJ_resume(this.f8313L, i);
        if (convertError(iLuaJ_resume) == LuaException.LuaError.YIELD) {
            return true;
        }
        checkError(iLuaJ_resume, false);
        return false;
    }

    @Override // party.iroiro.luajava.Lua
    public void run(String str) {
        checkStack(1);
        checkError(this.f8312C.luaL_dostring(this.f8313L, str), true);
    }

    @Override // party.iroiro.luajava.value.LuaThread
    public void set(String str, Object obj) {
        push(obj, Lua.Conversion.SEMI);
        setGlobal(str);
    }

    @Override // party.iroiro.luajava.Lua
    public void setExternalLoader(ExternalLoader externalLoader) {
        this.mainThread.loader = externalLoader;
    }

    @Override // party.iroiro.luajava.Lua
    public void setField(int i, String str) {
        this.f8312C.lua_setfield(this.f8313L, i, str);
    }

    @Override // party.iroiro.luajava.Lua
    public void setGlobal(String str) {
        this.f8312C.lua_setglobal(this.f8313L, str);
    }

    @Override // party.iroiro.luajava.Lua
    public void setMetatable(int i) {
        this.f8312C.luaJ_setmetatable(this.f8313L, i);
    }

    @Override // party.iroiro.luajava.Lua
    public void setTable(int i) {
        this.f8312C.lua_settable(this.f8313L, i);
    }

    @Override // party.iroiro.luajava.Lua
    public void setTop(int i) {
        this.f8312C.lua_settop(this.f8313L, i);
    }

    public boolean shouldSynchronize() {
        return true;
    }

    @Override // party.iroiro.luajava.Lua
    public LuaException.LuaError status() {
        return convertError(this.f8312C.lua_status(this.f8313L));
    }

    public int toAbsoluteIndex(int i) {
        if (i > 0 || i <= this.f8312C.getRegistryIndex()) {
            return i;
        }
        if (i != 0) {
            return getTop() + 1 + i;
        }
        throw new IllegalArgumentException("Stack index should not be 0");
    }

    @Override // party.iroiro.luajava.Lua
    public boolean toBoolean(int i) {
        return this.f8312C.lua_toboolean(this.f8313L, i) != 0;
    }

    @Override // party.iroiro.luajava.Lua
    public ByteBuffer toBuffer(int i) {
        return (ByteBuffer) this.f8312C.luaJ_tobuffer(this.f8313L, i);
    }

    @Override // party.iroiro.luajava.Lua
    public ByteBuffer toDirectBuffer(int i) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f8312C.luaJ_todirectbuffer(this.f8313L, i);
        if (byteBuffer == null) {
            return null;
        }
        return byteBuffer.asReadOnlyBuffer();
    }

    @Override // party.iroiro.luajava.Lua
    public long toInteger(int i) {
        return this.f8312C.lua_tointeger(this.f8313L, i);
    }

    @Override // party.iroiro.luajava.Lua
    public Object toJavaObject(int i) {
        return this.f8312C.luaJ_toobject(this.f8313L, i);
    }

    @Override // party.iroiro.luajava.Lua
    public List<?> toList(int i) {
        Object javaObject = toJavaObject(i);
        if (javaObject instanceof List) {
            return (List) javaObject;
        }
        checkStack(1);
        if (this.f8312C.lua_istable(this.f8313L, i) != 1) {
            return null;
        }
        int iRawLength = rawLength(i);
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(iRawLength);
        for (int i2 = 1; i2 <= iRawLength; i2++) {
            this.f8312C.luaJ_rawgeti(this.f8313L, i, i2);
            arrayList.add(toObject(-1));
            pop(1);
        }
        return arrayList;
    }

    @Override // party.iroiro.luajava.Lua
    public Map<?, ?> toMap(int i) {
        Object javaObject = toJavaObject(i);
        if (javaObject instanceof Map) {
            return (Map) javaObject;
        }
        checkStack(2);
        int absoluteIndex = toAbsoluteIndex(i);
        if (this.f8312C.lua_istable(this.f8313L, absoluteIndex) != 1) {
            return null;
        }
        this.f8312C.lua_pushnil(this.f8313L);
        HashMap map = new HashMap();
        while (this.f8312C.lua_next(this.f8313L, absoluteIndex) != 0) {
            map.put(toObject(-2), toObject(-1));
            pop(1);
        }
        return map;
    }

    @Override // party.iroiro.luajava.Lua
    public double toNumber(int i) {
        return this.f8312C.lua_tonumber(this.f8313L, i);
    }

    @Override // party.iroiro.luajava.Lua
    public Object toObject(int i) {
        Lua.LuaType luaTypeType = type(i);
        if (luaTypeType == null) {
            return null;
        }
        switch (C23601.$SwitchMap$party$iroiro$luajava$Lua$LuaType[luaTypeType.ordinal()]) {
            case 1:
            case 2:
                return null;
            case 3:
                return Boolean.valueOf(toBoolean(i));
            case 4:
                return Double.valueOf(toNumber(i));
            case 5:
                return toString(i);
            case 6:
                return toMap(i);
            case 7:
                return toJavaObject(i);
            default:
                pushValue(i);
                return get();
        }
    }

    @Override // party.iroiro.luajava.Lua
    public String toString(int i) {
        return this.f8312C.lua_tostring(this.f8313L, i);
    }

    @Override // party.iroiro.luajava.Lua
    public Lua.LuaType type(int i) {
        return convertType(this.f8312C.lua_type(this.f8313L, i));
    }

    @Override // party.iroiro.luajava.Lua
    public void unRef(int i, int i2) {
        this.f8312C.luaL_unref(this.f8313L, i, i2);
    }

    @Override // party.iroiro.luajava.Lua
    public void unref(int i) {
        unRef(this.f8312C.getRegistryIndex(), i);
    }

    @Override // party.iroiro.luajava.Lua
    public void xMove(Lua lua, int i) {
        if (!(lua instanceof AbstractLua) || ((AbstractLua) lua).mainThread != this.mainThread) {
            throw new IllegalArgumentException("Not sharing same global state");
        }
        lua.checkStack(i);
        this.f8312C.lua_xmove(this.f8313L, lua.getPointer(), i);
    }

    @Override // party.iroiro.luajava.Lua
    public void yield(int i) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override // party.iroiro.luajava.Lua
    public int error(Throwable th) {
        if (th == null) {
            pushNil();
            setGlobal(Lua.GLOBAL_THROWABLE);
            return 0;
        }
        pushJavaObject(th);
        setGlobal(Lua.GLOBAL_THROWABLE);
        push(th.toString());
        return -1;
    }

    @Override // party.iroiro.luajava.value.LuaThread
    public LuaValue from(double d) {
        return ImmutableLuaValue.NUMBER(this, d);
    }

    @Override // party.iroiro.luajava.Lua
    public AbstractLua getMainState() {
        return this.mainThread;
    }

    @Override // party.iroiro.luajava.Lua
    public AbstractLua newThread() {
        checkStack(1);
        LuaInstances.Token<AbstractLua> tokenAdd = instances.add();
        AbstractLua abstractLuaNewThread = newThread(this.f8312C.luaJ_newthread(this.f8313L, tokenAdd.f8317id), tokenAdd.f8317id, this.mainThread);
        this.mainThread.addSubThread(abstractLuaNewThread);
        tokenAdd.setter.accept(abstractLuaNewThread);
        return abstractLuaNewThread;
    }

    @Override // party.iroiro.luajava.Lua
    public int ref() {
        return ref(this.f8312C.getRegistryIndex());
    }

    @Override // party.iroiro.luajava.value.LuaThread
    public LuaValue from(long j) {
        return ImmutableLuaValue.LONG(this, j);
    }

    @Override // party.iroiro.luajava.Lua
    public LuaValue get() {
        LuaValue luaValueFrom;
        AbstractRefLuaValue refLuaValue;
        Lua.LuaType luaTypeType = type(-1);
        int[] iArr = C23601.$SwitchMap$party$iroiro$luajava$Lua$LuaType;
        Objects.requireNonNull(luaTypeType);
        int i = iArr[luaTypeType.ordinal()];
        if (i == 1 || i == 2) {
            pop(1);
            return fromNull();
        }
        if (i == 3) {
            boolean z = toBoolean(-1);
            pop(1);
            return from(z);
        }
        if (i == 4) {
            if (isInteger(-1)) {
                luaValueFrom = from(toInteger(-1));
            } else {
                luaValueFrom = from(toNumber(-1));
            }
            pop(1);
            return luaValueFrom;
        }
        if (i != 5) {
            if (luaTypeType == Lua.LuaType.TABLE) {
                refLuaValue = new LuaTableValue(this, luaTypeType);
            } else {
                refLuaValue = new RefLuaValue(this, luaTypeType);
            }
            this.mainThread.recordedReferences.put(Integer.valueOf(refLuaValue.getReference()), new LuaReference<>(refLuaValue, this.mainThread.recyclableReferences));
            return refLuaValue;
        }
        ByteBuffer buffer = toBuffer(-1);
        pop(1);
        return from(buffer);
    }

    @Override // party.iroiro.luajava.Lua
    public void load(Buffer buffer, String str) {
        if (buffer.isDirect()) {
            checkStack(1);
            checkError(this.f8312C.luaJ_loadbuffer(this.f8313L, buffer, buffer.position(), buffer.remaining(), str), false);
            return;
        }
        throw new LuaException(LuaException.LuaError.MEMORY, "Expecting a direct buffer");
    }

    @Override // party.iroiro.luajava.Lua
    public void run(Buffer buffer, String str) {
        if (buffer.isDirect()) {
            checkStack(1);
            checkError(this.f8312C.luaJ_dobuffer(this.f8313L, buffer, buffer.position(), buffer.remaining(), str), true);
            return;
        }
        throw new LuaException(LuaException.LuaError.MEMORY, "Expecting a direct buffer");
    }

    @Override // party.iroiro.luajava.value.LuaThread
    public LuaValue from(String str) {
        return ImmutableLuaValue.STRING(this, str);
    }

    @Override // party.iroiro.luajava.value.LuaThread
    public LuaValue from(ByteBuffer byteBuffer) {
        return ImmutableLuaValue.BUFFER(this, byteBuffer);
    }

    @Override // party.iroiro.luajava.Lua
    public Object toObject(int i, Class<?> cls) {
        try {
            return JuaAPI.convertFromLua(this, cls, i);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public AbstractLua(LuaNatives luaNatives, long j, int i, AbstractLua abstractLua) {
        this.loader = null;
        this.f8312C = luaNatives;
        this.f8313L = j;
        this.mainThread = abstractLua;
        this.f8314id = i;
        this.subThreads = null;
        this.recyclableReferences = null;
        this.recordedReferences = null;
    }

    @Override // party.iroiro.luajava.Lua
    public void push(boolean z) {
        checkStack(1);
        this.f8312C.lua_pushboolean(this.f8313L, z ? 1 : 0);
    }

    @Override // party.iroiro.luajava.Lua
    public void push(Number number) {
        checkStack(1);
        this.f8312C.lua_pushnumber(this.f8313L, number.doubleValue());
    }

    @Override // party.iroiro.luajava.Lua
    public void push(long j) {
        checkStack(1);
        this.f8312C.lua_pushinteger(this.f8313L, j);
    }

    @Override // party.iroiro.luajava.Lua
    public void push(String str) {
        checkStack(1);
        this.f8312C.luaJ_pushstring(this.f8313L, str);
    }

    @Override // party.iroiro.luajava.Lua
    public void push(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        checkStack(1);
        if (byteBuffer.isDirect()) {
            byteBuffer2 = byteBuffer;
        } else {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBuffer.remaining());
            byteBufferAllocateDirect.put(byteBuffer);
            byteBufferAllocateDirect.flip();
            byteBuffer2 = byteBufferAllocateDirect;
        }
        this.f8312C.luaJ_pushlstring(this.f8313L, byteBuffer2, byteBuffer2.position(), byteBuffer2.remaining());
    }

    @Override // party.iroiro.luajava.Lua
    public void push(Map<?, ?> map) {
        checkStack(3);
        this.f8312C.lua_createtable(this.f8313L, 0, map.size());
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            Lua.Conversion conversion = Lua.Conversion.FULL;
            push(key, conversion);
            push(entry.getValue(), conversion);
            this.f8312C.lua_rawset(this.f8313L, -3);
        }
    }

    @Override // party.iroiro.luajava.Lua
    public void push(Collection<?> collection) {
        checkStack(2);
        this.f8312C.lua_createtable(this.f8313L, collection.size(), 0);
        Iterator<?> it = collection.iterator();
        int i = 1;
        while (it.hasNext()) {
            push(it.next(), Lua.Conversion.FULL);
            this.f8312C.lua_rawseti(this.f8313L, -2, i);
            i++;
        }
    }

    @Override // party.iroiro.luajava.Lua
    public void push(JFunction jFunction) {
        checkStack(1);
        this.f8312C.luaJ_pushfunction(this.f8313L, jFunction);
    }

    @Override // party.iroiro.luajava.Lua
    public void push(LuaValue luaValue) {
        checkStack(1);
        luaValue.push(this);
    }

    @Override // party.iroiro.luajava.Lua
    public void push(LuaFunction luaFunction) {
        checkStack(1);
        push(new LuaFunctionWrapper(luaFunction));
    }
}
