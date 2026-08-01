.class public final synthetic Lgn;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 3

    iput p1, p0, Lgn;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06df\u06e3\u06e1"

    invoke-static {v1}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    invoke-static {}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۢۧۥ()I

    move-result v1

    if-ltz v1, :cond_3

    const/16 v1, 0x2d

    sput v1, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    const-string v1, "\u06e3\u06e6"

    invoke-static {v1}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_1
    const-string v0, "yDmEg5nE8BGDmtR7tgNLPhdNAmC"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->۠ۤۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget v1, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    sget v2, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    rem-int/2addr v1, v2

    const v2, 0xdc8e

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_2
    sget v1, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v2, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    or-int/lit16 v2, v2, -0xb0e

    div-int/2addr v1, v2

    if-eqz v1, :cond_0

    const-string v1, "\u06e0\u06e3\u06e0"

    invoke-static {v1}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    sget v1, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v2, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    or-int/2addr v1, v2

    const v2, -0x1aa74d

    xor-int/2addr v1, v2

    goto :goto_0

    :cond_1
    :sswitch_3
    sget v1, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v2, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    div-int/lit16 v2, v2, 0x237

    sub-int/2addr v1, v2

    if-gtz v1, :cond_2

    invoke-static {}, Landroidx/legacy/content/ۨ۠ۦۥ;->۟ۢۦ۠ۦ()I

    const-string v1, "\u06df\u06e4\u06e8"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    const-string v1, "\u06e4\u06e6"

    invoke-static {v1}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_4
    invoke-static {}, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۦۣ۠()I

    move-result v1

    if-ltz v1, :cond_1

    sget v1, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v2, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    div-int/lit16 v2, v2, 0x597

    add-int/2addr v1, v2

    if-gtz v1, :cond_4

    invoke-static {}, Landroid/window/۟ۤ۟ۡۧ;->ۢۦۣۨ()I

    :cond_3
    const-string v1, "\u06e4\u06e6"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_4
    sget v1, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v2, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    xor-int/2addr v1, v2

    const v2, 0x1aaa0a

    xor-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc63 -> :sswitch_0
        0xdc82 -> :sswitch_5
        0x1aa77d -> :sswitch_4
        0x1aabc0 -> :sswitch_1
        0x1abadb -> :sswitch_3
        0x1abd86 -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 42

    const/16 v34, 0x0

    const/16 v24, 0x0

    const/16 v18, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/4 v8, 0x0

    const/16 v22, 0x0

    const/16 v21, 0x0

    const/16 v31, 0x0

    const/16 v16, 0x0

    const/4 v4, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v10, 0x0

    const/4 v9, 0x0

    const/16 v36, 0x0

    const/16 v27, 0x0

    const/4 v5, 0x0

    const/16 v32, 0x0

    const/16 v17, 0x0

    const/16 v30, 0x0

    const/4 v6, 0x0

    const/16 v33, 0x0

    const/16 v23, 0x0

    const/4 v7, 0x0

    const/4 v15, 0x0

    const/4 v14, 0x0

    const-string v28, "\u06e7\u06e8\u06e0"

    invoke-static/range {v28 .. v28}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v35

    move-object/from16 v28, v4

    move-object/from16 v29, v16

    :goto_0
    sparse-switch v35, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-virtual {v12}, Ljava/util/ArrayList;->clear()V

    const/4 v4, 0x0

    sput-boolean v4, Ltb0;->b:Z

    sget v4, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v16, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    move/from16 v0, v16

    add-int/lit16 v0, v0, -0x1c56

    move/from16 v16, v0

    or-int v4, v4, v16

    if-ltz v4, :cond_e

    const-string v4, "\u06e5\u06df\u06df"

    invoke-static {v4}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v35, v4

    goto :goto_0

    :sswitch_1
    :try_start_0
    sget-object v7, Lt9;->c:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۨۧ۟ۤ()I

    move-result v4

    if-ltz v4, :cond_0

    const/16 v4, 0x41

    sput v4, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    const-string v4, "\u06e5\u06e3\u06e2"

    invoke-static {v4}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v35, v4

    goto :goto_0

    :cond_0
    sget v4, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v16, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    add-int v4, v4, v16

    const v16, 0x1abf33

    add-int v4, v4, v16

    move/from16 v35, v4

    goto :goto_0

    :sswitch_2
    invoke-static {v12, v13}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    sget v4, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v16, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    mul-int v4, v4, v16

    const v16, 0x1fd74c

    add-int v4, v4, v16

    move/from16 v35, v4

    goto :goto_0

    :sswitch_3
    sget-object v4, Ltb0;->a:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v12

    const/16 v16, 0x1

    move/from16 v0, v16

    if-le v12, v0, :cond_9

    new-instance v12, Lde;

    sget v13, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    xor-int/lit16 v13, v13, 0x147

    invoke-direct {v12, v13}, Lde;-><init>(I)V

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v13

    const/16 v16, 0x1

    move/from16 v0, v16

    if-le v13, v0, :cond_8

    const-string v16, "\u06e2\u06e0\u06e6"

    move-object v13, v12

    :goto_1
    invoke-static/range {v16 .. v16}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v16

    move-object v12, v4

    move/from16 v35, v16

    goto :goto_0

    :sswitch_4
    const/4 v4, 0x0

    throw v4

    :sswitch_5
    sget v4, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    if-gtz v4, :cond_1

    const-string v4, "\u06e3\u06e6\u06e8"

    :goto_2
    invoke-static {v4}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v35, v4

    goto/16 :goto_0

    :cond_1
    sget v4, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v16, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    div-int v4, v4, v16

    const v16, 0x1aa779

    xor-int v4, v4, v16

    move/from16 v35, v4

    goto/16 :goto_0

    :sswitch_6
    :try_start_1
    sget-object v6, Lt9;->c:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    sget v4, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    if-gtz v4, :cond_3

    move-object v4, v9

    :cond_2
    const-string v9, "\u06e1\u06e2\u06e8"

    invoke-static {v9}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v16

    move-object v9, v4

    move/from16 v35, v16

    goto/16 :goto_0

    :cond_3
    sget v4, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v16, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sub-int v4, v4, v16

    const v16, 0x1aaf4d

    add-int v4, v4, v16

    move/from16 v35, v4

    goto/16 :goto_0

    :sswitch_7
    :try_start_2
    sget-object v5, Lt9;->c:Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    const-string v4, "\u06e5\u06e3\u06e2"

    :goto_3
    invoke-static {v4}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v35, v4

    goto/16 :goto_0

    :pswitch_0
    :sswitch_8
    const-string v4, "\u06e5\u06e7\u06e5"

    :goto_4
    invoke-static {v4}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v35, v4

    goto/16 :goto_0

    :sswitch_9
    move/from16 v0, v36

    int-to-long v10, v0

    const-wide/16 v38, 0x2d

    mul-long v10, v10, v38

    move-object/from16 v0, v31

    iget-object v4, v0, Lrb0;->a:Landroid/view/View;

    sget v9, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    xor-int/lit16 v9, v9, 0x3aa

    const/16 v16, 0x0

    move-object/from16 v0, v16

    invoke-virtual {v4, v9, v0}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    invoke-virtual {v4}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v9

    const/high16 v16, 0x3f800000    # 1.0f

    move/from16 v0, v16

    invoke-virtual {v9, v0}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v9

    invoke-virtual {v9, v10, v11}, Landroid/view/ViewPropertyAnimator;->setStartDelay(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v9

    const-wide/16 v38, -0x1e

    sget v16, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    move/from16 v0, v16

    int-to-long v0, v0

    move-wide/from16 v40, v0

    xor-long v38, v38, v40

    move-wide/from16 v0, v38

    invoke-virtual {v9, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v9

    invoke-virtual {v9}, Landroid/view/ViewPropertyAnimator;->start()V

    sget v9, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    if-ltz v9, :cond_2

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۦۢۢۢ()I

    :goto_5
    const-string v9, "\u06e6\u06e3\u06e6"

    invoke-static {v9}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v16

    move-object v9, v4

    move/from16 v35, v16

    goto/16 :goto_0

    :sswitch_a
    const-string v4, "\u06e7\u06e8\u06e0"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v35, v4

    goto/16 :goto_0

    :cond_4
    :sswitch_b
    sget v4, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v16, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    add-int v4, v4, v16

    const v16, 0x1ab9d3

    add-int v4, v4, v16

    move/from16 v35, v4

    goto/16 :goto_0

    :pswitch_1
    :sswitch_c
    const-string v4, "\u06e5\u06e2\u06e6"

    :goto_6
    invoke-static {v4}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v35, v4

    goto/16 :goto_0

    :cond_5
    :sswitch_d
    sget v4, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v16, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    move/from16 v0, v16

    add-int/lit16 v0, v0, -0x1d0b

    move/from16 v16, v0

    sub-int v4, v4, v16

    if-gtz v4, :cond_6

    invoke-static {}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟۠ۢۧۡ()I

    const-string v4, "\u06e1\u06e7\u06e0"

    goto/16 :goto_4

    :cond_6
    sget v4, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v16, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    xor-int v4, v4, v16

    const v16, 0xdc64

    add-int v4, v4, v16

    move/from16 v35, v4

    goto/16 :goto_0

    :sswitch_e
    sget v4, Lcom/ljx/wechatmod/core/GeekConfig$registerUpdateReceiver$receiver$1;->a:I

    sget v4, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    if-ltz v4, :cond_35

    const-string v4, "\u06e2\u06e4\u06e1"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v35, v4

    goto/16 :goto_0

    :sswitch_f
    invoke-virtual {v14, v15}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۡۥۥۦ()I

    move-result v4

    if-ltz v4, :cond_7

    const/16 v4, 0x22

    sput v4, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    const-string v4, "\u06df\u06e3\u06df"

    invoke-static {v4}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v35, v4

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u06e5\u06e0\u06e7"

    :goto_7
    invoke-static {v4}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v35, v4

    goto/16 :goto_0

    :sswitch_10
    sget v4, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v16, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    rem-int v4, v4, v16

    const v16, 0x1aa76f

    add-int v4, v4, v16

    move/from16 v35, v4

    move/from16 v36, v26

    goto/16 :goto_0

    :sswitch_11
    const-string v4, "\u06df\u06e6\u06df"

    move-object/from16 v16, v4

    move-object/from16 v17, v18

    :goto_8
    invoke-static/range {v16 .. v16}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v35, v4

    goto/16 :goto_0

    :cond_8
    move-object v13, v12

    :cond_9
    :goto_9
    sget v12, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    if-ltz v12, :cond_a

    const-string v16, "\u06e2\u06e0\u06e0"

    move-object v12, v4

    goto :goto_8

    :cond_a
    const-string v16, "\u06e7\u06e7\u06e3"

    move-object v12, v4

    goto :goto_8

    :sswitch_12
    sget v4, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v16, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    move/from16 v0, v16

    add-int/lit16 v0, v0, 0x1cf3

    move/from16 v16, v0

    rem-int v4, v4, v16

    if-gtz v4, :cond_b

    invoke-static {}, Landroidx/core/app/ۡۤۡ۠;->ۨۥۨۧ()I

    const-string v4, "\u06df\u06e7\u06df"

    move/from16 v16, v19

    :goto_a
    invoke-static {v4}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v16

    move/from16 v35, v4

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06df\u06e5\u06e7"

    move/from16 v20, v19

    :goto_b
    invoke-static {v4}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v35, v4

    goto/16 :goto_0

    :catchall_0
    move-exception v4

    const-string v4, "06ke\n"

    const-string v16, "p8h5VTpLcuY=\n"

    const-string v35, "vIk7gO/O8Q6SiwGlw9X2DoKtOorc1foa\n"

    const-string v37, "++xe66yhn2g=\n"

    move-object/from16 v0, v35

    move-object/from16 v1, v37

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v35

    const-string v37, "tw==\n"

    const-string v38, "0vI8ySRxU5w=\n"

    move-object/from16 v0, v16

    move-object/from16 v1, v35

    move-object/from16 v2, v37

    move-object/from16 v3, v38

    invoke-static {v4, v0, v1, v2, v3}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget v4, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    if-gtz v4, :cond_11

    invoke-static {}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۧۧ()I

    const-string v4, "\u06df\u06e4\u06e2"

    invoke-static {v4}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v35, v4

    goto/16 :goto_0

    :sswitch_13
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x1

    move-object/from16 v0, v28

    invoke-static {v0, v4}, Lkn;->b(Ljava/lang/String;I)I

    move-result v4

    const/16 v16, 0x1

    move/from16 v0, v16

    if-ne v4, v0, :cond_23

    const/16 v20, 0x1

    sget v4, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v16, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    move/from16 v0, v16

    rem-int/lit16 v0, v0, 0x7a8

    move/from16 v16, v0

    add-int v4, v4, v16

    if-ltz v4, :cond_c

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۥۣ۠ۦ()I

    const-string v4, "\u06e4\u06df"

    invoke-static {v4}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v35, v4

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06e3\u06e6\u06e5"

    :goto_c
    invoke-static {v4}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v35, v4

    goto/16 :goto_0

    :sswitch_14
    invoke-static {}, Landroid/window/ۦۣۦۥ;->ۡۥۥۥ()I

    move-result v4

    if-gtz v4, :cond_f

    const-string v4, "Psx8fv3hHYJKsE3SuHDEjfzqPZ"

    invoke-static {v4}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۢۤۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v4

    sget v16, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v30, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    add-int v16, v16, v30

    const v30, 0x1ab2a4

    add-int v16, v16, v30

    move-object/from16 v30, v4

    move/from16 v35, v16

    goto/16 :goto_0

    :sswitch_15
    sget v4, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    if-ltz v4, :cond_d

    const-string v4, "\u06e2\u06e8\u06e8"

    invoke-static {v4}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v35, v4

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u06e8\u06e4\u06e8"

    invoke-static {v4}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v35, v4

    goto/16 :goto_0

    :cond_e
    sget v4, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v16, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    mul-int v4, v4, v16

    const v16, 0x1a59cd

    add-int v4, v4, v16

    move/from16 v35, v4

    goto/16 :goto_0

    :cond_f
    :sswitch_16
    invoke-static {}, Landroidx/activity/result/۟ۡۤۦۡ;->۟۟۟ۥۤ()I

    move-result v4

    if-gtz v4, :cond_10

    const-string v4, "\u06e1\u06e6\u06e3"

    :goto_d
    invoke-static {v4}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v35, v4

    goto/16 :goto_0

    :cond_10
    sget v4, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v16, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    or-int v4, v4, v16

    const v16, 0xdd20

    add-int v4, v4, v16

    move/from16 v35, v4

    goto/16 :goto_0

    :sswitch_17
    invoke-static {}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۟ۢۢ()I

    move-result v4

    if-gtz v4, :cond_12

    invoke-static {}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->۠ۨۦۥ()I

    :cond_11
    const-string v4, "\u06e7\u06e8\u06e1"

    invoke-static {v4}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v35, v4

    goto/16 :goto_0

    :cond_12
    sget v4, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v16, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    xor-int v4, v4, v16

    const v16, -0x1aca43

    xor-int v4, v4, v16

    move/from16 v35, v4

    goto/16 :goto_0

    :cond_13
    :sswitch_18
    sget v4, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v16, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    move/from16 v0, v16

    rem-int/lit16 v0, v0, 0x6a3

    move/from16 v16, v0

    sub-int v4, v4, v16

    if-gtz v4, :cond_14

    invoke-static {}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟۠ۢۢ۠()I

    const-string v4, "\u06e3\u06e4\u06e4"

    :goto_e
    invoke-static {v4}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v35, v4

    goto/16 :goto_0

    :cond_14
    sget v4, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v16, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sub-int v4, v4, v16

    const v16, 0x1aa809

    add-int v4, v4, v16

    move/from16 v35, v4

    goto/16 :goto_0

    :sswitch_19
    :try_start_3
    invoke-virtual/range {v23 .. v23}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    move-object v4, v9

    goto/16 :goto_5

    :sswitch_1a
    sget v4, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v16, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    move/from16 v0, v16

    mul-int/lit16 v0, v0, -0x31c

    move/from16 v16, v0

    add-int v4, v4, v16

    if-ltz v4, :cond_15

    const-string v4, "\u06df\u06e5\u06e7"

    invoke-static {v4}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v23, v24

    move/from16 v35, v4

    goto/16 :goto_0

    :cond_15
    const-string v4, "\u06df\u06e7\u06df"

    move-object/from16 v23, v24

    :goto_f
    invoke-static {v4}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v35, v4

    goto/16 :goto_0

    :sswitch_1b
    move-object/from16 v0, p0

    iget v4, v0, Lgn;->a:I

    const/16 v24, 0x0

    const/16 v18, 0x0

    sget v16, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v34, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    move/from16 v0, v34

    mul-int/lit16 v0, v0, 0x12ad

    move/from16 v34, v0

    add-int v16, v16, v34

    if-gtz v16, :cond_16

    invoke-static {}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۟ۢۢ()I

    const-string v16, "\u06e8\u06e5"

    invoke-static/range {v16 .. v16}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v16

    move/from16 v34, v4

    move/from16 v35, v16

    goto/16 :goto_0

    :cond_16
    sget v16, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v34, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    div-int v16, v16, v34

    const v34, 0x1abea9

    add-int v16, v16, v34

    move/from16 v34, v4

    move/from16 v35, v16

    goto/16 :goto_0

    :sswitch_1c
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v16

    const/16 v26, 0x0

    const/16 v27, 0x0

    sget v4, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    if-gtz v4, :cond_17

    invoke-static {}, Lio/fastkv/ۣ۟ۧۦۡ;->ۥۥۤۥ()I

    const-string v4, "\u06df\u06e1\u06e7"

    invoke-static {v4}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v25, v16

    move/from16 v35, v4

    goto/16 :goto_0

    :cond_17
    const-string v4, "\u06e2\u06e8\u06e4"

    :goto_10
    invoke-static {v4}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v25, v16

    move/from16 v35, v4

    goto/16 :goto_0

    :sswitch_1d
    sget v4, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v16, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    move/from16 v0, v16

    add-int/lit16 v0, v0, -0xb76

    move/from16 v16, v0

    rem-int v4, v4, v16

    if-gtz v4, :cond_18

    const-string v16, "\u06e8\u06e0\u06e0"

    move-object v4, v12

    goto/16 :goto_1

    :cond_18
    sget v4, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v16, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    rem-int v4, v4, v16

    const v16, 0x1aa7ab

    xor-int v4, v4, v16

    move/from16 v35, v4

    goto/16 :goto_0

    :pswitch_2
    :sswitch_1e
    sget v4, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v16, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    or-int v4, v4, v16

    const v16, 0x1ab321

    add-int v4, v4, v16

    move/from16 v35, v4

    goto/16 :goto_0

    :sswitch_1f
    move-object v4, v14

    :cond_19
    const-string v16, "\u06e5\u06e0\u06e7"

    move-object v14, v4

    goto/16 :goto_8

    :sswitch_20
    packed-switch v34, :pswitch_data_0

    :sswitch_21
    sget v4, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v16, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    move/from16 v0, v16

    rem-int/lit16 v0, v0, 0x15ad

    move/from16 v16, v0

    xor-int v4, v4, v16

    if-gtz v4, :cond_1a

    const/16 v4, 0x9

    sput v4, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    const-string v4, "\u06e0\u06e6\u06df"

    goto/16 :goto_b

    :cond_1a
    sget v4, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v16, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    rem-int v4, v4, v16

    const v16, 0x1aaa13

    add-int v4, v4, v16

    move/from16 v35, v4

    goto/16 :goto_0

    :sswitch_22
    sget v4, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v16, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    move/from16 v0, v16

    rem-int/lit16 v0, v0, 0x110

    move/from16 v16, v0

    rem-int v4, v4, v16

    if-gtz v4, :cond_1b

    const-string v4, "\u06e5\u06df\u06e7"

    invoke-static {v4}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v35, v4

    goto/16 :goto_0

    :cond_1b
    const-string v4, "\u06e1\u06e7\u06e6"

    invoke-static {v4}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v35, v4

    goto/16 :goto_0

    :cond_1c
    :sswitch_23
    const-string v4, "\u06e4\u06e1\u06e4"

    goto/16 :goto_6

    :sswitch_24
    sget v4, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v16, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    move/from16 v0, v16

    div-int/lit16 v0, v0, -0x18f0

    move/from16 v16, v0

    xor-int v4, v4, v16

    if-ltz v4, :cond_1d

    invoke-static {}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۤ۟۠ۢ()I

    const-string v4, "\u06e3\u06e8\u06e2"

    :goto_11
    invoke-static {v4}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v35, v4

    goto/16 :goto_0

    :cond_1d
    const-string v4, "\u06e7\u06e5\u06e1"

    move-object/from16 v16, v4

    goto/16 :goto_8

    :sswitch_25
    invoke-static {}, Ljb;->b0()V

    sget v4, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    if-gtz v4, :cond_1e

    const/16 v4, 0x5e

    sput v4, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    const-string v4, "\u06e3\u06e8\u06e5"

    invoke-static {v4}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v35, v4

    goto/16 :goto_0

    :cond_1e
    const-string v4, "\u06e5\u06e2\u06e2"

    :goto_12
    invoke-static {v4}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v35, v4

    goto/16 :goto_0

    :catchall_1
    move-exception v4

    sget v4, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v16, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    move/from16 v0, v16

    add-int/lit16 v0, v0, 0x749

    move/from16 v16, v0

    mul-int v4, v4, v16

    if-gtz v4, :cond_1f

    const/16 v4, 0x3a

    sput v4, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    const-string v4, "\u06e1\u06e7\u06e6"

    invoke-static {v4}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v35, v4

    goto/16 :goto_0

    :cond_1f
    const-string v4, "\u06e6\u06e4\u06e3"

    :goto_13
    invoke-static {v4}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v35, v4

    goto/16 :goto_0

    :sswitch_26
    :try_start_4
    const-string v4, "Yw5R0Tm9MO15AHbdK4cc7WMGQNw=\n"

    const-string v16, "DWEluF/EdIw=\n"

    move-object/from16 v0, v16

    invoke-static {v4, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/16 v16, 0x0

    move/from16 v0, v16

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v16, v0

    move-object/from16 v0, v16

    invoke-static {v7, v4, v0}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    sget v4, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v16, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    move/from16 v0, v16

    xor-int/lit16 v0, v0, 0x1f5d

    move/from16 v16, v0

    rem-int v4, v4, v16

    if-gtz v4, :cond_20

    invoke-static {}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟۠ۢۧۡ()I

    const-string v4, "\u06e2\u06e8\u06e3"

    invoke-static {v4}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v35, v4

    goto/16 :goto_0

    :cond_20
    const-string v4, "\u06df\u06e2\u06e5"

    goto/16 :goto_11

    :sswitch_27
    :try_start_5
    instance-of v4, v5, Landroid/widget/BaseAdapter;

    if-eqz v4, :cond_1c

    move-object v0, v5

    check-cast v0, Landroid/widget/BaseAdapter;

    move-object v4, v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    sget v16, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    if-ltz v16, :cond_21

    invoke-static {}, Landroid/window/ۣۧ۟۠;->ۣۡ۟ۢ()I

    const-string v16, "\u06e8\u06e3\u06e0"

    invoke-static/range {v16 .. v16}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v16

    move-object/from16 v32, v4

    move/from16 v35, v16

    goto/16 :goto_0

    :cond_21
    const-string v16, "\u06e6\u06e4\u06e2"

    invoke-static/range {v16 .. v16}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v16

    move-object/from16 v32, v4

    move/from16 v35, v16

    goto/16 :goto_0

    :cond_22
    :sswitch_28
    sget v4, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v16, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    mul-int v4, v4, v16

    const v16, 0x19c271

    add-int v4, v4, v16

    move/from16 v35, v4

    goto/16 :goto_0

    :sswitch_29
    :try_start_6
    instance-of v4, v6, Landroid/widget/BaseAdapter;

    if-eqz v4, :cond_25

    move-object v0, v6

    check-cast v0, Landroid/widget/BaseAdapter;

    move-object v4, v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    const-string v16, "\u06e1\u06e2\u06e2"

    invoke-static/range {v16 .. v16}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v16

    move-object/from16 v33, v4

    move/from16 v35, v16

    goto/16 :goto_0

    :cond_23
    :sswitch_2a
    invoke-static {}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣۤۧۥ()I

    move-result v4

    if-gtz v4, :cond_24

    invoke-static {}, Lkotlinx/coroutines/ۤۢۢۥ;->ۡ۠ۥۡ()I

    const-string v4, "\u06e1\u06e1\u06e2"

    goto/16 :goto_7

    :cond_24
    const-string v4, "\u06e3\u06e7\u06e8"

    goto/16 :goto_2

    :sswitch_2b
    move/from16 v0, v27

    move/from16 v1, v25

    if-ge v0, v1, :cond_5

    move/from16 v0, v27

    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    sget v4, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    xor-int/lit16 v4, v4, -0x3b8

    add-int v21, v27, v4

    sget v4, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    move/from16 v16, v4

    move/from16 v22, v21

    :goto_14
    const-string v4, "\u06e2\u06e7\u06e4"

    move/from16 v21, v16

    goto/16 :goto_f

    :sswitch_2c
    sget v4, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v16, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    xor-int v4, v4, v16

    const v16, 0x1abbfa

    xor-int v4, v4, v16

    move-object/from16 v17, v32

    move/from16 v35, v4

    goto/16 :goto_0

    :cond_25
    :sswitch_2d
    const-string v4, "\u06e8\u06e4\u06e7"

    goto/16 :goto_2

    :sswitch_2e
    const/16 v19, 0x0

    invoke-static {}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۤ۟۠ۢ()I

    move-result v4

    if-gtz v4, :cond_26

    const-string v4, "\u06e4\u06e1\u06e4"

    goto/16 :goto_12

    :cond_26
    const-string v4, "\u06e1\u06e2\u06e3"

    invoke-static {v4}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v35, v4

    goto/16 :goto_0

    :sswitch_2f
    :try_start_7
    move-object v0, v7

    check-cast v0, Landroid/widget/BaseAdapter;

    move-object v4, v0

    invoke-virtual {v4}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    sget v4, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v16, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    move/from16 v0, v16

    add-int/lit16 v0, v0, 0x1699

    move/from16 v16, v0

    or-int v4, v4, v16

    if-ltz v4, :cond_27

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->۟ۥۣۥۦ()I

    const-string v4, "\u06e5\u06e2\u06e0"

    goto/16 :goto_13

    :cond_27
    sget v4, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v16, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    rem-int v4, v4, v16

    const v16, 0x1ab2bb

    add-int v4, v4, v16

    move/from16 v35, v4

    goto/16 :goto_0

    :sswitch_30
    if-ltz v36, :cond_4

    move-object v4, v8

    check-cast v4, Lrb0;

    sget-object v29, Lkn;->a:Lkn;

    const-string v16, "hItYTl05+jaOgEJ0ZzbgLYKxUmVBO+s=\n"

    const-string v28, "7+4hEThXjkQ=\n"

    move-object/from16 v0, v16

    move-object/from16 v1, v28

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    invoke-static {}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->۟ۢ۟ۥۣ()I

    move-result v28

    if-ltz v28, :cond_28

    invoke-static {}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۧۧۥۦ()I

    const-string v28, "\u06e0\u06e1\u06e3"

    invoke-static/range {v28 .. v28}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v35

    move-object/from16 v28, v16

    move-object/from16 v31, v4

    goto/16 :goto_0

    :cond_28
    const-string v28, "\u06df\u06e4\u06e5"

    invoke-static/range {v28 .. v28}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v35

    move-object/from16 v28, v16

    move-object/from16 v31, v4

    goto/16 :goto_0

    :sswitch_31
    new-instance v4, Lqb0;

    move-object/from16 v0, v31

    move/from16 v1, v20

    invoke-direct {v4, v0, v1}, Lqb0;-><init>(Lrb0;Z)V

    invoke-virtual {v9, v4, v10, v11}, Landroid/view/View;->postOnAnimationDelayed(Ljava/lang/Runnable;J)V

    move/from16 v0, v21

    xor-int/lit16 v4, v0, -0x12c

    add-int v16, v36, v4

    invoke-static {}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۧۡۥ۟()I

    move-result v4

    if-gtz v4, :cond_29

    const-string v4, "\u06e4\u06e5\u06e8"

    invoke-static {v4}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v35, v4

    move/from16 v27, v22

    move/from16 v36, v16

    goto/16 :goto_0

    :cond_29
    sget v4, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v27, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    div-int v4, v4, v27

    const v27, 0x1ab9e9

    add-int v4, v4, v27

    move/from16 v35, v4

    move/from16 v27, v22

    move/from16 v36, v16

    goto/16 :goto_0

    :sswitch_32
    sget v4, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v16, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sub-int v4, v4, v16

    const v16, 0xdec1

    add-int v4, v4, v16

    move/from16 v35, v4

    goto/16 :goto_0

    :sswitch_33
    invoke-static {}, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢ۠ۨۦ()I

    move-result v4

    if-ltz v4, :cond_2a

    const/4 v4, 0x2

    sput v4, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    const-string v4, "\u06e2\u06e0\u06e6"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v23, v33

    move/from16 v35, v4

    goto/16 :goto_0

    :cond_2a
    sget v4, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v16, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    div-int v4, v4, v16

    const v16, 0x1ac96b

    add-int v4, v4, v16

    move-object/from16 v23, v33

    move/from16 v35, v4

    goto/16 :goto_0

    :sswitch_34
    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    move-object/from16 v0, v30

    invoke-virtual {v4, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v4, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    if-gtz v4, :cond_2b

    const/16 v4, 0x42

    sput v4, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    const-string v4, "\u06e5\u06e7\u06e3"

    invoke-static {v4}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v35, v4

    goto/16 :goto_0

    :cond_2b
    const-string v4, "\u06e8\u06e5"

    invoke-static {v4}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v35, v4

    goto/16 :goto_0

    :pswitch_3
    :sswitch_35
    sget v4, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v16, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    move/from16 v0, v16

    xor-int/lit16 v0, v0, -0x180b

    move/from16 v16, v0

    sub-int v4, v4, v16

    if-gtz v4, :cond_2c

    const/16 v4, 0x25

    sput v4, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    const-string v4, "\u06df\u06e0\u06e2"

    invoke-static {v4}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v35, v4

    goto/16 :goto_0

    :cond_2c
    const-string v4, "\u06e4\u06df"

    goto/16 :goto_e

    :sswitch_36
    :try_start_8
    invoke-virtual/range {v17 .. v17}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    sget v4, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v16, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    mul-int v4, v4, v16

    const v16, 0x1bf22d

    xor-int v4, v4, v16

    move/from16 v35, v4

    goto/16 :goto_0

    :catchall_2
    move-exception v4

    sget v4, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    if-ltz v4, :cond_2d

    const/16 v4, 0x3f

    sput v4, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    const-string v4, "\u06e2\u06e0\u06df"

    invoke-static {v4}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v35, v4

    goto/16 :goto_0

    :cond_2d
    sget v4, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v16, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    add-int v4, v4, v16

    const v16, 0x1ac0d8

    xor-int v4, v4, v16

    move/from16 v35, v4

    goto/16 :goto_0

    :sswitch_37
    new-instance v15, Landroid/content/Intent;

    sget-object v4, Lkn;->l:Ljava/lang/String;

    invoke-direct {v15, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    sget-object v4, Lkn;->d:Ljava/lang/String;

    invoke-virtual {v15, v4}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    sget-object v4, Lkn;->b:Landroid/app/Application;

    if-eqz v4, :cond_19

    sget v14, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    if-gtz v14, :cond_2e

    invoke-static {}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۧۧ()I

    move-object v14, v4

    move/from16 v16, v21

    goto/16 :goto_14

    :cond_2e
    const-string v14, "\u06e4\u06e3\u06e3"

    move-object/from16 v16, v14

    :goto_15
    invoke-static/range {v16 .. v16}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v16

    move-object v14, v4

    move/from16 v35, v16

    goto/16 :goto_0

    :sswitch_38
    invoke-static {}, Landroidx/core/content/ۣۧۡۤ;->۟ۦۦ۠ۡ()I

    move-result v4

    if-ltz v4, :cond_2f

    const/16 v4, 0x40

    sput v4, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    const-string v4, "\u06e0\u06df\u06e8"

    goto/16 :goto_6

    :cond_2f
    sget v4, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v16, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    or-int v4, v4, v16

    const v16, 0x1aa824

    add-int v4, v4, v16

    move/from16 v35, v4

    goto/16 :goto_0

    :sswitch_39
    :try_start_9
    instance-of v4, v7, Landroid/widget/BaseAdapter;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    if-eqz v4, :cond_37

    sget v4, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    if-gtz v4, :cond_30

    const-string v4, "\u06df\u06e6\u06df"

    move/from16 v16, v25

    goto/16 :goto_10

    :cond_30
    const-string v4, "\u06e2\u06e8\u06e3"

    move/from16 v16, v20

    goto/16 :goto_a

    :sswitch_3a
    if-eqz v7, :cond_13

    sget v4, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v16, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    move/from16 v0, v16

    xor-int/lit16 v0, v0, 0x22d5

    move/from16 v16, v0

    or-int v4, v4, v16

    if-ltz v4, :cond_31

    const-string v4, "\u06e3\u06df\u06e0"

    goto/16 :goto_3

    :cond_31
    sget v4, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v16, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    rem-int v4, v4, v16

    const v16, 0x1ac501

    add-int v4, v4, v16

    move/from16 v35, v4

    goto/16 :goto_0

    :sswitch_3b
    if-eqz v23, :cond_33

    sget v4, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v16, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    move/from16 v0, v16

    or-int/lit16 v0, v0, -0x1ab4

    move/from16 v16, v0

    div-int v4, v4, v16

    if-eqz v4, :cond_32

    invoke-static {}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣۢ۠۠()I

    const-string v4, "\u06e8\u06e7\u06e8"

    invoke-static {v4}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v35, v4

    goto/16 :goto_0

    :cond_32
    sget v4, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v16, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    rem-int v4, v4, v16

    const v16, 0x1ac3cc

    add-int v4, v4, v16

    move/from16 v35, v4

    goto/16 :goto_0

    :cond_33
    :sswitch_3c
    sget v4, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v16, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    move/from16 v0, v16

    rem-int/lit16 v0, v0, -0x1e02

    move/from16 v16, v0

    div-int v4, v4, v16

    if-ltz v4, :cond_34

    const-string v16, "\u06e8\u06e3\u06e6"

    move-object v4, v14

    goto/16 :goto_15

    :cond_34
    sget v4, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sget v16, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    rem-int v4, v4, v16

    const v16, 0x1ac14c

    add-int v4, v4, v16

    move/from16 v35, v4

    goto/16 :goto_0

    :sswitch_3d
    if-eqz v17, :cond_22

    invoke-static {}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۧۧۥۦ()I

    move-result v4

    if-ltz v4, :cond_36

    invoke-static {}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣۤۧۥ()I

    :cond_35
    const-string v4, "\u06e7\u06e5\u06e1"

    invoke-static {v4}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v35, v4

    goto/16 :goto_0

    :cond_36
    sget v4, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v16, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    add-int v4, v4, v16

    const v16, 0x1aa973

    xor-int v4, v4, v16

    move/from16 v35, v4

    goto/16 :goto_0

    :cond_37
    :sswitch_3e
    sget v4, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v16, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    move/from16 v0, v16

    xor-int/lit16 v0, v0, -0x19e2

    move/from16 v16, v0

    add-int v4, v4, v16

    if-gtz v4, :cond_38

    invoke-static {}, Landroidx/activity/result/۟ۡۧ۠ۥ;->۟ۥۥۧ۟()I

    const-string v4, "\u06e7\u06e3"

    goto/16 :goto_c

    :cond_38
    const-string v4, "\u06e4\u06e1\u06df"

    goto/16 :goto_d

    :sswitch_3f
    return-void

    :sswitch_40
    move-object v4, v12

    goto/16 :goto_9

    :sswitch_data_0
    .sparse-switch
        0xdc64 -> :sswitch_0
        0xdc7b -> :sswitch_37
        0xdc9c -> :sswitch_5
        0xdcfd -> :sswitch_3f
        0x1aa745 -> :sswitch_14
        0x1aa762 -> :sswitch_17
        0x1aa77b -> :sswitch_2b
        0x1aa79d -> :sswitch_3f
        0x1aa7a0 -> :sswitch_13
        0x1aa7c1 -> :sswitch_9
        0x1aa7d8 -> :sswitch_27
        0x1aa7f7 -> :sswitch_29
        0x1aa81a -> :sswitch_1f
        0x1aaaff -> :sswitch_a
        0x1aab02 -> :sswitch_1d
        0x1aab60 -> :sswitch_3
        0x1aabbe -> :sswitch_36
        0x1aaee1 -> :sswitch_33
        0x1aaee2 -> :sswitch_12
        0x1aaee3 -> :sswitch_38
        0x1aaee7 -> :sswitch_31
        0x1aaf80 -> :sswitch_38
        0x1ab246 -> :sswitch_35
        0x1ab261 -> :sswitch_34
        0x1ab268 -> :sswitch_2
        0x1ab2df -> :sswitch_15
        0x1ab2e4 -> :sswitch_1a
        0x1ab33f -> :sswitch_30
        0x1ab35d -> :sswitch_2f
        0x1ab35e -> :sswitch_10
        0x1ab362 -> :sswitch_2d
        0x1ab604 -> :sswitch_1e
        0x1ab62a -> :sswitch_28
        0x1ab6e2 -> :sswitch_22
        0x1ab704 -> :sswitch_2e
        0x1ab720 -> :sswitch_7
        0x1ab9e9 -> :sswitch_32
        0x1aba02 -> :sswitch_3a
        0x1aba07 -> :sswitch_3d
        0x1aba44 -> :sswitch_f
        0x1aba46 -> :sswitch_24
        0x1aba60 -> :sswitch_c
        0x1aba87 -> :sswitch_25
        0x1abd85 -> :sswitch_16
        0x1abd8d -> :sswitch_40
        0x1abdac -> :sswitch_3f
        0x1abde3 -> :sswitch_2a
        0x1abde5 -> :sswitch_4
        0x1abde9 -> :sswitch_6
        0x1abe04 -> :sswitch_11
        0x1abe81 -> :sswitch_5
        0x1abe83 -> :sswitch_e
        0x1abea4 -> :sswitch_20
        0x1ac146 -> :sswitch_3c
        0x1ac186 -> :sswitch_23
        0x1ac1ab -> :sswitch_39
        0x1ac1c9 -> :sswitch_3f
        0x1ac1e4 -> :sswitch_2c
        0x1ac1e5 -> :sswitch_28
        0x1ac200 -> :sswitch_21
        0x1ac54d -> :sswitch_26
        0x1ac569 -> :sswitch_19
        0x1ac585 -> :sswitch_3e
        0x1ac589 -> :sswitch_3f
        0x1ac5a2 -> :sswitch_b
        0x1ac5c3 -> :sswitch_1
        0x1ac603 -> :sswitch_1c
        0x1ac61f -> :sswitch_1b
        0x1ac620 -> :sswitch_18
        0x1ac8ee -> :sswitch_3c
        0x1ac92d -> :sswitch_18
        0x1ac945 -> :sswitch_8
        0x1ac96b -> :sswitch_3b
        0x1ac96c -> :sswitch_18
        0x1ac9c9 -> :sswitch_d
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
