.class public final Llp;
.super LOz;
.source ""

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic e:I

.field public f:I

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;LEb;I)V
    .locals 0

    iput p4, p0, Llp;->e:I

    iput-object p1, p0, Llp;->g:Ljava/lang/String;

    iput-object p2, p0, Llp;->h:Ljava/lang/String;

    invoke-direct {p0, p3}, LOz;-><init>(LEb;)V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Llp;->e:I

    check-cast p1, Lfc;

    check-cast p2, LEb;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p2, p1}, Llp;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, Llp;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, Llp;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p2, p1}, Llp;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, Llp;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, Llp;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p2, p1}, Llp;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, Llp;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, Llp;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final h(LEb;Ljava/lang/Object;)LEb;
    .locals 3

    iget p2, p0, Llp;->e:I

    packed-switch p2, :pswitch_data_0

    new-instance p2, Llp;

    iget-object v0, p0, Llp;->h:Ljava/lang/String;

    const/4 v1, 0x2

    iget-object v2, p0, Llp;->g:Ljava/lang/String;

    invoke-direct {p2, v2, v0, p1, v1}, Llp;-><init>(Ljava/lang/String;Ljava/lang/String;LEb;I)V

    return-object p2

    :pswitch_0
    new-instance p2, Llp;

    iget-object v0, p0, Llp;->h:Ljava/lang/String;

    const/4 v1, 0x1

    iget-object v2, p0, Llp;->g:Ljava/lang/String;

    invoke-direct {p2, v2, v0, p1, v1}, Llp;-><init>(Ljava/lang/String;Ljava/lang/String;LEb;I)V

    return-object p2

    :pswitch_1
    new-instance p2, Llp;

    iget-object v0, p0, Llp;->h:Ljava/lang/String;

    const/4 v1, 0x0

    iget-object v2, p0, Llp;->g:Ljava/lang/String;

    invoke-direct {p2, v2, v0, p1, v1}, Llp;-><init>(Ljava/lang/String;Ljava/lang/String;LEb;I)V

    return-object p2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Llp;->e:I

    sget-object v1, LTC;->a:LTC;

    iget-object v2, p0, Llp;->h:Ljava/lang/String;

    iget-object v3, p0, Llp;->g:Ljava/lang/String;

    sget-object v4, Lgc;->a:Lgc;

    const/4 v5, 0x1

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Llp;->f:I

    if-eqz v0, :cond_1

    if-ne v0, v5, :cond_0

    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-wide v0, -0x9fc4fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    sget-object p1, Lms;->a:LPg;

    iput v5, p0, Llp;->f:I

    invoke-static {p1, v3, p0}, LPg;->d(LPg;Ljava/lang/String;LOz;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v4, :cond_2

    move-object v1, v4

    goto :goto_1

    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-wide v3, -0x9f06fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const-wide v4, -0x9f1cfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-wide v3, -0x9f2bfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lms;->a:LPg;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v2}, LPg;->m(Landroid/os/Bundle;Ljava/lang/String;)V

    :goto_1
    return-object v1

    :pswitch_0
    iget v0, p0, Llp;->f:I

    if-eqz v0, :cond_5

    if-ne v0, v5, :cond_4

    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-wide v0, -0x9f56fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    sget-object p1, Lms;->a:LPg;

    iput v5, p0, Llp;->f:I

    invoke-static {p1, v3, p0}, LPg;->d(LPg;Ljava/lang/String;LOz;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v4, :cond_6

    move-object v1, v4

    goto :goto_3

    :cond_6
    :goto_2
    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_7

    goto :goto_3

    :cond_7
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-wide v4, -0x908bfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const-wide v5, -0x90a1fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-wide v4, -0x90affffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-wide v4, -0x9f46fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lms;->a:LPg;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v2}, LPg;->m(Landroid/os/Bundle;Ljava/lang/String;)V

    :goto_3
    return-object v1

    :pswitch_1
    iget v0, p0, Llp;->f:I

    if-eqz v0, :cond_9

    if-ne v0, v5, :cond_8

    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-wide v0, -0x4abbfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    sget-object p1, LNs;->a:LNs;

    invoke-static {}, Lgf;->L()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lgf;->I()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lgf;->K()Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Lgf;->J()Ljava/lang/String;

    move-result-object v7

    const-wide v8, -0x4ab4fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v8

    iput v5, p0, Llp;->f:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    const-wide v9, -0x16c27fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v5, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-wide v9, -0x16c30fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-wide v0, -0x16c3ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-wide v0, -0x16ccafffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v5, -0x16cd1fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-wide v0, -0x16cd9fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-wide v0, -0x16cdffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-wide v0, -0x16ce8fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-wide v0, -0x16ceefffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-wide v0, -0x16cf5fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    sget v1, LgG;->a:I

    sget-object v1, Lgf;->p:Landroid/app/Application;

    invoke-static {v1}, LfG;->Y(Landroid/app/Application;)Z

    move-result v1

    if-eqz v1, :cond_a

    const-wide v1, -0x16c80fffff835L

    :goto_4
    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    goto :goto_5

    :cond_a
    const-wide v1, -0x16c87fffff835L

    goto :goto_4

    :goto_5
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    const-wide v0, -0x16c90fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x16c9efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1, p0}, LNs;->f(Ljava/lang/String;Ljava/lang/String;LOz;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v4, :cond_b

    move-object p1, v4

    :cond_b
    :goto_6
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
