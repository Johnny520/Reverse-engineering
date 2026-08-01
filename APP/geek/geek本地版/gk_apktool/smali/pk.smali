.class public final Lpk;
.super Landroid/view/View;


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Z

.field public final c:Landroid/graphics/Paint;

.field public final d:Lon;


# direct methods
.method public constructor <init>(Lon;Landroid/content/Context;Ljava/lang/String;)V
    .locals 4

    const-string v0, "tq010jqorw==\n"

    const-string v1, "1cJbpl/Q2zY=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "eTgDPoEvwqY=\n"

    const-string v1, "EV17fe5DrdQ=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p3}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p1, p0, Lpk;->d:Lon;

    invoke-direct {p0, p2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const-wide/16 v2, 0x0

    const-string v0, "\u06e4\u06e6\u06e6"

    invoke-static {v0}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "NZHSPM5PiX6jcV79BILvWfupX"

    invoke-static {v0}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۤۢۨۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2

    sget v0, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    if-ltz v0, :cond_3

    const/16 v0, 0x21

    sput v0, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    const-string v0, "\u06e4\u06e1\u06e4"

    invoke-static {v0}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lpk;->c:Landroid/graphics/Paint;

    sget v0, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v1, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    add-int/lit16 v1, v1, -0xd7a

    rem-int/2addr v0, v1

    if-ltz v0, :cond_0

    invoke-static {}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۦۤۨۢ()I

    const-string v0, "\u06e4\u06e6\u06e6"

    invoke-static {v0}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e6\u06e1\u06df"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_2
    sget v0, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v1, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    xor-int/2addr v0, v1

    const v1, 0x1ab9ef

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_3
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v2, v3}, Ljava/io/PrintStream;->println(D)V

    invoke-static {}, Lkotlinx/coroutines/ۦۡۧۧ;->۟ۤۧۨۦ()I

    move-result v0

    if-ltz v0, :cond_2

    const/16 v0, 0x24

    sput v0, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    :cond_1
    const-string v0, "\u06e7\u06e3"

    invoke-static {v0}, L۠ۡۢۨ;->۟ۡۧۡۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_2
    sget v0, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v1, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    mul-int/2addr v0, v1

    const v1, 0x19bb8b

    add-int/2addr v0, v1

    goto :goto_0

    :cond_3
    const-string v0, "\u06e0\u06df\u06e4"

    invoke-static {v0}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_4
    :sswitch_4
    invoke-static {}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۡۦۣۨ()I

    move-result v0

    if-ltz v0, :cond_5

    const-string v0, "\u06e5\u06e8\u06e3"

    invoke-static {v0}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_5
    sget v0, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v1, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sub-int/2addr v0, v1

    const v1, 0x1ac1d3

    add-int/2addr v0, v1

    goto/16 :goto_0

    :sswitch_5
    invoke-static {}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۣ۟ۧۤۡ()I

    move-result v0

    if-ltz v0, :cond_4

    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۣۡ۠ۡ()I

    move-result v0

    if-gtz v0, :cond_1

    const/16 v0, 0x49

    sput v0, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    const-string v0, "\u06e0\u06e6\u06df"

    invoke-static {v0}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :sswitch_6
    iput-object p3, p0, Lpk;->a:Ljava/lang/String;

    sget v0, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    if-gtz v0, :cond_6

    const-string v0, "\u06e6\u06e1\u06df"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_6
    const-string v0, "\u06e4\u06e1\u06e4"

    goto :goto_1

    :sswitch_7
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdcdc -> :sswitch_0
        0x1aaac5 -> :sswitch_3
        0x1aab99 -> :sswitch_2
        0x1aabbd -> :sswitch_4
        0x1aba07 -> :sswitch_1
        0x1abaa4 -> :sswitch_6
        0x1ac184 -> :sswitch_5
        0x1ac1a5 -> :sswitch_7
    .end sparse-switch
.end method


# virtual methods
.method public final getHexColor()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpk;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 36

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/4 v6, 0x0

    const/4 v13, 0x0

    const/16 v17, 0x0

    const/4 v12, 0x0

    const/16 v27, 0x0

    const/16 v24, 0x0

    const/16 v23, 0x0

    const/4 v10, 0x0

    const/16 v25, 0x0

    const/16 v22, 0x0

    const/16 v26, 0x0

    const/4 v15, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v28, 0x0

    const/4 v9, 0x0

    const/16 v18, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/16 v20, 0x0

    const/4 v5, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/4 v7, 0x0

    const-string v29, "\u06e1\u06e4\u06e3"

    invoke-static/range {v29 .. v29}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v33

    move-object/from16 v29, v7

    move-object/from16 v30, v15

    move-object/from16 v31, v16

    move/from16 v32, v26

    :goto_0
    sparse-switch v33, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    sget v7, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v15, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    add-int/lit16 v15, v15, 0xf6e

    xor-int/2addr v7, v15

    if-gtz v7, :cond_e

    const-string v7, "\u06e7\u06e0\u06e7"

    :goto_1
    invoke-static {v7}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v7

    move/from16 v33, v7

    goto :goto_0

    :sswitch_1
    const/4 v5, -0x1

    sget v7, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v15, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    add-int/lit16 v15, v15, -0x674

    xor-int/2addr v7, v15

    if-gtz v7, :cond_2

    :cond_1
    const-string v7, "\u06e3\u06df\u06e1"

    invoke-static {v7}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v7

    move/from16 v33, v7

    goto :goto_0

    :cond_2
    sget v7, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v15, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    xor-int/2addr v7, v15

    const v15, 0x1ac72b

    add-int/2addr v7, v15

    move/from16 v33, v7

    goto :goto_0

    :sswitch_2
    sget-object v7, Ljava/lang/System;->out:Ljava/io/PrintStream;

    move-object/from16 v0, v29

    invoke-virtual {v7, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v7, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    if-gtz v7, :cond_3

    invoke-static {}, Lcom/google/android/material/carousel/۟ۧۡۢ;->۟ۦۥۣۧ()I

    const-string v7, "\u06e8\u06e2\u06e1"

    invoke-static {v7}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v7

    move/from16 v33, v7

    goto :goto_0

    :cond_3
    const-string v7, "\u06e5\u06e4\u06e4"

    :goto_2
    invoke-static {v7}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v7

    move/from16 v33, v7

    goto :goto_0

    :sswitch_3
    const v7, 0x3eb33333    # 0.35f

    mul-float v7, v7, v27

    move-object/from16 v0, p1

    move/from16 v1, v34

    move/from16 v2, v35

    move-object/from16 v3, v23

    invoke-virtual {v0, v1, v2, v7, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    sget v7, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v15, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    add-int/lit16 v15, v15, -0x816

    div-int/2addr v7, v15

    if-eqz v7, :cond_4

    const-string v7, "\u06e1\u06e2"

    invoke-static {v7}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v7

    move/from16 v33, v7

    goto :goto_0

    :cond_4
    sget v7, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v15, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sub-int/2addr v7, v15

    const v15, 0x1ac9bb

    add-int/2addr v7, v15

    move/from16 v33, v7

    goto/16 :goto_0

    :sswitch_4
    const-string v7, "x5Xhvm9X\n"

    const-string v15, "pPSPyA4kCkw=\n"

    invoke-static {v7, v15}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v0, p1

    invoke-static {v7, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v7

    int-to-float v7, v7

    const/high16 v15, 0x40000000    # 2.0f

    div-float v15, v7, v15

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v7

    int-to-float v7, v7

    const/high16 v16, 0x40000000    # 2.0f

    div-float v16, v7, v16

    sget v7, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v26, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sub-int v7, v7, v26

    const v26, 0x1ab683

    add-int v7, v7, v26

    move/from16 v33, v7

    move/from16 v34, v15

    move/from16 v35, v16

    goto/16 :goto_0

    :sswitch_5
    const-string v7, "\u06e0\u06e6\u06e7"

    invoke-static {v7}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v7

    move/from16 v33, v7

    goto/16 :goto_0

    :sswitch_6
    sget v7, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v15, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    or-int/lit16 v15, v15, -0x2294

    or-int/2addr v7, v15

    if-ltz v7, :cond_5

    invoke-static {}, L۟ۡۦۧۤ;->۟۟۠ۡۢ()I

    const-string v7, "\u06e6\u06e4\u06e8"

    invoke-static {v7}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v7

    move/from16 v33, v7

    goto/16 :goto_0

    :cond_5
    sget v7, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v15, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sub-int/2addr v7, v15

    const v15, 0x1aae8a

    add-int/2addr v7, v15

    move/from16 v33, v7

    goto/16 :goto_0

    :cond_6
    :sswitch_7
    sget v7, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v15, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    xor-int/2addr v7, v15

    const v15, -0x1aa88a

    xor-int/2addr v7, v15

    move/from16 v33, v7

    goto/16 :goto_0

    :sswitch_8
    invoke-static/range {v34 .. v35}, Ljava/lang/Math;->min(FF)F

    move-result v6

    move-object/from16 v0, p0

    iget-boolean v7, v0, Lpk;->b:Z

    if-eqz v7, :cond_8

    const/high16 v7, 0x40800000    # 4.0f

    invoke-static {v7}, Lff;->p(F)F

    move-result v13

    sget v7, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v15, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    or-int/lit16 v15, v15, 0x6dd

    add-int/2addr v7, v15

    if-gtz v7, :cond_7

    const-string v7, "\u06e6\u06e1\u06e6"

    invoke-static {v7}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v7

    move/from16 v33, v7

    goto/16 :goto_0

    :cond_7
    const-string v7, "\u06e6\u06e1\u06e2"

    invoke-static {v7}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v7

    move/from16 v33, v7

    goto/16 :goto_0

    :cond_8
    :sswitch_9
    sget v7, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v15, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    add-int/lit16 v15, v15, 0x210b

    add-int/2addr v7, v15

    if-gtz v7, :cond_9

    invoke-static {}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۢ۟ۡۧ()I

    const-string v7, "\u06df\u06e8\u06e0"

    :goto_3
    invoke-static {v7}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v7

    move/from16 v33, v7

    goto/16 :goto_0

    :cond_9
    const-string v7, "\u06e0\u06e7\u06e2"

    goto :goto_3

    :cond_a
    :sswitch_a
    sget v7, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v15, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    div-int/lit16 v15, v15, -0x735

    xor-int/2addr v7, v15

    if-gtz v7, :cond_b

    const-string v7, "\u06e7\u06e4\u06e3"

    :goto_4
    invoke-static {v7}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v7

    move/from16 v33, v7

    goto/16 :goto_0

    :cond_b
    const-string v7, "\u06e3\u06df\u06e1"

    :goto_5
    invoke-static {v7}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v7

    move/from16 v33, v7

    goto/16 :goto_0

    :sswitch_b
    invoke-static/range {v20 .. v20}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v7

    move-object/from16 v0, v23

    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setColor(I)V

    const/4 v7, 0x0

    const/4 v15, 0x0

    const/high16 v16, 0x40400000    # 3.0f

    invoke-static/range {v16 .. v16}, Lff;->p(F)F

    move-result v16

    sub-float v15, v15, v16

    sub-float v15, v15, v27

    sub-float/2addr v7, v15

    move-object/from16 v0, p1

    move/from16 v1, v34

    move/from16 v2, v35

    move-object/from16 v3, v23

    invoke-virtual {v0, v1, v2, v7, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    invoke-virtual/range {v23 .. v24}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const-string v7, "\u06e5\u06e4\u06e0"

    :goto_6
    invoke-static {v7}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v7

    move/from16 v33, v7

    goto/16 :goto_0

    :sswitch_c
    invoke-virtual/range {v23 .. v24}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    move-object/from16 v0, p0

    iget-object v7, v0, Lpk;->a:Ljava/lang/String;

    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    move-object/from16 v0, v23

    invoke-virtual {v0, v10}, Landroid/graphics/Paint;->setColor(I)V

    invoke-static {}, Landroidx/appcompat/widget/۟ۢۨۦ;->۟ۦۡ۟۠()I

    move-result v10

    if-ltz v10, :cond_25

    :goto_7
    const-string v10, "\u06e1\u06e0\u06e0"

    invoke-static {v10}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v15

    move-object v10, v7

    move/from16 v33, v15

    goto/16 :goto_0

    :cond_c
    :sswitch_d
    const-string v7, "\u06e3\u06e8"

    goto :goto_4

    :sswitch_e
    sget v7, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v15, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    add-int/lit16 v15, v15, -0xfd5

    xor-int/2addr v7, v15

    if-ltz v7, :cond_d

    const/16 v7, 0x1a

    sput v7, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    const-string v7, "\u06e6\u06e4\u06e4"

    :goto_8
    invoke-static {v7}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v7

    move/from16 v33, v7

    goto/16 :goto_0

    :cond_d
    const-string v7, "\u06e5\u06e7\u06e3"

    invoke-static {v7}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v7

    move/from16 v33, v7

    goto/16 :goto_0

    :cond_e
    sget v7, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v15, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    rem-int/2addr v7, v15

    const v15, 0x1abf92

    add-int/2addr v7, v15

    move/from16 v33, v7

    goto/16 :goto_0

    :sswitch_f
    sget v7, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    if-gtz v7, :cond_10

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۠ۥۥ۟()I

    move v7, v14

    move v12, v13

    :cond_f
    const-string v14, "\u06e7\u06e8\u06e1"

    move-object v15, v14

    move/from16 v16, v7

    :goto_9
    invoke-static {v15}, Landroid/app/۟ۦۦۤۥ;->ۦۨۥ۟(Ljava/lang/Object;)I

    move-result v7

    move/from16 v33, v7

    move/from16 v14, v16

    goto/16 :goto_0

    :cond_10
    const-string v7, "\u06e6\u06e7\u06e2"

    move v12, v13

    goto/16 :goto_1

    :sswitch_10
    sget v7, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v8, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    or-int/lit16 v8, v8, -0xb33

    sub-int/2addr v7, v8

    if-gtz v7, :cond_11

    const/16 v7, 0x48

    sput v7, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    const-string v7, "\u06e6\u06e2"

    invoke-static {v7}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v7

    move-object v8, v9

    move/from16 v33, v7

    goto/16 :goto_0

    :cond_11
    const-string v7, "\u06e7\u06e2\u06e2"

    move-object v8, v9

    goto/16 :goto_4

    :sswitch_11
    invoke-static/range {v28 .. v28}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v7

    move-object/from16 v0, v23

    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setColor(I)V

    sget v7, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v15, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    add-int/lit16 v15, v15, -0x2de

    div-int/2addr v7, v15

    if-eqz v7, :cond_12

    const/16 v7, 0x35

    sput v7, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    const-string v7, "\u06df\u06e4\u06e1"

    invoke-static {v7}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v7

    move/from16 v33, v7

    goto/16 :goto_0

    :cond_12
    const-string v7, "\u06e8\u06df\u06e0"

    goto :goto_8

    :sswitch_12
    sget v7, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    if-gtz v7, :cond_13

    const-string v7, "\u06e6\u06e6\u06e6"

    invoke-static {v7}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v7

    move/from16 v33, v7

    goto/16 :goto_0

    :cond_13
    const-string v7, "\u06e0\u06e3\u06df"

    invoke-static {v7}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v7

    move/from16 v33, v7

    goto/16 :goto_0

    :sswitch_13
    invoke-static {}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣ۟۠()I

    move-result v7

    if-gtz v7, :cond_0

    const-string v7, "vqkHT1wKRdx9SHAqyjdSIAjX"

    invoke-static {v7}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۧۢ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v7

    sget v15, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v16, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    add-int v15, v15, v16

    const v16, 0x1ab830

    add-int v15, v15, v16

    move-object/from16 v29, v7

    move/from16 v33, v15

    goto/16 :goto_0

    :sswitch_14
    invoke-static {}, Landroidx/emoji2/text/ۣۣ۟۟۠;->ۢۡۢۦ()I

    move-result v7

    if-gtz v7, :cond_14

    const-string v7, "\u06e7\u06e0\u06e5"

    invoke-static {v7}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v7

    move/from16 v33, v7

    goto/16 :goto_0

    :cond_14
    sget v7, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v15, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    add-int/2addr v7, v15

    const v15, 0x1aa540

    add-int/2addr v7, v15

    move/from16 v33, v7

    goto/16 :goto_0

    :sswitch_15
    move-object/from16 v0, v30

    iget-boolean v7, v0, Lon;->p:Z

    if-nez v7, :cond_1e

    const-string v7, "WerCYwWyyw==\n"

    const-string v15, "etryUzWC+9Y=\n"

    invoke-static {v7, v15}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    sget v7, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v15, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    xor-int/lit16 v15, v15, 0x1b6d

    rem-int/2addr v7, v15

    if-gtz v7, :cond_15

    invoke-static {}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۦۡۦۢ()I

    const-string v7, "\u06e1\u06e4\u06e3"

    invoke-static {v7}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v7

    move/from16 v33, v7

    goto/16 :goto_0

    :cond_15
    sget v7, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v15, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    mul-int/2addr v7, v15

    const v15, 0x1ec4f

    xor-int/2addr v7, v15

    move/from16 v33, v7

    goto/16 :goto_0

    :sswitch_16
    sget v7, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    if-gtz v7, :cond_16

    const/16 v7, 0x52

    sput v7, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    const-string v7, "\u06e1\u06e5\u06e8"

    move-object/from16 v15, v18

    move-object/from16 v16, v11

    :goto_a
    invoke-static {v7}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v18, v15

    move-object/from16 v20, v16

    move/from16 v33, v7

    goto/16 :goto_0

    :cond_16
    sget v7, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v15, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    add-int/2addr v7, v15

    const v15, -0x1abedd

    xor-int/2addr v7, v15

    move-object/from16 v20, v11

    move/from16 v33, v7

    goto/16 :goto_0

    :sswitch_17
    move-object/from16 v0, v23

    invoke-virtual {v0, v14}, Landroid/graphics/Paint;->setColor(I)V

    move-object/from16 v0, v25

    invoke-virtual {v10, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    const-string v15, "hoFSytkJ0QiTnWKSh0KNYg==\n"

    const-string v16, "8u4Huqlso0s=\n"

    invoke-static/range {v15 .. v16}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v7}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    sget v15, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v16, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    move/from16 v0, v16

    div-int/lit16 v0, v0, 0xc60

    move/from16 v16, v0

    mul-int v15, v15, v16

    if-eqz v15, :cond_17

    const-string v15, "\u06e2\u06e4\u06e0"

    invoke-static {v15}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v15

    move-object/from16 v31, v7

    move/from16 v33, v15

    goto/16 :goto_0

    :cond_17
    sget v15, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v16, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    add-int v15, v15, v16

    const v16, 0x1ac0bd

    add-int v15, v15, v16

    move-object/from16 v31, v7

    move/from16 v33, v15

    goto/16 :goto_0

    :sswitch_18
    sget v7, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v15, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    xor-int/lit16 v15, v15, -0xe72

    mul-int/2addr v7, v15

    if-ltz v7, :cond_18

    invoke-static {}, Landroid/view/ۢۥۢۦ;->ۤۦۢ۟()I

    :goto_b
    const-string v7, "\u06e3\u06e8\u06e3"

    :goto_c
    invoke-static {v7}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v7

    move/from16 v33, v7

    goto/16 :goto_0

    :cond_18
    sget v7, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v15, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    div-int/2addr v7, v15

    const v15, 0x1ab282

    add-int/2addr v7, v15

    move/from16 v33, v7

    goto/16 :goto_0

    :sswitch_19
    move-object/from16 v0, v30

    iget-boolean v7, v0, Lon;->p:Z

    if-eqz v7, :cond_6

    const-string v19, "l4ksyvHOl4jy\n"

    const-string v21, "tLofjLeI0c4=\n"

    sget v7, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v15, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    div-int/lit16 v15, v15, 0x262b

    sub-int/2addr v7, v15

    if-ltz v7, :cond_28

    const-string v7, "\u06e8\u06e7\u06df"

    invoke-static {v7}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v7

    move/from16 v33, v7

    goto/16 :goto_0

    :sswitch_1a
    sget v7, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v15, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    or-int/lit16 v15, v15, 0x206d

    xor-int/2addr v7, v15

    if-ltz v7, :cond_19

    const/16 v7, 0x5b

    sput v7, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    const-string v7, "\u06df\u06df\u06e0"

    invoke-static {v7}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v7

    move/from16 v33, v7

    goto/16 :goto_0

    :cond_19
    sget v7, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v15, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    rem-int/2addr v7, v15

    const v15, 0x1ab6cd

    add-int/2addr v7, v15

    move/from16 v33, v7

    goto/16 :goto_0

    :sswitch_1b
    const/high16 v7, 0x41400000    # 12.0f

    add-float/2addr v7, v6

    sub-float/2addr v7, v12

    const/high16 v15, 0x41400000    # 12.0f

    sub-float v24, v7, v15

    sget-object v16, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    move-object/from16 v0, p0

    iget-object v15, v0, Lpk;->c:Landroid/graphics/Paint;

    const-string v23, "\u06e5\u06e1\u06e4"

    move-object/from16 v7, v22

    move-object/from16 v26, v23

    move/from16 v27, v24

    :goto_d
    invoke-static/range {v26 .. v26}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v26

    move-object/from16 v22, v7

    move-object/from16 v23, v15

    move-object/from16 v24, v16

    move/from16 v33, v26

    goto/16 :goto_0

    :sswitch_1c
    invoke-static {}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۠ۥۥ۟()I

    move-result v7

    if-gtz v7, :cond_1a

    const/16 v7, 0x19

    sput v7, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    const-string v7, "\u06e7\u06e2\u06e2"

    invoke-static {v7}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v7

    move/from16 v33, v7

    move/from16 v12, v17

    goto/16 :goto_0

    :cond_1a
    const-string v7, "\u06e2\u06e7"

    move-object v15, v7

    move/from16 v16, v14

    move/from16 v12, v17

    goto/16 :goto_9

    :sswitch_1d
    invoke-static {}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣۣۢۢ()I

    move-result v7

    if-gtz v7, :cond_1b

    const/16 v7, 0x61

    sput v7, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    const-string v7, "\u06e3\u06e8"

    move-object/from16 v18, v19

    :goto_e
    invoke-static {v7}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v7

    move/from16 v33, v7

    goto/16 :goto_0

    :cond_1b
    const-string v7, "\u06df\u06e4\u06e2"

    move-object/from16 v15, v19

    move-object/from16 v16, v20

    goto/16 :goto_a

    :cond_1c
    :sswitch_1e
    sget v7, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v15, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    mul-int/2addr v7, v15

    const v15, 0xb85d

    add-int/2addr v7, v15

    move/from16 v33, v7

    goto/16 :goto_0

    :sswitch_1f
    move-object/from16 v8, v21

    goto/16 :goto_b

    :sswitch_20
    sget v7, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v15, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    mul-int/2addr v7, v15

    const v15, 0x160a89

    xor-int/2addr v7, v15

    move/from16 v33, v7

    goto/16 :goto_0

    :sswitch_21
    move-object/from16 v0, p1

    move/from16 v1, v34

    move/from16 v2, v35

    move/from16 v3, v27

    move-object/from16 v4, v23

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    sget v7, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v15, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    mul-int/lit16 v15, v15, -0x17ec

    or-int/2addr v7, v15

    if-ltz v7, :cond_1

    const-string v7, "\u06e8\u06e3\u06e6"

    invoke-static {v7}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v7

    move/from16 v33, v7

    goto/16 :goto_0

    :sswitch_22
    const-string v7, "\u06e2\u06e7"

    goto/16 :goto_3

    :sswitch_23
    const v7, 0xfffe51

    sget v15, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    xor-int/2addr v7, v15

    move-object/from16 v0, v23

    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setColor(I)V

    sget v7, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v15, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    add-int/2addr v7, v15

    const v15, -0xd97e

    xor-int/2addr v7, v15

    move/from16 v33, v7

    goto/16 :goto_0

    :sswitch_24
    move-object/from16 v0, v25

    invoke-virtual {v10, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    const-string v15, "JCS9L8pVDY0xOI13lB5R5w==\n"

    const-string v16, "UEvoX7owf84=\n"

    invoke-static/range {v15 .. v16}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v7}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v15, "r1aVMzg6tg==\n"

    const-string v16, "jBDTdX588KI=\n"

    invoke-static/range {v15 .. v16}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v7, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1e

    sget v7, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v15, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    div-int/lit16 v15, v15, -0xfa0

    or-int/2addr v7, v15

    if-gtz v7, :cond_1d

    invoke-static {}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟ۢۡ۠ۦ()I

    const-string v7, "\u06e2\u06e7"

    invoke-static {v7}, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۧۦۢ(Ljava/lang/Object;)I

    move-result v7

    move/from16 v33, v7

    goto/16 :goto_0

    :cond_1d
    const-string v7, "\u06e7\u06e4\u06e2"

    :goto_f
    invoke-static {v7}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v7

    move/from16 v33, v7

    goto/16 :goto_0

    :cond_1e
    :sswitch_25
    sget v7, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v15, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    or-int/2addr v7, v15

    const v15, 0x1aaf65

    add-int/2addr v7, v15

    move/from16 v33, v7

    goto/16 :goto_0

    :sswitch_26
    sget v7, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v15, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    add-int/lit16 v15, v15, -0x943

    add-int/2addr v7, v15

    if-ltz v7, :cond_1f

    const-string v7, "\u06e2\u06e6\u06e5"

    goto/16 :goto_5

    :cond_1f
    const-string v7, "\u06e6\u06e1\u06e6"

    goto/16 :goto_3

    :sswitch_27
    sget v7, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v14, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    add-int/lit16 v14, v14, 0x24a1

    or-int/2addr v7, v14

    if-ltz v7, :cond_20

    const/16 v7, 0x42

    sput v7, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    const-string v7, "\u06e3\u06e4\u06e0"

    invoke-static {v7}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v7

    move/from16 v33, v7

    move v14, v5

    goto/16 :goto_0

    :cond_20
    sget v7, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v14, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    div-int/2addr v7, v14

    const v14, 0x1aab35

    add-int/2addr v7, v14

    move/from16 v33, v7

    move v14, v5

    goto/16 :goto_0

    :sswitch_28
    move-object/from16 v0, v18

    invoke-static {v0, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    sget v15, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v16, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    move/from16 v0, v16

    rem-int/lit16 v0, v0, 0x199d

    move/from16 v16, v0

    div-int v15, v15, v16

    if-gtz v15, :cond_21

    invoke-static {}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۦۤۨۢ()I

    const-string v15, "\u06e0\u06e7\u06e5"

    invoke-static {v15}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v15

    move-object/from16 v28, v7

    move/from16 v33, v15

    goto/16 :goto_0

    :cond_21
    move-object v15, v7

    :goto_10
    const-string v7, "\u06e2\u06e3\u06e6"

    move-object/from16 v28, v15

    goto/16 :goto_2

    :sswitch_29
    move-object/from16 v0, p0

    iget-boolean v7, v0, Lpk;->b:Z

    if-eqz v7, :cond_22

    sget-object v7, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    move-object/from16 v0, v23

    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/high16 v7, 0x40000000    # 2.0f

    invoke-static {v7}, Lff;->p(F)F

    move-result v7

    move-object/from16 v0, v23

    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    const-string v7, "\u06e8\u06e3\u06e6"

    goto/16 :goto_3

    :cond_22
    :sswitch_2a
    sget v7, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v15, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    mul-int/lit16 v15, v15, 0xc6e

    xor-int/2addr v7, v15

    if-gtz v7, :cond_23

    const-string v7, "\u06e1\u06e4\u06e6"

    goto/16 :goto_f

    :cond_23
    sget v7, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v15, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    mul-int/2addr v7, v15

    const v15, 0x11fa9c

    add-int/2addr v7, v15

    move/from16 v33, v7

    goto/16 :goto_0

    :sswitch_2b
    move-object/from16 v0, p1

    move/from16 v1, v34

    move/from16 v2, v35

    move/from16 v3, v27

    move-object/from16 v4, v23

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    sget-object v25, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    move-object/from16 v0, v25

    invoke-virtual {v10, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    sget v15, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v16, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    move/from16 v0, v16

    add-int/lit16 v0, v0, -0x689

    move/from16 v16, v0

    xor-int v15, v15, v16

    if-ltz v15, :cond_24

    const-string v22, "\u06e3\u06e6\u06e0"

    move-object/from16 v15, v23

    move-object/from16 v16, v24

    move-object/from16 v26, v22

    goto/16 :goto_d

    :cond_24
    sget v15, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v16, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    rem-int v15, v15, v16

    const v16, 0x1ab074

    add-int v15, v15, v16

    move-object/from16 v22, v7

    move/from16 v33, v15

    goto/16 :goto_0

    :sswitch_2c
    move-object/from16 v0, v30

    iget-boolean v7, v0, Lon;->p:Z

    if-eqz v7, :cond_1c

    const-string v7, "8Bs0SR+VjWCV\n"

    const-string v14, "014CD1nTyyY=\n"

    invoke-static {v7, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v7

    sget v14, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v15, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    add-int/lit16 v15, v15, 0x2582

    div-int/2addr v14, v15

    if-eqz v14, :cond_f

    const/4 v14, 0x1

    sput v14, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    move-object/from16 v15, v28

    move v14, v7

    goto/16 :goto_10

    :sswitch_2d
    const-string v7, "0clzftZcxg==\n"

    const-string v15, "8o81OJAagIY=\n"

    invoke-static {v7, v15}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v0, v31

    invoke-virtual {v0, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_c

    move-object/from16 v0, v30

    iget-boolean v7, v0, Lon;->p:Z

    if-nez v7, :cond_c

    const-string v7, "\u06e5\u06e2\u06e2"

    goto/16 :goto_e

    :sswitch_2e
    const-string v7, "IwAYhLKgz7E2HCjc7OuT2w==\n"

    const-string v15, "V29N9MLFvfI=\n"

    invoke-static {v7, v15}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v0, v22

    invoke-static {v7, v0}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v7, "WCR4/J4pJg==\n"

    const-string v15, "e2I+uthvYPE=\n"

    invoke-static {v7, v15}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v0, v22

    invoke-virtual {v0, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v15

    move-object/from16 v0, p0

    iget-object v7, v0, Lpk;->d:Lon;

    const-string v16, "\u06df\u06df\u06e0"

    invoke-static/range {v16 .. v16}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v16

    move-object/from16 v30, v7

    move/from16 v32, v15

    move/from16 v33, v16

    goto/16 :goto_0

    :sswitch_2f
    const/high16 v7, 0x40000000    # 2.0f

    invoke-static {v7}, Lff;->p(F)F

    move-result v17

    sget v7, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    if-gtz v7, :cond_26

    invoke-static {}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۦۡۧۨ()I

    move-object v7, v10

    :cond_25
    const-string v10, "\u06e3\u06e5\u06e8"

    invoke-static {v10}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v15

    move-object v10, v7

    move/from16 v33, v15

    goto/16 :goto_0

    :cond_26
    sget v7, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v15, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    or-int/2addr v7, v15

    const v15, 0x1ab330

    add-int/2addr v7, v15

    move/from16 v33, v7

    goto/16 :goto_0

    :sswitch_30
    move-object v7, v10

    move-object v11, v10

    goto/16 :goto_7

    :sswitch_31
    if-eqz v32, :cond_a

    sget-object v7, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    move-object/from16 v0, v23

    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7}, Lff;->p(F)F

    move-result v7

    move-object/from16 v0, v23

    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    sget v7, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v15, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    or-int/lit16 v15, v15, 0x402

    mul-int/2addr v7, v15

    if-gtz v7, :cond_27

    const/16 v7, 0x3d

    sput v7, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    const-string v7, "\u06e1\u06e3\u06e5"

    invoke-static {v7}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v7

    move/from16 v33, v7

    goto/16 :goto_0

    :cond_27
    const-string v7, "\u06e6\u06e2"

    goto/16 :goto_c

    :sswitch_32
    sget v7, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v15, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    mul-int/lit16 v15, v15, 0x12ef

    xor-int/2addr v7, v15

    if-ltz v7, :cond_29

    const/16 v7, 0x2e

    sput v7, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    :cond_28
    const-string v7, "\u06e0\u06df\u06df"

    goto/16 :goto_6

    :cond_29
    sget v7, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v15, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    rem-int/2addr v7, v15

    const v15, 0x1abca9

    add-int/2addr v7, v15

    move/from16 v33, v7

    goto/16 :goto_0

    :sswitch_33
    const-string v18, "iWXNQb7JPQ==\n"

    const-string v9, "qiD9BI6MDfc=\n"

    sget v7, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v15, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    mul-int/2addr v7, v15

    const v15, 0x2ee10

    sub-int/2addr v7, v15

    move/from16 v33, v7

    goto/16 :goto_0

    :sswitch_34
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe9 -> :sswitch_0
        0xdc08 -> :sswitch_10
        0xdc21 -> :sswitch_a
        0xdc45 -> :sswitch_1b
        0xdc65 -> :sswitch_3
        0xdc7f -> :sswitch_1
        0xdc84 -> :sswitch_18
        0xdcbc -> :sswitch_19
        0xdcfc -> :sswitch_9
        0x1aa700 -> :sswitch_31
        0x1aa703 -> :sswitch_26
        0x1aa79c -> :sswitch_6
        0x1aa79d -> :sswitch_28
        0x1aa7be -> :sswitch_14
        0x1aaac0 -> :sswitch_1f
        0x1aaae5 -> :sswitch_d
        0x1aab3c -> :sswitch_17
        0x1aab82 -> :sswitch_7
        0x1aaba1 -> :sswitch_14
        0x1aaba2 -> :sswitch_33
        0x1aabbb -> :sswitch_2f
        0x1aabbe -> :sswitch_12
        0x1aaea1 -> :sswitch_16
        0x1aaec5 -> :sswitch_2e
        0x1aaec6 -> :sswitch_25
        0x1aaf03 -> :sswitch_2a
        0x1aaf20 -> :sswitch_4
        0x1aaf44 -> :sswitch_30
        0x1ab282 -> :sswitch_e
        0x1ab2c5 -> :sswitch_1a
        0x1ab2de -> :sswitch_e
        0x1ab301 -> :sswitch_1c
        0x1ab322 -> :sswitch_8
        0x1ab605 -> :sswitch_29
        0x1ab661 -> :sswitch_22
        0x1ab69f -> :sswitch_2
        0x1ab6c5 -> :sswitch_26
        0x1ab6c6 -> :sswitch_2b
        0x1ab6dd -> :sswitch_1e
        0x1ab71e -> :sswitch_1d
        0x1abade -> :sswitch_12
        0x1abda7 -> :sswitch_22
        0x1abdc8 -> :sswitch_c
        0x1abde5 -> :sswitch_23
        0x1abe21 -> :sswitch_2c
        0x1abe25 -> :sswitch_34
        0x1abe81 -> :sswitch_b
        0x1ac187 -> :sswitch_f
        0x1ac18b -> :sswitch_11
        0x1ac241 -> :sswitch_32
        0x1ac50d -> :sswitch_2d
        0x1ac567 -> :sswitch_5
        0x1ac5a5 -> :sswitch_15
        0x1ac620 -> :sswitch_20
        0x1ac8c9 -> :sswitch_21
        0x1ac927 -> :sswitch_13
        0x1ac94b -> :sswitch_24
        0x1ac9c0 -> :sswitch_27
    .end sparse-switch
.end method

.method public final setSelectedTheme(Z)V
    .locals 2

    const-string v0, "\u06e0\u06df\u06e2"

    invoke-static {v0}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Landroidx/core/widget/ۣۤۨۢ;->ۥۢۡۥ()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->۟ۢۦۡۦ()I

    const-string v0, "\u06df\u06df\u06e7"

    :goto_1
    invoke-static {v0}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v1, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sub-int/2addr v0, v1

    const v1, 0x1aa9dd

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_1
    iput-boolean p1, p0, Lpk;->b:Z

    const-string v0, "\u06e7\u06e3\u06e1"

    goto :goto_1

    :sswitch_2
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc9a -> :sswitch_0
        0x1aaac3 -> :sswitch_1
        0x1ac585 -> :sswitch_2
    .end sparse-switch
.end method
