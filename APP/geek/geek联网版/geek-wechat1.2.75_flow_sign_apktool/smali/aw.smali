.class public final Law;
.super Lt50;

# interfaces
.implements Lym;


# instance fields
.field public e:I

.field public final f:Landroid/app/Dialog;

.field public final g:Landroid/content/Context;

.field public final h:Ljava/util/LinkedHashSet;

.field public final i:Ljava/lang/ClassLoader;

.field public final j:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/app/Dialog;Landroid/content/Context;Ljava/util/LinkedHashSet;Ljava/lang/ClassLoader;Ljava/lang/String;Lvd;)V
    .locals 3

    iput-object p1, p0, Law;->f:Landroid/app/Dialog;

    iput-object p2, p0, Law;->g:Landroid/content/Context;

    iput-object p3, p0, Law;->h:Ljava/util/LinkedHashSet;

    iput-object p4, p0, Law;->i:Ljava/lang/ClassLoader;

    iput-object p5, p0, Law;->j:Ljava/lang/String;

    invoke-direct {p0, p6}, Lt50;-><init>(Lvd;)V

    const/4 v1, 0x0

    const-string v0, "\u06e8\u06e6\u06e1"

    invoke-static {v0}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v2, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sub-int/2addr v0, v2

    const v2, 0x1acb4f

    add-int/2addr v0, v2

    goto :goto_0

    :sswitch_1
    invoke-static {}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۧۧۥۦ()I

    move-result v0

    if-ltz v0, :cond_2

    invoke-static {}, Landroidx/activity/result/۟۠۟۠ۦ;->۟ۢۡ۠()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {}, Lio/fastkv/ۣ۟ۧۦۡ;->ۥۥۤۥ()I

    const-string v0, "\u06e7\u06e0\u06e7"

    :goto_1
    invoke-static {v0}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e4\u06e5\u06e2"

    goto :goto_1

    :sswitch_2
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    const-string v0, "\u06df\u06e6\u06e8"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_3
    const-string v0, "eIoDLgkTNOt4eYX7iV"

    invoke-static {v0}, Landroidx/legacy/content/ۧۡ۠۠;->ۣۢۤ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v1

    sget v0, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    if-gtz v0, :cond_1

    const-string v0, "\u06e7\u06e1"

    :goto_2
    invoke-static {v0}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e2\u06e0\u06e5"

    goto :goto_2

    :cond_2
    :sswitch_4
    sget v0, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v2, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    xor-int/2addr v0, v2

    const v2, -0x1aa4fb

    xor-int/2addr v0, v2

    goto :goto_0

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdcda -> :sswitch_0
        0x1aa7e1 -> :sswitch_5
        0x1ab267 -> :sswitch_2
        0x1aba81 -> :sswitch_3
        0x1ac52e -> :sswitch_4
        0x1ac9a3 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final a(Lvd;)Lvd;
    .locals 7

    const/4 v0, 0x0

    const-string v1, "\u06e3\u06e0\u06df"

    invoke-static {v1}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v1

    move-object v5, v0

    move-object v4, v0

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget-object v4, p0, Law;->i:Ljava/lang/ClassLoader;

    const-string v0, "\u06e6\u06e6\u06e1"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto :goto_0

    :sswitch_1
    new-instance v0, Law;

    iget-object v1, p0, Law;->f:Landroid/app/Dialog;

    iget-object v2, p0, Law;->g:Landroid/content/Context;

    iget-object v3, p0, Law;->h:Ljava/util/LinkedHashSet;

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Law;-><init>(Landroid/app/Dialog;Landroid/content/Context;Ljava/util/LinkedHashSet;Ljava/lang/ClassLoader;Ljava/lang/String;Lvd;)V

    return-object v0

    :sswitch_2
    invoke-static {}, Lkotlinx/coroutines/ۤۢۢۥ;->ۡ۠ۥۡ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "\u06e5\u06e1\u06df"

    goto :goto_1

    :cond_0
    sget v0, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v1, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    rem-int/2addr v0, v1

    const v1, 0x1ab81b

    add-int/2addr v0, v1

    move v1, v0

    goto :goto_0

    :sswitch_3
    iget-object v5, p0, Law;->j:Ljava/lang/String;

    const-string v0, "\u06e7\u06e4\u06e1"

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0x1ab622 -> :sswitch_0
        0x1abd8e -> :sswitch_2
        0x1ac221 -> :sswitch_3
        0x1ac5a4 -> :sswitch_1
    .end sparse-switch
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const-string v0, "\u06e2\u06e5\u06e7"

    invoke-static {v0}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    if-ltz v0, :cond_0

    const-string v0, "\u06e0\u06df\u06e4"

    invoke-static {v0}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    check-cast p2, Lvd;

    invoke-virtual {p0, p2}, Law;->a(Lvd;)Lvd;

    move-result-object v0

    check-cast v0, Law;

    sget-object v1, Lxh;->n:Lxh;

    invoke-virtual {v0, v1}, Law;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :sswitch_2
    move-object v0, p1

    check-cast v0, Lpe;

    sget v0, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v1, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sub-int/2addr v0, v1

    const v1, 0x1aba67

    add-int/2addr v0, v1

    goto :goto_0

    :cond_0
    sget v0, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v1, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    add-int/2addr v0, v1

    const v1, 0x1ab0a5

    xor-int/2addr v0, v1

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa79d -> :sswitch_0
        0x1ab304 -> :sswitch_2
        0x1abade -> :sswitch_1
    .end sparse-switch
.end method

.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/16 v17, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v13, 0x0

    const/4 v8, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v14, 0x0

    const-string v3, "\u06e3\u06e5\u06e8"

    invoke-static {v3}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v19, v2

    move/from16 v20, v3

    :goto_0
    sparse-switch v20, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v2, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v3, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    or-int/lit16 v3, v3, -0x4c7

    mul-int/2addr v2, v3

    if-gtz v2, :cond_3

    const-string v2, "\u06e0\u06e8\u06e4"

    invoke-static {v2}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v2

    move-object v8, v11

    move/from16 v20, v2

    goto :goto_0

    :sswitch_1
    sget v2, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v3, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    or-int/2addr v2, v3

    const v3, 0x1aac27

    add-int/2addr v2, v3

    move/from16 v20, v2

    goto :goto_0

    :sswitch_2
    if-ne v9, v13, :cond_9

    const-string v2, "\u06df\u06e8\u06e3"

    invoke-static {v2}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v20, v2

    goto :goto_0

    :sswitch_3
    invoke-static {}, Landroidx/core/app/ۡۤۡ۠;->ۨۥۨۧ()I

    move-result v2

    if-ltz v2, :cond_0

    const-string v3, "\u06df\u06e8\u06e2"

    move-object v2, v10

    move-object v4, v11

    move v5, v12

    :goto_1
    invoke-static {v3}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v3

    move-object v10, v2

    move-object v11, v4

    move v12, v5

    move/from16 v20, v3

    goto :goto_0

    :cond_0
    sget v2, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v3, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    mul-int/2addr v2, v3

    const v3, 0x1c7980

    xor-int/2addr v2, v3

    move/from16 v20, v2

    goto :goto_0

    :sswitch_4
    sget-object v2, Lkn;->a:Lkn;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v2, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    if-ltz v2, :cond_1

    const-string v2, "\u06e5\u06e1\u06e0"

    invoke-static {v2}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v20, v2

    goto :goto_0

    :cond_1
    const-string v2, "\u06e4\u06df\u06e1"

    :goto_2
    invoke-static {v2}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v20, v2

    goto :goto_0

    :sswitch_5
    if-lez v16, :cond_f

    sget-object v2, Lkn;->a:Lkn;

    sget v3, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v4, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    or-int/lit16 v4, v4, 0x26f4

    or-int/2addr v3, v4

    if-ltz v3, :cond_2

    const-string v3, "\u06df\u06e5\u06e1"

    invoke-static {v3}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v3

    move-object v10, v2

    move/from16 v20, v3

    goto :goto_0

    :cond_2
    const-string v3, "\u06df\u06df\u06e0"

    move-object v4, v11

    move v5, v12

    goto :goto_1

    :sswitch_6
    move-object/from16 v0, p0

    iget-object v6, v0, Law;->g:Landroid/content/Context;

    if-eqz v12, :cond_14

    const-string v2, "\u06e2\u06e6"

    :goto_3
    invoke-static {v2}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v20, v2

    goto/16 :goto_0

    :sswitch_7
    move-object/from16 v0, p0

    iget-object v5, v0, Law;->j:Ljava/lang/String;

    new-instance v2, Laa;

    move-object/from16 v0, p0

    iget-object v3, v0, Law;->h:Ljava/util/LinkedHashSet;

    move-object/from16 v0, p0

    iget-object v4, v0, Law;->i:Ljava/lang/ClassLoader;

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v7}, Laa;-><init>(Ljava/util/LinkedHashSet;Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Context;Lvd;)V

    move-object v3, v2

    move-object/from16 v4, v18

    :goto_4
    const-string v2, "\u06df\u06e2\u06e1"

    move-object v7, v3

    move-object/from16 v18, v4

    :goto_5
    invoke-static {v2}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v20, v2

    goto/16 :goto_0

    :sswitch_8
    :try_start_0
    move-object/from16 v0, p0

    iget-object v2, v0, Law;->f:Landroid/app/Dialog;

    invoke-virtual {v2}, Landroid/app/Dialog;->dismiss()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget v2, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    sget v3, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    mul-int/2addr v2, v3

    const v3, 0x1b7ab0

    xor-int/2addr v2, v3

    move/from16 v20, v2

    goto/16 :goto_0

    :cond_3
    const-string v2, "\u06e0\u06e5\u06df"

    invoke-static {v2}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v8, v11

    move/from16 v20, v2

    goto/16 :goto_0

    :sswitch_9
    move-object/from16 v0, v18

    invoke-static {v6, v0}, Lkn;->k(Landroid/content/Context;Ljava/lang/String;)V

    sget v2, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    if-gtz v2, :cond_4

    const-string v3, "\u06e4\u06e8\u06e8"

    move-object v2, v13

    :goto_6
    invoke-static {v3}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v3

    move-object v13, v2

    move/from16 v20, v3

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u06e0\u06e2\u06e8"

    move-object v2, v13

    goto :goto_6

    :sswitch_a
    move-object/from16 v0, p0

    iget v5, v0, Law;->e:I

    sget v2, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    if-gtz v2, :cond_5

    const-string v2, "\u06e5\u06e5\u06e0"

    invoke-static {v2}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v11, p1

    move v12, v5

    move/from16 v20, v2

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06e6\u06e0\u06e0"

    move-object v2, v10

    move-object/from16 v4, p1

    goto/16 :goto_1

    :sswitch_b
    sget v2, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v3, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    div-int/lit16 v3, v3, 0xdb6

    xor-int/2addr v2, v3

    if-ltz v2, :cond_7

    move-object v2, v14

    :cond_6
    const-string v3, "\u06e8\u06e3\u06e7"

    invoke-static {v3}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v3

    move-object v14, v2

    move/from16 v20, v3

    goto/16 :goto_0

    :cond_7
    sget v2, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    sget v3, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    xor-int/2addr v2, v3

    const v3, 0x1ab114

    xor-int/2addr v2, v3

    move/from16 v20, v2

    goto/16 :goto_0

    :sswitch_c
    sget-object v2, Lqe;->a:Lqe;

    sget v3, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v4, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    rem-int/lit16 v4, v4, -0x11b2

    add-int/2addr v3, v4

    if-ltz v3, :cond_8

    invoke-static {}, Landroidx/activity/ۣۢۦۨ;->۟ۦۣ۠ۢ()I

    const-string v4, "\u06e3\u06df\u06e2"

    move-object v13, v2

    move-object v3, v15

    move-object v8, v9

    move/from16 v5, v16

    :goto_7
    invoke-static {v4}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v15, v3

    move/from16 v16, v5

    move/from16 v20, v2

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06e3\u06e2\u06e0"

    move-object v8, v9

    goto :goto_6

    :sswitch_d
    const/4 v2, 0x1

    if-ne v12, v2, :cond_12

    invoke-static {v11}, Lgu;->M(Ljava/lang/Object;)V

    sget v2, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v3, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    div-int/2addr v2, v3

    const v3, 0xdbe8

    xor-int/2addr v2, v3

    move/from16 v20, v2

    goto/16 :goto_0

    :cond_9
    :sswitch_e
    sget v2, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    sget v3, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    rem-int/lit8 v3, v3, 0x6d

    mul-int/2addr v2, v3

    if-gtz v2, :cond_a

    invoke-static {}, Landroidx/activity/result/۟ۡۧ۠ۥ;->۟ۥۥۧ۟()I

    const-string v3, "\u06e7\u06e3\u06df"

    move-object/from16 v2, v17

    :goto_8
    invoke-static {v3}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v17, v2

    move/from16 v20, v3

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06e5\u06e5\u06e0"

    move-object/from16 v2, v17

    goto :goto_8

    :sswitch_f
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "\u2705 \u6210\u529f\u6781\u901f\u5206\u53d1\u7ed9 "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move/from16 v0, v16

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    sget v3, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    if-gtz v3, :cond_b

    invoke-static {}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->ۤ۠ۡۧ()I

    const-string v3, "\u06e6\u06e0\u06e0"

    invoke-static {v3}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v19, v2

    move/from16 v20, v3

    goto/16 :goto_0

    :cond_b
    sget v3, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v4, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    div-int/2addr v3, v4

    const v4, 0x1aab5c

    add-int/2addr v3, v4

    move-object/from16 v19, v2

    move/from16 v20, v3

    goto/16 :goto_0

    :sswitch_10
    sget v2, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v3, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sub-int/2addr v2, v3

    const v3, 0x1ab474

    add-int/2addr v2, v3

    move/from16 v20, v2

    goto/16 :goto_0

    :sswitch_11
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "h8Sf5PMONlfD15b7phc8UMTHlu68CDxXw8yd/rwRPFDE0pr8u1o6GJbKhvy6FDw=\n"

    const-string v4, "5KXziNN6WXc=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :sswitch_12
    sget v2, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    if-ltz v2, :cond_c

    const/16 v2, 0x58

    sput v2, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    const-string v2, "\u06e1\u06df"

    goto/16 :goto_3

    :cond_c
    sget v2, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v3, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    or-int/2addr v2, v3

    const v3, 0x1ac9b9

    xor-int/2addr v2, v3

    move/from16 v20, v2

    goto/16 :goto_0

    :sswitch_13
    iget-object v2, v15, Lsx;->b:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    sget v3, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v4, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    mul-int/lit16 v4, v4, 0x23a7

    or-int/2addr v3, v4

    if-ltz v3, :cond_d

    move-object v3, v7

    move-object v4, v2

    goto/16 :goto_4

    :cond_d
    sget v3, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v4, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    div-int/2addr v3, v4

    const v4, 0x1ac5df

    add-int/2addr v3, v4

    move-object/from16 v18, v2

    move/from16 v20, v3

    goto/16 :goto_0

    :sswitch_14
    sget v2, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v3, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    rem-int/lit16 v3, v3, 0xde3

    div-int/2addr v2, v3

    if-eqz v2, :cond_e

    const/16 v2, 0x5a

    sput v2, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    const-string v2, "\u06e3\u06e2\u06e0"

    invoke-static {v2}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v20, v2

    goto/16 :goto_0

    :cond_e
    sget v2, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v3, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    rem-int/2addr v2, v3

    const v3, 0xdc29

    add-int/2addr v2, v3

    move/from16 v20, v2

    goto/16 :goto_0

    :sswitch_15
    invoke-static {v11}, Lgu;->M(Ljava/lang/Object;)V

    sget-object v2, Lyg;->b:Lof;

    const-string v3, "\u06e5\u06e1\u06e0"

    goto/16 :goto_8

    :catchall_0
    move-exception v2

    const-string v2, "\u06e5\u06e2\u06e5"

    goto/16 :goto_5

    :cond_f
    :sswitch_16
    invoke-static {}, Landroidx/core/content/ۣۧۡۤ;->۟ۦۦ۠ۡ()I

    move-result v2

    if-ltz v2, :cond_10

    invoke-static {}, Landroid/window/۟ۤ۟ۡۧ;->ۢۦۣۨ()I

    const-string v2, "\u06e8\u06e3\u06df"

    goto/16 :goto_2

    :cond_10
    const-string v2, "\u06e0\u06e8\u06e4"

    goto/16 :goto_3

    :sswitch_17
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6, v14}, Lkn;->k(Landroid/content/Context;Ljava/lang/String;)V

    sget v2, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v3, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    xor-int/lit16 v3, v3, -0x418

    rem-int/2addr v2, v3

    if-gtz v2, :cond_11

    invoke-static {}, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢ۠ۨۦ()I

    const-string v2, "\u06df\u06e0\u06e6"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v20, v2

    goto/16 :goto_0

    :cond_11
    move-object v2, v9

    :goto_9
    const-string v3, "\u06e5\u06df\u06e8"

    invoke-static {v3}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v3

    move-object v9, v2

    move/from16 v20, v3

    goto/16 :goto_0

    :sswitch_18
    const-string v2, " \u4e2a\u5bf9\u8c61\uff01"

    move-object/from16 v0, v19

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v4, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    add-int/lit16 v4, v4, 0x2605

    add-int/2addr v3, v4

    if-gtz v3, :cond_6

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟ۧ۠ۧۢ()I

    const-string v3, "\u06e2\u06e3\u06df"

    invoke-static {v3}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v3

    move-object v14, v2

    move/from16 v20, v3

    goto/16 :goto_0

    :sswitch_19
    sget-object v13, Lxh;->n:Lxh;

    :sswitch_1a
    return-object v13

    :cond_12
    :sswitch_1b
    const-string v2, "\u06e0\u06e1\u06e4"

    invoke-static {v2}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v20, v2

    goto/16 :goto_0

    :sswitch_1c
    move-object v2, v8

    check-cast v2, Lsx;

    iget-object v3, v2, Lsx;->a:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v5

    sget v3, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    if-ltz v3, :cond_13

    const/16 v3, 0x21

    sput v3, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    const-string v3, "\u06e4\u06df\u06e1"

    invoke-static {v3}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v3

    move-object v15, v2

    move/from16 v16, v5

    move/from16 v20, v3

    goto/16 :goto_0

    :cond_13
    const-string v4, "\u06e2\u06e3\u06e8"

    move-object v3, v2

    goto/16 :goto_7

    :cond_14
    :sswitch_1d
    sget v2, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v3, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    or-int/lit16 v3, v3, 0x1326

    mul-int/2addr v2, v3

    if-ltz v2, :cond_15

    invoke-static {}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۦۥۨۦ()I

    const-string v2, "\u06e4\u06df\u06df"

    invoke-static {v2}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v20, v2

    goto/16 :goto_0

    :cond_15
    const-string v2, "\u06df\u06e5\u06e1"

    invoke-static {v2}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v20, v2

    goto/16 :goto_0

    :sswitch_1e
    const/4 v2, 0x1

    move-object/from16 v0, p0

    iput v2, v0, Law;->e:I

    move-object/from16 v0, v17

    move-object/from16 v1, p0

    invoke-static {v0, v7, v1}, Lg80;->M(Lhe;Lym;Lt50;)Ljava/lang/Object;

    move-result-object v2

    sget v3, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    if-gtz v3, :cond_16

    const/16 v3, 0x30

    sput v3, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    goto/16 :goto_9

    :cond_16
    sget v3, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v4, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    rem-int/2addr v3, v4

    const v4, 0x1aa66f

    add-int/2addr v3, v4

    move-object v9, v2

    move/from16 v20, v3

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe8 -> :sswitch_0
        0xdc44 -> :sswitch_d
        0xdcd9 -> :sswitch_1
        0x1aa700 -> :sswitch_f
        0x1aa725 -> :sswitch_c
        0x1aa75e -> :sswitch_1e
        0x1aa7bb -> :sswitch_15
        0x1aa81a -> :sswitch_1a
        0x1aab03 -> :sswitch_11
        0x1aab26 -> :sswitch_19
        0x1aab60 -> :sswitch_18
        0x1aab7a -> :sswitch_b
        0x1aabda -> :sswitch_3
        0x1aabdc -> :sswitch_4
        0x1aaea8 -> :sswitch_1b
        0x1aaec5 -> :sswitch_12
        0x1ab2a4 -> :sswitch_e
        0x1ab2be -> :sswitch_10
        0x1ab2c7 -> :sswitch_13
        0x1ab33d -> :sswitch_16
        0x1ab606 -> :sswitch_1
        0x1ab661 -> :sswitch_2
        0x1ab6c6 -> :sswitch_a
        0x1ab9c6 -> :sswitch_9
        0x1abae4 -> :sswitch_e
        0x1abd8e -> :sswitch_14
        0x1abdc4 -> :sswitch_7
        0x1abde8 -> :sswitch_12
        0x1abe40 -> :sswitch_1c
        0x1abea2 -> :sswitch_1d
        0x1ac166 -> :sswitch_6
        0x1ac5e0 -> :sswitch_8
        0x1ac94c -> :sswitch_17
        0x1ac9c4 -> :sswitch_5
    .end sparse-switch
.end method
