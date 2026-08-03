.class public final synthetic LHp;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LUi;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LRp;


# direct methods
.method public synthetic constructor <init>(LRp;I)V
    .locals 0

    iput p2, p0, LHp;->a:I

    iput-object p1, p0, LHp;->b:LRp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 8

    iget v0, p0, LHp;->a:I

    sget-object v1, LTC;->a:LTC;

    const/4 v2, 0x0

    iget-object v3, p0, LHp;->b:LRp;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Landroid/content/Intent;

    const-wide v4, -0x18a95fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-wide v4, -0x18ab9fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    const-wide v4, -0x1895afffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const-wide v4, -0x1895efffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const-wide v5, -0x1897efffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v6, -0x18909fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    iget-object v3, v3, LRp;->g:Landroid/app/Activity;

    if-nez v3, :cond_0

    const-wide v3, -0x18922fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    const/16 v3, 0x3e9

    invoke-virtual {v2, v0, v3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-object v1

    :pswitch_0
    iget-object v0, v3, LRp;->b:Landroid/widget/EditText;

    if-nez v0, :cond_1

    const-wide v4, -0x1883cfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-object v0, v2

    :cond_1
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    goto/16 :goto_2

    :cond_2
    invoke-static {v0}, Ltz;->T(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_3

    const-wide v4, -0x188c7fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, LRp;->a(Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    :try_start_0
    sget-object v4, Lio/github/cherrywechat/lua/LuaEngine;->INSTANCE:Lio/github/cherrywechat/lua/LuaEngine;

    invoke-virtual {v4}, Lio/github/cherrywechat/lua/LuaEngine;->isInitialized()Z

    move-result v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_4

    const-wide v4, -0x188d3fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, LRp;->a(Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    sget-object v4, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryGlobalAPI;

    iget-object v5, v3, LRp;->g:Landroid/app/Activity;

    if-nez v5, :cond_5

    const-wide v5, -0x188e4fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-object v5, v2

    :cond_5
    invoke-virtual {v4, v5}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->setCurrentActivity(Landroid/app/Activity;)V

    iget-object v5, v3, LRp;->g:Landroid/app/Activity;

    if-nez v5, :cond_6

    const-wide v5, -0x188f4fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-object v5, v2

    :cond_6
    invoke-virtual {v5}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v4, v5}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->setCurrentContext(Landroid/content/Context;)V

    new-instance v5, LIp;

    const/4 v6, 0x1

    invoke-direct {v5, v3, v6}, LIp;-><init>(LRp;I)V

    invoke-virtual {v4, v5}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->setPrintListener(Lfj;)V

    const-wide v4, -0x18884fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, LRp;->a(Ljava/lang/String;)V

    iget-object v4, v3, LRp;->p:LCb;

    sget-object v5, Lhe;->a:Lhd;

    sget-object v5, LVc;->b:LVc;

    new-instance v5, Lny;

    invoke-direct {v5, v0, v3, v2}, Lny;-><init>(Ljava/lang/String;LRp;LEb;)V

    const/4 v0, 0x2

    invoke-static {v4, v5, v0}, LNj;->G(Lfc;Lkotlin/jvm/functions/Function2;I)V

    :cond_7
    :goto_2
    return-object v1

    :pswitch_1
    iget-object v0, v3, LRp;->b:Landroid/widget/EditText;

    if-nez v0, :cond_8

    const-wide v4, -0x1b76bfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    goto :goto_3

    :cond_8
    move-object v2, v0

    :goto_3
    const-wide v4, -0x1b776fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, v3, LRp;->c:Landroid/widget/TextView;

    if-eqz v0, :cond_9

    const-wide v2, -0x188b2fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_9
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
