.class public final synthetic LF8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Z

.field public final synthetic d:Lparty/iroiro/luajava/Lua;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLparty/iroiro/luajava/Lua;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF8;->a:Ljava/lang/String;

    iput-object p2, p0, LF8;->b:Ljava/lang/String;

    iput-boolean p3, p0, LF8;->c:Z

    iput-object p4, p0, LF8;->d:Lparty/iroiro/luajava/Lua;

    iput p5, p0, LF8;->e:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, LF8;->d:Lparty/iroiro/luajava/Lua;

    iget v1, p0, LF8;->e:I

    iget-object v2, p0, LF8;->a:Ljava/lang/String;

    iget-object v3, p0, LF8;->b:Ljava/lang/String;

    iget-boolean v4, p0, LF8;->c:Z

    invoke-static {v2, v3, v4, v0, v1}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->j(Ljava/lang/String;Ljava/lang/String;ZLparty/iroiro/luajava/Lua;I)V

    return-void
.end method
