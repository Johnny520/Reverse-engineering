.class public final synthetic Lh80;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final a:Lf00;

.field public final b:Landroid/widget/LinearLayout;

.field public final c:Lf00;


# direct methods
.method public synthetic constructor <init>(Lf00;Landroid/widget/LinearLayout;Lf00;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06df\u06e7\u06e8"

    invoke-static {v1}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v2

    move v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iput-object p1, p0, Lh80;->a:Lf00;

    const-string v0, "\u06e1\u06e5\u06e8"

    :goto_1
    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    :sswitch_1
    sget v0, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    add-int/2addr v0, v2

    const v2, 0x1abca6

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_2
    iput-object p2, p0, Lh80;->b:Landroid/widget/LinearLayout;

    const-string v0, "\u06e2\u06e7\u06e6"

    invoke-static {v0}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_3
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(I)V

    sget v0, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v2, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    rem-int/lit16 v2, v2, 0x197b

    mul-int/2addr v0, v2

    if-gtz v0, :cond_1

    const/16 v0, 0x29

    sput v0, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    const-string v0, "\u06df\u06e7\u06e8"

    goto :goto_1

    :cond_1
    sget v0, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v2, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    or-int/2addr v0, v2

    const v2, 0x1abe09

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_4
    sget v0, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v2, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    mul-int/lit16 v2, v2, -0x227a

    mul-int/2addr v0, v2

    if-ltz v0, :cond_2

    const/16 v0, 0xe

    sput v0, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    const-string v0, "\u06e0\u06e1\u06e5"

    :goto_2
    invoke-static {v0}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06df\u06e7\u06e8"

    goto :goto_2

    :sswitch_5
    const-string v0, "pgwjCe"

    invoke-static {v0}, Landroidx/emoji2/text/ۣۣ۟۟۠;->ۧۦۦۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget v1, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v2, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    or-int/2addr v1, v2

    const v2, 0x1ac218

    add-int/2addr v2, v1

    move v1, v0

    goto :goto_0

    :sswitch_6
    iput-object p3, p0, Lh80;->c:Lf00;

    invoke-static {}, L۟ۡۦۧۤ;->۟۟۠ۡۢ()I

    move-result v0

    if-ltz v0, :cond_3

    const/16 v0, 0xd

    sput v0, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    const-string v0, "\u06e8\u06e4\u06e0"

    invoke-static {v0}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_3
    const-string v0, "\u06e4\u06e1\u06e4"

    goto :goto_1

    :sswitch_7
    invoke-static {}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۦۡۦۢ()I

    move-result v0

    if-ltz v0, :cond_0

    sget v0, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v2, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    xor-int/2addr v0, v2

    const v2, 0x1ab41a

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_8
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa800 -> :sswitch_0
        0x1aaf44 -> :sswitch_2
        0x1aaf9b -> :sswitch_1
        0x1ab282 -> :sswitch_5
        0x1ab341 -> :sswitch_6
        0x1aba07 -> :sswitch_7
        0x1abde6 -> :sswitch_8
        0x1ac186 -> :sswitch_3
        0x1ac964 -> :sswitch_4
    .end sparse-switch
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 10

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v2, 0x0

    const/4 v0, 0x0

    const-string v4, "\u06e8\u06e1\u06e1"

    invoke-static {v4}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v5

    move v4, v1

    :goto_0
    sparse-switch v5, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget-object v0, p0, Lh80;->c:Lf00;

    const-string v1, "\u06e3\u06e6\u06e3"

    :goto_1
    invoke-static {v1}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v1

    move v5, v1

    goto :goto_0

    :sswitch_1
    invoke-virtual {v2}, Landroid/view/View;->getX()F

    move-result v1

    const/high16 v5, 0x41500000    # 13.0f

    add-float/2addr v1, v5

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v5

    sub-float/2addr v1, v5

    const/high16 v5, 0x41500000    # 13.0f

    sub-float/2addr v1, v5

    iput v1, v3, Lf00;->a:F

    sget v1, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v5, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    or-int/2addr v1, v5

    const v5, 0x1ab663

    add-int/2addr v1, v5

    move v5, v1

    goto :goto_0

    :sswitch_2
    sget v1, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v5, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    rem-int/lit16 v5, v5, 0x200e

    sub-int/2addr v1, v5

    if-ltz v1, :cond_0

    const/16 v1, 0x1f

    sput v1, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    const-string v1, "\u06e0\u06e8\u06e2"

    goto :goto_1

    :cond_0
    const-string v1, "\u06e8\u06e0\u06e4"

    :goto_2
    invoke-static {v1}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v1

    move v5, v1

    goto :goto_0

    :sswitch_3
    invoke-static {}, Landroidx/profileinstaller/ۣ۠ۨۢ;->۟ۤۥ۟۟()I

    move-result v1

    if-gtz v1, :cond_1

    invoke-static {}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۣ۟ۦۢ()I

    :goto_3
    const-string v1, "\u06e8\u06e0\u06e4"

    invoke-static {v1}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v1

    move v5, v1

    goto :goto_0

    :cond_1
    sget v1, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v5, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    add-int/2addr v1, v5

    const v5, 0x1ac447

    add-int/2addr v1, v5

    move v5, v1

    goto :goto_0

    :sswitch_4
    invoke-virtual {v2}, Landroid/view/View;->getY()F

    move-result v1

    const/high16 v5, 0x41300000    # 11.0f

    sub-float/2addr v1, v5

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v5

    sub-float/2addr v1, v5

    const/high16 v5, 0x41300000    # 11.0f

    add-float/2addr v1, v5

    iput v1, v0, Lf00;->a:F

    goto :goto_3

    :sswitch_5
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v1

    sget v4, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v5, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    mul-int/lit16 v5, v5, 0x616

    add-int/2addr v4, v5

    if-gtz v4, :cond_2

    const-string v4, "\u06e6\u06e4\u06e3"

    invoke-static {v4}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v5

    move v4, v1

    goto/16 :goto_0

    :cond_2
    sget v4, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v5, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    div-int/2addr v4, v5

    const v5, 0x1aaea6

    add-int/2addr v5, v4

    move v4, v1

    goto/16 :goto_0

    :cond_3
    :sswitch_6
    invoke-static {}, L۠ۡۢۨ;->ۥۡ۠ۨ()I

    move-result v1

    if-gtz v1, :cond_4

    const/16 v1, 0x38

    sput v1, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    const-string v1, "\u06df\u06e8\u06e4"

    goto :goto_2

    :cond_4
    const-string v1, "\u06e4\u06e6\u06e8"

    :goto_4
    invoke-static {v1}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v1

    move v5, v1

    goto/16 :goto_0

    :sswitch_7
    const/4 v1, 0x2

    if-eq v4, v1, :cond_3

    sget v1, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    if-gtz v1, :cond_5

    const-string v1, "\u06e6\u06e2\u06e5"

    invoke-static {v1}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v1

    move v5, v1

    goto/16 :goto_0

    :cond_5
    sget v1, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v5, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sub-int/2addr v1, v5

    const v5, -0x1ab94f

    xor-int/2addr v1, v5

    move v5, v1

    goto/16 :goto_0

    :sswitch_8
    iget-object v3, p0, Lh80;->a:Lf00;

    invoke-static {}, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۢ۠ۨ۟()I

    move-result v1

    if-ltz v1, :cond_6

    const-string v1, "\u06e3\u06e6\u06e5"

    invoke-static {v1}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v1

    move v5, v1

    goto/16 :goto_0

    :cond_6
    move-object v1, v2

    :goto_5
    const-string v2, "\u06df\u06df\u06e8"

    invoke-static {v2}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v5

    move-object v2, v1

    goto/16 :goto_0

    :sswitch_9
    iget-object v1, p0, Lh80;->b:Landroid/widget/LinearLayout;

    sget v2, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v5, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    rem-int/lit16 v5, v5, -0x886

    div-int/2addr v2, v5

    if-eqz v2, :cond_7

    const/4 v2, 0x5

    sput v2, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    goto :goto_5

    :cond_7
    const-string v2, "\u06df\u06e3"

    invoke-static {v2}, L۠ۡۢۨ;->۟ۡۧۡۥ(Ljava/lang/Object;)I

    move-result v5

    move-object v2, v1

    goto/16 :goto_0

    :sswitch_a
    const/4 v0, 0x1

    return v0

    :sswitch_b
    invoke-virtual {v2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v5

    const/high16 v6, 0x41e00000    # 28.0f

    add-float/2addr v5, v6

    iget v6, v3, Lf00;->a:F

    add-float/2addr v5, v6

    const/high16 v6, 0x41e00000    # 28.0f

    sub-float/2addr v5, v6

    invoke-virtual {v1, v5}, Landroid/view/ViewPropertyAnimator;->x(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v7

    sub-float/2addr v6, v7

    iget v7, v0, Lf00;->a:F

    sub-float/2addr v6, v7

    sub-float/2addr v5, v6

    invoke-virtual {v1, v5}, Landroid/view/ViewPropertyAnimator;->y(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const-wide/16 v6, 0xe

    sget v5, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    int-to-long v8, v5

    xor-long/2addr v6, v8

    invoke-virtual {v1, v6, v7}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewPropertyAnimator;->start()V

    sget v1, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v5, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    add-int/lit16 v5, v5, 0xa09

    div-int/2addr v1, v5

    if-eqz v1, :cond_9

    const/16 v1, 0x46

    sput v1, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    :cond_8
    const-string v1, "\u06e3\u06e0\u06e8"

    invoke-static {v1}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v1

    move v5, v1

    goto/16 :goto_0

    :cond_9
    sget v1, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v5, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    rem-int/2addr v1, v5

    const v5, 0x1aba25

    xor-int/2addr v1, v5

    move v5, v1

    goto/16 :goto_0

    :sswitch_c
    if-eqz v4, :cond_a

    sget v1, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v5, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    xor-int/lit16 v5, v5, 0xd3

    xor-int/2addr v1, v5

    if-gtz v1, :cond_8

    const-string v1, "\u06df\u06e3"

    invoke-static {v1}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v1

    move v5, v1

    goto/16 :goto_0

    :cond_a
    :sswitch_d
    sget v1, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    if-ltz v1, :cond_b

    const-string v1, "\u06e1\u06e0\u06df"

    :goto_6
    invoke-static {v1}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v1

    move v5, v1

    goto/16 :goto_0

    :cond_b
    const-string v1, "\u06e3\u06e7\u06e6"

    goto :goto_6

    :sswitch_e
    sget v1, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v5, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    rem-int/lit16 v5, v5, -0xcfc

    sub-int/2addr v1, v5

    if-ltz v1, :cond_c

    invoke-static {}, Landroidx/lifecycle/۟۟ۡۨ;->ۦۣ۟ۦ()I

    const-string v1, "\u06e5\u06e0\u06e4"

    goto/16 :goto_4

    :cond_c
    sget v1, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v5, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    or-int/2addr v1, v5

    const v5, 0x1ac999

    add-int/2addr v1, v5

    move v5, v1

    goto/16 :goto_0

    :sswitch_f
    sget v1, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    if-ltz v1, :cond_d

    invoke-static {}, Lcom/google/android/material/carousel/۠ۨۡۢ;->ۦۧۢ۟()I

    const-string v1, "\u06e8\u06e1\u06e1"

    invoke-static {v1}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v1

    move v5, v1

    goto/16 :goto_0

    :cond_d
    sget v1, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v5, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sub-int/2addr v1, v5

    const v5, 0x1ac221

    add-int/2addr v1, v5

    move v5, v1

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe4 -> :sswitch_0
        0x1aa708 -> :sswitch_9
        0x1aaea6 -> :sswitch_8
        0x1ab33e -> :sswitch_6
        0x1ab62b -> :sswitch_7
        0x1ab6e0 -> :sswitch_c
        0x1ab6e2 -> :sswitch_4
        0x1ab702 -> :sswitch_1
        0x1aba45 -> :sswitch_f
        0x1abaa6 -> :sswitch_b
        0x1abde5 -> :sswitch_3
        0x1abe7d -> :sswitch_2
        0x1abe7e -> :sswitch_2
        0x1ac1a9 -> :sswitch_d
        0x1ac1e5 -> :sswitch_2
        0x1ac588 -> :sswitch_e
        0x1ac8ec -> :sswitch_a
        0x1ac908 -> :sswitch_5
    .end sparse-switch
.end method
