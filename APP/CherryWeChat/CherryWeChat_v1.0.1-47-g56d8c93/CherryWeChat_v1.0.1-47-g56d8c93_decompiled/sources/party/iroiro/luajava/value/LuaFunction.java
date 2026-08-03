package party.iroiro.luajava.value;

import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
public interface LuaFunction {
    LuaValue[] call(Lua lua, LuaValue[] luaValueArr);
}
