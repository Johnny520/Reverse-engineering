.class public final Ljn;
.super Lt50;

# interfaces
.implements Lym;


# instance fields
.field public final e:I

.field public f:I

.field public final g:Landroid/app/Activity;

.field public final h:Lp00;

.field public final i:Landroid/view/ViewGroup;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lp00;Landroid/view/ViewGroup;Lvd;I)V
    .locals 5

    iput p5, p0, Ljn;->e:I

    iput-object p1, p0, Ljn;->g:Landroid/app/Activity;

    iput-object p2, p0, Ljn;->h:Lp00;

    iput-object p3, p0, Ljn;->i:Landroid/view/ViewGroup;

    invoke-direct {p0, p4}, Lt50;-><init>(Lvd;)V

    const-wide/16 v0, 0x0

    const-string v2, "\u06df\u06e1\u06e1"

    invoke-static {v2}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v4

    move-wide v2, v0

    :goto_0
    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "xm"

    invoke-static {v0}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨ۠۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget v2, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v3, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    div-int/lit16 v3, v3, -0x3ca

    xor-int/2addr v2, v3

    if-gtz v2, :cond_2

    invoke-static {}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣۢ۠۠()I

    const-string v2, "\u06e1\u06e2"

    invoke-static {v2}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v4

    move-wide v2, v0

    goto :goto_0

    :cond_0
    :sswitch_1
    sget v0, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v1, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    or-int/lit16 v1, v1, -0x120f

    xor-int/2addr v0, v1

    if-ltz v0, :cond_1

    const/16 v0, 0x4f

    sput v0, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    const-string v0, "\u06e8\u06e0\u06e8"

    invoke-static {v0}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_1
    sget v0, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v1, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    or-int/2addr v0, v1

    const v1, 0x1ab79a

    add-int/2addr v0, v1

    move v4, v0

    goto :goto_0

    :cond_2
    sget v2, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v3, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    mul-int/2addr v2, v3

    const v3, 0x14d4f1

    add-int v4, v2, v3

    move-wide v2, v0

    goto :goto_0

    :sswitch_2
    sget v0, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v1, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    add-int/lit16 v1, v1, 0x2186

    rem-int/2addr v0, v1

    if-gtz v0, :cond_3

    const-string v0, "\u06e0\u06e3\u06e8"

    invoke-static {v0}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_3
    sget v0, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v1, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    xor-int/2addr v0, v1

    const v1, -0x1aa5f0

    xor-int/2addr v0, v1

    move v4, v0

    goto :goto_0

    :sswitch_3
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v2, v3}, Ljava/io/PrintStream;->println(J)V

    sget v0, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v1, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    xor-int/lit16 v1, v1, 0x132b

    div-int/2addr v0, v1

    if-eqz v0, :cond_4

    const/4 v0, 0x4

    sput v0, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    const-string v0, "\u06e6\u06e3\u06e1"

    :goto_1
    invoke-static {v0}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_4
    const-string v0, "\u06e3\u06e2\u06e8"

    goto :goto_1

    :sswitch_4
    invoke-static {}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣۤۧۥ()I

    move-result v0

    if-gtz v0, :cond_0

    sget v0, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v1, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    rem-int/2addr v0, v1

    const v1, 0xdc93

    add-int/2addr v0, v1

    move v4, v0

    goto/16 :goto_0

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdbe9 -> :sswitch_0
        0xdc21 -> :sswitch_2
        0x1aa73f -> :sswitch_4
        0x1ab669 -> :sswitch_5
        0x1ac1c4 -> :sswitch_1
        0x1ac1ea -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final a(Lvd;)Lvd;
    .locals 6

    const/4 v0, 0x0

    const-string v1, "\u06e8\u06df\u06e5"

    invoke-static {v1}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v1

    move-object v3, v0

    move-object v4, v0

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget-object v0, p0, Ljn;->i:Landroid/view/ViewGroup;

    sget v1, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v2, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    xor-int/2addr v1, v2

    const v2, 0x1abd69

    add-int/2addr v1, v2

    move-object v4, v0

    goto :goto_0

    :sswitch_1
    iget v0, p0, Ljn;->e:I

    packed-switch v0, :pswitch_data_0

    :sswitch_2
    sget v0, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v1, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    add-int/lit16 v1, v1, -0x2390

    sub-int/2addr v0, v1

    if-gtz v0, :cond_1

    invoke-static {}, Lۤۨۤۨ;->۟ۢۦۣۢ()I

    const-string v0, "\u06e7\u06df\u06e4"

    invoke-static {v0}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto :goto_0

    :sswitch_3
    new-instance v0, Ljn;

    iget-object v1, p0, Ljn;->g:Landroid/app/Activity;

    iget-object v2, p0, Ljn;->h:Lp00;

    const/4 v5, 0x0

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Ljn;-><init>(Landroid/app/Activity;Lp00;Landroid/view/ViewGroup;Lvd;I)V

    :goto_1
    return-object v0

    :sswitch_4
    iget-object v3, p0, Ljn;->i:Landroid/view/ViewGroup;

    sget v0, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    if-gtz v0, :cond_0

    const-string v0, "\u06e1\u06e3\u06e0"

    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e4\u06e1\u06e0"

    invoke-static {v0}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e1\u06e3\u06e0"

    :goto_2
    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto :goto_0

    :sswitch_5
    sget v0, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    if-ltz v0, :cond_2

    const-string v0, "\u06e8\u06e3\u06e1"

    goto :goto_2

    :cond_2
    const-string v0, "\u06e8\u06df\u06e5"

    goto :goto_2

    :sswitch_6
    new-instance v0, Ljn;

    iget-object v1, p0, Ljn;->g:Landroid/app/Activity;

    iget-object v2, p0, Ljn;->h:Lp00;

    const/4 v5, 0x1

    move-object v3, v4

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Ljn;-><init>(Landroid/app/Activity;Lp00;Landroid/view/ViewGroup;Lvd;I)V

    goto :goto_1

    :pswitch_0
    :sswitch_7
    sget v0, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    if-gtz v0, :cond_3

    const-string v0, "\u06e3\u06e5\u06df"

    invoke-static {v0}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e5\u06e0\u06df"

    invoke-static {v0}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x1aaefe -> :sswitch_0
        0x1ab2de -> :sswitch_7
        0x1ab605 -> :sswitch_2
        0x1aba03 -> :sswitch_3
        0x1aba24 -> :sswitch_5
        0x1abadc -> :sswitch_6
        0x1abda4 -> :sswitch_4
        0x1ac8ce -> :sswitch_1
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    const/4 v2, 0x0

    const/4 v0, 0x0

    const-string v1, "\u06e2\u06e0\u06e5"

    invoke-static {v1}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v3

    move-object v1, v0

    :goto_0
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-virtual {p0, v1}, Ljn;->a(Lvd;)Lvd;

    move-result-object v0

    check-cast v0, Ljn;

    sget-object v1, Lxh;->n:Lxh;

    invoke-virtual {v0, v1}, Ljn;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_1
    return-object v0

    :sswitch_1
    iget v0, p0, Ljn;->e:I

    sget v2, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v3, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    div-int/lit16 v3, v3, -0x800

    sub-int/2addr v2, v3

    if-gtz v2, :cond_0

    invoke-static {}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۟۟۟ۢ()I

    const-string v2, "\u06e5\u06e3\u06e6"

    invoke-static {v2}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v3

    move v2, v0

    goto :goto_0

    :cond_0
    sget v2, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v3, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    or-int/2addr v2, v3

    const v3, -0x1ac7e6

    xor-int/2addr v3, v2

    move v2, v0

    goto :goto_0

    :sswitch_2
    move-object v0, p2

    check-cast v0, Lvd;

    sget v1, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    if-gtz v1, :cond_1

    const/16 v1, 0x61

    sput v1, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    :cond_1
    const-string v1, "\u06e6\u06e7\u06e2"

    invoke-static {v1}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v3

    move-object v1, v0

    goto :goto_0

    :sswitch_3
    packed-switch v2, :pswitch_data_0

    :sswitch_4
    invoke-static {}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۨۧ۟ۤ()I

    move-result v0

    if-ltz v0, :cond_3

    invoke-static {}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۧۧ()I

    const-string v0, "\u06e4\u06e1\u06e4"

    :goto_2
    invoke-static {v0}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :sswitch_5
    move-object v0, p1

    check-cast v0, Lpe;

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۤ۟ۦ۟()I

    move-result v0

    if-ltz v0, :cond_2

    const-string v0, "\u06e0\u06df\u06e2"

    invoke-static {v0}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :cond_2
    sget v0, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v3, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sub-int/2addr v0, v3

    const v3, 0x1aafdc

    xor-int/2addr v0, v3

    move v3, v0

    goto :goto_0

    :sswitch_6
    sget v0, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v3, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    add-int/2addr v0, v3

    const v3, 0x1ab2a9

    add-int/2addr v0, v3

    move v3, v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e5\u06e6\u06e0"

    goto :goto_2

    :pswitch_0
    :sswitch_7
    sget v0, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    if-ltz v0, :cond_4

    const/16 v0, 0x2f

    sput v0, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    const-string v0, "\u06e7\u06e2\u06e1"

    :goto_3
    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_4
    const-string v0, "\u06e0\u06df\u06e2"

    goto :goto_3

    :sswitch_8
    invoke-virtual {p0, v1}, Ljn;->a(Lvd;)Lvd;

    move-result-object v0

    check-cast v0, Ljn;

    sget-object v1, Lxh;->n:Lxh;

    invoke-virtual {v0, v1}, Ljn;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        0x1aaac3 -> :sswitch_0
        0x1aae88 -> :sswitch_2
        0x1ab267 -> :sswitch_1
        0x1abe08 -> :sswitch_7
        0x1abe5f -> :sswitch_8
        0x1ac149 -> :sswitch_4
        0x1ac241 -> :sswitch_3
        0x1ac52e -> :sswitch_6
        0x1ac5e9 -> :sswitch_5
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 34

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/16 v24, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v14, 0x0

    const/16 v23, 0x0

    const/4 v9, 0x0

    const/16 v28, 0x0

    const/16 v25, 0x0

    const/4 v6, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    const/4 v4, 0x0

    const/16 v26, 0x0

    const/4 v11, 0x0

    const/16 v27, 0x0

    const/4 v15, 0x0

    const/4 v12, 0x0

    const-string v20, "\u06e1\u06e7\u06e1"

    invoke-static/range {v20 .. v20}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v29

    move-object/from16 v20, v4

    move-object/from16 v21, v9

    move-object/from16 v22, v14

    :goto_0
    sparse-switch v29, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    move-object v12, v6

    :sswitch_1
    return-object v12

    :sswitch_2
    move-object/from16 v0, p0

    iget-object v9, v0, Ljn;->h:Lp00;

    iget-object v4, v9, Lp00;->b:Ljava/lang/Object;

    check-cast v4, Landroid/widget/LinearLayout;

    invoke-virtual {v4}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    const/4 v14, 0x0

    invoke-virtual {v4, v14}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    const-wide/16 v22, 0x158

    sget v14, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    int-to-long v0, v14

    move-wide/from16 v30, v0

    xor-long v22, v22, v30

    move-wide/from16 v0, v22

    invoke-virtual {v4, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    new-instance v14, Lin;

    move-object/from16 v0, p0

    iget-object v0, v0, Ljn;->i:Landroid/view/ViewGroup;

    move-object/from16 v22, v0

    const/16 v23, 0x1

    move-object/from16 v0, v22

    move/from16 v1, v23

    invoke-direct {v14, v0, v9, v1}, Lin;-><init>(Landroid/view/ViewGroup;Lp00;I)V

    invoke-virtual {v4, v14}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/ViewPropertyAnimator;->start()V

    new-instance v4, Lo40;

    iget-object v14, v9, Lp00;->b:Ljava/lang/Object;

    sget-object v22, Lo40;->n:Lsh;

    move-object/from16 v0, v22

    invoke-direct {v4, v14, v0}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟ۧ۠ۧۢ()I

    move-result v14

    if-ltz v14, :cond_0

    const/16 v14, 0x4d

    sput v14, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    const-string v14, "\u06df\u06e6\u06e6"

    invoke-static {v14}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v14

    move-object/from16 v22, v9

    move-object/from16 v23, v4

    move/from16 v29, v14

    goto :goto_0

    :cond_0
    sget v14, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v22, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    rem-int v14, v14, v22

    const v22, 0x1aac4a

    add-int v14, v14, v22

    move-object/from16 v22, v9

    move-object/from16 v23, v4

    move/from16 v29, v14

    goto :goto_0

    :sswitch_3
    sget v4, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    if-gtz v4, :cond_1

    const-string v4, "\u06e6\u06df"

    invoke-static {v4}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v29, v4

    goto :goto_0

    :cond_1
    const-string v4, "\u06df\u06e4\u06e8"

    :goto_1
    invoke-static {v4}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v29, v4

    goto/16 :goto_0

    :sswitch_4
    invoke-static/range {p1 .. p1}, Lgu;->M(Ljava/lang/Object;)V

    const/4 v4, 0x1

    move-object/from16 v0, p0

    iput v4, v0, Ljn;->f:I

    const-wide/16 v30, -0x98e

    sget v4, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    int-to-long v0, v4

    move-wide/from16 v32, v0

    xor-long v30, v30, v32

    move-wide/from16 v0, v30

    move-object/from16 v2, p0

    invoke-static {v0, v1, v2}, Lg80;->i(JLt50;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۟ۦۣۣۧ()I

    move-result v9

    if-gtz v9, :cond_23

    invoke-static {}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۨۧ۟ۤ()I

    const-string v9, "\u06e7\u06e6\u06e2"

    invoke-static {v9}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v19, v4

    move/from16 v29, v9

    goto/16 :goto_0

    :sswitch_5
    sget-object v17, Lxh;->n:Lxh;

    move-object/from16 v0, p0

    iget v4, v0, Ljn;->f:I

    if-eqz v4, :cond_1e

    invoke-static {}, Lcom/google/android/material/carousel/ۢۢۢۥ;->۟ۡ۟۠ۧ()I

    move-result v9

    if-gtz v9, :cond_2

    const/16 v9, 0x33

    sput v9, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    const-string v9, "\u06e0\u06e3\u06e1"

    invoke-static {v9}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v9

    move/from16 v18, v4

    move/from16 v29, v9

    goto/16 :goto_0

    :cond_2
    const-string v9, "\u06e2\u06e7\u06e1"

    invoke-static {v9}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v9

    move/from16 v18, v4

    move/from16 v29, v9

    goto/16 :goto_0

    :sswitch_6
    move-object/from16 v0, v26

    iput-object v11, v0, Lo40;->k:Lp40;

    invoke-virtual/range {v26 .. v26}, Lo40;->h()V

    new-instance v9, Lo40;

    move-object/from16 v0, v20

    iget-object v4, v0, Lp00;->b:Ljava/lang/Object;

    sget-object v14, Lo40;->o:Lsh;

    invoke-direct {v9, v4, v14}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    invoke-static {}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۧۧ()I

    move-result v4

    if-ltz v4, :cond_3

    const/16 v4, 0x49

    sput v4, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    const-string v4, "\u06df\u06e4\u06df"

    :goto_2
    invoke-static {v4}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v27, v9

    move/from16 v29, v4

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u06e5\u06e6\u06e0"

    goto :goto_2

    :sswitch_7
    move-object v4, v7

    :goto_3
    sget v7, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v9, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    add-int/lit16 v9, v9, -0xafb

    or-int/2addr v7, v9

    if-ltz v7, :cond_4

    const/16 v7, 0x56

    sput v7, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    const-string v7, "\u06e1\u06e4\u06e0"

    move-object v9, v7

    :goto_4
    invoke-static {v9}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v9

    move-object v7, v4

    move/from16 v29, v9

    goto/16 :goto_0

    :cond_4
    const-string v9, "\u06e0\u06e2"

    move-object v7, v4

    :goto_5
    invoke-static {v9}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v29, v4

    goto/16 :goto_0

    :sswitch_8
    move-object/from16 v0, p0

    iget v4, v0, Ljn;->e:I

    packed-switch v4, :pswitch_data_0

    :sswitch_9
    sget v4, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v9, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    div-int/lit16 v9, v9, 0x1f7d

    sub-int/2addr v4, v9

    if-ltz v4, :cond_18

    invoke-static {}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۨۧ۟ۤ()I

    const-string v4, "\u06e5\u06e3\u06e0"

    move-object v9, v4

    goto :goto_5

    :sswitch_a
    invoke-virtual/range {v16 .. v16}, Landroid/app/Activity;->isDestroyed()Z

    move-result v4

    if-eqz v4, :cond_16

    sget v4, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v9, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    rem-int/2addr v4, v9

    const v9, 0x1ab0a5

    add-int/2addr v4, v9

    move-object/from16 v12, v17

    move/from16 v29, v4

    goto/16 :goto_0

    :sswitch_b
    sget-object v4, Lqe;->a:Lqe;

    move-object/from16 v0, v24

    if-ne v0, v4, :cond_19

    sget v5, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v9, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    xor-int/lit16 v9, v9, 0x18c9

    or-int/2addr v5, v9

    if-ltz v5, :cond_5

    invoke-static {}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۧۧۥۦ()I

    :goto_6
    const-string v5, "\u06e2\u06e5\u06e7"

    move-object v9, v5

    move-object v14, v4

    :goto_7
    invoke-static {v9}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v4

    move-object v5, v14

    move/from16 v29, v4

    goto/16 :goto_0

    :cond_5
    sget v5, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v9, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    div-int/2addr v5, v9

    const v9, 0x1ac983

    add-int/2addr v9, v5

    move-object v5, v4

    move/from16 v29, v9

    goto/16 :goto_0

    :sswitch_c
    const-string v9, "\u06e2\u06e3\u06e6"

    move-object v4, v7

    goto :goto_4

    :sswitch_d
    const/4 v4, 0x1

    if-ne v10, v4, :cond_12

    invoke-static/range {p1 .. p1}, Lgu;->M(Ljava/lang/Object;)V

    sget v4, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v9, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    mul-int/2addr v4, v9

    const v9, 0x186f0

    add-int/2addr v4, v9

    move/from16 v29, v4

    goto/16 :goto_0

    :sswitch_e
    new-instance v4, Ljava/lang/IllegalStateException;

    const-string v5, "hpq5OZ583lDCibAmy2XUV8WZsDPRetRQwpK7I9Fj1FfFjLwh1ijSH5eUoCHXZtQ=\n"

    const-string v6, "5fvVVb4IsXA=\n"

    invoke-static {v5, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v4

    :sswitch_f
    move-object/from16 v0, p0

    iget-object v4, v0, Ljn;->g:Landroid/app/Activity;

    invoke-virtual {v4}, Landroid/app/Activity;->isFinishing()Z

    move-result v6

    if-nez v6, :cond_28

    sget v6, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v7, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    xor-int/lit16 v7, v7, -0x15ae

    or-int/2addr v6, v7

    if-ltz v6, :cond_6

    invoke-static {}, Landroidx/core/widget/۟ۡۦۢۥ;->ۡۧۡۦ()I

    const-string v6, "\u06e1\u06e7\u06e7"

    invoke-static {v6}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v9

    move-object v7, v4

    move-object v6, v8

    move/from16 v29, v9

    goto/16 :goto_0

    :cond_6
    const-string v6, "\u06e1\u06e8\u06e4"

    move-object v9, v6

    move-object v14, v8

    :goto_8
    invoke-static {v9}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v9

    move-object v7, v4

    move-object v6, v14

    move/from16 v29, v9

    goto/16 :goto_0

    :sswitch_10
    sget-object v8, Lxh;->n:Lxh;

    move-object/from16 v0, p0

    iget v4, v0, Ljn;->f:I

    if-eqz v4, :cond_26

    sget v9, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v10, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    or-int/lit16 v10, v10, -0x12a6

    rem-int/2addr v9, v10

    if-ltz v9, :cond_7

    const/16 v9, 0x38

    sput v9, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    :goto_9
    const-string v9, "\u06df\u06e2\u06e4"

    invoke-static {v9}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v9

    move v10, v4

    move/from16 v29, v9

    goto/16 :goto_0

    :cond_7
    const-string v9, "\u06e7\u06e4\u06e1"

    move v10, v4

    :goto_a
    invoke-static {v9}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v29, v4

    goto/16 :goto_0

    :sswitch_11
    const v4, 0x3f59999a    # 0.85f

    const/high16 v9, 0x43480000    # 200.0f

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v4, v9, v14}, Lg40;->f(FFF)Lp40;

    move-result-object v4

    iput-object v4, v15, Lo40;->k:Lp40;

    invoke-virtual {v15}, Lo40;->h()V

    invoke-static {}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟۠ۢۧۡ()I

    move-result v4

    if-ltz v4, :cond_8

    invoke-static {}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۧۧ()I

    const-string v9, "\u06e8\u06e5\u06e4"

    move-object v4, v11

    :goto_b
    invoke-static {v9}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v9

    move-object v11, v4

    move/from16 v29, v9

    goto/16 :goto_0

    :cond_8
    sget v4, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    sget v9, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    rem-int/2addr v4, v9

    const v9, -0x1ac51c

    xor-int/2addr v4, v9

    move/from16 v29, v4

    goto/16 :goto_0

    :sswitch_12
    new-instance v4, Lp40;

    const/high16 v9, 0x42700000    # 60.0f

    invoke-static {v9}, Lmp;->p(F)F

    move-result v9

    neg-float v9, v9

    invoke-direct {v4, v9}, Lp40;-><init>(F)V

    const/high16 v9, 0x43480000    # 200.0f

    invoke-virtual {v4, v9}, Lp40;->b(F)V

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-virtual {v4, v9}, Lp40;->a(F)V

    sget v9, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    if-ltz v9, :cond_9

    const-string v9, "\u06e8\u06e4\u06e3"

    invoke-static {v9}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v21, v4

    move/from16 v29, v9

    goto/16 :goto_0

    :cond_9
    sget v9, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v14, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sub-int/2addr v9, v14

    const v14, 0x1ab7e5

    add-int/2addr v9, v14

    move-object/from16 v21, v4

    move/from16 v29, v9

    goto/16 :goto_0

    :sswitch_13
    const v4, 0x3f59999a    # 0.85f

    const/high16 v9, 0x43480000    # 200.0f

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v4, v9, v14}, Lg40;->f(FFF)Lp40;

    move-result-object v4

    move-object/from16 v0, v28

    iput-object v4, v0, Lo40;->k:Lp40;

    invoke-virtual/range {v28 .. v28}, Lo40;->h()V

    new-instance v4, Lo40;

    move-object/from16 v0, v22

    iget-object v9, v0, Lp00;->b:Ljava/lang/Object;

    sget-object v14, Lo40;->p:Lsh;

    invoke-direct {v4, v9, v14}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    sget v9, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v14, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    xor-int/2addr v9, v14

    const v14, 0xd8d4

    add-int/2addr v9, v14

    move-object/from16 v25, v4

    move/from16 v29, v9

    goto/16 :goto_0

    :sswitch_14
    const v4, 0x3f59999a    # 0.85f

    const/high16 v9, 0x43480000    # 200.0f

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v4, v9, v14}, Lg40;->f(FFF)Lp40;

    move-result-object v4

    move-object/from16 v0, v27

    iput-object v4, v0, Lo40;->k:Lp40;

    invoke-virtual/range {v27 .. v27}, Lo40;->h()V

    new-instance v4, Lo40;

    move-object/from16 v0, v20

    iget-object v9, v0, Lp00;->b:Ljava/lang/Object;

    sget-object v14, Lo40;->p:Lsh;

    invoke-direct {v4, v9, v14}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    sget v9, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v14, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    mul-int/lit16 v14, v14, -0x18bf

    xor-int/2addr v9, v14

    if-ltz v9, :cond_10

    const-string v9, "\u06e1\u06e0"

    invoke-static {v9}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v9

    move-object v15, v4

    move/from16 v29, v9

    goto/16 :goto_0

    :cond_a
    :sswitch_15
    sget v4, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v9, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    rem-int/lit16 v9, v9, -0xafe

    rem-int/2addr v4, v9

    if-ltz v4, :cond_b

    const-string v4, "\u06e8\u06e8\u06df"

    invoke-static {v4}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v29, v4

    goto/16 :goto_0

    :cond_b
    sget v4, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v9, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    or-int/2addr v4, v9

    const v9, 0x1ab6d2

    add-int/2addr v4, v9

    move/from16 v29, v4

    goto/16 :goto_0

    :sswitch_16
    move-object/from16 v0, p0

    iget-object v9, v0, Ljn;->h:Lp00;

    iget-object v4, v9, Lp00;->b:Ljava/lang/Object;

    check-cast v4, Landroid/widget/LinearLayout;

    invoke-virtual {v4}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    const/4 v14, 0x0

    invoke-virtual {v4, v14}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    const-wide/16 v30, 0x167

    sget v14, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    int-to-long v0, v14

    move-wide/from16 v32, v0

    xor-long v30, v30, v32

    move-wide/from16 v0, v30

    invoke-virtual {v4, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    new-instance v14, Lin;

    move-object/from16 v0, p0

    iget-object v0, v0, Ljn;->i:Landroid/view/ViewGroup;

    move-object/from16 v20, v0

    const/16 v26, 0x0

    move-object/from16 v0, v20

    move/from16 v1, v26

    invoke-direct {v14, v0, v9, v1}, Lin;-><init>(Landroid/view/ViewGroup;Lp00;I)V

    invoke-virtual {v4, v14}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/ViewPropertyAnimator;->start()V

    new-instance v4, Lo40;

    iget-object v14, v9, Lp00;->b:Ljava/lang/Object;

    sget-object v20, Lo40;->n:Lsh;

    move-object/from16 v0, v20

    invoke-direct {v4, v14, v0}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    const-string v14, "\u06df\u06e4\u06df"

    invoke-static {v14}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v14

    move-object/from16 v20, v9

    move-object/from16 v26, v4

    move/from16 v29, v14

    goto/16 :goto_0

    :sswitch_17
    sget v4, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sget v9, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    rem-int/lit16 v9, v9, -0xa91

    or-int/2addr v4, v9

    if-ltz v4, :cond_c

    const-string v4, "\u06e1\u06e8\u06df"

    invoke-static {v4}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v29, v4

    goto/16 :goto_0

    :cond_c
    sget v4, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v9, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sub-int/2addr v4, v9

    const v9, 0x1aa4e5

    add-int/2addr v4, v9

    move/from16 v29, v4

    goto/16 :goto_0

    :pswitch_0
    :sswitch_18
    sget v4, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    if-ltz v4, :cond_d

    invoke-static {}, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۦۣ۠()I

    const-string v4, "\u06e8\u06e0\u06e5"

    invoke-static {v4}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v29, v4

    goto/16 :goto_0

    :cond_d
    sget v4, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v9, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    mul-int/2addr v4, v9

    const v9, 0x1b0de5

    xor-int/2addr v4, v9

    move/from16 v29, v4

    goto/16 :goto_0

    :sswitch_19
    invoke-static/range {p1 .. p1}, Lgu;->M(Ljava/lang/Object;)V

    const/4 v4, 0x1

    move-object/from16 v0, p0

    iput v4, v0, Ljn;->f:I

    const-wide/16 v30, -0xb83

    sget v4, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    int-to-long v0, v4

    move-wide/from16 v32, v0

    xor-long v30, v30, v32

    move-wide/from16 v0, v30

    move-object/from16 v2, p0

    invoke-static {v0, v1, v2}, Lg80;->i(JLt50;)Ljava/lang/Object;

    move-result-object v4

    sget v9, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    if-ltz v9, :cond_e

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->۟ۥۣۥۦ()I

    const-string v9, "\u06e0\u06df\u06e2"

    invoke-static {v9}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v24, v4

    move/from16 v29, v9

    goto/16 :goto_0

    :cond_e
    sget v9, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v14, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    div-int/2addr v9, v14

    const v14, 0x1ac5c8

    add-int/2addr v9, v14

    move-object/from16 v24, v4

    move/from16 v29, v9

    goto/16 :goto_0

    :sswitch_1a
    sget v4, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v9, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    or-int/lit16 v9, v9, -0x1a10

    mul-int/2addr v4, v9

    if-ltz v4, :cond_f

    const/16 v4, 0x9

    sput v4, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    const-string v9, "\u06e5\u06e6\u06e0"

    move-object v4, v7

    move-object v12, v13

    move-object v14, v6

    goto/16 :goto_8

    :cond_f
    const-string v4, "\u06e1\u06e0"

    move-object v12, v13

    :goto_c
    invoke-static {v4}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v29, v4

    goto/16 :goto_0

    :sswitch_1b
    sget v4, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v9, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    rem-int/lit16 v9, v9, 0x2544

    mul-int/2addr v4, v9

    if-ltz v4, :cond_11

    const/16 v4, 0x5f

    sput v4, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    move-object v4, v15

    :cond_10
    const-string v9, "\u06e6\u06e4\u06e5"

    :goto_d
    invoke-static {v9}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v9

    move-object v15, v4

    move/from16 v29, v9

    goto/16 :goto_0

    :cond_11
    sget v4, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v9, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    mul-int/2addr v4, v9

    const v9, 0x1eabc

    add-int/2addr v4, v9

    move/from16 v29, v4

    goto/16 :goto_0

    :cond_12
    :sswitch_1c
    sget v4, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v9, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    xor-int/2addr v4, v9

    const v9, 0x1aa86d

    add-int/2addr v4, v9

    move/from16 v29, v4

    goto/16 :goto_0

    :sswitch_1d
    const/4 v4, 0x1

    move/from16 v0, v18

    if-ne v0, v4, :cond_1a

    invoke-static/range {p1 .. p1}, Lgu;->M(Ljava/lang/Object;)V

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۤ۠ۤۢ()I

    move-result v4

    if-ltz v4, :cond_13

    const-string v4, "\u06df\u06e7\u06e0"

    invoke-static {v4}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v29, v4

    goto/16 :goto_0

    :cond_13
    sget v4, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    sget v9, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    or-int/2addr v4, v9

    const v9, -0x1ab69e

    xor-int/2addr v4, v9

    move/from16 v29, v4

    goto/16 :goto_0

    :sswitch_1e
    sget v4, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v9, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    xor-int/lit16 v9, v9, -0x4ea

    mul-int/2addr v4, v9

    if-ltz v4, :cond_14

    const/16 v4, 0x10

    sput v4, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    const-string v4, "\u06e1\u06e8\u06e4"

    invoke-static {v4}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v29, v4

    goto/16 :goto_0

    :cond_14
    const-string v9, "\u06e3\u06e8\u06df"

    move-object v4, v15

    goto :goto_d

    :sswitch_1f
    move-object/from16 v0, v21

    move-object/from16 v1, v23

    iput-object v0, v1, Lo40;->k:Lp40;

    invoke-virtual/range {v23 .. v23}, Lo40;->h()V

    new-instance v4, Lo40;

    move-object/from16 v0, v22

    iget-object v9, v0, Lp00;->b:Ljava/lang/Object;

    sget-object v14, Lo40;->o:Lsh;

    invoke-direct {v4, v9, v14}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    sget v9, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v14, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    div-int/lit16 v14, v14, -0x17b5

    mul-int/2addr v9, v14

    if-eqz v9, :cond_15

    const/16 v9, 0x5a

    sput v9, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    const-string v9, "\u06e2\u06e7\u06e0"

    invoke-static {v9}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v28, v4

    move/from16 v29, v9

    goto/16 :goto_0

    :cond_15
    sget v9, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sget v14, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    or-int/2addr v9, v14

    const v14, -0x1ac549

    xor-int/2addr v9, v14

    move-object/from16 v28, v4

    move/from16 v29, v9

    goto/16 :goto_0

    :cond_16
    :sswitch_20
    const-string v4, "\u06e1\u06e7\u06e7"

    move-object v9, v4

    goto/16 :goto_5

    :sswitch_21
    move-object/from16 v0, p0

    iget-object v4, v0, Ljn;->g:Landroid/app/Activity;

    invoke-virtual {v4}, Landroid/app/Activity;->isFinishing()Z

    move-result v9

    if-nez v9, :cond_1c

    sget v9, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v12, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    rem-int/2addr v9, v12

    const v12, 0x1aaa20

    add-int/2addr v9, v12

    move-object/from16 v16, v4

    move-object/from16 v12, v17

    move/from16 v29, v9

    goto/16 :goto_0

    :sswitch_22
    sget v4, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v9, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    add-int/lit16 v9, v9, -0x1807

    or-int/2addr v4, v9

    if-ltz v4, :cond_17

    invoke-static {}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->۠ۨۦۥ()I

    const-string v4, "\u06e3\u06e5\u06e2"

    invoke-static {v4}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v29, v4

    goto/16 :goto_0

    :cond_17
    sget v4, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v9, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sub-int/2addr v4, v9

    const v9, 0x1aaebc

    add-int/2addr v4, v9

    move/from16 v29, v4

    goto/16 :goto_0

    :cond_18
    const-string v4, "\u06df\u06e7\u06e0"

    move-object v9, v4

    goto/16 :goto_a

    :cond_19
    :sswitch_23
    sget v4, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v9, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    mul-int/2addr v4, v9

    const v9, 0x1ee5cf

    add-int/2addr v4, v9

    move/from16 v29, v4

    goto/16 :goto_0

    :sswitch_24
    const v4, 0x3f59999a    # 0.85f

    const/high16 v9, 0x43480000    # 200.0f

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v4, v9, v14}, Lg40;->f(FFF)Lp40;

    move-result-object v4

    move-object/from16 v0, v25

    iput-object v4, v0, Lo40;->k:Lp40;

    invoke-virtual/range {v25 .. v25}, Lo40;->h()V

    move v4, v10

    goto/16 :goto_9

    :cond_1a
    :sswitch_25
    invoke-static {}, Lcom/google/android/material/carousel/۠۟ۧۤ;->۟ۡۡۨۥ()I

    move-result v4

    if-gtz v4, :cond_1b

    invoke-static {}, Landroidx/core/app/ۡۤۡ۠;->ۨۥۨۧ()I

    const-string v4, "\u06e5\u06e2\u06e2"

    goto/16 :goto_c

    :cond_1b
    sget v4, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v9, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    mul-int/2addr v4, v9

    const v9, 0x1a8e6f

    add-int/2addr v4, v9

    move/from16 v29, v4

    goto/16 :goto_0

    :cond_1c
    move-object/from16 v12, v17

    :goto_e
    const-string v9, "\u06e3\u06e2\u06e6"

    invoke-static {v9}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v16, v4

    move/from16 v29, v9

    goto/16 :goto_0

    :sswitch_26
    new-instance v4, Lp40;

    const/high16 v9, 0x42700000    # 60.0f

    invoke-static {v9}, Lmp;->p(F)F

    move-result v9

    neg-float v9, v9

    invoke-direct {v4, v9}, Lp40;-><init>(F)V

    const/high16 v9, 0x43480000    # 200.0f

    invoke-virtual {v4, v9}, Lp40;->b(F)V

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-virtual {v4, v9}, Lp40;->a(F)V

    sget v9, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v11, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    div-int/lit16 v11, v11, -0x1345

    xor-int/2addr v9, v11

    if-gtz v9, :cond_1d

    const/16 v9, 0x30

    sput v9, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    const-string v9, "\u06e0\u06e7\u06e4"

    invoke-static {v9}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v9

    move-object v11, v4

    move/from16 v29, v9

    goto/16 :goto_0

    :cond_1d
    const-string v9, "\u06e0\u06e2\u06e5"

    goto/16 :goto_b

    :sswitch_27
    sget-object v4, Lqe;->a:Lqe;

    move-object/from16 v0, v19

    if-ne v0, v4, :cond_a

    sget v9, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v13, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sub-int/2addr v9, v13

    const v13, 0x1aaeae

    add-int/2addr v9, v13

    move-object v13, v4

    move/from16 v29, v9

    goto/16 :goto_0

    :sswitch_28
    move/from16 v4, v18

    :cond_1e
    sget v9, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    if-ltz v9, :cond_1f

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۢ۠۟ۨ()I

    const-string v9, "\u06e7\u06e5\u06e3"

    :goto_f
    invoke-static {v9}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v9

    move/from16 v18, v4

    move/from16 v29, v9

    goto/16 :goto_0

    :cond_1f
    const-string v9, "\u06e6\u06e5\u06e5"

    goto :goto_f

    :sswitch_29
    new-instance v4, Ljava/lang/IllegalStateException;

    const-string v5, "IIcTvjpGXklklBqhb19UTmOEGrR1QFRJZI8RpHVZVE5jkRamchJSBjGJCqZzXFQ=\n"

    const-string v6, "Q+Z/0hoyMWk=\n"

    invoke-static {v5, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v4

    :sswitch_2a
    invoke-static {}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->ۢۢۧۨ()I

    move-result v4

    if-gtz v4, :cond_20

    invoke-static {}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۟۟۟ۢ()I

    const-string v4, "\u06df\u06e8\u06e0"

    move-object v9, v4

    goto/16 :goto_a

    :cond_20
    sget v4, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v9, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    add-int/2addr v4, v9

    const v9, 0x1aa8f5

    add-int/2addr v4, v9

    move/from16 v29, v4

    goto/16 :goto_0

    :sswitch_2b
    move-object v4, v5

    move-object v6, v5

    goto/16 :goto_6

    :cond_21
    :sswitch_2c
    sget v4, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v9, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    div-int/lit16 v9, v9, -0x141d

    xor-int/2addr v4, v9

    if-ltz v4, :cond_22

    invoke-static {}, Landroidx/legacy/content/ۨ۠ۦۥ;->۟ۢۦ۠ۦ()I

    const-string v4, "\u06e8\u06e6"

    goto/16 :goto_1

    :cond_22
    sget v4, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v9, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    rem-int/2addr v4, v9

    const v9, 0x1aa980

    xor-int/2addr v4, v9

    move/from16 v29, v4

    goto/16 :goto_0

    :sswitch_2d
    sget v4, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v6, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    mul-int/lit16 v6, v6, -0x200b

    add-int/2addr v4, v6

    if-ltz v4, :cond_24

    invoke-static {}, Lkotlinx/coroutines/ۤۢۢۥ;->ۡ۠ۥۡ()I

    move-object/from16 v4, v19

    move-object v6, v8

    :cond_23
    const-string v9, "\u06e6\u06e3\u06e2"

    invoke-static {v9}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v19, v4

    move/from16 v29, v9

    goto/16 :goto_0

    :cond_24
    const-string v4, "\u06e0\u06e2"

    move-object v9, v4

    move-object v14, v5

    move-object v6, v8

    goto/16 :goto_7

    :sswitch_2e
    invoke-static {}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦۥۣۥ()I

    move-result v4

    if-ltz v4, :cond_25

    const/16 v4, 0x63

    sput v4, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    const-string v4, "\u06e7\u06e4\u06e1"

    invoke-static {v4}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v12, v17

    move/from16 v29, v4

    goto/16 :goto_0

    :cond_25
    sget v4, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v9, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    rem-int/2addr v4, v9

    const v9, 0x1ab5bf

    add-int/2addr v4, v9

    move-object/from16 v12, v17

    move/from16 v29, v4

    goto/16 :goto_0

    :sswitch_2f
    move v4, v10

    :cond_26
    sget v9, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v10, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    div-int/lit16 v10, v10, -0x9d8

    xor-int/2addr v9, v10

    if-ltz v9, :cond_27

    const/4 v9, 0x3

    sput v9, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    const-string v9, "\u06e0\u06e6\u06e4"

    invoke-static {v9}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v9

    move v10, v4

    move/from16 v29, v9

    goto/16 :goto_0

    :cond_27
    sget v9, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v10, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    mul-int/2addr v9, v10

    const v10, 0x1e8ed9

    add-int/2addr v9, v10

    move v10, v4

    move/from16 v29, v9

    goto/16 :goto_0

    :sswitch_30
    invoke-virtual {v7}, Landroid/app/Activity;->isDestroyed()Z

    move-result v4

    if-eqz v4, :cond_21

    const-string v4, "\u06e5\u06e5\u06e6"

    move-object v9, v4

    move-object v6, v8

    goto/16 :goto_5

    :sswitch_31
    move-object/from16 v4, v16

    goto/16 :goto_e

    :cond_28
    move-object v6, v8

    goto/16 :goto_3

    :sswitch_data_0
    .sparse-switch
        0xdc02 -> :sswitch_0
        0xdc08 -> :sswitch_31
        0xdc1f -> :sswitch_1b
        0xdc9c -> :sswitch_2c
        0xdc9d -> :sswitch_24
        0xdcb9 -> :sswitch_22
        0x1aa760 -> :sswitch_18
        0x1aa761 -> :sswitch_2d
        0x1aa79a -> :sswitch_26
        0x1aa7a1 -> :sswitch_e
        0x1aa7a3 -> :sswitch_31
        0x1aa7df -> :sswitch_28
        0x1aa7f7 -> :sswitch_7
        0x1aa7f8 -> :sswitch_10
        0x1aaac3 -> :sswitch_12
        0x1aab23 -> :sswitch_6
        0x1aab3e -> :sswitch_2
        0x1aab9a -> :sswitch_23
        0x1aabbd -> :sswitch_a
        0x1aaf43 -> :sswitch_2a
        0x1aaf5c -> :sswitch_31
        0x1aaf7b -> :sswitch_8
        0x1aaf81 -> :sswitch_16
        0x1aaf98 -> :sswitch_1a
        0x1aaf9d -> :sswitch_30
        0x1ab287 -> :sswitch_3
        0x1ab2c5 -> :sswitch_15
        0x1ab304 -> :sswitch_17
        0x1ab33b -> :sswitch_29
        0x1ab33c -> :sswitch_1d
        0x1ab645 -> :sswitch_5
        0x1ab661 -> :sswitch_20
        0x1ab667 -> :sswitch_1
        0x1ab6bd -> :sswitch_c
        0x1ab6c0 -> :sswitch_21
        0x1ab71a -> :sswitch_7
        0x1aba09 -> :sswitch_1f
        0x1aba60 -> :sswitch_15
        0x1aba64 -> :sswitch_19
        0x1abe46 -> :sswitch_1e
        0x1abe5f -> :sswitch_14
        0x1ac14c -> :sswitch_7
        0x1ac1ac -> :sswitch_9
        0x1ac1c5 -> :sswitch_27
        0x1ac1e7 -> :sswitch_11
        0x1ac206 -> :sswitch_4
        0x1ac222 -> :sswitch_25
        0x1ac52d -> :sswitch_2e
        0x1ac568 -> :sswitch_13
        0x1ac588 -> :sswitch_23
        0x1ac5a4 -> :sswitch_d
        0x1ac5c8 -> :sswitch_b
        0x1ac5e3 -> :sswitch_2f
        0x1ac90c -> :sswitch_1c
        0x1ac967 -> :sswitch_f
        0x1ac987 -> :sswitch_2b
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
