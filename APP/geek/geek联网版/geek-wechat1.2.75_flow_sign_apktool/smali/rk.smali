.class public final Lrk;
.super Landroid/view/View;


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Z

.field public final c:Landroid/graphics/Paint;

.field public final d:Lsn;


# direct methods
.method public constructor <init>(Lsn;Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    const-string v0, "PcKMTbc7Ww==\n"

    const-string v1, "Xq3iOdJDL4M=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "C8p8qKETNGw=\n"

    const-string v1, "Y68E685/Wx4=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p3}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p1, p0, Lrk;->d:Lsn;

    invoke-direct {p0, p2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    const-string v1, "\u06e0\u06e2\u06df"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "AR1DR8D"

    invoke-static {v0}, Lkotlinx/coroutines/۠ۥۣۧ;->۟ۧۤۡۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    invoke-static {}, Lkotlinx/coroutines/۠ۥۣۧ;->۠ۧۥ()I

    move-result v1

    if-ltz v1, :cond_1

    const-string v1, "\u06e5\u06e7\u06df"

    invoke-static {v1}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_1
    new-instance v1, Landroid/graphics/Paint;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v1, p0, Lrk;->c:Landroid/graphics/Paint;

    const-string v1, "\u06df\u06e4\u06e0"

    :goto_1
    invoke-static {v1}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠ۡۤ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_2
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v1, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    rem-int/lit16 v2, v2, -0x241a

    or-int/2addr v1, v2

    if-ltz v1, :cond_0

    const-string v1, "\u06e3\u06e2"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    sget v1, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v2, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    mul-int/2addr v1, v2

    const v2, 0x2fb99

    sub-int/2addr v1, v2

    goto :goto_0

    :sswitch_3
    iput-object p3, p0, Lrk;->a:Ljava/lang/String;

    sget v1, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v2, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    or-int/lit16 v2, v2, 0x8d7

    rem-int/2addr v1, v2

    if-gtz v1, :cond_2

    const/16 v1, 0x22

    sput v1, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    :cond_1
    const-string v1, "\u06e3\u06e4\u06e6"

    invoke-static {v1}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    sget v1, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v2, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sub-int/2addr v1, v2

    const v2, 0x1ac01b

    xor-int/2addr v1, v2

    goto :goto_0

    :cond_3
    :sswitch_4
    sget v1, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    if-ltz v1, :cond_4

    const-string v1, "\u06e2\u06e8\u06e8"

    :goto_2
    invoke-static {v1}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_4
    const-string v1, "\u06e6\u06e8"

    goto :goto_2

    :sswitch_5
    invoke-static {}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->ۢۢۧۨ()I

    move-result v1

    if-gtz v1, :cond_3

    sget v1, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v2, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    xor-int/lit16 v2, v2, 0x498

    xor-int/2addr v1, v2

    if-gtz v1, :cond_5

    const-string v1, "\u06df\u06e4\u06e0"

    goto :goto_1

    :cond_5
    sget v1, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v2, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    div-int/2addr v1, v2

    const v2, 0xdc60

    add-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_6
    invoke-static {}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۧۡۥ۟()I

    move-result v1

    if-gtz v1, :cond_6

    invoke-static {}, Landroid/window/ۣۧ۟۠;->ۣۡ۟ۢ()I

    const-string v1, "\u06e6\u06e3\u06e1"

    invoke-static {v1}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_6
    sget v1, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    sget v2, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sub-int/2addr v1, v2

    const v2, 0x1aad57

    add-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_7
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc5f -> :sswitch_0
        0xdcc2 -> :sswitch_7
        0x1aa704 -> :sswitch_6
        0x1aa79b -> :sswitch_5
        0x1aab1d -> :sswitch_3
        0x1ab6a5 -> :sswitch_2
        0x1abe7d -> :sswitch_4
        0x1ac266 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final getHexColor()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lrk;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 33

    const/16 v32, 0x0

    const/16 v31, 0x0

    const/4 v14, 0x0

    const/16 v18, 0x0

    const/4 v13, 0x0

    const/16 v19, 0x0

    const/16 v30, 0x0

    const/16 v25, 0x0

    const/4 v9, 0x0

    const/16 v17, 0x0

    const/16 v24, 0x0

    const/16 v23, 0x0

    const/16 v26, 0x0

    const/16 v22, 0x0

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/4 v15, 0x0

    const-string v20, "\u06e2\u06e5\u06df"

    invoke-static/range {v20 .. v20}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v28

    move-object/from16 v20, v9

    move-object/from16 v21, v10

    :goto_0
    sparse-switch v28, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v9, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v10, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    mul-int/lit16 v10, v10, -0xb3e

    or-int/2addr v9, v10

    if-ltz v9, :cond_20

    const-string v9, "\u06e6\u06e8\u06e2"

    invoke-static {v9}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v9

    move/from16 v28, v9

    move/from16 v29, v27

    goto :goto_0

    :sswitch_1
    move-object/from16 v0, p0

    iget-boolean v9, v0, Lrk;->b:Z

    if-eqz v9, :cond_28

    sget-object v9, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    move-object/from16 v0, v20

    invoke-virtual {v0, v9}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/high16 v9, 0x40000000    # 2.0f

    invoke-static {v9}, Lmp;->p(F)F

    move-result v9

    move-object/from16 v0, v20

    invoke-virtual {v0, v9}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    sget v9, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    sget v10, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    add-int/lit16 v10, v10, -0x2624

    rem-int/2addr v9, v10

    if-gtz v9, :cond_0

    invoke-static {}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->ۢۢۧۨ()I

    const-string v9, "\u06e0\u06e6\u06e5"

    :goto_1
    invoke-static {v9}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v9

    move/from16 v28, v9

    goto :goto_0

    :cond_0
    const-string v9, "\u06e3\u06e7\u06e2"

    invoke-static {v9}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v9

    move/from16 v28, v9

    goto :goto_0

    :sswitch_2
    move/from16 v0, v32

    move/from16 v1, v31

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v10

    move-object/from16 v0, p0

    iget-boolean v9, v0, Lrk;->b:Z

    if-eqz v9, :cond_c

    const/high16 v9, 0x40800000    # 4.0f

    invoke-static {v9}, Lmp;->p(F)F

    move-result v18

    sget v9, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v14, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    div-int/2addr v9, v14

    const v14, 0x1ab289

    xor-int/2addr v9, v14

    move/from16 v28, v9

    move v14, v10

    goto :goto_0

    :sswitch_3
    const-string v9, "cJd5uvK01vtli0nirP+KkQ==\n"

    const-string v10, "BPgsyoLRpLg=\n"

    invoke-static {v9, v10}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v0, v23

    invoke-static {v9, v0}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v9, "3Zyfb1ImuA==\n"

    const-string v10, "/trZKRRg/sw=\n"

    invoke-static {v9, v10}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v0, v23

    invoke-virtual {v0, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v10

    move-object/from16 v0, p0

    iget-object v9, v0, Lrk;->d:Lsn;

    sget v22, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    if-gtz v22, :cond_1

    const/16 v22, 0x59

    sput v22, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    const-string v22, "\u06e2\u06e1"

    invoke-static/range {v22 .. v22}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v28

    move-object/from16 v22, v9

    move/from16 v26, v10

    goto/16 :goto_0

    :cond_1
    sget v22, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v26, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    add-int v22, v22, v26

    const v26, 0x1ab4ad

    add-int v28, v22, v26

    move-object/from16 v22, v9

    move/from16 v26, v10

    goto/16 :goto_0

    :sswitch_4
    const v9, -0xfffc33

    sget v10, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    xor-int/2addr v9, v10

    move-object/from16 v0, v20

    invoke-virtual {v0, v9}, Landroid/graphics/Paint;->setColor(I)V

    sget v9, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v10, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    add-int/2addr v9, v10

    const v10, 0x1ab7f6

    xor-int/2addr v9, v10

    move/from16 v28, v9

    goto/16 :goto_0

    :sswitch_5
    move-object/from16 v0, v22

    iget-boolean v9, v0, Lsn;->p:Z

    if-eqz v9, :cond_7

    const-string v9, "tDDmG2eL5crR\n"

    const-string v10, "l3XQXSHNo4w=\n"

    invoke-static {v9, v10}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    sget v9, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    if-ltz v9, :cond_2

    invoke-static {}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۟ۦۣۣۧ()I

    const-string v9, "\u06e2\u06e5\u06e8"

    :goto_2
    invoke-static {v9}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v9

    move/from16 v28, v9

    move/from16 v29, v10

    goto/16 :goto_0

    :cond_2
    const-string v9, "\u06e2\u06e4\u06e5"

    goto :goto_2

    :sswitch_6
    if-eqz v26, :cond_22

    sget-object v9, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    move-object/from16 v0, v20

    invoke-virtual {v0, v9}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9}, Lmp;->p(F)F

    move-result v9

    move-object/from16 v0, v20

    invoke-virtual {v0, v9}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    invoke-static {}, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۡۥ()I

    move-result v9

    if-gtz v9, :cond_3

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۧۡۥۦ()I

    const-string v9, "\u06e1\u06e0\u06e2"

    move-object v10, v6

    :goto_3
    invoke-static {v9}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v9

    move-object v6, v10

    move/from16 v28, v9

    goto/16 :goto_0

    :cond_3
    sget v9, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v10, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    add-int/2addr v9, v10

    const v10, 0x1ac50b

    xor-int/2addr v9, v10

    move/from16 v28, v9

    goto/16 :goto_0

    :sswitch_7
    const-string v9, "\u06e2\u06e6\u06e6"

    :goto_4
    invoke-static {v9}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v9

    move/from16 v28, v9

    goto/16 :goto_0

    :cond_4
    :sswitch_8
    sget v9, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sget v10, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    mul-int/2addr v9, v10

    const v10, 0x1aaa4e

    xor-int/2addr v9, v10

    move/from16 v28, v9

    goto/16 :goto_0

    :sswitch_9
    const-string v9, "xPoH5Sa/Nw==\n"

    const-string v10, "57xBo2D5cdI=\n"

    invoke-static {v9, v10}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v15, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    move-object/from16 v0, v22

    iget-boolean v9, v0, Lsn;->p:Z

    if-nez v9, :cond_4

    sget v9, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v10, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    rem-int/2addr v9, v10

    const v10, 0x1ac00c

    xor-int/2addr v9, v10

    move/from16 v28, v9

    goto/16 :goto_0

    :sswitch_a
    sget v9, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v10, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    mul-int/2addr v9, v10

    const v10, -0x1841ec

    xor-int/2addr v9, v10

    move/from16 v28, v9

    goto/16 :goto_0

    :sswitch_b
    move-object/from16 v0, p1

    move/from16 v1, v32

    move/from16 v2, v31

    move/from16 v3, v30

    move-object/from16 v4, v20

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    sget-object v10, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    move-object/from16 v0, v17

    invoke-virtual {v0, v10}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    sget v23, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sget v24, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    move/from16 v0, v24

    or-int/lit16 v0, v0, -0x863

    move/from16 v24, v0

    add-int v23, v23, v24

    if-ltz v23, :cond_5

    const-string v23, "\u06e6\u06e7"

    invoke-static/range {v23 .. v23}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v28

    move-object/from16 v23, v9

    move-object/from16 v24, v10

    goto/16 :goto_0

    :cond_5
    sget v23, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v24, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    mul-int v23, v23, v24

    const v24, 0x1bfa04

    add-int v28, v23, v24

    move-object/from16 v23, v9

    move-object/from16 v24, v10

    goto/16 :goto_0

    :sswitch_c
    move-object/from16 v0, v22

    iget-boolean v9, v0, Lsn;->p:Z

    if-nez v9, :cond_16

    const-string v9, "q7IfihVNAA==\n"

    const-string v10, "iIIvuiV9MDM=\n"

    invoke-static {v9, v10}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    sget v9, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    if-gtz v9, :cond_6

    const-string v9, "\u06e2\u06e6\u06e6"

    :goto_5
    invoke-static {v9}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v9

    move-object v12, v10

    move/from16 v28, v9

    goto/16 :goto_0

    :cond_6
    const-string v9, "\u06e8\u06e1\u06e8"

    invoke-static {v9}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v9

    move-object v12, v10

    move/from16 v28, v9

    goto/16 :goto_0

    :cond_7
    :sswitch_d
    sget v9, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v10, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    rem-int/lit16 v10, v10, -0x1de8

    mul-int/2addr v9, v10

    if-gtz v9, :cond_8

    invoke-static {}, Lcom/google/android/material/button/ۥۤ۠;->۠۠ۨۢ()I

    const-string v9, "\u06e0\u06e1"

    :goto_6
    invoke-static {v9}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v9

    move/from16 v28, v9

    goto/16 :goto_0

    :cond_8
    const-string v9, "\u06e4\u06e2\u06df"

    goto :goto_6

    :sswitch_e
    sget v9, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sget v10, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    div-int/lit16 v10, v10, -0x7af

    xor-int/2addr v9, v10

    if-gtz v9, :cond_9

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->۟ۥۣۥۦ()I

    const-string v9, "\u06df\u06e7\u06e6"

    move v10, v14

    :goto_7
    invoke-static {v9}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v9

    move/from16 v28, v9

    move v14, v10

    goto/16 :goto_0

    :cond_9
    const-string v9, "\u06e2\u06e5\u06df"

    move v10, v14

    goto :goto_7

    :sswitch_f
    const v9, 0x3eb33333    # 0.35f

    mul-float v9, v9, v30

    move-object/from16 v0, p1

    move/from16 v1, v32

    move/from16 v2, v31

    move-object/from16 v3, v20

    invoke-virtual {v0, v1, v2, v9, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    sget v9, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sget v10, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    xor-int/lit16 v10, v10, 0x2255

    div-int/2addr v9, v10

    if-eqz v9, :cond_a

    const/4 v9, 0x3

    sput v9, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    const-string v10, "\u06e1\u06e4\u06e4"

    move-object v9, v15

    :goto_8
    invoke-static {v10}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v10

    move-object v15, v9

    move/from16 v28, v10

    goto/16 :goto_0

    :cond_a
    const-string v9, "\u06e1\u06e5\u06e7"

    goto/16 :goto_1

    :sswitch_10
    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟ۡۡۦ()I

    move-result v9

    if-gtz v9, :cond_b

    const-string v9, "\u06e7\u06e7\u06e6"

    invoke-static {v9}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v9

    move/from16 v28, v9

    move/from16 v19, v13

    goto/16 :goto_0

    :cond_b
    sget v9, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v10, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    add-int/2addr v9, v10

    const v10, 0x1abb75

    xor-int/2addr v9, v10

    move/from16 v28, v9

    move/from16 v19, v13

    goto/16 :goto_0

    :sswitch_11
    sget v9, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v10, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    or-int/2addr v9, v10

    const v10, 0x1ac751

    add-int/2addr v9, v10

    move/from16 v28, v9

    goto/16 :goto_0

    :sswitch_12
    move v10, v14

    :cond_c
    sget v9, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v14, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    add-int/lit8 v14, v14, -0x1

    xor-int/2addr v9, v14

    if-gtz v9, :cond_d

    const/16 v9, 0x3b

    sput v9, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    const-string v9, "\u06e1\u06df\u06df"

    move v14, v10

    :goto_9
    invoke-static {v9}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v9

    move/from16 v28, v9

    goto/16 :goto_0

    :cond_d
    const-string v9, "\u06e6\u06e7"

    goto/16 :goto_7

    :sswitch_13
    sget v7, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    if-ltz v7, :cond_e

    const/16 v7, 0x5f

    sput v7, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    const-string v7, "\u06e1\u06e0\u06e7"

    invoke-static {v7}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v9

    move-object v7, v5

    move/from16 v28, v9

    goto/16 :goto_0

    :cond_e
    move-object v7, v5

    :goto_a
    const-string v9, "\u06e2\u06e2\u06e4"

    move-object v10, v8

    :goto_b
    invoke-static {v9}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v9

    move-object v8, v10

    move/from16 v28, v9

    goto/16 :goto_0

    :sswitch_14
    move-object/from16 v0, v17

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "h3XxJCQIPpOSacF8ekNi+Q==\n"

    const-string v28, "8xqkVFRtTNA=\n"

    move-object/from16 v0, v28

    invoke-static {v10, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v9}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v10, "qWiVdoUFZw==\n"

    const-string v28, "ii7TMMNDISw=\n"

    move-object/from16 v0, v28

    invoke-static {v10, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_16

    sget v9, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v10, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    xor-int/2addr v9, v10

    const v10, 0x1ac9cb

    add-int/2addr v9, v10

    move/from16 v28, v9

    goto/16 :goto_0

    :sswitch_15
    move-object/from16 v0, p1

    move/from16 v1, v32

    move/from16 v2, v31

    move/from16 v3, v30

    move-object/from16 v4, v20

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    sget v9, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v10, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    rem-int/2addr v9, v10

    const v10, 0x1aac43

    add-int/2addr v9, v10

    move/from16 v28, v9

    goto/16 :goto_0

    :sswitch_16
    sget v6, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v9, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    add-int/lit16 v9, v9, 0x1ec7

    rem-int/2addr v6, v9

    if-gtz v6, :cond_f

    const/16 v6, 0x50

    sput v6, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    const-string v6, "\u06e2\u06e2\u06df"

    invoke-static {v6}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v9

    move-object v6, v11

    move/from16 v28, v9

    goto/16 :goto_0

    :cond_f
    const-string v6, "\u06e2\u06e5\u06e8"

    move-object v9, v6

    move-object v10, v11

    goto/16 :goto_3

    :sswitch_17
    sget v9, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v10, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    xor-int/lit16 v10, v10, 0x2006

    xor-int/2addr v9, v10

    if-gtz v9, :cond_10

    const/16 v9, 0x36

    sput v9, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    const-string v9, "\u06e1\u06e8\u06e0"

    invoke-static {v9}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v9

    move/from16 v28, v9

    goto/16 :goto_0

    :cond_10
    sget v9, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v10, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    rem-int/2addr v9, v10

    const v10, 0x1ab430

    add-int/2addr v9, v10

    move/from16 v28, v9

    goto/16 :goto_0

    :sswitch_18
    move-object/from16 v0, v20

    move/from16 v1, v29

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    move-object/from16 v0, v17

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "5kmN2nkGC63zVb2CJ01Xxw==\n"

    const-string v15, "kibYqgljee4=\n"

    invoke-static {v10, v15}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v9}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    sget v10, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v15, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    add-int/lit16 v15, v15, -0xe6c

    or-int/2addr v10, v15

    if-ltz v10, :cond_11

    const-string v10, "\u06e5\u06e6\u06e6"

    invoke-static {v10}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v10

    move-object v15, v9

    move/from16 v28, v10

    goto/16 :goto_0

    :cond_11
    const-string v10, "\u06e4\u06df\u06e2"

    goto/16 :goto_8

    :sswitch_19
    invoke-static {}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟۠ۢۧۡ()I

    move-result v7

    if-ltz v7, :cond_12

    invoke-static {}, Landroidx/legacy/content/ۧۡ۠۠;->ۥۧۡۦ()I

    const-string v7, "\u06e7\u06df\u06e7"

    invoke-static {v7}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v9

    move-object v7, v8

    move/from16 v28, v9

    goto/16 :goto_0

    :cond_12
    move-object v7, v8

    :cond_13
    const-string v9, "\u06e0\u06e1\u06e0"

    :goto_c
    invoke-static {v9}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v9

    move/from16 v28, v9

    goto/16 :goto_0

    :sswitch_1a
    sget v9, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v10, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    xor-int/lit16 v10, v10, 0x2165

    add-int/2addr v9, v10

    if-gtz v9, :cond_14

    invoke-static {}, Landroidx/activity/result/۟ۡۤۦۡ;->۟۟۟ۥۤ()I

    const-string v9, "\u06e7\u06df\u06e2"

    invoke-static {v9}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v9

    move/from16 v28, v9

    goto/16 :goto_0

    :cond_14
    sget v9, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v10, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    mul-int/2addr v9, v10

    const v10, 0x1b9194

    add-int/2addr v9, v10

    move/from16 v28, v9

    goto/16 :goto_0

    :sswitch_1b
    invoke-static {}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۤۥۣ۟()I

    move-result v9

    if-ltz v9, :cond_15

    invoke-static {}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟۠ۢۢ۠()I

    const-string v9, "\u06e1\u06e1\u06e0"

    goto/16 :goto_4

    :cond_15
    sget v9, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v10, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    mul-int/2addr v9, v10

    const v10, 0x19865f

    add-int/2addr v9, v10

    move/from16 v28, v9

    goto/16 :goto_0

    :cond_16
    :sswitch_1c
    invoke-static {}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۧۧۥۦ()I

    move-result v9

    if-ltz v9, :cond_17

    const/16 v9, 0x9

    sput v9, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    const-string v9, "\u06e7\u06e7\u06e0"

    invoke-static {v9}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v9

    move/from16 v28, v9

    goto/16 :goto_0

    :cond_17
    const-string v9, "\u06e1\u06e0\u06e2"

    goto/16 :goto_9

    :sswitch_1d
    invoke-static {v12}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    move-object/from16 v0, v20

    invoke-virtual {v0, v9}, Landroid/graphics/Paint;->setColor(I)V

    const/4 v9, 0x0

    const/high16 v10, 0x40400000    # 3.0f

    invoke-static {v10}, Lmp;->p(F)F

    move-result v10

    sub-float/2addr v9, v10

    sub-float v9, v30, v9

    move-object/from16 v0, p1

    move/from16 v1, v32

    move/from16 v2, v31

    move-object/from16 v3, v20

    invoke-virtual {v0, v1, v2, v9, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    move-object/from16 v0, v20

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    sget v9, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    if-ltz v9, :cond_19

    move-object/from16 v9, v17

    :cond_18
    const-string v10, "\u06e8\u06e1"

    invoke-static {v10}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v10

    move-object/from16 v17, v9

    move/from16 v28, v10

    goto/16 :goto_0

    :cond_19
    sget v9, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v10, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    add-int/2addr v9, v10

    const v10, 0x1ab191

    add-int/2addr v9, v10

    move/from16 v28, v9

    goto/16 :goto_0

    :sswitch_1e
    sget v9, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v10, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    or-int/lit16 v10, v10, -0x16b8

    sub-int/2addr v9, v10

    if-gtz v9, :cond_1a

    const-string v9, "\u06e8\u06e4\u06e5"

    invoke-static {v9}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v12, v16

    move/from16 v28, v9

    goto/16 :goto_0

    :cond_1a
    const-string v9, "\u06e7\u06e4\u06df"

    move-object/from16 v12, v16

    goto/16 :goto_9

    :sswitch_1f
    sget v9, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    if-ltz v9, :cond_1b

    invoke-static {}, Lio/fastkv/ۣ۟ۧۦۡ;->ۥۥۤۥ()I

    const-string v9, "\u06e7\u06e4\u06e0"

    invoke-static {v9}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v9

    move/from16 v28, v9

    goto/16 :goto_0

    :cond_1b
    const-string v9, "\u06e5\u06e5\u06e6"

    invoke-static {v9}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v9

    move/from16 v28, v9

    goto/16 :goto_0

    :sswitch_20
    sget v9, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    if-ltz v9, :cond_1c

    invoke-static {}, Landroid/window/ۣۤ۠ۢ;->ۧۢۦ۟()I

    goto/16 :goto_a

    :cond_1c
    sget v9, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v10, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    xor-int/2addr v9, v10

    const v10, 0x1aaad0

    add-int/2addr v9, v10

    move/from16 v28, v9

    goto/16 :goto_0

    :sswitch_21
    const/high16 v9, 0x41a00000    # 20.0f

    add-float/2addr v9, v14

    sub-float v9, v9, v19

    const/high16 v10, 0x41a00000    # 20.0f

    sub-float v30, v9, v10

    sget-object v10, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    move-object/from16 v0, p0

    iget-object v9, v0, Lrk;->c:Landroid/graphics/Paint;

    invoke-static {}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۤ۟۠ۢ()I

    move-result v20

    if-gtz v20, :cond_1d

    const-string v20, "\u06e4\u06e5\u06e0"

    invoke-static/range {v20 .. v20}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v28

    move-object/from16 v20, v9

    move-object/from16 v25, v10

    goto/16 :goto_0

    :cond_1d
    sget v20, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v25, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    div-int v20, v20, v25

    const v25, 0x1ab33e

    xor-int v28, v20, v25

    move-object/from16 v20, v9

    move-object/from16 v25, v10

    goto/16 :goto_0

    :sswitch_22
    sget v9, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v10, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    add-int/lit16 v10, v10, 0x236e

    add-int/2addr v9, v10

    if-gtz v9, :cond_1e

    const/16 v9, 0xf

    sput v9, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    const-string v9, "\u06e8\u06e1\u06e8"

    invoke-static {v9}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v9

    move/from16 v28, v9

    goto/16 :goto_0

    :cond_1e
    const-string v9, "\u06e6\u06e8\u06e4"

    invoke-static {v9}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v9

    move/from16 v28, v9

    goto/16 :goto_0

    :sswitch_23
    const/high16 v9, 0x40000000    # 2.0f

    invoke-static {v9}, Lmp;->p(F)F

    move-result v13

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۥۣ۠ۦ()I

    move-result v9

    if-ltz v9, :cond_1f

    const/4 v9, 0x6

    sput v9, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    const-string v9, "\u06df\u06e6\u06e0"

    invoke-static {v9}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v9

    move/from16 v28, v9

    goto/16 :goto_0

    :cond_1f
    const-string v9, "\u06e8\u06e1\u06e1"

    move-object v10, v12

    goto/16 :goto_5

    :cond_20
    sget v9, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v10, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    or-int/2addr v9, v10

    const v10, 0x1abf02

    add-int/2addr v9, v10

    move/from16 v28, v9

    move/from16 v29, v27

    goto/16 :goto_0

    :sswitch_24
    invoke-static {}, Landroidx/legacy/content/ۧۡ۠۠;->ۥۧۡۦ()I

    move-result v9

    if-gtz v9, :cond_21

    const/16 v9, 0x52

    sput v9, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    const-string v9, "\u06e6\u06e3\u06e6"

    invoke-static {v9}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v16, v17

    move/from16 v28, v9

    goto/16 :goto_0

    :cond_21
    const-string v9, "\u06e3\u06e5\u06e4"

    invoke-static {v9}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v16, v17

    move/from16 v28, v9

    goto/16 :goto_0

    :cond_22
    :sswitch_25
    const-string v9, "\u06e0\u06e8\u06e0"

    invoke-static {v9}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v9

    move/from16 v28, v9

    goto/16 :goto_0

    :sswitch_26
    move-object/from16 v0, v20

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    move-object/from16 v0, p0

    iget-object v9, v0, Lrk;->a:Ljava/lang/String;

    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    move-object/from16 v0, v20

    invoke-virtual {v0, v10}, Landroid/graphics/Paint;->setColor(I)V

    sget v10, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    if-ltz v10, :cond_18

    invoke-static {}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۦۢۧۧ()I

    const-string v10, "\u06e2\u06e7\u06e3"

    invoke-static {v10}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v10

    move-object/from16 v17, v9

    move/from16 v28, v10

    goto/16 :goto_0

    :sswitch_27
    const/4 v9, -0x1

    sget v10, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v27, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    div-int v10, v10, v27

    const v27, 0xdc39

    add-int v10, v10, v27

    move/from16 v27, v9

    move/from16 v28, v10

    goto/16 :goto_0

    :sswitch_28
    move-object/from16 v0, v22

    iget-boolean v9, v0, Lsn;->p:Z

    if-eqz v9, :cond_23

    const-string v11, "a+bUFJg1bBcO\n"

    const-string v10, "SNXnUt5zKlE=\n"

    const-string v8, "\u06e7\u06df\u06e7"

    move-object v9, v8

    goto/16 :goto_b

    :cond_23
    :sswitch_29
    invoke-static {}, Landroid/app/۟ۡۧۦۡ;->ۥۣۨۧ()I

    move-result v9

    if-ltz v9, :cond_24

    invoke-static {}, Landroid/window/ۣۤ۠ۢ;->ۧۢۦ۟()I

    const-string v9, "\u06e6\u06e6\u06e7"

    invoke-static {v9}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v9

    move/from16 v28, v9

    goto/16 :goto_0

    :cond_24
    const-string v9, "\u06e8\u06e4\u06df"

    goto/16 :goto_9

    :sswitch_2a
    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۦۢۢۢ()I

    move-result v10

    if-gtz v10, :cond_25

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->۟ۥۣۥۦ()I

    const-string v10, "\u06e6\u06e1\u06e7"

    invoke-static {v10}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v10

    move-object/from16 v21, v9

    move/from16 v28, v10

    goto/16 :goto_0

    :cond_25
    sget v10, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v21, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    rem-int v10, v10, v21

    const v21, 0x1ab253

    xor-int v10, v10, v21

    move-object/from16 v21, v9

    move/from16 v28, v10

    goto/16 :goto_0

    :sswitch_2b
    const-string v9, "hY/qb72C\n"

    const-string v10, "5u6EGdzxZWw=\n"

    invoke-static {v9, v10}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v0, p1

    invoke-static {v9, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v9

    int-to-float v9, v9

    const/high16 v10, 0x40000000    # 2.0f

    div-float v32, v9, v10

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v9

    int-to-float v9, v9

    const/high16 v10, 0x40000000    # 2.0f

    div-float v10, v9, v10

    sget v9, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sget v28, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    move/from16 v0, v28

    mul-int/lit16 v0, v0, -0x1aa

    move/from16 v28, v0

    rem-int v9, v9, v28

    if-ltz v9, :cond_26

    const-string v9, "\u06e8\u06e4\u06df"

    invoke-static {v9}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v9

    move/from16 v28, v9

    move/from16 v31, v10

    goto/16 :goto_0

    :cond_26
    sget v9, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sget v28, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    mul-int v9, v9, v28

    const v28, 0x1a9fc9

    add-int v9, v9, v28

    move/from16 v28, v9

    move/from16 v31, v10

    goto/16 :goto_0

    :sswitch_2c
    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۥۣ۠ۦ()I

    move-result v9

    if-ltz v9, :cond_27

    invoke-static {}, Landroid/window/ۣۧ۟۠;->ۣۡ۟ۢ()I

    const-string v9, "\u06e4\u06e2\u06df"

    invoke-static {v9}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v9

    move/from16 v28, v9

    move/from16 v19, v18

    goto/16 :goto_0

    :cond_27
    move/from16 v9, v18

    :goto_d
    const-string v10, "\u06e2\u06e6\u06e7"

    invoke-static {v10}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v10

    move/from16 v28, v10

    move/from16 v19, v9

    goto/16 :goto_0

    :cond_28
    :sswitch_2d
    sget v9, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    if-ltz v9, :cond_29

    const/16 v9, 0x3d

    sput v9, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    const-string v9, "\u06e4\u06e1\u06e4"

    invoke-static {v9}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v9

    move/from16 v28, v9

    goto/16 :goto_0

    :cond_29
    sget v9, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v10, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sub-int/2addr v9, v10

    const v10, 0x1aaac9

    xor-int/2addr v9, v10

    move/from16 v28, v9

    goto/16 :goto_0

    :sswitch_2e
    invoke-static/range {v21 .. v21}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    move-object/from16 v0, v20

    invoke-virtual {v0, v9}, Landroid/graphics/Paint;->setColor(I)V

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۢ۠۟ۨ()I

    move-result v9

    if-ltz v9, :cond_2a

    move/from16 v9, v19

    goto :goto_d

    :cond_2a
    sget v9, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v10, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    add-int/2addr v9, v10

    const v10, 0x1ab4c3

    add-int/2addr v9, v10

    move/from16 v28, v9

    goto/16 :goto_0

    :sswitch_2f
    const-string v6, "wyE6AxUuZQ==\n"

    const-string v5, "4GQKRiVrVUY=\n"

    invoke-static {}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟۠ۢۨۦ()I

    move-result v9

    if-lez v9, :cond_13

    const-string v9, "\u06e7\u06e1\u06e4"

    goto/16 :goto_c

    :sswitch_30
    invoke-static {}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣۢ۠۠()I

    move-result v9

    if-gtz v9, :cond_2b

    const/16 v9, 0x5b

    sput v9, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    const-string v9, "\u06e5\u06e1\u06e0"

    invoke-static {v9}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v9

    move/from16 v28, v9

    goto/16 :goto_0

    :cond_2b
    sget v9, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v10, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sub-int/2addr v9, v10

    const v10, 0x1ac4eb

    add-int/2addr v9, v10

    move/from16 v28, v9

    goto/16 :goto_0

    :sswitch_31
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc3f -> :sswitch_0
        0xdcc1 -> :sswitch_23
        0xdcf9 -> :sswitch_b
        0x1aa7d9 -> :sswitch_25
        0x1aaaff -> :sswitch_16
        0x1aab5c -> :sswitch_12
        0x1aab99 -> :sswitch_1b
        0x1aab9f -> :sswitch_2e
        0x1aabd8 -> :sswitch_1
        0x1aaea3 -> :sswitch_24
        0x1aaea8 -> :sswitch_30
        0x1aaee0 -> :sswitch_d
        0x1aaf21 -> :sswitch_1f
        0x1aaf43 -> :sswitch_31
        0x1ab245 -> :sswitch_20
        0x1ab289 -> :sswitch_2c
        0x1ab29f -> :sswitch_17
        0x1ab2a4 -> :sswitch_22
        0x1ab2df -> :sswitch_5
        0x1ab2e3 -> :sswitch_11
        0x1ab2fc -> :sswitch_2b
        0x1ab305 -> :sswitch_2a
        0x1ab322 -> :sswitch_1f
        0x1ab323 -> :sswitch_7
        0x1ab33e -> :sswitch_26
        0x1ab6a2 -> :sswitch_30
        0x1ab6a6 -> :sswitch_f
        0x1ab6c2 -> :sswitch_1e
        0x1ab6c4 -> :sswitch_6
        0x1ab6fe -> :sswitch_14
        0x1ab9c7 -> :sswitch_9
        0x1ab9cb -> :sswitch_15
        0x1aba21 -> :sswitch_27
        0x1aba7f -> :sswitch_e
        0x1abe46 -> :sswitch_21
        0x1abe65 -> :sswitch_1c
        0x1abe9e -> :sswitch_18
        0x1ac18c -> :sswitch_1b
        0x1ac1c9 -> :sswitch_29
        0x1ac260 -> :sswitch_4
        0x1ac262 -> :sswitch_17
        0x1ac50a -> :sswitch_a
        0x1ac50f -> :sswitch_19
        0x1ac510 -> :sswitch_a
        0x1ac54a -> :sswitch_13
        0x1ac54c -> :sswitch_2d
        0x1ac5a2 -> :sswitch_1d
        0x1ac5e1 -> :sswitch_3
        0x1ac606 -> :sswitch_28
        0x1ac622 -> :sswitch_c
        0x1ac8d0 -> :sswitch_8
        0x1ac908 -> :sswitch_10
        0x1ac90f -> :sswitch_1a
        0x1ac963 -> :sswitch_2f
        0x1ac969 -> :sswitch_2
    .end sparse-switch
.end method

.method public final setSelectedTheme(Z)V
    .locals 2

    const-string v0, "\u06e8\u06e6\u06e0"

    invoke-static {v0}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    sget v0, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v1, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    or-int/2addr v0, v1

    const v1, 0x1ac5a6

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_2
    iput-boolean p1, p0, Lrk;->b:Z

    sget v0, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    if-ltz v0, :cond_0

    const/16 v0, 0x32

    sput v0, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    const-string v0, "\u06e8\u06e6\u06e0"

    invoke-static {v0}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v1, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    xor-int/2addr v0, v1

    const v1, 0x1aa6e4

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x1aa7a3 -> :sswitch_0
        0x1ab2a2 -> :sswitch_1
        0x1ac9a2 -> :sswitch_2
    .end sparse-switch
.end method
