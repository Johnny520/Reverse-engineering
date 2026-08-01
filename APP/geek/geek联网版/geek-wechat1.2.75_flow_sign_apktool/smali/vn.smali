.class public final synthetic Lvn;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Ll00;

.field public final c:F

.field public final d:I


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Ll00;FI)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e3\u06e6\u06e7"

    invoke-static {v1}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    sget v1, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    if-ltz v1, :cond_4

    invoke-static {}, Landroidx/activity/result/۟ۡۤۦۡ;->۟۟۟ۥۤ()I

    const-string v1, "\u06e4\u06e4\u06e4"

    :goto_1
    invoke-static {v1}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_1
    iput p3, p0, Lvn;->c:F

    sget v1, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v2, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    mul-int/lit16 v2, v2, 0x193a

    xor-int/2addr v1, v2

    if-gtz v1, :cond_2

    const/16 v1, 0x4b

    sput v1, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    :cond_1
    const-string v1, "\u06e0\u06e6\u06e4"

    :goto_2
    invoke-static {v1}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    const-string v1, "\u06e3\u06df\u06e3"

    :goto_3
    invoke-static {v1}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_2
    invoke-static {}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۨ۠۟()I

    move-result v1

    if-ltz v1, :cond_0

    sget v1, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    if-gtz v1, :cond_1

    const-string v1, "\u06e1\u06e3\u06df"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_3
    const-string v0, "NYmkHngWNkcwLlbv96mcGnD2R6"

    invoke-static {v0}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۦۤ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget v1, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v2, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    mul-int/lit16 v2, v2, 0xaf9

    sub-int/2addr v1, v2

    if-gtz v1, :cond_3

    invoke-static {}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۤ۟۠ۢ()I

    const-string v1, "\u06e1\u06df\u06df"

    goto :goto_3

    :cond_3
    sget v1, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sub-int/2addr v1, v2

    const v2, 0x1abf29

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_4
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    const-string v1, "\u06e7\u06e8\u06df"

    goto :goto_2

    :cond_4
    const-string v1, "\u06e7\u06e8\u06df"

    goto :goto_1

    :sswitch_5
    iput-object p2, p0, Lvn;->b:Ll00;

    const-string v1, "\u06e1\u06e3\u06df"

    :goto_4
    invoke-static {v1}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_6
    iput p4, p0, Lvn;->d:I

    sget v1, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    sget v2, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    div-int/lit8 v2, v2, 0x5

    sub-int/2addr v1, v2

    if-gtz v1, :cond_5

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->۟ۥۣۥۦ()I

    const-string v1, "\u06e0\u06e4\u06df"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_5
    const-string v1, "\u06e8\u06e4\u06e5"

    goto :goto_2

    :sswitch_7
    sget v1, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v2, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    add-int/lit16 v2, v2, -0x160e

    sub-int/2addr v1, v2

    if-gtz v1, :cond_6

    const/16 v1, 0x28

    sput v1, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    const-string v1, "\u06e7\u06e2\u06e3"

    goto :goto_4

    :cond_6
    sget v1, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v2, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    or-int/2addr v1, v2

    const v2, 0x1ab71b

    xor-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_8
    iput-object p1, p0, Lvn;->a:Landroid/view/View;

    sget v1, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v2, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    add-int/lit16 v2, v2, 0x1b59

    mul-int/2addr v1, v2

    if-ltz v1, :cond_7

    invoke-static {}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۧۡۥ۟()I

    :cond_7
    const-string v1, "\u06e5\u06e0\u06e1"

    invoke-static {v1}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_9
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aab5b -> :sswitch_0
        0x1aab9e -> :sswitch_3
        0x1aae81 -> :sswitch_7
        0x1aaefd -> :sswitch_1
        0x1ab607 -> :sswitch_6
        0x1ab6e4 -> :sswitch_8
        0x1abda6 -> :sswitch_5
        0x1abe63 -> :sswitch_4
        0x1ac61e -> :sswitch_9
        0x1ac969 -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 11

    const/high16 v10, 0x41d00000    # 26.0f

    const/4 v0, 0x0

    const/4 v6, 0x0

    const/4 v5, 0x0

    const-string v1, "\u06e1\u06e7\u06e8"

    invoke-static {v1}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v4

    move-object v7, v0

    move-object v1, v0

    move-object v3, v0

    move-object v8, v0

    move-object v2, v0

    move v9, v4

    :goto_0
    sparse-switch v9, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    if-gtz v0, :cond_8

    const/16 v0, 0x5e

    sput v0, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    const-string v0, "\u06e5\u06e6\u06e3"

    :goto_1
    invoke-static {v0}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto :goto_0

    :sswitch_1
    iget v0, p0, Lvn;->c:F

    sub-float/2addr v0, v10

    sub-float/2addr v0, v5

    add-float/2addr v0, v10

    invoke-virtual {v7, v0}, Landroid/view/View;->setTranslationX(F)V

    invoke-static {}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟۠ۢۨۦ()I

    move-result v0

    if-gtz v0, :cond_1

    :cond_0
    const-string v0, "\u06e1\u06e1\u06e2"

    invoke-static {v0}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto :goto_0

    :cond_1
    sget v0, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v4, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    add-int/2addr v0, v4

    const v4, 0x1aa666

    add-int/2addr v0, v4

    move v9, v0

    goto :goto_0

    :sswitch_2
    move-object v0, v1

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    sget v0, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v6, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    or-int/lit16 v6, v6, 0x1816

    rem-int/2addr v0, v6

    if-ltz v0, :cond_2

    const/16 v0, 0x2c

    sput v0, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    const-string v0, "\u06df\u06e3\u06e8"

    :goto_2
    invoke-static {v0}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v0

    move v6, v4

    move v9, v0

    goto :goto_0

    :cond_2
    sget v0, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v6, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    mul-int/2addr v0, v6

    const v6, 0x195643

    add-int/2addr v0, v6

    move v6, v4

    move v9, v0

    goto :goto_0

    :cond_3
    :sswitch_3
    sget v0, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v4, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    add-int/lit16 v4, v4, 0x18d9

    rem-int/2addr v0, v4

    if-ltz v0, :cond_4

    const-string v0, "\u06e7\u06e4\u06e5"

    invoke-static {v0}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto :goto_0

    :cond_4
    sget v0, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v4, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    rem-int/2addr v0, v4

    const v4, 0x1aab84

    xor-int/2addr v0, v4

    move v9, v0

    goto :goto_0

    :sswitch_4
    iget-object v0, p0, Lvn;->a:Landroid/view/View;

    sget v4, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v7, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sub-int/2addr v4, v7

    const v7, 0x1ab0ee

    add-int/2addr v4, v7

    move-object v7, v0

    move v9, v4

    goto/16 :goto_0

    :sswitch_5
    move-object v0, v2

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    sget v4, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v8, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    or-int/2addr v4, v8

    const v8, 0x1aab0a

    add-int/2addr v4, v8

    move-object v8, v0

    move v9, v4

    goto/16 :goto_0

    :sswitch_6
    invoke-static {}, Landroidx/activity/result/۟ۡۧ۠ۥ;->۟ۥۥۧ۟()I

    move-result v0

    if-gtz v0, :cond_3

    const-string v0, "\u06e7\u06e7\u06e1"

    invoke-static {v0}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto/16 :goto_0

    :sswitch_7
    const-string v0, "Qp7f3YrrqKNChMeRyO3prk2Yx5He5+mjQ4We39/kpe1YksPUiuOmuUCC3Z/j5r0=\n"

    const-string v4, "LOuzsaqIyc0=\n"

    invoke-static {v0, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v4, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    add-int/lit16 v4, v4, 0x1c6f

    sub-int/2addr v0, v4

    if-ltz v0, :cond_5

    const-string v0, "\u06e2\u06e7\u06e3"

    invoke-static {v0}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto/16 :goto_0

    :cond_5
    move v0, v5

    :cond_6
    const-string v4, "\u06e0\u06e6\u06e5"

    move v5, v0

    :goto_3
    invoke-static {v4}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto/16 :goto_0

    :sswitch_8
    invoke-virtual {v7, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    sget v0, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v4, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    xor-int/lit16 v4, v4, -0x32e

    xor-int/2addr v0, v4

    if-ltz v0, :cond_7

    invoke-static {}, Lio/fastkv/ۣ۟ۧۦۡ;->ۥۥۤۥ()I

    const-string v4, "\u06e8\u06e4\u06e0"

    move-object v0, v3

    :goto_4
    invoke-static {v4}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v4

    move-object v3, v0

    move v9, v4

    goto/16 :goto_0

    :cond_7
    const-string v0, "\u06e8\u06e5\u06df"

    :goto_5
    invoke-static {v0}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto/16 :goto_0

    :cond_8
    sget v0, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v4, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    xor-int/2addr v0, v4

    const v4, 0x1aad67

    add-int/2addr v0, v4

    move v9, v0

    goto/16 :goto_0

    :sswitch_9
    const-string v0, "OkSPXvRKNnMQ3MG"

    invoke-static {v0}, Lcom/google/android/material/button/ۥۤ۠;->ۧ۠۠ۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget v3, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v4, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    add-int/lit16 v4, v4, -0x1059

    div-int/2addr v3, v4

    if-eqz v3, :cond_9

    const/16 v3, 0x10

    sput v3, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    :goto_6
    const-string v3, "\u06e1\u06e6\u06e3"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v4

    move-object v3, v0

    move v9, v4

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06e8\u06e4\u06e0"

    move-object v4, v3

    goto :goto_4

    :sswitch_a
    const-string v0, "K+Q=\n"

    const-string v4, "QpBcxSCxoQ8=\n"

    invoke-static {v0, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    move-object v0, v3

    goto :goto_6

    :sswitch_b
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v1

    const-string v0, "\u06e6\u06e2\u06e4"

    move-object v4, v0

    goto :goto_3

    :sswitch_c
    add-int/lit8 v0, v6, 0x4

    iget v4, p0, Lvn;->d:I

    sub-int/2addr v0, v4

    add-int/lit8 v0, v0, -0x4

    int-to-float v0, v0

    sget v4, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v5, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    add-int/lit16 v5, v5, 0x1185

    add-int/2addr v4, v5

    if-lez v4, :cond_6

    sget v4, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v5, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    or-int/2addr v4, v5

    const v5, 0x1ac167

    add-int/2addr v4, v5

    move v9, v4

    move v5, v0

    goto/16 :goto_0

    :sswitch_d
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v3}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v4, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    div-int/2addr v0, v4

    const v4, 0x1aabdd

    add-int/2addr v0, v4

    move v9, v0

    goto/16 :goto_0

    :cond_a
    :sswitch_e
    sget v0, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v4, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    rem-int/lit16 v4, v4, 0x15d

    add-int/2addr v0, v4

    if-ltz v0, :cond_b

    const-string v0, "\u06e1\u06e3"

    goto/16 :goto_5

    :cond_b
    const-string v0, "\u06df\u06e6\u06e8"

    goto/16 :goto_1

    :sswitch_f
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    const-string v4, "\u06e6\u06e1\u06e6"

    move-object v0, v3

    goto/16 :goto_4

    :sswitch_10
    iput v6, v8, Landroid/widget/FrameLayout$LayoutParams;->width:I

    sget v0, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    if-ltz v0, :cond_c

    const/16 v0, 0xa

    sput v0, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    const-string v0, "\u06e7\u06e7\u06e1"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto/16 :goto_0

    :cond_c
    const-string v0, "\u06e4\u06e3\u06e7"

    move v4, v6

    goto/16 :goto_2

    :sswitch_11
    iget-object v0, p0, Lvn;->b:Ll00;

    iget-boolean v0, v0, Ll00;->a:Z

    if-eqz v0, :cond_a

    const-string v0, "\u06e6\u06df\u06e2"

    move-object v4, v0

    goto/16 :goto_3

    :sswitch_12
    const-string v0, "inXNVefRxoKKb9UZpdeHj4Vz1Rmz3YeCi26MV7Ley8yQedFc59PJiJZvyF3pxc6Ig2XVF4HAxoGB\nTMBAqMfTwqhh2FayxveNlmHMSg==\n"

    const-string v4, "5AChOceyp+w=\n"

    invoke-static {v0, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v4, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    or-int/lit16 v4, v4, -0xd42

    xor-int/2addr v0, v4

    if-ltz v0, :cond_0

    const/16 v0, 0xb

    sput v0, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    const-string v0, "\u06e8\u06e5\u06df"

    invoke-static {v0}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto/16 :goto_0

    :sswitch_13
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa784 -> :sswitch_0
        0x1aa7e1 -> :sswitch_8
        0x1aab01 -> :sswitch_b
        0x1aab9c -> :sswitch_3
        0x1aab9f -> :sswitch_2
        0x1aabde -> :sswitch_13
        0x1aaec2 -> :sswitch_5
        0x1aaf5e -> :sswitch_4
        0x1aaf82 -> :sswitch_a
        0x1ab33e -> :sswitch_f
        0x1aba48 -> :sswitch_11
        0x1abade -> :sswitch_e
        0x1abe65 -> :sswitch_1
        0x1ac149 -> :sswitch_c
        0x1ac18b -> :sswitch_12
        0x1ac1a8 -> :sswitch_7
        0x1ac601 -> :sswitch_9
        0x1ac608 -> :sswitch_10
        0x1ac964 -> :sswitch_d
        0x1ac982 -> :sswitch_6
    .end sparse-switch
.end method
