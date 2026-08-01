.class public final Lbo;
.super Ljava/lang/Object;


# static fields
.field public static a:Landroid/graphics/Typeface;

.field public static final b:Landroid/graphics/Typeface;

.field public static final c:Lwn;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x0

    const-string v1, "\u06e7\u06e0\u06e8"

    invoke-static {v1}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    sput-object v0, Lbo;->b:Landroid/graphics/Typeface;

    sget v1, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v2, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    add-int/lit16 v2, v2, 0x24ac

    rem-int/2addr v1, v2

    if-gtz v1, :cond_1

    :cond_0
    const-string v1, "\u06e4\u06e2\u06e0"

    invoke-static {v1}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    sget v1, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v2, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    add-int/2addr v1, v2

    const v2, 0x1aad69

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_2
    const-string v1, "6M0pUyTcowWlkWU=\n"

    const-string v2, "i79MMlC5iys=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    sget v1, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    if-gtz v1, :cond_0

    invoke-static {}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣۢ۠۠()I

    const-string v1, "\u06e2\u06e1\u06e2"

    invoke-static {v1}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_3
    const-string v0, "m995IF2f9eaB2Do+FYj54YU=\n"

    const-string v1, "6L4XU3DskJQ=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v0

    sget v1, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v2, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    add-int/2addr v1, v2

    const v2, 0x1aad86

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_4
    sget v1, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v2, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    add-int/2addr v1, v2

    const v2, 0x1ac6f4

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_5
    new-instance v1, Lwn;

    invoke-direct {v1}, Lwn;-><init>()V

    sput-object v1, Lbo;->c:Lwn;

    invoke-static {}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۠۟ۥۧ()I

    move-result v1

    if-ltz v1, :cond_2

    invoke-static {}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟ۧ۟ۥۧ()I

    :cond_2
    const-string v1, "\u06e0\u06df"

    invoke-static {v1}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbff -> :sswitch_0
        0x1aae86 -> :sswitch_5
        0x1ab283 -> :sswitch_2
        0x1aba22 -> :sswitch_1
        0x1ac52f -> :sswitch_3
        0x1ac5a4 -> :sswitch_4
    .end sparse-switch
.end method

.method public static a(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/lang/String;Lsn;Lum;)V
    .locals 28

    const/4 v8, 0x0

    const/4 v6, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v26, 0x0

    const/4 v4, 0x0

    const/16 v19, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v5, 0x0

    const/4 v11, 0x0

    const/16 v18, 0x0

    const/4 v10, 0x0

    const/16 v16, 0x0

    const/4 v13, 0x0

    const/4 v3, 0x0

    const/4 v15, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    const/4 v7, 0x0

    const-string v22, "\u06e7\u06e5\u06e8"

    invoke-static/range {v22 .. v22}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v27

    move-object/from16 v22, v5

    move-object/from16 v23, v7

    move/from16 v24, v20

    move/from16 v25, v21

    :goto_0
    sparse-switch v27, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    move-object/from16 v0, p3

    iget-boolean v8, v0, Lsn;->p:Z

    const-string v5, "xbQyS83p5w==\n"

    const-string v6, "p8FbJ6mMlT8=\n"

    invoke-static {v5, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    new-instance v5, Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-direct {v5, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    sget v6, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v7, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    or-int/lit16 v7, v7, -0x1feb

    add-int/2addr v6, v7

    if-ltz v6, :cond_12

    invoke-static {}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->۟ۦۥۨ۠()I

    const-string v6, "\u06e8\u06df\u06e2"

    invoke-static {v6}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v7

    move-object v6, v5

    move/from16 v27, v7

    goto :goto_0

    :sswitch_1
    const-string v5, "\u06e1\u06df\u06e5"

    move-object v7, v13

    :goto_1
    invoke-static {v5}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v5

    move-object v14, v7

    move/from16 v27, v5

    goto :goto_0

    :cond_0
    :sswitch_2
    sget v5, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    if-gtz v5, :cond_1

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۦۢۢۢ()I

    const-string v5, "\u06e5\u06e2"

    :goto_2
    invoke-static {v5}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v27, v5

    goto :goto_0

    :cond_1
    sget v5, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v7, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    add-int/2addr v5, v7

    const v7, 0x1abdec

    add-int/2addr v5, v7

    move/from16 v27, v5

    goto :goto_0

    :sswitch_3
    const-string v10, "UnC97rRmAw==\n"

    const-string v5, "cUCN3oRWMwk=\n"

    sget v7, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v12, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    add-int/lit16 v12, v12, -0xa7c

    div-int/2addr v7, v12

    if-eqz v7, :cond_10

    const/16 v7, 0x44

    sput v7, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    const-string v7, "\u06e4\u06e3\u06df"

    invoke-static {v7}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v7

    move-object v12, v5

    move/from16 v27, v7

    goto :goto_0

    :sswitch_4
    sget v5, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v7, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    mul-int/2addr v5, v7

    const v7, 0x1d38ac

    add-int/2addr v5, v7

    move/from16 v27, v5

    goto :goto_0

    :sswitch_5
    invoke-static/range {v26 .. v26}, Lmp;->q(I)I

    move-result v5

    sget v7, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    xor-int/lit16 v7, v7, 0x38c

    invoke-static {v7}, Lmp;->q(I)I

    move-result v7

    move/from16 v0, v24

    move/from16 v1, v25

    invoke-virtual {v6, v0, v1, v5, v7}, Landroid/widget/TextView;->setPadding(IIII)V

    sget-object v5, Lbo;->b:Landroid/graphics/Typeface;

    invoke-virtual {v6, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    const v5, 0x3cf5c28f    # 0.03f

    invoke-virtual {v6, v5}, Landroid/widget/TextView;->setLetterSpacing(F)V

    sget v5, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v7, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    or-int/2addr v5, v7

    const v7, 0x1abe32

    add-int/2addr v5, v7

    move/from16 v27, v5

    goto/16 :goto_0

    :sswitch_6
    invoke-static/range {v22 .. v22}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    invoke-static {v4, v5}, Lc0;->r(Landroid/widget/LinearLayout;I)V

    if-eqz v8, :cond_0

    const-string v16, "FqMjpOk5jQ==\n"

    :goto_3
    const-string v5, "\u06df\u06e4\u06e7"

    invoke-static {v5}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v27, v5

    goto/16 :goto_0

    :sswitch_7
    sget v5, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v7, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    mul-int/lit16 v7, v7, -0xade

    mul-int/2addr v5, v7

    if-gtz v5, :cond_2

    const/16 v5, 0x19

    sput v5, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    const-string v7, "\u06e7\u06e1\u06e6"

    move-object v5, v6

    :goto_4
    invoke-static {v7}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v7

    move-object v6, v5

    move/from16 v27, v7

    goto/16 :goto_0

    :cond_2
    sget v5, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v7, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    add-int/2addr v5, v7

    const v7, 0x1ab128

    add-int/2addr v5, v7

    move/from16 v27, v5

    goto/16 :goto_0

    :cond_3
    :sswitch_8
    sget v5, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v7, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    add-int/lit16 v7, v7, -0x22e8

    sub-int/2addr v5, v7

    if-gtz v5, :cond_4

    const-string v5, "\u06e1\u06e8\u06e6"

    move v7, v9

    :goto_5
    invoke-static {v5}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v5

    move v9, v7

    move/from16 v27, v5

    goto/16 :goto_0

    :cond_4
    sget v5, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v7, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    xor-int/2addr v5, v7

    const v7, 0x1aa8b8

    add-int/2addr v5, v7

    move/from16 v27, v5

    goto/16 :goto_0

    :cond_5
    :sswitch_9
    const-string v5, "\u06e5\u06e8"

    :goto_6
    invoke-static {v5}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v27, v5

    goto/16 :goto_0

    :sswitch_a
    sget v5, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v7, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    rem-int/lit16 v7, v7, 0x610

    rem-int/2addr v5, v7

    if-ltz v5, :cond_6

    const/4 v5, 0x1

    sput v5, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    const-string v5, "\u06e5\u06e0\u06e6"

    :goto_7
    invoke-static {v5}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v27, v5

    goto/16 :goto_0

    :cond_6
    const-string v5, "\u06e6\u06e3\u06e3"

    goto/16 :goto_2

    :sswitch_b
    sget v5, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    xor-int/lit8 v5, v5, -0x43

    invoke-static {v5}, Lmp;->q(I)I

    move-result v5

    sget v7, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    xor-int/lit16 v7, v7, -0x3d1

    invoke-static {v7}, Lmp;->q(I)I

    move-result v7

    sget v20, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    move/from16 v0, v20

    xor-int/lit16 v0, v0, 0x287

    move/from16 v20, v0

    sget v21, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v24, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sub-int v21, v21, v24

    const v24, 0x1abd56

    add-int v21, v21, v24

    move/from16 v24, v5

    move/from16 v25, v7

    move/from16 v26, v20

    move/from16 v27, v21

    goto/16 :goto_0

    :cond_7
    :sswitch_c
    sget v5, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v7, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    add-int/lit16 v7, v7, -0x559

    div-int/2addr v5, v7

    if-eqz v5, :cond_8

    const/16 v5, 0x4f

    sput v5, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    const-string v5, "\u06e1\u06e2\u06e5"

    move-object v7, v10

    :goto_8
    invoke-static {v5}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v5

    move-object v10, v7

    move/from16 v27, v5

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u06e8\u06e5\u06e1"

    move-object v7, v10

    goto :goto_8

    :sswitch_d
    const v5, 0x3f666666    # 0.9f

    invoke-virtual {v6, v5}, Landroid/view/View;->setAlpha(F)V

    invoke-static {}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟ۧ۟ۥۧ()I

    move-result v5

    if-gtz v5, :cond_d

    const-string v5, "\u06e5\u06e8\u06e7"

    invoke-static {v5}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v27, v5

    goto/16 :goto_0

    :sswitch_e
    move v7, v9

    :cond_9
    sget v5, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    if-ltz v5, :cond_a

    const/4 v5, 0x6

    sput v5, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    const-string v5, "\u06e2\u06e7\u06df"

    invoke-static {v5}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v5

    move v9, v7

    move/from16 v27, v5

    goto/16 :goto_0

    :cond_a
    sget v5, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v9, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    rem-int/2addr v5, v9

    const v9, -0x1aba34

    xor-int/2addr v5, v9

    move v9, v7

    move/from16 v27, v5

    goto/16 :goto_0

    :sswitch_f
    sget v5, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v7, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    rem-int/lit16 v7, v7, 0x26c2

    xor-int/2addr v5, v7

    if-gtz v5, :cond_b

    const/16 v5, 0x15

    sput v5, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    const-string v5, "\u06e4\u06e1\u06df"

    goto/16 :goto_6

    :cond_b
    sget v5, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v7, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    div-int/2addr v5, v7

    const v7, -0x1ac54d

    xor-int/2addr v5, v7

    move/from16 v27, v5

    goto/16 :goto_0

    :sswitch_10
    move-object/from16 v0, v18

    invoke-static {v10, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    sget v7, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v20, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    move/from16 v0, v20

    xor-int/lit16 v0, v0, -0x22fa

    move/from16 v20, v0

    mul-int v7, v7, v20

    if-ltz v7, :cond_c

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۨۦ۠ۡ()I

    const-string v7, "\u06e7\u06e5\u06e8"

    invoke-static {v7}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v22, v5

    move/from16 v27, v7

    goto/16 :goto_0

    :cond_c
    sget v7, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    sget v20, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sub-int v7, v7, v20

    const v20, 0x1ab3d8

    add-int v7, v7, v20

    move-object/from16 v22, v5

    move/from16 v27, v7

    goto/16 :goto_0

    :sswitch_11
    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Landroid/view/View;->setElevation(F)V

    sget v5, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v7, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    add-int/lit16 v7, v7, 0x1a98

    or-int/2addr v5, v7

    if-ltz v5, :cond_e

    :cond_d
    const-string v5, "\u06e2\u06e0\u06e0"

    invoke-static {v5}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v5

    move/from16 v27, v5

    goto/16 :goto_0

    :cond_e
    sget v5, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v7, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    add-int/2addr v5, v7

    const v7, 0xe011

    add-int/2addr v5, v7

    move/from16 v27, v5

    goto/16 :goto_0

    :sswitch_12
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    invoke-static {v4, v5}, Lc0;->A(Landroid/widget/LinearLayout;I)V

    invoke-static {}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣۢ۠۠()I

    move-result v5

    if-gtz v5, :cond_f

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۢ۠۟ۨ()I

    const-string v5, "\u06e6\u06e7\u06e1"

    invoke-static {v5}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v5

    move/from16 v27, v5

    goto/16 :goto_0

    :cond_f
    move-object/from16 v5, v18

    :goto_9
    const-string v18, "\u06df\u06e4\u06e5"

    move-object/from16 v7, v19

    move-object/from16 v20, v18

    move-object/from16 v21, v5

    :goto_a
    invoke-static/range {v20 .. v20}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v19, v7

    move-object/from16 v18, v21

    move/from16 v27, v5

    goto/16 :goto_0

    :sswitch_13
    sget v5, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v7, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    add-int/lit16 v7, v7, -0x2bd

    rem-int/2addr v5, v7

    if-gtz v5, :cond_11

    invoke-static {}, Lۤۤۥۤ;->۟ۤ۠()I

    move-object v5, v12

    :cond_10
    const-string v7, "\u06e6\u06e1"

    invoke-static {v7}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v7

    move-object v12, v5

    move/from16 v27, v7

    goto/16 :goto_0

    :cond_11
    sget v5, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sget v7, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sub-int/2addr v5, v7

    const v7, 0x1ac2b2

    xor-int/2addr v5, v7

    move/from16 v27, v5

    goto/16 :goto_0

    :cond_12
    const-string v6, "\u06df\u06e1\u06e8"

    move-object v7, v6

    goto/16 :goto_4

    :sswitch_14
    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    move-object/from16 v0, p3

    iget v7, v0, Lsn;->c:I

    invoke-virtual {v5, v7}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    move-object/from16 v0, p3

    iget v7, v0, Lsn;->j:F

    invoke-virtual {v5, v7}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    sget v7, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v19, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    move/from16 v0, v19

    or-int/lit16 v0, v0, 0xa4e

    move/from16 v19, v0

    sub-int v7, v7, v19

    if-ltz v7, :cond_13

    const/4 v7, 0x7

    sput v7, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    const-string v7, "\u06e2\u06e0\u06e6"

    invoke-static {v7}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v19, v5

    move/from16 v27, v7

    goto/16 :goto_0

    :cond_13
    const-string v19, "\u06e1\u06df\u06e4"

    move-object v7, v5

    move-object/from16 v20, v19

    move-object/from16 v21, v18

    goto :goto_a

    :sswitch_15
    sget v5, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v7, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    add-int/lit16 v7, v7, 0x4d5

    xor-int/2addr v5, v7

    if-ltz v5, :cond_14

    const-string v5, "\u06df\u06e1\u06e8"

    invoke-static {v5}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠ۡۤ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v17, v15

    move/from16 v27, v5

    goto/16 :goto_0

    :cond_14
    const-string v5, "\u06e2\u06e5\u06e8"

    move-object/from16 v17, v15

    :goto_b
    invoke-static {v5}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v5

    move/from16 v27, v5

    goto/16 :goto_0

    :sswitch_16
    move-object/from16 v0, v19

    invoke-virtual {v4, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    move-object/from16 v0, p3

    iget-boolean v5, v0, Lsn;->l:Z

    if-eqz v5, :cond_9

    sget v5, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v9, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    mul-int/lit16 v9, v9, -0x2381

    sub-int/2addr v5, v9

    if-ltz v5, :cond_15

    invoke-static {}, Landroid/app/۟ۡۧۦۡ;->ۥۣۨۧ()I

    const-string v5, "\u06e8\u06e5\u06e3"

    invoke-static {v5}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v5

    move v9, v7

    move/from16 v27, v5

    goto/16 :goto_0

    :cond_15
    const-string v5, "\u06e3\u06e8\u06e8"

    goto/16 :goto_5

    :sswitch_17
    const-string v5, "Gx3a\n"

    const-string v7, "en6u0nfdz/8=\n"

    invoke-static {v5, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v0, p0

    invoke-static {v5, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v5, "15cya0GTb4nG\n"

    const-string v7, "tPhcHyD6Aew=\n"

    invoke-static {v5, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v5, "DLraS8Y=\n"

    const-string v7, "eNOuJ6N25ss=\n"

    const-string v20, "GySoV4s=\n"

    const-string v21, "b0zNOu4v/Y0=\n"

    move-object/from16 v0, p2

    move-object/from16 v1, v20

    move-object/from16 v2, v21

    invoke-static {v5, v7, v0, v1, v2}, Lg40;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v0, p3

    invoke-static {v5, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    sget v5, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    if-gtz v5, :cond_16

    const-string v5, "\u06e5\u06e2\u06e7"

    invoke-static {v5}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v27, v5

    goto/16 :goto_0

    :cond_16
    const-string v5, "\u06e1\u06e0"

    invoke-static {v5}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v27, v5

    goto/16 :goto_0

    :sswitch_18
    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Landroid/view/View;->setClipToOutline(Z)V

    move-object/from16 v0, p4

    invoke-interface {v0, v4}, Lum;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, p1

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-static {}, Lۤۨۤۨ;->۟ۢۦۣۢ()I

    move-result v5

    if-ltz v5, :cond_17

    const-string v5, "\u06e1\u06e5\u06e6"

    invoke-static {v5}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v27, v5

    goto/16 :goto_0

    :cond_17
    sget v5, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v7, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    xor-int/2addr v5, v7

    const v7, 0x1acbef

    xor-int/2addr v5, v7

    move/from16 v27, v5

    goto/16 :goto_0

    :sswitch_19
    const-string v13, "NZMTlNkJvYk=\n"

    const-string v5, "\u06e2\u06e4\u06e5"

    move-object/from16 v7, v16

    :goto_c
    invoke-static {v5}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v17, v7

    move/from16 v27, v5

    goto/16 :goto_0

    :cond_18
    :sswitch_1a
    sget v5, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    if-gtz v5, :cond_19

    const/16 v5, 0x5e

    sput v5, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    const-string v5, "\u06df\u06e3\u06e0"

    move-object v7, v14

    goto/16 :goto_1

    :cond_19
    sget v5, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v7, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    rem-int/2addr v5, v7

    const v7, -0x1ab2de

    xor-int/2addr v5, v7

    move/from16 v27, v5

    goto/16 :goto_0

    :sswitch_1b
    move-object/from16 v0, p3

    iget v5, v0, Lsn;->a:I

    if-nez v5, :cond_18

    sget v5, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    if-gtz v5, :cond_1b

    const/16 v5, 0x51

    sput v5, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    move-object v5, v15

    :cond_1a
    const-string v7, "\u06e2\u06e5\u06e3"

    invoke-static {v7}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v7

    move-object v15, v5

    move/from16 v27, v7

    goto/16 :goto_0

    :cond_1b
    const-string v5, "\u06e7\u06e7"

    invoke-static {v5}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v5

    move/from16 v27, v5

    goto/16 :goto_0

    :sswitch_1c
    invoke-static {}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->ۤ۠ۡۧ()I

    move-result v5

    if-ltz v5, :cond_1c

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۡۥۥۦ()I

    const-string v5, "\u06df\u06e6\u06e6"

    invoke-static {v5}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v27, v5

    goto/16 :goto_0

    :cond_1c
    sget v5, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v7, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    xor-int/2addr v5, v7

    const v7, 0x1ac685

    add-int/2addr v5, v7

    move/from16 v27, v5

    goto/16 :goto_0

    :sswitch_1d
    const/high16 v5, 0x41800000    # 16.0f

    invoke-static {v5}, Lmp;->p(F)F

    move-result v5

    invoke-virtual {v4, v5}, Landroid/view/View;->setElevation(F)V

    const/16 v5, 0x1c

    if-lt v9, v5, :cond_5

    if-eqz v8, :cond_3

    sget v5, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    if-gtz v5, :cond_1d

    const-string v5, "\u06df\u06e6\u06e0"

    move-object/from16 v7, v17

    goto :goto_c

    :cond_1d
    sget v5, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v7, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    rem-int/2addr v5, v7

    const v7, 0x1ac404

    add-int/2addr v5, v7

    move/from16 v27, v5

    goto/16 :goto_0

    :sswitch_1e
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    sget v7, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    xor-int/lit16 v7, v7, 0x1f2

    sget v20, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    xor-int/lit8 v20, v20, 0x4a

    move/from16 v0, v20

    invoke-direct {v5, v7, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static/range {v26 .. v26}, Lmp;->q(I)I

    move-result v7

    const/16 v20, 0x0

    invoke-static/range {v26 .. v26}, Lmp;->q(I)I

    move-result v21

    invoke-static/range {v26 .. v26}, Lmp;->q(I)I

    move-result v27

    move/from16 v0, v20

    move/from16 v1, v21

    move/from16 v2, v27

    invoke-virtual {v5, v7, v0, v1, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۡۥۥۦ()I

    move-result v5

    if-ltz v5, :cond_1e

    invoke-static {}, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۡۥ()I

    goto/16 :goto_3

    :cond_1e
    sget v5, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v7, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    or-int/2addr v5, v7

    const v7, 0x1ab6c7

    add-int/2addr v5, v7

    move/from16 v27, v5

    goto/16 :goto_0

    :sswitch_1f
    invoke-static {}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۧۡۥ۟()I

    move-result v5

    if-gtz v5, :cond_1f

    const-string v5, "\u06e3\u06e1\u06e2"

    invoke-static {v5}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v18, v12

    move/from16 v27, v5

    goto/16 :goto_0

    :cond_1f
    const-string v5, "\u06e6\u06e4\u06df"

    invoke-static {v5}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v18, v12

    move/from16 v27, v5

    goto/16 :goto_0

    :sswitch_20
    sget-object v5, Ljava/lang/System;->out:Ljava/io/PrintStream;

    move-object/from16 v0, v23

    invoke-virtual {v5, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :goto_d
    const-string v5, "\u06e8\u06e5\u06e1"

    goto/16 :goto_b

    :sswitch_21
    sget v5, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    if-ltz v5, :cond_20

    invoke-static {}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۦۥۨۦ()I

    const-string v5, "\u06e5\u06e8\u06e5"

    invoke-static {v5}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v27, v5

    goto/16 :goto_0

    :cond_20
    const-string v5, "\u06e5\u06e8\u06e7"

    goto/16 :goto_7

    :sswitch_22
    const-string v5, "nKIYQljx2/iP\n"

    const-string v14, "v5ItcmjB68g=\n"

    sget v7, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v15, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    add-int/lit16 v15, v15, 0x172

    div-int/2addr v7, v15

    if-eqz v7, :cond_1a

    const-string v7, "\u06e5\u06e0\u06df"

    invoke-static {v7}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v7

    move-object v15, v5

    move/from16 v27, v7

    goto/16 :goto_0

    :sswitch_23
    const-string v11, "oAWNAKv43Miz\n"

    const-string v5, "gzW+MJvI7Pg=\n"

    sget v7, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v18, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    move/from16 v0, v18

    add-int/lit16 v0, v0, -0x206c

    move/from16 v18, v0

    rem-int v7, v7, v18

    if-gtz v7, :cond_21

    invoke-static {}, Landroid/window/۟ۤ۟ۡۧ;->ۢۦۣۨ()I

    goto/16 :goto_9

    :cond_21
    sget v7, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v18, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    xor-int v7, v7, v18

    const v18, 0x1ac8d4

    add-int v7, v7, v18

    move-object/from16 v18, v5

    move/from16 v27, v7

    goto/16 :goto_0

    :sswitch_24
    sget v5, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v7, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    add-int/lit16 v7, v7, 0x1bc

    sub-int/2addr v5, v7

    if-gtz v5, :cond_22

    const/16 v5, 0x40

    sput v5, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    move-object v10, v11

    goto :goto_d

    :cond_22
    const-string v5, "\u06e4\u06df\u06e5"

    move-object v7, v11

    goto/16 :goto_8

    :sswitch_25
    move-object/from16 v0, p1

    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v4, Landroid/widget/LinearLayout;

    move-object/from16 v0, p0

    invoke-direct {v4, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const-string v5, "\u06e8\u06df\u06e2"

    :goto_e
    invoke-static {v5}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v5

    move/from16 v27, v5

    goto/16 :goto_0

    :sswitch_26
    sget v5, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v7, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    add-int/lit16 v7, v7, 0x9cc

    xor-int/2addr v5, v7

    if-gtz v5, :cond_23

    const-string v5, "\u06e6\u06e0\u06e3"

    invoke-static {v5}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v5

    move/from16 v27, v5

    goto/16 :goto_0

    :cond_23
    sget v5, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v7, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sub-int/2addr v5, v7

    const v7, 0x1ac632

    add-int/2addr v5, v7

    move/from16 v27, v5

    goto/16 :goto_0

    :sswitch_27
    invoke-static {}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۤ۠ۤۢ()I

    move-result v5

    if-ltz v5, :cond_7

    const-string v5, "XNWPwgEISuAVn9vs1vJtWTnt8b"

    invoke-static {v5}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->۟ۢۥۨۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v5

    sget v7, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v20, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    xor-int v7, v7, v20

    const v20, 0x1abc50

    add-int v7, v7, v20

    move-object/from16 v23, v5

    move/from16 v27, v7

    goto/16 :goto_0

    :sswitch_28
    sget v5, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sget v7, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    mul-int/2addr v5, v7

    const v7, 0x1c2604

    add-int/2addr v5, v7

    move/from16 v27, v5

    goto/16 :goto_0

    :sswitch_29
    move-object/from16 v0, v17

    invoke-static {v0, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sget v5, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    if-gtz v5, :cond_24

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۧۡۥۦ()I

    const-string v5, "\u06e4\u06df\u06e7"

    goto :goto_e

    :cond_24
    sget v5, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v7, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    add-int/2addr v5, v7

    const v7, 0x1ac4d0

    add-int/2addr v5, v7

    move/from16 v27, v5

    goto/16 :goto_0

    :sswitch_2a
    sget v5, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    if-ltz v5, :cond_25

    const-string v5, "\u06e4\u06df\u06e5"

    :goto_f
    invoke-static {v5}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v27, v5

    goto/16 :goto_0

    :cond_25
    const-string v5, "\u06e2\u06e0\u06e6"

    goto :goto_f

    :sswitch_2b
    move-object/from16 v0, p2

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v5, 0x41500000    # 13.0f

    invoke-virtual {v6, v5}, Landroid/widget/TextView;->setTextSize(F)V

    move-object/from16 v0, p3

    iget v5, v0, Lsn;->g:I

    invoke-virtual {v6, v5}, Landroid/widget/TextView;->setTextColor(I)V

    const-string v5, "\u06e5\u06e8\u06e5"

    goto/16 :goto_7

    :sswitch_2c
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc1f -> :sswitch_0
        0xdca3 -> :sswitch_18
        0xdcbb -> :sswitch_1f
        0xdce0 -> :sswitch_d
        0x1aa746 -> :sswitch_2b
        0x1aa7a0 -> :sswitch_13
        0x1aa7a2 -> :sswitch_19
        0x1aa7d9 -> :sswitch_c
        0x1aaadf -> :sswitch_e
        0x1aab9e -> :sswitch_23
        0x1aae81 -> :sswitch_28
        0x1aae86 -> :sswitch_16
        0x1aae87 -> :sswitch_29
        0x1aaec8 -> :sswitch_f
        0x1aaf42 -> :sswitch_9
        0x1ab262 -> :sswitch_25
        0x1ab266 -> :sswitch_28
        0x1ab268 -> :sswitch_a
        0x1ab2e3 -> :sswitch_1
        0x1ab300 -> :sswitch_15
        0x1ab305 -> :sswitch_7
        0x1ab33d -> :sswitch_26
        0x1ab644 -> :sswitch_4
        0x1ab686 -> :sswitch_14
        0x1ab723 -> :sswitch_1d
        0x1ab9ca -> :sswitch_21
        0x1ab9cc -> :sswitch_2
        0x1ab9e3 -> :sswitch_22
        0x1aba40 -> :sswitch_11
        0x1abda4 -> :sswitch_20
        0x1abdea -> :sswitch_8
        0x1abe01 -> :sswitch_5
        0x1abe29 -> :sswitch_1b
        0x1abe47 -> :sswitch_a
        0x1abe66 -> :sswitch_1a
        0x1abea2 -> :sswitch_b
        0x1abea4 -> :sswitch_4
        0x1ac169 -> :sswitch_2a
        0x1ac1c6 -> :sswitch_12
        0x1ac1e1 -> :sswitch_10
        0x1ac204 -> :sswitch_9
        0x1ac23f -> :sswitch_3
        0x1ac240 -> :sswitch_1c
        0x1ac50a -> :sswitch_24
        0x1ac54c -> :sswitch_6
        0x1ac5ca -> :sswitch_17
        0x1ac8cb -> :sswitch_1e
        0x1ac968 -> :sswitch_f
        0x1ac984 -> :sswitch_2c
        0x1ac986 -> :sswitch_27
    .end sparse-switch
.end method

.method public static b(Landroid/app/Activity;Landroid/widget/LinearLayout;Lsn;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLum;Ljm;Lum;I)Landroid/widget/LinearLayout;
    .locals 92

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v67, 0x0

    const/16 v21, 0x0

    const/16 v74, 0x0

    const/16 v55, 0x0

    const/16 v87, 0x0

    const/16 v88, 0x0

    const/16 v61, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v27, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v30, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v35, 0x0

    const/16 v34, 0x0

    const/16 v54, 0x0

    const/16 v73, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/4 v6, 0x0

    const/4 v5, 0x0

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/16 v69, 0x0

    const/16 v68, 0x0

    const/16 v44, 0x0

    const/16 v51, 0x0

    const/16 v62, 0x0

    const/16 v45, 0x0

    const/16 v33, 0x0

    const/16 v48, 0x0

    const/16 v47, 0x0

    const/16 v49, 0x0

    const/16 v16, 0x0

    const/16 v41, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x0

    const/16 v89, 0x0

    const/16 v52, 0x0

    const/16 v70, 0x0

    const/16 v42, 0x0

    const/16 v40, 0x0

    const/16 v72, 0x0

    const/16 v71, 0x0

    const/16 v75, 0x0

    const/4 v8, 0x0

    const/16 v76, 0x0

    const/4 v10, 0x0

    const/16 v25, 0x0

    const/4 v15, 0x0

    const/16 v24, 0x0

    const/16 v43, 0x0

    const/16 v26, 0x0

    const/16 v17, 0x0

    const/4 v14, 0x0

    const/16 v50, 0x0

    const/16 v63, 0x0

    const/16 v91, 0x0

    const/16 v64, 0x0

    const/16 v22, 0x0

    const/16 v53, 0x0

    const/16 v23, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/4 v7, 0x0

    const/4 v11, 0x0

    const/16 v38, 0x0

    const/16 v60, 0x0

    const/16 v59, 0x0

    const/16 v46, 0x0

    const/16 v39, 0x0

    const/16 v20, 0x0

    const-string v77, "\u06e0\u06e1\u06e0"

    invoke-static/range {v77 .. v77}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v90

    move-object/from16 v77, v4

    move-object/from16 v78, v5

    move-object/from16 v79, v6

    move-object/from16 v80, v7

    move-object/from16 v81, v8

    move-object/from16 v82, v9

    move-object/from16 v83, v10

    move-object/from16 v84, v11

    move/from16 v85, v12

    move/from16 v86, v13

    :goto_0
    sparse-switch v90, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    sget v4, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v5, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    or-int/2addr v4, v5

    const v5, 0x1ab7e9

    add-int/2addr v4, v5

    move/from16 v90, v4

    goto :goto_0

    :sswitch_1
    invoke-static {}, L۟ۤۧۦۢ;->ۣ۟۟ۢ۟()I

    move-result v4

    if-ltz v4, :cond_1

    const-string v4, "\u06e1\u06e5\u06e0"

    :goto_1
    invoke-static {v4}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto :goto_0

    :cond_1
    sget v4, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v5, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    or-int/2addr v4, v5

    const v5, -0x1ac9e1

    xor-int/2addr v4, v5

    move/from16 v90, v4

    goto :goto_0

    :sswitch_2
    sget v4, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    if-gtz v4, :cond_2

    invoke-static {}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۨ۠۟()I

    const-string v4, "\u06df\u06e2\u06e8"

    invoke-static {v4}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto :goto_0

    :cond_2
    sget v4, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v5, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    rem-int/2addr v4, v5

    const v5, 0x1ab2ce

    add-int/2addr v4, v5

    move/from16 v90, v4

    goto :goto_0

    :sswitch_3
    const-string v4, "\u06e8\u06e6\u06e7"

    :goto_2
    invoke-static {v4}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto :goto_0

    :sswitch_4
    sget v4, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v5, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    div-int/lit16 v5, v5, -0x1e40

    or-int/2addr v4, v5

    if-ltz v4, :cond_3

    const/16 v4, 0x24

    sput v4, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    const-string v4, "\u06e6\u06e5\u06e6"

    invoke-static {v4}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v74, p12

    move/from16 v90, v4

    goto :goto_0

    :cond_3
    sget v4, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v5, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    or-int/2addr v4, v5

    const v5, -0x1ac23d

    xor-int/2addr v4, v5

    move-object/from16 v74, p12

    move/from16 v90, v4

    goto :goto_0

    :sswitch_5
    new-instance v4, Landroid/widget/LinearLayout;

    move-object/from16 v0, p0

    invoke-direct {v4, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v5, 0x10

    invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->setGravity(I)V

    new-instance v12, Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-direct {v12, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    sget-object v5, Lkn;->a:Lkn;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v0, p5

    move-object/from16 v1, p8

    invoke-static {v0, v1}, Lkn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v12, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v5, 0x41700000    # 15.0f

    invoke-virtual {v12, v5}, Landroid/widget/TextView;->setTextSize(F)V

    move/from16 v0, v27

    invoke-virtual {v12, v0}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x8

    invoke-static {v7}, Lmp;->q(I)I

    move-result v7

    const/4 v8, 0x0

    invoke-virtual {v12, v5, v6, v7, v8}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v4, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, v32

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v4, Lnk;

    new-instance v5, Lo00;

    invoke-direct {v5}, Lo00;-><init>()V

    move-object/from16 v6, p0

    move-object/from16 v7, p4

    move-object/from16 v8, p7

    move-object/from16 v9, p5

    move-object/from16 v10, p8

    move-object/from16 v11, p2

    invoke-direct/range {v4 .. v12}, Lnk;-><init>(Lo00;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lsn;Landroid/widget/TextView;)V

    move-object/from16 v0, v32

    invoke-virtual {v0, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-static {}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۡۤۥۧ()I

    move-result v4

    if-ltz v4, :cond_4

    const-string v4, "\u06e5\u06e8\u06e6"

    invoke-static {v4}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u06e3\u06df\u06e2"

    :goto_3
    invoke-static {v4}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_6
    const/4 v4, 0x1

    move-object/from16 v0, p0

    invoke-static {v0, v4}, Lg40;->g(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    move-result-object v4

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v6, 0x0

    const/4 v7, -0x2

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-direct {v5, v6, v7, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v6, Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-direct {v6, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    move-object/from16 v0, p4

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v5, 0x41780000    # 15.5f

    invoke-virtual {v6, v5}, Landroid/widget/TextView;->setTextSize(F)V

    move/from16 v0, v61

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setTextColor(I)V

    const v5, -0x435c28f6    # -0.02f

    invoke-virtual {v6, v5}, Landroid/widget/TextView;->setLetterSpacing(F)V

    sget-object v5, Lbo;->b:Landroid/graphics/Typeface;

    const/4 v7, 0x1

    invoke-virtual {v6, v5, v7}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    invoke-virtual {v4, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    if-eqz p7, :cond_f

    new-instance v6, Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-direct {v6, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    move-object/from16 v0, p7

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۠۟ۥۧ()I

    move-result v7

    if-ltz v7, :cond_5

    invoke-static {}, Lۤۨۤۨ;->۟ۢۦۣۢ()I

    const-string v7, "\u06e0\u06e1\u06e8"

    invoke-static {v7}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v28, v4

    move-object/from16 v79, v6

    move-object/from16 v29, v5

    move/from16 v90, v7

    goto/16 :goto_0

    :cond_5
    sget v7, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v8, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    or-int/2addr v7, v8

    const v8, 0x1ab9e7

    add-int/2addr v7, v8

    move-object/from16 v28, v4

    move-object/from16 v79, v6

    move-object/from16 v29, v5

    move/from16 v90, v7

    goto/16 :goto_0

    :sswitch_7
    const-string v4, "\u06e8\u06e6\u06e0"

    :goto_4
    invoke-static {v4}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_8
    sget v4, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v5, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    xor-int/lit16 v5, v5, -0x1e4b

    add-int/2addr v4, v5

    if-gtz v4, :cond_7

    const/16 v4, 0xa

    sput v4, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    move-object/from16 v4, v18

    move-object/from16 v5, v19

    :cond_6
    const-string v6, "\u06e5\u06e2\u06e5"

    invoke-static {v6}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v18, v4

    move-object/from16 v19, v5

    move/from16 v90, v6

    goto/16 :goto_0

    :cond_7
    sget v4, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sget v5, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    mul-int/2addr v4, v5

    const v5, 0x1b0d35

    add-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_9
    if-eqz v16, :cond_0

    const/16 v5, 0x34

    sget v4, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v6, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    mul-int/lit16 v6, v6, 0x1949

    xor-int/2addr v4, v6

    if-gtz v4, :cond_8

    invoke-static {}, Landroidx/core/widget/۟ۡۦۢۥ;->ۡۧۡۦ()I

    const-string v4, "\u06df\u06e2\u06e3"

    invoke-static {v4}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06e0\u06e8\u06e7"

    :goto_5
    invoke-static {v4}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_a
    sget v4, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    if-ltz v4, :cond_a

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۤ۠ۤۢ()I

    move-object/from16 v4, v20

    :cond_9
    const-string v5, "\u06e8\u06df\u06e3"

    invoke-static {v5}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v20, v4

    move/from16 v90, v5

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06e8\u06e0\u06e4"

    :goto_6
    invoke-static {v4}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_b
    sget v4, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v5, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    rem-int/lit16 v5, v5, 0x14d4

    add-int/2addr v4, v5

    if-ltz v4, :cond_b

    invoke-static {}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۟ۢۢ()I

    move-object/from16 v4, v21

    move-object/from16 v5, v22

    :goto_7
    const-string v6, "\u06e2\u06e2\u06e0"

    invoke-static {v6}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v21, v4

    move-object/from16 v23, v5

    move/from16 v90, v6

    goto/16 :goto_0

    :cond_b
    sget v4, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v5, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    or-int/2addr v4, v5

    const v5, -0x1aaadf

    xor-int/2addr v4, v5

    move-object/from16 v23, v22

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_c
    const-string v4, "\u06e5\u06df\u06e1"

    move-object/from16 v5, p11

    :goto_8
    invoke-static {v4}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v67, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_d
    sget v4, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v5, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    xor-int/2addr v4, v5

    const v5, 0x1ab228

    add-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_e
    sget v4, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    if-gtz v4, :cond_c

    const/16 v4, 0x49

    sput v4, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    const-string v5, "\u06df\u06e5\u06e7"

    move-object/from16 v4, v24

    move/from16 v6, v25

    move/from16 v7, v26

    :goto_9
    invoke-static {v5}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v24, v4

    move/from16 v25, v6

    move/from16 v90, v5

    move/from16 v26, v7

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06e3\u06e7\u06df"

    invoke-static {v4}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_f
    move/from16 v0, p13

    xor-int/lit16 v4, v0, -0x801

    and-int v4, v4, p13

    if-eqz v4, :cond_9f

    const/4 v4, 0x0

    sget v5, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v6, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    xor-int/lit16 v6, v6, -0x24ff

    rem-int/2addr v5, v6

    if-gtz v5, :cond_d

    const/16 v5, 0x1b

    sput v5, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    const-string v5, "\u06e7\u06e3\u06e8"

    invoke-static {v5}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v21, v4

    move/from16 v90, v5

    goto/16 :goto_0

    :cond_d
    move-object/from16 v5, v23

    goto/16 :goto_7

    :sswitch_10
    invoke-static/range {v53 .. v53}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    invoke-static {v14, v4}, Lc0;->n(Landroid/view/View;I)V

    if-eqz v87, :cond_28

    const-string v5, "QAg9x7AZ6Q==\n"

    const-string v6, "YzgN94Ap2aw=\n"

    sget v4, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    if-gtz v4, :cond_e

    const-string v4, "\u06e1\u06e5\u06e2"

    invoke-static {v4}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v37, v5

    move-object/from16 v38, v6

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_e
    const-string v4, "\u06df\u06e4\u06e0"

    :goto_a
    invoke-static {v4}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v37, v5

    move-object/from16 v38, v6

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_11
    move-object/from16 v4, v28

    move-object/from16 v5, v29

    :cond_f
    sget v6, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    if-gtz v6, :cond_10

    const-string v6, "\u06e8\u06e4\u06e8"

    :goto_b
    invoke-static {v6}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v28, v4

    move-object/from16 v29, v5

    move/from16 v90, v6

    goto/16 :goto_0

    :cond_10
    const-string v6, "\u06e4\u06e2\u06e0"

    goto :goto_b

    :sswitch_12
    const/4 v4, 0x0

    move-object/from16 v0, p0

    invoke-static {v0, v4}, Lg40;->g(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    move-result-object v5

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v6, 0x0

    const/4 v7, -0x2

    const v8, 0x3fa66666    # 1.3f

    invoke-direct {v4, v6, v7, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v5, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const v4, 0x800015

    invoke-virtual {v5, v4}, Landroid/widget/LinearLayout;->setGravity(I)V

    new-instance v6, Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-direct {v6, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    sget-object v4, Lkn;->a:Lkn;

    invoke-static/range {p8 .. p8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v0, p5

    invoke-static {v0, v7}, Lkn;->b(Ljava/lang/String;I)I

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v4, 0x41580000    # 13.5f

    invoke-virtual {v6, v4}, Landroid/widget/TextView;->setTextSize(F)V

    move/from16 v0, v27

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setTextColor(I)V

    move-object/from16 v0, v29

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x6

    invoke-static {v8}, Lmp;->q(I)I

    move-result v8

    const/4 v9, 0x0

    invoke-virtual {v6, v4, v7, v8, v9}, Landroid/widget/TextView;->setPadding(IIII)V

    new-instance v4, Landroid/widget/SeekBar;

    move-object/from16 v0, p0

    invoke-direct {v4, v0}, Landroid/widget/SeekBar;-><init>(Landroid/content/Context;)V

    sget v7, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v8, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    rem-int/lit16 v8, v8, 0x1bc5

    rem-int/2addr v7, v8

    if-ltz v7, :cond_11

    const-string v7, "\u06e0\u06e2\u06e4"

    invoke-static {v7}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v77, v4

    move-object/from16 v78, v5

    move-object/from16 v82, v6

    move/from16 v90, v7

    goto/16 :goto_0

    :cond_11
    sget v7, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v8, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    mul-int/2addr v7, v8

    const v8, 0x19273e

    add-int/2addr v7, v8

    move-object/from16 v77, v4

    move-object/from16 v78, v5

    move-object/from16 v82, v6

    move/from16 v90, v7

    goto/16 :goto_0

    :sswitch_13
    sget v4, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v5, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    add-int/lit16 v5, v5, 0xa53

    add-int/2addr v4, v5

    if-gtz v4, :cond_12

    const/16 v4, 0x5f

    sput v4, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    const-string v4, "\u06e5\u06e6\u06e0"

    goto/16 :goto_2

    :cond_12
    const-string v4, "\u06e5\u06df\u06e0"

    invoke-static {v4}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_14
    sget-object v4, Lkn;->a:Lkn;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static/range {p5 .. p5}, Lkn;->e(Ljava/lang/String;)Z

    move-result v6

    new-instance v4, Ld6;

    const/4 v5, 0x1

    move-object/from16 v0, p5

    move-object/from16 v1, v30

    move-object/from16 v2, v55

    invoke-direct {v4, v0, v1, v2, v5}, Ld6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object/from16 v0, p2

    iget v5, v0, Lsn;->a:I

    if-nez v5, :cond_7e

    const/16 v16, 0x1

    invoke-static {}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟ۥۦۧۡ()I

    move-result v5

    if-ltz v5, :cond_13

    const-string v5, "\u06e4\u06e8\u06df"

    invoke-static {v5}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v47, v4

    move/from16 v48, v6

    move/from16 v90, v5

    goto/16 :goto_0

    :cond_13
    sget v5, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v7, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    xor-int/2addr v5, v7

    const v7, 0x1ab6b6

    add-int/2addr v5, v7

    move-object/from16 v47, v4

    move/from16 v48, v6

    move/from16 v90, v5

    goto/16 :goto_0

    :sswitch_15
    const-string v4, "\u06e0\u06e6\u06e8"

    :goto_c
    invoke-static {v4}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_16
    new-instance v4, Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-direct {v4, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    move-object/from16 v0, p3

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/16 v5, 0x11

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setGravity(I)V

    sget-object v5, Lbo;->a:Landroid/graphics/Typeface;

    if-eqz v5, :cond_4c

    invoke-static {}, Landroidx/activity/result/۟۠۟۠ۦ;->۟ۢۡ۠()I

    move-result v6

    if-ltz v6, :cond_6

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۦۢۢۢ()I

    const-string v6, "\u06df\u06e8\u06e7"

    invoke-static {v6}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v18, v4

    move-object/from16 v19, v5

    move/from16 v90, v6

    goto/16 :goto_0

    :sswitch_17
    sget v4, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v5, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    add-int/lit16 v5, v5, 0x2302

    rem-int/2addr v4, v5

    if-ltz v4, :cond_14

    invoke-static {}, Lۤۨۤۨ;->۟ۢۦۣۢ()I

    const-string v7, "\u06e4\u06e7\u06e2"

    move-object/from16 v4, v30

    move-object/from16 v5, v31

    move-object/from16 v6, v32

    :goto_d
    invoke-static {v7}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v30, v4

    move-object/from16 v31, v5

    move-object/from16 v32, v6

    move/from16 v90, v7

    goto/16 :goto_0

    :cond_14
    sget v4, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v5, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sub-int/2addr v4, v5

    const v5, 0x1ac31c

    add-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_18
    const/high16 v64, 0x40800000    # 4.0f

    sget v4, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v5, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    add-int/lit16 v5, v5, -0xe7

    mul-int/2addr v4, v5

    if-ltz v4, :cond_15

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۤ۟ۦ۟()I

    const-string v4, "\u06e8\u06e6\u06e7"

    invoke-static {v4}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_15
    const-string v4, "\u06e1\u06e0\u06e6"

    invoke-static {v4}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_19
    sget v4, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v5, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    or-int/lit16 v5, v5, -0xa3d

    mul-int/2addr v4, v5

    if-gtz v4, :cond_16

    const-string v4, "\u06e2\u06df\u06e1"

    :goto_e
    invoke-static {v4}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_16
    const-string v4, "\u06e0\u06e1\u06e0"

    invoke-static {v4}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_1a
    invoke-static/range {v51 .. v51}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    move-object/from16 v0, v68

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextColor(I)V

    sget-object v4, Lbo;->a:Landroid/graphics/Typeface;

    if-eqz v4, :cond_24

    invoke-static {}, Lۤۨۤۨ;->۟ۢۦۣۢ()I

    move-result v5

    if-ltz v5, :cond_17

    const/16 v5, 0x63

    sput v5, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    const-string v5, "\u06e4\u06e0\u06e3"

    move/from16 v6, v34

    :goto_f
    invoke-static {v5}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v33, v4

    move/from16 v90, v5

    move/from16 v34, v6

    goto/16 :goto_0

    :cond_17
    const-string v5, "\u06df\u06df\u06e8"

    invoke-static {v5}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v33, v4

    move/from16 v90, v5

    goto/16 :goto_0

    :sswitch_1b
    if-eqz v16, :cond_52

    const/16 v70, 0x18

    invoke-static {}, Landroidx/legacy/content/ۨ۠ۦۥ;->۟ۢۦ۠ۦ()I

    move-result v4

    if-ltz v4, :cond_18

    invoke-static {}, Landroidx/legacy/content/ۧۡ۠۠;->ۥۧۡۦ()I

    const-string v4, "\u06e0\u06e7\u06e3"

    invoke-static {v4}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_18
    const-string v4, "\u06e2\u06e6\u06e8"

    invoke-static {v4}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_1c
    if-eqz v85, :cond_3d

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۦۢۢۢ()I

    move-result v4

    if-gtz v4, :cond_19

    const-string v4, "\u06e7\u06e4\u06e0"

    invoke-static {v4}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    move/from16 v34, v27

    goto/16 :goto_0

    :cond_19
    const-string v4, "\u06e7\u06e0\u06e6"

    move/from16 v34, v27

    :goto_10
    invoke-static {v4}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_1d
    const-string v4, "\u06e2\u06e2\u06df"

    :goto_11
    invoke-static {v4}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_1e
    invoke-static {}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣۤۧۥ()I

    move-result v4

    if-gtz v4, :cond_1a

    const/16 v4, 0x18

    sput v4, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    const-string v4, "\u06e1\u06e3\u06e8"

    move-object/from16 v5, v36

    :goto_12
    invoke-static {v4}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v36, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_1a
    const-string v4, "\u06e8\u06e2\u06e6"

    invoke-static {v4}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_1b
    :sswitch_1f
    invoke-static {}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۟ۢۢ()I

    move-result v4

    if-gtz v4, :cond_1c

    const/16 v4, 0x5f

    sput v4, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    const-string v4, "\u06e4\u06e2\u06e8"

    move-object/from16 v5, v37

    move-object/from16 v6, v38

    goto/16 :goto_a

    :cond_1c
    sget v4, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v5, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    xor-int/2addr v4, v5

    const v5, 0x1ac0cc

    add-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_20
    new-instance v4, Landroid/view/View;

    move-object/from16 v0, p0

    invoke-direct {v4, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v6, -0x1

    const/4 v7, 0x1

    invoke-direct {v5, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move/from16 v0, v39

    invoke-virtual {v5, v0, v6, v7, v8}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    move-object/from16 v0, p2

    iget v5, v0, Lsn;->h:I

    invoke-virtual {v4, v5}, Landroid/view/View;->setBackgroundColor(I)V

    sget v5, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    sget v6, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    or-int/lit16 v6, v6, 0xb81

    xor-int/2addr v5, v6

    if-ltz v5, :cond_9

    const/16 v5, 0x9

    sput v5, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    const-string v5, "\u06e6\u06e0"

    invoke-static {v5}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v20, v4

    move/from16 v90, v5

    goto/16 :goto_0

    :sswitch_21
    const/16 v5, 0x16

    sget v4, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v6, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    mul-int/lit16 v6, v6, -0x50a

    or-int/2addr v4, v6

    if-ltz v4, :cond_1d

    move/from16 v4, v39

    :goto_13
    const-string v6, "\u06e8\u06e3\u06e8"

    move/from16 v39, v4

    :goto_14
    invoke-static {v6}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    move/from16 v40, v5

    goto/16 :goto_0

    :cond_1d
    const-string v4, "\u06e8\u06e4\u06e0"

    move-object v6, v4

    goto :goto_14

    :sswitch_22
    sget v4, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v5, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    rem-int/2addr v4, v5

    const v5, 0x1aab81

    add-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_23
    sget v4, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v5, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    mul-int/2addr v4, v5

    const v5, 0x1875bb

    add-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_24
    sget v4, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v5, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    xor-int/2addr v4, v5

    const v5, 0x1ac1e4

    xor-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :catch_0
    move-exception v4

    const-string v4, "06ke\n"

    const-string v5, "p8h5VTpLcuY=\n"

    const-string v6, "dQPUMjo/qlBZFdQ8Nz8=\n"

    const-string v7, "IEqSU1lLxSI=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "tw==\n"

    const-string v8, "0vI8ySRxU5w=\n"

    invoke-static {v4, v5, v6, v7, v8}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_15
    const-string v4, "\u06e7\u06df\u06e5"

    invoke-static {v4}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_25
    sget v4, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    if-gtz v4, :cond_1e

    invoke-static {}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۟ۦۣۣۧ()I

    const-string v4, "\u06e7\u06e4\u06e8"

    invoke-static {v4}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_1e
    sget v4, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v5, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    div-int/2addr v4, v5

    const v5, -0x1ab6a2

    xor-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_26
    invoke-static/range {v81 .. v81}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    new-instance v15, Landroid/widget/FrameLayout;

    move-object/from16 v0, p0

    invoke-direct {v15, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    move/from16 v0, v65

    move/from16 v1, v52

    invoke-direct {v4, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v15, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    if-eqz v48, :cond_5a

    sget v5, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v7, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    mul-int/lit16 v7, v7, -0x19b6

    mul-int/2addr v5, v7

    if-ltz v5, :cond_1f

    const-string v5, "\u06e1\u06e2\u06df"

    invoke-static {v5}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v24, v4

    move/from16 v25, v6

    move/from16 v90, v5

    move/from16 v26, v27

    goto/16 :goto_0

    :cond_1f
    const-string v5, "\u06e4\u06e6\u06df"

    move/from16 v7, v27

    goto/16 :goto_9

    :sswitch_27
    sget v4, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v5, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    mul-int/lit16 v5, v5, -0x70e

    or-int/2addr v4, v5

    if-gtz v4, :cond_20

    const/16 v4, 0x1d

    sput v4, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    const-string v4, "\u06e5\u06e6\u06e8"

    :goto_16
    invoke-static {v4}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_20
    const-string v4, "\u06e1\u06e1\u06e7"

    :goto_17
    invoke-static {v4}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_28
    const/4 v4, 0x1

    move-object/from16 v0, p0

    invoke-static {v0, v4}, Lg40;->g(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    move-result-object v31

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v5, -0x1

    const/4 v6, -0x2

    invoke-direct {v4, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    move-object/from16 v0, v31

    invoke-virtual {v0, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v32, Landroid/widget/LinearLayout;

    move-object/from16 v0, v32

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/16 v4, 0x10

    invoke-static {v4}, Lmp;->q(I)I

    move-result v4

    const/16 v5, 0x10

    invoke-static {v5}, Lmp;->q(I)I

    move-result v5

    const/16 v6, 0x10

    invoke-static {v6}, Lmp;->q(I)I

    move-result v6

    const/16 v7, 0x10

    invoke-static {v7}, Lmp;->q(I)I

    move-result v7

    move-object/from16 v0, v32

    invoke-virtual {v0, v4, v5, v6, v7}, Landroid/view/View;->setPadding(IIII)V

    const/16 v4, 0x10

    move-object/from16 v0, v32

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setGravity(I)V

    const/4 v4, 0x0

    move-object/from16 v0, v32

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v5, -0x1

    const/4 v6, -0x2

    invoke-direct {v4, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/4 v5, 0x0

    iput v5, v4, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    move-object/from16 v0, v32

    invoke-virtual {v0, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v4, 0x1

    move-object/from16 v0, v32

    invoke-virtual {v0, v4}, Landroid/view/View;->setClickable(Z)V

    new-instance v30, Lp00;

    invoke-direct/range {v30 .. v30}, Lp00;-><init>()V

    if-eqz v86, :cond_69

    invoke-virtual/range {p3 .. p3}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_69

    sget v4, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v5, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    div-int/lit16 v5, v5, -0xb86

    add-int/2addr v4, v5

    if-gtz v4, :cond_21

    const/16 v4, 0xa

    sput v4, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    const-string v4, "\u06e8\u06e0\u06e0"

    invoke-static {v4}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_21
    const-string v4, "\u06e0\u06e0\u06e8"

    :goto_18
    invoke-static {v4}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_29
    sget v4, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v5, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    div-int/lit16 v5, v5, -0x12da

    or-int/2addr v4, v5

    if-gtz v4, :cond_22

    invoke-static {}, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢ۠ۨۦ()I

    const-string v4, "\u06e8\u06e8\u06e7"

    invoke-static {v4}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_22
    const-string v4, "\u06e3\u06df\u06e0"

    :goto_19
    invoke-static {v4}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_2a
    if-eqz v16, :cond_34

    const/16 v4, 0x1c

    invoke-static {v4}, Lmp;->q(I)I

    move-result v5

    sget v4, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v6, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    add-int/lit16 v6, v6, -0xb6d

    xor-int/2addr v4, v6

    if-ltz v4, :cond_23

    invoke-static {}, L۟ۤۧۦۢ;->ۣ۟۟ۢ۟()I

    const-string v4, "\u06e3\u06e5\u06e5"

    invoke-static {v4}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    move/from16 v52, v5

    goto/16 :goto_0

    :cond_23
    const-string v4, "\u06e6\u06e0"

    :goto_1a
    invoke-static {v4}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    move/from16 v52, v5

    goto/16 :goto_0

    :sswitch_2b
    move-object/from16 v4, v33

    :cond_24
    sget v5, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v6, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    xor-int/2addr v5, v6

    const v6, 0xda21

    add-int/2addr v5, v6

    move-object/from16 v33, v4

    move/from16 v90, v5

    goto/16 :goto_0

    :sswitch_2c
    move-object/from16 v0, v28

    move-object/from16 v1, v79

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget v4, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v5, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    xor-int/2addr v4, v5

    const v5, 0x1ab949

    add-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_2d
    sget v4, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    if-ltz v4, :cond_25

    const/16 v4, 0x3b

    sput v4, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    const-string v4, "\u06e2\u06e7\u06e5"

    invoke-static {v4}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_25
    sget v4, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v5, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    mul-int/2addr v4, v5

    const v5, -0x1b8359

    xor-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_2e
    const-string v4, "\u06e4\u06e2\u06df"

    invoke-static {v4}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_26
    :sswitch_2f
    sget v4, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v5, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    add-int/lit16 v5, v5, 0x872

    div-int/2addr v4, v5

    if-eqz v4, :cond_27

    const/16 v4, 0x58

    sput v4, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    const-string v4, "\u06e7\u06e4\u06e4"

    move/from16 v5, v41

    goto/16 :goto_5

    :cond_27
    const-string v4, "\u06e4\u06e0\u06e3"

    :goto_1b
    invoke-static {v4}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_28
    :sswitch_30
    sget v4, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v5, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    add-int/lit16 v5, v5, -0x1210

    add-int/2addr v4, v5

    if-ltz v4, :cond_29

    const/16 v4, 0x19

    sput v4, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    const-string v4, "\u06e0\u06e7"

    goto/16 :goto_18

    :cond_29
    const-string v4, "\u06e0\u06e0\u06e6"

    goto/16 :goto_c

    :sswitch_31
    move-object/from16 v0, v23

    move-object/from16 v1, v36

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lkotlinx/coroutines/ۤۢۢۥ;->ۡ۠ۥۡ()I

    move-result v5

    if-ltz v5, :cond_3e

    const-string v5, "\u06e8\u06e3\u06df"

    invoke-static {v5}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v53, v4

    move/from16 v90, v5

    goto/16 :goto_0

    :cond_2a
    :sswitch_32
    const-string v4, "\u06e4\u06e5\u06e2"

    move-object v5, v4

    :goto_1c
    invoke-static {v5}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_33
    invoke-static/range {v66 .. v66}, Lmp;->q(I)I

    move-result v5

    invoke-static {}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۧۧ()I

    move-result v4

    if-ltz v4, :cond_2b

    invoke-static {}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۡۥ۟()I

    const-string v4, "\u06e2\u06e8\u06e1"

    invoke-static {v4}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v65, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_2b
    const-string v4, "\u06e1\u06e7\u06e3"

    move/from16 v6, v66

    :goto_1d
    invoke-static {v4}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v65, v5

    move/from16 v90, v4

    move/from16 v66, v6

    goto/16 :goto_0

    :sswitch_34
    const-string v4, "\u06e1\u06e3\u06e8"

    move-object/from16 v5, v51

    move-object v6, v4

    :goto_1e
    invoke-static {v6}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v51, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_35
    const-string v4, "\u06e1\u06df\u06e5"

    move-object v6, v4

    move/from16 v35, v61

    :goto_1f
    invoke-static {v6}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_36
    const-string v4, "\u06e0\u06e8\u06e6"

    goto/16 :goto_c

    :sswitch_37
    const-string v4, "\u06e2\u06e4\u06e3"

    invoke-static {v4}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_38
    const-string v4, "lZ4Q\n"

    const-string v5, "9P1kv+3eO+U=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, p0

    invoke-static {v4, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v4, "EkGHNX+4P4YD\n"

    const-string v5, "cS7pQR7RUeM=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, p1

    invoke-static {v4, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v4, "sy7AFCI=\n"

    const-string v5, "x0aleUecaRw=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, p2

    invoke-static {v4, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v0, p2

    iget-boolean v6, v0, Lsn;->p:Z

    move-object/from16 v0, p2

    iget v7, v0, Lsn;->f:I

    move-object/from16 v0, p2

    iget v0, v0, Lsn;->e:I

    move/from16 v61, v0

    move-object/from16 v0, p2

    iget-boolean v4, v0, Lsn;->o:Z

    move-object/from16 v0, p2

    iget-boolean v5, v0, Lsn;->n:Z

    move-object/from16 v0, p2

    iget v0, v0, Lsn;->g:I

    move/from16 v27, v0

    const-string v8, "MqkHQA==\n"

    const-string v9, "W8poLhGZg5g=\n"

    const-string v10, "9H1BvQ==\n"

    const-string v11, "mhws2JPS0lg=\n"

    move-object/from16 v0, p3

    invoke-static {v8, v9, v0, v10, v11}, Lg40;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "MNu7\n"

    const-string v10, "W77CLX4i+Js=\n"

    move-object/from16 v0, p4

    move-object/from16 v1, p5

    invoke-static {v0, v8, v9, v10, v1}, Lg40;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v8, "awhxr7IW\n"

    const-string v9, "D20X+dN6Tfg=\n"

    const-string v10, "XzHI\n"

    const-string v11, "PlK8a0jOFaY=\n"

    move-object/from16 v0, p8

    invoke-static {v8, v9, v0, v10, v11}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget v8, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v9, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    or-int/2addr v8, v9

    const v9, 0x1ac528

    add-int/2addr v8, v9

    move/from16 v85, v4

    move/from16 v86, v5

    move/from16 v87, v6

    move/from16 v88, v7

    move/from16 v90, v8

    goto/16 :goto_0

    :sswitch_39
    invoke-static/range {v40 .. v40}, Lmp;->q(I)I

    move-result v5

    sget v4, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v6, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    add-int/lit16 v6, v6, -0x18c4

    sub-int/2addr v4, v6

    if-gtz v4, :cond_2c

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟ۧ۠ۧۢ()I

    const-string v4, "\u06df\u06e4\u06e7"

    :goto_20
    invoke-static {v4}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v42, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_2c
    sget v4, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v6, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    mul-int/2addr v4, v6

    const v6, 0x1a86ea

    xor-int/2addr v4, v6

    move/from16 v42, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_3a
    const-string v4, "\u06df\u06e3\u06e0"

    invoke-static {v4}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_3b
    const-string v4, "cwbEpn5Snw==\n"

    const-string v5, "UDP0k05nrys=\n"

    invoke-static {}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۡۤۥۧ()I

    move-result v6

    if-ltz v6, :cond_2d

    invoke-static {}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۨۧ۟ۤ()I

    :goto_21
    const-string v6, "\u06e8\u06e6\u06e8"

    invoke-static {v6}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v44, v4

    move-object/from16 v45, v5

    move/from16 v90, v6

    goto/16 :goto_0

    :cond_2d
    const-string v6, "\u06df\u06e2\u06e1"

    move-object/from16 v44, v4

    :goto_22
    invoke-static {v6}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v45, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_2e
    :sswitch_3c
    sget v4, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v5, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    add-int/lit16 v5, v5, 0x2d1

    xor-int/2addr v4, v5

    if-ltz v4, :cond_2f

    const/16 v4, 0x51

    sput v4, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    const-string v5, "\u06e1\u06e8\u06e6"

    move-object/from16 v4, v47

    move/from16 v6, v48

    :goto_23
    invoke-static {v5}, Landroidx/appcompat/app/۟۟ۥۨۤ;->ۤۤۡۡ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v47, v4

    move/from16 v48, v6

    move/from16 v90, v5

    goto/16 :goto_0

    :cond_2f
    const-string v5, "\u06e8\u06e1\u06e2"

    move-object/from16 v4, v24

    move/from16 v6, v25

    move/from16 v7, v26

    goto/16 :goto_9

    :sswitch_3d
    const/16 v4, 0x64

    move-object/from16 v0, v77

    invoke-virtual {v0, v4}, Landroid/widget/ProgressBar;->setMax(I)V

    invoke-static/range {p8 .. p8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    move-object/from16 v0, p5

    invoke-static {v0, v4}, Lkn;->b(Ljava/lang/String;I)I

    move-result v4

    move-object/from16 v0, v77

    invoke-virtual {v0, v4}, Landroid/widget/ProgressBar;->setProgress(I)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v5, 0x0

    const/4 v6, -0x2

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-direct {v4, v5, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    move-object/from16 v0, v77

    invoke-virtual {v0, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-static/range {v27 .. v27}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v4

    move-object/from16 v0, v77

    invoke-virtual {v0, v4}, Landroid/widget/ProgressBar;->setProgressTintList(Landroid/content/res/ColorStateList;)V

    invoke-static/range {v27 .. v27}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v4

    move-object/from16 v0, v77

    invoke-virtual {v0, v4}, Landroid/widget/AbsSeekBar;->setThumbTintList(Landroid/content/res/ColorStateList;)V

    new-instance v4, Lzn;

    move-object/from16 v0, v82

    move-object/from16 v1, p5

    move-object/from16 v2, v58

    move-object/from16 v3, v77

    invoke-direct {v4, v0, v1, v2, v3}, Lzn;-><init>(Landroid/widget/TextView;Ljava/lang/String;Lum;Landroid/widget/SeekBar;)V

    move-object/from16 v0, v77

    invoke-virtual {v0, v4}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    move-object/from16 v0, v78

    move-object/from16 v1, v77

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, v78

    move-object/from16 v1, v82

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, v32

    move-object/from16 v1, v78

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-static {}, Lۤۤۥۤ;->۟ۤ۠()I

    move-result v4

    if-gtz v4, :cond_30

    const-string v4, "\u06e3\u06df\u06e0"

    invoke-static {v4}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_30
    sget v4, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v5, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    rem-int/2addr v4, v5

    const v5, 0x1aaec7

    add-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_3e
    sget v4, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v5, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    mul-int/lit16 v5, v5, 0xb40

    div-int/2addr v4, v5

    if-eqz v4, :cond_31

    invoke-static {}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->ۤ۠ۡۧ()I

    const-string v4, "\u06df\u06e4"

    goto/16 :goto_11

    :cond_31
    const-string v4, "\u06e2\u06e6\u06e3"

    invoke-static {v4}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_3f
    invoke-static {}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۦۢۢۢ()I

    move-result v4

    if-gtz v4, :cond_32

    const/16 v4, 0x52

    sput v4, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    const-string v4, "\u06e8\u06e7\u06e7"

    move/from16 v16, v49

    goto/16 :goto_4

    :cond_32
    sget v4, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v5, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    add-int/2addr v4, v5

    const v5, 0x1aa688

    add-int/2addr v4, v5

    move/from16 v16, v49

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_40
    const-string v4, "\u06e1\u06e3\u06e2"

    move-object/from16 v5, v62

    move/from16 v6, v63

    :goto_24
    invoke-static {v4}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v62, v5

    move/from16 v90, v4

    move/from16 v64, v6

    goto/16 :goto_0

    :sswitch_41
    sget v4, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    if-ltz v4, :cond_33

    const-string v4, "\u06e6\u06e1\u06df"

    invoke-static {v4}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠ۡۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_33
    sget v4, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v5, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    add-int/2addr v4, v5

    const v5, 0x1aba62

    xor-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_42
    const/16 v66, 0x2e

    sget v4, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v5, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sub-int/2addr v4, v5

    const v5, 0x1ab543

    add-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_34
    :sswitch_43
    sget v4, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    if-gtz v4, :cond_35

    invoke-static {}, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۡۥ()I

    const-string v4, "\u06e3\u06df\u06e3"

    invoke-static {v4}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_35
    sget v4, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v5, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sub-int/2addr v4, v5

    const v5, 0x1ab583

    add-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_44
    const-string v4, "\u06e0\u06e0\u06e5"

    :goto_25
    invoke-static {v4}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_45
    move-object/from16 v0, v84

    move-object/from16 v1, v38

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    sget v5, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v6, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    add-int/lit16 v6, v6, -0x2582

    xor-int/2addr v5, v6

    if-gtz v5, :cond_36

    const-string v5, "\u06e4\u06e5\u06e0"

    invoke-static {v5}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v80, v4

    move/from16 v90, v5

    goto/16 :goto_0

    :cond_36
    const-string v5, "\u06df\u06e6\u06e6"

    invoke-static {v5}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v80, v4

    move/from16 v90, v5

    goto/16 :goto_0

    :sswitch_46
    move/from16 v4, v50

    :cond_37
    sget v5, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v6, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    xor-int/lit16 v6, v6, -0x10d

    add-int/2addr v5, v6

    if-ltz v5, :cond_38

    invoke-static {}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۤ۟۠ۢ()I

    const-string v6, "\u06e5\u06e4\u06e4"

    move-object/from16 v5, v51

    move/from16 v50, v4

    goto/16 :goto_1e

    :cond_38
    const-string v5, "\u06e6\u06df\u06df"

    move-object v6, v5

    move/from16 v50, v4

    :goto_26
    invoke-static {v6}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_47
    new-instance v5, Landroid/widget/LinearLayout;

    move-object/from16 v0, p0

    invoke-direct {v5, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v4, 0x0

    invoke-virtual {v5, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v4, 0x10

    invoke-virtual {v5, v4}, Landroid/widget/LinearLayout;->setGravity(I)V

    new-instance v4, Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-direct {v4, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    move-object/from16 v0, p8

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v6, 0x41600000    # 14.0f

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setTextSize(F)V

    move/from16 v0, v88

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x8

    invoke-static {v8}, Lmp;->q(I)I

    move-result v8

    const/4 v9, 0x0

    invoke-virtual {v4, v6, v7, v8, v9}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v5, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v4, Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-direct {v4, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v6, "MaQ+\n"

    const-string v7, "3w2QHwzPCp4=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v6, 0x41900000    # 18.0f

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setTextSize(F)V

    if-eqz v87, :cond_6d

    invoke-static {}, Lۤۨۤۨ;->۟ۢۦۣۢ()I

    move-result v6

    if-ltz v6, :cond_6b

    const-string v6, "\u06e5\u06df\u06e4"

    invoke-static {v6}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v68, v4

    move-object/from16 v69, v5

    move/from16 v90, v6

    goto/16 :goto_0

    :sswitch_48
    invoke-static {}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۤ۠ۤۢ()I

    move-result v4

    if-ltz v4, :cond_39

    const-string v4, "\u06df\u06df\u06e2"

    goto/16 :goto_25

    :cond_39
    const-string v4, "\u06e3\u06e2\u06e5"

    invoke-static {v4}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_3a
    :sswitch_49
    sget v4, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    if-gtz v4, :cond_3b

    const-string v4, "\u06e5\u06e3\u06e2"

    move/from16 v5, v52

    goto/16 :goto_1a

    :cond_3b
    const-string v4, "\u06e6\u06e5\u06e3"

    invoke-static {v4}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_4a
    sget v4, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v5, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    div-int/lit16 v5, v5, 0x23df

    mul-int/2addr v4, v5

    if-eqz v4, :cond_3c

    invoke-static {}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۧۧۥۦ()I

    const-string v4, "\u06e2\u06e2\u06df"

    invoke-static {v4}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_3c
    sget v4, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v5, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sub-int/2addr v4, v5

    const v5, 0x1ab9a7

    xor-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_3d
    :sswitch_4b
    const-string v4, "\u06e3\u06e5\u06e8"

    goto/16 :goto_16

    :sswitch_4c
    sget v4, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v5, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    mul-int/lit16 v5, v5, 0x21fa

    or-int/2addr v4, v5

    if-ltz v4, :cond_3f

    invoke-static {}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۡۥ۟()I

    move-object/from16 v4, v53

    move/from16 v34, v35

    :cond_3e
    const-string v5, "\u06e7\u06e0\u06df"

    invoke-static {v5}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v53, v4

    move/from16 v90, v5

    goto/16 :goto_0

    :cond_3f
    const-string v5, "\u06e3\u06e7\u06df"

    move-object/from16 v4, v33

    move/from16 v6, v35

    goto/16 :goto_f

    :sswitch_4d
    move-object/from16 v0, v24

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/high16 v4, 0x42c80000    # 100.0f

    invoke-static {v4}, Lmp;->p(F)F

    move-result v4

    move-object/from16 v0, v24

    invoke-virtual {v0, v4}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    move-object/from16 v0, v24

    invoke-virtual {v15, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    if-eqz v16, :cond_8d

    if-nez v87, :cond_8d

    invoke-virtual {v15}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v17

    const-string v4, "ZwsRLWlgvHVnEQlhK2b9eGgNCWE9bP11ZhBQLzxvsTt9Bw0kaWKzf3sRFCVnZK96eRYUIjotuWlo\nCRwjJWbzXHsfGSgsbalfex8KICtvuA==\n"

    const-string v5, "CX59QUkD3Rs=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, v17

    invoke-static {v4, v0}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۨ۠۟()I

    move-result v4

    if-ltz v4, :cond_40

    const-string v4, "\u06df\u06e7\u06df"

    move/from16 v5, v54

    :goto_27
    invoke-static {v4}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    move/from16 v54, v5

    goto/16 :goto_0

    :cond_40
    const-string v4, "\u06e8\u06df\u06e8"

    :goto_28
    invoke-static {v4}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_4e
    invoke-static {}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۥۧۤ۠()I

    move-result v4

    if-ltz v4, :cond_41

    const-string v4, "\u06e3\u06e3\u06e1"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_41
    const-string v4, "\u06e6\u06e3\u06e1"

    invoke-static {v4}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_4f
    const/4 v4, 0x3

    move/from16 v0, p6

    if-eq v0, v4, :cond_97

    sget v4, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    if-ltz v4, :cond_42

    invoke-static {}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۨ۠۟()I

    const-string v4, "\u06e4\u06e3\u06e0"

    invoke-static {v4}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_42
    sget v4, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v5, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    div-int/2addr v4, v5

    const v5, 0x1ab320

    add-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_50
    sget v4, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v5, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    or-int/2addr v4, v5

    const v5, -0x1abdc7

    xor-int/2addr v4, v5

    move/from16 v90, v4

    move/from16 v52, v89

    goto/16 :goto_0

    :sswitch_51
    move-object/from16 v0, v31

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۨۦ۠ۡ()I

    move-result v4

    if-ltz v4, :cond_43

    const-string v4, "\u06e1\u06e4\u06e0"

    invoke-static {v4}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_43
    const-string v4, "\u06e4\u06e8\u06e2"

    move-object/from16 v5, v55

    :goto_29
    invoke-static {v4}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v55, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_52
    move/from16 v0, p13

    xor-int/lit16 v4, v0, -0x1001

    and-int v4, v4, p13

    if-eqz v4, :cond_67

    sget v4, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    if-gtz v4, :cond_44

    const/16 v4, 0x19

    sput v4, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    const-string v4, "\u06df\u06df\u06e8"

    move-object/from16 v5, v56

    goto :goto_29

    :cond_44
    sget v4, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v5, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sub-int/2addr v4, v5

    const v5, 0x1ab6c0

    xor-int/2addr v4, v5

    move-object/from16 v55, v56

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_53
    sget v4, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v5, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    rem-int/lit16 v5, v5, -0x2a2

    sub-int/2addr v4, v5

    if-gtz v4, :cond_45

    const-string v4, "\u06e8\u06e3\u06e1"

    :goto_2a
    invoke-static {v4}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_45
    const-string v4, "\u06e0\u06e2\u06e0"

    invoke-static {v4}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_54
    const/16 v49, 0x0

    sget v4, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    if-ltz v4, :cond_46

    const/16 v4, 0x8

    sput v4, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    const-string v4, "\u06e2\u06e4\u06df"

    invoke-static {v4}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_46
    sget v4, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v5, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    rem-int/2addr v4, v5

    const v5, 0x1abde0

    add-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_55
    const/16 v60, 0x0

    sget v4, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sget v5, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    add-int/lit16 v5, v5, -0x1ba3

    or-int/2addr v4, v5

    if-ltz v4, :cond_47

    const-string v4, "\u06e7\u06e0\u06e8"

    invoke-static {v4}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_47
    sget v4, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v5, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    or-int/2addr v4, v5

    const v5, 0x1aabb6

    add-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_56
    move-object/from16 v0, v76

    move-object/from16 v1, v83

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    sget v5, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v6, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    xor-int/lit16 v6, v6, 0x1edc

    or-int/2addr v5, v6

    if-ltz v5, :cond_48

    const/16 v5, 0x22

    sput v5, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    const-string v5, "\u06e2\u06e8"

    invoke-static {v5}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v81, v4

    move/from16 v90, v5

    goto/16 :goto_0

    :cond_48
    sget v5, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v6, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    mul-int/2addr v5, v6

    const v6, 0x1414c9

    add-int/2addr v5, v6

    move-object/from16 v81, v4

    move/from16 v90, v5

    goto/16 :goto_0

    :sswitch_57
    sget v4, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v5, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    add-int/lit16 v5, v5, -0x6a6

    xor-int/2addr v4, v5

    if-gtz v4, :cond_49

    const/16 v4, 0x16

    sput v4, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    move-object/from16 v4, v57

    move/from16 v5, v59

    :goto_2b
    const-string v6, "\u06e2\u06e1"

    move-object/from16 v58, v4

    move/from16 v59, v5

    goto/16 :goto_1f

    :cond_49
    const-string v4, "\u06e3\u06e2\u06e5"

    invoke-static {v4}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v58, v57

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_58
    invoke-static {}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۦۥۨۦ()I

    move-result v4

    if-ltz v4, :cond_4a

    invoke-static {}, Landroid/app/۟ۡۧۦۡ;->ۥۣۨۧ()I

    const-string v4, "\u06e2\u06e2\u06e5"

    :goto_2c
    invoke-static {v4}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_4a
    sget v4, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v5, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    div-int/2addr v4, v5

    const v5, 0x1aba5f

    add-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_59
    const/high16 v4, 0x41380000    # 11.5f

    move-object/from16 v0, v79

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextSize(F)V

    move-object/from16 v0, v79

    move/from16 v1, v88

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    invoke-static {v5}, Lmp;->q(I)I

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v0, v79

    invoke-virtual {v0, v4, v5, v6, v7}, Landroid/widget/TextView;->setPadding(IIII)V

    const v4, 0x3c23d70a    # 0.01f

    move-object/from16 v0, v79

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setLetterSpacing(F)V

    const/4 v4, 0x0

    move-object/from16 v0, v79

    move-object/from16 v1, v29

    invoke-virtual {v0, v1, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۨۦ۠ۡ()I

    move-result v4

    if-ltz v4, :cond_4b

    const/16 v4, 0x43

    sput v4, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    const-string v4, "\u06e1\u06e3\u06e2"

    invoke-static {v4}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_4b
    sget v4, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v5, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    mul-int/2addr v4, v5

    const v5, 0x199973

    add-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_4c
    move-object/from16 v18, v4

    move-object/from16 v19, v5

    :sswitch_5a
    sget v4, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v5, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    or-int/lit16 v5, v5, 0x42e

    sub-int/2addr v4, v5

    if-ltz v4, :cond_4d

    const-string v4, "\u06e7\u06e2\u06e2"

    goto/16 :goto_c

    :cond_4d
    const-string v4, "\u06e7\u06e6\u06e1"

    goto/16 :goto_e

    :sswitch_5b
    const-string v4, "\u06df\u06e8\u06e3"

    invoke-static {v4}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_5c
    move-object/from16 v0, v68

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    sget v4, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v5, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    mul-int/2addr v4, v5

    const v5, 0x8754b

    sub-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_5d
    sget v4, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v5, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    xor-int/2addr v4, v5

    const v5, 0x1aaaa2

    add-int/2addr v4, v5

    move-object/from16 v57, p10

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_4e
    :sswitch_5e
    sget v4, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    if-ltz v4, :cond_4f

    const/16 v4, 0x58

    sput v4, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    const-string v4, "\u06e7\u06e2\u06e1"

    goto/16 :goto_10

    :cond_4f
    sget v4, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v5, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    rem-int/2addr v4, v5

    const v5, 0x1aba2e

    add-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_5f
    const/16 v4, 0x10

    invoke-static {v4}, Lmp;->q(I)I

    move-result v46

    invoke-static {}, Lcom/google/android/material/datepicker/ۨۧۤ;->۠ۤ۠ۧ()I

    move-result v4

    if-ltz v4, :cond_50

    const-string v4, "\u06e3\u06e1\u06e8"

    invoke-static {v4}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_50
    sget v4, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v5, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    or-int/2addr v4, v5

    const v5, 0x1aaf7f

    add-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_60
    sget v4, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v5, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    mul-int/2addr v4, v5

    const v5, -0x1322ab

    xor-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_61
    const-string v4, "\u06e7\u06e2"

    :goto_2d
    invoke-static {v4}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_62
    invoke-static {}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟۠ۢۢ۠()I

    move-result v4

    if-ltz v4, :cond_51

    const/16 v4, 0x19

    sput v4, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    const-string v4, "\u06e6\u06e4"

    invoke-static {v4}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    move/from16 v39, v46

    goto/16 :goto_0

    :cond_51
    move-object/from16 v4, v44

    move-object/from16 v5, v45

    move/from16 v39, v46

    goto/16 :goto_21

    :cond_52
    :sswitch_63
    const-string v4, "\u06e4\u06e5\u06e1"

    :goto_2e
    invoke-static {v4}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_64
    invoke-static/range {v64 .. v64}, Lmp;->p(F)F

    move-result v5

    sget v4, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v6, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    or-int/lit16 v6, v6, -0x167d

    sub-int/2addr v4, v6

    if-gtz v4, :cond_53

    const-string v4, "\u06e4\u06e8\u06e2"

    invoke-static {v4}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    move/from16 v91, v5

    goto/16 :goto_0

    :cond_53
    sget v4, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v6, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sub-int/2addr v4, v6

    const v6, 0x1ac4cd

    add-int/2addr v4, v6

    move/from16 v90, v4

    move/from16 v91, v5

    goto/16 :goto_0

    :cond_54
    :sswitch_65
    invoke-static {}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۢۧۥ()I

    move-result v4

    if-ltz v4, :cond_55

    const/16 v4, 0x5d

    sput v4, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    const-string v4, "\u06e5\u06e0\u06e8"

    goto/16 :goto_6

    :cond_55
    const-string v7, "\u06e5\u06e0\u06e6"

    move-object/from16 v4, v30

    move-object/from16 v5, v31

    move-object/from16 v6, v32

    goto/16 :goto_d

    :sswitch_66
    invoke-static/range {v80 .. v80}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    invoke-static {v14, v4}, Lc0;->x(Landroid/view/View;I)V

    sget v4, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    if-ltz v4, :cond_82

    const-string v4, "\u06e6\u06e3\u06e1"

    invoke-static {v4}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_67
    invoke-static {}, Landroidx/core/content/ۣۧۡۤ;->۟ۦۦ۠ۡ()I

    move-result v4

    if-ltz v4, :cond_56

    const/16 v4, 0x48

    sput v4, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    const-string v4, "\u06e5\u06e0\u06e6"

    goto/16 :goto_2d

    :cond_56
    const-string v4, "\u06e3\u06e1\u06e8"

    goto/16 :goto_19

    :sswitch_68
    move-object/from16 v4, v17

    check-cast v4, Landroid/graphics/drawable/GradientDrawable;

    const/4 v5, 0x1

    invoke-static {v5}, Lmp;->q(I)I

    move-result v5

    const-string v6, "fgB+TO3w+vFt\n"

    const-string v7, "XTFLfN3AysE=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v4, v5, v6}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    sget v4, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v5, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    rem-int/2addr v4, v5

    const v5, 0x1aca1d

    add-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_69
    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۤ۟ۦ۟()I

    move-result v4

    if-ltz v4, :cond_57

    invoke-static {}, Landroidx/legacy/content/ۧۡ۠۠;->ۥۧۡۦ()I

    const-string v4, "\u06e5\u06e0\u06e2"

    move-object/from16 v5, v62

    move/from16 v6, v64

    goto/16 :goto_24

    :cond_57
    const-string v4, "\u06e3\u06e7\u06e2"

    goto/16 :goto_19

    :sswitch_6a
    sget v4, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    if-ltz v4, :cond_58

    invoke-static {}, Landroid/app/۟ۡۧۦۡ;->ۥۣۨۧ()I

    const-string v4, "\u06e0\u06e1"

    move/from16 v5, v65

    move/from16 v6, v41

    goto/16 :goto_1d

    :cond_58
    sget v4, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v5, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    mul-int/2addr v4, v5

    const v5, 0x1b41b7

    add-int/2addr v4, v5

    move/from16 v90, v4

    move/from16 v66, v41

    goto/16 :goto_0

    :sswitch_6b
    move-object/from16 v0, v32

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    if-eqz p6, :cond_94

    const/4 v4, 0x1

    move/from16 v0, p6

    if-eq v0, v4, :cond_2e

    const/4 v4, 0x2

    move/from16 v0, p6

    if-eq v0, v4, :cond_96

    sget v4, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v5, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    div-int/2addr v4, v5

    const v5, 0x1aa75e

    add-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_6c
    invoke-static {}, Landroidx/activity/ۣۢۦۨ;->۟ۦۣ۠ۢ()I

    move-result v4

    if-gtz v4, :cond_59

    const/16 v4, 0x23

    sput v4, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    const-string v4, "\u06e2\u06e7\u06e2"

    invoke-static {v4}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_59
    const-string v4, "\u06e6\u06e0\u06e6"

    :goto_2f
    invoke-static {v4}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_6d
    move-object/from16 v4, v24

    move/from16 v6, v25

    :cond_5a
    sget v5, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v7, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sub-int/2addr v5, v7

    const v7, 0x1ac265

    add-int/2addr v5, v7

    move-object/from16 v24, v4

    move/from16 v25, v6

    move/from16 v90, v5

    goto/16 :goto_0

    :sswitch_6e
    const/16 v56, 0x0

    move/from16 v0, p13

    xor-int/lit16 v4, v0, -0x401

    and-int v4, v4, p13

    if-eqz v4, :cond_77

    const/16 v58, 0x0

    invoke-static {}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟ۧ۟ۥۧ()I

    move-result v4

    if-gtz v4, :cond_5b

    const-string v4, "\u06e3\u06e6\u06e6"

    invoke-static {v4}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_5b
    sget v4, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v5, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    or-int/2addr v4, v5

    const v5, 0x1ab427

    add-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_6f
    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟ۧ۠ۧۢ()I

    move-result v4

    if-ltz v4, :cond_5c

    const/16 v4, 0x39

    sput v4, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    const-string v4, "\u06e4\u06e6\u06df"

    invoke-static {v4}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    move/from16 v43, v25

    goto/16 :goto_0

    :cond_5c
    const-string v4, "\u06e4\u06e0\u06e1"

    move-object v6, v4

    move/from16 v43, v25

    goto/16 :goto_26

    :sswitch_70
    invoke-static {}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۟۟۟ۢ()I

    move-result v4

    if-gtz v4, :cond_5d

    const/16 v4, 0x13

    sput v4, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    const-string v4, "\u06e3\u06df\u06e2"

    move/from16 v26, v43

    goto :goto_2f

    :cond_5d
    const-string v4, "\u06e0\u06e2\u06e0"

    move/from16 v5, v42

    move/from16 v26, v43

    goto/16 :goto_20

    :sswitch_71
    sget v4, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v5, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    or-int/lit16 v5, v5, 0x11d0

    div-int/2addr v4, v5

    if-eqz v4, :cond_5e

    const/16 v4, 0x39

    sput v4, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    const-string v4, "\u06e8\u06e3\u06e5"

    invoke-static {v4}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_5e
    const-string v5, "\u06e5\u06e8\u06e5"

    move-object/from16 v4, v24

    move/from16 v6, v25

    move/from16 v7, v26

    goto/16 :goto_9

    :sswitch_72
    :try_start_0
    const-string v4, "gV5LCe4WiHaVVEVP4widN4Y=\n"

    const-string v5, "4jEmJ4J88Fg=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x3

    move-object/from16 v0, p0

    invoke-virtual {v0, v4, v5}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v4

    const-string v5, "fsC8j12BSExii6WSQw==\n"

    const-string v6, "DKXR5iXoKyM=\n"

    invoke-static {v5, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v4

    sput-object v4, Lbo;->a:Landroid/graphics/Typeface;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sget v4, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v5, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    div-int/lit16 v5, v5, -0x1392

    mul-int/2addr v4, v5

    if-eqz v4, :cond_5f

    const-string v4, "\u06e3\u06e6\u06e5"

    move-object/from16 v5, v67

    goto/16 :goto_8

    :cond_5f
    const-string v4, "\u06e6\u06e5\u06e3"

    invoke-static {v4}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_73
    sget v4, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    if-gtz v4, :cond_60

    invoke-static {}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۨۧ۟ۤ()I

    const-string v4, "\u06df\u06e7"

    invoke-static {v4}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v55, v74

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_60
    const-string v4, "\u06e7\u06e4\u06e0"

    move-object/from16 v55, v74

    :goto_30
    invoke-static {v4}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_74
    sget v4, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v5, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    or-int/lit16 v5, v5, 0xa95

    xor-int/2addr v4, v5

    if-ltz v4, :cond_61

    const-string v4, "\u06e5\u06e6"

    invoke-static {v4}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_61
    sget v4, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v5, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    div-int/2addr v4, v5

    const v5, 0x1ab6ac

    add-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_75
    new-instance v14, Landroid/view/View;

    move-object/from16 v0, p0

    invoke-direct {v14, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    move/from16 v0, v42

    move/from16 v1, v42

    invoke-direct {v4, v0, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const v5, 0x800013

    iput v5, v4, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    move/from16 v0, v72

    iput v0, v4, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    invoke-virtual {v14, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v5, -0x1

    invoke-virtual {v4, v5}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/high16 v5, 0x42c80000    # 100.0f

    invoke-static {v5}, Lmp;->p(F)F

    move-result v5

    invoke-virtual {v4, v5}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v14, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    if-eqz v16, :cond_37

    const/high16 v63, 0x40c00000    # 6.0f

    sget v5, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v6, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    xor-int/lit16 v6, v6, 0x2132

    xor-int/2addr v5, v6

    if-gtz v5, :cond_62

    const/16 v5, 0x58

    sput v5, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    const-string v5, "\u06e3\u06e4\u06e2"

    invoke-static {v5}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v50, v4

    move/from16 v90, v5

    goto/16 :goto_0

    :cond_62
    const-string v5, "\u06e8\u06e8\u06e6"

    invoke-static {v5}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v50, v4

    move/from16 v90, v5

    goto/16 :goto_0

    :sswitch_76
    sget v4, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    if-ltz v4, :cond_63

    const/16 v4, 0x2d

    sput v4, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    const-string v4, "\u06e4\u06e4\u06e6"

    invoke-static {v4}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_63
    sget v4, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v5, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sub-int/2addr v4, v5

    const v5, 0x1aaa2a

    add-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_64
    :sswitch_77
    sget v4, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v5, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    xor-int/lit16 v5, v5, 0x1be5

    rem-int/2addr v4, v5

    if-ltz v4, :cond_65

    invoke-static {}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۨۧ۟ۤ()I

    const-string v4, "\u06e8\u06e4\u06e1"

    invoke-static {v4}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_65
    sget v4, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v5, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    rem-int/2addr v4, v5

    const v5, 0x1ac84b

    add-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_78
    sget v4, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v5, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    mul-int/lit16 v5, v5, 0xfa4

    add-int/2addr v4, v5

    if-gtz v4, :cond_66

    invoke-static {}, Landroidx/core/widget/۟ۡۦۢۥ;->ۡۧۡۦ()I

    const-string v4, "\u06e4\u06e2\u06df"

    invoke-static {v4}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v84, v37

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_66
    sget v4, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v5, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    xor-int/2addr v4, v5

    const v5, 0x1aa383

    add-int/2addr v4, v5

    move-object/from16 v84, v37

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_67
    :sswitch_79
    invoke-static {}, Landroid/window/ۣۤ۠ۢ;->ۧۢۦ۟()I

    move-result v4

    if-gtz v4, :cond_68

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۥۣ۠ۦ()I

    const-string v4, "\u06e6\u06e3"

    invoke-static {v4}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_68
    const-string v4, "\u06e6\u06e5\u06e1"

    goto/16 :goto_e

    :sswitch_7a
    move/from16 v0, v59

    invoke-virtual {v14, v0}, Landroid/view/View;->setTranslationX(F)V

    invoke-virtual {v15, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v11, Ll00;

    invoke-direct {v11}, Ll00;-><init>()V

    move/from16 v0, v48

    iput-boolean v0, v11, Ll00;->a:Z

    new-instance v10, Ll00;

    invoke-direct {v10}, Ll00;-><init>()V

    new-instance v12, Lo00;

    invoke-direct {v12}, Lo00;-><init>()V

    new-instance v13, Lp00;

    invoke-direct {v13}, Lp00;-><init>()V

    new-instance v4, Lrl;

    invoke-direct {v4, v13, v14}, Lrl;-><init>(Lp00;Landroid/view/View;)V

    invoke-virtual {v15, v4}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    new-instance v4, Lxn;

    move/from16 v5, v71

    move/from16 v6, v25

    move/from16 v7, v42

    move-object/from16 v8, v47

    move-object/from16 v9, p2

    invoke-direct/range {v4 .. v16}, Lxn;-><init>(FIILd6;Lsn;Ll00;Ll00;Lo00;Lp00;Landroid/view/View;Landroid/widget/FrameLayout;Z)V

    invoke-virtual {v15, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    if-eqz v16, :cond_64

    new-instance v4, Lyn;

    move/from16 v5, v71

    move/from16 v6, v42

    move/from16 v7, v25

    move-object/from16 v8, v47

    move-object/from16 v9, p2

    invoke-direct/range {v4 .. v16}, Lyn;-><init>(FIILd6;Lsn;Ll00;Ll00;Lo00;Lp00;Landroid/view/View;Landroid/widget/FrameLayout;Z)V

    invoke-virtual {v15, v4}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    const-string v4, "\u06e0\u06e5\u06e6"

    goto/16 :goto_11

    :cond_69
    :sswitch_7b
    move-object/from16 v4, v30

    move-object/from16 v5, v31

    move-object/from16 v6, v32

    invoke-static {}, Lcom/google/android/material/datepicker/ۨۧۤ;->۠ۤ۠ۧ()I

    move-result v7

    if-ltz v7, :cond_6a

    const/16 v7, 0xd

    sput v7, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    const-string v7, "\u06e1\u06e1\u06e1"

    invoke-static {v7}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v30, v4

    move-object/from16 v31, v5

    move-object/from16 v32, v6

    move/from16 v90, v7

    goto/16 :goto_0

    :cond_6a
    const-string v7, "\u06e0\u06e2\u06e4"

    goto/16 :goto_d

    :sswitch_7c
    sget v4, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v5, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    add-int/lit16 v5, v5, -0xbb3

    div-int/2addr v4, v5

    if-eqz v4, :cond_6c

    move-object/from16 v4, v68

    move-object/from16 v5, v69

    move/from16 v40, v70

    :cond_6b
    const-string v6, "\u06e0\u06e1\u06e4"

    invoke-static {v6}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v68, v4

    move-object/from16 v69, v5

    move/from16 v90, v6

    goto/16 :goto_0

    :cond_6c
    sget v4, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    sget v5, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    xor-int/2addr v4, v5

    const v5, 0x1ab405

    add-int/2addr v4, v5

    move/from16 v90, v4

    move/from16 v40, v70

    goto/16 :goto_0

    :sswitch_7d
    move-object/from16 v4, v68

    move-object/from16 v5, v69

    :cond_6d
    sget v6, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v7, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    add-int/lit16 v7, v7, 0xa4f

    div-int/2addr v6, v7

    if-eqz v6, :cond_6e

    invoke-static {}, Landroidx/legacy/content/ۧۡ۠۠;->ۥۧۡۦ()I

    const-string v6, "\u06e6\u06e4\u06e8"

    move-object/from16 v68, v4

    move-object/from16 v69, v5

    goto/16 :goto_26

    :cond_6e
    sget v6, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v7, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    rem-int/2addr v6, v7

    const v7, -0x1ab683

    xor-int/2addr v6, v7

    move-object/from16 v68, v4

    move-object/from16 v69, v5

    move/from16 v90, v6

    goto/16 :goto_0

    :sswitch_7e
    sget v4, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v5, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    add-int/2addr v4, v5

    const v5, 0x1aad5e

    add-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_7f
    sget v4, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    if-gtz v4, :cond_6f

    const-string v4, "\u06e8\u06e1\u06e1"

    :goto_31
    invoke-static {v4}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_6f
    const-string v4, "\u06e3\u06e6\u06e6"

    goto/16 :goto_11

    :sswitch_80
    invoke-static {}, Lio/fastkv/ۣ۟ۧۦۡ;->ۥۥۤۥ()I

    move-result v4

    if-ltz v4, :cond_70

    const-string v4, "\u06e6\u06df\u06e5"

    :goto_32
    invoke-static {v4}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_70
    const-string v4, "\u06e2\u06e1"

    goto/16 :goto_2a

    :sswitch_81
    const-string v4, "\u06e5\u06e8\u06e5"

    move-object/from16 v5, v75

    :goto_33
    invoke-static {v4}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v76, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_82
    invoke-virtual/range {v18 .. v19}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    sget v4, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    if-gtz v4, :cond_71

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟ۡۡۦ()I

    const-string v4, "\u06e4\u06e0\u06e1"

    invoke-static {v4}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_71
    sget v4, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v5, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    mul-int/2addr v4, v5

    const v5, 0x18765c

    xor-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_83
    move-object/from16 v0, v18

    move/from16 v1, v73

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v5, 0x22

    invoke-static {v5}, Lmp;->q(I)I

    move-result v5

    const/16 v6, 0x22

    invoke-static {v6}, Lmp;->q(I)I

    move-result v6

    invoke-direct {v4, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v5, 0x10

    invoke-static {v5}, Lmp;->q(I)I

    move-result v5

    iput v5, v4, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    move-object/from16 v0, v18

    invoke-virtual {v0, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    move-object/from16 v0, v18

    move-object/from16 v1, v30

    iput-object v0, v1, Lp00;->b:Ljava/lang/Object;

    sget v4, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v5, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    add-int/lit16 v5, v5, 0xba2

    sub-int/2addr v4, v5

    if-ltz v4, :cond_72

    const-string v4, "\u06e0\u06e4\u06e2"

    invoke-static {v4}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_72
    sget v4, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v5, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    xor-int/2addr v4, v5

    const v5, -0x1ac2b9

    xor-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_84
    move/from16 v0, v91

    invoke-virtual {v14, v0}, Landroid/view/View;->setElevation(F)V

    const/16 v4, 0x1c

    move/from16 v0, v50

    if-lt v0, v4, :cond_1b

    if-eqz v87, :cond_2a

    const-string v22, "ZD+xvTfNWw==\n"

    const-string v36, "Rw+BjQf9a9s=\n"

    sget v4, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    if-gtz v4, :cond_73

    const/16 v4, 0x45

    sput v4, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    const-string v4, "\u06e3\u06e3\u06e6"

    invoke-static {v4}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_73
    sget v4, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v5, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    or-int/2addr v4, v5

    const v5, -0x1abedf

    xor-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_85
    sget v4, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    if-ltz v4, :cond_74

    const-string v4, "\u06e2\u06e4\u06e8"

    move/from16 v59, v60

    goto/16 :goto_3

    :cond_74
    move-object/from16 v4, v58

    move/from16 v5, v60

    goto/16 :goto_2b

    :sswitch_86
    sget v4, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v5, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    xor-int/lit16 v5, v5, -0x4a0

    div-int/2addr v4, v5

    if-eqz v4, :cond_75

    const-string v4, "\u06e8\u06e4\u06e0"

    invoke-static {v4}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v21, v67

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_75
    const-string v4, "\u06e2\u06e4\u06e3"

    move-object/from16 v21, v67

    goto/16 :goto_31

    :sswitch_87
    new-instance v4, Lya;

    const/4 v5, 0x2

    invoke-direct {v4, v5, v15}, Lya;-><init>(ILjava/lang/Object;)V

    move-object/from16 v0, v32

    invoke-virtual {v0, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۦۢۢۢ()I

    move-result v4

    if-gtz v4, :cond_76

    invoke-static {}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۟ۦۣۣۧ()I

    const-string v4, "\u06e7\u06e0\u06e6"

    invoke-static {v4}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_76
    sget v4, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v5, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    xor-int/2addr v4, v5

    const v5, 0x1aba9e

    xor-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_88
    const-string v4, "\u06df\u06e2\u06e2"

    goto/16 :goto_10

    :cond_77
    :sswitch_89
    sget v4, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v5, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    mul-int/lit16 v5, v5, -0x1836

    add-int/2addr v4, v5

    if-ltz v4, :cond_78

    const/16 v4, 0x2d

    sput v4, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    const-string v4, "\u06e1\u06df"

    goto/16 :goto_19

    :cond_78
    const-string v4, "\u06e2\u06e4\u06df"

    goto/16 :goto_19

    :sswitch_8a
    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۢ۠۟ۨ()I

    move-result v4

    if-ltz v4, :cond_79

    invoke-static {}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۟ۦۣۣۧ()I

    goto/16 :goto_15

    :cond_79
    const-string v4, "\u06e0\u06e5\u06e4"

    move-object v5, v4

    :goto_34
    invoke-static {v5}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_8b
    const-string v23, "kRQNvFF/iGeC\n"

    const-string v5, "siE9jGFPuFc=\n"

    const-string v4, "\u06df\u06e6\u06e7"

    goto/16 :goto_12

    :sswitch_8c
    sget v4, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    if-ltz v4, :cond_7a

    const/16 v4, 0xc

    sput v4, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    const-string v4, "\u06e6\u06e6\u06e5"

    invoke-static {v4}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_7a
    sget v4, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v5, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    or-int/2addr v4, v5

    const v5, -0x1ab8c2

    xor-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_8d
    move-object/from16 v0, v62

    move-object/from16 v1, v45

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    sget v5, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v6, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    div-int/lit16 v6, v6, -0x216c

    add-int/2addr v5, v6

    if-gtz v5, :cond_7b

    const-string v5, "\u06e5\u06e6\u06e2"

    invoke-static {v5}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v51, v4

    move/from16 v90, v5

    goto/16 :goto_0

    :cond_7b
    const-string v6, "\u06e2\u06e8\u06e1"

    move-object v5, v4

    goto/16 :goto_1e

    :sswitch_8e
    sget v4, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v5, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    mul-int/lit16 v5, v5, -0x11c0

    rem-int/2addr v4, v5

    if-gtz v4, :cond_7c

    const-string v4, "\u06e6\u06e3\u06e6"

    invoke-static {v4}, Landroidx/appcompat/app/۟۟ۥۨۤ;->ۤۤۡۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_7c
    const-string v4, "\u06e6\u06e2\u06e8"

    goto/16 :goto_16

    :sswitch_8f
    const/16 v4, 0x1a

    invoke-static {v4}, Lmp;->q(I)I

    move-result v4

    sget v5, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v6, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    mul-int/2addr v5, v6

    const v6, 0x1c46f5

    add-int/2addr v5, v6

    move/from16 v89, v4

    move/from16 v90, v5

    goto/16 :goto_0

    :sswitch_90
    const-string v76, "ZWbfhS5XBQ==\n"

    const-string v4, "RiPmwBcSRCg=\n"

    sget v5, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v6, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    add-int/lit16 v6, v6, -0x6cb

    div-int/2addr v5, v6

    if-eqz v5, :cond_7d

    invoke-static {}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣۢ۠۠()I

    const-string v5, "\u06e2\u06e1\u06e1"

    invoke-static {v5}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v83, v4

    move/from16 v90, v5

    goto/16 :goto_0

    :cond_7d
    sget v5, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v6, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    xor-int/2addr v5, v6

    const v6, 0x1ab19e

    add-int/2addr v5, v6

    move-object/from16 v83, v4

    move/from16 v90, v5

    goto/16 :goto_0

    :sswitch_91
    sget v4, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v5, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    mul-int/2addr v4, v5

    const v5, 0x180a70

    add-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_92
    move-object/from16 v4, v47

    move/from16 v6, v48

    :cond_7e
    sget v5, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    if-gtz v5, :cond_7f

    invoke-static {}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣۤۧۥ()I

    const-string v5, "\u06e8\u06e6\u06e5"

    move-object/from16 v47, v4

    move/from16 v48, v6

    goto/16 :goto_1c

    :cond_7f
    const-string v5, "\u06e1\u06e4\u06e0"

    goto/16 :goto_23

    :sswitch_93
    const-string v4, "8GxUQs+bLkLj\n"

    const-string v38, "019kcv+rHnI=\n"

    sget v5, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v6, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    or-int/lit16 v6, v6, 0x25d7

    div-int/2addr v5, v6

    if-eqz v5, :cond_80

    invoke-static {}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۤ۟۠ۢ()I

    const-string v5, "\u06e1\u06e8\u06e3"

    invoke-static {v5}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v84, v4

    move/from16 v90, v5

    goto/16 :goto_0

    :cond_80
    sget v5, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v6, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    mul-int/2addr v5, v6

    const v6, 0x1bd5fe

    xor-int/2addr v5, v6

    move-object/from16 v84, v4

    move/from16 v90, v5

    goto/16 :goto_0

    :sswitch_94
    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣۣ۟ۡ()I

    move-result v4

    if-gtz v4, :cond_81

    invoke-static {}, Landroidx/core/app/ۡۤۡ۠;->ۨۥۨۧ()I

    const-string v4, "\u06df\u06e2\u06e5"

    invoke-static {v4}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_81
    const-string v4, "\u06e0\u06e7\u06e3"

    :goto_35
    invoke-static {v4}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_95
    sget v4, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sget v5, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    xor-int/lit16 v5, v5, -0xa1a

    xor-int/2addr v4, v5

    if-ltz v4, :cond_83

    :cond_82
    const-string v4, "\u06e5\u06df\u06df"

    invoke-static {v4}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_83
    const-string v4, "\u06e7\u06e7\u06e4"

    goto/16 :goto_32

    :cond_84
    :sswitch_96
    sget v4, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v5, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    add-int/lit16 v5, v5, 0x16ab

    div-int/2addr v4, v5

    if-eqz v4, :cond_85

    const-string v4, "\u06e7\u06e8\u06e3"

    invoke-static {v4}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_85
    const-string v4, "\u06e1\u06e1\u06e5"

    move-object v6, v4

    goto/16 :goto_26

    :sswitch_97
    const-string v62, "jvbot3EiXg==\n"

    const-string v45, "rbXY9EFhbqE=\n"

    sget v4, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v5, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    mul-int/lit16 v5, v5, 0x16c8

    add-int/2addr v4, v5

    if-ltz v4, :cond_86

    invoke-static {}, Lۤۨۤۨ;->۟ۢۦۣۢ()I

    const-string v4, "\u06e4\u06e0\u06e6"

    invoke-static {v4}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_86
    sget v4, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v5, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    mul-int/2addr v4, v5

    const v5, 0x18b69f

    xor-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_98
    const v5, 0x3f733333    # 0.95f

    sget v4, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    if-ltz v4, :cond_87

    invoke-static {}, Landroidx/activity/۟ۥۥۧ۠;->۟ۥۥۤ۟()I

    const-string v4, "\u06e4\u06e5\u06e2"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    move/from16 v54, v5

    goto/16 :goto_0

    :cond_87
    const-string v4, "\u06e8\u06e4\u06e5"

    goto/16 :goto_27

    :sswitch_99
    if-eqz v48, :cond_26

    sget v4, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    if-gtz v4, :cond_88

    const/16 v4, 0x26

    sput v4, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    const-string v4, "\u06e4\u06e4\u06df"

    move-object v6, v4

    move-object/from16 v5, v45

    move/from16 v59, v71

    goto/16 :goto_22

    :cond_88
    sget v4, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v5, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    xor-int/2addr v4, v5

    const v5, 0x1aba9d

    add-int/2addr v4, v5

    move/from16 v90, v4

    move/from16 v59, v71

    goto/16 :goto_0

    :sswitch_9a
    move/from16 v4, v72

    :cond_89
    sget v5, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    if-ltz v5, :cond_8a

    const/16 v5, 0x1b

    sput v5, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    const-string v5, "\u06e7\u06e5\u06e0"

    move/from16 v72, v4

    goto/16 :goto_34

    :cond_8a
    sget v5, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v6, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    xor-int/2addr v5, v6

    const v6, -0x1aa7a3

    xor-int/2addr v5, v6

    move/from16 v72, v4

    move/from16 v90, v5

    goto/16 :goto_0

    :sswitch_9b
    move-object/from16 v0, v32

    invoke-virtual {v0, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget v4, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    sget v5, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    or-int/lit16 v5, v5, 0xa24

    or-int/2addr v4, v5

    if-ltz v4, :cond_8c

    const/16 v4, 0x17

    sput v4, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    move/from16 v4, v73

    :cond_8b
    const-string v5, "\u06e8\u06e5"

    invoke-static {v5}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v90, v5

    move/from16 v73, v4

    goto/16 :goto_0

    :cond_8c
    const-string v4, "\u06e3\u06e2"

    goto/16 :goto_2d

    :cond_8d
    :sswitch_9c
    sget v4, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v5, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    add-int/lit16 v5, v5, -0x587

    or-int/2addr v4, v5

    if-ltz v4, :cond_8e

    const-string v4, "\u06e0\u06e4\u06e8"

    invoke-static {v4}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_8e
    const-string v4, "\u06e8\u06e0\u06df"

    move-object v6, v4

    goto/16 :goto_26

    :sswitch_9d
    move-object/from16 v0, v32

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v4, "\u06e0\u06e2\u06e4"

    invoke-static {v4}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_9e
    sget v4, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v5, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    xor-int/2addr v4, v5

    const v5, 0x1abd7a

    xor-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_9f
    move-object/from16 v0, v18

    move/from16 v1, v34

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v4, 0x41b00000    # 22.0f

    move-object/from16 v0, v18

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextSize(F)V

    if-eqz v85, :cond_54

    const/high16 v4, 0x3f800000    # 1.0f

    sget v5, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v6, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    or-int/lit16 v6, v6, 0x1e0

    rem-int/2addr v5, v6

    if-gtz v5, :cond_8b

    const-string v5, "\u06e1\u06e4\u06e4"

    invoke-static {v5}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v90, v5

    move/from16 v73, v4

    goto/16 :goto_0

    :sswitch_a0
    move-object/from16 v0, v69

    move-object/from16 v1, v68

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, v32

    move-object/from16 v1, v69

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v4, Ly5;

    new-instance v5, Lo00;

    invoke-direct {v5}, Lo00;-><init>()V

    const/4 v6, 0x3

    move-object/from16 v0, v21

    invoke-direct {v4, v5, v6, v0}, Ly5;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    move-object/from16 v0, v32

    invoke-virtual {v0, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sget v4, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v5, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sub-int/2addr v4, v5

    const v5, 0x1ab4f1

    xor-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_a1
    invoke-static {}, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢ۠ۨۦ()I

    move-result v4

    if-ltz v4, :cond_8f

    invoke-static {}, Lcom/google/android/material/carousel/۠۟ۧۤ;->۟ۡۡۨۥ()I

    const-string v4, "\u06e5\u06e2\u06e4"

    goto/16 :goto_1b

    :cond_8f
    sget v4, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v5, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sub-int/2addr v4, v5

    const v5, 0x1aabf3

    add-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_a2
    sget v4, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v5, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    add-int/lit16 v5, v5, -0x188a

    add-int/2addr v4, v5

    if-ltz v4, :cond_90

    invoke-static {}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۧۧۥۦ()I

    const-string v4, "\u06e0\u06e0"

    invoke-static {v4}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_90
    sget v4, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v5, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    rem-int/2addr v4, v5

    const v5, -0x1ab878

    xor-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_a3
    sget v4, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v5, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    mul-int/lit16 v5, v5, -0x1f8d

    div-int/2addr v4, v5

    if-eqz v4, :cond_91

    invoke-static {}, Landroid/window/ۣۤ۠ۢ;->ۧۢۦ۟()I

    const-string v4, "\u06df\u06e2\u06e1"

    invoke-static {v4}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    move/from16 v73, v54

    goto/16 :goto_0

    :cond_91
    sget v4, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v5, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    add-int/2addr v4, v5

    const v5, 0x1aa924

    add-int/2addr v4, v5

    move/from16 v90, v4

    move/from16 v73, v54

    goto/16 :goto_0

    :sswitch_a4
    move-object/from16 v0, p1

    move-object/from16 v1, v31

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget v4, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v5, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    add-int/lit16 v5, v5, 0x11c8

    div-int/2addr v4, v5

    if-eqz v4, :cond_92

    invoke-static {}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->۟ۢ۟ۥۣ()I

    const-string v4, "\u06e3\u06e7\u06df"

    goto/16 :goto_35

    :cond_92
    const-string v4, "\u06e5\u06e8\u06e6"

    goto/16 :goto_1

    :sswitch_a5
    move-object/from16 v0, v32

    move-object/from16 v1, p2

    invoke-static {v0, v1}, Lbo;->c(Landroid/view/View;Lsn;)V

    invoke-virtual/range {v31 .. v32}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, p2

    iget-boolean v4, v0, Lsn;->m:Z

    if-eqz v4, :cond_4e

    if-nez p9, :cond_4e

    if-eqz v86, :cond_84

    invoke-virtual/range {p3 .. p3}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_84

    const/16 v4, 0x42

    invoke-static {v4}, Lmp;->q(I)I

    move-result v4

    sget v5, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    if-gtz v5, :cond_93

    const/16 v5, 0x1a

    sput v5, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    const-string v5, "\u06e4\u06e0\u06e5"

    invoke-static {v5}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v90, v5

    move/from16 v39, v4

    goto/16 :goto_0

    :cond_93
    move/from16 v5, v40

    goto/16 :goto_13

    :sswitch_a6
    const-string v4, "\u06e2\u06e1\u06e1"

    move-object/from16 v5, v44

    move/from16 v6, v64

    goto/16 :goto_24

    :cond_94
    :sswitch_a7
    invoke-static {}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۤ۠ۤۢ()I

    move-result v4

    if-ltz v4, :cond_95

    const/16 v4, 0x48

    sput v4, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    const-string v4, "\u06e4\u06e8\u06e4"

    goto/16 :goto_30

    :cond_95
    sget v4, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v5, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sub-int/2addr v4, v5

    const v5, -0x1ab6b4

    xor-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_96
    :sswitch_a8
    const-string v4, "\u06e1\u06e5\u06e4"

    goto/16 :goto_19

    :sswitch_a9
    const/4 v4, 0x2

    invoke-static {v4}, Lmp;->q(I)I

    move-result v4

    add-int/lit8 v5, v65, -0x1b

    sub-int v5, v5, v42

    add-int/lit8 v5, v5, 0x1b

    add-int/lit8 v5, v5, 0x9

    mul-int/lit8 v6, v4, 0x2

    sub-int/2addr v5, v6

    add-int/lit8 v5, v5, -0x9

    int-to-float v0, v5

    move/from16 v71, v0

    if-eqz v87, :cond_89

    const-string v75, "cXisfXp35Q==\n"

    const-string v5, "UkuVTkNEocg=\n"

    const-string v6, "\u06e7\u06e8"

    invoke-static {v6}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v83, v5

    move/from16 v72, v4

    move/from16 v90, v6

    goto/16 :goto_0

    :sswitch_aa
    sget v4, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v5, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    div-int/2addr v4, v5

    const v5, 0x1ac9aa

    add-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_97
    :sswitch_ab
    sget v4, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v5, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    rem-int/lit16 v5, v5, -0x210e

    div-int/2addr v4, v5

    if-eqz v4, :cond_98

    invoke-static {}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟۠ۢۧۡ()I

    const-string v4, "\u06e5\u06df\u06e7"

    invoke-static {v4}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_98
    const-string v4, "\u06e7\u06e3\u06e8"

    invoke-static {v4}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_ac
    invoke-static {}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->۟ۥۣۥۦ()I

    move-result v4

    if-gtz v4, :cond_99

    const/16 v4, 0x42

    sput v4, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    const-string v4, "\u06e8\u06e3\u06e0"

    goto/16 :goto_2e

    :cond_99
    sget v4, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v5, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sub-int/2addr v4, v5

    const v5, 0x1ab1a6

    add-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_ad
    sget v4, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    if-ltz v4, :cond_9a

    const/16 v4, 0x27

    sput v4, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    const-string v4, "\u06e3\u06e8\u06e3"

    move-object/from16 v5, v76

    goto/16 :goto_33

    :cond_9a
    sget v4, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v5, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    add-int/2addr v4, v5

    const v5, 0x1aa8d7

    add-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_ae
    sget v4, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v5, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    mul-int/lit16 v5, v5, 0x19a4

    add-int/2addr v4, v5

    if-ltz v4, :cond_9b

    const-string v4, "\u06e4\u06e6\u06e1"

    invoke-static {v4}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_9b
    const-string v4, "\u06e0\u06e4\u06e2"

    invoke-static {v4}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_af
    invoke-static {}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۣۣ۟ۥ۟()I

    move-result v4

    if-gtz v4, :cond_9c

    invoke-static {}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۦۢۧۧ()I

    const-string v4, "\u06e2\u06e0\u06e3"

    invoke-static {v4}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_9c
    sget v4, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v5, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sub-int/2addr v4, v5

    const v5, 0x1aa3b2

    add-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_b0
    const-string v4, "\u06e3\u06e4\u06e5"

    goto/16 :goto_2c

    :sswitch_b1
    sget v4, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v5, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    div-int/lit16 v5, v5, -0xce0

    mul-int/2addr v4, v5

    if-eqz v4, :cond_9d

    const/16 v4, 0x20

    sput v4, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    const-string v4, "\u06e1\u06e4\u06e7"

    goto/16 :goto_28

    :cond_9d
    sget v4, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v5, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    add-int/2addr v4, v5

    const v5, 0xdd95

    xor-int/2addr v4, v5

    move/from16 v90, v4

    goto/16 :goto_0

    :sswitch_b2
    sget-object v4, Lbo;->a:Landroid/graphics/Typeface;

    if-nez v4, :cond_3a

    sget v4, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    if-ltz v4, :cond_9e

    invoke-static {}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟۠ۢۢ۠()I

    const-string v4, "\u06e3\u06e2\u06e5"

    invoke-static {v4}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_9e
    const-string v4, "\u06e6\u06e4\u06e2"

    invoke-static {v4}, Landroidx/appcompat/app/۟۟ۥۨۤ;->ۤۤۡۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v90, v4

    goto/16 :goto_0

    :cond_9f
    :sswitch_b3
    sget v4, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    if-ltz v4, :cond_a0

    const/16 v4, 0x15

    sput v4, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    const-string v4, "\u06e2\u06e5\u06e3"

    goto/16 :goto_17

    :cond_a0
    const-string v4, "\u06e1\u06e8"

    goto/16 :goto_25

    :sswitch_b4
    return-object v31

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe8 -> :sswitch_0
        0xdbe9 -> :sswitch_1d
        0xdc00 -> :sswitch_9a
        0xdc01 -> :sswitch_11
        0xdc27 -> :sswitch_c
        0xdc3f -> :sswitch_7a
        0xdc41 -> :sswitch_a0
        0xdc46 -> :sswitch_7d
        0xdc5f -> :sswitch_a5
        0xdca1 -> :sswitch_a1
        0xdcba -> :sswitch_29
        0xdcbb -> :sswitch_58
        0xdcbe -> :sswitch_44
        0xdcdb -> :sswitch_af
        0xdcdc -> :sswitch_46
        0xdce1 -> :sswitch_81
        0xdcfd -> :sswitch_7
        0x1aa6ff -> :sswitch_9
        0x1aa708 -> :sswitch_5c
        0x1aa71e -> :sswitch_45
        0x1aa722 -> :sswitch_57
        0x1aa75e -> :sswitch_a6
        0x1aa75f -> :sswitch_3e
        0x1aa760 -> :sswitch_4f
        0x1aa762 -> :sswitch_90
        0x1aa77b -> :sswitch_7b
        0x1aa77c -> :sswitch_69
        0x1aa77f -> :sswitch_aa
        0x1aa79b -> :sswitch_78
        0x1aa7a2 -> :sswitch_5a
        0x1aa7c2 -> :sswitch_49
        0x1aa7df -> :sswitch_74
        0x1aa7e0 -> :sswitch_9e
        0x1aa7f7 -> :sswitch_43
        0x1aa7f9 -> :sswitch_b1
        0x1aa7fa -> :sswitch_65
        0x1aa81a -> :sswitch_3e
        0x1aa81e -> :sswitch_30
        0x1aaac0 -> :sswitch_77
        0x1aaae5 -> :sswitch_83
        0x1aaae6 -> :sswitch_93
        0x1aaae8 -> :sswitch_16
        0x1aaaff -> :sswitch_6e
        0x1aab03 -> :sswitch_3b
        0x1aab04 -> :sswitch_7e
        0x1aab07 -> :sswitch_71
        0x1aab1e -> :sswitch_4d
        0x1aab20 -> :sswitch_53
        0x1aab22 -> :sswitch_6
        0x1aab25 -> :sswitch_85
        0x1aab3e -> :sswitch_66
        0x1aab42 -> :sswitch_96
        0x1aab44 -> :sswitch_1
        0x1aab45 -> :sswitch_2e
        0x1aab5e -> :sswitch_84
        0x1aab7f -> :sswitch_1
        0x1aab81 -> :sswitch_60
        0x1aaba2 -> :sswitch_27
        0x1aabbc -> :sswitch_b0
        0x1aabde -> :sswitch_31
        0x1aabdf -> :sswitch_6a
        0x1aae87 -> :sswitch_4c
        0x1aae88 -> :sswitch_88
        0x1aaea7 -> :sswitch_a
        0x1aaec5 -> :sswitch_5f
        0x1aaec7 -> :sswitch_28
        0x1aaede -> :sswitch_62
        0x1aaedf -> :sswitch_26
        0x1aaf00 -> :sswitch_64
        0x1aaf05 -> :sswitch_48
        0x1aaf06 -> :sswitch_a2
        0x1aaf1d -> :sswitch_54
        0x1aaf21 -> :sswitch_5e
        0x1aaf25 -> :sswitch_50
        0x1aaf3e -> :sswitch_8e
        0x1aaf40 -> :sswitch_47
        0x1aaf7b -> :sswitch_7f
        0x1aaf7d -> :sswitch_8a
        0x1aaf9c -> :sswitch_80
        0x1aafa0 -> :sswitch_58
        0x1ab281 -> :sswitch_4b
        0x1ab282 -> :sswitch_8d
        0x1ab29f -> :sswitch_33
        0x1ab2a0 -> :sswitch_1e
        0x1ab2c3 -> :sswitch_17
        0x1ab2c4 -> :sswitch_ad
        0x1ab2dd -> :sswitch_5d
        0x1ab2e1 -> :sswitch_52
        0x1ab2e4 -> :sswitch_67
        0x1ab2e6 -> :sswitch_71
        0x1ab305 -> :sswitch_7f
        0x1ab31e -> :sswitch_23
        0x1ab31f -> :sswitch_34
        0x1ab324 -> :sswitch_7c
        0x1ab33d -> :sswitch_14
        0x1ab340 -> :sswitch_79
        0x1ab35b -> :sswitch_91
        0x1ab35f -> :sswitch_aa
        0x1ab604 -> :sswitch_13
        0x1ab606 -> :sswitch_41
        0x1ab608 -> :sswitch_89
        0x1ab623 -> :sswitch_24
        0x1ab645 -> :sswitch_97
        0x1ab647 -> :sswitch_9c
        0x1ab64a -> :sswitch_48
        0x1ab665 -> :sswitch_6c
        0x1ab666 -> :sswitch_f
        0x1ab681 -> :sswitch_4e
        0x1ab683 -> :sswitch_a8
        0x1ab686 -> :sswitch_b0
        0x1ab6a1 -> :sswitch_1d
        0x1ab6a4 -> :sswitch_10
        0x1ab6a6 -> :sswitch_22
        0x1ab6c3 -> :sswitch_2c
        0x1ab6c6 -> :sswitch_35
        0x1ab6e1 -> :sswitch_5b
        0x1ab6e2 -> :sswitch_8f
        0x1ab6e3 -> :sswitch_39
        0x1ab6e5 -> :sswitch_25
        0x1ab6fb -> :sswitch_9f
        0x1ab6fe -> :sswitch_a9
        0x1ab701 -> :sswitch_37
        0x1ab9c4 -> :sswitch_59
        0x1ab9e3 -> :sswitch_2
        0x1ab9e5 -> :sswitch_70
        0x1ab9e7 -> :sswitch_55
        0x1ab9e9 -> :sswitch_3c
        0x1ab9ea -> :sswitch_61
        0x1aba21 -> :sswitch_87
        0x1aba22 -> :sswitch_6b
        0x1aba41 -> :sswitch_b3
        0x1aba42 -> :sswitch_b1
        0x1aba45 -> :sswitch_ac
        0x1aba5f -> :sswitch_1a
        0x1aba66 -> :sswitch_42
        0x1aba7f -> :sswitch_53
        0x1aba80 -> :sswitch_21
        0x1aba81 -> :sswitch_8b
        0x1aba85 -> :sswitch_32
        0x1aba9d -> :sswitch_76
        0x1aba9e -> :sswitch_9b
        0x1abac2 -> :sswitch_ac
        0x1abadb -> :sswitch_2f
        0x1abade -> :sswitch_a4
        0x1abadf -> :sswitch_6d
        0x1abd85 -> :sswitch_99
        0x1abd86 -> :sswitch_1b
        0x1abd87 -> :sswitch_86
        0x1abd8a -> :sswitch_3a
        0x1abda9 -> :sswitch_19
        0x1abdab -> :sswitch_98
        0x1abde2 -> :sswitch_80
        0x1abde8 -> :sswitch_82
        0x1abe01 -> :sswitch_1f
        0x1abe40 -> :sswitch_3f
        0x1abe61 -> :sswitch_ae
        0x1abe62 -> :sswitch_4a
        0x1abe66 -> :sswitch_b
        0x1abe9e -> :sswitch_69
        0x1abea2 -> :sswitch_56
        0x1abea3 -> :sswitch_b4
        0x1abea4 -> :sswitch_36
        0x1ac146 -> :sswitch_18
        0x1ac16b -> :sswitch_ab
        0x1ac16c -> :sswitch_a1
        0x1ac184 -> :sswitch_36
        0x1ac1ac -> :sswitch_ad
        0x1ac1c4 -> :sswitch_17
        0x1ac1c9 -> :sswitch_3e
        0x1ac1ca -> :sswitch_2b
        0x1ac1e4 -> :sswitch_72
        0x1ac202 -> :sswitch_4
        0x1ac204 -> :sswitch_15
        0x1ac207 -> :sswitch_9d
        0x1ac225 -> :sswitch_73
        0x1ac23e -> :sswitch_3d
        0x1ac265 -> :sswitch_6f
        0x1ac507 -> :sswitch_b2
        0x1ac50a -> :sswitch_92
        0x1ac50d -> :sswitch_27
        0x1ac50e -> :sswitch_13
        0x1ac526 -> :sswitch_94
        0x1ac52d -> :sswitch_95
        0x1ac52e -> :sswitch_af
        0x1ac52f -> :sswitch_8c
        0x1ac586 -> :sswitch_3
        0x1ac58c -> :sswitch_12
        0x1ac5a3 -> :sswitch_38
        0x1ac5ab -> :sswitch_2
        0x1ac5e2 -> :sswitch_1c
        0x1ac604 -> :sswitch_e
        0x1ac8c9 -> :sswitch_22
        0x1ac8cc -> :sswitch_51
        0x1ac8d1 -> :sswitch_68
        0x1ac8e7 -> :sswitch_75
        0x1ac8e8 -> :sswitch_2d
        0x1ac8ec -> :sswitch_7e
        0x1ac909 -> :sswitch_5
        0x1ac92c -> :sswitch_37
        0x1ac944 -> :sswitch_e
        0x1ac94d -> :sswitch_d
        0x1ac964 -> :sswitch_8
        0x1ac969 -> :sswitch_a3
        0x1ac985 -> :sswitch_a7
        0x1ac9a2 -> :sswitch_44
        0x1ac9a9 -> :sswitch_ae
        0x1ac9aa -> :sswitch_20
        0x1ac9c7 -> :sswitch_2e
        0x1ac9c8 -> :sswitch_2a
        0x1ac9e6 -> :sswitch_40
        0x1ac9e7 -> :sswitch_63
    .end sparse-switch
.end method

.method public static c(Landroid/view/View;Lsn;)V
    .locals 5

    const/4 v2, 0x0

    const-string v0, "\u06e3\u06e3\u06e2"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v0

    move-object v1, v2

    move-object v3, v2

    move v4, v0

    :goto_0
    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    const-string v0, "bvfz6OVFSJQ2uLG0\n"

    const-string v4, "GJafnYAKLrw=\n"

    invoke-static {v0, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "\u06e5\u06e5\u06e6"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :sswitch_2
    new-instance v0, Landroid/graphics/drawable/RippleDrawable;

    invoke-direct {v0, v1, v3, v2}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-static {}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۟ۦۣۣۧ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "\u06e8\u06df\u06e7"

    invoke-static {v0}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e4\u06e0"

    goto :goto_1

    :sswitch_3
    iget v0, p1, Lsn;->a:I

    const/4 v4, 0x1

    if-ne v0, v4, :cond_4

    sget v0, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v4, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    div-int/lit16 v4, v4, 0x26c5

    xor-int/2addr v0, v4

    if-ltz v0, :cond_7

    const/16 v0, 0x47

    sput v0, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    const-string v0, "\u06e5\u06e2\u06e1"

    invoke-static {v0}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :sswitch_4
    new-instance v0, Lao;

    const/4 v4, 0x0

    invoke-direct {v0, v4}, Lao;-><init>(I)V

    invoke-virtual {p0, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۨۦ۠ۡ()I

    move-result v0

    if-ltz v0, :cond_1

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۥۣ۠ۦ()I

    const-string v0, "\u06e1\u06e7\u06e8"

    invoke-static {v0}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e1\u06e7\u06e8"

    :goto_2
    invoke-static {v0}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_2
    :sswitch_5
    const-string v0, "\u06e4\u06e0"

    :goto_3
    invoke-static {v0}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :sswitch_6
    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۨۦ۠ۡ()I

    move-result v0

    if-ltz v0, :cond_3

    invoke-static {}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۢۧۥ()I

    const-string v0, "\u06df\u06e3\u06e0"

    goto :goto_3

    :cond_3
    const-string v0, "\u06e3\u06e3\u06e2"

    goto :goto_3

    :cond_4
    :sswitch_7
    sget v0, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v4, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    or-int/lit16 v4, v4, 0x19b5

    add-int/2addr v0, v4

    if-gtz v0, :cond_5

    const-string v0, "\u06e1\u06e3\u06e5"

    :goto_4
    invoke-static {v0}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06e6\u06df\u06e4"

    goto :goto_4

    :sswitch_8
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    sget v3, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v4, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    div-int/lit16 v4, v4, 0x236a

    sub-int/2addr v3, v4

    if-gtz v3, :cond_6

    const-string v3, "\u06e6\u06df\u06e4"

    invoke-static {v3}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v4

    move-object v3, v0

    goto/16 :goto_0

    :cond_6
    sget v3, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v4, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    xor-int/2addr v3, v4

    const v4, 0xdbad

    add-int/2addr v4, v3

    move-object v3, v0

    goto/16 :goto_0

    :sswitch_9
    instance-of v0, v3, Landroid/graphics/drawable/RippleDrawable;

    if-nez v0, :cond_2

    sget v0, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v4, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    or-int/lit16 v4, v4, -0x1b8a

    sub-int/2addr v0, v4

    if-gtz v0, :cond_8

    :cond_7
    const-string v0, "\u06e8\u06e0\u06e0"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_8
    const-string v0, "\u06e8\u06df\u06e7"

    goto/16 :goto_1

    :sswitch_a
    new-instance v0, Lz9;

    sget v4, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    xor-int/lit16 v4, v4, -0x185

    invoke-direct {v0, v4}, Lz9;-><init>(I)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    sget v0, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v4, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    div-int/lit16 v4, v4, 0x2268

    or-int/2addr v0, v4

    if-ltz v0, :cond_9

    const/16 v0, 0x60

    sput v0, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    const-string v0, "\u06e4\u06e0"

    goto/16 :goto_2

    :cond_9
    sget v0, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v4, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    add-int/2addr v0, v4

    const v4, 0x1ab9e0

    add-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :sswitch_b
    const-string v0, "qFriAA==\n"

    const-string v4, "3jOHd1JoIGA=\n"

    invoke-static {v0, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-static {}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۤ۟۠ۢ()I

    move-result v0

    if-gtz v0, :cond_a

    const/16 v0, 0x39

    sput v0, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    :cond_a
    const-string v0, "\u06e6\u06e2\u06e7"

    invoke-static {v0}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :sswitch_c
    const-string v0, "0DaZj2o=\n"

    const-string v4, "pF784g+arnQ=\n"

    invoke-static {v0, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Landroidx/core/app/ۡۤۡ۠;->ۨۥۨۧ()I

    move-result v0

    if-ltz v0, :cond_b

    const-string v0, "\u06df\u06e8\u06e5"

    goto/16 :goto_1

    :cond_b
    const-string v0, "\u06e5\u06e2\u06e4"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :sswitch_d
    iget v0, p1, Lsn;->i:I

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-static {}, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۡۥ()I

    move-result v1

    if-gtz v1, :cond_c

    const/16 v1, 0x59

    sput v1, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    const-string v1, "\u06e5\u06e5\u06e6"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v4

    move-object v1, v0

    goto/16 :goto_0

    :cond_c
    sget v1, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v4, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    or-int/2addr v1, v4

    const v4, 0x1ac219

    add-int/2addr v4, v1

    move-object v1, v0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc7c -> :sswitch_0
        0xdc9a -> :sswitch_9
        0x1aa7f9 -> :sswitch_7
        0x1aa81c -> :sswitch_6
        0x1aaf82 -> :sswitch_3
        0x1ab682 -> :sswitch_b
        0x1abae1 -> :sswitch_0
        0x1abde4 -> :sswitch_5
        0x1abde7 -> :sswitch_4
        0x1abe46 -> :sswitch_8
        0x1ac14b -> :sswitch_a
        0x1ac1a8 -> :sswitch_1
        0x1ac1ab -> :sswitch_c
        0x1ac8d0 -> :sswitch_2
        0x1ac8e8 -> :sswitch_d
    .end sparse-switch
.end method

.method public static final d(Lo00;Landroid/widget/FrameLayout;Ll00;Ld6;Lp00;ILsn;Landroid/view/View;IZF)V
    .locals 38

    const-wide/16 v26, 0x0

    const/16 v21, 0x0

    const/16 v29, 0x0

    const/16 v28, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/4 v6, 0x0

    const/4 v5, 0x0

    const/4 v15, 0x0

    const/4 v14, 0x0

    const/4 v4, 0x0

    const/16 v25, 0x0

    const/4 v8, 0x0

    const/4 v7, 0x0

    const/4 v11, 0x0

    const/4 v10, 0x0

    const/16 v23, 0x0

    const/4 v9, 0x0

    const/16 v18, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v24, 0x0

    const/16 v19, 0x0

    const/4 v13, 0x0

    const/4 v12, 0x0

    const-string v30, "\u06e6\u06e2\u06e1"

    invoke-static/range {v30 .. v30}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v33

    move-object/from16 v30, v4

    move-object/from16 v31, v21

    move/from16 v32, v29

    :goto_0
    sparse-switch v33, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    sget v4, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    if-gtz v4, :cond_24

    const/16 v4, 0xd

    sput v4, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    const-string v4, "\u06e4\u06e6\u06e0"

    invoke-static {v4}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v33, v4

    goto :goto_0

    :sswitch_1
    const-string v4, "\u06e1\u06e8\u06df"

    move v10, v11

    :goto_1
    invoke-static {v4}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v33, v4

    goto :goto_0

    :sswitch_2
    move-object/from16 v0, p2

    iget-boolean v4, v0, Ll00;->a:Z

    const/4 v8, 0x0

    if-eqz v4, :cond_14

    const/4 v7, 0x0

    sget v4, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v21, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    move/from16 v0, v21

    add-int/lit16 v0, v0, 0x19de

    move/from16 v21, v0

    add-int v4, v4, v21

    if-gtz v4, :cond_1e

    const/16 v4, 0x3d

    sput v4, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    move v4, v5

    :goto_2
    const-string v5, "\u06e3\u06e1\u06e5"

    invoke-static {v5}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v21

    move/from16 v33, v21

    move v5, v4

    goto :goto_0

    :sswitch_3
    new-instance v4, Lnh;

    const/16 v21, 0x1

    move/from16 v0, v21

    move-object/from16 v1, v20

    invoke-direct {v4, v0, v1}, Lnh;-><init>(ILjava/lang/Object;)V

    move-object/from16 v0, v30

    invoke-virtual {v0, v4}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    const-wide/16 v34, 0xfa

    move-object/from16 v0, v30

    move-wide/from16 v1, v34

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    move-object/from16 v0, v30

    move-object/from16 v1, p4

    iput-object v0, v1, Lp00;->b:Ljava/lang/Object;

    invoke-virtual/range {v30 .. v30}, Landroid/animation/ValueAnimator;->start()V

    sget v4, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v21, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    move/from16 v0, v21

    xor-int/lit16 v0, v0, 0xb5e

    move/from16 v21, v0

    mul-int v4, v4, v21

    if-gtz v4, :cond_1

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۥۥۢۧ()I

    const-string v4, "\u06e5\u06e8\u06e1"

    invoke-static {v4}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v33, v4

    goto :goto_0

    :cond_1
    sget v4, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v21, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    mul-int v4, v4, v21

    const v21, 0x1a2ee0

    add-int v4, v4, v21

    move/from16 v33, v4

    goto/16 :goto_0

    :sswitch_4
    move-object/from16 v0, p7

    move/from16 v1, v23

    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v4

    instance-of v0, v4, Lo40;

    move/from16 v21, v0

    if-eqz v21, :cond_f

    check-cast v4, Lo40;

    sget v18, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v21, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    add-int v18, v18, v21

    const v21, 0x1ac929

    add-int v21, v21, v18

    move-object/from16 v18, v4

    move/from16 v33, v21

    goto/16 :goto_0

    :sswitch_5
    const-string v4, "\u06df\u06e1\u06e1"

    invoke-static {v4}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v33, v4

    goto/16 :goto_0

    :sswitch_6
    invoke-static {}, L۟ۤۧۦۢ;->ۣ۟۟ۢ۟()I

    move-result v4

    if-ltz v4, :cond_2

    invoke-static {}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۧۡۥ۟()I

    const-string v4, "\u06e0\u06e5\u06e4"

    invoke-static {v4}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v33, v4

    goto/16 :goto_0

    :cond_2
    const-string v4, "\u06e1\u06e7\u06e5"

    :goto_3
    invoke-static {v4}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v33, v4

    goto/16 :goto_0

    :sswitch_7
    sget v4, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v5, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    div-int/lit16 v5, v5, 0x25dd

    xor-int/2addr v4, v5

    if-ltz v4, :cond_3

    const/16 v4, 0x45

    sput v4, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    const-string v4, "\u06e2\u06e7\u06e4"

    invoke-static {v4}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v33, v4

    move v5, v6

    goto/16 :goto_0

    :cond_3
    move v4, v6

    goto/16 :goto_2

    :sswitch_8
    new-instance v4, Lp40;

    invoke-direct {v4, v12}, Lp40;-><init>(F)V

    move/from16 v0, v19

    invoke-virtual {v4, v0}, Lp40;->b(F)V

    const v21, 0x3f266666    # 0.65f

    move/from16 v0, v21

    invoke-virtual {v4, v0}, Lp40;->a(F)V

    move-object/from16 v0, v17

    iput-object v4, v0, Lo40;->k:Lp40;

    sget v4, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v21, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    move/from16 v0, v21

    add-int/lit16 v0, v0, -0x3eb

    move/from16 v21, v0

    rem-int v4, v4, v21

    if-gtz v4, :cond_22

    const-string v4, "\u06e0\u06e8\u06e5"

    invoke-static {v4}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v33, v4

    goto/16 :goto_0

    :sswitch_9
    sget v4, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    if-ltz v4, :cond_4

    const-string v4, "\u06e7\u06e8\u06e0"

    invoke-static {v4}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v18, v9

    move/from16 v33, v4

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u06e6\u06e1\u06e4"

    move-object/from16 v18, v9

    :goto_4
    invoke-static {v4}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v33, v4

    goto/16 :goto_0

    :sswitch_a
    move/from16 v0, p8

    int-to-float v11, v0

    const-string v4, "\u06e5\u06e1\u06e8"

    invoke-static {v4}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v33, v4

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, L۟ۤۧۦۢ;->ۣ۟۟ۢ۟()I

    move-result v4

    if-ltz v4, :cond_5

    invoke-static {}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->۟ۦۥۨ۠()I

    :cond_5
    const-string v4, "\u06df\u06e7\u06e5"

    invoke-static {v4}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v17, v16

    move/from16 v33, v4

    goto/16 :goto_0

    :sswitch_c
    if-nez v18, :cond_2c

    new-instance v4, Lo40;

    sget-object v16, Lo40;->m:Lsh;

    move-object/from16 v0, p7

    move-object/from16 v1, v16

    invoke-direct {v4, v0, v1}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    move-object/from16 v0, p7

    move/from16 v1, v23

    invoke-virtual {v0, v1, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-static {}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۡۢۨۥ()I

    move-result v16

    if-ltz v16, :cond_6

    const/16 v16, 0x16

    sput v16, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    const-string v16, "\u06e6\u06e8\u06e3"

    invoke-static/range {v16 .. v16}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v21

    move-object/from16 v16, v4

    move-object/from16 v17, v18

    move/from16 v33, v21

    goto/16 :goto_0

    :cond_6
    move-object/from16 v17, v18

    :goto_5
    const-string v16, "\u06df\u06e6\u06e2"

    move-object/from16 v21, v16

    move-object/from16 v29, v4

    :goto_6
    invoke-static/range {v21 .. v21}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v16, v29

    move/from16 v33, v4

    goto/16 :goto_0

    :cond_7
    :sswitch_d
    sget v4, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v21, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    move/from16 v0, v21

    add-int/lit16 v0, v0, 0xc9b

    move/from16 v21, v0

    sub-int v4, v4, v21

    if-ltz v4, :cond_8

    const-string v4, "\u06e1\u06e5\u06e8"

    :goto_7
    invoke-static {v4}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v33, v4

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06e8\u06e4\u06e6"

    :goto_8
    invoke-static {v4}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v33, v4

    goto/16 :goto_0

    :sswitch_e
    move-object/from16 v0, p7

    invoke-virtual {v0, v10}, Landroid/view/View;->setPivotX(F)V

    move/from16 v0, p8

    int-to-float v4, v0

    const/high16 v21, 0x40000000    # 2.0f

    div-float v4, v4, v21

    move-object/from16 v0, p7

    invoke-virtual {v0, v4}, Landroid/view/View;->setPivotY(F)V

    invoke-virtual/range {v25 .. v25}, Landroid/animation/ValueAnimator;->start()V

    const v4, 0x7e0900cc

    sget v21, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    xor-int v23, v4, v21

    const-string v21, "\u06e4\u06e2\u06df"

    move-object/from16 v4, v20

    :goto_9
    invoke-static/range {v21 .. v21}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v21

    move-object/from16 v20, v4

    move/from16 v33, v21

    goto/16 :goto_0

    :sswitch_f
    const/4 v4, 0x0

    sget v9, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v21, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    move/from16 v0, v21

    rem-int/lit16 v0, v0, -0x1f0d

    move/from16 v21, v0

    or-int v9, v9, v21

    if-gtz v9, :cond_9

    :goto_a
    const-string v9, "\u06e3\u06e0\u06e6"

    invoke-static {v9}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v21

    move-object v9, v4

    move/from16 v33, v21

    goto/16 :goto_0

    :cond_9
    sget v9, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v21, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    add-int v9, v9, v21

    const v21, 0x1ac8c1

    add-int v21, v21, v9

    move-object v9, v4

    move/from16 v33, v21

    goto/16 :goto_0

    :sswitch_10
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    const-string v20, "kV1WfD/NXLORR04wfcsdvp5bTjBrwR2zkEYXfmrCUf2LUUp1P89TuY1HU3QxyU+8j0BTc2yAWa+e\nX1tyc8sTmo1JXnl6wEmZjUlNcX3CWA==\n"

    const-string v21, "/yg6EB+uPd0=\n"

    invoke-static/range {v20 .. v21}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-static {v0, v4}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v4, Landroid/graphics/drawable/GradientDrawable;

    move-object/from16 v0, p2

    iget-boolean v0, v0, Ll00;->a:Z

    move/from16 v22, v0

    sget v20, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    if-ltz v20, :cond_a

    const-string v20, "\u06e3\u06e1"

    invoke-static/range {v20 .. v20}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v21

    move-object/from16 v20, v4

    move/from16 v33, v21

    goto/16 :goto_0

    :cond_a
    const-string v20, "\u06e5\u06e8\u06e1"

    move-object/from16 v21, v20

    goto :goto_9

    :sswitch_11
    move-object/from16 v0, p6

    iget v6, v0, Lsn;->g:I

    invoke-static {}, Lۤۤۥۤ;->۟ۤ۠()I

    move-result v4

    if-gtz v4, :cond_b

    const-string v4, "\u06df\u06e6\u06e0"

    invoke-static {v4}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v33, v4

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06e0\u06e8\u06e5"

    :goto_b
    invoke-static {v4}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v33, v4

    goto/16 :goto_0

    :sswitch_12
    sget v4, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v15, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    div-int/lit16 v15, v15, -0x26a2

    mul-int/2addr v4, v15

    if-eqz v4, :cond_c

    const/16 v4, 0x25

    sput v4, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    const-string v4, "\u06e5\u06e4\u06e1"

    invoke-static {v4}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v33, v4

    move/from16 v15, p5

    goto/16 :goto_0

    :cond_c
    sget v4, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v15, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    mul-int/2addr v4, v15

    const v15, 0x1a8781

    xor-int/2addr v4, v15

    move/from16 v33, v4

    move/from16 v15, p5

    goto/16 :goto_0

    :sswitch_13
    sget v4, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v12, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    div-int/lit16 v12, v12, -0x97b

    sub-int/2addr v4, v12

    if-gtz v4, :cond_d

    const-string v4, "\u06e4\u06e2\u06df"

    move v12, v13

    goto/16 :goto_1

    :cond_d
    const-string v4, "\u06e2\u06e5\u06e3"

    move v12, v13

    :goto_c
    invoke-static {v4}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v33, v4

    goto/16 :goto_0

    :sswitch_14
    sget v4, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    if-ltz v4, :cond_e

    const/16 v4, 0x2b

    sput v4, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    const-string v4, "\u06df\u06e8\u06e0"

    invoke-static {v4}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v33, v4

    move v14, v15

    goto/16 :goto_0

    :cond_e
    const-string v4, "\u06e8\u06df\u06e3"

    move v14, v15

    :goto_d
    invoke-static {v4}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠ۡۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v33, v4

    goto/16 :goto_0

    :cond_f
    :sswitch_15
    sget v4, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v21, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    rem-int v4, v4, v21

    const v21, 0x1abdc8

    add-int v4, v4, v21

    move/from16 v33, v4

    goto/16 :goto_0

    :sswitch_16
    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    move-object/from16 v0, v31

    invoke-virtual {v4, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    invoke-static {}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->ۤ۠ۡۧ()I

    move-result v4

    if-ltz v4, :cond_11

    :cond_10
    const-string v4, "\u06e0\u06e0\u06e8"

    :goto_e
    invoke-static {v4}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v33, v4

    goto/16 :goto_0

    :cond_11
    const-string v4, "\u06e4\u06e2\u06e6"

    goto/16 :goto_b

    :sswitch_17
    invoke-virtual/range {v17 .. v17}, Lo40;->h()V

    sget v4, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    if-gtz v4, :cond_12

    invoke-static {}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟ۥۦۧۡ()I

    const-string v4, "\u06e1\u06e0\u06e8"

    invoke-static {v4}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v33, v4

    goto/16 :goto_0

    :cond_12
    move-object v4, v9

    goto/16 :goto_a

    :sswitch_18
    sget v4, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    if-gtz v4, :cond_13

    invoke-static {}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->ۤ۠ۡۧ()I

    const-string v4, "\u06df\u06e5\u06e4"

    invoke-static {v4}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v33, v4

    goto/16 :goto_0

    :cond_13
    sget v4, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v21, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    mul-int v4, v4, v21

    const v21, 0x2402db

    add-int v4, v4, v21

    move/from16 v33, v4

    goto/16 :goto_0

    :sswitch_19
    move-wide/from16 v0, v26

    move-object/from16 v2, p0

    iput-wide v0, v2, Lo00;->a:J

    sget-object v4, Lkn;->a:Lkn;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x1

    move-object/from16 v0, p1

    invoke-static {v0, v4}, Lkn;->i(Landroid/view/View;I)V

    move-object/from16 v0, p2

    iget-boolean v4, v0, Ll00;->a:Z

    sget v21, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v29, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    div-int v21, v21, v29

    const v29, -0x1aba08

    xor-int v21, v21, v29

    move/from16 v32, v4

    move/from16 v33, v21

    goto/16 :goto_0

    :sswitch_1a
    const-string v4, "\u06e1\u06e8\u06df"

    goto/16 :goto_3

    :cond_14
    :sswitch_1b
    sget v4, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v21, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    move/from16 v0, v21

    div-int/lit16 v0, v0, 0x1d08

    move/from16 v21, v0

    add-int v4, v4, v21

    if-ltz v4, :cond_15

    const-string v4, "\u06e0\u06e5\u06e6"

    goto/16 :goto_d

    :cond_15
    const-string v4, "\u06e3\u06e3\u06e5"

    invoke-static {v4}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v33, v4

    goto/16 :goto_0

    :sswitch_1c
    sget v4, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v21, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    move/from16 v0, v21

    xor-int/lit16 v0, v0, 0xc90

    move/from16 v21, v0

    add-int v4, v4, v21

    if-ltz v4, :cond_16

    const/16 v4, 0x31

    sput v4, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    const-string v4, "\u06e7\u06e1\u06e1"

    invoke-static {v4}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v33, v4

    goto/16 :goto_0

    :cond_16
    sget v4, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v21, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sub-int v4, v4, v21

    const v21, 0x1ac0ea

    add-int v4, v4, v21

    move/from16 v33, v4

    goto/16 :goto_0

    :sswitch_1d
    xor-int/lit8 v4, v32, -0x1

    and-int/lit8 v4, v4, 0x1

    and-int/lit8 v21, v32, -0x2

    or-int v4, v4, v21

    move-object/from16 v0, p2

    iput-boolean v4, v0, Ll00;->a:Z

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    move-object/from16 v0, p3

    invoke-virtual {v0, v4}, Ld6;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, p4

    iget-object v4, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v4, Landroid/animation/ValueAnimator;

    sget v21, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    if-ltz v21, :cond_2a

    const/16 v21, 0x5e

    sput v21, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    const-string v21, "\u06e4\u06e1\u06e3"

    invoke-static/range {v21 .. v21}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v21

    move-object/from16 v28, v4

    move/from16 v33, v21

    goto/16 :goto_0

    :sswitch_1e
    if-eqz p9, :cond_21

    const/high16 v19, 0x43480000    # 200.0f

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۥۣ۠ۦ()I

    move-result v4

    if-ltz v4, :cond_17

    const/16 v4, 0x4b

    sput v4, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    move-object/from16 v4, v16

    goto/16 :goto_5

    :cond_17
    sget v4, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v21, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    add-int v4, v4, v21

    const v21, -0xdc46

    xor-int v4, v4, v21

    move/from16 v33, v4

    goto/16 :goto_0

    :cond_18
    :sswitch_1f
    sget v4, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v21, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    move/from16 v0, v21

    add-int/lit16 v0, v0, -0x14fa

    move/from16 v21, v0

    mul-int v4, v4, v21

    if-ltz v4, :cond_19

    invoke-static {}, Landroidx/legacy/content/ۨ۠ۦۥ;->۟ۢۦ۠ۦ()I

    const-string v21, "\u06e0\u06e0"

    move-object/from16 v4, v20

    goto/16 :goto_9

    :cond_19
    const-string v4, "\u06e3\u06df\u06e7"

    goto/16 :goto_7

    :sswitch_20
    sget v4, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    if-gtz v4, :cond_1a

    const-string v4, "\u06e5\u06e5\u06e1"

    invoke-static {v4}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v33, v4

    goto/16 :goto_0

    :cond_1a
    sget v4, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v21, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    or-int v4, v4, v21

    const v21, 0x1ac0c3

    add-int v4, v4, v21

    move/from16 v33, v4

    goto/16 :goto_0

    :sswitch_21
    sget v4, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v21, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    move/from16 v0, v21

    add-int/lit16 v0, v0, -0x1c50

    move/from16 v21, v0

    div-int v4, v4, v21

    if-eqz v4, :cond_1b

    const-string v4, "\u06e4\u06e3\u06e6"

    invoke-static {v4}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v33, v4

    goto/16 :goto_0

    :cond_1b
    sget v4, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v21, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    rem-int v4, v4, v21

    const v21, 0x1ac14d

    add-int v4, v4, v21

    move/from16 v33, v4

    goto/16 :goto_0

    :sswitch_22
    const v24, 0x44bb8000    # 1500.0f

    const-string v4, "\u06e1\u06e1\u06e8"

    goto/16 :goto_3

    :sswitch_23
    const/4 v4, 0x2

    new-array v4, v4, [I

    sget v21, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    move/from16 v0, v21

    xor-int/lit16 v0, v0, 0x384

    move/from16 v21, v0

    aput v5, v4, v21

    sget v21, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    move/from16 v0, v21

    xor-int/lit16 v0, v0, 0x15e

    move/from16 v21, v0

    aput v14, v4, v21

    invoke-static {v4}, Landroid/animation/ValueAnimator;->ofArgb([I)Landroid/animation/ValueAnimator;

    move-result-object v21

    invoke-static {}, Landroid/window/ۣۤ۠ۢ;->ۧۢۦ۟()I

    move-result v4

    if-gtz v4, :cond_1c

    invoke-static {}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->۟ۦۥۨ۠()I

    const-string v4, "\u06e1\u06e1\u06e8"

    :goto_f
    invoke-static {v4}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v30, v21

    move/from16 v33, v4

    goto/16 :goto_0

    :cond_1c
    const-string v4, "\u06e3\u06e7\u06e4"

    goto :goto_f

    :sswitch_24
    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣۣ۟ۡ()I

    move-result v4

    if-gtz v4, :cond_1d

    const/16 v4, 0x4f

    sput v4, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    const-string v4, "\u06e3\u06e2"

    invoke-static {v4}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v33, v4

    goto/16 :goto_0

    :cond_1d
    const-string v21, "\u06e6\u06e8\u06e3"

    move-object/from16 v4, v20

    goto/16 :goto_9

    :sswitch_25
    if-eqz v22, :cond_7

    const-string v4, "\u06e0\u06e0\u06e3"

    move/from16 v5, p5

    goto/16 :goto_e

    :sswitch_26
    sget v4, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v19, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    move/from16 v0, v19

    div-int/lit16 v0, v0, 0xd7d

    move/from16 v19, v0

    or-int v4, v4, v19

    if-gtz v4, :cond_1f

    const/16 v4, 0x48

    sput v4, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    move/from16 v19, v24

    :cond_1e
    const-string v4, "\u06e1\u06e2\u06e2"

    invoke-static {v4}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v33, v4

    goto/16 :goto_0

    :cond_1f
    sget v4, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v19, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    rem-int v4, v4, v19

    const v19, 0x1aae3a

    xor-int v4, v4, v19

    move/from16 v33, v4

    move/from16 v19, v24

    goto/16 :goto_0

    :sswitch_27
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v26

    const-wide/16 v34, 0x1d

    add-long v34, v34, v26

    move-object/from16 v0, p0

    iget-wide v0, v0, Lo00;->a:J

    move-wide/from16 v36, v0

    sub-long v34, v34, v36

    const-wide/16 v36, 0x1d

    sub-long v34, v34, v36

    const-wide/16 v36, 0xfa

    cmp-long v4, v34, v36

    if-gez v4, :cond_0

    invoke-static {}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۤ۟۠ۢ()I

    move-result v4

    if-gtz v4, :cond_25

    const-string v4, "NvIW9vUhXo0kKHFSeBW0kiLY"

    invoke-static {v4}, Lcom/google/android/material/carousel/ۥۣۤۡ;->۟ۡۨۡۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v4

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟ۧ۠ۧۢ()I

    move-result v21

    if-ltz v21, :cond_20

    const/16 v21, 0x3f

    sput v21, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    const-string v21, "\u06e3\u06e6\u06e3"

    invoke-static/range {v21 .. v21}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v21

    move-object/from16 v31, v4

    move/from16 v33, v21

    goto/16 :goto_0

    :cond_20
    const-string v21, "\u06e7\u06e5\u06e8"

    invoke-static/range {v21 .. v21}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v21

    move-object/from16 v31, v4

    move/from16 v33, v21

    goto/16 :goto_0

    :sswitch_28
    const-string v4, "\u06e5\u06e4"

    invoke-static {v4}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v33, v4

    goto/16 :goto_0

    :cond_21
    :sswitch_29
    const-string v4, "\u06e1\u06e0\u06e8"

    goto/16 :goto_8

    :sswitch_2a
    invoke-virtual/range {v28 .. v28}, Landroid/animation/ValueAnimator;->cancel()V

    sget v4, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v21, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    move/from16 v0, v21

    or-int/lit16 v0, v0, 0x1099

    move/from16 v21, v0

    or-int v4, v4, v21

    if-gtz v4, :cond_23

    :cond_22
    const-string v4, "\u06e0\u06e2\u06e1"

    goto/16 :goto_4

    :cond_23
    const-string v4, "\u06e5\u06e6\u06e7"

    goto/16 :goto_1

    :cond_24
    const-string v4, "\u06e3\u06e2"

    goto/16 :goto_8

    :cond_25
    :sswitch_2b
    invoke-static {}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۤ۠ۤۢ()I

    move-result v4

    if-ltz v4, :cond_26

    const-string v4, "\u06e7\u06e8\u06e2"

    goto/16 :goto_8

    :cond_26
    sget v4, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v21, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    rem-int v4, v4, v21

    const v21, 0x1abc0c

    add-int v4, v4, v21

    move/from16 v33, v4

    goto/16 :goto_0

    :sswitch_2c
    const/4 v4, 0x3

    new-array v4, v4, [F

    fill-array-data v4, :array_0

    invoke-static {v4}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v4

    new-instance v21, Lun;

    const/16 v25, 0x0

    move-object/from16 v0, v21

    move-object/from16 v1, p7

    move/from16 v2, v25

    invoke-direct {v0, v1, v2}, Lun;-><init>(Landroid/view/View;I)V

    move-object/from16 v0, v21

    invoke-virtual {v4, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    const-wide/16 v34, 0x293

    sget v21, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    move/from16 v0, v21

    int-to-long v0, v0

    move-wide/from16 v36, v0

    xor-long v34, v34, v36

    move-wide/from16 v0, v34

    invoke-virtual {v4, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v21, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct/range {v21 .. v21}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    move-object/from16 v0, v21

    invoke-virtual {v4, v0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    invoke-static {}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟۠ۢۢ۠()I

    move-result v21

    if-ltz v21, :cond_27

    const-string v21, "\u06e8\u06df"

    invoke-static/range {v21 .. v21}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v21

    move-object/from16 v25, v4

    move/from16 v33, v21

    goto/16 :goto_0

    :cond_27
    const-string v21, "\u06e3\u06df\u06e1"

    :goto_10
    invoke-static/range {v21 .. v21}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v21

    move-object/from16 v25, v4

    move/from16 v33, v21

    goto/16 :goto_0

    :cond_28
    move v12, v8

    :sswitch_2d
    sget v4, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v21, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    move/from16 v0, v21

    div-int/lit16 v0, v0, -0x1058

    move/from16 v21, v0

    xor-int v4, v4, v21

    if-ltz v4, :cond_29

    invoke-static {}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۧۧۥۦ()I

    const-string v21, "\u06df\u06e2\u06e4"

    move-object/from16 v4, v25

    goto :goto_10

    :cond_29
    sget v4, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v21, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    div-int v4, v4, v21

    const v21, 0x1ab310

    xor-int v4, v4, v21

    move/from16 v33, v4

    goto/16 :goto_0

    :sswitch_2e
    if-eqz v22, :cond_18

    move-object/from16 v0, p6

    iget v14, v0, Lsn;->g:I

    sget v4, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v21, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    move/from16 v0, v21

    add-int/lit16 v0, v0, -0xdc6

    move/from16 v21, v0

    rem-int v4, v4, v21

    if-ltz v4, :cond_2b

    const/16 v4, 0x31

    sput v4, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    move-object/from16 v4, v28

    :cond_2a
    const-string v21, "\u06e0\u06e4\u06e3"

    invoke-static/range {v21 .. v21}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v21

    move-object/from16 v28, v4

    move/from16 v33, v21

    goto/16 :goto_0

    :cond_2b
    const-string v4, "\u06e2\u06e4\u06e5"

    move-object/from16 v21, v4

    move-object/from16 v29, v16

    goto/16 :goto_6

    :cond_2c
    move-object/from16 v17, v18

    :sswitch_2f
    sget v4, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    if-ltz v4, :cond_2d

    const-string v4, "\u06e6\u06e0\u06e6"

    goto/16 :goto_c

    :cond_2d
    sget v4, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v21, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    rem-int v4, v4, v21

    const v21, -0x1aa7f8

    xor-int v4, v4, v21

    move/from16 v33, v4

    goto/16 :goto_0

    :sswitch_30
    if-eqz v28, :cond_32

    invoke-static {}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۤۥۣ۟()I

    move-result v4

    if-ltz v4, :cond_10

    const/4 v4, 0x2

    sput v4, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    const-string v4, "\u06e1\u06e0\u06e6"

    invoke-static {v4}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v33, v4

    goto/16 :goto_0

    :sswitch_31
    sget v4, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v10, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    div-int/lit16 v10, v10, 0x20f

    add-int/2addr v4, v10

    if-ltz v4, :cond_2e

    invoke-static {}, Landroidx/activity/۟ۥۥۧ۠;->۟ۥۥۤ۟()I

    const-string v4, "\u06e5\u06e1\u06e8"

    invoke-static {v4}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v33, v4

    move v10, v7

    goto/16 :goto_0

    :cond_2e
    const-string v4, "\u06e0\u06e5\u06e4"

    move v10, v7

    goto/16 :goto_1

    :sswitch_32
    sget v4, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v21, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    move/from16 v0, v21

    add-int/lit16 v0, v0, 0x63e

    move/from16 v21, v0

    sub-int v4, v4, v21

    if-ltz v4, :cond_2f

    const/16 v4, 0x5a

    sput v4, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    const-string v4, "\u06e0\u06e3\u06e0"

    invoke-static {v4}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v33, v4

    goto/16 :goto_0

    :cond_2f
    sget v4, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v21, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    or-int v4, v4, v21

    const v21, 0x1ac52d

    add-int v4, v4, v21

    move/from16 v33, v4

    goto/16 :goto_0

    :sswitch_33
    sget v4, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    if-ltz v4, :cond_30

    const/16 v4, 0x33

    sput v4, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    const-string v4, "\u06e2\u06e4\u06e0"

    goto/16 :goto_b

    :cond_30
    sget v4, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v21, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sub-int v4, v4, v21

    const v21, 0x1ab769

    xor-int v4, v4, v21

    move/from16 v33, v4

    goto/16 :goto_0

    :sswitch_34
    move-object/from16 v0, p2

    iget-boolean v4, v0, Ll00;->a:Z

    if-eqz v4, :cond_28

    sget v4, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v12, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    rem-int/lit16 v12, v12, 0x1540

    add-int/2addr v4, v12

    if-gtz v4, :cond_31

    invoke-static {}, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢ۠ۨۦ()I

    const-string v4, "\u06e3\u06df\u06e7"

    invoke-static {v4}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v33, v4

    move/from16 v13, p10

    move v12, v8

    goto/16 :goto_0

    :cond_31
    sget v4, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v12, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    rem-int/2addr v4, v12

    const v12, 0x1ab678

    add-int/2addr v4, v12

    move/from16 v33, v4

    move/from16 v13, p10

    move v12, v8

    goto/16 :goto_0

    :cond_32
    :sswitch_35
    sget v4, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v21, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    move/from16 v0, v21

    mul-int/lit16 v0, v0, -0x1fd8

    move/from16 v21, v0

    div-int v4, v4, v21

    if-eqz v4, :cond_33

    const-string v4, "\u06e6\u06e0\u06e3"

    goto/16 :goto_3

    :cond_33
    sget v4, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v21, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    xor-int v4, v4, v21

    const v21, -0x1abd8d

    xor-int v4, v4, v21

    move/from16 v33, v4

    goto/16 :goto_0

    :sswitch_36
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc5e -> :sswitch_0
        0xdc5f -> :sswitch_19
        0xdc9a -> :sswitch_28
        0xdc9f -> :sswitch_18
        0xdcf7 -> :sswitch_1c
        0x1aa73f -> :sswitch_33
        0x1aa742 -> :sswitch_29
        0x1aa7d9 -> :sswitch_2c
        0x1aa7db -> :sswitch_b
        0x1aa7fd -> :sswitch_1e
        0x1aa817 -> :sswitch_1a
        0x1aaae3 -> :sswitch_5
        0x1aaae8 -> :sswitch_2a
        0x1aab1f -> :sswitch_17
        0x1aab5e -> :sswitch_15
        0x1aab5f -> :sswitch_30
        0x1aab7f -> :sswitch_6
        0x1aab9a -> :sswitch_1b
        0x1aabdd -> :sswitch_7
        0x1aaea0 -> :sswitch_1f
        0x1aaea7 -> :sswitch_34
        0x1aaea9 -> :sswitch_22
        0x1aaec8 -> :sswitch_26
        0x1aaee1 -> :sswitch_31
        0x1aaee7 -> :sswitch_33
        0x1aaf7f -> :sswitch_1a
        0x1aaf98 -> :sswitch_e
        0x1ab2a4 -> :sswitch_35
        0x1ab2e3 -> :sswitch_20
        0x1ab300 -> :sswitch_8
        0x1ab33f -> :sswitch_2b
        0x1ab605 -> :sswitch_2
        0x1ab60b -> :sswitch_12
        0x1ab629 -> :sswitch_36
        0x1ab647 -> :sswitch_2e
        0x1ab685 -> :sswitch_a
        0x1ab6e0 -> :sswitch_13
        0x1ab6e2 -> :sswitch_32
        0x1ab700 -> :sswitch_3
        0x1aba06 -> :sswitch_1d
        0x1aba21 -> :sswitch_4
        0x1aba28 -> :sswitch_36
        0x1abdcc -> :sswitch_1
        0x1abe22 -> :sswitch_2d
        0x1abe41 -> :sswitch_14
        0x1abe66 -> :sswitch_10
        0x1abe7e -> :sswitch_f
        0x1abe9e -> :sswitch_25
        0x1abea2 -> :sswitch_32
        0x1ac189 -> :sswitch_c
        0x1ac1a5 -> :sswitch_27
        0x1ac221 -> :sswitch_18
        0x1ac241 -> :sswitch_2f
        0x1ac261 -> :sswitch_21
        0x1ac5ca -> :sswitch_16
        0x1ac61f -> :sswitch_d
        0x1ac8cb -> :sswitch_21
        0x1ac8cc -> :sswitch_23
        0x1ac96a -> :sswitch_11
        0x1ac96c -> :sswitch_9
        0x1ac9a8 -> :sswitch_24
    .end sparse-switch

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3fb9999a    # 1.45f
        0x3f800000    # 1.0f
    .end array-data
.end method
