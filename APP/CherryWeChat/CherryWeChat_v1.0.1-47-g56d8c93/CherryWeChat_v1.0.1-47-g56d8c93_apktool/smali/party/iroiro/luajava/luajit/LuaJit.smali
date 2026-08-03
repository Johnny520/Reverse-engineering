.class public Lparty/iroiro/luajava/luajit/LuaJit;
.super Lparty/iroiro/luajava/AbstractLua;
.source ""


# static fields
.field private static final natives:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lparty/iroiro/luajava/luajit/LuaJitNatives;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    sput-object v0, Lparty/iroiro/luajava/luajit/LuaJit;->natives:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, Lparty/iroiro/luajava/luajit/LuaJit;->getNatives()Lparty/iroiro/luajava/LuaNatives;

    move-result-object v0

    invoke-direct {p0, v0}, Lparty/iroiro/luajava/AbstractLua;-><init>(Lparty/iroiro/luajava/LuaNatives;)V

    return-void
.end method

.method public constructor <init>(JILparty/iroiro/luajava/AbstractLua;)V
    .locals 6

    .line 2
    invoke-virtual {p4}, Lparty/iroiro/luajava/AbstractLua;->getLuaNatives()Lparty/iroiro/luajava/LuaNatives;

    move-result-object v1

    move-object v0, p0

    move-wide v2, p1

    move v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lparty/iroiro/luajava/AbstractLua;-><init>(Lparty/iroiro/luajava/LuaNatives;JILparty/iroiro/luajava/AbstractLua;)V

    return-void
.end method

.method private static getNatives()Lparty/iroiro/luajava/LuaNatives;
    .locals 4

    sget-object v0, Lparty/iroiro/luajava/luajit/LuaJit;->natives:Ljava/util/concurrent/atomic/AtomicReference;

    monitor-enter v0

    :try_start_0
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    :try_start_1
    new-instance v1, Lparty/iroiro/luajava/luajit/LuaJitNatives;

    invoke-direct {v1}, Lparty/iroiro/luajava/luajit/LuaJitNatives;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :catch_0
    move-exception v1

    :try_start_2
    new-instance v2, Ljava/lang/LinkageError;

    const-string v3, "Unable to find natives or init"

    invoke-direct {v2, v3, v1}, Ljava/lang/LinkageError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lparty/iroiro/luajava/LuaNatives;

    monitor-exit v0

    return-object v1

    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method


# virtual methods
.method public convertError(I)Lparty/iroiro/luajava/LuaException$LuaError;
    .locals 2

    if-eqz p1, :cond_5

    const/4 v0, 0x1

    if-eq p1, v0, :cond_4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    const/4 v0, 0x5

    if-ne p1, v0, :cond_0

    sget-object p1, Lparty/iroiro/luajava/LuaException$LuaError;->HANDLER:Lparty/iroiro/luajava/LuaException$LuaError;

    return-object p1

    :cond_0
    new-instance p1, Lparty/iroiro/luajava/LuaException;

    sget-object v0, Lparty/iroiro/luajava/LuaException$LuaError;->RUNTIME:Lparty/iroiro/luajava/LuaException$LuaError;

    const-string v1, "Unrecognized error code"

    invoke-direct {p1, v0, v1}, Lparty/iroiro/luajava/LuaException;-><init>(Lparty/iroiro/luajava/LuaException$LuaError;Ljava/lang/String;)V

    throw p1

    :cond_1
    sget-object p1, Lparty/iroiro/luajava/LuaException$LuaError;->MEMORY:Lparty/iroiro/luajava/LuaException$LuaError;

    return-object p1

    :cond_2
    sget-object p1, Lparty/iroiro/luajava/LuaException$LuaError;->SYNTAX:Lparty/iroiro/luajava/LuaException$LuaError;

    return-object p1

    :cond_3
    sget-object p1, Lparty/iroiro/luajava/LuaException$LuaError;->RUNTIME:Lparty/iroiro/luajava/LuaException$LuaError;

    return-object p1

    :cond_4
    sget-object p1, Lparty/iroiro/luajava/LuaException$LuaError;->YIELD:Lparty/iroiro/luajava/LuaException$LuaError;

    return-object p1

    :cond_5
    sget-object p1, Lparty/iroiro/luajava/LuaException$LuaError;->OK:Lparty/iroiro/luajava/LuaException$LuaError;

    return-object p1
.end method

.method public convertType(I)Lparty/iroiro/luajava/Lua$LuaType;
    .locals 2

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lparty/iroiro/luajava/LuaException;

    sget-object v0, Lparty/iroiro/luajava/LuaException$LuaError;->RUNTIME:Lparty/iroiro/luajava/LuaException$LuaError;

    const-string v1, "Unrecognized type code"

    invoke-direct {p1, v0, v1}, Lparty/iroiro/luajava/LuaException;-><init>(Lparty/iroiro/luajava/LuaException$LuaError;Ljava/lang/String;)V

    throw p1

    :pswitch_0
    sget-object p1, Lparty/iroiro/luajava/Lua$LuaType;->THREAD:Lparty/iroiro/luajava/Lua$LuaType;

    return-object p1

    :pswitch_1
    sget-object p1, Lparty/iroiro/luajava/Lua$LuaType;->USERDATA:Lparty/iroiro/luajava/Lua$LuaType;

    return-object p1

    :pswitch_2
    sget-object p1, Lparty/iroiro/luajava/Lua$LuaType;->FUNCTION:Lparty/iroiro/luajava/Lua$LuaType;

    return-object p1

    :pswitch_3
    sget-object p1, Lparty/iroiro/luajava/Lua$LuaType;->TABLE:Lparty/iroiro/luajava/Lua$LuaType;

    return-object p1

    :pswitch_4
    sget-object p1, Lparty/iroiro/luajava/Lua$LuaType;->STRING:Lparty/iroiro/luajava/Lua$LuaType;

    return-object p1

    :pswitch_5
    sget-object p1, Lparty/iroiro/luajava/Lua$LuaType;->NUMBER:Lparty/iroiro/luajava/Lua$LuaType;

    return-object p1

    :pswitch_6
    sget-object p1, Lparty/iroiro/luajava/Lua$LuaType;->LIGHTUSERDATA:Lparty/iroiro/luajava/Lua$LuaType;

    return-object p1

    :pswitch_7
    sget-object p1, Lparty/iroiro/luajava/Lua$LuaType;->BOOLEAN:Lparty/iroiro/luajava/Lua$LuaType;

    return-object p1

    :pswitch_8
    sget-object p1, Lparty/iroiro/luajava/Lua$LuaType;->NIL:Lparty/iroiro/luajava/Lua$LuaType;

    return-object p1

    :pswitch_9
    sget-object p1, Lparty/iroiro/luajava/Lua$LuaType;->NONE:Lparty/iroiro/luajava/Lua$LuaType;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public newThread(JILparty/iroiro/luajava/AbstractLua;)Lparty/iroiro/luajava/AbstractLua;
    .locals 1

    new-instance v0, Lparty/iroiro/luajava/luajit/LuaJit;

    invoke-direct {v0, p1, p2, p3, p4}, Lparty/iroiro/luajava/luajit/LuaJit;-><init>(JILparty/iroiro/luajava/AbstractLua;)V

    return-object v0
.end method
