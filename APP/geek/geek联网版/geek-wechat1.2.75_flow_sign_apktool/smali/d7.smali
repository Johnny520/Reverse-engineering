.class public final Ld7;
.super Landroid/view/View;


# instance fields
.field public final a:Landroid/graphics/Paint;

.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 5

    const/4 v1, 0x0

    const/4 v4, 0x1

    iput-object p2, p0, Ld7;->b:Ljava/lang/String;

    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const-string v0, "\u06e4\u06e8\u06e2"

    invoke-static {v0}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v3

    move-object v2, v1

    move-object v0, v1

    :goto_0
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    sget v1, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    if-gtz v1, :cond_6

    invoke-static {}, Landroidx/legacy/content/ۧۡ۠۠;->ۥۧۡۦ()I

    const-string v1, "\u06e4\u06e8"

    invoke-static {v1}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :sswitch_1
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    sget v2, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    if-ltz v2, :cond_0

    :cond_0
    const-string v2, "\u06e6\u06e8\u06e8"

    invoke-static {v2}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v3

    move-object v2, v1

    goto :goto_0

    :cond_1
    :sswitch_2
    sget v1, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v3, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    add-int/2addr v1, v3

    const v3, -0x1abfc1

    xor-int/2addr v1, v3

    move v3, v1

    goto :goto_0

    :sswitch_3
    const/high16 v1, 0x41600000    # 14.0f

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    invoke-static {v4, v1, v3}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v1

    float-to-int v1, v1

    int-to-float v1, v1

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    sget v1, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v3, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    xor-int/2addr v1, v3

    const v3, 0xde2e

    add-int/2addr v1, v3

    move v3, v1

    goto :goto_0

    :sswitch_4
    iput-object v2, p0, Ld7;->a:Landroid/graphics/Paint;

    invoke-static {}, Lio/fastkv/ۣ۟ۧۦۡ;->ۥۥۤۥ()I

    move-result v1

    if-ltz v1, :cond_2

    const/16 v1, 0x3d

    sput v1, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    const-string v1, "\u06e4\u06e1\u06e4"

    :goto_1
    invoke-static {v1}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :cond_2
    const-string v1, "\u06e0\u06e2\u06e2"

    goto :goto_1

    :sswitch_5
    sget v1, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v3, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    div-int/2addr v1, v3

    const v3, 0x1abae0

    add-int/2addr v1, v3

    move v3, v1

    goto :goto_0

    :sswitch_6
    const-string v0, "YAZbAY2w4jeQe8p7eIb"

    invoke-static {v0}, Landroidx/activity/result/۟۠۟۠ۦ;->ۢۡۥۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget v1, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v3, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    mul-int/lit16 v3, v3, -0x1ac4

    div-int/2addr v1, v3

    if-eqz v1, :cond_4

    const/16 v1, 0x58

    sput v1, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    :cond_3
    const-string v1, "\u06e0\u06df\u06e6"

    invoke-static {v1}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :cond_4
    sget v1, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v3, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    rem-int/2addr v1, v3

    const v3, 0x1ab361

    add-int/2addr v1, v3

    move v3, v1

    goto/16 :goto_0

    :sswitch_7
    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    sget v1, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    if-ltz v1, :cond_5

    :cond_5
    const-string v1, "\u06e0\u06e8\u06e2"

    invoke-static {v1}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :cond_6
    sget v1, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v3, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sub-int/2addr v1, v3

    const v3, 0x1abde5

    add-int/2addr v1, v3

    move v3, v1

    goto/16 :goto_0

    :sswitch_8
    const-string v1, "HQR4m5bIg6d4\n"

    const-string v3, "PjU53dCOxeE=\n"

    invoke-static {v1, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setColor(I)V

    sget v1, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v3, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    add-int/lit16 v3, v3, 0x260a

    sub-int/2addr v1, v3

    if-ltz v1, :cond_3

    const/16 v1, 0x11

    sput v1, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    const-string v1, "\u06e1\u06e4\u06e5"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :sswitch_9
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v1, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v3, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    add-int/lit16 v3, v3, -0xdd1

    rem-int/2addr v1, v3

    if-gtz v1, :cond_7

    const/16 v1, 0x27

    sput v1, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    :cond_7
    const-string v1, "\u06e5\u06e6\u06e8"

    invoke-static {v1}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۡۥۥۦ()I

    move-result v1

    if-ltz v1, :cond_1

    sget v1, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    if-gtz v1, :cond_8

    const-string v1, "\u06e0\u06e2\u06e2"

    invoke-static {v1}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :cond_8
    const-string v1, "\u06df\u06df\u06e8"

    goto/16 :goto_1

    :sswitch_b
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc84 -> :sswitch_0
        0x1aa708 -> :sswitch_6
        0x1aaac7 -> :sswitch_3
        0x1aab20 -> :sswitch_a
        0x1aabda -> :sswitch_4
        0x1aaf22 -> :sswitch_2
        0x1ab362 -> :sswitch_9
        0x1aba07 -> :sswitch_5
        0x1abade -> :sswitch_1
        0x1abe67 -> :sswitch_b
        0x1abe80 -> :sswitch_7
        0x1ac266 -> :sswitch_8
    .end sparse-switch
.end method


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 18

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v8, 0x0

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v10, 0x0

    const/4 v1, 0x0

    const-string v13, "\u06e6\u06e3\u06e8"

    invoke-static {v13}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v15

    move-object v13, v1

    move-object v14, v4

    :goto_0
    sparse-switch v15, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    mul-float v1, v12, v7

    cmpg-float v1, v10, v1

    if-gez v1, :cond_c

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۡۥۥۦ()I

    move-result v1

    if-ltz v1, :cond_2

    const-string v1, "\u06e3\u06e4\u06e8"

    invoke-static {v1}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v1

    move v15, v1

    move v6, v9

    goto :goto_0

    :sswitch_1
    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟ۧ۠ۧۢ()I

    move-result v1

    if-ltz v1, :cond_0

    const/16 v1, 0x5b

    sput v1, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    const-string v1, "\u06e7\u06e3\u06df"

    :goto_1
    invoke-static {v1}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v1

    move v15, v1

    goto :goto_0

    :cond_0
    sget v1, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v4, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    add-int/2addr v1, v4

    const v4, 0x1abdb9

    add-int/2addr v1, v4

    move v15, v1

    goto :goto_0

    :sswitch_2
    const/4 v1, 0x1

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/4 v4, 0x0

    const/4 v15, 0x0

    invoke-virtual {v2}, Landroid/graphics/Paint;->getTextSize()F

    move-result v16

    const/high16 v17, 0x3fc00000    # 1.5f

    mul-float v16, v16, v17

    sub-float v15, v15, v16

    sub-float/2addr v15, v10

    sub-float/2addr v4, v15

    move-object/from16 v0, p1

    invoke-virtual {v0, v1, v5, v4, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۥۥۢۧ()I

    move-result v1

    if-ltz v1, :cond_1

    const/16 v1, 0x4a

    sput v1, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    const-string v1, "\u06e5\u06e3\u06e4"

    invoke-static {v1}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v1

    move v15, v1

    goto :goto_0

    :cond_1
    const-string v1, "\u06e5\u06e1\u06e5"

    move v4, v7

    :goto_2
    invoke-static {v1}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v1

    move v15, v1

    move v7, v4

    goto :goto_0

    :cond_2
    move v6, v9

    :goto_3
    const-string v1, "\u06e1\u06e0\u06e6"

    invoke-static {v1}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v1

    move v15, v1

    goto :goto_0

    :sswitch_3
    sget v1, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v4, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    xor-int/lit16 v4, v4, -0x23e4

    rem-int/2addr v1, v4

    if-ltz v1, :cond_3

    const/16 v1, 0x63

    sput v1, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    const-string v1, "\u06e6\u06e6\u06e5"

    invoke-static {v1}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v1

    move v15, v1

    move v5, v6

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u06e5\u06e8\u06df"

    move-object v1, v2

    move v5, v6

    :goto_4
    invoke-static {v4}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v4

    move-object v2, v1

    move v15, v4

    goto/16 :goto_0

    :sswitch_4
    move-object/from16 v0, p0

    iget-object v1, v0, Ld7;->b:Ljava/lang/String;

    invoke-static {v1, v14}, Li50;->J(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    const/4 v1, 0x0

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    move-object/from16 v0, p1

    invoke-virtual {v0, v1, v5, v10, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    move-object v1, v2

    :cond_4
    const-string v2, "\u06e4\u06e1"

    move-object v4, v2

    goto :goto_4

    :sswitch_5
    neg-float v4, v11

    neg-float v1, v12

    sget v8, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v9, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    or-int/lit16 v9, v9, 0x5f9

    sub-int/2addr v8, v9

    if-gtz v8, :cond_7

    const/16 v8, 0x5b

    sput v8, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    const-string v8, "\u06e5\u06e1\u06e5"

    invoke-static {v8}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v15

    move v8, v1

    move v9, v4

    goto/16 :goto_0

    :sswitch_6
    sget v1, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    xor-int/lit16 v1, v1, 0x19f

    int-to-float v4, v1

    const/high16 v1, -0x3e100000    # -30.0f

    div-float v7, v11, v4

    div-float v15, v12, v4

    move-object/from16 v0, p1

    invoke-virtual {v0, v1, v7, v15}, Landroid/graphics/Canvas;->rotate(FFF)V

    invoke-static {}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۢۧۥ()I

    move-result v1

    if-ltz v1, :cond_5

    const/16 v1, 0x55

    sput v1, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    const-string v1, "\u06e5\u06e8\u06e2"

    goto/16 :goto_2

    :cond_5
    const-string v1, "\u06e3\u06e4\u06e8"

    invoke-static {v1}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v1

    move v15, v1

    move v7, v4

    goto/16 :goto_0

    :sswitch_7
    invoke-static {}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۧۡۥ۟()I

    move-result v1

    if-gtz v1, :cond_9

    const-string v1, "VEltOKU"

    invoke-static {v1}, L۟ۤۧۦۢ;->ۣ۠ۢۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    const-string v4, "\u06e7\u06e7\u06e0"

    invoke-static {v4}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v4

    move-object v13, v1

    move v15, v4

    goto/16 :goto_0

    :sswitch_8
    sget v1, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v4, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    rem-int/lit16 v4, v4, -0x216f

    div-int/2addr v1, v4

    if-gtz v1, :cond_6

    const-string v1, "\u06e2\u06e2\u06e5"

    invoke-static {v1}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v1

    move v15, v1

    goto/16 :goto_0

    :cond_6
    const-string v1, "\u06e5\u06e0\u06e2"

    move v4, v7

    goto/16 :goto_2

    :sswitch_9
    const-string v1, "+WF2pKLQ\n"

    const-string v4, "mgAY0sOj0HY=\n"

    invoke-static {v1, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v0, p1

    invoke-static {v1, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    sget v1, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v4, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    xor-int/lit16 v4, v4, 0x37d

    div-int/2addr v1, v4

    if-ltz v1, :cond_8

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۤ۟ۦ۟()I

    move v1, v8

    move v4, v9

    :cond_7
    const-string v8, "\u06e7\u06e5"

    invoke-static {v8}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v15

    move v8, v1

    move v9, v4

    goto/16 :goto_0

    :cond_8
    const-string v1, "\u06e4\u06e6\u06df"

    goto/16 :goto_1

    :cond_9
    :sswitch_a
    const-string v1, "\u06e0\u06e7\u06df"

    :goto_5
    invoke-static {v1}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v1

    move v15, v1

    goto/16 :goto_0

    :sswitch_b
    sget v1, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v4, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    or-int/lit16 v4, v4, -0x5fb

    div-int/2addr v1, v4

    if-ltz v1, :cond_a

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۤ۟ۦ۟()I

    const-string v1, "\u06e8\u06e5\u06e7"

    goto :goto_5

    :cond_a
    sget v1, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v4, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    div-int/2addr v1, v4

    const v4, 0xdc46

    xor-int/2addr v1, v4

    move v15, v1

    goto/16 :goto_0

    :sswitch_c
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v11, v1

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v12, v1

    sget v1, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v4, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    rem-int/lit16 v4, v4, 0xe1e

    xor-int/2addr v1, v4

    if-ltz v1, :cond_b

    const/16 v1, 0x53

    sput v1, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    const-string v1, "\u06e7\u06e6\u06e8"

    invoke-static {v1}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v1

    move v15, v1

    goto/16 :goto_0

    :cond_b
    const-string v1, "\u06e2\u06e2\u06e5"

    move-object v4, v1

    :goto_6
    invoke-static {v4}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v1

    move v15, v1

    goto/16 :goto_0

    :cond_c
    :sswitch_d
    sget v1, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v4, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    mul-int/2addr v1, v4

    const v4, 0x1c858a

    add-int/2addr v1, v4

    move v15, v1

    goto/16 :goto_0

    :sswitch_e
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v1

    const/4 v4, 0x1

    if-le v1, v4, :cond_f

    sget v1, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    if-gtz v1, :cond_13

    const/16 v1, 0x2d

    sput v1, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    move v1, v10

    :cond_d
    const-string v4, "\u06e8\u06e7\u06df"

    invoke-static {v4}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v4

    move v15, v4

    move v10, v1

    goto/16 :goto_0

    :sswitch_f
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    sget v4, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    xor-int/lit8 v4, v4, 0x1c

    const-string v14, "\n"

    aput-object v14, v1, v4

    sget v4, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v14, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    rem-int/2addr v4, v14

    const v14, 0x1ac379

    add-int/2addr v4, v14

    move-object v14, v1

    move v15, v4

    goto/16 :goto_0

    :sswitch_10
    invoke-static {}, Landroidx/core/widget/۟ۡۦۢۥ;->ۡۧۡۦ()I

    move-result v1

    if-ltz v1, :cond_e

    const/16 v1, 0x13

    sput v1, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    goto/16 :goto_3

    :cond_e
    const-string v1, "\u06e2\u06e4\u06e6"

    :goto_7
    invoke-static {v1}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v1

    move v15, v1

    goto/16 :goto_0

    :cond_f
    :sswitch_11
    sget v1, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v4, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    xor-int/lit16 v4, v4, 0x119e

    add-int/2addr v1, v4

    if-gtz v1, :cond_10

    const/16 v1, 0x17

    sput v1, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    const-string v1, "\u06e5\u06e3"

    goto :goto_7

    :cond_10
    const-string v1, "\u06e5\u06e1\u06e5"

    goto/16 :goto_5

    :sswitch_12
    sget v1, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v4, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    rem-int/2addr v1, v4

    const v4, 0x1abf0e

    add-int/2addr v1, v4

    move v15, v1

    goto/16 :goto_0

    :sswitch_13
    move-object v1, v2

    :cond_11
    sget v2, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v4, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    add-int/lit16 v4, v4, -0x105b

    rem-int/2addr v2, v4

    if-ltz v2, :cond_12

    const-string v2, "\u06e3\u06e5\u06e6"

    invoke-static {v2}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v4

    move-object v2, v1

    move v15, v4

    goto/16 :goto_0

    :cond_12
    sget v2, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v4, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    rem-int/2addr v2, v4

    const v4, 0x1ab139

    add-int/2addr v4, v2

    move-object v2, v1

    move v15, v4

    goto/16 :goto_0

    :sswitch_14
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v13}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v1, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v4, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    or-int/lit16 v4, v4, 0x2d5

    sub-int/2addr v1, v4

    if-ltz v1, :cond_14

    const/16 v1, 0x54

    sput v1, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    :cond_13
    const-string v1, "\u06e2\u06e0\u06e6"

    invoke-static {v1}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v1

    move v15, v1

    goto/16 :goto_0

    :cond_14
    sget v1, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v4, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    rem-int/2addr v1, v4

    const v4, 0x1aac76

    add-int/2addr v1, v4

    move v15, v1

    goto/16 :goto_0

    :sswitch_15
    sget v1, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v4, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    add-int/lit16 v4, v4, 0xedd

    rem-int/2addr v1, v4

    if-gtz v1, :cond_15

    invoke-static {}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۢۧۥ()I

    const-string v1, "\u06e0\u06e7\u06df"

    invoke-static {v1}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v1

    move v15, v1

    move v10, v8

    goto/16 :goto_0

    :cond_15
    sget v1, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v4, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    add-int/2addr v1, v4

    const v4, 0xda27

    add-int/2addr v1, v4

    move v15, v1

    move v10, v8

    goto/16 :goto_0

    :sswitch_16
    move-object/from16 v0, p0

    iget-object v1, v0, Ld7;->a:Landroid/graphics/Paint;

    mul-float v2, v11, v7

    cmpg-float v2, v5, v2

    if-gez v2, :cond_11

    sget v2, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    if-lez v2, :cond_4

    const-string v2, "\u06e5\u06e8\u06e2"

    move-object v4, v2

    goto/16 :goto_4

    :sswitch_17
    const/high16 v1, 0x40800000    # 4.0f

    sub-float v1, v10, v1

    invoke-virtual {v2}, Landroid/graphics/Paint;->getTextSize()F

    move-result v4

    const/high16 v10, 0x40a00000    # 5.0f

    mul-float/2addr v4, v10

    add-float/2addr v1, v4

    const/high16 v4, 0x40800000    # 4.0f

    add-float/2addr v1, v4

    sget v4, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v10, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    div-int/lit16 v10, v10, -0x1c60

    xor-int/2addr v4, v10

    if-gtz v4, :cond_d

    const-string v4, "\u06e6\u06e8\u06e6"

    move v10, v1

    goto/16 :goto_6

    :sswitch_18
    const/4 v1, 0x0

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v1

    const v4, 0x3fe66666    # 1.8f

    mul-float/2addr v1, v4

    const/4 v4, 0x0

    sub-float/2addr v4, v5

    sub-float v5, v1, v4

    sget v1, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v4, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    add-int/2addr v1, v4

    const v4, 0x1ab111

    add-int/2addr v1, v4

    move v15, v1

    goto/16 :goto_0

    :sswitch_19
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc46 -> :sswitch_0
        0xdc7d -> :sswitch_e
        0xdcde -> :sswitch_15
        0x1aabb8 -> :sswitch_19
        0x1aaea7 -> :sswitch_3
        0x1aaec1 -> :sswitch_7
        0x1aaf21 -> :sswitch_d
        0x1ab268 -> :sswitch_2
        0x1ab2a5 -> :sswitch_6
        0x1ab2a6 -> :sswitch_8
        0x1ab2e4 -> :sswitch_b
        0x1ab31b -> :sswitch_17
        0x1ab6a7 -> :sswitch_5
        0x1aba9d -> :sswitch_c
        0x1abd8d -> :sswitch_1
        0x1abda7 -> :sswitch_12
        0x1abdc9 -> :sswitch_18
        0x1abe06 -> :sswitch_a
        0x1abe9c -> :sswitch_16
        0x1abe9f -> :sswitch_f
        0x1ac1cb -> :sswitch_9
        0x1ac225 -> :sswitch_12
        0x1ac264 -> :sswitch_b
        0x1ac52b -> :sswitch_11
        0x1ac5a8 -> :sswitch_13
        0x1ac5e9 -> :sswitch_4
        0x1ac600 -> :sswitch_14
        0x1ac9c0 -> :sswitch_10
    .end sparse-switch
.end method
