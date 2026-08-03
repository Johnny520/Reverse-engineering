.class public final synthetic Lio/github/cherrywechat/lua/bridge/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LUi;


# instance fields
.field public final synthetic a:Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaSingleMethodHandler;

.field public final synthetic b:[Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/reflect/Method;


# direct methods
.method public synthetic constructor <init>(Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaSingleMethodHandler;[Ljava/lang/Object;Ljava/lang/reflect/Method;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/github/cherrywechat/lua/bridge/b;->a:Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaSingleMethodHandler;

    iput-object p2, p0, Lio/github/cherrywechat/lua/bridge/b;->b:[Ljava/lang/Object;

    iput-object p3, p0, Lio/github/cherrywechat/lua/bridge/b;->c:Ljava/lang/reflect/Method;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lio/github/cherrywechat/lua/bridge/b;->b:[Ljava/lang/Object;

    iget-object v1, p0, Lio/github/cherrywechat/lua/bridge/b;->c:Ljava/lang/reflect/Method;

    iget-object v2, p0, Lio/github/cherrywechat/lua/bridge/b;->a:Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaSingleMethodHandler;

    invoke-static {v2, v0, v1}, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaSingleMethodHandler;->a(Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaSingleMethodHandler;[Ljava/lang/Object;Ljava/lang/reflect/Method;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
