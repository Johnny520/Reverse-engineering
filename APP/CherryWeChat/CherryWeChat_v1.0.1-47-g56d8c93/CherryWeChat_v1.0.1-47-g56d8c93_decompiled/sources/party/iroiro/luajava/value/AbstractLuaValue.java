package party.iroiro.luajava.value;

import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import party.iroiro.luajava.Lua;
import party.iroiro.luajava.LuaException;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractLuaValue<T extends Lua> extends AbstractMap<LuaValue, LuaValue> implements LuaValue {

    /* JADX INFO: renamed from: L */
    protected final T f8319L;
    protected final Lua.LuaType type;

    public AbstractLuaValue(T t, Lua.LuaType luaType) {
        this.f8319L = t;
        this.type = luaType;
    }

    private Number checkNumber() {
        Object javaObject = toJavaObject();
        if (javaObject instanceof Number) {
            return (Number) javaObject;
        }
        throw new LuaException(LuaException.LuaError.JAVA, this.type + " is not a number");
    }

    @Override // party.iroiro.luajava.value.LuaValue
    public LuaValue[] call(Object... objArr) {
        throw new UnsupportedOperationException(this.type.toString());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<LuaValue, LuaValue>> entrySet() {
        throw new UnsupportedOperationException(this.type.toString());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return this == obj;
    }

    @Override // java.util.AbstractMap, java.util.Map, party.iroiro.luajava.value.LuaTableTrait
    public /* bridge */ /* synthetic */ LuaValue get(Object obj) {
        return (LuaValue) super.get(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // party.iroiro.luajava.value.LuaTableTrait
    public int length() {
        throw new UnsupportedOperationException(this.type.toString());
    }

    @Override // party.iroiro.luajava.value.LuaTableTrait
    public /* bridge */ /* synthetic */ LuaValue put(LuaValue luaValue, LuaValue luaValue2) {
        return (LuaValue) super.put(luaValue, luaValue2);
    }

    @Override // party.iroiro.luajava.value.LuaTableTrait
    public LuaValue set(int i, Object obj) {
        throw new UnsupportedOperationException(this.type.toString());
    }

    @Override // party.iroiro.luajava.value.LuaValue
    public Lua state() {
        return this.f8319L;
    }

    @Override // party.iroiro.luajava.value.LuaValue
    public boolean toBoolean() {
        return true;
    }

    @Override // party.iroiro.luajava.value.LuaValue
    public ByteBuffer toBuffer() {
        push(this.f8319L);
        ByteBuffer buffer = this.f8319L.toBuffer(-1);
        this.f8319L.pop(1);
        Objects.requireNonNull(buffer);
        return buffer;
    }

    @Override // party.iroiro.luajava.value.LuaValue
    public long toInteger() {
        return checkNumber().longValue();
    }

    @Override // party.iroiro.luajava.value.LuaValue
    public double toNumber() {
        return checkNumber().doubleValue();
    }

    @Override // party.iroiro.luajava.value.LuaValue
    public <I> I toProxy(Class<I> cls) {
        return (I) toProxy(new Class[]{cls}, Lua.Conversion.SEMI);
    }

    @Override // party.iroiro.luajava.value.LuaValue
    public Lua.LuaType type() {
        return this.type;
    }

    @Override // party.iroiro.luajava.value.LuaTableTrait
    public LuaValue get(int i) {
        throw new UnsupportedOperationException(this.type.toString());
    }

    @Override // party.iroiro.luajava.value.LuaTableTrait
    public LuaValue set(Object obj, Object obj2) {
        throw new UnsupportedOperationException(this.type.toString());
    }

    @Override // party.iroiro.luajava.value.LuaValue
    public Object toProxy(Class<?>[] clsArr, Lua.Conversion conversion) {
        push(this.f8319L);
        return this.f8319L.createProxy(clsArr, conversion);
    }

    @Override // party.iroiro.luajava.value.LuaTableTrait
    public LuaValue get(String str) {
        throw new UnsupportedOperationException(this.type.toString());
    }

    @Override // party.iroiro.luajava.value.LuaTableTrait
    public LuaValue get(LuaValue luaValue) {
        throw new UnsupportedOperationException(this.type.toString());
    }
}
