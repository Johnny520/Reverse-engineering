package party.iroiro.luajava.luajit;

import java.nio.Buffer;
import java.util.concurrent.atomic.AtomicReference;
import party.iroiro.luajava.LuaNatives;
import party.iroiro.luajava.util.GlobalLibraryLoader;

/* JADX INFO: loaded from: classes.dex */
public class LuaJitNatives implements LuaNatives {
    private static final AtomicReference<String> loaded = new AtomicReference<>(null);

    public LuaJitNatives() {
        AtomicReference<String> atomicReference = loaded;
        synchronized (atomicReference) {
            if (atomicReference.get() != null) {
                return;
            }
            try {
                GlobalLibraryLoader.register(LuaJitNatives.class, false);
                String strLoad = GlobalLibraryLoader.load("luajit");
                if (initBindings() != 0) {
                    throw new RuntimeException("Unable to init bindings");
                }
                atomicReference.set(strLoad);
            } catch (Throwable th) {
                throw new IllegalStateException(th);
            }
        }
    }

    private static native int initBindings();

    private native int reopenGlobal(String str);

    @Override // party.iroiro.luajava.LuaNatives
    public native int getRegistryIndex();

    @Override // party.iroiro.luajava.LuaNatives
    public void loadAsGlobal() {
        GlobalLibraryLoader.register(getClass(), true);
        reopenGlobal(loaded.get());
    }

    @Override // party.iroiro.luajava.LuaNatives
    public native int luaJ_compare(long j, int i, int i2, int i3);

    @Override // party.iroiro.luajava.LuaNatives
    public native int luaJ_dobuffer(long j, Buffer buffer, int i, int i2, String str);

    @Override // party.iroiro.luajava.LuaNatives
    public native Object luaJ_dumptobuffer(long j);

    @Override // party.iroiro.luajava.LuaNatives
    public native void luaJ_gc(long j);

    @Override // party.iroiro.luajava.LuaNatives
    public native void luaJ_getfield(long j, int i, String str);

    @Override // party.iroiro.luajava.LuaNatives
    public native void luaJ_getglobal(long j, String str);

    @Override // party.iroiro.luajava.LuaNatives
    public native void luaJ_getmetatable(long j, String str);

    @Override // party.iroiro.luajava.LuaNatives
    public native void luaJ_gettable(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native int luaJ_initloader(long j);

    @Override // party.iroiro.luajava.LuaNatives
    public native int luaJ_invokespecial(long j, Class cls, String str, String str2, Object obj, String str3);

    @Override // party.iroiro.luajava.LuaNatives
    public native int luaJ_isinteger(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native int luaJ_isobject(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native int luaJ_len(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native int luaJ_loadbuffer(long j, Buffer buffer, int i, int i2, String str);

    @Override // party.iroiro.luajava.LuaNatives
    public native long luaJ_newthread(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native void luaJ_openlib(long j, String str);

    @Override // party.iroiro.luajava.LuaNatives
    public native void luaJ_pusharray(long j, Object obj);

    @Override // party.iroiro.luajava.LuaNatives
    public native void luaJ_pushclass(long j, Object obj);

    @Override // party.iroiro.luajava.LuaNatives
    public native void luaJ_pushfunction(long j, Object obj);

    @Override // party.iroiro.luajava.LuaNatives
    public native void luaJ_pushlstring(long j, Buffer buffer, int i, int i2);

    @Override // party.iroiro.luajava.LuaNatives
    public native void luaJ_pushobject(long j, Object obj);

    @Override // party.iroiro.luajava.LuaNatives
    public native void luaJ_pushstring(long j, String str);

    @Override // party.iroiro.luajava.LuaNatives
    public native void luaJ_rawget(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native void luaJ_rawgeti(long j, int i, int i2);

    @Override // party.iroiro.luajava.LuaNatives
    public native void luaJ_removestateindex(long j);

    @Override // party.iroiro.luajava.LuaNatives
    public native int luaJ_resume(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native void luaJ_setmetatable(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native Object luaJ_tobuffer(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native Object luaJ_todirectbuffer(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native Object luaJ_toobject(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native int luaL_callmeta(long j, int i, String str);

    @Override // party.iroiro.luajava.LuaNatives
    public native int luaL_dostring(long j, String str);

    @Override // party.iroiro.luajava.LuaNatives
    public native int luaL_getmetafield(long j, int i, String str);

    public native void luaL_getmetatable(long j, String str);

    public native String luaL_gsub(long j, String str, String str2, String str3);

    @Override // party.iroiro.luajava.LuaNatives
    public native int luaL_loadstring(long j, String str);

    @Override // party.iroiro.luajava.LuaNatives
    public native int luaL_newmetatable(long j, String str);

    @Override // party.iroiro.luajava.LuaNatives
    public native long luaL_newstate(int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native void luaL_openlibs(long j);

    @Override // party.iroiro.luajava.LuaNatives
    public native int luaL_ref(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native String luaL_typename(long j, int i);

    public native int luaL_typerror(long j, int i, String str);

    @Override // party.iroiro.luajava.LuaNatives
    public native void luaL_unref(long j, int i, int i2);

    @Override // party.iroiro.luajava.LuaNatives
    public native void luaL_where(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_checkstack(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native void lua_close(long j);

    @Override // party.iroiro.luajava.LuaNatives
    public native void lua_concat(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native void lua_createtable(long j, int i, int i2);

    public native int lua_equal(long j, int i, int i2);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_error(long j);

    public native int lua_gc(long j, int i, int i2);

    public native void lua_getfenv(long j, int i);

    public native void lua_getfield(long j, int i, String str);

    public native void lua_getglobal(long j, String str);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_gethookcount(long j);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_gethookmask(long j);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_getmetatable(long j, int i);

    public native void lua_gettable(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_gettop(long j);

    @Override // party.iroiro.luajava.LuaNatives
    public native String lua_getupvalue(long j, int i, int i2);

    @Override // party.iroiro.luajava.LuaNatives
    public native void lua_insert(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_isboolean(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_iscfunction(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_isfunction(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_islightuserdata(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_isnil(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_isnone(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_isnoneornil(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_isnumber(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_isstring(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_istable(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_isthread(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_isuserdata(long j, int i);

    public native int lua_lessthan(long j, int i, int i2);

    @Override // party.iroiro.luajava.LuaNatives
    public native void lua_newtable(long j);

    @Override // party.iroiro.luajava.LuaNatives
    public native long lua_newthread(long j);

    public native long lua_newuserdata(long j, long j2);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_next(long j, int i);

    public native long lua_objlen(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_pcall(long j, int i, int i2, int i3);

    @Override // party.iroiro.luajava.LuaNatives
    public native void lua_pop(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native void lua_pushboolean(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native void lua_pushinteger(long j, long j2);

    @Override // party.iroiro.luajava.LuaNatives
    public native void lua_pushlightuserdata(long j, long j2);

    @Override // party.iroiro.luajava.LuaNatives
    public native void lua_pushnil(long j);

    @Override // party.iroiro.luajava.LuaNatives
    public native void lua_pushnumber(long j, double d);

    public native void lua_pushstring(long j, String str);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_pushthread(long j);

    @Override // party.iroiro.luajava.LuaNatives
    public native void lua_pushvalue(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_rawequal(long j, int i, int i2);

    public native void lua_rawget(long j, int i);

    public native void lua_rawgeti(long j, int i, int i2);

    @Override // party.iroiro.luajava.LuaNatives
    public native void lua_rawset(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native void lua_rawseti(long j, int i, int i2);

    @Override // party.iroiro.luajava.LuaNatives
    public native void lua_remove(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native void lua_replace(long j, int i);

    public native int lua_resume(long j, int i);

    public native int lua_setfenv(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native void lua_setfield(long j, int i, String str);

    @Override // party.iroiro.luajava.LuaNatives
    public native void lua_setglobal(long j, String str);

    public native int lua_setmetatable(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native void lua_settable(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native void lua_settop(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native String lua_setupvalue(long j, int i, int i2);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_status(long j);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_toboolean(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native long lua_tointeger(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native double lua_tonumber(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native long lua_topointer(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native String lua_tostring(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native long lua_tothread(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native long lua_touserdata(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_type(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native String lua_typename(long j, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native void lua_xmove(long j, long j2, int i);

    @Override // party.iroiro.luajava.LuaNatives
    public native int lua_yield(long j, int i);
}
