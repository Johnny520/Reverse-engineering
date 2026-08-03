.class public final LFC;
.super LOz;
.source ""

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic e:I

.field public f:I


# direct methods
.method public synthetic constructor <init>(ILEb;)V
    .locals 0

    iput p1, p0, LFC;->e:I

    invoke-direct {p0, p2}, LOz;-><init>(LEb;)V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, LFC;->e:I

    check-cast p1, Lfc;

    check-cast p2, LEb;

    packed-switch v0, :pswitch_data_0

    new-instance p1, LFC;

    const/4 v0, 0x1

    invoke-direct {p1, v0, p2}, LFC;-><init>(ILEb;)V

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, LFC;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    new-instance p1, LFC;

    const/4 v0, 0x0

    invoke-direct {p1, v0, p2}, LFC;-><init>(ILEb;)V

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, LFC;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h(LEb;Ljava/lang/Object;)LEb;
    .locals 1

    iget p2, p0, LFC;->e:I

    packed-switch p2, :pswitch_data_0

    new-instance p2, LFC;

    const/4 v0, 0x1

    invoke-direct {p2, v0, p1}, LFC;-><init>(ILEb;)V

    return-object p2

    :pswitch_0
    new-instance p2, LFC;

    const/4 v0, 0x0

    invoke-direct {p2, v0, p1}, LFC;-><init>(ILEb;)V

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, LFC;->e:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, LFC;->f:I

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v1, :cond_0

    :try_start_0
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-wide v0, -0x2dfe2fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    :try_start_1
    sget-object p1, LIC;->a:LIC;

    iput v1, p0, LFC;->f:I

    invoke-static {p1, p0}, LIC;->a(LIC;LFb;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    sget-object v0, Lgc;->a:Lgc;

    if-ne p1, v0, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    :try_start_2
    check-cast p1, Ljava/util/List;

    sget-object v0, LEA;->a:LEA;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, LEA;->e:Ljava/util/ArrayList;

    invoke-static {}, LEA;->i()Ljava/util/ArrayList;

    move-result-object v1

    sget-object v2, LIC;->a:LIC;

    invoke-static {v2, p1, v0, v1}, LIC;->b(LIC;Ljava/util/List;Ljava/util/List;Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object v0

    sput-object v0, LIC;->b:Ljava/util/List;

    const-wide v3, -0x2df20fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const-wide v3, -0x2df34fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/List;->size()I

    const-wide v3, -0x2dfc0fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v2}, LIC;->c(LIC;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    :catch_0
    const-wide v0, -0x2dfc5fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x2dfd9fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, LIC;->b:Ljava/util/List;

    :goto_1
    return-object v0

    :pswitch_0
    iget v0, p0, LFC;->f:I

    const/4 v1, 0x1

    if-eqz v0, :cond_4

    if-ne v0, v1, :cond_3

    :try_start_3
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_2

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-wide v0, -0x2df6cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    :try_start_4
    sget-object p1, LIC;->a:LIC;

    iput v1, p0, LFC;->f:I

    invoke-static {p1, p0}, LIC;->a(LIC;LFb;)Ljava/lang/Object;

    move-result-object p1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    sget-object v0, Lgc;->a:Lgc;

    if-ne p1, v0, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    :try_start_5
    check-cast p1, Ljava/util/List;

    sget-object v0, LEA;->a:LEA;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, LEA;->e:Ljava/util/ArrayList;

    invoke-static {}, LEA;->i()Ljava/util/ArrayList;

    move-result-object v1

    sget-object v2, LIC;->a:LIC;

    invoke-static {v2, p1, v0, v1}, LIC;->b(LIC;Ljava/util/List;Ljava/util/List;Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object v0

    sput-object v0, LIC;->b:Ljava/util/List;

    const-wide v3, -0x2d0b1fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const-wide v3, -0x2df45fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/List;->size()I

    const-wide v3, -0x2df4afffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v2}, LIC;->c(LIC;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_3

    :catch_1
    const-wide v0, -0x2df4ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x2df63fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, LKf;->a:LKf;

    :goto_3
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
