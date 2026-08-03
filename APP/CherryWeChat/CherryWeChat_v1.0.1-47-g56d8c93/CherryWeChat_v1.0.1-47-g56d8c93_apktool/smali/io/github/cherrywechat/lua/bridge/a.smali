.class public final synthetic Lio/github/cherrywechat/lua/bridge/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LUi;


# instance fields
.field public final synthetic a:Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaInvocationHandler;

.field public final synthetic b:[Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Class;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaInvocationHandler;[Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/github/cherrywechat/lua/bridge/a;->a:Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaInvocationHandler;

    iput-object p2, p0, Lio/github/cherrywechat/lua/bridge/a;->b:[Ljava/lang/Object;

    iput-object p3, p0, Lio/github/cherrywechat/lua/bridge/a;->c:Ljava/lang/Class;

    iput-object p4, p0, Lio/github/cherrywechat/lua/bridge/a;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lio/github/cherrywechat/lua/bridge/a;->c:Ljava/lang/Class;

    iget-object v1, p0, Lio/github/cherrywechat/lua/bridge/a;->d:Ljava/lang/String;

    iget-object v2, p0, Lio/github/cherrywechat/lua/bridge/a;->a:Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaInvocationHandler;

    iget-object v3, p0, Lio/github/cherrywechat/lua/bridge/a;->b:[Ljava/lang/Object;

    invoke-static {v2, v3, v0, v1}, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaInvocationHandler;->a(Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaInvocationHandler;[Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
