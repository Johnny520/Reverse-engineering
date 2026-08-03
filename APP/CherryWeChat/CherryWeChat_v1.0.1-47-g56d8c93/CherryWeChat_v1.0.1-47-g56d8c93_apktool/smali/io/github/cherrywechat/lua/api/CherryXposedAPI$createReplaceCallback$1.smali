.class public final Lio/github/cherrywechat/lua/api/CherryXposedAPI$createReplaceCallback$1;
.super Lde/robv/android/xposed/XC_MethodReplacement;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/github/cherrywechat/lua/api/CherryXposedAPI;->createReplaceCallback(Lparty/iroiro/luajava/Lua;I)Lde/robv/android/xposed/XC_MethodReplacement;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $lua:Lparty/iroiro/luajava/Lua;

.field final synthetic $replaceRef:I


# direct methods
.method public constructor <init>(Lparty/iroiro/luajava/Lua;I)V
    .locals 0

    iput-object p1, p0, Lio/github/cherrywechat/lua/api/CherryXposedAPI$createReplaceCallback$1;->$lua:Lparty/iroiro/luajava/Lua;

    iput p2, p0, Lio/github/cherrywechat/lua/api/CherryXposedAPI$createReplaceCallback$1;->$replaceRef:I

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodReplacement;-><init>()V

    return-void
.end method

.method public static synthetic a(Lparty/iroiro/luajava/Lua;ILde/robv/android/xposed/XC_MethodHook$MethodHookParam;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/github/cherrywechat/lua/api/CherryXposedAPI$createReplaceCallback$1;->replaceHookedMethod$lambda$0(Lparty/iroiro/luajava/Lua;ILde/robv/android/xposed/XC_MethodHook$MethodHookParam;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final replaceHookedMethod$lambda$0(Lparty/iroiro/luajava/Lua;ILde/robv/android/xposed/XC_MethodHook$MethodHookParam;)Ljava/lang/Object;
    .locals 0

    :try_start_0
    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    sget-object p1, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryXposedAPI;

    invoke-static {p1, p0, p2}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->access$pushMethodParam(Lio/github/cherrywechat/lua/api/CherryXposedAPI;Lparty/iroiro/luajava/Lua;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    const/4 p1, 0x1

    invoke-interface {p0, p1, p1}, Lparty/iroiro/luajava/Lua;->pCall(II)V

    const/4 p2, -0x1

    invoke-interface {p0, p2}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->pop(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    const-wide p1, -0x11c23fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    const-wide p1, -0x11c33fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    const/4 p1, 0x0

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->setTop(I)V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public replaceHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)Ljava/lang/Object;
    .locals 5

    const-wide v0, -0x11c1dfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    iget-object v1, p0, Lio/github/cherrywechat/lua/api/CherryXposedAPI$createReplaceCallback$1;->$lua:Lparty/iroiro/luajava/Lua;

    iget v2, p0, Lio/github/cherrywechat/lua/api/CherryXposedAPI$createReplaceCallback$1;->$replaceRef:I

    new-instance v3, Lf9;

    const/4 v4, 0x3

    invoke-direct {v3, v1, v2, p1, v4}, Lf9;-><init>(Lparty/iroiro/luajava/Lua;ILde/robv/android/xposed/XC_MethodHook$MethodHookParam;I)V

    invoke-virtual {v0, v1, v3}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
