.class public final synthetic La/t4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/D7;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La/u4;

.field public final synthetic c:Ljava/lang/Class;


# direct methods
.method public synthetic constructor <init>(La/u4;Ljava/lang/Class;I)V
    .locals 0

    iput p3, p0, La/t4;->a:I

    iput-object p1, p0, La/t4;->b:La/u4;

    iput-object p2, p0, La/t4;->c:Ljava/lang/Class;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, La/t4;->c:Ljava/lang/Class;

    iget-object v1, p0, La/t4;->b:La/u4;

    const/4 v2, 0x0

    const-string v3, "chain"

    iget v4, p0, La/t4;->a:I

    check-cast p1, Lio/github/libxposed/api/XposedInterface$Chain;

    packed-switch v4, :pswitch_data_0

    invoke-static {p1, v3}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/u4;->g()Z

    move-result v1

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    move-object v1, v6

    goto/16 :goto_3

    :cond_1
    if-eqz v3, :cond_0

    if-nez v4, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {v3, v0}, La/u4;->f(Ljava/lang/Object;Ljava/lang/Class;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    instance-of v1, v4, Ljava/util/List;

    if-eqz v1, :cond_4

    check-cast v4, Ljava/util/List;

    goto :goto_1

    :cond_4
    move-object v4, v6

    :goto_1
    if-nez v4, :cond_5

    goto :goto_0

    :cond_5
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_0

    :cond_6
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v4, v2

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_7

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    invoke-static {v7}, La/u4;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_8

    sget-object v9, La/fh;->G:Ljava/util/concurrent/ExecutorService;

    invoke-static {v8}, La/fh$a;->a(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_8

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v7, "BEFORE-FILTER: masked item blocked (wxid="

    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, ")"

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v7, "msg"

    invoke-static {v4, v7}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "[ConvMemGuard] "

    invoke-virtual {v7, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, La/x1;->b([Ljava/lang/Object;)V

    move v4, v5

    goto :goto_2

    :cond_8
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_9
    if-eqz v4, :cond_0

    :goto_3
    if-eqz v1, :cond_a

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v3

    const-string v4, "getArgs(...)"

    invoke-static {v3, v4}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v5}, La/t3;->o0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v3

    filled-new-array {v1, v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-interface {p1, v3}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_4

    :cond_a
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v3

    :goto_4
    if-nez v1, :cond_13

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    if-eqz v1, :cond_13

    if-nez p1, :cond_b

    goto :goto_6

    :cond_b
    invoke-static {}, La/u4;->g()Z

    move-result v2

    if-nez v2, :cond_c

    goto :goto_6

    :cond_c
    invoke-static {v1, v0}, La/u4;->f(Ljava/lang/Object;Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_d

    goto :goto_6

    :cond_d
    instance-of v0, p1, Ljava/util/List;

    if-eqz v0, :cond_e

    move-object v6, p1

    check-cast v6, Ljava/util/List;

    :cond_e
    if-nez v6, :cond_f

    goto :goto_6

    :cond_f
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_10

    goto :goto_6

    :cond_10
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_11
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_11

    invoke-static {v0}, La/u4;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_12

    goto :goto_5

    :cond_12
    sget-object v4, La/fh;->G:Ljava/util/concurrent/ExecutorService;

    invoke-static {v2}, La/fh$a;->a(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_11

    invoke-static {v1, v0, v2}, La/u4;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_5

    :cond_13
    :goto_6
    return-object v3

    :pswitch_0
    invoke-static {p1, v3}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v4, :cond_19

    if-nez p1, :cond_14

    goto :goto_7

    :cond_14
    invoke-static {}, La/u4;->g()Z

    move-result v1

    if-nez v1, :cond_15

    goto :goto_7

    :cond_15
    invoke-static {v4, v0}, La/u4;->f(Ljava/lang/Object;Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_16

    goto :goto_7

    :cond_16
    invoke-static {p1}, La/u4;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_17

    goto :goto_7

    :cond_17
    sget-object v1, La/fh;->G:Ljava/util/concurrent/ExecutorService;

    invoke-static {v0}, La/fh$a;->a(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_18

    goto :goto_7

    :cond_18
    invoke-static {v4, p1, v0}, La/u4;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    :cond_19
    :goto_7
    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
