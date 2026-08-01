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

.field public final h:Lon;


# direct methods
.method public constructor <init>(Lon;Landroid/app/Activity;Ljava/lang/String;Z)V
    .locals 16

    const-string v2, "AaEp3Ljzmg==\n"

    const-string v3, "Ys5HqN2L7vI=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p2

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "EXaDo/JuFw==\n"

    const-string v3, "YhPmx7oLb1c=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p3

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v0, p1

    move-object/from16 v1, p0

    iput-object v0, v1, Lf6;->h:Lon;

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v2, 0x0

    const-string v9, "\u06e3\u06e5\u06e5"

    invoke-static {v9}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v12

    move v9, v3

    move v10, v7

    :goto_0
    sparse-switch v12, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    sget v3, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    xor-int/lit16 v3, v3, -0xdf

    invoke-static {v3, v4, v11, v8}, Landroid/graphics/Color;->argb(IIII)I

    move-result v3

    move-object/from16 v0, p0

    iput v3, v0, Lf6;->g:I

    sget v3, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    if-gtz v3, :cond_0

    invoke-static {}, Landroidx/emoji2/text/ۣۣ۟۟۠;->ۢۡۢۦ()I

    :goto_1
    const-string v3, "\u06df\u06e0\u06e1"

    invoke-static {v3}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v3

    move v12, v3

    goto :goto_0

    :cond_0
    const-string v3, "\u06e7\u06e0\u06e6"

    :goto_2
    invoke-static {v3}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v3

    move v12, v3

    goto :goto_0

    :sswitch_2
    invoke-static {v5}, Landroid/graphics/Color;->blue(I)I

    move-result v3

    int-to-double v12, v3

    const-wide v14, 0x3fe6666666666666L    # 0.7

    mul-double/2addr v12, v14

    double-to-int v3, v12

    sget v7, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v9, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    div-int/2addr v7, v9

    const v9, 0x1ab608

    xor-int/2addr v7, v9

    move v9, v3

    move v12, v7

    goto :goto_0

    :sswitch_3
    move-object/from16 v0, p0

    iput v5, v0, Lf6;->e:I

    invoke-static {}, Landroid/app/ۦۥۡ۠;->ۥۣۡۧ()I

    move-result v3

    if-ltz v3, :cond_1

    invoke-static {}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣ۟۠()I

    const-string v3, "\u06e3\u06e8\u06e0"

    invoke-static {v3}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v3

    move v12, v3

    goto :goto_0

    :cond_1
    const-string v3, "\u06e0\u06e6\u06e8"

    goto :goto_2

    :sswitch_4
    move/from16 v0, p4

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lf6;->b:Z

    goto :goto_1

    :sswitch_5
    invoke-static {v5}, Landroid/graphics/Color;->green(I)I

    move-result v3

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۣۤۧ()I

    move-result v7

    if-gtz v7, :cond_2

    invoke-static {}, Landroidx/savedstate/ۢۨۧۤ;->ۨ۠ۨۡ()I

    const-string v7, "\u06e7\u06e2"

    invoke-static {v7}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v7

    move v11, v3

    move v12, v7

    goto :goto_0

    :cond_2
    sget v7, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v11, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    xor-int/2addr v7, v11

    const v11, 0x1abee7

    add-int/2addr v7, v11

    move v11, v3

    move v12, v7

    goto :goto_0

    :sswitch_6
    move-object/from16 v0, p1

    move-object/from16 v1, p3

    invoke-static {v0, v1}, Li6;->b(Lon;Ljava/lang/String;)I

    move-result v5

    sget v3, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v7, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    xor-int/lit16 v7, v7, -0x1465

    add-int/2addr v3, v7

    if-ltz v3, :cond_3

    const-string v3, "\u06e8\u06e5\u06e7"

    invoke-static {v3}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v3

    move v12, v3

    goto/16 :goto_0

    :cond_3
    move v3, v4

    :goto_3
    const-string v4, "\u06e1\u06e7\u06e1"

    invoke-static {v4}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v7

    move v4, v3

    move v12, v7

    goto/16 :goto_0

    :sswitch_7
    invoke-static {}, L۟ۡۦۧۤ;->۟۟۠ۡۢ()I

    move-result v3

    if-ltz v3, :cond_8

    sget v3, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    if-gtz v3, :cond_4

    invoke-static {}, Landroid/app/ۦۥۡ۠;->ۥۣۡۧ()I

    const-string v3, "\u06e3\u06e5\u06e5"

    :goto_4
    invoke-static {v3}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v3

    move v12, v3

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u06e2\u06e5\u06e6"

    invoke-static {v3}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v3

    move v12, v3

    goto/16 :goto_0

    :sswitch_8
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v3, v2}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    const-string v7, "\u06e2\u06e7"

    move v3, v8

    :goto_5
    invoke-static {v7}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v7

    move v8, v3

    move v12, v7

    goto/16 :goto_0

    :sswitch_9
    move-object/from16 v0, p3

    move-object/from16 v1, p0

    iput-object v0, v1, Lf6;->a:Ljava/lang/String;

    sget v3, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v7, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    div-int/2addr v3, v7

    const v7, 0xdcdb

    add-int/2addr v3, v7

    move v12, v3

    goto/16 :goto_0

    :sswitch_a
    const-string v2, "0ujSSYps4ih5TEB8zjSf8Jso75"

    invoke-static {v2}, Landroidx/appcompat/widget/۟ۢۨۦ;->ۥۦۤۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v2

    sget v3, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v7, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    rem-int/lit16 v7, v7, -0x17fe

    add-int/2addr v3, v7

    if-gtz v3, :cond_5

    const/16 v3, 0x3d

    sput v3, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    const-string v3, "\u06e7\u06e1\u06e8"

    invoke-static {v3}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v3

    move v12, v3

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06e8\u06e5\u06e7"

    goto :goto_4

    :sswitch_b
    invoke-static {v5}, Landroid/graphics/Color;->red(I)I

    move-result v3

    sget v4, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    if-gtz v4, :cond_6

    invoke-static {}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۦۤۨۢ()I

    goto :goto_3

    :cond_6
    sget v4, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v7, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    or-int/2addr v4, v7

    const v7, 0x1aaaee

    add-int/2addr v7, v4

    move v4, v3

    move v12, v7

    goto/16 :goto_0

    :sswitch_c
    invoke-static {v5}, Landroid/graphics/Color;->green(I)I

    move-result v3

    int-to-double v6, v3

    const-wide v12, 0x3fe6666666666666L    # 0.7

    mul-double/2addr v6, v12

    double-to-int v3, v6

    const-string v6, "\u06e5\u06e6\u06e3"

    move-object v7, v6

    :goto_6
    invoke-static {v7}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v7

    move v6, v3

    move v12, v7

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟ۢۡ۟۟()I

    move-result v3

    if-gtz v3, :cond_7

    const-string v3, "\u06e4\u06e1"

    goto/16 :goto_2

    :cond_7
    sget v3, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v7, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    mul-int/2addr v3, v7

    const v7, 0x1eb248

    xor-int/2addr v3, v7

    move v12, v3

    goto/16 :goto_0

    :cond_8
    :sswitch_e
    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->۟ۡۥ۟ۨ()I

    move-result v3

    if-ltz v3, :cond_9

    invoke-static {}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟۟ۤۦۨ()I

    const-string v7, "\u06e5\u06df\u06e1"

    move v3, v6

    goto :goto_6

    :cond_9
    sget v3, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v7, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    div-int/2addr v3, v7

    const v7, 0xdc45

    add-int/2addr v3, v7

    move v12, v3

    goto/16 :goto_0

    :sswitch_f
    new-instance v3, Landroid/graphics/RectF;

    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    move-object/from16 v0, p0

    iput-object v3, v0, Lf6;->d:Landroid/graphics/RectF;

    sget v3, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v7, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    xor-int/lit16 v7, v7, -0x1848

    mul-int/2addr v3, v7

    if-ltz v3, :cond_a

    invoke-static {}, Landroidx/versionedparcelable/ۣۢۥ;->ۦۦۡۤ()I

    :goto_7
    const-string v3, "\u06e6\u06e2\u06e1"

    invoke-static {v3}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۣ۠ۧۢ(Ljava/lang/Object;)I

    move-result v3

    move v12, v3

    goto/16 :goto_0

    :cond_a
    sget v3, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v7, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    add-int/2addr v3, v7

    const v7, 0x1ac5fc

    add-int/2addr v3, v7

    move v12, v3

    goto/16 :goto_0

    :sswitch_10
    invoke-static {v5}, Landroid/graphics/Color;->blue(I)I

    move-result v3

    sget v7, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    if-ltz v7, :cond_b

    const-string v7, "\u06e2\u06e5\u06e6"

    goto/16 :goto_5

    :cond_b
    move v8, v3

    goto :goto_7

    :sswitch_11
    new-instance v3, Landroid/graphics/Paint;

    const/4 v7, 0x1

    invoke-direct {v3, v7}, Landroid/graphics/Paint;-><init>(I)V

    move-object/from16 v0, p0

    iput-object v3, v0, Lf6;->c:Landroid/graphics/Paint;

    const-string v7, "\u06e4\u06e2\u06e1"

    move v3, v6

    goto :goto_6

    :sswitch_12
    invoke-static {v5}, Landroid/graphics/Color;->red(I)I

    move-result v3

    int-to-double v12, v3

    const-wide v14, 0x3fe6666666666666L    # 0.7

    mul-double/2addr v12, v14

    double-to-int v3, v12

    sget v7, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v10, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    xor-int/2addr v7, v10

    const v10, 0x1abbc7

    add-int/2addr v7, v10

    move v10, v3

    move v12, v7

    goto/16 :goto_0

    :sswitch_13
    sget v3, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    xor-int/lit16 v3, v3, -0x39e

    invoke-static {v3, v10, v6, v9}, Landroid/graphics/Color;->argb(IIII)I

    move-result v3

    move-object/from16 v0, p0

    iput v3, v0, Lf6;->f:I

    sget v3, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v7, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    add-int/2addr v3, v7

    const v7, 0x1ac5a6

    add-int/2addr v3, v7

    move v12, v3

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc45 -> :sswitch_0
        0xdcdb -> :sswitch_4
        0x1aa720 -> :sswitch_11
        0x1aab61 -> :sswitch_5
        0x1aaba2 -> :sswitch_12
        0x1aaf7b -> :sswitch_3
        0x1ab303 -> :sswitch_a
        0x1ab609 -> :sswitch_13
        0x1ab6c3 -> :sswitch_9
        0x1ab71b -> :sswitch_d
        0x1aba23 -> :sswitch_f
        0x1aba87 -> :sswitch_c
        0x1abde8 -> :sswitch_e
        0x1abe22 -> :sswitch_10
        0x1abe62 -> :sswitch_2
        0x1ac1a5 -> :sswitch_1
        0x1ac52d -> :sswitch_7
        0x1ac54e -> :sswitch_b
        0x1ac927 -> :sswitch_6
        0x1ac98a -> :sswitch_8
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

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v17, 0x0

    const/16 v16, 0x0

    const/4 v10, 0x0

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v3, 0x0

    const/4 v8, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v13, 0x0

    const-string v5, "\u06e2\u06e6\u06e6"

    invoke-static {v5}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v18, v3

    move/from16 v19, v5

    move/from16 v20, v6

    move/from16 v21, v7

    :goto_0
    sparse-switch v19, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const/high16 v3, 0x40000000    # 2.0f

    invoke-static {v3}, Lff;->p(F)F

    move-result v3

    invoke-virtual {v8, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    move-object/from16 v0, p0

    iget v3, v0, Lf6;->g:I

    invoke-virtual {v8, v3}, Landroid/graphics/Paint;->setColor(I)V

    sget v3, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v5, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    mul-int/lit16 v5, v5, 0x4eb

    xor-int/2addr v3, v5

    if-ltz v3, :cond_7

    invoke-static {}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۥۣۢۡ()I

    const-string v3, "\u06e4\u06e3\u06e7"

    invoke-static {v3}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v3

    move/from16 v19, v3

    goto :goto_0

    :sswitch_1
    move-object/from16 v0, p0

    iget v3, v0, Lf6;->f:I

    invoke-virtual {v8, v3}, Landroid/graphics/Paint;->setColor(I)V

    const/4 v5, 0x0

    const/high16 v6, 0x43340000    # 180.0f

    const/4 v7, 0x1

    move-object/from16 v3, p1

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    sget v3, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v5, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    rem-int/lit16 v5, v5, -0x14c1

    mul-int/2addr v3, v5

    if-gtz v3, :cond_1

    const/16 v3, 0x29

    sput v3, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    move v3, v10

    :cond_0
    const-string v5, "\u06e4\u06e1\u06e8"

    invoke-static {v5}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v5

    move/from16 v19, v5

    move v10, v3

    goto :goto_0

    :cond_1
    sget v3, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v5, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    add-int/2addr v3, v5

    const v5, 0x1ac6a1

    add-int/2addr v3, v5

    move/from16 v19, v3

    goto :goto_0

    :cond_2
    :sswitch_2
    sget v3, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v5, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    rem-int/lit16 v5, v5, -0x135a

    or-int/2addr v3, v5

    if-ltz v3, :cond_3

    invoke-static {}, Landroidx/activity/ۣ۟۠ۤۢ;->۟۠۠ۤۥ()I

    const-string v3, "\u06e0\u06e6\u06e2"

    :goto_1
    invoke-static {v3}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v19, v3

    goto :goto_0

    :cond_3
    sget v3, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v5, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    rem-int/2addr v3, v5

    const v5, 0x1aae37

    xor-int/2addr v3, v5

    move/from16 v19, v3

    goto :goto_0

    :sswitch_3
    invoke-static {}, Landroidx/legacy/content/۠ۥۣۥ;->۟۠ۧ۟۟()I

    move-result v3

    if-gtz v3, :cond_4

    move v3, v10

    :goto_2
    const-string v5, "\u06e3\u06e8"

    invoke-static {v5}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v19, v5

    move v11, v3

    goto/16 :goto_0

    :cond_4
    sget v3, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v5, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    div-int/2addr v3, v5

    const v5, 0x1ab6ff

    add-int/2addr v3, v5

    move/from16 v19, v3

    move v11, v10

    goto/16 :goto_0

    :sswitch_4
    invoke-virtual {v8, v13}, Landroid/graphics/Paint;->setColor(I)V

    sget v3, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    if-gtz v3, :cond_5

    const/16 v3, 0xf

    sput v3, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    const-string v3, "\u06e2\u06e6\u06e6"

    invoke-static {v3}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v19, v3

    goto/16 :goto_0

    :cond_5
    sget v3, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v5, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    add-int/2addr v3, v5

    const v5, 0xdd6b

    add-int/2addr v3, v5

    move/from16 v19, v3

    goto/16 :goto_0

    :sswitch_5
    if-eqz v16, :cond_2

    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v8, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    sget v3, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    if-gtz v3, :cond_6

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->۟ۢۦۡۦ()I

    const-string v3, "\u06e7\u06e6\u06df"

    invoke-static {v3}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v19, v3

    goto/16 :goto_0

    :cond_6
    move v3, v11

    goto :goto_2

    :sswitch_6
    const/high16 v3, 0x40000000    # 2.0f

    invoke-static {v3}, Lff;->p(F)F

    move-result v3

    :goto_3
    const-string v5, "\u06e1\u06e7\u06e1"

    move/from16 v6, v16

    move/from16 v7, v17

    move v15, v3

    :goto_4
    invoke-static {v5}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v16, v6

    move/from16 v19, v3

    move/from16 v17, v7

    goto/16 :goto_0

    :sswitch_7
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, v3, v5

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    const/high16 v6, 0x40000000    # 2.0f

    div-float v6, v3, v6

    sget v3, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v7, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    rem-int/2addr v3, v7

    const v7, 0x1ab5c6

    add-int/2addr v3, v7

    move/from16 v19, v3

    move/from16 v20, v5

    move/from16 v21, v6

    goto/16 :goto_0

    :sswitch_8
    if-eqz v16, :cond_9

    const/high16 v3, 0x40800000    # 4.0f

    invoke-static {v3}, Lff;->p(F)F

    move-result v3

    sget v5, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v6, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    xor-int/lit16 v6, v6, 0x1f11

    mul-int/2addr v5, v6

    if-ltz v5, :cond_0

    const/16 v5, 0x4d

    sput v5, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    const-string v5, "\u06e7\u06e6\u06e5"

    invoke-static {v5}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v19, v5

    move v10, v3

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06e4\u06e5\u06e0"

    :goto_5
    invoke-static {v3}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v19, v3

    goto/16 :goto_0

    :sswitch_9
    const v3, 0x3eb33333    # 0.35f

    mul-float/2addr v3, v9

    move-object/from16 v0, p1

    move/from16 v1, v20

    move/from16 v2, v21

    invoke-virtual {v0, v1, v2, v3, v8}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    const-string v3, "\u06e1\u06df\u06e0"

    goto/16 :goto_1

    :sswitch_a
    const/high16 v3, 0x41f80000    # 31.0f

    add-float v3, v3, v17

    sub-float/2addr v3, v11

    const/high16 v4, 0x41f80000    # 31.0f

    sub-float v5, v3, v4

    move-object/from16 v0, p0

    iget-object v4, v0, Lf6;->d:Landroid/graphics/RectF;

    const-string v3, "\u06e4\u06e3\u06e7"

    :goto_6
    invoke-static {v3}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v19, v3

    move v9, v5

    goto/16 :goto_0

    :sswitch_b
    const-string v3, "\u06e6\u06e4\u06e1"

    move v5, v9

    goto :goto_6

    :sswitch_c
    const-string v3, "PNWP0z++\n"

    const-string v5, "X7ThpV7Nvi4=\n"

    invoke-static {v3, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, p1

    invoke-static {v3, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    sget v3, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    if-gtz v3, :cond_8

    const-string v3, "\u06e1\u06e3\u06e8"

    invoke-static {v3}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v19, v3

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06e1\u06e3\u06e8"

    move v5, v9

    goto :goto_6

    :cond_9
    :sswitch_d
    sget v3, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v5, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    div-int/lit16 v5, v5, 0x1938

    xor-int/2addr v3, v5

    if-gtz v3, :cond_a

    invoke-static {}, Landroidx/profileinstaller/ۣ۠ۨۢ;->۟ۤۥ۟۟()I

    const-string v3, "\u06e5\u06e7\u06e2"

    goto :goto_5

    :cond_a
    sget v3, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v5, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sub-int/2addr v3, v5

    const v5, 0x1ab348

    add-int/2addr v3, v5

    move/from16 v19, v3

    goto/16 :goto_0

    :sswitch_e
    sget v3, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v5, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    xor-int/2addr v3, v5

    const v5, -0x1ab110

    xor-int/2addr v3, v5

    move/from16 v19, v3

    goto/16 :goto_0

    :cond_b
    :sswitch_f
    invoke-static {}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟۟ۤۥ۠()I

    move-result v3

    if-gtz v3, :cond_c

    const/16 v3, 0x35

    sput v3, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    const-string v3, "\u06df\u06e4\u06e3"

    :goto_7
    invoke-static {v3}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v19, v3

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e1\u06e5\u06e4"

    goto :goto_7

    :sswitch_10
    const/4 v3, -0x1

    invoke-static {}, Landroidx/fragment/app/۟ۧۡۦ;->ۧۤۨ۟()I

    move-result v5

    if-gtz v5, :cond_10

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۣۤۧ()I

    const-string v5, "\u06e8\u06e1\u06e4"

    invoke-static {v5}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v5

    move v14, v3

    move/from16 v19, v5

    goto/16 :goto_0

    :sswitch_11
    sget v3, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    if-ltz v3, :cond_d

    invoke-static {}, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۣۨ()I

    const-string v3, "\u06e1\u06df\u06e0"

    :goto_8
    invoke-static {v3}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v19, v3

    move v13, v14

    goto/16 :goto_0

    :cond_d
    const-string v3, "\u06e6\u06e4\u06e1"

    goto :goto_8

    :sswitch_12
    sget v3, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v5, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    add-int/lit16 v5, v5, 0x12fa

    or-int/2addr v3, v5

    if-gtz v3, :cond_e

    invoke-static {}, Lio/fastkv/ۦۣ۠ۨ;->۠ۡۨۧ()I

    move v3, v12

    :goto_9
    const-string v5, "\u06e0\u06e7\u06e6"

    invoke-static {v5}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v19, v5

    move v13, v3

    goto/16 :goto_0

    :cond_e
    const-string v3, "\u06df\u06e6\u06e1"

    invoke-static {v3}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v19, v3

    move v13, v12

    goto/16 :goto_0

    :sswitch_13
    const/high16 v3, 0x41600000    # 14.0f

    sub-float v3, v20, v3

    sub-float/2addr v3, v9

    const/high16 v5, 0x41600000    # 14.0f

    add-float/2addr v3, v5

    const/high16 v5, 0x41e00000    # 28.0f

    add-float v5, v5, v21

    sub-float/2addr v5, v9

    const/high16 v6, 0x41e00000    # 28.0f

    sub-float/2addr v5, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    sub-float v7, v7, v20

    sub-float/2addr v7, v9

    sub-float/2addr v6, v7

    const/4 v7, 0x0

    sub-float/2addr v7, v9

    sub-float v7, v21, v7

    invoke-virtual {v4, v3, v5, v6, v7}, Landroid/graphics/RectF;->set(FFFF)V

    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    sget v5, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v6, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    add-int/lit16 v6, v6, 0x2cb

    add-int/2addr v5, v6

    if-ltz v5, :cond_f

    const/16 v5, 0x2f

    sput v5, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    const-string v5, "\u06e6\u06e1\u06e8"

    invoke-static {v5}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v18, v3

    move/from16 v19, v5

    goto/16 :goto_0

    :cond_f
    sget v5, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v6, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sub-int/2addr v5, v6

    const v6, 0x1abd76

    add-int/2addr v5, v6

    move-object/from16 v18, v3

    move/from16 v19, v5

    goto/16 :goto_0

    :sswitch_14
    move-object/from16 v0, p0

    iget-object v8, v0, Lf6;->c:Landroid/graphics/Paint;

    move-object/from16 v0, v18

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    sget v3, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    if-gtz v3, :cond_11

    const/16 v3, 0x21

    sput v3, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    move v3, v14

    :cond_10
    const-string v5, "\u06df\u06e2\u06e6"

    invoke-static {v5}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v5

    move v14, v3

    move/from16 v19, v5

    goto/16 :goto_0

    :cond_11
    sget v3, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v5, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    div-int/2addr v3, v5

    const v5, -0x1ac8ee

    xor-int/2addr v3, v5

    move/from16 v19, v3

    goto/16 :goto_0

    :sswitch_15
    sget v3, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v5, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    rem-int/lit16 v5, v5, -0x74d

    mul-int/2addr v3, v5

    if-ltz v3, :cond_12

    invoke-static {}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۡۦۣۨ()I

    move v3, v15

    goto/16 :goto_3

    :cond_12
    const-string v3, "\u06e8\u06e1\u06e4"

    invoke-static {v3}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v19, v3

    goto/16 :goto_0

    :sswitch_16
    invoke-static/range {v20 .. v21}, Ljava/lang/Math;->min(FF)F

    move-result v7

    move-object/from16 v0, p0

    iget-boolean v6, v0, Lf6;->b:Z

    const-string v3, "\u06e0\u06e2\u06e1"

    move-object v5, v3

    goto/16 :goto_4

    :sswitch_17
    const/high16 v3, 0x40400000    # 3.0f

    invoke-static {v3}, Lff;->p(F)F

    move-result v3

    const/high16 v5, 0x41600000    # 14.0f

    sub-float/2addr v3, v5

    add-float/2addr v3, v9

    const/high16 v5, 0x41600000    # 14.0f

    add-float/2addr v3, v5

    move-object/from16 v0, p1

    move/from16 v1, v20

    move/from16 v2, v21

    invoke-virtual {v0, v1, v2, v3, v8}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    move-object/from16 v0, v18

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    sget v3, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v5, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sub-int/2addr v3, v5

    const v5, -0x1aae47

    xor-int/2addr v3, v5

    move/from16 v19, v3

    goto/16 :goto_0

    :sswitch_18
    move-object/from16 v0, p0

    iget v3, v0, Lf6;->e:I

    invoke-virtual {v8, v3}, Landroid/graphics/Paint;->setColor(I)V

    const/high16 v5, 0x43340000    # 180.0f

    const/high16 v6, 0x43340000    # 180.0f

    const/4 v7, 0x1

    move-object/from16 v3, p1

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    move v3, v13

    goto/16 :goto_9

    :sswitch_19
    sget v3, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    if-ltz v3, :cond_13

    const/16 v3, 0x25

    sput v3, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    const-string v3, "\u06e5\u06e6\u06e8"

    invoke-static {v3}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v19, v3

    move v11, v15

    goto/16 :goto_0

    :cond_13
    const-string v3, "\u06df\u06e2\u06e3"

    move v11, v15

    :goto_a
    invoke-static {v3}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v19, v3

    goto/16 :goto_0

    :sswitch_1a
    invoke-static {}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟ۧۢ۟ۧ()I

    move-result v3

    if-gtz v3, :cond_14

    invoke-static {}, Landroid/app/۟ۦۦۤۥ;->ۣۡ۠ۢ()I

    const-string v3, "\u06e8\u06e4\u06e7"

    move v5, v9

    goto/16 :goto_6

    :cond_14
    const-string v3, "\u06df\u06e2\u06e3"

    goto/16 :goto_5

    :sswitch_1b
    move-object/from16 v0, p0

    iget-object v3, v0, Lf6;->h:Lon;

    iget-boolean v3, v3, Lon;->p:Z

    if-eqz v3, :cond_b

    const-string v3, "4Uvqy4AnsryE\n"

    const-string v5, "wg7cjcZh9Po=\n"

    invoke-static {v3, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v12

    sget v3, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v5, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    rem-int/lit16 v5, v5, 0x43a

    div-int/2addr v3, v5

    if-gtz v3, :cond_15

    const/16 v3, 0x3b

    sput v3, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    const-string v3, "\u06e2\u06e8\u06e0"

    invoke-static {v3}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v19, v3

    goto/16 :goto_0

    :cond_15
    sget v3, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v5, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    rem-int/2addr v3, v5

    const v5, -0x1aab79

    xor-int/2addr v3, v5

    move/from16 v19, v3

    goto/16 :goto_0

    :sswitch_1c
    invoke-static {}, Landroidx/versionedparcelable/ۣۢۥ;->ۦۦۡۤ()I

    move-result v3

    if-gtz v3, :cond_16

    const-string v3, "\u06e2\u06e7\u06e0"

    goto :goto_a

    :cond_16
    sget v3, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v5, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    rem-int/2addr v3, v5

    const v5, 0x1ac255

    xor-int/2addr v3, v5

    move/from16 v19, v3

    goto/16 :goto_0

    :sswitch_1d
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc65 -> :sswitch_0
        0xdcd8 -> :sswitch_2
        0xdcf8 -> :sswitch_9
        0x1aa760 -> :sswitch_a
        0x1aa763 -> :sswitch_11
        0x1aa7da -> :sswitch_1c
        0x1aab02 -> :sswitch_1b
        0x1aab1f -> :sswitch_8
        0x1aab43 -> :sswitch_12
        0x1aabbf -> :sswitch_1
        0x1aae82 -> :sswitch_1d
        0x1aaf06 -> :sswitch_7
        0x1aaf40 -> :sswitch_10
        0x1aaf7b -> :sswitch_19
        0x1ab322 -> :sswitch_c
        0x1ab33b -> :sswitch_6
        0x1ab35a -> :sswitch_16
        0x1ab6e2 -> :sswitch_b
        0x1ab6fd -> :sswitch_15
        0x1aba0b -> :sswitch_3
        0x1aba48 -> :sswitch_13
        0x1aba7f -> :sswitch_17
        0x1abe67 -> :sswitch_e
        0x1ac14c -> :sswitch_14
        0x1ac18d -> :sswitch_f
        0x1ac1e3 -> :sswitch_4
        0x1ac25d -> :sswitch_b
        0x1ac25f -> :sswitch_d
        0x1ac5e0 -> :sswitch_1a
        0x1ac5e6 -> :sswitch_5
        0x1ac8e7 -> :sswitch_18
        0x1ac90b -> :sswitch_1a
    .end sparse-switch
.end method
