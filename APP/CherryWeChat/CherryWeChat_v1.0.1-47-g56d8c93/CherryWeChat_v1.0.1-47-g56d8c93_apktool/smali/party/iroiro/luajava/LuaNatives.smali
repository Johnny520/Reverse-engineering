.class public interface abstract Lparty/iroiro/luajava/LuaNatives;
.super Ljava/lang/Object;
.source ""


# virtual methods
.method public abstract getRegistryIndex()I
.end method

.method public abstract loadAsGlobal()V
.end method

.method public abstract luaJ_compare(JIII)I
.end method

.method public abstract luaJ_dobuffer(JLjava/nio/Buffer;IILjava/lang/String;)I
.end method

.method public abstract luaJ_dumptobuffer(J)Ljava/lang/Object;
.end method

.method public abstract luaJ_gc(J)V
.end method

.method public abstract luaJ_getfield(JILjava/lang/String;)V
.end method

.method public abstract luaJ_getglobal(JLjava/lang/String;)V
.end method

.method public abstract luaJ_getmetatable(JLjava/lang/String;)V
.end method

.method public abstract luaJ_gettable(JI)V
.end method

.method public abstract luaJ_initloader(J)I
.end method

.method public abstract luaJ_invokespecial(JLjava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)I
.end method

.method public abstract luaJ_isinteger(JI)I
.end method

.method public abstract luaJ_isobject(JI)I
.end method

.method public abstract luaJ_len(JI)I
.end method

.method public abstract luaJ_loadbuffer(JLjava/nio/Buffer;IILjava/lang/String;)I
.end method

.method public abstract luaJ_newthread(JI)J
.end method

.method public abstract luaJ_openlib(JLjava/lang/String;)V
.end method

.method public abstract luaJ_pusharray(JLjava/lang/Object;)V
.end method

.method public abstract luaJ_pushclass(JLjava/lang/Object;)V
.end method

.method public abstract luaJ_pushfunction(JLjava/lang/Object;)V
.end method

.method public abstract luaJ_pushlstring(JLjava/nio/Buffer;II)V
.end method

.method public abstract luaJ_pushobject(JLjava/lang/Object;)V
.end method

.method public abstract luaJ_pushstring(JLjava/lang/String;)V
.end method

.method public abstract luaJ_rawget(JI)V
.end method

.method public abstract luaJ_rawgeti(JII)V
.end method

.method public abstract luaJ_removestateindex(J)V
.end method

.method public abstract luaJ_resume(JI)I
.end method

.method public abstract luaJ_setmetatable(JI)V
.end method

.method public abstract luaJ_tobuffer(JI)Ljava/lang/Object;
.end method

.method public abstract luaJ_todirectbuffer(JI)Ljava/lang/Object;
.end method

.method public abstract luaJ_toobject(JI)Ljava/lang/Object;
.end method

.method public abstract luaL_callmeta(JILjava/lang/String;)I
.end method

.method public abstract luaL_dostring(JLjava/lang/String;)I
.end method

.method public abstract luaL_getmetafield(JILjava/lang/String;)I
.end method

.method public abstract luaL_loadstring(JLjava/lang/String;)I
.end method

.method public abstract luaL_newmetatable(JLjava/lang/String;)I
.end method

.method public abstract luaL_newstate(I)J
.end method

.method public abstract luaL_openlibs(J)V
.end method

.method public abstract luaL_ref(JI)I
.end method

.method public abstract luaL_typename(JI)Ljava/lang/String;
.end method

.method public abstract luaL_unref(JII)V
.end method

.method public abstract luaL_where(JI)V
.end method

.method public abstract lua_checkstack(JI)I
.end method

.method public abstract lua_close(J)V
.end method

.method public abstract lua_concat(JI)V
.end method

.method public abstract lua_createtable(JII)V
.end method

.method public abstract lua_error(J)I
.end method

.method public abstract lua_gethookcount(J)I
.end method

.method public abstract lua_gethookmask(J)I
.end method

.method public abstract lua_getmetatable(JI)I
.end method

.method public abstract lua_gettop(J)I
.end method

.method public abstract lua_getupvalue(JII)Ljava/lang/String;
.end method

.method public abstract lua_insert(JI)V
.end method

.method public abstract lua_isboolean(JI)I
.end method

.method public abstract lua_iscfunction(JI)I
.end method

.method public abstract lua_isfunction(JI)I
.end method

.method public abstract lua_islightuserdata(JI)I
.end method

.method public abstract lua_isnil(JI)I
.end method

.method public abstract lua_isnone(JI)I
.end method

.method public abstract lua_isnoneornil(JI)I
.end method

.method public abstract lua_isnumber(JI)I
.end method

.method public abstract lua_isstring(JI)I
.end method

.method public abstract lua_istable(JI)I
.end method

.method public abstract lua_isthread(JI)I
.end method

.method public abstract lua_isuserdata(JI)I
.end method

.method public abstract lua_newtable(J)V
.end method

.method public abstract lua_newthread(J)J
.end method

.method public abstract lua_next(JI)I
.end method

.method public abstract lua_pcall(JIII)I
.end method

.method public abstract lua_pop(JI)V
.end method

.method public abstract lua_pushboolean(JI)V
.end method

.method public abstract lua_pushinteger(JJ)V
.end method

.method public abstract lua_pushlightuserdata(JJ)V
.end method

.method public abstract lua_pushnil(J)V
.end method

.method public abstract lua_pushnumber(JD)V
.end method

.method public abstract lua_pushthread(J)I
.end method

.method public abstract lua_pushvalue(JI)V
.end method

.method public abstract lua_rawequal(JII)I
.end method

.method public abstract lua_rawset(JI)V
.end method

.method public abstract lua_rawseti(JII)V
.end method

.method public abstract lua_remove(JI)V
.end method

.method public abstract lua_replace(JI)V
.end method

.method public abstract lua_setfield(JILjava/lang/String;)V
.end method

.method public abstract lua_setglobal(JLjava/lang/String;)V
.end method

.method public abstract lua_settable(JI)V
.end method

.method public abstract lua_settop(JI)V
.end method

.method public abstract lua_setupvalue(JII)Ljava/lang/String;
.end method

.method public abstract lua_status(J)I
.end method

.method public abstract lua_toboolean(JI)I
.end method

.method public abstract lua_tointeger(JI)J
.end method

.method public abstract lua_tonumber(JI)D
.end method

.method public abstract lua_topointer(JI)J
.end method

.method public abstract lua_tostring(JI)Ljava/lang/String;
.end method

.method public abstract lua_tothread(JI)J
.end method

.method public abstract lua_touserdata(JI)J
.end method

.method public abstract lua_type(JI)I
.end method

.method public abstract lua_typename(JI)Ljava/lang/String;
.end method

.method public abstract lua_xmove(JJI)V
.end method

.method public abstract lua_yield(JI)I
.end method
