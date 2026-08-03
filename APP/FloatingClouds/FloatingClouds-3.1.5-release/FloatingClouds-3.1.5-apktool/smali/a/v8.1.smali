.class public final synthetic La/v8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/github/libxposed/api/XposedInterface$Hooker;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x6

    iput v0, p0, La/v8;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;I)V
    .locals 0

    .line 2
    iput p2, p0, La/v8;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final intercept(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 14

    const/4 v0, 0x1

    const-string v1, "getArgs(...)"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v4, "chain"

    iget v5, p0, La/v8;->a:I

    packed-switch v5, :pswitch_data_0

    invoke-static {p1, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v1

    sget-object v4, La/K3;->a:La/K3$a;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v4

    iget-boolean v4, v4, La/jc;->c:Z

    if-eqz v4, :cond_1

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, [B

    if-eqz v6, :cond_0

    check-cast v5, [B

    goto :goto_0

    :cond_0
    move-object v5, v3

    :goto_0
    if-eqz v5, :cond_1

    new-instance v6, Ljava/lang/String;

    sget-object v7, La/V2;->a:Ljava/nio/charset/Charset;

    invoke-direct {v6, v5, v7}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    :cond_1
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    instance-of v5, p1, Ljava/lang/String;

    if-eqz v5, :cond_2

    check-cast p1, Ljava/lang/String;

    goto :goto_1

    :cond_2
    move-object p1, v3

    :goto_1
    if-nez p1, :cond_3

    const-string p1, ""

    :cond_3
    if-eqz v1, :cond_4

    move v5, v0

    goto :goto_2

    :cond_4
    move v5, v2

    :goto_2
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "opened="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v6, "hook db"

    filled-new-array {v6, p1, v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, La/n9;->m([Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_17

    sget-object v5, La/xh;->a:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v6, La/G4;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    iput-object v1, v6, La/G4;->a:Ljava/lang/Object;

    invoke-virtual {v5, p1, v6}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v4, :cond_17

    const-string v4, "EnMicroMsg"

    invoke-static {p1, v4, v2}, La/Be;->I(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v6

    if-eqz v6, :cond_17

    const-string v6, "columns user="

    invoke-static {p1, v4, v2}, La/Be;->I(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-nez v4, :cond_5

    goto/16 :goto_e

    :cond_5
    invoke-virtual {v5, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/G4;

    if-eqz v4, :cond_6

    iget-object v4, v4, La/G4;->a:Ljava/lang/Object;

    goto :goto_3

    :cond_6
    move-object v4, v3

    :goto_3
    const-string v5, "FCloud_DB"

    if-nez v4, :cond_7

    const-string v0, "Store has no DB instance for "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v5, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_e

    :cond_7
    :try_start_0
    const-string p1, "SELECT username, conRemark, nickname, alias FROM rcontact"

    invoke-static {v4, p1, v3}, La/xh$a;->a(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;

    move-result-object p1

    if-nez p1, :cond_8

    const-string p1, "rawQuery returned null cursor"

    invoke-static {v5, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_e

    :catchall_0
    move-exception p1

    goto/16 :goto_d

    :cond_8
    :try_start_1
    const-string v4, "username"

    invoke-interface {p1, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    const-string v7, "conRemark"

    invoke-interface {p1, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v7

    const-string v8, "nickname"

    invoke-interface {p1, v8}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v8

    const-string v9, "alias"

    invoke-interface {p1, v9}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v9

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, " remark="

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, " nick="

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, " alias="

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :catchall_1
    :cond_9
    :goto_4
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    if-eqz v6, :cond_16

    if-ltz v4, :cond_a

    :try_start_2
    invoke-interface {p1, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_5

    :cond_a
    move-object v6, v3

    :goto_5
    if-eqz v6, :cond_9

    invoke-static {v6}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_b

    goto :goto_4

    :cond_b
    if-ltz v7, :cond_c

    invoke-interface {p1, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    goto :goto_6

    :cond_c
    move-object v10, v3

    :goto_6
    if-ltz v8, :cond_d

    invoke-interface {p1, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v11

    goto :goto_7

    :cond_d
    move-object v11, v3

    :goto_7
    if-ltz v9, :cond_e

    invoke-interface {p1, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    goto :goto_8

    :cond_e
    move-object v12, v3

    :goto_8
    if-eqz v10, :cond_11

    invoke-static {v10}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v13

    if-nez v13, :cond_f

    goto :goto_9

    :cond_f
    move-object v10, v3

    :goto_9
    if-nez v10, :cond_10

    goto :goto_a

    :cond_10
    move-object v12, v10

    goto :goto_c

    :cond_11
    :goto_a
    if-eqz v11, :cond_12

    invoke-static {v11}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_12

    goto :goto_b

    :cond_12
    move-object v11, v3

    :goto_b
    if-nez v11, :cond_14

    if-eqz v12, :cond_13

    invoke-static {v12}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_13

    goto :goto_c

    :cond_13
    move-object v12, v3

    goto :goto_c

    :cond_14
    move-object v12, v11

    :goto_c
    if-eqz v12, :cond_9

    invoke-static {v12}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_15

    goto :goto_4

    :cond_15
    sget-object v10, La/xh;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v10, v6, v12}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    add-int/2addr v2, v0

    goto :goto_4

    :cond_16
    :try_start_3
    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "loaded "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " contacts into cache"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v5, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_e

    :catchall_2
    move-exception v0

    :try_start_5
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :catchall_3
    move-exception v2

    :try_start_6
    invoke-static {p1, v0}, La/w1;->e(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :goto_d
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "loadAllContacts failed: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v5, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_17
    :goto_e
    return-object v1

    :pswitch_0
    invoke-static {p1, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, La/R8;->k()Z

    move-result v0

    if-nez v0, :cond_18

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    goto :goto_f

    :cond_18
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v1}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v2}, La/t3;->o0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_19

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    goto :goto_f

    :cond_19
    invoke-static {v0}, La/ah;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1a

    sget-object v1, La/fh;->G:Ljava/util/concurrent/ExecutorService;

    invoke-static {v0}, La/fh$a;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1a

    const-string p1, "intercept incoming call manager for wxid="

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, La/R8;->r(Ljava/lang/String;)V

    invoke-static {v0}, La/bh;->g(Ljava/lang/String;)V

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_f

    :cond_1a
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    :goto_f
    return-object p1

    :pswitch_1
    invoke-static {p1, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, La/R8;->k()Z

    move-result v0

    if-nez v0, :cond_1b

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v3

    goto :goto_12

    :cond_1b
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v1}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Landroid/content/Intent;

    if-eqz v2, :cond_1c

    goto :goto_10

    :cond_1d
    move-object v1, v3

    :goto_10
    instance-of v0, v1, Landroid/content/Intent;

    if-eqz v0, :cond_1e

    check-cast v1, Landroid/content/Intent;

    goto :goto_11

    :cond_1e
    move-object v1, v3

    :goto_11
    if-eqz v1, :cond_1f

    invoke-static {v1}, La/R8;->t(Landroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_1f

    const-string p1, "intercept Flutter global for VOIP intent"

    invoke-static {p1}, La/R8;->r(Ljava/lang/String;)V

    goto :goto_12

    :cond_1f
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v3

    :goto_12
    return-object v3

    :pswitch_2
    invoke-static {p1, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, La/R8;->k()Z

    move-result v2

    if-nez v2, :cond_20

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v3

    goto :goto_14

    :cond_20
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v2

    invoke-static {v2, v1}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v0}, La/t3;->o0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_21

    check-cast v0, Ljava/lang/String;

    goto :goto_13

    :cond_21
    move-object v0, v3

    :goto_13
    if-eqz v0, :cond_22

    sget-object v1, La/fh;->G:Ljava/util/concurrent/ExecutorService;

    invoke-static {v0}, La/fh$a;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_22

    const-string p1, "intercept incoming call UI for wxid="

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, La/R8;->r(Ljava/lang/String;)V

    invoke-static {v0}, La/bh;->g(Ljava/lang/String;)V

    goto :goto_14

    :cond_22
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v3

    :goto_14
    return-object v3

    :pswitch_3
    invoke-static {p1, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, La/R8;->k()Z

    move-result v0

    if-nez v0, :cond_23

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v3

    goto :goto_16

    :cond_23
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v1}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v2}, La/t3;->o0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_24

    check-cast v0, Ljava/lang/String;

    goto :goto_15

    :cond_24
    move-object v0, v3

    :goto_15
    if-eqz v0, :cond_25

    sget-object v1, La/fh;->G:Ljava/util/concurrent/ExecutorService;

    invoke-static {v0}, La/fh$a;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_25

    const-string p1, "intercept voip bind for user="

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, La/R8;->r(Ljava/lang/String;)V

    invoke-static {v0}, La/bh;->g(Ljava/lang/String;)V

    goto :goto_16

    :cond_25
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v3

    :goto_16
    return-object v3

    :pswitch_4
    invoke-static {p1, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, La/R8;->k()Z

    move-result v0

    if-nez v0, :cond_26

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v3

    goto :goto_17

    :cond_26
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v1}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v2}, La/t3;->o0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_27

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v3

    goto :goto_17

    :cond_27
    invoke-static {v0}, La/ah;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_28

    sget-object v1, La/fh;->G:Ljava/util/concurrent/ExecutorService;

    invoke-static {v0}, La/fh$a;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_28

    const-string p1, "intercept incoming call handler for wxid="

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, La/R8;->r(Ljava/lang/String;)V

    invoke-static {v0}, La/bh;->g(Ljava/lang/String;)V

    goto :goto_17

    :cond_28
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v3

    :goto_17
    return-object v3

    :pswitch_5
    invoke-static {p1, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, La/w8;->c()Z

    move-result v1

    if-nez v1, :cond_29

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1a

    :cond_29
    invoke-static {}, La/w8;->e()Ljava/util/HashSet;

    move-result-object v1

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v4

    :goto_18
    if-ge v2, v4, :cond_2c

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, La/Kf;->b(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2a

    check-cast v5, Ljava/util/List;

    goto :goto_19

    :cond_2a
    move-object v5, v3

    :goto_19
    if-eqz v5, :cond_2b

    invoke-static {v5, v1}, La/w8;->b(Ljava/util/List;Ljava/util/HashSet;)I

    :cond_2b
    add-int/2addr v2, v0

    goto :goto_18

    :cond_2c
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    :goto_1a
    return-object p1

    nop

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
