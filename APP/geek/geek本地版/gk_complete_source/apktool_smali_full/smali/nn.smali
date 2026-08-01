.class public final Lnn;
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

    const-string v0, "9QKuig==\n"

    const-string v1, "gWfW/pNkN4U=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Landroid/text/style/ReplacementSpan;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e2\u06df\u06e6"

    invoke-static {v1}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const/high16 v0, 0x41700000    # 15.0f

    iput v0, p0, Lnn;->g:F

    invoke-static {}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۦۤۨۢ()I

    move-result v0

    if-gtz v0, :cond_4

    invoke-static {}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣ۟۠()I

    const-string v0, "\u06e2\u06e5\u06e1"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_1
    const/high16 v0, 0x41400000    # 12.0f

    iput v0, p0, Lnn;->i:F

    sget v0, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v2, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    add-int/lit16 v2, v2, 0x531

    xor-int/2addr v0, v2

    if-ltz v0, :cond_1

    const/16 v0, 0x37

    sput v0, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    :cond_0
    const-string v0, "\u06e8\u06e5\u06e2"

    invoke-static {v0}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e2\u06e5\u06e1"

    :goto_1
    invoke-static {v0}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_2
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lnn;->j:Landroid/graphics/Matrix;

    const-string v0, "\u06e1\u06e0\u06df"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_3
    iput p3, p0, Lnn;->c:I

    const-string v0, "\u06e2\u06df\u06e8"

    :goto_2
    invoke-static {v0}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_4
    sget v0, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v2, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    add-int/2addr v0, v2

    const v2, 0x1aaecb

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_5
    iput-object p1, p0, Lnn;->a:Ljava/lang/String;

    sget v0, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sget v2, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    rem-int/2addr v0, v2

    const v2, 0x1aba79

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_6
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->۟ۡۥۥۣ()I

    move-result v0

    if-gtz v0, :cond_0

    const/16 v0, 0x5c

    sput v0, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    const-string v0, "\u06e4\u06e3\u06e4"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_7
    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۣۤۧ()I

    move-result v0

    if-gtz v0, :cond_7

    :cond_2
    const-string v0, "\u06e1\u06e7\u06e7"

    goto :goto_1

    :sswitch_8
    const/high16 v0, 0x40a00000    # 5.0f

    iput v0, p0, Lnn;->h:F

    sget v0, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v2, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    add-int/lit16 v2, v2, 0x16a1

    rem-int/2addr v0, v2

    if-gtz v0, :cond_3

    invoke-static {}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۡۦۣۨ()I

    const-string v0, "\u06e7\u06e7\u06e2"

    invoke-static {v0}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_3
    sget v0, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v2, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sub-int/2addr v0, v2

    const v2, -0x1ac04f

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :cond_4
    sget v0, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v2, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    xor-int/2addr v0, v2

    const v2, 0x1ab262

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_9
    iput p2, p0, Lnn;->b:I

    sget v0, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v2, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    or-int/lit16 v2, v2, 0x170d

    rem-int/2addr v0, v2

    if-gtz v0, :cond_5

    const-string v0, "\u06e7\u06e0\u06e8"

    goto :goto_2

    :cond_5
    const-string v0, "\u06e5\u06df\u06e5"

    :goto_3
    invoke-static {v0}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_a
    iput-object p5, p0, Lnn;->e:Landroid/widget/TextView;

    sget v0, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v2, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    xor-int/lit16 v2, v2, 0x88e

    xor-int/2addr v0, v2

    if-gtz v0, :cond_6

    const/16 v0, 0x5b

    sput v0, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    const-string v0, "\u06e2\u06df\u06e6"

    goto :goto_3

    :cond_6
    sget v0, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v2, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sub-int/2addr v0, v2

    const v2, 0x1ab044

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_b
    const-string v0, "j8wVPqic"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۤۧۥۣ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "\u06e1\u06e8\u06e3"

    invoke-static {v1}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto/16 :goto_0

    :cond_7
    :sswitch_c
    invoke-static {}, Lio/fastkv/ۦۣ۠ۨ;->۠ۡۨۧ()I

    move-result v0

    if-ltz v0, :cond_8

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟ۢۡ۟۟()I

    const-string v0, "\u06e5\u06e7\u06e0"

    :goto_4
    invoke-static {v0}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_8
    sget v0, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v2, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    rem-int/2addr v0, v2

    const v2, -0x1ac8e5

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_d
    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lnn;->f:F

    const-string v0, "\u06e7\u06e3"

    goto :goto_4

    :sswitch_e
    iput-boolean p4, p0, Lnn;->d:Z

    sget v0, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v2, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    or-int/lit16 v2, v2, 0xa71

    div-int/2addr v0, v2

    if-nez v0, :cond_2

    const-string v0, "\u06e1\u06e0\u06e3"

    goto/16 :goto_1

    :sswitch_f
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdcdc -> :sswitch_0
        0x1aaea0 -> :sswitch_7
        0x1aaea4 -> :sswitch_a
        0x1aaf81 -> :sswitch_b
        0x1aaf9c -> :sswitch_6
        0x1ab249 -> :sswitch_5
        0x1ab24b -> :sswitch_e
        0x1ab284 -> :sswitch_8
        0x1ab2fe -> :sswitch_2
        0x1ab604 -> :sswitch_d
        0x1aba24 -> :sswitch_c
        0x1aba45 -> :sswitch_9
        0x1abd8b -> :sswitch_3
        0x1ac52f -> :sswitch_1
        0x1ac602 -> :sswitch_4
        0x1ac985 -> :sswitch_f
    .end sparse-switch
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
    .locals 74

    const/16 v69, 0x0

    const/16 v28, 0x0

    const/16 v16, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v27, 0x0

    const/16 v34, 0x0

    const/16 v30, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v35, 0x0

    const/16 v39, 0x0

    const/16 v36, 0x0

    const/16 v43, 0x0

    const/16 v45, 0x0

    const/16 v44, 0x0

    const-wide/16 v48, 0x0

    const-wide/16 v46, 0x0

    const/16 v42, 0x0

    const/16 v40, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v25, 0x0

    const/4 v7, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v20, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v52, 0x0

    const/16 v51, 0x0

    const/16 v18, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v19, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v41, 0x0

    const/16 v50, 0x0

    const/16 v23, 0x0

    const/4 v8, 0x0

    const-string v55, "\u06e4\u06e0\u06df"

    invoke-static/range {v55 .. v55}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v70

    move-object/from16 v55, v6

    move-object/from16 v56, v7

    move-object/from16 v57, v8

    move-object/from16 v58, v9

    move-object/from16 v59, v10

    move-object/from16 v60, v13

    move-object/from16 v61, v16

    move/from16 v62, v19

    move/from16 v63, v23

    move/from16 v64, v25

    move/from16 v65, v27

    move/from16 v66, v28

    move/from16 v67, v30

    move/from16 v68, v34

    :goto_0
    sparse-switch v70, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v6, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    xor-int/lit8 v6, v6, 0x5d

    aput v52, v18, v6

    sget v6, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    xor-int/lit16 v6, v6, 0x278

    const/4 v7, 0x0

    aput v7, v18, v6

    sget v6, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    xor-int/lit16 v6, v6, -0x23a

    aput v51, v18, v6

    new-instance v13, Landroid/graphics/LinearGradient;

    const/4 v6, 0x3

    new-array v0, v6, [F

    move-object/from16 v19, v0

    fill-array-data v19, :array_0

    move/from16 v16, v14

    invoke-direct/range {v13 .. v20}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    move-object/from16 v0, p9

    invoke-virtual {v0, v13}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    move-object/from16 v0, p1

    move-object/from16 v1, v43

    move/from16 v2, v45

    move/from16 v3, v45

    move-object/from16 v4, p9

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    invoke-static {}, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۢ۠ۨ۟()I

    move-result v6

    if-ltz v6, :cond_13

    invoke-static {}, Landroidx/core/content/ۣ۟ۧ۠;->۟۟۠ۢۨ()I

    move/from16 v6, v42

    :cond_0
    const-string v7, "\u06df\u06e1\u06e4"

    invoke-static {v7}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v7

    move/from16 v42, v6

    move/from16 v70, v7

    goto :goto_0

    :sswitch_1
    invoke-virtual/range {v43 .. v43}, Landroid/graphics/RectF;->centerY()F

    move-result v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v0, v59

    iget v9, v0, Landroid/graphics/Paint$FontMetrics;->descent:F

    sub-float/2addr v8, v9

    move-object/from16 v0, v59

    iget v9, v0, Landroid/graphics/Paint$FontMetrics;->ascent:F

    sub-float/2addr v8, v9

    sub-float/2addr v7, v8

    const/high16 v8, 0x40000000    # 2.0f

    div-float/2addr v7, v8

    move-object/from16 v0, v43

    iget v8, v0, Landroid/graphics/RectF;->left:F

    const/high16 v9, 0x41f00000    # 30.0f

    add-float/2addr v8, v9

    add-float v8, v8, v36

    const/high16 v9, 0x41f00000    # 30.0f

    sub-float/2addr v8, v9

    const/high16 v9, 0x41d00000    # 26.0f

    add-float/2addr v6, v9

    sub-float/2addr v6, v7

    const/high16 v7, 0x41d00000    # 26.0f

    sub-float/2addr v6, v7

    move-object/from16 v0, p1

    move-object/from16 v1, v35

    move-object/from16 v2, p9

    invoke-virtual {v0, v1, v8, v6, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->clearShadowLayer()V

    move-object/from16 v0, p9

    move-object/from16 v1, v55

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    sget v6, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v7, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    rem-int/lit16 v7, v7, -0x1921

    xor-int/2addr v6, v7

    if-gtz v6, :cond_1

    const/16 v6, 0x2b

    sput v6, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    const-string v13, "\u06e5\u06e3\u06e4"

    move-object/from16 v6, v35

    move/from16 v7, v36

    move/from16 v8, v37

    move/from16 v9, v38

    move/from16 v10, v39

    :goto_1
    invoke-static {v13}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v13

    move-object/from16 v35, v6

    move/from16 v36, v7

    move/from16 v37, v8

    move/from16 v38, v9

    move/from16 v39, v10

    move/from16 v70, v13

    goto/16 :goto_0

    :cond_1
    const-string v6, "\u06e7\u06e1\u06e3"

    move-object v8, v6

    :goto_2
    invoke-static {v8}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v70, v6

    goto/16 :goto_0

    :sswitch_2
    const/16 v8, 0x78

    invoke-static {}, Landroidx/fragment/app/۟ۧۡۦ;->ۧۤۨ۟()I

    move-result v6

    if-gtz v6, :cond_2

    const-string v9, "\u06e8\u06e3\u06e6"

    move/from16 v6, v51

    move/from16 v7, v52

    :goto_3
    invoke-static {v9}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v9

    move/from16 v51, v6

    move/from16 v52, v7

    move/from16 v53, v8

    move/from16 v70, v9

    goto/16 :goto_0

    :cond_2
    sget v6, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v7, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    xor-int/2addr v6, v7

    const v7, 0x1aadea

    add-int/2addr v6, v7

    move/from16 v53, v8

    move/from16 v70, v6

    goto/16 :goto_0

    :sswitch_3
    invoke-static {}, Lcom/google/android/material/carousel/۠ۨۡۢ;->ۦۧۢ۟()I

    move-result v6

    if-ltz v6, :cond_3

    const/16 v6, 0x60

    sput v6, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    const-string v6, "\u06df\u06e6\u06e8"

    invoke-static {v6}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v70, v6

    goto/16 :goto_0

    :cond_3
    sget v6, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v7, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    or-int/2addr v6, v7

    const v7, -0x1ac351

    xor-int/2addr v6, v7

    move/from16 v70, v6

    goto/16 :goto_0

    :sswitch_4
    invoke-virtual/range {v41 .. v41}, Landroid/view/View;->postInvalidateOnAnimation()V

    sget v6, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    if-gtz v6, :cond_4

    invoke-static {}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟ۤۦۡ()I

    const-string v7, "\u06e7\u06e4\u06e2"

    move/from16 v6, v40

    :goto_4
    invoke-static {v7}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v7

    move/from16 v70, v7

    move/from16 v40, v6

    goto/16 :goto_0

    :cond_4
    const-string v6, "\u06e2\u06e8\u06e1"

    :goto_5
    invoke-static {v6}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۣ۠ۧۢ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v70, v6

    goto/16 :goto_0

    :cond_5
    move-object/from16 v6, v22

    :goto_6
    sget v8, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v9, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    rem-int/lit16 v9, v9, 0x1fd9

    rem-int/2addr v8, v9

    if-eqz v8, :cond_6

    const/4 v8, 0x1

    sput v8, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    const-string v8, "\u06e2\u06e2\u06e8"

    invoke-static {v8}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v22, v6

    move-object/from16 v41, v7

    move/from16 v70, v8

    goto/16 :goto_0

    :cond_6
    const-string v8, "\u06e5\u06e3\u06e4"

    move-object/from16 v22, v6

    move-object/from16 v41, v7

    goto/16 :goto_2

    :sswitch_5
    sget v6, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    if-gtz v6, :cond_7

    invoke-static {}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۟ۦ۠ۡۢ()I

    const-string v6, "\u06e6\u06e4"

    :goto_7
    invoke-static {v6}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v70, v6

    goto/16 :goto_0

    :cond_7
    const-string v6, "\u06e8\u06e4\u06e1"

    invoke-static {v6}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v70, v6

    goto/16 :goto_0

    :sswitch_6
    move-object/from16 v0, v43

    iget v6, v0, Landroid/graphics/RectF;->left:F

    const/high16 v7, 0x41300000    # 11.0f

    sub-float/2addr v6, v7

    sub-float v6, v6, v24

    const/high16 v7, 0x41300000    # 11.0f

    add-float/2addr v6, v7

    move-object/from16 v0, v43

    iget v7, v0, Landroid/graphics/RectF;->right:F

    invoke-virtual/range {v22 .. v22}, Landroid/graphics/Matrix;->reset()V

    const/4 v8, 0x0

    const/high16 v9, 0x41880000    # 17.0f

    add-float/2addr v7, v9

    sub-float/2addr v7, v6

    const/high16 v9, 0x41880000    # 17.0f

    sub-float/2addr v7, v9

    mul-float v7, v7, v50

    sub-float v7, v8, v7

    sub-float/2addr v6, v7

    const/4 v7, 0x0

    move-object/from16 v0, v22

    invoke-virtual {v0, v6, v7}, Landroid/graphics/Matrix;->setTranslate(FF)V

    invoke-virtual/range {v21 .. v22}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    sget v6, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v7, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    add-int/2addr v6, v7

    const v7, 0x1aa5bc

    add-int/2addr v6, v7

    move/from16 v70, v6

    goto/16 :goto_0

    :sswitch_7
    const-string v6, "OYONzbc5oZnIL7rNirg7vX"

    invoke-static {v6}, Landroidx/fragment/app/۟ۧۡۦ;->ۣۣ۟ۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v6

    sget v7, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    if-ltz v7, :cond_8

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->۟۠ۡۢۦ()I

    const-string v7, "\u06e5\u06e4\u06e8"

    invoke-static {v7}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v57, v6

    move/from16 v70, v7

    goto/16 :goto_0

    :cond_8
    sget v7, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v8, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    div-int/2addr v7, v8

    const v8, 0x1ac52b

    add-int/2addr v7, v8

    move-object/from16 v57, v6

    move/from16 v70, v7

    goto/16 :goto_0

    :sswitch_8
    if-eqz v40, :cond_c

    const/16 v54, 0x5a

    const-string v6, "\u06e3\u06e2\u06e3"

    invoke-static {v6}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v70, v6

    goto/16 :goto_0

    :sswitch_9
    move-object/from16 v0, v43

    iget v8, v0, Landroid/graphics/RectF;->top:F

    move-object/from16 v0, v43

    iget v10, v0, Landroid/graphics/RectF;->bottom:F

    sget-object v13, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    new-instance v6, Landroid/graphics/LinearGradient;

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v13}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    move-object/from16 v0, p9

    invoke-virtual {v0, v6}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    sget-object v6, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    sget v7, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v8, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    mul-int/lit16 v8, v8, 0x12d1

    xor-int/2addr v7, v8

    if-ltz v7, :cond_9

    invoke-static {}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣ۟۠()I

    const-string v7, "\u06e1\u06e5\u06e8"

    invoke-static {v7}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v20, v13

    move-object/from16 v60, v6

    move/from16 v70, v7

    goto/16 :goto_0

    :cond_9
    sget v7, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v8, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    div-int/2addr v7, v8

    const v8, 0x1abe07

    add-int/2addr v7, v8

    move-object/from16 v20, v13

    move-object/from16 v60, v6

    move/from16 v70, v7

    goto/16 :goto_0

    :sswitch_a
    move-object/from16 v0, p9

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    move-object/from16 v0, p9

    move-object/from16 v1, v60

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/4 v6, 0x1

    move-object/from16 v0, p9

    invoke-virtual {v0, v6}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    if-eqz v40, :cond_b

    sget v6, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v7, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v8, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    div-int/2addr v7, v8

    const v8, 0x1ab2a4

    add-int/2addr v7, v8

    move/from16 v63, v6

    move/from16 v70, v7

    goto/16 :goto_0

    :sswitch_b
    new-instance v6, Landroid/graphics/RectF;

    const/high16 v7, 0x41700000    # 15.0f

    sub-float v7, v37, v7

    sub-float v7, v7, v67

    const/high16 v8, 0x41700000    # 15.0f

    add-float/2addr v7, v8

    mul-float v8, v68, v36

    const/high16 v9, 0x40e00000    # 7.0f

    sub-float/2addr v8, v9

    const/4 v9, 0x0

    sub-float v9, v9, v38

    sub-float v9, v39, v9

    add-float/2addr v8, v9

    const/high16 v9, 0x40e00000    # 7.0f

    add-float/2addr v8, v9

    move/from16 v0, v38

    move/from16 v1, v37

    invoke-direct {v6, v0, v7, v8, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    const v7, 0x3eb33333    # 0.35f

    mul-float v8, v67, v7

    move-object/from16 v0, p0

    iget v7, v0, Lnn;->c:I

    invoke-static {v7}, Landroid/graphics/Color;->red(I)I

    move-result v9

    int-to-double v0, v9

    move-wide/from16 v48, v0

    invoke-static {v7}, Landroid/graphics/Color;->green(I)I

    move-result v9

    int-to-double v0, v9

    move-wide/from16 v46, v0

    sget v9, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v10, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    div-int/lit16 v10, v10, -0xab1

    add-int/2addr v9, v10

    if-ltz v9, :cond_a

    const/16 v9, 0x59

    sput v9, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    const-string v9, "\u06e2\u06e8\u06e1"

    invoke-static {v9}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v43, v6

    move/from16 v44, v7

    move/from16 v45, v8

    move/from16 v70, v9

    goto/16 :goto_0

    :cond_a
    const-string v9, "\u06e2\u06e8\u06e7"

    :goto_8
    invoke-static {v9}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v43, v6

    move/from16 v44, v7

    move/from16 v45, v8

    move/from16 v70, v9

    goto/16 :goto_0

    :cond_b
    :sswitch_c
    sget v6, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v7, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    or-int/2addr v6, v7

    const v7, 0x1ac92a

    add-int/2addr v6, v7

    move/from16 v70, v6

    goto/16 :goto_0

    :sswitch_d
    const v6, 0x3f4ccccd    # 0.8f

    mul-float v24, v33, v6

    const-string v6, "AZI/12W6Rg==\n"

    const-string v7, "ItR5kSP8AN4=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    const/4 v7, 0x3

    new-array v0, v7, [I

    move-object/from16 v26, v0

    sget v7, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    xor-int/lit16 v7, v7, -0x31d

    aput v44, v26, v7

    sget v7, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    xor-int/lit16 v7, v7, 0x356

    aput v6, v26, v7

    sget v6, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v7, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    xor-int/2addr v6, v7

    const v7, 0x1acd02

    add-int/2addr v6, v7

    move/from16 v70, v6

    goto/16 :goto_0

    :cond_c
    :sswitch_e
    invoke-static {}, Landroidx/startup/ۣۤۦۥ;->۠ۨ۟()I

    move-result v6

    if-gtz v6, :cond_d

    const-string v6, "\u06e6\u06e8\u06e4"

    move-object v8, v6

    goto/16 :goto_2

    :cond_d
    sget v6, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v7, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    mul-int/2addr v6, v7

    const v7, 0x28bc8

    xor-int/2addr v6, v7

    move/from16 v70, v6

    goto/16 :goto_0

    :sswitch_f
    move-object/from16 v0, v59

    iget v7, v0, Landroid/graphics/Paint$FontMetrics;->descent:F

    move-object/from16 v0, v59

    iget v9, v0, Landroid/graphics/Paint$FontMetrics;->ascent:F

    sget v6, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    xor-int/lit16 v6, v6, -0x96

    int-to-float v8, v6

    move-object/from16 v0, p0

    iget v10, v0, Lnn;->h:F

    mul-float/2addr v10, v8

    const/4 v13, 0x0

    const/high16 v16, 0x41500000    # 13.0f

    add-float v7, v7, v16

    sub-float/2addr v7, v9

    const/high16 v9, 0x41500000    # 13.0f

    sub-float/2addr v7, v9

    sub-float v7, v13, v7

    sub-float v7, v10, v7

    sget v9, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    if-ltz v9, :cond_e

    invoke-static {}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۦ۟ۥۣ()I

    const-string v9, "\u06e4\u06e0\u06df"

    invoke-static {v9}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v9

    move/from16 v65, v6

    move/from16 v67, v7

    move/from16 v68, v8

    move/from16 v70, v9

    goto/16 :goto_0

    :cond_e
    sget v9, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v10, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    add-int/2addr v9, v10

    const v10, 0x1ac200

    add-int/2addr v9, v10

    move/from16 v65, v6

    move/from16 v67, v7

    move/from16 v68, v8

    move/from16 v70, v9

    goto/16 :goto_0

    :sswitch_10
    const/4 v6, 0x0

    const/4 v7, 0x0

    move/from16 v0, p7

    int-to-float v8, v0

    sub-float/2addr v7, v8

    move-object/from16 v0, v58

    iget v8, v0, Landroid/graphics/Paint$FontMetrics;->descent:F

    sub-float/2addr v7, v8

    sub-float/2addr v6, v7

    const/high16 v7, 0x41800000    # 16.0f

    add-float/2addr v6, v7

    const/high16 v7, 0x3f800000    # 1.0f

    sub-float/2addr v6, v7

    const/high16 v7, 0x41800000    # 16.0f

    sub-float v8, v6, v7

    const/4 v6, 0x0

    const/4 v7, 0x0

    sub-float v7, v7, p5

    move-object/from16 v0, p0

    iget v9, v0, Lnn;->i:F

    sub-float/2addr v7, v9

    sub-float v9, v6, v7

    move-object/from16 v0, p0

    iget-object v6, v0, Lnn;->a:Ljava/lang/String;

    move-object/from16 v0, p9

    invoke-virtual {v0, v6}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v10

    move-object/from16 v0, p0

    iget v7, v0, Lnn;->g:F

    invoke-static {}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟۟ۤۦۨ()I

    move-result v13

    if-gtz v13, :cond_f

    const/16 v13, 0x60

    sput v13, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    const-string v13, "\u06e2\u06e3\u06e8"

    invoke-static {v13}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v13

    move-object/from16 v35, v6

    move/from16 v36, v7

    move/from16 v37, v8

    move/from16 v38, v9

    move/from16 v39, v10

    move/from16 v70, v13

    goto/16 :goto_0

    :cond_f
    const-string v13, "\u06e1\u06e5\u06e8"

    goto/16 :goto_1

    :sswitch_11
    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->getShader()Landroid/graphics/Shader;

    move-result-object v6

    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v7

    const v8, 0x3f47ae14    # 0.78f

    mul-float v8, v8, v69

    move-object/from16 v0, p9

    invoke-virtual {v0, v8}, Landroid/graphics/Paint;->setTextSize(F)V

    const/4 v8, 0x1

    move-object/from16 v0, p9

    invoke-virtual {v0, v8}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v8

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۣ۟ۡۧ۠()I

    move-result v9

    if-ltz v9, :cond_10

    const-string v9, "\u06e2\u06e5\u06e7"

    invoke-static {v9}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v55, v6

    move-object/from16 v58, v7

    move-object/from16 v59, v8

    move/from16 v70, v9

    goto/16 :goto_0

    :cond_10
    sget v9, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v10, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    add-int/2addr v9, v10

    const v10, 0xdbc1

    add-int/2addr v9, v10

    move-object/from16 v55, v6

    move-object/from16 v58, v7

    move-object/from16 v59, v8

    move/from16 v70, v9

    goto/16 :goto_0

    :sswitch_12
    sget v6, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v7, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    or-int/lit16 v7, v7, -0xf40

    mul-int/2addr v6, v7

    if-gtz v6, :cond_11

    invoke-static {}, Landroidx/appcompat/app/ۥۦۣ۠;->ۨۤ۠ۨ()I

    const-string v6, "\u06e7\u06e3\u06e8"

    goto/16 :goto_5

    :cond_11
    sget v6, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v7, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    or-int/2addr v6, v7

    const v7, 0x1ab6e4

    add-int/2addr v6, v7

    move/from16 v70, v6

    goto/16 :goto_0

    :sswitch_13
    sget v6, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v7, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    add-int/2addr v6, v7

    const v7, 0x1aacde

    xor-int/2addr v6, v7

    move/from16 v70, v6

    goto/16 :goto_0

    :sswitch_14
    sget v6, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    xor-int/lit16 v6, v6, -0x16d

    aput v44, v26, v6

    new-instance v21, Landroid/graphics/LinearGradient;

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/4 v6, 0x3

    new-array v0, v6, [F

    move-object/from16 v27, v0

    fill-array-data v27, :array_1

    move-object/from16 v28, v20

    invoke-direct/range {v21 .. v28}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    move-object/from16 v0, p0

    iget-boolean v7, v0, Lnn;->d:Z

    move-object/from16 v0, p0

    iget-object v6, v0, Lnn;->j:Landroid/graphics/Matrix;

    if-eqz v7, :cond_25

    const-string v7, "\u06e6\u06e8\u06e8"

    invoke-static {v7}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v22, v6

    move/from16 v70, v7

    goto/16 :goto_0

    :sswitch_15
    move-object/from16 v0, p9

    move-object/from16 v1, v60

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    move-object/from16 v0, p1

    move-object/from16 v1, v43

    move/from16 v2, v45

    move/from16 v3, v45

    move-object/from16 v4, p9

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->clearShadowLayer()V

    move-object/from16 v0, v43

    iget v14, v0, Landroid/graphics/RectF;->left:F

    move-object/from16 v0, v43

    iget v15, v0, Landroid/graphics/RectF;->top:F

    sget v6, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v7, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    add-int/lit16 v7, v7, 0x1ff8

    add-int/2addr v6, v7

    if-gtz v6, :cond_12

    invoke-static {}, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۢۧ()I

    const-string v6, "\u06e2\u06e7\u06e1"

    invoke-static {v6}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v6

    move/from16 v70, v6

    goto/16 :goto_0

    :cond_12
    sget v6, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v7, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    rem-int/2addr v6, v7

    const v7, 0x1ab355

    xor-int/2addr v6, v7

    move/from16 v70, v6

    goto/16 :goto_0

    :sswitch_16
    move-object/from16 v0, p9

    move-object/from16 v1, v61

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    move-object/from16 v0, p9

    move/from16 v1, v69

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    move-object/from16 v0, p9

    move/from16 v1, v66

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    const/4 v6, 0x0

    move-object/from16 v0, p9

    invoke-virtual {v0, v6}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۣ۟ۡۧ۠()I

    move-result v6

    if-ltz v6, :cond_16

    sget v6, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v7, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    add-int/lit16 v7, v7, 0x203a

    div-int/2addr v6, v7

    if-eqz v6, :cond_14

    :cond_13
    const-string v6, "\u06e1\u06e1\u06e4"

    invoke-static {v6}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v70, v6

    goto/16 :goto_0

    :cond_14
    const-string v6, "\u06e2\u06e5\u06e7"

    move-object v8, v6

    goto/16 :goto_2

    :sswitch_17
    move-object/from16 v0, v43

    iget v0, v0, Landroid/graphics/RectF;->top:F

    move/from16 v29, v0

    move-object/from16 v0, v43

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    move/from16 v31, v0

    sget v6, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v7, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    xor-int/lit16 v7, v7, 0x3d5

    xor-int/lit16 v6, v6, -0x3bf

    invoke-static {v6, v7, v7, v7}, Landroid/graphics/Color;->argb(IIII)I

    move-result v6

    sget v7, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v8, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    add-int/2addr v7, v8

    const v8, 0x1abcb1

    add-int/2addr v7, v8

    move/from16 v62, v6

    move/from16 v70, v7

    goto/16 :goto_0

    :sswitch_18
    invoke-virtual/range {v22 .. v22}, Landroid/graphics/Matrix;->reset()V

    move-object/from16 v0, v43

    iget v6, v0, Landroid/graphics/RectF;->left:F

    const/4 v7, 0x0

    const v8, 0x3e99999a    # 0.3f

    mul-float v8, v8, v33

    sub-float/2addr v7, v8

    sub-float/2addr v6, v7

    const/4 v7, 0x0

    move-object/from16 v0, v22

    invoke-virtual {v0, v6, v7}, Landroid/graphics/Matrix;->setTranslate(FF)V

    invoke-static {}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۥۧۧ()I

    move-result v6

    if-gtz v6, :cond_15

    const-string v6, "\u06e6\u06e1"

    invoke-static {v6}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v70, v6

    goto/16 :goto_0

    :cond_15
    sget v6, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v7, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    mul-int/2addr v6, v7

    const v7, 0x16fc76

    add-int/2addr v6, v7

    move/from16 v70, v6

    goto/16 :goto_0

    :cond_16
    :sswitch_19
    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۣۡ۠ۡ()I

    move-result v6

    if-gtz v6, :cond_17

    invoke-static {}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۡۦۣۨ()I

    const-string v9, "\u06e8\u06e5\u06e3"

    move-object/from16 v6, v43

    move/from16 v7, v44

    move/from16 v8, v45

    goto/16 :goto_8

    :cond_17
    const-string v6, "\u06e6\u06e7\u06e7"

    goto/16 :goto_7

    :cond_18
    :sswitch_1a
    const-string v6, "\u06e1\u06e3\u06e6"

    goto/16 :goto_5

    :sswitch_1b
    const/high16 v6, 0x3f800000    # 1.0f

    aget v7, v56, v65

    const/high16 v8, 0x42000000    # 32.0f

    sub-float/2addr v7, v8

    const v8, 0x3df5c28f    # 0.12f

    add-float/2addr v7, v8

    const/high16 v8, 0x42000000    # 32.0f

    add-float/2addr v7, v8

    invoke-static {v6, v7}, Ljava/lang/Math;->min(FF)F

    move-result v6

    aput v6, v56, v65

    invoke-static/range {v56 .. v56}, Landroid/graphics/Color;->HSVToColor([F)I

    move-result v11

    move/from16 v0, v64

    move-object/from16 v1, v56

    invoke-static {v0, v1}, Landroid/graphics/Color;->colorToHSV(I[F)V

    const/4 v6, 0x0

    aget v7, v56, v65

    const/high16 v8, 0x40800000    # 4.0f

    add-float/2addr v7, v8

    const v8, 0x3da3d70a    # 0.08f

    sub-float/2addr v7, v8

    const/high16 v8, 0x40800000    # 4.0f

    sub-float/2addr v7, v8

    invoke-static {v6, v7}, Ljava/lang/Math;->max(FF)F

    move-result v6

    aput v6, v56, v65

    invoke-static/range {v56 .. v56}, Landroid/graphics/Color;->HSVToColor([F)I

    move-result v12

    invoke-static {}, Lkotlinx/coroutines/ۦۡۧۧ;->۟ۤۧۨۦ()I

    move-result v6

    if-ltz v6, :cond_19

    const/16 v6, 0x3f

    sput v6, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    const-string v6, "\u06e5\u06e3\u06e5"

    invoke-static {v6}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v70, v6

    goto/16 :goto_0

    :cond_19
    sget v6, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v7, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sub-int/2addr v6, v7

    const v7, -0x1aafa4

    xor-int/2addr v6, v7

    move/from16 v70, v6

    goto/16 :goto_0

    :sswitch_1c
    move-object/from16 v0, p0

    iget v7, v0, Lnn;->b:I

    const/high16 v6, 0x41600000    # 14.0f

    const/4 v8, 0x0

    const/high16 v9, 0x40800000    # 4.0f

    invoke-static {v7}, Landroid/graphics/Color;->red(I)I

    move-result v10

    invoke-static {v7}, Landroid/graphics/Color;->green(I)I

    move-result v13

    invoke-static {v7}, Landroid/graphics/Color;->blue(I)I

    move-result v16

    move/from16 v0, v54

    move/from16 v1, v16

    invoke-static {v0, v10, v13, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v10

    move-object/from16 v0, p9

    invoke-virtual {v0, v6, v8, v9, v10}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    const/4 v6, 0x3

    new-array v6, v6, [F

    invoke-static {v7, v6}, Landroid/graphics/Color;->colorToHSV(I[F)V

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x1

    aget v10, v6, v10

    const/high16 v13, 0x41800000    # 16.0f

    sub-float/2addr v10, v13

    const v13, 0x3d4ccccd    # 0.05f

    sub-float/2addr v10, v13

    const/high16 v13, 0x41800000    # 16.0f

    add-float/2addr v10, v13

    invoke-static {v9, v10}, Ljava/lang/Math;->max(FF)F

    move-result v9

    aput v9, v6, v8

    invoke-static {}, Lio/fastkv/ۦۣ۠ۨ;->۠ۡۨۧ()I

    move-result v8

    if-ltz v8, :cond_1a

    const-string v8, "\u06df\u06e1"

    invoke-static {v8}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v56, v6

    move/from16 v64, v7

    move/from16 v70, v8

    goto/16 :goto_0

    :cond_1a
    const-string v8, "\u06e3\u06e1\u06e0"

    invoke-static {v8}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v56, v6

    move/from16 v64, v7

    move/from16 v70, v8

    goto/16 :goto_0

    :sswitch_1d
    sget-object v6, Ljava/lang/System;->out:Ljava/io/PrintStream;

    move-object/from16 v0, v57

    invoke-virtual {v6, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v6, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v7, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    rem-int/lit16 v7, v7, 0xa2f

    div-int/2addr v6, v7

    if-gtz v6, :cond_1b

    const-string v6, "\u06e3\u06e5\u06e1"

    invoke-static {v6}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v70, v6

    goto/16 :goto_0

    :cond_1b
    sget v6, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v7, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    div-int/2addr v6, v7

    const v7, -0x1ac247

    xor-int/2addr v6, v7

    move/from16 v70, v6

    goto/16 :goto_0

    :sswitch_1e
    const/high16 v6, 0x3fc00000    # 1.5f

    const/4 v7, 0x0

    const/high16 v8, 0x3fc00000    # 1.5f

    sget v9, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    xor-int/lit16 v9, v9, -0x200

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    move/from16 v0, v16

    invoke-static {v9, v10, v13, v0}, Landroid/graphics/Color;->argb(IIII)I

    move-result v9

    move-object/from16 v0, p9

    invoke-virtual {v0, v6, v7, v8, v9}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    sget v6, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    if-ltz v6, :cond_1c

    const/16 v6, 0x60

    sput v6, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    const-string v6, "\u06e1\u06e8\u06e4"

    invoke-static {v6}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v70, v6

    goto/16 :goto_0

    :cond_1c
    const-string v6, "\u06e8\u06e4\u06e1"

    invoke-static {v6}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v70, v6

    goto/16 :goto_0

    :sswitch_1f
    invoke-static/range {v44 .. v44}, Landroid/graphics/Color;->blue(I)I

    move-result v6

    int-to-double v6, v6

    const-wide v8, 0x3fbd2f1a9fbe76c9L    # 0.114

    mul-double/2addr v6, v8

    const-wide/high16 v8, 0x4010000000000000L    # 4.0

    sub-double/2addr v6, v8

    const-wide v8, 0x3fd322d0e5604189L    # 0.299

    mul-double v8, v8, v48

    const-wide/16 v70, 0x0

    const-wide v72, 0x3fe2c8b439581062L    # 0.587

    mul-double v72, v72, v46

    sub-double v70, v70, v72

    sub-double v8, v8, v70

    add-double/2addr v6, v8

    const-wide/high16 v8, 0x4010000000000000L    # 4.0

    add-double/2addr v6, v8

    const-wide/high16 v8, 0x4060000000000000L    # 128.0

    cmpg-double v6, v6, v8

    if-gez v6, :cond_18

    const/4 v6, 0x1

    invoke-static {}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۢۡۤ()I

    move-result v7

    if-ltz v7, :cond_1d

    const/16 v7, 0x5a

    sput v7, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    const-string v8, "\u06e6\u06e2\u06e0"

    move/from16 v7, v54

    :goto_9
    invoke-static {v8}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۣ۠ۧۢ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v70, v8

    move/from16 v40, v6

    move/from16 v54, v7

    goto/16 :goto_0

    :cond_1d
    const-string v7, "\u06e7\u06e4\u06e2"

    goto/16 :goto_4

    :sswitch_20
    sget v6, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v7, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    add-int/lit16 v7, v7, -0x702

    rem-int/2addr v6, v7

    if-ltz v6, :cond_1e

    const-string v6, "\u06e5\u06e0\u06e6"

    invoke-static {v6}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v70, v6

    goto/16 :goto_0

    :cond_1e
    sget v6, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v7, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    div-int/2addr v6, v7

    const v7, 0x1abe67

    xor-int/2addr v6, v7

    move/from16 v70, v6

    goto/16 :goto_0

    :sswitch_21
    sget v6, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    xor-int/lit8 v6, v6, 0x6f

    const/high16 v7, 0x3f800000    # 1.0f

    const/4 v8, 0x0

    const/high16 v9, 0x3f800000    # 1.0f

    move/from16 v0, v63

    xor-int/lit16 v10, v0, -0x309

    invoke-static {v10, v6, v6, v6}, Landroid/graphics/Color;->argb(IIII)I

    move-result v6

    move-object/from16 v0, p9

    invoke-virtual {v0, v7, v8, v9, v6}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    sget v6, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v7, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sub-int/2addr v6, v7

    const v7, -0x1ac13f

    xor-int/2addr v6, v7

    move/from16 v70, v6

    goto/16 :goto_0

    :sswitch_22
    const/4 v6, 0x0

    sget v7, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v8, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    xor-int/lit16 v8, v8, 0x1741

    rem-int/2addr v7, v8

    if-gtz v7, :cond_0

    const/16 v7, 0xf

    sput v7, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    const-string v7, "\u06e4\u06e6\u06e6"

    invoke-static {v7}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v7

    move/from16 v42, v6

    move/from16 v70, v7

    goto/16 :goto_0

    :sswitch_23
    const-string v6, "\u06e8\u06df\u06df"

    invoke-static {v6}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v70, v6

    goto/16 :goto_0

    :sswitch_24
    invoke-virtual/range {v21 .. v22}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    invoke-static {}, Landroidx/startup/ۣۤۦۥ;->۠ۨ۟()I

    move-result v6

    if-gtz v6, :cond_1f

    const-string v6, "\u06e0\u06e0\u06e0"

    invoke-static {v6}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v70, v6

    goto/16 :goto_0

    :cond_1f
    move/from16 v6, v50

    :goto_a
    const-string v7, "\u06e5\u06e6\u06e8"

    invoke-static {v7}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    move/from16 v50, v6

    move/from16 v70, v7

    goto/16 :goto_0

    :sswitch_25
    sget v6, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v7, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    div-int/2addr v6, v7

    const v7, -0x1abded

    xor-int/2addr v6, v7

    move/from16 v70, v6

    goto/16 :goto_0

    :sswitch_26
    sget v6, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v7, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    rem-int/2addr v6, v7

    const v7, 0x1aa74b

    add-int/2addr v6, v7

    move/from16 v70, v6

    goto/16 :goto_0

    :sswitch_27
    const-string v6, "0U9ng4vH\n"

    const-string v7, "si4J9eq0sVE=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v0, p1

    invoke-static {v6, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v6, "Z64qtNM=\n"

    const-string v7, "F89D2qdWHV4=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v0, p9

    invoke-static {v6, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->getTextSize()F

    move-result v8

    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->getColor()I

    move-result v7

    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->getStyle()Landroid/graphics/Paint$Style;

    move-result-object v6

    sget v9, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v10, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    add-int/lit16 v10, v10, 0x1799

    or-int/2addr v9, v10

    if-ltz v9, :cond_20

    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۢۨۨۤ()I

    const-string v9, "\u06e5\u06e0\u06e4"

    invoke-static {v9}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v61, v6

    move/from16 v66, v7

    move/from16 v69, v8

    move/from16 v70, v9

    goto/16 :goto_0

    :cond_20
    sget v9, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v10, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    div-int/2addr v9, v10

    const v10, 0x1aa707

    xor-int/2addr v9, v10

    move-object/from16 v61, v6

    move/from16 v66, v7

    move/from16 v69, v8

    move/from16 v70, v9

    goto/16 :goto_0

    :sswitch_28
    sget v6, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    xor-int/lit8 v6, v6, 0x10

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static {v6, v7, v8, v9}, Landroid/graphics/Color;->argb(IIII)I

    move-result v6

    const/4 v7, 0x3

    new-array v0, v7, [I

    move-object/from16 v32, v0

    sget v7, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    xor-int/lit16 v7, v7, -0x2cc

    aput v62, v32, v7

    sget v7, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    xor-int/lit8 v7, v7, -0x6c

    const/4 v8, 0x0

    aput v8, v32, v7

    sget v7, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    xor-int/lit16 v7, v7, -0x2b7

    aput v6, v32, v7

    sget v6, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v7, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    add-int/lit16 v7, v7, 0x21f8

    div-int/2addr v6, v7

    if-eqz v6, :cond_21

    const-string v6, "\u06e6\u06e8\u06e8"

    :goto_b
    invoke-static {v6}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v70, v6

    goto/16 :goto_0

    :cond_21
    const-string v6, "\u06e0\u06e0\u06e0"

    goto :goto_b

    :sswitch_29
    move-object/from16 v0, p0

    iget-object v7, v0, Lnn;->e:Landroid/widget/TextView;

    if-eqz v7, :cond_5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    const-wide/16 v70, -0xaa7

    sget v6, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    int-to-long v0, v6

    move-wide/from16 v72, v0

    xor-long v70, v70, v72

    rem-long v8, v8, v70

    long-to-float v6, v8

    move-wide/from16 v0, v70

    long-to-float v8, v0

    div-float/2addr v6, v8

    invoke-static {}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟۟ۤۦۨ()I

    move-result v8

    if-gtz v8, :cond_22

    const/16 v8, 0x63

    sput v8, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    move-object/from16 v41, v7

    goto/16 :goto_a

    :cond_22
    sget v8, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v9, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    add-int/2addr v8, v9

    const v9, 0x1aad68

    xor-int/2addr v8, v9

    move-object/from16 v41, v7

    move/from16 v50, v6

    move/from16 v70, v8

    goto/16 :goto_0

    :sswitch_2a
    sget v6, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v7, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sub-int/2addr v6, v7

    const v7, 0x1ab715

    add-int/2addr v6, v7

    move/from16 v70, v6

    move/from16 v40, v42

    goto/16 :goto_0

    :sswitch_2b
    move-object/from16 v0, v43

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    move/from16 v17, v0

    sget v6, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    xor-int/lit16 v6, v6, 0x3a8

    sget v7, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    xor-int/lit8 v7, v7, -0x31

    invoke-static {v7, v6, v6, v6}, Landroid/graphics/Color;->argb(IIII)I

    move-result v7

    sget v8, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    xor-int/lit16 v8, v8, -0x353

    invoke-static {v8, v6, v6, v6}, Landroid/graphics/Color;->argb(IIII)I

    move-result v6

    const/4 v8, 0x3

    new-array v0, v8, [I

    move-object/from16 v18, v0

    sget v8, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v9, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    div-int/lit16 v9, v9, 0xd6a

    xor-int/2addr v8, v9

    if-gtz v8, :cond_23

    invoke-static {}, L۠ۡۢۨ;->ۥۡ۠ۨ()I

    const-string v8, "\u06e0\u06e1\u06e7"

    invoke-static {v8}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v51, v6

    move/from16 v52, v7

    move/from16 v70, v8

    goto/16 :goto_0

    :cond_23
    const-string v9, "\u06df\u06e1"

    move/from16 v8, v53

    goto/16 :goto_3

    :sswitch_2c
    sget v6, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v7, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    rem-int/lit8 v7, v7, 0x52

    div-int/2addr v6, v7

    if-gtz v6, :cond_24

    const-string v6, "\u06e4\u06e0"

    invoke-static {v6}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v70, v6

    move/from16 v54, v53

    goto/16 :goto_0

    :cond_24
    const-string v8, "\u06e6\u06e7\u06e1"

    move/from16 v6, v40

    move/from16 v7, v53

    goto/16 :goto_9

    :sswitch_2d
    new-instance v27, Landroid/graphics/LinearGradient;

    const/16 v28, 0x0

    const/16 v30, 0x0

    const/4 v6, 0x3

    new-array v0, v6, [F

    move-object/from16 v33, v0

    fill-array-data v33, :array_2

    move-object/from16 v34, v20

    invoke-direct/range {v27 .. v34}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    move-object/from16 v0, p9

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    sget-object v6, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    move-object/from16 v0, p9

    invoke-virtual {v0, v6}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const v6, 0x3f99999a    # 1.2f

    move-object/from16 v0, p9

    invoke-virtual {v0, v6}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    new-instance v6, Landroid/graphics/RectF;

    const v7, 0x3f19999a    # 0.6f

    const/4 v8, 0x0

    move-object/from16 v0, v43

    iget v9, v0, Landroid/graphics/RectF;->left:F

    sub-float/2addr v8, v9

    sub-float/2addr v7, v8

    move-object/from16 v0, v43

    iget v8, v0, Landroid/graphics/RectF;->top:F

    const/4 v9, 0x0

    sub-float/2addr v8, v9

    const v9, 0x3f19999a    # 0.6f

    add-float/2addr v8, v9

    const/4 v9, 0x0

    add-float/2addr v8, v9

    move-object/from16 v0, v43

    iget v9, v0, Landroid/graphics/RectF;->right:F

    const/high16 v10, 0x41100000    # 9.0f

    add-float/2addr v9, v10

    const v10, 0x3f19999a    # 0.6f

    sub-float/2addr v9, v10

    const/high16 v10, 0x41100000    # 9.0f

    sub-float/2addr v9, v10

    move-object/from16 v0, v43

    iget v10, v0, Landroid/graphics/RectF;->bottom:F

    const/high16 v13, 0x40e00000    # 7.0f

    add-float/2addr v10, v13

    const v13, 0x3f19999a    # 0.6f

    sub-float/2addr v10, v13

    const/high16 v13, 0x40e00000    # 7.0f

    sub-float/2addr v10, v13

    invoke-direct {v6, v7, v8, v9, v10}, Landroid/graphics/RectF;-><init>(FFFF)V

    move-object/from16 v0, p1

    move/from16 v1, v45

    move/from16 v2, v45

    move-object/from16 v3, p9

    invoke-virtual {v0, v6, v1, v2, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    move-object/from16 v0, p9

    move-object/from16 v1, v35

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v6

    sget v7, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v8, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    mul-int/2addr v7, v8

    const v8, 0x15b7ed

    add-int/2addr v7, v8

    move/from16 v33, v6

    move/from16 v70, v7

    goto/16 :goto_0

    :sswitch_2e
    const-string v6, "\u06e2\u06e3\u06e8"

    goto/16 :goto_5

    :sswitch_2f
    return-void

    :cond_25
    move-object/from16 v7, v41

    goto/16 :goto_6

    :sswitch_30
    move-object/from16 v6, v22

    move-object/from16 v7, v41

    goto/16 :goto_6

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe2 -> :sswitch_0
        0xdc7c -> :sswitch_f
        0xdcbb -> :sswitch_2
        0x1aa707 -> :sswitch_11
        0x1aa720 -> :sswitch_24
        0x1aa742 -> :sswitch_2a
        0x1aa75d -> :sswitch_4
        0x1aa784 -> :sswitch_2e
        0x1aaae0 -> :sswitch_2d
        0x1aab06 -> :sswitch_e
        0x1aae85 -> :sswitch_6
        0x1aaec4 -> :sswitch_17
        0x1aaf00 -> :sswitch_9
        0x1aaf04 -> :sswitch_22
        0x1aaf44 -> :sswitch_b
        0x1aaf80 -> :sswitch_2e
        0x1aaf9d -> :sswitch_20
        0x1aaf9f -> :sswitch_2c
        0x1ab2a5 -> :sswitch_21
        0x1ab2c7 -> :sswitch_8
        0x1ab2e3 -> :sswitch_2b
        0x1ab303 -> :sswitch_c
        0x1ab304 -> :sswitch_7
        0x1ab33c -> :sswitch_12
        0x1ab35b -> :sswitch_13
        0x1ab361 -> :sswitch_1f
        0x1ab642 -> :sswitch_1b
        0x1ab664 -> :sswitch_23
        0x1ab6bf -> :sswitch_28
        0x1ab9e3 -> :sswitch_27
        0x1aba04 -> :sswitch_3
        0x1aba08 -> :sswitch_d
        0x1abaa4 -> :sswitch_1a
        0x1abda9 -> :sswitch_30
        0x1abdea -> :sswitch_5
        0x1abe06 -> :sswitch_18
        0x1abe07 -> :sswitch_15
        0x1abe29 -> :sswitch_5
        0x1abe67 -> :sswitch_a
        0x1ac1a4 -> :sswitch_20
        0x1ac1c4 -> :sswitch_10
        0x1ac222 -> :sswitch_25
        0x1ac240 -> :sswitch_1c
        0x1ac246 -> :sswitch_2f
        0x1ac266 -> :sswitch_29
        0x1ac52a -> :sswitch_1d
        0x1ac549 -> :sswitch_16
        0x1ac5a3 -> :sswitch_19
        0x1ac5a5 -> :sswitch_26
        0x1ac625 -> :sswitch_1e
        0x1ac8c8 -> :sswitch_3
        0x1ac94b -> :sswitch_14
        0x1ac965 -> :sswitch_1
    .end sparse-switch

    :array_0
    .array-data 4
        0x0
        0x3f000000    # 0.5f
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
        0x3ecccccd    # 0.4f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final getSize(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I
    .locals 7

    const/high16 v6, 0x42000000    # 32.0f

    const/4 v3, 0x0

    const-string v0, "\u06e2\u06e6\u06e0"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v1

    move v2, v3

    move v4, v3

    move v0, v3

    move v5, v1

    :goto_0
    sparse-switch v5, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const v1, 0x3f47ae14    # 0.78f

    mul-float/2addr v1, v4

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    sget v1, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v5, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    add-int/lit16 v5, v5, -0x276

    mul-int/2addr v1, v5

    if-gtz v1, :cond_0

    invoke-static {}, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۢۧ()I

    const-string v1, "\u06e2\u06e0\u06e2"

    invoke-static {v1}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v1

    move v5, v1

    goto :goto_0

    :cond_0
    const-string v1, "\u06e2\u06e0\u06e2"

    :goto_1
    invoke-static {v1}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v1

    move v5, v1

    goto :goto_0

    :sswitch_1
    invoke-virtual {p1}, Landroid/graphics/Paint;->getTextSize()F

    move-result v1

    sget v4, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v5, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    or-int/2addr v4, v5

    const v5, 0xdd89

    add-int/2addr v5, v4

    move v4, v1

    goto :goto_0

    :sswitch_2
    invoke-virtual {p1, v4}, Landroid/graphics/Paint;->setTextSize(F)V

    const-string v1, "\u06e7\u06e6"

    :goto_2
    invoke-static {v1}, Landroidx/appcompat/widget/۟ۢۨۦ;->۠ۢۤۥ(Ljava/lang/Object;)I

    move-result v1

    move v5, v1

    goto :goto_0

    :sswitch_3
    const-string v1, "Yr8j1yw=\n"

    const-string v5, "Et5KuVj1JHA=\n"

    invoke-static {v1, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    sget v1, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v5, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    add-int/lit16 v5, v5, 0xca7

    rem-int/2addr v1, v5

    if-ltz v1, :cond_1

    const/16 v1, 0x42

    sput v1, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    const-string v1, "\u06e2\u06e6\u06e0"

    goto :goto_1

    :cond_1
    sget v1, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v5, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    mul-int/2addr v1, v5

    const v5, 0x1aa96f

    add-int/2addr v1, v5

    move v5, v1

    goto :goto_0

    :sswitch_4
    iget v0, p0, Lnn;->f:F

    float-to-int v0, v0

    return v0

    :sswitch_5
    sget v0, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    xor-int/lit16 v0, v0, -0x361

    int-to-float v0, v0

    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۢۨۨۤ()I

    move-result v1

    if-ltz v1, :cond_2

    const/16 v1, 0x14

    sput v1, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    const-string v1, "\u06e7\u06e6"

    invoke-static {v1}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v1

    move v5, v1

    goto/16 :goto_0

    :cond_2
    const-string v1, "\u06df\u06df\u06e8"

    goto :goto_1

    :sswitch_6
    iget-object v1, p0, Lnn;->a:Ljava/lang/String;

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v1

    sget v2, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v5, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    rem-int/2addr v2, v5

    const v5, -0x1abdc0

    xor-int/2addr v5, v2

    move v2, v1

    goto/16 :goto_0

    :sswitch_7
    sget v1, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    if-ltz v1, :cond_3

    const/16 v1, 0x4f

    sput v1, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    const-string v1, "\u06e8\u06e7"

    invoke-static {v1}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v1

    move v5, v1

    goto/16 :goto_0

    :cond_3
    sget v1, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v5, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    div-int/2addr v1, v5

    const v5, 0x1ab31b

    add-int/2addr v1, v5

    move v5, v1

    goto/16 :goto_0

    :sswitch_8
    iget v1, p0, Lnn;->g:F

    mul-float/2addr v1, v0

    sub-float/2addr v1, v6

    add-float/2addr v1, v2

    add-float/2addr v1, v6

    iget v5, p0, Lnn;->i:F

    sub-float v5, v3, v5

    sub-float/2addr v1, v5

    iput v1, p0, Lnn;->f:F

    sget v1, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v5, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    rem-int/lit16 v5, v5, -0x4a9

    mul-int/2addr v1, v5

    if-ltz v1, :cond_4

    const-string v1, "\u06df\u06df\u06e8"

    goto/16 :goto_2

    :cond_4
    const-string v1, "\u06df\u06e0\u06e1"

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        0xdcbe -> :sswitch_0
        0xdcdf -> :sswitch_4
        0x1aa708 -> :sswitch_8
        0x1aa720 -> :sswitch_2
        0x1ab264 -> :sswitch_6
        0x1ab31c -> :sswitch_3
        0x1ababd -> :sswitch_1
        0x1abd85 -> :sswitch_5
        0x1ac189 -> :sswitch_7
    .end sparse-switch
.end method
