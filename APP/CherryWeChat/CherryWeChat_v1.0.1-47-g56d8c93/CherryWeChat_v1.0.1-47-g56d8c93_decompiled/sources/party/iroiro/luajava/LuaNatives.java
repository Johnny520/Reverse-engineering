package party.iroiro.luajava;

import java.nio.Buffer;

/* JADX INFO: loaded from: classes.dex */
public interface LuaNatives {
    int getRegistryIndex();

    void loadAsGlobal();

    int luaJ_compare(long j, int i, int i2, int i3);

    int luaJ_dobuffer(long j, Buffer buffer, int i, int i2, String str);

    Object luaJ_dumptobuffer(long j);

    void luaJ_gc(long j);

    void luaJ_getfield(long j, int i, String str);

    void luaJ_getglobal(long j, String str);

    void luaJ_getmetatable(long j, String str);

    void luaJ_gettable(long j, int i);

    int luaJ_initloader(long j);

    int luaJ_invokespecial(long j, Class cls, String str, String str2, Object obj, String str3);

    int luaJ_isinteger(long j, int i);

    int luaJ_isobject(long j, int i);

    int luaJ_len(long j, int i);

    int luaJ_loadbuffer(long j, Buffer buffer, int i, int i2, String str);

    long luaJ_newthread(long j, int i);

    void luaJ_openlib(long j, String str);

    void luaJ_pusharray(long j, Object obj);

    void luaJ_pushclass(long j, Object obj);

    void luaJ_pushfunction(long j, Object obj);

    void luaJ_pushlstring(long j, Buffer buffer, int i, int i2);

    void luaJ_pushobject(long j, Object obj);

    void luaJ_pushstring(long j, String str);

    void luaJ_rawget(long j, int i);

    void luaJ_rawgeti(long j, int i, int i2);

    void luaJ_removestateindex(long j);

    int luaJ_resume(long j, int i);

    void luaJ_setmetatable(long j, int i);

    Object luaJ_tobuffer(long j, int i);

    Object luaJ_todirectbuffer(long j, int i);

    Object luaJ_toobject(long j, int i);

    int luaL_callmeta(long j, int i, String str);

    int luaL_dostring(long j, String str);

    int luaL_getmetafield(long j, int i, String str);

    int luaL_loadstring(long j, String str);

    int luaL_newmetatable(long j, String str);

    long luaL_newstate(int i);

    void luaL_openlibs(long j);

    int luaL_ref(long j, int i);

    String luaL_typename(long j, int i);

    void luaL_unref(long j, int i, int i2);

    void luaL_where(long j, int i);

    int lua_checkstack(long j, int i);

    void lua_close(long j);

    void lua_concat(long j, int i);

    void lua_createtable(long j, int i, int i2);

    int lua_error(long j);

    int lua_gethookcount(long j);

    int lua_gethookmask(long j);

    int lua_getmetatable(long j, int i);

    int lua_gettop(long j);

    String lua_getupvalue(long j, int i, int i2);

    void lua_insert(long j, int i);

    int lua_isboolean(long j, int i);

    int lua_iscfunction(long j, int i);

    int lua_isfunction(long j, int i);

    int lua_islightuserdata(long j, int i);

    int lua_isnil(long j, int i);

    int lua_isnone(long j, int i);

    int lua_isnoneornil(long j, int i);

    int lua_isnumber(long j, int i);

    int lua_isstring(long j, int i);

    int lua_istable(long j, int i);

    int lua_isthread(long j, int i);

    int lua_isuserdata(long j, int i);

    void lua_newtable(long j);

    long lua_newthread(long j);

    int lua_next(long j, int i);

    int lua_pcall(long j, int i, int i2, int i3);

    void lua_pop(long j, int i);

    void lua_pushboolean(long j, int i);

    void lua_pushinteger(long j, long j2);

    void lua_pushlightuserdata(long j, long j2);

    void lua_pushnil(long j);

    void lua_pushnumber(long j, double d);

    int lua_pushthread(long j);

    void lua_pushvalue(long j, int i);

    int lua_rawequal(long j, int i, int i2);

    void lua_rawset(long j, int i);

    void lua_rawseti(long j, int i, int i2);

    void lua_remove(long j, int i);

    void lua_replace(long j, int i);

    void lua_setfield(long j, int i, String str);

    void lua_setglobal(long j, String str);

    void lua_settable(long j, int i);

    void lua_settop(long j, int i);

    String lua_setupvalue(long j, int i, int i2);

    int lua_status(long j);

    int lua_toboolean(long j, int i);

    long lua_tointeger(long j, int i);

    double lua_tonumber(long j, int i);

    long lua_topointer(long j, int i);

    String lua_tostring(long j, int i);

    long lua_tothread(long j, int i);

    long lua_touserdata(long j, int i);

    int lua_type(long j, int i);

    String lua_typename(long j, int i);

    void lua_xmove(long j, long j2, int i);

    int lua_yield(long j, int i);
}
