.class public final Lxs;
.super Landroid/view/ViewOutlineProvider;


# instance fields
.field public final a:F


# direct methods
.method public constructor <init>(F)V
    .locals 4

    iput p1, p0, Lxs;->a:F

    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

    const-wide/16 v2, 0x0

    const-string v0, "\u06e6\u06e8\u06e3"

    invoke-static {v0}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    sget v0, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v1, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    mul-int/2addr v0, v1

    const v1, -0x18e05b

    xor-int/2addr v0, v1

    goto :goto_0

    :sswitch_1
    sget v0, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v1, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    div-int/lit16 v1, v1, 0x1dbc

    or-int/2addr v0, v1

    if-ltz v0, :cond_1

    invoke-static {}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۟۟۟ۢ()I

    const-string v0, "\u06df\u06e3\u06e1"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    sget v0, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v1, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    or-int/2addr v0, v1

    const v1, 0x1ac2e4

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_2
    invoke-static {}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۤ۟۠ۢ()I

    move-result v0

    if-gtz v0, :cond_0

    sget v0, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v1, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    rem-int/lit16 v1, v1, -0xc45

    add-int/2addr v0, v1

    if-gtz v0, :cond_2

    const/16 v0, 0x21

    sput v0, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    const-string v0, "\u06e1\u06e4\u06e4"

    invoke-static {v0}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_2
    sget v0, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v1, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    add-int/2addr v0, v1

    const v1, 0x1aba1c

    xor-int/2addr v0, v1

    goto :goto_0

    :sswitch_3
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v2, v3}, Ljava/io/PrintStream;->println(J)V

    sget v0, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v1, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    mul-int/lit16 v1, v1, 0x7b4

    rem-int/2addr v0, v1

    if-gtz v0, :cond_3

    const-string v0, "\u06e6\u06e8\u06e3"

    invoke-static {v0}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_3
    sget v0, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v1, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    div-int/2addr v0, v1

    const v1, 0x1aaf62

    xor-int/2addr v0, v1

    goto :goto_0

    :sswitch_4
    const-string v0, "p5UaNM"

    invoke-static {v0}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۣ۠ۡۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    const-string v0, "\u06e2\u06e2\u06e1"

    goto :goto_1

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aaf21 -> :sswitch_0
        0x1aaf62 -> :sswitch_5
        0x1ab2a1 -> :sswitch_3
        0x1ab667 -> :sswitch_1
        0x1abac0 -> :sswitch_4
        0x1ac261 -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .locals 11

    const/4 v1, 0x0

    const/4 v8, 0x0

    const/4 v6, 0x0

    const-string v0, "\u06e0\u06e3\u06df"

    invoke-static {v0}, Landroidx/appcompat/app/۟۟ۥۨۤ;->ۤۤۡۡ(Ljava/lang/Object;)I

    move-result v0

    move v9, v1

    move v3, v0

    move v7, v8

    move v10, v8

    move v5, v8

    :goto_0
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->۟ۥۣۥۦ()I

    move-result v0

    if-gtz v0, :cond_c

    const-string v0, "\u06df\u06e8\u06e6"

    move v2, v7

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    move v7, v2

    goto :goto_0

    :sswitch_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-lt v0, v2, :cond_6

    sget v0, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v2, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    xor-int/lit16 v2, v2, 0x1029

    xor-int/2addr v0, v2

    if-ltz v0, :cond_0

    const/16 v0, 0x4b

    sput v0, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    const-string v0, "\u06e0\u06e3\u06df"

    invoke-static {v0}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06df\u06df\u06e1"

    invoke-static {v0}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :sswitch_2
    const/high16 v0, 0x40c00000    # 6.0f

    mul-float/2addr v0, v7

    float-to-int v0, v0

    invoke-virtual {p2, v1, v0}, Landroid/graphics/Outline;->offset(II)V

    invoke-static {}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟ۥۦۧۡ()I

    move-result v0

    if-ltz v0, :cond_2

    :cond_1
    const-string v0, "\u06e5\u06e7\u06e7"

    :goto_2
    invoke-static {v0}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e5\u06e7\u06df"

    :goto_3
    invoke-static {v0}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :sswitch_3
    const-string v0, "\u06e8\u06e7\u06e3"

    move v2, v7

    move v5, v8

    goto :goto_1

    :sswitch_4
    invoke-static {}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->ۤ۠ۡۧ()I

    move-result v0

    if-ltz v0, :cond_3

    invoke-static {}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟۠ۢۨۦ()I

    const-string v0, "\u06e8\u06e7\u06e3"

    goto :goto_3

    :cond_3
    sget v0, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v2, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sub-int/2addr v0, v2

    const v2, 0x1ac6d7

    add-int/2addr v0, v2

    move v3, v0

    goto :goto_0

    :sswitch_5
    const-string v0, "\u06e0\u06df\u06e6"

    invoke-static {v0}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :cond_4
    :sswitch_6
    sget v0, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v2, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    add-int/lit16 v2, v2, -0x1112

    mul-int/2addr v0, v2

    if-gtz v0, :cond_5

    const/16 v0, 0x3e

    sput v0, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    const-string v0, "\u06e4\u06e2\u06e4"

    :goto_4
    invoke-static {v0}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_5
    sget v0, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v2, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    add-int/2addr v0, v2

    const v2, 0x1ac235

    xor-int/2addr v0, v2

    move v3, v0

    goto/16 :goto_0

    :sswitch_7
    const-string v0, "\u06e0\u06e3\u06df"

    invoke-static {v0}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_6
    :sswitch_8
    const-string v0, "\u06e5\u06e7\u06df"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :sswitch_9
    const-string v0, "JL+X7w==\n"

    const-string v2, "UtbymPc3KlI=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    if-ltz v0, :cond_7

    const-string v0, "\u06e5\u06e3\u06e5"

    invoke-static {v0}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_7
    const-string v0, "\u06e2\u06e0\u06e0"

    goto :goto_2

    :sswitch_a
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    move-object v0, p2

    move v2, v1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    invoke-static {}, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۡۥ()I

    move-result v0

    if-gtz v0, :cond_8

    invoke-static {}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟ۥۦۧۡ()I

    const-string v0, "\u06df\u06e8"

    invoke-static {v0}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_8
    sget v0, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v2, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    add-int/2addr v0, v2

    const v2, -0x1abdbd

    xor-int/2addr v0, v2

    move v3, v0

    goto/16 :goto_0

    :sswitch_b
    sget v0, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v2, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    rem-int/2addr v0, v2

    const v2, 0x1aaa45

    add-int/2addr v0, v2

    move v3, v0

    move v5, v10

    goto/16 :goto_0

    :sswitch_c
    sget v0, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    if-gtz v0, :cond_1

    const/16 v0, 0xc

    sput v0, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    const-string v0, "\u06e7\u06e3\u06e5"

    invoke-static {v0}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :sswitch_d
    const-string v0, "\u06df\u06e8"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :sswitch_e
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۦۢۢۢ()I

    move-result v0

    if-gtz v0, :cond_9

    const/16 v0, 0x24

    sput v0, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    const-string v0, "\u06e6\u06df\u06e5"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_9
    const-string v0, "\u06e5\u06df"

    goto/16 :goto_4

    :sswitch_f
    move-object v0, v6

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    iget v0, v0, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    invoke-static {}, Landroidx/activity/result/۟۠۟۠ۦ;->۟ۢۡ۠()I

    move-result v2

    if-ltz v2, :cond_a

    const/16 v2, 0x1b

    sput v2, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    const-string v2, "\u06e2\u06e0\u06e0"

    invoke-static {v2}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v2

    move v9, v0

    move v3, v2

    goto/16 :goto_0

    :cond_a
    sget v2, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v3, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    rem-int/2addr v2, v3

    const v3, 0x1ac9a1

    add-int/2addr v2, v3

    move v9, v0

    move v3, v2

    goto/16 :goto_0

    :sswitch_10
    const-string v0, "bMJY3eW6hw==\n"

    const-string v2, "A7cssYzU4lg=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v2, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    xor-int/lit16 v2, v2, 0x1bca

    add-int/2addr v0, v2

    if-gtz v0, :cond_b

    invoke-static {}, Lۤۨۤۨ;->۟ۢۦۣۢ()I

    const-string v0, "\u06e5\u06e7\u06df"

    invoke-static {v0}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_b
    sget v0, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v2, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    div-int/2addr v0, v2

    const v2, 0x1ac623

    add-int/2addr v0, v2

    move v3, v0

    goto/16 :goto_0

    :sswitch_11
    const/high16 v0, 0x42c80000    # 100.0f

    mul-float v2, v0, v7

    sget v0, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v3, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    mul-int/2addr v0, v3

    const v3, -0x11e56a

    xor-int/2addr v0, v3

    move v3, v0

    move v10, v2

    goto/16 :goto_0

    :cond_c
    const-string v0, "\u06e8\u06e7\u06e8"

    goto/16 :goto_4

    :sswitch_12
    const-string v0, "8gtelJz7MGvyEUbY3v1xZv0NRtjI93Fr8xAflsn0PSXoB0KdnPk/Ye4RW5yS7zhh+xtG1vrqMGj5\nMlOB0+0lK9AfS5fJ7AFk7h9fiw==\n"

    const-string v2, "nH4y+LyYUQU=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v2, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    add-int/lit16 v2, v2, 0x1b49

    rem-int/2addr v0, v2

    if-gtz v0, :cond_d

    const/16 v0, 0x51

    sput v0, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    const-string v0, "\u06e8\u06e8\u06e8"

    invoke-static {v0}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_d
    const-string v0, "\u06e8\u06e8\u06e8"

    goto/16 :goto_3

    :sswitch_13
    if-lez v9, :cond_4

    sget v0, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v2, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    mul-int/lit16 v2, v2, 0xc8f

    sub-int/2addr v0, v2

    if-gtz v0, :cond_e

    const/16 v0, 0x17

    sput v0, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    const-string v0, "\u06e8\u06e7\u06e8"

    invoke-static {v0}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_e
    sget v0, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v2, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sub-int/2addr v0, v2

    const v2, 0x1ac7e7

    xor-int/2addr v0, v2

    move v3, v0

    goto/16 :goto_0

    :sswitch_14
    iget v2, p0, Lxs;->a:F

    sget v0, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    sget v3, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    rem-int/lit16 v3, v3, 0x1290

    sub-int/2addr v0, v3

    if-gtz v0, :cond_f

    const-string v0, "\u06df\u06e1\u06e5"

    invoke-static {v0}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    move v7, v2

    goto/16 :goto_0

    :cond_f
    const-string v0, "\u06e5\u06e3\u06e5"

    goto/16 :goto_1

    :sswitch_15
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdbe9 -> :sswitch_0
        0xdc41 -> :sswitch_5
        0xdc9a -> :sswitch_12
        0x1aa701 -> :sswitch_2
        0x1aa743 -> :sswitch_8
        0x1aaac7 -> :sswitch_d
        0x1aab3c -> :sswitch_9
        0x1ab262 -> :sswitch_10
        0x1ab266 -> :sswitch_b
        0x1aba86 -> :sswitch_6
        0x1abdad -> :sswitch_1
        0x1abe07 -> :sswitch_13
        0x1abe7d -> :sswitch_15
        0x1abe85 -> :sswitch_3
        0x1ac14c -> :sswitch_5
        0x1ac16e -> :sswitch_c
        0x1ac589 -> :sswitch_11
        0x1ac604 -> :sswitch_7
        0x1ac623 -> :sswitch_e
        0x1ac8cd -> :sswitch_0
        0x1ac8ec -> :sswitch_14
        0x1ac9c4 -> :sswitch_4
        0x1ac9c9 -> :sswitch_a
        0x1ac9e8 -> :sswitch_f
    .end sparse-switch
.end method
