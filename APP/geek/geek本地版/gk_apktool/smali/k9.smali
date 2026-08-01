.class public final Lk9;
.super Lde/robv/android/xposed/XC_MethodHook;


# instance fields
.field public final a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 4

    iput p1, p0, Lk9;->a:I

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    const-wide/16 v0, 0x0

    const-string v2, "\u06e1\u06e3\u06e6"

    invoke-static {v2}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v2

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۢ۠ۨ۟()I

    move-result v2

    if-ltz v2, :cond_1

    sget v2, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v3, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    add-int/lit16 v3, v3, -0xd8e

    rem-int/2addr v2, v3

    if-ltz v2, :cond_5

    const/16 v2, 0x2c

    sput v2, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    :cond_0
    const-string v2, "\u06e2\u06e3\u06e0"

    invoke-static {v2}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :cond_1
    :sswitch_1
    sget v2, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v3, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    xor-int/lit16 v3, v3, 0x754

    div-int/2addr v2, v3

    if-eqz v2, :cond_2

    const/16 v2, 0x61

    sput v2, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    const-string v2, "\u06e1\u06e7\u06e0"

    invoke-static {v2}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :cond_2
    sget v2, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v3, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    or-int/2addr v2, v3

    const v3, 0x1ab350

    xor-int/2addr v2, v3

    goto :goto_0

    :sswitch_2
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

    invoke-static {}, Landroidx/core/content/ۣ۟ۧ۠;->۟۟۠ۢۨ()I

    move-result v2

    if-ltz v2, :cond_0

    const-string v2, "\u06e1\u06e3\u06e6"

    invoke-static {v2}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :sswitch_3
    sget v2, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v3, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    div-int/lit16 v3, v3, -0x6db

    add-int/2addr v2, v3

    if-ltz v2, :cond_3

    const-string v2, "\u06e0\u06e1\u06e5"

    invoke-static {v2}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :cond_3
    sget v2, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v3, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    or-int/2addr v2, v3

    const v3, -0x1aafaf

    xor-int/2addr v2, v3

    goto :goto_0

    :sswitch_4
    const-string v0, "3M3dPU3kISqRt1LqoLa"

    invoke-static {v0}, L۠ۡۢۨ;->۠ۨۡ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget v2, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sget v3, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    add-int/lit16 v3, v3, -0xb1d

    div-int/2addr v2, v3

    if-eqz v2, :cond_4

    const/16 v2, 0x11

    sput v2, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    :cond_4
    const-string v2, "\u06e8\u06e3\u06e6"

    invoke-static {v2}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v2

    goto/16 :goto_0

    :cond_5
    sget v2, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v3, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sub-int/2addr v2, v3

    const v3, 0x1aba77

    add-int/2addr v2, v3

    goto/16 :goto_0

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aaf04 -> :sswitch_0
        0x1ab2bf -> :sswitch_5
        0x1aba09 -> :sswitch_4
        0x1aba64 -> :sswitch_1
        0x1ac58b -> :sswitch_3
        0x1ac94b -> :sswitch_2
    .end sparse-switch
.end method

.method public static final a(Lk9;Landroid/app/Activity;Landroid/view/ViewGroup;Landroid/view/ViewGroup;)V
    .locals 43

    const/16 v27, 0x0

    const/16 v34, 0x0

    const/16 v33, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/4 v14, 0x0

    const/4 v12, 0x0

    const/16 v22, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v29, 0x0

    const/4 v2, 0x0

    const/16 v19, 0x0

    const/4 v11, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v24, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/16 v20, 0x0

    const/4 v9, 0x0

    const/16 v18, 0x0

    const/16 v23, 0x0

    const/16 v26, 0x0

    const/16 v39, 0x0

    const/16 v32, 0x0

    const/16 v40, 0x0

    const/16 v25, 0x0

    const/16 v21, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v31, 0x0

    const-string v7, "\u06e6\u06e5\u06e8"

    invoke-static {v7}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v41, v2

    move/from16 v42, v7

    :goto_0
    sparse-switch v42, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۡۦۣۨ()I

    move-result v2

    if-ltz v2, :cond_1b

    invoke-static {}, Landroidx/core/widget/ۣۤۨۢ;->ۥۢۡۥ()I

    const-string v2, "\u06e2\u06df\u06e4"

    invoke-static {v2}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v13, v33

    move/from16 v42, v2

    goto :goto_0

    :sswitch_1
    move-object/from16 v2, v27

    check-cast v2, Landroid/view/ViewGroup;

    const-string v7, "\u06e7\u06e4\u06e1"

    move-object v13, v2

    :goto_1
    invoke-static {v7}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v42, v2

    goto :goto_0

    :sswitch_2
    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v7, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    xor-int/lit16 v7, v7, 0x1597

    sub-int/2addr v2, v7

    if-gtz v2, :cond_0

    const/16 v2, 0x28

    sput v2, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    const-string v2, "\u06e6\u06e5\u06e4"

    move-object/from16 v7, v29

    move/from16 v10, v31

    :goto_2
    invoke-static {v2}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v29, v7

    move/from16 v42, v2

    move/from16 v31, v10

    goto :goto_0

    :cond_0
    sget v2, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v7, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    rem-int/2addr v2, v7

    const v7, 0x1aaec6

    xor-int/2addr v2, v7

    move/from16 v42, v2

    goto :goto_0

    :sswitch_3
    move-object/from16 v0, v26

    iget-object v2, v0, Lh40;->i:Ljava/util/ArrayList;

    move-object/from16 v0, v32

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_19

    sget v7, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    if-gtz v7, :cond_1

    const/16 v7, 0x59

    sput v7, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    const-string v7, "\u06e5\u06e5\u06e5"

    invoke-static {v7}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v40, v2

    move/from16 v42, v7

    goto :goto_0

    :cond_1
    sget v7, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v10, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    xor-int/2addr v7, v10

    const v10, -0x1ab1c7

    xor-int/2addr v7, v10

    move-object/from16 v40, v2

    move/from16 v42, v7

    goto :goto_0

    :sswitch_4
    move-object/from16 v0, v40

    move-object/from16 v1, v32

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget v2, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v7, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    div-int/lit16 v7, v7, -0x1f3

    sub-int/2addr v2, v7

    if-ltz v2, :cond_14

    invoke-static {}, Landroidx/fragment/app/۟ۧۡۦ;->ۧۤۨ۟()I

    const-string v2, "\u06e5\u06df\u06e6"

    invoke-static {v2}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v42, v2

    goto/16 :goto_0

    :sswitch_5
    const/4 v10, 0x0

    sget v2, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    if-ltz v2, :cond_2

    const-string v7, "\u06e5\u06e3\u06e6"

    move-object/from16 v2, v32

    :goto_3
    invoke-static {v7}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v32, v2

    move-object/from16 v33, v10

    move/from16 v42, v7

    goto/16 :goto_0

    :cond_2
    const-string v2, "\u06df\u06e1"

    invoke-static {v2}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v33, v10

    move/from16 v42, v2

    goto/16 :goto_0

    :sswitch_6
    const/16 v30, 0x0

    sget v2, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v7, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    xor-int/2addr v2, v7

    const v7, 0xd8ce

    add-int/2addr v2, v7

    move/from16 v42, v2

    goto/16 :goto_0

    :sswitch_7
    const-string v2, "\u06e5\u06e5\u06e5"

    :goto_4
    invoke-static {v2}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v42, v2

    goto/16 :goto_0

    :sswitch_8
    new-instance v2, Ljava/lang/UnsupportedOperationException;

    const-string v3, "Error: Update listeners must be added beforethe animation."

    invoke-direct {v2, v3}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v2

    :sswitch_9
    const-string v2, "\u06e7\u06e0\u06e5"

    move-object/from16 v7, v30

    move/from16 v10, v31

    goto/16 :goto_2

    :sswitch_a
    move-object/from16 v2, v32

    :cond_3
    sget v7, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v10, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    add-int/2addr v7, v10

    const v10, 0x1abdb3

    add-int/2addr v7, v10

    move-object/from16 v32, v2

    move/from16 v42, v7

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۡۦۣۨ()I

    move-result v2

    if-ltz v2, :cond_4

    const/4 v2, 0x5

    sput v2, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    const-string v2, "\u06e1\u06e6"

    move-object/from16 v7, v34

    :goto_5
    invoke-static {v2}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v34, v7

    move/from16 v42, v2

    goto/16 :goto_0

    :cond_4
    const-string v2, "\u06e6\u06e5\u06e8"

    move-object/from16 v7, v34

    goto :goto_5

    :sswitch_c
    const-string v7, "\u06df\u06e0\u06e8"

    move-object/from16 v2, v35

    move/from16 v10, v36

    :goto_6
    invoke-static {v7}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v35, v2

    move/from16 v36, v10

    move/from16 v42, v7

    goto/16 :goto_0

    :sswitch_d
    const/4 v2, 0x0

    sget v7, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    xor-int/lit16 v7, v7, 0x3b4

    invoke-static {v7}, Lff;->q(I)I

    move-result v7

    const/4 v10, 0x0

    sget v35, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    move/from16 v0, v35

    xor-int/lit16 v0, v0, -0x1f3

    move/from16 v35, v0

    invoke-static/range {v35 .. v35}, Lff;->q(I)I

    move-result v35

    move/from16 v0, v35

    invoke-virtual {v11, v2, v7, v10, v0}, Landroid/view/View;->setPadding(IIII)V

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    sget v7, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    xor-int/lit16 v7, v7, 0x362

    sget v10, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    xor-int/lit16 v10, v10, -0x163

    invoke-direct {v2, v7, v10}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v7, 0x50

    iput v7, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    sget v7, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    xor-int/lit8 v10, v7, 0x1e

    invoke-static {}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->۟ۡۨۢ()I

    move-result v7

    if-gtz v7, :cond_5

    const/16 v7, 0x10

    sput v7, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    const-string v7, "\u06e3\u06e3\u06e5"

    goto :goto_6

    :sswitch_e
    sget v2, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v7, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sub-int/2addr v2, v7

    const v7, 0x1aa601

    add-int/2addr v2, v7

    move/from16 v42, v2

    goto/16 :goto_0

    :sswitch_f
    invoke-virtual/range {p3 .. p3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v27

    move-object/from16 v0, v27

    instance-of v2, v0, Landroid/view/ViewGroup;

    const/16 v34, 0x0

    if-eqz v2, :cond_1c

    sget v2, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v7, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    rem-int/lit16 v7, v7, 0xa6b

    add-int/2addr v2, v7

    if-gtz v2, :cond_6

    move-object/from16 v2, v35

    move/from16 v10, v36

    :cond_5
    const-string v7, "\u06e6\u06e6\u06e0"

    invoke-static {v7}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v35, v2

    move/from16 v36, v10

    move/from16 v42, v7

    goto/16 :goto_0

    :cond_6
    sget v2, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v7, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    or-int/2addr v2, v7

    const v7, 0x1aaceb

    add-int/2addr v2, v7

    move/from16 v42, v2

    goto/16 :goto_0

    :sswitch_10
    new-instance v24, Landroid/view/View;

    move-object/from16 v0, v24

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    move-object/from16 v0, v24

    invoke-virtual {v11, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v3, Lh00;

    invoke-direct {v3}, Lh00;-><init>()V

    new-instance v4, Le00;

    invoke-direct {v4}, Le00;-><init>()V

    :goto_7
    const-string v2, "\u06e0\u06e4\u06e5"

    invoke-static {v2}, L۠ۡۢۨ;->۟ۡۧۡۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v42, v2

    goto/16 :goto_0

    :sswitch_11
    if-eqz v29, :cond_1d

    invoke-virtual/range {v29 .. v29}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    sget v7, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    if-gtz v7, :cond_7

    const-string v7, "\u06e8\u06e7\u06e1"

    invoke-static {v7}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v41, v2

    move-object/from16 v19, v34

    move/from16 v42, v7

    goto/16 :goto_0

    :cond_7
    sget v7, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v10, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sub-int/2addr v7, v10

    const v10, 0x1ac170

    xor-int/2addr v7, v10

    move-object/from16 v41, v2

    move-object/from16 v19, v34

    move/from16 v42, v7

    goto/16 :goto_0

    :sswitch_12
    sget v2, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v7, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    add-int/lit16 v7, v7, -0x1f7a

    div-int/2addr v2, v7

    if-eqz v2, :cond_8

    const-string v2, "\u06e4\u06e2\u06df"

    move-object v7, v2

    goto/16 :goto_1

    :cond_8
    const-string v2, "\u06e7\u06e0\u06e5"

    invoke-static {v2}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v42, v2

    goto/16 :goto_0

    :sswitch_13
    invoke-virtual/range {p3 .. p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v15

    move-object/from16 v0, p3

    invoke-virtual {v13, v0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v14

    const v2, 0x102020d

    sget v7, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    xor-int/2addr v2, v7

    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/FrameLayout;

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v7

    iget v0, v7, Landroid/util/DisplayMetrics;->density:F

    move/from16 v22, v0

    sget v7, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v10, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    xor-int/lit16 v10, v10, -0x1e2d

    xor-int/2addr v7, v10

    if-ltz v7, :cond_b

    const-string v7, "\u06e2\u06e7"

    invoke-static {v7}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v7

    move-object v12, v2

    move/from16 v42, v7

    goto/16 :goto_0

    :cond_9
    :sswitch_14
    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v7, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    add-int/lit16 v7, v7, -0x1c81

    add-int/2addr v2, v7

    if-ltz v2, :cond_a

    const-string v2, "\u06df\u06e3\u06e6"

    goto/16 :goto_4

    :cond_a
    sget v2, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v7, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    div-int/2addr v2, v7

    const v7, 0x1aa73d

    add-int/2addr v2, v7

    move/from16 v42, v2

    goto/16 :goto_0

    :sswitch_15
    move-object/from16 v2, v28

    check-cast v2, Landroid/view/View;

    invoke-static {}, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۣۨ()I

    move-result v7

    if-gtz v7, :cond_12

    move-object/from16 v29, v2

    goto/16 :goto_7

    :sswitch_16
    sget v2, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v7, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    div-int/lit16 v7, v7, 0x13c7

    sub-int/2addr v2, v7

    if-gtz v2, :cond_c

    move-object v2, v12

    :cond_b
    const-string v7, "\u06e3\u06e4\u06e7"

    invoke-static {v7}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v7

    move-object v12, v2

    move/from16 v42, v7

    goto/16 :goto_0

    :cond_c
    sget v2, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v7, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    xor-int/2addr v2, v7

    const v7, 0x1acbeb

    xor-int/2addr v2, v7

    move/from16 v42, v2

    goto/16 :goto_0

    :sswitch_17
    new-instance v2, Ldm;

    const/4 v7, 0x1

    move-object/from16 v0, v38

    invoke-direct {v2, v0, v7}, Ldm;-><init>(Landroid/view/View;I)V

    move-object/from16 v0, v37

    invoke-virtual {v0, v2}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    new-instance v2, Lmh;

    const/4 v7, 0x1

    move-object/from16 v0, v38

    invoke-direct {v2, v7, v0}, Lmh;-><init>(ILjava/lang/Object;)V

    move-object/from16 v0, v37

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    sget v2, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    xor-int/lit16 v2, v2, -0xfd

    add-int v31, v31, v2

    sget v2, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v7, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    rem-int/lit16 v7, v7, 0x15eb

    mul-int/2addr v2, v7

    if-gtz v2, :cond_d

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۦۥ()I

    const-string v2, "\u06e4\u06df\u06e1"

    invoke-static {v2}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v42, v2

    goto/16 :goto_0

    :cond_d
    const-string v2, "\u06df\u06e8\u06e0"

    invoke-static {v2}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v42, v2

    goto/16 :goto_0

    :sswitch_18
    move/from16 v0, v31

    move/from16 v1, v25

    if-ge v0, v1, :cond_20

    move-object/from16 v0, p3

    move/from16 v1, v31

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Lip;->l(Ljava/lang/Object;)V

    invoke-static {v2}, La80;->j(Landroid/view/View;)Landroid/view/View;

    move-result-object v7

    sget v10, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    if-ltz v10, :cond_e

    const/16 v10, 0x23

    sput v10, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    const-string v10, "\u06e2\u06e3\u06e1"

    invoke-static {v10}, L۠ۡۢۨ;->۟ۡۧۡۥ(Ljava/lang/Object;)I

    move-result v10

    move-object/from16 v37, v2

    move-object/from16 v38, v7

    move/from16 v42, v10

    goto/16 :goto_0

    :cond_e
    const-string v10, "\u06e5\u06e1"

    :goto_8
    invoke-static {v10}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v10

    move-object/from16 v37, v2

    move-object/from16 v38, v7

    move/from16 v42, v10

    goto/16 :goto_0

    :cond_f
    :sswitch_19
    sget v2, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v7, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    xor-int/2addr v2, v7

    const v7, 0x1aa6f5

    add-int/2addr v2, v7

    move/from16 v42, v2

    goto/16 :goto_0

    :sswitch_1a
    new-instance v23, Landroid/graphics/drawable/ColorDrawable;

    const/4 v2, 0x0

    move-object/from16 v0, v23

    invoke-direct {v0, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    new-instance v26, Lh40;

    sget-object v2, Lh40;->l:Lqh;

    move-object/from16 v0, v26

    move-object/from16 v1, v24

    invoke-direct {v0, v1, v2}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    new-instance v2, Li40;

    invoke-direct {v2}, Li40;-><init>()V

    const/high16 v7, 0x43160000    # 150.0f

    invoke-virtual {v2, v7}, Li40;->b(F)V

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟ۢۡ۟۟()I

    move-result v7

    if-gtz v7, :cond_10

    const-string v7, "\u06df\u06e5\u06e1"

    invoke-static {v7}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v39, v2

    move/from16 v42, v7

    goto/16 :goto_0

    :cond_10
    const-string v7, "\u06e8\u06e4\u06df"

    :goto_9
    invoke-static {v7}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v39, v2

    move/from16 v42, v7

    goto/16 :goto_0

    :sswitch_1b
    invoke-virtual/range {p3 .. p3}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v16

    invoke-virtual {v13}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v17

    invoke-virtual {v13}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v28

    move-object/from16 v0, v28

    instance-of v2, v0, Landroid/view/View;

    if-eqz v2, :cond_f

    sget v2, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v7, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    rem-int/lit16 v7, v7, -0x1968

    rem-int/2addr v2, v7

    if-ltz v2, :cond_11

    const-string v2, "\u06e5\u06e0\u06e5"

    invoke-static {v2}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v42, v2

    goto/16 :goto_0

    :cond_11
    sget v2, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v7, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    div-int/2addr v2, v7

    const v7, 0x1aab24

    add-int/2addr v2, v7

    move/from16 v42, v2

    goto/16 :goto_0

    :sswitch_1c
    const v2, 0x3f19999a    # 0.6f

    move-object/from16 v0, v39

    invoke-virtual {v0, v2}, Li40;->a(F)V

    move-object/from16 v0, v39

    move-object/from16 v1, v26

    iput-object v0, v1, Lh40;->j:Li40;

    new-instance v2, Ll9;

    const/4 v7, 0x1

    move-object/from16 v0, v24

    invoke-direct {v2, v7, v0}, Ll9;-><init>(ILjava/lang/Object;)V

    move-object/from16 v0, v26

    iget-boolean v7, v0, Lh40;->e:Z

    if-nez v7, :cond_3

    const-string v7, "\u06e3\u06e7\u06e0"

    move-object/from16 v10, v33

    goto/16 :goto_3

    :sswitch_1d
    sget v2, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    if-ltz v2, :cond_13

    const/16 v2, 0x34

    sput v2, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    move-object/from16 v2, v29

    :cond_12
    const-string v7, "\u06e4\u06e0\u06e4"

    invoke-static {v7}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v29, v2

    move/from16 v42, v7

    goto/16 :goto_0

    :cond_13
    sget v2, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v7, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    add-int/2addr v2, v7

    const v7, 0x1ab601

    add-int/2addr v2, v7

    move/from16 v42, v2

    goto/16 :goto_0

    :sswitch_1e
    if-nez v13, :cond_9

    sget v2, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v7, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    add-int/lit16 v7, v7, 0x1e12

    sub-int/2addr v2, v7

    if-ltz v2, :cond_15

    invoke-static {}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۥۣۢۡ()I

    :cond_14
    const-string v2, "\u06e5\u06e1\u06e6"

    invoke-static {v2}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v42, v2

    goto/16 :goto_0

    :cond_15
    const-string v2, "\u06e2\u06e4"

    invoke-static {v2}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣ۟ۦۥۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v42, v2

    goto/16 :goto_0

    :sswitch_1f
    invoke-virtual/range {p3 .. p3}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v42

    new-instance v2, Lps;

    move-object/from16 v7, p1

    move-object/from16 v10, p3

    move-object/from16 v21, p2

    move-object/from16 v25, p0

    invoke-direct/range {v2 .. v26}, Lps;-><init>(Lh00;Le00;Le00;Lg00;Landroid/app/Activity;Lg00;Li00;Landroid/view/ViewGroup;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Landroid/view/ViewGroup;ILandroid/view/ViewGroup$LayoutParams;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Le00;Landroid/graphics/drawable/Drawable;Li00;Landroid/view/ViewGroup;FLandroid/graphics/drawable/ColorDrawable;Landroid/view/View;Lk9;Lh40;)V

    move-object/from16 v0, v42

    invoke-virtual {v0, v2}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    invoke-virtual/range {p3 .. p3}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v25

    const/16 v21, 0x0

    sget v2, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v7, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    div-int/lit16 v7, v7, -0x160c

    mul-int/2addr v2, v7

    if-eqz v2, :cond_16

    invoke-static {}, Lۣ۟ۢ۠۠;->۠۟ۥ۠()I

    const-string v10, "\u06e7\u06df\u06e3"

    move-object/from16 v2, v37

    move-object/from16 v7, v38

    goto/16 :goto_8

    :cond_16
    sget v2, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v7, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    mul-int/2addr v2, v7

    const v7, 0x21331a

    add-int/2addr v2, v7

    move/from16 v42, v2

    goto/16 :goto_0

    :sswitch_20
    sget v2, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v7, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    or-int/2addr v2, v7

    const v7, 0x1abeb3

    add-int/2addr v2, v7

    move-object/from16 v19, v41

    move/from16 v42, v2

    goto/16 :goto_0

    :sswitch_21
    new-instance v11, Landroid/widget/FrameLayout;

    move-object/from16 v0, p1

    invoke-direct {v11, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const-string v2, "B+7xkdrGuHwF5vCRzP6BZxjm9IjH6w==\n"

    const-string v7, "aoeE+KKZ3hA=\n"

    invoke-static {v2, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v11, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 v2, 0x0

    invoke-virtual {v11, v2}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    const/4 v2, 0x0

    invoke-virtual {v11, v2}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    sget v2, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    if-gtz v2, :cond_17

    const-string v7, "\u06e6\u06e5\u06e8"

    move-object/from16 v2, v39

    goto/16 :goto_9

    :cond_17
    sget v2, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v7, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    mul-int/2addr v2, v7

    const v7, 0xda3b

    xor-int/2addr v2, v7

    move/from16 v42, v2

    goto/16 :goto_0

    :sswitch_22
    invoke-static {}, Landroidx/savedstate/ۡۤۨۡ;->ۧۨۧ۠()I

    move-result v2

    if-gtz v2, :cond_18

    invoke-static {}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۡۦۣۨ()I

    const-string v2, "\u06e1\u06e1\u06e6"

    invoke-static {v2}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v42, v2

    move/from16 v31, v21

    goto/16 :goto_0

    :cond_18
    const-string v2, "\u06e5\u06e5\u06e5"

    move-object/from16 v7, v29

    move/from16 v10, v21

    goto/16 :goto_2

    :sswitch_23
    move-object/from16 v2, v40

    :cond_19
    sget v7, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v10, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    rem-int/lit16 v10, v10, -0x187d

    rem-int/2addr v7, v10

    if-gtz v7, :cond_1a

    const/4 v7, 0x0

    sput v7, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    const-string v7, "\u06e5\u06e7"

    invoke-static {v7}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v40, v2

    move/from16 v42, v7

    goto/16 :goto_0

    :cond_1a
    sget v7, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v10, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    add-int/2addr v7, v10

    const v10, 0x1abfa9

    add-int/2addr v7, v10

    move-object/from16 v40, v2

    move/from16 v42, v7

    goto/16 :goto_0

    :cond_1b
    sget v2, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v7, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    or-int/2addr v2, v7

    const v7, 0x1aa95b

    add-int/2addr v2, v7

    move-object/from16 v13, v33

    move/from16 v42, v2

    goto/16 :goto_0

    :sswitch_24
    new-instance v8, Lg00;

    invoke-direct {v8}, Lg00;-><init>()V

    new-instance v20, Li00;

    invoke-direct/range {v20 .. v20}, Li00;-><init>()V

    new-instance v9, Li00;

    invoke-direct {v9}, Li00;-><init>()V

    new-instance v18, Le00;

    invoke-direct/range {v18 .. v18}, Le00;-><init>()V

    const-string v2, "\u06e1\u06e4"

    invoke-static {v2}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v42, v2

    goto/16 :goto_0

    :cond_1c
    move-object/from16 v7, v34

    :goto_a
    const-string v2, "\u06e3\u06e3\u06e5"

    goto/16 :goto_5

    :sswitch_25
    invoke-static/range {v36 .. v36}, Lff;->q(I)I

    move-result v2

    const/4 v7, 0x0

    invoke-static/range {v36 .. v36}, Lff;->q(I)I

    move-result v10

    sget v42, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    move/from16 v0, v42

    xor-int/lit16 v0, v0, -0x378

    move/from16 v42, v0

    invoke-static/range {v42 .. v42}, Lff;->q(I)I

    move-result v42

    move-object/from16 v0, v35

    move/from16 v1, v42

    invoke-virtual {v0, v2, v7, v10, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    move-object/from16 v0, v35

    invoke-virtual {v11, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v2, 0x1

    invoke-virtual {v11, v2}, Landroid/view/View;->setClipToOutline(Z)V

    new-instance v2, Lrs;

    move/from16 v0, v22

    invoke-direct {v2, v0}, Lrs;-><init>(F)V

    invoke-virtual {v11, v2}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    sget v2, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v7, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    mul-int/2addr v2, v7

    const v7, 0x13647a

    add-int/2addr v2, v7

    move/from16 v42, v2

    goto/16 :goto_0

    :cond_1d
    move-object/from16 v19, v34

    :sswitch_26
    sget v2, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v7, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    add-int/lit16 v7, v7, -0x1b05

    div-int/2addr v2, v7

    if-eqz v2, :cond_1e

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->۟ۡۥۥۣ()I

    const-string v2, "\u06e2\u06e1\u06e1"

    :goto_b
    invoke-static {v2}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v42, v2

    goto/16 :goto_0

    :cond_1e
    const-string v2, "\u06e5\u06e4\u06e1"

    goto :goto_b

    :sswitch_27
    const/4 v2, 0x1

    iput-boolean v2, v4, Le00;->a:Z

    new-instance v5, Le00;

    invoke-direct {v5}, Le00;-><init>()V

    new-instance v6, Lg00;

    invoke-direct {v6}, Lg00;-><init>()V

    const v2, -0xff0100

    iput v2, v6, Lg00;->a:I

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۠ۥۥ۟()I

    move-result v2

    if-gtz v2, :cond_1f

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۣ۟ۡۧ۠()I

    const-string v2, "\u06e2\u06e2\u06e0"

    invoke-static {v2}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v42, v2

    goto/16 :goto_0

    :cond_1f
    sget v2, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v7, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    div-int/2addr v2, v7

    const v7, 0x1ac9e3

    add-int/2addr v2, v7

    move/from16 v42, v2

    goto/16 :goto_0

    :cond_20
    :sswitch_28
    sget v2, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v7, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    rem-int/2addr v2, v7

    const v7, 0x1ab5f3

    add-int/2addr v2, v7

    move/from16 v42, v2

    goto/16 :goto_0

    :sswitch_29
    return-void

    :sswitch_2a
    move-object/from16 v7, v34

    goto/16 :goto_a

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe2 -> :sswitch_0
        0xdc20 -> :sswitch_d
        0xdc23 -> :sswitch_1a
        0xdc42 -> :sswitch_2
        0xdc45 -> :sswitch_9
        0xdc9c -> :sswitch_17
        0x1aa727 -> :sswitch_12
        0x1aa73d -> :sswitch_13
        0x1aa746 -> :sswitch_1e
        0x1aa7bb -> :sswitch_6
        0x1aa7fc -> :sswitch_26
        0x1aa817 -> :sswitch_16
        0x1aab24 -> :sswitch_15
        0x1aab5e -> :sswitch_1
        0x1aab61 -> :sswitch_27
        0x1aaec6 -> :sswitch_28
        0x1ab247 -> :sswitch_b
        0x1ab24a -> :sswitch_14
        0x1ab2a0 -> :sswitch_23
        0x1ab2a3 -> :sswitch_4
        0x1ab2c0 -> :sswitch_29
        0x1ab302 -> :sswitch_a
        0x1ab31d -> :sswitch_7
        0x1ab649 -> :sswitch_e
        0x1ab685 -> :sswitch_5
        0x1ab6a6 -> :sswitch_1b
        0x1ab6fc -> :sswitch_3
        0x1ab9c6 -> :sswitch_12
        0x1ab9e8 -> :sswitch_c
        0x1ab9ea -> :sswitch_10
        0x1abd8c -> :sswitch_19
        0x1abdaa -> :sswitch_22
        0x1abdca -> :sswitch_1f
        0x1abe08 -> :sswitch_8
        0x1abe22 -> :sswitch_21
        0x1abe45 -> :sswitch_18
        0x1ac1ab -> :sswitch_2a
        0x1ac205 -> :sswitch_28
        0x1ac209 -> :sswitch_f
        0x1ac220 -> :sswitch_25
        0x1ac262 -> :sswitch_20
        0x1ac50b -> :sswitch_e
        0x1ac52c -> :sswitch_11
        0x1ac5a4 -> :sswitch_1d
        0x1ac963 -> :sswitch_1c
        0x1ac9c2 -> :sswitch_7
        0x1ac9e4 -> :sswitch_24
    .end sparse-switch
.end method

.method private final b(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 37

    const/4 v4, 0x0

    const/16 v19, 0x0

    const/4 v13, 0x0

    const/16 v30, 0x0

    const/16 v20, 0x0

    const/4 v15, 0x0

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/16 v34, 0x0

    const/16 v29, 0x0

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v31, 0x0

    const/16 v17, 0x0

    const/4 v9, 0x0

    const/16 v16, 0x0

    const/4 v8, 0x0

    const/4 v7, 0x0

    const/16 v24, 0x0

    const/16 v35, 0x0

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v22, 0x0

    const/16 v28, 0x0

    const/4 v2, 0x0

    const-string v25, "\u06e3\u06df\u06e1"

    invoke-static/range {v25 .. v25}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v36

    move-object/from16 v25, v2

    move-object/from16 v26, v5

    move-object/from16 v27, v7

    :goto_0
    sparse-switch v36, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v2, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v5, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    add-int/lit16 v5, v5, 0x2323

    rem-int/2addr v2, v5

    if-ltz v2, :cond_6

    invoke-static {}, Landroidx/core/content/ۥۨۤۦ;->۟۠۠۠ۥ()I

    const-string v2, "\u06df\u06e5\u06e5"

    invoke-static {v2}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto :goto_0

    :sswitch_1
    sget v2, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v5, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    div-int/lit16 v5, v5, 0x144f

    add-int/2addr v2, v5

    if-gtz v2, :cond_0

    const/16 v2, 0x23

    sput v2, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    const-string v2, "\u06e3\u06e3\u06e2"

    invoke-static {v2}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto :goto_0

    :cond_0
    sget v2, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v5, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    mul-int/2addr v2, v5

    const v5, 0x1c310d

    add-int/2addr v2, v5

    move/from16 v36, v2

    goto :goto_0

    :sswitch_2
    if-eqz v26, :cond_38

    :try_start_0
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->toString()Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v32

    sget v2, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v5, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    xor-int/lit16 v5, v5, -0x1f14

    xor-int/2addr v2, v5

    if-gtz v2, :cond_1

    const/16 v2, 0x48

    sput v2, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    const-string v2, "\u06e1\u06e0\u06e7"

    invoke-static {v2}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣ۟ۦۥۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto :goto_0

    :cond_1
    sget v2, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v5, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    rem-int/2addr v2, v5

    const v5, 0xdd0e

    add-int/2addr v2, v5

    move/from16 v36, v2

    goto :goto_0

    :sswitch_3
    :try_start_1
    const-string v2, "/rMlomkXhdLrtDW8Yw==\n"

    const-string v5, "n91B0AZ+4fw=\n"

    invoke-static {v2, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v29

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v2

    sget v5, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    if-ltz v5, :cond_2

    const-string v5, "\u06e3\u06df\u06e1"

    invoke-static {v5}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v26, v2

    move/from16 v36, v5

    goto :goto_0

    :cond_2
    sget v5, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v7, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    add-int/2addr v5, v7

    const v7, 0x1ab7f1

    xor-int/2addr v5, v7

    move-object/from16 v26, v2

    move/from16 v36, v5

    goto/16 :goto_0

    :sswitch_4
    :try_start_2
    move-object/from16 v0, p1

    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-static {}, Landroidx/fragment/app/۟ۧۡۦ;->ۧۤۨ۟()I

    move-result v4

    if-gtz v4, :cond_3

    const/16 v4, 0x24

    sput v4, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    :goto_1
    const-string v4, "\u06e4\u06e2"

    move-object v5, v4

    move-object v7, v2

    :goto_2
    invoke-static {v5}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v2

    move-object v4, v7

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_3
    sget v4, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v5, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    or-int/2addr v4, v5

    const v5, -0x1ab324

    xor-int/2addr v5, v4

    move-object v4, v2

    move/from16 v36, v5

    goto/16 :goto_0

    :sswitch_5
    const/4 v5, 0x0

    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    if-ltz v2, :cond_4

    invoke-static {}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۟ۤۥۧۤ()I

    const-string v2, "\u06e3\u06e7\u06e2"

    :goto_3
    invoke-static {v2}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    move v13, v5

    goto/16 :goto_0

    :cond_4
    sget v2, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v7, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    xor-int/2addr v2, v7

    const v7, -0x1aac3d

    xor-int/2addr v2, v7

    move/from16 v36, v2

    move v13, v5

    goto/16 :goto_0

    :sswitch_6
    const-string v11, ""

    sget v2, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v5, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    rem-int/2addr v2, v5

    const v5, 0x1abe65

    add-int/2addr v2, v5

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_7
    const/4 v2, 0x0

    :try_start_3
    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    const-string v2, "ZZugDgW/975fnbsJK7n7tA==\n"

    const-string v5, "K/TUZ2PWlN8=\n"

    invoke-static {v2, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v22

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const-string v2, "\u06df\u06e6\u06e2"

    move-object v5, v2

    move-object/from16 v23, v22

    :goto_4
    invoke-static {v5}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v22, v7

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_8
    sget v2, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v5, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    add-int/lit16 v5, v5, 0x9a

    add-int/2addr v2, v5

    if-gtz v2, :cond_5

    const-string v2, "\u06e3\u06e6"

    invoke-static {v2}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v35, v24

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_5
    const-string v2, "\u06df\u06e3\u06e1"

    invoke-static {v2}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v35, v24

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_9
    :try_start_4
    const-string v2, "sEdmDw==\n"

    const-string v5, "8AYKY3HDUao=\n"

    invoke-static {v2, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x1

    move-object/from16 v0, v21

    invoke-static {v0, v2, v5}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-result v2

    if-eqz v2, :cond_e

    sget v2, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v5, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    add-int/2addr v2, v5

    const v5, -0x1aabac

    xor-int/2addr v2, v5

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_6
    sget v2, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v5, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    mul-int/2addr v2, v5

    const v5, 0x120ebd

    add-int/2addr v2, v5

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_a
    sget v2, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v5, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    div-int/2addr v2, v5

    const v5, -0x1aa7bf

    xor-int/2addr v2, v5

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_b
    :try_start_5
    move-object/from16 v0, v34

    iget-object v2, v0, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    sget v5, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    if-gtz v5, :cond_7

    invoke-static {}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۥۧۧ()I

    const-string v5, "\u06e5\u06e6\u06e8"

    invoke-static {v5}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v27, v2

    move/from16 v36, v5

    goto/16 :goto_0

    :cond_7
    sget v5, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v7, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sub-int/2addr v5, v7

    const v7, 0x1abfc2

    add-int/2addr v5, v7

    move-object/from16 v27, v2

    move/from16 v36, v5

    goto/16 :goto_0

    :sswitch_c
    sget v2, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    if-gtz v2, :cond_8

    const/16 v2, 0xf

    sput v2, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    const-string v2, "\u06e4\u06e2\u06e0"

    :goto_5
    invoke-static {v2}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_8
    sget v2, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v5, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    add-int/2addr v2, v5

    const v5, 0x1ab942

    add-int/2addr v2, v5

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_d
    :try_start_6
    sget v2, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    xor-int/lit16 v2, v2, 0x17d

    add-int v20, v15, v2

    :cond_9
    const-string v2, "\u06e1\u06e1\u06e4"

    invoke-static {v2}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_e
    if-eqz v17, :cond_c

    :try_start_7
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->toString()Ljava/lang/String;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    move-result-object v9

    sget v2, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    if-gtz v2, :cond_b

    invoke-static {}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۢۧۥۧ()I

    :cond_a
    const-string v2, "\u06e1\u06e3\u06e4"

    invoke-static {v2}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_b
    sget v2, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v5, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    xor-int/2addr v2, v5

    const v5, 0x1abf3b

    add-int/2addr v2, v5

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_c
    :sswitch_f
    sget v2, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v5, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    add-int/2addr v2, v5

    const v5, 0x1ab3a3

    add-int/2addr v2, v5

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_10
    const-string v2, "UKb3dio=\n"

    const-string v5, "IMeFF0e3ugY=\n"

    invoke-static {v2, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p1

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "pDSLXSnjG6ykDpN2FO4Yow==\n"

    const-string v5, "z1HyAkuPdM8=\n"

    sget-object v7, Lgn;->a:Lgn;

    invoke-static {v2, v5, v7}, Lz30;->q(Ljava/lang/String;Ljava/lang/String;Lgn;)Z

    move-result v2

    if-nez v2, :cond_30

    const-string v2, "\u06e4\u06e6\u06e2"

    goto :goto_5

    :sswitch_11
    if-nez v32, :cond_1d

    sget v2, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v5, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    mul-int/2addr v2, v5

    const v5, 0x1a47ce

    add-int/2addr v2, v5

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_12
    sget v2, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v5, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    add-int/lit16 v5, v5, 0x1723

    sub-int/2addr v2, v5

    if-ltz v2, :cond_d

    invoke-static {}, Landroid/app/۟ۦۦۤۥ;->ۣۡ۠ۢ()I

    const-string v2, "\u06e4\u06e6\u06e2"

    move-object v8, v9

    move-object v5, v14

    move v7, v15

    :goto_6
    invoke-static {v2}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v2

    move-object v14, v5

    move/from16 v36, v2

    move v15, v7

    goto/16 :goto_0

    :cond_d
    const-string v2, "\u06e3\u06e7\u06e2"

    move-object v5, v2

    move-object v7, v4

    move-object v8, v9

    goto/16 :goto_2

    :cond_e
    :sswitch_13
    sget v2, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v5, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    xor-int/lit16 v5, v5, -0x1ea

    div-int/2addr v2, v5

    if-gtz v2, :cond_f

    const/16 v2, 0x17

    sput v2, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    const-string v2, "\u06e3\u06e4\u06e4"

    :goto_7
    invoke-static {v2}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_f
    const-string v2, "\u06e5\u06e5\u06e5"

    move-object/from16 v5, v17

    :goto_8
    invoke-static {v2}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v17, v5

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_14
    :try_start_8
    const-string v2, "\ud83d\udd15 \u6210\u529f\u9759\u9ed8\u62e6\u622a @\u6240\u6709\u4eba \u901a\u77e5: "

    move-object/from16 v0, v22

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    invoke-static {}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۢۨۤ۟()I

    move-result v2

    if-gtz v2, :cond_10

    invoke-static {}, Lkotlinx/coroutines/ۦۡۧۧ;->۟ۤۧۨۦ()I

    const-string v2, "\u06e5\u06e1\u06e2"

    invoke-static {v2}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_10
    const-string v2, "\u06e3\u06e2\u06e8"

    invoke-static {v2}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_11
    :sswitch_15
    sget v2, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v5, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sub-int/2addr v2, v5

    const v5, 0x1abde6

    add-int/2addr v2, v5

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_16
    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->۟۠ۡۢۦ()I

    move-result v2

    if-gtz v2, :cond_16

    const-string v2, "h8GeLYSXVYhmEOWZmU1dxE"

    invoke-static {v2}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۣۧۨۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۦۡۧۨ()I

    move-result v5

    if-ltz v5, :cond_12

    const-string v5, "\u06e8\u06df\u06e1"

    invoke-static {v5}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v25, v2

    move/from16 v36, v5

    goto/16 :goto_0

    :cond_12
    sget v5, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v7, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    or-int/2addr v5, v7

    const v7, -0x1aca60

    xor-int/2addr v5, v7

    move-object/from16 v25, v2

    move/from16 v36, v5

    goto/16 :goto_0

    :sswitch_17
    :try_start_9
    const-string v2, "eTVHCouUKhkfbV1W\n"

    const-string v5, "lonn7AIUzIU=\n"

    invoke-static {v2, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    move-object/from16 v0, v21

    invoke-static {v0, v2, v5}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    move-result v2

    if-nez v2, :cond_1c

    sget v2, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v5, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    add-int/2addr v2, v5

    const v5, -0x1abe69

    xor-int/2addr v2, v5

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_18
    sget v2, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v5, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    rem-int/lit16 v5, v5, -0x1ab7

    sub-int/2addr v2, v5

    if-gtz v2, :cond_13

    const-string v2, "\u06e5\u06e4"

    :goto_9
    invoke-static {v2}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v34, v18

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_13
    const-string v2, "\u06e5\u06e2\u06e2"

    goto :goto_9

    :sswitch_19
    invoke-static {}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->ۤۦۧۥ()I

    move-result v2

    if-ltz v2, :cond_14

    const-string v2, "\u06e1\u06e6\u06e5"

    invoke-static {v2}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_14
    sget v2, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v5, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sub-int/2addr v2, v5

    const v5, 0x1ab9f1

    add-int/2addr v2, v5

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_1a
    const-string v2, "\u06e8\u06e5\u06e8"

    invoke-static {v2}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v31, v32

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_1b
    invoke-static {}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۟ۤۥۧۤ()I

    move-result v2

    if-gtz v2, :cond_15

    const/16 v2, 0x16

    sput v2, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    const-string v2, "\u06e7\u06e2\u06e4"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v31, v33

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_15
    sget v2, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v5, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    rem-int/2addr v2, v5

    const v5, 0x1ac77f

    add-int/2addr v2, v5

    move-object/from16 v31, v33

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_1c
    :try_start_a
    move-object/from16 v0, v30

    instance-of v2, v0, Landroid/app/Notification;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    if-eqz v2, :cond_34

    sget v2, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v3, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sub-int/2addr v2, v3

    const v3, 0x1ac88d

    xor-int/2addr v2, v3

    move-object/from16 v3, v30

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_16
    :sswitch_1d
    sget v2, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    if-gtz v2, :cond_17

    const/16 v2, 0x31

    sput v2, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    const-string v2, "\u06e0\u06e8\u06e6"

    :goto_a
    invoke-static {v2}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_17
    const-string v2, "\u06e0\u06e0\u06e6"

    goto/16 :goto_7

    :sswitch_1e
    sget v2, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v5, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    div-int/2addr v2, v5

    const v5, 0x1abde7

    add-int/2addr v2, v5

    move-object/from16 v10, v35

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_1f
    const-string v2, "\u06e0\u06e7\u06e2"

    :goto_b
    invoke-static {v2}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_20
    sget v2, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v5, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    xor-int/lit16 v5, v5, 0x2498

    rem-int/2addr v2, v5

    if-ltz v2, :cond_18

    const/4 v2, 0x0

    sput v2, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    const-string v2, "\u06e5\u06e3"

    move-object/from16 v5, v16

    :goto_c
    invoke-static {v2}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v16, v5

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_18
    const-string v2, "\u06e5\u06e1\u06e2"

    move-object/from16 v5, v16

    goto :goto_c

    :sswitch_21
    :try_start_b
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    sget v2, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    if-gtz v2, :cond_19

    const-string v2, "\u06e2\u06e1\u06e3"

    invoke-static {v2}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_19
    const-string v2, "\u06e2\u06e5"

    move-object v5, v2

    move-object v7, v4

    goto/16 :goto_2

    :sswitch_22
    sget v2, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v5, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    or-int/2addr v2, v5

    const v5, 0x1ac48b

    add-int/2addr v2, v5

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_23
    if-nez v24, :cond_1a

    sget v2, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v5, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    div-int/2addr v2, v5

    const v5, -0x1abe02

    xor-int/2addr v2, v5

    move-object v10, v11

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_24
    move/from16 v0, v19

    if-ge v15, v0, :cond_37

    :try_start_c
    aget-object v30, v4, v15
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    sget v2, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v5, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    rem-int/2addr v2, v5

    const v5, 0x1aa446

    add-int/2addr v2, v5

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_25
    if-nez v34, :cond_39

    :goto_d
    const-string v2, "\u06e7\u06e2\u06e6"

    goto :goto_b

    :cond_1a
    :sswitch_26
    sget v2, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    if-ltz v2, :cond_1b

    const-string v2, "\u06e8\u06e1\u06e3"

    move-object/from16 v5, v17

    goto/16 :goto_8

    :cond_1b
    const-string v2, "\u06e2\u06e7\u06e6"

    move-object v5, v2

    :goto_e
    invoke-static {v5}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_1c
    :sswitch_27
    sget v2, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v5, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sub-int/2addr v2, v5

    const v5, 0x1ac8ca

    add-int/2addr v2, v5

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_28
    const-string v2, "\u06e5\u06e1\u06e2"

    move-object v3, v12

    move v5, v13

    goto/16 :goto_3

    :cond_1d
    :sswitch_29
    const-string v2, "\u06e7\u06df\u06e2"

    move-object/from16 v5, v16

    goto/16 :goto_c

    :cond_1e
    :sswitch_2a
    sget v2, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    if-gtz v2, :cond_1f

    const/16 v2, 0x2c

    sput v2, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    const-string v2, "\u06e6\u06e0\u06e5"

    invoke-static {v2}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_1f
    sget v2, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v5, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    rem-int/2addr v2, v5

    const v5, 0x1ac9a0

    add-int/2addr v2, v5

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_2b
    const-string v2, "\u06e4\u06e3\u06e4"

    move-object/from16 v5, v16

    goto/16 :goto_c

    :sswitch_2c
    sget v2, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    if-gtz v2, :cond_20

    const/16 v2, 0x13

    sput v2, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    const-string v2, "\u06e2\u06e2\u06e0"

    invoke-static {v2}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v34, v14

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_20
    sget v2, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v5, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    div-int/2addr v2, v5

    const v5, 0x1ab35b

    add-int/2addr v2, v5

    move-object/from16 v34, v14

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_2d
    const-string v2, "\u06e6\u06e1\u06e4"

    move-object v5, v2

    move-object v7, v4

    move-object v10, v11

    goto/16 :goto_2

    :sswitch_2e
    if-eqz v29, :cond_38

    invoke-static {}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۢۧۥۧ()I

    move-result v2

    if-ltz v2, :cond_a

    const/16 v2, 0x5b

    sput v2, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    const-string v2, "\u06e5\u06e5\u06e5"

    invoke-static {v2}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_2f
    :try_start_d
    instance-of v2, v3, Landroid/app/Notification;

    if-eqz v2, :cond_2f

    move-object v0, v3

    check-cast v0, Landroid/app/Notification;

    move-object v2, v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    invoke-static {}, Landroid/app/ۦۥۡ۠;->ۥۣۡۧ()I

    move-result v5

    if-ltz v5, :cond_21

    const-string v5, "\u06e5\u06e2\u06e2"

    move-object v7, v2

    :goto_f
    invoke-static {v5}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v18, v7

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_21
    const-string v5, "\u06e5\u06e5\u06e1"

    move-object v7, v2

    goto :goto_f

    :sswitch_30
    sget v2, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    if-ltz v2, :cond_22

    invoke-static {}, Landroidx/savedstate/ۡۤۨۡ;->ۧۨۧ۠()I

    :goto_10
    const-string v2, "\u06e2\u06e2"

    invoke-static {v2}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_22
    sget v2, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v5, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    add-int/2addr v2, v5

    const v5, 0x1aa896

    add-int/2addr v2, v5

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_31
    sget v2, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v5, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    add-int/lit16 v5, v5, 0x1cc8

    div-int/2addr v2, v5

    if-eqz v2, :cond_23

    const-string v2, "\u06e2\u06e1\u06e5"

    invoke-static {v2}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v8, v16

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_23
    move-object/from16 v8, v16

    :goto_11
    const-string v2, "\u06e8\u06e5\u06e1"

    invoke-static {v2}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_32
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    move-object/from16 v0, v25

    invoke-virtual {v2, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v2, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v5, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    rem-int/2addr v2, v5

    const v5, 0x1aaa89

    add-int/2addr v2, v5

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_33
    :try_start_e
    const-string v2, "Yvu7iw==\n"

    const-string v5, "A4nc+Ajj1jw=\n"

    invoke-static {v2, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v4}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    array-length v0, v4

    move/from16 v19, v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    sget v2, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    if-gtz v2, :cond_24

    const-string v2, "\u06df\u06df\u06e4"

    invoke-static {v2}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_24
    const-string v2, "\u06e1\u06e0\u06e7"

    move-object v5, v2

    move-object/from16 v7, v18

    goto/16 :goto_f

    :sswitch_34
    if-nez v9, :cond_1e

    invoke-static {}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->ۤۦۧۥ()I

    move-result v2

    if-ltz v2, :cond_26

    invoke-static {}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۦ۟ۥۣ()I

    :cond_25
    const-string v2, "\u06e5\u06e8\u06e5"

    invoke-static {v2}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_26
    sget v2, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v5, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    add-int/2addr v2, v5

    const v5, 0x1aaf73

    add-int/2addr v2, v5

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_35
    :try_start_f
    const-string v2, "53vj\n"

    const-string v5, "igiEy7e+YPk=\n"

    invoke-static {v2, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v28

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    sget v2, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    if-ltz v2, :cond_27

    const-string v2, "\u06e8\u06e0\u06e1"

    invoke-static {v2}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_27
    sget v2, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v5, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    rem-int/2addr v2, v5

    const v5, 0x1abb39

    add-int/2addr v2, v5

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_36
    :try_start_10
    const-string v2, "xwGO\n"

    const-string v5, "s2Dpd1+FjZU=\n"

    invoke-static {v2, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v23

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    const-string v2, "\u06e5\u06e6\u06e6"

    invoke-static {v2}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_37
    sget v2, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    if-ltz v2, :cond_28

    const/16 v2, 0x4a

    sput v2, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    goto/16 :goto_11

    :cond_28
    const-string v2, "\u06e0\u06df\u06e8"

    goto/16 :goto_a

    :sswitch_38
    if-eqz v29, :cond_c

    :try_start_11
    const-string v2, "ch5V2Uu3d8dnFUnf\n"

    const-string v5, "E3AxqyTeE+k=\n"

    invoke-static {v2, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v29

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    move-result-object v5

    invoke-static {}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۦۤۨۢ()I

    move-result v2

    if-gtz v2, :cond_29

    const/16 v2, 0x27

    sput v2, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    const-string v2, "\u06e8\u06e5\u06e8"

    invoke-static {v2}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v17, v5

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_29
    const-string v2, "\u06e4\u06e3\u06e7"

    goto/16 :goto_8

    :sswitch_39
    :try_start_12
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    invoke-static {}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟ۢۡ۠ۦ()I

    move-result v2

    if-ltz v2, :cond_2a

    const-string v2, "\u06e5\u06df"

    invoke-static {v2}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_2a
    sget v2, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v5, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    div-int/2addr v2, v5

    const v5, 0x1ab9c4

    xor-int/2addr v2, v5

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_3a
    :try_start_13
    move-object/from16 v0, v34

    iget-object v2, v0, Landroid/app/Notification;->extras:Landroid/os/Bundle;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    sget v5, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    if-ltz v5, :cond_2b

    invoke-static {}, Landroid/app/۟ۦۦۤۥ;->ۣۡ۠ۢ()I

    :cond_2b
    const-string v5, "\u06e4\u06e3\u06e4"

    invoke-static {v5}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v29, v2

    move/from16 v36, v5

    goto/16 :goto_0

    :sswitch_3b
    :try_start_14
    const-string v2, "c6ExMBsJ5l+J/Q==\n"

    const-string v5, "M0e4sP2Vb7s=\n"

    invoke-static {v2, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    move-object/from16 v0, v21

    invoke-static {v0, v2, v5}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_0

    move-result v2

    if-nez v2, :cond_1c

    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v5, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    mul-int/lit16 v5, v5, -0x1c55

    add-int/2addr v2, v5

    if-gtz v2, :cond_2c

    invoke-static {}, Lio/fastkv/ۦۣ۠ۨ;->۠ۡۨۧ()I

    goto/16 :goto_d

    :cond_2c
    const-string v2, "\u06e0\u06e4\u06e8"

    :goto_12
    invoke-static {v2}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_3c
    :try_start_15
    move-object/from16 v0, v31

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_0

    sget v2, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    if-gez v2, :cond_9

    move-object v2, v4

    goto/16 :goto_1

    :sswitch_3d
    :try_start_16
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_0

    move-result-object v2

    sget v5, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    if-gtz v5, :cond_2d

    invoke-static {}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۣ۟ۦۢ()I

    :goto_13
    const-string v5, "\u06df\u06e2\u06e8"

    move-object/from16 v7, v22

    move-object/from16 v21, v2

    goto/16 :goto_4

    :cond_2d
    const-string v5, "\u06e4\u06e1\u06e5"

    move-object/from16 v21, v2

    goto/16 :goto_e

    :sswitch_3e
    sget v2, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    if-ltz v2, :cond_2e

    const/16 v2, 0x39

    sput v2, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    const-string v2, "\u06e8\u06e3\u06e1"

    invoke-static {v2}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    move/from16 v15, v20

    goto/16 :goto_0

    :cond_2e
    move/from16 v15, v20

    goto/16 :goto_10

    :sswitch_3f
    :try_start_17
    const-string v5, ""
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_0

    const-string v2, "\u06e4\u06e0\u06e4"

    goto/16 :goto_c

    :sswitch_40
    const-string v2, "\u06e7\u06e7"

    invoke-static {v2}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣ۟ۦۥۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_2f
    :sswitch_41
    const-string v2, "\u06e4\u06e3\u06e5"

    invoke-static {v2}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_30
    :sswitch_42
    sget v2, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v5, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    div-int/lit16 v5, v5, 0xa8

    mul-int/2addr v2, v5

    if-gtz v2, :cond_31

    const/16 v2, 0x2b

    sput v2, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    const-string v2, "\u06e1\u06e3\u06e6"

    move-object v5, v2

    goto/16 :goto_e

    :cond_31
    sget v2, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v5, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    rem-int/2addr v2, v5

    const v5, 0xdae4

    add-int/2addr v2, v5

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_43
    :try_start_18
    const-string v33, ""
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_0

    sget v2, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v5, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    add-int/2addr v2, v5

    const v5, 0x1ab834

    add-int/2addr v2, v5

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_44
    sget v2, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v5, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    or-int/2addr v2, v5

    const v5, 0x1aaf23

    add-int/2addr v2, v5

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_45
    if-eqz v27, :cond_11

    :try_start_19
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->toString()Ljava/lang/String;
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_0

    move-result-object v5

    const-string v2, "\u06e2\u06df\u06e2"

    :goto_14
    invoke-static {v2}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v24, v5

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_46
    :try_start_1a
    move-object/from16 v0, v22

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_0

    move-result-object v2

    sget v5, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v7, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    xor-int/2addr v5, v7

    const v7, 0xde92

    xor-int/2addr v5, v7

    move-object/from16 v28, v2

    move/from16 v36, v5

    goto/16 :goto_0

    :catchall_0
    move-exception v2

    const-string v2, "Nwje\n"

    const-string v3, "Q2m5jaPP2Zc=\n"

    const-string v4, "Neg71qYJaEEP7iDRiA9kSw==\n"

    const-string v5, "e4dPv8BgCyA=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "Fg==\n"

    const-string v6, "c8HJlSTQVfc=\n"

    invoke-static {v2, v3, v4, v5, v6}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :sswitch_47
    return-void

    :sswitch_48
    sget v2, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v5, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    add-int/lit16 v5, v5, 0x10d3

    or-int/2addr v2, v5

    if-ltz v2, :cond_32

    const/16 v2, 0x16

    sput v2, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    const-string v2, "\u06e4\u06e3\u06e7"

    invoke-static {v2}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_32
    sget v2, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v5, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    rem-int/2addr v2, v5

    const v5, -0x1abb2c

    xor-int/2addr v2, v5

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_49
    :try_start_1b
    const-string v2, " | "

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_0

    sget v2, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v5, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    xor-int/lit16 v5, v5, -0x15ba

    xor-int/2addr v2, v5

    if-ltz v2, :cond_33

    invoke-static {}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟ۤۦۡ()I

    const-string v2, "\u06df\u06e4\u06e2"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_33
    move-object/from16 v2, v21

    goto/16 :goto_13

    :cond_34
    :sswitch_4a
    sget v2, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sget v5, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    or-int/lit16 v5, v5, -0x11f2

    mul-int/2addr v2, v5

    if-ltz v2, :cond_35

    const/16 v2, 0x35

    sput v2, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    const-string v2, "\u06e1\u06e2\u06e2"

    goto/16 :goto_12

    :cond_35
    sget v2, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v5, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sub-int/2addr v2, v5

    const v5, -0x1ac557

    xor-int/2addr v2, v5

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_4b
    :try_start_1c
    const-string v2, " | "

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_0

    invoke-static {}, Landroid/app/۟ۦۦۤۥ;->ۣۡ۠ۢ()I

    move-result v2

    if-ltz v2, :cond_25

    invoke-static {}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟ۧۢ۟ۧ()I

    const-string v2, "\u06e8\u06df\u06e7"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_4c
    const/4 v5, 0x0

    sget v2, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    if-ltz v2, :cond_36

    invoke-static {}, Landroid/app/ۦۥۡ۠;->ۥۣۡۧ()I

    const-string v2, "\u06e0\u06e4\u06e8"

    invoke-static {v2}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v2

    move-object v14, v5

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_36
    const-string v2, "\u06df\u06e5\u06e5"

    move v7, v15

    goto/16 :goto_6

    :cond_37
    :sswitch_4d
    const-string v2, "\u06e5\u06e7\u06e1"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_38
    :sswitch_4e
    const-string v2, "\u06e5\u06e0\u06e7"

    invoke-static {v2}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_39
    :sswitch_4f
    sget v2, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v5, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    add-int/lit16 v5, v5, 0x1da2

    sub-int/2addr v2, v5

    if-ltz v2, :cond_3a

    invoke-static {}, Lcom/google/android/material/carousel/۠ۨۡۢ;->ۦۧۢ۟()I

    const-string v2, "\u06e7\u06e0\u06e4"

    move-object/from16 v5, v24

    goto/16 :goto_14

    :cond_3a
    sget v2, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v5, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    or-int/2addr v2, v5

    const v5, 0xdf01    # 7.9999E-41f

    xor-int/2addr v2, v5

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_50
    const/4 v12, 0x0

    sget v2, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sget v5, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    mul-int/2addr v2, v5

    const v5, 0x17b320

    add-int/2addr v2, v5

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_51
    const-string v2, "\u06e7\u06e7\u06e6"

    move-object v5, v14

    move v7, v13

    goto/16 :goto_6

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc40 -> :sswitch_0
        0xdc42 -> :sswitch_15
        0xdc43 -> :sswitch_3c
        0xdc63 -> :sswitch_36
        0xdc7e -> :sswitch_4b
        0xdc9a -> :sswitch_44
        0xdc9f -> :sswitch_19
        0xdcc2 -> :sswitch_4
        0xdcda -> :sswitch_1a
        0xdce0 -> :sswitch_13
        0xdcfe -> :sswitch_3a
        0x1aa704 -> :sswitch_f
        0x1aa760 -> :sswitch_13
        0x1aa765 -> :sswitch_3d
        0x1aa77d -> :sswitch_1e
        0x1aa79d -> :sswitch_1c
        0x1aa7be -> :sswitch_27
        0x1aa7bf -> :sswitch_2c
        0x1aa7db -> :sswitch_14
        0x1aaac6 -> :sswitch_13
        0x1aaac9 -> :sswitch_15
        0x1aaae5 -> :sswitch_a
        0x1aaae6 -> :sswitch_47
        0x1aab64 -> :sswitch_17
        0x1aabbb -> :sswitch_1
        0x1aaea8 -> :sswitch_5
        0x1aaec4 -> :sswitch_3e
        0x1aaedf -> :sswitch_51
        0x1aaee4 -> :sswitch_4a
        0x1aaf02 -> :sswitch_3
        0x1aaf3f -> :sswitch_3f
        0x1aaf9c -> :sswitch_22
        0x1ab245 -> :sswitch_23
        0x1ab246 -> :sswitch_28
        0x1ab284 -> :sswitch_4e
        0x1ab286 -> :sswitch_26
        0x1ab2a0 -> :sswitch_22
        0x1ab2e3 -> :sswitch_c
        0x1ab323 -> :sswitch_33
        0x1ab341 -> :sswitch_8
        0x1ab35c -> :sswitch_25
        0x1ab605 -> :sswitch_10
        0x1ab669 -> :sswitch_46
        0x1ab6c0 -> :sswitch_1b
        0x1ab6c5 -> :sswitch_2
        0x1ab6fe -> :sswitch_34
        0x1ab704 -> :sswitch_29
        0x1ab71f -> :sswitch_2b
        0x1ab9c7 -> :sswitch_49
        0x1ab9cb -> :sswitch_42
        0x1ab9e8 -> :sswitch_31
        0x1aba06 -> :sswitch_9
        0x1aba08 -> :sswitch_3b
        0x1aba45 -> :sswitch_6
        0x1aba46 -> :sswitch_4c
        0x1aba47 -> :sswitch_16
        0x1aba48 -> :sswitch_e
        0x1aba85 -> :sswitch_20
        0x1abaa0 -> :sswitch_30
        0x1abdac -> :sswitch_43
        0x1abdc6 -> :sswitch_2f
        0x1abdc8 -> :sswitch_2e
        0x1abde5 -> :sswitch_1f
        0x1abde6 -> :sswitch_21
        0x1abe01 -> :sswitch_37
        0x1abe41 -> :sswitch_18
        0x1abe45 -> :sswitch_47
        0x1abe48 -> :sswitch_2d
        0x1abe65 -> :sswitch_35
        0x1abe67 -> :sswitch_4f
        0x1abe7f -> :sswitch_50
        0x1abe86 -> :sswitch_4d
        0x1abea2 -> :sswitch_39
        0x1ac149 -> :sswitch_41
        0x1ac16d -> :sswitch_12
        0x1ac189 -> :sswitch_45
        0x1ac1c7 -> :sswitch_20
        0x1ac222 -> :sswitch_1
        0x1ac50a -> :sswitch_38
        0x1ac569 -> :sswitch_27
        0x1ac56b -> :sswitch_40
        0x1ac56d -> :sswitch_d
        0x1ac606 -> :sswitch_24
        0x1ac8ca -> :sswitch_7
        0x1ac8d0 -> :sswitch_48
        0x1ac8e9 -> :sswitch_2a
        0x1ac946 -> :sswitch_1d
        0x1ac96b -> :sswitch_32
        0x1ac984 -> :sswitch_b
        0x1ac98b -> :sswitch_11
    .end sparse-switch
.end method

.method private final c(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 14

    const/4 v0, 0x0

    const/4 v2, 0x0

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v4, 0x0

    const/4 v3, 0x0

    const/4 v7, 0x0

    const-string v10, "\u06e7\u06df\u06e5"

    invoke-static {v10}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v12

    move-object v10, v0

    move-object v11, v2

    :goto_0
    sparse-switch v12, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v10, v5}, Lgn;->b(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v6

    sget v0, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v2, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    div-int/2addr v0, v2

    const v2, 0x1ac186

    xor-int/2addr v0, v2

    move v12, v0

    goto :goto_0

    :sswitch_1
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v3, v0, v2

    sget v0, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    rem-int/lit16 v2, v2, -0x677

    or-int/2addr v0, v2

    if-ltz v0, :cond_10

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->۟ۡۥۥۣ()I

    const-string v0, "\u06e8\u06e0"

    invoke-static {v0}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۣ۠ۧۢ(Ljava/lang/Object;)I

    move-result v0

    move v12, v0

    goto :goto_0

    :sswitch_2
    sget v0, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    if-ltz v0, :cond_0

    const/16 v0, 0x13

    sput v0, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    const-string v0, "\u06e6\u06e3\u06e7"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v0

    move-object v7, v6

    move v12, v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e6\u06e3\u06e7"

    move-object v2, v6

    :goto_1
    invoke-static {v0}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v0

    move-object v7, v2

    move v12, v0

    goto :goto_0

    :sswitch_3
    sget v0, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    if-ltz v0, :cond_1

    invoke-static {}, Landroid/app/۟ۦۦۤۥ;->ۣۡ۠ۢ()I

    const-string v0, "\u06e7\u06e8\u06e7"

    move-object v3, v4

    :goto_2
    invoke-static {v0}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v0

    move v12, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e1\u06e7\u06e6"

    move-object v3, v4

    :goto_3
    invoke-static {v0}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move v12, v0

    goto :goto_0

    :sswitch_4
    invoke-static {}, Landroidx/lifecycle/۟۟ۡۨ;->ۦۣ۟ۦ()I

    move-result v0

    if-gtz v0, :cond_2

    invoke-static {}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۠۠ۧ۟()I

    const-string v0, "\u06e4\u06e8\u06e3"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v0

    move v12, v0

    goto :goto_0

    :cond_2
    sget v0, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v2, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    rem-int/2addr v0, v2

    const v2, 0xd939

    add-int/2addr v0, v2

    move v12, v0

    goto/16 :goto_0

    :sswitch_5
    invoke-static {}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۦ۟ۥۣ()I

    move-result v0

    if-gtz v0, :cond_3

    const/16 v0, 0x5e

    sput v0, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    const-string v0, "\u06e7\u06e1"

    goto :goto_3

    :cond_3
    sget v0, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v2, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    div-int/2addr v0, v2

    const v2, 0x1aaf80

    add-int/2addr v0, v2

    move v12, v0

    goto/16 :goto_0

    :sswitch_6
    const-string v0, "bKpB27X0yOViu2fyo/k=\n"

    const-string v2, "B884hMKVpIk=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "oP6u5vYqD2ug\n"

    const-string v10, "mceX388TIVI=\n"

    invoke-static {v2, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget v10, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v11, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    or-int/2addr v10, v11

    const v11, -0x1aae0a

    xor-int v12, v10, v11

    move-object v10, v0

    move-object v11, v2

    goto/16 :goto_0

    :sswitch_7
    sget v0, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v2, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    div-int/lit16 v2, v2, 0x18bb

    xor-int/2addr v0, v2

    if-gtz v0, :cond_4

    const/16 v0, 0x1c

    sput v0, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    const-string v0, "\u06e0\u06e1\u06e0"

    invoke-static {v0}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v0

    move v12, v0

    goto/16 :goto_0

    :cond_4
    sget v0, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v2, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    mul-int/2addr v0, v2

    const v2, 0x73517

    add-int/2addr v0, v2

    move v12, v0

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    sget v0, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v2, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    add-int/lit16 v2, v2, 0x257f

    mul-int/2addr v0, v2

    if-gtz v0, :cond_5

    invoke-static {}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣۣۢۢ()I

    const-string v0, "\u06e8\u06e0\u06e2"

    invoke-static {v0}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v0

    move-object v7, v11

    move v12, v0

    goto/16 :goto_0

    :cond_5
    sget v0, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v2, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    mul-int/2addr v0, v2

    const v2, 0x18fe06

    add-int/2addr v0, v2

    move-object v7, v11

    move v12, v0

    goto/16 :goto_0

    :sswitch_8
    :try_start_1
    sget-object v0, Lgn;->a:Lgn;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const-string v0, "\u06e3\u06e2\u06df"

    invoke-static {v0}, L۠ۡۢۨ;->۟ۡۧۡۥ(Ljava/lang/Object;)I

    move-result v0

    move v12, v0

    goto/16 :goto_0

    :cond_6
    :sswitch_9
    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟ۥۧۦۥ()I

    move-result v0

    if-gtz v0, :cond_7

    const/16 v0, 0x63

    sput v0, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    const-string v0, "\u06e8\u06df\u06e8"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v12, v0

    goto/16 :goto_0

    :cond_7
    sget v0, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v2, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    div-int/2addr v0, v2

    const v2, 0x1aa6ff

    add-int/2addr v0, v2

    move v12, v0

    goto/16 :goto_0

    :cond_8
    :sswitch_a
    sget v0, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v2, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sub-int/2addr v0, v2

    const v2, -0x1ac358

    xor-int/2addr v0, v2

    move v12, v0

    goto/16 :goto_0

    :sswitch_b
    const-string v0, "6g==\n"

    const-string v2, "mkXc09L/9uw=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "01/5CExSJnbdTt84VQ==\n"

    const-string v2, "uDqAVzszSho=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lgt;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    sget v0, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v2, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    xor-int/lit16 v2, v2, -0x1415

    rem-int/2addr v0, v2

    if-gtz v0, :cond_9

    const/16 v0, 0x60

    sput v0, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    const-string v0, "\u06e0\u06e3\u06e8"

    move-object v2, v7

    goto/16 :goto_1

    :cond_9
    const-string v0, "\u06e4\u06e8\u06e3"

    :goto_4
    invoke-static {v0}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v0

    move v12, v0

    goto/16 :goto_0

    :catchall_1
    move-exception v0

    :try_start_2
    sget-object v2, Lgn;->a:Lgn;

    invoke-static {v11}, Lb50;->R(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result v5

    sget v0, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v1, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    or-int/lit16 v1, v1, 0x1225

    div-int/2addr v0, v1

    if-eqz v0, :cond_a

    const/16 v0, 0x2c

    sput v0, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    const-string v0, "\u06e3\u06e0\u06e6"

    invoke-static {v0}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v0

    move-object v1, v2

    move v12, v0

    goto/16 :goto_0

    :cond_a
    const-string v0, "\u06e8\u06e0\u06e2"

    move-object v1, v2

    goto/16 :goto_2

    :sswitch_c
    sget v0, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v2, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    xor-int/2addr v0, v2

    const v2, 0x1ac77e

    add-int/2addr v0, v2

    move v12, v0

    goto/16 :goto_0

    :sswitch_d
    const-string v0, "\u06df\u06e2"

    move v5, v9

    :goto_5
    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move v12, v0

    goto/16 :goto_0

    :sswitch_e
    sget v0, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    if-gtz v0, :cond_b

    const/16 v0, 0x5a

    sput v0, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    const-string v0, "\u06e4\u06e5\u06e7"

    invoke-static {v0}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v0

    move-object v3, v8

    move v12, v0

    goto/16 :goto_0

    :cond_b
    const-string v0, "\u06e3\u06e0\u06e6"

    move-object v3, v8

    goto :goto_5

    :sswitch_f
    sget v0, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v2, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    xor-int/lit16 v2, v2, -0x621

    mul-int/2addr v0, v2

    if-ltz v0, :cond_c

    invoke-static {}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۟ۦ۠ۡۢ()I

    const-string v0, "\u06e4\u06e6\u06e2"

    goto :goto_5

    :cond_c
    sget v0, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v2, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    mul-int/2addr v0, v2

    const v2, 0x2140ec

    add-int/2addr v0, v2

    move v12, v0

    goto/16 :goto_0

    :sswitch_10
    const-string v0, "3f5Z\n"

    const-string v2, "tpsgeLwwj7M=\n"

    const-string v12, "lNdk\n"

    const-string v13, "8LICxVL6724=\n"

    invoke-static {v0, v2, v10, v12, v13}, Lz30;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v11}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v2, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    or-int/lit16 v2, v2, 0x1ed4

    rem-int/2addr v0, v2

    if-gtz v0, :cond_d

    invoke-static {}, Landroidx/appcompat/app/ۥۦۣ۠;->ۨۤ۠ۨ()I

    const-string v0, "\u06e6\u06e8\u06e2"

    invoke-static {v0}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v0

    move v12, v0

    goto/16 :goto_0

    :cond_d
    sget v0, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v2, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    xor-int/2addr v0, v2

    const v2, -0x1abc6e

    xor-int/2addr v0, v2

    move v12, v0

    goto/16 :goto_0

    :sswitch_11
    sget v0, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v2, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    or-int/lit16 v2, v2, -0x1294

    mul-int/2addr v0, v2

    if-gtz v0, :cond_e

    const/16 v0, 0x63

    sput v0, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    const-string v0, "\u06e5\u06e4\u06e1"

    goto/16 :goto_4

    :cond_e
    sget v0, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v2, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    mul-int/2addr v0, v2

    const v2, 0x24ec76

    add-int/2addr v0, v2

    move v12, v0

    goto/16 :goto_0

    :sswitch_12
    sget v0, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v2, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    rem-int/2addr v0, v2

    const v2, 0x1ac37a

    add-int/2addr v0, v2

    move v12, v0

    goto/16 :goto_0

    :sswitch_13
    sget v0, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v2, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    add-int/lit16 v2, v2, 0x26e9

    or-int/2addr v0, v2

    if-gtz v0, :cond_f

    const/16 v0, 0x56

    sput v0, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    const-string v0, "\u06e6\u06e2\u06e8"

    invoke-static {v0}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v0

    move-object v4, v7

    move v12, v0

    goto/16 :goto_0

    :cond_f
    sget v0, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v2, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    or-int/2addr v0, v2

    const v2, -0x1ab3bd

    xor-int/2addr v0, v2

    move-object v4, v7

    move v12, v0

    goto/16 :goto_0

    :sswitch_14
    const/4 v9, 0x0

    sget v0, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v2, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    or-int/lit16 v2, v2, 0x1a3

    rem-int/2addr v0, v2

    if-gtz v0, :cond_11

    :cond_10
    const-string v0, "\u06df\u06df\u06e0"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v0

    move v12, v0

    goto/16 :goto_0

    :cond_11
    const-string v0, "\u06e7\u06e8\u06e7"

    goto/16 :goto_4

    :sswitch_15
    :try_start_3
    invoke-static {v10, v11}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-result-object v8

    sget v0, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v2, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    or-int/lit16 v2, v2, 0x161e

    rem-int/2addr v0, v2

    if-ltz v0, :cond_12

    const-string v0, "\u06e6\u06e1\u06e1"

    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v0

    move v12, v0

    goto/16 :goto_0

    :cond_12
    sget v0, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v2, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    add-int/2addr v0, v2

    const v2, 0x1ac377

    add-int/2addr v0, v2

    move v12, v0

    goto/16 :goto_0

    :sswitch_16
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe3 -> :sswitch_0
        0xdc63 -> :sswitch_5
        0xdcf8 -> :sswitch_12
        0x1aa700 -> :sswitch_16
        0x1aa726 -> :sswitch_12
        0x1aa7fb -> :sswitch_f
        0x1aab45 -> :sswitch_c
        0x1aaea1 -> :sswitch_10
        0x1aaec4 -> :sswitch_11
        0x1aaf80 -> :sswitch_1
        0x1ab2a4 -> :sswitch_3
        0x1ab629 -> :sswitch_4
        0x1ab660 -> :sswitch_15
        0x1aba86 -> :sswitch_a
        0x1abadf -> :sswitch_6
        0x1abe21 -> :sswitch_8
        0x1ac186 -> :sswitch_2
        0x1ac1ac -> :sswitch_14
        0x1ac1ca -> :sswitch_13
        0x1ac260 -> :sswitch_7
        0x1ac50d -> :sswitch_b
        0x1ac5ca -> :sswitch_e
        0x1ac626 -> :sswitch_d
        0x1ac8ea -> :sswitch_7
        0x1ac8f0 -> :sswitch_9
        0x1ac927 -> :sswitch_5
    .end sparse-switch
.end method

.method private final d(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 48

    const/16 v29, 0x0

    const/16 v35, 0x0

    const/16 v34, 0x0

    const/16 v25, 0x0

    const/16 v28, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v24, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v32, 0x0

    const/16 v31, 0x0

    const/16 v23, 0x0

    const/16 v20, 0x0

    const/4 v4, 0x0

    const/4 v11, 0x0

    const/4 v9, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v30, 0x0

    const/4 v3, 0x0

    const/16 v36, 0x0

    const/16 v47, 0x0

    const/16 v41, 0x0

    const/16 v37, 0x0

    const/16 v33, 0x0

    const/16 v22, 0x0

    const/16 v21, 0x0

    const/16 v19, 0x0

    const/16 v38, 0x0

    const-string v42, "\u06e7\u06e0\u06e0"

    invoke-static/range {v42 .. v42}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v46

    move-object/from16 v42, v3

    move-object/from16 v43, v15

    move-object/from16 v44, v18

    move-object/from16 v45, v19

    :goto_0
    sparse-switch v46, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v3, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    if-gtz v3, :cond_3a

    const/16 v3, 0xf

    sput v3, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    const-string v3, "\u06e7\u06e0\u06e0"

    invoke-static {v3}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto :goto_0

    :sswitch_1
    const/4 v15, 0x1

    sget v3, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v18, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    move/from16 v0, v18

    rem-int/lit16 v0, v0, -0xb64

    move/from16 v18, v0

    or-int v3, v3, v18

    if-gtz v3, :cond_0

    invoke-static {}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۡۦۣۨ()I

    const-string v3, "\u06e8\u06e3\u06e3"

    invoke-static {v3}, L۠ۡۢۨ;->۟ۡۧۡۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v24, v15

    move/from16 v46, v3

    goto :goto_0

    :cond_0
    const-string v3, "\u06e3\u06e6\u06df"

    :goto_1
    invoke-static {v3}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v24, v15

    move/from16 v46, v3

    goto :goto_0

    :cond_1
    :sswitch_2
    const-string v3, "\u06e3\u06e2\u06e8"

    :goto_2
    invoke-static {v3}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto :goto_0

    :sswitch_3
    sget v3, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v15, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    div-int/2addr v3, v15

    const v15, 0x1aabbb

    add-int/2addr v3, v15

    move/from16 v46, v3

    goto :goto_0

    :sswitch_4
    sget-object v3, Lpb0;->F0:Ljava/util/List;

    move-object/from16 v0, v27

    invoke-interface {v3, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3b

    sget v3, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sget v15, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    add-int/lit16 v15, v15, -0x229e

    add-int/2addr v3, v15

    if-ltz v3, :cond_2

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۣ۟ۡۧ۠()I

    const-string v3, "\u06e4\u06e0\u06e1"

    invoke-static {v3}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto :goto_0

    :cond_2
    move-object/from16 v3, v37

    :goto_3
    const-string v15, "\u06e6\u06e3\u06e3"

    invoke-static {v15}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v15

    move-object/from16 v37, v3

    move/from16 v46, v15

    goto :goto_0

    :sswitch_5
    const-string v3, "\u06e1\u06df\u06e2"

    move/from16 v12, v24

    :goto_4
    invoke-static {v3}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_6
    if-nez v34, :cond_47

    invoke-static {}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۦۤۨۢ()I

    move-result v3

    if-gtz v3, :cond_3

    const/16 v3, 0x55

    sput v3, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    const-string v3, "\u06e0\u06e3\u06e6"

    invoke-static {v3}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_3
    sget v3, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v15, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sub-int/2addr v3, v15

    const v15, 0x1ac2dd

    add-int/2addr v3, v15

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_7
    :try_start_0
    const-string v3, "P3Z04A==\n"

    const-string v15, "bTk7tG1etwk=\n"

    invoke-static {v3, v15}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v44

    invoke-static {v3, v0}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {v43 .. v44}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    move-result-object v8

    sget v3, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v15, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    rem-int/lit16 v15, v15, -0x1887

    rem-int/2addr v3, v15

    if-ltz v3, :cond_4

    const/16 v3, 0x3e

    sput v3, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    const-string v3, "\u06e2\u06e1\u06e2"

    :goto_5
    invoke-static {v3}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u06e7\u06e3\u06df"

    :goto_6
    invoke-static {v3}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣ۟ۦۥۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_8
    sget v3, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v15, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    or-int/lit16 v15, v15, -0xbe4

    mul-int/2addr v3, v15

    if-ltz v3, :cond_5

    const-string v3, "\u06e7\u06e5\u06e7"

    invoke-static {v3}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v33, v37

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06e2\u06e6\u06e0"

    invoke-static {v3}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v33, v37

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_9
    sget v3, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    if-gtz v3, :cond_6

    invoke-static {}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۣۣۡ۟()I

    const-string v3, "\u06e3\u06e6\u06df"

    invoke-static {v3}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v27, v26

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06e3\u06e7\u06e4"

    move-object v15, v3

    move-object/from16 v18, v25

    move-object/from16 v19, v26

    :goto_7
    invoke-static {v15}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v25, v18

    move-object/from16 v27, v19

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_7
    :sswitch_a
    sget v3, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v15, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    mul-int/2addr v3, v15

    const v15, 0x1bb9b2

    add-int/2addr v3, v15

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_b
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v15, 0x1f

    if-lt v3, v15, :cond_15

    sget v3, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    if-ltz v3, :cond_9

    invoke-static {}, Landroidx/appcompat/widget/۟ۢۨۦ;->۟ۦۡ۟۠()I

    :cond_8
    const-string v3, "\u06e0\u06e2"

    invoke-static {v3}, Landroidx/appcompat/widget/۟ۢۨۦ;->۠ۢۤۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06e1\u06e2\u06e3"

    :goto_8
    invoke-static {v3}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_c
    sget v3, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v15, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    div-int/lit16 v15, v15, -0x147f

    add-int/2addr v3, v15

    if-ltz v3, :cond_a

    const-string v3, "\u06e8\u06e7\u06df"

    goto/16 :goto_6

    :cond_a
    sget v3, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v15, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    or-int/2addr v3, v15

    const v15, 0x1ac94a

    add-int/2addr v3, v15

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_d
    const-string v3, "3f5Z\n"

    const-string v15, "tpsgeLwwj7M=\n"

    const-string v18, "lNdk\n"

    const-string v19, "8LICxVL6724=\n"

    move-object/from16 v0, v39

    move-object/from16 v1, v18

    move-object/from16 v2, v19

    invoke-static {v3, v15, v0, v1, v2}, Lz30;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v40

    invoke-static {v3, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    sget v3, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v15, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    add-int/2addr v3, v15

    const v15, 0x1ac744

    add-int/2addr v3, v15

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_e
    const/4 v11, 0x0

    sget v3, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    if-ltz v3, :cond_b

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟ۢۡ۟۟()I

    move-object v3, v10

    :goto_9
    const-string v10, "\u06e4\u06df\u06e4"

    invoke-static {v10}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v15

    move-object v10, v3

    move/from16 v46, v15

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06e1\u06df\u06e6"

    move/from16 v15, v24

    goto/16 :goto_1

    :cond_c
    :sswitch_f
    sget v3, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v15, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    mul-int/2addr v3, v15

    const v15, 0x1b7165

    xor-int/2addr v3, v15

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_10
    if-eqz v7, :cond_7

    if-eqz v9, :cond_7

    const-string v3, "UPuob8DRuoFa/ahvw9eqm14=\n"

    const-string v15, "O57RMLCj0/c=\n"

    invoke-static {v3, v15}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v15, 0x0

    invoke-static {v3, v15}, Lgt;->j(Ljava/lang/String;I)I

    move-result v3

    const/4 v15, 0x1

    if-ne v3, v15, :cond_5b

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v15, 0x1f

    if-lt v3, v15, :cond_5b

    const/high16 v3, 0x3f800000    # 1.0f

    const-string v15, "/T0B0AiYcuL3OwHQGoZu5skxFvsdhGj94iE=\n"

    const-string v18, "llh4j3jqG5Q=\n"

    move-object/from16 v0, v18

    invoke-static {v15, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    const/16 v18, 0x64

    move/from16 v0, v18

    invoke-static {v15, v0}, Lgt;->j(Ljava/lang/String;I)I

    move-result v15

    int-to-float v15, v15

    const/high16 v18, 0x42c80000    # 100.0f

    div-float v15, v15, v18

    const/high16 v18, 0x41200000    # 10.0f

    mul-float v15, v15, v18

    invoke-static {v3, v15}, Ljava/lang/Math;->max(FF)F

    move-result v3

    sget-object v15, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-static {v3, v3}, Lp7;->e(FF)Landroid/graphics/RenderEffect;

    move-result-object v3

    move-object/from16 v0, v34

    invoke-static {v0, v3}, Lp7;->r(Landroid/widget/TextView;Landroid/graphics/RenderEffect;)V

    sget v3, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v15, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    div-int/lit16 v15, v15, 0x17a3

    xor-int/2addr v3, v15

    if-gtz v3, :cond_1a

    const-string v3, "\u06e4\u06e1\u06e3"

    invoke-static {v3}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_11
    const/4 v15, 0x0

    const-string v3, "\u06df\u06e0\u06e6"

    :goto_a
    invoke-static {v3}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    move/from16 v36, v15

    goto/16 :goto_0

    :sswitch_12
    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۢۨۨۤ()I

    move-result v3

    if-ltz v3, :cond_d

    const/16 v3, 0x4b

    sput v3, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    const-string v3, "\u06e8\u06e3\u06e4"

    :goto_b
    invoke-static {v3}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_d
    sget v3, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v15, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    rem-int/2addr v3, v15

    const v15, 0x1aafad

    add-int/2addr v3, v15

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_13
    sget v3, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v15, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    xor-int/2addr v3, v15

    const v15, 0x1ab5a9

    add-int/2addr v3, v15

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_14
    const-string v3, "HyvL6pIk51gROu3DhCk=\n"

    const-string v15, "dE6yteVFizQ=\n"

    invoke-static {v3, v15}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v15, "XfuKs1HNPxxd\n"

    const-string v18, "ZMKzimj0ESU=\n"

    move-object/from16 v0, v18

    invoke-static {v15, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    sget v15, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v19, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    move/from16 v0, v19

    add-int/lit16 v0, v0, 0x226

    move/from16 v19, v0

    xor-int v15, v15, v19

    if-gtz v15, :cond_e

    invoke-static {}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۦۡۧۨ()I

    const-string v15, "\u06e3\u06e6\u06e8"

    invoke-static {v15}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v15

    move-object/from16 v39, v3

    move-object/from16 v40, v18

    move/from16 v46, v15

    goto/16 :goto_0

    :cond_e
    const-string v15, "\u06e8\u06e0\u06e3"

    :goto_c
    invoke-static {v15}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v15

    move-object/from16 v39, v3

    move-object/from16 v40, v18

    move/from16 v46, v15

    goto/16 :goto_0

    :sswitch_15
    sget-object v15, Ldy;->g:Li00;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v18, "\u00a5"

    move-object/from16 v0, v18

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, v33

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v18, "input"

    move-object/from16 v0, v18

    invoke-static {v0, v5}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v18, "replacement"

    move-object/from16 v0, v18

    invoke-static {v0, v3}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v18, "\u06e3\u06e2\u06e7"

    :goto_d
    invoke-static/range {v18 .. v18}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v18

    move-object/from16 v21, v3

    move-object/from16 v22, v15

    move/from16 v46, v18

    goto/16 :goto_0

    :sswitch_16
    invoke-static/range {v34 .. v34}, Lp7;->q(Landroid/widget/TextView;)V

    sget v3, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    if-gtz v3, :cond_f

    const-string v3, "\u06e4\u06e2\u06e3"

    invoke-static {v3}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_f
    const-string v3, "\u06e2\u06e0\u06e8"

    goto/16 :goto_4

    :sswitch_17
    sget v3, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    if-gtz v3, :cond_10

    const-string v3, "\u06df\u06df\u06e0"

    :goto_e
    invoke-static {v3}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_10
    sget v3, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v15, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    or-int/2addr v3, v15

    const v15, 0x1aa816

    add-int/2addr v3, v15

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_18
    sget v3, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v9, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    or-int/lit16 v9, v9, 0x3c8

    or-int/2addr v3, v9

    if-ltz v3, :cond_11

    const-string v3, "\u06df\u06e1\u06e5"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v3

    move v9, v11

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_11
    const-string v3, "\u06e7\u06e5\u06e7"

    move v9, v11

    :goto_f
    invoke-static {v3}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :catchall_0
    move-exception v3

    const-string v27, ""

    sget v3, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v15, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    rem-int/lit16 v15, v15, -0x8a9

    xor-int/2addr v3, v15

    if-gtz v3, :cond_12

    invoke-static {}, Landroid/app/۟ۦۦۤۥ;->ۣۡ۠ۢ()I

    const-string v3, "\u06e7\u06e1\u06e6"

    invoke-static {v3}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_12
    sget v3, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v15, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    mul-int/2addr v3, v15

    const v15, -0x1b274c

    xor-int/2addr v3, v15

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_19
    invoke-virtual/range {v34 .. v34}, Landroid/view/View;->getId()I

    move-result v3

    const-string v16, ""

    ushr-int/lit8 v3, v3, 0x18

    const/16 v15, 0x7f

    if-ne v3, v15, :cond_4d

    sget-object v3, Ldy;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual/range {v34 .. v34}, Landroid/view/View;->getId()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v18

    sget v13, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v14, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    or-int/lit16 v14, v14, -0x1b7d

    rem-int/2addr v13, v14

    if-gtz v13, :cond_13

    invoke-static {}, Landroidx/activity/ۣ۟۠ۤۢ;->۟۠۠ۤۥ()I

    const-string v13, "\u06e7\u06e6\u06e1"

    move-object v14, v4

    move-object v15, v13

    move-object/from16 v17, v18

    move-object/from16 v19, v18

    :goto_10
    invoke-static {v15}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v15

    move-object v13, v3

    move-object/from16 v4, v19

    move/from16 v46, v15

    goto/16 :goto_0

    :cond_13
    const-string v15, "\u06e7\u06e6\u06e1"

    move-object v13, v3

    move-object v14, v4

    move-object/from16 v17, v18

    move-object/from16 v19, v18

    :goto_11
    invoke-static {v15}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۣ۠ۧۢ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v4, v19

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_1a
    if-nez v17, :cond_1

    const-string v3, "\u06e6\u06e0\u06e2"

    :goto_12
    invoke-static {v3}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۣ۠ۧۢ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_1b
    const/16 v31, 0x1

    sget v3, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v15, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    mul-int/2addr v3, v15

    const v15, 0x1ea38c

    add-int/2addr v3, v15

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_1c
    move-object v3, v5

    :cond_14
    sget v5, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v15, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    mul-int/2addr v5, v15

    const v15, 0x1c8504

    add-int/2addr v15, v5

    move-object v5, v3

    move/from16 v46, v15

    goto/16 :goto_0

    :cond_15
    :sswitch_1d
    invoke-static {}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۦۡۦۢ()I

    move-result v3

    if-ltz v3, :cond_16

    const/16 v3, 0x41

    sput v3, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    const-string v18, "\u06e5\u06e2"

    move-object/from16 v3, v21

    move-object/from16 v15, v22

    goto/16 :goto_d

    :cond_16
    sget v3, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v15, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    xor-int/2addr v3, v15

    const v15, -0x1ab2d4

    xor-int/2addr v3, v15

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_1e
    invoke-static {}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣۣۢۢ()I

    move-result v3

    if-gtz v3, :cond_17

    const/16 v3, 0x10

    sput v3, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    const-string v3, "\u06e0\u06df\u06df"

    invoke-static {v3}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_17
    const-string v3, "\u06e5\u06e1\u06e3"

    move-object v15, v3

    move-object/from16 v18, v25

    move-object/from16 v19, v27

    goto/16 :goto_7

    :sswitch_1f
    sget v3, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    if-gtz v3, :cond_18

    const/16 v3, 0x43

    sput v3, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    const-string v3, "\u06e3\u06e2\u06e2"

    :goto_13
    invoke-static {v3}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_18
    const-string v3, "\u06e2\u06e6\u06e0"

    goto/16 :goto_6

    :sswitch_20
    const-string v3, "\u06e7\u06e7\u06e3"

    invoke-static {v3}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v28, v25

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_19
    :sswitch_21
    sget v3, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v15, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    xor-int/2addr v3, v15

    const v15, 0x1ab915

    add-int/2addr v3, v15

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_22
    invoke-virtual/range {v34 .. v34}, Landroid/view/View;->getId()I

    move-result v3

    const/4 v15, -0x1

    if-ne v3, v15, :cond_4a

    sget v3, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v15, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    xor-int/lit16 v15, v15, 0x2284

    div-int/2addr v3, v15

    if-eqz v3, :cond_1b

    invoke-static {}, Landroidx/startup/ۣۤۦۥ;->۠ۨ۟()I

    :cond_1a
    const-string v3, "\u06e0\u06df"

    invoke-static {v3}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_1b
    sget v3, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v15, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    xor-int/2addr v3, v15

    const v15, 0x1acbe4

    add-int/2addr v3, v15

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_23
    const/4 v12, 0x0

    const-string v3, "\u06df\u06e1\u06e3"

    goto/16 :goto_e

    :sswitch_24
    :try_start_1
    invoke-virtual/range {v42 .. v42}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v0, v39

    move/from16 v1, v47

    invoke-static {v0, v1}, Lgn;->b(Ljava/lang/String;I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v41

    sget v3, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v15, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    add-int/lit16 v15, v15, 0x244a

    xor-int/2addr v3, v15

    if-ltz v3, :cond_1c

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->۟ۢۦۡۦ()I

    const-string v3, "\u06e6\u06e0\u06e2"

    invoke-static {v3}, Landroidx/appcompat/widget/۟ۢۨۦ;->۠ۢۤۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_1c
    const-string v3, "\u06e6\u06e4\u06e5"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_1d
    :sswitch_25
    sget v3, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v15, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    xor-int/lit16 v15, v15, -0x1b98

    rem-int/2addr v3, v15

    if-gtz v3, :cond_1e

    invoke-static {}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۢۧۥۧ()I

    const-string v3, "\u06e0\u06e8\u06e3"

    :goto_14
    invoke-static {v3}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_1e
    const-string v3, "\u06e1\u06df\u06e0"

    :goto_15
    invoke-static {v3}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_26
    sget v3, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    if-gtz v3, :cond_1f

    const-string v3, "\u06e4\u06e0\u06e4"

    invoke-static {v3}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_1f
    sget v3, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v15, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    xor-int/2addr v3, v15

    const v15, 0x1ababf

    add-int/2addr v3, v15

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_27
    move-object/from16 v38, v41

    :goto_16
    const-string v3, "\u06e7\u06e8\u06e4"

    goto/16 :goto_f

    :sswitch_28
    :try_start_2
    invoke-static/range {v39 .. v40}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-result-object v3

    sget v15, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v18, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    move/from16 v0, v18

    add-int/lit16 v0, v0, 0x23a8

    move/from16 v18, v0

    or-int v15, v15, v18

    if-ltz v15, :cond_20

    invoke-static {}, Landroidx/startup/ۣۤۦۥ;->۠ۨ۟()I

    const-string v15, "\u06e8\u06e4\u06e7"

    invoke-static {v15}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v15

    move-object/from16 v30, v3

    move/from16 v46, v15

    goto/16 :goto_0

    :cond_20
    move/from16 v15, v31

    :goto_17
    const-string v18, "\u06e7\u06e7\u06e7"

    invoke-static/range {v18 .. v18}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v18

    move-object/from16 v30, v3

    move/from16 v31, v15

    move/from16 v46, v18

    goto/16 :goto_0

    :sswitch_29
    invoke-static {}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟ۢۡ۠ۦ()I

    move-result v3

    if-ltz v3, :cond_21

    const/16 v3, 0x1d

    sput v3, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    const-string v3, "\u06e4\u06e1\u06e2"

    :goto_18
    invoke-static {v3}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_21
    sget v3, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v15, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    rem-int/2addr v3, v15

    const v15, 0x1ac584

    xor-int/2addr v3, v15

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_2a
    const/16 v32, 0x0

    sget v3, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    if-gtz v3, :cond_22

    invoke-static {}, Landroid/app/۟ۦۦۤۥ;->ۣۡ۠ۢ()I

    const-string v3, "\u06e2\u06e0"

    invoke-static {v3}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_22
    sget v3, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v15, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    or-int/2addr v3, v15

    const v15, 0x1acc09

    add-int/2addr v3, v15

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_2b
    sget v3, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v15, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    xor-int/2addr v3, v15

    const v15, 0x1ab731

    add-int/2addr v3, v15

    move/from16 v46, v3

    move/from16 v47, v36

    goto/16 :goto_0

    :sswitch_2c
    move-object v3, v5

    :cond_23
    sget v5, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    if-ltz v5, :cond_24

    invoke-static {}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۢۨۤ۟()I

    const-string v5, "\u06e1\u06e5\u06e2"

    move-object v15, v5

    :goto_19
    invoke-static {v15}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v15

    move-object v5, v3

    move/from16 v46, v15

    goto/16 :goto_0

    :cond_24
    sget v5, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v15, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    xor-int/2addr v5, v15

    const v15, 0x1aa32a

    add-int/2addr v15, v5

    move-object v5, v3

    move/from16 v46, v15

    goto/16 :goto_0

    :sswitch_2d
    move-object/from16 v0, v22

    iget-object v3, v0, Li00;->b:Ljava/lang/Object;

    check-cast v3, Ljava/util/regex/Pattern;

    invoke-virtual {v3, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    move-object/from16 v0, v21

    invoke-virtual {v3, v0}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v15, "replaceAll(...)"

    invoke-static {v15, v3}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v3, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_33

    move-object/from16 v0, p1

    iget-object v15, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/16 v18, 0x0

    aput-object v3, v15, v18

    invoke-static {}, Landroidx/emoji2/text/ۣۣ۟۟۠;->ۢۡۢۦ()I

    move-result v3

    if-gtz v3, :cond_25

    const/16 v3, 0x53

    sput v3, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    const-string v3, "\u06df\u06e4\u06e7"

    invoke-static {v3}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_25
    const-string v3, "\u06e1\u06e6\u06e0"

    goto/16 :goto_5

    :sswitch_2e
    const-string v3, "1g==\n"

    const-string v15, "pvqdpgJ9Q7I=\n"

    invoke-static {v3, v15}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, p1

    invoke-static {v3, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v0, p1

    iget-object v3, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    instance-of v15, v3, Landroid/widget/TextView;

    const/16 v29, 0x0

    if-eqz v15, :cond_60

    check-cast v3, Landroid/widget/TextView;

    sget v15, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v18, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    move/from16 v0, v18

    or-int/lit16 v0, v0, 0x2090

    move/from16 v18, v0

    sub-int v15, v15, v18

    if-gtz v15, :cond_26

    const-string v15, "\u06e7\u06e8"

    invoke-static {v15}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v15

    move-object/from16 v34, v3

    move/from16 v46, v15

    goto/16 :goto_0

    :cond_26
    sget v15, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v18, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    mul-int v15, v15, v18

    const v18, 0x1ab48a

    xor-int v15, v15, v18

    move-object/from16 v34, v3

    move/from16 v46, v15

    goto/16 :goto_0

    :sswitch_2f
    sget v3, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v15, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    mul-int/lit16 v15, v15, -0x4b4

    xor-int/2addr v3, v15

    if-gtz v3, :cond_27

    const-string v3, "\u06e8\u06e6\u06e8"

    move-object/from16 v20, v23

    move/from16 v15, v24

    goto/16 :goto_1

    :cond_27
    sget v3, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v15, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    xor-int/2addr v3, v15

    const v15, 0x1ac1df

    add-int/2addr v3, v15

    move-object/from16 v20, v23

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_30
    invoke-virtual/range {v27 .. v27}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_3b

    sget-object v3, Lpb0;->G0:Ljava/util/List;

    move-object/from16 v0, v27

    invoke-interface {v3, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_58

    const-string v3, "\u06e2\u06e4\u06e3"

    :goto_1a
    invoke-static {v3}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_31
    invoke-static/range {v34 .. v34}, Lp7;->q(Landroid/widget/TextView;)V

    sget v3, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v15, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    add-int/lit16 v15, v15, 0x20f3

    or-int/2addr v3, v15

    if-ltz v3, :cond_28

    const-string v3, "\u06e8\u06e2\u06e7"

    invoke-static {v3}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_28
    const-string v3, "\u06e1\u06df\u06e0"

    goto/16 :goto_6

    :sswitch_32
    sget v3, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    if-gtz v3, :cond_29

    invoke-static {}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۡۢۡۥ()I

    const-string v3, "\u06e8\u06e0\u06e6"

    invoke-static {v3}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_29
    const-string v3, "\u06e6\u06df\u06e7"

    goto/16 :goto_b

    :sswitch_33
    move-object/from16 v0, p1

    iget-object v3, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v15, 0x0

    aget-object v3, v3, v15

    instance-of v15, v3, Ljava/lang/CharSequence;

    if-eqz v15, :cond_42

    check-cast v3, Ljava/lang/CharSequence;

    sget v15, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v18, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    move/from16 v0, v18

    or-int/lit16 v0, v0, -0x12ae

    move/from16 v18, v0

    add-int v15, v15, v18

    if-ltz v15, :cond_2a

    invoke-static {}, Landroidx/profileinstaller/ۣ۠ۨۢ;->۟ۤۥ۟۟()I

    const-string v15, "\u06e2\u06e0\u06e7"

    move-object/from16 v18, v3

    move-object/from16 v19, v27

    move-object/from16 v28, v29

    goto/16 :goto_7

    :cond_2a
    sget v15, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v18, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    div-int v15, v15, v18

    const v18, 0x1ac906

    xor-int v15, v15, v18

    move-object/from16 v25, v3

    move-object/from16 v28, v29

    move/from16 v46, v15

    goto/16 :goto_0

    :sswitch_34
    sget v3, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v15, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    add-int/lit16 v15, v15, -0x18f9

    rem-int/2addr v3, v15

    if-ltz v3, :cond_2b

    invoke-static {}, Landroidx/legacy/content/۠ۥۣۥ;->۟۠ۧ۟۟()I

    move-object/from16 v3, v30

    move/from16 v15, v32

    goto/16 :goto_17

    :cond_2b
    sget v3, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v15, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    mul-int/2addr v3, v15

    const v15, 0x298db

    add-int/2addr v3, v15

    move/from16 v31, v32

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_35
    sget v3, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    if-gtz v3, :cond_2c

    const-string v3, "\u06e3\u06e7\u06e5"

    invoke-static {v3}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_2c
    sget v3, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v15, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    xor-int/2addr v3, v15

    const v15, 0x1ab1a1

    add-int/2addr v3, v15

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_36
    if-nez v7, :cond_4f

    if-nez v12, :cond_4f

    sget v3, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    if-gtz v3, :cond_2d

    const-string v3, "\u06e0\u06e2\u06e0"

    invoke-static {v3}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_2d
    sget v3, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v15, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    or-int/2addr v3, v15

    const v15, -0x1aa5fe

    xor-int/2addr v3, v15

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_37
    sget v3, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    if-ltz v3, :cond_2e

    const/16 v3, 0x3d

    sput v3, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    const-string v3, "\u06e0\u06e4\u06e3"

    goto/16 :goto_12

    :cond_2e
    const-string v15, "\u06e2\u06e6\u06e6"

    move-object v3, v5

    goto/16 :goto_19

    :sswitch_38
    sget v3, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    if-ltz v3, :cond_2f

    const/16 v3, 0xb

    sput v3, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    const-string v3, "\u06e8\u06df\u06e8"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_2f
    const-string v3, "\u06e7\u06e7\u06e7"

    goto/16 :goto_14

    :sswitch_39
    :try_start_3
    sget-object v3, Lgn;->a:Lgn;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    invoke-static {}, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۢۧ()I

    move-result v3

    if-ltz v3, :cond_30

    const-string v3, "\u06e4\u06e8\u06e0"

    invoke-static {v3}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_30
    const-string v3, "\u06e4\u06e8\u06e4"

    invoke-static {v3}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_3a
    :try_start_4
    invoke-static/range {v34 .. v34}, Lgn;->c(Landroid/widget/TextView;)Ljava/lang/String;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-result-object v26

    sget v3, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    if-gtz v3, :cond_31

    invoke-static {}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۢۧۥۧ()I

    const-string v3, "\u06e2\u06e0\u06e8"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_31
    sget v3, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v15, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    or-int/2addr v3, v15

    const v15, -0x1aa6fb

    xor-int/2addr v3, v15

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_32
    :sswitch_3b
    sget v3, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v15, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    xor-int/2addr v3, v15

    const v15, 0xdf6c

    add-int/2addr v3, v15

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_3c
    sget v3, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v15, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    add-int/2addr v3, v15

    const v15, 0x1aa642

    add-int/2addr v3, v15

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_33
    :sswitch_3d
    sget v3, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v15, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    mul-int/lit16 v15, v15, 0x553

    div-int/2addr v3, v15

    if-eqz v3, :cond_34

    const-string v3, "\u06e2\u06e2\u06e6"

    invoke-static {v3}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_34
    const-string v3, "\u06e3\u06e1\u06e3"

    goto/16 :goto_e

    :sswitch_3e
    sget v3, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v15, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    xor-int/2addr v3, v15

    const v15, 0x1ab75e

    add-int/2addr v3, v15

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_3f
    sget v3, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v15, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sub-int/2addr v3, v15

    const v15, -0x1abbc1

    xor-int/2addr v3, v15

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_35
    :sswitch_40
    sget v3, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v15, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    div-int/2addr v3, v15

    const v15, 0x1aab06

    xor-int/2addr v3, v15

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_41
    const/16 v35, 0x0

    sget v3, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v15, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    add-int/lit16 v15, v15, 0xc88

    or-int/2addr v3, v15

    if-ltz v3, :cond_36

    const-string v3, "\u06e1\u06df\u06e0"

    invoke-static {v3}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_36
    sget v3, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v15, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sub-int/2addr v3, v15

    const v15, 0x1ab891

    xor-int/2addr v3, v15

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_42
    sget v3, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    if-ltz v3, :cond_37

    invoke-static {}, Landroidx/emoji2/text/ۣۣ۟۟۠;->ۢۡۢۦ()I

    move-object/from16 v3, v33

    :goto_1b
    const-string v15, "\u06e5\u06e6\u06df"

    invoke-static {v15}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v15

    move-object/from16 v33, v3

    move/from16 v46, v15

    goto/16 :goto_0

    :cond_37
    const-string v3, "\u06e5\u06e5\u06df"

    move-object v15, v3

    move-object/from16 v18, v25

    move-object/from16 v19, v27

    goto/16 :goto_7

    :sswitch_43
    const-string v4, "\u06e3\u06e2\u06e8"

    move-object v3, v13

    move-object v15, v4

    move-object/from16 v19, v20

    goto/16 :goto_10

    :sswitch_44
    move-object/from16 v0, p1

    iget-object v3, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v15, 0x0

    const-string v18, "5SvV9QWwdbCPX8ufca4fxJE1\n"

    const-string v19, "B71dF5M4lyY=\n"

    invoke-static/range {v18 .. v19}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    aput-object v18, v3, v15

    sget v3, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v15, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    xor-int/lit16 v15, v15, -0xb7e

    sub-int/2addr v3, v15

    if-ltz v3, :cond_38

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->۟ۡۥۥۣ()I

    move-object/from16 v3, v34

    :goto_1c
    const-string v15, "\u06e1\u06e5\u06e6"

    invoke-static {v15}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v15

    move-object/from16 v34, v3

    move/from16 v46, v15

    goto/16 :goto_0

    :cond_38
    const-string v3, "\u06e6\u06e7\u06e3"

    invoke-static {v3}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_45
    sget v3, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v15, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    add-int/lit16 v15, v15, 0x2194

    rem-int/2addr v3, v15

    if-gtz v3, :cond_39

    const/16 v3, 0xb

    sput v3, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    const-string v3, "\u06e5\u06df\u06e4"

    invoke-static {v3}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_39
    sget v3, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v15, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    rem-int/2addr v3, v15

    const v15, 0x1ac1f2

    add-int/2addr v3, v15

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_3a
    const-string v3, "\u06e1\u06e0\u06e3"

    goto/16 :goto_13

    :cond_3b
    :sswitch_46
    const-string v3, "\u06e1\u06e3\u06df"

    goto/16 :goto_2

    :sswitch_47
    :try_start_5
    sget-object v3, Lgn;->a:Lgn;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Lgn;->e:Ljava/lang/String;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    sget v15, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v18, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    move/from16 v0, v18

    mul-int/lit16 v0, v0, -0xed9

    move/from16 v18, v0

    div-int v15, v15, v18

    if-eqz v15, :cond_3c

    invoke-static {}, Landroidx/emoji2/text/ۣۣ۟۟۠;->ۢۡۢۦ()I

    const-string v15, "\u06e1\u06e2\u06e5"

    invoke-static {v15}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v15

    move-object/from16 v43, v3

    move/from16 v46, v15

    goto/16 :goto_0

    :cond_3c
    sget v15, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v18, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    or-int v15, v15, v18

    const v18, 0x1abab1

    add-int v15, v15, v18

    move-object/from16 v43, v3

    move/from16 v46, v15

    goto/16 :goto_0

    :sswitch_48
    sget v3, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v15, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    rem-int/lit16 v15, v15, 0xcf4

    div-int/2addr v3, v15

    if-eqz v3, :cond_3d

    const-string v3, "\u06e6\u06e4\u06e4"

    invoke-static {v3}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_3d
    sget v3, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v15, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    or-int/2addr v3, v15

    const v15, 0x1ac21a

    xor-int/2addr v3, v15

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_49
    invoke-static {}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۠ۥۥ۟()I

    move-result v3

    if-gtz v3, :cond_3e

    const/16 v3, 0x34

    sput v3, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    const-string v3, "\u06e0\u06e0\u06e4"

    goto/16 :goto_1a

    :cond_3e
    const-string v3, "\u06e1\u06df\u06e2"

    move-object v15, v3

    move-object/from16 v19, v4

    goto/16 :goto_11

    :catchall_1
    move-exception v3

    sget v3, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v15, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    mul-int/lit16 v15, v15, -0x24f7

    xor-int/2addr v3, v15

    if-gtz v3, :cond_3f

    const/16 v3, 0x2c

    sput v3, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    const-string v3, "\u06e1\u06df\u06e6"

    invoke-static {v3}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v38, v40

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_3f
    sget v3, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v15, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    mul-int/2addr v3, v15

    const v15, 0x18014f

    add-int/2addr v3, v15

    move-object/from16 v38, v40

    move/from16 v46, v3

    goto/16 :goto_0

    :catchall_2
    move-exception v3

    :try_start_6
    sget-object v3, Lgn;->a:Lgn;

    invoke-static/range {v40 .. v40}, Lb50;->R(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v15

    if-eqz v15, :cond_c

    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    move-result v18

    sget v15, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v19, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    rem-int v15, v15, v19

    const v19, 0x1abe2b

    xor-int v15, v15, v19

    move-object/from16 v42, v3

    move/from16 v46, v15

    move/from16 v47, v18

    goto/16 :goto_0

    :sswitch_4a
    if-nez v7, :cond_1d

    if-eqz v9, :cond_1d

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v15, 0x1f

    if-lt v3, v15, :cond_1d

    invoke-static {}, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۢ۠ۨ۟()I

    move-result v3

    if-ltz v3, :cond_44

    const-string v3, "\u06e7\u06e7\u06e2"

    invoke-static {v3}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_4b
    sget v3, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v15, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    div-int/lit16 v15, v15, 0x51c

    add-int/2addr v3, v15

    if-ltz v3, :cond_40

    const-string v3, "\u06df\u06e3\u06e1"

    invoke-static {v3}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_40
    sget v3, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v15, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    rem-int/2addr v3, v15

    const v15, 0x1aca57

    add-int/2addr v3, v15

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_4c
    sget v3, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v15, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    mul-int/lit16 v15, v15, -0xfaa

    div-int/2addr v3, v15

    if-eqz v3, :cond_41

    const-string v3, "\u06e3\u06df"

    invoke-static {v3}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_41
    const-string v3, "\u06e6\u06e0\u06e2"

    move-object v15, v3

    move-object/from16 v19, v4

    goto/16 :goto_11

    :cond_42
    move-object/from16 v28, v29

    :sswitch_4d
    sget v3, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    if-ltz v3, :cond_43

    const/16 v3, 0x1a

    sput v3, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    const-string v3, "\u06e3\u06e0\u06e0"

    move/from16 v15, v36

    goto/16 :goto_a

    :cond_43
    sget v3, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v15, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    mul-int/2addr v3, v15

    const v15, -0x1a7662

    xor-int/2addr v3, v15

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_4e
    :try_start_7
    sget-object v3, Lgn;->a:Lgn;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->۟ۢۦۡۦ()I

    move-result v3

    if-ltz v3, :cond_45

    const/16 v3, 0x58

    sput v3, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    :cond_44
    const-string v3, "\u06df\u06e1\u06e2"

    invoke-static {v3}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_45
    const-string v3, "\u06e6\u06e8\u06e1"

    move/from16 v15, v24

    goto/16 :goto_1

    :sswitch_4f
    move-object v3, v8

    goto/16 :goto_9

    :sswitch_50
    sget v3, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    if-gtz v3, :cond_46

    const/16 v3, 0x2f

    sput v3, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    const-string v3, "\u06e2\u06e4\u06e3"

    invoke-static {v3}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_46
    const-string v15, "\u06df\u06e7\u06e4"

    move-object v3, v13

    move-object/from16 v19, v4

    goto/16 :goto_10

    :cond_47
    :sswitch_51
    sget v3, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v15, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    or-int/lit16 v15, v15, -0xd55

    add-int/2addr v3, v15

    if-ltz v3, :cond_48

    const/16 v3, 0x1c

    sput v3, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    const-string v3, "\u06e5\u06e5"

    goto/16 :goto_4

    :cond_48
    sget v3, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v15, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    xor-int/2addr v3, v15

    const v15, 0x1ac77f

    add-int/2addr v3, v15

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_52
    sget v3, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v15, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    div-int/lit16 v15, v15, -0xeee

    xor-int/2addr v3, v15

    if-gtz v3, :cond_49

    const/16 v3, 0x5a

    sput v3, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    const-string v3, "\u06e8\u06df\u06e7"

    invoke-static {v3}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v45, v10

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_49
    sget v3, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v15, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    or-int/2addr v3, v15

    const v15, -0x1ac5bb

    xor-int/2addr v3, v15

    move-object/from16 v45, v10

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_4a
    :sswitch_53
    sget v3, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v15, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    div-int/lit16 v15, v15, -0x21e8

    xor-int/2addr v3, v15

    if-ltz v3, :cond_4b

    const-string v3, "\u06df\u06e0\u06df"

    move-object v15, v3

    move-object/from16 v19, v4

    goto/16 :goto_11

    :cond_4b
    sget v3, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sget v15, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    xor-int/2addr v3, v15

    const v15, 0x1aa7e9

    add-int/2addr v3, v15

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_54
    sget v3, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v15, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    add-int/lit16 v15, v15, -0xe8

    xor-int/2addr v3, v15

    if-gtz v3, :cond_4c

    move-object/from16 v3, v38

    goto/16 :goto_3

    :cond_4c
    sget v3, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v15, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    or-int/2addr v3, v15

    const v15, 0x1abf46

    add-int/2addr v3, v15

    move-object/from16 v37, v38

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_4d
    :sswitch_55
    sget v3, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    if-ltz v3, :cond_4e

    const-string v3, "\u06e7\u06e5\u06e5"

    goto/16 :goto_15

    :cond_4e
    const-string v3, "\u06df\u06e6\u06e1"

    :goto_1d
    invoke-static {v3}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_56
    sget v3, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v15, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sub-int/2addr v3, v15

    const v15, 0x1aab01

    xor-int/2addr v3, v15

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_4f
    :sswitch_57
    sget v3, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v15, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sub-int/2addr v3, v15

    const v15, 0x1abd7b

    add-int/2addr v3, v15

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_58
    sget v3, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sget v15, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    add-int/lit16 v15, v15, 0x199a

    mul-int/2addr v3, v15

    if-gtz v3, :cond_50

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۦۥ()I

    const-string v3, "\u06e1\u06e7\u06e7"

    invoke-static {v3}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_50
    sget v3, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v15, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    add-int/2addr v3, v15

    const v15, 0x1ac851

    add-int/2addr v3, v15

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_59
    move-object/from16 v3, v35

    goto/16 :goto_1c

    :cond_51
    :sswitch_5a
    invoke-static {}, Landroid/app/۟ۦۦۤۥ;->ۣۡ۠ۢ()I

    move-result v3

    if-ltz v3, :cond_52

    const-string v3, "\u06df\u06e0\u06e1"

    goto/16 :goto_2

    :cond_52
    sget v3, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v15, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sub-int/2addr v3, v15

    const v15, 0x1ab38b

    add-int/2addr v3, v15

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_5b
    sget v3, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v15, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    rem-int/2addr v3, v15

    const v15, 0x1aab4a

    add-int/2addr v3, v15

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_5c
    sget v3, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v15, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    div-int/2addr v3, v15

    const v15, 0x1ac527

    xor-int/2addr v3, v15

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_5d
    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟ۥۧۦۥ()I

    move-result v3

    if-gtz v3, :cond_53

    const/16 v3, 0x2a

    sput v3, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    const-string v3, "\u06e4\u06e0\u06e0"

    invoke-static {v3}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_53
    sget v3, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v15, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    rem-int/2addr v3, v15

    const v15, 0x1ac5db

    add-int/2addr v3, v15

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_5e
    sget v3, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v15, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    add-int/lit16 v15, v15, -0x2a7

    rem-int/2addr v3, v15

    if-gtz v3, :cond_54

    const/16 v3, 0x33

    sput v3, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    const-string v3, "\u06df\u06e7\u06e1"

    invoke-static {v3}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_54
    const-string v3, "\u06e8\u06e5\u06e2"

    move/from16 v15, v24

    goto/16 :goto_1

    :sswitch_5f
    :try_start_8
    const-string v3, "ffcJ/jSqzXRo6yC5beGRHg==\n"

    const-string v15, "CZhFkUPPvzc=\n"

    invoke-static {v3, v15}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v8}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    const-string v3, "\u06df\u06e7\u06e1"

    goto/16 :goto_18

    :sswitch_60
    if-nez v28, :cond_5d

    sget v3, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v15, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    add-int/lit16 v15, v15, 0x13ce

    or-int/2addr v3, v15

    if-gtz v3, :cond_56

    const/4 v3, 0x6

    sput v3, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    :cond_55
    const-string v15, "\u06e1\u06e2\u06e6"

    move-object/from16 v3, v39

    move-object/from16 v18, v40

    goto/16 :goto_c

    :cond_56
    const-string v3, "\u06e8\u06e0\u06e6"

    goto/16 :goto_4

    :sswitch_61
    move-object/from16 v0, v34

    instance-of v3, v0, Landroid/widget/EditText;

    if-eqz v3, :cond_19

    sget v3, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    if-ltz v3, :cond_57

    invoke-static {}, Landroidx/savedstate/۠ۡۢ۠;->ۣ۟ۨۤۨ()I

    const-string v3, "\u06e6\u06e3\u06e2"

    invoke-static {v3}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_57
    sget v3, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v15, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    div-int/2addr v3, v15

    const v15, 0x1aaf82

    xor-int/2addr v3, v15

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_58
    :sswitch_62
    sget v3, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v15, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sub-int/2addr v3, v15

    const v15, 0x1ac558

    add-int/2addr v3, v15

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_63
    invoke-static/range {v31 .. v31}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v19

    move-object/from16 v0, v19

    invoke-virtual {v13, v14, v0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v23

    if-nez v23, :cond_62

    sget v3, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v4, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    xor-int/lit16 v4, v4, -0x20e9

    mul-int/2addr v3, v4

    if-gtz v3, :cond_59

    const/16 v3, 0xe

    sput v3, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    const-string v3, "\u06e1\u06e6\u06e0"

    invoke-static {v3}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v4, v19

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_59
    sget v3, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v4, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    div-int/2addr v3, v4

    const v4, 0x1ac602

    add-int/2addr v3, v4

    move-object/from16 v4, v19

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_64
    sget v3, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    if-gtz v3, :cond_5a

    invoke-static {}, Landroidx/core/widget/ۣۤۨۢ;->ۥۢۡۥ()I

    const-string v3, "\u06e5\u06e7\u06e2"

    invoke-static {v3}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_5a
    const-string v3, "\u06e4\u06e7"

    goto/16 :goto_8

    :sswitch_65
    if-eqz v6, :cond_33

    if-eqz v12, :cond_33

    const-string v3, "1H+BO3K/Drs=\n"

    const-string v15, "txfgTwbWYNw=\n"

    invoke-static {v3, v15}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v15, 0x0

    move-object/from16 v0, v45

    invoke-static {v0, v3, v15}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-nez v3, :cond_33

    const-string v3, "0Y4dJHIVIUTAjg==\n"

    const-string v15, "o+twTQZhQCo=\n"

    invoke-static {v3, v15}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v15, 0x0

    move-object/from16 v0, v45

    invoke-static {v0, v3, v15}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-eqz v3, :cond_32

    invoke-virtual/range {v34 .. v34}, Landroid/widget/TextView;->getTextSize()F

    move-result v3

    const/high16 v15, 0x42a00000    # 80.0f

    cmpl-float v3, v3, v15

    if-lez v3, :cond_32

    invoke-static {}, Landroidx/versionedparcelable/ۣۢۥ;->ۦۦۡۤ()I

    move-result v3

    if-gtz v3, :cond_8

    const/16 v3, 0x5b

    sput v3, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    const-string v3, "\u06e7\u06e3\u06df"

    invoke-static {v3}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_5b
    :sswitch_66
    sget v3, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sget v15, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    or-int/lit16 v15, v15, -0x3ab

    div-int/2addr v3, v15

    if-gtz v3, :cond_5c

    const-string v3, "\u06e6\u06df\u06df"

    invoke-static {v3}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_5c
    const-string v3, "\u06e6\u06df\u06e5"

    goto/16 :goto_e

    :sswitch_67
    sget v3, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v15, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    or-int/2addr v3, v15

    const v15, 0xdac3

    add-int/2addr v3, v15

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_68
    if-nez v6, :cond_35

    if-nez v7, :cond_35

    sget v3, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v15, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    add-int/lit16 v15, v15, 0x247f

    xor-int/2addr v3, v15

    if-ltz v3, :cond_55

    const/16 v3, 0x19

    sput v3, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    goto/16 :goto_16

    :cond_5d
    :sswitch_69
    invoke-static {}, L۟ۡۦۧۤ;->۟۟۠ۡۢ()I

    move-result v3

    if-ltz v3, :cond_5e

    const-string v3, "\u06e4\u06e4\u06e1"

    invoke-static {v3}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_5e
    const-string v3, "\u06e0\u06e2\u06e0"

    goto/16 :goto_4

    :sswitch_6a
    move-object v3, v4

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    sget v3, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    if-gtz v3, :cond_5f

    invoke-static {}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣۣۢۢ()I

    const-string v3, "\u06e3\u06e2\u06e8"

    invoke-static {v3}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_5f
    const-string v3, "\u06e2\u06e1\u06e1"

    goto/16 :goto_6

    :cond_60
    :sswitch_6b
    sget v3, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v15, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    mul-int/lit16 v15, v15, 0x6bd

    mul-int/2addr v3, v15

    if-ltz v3, :cond_61

    const-string v3, "\u06e2\u06e5"

    goto/16 :goto_8

    :cond_61
    const-string v3, "\u06e1\u06e2\u06e5"

    goto/16 :goto_8

    :sswitch_6c
    :try_start_9
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    sget v15, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v18, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    rem-int v15, v15, v18

    const v18, 0x1ab961

    add-int v15, v15, v18

    move-object/from16 v44, v3

    move/from16 v46, v15

    goto/16 :goto_0

    :cond_62
    :sswitch_6d
    invoke-static {}, Landroidx/savedstate/ۢۨۧۤ;->ۨ۠ۨۡ()I

    move-result v3

    if-ltz v3, :cond_63

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->۟۠ۡۢۦ()I

    const-string v3, "\u06e0\u06e7\u06e0"

    goto/16 :goto_1d

    :cond_63
    const-string v3, "\u06e7\u06df\u06df"

    goto/16 :goto_1d

    :sswitch_6e
    invoke-interface/range {v28 .. v28}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_51

    sget v3, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v15, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    rem-int/lit16 v15, v15, 0xae7

    div-int/2addr v3, v15

    if-gtz v3, :cond_64

    invoke-static {}, Landroid/view/ۢۥۢۦ;->ۤۦۢ۟()I

    const-string v3, "\u06e3\u06e8\u06df"

    invoke-static {v3}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_64
    const-string v3, "\u06e8\u06e3\u06e5"

    goto/16 :goto_13

    :sswitch_6f
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v5, "XhX+bQVs8iFQBNhdHA==\n"

    const-string v6, "NXCHMnINnk0=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lgt;->i(Ljava/lang/String;)Z

    move-result v6

    const-string v5, "gZZ9Pz5mismLkH0/I3WQ1A==\n"

    const-string v7, "6vMEYE4U478=\n"

    invoke-static {v5, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lgt;->i(Ljava/lang/String;)Z

    move-result v7

    if-eqz v6, :cond_14

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    const/16 v15, 0x32

    if-ge v5, v15, :cond_14

    const-string v5, "ZGk=\n"

    const-string v15, "pszDuzXTJqo=\n"

    invoke-static {v5, v15}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v15, 0x0

    invoke-static {v3, v5, v15}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v5

    if-nez v5, :cond_23

    const-string v5, "nOHy\n"

    const-string v15, "c15Xx7RzxpQ=\n"

    invoke-static {v5, v15}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v15, 0x0

    invoke-static {v3, v5, v15}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v5

    if-eqz v5, :cond_14

    sget v5, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v15, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    div-int/2addr v5, v15

    const v15, 0x1ac56a

    add-int/2addr v15, v5

    move-object v5, v3

    move/from16 v46, v15

    goto/16 :goto_0

    :catchall_3
    move-exception v3

    sget v3, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v15, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    xor-int/2addr v3, v15

    const v15, 0x1abeb3

    add-int/2addr v3, v15

    move-object/from16 v45, v16

    move/from16 v46, v3

    goto/16 :goto_0

    :sswitch_70
    sget v3, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    if-ltz v3, :cond_65

    const/16 v3, 0x4e

    sput v3, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    const-string v3, "\u06e2\u06e6\u06e6"

    invoke-static {v3}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v33, v30

    move/from16 v46, v3

    goto/16 :goto_0

    :cond_65
    move-object/from16 v3, v30

    goto/16 :goto_1b

    :sswitch_71
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdbff -> :sswitch_0
        0xdc02 -> :sswitch_13
        0xdc3e -> :sswitch_14
        0xdc83 -> :sswitch_63
        0xdca1 -> :sswitch_2c
        0xdcbe -> :sswitch_66
        0xdce1 -> :sswitch_5a
        0xdcfc -> :sswitch_6d
        0x1aa704 -> :sswitch_1
        0x1aa725 -> :sswitch_2b
        0x1aa740 -> :sswitch_31
        0x1aa741 -> :sswitch_5e
        0x1aa743 -> :sswitch_2c
        0x1aa75e -> :sswitch_38
        0x1aa77d -> :sswitch_1c
        0x1aa77e -> :sswitch_35
        0x1aa7a2 -> :sswitch_6f
        0x1aa7da -> :sswitch_e
        0x1aa7dd -> :sswitch_9
        0x1aa7f9 -> :sswitch_4f
        0x1aa7fc -> :sswitch_a
        0x1aa81d -> :sswitch_62
        0x1aaac0 -> :sswitch_23
        0x1aaac3 -> :sswitch_57
        0x1aab06 -> :sswitch_36
        0x1aab1e -> :sswitch_6e
        0x1aab21 -> :sswitch_a
        0x1aab24 -> :sswitch_55
        0x1aab43 -> :sswitch_11
        0x1aab5f -> :sswitch_45
        0x1aabbb -> :sswitch_2
        0x1aae82 -> :sswitch_68
        0x1aae84 -> :sswitch_19
        0x1aae88 -> :sswitch_18
        0x1aaea4 -> :sswitch_a
        0x1aaedf -> :sswitch_a
        0x1aaee2 -> :sswitch_16
        0x1aaee4 -> :sswitch_41
        0x1aaee5 -> :sswitch_50
        0x1aaefd -> :sswitch_2a
        0x1aaf40 -> :sswitch_46
        0x1aaf42 -> :sswitch_6
        0x1aaf5b -> :sswitch_71
        0x1aaf81 -> :sswitch_26
        0x1aaf82 -> :sswitch_42
        0x1aaf98 -> :sswitch_32
        0x1aafa0 -> :sswitch_3d
        0x1ab269 -> :sswitch_1d
        0x1ab26a -> :sswitch_44
        0x1ab282 -> :sswitch_58
        0x1ab283 -> :sswitch_53
        0x1ab2e1 -> :sswitch_4
        0x1ab31c -> :sswitch_15
        0x1ab322 -> :sswitch_a
        0x1ab33d -> :sswitch_29
        0x1ab609 -> :sswitch_7
        0x1ab645 -> :sswitch_10
        0x1ab662 -> :sswitch_a
        0x1ab668 -> :sswitch_2d
        0x1ab669 -> :sswitch_6a
        0x1ab6c4 -> :sswitch_4b
        0x1ab6dc -> :sswitch_5
        0x1ab6de -> :sswitch_33
        0x1ab6e0 -> :sswitch_c
        0x1ab6e5 -> :sswitch_21
        0x1ab700 -> :sswitch_56
        0x1ab701 -> :sswitch_a
        0x1ab71a -> :sswitch_2
        0x1ab9c4 -> :sswitch_1f
        0x1ab9c9 -> :sswitch_52
        0x1ab9ca -> :sswitch_24
        0x1ab9e5 -> :sswitch_a
        0x1aba04 -> :sswitch_64
        0x1aba06 -> :sswitch_59
        0x1aba25 -> :sswitch_22
        0x1aba40 -> :sswitch_51
        0x1abaa0 -> :sswitch_26
        0x1abac1 -> :sswitch_3e
        0x1abadc -> :sswitch_30
        0x1abae0 -> :sswitch_28
        0x1abda7 -> :sswitch_f
        0x1abdc7 -> :sswitch_a
        0x1abe22 -> :sswitch_3f
        0x1abe3f -> :sswitch_a
        0x1abe48 -> :sswitch_43
        0x1abe5e -> :sswitch_48
        0x1abe63 -> :sswitch_3e
        0x1abe7d -> :sswitch_69
        0x1abe9c -> :sswitch_47
        0x1abe9e -> :sswitch_6c
        0x1ac14c -> :sswitch_b
        0x1ac14e -> :sswitch_12
        0x1ac168 -> :sswitch_4e
        0x1ac16c -> :sswitch_12
        0x1ac188 -> :sswitch_39
        0x1ac18c -> :sswitch_29
        0x1ac1a4 -> :sswitch_4c
        0x1ac1c3 -> :sswitch_5d
        0x1ac1c5 -> :sswitch_8
        0x1ac1c6 -> :sswitch_1b
        0x1ac1e5 -> :sswitch_1f
        0x1ac1e6 -> :sswitch_3c
        0x1ac1e7 -> :sswitch_27
        0x1ac242 -> :sswitch_71
        0x1ac25f -> :sswitch_3a
        0x1ac507 -> :sswitch_2f
        0x1ac527 -> :sswitch_2e
        0x1ac54c -> :sswitch_5d
        0x1ac56a -> :sswitch_67
        0x1ac583 -> :sswitch_5f
        0x1ac587 -> :sswitch_3b
        0x1ac58a -> :sswitch_65
        0x1ac5ab -> :sswitch_5c
        0x1ac5c9 -> :sswitch_4a
        0x1ac5e2 -> :sswitch_1a
        0x1ac602 -> :sswitch_3
        0x1ac603 -> :sswitch_60
        0x1ac607 -> :sswitch_70
        0x1ac623 -> :sswitch_54
        0x1ac8d0 -> :sswitch_6b
        0x1ac8eb -> :sswitch_d
        0x1ac8ec -> :sswitch_17
        0x1ac8ee -> :sswitch_5b
        0x1ac907 -> :sswitch_20
        0x1ac92a -> :sswitch_1e
        0x1ac92d -> :sswitch_61
        0x1ac945 -> :sswitch_64
        0x1ac948 -> :sswitch_c
        0x1ac94a -> :sswitch_37
        0x1ac96b -> :sswitch_49
        0x1ac985 -> :sswitch_49
        0x1ac9aa -> :sswitch_25
        0x1ac9c2 -> :sswitch_40
        0x1ac9c8 -> :sswitch_34
        0x1ac9e6 -> :sswitch_4d
    .end sparse-switch
.end method

.method private final e(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 12

    const-string v0, "fQ==\n"

    const-string v1, "DdBfWHdFcms=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    instance-of v1, v0, Landroid/widget/ImageView;

    if-eqz v1, :cond_2

    check-cast v0, Landroid/widget/ImageView;

    move-object v6, v0

    :goto_0
    if-nez v6, :cond_3

    :cond_0
    :goto_1
    invoke-static {}, Landroidx/startup/ۣۤۦۥ;->۠ۨ۟()I

    move-result v0

    if-gtz v0, :cond_1

    const-string v0, "pbnNLgptfi"

    invoke-static {v0}, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۤۨۡۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :cond_1
    :goto_2
    return-void

    :cond_2
    const/4 v0, 0x0

    move-object v6, v0

    goto :goto_0

    :cond_3
    const-string v0, "dcUWcDNH/Ll/wxZwLlTmpA==\n"

    const-string v1, "HqBvL0M1lc8=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lgt;->i(Ljava/lang/String;)Z

    move-result v7

    const-string v0, "WArKbhk/7btXCtduCib5oVId\n"

    const-string v1, "M2+zMWtQmNU=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lgt;->i(Ljava/lang/String;)Z

    move-result v8

    if-nez v7, :cond_5

    if-nez v8, :cond_5

    invoke-virtual {v6}, Landroid/widget/ImageView;->clearColorFilter()V

    invoke-virtual {v6}, Landroid/view/View;->getOutlineProvider()Landroid/view/ViewOutlineProvider;

    move-result-object v0

    sget-object v1, Ldy;->h:Lay;

    if-ne v0, v1, :cond_4

    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Landroid/view/View;->setClipToOutline(Z)V

    sget-object v0, Landroid/view/ViewOutlineProvider;->BACKGROUND:Landroid/view/ViewOutlineProvider;

    invoke-virtual {v6, v0}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    :cond_4
    sget v0, Ldy;->d:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, -0x1

    sput v0, Ldy;->d:I

    const/high16 v0, -0x40800000    # -1.0f

    sput v0, Ldy;->f:F

    sget-object v0, Ldy;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    sget-object v0, Ldy;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    sget-object v0, Ldy;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    goto :goto_2

    :cond_5
    :try_start_0
    sget-object v0, Lgn;->a:Lgn;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lgn;->e:Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v2, "KFtOlA==\n"

    const-string v3, "ehQBwC5x4u0=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "u2XDvXPnaw2ueer6Kqw3Zw==\n"

    const-string v2, "zwqP0gSCGU4=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-object v5, v0

    :goto_3
    :try_start_1
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_f

    :cond_6
    :goto_4
    const/high16 v0, 0x7e0b0000

    invoke-virtual {v6, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Boolean;

    if-eqz v1, :cond_10

    check-cast v0, Ljava/lang/Boolean;

    :goto_5
    if-nez v0, :cond_a

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Y/6M1diPgYMqtday\n"

    const-string v2, "BJv4m7ni5Ks=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v2, "MEj9LQ==\n"

    const-string v3, "YgeyeV7l+rI=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    const-string v0, "GObgPGVg1KEN+sl7PCuIyw==\n"

    const-string v3, "bImsUxIFpuI=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v6}, Landroid/view/View;->getId()I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    const/4 v3, -0x1

    if-eq v0, v3, :cond_11

    :try_start_2
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v6}, Landroid/view/View;->getId()I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v0

    const-string v3, "Wi2TQBPDTYxPK4JXGMRQgHMpindengzXFA==\n"

    const-string v4, "PUjnEnawIvk=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v3, "Jl0+EA==\n"

    const-string v4, "dBJxRNJ4DoM=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "89xQCvj7LxnmwHlNobBzcw==\n"

    const-string v3, "h7McZY+eXVo=\n"

    invoke-static {v1, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object v1, v0

    :goto_6
    :try_start_3
    invoke-virtual {v6}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_8

    :cond_7
    const-string v0, ""

    :cond_8
    const-string v3, "Z4bgi0k=\n"

    const-string v4, "AuuP4SD6LEU=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-nez v3, :cond_9

    const-string v3, "OBogT+4=\n"

    const-string v4, "XXdPJYesEkI=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v1, v3, v4}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-nez v3, :cond_9

    const-string v3, "VwIt\n"

    const-string v4, "MGtLV3m39Vw=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-nez v3, :cond_9

    const-string v3, "x98B\n"

    const-string v4, "oLZnZ1K6Lio=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v1, v3, v4}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-nez v3, :cond_9

    const-string v3, "vKIGItWK+w==\n"

    const-string v4, "z9ZvQb7viUk=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-nez v3, :cond_9

    const-string v3, "KbLG2ZGqkw==\n"

    const-string v4, "WsavuvrP4bI=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v1, v3, v4}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-nez v3, :cond_9

    const-string v3, "rD03GXvshaY=\n"

    const-string v4, "zlRWdgqF68E=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v1, v3, v4}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-nez v3, :cond_9

    const-string v3, "w1dYwj8G7lLC\n"

    const-string v4, "tT48p1Bwhzc=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-nez v3, :cond_9

    const-string v3, "pkIaVeAXSzW8XBpV4A==\n"

    const-string v4, "zy97MoVIJlA=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v1, v3, v4}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-nez v3, :cond_9

    const-string v3, "GAdi41fL3GUkDGz5V8fcdg==\n"

    const-string v4, "e28DlyOisgI=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v1, v3, v4}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-nez v3, :cond_9

    const-string v3, "wYf9jbY=\n"

    const-string v4, "te+I4NQPKAg=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v1, v3, v4}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-nez v3, :cond_9

    const-string v3, "RvPFq3M=\n"

    const-string v4, "JZyzzgGQVus=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v1, v3, v4}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-nez v3, :cond_9

    const-string v3, "FzaHPPtC\n"

    const-string v4, "ZFnyTpgnVDA=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v1, v3, v4}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-nez v3, :cond_9

    const-string v3, "hgOaAlci\n"

    const-string v4, "53PqbyRFdY0=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v1, v3, v4}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-nez v3, :cond_9

    const-string v3, "kVDNuuGjKMg=\n"

    const-string v4, "8CC92JPCRqw=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-nez v3, :cond_9

    const-string v3, "VcnQ9xIZ\n"

    const-string v4, "J6yxk3drefk=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v1, v3, v4}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-nez v3, :cond_9

    const-string v3, "kigM0x+x\n"

    const-string v4, "eomkNZw0Vq4=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v0, v3, v4}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-nez v3, :cond_9

    const-string v3, "Hu5sd0ME\n"

    const-string v4, "+2TEkNe/hfw=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v0, v3, v4}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-nez v3, :cond_9

    const-string v3, "YKHL3fB/\n"

    const-string v4, "hTp1Onn4vEM=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v0, v3, v4}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-nez v3, :cond_9

    const-string v3, "LTb8/qWJ\n"

    const-string v4, "yIZ9FzgrdGw=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v0, v3, v4}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-nez v3, :cond_9

    const-string v3, "X3/2OeafwKYG\n"

    const-string v4, "uMNf3nM6JT0=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v0, v3, v4}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_12

    :cond_9
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_7
    if-eqz v0, :cond_23

    const/high16 v1, 0x7e0b0000

    invoke-virtual {v6, v1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_a
    :goto_8
    const/high16 v0, 0x7e0b0000

    invoke-virtual {v6, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_30

    if-eqz v8, :cond_c

    sget-object v0, Ldy;->h:Lay;

    if-eqz v0, :cond_c

    invoke-virtual {v6}, Landroid/view/View;->getOutlineProvider()Landroid/view/ViewOutlineProvider;

    move-result-object v1

    if-eq v1, v0, :cond_b

    invoke-virtual {v6, v0}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Landroid/view/View;->setClipToOutline(Z)V

    :cond_b
    invoke-virtual {v6}, Landroid/view/View;->invalidateOutline()V

    :cond_c
    if-eqz v7, :cond_2f

    const-string v0, "8CLoGuwTZfr6JOga7xV14P4=\n"

    const-string v1, "m0eRRZxhDIw=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lgt;->j(Ljava/lang/String;I)I

    move-result v0

    const-string v1, "Ake+cl8m1C8IQb5yTTjIKzZLqVlKOs4wHVs=\n"

    const-string v2, "aSLHLS9UvVk=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x64

    invoke-static {v1, v2}, Lgt;->j(Ljava/lang/String;I)I

    move-result v1

    sget v2, Ldy;->d:I

    if-ne v2, v0, :cond_d

    sget v2, Ldy;->e:I

    if-eq v2, v1, :cond_e

    :cond_d
    sput v0, Ldy;->d:I

    sput v1, Ldy;->e:I

    sget-object v0, Ldy;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    sget-object v0, Ldy;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    :cond_e
    const-string v0, "qE43pcXxx9aiSDelxvfXzKY=\n"

    const-string v1, "wytO+rWDrqA=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lgt;->j(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_24

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_24

    const/high16 v0, 0x3f800000    # 1.0f

    const-string v1, "d9C27vFh0gN91rbu43/OB0PcocXkfcgcaMw=\n"

    const-string v2, "HLXPsYETu3U=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x64

    invoke-static {v1, v2}, Lgt;->j(Ljava/lang/String;I)I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v1, v2

    const/high16 v2, 0x41700000    # 15.0f

    mul-float/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    sget-object v1, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-static {v0, v0}, Lp7;->e(FF)Landroid/graphics/RenderEffect;

    move-result-object v0

    invoke-static {v6, v0}, Lp7;->p(Landroid/widget/ImageView;Landroid/graphics/RenderEffect;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto/16 :goto_1

    :catchall_0
    move-exception v0

    const-string v0, "Nwje\n"

    const-string v1, "Q2m5jaPP2Zc=\n"

    const-string v2, "zZVuN9BxcgXyiGwe+H9qKvg=\n"

    const-string v3, "necHQbESC00=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Fg==\n"

    const-string v4, "c8HJlSTQVfc=\n"

    invoke-static {v0, v1, v2, v3, v4}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    :catchall_1
    move-exception v0

    const-string v0, ""

    move-object v5, v0

    goto/16 :goto_3

    :cond_f
    :try_start_4
    const-string v0, "V85FTJa4qPBOxg==\n"

    const-string v1, "O68wIvXQzYI=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v5, v0, v1}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "mGvPIMha/FaOag==\n"

    const-string v1, "+wOuVLwzkjE=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v5, v0, v1}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_4

    :cond_10
    const/4 v0, 0x0

    goto/16 :goto_5

    :catchall_2
    move-exception v0

    :cond_11
    const-string v0, ""

    move-object v1, v0

    goto/16 :goto_6

    :cond_12
    :try_start_5
    const-string v0, "wRaMuUU4\n"

    const-string v3, "oGDtzSRKXnc=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-static {v2, v0, v3}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_13

    const-string v0, "W6DsjZ4X\n"

    const-string v2, "OtaN+f9lSWQ=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_13

    sget-object v0, Lpb0;->H0:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    :cond_13
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto/16 :goto_7

    :cond_14
    const-string v0, "hcB3y/C2aA2TwQ==\n"

    const-string v1, "5qgWv4TfBmo=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v5, v0, v1}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Landroid/view/View;

    if-eqz v1, :cond_16

    check-cast v0, Landroid/view/View;

    :goto_9
    const/4 v1, 0x0

    move-object v2, v0

    move v4, v1

    :goto_a
    if-eqz v2, :cond_19

    const/16 v0, 0xf

    if-ge v4, v0, :cond_19

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "wpiBz5dw/PqL09uo\n"

    const-string v9, "pf31gfYdmdI=\n"

    invoke-static {v1, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v9, "q+vZKQ==\n"

    const-string v10, "+aSWfYH37N0=\n"

    invoke-static {v9, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v1}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    const-string v0, "09rN1NWQLrfGxuSTjNty3Q==\n"

    const-string v10, "p7WBu6L1XPQ=\n"

    invoke-static {v0, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v9}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v2}, Landroid/view/View;->getId()I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-result v0

    const/4 v10, -0x1

    if-eq v0, v10, :cond_17

    :try_start_6
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v10

    invoke-virtual {v0, v10}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v0

    const-string v10, "KVQdxKbYQh88UgzTrd9fEwBQBPPrhQNEZw==\n"

    const-string v11, "TjFplsOrLWo=\n"

    invoke-static {v10, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v0}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v10, "nBT2IA==\n"

    const-string v11, "zlu5dHojA7o=\n"

    invoke-static {v10, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "SMShrQ5YYMtd2IjqVxM8oQ==\n"

    const-string v10, "PKvtwnk9Eog=\n"

    invoke-static {v1, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :goto_b
    :try_start_7
    const-string v1, "E1Vqh7ssvJc=\n"

    const-string v10, "cD0L889F0vA=\n"

    invoke-static {v1, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v10, 0x0

    invoke-static {v0, v1, v10}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_15

    const-string v0, "j4U72ppF+4M=\n"

    const-string v1, "7O1aru4sleQ=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v9, v0, v1}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_31

    :cond_15
    const/4 v0, 0x1

    move v1, v0

    :goto_c
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v2, v0, Landroid/view/View;

    if-eqz v2, :cond_18

    check-cast v0, Landroid/view/View;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :goto_d
    rsub-int/lit8 v2, v4, 0x0

    add-int/lit8 v2, v2, -0x1

    rsub-int/lit8 v4, v2, 0x0

    move-object v2, v0

    move v3, v1

    goto/16 :goto_a

    :cond_16
    const/4 v0, 0x0

    goto/16 :goto_9

    :catchall_3
    move-exception v0

    :cond_17
    const-string v0, ""

    goto :goto_b

    :cond_18
    const/4 v0, 0x0

    goto :goto_d

    :cond_19
    :try_start_8
    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Landroid/view/View;

    if-eqz v1, :cond_1b

    check-cast v0, Landroid/view/View;

    :goto_e
    const/4 v2, 0x0

    move-object v1, v0

    :goto_f
    if-eqz v1, :cond_20

    const/16 v0, 0xf

    if-ge v2, v0, :cond_20

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v4, "2JN7Wq3efZSR2CE9\n"

    const-string v9, "v/YPFMyzGLw=\n"

    invoke-static {v4, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v9, "BixFgw==\n"

    const-string v10, "VGMK11RxC6Q=\n"

    invoke-static {v9, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v4}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    const-string v0, "XhrWmY/3C9lLBv/e1rxXsw==\n"

    const-string v10, "KnWa9viSeZo=\n"

    invoke-static {v0, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v9}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v1}, Landroid/view/View;->getId()I
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    move-result v0

    const/4 v10, -0x1

    if-eq v0, v10, :cond_1c

    :try_start_9
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v10

    invoke-virtual {v0, v10}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v0

    const-string v10, "dMdL/9UXTCdhwVro3hBRK13DUsiYSg18Og==\n"

    const-string v11, "E6I/rbBkI1I=\n"

    invoke-static {v10, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v0}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v10, "jarR+Q==\n"

    const-string v11, "3+WercEu1zE=\n"

    invoke-static {v10, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v4, "bX0X0lx3q9p4YT6VBTz3sA==\n"

    const-string v10, "GRJbvSsS2Zk=\n"

    invoke-static {v4, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v0}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    :goto_10
    :try_start_a
    const-string v4, "2dKj5dQ=\n"

    const-string v10, "vL/Mj70mC9Q=\n"

    invoke-static {v4, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v10, 0x0

    invoke-static {v9, v4, v10}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-nez v4, :cond_1a

    const-string v4, "PXRiWfA=\n"

    const-string v10, "WBkNM5mxbNc=\n"

    invoke-static {v4, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v10, 0x0

    invoke-static {v0, v4, v10}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-nez v4, :cond_1a

    const-string v4, "Bcvneeto\n"

    const-string v10, "dqaOFY4Rkq4=\n"

    invoke-static {v4, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v10, 0x0

    invoke-static {v9, v4, v10}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-nez v4, :cond_1a

    const-string v4, "NcSyQa2a\n"

    const-string v10, "RqnbLcjjY40=\n"

    invoke-static {v4, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v10, 0x0

    invoke-static {v0, v4, v10}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-nez v4, :cond_1a

    const-string v4, "38EXhs3pcyk=\n"

    const-string v10, "uqx48qSKHEc=\n"

    invoke-static {v4, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v10, 0x0

    invoke-static {v9, v4, v10}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-nez v4, :cond_1a

    const-string v4, "gl9e+DQpZKo=\n"

    const-string v10, "5zIxjF1KC8Q=\n"

    invoke-static {v4, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v10, 0x0

    invoke-static {v0, v4, v10}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-nez v4, :cond_1a

    const-string v4, "c7yA60/djg8=\n"

    const-string v10, "GNn5iSC8/Gs=\n"

    invoke-static {v4, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v10, 0x0

    invoke-static {v9, v4, v10}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-nez v4, :cond_1a

    const-string v4, "bZMHgzc=\n"

    const-string v10, "BP139kML1NI=\n"

    invoke-static {v4, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v10, 0x0

    invoke-static {v0, v4, v10}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-eqz v4, :cond_1d

    :cond_1a
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    goto/16 :goto_7

    :cond_1b
    const/4 v0, 0x0

    goto/16 :goto_e

    :catchall_4
    move-exception v0

    :cond_1c
    const-string v0, ""

    goto/16 :goto_10

    :cond_1d
    if-eqz v3, :cond_1e

    :try_start_b
    const-string v4, "Jac/aG0=\n"

    const-string v10, "VNJQHAiKzp8=\n"

    invoke-static {v4, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v10, 0x0

    invoke-static {v9, v4, v10}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-nez v4, :cond_1a

    const-string v4, "6xpMUMY=\n"

    const-string v10, "mm8jJKMdUZQ=\n"

    invoke-static {v4, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v10, 0x0

    invoke-static {v0, v4, v10}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-nez v4, :cond_1a

    const-string v4, "RF8mTAM=\n"

    const-string v10, "NjpWIHpjCLM=\n"

    invoke-static {v4, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v10, 0x0

    invoke-static {v9, v4, v10}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-nez v4, :cond_1a

    const-string v4, "SNR1+54=\n"

    const-string v10, "OrEFl+dgyrE=\n"

    invoke-static {v4, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v10, 0x0

    invoke-static {v0, v4, v10}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-nez v4, :cond_1a

    const-string v4, "mG64u6I=\n"

    const-string v10, "6A/W3s5LKbU=\n"

    invoke-static {v4, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v10, 0x0

    invoke-static {v9, v4, v10}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-nez v4, :cond_1a

    const-string v4, "kIKtRBo=\n"

    const-string v10, "4OPDIXayd50=\n"

    invoke-static {v4, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v10, 0x0

    invoke-static {v0, v4, v10}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-nez v4, :cond_1a

    const-string v4, "pIS4rAf1\n"

    const-string v10, "wuvX2GKH8/I=\n"

    invoke-static {v4, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v10, 0x0

    invoke-static {v9, v4, v10}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-nez v4, :cond_1a

    const-string v4, "SsbCXRRu\n"

    const-string v10, "LKmtKXEc/sk=\n"

    invoke-static {v4, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v10, 0x0

    invoke-static {v0, v4, v10}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-nez v4, :cond_1a

    const-string v4, "ZKbv17LS\n"

    const-string v10, "Bsmbo92/B/U=\n"

    invoke-static {v4, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v10, 0x0

    invoke-static {v9, v4, v10}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-nez v4, :cond_1a

    const-string v4, "TSMNFpdo\n"

    const-string v10, "L0x5YvgFjm0=\n"

    invoke-static {v4, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v10, 0x0

    invoke-static {v0, v4, v10}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-nez v4, :cond_1a

    const-string v4, "7hoSbg==\n"

    const-string v10, "iWh7CmeiRIo=\n"

    invoke-static {v4, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v10, 0x0

    invoke-static {v9, v4, v10}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-nez v4, :cond_1a

    const-string v4, "zl5Zpw==\n"

    const-string v9, "qSwww4dOgTo=\n"

    invoke-static {v4, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v9, 0x0

    invoke-static {v0, v4, v9}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-nez v4, :cond_1a

    const-string v4, "g+X8RTRzUkO/7vJfNH9SUA==\n"

    const-string v9, "4I2dMUAaPCQ=\n"

    invoke-static {v4, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v9, 0x0

    invoke-static {v0, v4, v9}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-nez v4, :cond_1a

    const-string v4, "WV7x6wTv3g9lX+T6HdnRGEpb4/g=\n"

    const-string v9, "OjaQn3CGsGg=\n"

    invoke-static {v4, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v9, 0x0

    invoke-static {v0, v4, v9}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-nez v4, :cond_1a

    const-string v4, "1KvlSAJM\n"

    const-string v9, "p8SQOmEph8k=\n"

    invoke-static {v4, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v9, 0x0

    invoke-static {v0, v4, v9}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-nez v4, :cond_1a

    const-string v4, "9c9TYA==\n"

    const-string v9, "lq4hBEudCYQ=\n"

    invoke-static {v4, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v9, 0x0

    invoke-static {v0, v4, v9}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_1a

    :cond_1e
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Landroid/view/View;

    if-eqz v1, :cond_1f

    check-cast v0, Landroid/view/View;

    :goto_11
    add-int/lit8 v1, v2, 0x4

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v2, v1, -0x4

    move-object v1, v0

    goto/16 :goto_f

    :cond_1f
    const/4 v0, 0x0

    goto :goto_11

    :cond_20
    if-eqz v3, :cond_21

    const/high16 v0, 0x42080000    # 34.0f

    :goto_12
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    if-eqz v1, :cond_22

    iget v2, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    if-lez v2, :cond_22

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-lez v1, :cond_22

    invoke-static {v6, v0, v2, v1}, Lk9;->i(Landroid/widget/ImageView;FII)Ljava/lang/Boolean;

    move-result-object v0

    goto/16 :goto_7

    :cond_21
    const/high16 v0, 0x41400000    # 12.0f

    goto :goto_12

    :cond_22
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual {v6}, Landroid/view/View;->getHeight()I

    move-result v2

    invoke-static {v6, v0, v1, v2}, Lk9;->i(Landroid/widget/ImageView;FII)Ljava/lang/Boolean;

    move-result-object v0

    goto/16 :goto_7

    :cond_23
    const v0, 0x7e0b0002

    invoke-virtual {v6, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    const v0, 0x7e0b0002

    invoke-virtual {v6, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    new-instance v0, Lo7;

    const/4 v1, 0x1

    invoke-direct {v0, v1, v5}, Lo7;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v6, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    goto/16 :goto_8

    :cond_24
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_25

    invoke-static {v6}, Lp7;->o(Landroid/widget/ImageView;)V

    :cond_25
    new-instance v3, Li00;

    invoke-direct {v3}, Li00;-><init>()V

    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->method:Ljava/lang/reflect/Member;

    invoke-interface {v0}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "b+LM+wljU6Ne7szfBXI=\n"

    const-string v2, "HIe4smQCNMY=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_28

    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    instance-of v1, v0, Landroid/graphics/Bitmap;

    if-eqz v1, :cond_27

    check-cast v0, Landroid/graphics/Bitmap;

    :goto_13
    iput-object v0, v3, Li00;->b:Ljava/lang/Object;

    :cond_26
    :goto_14
    iget-object v0, v3, Li00;->b:Ljava/lang/Object;

    if-eqz v0, :cond_0

    sget-object v1, Ldy;->b:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Ldy;->a:Ljava/util/Map;

    iget-object v1, v3, Li00;->b:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    if-eqz v0, :cond_2e

    if-eqz v4, :cond_2d

    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    :goto_15
    invoke-virtual {v6}, Landroid/widget/ImageView;->clearColorFilter()V

    goto/16 :goto_1

    :cond_27
    const/4 v0, 0x0

    goto :goto_13

    :cond_28
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    instance-of v1, v0, Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_29

    check-cast v0, Landroid/graphics/drawable/Drawable;

    :goto_16
    instance-of v1, v0, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v1, :cond_2a

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, v3, Li00;->b:Ljava/lang/Object;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    goto :goto_14

    :cond_29
    const/4 v0, 0x0

    goto :goto_16

    :cond_2a
    if-eqz v0, :cond_26

    :try_start_c
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    const/16 v1, 0x96

    if-lez v2, :cond_2c

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    :goto_17
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v5

    if-lez v5, :cond_2b

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    :cond_2b
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v2, v1, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    iput-object v1, v3, Li00;->b:Ljava/lang/Object;

    new-instance v2, Landroid/graphics/Canvas;

    iget-object v1, v3, Li00;->b:Ljava/lang/Object;

    check-cast v1, Landroid/graphics/Bitmap;

    invoke-direct {v2, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    const/4 v1, 0x0

    const/4 v5, 0x0

    invoke-virtual {v2}, Landroid/graphics/Canvas;->getWidth()I

    move-result v7

    invoke-virtual {v2}, Landroid/graphics/Canvas;->getHeight()I

    move-result v8

    invoke-virtual {v0, v1, v5, v7, v8}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    goto :goto_14

    :catchall_5
    move-exception v0

    goto :goto_14

    :cond_2c
    const/16 v2, 0x96

    goto :goto_17

    :cond_2d
    :try_start_d
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v2, 0x0

    new-instance v3, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v6}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-direct {v3, v4, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    aput-object v3, v1, v2

    goto :goto_15

    :cond_2e
    const-string v0, "ivQJEgX110OR\n"

    const-string v1, "qcwxKj3N73s=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v6, v0, v1}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    iget-object v0, v3, Li00;->b:Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    const-string v1, "rfGeKYsy+J6r/Zg9gDD8iKQ=\n"

    const-string v2, "6rTbYtR/t80=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v6, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    new-instance v1, Ljava/lang/Thread;

    new-instance v2, Lcy;

    invoke-direct {v2, v3, v6, v0, v4}, Lcy;-><init>(Li00;Landroid/widget/ImageView;IZ)V

    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    goto/16 :goto_1

    :cond_2f
    invoke-virtual {v6}, Landroid/widget/ImageView;->clearColorFilter()V

    goto/16 :goto_1

    :cond_30
    invoke-virtual {v6}, Landroid/view/View;->getOutlineProvider()Landroid/view/ViewOutlineProvider;

    move-result-object v0

    sget-object v1, Ldy;->h:Lay;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Landroid/view/View;->setClipToOutline(Z)V

    sget-object v0, Landroid/view/ViewOutlineProvider;->BACKGROUND:Landroid/view/ViewOutlineProvider;

    invoke-virtual {v6, v0}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    goto/16 :goto_1

    :cond_31
    move v1, v3

    goto/16 :goto_c
.end method

.method private final f(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 12

    const/4 v11, 0x0

    const/4 v3, 0x0

    const-string v0, "\u06e3\u06e2\u06e8"

    invoke-static {v0}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v0

    move-object v1, v3

    move-object v10, v3

    move-object v4, v3

    move-object v5, v3

    move-object v9, v3

    move-object v6, v3

    move-object v2, v3

    move v7, v0

    :goto_0
    sparse-switch v7, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    sget v0, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v7, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    add-int/lit16 v7, v7, -0x1a7d

    or-int/2addr v0, v7

    if-ltz v0, :cond_14

    const-string v0, "\u06e5\u06e2\u06e3"

    :goto_1
    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v0

    move v7, v0

    goto :goto_0

    :sswitch_1
    const-string v0, "SOTqAF/vsM588v0sYeWhy0b19g==\n"

    const-string v7, "I4GTXz6BxKc=\n"

    sget-object v8, Lgn;->a:Lgn;

    invoke-static {v0, v7, v8}, Lz30;->q(Ljava/lang/String;Ljava/lang/String;Lgn;)Z

    move-result v0

    if-nez v0, :cond_e

    sget v0, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    if-ltz v0, :cond_1

    :goto_2
    const-string v0, "\u06e3\u06e4\u06e1"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v0

    move v7, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e8\u06e0\u06e6"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v0

    move v7, v0

    goto :goto_0

    :cond_2
    :sswitch_2
    invoke-static {}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۣ۟ۡۧ۠()I

    move-result v0

    if-ltz v0, :cond_3

    const-string v0, "\u06e8\u06e7"

    :goto_3
    invoke-static {v0}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۣ۠ۧۢ(Ljava/lang/Object;)I

    move-result v0

    move v7, v0

    goto :goto_0

    :cond_3
    sget v0, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v7, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    xor-int/2addr v0, v7

    const v7, 0x1aad67

    add-int/2addr v0, v7

    move v7, v0

    goto :goto_0

    :sswitch_3
    sget v0, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v7, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    or-int/lit16 v7, v7, -0xc87

    div-int/2addr v0, v7

    if-gtz v0, :cond_4

    invoke-static {}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣ۟۠()I

    const-string v0, "\u06e1\u06e0\u06e6"

    invoke-static {v0}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v0

    move v7, v0

    goto :goto_0

    :cond_4
    sget v0, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v7, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    add-int/2addr v0, v7

    const v7, 0x1aaef0

    add-int/2addr v0, v7

    move v7, v0

    goto :goto_0

    :sswitch_4
    sget v0, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v7, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    div-int/2addr v0, v7

    const v7, 0x1ac260

    xor-int/2addr v0, v7

    move v7, v0

    goto :goto_0

    :sswitch_5
    const-string v0, "MBVeUZswZuclCXcWwns6jQ==\n"

    const-string v7, "RHoSPuxVFKQ=\n"

    invoke-static {v0, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v10}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v4, v9, v11}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_10

    sget v0, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v7, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    mul-int/lit16 v7, v7, 0x123f

    sub-int/2addr v0, v7

    if-ltz v0, :cond_6

    const/16 v0, 0x1b

    sput v0, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    :cond_5
    const-string v0, "\u06e5\u06e5\u06e2"

    invoke-static {v0}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v0

    move v7, v0

    goto/16 :goto_0

    :cond_6
    sget v0, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v7, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    mul-int/2addr v0, v7

    const v7, 0x6c60d

    add-int/2addr v0, v7

    move v7, v0

    goto/16 :goto_0

    :sswitch_6
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    move-object v5, v4

    :goto_4
    const-string v4, "\u06e7\u06e3\u06e4"

    invoke-static {v4}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v7

    move-object v4, v0

    goto/16 :goto_0

    :sswitch_7
    if-nez v2, :cond_2

    sget v0, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    if-ltz v0, :cond_5

    const/16 v0, 0x47

    sput v0, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    const-string v0, "\u06e4\u06e8\u06e2"

    invoke-static {v0}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v0

    move v7, v0

    goto/16 :goto_0

    :sswitch_8
    sget v0, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    if-ltz v0, :cond_7

    invoke-static {}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟۟ۤۦۨ()I

    const-string v0, "\u06e5\u06e5"

    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v0

    move v7, v0

    goto/16 :goto_0

    :cond_7
    sget v0, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v7, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sub-int/2addr v0, v7

    const v7, -0x1aa73c

    xor-int/2addr v0, v7

    move v7, v0

    goto/16 :goto_0

    :sswitch_9
    const-string v0, "\u06e6\u06e8\u06e4"

    move-object v2, v3

    goto/16 :goto_3

    :sswitch_a
    invoke-virtual {p1, v3}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    sget v0, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    if-ltz v0, :cond_8

    const/16 v0, 0x56

    sput v0, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    move-object v0, v4

    goto :goto_4

    :cond_8
    move-object v0, v9

    :cond_9
    const-string v7, "\u06e4\u06e3"

    invoke-static {v7}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v7

    move-object v9, v0

    goto/16 :goto_0

    :sswitch_b
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    sget v6, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    if-gtz v6, :cond_a

    invoke-static {}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۡۦۣۨ()I

    :goto_5
    const-string v6, "\u06e7\u06e2\u06e6"

    move-object v7, v6

    move-object v8, v0

    :goto_6
    invoke-static {v7}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v0

    move-object v6, v8

    move v7, v0

    goto/16 :goto_0

    :cond_a
    const-string v6, "\u06e8\u06e6\u06e6"

    invoke-static {v6}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v7

    move-object v6, v0

    goto/16 :goto_0

    :sswitch_c
    const-string v0, "gQ==\n"

    const-string v1, "8Tw6gVNunZA=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    aget-object v1, v0, v11

    goto/16 :goto_2

    :sswitch_d
    invoke-static {v4, v10, v11}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_c

    const-string v0, "\u06e1\u06e0\u06e6"

    :goto_7
    invoke-static {v0}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣ۟ۦۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v7, v0

    goto/16 :goto_0

    :sswitch_e
    sget v0, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v7, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    or-int/lit16 v7, v7, -0xa33

    add-int/2addr v0, v7

    if-ltz v0, :cond_b

    const-string v0, "\u06e5\u06e6"

    invoke-static {v0}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v0

    move v7, v0

    goto/16 :goto_0

    :cond_b
    sget v0, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v7, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    mul-int/2addr v0, v7

    const v7, 0x1a9577

    xor-int/2addr v0, v7

    move v7, v0

    goto/16 :goto_0

    :sswitch_f
    const-string v0, "lOaiCD0dEFiB+otPZFZMMg==\n"

    const-string v7, "4InuZ0p4Yhs=\n"

    invoke-static {v0, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v0, Lpb0;->C0:Ljava/lang/String;

    invoke-virtual {v0, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    sget v7, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v8, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    mul-int/lit16 v8, v8, -0x436

    div-int/2addr v7, v8

    if-nez v7, :cond_9

    const-string v7, "\u06e8\u06e8\u06e6"

    invoke-static {v7}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v7

    move-object v9, v0

    goto/16 :goto_0

    :cond_c
    :sswitch_10
    const-string v0, "\u06e1\u06df\u06e3"

    :goto_8
    invoke-static {v0}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v0

    move v7, v0

    goto/16 :goto_0

    :sswitch_11
    sget v0, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v7, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    add-int/lit16 v7, v7, -0x1465

    xor-int/2addr v0, v7

    if-gtz v0, :cond_d

    invoke-static {}, Landroidx/emoji2/text/ۣۣ۟۟۠;->ۢۡۢۦ()I

    const-string v0, "\u06e6\u06e4\u06e4"

    goto :goto_7

    :cond_d
    const-string v0, "\u06e4\u06e3\u06e1"

    goto/16 :goto_1

    :cond_e
    :sswitch_12
    sget v0, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v7, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    add-int/2addr v0, v7

    const v7, 0xdd50

    add-int/2addr v0, v7

    move v7, v0

    goto/16 :goto_0

    :sswitch_13
    const-string v0, "922nFTrfIGHicY5SY5R8Cw==\n"

    const-string v7, "gwLrek26UiI=\n"

    invoke-static {v0, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v9}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v0, Lpb0;->D0:Ljava/lang/String;

    invoke-virtual {v0, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    sget v7, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    if-gtz v7, :cond_f

    const-string v7, "\u06e8\u06e8\u06e6"

    invoke-static {v7}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v7

    move-object v10, v0

    goto/16 :goto_0

    :cond_f
    sget v7, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v8, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sub-int/2addr v7, v8

    const v8, 0x1ab8d0

    add-int/2addr v7, v8

    move-object v10, v0

    goto/16 :goto_0

    :sswitch_14
    sget-object v0, Lpb0;->t1:Ljava/lang/String;

    invoke-static {v4, v0, v11}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_13

    const-string v0, "p/dwFnV4U9Cx/XE=\n"

    const-string v7, "w5IccwEdc7Y=\n"

    invoke-static {v0, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0, v11}, Lb50;->N(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_c

    const-string v0, "\u06e4\u06e7\u06e3"

    move-object v7, v0

    move-object v8, v6

    goto/16 :goto_6

    :sswitch_15
    const-string v0, "\u06e5\u06e5"

    invoke-static {v0}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v0

    move v7, v0

    goto/16 :goto_0

    :sswitch_16
    sget v0, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v2, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sub-int/2addr v0, v2

    const v2, -0x1aa87d

    xor-int/2addr v0, v2

    move-object v2, v6

    move v7, v0

    goto/16 :goto_0

    :cond_10
    :sswitch_17
    sget v0, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v7, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    mul-int/lit16 v7, v7, 0x1bbd

    xor-int/2addr v0, v7

    if-gtz v0, :cond_11

    const-string v0, "\u06e3\u06df\u06e7"

    goto/16 :goto_8

    :cond_11
    sget v0, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v7, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    rem-int/2addr v0, v7

    const v7, 0x1aae3c

    add-int/2addr v0, v7

    move v7, v0

    goto/16 :goto_0

    :sswitch_18
    sget v0, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v7, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    rem-int/lit16 v7, v7, 0x778

    add-int/2addr v0, v7

    if-ltz v0, :cond_12

    invoke-static {}, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۣۨ()I

    const-string v0, "\u06e4\u06e3\u06e7"

    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v0

    move v7, v0

    goto/16 :goto_0

    :cond_12
    move-object v0, v6

    goto/16 :goto_5

    :cond_13
    :sswitch_19
    sget v0, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v7, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    rem-int/2addr v0, v7

    const v7, 0x1ab2ac

    add-int/2addr v0, v7

    move v7, v0

    goto/16 :goto_0

    :cond_14
    sget v0, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v7, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    xor-int/2addr v0, v7

    const v7, -0x1ac348

    xor-int/2addr v0, v7

    move v7, v0

    goto/16 :goto_0

    :sswitch_1a
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc7d -> :sswitch_0
        0xdc7f -> :sswitch_1a
        0xdca0 -> :sswitch_4
        0xdcbd -> :sswitch_6
        0xdcf9 -> :sswitch_d
        0x1aa71e -> :sswitch_19
        0x1aa760 -> :sswitch_4
        0x1aa7de -> :sswitch_17
        0x1aa81a -> :sswitch_15
        0x1aab9f -> :sswitch_10
        0x1aae85 -> :sswitch_1a
        0x1aaea7 -> :sswitch_14
        0x1aaf3c -> :sswitch_1
        0x1ab2a1 -> :sswitch_a
        0x1ab669 -> :sswitch_c
        0x1ab6a0 -> :sswitch_b
        0x1ab6fc -> :sswitch_5
        0x1aba42 -> :sswitch_10
        0x1aba48 -> :sswitch_e
        0x1abac0 -> :sswitch_8
        0x1abade -> :sswitch_10
        0x1abd8d -> :sswitch_2
        0x1abe42 -> :sswitch_3
        0x1ac1e6 -> :sswitch_19
        0x1ac21f -> :sswitch_18
        0x1ac262 -> :sswitch_7
        0x1ac569 -> :sswitch_12
        0x1ac56b -> :sswitch_9
        0x1ac588 -> :sswitch_f
        0x1ac8ee -> :sswitch_11
        0x1ac9a8 -> :sswitch_16
        0x1ac9e6 -> :sswitch_13
    .end sparse-switch
.end method

.method private final g(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 7

    const/4 v1, 0x0

    const-string v0, "/g==\n"

    const-string v2, "jqKdm6v/Knk=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    :try_start_0
    iget-object v4, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const-string v0, "WknuFA==\n"

    const-string v2, "OzuJZ09lZZk=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    array-length v5, v4

    const/4 v0, 0x0

    :sswitch_0
    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_1
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_2
    if-ge v0, v5, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_3
    aget-object v2, v4, v0

    instance-of v6, v2, Landroid/hardware/Sensor;

    const/16 v3, 0x6cc

    :goto_1
    xor-int/lit16 v3, v3, 0x6dd

    sparse-switch v3, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-eqz v6, :cond_1

    const/16 v3, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v3, 0x70a

    goto :goto_1

    :sswitch_6
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_7
    const v0, 0xbe22

    goto :goto_2

    :sswitch_8
    move-object v0, v2

    :goto_3
    instance-of v3, v0, Landroid/hardware/Sensor;

    const v2, 0xbefb

    :goto_4
    const v4, 0xbf0c

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_3

    goto :goto_4

    :cond_2
    :sswitch_9
    const v2, 0xbf39

    goto :goto_4

    :sswitch_a
    sget v2, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    xor-int/lit8 v2, v2, -0x9

    add-int/2addr v0, v2

    const v2, 0xbe7f

    :goto_5
    const v3, 0xbe90

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_4

    goto :goto_5

    :sswitch_b
    const v2, 0xbe9e

    goto :goto_5

    :sswitch_c
    move-object v0, v1

    goto :goto_3

    :sswitch_d
    if-eqz v3, :cond_2

    const v2, 0xc1e3

    goto :goto_4

    :sswitch_e
    check-cast v0, Landroid/hardware/Sensor;

    :goto_6
    const v1, 0xc202

    :goto_7
    const v2, 0xc213

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_5

    goto :goto_7

    :sswitch_f
    if-nez v0, :cond_3

    const v1, 0xc25f

    goto :goto_7

    :cond_3
    :sswitch_10
    const v1, 0xc240

    goto :goto_7

    :sswitch_11
    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۣۤۧ()I

    move-result v1

    const v0, 0xc27e

    :goto_8
    const v2, 0xc28f

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_6

    goto :goto_8

    :cond_4
    :sswitch_12
    const v0, 0xc2bc

    goto :goto_8

    :sswitch_13
    if-gtz v1, :cond_4

    const v0, 0xc2db

    goto :goto_8

    :sswitch_14
    const-string v0, "3ToAjG"

    invoke-static {v0}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۣۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

    :goto_9
    :sswitch_15
    return-void

    :sswitch_16
    const-string v1, "Aq6M1IWIRQ==\n"

    const-string v2, "b+btuuHkICk=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lde/robv/android/xposed/XposedHelpers;->getIntField(Ljava/lang/Object;Ljava/lang/String;)I

    move-result v1

    sget-object v2, Lq50;->b:Ljava/lang/Object;

    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    sget-object v3, Lq50;->a:Landroid/util/SparseIntArray;

    invoke-virtual {v0}, Landroid/hardware/Sensor;->getType()I

    move-result v0

    invoke-virtual {v3, v1, v0}, Landroid/util/SparseIntArray;->put(II)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_9

    :catchall_0
    move-exception v0

    const-string v0, "Nwje\n"

    const-string v1, "Q2m5jaPP2Zc=\n"

    const-string v2, "UMBNMOV5Mwts0mEX5XoIC3HrWyM=\n"

    const-string v3, "A7k+RIAUe2Q=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Fg==\n"

    const-string v4, "c8HJlSTQVfc=\n"

    invoke-static {v0, v1, v2, v3, v4}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_9

    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v2

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :sswitch_17
    move-object v0, v1

    goto :goto_6

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x31 -> :sswitch_2
        0xcc -> :sswitch_3
        0xef -> :sswitch_c
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_a
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_7
        0xb97b -> :sswitch_8
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0x16 -> :sswitch_9
        0x35 -> :sswitch_17
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0xe -> :sswitch_0
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_10
        0x4c -> :sswitch_11
        0x53 -> :sswitch_16
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_12
        0x33 -> :sswitch_15
        0x54 -> :sswitch_14
        0xf1 -> :sswitch_13
    .end sparse-switch
.end method

.method private final h(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 10

    const/4 v2, 0x0

    const/4 v4, 0x0

    const-string v0, "fw==\n"

    const-string v1, "D0+Qj8V7Io0=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    aget-object v0, v0, v4

    const-string v1, "hWw410LTGdSFdiCbANVY2YpqIJsW31jUhHd51RfcFJqfYCTeQtsXzodwOpUr3gw=\n"

    const-string v3, "6xlUu2KweLo=\n"

    invoke-static {v1, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    instance-of v5, v0, [F

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v5, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast v0, [F

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v1, 0x6eb

    goto :goto_1

    :sswitch_4
    move-object v1, v0

    :goto_2
    const/16 v0, 0x748

    :goto_3
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :sswitch_5
    if-nez v1, :cond_1

    const v0, 0xbe60

    goto :goto_3

    :sswitch_6
    move-object v1, v2

    goto :goto_2

    :cond_1
    :sswitch_7
    const v0, 0xbe41

    goto :goto_3

    :sswitch_8
    const v0, 0xbe7f

    :goto_4
    const v1, 0xbe90

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_4

    :goto_5
    :sswitch_9
    return-void

    :sswitch_a
    const v0, 0xbe9e

    goto :goto_4

    :sswitch_b
    array-length v5, v1

    const v0, 0xbefb

    :goto_6
    const v6, 0xbf0c

    xor-int/2addr v0, v6

    sparse-switch v0, :sswitch_data_4

    goto :goto_6

    :cond_2
    :sswitch_c
    const v0, 0xbf39

    goto :goto_6

    :sswitch_d
    if-nez v5, :cond_2

    const v0, 0xc1e3

    goto :goto_6

    :sswitch_e
    const v0, 0xc202

    :goto_7
    const v1, 0xc213

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_5

    goto :goto_7

    :sswitch_f
    const v0, 0xc221

    goto :goto_7

    :sswitch_10
    sget-object v5, Lq50;->b:Ljava/lang/Object;

    monitor-enter v5

    :try_start_0
    sget-object v0, Lq50;->a:Landroid/util/SparseIntArray;

    sget v6, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    xor-int/lit16 v6, v6, 0x127

    invoke-virtual {v0, v3, v6}, Landroid/util/SparseIntArray;->get(II)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result v3

    monitor-exit v5

    const v0, 0xc27e

    :goto_8
    const v5, 0xc28f

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_6

    goto :goto_8

    :cond_3
    :sswitch_11
    const v0, 0xc2bc

    goto :goto_8

    :sswitch_12
    const/16 v0, 0x13

    if-ne v3, v0, :cond_3

    const v0, 0xc2db

    goto :goto_8

    :sswitch_13
    sget-object v3, Lgn;->a:Lgn;

    const-string v0, "VcapnaeqZ71hzr+m\n"

    const-string v5, "PqPQwtTeAs0=\n"

    invoke-static {v0, v5, v3}, Lz30;->q(Ljava/lang/String;Ljava/lang/String;Lgn;)Z

    move-result v5

    const v0, 0xc2fa

    :goto_9
    const v6, 0xc30b

    xor-int/2addr v0, v6

    sparse-switch v0, :sswitch_data_7

    goto :goto_9

    :sswitch_14
    if-eqz v5, :cond_4

    const v0, 0xc5e2

    goto :goto_9

    :cond_4
    :sswitch_15
    const v0, 0xc5c3

    goto :goto_9

    :sswitch_16
    aget v5, v1, v4

    const v0, 0xc601

    :goto_a
    const v6, 0xc612

    xor-int/2addr v0, v6

    sparse-switch v0, :sswitch_data_8

    goto :goto_a

    :sswitch_17
    const/4 v0, 0x0

    cmpl-float v0, v5, v0

    if-lez v0, :cond_5

    const v0, 0xc65e

    goto :goto_a

    :cond_5
    :sswitch_18
    const v0, 0xc63f

    goto :goto_a

    :sswitch_19
    const-string v0, "fVnocyz319ZJUeRAK+rCyn9Z4w==\n"

    const-string v5, "FjyRLF+DsqY=\n"

    invoke-static {v0, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v0, "CW0=\n"

    const-string v5, "OF2hDzC9/Os=\n"

    invoke-static {v0, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v5, "3f5Z\n"

    const-string v7, "tpsgeLwwj7M=\n"

    const-string v8, "lNdk\n"

    const-string v9, "8LICxVL6724=\n"

    invoke-static {v5, v7, v6, v8, v9}, Lz30;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    :try_start_1
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6, v0}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    const v3, 0xc67d

    :goto_b
    const v5, 0xc68e

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_9

    goto :goto_b

    :sswitch_1a
    move-object v3, v0

    :goto_c
    const-string v0, "<this>"

    invoke-static {v0, v3}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    :try_start_2
    sget-object v0, Lx10;->a:Li00;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Li00;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/regex/Pattern;

    invoke-virtual {v0, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_0

    move-result v5

    const v0, 0xca7c

    :goto_d
    const v6, 0xca8d

    xor-int/2addr v0, v6

    sparse-switch v0, :sswitch_data_a

    goto :goto_d

    :sswitch_1b
    if-eqz v5, :cond_7

    const v0, 0xcd64

    goto :goto_d

    :sswitch_1c
    const v3, 0xc69c

    goto :goto_b

    :catchall_0
    move-exception v3

    :try_start_3
    sget-object v7, Lgn;->a:Lgn;

    invoke-static {v0}, Lb50;->R(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v5

    const v3, 0xc984

    :goto_e
    const v8, 0xc995

    xor-int/2addr v3, v8

    sparse-switch v3, :sswitch_data_b

    goto :goto_e

    :sswitch_1d
    if-eqz v5, :cond_6

    const v3, 0xc9e1

    goto :goto_e

    :cond_6
    :sswitch_1e
    const v3, 0xc9c2

    goto :goto_e

    :sswitch_1f
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const v5, 0xca00

    :goto_f
    const v8, 0xca11

    xor-int/2addr v5, v8

    packed-switch v5, :pswitch_data_0

    :pswitch_0
    goto :goto_f

    :goto_10
    :pswitch_1
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6, v3}, Lgn;->b(Ljava/lang/String;I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    move-result-object v0

    move-object v3, v0

    goto :goto_c

    :pswitch_2
    const v5, 0xca1f

    goto :goto_f

    :sswitch_20
    move v3, v4

    goto :goto_10

    :cond_7
    :sswitch_21
    const v0, 0xcd45

    goto :goto_d

    :sswitch_22
    :try_start_4
    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_0

    move-result-object v2

    :sswitch_23
    const v0, 0xcd83

    :goto_11
    const v3, 0xcd94

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_c

    goto :goto_11

    :sswitch_24
    if-eqz v2, :cond_8

    const v0, 0xcde0

    goto :goto_11

    :cond_8
    :sswitch_25
    const v0, 0xcdc1

    goto :goto_11

    :sswitch_26
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const v2, 0xcdff

    :goto_12
    const v3, 0xce10

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_d

    goto :goto_12

    :goto_13
    :sswitch_27
    aget v2, v1, v4

    mul-float/2addr v0, v2

    aput v0, v1, v4

    goto/16 :goto_5

    :sswitch_28
    const v2, 0xce1e

    goto :goto_12

    :sswitch_29
    const/high16 v0, 0x41200000    # 10.0f

    goto :goto_13

    :catchall_1
    move-exception v0

    monitor-exit v5

    throw v0

    :catchall_2
    move-exception v3

    const v3, 0xd106

    :goto_14
    const v5, 0xd117

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_e

    goto :goto_14

    :sswitch_2a
    const v3, 0xd125

    goto :goto_14

    :sswitch_2b
    move-object v3, v0

    goto/16 :goto_c

    :catch_0
    move-exception v0

    const v0, 0xd182

    :goto_15
    const v3, 0xd193

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_f

    goto :goto_15

    :sswitch_2c
    const v0, 0xd1a1

    goto :goto_15

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_6
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_5
        0xb918 -> :sswitch_b
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x35 -> :sswitch_10
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_9
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_11
        0x33 -> :sswitch_9
        0x54 -> :sswitch_13
        0xf1 -> :sswitch_12
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_14
        0x6af -> :sswitch_15
        0x6c8 -> :sswitch_9
        0x6e9 -> :sswitch_16
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_17
        0x2d -> :sswitch_9
        0x32 -> :sswitch_18
        0x4c -> :sswitch_19
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1a
        0xf3 -> :sswitch_1c
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0xf1 -> :sswitch_1b
        0x7ab -> :sswitch_21
        0x7c8 -> :sswitch_23
        0x7e9 -> :sswitch_22
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0x11 -> :sswitch_1d
        0x36 -> :sswitch_1e
        0x57 -> :sswitch_20
        0x74 -> :sswitch_1f
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch

    :sswitch_data_c
    .sparse-switch
        0x17 -> :sswitch_24
        0x36 -> :sswitch_25
        0x55 -> :sswitch_29
        0x74 -> :sswitch_26
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0xe -> :sswitch_27
        0x3ef -> :sswitch_28
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0x11 -> :sswitch_2a
        0x32 -> :sswitch_2b
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_2c
        0x32 -> :sswitch_23
    .end sparse-switch
.end method

.method public static final i(Landroid/widget/ImageView;FII)Ljava/lang/Boolean;
    .locals 6

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v0, "\u06e3\u06e7\u06e3"

    invoke-static {v0}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v2

    move v1, v4

    move v0, v4

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :goto_1
    return-object v0

    :sswitch_1
    if-lez p2, :cond_c

    sget v2, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v3, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    rem-int/lit16 v3, v3, -0x22be

    or-int/2addr v2, v3

    if-ltz v2, :cond_0

    const-string v2, "\u06e8\u06e8\u06e4"

    invoke-static {v2}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :cond_0
    const-string v2, "\u06e8\u06e5\u06e4"

    :goto_2
    invoke-static {v2}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :sswitch_2
    sget v0, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    if-ltz v0, :cond_1

    const-string v0, "\u06e5\u06e8\u06e4"

    move-object v2, v0

    move v3, v4

    :goto_3
    invoke-static {v2}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v2

    move v0, v3

    goto :goto_0

    :cond_1
    sget v0, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v2, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sub-int/2addr v0, v2

    const v2, 0xdd72

    add-int/2addr v2, v0

    move v0, v4

    goto :goto_0

    :sswitch_3
    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->۟ۡۥ۟ۨ()I

    move-result v0

    if-ltz v0, :cond_3

    invoke-static {}, Landroidx/startup/ۣۤۦۥ;->۠ۨ۟()I

    move v0, v1

    :cond_2
    const-string v2, "\u06e0\u06e3\u06e2"

    invoke-static {v2}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :cond_3
    const-string v0, "\u06df\u06df"

    move-object v2, v0

    move v3, v1

    :goto_4
    invoke-static {v2}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v2

    move v0, v3

    goto :goto_0

    :sswitch_4
    int-to-float v2, p2

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    div-float v5, v2, v3

    sget v2, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v3, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    mul-int/lit16 v3, v3, -0x25df

    add-int/2addr v2, v3

    if-ltz v2, :cond_4

    invoke-static {}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۣ۟ۦۢ()I

    const-string v2, "\u06df\u06df"

    invoke-static {v2}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :cond_4
    const-string v2, "\u06e2\u06e0\u06df"

    move v3, v0

    goto :goto_3

    :sswitch_5
    const/high16 v2, 0x42aa0000    # 85.0f

    cmpg-float v2, v5, v2

    if-gtz v2, :cond_8

    sget v2, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    if-gtz v2, :cond_2

    const-string v2, "\u06df\u06e3\u06e6"

    move v3, v1

    :goto_5
    invoke-static {v2}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v2

    move v1, v3

    goto/16 :goto_0

    :sswitch_6
    cmpg-float v2, p1, v5

    if-gtz v2, :cond_8

    sget v2, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v3, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    or-int/lit16 v3, v3, 0x2101

    add-int/2addr v2, v3

    if-gtz v2, :cond_5

    const-string v2, "\u06e3\u06e5\u06e3"

    invoke-static {v2}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v2

    goto/16 :goto_0

    :cond_5
    sget v2, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v3, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    add-int/2addr v2, v3

    const v3, 0x1ac676

    add-int/2addr v2, v3

    goto/16 :goto_0

    :sswitch_7
    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v3, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    add-int/lit16 v3, v3, -0x1f79

    mul-int/2addr v2, v3

    if-ltz v2, :cond_6

    const-string v2, "\u06e1\u06e1\u06e8"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v2

    goto/16 :goto_0

    :cond_6
    sget v2, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v3, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    rem-int/2addr v2, v3

    const v3, 0x1ab6ff

    add-int/2addr v2, v3

    goto/16 :goto_0

    :sswitch_8
    const/4 v3, 0x1

    const-string v1, "\u06e0\u06e1\u06e6"

    move-object v2, v1

    goto :goto_5

    :sswitch_9
    if-lez p3, :cond_c

    sget v2, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    if-gtz v2, :cond_7

    invoke-static {}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۣ۟ۦۢ()I

    const-string v2, "\u06e2\u06e0\u06df"

    move v3, v0

    :goto_6
    invoke-static {v2}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v2

    move v0, v3

    goto/16 :goto_0

    :cond_7
    sget v2, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v3, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    rem-int/2addr v2, v3

    const v3, 0x1abbac

    add-int/2addr v2, v3

    goto/16 :goto_0

    :cond_8
    :sswitch_a
    sget v2, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    if-gtz v2, :cond_9

    const-string v2, "\u06e1\u06e7\u06e0"

    move v3, v0

    goto/16 :goto_4

    :cond_9
    sget v2, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v3, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    or-int/2addr v2, v3

    const v3, -0xdb67

    xor-int/2addr v2, v3

    goto/16 :goto_0

    :sswitch_b
    add-int/lit8 v2, p2, 0x15

    sub-int/2addr v2, p3

    add-int/lit8 v2, v2, -0x15

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    const/4 v3, 0x5

    if-gt v2, v3, :cond_b

    sget v2, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v3, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    div-int/2addr v2, v3

    const v3, 0x1ab245

    add-int/2addr v2, v3

    goto/16 :goto_0

    :sswitch_c
    const/4 v0, 0x0

    goto/16 :goto_1

    :sswitch_d
    sget v2, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v3, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    add-int/lit16 v3, v3, 0xf1

    rem-int/2addr v2, v3

    if-ltz v2, :cond_a

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->۟ۡۥۥۣ()I

    const-string v2, "\u06e3\u06e7\u06e3"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v2

    goto/16 :goto_0

    :cond_a
    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v3, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    xor-int/2addr v2, v3

    const v3, 0x1aa468

    add-int/2addr v2, v3

    goto/16 :goto_0

    :sswitch_e
    const-string v0, "\u06e5\u06e8\u06e4"

    move-object v2, v0

    move v3, v4

    goto :goto_6

    :cond_b
    :sswitch_f
    sget v2, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v3, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    xor-int/2addr v2, v3

    const v3, 0x1abbdb

    add-int/2addr v2, v3

    goto/16 :goto_0

    :sswitch_10
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto/16 :goto_1

    :cond_c
    :sswitch_11
    sget v2, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v3, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    xor-int/lit16 v3, v3, -0x23f5

    div-int/2addr v2, v3

    if-eqz v2, :cond_d

    const/16 v2, 0x22

    sput v2, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    const-string v2, "\u06e1\u06e1\u06e4"

    goto/16 :goto_2

    :cond_d
    sget v2, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v3, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    rem-int/2addr v2, v3

    const v3, 0x1ab858

    add-int/2addr v2, v3

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdbe0 -> :sswitch_0
        0xdc9a -> :sswitch_6
        0x1aa782 -> :sswitch_2
        0x1aab05 -> :sswitch_3
        0x1aab3f -> :sswitch_8
        0x1aaec5 -> :sswitch_11
        0x1ab246 -> :sswitch_4
        0x1ab261 -> :sswitch_d
        0x1ab6c1 -> :sswitch_f
        0x1ab6ff -> :sswitch_1
        0x1aba41 -> :sswitch_c
        0x1aba46 -> :sswitch_10
        0x1abd8e -> :sswitch_b
        0x1abea1 -> :sswitch_5
        0x1ac584 -> :sswitch_a
        0x1ac8cf -> :sswitch_e
        0x1ac987 -> :sswitch_9
        0x1ac9e4 -> :sswitch_7
    .end sparse-switch
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 14

    iget v0, p0, Lk9;->a:I

    const-string v1, ""

    const/4 v10, 0x0

    const/4 v9, 0x0

    const/4 v8, 0x0

    const/4 v7, 0x0

    const/4 v6, 0x0

    const/4 v5, 0x0

    const/4 v4, 0x0

    const/4 v3, 0x0

    const/4 v2, 0x0

    const/4 v11, 0x0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    invoke-static {}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۡۦۣۨ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "MQS7t8qPzae3DSKa"

    invoke-static {v0}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟ۦۡۨۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :cond_0
    :goto_0
    return-void

    :pswitch_1
    const-string v0, "4A==\n"

    const-string v1, "kBP3rSCIrog=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_2

    check-cast v0, Ljava/lang/String;

    move-object v1, v0

    :goto_1
    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/lang/Integer;

    if-eqz v2, :cond_47

    check-cast v0, Ljava/lang/Integer;

    :goto_2
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :goto_3
    const-string v2, "bBSMUYxLIY9mA5FRhk0+kXM=\n"

    const-string v3, "B3H1DuokU/g=\n"

    sget-object v4, Lgn;->a:Lgn;

    invoke-static {v2, v3, v4}, Lz30;->q(Ljava/lang/String;Ljava/lang/String;Lgn;)Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v3, "ZXDxig==\n"

    const-string v4, "Nz++3h7jdSs=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "MPiGs6H4y+wl5K/0+LOXhg==\n"

    const-string v3, "RJfK3Nadua8=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "8PKKss0=\n"

    const-string v3, "nJvn27nTYEE=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/16 v1, 0x9

    if-ne v0, v1, :cond_0

    :cond_1
    const/16 v0, 0xc8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    move-object v1, v0

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    goto :goto_3

    :pswitch_2
    const-string v0, "XQ==\n"

    const-string v1, "Lf0swNVWQvM=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "HrUVvU38vGIqvAOBQee2Zhs=\n"

    const-string v1, "ddBs4iCT3wk=\n"

    sget-object v2, Lgn;->a:Lgn;

    invoke-static {v0, v1, v2}, Lz30;->q(Ljava/lang/String;Ljava/lang/String;Lgn;)Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    new-instance v0, Landroid/telephony/gsm/GsmCellLocation;

    invoke-direct {v0}, Landroid/telephony/gsm/GsmCellLocation;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/telephony/gsm/GsmCellLocation;->setLacAndCid(II)V

    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_0

    :pswitch_3
    const-string v0, "xA==\n"

    const-string v1, "tA7hOm14yFg=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "fr7Yil+eThBKt862U4VEFHs=\n"

    const-string v1, "Fduh1TLxLXs=\n"

    sget-object v2, Lgn;->a:Lgn;

    invoke-static {v0, v1, v2}, Lz30;->q(Ljava/lang/String;Ljava/lang/String;Lgn;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/util/List;

    if-eqz v1, :cond_46

    check-cast v0, Ljava/util/List;

    :goto_4
    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-string v1, "aGg1sxL+qR4pMn7vWg==\n"

    const-string v2, "ARxQwXOKxmw=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_4
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_4

    :try_start_1
    const-string v2, "4dNDtjQ=\n"

    const-string v3, "o4AQ/3Ci3O4=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "SKLfurKLt5pCoNWwsoG9mkg=\n"

    const-string v4, "eJDlioKxh6o=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lde/robv/android/xposed/XposedHelpers;->setObjectField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "QhVX80w=\n"

    const-string v3, "LnAhliBiTNY=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/16 v3, -0x63

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lde/robv/android/xposed/XposedHelpers;->setObjectField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_5

    :catchall_1
    move-exception v1

    goto :goto_5

    :pswitch_4
    const-string v0, "HQ==\n"

    const-string v2, "bc5E2gsKx4o=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "kcb4+qYv0FqO/PTM\n"

    const-string v2, "+qOBpcVHtTs=\n"

    sget-object v3, Lgn;->a:Lgn;

    invoke-static {v0, v2, v3}, Lz30;->q(Ljava/lang/String;Ljava/lang/String;Lgn;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "WupDVqFSS1NF0Fdmpl8=\n"

    const-string v2, "MY86CcI6LjI=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lgt;->j(Ljava/lang/String;I)I

    move-result v4

    const-string v0, "uqEOdOo7fDKOqxk=\n"

    const-string v2, "0cR3K45SH1c=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lgt;->i(Ljava/lang/String;)Z

    move-result v0

    const-string v2, "p5hRFSiqSVKjkw==\n"

    const-string v3, "zP0oSlraOg0=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lgt;->i(Ljava/lang/String;)Z

    move-result v2

    if-nez v4, :cond_5

    if-nez v0, :cond_5

    if-nez v2, :cond_5

    sget-object v0, Lq50;->d:Ljava/lang/Integer;

    if-nez v0, :cond_5

    sget-object v0, Lq50;->e:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    :cond_5
    :try_start_2
    sget-object v1, Lgn;->e:Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_e

    :goto_6
    const-string v0, "9nxbw7XTo+M=\n"

    const-string v2, "tRQ6t8G6zYQ=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "E8PYKQ==\n"

    const-string v2, "VKK1TLT87Lw=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "t/kCK3zv/aM=\n"

    const-string v2, "1olySQ6Ok8c=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x1

    invoke-static {v1, v0, v2}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sget-wide v0, Lq50;->c:J

    cmp-long v0, v6, v0

    if-gez v0, :cond_7

    sget-object v0, Lq50;->a:Landroid/util/SparseIntArray;

    const/16 v0, 0x1f4

    int-to-long v0, v0

    const-wide/16 v2, 0x0

    sub-long/2addr v2, v6

    sub-long/2addr v0, v2

    sput-wide v0, Lq50;->c:J

    goto/16 :goto_0

    :cond_7
    new-instance v0, Ljava/lang/Throwable;

    invoke-direct {v0}, Ljava/lang/Throwable;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v5

    array-length v0, v5

    const/16 v1, 0xf

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v8

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v0, v3

    move v1, v3

    :goto_7
    if-ge v2, v8, :cond_e

    aget-object v3, v5, v2

    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v3

    const-string v9, "b9bx60Dc1lFG0ujNBJOLDCE=\n"

    const-string v10, "CLOFqCy9pSI=\n"

    invoke-static {v9, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v3}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v10, "WE6/LQ==\n"

    const-string v11, "CgHweYbKEHo=\n"

    invoke-static {v10, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v9}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v3, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const-string v10, "OgDbf2ew8kUvHPI4PvuuLw==\n"

    const-string v11, "Tm+XEBDVgAY=\n"

    invoke-static {v10, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v3}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    aget-object v10, v5, v2

    invoke-virtual {v10}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v10

    const-string v11, "eeh7GYxbZyJ6w245jAchYzCk\n"

    const-string v12, "Ho0PVOkvD00=\n"

    invoke-static {v11, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v10}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v11, "o/JZUg==\n"

    const-string v12, "8b0WBj59Ifc=\n"

    invoke-static {v11, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v10, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "5xZDNJoPHwfyCmpzw0RDbQ==\n"

    const-string v11, "k3kPW+1qbUQ=\n"

    invoke-static {v10, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v9}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v10, "0lXChh0=\n"

    const-string v11, "pDqr5XjiCTg=\n"

    invoke-static {v10, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    invoke-static {v3, v10, v11}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v10

    if-nez v10, :cond_8

    const-string v10, "7xST/og=\n"

    const-string v11, "jmH3l+fqc5U=\n"

    invoke-static {v10, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    invoke-static {v3, v10, v11}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v10

    if-nez v10, :cond_8

    const-string v10, "fTEWV5RW\n"

    const-string v11, "D1R1OOYyLWY=\n"

    invoke-static {v10, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    invoke-static {v3, v10, v11}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v10

    if-nez v10, :cond_8

    const-string v10, "+oRNH7XU\n"

    const-string v11, "iOEucMewQGs=\n"

    invoke-static {v10, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    invoke-static {v9, v10, v11}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v10

    if-eqz v10, :cond_9

    :cond_8
    sget-object v0, Lq50;->a:Landroid/util/SparseIntArray;

    const-wide/16 v0, 0x0

    const-wide/16 v2, 0x0

    sub-long/2addr v2, v6

    const/16 v4, 0x1f4

    int-to-long v4, v4

    sub-long/2addr v2, v4

    sub-long/2addr v0, v2

    sput-wide v0, Lq50;->c:J

    goto/16 :goto_0

    :cond_9
    const-string v10, "uUSDlC0=\n"

    const-string v11, "3Cns/kQDeNQ=\n"

    invoke-static {v10, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    invoke-static {v3, v10, v11}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v10

    if-nez v10, :cond_a

    const-string v10, "nADZGzpi\n"

    const-string v11, "722wd18bCow=\n"

    invoke-static {v10, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    invoke-static {v3, v10, v11}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v10

    if-nez v10, :cond_a

    const-string v10, "DXqPew==\n"

    const-string v11, "ahviHrluZd0=\n"

    invoke-static {v10, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    invoke-static {v3, v10, v11}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v10

    if-nez v10, :cond_a

    const-string v10, "vVtwyg==\n"

    const-string v11, "2TITr/ZNokc=\n"

    invoke-static {v10, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    invoke-static {v3, v10, v11}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v10

    if-nez v10, :cond_a

    const-string v10, "djmpEw==\n"

    const-string v11, "ElDKdhh4KTw=\n"

    invoke-static {v10, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    invoke-static {v9, v10, v11}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v10

    if-eqz v10, :cond_b

    :cond_a
    const/4 v0, 0x1

    :cond_b
    const-string v10, "Td2alQ==\n"

    const-string v11, "KbT58FxOylA=\n"

    invoke-static {v10, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    invoke-static {v3, v10, v11}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-nez v3, :cond_c

    const-string v3, "5f4FpA==\n"

    const-string v10, "gZdmwXuce/g=\n"

    invoke-static {v3, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v10, 0x0

    invoke-static {v9, v3, v10}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-eqz v3, :cond_d

    :cond_c
    const/4 v1, 0x1

    :cond_d
    rsub-int/lit8 v2, v2, 0x0

    add-int/lit8 v2, v2, -0x1

    rsub-int/lit8 v2, v2, 0x0

    goto/16 :goto_7

    :cond_e
    sget-object v2, Lq50;->d:Ljava/lang/Integer;

    if-eqz v2, :cond_10

    const/4 v0, 0x1

    :goto_8
    const/4 v1, 0x1

    move v2, v1

    move v3, v0

    :goto_9
    if-eqz v2, :cond_0

    if-nez v3, :cond_f

    sget-object v0, Lq50;->d:Ljava/lang/Integer;

    if-nez v0, :cond_f

    const/4 v0, 0x1

    if-ne v4, v0, :cond_11

    sget-object v0, Lq50;->e:Ljava/lang/Integer;

    if-nez v0, :cond_11

    :cond_f
    sget-object v0, Lq50;->d:Ljava/lang/Integer;

    if-eqz v0, :cond_15

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/lit8 v0, v0, -0x19

    add-int/lit8 v0, v0, -0x1

    add-int/lit8 v0, v0, 0x19

    :goto_a
    const/4 v1, 0x5

    invoke-static {v0, v1}, Lgt;->e(II)I

    move-result v0

    int-to-double v0, v0

    const-wide/16 v2, 0x0

    add-double/2addr v0, v2

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    const-wide/16 v2, 0x0

    sub-double/2addr v0, v2

    const-wide/high16 v2, 0x4018000000000000L    # 6.0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_10
    sget-object v2, Lq50;->e:Ljava/lang/Integer;

    if-eqz v2, :cond_3b

    const/4 v0, 0x0

    goto :goto_8

    :cond_11
    sget-object v0, Lq50;->e:Ljava/lang/Integer;

    if-eqz v0, :cond_12

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/lit8 v0, v0, -0x1d

    add-int/lit8 v0, v0, -0x1

    add-int/lit8 v0, v0, 0x1d

    :goto_b
    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    const-wide/16 v4, 0x0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lgt;->e(II)I

    move-result v0

    int-to-double v0, v0

    sub-double v0, v4, v0

    sub-double v0, v2, v0

    const-wide/high16 v2, 0x4008000000000000L    # 3.0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_12
    const/4 v0, 0x1

    if-ne v4, v0, :cond_13

    sget v0, La80;->u:I

    goto :goto_b

    :cond_13
    const-string v0, "d1PoZJwh85ByQ/w=\n"

    const-string v1, "HDaRO+5RgM8=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "aYbW\n"

    const-string v2, "AuOvGSdAksw=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    :try_start_3
    sget-object v1, Lgn;->a:Lgn;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_13

    const/4 v1, 0x1

    :try_start_4
    invoke-static {v0, v1}, Lgn;->b(Ljava/lang/String;I)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    move-result v0

    :goto_c
    rsub-int/lit8 v0, v0, 0x0

    rsub-int/lit8 v0, v0, -0x1

    goto :goto_b

    :catchall_2
    move-exception v1

    :goto_d
    :try_start_5
    sget-object v1, Lgn;->a:Lgn;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lb50;->R(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_14

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    move-result v0

    goto :goto_c

    :catchall_3
    move-exception v0

    :cond_14
    const/4 v0, 0x1

    goto :goto_c

    :cond_15
    const/4 v0, 0x1

    if-ne v4, v0, :cond_16

    sget v0, La80;->t:I

    goto/16 :goto_a

    :cond_16
    const-string v0, "LCV91RuA+5QYLnHn\n"

    const-string v1, "R0AEin/pmPE=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "aYbW\n"

    const-string v2, "AuOvGSdAksw=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    :try_start_6
    sget-object v1, Lgn;->a:Lgn;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_12

    const/4 v1, 0x1

    :try_start_7
    invoke-static {v0, v1}, Lgn;->b(Ljava/lang/String;I)I
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    move-result v0

    :goto_e
    add-int/lit8 v0, v0, 0x1d

    add-int/lit8 v0, v0, -0x1

    add-int/lit8 v0, v0, -0x1d

    goto/16 :goto_a

    :catchall_4
    move-exception v1

    :goto_f
    :try_start_8
    sget-object v1, Lgn;->a:Lgn;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lb50;->R(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_17

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    move-result v0

    goto :goto_e

    :catchall_5
    move-exception v0

    :cond_17
    const/4 v0, 0x1

    goto :goto_e

    :pswitch_5
    const-string v0, "Wg==\n"

    const-string v1, "Klemh81GfNk=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    const-string v1, "mD7RRZR6XTaYJMkJ1nwcO5c4yQnAdhw2mSWQR8F1UHiCMs1MlHJTLJoi0wf9d0g=\n"

    const-string v2, "9ku9KbQZPFg=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v0, 0x6

    if-eq v1, v0, :cond_18

    const/4 v0, 0x5

    if-eq v1, v0, :cond_18

    const/4 v0, 0x3

    if-eq v1, v0, :cond_18

    const/4 v0, 0x2

    if-ne v1, v0, :cond_0

    :cond_18
    const-string v0, "ecz8TKSka8lm9vB6\n"

    const-string v2, "EqmFE8fMDqg=\n"

    sget-object v3, Lgn;->a:Lgn;

    invoke-static {v0, v2, v3}, Lz30;->q(Ljava/lang/String;Ljava/lang/String;Lgn;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "kUzDNIo4Y52OdtcEjTU=\n"

    const-string v2, "+im6a+lQBvw=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lgt;->j(Ljava/lang/String;I)I

    move-result v2

    const-string v0, "Cvnp75RaLR0+8/4=\n"

    const-string v3, "YZyQsPAzTng=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lgt;->i(Ljava/lang/String;)Z

    move-result v3

    const-string v0, "WTneI+EAt69dMg==\n"

    const-string v4, "MlynfJNwxPA=\n"

    invoke-static {v0, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lgt;->i(Ljava/lang/String;)Z

    move-result v4

    if-nez v2, :cond_19

    if-nez v3, :cond_19

    if-nez v4, :cond_19

    sget-object v0, Lq50;->d:Ljava/lang/Integer;

    if-nez v0, :cond_19

    sget-object v0, Lq50;->e:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    :cond_19
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sget-wide v8, Lq50;->c:J

    cmp-long v0, v6, v8

    if-gez v0, :cond_1a

    sget-object v0, Lq50;->a:Landroid/util/SparseIntArray;

    const/16 v0, 0x1f4

    int-to-long v0, v0

    const-wide/16 v2, 0x0

    sub-long/2addr v2, v6

    sub-long/2addr v0, v2

    sput-wide v0, Lq50;->c:J

    goto/16 :goto_0

    :cond_1a
    new-instance v0, Ljava/lang/Throwable;

    invoke-direct {v0}, Ljava/lang/Throwable;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v5

    array-length v0, v5

    const/16 v8, 0xf

    invoke-static {v0, v8}, Ljava/lang/Math;->min(II)I

    move-result v8

    const/4 v0, 0x0

    :goto_10
    if-ge v0, v8, :cond_1d

    aget-object v9, v5, v0

    invoke-virtual {v9}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v9

    const-string v10, "zoNNv5yfWvPnh1SZ2NAHroA=\n"

    const-string v11, "qeY5/PD+KYA=\n"

    invoke-static {v10, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v9}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v10, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v11, "1rEBcA==\n"

    const-string v12, "hP5OJLcOug0=\n"

    invoke-static {v11, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v10}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v9, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    const-string v11, "TzqeW3iJmJVaJrccIcLE/w==\n"

    const-string v12, "O1XSNA/s6tY=\n"

    invoke-static {v11, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v9}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    aget-object v11, v5, v0

    invoke-virtual {v11}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v11

    const-string v12, "NV8IUSl8zEQ2dB1xKSCKBXwT\n"

    const-string v13, "Ujp8HEwIpCs=\n"

    invoke-static {v12, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v11}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v12, "igczFg==\n"

    const-string v13, "2Eh8QjooGjo=\n"

    invoke-static {v12, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v11, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v10

    const-string v11, "vyNMAPeltbaqP2VHru7p3A==\n"

    const-string v12, "y0wAb4DAx/U=\n"

    invoke-static {v11, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v10}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v11, "N6gV6Qs=\n"

    const-string v12, "Qcd8im6RKjk=\n"

    invoke-static {v11, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x0

    invoke-static {v9, v11, v12}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v11

    if-nez v11, :cond_1b

    const-string v11, "ADnRZes=\n"

    const-string v12, "YUy1DIRt4p4=\n"

    invoke-static {v11, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x0

    invoke-static {v9, v11, v12}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v11

    if-nez v11, :cond_1b

    const-string v11, "bKBztEdK\n"

    const-string v12, "HsUQ2zUuIqs=\n"

    invoke-static {v11, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x0

    invoke-static {v9, v11, v12}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_1b

    const-string v9, "AnJ7YsFS\n"

    const-string v11, "cBcYDbM2Wlg=\n"

    invoke-static {v9, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const/4 v11, 0x0

    invoke-static {v10, v9, v11}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-eqz v9, :cond_1c

    :cond_1b
    sget-object v0, Lq50;->a:Landroid/util/SparseIntArray;

    const-wide/16 v0, 0xc

    add-long/2addr v0, v6

    const/16 v2, 0x1f4

    int-to-long v2, v2

    add-long/2addr v0, v2

    const-wide/16 v2, 0xc

    sub-long/2addr v0, v2

    sput-wide v0, Lq50;->c:J

    goto/16 :goto_0

    :cond_1c
    add-int/lit8 v0, v0, 0x19

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v0, v0, -0x19

    goto/16 :goto_10

    :cond_1d
    const/4 v0, 0x2

    if-eq v1, v0, :cond_23

    const/4 v0, 0x3

    if-eq v1, v0, :cond_23

    const/4 v0, 0x5

    if-eq v1, v0, :cond_1e

    const/4 v0, 0x6

    if-ne v1, v0, :cond_0

    :cond_1e
    sget-object v0, Lq50;->d:Ljava/lang/Integer;

    if-eqz v0, :cond_1f

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :goto_11
    add-int/lit8 v0, v0, -0xd

    add-int/lit8 v0, v0, -0x1

    add-int/lit8 v0, v0, 0xd

    :goto_12
    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    add-int/lit8 v1, v1, 0x5

    add-int/lit8 v1, v1, -0x1

    add-int/lit8 v1, v1, -0x5

    invoke-static {v0, v1}, Lgt;->e(II)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_1f
    const/4 v0, 0x1

    if-ne v2, v0, :cond_20

    sget v0, La80;->t:I

    goto :goto_12

    :cond_20
    if-eqz v3, :cond_22

    const-string v0, "2B1TxXL+DqzsFl/3\n"

    const-string v2, "s3gqmhaXbck=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "aYbW\n"

    const-string v3, "AuOvGSdAksw=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    :try_start_9
    sget-object v2, Lgn;->a:Lgn;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_11

    const/4 v2, 0x1

    :try_start_a
    invoke-static {v0, v2}, Lgn;->b(Ljava/lang/String;I)I
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    move-result v0

    goto :goto_11

    :catchall_6
    move-exception v2

    :goto_13
    :try_start_b
    sget-object v2, Lgn;->a:Lgn;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lb50;->R(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_21

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    move-result v0

    goto :goto_11

    :catchall_7
    move-exception v0

    :cond_21
    const/4 v0, 0x1

    goto :goto_11

    :cond_22
    const/4 v0, -0x1

    goto :goto_12

    :cond_23
    sget-object v0, Lq50;->e:Ljava/lang/Integer;

    if-eqz v0, :cond_24

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/lit8 v0, v0, 0x10

    add-int/lit8 v0, v0, -0x1

    add-int/lit8 v0, v0, -0x10

    :goto_14
    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    rsub-int/lit8 v1, v1, 0x0

    add-int/lit8 v1, v1, 0x1

    rsub-int/lit8 v1, v1, 0x0

    invoke-static {v0, v1}, Lgt;->e(II)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_24
    const/4 v0, 0x1

    if-ne v2, v0, :cond_25

    sget v0, La80;->u:I

    goto :goto_14

    :cond_25
    if-eqz v4, :cond_27

    const-string v0, "Uaip3AgC+1JUuL0=\n"

    const-string v2, "Os3Qg3pyiA0=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "aYbW\n"

    const-string v3, "AuOvGSdAksw=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    :try_start_c
    sget-object v2, Lgn;->a:Lgn;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_10

    const/4 v2, 0x1

    :try_start_d
    invoke-static {v0, v2}, Lgn;->b(Ljava/lang/String;I)I
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    move-result v0

    :goto_15
    add-int/lit8 v0, v0, -0x1

    goto :goto_14

    :catchall_8
    move-exception v2

    :goto_16
    :try_start_e
    sget-object v2, Lgn;->a:Lgn;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lb50;->R(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_26

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_9

    move-result v0

    goto :goto_15

    :catchall_9
    move-exception v0

    :cond_26
    const/4 v0, 0x1

    goto :goto_15

    :cond_27
    const/4 v0, -0x1

    goto :goto_14

    :pswitch_6
    const-string v0, "Gw==\n"

    const-string v1, "azgQ3e5y3gU=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_45

    check-cast v0, Ljava/lang/String;

    :goto_17
    if-eqz v0, :cond_0

    const-string v1, "Ea84Ye0hFrglpTNX6z0MiBOnJg==\n"

    const-string v2, "espBPoxUYtc=\n"

    sget-object v3, Lgn;->a:Lgn;

    invoke-static {v1, v2, v3}, Lz30;->q(Ljava/lang/String;Ljava/lang/String;Lgn;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "L8EQVIhBq58DzRNX\n"

    const-string v2, "XKR+MNczyug=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-nez v1, :cond_28

    const-string v1, "nYYv\n"

    const-string v2, "7+dYpFvA4xk=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_28
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    goto/16 :goto_0

    :pswitch_7
    const-string v0, "oNHuhtY=\n"

    const-string v1, "0LCc57uHa1k=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    instance-of v1, v0, Landroid/widget/EditText;

    if-eqz v1, :cond_0

    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x2

    if-lt v2, v3, :cond_0

    sget-object v2, Lgn;->a:Lgn;

    const-string v3, "+q0cu9Rxya70vDqByWDYpc6rCoDC\n"

    const-string v4, "kchl5KcUqtw=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "g8aUu+w=\n"

    const-string v5, "oKHx3odqh0k=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v4}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-wide/16 v4, 0x3

    sub-long v4, v2, v4

    sget-wide v6, Lct;->a:J

    sub-long/2addr v4, v6

    const-wide/16 v6, 0x3

    add-long/2addr v4, v6

    const-wide/16 v6, 0x3e8

    cmp-long v1, v4, v6

    if-ltz v1, :cond_0

    sput-wide v2, Lct;->a:J

    check-cast v0, Landroid/widget/EditText;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    instance-of v2, v1, Landroid/app/Activity;

    if-eqz v2, :cond_44

    check-cast v1, Landroid/app/Activity;

    :goto_18
    if-eqz v1, :cond_0

    const/4 v2, 0x1

    invoke-static {v0, v2}, Lgn;->i(Landroid/view/View;I)V

    sget-object v0, Lt6;->a:Ljava/lang/String;

    sget-object v0, Ls20;->a:Ls20;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Ls20;->a(Landroid/app/Activity;)V

    goto/16 :goto_0

    :pswitch_8
    const-string v0, "4c90H2w=\n"

    const-string v1, "ka4GfgGqYzE=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    sget-object v0, Lbz;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkx;

    if-eqz v0, :cond_0

    iget-object v1, v0, Lkx;->a:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v0, v0, Lkx;->b:Ljava/lang/Object;

    check-cast v0, Lsm;

    :try_start_f
    sget-object v3, Lpb0;->x:Ljava/lang/String;

    invoke-static {v2, v3}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    sget-object v3, Lpb0;->y:Ljava/lang/String;

    invoke-static {v2, v3}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_43

    check-cast v2, Ljava/lang/String;

    :goto_19
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_29

    invoke-static {v2}, Lb50;->D(Ljava/lang/CharSequence;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v2

    sget-object v3, Lgn;->a:Lgn;

    const-string v4, "qKJ4pakUuPWcqWCXvi6p66ahaII=\n"

    const-string v5, "w8cB+ttx2Zk=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "WBpD\n"

    const-string v6, "varMEy4YObY=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, v5}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "real_name_"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lgn;->h(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v1, Ld9;->b:Landroid/os/Handler;

    new-instance v3, Lt5;

    const/16 v4, 0x8

    invoke-direct {v3, v0, v4, v2}, Lt5;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v1, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto/16 :goto_0

    :catch_0
    move-exception v0

    goto/16 :goto_0

    :cond_29
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v1, "Char sequence is empty."

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_0

    :pswitch_9
    const-string v0, "FA==\n"

    const-string v1, "ZFPzWwRIz/Q=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    instance-of v1, v0, Landroid/widget/ImageView;

    if-eqz v1, :cond_2a

    check-cast v0, Landroid/widget/ImageView;

    move-object v1, v0

    :goto_1a
    if-eqz v1, :cond_0

    const-string v0, "G2ES5Sk6T50UYQ/lOiNbhxF2\n"

    const-string v2, "cARrultVOvM=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "ggWA\n"

    const-string v3, "6WD5BmkcYhM=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    :try_start_10
    sget-object v2, Lgn;->a:Lgn;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lgn;->e(Ljava/lang/String;)Z
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_a

    move-result v0

    :goto_1b
    if-eqz v0, :cond_0

    const/high16 v0, 0x7e0b0000

    invoke-virtual {v1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v2}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ldy;->h:Lay;

    if-eqz v0, :cond_0

    invoke-virtual {v1, v0}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroid/view/View;->setClipToOutline(Z)V

    invoke-virtual {v1}, Landroid/view/View;->invalidateOutline()V

    goto/16 :goto_0

    :cond_2a
    const/4 v0, 0x0

    move-object v1, v0

    goto :goto_1a

    :catchall_a
    move-exception v2

    :try_start_11
    sget-object v2, Lgn;->a:Lgn;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "true"

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2b

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :goto_1c
    if-eqz v0, :cond_2c

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_1b

    :cond_2b
    const-string v2, "false"

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_42

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_b

    goto :goto_1c

    :catchall_b
    move-exception v0

    :cond_2c
    const/4 v0, 0x0

    goto :goto_1b

    :pswitch_a
    const-string v0, "AzHCyE8=\n"

    const-string v1, "c1CwqSK+qUI=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    const-string v1, "W9RWycul8o9bzk6FiaOzglTSToWfqbOPWs8Xy56q/8FB2ErAy6f9hUfOU8HFp+ORG+BZ0YKw+pVM\n"

    const-string v2, "NaE6pevGk+E=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    const-string v2, "Hy9dEG0qOOMfNUVcLyx57hApRVw5JnnjHjQcEjglNa0FI0EZbSg36QM1WBhjPzDoBnRnFSg+Hv8e\nL0E=\n"

    const-string v3, "cVoxfE1JWY0=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v2

    new-instance v3, Lqs;

    invoke-direct {v3, v1, p0, v0}, Lqs;-><init>(Landroid/view/ViewGroup;Lk9;Landroid/app/Activity;)V

    invoke-virtual {v2, v3}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    goto/16 :goto_0

    :pswitch_b
    const-string v0, "MDU6Qdk=\n"

    const-string v2, "QFRIILSX8DQ=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v2, 0x0

    aget-object v0, v0, v2

    instance-of v2, v0, Ljava/lang/String;

    if-eqz v2, :cond_30

    check-cast v0, Ljava/lang/String;

    :goto_1d
    if-eqz v0, :cond_0

    const-string v2, "A9JWLgnfPw==\n"

    const-string v3, "brclXWi4WoE=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v3, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const-string v0, "x1JL4Q==\n"

    const-string v2, "piAsksk06Jk=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    array-length v4, v3

    const/4 v0, 0x0

    move v2, v0

    :goto_1e
    if-ge v2, v4, :cond_32

    aget-object v0, v3, v2

    instance-of v6, v0, Landroid/content/ContentValues;

    if-eqz v6, :cond_31

    :goto_1f
    instance-of v2, v0, Landroid/content/ContentValues;

    if-eqz v2, :cond_33

    check-cast v0, Landroid/content/ContentValues;

    move-object v4, v0

    :goto_20
    if-eqz v4, :cond_0

    const-string v0, "WV7fdg==\n"

    const-string v2, "LSevE3FxUHc=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_34

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :goto_21
    const/16 v2, 0x31

    if-eq v0, v2, :cond_2d

    const v2, 0x1a000031

    if-ne v0, v2, :cond_0

    :cond_2d
    const-string v0, "St2KP4JY\n"

    const-string v2, "PrzmVOcqy5o=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2e

    const-string v0, ""

    :cond_2e
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_2f

    sget-object v0, Lhs;->a:Lhs;

    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    const-string v2, "gNN/lwGMZR6Xzw==\n"

    const-string v3, "9LsW5E7uD3s=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "+9kTyDowy+8=\n"

    const-string v3, "j7h/o19Cgos=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    if-eqz v2, :cond_35

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    :goto_22
    const-wide/16 v6, 0x0

    cmp-long v6, v2, v6

    if-gtz v6, :cond_36

    move-object v0, v1

    :cond_2f
    :goto_23
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1, v4}, Landroid/content/ContentValues;-><init>(Landroid/content/ContentValues;)V

    const-string v2, "wJh8vfB8\n"

    const-string v3, "tPkQ1pUOd1I=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lhs;->a:Lhs;

    invoke-static {v1}, Lhs;->b(Landroid/content/ContentValues;)V

    goto/16 :goto_0

    :cond_30
    const/4 v0, 0x0

    goto/16 :goto_1d

    :cond_31
    add-int/lit8 v0, v2, -0x1e

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v0, v0, 0x1e

    move v2, v0

    goto/16 :goto_1e

    :cond_32
    const/4 v0, 0x0

    goto/16 :goto_1f

    :cond_33
    const/4 v0, 0x0

    move-object v4, v0

    goto/16 :goto_20

    :cond_34
    const/4 v0, 0x0

    goto :goto_21

    :cond_35
    const-wide/16 v2, 0x0

    goto :goto_22

    :cond_36
    :try_start_12
    const-string v6, "u7ArR9W/0b4=\n"

    const-string v7, "ydFcFqDao8c=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    const-string v9, "tg50vcNfwoaWLkqW4WaH06MZd7WgeYGciz9Zm/QrtbugGX3Y8mSVmoFrBdi/\n"

    const-string v10, "5Us4+IAL4vM=\n"

    invoke-static {v9, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    aput-object v9, v7, v8

    const/4 v8, 0x1

    const/4 v9, 0x1

    new-array v9, v9, [Ljava/lang/String;

    const/4 v10, 0x0

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v9, v10

    aput-object v9, v7, v8

    invoke-static {v0, v6, v7}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_41

    const-string v0, "zuRVGWbh6tvR+Fc=\n"

    const-string v3, "o4sjfDKOrLI=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v2, v0, v3}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v3, v0, Ljava/lang/Boolean;

    if-eqz v3, :cond_38

    check-cast v0, Ljava/lang/Boolean;

    :goto_24
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v3}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_40

    const-string v0, "FtIlwqS8DP8W\n"

    const-string v3, "cbdRkdDOZZE=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v3, v6

    invoke-static {v2, v0, v3}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v3, v0, Ljava/lang/String;

    if-eqz v3, :cond_3f

    check-cast v0, Ljava/lang/String;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_f

    :goto_25
    if-nez v0, :cond_37

    move-object v0, v1

    :cond_37
    :goto_26
    :try_start_13
    const-string v1, "F454kTQ=\n"

    const-string v3, "dOIX4lERLik=\n"

    invoke-static {v1, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v2, v1, v3}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_c

    goto/16 :goto_23

    :catchall_c
    move-exception v1

    goto/16 :goto_23

    :cond_38
    const/4 v0, 0x0

    goto :goto_24

    :pswitch_c
    const-string v0, "UcWnZ8M=\n"

    const-string v1, "IaTVBq5+Ax4=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "eddIlfAN3g9r\n"

    const-string v1, "ErIxypx4vWQ=\n"

    sget-object v2, Lgn;->a:Lgn;

    invoke-static {v0, v1, v2}, Lz30;->q(Ljava/lang/String;Ljava/lang/String;Lgn;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "NjaNqnxxM8IkDJmadGE=\n"

    const-string v1, "XVP09RAEUKk=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lgn;->b(Ljava/lang/String;I)I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_3e

    check-cast v0, Landroid/app/Activity;

    :goto_27
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const-string v1, "zDJEXINz+CP9PlVvzj65f4I=\n"

    const-string v2, "q1cwGOYQl1E=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v1, Lgs;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lgs;-><init>(Landroid/view/View;I)V

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    new-instance v1, Lgs;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Lgs;-><init>(Landroid/view/View;I)V

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    goto/16 :goto_0

    :pswitch_d
    const-string v0, "Ye5kdcA=\n"

    const-string v1, "EY8WFK0fWhM=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_3a

    check-cast v0, Landroid/view/ViewGroup;

    :goto_28
    if-eqz v0, :cond_0

    const/high16 v1, 0x7e060000

    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Le9;

    if-eqz v1, :cond_3d

    check-cast v0, Le9;

    :goto_29
    if-eqz v0, :cond_0

    iget-object v0, v0, Le9;->h:Lf9;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    const-string v1, "jDfhKVo+usOMLfllGDj7zoMx+WUOMvvDjSygKw8xt42WO/0gWjy1yZAt5CFUK7LIlWzAKg40tMOn\nNOgrDg==\n"

    const-string v2, "4kKNRXpd260=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v0, Landroid/view/MotionEvent;

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v1

    if-eqz v1, :cond_39

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    :cond_39
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_3a
    const/4 v0, 0x0

    goto :goto_28

    :pswitch_e
    const-string v0, "elF7ZYQ=\n"

    const-string v1, "CjAJBOmjlG8=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    :try_start_14
    sget-object v0, Lff;->z:Ljava/lang/String;

    const-string v1, "5kx4l0XHQF3ldg==\n"

    const-string v3, "gSkd/BqhLzE=\n"

    invoke-static {v1, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    invoke-static {v0, v1, v3}, Lb50;->N(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lgn;->a:Lgn;

    const-string v3, "key_geek_folder_name_"

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "hSrv/WMTP9TkS9OfKTJtiMkU\n"

    const-string v4, "ba1FGM2J220=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v3}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    const-string v3, "K80AoiK9qkU0zQ==\n"

    const-string v4, "WKh072/pwzE=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    invoke-static {v1, v3, v4}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    const-string v1, "n5FpmKXa6A==\n"

    const-string v3, "+PQdzsy/n40=\n"

    invoke-static {v1, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v0, v1, v3}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Landroid/view/View;

    if-eqz v1, :cond_3c

    check-cast v0, Landroid/view/View;

    :goto_2a
    if-eqz v0, :cond_0

    invoke-static {v0}, Lvd;->b(Landroid/view/View;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_d

    goto/16 :goto_0

    :catchall_d
    move-exception v0

    const-string v0, "Nwje\n"

    const-string v1, "Q2m5jaPP2Zc=\n"

    const-string v2, "mb0HqbNQksSwuTSfg2qvxro=\n"

    const-string v3, "39JrzeYZ2qs=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Fg==\n"

    const-string v4, "c8HJlSTQVfc=\n"

    invoke-static {v0, v1, v2, v3, v4}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    :pswitch_f
    const-string v0, "dg==\n"

    const-string v1, "Bg0NHDsJzxo=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v0, Lgn;->a:Lgn;

    const-string v1, "sgH31pwd\n"

    const-string v2, "8WmWoslUoB0=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lj9;

    const/4 v3, 0x1

    invoke-direct {v2, p1, v3}, Lj9;-><init>(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;I)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2}, Lgn;->j(Ljava/lang/String;Lhm;)V

    goto/16 :goto_0

    :catchall_e
    move-exception v0

    goto/16 :goto_6

    :catchall_f
    move-exception v0

    move-object v0, v1

    goto/16 :goto_23

    :catchall_10
    move-exception v2

    goto/16 :goto_16

    :catchall_11
    move-exception v2

    goto/16 :goto_13

    :catchall_12
    move-exception v1

    goto/16 :goto_f

    :catchall_13
    move-exception v1

    goto/16 :goto_d

    :cond_3b
    move v2, v0

    move v3, v1

    goto/16 :goto_9

    :cond_3c
    move-object v0, v2

    goto :goto_2a

    :cond_3d
    move-object v0, v3

    goto/16 :goto_29

    :cond_3e
    move-object v0, v4

    goto/16 :goto_27

    :cond_3f
    move-object v0, v5

    goto/16 :goto_25

    :cond_40
    move-object v0, v1

    goto/16 :goto_26

    :cond_41
    move-object v0, v1

    goto/16 :goto_23

    :cond_42
    move-object v0, v6

    goto/16 :goto_1c

    :cond_43
    move-object v2, v7

    goto/16 :goto_19

    :cond_44
    move-object v1, v8

    goto/16 :goto_18

    :cond_45
    move-object v0, v9

    goto/16 :goto_17

    :cond_46
    move-object v0, v10

    goto/16 :goto_4

    :cond_47
    move-object v0, v11

    goto/16 :goto_2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_0
        :pswitch_0
        :pswitch_e
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 15

    iget v2, p0, Lk9;->a:I

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    packed-switch v2, :pswitch_data_0

    :pswitch_0
    invoke-super/range {p0 .. p1}, Lde/robv/android/xposed/XC_MethodHook;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    :goto_0
    :sswitch_0
    return-void

    :pswitch_1
    invoke-direct/range {p0 .. p1}, Lk9;->h(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    goto :goto_0

    :pswitch_2
    invoke-direct/range {p0 .. p1}, Lk9;->g(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    goto :goto_0

    :pswitch_3
    invoke-direct/range {p0 .. p1}, Lk9;->f(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    invoke-static {}, Lۣ۟ۢ۠۠;->۠۟ۥ۠()I

    move-result v3

    const/16 v2, 0x650

    :goto_1
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_1

    :cond_0
    :sswitch_1
    const/16 v2, 0x68e

    goto :goto_1

    :sswitch_2
    if-gtz v3, :cond_0

    const/16 v2, 0x6ad

    goto :goto_1

    :sswitch_3
    const-string v2, "tl86BhfhpGOJXQCeNbbqKvWyp"

    invoke-static {v2}, L۠ۡۢۨ;->۠ۨۡ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v3, v2}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_4
    invoke-direct/range {p0 .. p1}, Lk9;->e(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    goto :goto_0

    :pswitch_5
    invoke-direct/range {p0 .. p1}, Lk9;->d(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    goto :goto_0

    :pswitch_6
    invoke-direct/range {p0 .. p1}, Lk9;->c(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    goto :goto_0

    :pswitch_7
    invoke-direct/range {p0 .. p1}, Lk9;->b(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    goto :goto_0

    :pswitch_8
    const-string v2, "IA==\n"

    const-string v4, "UCdJ/Dw8hBA=\n"

    invoke-static {v2, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p1

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v0, p1

    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v4, 0x0

    aget-object v2, v2, v4

    instance-of v5, v2, Ljava/lang/String;

    const/16 v4, 0x6cc

    :goto_2
    xor-int/lit16 v4, v4, 0x6dd

    sparse-switch v4, :sswitch_data_1

    goto :goto_2

    :sswitch_4
    if-eqz v5, :cond_1

    const/16 v4, 0x729

    goto :goto_2

    :cond_1
    :sswitch_5
    const/16 v4, 0x70a

    goto :goto_2

    :sswitch_6
    check-cast v2, Ljava/lang/String;

    const/16 v4, 0x748

    :goto_3
    xor-int/lit16 v4, v4, 0x759

    sparse-switch v4, :sswitch_data_2

    goto :goto_3

    :sswitch_7
    const v4, 0xbe22

    goto :goto_3

    :sswitch_8
    const/4 v2, 0x0

    :sswitch_9
    const v4, 0xbe7f

    :goto_4
    const v5, 0xbe90

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_3

    goto :goto_4

    :cond_2
    :sswitch_a
    const v4, 0xbebd

    goto :goto_4

    :sswitch_b
    if-eqz v2, :cond_2

    const v4, 0xbedc

    goto :goto_4

    :sswitch_c
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v5, "x0Ving==\n"

    const-string v6, "lQotymmHBys=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v4}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v2, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    const-string v2, "MgZwgBzqiMonGlnHRaHUoA==\n"

    const-string v4, "Rmk872uP+ok=\n"

    invoke-static {v2, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v5}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v0, p1

    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v4, 0x1

    aget-object v2, v2, v4

    instance-of v6, v2, Landroid/content/ContentValues;

    const v4, 0xbefb

    :goto_5
    const v7, 0xbf0c

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_4

    goto :goto_5

    :cond_3
    :sswitch_d
    const v4, 0xbf39

    goto :goto_5

    :sswitch_e
    if-eqz v6, :cond_3

    const v4, 0xc1e3

    goto :goto_5

    :sswitch_f
    check-cast v2, Landroid/content/ContentValues;

    :goto_6
    const v3, 0xc202

    :goto_7
    const v4, 0xc213

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_5

    goto :goto_7

    :sswitch_10
    if-nez v2, :cond_4

    const v3, 0xc25f

    goto :goto_7

    :cond_4
    :sswitch_11
    const v3, 0xc240

    goto :goto_7

    :sswitch_12
    const v2, 0xc27e

    :goto_8
    const v3, 0xc28f

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_6

    goto :goto_8

    :sswitch_13
    const v2, 0xc29d

    goto :goto_8

    :sswitch_14
    sget-object v3, Lgn;->a:Lgn;

    const-string v4, "T3aj0rnRN29uRJ4=\n"

    const-string v6, "CzTqvM20RQw=\n"

    invoke-static {v4, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v6, Liv;

    const/4 v7, 0x1

    move-object/from16 v0, p1

    invoke-direct {v6, v5, v2, v0, v7}, Liv;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, v6}, Lgn;->j(Ljava/lang/String;Lhm;)V

    goto/16 :goto_0

    :pswitch_9
    const-string v2, "pA==\n"

    const-string v3, "1H27dKFryNY=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p1

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v3, Luv;->b:Ljava/lang/Object;

    const v2, 0xc2fa

    :goto_9
    const v6, 0xc30b

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_7

    goto :goto_9

    :sswitch_15
    if-nez v3, :cond_5

    const v2, 0xc5e2

    goto :goto_9

    :cond_5
    :sswitch_16
    const v2, 0xc5c3

    goto :goto_9

    :sswitch_17
    move-object/from16 v0, p1

    iget-object v7, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const-string v2, "Cje67w==\n"

    const-string v3, "a0XdnDpvxVU=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v7}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    array-length v8, v7

    const/4 v2, 0x0

    :pswitch_a
    const v3, 0xc601

    :goto_a
    const v6, 0xc612

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_8

    goto :goto_a

    :sswitch_18
    if-ge v2, v8, :cond_6

    const v3, 0xc65e

    goto :goto_a

    :cond_6
    :sswitch_19
    const v3, 0xc63f

    goto :goto_a

    :sswitch_1a
    aget-object v3, v7, v2

    instance-of v9, v3, Ljava/lang/String;

    const v6, 0xc67d

    :goto_b
    const v10, 0xc68e

    xor-int/2addr v6, v10

    sparse-switch v6, :sswitch_data_9

    goto :goto_b

    :cond_7
    :sswitch_1b
    const v6, 0xc6bb

    goto :goto_b

    :sswitch_1c
    if-eqz v9, :cond_7

    const v6, 0xc965

    goto :goto_b

    :sswitch_1d
    const v2, 0xc984

    :goto_c
    const v6, 0xc995

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_a

    goto :goto_c

    :sswitch_1e
    const v2, 0xc9a3

    goto :goto_c

    :sswitch_1f
    move-object v2, v3

    :goto_d
    instance-of v6, v2, Ljava/lang/String;

    const v3, 0xca7c

    :goto_e
    const v7, 0xca8d

    xor-int/2addr v3, v7

    sparse-switch v3, :sswitch_data_b

    goto :goto_e

    :sswitch_20
    if-eqz v6, :cond_8

    const v3, 0xcd64

    goto :goto_e

    :sswitch_21
    add-int/lit8 v2, v2, 0x1

    const v3, 0xca00

    :goto_f
    const v6, 0xca11

    xor-int/2addr v3, v6

    packed-switch v3, :pswitch_data_1

    :pswitch_b
    goto :goto_f

    :pswitch_c
    const v3, 0xca1f

    goto :goto_f

    :sswitch_22
    const/4 v2, 0x0

    goto :goto_d

    :cond_8
    :sswitch_23
    const v3, 0xcd45

    goto :goto_e

    :sswitch_24
    check-cast v2, Ljava/lang/String;

    :goto_10
    const v3, 0xcd83

    :goto_11
    const v4, 0xcd94

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_c

    goto :goto_11

    :sswitch_25
    if-nez v2, :cond_9

    const v3, 0xcde0

    goto :goto_11

    :cond_9
    :sswitch_26
    const v3, 0xcdc1

    goto :goto_11

    :sswitch_27
    const v2, 0xcdff

    :goto_12
    const v3, 0xce10

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_d

    goto :goto_12

    :sswitch_28
    const v2, 0xce1e

    goto :goto_12

    :sswitch_29
    const-string v3, "TK6aBX1B+g==\n"

    const-string v4, "Icvpdhwmn5w=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v2, v3, v4}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    const v3, 0xd106

    :goto_13
    const v6, 0xd117

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_e

    goto :goto_13

    :sswitch_2a
    if-nez v4, :cond_a

    const v3, 0xd163

    goto :goto_13

    :cond_a
    :sswitch_2b
    const v3, 0xd144

    goto :goto_13

    :sswitch_2c
    const-string v3, "FF8ayxxCoB8sQyfNAWI=\n"

    const-string v4, "QjBzqHkW0n4=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v2, v3, v4}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    const v3, 0xd182

    :goto_14
    const v6, 0xd193

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_f

    goto :goto_14

    :sswitch_2d
    if-nez v4, :cond_b

    const v3, 0xd1df

    goto :goto_14

    :cond_b
    :sswitch_2e
    const v3, 0xd1c0

    goto :goto_14

    :sswitch_2f
    const-string v3, "6PoFvNVDa0c=\n"

    const-string v4, "mplq0qEiCDM=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v2, v3, v4}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    const v2, 0xd1fe

    :goto_15
    const v4, 0xd20f

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_10

    goto :goto_15

    :sswitch_30
    if-eqz v3, :cond_c

    const v2, 0xd4e6

    goto :goto_15

    :cond_c
    :sswitch_31
    const v2, 0xd4c7

    goto :goto_15

    :sswitch_32
    sget-object v2, Luv;->a:Landroid/os/Handler;

    move-object/from16 v0, p1

    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    sput-object v2, Luv;->b:Ljava/lang/Object;

    const-string v2, "LmFUrtdbI5Ih\n"

    const-string v3, "YwQn3bY8RtY=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "AgP5D9BaJctqAJqnnDo7mcDIP2t08lCAfnvCpNluOctnGZmLsTshrgYw/cadSlyMcb80QFm5lcpb\nOpWovDQhkAYf28e1b1auYg==\n"

    const-string v4, "4J98LzbStS4=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "xwGO\n"

    const-string v6, "s2Dpd1+FjZU=\n"

    const-string v7, "53vj\n"

    const-string v8, "igiEy7e+YPk=\n"

    invoke-static {v4, v6, v2, v7, v8}, Lz30;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v4, Ljv;->a:Ljava/util/ArrayList;

    monitor-enter v4

    :try_start_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v6

    move v3, v5

    :sswitch_33
    const v2, 0xd505

    :goto_16
    const v5, 0xd516

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_11

    goto :goto_16

    :sswitch_34
    if-ge v3, v6, :cond_d

    const v2, 0xd562

    goto :goto_16

    :cond_d
    :sswitch_35
    const v2, 0xd543

    goto :goto_16

    :sswitch_36
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    rsub-int/lit8 v3, v3, 0x0

    rsub-int/lit8 v3, v3, 0x1

    check-cast v2, Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v2}, Lde/robv/android/xposed/XC_MethodHook$Unhook;->unhook()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_8

    const v2, 0xd581

    :goto_17
    const v5, 0xd592

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_12

    goto :goto_17

    :sswitch_37
    const v2, 0xd5a0

    goto :goto_17

    :catchall_0
    move-exception v2

    const v3, 0xd888

    :goto_18
    const v5, 0xd899

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_13

    goto :goto_18

    :sswitch_38
    const v3, 0xd8a7

    goto :goto_18

    :sswitch_39
    :try_start_2
    sget-object v2, Ljv;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v4

    const v2, 0xd904

    :goto_19
    const v3, 0xd915

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_14

    goto :goto_19

    :sswitch_3a
    const v2, 0xd923

    goto :goto_19

    :sswitch_3b
    monitor-exit v4

    throw v2

    :pswitch_d
    const-string v2, "XQ==\n"

    const-string v3, "Le/uiacavWg=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p1

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v0, p1

    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    instance-of v4, v2, Ljava/lang/String;

    const v3, 0xd980

    :goto_1a
    const v5, 0xd991

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_15

    goto :goto_1a

    :sswitch_3c
    if-eqz v4, :cond_e

    const v3, 0xdc68

    goto :goto_1a

    :cond_e
    :sswitch_3d
    const v3, 0xdc49

    goto :goto_1a

    :sswitch_3e
    check-cast v2, Ljava/lang/String;

    const v3, 0xdc87

    :goto_1b
    const v4, 0xdc98

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_16

    goto :goto_1b

    :sswitch_3f
    const v3, 0xdca6

    goto :goto_1b

    :sswitch_40
    const/4 v2, 0x0

    :sswitch_41
    const v3, 0xdd03

    :goto_1c
    const v4, 0xdd14

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_17

    goto :goto_1c

    :sswitch_42
    if-eqz v2, :cond_f

    const v3, 0x170090

    goto :goto_1c

    :cond_f
    :sswitch_43
    const v3, 0xdd41

    goto :goto_1c

    :sswitch_44
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v4, "NiYCgw==\n"

    const-string v5, "ZGlN1/G6Slo=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v3}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    const-string v2, "Q3S6OjmZfK1WaJN9YNIgxw==\n"

    const-string v3, "Nxv2VU78Du4=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v4}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v0, p1

    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v3, 0x2

    aget-object v2, v2, v3

    instance-of v5, v2, Landroid/content/ContentValues;

    const v3, 0x1700af

    :goto_1d
    const v7, 0x1700c0

    xor-int/2addr v3, v7

    sparse-switch v3, :sswitch_data_18

    goto :goto_1d

    :cond_10
    :sswitch_45
    const v3, 0x1700ed

    goto :goto_1d

    :sswitch_46
    if-eqz v5, :cond_10

    const v3, 0x17010c

    goto :goto_1d

    :sswitch_47
    check-cast v2, Landroid/content/ContentValues;

    :goto_1e
    const v3, 0x17012b

    :goto_1f
    const v5, 0x17013c

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_19

    goto :goto_1f

    :sswitch_48
    if-nez v2, :cond_11

    const v3, 0x170188

    goto :goto_1f

    :cond_11
    :sswitch_49
    const v3, 0x170169

    goto :goto_1f

    :sswitch_4a
    const v2, 0x1701a7

    :goto_20
    const v3, 0x1701b8

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_1a

    goto :goto_20

    :sswitch_4b
    const v2, 0x170451

    goto :goto_20

    :sswitch_4c
    const-string v3, "a0bauEywnA==\n"

    const-string v5, "BiOpyy3X+Uw=\n"

    invoke-static {v3, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    const v3, 0x1704ae

    :goto_21
    const v6, 0x1704bf

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_1b

    goto :goto_21

    :sswitch_4d
    if-nez v5, :cond_12

    const v3, 0x17050b

    goto :goto_21

    :cond_12
    :sswitch_4e
    const v3, 0x1704ec

    goto :goto_21

    :sswitch_4f
    const-string v3, "0Fkatec/vhg=\n"

    const-string v5, "ojp125Ne3Ww=\n"

    invoke-static {v3, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    const v3, 0x17052a

    :goto_22
    const v6, 0x17053b

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_1c

    goto :goto_22

    :sswitch_50
    if-eqz v5, :cond_13

    const v3, 0x170812

    goto :goto_22

    :cond_13
    :sswitch_51
    const v3, 0x170568

    goto :goto_22

    :sswitch_52
    sget-object v5, Luv;->b:Ljava/lang/Object;

    const v3, 0x170831

    :goto_23
    const v6, 0x170842

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_1d

    goto :goto_23

    :cond_14
    :sswitch_53
    const v3, 0x17086f

    goto :goto_23

    :sswitch_54
    if-nez v5, :cond_14

    const v3, 0x17088e

    goto :goto_23

    :sswitch_55
    move-object/from16 v0, p1

    iget-object v3, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    sput-object v3, Luv;->b:Ljava/lang/Object;

    :sswitch_56
    sget-object v3, Lgn;->a:Lgn;

    const-string v5, "vQSwEQSWjVWcNo0=\n"

    const-string v6, "+Ub5f3Dz/zY=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Liv;

    const/4 v7, 0x0

    move-object/from16 v0, p1

    invoke-direct {v6, v4, v2, v0, v7}, Liv;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5, v6}, Lgn;->j(Ljava/lang/String;Lhm;)V

    goto/16 :goto_0

    :pswitch_e
    const-string v2, "1Q==\n"

    const-string v3, "pavEZsLgCUA=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p1

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v0, p1

    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    instance-of v4, v2, Ljava/lang/String;

    const v3, 0x1708ad

    :goto_24
    const v5, 0x1708be

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_1e

    goto :goto_24

    :sswitch_57
    if-eqz v4, :cond_15

    const v3, 0x17090a

    goto :goto_24

    :cond_15
    :sswitch_58
    const v3, 0x1708eb

    goto :goto_24

    :sswitch_59
    check-cast v2, Ljava/lang/String;

    :goto_25
    const v3, 0x170929

    :goto_26
    const v4, 0x17093a

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_1f

    goto :goto_26

    :sswitch_5a
    if-eqz v2, :cond_16

    const v3, 0x170c11

    goto :goto_26

    :cond_16
    :sswitch_5b
    const v3, 0x170bf2

    goto :goto_26

    :sswitch_5c
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v4, "99vgYw==\n"

    const-string v5, "pZSvN0YnLEY=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v3}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "vKX/GzGkhySpudZcaO/bTg==\n"

    const-string v4, "yMqzdEbB9Wc=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v3, Lgn;->a:Lgn;

    const-string v4, "GC4Ahx4AKAo5HD0=\n"

    const-string v5, "XGxJ6WplWmk=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lhv;

    const/4 v6, 0x0

    move-object/from16 v0, p1

    invoke-direct {v5, v2, v6, v0}, Lhv;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, v5}, Lgn;->j(Ljava/lang/String;Lhm;)V

    goto/16 :goto_0

    :pswitch_f
    const-string v2, "U7HX/iQ=\n"

    const-string v3, "I9Cln0mG8K0=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p1

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v0, p1

    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    instance-of v4, v2, Landroid/view/ViewGroup;

    const v3, 0x170c30

    :goto_27
    const v5, 0x170c41

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_20

    goto :goto_27

    :cond_17
    :sswitch_5d
    const v3, 0x170c6e

    goto :goto_27

    :sswitch_5e
    if-eqz v4, :cond_17

    const v3, 0x170c8d

    goto :goto_27

    :sswitch_5f
    check-cast v2, Landroid/view/ViewGroup;

    const v3, 0x170cac

    :goto_28
    const v4, 0x170cbd

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_21

    goto :goto_28

    :sswitch_60
    const v3, 0x170ccb

    goto :goto_28

    :sswitch_61
    const/4 v2, 0x0

    :sswitch_62
    const v3, 0x170fb3

    :goto_29
    const v4, 0x170fc4

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_22

    goto :goto_29

    :cond_18
    :sswitch_63
    const v3, 0x170ff1

    goto :goto_29

    :sswitch_64
    if-nez v2, :cond_18

    const v3, 0x171010

    goto :goto_29

    :sswitch_65
    const v2, 0x17102f

    :goto_2a
    const v3, 0x171040

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_23

    goto :goto_2a

    :sswitch_66
    const v2, 0x17104e

    goto :goto_2a

    :sswitch_67
    const/high16 v3, 0x7e060000

    invoke-virtual {v2, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v3

    instance-of v5, v3, Le9;

    const v4, 0x1710ab

    :goto_2b
    const v6, 0x1710bc

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_24

    goto :goto_2b

    :sswitch_68
    if-eqz v5, :cond_19

    const v4, 0x171393

    goto :goto_2b

    :cond_19
    :sswitch_69
    const v4, 0x171374

    goto :goto_2b

    :sswitch_6a
    check-cast v3, Le9;

    const v4, 0x1713b2

    :goto_2c
    const v5, 0x1713c3

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_25

    goto :goto_2c

    :goto_2d
    :sswitch_6b
    const v4, 0x17142e

    :goto_2e
    const v5, 0x17143f

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_26

    goto :goto_2e

    :sswitch_6c
    if-nez v3, :cond_1a

    const v4, 0x171716

    goto :goto_2e

    :sswitch_6d
    const v4, 0x1713d1

    goto :goto_2c

    :sswitch_6e
    const/4 v3, 0x0

    goto :goto_2d

    :cond_1a
    :sswitch_6f
    const v4, 0x17146c

    goto :goto_2e

    :sswitch_70
    const v2, 0x171735

    :goto_2f
    const v3, 0x171746

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_27

    goto :goto_2f

    :sswitch_71
    const v2, 0x171754

    goto :goto_2f

    :sswitch_72
    iget-object v6, v3, Le9;->h:Lf9;

    const v4, 0x1717b1

    :goto_30
    const v5, 0x1717c2

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_28

    goto :goto_30

    :cond_1b
    :sswitch_73
    const v4, 0x1717ef

    goto :goto_30

    :sswitch_74
    if-nez v6, :cond_1b

    const v4, 0x17180e

    goto :goto_30

    :sswitch_75
    const v2, 0x17182d

    :goto_31
    const v3, 0x17183e

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_29

    goto :goto_31

    :sswitch_76
    const v2, 0x171ad7

    goto :goto_31

    :sswitch_77
    move-object/from16 v0, p1

    iget-object v4, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v5, 0x0

    aget-object v5, v4, v5

    const-string v4, "OQsmwWuKTJE5ET6NKYwNnDYNPo0/hg2ROBBnwz6FQd8jBzrIa4hDmyURI8lln0SaIFAHwj+AQpES\nCC/DPw==\n"

    const-string v7, "V35KrUvpLf8=\n"

    invoke-static {v4, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v5}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v5, Landroid/view/MotionEvent;

    iget-object v4, v3, Le9;->g:Lg9;

    invoke-virtual {v5}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v9

    const v7, 0x171b34

    :goto_32
    const v10, 0x171b45

    xor-int/2addr v7, v10

    sparse-switch v7, :sswitch_data_2a

    goto :goto_32

    :cond_1c
    :sswitch_78
    const v7, 0x171b72

    goto :goto_32

    :sswitch_79
    if-eqz v9, :cond_1c

    const v7, 0x171b91

    goto :goto_32

    :sswitch_7a
    const v7, 0x171bb0

    :goto_33
    const v8, 0x171bc1

    xor-int/2addr v7, v8

    sparse-switch v7, :sswitch_data_2b

    goto :goto_33

    :cond_1d
    :sswitch_7b
    const v7, 0x171bee

    goto :goto_33

    :sswitch_7c
    const/4 v7, 0x1

    if-eq v9, v7, :cond_1d

    const v7, 0x171e98

    goto :goto_33

    :sswitch_7d
    const v7, 0x171eb7

    :goto_34
    const v8, 0x171ec8

    xor-int/2addr v7, v8

    sparse-switch v7, :sswitch_data_2c

    goto :goto_34

    :cond_1e
    :sswitch_7e
    const v7, 0x171ef5

    goto :goto_34

    :sswitch_7f
    const/4 v7, 0x2

    if-eq v9, v7, :cond_1e

    const v7, 0x171f14

    goto :goto_34

    :sswitch_80
    const v7, 0x171f33

    :goto_35
    const v8, 0x171f44

    xor-int/2addr v7, v8

    sparse-switch v7, :sswitch_data_2d

    goto :goto_35

    :cond_1f
    :sswitch_81
    const v7, 0x171f71

    goto :goto_35

    :sswitch_82
    const/4 v7, 0x3

    if-eq v9, v7, :cond_1f

    const v7, 0x171f90

    goto :goto_35

    :sswitch_83
    const v2, 0x171faf

    :goto_36
    const v3, 0x171fc0

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_2e

    goto :goto_36

    :sswitch_84
    const v2, 0x172259

    goto :goto_36

    :sswitch_85
    const/4 v8, 0x1

    move-object/from16 v7, p1

    invoke-static/range {v2 .. v8}, Lvh;->b(Landroid/view/ViewGroup;Le9;Lg9;Landroid/view/MotionEvent;Lf9;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Z)V

    const v2, 0x1722b6

    :goto_37
    const v3, 0x1722c7

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_2f

    goto :goto_37

    :sswitch_86
    const v2, 0x1722d5

    goto :goto_37

    :sswitch_87
    invoke-virtual {v5}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v7

    const v6, 0x172332

    :goto_38
    const v8, 0x172343

    xor-int/2addr v6, v8

    sparse-switch v6, :sswitch_data_30

    goto :goto_38

    :cond_20
    :sswitch_88
    const v6, 0x172370

    goto :goto_38

    :sswitch_89
    const/4 v6, 0x1

    if-le v7, v6, :cond_20

    const v6, 0x1774ef

    goto :goto_38

    :sswitch_8a
    const v2, 0x17750e

    :goto_39
    const v3, 0x17751f

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_31

    goto :goto_39

    :sswitch_8b
    const v2, 0x17752d

    goto :goto_39

    :sswitch_8c
    invoke-virtual {v5}, Landroid/view/MotionEvent;->getRawX()F

    move-result v6

    const/high16 v7, 0x40000000    # 2.0f

    add-float/2addr v6, v7

    iget v7, v4, Lg9;->a:F

    sub-float/2addr v6, v7

    const/high16 v7, 0x40000000    # 2.0f

    sub-float v14, v6, v7

    invoke-virtual {v5}, Landroid/view/MotionEvent;->getRawY()F

    move-result v8

    iget v9, v4, Lg9;->b:F

    const v6, 0x7e040005

    invoke-virtual {v2, v6}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v6

    instance-of v10, v6, Landroid/view/VelocityTracker;

    const v7, 0x17758a

    :goto_3a
    const v11, 0x17759b

    xor-int/2addr v7, v11

    sparse-switch v7, :sswitch_data_32

    goto :goto_3a

    :sswitch_8d
    if-eqz v10, :cond_21

    const v7, 0x1775e7

    goto :goto_3a

    :cond_21
    :sswitch_8e
    const v7, 0x1775c8

    goto :goto_3a

    :sswitch_8f
    check-cast v6, Landroid/view/VelocityTracker;

    const v7, 0x177606

    :goto_3b
    const v10, 0x177617

    xor-int/2addr v7, v10

    sparse-switch v7, :sswitch_data_33

    goto :goto_3b

    :sswitch_90
    const v7, 0x1778b0

    goto :goto_3b

    :sswitch_91
    const/4 v6, 0x0

    :sswitch_92
    const v7, 0x17790d

    :goto_3c
    const v10, 0x17791e

    xor-int/2addr v7, v10

    sparse-switch v7, :sswitch_data_34

    goto :goto_3c

    :sswitch_93
    if-eqz v6, :cond_22

    const v7, 0x17796a

    goto :goto_3c

    :cond_22
    :sswitch_94
    const v7, 0x17794b

    goto :goto_3c

    :sswitch_95
    invoke-virtual {v6, v5}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    :sswitch_96
    iget-boolean v7, v4, Lg9;->c:Z

    const v6, 0x177989

    :goto_3d
    const v10, 0x17799a

    xor-int/2addr v6, v10

    sparse-switch v6, :sswitch_data_35

    goto :goto_3d

    :sswitch_97
    if-nez v7, :cond_23

    const v6, 0x177c71

    goto :goto_3d

    :cond_23
    :sswitch_98
    const v6, 0x1779c7

    goto :goto_3d

    :sswitch_99
    invoke-static {v14}, Ljava/lang/Math;->abs(F)F

    move-result v7

    sget v10, Lvh;->e:F

    const v6, 0x177c90

    :goto_3e
    const v11, 0x177ca1

    xor-int/2addr v6, v11

    sparse-switch v6, :sswitch_data_36

    goto :goto_3e

    :cond_24
    :sswitch_9a
    const v6, 0x177cce

    goto :goto_3e

    :sswitch_9b
    cmpl-float v6, v7, v10

    if-lez v6, :cond_24

    const v6, 0x177ced

    goto :goto_3e

    :sswitch_9c
    invoke-static {v14}, Ljava/lang/Math;->abs(F)F

    move-result v7

    const/high16 v6, 0x41f00000    # 30.0f

    add-float/2addr v6, v8

    sub-float/2addr v6, v9

    const/high16 v8, 0x41f00000    # 30.0f

    sub-float/2addr v6, v8

    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v8

    const v6, 0x177d0c

    :goto_3f
    const v9, 0x177d1d

    xor-int/2addr v6, v9

    sparse-switch v6, :sswitch_data_37

    goto :goto_3f

    :sswitch_9d
    const/high16 v6, 0x40200000    # 2.5f

    mul-float/2addr v6, v8

    cmpl-float v6, v7, v6

    if-lez v6, :cond_25

    const v6, 0x177d69

    goto :goto_3f

    :cond_25
    :sswitch_9e
    const v6, 0x177d4a

    goto :goto_3f

    :sswitch_9f
    const/4 v6, 0x1

    iput-boolean v6, v4, Lg9;->c:Z

    const/4 v6, 0x2

    const/4 v7, 0x0

    invoke-virtual {v2, v6, v7}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v7

    const v6, 0x177d88

    :goto_40
    const v8, 0x177d99

    xor-int/2addr v6, v8

    sparse-switch v6, :sswitch_data_38

    goto :goto_40

    :sswitch_a0
    if-eqz v7, :cond_26

    const v6, 0x178070

    goto :goto_40

    :cond_26
    :sswitch_a1
    const v6, 0x178051

    goto :goto_40

    :sswitch_a2
    const/4 v6, 0x1

    invoke-interface {v7, v6}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :sswitch_a3
    invoke-virtual {v5}, Landroid/view/MotionEvent;->getDownTime()J

    move-result-wide v6

    invoke-virtual {v5}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v8

    const/4 v10, 0x3

    invoke-virtual {v5}, Landroid/view/MotionEvent;->getX()F

    move-result v11

    invoke-virtual {v5}, Landroid/view/MotionEvent;->getY()F

    move-result v12

    invoke-virtual {v5}, Landroid/view/MotionEvent;->getMetaState()I

    move-result v13

    invoke-static/range {v6 .. v13}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v6

    :try_start_3
    move-object/from16 v0, p1

    iget-object v5, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->method:Ljava/lang/reflect/Member;

    move-object/from16 v0, p1

    iget-object v7, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    const/4 v8, 0x1

    new-array v8, v8, [Landroid/view/MotionEvent;

    const/4 v9, 0x0

    aput-object v6, v8, v9

    invoke-static {v5, v7, v8}, Lde/robv/android/xposed/XposedBridge;->invokeOriginalMethod(Ljava/lang/reflect/Member;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    const v5, 0x17808f

    :goto_41
    const v7, 0x1780a0

    xor-int/2addr v5, v7

    sparse-switch v5, :sswitch_data_39

    goto :goto_41

    :goto_42
    :sswitch_a4
    invoke-virtual {v6}, Landroid/view/MotionEvent;->recycle()V

    const v5, 0x17810b

    :goto_43
    const v6, 0x17811c

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_3a

    goto :goto_43

    :sswitch_a5
    const v5, 0x17812a

    goto :goto_43

    :sswitch_a6
    const v5, 0x1780ae

    goto :goto_41

    :catchall_1
    move-exception v5

    const-string v5, "Nwje\n"

    const-string v7, "Q2m5jaPP2Zc=\n"

    const-string v8, "+Sfq4hOgGNHRLfLJJbMT+tsu3OA=\n"

    const-string v9, "vkKZlmbSfZk=\n"

    invoke-static {v8, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "Fg==\n"

    const-string v10, "c8HJlSTQVfc=\n"

    invoke-static {v5, v7, v8, v9, v10}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_42

    :sswitch_a7
    iget-boolean v6, v4, Lg9;->c:Z

    const v5, 0x178412

    :goto_44
    const v7, 0x178423

    xor-int/2addr v5, v7

    sparse-switch v5, :sswitch_data_3b

    goto :goto_44

    :cond_27
    :sswitch_a8
    const v5, 0x178450

    goto :goto_44

    :sswitch_a9
    if-eqz v6, :cond_27

    const v5, 0x17846f

    goto :goto_44

    :sswitch_aa
    sget v5, Lvh;->d:F

    const v6, 0x469c4000    # 20000.0f

    mul-float/2addr v5, v6

    invoke-virtual {v2, v5}, Landroid/view/View;->setCameraDistance(F)V

    invoke-static {v14}, Ljava/lang/Math;->abs(F)F

    move-result v5

    sget v6, Lvh;->g:F

    const/high16 v7, 0x3f800000    # 1.0f

    const/high16 v8, 0x3f800000    # 1.0f

    const/4 v9, 0x0

    div-float/2addr v5, v6

    const v10, 0x3f4ccccd    # 0.8f

    mul-float/2addr v5, v10

    sub-float v5, v9, v5

    sub-float v5, v8, v5

    div-float v5, v7, v5

    invoke-static {v14}, Ljava/lang/Math;->signum(F)F

    move-result v7

    const/high16 v8, 0x3f800000    # 1.0f

    const/high16 v9, 0x41c80000    # 25.0f

    sub-float/2addr v8, v9

    sub-float v5, v8, v5

    const/high16 v8, 0x41c80000    # 25.0f

    add-float/2addr v5, v8

    mul-float/2addr v5, v6

    mul-float v6, v7, v5

    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v5

    sget v7, Lvh;->g:F

    div-float/2addr v5, v7

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v5, v7}, Ljava/lang/Math;->min(FF)F

    move-result v7

    sget v5, Lac;->n:I

    int-to-float v5, v5

    const/high16 v8, 0x42c80000    # 100.0f

    div-float v8, v5, v8

    sget v9, Lac;->m:I

    const v5, 0x17848e

    :goto_45
    const v10, 0x17849f

    xor-int/2addr v5, v10

    sparse-switch v5, :sswitch_data_3c

    goto :goto_45

    :sswitch_ab
    if-eqz v9, :cond_28

    const v5, 0x1784eb

    goto :goto_45

    :cond_28
    :sswitch_ac
    const v5, 0x1784cc

    goto :goto_45

    :sswitch_ad
    const v5, 0x17850a

    :goto_46
    const v10, 0x17851b

    xor-int/2addr v5, v10

    sparse-switch v5, :sswitch_data_3d

    goto :goto_46

    :sswitch_ae
    const/4 v5, 0x1

    if-eq v9, v5, :cond_29

    const v5, 0x1787f2

    goto :goto_46

    :cond_29
    :sswitch_af
    const v5, 0x1787d3

    goto :goto_46

    :sswitch_b0
    const v5, 0x178811

    :goto_47
    const v10, 0x178822

    xor-int/2addr v5, v10

    sparse-switch v5, :sswitch_data_3e

    goto :goto_47

    :cond_2a
    :sswitch_b1
    const v5, 0x17884f

    goto :goto_47

    :sswitch_b2
    const/4 v5, 0x2

    if-eq v9, v5, :cond_2a

    const v5, 0x17886e

    goto :goto_47

    :sswitch_b3
    const v5, 0x17888d

    :goto_48
    const v10, 0x17889e

    xor-int/2addr v5, v10

    sparse-switch v5, :sswitch_data_3f

    goto :goto_48

    :sswitch_b4
    const/4 v5, 0x3

    if-eq v9, v5, :cond_2b

    const v5, 0x178b75

    goto :goto_48

    :cond_2b
    :sswitch_b5
    const v5, 0x1788cb

    goto :goto_48

    :sswitch_b6
    const v3, 0x178b94

    :goto_49
    const v5, 0x178ba5

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_40

    goto :goto_49

    :cond_2c
    :sswitch_b7
    const v3, 0x178bd2

    goto :goto_49

    :sswitch_b8
    const/4 v3, 0x4

    if-eq v9, v3, :cond_2c

    const v3, 0x178bf1

    goto :goto_49

    :sswitch_b9
    const v3, 0x178c10

    :goto_4a
    const v5, 0x178c21

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_41

    goto :goto_4a

    :goto_4b
    :sswitch_ba
    iget-boolean v5, v4, Lg9;->e:Z

    const v3, 0x17940e

    :goto_4c
    const v6, 0x17941f

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_42

    goto :goto_4c

    :sswitch_bb
    if-nez v5, :cond_2e

    const v3, 0x1796f6

    goto :goto_4c

    :sswitch_bc
    const v3, 0x178c2f

    goto :goto_4a

    :sswitch_bd
    const v3, 0x3f4ccccd    # 0.8f

    mul-float/2addr v3, v6

    mul-float/2addr v3, v8

    invoke-virtual {v2, v3}, Landroid/view/View;->setTranslationX(F)V

    const/high16 v3, 0x41700000    # 15.0f

    mul-float/2addr v3, v7

    mul-float/2addr v3, v8

    neg-float v3, v3

    invoke-virtual {v2, v3}, Landroid/view/View;->setTranslationY(F)V

    const/4 v3, 0x0

    const/4 v5, 0x0

    const v6, 0x3dcccccd    # 0.1f

    mul-float/2addr v6, v7

    mul-float/2addr v6, v8

    sub-float/2addr v5, v6

    const/high16 v6, 0x3f800000    # 1.0f

    sub-float/2addr v5, v6

    sub-float/2addr v3, v5

    invoke-virtual {v2, v3}, Landroid/view/View;->setScaleX(F)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setScaleY(F)V

    const v3, 0x178c8c

    :goto_4d
    const v5, 0x178c9d

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_43

    goto :goto_4d

    :sswitch_be
    const v3, 0x178f36

    goto :goto_4d

    :sswitch_bf
    const v5, 0x3f666666    # 0.9f

    mul-float/2addr v5, v6

    mul-float/2addr v5, v8

    invoke-virtual {v2, v5}, Landroid/view/View;->setTranslationX(F)V

    const/high16 v5, 0x42480000    # 50.0f

    mul-float/2addr v5, v7

    mul-float/2addr v5, v8

    neg-float v5, v5

    invoke-virtual {v2, v5}, Landroid/view/View;->setTranslationY(F)V

    mul-float v5, v6, v8

    const/high16 v6, 0x42700000    # 60.0f

    div-float/2addr v5, v6

    invoke-virtual {v2, v5}, Landroid/view/View;->setRotation(F)V

    iget-object v5, v3, Le9;->e:Landroid/view/View;

    const v3, 0x178f93

    :goto_4e
    const v6, 0x178fa4

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_44

    goto :goto_4e

    :cond_2d
    :sswitch_c0
    const v3, 0x178fd1

    goto :goto_4e

    :sswitch_c1
    if-eqz v5, :cond_2d

    const v3, 0x178ff0

    goto :goto_4e

    :sswitch_c2
    const v3, 0x3e19999a    # 0.15f

    const/high16 v6, 0x3f800000    # 1.0f

    const/high16 v9, 0x41b00000    # 22.0f

    add-float/2addr v6, v9

    const/high16 v9, 0x40200000    # 2.5f

    mul-float/2addr v7, v9

    mul-float/2addr v7, v8

    sub-float/2addr v6, v7

    const/high16 v7, 0x41b00000    # 22.0f

    sub-float/2addr v6, v7

    invoke-static {v3, v6}, Ljava/lang/Math;->max(FF)F

    move-result v3

    invoke-virtual {v5, v3}, Landroid/view/View;->setAlpha(F)V

    const v3, 0x17900f

    :goto_4f
    const v5, 0x179020

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_45

    goto :goto_4f

    :sswitch_c3
    const v3, 0x17902e

    goto :goto_4f

    :sswitch_c4
    const v3, 0x3f59999a    # 0.85f

    mul-float/2addr v3, v6

    mul-float/2addr v3, v8

    invoke-virtual {v2, v3}, Landroid/view/View;->setTranslationX(F)V

    const/high16 v3, 0x41c80000    # 25.0f

    mul-float/2addr v3, v7

    mul-float/2addr v3, v8

    neg-float v3, v3

    invoke-virtual {v2, v3}, Landroid/view/View;->setRotationX(F)V

    invoke-static {v14}, Ljava/lang/Math;->signum(F)F

    move-result v3

    const/high16 v5, 0x420c0000    # 35.0f

    mul-float/2addr v5, v7

    mul-float/2addr v3, v5

    mul-float/2addr v3, v8

    invoke-virtual {v2, v3}, Landroid/view/View;->setRotationY(F)V

    const/high16 v3, 0x3f800000    # 1.0f

    const/high16 v5, 0x40400000    # 3.0f

    sub-float/2addr v3, v5

    const v5, 0x3df5c28f    # 0.12f

    mul-float/2addr v5, v7

    mul-float/2addr v5, v8

    sub-float/2addr v3, v5

    const/high16 v5, 0x40400000    # 3.0f

    add-float/2addr v3, v5

    invoke-virtual {v2, v3}, Landroid/view/View;->setScaleX(F)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setScaleY(F)V

    const/high16 v3, 0x43160000    # 150.0f

    mul-float/2addr v3, v7

    mul-float/2addr v3, v8

    invoke-virtual {v2, v3}, Landroid/view/View;->setTranslationZ(F)V

    const v3, 0x179316

    :goto_50
    const v5, 0x179327

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_46

    goto :goto_50

    :sswitch_c5
    const v3, 0x179335

    goto :goto_50

    :sswitch_c6
    const v3, 0x3f933333    # 1.15f

    mul-float/2addr v3, v6

    mul-float/2addr v3, v8

    invoke-virtual {v2, v3}, Landroid/view/View;->setTranslationX(F)V

    mul-float v3, v6, v8

    const/high16 v5, 0x41f00000    # 30.0f

    div-float/2addr v3, v5

    invoke-virtual {v2, v3}, Landroid/view/View;->setRotation(F)V

    const v3, 0x3eb33333    # 0.35f

    mul-float/2addr v3, v7

    mul-float/2addr v3, v8

    const/4 v5, 0x0

    add-float/2addr v3, v5

    const/high16 v5, 0x3f800000    # 1.0f

    add-float/2addr v3, v5

    const/4 v5, 0x0

    sub-float/2addr v3, v5

    invoke-virtual {v2, v3}, Landroid/view/View;->setScaleX(F)V

    const/high16 v3, 0x3f800000    # 1.0f

    const/high16 v5, 0x41b00000    # 22.0f

    add-float/2addr v3, v5

    const/high16 v5, 0x3e800000    # 0.25f

    mul-float/2addr v5, v7

    mul-float/2addr v5, v8

    sub-float/2addr v3, v5

    const/high16 v5, 0x41b00000    # 22.0f

    sub-float/2addr v3, v5

    invoke-virtual {v2, v3}, Landroid/view/View;->setScaleY(F)V

    const v3, 0x179392

    :goto_51
    const v5, 0x1793a3

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_47

    goto :goto_51

    :sswitch_c7
    const v3, 0x1793b1

    goto :goto_51

    :sswitch_c8
    const/high16 v3, 0x3f000000    # 0.5f

    mul-float/2addr v3, v6

    mul-float/2addr v3, v8

    invoke-virtual {v2, v3}, Landroid/view/View;->setTranslationX(F)V

    goto/16 :goto_4b

    :cond_2e
    :sswitch_c9
    const v3, 0x1796d7

    goto/16 :goto_4c

    :sswitch_ca
    invoke-static {v14}, Ljava/lang/Math;->abs(F)F

    move-result v5

    sget v6, Lvh;->f:F

    const v3, 0x179715

    :goto_52
    const v7, 0x179726

    xor-int/2addr v3, v7

    sparse-switch v3, :sswitch_data_48

    goto :goto_52

    :cond_2f
    :sswitch_cb
    const v3, 0x179753

    goto :goto_52

    :sswitch_cc
    cmpl-float v3, v5, v6

    if-lez v3, :cond_2f

    const v3, 0x179772

    goto :goto_52

    :sswitch_cd
    const/4 v3, 0x1

    iput-boolean v3, v4, Lg9;->e:Z

    sget-object v3, Lgn;->a:Lgn;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x4

    invoke-static {v2, v3}, Lgn;->i(Landroid/view/View;I)V

    const v2, 0x179791

    :goto_53
    const v3, 0x1797a2

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_49

    goto :goto_53

    :goto_54
    :sswitch_ce
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    const v2, 0x17ea65

    :goto_55
    const v3, 0x17ea76

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_4a

    goto :goto_55

    :sswitch_cf
    const v2, 0x17ed0f

    goto :goto_55

    :sswitch_d0
    const v2, 0x1797b0

    goto :goto_53

    :sswitch_d1
    iget-boolean v3, v4, Lg9;->e:Z

    const v2, 0x17e96d

    :goto_56
    const v5, 0x17e97e

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_4b

    goto :goto_56

    :sswitch_d2
    if-eqz v3, :cond_30

    const v2, 0x17e9ca

    goto :goto_56

    :cond_30
    :sswitch_d3
    const v2, 0x17e9ab

    goto :goto_56

    :sswitch_d4
    invoke-static {v14}, Ljava/lang/Math;->abs(F)F

    move-result v3

    sget v5, Lvh;->f:F

    const v2, 0x17e9e9

    :goto_57
    const v6, 0x17e9fa

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_4c

    goto :goto_57

    :sswitch_d5
    cmpg-float v2, v3, v5

    if-gtz v2, :cond_31

    const v2, 0x17ea46

    goto :goto_57

    :cond_31
    :sswitch_d6
    const v2, 0x17ea27

    goto :goto_57

    :sswitch_d7
    const/4 v2, 0x0

    iput-boolean v2, v4, Lg9;->e:Z

    goto :goto_54

    :sswitch_d8
    const/4 v8, 0x0

    move-object/from16 v7, p1

    invoke-static/range {v2 .. v8}, Lvh;->b(Landroid/view/ViewGroup;Le9;Lg9;Landroid/view/MotionEvent;Lf9;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Z)V

    const v2, 0x17ed6c

    :goto_58
    const v3, 0x17ed7d

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_4d

    goto :goto_58

    :sswitch_d9
    const v2, 0x17ed8b

    goto :goto_58

    :sswitch_da
    invoke-virtual {v5}, Landroid/view/MotionEvent;->getRawX()F

    move-result v3

    iput v3, v4, Lg9;->a:F

    invoke-virtual {v5}, Landroid/view/MotionEvent;->getRawY()F

    move-result v3

    iput v3, v4, Lg9;->b:F

    const/4 v3, 0x0

    iput-boolean v3, v4, Lg9;->c:Z

    const/4 v3, 0x0

    iput-boolean v3, v4, Lg9;->d:Z

    const/4 v3, 0x0

    iput-boolean v3, v4, Lg9;->e:Z

    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v3, v3

    sput v3, Lvh;->g:F

    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    sput v3, Lvh;->d:F

    const/high16 v4, 0x41c00000    # 24.0f

    mul-float/2addr v4, v3

    sput v4, Lvh;->e:F

    const/high16 v4, 0x42b40000    # 90.0f

    mul-float/2addr v3, v4

    sput v3, Lvh;->f:F

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    instance-of v6, v3, Landroid/view/ViewGroup;

    const v4, 0x17ede8

    :goto_59
    const v7, 0x17edf9

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_4e

    goto :goto_59

    :sswitch_db
    if-eqz v6, :cond_32

    const v4, 0x17f0d0

    goto :goto_59

    :cond_32
    :sswitch_dc
    const v4, 0x17ee26

    goto :goto_59

    :sswitch_dd
    check-cast v3, Landroid/view/ViewGroup;

    const v4, 0x17f0ef

    :goto_5a
    const v6, 0x17f100

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_4f

    goto :goto_5a

    :goto_5b
    :sswitch_de
    const v4, 0x17f16b

    :goto_5c
    const v6, 0x17f17c

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_50

    goto :goto_5c

    :sswitch_df
    if-eqz v3, :cond_33

    const v4, 0x17f1c8

    goto :goto_5c

    :sswitch_e0
    const v4, 0x17f10e

    goto :goto_5a

    :sswitch_e1
    const/4 v3, 0x0

    goto :goto_5b

    :cond_33
    :sswitch_e2
    const v4, 0x17f1a9

    goto :goto_5c

    :sswitch_e3
    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    :sswitch_e4
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    instance-of v6, v3, Landroid/view/ViewGroup;

    const v4, 0x17f1e7

    :goto_5d
    const v7, 0x17f1f8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_51

    goto :goto_5d

    :sswitch_e5
    if-eqz v6, :cond_34

    const v4, 0x17f4cf    # 2.200037E-39f

    goto :goto_5d

    :cond_34
    :sswitch_e6
    const v4, 0x17f4b0    # 2.199994E-39f

    goto :goto_5d

    :sswitch_e7
    check-cast v3, Landroid/view/ViewGroup;

    const v4, 0x17f4ee    # 2.20008E-39f

    :goto_5e
    const v6, 0x17f4ff

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_52

    goto :goto_5e

    :sswitch_e8
    const v4, 0x17f50d

    goto :goto_5e

    :sswitch_e9
    const/4 v3, 0x0

    :sswitch_ea
    const v4, 0x17f56a

    :goto_5f
    const v6, 0x17f57b

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_53

    goto :goto_5f

    :sswitch_eb
    if-eqz v3, :cond_35

    const v4, 0x17f852

    goto :goto_5f

    :cond_35
    :sswitch_ec
    const v4, 0x17f5a8

    goto :goto_5f

    :sswitch_ed
    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    :sswitch_ee
    const v3, 0x7e040005

    invoke-virtual {v2, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v3

    instance-of v6, v3, Landroid/view/VelocityTracker;

    const v4, 0x17f871

    :goto_60
    const v7, 0x17f882

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_54

    goto :goto_60

    :cond_36
    :sswitch_ef
    const v4, 0x17f8af

    goto :goto_60

    :sswitch_f0
    if-eqz v6, :cond_36

    const v4, 0x17f8ce

    goto :goto_60

    :sswitch_f1
    check-cast v3, Landroid/view/VelocityTracker;

    const v4, 0x17f8ed

    :goto_61
    const v6, 0x17f8fe

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_55

    goto :goto_61

    :sswitch_f2
    const v4, 0x17f90c

    goto :goto_61

    :sswitch_f3
    const/4 v3, 0x0

    :sswitch_f4
    const v4, 0x17f969

    :goto_62
    const v6, 0x17f97a

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_56

    goto :goto_62

    :sswitch_f5
    if-eqz v3, :cond_37

    const v4, 0x17fc51

    goto :goto_62

    :cond_37
    :sswitch_f6
    const v4, 0x17fc32

    goto :goto_62

    :sswitch_f7
    invoke-virtual {v3}, Landroid/view/VelocityTracker;->recycle()V

    :sswitch_f8
    const v3, 0x7e040007

    invoke-virtual {v2, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v3

    instance-of v6, v3, Ljava/lang/Runnable;

    const v4, 0x17fc70

    :goto_63
    const v7, 0x17fc81

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_57

    goto :goto_63

    :cond_38
    :sswitch_f9
    const v4, 0x17fcae

    goto :goto_63

    :sswitch_fa
    if-eqz v6, :cond_38

    const v4, 0x17fccd

    goto :goto_63

    :sswitch_fb
    check-cast v3, Ljava/lang/Runnable;

    const v4, 0x17fcec

    :goto_64
    const v6, 0x17fcfd

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_58

    goto :goto_64

    :sswitch_fc
    const v4, 0x17fd0b

    goto :goto_64

    :sswitch_fd
    const/4 v3, 0x0

    :sswitch_fe
    const v4, 0x17fff3

    :goto_65
    const v6, 0x180004

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_59

    goto :goto_65

    :cond_39
    :sswitch_ff
    const v4, 0x180031

    goto :goto_65

    :sswitch_100
    if-eqz v3, :cond_39

    const v4, 0x180050

    goto :goto_65

    :sswitch_101
    invoke-virtual {v2, v3}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    const v3, 0x7e040007

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :sswitch_102
    const v3, 0x7e040001

    invoke-virtual {v2, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v3

    instance-of v6, v3, Lh40;

    const v4, 0x18006f

    :goto_66
    const v7, 0x180080

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_5a

    goto :goto_66

    :cond_3a
    :sswitch_103
    const v4, 0x1800ad

    goto :goto_66

    :sswitch_104
    if-eqz v6, :cond_3a

    const v4, 0x1800cc

    goto :goto_66

    :sswitch_105
    check-cast v3, Lh40;

    const v4, 0x1800eb

    :goto_67
    const v6, 0x1800fc

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_5b

    goto :goto_67

    :sswitch_106
    const v4, 0x180395

    goto :goto_67

    :sswitch_107
    const/4 v3, 0x0

    :sswitch_108
    const v4, 0x1803f2

    :goto_68
    const v6, 0x180403

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_5c

    goto :goto_68

    :cond_3b
    :sswitch_109
    const v4, 0x180430

    goto :goto_68

    :sswitch_10a
    if-eqz v3, :cond_3b

    const v4, 0x18044f

    goto :goto_68

    :sswitch_10b
    iget-boolean v6, v3, Lh40;->e:Z

    const v4, 0x18046e

    :goto_69
    const v7, 0x18047f

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_5d

    goto :goto_69

    :sswitch_10c
    if-eqz v6, :cond_3c

    const v4, 0x180756

    goto :goto_69

    :cond_3c
    :sswitch_10d
    const v4, 0x1804ac

    goto :goto_69

    :sswitch_10e
    invoke-virtual {v3}, Lh40;->c()V

    :sswitch_10f
    const v3, 0x7e040002

    invoke-virtual {v2, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v3

    instance-of v6, v3, Lh40;

    const v4, 0x180775

    :goto_6a
    const v7, 0x180786

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_5e

    goto :goto_6a

    :cond_3d
    :sswitch_110
    const v4, 0x1807b3

    goto :goto_6a

    :sswitch_111
    if-eqz v6, :cond_3d

    const v4, 0x1807d2

    goto :goto_6a

    :sswitch_112
    check-cast v3, Lh40;

    const v4, 0x1807f1

    :goto_6b
    const v6, 0x180802

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_5f

    goto :goto_6b

    :goto_6c
    :sswitch_113
    const v4, 0x18086d

    :goto_6d
    const v6, 0x18087e

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_60

    goto :goto_6d

    :sswitch_114
    if-eqz v3, :cond_3e

    const v4, 0x180b55

    goto :goto_6d

    :sswitch_115
    const v4, 0x180810

    goto :goto_6b

    :sswitch_116
    const/4 v3, 0x0

    goto :goto_6c

    :cond_3e
    :sswitch_117
    const v4, 0x180b36

    goto :goto_6d

    :sswitch_118
    iget-boolean v6, v3, Lh40;->e:Z

    const v4, 0x180b74

    :goto_6e
    const v7, 0x180b85

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_61

    goto :goto_6e

    :cond_3f
    :sswitch_119
    const v4, 0x180bb2

    goto :goto_6e

    :sswitch_11a
    if-eqz v6, :cond_3f

    const v4, 0x180bd1

    goto :goto_6e

    :sswitch_11b
    invoke-virtual {v3}, Lh40;->c()V

    :sswitch_11c
    const v3, 0x7e040003

    invoke-virtual {v2, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v3

    instance-of v6, v3, Lh40;

    const v4, 0x180bf0

    :goto_6f
    const v7, 0x180c01

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_62

    goto :goto_6f

    :cond_40
    :sswitch_11d
    const v4, 0x180c2e

    goto :goto_6f

    :sswitch_11e
    if-eqz v6, :cond_40

    const v4, 0x185dad

    goto :goto_6f

    :sswitch_11f
    check-cast v3, Lh40;

    const v4, 0x185dcc

    :goto_70
    const v6, 0x185ddd

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_63

    goto :goto_70

    :sswitch_120
    const v4, 0x185deb

    goto :goto_70

    :sswitch_121
    const/4 v3, 0x0

    :sswitch_122
    const v4, 0x185e48

    :goto_71
    const v6, 0x185e59

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_64

    goto :goto_71

    :sswitch_123
    if-eqz v3, :cond_41

    const v4, 0x185ea5

    goto :goto_71

    :cond_41
    :sswitch_124
    const v4, 0x185e86

    goto :goto_71

    :sswitch_125
    iget-boolean v6, v3, Lh40;->e:Z

    const v4, 0x185ec4

    :goto_72
    const v7, 0x185ed5

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_65

    goto :goto_72

    :sswitch_126
    if-eqz v6, :cond_42

    const v4, 0x1861ac

    goto :goto_72

    :cond_42
    :sswitch_127
    const v4, 0x18618d

    goto :goto_72

    :sswitch_128
    invoke-virtual {v3}, Lh40;->c()V

    :sswitch_129
    const v3, 0x7e040004

    invoke-virtual {v2, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v3

    instance-of v6, v3, Lh40;

    const v4, 0x1861cb

    :goto_73
    const v7, 0x1861dc

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_66

    goto :goto_73

    :sswitch_12a
    if-eqz v6, :cond_43

    const v4, 0x186228

    goto :goto_73

    :cond_43
    :sswitch_12b
    const v4, 0x186209

    goto :goto_73

    :sswitch_12c
    check-cast v3, Lh40;

    const v4, 0x186247

    :goto_74
    const v6, 0x186258

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_67

    goto :goto_74

    :sswitch_12d
    const v4, 0x186266

    goto :goto_74

    :sswitch_12e
    const/4 v3, 0x0

    :sswitch_12f
    const v4, 0x18654e

    :goto_75
    const v6, 0x18655f

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_68

    goto :goto_75

    :sswitch_130
    if-eqz v3, :cond_44

    const v4, 0x1865ab

    goto :goto_75

    :cond_44
    :sswitch_131
    const v4, 0x18658c

    goto :goto_75

    :sswitch_132
    iget-boolean v6, v3, Lh40;->e:Z

    const v4, 0x1865ca

    :goto_76
    const v7, 0x1865db

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_69

    goto :goto_76

    :sswitch_133
    if-eqz v6, :cond_45

    const v4, 0x186627

    goto :goto_76

    :cond_45
    :sswitch_134
    const v4, 0x186608

    goto :goto_76

    :sswitch_135
    invoke-virtual {v3}, Lh40;->c()V

    :sswitch_136
    const v3, 0x7e040006

    invoke-virtual {v2, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v3

    instance-of v6, v3, Lh40;

    const v4, 0x186646

    :goto_77
    const v7, 0x186657

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_6a

    goto :goto_77

    :sswitch_137
    if-eqz v6, :cond_46

    const v4, 0x18692e

    goto :goto_77

    :cond_46
    :sswitch_138
    const v4, 0x18690f

    goto :goto_77

    :sswitch_139
    check-cast v3, Lh40;

    :goto_78
    const v4, 0x18694d

    :goto_79
    const v6, 0x18695e

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_6b

    goto :goto_79

    :sswitch_13a
    if-eqz v3, :cond_47

    const v4, 0x1869aa

    goto :goto_79

    :cond_47
    :sswitch_13b
    const v4, 0x18698b

    goto :goto_79

    :sswitch_13c
    iget-boolean v6, v3, Lh40;->e:Z

    const v4, 0x1869c9    # 2.242E-39f

    :goto_7a
    const v7, 0x1869da

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_6c

    goto :goto_7a

    :sswitch_13d
    if-eqz v6, :cond_48

    const v4, 0x186cb1

    goto :goto_7a

    :cond_48
    :sswitch_13e
    const v4, 0x186a07

    goto :goto_7a

    :sswitch_13f
    invoke-virtual {v3}, Lh40;->c()V

    :sswitch_140
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v3

    invoke-virtual {v3, v5}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    const v4, 0x7e040005

    invoke-virtual {v2, v4, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    goto/16 :goto_0

    :pswitch_10
    const-string v2, "GwiwAXU=\n"

    const-string v3, "a2nCYBidHhc=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p1

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v0, p1

    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    const-string v3, "SxWarlja115LD4LiGtyWU0QTguIM1pZeSg7brA3V2hBRGYanWNLZREkJmOwx18I=\n"

    const-string v4, "JWD2wni5tjA=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const v2, 0x186cd0

    :goto_7b
    const v4, 0x186ce1

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_6d

    goto :goto_7b

    :cond_49
    :sswitch_141
    const v2, 0x186d0e

    goto :goto_7b

    :sswitch_142
    const/16 v2, 0x7e13

    if-ne v3, v2, :cond_49

    const v2, 0x186d2d

    goto :goto_7b

    :sswitch_143
    const/4 v2, 0x0

    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    const-string v3, "K01IND7TwQErV1B4fNWADCRLUHhq34ABKlYJNmvczE8xQVQ9PtHOCzdXTTww0dAfa3lHLHfGyRs8\n"

    const-string v4, "RTgkWB6woG8=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v2, Landroid/app/Activity;

    move-object/from16 v0, p1

    iget-object v3, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v4, 0x1

    aget-object v3, v3, v4

    const-string v4, "/1z9yCxpgQP/RuWEbm/ADvBa5YR4ZcAD/ke8ynlmjE3lUOHBLGGPGf1A/4pFZJQ=\n"

    const-string v5, "kSmRpAwK4G0=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v3}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v5

    move-object/from16 v0, p1

    iget-object v3, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v4, 0x2

    aget-object v3, v3, v4

    instance-of v6, v3, Landroid/content/Intent;

    const v4, 0x186d4c

    :goto_7c
    const v7, 0x186d5d

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_6e

    goto :goto_7c

    :sswitch_144
    if-eqz v6, :cond_4a

    const v4, 0x186da9

    goto :goto_7c

    :cond_4a
    :sswitch_145
    const v4, 0x186d8a

    goto :goto_7c

    :sswitch_146
    check-cast v3, Landroid/content/Intent;

    :goto_7d
    const v4, 0x186dc8

    :goto_7e
    const v6, 0x186dd9

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_6f

    goto :goto_7e

    :sswitch_147
    const/4 v4, -0x1

    if-ne v5, v4, :cond_4b

    const v4, 0x1870b0

    goto :goto_7e

    :cond_4b
    :sswitch_148
    const v4, 0x187091

    goto :goto_7e

    :sswitch_149
    const v4, 0x1870cf

    :goto_7f
    const v5, 0x1870e0

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_70

    goto :goto_7f

    :cond_4c
    :sswitch_14a
    const v4, 0x18710d

    goto :goto_7f

    :sswitch_14b
    if-eqz v3, :cond_4c

    const v4, 0x18712c

    goto :goto_7f

    :sswitch_14c
    sget-object v4, La80;->v:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    const v4, 0x18714b

    :goto_80
    const v6, 0x18715c

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_71

    goto :goto_80

    :sswitch_14d
    if-lez v5, :cond_4d

    const v4, 0x187433

    goto :goto_80

    :cond_4d
    :sswitch_14e
    const v4, 0x187189

    goto :goto_80

    :sswitch_14f
    :try_start_4
    invoke-virtual {v3}, Landroid/content/Intent;->getData()Landroid/net/Uri;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    move-result-object v4

    const v3, 0x187452

    :goto_81
    const v5, 0x187463

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_72

    goto :goto_81

    :cond_4e
    :sswitch_150
    const v3, 0x187490

    goto :goto_81

    :sswitch_151
    if-nez v4, :cond_4e

    const v3, 0x1874af

    goto :goto_81

    :sswitch_152
    const-string v2, "pmIMv5RATA==\n"

    const-string v3, "mhFpy7l/cl0=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v2, ""

    sput-object v2, La80;->v:Ljava/lang/String;

    const v2, 0x1874ce

    :goto_82
    const v3, 0x1874df

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_73

    goto :goto_82

    :sswitch_153
    const v2, 0x1874ed

    goto :goto_82

    :sswitch_154
    :try_start_5
    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    invoke-virtual {v3, v4}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    move-result-object v5

    const v3, 0x18754a

    :goto_83
    const v4, 0x18755b

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_74

    goto :goto_83

    :sswitch_155
    if-eqz v5, :cond_4f

    const v3, 0x187832

    goto :goto_83

    :cond_4f
    :sswitch_156
    const v3, 0x187813

    goto :goto_83

    :sswitch_157
    :try_start_6
    invoke-static {v5}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v3

    const/16 v4, 0x90

    const/16 v6, 0x90

    const/4 v7, 0x1

    invoke-static {v3, v4, v6, v7}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v3

    const-string v4, "6op4lf3Y57zolHiQy9TAsuiINdqnk50=\n"

    const-string v6, "ifgd9Im9tN8=\n"

    invoke-static {v4, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v3}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v4, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V

    sget-object v6, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v7, 0x64

    invoke-virtual {v3, v6, v7, v4}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v3

    const/4 v4, 0x2

    invoke-static {v3, v4}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lgn;->a:Lgn;

    const-string v6, "geek_avatar_"

    sget-object v7, La80;->v:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v3}, Lip;->l(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6, v3}, Lgn;->h(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    :try_start_7
    invoke-interface {v5}, Ljava/io/Closeable;->close()V

    const v3, 0x187851

    :goto_84
    const v4, 0x187862

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_75

    goto :goto_84

    :sswitch_158
    sget-object v3, Lgn;->a:Lgn;

    const-string v4, "29QF1JDxJYqAlwyf9fZdwbTvXo2SmnWv2Ps41JvJK7KOlAmK+t94wbPDVL68mVm72OU50pP8\n"

    const-string v5, "PnCxMRN+zSQ=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v4}, Lgn;->k(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    const v2, 0x187ccc

    :goto_85
    const v3, 0x187cdd

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_76

    goto :goto_85

    :sswitch_159
    const v2, 0x187f76

    goto :goto_85

    :sswitch_15a
    const v3, 0x187870

    goto :goto_84

    :catchall_2
    move-exception v3

    const v4, 0x1878cd

    :goto_86
    const v5, 0x1878de

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_77

    goto :goto_86

    :sswitch_15b
    const v4, 0x1878ec

    goto :goto_86

    :sswitch_15c
    const v4, 0x187bd4

    :goto_87
    const v6, 0x187be5

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_78

    goto :goto_87

    :sswitch_15d
    :try_start_8
    throw v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :catchall_3
    move-exception v4

    :try_start_9
    invoke-static {v5, v3}, Lff;->j(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v4
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :sswitch_15e
    const v4, 0x187bf3

    goto :goto_87

    :catchall_4
    move-exception v3

    const v4, 0x187c50

    :goto_88
    const v6, 0x187c61

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_79

    goto :goto_88

    :sswitch_15f
    const v4, 0x187c6f

    goto :goto_88

    :sswitch_160
    :try_start_a
    const-string v4, "5f8yVlGfoebS7BZQQoKA\n"

    const-string v5, "pIlTIjDt8oc=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "Nwje\n"

    const-string v6, "Q2m5jaPP2Zc=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v4}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v4, "Fg==\n"

    const-string v5, "c8HJlSTQVfc=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    sget-object v4, Lgn;->a:Lgn;

    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "\u5934\u50cf\u5904\u7406\u5931\u8d25: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v3}, Lgn;->k(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    const v2, 0x187fd3

    :goto_89
    const v3, 0x187fe4

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_7a

    goto :goto_89

    :sswitch_161
    const v2, 0x187ff2

    goto :goto_89

    :catchall_5
    move-exception v2

    const-string v3, "pmIMv5RATA==\n"

    const-string v4, "mhFpy7l/cl0=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v3, ""

    sput-object v3, La80;->v:Ljava/lang/String;

    throw v2

    :pswitch_11
    const-string v2, "mjy8s0g=\n"

    const-string v3, "6l3O0iVaDpM=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p1

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v0, p1

    iget-object v5, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const-string v2, "nbJR5g==\n"

    const-string v3, "/MA2lZ3JQoo=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v5}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    array-length v6, v5

    const/4 v2, 0x0

    :sswitch_162
    const v3, 0x18804f

    :goto_8a
    const v4, 0x188060

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_7b

    goto :goto_8a

    :cond_50
    :sswitch_163
    const v3, 0x18808d

    goto :goto_8a

    :sswitch_164
    if-ge v2, v6, :cond_50

    const v3, 0x18d20c

    goto :goto_8a

    :sswitch_165
    aget-object v3, v5, v2

    instance-of v7, v3, Ljava/lang/String;

    const v4, 0x18d22b

    :goto_8b
    const v8, 0x18d23c

    xor-int/2addr v4, v8

    sparse-switch v4, :sswitch_data_7c

    goto :goto_8b

    :sswitch_166
    if-eqz v7, :cond_51

    const v4, 0x18d288

    goto :goto_8b

    :cond_51
    :sswitch_167
    const v4, 0x18d269

    goto :goto_8b

    :sswitch_168
    const v2, 0x18d2a7

    :goto_8c
    const v4, 0x18d2b8

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_7d

    goto :goto_8c

    :sswitch_169
    const v2, 0x18d2c6

    goto :goto_8c

    :sswitch_16a
    move-object v2, v3

    :goto_8d
    instance-of v4, v2, Ljava/lang/String;

    const v3, 0x18d62a

    :goto_8e
    const v5, 0x18d63b

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_7e

    goto :goto_8e

    :sswitch_16b
    if-eqz v4, :cond_52

    const v3, 0x18d687

    goto :goto_8e

    :sswitch_16c
    add-int/lit8 v2, v2, 0x15

    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v2, v2, -0x15

    const v3, 0x18d323

    :goto_8f
    const v4, 0x18d334

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_7f

    goto :goto_8f

    :sswitch_16d
    const v3, 0x18d5cd

    goto :goto_8f

    :sswitch_16e
    const/4 v2, 0x0

    goto :goto_8d

    :cond_52
    :sswitch_16f
    const v3, 0x18d668

    goto :goto_8e

    :sswitch_170
    check-cast v2, Ljava/lang/String;

    const v3, 0x18d6a6

    :goto_90
    const v4, 0x18d6b7

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_80

    goto :goto_90

    :sswitch_171
    const v3, 0x18d6c5

    goto :goto_90

    :sswitch_172
    move-object v3, v2

    :goto_91
    const v2, 0x18d9ad

    :goto_92
    const v4, 0x18d9be

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_81

    goto :goto_92

    :sswitch_173
    if-nez v3, :cond_53

    const v2, 0x18da0a

    goto :goto_92

    :sswitch_174
    const/4 v2, 0x0

    move-object v3, v2

    goto :goto_91

    :cond_53
    :sswitch_175
    const v2, 0x18d9eb

    goto :goto_92

    :sswitch_176
    const v2, 0x18da29

    :goto_93
    const v3, 0x18da3a

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_82

    goto :goto_93

    :sswitch_177
    const v2, 0x18da48

    goto :goto_93

    :sswitch_178
    const-string v2, "hJZpa4OfOEuHrA==\n"

    const-string v4, "4/MMANz5Vyc=\n"

    invoke-static {v2, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    invoke-static {v3, v2, v4}, Lb50;->N(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    const v2, 0x18daa5

    :goto_94
    const v5, 0x18dab6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_83

    goto :goto_94

    :sswitch_179
    if-eqz v4, :cond_54

    const v2, 0x18dd8d

    goto :goto_94

    :cond_54
    :sswitch_17a
    const v2, 0x18dd6e

    goto :goto_94

    :sswitch_17b
    const-string v2, "3CIk1yWWGA==\n"

    const-string v4, "4FFBowipJsc=\n"

    invoke-static {v2, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    sput-object v3, Lff;->z:Ljava/lang/String;

    const/4 v2, 0x0

    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    instance-of v5, v2, Landroid/app/Activity;

    const v4, 0x18ddac

    :goto_95
    const v6, 0x18ddbd

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_84

    goto :goto_95

    :sswitch_17c
    if-eqz v5, :cond_55

    const v4, 0x18de09

    goto :goto_95

    :cond_55
    :sswitch_17d
    const v4, 0x18ddea

    goto :goto_95

    :sswitch_17e
    check-cast v2, Landroid/app/Activity;

    :goto_96
    const v4, 0x18de28

    :goto_97
    const v5, 0x18de39

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_85

    goto :goto_97

    :sswitch_17f
    if-nez v2, :cond_56

    const v4, 0x18e110

    goto :goto_97

    :cond_56
    :sswitch_180
    const v4, 0x18de66

    goto :goto_97

    :sswitch_181
    const v2, 0x18e12f

    :goto_98
    const v3, 0x18e140

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_86

    goto :goto_98

    :sswitch_182
    const v2, 0x18e14e

    goto :goto_98

    :sswitch_183
    sget-object v4, Lgn;->a:Lgn;

    const-string v5, "key_geek_folder_name_"

    invoke-virtual {v5, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "2QtHjqTpAU24anvs7shTEZU1\n"

    const-string v7, "MYztawpz5fQ=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5, v6}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v4, "4MLlKdibeg==\n"

    const-string v5, "g62LXb3jDmA=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v4, "0uKKV+PjlNc=\n"

    const-string v5, "tI3mM4aR3bM=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v4, "TOhopDkEmNBH4g==\n"

    const-string v5, "KocEwFx21rE=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    :try_start_b
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    const-string v5, "CuMX50RsjX8M4g7nXWTNaQCiGaZef4ZuGu0OoF9nzV8G4gyLX3GweRv6E6pVSoxyH+kIulF9inMH\n2TM=\n"

    const-string v6, "aYx6yTAJ4xw=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v2, v5}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    const-string v5, "mpEkD1NZRQ2MjS8J\n"

    const-string v6, "2f5KezI6MVI=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v2, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    const v2, 0x18e1ab

    :goto_99
    const v3, 0x18e1bc

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_87

    goto :goto_99

    :sswitch_184
    const v2, 0x18e1ca

    goto :goto_99

    :catchall_6
    move-exception v3

    const-string v3, "Nwje\n"

    const-string v4, "Q2m5jaPP2Zc=\n"

    const-string v5, "cQFlwA8825NJCWbLKjv5llgS\n"

    const-string v6, "PWAQrmxUlfI=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "Fg==\n"

    const-string v7, "c8HJlSTQVfc=\n"

    invoke-static {v3, v4, v5, v6, v7}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "x8yc9vGY8966p4yxjKagsbbm66TS4rHlyvam/tmL8t2qpJ+9gIi6vKH/667i4YLz\n"

    const-string v4, "IkIDEWUHFVQ=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    const v2, 0x18e227

    :goto_9a
    const v3, 0x18e238

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_88

    goto :goto_9a

    :sswitch_185
    const v2, 0x18e4d1

    goto :goto_9a

    :sswitch_186
    const-string v2, "hY5+sf8GgemSiH+p+BuK+4OTZq75EQ==\n"

    const-string v4, "5uEQx5p08og=\n"

    invoke-static {v2, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    const v2, 0x18e52e

    :goto_9b
    const v5, 0x18e53f

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_89

    goto :goto_9b

    :sswitch_187
    if-nez v4, :cond_57

    const v2, 0x18e58b

    goto :goto_9b

    :cond_57
    :sswitch_188
    const v2, 0x18e56c

    goto :goto_9b

    :sswitch_189
    const-string v2, "JXsHrfRi82sucRi6\n"

    const-string v4, "SB503pUFljQ=\n"

    invoke-static {v2, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    const v2, 0x18e5aa

    :goto_9c
    const v4, 0x18e5bb

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_8a

    goto :goto_9c

    :sswitch_18a
    if-eqz v3, :cond_58

    const v2, 0x18e892

    goto :goto_9c

    :cond_58
    :sswitch_18b
    const v2, 0x18e5e8

    goto :goto_9c

    :sswitch_18c
    const-string v2, "3CIk1yWWGA==\n"

    const-string v3, "4FFBowipJsc=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v2, ""

    sput-object v2, Lff;->z:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_12
    const-string v2, "h9b4QE0=\n"

    const-string v3, "97eKISA80Rw=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p1

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v2, Lff;->z:Ljava/lang/String;

    const-string v3, "d4s5UivpaYx0sQ==\n"

    const-string v4, "EO5cOXSPBuA=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, Lb50;->N(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    const v2, 0x18e8b1

    :goto_9d
    const v4, 0x18e8c2

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_8b

    goto :goto_9d

    :cond_59
    :sswitch_18d
    const v2, 0x18e8ef

    goto :goto_9d

    :sswitch_18e
    if-eqz v3, :cond_59

    const v2, 0x18e90e

    goto :goto_9d

    :sswitch_18f
    const-string v2, "3CIk1yWWGA==\n"

    const-string v3, "4FFBowipJsc=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v2, ""

    sput-object v2, Lff;->z:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_13
    const-string v2, "NEgJan8=\n"

    const-string v3, "RCl7CxKsDME=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p1

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    :try_start_c
    sget-object v6, Lff;->z:Ljava/lang/String;

    const-string v2, "QahuoFvs3HFCkg==\n"

    const-string v3, "Js0LywSKsx0=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v6, v2, v3}, Lb50;->N(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    const v2, 0x18e92d

    :goto_9e
    const v4, 0x18e93e

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_8c

    goto :goto_9e

    :sswitch_190
    if-eqz v3, :cond_5a

    const v2, 0x18e98a

    goto :goto_9e

    :cond_5a
    :sswitch_191
    const v2, 0x18e96b

    goto :goto_9e

    :sswitch_192
    move-object/from16 v0, p1

    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    move-object v4, v2

    :goto_9f
    const v2, 0x18e9a9

    :goto_a0
    const v3, 0x18e9ba

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_8d

    goto :goto_a0

    :sswitch_193
    if-eqz v4, :cond_5b

    const v2, 0x18ec91

    goto :goto_a0

    :cond_5b
    :sswitch_194
    const v2, 0x18ec72

    goto :goto_a0

    :sswitch_195
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "+C3/4+cp7cX1YsbgoyDv3w==\n"

    const-string v5, "kkyJgslFjKs=\n"

    invoke-static {v3, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    const v2, 0x18ecb0

    :goto_a1
    const v5, 0x18ecc1

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_8e

    goto :goto_a1

    :cond_5c
    :sswitch_196
    const v2, 0x18ecee

    goto :goto_a1

    :sswitch_197
    if-nez v3, :cond_5c

    const v2, 0x18ed0d

    goto :goto_a1

    :sswitch_198
    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v2

    invoke-static {v2}, La80;->q([Ljava/lang/Object;)Li;

    move-result-object v7

    :sswitch_199
    invoke-virtual {v7}, Li;->hasNext()Z

    move-result v3

    const v2, 0x18ed2c

    :goto_a2
    const v5, 0x18ed3d

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_8f

    goto :goto_a2

    :sswitch_19a
    if-eqz v3, :cond_5d

    const v2, 0x18f014

    goto :goto_a2

    :cond_5d
    :sswitch_19b
    const v2, 0x18ed6a

    goto :goto_a2

    :sswitch_19c
    invoke-virtual {v7}, Li;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v0, v2

    check-cast v0, Ljava/lang/reflect/Field;

    move-object v3, v0

    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v2

    const-class v5, Ljava/lang/String;

    invoke-static {v2, v5}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const v2, 0x18f033

    :goto_a3
    const v8, 0x18f044

    xor-int/2addr v2, v8

    sparse-switch v2, :sswitch_data_90

    goto :goto_a3

    :cond_5e
    :sswitch_19d
    const v2, 0x18f071

    goto :goto_a3

    :sswitch_19e
    if-eqz v5, :cond_5e

    const v2, 0x18f090

    goto :goto_a3

    :sswitch_19f
    const/4 v2, 0x1

    invoke-virtual {v3, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    move-object/from16 v0, p1

    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    invoke-virtual {v3, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v8, v2, Ljava/lang/String;

    const v5, 0x18f0af

    :goto_a4
    const v9, 0x18f0c0

    xor-int/2addr v5, v9

    sparse-switch v5, :sswitch_data_91

    goto :goto_a4

    :cond_5f
    :sswitch_1a0
    const v5, 0x18f0ed

    goto :goto_a4

    :sswitch_1a1
    if-eqz v8, :cond_5f

    const v5, 0x18f10c

    goto :goto_a4

    :sswitch_1a2
    check-cast v2, Ljava/lang/String;

    const v5, 0x18f12b

    :goto_a5
    const v8, 0x18f13c

    xor-int/2addr v5, v8

    sparse-switch v5, :sswitch_data_92

    goto :goto_a5

    :sswitch_1a3
    const v5, 0x18f3d5

    goto :goto_a5

    :sswitch_1a4
    move-object v5, v2

    :goto_a6
    const-string v2, "rj6LPaxz3eq5OIolq27W+KgjkyKqZA==\n"

    const-string v8, "zVHlS8kBros=\n"

    invoke-static {v2, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v5, v2}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    const v2, 0x18f432

    :goto_a7
    const v9, 0x18f443

    xor-int/2addr v2, v9

    sparse-switch v2, :sswitch_data_93

    goto :goto_a7

    :cond_60
    :sswitch_1a5
    const v2, 0x18f470

    goto :goto_a7

    :sswitch_1a6
    const/4 v2, 0x0

    move-object v5, v2

    goto :goto_a6

    :sswitch_1a7
    if-nez v8, :cond_60

    const v2, 0x18f48f

    goto :goto_a7

    :sswitch_1a8
    const-string v2, "cqvLvQmkddJ5odSq\n"

    const-string v8, "H864zmjDEI0=\n"

    invoke-static {v2, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v5, v2}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const v2, 0x18f4ae

    :goto_a8
    const v8, 0x18f4bf

    xor-int/2addr v2, v8

    sparse-switch v2, :sswitch_data_94

    goto :goto_a8

    :sswitch_1a9
    if-eqz v5, :cond_61

    const v2, 0x19466b

    goto :goto_a8

    :cond_61
    :sswitch_1aa
    const v2, 0x18f4ec

    goto :goto_a8

    :sswitch_1ab
    move-object/from16 v0, p1

    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    invoke-virtual {v3, v2, v6}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    const v2, 0x19468a

    :goto_a9
    const v3, 0x19469b

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_95

    goto :goto_a9

    :sswitch_1ac
    const v2, 0x1946a9

    goto :goto_a9

    :sswitch_1ad
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    move-result-object v2

    const v3, 0x194706

    :goto_aa
    const v4, 0x194717

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_96

    goto :goto_aa

    :sswitch_1ae
    const v3, 0x194725

    goto :goto_aa

    :sswitch_1af
    move-object v4, v2

    goto/16 :goto_9f

    :catchall_7
    move-exception v2

    const-string v2, "Nwje\n"

    const-string v3, "Q2m5jaPP2Zc=\n"

    const-string v4, "XtJuuaez/Mp31l2UnJPA83HYdQ==\n"

    const-string v5, "GL0C3fL6tKU=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "Fg==\n"

    const-string v6, "c8HJlSTQVfc=\n"

    invoke-static {v2, v3, v4, v5, v6}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    :pswitch_14
    const-string v2, "SxtBLLo=\n"

    const-string v3, "O3ozTddsdR0=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p1

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v0, p1

    iget-object v5, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const-string v2, "kXVj/g==\n"

    const-string v3, "8AcEjWoBYAs=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v5}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    array-length v6, v5

    const/4 v2, 0x0

    move v3, v2

    :goto_ab
    const v2, 0x194782

    :goto_ac
    const v4, 0x194793

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_97

    goto :goto_ac

    :sswitch_1b0
    if-ge v3, v6, :cond_62

    const v2, 0x194a6a

    goto :goto_ac

    :cond_62
    :sswitch_1b1
    const v2, 0x194a4b

    goto :goto_ac

    :sswitch_1b2
    aget-object v2, v5, v3

    instance-of v7, v2, Ljava/lang/String;

    const v4, 0x194a89

    :goto_ad
    const v8, 0x194a9a

    xor-int/2addr v4, v8

    sparse-switch v4, :sswitch_data_98

    goto :goto_ad

    :sswitch_1b3
    if-eqz v7, :cond_63

    const v4, 0x194ae6

    goto :goto_ad

    :cond_63
    :sswitch_1b4
    const v4, 0x194ac7

    goto :goto_ad

    :sswitch_1b5
    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lb50;->T(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v4, "XNoKr8dh\n"

    const-string v7, "L79myqQVnR0=\n"

    invoke-static {v4, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x1

    invoke-static {v2, v4, v7}, Lb50;->N(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    const v2, 0x194b05

    :goto_ae
    const v7, 0x194b16

    xor-int/2addr v2, v7

    sparse-switch v2, :sswitch_data_99

    goto :goto_ae

    :sswitch_1b6
    if-eqz v4, :cond_64

    const v2, 0x194ded

    goto :goto_ae

    :cond_64
    :sswitch_1b7
    const v2, 0x194b43

    goto :goto_ae

    :sswitch_1b8
    const v2, 0x194e0c

    :goto_af
    const v4, 0x194e1d

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_9a

    goto :goto_af

    :sswitch_1b9
    const v2, 0x194e2b

    goto :goto_af

    :sswitch_1ba
    move v5, v3

    :goto_b0
    move-object/from16 v0, p1

    iget-object v4, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const-string v2, "2eZsHw==\n"

    const-string v3, "uJQLbJSw6Iw=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v4}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    array-length v6, v4

    const/4 v2, 0x0

    :sswitch_1bb
    const v3, 0x194f04

    :goto_b1
    const v7, 0x194f15

    xor-int/2addr v3, v7

    sparse-switch v3, :sswitch_data_9b

    goto :goto_b1

    :sswitch_1bc
    if-ge v2, v6, :cond_65

    const v3, 0x1951ec

    goto :goto_b1

    :sswitch_1bd
    add-int/lit8 v2, v3, 0x1

    const v3, 0x194e88

    :goto_b2
    const v4, 0x194e99

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_9c

    goto :goto_b2

    :sswitch_1be
    const v3, 0x194ea7

    goto :goto_b2

    :sswitch_1bf
    move v3, v2

    goto/16 :goto_ab

    :sswitch_1c0
    const/4 v3, -0x1

    move v5, v3

    goto :goto_b0

    :cond_65
    :sswitch_1c1
    const v3, 0x1951cd

    goto :goto_b1

    :sswitch_1c2
    aget-object v7, v4, v2

    const v3, 0x19520b

    :goto_b3
    const v8, 0x19521c

    xor-int/2addr v3, v8

    sparse-switch v3, :sswitch_data_9d

    goto :goto_b3

    :sswitch_1c3
    if-eqz v7, :cond_66

    const v3, 0x195268

    goto :goto_b3

    :cond_66
    :sswitch_1c4
    const v3, 0x195249

    goto :goto_b3

    :sswitch_1c5
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->isArray()Z

    move-result v7

    const v3, 0x195287

    :goto_b4
    const v8, 0x195298

    xor-int/2addr v3, v8

    sparse-switch v3, :sswitch_data_9e

    goto :goto_b4

    :sswitch_1c6
    if-eqz v7, :cond_67

    const v3, 0x19556f

    goto :goto_b4

    :cond_67
    :sswitch_1c7
    const v3, 0x1952c5

    goto :goto_b4

    :sswitch_1c8
    const v3, 0x19558e

    :goto_b5
    const v4, 0x19559f

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_9f

    goto :goto_b5

    :sswitch_1c9
    const v3, 0x1955ad

    goto :goto_b5

    :sswitch_1ca
    move v3, v2

    :goto_b6
    const v2, 0x195686

    :goto_b7
    const v4, 0x195697

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_a0

    goto :goto_b7

    :sswitch_1cb
    const/4 v2, -0x1

    if-ne v5, v2, :cond_68

    const v2, 0x19596e

    goto :goto_b7

    :sswitch_1cc
    rsub-int/lit8 v2, v2, 0x0

    rsub-int/lit8 v2, v2, 0x1

    const v3, 0x19560a

    :goto_b8
    const v7, 0x19561b

    xor-int/2addr v3, v7

    sparse-switch v3, :sswitch_data_a1

    goto :goto_b8

    :sswitch_1cd
    const v3, 0x195629

    goto :goto_b8

    :sswitch_1ce
    const/4 v2, -0x1

    move v3, v2

    goto :goto_b6

    :cond_68
    :sswitch_1cf
    const v2, 0x19594f

    goto :goto_b7

    :sswitch_1d0
    const v2, 0x19598d

    :goto_b9
    const v3, 0x19599e

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_a2

    goto :goto_b9

    :sswitch_1d1
    const v2, 0x1959ac

    goto :goto_b9

    :sswitch_1d2
    move-object/from16 v0, p1

    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    aget-object v2, v2, v5

    const-string v4, "I+hyUThUNXwj8modelJ0cSzuah1sWHR8IvMzU21bODI55G5YOFw7ZiH0cBNLQyZ7I/o=\n"

    const-string v6, "TZ0ePRg3VBI=\n"

    invoke-static {v4, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v2}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v2, Ljava/lang/String;

    const-string v4, "sQIZEfoH1vjtDx8c5QjU4aY=\n"

    const-string v6, "w2F2f45mtYw=\n"

    invoke-static {v4, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x1

    invoke-static {v2, v4, v6}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v6

    const v4, 0x195a09

    :goto_ba
    const v7, 0x195a1a

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_a3

    goto :goto_ba

    :sswitch_1d3
    if-nez v6, :cond_69

    const v4, 0x195cf1

    goto :goto_ba

    :cond_69
    :sswitch_1d4
    const v4, 0x195a47

    goto :goto_ba

    :sswitch_1d5
    const-string v4, "ZhYIs32EXMlwVxOlM557wHo=\n"

    const-string v6, "Fnd61hPwDqw=\n"

    invoke-static {v4, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x1

    invoke-static {v2, v4, v6}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v6

    const v4, 0x195d10

    :goto_bb
    const v7, 0x195d21

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_a4

    goto :goto_bb

    :cond_6a
    :sswitch_1d6
    const v4, 0x195d4e

    goto :goto_bb

    :sswitch_1d7
    if-eqz v6, :cond_6a

    const v4, 0x195d6d

    goto :goto_bb

    :sswitch_1d8
    const v4, 0x195d8c

    :goto_bc
    const v6, 0x195d9d

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_a5

    goto :goto_bc

    :sswitch_1d9
    const v4, 0x195dab

    goto :goto_bc

    :sswitch_1da
    const/4 v4, 0x0

    const v6, 0x195e08

    :goto_bd
    const v7, 0x195e19

    xor-int/2addr v6, v7

    sparse-switch v6, :sswitch_data_a6

    goto :goto_bd

    :sswitch_1db
    const v6, 0x1960b2

    goto :goto_bd

    :sswitch_1dc
    move v6, v4

    :goto_be
    sget-object v4, Lff;->z:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v7

    const v4, 0x19610f

    :goto_bf
    const v8, 0x196120

    xor-int/2addr v4, v8

    sparse-switch v4, :sswitch_data_a7

    goto :goto_bf

    :cond_6b
    :sswitch_1dd
    const v4, 0x19614d

    goto :goto_bf

    :sswitch_1de
    const/4 v4, 0x1

    move v6, v4

    goto :goto_be

    :sswitch_1df
    if-lez v7, :cond_6b

    const v4, 0x19616c

    goto :goto_bf

    :sswitch_1e0
    const v4, 0x19618b

    :goto_c0
    const v7, 0x19619c

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_a8

    goto :goto_c0

    :sswitch_1e1
    if-nez v6, :cond_6c

    const v4, 0x196473

    goto :goto_c0

    :cond_6c
    :sswitch_1e2
    const v4, 0x1961c9

    goto :goto_c0

    :sswitch_1e3
    const-string v4, "ibhIFB7929SevkkMGeDQxo+lUAsY6g==\n"

    const-string v7, "6tcmYnuPqLU=\n"

    invoke-static {v4, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x0

    invoke-static {v2, v4, v7}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v7

    const v4, 0x196492

    :goto_c1
    const v8, 0x1964a3

    xor-int/2addr v4, v8

    sparse-switch v4, :sswitch_data_a9

    goto :goto_c1

    :cond_6d
    :sswitch_1e4
    const v4, 0x1964d0

    goto :goto_c1

    :sswitch_1e5
    if-nez v7, :cond_6d

    const v4, 0x1964ef

    goto :goto_c1

    :sswitch_1e6
    const-string v4, "PYkSATyXG+g2gw0W\n"

    const-string v7, "UOxhcl3wfrc=\n"

    invoke-static {v4, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x0

    invoke-static {v2, v4, v7}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v7

    const v4, 0x19650e

    :goto_c2
    const v8, 0x19651f

    xor-int/2addr v4, v8

    sparse-switch v4, :sswitch_data_aa

    goto :goto_c2

    :sswitch_1e7
    if-eqz v7, :cond_6e

    const v4, 0x19656b

    goto :goto_c2

    :cond_6e
    :sswitch_1e8
    const v4, 0x19654c

    goto :goto_c2

    :sswitch_1e9
    const v4, 0x19658a

    :goto_c3
    const v7, 0x19659b

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_ab

    goto :goto_c3

    :sswitch_1ea
    const v4, 0x196834

    goto :goto_c3

    :sswitch_1eb
    const/4 v4, 0x0

    const v7, 0x196891

    :goto_c4
    const v8, 0x1968a2

    xor-int/2addr v7, v8

    sparse-switch v7, :sswitch_data_ac

    goto :goto_c4

    :sswitch_1ec
    move v7, v4

    :goto_c5
    const v4, 0x19690d

    :goto_c6
    const v8, 0x19691e

    xor-int/2addr v4, v8

    sparse-switch v4, :sswitch_data_ad

    goto :goto_c6

    :sswitch_1ed
    const/4 v4, -0x1

    if-eq v3, v4, :cond_6f

    const v4, 0x19baca

    goto :goto_c6

    :sswitch_1ee
    const v7, 0x1968b0

    goto :goto_c4

    :sswitch_1ef
    const-string v4, "IWaXT7TQn1w2YJZXs82UTid7j1Cyxw==\n"

    const-string v7, "Qgn5OdGi7D0=\n"

    invoke-static {v4, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    sget-object v7, Lff;->z:Ljava/lang/String;

    invoke-static {v2, v4, v7}, Lb50;->L(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v7, "Tjj3zlnFHdRFMujZ\n"

    const-string v8, "I12EvTiieIs=\n"

    invoke-static {v7, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    sget-object v8, Lff;->z:Ljava/lang/String;

    invoke-static {v4, v7, v8}, Lb50;->L(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, p1

    iget-object v7, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    aput-object v4, v7, v5

    const/4 v4, 0x1

    move v7, v4

    goto :goto_c5

    :cond_6f
    :sswitch_1f0
    const v4, 0x19694b

    goto :goto_c6

    :sswitch_1f1
    move-object/from16 v0, p1

    iget-object v4, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    aget-object v4, v4, v3

    instance-of v8, v4, [Ljava/lang/Object;

    const v3, 0x19bae9

    :goto_c7
    const v9, 0x19bafa

    xor-int/2addr v3, v9

    sparse-switch v3, :sswitch_data_ae

    goto :goto_c7

    :sswitch_1f2
    if-eqz v8, :cond_70

    const v3, 0x19bb46

    goto :goto_c7

    :cond_70
    :sswitch_1f3
    const v3, 0x19bb27

    goto :goto_c7

    :sswitch_1f4
    move-object v3, v4

    check-cast v3, [Ljava/lang/Object;

    array-length v11, v3

    const/4 v8, 0x0

    move v9, v7

    :goto_c8
    const v7, 0x19bb65

    :goto_c9
    const v10, 0x19bb76

    xor-int/2addr v7, v10

    sparse-switch v7, :sswitch_data_af

    goto :goto_c9

    :sswitch_1f5
    if-ge v8, v11, :cond_71

    const v7, 0x19bbc2

    goto :goto_c9

    :cond_71
    :sswitch_1f6
    const v7, 0x19bba3

    goto :goto_c9

    :sswitch_1f7
    aget-object v10, v3, v8

    const v7, 0x19bbe1

    :goto_ca
    const v12, 0x19bbf2

    xor-int/2addr v7, v12

    sparse-switch v7, :sswitch_data_b0

    goto :goto_ca

    :sswitch_1f8
    if-eqz v10, :cond_72

    const v7, 0x19bec9

    goto :goto_ca

    :cond_72
    :sswitch_1f9
    const v7, 0x19beaa

    goto :goto_ca

    :sswitch_1fa
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    const v10, 0x19bee8

    :goto_cb
    const v12, 0x19bef9

    xor-int/2addr v10, v12

    sparse-switch v10, :sswitch_data_b1

    goto :goto_cb

    :sswitch_1fb
    const v10, 0x19bf07

    goto :goto_cb

    :sswitch_1fc
    const/4 v7, 0x0

    :sswitch_1fd
    const-string v10, "snnV+c2isEClf9Thyr+7UrRkzebLtQ==\n"

    const-string v12, "0Ra7j6jQwyE=\n"

    invoke-static {v10, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v7, v10}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    const v10, 0x19bf64

    :goto_cc
    const v13, 0x19bf75

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_b2

    goto :goto_cc

    :sswitch_1fe
    if-nez v12, :cond_73

    const v10, 0x19c24c

    goto :goto_cc

    :cond_73
    :sswitch_1ff
    const v10, 0x19bfa2

    goto :goto_cc

    :sswitch_200
    const-string v10, "kSr32LDzxAyaIOjP\n"

    const-string v12, "/E+Eq9GUoVM=\n"

    invoke-static {v10, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v7, v10}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    const v7, 0x19c26b

    :goto_cd
    const v12, 0x19c27c

    xor-int/2addr v7, v12

    sparse-switch v7, :sswitch_data_b3

    goto :goto_cd

    :sswitch_201
    if-eqz v10, :cond_74

    const v7, 0x19c2c8

    goto :goto_cd

    :cond_74
    :sswitch_202
    const v7, 0x19c2a9

    goto :goto_cd

    :sswitch_203
    :try_start_d
    sget-object v7, Lff;->z:Ljava/lang/String;

    invoke-static {v4, v8, v7}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_9

    const/4 v9, 0x1

    :sswitch_204
    rsub-int/lit8 v7, v8, 0x0

    add-int/lit8 v7, v7, -0x1

    rsub-int/lit8 v7, v7, 0x0

    const v8, 0x19c2e7

    :goto_ce
    const v10, 0x19c2f8

    xor-int/2addr v8, v10

    sparse-switch v8, :sswitch_data_b4

    goto :goto_ce

    :sswitch_205
    const v8, 0x19c306

    goto :goto_ce

    :sswitch_206
    move v8, v7

    goto/16 :goto_c8

    :sswitch_207
    move v7, v9

    :sswitch_208
    const v3, 0x19c363

    :goto_cf
    const v4, 0x19c374

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_b5

    goto :goto_cf

    :sswitch_209
    if-eqz v7, :cond_75

    const v3, 0x19c64b

    goto :goto_cf

    :cond_75
    :sswitch_20a
    const v3, 0x19c62c

    goto :goto_cf

    :sswitch_20b
    const v2, 0x19c66a

    :goto_d0
    const v3, 0x19c67b

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_b6

    goto :goto_d0

    :sswitch_20c
    const v2, 0x19c689

    goto :goto_d0

    :sswitch_20d
    const v3, 0x19c6e6

    :goto_d1
    const v4, 0x19c6f7

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_b7

    goto :goto_d1

    :sswitch_20e
    if-eqz v6, :cond_76

    const v3, 0x19c9ce

    goto :goto_d1

    :cond_76
    :sswitch_20f
    const v3, 0x19c724

    goto :goto_d1

    :sswitch_210
    const-string v3, "5oqH/dwM\n"

    const-string v4, "heXyk6gk+d0=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v2, v3, v4}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    const v3, 0x19c9ed

    :goto_d2
    const v6, 0x19c9fe

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_b8

    goto :goto_d2

    :sswitch_211
    if-nez v4, :cond_77

    const v3, 0x19ca4a

    goto :goto_d2

    :cond_77
    :sswitch_212
    const v3, 0x19ca2b

    goto :goto_d2

    :sswitch_213
    sget-object v3, Lgn;->a:Lgn;

    const-string v4, "xVqGa8MYQ0vnTbB56xQ=\n"

    const-string v6, "gj/jAIV3Ly8=\n"

    invoke-static {v4, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v6, Lj9;

    const/4 v7, 0x2

    move-object/from16 v0, p1

    invoke-direct {v6, v0, v7}, Lj9;-><init>(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;I)V

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, v6}, Lgn;->j(Ljava/lang/String;Lhm;)V

    const-string v3, "IJMHDePQkYYuhA0z9NaQnhSRDD31z5aeLA==\n"

    const-string v4, "S/Z+UoC///A=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lgn;->e(Ljava/lang/String;)Z

    move-result v4

    const v3, 0x19ca69

    :goto_d3
    const v6, 0x19ca7a

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_b9

    goto :goto_d3

    :sswitch_214
    if-nez v4, :cond_78

    const v3, 0x19cac6

    goto :goto_d3

    :cond_78
    :sswitch_215
    const v3, 0x19caa7

    goto :goto_d3

    :sswitch_216
    const v2, 0x19cae5

    :goto_d4
    const v3, 0x19caf6

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_ba

    goto :goto_d4

    :sswitch_217
    const v2, 0x19cd8f

    goto :goto_d4

    :sswitch_218
    invoke-static {}, Lzt;->K()Ljava/util/ArrayList;

    move-result-object v4

    sget v6, Lff;->y:I

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v7

    const v3, 0x19cdec

    :goto_d5
    const v8, 0x19cdfd

    xor-int/2addr v3, v8

    sparse-switch v3, :sswitch_data_bb

    goto :goto_d5

    :sswitch_219
    if-lt v6, v7, :cond_79

    const v3, 0x19ce49

    goto :goto_d5

    :cond_79
    :sswitch_21a
    const v3, 0x19ce2a

    goto :goto_d5

    :sswitch_21b
    const v2, 0x19ce68

    :goto_d6
    const v3, 0x19ce79

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_bc

    goto :goto_d6

    :sswitch_21c
    const v2, 0x19ce87

    goto :goto_d6

    :sswitch_21d
    sget v3, Lff;->y:I

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ls50;

    iget-object v4, v3, Ls50;->b:Ljava/lang/String;

    const-string v6, "KI0U\n"

    const-string v7, "SeF4cnAlR3k=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    const v4, 0x19d16f

    :goto_d7
    const v7, 0x19d180

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_bd

    goto :goto_d7

    :cond_7a
    :sswitch_21e
    const v4, 0x19d1ad

    goto :goto_d7

    :sswitch_21f
    if-eqz v6, :cond_7a

    const v4, 0x19d1cc

    goto :goto_d7

    :sswitch_220
    const v2, 0x19d1eb

    :goto_d8
    const v3, 0x19d1fc

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_be

    goto :goto_d8

    :sswitch_221
    const v2, 0x19d20a

    goto :goto_d8

    :sswitch_222
    iget-object v6, v3, Ls50;->b:Ljava/lang/String;

    const-string v3, ""

    const-string v4, "WT6KDI7SsQ5UGoER\n"

    const-string v7, "OlHkaOem2GE=\n"

    invoke-static {v4, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v6}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v4, "IyXs\n"

    const-string v7, "QkmACuf1rLk=\n"

    invoke-static {v4, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    const v4, 0x19d267

    :goto_d9
    const v8, 0x19d278

    xor-int/2addr v4, v8

    sparse-switch v4, :sswitch_data_bf

    goto :goto_d9

    :sswitch_223
    if-eqz v7, :cond_7b

    const v4, 0x19d54f

    goto :goto_d9

    :cond_7b
    :sswitch_224
    const v4, 0x19d530

    goto :goto_d9

    :sswitch_225
    const v4, 0x19d56e

    :goto_da
    const v6, 0x19d57f

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_c0

    goto :goto_da

    :sswitch_226
    const v4, 0x19d58d

    goto :goto_da

    :sswitch_227
    move-object v6, v3

    :goto_db
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v4

    const v3, 0x1a3746

    :goto_dc
    const v7, 0x1a3757

    xor-int/2addr v3, v7

    sparse-switch v3, :sswitch_data_c1

    goto :goto_dc

    :sswitch_228
    if-lez v4, :cond_82

    const v3, 0x1a37a3

    goto :goto_dc

    :sswitch_229
    sget-object v7, Lpb0;->C1:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v8

    const v4, 0x19d5ea

    :goto_dd
    const v9, 0x19d5fb

    xor-int/2addr v4, v9

    sparse-switch v4, :sswitch_data_c2

    goto :goto_dd

    :sswitch_22a
    const v4, -0x4b79f562

    if-eq v8, v4, :cond_7c

    const v4, 0x19d8d2

    goto :goto_dd

    :cond_7c
    :sswitch_22b
    const v4, 0x19d628

    goto :goto_dd

    :sswitch_22c
    const v4, 0x19d8f1

    :goto_de
    const v7, 0x19d902

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_c3

    goto :goto_de

    :cond_7d
    :sswitch_22d
    const v4, 0x19d92f

    goto :goto_de

    :sswitch_22e
    const v4, -0x32158c51

    if-eq v8, v4, :cond_7d

    const v4, 0x19d94e

    goto :goto_de

    :sswitch_22f
    const v4, 0x19d96d

    :goto_df
    const v7, 0x19d97e

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_c4

    goto :goto_df

    :sswitch_230
    const v4, 0x5e0f67f

    if-eq v8, v4, :cond_7e

    const v4, 0x19d9ca

    goto :goto_df

    :cond_7e
    :sswitch_231
    const v4, 0x19d9ab

    goto :goto_df

    :sswitch_232
    const v4, 0x19d9e9

    :goto_e0
    const v6, 0x19d9fa

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_c5

    goto :goto_e0

    :sswitch_233
    const v4, 0x19dc93

    goto :goto_e0

    :sswitch_234
    move-object v6, v3

    goto :goto_db

    :sswitch_235
    const-string v4, "W4tcv6c=\n"

    const-string v7, "PPkzytfnHGI=\n"

    invoke-static {v4, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    const v4, 0x19dcf0

    :goto_e1
    const v7, 0x19dd01

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_c6

    goto :goto_e1

    :cond_7f
    :sswitch_236
    const v4, 0x19dd2e

    goto :goto_e1

    :sswitch_237
    if-nez v6, :cond_7f

    const v4, 0x19dd4d

    goto :goto_e1

    :sswitch_238
    const v4, 0x19dd6c

    :goto_e2
    const v6, 0x19dd7d

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_c7

    goto :goto_e2

    :sswitch_239
    const v4, 0x19dd8b

    goto :goto_e2

    :sswitch_23a
    move-object v6, v3

    goto/16 :goto_db

    :sswitch_23b
    const-string v3, "WCzy7ImDfTFLO/Ttkch6MU898+OSgy8OYwTYotjDTyFCLunwkIliZQ==\n"

    const-string v4, "Kk+dgv/mD0I=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const v4, 0x1a2f48

    :goto_e3
    const v6, 0x1a2f59

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_c8

    goto :goto_e3

    :sswitch_23c
    const v4, 0x1a2f67

    goto :goto_e3

    :sswitch_23d
    move-object v6, v3

    goto/16 :goto_db

    :sswitch_23e
    const-string v4, "SPZspLkO\n"

    const-string v7, "PZgewdhqq2s=\n"

    invoke-static {v4, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    const v4, 0x1a2fc4

    :goto_e4
    const v7, 0x1a2fd5

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_c9

    goto :goto_e4

    :sswitch_23f
    if-nez v6, :cond_80

    const v4, 0x1a3021

    goto :goto_e4

    :cond_80
    :sswitch_240
    const v4, 0x1a3002

    goto :goto_e4

    :sswitch_241
    const v4, 0x1a3040

    :goto_e5
    const v6, 0x1a3051

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_ca

    goto :goto_e5

    :sswitch_242
    const v4, 0x1a32ea

    goto :goto_e5

    :sswitch_243
    move-object v6, v3

    goto/16 :goto_db

    :sswitch_244
    const-string v3, "jSdb2g02Y/2eMF3bFX1k4K0hVdA4PGTgi2QKlEs=\n"

    const-string v4, "/0Q0tHtTEY4=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const v4, 0x1a3347

    :goto_e6
    const v6, 0x1a3358

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_cb

    goto :goto_e6

    :sswitch_245
    const v4, 0x1a3366

    goto :goto_e6

    :sswitch_246
    move-object v6, v3

    goto/16 :goto_db

    :sswitch_247
    const-string v4, "OHbTd/Ki\n"

    const-string v8, "XgS6EpzGNDE=\n"

    invoke-static {v4, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    const v4, 0x1a33c3

    :goto_e7
    const v8, 0x1a33d4

    xor-int/2addr v4, v8

    sparse-switch v4, :sswitch_data_cc

    goto :goto_e7

    :sswitch_248
    if-nez v6, :cond_81

    const v4, 0x1a36ab

    goto :goto_e7

    :cond_81
    :sswitch_249
    const v4, 0x1a3401

    goto :goto_e7

    :sswitch_24a
    const v4, 0x1a36ca

    :goto_e8
    const v6, 0x1a36db

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_cd

    goto :goto_e8

    :sswitch_24b
    const v4, 0x1a36e9

    goto :goto_e8

    :sswitch_24c
    move-object v6, v3

    goto/16 :goto_db

    :sswitch_24d
    const-string v3, "rconversation.username NOT LIKE \'%@chatroom\' AND rconversation.username NOT LIKE \'gh_%\' AND rconversation.username NOT IN ("

    const-string v4, ")"

    invoke-static {v3, v7, v4}, Lz30;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object v6, v3

    goto/16 :goto_db

    :cond_82
    :sswitch_24e
    const v3, 0x1a3784

    goto/16 :goto_dc

    :sswitch_24f
    const/4 v3, 0x1

    const v4, 0x1a37c2

    :goto_e9
    const v7, 0x1a37d3

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_ce

    goto :goto_e9

    :sswitch_250
    const v4, 0x1a3a6c

    goto :goto_e9

    :sswitch_251
    const/4 v3, 0x0

    :sswitch_252
    const v4, 0x1a3ac9

    :goto_ea
    const v7, 0x1a3ada

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_cf

    goto :goto_ea

    :sswitch_253
    if-eqz v3, :cond_83

    const v4, 0x1a3b26

    goto :goto_ea

    :cond_83
    :sswitch_254
    const v4, 0x1a3b07

    goto :goto_ea

    :sswitch_255
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "ONZZmCuoJ/gtynDfcuN7kg==\n"

    const-string v7, "TLkV91zNVbs=\n"

    invoke-static {v4, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v3}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v7

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Integer;

    const/4 v8, 0x0

    const-string v9, "ZqO9Zfs76/4/5A==\n"

    const-string v10, "RsTPCo5Ly5w=\n"

    invoke-static {v9, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x6

    invoke-static {v3, v9, v10}, Lb50;->I(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v4, v8

    const/4 v8, 0x1

    const-string v9, "g+/P7Sb011naoA==\n"

    const-string v10, "o4C9iUOG9zs=\n"

    invoke-static {v9, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x6

    invoke-static {v3, v9, v10}, Lb50;->I(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v4, v8

    const/4 v8, 0x2

    const-string v9, "mDVRRx31Ow==\n"

    const-string v10, "uFk4KnSBG0M=\n"

    invoke-static {v9, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x6

    invoke-static {v3, v9, v10}, Lb50;->I(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v4, v8

    invoke-static {v4}, Lbb;->f0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :sswitch_256
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const v3, 0x1a3b45

    :goto_eb
    const v8, 0x1a3b56

    xor-int/2addr v3, v8

    sparse-switch v3, :sswitch_data_d0

    goto :goto_eb

    :sswitch_257
    if-eqz v4, :cond_84

    const v3, 0x1a3e2d

    goto :goto_eb

    :cond_84
    :sswitch_258
    const v3, 0x1a3b83

    goto :goto_eb

    :sswitch_259
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v3, v4

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v8

    const v3, 0x1a3e4c

    :goto_ec
    const v11, 0x1a3e5d

    xor-int/2addr v3, v11

    sparse-switch v3, :sswitch_data_d1

    goto :goto_ec

    :sswitch_25a
    const/4 v3, -0x1

    if-eq v8, v3, :cond_85

    const v3, 0x1a3ea9

    goto :goto_ec

    :cond_85
    :sswitch_25b
    const v3, 0x1a3e8a

    goto :goto_ec

    :sswitch_25c
    const/4 v3, 0x1

    const v8, 0x1a3ec8

    :goto_ed
    const v11, 0x1a3ed9

    xor-int/2addr v8, v11

    sparse-switch v8, :sswitch_data_d2

    goto :goto_ed

    :sswitch_25d
    const v8, 0x1a3ee7

    goto :goto_ed

    :sswitch_25e
    const/4 v3, 0x0

    :sswitch_25f
    const v8, 0x1a3f44

    :goto_ee
    const v11, 0x1a3f55

    xor-int/2addr v8, v11

    sparse-switch v8, :sswitch_data_d3

    goto :goto_ee

    :sswitch_260
    if-eqz v3, :cond_86

    const v8, 0x1a422c

    goto :goto_ee

    :cond_86
    :sswitch_261
    const v8, 0x1a420d

    goto :goto_ee

    :sswitch_262
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v3, 0x1a424b

    :goto_ef
    const v4, 0x1a425c

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_d4

    goto :goto_ef

    :sswitch_263
    const v3, 0x1a426a

    goto :goto_ef

    :sswitch_264
    invoke-static {v9}, Lab;->k0(Ljava/util/ArrayList;)Ljava/lang/Comparable;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    const v4, 0x1a42c7

    :goto_f0
    const v8, 0x1a42d8

    xor-int/2addr v4, v8

    sparse-switch v4, :sswitch_data_d5

    goto :goto_f0

    :sswitch_265
    if-eqz v3, :cond_87

    const v4, 0x1a45af

    goto :goto_f0

    :cond_87
    :sswitch_266
    const v4, 0x1a4305

    goto :goto_f0

    :sswitch_267
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    :goto_f1
    const/4 v4, 0x0

    invoke-virtual {v2, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    const-string v4, "ifTJ4uAfLZedqYW/ukQ=\n"

    const-string v8, "+oGrkZRtRPk=\n"

    invoke-static {v4, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v7}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v8

    const-string v2, "XC/qja11S49IcqbQ9y4=\n"

    const-string v3, "L1qI/tkHIuE=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v8}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v7, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "OVPEiQRo0h0sT+3OXSOOdw==\n"

    const-string v4, "TTyI5nMNoF4=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v3, "ss1ec3DljQ==\n"

    const-string v4, "kro2FgKArVA=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    const v2, 0x1a45ce

    :goto_f2
    const v4, 0x1a45df

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_d6

    goto :goto_f2

    :sswitch_268
    if-eqz v3, :cond_88

    const v2, 0x1a462b

    goto :goto_f2

    :cond_88
    :sswitch_269
    const v2, 0x1a460c

    goto :goto_f2

    :sswitch_26a
    const-string v3, "QFgRDzY=\n"

    const-string v2, "YBlfSxZ3C7I=\n"

    :sswitch_26b
    invoke-static {v3, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const v2, 0x1a464a

    :goto_f3
    const v4, 0x1a465b

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_d7

    goto :goto_f3

    :sswitch_26c
    const v2, 0x1a4669

    goto :goto_f3

    :sswitch_26d
    const-string v3, "Cgta2R2QUw==\n"

    const-string v2, "KlwSnE/Vc58=\n"

    const v4, 0x1a46c6

    :goto_f4
    const v9, 0x1a46d7

    xor-int/2addr v4, v9

    sparse-switch v4, :sswitch_data_d8

    goto :goto_f4

    :sswitch_26e
    const v4, 0x1a4970

    goto :goto_f4

    :sswitch_26f
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ") "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p1

    iget-object v3, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    aput-object v2, v3, v5

    goto/16 :goto_0

    :pswitch_15
    const-string v2, "pQ==\n"

    const-string v3, "1Vc4X3SAwMk=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p1

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v2, Lgn;->a:Lgn;

    const-string v3, "IsbcQNY40cwEyNJG5g==\n"

    const-string v4, "Ya69NINxjo4=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lj9;

    const/4 v5, 0x0

    move-object/from16 v0, p1

    invoke-direct {v4, v0, v5}, Lj9;-><init>(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;I)V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v4}, Lgn;->j(Ljava/lang/String;Lhm;)V

    goto/16 :goto_0

    :catchall_8
    move-exception v2

    const v2, 0x1a49cd

    :goto_f5
    const v5, 0x1a49de

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_d9

    goto :goto_f5

    :sswitch_270
    const v2, 0x1a49ec

    goto :goto_f5

    :catchall_9
    move-exception v7

    const v7, 0x1a4a49

    :goto_f6
    const v10, 0x1a4a5a

    xor-int/2addr v7, v10

    sparse-switch v7, :sswitch_data_da

    goto :goto_f6

    :sswitch_271
    const v7, 0x1a4a68

    goto :goto_f6

    :sswitch_272
    move v3, v7

    goto/16 :goto_f1

    :sswitch_273
    move-object v2, v10

    goto/16 :goto_96

    :sswitch_274
    move-object v3, v9

    goto/16 :goto_7d

    :sswitch_275
    move-object v3, v8

    goto/16 :goto_78

    :sswitch_276
    move-object v2, v7

    goto/16 :goto_25

    :sswitch_277
    move-object v2, v6

    goto/16 :goto_1e

    :sswitch_278
    move-object v2, v4

    goto/16 :goto_10

    :sswitch_279
    move-object v2, v3

    goto/16 :goto_6

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_0
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_e
        :pswitch_d
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x31 -> :sswitch_2
        0xcc -> :sswitch_3
        0xef -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_8
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_7
        0xb97b -> :sswitch_9
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_a
        0x2d -> :sswitch_0
        0x4c -> :sswitch_c
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_d
        0x35 -> :sswitch_279
        0x1f7 -> :sswitch_e
        0x7eef -> :sswitch_f
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_11
        0x4c -> :sswitch_12
        0x53 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_0
        0xf1 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_15
        0x6af -> :sswitch_16
        0x6c8 -> :sswitch_0
        0x6e9 -> :sswitch_17
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_18
        0x2d -> :sswitch_22
        0x32 -> :sswitch_19
        0x4c -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1b
        0x35 -> :sswitch_21
        0xf3 -> :sswitch_1c
        0xfeb -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1e
        0x36 -> :sswitch_1f
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xf1 -> :sswitch_20
        0x7ab -> :sswitch_23
        0x7c8 -> :sswitch_278
        0x7e9 -> :sswitch_24
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0xe
        :pswitch_a
        :pswitch_b
        :pswitch_b
        :pswitch_c
    .end packed-switch

    :sswitch_data_c
    .sparse-switch
        0x17 -> :sswitch_25
        0x36 -> :sswitch_26
        0x55 -> :sswitch_29
        0x74 -> :sswitch_27
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0xe -> :sswitch_0
        0x3ef -> :sswitch_28
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0x11 -> :sswitch_2a
        0x32 -> :sswitch_2b
        0x53 -> :sswitch_32
        0x74 -> :sswitch_2c
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_2d
        0x32 -> :sswitch_2e
        0x4c -> :sswitch_2f
        0x53 -> :sswitch_32
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x3f1 -> :sswitch_30
        0x6a7 -> :sswitch_31
        0x6c8 -> :sswitch_0
        0x6e9 -> :sswitch_32
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x13 -> :sswitch_34
        0x32 -> :sswitch_35
        0x55 -> :sswitch_39
        0x74 -> :sswitch_36
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x13 -> :sswitch_37
        0x32 -> :sswitch_33
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x11 -> :sswitch_38
        0x3e -> :sswitch_3b
    .end sparse-switch

    :sswitch_data_14
    .sparse-switch
        0x11 -> :sswitch_3a
        0x36 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_15
    .sparse-switch
        0x11 -> :sswitch_3c
        0x5bb -> :sswitch_3d
        0x5d8 -> :sswitch_40
        0x5f9 -> :sswitch_3e
    .end sparse-switch

    :sswitch_data_16
    .sparse-switch
        0x1f -> :sswitch_3f
        0x3e -> :sswitch_41
    .end sparse-switch

    :sswitch_data_17
    .sparse-switch
        0x17 -> :sswitch_42
        0x36 -> :sswitch_43
        0x55 -> :sswitch_0
        0x17dd84 -> :sswitch_44
    .end sparse-switch

    :sswitch_data_18
    .sparse-switch
        0xe -> :sswitch_45
        0x2d -> :sswitch_277
        0x6f -> :sswitch_46
        0x1cc -> :sswitch_47
    .end sparse-switch

    :sswitch_data_19
    .sparse-switch
        0x17 -> :sswitch_48
        0x55 -> :sswitch_4c
        0x76 -> :sswitch_49
        0xb4 -> :sswitch_4a
    .end sparse-switch

    :sswitch_data_1a
    .sparse-switch
        0x1f -> :sswitch_4b
        0x5e9 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1b
    .sparse-switch
        0x11 -> :sswitch_4d
        0x53 -> :sswitch_52
        0x72 -> :sswitch_4e
        0x1b4 -> :sswitch_4f
    .end sparse-switch

    :sswitch_data_1c
    .sparse-switch
        0x11 -> :sswitch_50
        0x53 -> :sswitch_56
        0x72 -> :sswitch_51
        0xd29 -> :sswitch_52
    .end sparse-switch

    :sswitch_data_1d
    .sparse-switch
        0x12 -> :sswitch_53
        0x2d -> :sswitch_56
        0x73 -> :sswitch_54
        0xcc -> :sswitch_55
    .end sparse-switch

    :sswitch_data_1e
    .sparse-switch
        0x13 -> :sswitch_57
        0x55 -> :sswitch_276
        0x72 -> :sswitch_58
        0x1b4 -> :sswitch_59
    .end sparse-switch

    :sswitch_data_1f
    .sparse-switch
        0x13 -> :sswitch_5a
        0x2c8 -> :sswitch_0
        0x2e9 -> :sswitch_5b
        0x52b -> :sswitch_5c
    .end sparse-switch

    :sswitch_data_20
    .sparse-switch
        0xe -> :sswitch_5d
        0x2f -> :sswitch_61
        0x71 -> :sswitch_5e
        0xcc -> :sswitch_5f
    .end sparse-switch

    :sswitch_data_21
    .sparse-switch
        0x11 -> :sswitch_60
        0x76 -> :sswitch_62
    .end sparse-switch

    :sswitch_data_22
    .sparse-switch
        0x16 -> :sswitch_63
        0x35 -> :sswitch_67
        0x77 -> :sswitch_64
        0x1fd4 -> :sswitch_65
    .end sparse-switch

    :sswitch_data_23
    .sparse-switch
        0xe -> :sswitch_0
        0x6f -> :sswitch_66
    .end sparse-switch

    :sswitch_data_24
    .sparse-switch
        0x17 -> :sswitch_68
        0x32f -> :sswitch_6a
        0x3c8 -> :sswitch_6e
        0x3e9 -> :sswitch_69
    .end sparse-switch

    :sswitch_data_25
    .sparse-switch
        0x12 -> :sswitch_6b
        0x71 -> :sswitch_6d
    .end sparse-switch

    :sswitch_data_26
    .sparse-switch
        0x11 -> :sswitch_6c
        0x53 -> :sswitch_72
        0x72 -> :sswitch_6f
        0x329 -> :sswitch_70
    .end sparse-switch

    :sswitch_data_27
    .sparse-switch
        0x12 -> :sswitch_0
        0x73 -> :sswitch_71
    .end sparse-switch

    :sswitch_data_28
    .sparse-switch
        0x12 -> :sswitch_73
        0x2d -> :sswitch_77
        0x73 -> :sswitch_74
        0xfcc -> :sswitch_75
    .end sparse-switch

    :sswitch_data_29
    .sparse-switch
        0x13 -> :sswitch_76
        0x2e9 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_2a
    .sparse-switch
        0x16 -> :sswitch_78
        0x37 -> :sswitch_da
        0x71 -> :sswitch_79
        0xd4 -> :sswitch_7a
    .end sparse-switch

    :sswitch_data_2b
    .sparse-switch
        0xe -> :sswitch_7b
        0x2f -> :sswitch_d8
        0x71 -> :sswitch_7c
        0x559 -> :sswitch_7d
    .end sparse-switch

    :sswitch_data_2c
    .sparse-switch
        0x1e -> :sswitch_7e
        0x3d -> :sswitch_87
        0x7f -> :sswitch_7f
        0x1dc -> :sswitch_80
    .end sparse-switch

    :sswitch_data_2d
    .sparse-switch
        0x16 -> :sswitch_81
        0x35 -> :sswitch_85
        0x77 -> :sswitch_82
        0xd4 -> :sswitch_83
    .end sparse-switch

    :sswitch_data_2e
    .sparse-switch
        0x6f -> :sswitch_84
        0x3d99 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_2f
    .sparse-switch
        0x12 -> :sswitch_0
        0x71 -> :sswitch_86
    .end sparse-switch

    :sswitch_data_30
    .sparse-switch
        0x12 -> :sswitch_88
        0x33 -> :sswitch_8c
        0x71 -> :sswitch_89
        0x57ac -> :sswitch_8a
    .end sparse-switch

    :sswitch_data_31
    .sparse-switch
        0x11 -> :sswitch_8b
        0x32 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_32
    .sparse-switch
        0x11 -> :sswitch_8d
        0x32 -> :sswitch_8e
        0x53 -> :sswitch_91
        0x7c -> :sswitch_8f
    .end sparse-switch

    :sswitch_data_33
    .sparse-switch
        0x11 -> :sswitch_90
        0xea7 -> :sswitch_92
    .end sparse-switch

    :sswitch_data_34
    .sparse-switch
        0x13 -> :sswitch_93
        0x32 -> :sswitch_94
        0x55 -> :sswitch_96
        0x74 -> :sswitch_95
    .end sparse-switch

    :sswitch_data_35
    .sparse-switch
        0x13 -> :sswitch_97
        0x32 -> :sswitch_98
        0x5d -> :sswitch_a7
        0x5eb -> :sswitch_99
    .end sparse-switch

    :sswitch_data_36
    .sparse-switch
        0xe -> :sswitch_9a
        0x31 -> :sswitch_9b
        0x4c -> :sswitch_9c
        0x6f -> :sswitch_a7
    .end sparse-switch

    :sswitch_data_37
    .sparse-switch
        0x11 -> :sswitch_9d
        0x36 -> :sswitch_9e
        0x57 -> :sswitch_a7
        0x74 -> :sswitch_9f
    .end sparse-switch

    :sswitch_data_38
    .sparse-switch
        0x11 -> :sswitch_a0
        0xfdab -> :sswitch_a1
        0xfdc8 -> :sswitch_a3
        0xfde9 -> :sswitch_a2
    .end sparse-switch

    :sswitch_data_39
    .sparse-switch
        0xe -> :sswitch_a4
        0x2f -> :sswitch_a6
    .end sparse-switch

    :sswitch_data_3a
    .sparse-switch
        0x17 -> :sswitch_a5
        0x36 -> :sswitch_a7
    .end sparse-switch

    :sswitch_data_3b
    .sparse-switch
        0x12 -> :sswitch_a8
        0x31 -> :sswitch_a9
        0x4c -> :sswitch_aa
        0x73 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_3c
    .sparse-switch
        0x11 -> :sswitch_ab
        0x32 -> :sswitch_ac
        0x53 -> :sswitch_c8
        0x74 -> :sswitch_ad
    .end sparse-switch

    :sswitch_data_3d
    .sparse-switch
        0x11 -> :sswitch_ae
        0x2af -> :sswitch_af
        0x2c8 -> :sswitch_c6
        0x2e9 -> :sswitch_b0
    .end sparse-switch

    :sswitch_data_3e
    .sparse-switch
        0x12 -> :sswitch_b1
        0x33 -> :sswitch_b2
        0x4c -> :sswitch_b3
        0x6d -> :sswitch_c4
    .end sparse-switch

    :sswitch_data_3f
    .sparse-switch
        0x13 -> :sswitch_b4
        0x32 -> :sswitch_b5
        0x55 -> :sswitch_bf
        0x3eb -> :sswitch_b6
    .end sparse-switch

    :sswitch_data_40
    .sparse-switch
        0x16 -> :sswitch_b7
        0x31 -> :sswitch_b8
        0x54 -> :sswitch_b9
        0x77 -> :sswitch_bd
    .end sparse-switch

    :sswitch_data_41
    .sparse-switch
        0xe -> :sswitch_ba
        0x31 -> :sswitch_bc
    .end sparse-switch

    :sswitch_data_42
    .sparse-switch
        0x11 -> :sswitch_bb
        0x2a7 -> :sswitch_c9
        0x2c8 -> :sswitch_d1
        0x2e9 -> :sswitch_ca
    .end sparse-switch

    :sswitch_data_43
    .sparse-switch
        0x11 -> :sswitch_be
        0x3ab -> :sswitch_ba
    .end sparse-switch

    :sswitch_data_44
    .sparse-switch
        0x16 -> :sswitch_c0
        0x37 -> :sswitch_c1
        0x54 -> :sswitch_c2
        0x75 -> :sswitch_ba
    .end sparse-switch

    :sswitch_data_45
    .sparse-switch
        0xe -> :sswitch_ba
        0x2f -> :sswitch_c3
    .end sparse-switch

    :sswitch_data_46
    .sparse-switch
        0x12 -> :sswitch_ba
        0x31 -> :sswitch_c5
    .end sparse-switch

    :sswitch_data_47
    .sparse-switch
        0x12 -> :sswitch_ba
        0x31 -> :sswitch_c7
    .end sparse-switch

    :sswitch_data_48
    .sparse-switch
        0x12 -> :sswitch_cb
        0x33 -> :sswitch_cc
        0x54 -> :sswitch_cd
        0x75 -> :sswitch_d1
    .end sparse-switch

    :sswitch_data_49
    .sparse-switch
        0x12 -> :sswitch_ce
        0x33 -> :sswitch_d0
    .end sparse-switch

    :sswitch_data_4a
    .sparse-switch
        0x13 -> :sswitch_cf
        0x779 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_4b
    .sparse-switch
        0x13 -> :sswitch_d2
        0xb4 -> :sswitch_d4
        0xd5 -> :sswitch_ce
        0xf2 -> :sswitch_d3
    .end sparse-switch

    :sswitch_data_4c
    .sparse-switch
        0x13 -> :sswitch_d5
        0x3bc -> :sswitch_d7
        0x3dd -> :sswitch_ce
        0x3f2 -> :sswitch_d6
    .end sparse-switch

    :sswitch_data_4d
    .sparse-switch
        0x11 -> :sswitch_d9
        0xf6 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_4e
    .sparse-switch
        0x11 -> :sswitch_db
        0x3df -> :sswitch_e1
        0x3fe -> :sswitch_dc
        0x1d29 -> :sswitch_dd
    .end sparse-switch

    :sswitch_data_4f
    .sparse-switch
        0xe -> :sswitch_de
        0x1ef -> :sswitch_e0
    .end sparse-switch

    :sswitch_data_50
    .sparse-switch
        0x17 -> :sswitch_df
        0xb4 -> :sswitch_e3
        0xd5 -> :sswitch_e4
        0xf6 -> :sswitch_e2
    .end sparse-switch

    :sswitch_data_51
    .sparse-switch
        0x1f -> :sswitch_e5
        0x537 -> :sswitch_e7
        0x548 -> :sswitch_e9
        0x569 -> :sswitch_e6
    .end sparse-switch

    :sswitch_data_52
    .sparse-switch
        0x11 -> :sswitch_e8
        0x1f2 -> :sswitch_ea
    .end sparse-switch

    :sswitch_data_53
    .sparse-switch
        0x11 -> :sswitch_eb
        0xd3 -> :sswitch_ee
        0xf2 -> :sswitch_ec
        0xd29 -> :sswitch_ed
    .end sparse-switch

    :sswitch_data_54
    .sparse-switch
        0x12 -> :sswitch_ef
        0x2d -> :sswitch_f3
        0x4c -> :sswitch_f1
        0xf3 -> :sswitch_f0
    .end sparse-switch

    :sswitch_data_55
    .sparse-switch
        0x13 -> :sswitch_f2
        0x1f2 -> :sswitch_f4
    .end sparse-switch

    :sswitch_data_56
    .sparse-switch
        0x13 -> :sswitch_f5
        0x52b -> :sswitch_f7
        0x548 -> :sswitch_f8
        0x569 -> :sswitch_f6
    .end sparse-switch

    :sswitch_data_57
    .sparse-switch
        0xe -> :sswitch_f9
        0x2f -> :sswitch_fd
        0x4c -> :sswitch_fb
        0xf1 -> :sswitch_fa
    .end sparse-switch

    :sswitch_data_58
    .sparse-switch
        0x11 -> :sswitch_fc
        0x1f6 -> :sswitch_fe
    .end sparse-switch

    :sswitch_data_59
    .sparse-switch
        0x16 -> :sswitch_ff
        0x35 -> :sswitch_102
        0x54 -> :sswitch_101
        0xffff7 -> :sswitch_100
    .end sparse-switch

    :sswitch_data_5a
    .sparse-switch
        0xe -> :sswitch_103
        0x2d -> :sswitch_107
        0x4c -> :sswitch_105
        0xef -> :sswitch_104
    .end sparse-switch

    :sswitch_data_5b
    .sparse-switch
        0x17 -> :sswitch_106
        0x369 -> :sswitch_108
    .end sparse-switch

    :sswitch_data_5c
    .sparse-switch
        0x12 -> :sswitch_109
        0x33 -> :sswitch_10f
        0x4c -> :sswitch_10b
        0x7f1 -> :sswitch_10a
    .end sparse-switch

    :sswitch_data_5d
    .sparse-switch
        0x11 -> :sswitch_10c
        0xd3 -> :sswitch_10f
        0xf2 -> :sswitch_10d
        0x329 -> :sswitch_10e
    .end sparse-switch

    :sswitch_data_5e
    .sparse-switch
        0x12 -> :sswitch_110
        0x35 -> :sswitch_116
        0x54 -> :sswitch_112
        0xf3 -> :sswitch_111
    .end sparse-switch

    :sswitch_data_5f
    .sparse-switch
        0x12 -> :sswitch_113
        0xff3 -> :sswitch_115
    .end sparse-switch

    :sswitch_data_60
    .sparse-switch
        0x13 -> :sswitch_114
        0x32b -> :sswitch_118
        0x348 -> :sswitch_11c
        0x369 -> :sswitch_117
    .end sparse-switch

    :sswitch_data_61
    .sparse-switch
        0x16 -> :sswitch_119
        0x37 -> :sswitch_11c
        0x54 -> :sswitch_11b
        0xf1 -> :sswitch_11a
    .end sparse-switch

    :sswitch_data_62
    .sparse-switch
        0xe -> :sswitch_11d
        0x2f -> :sswitch_121
        0x7f1 -> :sswitch_11e
        0x51ac -> :sswitch_11f
    .end sparse-switch

    :sswitch_data_63
    .sparse-switch
        0x11 -> :sswitch_120
        0x36 -> :sswitch_122
    .end sparse-switch

    :sswitch_data_64
    .sparse-switch
        0x11 -> :sswitch_123
        0x3e -> :sswitch_124
        0xdf -> :sswitch_129
        0xfc -> :sswitch_125
    .end sparse-switch

    :sswitch_data_65
    .sparse-switch
        0x11 -> :sswitch_126
        0x3f58 -> :sswitch_129
        0x3f79 -> :sswitch_128
        0x3fbb -> :sswitch_127
    .end sparse-switch

    :sswitch_data_66
    .sparse-switch
        0x17 -> :sswitch_12a
        0x36 -> :sswitch_12b
        0x3d5 -> :sswitch_12e
        0x3f4 -> :sswitch_12c
    .end sparse-switch

    :sswitch_data_67
    .sparse-switch
        0x1f -> :sswitch_12d
        0x3e -> :sswitch_12f
    .end sparse-switch

    :sswitch_data_68
    .sparse-switch
        0x11 -> :sswitch_130
        0x32 -> :sswitch_131
        0xd3 -> :sswitch_136
        0xf4 -> :sswitch_132
    .end sparse-switch

    :sswitch_data_69
    .sparse-switch
        0x11 -> :sswitch_133
        0x32 -> :sswitch_134
        0x3d3 -> :sswitch_136
        0x3fc -> :sswitch_135
    .end sparse-switch

    :sswitch_data_6a
    .sparse-switch
        0x11 -> :sswitch_137
        0xea7 -> :sswitch_138
        0xf58 -> :sswitch_275
        0xf79 -> :sswitch_139
    .end sparse-switch

    :sswitch_data_6b
    .sparse-switch
        0x13 -> :sswitch_13a
        0x32 -> :sswitch_13b
        0xd5 -> :sswitch_140
        0xf4 -> :sswitch_13c
    .end sparse-switch

    :sswitch_data_6c
    .sparse-switch
        0x13 -> :sswitch_13d
        0x32 -> :sswitch_13e
        0x3dd -> :sswitch_140
        0x56b -> :sswitch_13f
    .end sparse-switch

    :sswitch_data_6d
    .sparse-switch
        0xe -> :sswitch_141
        0x31 -> :sswitch_142
        0x1cc -> :sswitch_143
        0x1ef -> :sswitch_0
    .end sparse-switch

    :sswitch_data_6e
    .sparse-switch
        0x11 -> :sswitch_144
        0x36 -> :sswitch_145
        0xd7 -> :sswitch_274
        0xf4 -> :sswitch_146
    .end sparse-switch

    :sswitch_data_6f
    .sparse-switch
        0x11 -> :sswitch_147
        0x1d48 -> :sswitch_0
        0x1d69 -> :sswitch_149
        0x1dab -> :sswitch_148
    .end sparse-switch

    :sswitch_data_70
    .sparse-switch
        0xe -> :sswitch_14a
        0x2f -> :sswitch_14b
        0x1cc -> :sswitch_14c
        0x1ed -> :sswitch_0
    .end sparse-switch

    :sswitch_data_71
    .sparse-switch
        0x17 -> :sswitch_14d
        0x36 -> :sswitch_14e
        0xd5 -> :sswitch_0
        0x56f -> :sswitch_14f
    .end sparse-switch

    :sswitch_data_72
    .sparse-switch
        0x12 -> :sswitch_150
        0x31 -> :sswitch_151
        0xcc -> :sswitch_152
        0xf3 -> :sswitch_154
    .end sparse-switch

    :sswitch_data_73
    .sparse-switch
        0x11 -> :sswitch_153
        0x32 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_74
    .sparse-switch
        0x11 -> :sswitch_155
        0x2af -> :sswitch_156
        0xd48 -> :sswitch_158
        0xd69 -> :sswitch_157
    .end sparse-switch

    :sswitch_data_75
    .sparse-switch
        0x12 -> :sswitch_158
        0x33 -> :sswitch_15a
    .end sparse-switch

    :sswitch_data_76
    .sparse-switch
        0x11 -> :sswitch_159
        0x3ab -> :sswitch_152
    .end sparse-switch

    :sswitch_data_77
    .sparse-switch
        0x13 -> :sswitch_15b
        0x32 -> :sswitch_160
    .end sparse-switch

    :sswitch_data_78
    .sparse-switch
        0x16 -> :sswitch_15d
        0x31 -> :sswitch_15e
    .end sparse-switch

    :sswitch_data_79
    .sparse-switch
        0xe -> :sswitch_15c
        0x31 -> :sswitch_15f
    .end sparse-switch

    :sswitch_data_7a
    .sparse-switch
        0x16 -> :sswitch_152
        0x37 -> :sswitch_161
    .end sparse-switch

    :sswitch_data_7b
    .sparse-switch
        0xe -> :sswitch_163
        0x2f -> :sswitch_164
        0xed -> :sswitch_16e
        0x526c -> :sswitch_165
    .end sparse-switch

    :sswitch_data_7c
    .sparse-switch
        0x17 -> :sswitch_166
        0x55 -> :sswitch_16c
        0x76 -> :sswitch_167
        0xb4 -> :sswitch_168
    .end sparse-switch

    :sswitch_data_7d
    .sparse-switch
        0x1f -> :sswitch_169
        0x7e -> :sswitch_16a
    .end sparse-switch

    :sswitch_data_7e
    .sparse-switch
        0x11 -> :sswitch_16b
        0x53 -> :sswitch_174
        0x72 -> :sswitch_16f
        0xbc -> :sswitch_170
    .end sparse-switch

    :sswitch_data_7f
    .sparse-switch
        0x17 -> :sswitch_16d
        0x6f9 -> :sswitch_162
    .end sparse-switch

    :sswitch_data_80
    .sparse-switch
        0x11 -> :sswitch_171
        0x72 -> :sswitch_172
    .end sparse-switch

    :sswitch_data_81
    .sparse-switch
        0x13 -> :sswitch_173
        0x55 -> :sswitch_178
        0x72 -> :sswitch_175
        0x3b4 -> :sswitch_176
    .end sparse-switch

    :sswitch_data_82
    .sparse-switch
        0x13 -> :sswitch_177
        0x72 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_83
    .sparse-switch
        0x13 -> :sswitch_179
        0x73b -> :sswitch_17b
        0x7d8 -> :sswitch_186
        0x7f9 -> :sswitch_17a
    .end sparse-switch

    :sswitch_data_84
    .sparse-switch
        0x11 -> :sswitch_17c
        0x57 -> :sswitch_273
        0x76 -> :sswitch_17d
        0x3b4 -> :sswitch_17e
    .end sparse-switch

    :sswitch_data_85
    .sparse-switch
        0x11 -> :sswitch_17f
        0x5f -> :sswitch_183
        0x7e -> :sswitch_180
        0x3f29 -> :sswitch_181
    .end sparse-switch

    :sswitch_data_86
    .sparse-switch
        0xe -> :sswitch_0
        0x6f -> :sswitch_182
    .end sparse-switch

    :sswitch_data_87
    .sparse-switch
        0x17 -> :sswitch_184
        0x76 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_88
    .sparse-switch
        0x1f -> :sswitch_185
        0x6e9 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_89
    .sparse-switch
        0x11 -> :sswitch_187
        0x53 -> :sswitch_18c
        0x72 -> :sswitch_188
        0xb4 -> :sswitch_189
    .end sparse-switch

    :sswitch_data_8a
    .sparse-switch
        0x11 -> :sswitch_18a
        0x53 -> :sswitch_0
        0x72 -> :sswitch_18b
        0xd29 -> :sswitch_18c
    .end sparse-switch

    :sswitch_data_8b
    .sparse-switch
        0x12 -> :sswitch_18d
        0x2d -> :sswitch_0
        0x73 -> :sswitch_18e
        0x1cc -> :sswitch_18f
    .end sparse-switch

    :sswitch_data_8c
    .sparse-switch
        0x13 -> :sswitch_190
        0x55 -> :sswitch_0
        0x72 -> :sswitch_191
        0xb4 -> :sswitch_192
    .end sparse-switch

    :sswitch_data_8d
    .sparse-switch
        0x13 -> :sswitch_193
        0x52b -> :sswitch_195
        0x5c8 -> :sswitch_0
        0x5e9 -> :sswitch_194
    .end sparse-switch

    :sswitch_data_8e
    .sparse-switch
        0xe -> :sswitch_196
        0x2f -> :sswitch_0
        0x71 -> :sswitch_197
        0x1cc -> :sswitch_198
    .end sparse-switch

    :sswitch_data_8f
    .sparse-switch
        0x11 -> :sswitch_19a
        0x57 -> :sswitch_1ad
        0x76 -> :sswitch_19b
        0x1d29 -> :sswitch_19c
    .end sparse-switch

    :sswitch_data_90
    .sparse-switch
        0x16 -> :sswitch_19d
        0x35 -> :sswitch_199
        0x77 -> :sswitch_19e
        0xd4 -> :sswitch_19f
    .end sparse-switch

    :sswitch_data_91
    .sparse-switch
        0xe -> :sswitch_1a0
        0x2d -> :sswitch_1a6
        0x6f -> :sswitch_1a1
        0x1cc -> :sswitch_1a2
    .end sparse-switch

    :sswitch_data_92
    .sparse-switch
        0x17 -> :sswitch_1a3
        0x2e9 -> :sswitch_1a4
    .end sparse-switch

    :sswitch_data_93
    .sparse-switch
        0x12 -> :sswitch_1a5
        0x33 -> :sswitch_1ab
        0x71 -> :sswitch_1a7
        0xcc -> :sswitch_1a8
    .end sparse-switch

    :sswitch_data_94
    .sparse-switch
        0x11 -> :sswitch_1a9
        0x53 -> :sswitch_199
        0x72 -> :sswitch_1aa
        0x1b2d4 -> :sswitch_1ab
    .end sparse-switch

    :sswitch_data_95
    .sparse-switch
        0x11 -> :sswitch_1ac
        0x32 -> :sswitch_199
    .end sparse-switch

    :sswitch_data_96
    .sparse-switch
        0x11 -> :sswitch_1ae
        0x32 -> :sswitch_1af
    .end sparse-switch

    :sswitch_data_97
    .sparse-switch
        0x11 -> :sswitch_1b0
        0xdbf -> :sswitch_1b1
        0xdd8 -> :sswitch_1c0
        0xdf9 -> :sswitch_1b2
    .end sparse-switch

    :sswitch_data_98
    .sparse-switch
        0x13 -> :sswitch_1b3
        0x32 -> :sswitch_1b4
        0x5d -> :sswitch_1bd
        0x7c -> :sswitch_1b5
    .end sparse-switch

    :sswitch_data_99
    .sparse-switch
        0x13 -> :sswitch_1b6
        0x32 -> :sswitch_1b7
        0x55 -> :sswitch_1bd
        0x6fb -> :sswitch_1b8
    .end sparse-switch

    :sswitch_data_9a
    .sparse-switch
        0x11 -> :sswitch_1b9
        0x36 -> :sswitch_1ba
    .end sparse-switch

    :sswitch_data_9b
    .sparse-switch
        0x11 -> :sswitch_1bc
        0x1ebb -> :sswitch_1c1
        0x1ed8 -> :sswitch_1ce
        0x1ef9 -> :sswitch_1c2
    .end sparse-switch

    :sswitch_data_9c
    .sparse-switch
        0x11 -> :sswitch_1be
        0x3e -> :sswitch_1bf
    .end sparse-switch

    :sswitch_data_9d
    .sparse-switch
        0x17 -> :sswitch_1c3
        0x36 -> :sswitch_1c4
        0x55 -> :sswitch_1cc
        0x74 -> :sswitch_1c5
    .end sparse-switch

    :sswitch_data_9e
    .sparse-switch
        0x1f -> :sswitch_1c6
        0x3e -> :sswitch_1c7
        0x5d -> :sswitch_1cc
        0x7f7 -> :sswitch_1c8
    .end sparse-switch

    :sswitch_data_9f
    .sparse-switch
        0x11 -> :sswitch_1c9
        0x32 -> :sswitch_1ca
    .end sparse-switch

    :sswitch_data_a0
    .sparse-switch
        0x11 -> :sswitch_1cb
        0xfa7 -> :sswitch_1cf
        0xfd8 -> :sswitch_1d2
        0xff9 -> :sswitch_1d0
    .end sparse-switch

    :sswitch_data_a1
    .sparse-switch
        0x11 -> :sswitch_1cd
        0x32 -> :sswitch_1bb
    .end sparse-switch

    :sswitch_data_a2
    .sparse-switch
        0x13 -> :sswitch_1d1
        0x32 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_a3
    .sparse-switch
        0x13 -> :sswitch_1d3
        0x32 -> :sswitch_1d4
        0x5d -> :sswitch_1de
        0x6eb -> :sswitch_1d5
    .end sparse-switch

    :sswitch_data_a4
    .sparse-switch
        0xe -> :sswitch_1d6
        0x31 -> :sswitch_1d7
        0x4c -> :sswitch_1d8
        0x6f -> :sswitch_1da
    .end sparse-switch

    :sswitch_data_a5
    .sparse-switch
        0x11 -> :sswitch_1d9
        0x36 -> :sswitch_1de
    .end sparse-switch

    :sswitch_data_a6
    .sparse-switch
        0x11 -> :sswitch_1db
        0x3eab -> :sswitch_1dc
    .end sparse-switch

    :sswitch_data_a7
    .sparse-switch
        0xe -> :sswitch_1dd
        0x2f -> :sswitch_1df
        0x4c -> :sswitch_1e0
        0x6d -> :sswitch_20d
    .end sparse-switch

    :sswitch_data_a8
    .sparse-switch
        0x17 -> :sswitch_1e1
        0x36 -> :sswitch_1e2
        0x55 -> :sswitch_20d
        0x5ef -> :sswitch_1e3
    .end sparse-switch

    :sswitch_data_a9
    .sparse-switch
        0x12 -> :sswitch_1e4
        0x31 -> :sswitch_1e5
        0x4c -> :sswitch_1e6
        0x73 -> :sswitch_1ef
    .end sparse-switch

    :sswitch_data_aa
    .sparse-switch
        0x11 -> :sswitch_1e7
        0x32 -> :sswitch_1e8
        0x53 -> :sswitch_1eb
        0x74 -> :sswitch_1e9
    .end sparse-switch

    :sswitch_data_ab
    .sparse-switch
        0x11 -> :sswitch_1ea
        0xdaf -> :sswitch_1ef
    .end sparse-switch

    :sswitch_data_ac
    .sparse-switch
        0x12 -> :sswitch_1ec
        0x33 -> :sswitch_1ee
    .end sparse-switch

    :sswitch_data_ad
    .sparse-switch
        0x13 -> :sswitch_1ed
        0x32 -> :sswitch_1f0
        0x55 -> :sswitch_208
        0xd3d4 -> :sswitch_1f1
    .end sparse-switch

    :sswitch_data_ae
    .sparse-switch
        0x13 -> :sswitch_1f2
        0x1bc -> :sswitch_1f4
        0x1dd -> :sswitch_208
        0x1f2 -> :sswitch_1f3
    .end sparse-switch

    :sswitch_data_af
    .sparse-switch
        0x13 -> :sswitch_1f5
        0xb4 -> :sswitch_1f7
        0xd5 -> :sswitch_207
        0xf2 -> :sswitch_1f6
    .end sparse-switch

    :sswitch_data_b0
    .sparse-switch
        0x13 -> :sswitch_1f8
        0x53b -> :sswitch_1fa
        0x558 -> :sswitch_1fc
        0x579 -> :sswitch_1f9
    .end sparse-switch

    :sswitch_data_b1
    .sparse-switch
        0x11 -> :sswitch_1fb
        0x1fe -> :sswitch_1fd
    .end sparse-switch

    :sswitch_data_b2
    .sparse-switch
        0x11 -> :sswitch_1fe
        0xd7 -> :sswitch_203
        0xf6 -> :sswitch_1ff
        0x7d39 -> :sswitch_200
    .end sparse-switch

    :sswitch_data_b3
    .sparse-switch
        0x17 -> :sswitch_201
        0xb4 -> :sswitch_203
        0xd5 -> :sswitch_204
        0xf6 -> :sswitch_202
    .end sparse-switch

    :sswitch_data_b4
    .sparse-switch
        0x1f -> :sswitch_205
        0x1fe -> :sswitch_206
    .end sparse-switch

    :sswitch_data_b5
    .sparse-switch
        0x17 -> :sswitch_209
        0x53f -> :sswitch_20b
        0x558 -> :sswitch_20d
        0x579 -> :sswitch_20a
    .end sparse-switch

    :sswitch_data_b6
    .sparse-switch
        0x11 -> :sswitch_20c
        0xf2 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_b7
    .sparse-switch
        0x11 -> :sswitch_20e
        0x1d3 -> :sswitch_0
        0x1f2 -> :sswitch_20f
        0xf39 -> :sswitch_210
    .end sparse-switch

    :sswitch_data_b8
    .sparse-switch
        0x13 -> :sswitch_211
        0x3b4 -> :sswitch_213
        0x3d5 -> :sswitch_0
        0x3f2 -> :sswitch_212
    .end sparse-switch

    :sswitch_data_b9
    .sparse-switch
        0x13 -> :sswitch_214
        0xbc -> :sswitch_216
        0xdd -> :sswitch_218
        0xf2 -> :sswitch_215
    .end sparse-switch

    :sswitch_data_ba
    .sparse-switch
        0x13 -> :sswitch_217
        0x779 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_bb
    .sparse-switch
        0x11 -> :sswitch_219
        0x3b4 -> :sswitch_21b
        0x3d7 -> :sswitch_21d
        0x3f6 -> :sswitch_21a
    .end sparse-switch

    :sswitch_data_bc
    .sparse-switch
        0x11 -> :sswitch_21c
        0xfe -> :sswitch_0
    .end sparse-switch

    :sswitch_data_bd
    .sparse-switch
        0xe -> :sswitch_21e
        0x2d -> :sswitch_222
        0x4c -> :sswitch_220
        0xef -> :sswitch_21f
    .end sparse-switch

    :sswitch_data_be
    .sparse-switch
        0x17 -> :sswitch_221
        0x3f6 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_bf
    .sparse-switch
        0x1f -> :sswitch_223
        0x737 -> :sswitch_225
        0x748 -> :sswitch_229
        0x769 -> :sswitch_224
    .end sparse-switch

    :sswitch_data_c0
    .sparse-switch
        0x11 -> :sswitch_226
        0xf2 -> :sswitch_227
    .end sparse-switch

    :sswitch_data_c1
    .sparse-switch
        0x11 -> :sswitch_228
        0x32 -> :sswitch_24e
        0xd3 -> :sswitch_251
        0xf4 -> :sswitch_24f
    .end sparse-switch

    :sswitch_data_c2
    .sparse-switch
        0x11 -> :sswitch_22a
        0x3d3 -> :sswitch_247
        0x3f2 -> :sswitch_22b
        0xd29 -> :sswitch_22c
    .end sparse-switch

    :sswitch_data_c3
    .sparse-switch
        0x12 -> :sswitch_22d
        0x2d -> :sswitch_23e
        0x4c -> :sswitch_22f
        0x1f3 -> :sswitch_22e
    .end sparse-switch

    :sswitch_data_c4
    .sparse-switch
        0x13 -> :sswitch_230
        0xb4 -> :sswitch_232
        0xd5 -> :sswitch_235
        0xf2 -> :sswitch_231
    .end sparse-switch

    :sswitch_data_c5
    .sparse-switch
        0x13 -> :sswitch_233
        0x569 -> :sswitch_234
    .end sparse-switch

    :sswitch_data_c6
    .sparse-switch
        0xe -> :sswitch_236
        0x2f -> :sswitch_23b
        0x4c -> :sswitch_238
        0x1f1 -> :sswitch_237
    .end sparse-switch

    :sswitch_data_c7
    .sparse-switch
        0x11 -> :sswitch_239
        0xf6 -> :sswitch_23a
    .end sparse-switch

    :sswitch_data_c8
    .sparse-switch
        0x11 -> :sswitch_23c
        0x3e -> :sswitch_23d
    .end sparse-switch

    :sswitch_data_c9
    .sparse-switch
        0x11 -> :sswitch_23f
        0x36 -> :sswitch_240
        0x1fd7 -> :sswitch_244
        0x1ff4 -> :sswitch_241
    .end sparse-switch

    :sswitch_data_ca
    .sparse-switch
        0x11 -> :sswitch_242
        0x2bb -> :sswitch_243
    .end sparse-switch

    :sswitch_data_cb
    .sparse-switch
        0x1f -> :sswitch_245
        0x3e -> :sswitch_246
    .end sparse-switch

    :sswitch_data_cc
    .sparse-switch
        0x17 -> :sswitch_248
        0x36 -> :sswitch_249
        0x57f -> :sswitch_24a
        0x7d5 -> :sswitch_24d
    .end sparse-switch

    :sswitch_data_cd
    .sparse-switch
        0x11 -> :sswitch_24b
        0x32 -> :sswitch_24c
    .end sparse-switch

    :sswitch_data_ce
    .sparse-switch
        0x11 -> :sswitch_250
        0xdbf -> :sswitch_252
    .end sparse-switch

    :sswitch_data_cf
    .sparse-switch
        0x13 -> :sswitch_253
        0x32 -> :sswitch_254
        0x1dd -> :sswitch_0
        0x1fc -> :sswitch_255
    .end sparse-switch

    :sswitch_data_d0
    .sparse-switch
        0x13 -> :sswitch_257
        0x32 -> :sswitch_258
        0xd5 -> :sswitch_264
        0x57b -> :sswitch_259
    .end sparse-switch

    :sswitch_data_d1
    .sparse-switch
        0x11 -> :sswitch_25a
        0x36 -> :sswitch_25b
        0xd7 -> :sswitch_25e
        0xf4 -> :sswitch_25c
    .end sparse-switch

    :sswitch_data_d2
    .sparse-switch
        0x11 -> :sswitch_25d
        0x3e -> :sswitch_25f
    .end sparse-switch

    :sswitch_data_d3
    .sparse-switch
        0x11 -> :sswitch_260
        0x7d58 -> :sswitch_256
        0x7d79 -> :sswitch_262
        0x7ebb -> :sswitch_261
    .end sparse-switch

    :sswitch_data_d4
    .sparse-switch
        0x17 -> :sswitch_263
        0x36 -> :sswitch_256
    .end sparse-switch

    :sswitch_data_d5
    .sparse-switch
        0x1f -> :sswitch_265
        0x3e -> :sswitch_266
        0x1dd -> :sswitch_272
        0x777 -> :sswitch_267
    .end sparse-switch

    :sswitch_data_d6
    .sparse-switch
        0x11 -> :sswitch_268
        0x32 -> :sswitch_269
        0x3d3 -> :sswitch_26d
        0x3f4 -> :sswitch_26a
    .end sparse-switch

    :sswitch_data_d7
    .sparse-switch
        0x11 -> :sswitch_26c
        0x32 -> :sswitch_26f
    .end sparse-switch

    :sswitch_data_d8
    .sparse-switch
        0x11 -> :sswitch_26e
        0xfa7 -> :sswitch_26b
    .end sparse-switch

    :sswitch_data_d9
    .sparse-switch
        0x13 -> :sswitch_270
        0x32 -> :sswitch_33
    .end sparse-switch

    :sswitch_data_da
    .sparse-switch
        0x13 -> :sswitch_271
        0x32 -> :sswitch_204
    .end sparse-switch
.end method
