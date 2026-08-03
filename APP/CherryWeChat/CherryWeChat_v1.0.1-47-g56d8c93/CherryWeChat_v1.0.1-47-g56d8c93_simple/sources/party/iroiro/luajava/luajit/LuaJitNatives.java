package party.iroiro.luajava.luajit;

import java.nio.Buffer;
import java.util.concurrent.atomic.AtomicReference;
import party.iroiro.luajava.LuaNatives;
import party.iroiro.luajava.util.GlobalLibraryLoader;

/* JADX INFO: loaded from: classes.dex */
public class LuaJitNatives implements LuaNatives {
    private static final AtomicReference<String> loaded = null;

    static {
        loaded = new AtomicReference(null);
    }

    public LuaJitNatives() {
        AtomicReference<String> r0 = loaded;
        monitor-enter(r0);
    L8:
        th = move-exception;
        throw th;
    L5:
        if (r0.get() == null) goto L23;
        monitor-exit(r0);     // Catch: Throwable -> L8
        return;
    L23:
        GlobalLibraryLoader.register(LuaJitNatives.class, false);     // Catch: Throwable -> L15
        String r1 = GlobalLibraryLoader.load("luajit");     // Catch: Throwable -> L15
        if (initBindings() != 0) goto L18;
        r0.set(r1);     // Catch: Throwable -> L15
        monitor-exit(r0);     // Catch: Throwable -> L8
        return;
    L18:
        throw new RuntimeException("Unable to init bindings");     // Catch: Throwable -> L15
    L15:
        th = move-exception;
        throw new IllegalStateException(th);     // Catch: Throwable -> L8
    }

    private static native int initBindings();

    private native int reopenGlobal(String r1);

    @Override // party.iroiro.luajava.LuaNatives
    public native int getRegistryIndex();

    @Override // party.iroiro.luajava.LuaNatives
    public void loadAsGlobal() {
        GlobalLibraryLoader.register(getClass(), true);
        reopenGlobal(loaded.get());
    }

    @Override // party.iroiro.luajava.LuaNatives
    public native int luaJ_compare(long r1, int r3, int r4, int r5);

    @Override // party.iroiro.luajava.LuaNatives
    public native int luaJ_dobuffer(long r1, Buffer r3, int r4, int r5, String r6);

    @Override // party.iroiro.luajava.LuaNatives
    public native Object luaJ_dumptobuffer(long r1);

    @Override // party.iroiro.luajava.LuaNatives
    public native void luaJ_gc(long r1);

    @Override // party.iroiro.luajava.LuaNatives
    public native void luaJ_getfield(long r1, int r3, String r4);

    @Override // party.iroiro.luajava.LuaNatives
    public native void luaJ_getglobal(long r1, String r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native void luaJ_getmetatable(long r1, String r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native void luaJ_gettable(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native int luaJ_initloader(long r1);

    @Override // party.iroiro.luajava.LuaNatives
    public native int luaJ_invokespecial(long r1, Class r3, String r4, String r5, Object r6, String r7);

    @Override // party.iroiro.luajava.LuaNatives
    public native int luaJ_isinteger(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native int luaJ_isobject(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native int luaJ_len(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native int luaJ_loadbuffer(long r1, Buffer r3, int r4, int r5, String r6);

    @Override // party.iroiro.luajava.LuaNatives
    public native long luaJ_newthread(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native void luaJ_openlib(long r1, String r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native void luaJ_pusharray(long r1, Object r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native void luaJ_pushclass(long r1, Object r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native void luaJ_pushfunction(long r1, Object r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native void luaJ_pushlstring(long r1, Buffer r3, int r4, int r5);

    @Override // party.iroiro.luajava.LuaNatives
    public native void luaJ_pushobject(long r1, Object r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native void luaJ_pushstring(long r1, String r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native void luaJ_rawget(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native void luaJ_rawgeti(long r1, int r3, int r4);

    @Override // party.iroiro.luajava.LuaNatives
    public native void luaJ_removestateindex(long r1);

    @Override // party.iroiro.luajava.LuaNatives
    public native int luaJ_resume(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native void luaJ_setmetatable(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native Object luaJ_tobuffer(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native Object luaJ_todirectbuffer(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native Object luaJ_toobject(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native int luaL_callmeta(long r1, int r3, String r4);

    @Override // party.iroiro.luajava.LuaNatives
    public native int luaL_dostring(long r1, String r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native int luaL_getmetafield(long r1, int r3, String r4);

    public native void luaL_getmetatable(long r1, String r3);

    public native String luaL_gsub(long r1, String r3, String r4, String r5);

    @Override // party.iroiro.luajava.LuaNatives
    public native int luaL_loadstring(long r1, String r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native int luaL_newmetatable(long r1, String r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native long luaL_newstate(int r1);

    @Override // party.iroiro.luajava.LuaNatives
    public native void luaL_openlibs(long r1);

    @Override // party.iroiro.luajava.LuaNatives
    public native int luaL_ref(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native String luaL_typename(long r1, int r3);

    public native int luaL_typerror(long r1, int r3, String r4);

    @Override // party.iroiro.luajava.LuaNatives
    public native void luaL_unref(long r1, int r3, int r4);

    @Override // party.iroiro.luajava.LuaNatives
    public native void luaL_where(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_checkstack(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native void lua_close(long r1);

    @Override // party.iroiro.luajava.LuaNatives
    public native void lua_concat(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native void lua_createtable(long r1, int r3, int r4);

    public native int lua_equal(long r1, int r3, int r4);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_error(long r1);

    public native int lua_gc(long r1, int r3, int r4);

    public native void lua_getfenv(long r1, int r3);

    public native void lua_getfield(long r1, int r3, String r4);

    public native void lua_getglobal(long r1, String r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_gethookcount(long r1);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_gethookmask(long r1);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_getmetatable(long r1, int r3);

    public native void lua_gettable(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_gettop(long r1);

    @Override // party.iroiro.luajava.LuaNatives
    public native String lua_getupvalue(long r1, int r3, int r4);

    @Override // party.iroiro.luajava.LuaNatives
    public native void lua_insert(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_isboolean(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_iscfunction(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_isfunction(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_islightuserdata(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_isnil(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_isnone(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_isnoneornil(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_isnumber(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_isstring(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_istable(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_isthread(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_isuserdata(long r1, int r3);

    public native int lua_lessthan(long r1, int r3, int r4);

    @Override // party.iroiro.luajava.LuaNatives
    public native void lua_newtable(long r1);

    @Override // party.iroiro.luajava.LuaNatives
    public native long lua_newthread(long r1);

    public native long lua_newuserdata(long r1, long r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_next(long r1, int r3);

    public native long lua_objlen(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_pcall(long r1, int r3, int r4, int r5);

    @Override // party.iroiro.luajava.LuaNatives
    public native void lua_pop(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native void lua_pushboolean(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native void lua_pushinteger(long r1, long r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native void lua_pushlightuserdata(long r1, long r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native void lua_pushnil(long r1);

    @Override // party.iroiro.luajava.LuaNatives
    public native void lua_pushnumber(long r1, double r3);

    public native void lua_pushstring(long r1, String r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_pushthread(long r1);

    @Override // party.iroiro.luajava.LuaNatives
    public native void lua_pushvalue(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_rawequal(long r1, int r3, int r4);

    public native void lua_rawget(long r1, int r3);

    public native void lua_rawgeti(long r1, int r3, int r4);

    @Override // party.iroiro.luajava.LuaNatives
    public native void lua_rawset(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native void lua_rawseti(long r1, int r3, int r4);

    @Override // party.iroiro.luajava.LuaNatives
    public native void lua_remove(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native void lua_replace(long r1, int r3);

    public native int lua_resume(long r1, int r3);

    public native int lua_setfenv(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native void lua_setfield(long r1, int r3, String r4);

    @Override // party.iroiro.luajava.LuaNatives
    public native void lua_setglobal(long r1, String r3);

    public native int lua_setmetatable(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native void lua_settable(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native void lua_settop(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native String lua_setupvalue(long r1, int r3, int r4);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_status(long r1);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_toboolean(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native long lua_tointeger(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native double lua_tonumber(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native long lua_topointer(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native String lua_tostring(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native long lua_tothread(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native long lua_touserdata(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_type(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native String lua_typename(long r1, int r3);

    @Override // party.iroiro.luajava.LuaNatives
    public native void lua_xmove(long r1, long r3, int r5);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_yield(long r1, int r3);
}
