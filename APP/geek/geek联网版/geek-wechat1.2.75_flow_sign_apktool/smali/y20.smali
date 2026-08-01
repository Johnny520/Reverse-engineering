.class public final Ly20;
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

    const/4 v1, 0x0

    const-string v0, "\u06df\u06e2\u06df"

    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iput-object p3, p0, Ly20;->c:Landroid/widget/LinearLayout;

    sget v0, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    if-ltz v0, :cond_4

    const/16 v0, 0x5d

    sput v0, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    move v0, v1

    :cond_0
    const-string v1, "\u06e5\u06e2\u06e1"

    invoke-static {v1}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v2

    move v1, v0

    goto :goto_0

    :cond_1
    :sswitch_1
    sget v0, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v2, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    add-int/lit8 v2, v2, 0x5b

    div-int/2addr v0, v2

    if-gtz v0, :cond_2

    const/16 v0, 0x54

    sput v0, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    const-string v0, "\u06e2\u06e5\u06e2"

    :goto_1
    invoke-static {v0}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e8\u06e8\u06e1"

    goto :goto_1

    :sswitch_2
    sget v0, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    if-ltz v0, :cond_3

    invoke-static {}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۡۤۥۧ()I

    const-string v0, "\u06e1\u06e0\u06e0"

    :goto_2
    invoke-static {v0}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06df\u06e2\u06df"

    goto :goto_2

    :sswitch_3
    invoke-static {}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۤ۟۠ۢ()I

    move-result v0

    if-gtz v0, :cond_1

    sget v0, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    if-ltz v0, :cond_5

    const-string v0, "\u06df\u06e2\u06df"

    invoke-static {v0}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_4
    const-string v0, "\u06e2\u06e4\u06e3"

    goto :goto_1

    :sswitch_4
    iput p1, p0, Ly20;->d:I

    sget v0, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    if-gtz v0, :cond_6

    :cond_5
    const-string v0, "\u06e6\u06e4\u06e1"

    invoke-static {v0}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_6
    const-string v0, "\u06e1\u06e8\u06e0"

    goto :goto_1

    :sswitch_5
    const-string v0, "SKDN3Vu"

    invoke-static {v0}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟ۡۦ۠۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget v1, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v2, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    xor-int/lit16 v2, v2, 0x1e86

    xor-int/2addr v1, v2

    if-gtz v1, :cond_0

    const/4 v1, 0x7

    sput v1, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    const-string v1, "\u06e1\u06e8\u06e0"

    invoke-static {v1}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v2

    move v1, v0

    goto/16 :goto_0

    :sswitch_6
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(I)V

    const-string v0, "\u06e8\u06e8\u06e1"

    goto :goto_2

    :sswitch_7
    iput-object p2, p0, Ly20;->e:Landroid/app/Dialog;

    sget v0, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v2, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    add-int/lit16 v2, v2, -0x1c73

    div-int/2addr v0, v2

    if-eqz v0, :cond_7

    invoke-static {}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۧۧۥۦ()I

    const-string v0, "\u06e7\u06e2\u06e5"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_7
    sget v0, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v2, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    mul-int/2addr v0, v2

    const v2, 0x1aca2f

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_8
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa75c -> :sswitch_0
        0x1aab80 -> :sswitch_2
        0x1aae87 -> :sswitch_3
        0x1aaf99 -> :sswitch_7
        0x1ab2e1 -> :sswitch_4
        0x1abde4 -> :sswitch_6
        0x1ac1e3 -> :sswitch_5
        0x1ac56a -> :sswitch_1
        0x1ac9e1 -> :sswitch_8
    .end sparse-switch
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 12

    const/4 v3, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x0

    const-string v4, "\u06e5\u06e5"

    invoke-static {v4}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v4

    move-object v9, v0

    move v10, v3

    move v11, v4

    :goto_0
    sparse-switch v11, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v3, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    iget-object v0, p0, Ly20;->c:Landroid/widget/LinearLayout;

    invoke-static {}, Landroidx/legacy/content/ۧۡ۠۠;->ۥۧۡۦ()I

    move-result v4

    if-gtz v4, :cond_7

    const-string v4, "\u06e4\u06df\u06e0"

    invoke-static {v4}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v4

    move-object v9, v0

    move v10, v3

    move v11, v4

    goto :goto_0

    :cond_0
    :sswitch_1
    const-string v0, "\u06e2\u06e8\u06e5"

    move-object v3, v0

    move v4, v2

    :goto_1
    invoke-static {v3}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v0

    move v11, v0

    move v2, v4

    goto :goto_0

    :sswitch_2
    invoke-static {}, Landroid/app/۟ۡۧۦۡ;->ۥۣۨۧ()I

    move-result v0

    if-ltz v0, :cond_1

    const-string v0, "\u06e3\u06e6"

    :goto_2
    invoke-static {v0}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v0

    move v11, v0

    goto :goto_0

    :cond_1
    sget v0, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sget v3, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    mul-int/2addr v0, v3

    const v3, 0x1a0c03

    xor-int/2addr v0, v3

    move v11, v0

    goto :goto_0

    :sswitch_3
    const v0, 0x7e05027f    # 4.420007E37f

    xor-int/2addr v0, v10

    invoke-virtual {v9, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    instance-of v0, v1, Lo40;

    if-eqz v0, :cond_0

    sget v0, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v3, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    add-int/lit16 v3, v3, -0xe23

    rem-int/2addr v0, v3

    if-ltz v0, :cond_2

    const-string v0, "\u06e6\u06df\u06e4"

    invoke-static {v0}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v0

    move v11, v0

    goto :goto_0

    :cond_2
    sget v0, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v3, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    rem-int/2addr v0, v3

    const v3, -0x1abe90

    xor-int/2addr v0, v3

    move v11, v0

    goto :goto_0

    :sswitch_4
    iget-object v0, v7, Lo40;->k:Lp40;

    const/high16 v3, 0x43480000    # 200.0f

    invoke-virtual {v0, v3}, Lp40;->b(F)V

    new-instance v0, Lc6;

    iget-object v3, p0, Ly20;->e:Landroid/app/Dialog;

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4}, Lc6;-><init>(Landroid/view/KeyEvent$Callback;I)V

    invoke-virtual {v7, v0}, Lo40;->a(Luh;)V

    invoke-static {}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟۠ۢۢ۠()I

    move-result v0

    if-ltz v0, :cond_3

    const-string v0, "\u06e0\u06e8\u06e4"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v0

    move v11, v0

    goto/16 :goto_0

    :cond_3
    sget v0, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v3, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    mul-int/2addr v0, v3

    const v3, 0x5e848

    sub-int/2addr v0, v3

    move v11, v0

    goto/16 :goto_0

    :sswitch_5
    invoke-virtual {v7}, Lo40;->c()V

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    iput v0, p0, Ly20;->a:F

    sget v0, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    if-ltz v0, :cond_4

    const-string v0, "\u06e5\u06e5"

    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v0

    move v11, v0

    goto/16 :goto_0

    :cond_4
    sget v0, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v3, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    mul-int/2addr v0, v3

    const v3, -0x1a7086

    xor-int/2addr v0, v3

    move v11, v0

    goto/16 :goto_0

    :sswitch_6
    const/4 v0, 0x1

    :goto_3
    return v0

    :sswitch_7
    const v0, 0x3e4ccccd    # 0.2f

    mul-float/2addr v0, v2

    const/high16 v3, 0x41500000    # 13.0f

    sub-float/2addr v0, v3

    iget v3, p0, Ly20;->b:F

    add-float/2addr v0, v3

    const/high16 v3, 0x41500000    # 13.0f

    add-float/2addr v0, v3

    invoke-virtual {v9, v0}, Landroid/view/View;->setTranslationY(F)V

    sget v0, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v3, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    mul-int/lit16 v3, v3, -0x26b3

    add-int/2addr v0, v3

    if-ltz v0, :cond_5

    const-string v0, "\u06e8\u06e8\u06e8"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v0

    move v11, v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06e0\u06e5\u06e3"

    :goto_4
    invoke-static {v0}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v11, v0

    goto/16 :goto_0

    :sswitch_8
    const/4 v0, 0x0

    goto :goto_3

    :sswitch_9
    move-object v0, v1

    check-cast v0, Lo40;

    sget v3, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v4, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    xor-int/lit16 v4, v4, 0x1592

    rem-int/2addr v3, v4

    if-gtz v3, :cond_6

    const/4 v3, 0x6

    sput v3, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    const-string v3, "\u06e7\u06e4\u06e8"

    invoke-static {v3}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v3

    move-object v7, v0

    move v11, v3

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06e7\u06e3\u06e7"

    move-object v4, v0

    :goto_5
    invoke-static {v3}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v0

    move-object v7, v4

    move v11, v0

    goto/16 :goto_0

    :cond_7
    sget v4, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v9, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sub-int/2addr v4, v9

    const v9, 0x1aac35

    xor-int/2addr v4, v9

    move-object v9, v0

    move v10, v3

    move v11, v4

    goto/16 :goto_0

    :cond_8
    :sswitch_a
    sget v0, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v3, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    div-int/lit16 v3, v3, -0x24bc

    sub-int/2addr v0, v3

    if-ltz v0, :cond_9

    invoke-static {}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۡۥ۟()I

    const-string v0, "\u06e5\u06e1\u06e7"

    goto :goto_4

    :cond_9
    sget v0, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v3, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    xor-int/2addr v0, v3

    const v3, 0x1ab7d8

    add-int/2addr v0, v3

    move v11, v0

    goto/16 :goto_0

    :sswitch_b
    const/4 v0, 0x1

    goto :goto_3

    :sswitch_c
    const/4 v0, 0x1

    goto :goto_3

    :sswitch_d
    const/4 v0, 0x0

    const/4 v3, 0x0

    sub-float/2addr v3, v6

    sget v4, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    xor-int/lit16 v4, v4, 0x1b8

    invoke-static {v4}, Lmp;->q(I)I

    move-result v4

    int-to-float v4, v4

    sub-float/2addr v3, v4

    sub-float/2addr v0, v3

    invoke-virtual {v7, v0}, Lo40;->b(F)V

    sget v0, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v3, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    xor-int/2addr v0, v3

    const v3, 0x1ac5c3

    add-int/2addr v0, v3

    move v11, v0

    goto/16 :goto_0

    :cond_a
    :sswitch_e
    sget v0, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    if-ltz v0, :cond_b

    const-string v0, "\u06e2\u06e1"

    :goto_6
    invoke-static {v0}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v0

    move v11, v0

    goto/16 :goto_0

    :cond_b
    const-string v0, "\u06e0\u06e8\u06e4"

    goto/16 :goto_4

    :sswitch_f
    const/4 v0, 0x1

    goto/16 :goto_3

    :sswitch_10
    move v0, v2

    :cond_c
    sget v2, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v3, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    add-int/lit16 v3, v3, -0x883

    mul-int/2addr v2, v3

    if-ltz v2, :cond_d

    const/16 v2, 0x36

    sput v2, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    const-string v2, "\u06e3\u06e7\u06e7"

    invoke-static {v2}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v3

    move v11, v3

    move v2, v0

    goto/16 :goto_0

    :cond_d
    const-string v2, "\u06e4\u06e8\u06e7"

    move-object v3, v2

    move v4, v0

    goto/16 :goto_1

    :sswitch_11
    sget v0, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v3, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    mul-int/lit16 v3, v3, 0xfae

    or-int/2addr v0, v3

    if-gtz v0, :cond_e

    const/4 v0, 0x0

    sput v0, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    const-string v0, "\u06e0\u06e3\u06e2"

    move-object v3, v0

    move v4, v2

    goto/16 :goto_1

    :cond_e
    const-string v0, "\u06e5\u06e5"

    move-object v3, v0

    move v4, v2

    goto/16 :goto_1

    :sswitch_12
    iget v0, p0, Ly20;->d:I

    int-to-float v3, v0

    invoke-virtual {v9}, Landroid/view/View;->getTranslationY()F

    move-result v0

    const/high16 v4, 0x3e800000    # 0.25f

    mul-float/2addr v4, v3

    cmpl-float v0, v0, v4

    if-lez v0, :cond_1e

    sget v0, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    if-gtz v0, :cond_f

    invoke-static {}, Landroidx/activity/۟ۥۥۧ۠;->۟ۥۥۤ۟()I

    move-object v0, v5

    :goto_7
    const-string v4, "\u06e8\u06e1\u06e8"

    move-object v5, v0

    move v6, v3

    :goto_8
    invoke-static {v4}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v0

    move v11, v0

    goto/16 :goto_0

    :cond_f
    sget v0, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v4, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    div-int/2addr v0, v4

    const v4, 0xdc60

    add-int/2addr v0, v4

    move v11, v0

    move v6, v3

    goto/16 :goto_0

    :sswitch_13
    const-string v0, "FQ==\n"

    const-string v3, "Yy9q3QfLV0s=\n"

    invoke-static {v0, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "ziAQtCY=\n"

    const-string v3, "q1Z12lIcycI=\n"

    invoke-static {v0, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    if-gtz v0, :cond_10

    const/16 v0, 0x47

    sput v0, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    const-string v0, "\u06e2\u06e3\u06e0"

    move-object v3, v0

    move-object v4, v7

    goto/16 :goto_5

    :cond_10
    const-string v0, "\u06df\u06e2"

    invoke-static {v0}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v0

    move v11, v0

    goto/16 :goto_0

    :sswitch_14
    iget v0, p0, Ly20;->b:F

    const/high16 v3, 0x41500000    # 13.0f

    add-float/2addr v0, v3

    add-float/2addr v0, v2

    const/high16 v3, 0x41500000    # 13.0f

    sub-float/2addr v0, v3

    invoke-virtual {v9, v0}, Landroid/view/View;->setTranslationY(F)V

    const-string v0, "\u06e2\u06e7\u06e7"

    goto/16 :goto_6

    :sswitch_15
    move v0, v8

    :cond_11
    sget v3, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v4, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    div-int/lit16 v4, v4, -0x1f96

    xor-int/2addr v3, v4

    if-ltz v3, :cond_12

    const/16 v3, 0x17

    sput v3, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    const-string v3, "\u06e7\u06e3"

    invoke-static {v3}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v3

    move v8, v0

    move v11, v3

    goto/16 :goto_0

    :cond_12
    sget v3, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v4, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    rem-int/2addr v3, v4

    const v4, 0x1aa807    # 2.448E-39f

    add-int/2addr v3, v4

    move v8, v0

    move v11, v3

    goto/16 :goto_0

    :sswitch_16
    iget-object v0, v7, Lo40;->k:Lp40;

    const v3, 0x44bb8000    # 1500.0f

    invoke-virtual {v0, v3}, Lp40;->b(F)V

    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lo40;->b(F)V

    sget v0, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v3, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    add-int/lit16 v3, v3, 0x504

    div-int/2addr v0, v3

    if-eqz v0, :cond_13

    invoke-static {}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۦۥۨۦ()I

    const-string v0, "\u06e0\u06e5\u06e3"

    :goto_9
    invoke-static {v0}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v0

    move v11, v0

    goto/16 :goto_0

    :cond_13
    const-string v0, "\u06e2\u06e3\u06e6"

    :goto_a
    invoke-static {v0}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v0

    move v11, v0

    goto/16 :goto_0

    :sswitch_17
    const/4 v0, 0x1

    goto/16 :goto_3

    :sswitch_18
    const/4 v0, 0x0

    invoke-static {}, Landroidx/activity/result/۟ۡۤۦۡ;->۟۟۟ۥۤ()I

    move-result v3

    if-gtz v3, :cond_14

    const/16 v3, 0x4e

    sput v3, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    :goto_b
    const-string v3, "\u06e1\u06e1\u06df"

    invoke-static {v3}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v3

    move-object v5, v0

    move v11, v3

    goto/16 :goto_0

    :cond_14
    move v3, v6

    goto/16 :goto_7

    :sswitch_19
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    if-eqz v0, :cond_11

    invoke-static {}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->۟ۦۥۨ۠()I

    move-result v3

    if-ltz v3, :cond_15

    invoke-static {}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۠۟ۥۧ()I

    const-string v3, "\u06e1\u06e5\u06e2"

    invoke-static {v3}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v3

    move v8, v0

    move v11, v3

    goto/16 :goto_0

    :cond_15
    const-string v3, "\u06e8\u06e8\u06e2"

    move-object v4, v3

    move v8, v0

    goto/16 :goto_8

    :cond_16
    :sswitch_1a
    sget v0, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v3, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    add-int/lit16 v3, v3, -0x1da2

    rem-int/2addr v0, v3

    if-gtz v0, :cond_17

    const-string v0, "\u06e5\u06e8\u06df"

    goto :goto_a

    :cond_17
    const-string v0, "\u06e0\u06e2\u06e8"

    goto/16 :goto_2

    :sswitch_1b
    const/4 v0, 0x3

    if-eq v8, v0, :cond_16

    invoke-static {}, Landroidx/legacy/content/ۧۡ۠۠;->ۥۧۡۦ()I

    move-result v0

    if-gtz v0, :cond_18

    const-string v0, "\u06e6\u06e4\u06e1"

    invoke-static {v0}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move v11, v0

    goto/16 :goto_0

    :cond_18
    sget v0, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v3, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    or-int/2addr v0, v3

    const v3, -0x1abbe7

    xor-int/2addr v0, v3

    move v11, v0

    goto/16 :goto_0

    :sswitch_1c
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    const/high16 v2, 0x41200000    # 10.0f

    add-float/2addr v0, v2

    iget v2, p0, Ly20;->a:F

    sub-float/2addr v0, v2

    const/high16 v2, 0x41200000    # 10.0f

    sub-float/2addr v0, v2

    const/4 v2, 0x0

    cmpl-float v2, v0, v2

    if-lez v2, :cond_c

    sget v2, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v3, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    rem-int/lit8 v3, v3, -0x42

    div-int/2addr v2, v3

    if-ltz v2, :cond_19

    const/16 v2, 0x53

    sput v2, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    const-string v2, "\u06e7\u06e5\u06e5"

    invoke-static {v2}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v3

    move v11, v3

    move v2, v0

    goto/16 :goto_0

    :cond_19
    sget v2, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v3, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    rem-int/2addr v2, v3

    const v3, 0x1ac372

    add-int/2addr v3, v2

    move v11, v3

    move v2, v0

    goto/16 :goto_0

    :sswitch_1d
    const/4 v0, 0x1

    goto/16 :goto_3

    :sswitch_1e
    sget v0, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v3, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    add-int/lit16 v3, v3, 0x1e39

    sub-int/2addr v0, v3

    if-ltz v0, :cond_1a

    const/16 v0, 0x58

    sput v0, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    const-string v0, "\u06e8\u06e2\u06e4"

    invoke-static {v0}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v0

    move-object v7, v5

    move v11, v0

    goto/16 :goto_0

    :cond_1a
    sget v0, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v3, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    or-int/2addr v0, v3

    const v3, -0x1ac2eb

    xor-int/2addr v0, v3

    move-object v7, v5

    move v11, v0

    goto/16 :goto_0

    :sswitch_1f
    sget v0, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v3, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    rem-int/lit16 v3, v3, 0xdb5

    sub-int/2addr v0, v3

    if-ltz v0, :cond_1b

    const/16 v0, 0x1e

    sput v0, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    const-string v0, "\u06df\u06df\u06e0"

    invoke-static {v0}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v0

    move v11, v0

    goto/16 :goto_0

    :cond_1b
    sget v0, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sget v3, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    add-int/2addr v0, v3

    const v3, 0x1ac97d    # 2.460003E-39f

    xor-int/2addr v0, v3

    move v11, v0

    goto/16 :goto_0

    :sswitch_20
    const/4 v0, 0x1

    if-eq v8, v0, :cond_16

    const/4 v0, 0x2

    if-eq v8, v0, :cond_a

    sget v0, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    if-gtz v0, :cond_1c

    const-string v0, "\u06df\u06e0\u06e0"

    invoke-static {v0}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v0

    move v11, v0

    goto/16 :goto_0

    :cond_1c
    const-string v0, "\u06e6\u06df\u06e4"

    goto/16 :goto_9

    :sswitch_21
    invoke-virtual {v9}, Landroid/view/View;->getTranslationY()F

    move-result v0

    iput v0, p0, Ly20;->b:F

    sget v0, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    if-gtz v0, :cond_1d

    const-string v0, "\u06e6\u06e8\u06e8"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v0

    move v11, v0

    goto/16 :goto_0

    :cond_1d
    move-object v0, v5

    goto/16 :goto_b

    :sswitch_22
    if-nez v7, :cond_8

    sget v0, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v3, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    add-int/2addr v0, v3

    const v3, 0x1ac585

    add-int/2addr v0, v3

    move v11, v0

    goto/16 :goto_0

    :sswitch_23
    move v3, v6

    :cond_1e
    const-string v0, "\u06e1\u06e5\u06e2"

    invoke-static {v0}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v11, v0

    move v6, v3

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdbe3 -> :sswitch_0
        0xdbe8 -> :sswitch_d
        0xdc5f -> :sswitch_4
        0xdca0 -> :sswitch_13
        0x1aa700 -> :sswitch_11
        0x1aa71f -> :sswitch_5
        0x1aa7fe -> :sswitch_1a
        0x1aaae3 -> :sswitch_a
        0x1aab26 -> :sswitch_12
        0x1aab7e -> :sswitch_f
        0x1aabd9 -> :sswitch_2
        0x1aabdc -> :sswitch_1c
        0x1aaebf -> :sswitch_17
        0x1aaf3e -> :sswitch_16
        0x1aaf40 -> :sswitch_3
        0x1ab2bf -> :sswitch_15
        0x1ab2c5 -> :sswitch_b
        0x1ab342 -> :sswitch_c
        0x1ab35f -> :sswitch_18
        0x1ab702 -> :sswitch_19
        0x1ab9c5 -> :sswitch_6
        0x1abae3 -> :sswitch_7
        0x1abea5 -> :sswitch_9
        0x1ac14a -> :sswitch_10
        0x1ac14b -> :sswitch_1b
        0x1ac1e3 -> :sswitch_22
        0x1ac205 -> :sswitch_14
        0x1ac266 -> :sswitch_e
        0x1ac58b -> :sswitch_1f
        0x1ac5ab -> :sswitch_1
        0x1ac5c3 -> :sswitch_21
        0x1ac5c7 -> :sswitch_8
        0x1ac90f -> :sswitch_1e
        0x1ac92a -> :sswitch_1d
        0x1ac969 -> :sswitch_2
        0x1ac9e2 -> :sswitch_20
        0x1ac9e8 -> :sswitch_23
    .end sparse-switch
.end method
