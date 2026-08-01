.class public final Lfn;
.super Lm50;

# interfaces
.implements Lwm;


# instance fields
.field public e:I

.field public final f:Landroid/app/Activity;

.field public final g:Li00;

.field public final h:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Li00;Landroid/view/ViewGroup;Lld;)V
    .locals 3

    iput-object p1, p0, Lfn;->f:Landroid/app/Activity;

    iput-object p2, p0, Lfn;->g:Li00;

    iput-object p3, p0, Lfn;->h:Landroid/view/ViewGroup;

    invoke-direct {p0, p4}, Lm50;-><init>(Lld;)V

    const/4 v1, 0x0

    const-string v0, "\u06e6\u06e1\u06e6"

    invoke-static {v0}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "eaCXPKIas3VonK1RxnELi"

    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۧۡۢ;->۠ۧۤۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    sget v0, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v2, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    add-int/lit16 v2, v2, -0x1653

    add-int/2addr v0, v2

    if-ltz v0, :cond_1

    invoke-static {}, Landroid/view/ۢۥۢۦ;->ۤۦۢ۟()I

    const-string v0, "\u06e0\u06df\u06e6"

    :goto_1
    invoke-static {v0}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    :sswitch_1
    sget v0, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v2, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    mul-int/2addr v0, v2

    const v2, 0x1a0596

    add-int/2addr v0, v2

    goto :goto_0

    :cond_1
    const-string v0, "\u06e1\u06e7\u06e6"

    goto :goto_1

    :sswitch_2
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v2, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    mul-int/2addr v0, v2

    const v2, 0x181aee

    add-int/2addr v0, v2

    goto :goto_0

    :sswitch_3
    invoke-static {}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟۟ۤۦۨ()I

    move-result v0

    if-gtz v0, :cond_0

    sget v0, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v2, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    or-int/2addr v0, v2

    const v2, -0x1aaa50

    xor-int/2addr v0, v2

    goto :goto_0

    :sswitch_4
    const-string v0, "\u06e6\u06e1\u06e6"

    invoke-static {v0}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aaac7 -> :sswitch_0
        0x1aab1f -> :sswitch_1
        0x1aaf80 -> :sswitch_2
        0x1aba5f -> :sswitch_4
        0x1ac18b -> :sswitch_3
        0x1ac986 -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final a(Lld;)Lld;
    .locals 4

    const/4 v1, 0x0

    const-string v0, "\u06e4\u06e1\u06e4"

    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v3

    move-object v0, v1

    move-object v2, v1

    :goto_0
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget-object v1, p0, Lfn;->h:Landroid/view/ViewGroup;

    sget v2, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v3, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    rem-int/2addr v2, v3

    const v3, -0x1ac3b3

    xor-int/2addr v3, v2

    move-object v2, v1

    goto :goto_0

    :sswitch_1
    sget v1, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v3, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    div-int/lit16 v3, v3, -0xacf

    or-int/2addr v1, v3

    if-gtz v1, :cond_0

    const-string v1, "\u06e7\u06df"

    invoke-static {v1}, Landroid/app/۟ۦۦۤۥ;->ۦۨۥ۟(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :cond_0
    sget v1, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v3, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    div-int/2addr v1, v3

    const v3, 0x1aba05

    add-int/2addr v1, v3

    move v3, v1

    goto :goto_0

    :sswitch_2
    new-instance v1, Lfn;

    iget-object v3, p0, Lfn;->f:Landroid/app/Activity;

    invoke-direct {v1, v3, v0, v2, p1}, Lfn;-><init>(Landroid/app/Activity;Li00;Landroid/view/ViewGroup;Lld;)V

    return-object v1

    :sswitch_3
    iget-object v0, p0, Lfn;->g:Li00;

    sget v1, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v3, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sub-int/2addr v1, v3

    const v3, 0xdb50

    add-int/2addr v1, v3

    move v3, v1

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdcbb -> :sswitch_0
        0x1aba07 -> :sswitch_3
        0x1ac1e6 -> :sswitch_1
        0x1ac208 -> :sswitch_2
    .end sparse-switch
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const-string v0, "\u06e4\u06e4\u06e6"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    if-ltz v0, :cond_0

    const-string v0, "\u06e0\u06e5\u06e4"

    :goto_1
    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e4\u06e4\u06e6"

    goto :goto_1

    :sswitch_1
    move-object v0, p1

    check-cast v0, Loe;

    sget v0, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v1, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sub-int/2addr v0, v1

    const v1, 0x1ac9e0

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_2
    check-cast p2, Lld;

    invoke-virtual {p0, p2}, Lfn;->a(Lld;)Lld;

    move-result-object v0

    check-cast v0, Lfn;

    sget-object v1, Lvh;->n:Lvh;

    invoke-virtual {v0, v1}, Lfn;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0xdc9e -> :sswitch_0
        0x1aba66 -> :sswitch_1
        0x1ac94a -> :sswitch_2
    .end sparse-switch
.end method

.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    const/4 v7, 0x0

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v14, 0x0

    const/4 v11, 0x0

    const/4 v15, 0x0

    const/4 v6, 0x0

    const/4 v13, 0x0

    const/4 v4, 0x0

    const-string v9, "\u06e0\u06e2\u06e5"

    invoke-static {v9}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v17

    move-object v9, v4

    move-object v10, v6

    :goto_0
    sparse-switch v17, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v4, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    if-gtz v4, :cond_4

    invoke-static {}, Landroidx/emoji2/text/ۣۣ۟۟۠;->ۢۡۢۦ()I

    const-string v4, "\u06e1\u06e4\u06df"

    invoke-static {v4}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v17, v4

    goto :goto_0

    :sswitch_1
    sget v4, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    new-instance v6, Lt5;

    move-object/from16 v0, p0

    iget-object v0, v0, Lfn;->h:Landroid/view/ViewGroup;

    move-object/from16 v17, v0

    xor-int/lit16 v4, v4, 0x1eb

    move-object/from16 v0, v17

    invoke-direct {v6, v0, v4, v14}, Lt5;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v11, v6}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/ViewPropertyAnimator;->start()V

    invoke-static {}, Landroid/app/ۣۢۤۥ;->ۣۤۧۧ()I

    move-result v4

    if-gtz v4, :cond_0

    const-string v4, "\u06e5\u06e6\u06e1"

    invoke-static {v4}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v17, v4

    goto :goto_0

    :cond_0
    const-string v4, "\u06e3\u06e4\u06e3"

    :goto_1
    invoke-static {v4}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v17, v4

    goto :goto_0

    :sswitch_2
    const-wide/16 v18, -0x86b

    sget v4, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    int-to-long v0, v4

    move-wide/from16 v20, v0

    xor-long v18, v18, v20

    move-wide/from16 v0, v18

    move-object/from16 v2, p0

    invoke-static {v0, v1, v2}, Lff;->n(JLm50;)Ljava/lang/Object;

    move-result-object v4

    sget-object v8, Lpe;->a:Lpe;

    sget v6, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    if-ltz v6, :cond_1

    const-string v6, "\u06e5\u06e5\u06e2"

    invoke-static {v6}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v6

    move-object v12, v4

    move/from16 v17, v6

    goto :goto_0

    :cond_1
    sget v6, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v12, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    div-int/2addr v6, v12

    const v12, 0x1aaf21

    add-int/2addr v6, v12

    move-object v12, v4

    move/from16 v17, v6

    goto :goto_0

    :sswitch_3
    if-eqz v16, :cond_13

    const/4 v4, 0x1

    move/from16 v0, v16

    if-ne v0, v4, :cond_f

    sget v4, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    if-gtz v4, :cond_2

    invoke-static {}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟ۧۢ۟ۧ()I

    const-string v4, "\u06e2\u06e7\u06e2"

    invoke-static {v4}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v17, v4

    goto/16 :goto_0

    :cond_2
    sget v4, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v6, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    or-int/2addr v4, v6

    const v6, 0x1aa888

    add-int/2addr v4, v6

    move/from16 v17, v4

    goto/16 :goto_0

    :sswitch_4
    move-object/from16 v0, p0

    iget-object v6, v0, Lfn;->g:Li00;

    iget-object v4, v6, Li00;->b:Ljava/lang/Object;

    check-cast v4, Landroid/widget/LinearLayout;

    invoke-virtual {v4}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    const/4 v11, 0x0

    invoke-virtual {v4, v11}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    const-wide/16 v18, -0x8

    sget v11, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    int-to-long v0, v11

    move-wide/from16 v20, v0

    xor-long v18, v18, v20

    move-wide/from16 v0, v18

    invoke-virtual {v4, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    sget v11, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v14, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    or-int/2addr v11, v14

    const v14, 0x1ac87d

    xor-int v17, v11, v14

    move-object v11, v4

    move-object v14, v6

    goto/16 :goto_0

    :sswitch_5
    new-instance v4, Lh40;

    iget-object v6, v14, Li00;->b:Ljava/lang/Object;

    sget-object v13, Lh40;->n:Lqh;

    invoke-direct {v4, v6, v13}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    const v6, 0x3f59999a    # 0.85f

    const/high16 v13, 0x43480000    # 200.0f

    const/high16 v17, 0x3f800000    # 1.0f

    move/from16 v0, v17

    invoke-static {v6, v13, v0}, Lz30;->f(FFF)Li40;

    move-result-object v6

    iput-object v6, v4, Lh40;->j:Li40;

    sget v6, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v13, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    add-int/2addr v6, v13

    const v13, 0x1aa84d

    add-int/2addr v6, v13

    move-object v13, v4

    move/from16 v17, v6

    goto/16 :goto_0

    :sswitch_6
    const/high16 v4, 0x43480000    # 200.0f

    invoke-virtual {v10, v4}, Li40;->b(F)V

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-virtual {v10, v4}, Li40;->a(F)V

    const-string v4, "\u06e7\u06e2\u06e1"

    move-object v6, v4

    :goto_2
    invoke-static {v6}, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۧۦۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v17, v4

    goto/16 :goto_0

    :sswitch_7
    sget v4, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v6, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    or-int/lit16 v6, v6, -0xccb

    or-int/2addr v4, v6

    if-ltz v4, :cond_3

    const-string v4, "\u06e1\u06df\u06df"

    :goto_3
    invoke-static {v4}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v17, v4

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u06e0\u06e2\u06e5"

    goto :goto_3

    :sswitch_8
    new-instance v4, Ljava/lang/IllegalStateException;

    const-string v5, "QOErEukpEpAE8iINvDAYlwPiIhimLxiQBOkpCKY2GJcD9y4KoX0e31HvMgqgMxg=\n"

    const-string v6, "I4BHfsldfbA=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v4

    :cond_4
    const-string v4, "\u06df\u06e4\u06e7"

    invoke-static {v4}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v17, v4

    goto/16 :goto_0

    :sswitch_9
    move-object v4, v7

    :goto_4
    return-object v4

    :sswitch_a
    if-ne v12, v8, :cond_6

    sget v4, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v6, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    mul-int/lit16 v6, v6, -0x1e61

    div-int/2addr v4, v6

    if-eqz v4, :cond_5

    invoke-static {}, L۠ۡۢۨ;->ۥۡ۠ۨ()I

    const-string v4, "\u06e6\u06e7\u06e5"

    invoke-static {v4}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v17, v4

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06e3\u06e5\u06e7"

    :goto_5
    invoke-static {v4}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v17, v4

    goto/16 :goto_0

    :cond_6
    :sswitch_b
    invoke-static {}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۢۡۤ()I

    move-result v4

    if-ltz v4, :cond_7

    const/16 v4, 0x33

    sput v4, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    const-string v4, "\u06e8\u06e5\u06e6"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v17, v4

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u06e4\u06e1\u06df"

    goto :goto_3

    :sswitch_c
    const v4, 0x3f59999a    # 0.85f

    const/high16 v6, 0x43480000    # 200.0f

    const/high16 v17, 0x3f800000    # 1.0f

    move/from16 v0, v17

    invoke-static {v4, v6, v0}, Lz30;->f(FFF)Li40;

    move-result-object v4

    iput-object v4, v9, Lh40;->j:Li40;

    sget v4, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v6, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    add-int/lit16 v6, v6, -0x1b9b

    rem-int/2addr v4, v6

    if-ltz v4, :cond_8

    const/16 v4, 0x43

    sput v4, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    const-string v4, "\u06e1\u06e1\u06e0"

    goto/16 :goto_1

    :cond_8
    const-string v4, "\u06e4\u06e2\u06e1"

    goto/16 :goto_1

    :sswitch_d
    move-object v4, v8

    goto :goto_4

    :sswitch_e
    const-string v4, "\u06e5\u06e3\u06e2"

    goto :goto_5

    :sswitch_f
    invoke-static/range {p1 .. p1}, Lct;->y(Ljava/lang/Object;)V

    sget v4, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v6, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    rem-int/lit16 v6, v6, -0xef5

    mul-int/2addr v4, v6

    if-ltz v4, :cond_9

    const/16 v4, 0x57

    sput v4, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    const-string v4, "\u06e7\u06e4\u06e7"

    invoke-static {v4}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v17, v4

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u06e1\u06e0"

    move-object v6, v4

    goto/16 :goto_2

    :sswitch_10
    invoke-static/range {p1 .. p1}, Lct;->y(Ljava/lang/Object;)V

    const/4 v4, 0x1

    move-object/from16 v0, p0

    iput v4, v0, Lfn;->e:I

    sget v4, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    if-gtz v4, :cond_a

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟۟ۤۥ۠()I

    const-string v4, "\u06df\u06e7\u06df"

    invoke-static {v4}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v17, v4

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06e2\u06e8"

    invoke-static {v4}, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۧۦۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v17, v4

    goto/16 :goto_0

    :sswitch_11
    move-object/from16 v0, p0

    iget-object v4, v0, Lfn;->f:Landroid/app/Activity;

    invoke-virtual {v4}, Landroid/app/Activity;->isFinishing()Z

    move-result v5

    if-nez v5, :cond_11

    sget v5, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v6, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sub-int/2addr v5, v6

    const v6, 0x1ac006

    add-int/2addr v6, v5

    move-object v5, v4

    move/from16 v17, v6

    goto/16 :goto_0

    :cond_b
    :sswitch_12
    const-string v4, "\u06e5\u06e6\u06e1"

    move-object v6, v4

    :goto_6
    invoke-static {v6}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v17, v4

    goto/16 :goto_0

    :sswitch_13
    invoke-virtual {v9}, Lh40;->h()V

    sget v4, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v6, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    rem-int/lit16 v6, v6, 0x11e4

    add-int/2addr v4, v6

    if-gtz v4, :cond_c

    invoke-static {}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۣۣۡ۟()I

    const-string v4, "\u06e8\u06e5\u06e0"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v17, v4

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06e6\u06e2\u06e1"

    move-object v6, v4

    goto/16 :goto_2

    :sswitch_14
    sget-object v7, Lvh;->n:Lvh;

    move-object/from16 v0, p0

    iget v4, v0, Lfn;->e:I

    sget v6, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v16, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    move/from16 v0, v16

    xor-int/lit16 v0, v0, -0x19db

    move/from16 v16, v0

    mul-int v6, v6, v16

    if-ltz v6, :cond_d

    const-string v6, "\u06e3\u06e4\u06e3"

    invoke-static {v6}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v16, v4

    move/from16 v17, v6

    goto/16 :goto_0

    :cond_d
    sget v6, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v16, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    add-int v6, v6, v16

    const v16, 0x1ab1f2

    add-int v6, v6, v16

    move/from16 v16, v4

    move/from16 v17, v6

    goto/16 :goto_0

    :sswitch_15
    new-instance v6, Lh40;

    iget-object v4, v14, Li00;->b:Ljava/lang/Object;

    sget-object v10, Lh40;->m:Lqh;

    invoke-direct {v6, v4, v10}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    new-instance v4, Li40;

    const/high16 v10, 0x42700000    # 60.0f

    invoke-static {v10}, Lff;->p(F)F

    move-result v10

    neg-float v10, v10

    invoke-direct {v4, v10}, Li40;-><init>(F)V

    sget v10, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v15, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    or-int/2addr v10, v15

    const v15, 0x1aa80b

    add-int v17, v10, v15

    move-object v10, v4

    move-object v15, v6

    goto/16 :goto_0

    :sswitch_16
    iput-object v10, v15, Lh40;->j:Li40;

    invoke-virtual {v15}, Lh40;->h()V

    invoke-static {}, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۢۧ()I

    move-result v4

    if-ltz v4, :cond_e

    const-string v4, "\u06e1\u06e0"

    invoke-static {v4}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v17, v4

    goto/16 :goto_0

    :cond_e
    sget v4, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v6, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sub-int/2addr v4, v6

    const v6, 0x1ac055

    add-int/2addr v4, v6

    move/from16 v17, v4

    goto/16 :goto_0

    :sswitch_17
    invoke-virtual {v13}, Lh40;->h()V

    new-instance v4, Lh40;

    iget-object v6, v14, Li00;->b:Ljava/lang/Object;

    sget-object v9, Lh40;->o:Lqh;

    invoke-direct {v4, v6, v9}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    sget v6, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v9, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    div-int/2addr v6, v9

    const v9, 0x1ac909

    add-int/2addr v6, v9

    move-object v9, v4

    move/from16 v17, v6

    goto/16 :goto_0

    :cond_f
    :sswitch_18
    sget v4, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    if-gtz v4, :cond_10

    const/16 v4, 0x53

    sput v4, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    const-string v4, "\u06e2\u06e1\u06e8"

    invoke-static {v4}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v17, v4

    goto/16 :goto_0

    :cond_10
    sget v4, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v6, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    mul-int/2addr v4, v6

    const v6, 0x22e2fd

    add-int/2addr v4, v6

    move/from16 v17, v4

    goto/16 :goto_0

    :sswitch_19
    move-object v4, v5

    :cond_11
    sget v5, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    if-gtz v5, :cond_12

    const-string v6, "\u06e2\u06e4\u06e8"

    move-object v5, v4

    goto/16 :goto_2

    :cond_12
    const-string v6, "\u06e6\u06e2\u06e1"

    move-object v5, v4

    goto/16 :goto_6

    :cond_13
    :sswitch_1a
    sget v4, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v6, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    rem-int/lit16 v6, v6, -0x1929

    add-int/2addr v4, v6

    if-ltz v4, :cond_14

    invoke-static {}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۢۡۤ()I

    const-string v4, "\u06e6\u06e5\u06e0"

    move-object v6, v4

    goto/16 :goto_6

    :cond_14
    sget v4, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v6, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    add-int/2addr v4, v6

    const v6, 0x1ab0a6

    add-int/2addr v4, v6

    move/from16 v17, v4

    goto/16 :goto_0

    :sswitch_1b
    invoke-virtual {v5}, Landroid/app/Activity;->isDestroyed()Z

    move-result v4

    if-eqz v4, :cond_b

    sget v4, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v6, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    rem-int/lit16 v6, v6, 0x7f0

    mul-int/2addr v4, v6

    if-ltz v4, :cond_15

    const-string v4, "\u06e4\u06e2\u06e1"

    goto/16 :goto_5

    :cond_15
    sget v4, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v6, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    or-int/2addr v4, v6

    const v6, 0x1ac22b

    add-int/2addr v4, v6

    move/from16 v17, v4

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc1f -> :sswitch_0
        0xdc42 -> :sswitch_1a
        0xdc46 -> :sswitch_2
        0x1aa71f -> :sswitch_18
        0x1aa763 -> :sswitch_17
        0x1aa7a2 -> :sswitch_b
        0x1aa7f7 -> :sswitch_6
        0x1aa81f -> :sswitch_f
        0x1aab23 -> :sswitch_14
        0x1aaec0 -> :sswitch_b
        0x1aaf1c -> :sswitch_19
        0x1aaf25 -> :sswitch_a
        0x1aaf5b -> :sswitch_10
        0x1ab33d -> :sswitch_7
        0x1ab35c -> :sswitch_3
        0x1ab6a2 -> :sswitch_15
        0x1ab6c5 -> :sswitch_d
        0x1aba02 -> :sswitch_11
        0x1aba23 -> :sswitch_13
        0x1abe04 -> :sswitch_19
        0x1abe42 -> :sswitch_1b
        0x1abe60 -> :sswitch_4
        0x1ac1a5 -> :sswitch_9
        0x1ac200 -> :sswitch_12
        0x1ac244 -> :sswitch_8
        0x1ac246 -> :sswitch_5
        0x1ac566 -> :sswitch_16
        0x1ac5aa -> :sswitch_e
        0x1ac909 -> :sswitch_c
        0x1ac983 -> :sswitch_1
    .end sparse-switch
.end method
