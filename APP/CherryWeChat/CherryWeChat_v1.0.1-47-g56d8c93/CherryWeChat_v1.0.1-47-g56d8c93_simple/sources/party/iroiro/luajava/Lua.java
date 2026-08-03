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

    public enum Conversion extends Enum<Conversion> {
        private static final /* synthetic */ Conversion[] $VALUES = null;
        public static final Conversion FULL = null;
        public static final Conversion NONE = null;
        public static final Conversion SEMI = null;

        private static /* synthetic */ Conversion[] $values() {
            return new Conversion[]{FULL, SEMI, NONE};
        }

        static {
            FULL = new Conversion("FULL", 0);
            SEMI = new Conversion("SEMI", 1);
            NONE = new Conversion("NONE", 2);
            $VALUES = $values();
        }

        Conversion(String r1, int r2) {
        }

        public static Conversion valueOf(String r1) {
            return (Conversion) Enum.valueOf(Conversion.class, r1);
        }

        public static Conversion[] values() {
            return (Conversion[]) $VALUES.clone();
        }
    }

    public enum LuaType extends Enum<LuaType> {
        private static final /* synthetic */ LuaType[] $VALUES = null;
        public static final LuaType BOOLEAN = null;
        public static final LuaType FUNCTION = null;
        public static final LuaType LIGHTUSERDATA = null;
        public static final LuaType NIL = null;
        public static final LuaType NONE = null;
        public static final LuaType NUMBER = null;
        public static final LuaType STRING = null;
        public static final LuaType TABLE = null;
        public static final LuaType THREAD = null;
        public static final LuaType USERDATA = null;

        private static /* synthetic */ LuaType[] $values() {
            return new LuaType[]{BOOLEAN, FUNCTION, LIGHTUSERDATA, NIL, NONE, NUMBER, STRING, TABLE, THREAD, USERDATA};
        }

        static {
            BOOLEAN = new LuaType("BOOLEAN", 0);
            FUNCTION = new LuaType("FUNCTION", 1);
            LIGHTUSERDATA = new LuaType("LIGHTUSERDATA", 2);
            NIL = new LuaType("NIL", 3);
            NONE = new LuaType("NONE", 4);
            NUMBER = new LuaType("NUMBER", 5);
            STRING = new LuaType("STRING", 6);
            TABLE = new LuaType("TABLE", 7);
            THREAD = new LuaType("THREAD", 8);
            USERDATA = new LuaType("USERDATA", 9);
            $VALUES = $values();
        }

        LuaType(String r1, int r2) {
        }

        public static LuaType valueOf(String r1) {
            return (LuaType) Enum.valueOf(LuaType.class, r1);
        }

        public static LuaType[] values() {
            return (LuaType[]) $VALUES.clone();
        }
    }

    void checkStack(int r1);

    @Override // java.lang.AutoCloseable
    void close();

    void concat(int r1);

    Object createProxy(Class<?>[] r1, Conversion r2);

    void createTable(int r1, int r2);

    ByteBuffer dump();

    boolean equal(int r1, int r2);

    int error(Throwable r1);

    void error(String r1);

    /* JADX INFO: renamed from: gc */
    void mo4795gc();

    LuaValue get();

    void getField(int r1, String r2);

    void getGlobal(String r1);

    int getId();

    Throwable getJavaError();

    LuaNatives getLuaNatives();

    Lua getMainState();

    int getMetaField(int r1, String r2);

    int getMetatable(int r1);

    long getPointer();

    void getRegisteredMetatable(String r1);

    void getTable(int r1);

    int getTop();

    void insert(int r1);

    boolean isBoolean(int r1);

    boolean isFunction(int r1);

    boolean isInteger(int r1);

    boolean isJavaObject(int r1);

    boolean isNil(int r1);

    boolean isNone(int r1);

    boolean isNoneOrNil(int r1);

    boolean isNumber(int r1);

    boolean isString(int r1);

    boolean isTable(int r1);

    boolean isThread(int r1);

    boolean isUserdata(int r1);

    boolean lessThan(int r1, int r2);

    void load(String r1);

    void load(Buffer r1, String r2);

    void loadExternal(String r1);

    int newRegisteredMetatable(String r1);

    void newTable();

    Lua newThread();

    int next(int r1);

    void openLibraries();

    void openLibrary(String r1);

    void pCall(int r1, int r2);

    void pop(int r1);

    void push(long r1);

    void push(Number r1);

    void push(Object r1, Conversion r2);

    void push(String r1);

    void push(ByteBuffer r1);

    void push(Collection<?> r1);

    void push(Map<?, ?> r1);

    void push(JFunction r1);

    void push(LuaFunction r1);

    void push(LuaValue r1);

    void push(boolean r1);

    void pushArray(Object r1);

    void pushJavaArray(Object r1);

    void pushJavaClass(Class<?> r1);

    void pushJavaObject(Object r1);

    void pushNil();

    void pushThread();

    void pushValue(int r1);

    boolean rawEqual(int r1, int r2);

    void rawGet(int r1);

    void rawGetI(int r1, int r2);

    int rawLength(int r1);

    void rawSet(int r1);

    void rawSetI(int r1, int r2);

    int ref();

    int ref(int r1);

    void refGet(int r1);

    void remove(int r1);

    void replace(int r1);

    boolean resume(int r1);

    void run(String r1);

    void run(Buffer r1, String r2);

    void setExternalLoader(ExternalLoader r1);

    void setField(int r1, String r2);

    void setGlobal(String r1);

    void setMetatable(int r1);

    void setTable(int r1);

    void setTop(int r1);

    LuaException.LuaError status();

    boolean toBoolean(int r1);

    ByteBuffer toBuffer(int r1);

    ByteBuffer toDirectBuffer(int r1);

    long toInteger(int r1);

    Object toJavaObject(int r1);

    List<?> toList(int r1);

    Map<?, ?> toMap(int r1);

    double toNumber(int r1);

    Object toObject(int r1);

    Object toObject(int r1, Class<?> r2);

    String toString(int r1);

    LuaType type(int r1);

    void unRef(int r1, int r2);

    void unref(int r1);

    void xMove(Lua r1, int r2);

    void yield(int r1);
}
