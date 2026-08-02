.class public final synthetic Lr1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lr1;->h:I

    .line 2
    .line 3
    iput-object p2, p0, Lr1;->i:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lr1;->j:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    iget v1, v0, Lr1;->h:I

    const/4 v2, 0x4

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, Lr1;->i:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    iget-object v0, v0, Lr1;->j:Ljava/lang/Object;

    check-cast v0, Landroid/view/textclassifier/TextClassification;

    .line 1
    invoke-virtual {v0}, Landroid/view/textclassifier/TextClassification;->getText()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v7

    .line 2
    :cond_0
    invoke-virtual {v0}, Landroid/view/textclassifier/TextClassification;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/high16 v2, 0xc000000

    .line 3
    invoke-static {v1, v7, v0, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x22

    if-lt v0, v2, :cond_1

    .line 5
    :try_start_0
    invoke-static {}, Landroid/app/ActivityOptions;->makeBasic()Landroid/app/ActivityOptions;

    move-result-object v0

    .line 6
    invoke-static {v0}, Lzr0;->e(Landroid/app/ActivityOptions;)Landroid/app/ActivityOptions;

    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/app/ActivityOptions;->toBundle()Landroid/os/Bundle;

    move-result-object v0

    .line 8
    invoke-static {v1, v0}, Lzr0;->n(Landroid/app/PendingIntent;Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/app/PendingIntent$CanceledException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 9
    const-string v2, "TextClassification"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "error sending pendingIntent: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " error: "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 10
    :cond_1
    invoke-virtual {v1}, Landroid/app/PendingIntent;->send()V

    .line 11
    :goto_0
    sget-object v0, La83;->a:La83;

    return-object v0

    .line 12
    :pswitch_0
    iget-object v1, v0, Lr1;->i:Ljava/lang/Object;

    check-cast v1, Lcq1;

    iget-object v0, v0, Lr1;->j:Ljava/lang/Object;

    check-cast v0, Lxk1;

    .line 13
    iget-object v1, v1, Lcq1;->a:Ljava/lang/String;

    .line 14
    invoke-interface {v0, v1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 15
    sget-object v0, La83;->a:La83;

    return-object v0

    .line 16
    :pswitch_1
    iget-object v1, v0, Lr1;->i:Ljava/lang/Object;

    check-cast v1, Lsk1;

    iget-object v0, v0, Lr1;->j:Ljava/lang/Object;

    check-cast v0, Lfy;

    .line 17
    iget-object v2, v1, Lsk1;->b:[Ljava/lang/Object;

    .line 18
    iget-object v1, v1, Lsk1;->a:[J

    .line 19
    array-length v3, v1

    add-int/lit8 v3, v3, -0x2

    if-ltz v3, :cond_5

    move v4, v7

    .line 20
    :goto_1
    aget-wide v5, v1, v4

    not-long v8, v5

    const/4 v10, 0x7

    shl-long/2addr v8, v10

    and-long/2addr v8, v5

    const-wide v10, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v8, v10

    cmp-long v8, v8, v10

    if-eqz v8, :cond_4

    sub-int v8, v4, v3

    not-int v8, v8

    ushr-int/lit8 v8, v8, 0x1f

    const/16 v9, 0x8

    rsub-int/lit8 v8, v8, 0x8

    move v10, v7

    :goto_2
    if-ge v10, v8, :cond_3

    const-wide/16 v11, 0xff

    and-long/2addr v11, v5

    const-wide/16 v13, 0x80

    cmp-long v11, v11, v13

    if-gez v11, :cond_2

    shl-int/lit8 v11, v4, 0x3

    add-int/2addr v11, v10

    .line 21
    aget-object v11, v2, v11

    .line 22
    invoke-virtual {v0, v11}, Lfy;->z(Ljava/lang/Object;)V

    :cond_2
    shr-long/2addr v5, v9

    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    :cond_3
    if-ne v8, v9, :cond_5

    :cond_4
    if-eq v4, v3, :cond_5

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 23
    :cond_5
    sget-object v0, La83;->a:La83;

    return-object v0

    .line 24
    :pswitch_2
    iget-object v1, v0, Lr1;->i:Ljava/lang/Object;

    check-cast v1, Lyw;

    iget-object v0, v0, Lr1;->j:Ljava/lang/Object;

    check-cast v0, Lmn0;

    .line 25
    iput-object v0, v1, Lyw;->k:Lmn0;

    .line 26
    sget-object v0, La83;->a:La83;

    return-object v0

    .line 27
    :pswitch_3
    iget-object v1, v0, Lr1;->i:Ljava/lang/Object;

    check-cast v1, Lin0;

    iget-object v0, v0, Lr1;->j:Ljava/lang/Object;

    .line 28
    invoke-interface {v1, v0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, La83;->a:La83;

    return-object v0

    .line 29
    :pswitch_4
    iget-object v1, v0, Lr1;->i:Ljava/lang/Object;

    check-cast v1, Lb5;

    iget-object v0, v0, Lr1;->j:Ljava/lang/Object;

    check-cast v0, Lc62;

    .line 30
    iget-object v1, v1, Lb5;->i:Ljava/lang/Object;

    check-cast v1, Lxg;

    .line 31
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    .line 32
    :cond_6
    invoke-virtual {v0}, Lc62;->a()Ljava/lang/Object;

    :goto_3
    sget-object v0, La83;->a:La83;

    return-object v0

    .line 33
    :pswitch_5
    iget-object v1, v0, Lr1;->i:Ljava/lang/Object;

    check-cast v1, Lfc2;

    iget-object v0, v0, Lr1;->j:Ljava/lang/Object;

    check-cast v0, Ldc2;

    .line 34
    new-instance v2, Lg91;

    sget-object v3, Lce0;->h:Lce0;

    invoke-direct {v2, v1, v3, v0}, Lg91;-><init>(Lfc2;Ljava/util/Map;Ldc2;)V

    return-object v2

    .line 35
    :pswitch_6
    iget-object v1, v0, Lr1;->i:Ljava/lang/Object;

    check-cast v1, Lyo2;

    iget-object v0, v0, Lr1;->j:Ljava/lang/Object;

    check-cast v0, Lu21;

    .line 36
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 37
    iget-object v3, v0, Lu21;->a:Lf31;

    .line 38
    invoke-static {v0, v1}, Lsp0;->N(Lu21;Lyo2;)V

    .line 39
    invoke-interface {v1}, Lyo2;->d()I

    move-result v0

    move v3, v7

    :goto_4
    if-ge v3, v0, :cond_d

    .line 40
    invoke-interface {v1, v3}, Lyo2;->i(I)Ljava/util/List;

    move-result-object v4

    .line 41
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 42
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_7
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    instance-of v10, v9, Ly31;

    if-eqz v10, :cond_7

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 43
    :cond_8
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ne v4, v6, :cond_9

    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    goto :goto_6

    :cond_9
    move-object v4, v5

    .line 44
    :goto_6
    check-cast v4, Ly31;

    if-eqz v4, :cond_c

    invoke-interface {v4}, Ly31;->names()[Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_c

    .line 45
    array-length v8, v4

    move v9, v7

    :goto_7
    if-ge v9, v8, :cond_c

    aget-object v10, v4, v9

    .line 46
    invoke-interface {v1}, Lyo2;->c()Ls11;

    move-result-object v11

    sget-object v12, Lcp2;->g:Lcp2;

    invoke-static {v11, v12}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    const-string v11, "enum value"

    goto :goto_8

    :cond_a
    const-string v11, "property"

    .line 47
    :goto_8
    invoke-interface {v2, v10}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_b

    .line 48
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v2, v10, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v9, v9, 0x1

    goto :goto_7

    .line 49
    :cond_b
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "The suggested name \'"

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\' for "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x20

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {v1, v3}, Lyo2;->e(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " is already one of the names for "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 50
    invoke-static {v10, v2}, Lwe1;->p0(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-interface {v1, v2}, Lyo2;->e(I)Ljava/lang/String;

    move-result-object v2

    .line 51
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    const-string v2, " in "

    .line 53
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 54
    new-instance v1, Lh31;

    const/4 v2, -0x1

    invoke-static {v2, v0, v5, v5, v5}, Lp7;->s(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 55
    invoke-direct {v1, v0}, Ls31;-><init>(Ljava/lang/String;)V

    .line 56
    throw v1

    :cond_c
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_4

    .line 57
    :cond_d
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_e

    sget-object v2, Lce0;->h:Lce0;

    :cond_e
    return-object v2

    .line 58
    :pswitch_7
    iget-object v1, v0, Lr1;->i:Ljava/lang/Object;

    check-cast v1, Lqv0;

    iget-object v0, v0, Lr1;->j:Ljava/lang/Object;

    check-cast v0, Lo72;

    .line 59
    iget-object v2, v1, Lqv0;->h:Lov0;

    .line 60
    iget-object v0, v0, Lo72;->i:Ljava/lang/Object;

    check-cast v0, Lxp2;

    invoke-virtual {v2, v1, v0}, Lov0;->a(Lqv0;Lxp2;)V

    .line 61
    sget-object v0, La83;->a:La83;

    return-object v0

    .line 62
    :pswitch_8
    iget-object v1, v0, Lr1;->i:Ljava/lang/Object;

    check-cast v1, Lx0;

    iget-object v0, v0, Lr1;->j:Ljava/lang/Object;

    check-cast v0, Lxp2;

    .line 63
    new-instance v2, Lo72;

    .line 64
    invoke-direct {v2}, Lo72;-><init>()V

    .line 65
    iget-object v1, v1, Lx0;->j:Ljava/lang/Object;

    check-cast v1, Lqv0;

    .line 66
    iget-object v8, v1, Lqv0;->D:Lyv0;

    .line 67
    monitor-enter v8

    .line 68
    :try_start_1
    monitor-enter v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 69
    :try_start_2
    iget-object v9, v1, Lqv0;->y:Lxp2;

    .line 70
    new-instance v10, Lxp2;

    invoke-direct {v10}, Lxp2;-><init>()V

    .line 71
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move v11, v7

    :goto_9
    const/16 v12, 0xa

    if-ge v11, v12, :cond_10

    shl-int v12, v6, v11

    .line 72
    iget v13, v9, Lxp2;->a:I

    and-int/2addr v12, v13

    if-eqz v12, :cond_f

    .line 73
    iget-object v12, v9, Lxp2;->b:[I

    aget v12, v12, v11

    .line 74
    invoke-virtual {v10, v11, v12}, Lxp2;->b(II)V

    :cond_f
    add-int/lit8 v11, v11, 0x1

    goto :goto_9

    :cond_10
    move v11, v7

    :goto_a
    if-ge v11, v12, :cond_12

    shl-int v13, v6, v11

    .line 75
    iget v14, v0, Lxp2;->a:I

    and-int/2addr v13, v14

    if-eqz v13, :cond_11

    .line 76
    iget-object v13, v0, Lxp2;->b:[I

    aget v13, v13, v11

    .line 77
    invoke-virtual {v10, v11, v13}, Lxp2;->b(II)V

    :cond_11
    add-int/lit8 v11, v11, 0x1

    goto :goto_a

    .line 78
    :cond_12
    iput-object v10, v2, Lo72;->i:Ljava/lang/Object;

    .line 79
    invoke-virtual {v10}, Lxp2;->a()I

    move-result v0

    int-to-long v10, v0

    .line 80
    invoke-virtual {v9}, Lxp2;->a()I

    move-result v0

    int-to-long v12, v0

    sub-long/2addr v10, v12

    cmp-long v3, v10, v3

    if-eqz v3, :cond_14

    .line 81
    iget-object v0, v1, Lqv0;->i:Ljava/util/LinkedHashMap;

    .line 82
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_13

    goto :goto_b

    .line 83
    :cond_13
    iget-object v0, v1, Lqv0;->i:Ljava/util/LinkedHashMap;

    .line 84
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    .line 85
    new-array v4, v7, [Lxv0;

    invoke-interface {v0, v4}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, [Lxv0;

    goto :goto_b

    :catchall_0
    move-exception v0

    goto :goto_e

    .line 86
    :cond_14
    :goto_b
    iget-object v0, v2, Lo72;->i:Ljava/lang/Object;

    check-cast v0, Lxp2;

    .line 87
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    iput-object v0, v1, Lqv0;->y:Lxp2;

    .line 89
    iget-object v0, v1, Lqv0;->q:Lhy2;

    .line 90
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    iget-object v6, v1, Lqv0;->j:Ljava/lang/String;

    .line 92
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " onSettings"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v6, Lr1;

    const/16 v9, 0x15

    invoke-direct {v6, v9, v1, v2}, Lr1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v4, v6}, Lhy2;->b(Lhy2;Ljava/lang/String;Lxm0;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 93
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 94
    :try_start_4
    iget-object v0, v1, Lqv0;->D:Lyv0;

    .line 95
    iget-object v2, v2, Lo72;->i:Ljava/lang/Object;

    check-cast v2, Lxp2;

    invoke-virtual {v0, v2}, Lyv0;->b(Lxp2;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_c

    :catchall_1
    move-exception v0

    goto :goto_f

    :catch_1
    move-exception v0

    .line 96
    :try_start_5
    sget-object v2, Lcg0;->k:Lcg0;

    invoke-virtual {v1, v2, v2, v0}, Lqv0;->b(Lcg0;Lcg0;Ljava/io/IOException;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 97
    :goto_c
    monitor-exit v8

    if-eqz v5, :cond_16

    .line 98
    array-length v0, v5

    :goto_d
    if-ge v7, v0, :cond_16

    aget-object v1, v5, v7

    .line 99
    monitor-enter v1

    .line 100
    :try_start_6
    iget-wide v8, v1, Lxv0;->l:J

    add-long/2addr v8, v10

    iput-wide v8, v1, Lxv0;->l:J

    if-lez v3, :cond_15

    .line 101
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 102
    :cond_15
    monitor-exit v1

    add-int/lit8 v7, v7, 0x1

    goto :goto_d

    :catchall_2
    move-exception v0

    monitor-exit v1

    throw v0

    .line 103
    :cond_16
    sget-object v0, La83;->a:La83;

    return-object v0

    .line 104
    :goto_e
    :try_start_7
    monitor-exit v1

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 105
    :goto_f
    monitor-exit v8

    throw v0

    .line 106
    :pswitch_9
    iget-object v1, v0, Lr1;->i:Ljava/lang/Object;

    check-cast v1, Lqv0;

    iget-object v0, v0, Lr1;->j:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lxv0;

    .line 107
    :try_start_8
    iget-object v0, v1, Lqv0;->h:Lov0;

    .line 108
    invoke-virtual {v0, v3}, Lov0;->c(Lxv0;)V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2

    goto :goto_10

    :catch_2
    move-exception v0

    .line 109
    sget-object v4, Lzz1;->a:Lzz1;

    .line 110
    sget-object v4, Lzz1;->a:Lzz1;

    .line 111
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Http2Connection.Listener failure for "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 112
    iget-object v1, v1, Lqv0;->j:Ljava/lang/String;

    .line 113
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1, v2, v0}, Lzz1;->g(Ljava/lang/String;ILjava/lang/Throwable;)V

    .line 114
    :try_start_9
    sget-object v1, Lcg0;->k:Lcg0;

    invoke-virtual {v3, v1, v0}, Lxv0;->c(Lcg0;Ljava/io/IOException;)V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_3

    .line 115
    :catch_3
    :goto_10
    sget-object v0, La83;->a:La83;

    return-object v0

    .line 116
    :pswitch_a
    iget-object v1, v0, Lr1;->i:Ljava/lang/Object;

    check-cast v1, Lin0;

    iget-object v0, v0, Lr1;->j:Ljava/lang/Object;

    check-cast v0, Lkx1;

    .line 117
    new-instance v2, Lq0;

    const/4 v3, 0x5

    invoke-direct {v2, v0, v3}, Lq0;-><init>(Lkx1;I)V

    invoke-interface {v1, v2}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    sget-object v0, La83;->a:La83;

    return-object v0

    .line 119
    :pswitch_b
    iget-object v1, v0, Lr1;->i:Ljava/lang/Object;

    check-cast v1, Lnuke/ui/HomeActivity;

    iget-object v0, v0, Lr1;->j:Ljava/lang/Object;

    check-cast v0, Lxk1;

    invoke-static {v1, v0}, Lnuke/ui/HomeActivity;->m(Lnuke/ui/HomeActivity;Lxk1;)La83;

    move-result-object v0

    return-object v0

    :pswitch_c
    iget-object v1, v0, Lr1;->i:Ljava/lang/Object;

    check-cast v1, Lo72;

    iget-object v0, v0, Lr1;->j:Ljava/lang/Object;

    check-cast v0, Lul0;

    .line 120
    sget-object v2, Lqz1;->a:Lmy;

    .line 121
    invoke-static {v0, v2}, Lp40;->p(Lgy;Le42;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v1, Lo72;->i:Ljava/lang/Object;

    sget-object v0, La83;->a:La83;

    return-object v0

    .line 122
    :pswitch_d
    iget-object v1, v0, Lr1;->i:Ljava/lang/Object;

    check-cast v1, Lzf0;

    iget-object v0, v0, Lr1;->j:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .line 123
    new-instance v2, Lwf0;

    iget-object v1, v1, Lzf0;->a:[Ljava/lang/Enum;

    array-length v3, v1

    invoke-direct {v2, v0, v3}, Lwf0;-><init>(Ljava/lang/String;I)V

    .line 124
    array-length v0, v1

    move v3, v7

    :goto_11
    if-ge v3, v0, :cond_17

    aget-object v4, v1, v3

    .line 125
    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    .line 126
    invoke-virtual {v2, v4, v7}, Lb12;->l(Ljava/lang/String;Z)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_11

    :cond_17
    return-object v2

    .line 127
    :pswitch_e
    iget-object v1, v0, Lr1;->i:Ljava/lang/Object;

    check-cast v1, Lxy2;

    iget-object v0, v0, Lr1;->j:Ljava/lang/Object;

    check-cast v0, Lcz2;

    .line 128
    iget-object v1, v1, Lxy2;->d:Lin0;

    .line 129
    invoke-interface {v1, v0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, La83;->a:La83;

    return-object v0

    .line 130
    :pswitch_f
    iget-object v1, v0, Lr1;->i:Ljava/lang/Object;

    check-cast v1, Lry2;

    iget-object v0, v0, Lr1;->j:Ljava/lang/Object;

    check-cast v0, Lxm0;

    .line 131
    invoke-interface {v0}, Lxm0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc61;

    invoke-interface {v1, v0}, Lry2;->h(Lc61;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ltp0;->J(J)J

    move-result-wide v0

    .line 132
    new-instance v2, Lz01;

    invoke-direct {v2, v0, v1}, Lz01;-><init>(J)V

    return-object v2

    .line 133
    :pswitch_10
    iget-object v1, v0, Lr1;->i:Ljava/lang/Object;

    check-cast v1, Lcy;

    iget-object v0, v0, Lr1;->j:Ljava/lang/Object;

    .line 134
    iget-object v1, v1, Lcy;->h:Lgo0;

    .line 135
    iget-object v3, v1, Lgo0;->c:Lqr2;

    .line 136
    invoke-virtual {v3}, Lqr2;->c()Lpr2;

    move-result-object v4

    move v6, v7

    .line 137
    :goto_12
    :try_start_a
    iget v8, v3, Lqr2;->i:I

    if-ge v6, v8, :cond_21

    .line 138
    invoke-virtual {v4, v6}, Lpr2;->l(I)Z

    move-result v8

    if-eqz v8, :cond_1b

    invoke-virtual {v4, v6}, Lpr2;->n(I)Ljava/lang/Object;

    move-result-object v8

    if-eq v8, v0, :cond_1a

    .line 139
    instance-of v9, v8, Llo0;

    if-eqz v9, :cond_18

    check-cast v8, Llo0;

    goto :goto_13

    :cond_18
    move-object v8, v5

    :goto_13
    if-eqz v8, :cond_19

    .line 140
    iget-object v8, v8, Llo0;->a:La82;

    goto :goto_14

    :cond_19
    move-object v8, v5

    :goto_14
    if-ne v8, v0, :cond_1b

    .line 141
    :cond_1a
    new-instance v0, Lks1;

    invoke-direct {v0, v6, v5}, Lks1;-><init>(ILjava/lang/Integer;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 142
    invoke-virtual {v4}, Lpr2;->c()V

    move-object v5, v0

    goto :goto_1a

    :catchall_3
    move-exception v0

    goto/16 :goto_1c

    .line 143
    :cond_1b
    :try_start_b
    iget-object v8, v4, Lpr2;->b:[I

    invoke-static {v8, v6}, Lsr2;->b([II)I

    move-result v9

    add-int/lit8 v10, v6, 0x1

    .line 144
    iget v11, v4, Lpr2;->c:I

    if-ge v10, v11, :cond_1c

    mul-int/lit8 v11, v10, 0x5

    add-int/2addr v11, v2

    .line 145
    aget v8, v8, v11

    goto :goto_15

    .line 146
    :cond_1c
    iget v8, v4, Lpr2;->e:I

    :goto_15
    sub-int/2addr v8, v9

    move v9, v7

    :goto_16
    if-ge v9, v8, :cond_22

    .line 147
    invoke-virtual {v4, v6, v9}, Lpr2;->h(II)Ljava/lang/Object;

    move-result-object v11

    if-eq v11, v0, :cond_20

    .line 148
    instance-of v12, v11, Llo0;

    if-eqz v12, :cond_1d

    check-cast v11, Llo0;

    goto :goto_17

    :cond_1d
    move-object v11, v5

    :goto_17
    if-eqz v11, :cond_1e

    .line 149
    iget-object v11, v11, Llo0;->a:La82;

    goto :goto_18

    :cond_1e
    move-object v11, v5

    :goto_18
    if-ne v11, v0, :cond_1f

    goto :goto_19

    :cond_1f
    add-int/lit8 v9, v9, 0x1

    goto :goto_16

    .line 150
    :cond_20
    :goto_19
    new-instance v5, Lks1;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {v5, v6, v0}, Lks1;-><init>(ILjava/lang/Integer;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 151
    :cond_21
    invoke-virtual {v4}, Lpr2;->c()V

    goto :goto_1a

    :cond_22
    move v6, v10

    goto :goto_12

    :goto_1a
    if-eqz v5, :cond_23

    .line 152
    iget v0, v5, Lks1;->a:I

    .line 153
    iget-object v2, v5, Lks1;->b:Ljava/lang/Integer;

    .line 154
    invoke-virtual {v3}, Lqr2;->c()Lpr2;

    move-result-object v3

    .line 155
    :try_start_c
    invoke-static {v3, v0, v2}, Lp7;->P(Lpr2;ILjava/lang/Integer;)Ljava/util/ArrayList;

    move-result-object v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 156
    invoke-virtual {v3}, Lpr2;->c()V

    .line 157
    invoke-virtual {v1}, Lgo0;->E()Ljava/util/List;

    move-result-object v2

    invoke-static {v0, v2}, Ldu;->x0(Ljava/util/Collection;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v0

    goto :goto_1b

    :catchall_4
    move-exception v0

    .line 158
    invoke-virtual {v3}, Lpr2;->c()V

    throw v0

    .line 159
    :cond_23
    sget-object v0, Lbe0;->h:Lbe0;

    .line 160
    :goto_1b
    new-instance v2, Lex;

    .line 161
    iget-boolean v1, v1, Lgo0;->C:Z

    .line 162
    invoke-direct {v2, v0, v1}, Lex;-><init>(Ljava/util/List;Z)V

    return-object v2

    .line 163
    :goto_1c
    invoke-virtual {v4}, Lpr2;->c()V

    throw v0

    .line 164
    :pswitch_11
    iget-object v1, v0, Lr1;->i:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    iget-object v0, v0, Lr1;->j:Ljava/lang/Object;

    check-cast v0, Lin0;

    if-eqz v1, :cond_24

    .line 165
    invoke-interface {v0, v1}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_24
    sget-object v0, La83;->a:La83;

    return-object v0

    .line 166
    :pswitch_12
    iget-object v1, v0, Lr1;->i:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    iget-object v0, v0, Lr1;->j:Ljava/lang/Object;

    check-cast v0, Lxk1;

    .line 167
    new-instance v2, Lzq;

    .line 168
    const-string v12, ""

    .line 169
    invoke-static {}, Lyr;->f()Ljava/lang/String;

    move-result-object v3

    .line 170
    sget-object v6, Lgr;->i:Lgr;

    .line 171
    sget-object v7, Lbe0;->h:Lbe0;

    .line 172
    sget-object v9, Ler;->i:Ler;

    .line 173
    sget-object v10, Lfe0;->h:Lfe0;

    .line 174
    sget-object v11, Lir;->i:Lir;

    const-wide/16 v16, 0x0

    const/16 v18, 0x1

    const/4 v5, 0x1

    const/4 v8, 0x1

    const/16 v13, 0x3e8

    const-wide/16 v14, 0x0

    .line 175
    invoke-direct/range {v2 .. v18}, Lzq;-><init>(Ljava/lang/String;Ljava/lang/String;ZLgr;Ljava/util/List;ZLer;Ljava/util/Set;Lir;Ljava/lang/String;IJJZ)V

    .line 176
    invoke-interface {v0, v2}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 177
    sget-object v0, La83;->a:La83;

    return-object v0

    .line 178
    :pswitch_13
    iget-object v1, v0, Lr1;->i:Ljava/lang/Object;

    check-cast v1, Lk03;

    iget-object v0, v0, Lr1;->j:Ljava/lang/Object;

    check-cast v0, Lxk1;

    .line 179
    iget-wide v2, v1, Lk03;->b:J

    .line 180
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lk03;

    .line 181
    iget-wide v4, v4, Lk03;->b:J

    .line 182
    invoke-static {v2, v3, v4, v5}, Lf13;->b(JJ)Z

    move-result v2

    if-eqz v2, :cond_25

    .line 183
    iget-object v2, v1, Lk03;->c:Lf13;

    .line 184
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lk03;

    .line 185
    iget-object v3, v3, Lk03;->c:Lf13;

    .line 186
    invoke-static {v2, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_26

    .line 187
    :cond_25
    invoke-interface {v0, v1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 188
    :cond_26
    sget-object v0, La83;->a:La83;

    return-object v0

    .line 189
    :pswitch_14
    iget-object v1, v0, Lr1;->i:Ljava/lang/Object;

    check-cast v1, Lnj;

    iget-object v0, v0, Lr1;->j:Ljava/lang/Object;

    check-cast v0, Lt61;

    .line 190
    iget-object v2, v1, Lnj;->w:Leq2;

    .line 191
    iget-object v3, v0, Lt61;->h:Lsp;

    invoke-interface {v3}, Lnc0;->d()J

    move-result-wide v3

    .line 192
    invoke-virtual {v0}, Lt61;->getLayoutDirection()Ld61;

    move-result-object v5

    invoke-interface {v2, v3, v4, v5, v0}, Leq2;->a(JLd61;Le70;)Lte;

    move-result-object v0

    iput-object v0, v1, Lnj;->B:Lte;

    sget-object v0, La83;->a:La83;

    return-object v0

    .line 193
    :pswitch_15
    iget-object v1, v0, Lr1;->i:Ljava/lang/Object;

    check-cast v1, Lsw;

    iget-object v0, v0, Lr1;->j:Ljava/lang/Object;

    check-cast v0, Lxm0;

    .line 194
    iput-object v0, v1, Lsw;->j:Lxm0;

    .line 195
    sget-object v0, La83;->a:La83;

    return-object v0

    .line 196
    :pswitch_16
    const-string v1, "WeChat rejected transfer confirm request: "

    iget-object v2, v0, Lr1;->i:Ljava/lang/Object;

    check-cast v2, Ldi;

    iget-object v0, v0, Lr1;->j:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lhi;

    .line 197
    sget-object v6, Lii;->j:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    sget-object v7, Lii;->d:Lii;

    sget-object v8, Lii;->h:Ljava/lang/String;

    const-string v0, "Transfer confirm request queued: transferId="

    .line 198
    :try_start_d
    iget-wide v9, v2, Ldi;->a:J

    cmp-long v3, v9, v3

    if-lez v3, :cond_27

    .line 199
    invoke-static {v9, v10}, Ljava/lang/Thread;->sleep(J)V

    goto :goto_1d

    :catchall_5
    move-exception v0

    goto :goto_1e

    .line 200
    :cond_27
    :goto_1d
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5}, Lii;->q(Lhi;)Ljava/lang/Object;

    move-result-object v3

    iget-object v4, v5, Lhi;->b:Ljava/lang/String;

    .line 201
    sget-object v9, Lbn1;->d:Lbn1;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    sget-object v9, Lbn1;->h:Lhx2;

    invoke-virtual {v9}, Lhx2;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/reflect/Method;

    .line 203
    sget-object v10, Lbn1;->g:Lhx2;

    invoke-virtual {v10}, Lhx2;->getValue()Ljava/lang/Object;

    move-result-object v10

    .line 204
    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v9, v10, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_28

    .line 205
    invoke-virtual {v5}, Lhi;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 206
    invoke-virtual {v1, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v0}, Lhg3;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1f

    .line 207
    :cond_28
    iget-object v1, v5, Lhi;->c:Ljava/lang/String;

    .line 208
    iget-object v3, v5, Lhi;->f:Ljava/lang/String;

    .line 209
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", payer="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", amount="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 210
    invoke-static {v8, v0}, Lhg3;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    iget-object v0, v2, Ldi;->e:Lgi;

    .line 212
    invoke-static {v5, v0}, Lii;->t(Lhi;Lgi;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    goto :goto_1f

    .line 213
    :goto_1e
    invoke-virtual {v5}, Lhi;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 214
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lfg1;->Q(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Confirm transfer failed: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v0}, Lhg3;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    :goto_1f
    sget-object v0, La83;->a:La83;

    return-object v0

    :pswitch_17
    iget-object v1, v0, Lr1;->i:Ljava/lang/Object;

    check-cast v1, Lch;

    iget-object v0, v0, Lr1;->j:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lgh;

    iget-object v5, v2, Lgh;->a:Ljava/lang/String;

    .line 216
    sget-object v6, Lhh;->h:Ljava/lang/String;

    sget-object v7, Lhh;->j:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v8, Lhh;->d:Lhh;

    const-string v0, "WeChat rejected receive request: sendId="

    .line 217
    :try_start_e
    iget-wide v9, v1, Lch;->a:J

    cmp-long v1, v9, v3

    if-lez v1, :cond_29

    .line 218
    invoke-static {v9, v10}, Ljava/lang/Thread;->sleep(J)V

    goto :goto_20

    :catchall_6
    move-exception v0

    goto :goto_21

    .line 219
    :cond_29
    :goto_20
    invoke-virtual {v7, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eq v1, v2, :cond_2a

    goto :goto_22

    .line 220
    :cond_2a
    iget v1, v2, Lgh;->i:I

    if-nez v1, :cond_2b

    .line 221
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Lhh;->v(Lgh;)V

    goto :goto_22

    .line 222
    :cond_2b
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Lhh;->r(Lgh;)Ljava/lang/Object;

    move-result-object v1

    .line 223
    sget-object v3, Lbn1;->d:Lbn1;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    sget-object v3, Lbn1;->h:Lhx2;

    invoke-virtual {v3}, Lhx2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/reflect/Method;

    .line 225
    sget-object v4, Lbn1;->g:Lhx2;

    invoke-virtual {v4}, Lhx2;->getValue()Ljava/lang/Object;

    move-result-object v4

    .line 226
    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v3, v4, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_2c

    .line 227
    invoke-virtual {v7, v5, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 228
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Lhg3;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    goto :goto_22

    .line 229
    :goto_21
    invoke-virtual {v7, v5, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 230
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lfg1;->Q(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Start red packet receive failed: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Lhg3;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 231
    :cond_2c
    :goto_22
    sget-object v0, La83;->a:La83;

    return-object v0

    :pswitch_18
    iget-object v1, v0, Lr1;->i:Ljava/lang/Object;

    check-cast v1, Lin0;

    iget-object v0, v0, Lr1;->j:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lc73;

    .line 232
    iget-boolean v0, v7, Lc73;->c:Z

    xor-int/lit8 v10, v0, 0x1

    const/4 v11, 0x0

    const/16 v12, 0xb

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 233
    invoke-static/range {v7 .. v12}, Lc73;->a(Lc73;IIZLb73;I)Lc73;

    move-result-object v0

    .line 234
    invoke-interface {v1, v0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    sget-object v0, La83;->a:La83;

    return-object v0

    .line 236
    :pswitch_19
    iget-object v1, v0, Lr1;->i:Ljava/lang/Object;

    check-cast v1, Lin0;

    iget-object v0, v0, Lr1;->j:Ljava/lang/Object;

    check-cast v0, Lmt;

    .line 237
    invoke-virtual {v0}, Lmt;->l()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, La83;->a:La83;

    return-object v0

    .line 238
    :pswitch_1a
    iget-object v1, v0, Lr1;->i:Ljava/lang/Object;

    check-cast v1, Lfq;

    iget-object v0, v0, Lr1;->j:Ljava/lang/Object;

    .line 239
    invoke-interface {v1, v0}, Lho2;->s(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, La83;->a:La83;

    return-object v0

    .line 240
    :pswitch_1b
    iget-object v1, v0, Lr1;->i:Ljava/lang/Object;

    check-cast v1, Lo72;

    iget-object v0, v0, Lr1;->j:Ljava/lang/Object;

    check-cast v0, Lxm0;

    .line 241
    invoke-interface {v0}, Lxm0;->a()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v1, Lo72;->i:Ljava/lang/Object;

    sget-object v0, La83;->a:La83;

    return-object v0

    .line 242
    :pswitch_1c
    iget-object v1, v0, Lr1;->i:Ljava/lang/Object;

    check-cast v1, Lp1;

    iget-object v0, v0, Lr1;->j:Ljava/lang/Object;

    check-cast v0, Lxk1;

    .line 243
    new-instance v2, Lrh0;

    .line 244
    iget-object v1, v1, Lp1;->c:Ljava/lang/String;

    .line 245
    invoke-static {v1}, Lpv2;->I0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "https://github.com/"

    .line 246
    invoke-static {v3, v1}, Lvi0;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 247
    invoke-direct {v2, v1}, Lrh0;-><init>(Ljava/lang/String;)V

    .line 248
    invoke-interface {v0, v2}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 249
    sget-object v0, La83;->a:La83;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
