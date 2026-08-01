.class public final Lm9;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field public final a:Li00;

.field public final b:J


# direct methods
.method public constructor <init>(Li00;J)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    const-string v2, "\u06df\u06e5\u06e4"

    invoke-static {v2}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v2

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iput-object p1, p0, Lm9;->a:Li00;

    sget v2, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    if-ltz v2, :cond_0

    const-string v2, "\u06e7\u06e8\u06e1"

    invoke-static {v2}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :sswitch_1
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

    sget v2, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v3, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    add-int/lit16 v3, v3, -0x8e3

    mul-int/2addr v2, v3

    if-ltz v2, :cond_4

    const/16 v2, 0x4a

    sput v2, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    const-string v2, "\u06e7\u06e0\u06e0"

    invoke-static {v2}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :cond_0
    const-string v2, "\u06e3\u06e5\u06e0"

    :goto_1
    invoke-static {v2}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :cond_1
    :sswitch_2
    sget v2, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    if-ltz v2, :cond_2

    invoke-static {}, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۢۧ()I

    const-string v2, "\u06e4\u06e3\u06e0"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :cond_2
    const-string v2, "\u06e7\u06e6\u06e6"

    invoke-static {v2}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :sswitch_3
    sget v2, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v3, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    add-int/lit16 v3, v3, -0x67b

    div-int/2addr v2, v3

    if-eqz v2, :cond_3

    const-string v2, "\u06e6\u06e5\u06e4"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :cond_3
    const-string v2, "\u06df\u06e5\u06e4"

    invoke-static {v2}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :sswitch_4
    const-string v0, "TNbfXiDzLW8pd8"

    invoke-static {v0}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۥۣۤۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget v2, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v3, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    add-int/lit16 v3, v3, -0xbf6

    xor-int/2addr v2, v3

    if-ltz v2, :cond_5

    invoke-static {}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->۟ۡۨۢ()I

    :cond_4
    const-string v2, "\u06e7\u06e6\u06e6"

    goto :goto_1

    :cond_5
    sget v2, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v3, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sub-int/2addr v2, v3

    const v3, 0x1ac55c

    xor-int/2addr v2, v3

    goto :goto_0

    :sswitch_5
    iput-wide p2, p0, Lm9;->b:J

    sget v2, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v3, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    or-int/lit16 v3, v3, -0xba1

    add-int/2addr v2, v3

    if-gtz v2, :cond_6

    const/16 v2, 0x30

    sput v2, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    const-string v2, "\u06e0\u06e5\u06e2"

    invoke-static {v2}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v2

    goto/16 :goto_0

    :cond_6
    sget v2, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v3, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    rem-int/2addr v2, v3

    const v3, 0x1ac6d9

    add-int/2addr v2, v3

    goto/16 :goto_0

    :sswitch_6
    invoke-static {}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۢۨۤ۟()I

    move-result v2

    if-gtz v2, :cond_1

    sget v2, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    if-gtz v2, :cond_7

    const-string v2, "\u06df\u06e5\u06e4"

    invoke-static {v2}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v2

    goto/16 :goto_0

    :cond_7
    sget v2, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v3, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    rem-int/2addr v2, v3

    const v3, 0x1ab72b

    add-int/2addr v2, v3

    goto/16 :goto_0

    :sswitch_7
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa7be -> :sswitch_0
        0x1aab7d -> :sswitch_2
        0x1ab6be -> :sswitch_5
        0x1ab720 -> :sswitch_4
        0x1ac527 -> :sswitch_3
        0x1ac5aa -> :sswitch_1
        0x1ac5e7 -> :sswitch_7
        0x1ac620 -> :sswitch_6
    .end sparse-switch
.end method


# virtual methods
.method public final onPreDraw()Z
    .locals 26

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/16 v19, 0x0

    const/4 v5, 0x0

    const/16 v18, 0x0

    const/4 v12, 0x0

    const/16 v17, 0x0

    const/16 v20, 0x0

    const/4 v3, 0x0

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v10, 0x0

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v8, 0x0

    const/4 v13, 0x0

    const-string v14, "\u06e2\u06e4\u06e3"

    invoke-static {v14}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v21

    move-object v14, v2

    move-object v15, v7

    move-object/from16 v16, v9

    :goto_0
    sparse-switch v21, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v2, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    if-gtz v2, :cond_d

    const-string v2, "\u06e5\u06e5\u06e1"

    :goto_1
    invoke-static {v2}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto :goto_0

    :sswitch_1
    move-object/from16 v0, v16

    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_21

    const-string v2, "\u06e3\u06e4\u06e0"

    :goto_2
    invoke-static {v2}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto :goto_0

    :sswitch_2
    iget-object v2, v15, Li00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    const/4 v7, 0x0

    invoke-virtual {v2, v7}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    const/4 v7, 0x0

    invoke-virtual {v2, v7}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-virtual {v2, v7}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    const-wide/16 v22, 0x3d0

    sget v7, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    int-to-long v0, v7

    move-wide/from16 v24, v0

    xor-long v22, v22, v24

    move-wide/from16 v0, v22

    invoke-virtual {v2, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewPropertyAnimator;->start()V

    iget-object v2, v15, Li00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    sget v7, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v9, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    rem-int/2addr v7, v9

    const v9, 0x1aab66

    add-int/2addr v7, v9

    move-object/from16 v17, v2

    move/from16 v21, v7

    goto :goto_0

    :cond_0
    :sswitch_3
    sget v2, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v7, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    or-int/lit16 v7, v7, -0x23d5

    add-int/2addr v2, v7

    if-ltz v2, :cond_1

    invoke-static {}, Lio/fastkv/ۦۣ۠ۨ;->۠ۡۨۧ()I

    const-string v2, "\u06e4\u06e8\u06e3"

    :goto_3
    invoke-static {v2}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto :goto_0

    :cond_1
    const-string v2, "\u06e7\u06e2\u06e6"

    goto :goto_3

    :cond_2
    move-object v2, v5

    :goto_4
    sget v6, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    if-gtz v6, :cond_3

    invoke-static {}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->ۤۦۧۥ()I

    const-string v6, "\u06e1\u06e1\u06e5"

    move-object v7, v6

    move-object v9, v2

    :goto_5
    invoke-static {v7}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v2

    move-object v6, v9

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_3
    const-string v6, "\u06e0\u06e8\u06e4"

    move-object v7, v6

    move-object v9, v2

    goto :goto_5

    :sswitch_4
    new-instance v2, Lh40;

    iget-object v7, v15, Li00;->b:Ljava/lang/Object;

    sget-object v9, Lh40;->n:Lqh;

    invoke-direct {v2, v7, v9}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    new-instance v7, Li40;

    invoke-direct {v7}, Li40;-><init>()V

    iput-object v7, v2, Lh40;->j:Li40;

    sget v7, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v9, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    or-int/lit16 v9, v9, -0x3ae

    add-int/2addr v7, v9

    if-ltz v7, :cond_a

    const/16 v7, 0x62

    sput v7, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    const-string v7, "\u06e4\u06e6\u06e1"

    invoke-static {v7}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v7

    move-object v10, v2

    move/from16 v21, v7

    goto/16 :goto_0

    :cond_4
    move-object v8, v6

    :sswitch_5
    sget v2, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v7, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    rem-int/lit16 v7, v7, 0xc26

    sub-int/2addr v2, v7

    if-gtz v2, :cond_5

    const/16 v2, 0x1a

    sput v2, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    const-string v2, "\u06e2\u06e3\u06e2"

    invoke-static {v2}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_5
    const-string v2, "\u06e4\u06e6\u06e1"

    goto/16 :goto_1

    :sswitch_6
    new-instance v2, Lao;

    sget v7, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    xor-int/lit16 v7, v7, 0x2fe

    invoke-direct {v2, v15, v8, v7}, Lao;-><init>(Ljava/lang/Object;Lh40;I)V

    invoke-virtual {v8, v2}, Lh40;->a(Lsh;)V

    invoke-virtual {v8}, Lh40;->h()V

    invoke-static {}, Landroidx/emoji2/text/ۣۣ۟۟۠;->ۢۡۢۦ()I

    move-result v2

    if-gtz v2, :cond_6

    const-string v2, "\u06e6\u06e4"

    invoke-static {v2}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_6
    sget v2, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v7, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    add-int/2addr v2, v7

    const v7, -0x1ac1d1

    xor-int/2addr v2, v7

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_7
    const/4 v2, 0x0

    sget v7, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    if-gtz v7, :cond_7

    const-string v7, "\u06e2\u06e4\u06e8"

    invoke-static {v7}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۣ۠ۧۢ(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v18, v2

    move/from16 v21, v7

    goto/16 :goto_0

    :cond_7
    sget v7, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v9, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sub-int/2addr v7, v9

    const v9, 0x1ac820

    add-int/2addr v7, v9

    move-object/from16 v18, v2

    move/from16 v21, v7

    goto/16 :goto_0

    :cond_8
    :sswitch_8
    sget v2, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v7, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    div-int/lit16 v7, v7, -0x19ab

    or-int/2addr v2, v7

    if-gtz v2, :cond_9

    const/16 v2, 0x9

    sput v2, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    const-string v2, "\u06df\u06e2\u06e6"

    :goto_6
    invoke-static {v2}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_9
    const-string v2, "\u06e8\u06e3\u06e6"

    goto/16 :goto_1

    :sswitch_9
    sget v2, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v7, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sub-int/2addr v2, v7

    const v7, 0x1abeca

    add-int/2addr v2, v7

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_a
    const/4 v2, 0x1

    :goto_7
    return v2

    :sswitch_b
    const/4 v5, 0x0

    if-eqz v19, :cond_e

    sget v2, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v7, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    mul-int/lit16 v7, v7, -0x253f

    div-int/2addr v2, v7

    if-eqz v2, :cond_b

    move-object v2, v10

    :cond_a
    const-string v7, "\u06e6\u06e5\u06e8"

    invoke-static {v7}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v7

    move-object v10, v2

    move/from16 v21, v7

    goto/16 :goto_0

    :cond_b
    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v7, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sub-int/2addr v2, v7

    const v7, 0x1aadd2

    add-int/2addr v2, v7

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_c
    const v2, 0x3b03126f    # 0.002f

    invoke-virtual {v10, v2}, Lh40;->f(F)V

    new-instance v2, Ll9;

    const/4 v7, 0x0

    invoke-direct {v2, v7, v15}, Ll9;-><init>(ILjava/lang/Object;)V

    sget v7, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v9, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    xor-int/lit16 v9, v9, 0x1635

    sub-int/2addr v7, v9

    if-ltz v7, :cond_c

    const-string v7, "\u06e1\u06e8"

    invoke-static {v7}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v16, v2

    move/from16 v21, v7

    goto/16 :goto_0

    :cond_c
    sget v7, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v9, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    or-int/2addr v7, v9

    const v9, 0x1aa951

    xor-int/2addr v7, v9

    move-object/from16 v16, v2

    move/from16 v21, v7

    goto/16 :goto_0

    :cond_d
    sget v2, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v7, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    rem-int/2addr v2, v7

    const v7, -0x1aabd3

    xor-int/2addr v2, v7

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_d
    const-string v2, "\u06e6\u06e4"

    invoke-static {v2}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_e
    new-instance v2, Ljava/lang/UnsupportedOperationException;

    const-string v3, "Error: Update listeners must be added beforethe animation."

    invoke-direct {v2, v3}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_e
    :sswitch_f
    sget v2, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    if-ltz v2, :cond_f

    const/16 v2, 0x47

    sput v2, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    const-string v2, "\u06e4\u06e8\u06e0"

    invoke-static {v2}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_f
    sget v2, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v7, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    or-int/2addr v2, v7

    const v7, 0x1ac56d

    add-int/2addr v2, v7

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_10
    const/4 v2, 0x1

    goto/16 :goto_7

    :sswitch_11
    move-object v2, v3

    check-cast v2, Lh40;

    invoke-static {}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۢۨۤ۟()I

    move-result v7

    if-gtz v7, :cond_10

    invoke-static {}, Lcom/google/android/material/carousel/۠ۨۡۢ;->ۦۧۢ۟()I

    const-string v7, "\u06e6\u06e3\u06e5"

    invoke-static {v7}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v7

    move-object v11, v2

    move/from16 v21, v7

    goto/16 :goto_0

    :cond_10
    sget v7, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v9, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sub-int/2addr v7, v9

    const v9, 0x1aaaa4

    add-int/2addr v7, v9

    move-object v11, v2

    move/from16 v21, v7

    goto/16 :goto_0

    :sswitch_12
    iget-object v2, v15, Li00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    move/from16 v0, v20

    invoke-virtual {v2, v0, v10}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    sget v2, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    if-gtz v2, :cond_11

    move-object v8, v10

    :goto_8
    const-string v2, "\u06e0\u06e0"

    invoke-static {v2}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۣ۠ۧۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_11
    sget v2, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v7, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    rem-int/2addr v2, v7

    const v7, 0x1ac351

    add-int/2addr v2, v7

    move-object v8, v10

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_13
    sget v2, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sget v7, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    mul-int/2addr v2, v7

    const v7, 0x158267

    add-int/2addr v2, v7

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_14
    instance-of v2, v3, Lh40;

    if-eqz v2, :cond_2

    sget v2, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v6, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    add-int/lit16 v6, v6, -0xf5f

    or-int/2addr v2, v6

    if-ltz v2, :cond_12

    move-object v2, v5

    :goto_9
    const-string v6, "\u06e0\u06e8\u06e4"

    invoke-static {v6}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v7

    move-object v6, v2

    move/from16 v21, v7

    goto/16 :goto_0

    :cond_12
    move-object v6, v5

    goto :goto_8

    :sswitch_15
    invoke-static {}, Landroidx/profileinstaller/ۣ۠ۨۢ;->۟ۤۥ۟۟()I

    move-result v2

    if-gtz v2, :cond_13

    invoke-static {}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟ۧۢ۟ۧ()I

    const-string v2, "\u06e1\u06e0\u06e4"

    invoke-static {v2}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_13
    sget v2, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v7, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    or-int/2addr v2, v7

    const v7, -0x1aac85

    xor-int/2addr v2, v7

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_16
    move-object/from16 v0, p0

    iget-object v7, v0, Lm9;->a:Li00;

    iget-object v2, v7, Li00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-virtual {v2, v0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    sget v2, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    if-gtz v2, :cond_14

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟ۥۧۦۥ()I

    const-string v2, "\u06df\u06e7\u06e5"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v2

    move-object v15, v7

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_14
    sget v2, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v9, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    xor-int/2addr v2, v9

    const v9, 0x1abee3

    add-int/2addr v2, v9

    move-object v15, v7

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_17
    const v2, -0x7e080364

    sget v3, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    xor-int/2addr v2, v3

    move-object/from16 v0, v17

    invoke-virtual {v0, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v3

    sget v7, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v9, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    rem-int/lit16 v9, v9, 0x1c12

    sub-int/2addr v7, v9

    if-ltz v7, :cond_15

    invoke-static {}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟ۤۦۡ()I

    const-string v7, "\u06e6\u06e8\u06e5"

    invoke-static {v7}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v7

    move/from16 v20, v2

    move/from16 v21, v7

    goto/16 :goto_0

    :cond_15
    const-string v7, "\u06df\u06e7\u06e8"

    invoke-static {v7}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v7

    move/from16 v20, v2

    move/from16 v21, v7

    goto/16 :goto_0

    :sswitch_18
    const/high16 v2, 0x3f800000    # 1.0f

    float-to-double v0, v2

    move-wide/from16 v22, v0

    move-wide/from16 v0, v22

    iput-wide v0, v13, Li40;->i:D

    const/high16 v2, 0x43960000    # 300.0f

    invoke-virtual {v13, v2}, Li40;->b(F)V

    sget v2, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v7, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    xor-int/lit16 v7, v7, 0x1c2c

    rem-int/2addr v2, v7

    if-gtz v2, :cond_16

    const/16 v2, 0x1e

    sput v2, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    :goto_a
    const-string v2, "\u06e3\u06e7\u06df"

    :goto_b
    invoke-static {v2}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_16
    const-string v2, "\u06df\u06e7\u06e5"

    goto/16 :goto_1

    :sswitch_19
    const v2, 0x3f19999a    # 0.6f

    invoke-virtual {v13, v2}, Li40;->a(F)V

    goto :goto_a

    :sswitch_1a
    move-object v2, v11

    goto/16 :goto_9

    :sswitch_1b
    move-object v2, v4

    check-cast v2, Ljava/lang/Long;

    invoke-static {}, Landroid/app/۠ۨۥۨ;->ۣۣ۟ۨۧ()I

    move-result v7

    if-gtz v7, :cond_18

    const-string v7, "\u06e7\u06e4\u06e3"

    invoke-static {v7}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v7

    move-object v12, v2

    move/from16 v21, v7

    goto/16 :goto_0

    :sswitch_1c
    sget v2, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    if-ltz v2, :cond_17

    const-string v2, "\u06e6\u06e0\u06e2"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_17
    const-string v2, "\u06e4\u06e2\u06e2"

    goto :goto_b

    :sswitch_1d
    if-nez v12, :cond_0

    sget v2, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v7, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    add-int/2addr v2, v7

    const v7, -0x1acded

    xor-int/2addr v2, v7

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_1e
    iget-object v2, v15, Li00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const v7, 0x3f59999a    # 0.85f

    invoke-virtual {v2, v7}, Landroid/view/View;->setScaleX(F)V

    iget-object v2, v15, Li00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const v7, 0x3f59999a    # 0.85f

    invoke-virtual {v2, v7}, Landroid/view/View;->setScaleY(F)V

    invoke-static {}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣۣۢۢ()I

    move-result v2

    if-gtz v2, :cond_19

    move-object v2, v12

    :cond_18
    const-string v7, "\u06e5\u06e6\u06e8"

    invoke-static {v7}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v7

    move-object v12, v2

    move/from16 v21, v7

    goto/16 :goto_0

    :cond_19
    sget v2, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v7, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    or-int/2addr v2, v7

    const v7, -0x1ac55c

    xor-int/2addr v2, v7

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_1f
    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    move-result-wide v22

    move-object/from16 v0, p0

    iget-wide v0, v0, Lm9;->b:J

    move-wide/from16 v24, v0

    cmp-long v2, v22, v24

    if-eqz v2, :cond_8

    sget v2, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v7, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    div-int/lit16 v7, v7, 0x2063

    xor-int/2addr v2, v7

    if-ltz v2, :cond_1a

    invoke-static {}, Landroidx/recyclerview/widget/ۧۧۦۢ;->ۣۢۦۨ()I

    const-string v2, "\u06e4\u06e6\u06e8"

    goto/16 :goto_2

    :cond_1a
    const-string v2, "\u06e0\u06df\u06e2"

    goto/16 :goto_6

    :sswitch_20
    iget-object v2, v15, Li00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const v4, 0x7e060126

    sget v7, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    xor-int/2addr v4, v7

    invoke-virtual {v2, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v4

    instance-of v2, v4, Ljava/lang/Long;

    sget v7, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v9, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    add-int/2addr v7, v9

    const v9, -0xde84

    xor-int/2addr v7, v9

    move/from16 v19, v2

    move/from16 v21, v7

    goto/16 :goto_0

    :sswitch_21
    iget-object v2, v8, Lh40;->j:Li40;

    if-eqz v2, :cond_23

    sget v7, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    if-ltz v7, :cond_1b

    :cond_1b
    const-string v7, "\u06e6\u06e3\u06e8"

    invoke-static {v7}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v7

    move-object v13, v2

    move/from16 v21, v7

    goto/16 :goto_0

    :sswitch_22
    if-nez v6, :cond_4

    sget v2, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v7, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    add-int/lit16 v7, v7, -0xed2

    sub-int/2addr v2, v7

    if-gtz v2, :cond_1c

    invoke-static {}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۥ۟۟ۢ()I

    const-string v2, "\u06e0\u06e5\u06e3"

    invoke-static {v2}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v2

    move-object v8, v6

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_1c
    const-string v2, "\u06e0\u06e5\u06e3"

    move-object v7, v2

    move-object v8, v6

    move-object v9, v6

    goto/16 :goto_5

    :sswitch_23
    move-object/from16 v0, v16

    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget v2, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    if-ltz v2, :cond_1d

    const-string v2, "\u06e0\u06e7\u06df"

    invoke-static {v2}, L۠ۡۢۨ;->۟ۡۧۡۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_1d
    sget v2, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v7, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    or-int/2addr v2, v7

    const v7, 0x1aad8e

    add-int/2addr v2, v7

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_1e
    :sswitch_24
    sget v2, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    if-ltz v2, :cond_1f

    const/16 v2, 0x56

    sput v2, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    const-string v2, "\u06e8\u06e3\u06e1"

    invoke-static {v2}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_1f
    sget v2, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v7, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    add-int/2addr v2, v7

    const v7, 0xd80a

    xor-int/2addr v2, v7

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_25
    sget v2, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v7, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    rem-int/lit16 v7, v7, -0x81f

    div-int/2addr v2, v7

    if-eqz v2, :cond_20

    invoke-static {}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۟ۤۥۧۤ()I

    const-string v2, "\u06e7\u06e2\u06e1"

    invoke-static {v2}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v12, v18

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_20
    sget v2, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v7, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    div-int/2addr v2, v7

    const v7, 0xdcbc

    xor-int/2addr v2, v7

    move-object/from16 v12, v18

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_21
    :sswitch_26
    sget v2, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v7, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    mul-int/2addr v2, v7

    const v7, 0x1180e8

    add-int/2addr v2, v7

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_27
    iget-boolean v2, v10, Lh40;->e:Z

    if-nez v2, :cond_1e

    iget-object v2, v10, Lh40;->i:Ljava/util/ArrayList;

    invoke-static {}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟ۢۧۨۡ()I

    move-result v7

    if-gtz v7, :cond_22

    const/16 v7, 0x52

    sput v7, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    const-string v7, "\u06e0\u06e8\u06df"

    invoke-static {v7}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v7

    move-object v14, v2

    move/from16 v21, v7

    goto/16 :goto_0

    :cond_22
    sget v7, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v9, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    rem-int/2addr v7, v9

    const v9, 0x1ab5ab

    add-int/2addr v7, v9

    move-object v14, v2

    move/from16 v21, v7

    goto/16 :goto_0

    :sswitch_28
    move-object v2, v13

    :cond_23
    const-string v7, "\u06e3\u06e7\u06df"

    invoke-static {v7}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v7

    move-object v13, v2

    move/from16 v21, v7

    goto/16 :goto_0

    :sswitch_29
    move-object v2, v6

    goto/16 :goto_4

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe3 -> :sswitch_0
        0xdc00 -> :sswitch_11
        0xdc23 -> :sswitch_b
        0xdc27 -> :sswitch_e
        0xdcbe -> :sswitch_1d
        0x1aa721 -> :sswitch_24
        0x1aa742 -> :sswitch_1a
        0x1aa7fd -> :sswitch_19
        0x1aa800 -> :sswitch_14
        0x1aaac3 -> :sswitch_10
        0x1aaac8 -> :sswitch_27
        0x1aab43 -> :sswitch_17
        0x1aab7c -> :sswitch_12
        0x1aab7e -> :sswitch_4
        0x1aabb8 -> :sswitch_29
        0x1aabd7 -> :sswitch_8
        0x1aabdc -> :sswitch_22
        0x1aaea5 -> :sswitch_f
        0x1aaf80 -> :sswitch_5
        0x1ab2e1 -> :sswitch_16
        0x1ab2e6 -> :sswitch_1b
        0x1ab627 -> :sswitch_1
        0x1ab69f -> :sswitch_23
        0x1ab6fb -> :sswitch_6
        0x1aba24 -> :sswitch_0
        0x1aba9f -> :sswitch_1e
        0x1abaa6 -> :sswitch_28
        0x1abae3 -> :sswitch_13
        0x1abda7 -> :sswitch_d
        0x1abe67 -> :sswitch_9
        0x1ac147 -> :sswitch_26
        0x1ac168 -> :sswitch_d
        0x1ac1c8 -> :sswitch_15
        0x1ac1c9 -> :sswitch_20
        0x1ac1cb -> :sswitch_18
        0x1ac209 -> :sswitch_c
        0x1ac263 -> :sswitch_3
        0x1ac54a -> :sswitch_21
        0x1ac566 -> :sswitch_7
        0x1ac56b -> :sswitch_1f
        0x1ac5a4 -> :sswitch_a
        0x1ac5a6 -> :sswitch_25
        0x1ac947 -> :sswitch_5
        0x1ac94b -> :sswitch_2
        0x1ac9a8 -> :sswitch_1c
    .end sparse-switch
.end method
