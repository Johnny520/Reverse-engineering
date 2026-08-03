package party.iroiro.luajava;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import party.iroiro.luajava.LuaException;
import party.iroiro.luajava.value.LuaFunction;
import party.iroiro.luajava.value.LuaThread;
import party.iroiro.luajava.value.LuaValue;

/* JADX INFO: loaded from: classes.dex */
public interface Lua extends AutoCloseable, LuaThread {
    public static final String GLOBAL_THROWABLE = "__jthrowable__";

    public enum Conversion {
        FULL,
        SEMI,
        NONE
    }

    public enum LuaType {
        BOOLEAN,
        FUNCTION,
        LIGHTUSERDATA,
        NIL,
        NONE,
        NUMBER,
        STRING,
        TABLE,
        THREAD,
        USERDATA
    }

    void checkStack(int i);

    @Override // java.lang.AutoCloseable
    void close();

    void concat(int i);

    Object createProxy(Class<?>[] clsArr, Conversion conversion);

    void createTable(int i, int i2);

    ByteBuffer dump();

    boolean equal(int i, int i2);

    int error(Throwable th);

    void error(String str);

    /* JADX INFO: renamed from: gc */
    void mo4795gc();

    LuaValue get();

    void getField(int i, String str);

    void getGlobal(String str);

    int getId();

    Throwable getJavaError();

    LuaNatives getLuaNatives();

    Lua getMainState();

    int getMetaField(int i, String str);

    int getMetatable(int i);

    long getPointer();

    void getRegisteredMetatable(String str);

    void getTable(int i);

    int getTop();

    void insert(int i);

    boolean isBoolean(int i);

    boolean isFunction(int i);

    boolean isInteger(int i);

    boolean isJavaObject(int i);

    boolean isNil(int i);

    boolean isNone(int i);

    boolean isNoneOrNil(int i);

    boolean isNumber(int i);

    boolean isString(int i);

    boolean isTable(int i);

    boolean isThread(int i);

    boolean isUserdata(int i);

    boolean lessThan(int i, int i2);

    void load(String str);

    void load(Buffer buffer, String str);

    void loadExternal(String str);

    int newRegisteredMetatable(String str);

    void newTable();

    Lua newThread();

    int next(int i);

    void openLibraries();

    void openLibrary(String str);

    void pCall(int i, int i2);

    void pop(int i);

    void push(long j);

    void push(Number number);

    void push(Object obj, Conversion conversion);

    void push(String str);

    void push(ByteBuffer byteBuffer);

    void push(Collection<?> collection);

    void push(Map<?, ?> map);

    void push(JFunction jFunction);

    void push(LuaFunction luaFunction);

    void push(LuaValue luaValue);

    void push(boolean z);

    void pushArray(Object obj);

    void pushJavaArray(Object obj);

    void pushJavaClass(Class<?> cls);

    void pushJavaObject(Object obj);

    void pushNil();

    void pushThread();

    void pushValue(int i);

    boolean rawEqual(int i, int i2);

    void rawGet(int i);

    void rawGetI(int i, int i2);

    int rawLength(int i);

    void rawSet(int i);

    void rawSetI(int i, int i2);

    int ref();

    int ref(int i);

    void refGet(int i);

    void remove(int i);

    void replace(int i);

    boolean resume(int i);

    void run(String str);

    void run(Buffer buffer, String str);

    void setExternalLoader(ExternalLoader externalLoader);

    void setField(int i, String str);

    void setGlobal(String str);

    void setMetatable(int i);

    void setTable(int i);

    void setTop(int i);

    LuaException.LuaError status();

    boolean toBoolean(int i);

    ByteBuffer toBuffer(int i);

    ByteBuffer toDirectBuffer(int i);

    long toInteger(int i);

    Object toJavaObject(int i);

    List<?> toList(int i);

    Map<?, ?> toMap(int i);

    double toNumber(int i);

    Object toObject(int i);

    Object toObject(int i, Class<?> cls);

    String toString(int i);

    LuaType type(int i);

    void unRef(int i, int i2);

    void unref(int i);

    void xMove(Lua lua, int i);

    void yield(int i);
}
