.class public final Lrn;
.super Landroid/text/style/ReplacementSpan;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:I

.field public final d:Z

.field public final e:Landroid/widget/TextView;

.field public f:F

.field public final g:F

.field public final h:F

.field public final i:F

.field public final j:Landroid/graphics/Matrix;


# direct methods
.method public constructor <init>(Ljava/lang/String;IIZLandroid/widget/TextView;)V
    .locals 3

    const-string v0, "b2pxZA==\n"

    const-string v1, "Gw8JECy6vbU=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Landroid/text/style/ReplacementSpan;-><init>()V

    const/4 v1, 0x0

    const-string v0, "\u06e1\u06e6\u06e3"

    invoke-static {v0}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "P1KA9m5OsnYXfEyUZ4r3IXiy9qw"

    invoke-static {v0}, Lcom/google/android/material/button/ۥۤ۠;->ۧ۠۠ۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget v1, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    if-ltz v1, :cond_6

    const-string v1, "\u06df\u06e8\u06e4"

    move-object v2, v1

    :goto_1
    invoke-static {v2}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :sswitch_1
    const/high16 v0, 0x41700000    # 15.0f

    iput v0, p0, Lrn;->g:F

    const-string v0, "\u06e0\u06e1\u06e2"

    :goto_2
    invoke-static {v0}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_2
    iput-object p1, p0, Lrn;->a:Ljava/lang/String;

    sget v0, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v2, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    xor-int/2addr v0, v2

    const v2, 0x1abe29

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_3
    iput p2, p0, Lrn;->b:I

    const-string v0, "\u06e0\u06e5\u06e6"

    invoke-static {v0}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_4
    sget v0, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v2, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    mul-int/2addr v0, v2

    const v2, 0x18cd76

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_5
    const/high16 v0, 0x40a00000    # 5.0f

    iput v0, p0, Lrn;->h:F

    sget v0, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v2, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    rem-int/lit16 v2, v2, -0x1e22

    or-int/2addr v0, v2

    if-ltz v0, :cond_0

    const/16 v0, 0xe

    sput v0, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    const-string v0, "\u06df\u06df\u06e2"

    invoke-static {v0}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e0\u06e2\u06df"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    :sswitch_6
    invoke-static {}, Landroid/window/ۦۣۦۥ;->ۡۥۥۥ()I

    move-result v0

    if-gtz v0, :cond_2

    const-string v0, "\u06e3\u06e1\u06e6"

    goto :goto_2

    :cond_2
    sget v0, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v2, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    or-int/2addr v0, v2

    const v2, 0x1aac3e

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_7
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    if-ltz v0, :cond_3

    invoke-static {}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۡۥ۟()I

    const-string v0, "\u06e1\u06df\u06e7"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_3
    sget v0, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v2, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sub-int/2addr v0, v2

    const v2, 0x1aaf14

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۧۧ()I

    move-result v0

    if-ltz v0, :cond_1

    :cond_4
    const-string v0, "\u06e1\u06e1"

    :goto_3
    invoke-static {v0}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_9
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lrn;->j:Landroid/graphics/Matrix;

    const-string v0, "\u06df\u06e8\u06e4"

    :goto_4
    invoke-static {v0}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_a
    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lrn;->f:F

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۦۢۢۢ()I

    move-result v0

    if-gtz v0, :cond_5

    const-string v0, "\u06e5\u06e6\u06df"

    invoke-static {v0}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06e6\u06e6\u06e4"

    goto/16 :goto_2

    :cond_6
    const-string v1, "\u06e1\u06e4"

    move-object v2, v1

    goto/16 :goto_1

    :sswitch_b
    const/high16 v0, 0x41400000    # 12.0f

    iput v0, p0, Lrn;->i:F

    invoke-static {}, Lio/fastkv/ۣ۟ۧۦۡ;->ۥۥۤۥ()I

    move-result v0

    if-ltz v0, :cond_7

    const/4 v0, 0x0

    sput v0, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    const-string v0, "\u06e0\u06e5\u06e6"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_7
    const-string v2, "\u06e3\u06e3\u06e5"

    move-object v0, v1

    goto/16 :goto_1

    :sswitch_c
    iput-boolean p4, p0, Lrn;->d:Z

    const-string v0, "\u06e1\u06e6\u06df"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_d
    iput-object p5, p0, Lrn;->e:Landroid/widget/TextView;

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟ۡۡۦ()I

    move-result v0

    if-gtz v0, :cond_8

    invoke-static {}, Lcom/google/android/material/button/ۥۤ۠;->۠۠ۨۢ()I

    const-string v0, "\u06e0\u06e1\u06e2"

    goto :goto_4

    :cond_8
    const-string v0, "\u06e6\u06e0\u06e4"

    goto :goto_3

    :sswitch_e
    iput p3, p0, Lrn;->c:I

    sget v0, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v2, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    or-int/lit16 v2, v2, 0x1582

    sub-int/2addr v0, v2

    if-gez v0, :cond_4

    const-string v0, "\u06e0\u06e2\u06e2"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_f
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc20 -> :sswitch_0
        0xdc23 -> :sswitch_7
        0x1aa702 -> :sswitch_4
        0x1aa81b -> :sswitch_8
        0x1aab01 -> :sswitch_5
        0x1aab1d -> :sswitch_b
        0x1aab20 -> :sswitch_c
        0x1aab81 -> :sswitch_e
        0x1aabda -> :sswitch_f
        0x1aae89 -> :sswitch_6
        0x1aaf5a -> :sswitch_d
        0x1aaf5e -> :sswitch_2
        0x1ab685 -> :sswitch_9
        0x1abe5e -> :sswitch_3
        0x1ac16a -> :sswitch_a
        0x1ac224 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
    .locals 76

    const/16 v41, 0x0

    const/16 v40, 0x0

    const/16 v39, 0x0

    const/4 v7, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v59, 0x0

    const/16 v34, 0x0

    const/16 v61, 0x0

    const/16 v64, 0x0

    const/16 v17, 0x0

    const/16 v62, 0x0

    const/16 v60, 0x0

    const/4 v9, 0x0

    const/16 v63, 0x0

    const/16 v27, 0x0

    const-wide/16 v68, 0x0

    const-wide/16 v66, 0x0

    const/16 v44, 0x0

    const/16 v43, 0x0

    const/16 v45, 0x0

    const/16 v38, 0x0

    const/16 v31, 0x0

    const/4 v6, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v36, 0x0

    const/16 v35, 0x0

    const/16 v19, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/16 v42, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v37, 0x0

    const/16 v58, 0x0

    const/16 v33, 0x0

    const/16 v21, 0x0

    const-string v22, "\u06e8\u06e8\u06e3"

    invoke-static/range {v22 .. v22}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v65

    move-object/from16 v46, v6

    move-object/from16 v47, v7

    move-object/from16 v48, v9

    move-object/from16 v22, v14

    move-object/from16 v49, v17

    move-object/from16 v50, v20

    move-object/from16 v51, v21

    move-object/from16 v52, v23

    move/from16 v53, v24

    move/from16 v54, v27

    move/from16 v55, v31

    move/from16 v56, v33

    move/from16 v57, v34

    :goto_0
    sparse-switch v65, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-virtual/range {v48 .. v48}, Landroid/graphics/RectF;->centerY()F

    move-result v6

    move-object/from16 v0, v52

    iget v7, v0, Landroid/graphics/Paint$FontMetrics;->descent:F

    const/high16 v9, 0x41b80000    # 23.0f

    sub-float/2addr v7, v9

    move-object/from16 v0, v52

    iget v9, v0, Landroid/graphics/Paint$FontMetrics;->ascent:F

    add-float/2addr v7, v9

    const/high16 v9, 0x41b80000    # 23.0f

    add-float/2addr v7, v9

    const/high16 v9, 0x40000000    # 2.0f

    div-float/2addr v7, v9

    const/4 v9, 0x0

    const/4 v14, 0x0

    move-object/from16 v0, v48

    iget v0, v0, Landroid/graphics/RectF;->left:F

    move/from16 v17, v0

    sub-float v14, v14, v17

    sub-float v14, v14, v60

    sub-float/2addr v9, v14

    const/high16 v14, 0x41300000    # 11.0f

    sub-float/2addr v6, v14

    sub-float/2addr v6, v7

    const/high16 v7, 0x41300000    # 11.0f

    add-float/2addr v6, v7

    move-object/from16 v0, p1

    move-object/from16 v1, v49

    move-object/from16 v2, p9

    invoke-virtual {v0, v1, v9, v6, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->clearShadowLayer()V

    move-object/from16 v0, p9

    move-object/from16 v1, v47

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    invoke-static {}, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢ۠ۨۦ()I

    move-result v6

    if-ltz v6, :cond_8

    const-string v6, "\u06e8\u06e1"

    invoke-static {v6}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v65, v6

    goto :goto_0

    :cond_0
    :sswitch_1
    sget v6, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v7, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    or-int/lit16 v7, v7, 0x1a6f

    add-int/2addr v6, v7

    if-ltz v6, :cond_1

    const-string v6, "\u06e4\u06e4\u06e0"

    invoke-static {v6}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v65, v6

    goto :goto_0

    :cond_1
    const-string v6, "\u06e8\u06df\u06e5"

    :goto_1
    invoke-static {v6}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v65, v6

    goto :goto_0

    :sswitch_2
    new-instance v6, Landroid/graphics/LinearGradient;

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x3

    new-array v12, v12, [F

    fill-array-data v12, :array_0

    invoke-direct/range {v6 .. v13}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    move-object/from16 v0, p9

    invoke-virtual {v0, v6}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    sget-object v6, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    move-object/from16 v0, p9

    invoke-virtual {v0, v6}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const v6, 0x3f99999a    # 1.2f

    move-object/from16 v0, p9

    invoke-virtual {v0, v6}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    new-instance v6, Landroid/graphics/RectF;

    move-object/from16 v0, v48

    iget v7, v0, Landroid/graphics/RectF;->left:F

    const/high16 v9, 0x41200000    # 10.0f

    add-float/2addr v7, v9

    const v9, 0x3f19999a    # 0.6f

    add-float/2addr v7, v9

    const/high16 v9, 0x41200000    # 10.0f

    sub-float/2addr v7, v9

    const v9, 0x3f19999a    # 0.6f

    const/4 v12, 0x0

    move-object/from16 v0, v48

    iget v14, v0, Landroid/graphics/RectF;->top:F

    sub-float/2addr v12, v14

    sub-float/2addr v9, v12

    move-object/from16 v0, v48

    iget v12, v0, Landroid/graphics/RectF;->right:F

    const/high16 v14, 0x41a00000    # 20.0f

    sub-float/2addr v12, v14

    const v14, 0x3f19999a    # 0.6f

    sub-float/2addr v12, v14

    const/high16 v14, 0x41a00000    # 20.0f

    add-float/2addr v12, v14

    move-object/from16 v0, v48

    iget v14, v0, Landroid/graphics/RectF;->bottom:F

    const/high16 v17, 0x40c00000    # 6.0f

    sub-float v14, v14, v17

    const v17, 0x3f19999a    # 0.6f

    sub-float v14, v14, v17

    const/high16 v17, 0x40c00000    # 6.0f

    add-float v14, v14, v17

    invoke-direct {v6, v7, v9, v12, v14}, Landroid/graphics/RectF;-><init>(FFFF)V

    move-object/from16 v0, p1

    move/from16 v1, v63

    move/from16 v2, v63

    move-object/from16 v3, p9

    invoke-virtual {v0, v6, v1, v2, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    move-object/from16 v0, p9

    move-object/from16 v1, v49

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v6

    sget v7, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v9, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    add-int/lit16 v9, v9, -0x197c

    div-int/2addr v7, v9

    if-eqz v7, :cond_2

    :goto_2
    const-string v7, "\u06e0\u06e3\u06e4"

    invoke-static {v7}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v7

    move v12, v6

    move/from16 v65, v7

    goto/16 :goto_0

    :cond_2
    sget v7, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v9, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    rem-int/2addr v7, v9

    const v9, -0xdca6

    xor-int/2addr v7, v9

    move v12, v6

    move/from16 v65, v7

    goto/16 :goto_0

    :cond_3
    move-object/from16 v6, v37

    :goto_3
    sget v9, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v14, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sub-int/2addr v9, v14

    const v14, -0x1ac4f6

    xor-int/2addr v9, v14

    move-object/from16 v28, v27

    move-object/from16 v37, v6

    move-object/from16 v29, v7

    move/from16 v65, v9

    goto/16 :goto_0

    :sswitch_3
    sget v6, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    xor-int/lit16 v6, v6, 0x11d

    const/high16 v7, 0x3f800000    # 1.0f

    const/4 v9, 0x0

    const/high16 v14, 0x3f800000    # 1.0f

    move/from16 v0, v56

    xor-int/lit16 v0, v0, 0x2b1

    move/from16 v17, v0

    move/from16 v0, v17

    invoke-static {v0, v6, v6, v6}, Landroid/graphics/Color;->argb(IIII)I

    move-result v6

    move-object/from16 v0, p9

    invoke-virtual {v0, v7, v9, v14, v6}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    sget v6, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v7, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    xor-int/lit16 v7, v7, 0x21b

    or-int/2addr v6, v7

    if-ltz v6, :cond_4

    const-string v6, "\u06e3\u06e0\u06e1"

    invoke-static {v6}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v6

    move/from16 v65, v6

    goto/16 :goto_0

    :cond_4
    const-string v6, "\u06e6\u06e1\u06e6"

    :goto_4
    invoke-static {v6}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v6

    move/from16 v65, v6

    goto/16 :goto_0

    :sswitch_4
    const/4 v6, 0x0

    const/4 v7, 0x0

    move/from16 v0, p7

    int-to-float v9, v0

    sub-float/2addr v7, v9

    move-object/from16 v0, v50

    iget v9, v0, Landroid/graphics/Paint$FontMetrics;->descent:F

    sub-float/2addr v7, v9

    sub-float/2addr v6, v7

    const/high16 v7, 0x41c00000    # 24.0f

    sub-float/2addr v6, v7

    const/high16 v7, 0x3f800000    # 1.0f

    sub-float/2addr v6, v7

    const/high16 v7, 0x41c00000    # 24.0f

    add-float v9, v6, v7

    move-object/from16 v0, p0

    iget v0, v0, Lrn;->i:F

    move/from16 v17, v0

    move-object/from16 v0, p0

    iget-object v6, v0, Lrn;->a:Ljava/lang/String;

    move-object/from16 v0, p9

    invoke-virtual {v0, v6}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v14

    move-object/from16 v0, p0

    iget v7, v0, Lrn;->g:F

    sget v20, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v21, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    div-int v20, v20, v21

    const v21, 0x1aae84

    xor-int v20, v20, v21

    move-object/from16 v49, v6

    move/from16 v60, v7

    move/from16 v61, v9

    move/from16 v62, v14

    move/from16 v64, v17

    move/from16 v65, v20

    goto/16 :goto_0

    :sswitch_5
    invoke-virtual/range {v28 .. v29}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    sget v6, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v7, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    xor-int/lit16 v7, v7, 0x1ea5

    xor-int/2addr v6, v7

    if-gtz v6, :cond_6

    const/16 v6, 0x5f

    sput v6, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    :cond_5
    const-string v7, "\u06e7\u06e4\u06e1"

    move/from16 v6, v38

    :goto_5
    invoke-static {v7}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v7

    move/from16 v65, v7

    move/from16 v38, v6

    goto/16 :goto_0

    :cond_6
    move v6, v12

    goto/16 :goto_2

    :sswitch_6
    const-string v6, "A7C5A2Tr\n"

    const-string v7, "YNHXdQWYLDQ=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v0, p1

    invoke-static {v6, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v6, "qn+9p6k=\n"

    const-string v7, "2h7Uyd3vkWI=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v0, p9

    invoke-static {v6, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->getTextSize()F

    move-result v9

    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->getColor()I

    move-result v7

    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->getStyle()Landroid/graphics/Paint$Style;

    move-result-object v6

    invoke-static {}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣۢ۠۠()I

    move-result v14

    if-gtz v14, :cond_7

    const/16 v14, 0x12

    sput v14, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    :goto_6
    const-string v14, "\u06e1\u06e8\u06e5"

    invoke-static {v14}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v14

    move-object/from16 v39, v6

    move/from16 v40, v7

    move/from16 v41, v9

    move/from16 v65, v14

    goto/16 :goto_0

    :cond_7
    sget v14, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v17, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    div-int v14, v14, v17

    const v17, -0x1ac9a3

    xor-int v14, v14, v17

    move-object/from16 v39, v6

    move/from16 v40, v7

    move/from16 v41, v9

    move/from16 v65, v14

    goto/16 :goto_0

    :cond_8
    sget v6, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v7, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    add-int/2addr v6, v7

    const v7, 0x1ac8b9

    xor-int/2addr v6, v7

    move/from16 v65, v6

    goto/16 :goto_0

    :sswitch_7
    move-object/from16 v0, p9

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    move-object/from16 v0, p9

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/4 v6, 0x1

    move-object/from16 v0, p9

    invoke-virtual {v0, v6}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    if-eqz v43, :cond_0

    sget v6, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v7, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v9, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    or-int/2addr v7, v9

    const v9, 0xde5c

    xor-int/2addr v7, v9

    move/from16 v56, v6

    move/from16 v65, v7

    goto/16 :goto_0

    :sswitch_8
    const/high16 v6, 0x3fc00000    # 1.5f

    const/4 v7, 0x0

    const/high16 v9, 0x3fc00000    # 1.5f

    sget v14, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    xor-int/lit16 v14, v14, -0x391

    const/16 v17, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move/from16 v0, v17

    move/from16 v1, v20

    move/from16 v2, v21

    invoke-static {v14, v0, v1, v2}, Landroid/graphics/Color;->argb(IIII)I

    move-result v14

    move-object/from16 v0, p9

    invoke-virtual {v0, v6, v7, v9, v14}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    invoke-static {}, Lio/fastkv/ۣ۟ۧۦۡ;->ۥۥۤۥ()I

    move-result v6

    if-ltz v6, :cond_9

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->۟ۥۣۥۦ()I

    :goto_7
    const-string v7, "\u06e1\u06df\u06df"

    move/from16 v6, v42

    :goto_8
    invoke-static {v7}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v7

    move/from16 v42, v6

    move/from16 v65, v7

    goto/16 :goto_0

    :cond_9
    sget v6, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v7, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    div-int/2addr v6, v7

    const v7, 0xdc44

    add-int/2addr v6, v7

    move/from16 v65, v6

    goto/16 :goto_0

    :sswitch_9
    move-object/from16 v0, v48

    iget v8, v0, Landroid/graphics/RectF;->top:F

    move-object/from16 v0, v48

    iget v10, v0, Landroid/graphics/RectF;->bottom:F

    sget v6, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v7, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    xor-int/lit8 v7, v7, -0x4a

    xor-int/lit16 v6, v6, 0x314

    invoke-static {v6, v7, v7, v7}, Landroid/graphics/Color;->argb(IIII)I

    move-result v6

    sget v7, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v9, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    div-int/lit16 v9, v9, -0x21d3

    sub-int/2addr v7, v9

    if-gtz v7, :cond_a

    const-string v7, "\u06e5\u06e3\u06e3"

    invoke-static {v7}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v7

    move/from16 v42, v6

    move/from16 v65, v7

    goto/16 :goto_0

    :cond_a
    const-string v7, "\u06e5\u06e3\u06e3"

    goto :goto_8

    :sswitch_a
    sget v6, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v7, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    or-int/lit16 v7, v7, 0x215

    sub-int/2addr v6, v7

    if-ltz v6, :cond_b

    const-string v6, "\u06e6\u06e8\u06e6"

    invoke-static {v6}, Landroidx/appcompat/app/۟۟ۥۨۤ;->ۤۤۡۡ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v65, v6

    goto/16 :goto_0

    :cond_b
    const-string v6, "\u06e2\u06e6"

    :goto_9
    invoke-static {v6}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v65, v6

    goto/16 :goto_0

    :sswitch_b
    invoke-virtual/range {v37 .. v37}, Landroid/view/View;->postInvalidateOnAnimation()V

    sget v6, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v7, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    add-int/lit16 v7, v7, 0x1396

    add-int/2addr v6, v7

    if-gtz v6, :cond_d

    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣۣ۟ۡ()I

    :cond_c
    const-string v6, "\u06e7\u06e0\u06df"

    invoke-static {v6}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v6

    move/from16 v65, v6

    goto/16 :goto_0

    :cond_d
    const-string v6, "\u06e1\u06e0\u06e6"

    invoke-static {v6}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v65, v6

    goto/16 :goto_0

    :sswitch_c
    if-eqz v43, :cond_1f

    const/16 v6, 0x5a

    sget v7, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    if-ltz v7, :cond_e

    invoke-static {}, Lcom/google/android/material/button/ۥۤ۠;->۠۠ۨۢ()I

    const-string v7, "\u06e3\u06e6\u06e4"

    invoke-static {v7}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v7

    move/from16 v65, v7

    move/from16 v38, v6

    goto/16 :goto_0

    :cond_e
    const-string v7, "\u06e8\u06e2\u06e6"

    goto/16 :goto_5

    :sswitch_d
    const-string v6, "\u06e8\u06e1"

    move/from16 v38, v45

    goto/16 :goto_4

    :sswitch_e
    sget v6, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    if-ltz v6, :cond_f

    invoke-static {}, Landroidx/core/widget/۟ۡۦۢۥ;->ۡۧۡۦ()I

    const-string v6, "\u06e7\u06e0\u06e5"

    invoke-static {v6}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v65, v6

    goto/16 :goto_0

    :cond_f
    sget v6, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v7, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    xor-int/2addr v6, v7

    const v7, 0x1ab71d

    add-int/2addr v6, v7

    move/from16 v65, v6

    goto/16 :goto_0

    :sswitch_f
    const-string v6, "\u06e6\u06e7\u06e5"

    goto :goto_9

    :sswitch_10
    sget v6, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    xor-int/lit16 v6, v6, -0x247

    aput v36, v19, v6

    sget v6, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    xor-int/lit16 v6, v6, -0x248

    const/4 v7, 0x0

    aput v7, v19, v6

    sget v6, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    xor-int/lit16 v6, v6, -0x16f

    aput v35, v19, v6

    new-instance v14, Landroid/graphics/LinearGradient;

    const/4 v6, 0x3

    new-array v0, v6, [F

    move-object/from16 v20, v0

    fill-array-data v20, :array_1

    move/from16 v17, v15

    move-object/from16 v21, v13

    invoke-direct/range {v14 .. v21}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    move-object/from16 v0, p9

    invoke-virtual {v0, v14}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    move-object/from16 v0, p1

    move-object/from16 v1, v48

    move/from16 v2, v63

    move/from16 v3, v63

    move-object/from16 v4, p9

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    sget v6, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v7, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    rem-int/lit16 v7, v7, -0x203b

    sub-int/2addr v6, v7

    if-ltz v6, :cond_5

    invoke-static {}, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۡۥ()I

    const-string v6, "\u06e8\u06df\u06e5"

    invoke-static {v6}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v6

    move/from16 v65, v6

    goto/16 :goto_0

    :sswitch_11
    sget-object v6, Ljava/lang/System;->out:Ljava/io/PrintStream;

    move-object/from16 v0, v51

    invoke-virtual {v6, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v6, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v7, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    rem-int/lit16 v7, v7, 0x1ae8

    div-int/2addr v6, v7

    if-eqz v6, :cond_10

    invoke-static {}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦۥۣۥ()I

    const-string v6, "\u06e6\u06e7\u06e4"

    invoke-static {v6}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v65, v6

    goto/16 :goto_0

    :cond_10
    const-string v9, "\u06e0\u06e8\u06e0"

    move/from16 v6, v35

    move/from16 v7, v36

    :goto_a
    invoke-static {v9}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v9

    move/from16 v35, v6

    move/from16 v36, v7

    move/from16 v65, v9

    goto/16 :goto_0

    :sswitch_12
    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v7, 0x0

    const/4 v9, 0x0

    aget v14, v46, v53

    sub-float/2addr v9, v14

    const v14, 0x3df5c28f    # 0.12f

    sub-float/2addr v9, v14

    sub-float/2addr v7, v9

    invoke-static {v6, v7}, Ljava/lang/Math;->min(FF)F

    move-result v6

    aput v6, v46, v53

    invoke-static/range {v46 .. v46}, Landroid/graphics/Color;->HSVToColor([F)I

    move-result v25

    move/from16 v0, v55

    move-object/from16 v1, v46

    invoke-static {v0, v1}, Landroid/graphics/Color;->colorToHSV(I[F)V

    const/4 v6, 0x0

    aget v7, v46, v53

    const/high16 v9, 0x40400000    # 3.0f

    sub-float/2addr v7, v9

    const v9, 0x3da3d70a    # 0.08f

    sub-float/2addr v7, v9

    const/high16 v9, 0x40400000    # 3.0f

    add-float/2addr v7, v9

    invoke-static {v6, v7}, Ljava/lang/Math;->max(FF)F

    move-result v6

    aput v6, v46, v53

    invoke-static/range {v46 .. v46}, Landroid/graphics/Color;->HSVToColor([F)I

    move-result v26

    sget v6, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v7, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    rem-int/lit16 v7, v7, -0x1270

    rem-int/2addr v6, v7

    if-ltz v6, :cond_11

    invoke-static {}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۧۧ()I

    const-string v6, "\u06e0\u06e5\u06e0"

    invoke-static {v6}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v65, v6

    goto/16 :goto_0

    :cond_11
    sget v6, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v7, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sub-int/2addr v6, v7

    const v7, 0x1aab72

    add-int/2addr v6, v7

    move/from16 v65, v6

    goto/16 :goto_0

    :sswitch_13
    sget v6, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v7, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    add-int/lit16 v7, v7, 0x1a6f

    sub-int/2addr v6, v7

    if-ltz v6, :cond_12

    const/16 v6, 0x36

    sput v6, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    const-string v6, "\u06e5\u06e8\u06e1"

    invoke-static {v6}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v65, v6

    goto/16 :goto_0

    :cond_12
    const-string v6, "\u06e8\u06e1"

    goto/16 :goto_4

    :sswitch_14
    sget v6, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v7, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    or-int/2addr v6, v7

    const v7, -0x1ab664

    xor-int/2addr v6, v7

    move/from16 v65, v6

    move/from16 v43, v44

    goto/16 :goto_0

    :sswitch_15
    invoke-static {}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۨۧ۟ۤ()I

    move-result v6

    if-ltz v6, :cond_13

    invoke-static {}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟۠ۢۨۦ()I

    const-string v6, "\u06e2\u06e1\u06e8"

    invoke-static {v6}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v65, v6

    goto/16 :goto_0

    :cond_13
    const-string v7, "\u06df\u06e8\u06df"

    move/from16 v6, v43

    :goto_b
    invoke-static {v7}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v7

    move/from16 v65, v7

    move/from16 v43, v6

    goto/16 :goto_0

    :sswitch_16
    move-object/from16 v0, p0

    iget-object v6, v0, Lrn;->e:Landroid/widget/TextView;

    if-eqz v6, :cond_24

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v20

    const-wide/16 v70, -0xac9

    sget v7, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    int-to-long v0, v7

    move-wide/from16 v72, v0

    xor-long v70, v70, v72

    rem-long v20, v20, v70

    move-wide/from16 v0, v20

    long-to-float v7, v0

    move-wide/from16 v0, v70

    long-to-float v9, v0

    div-float/2addr v7, v9

    sget v9, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v14, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    xor-int/2addr v9, v14

    const v14, 0x1ac05e

    add-int/2addr v9, v14

    move-object/from16 v37, v6

    move/from16 v58, v7

    move/from16 v65, v9

    goto/16 :goto_0

    :cond_14
    :sswitch_17
    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟ۧ۠ۧۢ()I

    move-result v6

    if-ltz v6, :cond_15

    invoke-static {}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟۠ۢۨۦ()I

    const-string v7, "\u06df\u06df\u06e7"

    move/from16 v6, v43

    goto :goto_b

    :cond_15
    const-string v6, "\u06e0\u06e8\u06e0"

    goto/16 :goto_9

    :sswitch_18
    const/4 v6, 0x0

    invoke-static {}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۣۣ۟ۥ۟()I

    move-result v7

    if-gtz v7, :cond_1b

    const-string v7, "\u06e7\u06e3\u06e8"

    invoke-static {v7}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v7

    move/from16 v44, v6

    move/from16 v65, v7

    goto/16 :goto_0

    :sswitch_19
    move-object/from16 v0, p9

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    move-object/from16 v0, p1

    move-object/from16 v1, v48

    move/from16 v2, v63

    move/from16 v3, v63

    move-object/from16 v4, p9

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->clearShadowLayer()V

    move-object/from16 v0, v48

    iget v15, v0, Landroid/graphics/RectF;->left:F

    move-object/from16 v0, v48

    iget v0, v0, Landroid/graphics/RectF;->top:F

    move/from16 v16, v0

    invoke-static {}, Landroidx/core/widget/۟ۡۦۢۥ;->ۡۧۡۦ()I

    move-result v6

    if-ltz v6, :cond_c

    const/16 v6, 0x52

    sput v6, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    const-string v6, "\u06e1\u06e7\u06e5"

    invoke-static {v6}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v65, v6

    goto/16 :goto_0

    :sswitch_1a
    sget v6, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v7, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    rem-int/2addr v6, v7

    const v7, 0x1ab729

    add-int/2addr v6, v7

    move/from16 v65, v6

    goto/16 :goto_0

    :cond_16
    :sswitch_1b
    invoke-static {}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۡۥ۟()I

    move-result v6

    if-gtz v6, :cond_17

    invoke-static {}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۧۧ()I

    const-string v6, "\u06e2\u06e0\u06e8"

    goto/16 :goto_1

    :cond_17
    const-string v6, "\u06e7\u06e8\u06df"

    goto/16 :goto_1

    :sswitch_1c
    move-object/from16 v0, v48

    iget v6, v0, Landroid/graphics/RectF;->left:F

    const/high16 v7, 0x41100000    # 9.0f

    sub-float/2addr v6, v7

    sub-float v6, v6, v30

    const/high16 v7, 0x41100000    # 9.0f

    add-float/2addr v6, v7

    move-object/from16 v0, v48

    iget v7, v0, Landroid/graphics/RectF;->right:F

    invoke-virtual/range {v29 .. v29}, Landroid/graphics/Matrix;->reset()V

    const/4 v9, 0x0

    const/high16 v14, 0x3f800000    # 1.0f

    sub-float/2addr v7, v14

    sub-float/2addr v7, v6

    const/high16 v14, 0x3f800000    # 1.0f

    add-float/2addr v7, v14

    mul-float v7, v7, v58

    sub-float v7, v9, v7

    sub-float/2addr v6, v7

    const/4 v7, 0x0

    move-object/from16 v0, v29

    invoke-virtual {v0, v6, v7}, Landroid/graphics/Matrix;->setTranslate(FF)V

    invoke-virtual/range {v28 .. v29}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    move-object/from16 v6, v39

    move/from16 v7, v40

    move/from16 v9, v41

    goto/16 :goto_6

    :sswitch_1d
    invoke-virtual/range {v29 .. v29}, Landroid/graphics/Matrix;->reset()V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const v9, 0x3e99999a    # 0.3f

    mul-float/2addr v9, v12

    sub-float/2addr v7, v9

    move-object/from16 v0, v48

    iget v9, v0, Landroid/graphics/RectF;->left:F

    sub-float/2addr v7, v9

    sub-float/2addr v6, v7

    const/4 v7, 0x0

    move-object/from16 v0, v29

    invoke-virtual {v0, v6, v7}, Landroid/graphics/Matrix;->setTranslate(FF)V

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟ۡۡۦ()I

    move-result v6

    if-gtz v6, :cond_18

    const-string v6, "\u06e6\u06e7\u06e5"

    invoke-static {v6}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v65, v6

    goto/16 :goto_0

    :cond_18
    const-string v6, "\u06e3\u06e6\u06e4"

    invoke-static {v6}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v6

    move/from16 v65, v6

    goto/16 :goto_0

    :sswitch_1e
    sget v6, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v7, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    rem-int/2addr v6, v7

    const v7, 0x1ac8ad

    add-int/2addr v6, v7

    move/from16 v65, v6

    goto/16 :goto_0

    :sswitch_1f
    invoke-static {}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۦۥۨۦ()I

    move-result v6

    if-ltz v6, :cond_19

    invoke-static {}, Landroid/window/۟ۤ۟ۡۧ;->ۢۦۣۨ()I

    const-string v6, "\u06e2\u06e7\u06df"

    goto/16 :goto_9

    :cond_19
    sget v6, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v7, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    xor-int/2addr v6, v7

    const v7, 0x1acc4a

    add-int/2addr v6, v7

    move/from16 v65, v6

    goto/16 :goto_0

    :sswitch_20
    const v6, 0x3f4ccccd    # 0.8f

    mul-float v30, v12, v6

    const-string v6, "OEVdjV6Sbg==\n"

    const-string v7, "GwMbyxjUKEA=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    const/4 v7, 0x3

    new-array v0, v7, [I

    move-object/from16 v32, v0

    sget v7, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    xor-int/lit16 v7, v7, -0x1f9

    aput v54, v32, v7

    sget v7, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    xor-int/lit16 v7, v7, 0x303

    aput v6, v32, v7

    const-string v7, "\u06e6\u06e7\u06e4"

    move/from16 v6, v43

    goto/16 :goto_b

    :sswitch_21
    move-object/from16 v0, p9

    move-object/from16 v1, v39

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    move-object/from16 v0, p9

    move/from16 v1, v41

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    move-object/from16 v0, p9

    move/from16 v1, v40

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    const/4 v6, 0x0

    move-object/from16 v0, p9

    invoke-virtual {v0, v6}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    invoke-static {}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۟ۦۣۣۧ()I

    move-result v6

    if-gtz v6, :cond_14

    goto/16 :goto_7

    :sswitch_22
    const/16 v45, 0x78

    sget v6, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v7, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    add-int/lit16 v7, v7, 0x1eab

    or-int/2addr v6, v7

    if-gtz v6, :cond_1a

    invoke-static {}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۦۢۧۧ()I

    const-string v6, "\u06e8\u06e3\u06e0"

    invoke-static {v6}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v65, v6

    goto/16 :goto_0

    :cond_1a
    sget v6, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v7, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    mul-int/2addr v6, v7

    const v7, -0x1a6b76

    xor-int/2addr v6, v7

    move/from16 v65, v6

    goto/16 :goto_0

    :sswitch_23
    invoke-static/range {v54 .. v54}, Landroid/graphics/Color;->blue(I)I

    move-result v6

    int-to-double v6, v6

    const-wide v20, 0x3fbd2f1a9fbe76c9L    # 0.114

    mul-double v6, v6, v20

    const-wide/16 v20, 0x0

    const-wide v70, 0x3fe2c8b439581062L    # 0.587

    mul-double v70, v70, v66

    const-wide/16 v72, 0x0

    const-wide v74, 0x3fd322d0e5604189L    # 0.299

    mul-double v74, v74, v68

    sub-double v72, v72, v74

    sub-double v70, v70, v72

    sub-double v20, v20, v70

    sub-double v6, v6, v20

    const-wide/high16 v20, 0x4060000000000000L    # 128.0

    cmpg-double v6, v6, v20

    if-gez v6, :cond_16

    const/4 v6, 0x1

    const-string v7, "\u06e3\u06e0\u06e1"

    goto/16 :goto_b

    :sswitch_24
    const-string v6, "bcPurMbqDLIfVRSMg3dv5Kq"

    invoke-static {v6}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۡۡۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v6

    sget v7, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v9, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    mul-int/2addr v7, v9

    const v9, 0x1e0d63

    add-int/2addr v7, v9

    move-object/from16 v51, v6

    move/from16 v65, v7

    goto/16 :goto_0

    :sswitch_25
    move-object/from16 v0, p0

    iget v7, v0, Lrn;->b:I

    const/high16 v6, 0x41600000    # 14.0f

    const/4 v9, 0x0

    const/high16 v14, 0x40800000    # 4.0f

    invoke-static {v7}, Landroid/graphics/Color;->red(I)I

    move-result v17

    invoke-static {v7}, Landroid/graphics/Color;->green(I)I

    move-result v20

    invoke-static {v7}, Landroid/graphics/Color;->blue(I)I

    move-result v21

    move/from16 v0, v38

    move/from16 v1, v17

    move/from16 v2, v20

    move/from16 v3, v21

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v17

    move-object/from16 v0, p9

    move/from16 v1, v17

    invoke-virtual {v0, v6, v9, v14, v1}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    const/4 v6, 0x3

    new-array v6, v6, [F

    invoke-static {v7, v6}, Landroid/graphics/Color;->colorToHSV(I[F)V

    const/4 v9, 0x1

    const/4 v14, 0x0

    const/16 v17, 0x1

    aget v17, v6, v17

    const/high16 v20, 0x41e00000    # 28.0f

    sub-float v17, v17, v20

    const v20, 0x3d4ccccd    # 0.05f

    sub-float v17, v17, v20

    const/high16 v20, 0x41e00000    # 28.0f

    add-float v17, v17, v20

    move/from16 v0, v17

    invoke-static {v14, v0}, Ljava/lang/Math;->max(FF)F

    move-result v14

    aput v14, v6, v9

    sget v9, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    sget v14, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    mul-int/2addr v9, v14

    const v14, 0x191de6

    add-int/2addr v9, v14

    move-object/from16 v46, v6

    move/from16 v55, v7

    move/from16 v65, v9

    goto/16 :goto_0

    :sswitch_26
    sget v6, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    xor-int/lit8 v6, v6, 0x43

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    invoke-static {v6, v7, v9, v11}, Landroid/graphics/Color;->argb(IIII)I

    move-result v6

    const/4 v7, 0x3

    new-array v11, v7, [I

    sget v7, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    xor-int/lit16 v7, v7, 0xb0

    aput v42, v11, v7

    sget v7, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    xor-int/lit16 v7, v7, -0x12c

    const/4 v9, 0x0

    aput v9, v11, v7

    sget v7, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    xor-int/lit16 v7, v7, -0x1b7

    aput v6, v11, v7

    sget v6, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    if-ltz v6, :cond_1c

    move/from16 v6, v44

    :cond_1b
    const-string v7, "\u06e8\u06e2\u06e5"

    invoke-static {v7}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v7

    move/from16 v44, v6

    move/from16 v65, v7

    goto/16 :goto_0

    :cond_1c
    const-string v6, "\u06e6\u06e3\u06e2"

    goto/16 :goto_1

    :sswitch_27
    move-object/from16 v0, v52

    iget v7, v0, Landroid/graphics/Paint$FontMetrics;->descent:F

    move-object/from16 v0, v52

    iget v14, v0, Landroid/graphics/Paint$FontMetrics;->ascent:F

    sget v6, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    xor-int/lit16 v6, v6, -0x31c

    int-to-float v9, v6

    move-object/from16 v0, p0

    iget v0, v0, Lrn;->h:F

    move/from16 v17, v0

    mul-float v17, v17, v9

    const/16 v20, 0x0

    const/high16 v21, 0x40c00000    # 6.0f

    add-float v7, v7, v21

    sub-float/2addr v7, v14

    const/high16 v14, 0x40c00000    # 6.0f

    sub-float/2addr v7, v14

    sub-float v7, v20, v7

    sub-float v7, v17, v7

    sget v14, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v17, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    xor-int v14, v14, v17

    const v17, 0x1acc76

    add-int v14, v14, v17

    move/from16 v53, v6

    move/from16 v57, v7

    move/from16 v59, v9

    move/from16 v65, v14

    goto/16 :goto_0

    :sswitch_28
    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->getShader()Landroid/graphics/Shader;

    move-result-object v6

    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v7

    const v9, 0x3f47ae14    # 0.78f

    mul-float v9, v9, v41

    move-object/from16 v0, p9

    invoke-virtual {v0, v9}, Landroid/graphics/Paint;->setTextSize(F)V

    const/4 v9, 0x1

    move-object/from16 v0, p9

    invoke-virtual {v0, v9}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v9

    sget v14, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v17, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    move/from16 v0, v17

    mul-int/lit16 v0, v0, 0xd1e

    move/from16 v17, v0

    add-int v14, v14, v17

    if-ltz v14, :cond_1d

    invoke-static {}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۟ۦۣۣۧ()I

    const-string v14, "\u06e2\u06e6"

    invoke-static {v14}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v14

    move-object/from16 v47, v6

    move-object/from16 v50, v7

    move-object/from16 v52, v9

    move/from16 v65, v14

    goto/16 :goto_0

    :cond_1d
    sget v14, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v17, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    add-int v14, v14, v17

    const v17, 0x1ac799

    add-int v14, v14, v17

    move-object/from16 v47, v6

    move-object/from16 v50, v7

    move-object/from16 v52, v9

    move/from16 v65, v14

    goto/16 :goto_0

    :sswitch_29
    move-object/from16 v0, v48

    iget v0, v0, Landroid/graphics/RectF;->top:F

    move/from16 v22, v0

    move-object/from16 v0, v48

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    move/from16 v24, v0

    sget-object v27, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    new-instance v20, Landroid/graphics/LinearGradient;

    const/16 v21, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v20 .. v27}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    move-object/from16 v0, p9

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    sget-object v6, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-static {}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣۤۧۥ()I

    move-result v7

    if-gtz v7, :cond_1e

    const/16 v7, 0x4a

    sput v7, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    const-string v7, "\u06e1\u06e0\u06e6"

    invoke-static {v7}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v13, v27

    move-object/from16 v22, v6

    move/from16 v65, v7

    goto/16 :goto_0

    :cond_1e
    sget v7, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v9, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    div-int/2addr v7, v9

    const v9, 0x1ac203

    add-int/2addr v7, v9

    move-object/from16 v13, v27

    move-object/from16 v22, v6

    move/from16 v65, v7

    goto/16 :goto_0

    :cond_1f
    :sswitch_2a
    invoke-static {}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟۠ۢۧۡ()I

    move-result v6

    if-ltz v6, :cond_20

    const-string v6, "\u06e1\u06e1\u06e2"

    goto/16 :goto_4

    :cond_20
    sget v6, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v7, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    or-int/2addr v6, v7

    const v7, 0x1ac72d

    add-int/2addr v6, v7

    move/from16 v65, v6

    goto/16 :goto_0

    :sswitch_2b
    sget v6, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    xor-int/lit16 v6, v6, -0xe6

    aput v54, v32, v6

    new-instance v27, Landroid/graphics/LinearGradient;

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    const/4 v6, 0x3

    new-array v0, v6, [F

    move-object/from16 v33, v0

    fill-array-data v33, :array_2

    move-object/from16 v34, v13

    invoke-direct/range {v27 .. v34}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    move-object/from16 v0, p0

    iget-boolean v6, v0, Lrn;->d:Z

    move-object/from16 v0, p0

    iget-object v7, v0, Lrn;->j:Landroid/graphics/Matrix;

    if-eqz v6, :cond_3

    sget v6, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    if-ltz v6, :cond_21

    const/16 v6, 0x13

    sput v6, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    const-string v6, "\u06e5\u06e8\u06e2"

    invoke-static {v6}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v28, v27

    move-object/from16 v29, v7

    move/from16 v65, v6

    goto/16 :goto_0

    :cond_21
    const-string v6, "\u06e2\u06e1\u06e8"

    move-object/from16 v28, v27

    move-object/from16 v29, v7

    goto/16 :goto_4

    :sswitch_2c
    new-instance v6, Landroid/graphics/RectF;

    const/4 v7, 0x0

    sub-float v7, v7, v64

    sub-float v7, p5, v7

    const/high16 v9, 0x41b80000    # 23.0f

    add-float v9, v9, v61

    sub-float v9, v9, v57

    const/high16 v14, 0x41b80000    # 23.0f

    sub-float/2addr v9, v14

    mul-float v14, v59, v60

    const/16 v17, 0x0

    const/high16 v20, 0x42000000    # 32.0f

    sub-float v20, v62, v20

    const/high16 v21, 0x40c00000    # 6.0f

    add-float v21, v21, p5

    add-float v21, v21, v64

    const/high16 v23, 0x40c00000    # 6.0f

    sub-float v21, v21, v23

    add-float v20, v20, v21

    const/high16 v21, 0x42000000    # 32.0f

    add-float v20, v20, v21

    sub-float v17, v17, v20

    sub-float v14, v14, v17

    move/from16 v0, v61

    invoke-direct {v6, v7, v9, v14, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    const v7, 0x3eb33333    # 0.35f

    mul-float v9, v57, v7

    move-object/from16 v0, p0

    iget v7, v0, Lrn;->c:I

    invoke-static {v7}, Landroid/graphics/Color;->red(I)I

    move-result v14

    int-to-double v0, v14

    move-wide/from16 v68, v0

    invoke-static {v7}, Landroid/graphics/Color;->green(I)I

    move-result v14

    int-to-double v0, v14

    move-wide/from16 v20, v0

    sget v14, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v17, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    add-int v14, v14, v17

    const v17, 0x1aab7a

    add-int v14, v14, v17

    move-object/from16 v48, v6

    move/from16 v54, v7

    move/from16 v63, v9

    move-wide/from16 v66, v20

    move/from16 v65, v14

    goto/16 :goto_0

    :sswitch_2d
    move-object/from16 v0, v48

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    move/from16 v18, v0

    sget v6, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    xor-int/lit16 v6, v6, -0x393

    sget v7, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    xor-int/lit16 v7, v7, -0x218

    invoke-static {v7, v6, v6, v6}, Landroid/graphics/Color;->argb(IIII)I

    move-result v7

    sget v9, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    xor-int/lit16 v9, v9, -0x319

    invoke-static {v9, v6, v6, v6}, Landroid/graphics/Color;->argb(IIII)I

    move-result v6

    const/4 v9, 0x3

    new-array v0, v9, [I

    move-object/from16 v19, v0

    sget v9, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    sget v14, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    mul-int/lit16 v14, v14, -0x15dd

    sub-int/2addr v9, v14

    if-gtz v9, :cond_22

    const/16 v9, 0x10

    sput v9, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    const-string v9, "\u06e6\u06e3\u06e2"

    goto/16 :goto_a

    :cond_22
    const-string v9, "\u06e8\u06e1\u06e7"

    invoke-static {v9}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v9

    move/from16 v35, v6

    move/from16 v36, v7

    move/from16 v65, v9

    goto/16 :goto_0

    :sswitch_2e
    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟ۧ۠ۧۢ()I

    move-result v6

    if-ltz v6, :cond_23

    const-string v6, "\u06e0\u06e6\u06e5"

    invoke-static {v6}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v6

    move/from16 v65, v6

    goto/16 :goto_0

    :cond_23
    const-string v6, "\u06e0\u06e3\u06e4"

    invoke-static {v6}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v65, v6

    goto/16 :goto_0

    :sswitch_2f
    return-void

    :cond_24
    move-object/from16 v27, v28

    move-object/from16 v7, v29

    goto/16 :goto_3

    :sswitch_30
    move-object/from16 v27, v28

    move-object/from16 v6, v37

    move-object/from16 v7, v29

    goto/16 :goto_3

    :sswitch_data_0
    .sparse-switch
        0xdc44 -> :sswitch_0
        0xdc9c -> :sswitch_20
        0xdcc1 -> :sswitch_3
        0xdcf9 -> :sswitch_25
        0x1aa71e -> :sswitch_a
        0x1aa725 -> :sswitch_17
        0x1aa816 -> :sswitch_13
        0x1aa81e -> :sswitch_1
        0x1aab23 -> :sswitch_11
        0x1aab41 -> :sswitch_7
        0x1aab7b -> :sswitch_23
        0x1aabd8 -> :sswitch_2f
        0x1aae81 -> :sswitch_24
        0x1aae83 -> :sswitch_2e
        0x1aae84 -> :sswitch_2c
        0x1aaea1 -> :sswitch_30
        0x1aaea7 -> :sswitch_1e
        0x1aaec4 -> :sswitch_d
        0x1aaec6 -> :sswitch_29
        0x1aaf7f -> :sswitch_1a
        0x1aaf9e -> :sswitch_b
        0x1ab286 -> :sswitch_1b
        0x1ab289 -> :sswitch_16
        0x1ab624 -> :sswitch_e
        0x1ab683 -> :sswitch_c
        0x1ab6c2 -> :sswitch_12
        0x1ab6e1 -> :sswitch_5
        0x1aba45 -> :sswitch_2a
        0x1aba87 -> :sswitch_1a
        0x1abe05 -> :sswitch_26
        0x1abe9f -> :sswitch_1c
        0x1ac18b -> :sswitch_f
        0x1ac1c5 -> :sswitch_2
        0x1ac202 -> :sswitch_1f
        0x1ac209 -> :sswitch_19
        0x1ac243 -> :sswitch_2b
        0x1ac244 -> :sswitch_a
        0x1ac526 -> :sswitch_2d
        0x1ac52c -> :sswitch_22
        0x1ac56d -> :sswitch_1d
        0x1ac58c -> :sswitch_13
        0x1ac5a4 -> :sswitch_9
        0x1ac61e -> :sswitch_18
        0x1ac8ce -> :sswitch_8
        0x1ac90d -> :sswitch_21
        0x1ac90e -> :sswitch_10
        0x1ac92b -> :sswitch_14
        0x1ac92c -> :sswitch_15
        0x1ac945 -> :sswitch_27
        0x1ac966 -> :sswitch_2e
        0x1ac969 -> :sswitch_4
        0x1ac9a2 -> :sswitch_28
        0x1ac9e3 -> :sswitch_6
    .end sparse-switch

    :array_0
    .array-data 4
        0x0
        0x3ecccccd    # 0.4f
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
    .end array-data

    :array_2
    .array-data 4
        0x0
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final getSize(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I
    .locals 6

    const/4 v2, 0x0

    const-string v0, "\u06e0\u06e8\u06e7"

    invoke-static {v0}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v0

    move v1, v2

    move v3, v2

    move v4, v2

    move v5, v0

    :goto_0
    sparse-switch v5, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget v0, p0, Lrn;->f:F

    float-to-int v0, v0

    return v0

    :sswitch_1
    invoke-virtual {p1}, Landroid/graphics/Paint;->getTextSize()F

    move-result v0

    sget v3, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v5, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    or-int/2addr v3, v5

    const v5, -0x1ac16b

    xor-int/2addr v5, v3

    move v3, v0

    goto :goto_0

    :sswitch_2
    const v0, 0x3f47ae14    # 0.78f

    mul-float/2addr v0, v3

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    sget v0, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v5, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    div-int/lit16 v5, v5, 0x1c85

    xor-int/2addr v0, v5

    if-gtz v0, :cond_0

    const-string v0, "\u06e6\u06e0\u06e4"

    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e2\u06e5\u06e3"

    invoke-static {v0}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto :goto_0

    :sswitch_3
    iget v0, p0, Lrn;->g:F

    mul-float/2addr v0, v4

    sub-float v5, v2, v1

    sub-float/2addr v0, v5

    iget v5, p0, Lrn;->i:F

    sub-float v5, v2, v5

    sub-float/2addr v0, v5

    iput v0, p0, Lrn;->f:F

    invoke-static {}, Landroidx/legacy/content/ۧۡ۠۠;->ۥۧۡۦ()I

    move-result v0

    if-gtz v0, :cond_1

    const/16 v0, 0x4d

    sput v0, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    const-string v0, "\u06df\u06e2\u06e3"

    :goto_1
    invoke-static {v0}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto :goto_0

    :cond_1
    sget v0, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v5, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    or-int/2addr v0, v5

    const v5, -0x1aafe9

    xor-int/2addr v0, v5

    move v5, v0

    goto :goto_0

    :sswitch_4
    sget v0, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    xor-int/lit16 v0, v0, -0x31c

    int-to-float v0, v0

    invoke-static {}, Lۤۨۤۨ;->۟ۢۦۣۢ()I

    move-result v4

    if-ltz v4, :cond_2

    :cond_2
    const-string v4, "\u06e1\u06e5\u06e8"

    invoke-static {v4}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v5

    move v4, v0

    goto :goto_0

    :sswitch_5
    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    const-string v0, "\u06e2\u06e2"

    invoke-static {v0}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto :goto_0

    :sswitch_6
    const-string v0, "Iyj4fgA=\n"

    const-string v5, "U0mREHSEaDA=\n"

    invoke-static {v0, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "\u06e5\u06e4\u06e7"

    goto :goto_1

    :sswitch_7
    sget v0, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v5, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    rem-int/2addr v0, v5

    const v5, 0x1aa9a4

    xor-int/2addr v0, v5

    move v5, v0

    goto/16 :goto_0

    :sswitch_8
    iget-object v0, p0, Lrn;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v0

    sget v1, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v5, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    or-int/lit16 v5, v5, -0x11e4

    div-int/2addr v1, v5

    if-gtz v1, :cond_3

    invoke-static {}, Landroid/window/ۦۣۦۥ;->ۡۥۥۥ()I

    const-string v1, "\u06e2\u06e2"

    invoke-static {v1}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v5

    move v1, v0

    goto/16 :goto_0

    :cond_3
    sget v1, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v5, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    div-int/2addr v1, v5

    const v5, -0x1aab02

    xor-int/2addr v5, v1

    move v1, v0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc40 -> :sswitch_0
        0x1aa760 -> :sswitch_7
        0x1aab01 -> :sswitch_4
        0x1aabdf -> :sswitch_6
        0x1aaf44 -> :sswitch_3
        0x1aaf5c -> :sswitch_5
        0x1ab300 -> :sswitch_8
        0x1abe28 -> :sswitch_1
        0x1ac16a -> :sswitch_2
    .end sparse-switch
.end method
