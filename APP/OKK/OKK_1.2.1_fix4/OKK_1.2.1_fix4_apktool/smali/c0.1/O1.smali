.class public final Lc0/O1;
.super Lde/robv/android/xposed/c;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lc0/P1;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    iput p1, p0, Lc0/O1;->b:I

    packed-switch p1, :pswitch_data_0

    sget-object p1, Lc0/P1;->a:Lc0/P1;

    iput-object p1, p0, Lc0/O1;->c:Lc0/P1;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    :pswitch_0
    sget-object p1, Lc0/P1;->a:Lc0/P1;

    iput-object p1, p0, Lc0/O1;->c:Lc0/P1;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a(Lde/robv/android/xposed/b;)V
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const/4 v2, 0x1

    const-string v3, "ts="

    const-string v4, "/storage/emulated/0/Android/media/com.tencent.mm/OKK"

    iget-object v5, v1, Lc0/O1;->c:Lc0/P1;

    const/4 v6, 0x0

    const-string v7, "com.tencent.mm"

    const/4 v8, 0x0

    iget v9, v1, Lc0/O1;->b:I

    packed-switch v9, :pswitch_data_0

    iget-object v0, v0, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v9, v0, Landroid/app/Activity;

    if-eqz v9, :cond_0

    check-cast v0, Landroid/app/Activity;

    move-object v9, v0

    goto :goto_0

    :cond_0
    move-object v9, v8

    :goto_0
    if-nez v9, :cond_1

    goto/16 :goto_3

    :cond_1
    invoke-virtual {v9}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v7}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_3

    :cond_2
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v7, "RedirectUI"

    invoke-static {v0, v7, v6}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    goto/16 :goto_3

    :cond_3
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lc0/L1;->a:Lc0/L1;

    new-instance v5, Ljava/io/File;

    const-string v0, "map_pick_request"

    invoke-direct {v5, v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/File;->isFile()Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_3

    :cond_4
    :try_start_0
    sget-object v0, LW0/a;->a:Ljava/nio/charset/Charset;

    invoke-static {v5, v0}, LN0/k;->i0(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_1
    instance-of v4, v0, LD0/f;

    if-eqz v4, :cond_5

    move-object v0, v8

    :cond_5
    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_6

    goto :goto_3

    :cond_6
    invoke-static {v0}, LW0/j;->S0(Ljava/lang/CharSequence;)LV0/f;

    move-result-object v0

    invoke-interface {v0}, LV0/h;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const-string v7, "it"

    invoke-static {v4, v7}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v3, v6}, LW0/r;->H0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v7

    if-eqz v7, :cond_7

    move-object v8, v4

    :cond_8
    if-eqz v8, :cond_9

    invoke-static {v8, v3}, LW0/j;->U0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LW0/q;->B0(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    goto :goto_2

    :cond_9
    invoke-virtual {v5}, Ljava/io/File;->lastModified()J

    move-result-wide v3

    :goto_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    sub-long/2addr v7, v3

    const-wide/32 v3, 0x1d4c0

    cmp-long v0, v7, v3

    if-gtz v0, :cond_b

    sget-object v0, Lc0/P1;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v6, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_3

    :cond_a
    sget-object v0, Lc0/P1;->d:Landroid/os/Handler;

    new-instance v2, Lc0/v;

    const/16 v3, 0x8

    invoke-direct {v2, v9, v3}, Lc0/v;-><init>(Landroid/app/Activity;I)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_b
    :goto_3
    return-void

    :pswitch_0
    iget-object v9, v0, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v10, v9, Landroid/app/Activity;

    if-eqz v10, :cond_c

    check-cast v9, Landroid/app/Activity;

    goto :goto_4

    :cond_c
    move-object v9, v8

    :goto_4
    if-nez v9, :cond_d

    goto/16 :goto_10

    :cond_d
    invoke-virtual {v9}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v7}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_e

    goto/16 :goto_10

    :cond_e
    iget-object v7, v0, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    aget-object v7, v7, v6

    instance-of v10, v7, Ljava/lang/Integer;

    if-eqz v10, :cond_f

    check-cast v7, Ljava/lang/Integer;

    goto :goto_5

    :cond_f
    move-object v7, v8

    :goto_5
    if-eqz v7, :cond_1e

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v10, v0, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    aget-object v10, v10, v2

    instance-of v11, v10, Ljava/lang/Integer;

    if-eqz v11, :cond_10

    check-cast v10, Ljava/lang/Integer;

    goto :goto_6

    :cond_10
    move-object v10, v8

    :goto_6
    if-eqz v10, :cond_1e

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-object v0, v0, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    const/4 v11, 0x2

    aget-object v0, v0, v11

    instance-of v12, v0, Landroid/content/Intent;

    if-eqz v12, :cond_11

    check-cast v0, Landroid/content/Intent;

    move-object v12, v0

    goto :goto_7

    :cond_11
    move-object v12, v8

    :goto_7
    const v0, 0xac07

    if-eq v7, v0, :cond_12

    goto/16 :goto_10

    :cond_12
    sget-object v0, Lc0/P1;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    const/4 v0, -0x1

    if-eq v10, v0, :cond_13

    sget-object v0, Lc0/L1;->a:Lc0/L1;

    invoke-static {}, Lc0/L1;->a()V

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "map pick canceled"

    invoke-static {v0}, Lc0/P1;->c(Ljava/lang/String;)V

    goto/16 :goto_10

    :cond_13
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez v12, :cond_14

    goto :goto_c

    :cond_14
    const-string v0, "KLocationIntent"

    invoke-virtual {v12, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    if-eqz v0, :cond_15

    invoke-static {v0}, Lc0/P1;->a(Ljava/lang/Object;)LD0/e;

    move-result-object v0

    if-eqz v0, :cond_15

    :goto_8
    move-object v8, v0

    goto :goto_c

    :cond_15
    invoke-virtual {v12}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    sget-object v5, Lc0/P1;->a:Lc0/P1;

    if-eqz v0, :cond_1a

    invoke-virtual {v0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_1a

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_16
    :goto_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1a

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :try_start_1
    invoke-virtual {v12}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v7

    if-eqz v7, :cond_17

    invoke-virtual {v7, v0}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_b

    :catchall_1
    move-exception v0

    goto :goto_a

    :cond_17
    move-object v0, v8

    goto :goto_b

    :goto_a
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_b
    instance-of v7, v0, LD0/f;

    if-eqz v7, :cond_18

    move-object v0, v8

    :cond_18
    if-nez v0, :cond_19

    goto :goto_9

    :cond_19
    invoke-static {v0}, Lc0/P1;->a(Ljava/lang/Object;)LD0/e;

    move-result-object v0

    if-eqz v0, :cond_16

    goto :goto_8

    :cond_1a
    invoke-virtual {v12}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1b

    invoke-static {v0}, Lc0/P1;->b(Ljava/lang/String;)LD0/e;

    move-result-object v0

    if-eqz v0, :cond_1b

    goto :goto_8

    :cond_1b
    :goto_c
    if-nez v8, :cond_1c

    sget-object v0, Lc0/L1;->a:Lc0/L1;

    invoke-static {}, Lc0/L1;->a()V

    const-string v0, "OKK\uff1a\u89e3\u6790\u5730\u56fe\u7ed3\u679c\u5931\u8d25"

    invoke-static {v9, v0, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "parse result failed data="

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/P1;->c(Ljava/lang/String;)V

    goto/16 :goto_10

    :cond_1c
    iget-object v0, v8, LD0/e;->a:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v5

    iget-object v0, v8, LD0/e;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v7

    sget-object v0, Lc0/L1;->a:Lc0/L1;

    const-string v0, "%.6f"

    const-string v10, "lon="

    const-string v12, "lat="

    new-instance v13, Ljava/io/File;

    const-string v14, "map_pick_result"

    invoke-direct {v13, v4, v14}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_2
    invoke-virtual {v13}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v4

    if-eqz v4, :cond_1d

    invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z

    goto :goto_d

    :catchall_2
    move-exception v0

    goto :goto_e

    :cond_1d
    :goto_d
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v14, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v15

    filled-new-array {v15}, [Ljava/lang/Object;

    move-result-object v15

    invoke-static {v15, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v15

    invoke-static {v14, v0, v15}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v12, v15}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v12, 0xa

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v15

    filled-new-array {v15}, [Ljava/lang/Object;

    move-result-object v15

    invoke-static {v15, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v15

    invoke-static {v14, v0, v15}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "toString(...)"

    invoke-static {v0, v3}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, LW0/a;->a:Ljava/nio/charset/Charset;

    invoke-static {v13, v0, v3}, LN0/k;->j0(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_f

    :goto_e
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_f
    invoke-static {}, Lc0/L1;->a()V

    const/4 v12, 0x1

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-wide v13, v5

    move-wide v15, v7

    invoke-static/range {v12 .. v18}, Lc0/L1;->i(ZDDLandroid/content/Context;Z)V

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    filled-new-array {v0, v3}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v3, "OKK\uff1a\u5df2\u9009\u70b9 %.5f, %.5f"

    invoke-static {v3, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "map pick ok lat="

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v2, " lon="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/P1;->c(Ljava/lang/String;)V

    :cond_1e
    :goto_10
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
