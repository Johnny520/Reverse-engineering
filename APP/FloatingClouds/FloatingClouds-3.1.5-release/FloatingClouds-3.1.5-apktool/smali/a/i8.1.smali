.class public final synthetic La/i8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/D7;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La/m8;


# direct methods
.method public synthetic constructor <init>(La/m8;I)V
    .locals 0

    iput p2, p0, La/i8;->a:I

    iput-object p1, p0, La/i8;->b:La/m8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    const/4 v0, 0x1

    const-string v1, "getArgs(...)"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v4, "chain"

    iget v5, p0, La/i8;->a:I

    packed-switch v5, :pswitch_data_0

    check-cast p1, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {p1, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "HideOwnSns: N intercept: profile "

    const-string v5, "HideOwnSns: N intercept: SELF profile ("

    iget-object v6, p0, La/i8;->b:La/m8;

    invoke-static {}, La/m8;->m()Z

    move-result v7

    if-nez v7, :cond_0

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_4

    :cond_0
    invoke-static {}, La/m8;->k()Ljava/util/Set;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Set;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_4

    :cond_1
    :try_start_0
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v7

    invoke-static {v7, v1}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7, v3}, La/t3;->o0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/Kf;->b(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    move-object v2, v1

    check-cast v2, Ljava/util/List;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto/16 :goto_2

    :cond_2
    :goto_0
    if-nez v2, :cond_3

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_4

    :cond_3
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object v1

    iget-object v3, v6, La/m8;->g:Ljava/util/Map;

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_6

    invoke-static {v1}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {v6}, La/m8;->j()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/List;->clear()V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ") has hidden moments -> blank 4 previews"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->b([Ljava/lang/Object;)V

    goto :goto_3

    :cond_5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " != self, native preview kept"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->b([Ljava/lang/Object;)V

    goto :goto_3

    :cond_6
    :goto_1
    const-string v1, "HideOwnSns: N intercept: username not captured, skip (native)"

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->e([Ljava/lang/Object;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :goto_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "HideOwnSns: N intercept error: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->a([Ljava/lang/Object;)V

    :goto_3
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    :goto_4
    return-object p1

    :pswitch_0
    iget-object v0, p0, La/i8;->b:La/m8;

    check-cast p1, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {p1, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_1
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v4

    invoke-static {v4, v1}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v3}, La/t3;->o0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Ljava/lang/String;

    if-eqz v3, :cond_7

    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    goto :goto_5

    :catchall_1
    move-exception v0

    goto :goto_7

    :cond_7
    :goto_5
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object v1

    if-eqz v2, :cond_9

    invoke-static {v2}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_8

    goto :goto_6

    :cond_8
    if-eqz v1, :cond_9

    iget-object v0, v0, La/m8;->g:Ljava/util/Map;

    const-string v3, "prefUserNames"

    invoke-static {v0, v3}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    :goto_6
    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_8

    :goto_7
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_8
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, La/i8;->b:La/m8;

    check-cast p1, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {p1, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v4

    invoke-static {v4, v1}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v3}, La/t3;->o0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    goto :goto_9

    :cond_a
    const-string p1, ""

    :goto_9
    iget-object v3, v0, La/m8;->b:Ljava/lang/String;

    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    iput-object v1, v0, La/m8;->d:Ljava/lang/Object;

    invoke-virtual {v0}, La/m8;->r()V

    goto :goto_a

    :cond_b
    const-string v3, "com.tencent.mm.plugin.sns.ui.improve.component.h2"

    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_f

    if-nez v1, :cond_c

    goto :goto_a

    :cond_c
    invoke-static {v1}, La/m8;->h(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_d

    goto :goto_a

    :cond_d
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_e
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_10

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_e

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    iget-object v3, v0, La/m8;->c:Ljava/lang/String;

    invoke-virtual {p1, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_f

    iget-object v3, v0, La/m8;->c:Ljava/lang/String;

    const-string v4, "$"

    const-string v5, "."

    invoke-static {v3, v5, v4}, La/Ae;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_10

    :cond_f
    iput-object v1, v0, La/m8;->e:Ljava/lang/Object;

    invoke-virtual {v0}, La/m8;->s()V

    :cond_10
    :goto_a
    return-object v2

    :pswitch_2
    iget-object v1, p0, La/i8;->b:La/m8;

    check-cast p1, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {p1, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v2

    invoke-static {}, La/m8;->m()Z

    move-result v4

    if-eqz v4, :cond_14

    iget-boolean v4, v1, La/m8;->f:Z

    if-nez v4, :cond_14

    invoke-static {}, La/m8;->k()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_14

    iput-boolean v0, v1, La/m8;->f:Z

    :try_start_2
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La/m8;->h(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_13

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_11
    :goto_b
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_12

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v1, v8, v4}, La/m8;->v(Ljava/lang/Object;Ljava/util/Set;)Z

    move-result v9

    if-nez v9, :cond_11

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_12
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v7

    if-eq v4, v7, :cond_13

    invoke-static {p1, v6}, La/m8;->t(Ljava/lang/Object;Ljava/util/ArrayList;)V

    invoke-static {p1}, La/m8;->p(Ljava/lang/Object;)V

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result p1

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v4

    sub-int/2addr p1, v4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "HideOwnSns: timeline hide removed="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La/x1;->b([Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :catchall_2
    :cond_13
    iput-boolean v3, v1, La/m8;->f:Z

    :cond_14
    return-object v2

    :pswitch_3
    iget-object v0, p0, La/i8;->b:La/m8;

    check-cast p1, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {p1, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    :try_start_3
    invoke-virtual {v0, p1}, La/m8;->l(Lio/github/libxposed/api/XposedInterface$Chain;)V

    sget-object p1, La/Wf;->a:La/Wf;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_c

    :catchall_3
    move-exception p1

    invoke-static {p1}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_c
    return-object v2

    :pswitch_4
    iget-object v0, p0, La/i8;->b:La/m8;

    check-cast p1, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {p1, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, La/m8;->m()Z

    move-result v4

    if-eqz v4, :cond_17

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v4

    invoke-static {v4, v1}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v3}, La/t3;->o0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/Kf;->b(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_15

    move-object v2, v1

    check-cast v2, Ljava/util/List;

    :cond_15
    invoke-static {}, La/m8;->k()Ljava/util/Set;

    move-result-object v1

    if-eqz v2, :cond_17

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_17

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v0, La/m8;->h:Ljava/lang/Object;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v3, v0, La/m8;->i:Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_16
    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_17

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3, v1}, La/m8;->v(Ljava/lang/Object;Ljava/util/Set;)Z

    move-result v3

    if-eqz v3, :cond_16

    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_d

    :cond_17
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {p1, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La/i8;->b:La/m8;

    invoke-static {}, La/m8;->m()Z

    move-result v4

    if-eqz v4, :cond_19

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v4

    invoke-static {v4, v1}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v3}, La/t3;->o0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/Kf;->b(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_18

    move-object v2, v1

    check-cast v2, Ljava/util/List;

    :cond_18
    invoke-static {}, La/m8;->k()Ljava/util/Set;

    move-result-object v1

    if-eqz v2, :cond_19

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_19

    invoke-virtual {v0, v2, v1}, La/m8;->f(Ljava/util/List;Ljava/util/Set;)V

    :cond_19
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
