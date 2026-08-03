.class public final Lio/github/cherrywechat/lua/api/HookAPI$doHook$callback$1;
.super Lde/robv/android/xposed/XC_MethodHook;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/github/cherrywechat/lua/api/HookAPI;->doHook(Lparty/iroiro/luajava/Lua;IZ)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $afterRef:I

.field final synthetic $beforeRef:I

.field final synthetic $hasAfterCallback:Z

.field final synthetic $hasBeforeCallback:Z

.field final synthetic $hasReplaceCallback:Z

.field final synthetic $isReplace:Z

.field final synthetic $lua:Lparty/iroiro/luajava/Lua;

.field final synthetic $replaceRef:I


# direct methods
.method public constructor <init>(ZZLparty/iroiro/luajava/Lua;ZIIZI)V
    .locals 0

    iput-boolean p1, p0, Lio/github/cherrywechat/lua/api/HookAPI$doHook$callback$1;->$isReplace:Z

    iput-boolean p2, p0, Lio/github/cherrywechat/lua/api/HookAPI$doHook$callback$1;->$hasReplaceCallback:Z

    iput-object p3, p0, Lio/github/cherrywechat/lua/api/HookAPI$doHook$callback$1;->$lua:Lparty/iroiro/luajava/Lua;

    iput-boolean p4, p0, Lio/github/cherrywechat/lua/api/HookAPI$doHook$callback$1;->$hasBeforeCallback:Z

    iput p5, p0, Lio/github/cherrywechat/lua/api/HookAPI$doHook$callback$1;->$replaceRef:I

    iput p6, p0, Lio/github/cherrywechat/lua/api/HookAPI$doHook$callback$1;->$beforeRef:I

    iput-boolean p7, p0, Lio/github/cherrywechat/lua/api/HookAPI$doHook$callback$1;->$hasAfterCallback:Z

    iput p8, p0, Lio/github/cherrywechat/lua/api/HookAPI$doHook$callback$1;->$afterRef:I

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method public static synthetic a(Lparty/iroiro/luajava/Lua;ILde/robv/android/xposed/XC_MethodHook$MethodHookParam;)LTC;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/github/cherrywechat/lua/api/HookAPI$doHook$callback$1;->beforeHookedMethod$lambda$0(Lparty/iroiro/luajava/Lua;ILde/robv/android/xposed/XC_MethodHook$MethodHookParam;)LTC;

    move-result-object p0

    return-object p0
.end method

.method private static final afterHookedMethod$lambda$2(Lparty/iroiro/luajava/Lua;ILde/robv/android/xposed/XC_MethodHook$MethodHookParam;)LTC;
    .locals 5

    const/4 v0, 0x0

    :try_start_0
    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    sget-object p1, Lio/github/cherrywechat/lua/api/HookAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/HookAPI;

    invoke-static {p1, p0, p2}, Lio/github/cherrywechat/lua/api/HookAPI;->access$pushMethodParam(Lio/github/cherrywechat/lua/api/HookAPI;Lparty/iroiro/luajava/Lua;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    const/4 p1, 0x1

    invoke-interface {p0, p1, v0}, Lparty/iroiro/luajava/Lua;->pCall(II)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-wide v1, -0x101d2fffff835L

    const-wide v3, -0x101ddfffff835L

    invoke-static {v1, v2, v3, v4, p1}, LEy;->i(JJLjava/lang/Exception;)V

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->setTop(I)V

    :goto_0
    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method public static synthetic b(Lparty/iroiro/luajava/Lua;ILde/robv/android/xposed/XC_MethodHook$MethodHookParam;)LTC;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/github/cherrywechat/lua/api/HookAPI$doHook$callback$1;->beforeHookedMethod$lambda$1(Lparty/iroiro/luajava/Lua;ILde/robv/android/xposed/XC_MethodHook$MethodHookParam;)LTC;

    move-result-object p0

    return-object p0
.end method

.method private static final beforeHookedMethod$lambda$0(Lparty/iroiro/luajava/Lua;ILde/robv/android/xposed/XC_MethodHook$MethodHookParam;)LTC;
    .locals 4

    :try_start_0
    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    sget-object p1, Lio/github/cherrywechat/lua/api/HookAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/HookAPI;

    invoke-static {p1, p0, p2}, Lio/github/cherrywechat/lua/api/HookAPI;->access$pushMethodParam(Lio/github/cherrywechat/lua/api/HookAPI;Lparty/iroiro/luajava/Lua;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    const/4 p1, 0x1

    invoke-interface {p0, p1, p1}, Lparty/iroiro/luajava/Lua;->pCall(II)V

    const/4 v0, -0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->pop(I)V

    invoke-virtual {p2, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-wide v0, -0x1010bfffff835L

    const-wide v2, -0x10116fffff835L

    invoke-static {v0, v1, v2, v3, p1}, LEy;->i(JJLjava/lang/Exception;)V

    const/4 p1, 0x0

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->setTop(I)V

    :goto_0
    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final beforeHookedMethod$lambda$1(Lparty/iroiro/luajava/Lua;ILde/robv/android/xposed/XC_MethodHook$MethodHookParam;)LTC;
    .locals 5

    const/4 v0, 0x0

    :try_start_0
    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    sget-object p1, Lio/github/cherrywechat/lua/api/HookAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/HookAPI;

    invoke-static {p1, p0, p2}, Lio/github/cherrywechat/lua/api/HookAPI;->access$pushMethodParam(Lio/github/cherrywechat/lua/api/HookAPI;Lparty/iroiro/luajava/Lua;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    const/4 p1, 0x1

    invoke-interface {p0, p1, v0}, Lparty/iroiro/luajava/Lua;->pCall(II)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-wide v1, -0x1012ffffff835L

    const-wide v3, -0x1013afffff835L

    invoke-static {v1, v2, v3, v4, p1}, LEy;->i(JJLjava/lang/Exception;)V

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->setTop(I)V

    :goto_0
    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method public static synthetic c(Lparty/iroiro/luajava/Lua;ILde/robv/android/xposed/XC_MethodHook$MethodHookParam;)LTC;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/github/cherrywechat/lua/api/HookAPI$doHook$callback$1;->afterHookedMethod$lambda$2(Lparty/iroiro/luajava/Lua;ILde/robv/android/xposed/XC_MethodHook$MethodHookParam;)LTC;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 5

    const-wide v0, -0x10105fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-boolean v0, p0, Lio/github/cherrywechat/lua/api/HookAPI$doHook$callback$1;->$isReplace:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lio/github/cherrywechat/lua/api/HookAPI$doHook$callback$1;->$hasAfterCallback:Z

    if-eqz v0, :cond_1

    sget-object v0, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    iget-object v1, p0, Lio/github/cherrywechat/lua/api/HookAPI$doHook$callback$1;->$lua:Lparty/iroiro/luajava/Lua;

    iget v2, p0, Lio/github/cherrywechat/lua/api/HookAPI$doHook$callback$1;->$afterRef:I

    new-instance v3, Lf9;

    const/4 v4, 0x6

    invoke-direct {v3, v1, v2, p1, v4}, Lf9;-><init>(Lparty/iroiro/luajava/Lua;ILde/robv/android/xposed/XC_MethodHook$MethodHookParam;I)V

    invoke-virtual {v0, v1, v3}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    :cond_1
    :goto_0
    return-void
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 5

    const-wide v0, -0x1017ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-boolean v0, p0, Lio/github/cherrywechat/lua/api/HookAPI$doHook$callback$1;->$isReplace:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lio/github/cherrywechat/lua/api/HookAPI$doHook$callback$1;->$hasReplaceCallback:Z

    if-eqz v0, :cond_0

    sget-object v0, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    iget-object v1, p0, Lio/github/cherrywechat/lua/api/HookAPI$doHook$callback$1;->$lua:Lparty/iroiro/luajava/Lua;

    iget v2, p0, Lio/github/cherrywechat/lua/api/HookAPI$doHook$callback$1;->$replaceRef:I

    new-instance v3, Lf9;

    const/4 v4, 0x4

    invoke-direct {v3, v1, v2, p1, v4}, Lf9;-><init>(Lparty/iroiro/luajava/Lua;ILde/robv/android/xposed/XC_MethodHook$MethodHookParam;I)V

    invoke-virtual {v0, v1, v3}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    return-void

    :cond_0
    iget-boolean v0, p0, Lio/github/cherrywechat/lua/api/HookAPI$doHook$callback$1;->$hasBeforeCallback:Z

    if-eqz v0, :cond_1

    sget-object v0, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    iget-object v1, p0, Lio/github/cherrywechat/lua/api/HookAPI$doHook$callback$1;->$lua:Lparty/iroiro/luajava/Lua;

    iget v2, p0, Lio/github/cherrywechat/lua/api/HookAPI$doHook$callback$1;->$beforeRef:I

    new-instance v3, Lf9;

    const/4 v4, 0x5

    invoke-direct {v3, v1, v2, p1, v4}, Lf9;-><init>(Lparty/iroiro/luajava/Lua;ILde/robv/android/xposed/XC_MethodHook$MethodHookParam;I)V

    invoke-virtual {v0, v1, v3}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    :cond_1
    return-void
.end method
