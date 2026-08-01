.class public final Lha;
.super Landroid/widget/FrameLayout;


# instance fields
.field public final a:I


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 3

    iput p2, p0, Lha;->a:I

    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    const-string v1, "\u06e5\u06e7\u06e2"

    invoke-static {v1}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "XcXKtMRxdA0o3kDSi"

    invoke-static {v0}, Landroidx/appcompat/app/۟۟ۥۨۤ;->۟ۥۤ۟ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget v1, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v2, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    or-int/lit16 v2, v2, 0x47d

    xor-int/2addr v1, v2

    if-gtz v1, :cond_2

    const-string v1, "\u06e1\u06e8\u06e7"

    invoke-static {v1}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :sswitch_1
    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟ۡۡۦ()I

    move-result v0

    if-gtz v0, :cond_1

    sget v0, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v2, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    or-int/lit16 v2, v2, -0x25c0

    rem-int/2addr v0, v2

    if-gtz v0, :cond_0

    const/16 v0, 0x4d

    sput v0, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    const-string v0, "\u06e4\u06e2\u06e0"

    invoke-static {v0}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    sget v0, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sget v2, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    add-int/2addr v0, v2

    const v2, 0x1aa441

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :cond_1
    :sswitch_2
    sget v0, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v2, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    add-int/2addr v0, v2

    const v2, 0x1ab28e

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :cond_2
    sget v1, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    sget v2, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    div-int/2addr v1, v2

    const v2, 0x1aba22

    xor-int/2addr v2, v1

    move-object v1, v0

    goto :goto_0

    :sswitch_3
    sget v0, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v2, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    xor-int/lit16 v2, v2, -0x1cd9

    or-int/2addr v0, v2

    if-ltz v0, :cond_3

    const/16 v0, 0x39

    sput v0, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    const-string v0, "\u06e1\u06e8\u06e3"

    :goto_1
    invoke-static {v0}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_3
    sget v0, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v2, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    xor-int/2addr v0, v2

    const v2, 0x1abc28

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_4
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    const-string v0, "\u06e1\u06e8\u06e7"

    goto :goto_1

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa7a0 -> :sswitch_0
        0x1aafa0 -> :sswitch_5
        0x1ab35e -> :sswitch_2
        0x1aba22 -> :sswitch_4
        0x1abe80 -> :sswitch_1
        0x1ac9a5 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final onMeasure(II)V
    .locals 7

    const/4 v0, 0x0

    const-string v1, "\u06e3\u06e8\u06e3"

    invoke-static {v1}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v5

    move v1, v0

    move v3, v0

    move v4, v0

    move v2, v0

    move v6, v0

    :goto_0
    sparse-switch v5, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    if-le v3, v1, :cond_6

    invoke-static {}, Landroidx/core/content/ۣۧۡۤ;->۟ۦۦ۠ۡ()I

    move-result v0

    if-ltz v0, :cond_5

    const-string v0, "\u06e2\u06e6\u06e2"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto :goto_0

    :sswitch_1
    invoke-super {p0, p1, v6}, Landroid/widget/FrameLayout;->onMeasure(II)V

    invoke-static {}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟۠ۢۨۦ()I

    move-result v0

    if-gtz v0, :cond_0

    const/16 v0, 0x39

    sput v0, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    const-string v0, "\u06e3\u06e8\u06e3"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto :goto_0

    :cond_0
    sget v0, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v5, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    add-int/2addr v0, v5

    const v5, -0x1ab067

    xor-int/2addr v0, v5

    move v5, v0

    goto :goto_0

    :sswitch_2
    const v0, -0x7fffffa1

    sget v4, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    xor-int/2addr v0, v4

    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    const-string v4, "\u06df\u06e0\u06df"

    invoke-static {v4}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v5

    move v4, v0

    goto :goto_0

    :sswitch_3
    sget v0, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sget v5, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sub-int/2addr v0, v5

    const v5, 0x1aca51

    add-int/2addr v0, v5

    move v5, v0

    move v6, v4

    goto :goto_0

    :sswitch_4
    iget v1, p0, Lha;->a:I

    sget v0, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    if-gtz v0, :cond_1

    const-string v0, "\u06df\u06e0\u06e6"

    invoke-static {v0}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e7\u06df\u06e2"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto :goto_0

    :sswitch_5
    sget v0, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v2, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    add-int/lit16 v2, v2, -0x2058

    sub-int/2addr v0, v2

    if-gtz v0, :cond_2

    const/16 v0, 0x36

    sput v0, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    const-string v0, "\u06e2\u06e7\u06e0"

    move v2, p2

    goto :goto_1

    :cond_2
    const-string v0, "\u06e7\u06e8\u06e1"

    move v2, p2

    :goto_2
    invoke-static {v0}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto/16 :goto_0

    :sswitch_6
    sget v0, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v5, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    xor-int/lit16 v5, v5, 0x5d3

    or-int/2addr v0, v5

    if-ltz v0, :cond_3

    const/16 v0, 0x22

    sput v0, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    const-string v0, "\u06e7\u06e8\u06e1"

    invoke-static {v0}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    move v6, v2

    goto/16 :goto_0

    :cond_3
    const-string v0, "\u06e8\u06e0"

    invoke-static {v0}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    move v6, v2

    goto/16 :goto_0

    :sswitch_7
    invoke-static {v2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    sget v3, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    if-ltz v3, :cond_4

    const/16 v3, 0x3f

    sput v3, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    const-string v3, "\u06e7\u06df\u06e2"

    invoke-static {v3}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v5

    move v3, v0

    goto/16 :goto_0

    :cond_4
    sget v3, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v5, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    xor-int/2addr v3, v5

    const v5, -0x1aa5db

    xor-int/2addr v5, v3

    move v3, v0

    goto/16 :goto_0

    :cond_5
    sget v0, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v5, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    rem-int/2addr v0, v5

    const v5, 0x1aa794

    add-int/2addr v0, v5

    move v5, v0

    goto/16 :goto_0

    :cond_6
    :sswitch_8
    invoke-static {}, Lcom/google/android/material/carousel/۠۟ۧۤ;->۟ۡۡۨۥ()I

    move-result v0

    if-gtz v0, :cond_7

    const-string v0, "\u06e4\u06df\u06e5"

    invoke-static {v0}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto/16 :goto_0

    :cond_7
    sget v0, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v5, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    div-int/2addr v0, v5

    const v5, 0x1ac85c

    xor-int/2addr v0, v5

    move v5, v0

    goto/16 :goto_0

    :sswitch_9
    sget v0, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v5, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    mul-int/lit16 v5, v5, 0x210e

    mul-int/2addr v0, v5

    if-ltz v0, :cond_8

    const-string v0, "\u06e0\u06df\u06e7"

    goto :goto_2

    :cond_8
    const-string v0, "\u06e3\u06e8\u06e3"

    goto :goto_2

    :sswitch_a
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdcf8 -> :sswitch_0
        0x1aa71e -> :sswitch_3
        0x1aa725 -> :sswitch_4
        0x1aa7fc -> :sswitch_2
        0x1ab31e -> :sswitch_a
        0x1ab33b -> :sswitch_8
        0x1ab6c2 -> :sswitch_9
        0x1ab71e -> :sswitch_5
        0x1ac50a -> :sswitch_6
        0x1ac620 -> :sswitch_7
        0x1ac8ea -> :sswitch_1
    .end sparse-switch
.end method
