.class public final synthetic Lks;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:I

.field public final b:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;I)V
    .locals 3

    iput p2, p0, Lks;->a:I

    iput-object p1, p0, Lks;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e8\u06e2\u06e0"

    invoke-static {v1}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    const-string v0, "\u06e1\u06df\u06e3"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    :sswitch_1
    sget v0, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v2, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    mul-int/lit16 v2, v2, 0x2269

    sub-int/2addr v0, v2

    if-ltz v0, :cond_1

    const-string v0, "\u06e0\u06e7\u06e1"

    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    sget v0, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v2, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    rem-int/2addr v0, v2

    const v2, 0x1ab04a

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_2
    const-string v0, "aevuKTk"

    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۡۧ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget v1, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v2, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    add-int/lit16 v2, v2, -0x9d0

    rem-int/2addr v1, v2

    if-ltz v1, :cond_2

    const/16 v1, 0x3b

    sput v1, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    const-string v1, "\u06e2\u06e6\u06e8"

    invoke-static {v1}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :cond_2
    sget v1, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v2, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sub-int/2addr v1, v2

    const v2, 0xdb67

    xor-int/2addr v2, v1

    move-object v1, v0

    goto :goto_0

    :sswitch_3
    sget v0, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v2, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    or-int/2addr v0, v2

    const v2, -0x1ac938

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_4
    invoke-static {}, Lۤۤۥۤ;->۟ۤ۠()I

    move-result v0

    if-gtz v0, :cond_0

    sget v0, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    if-ltz v0, :cond_3

    invoke-static {}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦۥۣۥ()I

    const-string v0, "\u06e1\u06df\u06e3"

    goto :goto_1

    :cond_3
    sget v0, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    or-int/2addr v0, v2

    const v2, -0x1aa842

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc61 -> :sswitch_0
        0x1aaac1 -> :sswitch_2
        0x1aae85 -> :sswitch_5
        0x1ab324 -> :sswitch_1
        0x1abe40 -> :sswitch_3
        0x1ac926 -> :sswitch_4
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 26

    const/16 v18, 0x0

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/16 v16, 0x0

    const/4 v15, 0x0

    const/4 v6, 0x0

    const/16 v17, 0x0

    const/4 v10, 0x0

    const/16 v19, 0x0

    const/4 v8, 0x0

    const/4 v12, 0x0

    const/4 v11, 0x0

    const/4 v5, 0x0

    const-wide/16 v22, 0x0

    const-string v14, "\u06e5\u06df"

    invoke-static {v14}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v20

    move-object v14, v4

    :goto_0
    sparse-switch v20, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    packed-switch v18, :pswitch_data_0

    :sswitch_1
    sget v4, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    if-ltz v4, :cond_18

    const/16 v4, 0x42

    sput v4, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    const-string v4, "\u06e6\u06e6\u06e0"

    :goto_1
    invoke-static {v4}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto :goto_0

    :sswitch_2
    sget v4, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v20, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    move/from16 v0, v20

    add-int/lit16 v0, v0, 0xb98

    move/from16 v20, v0

    div-int v4, v4, v20

    if-eqz v4, :cond_0

    :goto_2
    const-string v4, "\u06e4\u06e1\u06e3"

    invoke-static {v4}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto :goto_0

    :cond_0
    sget v4, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v20, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sub-int v4, v4, v20

    const v20, 0xdf11

    add-int v4, v4, v20

    move/from16 v20, v4

    goto :goto_0

    :sswitch_3
    :try_start_0
    iget v4, v10, Landroid/view/WindowManager$LayoutParams;->flags:I

    sget v20, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    move/from16 v0, v20

    xor-int/lit16 v0, v0, 0x244

    move/from16 v20, v0

    and-int v4, v4, v20

    sget v20, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    move/from16 v0, v20

    xor-int/lit16 v0, v0, -0x1fd

    move/from16 v20, v0

    or-int v4, v4, v20

    iput v4, v10, Landroid/view/WindowManager$LayoutParams;->flags:I

    move/from16 v0, v19

    int-to-float v4, v0

    const/high16 v20, 0x42c80000    # 100.0f

    div-float v4, v4, v20

    sget v8, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    xor-int/lit16 v8, v8, 0x8a

    int-to-float v8, v8

    mul-float/2addr v4, v8

    float-to-int v8, v4

    invoke-static {}, L۟ۤۧۦۢ;->ۣ۟۟ۢ۟()I

    move-result v4

    if-ltz v4, :cond_26

    const-string v4, "\u06e7\u06e4\u06e2"

    :goto_3
    invoke-static {v4}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto :goto_0

    :sswitch_4
    invoke-virtual {v14}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v4

    if-nez v4, :cond_1

    sget v4, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v20, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    div-int v4, v4, v20

    const v20, 0x1ab2bf

    xor-int v4, v4, v20

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_1
    :sswitch_5
    const-string v4, "\u06e7\u06e7\u06e2"

    invoke-static {v4}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_6
    :try_start_1
    move-object v0, v5

    check-cast v0, Landroid/view/WindowManager;

    move-object v4, v0

    invoke-interface {v4, v15, v10}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sget v4, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v20, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    add-int v4, v4, v20

    const v20, 0x1ac3d4

    add-int v4, v4, v20

    move/from16 v20, v4

    goto/16 :goto_0

    :pswitch_0
    :sswitch_7
    sget v4, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v20, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    move/from16 v0, v20

    xor-int/lit16 v0, v0, 0x19de

    move/from16 v20, v0

    add-int v4, v4, v20

    if-ltz v4, :cond_2

    const-string v4, "\u06e7\u06e3\u06e1"

    invoke-static {v4}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_2
    const-string v4, "\u06e1\u06df\u06df"

    :goto_4
    invoke-static {v4}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_8
    sget-object v4, Lls;->a:Lls;

    invoke-static {v14}, Lls;->d(Landroid/view/View;)V

    sget v4, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    if-ltz v4, :cond_3

    const/16 v4, 0x4b

    sput v4, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    const-string v4, "\u06e8\u06e8\u06e4"

    invoke-static {v4}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u06df\u06e8"

    goto :goto_3

    :sswitch_9
    invoke-static {}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۥۥۢۧ()I

    move-result v4

    if-ltz v4, :cond_4

    const/16 v4, 0x13

    sput v4, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    const-string v4, "\u06e1\u06e3\u06e4"

    invoke-static {v4}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v10, v17

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_4
    sget v4, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v10, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    xor-int/2addr v4, v10

    const v10, 0x1ac642

    add-int/2addr v4, v10

    move-object/from16 v10, v17

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_a
    const/4 v4, 0x0

    :try_start_2
    iput v4, v10, Landroid/view/WindowManager$LayoutParams;->dimAmount:F

    invoke-virtual {v14}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const-string v20, "Ksnq7hYi\n"

    const-string v21, "XaCEinlV93o=\n"

    invoke-static/range {v20 .. v21}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-virtual {v4, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v5

    const-string v4, "\u06e8\u06e4\u06e6"

    :goto_5
    invoke-static {v4}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_b
    if-nez v15, :cond_10

    sget v4, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    if-gtz v4, :cond_5

    const/16 v4, 0x15

    sput v4, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    const-string v4, "\u06e6\u06e2\u06e8"

    :goto_6
    invoke-static {v4}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06e8\u06e1\u06e8"

    :goto_7
    invoke-static {v4}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_c
    move-object/from16 v0, p0

    iget v4, v0, Lks;->a:I

    const/4 v13, 0x1

    const/4 v9, 0x0

    sget v18, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v20, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    move/from16 v0, v20

    add-int/lit16 v0, v0, -0x54c

    move/from16 v20, v0

    mul-int v18, v18, v20

    if-ltz v18, :cond_6

    const-string v18, "\u06e1\u06e2\u06e2"

    invoke-static/range {v18 .. v18}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v20

    move/from16 v18, v4

    goto/16 :goto_0

    :cond_6
    const-string v18, "\u06e3\u06df\u06e2"

    invoke-static/range {v18 .. v18}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v20

    move/from16 v18, v4

    goto/16 :goto_0

    :sswitch_d
    sget v4, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v10, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    mul-int/lit16 v10, v10, -0x2cb

    mul-int/2addr v4, v10

    if-gtz v4, :cond_7

    const/4 v4, 0x3

    sput v4, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    move-object v4, v9

    :goto_8
    const-string v10, "\u06e5\u06e6\u06e5"

    invoke-static {v10}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v20

    move-object v10, v4

    goto/16 :goto_0

    :cond_7
    sget v4, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v10, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    rem-int/2addr v4, v10

    const v10, 0x1aac89

    add-int/2addr v4, v10

    move-object v10, v9

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_e
    :try_start_3
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    sget v4, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v20, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    mul-int v4, v4, v20

    const v20, 0x19a9d5

    add-int v4, v4, v20

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_f
    const-string v4, "\u06e6\u06e0\u06e1"

    invoke-static {v4}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_10
    sget v4, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v20, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    move/from16 v0, v20

    xor-int/lit16 v0, v0, 0x8e9

    move/from16 v20, v0

    or-int v4, v4, v20

    if-ltz v4, :cond_8

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۢ۠۟ۨ()I

    const-string v4, "\u06e5\u06e4\u06e1"

    goto/16 :goto_4

    :cond_8
    const-string v4, "\u06e6\u06e2\u06e8"

    invoke-static {v4}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_11
    :try_start_4
    instance-of v4, v6, Landroid/view/WindowManager$LayoutParams;

    if-eqz v4, :cond_14

    move-object v0, v6

    check-cast v0, Landroid/view/WindowManager$LayoutParams;

    move-object v4, v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    sget v17, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    if-gtz v17, :cond_9

    const-string v17, "\u06e6\u06e7\u06e7"

    invoke-static/range {v17 .. v17}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v20

    move-object/from16 v17, v4

    goto/16 :goto_0

    :cond_9
    sget v17, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v20, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    div-int v17, v17, v20

    const v20, -0x1abae1

    xor-int v20, v20, v17

    move-object/from16 v17, v4

    goto/16 :goto_0

    :sswitch_12
    :try_start_5
    const-string v4, "pJCOA2hdP0m/qpUwbUAQU6E=\n"

    const-string v20, "z/X3XBgyTzw=\n"

    move-object/from16 v0, v20

    invoke-static {v4, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-result-object v4

    sget v16, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v20, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    move/from16 v0, v20

    xor-int/lit16 v0, v0, -0x12df

    move/from16 v20, v0

    xor-int v16, v16, v20

    if-gtz v16, :cond_a

    const/16 v16, 0x62

    sput v16, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    const-string v16, "\u06e6\u06e0\u06e6"

    invoke-static/range {v16 .. v16}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v20

    move-object/from16 v16, v4

    goto/16 :goto_0

    :cond_a
    sget v16, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v20, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    add-int v16, v16, v20

    const v20, 0x1ab6fb

    add-int v20, v20, v16

    move-object/from16 v16, v4

    goto/16 :goto_0

    :sswitch_13
    sget-object v4, Lls;->a:Lls;

    invoke-static {v14}, Lls;->d(Landroid/view/View;)V

    sget v4, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v20, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    move/from16 v0, v20

    xor-int/lit16 v0, v0, -0x1ee4

    move/from16 v20, v0

    xor-int v4, v4, v20

    if-ltz v4, :cond_b

    invoke-static {}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣۤۧۥ()I

    const-string v4, "\u06e7\u06e0\u06e8"

    :goto_9
    invoke-static {v4}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06e0\u06e0\u06e3"

    :goto_a
    invoke-static {v4}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_14
    sget v4, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v12, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    add-int/lit16 v12, v12, 0x153e

    add-int/2addr v4, v12

    if-gtz v4, :cond_c

    invoke-static {}, Landroidx/startup/ۣۣۡ۟;->۠ۢۢۧ()I

    const-string v4, "\u06e6\u06df\u06e0"

    move v12, v8

    :goto_b
    invoke-static {v4}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_c
    sget v4, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sget v12, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    xor-int/2addr v4, v12

    const v12, 0x1ac5d2

    xor-int/2addr v4, v12

    move/from16 v20, v4

    move v12, v8

    goto/16 :goto_0

    :sswitch_15
    const-string v4, "\u06e6\u06e0\u06e1"

    move v11, v12

    goto :goto_9

    :sswitch_16
    const/4 v4, 0x0

    const/16 v20, 0x0

    move-object/from16 v0, v20

    invoke-virtual {v14, v4, v0}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    invoke-static {}, Lcom/google/android/material/datepicker/ۨۧۤ;->۠ۤ۠ۧ()I

    move-result v4

    if-ltz v4, :cond_1a

    const-string v4, "6t6koIX"

    invoke-static {v4}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->ۣۢۤ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v22

    sget v4, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v20, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    move/from16 v0, v20

    xor-int/lit16 v0, v0, -0x19ea

    move/from16 v20, v0

    add-int v4, v4, v20

    if-gtz v4, :cond_d

    invoke-static {}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۢۧۥ()I

    const-string v4, "\u06e6\u06e7\u06e3"

    invoke-static {v4}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_d
    sget v4, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v20, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    div-int v4, v4, v20

    const v20, 0x1ababf

    add-int v4, v4, v20

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_17
    invoke-static {}, Lio/fastkv/ۣ۟ۧۦۡ;->ۥۥۤۥ()I

    move-result v4

    if-ltz v4, :cond_e

    const-string v4, "\u06e3\u06e7"

    :goto_c
    invoke-static {v4}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_e
    sget v4, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v20, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    or-int v4, v4, v20

    const v20, 0xdaaf

    add-int v4, v4, v20

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_18
    const/4 v4, 0x1

    if-ge v8, v4, :cond_1f

    invoke-static {}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۨۧ۟ۤ()I

    move-result v4

    if-ltz v4, :cond_f

    const/16 v4, 0x2a

    sput v4, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    const-string v4, "\u06e7\u06e7\u06e2"

    move v11, v13

    goto/16 :goto_7

    :cond_f
    const-string v4, "\u06e2\u06e5\u06df"

    move v11, v13

    :goto_d
    invoke-static {v4}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :pswitch_1
    :sswitch_19
    const-string v4, "\u06e6\u06e7\u06e3"

    goto/16 :goto_4

    :cond_10
    :sswitch_1a
    sget v4, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    if-gtz v4, :cond_11

    invoke-static {}, Landroid/window/ۦۣۦۥ;->ۡۥۥۥ()I

    const-string v4, "\u06e3\u06e4\u06e7"

    invoke-static {v4}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_11
    const-string v4, "\u06e6\u06e0\u06e6"

    goto :goto_c

    :sswitch_1b
    invoke-static {}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۢۧۥ()I

    move-result v4

    if-ltz v4, :cond_12

    const-string v4, "\u06e6\u06e0\u06e2"

    invoke-static {v4}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_12
    const-string v4, "\u06e2\u06e5\u06e3"

    :goto_e
    invoke-static {v4}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_1c
    :try_start_6
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v20, 0x1f

    move/from16 v0, v20

    if-lt v4, v0, :cond_24

    invoke-virtual {v14}, Landroid/view/View;->getRootView()Landroid/view/View;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move-result-object v4

    sget v15, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v20, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    move/from16 v0, v20

    xor-int/lit16 v0, v0, -0x18e1

    move/from16 v20, v0

    or-int v15, v15, v20

    if-ltz v15, :cond_13

    const-string v15, "\u06e1\u06e5\u06e5"

    invoke-static {v15}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v20

    move-object v15, v4

    goto/16 :goto_0

    :cond_13
    sget v15, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v20, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sub-int v15, v15, v20

    const v20, -0x1ab2ec

    xor-int v20, v20, v15

    move-object v15, v4

    goto/16 :goto_0

    :cond_14
    :sswitch_1d
    sget v4, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v20, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    move/from16 v0, v20

    add-int/lit16 v0, v0, -0x1569

    move/from16 v20, v0

    xor-int v4, v4, v20

    if-gtz v4, :cond_15

    const/16 v4, 0xf

    sput v4, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    const-string v4, "\u06df\u06e3\u06e4"

    :goto_f
    invoke-static {v4}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_15
    const-string v4, "\u06e7\u06df\u06e8"

    goto :goto_f

    :sswitch_1e
    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    move-wide/from16 v0, v22

    invoke-virtual {v4, v0, v1}, Ljava/io/PrintStream;->println(D)V

    sget v4, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v20, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    move/from16 v0, v20

    rem-int/lit16 v0, v0, 0x3c3

    move/from16 v20, v0

    xor-int v4, v4, v20

    if-ltz v4, :cond_16

    const/16 v4, 0x3f

    sput v4, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    const-string v4, "\u06e2\u06e4\u06e2"

    invoke-static {v4}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_16
    sget v4, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v20, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    or-int v4, v4, v20

    const v20, -0x1ab220

    xor-int v4, v4, v20

    move/from16 v20, v4

    goto/16 :goto_0

    :pswitch_2
    :sswitch_1f
    sget v4, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v20, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    move/from16 v0, v20

    xor-int/lit16 v0, v0, -0x1b37

    move/from16 v20, v0

    or-int v4, v4, v20

    if-ltz v4, :cond_17

    const/16 v4, 0x31

    sput v4, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    const-string v4, "\u06e3\u06e7\u06e4"

    goto/16 :goto_e

    :cond_17
    sget v4, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v20, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    add-int v4, v4, v20

    const v20, 0x1aaf51

    xor-int v4, v4, v20

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_18
    const-string v4, "\u06df\u06e0\u06e4"

    goto/16 :goto_c

    :sswitch_20
    const-string v4, "\u06e4\u06e2\u06e1"

    goto/16 :goto_1

    :sswitch_21
    invoke-virtual {v14}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const-class v20, Landroid/view/inputmethod/InputMethodManager;

    move-object/from16 v0, v20

    invoke-static {v4, v0}, Lrd;->b(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/inputmethod/InputMethodManager;

    const/16 v20, 0x1

    move/from16 v0, v20

    invoke-virtual {v4, v14, v0}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    sget v4, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v20, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    move/from16 v0, v20

    add-int/lit16 v0, v0, 0x14a1

    move/from16 v20, v0

    or-int v4, v4, v20

    if-ltz v4, :cond_19

    invoke-static {}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣۢ۠۠()I

    const-string v4, "\u06e4\u06e2"

    invoke-static {v4}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_19
    sget v4, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v20, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    add-int v4, v4, v20

    const v20, 0x1ac29e

    add-int v4, v4, v20

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_1a
    :sswitch_22
    sget v4, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v20, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    move/from16 v0, v20

    add-int/lit16 v0, v0, 0x1cab

    move/from16 v20, v0

    rem-int v4, v4, v20

    if-ltz v4, :cond_1b

    const-string v4, "\u06e0\u06df"

    invoke-static {v4}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_1b
    const-string v4, "\u06e2\u06e2\u06df"

    invoke-static {v4}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :pswitch_3
    :sswitch_23
    sget v4, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    if-gtz v4, :cond_1c

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟ۧ۠ۧۢ()I

    const-string v4, "\u06df\u06e0\u06df"

    :goto_10
    invoke-static {v4}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_1c
    const-string v4, "\u06e6\u06e0\u06e2"

    goto :goto_10

    :pswitch_4
    :sswitch_24
    sget v4, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v20, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    move/from16 v0, v20

    xor-int/lit16 v0, v0, 0x19d

    move/from16 v20, v0

    mul-int v4, v4, v20

    if-gtz v4, :cond_1d

    const/16 v4, 0x4d

    sput v4, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    const-string v4, "\u06e2\u06e1\u06e6"

    :goto_11
    invoke-static {v4}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_1d
    const-string v4, "\u06e7\u06e8\u06e3"

    goto :goto_11

    :pswitch_5
    :sswitch_25
    sget v4, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v20, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    move/from16 v0, v20

    add-int/lit16 v0, v0, -0x1b79

    move/from16 v20, v0

    sub-int v4, v4, v20

    if-gtz v4, :cond_1e

    const/16 v4, 0x8

    sput v4, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    const-string v4, "\u06df\u06e7\u06e6"

    goto/16 :goto_d

    :cond_1e
    const-string v4, "\u06e3\u06e6\u06e3"

    goto :goto_10

    :cond_1f
    :sswitch_26
    const-string v4, "\u06e7\u06e4\u06e2"

    invoke-static {v4}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :catchall_0
    move-exception v4

    const-string v4, "06ke\n"

    const-string v20, "p8h5VTpLcuY=\n"

    const-string v21, "i468EMbrsu6yj6k69MKp+4uOvBDG+bXnv467\n"

    const-string v24, "2+HMZbau3Ik=\n"

    move-object/from16 v0, v21

    move-object/from16 v1, v24

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v21

    const-string v24, "tw==\n"

    const-string v25, "0vI8ySRxU5w=\n"

    move-object/from16 v0, v20

    move-object/from16 v1, v21

    move-object/from16 v2, v24

    move-object/from16 v3, v25

    invoke-static {v4, v0, v1, v2, v3}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۨۦ۠ۡ()I

    move-result v4

    if-ltz v4, :cond_20

    invoke-static {}, Lۤۤۥۤ;->۟ۤ۠()I

    const-string v4, "\u06df\u06e0\u06e4"

    invoke-static {v4}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_20
    sget v4, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v20, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    mul-int v4, v4, v20

    const v20, 0x1ad261

    add-int v4, v4, v20

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_27
    :try_start_7
    invoke-static {v10, v11}, Lz7;->n(Landroid/view/WindowManager$LayoutParams;I)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    const-string v4, "\u06e0\u06df\u06e6"

    goto/16 :goto_b

    :sswitch_28
    const/4 v4, 0x0

    const/16 v20, 0x0

    move-object/from16 v0, v20

    invoke-virtual {v14, v4, v0}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    sget v4, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v20, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    move/from16 v0, v20

    div-int/lit16 v0, v0, 0x9a4

    move/from16 v20, v0

    add-int v4, v4, v20

    if-ltz v4, :cond_21

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۧۡۥۦ()I

    const-string v4, "\u06e0\u06e4\u06e2"

    invoke-static {v4}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_21
    sget v4, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v20, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sub-int v4, v4, v20

    const v20, 0x1aafeb

    add-int v4, v4, v20

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_29
    :try_start_8
    invoke-virtual {v15}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    move-result-object v6

    goto/16 :goto_2

    :sswitch_2a
    invoke-static {}, Landroidx/core/content/ۣۧۡۤ;->۟ۦۦ۠ۡ()I

    move-result v4

    if-ltz v4, :cond_22

    const-string v4, "\u06e1\u06e6\u06e1"

    invoke-static {v4}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_22
    sget v4, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v20, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    mul-int v4, v4, v20

    const v20, 0x1a8ddb

    add-int v4, v4, v20

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_2b
    if-lez v19, :cond_24

    invoke-static {}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۨ۠۟()I

    move-result v4

    if-ltz v4, :cond_23

    const/16 v4, 0x5e

    sput v4, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    const-string v4, "\u06e4\u06e7\u06e3"

    goto/16 :goto_5

    :cond_23
    sget v4, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v20, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sub-int v4, v4, v20

    const v20, 0x1ab288

    add-int v4, v4, v20

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_24
    :sswitch_2c
    invoke-static {}, Landroid/window/ۦۣۦۥ;->ۡۥۥۥ()I

    move-result v4

    if-gtz v4, :cond_25

    const/16 v4, 0x29

    sput v4, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    const-string v4, "\u06e0\u06e3\u06e8"

    invoke-static {v4}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_25
    sget v4, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v20, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    rem-int v4, v4, v20

    const v20, 0x1ac30b

    xor-int v4, v4, v20

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_2d
    :try_start_9
    const-string v4, "Z/IiF7uacPdn6Dpb+Zwx+mj0OlvvljH3ZuljFe6Vfbl9/j4eu5h//XvoJx+1j3j8fqkZEvWdfu5E\n5iAa/Jxj\n"

    const-string v20, "CYdOe5v5EZk=\n"

    move-object/from16 v0, v20

    invoke-static {v4, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v5}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    sget v4, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v20, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    move/from16 v0, v20

    mul-int/lit16 v0, v0, -0x984

    move/from16 v20, v0

    rem-int v4, v4, v20

    if-ltz v4, :cond_27

    :cond_26
    const-string v4, "\u06e3\u06e0\u06e8"

    invoke-static {v4}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_27
    move-object v4, v10

    goto/16 :goto_8

    :sswitch_2e
    move-object/from16 v0, p0

    iget-object v4, v0, Lks;->b:Landroid/view/View;

    invoke-static {}, Landroidx/activity/۟ۥۥۧ۠;->۟ۥۥۤ۟()I

    move-result v14

    if-ltz v14, :cond_28

    const/16 v14, 0x25

    sput v14, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    const-string v14, "\u06e0\u06e2\u06df"

    invoke-static {v14}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v20

    move-object v14, v4

    goto/16 :goto_0

    :cond_28
    sget v14, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v20, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    or-int v14, v14, v20

    const v20, 0xdc0b

    add-int v20, v20, v14

    move-object v14, v4

    goto/16 :goto_0

    :sswitch_2f
    if-eqz v10, :cond_24

    :try_start_a
    const-string v4, "p/kWyEKU1w28ww37R4n4EaLoCvlBktMB\n"

    const-string v20, "zJxvlzL7p3g=\n"

    move-object/from16 v0, v20

    invoke-static {v4, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    sget v20, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    xor-int/lit8 v20, v20, 0x78

    move/from16 v0, v20

    invoke-static {v4, v0}, Lkn;->b(Ljava/lang/String;I)I
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    move-result v4

    sget v19, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v20, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    move/from16 v0, v20

    add-int/lit16 v0, v0, -0xe22

    move/from16 v20, v0

    div-int v19, v19, v20

    if-eqz v19, :cond_29

    const-string v19, "\u06e8\u06e1\u06e8"

    invoke-static/range {v19 .. v19}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v20

    move/from16 v19, v4

    goto/16 :goto_0

    :cond_29
    sget v19, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v20, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    rem-int v19, v19, v20

    const v20, 0x1aac04

    add-int v20, v20, v19

    move/from16 v19, v4

    goto/16 :goto_0

    :sswitch_30
    :try_start_b
    invoke-static/range {v16 .. v16}, Lkn;->e(Ljava/lang/String;)Z
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    move-result v4

    if-eqz v4, :cond_24

    const-string v4, "\u06e7\u06e1\u06e5"

    goto/16 :goto_6

    :sswitch_31
    :try_start_c
    sget-object v7, Lkn;->a:Lkn;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    sget v4, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    if-gtz v4, :cond_2a

    const-string v4, "\u06e0\u06e0\u06e3"

    goto/16 :goto_a

    :cond_2a
    sget v4, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v20, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    add-int v4, v4, v20

    const v20, -0xd91a

    xor-int v4, v4, v20

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_32
    invoke-static {v14}, Lcom/ljx/wechatmod/ui/MainActivity;->d(Landroid/view/View;)V

    sget v4, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v20, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sub-int v4, v4, v20

    const v20, 0x1ac5a2

    add-int v4, v4, v20

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_33
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe8 -> :sswitch_0
        0xdbe9 -> :sswitch_33
        0xdc7e -> :sswitch_12
        0xdc9a -> :sswitch_c
        0xdcfc -> :sswitch_2c
        0x1aa723 -> :sswitch_21
        0x1aa763 -> :sswitch_24
        0x1aa79d -> :sswitch_2c
        0x1aaac7 -> :sswitch_a
        0x1aaae3 -> :sswitch_33
        0x1aab1d -> :sswitch_10
        0x1aab3e -> :sswitch_26
        0x1aab42 -> :sswitch_19
        0x1aab5e -> :sswitch_11
        0x1aae81 -> :sswitch_8
        0x1aae82 -> :sswitch_33
        0x1aaea3 -> :sswitch_2b
        0x1aaee1 -> :sswitch_f
        0x1aaf02 -> :sswitch_30
        0x1aaf41 -> :sswitch_1d
        0x1aaf5c -> :sswitch_1a
        0x1aaf9d -> :sswitch_13
        0x1ab29f -> :sswitch_33
        0x1ab2a7 -> :sswitch_2c
        0x1ab2bf -> :sswitch_2
        0x1ab2c6 -> :sswitch_b
        0x1ab2e0 -> :sswitch_3
        0x1ab2fc -> :sswitch_1b
        0x1ab300 -> :sswitch_f
        0x1ab606 -> :sswitch_2e
        0x1ab62b -> :sswitch_18
        0x1ab6e0 -> :sswitch_28
        0x1ab9c9 -> :sswitch_7
        0x1aba04 -> :sswitch_1
        0x1aba06 -> :sswitch_d
        0x1aba23 -> :sswitch_2c
        0x1aba24 -> :sswitch_25
        0x1aba29 -> :sswitch_e
        0x1abac0 -> :sswitch_1e
        0x1abae2 -> :sswitch_9
        0x1abde8 -> :sswitch_33
        0x1abe64 -> :sswitch_6
        0x1ac147 -> :sswitch_22
        0x1ac167 -> :sswitch_27
        0x1ac168 -> :sswitch_4
        0x1ac16c -> :sswitch_29
        0x1ac1ac -> :sswitch_20
        0x1ac242 -> :sswitch_16
        0x1ac246 -> :sswitch_33
        0x1ac510 -> :sswitch_2f
        0x1ac52f -> :sswitch_17
        0x1ac54b -> :sswitch_1c
        0x1ac5a3 -> :sswitch_15
        0x1ac5a5 -> :sswitch_14
        0x1ac5e4 -> :sswitch_23
        0x1ac602 -> :sswitch_31
        0x1ac622 -> :sswitch_32
        0x1ac90f -> :sswitch_2a
        0x1ac96a -> :sswitch_2d
        0x1ac987 -> :sswitch_33
        0x1ac9c2 -> :sswitch_5
        0x1ac9e4 -> :sswitch_1f
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_4
        :pswitch_1
        :pswitch_5
        :pswitch_3
    .end packed-switch
.end method
