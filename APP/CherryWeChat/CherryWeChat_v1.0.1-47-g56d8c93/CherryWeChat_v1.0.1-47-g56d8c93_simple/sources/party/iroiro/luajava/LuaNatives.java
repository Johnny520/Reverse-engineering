package party.iroiro.luajava;

import java.nio.Buffer;

/* JADX INFO: loaded from: classes.dex */
public interface LuaNatives {
    int getRegistryIndex();

    void loadAsGlobal();

    int luaJ_compare(long r1, int r3, int r4, int r5);

    int luaJ_dobuffer(long r1, Buffer r3, int r4, int r5, String r6);

    Object luaJ_dumptobuffer(long r1);

    void luaJ_gc(long r1);

    void luaJ_getfield(long r1, int r3, String r4);

    void luaJ_getglobal(long r1, String r3);

    void luaJ_getmetatable(long r1, String r3);

    void luaJ_gettable(long r1, int r3);

    int luaJ_initloader(long r1);

    int luaJ_invokespecial(long r1, Class r3, String r4, String r5, Object r6, String r7);

    int luaJ_isinteger(long r1, int r3);

    int luaJ_isobject(long r1, int r3);

    int luaJ_len(long r1, int r3);

    int luaJ_loadbuffer(long r1, Buffer r3, int r4, int r5, String r6);

    long luaJ_newthread(long r1, int r3);

    void luaJ_openlib(long r1, String r3);

    void luaJ_pusharray(long r1, Object r3);

    void luaJ_pushclass(long r1, Object r3);

    void luaJ_pushfunction(long r1, Object r3);

    void luaJ_pushlstring(long r1, Buffer r3, int r4, int r5);

    void luaJ_pushobject(long r1, Object r3);

    void luaJ_pushstring(long r1, String r3);

    void luaJ_rawget(long r1, int r3);

    void luaJ_rawgeti(long r1, int r3, int r4);

    void luaJ_removestateindex(long r1);

    int luaJ_resume(long r1, int r3);

    void luaJ_setmetatable(long r1, int r3);

    Object luaJ_tobuffer(long r1, int r3);

    Object luaJ_todirectbuffer(long r1, int r3);

    Object luaJ_toobject(long r1, int r3);

    int luaL_callmeta(long r1, int r3, String r4);

    int luaL_dostring(long r1, String r3);

    int luaL_getmetafield(long r1, int r3, String r4);

    int luaL_loadstring(long r1, String r3);

    int luaL_newmetatable(long r1, String r3);

    long luaL_newstate(int r1);

    void luaL_openlibs(long r1);

    int luaL_ref(long r1, int r3);

    String luaL_typename(long r1, int r3);

    void luaL_unref(long r1, int r3, int r4);

    void luaL_where(long r1, int r3);

    int lua_checkstack(long r1, int r3);

    void lua_close(long r1);

    void lua_concat(long r1, int r3);

    void lua_createtable(long r1, int r3, int r4);

    int lua_error(long r1);

    int lua_gethookcount(long r1);

    int lua_gethookmask(long r1);

    int lua_getmetatable(long r1, int r3);

    int lua_gettop(long r1);

    String lua_getupvalue(long r1, int r3, int r4);

    void lua_insert(long r1, int r3);

    int lua_isboolean(long r1, int r3);

    int lua_iscfunction(long r1, int r3);

    int lua_isfunction(long r1, int r3);

    int lua_islightuserdata(long r1, int r3);

    int lua_isnil(long r1, int r3);

    int lua_isnone(long r1, int r3);

    int lua_isnoneornil(long r1, int r3);

    int lua_isnumber(long r1, int r3);

    int lua_isstring(long r1, int r3);

    int lua_istable(long r1, int r3);

    int lua_isthread(long r1, int r3);

    int lua_isuserdata(long r1, int r3);

    void lua_newtable(long r1);

    long lua_newthread(long r1);

    int lua_next(long r1, int r3);

    int lua_pcall(long r1, int r3, int r4, int r5);

    void lua_pop(long r1, int r3);

    void lua_pushboolean(long r1, int r3);

    void lua_pushinteger(long r1, long r3);

    void lua_pushlightuserdata(long r1, long r3);

    void lua_pushnil(long r1);

    void lua_pushnumber(long r1, double r3);

    int lua_pushthread(long r1);

    void lua_pushvalue(long r1, int r3);

    int lua_rawequal(long r1, int r3, int r4);

    void lua_rawset(long r1, int r3);

    void lua_rawseti(long r1, int r3, int r4);

    void lua_remove(long r1, int r3);

    void lua_replace(long r1, int r3);

    void lua_setfield(long r1, int r3, String r4);

    void lua_setglobal(long r1, String r3);

    void lua_settable(long r1, int r3);

    void lua_settop(long r1, int r3);

    String lua_setupvalue(long r1, int r3, int r4);

    int lua_status(long r1);

    int lua_toboolean(long r1, int r3);

    long lua_tointeger(long r1, int r3);

    double lua_tonumber(long r1, int r3);

    long lua_topointer(long r1, int r3);

    String lua_tostring(long r1, int r3);

    long lua_tothread(long r1, int r3);

    long lua_touserdata(long r1, int r3);

    int lua_type(long r1, int r3);

    String lua_typename(long r1, int r3);

    void lua_xmove(long r1, long r3, int r5);

    int lua_yield(long r1, int r3);
}
