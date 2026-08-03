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

    public AbstractLuaValue(T r1, Lua.LuaType r2) {
        this.f8319L = r1;
        this.type = r2;
    }

    private Number checkNumber() {
        Object r0 = toJavaObject();
        if ((r0 instanceof Number) == false) goto L7;
        return (Number) r0;
    L7:
        throw new LuaException(LuaException.LuaError.JAVA, this.type + " is not a number");
    }

    @Override // party.iroiro.luajava.value.LuaValue
    public LuaValue[] call(Object... r2) {
        throw new UnsupportedOperationException(this.type.toString());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<LuaValue, LuaValue>> entrySet() {
        throw new UnsupportedOperationException(this.type.toString());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object r1) {
        if (this != r1) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map, party.iroiro.luajava.value.LuaTableTrait
    public /* bridge */ /* synthetic */ LuaValue get(Object r1) {
        return (LuaValue) super.get(r1);
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
    public /* bridge */ /* synthetic */ LuaValue put(LuaValue r1, LuaValue r2) {
        return (LuaValue) super.put(r1, r2);
    }

    @Override // party.iroiro.luajava.value.LuaTableTrait
    public LuaValue set(int r1, Object r2) {
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
        ByteBuffer r0 = this.f8319L.toBuffer(-1);
        this.f8319L.pop(1);
        Objects.requireNonNull(r0);
        return r0;
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
    public <I> I toProxy(Class<I> r2) {
        return (I) toProxy(new Class[]{r2}, Lua.Conversion.SEMI);
    }

    @Override // party.iroiro.luajava.value.LuaValue
    public Lua.LuaType type() {
        return this.type;
    }

    @Override // party.iroiro.luajava.value.LuaTableTrait
    public LuaValue get(int r2) {
        throw new UnsupportedOperationException(this.type.toString());
    }

    @Override // party.iroiro.luajava.value.LuaTableTrait
    public LuaValue set(Object r1, Object r2) {
        throw new UnsupportedOperationException(this.type.toString());
    }

    @Override // party.iroiro.luajava.value.LuaValue
    public Object toProxy(Class<?>[] r2, Lua.Conversion r3) {
        push(this.f8319L);
        return this.f8319L.createProxy(r2, r3);
    }

    @Override // party.iroiro.luajava.value.LuaTableTrait
    public LuaValue get(String r2) {
        throw new UnsupportedOperationException(this.type.toString());
    }

    @Override // party.iroiro.luajava.value.LuaTableTrait
    public LuaValue get(LuaValue r2) {
        throw new UnsupportedOperationException(this.type.toString());
    }
}
