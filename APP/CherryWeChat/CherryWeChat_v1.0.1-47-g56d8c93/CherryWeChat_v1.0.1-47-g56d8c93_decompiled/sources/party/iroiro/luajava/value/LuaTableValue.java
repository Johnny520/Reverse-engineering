package party.iroiro.luajava.value;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
public class LuaTableValue extends AbstractRefLuaValue implements LuaValue {

    public class AbstractLuaTableSet extends AbstractSet<Map.Entry<LuaValue, LuaValue>> {
        public AbstractLuaTableSet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<LuaValue, LuaValue>> iterator() {
            return new Iterator<Map.Entry<LuaValue, LuaValue>>(LuaTableValue.this.state()) { // from class: party.iroiro.luajava.value.LuaTableValue.AbstractLuaTableSet.1
                LuaValue keyRef;
                final /* synthetic */ Lua val$L;

                {
                    this.val$L = lua;
                    this.keyRef = lua.fromNull();
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    LuaTableValue.this.push(this.val$L);
                    this.keyRef.push(this.val$L);
                    boolean z = this.val$L.next(-2) == 0;
                    this.val$L.pop(z ? 1 : 3);
                    return !z;
                }

                @Override // java.util.Iterator
                public void remove() {
                    if (this.keyRef.type().equals(Lua.LuaType.NIL)) {
                        throw new IllegalStateException();
                    }
                    LuaTableValue.this.push(this.val$L);
                    this.keyRef.push(this.val$L);
                    this.val$L.pushNil();
                    this.val$L.setTable(-3);
                    this.val$L.pop(1);
                }

                @Override // java.util.Iterator
                public Map.Entry<LuaValue, LuaValue> next() {
                    LuaTableValue.this.push(this.val$L);
                    this.keyRef.push(this.val$L);
                    if (this.val$L.next(-2) == 0) {
                        this.val$L.pop(1);
                        throw new NoSuchElementException();
                    }
                    LuaValue luaValue = this.val$L.get();
                    this.keyRef = this.val$L.get();
                    this.val$L.pop(1);
                    return new AbstractMap.SimpleEntry(this.keyRef, luaValue);
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Lua luaState = LuaTableValue.this.state();
            LuaTableValue.this.push(luaState);
            luaState.pushNil();
            int i = 0;
            while (luaState.next(-2) != 0) {
                i++;
                luaState.pop(1);
            }
            luaState.pop(1);
            return i;
        }
    }

    public LuaTableValue(Lua lua, Lua.LuaType luaType) {
        super(lua, luaType);
    }

    private LuaValue putRaw(Object obj, Object obj2) {
        Lua luaState = state();
        push(luaState);
        Lua.Conversion conversion = Lua.Conversion.SEMI;
        luaState.push(obj, conversion);
        luaState.pushValue(-1);
        luaState.getTable(-3);
        LuaValue luaValue = luaState.get();
        luaState.push(obj2, conversion);
        luaState.setTable(-3);
        luaState.pop(1);
        return luaValue;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Lua luaState = state();
        push(luaState);
        luaState.push(obj, Lua.Conversion.SEMI);
        luaState.getTable(-2);
        boolean z = !luaState.isNil(-1);
        luaState.pop(2);
        return z;
    }

    @Override // party.iroiro.luajava.value.AbstractLuaValue, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<LuaValue, LuaValue>> entrySet() {
        return new AbstractLuaTableSet();
    }

    @Override // party.iroiro.luajava.value.AbstractLuaValue, party.iroiro.luajava.value.LuaTableTrait
    public int length() {
        Lua luaState = state();
        push(luaState);
        int iRawLength = luaState.rawLength(-1);
        luaState.pop(1);
        return iRawLength;
    }

    @Override // party.iroiro.luajava.value.AbstractLuaValue, party.iroiro.luajava.value.LuaTableTrait
    public LuaValue set(Object obj, Object obj2) {
        return putRaw(obj, obj2);
    }

    @Override // party.iroiro.luajava.value.AbstractLuaValue, party.iroiro.luajava.value.LuaTableTrait
    public LuaValue get(int i) {
        Lua luaState = state();
        push(luaState);
        luaState.push(i);
        luaState.getTable(-2);
        LuaValue luaValue = luaState.get();
        luaState.pop(1);
        return luaValue;
    }

    @Override // java.util.AbstractMap, java.util.Map, party.iroiro.luajava.value.LuaTableTrait
    public LuaValue put(LuaValue luaValue, LuaValue luaValue2) {
        return putRaw(luaValue, luaValue2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public LuaValue remove(Object obj) {
        return putRaw(obj, null);
    }

    @Override // party.iroiro.luajava.value.AbstractLuaValue, party.iroiro.luajava.value.LuaTableTrait
    public LuaValue set(int i, Object obj) {
        return putRaw(Integer.valueOf(i), obj);
    }

    @Override // party.iroiro.luajava.value.AbstractLuaValue, party.iroiro.luajava.value.LuaTableTrait
    public LuaValue get(String str) {
        Lua luaState = state();
        push(luaState);
        luaState.getField(-1, str);
        LuaValue luaValue = luaState.get();
        luaState.pop(1);
        return luaValue;
    }

    @Override // party.iroiro.luajava.value.AbstractLuaValue, party.iroiro.luajava.value.LuaTableTrait
    public LuaValue get(LuaValue luaValue) {
        Lua luaState = state();
        push(luaState);
        luaValue.push(luaState);
        luaState.getTable(-2);
        LuaValue luaValue2 = luaState.get();
        luaState.pop(1);
        return luaValue2;
    }

    @Override // java.util.AbstractMap, java.util.Map, party.iroiro.luajava.value.LuaTableTrait
    public LuaValue get(Object obj) {
        Lua luaState = state();
        push(luaState);
        luaState.push(obj, Lua.Conversion.SEMI);
        luaState.getTable(-2);
        LuaValue luaValue = luaState.get();
        luaState.pop(1);
        return luaValue;
    }
}
