package party.iroiro.luajava.value;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
public abstract class ImmutableLuaValue<T> extends AbstractLuaValue<Lua> {
    protected final T value;

    public static final class ImmutableBoolean extends ImmutableLuaValue<Boolean> {
        public /* synthetic */ ImmutableBoolean(Lua r1, Boolean r2, C23661 r3) {
            this(r1, r2);
        }

        @Override // party.iroiro.luajava.value.LuaValue
        public void push(Lua r2) {
            r2.push(((Boolean) this.value).booleanValue());
        }

        @Override // party.iroiro.luajava.value.AbstractLuaValue, party.iroiro.luajava.value.LuaValue
        public boolean toBoolean() {
            return ((Boolean) this.value).booleanValue();
        }

        private ImmutableBoolean(Lua r2, Boolean r3) {
            super(r2, Lua.LuaType.BOOLEAN, r3);
        }
    }

    public static final class ImmutableLong extends ImmutableLuaValue<Long> {
        public /* synthetic */ ImmutableLong(Lua r1, Long r2, C23661 r3) {
            this(r1, r2);
        }

        @Override // party.iroiro.luajava.value.LuaValue
        public void push(Lua r3) {
            r3.push(((Long) this.value).longValue());
        }

        @Override // party.iroiro.luajava.value.AbstractLuaValue, party.iroiro.luajava.value.LuaValue
        public long toInteger() {
            return ((Long) this.value).longValue();
        }

        @Override // party.iroiro.luajava.value.ImmutableLuaValue, party.iroiro.luajava.value.LuaValue
        public Object toJavaObject() {
            return Double.valueOf(((Long) this.value).doubleValue());
        }

        private ImmutableLong(Lua r2, Long r3) {
            super(r2, Lua.LuaType.NUMBER, r3);
        }
    }

    public static final class ImmutableNumber extends ImmutableLuaValue<Double> {
        public /* synthetic */ ImmutableNumber(Lua r1, Double r2, C23661 r3) {
            this(r1, r2);
        }

        @Override // party.iroiro.luajava.value.LuaValue
        public void push(Lua r2) {
            r2.push((Number) this.value);
        }

        @Override // party.iroiro.luajava.value.AbstractLuaValue, party.iroiro.luajava.value.LuaValue
        public double toNumber() {
            return ((Double) this.value).doubleValue();
        }

        private ImmutableNumber(Lua r2, Double r3) {
            super(r2, Lua.LuaType.NUMBER, r3);
        }
    }

    public static final class ImmutableString extends ImmutableLuaValue<ByteBuffer> {
        private String javaString;

        public /* synthetic */ ImmutableString(Lua r1, String r2, C23661 r3) {
            this(r1, r2);
        }

        private static ByteBuffer wrap(byte[] r1) {
            ByteBuffer r0 = ByteBuffer.allocateDirect(r1.length);
            r0.put(r1);
            r0.flip();
            return r0.asReadOnlyBuffer();
        }

        @Override // party.iroiro.luajava.value.AbstractLuaValue, party.iroiro.luajava.value.LuaTableTrait
        public int length() {
            return ((ByteBuffer) this.value).limit();
        }

        @Override // party.iroiro.luajava.value.LuaValue
        public void push(Lua r2) {
            r2.push((ByteBuffer) this.value);
        }

        @Override // party.iroiro.luajava.value.AbstractLuaValue, party.iroiro.luajava.value.LuaValue
        public ByteBuffer toBuffer() {
            return ((ByteBuffer) this.value).duplicate();
        }

        @Override // party.iroiro.luajava.value.ImmutableLuaValue, party.iroiro.luajava.value.LuaValue
        public Object toJavaObject() {
            return toString();
        }

        @Override // party.iroiro.luajava.value.ImmutableLuaValue, java.util.AbstractMap, party.iroiro.luajava.value.LuaValue
        public String toString() {
            if (this.javaString != null) goto L6;
            this.javaString = StandardCharsets.UTF_8.decode(((ByteBuffer) this.value).duplicate()).toString();
        L6:
            return this.javaString;
        }

        public /* synthetic */ ImmutableString(Lua r1, ByteBuffer r2, C23661 r3) {
            this(r1, r2);
        }

        private ImmutableString(Lua r2, ByteBuffer r3) {
            super(r2, Lua.LuaType.STRING, r3);
            this.javaString = null;
        }

        private ImmutableString(Lua r3, String r4) {
            super(r3, Lua.LuaType.STRING, wrap(r4.getBytes(StandardCharsets.UTF_8)));
            this.javaString = r4;
        }
    }

    public ImmutableLuaValue(Lua r1, Lua.LuaType r2, T r3) {
        super(r1, r2);
        this.value = r3;
    }

    public static LuaValue BUFFER(Lua r2, ByteBuffer r3) {
        ByteBuffer r0 = ByteBuffer.allocateDirect(r3.limit());
        r3.position(0);
        r0.put(r3);
        r0.flip();
        return new ImmutableString(r2, r0.asReadOnlyBuffer(), null);
    }

    public static LuaValue FALSE(Lua r3) {
        return new ImmutableBoolean(r3, Boolean.FALSE, null);
    }

    public static LuaValue LONG(Lua r1, long r2) {
        return new ImmutableLong(r1, Long.valueOf(r2), null);
    }

    public static LuaValue NIL(final Lua r3) {
        final Lua.LuaType r1 = Lua.LuaType.NIL;
        final Void r2 = null;
        return new C23661(r3, r1, r2);
    }

    public static LuaValue NUMBER(Lua r1, double r2) {
        return new ImmutableNumber(r1, Double.valueOf(r2), null);
    }

    public static LuaValue STRING(Lua r2, String r3) {
        return new ImmutableString(r2, r3, null);
    }

    public static LuaValue TRUE(Lua r3) {
        return new ImmutableBoolean(r3, Boolean.TRUE, null);
    }

    @Override // party.iroiro.luajava.value.LuaValue
    public Object toJavaObject() {
        return this.value;
    }

    @Override // java.util.AbstractMap, party.iroiro.luajava.value.LuaValue
    public String toString() {
        T r0 = this.value;
        if (r0 != null) goto L7;
        return "nil";
    L7:
        return r0.toString();
    }
}
