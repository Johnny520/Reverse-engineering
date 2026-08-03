package party.iroiro.luajava.value;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
public abstract class ImmutableLuaValue<T> extends AbstractLuaValue<Lua> {
    protected final T value;

    public static final class ImmutableBoolean extends ImmutableLuaValue<Boolean> {
        @Override // party.iroiro.luajava.value.LuaValue
        public void push(Lua lua) {
            lua.push(((Boolean) this.value).booleanValue());
        }

        @Override // party.iroiro.luajava.value.AbstractLuaValue, party.iroiro.luajava.value.LuaValue
        public boolean toBoolean() {
            return ((Boolean) this.value).booleanValue();
        }

        private ImmutableBoolean(Lua lua, Boolean bool) {
            super(lua, Lua.LuaType.BOOLEAN, bool);
        }
    }

    public static final class ImmutableLong extends ImmutableLuaValue<Long> {
        @Override // party.iroiro.luajava.value.LuaValue
        public void push(Lua lua) {
            lua.push(((Long) this.value).longValue());
        }

        @Override // party.iroiro.luajava.value.AbstractLuaValue, party.iroiro.luajava.value.LuaValue
        public long toInteger() {
            return ((Long) this.value).longValue();
        }

        @Override // party.iroiro.luajava.value.ImmutableLuaValue, party.iroiro.luajava.value.LuaValue
        public Object toJavaObject() {
            return Double.valueOf(((Long) this.value).doubleValue());
        }

        private ImmutableLong(Lua lua, Long l) {
            super(lua, Lua.LuaType.NUMBER, l);
        }
    }

    public static final class ImmutableNumber extends ImmutableLuaValue<Double> {
        @Override // party.iroiro.luajava.value.LuaValue
        public void push(Lua lua) {
            lua.push((Number) this.value);
        }

        @Override // party.iroiro.luajava.value.AbstractLuaValue, party.iroiro.luajava.value.LuaValue
        public double toNumber() {
            return ((Double) this.value).doubleValue();
        }

        private ImmutableNumber(Lua lua, Double d) {
            super(lua, Lua.LuaType.NUMBER, d);
        }
    }

    public ImmutableLuaValue(Lua lua, Lua.LuaType luaType, T t) {
        super(lua, luaType);
        this.value = t;
    }

    public static LuaValue BUFFER(Lua lua, ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBuffer.limit());
        byteBuffer.position(0);
        byteBufferAllocateDirect.put(byteBuffer);
        byteBufferAllocateDirect.flip();
        return new ImmutableString(lua, byteBufferAllocateDirect.asReadOnlyBuffer());
    }

    public static LuaValue FALSE(Lua lua) {
        return new ImmutableBoolean(lua, Boolean.FALSE);
    }

    public static LuaValue LONG(Lua lua, long j) {
        return new ImmutableLong(lua, Long.valueOf(j));
    }

    public static LuaValue NIL(Lua lua) {
        return new ImmutableLuaValue<Void>(lua, Lua.LuaType.NIL, null) { // from class: party.iroiro.luajava.value.ImmutableLuaValue.1
            @Override // party.iroiro.luajava.value.LuaValue
            public void push(Lua lua2) {
                lua2.pushNil();
            }

            @Override // party.iroiro.luajava.value.AbstractLuaValue, party.iroiro.luajava.value.LuaValue
            public boolean toBoolean() {
                return false;
            }
        };
    }

    public static LuaValue NUMBER(Lua lua, double d) {
        return new ImmutableNumber(lua, Double.valueOf(d));
    }

    public static LuaValue STRING(Lua lua, String str) {
        return new ImmutableString(lua, str);
    }

    public static LuaValue TRUE(Lua lua) {
        return new ImmutableBoolean(lua, Boolean.TRUE);
    }

    @Override // party.iroiro.luajava.value.LuaValue
    public Object toJavaObject() {
        return this.value;
    }

    @Override // java.util.AbstractMap, party.iroiro.luajava.value.LuaValue
    public String toString() {
        T t = this.value;
        return t == null ? "nil" : t.toString();
    }

    public static final class ImmutableString extends ImmutableLuaValue<ByteBuffer> {
        private String javaString;

        private static ByteBuffer wrap(byte[] bArr) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bArr.length);
            byteBufferAllocateDirect.put(bArr);
            byteBufferAllocateDirect.flip();
            return byteBufferAllocateDirect.asReadOnlyBuffer();
        }

        @Override // party.iroiro.luajava.value.AbstractLuaValue, party.iroiro.luajava.value.LuaTableTrait
        public int length() {
            return ((ByteBuffer) this.value).limit();
        }

        @Override // party.iroiro.luajava.value.LuaValue
        public void push(Lua lua) {
            lua.push((ByteBuffer) this.value);
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
            if (this.javaString == null) {
                this.javaString = StandardCharsets.UTF_8.decode(((ByteBuffer) this.value).duplicate()).toString();
            }
            return this.javaString;
        }

        private ImmutableString(Lua lua, ByteBuffer byteBuffer) {
            super(lua, Lua.LuaType.STRING, byteBuffer);
            this.javaString = null;
        }

        private ImmutableString(Lua lua, String str) {
            super(lua, Lua.LuaType.STRING, wrap(str.getBytes(StandardCharsets.UTF_8)));
            this.javaString = str;
        }
    }
}
