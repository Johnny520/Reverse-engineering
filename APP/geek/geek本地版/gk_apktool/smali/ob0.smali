.class public abstract Lob0;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ljava/util/ArrayList;

.field public static b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lob0;->a:Ljava/util/ArrayList;

    return-void
.end method

.method public static a(Landroid/view/View;IFJ)V
    .locals 27

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v13, 0x0

    const/16 v19, 0x0

    const/16 v18, 0x0

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v10, 0x0

    const/4 v15, 0x0

    const/16 v22, 0x0

    const/16 v21, 0x0

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/16 v17, 0x0

    const/4 v9, 0x0

    const/16 v20, 0x0

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v14, 0x0

    const-string v6, "\u06e4\u06e7"

    invoke-static {v6}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v23, v2

    move-object/from16 v24, v3

    move/from16 v25, v4

    :goto_0
    sparse-switch v6, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const/4 v2, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Landroid/view/View;->setAlpha(F)V

    const v2, 0x7e06002d

    sget v3, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    xor-int/2addr v2, v3

    invoke-static/range {p3 .. p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    move-object/from16 v0, p0

    invoke-virtual {v0, v2, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    new-instance v2, Lmb0;

    move-object/from16 v3, p0

    move/from16 v4, p1

    move/from16 v5, p2

    move-wide/from16 v6, p3

    invoke-direct/range {v2 .. v7}, Lmb0;-><init>(Landroid/view/View;IFJ)V

    invoke-static {}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۣ۟ۧۤۡ()I

    move-result v3

    if-ltz v3, :cond_29

    const-string v3, "\u06e4\u06e7"

    invoke-static {v3}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v3

    move-object v5, v2

    move v6, v3

    goto :goto_0

    :cond_0
    move-object v2, v10

    :goto_1
    sget v3, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v4, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    or-int/2addr v3, v4

    const v4, 0x1aa480

    add-int/2addr v3, v4

    move-object v11, v2

    move v6, v3

    goto :goto_0

    :sswitch_1
    const/4 v3, 0x0

    invoke-static {}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۣ۟ۦۢ()I

    move-result v2

    if-gtz v2, :cond_1

    const-string v2, "\u06e8\u06e8\u06e4"

    move v4, v13

    :goto_2
    invoke-static {v2}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v2

    move-object v12, v3

    move v13, v4

    move v6, v2

    goto :goto_0

    :cond_1
    sget v2, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sget v4, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    rem-int/2addr v2, v4

    const v4, 0x1ac16b

    xor-int/2addr v2, v4

    move-object v12, v3

    move v6, v2

    goto :goto_0

    :sswitch_2
    sget v2, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v3, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    div-int/lit16 v3, v3, 0x620

    add-int/2addr v2, v3

    if-ltz v2, :cond_2

    invoke-static {}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟۟ۤۦۨ()I

    const-string v2, "\u06e8\u06e0\u06df"

    invoke-static {v2}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto :goto_0

    :cond_2
    sget v2, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v3, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    add-int/2addr v2, v3

    const v3, 0x1aa7d2

    add-int/2addr v2, v3

    move v6, v2

    goto :goto_0

    :sswitch_3
    sget v2, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v3, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    xor-int/lit16 v3, v3, -0x2672

    or-int/2addr v2, v3

    if-gtz v2, :cond_3

    invoke-static {}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟ۧۢ۟ۧ()I

    const-string v3, "\u06e7\u06e6\u06e8"

    move-object v2, v5

    :goto_3
    invoke-static {v3}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v3

    move-object v5, v2

    move v6, v3

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u06e7\u06df\u06e5"

    move-object v2, v5

    goto :goto_3

    :cond_4
    :sswitch_4
    sget v2, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v3, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    rem-int/lit16 v3, v3, 0xcd5

    sub-int/2addr v2, v3

    if-gtz v2, :cond_5

    const/16 v2, 0x4b

    sput v2, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    const-string v2, "\u06e6\u06e8\u06e4"

    invoke-static {v2}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_5
    sget v2, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v3, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    rem-int/2addr v2, v3

    const v3, 0x1ac7aa

    add-int/2addr v2, v3

    move v6, v2

    goto/16 :goto_0

    :sswitch_5
    const-string v2, "\u06e7\u06e6\u06e5"

    move-object/from16 v3, v16

    move/from16 v4, v18

    :goto_4
    invoke-static {v2}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v17, v3

    move v6, v2

    move/from16 v18, v4

    goto/16 :goto_0

    :cond_6
    :sswitch_6
    sget v2, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    if-ltz v2, :cond_7

    const/16 v2, 0x11

    sput v2, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    const-string v3, "\u06e3\u06df\u06e3"

    move-object v2, v14

    :goto_5
    invoke-static {v3}, L۠ۡۢۨ;->۟ۡۧۡۥ(Ljava/lang/Object;)I

    move-result v3

    move-object v14, v2

    move v6, v3

    goto/16 :goto_0

    :cond_7
    const-string v2, "\u06e3\u06e8\u06e5"

    :goto_6
    invoke-static {v2}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_8
    :sswitch_7
    const-string v2, "\u06df\u06df\u06e1"

    goto :goto_6

    :sswitch_8
    sget v2, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v3, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    mul-int/lit16 v3, v3, 0x164c

    add-int/2addr v2, v3

    if-ltz v2, :cond_9

    const-string v2, "\u06e3\u06e8\u06e3"

    goto :goto_6

    :cond_9
    const-string v2, "\u06e4\u06e7"

    goto :goto_6

    :sswitch_9
    invoke-static {}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۥۣۢۡ()I

    move-result v2

    if-gtz v2, :cond_a

    const/16 v2, 0x44

    sput v2, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    const-string v2, "\u06e3\u06e7\u06e8"

    invoke-static {v2}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v17, v12

    move v6, v2

    goto/16 :goto_0

    :cond_a
    sget v2, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v3, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    or-int/2addr v2, v3

    const v3, 0x1aa39b

    add-int/2addr v2, v3

    move-object/from16 v17, v12

    move v6, v2

    goto/16 :goto_0

    :sswitch_a
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewPropertyAnimator;->cancel()V

    const v2, -0x7e070009

    sget v3, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    xor-int/2addr v2, v3

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v8

    instance-of v2, v8, Lh40;

    sget v3, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v4, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    mul-int/lit16 v4, v4, -0xabd

    rem-int/2addr v3, v4

    if-ltz v3, :cond_b

    const/16 v3, 0x37

    sput v3, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    const-string v3, "\u06e3\u06e1\u06e7"

    invoke-static {v3}, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۧۦۢ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v25, v2

    move v6, v3

    goto/16 :goto_0

    :cond_b
    sget v3, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sget v4, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    div-int/2addr v3, v4

    const v4, 0x1ac983

    add-int/2addr v3, v4

    move/from16 v25, v2

    move v6, v3

    goto/16 :goto_0

    :sswitch_b
    const/4 v10, 0x0

    if-eqz v25, :cond_23

    move-object v2, v8

    check-cast v2, Lh40;

    const-string v3, "\u06e6\u06df\u06e0"

    move-object v4, v2

    :goto_7
    invoke-static {v3}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v15, v4

    move v6, v2

    goto/16 :goto_0

    :sswitch_c
    move-object v3, v15

    :goto_8
    const-string v2, "\u06e0\u06e1\u06e3"

    invoke-static {v2}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v21, v3

    move v6, v2

    goto/16 :goto_0

    :sswitch_d
    sget v2, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sget v3, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    or-int/2addr v2, v3

    const v3, 0x1ac50e

    add-int/2addr v2, v3

    move-object/from16 v21, v22

    move v6, v2

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۟ۤۥۧۤ()I

    move-result v2

    if-gtz v2, :cond_c

    invoke-static {}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۥۧۧ()I

    const-string v2, "\u06e2\u06e3\u06e2"

    invoke-static {v2}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_c
    sget v2, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v3, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    or-int/2addr v2, v3

    const v3, 0x1abf4c

    add-int/2addr v2, v3

    move v6, v2

    goto/16 :goto_0

    :cond_d
    :sswitch_f
    sget v2, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    if-ltz v2, :cond_e

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟ۢۡ۟۟()I

    const-string v2, "\u06e6\u06e5\u06e4"

    move-object v3, v2

    move-object v4, v15

    goto :goto_7

    :cond_e
    const-string v2, "\u06e8\u06e0\u06e1"

    goto/16 :goto_6

    :sswitch_10
    sget v2, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v3, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    xor-int/lit16 v3, v3, 0xd1f

    rem-int/2addr v2, v3

    if-ltz v2, :cond_f

    const-string v2, "\u06e8\u06e2\u06e0"

    move-object v3, v2

    move-object/from16 v4, v16

    :goto_9
    invoke-static {v3}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v16, v4

    move v6, v2

    goto/16 :goto_0

    :cond_f
    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v3, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    xor-int/2addr v2, v3

    const v3, 0x1ab81c

    add-int/2addr v2, v3

    move v6, v2

    goto/16 :goto_0

    :sswitch_11
    sget v2, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v3, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    add-int/2addr v2, v3

    const v3, 0x1ac16f

    xor-int/2addr v2, v3

    move v6, v2

    goto/16 :goto_0

    :sswitch_12
    if-eqz v21, :cond_6

    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v3, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    div-int/2addr v2, v3

    const v3, 0x1ab301

    xor-int/2addr v2, v3

    move v6, v2

    goto/16 :goto_0

    :sswitch_13
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x1

    move-object/from16 v0, v24

    invoke-static {v0, v2}, Lgn;->b(Ljava/lang/String;I)I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_d

    const/4 v4, 0x1

    const-string v2, "\u06e8\u06e5"

    move-object v3, v12

    goto/16 :goto_2

    :sswitch_14
    if-eqz v18, :cond_19

    const/4 v2, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Landroid/view/View;->setTranslationX(F)V

    const/high16 v2, 0x437a0000    # 250.0f

    invoke-static {v2}, Lff;->p(F)F

    move-result v2

    neg-float v2, v2

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Landroid/view/View;->setTranslationY(F)V

    sget v2, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v3, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    div-int/lit16 v3, v3, 0x1660

    or-int/2addr v2, v3

    if-ltz v2, :cond_10

    invoke-static {}, Lkotlinx/coroutines/ۦۡۧۧ;->۟ۤۧۨۦ()I

    const-string v2, "\u06e0\u06e8\u06e3"

    invoke-static {v2}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_10
    const-string v2, "\u06e1\u06e0\u06e4"

    :goto_a
    invoke-static {v2}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :sswitch_15
    const-string v2, "CXmN+g==\n"

    const-string v3, "fxDojRVSF6c=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v2, Lgn;->a:Lgn;

    const-string v3, "oSxCfR/Xwt+rJ1hHJdjYxKcWSFYD1dM=\n"

    const-string v4, "ykk7Inq5tq0=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sget v4, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sget v6, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    rem-int/lit16 v6, v6, -0xbab

    mul-int/2addr v4, v6

    if-gtz v4, :cond_11

    invoke-static {}, Landroidx/emoji2/text/ۣۣ۟۟۠;->ۢۡۢۦ()I

    const-string v4, "\u06e1\u06e0\u06e4"

    invoke-static {v4}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v23, v2

    move-object/from16 v24, v3

    move v6, v4

    goto/16 :goto_0

    :cond_11
    const-string v4, "\u06e6\u06e2\u06e0"

    invoke-static {v4}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v23, v2

    move-object/from16 v24, v3

    move v6, v4

    goto/16 :goto_0

    :cond_12
    :sswitch_16
    invoke-static {}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۟ۤۥۧۤ()I

    move-result v2

    if-gtz v2, :cond_13

    const-string v2, "\u06e5\u06e2\u06e7"

    goto :goto_a

    :cond_13
    sget v2, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v3, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    xor-int/2addr v2, v3

    const v3, -0xdff5

    xor-int/2addr v2, v3

    move v6, v2

    goto/16 :goto_0

    :sswitch_17
    sget-object v2, Lob0;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-boolean v2, Lob0;->b:Z

    if-nez v2, :cond_4

    const/4 v2, 0x1

    sput-boolean v2, Lob0;->b:Z

    sget v2, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v3, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    or-int/lit16 v3, v3, 0x1190

    or-int/2addr v2, v3

    if-ltz v2, :cond_17

    const-string v2, "\u06e1\u06e8\u06e0"

    invoke-static {v2}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_14
    :sswitch_18
    invoke-static {}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣ۟۠()I

    move-result v2

    if-gtz v2, :cond_15

    const/16 v2, 0x61

    sput v2, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    const-string v2, "\u06e1\u06e8\u06e6"

    invoke-static {v2}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_15
    sget v2, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v3, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    add-int/2addr v2, v3

    const v3, 0x1ac720

    add-int/2addr v2, v3

    move v6, v2

    goto/16 :goto_0

    :sswitch_19
    invoke-static {}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۦۤۨۢ()I

    move-result v2

    if-gtz v2, :cond_14

    const-string v2, "Dn6TFKIMxJEpmUGeOrj"

    invoke-static {v2}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۣۧۨۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    const-string v3, "\u06e6\u06e8\u06e7"

    goto/16 :goto_5

    :sswitch_1a
    move-object v2, v9

    check-cast v2, Lh40;

    sget v3, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v4, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    or-int/2addr v3, v4

    const v4, 0x1ac8e3

    add-int/2addr v3, v4

    move-object/from16 v20, v2

    move v6, v3

    goto/16 :goto_0

    :sswitch_1b
    const v2, 0x3f666666    # 0.9f

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Landroid/view/View;->setScaleX(F)V

    const v2, 0x3f666666    # 0.9f

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Landroid/view/View;->setScaleY(F)V

    sget v2, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    if-ltz v2, :cond_16

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟ۢۡ۟۟()I

    const-string v2, "\u06df\u06df\u06e1"

    invoke-static {v2}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_16
    const-string v2, "\u06e2\u06e3\u06e8"

    invoke-static {v2}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :sswitch_1c
    if-eqz v17, :cond_27

    invoke-static {}, Landroidx/emoji2/text/ۣۣ۟۟۠;->ۢۡۢۦ()I

    move-result v2

    if-gtz v2, :cond_18

    invoke-static {}, Lkotlinx/coroutines/ۦۡۧۧ;->۟ۤۧۨۦ()I

    :cond_17
    const-string v2, "\u06e3\u06e6\u06e8"

    invoke-static {v2}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_18
    const-string v2, "\u06e5\u06e5\u06e5"

    :goto_b
    invoke-static {v2}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_19
    :sswitch_1d
    invoke-static {}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣۣۢۢ()I

    move-result v2

    if-gtz v2, :cond_1a

    invoke-static {}, Landroidx/startup/ۣۤۦۥ;->۠ۨ۟()I

    const-string v2, "\u06e4\u06e8\u06e4"

    invoke-static {v2}, Landroidx/core/content/ۣ۟ۧ۠;->ۥۦۤ۠(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_1a
    sget v2, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v3, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    mul-int/2addr v2, v3

    const v3, 0x1629d9

    add-int/2addr v2, v3

    move v6, v2

    goto/16 :goto_0

    :sswitch_1e
    sget v2, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v3, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    add-int/lit16 v3, v3, -0x47f

    sub-int/2addr v2, v3

    if-gtz v2, :cond_1b

    const-string v2, "\u06df\u06e6\u06e8"

    move-object/from16 v3, v17

    move/from16 v4, v19

    goto/16 :goto_4

    :cond_1b
    const-string v2, "\u06e3\u06e6\u06e5"

    move-object/from16 v3, v17

    move/from16 v4, v19

    goto/16 :goto_4

    :sswitch_1f
    const/high16 v2, 0x3f800000    # 1.0f

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Landroid/view/View;->setScaleY(F)V

    sget v2, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    if-gtz v2, :cond_1c

    const-string v2, "\u06e6\u06e8\u06e7"

    invoke-static {v2}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_1c
    const-string v2, "\u06df\u06e2"

    goto/16 :goto_a

    :sswitch_20
    invoke-virtual {v11}, Lh40;->c()V

    invoke-static {}, Landroidx/savedstate/ۢۨۧۤ;->ۨ۠ۨۡ()I

    move-result v2

    if-ltz v2, :cond_1d

    const/16 v2, 0x54

    sput v2, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    const-string v2, "\u06e5\u06e5\u06e5"

    invoke-static {v2}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_1d
    sget v2, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v3, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    div-int/2addr v2, v3

    const v3, 0xdc60

    add-int/2addr v2, v3

    move v6, v2

    goto/16 :goto_0

    :sswitch_21
    invoke-static {}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۣ۟ۧۤۡ()I

    move-result v2

    if-ltz v2, :cond_1e

    const-string v2, "\u06df\u06e4\u06df"

    move/from16 v18, v13

    goto/16 :goto_b

    :cond_1e
    sget v2, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v3, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    xor-int/2addr v2, v3

    const v3, 0x1ac4cb

    add-int/2addr v2, v3

    move v6, v2

    move/from16 v18, v13

    goto/16 :goto_0

    :sswitch_22
    invoke-virtual/range {v21 .. v21}, Lh40;->c()V

    sget v2, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    if-gtz v2, :cond_1f

    const/16 v2, 0x57

    sput v2, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    const-string v2, "\u06e2\u06e7\u06e2"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_1f
    const-string v3, "\u06e3\u06e8\u06e5"

    move-object v2, v14

    goto/16 :goto_5

    :sswitch_23
    invoke-static {}, Lcom/google/android/material/carousel/۟ۧۡۢ;->۟ۦۥۣۧ()I

    move-result v2

    if-ltz v2, :cond_20

    const/16 v2, 0x21

    sput v2, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    const-string v2, "\u06e4\u06e4\u06e5"

    move-object/from16 v3, v20

    :goto_c
    invoke-static {v2}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v2

    move-object v11, v3

    move v6, v2

    goto/16 :goto_0

    :cond_20
    sget v2, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v3, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    rem-int/2addr v2, v3

    const v3, 0x1aa818

    add-int/2addr v2, v3

    move-object/from16 v11, v20

    move v6, v2

    goto/16 :goto_0

    :sswitch_24
    sget-object v2, Ld9;->b:Landroid/os/Handler;

    new-instance v3, Lod;

    sget v4, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    xor-int/lit16 v4, v4, -0x3b6

    invoke-direct {v3, v4}, Lod;-><init>(I)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    const-string v2, "\u06e8\u06e2\u06e0"

    :goto_d
    invoke-static {v2}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :sswitch_25
    const/4 v2, 0x0

    sget v3, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    if-ltz v3, :cond_25

    const/16 v3, 0x62

    sput v3, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    const-string v3, "\u06e6\u06e3\u06e2"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v22, v2

    move v6, v3

    goto/16 :goto_0

    :sswitch_26
    const/16 v19, 0x0

    sget v2, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v3, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    or-int/2addr v2, v3

    const v3, 0xdfe3

    xor-int/2addr v2, v3

    move v6, v2

    goto/16 :goto_0

    :sswitch_27
    const v2, -0x7e070022

    sget v3, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    xor-int/2addr v2, v3

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v9

    instance-of v2, v9, Lh40;

    if-eqz v2, :cond_0

    const-string v2, "\u06e4\u06e6\u06e2"

    move-object v3, v10

    goto :goto_c

    :sswitch_28
    invoke-virtual/range {v17 .. v17}, Lh40;->c()V

    sget v2, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v3, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    mul-int/2addr v2, v3

    const v3, 0x1b006d

    add-int/2addr v2, v3

    move v6, v2

    goto/16 :goto_0

    :sswitch_29
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v14}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v2, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v3, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    mul-int/2addr v2, v3

    const v3, 0x1fe649

    add-int/2addr v2, v3

    move v6, v2

    goto/16 :goto_0

    :sswitch_2a
    sget v2, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    if-ltz v2, :cond_21

    const/16 v2, 0x42

    sput v2, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    const-string v2, "\u06e7\u06e5\u06e0"

    invoke-static {v2}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_21
    const-string v3, "\u06df\u06e2"

    move-object v2, v5

    goto/16 :goto_3

    :sswitch_2b
    const-string v2, "\u06e3\u06e6\u06e5"

    move-object v3, v2

    move-object v4, v15

    goto/16 :goto_7

    :sswitch_2c
    sget v2, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v3, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    mul-int/lit16 v3, v3, -0x521

    mul-int/2addr v2, v3

    if-ltz v2, :cond_22

    invoke-static {}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۥۧۧ()I

    const-string v2, "\u06e7\u06e6\u06e5"

    invoke-static {v2}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_22
    sget v2, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v3, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    rem-int/2addr v2, v3

    const v3, 0xdc48

    xor-int/2addr v2, v3

    move v6, v2

    goto/16 :goto_0

    :cond_23
    :sswitch_2d
    const-string v2, "\u06e8\u06e1\u06e3"

    move-object v3, v2

    move-object v4, v15

    goto/16 :goto_7

    :sswitch_2e
    const v2, 0x7e0701fe

    sget v3, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    xor-int/2addr v2, v3

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lh40;

    if-eqz v3, :cond_8

    check-cast v2, Lh40;

    sget v3, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    if-ltz v3, :cond_24

    move-object/from16 v16, v2

    move-object/from16 v3, v21

    goto/16 :goto_8

    :cond_24
    const-string v3, "\u06e2\u06e7\u06e2"

    move-object v4, v2

    goto/16 :goto_9

    :sswitch_2f
    if-eqz v11, :cond_12

    sget v2, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v3, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    div-int/lit16 v3, v3, 0x1259

    add-int/2addr v2, v3

    if-gtz v2, :cond_26

    const/16 v2, 0x34

    sput v2, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    move-object/from16 v2, v22

    :cond_25
    const-string v3, "\u06e1\u06e7\u06e0"

    invoke-static {v3}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v22, v2

    move v6, v3

    goto/16 :goto_0

    :cond_26
    sget v2, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v3, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    xor-int/2addr v2, v3

    const v3, 0x1ab327

    xor-int/2addr v2, v3

    move v6, v2

    goto/16 :goto_0

    :sswitch_30
    move-object/from16 v0, p0

    move/from16 v1, p2

    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationX(F)V

    const/4 v2, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Landroid/view/View;->setTranslationY(F)V

    const/high16 v2, 0x3f800000    # 1.0f

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Landroid/view/View;->setScaleX(F)V

    sget v2, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v3, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    or-int/2addr v2, v3

    const v3, 0x1aa423

    xor-int/2addr v2, v3

    move v6, v2

    goto/16 :goto_0

    :cond_27
    :sswitch_31
    sget v2, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v3, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    xor-int/lit16 v3, v3, -0x756

    div-int/2addr v2, v3

    if-eqz v2, :cond_28

    const-string v2, "\u06e5\u06e3\u06e5"

    goto/16 :goto_d

    :cond_28
    sget v2, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v3, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sub-int/2addr v2, v3

    const v3, -0x1abf5b

    xor-int/2addr v2, v3

    move v6, v2

    goto/16 :goto_0

    :cond_29
    const-string v3, "\u06df\u06e6\u06e8"

    goto/16 :goto_3

    :sswitch_32
    return-void

    :sswitch_33
    move-object v2, v11

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        0xdbe3 -> :sswitch_0
        0xdc1f -> :sswitch_1e
        0xdc46 -> :sswitch_2
        0xdc61 -> :sswitch_14
        0xdc83 -> :sswitch_15
        0xdcfd -> :sswitch_21
        0x1aa701 -> :sswitch_1
        0x1aa75f -> :sswitch_2f
        0x1aa79a -> :sswitch_1c
        0x1aa7dc -> :sswitch_1f
        0x1aa7e1 -> :sswitch_17
        0x1aab02 -> :sswitch_11
        0x1aabdb -> :sswitch_33
        0x1aaea5 -> :sswitch_1b
        0x1aaedf -> :sswitch_1d
        0x1aaf7a -> :sswitch_d
        0x1aaf99 -> :sswitch_7
        0x1ab2c1 -> :sswitch_2a
        0x1ab2c7 -> :sswitch_e
        0x1ab301 -> :sswitch_22
        0x1ab33d -> :sswitch_5
        0x1ab359 -> :sswitch_20
        0x1ab649 -> :sswitch_18
        0x1ab6a7 -> :sswitch_f
        0x1ab6e2 -> :sswitch_a
        0x1ab6e5 -> :sswitch_24
        0x1ab704 -> :sswitch_2b
        0x1ab720 -> :sswitch_2e
        0x1ab9cd -> :sswitch_2b
        0x1aba65 -> :sswitch_6
        0x1abaa0 -> :sswitch_1a
        0x1abe43 -> :sswitch_2a
        0x1abe45 -> :sswitch_28
        0x1abe67 -> :sswitch_16
        0x1abe85 -> :sswitch_27
        0x1ac147 -> :sswitch_c
        0x1ac149 -> :sswitch_4
        0x1ac16b -> :sswitch_9
        0x1ac1a4 -> :sswitch_13
        0x1ac1a8 -> :sswitch_2d
        0x1ac1c5 -> :sswitch_3
        0x1ac204 -> :sswitch_3
        0x1ac265 -> :sswitch_29
        0x1ac50d -> :sswitch_12
        0x1ac548 -> :sswitch_10
        0x1ac5a7 -> :sswitch_32
        0x1ac5c9 -> :sswitch_2
        0x1ac5e6 -> :sswitch_2c
        0x1ac8ca -> :sswitch_23
        0x1ac8e9 -> :sswitch_26
        0x1ac90a -> :sswitch_25
        0x1ac926 -> :sswitch_19
        0x1ac96a -> :sswitch_30
        0x1ac987 -> :sswitch_b
        0x1ac9c3 -> :sswitch_8
        0x1ac9e4 -> :sswitch_31
    .end sparse-switch
.end method
