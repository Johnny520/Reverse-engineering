.class public Lparty/iroiro/luajava/luajit/LuaJitNatives;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lparty/iroiro/luajava/LuaNatives;


# static fields
.field private static final loaded:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lparty/iroiro/luajava/luajit/LuaJitNatives;->loaded:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lparty/iroiro/luajava/luajit/LuaJitNatives;->loaded:Ljava/util/concurrent/atomic/AtomicReference;

    monitor-enter v0

    :try_start_0
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :try_start_1
    const-class v1, Lparty/iroiro/luajava/luajit/LuaJitNatives;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lparty/iroiro/luajava/util/GlobalLibraryLoader;->register(Ljava/lang/Class;Z)V

    const-string v1, "luajit"

    invoke-static {v1}, Lparty/iroiro/luajava/util/GlobalLibraryLoader;->load(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lparty/iroiro/luajava/luajit/LuaJitNatives;->initBindings()I

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-void

    :catchall_1
    move-exception v1

    goto :goto_0

    :cond_1
    :try_start_3
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Unable to init bindings"

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_0
    :try_start_4
    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    :goto_1
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v1
.end method

.method private static native initBindings()I
.end method

.method private native reopenGlobal(Ljava/lang/String;)I
.end method


# virtual methods
.method public native getRegistryIndex()I
.end method

.method public loadAsGlobal()V
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lparty/iroiro/luajava/util/GlobalLibraryLoader;->register(Ljava/lang/Class;Z)V

    sget-object v0, Lparty/iroiro/luajava/luajit/LuaJitNatives;->loaded:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lparty/iroiro/luajava/luajit/LuaJitNatives;->reopenGlobal(Ljava/lang/String;)I

    return-void
.end method

.method public native luaJ_compare(JIII)I
.end method

.method public native luaJ_dobuffer(JLjava/nio/Buffer;IILjava/lang/String;)I
.end method

.method public native luaJ_dumptobuffer(J)Ljava/lang/Object;
.end method

.method public native luaJ_gc(J)V
.end method

.method public native luaJ_getfield(JILjava/lang/String;)V
.end method

.method public native luaJ_getglobal(JLjava/lang/String;)V
.end method

.method public native luaJ_getmetatable(JLjava/lang/String;)V
.end method

.method public native luaJ_gettable(JI)V
.end method

.method public native luaJ_initloader(J)I
.end method

.method public native luaJ_invokespecial(JLjava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)I
.end method

.method public native luaJ_isinteger(JI)I
.end method

.method public native luaJ_isobject(JI)I
.end method

.method public native luaJ_len(JI)I
.end method

.method public native luaJ_loadbuffer(JLjava/nio/Buffer;IILjava/lang/String;)I
.end method

.method public native luaJ_newthread(JI)J
.end method

.method public native luaJ_openlib(JLjava/lang/String;)V
.end method

.method public native luaJ_pusharray(JLjava/lang/Object;)V
.end method

.method public native luaJ_pushclass(JLjava/lang/Object;)V
.end method

.method public native luaJ_pushfunction(JLjava/lang/Object;)V
.end method

.method public native luaJ_pushlstring(JLjava/nio/Buffer;II)V
.end method

.method public native luaJ_pushobject(JLjava/lang/Object;)V
.end method

.method public native luaJ_pushstring(JLjava/lang/String;)V
.end method

.method public native luaJ_rawget(JI)V
.end method

.method public native luaJ_rawgeti(JII)V
.end method

.method public native luaJ_removestateindex(J)V
.end method

.method public native luaJ_resume(JI)I
.end method

.method public native luaJ_setmetatable(JI)V
.end method

.method public native luaJ_tobuffer(JI)Ljava/lang/Object;
.end method

.method public native luaJ_todirectbuffer(JI)Ljava/lang/Object;
.end method

.method public native luaJ_toobject(JI)Ljava/lang/Object;
.end method

.method public native luaL_callmeta(JILjava/lang/String;)I
.end method

.method public native luaL_dostring(JLjava/lang/String;)I
.end method

.method public native luaL_getmetafield(JILjava/lang/String;)I
.end method

.method public native luaL_getmetatable(JLjava/lang/String;)V
.end method

.method public native luaL_gsub(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public native luaL_loadstring(JLjava/lang/String;)I
.end method

.method public native luaL_newmetatable(JLjava/lang/String;)I
.end method

.method public native luaL_newstate(I)J
.end method

.method public native luaL_openlibs(J)V
.end method

.method public native luaL_ref(JI)I
.end method

.method public native luaL_typename(JI)Ljava/lang/String;
.end method

.method public native luaL_typerror(JILjava/lang/String;)I
.end method

.method public native luaL_unref(JII)V
.end method

.method public native luaL_where(JI)V
.end method

.method public native lua_checkstack(JI)I
.end method

.method public native lua_close(J)V
.end method

.method public native lua_concat(JI)V
.end method

.method public native lua_createtable(JII)V
.end method

.method public native lua_equal(JII)I
.end method

.method public native lua_error(J)I
.end method

.method public native lua_gc(JII)I
.end method

.method public native lua_getfenv(JI)V
.end method

.method public native lua_getfield(JILjava/lang/String;)V
.end method

.method public native lua_getglobal(JLjava/lang/String;)V
.end method

.method public native lua_gethookcount(J)I
.end method

.method public native lua_gethookmask(J)I
.end method

.method public native lua_getmetatable(JI)I
.end method

.method public native lua_gettable(JI)V
.end method

.method public native lua_gettop(J)I
.end method

.method public native lua_getupvalue(JII)Ljava/lang/String;
.end method

.method public native lua_insert(JI)V
.end method

.method public native lua_isboolean(JI)I
.end method

.method public native lua_iscfunction(JI)I
.end method

.method public native lua_isfunction(JI)I
.end method

.method public native lua_islightuserdata(JI)I
.end method

.method public native lua_isnil(JI)I
.end method

.method public native lua_isnone(JI)I
.end method

.method public native lua_isnoneornil(JI)I
.end method

.method public native lua_isnumber(JI)I
.end method

.method public native lua_isstring(JI)I
.end method

.method public native lua_istable(JI)I
.end method

.method public native lua_isthread(JI)I
.end method

.method public native lua_isuserdata(JI)I
.end method

.method public native lua_lessthan(JII)I
.end method

.method public native lua_newtable(J)V
.end method

.method public native lua_newthread(J)J
.end method

.method public native lua_newuserdata(JJ)J
.end method

.method public native lua_next(JI)I
.end method

.method public native lua_objlen(JI)J
.end method

.method public native lua_pcall(JIII)I
.end method

.method public native lua_pop(JI)V
.end method

.method public native lua_pushboolean(JI)V
.end method

.method public native lua_pushinteger(JJ)V
.end method

.method public native lua_pushlightuserdata(JJ)V
.end method

.method public native lua_pushnil(J)V
.end method

.method public native lua_pushnumber(JD)V
.end method

.method public native lua_pushstring(JLjava/lang/String;)V
.end method

.method public native lua_pushthread(J)I
.end method

.method public native lua_pushvalue(JI)V
.end method

.method public native lua_rawequal(JII)I
.end method

.method public native lua_rawget(JI)V
.end method

.method public native lua_rawgeti(JII)V
.end method

.method public native lua_rawset(JI)V
.end method

.method public native lua_rawseti(JII)V
.end method

.method public native lua_remove(JI)V
.end method

.method public native lua_replace(JI)V
.end method

.method public native lua_resume(JI)I
.end method

.method public native lua_setfenv(JI)I
.end method

.method public native lua_setfield(JILjava/lang/String;)V
.end method

.method public native lua_setglobal(JLjava/lang/String;)V
.end method

.method public native lua_setmetatable(JI)I
.end method

.method public native lua_settable(JI)V
.end method

.method public native lua_settop(JI)V
.end method

.method public native lua_setupvalue(JII)Ljava/lang/String;
.end method

.method public native lua_status(J)I
.end method

.method public native lua_toboolean(JI)I
.end method

.method public native lua_tointeger(JI)J
.end method

.method public native lua_tonumber(JI)D
.end method

.method public native lua_topointer(JI)J
.end method

.method public native lua_tostring(JI)Ljava/lang/String;
.end method

.method public native lua_tothread(JI)J
.end method

.method public native lua_touserdata(JI)J
.end method

.method public native lua_type(JI)I
.end method

.method public native lua_typename(JI)Ljava/lang/String;
.end method

.method public native lua_xmove(JJI)V
.end method

.method public native lua_yield(JI)I
.end method
