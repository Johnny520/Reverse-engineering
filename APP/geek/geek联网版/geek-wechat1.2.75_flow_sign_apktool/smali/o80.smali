.class public final synthetic Lo80;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final a:Lm00;

.field public final b:Lm00;

.field public final c:Ll00;

.field public final d:Ljm;


# direct methods
.method public synthetic constructor <init>(Lm00;Lm00;Ll00;Ljm;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    const-string v0, "\u06e2\u06e8\u06e7"

    invoke-static {v0}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(F)V

    invoke-static {}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->۟ۦۥۨ۠()I

    move-result v0

    if-ltz v0, :cond_5

    const-string v0, "\u06e0\u06df\u06e0"

    :goto_1
    invoke-static {v0}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    iput-object p1, p0, Lo80;->a:Lm00;

    invoke-static {}, Lۤۨۤۨ;->۟ۢۦۣۢ()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {}, Landroidx/startup/ۣۣۡ۟;->۠ۢۢۧ()I

    const-string v0, "\u06e8\u06e3\u06e0"

    invoke-static {v0}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v2, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    div-int/2addr v0, v2

    const v2, 0x1aaac1

    add-int/2addr v0, v2

    goto :goto_0

    :sswitch_2
    iput-object p2, p0, Lo80;->b:Lm00;

    sget v0, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v2, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    rem-int/lit16 v2, v2, -0x366

    xor-int/2addr v0, v2

    if-ltz v0, :cond_1

    const-string v0, "\u06e2\u06e8\u06e7"

    invoke-static {v0}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠ۡۤ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    sget v0, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v2, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    or-int/2addr v0, v2

    const v2, 0x1aaee4

    add-int/2addr v0, v2

    goto :goto_0

    :sswitch_3
    iput-object p4, p0, Lo80;->d:Ljm;

    sget v0, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v2, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sub-int/2addr v0, v2

    const v2, 0x1aaa50

    add-int/2addr v0, v2

    goto :goto_0

    :sswitch_4
    sget v0, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v2, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    add-int/lit16 v2, v2, 0x19d

    add-int/2addr v0, v2

    if-gtz v0, :cond_2

    const/16 v0, 0x32

    sput v0, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    const-string v0, "\u06e2\u06e4\u06df"

    invoke-static {v0}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_2
    sget v0, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v2, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    or-int/2addr v0, v2

    const v2, -0x1ab302

    xor-int/2addr v0, v2

    goto :goto_0

    :sswitch_5
    invoke-static {}, Lkotlinx/coroutines/ۤۢۢۥ;->ۡ۠ۥۡ()I

    move-result v0

    if-ltz v0, :cond_3

    sget v0, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sget v2, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    or-int/2addr v0, v2

    const v2, 0x1abfaa

    add-int/2addr v0, v2

    goto/16 :goto_0

    :cond_3
    :sswitch_6
    sget v0, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v2, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    add-int/lit16 v2, v2, 0xd4a

    rem-int/2addr v0, v2

    if-gtz v0, :cond_4

    const/16 v0, 0x58

    sput v0, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    const-string v0, "\u06e6\u06e5\u06e3"

    invoke-static {v0}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_4
    const-string v0, "\u06e8\u06e3\u06e0"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :sswitch_7
    iput-object p3, p0, Lo80;->c:Ll00;

    const-string v0, "\u06e8\u06e5\u06e3"

    invoke-static {v0}, Landroidx/appcompat/app/۟۟ۥۨۤ;->ۤۤۡۡ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06e8\u06e3\u06e0"

    goto/16 :goto_1

    :sswitch_8
    const-string v0, "P2Szw"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟۟ۡ۟ۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    sget v0, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v2, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    add-int/2addr v0, v2

    const v2, 0xdd7d

    add-int/2addr v0, v2

    goto/16 :goto_0

    :sswitch_9
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdcbe -> :sswitch_0
        0x1aa781 -> :sswitch_4
        0x1aaac1 -> :sswitch_2
        0x1aaac4 -> :sswitch_5
        0x1aab61 -> :sswitch_7
        0x1ab361 -> :sswitch_1
        0x1ac1a9 -> :sswitch_8
        0x1ac1c2 -> :sswitch_6
        0x1ac945 -> :sswitch_9
        0x1ac986 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 12

    const/high16 v11, 0x40000000    # 2.0f

    const/4 v4, 0x0

    const/4 v10, 0x1

    const/4 v8, 0x0

    const/high16 v9, 0x40a00000    # 5.0f

    const/4 v1, 0x0

    const-string v0, "\u06df\u06e8\u06e2"

    invoke-static {v0}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v7

    move-object v5, v4

    move-object v0, v4

    move-object v6, v4

    move v2, v8

    move v3, v8

    :goto_0
    sparse-switch v7, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    sget v4, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v7, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    xor-int/lit16 v7, v7, -0xdad

    rem-int/2addr v4, v7

    if-ltz v4, :cond_11

    const-string v4, "\u06e6\u06e7\u06df"

    :goto_1
    invoke-static {v4}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v4

    move v7, v4

    goto :goto_0

    :sswitch_1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v1

    iget-object v0, p0, Lo80;->a:Lm00;

    sget v4, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    if-gtz v4, :cond_2

    :cond_1
    const-string v4, "\u06e3\u06e8\u06e3"

    invoke-static {v4}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v4

    move v7, v4

    goto :goto_0

    :cond_2
    const-string v4, "\u06df\u06e8\u06e4"

    goto :goto_1

    :sswitch_2
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v4

    iput v4, v6, Lm00;->a:F

    invoke-static {}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۨۧ۟ۤ()I

    move-result v4

    if-ltz v4, :cond_3

    invoke-static {}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۧۧۥۦ()I

    const-string v4, "\u06e2\u06df\u06e1"

    :goto_2
    invoke-static {v4}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v4

    move v7, v4

    goto :goto_0

    :cond_3
    const-string v4, "\u06e5\u06e1\u06e2"

    :goto_3
    invoke-static {v4}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v4

    move v7, v4

    goto :goto_0

    :cond_4
    :sswitch_3
    invoke-static {}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣۢ۠۠()I

    move-result v4

    if-gtz v4, :cond_5

    const/16 v4, 0x5f

    sput v4, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    const-string v4, "\u06e4\u06e7\u06e3"

    :goto_4
    invoke-static {v4}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v4

    move v7, v4

    goto :goto_0

    :cond_5
    const-string v4, "\u06e2\u06e0\u06e5"

    goto :goto_4

    :sswitch_4
    invoke-static {}, Landroid/window/ۣۤ۠ۢ;->ۧۢۦ۟()I

    move-result v4

    if-gtz v4, :cond_6

    const-string v4, "\u06e6\u06e1\u06e3"

    invoke-static {v4}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v4

    move v7, v4

    goto :goto_0

    :cond_6
    sget v4, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v7, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    add-int/2addr v4, v7

    const v7, 0x1abd55

    add-int/2addr v4, v7

    move v7, v4

    goto :goto_0

    :sswitch_5
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v4

    cmpl-float v4, v4, v9

    if-gtz v4, :cond_4

    const-string v4, "\u06e2\u06e2\u06e8"

    :goto_5
    invoke-static {v4}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v4

    move v7, v4

    goto/16 :goto_0

    :sswitch_6
    const-string v4, "\u06e2\u06e0"

    :goto_6
    invoke-static {v4}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v4

    move v7, v4

    goto/16 :goto_0

    :cond_7
    :sswitch_7
    sget v4, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v7, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    xor-int/lit16 v7, v7, 0xefc

    add-int/2addr v4, v7

    if-ltz v4, :cond_8

    const/16 v4, 0x5b

    sput v4, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    const-string v4, "\u06e4\u06e2\u06e7"

    goto :goto_6

    :cond_8
    sget v4, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v7, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    rem-int/2addr v4, v7

    const v7, 0x1ac2a8

    add-int/2addr v4, v7

    move v7, v4

    goto/16 :goto_0

    :sswitch_8
    iget-object v6, p0, Lo80;->b:Lm00;

    iget-object v4, p0, Lo80;->c:Ll00;

    sget v5, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v7, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    xor-int/lit16 v7, v7, 0xe8a

    or-int/2addr v5, v7

    if-ltz v5, :cond_9

    invoke-static {}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۣۣ۟ۥ۟()I

    const-string v5, "\u06e0\u06e8\u06e0"

    invoke-static {v5}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v7

    move-object v5, v4

    goto/16 :goto_0

    :cond_9
    sget v5, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v7, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    or-int/2addr v5, v7

    const v7, 0x1abc3d

    xor-int/2addr v7, v5

    move-object v5, v4

    goto/16 :goto_0

    :sswitch_9
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v4

    cmpl-float v4, v4, v9

    if-lez v4, :cond_0

    const-string v4, "\u06e2\u06e0\u06e5"

    invoke-static {v4}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v4

    move v7, v4

    goto/16 :goto_0

    :sswitch_a
    iput-boolean v10, v5, Ll00;->a:Z

    invoke-virtual {p1}, Landroid/view/View;->getX()F

    move-result v4

    add-float/2addr v4, v9

    add-float/2addr v4, v2

    sub-float/2addr v4, v9

    invoke-virtual {p1, v4}, Landroid/view/View;->setX(F)V

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۦۢۢۢ()I

    move-result v4

    if-gtz v4, :cond_c

    const/16 v4, 0xb

    sput v4, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    const-string v4, "\u06e7\u06e3\u06e1"

    invoke-static {v4}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v4

    move v7, v4

    goto/16 :goto_0

    :sswitch_b
    if-eqz v1, :cond_e

    if-eq v1, v10, :cond_7

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۡۥۥۦ()I

    move-result v4

    if-ltz v4, :cond_a

    const/16 v4, 0x25

    sput v4, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    :goto_7
    const-string v4, "\u06e1\u06e8\u06e2"

    invoke-static {v4}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v4

    move v7, v4

    goto/16 :goto_0

    :cond_a
    sget v4, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v7, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sub-int/2addr v4, v7

    const v7, 0x1abeda

    add-int/2addr v4, v7

    move v7, v4

    goto/16 :goto_0

    :sswitch_c
    const/4 v4, 0x2

    if-eq v1, v4, :cond_13

    sget v4, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v7, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sub-int/2addr v4, v7

    const v7, 0x1abef7

    add-int/2addr v4, v7

    move v7, v4

    goto/16 :goto_0

    :sswitch_d
    invoke-virtual {p1}, Landroid/view/View;->getY()F

    move-result v4

    sub-float v4, v8, v4

    sub-float v4, v3, v4

    invoke-virtual {p1, v4}, Landroid/view/View;->setY(F)V

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v4

    iput v4, v0, Lm00;->a:F

    sget v4, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v7, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    div-int/lit16 v7, v7, 0xace

    or-int/2addr v4, v7

    if-ltz v4, :cond_b

    const-string v4, "\u06e2\u06df\u06e4"

    invoke-static {v4}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v4

    move v7, v4

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06df\u06e5\u06e3"

    goto/16 :goto_2

    :sswitch_e
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v4

    iput v4, v0, Lm00;->a:F

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v4

    iput v4, v6, Lm00;->a:F

    invoke-static {}, Landroidx/activity/result/۟ۡۧ۠ۥ;->۟ۥۥۧ۟()I

    move-result v4

    if-gtz v4, :cond_d

    invoke-static {}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟۠ۢۨۦ()I

    :cond_c
    const-string v4, "\u06e0\u06e6\u06e5"

    invoke-static {v4}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v4

    move v7, v4

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u06e2\u06df\u06e4"

    goto/16 :goto_3

    :cond_e
    :sswitch_f
    sget v4, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    if-ltz v4, :cond_f

    const-string v4, "\u06e2\u06e3\u06e1"

    goto/16 :goto_5

    :cond_f
    sget v4, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v7, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    rem-int/2addr v4, v7

    const v7, 0x1ab89c

    add-int/2addr v4, v7

    move v7, v4

    goto/16 :goto_0

    :sswitch_10
    const/4 v4, 0x0

    iput-boolean v4, v5, Ll00;->a:Z

    sget v4, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    if-ltz v4, :cond_10

    const-string v4, "\u06e3\u06e4\u06e4"

    goto/16 :goto_3

    :cond_10
    const-string v4, "\u06e5\u06e1\u06e3"

    goto/16 :goto_6

    :sswitch_11
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v2

    add-float/2addr v2, v11

    iget v3, v0, Lm00;->a:F

    sub-float/2addr v2, v3

    sub-float/2addr v2, v11

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v3

    const/high16 v4, 0x41300000    # 11.0f

    sub-float/2addr v3, v4

    iget v4, v6, Lm00;->a:F

    sub-float/2addr v3, v4

    const/high16 v4, 0x41300000    # 11.0f

    add-float/2addr v3, v4

    invoke-static {}, Landroidx/activity/result/۟ۡۧ۠ۥ;->۟ۥۥۧ۟()I

    move-result v4

    if-gtz v4, :cond_1

    invoke-static {}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->ۤ۠ۡۧ()I

    const-string v4, "\u06e7\u06e3\u06e5"

    invoke-static {v4}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v4

    move v7, v4

    goto/16 :goto_0

    :sswitch_12
    iget-boolean v4, v5, Ll00;->a:Z

    if-nez v4, :cond_0

    iget-object v4, p0, Lo80;->d:Ljm;

    invoke-interface {v4}, Ljm;->a()Ljava/lang/Object;

    goto/16 :goto_7

    :cond_11
    const-string v4, "\u06e5\u06e1\u06e3"

    goto/16 :goto_4

    :sswitch_13
    sget v4, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v7, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    mul-int/lit16 v7, v7, 0x63c

    rem-int/2addr v4, v7

    if-ltz v4, :cond_12

    invoke-static {}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->ۤ۠ۡۧ()I

    const-string v4, "\u06e4\u06e8\u06e4"

    invoke-static {v4}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v4

    move v7, v4

    goto/16 :goto_0

    :cond_12
    sget v4, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v7, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    rem-int/2addr v4, v7

    const v7, 0x1aa88e

    add-int/2addr v4, v7

    move v7, v4

    goto/16 :goto_0

    :cond_13
    :sswitch_14
    invoke-static {}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۥۥۢۧ()I

    move-result v4

    if-ltz v4, :cond_14

    invoke-static {}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۦۥۨۦ()I

    const-string v4, "\u06df\u06e8\u06e6"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v4

    move v7, v4

    goto/16 :goto_0

    :cond_14
    sget v4, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v7, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    or-int/2addr v4, v7

    const v7, 0x1aafd8

    add-int/2addr v4, v7

    move v7, v4

    goto/16 :goto_0

    :sswitch_15
    sget v4, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v7, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    xor-int/lit16 v7, v7, 0xd08

    div-int/2addr v4, v7

    if-eqz v4, :cond_15

    const/16 v4, 0x50

    sput v4, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    const-string v4, "\u06df\u06e5\u06e3"

    invoke-static {v4}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v4

    move v7, v4

    goto/16 :goto_0

    :cond_15
    sget v4, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v7, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    div-int/2addr v4, v7

    const v7, 0x1aa7de

    xor-int/2addr v4, v7

    move v7, v4

    goto/16 :goto_0

    :sswitch_16
    return v10

    :sswitch_data_0
    .sparse-switch
        0xdc3e -> :sswitch_0
        0x1aa727 -> :sswitch_13
        0x1aa7bd -> :sswitch_2
        0x1aa7de -> :sswitch_0
        0x1aa819 -> :sswitch_1
        0x1aa81b -> :sswitch_8
        0x1aab9f -> :sswitch_d
        0x1aabd8 -> :sswitch_14
        0x1aaea5 -> :sswitch_11
        0x1aaf9b -> :sswitch_4
        0x1ab244 -> :sswitch_3
        0x1ab247 -> :sswitch_10
        0x1ab267 -> :sswitch_a
        0x1ab2a8 -> :sswitch_9
        0x1ab6a3 -> :sswitch_e
        0x1ab71e -> :sswitch_5
        0x1aba64 -> :sswitch_7
        0x1abdc6 -> :sswitch_15
        0x1abdc7 -> :sswitch_16
        0x1abe42 -> :sswitch_b
        0x1ac149 -> :sswitch_6
        0x1ac188 -> :sswitch_12
        0x1ac1a7 -> :sswitch_0
        0x1ac510 -> :sswitch_f
        0x1ac585 -> :sswitch_c
        0x1ac589 -> :sswitch_0
    .end sparse-switch
.end method
