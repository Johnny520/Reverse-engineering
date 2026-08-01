.class public final Lqs;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field public a:I

.field public final b:Landroid/view/ViewGroup;

.field public final c:Lk9;

.field public final d:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Lk9;Landroid/app/Activity;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e8\u06e3\u06e4"

    invoke-static {v1}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "JBP"

    invoke-static {v0}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۢ۠ۡ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget v1, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v2, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    rem-int/2addr v1, v2

    const v2, 0x1ab2fa

    add-int/2addr v2, v1

    move-object v1, v0

    goto :goto_0

    :sswitch_1
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v2, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    rem-int/lit16 v2, v2, -0x1db8

    add-int/2addr v0, v2

    if-ltz v0, :cond_0

    const/16 v0, 0x21

    sput v0, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    const-string v0, "\u06e6\u06e3\u06e3"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e8\u06e8\u06e3"

    :goto_1
    invoke-static {v0}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۥۣۢۡ()I

    move-result v0

    if-gtz v0, :cond_2

    sget v0, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v2, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    add-int/lit16 v2, v2, -0x5df

    mul-int/2addr v0, v2

    if-ltz v0, :cond_4

    invoke-static {}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۟ۦ۠ۡۢ()I

    const-string v0, "\u06e2\u06e8\u06e3"

    invoke-static {v0}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_3
    iput-object p3, p0, Lqs;->d:Landroid/app/Activity;

    const-string v0, "\u06df\u06e7\u06e8"

    goto :goto_1

    :sswitch_4
    invoke-static {}, Landroidx/core/content/ۣ۟ۧ۠;->۟۟۠ۢۨ()I

    move-result v0

    if-ltz v0, :cond_1

    invoke-static {}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۦۡۦۢ()I

    const-string v0, "\u06e7\u06e8\u06e4"

    goto :goto_1

    :cond_1
    sget v0, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v2, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sub-int/2addr v0, v2

    const v2, 0x1ac962

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :cond_2
    :sswitch_5
    sget v0, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v2, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    div-int/lit16 v2, v2, 0x2501

    xor-int/2addr v0, v2

    if-ltz v0, :cond_3

    const-string v0, "\u06e7\u06e0\u06e0"

    invoke-static {v0}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_3
    sget v0, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v2, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    rem-int/2addr v0, v2

    const v2, 0x1ac9e2

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_6
    iput-object p2, p0, Lqs;->c:Lk9;

    sget v0, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v2, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    add-int/lit16 v2, v2, 0x262a

    sub-int/2addr v0, v2

    if-ltz v0, :cond_5

    :cond_4
    const-string v0, "\u06df\u06e7\u06e4"

    invoke-static {v0}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_5
    sget v0, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v2, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    add-int/2addr v0, v2

    const v2, 0x1ac5fb

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_7
    iput-object p1, p0, Lqs;->b:Landroid/view/ViewGroup;

    sget v0, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v2, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    add-int/2addr v0, v2

    const v2, 0x1abe6d

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_8
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa7fc -> :sswitch_0
        0x1aa800 -> :sswitch_2
        0x1ab2e2 -> :sswitch_1
        0x1ab35d -> :sswitch_5
        0x1aba48 -> :sswitch_6
        0x1ac16c -> :sswitch_3
        0x1ac1c6 -> :sswitch_4
        0x1ac949 -> :sswitch_7
        0x1ac9e3 -> :sswitch_8
    .end sparse-switch
.end method


# virtual methods
.method public final onPreDraw()Z
    .locals 32

    const/16 v26, 0x0

    const/4 v3, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v18, 0x0

    const/16 v17, 0x0

    const/4 v4, 0x0

    const/4 v14, 0x0

    const/4 v11, 0x0

    const/16 v16, 0x0

    const/4 v7, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/16 v22, 0x0

    const/4 v12, 0x0

    const/16 v21, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/4 v15, 0x0

    const/16 v30, 0x0

    const/4 v9, 0x0

    const/4 v8, 0x0

    const-string v23, "\u06e3\u06e1\u06e3"

    invoke-static/range {v23 .. v23}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v29

    move-object/from16 v23, v3

    move-object/from16 v24, v11

    move-object/from16 v25, v22

    :goto_0
    sparse-switch v29, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v3, "CclRvo9LSzE=\n"

    const-string v11, "TaAi3eA9LkM=\n"

    invoke-static {v3, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v24

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1b

    invoke-static {}, Landroidx/savedstate/ۢۨۧۤ;->ۨ۠ۨۡ()I

    move-result v3

    if-ltz v3, :cond_b

    const-string v3, "\u06e7\u06e5\u06e7"

    invoke-static {v3}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v29, v3

    goto :goto_0

    :sswitch_1
    instance-of v3, v4, Landroid/view/ViewGroup;

    if-eqz v3, :cond_6

    move-object v3, v4

    check-cast v3, Landroid/view/ViewGroup;

    move v15, v14

    :goto_1
    const-string v11, "\u06e0\u06e8\u06e6"

    move-object/from16 v21, v3

    :goto_2
    invoke-static {v11}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v29, v3

    goto :goto_0

    :sswitch_2
    invoke-virtual/range {v23 .. v23}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v3

    move-object/from16 v0, p0

    invoke-virtual {v3, v0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    sget v3, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v11, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    div-int/lit16 v11, v11, -0x9ad

    xor-int/2addr v3, v11

    if-ltz v3, :cond_0

    const/16 v3, 0x46

    sput v3, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    const-string v3, "\u06e5\u06e0\u06e0"

    invoke-static {v3}, Landroidx/core/content/ۣ۟ۧ۠;->ۥۦۤ۠(Ljava/lang/Object;)I

    move-result v3

    move/from16 v29, v3

    goto :goto_0

    :cond_0
    const-string v3, "\u06e2\u06e3\u06e7"

    move-object v11, v3

    move-object/from16 v22, v10

    :goto_3
    invoke-static {v11}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v10, v22

    move/from16 v29, v3

    goto :goto_0

    :sswitch_3
    invoke-interface/range {v26 .. v26}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_26

    const/16 v3, 0x4b0

    if-ge v15, v3, :cond_26

    invoke-virtual/range {v26 .. v26}, Ljava/util/LinkedList;->poll()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    sget v4, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v11, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sub-int/2addr v4, v11

    const v11, 0x1ac359

    add-int/2addr v11, v4

    move-object v4, v3

    move/from16 v29, v11

    goto :goto_0

    :cond_1
    move-object v11, v6

    move-object v12, v6

    :goto_4
    sget v3, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    if-ltz v3, :cond_2

    invoke-static {}, Landroidx/startup/ۣۤۦۥ;->۠ۨ۟()I

    const-string v3, "\u06df\u06e3\u06e8"

    invoke-static {v3}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v3

    move-object v6, v11

    move/from16 v29, v3

    goto/16 :goto_0

    :cond_2
    sget v3, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v6, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    xor-int/2addr v3, v6

    const v6, 0x1aa78c

    add-int/2addr v3, v6

    move-object v6, v11

    move/from16 v29, v3

    goto/16 :goto_0

    :sswitch_4
    sget v3, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v11, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    add-int/lit16 v11, v11, -0x4ca

    xor-int/2addr v3, v11

    if-gtz v3, :cond_3

    const-string v3, "\u06e4\u06e5\u06e0"

    invoke-static {v3}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v29, v3

    goto/16 :goto_0

    :cond_3
    sget v3, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v11, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    xor-int/2addr v3, v11

    const v11, 0x1aa89e

    xor-int/2addr v3, v11

    move/from16 v29, v3

    goto/16 :goto_0

    :cond_4
    move v3, v11

    :goto_5
    sget v11, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    if-gtz v11, :cond_5

    const-string v11, "\u06e0\u06e7\u06e1"

    invoke-static {v11}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v11

    move v14, v3

    move/from16 v29, v11

    goto/16 :goto_0

    :cond_5
    sget v11, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v14, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    xor-int/2addr v11, v14

    const v14, 0x1abbaf

    add-int/2addr v11, v14

    move v14, v3

    move/from16 v29, v11

    goto/16 :goto_0

    :sswitch_5
    sget v3, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v11, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sub-int/2addr v3, v11

    const v11, 0x1abd4b

    add-int/2addr v3, v11

    move/from16 v29, v3

    goto/16 :goto_0

    :cond_6
    move v3, v14

    :goto_6
    sget v11, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v15, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    rem-int/2addr v11, v15

    const v15, 0x1ac532

    add-int/2addr v11, v15

    move/from16 v29, v11

    move v15, v3

    goto/16 :goto_0

    :sswitch_6
    sget v3, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v11, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    add-int/lit8 v11, v11, 0x6

    mul-int/2addr v3, v11

    if-gtz v3, :cond_7

    const/16 v3, 0x5a

    sput v3, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    const-string v3, "\u06e2\u06df\u06e3"

    invoke-static {v3}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v29, v3

    goto/16 :goto_0

    :cond_7
    sget v3, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v11, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    add-int/2addr v3, v11

    const v11, 0x1ab7e8

    add-int/2addr v3, v11

    move/from16 v29, v3

    goto/16 :goto_0

    :sswitch_7
    move/from16 v0, v30

    move/from16 v1, v27

    if-ge v0, v1, :cond_6

    move-object/from16 v0, v21

    move/from16 v1, v30

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    move-object/from16 v0, v26

    invoke-virtual {v0, v3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    invoke-static {}, Landroidx/startup/ۣۤۦۥ;->۠ۨ۟()I

    move-result v3

    if-gtz v3, :cond_8

    const/16 v3, 0x1d

    sput v3, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    const-string v3, "\u06e2\u06e6"

    move v15, v14

    :goto_7
    invoke-static {v3}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v29, v3

    goto/16 :goto_0

    :cond_8
    sget v3, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v11, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    div-int/2addr v3, v11

    const v11, 0x1ab621

    add-int/2addr v3, v11

    move/from16 v29, v3

    move v15, v14

    goto/16 :goto_0

    :sswitch_8
    sget v3, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v11, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    or-int/lit16 v11, v11, -0x81e

    sub-int/2addr v3, v11

    if-gtz v3, :cond_9

    const/16 v3, 0x58

    sput v3, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    const-string v3, "\u06e5\u06e5\u06e4"

    invoke-static {v3}, Landroid/app/۟ۦۦۤۥ;->ۦۨۥ۟(Ljava/lang/Object;)I

    move-result v3

    move/from16 v29, v3

    goto/16 :goto_0

    :cond_9
    sget v3, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v11, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    mul-int/2addr v3, v11

    const v11, 0x19e954

    add-int/2addr v3, v11

    move/from16 v29, v3

    goto/16 :goto_0

    :sswitch_9
    move/from16 v3, v16

    :cond_a
    sget v11, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v16, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    mul-int v11, v11, v16

    const v16, 0x1d4709

    add-int v11, v11, v16

    move/from16 v16, v3

    move/from16 v29, v11

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06e0\u06e7\u06e6"

    goto :goto_7

    :sswitch_a
    invoke-virtual {v12}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    instance-of v3, v3, Landroid/view/View;

    if-eqz v3, :cond_2c

    invoke-virtual {v12}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v5

    const-string v3, "RltgcIJYYM1GQXg8wF4hwEldeDzWVCHNR0AhctdXbYNcV3x5glpvx1pBZXiMTWjGXwBadcdM\n"

    const-string v11, "KC4MHKI7AaM=\n"

    invoke-static {v3, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v5}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    sget v3, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v11, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    rem-int/lit16 v11, v11, -0x1b9a

    or-int/2addr v3, v11

    if-ltz v3, :cond_c

    const-string v3, "\u06e7\u06e6\u06e8"

    invoke-static {v3}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣ۟ۦۥۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v29, v3

    goto/16 :goto_0

    :cond_c
    sget v3, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v11, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    xor-int/2addr v3, v11

    const v11, 0x1aa75b

    add-int/2addr v3, v11

    move/from16 v29, v3

    goto/16 :goto_0

    :sswitch_b
    sget v3, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v11, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    add-int/lit16 v11, v11, 0x392

    add-int/2addr v3, v11

    if-gtz v3, :cond_d

    const/16 v3, 0x57

    sput v3, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    const-string v3, "\u06e6\u06e5\u06e2"

    move/from16 v11, v17

    :goto_8
    invoke-static {v3}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v17, v11

    move/from16 v29, v3

    goto/16 :goto_0

    :cond_d
    const-string v3, "\u06e3\u06e1\u06e3"

    invoke-static {v3}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v29, v3

    goto/16 :goto_0

    :sswitch_c
    move/from16 v3, v16

    :cond_e
    sget v11, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v16, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    move/from16 v0, v16

    xor-int/lit16 v0, v0, 0x2498

    move/from16 v16, v0

    sub-int v11, v11, v16

    if-ltz v11, :cond_f

    const/16 v11, 0x3e

    sput v11, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    const-string v11, "\u06e0\u06e7\u06e5"

    invoke-static {v11}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v11

    move/from16 v16, v3

    move/from16 v29, v11

    goto/16 :goto_0

    :cond_f
    sget v11, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v16, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    xor-int v11, v11, v16

    const v16, 0x1ab02a

    add-int v11, v11, v16

    move/from16 v16, v3

    move/from16 v29, v11

    goto/16 :goto_0

    :sswitch_d
    invoke-virtual/range {v21 .. v21}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    const/4 v11, 0x0

    const-string v22, "\u06e4\u06e5\u06e0"

    invoke-static/range {v22 .. v22}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v22

    move/from16 v27, v3

    move/from16 v28, v11

    move/from16 v29, v22

    goto/16 :goto_0

    :sswitch_e
    move-object/from16 v0, p0

    iget v3, v0, Lqs;->a:I

    const/16 v11, 0x50

    if-le v3, v11, :cond_16

    invoke-static {}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣۣۢۢ()I

    move-result v3

    if-gtz v3, :cond_10

    invoke-static {}, Landroidx/savedstate/ۡۤۨۡ;->ۧۨۧ۠()I

    const-string v3, "\u06e8\u06e1\u06e6"

    :goto_9
    invoke-static {v3}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v29, v3

    goto/16 :goto_0

    :cond_10
    const-string v3, "\u06e7\u06e7\u06df"

    move-object v11, v3

    goto/16 :goto_2

    :sswitch_f
    move-object v3, v5

    check-cast v3, Landroid/view/View;

    instance-of v6, v3, Landroid/view/ViewGroup;

    if-eqz v6, :cond_2d

    sget v6, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sget v11, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    rem-int/lit16 v11, v11, 0x8a0

    mul-int/2addr v6, v11

    if-ltz v6, :cond_11

    const/16 v6, 0x21

    sput v6, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    move-object v6, v3

    move-object v12, v3

    :goto_a
    const-string v3, "\u06e7\u06e1\u06df"

    invoke-static {v3}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v29, v3

    goto/16 :goto_0

    :cond_11
    const-string v6, "\u06e5\u06df\u06e6"

    move-object v11, v6

    move-object/from16 v22, v3

    move-object v12, v3

    :goto_b
    invoke-static {v11}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v6, v22

    move/from16 v29, v3

    goto/16 :goto_0

    :sswitch_10
    const-string v3, "fo0Azvgv\n"

    const-string v11, "mRS8KXeRL+c=\n"

    invoke-static {v3, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v24

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2c

    const-string v3, "\u06e5\u06e5\u06e4"

    move-object v11, v3

    move-object/from16 v22, v10

    goto/16 :goto_3

    :sswitch_11
    move-object/from16 v0, v26

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    invoke-virtual/range {v23 .. v23}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v11, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-virtual/range {v23 .. v23}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v0, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    move/from16 v20, v0

    sget v3, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v19, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    move/from16 v0, v19

    div-int/lit16 v0, v0, -0xf64

    move/from16 v19, v0

    add-int v3, v3, v19

    if-gtz v3, :cond_12

    const-string v3, "\u06df\u06e0\u06e3"

    invoke-static {v3}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v19, v11

    move/from16 v29, v3

    goto/16 :goto_0

    :cond_12
    const-string v3, "\u06e7\u06e1\u06e8"

    :goto_c
    invoke-static {v3}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v19, v11

    move/from16 v29, v3

    goto/16 :goto_0

    :sswitch_12
    sget v3, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    if-ltz v3, :cond_13

    const-string v3, "\u06e8\u06e8\u06e8"

    move/from16 v11, v19

    goto :goto_c

    :cond_13
    const-string v3, "\u06e1\u06e2\u06e8"

    move/from16 v11, v19

    goto :goto_c

    :sswitch_13
    sget v3, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    if-gtz v3, :cond_14

    const/16 v3, 0x1a

    sput v3, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    const-string v3, "\u06e2\u06e6\u06e8"

    :goto_d
    invoke-static {v3}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v29, v3

    goto/16 :goto_0

    :cond_14
    const-string v3, "\u06e2\u06e3\u06e7"

    invoke-static {v3}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v29, v3

    goto/16 :goto_0

    :catchall_0
    move-exception v3

    const-string v3, "Nwje\n"

    const-string v11, "Q2m5jaPP2Zc=\n"

    const-string v22, "+fSYsToq2Unb/q6aAQT4SNE=\n"

    const-string v29, "tJXx329jkSY=\n"

    move-object/from16 v0, v22

    move-object/from16 v1, v29

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v22

    const-string v29, "Fg==\n"

    const-string v31, "c8HJlSTQVfc=\n"

    move-object/from16 v0, v22

    move-object/from16 v1, v29

    move-object/from16 v2, v31

    invoke-static {v3, v11, v0, v1, v2}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "\u06e0\u06e3"

    goto/16 :goto_9

    :sswitch_14
    sget v3, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v11, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    rem-int/2addr v3, v11

    const v11, -0x1abda5

    xor-int/2addr v3, v11

    move/from16 v29, v3

    goto/16 :goto_0

    :sswitch_15
    if-eqz v8, :cond_28

    invoke-virtual {v8}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v3

    const-string v11, "d3QsRHYKrrF6\n"

    const-string v22, "HgdzLBllxdQ=\n"

    move-object/from16 v0, v22

    invoke-static {v11, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v3, v11}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_28

    const-string v3, "femH6jyidhBw\n"

    const-string v11, "FJrYglPNHXU=\n"

    invoke-static {v3, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v8, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    sget v3, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v11, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sub-int/2addr v3, v11

    const v11, 0x1ab62b

    add-int/2addr v3, v11

    move/from16 v29, v3

    goto/16 :goto_0

    :sswitch_16
    const v3, 0x1422dc09

    move/from16 v0, v16

    if-eq v0, v3, :cond_25

    sget v3, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    if-gtz v3, :cond_15

    invoke-static {}, Landroidx/savedstate/ۢۨۧۤ;->ۨ۠ۨۡ()I

    const-string v3, "\u06e2\u06e8\u06e0"

    invoke-static {v3}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v29, v3

    goto/16 :goto_0

    :cond_15
    sget v3, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v11, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    or-int/2addr v3, v11

    const v11, 0x1ab29c

    add-int/2addr v3, v11

    move/from16 v29, v3

    goto/16 :goto_0

    :cond_16
    :sswitch_17
    sget v3, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v11, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    add-int/lit16 v11, v11, -0x1ff6

    mul-int/2addr v3, v11

    if-ltz v3, :cond_17

    const/16 v3, 0x3c

    sput v3, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    const-string v3, "\u06e4\u06e8\u06e1"

    :goto_e
    invoke-static {v3}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v3

    move/from16 v29, v3

    goto/16 :goto_0

    :cond_17
    sget v3, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v11, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    add-int/2addr v3, v11

    const v11, -0x1abbc8

    xor-int/2addr v3, v11

    move/from16 v29, v3

    goto/16 :goto_0

    :sswitch_18
    :try_start_0
    move-object/from16 v0, p0

    iget-object v3, v0, Lqs;->c:Lk9;

    move-object/from16 v0, p0

    iget-object v11, v0, Lqs;->d:Landroid/app/Activity;

    move-object/from16 v0, v23

    invoke-static {v3, v11, v0, v8}, Lk9;->a(Lk9;Landroid/app/Activity;Landroid/view/ViewGroup;Landroid/view/ViewGroup;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget v3, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    if-ltz v3, :cond_18

    invoke-static {}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۥۧۧ()I

    const-string v3, "\u06e0\u06e4\u06e6"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v29, v3

    goto/16 :goto_0

    :cond_18
    const-string v3, "\u06e1\u06e2\u06e8"

    invoke-static {v3}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v29, v3

    goto/16 :goto_0

    :sswitch_19
    const/high16 v3, 0x42f00000    # 120.0f

    cmpg-float v3, v13, v3

    if-gtz v3, :cond_1

    const/4 v3, 0x2

    new-array v3, v3, [I

    sget v11, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v12, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    add-int/lit16 v12, v12, 0x1e9d

    sub-int/2addr v11, v12

    if-ltz v11, :cond_19

    invoke-static {}, Landroid/view/ۢۥۢۦ;->ۤۦۢ۟()I

    const-string v11, "\u06e6\u06df\u06e5"

    invoke-static {v11}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v11

    move-object/from16 v25, v3

    move-object v12, v6

    move/from16 v29, v11

    goto/16 :goto_0

    :cond_19
    const-string v11, "\u06e2\u06e8\u06e0"

    invoke-static {v11}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v11

    move-object/from16 v25, v3

    move-object v12, v6

    move/from16 v29, v11

    goto/16 :goto_0

    :sswitch_1a
    sget v3, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    xor-int/lit8 v3, v3, -0x9

    add-int v11, v15, v3

    instance-of v3, v4, Landroid/widget/TextView;

    if-eqz v3, :cond_4

    move-object v3, v4

    check-cast v3, Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lb50;->T(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v14, "\u06e7\u06e1"

    invoke-static {v14}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v22

    move-object/from16 v24, v3

    move v14, v11

    move/from16 v29, v22

    goto/16 :goto_0

    :sswitch_1b
    sget v3, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    xor-int/lit16 v3, v3, -0x39e

    add-int v11, v30, v3

    sget v3, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v22, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    or-int v3, v3, v22

    const v22, 0x1aa463

    xor-int v3, v3, v22

    move/from16 v29, v3

    move/from16 v30, v11

    goto/16 :goto_0

    :sswitch_1c
    sget v3, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v11, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    xor-int/2addr v3, v11

    const v11, 0x1ac35d

    add-int/2addr v3, v11

    move/from16 v29, v3

    goto/16 :goto_0

    :sswitch_1d
    sget v3, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    if-gtz v3, :cond_1a

    const/16 v3, 0x36

    sput v3, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    move-object/from16 v3, v21

    goto/16 :goto_1

    :cond_1a
    const-string v3, "\u06e1\u06e4\u06e0"

    :goto_f
    invoke-static {v3}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v3

    move/from16 v29, v3

    goto/16 :goto_0

    :cond_1b
    :sswitch_1e
    sget v3, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    if-ltz v3, :cond_1c

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->۟۠ۡۢۦ()I

    const-string v3, "\u06e4\u06e0\u06e0"

    invoke-static {v3}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v29, v3

    goto/16 :goto_0

    :cond_1c
    sget v3, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v11, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    add-int/2addr v3, v11

    const v11, -0x1ab2bc

    xor-int/2addr v3, v11

    move/from16 v29, v3

    goto/16 :goto_0

    :sswitch_1f
    const-string v3, "NZOXnLxi\n"

    const-string v11, "0BwGezLSQy4=\n"

    invoke-static {v3, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v24

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1b

    sget v3, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v11, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    add-int/lit16 v11, v11, -0x4b7

    rem-int/2addr v3, v11

    if-gtz v3, :cond_1d

    invoke-static {}, Lio/fastkv/ۦۣ۠ۨ;->۠ۡۨۧ()I

    const-string v3, "\u06e5\u06e8\u06e5"

    invoke-static {v3}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v29, v3

    goto/16 :goto_0

    :cond_1d
    sget v3, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v11, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    mul-int/2addr v3, v11

    const v11, -0x194df8

    xor-int/2addr v3, v11

    move/from16 v29, v3

    goto/16 :goto_0

    :sswitch_20
    sget v3, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v11, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    xor-int/lit16 v11, v11, 0x686

    xor-int/2addr v3, v11

    if-ltz v3, :cond_1e

    invoke-static {}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟ۤۦۡ()I

    const-string v3, "\u06e2\u06e7\u06e4"

    invoke-static {v3}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v29, v3

    move/from16 v30, v28

    goto/16 :goto_0

    :cond_1e
    sget v3, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v11, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    rem-int/2addr v3, v11

    const v11, 0x1abe0a

    add-int/2addr v3, v11

    move/from16 v29, v3

    move/from16 v30, v28

    goto/16 :goto_0

    :sswitch_21
    invoke-virtual/range {v23 .. v23}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v3

    move-object/from16 v0, p0

    invoke-virtual {v3, v0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    sget v3, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v11, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    div-int/lit16 v11, v11, 0x406

    xor-int/2addr v3, v11

    if-ltz v3, :cond_1f

    const/16 v3, 0x37

    sput v3, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    const-string v3, "\u06e7\u06e1"

    invoke-static {v3}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v29, v3

    goto/16 :goto_0

    :cond_1f
    sget v3, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v11, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    mul-int/2addr v3, v11

    const v11, -0x1871af

    xor-int/2addr v3, v11

    move/from16 v29, v3

    goto/16 :goto_0

    :sswitch_22
    const-string v3, "\u06e5\u06e7\u06e5"

    invoke-static {v3}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v29, v3

    goto/16 :goto_0

    :sswitch_23
    sget v3, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v8, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    rem-int/lit16 v8, v8, -0x1dc7

    div-int/2addr v3, v8

    if-eqz v3, :cond_20

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۣۤۧ()I

    const-string v3, "\u06e5\u06e6\u06e1"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v3

    move-object v8, v10

    move/from16 v29, v3

    goto/16 :goto_0

    :cond_20
    sget v3, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v8, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sub-int/2addr v3, v8

    const v8, 0x1aca3a

    add-int/2addr v3, v8

    move-object v8, v10

    move/from16 v29, v3

    goto/16 :goto_0

    :sswitch_24
    move-object/from16 v0, p0

    iget v3, v0, Lqs;->a:I

    add-int/lit8 v3, v3, 0x1

    move-object/from16 v0, p0

    iput v3, v0, Lqs;->a:I

    new-instance v11, Ljava/util/LinkedList;

    invoke-direct {v11}, Ljava/util/LinkedList;-><init>()V

    move-object/from16 v0, p0

    iget-object v3, v0, Lqs;->b:Landroid/view/ViewGroup;

    sget v22, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v23, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    mul-int v22, v22, v23

    const v23, 0x175686

    add-int v22, v22, v23

    move-object/from16 v23, v3

    move-object/from16 v26, v11

    move/from16 v29, v22

    goto/16 :goto_0

    :sswitch_25
    move-object v3, v6

    check-cast v3, Landroid/view/ViewGroup;

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v10

    int-to-float v10, v10

    move/from16 v0, v19

    int-to-float v11, v0

    const v12, 0x3f666666    # 0.9f

    mul-float/2addr v11, v12

    cmpl-float v10, v10, v11

    if-ltz v10, :cond_2b

    sget v10, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sget v11, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    add-int/lit16 v11, v11, 0x204f

    add-int/2addr v10, v11

    if-gtz v10, :cond_21

    const-string v10, "\u06e4\u06e1\u06e0"

    move-object v11, v10

    move-object/from16 v22, v3

    move-object v12, v6

    goto/16 :goto_3

    :cond_21
    sget v10, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v11, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sub-int/2addr v10, v11

    const v11, 0x1aa90c

    xor-int/2addr v11, v10

    move-object v10, v3

    move-object v12, v6

    move/from16 v29, v11

    goto/16 :goto_0

    :sswitch_26
    invoke-virtual {v10}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    div-float v3, v3, v18

    const/high16 v11, 0x42340000    # 45.0f

    cmpg-float v11, v11, v3

    if-gtz v11, :cond_2a

    move-object v12, v6

    :goto_10
    const-string v11, "\u06e1\u06e1\u06e4"

    move-object/from16 v22, v6

    move v13, v3

    goto/16 :goto_b

    :sswitch_27
    invoke-virtual/range {v23 .. v23}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v0, v3, Landroid/util/DisplayMetrics;->density:F

    move/from16 v17, v0

    const/4 v11, 0x0

    const-string v3, "\u06e7\u06e2\u06e4"

    move/from16 v18, v17

    goto/16 :goto_8

    :sswitch_28
    const/4 v3, 0x1

    return v3

    :sswitch_29
    invoke-virtual/range {v24 .. v24}, Ljava/lang/String;->hashCode()I

    move-result v3

    const v11, 0xa99ff

    if-eq v3, v11, :cond_e

    const v11, 0xecd02

    if-eq v3, v11, :cond_a

    sget v11, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v16, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    add-int v11, v11, v16

    const v16, -0x1abd31

    xor-int v11, v11, v16

    move/from16 v16, v3

    move/from16 v29, v11

    goto/16 :goto_0

    :sswitch_2a
    const/4 v9, 0x0

    sget v3, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    if-gtz v3, :cond_22

    const-string v3, "\u06e1\u06e7\u06e7"

    goto/16 :goto_f

    :cond_22
    const-string v3, "\u06e8\u06e2\u06e3"

    goto/16 :goto_e

    :sswitch_2b
    sget v3, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v8, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    rem-int/lit16 v8, v8, -0x1fb0

    xor-int/2addr v3, v8

    if-gtz v3, :cond_23

    const/16 v3, 0x59

    sput v3, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    move-object v8, v9

    move v3, v13

    goto :goto_10

    :cond_23
    move-object v3, v7

    move-object v8, v9

    :goto_11
    const-string v7, "\u06e6\u06e1\u06e5"

    invoke-static {v7}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v11

    move-object v7, v3

    move/from16 v29, v11

    goto/16 :goto_0

    :sswitch_2c
    move-object/from16 v0, v25

    invoke-virtual {v10, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    const/4 v3, 0x1

    aget v3, v25, v3

    sget v11, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    xor-int/lit16 v11, v11, -0x96

    div-int v11, v20, v11

    if-le v3, v11, :cond_1

    sget v3, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v11, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    xor-int/2addr v3, v11

    const v11, 0x1ab07a

    add-int/2addr v3, v11

    move-object v12, v6

    move/from16 v29, v3

    goto/16 :goto_0

    :sswitch_2d
    sget v3, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v11, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sub-int/2addr v3, v11

    const v11, 0x1aa7b6

    add-int/2addr v3, v11

    move-object v12, v7

    move/from16 v29, v3

    goto/16 :goto_0

    :sswitch_2e
    move/from16 v15, v17

    goto/16 :goto_a

    :sswitch_2f
    sget v3, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    if-gtz v3, :cond_24

    move-object v3, v4

    goto :goto_11

    :cond_24
    sget v3, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v7, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    add-int/2addr v3, v7

    const v7, -0x1abb54

    xor-int/2addr v3, v7

    move-object v7, v4

    move/from16 v29, v3

    goto/16 :goto_0

    :cond_25
    :sswitch_30
    sget v3, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v11, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    xor-int/2addr v3, v11

    const v11, 0xdcb5

    add-int/2addr v3, v11

    move/from16 v29, v3

    goto/16 :goto_0

    :cond_26
    :sswitch_31
    sget v3, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v11, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    or-int/lit16 v11, v11, 0xf47

    rem-int/2addr v3, v11

    if-ltz v3, :cond_27

    const/16 v3, 0x48

    sput v3, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    const-string v3, "\u06e7\u06e3"

    invoke-static {v3}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v29, v3

    goto/16 :goto_0

    :cond_27
    sget v3, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sget v11, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    xor-int/2addr v3, v11

    const v11, 0x1abfa8

    add-int/2addr v3, v11

    move/from16 v29, v3

    goto/16 :goto_0

    :sswitch_32
    sget v3, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v11, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    mul-int/2addr v3, v11

    const v11, 0x19baec

    xor-int/2addr v3, v11

    move/from16 v29, v3

    goto/16 :goto_0

    :cond_28
    :sswitch_33
    sget v3, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    if-ltz v3, :cond_29

    const-string v3, "\u06e2\u06e1\u06e0"

    invoke-static {v3}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v29, v3

    goto/16 :goto_0

    :cond_29
    const-string v3, "\u06e8\u06e1\u06e6"

    goto/16 :goto_d

    :cond_2a
    move-object v11, v6

    move-object v12, v6

    move v13, v3

    goto/16 :goto_4

    :cond_2b
    move-object v10, v3

    move-object v11, v6

    move-object v12, v6

    goto/16 :goto_4

    :cond_2c
    :sswitch_34
    move v3, v14

    goto/16 :goto_5

    :cond_2d
    move-object v11, v3

    move-object v12, v3

    goto/16 :goto_4

    :sswitch_35
    move-object v11, v6

    goto/16 :goto_4

    :sswitch_36
    move v3, v15

    goto/16 :goto_6

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe9 -> :sswitch_0
        0xdc03 -> :sswitch_33
        0xdc44 -> :sswitch_14
        0xdc81 -> :sswitch_b
        0xdcda -> :sswitch_29
        0x1aa702 -> :sswitch_a
        0x1aa722 -> :sswitch_31
        0x1aa726 -> :sswitch_f
        0x1aa79d -> :sswitch_22
        0x1aa81a -> :sswitch_35
        0x1aab43 -> :sswitch_26
        0x1aab5b -> :sswitch_11
        0x1aab62 -> :sswitch_34
        0x1aabbf -> :sswitch_4
        0x1aabc1 -> :sswitch_34
        0x1aabde -> :sswitch_d
        0x1aaec4 -> :sswitch_19
        0x1aaee6 -> :sswitch_30
        0x1aaee7 -> :sswitch_5
        0x1aaf1d -> :sswitch_32
        0x1aaf81 -> :sswitch_36
        0x1aaf9a -> :sswitch_1f
        0x1ab246 -> :sswitch_2
        0x1ab247 -> :sswitch_8
        0x1ab269 -> :sswitch_13
        0x1ab2c6 -> :sswitch_18
        0x1ab33e -> :sswitch_2f
        0x1ab33f -> :sswitch_23
        0x1ab35a -> :sswitch_2c
        0x1ab608 -> :sswitch_17
        0x1ab623 -> :sswitch_1b
        0x1ab625 -> :sswitch_9
        0x1ab645 -> :sswitch_24
        0x1ab9c4 -> :sswitch_33
        0x1aba03 -> :sswitch_1
        0x1aba21 -> :sswitch_28
        0x1aba27 -> :sswitch_12
        0x1aba63 -> :sswitch_c
        0x1aba67 -> :sswitch_2d
        0x1aba7f -> :sswitch_20
        0x1abac4 -> :sswitch_34
        0x1abd8c -> :sswitch_25
        0x1abda5 -> :sswitch_7
        0x1abe44 -> :sswitch_1c
        0x1abe60 -> :sswitch_16
        0x1abe83 -> :sswitch_14
        0x1abea2 -> :sswitch_34
        0x1ac14c -> :sswitch_2a
        0x1ac18a -> :sswitch_15
        0x1ac528 -> :sswitch_6
        0x1ac52b -> :sswitch_1e
        0x1ac545 -> :sswitch_3
        0x1ac54e -> :sswitch_27
        0x1ac566 -> :sswitch_1a
        0x1ac569 -> :sswitch_2e
        0x1ac5c9 -> :sswitch_10
        0x1ac5e9 -> :sswitch_1e
        0x1ac5ff -> :sswitch_21
        0x1ac8ca -> :sswitch_1d
        0x1ac90d -> :sswitch_e
        0x1ac929 -> :sswitch_2b
        0x1ac92c -> :sswitch_32
    .end sparse-switch
.end method
