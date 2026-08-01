.class public abstract Lmn;
.super Ljava/lang/Object;


# static fields
.field public static final a:Landroid/graphics/Typeface;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x0

    const-string v1, "\u06e4\u06e6\u06df"

    invoke-static {v1}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v1, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v2, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    xor-int/2addr v1, v2

    const v2, 0x1abcd2

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_1
    sput-object v0, Lmn;->a:Landroid/graphics/Typeface;

    const-string v1, "\u06e0\u06e2\u06e5"

    :goto_1
    invoke-static {v1}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_2
    const-string v1, "US4tHcubctwccmE=\n"

    const-string v2, "MlxIfL/+WvI=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_2
    const-string v1, "\u06e6\u06e3\u06e0"

    goto :goto_1

    :sswitch_3
    const-string v0, "4fDJ0t3QONX794rMlcc00v8=\n"

    const-string v1, "kpGnofCjXac=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v0

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟ۢۡ۟۟()I

    move-result v1

    if-gtz v1, :cond_0

    invoke-static {}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۢۡۤ()I

    goto :goto_2

    :cond_0
    const-string v1, "\u06e7\u06e3"

    goto :goto_1

    :sswitch_4
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc42 -> :sswitch_0
        0xdcdc -> :sswitch_2
        0x1aab23 -> :sswitch_4
        0x1aba9d -> :sswitch_3
        0x1ac1c3 -> :sswitch_1
    .end sparse-switch
.end method

.method public static a(Landroid/app/Dialog;)V
    .locals 18

    const/4 v3, 0x0

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v9, 0x0

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v12, 0x0

    const-string v13, "\u06e8\u06e2"

    invoke-static {v13}, Landroid/app/۟ۦۦۤۥ;->ۦۨۥ۟(Ljava/lang/Object;)I

    move-result v16

    move-object v13, v4

    move-object v14, v10

    move v15, v11

    :goto_0
    sparse-switch v16, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    sget v4, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    xor-int/lit16 v4, v4, 0x225

    invoke-virtual {v3, v4}, Landroid/view/Window;->addFlags(I)V

    const v4, 0x400005d

    sget v10, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    xor-int/2addr v4, v10

    invoke-virtual {v3, v4}, Landroid/view/Window;->clearFlags(I)V

    sget v4, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v10, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    add-int/lit16 v10, v10, 0x770

    mul-int/2addr v4, v10

    if-ltz v4, :cond_13

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۣۤۧ()I

    const-string v4, "\u06e1\u06e4\u06e5"

    invoke-static {v4}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v16, v4

    goto :goto_0

    :sswitch_2
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v2, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    xor-int/lit16 v2, v2, -0x2f8

    invoke-static {v6, v2}, Lgn;->b(Ljava/lang/String;I)I

    move-result v2

    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۢۨۨۤ()I

    move-result v4

    if-ltz v4, :cond_1

    const/16 v4, 0xb

    sput v4, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    :cond_0
    const-string v4, "\u06e8\u06e6\u06e2"

    invoke-static {v4}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v16, v4

    goto :goto_0

    :cond_1
    sget v4, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v10, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    xor-int/2addr v4, v10

    const v10, 0x1ab721

    add-int/2addr v4, v10

    move/from16 v16, v4

    goto :goto_0

    :sswitch_3
    const-string v3, "4CBPFeHH\n"

    const-string v4, "hEkueY6gETs=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, p0

    invoke-static {v3, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v3

    sget v4, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    if-ltz v4, :cond_2

    invoke-static {}, L۠ۡۢۨ;->ۥۡ۠ۨ()I

    const-string v4, "\u06e6\u06e1\u06e1"

    invoke-static {v4}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v16, v4

    goto :goto_0

    :cond_2
    const-string v4, "\u06e7\u06e1\u06e4"

    :goto_1
    invoke-static {v4}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v16, v4

    goto :goto_0

    :sswitch_4
    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v4, v15}, Ljava/io/PrintStream;->println(I)V

    sget v4, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v10, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    add-int/lit16 v10, v10, -0xc76

    or-int/2addr v4, v10

    if-ltz v4, :cond_3

    invoke-static {}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۢۧۥۧ()I

    const-string v4, "\u06e1\u06e0"

    goto :goto_1

    :cond_3
    const-string v4, "\u06e1\u06e0"

    move-object v10, v4

    move v11, v8

    :goto_2
    invoke-static {v10}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v4

    move v8, v11

    move/from16 v16, v4

    goto/16 :goto_0

    :sswitch_5
    const/4 v4, 0x2

    new-array v4, v4, [F

    fill-array-data v4, :array_0

    invoke-static {v4}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v4

    new-instance v10, Ljn;

    invoke-direct {v10, v3, v8, v2}, Ljn;-><init>(Landroid/view/Window;ZI)V

    invoke-virtual {v4, v10}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    sget v10, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v11, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    add-int/lit16 v11, v11, 0x2282

    mul-int/2addr v10, v11

    if-ltz v10, :cond_8

    const/16 v10, 0x3a

    sput v10, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    const-string v10, "\u06df\u06e4\u06e7"

    move v11, v9

    :goto_3
    invoke-static {v10}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v10

    move-object v12, v4

    move v9, v11

    move/from16 v16, v10

    goto/16 :goto_0

    :sswitch_6
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x1f

    if-lt v4, v8, :cond_e

    const-string v8, "\u06e7\u06e8\u06e6"

    move-object v4, v5

    move-object v10, v8

    move v11, v7

    :goto_4
    invoke-static {v10}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v10

    move-object v5, v4

    move v8, v11

    move/from16 v16, v10

    goto/16 :goto_0

    :sswitch_7
    const/4 v7, 0x0

    new-instance v4, Landroid/graphics/drawable/ColorDrawable;

    const/4 v10, 0x0

    invoke-direct {v4, v10}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v3, v4}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-static {}, Landroid/app/ۣۢۤۥ;->ۣۤۧۧ()I

    move-result v4

    if-gtz v4, :cond_4

    invoke-static {}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۦ۟ۥۣ()I

    move-object v4, v5

    :goto_5
    const-string v5, "\u06e0\u06e6\u06e6"

    invoke-static {v5}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v10

    move-object v5, v4

    move/from16 v16, v10

    goto/16 :goto_0

    :cond_4
    sget v4, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v10, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    rem-int/2addr v4, v10

    const v10, 0xdb67

    add-int/2addr v4, v10

    move/from16 v16, v4

    goto/16 :goto_0

    :sswitch_8
    sget v4, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    xor-int/lit16 v4, v4, -0x358

    invoke-virtual {v3, v4, v4}, Landroid/view/Window;->setLayout(II)V

    invoke-static {}, Landroidx/core/widget/ۣۤۨۢ;->ۥۢۡۥ()I

    move-result v4

    if-ltz v4, :cond_5

    const/16 v4, 0x5e

    sput v4, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    move v4, v8

    :goto_6
    const-string v8, "\u06e6\u06e3"

    move-object v10, v8

    move v11, v4

    goto/16 :goto_2

    :cond_5
    const-string v4, "\u06e2\u06e3\u06e2"

    :goto_7
    invoke-static {v4}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۣ۠ۧۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v16, v4

    goto/16 :goto_0

    :sswitch_9
    sget-object v4, Lgn;->a:Lgn;

    const-string v5, "1rxcScAIdfHNhkd6xRVa7dOtQHjDDnH9\n"

    const-string v6, "vdklFrBnBYQ=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    sget v6, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v10, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    rem-int/lit16 v10, v10, 0x18bc

    or-int/2addr v6, v10

    if-gtz v6, :cond_6

    const-string v10, "\u06e6\u06e3\u06e0"

    move-object v6, v5

    move v11, v8

    goto :goto_4

    :cond_6
    move-object v6, v5

    goto :goto_5

    :sswitch_a
    invoke-virtual {v12}, Landroid/animation/ValueAnimator;->start()V

    sget v4, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v10, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    mul-int/lit16 v10, v10, -0xf92

    xor-int/2addr v4, v10

    if-ltz v4, :cond_7

    invoke-static {}, Landroid/app/۟ۦۦۤۥ;->ۣۡ۠ۢ()I

    const-string v4, "\u06e8\u06e1\u06e8"

    invoke-static {v4}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v16, v4

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u06e2\u06e8\u06e5"

    :goto_8
    invoke-static {v4}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v16, v4

    goto/16 :goto_0

    :sswitch_b
    new-instance v4, Landroid/view/animation/DecelerateInterpolator;

    const/high16 v10, 0x3fc00000    # 1.5f

    invoke-direct {v4, v10}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    invoke-virtual {v12, v4}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    const-wide/16 v10, 0x3d

    sget v4, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    int-to-long v0, v4

    move-wide/from16 v16, v0

    xor-long v10, v10, v16

    invoke-virtual {v12, v10, v11}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    invoke-static {}, Landroidx/core/content/ۥۨۤۦ;->۟۠۠۠ۥ()I

    move-result v4

    if-ltz v4, :cond_9

    move-object v4, v12

    :cond_8
    const-string v10, "\u06e1\u06e3\u06e5"

    invoke-static {v10}, Landroidx/core/content/ۣ۟ۧ۠;->ۥۦۤ۠(Ljava/lang/Object;)I

    move-result v10

    move-object v12, v4

    move/from16 v16, v10

    goto/16 :goto_0

    :cond_9
    sget v4, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v10, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    add-int/2addr v4, v10

    const v10, -0x1aa627

    xor-int/2addr v4, v10

    move/from16 v16, v4

    goto/16 :goto_0

    :sswitch_c
    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/view/Window;->setDimAmount(F)V

    const v4, -0x7fffff96

    sget v10, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    xor-int/2addr v4, v10

    invoke-virtual {v3, v4}, Landroid/view/Window;->addFlags(I)V

    sget v4, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    if-ltz v4, :cond_0

    const/16 v4, 0x5a

    sput v4, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    const-string v4, "\u06e8\u06e2"

    invoke-static {v4}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v16, v4

    goto/16 :goto_0

    :sswitch_d
    sget v4, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v10, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    add-int/lit16 v10, v10, 0x21fb

    sub-int/2addr v4, v10

    if-ltz v4, :cond_a

    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۢۨۨۤ()I

    const-string v4, "\u06df\u06e4\u06e2"

    goto/16 :goto_7

    :cond_a
    sget v4, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v10, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sub-int/2addr v4, v10

    const v10, 0xdb03

    add-int/2addr v4, v10

    move/from16 v16, v4

    goto/16 :goto_0

    :sswitch_e
    sget v4, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v8, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    add-int/lit16 v8, v8, -0x124

    or-int/2addr v4, v8

    if-ltz v4, :cond_b

    const-string v4, "\u06df\u06e4\u06e4"

    invoke-static {v4}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v4

    move v8, v9

    move/from16 v16, v4

    goto/16 :goto_0

    :cond_b
    move v4, v9

    goto/16 :goto_6

    :sswitch_f
    if-nez v3, :cond_16

    invoke-static {}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۢۨۤ۟()I

    move-result v4

    if-gtz v4, :cond_11

    sget v4, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v10, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    rem-int/lit16 v10, v10, -0x10c8

    sub-int/2addr v4, v10

    if-gtz v4, :cond_c

    const/16 v4, 0x1a

    sput v4, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    const-string v4, "\u06e3\u06df\u06e5"

    :goto_9
    invoke-static {v4}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v16, v4

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06e6\u06e3\u06e0"

    :goto_a
    invoke-static {v4}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v16, v4

    goto/16 :goto_0

    :sswitch_10
    sget-object v10, Lgn;->a:Lgn;

    const-string v4, "cVa+vY3F1J5qbKWOiNj7hHQ=\n"

    const-string v11, "GjPH4v2qpOs=\n"

    invoke-static {v4, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    sget v11, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v13, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    add-int/lit16 v13, v13, 0xc9d

    div-int/2addr v11, v13

    if-eqz v11, :cond_d

    const-string v11, "\u06e0\u06e6\u06e8"

    invoke-static {v11}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v11

    move-object v13, v4

    move-object v14, v10

    move/from16 v16, v11

    goto/16 :goto_0

    :cond_d
    const-string v11, "\u06e7\u06e5\u06e3"

    invoke-static {v11}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v11

    move-object v13, v4

    move-object v14, v10

    move/from16 v16, v11

    goto/16 :goto_0

    :cond_e
    move v8, v7

    :cond_f
    :sswitch_11
    sget v4, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v10, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    xor-int/lit16 v10, v10, 0x1bcb

    add-int/2addr v4, v10

    if-ltz v4, :cond_10

    const/16 v4, 0x13

    sput v4, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    const-string v4, "\u06e4\u06e4\u06e7"

    :goto_b
    invoke-static {v4}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v16, v4

    goto/16 :goto_0

    :cond_10
    const-string v4, "\u06e6\u06e3"

    goto :goto_b

    :cond_11
    :sswitch_12
    sget v4, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v10, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    add-int/lit16 v10, v10, 0x6f5

    xor-int/2addr v4, v10

    if-gtz v4, :cond_12

    const-string v4, "\u06e2\u06e3"

    goto :goto_a

    :cond_12
    sget v4, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v10, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sub-int/2addr v4, v10

    const v10, 0xded6

    add-int/2addr v4, v10

    move/from16 v16, v4

    goto/16 :goto_0

    :sswitch_13
    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/view/Window;->setStatusBarColor(I)V

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/view/Window;->setNavigationBarColor(I)V

    sget v4, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    if-gtz v4, :cond_14

    const/16 v4, 0x32

    sput v4, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    :cond_13
    const-string v4, "\u06df\u06df\u06e3"

    goto/16 :goto_8

    :cond_14
    const-string v4, "\u06e8\u06e1\u06e8"

    goto/16 :goto_9

    :sswitch_14
    const/4 v4, 0x1

    invoke-static {v13, v4}, Lgn;->a(Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_f

    const/4 v11, 0x1

    const-string v9, "\u06e6\u06e2\u06e8"

    move-object v4, v12

    move-object v10, v9

    goto/16 :goto_3

    :sswitch_15
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v4, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v8, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    add-int/lit16 v8, v8, -0xfb3

    rem-int/2addr v4, v8

    if-ltz v4, :cond_15

    const-string v4, "\u06e6\u06e2\u06e8"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v4

    move v8, v7

    move/from16 v16, v4

    goto/16 :goto_0

    :cond_15
    const-string v4, "\u06df\u06e4\u06e7"

    move v8, v7

    goto :goto_b

    :cond_16
    :sswitch_16
    const-string v4, "\u06e6\u06e1\u06e1"

    goto/16 :goto_7

    :sswitch_17
    const-string v4, "hiQl3zLSXfNOKagSG9uY4dIkRnb"

    invoke-static {v4}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۨۢۧۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    sget v10, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v11, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    div-int/2addr v10, v11

    const v11, 0x1aaba2

    xor-int/2addr v10, v11

    move v15, v4

    move/from16 v16, v10

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdc1f -> :sswitch_0
        0xdc9b -> :sswitch_12
        0xdcbd -> :sswitch_9
        0xdcc1 -> :sswitch_c
        0xdcfa -> :sswitch_3
        0x1aa703 -> :sswitch_13
        0x1aa79f -> :sswitch_a
        0x1aa7a2 -> :sswitch_14
        0x1aaba0 -> :sswitch_2
        0x1aaba2 -> :sswitch_4
        0x1aabde -> :sswitch_16
        0x1aaf03 -> :sswitch_b
        0x1aaf22 -> :sswitch_11
        0x1ab2c1 -> :sswitch_7
        0x1ab35f -> :sswitch_0
        0x1ab609 -> :sswitch_5
        0x1ac149 -> :sswitch_d
        0x1ac186 -> :sswitch_8
        0x1ac1ac -> :sswitch_e
        0x1ac1c3 -> :sswitch_17
        0x1ac54a -> :sswitch_f
        0x1ac5c5 -> :sswitch_15
        0x1ac625 -> :sswitch_10
        0x1ac90f -> :sswitch_6
        0x1ac9a4 -> :sswitch_1
    .end sparse-switch

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public static b(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lon;Lsm;)V
    .locals 32

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/4 v4, 0x0

    const/4 v14, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v8, 0x0

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v5, 0x0

    const/4 v15, 0x0

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/16 v16, 0x0

    const/16 v31, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v19, 0x0

    const/4 v10, 0x0

    const/4 v2, 0x0

    const-string v24, "\u06e3\u06e3"

    invoke-static/range {v24 .. v24}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v30

    move-object/from16 v24, v2

    move-object/from16 v25, v4

    move-object/from16 v26, v5

    move/from16 v27, v7

    move/from16 v28, v14

    move/from16 v29, v16

    :goto_0
    sparse-switch v30, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    sget v2, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    if-gtz v2, :cond_15

    const/4 v2, 0x6

    sput v2, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    const-string v2, "\u06e3\u06e4"

    :goto_1
    invoke-static {v2}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v30, v2

    goto :goto_0

    :sswitch_1
    new-instance v3, Landroid/widget/EditText;

    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    sget-object v2, Lgn;->a:Lgn;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static/range {p3 .. p4}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v3, v11}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v2, 0x41900000    # 18.0f

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setTextSize(F)V

    sget v2, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    if-ltz v2, :cond_1

    const-string v2, "\u06e8\u06e7\u06e0"

    :goto_2
    invoke-static {v2}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v30, v2

    goto :goto_0

    :cond_1
    const-string v2, "\u06df\u06e7\u06e8"

    goto :goto_2

    :sswitch_2
    const-string v2, "JqVq\n"

    const-string v4, "SsQeMPDtJ74=\n"

    invoke-static {v2, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v2, v4}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-nez v2, :cond_8

    const-string v2, "cMc2\n"

    const-string v4, "HKlRLwTCR18=\n"

    invoke-static {v2, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v2, v4}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-nez v2, :cond_8

    const-string v2, "ebmq\n"

    const-string v4, "D9jGYRFOmV8=\n"

    invoke-static {v2, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v2, v4}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-nez v2, :cond_8

    const-string v2, "lsp/\n"

    const-string v4, "+q8RrFj324s=\n"

    invoke-static {v2, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v2, v4}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-nez v2, :cond_8

    const-string v2, "nMmuUOuISs+Uzg==\n"

    const-string v4, "8bzCJIL4JqY=\n"

    invoke-static {v2, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v2, v4}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-nez v2, :cond_8

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۣۡۧۢ()I

    move-result v2

    if-gtz v2, :cond_2

    const/16 v2, 0x5d

    sput v2, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    const-string v2, "\u06e8\u06e7\u06e2"

    invoke-static {v2}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v30, v2

    goto/16 :goto_0

    :cond_2
    sget v2, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v4, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    or-int/2addr v2, v4

    const v4, 0x1abba2

    add-int/2addr v2, v4

    move/from16 v30, v2

    goto/16 :goto_0

    :sswitch_3
    invoke-static {}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟ۢۧۨۡ()I

    move-result v2

    if-gtz v2, :cond_1a

    const-string v2, "uTZH"

    invoke-static {v2}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۣۨۢۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    sget v4, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v5, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    xor-int/lit16 v5, v5, -0xa63

    div-int/2addr v4, v5

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    sput v4, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    const-string v4, "\u06e2\u06e4"

    invoke-static {v4}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v24, v2

    move/from16 v30, v4

    goto/16 :goto_0

    :cond_3
    sget v4, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v5, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    xor-int/2addr v4, v5

    const v5, -0x1ab18d

    xor-int/2addr v4, v5

    move-object/from16 v24, v2

    move/from16 v30, v4

    goto/16 :goto_0

    :sswitch_4
    sget v2, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v4, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sub-int/2addr v2, v4

    const v4, 0x1ac621

    add-int/2addr v2, v4

    move/from16 v30, v2

    goto/16 :goto_0

    :cond_4
    :sswitch_5
    const-string v2, "\u06e3\u06e5\u06e8"

    invoke-static {v2}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v30, v2

    goto/16 :goto_0

    :sswitch_6
    sget v2, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v4, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    add-int/2addr v2, v4

    const v4, 0x1aaf00

    add-int/2addr v2, v4

    move/from16 v30, v2

    goto/16 :goto_0

    :sswitch_7
    sget v2, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v4, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    add-int/2addr v2, v4

    const v4, 0x1acbed

    xor-int/2addr v2, v4

    move/from16 v30, v2

    goto/16 :goto_0

    :sswitch_8
    new-instance v2, Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-direct {v2, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v4, "EdIoKThUdJtrlitZ\n"

    const-string v5, "9nOGwZbwkCQ=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget v4, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    xor-int/lit8 v4, v4, -0x19

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setGravity(I)V

    move/from16 v0, v21

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v4, 0x41700000    # 15.0f

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextSize(F)V

    sget v4, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    if-gtz v4, :cond_5

    move v4, v11

    :goto_3
    const-string v11, "\u06e8\u06e8"

    move-object v5, v12

    move-object v10, v2

    move-object v7, v13

    move-object v14, v11

    move/from16 v16, v4

    :goto_4
    invoke-static {v14}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v2

    move-object v12, v5

    move-object v13, v7

    move/from16 v11, v16

    move/from16 v30, v2

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06e0\u06e8\u06e8"

    :goto_5
    invoke-static {v4}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v4

    move-object v10, v2

    move/from16 v30, v4

    goto/16 :goto_0

    :sswitch_9
    const-string v2, "SN11\n"

    const-string v4, "Kb4BFkopdw4=\n"

    invoke-static {v2, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "KCpBBt4=\n"

    const-string v4, "XEM1arvooy0=\n"

    invoke-static {v2, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "6xwWUA==\n"

    const-string v5, "j3llM3G21Lo=\n"

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-static {v0, v2, v4, v5, v1}, Lz30;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "NrQG\n"

    const-string v4, "XdF/xGTC0Mk=\n"

    const-string v5, "mHij\n"

    const-string v7, "/B3FGXtfaP8=\n"

    move-object/from16 v0, p3

    invoke-static {v2, v4, v0, v5, v7}, Lz30;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p4

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "Qtns7C8=\n"

    const-string v4, "NrGJgUpiZB4=\n"

    invoke-static {v2, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p5

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v0, p5

    iget v4, v0, Lon;->g:I

    move-object v2, v10

    goto :goto_3

    :sswitch_a
    move-object/from16 v0, v25

    invoke-virtual {v0, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    sget v4, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    xor-int/lit16 v4, v4, -0x357

    move/from16 v0, v23

    invoke-direct {v2, v0, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v4, 0x11

    iput v4, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    sget v4, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    xor-int/lit8 v4, v4, 0x2b

    invoke-static {v4}, Lff;->q(I)I

    move-result v5

    const/4 v7, 0x0

    invoke-static {v4}, Lff;->q(I)I

    move-result v4

    const/4 v14, 0x0

    invoke-virtual {v2, v5, v7, v4, v14}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    const-string v4, "\u06e7\u06e2\u06df"

    :goto_6
    invoke-static {v4}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v17, v2

    move/from16 v30, v4

    goto/16 :goto_0

    :sswitch_b
    new-instance v2, Lu6;

    sget v4, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    xor-int/lit8 v4, v4, 0x2c

    invoke-direct {v2, v6, v4}, Lu6;-><init>(Landroid/app/Dialog;I)V

    move-object/from16 v0, v22

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v2, Landroid/widget/LinearLayout;

    move-object/from16 v0, p0

    invoke-direct {v2, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v4, 0x1

    invoke-virtual {v2, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    sget v4, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    xor-int/lit16 v5, v4, 0x142

    invoke-static {v5}, Lff;->q(I)I

    move-result v4

    invoke-static {}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟۟ۤۦۨ()I

    move-result v7

    if-gtz v7, :cond_6

    :cond_6
    const-string v7, "\u06e4\u06e2\u06e4"

    invoke-static {v7}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v25, v2

    move/from16 v27, v4

    move/from16 v28, v5

    move/from16 v30, v7

    goto/16 :goto_0

    :sswitch_c
    invoke-static {v15}, Lff;->q(I)I

    move-result v2

    sget v4, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    xor-int/lit16 v4, v4, -0x273

    invoke-static {v4}, Lff;->q(I)I

    move-result v5

    invoke-static {v15}, Lff;->q(I)I

    move-result v7

    invoke-static {v4}, Lff;->q(I)I

    move-result v4

    invoke-virtual {v3, v2, v5, v7, v4}, Landroid/view/View;->setPadding(IIII)V

    const/4 v2, 0x1

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setSingleLine(Z)V

    invoke-virtual {v3, v15}, Landroid/widget/TextView;->setGravity(I)V

    sget v2, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v4, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    add-int/lit16 v4, v4, -0x1bff

    rem-int/2addr v2, v4

    if-gtz v2, :cond_7

    const-string v2, "\u06e6\u06e2\u06e2"

    invoke-static {v2}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v30, v2

    goto/16 :goto_0

    :cond_7
    sget v2, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v4, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    xor-int/2addr v2, v4

    const v4, 0x1aa63e

    xor-int/2addr v2, v4

    move/from16 v30, v2

    goto/16 :goto_0

    :sswitch_d
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v2

    sget v4, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    xor-int/lit16 v15, v4, 0x347

    if-lez v2, :cond_b

    new-instance v2, Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-direct {v2, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    move-object/from16 v0, p2

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const-string v4, "\u06e4\u06e5\u06df"

    move-object v5, v2

    move-object v7, v13

    move-object v14, v4

    move/from16 v16, v11

    goto/16 :goto_4

    :cond_8
    :sswitch_e
    sget v2, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v4, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    mul-int/2addr v2, v4

    const v4, 0x15dfdc

    add-int/2addr v2, v4

    move/from16 v30, v2

    goto/16 :goto_0

    :sswitch_f
    const/4 v2, 0x1

    move-object/from16 v0, v26

    invoke-virtual {v10, v0, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {v2, v11}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/high16 v4, 0x42c80000    # 100.0f

    invoke-static {v4}, Lff;->p(F)F

    move-result v4

    invoke-virtual {v2, v4}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v10, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    sget v2, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v4, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    xor-int/lit16 v4, v4, 0x17bf

    rem-int/2addr v2, v4

    if-ltz v2, :cond_9

    const/16 v2, 0x2a

    sput v2, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    const-string v4, "\u06e2\u06df\u06e4"

    move-object/from16 v2, v17

    goto/16 :goto_6

    :cond_9
    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v4, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    rem-int/2addr v2, v4

    const v4, 0x1ac149

    add-int/2addr v2, v4

    move/from16 v30, v2

    goto/16 :goto_0

    :sswitch_10
    const/high16 v2, 0x41400000    # 12.0f

    invoke-virtual {v12, v2}, Landroid/widget/TextView;->setTextSize(F)V

    move-object/from16 v0, p5

    iget v2, v0, Lon;->f:I

    invoke-virtual {v12, v2}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v2, 0x0

    sget v4, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    xor-int/lit16 v4, v4, 0x2e0

    invoke-static {v4}, Lff;->q(I)I

    move-result v4

    const/4 v5, 0x0

    invoke-static {v15}, Lff;->q(I)I

    move-result v7

    invoke-virtual {v12, v2, v4, v5, v7}, Landroid/widget/TextView;->setPadding(IIII)V

    move-object/from16 v0, v25

    invoke-virtual {v0, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget v2, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v4, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    add-int/lit16 v4, v4, -0x1009

    rem-int/2addr v2, v4

    if-ltz v2, :cond_a

    const/16 v2, 0x42

    sput v2, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    const-string v2, "\u06df\u06df\u06e2"

    invoke-static {v2}, Landroid/app/۟ۦۦۤۥ;->ۦۨۥ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v30, v2

    goto/16 :goto_0

    :cond_a
    move-object/from16 v2, v18

    move-object/from16 v4, v19

    move/from16 v5, v20

    move/from16 v7, v21

    :goto_7
    const-string v14, "\u06e0\u06e3\u06e5"

    invoke-static {v14}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v14

    move-object/from16 v18, v2

    move-object/from16 v19, v4

    move/from16 v20, v5

    move/from16 v21, v7

    move/from16 v30, v14

    goto/16 :goto_0

    :cond_b
    :sswitch_11
    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    if-gtz v2, :cond_c

    const/16 v2, 0x3b

    sput v2, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    const-string v2, "\u06e7\u06e1\u06e8"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v30, v2

    goto/16 :goto_0

    :cond_c
    sget v2, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sget v4, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sub-int/2addr v2, v4

    const v4, -0x1ac4ad

    xor-int/2addr v2, v4

    move/from16 v30, v2

    goto/16 :goto_0

    :sswitch_12
    const/4 v4, 0x1

    invoke-static {}, Landroidx/emoji2/text/ۣۣ۟۟۠;->ۢۡۢۦ()I

    move-result v2

    if-gtz v2, :cond_d

    const/16 v2, 0x26

    sput v2, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    const-string v2, "\u06df\u06e6\u06e2"

    invoke-static {v2}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v30, v2

    move/from16 v31, v4

    goto/16 :goto_0

    :cond_d
    sget v2, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v5, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    rem-int/2addr v2, v5

    const v5, 0x1abc0d

    add-int/2addr v2, v5

    move/from16 v30, v2

    move/from16 v31, v4

    goto/16 :goto_0

    :sswitch_13
    invoke-static {v15}, Lff;->q(I)I

    move-result v2

    move-object/from16 v0, v19

    iput v2, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    invoke-static/range {v28 .. v28}, Lff;->q(I)I

    move-result v2

    move-object/from16 v0, v19

    iput v2, v0, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual/range {v18 .. v19}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    move/from16 v0, v21

    move/from16 v1, v20

    invoke-direct {v2, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    move-object/from16 v0, v18

    invoke-virtual {v0, v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    move-object/from16 v0, v25

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v4, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    xor-int/lit16 v4, v4, 0xe53

    rem-int/2addr v2, v4

    if-gtz v2, :cond_11

    const/16 v2, 0x5e

    sput v2, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    const-string v2, "\u06e8\u06e8\u06e3"

    invoke-static {v2}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v30, v2

    goto/16 :goto_0

    :sswitch_14
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    move-object/from16 v0, v24

    invoke-virtual {v2, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v2, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v4, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    xor-int/2addr v2, v4

    const v4, 0x1ac422

    add-int/2addr v2, v4

    move/from16 v30, v2

    goto/16 :goto_0

    :sswitch_15
    const-string v2, "ooQZwb5iDgU=\n"

    const-string v4, "weV1rdwDbW4=\n"

    invoke-static {v2, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    new-instance v6, Landroid/app/Dialog;

    const v2, 0x103013f

    sget v4, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    xor-int/2addr v2, v4

    move-object/from16 v0, p0

    invoke-direct {v6, v0, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    new-instance v2, Landroid/widget/FrameLayout;

    move-object/from16 v0, p0

    invoke-direct {v2, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    sget v4, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    xor-int/lit16 v4, v4, 0x97

    new-instance v5, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v5, v4, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :goto_8
    const-string v5, "\u06e7\u06e2\u06e3"

    invoke-static {v5}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v22, v2

    move/from16 v23, v4

    move/from16 v30, v5

    goto/16 :goto_0

    :sswitch_16
    new-instance v2, Lg6;

    sget v4, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    xor-int/lit16 v4, v4, -0x361

    move-object/from16 v0, p5

    invoke-direct {v2, v4, v0}, Lg6;-><init>(ILjava/lang/Object;)V

    move-object/from16 v0, v25

    invoke-virtual {v0, v2}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    const/4 v2, 0x1

    move-object/from16 v0, v25

    invoke-virtual {v0, v2}, Landroid/view/View;->setClipToOutline(Z)V

    new-instance v2, Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-direct {v2, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    move-object/from16 v0, p1

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v4, 0x41900000    # 18.0f

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextSize(F)V

    sget v4, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v5, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    div-int/lit16 v5, v5, 0xa8c

    add-int/2addr v4, v5

    if-gtz v4, :cond_e

    const-string v4, "\u06e4\u06e2\u06df"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v4

    move-object v13, v2

    move/from16 v30, v4

    goto/16 :goto_0

    :cond_e
    const-string v4, "\u06e8\u06e7\u06e0"

    move-object v5, v12

    move-object v7, v2

    move-object v14, v4

    move/from16 v16, v11

    goto/16 :goto_4

    :sswitch_17
    sget v2, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v4, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    or-int/2addr v2, v4

    const v4, 0x1aa763

    add-int/2addr v2, v4

    move/from16 v30, v2

    goto/16 :goto_0

    :sswitch_18
    move/from16 v0, v31

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setInputType(I)V

    new-instance v2, Landroid/widget/LinearLayout;

    move-object/from16 v0, p0

    invoke-direct {v2, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    sget v4, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    xor-int/lit8 v5, v4, -0x6c

    sget v4, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    xor-int/lit16 v7, v4, 0xb0

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v4, v7, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    sget v14, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    if-ltz v14, :cond_f

    const/16 v14, 0xa

    sput v14, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    goto/16 :goto_7

    :cond_f
    sget v14, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v16, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    div-int v14, v14, v16

    const v16, 0x1ab9c7

    add-int v14, v14, v16

    move-object/from16 v18, v2

    move-object/from16 v19, v4

    move/from16 v20, v5

    move/from16 v21, v7

    move/from16 v30, v14

    goto/16 :goto_0

    :sswitch_19
    invoke-static/range {v28 .. v28}, Lff;->q(I)I

    move-result v2

    invoke-static {v9}, Lff;->q(I)I

    move-result v4

    invoke-static/range {v28 .. v28}, Lff;->q(I)I

    move-result v5

    invoke-static/range {v28 .. v28}, Lff;->q(I)I

    move-result v7

    move-object/from16 v0, v25

    invoke-virtual {v0, v2, v4, v5, v7}, Landroid/view/View;->setPadding(IIII)V

    sget v2, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    if-gtz v2, :cond_10

    const/16 v2, 0x60

    sput v2, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    const-string v2, "\u06e0\u06e1"

    invoke-static {v2}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v30, v2

    goto/16 :goto_0

    :cond_10
    const-string v2, "\u06df\u06df\u06e2"

    invoke-static {v2}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v30, v2

    goto/16 :goto_0

    :sswitch_1a
    sget v2, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    xor-int/lit16 v4, v2, 0x30a

    invoke-static {v4}, Lff;->q(I)I

    move-result v2

    invoke-static/range {v28 .. v28}, Lff;->q(I)I

    move-result v5

    invoke-static/range {v28 .. v28}, Lff;->q(I)I

    move-result v7

    move-object/from16 v0, v25

    move/from16 v1, v27

    invoke-virtual {v0, v1, v2, v5, v7}, Landroid/view/View;->setPadding(IIII)V

    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    move-object/from16 v0, p5

    iget v5, v0, Lon;->c:I

    invoke-virtual {v2, v5}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    move-object/from16 v0, p5

    iget v5, v0, Lon;->j:F

    invoke-virtual {v2, v5}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    :goto_9
    const-string v5, "\u06e8\u06e3\u06e5"

    invoke-static {v5}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v5

    move-object v8, v2

    move v9, v4

    move/from16 v30, v5

    goto/16 :goto_0

    :sswitch_1b
    const-string v2, "FvHd7A==\n"

    const-string v4, "cpi+iXZlKhs=\n"

    invoke-static {v2, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v2, v4}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-nez v2, :cond_8

    const-string v2, "C/xj\n"

    const-string v4, "eYwQ8QVoRsE=\n"

    invoke-static {v2, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v2, v4}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-eqz v2, :cond_4

    sget v2, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    if-gtz v2, :cond_12

    :cond_11
    const-string v4, "\u06e1\u06e3\u06e3"

    move-object v2, v10

    goto/16 :goto_5

    :cond_12
    const-string v2, "\u06e1\u06e1"

    invoke-static {v2}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v30, v2

    goto/16 :goto_0

    :sswitch_1c
    const/high16 v2, 0x41f00000    # 30.0f

    invoke-static {v2}, Lff;->p(F)F

    move-result v2

    move-object/from16 v0, v25

    invoke-virtual {v0, v2}, Landroid/view/View;->setElevation(F)V

    sget v2, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    if-ltz v2, :cond_13

    const-string v2, "\u06e0\u06e8\u06e8"

    invoke-static {v2}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v30, v2

    goto/16 :goto_0

    :cond_13
    sget v2, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v4, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    mul-int/2addr v2, v4

    const v4, 0xdb84f

    add-int/2addr v2, v4

    move/from16 v30, v2

    goto/16 :goto_0

    :sswitch_1d
    move-object/from16 v0, v25

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v2, 0x1

    move-object/from16 v0, v25

    invoke-virtual {v0, v2}, Landroid/view/View;->setClickable(Z)V

    move-object/from16 v0, p5

    iget-boolean v2, v0, Lon;->l:Z

    if-eqz v2, :cond_0

    sget v2, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    if-gtz v2, :cond_14

    move-object/from16 v2, v22

    move/from16 v4, v23

    goto/16 :goto_8

    :cond_14
    const-string v4, "\u06df\u06e7\u06e5"

    move-object/from16 v2, v17

    goto/16 :goto_6

    :sswitch_1e
    const/4 v2, 0x1

    move-object/from16 v0, v26

    invoke-virtual {v3, v0, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    move-object/from16 v0, p5

    iget v4, v0, Lon;->b:I

    invoke-virtual {v2, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/high16 v4, 0x41400000    # 12.0f

    invoke-static {v4}, Lff;->p(F)F

    move-result v4

    invoke-virtual {v2, v4}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v3, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const-string v2, "\u06e8\u06e7\u06e2"

    invoke-static {v2}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v30, v2

    goto/16 :goto_0

    :cond_15
    sget v2, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v4, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sub-int/2addr v2, v4

    const v4, -0x1aad5e

    xor-int/2addr v2, v4

    move/from16 v30, v2

    goto/16 :goto_0

    :sswitch_1f
    const/16 v2, 0x2002

    sget v4, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    if-ltz v4, :cond_16

    const-string v4, "\u06e4\u06e5\u06e5"

    invoke-static {v4}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v29, v2

    move/from16 v30, v4

    goto/16 :goto_0

    :cond_16
    sget v4, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v5, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    rem-int/2addr v4, v5

    const v5, 0x1ab2af

    add-int/2addr v4, v5

    move/from16 v29, v2

    move/from16 v30, v4

    goto/16 :goto_0

    :sswitch_20
    move-object/from16 v0, v25

    invoke-virtual {v0, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, v22

    invoke-virtual {v6, v0}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    new-instance v2, Lkn;

    move-object/from16 v0, v25

    move-object/from16 v1, p0

    invoke-direct {v2, v6, v0, v3, v1}, Lkn;-><init>(Landroid/app/Dialog;Landroid/widget/LinearLayout;Landroid/widget/EditText;Landroid/app/Activity;)V

    invoke-virtual {v6, v2}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    invoke-virtual {v6}, Landroid/app/Dialog;->show()V

    sget v2, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    if-ltz v2, :cond_17

    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۣۡ۠ۡ()I

    const-string v2, "\u06e7\u06e7"

    invoke-static {v2}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v30, v2

    goto/16 :goto_0

    :cond_17
    sget v2, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v4, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    rem-int/2addr v2, v4

    const v4, 0x1ac5b1

    xor-int/2addr v2, v4

    move/from16 v30, v2

    goto/16 :goto_0

    :sswitch_21
    move-object/from16 v0, p5

    iget v2, v0, Lon;->e:I

    invoke-virtual {v13, v2}, Landroid/widget/TextView;->setTextColor(I)V

    sget-object v2, Lmn;->a:Landroid/graphics/Typeface;

    const/4 v4, 0x1

    invoke-virtual {v13, v2, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    const v4, 0x3d4ccccd    # 0.05f

    invoke-virtual {v13, v4}, Landroid/widget/TextView;->setLetterSpacing(F)V

    move-object/from16 v0, v25

    invoke-virtual {v0, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget v4, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v5, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    mul-int/2addr v4, v5

    const v5, 0x1f6588

    add-int/2addr v4, v5

    move-object/from16 v26, v2

    move/from16 v30, v4

    goto/16 :goto_0

    :sswitch_22
    sget v2, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    xor-int/lit16 v2, v2, 0x3a0

    invoke-static {v2}, Lff;->q(I)I

    move-result v2

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    sget v5, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    xor-int/lit16 v5, v5, 0x2cb

    invoke-direct {v4, v5, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v10, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v2, Lx9;

    sget v4, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    xor-int/lit8 v7, v4, 0x3b

    move-object/from16 v4, p3

    move-object/from16 v5, p6

    invoke-direct/range {v2 .. v7}, Lx9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroid/app/Dialog;I)V

    invoke-virtual {v10, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sget-object v2, Lxn;->a:Landroid/graphics/Typeface;

    move-object/from16 v0, p5

    invoke-static {v10, v0}, Lxn;->c(Landroid/view/View;Lon;)V

    sget v2, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    if-gtz v2, :cond_18

    move-object v2, v8

    move v4, v9

    goto/16 :goto_9

    :cond_18
    const-string v2, "\u06e7\u06e7"

    goto/16 :goto_1

    :sswitch_23
    sget v2, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v4, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    or-int/2addr v2, v4

    const v4, 0x1ac80a

    add-int/2addr v2, v4

    move/from16 v30, v2

    goto/16 :goto_0

    :sswitch_24
    sget v2, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    if-gtz v2, :cond_19

    invoke-static {}, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۢۧ()I

    const-string v2, "\u06e3\u06e6\u06e8"

    invoke-static {v2}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v30, v2

    goto/16 :goto_0

    :cond_19
    sget v2, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v4, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    rem-int/2addr v2, v4

    const v4, 0xda57

    add-int/2addr v2, v4

    move/from16 v30, v2

    goto/16 :goto_0

    :cond_1a
    :sswitch_25
    sget v2, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v4, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    mul-int/lit16 v4, v4, 0x1a44

    or-int/2addr v2, v4

    if-ltz v2, :cond_1b

    invoke-static {}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۣ۟ۦۢ()I

    const-string v2, "\u06e1\u06e1\u06e0"

    :goto_a
    invoke-static {v2}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v30, v2

    goto/16 :goto_0

    :cond_1b
    const-string v2, "\u06e6\u06e3\u06e3"

    goto :goto_a

    :sswitch_26
    sget v2, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v4, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    add-int/lit16 v4, v4, -0x9ea

    mul-int/2addr v2, v4

    if-gtz v2, :cond_1c

    const/16 v2, 0x1c

    sput v2, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    const-string v2, "\u06e4\u06e5\u06df"

    invoke-static {v2}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v30, v2

    move/from16 v31, v29

    goto/16 :goto_0

    :cond_1c
    sget v2, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v4, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    div-int/2addr v2, v4

    const v4, 0x1ac9e2

    add-int/2addr v2, v4

    move/from16 v30, v2

    move/from16 v31, v29

    goto/16 :goto_0

    :sswitch_27
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc01 -> :sswitch_0
        0xdc20 -> :sswitch_6
        0xdc42 -> :sswitch_17
        0xdc60 -> :sswitch_9
        0xdce0 -> :sswitch_20
        0xdd00 -> :sswitch_15
        0x1aa702 -> :sswitch_1
        0x1aa745 -> :sswitch_2
        0x1aa7db -> :sswitch_7
        0x1aa7fd -> :sswitch_1c
        0x1aa800 -> :sswitch_1e
        0x1aab04 -> :sswitch_1f
        0x1aab42 -> :sswitch_4
        0x1aabba -> :sswitch_5
        0x1aabe0 -> :sswitch_f
        0x1aaee2 -> :sswitch_16
        0x1aaf01 -> :sswitch_8
        0x1aaf41 -> :sswitch_e
        0x1ab247 -> :sswitch_25
        0x1ab2a6 -> :sswitch_26
        0x1ab2be -> :sswitch_d
        0x1ab2c3 -> :sswitch_14
        0x1ab6c6 -> :sswitch_12
        0x1ab9c7 -> :sswitch_13
        0x1ab9e5 -> :sswitch_e
        0x1aba21 -> :sswitch_1b
        0x1aba23 -> :sswitch_24
        0x1aba26 -> :sswitch_1a
        0x1aba7e -> :sswitch_10
        0x1aba84 -> :sswitch_23
        0x1abe06 -> :sswitch_11
        0x1ac1a6 -> :sswitch_22
        0x1ac1c6 -> :sswitch_27
        0x1ac1e6 -> :sswitch_19
        0x1ac564 -> :sswitch_1d
        0x1ac568 -> :sswitch_b
        0x1ac5a5 -> :sswitch_7
        0x1ac5c5 -> :sswitch_3
        0x1ac8ea -> :sswitch_17
        0x1ac94a -> :sswitch_a
        0x1ac9c1 -> :sswitch_21
        0x1ac9c3 -> :sswitch_c
        0x1ac9e3 -> :sswitch_18
    .end sparse-switch
.end method

.method public static c(Landroid/app/Activity;Ljava/lang/String;[Ljava/lang/String;ILon;Lsm;)V
    .locals 57

    const/16 v25, 0x0

    const/4 v9, 0x0

    const/16 v23, 0x0

    const/16 v33, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v49, 0x0

    const/16 v51, 0x0

    const/4 v6, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v27, 0x0

    const/16 v44, 0x0

    const/16 v20, 0x0

    const/4 v12, 0x0

    const/16 v19, 0x0

    const/16 v24, 0x0

    const/16 v22, 0x0

    const/16 v21, 0x0

    const/16 v38, 0x0

    const/16 v42, 0x0

    const/16 v50, 0x0

    const/16 v35, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v54, 0x0

    const/16 v56, 0x0

    const/4 v5, 0x0

    const/4 v4, 0x0

    const/16 v30, 0x0

    const/16 v41, 0x0

    const/16 v32, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v8, 0x0

    const/16 v29, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/4 v11, 0x0

    const/16 v34, 0x0

    const/16 v17, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v31, 0x0

    const/16 v43, 0x0

    const-string v45, "\u06e0\u06e4\u06e0"

    invoke-static/range {v45 .. v45}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v55

    move-object/from16 v45, v6

    move-object/from16 v46, v12

    move-object/from16 v47, v20

    move-object/from16 v48, v23

    :goto_0
    sparse-switch v55, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    move/from16 v0, v36

    move/from16 v1, v17

    if-ge v0, v1, :cond_28

    aget-object v6, p2, v36

    sget v12, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    move/from16 v0, v37

    move/from16 v1, p3

    if-ne v0, v1, :cond_10

    const/16 v20, 0x1

    sget v23, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    if-ltz v23, :cond_1c

    const/16 v23, 0x38

    sput v23, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    const-string v23, "\u06df\u06e6\u06e0"

    invoke-static/range {v23 .. v23}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v23

    move-object/from16 v39, v6

    move/from16 v40, v12

    move/from16 v54, v20

    move/from16 v55, v23

    goto :goto_0

    :sswitch_1
    const/16 v23, 0x0

    const/16 v37, 0x0

    sget v6, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    if-gtz v6, :cond_0

    invoke-static {}, Lkotlinx/coroutines/ۦۡۧۧ;->۟ۤۧۨۦ()I

    const-string v6, "\u06e0\u06e5\u06e2"

    invoke-static {v6}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v34, v33

    move/from16 v55, v6

    move/from16 v17, v35

    move/from16 v36, v23

    move/from16 v31, v38

    goto :goto_0

    :cond_0
    const-string v6, "\u06e3\u06e5\u06e6"

    move-object/from16 v12, v33

    move/from16 v20, v35

    move/from16 v31, v38

    :goto_1
    invoke-static {v6}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v34, v12

    move/from16 v55, v6

    move/from16 v17, v20

    move/from16 v36, v23

    goto :goto_0

    :sswitch_2
    sget v6, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v12, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    rem-int/2addr v6, v12

    const v12, 0x1aba65

    add-int/2addr v6, v12

    move/from16 v55, v6

    goto :goto_0

    :sswitch_3
    invoke-static {}, Lcom/google/android/material/carousel/۠ۨۡۢ;->ۦۧۢ۟()I

    move-result v6

    if-ltz v6, :cond_1

    const-string v6, "\u06e8\u06e0\u06df"

    :goto_2
    invoke-static {v6}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v55, v6

    goto :goto_0

    :cond_1
    const-string v6, "\u06e0\u06e6"

    invoke-static {v6}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v55, v6

    goto/16 :goto_0

    :sswitch_4
    const/4 v6, 0x1

    invoke-virtual {v5, v6}, Landroid/view/View;->setClickable(Z)V

    new-instance v6, Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-direct {v6, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    move-object/from16 v0, v39

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v7, 0x41700000    # 15.0f

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setTextSize(F)V

    if-eqz v56, :cond_12

    sget v7, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v8, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    add-int/lit16 v8, v8, 0x10e3

    add-int/2addr v7, v8

    if-gtz v7, :cond_2

    const/16 v7, 0x18

    sput v7, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    move v8, v9

    :goto_3
    const-string v7, "\u06e8\u06e3\u06e2"

    move-object v12, v7

    :goto_4
    invoke-static {v12}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v12

    move-object v7, v6

    move/from16 v55, v12

    goto/16 :goto_0

    :cond_2
    sget v7, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v8, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    mul-int/2addr v7, v8

    const v8, 0x1fb1d0

    xor-int v12, v7, v8

    move-object v7, v6

    move/from16 v55, v12

    move v8, v9

    goto/16 :goto_0

    :sswitch_5
    const/4 v6, 0x4

    const/4 v12, 0x0

    aput v12, v13, v6

    const/4 v6, 0x5

    const/4 v12, 0x0

    aput v12, v13, v6

    const/4 v6, 0x6

    const/4 v12, 0x0

    aput v12, v13, v6

    const/4 v6, 0x7

    const/4 v12, 0x0

    aput v12, v13, v6

    move-object/from16 v0, v45

    invoke-virtual {v0, v13}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadii([F)V

    move-object/from16 v0, v49

    move-object/from16 v1, v45

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v6, Lg6;

    move-object/from16 v0, p4

    invoke-direct {v6, v14, v0}, Lg6;-><init>(ILjava/lang/Object;)V

    move-object/from16 v0, v49

    invoke-virtual {v0, v6}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    sget v6, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    if-ltz v6, :cond_3

    invoke-static {}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟ۢۡ۠ۦ()I

    const-string v6, "\u06e0\u06e4\u06e0"

    :goto_5
    invoke-static {v6}, L۠ۡۢۨ;->۟ۡۧۡۥ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v55, v6

    goto/16 :goto_0

    :cond_3
    sget v6, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v12, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    rem-int/2addr v6, v12

    const v12, 0x1abef9

    add-int/2addr v6, v12

    move/from16 v55, v6

    goto/16 :goto_0

    :sswitch_6
    sget-object v6, Lxn;->a:Landroid/graphics/Typeface;

    move-object/from16 v0, p4

    invoke-static {v5, v0}, Lxn;->c(Landroid/view/View;Lon;)V

    new-instance v6, Lnd;

    move-object/from16 v0, p5

    move/from16 v1, v37

    move-object/from16 v2, v48

    invoke-direct {v6, v0, v1, v2}, Lnd;-><init>(Lsm;ILandroid/app/Dialog;)V

    invoke-virtual {v5, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    move-object/from16 v0, v50

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget v6, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    xor-int/lit16 v6, v6, -0x348

    add-int v15, v36, v6

    move/from16 v0, v40

    xor-int/lit16 v6, v0, -0x357

    add-int v18, v37, v6

    sget v6, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v12, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    xor-int/lit16 v12, v12, 0x9dd

    add-int/2addr v6, v12

    if-ltz v6, :cond_4

    invoke-static {}, Landroidx/activity/ۣ۟۠ۤۢ;->۟۠۠ۤۥ()I

    move-object v6, v13

    move v12, v14

    move/from16 v16, v17

    :goto_6
    const-string v14, "\u06e0\u06e3\u06e8"

    move-object v13, v6

    move-object/from16 v20, v14

    move/from16 v23, v12

    :goto_7
    invoke-static/range {v20 .. v20}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v14, v23

    move/from16 v55, v6

    goto/16 :goto_0

    :cond_4
    const-string v6, "\u06df\u06e8\u06e2"

    move-object/from16 v12, v34

    move/from16 v16, v17

    move/from16 v20, v17

    move/from16 v23, v36

    goto/16 :goto_1

    :sswitch_7
    sget-object v6, Ljava/lang/System;->out:Ljava/io/PrintStream;

    move-object/from16 v0, v43

    invoke-virtual {v6, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v6, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v12, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    mul-int/2addr v6, v12

    const v12, -0x1adf7c

    xor-int/2addr v6, v12

    move/from16 v55, v6

    goto/16 :goto_0

    :cond_5
    :sswitch_8
    sget v6, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v12, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    mul-int/lit16 v12, v12, 0x3bf

    sub-int/2addr v6, v12

    if-gtz v6, :cond_6

    const/16 v6, 0x14

    sput v6, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    const-string v6, "\u06e7\u06e5\u06e6"

    move/from16 v12, v25

    :goto_8
    invoke-static {v6}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v25, v12

    move/from16 v55, v6

    goto/16 :goto_0

    :cond_6
    sget v6, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v12, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    div-int/2addr v6, v12

    const v12, 0x1ab64b

    xor-int/2addr v6, v12

    move/from16 v55, v6

    goto/16 :goto_0

    :sswitch_9
    sget v6, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v12, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sub-int/2addr v6, v12

    const v12, 0x1ac6d3

    add-int/2addr v6, v12

    move/from16 v55, v6

    move/from16 v17, v16

    move/from16 v36, v15

    move/from16 v37, v18

    goto/16 :goto_0

    :sswitch_a
    sget v6, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v12, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    xor-int/lit16 v12, v12, -0x1381

    xor-int/2addr v6, v12

    if-gtz v6, :cond_7

    invoke-static {}, Landroidx/savedstate/۠ۡۢ۠;->ۣ۟ۨۤۨ()I

    const-string v6, "\u06e7\u06e3\u06df"

    invoke-static {v6}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v55, v6

    move/from16 v56, v54

    goto/16 :goto_0

    :cond_7
    sget v6, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v12, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    add-int/2addr v6, v12

    const v12, 0x1ac320

    add-int/2addr v6, v12

    move/from16 v55, v6

    move/from16 v56, v54

    goto/16 :goto_0

    :sswitch_b
    sget v6, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    if-ltz v6, :cond_8

    const/16 v6, 0x44

    sput v6, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    const-string v6, "\u06e3\u06e3\u06e3"

    :goto_9
    invoke-static {v6}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v6

    move/from16 v55, v6

    goto/16 :goto_0

    :cond_8
    sget v6, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v12, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    rem-int/2addr v6, v12

    const v12, 0x1ac04c

    add-int/2addr v6, v12

    move/from16 v55, v6

    goto/16 :goto_0

    :sswitch_c
    const/4 v6, 0x1

    move-object/from16 v0, v49

    invoke-virtual {v0, v6}, Landroid/view/View;->setClipToOutline(Z)V

    const/4 v6, 0x1

    move-object/from16 v0, v49

    invoke-virtual {v0, v6}, Landroid/view/View;->setClickable(Z)V

    new-instance v6, Landroid/widget/FrameLayout;

    move-object/from16 v0, p0

    invoke-direct {v6, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    move/from16 v0, v52

    move/from16 v1, v51

    invoke-direct {v12, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v6, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v20, Landroid/view/View;

    move-object/from16 v0, v20

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v12, Landroid/widget/FrameLayout$LayoutParams;

    sget v23, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    move/from16 v0, v23

    xor-int/lit16 v0, v0, 0x30e

    move/from16 v23, v0

    invoke-static/range {v23 .. v23}, Lff;->q(I)I

    move-result v23

    const/16 v26, 0x5

    invoke-static/range {v26 .. v26}, Lff;->q(I)I

    move-result v26

    move/from16 v0, v23

    move/from16 v1, v26

    invoke-direct {v12, v0, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v23, 0x11

    move/from16 v0, v23

    iput v0, v12, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-static {}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟ۤۦۡ()I

    move-result v23

    if-ltz v23, :cond_9

    invoke-static {}, Landroidx/versionedparcelable/ۣۢۥ;->ۦۦۡۤ()I

    const-string v23, "\u06e0\u06e8\u06e1"

    :goto_a
    invoke-static/range {v23 .. v23}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v23

    move-object/from16 v26, v6

    move-object/from16 v27, v12

    move-object/from16 v28, v20

    move/from16 v55, v23

    goto/16 :goto_0

    :cond_9
    sget v23, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v26, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    xor-int v23, v23, v26

    const v26, 0x1aade6

    add-int v23, v23, v26

    move-object/from16 v26, v6

    move-object/from16 v27, v12

    move-object/from16 v28, v20

    move/from16 v55, v23

    goto/16 :goto_0

    :sswitch_d
    const-string v6, "\u06df\u06df\u06e0"

    goto/16 :goto_5

    :sswitch_e
    move/from16 v0, v41

    invoke-virtual {v4, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/high16 v6, 0x41800000    # 16.0f

    invoke-static {v6}, Lff;->p(F)F

    move-result v6

    invoke-virtual {v4, v6}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v5, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    sget v6, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    xor-int/lit16 v6, v6, -0x379

    invoke-static {v6}, Lff;->q(I)I

    move-result v12

    sget v20, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    move/from16 v0, v20

    xor-int/lit16 v0, v0, -0x265

    move/from16 v32, v0

    invoke-static/range {v32 .. v32}, Lff;->q(I)I

    move-result v20

    invoke-static {v6}, Lff;->q(I)I

    move-result v6

    invoke-static/range {v32 .. v32}, Lff;->q(I)I

    move-result v23

    move/from16 v0, v20

    move/from16 v1, v23

    invoke-virtual {v5, v12, v0, v6, v1}, Landroid/view/View;->setPadding(IIII)V

    invoke-static {}, Lio/fastkv/ۦۣ۠ۨ;->۠ۡۨۧ()I

    move-result v6

    if-ltz v6, :cond_1e

    const-string v6, "\u06e2\u06e8"

    invoke-static {v6}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v6

    move/from16 v55, v6

    goto/16 :goto_0

    :sswitch_f
    invoke-static {}, Landroidx/appcompat/app/ۥۦۣ۠;->ۨۤ۠ۨ()I

    move-result v6

    if-gtz v6, :cond_a

    const-string v6, "\u06e0\u06e0\u06df"

    invoke-static {v6}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v55, v6

    goto/16 :goto_0

    :cond_a
    const-string v23, "\u06e0\u06e5\u06df"

    move-object/from16 v6, v26

    move-object/from16 v12, v27

    move-object/from16 v20, v28

    goto/16 :goto_a

    :sswitch_10
    invoke-static {}, Landroid/app/ۣۢۤۥ;->ۣۤۧۧ()I

    move-result v6

    if-gtz v6, :cond_b

    const-string v6, "\u06e6\u06e1\u06df"

    invoke-static {v6}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v55, v6

    goto/16 :goto_0

    :cond_b
    const-string v6, "\u06e7\u06e0\u06e2"

    goto/16 :goto_2

    :sswitch_11
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setTextColor(I)V

    move-object/from16 v0, v19

    move/from16 v1, v56

    invoke-virtual {v7, v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v12, 0x0

    sget v20, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    move/from16 v0, v20

    xor-int/lit16 v0, v0, 0x292

    move/from16 v20, v0

    const/high16 v23, 0x3f800000    # 1.0f

    move/from16 v0, v20

    move/from16 v1, v23

    invoke-direct {v6, v12, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v7, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v5, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    if-eqz v56, :cond_20

    new-instance v6, Landroid/view/View;

    move-object/from16 v0, p0

    invoke-direct {v6, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v20, 0x6

    invoke-static/range {v20 .. v20}, Lff;->q(I)I

    move-result v20

    const/16 v23, 0x6

    invoke-static/range {v23 .. v23}, Lff;->q(I)I

    move-result v23

    move/from16 v0, v20

    move/from16 v1, v23

    invoke-direct {v12, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v6, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    sget v12, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v20, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    move/from16 v0, v20

    rem-int/lit16 v0, v0, -0x1e4d

    move/from16 v20, v0

    xor-int v12, v12, v20

    if-gtz v12, :cond_c

    move/from16 v12, v30

    :goto_b
    const-string v20, "\u06e1\u06e4\u06e5"

    move/from16 v30, v12

    move/from16 v23, v31

    :goto_c
    invoke-static/range {v20 .. v20}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v12

    move-object/from16 v29, v6

    move/from16 v55, v12

    move/from16 v31, v23

    goto/16 :goto_0

    :cond_c
    const-string v12, "\u06e3\u06df"

    :goto_d
    invoke-static {v12}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v12

    move-object/from16 v29, v6

    move/from16 v55, v12

    goto/16 :goto_0

    :sswitch_12
    sget v6, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v12, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    rem-int/2addr v6, v12

    const v12, 0x1aa767

    xor-int/2addr v6, v12

    move/from16 v55, v6

    goto/16 :goto_0

    :sswitch_13
    const/high16 v6, 0x41200000    # 10.0f

    invoke-static {v6}, Lff;->p(F)F

    move-result v6

    move-object/from16 v0, v47

    invoke-virtual {v0, v6}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    move-object/from16 v0, v28

    move-object/from16 v1, v47

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    move-object/from16 v0, v26

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, v49

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v6, Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-direct {v6, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    move-object/from16 v0, p1

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v12, 0x41900000    # 18.0f

    invoke-virtual {v6, v12}, Landroid/widget/TextView;->setTextSize(F)V

    sget v12, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v20, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    rem-int v12, v12, v20

    const v20, -0x1ac42a

    xor-int v12, v12, v20

    move-object/from16 v46, v6

    move/from16 v55, v12

    goto/16 :goto_0

    :cond_d
    :sswitch_14
    sget v6, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v12, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    or-int/2addr v6, v12

    const v12, 0x1abc46

    add-int/2addr v6, v12

    move/from16 v55, v6

    goto/16 :goto_0

    :cond_e
    :sswitch_15
    sget v6, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    if-ltz v6, :cond_f

    const-string v6, "\u06e3\u06e1\u06e4"

    move-object/from16 v12, v34

    move/from16 v20, v17

    move/from16 v23, v36

    goto/16 :goto_1

    :cond_f
    sget v6, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v12, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    div-int/2addr v6, v12

    const v12, 0x1aa79d

    add-int/2addr v6, v12

    move/from16 v55, v6

    goto/16 :goto_0

    :sswitch_16
    move-object/from16 v6, v39

    move/from16 v12, v40

    :cond_10
    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟ۥۧۦۥ()I

    move-result v20

    if-gtz v20, :cond_11

    invoke-static {}, Landroidx/core/content/ۥۨۤۦ;->۟۠۠۠ۥ()I

    const-string v20, "\u06e5\u06e8\u06e6"

    move-object/from16 v39, v6

    move/from16 v40, v12

    move/from16 v23, v41

    :goto_e
    invoke-static/range {v20 .. v20}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v55, v6

    move/from16 v41, v23

    goto/16 :goto_0

    :cond_11
    sget v20, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v23, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    add-int v20, v20, v23

    const v23, 0x1ac003

    add-int v20, v20, v23

    move-object/from16 v39, v6

    move/from16 v40, v12

    move/from16 v55, v20

    goto/16 :goto_0

    :sswitch_17
    move-object v6, v7

    :cond_12
    sget v7, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v12, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sub-int/2addr v7, v12

    const v12, 0x1ab380

    add-int/2addr v12, v7

    move-object v7, v6

    move/from16 v55, v12

    goto/16 :goto_0

    :sswitch_18
    move-object/from16 v0, v29

    invoke-static {v0, v9}, Lc0;->x(Landroid/view/View;I)V

    sget v6, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v12, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    div-int/lit16 v12, v12, 0x1d6f

    xor-int/2addr v6, v12

    if-ltz v6, :cond_13

    const-string v6, "\u06e8\u06e5\u06e2"

    invoke-static {v6}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v55, v6

    goto/16 :goto_0

    :cond_13
    sget v6, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v12, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    xor-int/2addr v6, v12

    const v12, 0x1ab9b5

    xor-int/2addr v6, v12

    move/from16 v55, v6

    goto/16 :goto_0

    :sswitch_19
    move-object/from16 v0, p4

    iget v12, v0, Lon;->c:I

    sget v6, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v20, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    move/from16 v0, v20

    xor-int/lit16 v0, v0, 0x25a5

    move/from16 v20, v0

    sub-int v6, v6, v20

    if-gtz v6, :cond_14

    const-string v6, "\u06e3\u06e2\u06df"

    invoke-static {v6}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v30, v12

    move/from16 v55, v6

    goto/16 :goto_0

    :cond_14
    move-object/from16 v6, v29

    goto/16 :goto_b

    :sswitch_1a
    sget v6, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v8, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    xor-int/lit16 v8, v8, 0x1c05

    add-int/2addr v6, v8

    if-ltz v6, :cond_15

    const-string v6, "\u06e1\u06e5\u06e2"

    move v8, v10

    :goto_f
    invoke-static {v6}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v55, v6

    goto/16 :goto_0

    :cond_15
    sget v6, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v8, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    mul-int/2addr v6, v8

    const v8, 0x1afd1f

    add-int/2addr v6, v8

    move/from16 v55, v6

    move v8, v10

    goto/16 :goto_0

    :sswitch_1b
    const/4 v6, 0x0

    move-object/from16 v0, v46

    move/from16 v1, v24

    move/from16 v2, v22

    move/from16 v3, v21

    invoke-virtual {v0, v1, v6, v2, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    const v6, 0x3d4ccccd    # 0.05f

    move-object/from16 v0, v46

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setLetterSpacing(F)V

    move-object/from16 v0, v49

    move-object/from16 v1, v46

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v6, Landroid/widget/ScrollView;

    move-object/from16 v0, p0

    invoke-direct {v6, v0}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    sget v20, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    move/from16 v0, v20

    xor-int/lit16 v0, v0, 0x97

    move/from16 v20, v0

    move/from16 v0, v20

    move/from16 v1, v51

    invoke-direct {v12, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v6, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v12, 0x0

    invoke-virtual {v6, v12}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    move-object/from16 v12, v43

    move/from16 v38, v44

    :goto_10
    const-string v20, "\u06e8\u06df\u06e4"

    invoke-static/range {v20 .. v20}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v20

    move-object/from16 v42, v6

    move-object/from16 v43, v12

    move/from16 v55, v20

    goto/16 :goto_0

    :sswitch_1c
    invoke-static {}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟ۤۦۡ()I

    move-result v6

    if-ltz v6, :cond_16

    invoke-static {}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۥ۟۟ۢ()I

    const-string v6, "\u06e2\u06e6\u06e7"

    invoke-static {v6}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v6

    move/from16 v55, v6

    goto/16 :goto_0

    :cond_16
    sget v6, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v12, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    rem-int/2addr v6, v12

    const v12, 0x1ac8eb

    add-int/2addr v6, v12

    move/from16 v55, v6

    goto/16 :goto_0

    :sswitch_1d
    const-string v6, "\u06e6\u06e2\u06e2"

    move/from16 v41, v30

    goto/16 :goto_f

    :sswitch_1e
    const-string v6, "u2soKGkc6aZ"

    invoke-static {v6}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۦ۟ۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v12

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۠ۥۥ۟()I

    move-result v6

    if-gtz v6, :cond_17

    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->۟ۡۥ۟ۨ()I

    move-object/from16 v6, v42

    goto :goto_10

    :cond_17
    sget v6, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v20, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    mul-int v6, v6, v20

    const v20, 0x15e1c4

    add-int v6, v6, v20

    move-object/from16 v43, v12

    move/from16 v55, v6

    goto/16 :goto_0

    :sswitch_1f
    invoke-static {}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۟ۤۥۧۤ()I

    move-result v6

    if-gtz v6, :cond_18

    const/16 v6, 0x23

    sput v6, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    const-string v6, "\u06e3\u06e5\u06e6"

    invoke-static {v6}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v55, v6

    move/from16 v11, v25

    goto/16 :goto_0

    :cond_18
    const-string v6, "\u06e0\u06e6"

    invoke-static {v6}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v55, v6

    move/from16 v11, v25

    goto/16 :goto_0

    :sswitch_20
    move-object/from16 v0, v46

    move/from16 v1, v25

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    sget-object v6, Lmn;->a:Landroid/graphics/Typeface;

    const/4 v12, 0x1

    move-object/from16 v0, v46

    invoke-virtual {v0, v6, v12}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    sget v12, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    xor-int/lit16 v12, v12, -0xa9

    invoke-static {v12}, Lff;->q(I)I

    move-result v24

    invoke-static {v12}, Lff;->q(I)I

    move-result v22

    invoke-static/range {v44 .. v44}, Lff;->q(I)I

    move-result v21

    sget v12, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v19, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    move/from16 v0, v19

    or-int/lit16 v0, v0, 0xa69

    move/from16 v19, v0

    sub-int v12, v12, v19

    if-ltz v12, :cond_19

    invoke-static {}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۢۡۤ()I

    const-string v12, "\u06df\u06e4\u06e2"

    invoke-static {v12}, Landroid/app/۟ۦۦۤۥ;->ۦۨۥ۟(Ljava/lang/Object;)I

    move-result v12

    move-object/from16 v19, v6

    move/from16 v55, v12

    goto/16 :goto_0

    :cond_19
    const-string v12, "\u06df\u06e7\u06df"

    move-object/from16 v19, v6

    move-object/from16 v20, v12

    move/from16 v23, v14

    goto/16 :goto_7

    :sswitch_21
    move-object/from16 v0, v42

    move-object/from16 v1, v50

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    move-object/from16 v0, v49

    move-object/from16 v1, v42

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, v34

    move-object/from16 v1, v49

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, v48

    move-object/from16 v1, v34

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    new-instance v6, Lb6;

    sget v12, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    xor-int/lit16 v12, v12, -0x1ad

    move-object/from16 v0, v48

    move-object/from16 v1, v49

    invoke-direct {v6, v12, v0, v1}, Lb6;-><init>(ILandroid/app/Dialog;Landroid/widget/LinearLayout;)V

    move-object/from16 v0, v48

    invoke-virtual {v0, v6}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    invoke-virtual/range {v48 .. v48}, Landroid/app/Dialog;->show()V

    invoke-static {}, Lcom/google/android/material/carousel/۟ۧۡۢ;->۟ۦۥۣۧ()I

    move-result v6

    if-ltz v6, :cond_d

    sget v6, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v12, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    or-int/lit16 v12, v12, 0x387

    xor-int/2addr v6, v12

    if-ltz v6, :cond_1a

    invoke-static {}, Lcom/google/android/material/carousel/۠ۨۡۢ;->ۦۧۢ۟()I

    const-string v6, "\u06e7\u06e2\u06e4"

    invoke-static {v6}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v55, v6

    goto/16 :goto_0

    :cond_1a
    const-string v6, "\u06e5\u06e6\u06e1"

    move-object/from16 v20, v6

    move/from16 v23, v14

    goto/16 :goto_7

    :sswitch_22
    const-string v6, "Dico\n"

    const-string v9, "b0RcAKA+AZE=\n"

    invoke-static {v6, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v0, p0

    invoke-static {v6, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v6, "6nPgLqGBimg=\n"

    const-string v9, "nhqUQsTS/ho=\n"

    invoke-static {v6, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v0, p1

    invoke-static {v6, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v6, "CHCCfiI=\n"

    const-string v9, "YQTnE1FkpD4=\n"

    invoke-static {v6, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v0, p2

    invoke-static {v6, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v6, "CSbsVMo=\n"

    const-string v9, "fU6JOa9eEG4=\n"

    invoke-static {v6, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v0, p4

    invoke-static {v6, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v0, p4

    iget v12, v0, Lon;->e:I

    move-object/from16 v0, p4

    iget v9, v0, Lon;->g:I

    const-string v6, "ZbOw4JYEu8g=\n"

    const-string v20, "Ct3jhfph2Lw=\n"

    move-object/from16 v0, v20

    invoke-static {v6, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟ۢۡ۟۟()I

    move-result v6

    if-gtz v6, :cond_1b

    const-string v6, "\u06e3\u06df"

    invoke-static {v6}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v25, v12

    move/from16 v55, v6

    goto/16 :goto_0

    :cond_1b
    const-string v6, "\u06e1\u06e2\u06e3"

    goto/16 :goto_8

    :sswitch_23
    const/4 v6, 0x1

    move-object/from16 v0, v49

    invoke-virtual {v0, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    sget v6, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    xor-int/lit16 v12, v6, -0x163

    new-instance v6, Landroid/widget/FrameLayout$LayoutParams;

    move/from16 v0, v52

    invoke-direct {v6, v0, v12}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v20, 0x50

    move/from16 v0, v20

    iput v0, v6, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    move-object/from16 v0, v49

    invoke-virtual {v0, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v6}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    move-object/from16 v0, p4

    iget v0, v0, Lon;->b:I

    move/from16 v20, v0

    move/from16 v0, v20

    invoke-virtual {v6, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    sget v20, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v23, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    add-int v20, v20, v23

    const v23, 0x1ab30e

    xor-int v20, v20, v23

    move-object/from16 v45, v6

    move/from16 v51, v12

    move/from16 v55, v20

    goto/16 :goto_0

    :sswitch_24
    sget v6, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    xor-int/lit16 v0, v6, 0x1ec

    move/from16 v44, v0

    invoke-static/range {v44 .. v44}, Lff;->q(I)I

    move-result v6

    move-object/from16 v0, v27

    iput v6, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    invoke-static/range {v44 .. v44}, Lff;->q(I)I

    move-result v6

    move-object/from16 v0, v27

    iput v6, v0, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    move-object/from16 v0, v28

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v6}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    move-object/from16 v0, p4

    iget v12, v0, Lon;->f:I

    invoke-virtual {v6, v12}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    sget v12, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    xor-int/lit16 v12, v12, 0xdd

    invoke-virtual {v6, v12}, Landroid/graphics/drawable/GradientDrawable;->setAlpha(I)V

    const-string v12, "\u06e8\u06e2\u06e0"

    invoke-static {v12}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v12

    move-object/from16 v47, v6

    move/from16 v55, v12

    goto/16 :goto_0

    :sswitch_25
    const-string v6, "\u06e0\u06e7\u06e4"

    :goto_11
    invoke-static {v6}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v55, v6

    goto/16 :goto_0

    :cond_1c
    sget v23, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v39, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    add-int v23, v23, v39

    const v39, 0x1ab645

    add-int v23, v23, v39

    move-object/from16 v39, v6

    move/from16 v40, v12

    move/from16 v54, v20

    move/from16 v55, v23

    goto/16 :goto_0

    :sswitch_26
    move-object/from16 v0, v29

    invoke-static {v0, v9}, Lc0;->n(Landroid/view/View;I)V

    sget v6, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    if-gtz v6, :cond_1d

    const-string v6, "\u06e1\u06e4\u06e6"

    invoke-static {v6}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v55, v6

    goto/16 :goto_0

    :cond_1d
    const-string v12, "\u06df\u06e4\u06e2"

    move-object v6, v7

    goto/16 :goto_4

    :sswitch_27
    sget v6, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v12, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sub-int/2addr v6, v12

    const v12, 0x1aa643

    add-int/2addr v6, v12

    move/from16 v55, v6

    goto/16 :goto_0

    :sswitch_28
    if-eqz v56, :cond_5

    move-object/from16 v0, p4

    iget v12, v0, Lon;->i:I

    sget v6, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v20, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    move/from16 v0, v20

    add-int/lit16 v0, v0, 0x17df

    move/from16 v20, v0

    rem-int v6, v6, v20

    if-gtz v6, :cond_1f

    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۢۨۨۤ()I

    move/from16 v41, v12

    :cond_1e
    const-string v6, "\u06e5\u06e2\u06e2"

    goto :goto_11

    :cond_1f
    const-string v6, "\u06e1\u06e4\u06e4"

    move-object/from16 v20, v6

    move/from16 v23, v12

    goto/16 :goto_e

    :cond_20
    :sswitch_29
    invoke-static {}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۠ۥۥ۟()I

    move-result v6

    if-gtz v6, :cond_21

    invoke-static {}, Landroidx/savedstate/۠ۡۢ۠;->ۣ۟ۨۤۨ()I

    const-string v6, "\u06e8\u06e0\u06e0"

    invoke-static {v6}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v55, v6

    goto/16 :goto_0

    :cond_21
    sget v6, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v12, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    or-int/2addr v6, v12

    const v12, 0x1ab741

    add-int/2addr v6, v12

    move/from16 v55, v6

    goto/16 :goto_0

    :sswitch_2a
    const-string v6, "\u06e1\u06e5\u06e2"

    move-object/from16 v20, v6

    move/from16 v23, v41

    goto/16 :goto_e

    :sswitch_2b
    invoke-static {}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟۟ۤۦۨ()I

    move-result v6

    if-gtz v6, :cond_22

    invoke-static {}, Landroidx/appcompat/widget/۟ۢۨۦ;->۟ۦۡ۟۠()I

    const-string v12, "\u06e1\u06e0\u06e5"

    move-object/from16 v6, v29

    goto/16 :goto_d

    :cond_22
    const-string v6, "\u06df\u06df\u06e0"

    goto/16 :goto_9

    :sswitch_2c
    sget v6, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v12, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    xor-int/lit16 v12, v12, 0x13cb

    rem-int/2addr v6, v12

    if-ltz v6, :cond_23

    invoke-static {}, Landroidx/fragment/app/۟ۧۡۦ;->ۧۤۨ۟()I

    const-string v6, "\u06df\u06e7\u06df"

    invoke-static {v6}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v55, v6

    move/from16 v31, v32

    goto/16 :goto_0

    :cond_23
    const-string v12, "\u06e8\u06e6\u06e3"

    move-object/from16 v6, v29

    move-object/from16 v20, v12

    move/from16 v23, v32

    goto/16 :goto_c

    :sswitch_2d
    sget v6, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    if-gtz v6, :cond_24

    const/16 v6, 0x24

    sput v6, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    const-string v6, "\u06e7\u06e8\u06e4"

    invoke-static {v6}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v55, v6

    goto/16 :goto_0

    :cond_24
    sget v6, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v12, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    mul-int/2addr v6, v12

    const v12, 0x1bf638

    add-int/2addr v6, v12

    move/from16 v55, v6

    goto/16 :goto_0

    :sswitch_2e
    move-object/from16 v0, p4

    iget v13, v0, Lon;->j:F

    move/from16 v0, v53

    new-array v6, v0, [F

    const/4 v12, 0x0

    aput v13, v6, v12

    const/4 v12, 0x1

    aput v13, v6, v12

    const/4 v12, 0x2

    aput v13, v6, v12

    sget v12, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    xor-int/lit16 v12, v12, 0x329

    aput v13, v6, v12

    goto/16 :goto_6

    :sswitch_2f
    sget v6, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    if-ltz v6, :cond_25

    const-string v6, "\u06e8\u06e6\u06e3"

    invoke-static {v6}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v55, v6

    move v10, v11

    goto/16 :goto_0

    :cond_25
    move-object v6, v7

    move v10, v11

    goto/16 :goto_3

    :sswitch_30
    new-instance v6, Landroid/app/Dialog;

    const v12, -0x1030102

    sget v20, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    xor-int v12, v12, v20

    move-object/from16 v0, p0

    invoke-direct {v6, v0, v12}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    new-instance v33, Landroid/widget/FrameLayout;

    move-object/from16 v0, v33

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    sget v12, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    xor-int/lit8 v20, v12, -0x38

    new-instance v12, Landroid/view/ViewGroup$LayoutParams;

    move/from16 v0, v20

    move/from16 v1, v20

    invoke-direct {v12, v0, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    move-object/from16 v0, v33

    invoke-virtual {v0, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    sget v12, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    xor-int/lit16 v0, v12, -0x181

    move/from16 v23, v0

    new-instance v12, Lu6;

    move/from16 v0, v23

    invoke-direct {v12, v6, v0}, Lu6;-><init>(Landroid/app/Dialog;I)V

    move-object/from16 v0, v33

    invoke-virtual {v0, v12}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v12, Landroid/widget/LinearLayout;

    move-object/from16 v0, p0

    invoke-direct {v12, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    sget v48, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v49, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    mul-int v48, v48, v49

    const v49, 0x1817a8

    add-int v55, v48, v49

    move-object/from16 v48, v6

    move-object/from16 v49, v12

    move/from16 v52, v20

    move/from16 v53, v23

    goto/16 :goto_0

    :sswitch_31
    sget v6, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    xor-int/lit8 v6, v6, 0xc

    move-object/from16 v0, v42

    invoke-virtual {v0, v6}, Landroid/view/View;->setOverScrollMode(I)V

    const/4 v6, 0x0

    move-object/from16 v0, v42

    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    new-instance v6, Lw6;

    const/4 v12, 0x1

    invoke-direct {v6, v12}, Lw6;-><init>(I)V

    move-object/from16 v0, v42

    invoke-virtual {v0, v6}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    new-instance v6, Landroid/widget/LinearLayout;

    move-object/from16 v0, p0

    invoke-direct {v6, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v12, 0x1

    invoke-virtual {v6, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-static/range {v38 .. v38}, Lff;->q(I)I

    move-result v12

    const/16 v20, 0x0

    invoke-static/range {v38 .. v38}, Lff;->q(I)I

    move-result v23

    sget v35, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    xor-int/lit8 v35, v35, -0xb

    invoke-static/range {v35 .. v35}, Lff;->q(I)I

    move-result v35

    move/from16 v0, v20

    move/from16 v1, v23

    move/from16 v2, v35

    invoke-virtual {v6, v12, v0, v1, v2}, Landroid/view/View;->setPadding(IIII)V

    move-object/from16 v0, p2

    array-length v0, v0

    move/from16 v35, v0

    sget v12, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v20, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    move/from16 v0, v20

    div-int/lit16 v0, v0, 0x451

    move/from16 v20, v0

    xor-int v12, v12, v20

    if-gtz v12, :cond_26

    invoke-static {}, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۢ۠ۨ۟()I

    const-string v12, "\u06e2\u06e0\u06e4"

    invoke-static {v12}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v12

    move-object/from16 v50, v6

    move/from16 v55, v12

    goto/16 :goto_0

    :cond_26
    sget v12, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v20, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    div-int v12, v12, v20

    const v20, 0xdc46

    add-int v12, v12, v20

    move-object/from16 v50, v6

    move/from16 v55, v12

    goto/16 :goto_0

    :sswitch_32
    move-object/from16 v0, v29

    invoke-virtual {v5, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v23, "\u06e2\u06e5\u06e3"

    move-object/from16 v6, v26

    move-object/from16 v12, v27

    move-object/from16 v20, v28

    goto/16 :goto_a

    :sswitch_33
    new-instance v5, Landroid/widget/LinearLayout;

    move-object/from16 v0, p0

    invoke-direct {v5, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v4, 0x0

    invoke-virtual {v5, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    move/from16 v0, v31

    invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->setGravity(I)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    sget v6, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    xor-int/lit8 v6, v6, -0x3a

    sget v12, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    xor-int/lit16 v12, v12, 0x26f

    invoke-direct {v4, v6, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static/range {v53 .. v53}, Lff;->q(I)I

    move-result v6

    iput v6, v4, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v5, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const-string v6, "\u06e7\u06e8\u06e4"

    :goto_12
    invoke-static {v6}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v55, v6

    goto/16 :goto_0

    :sswitch_34
    const/4 v12, 0x0

    sget v6, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v20, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sub-int v6, v6, v20

    const v20, -0x1ab7c8

    xor-int v6, v6, v20

    move/from16 v55, v6

    move/from16 v56, v12

    goto/16 :goto_0

    :sswitch_35
    sget v6, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v12, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    xor-int/lit16 v12, v12, 0x2289

    add-int/2addr v6, v12

    if-ltz v6, :cond_27

    const/4 v6, 0x0

    sput v6, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    const-string v6, "\u06e8\u06e8\u06e0"

    invoke-static {v6}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v6

    move/from16 v55, v6

    goto/16 :goto_0

    :cond_27
    sget v6, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v12, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    rem-int/2addr v6, v12

    const v12, 0x1aad18

    add-int/2addr v6, v12

    move/from16 v55, v6

    goto/16 :goto_0

    :cond_28
    :sswitch_36
    sget v6, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v12, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    div-int/2addr v6, v12

    const v12, 0x1aabd9

    add-int/2addr v6, v12

    move/from16 v55, v6

    goto/16 :goto_0

    :sswitch_37
    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v6}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v12, 0x1

    invoke-virtual {v6, v12}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    invoke-virtual {v6, v9}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    move-object/from16 v0, v29

    invoke-virtual {v0, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/high16 v12, 0x40800000    # 4.0f

    invoke-static {v12}, Lff;->p(F)F

    move-result v12

    move-object/from16 v0, v29

    invoke-virtual {v0, v12}, Landroid/view/View;->setElevation(F)V

    const/16 v12, 0x1c

    if-lt v6, v12, :cond_e

    sget v6, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    if-gtz v6, :cond_29

    invoke-static {}, Landroid/app/ۦۥۡ۠;->ۥۣۡۧ()I

    const-string v6, "\u06e3\u06df\u06e7"

    goto :goto_12

    :cond_29
    const-string v6, "\u06e2\u06e0\u06e4"

    goto/16 :goto_2

    :sswitch_38
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc06 -> :sswitch_0
        0xdc46 -> :sswitch_1
        0xdc5c -> :sswitch_37
        0xdcfe -> :sswitch_15
        0x1aa700 -> :sswitch_6
        0x1aa763 -> :sswitch_11
        0x1aa79d -> :sswitch_32
        0x1aa7d9 -> :sswitch_16
        0x1aa7f7 -> :sswitch_1b
        0x1aa819 -> :sswitch_9
        0x1aaadf -> :sswitch_17
        0x1aab1d -> :sswitch_10
        0x1aab44 -> :sswitch_3
        0x1aab45 -> :sswitch_5
        0x1aab5c -> :sswitch_22
        0x1aab7a -> :sswitch_2a
        0x1aab7d -> :sswitch_24
        0x1aabbd -> :sswitch_12
        0x1aabd9 -> :sswitch_21
        0x1aae82 -> :sswitch_23
        0x1aaee2 -> :sswitch_30
        0x1aaf21 -> :sswitch_2d
        0x1aaf22 -> :sswitch_1d
        0x1aaf23 -> :sswitch_27
        0x1aaf3e -> :sswitch_33
        0x1ab246 -> :sswitch_2a
        0x1ab266 -> :sswitch_18
        0x1ab300 -> :sswitch_1c
        0x1ab323 -> :sswitch_2e
        0x1ab607 -> :sswitch_10
        0x1ab608 -> :sswitch_35
        0x1ab60b -> :sswitch_36
        0x1ab64a -> :sswitch_19
        0x1ab660 -> :sswitch_2f
        0x1ab6a5 -> :sswitch_a
        0x1ab6c4 -> :sswitch_1f
        0x1ab6e4 -> :sswitch_b
        0x1ab71f -> :sswitch_d
        0x1ab9c9 -> :sswitch_29
        0x1aba46 -> :sswitch_26
        0x1aba62 -> :sswitch_14
        0x1aba66 -> :sswitch_3
        0x1aba9f -> :sswitch_38
        0x1abde5 -> :sswitch_4
        0x1abe60 -> :sswitch_1e
        0x1abe61 -> :sswitch_c
        0x1ac1a6 -> :sswitch_e
        0x1ac1aa -> :sswitch_8
        0x1ac262 -> :sswitch_2b
        0x1ac529 -> :sswitch_f
        0x1ac569 -> :sswitch_12
        0x1ac583 -> :sswitch_25
        0x1ac586 -> :sswitch_20
        0x1ac608 -> :sswitch_34
        0x1ac623 -> :sswitch_28
        0x1ac8c8 -> :sswitch_2b
        0x1ac8cd -> :sswitch_31
        0x1ac8eb -> :sswitch_2c
        0x1ac926 -> :sswitch_13
        0x1ac947 -> :sswitch_1a
        0x1ac985 -> :sswitch_b
        0x1ac9a5 -> :sswitch_2
        0x1ac9e0 -> :sswitch_7
    .end sparse-switch
.end method
