.class public final L۟/s1$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L۟/s1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final ۥ:L۟/s1;


# direct methods
.method public constructor <init>(Landroid/os/Looper;L۟/s1;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p2, p0, L۟/s1$a;->ۥ:L۟/s1;

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 11

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x2

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    sget-object v0, L۟/z7;->ۥ۠:L۟/z7$a;

    new-instance v1, L۟/s1$a$a;

    invoke-direct {v1, p1}, L۟/s1$a$a;-><init>(Landroid/os/Message;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto/16 :goto_16

    :pswitch_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    iget-object v0, p0, L۟/s1$a;->ۥ:L۟/s1;

    .line 1
    iget-object v1, v0, L۟/s1;->ۥۣ۟:Ljava/util/HashSet;

    .line 2
    invoke-virtual {v1, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_16

    :cond_0
    iget-object v1, v0, L۟/s1;->ۥ۟ۢ:Ljava/util/WeakHashMap;

    invoke-virtual {v1}, Ljava/util/WeakHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, L۟/f;

    .line 3
    iget-object v4, v2, L۟/f;->ۥ۟ۦ:Ljava/lang/Object;

    .line 4
    invoke-virtual {v4, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    if-nez v3, :cond_2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    :cond_2
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_3
    if-eqz v3, :cond_2d

    iget-object p1, v0, L۟/s1;->ۥ۟ۥ:Landroid/os/Handler;

    const/16 v0, 0xd

    invoke-virtual {p1, v0, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto/16 :goto_16

    .line 5
    :pswitch_2
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    iget-object v0, p0, L۟/s1$a;->ۥ:L۟/s1;

    .line 6
    iget-object v3, v0, L۟/s1;->ۥۣ۟:Ljava/util/HashSet;

    .line 7
    invoke-virtual {v3, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    goto/16 :goto_16

    :cond_4
    iget-object v3, v0, L۟/s1;->ۥ۟۠:Ljava/util/LinkedHashMap;

    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_5
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, L۟/c0;

    .line 8
    iget-object v5, v4, L۟/c0;->ۥ۟:L۟/z7;

    .line 9
    iget-boolean v5, v5, L۟/z7;->ۥ۟ۨ:Z

    .line 10
    iget-object v6, v4, L۟/c0;->ۥ۟ۧ:L۟/f;

    .line 11
    iget-object v7, v4, L۟/c0;->ۥ۟ۨ:Ljava/util/ArrayList;

    if-eqz v7, :cond_6

    .line 12
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_6

    move v8, v1

    goto :goto_2

    :cond_6
    move v8, v2

    :goto_2
    if-nez v6, :cond_7

    if-nez v8, :cond_7

    goto :goto_1

    :cond_7
    if-eqz v6, :cond_8

    .line 13
    iget-object v9, v6, L۟/f;->ۥ۟ۦ:Ljava/lang/Object;

    .line 14
    invoke-virtual {v9, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-virtual {v4, v6}, L۟/c0;->ۥ۟۠(L۟/f;)V

    iget-object v9, v0, L۟/s1;->ۥ۟ۢ:Ljava/util/WeakHashMap;

    invoke-virtual {v6}, L۟/f;->ۥ۟۠()Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v9, v10, v6}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v5, :cond_8

    iget-object v6, v6, L۟/f;->ۥ۟:L۟/w8;

    invoke-virtual {v6}, L۟/w8;->ۥ۟()Ljava/lang/String;

    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    sget-object v6, L۟/ic;->ۥ:Ljava/lang/StringBuilder;

    :cond_8
    if-eqz v8, :cond_b

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v6

    sub-int/2addr v6, v1

    :goto_3
    if-ltz v6, :cond_b

    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, L۟/f;

    .line 15
    iget-object v9, v8, L۟/f;->ۥ۟ۦ:Ljava/lang/Object;

    .line 16
    invoke-virtual {v9, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_9

    goto :goto_4

    :cond_9
    invoke-virtual {v4, v8}, L۟/c0;->ۥ۟۠(L۟/f;)V

    iget-object v9, v0, L۟/s1;->ۥ۟ۢ:Ljava/util/WeakHashMap;

    invoke-virtual {v8}, L۟/f;->ۥ۟۠()Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v9, v10, v8}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v5, :cond_a

    iget-object v8, v8, L۟/f;->ۥ۟:L۟/w8;

    invoke-virtual {v8}, L۟/w8;->ۥ۟()Ljava/lang/String;

    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    sget-object v8, L۟/ic;->ۥ:Ljava/lang/StringBuilder;

    :cond_a
    :goto_4
    add-int/lit8 v6, v6, -0x1

    goto :goto_3

    :cond_b
    invoke-virtual {v4}, L۟/c0;->ۥ۟()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    if-eqz v5, :cond_5

    invoke-static {v4}, L۟/ic;->ۥ۟۟(L۟/c0;)Ljava/lang/String;

    goto/16 :goto_1

    .line 17
    :pswitch_3
    iget-object v0, p0, L۟/s1$a;->ۥ:L۟/s1;

    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto/16 :goto_16

    .line 19
    :pswitch_4
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Landroid/net/NetworkInfo;

    iget-object v0, p0, L۟/s1$a;->ۥ:L۟/s1;

    .line 20
    iget-object v3, v0, L۟/s1;->ۥ۟:Ljava/util/concurrent/ExecutorService;

    .line 21
    instance-of v5, v3, L۟/b8;

    if-eqz v5, :cond_11

    check-cast v3, L۟/b8;

    const/4 v5, 0x3

    if-eqz p1, :cond_10

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    invoke-virtual {p1}, Landroid/net/NetworkInfo;->isConnectedOrConnecting()Z

    move-result v6

    if-nez v6, :cond_c

    goto :goto_7

    :cond_c
    invoke-virtual {p1}, Landroid/net/NetworkInfo;->getType()I

    move-result v6

    if-eqz v6, :cond_e

    if-eq v6, v1, :cond_d

    const/4 v1, 0x6

    if-eq v6, v1, :cond_d

    const/16 v1, 0x9

    if-eq v6, v1, :cond_d

    goto :goto_5

    :cond_d
    const/4 v4, 0x4

    goto :goto_6

    :cond_e
    invoke-virtual {p1}, Landroid/net/NetworkInfo;->getSubtype()I

    move-result v6

    packed-switch v6, :pswitch_data_1

    const/16 v1, 0xc

    if-eq v6, v1, :cond_f

    goto :goto_5

    .line 23
    :pswitch_5
    invoke-virtual {v3, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->setCorePoolSize(I)V

    invoke-virtual {v3, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->setMaximumPoolSize(I)V

    goto :goto_8

    :goto_5
    move v4, v5

    :cond_f
    :goto_6
    :pswitch_6
    invoke-virtual {v3, v4}, Ljava/util/concurrent/ThreadPoolExecutor;->setCorePoolSize(I)V

    invoke-virtual {v3, v4}, Ljava/util/concurrent/ThreadPoolExecutor;->setMaximumPoolSize(I)V

    goto :goto_8

    .line 24
    :cond_10
    :goto_7
    invoke-virtual {v3, v5}, Ljava/util/concurrent/ThreadPoolExecutor;->setCorePoolSize(I)V

    .line 25
    invoke-virtual {v3, v5}, Ljava/util/concurrent/ThreadPoolExecutor;->setMaximumPoolSize(I)V

    :cond_11
    :goto_8
    if-eqz p1, :cond_2d

    .line 26
    invoke-virtual {p1}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result p1

    if-eqz p1, :cond_2d

    .line 27
    iget-object p1, v0, L۟/s1;->ۥ۟ۡ:Ljava/util/WeakHashMap;

    invoke-virtual {p1}, Ljava/util/WeakHashMap;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_2d

    iget-object p1, v0, L۟/s1;->ۥ۟ۡ:Ljava/util/WeakHashMap;

    invoke-virtual {p1}, Ljava/util/WeakHashMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2d

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, L۟/f;

    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    .line 28
    iget-object v3, v1, L۟/f;->ۥ:L۟/z7;

    .line 29
    iget-boolean v3, v3, L۟/z7;->ۥ۟ۨ:Z

    if-eqz v3, :cond_12

    .line 30
    iget-object v3, v1, L۟/f;->ۥ۟:L۟/w8;

    .line 31
    invoke-virtual {v3}, L۟/w8;->ۥ۟()Ljava/lang/String;

    sget-object v3, L۟/ic;->ۥ:Ljava/lang/StringBuilder;

    :cond_12
    invoke-virtual {v0, v1, v2}, L۟/s1;->ۥۣ۟(L۟/f;Z)V

    goto :goto_9

    .line 32
    :pswitch_7
    iget-object p1, p0, L۟/s1$a;->ۥ:L۟/s1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p1, L۟/s1;->ۥ۟ۨ:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v1, p1, L۟/s1;->ۥ۟ۨ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object p1, p1, L۟/s1;->ۥ۟ۥ:Landroid/os/Handler;

    const/16 v1, 0x8

    invoke-virtual {p1, v1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 34
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_13

    goto/16 :goto_16

    :cond_13
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, L۟/c0;

    .line 35
    iget-object p1, p1, L۟/c0;->ۥ۟:L۟/z7;

    .line 36
    iget-boolean p1, p1, L۟/z7;->ۥ۟ۨ:Z

    if-eqz p1, :cond_2d

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_15

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, L۟/c0;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    if-lez v2, :cond_14

    const-string v2, ", "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_14
    invoke-static {v1}, L۟/ic;->ۥ۟۟(L۟/c0;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_a

    :cond_15
    sget-object p1, L۟/ic;->ۥ:Ljava/lang/StringBuilder;

    goto/16 :goto_16

    .line 37
    :pswitch_8
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, L۟/c0;

    iget-object v0, p0, L۟/s1$a;->ۥ:L۟/s1;

    invoke-virtual {v0, p1}, L۟/s1;->ۥ۟ۢ(L۟/c0;)V

    goto/16 :goto_16

    :pswitch_9
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, L۟/c0;

    iget-object v0, p0, L۟/s1$a;->ۥ:L۟/s1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    iget-object v4, p1, L۟/c0;->ۥ۠۟:Ljava/util/concurrent/Future;

    if-eqz v4, :cond_16

    .line 39
    invoke-interface {v4}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v4

    if-eqz v4, :cond_16

    move v4, v1

    goto :goto_b

    :cond_16
    move v4, v2

    :goto_b
    if-eqz v4, :cond_17

    goto/16 :goto_16

    .line 40
    :cond_17
    iget-object v4, v0, L۟/s1;->ۥ۟:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v4}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v4

    if-eqz v4, :cond_18

    invoke-virtual {v0, p1}, L۟/s1;->ۥ۟ۢ(L۟/c0;)V

    goto/16 :goto_16

    :cond_18
    iget-boolean v4, v0, L۟/s1;->ۥ۠:Z

    if-eqz v4, :cond_19

    iget-object v3, v0, L۟/s1;->ۥ:Landroid/content/Context;

    sget-object v4, L۟/ic;->ۥ:Ljava/lang/StringBuilder;

    const-string v4, "connectivity"

    .line 41
    invoke-virtual {v3, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    .line 42
    check-cast v3, Landroid/net/ConnectivityManager;

    invoke-virtual {v3}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v3

    :cond_19
    if-eqz v3, :cond_1a

    invoke-virtual {v3}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v4

    if-eqz v4, :cond_1a

    move v4, v1

    goto :goto_c

    :cond_1a
    move v4, v2

    .line 43
    :goto_c
    iget v5, p1, L۟/c0;->ۥۣ۠:I

    if-lez v5, :cond_1b

    move v6, v1

    goto :goto_d

    :cond_1b
    move v6, v2

    :goto_d
    if-nez v6, :cond_1c

    move v3, v2

    goto :goto_e

    :cond_1c
    sub-int/2addr v5, v1

    iput v5, p1, L۟/c0;->ۥۣ۠:I

    iget-object v5, p1, L۟/c0;->ۥ۟ۦ:L۟/y8;

    invoke-virtual {v5, v3}, L۟/y8;->ۥ۟ۢ(Landroid/net/NetworkInfo;)Z

    move-result v3

    .line 44
    :goto_e
    iget-object v5, p1, L۟/c0;->ۥ۟ۦ:L۟/y8;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    instance-of v5, v5, L۟/v6;

    if-nez v3, :cond_1e

    .line 46
    iget-boolean v3, v0, L۟/s1;->ۥ۠:Z

    if-eqz v3, :cond_1d

    if-eqz v5, :cond_1d

    goto :goto_f

    :cond_1d
    move v1, v2

    :goto_f
    invoke-virtual {v0, p1}, L۟/s1;->ۥ۟ۢ(L۟/c0;)V

    if-eqz v1, :cond_2d

    goto :goto_10

    :cond_1e
    iget-boolean v2, v0, L۟/s1;->ۥ۠:Z

    if-eqz v2, :cond_20

    if-eqz v4, :cond_1f

    goto :goto_11

    :cond_1f
    invoke-virtual {v0, p1}, L۟/s1;->ۥ۟ۢ(L۟/c0;)V

    if-eqz v5, :cond_2d

    :goto_10
    invoke-virtual {v0, p1}, L۟/s1;->ۥ۟ۡ(L۟/c0;)V

    goto/16 :goto_16

    .line 47
    :cond_20
    :goto_11
    iget-object v2, p1, L۟/c0;->ۥ۟:L۟/z7;

    .line 48
    iget-boolean v2, v2, L۟/z7;->ۥ۟ۨ:Z

    if-eqz v2, :cond_21

    invoke-static {p1}, L۟/ic;->ۥ۟۟(L۟/c0;)Ljava/lang/String;

    .line 49
    :cond_21
    iget-object v2, p1, L۟/c0;->ۥ۠ۡ:Ljava/lang/Exception;

    .line 50
    instance-of v2, v2, L۟/v6$a;

    if-eqz v2, :cond_22

    iget v2, p1, L۟/c0;->ۥ۟ۥ:I

    or-int/2addr v1, v2

    iput v1, p1, L۟/c0;->ۥ۟ۥ:I

    :cond_22
    iget-object v0, v0, L۟/s1;->ۥ۟:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v0

    iput-object v0, p1, L۟/c0;->ۥ۠۟:Ljava/util/concurrent/Future;

    goto/16 :goto_16

    .line 51
    :pswitch_a
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, L۟/c0;

    iget-object v0, p0, L۟/s1$a;->ۥ:L۟/s1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    iget v3, p1, L۟/c0;->ۥ۟ۤ:I

    and-int/2addr v3, v4

    if-nez v3, :cond_23

    goto :goto_12

    :cond_23
    move v1, v2

    :goto_12
    if-eqz v1, :cond_2a

    .line 53
    iget-object v1, v0, L۟/s1;->ۥ۟ۦ:L۟/e0;

    .line 54
    iget-object v2, p1, L۟/c0;->ۥ۟ۢ:Ljava/lang/String;

    .line 55
    iget-object v3, p1, L۟/c0;->ۥ۠:Landroid/graphics/Bitmap;

    .line 56
    check-cast v1, L۟/h5;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v2, :cond_29

    if-eqz v3, :cond_29

    .line 57
    monitor-enter v1

    :try_start_0
    iget v4, v1, L۟/h5;->ۥ۟۟:I

    invoke-static {v3}, L۟/ic;->ۥ۟(Landroid/graphics/Bitmap;)I

    move-result v5

    add-int/2addr v4, v5

    iput v4, v1, L۟/h5;->ۥ۟۟:I

    iget-object v4, v1, L۟/h5;->ۥ:Ljava/util/LinkedHashMap;

    invoke-virtual {v4, v2, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Bitmap;

    if-eqz v2, :cond_24

    iget v3, v1, L۟/h5;->ۥ۟۟:I

    invoke-static {v2}, L۟/ic;->ۥ۟(Landroid/graphics/Bitmap;)I

    move-result v2

    sub-int/2addr v3, v2

    iput v3, v1, L۟/h5;->ۥ۟۟:I

    :cond_24
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    iget v2, v1, L۟/h5;->ۥ۟:I

    .line 58
    :goto_13
    monitor-enter v1

    :try_start_1
    iget v3, v1, L۟/h5;->ۥ۟۟:I

    if-ltz v3, :cond_28

    iget-object v3, v1, L۟/h5;->ۥ:Ljava/util/LinkedHashMap;

    invoke-virtual {v3}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_25

    iget v3, v1, L۟/h5;->ۥ۟۟:I

    if-nez v3, :cond_28

    :cond_25
    iget v3, v1, L۟/h5;->ۥ۟۟:I

    if-le v3, v2, :cond_27

    iget-object v3, v1, L۟/h5;->ۥ:Ljava/util/LinkedHashMap;

    invoke-virtual {v3}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_26

    goto :goto_14

    :cond_26
    iget-object v3, v1, L۟/h5;->ۥ:Ljava/util/LinkedHashMap;

    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/Bitmap;

    iget-object v5, v1, L۟/h5;->ۥ:Ljava/util/LinkedHashMap;

    invoke-virtual {v5, v4}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget v4, v1, L۟/h5;->ۥ۟۟:I

    invoke-static {v3}, L۟/ic;->ۥ۟(Landroid/graphics/Bitmap;)I

    move-result v3

    sub-int/2addr v4, v3

    iput v4, v1, L۟/h5;->ۥ۟۟:I

    monitor-exit v1

    goto :goto_13

    :cond_27
    :goto_14
    monitor-exit v1

    goto :goto_15

    :cond_28
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v2, L۟/h5;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".sizeOf() is reporting inconsistent results!"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    .line 59
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1

    :cond_29
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "key == null || bitmap == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 60
    :cond_2a
    :goto_15
    iget-object v1, v0, L۟/s1;->ۥ۟۠:Ljava/util/LinkedHashMap;

    .line 61
    iget-object v2, p1, L۟/c0;->ۥ۟ۢ:Ljava/lang/String;

    .line 62
    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, p1}, L۟/s1;->ۥ(L۟/c0;)V

    .line 63
    iget-object v0, p1, L۟/c0;->ۥ۟:L۟/z7;

    .line 64
    iget-boolean v0, v0, L۟/z7;->ۥ۟ۨ:Z

    if-eqz v0, :cond_2d

    invoke-static {p1}, L۟/ic;->ۥ۟۟(L۟/c0;)Ljava/lang/String;

    goto/16 :goto_16

    .line 65
    :pswitch_b
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, L۟/f;

    iget-object v0, p0, L۟/s1$a;->ۥ:L۟/s1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    iget-object v1, p1, L۟/f;->ۥ۟ۥ:Ljava/lang/String;

    .line 67
    iget-object v2, v0, L۟/s1;->ۥ۟۠:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, L۟/c0;

    if-eqz v2, :cond_2b

    invoke-virtual {v2, p1}, L۟/c0;->ۥ۟۠(L۟/f;)V

    invoke-virtual {v2}, L۟/c0;->ۥ۟()Z

    move-result v2

    if-eqz v2, :cond_2b

    iget-object v2, v0, L۟/s1;->ۥ۟۠:Ljava/util/LinkedHashMap;

    invoke-interface {v2, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    iget-object v1, p1, L۟/f;->ۥ:L۟/z7;

    .line 69
    iget-boolean v1, v1, L۟/z7;->ۥ۟ۨ:Z

    if-eqz v1, :cond_2b

    .line 70
    iget-object v1, p1, L۟/f;->ۥ۟:L۟/w8;

    .line 71
    invoke-virtual {v1}, L۟/w8;->ۥ۟()Ljava/lang/String;

    sget-object v1, L۟/ic;->ۥ:Ljava/lang/StringBuilder;

    :cond_2b
    iget-object v1, v0, L۟/s1;->ۥۣ۟:Ljava/util/HashSet;

    .line 72
    iget-object v2, p1, L۟/f;->ۥ۟ۦ:Ljava/lang/Object;

    .line 73
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2c

    iget-object v1, v0, L۟/s1;->ۥ۟ۢ:Ljava/util/WeakHashMap;

    invoke-virtual {p1}, L۟/f;->ۥ۟۠()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    iget-object v1, p1, L۟/f;->ۥ:L۟/z7;

    .line 75
    iget-boolean v1, v1, L۟/z7;->ۥ۟ۨ:Z

    if-eqz v1, :cond_2c

    .line 76
    iget-object v1, p1, L۟/f;->ۥ۟:L۟/w8;

    .line 77
    invoke-virtual {v1}, L۟/w8;->ۥ۟()Ljava/lang/String;

    sget-object v1, L۟/ic;->ۥ:Ljava/lang/StringBuilder;

    :cond_2c
    iget-object v0, v0, L۟/s1;->ۥ۟ۡ:Ljava/util/WeakHashMap;

    invoke-virtual {p1}, L۟/f;->ۥ۟۠()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, L۟/f;

    if-eqz p1, :cond_2d

    .line 78
    iget-object v0, p1, L۟/f;->ۥ:L۟/z7;

    .line 79
    iget-boolean v0, v0, L۟/z7;->ۥ۟ۨ:Z

    if-eqz v0, :cond_2d

    .line 80
    iget-object p1, p1, L۟/f;->ۥ۟:L۟/w8;

    .line 81
    invoke-virtual {p1}, L۟/w8;->ۥ۟()Ljava/lang/String;

    sget-object p1, L۟/ic;->ۥ:Ljava/lang/StringBuilder;

    goto :goto_16

    .line 82
    :pswitch_c
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, L۟/f;

    iget-object v0, p0, L۟/s1$a;->ۥ:L۟/s1;

    .line 83
    invoke-virtual {v0, p1, v1}, L۟/s1;->ۥۣ۟(L۟/f;Z)V

    :cond_2d
    :goto_16
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_5
        :pswitch_5
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
    .end packed-switch
.end method
