.class public final synthetic LNp;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lio/github/cherrywechat/lua/loader/LoadedScript;

.field public final synthetic c:LRp;


# direct methods
.method public synthetic constructor <init>(LRp;Lio/github/cherrywechat/lua/loader/LoadedScript;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, LNp;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNp;->c:LRp;

    iput-object p2, p0, LNp;->b:Lio/github/cherrywechat/lua/loader/LoadedScript;

    return-void
.end method

.method public synthetic constructor <init>(Lio/github/cherrywechat/lua/loader/LoadedScript;LRp;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, LNp;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNp;->b:Lio/github/cherrywechat/lua/loader/LoadedScript;

    iput-object p2, p0, LNp;->c:LRp;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    iget p1, p0, LNp;->a:I

    packed-switch p1, :pswitch_data_0

    sget-object p1, Lio/github/cherrywechat/lua/loader/ScriptManager;->INSTANCE:Lio/github/cherrywechat/lua/loader/ScriptManager;

    iget-object v0, p0, LNp;->b:Lio/github/cherrywechat/lua/loader/LoadedScript;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/loader/LoadedScript;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lio/github/cherrywechat/lua/loader/ScriptManager;->unloadScript(Ljava/lang/String;)Z

    iget-object p1, p0, LNp;->c:LRp;

    invoke-virtual {p1}, LRp;->g()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v2, -0x1b73afffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/loader/LoadedScript;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0xa

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, LRp;->a(Ljava/lang/String;)V

    return-void

    :pswitch_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v0, -0x1882bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LNp;->b:Lio/github/cherrywechat/lua/loader/LoadedScript;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/loader/LoadedScript;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v1, -0x18837fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, LNp;->c:LRp;

    invoke-virtual {v1, p1}, LRp;->a(Ljava/lang/String;)V

    sget-object p1, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryGlobalAPI;

    new-instance v2, LIp;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3}, LIp;-><init>(LRp;I)V

    invoke-virtual {p1, v2}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->setPrintListener(Lfj;)V

    sget-object p1, Lio/github/cherrywechat/lua/loader/ScriptManager;->INSTANCE:Lio/github/cherrywechat/lua/loader/ScriptManager;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/loader/LoadedScript;->getId()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lmk;

    const/4 v4, 0x2

    invoke-direct {v3, v4, v1, v0}, Lmk;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, v2, v3}, Lio/github/cherrywechat/lua/loader/ScriptManager;->executeScript(Ljava/lang/String;Lfj;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
