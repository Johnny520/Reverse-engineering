.class public final synthetic La/j8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La/m8;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/util/Set;


# direct methods
.method public synthetic constructor <init>(La/m8;Ljava/lang/Object;Ljava/util/Set;I)V
    .locals 0

    iput p4, p0, La/j8;->a:I

    iput-object p1, p0, La/j8;->b:La/m8;

    iput-object p2, p0, La/j8;->c:Ljava/lang/Object;

    iput-object p3, p0, La/j8;->d:Ljava/util/Set;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    iget-object v0, p0, La/j8;->d:Ljava/util/Set;

    iget-object v1, p0, La/j8;->c:Ljava/lang/Object;

    iget-object v2, p0, La/j8;->b:La/m8;

    iget v3, p0, La/j8;->a:I

    packed-switch v3, :pswitch_data_0

    :try_start_0
    const-string v3, "d"

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v3}, La/m8;->i(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, La/Kf;->b(Ljava/lang/Object;)Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    check-cast v3, Ljava/util/List;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_0
    move-object v3, v5

    :goto_0
    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v3}, La/m8;->e(Ljava/util/List;)I

    move-result v4

    invoke-virtual {v2, v3, v0}, La/m8;->f(Ljava/util/List;Ljava/util/Set;)V

    invoke-static {v3}, La/m8;->e(Ljava/util/List;)I

    move-result v0

    if-eq v4, v0, :cond_4

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {v1}, La/m8;->g(Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    const/4 v2, 0x1

    :try_start_1
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v0, v1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    :cond_4
    :goto_1
    :try_start_2
    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    :goto_2
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_3
    return-void

    :pswitch_0
    :try_start_3
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, La/m8;->h(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    if-nez v3, :cond_5

    goto :goto_5

    :cond_5
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_6
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v2, v6, v0}, La/m8;->v(Ljava/lang/Object;Ljava/util/Set;)Z

    move-result v7

    if-nez v7, :cond_6

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :catchall_2
    move-exception v0

    goto :goto_6

    :cond_7
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v2

    if-eq v0, v2, :cond_8

    invoke-static {v1, v4}, La/m8;->t(Ljava/lang/Object;Ljava/util/ArrayList;)V

    invoke-static {v1}, La/m8;->p(Ljava/lang/Object;)V

    :cond_8
    :goto_5
    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_7

    :goto_6
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_7
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
