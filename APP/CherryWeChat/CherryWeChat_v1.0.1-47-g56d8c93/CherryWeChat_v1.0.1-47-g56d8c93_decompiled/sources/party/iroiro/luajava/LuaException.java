package party.iroiro.luajava;

/* JADX INFO: loaded from: classes.dex */
public class LuaException extends RuntimeException {
    public final LuaError type;

    public enum LuaError {
        FILE,
        GC,
        HANDLER,
        MEMORY,
        OK,
        RUNTIME,
        SYNTAX,
        YIELD,
        UNKNOWN,
        JAVA
    }

    public LuaException(LuaError luaError, String str) {
        super(str);
        this.type = luaError;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return this.type + ": " + super.toString();
    }
}
