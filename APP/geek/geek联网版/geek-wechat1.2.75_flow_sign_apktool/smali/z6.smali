.class public final synthetic Lz6;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 3

    iput p4, p0, Lz6;->a:I

    iput-object p1, p0, Lz6;->b:Ljava/lang/Object;

    iput-object p2, p0, Lz6;->c:Ljava/lang/Object;

    iput-object p3, p0, Lz6;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e5\u06e8\u06df"

    invoke-static {v1}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    const-string v0, "6jDjBFuHkdrz70G0qZYd4lijwN1"

    invoke-static {v0}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣۢ۠ۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "\u06e8\u06e0\u06e5"

    :goto_1
    invoke-static {v1}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_2
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v1, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    or-int/2addr v1, v2

    const v2, 0xdfe6

    xor-int/2addr v1, v2

    goto :goto_0

    :sswitch_3
    sget v1, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sget v2, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    add-int/lit16 v2, v2, 0x88f

    div-int/2addr v1, v2

    if-eqz v1, :cond_0

    const/16 v1, 0x1e

    sput v1, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    const-string v1, "\u06e6\u06e4\u06e4"

    goto :goto_1

    :cond_0
    const-string v1, "\u06e5\u06e8\u06df"

    goto :goto_1

    :sswitch_4
    invoke-static {}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟۠ۢۢ۠()I

    move-result v1

    if-ltz v1, :cond_1

    const-string v1, "\u06e1\u06e4\u06e7"

    :goto_2
    invoke-static {v1}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    :sswitch_5
    sget v1, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    if-gtz v1, :cond_2

    const-string v1, "\u06e8\u06e0\u06e2"

    goto :goto_2

    :cond_2
    sget v1, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v2, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sub-int/2addr v1, v2

    const v2, 0xdd09

    xor-int/2addr v1, v2

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdc7b -> :sswitch_0
        0x1aaf24 -> :sswitch_1
        0x1aaf9d -> :sswitch_3
        0x1ab71a -> :sswitch_5
        0x1abe9c -> :sswitch_4
        0x1ac8ed -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 14

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v8, 0x0

    const/4 v7, 0x0

    const/4 v0, 0x0

    const/4 v9, 0x0

    const-string v4, "\u06e1\u06e0\u06e1"

    invoke-static {v4}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v10

    move-object v4, v0

    move-object v5, v1

    :goto_0
    sparse-switch v10, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget-object v0, p0, Lz6;->b:Ljava/lang/Object;

    check-cast v0, Lo40;

    iget-object v1, p0, Lz6;->c:Ljava/lang/Object;

    check-cast v1, Lo40;

    const-string v7, "\u06df\u06e1\u06e6"

    invoke-static {v7}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v10

    move-object v7, v1

    move-object v8, v0

    goto :goto_0

    :sswitch_1
    const v0, 0x3f6b851f    # 0.92f

    invoke-virtual {v8, v0}, Lo40;->b(F)V

    sget v0, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v1, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    add-int/lit16 v1, v1, -0x1063

    sub-int/2addr v0, v1

    if-gtz v0, :cond_f

    invoke-static {}, Landroid/app/۟ۡۧۦۡ;->ۥۣۨۧ()I

    const-string v0, "\u06df\u06e7\u06df"

    invoke-static {v0}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto :goto_0

    :sswitch_2
    iget-object v0, p0, Lz6;->d:Ljava/lang/Object;

    check-cast v0, Lum;

    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    sget v4, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v9, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    or-int/lit16 v9, v9, 0x2404

    xor-int/2addr v4, v9

    if-gtz v4, :cond_0

    const/16 v4, 0x1b

    sput v4, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    const-string v4, "\u06e0\u06e5"

    invoke-static {v4}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v10

    move-object v4, v0

    move v9, v1

    goto :goto_0

    :cond_0
    sget v4, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v9, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    mul-int/2addr v4, v9

    const v9, 0x1a598e

    add-int v10, v4, v9

    move-object v4, v0

    move v9, v1

    goto :goto_0

    :sswitch_3
    if-eqz v3, :cond_7

    const/4 v0, 0x2

    if-eq v3, v0, :cond_b

    invoke-static {}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۤۥۣ۟()I

    move-result v0

    if-ltz v0, :cond_16

    :cond_1
    const-string v0, "\u06e6\u06e2"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto :goto_0

    :sswitch_4
    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۧۡۥۦ()I

    move-result v0

    if-ltz v0, :cond_2

    const/16 v0, 0x54

    sput v0, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    const-string v0, "\u06e1\u06df\u06e6"

    invoke-static {v0}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto :goto_0

    :cond_2
    sget v0, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v1, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    xor-int/2addr v0, v1

    const v1, 0x1ab6c5

    add-int/2addr v0, v1

    move v10, v0

    goto/16 :goto_0

    :sswitch_5
    iget v0, p0, Lz6;->a:I

    packed-switch v0, :pswitch_data_0

    :sswitch_6
    sget v0, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    sget v1, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    or-int/lit16 v1, v1, -0x1bea

    xor-int/2addr v0, v1

    if-ltz v0, :cond_5

    const/16 v0, 0x49

    sput v0, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    const-string v0, "\u06e1\u06e1\u06e6"

    :goto_1
    invoke-static {v0}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :sswitch_7
    sget v0, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v1, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    rem-int/lit16 v1, v1, 0x2053

    xor-int/2addr v0, v1

    if-eqz v0, :cond_3

    invoke-static {}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۢۧۥ()I

    const-string v0, "\u06df\u06e7\u06e8"

    :goto_2
    invoke-static {v0}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :cond_3
    const-string v0, "\u06e1\u06e0\u06e1"

    goto :goto_2

    :sswitch_8
    iget-object v0, p0, Lz6;->b:Ljava/lang/Object;

    check-cast v0, Lm00;

    iget-object v1, p0, Lz6;->c:Ljava/lang/Object;

    check-cast v1, Landroid/widget/LinearLayout;

    sget v5, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v6, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    div-int/lit16 v6, v6, 0x23f3

    xor-int/2addr v5, v6

    if-ltz v5, :cond_4

    const/16 v5, 0x55

    sput v5, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    const-string v5, "\u06e5\u06e1\u06e0"

    invoke-static {v5}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v10

    move-object v5, v1

    move-object v6, v0

    goto/16 :goto_0

    :cond_4
    sget v5, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v6, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    rem-int/2addr v5, v6

    const v6, 0x1ac618

    xor-int v10, v5, v6

    move-object v5, v1

    move-object v6, v0

    goto/16 :goto_0

    :sswitch_9
    if-eqz v9, :cond_14

    const/4 v0, 0x1

    if-eq v9, v0, :cond_13

    sget v0, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v1, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    add-int/2addr v0, v1

    const v1, 0x1ab3d2

    add-int/2addr v0, v1

    move v10, v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06e7\u06e8\u06e6"

    goto :goto_1

    :sswitch_a
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v8, v0}, Lo40;->b(F)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v7, v0}, Lo40;->b(F)V

    sget v0, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v1, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    xor-int/lit16 v1, v1, 0x1556

    sub-int/2addr v0, v1

    if-gtz v0, :cond_6

    const-string v0, "\u06e0\u06e3\u06e0"

    invoke-static {v0}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :cond_6
    sget v0, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v1, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    or-int/2addr v0, v1

    const v1, 0xde0b

    add-int/2addr v0, v1

    move v10, v0

    goto/16 :goto_0

    :cond_7
    :sswitch_b
    sget v0, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    if-ltz v0, :cond_8

    const/16 v0, 0x43

    sput v0, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    const-string v0, "\u06e3\u06e5\u06e7"

    :goto_3
    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :cond_8
    const-string v0, "\u06e8\u06e2\u06e2"

    goto/16 :goto_1

    :sswitch_c
    sget v0, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    if-gtz v0, :cond_a

    const/16 v0, 0x5f

    sput v0, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    :cond_9
    const-string v0, "\u06e0\u06df\u06e3"

    invoke-static {v0}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :cond_a
    const-string v0, "\u06df\u06e7\u06df"

    goto :goto_3

    :cond_b
    :sswitch_d
    sget v0, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    if-ltz v0, :cond_c

    invoke-static {}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۧۡۥ۟()I

    const-string v0, "\u06e0\u06e6\u06e2"

    :goto_4
    invoke-static {v0}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :cond_c
    sget v0, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v1, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    mul-int/2addr v0, v1

    const v1, -0x1aa861

    xor-int/2addr v0, v1

    move v10, v0

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Landroidx/core/content/ۣۧۡۤ;->۟ۦۦ۠ۡ()I

    move-result v0

    if-ltz v0, :cond_d

    const/16 v0, 0x62

    sput v0, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    const-string v0, "\u06e2\u06e7\u06e0"

    invoke-static {v0}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :cond_d
    sget v0, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v1, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    div-int/2addr v0, v1

    const v1, 0x1ac248

    add-int/2addr v0, v1

    move v10, v0

    goto/16 :goto_0

    :pswitch_0
    :sswitch_f
    sget v0, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sget v1, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    or-int/lit16 v1, v1, -0x13b7

    rem-int/2addr v0, v1

    if-ltz v0, :cond_e

    const-string v0, "\u06e6\u06e7\u06e5"

    :goto_5
    invoke-static {v0}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :cond_e
    sget v0, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v1, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    div-int/2addr v0, v1

    const v1, -0xdc0f

    xor-int/2addr v0, v1

    move v10, v0

    goto/16 :goto_0

    :sswitch_10
    invoke-static {}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟ۧ۟ۥۧ()I

    move-result v0

    if-gtz v0, :cond_10

    invoke-static {}, Lio/fastkv/ۣ۟ۧۦۡ;->ۥۥۤۥ()I

    :cond_f
    const-string v1, "\u06e1\u06e8\u06e3"

    move-object v0, v2

    :goto_6
    invoke-static {v1}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v1

    move-object v2, v0

    move v10, v1

    goto/16 :goto_0

    :cond_10
    const-string v0, "\u06e1\u06e1\u06e2"

    invoke-static {v0}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :sswitch_11
    invoke-interface {v4, p1}, Lum;->f(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "\u06e6\u06e2\u06e2"

    goto :goto_4

    :sswitch_12
    invoke-virtual {v5}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v1

    const/high16 v10, 0x40c00000    # 6.0f

    sub-float/2addr v1, v10

    iget v10, v6, Lm00;->a:F

    add-float/2addr v1, v10

    const/high16 v10, 0x40c00000    # 6.0f

    add-float/2addr v1, v10

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->x(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v1

    const/high16 v10, 0x40800000    # 4.0f

    add-float/2addr v1, v10

    iget v10, v2, Lm00;->a:F

    add-float/2addr v1, v10

    const/high16 v10, 0x40800000    # 4.0f

    sub-float/2addr v1, v10

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->y(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v10, -0x1c5

    sget v1, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    int-to-long v12, v1

    xor-long/2addr v10, v12

    invoke-virtual {v0, v10, v11}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    const-string v0, "\u06e3\u06e5\u06df"

    :goto_7
    invoke-static {v0}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :cond_11
    :sswitch_13
    sget v0, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v1, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    add-int/lit16 v1, v1, 0x3c3

    sub-int/2addr v0, v1

    if-gtz v0, :cond_12

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۧۡۥۦ()I

    const-string v0, "\u06e7\u06df\u06e4"

    goto :goto_7

    :cond_12
    sget v0, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v1, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    mul-int/2addr v0, v1

    const v1, 0x1c20dc

    add-int/2addr v0, v1

    move v10, v0

    goto/16 :goto_0

    :sswitch_14
    const/4 v0, 0x1

    :goto_8
    return v0

    :cond_13
    :sswitch_15
    sget v0, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v1, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    add-int/2addr v0, v1

    const v1, 0x1ac408

    xor-int/2addr v0, v1

    move v10, v0

    goto/16 :goto_0

    :sswitch_16
    const/4 v0, 0x1

    goto :goto_8

    :sswitch_17
    const/4 v0, 0x3

    if-eq v9, v0, :cond_13

    sget v0, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    sget v1, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    xor-int/2addr v0, v1

    const v1, 0x1ab8b0

    add-int/2addr v0, v1

    move v10, v0

    goto/16 :goto_0

    :sswitch_18
    const v0, 0x3f6b851f    # 0.92f

    invoke-virtual {v7, v0}, Lo40;->b(F)V

    sget v0, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v1, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    div-int/2addr v0, v1

    const v1, 0x1aa81c

    add-int/2addr v0, v1

    move v10, v0

    goto/16 :goto_0

    :cond_14
    :sswitch_19
    sget v0, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v1, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    div-int/2addr v0, v1

    const v1, -0x1ac52a

    xor-int/2addr v0, v1

    move v10, v0

    goto/16 :goto_0

    :sswitch_1a
    iget-object v0, p0, Lz6;->d:Ljava/lang/Object;

    check-cast v0, Lm00;

    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    const-string v1, "\u06e1\u06df\u06e6"

    move v3, v2

    goto/16 :goto_6

    :sswitch_1b
    sget v0, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v1, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    rem-int/lit16 v1, v1, -0x26c5

    add-int/2addr v0, v1

    if-gtz v0, :cond_15

    const/16 v0, 0x2d

    sput v0, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    const-string v0, "\u06e1\u06e4\u06e8"

    invoke-static {v0}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :cond_15
    const-string v0, "\u06e6\u06e2"

    goto/16 :goto_2

    :sswitch_1c
    invoke-virtual {v5}, Landroid/view/View;->getX()F

    move-result v0

    const/4 v1, 0x0

    sub-float/2addr v0, v1

    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v1

    sub-float/2addr v0, v1

    const/4 v1, 0x0

    add-float/2addr v0, v1

    iput v0, v6, Lm00;->a:F

    sget v0, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v1, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    xor-int/lit16 v1, v1, -0x326

    add-int/2addr v0, v1

    if-ltz v0, :cond_9

    const/16 v0, 0x56

    sput v0, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    const-string v0, "\u06e0\u06e8\u06e8"

    invoke-static {v0}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :sswitch_1d
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_11

    invoke-static {p1}, Lmp;->d(Ljava/lang/Object;)V

    invoke-static {}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۟ۦۣۣۧ()I

    move-result v0

    if-gtz v0, :cond_17

    :cond_16
    const-string v0, "\u06e3\u06e2\u06e4"

    invoke-static {v0}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :cond_17
    const-string v0, "\u06e0\u06e3\u06e2"

    goto/16 :goto_5

    :sswitch_1e
    invoke-virtual {v5}, Landroid/view/View;->getY()F

    move-result v0

    const/high16 v1, 0x41600000    # 14.0f

    add-float/2addr v0, v1

    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x41600000    # 14.0f

    sub-float/2addr v0, v1

    iput v0, v2, Lm00;->a:F

    invoke-static {}, Lio/fastkv/ۣ۟ۧۦۡ;->ۥۥۤۥ()I

    move-result v0

    if-ltz v0, :cond_1

    invoke-static {}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۟۟۟ۢ()I

    const-string v0, "\u06e0\u06e3\u06e2"

    invoke-static {v0}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdc05 -> :sswitch_0
        0xdcbc -> :sswitch_14
        0xdcdf -> :sswitch_6
        0xdcf7 -> :sswitch_1d
        0x1aa744 -> :sswitch_2
        0x1aa7f7 -> :sswitch_1b
        0x1aa818 -> :sswitch_7
        0x1aa81c -> :sswitch_16
        0x1aaac4 -> :sswitch_1e
        0x1aab3d -> :sswitch_1b
        0x1aab3f -> :sswitch_11
        0x1aabde -> :sswitch_15
        0x1aabe0 -> :sswitch_d
        0x1aae88 -> :sswitch_3
        0x1aaea2 -> :sswitch_5
        0x1aaec2 -> :sswitch_13
        0x1aaede -> :sswitch_13
        0x1aaf9c -> :sswitch_18
        0x1ab2fc -> :sswitch_b
        0x1ab33b -> :sswitch_17
        0x1ab60a -> :sswitch_13
        0x1ab665 -> :sswitch_e
        0x1ab6bd -> :sswitch_c
        0x1ab9ea -> :sswitch_4
        0x1abdc4 -> :sswitch_f
        0x1ac1a6 -> :sswitch_10
        0x1ac247 -> :sswitch_1b
        0x1ac52b -> :sswitch_1
        0x1ac54a -> :sswitch_9
        0x1ac568 -> :sswitch_a
        0x1ac5ca -> :sswitch_19
        0x1ac604 -> :sswitch_1a
        0x1ac625 -> :sswitch_8
        0x1ac928 -> :sswitch_1c
        0x1ac946 -> :sswitch_12
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
