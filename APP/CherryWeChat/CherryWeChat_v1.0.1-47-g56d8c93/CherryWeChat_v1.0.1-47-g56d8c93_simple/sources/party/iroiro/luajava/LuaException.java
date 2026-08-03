package party.iroiro.luajava;

/* JADX INFO: loaded from: classes.dex */
public class LuaException extends RuntimeException {
    public final LuaError type;

    public enum LuaError extends Enum<LuaError> {
        private static final /* synthetic */ LuaError[] $VALUES = null;
        public static final LuaError FILE = null;

        /* JADX INFO: renamed from: GC */
        public static final LuaError f8315GC = null;
        public static final LuaError HANDLER = null;
        public static final LuaError JAVA = null;
        public static final LuaError MEMORY = null;

        /* JADX INFO: renamed from: OK */
        public static final LuaError f8316OK = null;
        public static final LuaError RUNTIME = null;
        public static final LuaError SYNTAX = null;
        public static final LuaError UNKNOWN = null;
        public static final LuaError YIELD = null;

        private static /* synthetic */ LuaError[] $values() {
            return new LuaError[]{FILE, f8315GC, HANDLER, MEMORY, f8316OK, RUNTIME, SYNTAX, YIELD, UNKNOWN, JAVA};
        }

        static {
            FILE = new LuaError("FILE", 0);
            f8315GC = new LuaError("GC", 1);
            HANDLER = new LuaError("HANDLER", 2);
            MEMORY = new LuaError("MEMORY", 3);
            f8316OK = new LuaError("OK", 4);
            RUNTIME = new LuaError("RUNTIME", 5);
            SYNTAX = new LuaError("SYNTAX", 6);
            YIELD = new LuaError("YIELD", 7);
            UNKNOWN = new LuaError("UNKNOWN", 8);
            JAVA = new LuaError("JAVA", 9);
            $VALUES = $values();
        }

        LuaError(String r1, int r2) {
        }

        public static LuaError valueOf(String r1) {
            return (LuaError) Enum.valueOf(LuaError.class, r1);
        }

        public static LuaError[] values() {
            return (LuaError[]) $VALUES.clone();
        }
    }

    public LuaException(LuaError r1, String r2) {
        super(r2);
        this.type = r1;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return this.type + ": " + super.toString();
    }
}
