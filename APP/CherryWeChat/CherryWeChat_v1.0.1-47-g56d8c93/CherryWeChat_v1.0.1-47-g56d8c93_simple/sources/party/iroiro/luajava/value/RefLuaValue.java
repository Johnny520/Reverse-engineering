package party.iroiro.luajava.value;

import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
public class RefLuaValue extends AbstractRefLuaValue {
    public RefLuaValue(Lua r1, Lua.LuaType r2) {
        super(r1, r2);
    }

    @Override // java.util.AbstractMap, party.iroiro.luajava.value.LuaValue
    public String toString() {
        return getClass().getSimpleName() + "$" + this.type + "@" + this.f8319L + ":" + getReference();
    }
}
