package party.iroiro.luajava.value;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
public class LuaTableValue extends AbstractRefLuaValue implements LuaValue {

    public class AbstractLuaTableSet extends AbstractSet<Map.Entry<LuaValue, LuaValue>> {
        final /* synthetic */ LuaTableValue this$0;

        public AbstractLuaTableSet(LuaTableValue r1) {
            this.this$0 = r1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<LuaValue, LuaValue>> iterator() {
            final Lua r0 = this.this$0.state();
            return new C23671(this, r0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Lua r0 = this.this$0.state();
            this.this$0.push(r0);
            r0.pushNil();
            int r1 = 0;
        L4:
            if (r0.next(-2) == 0) goto L6;
            r1 = r1 + 1;
            r0.pop(1);
            goto L4
        L6:
            r0.pop(1);
            return r1;
        }
    }

    public LuaTableValue(Lua r1, Lua.LuaType r2) {
        super(r1, r2);
    }

    private LuaValue putRaw(Object r4, Object r5) {
        Lua r0 = state();
        push(r0);
        Lua.Conversion r1 = Lua.Conversion.SEMI;
        r0.push(r4, r1);
        r0.pushValue(-1);
        r0.getTable(-3);
        LuaValue r2 = r0.get();
        r0.push(r5, r1);
        r0.setTable(-3);
        r0.pop(1);
        return r2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object r3) {
        Lua r0 = state();
        push(r0);
        r0.push(r3, Lua.Conversion.SEMI);
        r0.getTable(-2);
        boolean r32 = !r0.isNil(-1);
        r0.pop(2);
        return r32;
    }

    @Override // party.iroiro.luajava.value.AbstractLuaValue, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<LuaValue, LuaValue>> entrySet() {
        return new AbstractLuaTableSet(this);
    }

    @Override // java.util.AbstractMap, java.util.Map, party.iroiro.luajava.value.LuaTableTrait
    public /* bridge */ /* synthetic */ LuaValue get(Object r1) {
        return get2(r1);
    }

    @Override // party.iroiro.luajava.value.AbstractLuaValue, party.iroiro.luajava.value.LuaTableTrait
    public int length() {
        Lua r0 = state();
        push(r0);
        int r1 = r0.rawLength(-1);
        r0.pop(1);
        return r1;
    }

    @Override // java.util.AbstractMap, java.util.Map, party.iroiro.luajava.value.LuaTableTrait
    public /* bridge */ /* synthetic */ LuaValue put(LuaValue r1, LuaValue r2) {
        return put2(r1, r2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ LuaValue remove(Object r1) {
        return remove2(r1);
    }

    @Override // party.iroiro.luajava.value.AbstractLuaValue, party.iroiro.luajava.value.LuaTableTrait
    public LuaValue set(Object r1, Object r2) {
        return putRaw(r1, r2);
    }

    @Override // party.iroiro.luajava.value.AbstractLuaValue, party.iroiro.luajava.value.LuaTableTrait
    public LuaValue get(int r4) {
        Lua r0 = state();
        push(r0);
        r0.push(r4);
        r0.getTable(-2);
        LuaValue r42 = r0.get();
        r0.pop(1);
        return r42;
    }

    @Override // party.iroiro.luajava.value.AbstractLuaValue, party.iroiro.luajava.value.LuaTableTrait
    /* JADX INFO: renamed from: put, reason: avoid collision after fix types in other method */
    public LuaValue put2(LuaValue r1, LuaValue r2) {
        return putRaw(r1, r2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: remove, reason: avoid collision after fix types in other method */
    public LuaValue remove2(Object r2) {
        return putRaw(r2, null);
    }

    @Override // party.iroiro.luajava.value.AbstractLuaValue, party.iroiro.luajava.value.LuaTableTrait
    public LuaValue set(int r1, Object r2) {
        return putRaw(Integer.valueOf(r1), r2);
    }

    @Override // party.iroiro.luajava.value.AbstractLuaValue, party.iroiro.luajava.value.LuaTableTrait
    public LuaValue get(String r3) {
        Lua r0 = state();
        push(r0);
        r0.getField(-1, r3);
        LuaValue r32 = r0.get();
        r0.pop(1);
        return r32;
    }

    @Override // party.iroiro.luajava.value.AbstractLuaValue, party.iroiro.luajava.value.LuaTableTrait
    public LuaValue get(LuaValue r3) {
        Lua r0 = state();
        push(r0);
        r3.push(r0);
        r0.getTable(-2);
        LuaValue r32 = r0.get();
        r0.pop(1);
        return r32;
    }

    @Override // party.iroiro.luajava.value.AbstractLuaValue, java.util.AbstractMap, java.util.Map, party.iroiro.luajava.value.LuaTableTrait
    /* JADX INFO: renamed from: get, reason: avoid collision after fix types in other method */
    public LuaValue get2(Object r3) {
        Lua r0 = state();
        push(r0);
        r0.push(r3, Lua.Conversion.SEMI);
        r0.getTable(-2);
        LuaValue r32 = r0.get();
        r0.pop(1);
        return r32;
    }
}
