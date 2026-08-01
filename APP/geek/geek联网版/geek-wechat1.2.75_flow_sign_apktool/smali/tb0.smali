.class public abstract Ltb0;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ljava/util/ArrayList;

.field public static b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Ltb0;->a:Ljava/util/ArrayList;

    return-void
.end method

.method public static a(Landroid/view/View;IFJ)V
    .locals 25

    const/4 v12, 0x0

    const/4 v11, 0x0

    const/16 v23, 0x0

    const/16 v21, 0x0

    const/16 v20, 0x0

    const/4 v9, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/4 v13, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/4 v8, 0x0

    const/16 v16, 0x0

    const/4 v15, 0x0

    const/4 v2, 0x0

    const-string v3, "\u06df\u06e6\u06e1"

    invoke-static {v3}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v3

    move-object v5, v2

    move v6, v3

    :goto_0
    sparse-switch v6, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    if-ltz v2, :cond_1a

    const/16 v2, 0xd

    sput v2, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    const-string v2, "\u06e5\u06e5\u06df"

    invoke-static {v2}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    move/from16 v20, v21

    goto :goto_0

    :sswitch_1
    const/4 v2, 0x0

    :goto_1
    const-string v3, "\u06e3\u06e0\u06e4"

    move-object v10, v2

    :goto_2
    invoke-static {v3}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto :goto_0

    :sswitch_2
    sget v2, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v3, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    div-int/lit16 v3, v3, 0x152e

    or-int/2addr v2, v3

    if-ltz v2, :cond_0

    const/16 v2, 0x45

    sput v2, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    move-object v2, v10

    goto :goto_1

    :cond_0
    sget v2, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v3, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    or-int/2addr v2, v3

    const v3, 0x1ab8b5

    add-int/2addr v2, v3

    move v6, v2

    goto :goto_0

    :sswitch_3
    const/4 v2, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Landroid/view/View;->setAlpha(F)V

    const v2, -0x7e0602f9

    sget v3, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    xor-int/2addr v2, v3

    invoke-static/range {p3 .. p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    move-object/from16 v0, p0

    invoke-virtual {v0, v2, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    new-instance v2, Lrb0;

    move-object/from16 v3, p0

    move/from16 v4, p1

    move/from16 v5, p2

    move-wide/from16 v6, p3

    invoke-direct/range {v2 .. v7}, Lrb0;-><init>(Landroid/view/View;IFJ)V

    invoke-static {}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۦۥۨۦ()I

    move-result v3

    if-ltz v3, :cond_1

    const-string v3, "\u06df\u06e7\u06e7"

    invoke-static {v3}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v3

    move-object v5, v2

    move v6, v3

    goto :goto_0

    :cond_1
    sget v3, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v4, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    or-int/2addr v3, v4

    const v4, -0x1ab36e

    xor-int/2addr v3, v4

    move-object v5, v2

    move v6, v3

    goto :goto_0

    :sswitch_4
    sget v2, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    if-gtz v2, :cond_2

    const/4 v2, 0x3

    sput v2, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    const-string v2, "\u06e1\u06e2\u06e4"

    invoke-static {v2}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v24, v19

    move v6, v2

    goto/16 :goto_0

    :cond_2
    sget v2, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v3, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    xor-int/2addr v2, v3

    const v3, -0x1ab69b

    xor-int/2addr v2, v3

    move-object/from16 v24, v19

    move v6, v2

    goto/16 :goto_0

    :cond_3
    :sswitch_5
    sget v2, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v3, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    or-int/lit16 v3, v3, 0x9ce

    div-int/2addr v2, v3

    if-eqz v2, :cond_4

    const-string v2, "\u06e1\u06e7\u06df"

    :goto_3
    invoke-static {v2}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_4
    sget v2, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v3, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    mul-int/2addr v2, v3

    const v3, 0x1012a

    add-int/2addr v2, v3

    move v6, v2

    goto/16 :goto_0

    :cond_5
    :sswitch_6
    const-string v2, "\u06e6\u06e6\u06e4"

    :goto_4
    invoke-static {v2}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_6
    :sswitch_7
    sget v2, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v3, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    rem-int/lit16 v3, v3, 0x1b1f

    sub-int/2addr v2, v3

    if-ltz v2, :cond_7

    const-string v2, "\u06e0\u06e7\u06e0"

    :goto_5
    invoke-static {v2}, Landroidx/appcompat/app/۟۟ۥۨۤ;->ۤۤۡۡ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_7
    const-string v2, "\u06e4\u06df\u06e1"

    invoke-static {v2}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :sswitch_8
    move-object/from16 v0, p0

    move/from16 v1, p2

    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationX(F)V

    const/4 v2, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Landroid/view/View;->setTranslationY(F)V

    const/high16 v2, 0x3f800000    # 1.0f

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Landroid/view/View;->setScaleX(F)V

    sget v2, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v3, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    xor-int/lit16 v3, v3, -0x20e7

    xor-int/2addr v2, v3

    if-ltz v2, :cond_9

    :cond_8
    const-string v2, "\u06e4\u06df\u06e6"

    invoke-static {v2}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_9
    const-string v2, "\u06e8\u06e6\u06e4"

    :goto_6
    invoke-static {v2}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :sswitch_9
    invoke-virtual {v15}, Lo40;->c()V

    sget v2, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    if-gtz v2, :cond_a

    const-string v2, "\u06e2\u06e8"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_a
    const-string v2, "\u06e6\u06df\u06df"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :sswitch_a
    sget v2, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    if-gtz v2, :cond_b

    const/4 v2, 0x6

    sput v2, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    const-string v2, "\u06e3\u06e0\u06e1"

    goto :goto_4

    :cond_b
    sget v2, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v3, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    xor-int/2addr v2, v3

    const v3, -0x1ac553

    xor-int/2addr v2, v3

    move v6, v2

    goto/16 :goto_0

    :sswitch_b
    sget v2, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    if-ltz v2, :cond_c

    const-string v2, "\u06e4\u06df\u06e1"

    :goto_7
    invoke-static {v2}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_c
    sget v2, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    sget v3, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    mul-int/2addr v2, v3

    const v3, 0x1e3a26

    add-int/2addr v2, v3

    move v6, v2

    goto/16 :goto_0

    :sswitch_c
    invoke-virtual/range {v24 .. v24}, Lo40;->c()V

    sget v2, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    if-ltz v2, :cond_d

    const/16 v2, 0x30

    sput v2, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    const-string v2, "\u06e5\u06df\u06e3"

    invoke-static {v2}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_d
    sget v2, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v3, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    rem-int/2addr v2, v3

    const v3, 0x1abdb5

    add-int/2addr v2, v3

    move v6, v2

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۥۣ۠ۦ()I

    move-result v2

    if-ltz v2, :cond_e

    const/4 v2, 0x0

    sput v2, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    move-object v2, v11

    move-object v3, v12

    move-object v4, v13

    :goto_8
    const-string v6, "\u06e7\u06e1\u06e5"

    invoke-static {v6}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v6

    move-object v11, v2

    move-object v12, v3

    move-object v14, v4

    goto/16 :goto_0

    :cond_e
    sget v2, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v3, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    add-int/2addr v2, v3

    const v3, 0x1ac86b

    add-int/2addr v2, v3

    move-object v14, v13

    move v6, v2

    goto/16 :goto_0

    :sswitch_e
    sget v2, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v3, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    rem-int/2addr v2, v3

    const v3, 0x1aa8c2

    add-int/2addr v2, v3

    move v6, v2

    goto/16 :goto_0

    :sswitch_f
    const-string v2, "G7DahQ==\n"

    const-string v3, "bdm/8jaDpgs=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-static {v2, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v3, Lkn;->a:Lkn;

    const-string v2, "DJg6pDqFHkwGkyCeAIoEVwqiMI8mhw8=\n"

    const-string v4, "Z/1D+1/raj4=\n"

    invoke-static {v2, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object v4, v14

    goto :goto_8

    :sswitch_10
    const-string v2, "\u06e1\u06e7\u06e0"

    goto/16 :goto_3

    :sswitch_11
    sget-object v2, Lo9;->b:Landroid/os/Handler;

    new-instance v3, Lgn;

    sget v4, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    xor-int/lit16 v4, v4, -0x1f7

    invoke-direct {v3, v4}, Lgn;-><init>(I)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    sget v2, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v3, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    add-int/lit16 v3, v3, 0xc25

    add-int/2addr v2, v3

    if-gtz v2, :cond_f

    :cond_f
    const-string v2, "\u06e6\u06df\u06e2"

    invoke-static {v2}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :sswitch_12
    if-eqz v15, :cond_1c

    sget v2, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    if-gtz v2, :cond_10

    invoke-static {}, Landroidx/activity/۟ۥۥۧ۠;->۟ۥۥۤ۟()I

    const-string v2, "\u06e7\u06e7"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_10
    const-string v2, "\u06e0\u06e0\u06e5"

    move-object v3, v2

    goto/16 :goto_2

    :sswitch_13
    move-object v2, v8

    check-cast v2, Lo40;

    sget v3, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v4, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    add-int/2addr v3, v4

    const v4, 0xdd9d

    add-int/2addr v3, v4

    move-object/from16 v16, v2

    move v6, v3

    goto/16 :goto_0

    :sswitch_14
    sget v2, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v3, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    or-int/lit16 v3, v3, 0x553

    div-int/2addr v2, v3

    if-eqz v2, :cond_11

    const-string v2, "\u06e6\u06e1\u06df"

    invoke-static {v2}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_11
    sget v2, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v3, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    div-int/2addr v2, v3

    const v3, 0x1aaf83

    add-int/2addr v2, v3

    move v6, v2

    goto/16 :goto_0

    :sswitch_15
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewPropertyAnimator;->cancel()V

    const v2, 0x7e07015e

    sget v3, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    xor-int/2addr v2, v3

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v9

    instance-of v3, v9, Lo40;

    sget v2, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v4, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    mul-int/lit16 v4, v4, -0x21ea

    add-int/2addr v2, v4

    if-ltz v2, :cond_12

    move-object v2, v15

    :goto_9
    const-string v4, "\u06e1\u06e0\u06e6"

    invoke-static {v4}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v4

    move-object v15, v2

    move/from16 v17, v3

    move v6, v4

    goto/16 :goto_0

    :cond_12
    const-string v2, "\u06e2\u06e7\u06df"

    :goto_a
    invoke-static {v2}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v17, v3

    move v6, v2

    goto/16 :goto_0

    :cond_13
    move-object/from16 v15, v18

    :sswitch_16
    sget v2, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v3, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    mul-int/2addr v2, v3

    const v3, 0x18ffbb

    add-int/2addr v2, v3

    move v6, v2

    goto/16 :goto_0

    :sswitch_17
    const v2, -0x7e0701fc

    sget v3, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    xor-int/2addr v2, v3

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v8

    instance-of v2, v8, Lo40;

    if-eqz v2, :cond_13

    sget v2, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v3, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    or-int/2addr v2, v3

    const v3, -0x1ab362

    xor-int/2addr v2, v3

    move-object/from16 v15, v18

    move v6, v2

    goto/16 :goto_0

    :sswitch_18
    if-eqz v24, :cond_26

    sget v2, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    if-ltz v2, :cond_14

    const/16 v2, 0x52

    sput v2, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    const-string v2, "\u06e3\u06e7\u06e8"

    move/from16 v3, v17

    goto :goto_a

    :cond_14
    const-string v2, "\u06e7\u06e7\u06e3"

    :goto_b
    invoke-static {v2}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :sswitch_19
    invoke-virtual {v14}, Lo40;->c()V

    sget v2, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v3, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    div-int/lit16 v3, v3, -0x158b

    xor-int/2addr v2, v3

    if-gtz v2, :cond_15

    invoke-static {}, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۦۣ۠()I

    const-string v2, "\u06e3\u06e2"

    invoke-static {v2}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_15
    const-string v2, "\u06e6\u06e6\u06e4"

    move-object v3, v2

    :goto_c
    invoke-static {v3}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :sswitch_1a
    if-eqz v20, :cond_21

    const/4 v2, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Landroid/view/View;->setTranslationX(F)V

    const/high16 v2, 0x437a0000    # 250.0f

    invoke-static {v2}, Lmp;->p(F)F

    move-result v2

    neg-float v2, v2

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Landroid/view/View;->setTranslationY(F)V

    invoke-static {}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟۠ۢۧۡ()I

    move-result v2

    if-ltz v2, :cond_17

    const/16 v2, 0x9

    sput v2, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    move-object/from16 v2, v19

    :cond_16
    const-string v3, "\u06e8\u06e8\u06df"

    invoke-static {v3}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v19, v2

    move v6, v3

    goto/16 :goto_0

    :cond_17
    sget v2, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v3, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    add-int/2addr v2, v3

    const v3, -0xddfd

    xor-int/2addr v2, v3

    move v6, v2

    goto/16 :goto_0

    :sswitch_1b
    const v2, 0x3f666666    # 0.9f

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Landroid/view/View;->setScaleX(F)V

    const v2, 0x3f666666    # 0.9f

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Landroid/view/View;->setScaleY(F)V

    sget v2, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    if-gtz v2, :cond_18

    invoke-static {}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۨ۠۟()I

    const-string v2, "\u06e6\u06e6\u06e4"

    invoke-static {v2}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_18
    const-string v2, "\u06e6\u06e4"

    move-object v3, v2

    :goto_d
    invoke-static {v3}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :sswitch_1c
    const/high16 v2, 0x3f800000    # 1.0f

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Landroid/view/View;->setScaleY(F)V

    sget v2, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v3, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    or-int/lit16 v3, v3, -0x237d

    add-int/2addr v2, v3

    if-ltz v2, :cond_19

    move/from16 v2, v20

    :goto_e
    const-string v3, "\u06e7\u06e6\u06e1"

    invoke-static {v3}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v3

    move v6, v3

    move/from16 v20, v2

    goto/16 :goto_0

    :cond_19
    sget v2, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v3, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sub-int/2addr v2, v3

    const v3, 0x1aadef

    add-int/2addr v2, v3

    move v6, v2

    goto/16 :goto_0

    :cond_1a
    move/from16 v2, v21

    goto :goto_e

    :sswitch_1d
    invoke-static {}, Lcom/google/android/material/carousel/ۢۢۢۥ;->۟ۡ۟۠ۧ()I

    move-result v2

    if-gtz v2, :cond_1b

    invoke-static {}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۤۥۣ۟()I

    const-string v2, "\u06e8\u06e2\u06e2"

    invoke-static {v2}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_1b
    const-string v2, "\u06e1\u06e2\u06e4"

    invoke-static {v2}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_1c
    :sswitch_1e
    invoke-static {}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣۤۧۥ()I

    move-result v2

    if-gtz v2, :cond_1d

    const-string v2, "\u06e4\u06e1\u06e1"

    invoke-static {v2}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_1d
    sget v2, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v3, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    rem-int/2addr v2, v3

    const v3, 0x1ac3d9

    xor-int/2addr v2, v3

    move v6, v2

    goto/16 :goto_0

    :cond_1e
    :sswitch_1f
    sget v2, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v3, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    rem-int/lit16 v3, v3, 0x141e

    sub-int/2addr v2, v3

    if-gtz v2, :cond_1f

    const-string v2, "\u06e6\u06e5\u06e6"

    invoke-static {v2}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_1f
    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v3, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    mul-int/2addr v2, v3

    const v3, 0x1a43c9

    xor-int/2addr v2, v3

    move v6, v2

    goto/16 :goto_0

    :sswitch_20
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x1

    invoke-static {v11, v2}, Lkn;->b(Ljava/lang/String;I)I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_3

    const/16 v23, 0x1

    invoke-static {}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۟ۢۢ()I

    move-result v2

    if-gtz v2, :cond_20

    const/4 v2, 0x2

    sput v2, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    const-string v2, "\u06e0\u06e0\u06e5"

    invoke-static {v2}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_20
    sget v2, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v3, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    rem-int/2addr v2, v3

    const v3, 0x1abe73

    xor-int/2addr v2, v3

    move v6, v2

    goto/16 :goto_0

    :sswitch_21
    const/16 v18, 0x0

    if-eqz v17, :cond_28

    move-object v2, v9

    check-cast v2, Lo40;

    sget v3, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v4, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    or-int/lit16 v4, v4, -0xd46

    xor-int/2addr v3, v4

    if-ltz v3, :cond_2b

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۥۥۢۧ()I

    const-string v3, "\u06e2\u06e7\u06df"

    invoke-static {v3}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v3

    move-object v13, v2

    move v6, v3

    goto/16 :goto_0

    :cond_21
    :sswitch_22
    sget v2, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v3, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    mul-int/lit16 v3, v3, 0x22ff

    or-int/2addr v2, v3

    if-ltz v2, :cond_22

    const-string v2, "\u06e5\u06e1\u06e0"

    invoke-static {v2}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_22
    sget v2, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v3, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    mul-int/2addr v2, v3

    const v3, 0x1c34c9

    add-int/2addr v2, v3

    move v6, v2

    goto/16 :goto_0

    :sswitch_23
    sget v2, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    if-ltz v2, :cond_24

    move-object/from16 v2, v22

    :cond_23
    const-string v3, "\u06e6\u06e1\u06e7"

    move-object/from16 v22, v2

    goto/16 :goto_c

    :cond_24
    sget v2, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v3, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sub-int/2addr v2, v3

    const v3, -0x1abc84

    xor-int/2addr v2, v3

    move v6, v2

    goto/16 :goto_0

    :sswitch_24
    const v2, -0x7e070312

    sget v3, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    xor-int/2addr v2, v3

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lo40;

    if-eqz v3, :cond_6

    check-cast v2, Lo40;

    invoke-static {}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۥۧۤ۠()I

    move-result v3

    if-ltz v3, :cond_16

    invoke-static {}, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۡۥ()I

    const-string v3, "\u06e2\u06e6\u06e1"

    invoke-static {v3}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠ۡۤ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v19, v2

    move v6, v3

    goto/16 :goto_0

    :sswitch_25
    sget v2, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v3, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    add-int/lit16 v3, v3, -0x19f6

    xor-int/2addr v2, v3

    if-gtz v2, :cond_25

    invoke-static {}, Landroid/window/ۣۤ۠ۢ;->ۧۢۦ۟()I

    const-string v2, "\u06e8\u06df\u06e7"

    invoke-static {v2}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v15, v16

    move v6, v2

    goto/16 :goto_0

    :cond_25
    move-object/from16 v2, v16

    move/from16 v3, v17

    goto/16 :goto_9

    :sswitch_26
    const/16 v21, 0x0

    const-string v2, "\u06e0\u06e8"

    goto/16 :goto_7

    :cond_26
    :sswitch_27
    sget v2, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    if-ltz v2, :cond_27

    const/16 v2, 0x23

    sput v2, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    const-string v2, "\u06e6\u06e5"

    goto/16 :goto_b

    :cond_27
    const-string v2, "\u06e5\u06e1\u06e1"

    goto/16 :goto_5

    :sswitch_28
    sget v2, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v3, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    xor-int/2addr v2, v3

    const v3, 0x1aab1d

    add-int/2addr v2, v3

    move v6, v2

    goto/16 :goto_0

    :cond_28
    :sswitch_29
    sget v2, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    if-gtz v2, :cond_29

    const/16 v2, 0x30

    sput v2, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    const-string v2, "\u06e0\u06e4\u06e5"

    goto/16 :goto_6

    :cond_29
    const-string v2, "\u06df\u06e6\u06e4"

    invoke-static {v2}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :sswitch_2a
    sget-object v2, Ltb0;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-boolean v2, Ltb0;->b:Z

    if-nez v2, :cond_1e

    const/4 v2, 0x1

    sput-boolean v2, Ltb0;->b:Z

    sget v2, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v3, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    rem-int/2addr v2, v3

    const v3, 0x1abd08

    add-int/2addr v2, v3

    move v6, v2

    goto/16 :goto_0

    :sswitch_2b
    const/4 v2, 0x0

    sget v3, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    if-gtz v3, :cond_23

    const/16 v3, 0x21

    sput v3, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    const-string v3, "\u06e8\u06e6\u06e4"

    invoke-static {v3}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v22, v2

    move v6, v3

    goto/16 :goto_0

    :sswitch_2c
    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۨۦ۠ۡ()I

    move-result v2

    if-ltz v2, :cond_2a

    const/16 v2, 0x35

    sput v2, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    const-string v2, "\u06e5\u06e7\u06e2"

    invoke-static {v2}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v2

    move-object v14, v10

    move v6, v2

    goto/16 :goto_0

    :cond_2a
    const-string v2, "\u06df\u06e4\u06e4"

    move-object/from16 v3, v24

    move-object v14, v10

    :goto_f
    invoke-static {v2}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v24, v3

    move v6, v2

    goto/16 :goto_0

    :sswitch_2d
    sget v2, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    sget v3, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    div-int/lit16 v3, v3, 0x761

    add-int/2addr v2, v3

    if-gtz v2, :cond_2c

    move-object v2, v13

    move/from16 v20, v23

    :cond_2b
    const-string v3, "\u06e5\u06df\u06df"

    move-object v13, v2

    goto/16 :goto_d

    :cond_2c
    sget v2, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v3, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sub-int/2addr v2, v3

    const v3, 0x1aaf69

    add-int/2addr v2, v3

    move v6, v2

    move/from16 v20, v23

    goto/16 :goto_0

    :sswitch_2e
    invoke-static {}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟ۧ۟ۥۧ()I

    move-result v2

    if-gtz v2, :cond_2d

    invoke-static {}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۡۢۨۥ()I

    const-string v2, "\u06df\u06e6\u06e1"

    move-object/from16 v3, v22

    goto :goto_f

    :cond_2d
    const-string v2, "\u06e1\u06e7\u06e8"

    invoke-static {v2}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v24, v22

    move v6, v2

    goto/16 :goto_0

    :sswitch_2f
    if-eqz v14, :cond_5

    sget v2, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v3, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    xor-int/lit16 v3, v3, -0x813

    xor-int/2addr v2, v3

    if-ltz v2, :cond_8

    const/16 v2, 0xc

    sput v2, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    const-string v2, "\u06e7\u06e7\u06e3"

    invoke-static {v2}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :sswitch_30
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc08 -> :sswitch_0
        0xdc27 -> :sswitch_27
        0xdc46 -> :sswitch_1b
        0xdc5f -> :sswitch_29
        0xdcba -> :sswitch_26
        0xdcbe -> :sswitch_2
        0xdce0 -> :sswitch_25
        0x1aa79f -> :sswitch_2f
        0x1aa7ba -> :sswitch_10
        0x1aa7da -> :sswitch_f
        0x1aa7dd -> :sswitch_1
        0x1aa7ff -> :sswitch_e
        0x1aaae5 -> :sswitch_9
        0x1aab9a -> :sswitch_16
        0x1aabd9 -> :sswitch_b
        0x1aaea7 -> :sswitch_12
        0x1aaee3 -> :sswitch_14
        0x1aaf7a -> :sswitch_3
        0x1aaf82 -> :sswitch_18
        0x1ab246 -> :sswitch_28
        0x1ab301 -> :sswitch_13
        0x1ab31d -> :sswitch_2a
        0x1ab33a -> :sswitch_21
        0x1ab627 -> :sswitch_2c
        0x1ab6a2 -> :sswitch_1d
        0x1ab6a4 -> :sswitch_10
        0x1ab704 -> :sswitch_5
        0x1ab9c6 -> :sswitch_2b
        0x1ab9cb -> :sswitch_19
        0x1abd85 -> :sswitch_d
        0x1abd89 -> :sswitch_7
        0x1abd8c -> :sswitch_11
        0x1abdc5 -> :sswitch_17
        0x1abde8 -> :sswitch_1e
        0x1abe3f -> :sswitch_28
        0x1abe63 -> :sswitch_2d
        0x1abe80 -> :sswitch_22
        0x1ac146 -> :sswitch_1a
        0x1ac149 -> :sswitch_30
        0x1ac18c -> :sswitch_2e
        0x1ac1ca -> :sswitch_a
        0x1ac224 -> :sswitch_24
        0x1ac226 -> :sswitch_a
        0x1ac54b -> :sswitch_20
        0x1ac5aa -> :sswitch_6
        0x1ac5e2 -> :sswitch_15
        0x1ac603 -> :sswitch_c
        0x1ac8d0 -> :sswitch_23
        0x1ac928 -> :sswitch_1f
        0x1ac969 -> :sswitch_8
        0x1ac9a6 -> :sswitch_1c
        0x1ac9c4 -> :sswitch_14
        0x1ac9df -> :sswitch_4
    .end sparse-switch
.end method
