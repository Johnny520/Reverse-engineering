.class public final Lf6;
.super Landroid/view/View;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z

.field public final c:Landroid/graphics/Paint;

.field public final d:Landroid/graphics/RectF;

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:Lsn;


# direct methods
.method public constructor <init>(Lsn;Landroid/app/Activity;Ljava/lang/String;Z)V
    .locals 16

    const-string v2, "TMHHHbFX0g==\n"

    const-string v3, "L66padQvprI=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p2

    invoke-static {v2, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "OmWPc0zh+Q==\n"

    const-string v3, "SQDqFwSEgbA=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p3

    invoke-static {v2, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v0, p1

    move-object/from16 v1, p0

    iput-object v0, v1, Lf6;->h:Lsn;

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/4 v6, 0x0

    const/4 v5, 0x0

    const/4 v4, 0x0

    const/4 v3, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v2, 0x0

    const-string v7, "\u06e5\u06e1\u06e1"

    invoke-static {v7}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v12

    move v7, v4

    move v8, v6

    :goto_0
    sparse-switch v12, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    move-object/from16 v0, p1

    move-object/from16 v1, p3

    invoke-static {v0, v1}, Li6;->b(Lsn;Ljava/lang/String;)I

    move-result v4

    invoke-static {}, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۦۣ۠()I

    move-result v6

    if-ltz v6, :cond_c

    const/16 v6, 0x57

    sput v6, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    const-string v6, "\u06e6\u06e6\u06e3"

    invoke-static {v6}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v6

    move v8, v4

    move v12, v6

    goto :goto_0

    :sswitch_1
    sget v4, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    if-gtz v4, :cond_0

    invoke-static {}, Landroid/window/ۣۧ۟۠;->ۣۡ۟ۢ()I

    const-string v4, "\u06e4\u06df\u06e8"

    :goto_1
    invoke-static {v4}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v4

    move v12, v4

    goto :goto_0

    :cond_0
    sget v4, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v6, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    xor-int/2addr v4, v6

    const v6, 0x1ac060

    add-int/2addr v4, v6

    move v12, v4

    goto :goto_0

    :sswitch_2
    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v4, v2}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v4, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v6, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    add-int/lit16 v6, v6, -0x17b2

    add-int/2addr v4, v6

    if-ltz v4, :cond_1

    invoke-static {}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۟۟۟ۢ()I

    const-string v4, "\u06df\u06e1\u06e5"

    :goto_2
    invoke-static {v4}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v4

    move v12, v4

    goto :goto_0

    :cond_1
    sget v4, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v6, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sub-int/2addr v4, v6

    const v6, 0x1aafb6

    xor-int/2addr v4, v6

    move v12, v4

    goto :goto_0

    :sswitch_3
    invoke-static {v8}, Landroid/graphics/Color;->green(I)I

    move-result v4

    sget v6, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v10, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    xor-int/2addr v6, v10

    const v10, 0x1ac394

    add-int/2addr v6, v10

    move v10, v4

    move v12, v6

    goto :goto_0

    :sswitch_4
    invoke-static {v8}, Landroid/graphics/Color;->green(I)I

    move-result v4

    int-to-double v6, v4

    const-wide v12, 0x3fe6666666666666L    # 0.7

    mul-double/2addr v6, v12

    double-to-int v4, v6

    sget v6, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v7, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    rem-int/2addr v6, v7

    const v7, 0x1aaf0b

    add-int/2addr v6, v7

    move v7, v4

    move v12, v6

    goto/16 :goto_0

    :sswitch_5
    new-instance v4, Landroid/graphics/Paint;

    const/4 v6, 0x1

    invoke-direct {v4, v6}, Landroid/graphics/Paint;-><init>(I)V

    move-object/from16 v0, p0

    iput-object v4, v0, Lf6;->c:Landroid/graphics/Paint;

    invoke-static {}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۨ۠۟()I

    move-result v4

    if-ltz v4, :cond_2

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۡۥۥۦ()I

    const-string v4, "\u06e3\u06e3\u06e2"

    invoke-static {v4}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v4

    move v12, v4

    goto/16 :goto_0

    :cond_2
    move v4, v5

    :goto_3
    const-string v6, "\u06e7\u06df\u06e4"

    move v5, v4

    :goto_4
    invoke-static {v6}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v4

    move v12, v4

    goto/16 :goto_0

    :sswitch_6
    new-instance v4, Landroid/graphics/RectF;

    invoke-direct {v4}, Landroid/graphics/RectF;-><init>()V

    move-object/from16 v0, p0

    iput-object v4, v0, Lf6;->d:Landroid/graphics/RectF;

    invoke-static {}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->ۤ۠ۡۧ()I

    move-result v4

    if-ltz v4, :cond_3

    invoke-static {}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۧۧۥۦ()I

    const-string v4, "\u06e7\u06e4"

    invoke-static {v4}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v4

    move v12, v4

    goto/16 :goto_0

    :cond_3
    sget v4, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v6, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sub-int/2addr v4, v6

    const v6, 0xdd4f

    xor-int/2addr v4, v6

    move v12, v4

    goto/16 :goto_0

    :cond_4
    :sswitch_7
    sget v4, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v6, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    div-int/lit16 v6, v6, 0xeec

    xor-int/2addr v4, v6

    if-ltz v4, :cond_5

    invoke-static {}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۡۢۨۥ()I

    const-string v4, "\u06e4\u06df\u06e2"

    :goto_5
    invoke-static {v4}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v4

    move v12, v4

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06e1\u06e8\u06df"

    goto :goto_5

    :sswitch_8
    move-object/from16 v0, p3

    move-object/from16 v1, p0

    iput-object v0, v1, Lf6;->a:Ljava/lang/String;

    const-string v4, "\u06e3\u06e3\u06e4"

    move-object v6, v4

    goto :goto_4

    :sswitch_9
    move-object/from16 v0, p0

    iput v8, v0, Lf6;->e:I

    :goto_6
    const-string v4, "\u06e3\u06e2\u06e8"

    invoke-static {v4}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v4

    move v12, v4

    goto/16 :goto_0

    :sswitch_a
    invoke-static {v8}, Landroid/graphics/Color;->blue(I)I

    move-result v4

    sget v6, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v11, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    mul-int/2addr v6, v11

    const v11, -0x1a8ad0

    xor-int/2addr v6, v11

    move v11, v4

    move v12, v6

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Lcom/google/android/material/carousel/۠۟ۧۤ;->۟ۡۡۨۥ()I

    move-result v4

    if-gtz v4, :cond_4

    sget v4, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v6, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    xor-int/lit16 v6, v6, -0x1f8a

    or-int/2addr v4, v6

    if-ltz v4, :cond_6

    const/16 v4, 0x4c

    sput v4, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    const-string v4, "\u06df\u06e6\u06e6"

    invoke-static {v4}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v4

    move v12, v4

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u06e8\u06e6\u06e2"

    goto/16 :goto_1

    :sswitch_c
    move/from16 v0, p4

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lf6;->b:Z

    sget v4, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v6, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    div-int/2addr v4, v6

    const v6, 0x1aa743

    xor-int/2addr v4, v6

    move v12, v4

    goto/16 :goto_0

    :sswitch_d
    const-string v2, "VI"

    invoke-static {v2}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠۟۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    :cond_7
    const-string v4, "\u06e1\u06e0\u06e8"

    invoke-static {v4}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v4

    move v12, v4

    goto/16 :goto_0

    :sswitch_e
    invoke-static {v8}, Landroid/graphics/Color;->blue(I)I

    move-result v3

    int-to-double v12, v3

    const-wide v14, 0x3fe6666666666666L    # 0.7

    mul-double/2addr v12, v14

    double-to-int v3, v12

    invoke-static {}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۣۣ۟ۥ۟()I

    move-result v4

    if-lez v4, :cond_7

    const-string v4, "\u06e5\u06e0\u06e7"

    goto/16 :goto_1

    :sswitch_f
    invoke-static {v8}, Landroid/graphics/Color;->red(I)I

    move-result v6

    invoke-static {}, Lcom/google/android/material/carousel/۠۟ۧۤ;->۟ۡۡۨۥ()I

    move-result v4

    if-gtz v4, :cond_8

    const-string v4, "\u06e6\u06e8\u06e6"

    :goto_7
    invoke-static {v4}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v4

    move v9, v6

    move v12, v4

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06e7\u06e4"

    goto :goto_7

    :sswitch_10
    sget v4, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    xor-int/lit16 v4, v4, -0xf9

    invoke-static {v4, v9, v10, v11}, Landroid/graphics/Color;->argb(IIII)I

    move-result v4

    move-object/from16 v0, p0

    iput v4, v0, Lf6;->g:I

    invoke-static {}, Lio/fastkv/ۣ۟ۧۦۡ;->ۥۥۤۥ()I

    move-result v4

    if-ltz v4, :cond_9

    :cond_9
    const-string v4, "\u06e4\u06e8\u06e7"

    invoke-static {v4}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v4

    move v12, v4

    goto/16 :goto_0

    :sswitch_11
    sget v4, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    xor-int/lit16 v4, v4, -0x11d

    invoke-static {v4, v5, v7, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v4

    move-object/from16 v0, p0

    iput v4, v0, Lf6;->f:I

    invoke-static {}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۤ۟۠ۢ()I

    move-result v4

    if-gtz v4, :cond_a

    const/16 v4, 0x3e

    sput v4, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    goto/16 :goto_6

    :cond_a
    const-string v4, "\u06e6\u06e7\u06e1"

    goto/16 :goto_2

    :sswitch_12
    invoke-static {v8}, Landroid/graphics/Color;->red(I)I

    move-result v4

    int-to-double v4, v4

    const-wide v12, 0x3fe6666666666666L    # 0.7

    mul-double/2addr v4, v12

    double-to-int v4, v4

    invoke-static {}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟ۧ۟ۥۧ()I

    move-result v5

    if-gtz v5, :cond_b

    invoke-static {}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->ۢۢۧۨ()I

    goto/16 :goto_3

    :cond_b
    sget v5, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v6, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    xor-int/2addr v5, v6

    const v6, 0x1ac0f8

    add-int/2addr v6, v5

    move v5, v4

    move v12, v6

    goto/16 :goto_0

    :cond_c
    sget v6, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v8, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sub-int/2addr v6, v8

    const v8, 0x1ab75c

    add-int/2addr v6, v8

    move v8, v4

    move v12, v6

    goto/16 :goto_0

    :sswitch_13
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdcdc -> :sswitch_0
        0xdcdd -> :sswitch_3
        0x1aa743 -> :sswitch_5
        0x1aa7df -> :sswitch_1
        0x1aaea0 -> :sswitch_10
        0x1aaea9 -> :sswitch_2
        0x1aaf00 -> :sswitch_e
        0x1aaf98 -> :sswitch_13
        0x1ab669 -> :sswitch_12
        0x1ab682 -> :sswitch_9
        0x1ab684 -> :sswitch_c
        0x1abae3 -> :sswitch_b
        0x1abdac -> :sswitch_11
        0x1abdc5 -> :sswitch_8
        0x1ac1c3 -> :sswitch_4
        0x1ac223 -> :sswitch_a
        0x1ac240 -> :sswitch_f
        0x1ac264 -> :sswitch_7
        0x1ac50c -> :sswitch_6
        0x1ac9a4 -> :sswitch_d
    .end sparse-switch
.end method


# virtual methods
.method public final getSeedHex()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lf6;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 22

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v21, 0x0

    const/4 v2, 0x0

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/4 v13, 0x0

    const/4 v5, 0x0

    const/4 v3, 0x0

    const/4 v15, 0x0

    const/4 v7, 0x0

    const/4 v12, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v16, 0x0

    const-string v4, "\u06e1\u06df\u06e3"

    invoke-static {v4}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v19, v2

    move v6, v4

    move/from16 v20, v5

    :goto_0
    sparse-switch v6, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const-string v2, "\u06e4\u06e2\u06e8"

    :goto_1
    invoke-static {v2}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto :goto_0

    :sswitch_1
    invoke-static {v8, v9}, Ljava/lang/Math;->min(FF)F

    move-result v5

    move-object/from16 v0, p0

    iget-boolean v2, v0, Lf6;->b:Z

    sget v4, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v6, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    add-int/lit8 v6, v6, -0x6c

    xor-int/2addr v4, v6

    if-ltz v4, :cond_1

    const/16 v4, 0x34

    sput v4, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    const-string v4, "\u06e1\u06e0\u06e1"

    invoke-static {v4}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v19, v2

    move v6, v4

    move/from16 v21, v5

    goto :goto_0

    :cond_1
    sget v4, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v6, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    xor-int/2addr v4, v6

    const v6, 0x1aae24

    add-int/2addr v4, v6

    move/from16 v19, v2

    move v6, v4

    move/from16 v21, v5

    goto :goto_0

    :sswitch_2
    move-object/from16 v0, p0

    iget v2, v0, Lf6;->f:I

    invoke-virtual {v7, v2}, Landroid/graphics/Paint;->setColor(I)V

    const/4 v4, 0x0

    const/high16 v5, 0x43340000    # 180.0f

    const/4 v6, 0x1

    move-object/from16 v2, p1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    sget v2, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v4, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    add-int/2addr v2, v4

    const v4, 0x1abe4f

    add-int/2addr v2, v4

    move v6, v2

    goto :goto_0

    :sswitch_3
    invoke-virtual {v7, v11}, Landroid/graphics/Paint;->setColor(I)V

    sget v2, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v4, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    add-int/lit16 v4, v4, 0x1061

    mul-int/2addr v2, v4

    if-ltz v2, :cond_2

    invoke-static {}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۟ۦۣۣۧ()I

    const-string v2, "\u06e2\u06e0\u06e0"

    move v4, v8

    move v5, v9

    :goto_2
    invoke-static {v2}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    move v8, v4

    move v9, v5

    goto :goto_0

    :cond_2
    sget v2, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v4, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    xor-int/2addr v2, v4

    const v4, 0xdcc2

    add-int/2addr v2, v4

    move v6, v2

    goto :goto_0

    :sswitch_4
    sget v2, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v4, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    div-int/lit16 v4, v4, -0xb2e

    mul-int/2addr v2, v4

    if-eqz v2, :cond_3

    invoke-static {}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦۥۣۥ()I

    move v2, v10

    :goto_3
    const-string v4, "\u06e0\u06e8\u06e1"

    move v5, v2

    :goto_4
    invoke-static {v4}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    move v11, v5

    goto/16 :goto_0

    :cond_3
    move v11, v10

    :goto_5
    const-string v2, "\u06e1\u06e5\u06e7"

    invoke-static {v2}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :sswitch_5
    const-string v2, "z+wTU4FV\n"

    const-string v4, "rI19JeAmvZA=\n"

    invoke-static {v2, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p1

    invoke-static {v2, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v4, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    or-int/lit16 v4, v4, -0x5b8

    xor-int/2addr v2, v4

    if-gtz v2, :cond_f

    const/16 v2, 0x5c

    sput v2, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    const-string v2, "\u06e5\u06e4\u06e2"

    move v4, v13

    :goto_6
    invoke-static {v2}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    move v13, v4

    goto/16 :goto_0

    :sswitch_6
    move-object/from16 v0, p0

    iget-object v2, v0, Lf6;->h:Lsn;

    iget-boolean v2, v2, Lsn;->p:Z

    if-eqz v2, :cond_11

    const-string v2, "jWURl9Z6Qsbo\n"

    const-string v4, "riAn0ZA8BIA=\n"

    invoke-static {v2, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v12

    invoke-static {}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟۠ۢۨۦ()I

    move-result v2

    if-gtz v2, :cond_4

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۤ۟ۦ۟()I

    const-string v2, "\u06e0\u06e0"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_4
    sget v2, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v4, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    mul-int/2addr v2, v4

    const v4, -0x130659

    xor-int/2addr v2, v4

    move v6, v2

    goto/16 :goto_0

    :sswitch_7
    const v2, 0x3eb33333    # 0.35f

    mul-float v2, v2, v20

    move-object/from16 v0, p1

    invoke-virtual {v0, v8, v9, v2, v7}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    sget v2, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v4, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    add-int/lit16 v4, v4, 0x184a

    mul-int/2addr v2, v4

    if-ltz v2, :cond_5

    const/16 v2, 0xe

    sput v2, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    const-string v2, "\u06e0\u06e7\u06e0"

    invoke-static {v2}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_5
    move-object v2, v15

    :goto_7
    const-string v4, "\u06e8\u06e1\u06e3"

    move-object v15, v2

    move/from16 v5, v18

    :goto_8
    invoke-static {v4}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    move/from16 v18, v5

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۢۧۥ()I

    move-result v2

    if-ltz v2, :cond_6

    const/16 v2, 0x10

    sput v2, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    const-string v2, "\u06e4\u06e5\u06df"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_6
    sget v2, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sget v4, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sub-int/2addr v2, v4

    const v4, 0xdcc1

    add-int/2addr v2, v4

    move v6, v2

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۨۦ۠ۡ()I

    move-result v2

    if-ltz v2, :cond_0

    const-string v2, "meRFzbxHuiJ"

    invoke-static {v2}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣۢ۠ۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    invoke-static {}, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۦۣ۠()I

    move-result v2

    if-ltz v2, :cond_7

    const-string v2, "\u06e3\u06e7"

    :goto_9
    invoke-static {v2}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v2

    move-wide/from16 v16, v4

    move v6, v2

    goto/16 :goto_0

    :cond_7
    const-string v2, "\u06e2\u06e8\u06e3"

    move-wide/from16 v16, v4

    :goto_a
    invoke-static {v2}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_8
    :sswitch_a
    sget v2, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v4, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    add-int/2addr v2, v4

    const v4, 0x1ab532

    add-int/2addr v2, v4

    move v6, v2

    goto/16 :goto_0

    :sswitch_b
    if-eqz v19, :cond_8

    const/high16 v2, 0x40800000    # 4.0f

    invoke-static {v2}, Lmp;->p(F)F

    move-result v5

    sget v2, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v4, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    add-int/lit16 v4, v4, 0x21cc

    or-int/2addr v2, v4

    if-ltz v2, :cond_9

    const-string v2, "\u06e2\u06e6\u06e7"

    invoke-static {v2}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    move/from16 v18, v5

    goto/16 :goto_0

    :cond_9
    const-string v2, "\u06e2\u06e0\u06e0"

    move-object v4, v2

    goto :goto_8

    :sswitch_c
    sget v2, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v4, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sub-int/2addr v2, v4

    const v4, 0x1ab21c

    add-int/2addr v2, v4

    move v6, v2

    goto/16 :goto_0

    :cond_a
    :sswitch_d
    invoke-static {}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟ۧ۟ۥۧ()I

    move-result v2

    if-gtz v2, :cond_b

    const-string v2, "\u06e0\u06df\u06e1"

    :goto_b
    invoke-static {v2}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_b
    const-string v2, "\u06e8\u06e1\u06e3"

    invoke-static {v2}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟ۧ۠ۧۢ()I

    move-result v2

    if-ltz v2, :cond_c

    const/16 v2, 0x4c

    sput v2, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    const-string v2, "\u06e1\u06df\u06e3"

    invoke-static {v2}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_c
    const-string v2, "\u06e7\u06df\u06e5"

    move-wide/from16 v4, v16

    goto :goto_9

    :sswitch_f
    const/high16 v2, 0x41700000    # 15.0f

    sub-float v2, v8, v2

    sub-float v2, v2, v20

    const/high16 v4, 0x41700000    # 15.0f

    add-float/2addr v2, v4

    const/high16 v4, 0x40a00000    # 5.0f

    add-float/2addr v4, v9

    sub-float v4, v4, v20

    const/high16 v5, 0x40a00000    # 5.0f

    sub-float/2addr v4, v5

    const/high16 v5, 0x41c80000    # 25.0f

    add-float/2addr v5, v8

    add-float v5, v5, v20

    const/high16 v6, 0x41c80000    # 25.0f

    sub-float/2addr v5, v6

    const/4 v6, 0x0

    const/4 v15, 0x0

    sub-float/2addr v15, v9

    sub-float v15, v15, v20

    sub-float/2addr v6, v15

    invoke-virtual {v3, v2, v4, v5, v6}, Landroid/graphics/RectF;->set(FFFF)V

    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-static {}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۤ۟۠ۢ()I

    move-result v4

    if-gtz v4, :cond_d

    invoke-static {}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۟۟۟ۢ()I

    goto/16 :goto_7

    :cond_d
    sget v4, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v5, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    or-int/2addr v4, v5

    const v5, 0x1aaea2

    add-int/2addr v4, v5

    move-object v15, v2

    move v6, v4

    goto/16 :goto_0

    :sswitch_10
    sget v2, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v4, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    xor-int/2addr v2, v4

    const v4, -0x1aab9b

    xor-int/2addr v2, v4

    move v6, v2

    move/from16 v13, v18

    goto/16 :goto_0

    :sswitch_11
    invoke-static {}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦۥۣۥ()I

    move-result v2

    if-ltz v2, :cond_e

    invoke-static {}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۧۧۥۦ()I

    const-string v2, "\u06e0\u06df\u06e5"

    goto/16 :goto_1

    :cond_e
    const-string v2, "\u06e1\u06e0\u06e1"

    goto/16 :goto_1

    :sswitch_12
    const/4 v2, 0x0

    const/high16 v4, 0x40400000    # 3.0f

    invoke-static {v4}, Lmp;->p(F)F

    move-result v4

    sub-float/2addr v2, v4

    sub-float v2, v20, v2

    move-object/from16 v0, p1

    invoke-virtual {v0, v8, v9, v2, v7}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    invoke-virtual {v7, v15}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-static {}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۤۥۣ۟()I

    move-result v2

    if-ltz v2, :cond_10

    :cond_f
    const-string v2, "\u06e3\u06e0\u06e5"

    :goto_c
    invoke-static {v2}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_10
    const-string v2, "\u06e0\u06df\u06e3"

    goto :goto_c

    :cond_11
    :sswitch_13
    sget v2, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v4, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    div-int/lit16 v4, v4, -0x19f9

    sub-int/2addr v2, v4

    if-ltz v2, :cond_12

    invoke-static {}, Landroidx/activity/۟ۥۥۧ۠;->۟ۥۥۤ۟()I

    const-string v2, "\u06e4\u06e2\u06e0"

    goto/16 :goto_a

    :cond_12
    const-string v2, "\u06e7\u06e2\u06e7"

    goto/16 :goto_1

    :sswitch_14
    sget v2, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v4, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    mul-int/lit16 v4, v4, 0x24d9

    sub-int/2addr v2, v4

    if-ltz v2, :cond_13

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟ۧ۠ۧۢ()I

    const-string v2, "\u06e0\u06df\u06e3"

    invoke-static {v2}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    move v13, v14

    goto/16 :goto_0

    :cond_13
    const-string v2, "\u06e1\u06e0\u06e1"

    move v4, v14

    goto/16 :goto_6

    :sswitch_15
    sget v2, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    if-gtz v2, :cond_14

    const-string v2, "\u06e0\u06e2\u06e2"

    invoke-static {v2}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠ۡۤ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    move v11, v12

    goto/16 :goto_0

    :cond_14
    const-string v2, "\u06e0\u06e1\u06e2"

    move-object v4, v2

    move v5, v12

    goto/16 :goto_4

    :sswitch_16
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, v2, v4

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, v2, v5

    const-string v2, "\u06e4\u06e5\u06df"

    goto/16 :goto_2

    :sswitch_17
    sget v2, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v4, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    mul-int/2addr v2, v4

    const v4, 0x22eb43

    add-int/2addr v2, v4

    move v6, v2

    goto/16 :goto_0

    :sswitch_18
    if-eqz v19, :cond_a

    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v7, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    sget v2, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    sget v4, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    xor-int/lit16 v4, v4, -0xfa4

    mul-int/2addr v2, v4

    if-gtz v2, :cond_15

    const-string v2, "\u06e1\u06e4\u06e7"

    invoke-static {v2}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_15
    move v2, v11

    goto/16 :goto_3

    :sswitch_19
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    move-wide/from16 v0, v16

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

    sget v2, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v4, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    rem-int/lit16 v4, v4, 0x158

    mul-int/2addr v2, v4

    if-ltz v2, :cond_16

    const-string v2, "\u06e4\u06e2"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_16
    sget v2, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v4, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    mul-int/2addr v2, v4

    const v4, 0x1a53b2

    xor-int/2addr v2, v4

    move v6, v2

    goto/16 :goto_0

    :sswitch_1a
    move-object/from16 v0, p0

    iget v2, v0, Lf6;->e:I

    invoke-virtual {v7, v2}, Landroid/graphics/Paint;->setColor(I)V

    const/high16 v4, 0x43340000    # 180.0f

    const/high16 v5, 0x43340000    # 180.0f

    const/4 v6, 0x1

    move-object/from16 v2, p1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    sget v2, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    if-ltz v2, :cond_17

    const/4 v2, 0x4

    sput v2, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    goto/16 :goto_5

    :cond_17
    const-string v2, "\u06e2\u06df\u06e7"

    goto/16 :goto_1

    :sswitch_1b
    move-object/from16 v0, p0

    iget-object v7, v0, Lf6;->c:Landroid/graphics/Paint;

    invoke-virtual {v7, v15}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    sget v2, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    sget v4, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    div-int/2addr v2, v4

    const v4, 0x1ac1ec

    add-int/2addr v2, v4

    move v6, v2

    goto/16 :goto_0

    :sswitch_1c
    const/high16 v2, 0x40000000    # 2.0f

    invoke-static {v2}, Lmp;->p(F)F

    move-result v2

    invoke-virtual {v7, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    move-object/from16 v0, p0

    iget v2, v0, Lf6;->g:I

    invoke-virtual {v7, v2}, Landroid/graphics/Paint;->setColor(I)V

    sget v2, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v4, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    or-int/2addr v2, v4

    const v4, -0x1ab61b

    xor-int/2addr v2, v4

    move v6, v2

    goto/16 :goto_0

    :sswitch_1d
    const/high16 v2, 0x40c00000    # 6.0f

    add-float v2, v2, v21

    sub-float/2addr v2, v13

    const/high16 v3, 0x40c00000    # 6.0f

    sub-float v4, v2, v3

    move-object/from16 v0, p0

    iget-object v3, v0, Lf6;->d:Landroid/graphics/RectF;

    sget v2, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v5, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    mul-int/lit16 v5, v5, 0x99a

    or-int/2addr v2, v5

    if-ltz v2, :cond_18

    invoke-static {}, Landroidx/activity/result/۟ۡۧ۠ۥ;->۟ۥۥۧ۟()I

    const-string v2, "\u06e2\u06e8\u06e3"

    invoke-static {v2}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_18
    sget v2, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v5, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    rem-int/2addr v2, v5

    const v5, 0x1aaf5c

    add-int/2addr v2, v5

    move v6, v2

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_1e
    const/4 v10, -0x1

    sget v2, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    if-ltz v2, :cond_19

    const/16 v2, 0x31

    sput v2, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    const-string v2, "\u06e0\u06e1\u06e2"

    invoke-static {v2}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_19
    const-string v2, "\u06e8\u06e7\u06e5"

    goto/16 :goto_b

    :sswitch_1f
    const/high16 v2, 0x40000000    # 2.0f

    invoke-static {v2}, Lmp;->p(F)F

    move-result v14

    sget v2, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v4, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    mul-int/lit16 v4, v4, -0x1b64

    mul-int/2addr v2, v4

    if-gtz v2, :cond_1a

    const/16 v2, 0x63

    sput v2, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    const-string v2, "\u06e8\u06e7\u06e5"

    invoke-static {v2}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_1a
    const-string v2, "\u06e5\u06e3\u06df"

    goto/16 :goto_a

    :sswitch_20
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc00 -> :sswitch_0
        0xdc64 -> :sswitch_a
        0xdc7e -> :sswitch_7
        0xdcff -> :sswitch_c
        0x1aaac4 -> :sswitch_6
        0x1aab01 -> :sswitch_8
        0x1aab20 -> :sswitch_e
        0x1aabb9 -> :sswitch_17
        0x1aabd9 -> :sswitch_1c
        0x1aae85 -> :sswitch_5
        0x1aae89 -> :sswitch_1b
        0x1aaea2 -> :sswitch_1d
        0x1aaf24 -> :sswitch_b
        0x1aaf43 -> :sswitch_3
        0x1aaf7c -> :sswitch_f
        0x1ab24a -> :sswitch_2
        0x1ab262 -> :sswitch_10
        0x1ab323 -> :sswitch_1f
        0x1ab35d -> :sswitch_19
        0x1ab628 -> :sswitch_16
        0x1ab71a -> :sswitch_12
        0x1aba2a -> :sswitch_20
        0x1aba7e -> :sswitch_1
        0x1aba7f -> :sswitch_18
        0x1abe01 -> :sswitch_14
        0x1abe23 -> :sswitch_11
        0x1ac147 -> :sswitch_15
        0x1ac16c -> :sswitch_d
        0x1ac16d -> :sswitch_c
        0x1ac1e8 -> :sswitch_1a
        0x1ac50c -> :sswitch_13
        0x1ac50d -> :sswitch_11
        0x1ac56c -> :sswitch_1e
        0x1ac90a -> :sswitch_9
        0x1ac9c6 -> :sswitch_4
    .end sparse-switch
.end method
