.class public final synthetic Lc30;
.super Ljava/lang/Object;

# interfaces
.implements Ljm;


# instance fields
.field public final a:I

.field public final b:Landroid/app/Activity;

.field public final c:[Ljava/lang/String;

.field public final d:I

.field public final e:Lsn;

.field public final f:Landroid/app/Dialog;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;[Ljava/lang/String;ILsn;Landroid/app/Dialog;I)V
    .locals 3

    iput p6, p0, Lc30;->a:I

    iput-object p1, p0, Lc30;->b:Landroid/app/Activity;

    iput-object p2, p0, Lc30;->c:[Ljava/lang/String;

    iput p3, p0, Lc30;->d:I

    iput-object p4, p0, Lc30;->e:Lsn;

    iput-object p5, p0, Lc30;->f:Landroid/app/Dialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e8\u06e1\u06df"

    invoke-static {v1}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v2

    move v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    sget v0, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    if-gtz v0, :cond_2

    const-string v0, "\u06e4\u06e0"

    invoke-static {v0}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_1
    const-string v0, "Cpd"

    invoke-static {v0}, Lۤۤۥۤ;->ۥۧۤۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget v1, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v2, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    or-int/lit16 v2, v2, 0x82d

    div-int/2addr v1, v2

    if-ltz v1, :cond_1

    :cond_1
    const-string v1, "\u06e5\u06e6\u06e2"

    invoke-static {v1}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move v1, v0

    goto :goto_0

    :cond_2
    sget v0, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v2, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    add-int/2addr v0, v2

    const v2, 0x1acaa9

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->۟ۦۥۨ۠()I

    move-result v0

    if-ltz v0, :cond_0

    sget v0, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v2, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    rem-int/lit16 v2, v2, 0xc67

    sub-int/2addr v0, v2

    if-ltz v0, :cond_3

    const/16 v0, 0x45

    sput v0, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    const-string v0, "\u06e5\u06e5\u06e8"

    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_3
    sget v0, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v2, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    rem-int/2addr v0, v2

    const v2, 0x1ac4c8

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_3
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(I)V

    sget v0, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v2, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    add-int/lit16 v2, v2, 0xa45

    sub-int/2addr v0, v2

    if-ltz v0, :cond_4

    const-string v0, "\u06e8\u06e1\u06df"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_4
    const-string v0, "\u06e7\u06e8\u06e1"

    goto :goto_1

    :sswitch_4
    sget v0, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v2, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    or-int/lit16 v2, v2, 0x23ed

    mul-int/2addr v0, v2

    if-ltz v0, :cond_5

    const-string v0, "\u06e5\u06df"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_5
    sget v0, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v2, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sub-int/2addr v0, v2

    const v2, -0x1acdc7

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa7c1 -> :sswitch_0
        0x1abe48 -> :sswitch_4
        0x1abe61 -> :sswitch_3
        0x1ac5c5 -> :sswitch_1
        0x1ac620 -> :sswitch_5
        0x1ac906 -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 31

    const/16 v24, 0x0

    const/16 v23, 0x0

    const/4 v3, 0x0

    const/4 v2, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/16 v18, 0x0

    const/4 v6, 0x0

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v8, 0x0

    const/16 v20, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-string v12, "\u06e8\u06e7\u06df"

    invoke-static {v12}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠ۡۤ(Ljava/lang/Object;)I

    move-result v12

    move-object/from16 v25, v4

    move-object/from16 v26, v5

    move-object/from16 v27, v6

    move/from16 v28, v8

    move/from16 v29, v10

    move/from16 v30, v11

    :goto_0
    sparse-switch v12, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget-object v4, Lqn;->a:Landroid/graphics/Typeface;

    const-string v4, "T87OqLKmPvY8hvHLxItstxbv\n"

    const-string v5, "qmBQTSIr21I=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v0, p0

    iget-object v4, v0, Lc30;->b:Landroid/app/Activity;

    invoke-static {}, Landroidx/startup/ۣۣۡ۟;->۠ۢۢۧ()I

    move-result v6

    if-gtz v6, :cond_2

    const-string v6, "\u06e7\u06e7\u06e5"

    invoke-static {v6}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠ۡۤ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v19, v4

    move-object/from16 v20, v5

    move v12, v6

    goto :goto_0

    :sswitch_1
    sget-object v4, Lqn;->a:Landroid/graphics/Typeface;

    const-string v4, "bCjw2cM8N+5tKPDbxz0ztGp69orDbzC7\n"

    const-string v5, "Dk6U6aUOVY0=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lg80;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    sget v6, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v5, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v8, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    mul-int/lit16 v8, v8, -0x2077

    xor-int/2addr v5, v8

    if-ltz v5, :cond_0

    const-string v5, "\u06e6\u06e4\u06e5"

    move/from16 v8, v18

    :goto_1
    invoke-static {v5}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v16, v4

    move/from16 v17, v6

    move/from16 v18, v8

    move v12, v5

    goto :goto_0

    :cond_0
    const-string v5, "\u06e1\u06e3\u06e5"

    move-object/from16 v16, v4

    move/from16 v17, v6

    :goto_2
    invoke-static {v5}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v4

    move v12, v4

    goto :goto_0

    :sswitch_2
    sget-object v4, Lqn;->a:Landroid/graphics/Typeface;

    const-string v4, "tITWWnRQEi2129dYdQUUL7LR0Q9zBxZ9\n"

    const-string v5, "1uKzbBc2cE4=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lg80;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    sget v5, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v6, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    if-gtz v6, :cond_1

    const/16 v6, 0x60

    sput v6, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    const-string v6, "\u06e8\u06e6\u06e2"

    invoke-static {v6}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v25, v4

    move/from16 v28, v5

    move v12, v6

    goto :goto_0

    :cond_1
    const-string v6, "\u06e4\u06e6\u06e8"

    invoke-static {v6}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v25, v4

    move/from16 v28, v5

    move v12, v6

    goto/16 :goto_0

    :sswitch_3
    sget v4, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    if-gtz v4, :cond_3

    const/16 v4, 0x50

    sput v4, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    move-object/from16 v4, v19

    move-object/from16 v5, v20

    :cond_2
    const-string v6, "\u06e3\u06e7\u06e0"

    invoke-static {v6}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v19, v4

    move-object/from16 v20, v5

    move v12, v6

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u06e7\u06e7\u06e5"

    :goto_3
    invoke-static {v4}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v4

    move v12, v4

    goto/16 :goto_0

    :sswitch_4
    sget v4, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v5, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    rem-int/lit16 v5, v5, -0x1672

    rem-int/2addr v4, v5

    if-ltz v4, :cond_5

    invoke-static {}, Landroid/window/ۣۧ۟۠;->ۣۡ۟ۢ()I

    :cond_4
    const-string v5, "\u06e6\u06df\u06e6"

    move-object/from16 v4, v23

    move/from16 v6, v24

    :goto_4
    invoke-static {v5}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v23, v4

    move/from16 v24, v6

    move v12, v5

    goto/16 :goto_0

    :cond_5
    sget v4, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    sget v5, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    rem-int/2addr v4, v5

    const v5, 0x1ac99f

    add-int/2addr v4, v5

    move v12, v4

    goto/16 :goto_0

    :sswitch_5
    move-object/from16 v0, p0

    iget-object v4, v0, Lc30;->c:[Ljava/lang/String;

    move-object/from16 v0, p0

    iget v5, v0, Lc30;->d:I

    move-object/from16 v0, p0

    iget-object v6, v0, Lc30;->e:Lsn;

    invoke-static/range {v2 .. v7}, Lqn;->c(Landroid/app/Activity;Ljava/lang/String;[Ljava/lang/String;ILsn;Lum;)V

    sget v4, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    if-gtz v4, :cond_6

    const-string v4, "\u06df\u06e4\u06df"

    invoke-static {v4}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v4

    move v12, v4

    goto/16 :goto_0

    :cond_6
    sget v4, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v5, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    rem-int/2addr v4, v5

    const v5, 0x1aab80

    xor-int/2addr v4, v5

    move v12, v4

    goto/16 :goto_0

    :sswitch_6
    sget v4, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    if-gtz v4, :cond_7

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۨۦ۠ۡ()I

    const-string v4, "\u06e1\u06e3\u06e3"

    :goto_5
    invoke-static {v4}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v4

    move v12, v4

    goto/16 :goto_0

    :cond_7
    sget v4, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v5, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sub-int/2addr v4, v5

    const v5, 0x1aac73

    add-int/2addr v4, v5

    move v12, v4

    goto/16 :goto_0

    :sswitch_7
    invoke-static {}, Landroidx/core/app/ۡۤۡ۠;->ۨۥۨۧ()I

    move-result v4

    if-ltz v4, :cond_8

    const/16 v4, 0x12

    sput v4, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    const-string v4, "\u06e1\u06e4\u06e8"

    invoke-static {v4}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v4

    move v12, v4

    goto/16 :goto_0

    :cond_8
    sget v4, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v5, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    rem-int/2addr v4, v5

    const v5, 0x1ab327

    add-int/2addr v4, v5

    move v12, v4

    goto/16 :goto_0

    :sswitch_8
    move-object/from16 v0, p0

    iget-object v8, v0, Lc30;->b:Landroid/app/Activity;

    new-instance v13, Lj30;

    move/from16 v0, v18

    xor-int/lit16 v4, v0, 0x394

    move-object/from16 v0, v23

    invoke-direct {v13, v0, v8, v4}, Lj30;-><init>(Landroid/app/Dialog;Landroid/app/Activity;I)V

    move-object/from16 v0, p0

    iget-object v10, v0, Lc30;->c:[Ljava/lang/String;

    move-object/from16 v0, p0

    iget v11, v0, Lc30;->d:I

    move-object/from16 v0, p0

    iget-object v12, v0, Lc30;->e:Lsn;

    invoke-static/range {v8 .. v13}, Lqn;->c(Landroid/app/Activity;Ljava/lang/String;[Ljava/lang/String;ILsn;Lum;)V

    sget v4, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    if-ltz v4, :cond_a

    :cond_9
    const-string v4, "\u06e0\u06e3\u06e8"

    goto/16 :goto_3

    :cond_a
    const-string v4, "\u06e3\u06e3\u06e2"

    :goto_6
    invoke-static {v4}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v4

    move v12, v4

    goto/16 :goto_0

    :sswitch_9
    sget-object v4, Lqn;->a:Landroid/graphics/Typeface;

    const-string v4, "ghgZ4LepSXmFHRjisKhNKIYZHuK3/U8v\n"

    const-string v5, "4Ht8hNLLKxo=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lg80;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    sget v5, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v6, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v8, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    div-int/lit16 v8, v8, -0xd55

    sub-int/2addr v6, v8

    if-gtz v6, :cond_b

    const-string v6, "\u06e5\u06df\u06e0"

    invoke-static {v6}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v26, v4

    move/from16 v29, v5

    move v12, v6

    goto/16 :goto_0

    :cond_b
    sget v6, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v8, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    div-int/2addr v6, v8

    const v8, 0xdc45

    xor-int/2addr v6, v8

    move-object/from16 v26, v4

    move/from16 v29, v5

    move v12, v6

    goto/16 :goto_0

    :pswitch_0
    :sswitch_a
    sget v4, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    if-gtz v4, :cond_c

    const-string v4, "\u06e7\u06e6\u06e4"

    move-object v5, v4

    goto/16 :goto_2

    :cond_c
    sget v4, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v5, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    rem-int/2addr v4, v5

    const v5, 0x1ac57a

    xor-int/2addr v4, v5

    move v12, v4

    goto/16 :goto_0

    :sswitch_b
    sget-object v4, Lqn;->a:Landroid/graphics/Typeface;

    const-string v4, "nVYrpqj/Vt3dJwDsxsMNv8Vs\n"

    const-string v5, "eMKPTy5ts1g=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    sget v5, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v6, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    if-gtz v6, :cond_d

    const-string v6, "\u06e5\u06e1\u06e7"

    invoke-static {v6}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v27, v4

    move/from16 v30, v5

    move v12, v6

    goto/16 :goto_0

    :cond_d
    sget v6, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v8, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    add-int/2addr v6, v8

    const v8, 0x1ab91a

    xor-int/2addr v6, v8

    move-object/from16 v27, v4

    move/from16 v30, v5

    move v12, v6

    goto/16 :goto_0

    :sswitch_c
    new-instance v15, Lj30;

    const/4 v4, 0x0

    move-object/from16 v0, v23

    move-object/from16 v1, v19

    invoke-direct {v15, v0, v1, v4}, Lj30;-><init>(Landroid/app/Dialog;Landroid/app/Activity;I)V

    move-object/from16 v0, p0

    iget-object v12, v0, Lc30;->c:[Ljava/lang/String;

    move-object/from16 v0, p0

    iget v13, v0, Lc30;->d:I

    move-object/from16 v0, p0

    iget-object v14, v0, Lc30;->e:Lsn;

    move-object/from16 v10, v19

    move-object/from16 v11, v20

    invoke-static/range {v10 .. v15}, Lqn;->c(Landroid/app/Activity;Ljava/lang/String;[Ljava/lang/String;ILsn;Lum;)V

    const-string v4, "\u06e8\u06df\u06e4"

    :goto_7
    invoke-static {v4}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v4

    move v12, v4

    goto/16 :goto_0

    :sswitch_d
    sget-object v4, Lqn;->a:Landroid/graphics/Typeface;

    const-string v4, "nYGUrSfHaMyb0peuJsZumZvTk/oglW+fnYSVrCKXaMmchJWu\n"

    const-string v5, "/+LxnESlCqo=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lg80;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    sget v6, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    const-string v5, "\u06e5\u06e1\u06df"

    :goto_8
    invoke-static {v5}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v21, v4

    move/from16 v22, v6

    move v12, v5

    goto/16 :goto_0

    :sswitch_e
    new-instance v7, Lj30;

    const/4 v4, 0x1

    move-object/from16 v0, v23

    invoke-direct {v7, v0, v2, v4}, Lj30;-><init>(Landroid/app/Dialog;Landroid/app/Activity;I)V

    :goto_9
    const-string v4, "\u06e7\u06e5\u06e8"

    :goto_a
    invoke-static {v4}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v4

    move v12, v4

    goto/16 :goto_0

    :pswitch_1
    :sswitch_f
    const-string v4, "\u06e2\u06e2"

    goto :goto_7

    :sswitch_10
    packed-switch v24, :pswitch_data_0

    :sswitch_11
    sget v4, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v5, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    add-int/2addr v4, v5

    const v5, 0x1ac96c

    add-int/2addr v4, v5

    move v12, v4

    goto/16 :goto_0

    :sswitch_12
    const-string v4, "\u06e6\u06e0\u06e8"

    invoke-static {v4}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v4

    move v12, v4

    goto/16 :goto_0

    :pswitch_2
    :sswitch_13
    sget v4, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    if-gtz v4, :cond_e

    invoke-static {}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->ۤ۠ۡۧ()I

    const-string v4, "\u06e3\u06e5\u06e2"

    goto/16 :goto_6

    :cond_e
    sget v4, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v5, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    add-int/2addr v4, v5

    const v5, 0x1abd74

    add-int/2addr v4, v5

    move v12, v4

    goto/16 :goto_0

    :sswitch_14
    sget-object v2, Lxh;->n:Lxh;

    return-object v2

    :sswitch_15
    sget-object v4, Lqn;->a:Landroid/graphics/Typeface;

    const-string v4, "iWySflwyih6OaJAvWGWNS406lC9ZYItM\n"

    const-string v5, "61/2HDoG6Ho=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lg80;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    sget v8, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    const-string v5, "\u06e6\u06e4\u06e5"

    move-object/from16 v4, v16

    move/from16 v6, v17

    goto/16 :goto_1

    :sswitch_16
    move-object/from16 v0, p0

    iget-object v10, v0, Lc30;->b:Landroid/app/Activity;

    new-instance v15, Lj30;

    move/from16 v0, v30

    xor-int/lit16 v4, v0, 0xb0

    move-object/from16 v0, v23

    invoke-direct {v15, v0, v10, v4}, Lj30;-><init>(Landroid/app/Dialog;Landroid/app/Activity;I)V

    move-object/from16 v0, p0

    iget-object v12, v0, Lc30;->c:[Ljava/lang/String;

    move-object/from16 v0, p0

    iget v13, v0, Lc30;->d:I

    move-object/from16 v0, p0

    iget-object v14, v0, Lc30;->e:Lsn;

    move-object/from16 v11, v27

    invoke-static/range {v10 .. v15}, Lqn;->c(Landroid/app/Activity;Ljava/lang/String;[Ljava/lang/String;ILsn;Lum;)V

    const-string v4, "\u06e2\u06e8"

    goto/16 :goto_5

    :sswitch_17
    move-object/from16 v0, p0

    iget-object v10, v0, Lc30;->b:Landroid/app/Activity;

    new-instance v15, Lj30;

    xor-int/lit8 v4, v28, -0x6f

    move-object/from16 v0, v23

    invoke-direct {v15, v0, v10, v4}, Lj30;-><init>(Landroid/app/Dialog;Landroid/app/Activity;I)V

    move-object/from16 v0, p0

    iget-object v12, v0, Lc30;->c:[Ljava/lang/String;

    move-object/from16 v0, p0

    iget v13, v0, Lc30;->d:I

    move-object/from16 v0, p0

    iget-object v14, v0, Lc30;->e:Lsn;

    move-object/from16 v11, v25

    invoke-static/range {v10 .. v15}, Lqn;->c(Landroid/app/Activity;Ljava/lang/String;[Ljava/lang/String;ILsn;Lum;)V

    sget v4, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v5, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    or-int/lit16 v5, v5, 0x78d

    div-int/2addr v4, v5

    if-eqz v4, :cond_f

    invoke-static {}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->۠ۨۦۥ()I

    const-string v4, "\u06e6\u06e0\u06e8"

    invoke-static {v4}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v4

    move v12, v4

    goto/16 :goto_0

    :cond_f
    sget v4, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v5, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    add-int/2addr v4, v5

    const v5, 0x1ac260

    add-int/2addr v4, v5

    move v12, v4

    goto/16 :goto_0

    :sswitch_18
    move-object/from16 v0, p0

    iget-object v10, v0, Lc30;->b:Landroid/app/Activity;

    new-instance v15, Lj30;

    move/from16 v0, v22

    xor-int/lit16 v4, v0, -0xeb

    move-object/from16 v0, v23

    invoke-direct {v15, v0, v10, v4}, Lj30;-><init>(Landroid/app/Dialog;Landroid/app/Activity;I)V

    move-object/from16 v0, p0

    iget-object v12, v0, Lc30;->c:[Ljava/lang/String;

    move-object/from16 v0, p0

    iget v13, v0, Lc30;->d:I

    move-object/from16 v0, p0

    iget-object v14, v0, Lc30;->e:Lsn;

    move-object/from16 v11, v21

    invoke-static/range {v10 .. v15}, Lqn;->c(Landroid/app/Activity;Ljava/lang/String;[Ljava/lang/String;ILsn;Lum;)V

    sget v4, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    if-gtz v4, :cond_9

    const-string v4, "\u06e3\u06e7"

    invoke-static {v4}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v4

    move v12, v4

    goto/16 :goto_0

    :sswitch_19
    sget-object v2, Lqn;->a:Landroid/graphics/Typeface;

    const-string v2, "Lo/28/bnl5cp2vD78uGWkSnZ8aX1tJHH\n"

    const-string v3, "TOqTw5CC9fI=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lg80;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, p0

    iget-object v2, v0, Lc30;->b:Landroid/app/Activity;

    sget v4, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sget v5, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    add-int/lit16 v5, v5, -0x120d

    sub-int/2addr v4, v5

    if-gtz v4, :cond_4

    const-string v4, "\u06e7\u06e6\u06e1"

    invoke-static {v4}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v4

    move v12, v4

    goto/16 :goto_0

    :sswitch_1a
    sget v4, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    if-gtz v4, :cond_10

    const/16 v4, 0x38

    sput v4, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    const-string v4, "\u06e5\u06e8\u06e1"

    invoke-static {v4}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v4

    move v12, v4

    goto/16 :goto_0

    :cond_10
    sget v4, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v5, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    rem-int/2addr v4, v5

    const v5, 0x1aaf27

    xor-int/2addr v4, v5

    move v12, v4

    goto/16 :goto_0

    :pswitch_3
    :sswitch_1b
    sget v4, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v5, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    add-int/lit16 v5, v5, 0x243e

    div-int/2addr v4, v5

    if-eqz v4, :cond_11

    const-string v4, "\u06e2\u06e6\u06e8"

    goto/16 :goto_7

    :cond_11
    const-string v4, "\u06e3\u06e1\u06e6"

    invoke-static {v4}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v4

    move v12, v4

    goto/16 :goto_0

    :sswitch_1c
    sget v4, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    if-ltz v4, :cond_12

    invoke-static {}, Lkotlinx/coroutines/ۤۢۢۥ;->ۡ۠ۥۡ()I

    goto/16 :goto_9

    :cond_12
    const-string v4, "\u06df\u06e4\u06df"

    invoke-static {v4}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v4

    move v12, v4

    goto/16 :goto_0

    :pswitch_4
    :sswitch_1d
    invoke-static {}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->۠ۨۦۥ()I

    move-result v4

    if-gtz v4, :cond_13

    invoke-static {}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۤ۟۠ۢ()I

    const-string v4, "\u06e4\u06e2\u06e1"

    invoke-static {v4}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v4

    move v12, v4

    goto/16 :goto_0

    :cond_13
    sget v4, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v5, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    xor-int/2addr v4, v5

    const v5, 0x1ab510

    add-int/2addr v4, v5

    move v12, v4

    goto/16 :goto_0

    :sswitch_1e
    move-object/from16 v0, p0

    iget-object v10, v0, Lc30;->b:Landroid/app/Activity;

    new-instance v15, Lj30;

    move/from16 v0, v17

    xor-int/lit16 v4, v0, 0xcd

    move-object/from16 v0, v23

    invoke-direct {v15, v0, v10, v4}, Lj30;-><init>(Landroid/app/Dialog;Landroid/app/Activity;I)V

    move-object/from16 v0, p0

    iget-object v12, v0, Lc30;->c:[Ljava/lang/String;

    move-object/from16 v0, p0

    iget v13, v0, Lc30;->d:I

    move-object/from16 v0, p0

    iget-object v14, v0, Lc30;->e:Lsn;

    move-object/from16 v11, v16

    invoke-static/range {v10 .. v15}, Lqn;->c(Landroid/app/Activity;Ljava/lang/String;[Ljava/lang/String;ILsn;Lum;)V

    const-string v4, "\u06e6\u06e8\u06e8"

    goto/16 :goto_a

    :sswitch_1f
    move-object/from16 v0, p0

    iget-object v10, v0, Lc30;->b:Landroid/app/Activity;

    new-instance v15, Lj30;

    move/from16 v0, v29

    xor-int/lit16 v4, v0, 0x2b7

    move-object/from16 v0, v23

    invoke-direct {v15, v0, v10, v4}, Lj30;-><init>(Landroid/app/Dialog;Landroid/app/Activity;I)V

    move-object/from16 v0, p0

    iget-object v12, v0, Lc30;->c:[Ljava/lang/String;

    move-object/from16 v0, p0

    iget v13, v0, Lc30;->d:I

    move-object/from16 v0, p0

    iget-object v14, v0, Lc30;->e:Lsn;

    move-object/from16 v11, v26

    invoke-static/range {v10 .. v15}, Lqn;->c(Landroid/app/Activity;Ljava/lang/String;[Ljava/lang/String;ILsn;Lum;)V

    sget v4, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v5, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    xor-int/lit16 v5, v5, 0x5d9

    xor-int/2addr v4, v5

    if-gtz v4, :cond_14

    const/16 v4, 0x57

    sput v4, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    const-string v4, "\u06e1\u06e8\u06e2"

    invoke-static {v4}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v4

    move v12, v4

    goto/16 :goto_0

    :cond_14
    sget v4, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v5, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sub-int/2addr v4, v5

    const v5, 0x1ab4fc

    add-int/2addr v4, v5

    move v12, v4

    goto/16 :goto_0

    :pswitch_5
    :sswitch_20
    sget v4, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v5, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    rem-int/2addr v4, v5

    const v5, 0x1ac818

    add-int/2addr v4, v5

    move v12, v4

    goto/16 :goto_0

    :pswitch_6
    :sswitch_21
    sget v4, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v5, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    div-int/lit16 v5, v5, -0xa1a

    sub-int/2addr v4, v5

    if-ltz v4, :cond_15

    invoke-static {}, Landroidx/activity/۟ۥۥۧ۠;->۟ۥۥۤ۟()I

    const-string v5, "\u06e4\u06e5\u06e3"

    move-object/from16 v4, v21

    move/from16 v6, v22

    goto/16 :goto_8

    :cond_15
    const-string v4, "\u06e8\u06df\u06e6"

    move-object v5, v4

    goto/16 :goto_2

    :sswitch_22
    invoke-static {}, Landroid/window/ۣۧ۟۠;->ۣۡ۟ۢ()I

    move-result v4

    if-gtz v4, :cond_16

    const-string v4, "\u06df\u06e0\u06e7"

    invoke-static {v4}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠ۡۤ(Ljava/lang/Object;)I

    move-result v4

    move v12, v4

    goto/16 :goto_0

    :cond_16
    const-string v4, "\u06e1\u06e4\u06e8"

    goto/16 :goto_6

    :sswitch_23
    move-object/from16 v0, p0

    iget v6, v0, Lc30;->a:I

    move-object/from16 v0, p0

    iget-object v4, v0, Lc30;->f:Landroid/app/Dialog;

    invoke-static {}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۟ۢۢ()I

    move-result v5

    if-gtz v5, :cond_17

    const/4 v5, 0x3

    sput v5, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    const-string v5, "\u06e2\u06e8"

    invoke-static {v5}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v23, v4

    move/from16 v24, v6

    move v12, v5

    goto/16 :goto_0

    :cond_17
    const-string v5, "\u06e5\u06df\u06e0"

    goto/16 :goto_4

    :sswitch_24
    sget v4, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v5, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sub-int/2addr v4, v5

    const v5, 0x1acaf9

    xor-int/2addr v4, v5

    move v12, v4

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc40 -> :sswitch_0
        0xdc45 -> :sswitch_1f
        0xdc46 -> :sswitch_4
        0xdc5e -> :sswitch_21
        0xdc64 -> :sswitch_1b
        0x1aa726 -> :sswitch_24
        0x1aa79a -> :sswitch_6
        0x1aaadf -> :sswitch_20
        0x1aab00 -> :sswitch_11
        0x1aab45 -> :sswitch_1c
        0x1aabdd -> :sswitch_14
        0x1aaf03 -> :sswitch_1e
        0x1aaf25 -> :sswitch_6
        0x1aaf3e -> :sswitch_6
        0x1aaf9b -> :sswitch_6
        0x1ab267 -> :sswitch_6
        0x1ab362 -> :sswitch_12
        0x1ab648 -> :sswitch_9
        0x1ab682 -> :sswitch_7
        0x1ab6fc -> :sswitch_c
        0x1ab71e -> :sswitch_1
        0x1ab9c4 -> :sswitch_1d
        0x1aba04 -> :sswitch_16
        0x1abaa6 -> :sswitch_17
        0x1abd86 -> :sswitch_10
        0x1abdc3 -> :sswitch_18
        0x1abdcb -> :sswitch_d
        0x1abe26 -> :sswitch_22
        0x1abe9e -> :sswitch_f
        0x1ac14d -> :sswitch_e
        0x1ac16e -> :sswitch_6
        0x1ac1e5 -> :sswitch_a
        0x1ac1e7 -> :sswitch_8
        0x1ac266 -> :sswitch_1a
        0x1ac568 -> :sswitch_15
        0x1ac5ca -> :sswitch_5
        0x1ac5e2 -> :sswitch_13
        0x1ac605 -> :sswitch_6
        0x1ac8cd -> :sswitch_3
        0x1ac8ce -> :sswitch_b
        0x1ac8cf -> :sswitch_2
        0x1ac929 -> :sswitch_19
        0x1ac9a4 -> :sswitch_6
        0x1ac9c0 -> :sswitch_23
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_6
        :pswitch_3
        :pswitch_5
        :pswitch_0
    .end packed-switch
.end method
