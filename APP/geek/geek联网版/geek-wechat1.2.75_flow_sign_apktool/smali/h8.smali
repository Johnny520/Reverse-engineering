.class public final synthetic Lh8;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Ln00;

.field public final c:Ljava/lang/String;

.field public final d:Z

.field public final e:Landroid/app/Activity;

.field public final f:Landroid/app/Dialog;

.field public final g:Lum;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ln00;Ljava/lang/String;ZLandroid/app/Activity;Landroid/app/Dialog;Lum;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e2\u06df\u06e5"

    invoke-static {v1}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iput-object p6, p0, Lh8;->f:Landroid/app/Dialog;

    sget v0, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v2, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    xor-int/lit16 v2, v2, -0xed5

    rem-int/2addr v0, v2

    if-gtz v0, :cond_2

    const/16 v0, 0x51

    sput v0, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    const-string v0, "\u06e1\u06e4\u06e1"

    :goto_1
    invoke-static {v0}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_1
    iput-boolean p4, p0, Lh8;->d:Z

    const-string v0, "\u06e0\u06e5\u06e2"

    :goto_2
    invoke-static {v0}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_2
    iput-object p3, p0, Lh8;->c:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۦۥۨۦ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "\u06df\u06e1\u06e2"

    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    sget v0, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v2, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    or-int/2addr v0, v2

    const v2, 0x1ab1e4

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_3
    iput-object p2, p0, Lh8;->b:Ln00;

    const-string v0, "\u06e0\u06e2\u06e6"

    goto :goto_1

    :sswitch_4
    iput-object p1, p0, Lh8;->a:Ljava/util/List;

    sget v0, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    if-ltz v0, :cond_1

    :cond_1
    const-string v0, "\u06e2\u06e6\u06e1"

    :goto_3
    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_5
    sget v0, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v2, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    div-int/2addr v0, v2

    const v2, 0x1ab248

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_6
    const-string v0, "zqrmPJAIvWhGXY"

    invoke-static {v0}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۥ۠ۧۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    const-string v1, "\u06df\u06e3\u06df"

    invoke-static {v1}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :cond_2
    sget v0, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v2, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    rem-int/2addr v0, v2

    const v2, 0x1acc0d

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_7
    iput-object p7, p0, Lh8;->g:Lum;

    :goto_4
    const-string v0, "\u06e5\u06e8\u06e5"

    invoke-static {v0}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_8
    iput-object p5, p0, Lh8;->e:Landroid/app/Activity;

    sget v0, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    if-ltz v0, :cond_3

    invoke-static {}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۨ۠۟()I

    const-string v0, "\u06e2\u06df\u06e5"

    goto :goto_2

    :cond_3
    const-string v0, "\u06df\u06e1\u06e2"

    goto :goto_2

    :cond_4
    :sswitch_9
    sget v0, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v2, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    rem-int/2addr v0, v2

    const v2, -0x1aae28

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۤ۟۠ۢ()I

    move-result v0

    if-gtz v0, :cond_4

    sget v0, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v2, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    or-int/lit16 v2, v2, -0xf8d

    rem-int/2addr v0, v2

    if-ltz v0, :cond_5

    const/16 v0, 0x15

    sput v0, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    const-string v0, "\u06e0\u06e5\u06e2"

    :goto_5
    invoke-static {v0}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06e5\u06e0\u06e7"

    goto :goto_5

    :sswitch_b
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    if-ltz v0, :cond_6

    const/4 v0, 0x5

    sput v0, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    goto :goto_4

    :cond_6
    const-string v0, "\u06e1\u06e4\u06e1"

    goto/16 :goto_3

    :sswitch_c
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa740 -> :sswitch_0
        0x1aa77b -> :sswitch_b
        0x1aab24 -> :sswitch_2
        0x1aab7d -> :sswitch_8
        0x1aaf1e -> :sswitch_c
        0x1ab248 -> :sswitch_4
        0x1ab2e3 -> :sswitch_1
        0x1ab31d -> :sswitch_3
        0x1ab6c0 -> :sswitch_9
        0x1abdac -> :sswitch_6
        0x1abea2 -> :sswitch_a
        0x1ac1e2 -> :sswitch_5
        0x1ac98b -> :sswitch_7
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 27

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/16 v18, 0x0

    const/4 v10, 0x0

    const/4 v9, 0x0

    const/16 v20, 0x0

    const/4 v13, 0x0

    const/16 v24, 0x0

    const/4 v12, 0x0

    const/4 v11, 0x0

    const/4 v2, 0x0

    const/16 v19, 0x0

    const/16 v16, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v17, 0x0

    const/4 v15, 0x0

    const/4 v14, 0x0

    const/4 v4, 0x0

    const/16 v25, 0x0

    const-string v21, "\u06e0\u06df\u06e1"

    invoke-static/range {v21 .. v21}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v26

    move-object/from16 v21, v2

    move-object/from16 v22, v4

    move-object/from16 v23, v20

    :goto_0
    sparse-switch v26, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v2, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v4, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    add-int/lit16 v4, v4, 0x21c8

    div-int/2addr v2, v4

    if-eqz v2, :cond_1a

    const-string v2, "\u06e6\u06e1\u06e8"

    invoke-static {v2}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v26, v2

    goto :goto_0

    :sswitch_1
    sget-object v2, Lkn;->a:Lkn;

    invoke-static/range {p1 .. p1}, Lmp;->d(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "\u06e4\u06e7\u06e3"

    :goto_1
    invoke-static {v2}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v26, v2

    goto :goto_0

    :sswitch_2
    sget v2, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v4, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    or-int/lit16 v4, v4, -0x1ffd

    mul-int/2addr v2, v4

    if-ltz v2, :cond_0

    const-string v2, "\u06e4\u06e0\u06e0"

    goto :goto_1

    :cond_0
    sget v2, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v4, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    mul-int/2addr v2, v4

    const v4, 0x1ab450

    xor-int/2addr v2, v4

    move/from16 v26, v2

    goto :goto_0

    :sswitch_3
    const-string v2, "\u6c14\u6ce1\u5df2\u5207\u6362\u4e3a: "

    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    sget v4, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v20, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    move/from16 v0, v20

    xor-int/lit16 v0, v0, -0x168

    move/from16 v20, v0

    xor-int v4, v4, v20

    if-ltz v4, :cond_1

    const/16 v4, 0x22

    sput v4, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    const-string v4, "\u06e8\u06e2\u06df"

    invoke-static {v4}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v22, v2

    move/from16 v26, v4

    goto :goto_0

    :cond_1
    sget v4, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v20, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    div-int v4, v4, v20

    const v20, 0x1aa7da

    add-int v4, v4, v20

    move-object/from16 v22, v2

    move/from16 v26, v4

    goto :goto_0

    :sswitch_4
    move-object/from16 v0, v24

    invoke-static {v0, v12}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget v4, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v20, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    move/from16 v0, v20

    mul-int/lit16 v0, v0, 0x15af

    move/from16 v20, v0

    rem-int v4, v4, v20

    if-gtz v4, :cond_2

    const/16 v4, 0x1e

    sput v4, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    const-string v4, "\u06e6\u06e4\u06e1"

    invoke-static {v4}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v23, v2

    move/from16 v26, v4

    goto/16 :goto_0

    :cond_2
    sget v4, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v20, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sub-int v4, v4, v20

    const v20, 0x1aacba

    add-int v4, v4, v20

    move-object/from16 v23, v2

    move/from16 v26, v4

    goto/16 :goto_0

    :sswitch_5
    move-object/from16 v0, p0

    iget-object v2, v0, Lh8;->g:Lum;

    invoke-static/range {v25 .. v25}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v4}, Lum;->f(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Landroid/window/ۣۧ۟۠;->ۣۡ۟ۢ()I

    move-result v2

    if-gtz v2, :cond_4

    move-object v2, v6

    :cond_3
    const-string v4, "\u06e6\u06e4\u06e7"

    invoke-static {v4}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v4

    move-object v6, v2

    move/from16 v26, v4

    goto/16 :goto_0

    :cond_4
    sget v2, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v4, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    div-int/2addr v2, v4

    const v4, 0x1ac9e7

    add-int/2addr v2, v4

    move/from16 v26, v2

    goto/16 :goto_0

    :cond_5
    :sswitch_6
    sget v2, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    if-ltz v2, :cond_6

    invoke-static {}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۡۤۥۧ()I

    const-string v2, "\u06e0\u06e5\u06e6"

    invoke-static {v2}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v26, v2

    goto/16 :goto_0

    :cond_6
    const-string v2, "\u06e0\u06e7\u06e4"

    move-object v4, v7

    :goto_2
    invoke-static {v2}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v2

    move-object v7, v4

    move/from16 v26, v2

    goto/16 :goto_0

    :sswitch_7
    sget v2, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v4, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    div-int/lit16 v4, v4, -0x3f4

    mul-int/2addr v2, v4

    if-eqz v2, :cond_7

    invoke-static {}, Lۤۤۥۤ;->۟ۤ۠()I

    const-string v2, "\u06e1\u06e4\u06e4"

    move-object v4, v7

    goto :goto_2

    :cond_7
    sget v2, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v4, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    div-int/2addr v2, v4

    const v4, 0x1ac9e9

    add-int/2addr v2, v4

    move/from16 v26, v2

    goto/16 :goto_0

    :sswitch_8
    move-object/from16 v0, v21

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "start_night"

    move-object/from16 v0, v21

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {v21 .. v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v18

    iget-object v4, v0, Lj8;->d:Ljava/lang/String;

    invoke-static {v2, v4}, Lkn;->h(Ljava/lang/String;Ljava/lang/String;)V

    sget v2, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    if-ltz v2, :cond_9

    move-object v2, v9

    move v4, v10

    :cond_8
    const-string v9, "\u06e0\u06e7\u06e0"

    invoke-static {v9}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v20

    move-object v9, v2

    move v10, v4

    move/from16 v26, v20

    goto/16 :goto_0

    :cond_9
    const-string v2, "\u06e8\u06e2\u06df"

    move-object v4, v7

    :goto_3
    invoke-static {v2}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v7, v4

    move/from16 v26, v2

    goto/16 :goto_0

    :sswitch_9
    invoke-virtual/range {v19 .. v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v18

    iget-object v4, v0, Lj8;->e:Ljava/lang/String;

    invoke-static {v2, v4}, Lkn;->h(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v2, Lt9;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    if-eqz v10, :cond_5

    sget v2, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    if-ltz v2, :cond_a

    const-string v2, "\u06df\u06e0\u06e6"

    :goto_4
    invoke-static {v2}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v26, v2

    goto/16 :goto_0

    :cond_a
    const-string v2, "\u06e7\u06e6\u06e2"

    goto :goto_4

    :sswitch_a
    sget v2, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v4, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    mul-int/lit16 v4, v4, -0x1b40

    sub-int/2addr v2, v4

    if-gtz v2, :cond_b

    invoke-static {}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۤ۟۠ۢ()I

    const-string v4, "\u06e4\u06e5"

    move-object v2, v11

    :goto_5
    invoke-static {v4}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v4

    move-object v11, v2

    move/from16 v26, v4

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06e0\u06df\u06e1"

    move-object v2, v11

    goto :goto_5

    :sswitch_b
    move-object/from16 v0, v17

    invoke-static {v8, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Landroid/window/۟ۤ۟ۡۧ;->ۢۦۣۨ()I

    move-result v4

    if-gtz v4, :cond_3

    const-string v4, "\u06e5\u06e1\u06e8"

    invoke-static {v4}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠ۡۤ(Ljava/lang/Object;)I

    move-result v4

    move-object v6, v2

    move/from16 v26, v4

    goto/16 :goto_0

    :sswitch_c
    move-object/from16 v0, v18

    iget-object v4, v0, Lj8;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۦۣ۠()I

    move-result v14

    if-ltz v14, :cond_f

    const-string v14, "\u06e6\u06e7\u06e3"

    invoke-static {v14}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v20

    move-object v14, v2

    move-object v15, v4

    move/from16 v26, v20

    goto/16 :goto_0

    :sswitch_d
    sget v2, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    if-ltz v2, :cond_c

    const/16 v2, 0x61

    sput v2, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    const-string v2, "\u06e2\u06e7"

    invoke-static {v2}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v8, v16

    move/from16 v26, v2

    goto/16 :goto_0

    :cond_c
    sget v2, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v4, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    xor-int/2addr v2, v4

    const v4, 0x1ab95c

    xor-int/2addr v2, v4

    move-object/from16 v8, v16

    move/from16 v26, v2

    goto/16 :goto_0

    :sswitch_e
    const-string v2, "end"

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v18

    iget-object v4, v0, Lj8;->c:Ljava/lang/String;

    invoke-static {v2, v4}, Lkn;->h(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget v4, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v20, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    or-int v4, v4, v20

    const v20, 0xdc7d

    add-int v4, v4, v20

    move-object/from16 v21, v2

    move/from16 v26, v4

    goto/16 :goto_0

    :cond_d
    move v10, v4

    :sswitch_f
    sget v2, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v4, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    mul-int/lit16 v4, v4, 0x23cc

    xor-int/2addr v2, v4

    if-gtz v2, :cond_e

    invoke-static {}, Landroidx/core/content/ۣۧۡۤ;->۟ۦۦ۠ۡ()I

    const-string v2, "\u06e1\u06e2\u06e1"

    invoke-static {v2}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v26, v2

    goto/16 :goto_0

    :cond_e
    const-string v4, "\u06e3\u06e8\u06e2"

    move-object v2, v11

    goto/16 :goto_5

    :sswitch_10
    sget v2, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v4, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    rem-int/2addr v2, v4

    const v4, 0xdc3a

    add-int/2addr v2, v4

    move/from16 v26, v2

    goto/16 :goto_0

    :sswitch_11
    const-string v2, "\u06e1\u06df\u06e3"

    goto/16 :goto_1

    :sswitch_12
    const-string v16, "swdivJ3s\n"

    const-string v17, "VqjbWgtVeYk=\n"

    sget v2, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v4, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    or-int/lit16 v4, v4, 0x1fbe

    sub-int/2addr v2, v4

    if-ltz v2, :cond_10

    move-object v2, v14

    move-object v4, v15

    :cond_f
    const-string v14, "\u06e7\u06df\u06e7"

    invoke-static {v14}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v20

    move-object v14, v2

    move-object v15, v4

    move/from16 v26, v20

    goto/16 :goto_0

    :cond_10
    move-object/from16 v2, v18

    :cond_11
    const-string v18, "\u06e2\u06e2\u06e1"

    move-object/from16 v4, v19

    move-object/from16 v20, v18

    :goto_6
    invoke-static/range {v20 .. v20}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v20

    move-object/from16 v18, v2

    move-object/from16 v19, v4

    move/from16 v26, v20

    goto/16 :goto_0

    :sswitch_13
    const-string v4, "\u06e5\u06e2\u06df"

    move-object v2, v3

    :goto_7
    invoke-static {v4}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v4

    move-object v3, v2

    move/from16 v26, v4

    goto/16 :goto_0

    :sswitch_14
    const-string v7, "gqmzajXh\n"

    const-string v4, "ZhEgj4R/Hxc=\n"

    sget v2, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    if-ltz v2, :cond_12

    const/16 v2, 0x1a

    sput v2, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    const-string v2, "\u06e0\u06e7\u06e4"

    move-object v8, v7

    goto/16 :goto_3

    :cond_12
    const-string v2, "\u06e4\u06e6\u06e6"

    move-object v8, v7

    goto/16 :goto_2

    :sswitch_15
    sget v2, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v4, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    mul-int/2addr v2, v4

    const v4, 0x1a80fc

    add-int/2addr v2, v4

    move/from16 v26, v2

    goto/16 :goto_0

    :sswitch_16
    move-object/from16 v0, p0

    iget-object v2, v0, Lh8;->a:Ljava/util/List;

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj8;

    iget v4, v3, Ln00;->a:I

    move-object/from16 v0, p0

    iget-object v0, v0, Lh8;->c:Ljava/lang/String;

    move-object/from16 v18, v0

    move-object/from16 v0, v18

    invoke-static {v0, v4}, Lkn;->g(Ljava/lang/String;I)V

    invoke-static {}, Landroidx/legacy/content/ۨ۠ۦۥ;->۟ۢۦ۠ۦ()I

    move-result v4

    if-gez v4, :cond_11

    sget v4, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    sget v18, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    xor-int v4, v4, v18

    const v18, 0x1aa739

    add-int v4, v4, v18

    move-object/from16 v18, v2

    move/from16 v26, v4

    goto/16 :goto_0

    :sswitch_17
    const-string v2, "start"

    move-object/from16 v0, v23

    invoke-static {v0, v2}, Lg40;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v18

    iget-object v4, v0, Lj8;->b:Ljava/lang/String;

    invoke-static {v2, v4}, Lkn;->h(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, v23

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\u06e3\u06e4\u06e3"

    goto/16 :goto_5

    :sswitch_18
    sget v2, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v4, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    mul-int/lit16 v4, v4, 0x1729

    rem-int/2addr v2, v4

    if-gtz v2, :cond_13

    const/16 v2, 0x4e

    sput v2, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    const-string v2, "\u06e8\u06e8\u06e7"

    invoke-static {v2}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v26, v2

    goto/16 :goto_0

    :cond_13
    sget v2, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v4, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    rem-int/2addr v2, v4

    const v4, 0x1ac1cd

    add-int/2addr v2, v4

    move/from16 v26, v2

    goto/16 :goto_0

    :sswitch_19
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, v23

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "end_night"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v2, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v19, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    move/from16 v0, v19

    mul-int/lit16 v0, v0, 0x256a

    move/from16 v19, v0

    sub-int v2, v2, v19

    if-ltz v2, :cond_14

    const-string v2, "\u06e7\u06df\u06e1"

    invoke-static {v2}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v19, v4

    move/from16 v26, v2

    goto/16 :goto_0

    :cond_14
    const-string v19, "\u06e6\u06df\u06e6"

    move-object/from16 v2, v18

    move-object/from16 v20, v19

    goto/16 :goto_6

    :sswitch_1a
    move-object/from16 v0, p0

    iget-object v2, v0, Lh8;->e:Landroid/app/Activity;

    move-object/from16 v0, v22

    invoke-static {v2, v0}, Lkn;->k(Landroid/content/Context;Ljava/lang/String;)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lh8;->f:Landroid/app/Dialog;

    invoke-virtual {v2}, Landroid/app/Dialog;->dismiss()V

    iget v2, v3, Ln00;->a:I

    sget v4, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    sget v20, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    move/from16 v0, v20

    xor-int/lit16 v0, v0, -0xcd7

    move/from16 v20, v0

    add-int v4, v4, v20

    if-ltz v4, :cond_15

    const/16 v4, 0x14

    sput v4, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    const-string v4, "\u06e1\u06e1\u06e2"

    invoke-static {v4}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v25, v2

    move/from16 v26, v4

    goto/16 :goto_0

    :cond_15
    sget v4, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v20, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    rem-int v4, v4, v20

    const v20, 0x1ac9df

    add-int v4, v4, v20

    move/from16 v25, v2

    move/from16 v26, v4

    goto/16 :goto_0

    :sswitch_1b
    const-string v4, "\u06e7\u06e2\u06e8"

    move-object v2, v11

    move-object v12, v13

    goto/16 :goto_5

    :sswitch_1c
    invoke-static {}, Landroid/window/ۦۣۦۥ;->ۡۥۥۥ()I

    move-result v2

    if-gtz v2, :cond_16

    const-string v2, "\u06e7\u06e6\u06e2"

    invoke-static {v2}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v24, v9

    move/from16 v26, v2

    goto/16 :goto_0

    :cond_16
    const-string v2, "\u06e6\u06e4\u06e1"

    invoke-static {v2}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v24, v9

    move/from16 v26, v2

    goto/16 :goto_0

    :sswitch_1d
    const-string v2, "al9jqNwpfYxtX0WU0TBwnF4=\n"

    const-string v13, "AToa975cH+4=\n"

    sget v4, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v20, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    div-int v4, v4, v20

    const v20, 0xdc84

    add-int v4, v4, v20

    move-object/from16 v24, v2

    move/from16 v26, v4

    goto/16 :goto_0

    :sswitch_1e
    move-object/from16 v0, p0

    iget-boolean v4, v0, Lh8;->d:Z

    if-eqz v4, :cond_d

    const-string v2, "xWyV8dYIDHTAbbPMxRgHfctWj8HcFRdO\n"

    sget v9, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    if-gtz v9, :cond_8

    const/16 v9, 0x48

    sput v9, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    const-string v9, "\u06e5\u06e2\u06df"

    invoke-static {v9}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v20

    move-object v9, v2

    move v10, v4

    move/from16 v26, v20

    goto/16 :goto_0

    :sswitch_1f
    const/4 v2, 0x1

    move-object/from16 v0, p1

    invoke-static {v0, v2}, Lkn;->i(Landroid/view/View;I)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lh8;->b:Ln00;

    iget v5, v2, Ln00;->a:I

    invoke-static {}, Lcom/google/android/material/carousel/ۢۢۢۥ;->۟ۡ۟۠ۧ()I

    move-result v3

    if-gtz v3, :cond_17

    const-string v3, "\u06e7\u06e7\u06df"

    move-object v4, v3

    goto/16 :goto_7

    :cond_17
    sget v3, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v4, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    mul-int/2addr v3, v4

    const v4, 0x18b5a3

    add-int/2addr v4, v3

    move-object v3, v2

    move/from16 v26, v4

    goto/16 :goto_0

    :sswitch_20
    invoke-static {}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۦۢۧۧ()I

    move-result v2

    if-gtz v2, :cond_18

    const-string v2, "\u06e8\u06e4\u06e5"

    move-object/from16 v17, v7

    :goto_8
    invoke-static {v2}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v26, v2

    goto/16 :goto_0

    :cond_18
    sget v2, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v4, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    or-int/2addr v2, v4

    const v4, -0x1aade2

    xor-int/2addr v2, v4

    move-object/from16 v17, v7

    move/from16 v26, v2

    goto/16 :goto_0

    :sswitch_21
    const-string v12, "rgnsrrB6ZRE=\n"

    sget v2, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    if-gtz v2, :cond_19

    invoke-static {}, Landroidx/core/widget/۟ۡۦۢۥ;->ۡۧۡۦ()I

    const-string v2, "\u06df\u06e2\u06df"

    invoke-static {v2}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v26, v2

    goto/16 :goto_0

    :cond_19
    const-string v2, "\u06e8\u06e4\u06e5"

    goto :goto_8

    :cond_1a
    sget v2, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v4, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    rem-int/2addr v2, v4

    const v4, 0x1ac0ff

    xor-int/2addr v2, v4

    move/from16 v26, v2

    goto/16 :goto_0

    :sswitch_22
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc45 -> :sswitch_0
        0xdc64 -> :sswitch_8
        0xdc82 -> :sswitch_1b
        0x1aa725 -> :sswitch_15
        0x1aa745 -> :sswitch_c
        0x1aa75c -> :sswitch_2
        0x1aa7da -> :sswitch_1a
        0x1aaac2 -> :sswitch_1
        0x1aaae5 -> :sswitch_1e
        0x1aabb9 -> :sswitch_21
        0x1aabbd -> :sswitch_14
        0x1aae85 -> :sswitch_7
        0x1aaec2 -> :sswitch_11
        0x1aaee1 -> :sswitch_18
        0x1ab263 -> :sswitch_7
        0x1ab2a1 -> :sswitch_d
        0x1ab6a2 -> :sswitch_e
        0x1ab71d -> :sswitch_1d
        0x1ab9c8 -> :sswitch_b
        0x1ab9ca -> :sswitch_a
        0x1ab9ec -> :sswitch_6
        0x1abaa4 -> :sswitch_20
        0x1abac0 -> :sswitch_1f
        0x1abdcc -> :sswitch_f
        0x1abde2 -> :sswitch_15
        0x1ac14d -> :sswitch_9
        0x1ac1e3 -> :sswitch_4
        0x1ac1e9 -> :sswitch_13
        0x1ac242 -> :sswitch_2
        0x1ac509 -> :sswitch_16
        0x1ac50f -> :sswitch_3
        0x1ac56d -> :sswitch_10
        0x1ac5e3 -> :sswitch_12
        0x1ac5ff -> :sswitch_0
        0x1ac925 -> :sswitch_19
        0x1ac969 -> :sswitch_1c
        0x1ac9df -> :sswitch_5
        0x1ac9e7 -> :sswitch_22
        0x1ac9e8 -> :sswitch_17
    .end sparse-switch
.end method
