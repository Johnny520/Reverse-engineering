.class public final Lr20;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public a:F

.field public b:F

.field public final c:Landroid/widget/LinearLayout;

.field public final d:I

.field public final e:Landroid/app/Dialog;


# direct methods
.method public constructor <init>(ILandroid/app/Dialog;Landroid/widget/LinearLayout;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e2\u06e2\u06e0"

    invoke-static {v1}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    const-string v0, "kejCaoVFLdi47"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۧۥ۟ۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget v1, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    xor-int/lit16 v2, v2, -0xf1c

    mul-int/2addr v1, v2

    if-ltz v1, :cond_0

    const-string v1, "\u06e0\u06e3\u06e4"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :cond_0
    sget v1, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v2, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    xor-int/2addr v1, v2

    const v2, 0x1aaa90

    add-int/2addr v2, v1

    move-object v1, v0

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۥۣۢۡ()I

    move-result v0

    if-gtz v0, :cond_4

    const-string v0, "\u06e1\u06e7\u06e5"

    invoke-static {v0}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_3
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget v0, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v2, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    or-int/2addr v0, v2

    const v2, 0xded6

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_4
    sget v0, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v2, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    add-int/2addr v0, v2

    const v2, 0x1ab1ce

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_5
    iput-object p2, p0, Lr20;->e:Landroid/app/Dialog;

    sget v0, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v2, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    xor-int/lit16 v2, v2, 0xeea

    rem-int/2addr v0, v2

    if-gtz v0, :cond_1

    invoke-static {}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۣ۟ۧۤۡ()I

    const-string v0, "\u06e5\u06e6"

    :goto_1
    invoke-static {v0}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e0\u06e3\u06e4"

    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_6
    iput-object p3, p0, Lr20;->c:Landroid/widget/LinearLayout;

    sget v0, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    if-gtz v0, :cond_2

    invoke-static {}, Landroidx/profileinstaller/ۣ۠ۨۢ;->۟ۤۥ۟۟()I

    const-string v0, "\u06e6\u06e1\u06e7"

    invoke-static {v0}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e4\u06e2\u06e4"

    goto :goto_1

    :sswitch_7
    iput p1, p0, Lr20;->d:I

    sget v0, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v2, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    div-int/lit16 v2, v2, 0x2314

    xor-int/2addr v0, v2

    if-ltz v0, :cond_3

    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۢۨۨۤ()I

    const-string v0, "\u06e8\u06e8\u06e1"

    :goto_2
    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_3
    const-string v0, "\u06e8\u06e8\u06e1"

    goto :goto_2

    :cond_4
    :sswitch_8
    sget v0, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v2, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    or-int/2addr v0, v2

    const v2, 0xdc9e

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdca1 -> :sswitch_0
        0x1aa784 -> :sswitch_3
        0x1aab41 -> :sswitch_2
        0x1aaf7f -> :sswitch_1
        0x1ab2a0 -> :sswitch_6
        0x1ab31f -> :sswitch_8
        0x1aba26 -> :sswitch_7
        0x1ac18c -> :sswitch_4
        0x1ac9e1 -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 11

    const/4 v4, 0x0

    const/4 v2, 0x0

    const/4 v1, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v6, 0x0

    const-string v0, "\u06e8\u06e5\u06e3"

    invoke-static {v0}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    :goto_0
    sparse-switch v10, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    move v0, v8

    :cond_0
    sget v3, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v8, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    xor-int/lit16 v8, v8, -0x1041

    mul-int/2addr v3, v8

    if-gtz v3, :cond_11

    const-string v3, "\u06e3\u06e4\u06e0"

    invoke-static {v3}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v3

    move v10, v3

    move v8, v0

    goto :goto_0

    :sswitch_1
    const/4 v0, 0x0

    :goto_1
    return v0

    :sswitch_2
    move-object v0, v1

    check-cast v0, Lh40;

    sget v3, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    if-ltz v3, :cond_1

    const-string v3, "\u06e0\u06e1\u06e7"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v3

    move-object v9, v0

    move v10, v3

    goto :goto_0

    :cond_1
    sget v3, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v9, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    or-int/2addr v3, v9

    const v9, -0x1ab743

    xor-int/2addr v3, v9

    move-object v9, v0

    move v10, v3

    goto :goto_0

    :sswitch_3
    invoke-static {}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟ۤۦۡ()I

    move-result v0

    if-ltz v0, :cond_2

    const-string v3, "\u06df\u06e2\u06e7"

    move-object v0, v2

    :goto_2
    invoke-static {v3}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v3

    move-object v2, v0

    move v10, v3

    goto :goto_0

    :cond_2
    const-string v3, "\u06e8\u06e5\u06e3"

    move-object v0, v2

    goto :goto_2

    :sswitch_4
    const/4 v0, 0x3

    if-eq v5, v0, :cond_5

    invoke-static {}, Landroidx/core/content/ۥۨۤۦ;->۟۠۠۠ۥ()I

    move-result v0

    if-ltz v0, :cond_3

    const/16 v0, 0x5b

    sput v0, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    const-string v0, "\u06df\u06e2\u06e6"

    invoke-static {v0}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e3\u06e5\u06e4"

    :goto_3
    invoke-static {v0}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto :goto_0

    :sswitch_5
    iget v0, p0, Lr20;->b:F

    const/high16 v3, 0x41c80000    # 25.0f

    sub-float/2addr v0, v3

    add-float/2addr v0, v8

    const/high16 v3, 0x41c80000    # 25.0f

    add-float/2addr v0, v3

    invoke-virtual {v2, v0}, Landroid/view/View;->setTranslationY(F)V

    sget v0, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v3, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    div-int/lit16 v3, v3, 0x1167

    mul-int/2addr v0, v3

    if-eqz v0, :cond_4

    const-string v0, "\u06e2\u06e0"

    goto :goto_3

    :cond_4
    const-string v3, "\u06e6\u06e4\u06e2"

    move-object v0, v2

    goto :goto_2

    :sswitch_6
    const/4 v0, 0x1

    goto :goto_1

    :cond_5
    :sswitch_7
    sget v0, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v3, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    rem-int/lit16 v3, v3, 0x259f

    add-int/2addr v0, v3

    if-gtz v0, :cond_6

    const-string v0, "\u06e8\u06e5\u06e2"

    move v3, v5

    :goto_4
    invoke-static {v0}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v0

    move v5, v3

    move v10, v0

    goto/16 :goto_0

    :cond_6
    sget v0, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v3, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    or-int/2addr v0, v3

    const v3, 0x1ab140

    add-int/2addr v0, v3

    move v10, v0

    goto/16 :goto_0

    :sswitch_8
    invoke-virtual {v2}, Landroid/view/View;->getTranslationY()F

    move-result v0

    iput v0, p0, Lr20;->b:F

    const-string v0, "\u06e5\u06e2\u06e5"

    :goto_5
    invoke-static {v0}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :sswitch_9
    const/4 v0, 0x1

    goto/16 :goto_1

    :sswitch_a
    const/4 v0, 0x0

    const/4 v3, 0x0

    const v10, 0x3e4ccccd    # 0.2f

    mul-float/2addr v10, v8

    sub-float/2addr v3, v10

    iget v10, p0, Lr20;->b:F

    sub-float/2addr v3, v10

    sub-float/2addr v0, v3

    invoke-virtual {v2, v0}, Landroid/view/View;->setTranslationY(F)V

    invoke-static {}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۢۡۤ()I

    move-result v0

    if-ltz v0, :cond_7

    invoke-static {}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۢ۟ۡۧ()I

    const-string v0, "\u06e8\u06e5\u06e3"

    goto :goto_5

    :cond_7
    sget v0, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v3, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    mul-int/2addr v0, v3

    const v3, 0x1d206b

    add-int/2addr v0, v3

    move v10, v0

    goto/16 :goto_0

    :sswitch_b
    const/4 v0, 0x1

    goto/16 :goto_1

    :cond_8
    :sswitch_c
    sget v0, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v3, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    rem-int/lit16 v3, v3, -0x2533

    or-int/2addr v0, v3

    if-ltz v0, :cond_9

    const/16 v0, 0x8

    sput v0, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    const-string v0, "\u06e6\u06e3\u06e0"

    :goto_6
    invoke-static {v0}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :cond_9
    const-string v0, "\u06e5\u06e6\u06e2"

    move v3, v5

    goto :goto_4

    :sswitch_d
    sget v0, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v3, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    mul-int/lit16 v3, v3, -0x6bc

    rem-int/2addr v0, v3

    if-ltz v0, :cond_a

    const/16 v0, 0xc

    sput v0, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    const-string v0, "\u06e5\u06e3\u06e7"

    invoke-static {v0}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :cond_a
    sget v0, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v3, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    rem-int/2addr v0, v3

    const v3, 0x1aa796

    add-int/2addr v0, v3

    move v10, v0

    goto/16 :goto_0

    :sswitch_e
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    const/high16 v3, 0x41a80000    # 21.0f

    sub-float/2addr v0, v3

    iget v3, p0, Lr20;->a:F

    sub-float/2addr v0, v3

    const/high16 v3, 0x41a80000    # 21.0f

    add-float/2addr v0, v3

    const/4 v3, 0x0

    cmpl-float v3, v0, v3

    if-lez v3, :cond_0

    sget v3, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v8, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    mul-int/2addr v3, v8

    const v8, 0x1ce40c

    add-int/2addr v3, v8

    move v10, v3

    move v8, v0

    goto/16 :goto_0

    :sswitch_f
    const-string v0, "MQ==\n"

    const-string v3, "R6sevijeMX4=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "MrAEtcA=\n"

    const-string v3, "V8Zh27TUFdA=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v3, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    rem-int/lit16 v3, v3, 0x1bb9

    xor-int/2addr v0, v3

    if-ltz v0, :cond_b

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟ۥۧۦۥ()I

    const-string v0, "\u06e2\u06e7\u06e4"

    invoke-static {v0}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :cond_b
    sget v0, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v3, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sub-int/2addr v0, v3

    const v3, 0x1ab382

    add-int/2addr v0, v3

    move v10, v0

    goto/16 :goto_0

    :sswitch_10
    iget v0, p0, Lr20;->d:I

    int-to-float v6, v0

    invoke-virtual {v2}, Landroid/view/View;->getTranslationY()F

    move-result v0

    const/high16 v3, 0x3e800000    # 0.25f

    mul-float/2addr v3, v6

    cmpl-float v0, v0, v3

    if-lez v0, :cond_8

    move-object v0, v9

    :goto_7
    const-string v3, "\u06e1\u06e0\u06e2"

    invoke-static {v3}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v3

    move-object v9, v0

    move v10, v3

    goto/16 :goto_0

    :sswitch_11
    iget-object v0, v9, Lh40;->j:Li40;

    const/high16 v3, 0x43480000    # 200.0f

    invoke-virtual {v0, v3}, Li40;->b(F)V

    new-instance v0, Lc6;

    iget-object v3, p0, Lr20;->e:Landroid/app/Dialog;

    const/4 v10, 0x1

    invoke-direct {v0, v3, v10}, Lc6;-><init>(Landroid/view/KeyEvent$Callback;I)V

    invoke-virtual {v9, v0}, Lh40;->a(Lsh;)V

    sget v0, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v3, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    div-int/lit16 v3, v3, 0x103c

    mul-int/2addr v0, v3

    if-eqz v0, :cond_c

    const-string v0, "\u06e6\u06e4\u06e2"

    invoke-static {v0}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :cond_c
    const-string v0, "\u06e0\u06e1\u06e7"

    :goto_8
    invoke-static {v0}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :sswitch_12
    const/4 v0, 0x0

    sget v3, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    if-ltz v3, :cond_f

    const/16 v3, 0x3a

    sput v3, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    const-string v3, "\u06df\u06e1\u06df"

    invoke-static {v3}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣ۟ۦۥۥ(Ljava/lang/Object;)I

    move-result v3

    move-object v7, v0

    move v10, v3

    goto/16 :goto_0

    :cond_d
    :sswitch_13
    invoke-static {}, Landroidx/savedstate/۠ۡۢ۠;->ۣ۟ۨۤۨ()I

    move-result v0

    if-gtz v0, :cond_e

    invoke-static {}, Lcom/google/android/material/carousel/۟ۧۡۢ;->۟ۦۥۣۧ()I

    const-string v0, "\u06e5\u06e6\u06e1"

    :goto_9
    invoke-static {v0}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :cond_e
    sget v0, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v3, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    add-int/2addr v0, v3

    const v3, 0x1aafc1

    xor-int/2addr v0, v3

    move v10, v0

    goto/16 :goto_0

    :sswitch_14
    iget-object v0, v9, Lh40;->j:Li40;

    const v3, 0x44bb8000    # 1500.0f

    invoke-virtual {v0, v3}, Li40;->b(F)V

    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Lh40;->b(F)V

    sget v0, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v3, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    add-int/lit16 v3, v3, 0x216f

    mul-int/2addr v0, v3

    if-gtz v0, :cond_10

    invoke-static {}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۣ۟ۦۢ()I

    move-object v0, v7

    :cond_f
    const-string v3, "\u06e4\u06e1\u06e7"

    invoke-static {v3}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v3

    move-object v7, v0

    move v10, v3

    goto/16 :goto_0

    :cond_10
    const-string v0, "\u06df\u06e1\u06df"

    goto/16 :goto_3

    :cond_11
    sget v3, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v8, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    or-int/2addr v3, v8

    const v8, 0x1aaefd

    xor-int/2addr v3, v8

    move v10, v3

    move v8, v0

    goto/16 :goto_0

    :sswitch_15
    const v0, -0x7e0502d0

    xor-int/2addr v0, v4

    invoke-virtual {v2, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    instance-of v0, v1, Lh40;

    if-eqz v0, :cond_16

    sget v0, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    if-gtz v0, :cond_12

    const-string v0, "\u06e1\u06e6\u06e7"

    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :cond_12
    sget v0, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v3, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    mul-int/2addr v0, v3

    const v3, 0x1f41b

    add-int/2addr v0, v3

    move v10, v0

    goto/16 :goto_0

    :cond_13
    :sswitch_16
    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۢۨۨۤ()I

    move-result v0

    if-ltz v0, :cond_14

    const-string v0, "\u06e2\u06df\u06e8"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :cond_14
    sget v0, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v3, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    div-int/2addr v0, v3

    const v3, 0x1abdf6

    add-int/2addr v0, v3

    move v10, v0

    goto/16 :goto_0

    :sswitch_17
    const/4 v0, 0x1

    goto/16 :goto_1

    :sswitch_18
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v3

    if-eqz v3, :cond_1a

    sget v0, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    if-ltz v0, :cond_15

    invoke-static {}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟۟ۤۦۨ()I

    const-string v0, "\u06e2\u06df\u06e5"

    invoke-static {v0}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v5, v3

    move v10, v0

    goto/16 :goto_0

    :cond_15
    const-string v0, "\u06e2\u06e3\u06df"

    goto/16 :goto_4

    :cond_16
    :sswitch_19
    const-string v3, "\u06e5\u06e1\u06df"

    move-object v0, v2

    goto/16 :goto_2

    :sswitch_1a
    invoke-virtual {v9}, Lh40;->c()V

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    iput v0, p0, Lr20;->a:F

    sget v0, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v3, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    add-int/lit16 v3, v3, 0x19f9

    mul-int/2addr v0, v3

    if-gtz v0, :cond_17

    const/16 v0, 0x30

    sput v0, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    const-string v0, "\u06e8\u06e8\u06df"

    invoke-static {v0}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :cond_17
    const-string v0, "\u06e0\u06e6\u06e7"

    goto/16 :goto_6

    :sswitch_1b
    sget v4, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    iget-object v0, p0, Lr20;->c:Landroid/widget/LinearLayout;

    const-string v2, "\u06e1\u06e2\u06e4"

    move-object v3, v2

    goto/16 :goto_2

    :sswitch_1c
    sget v0, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v3, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    xor-int/lit16 v3, v3, 0x76f

    div-int/2addr v0, v3

    if-eqz v0, :cond_18

    invoke-static {}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۠۠ۧ۟()I

    move-object v0, v7

    goto/16 :goto_7

    :cond_18
    sget v0, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v3, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    rem-int/2addr v0, v3

    const v3, 0x1ac542

    add-int/2addr v0, v3

    move-object v9, v7

    move v10, v0

    goto/16 :goto_0

    :sswitch_1d
    const/4 v0, 0x0

    const/4 v3, 0x0

    sub-float/2addr v3, v6

    sget v10, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    xor-int/lit16 v10, v10, -0xf4

    invoke-static {v10}, Lff;->q(I)I

    move-result v10

    int-to-float v10, v10

    sub-float/2addr v3, v10

    sub-float/2addr v0, v3

    invoke-virtual {v9, v0}, Lh40;->b(F)V

    invoke-static {}, Lio/fastkv/ۦۣ۠ۨ;->۠ۡۨۧ()I

    move-result v0

    if-ltz v0, :cond_19

    const/16 v0, 0x38

    sput v0, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    const-string v0, "\u06e3\u06e5\u06e4"

    invoke-static {v0}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :cond_19
    const-string v0, "\u06df\u06e5\u06e6"

    goto/16 :goto_9

    :sswitch_1e
    move v3, v5

    :cond_1a
    sget v0, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    if-ltz v0, :cond_1b

    const/16 v0, 0x30

    sput v0, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    const-string v0, "\u06e5\u06e5\u06e6"

    move v5, v3

    goto/16 :goto_8

    :cond_1b
    sget v0, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v5, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    rem-int/2addr v0, v5

    const v5, 0x1aafbb

    add-int/2addr v0, v5

    move v5, v3

    move v10, v0

    goto/16 :goto_0

    :sswitch_1f
    if-nez v9, :cond_13

    sget v0, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v3, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    add-int/lit16 v3, v3, 0x1b52

    add-int/2addr v0, v3

    if-gtz v0, :cond_1c

    const-string v0, "\u06e1\u06e4\u06e6"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :cond_1c
    sget v0, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v3, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sub-int/2addr v0, v3

    const v3, -0x1aa86e

    xor-int/2addr v0, v3

    move v10, v0

    goto/16 :goto_0

    :sswitch_20
    const/4 v0, 0x1

    if-eq v5, v0, :cond_5

    const/4 v0, 0x2

    if-eq v5, v0, :cond_d

    sget v0, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    if-ltz v0, :cond_1d

    const-string v0, "\u06e7\u06e0\u06e0"

    invoke-static {v0}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :cond_1d
    const-string v0, "\u06e1\u06e7\u06e7"

    goto/16 :goto_9

    :sswitch_21
    const/4 v0, 0x1

    goto/16 :goto_1

    :sswitch_22
    const/4 v0, 0x1

    goto/16 :goto_1

    :sswitch_23
    sget v0, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v3, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    mul-int/lit16 v3, v3, -0x205d

    add-int/2addr v0, v3

    if-gtz v0, :cond_1e

    const-string v0, "\u06e6\u06e6\u06e1"

    invoke-static {v0}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :cond_1e
    sget v0, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v3, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    xor-int/2addr v0, v3

    const v3, 0x1ac62d

    add-int/2addr v0, v3

    move v10, v0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdbe4 -> :sswitch_0
        0xdc3e -> :sswitch_2
        0x1aa73d -> :sswitch_b
        0x1aa763 -> :sswitch_23
        0x1aa7c0 -> :sswitch_9
        0x1aab06 -> :sswitch_1d
        0x1aab3c -> :sswitch_5
        0x1aab7c -> :sswitch_1
        0x1aaba1 -> :sswitch_8
        0x1aae82 -> :sswitch_e
        0x1aaea3 -> :sswitch_11
        0x1aaee3 -> :sswitch_15
        0x1aaf23 -> :sswitch_1a
        0x1aaf5b -> :sswitch_1e
        0x1aaf62 -> :sswitch_16
        0x1aaf81 -> :sswitch_4
        0x1aaf82 -> :sswitch_a
        0x1ab248 -> :sswitch_c
        0x1ab2be -> :sswitch_20
        0x1ab33f -> :sswitch_10
        0x1ab666 -> :sswitch_d
        0x1ab6a1 -> :sswitch_1b
        0x1ab6c2 -> :sswitch_6
        0x1aba0a -> :sswitch_1c
        0x1abdc3 -> :sswitch_12
        0x1abde8 -> :sswitch_17
        0x1abe09 -> :sswitch_18
        0x1abe61 -> :sswitch_14
        0x1abe65 -> :sswitch_23
        0x1ac1e4 -> :sswitch_22
        0x1ac527 -> :sswitch_3
        0x1ac56c -> :sswitch_13
        0x1ac58a -> :sswitch_1f
        0x1ac986 -> :sswitch_f
        0x1ac9c3 -> :sswitch_7
        0x1ac9df -> :sswitch_19
        0x1ac9e3 -> :sswitch_21
    .end sparse-switch
.end method
