package party.iroiro.luajava.value;

import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
public class RefLuaValue extends AbstractRefLuaValue {
    public RefLuaValue(Lua lua, Lua.LuaType luaType) {
        super(lua, luaType);
    }

    @Override // java.util.AbstractMap, party.iroiro.luajava.value.LuaValue
    public String toString() {
        return getClass().getSimpleName() + "$" + this.type + "@" + this.f8319L + ":" + getReference();
    }
}
