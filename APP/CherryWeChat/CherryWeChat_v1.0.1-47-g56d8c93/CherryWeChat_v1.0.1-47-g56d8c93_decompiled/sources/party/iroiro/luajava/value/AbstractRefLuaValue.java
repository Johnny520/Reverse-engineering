package party.iroiro.luajava.value;

import party.iroiro.luajava.Lua;
import party.iroiro.luajava.LuaException;
import party.iroiro.luajava.cleaner.LuaReferable;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRefLuaValue extends AbstractLuaValue<Lua> implements LuaReferable {
    private final int ref;

    public AbstractRefLuaValue(Lua lua, Lua.LuaType luaType) {
        super(lua, luaType);
        this.ref = lua.ref();
    }

    @Override // party.iroiro.luajava.value.AbstractLuaValue, party.iroiro.luajava.value.LuaValue
    public LuaValue[] call(Object... objArr) {
        int top = this.f8319L.getTop();
        push(this.f8319L);
        for (Object obj : objArr) {
            this.f8319L.push(obj, Lua.Conversion.SEMI);
        }
        this.f8319L.pCall(objArr.length, -1);
        int top2 = this.f8319L.getTop() - top;
        LuaValue[] luaValueArr = new LuaValue[top2];
        for (int i = 0; i < top2; i++) {
            luaValueArr[(top2 - i) - 1] = this.f8319L.get();
        }
        return luaValueArr;
    }

    @Override // party.iroiro.luajava.cleaner.LuaReferable
    public int getReference() {
        return this.ref;
    }

    @Override // party.iroiro.luajava.value.LuaValue
    public void push(Lua lua) {
        if (lua.getMainState() != this.f8319L.getMainState()) {
            throw new LuaException(LuaException.LuaError.MEMORY, "Unable to pass Lua values between different Lua states");
        }
        lua.refGet(this.ref);
    }

    @Override // party.iroiro.luajava.value.LuaValue
    public Object toJavaObject() {
        push(this.f8319L);
        Object object = this.f8319L.toObject(-1);
        this.f8319L.pop(1);
        return object;
    }
}
