.class public final synthetic Lin;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:I

.field public final b:Landroid/view/ViewGroup;

.field public final c:Lp00;


# direct methods
.method public synthetic constructor <init>(Landroid/view/ViewGroup;Lp00;I)V
    .locals 3

    iput p3, p0, Lin;->a:I

    iput-object p1, p0, Lin;->b:Landroid/view/ViewGroup;

    iput-object p2, p0, Lin;->c:Lp00;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    const-string v0, "\u06e2\u06e4\u06e6"

    invoke-static {v0}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    invoke-static {}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۤ۟۠ۢ()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۥۥۢۧ()I

    const-string v0, "\u06e4\u06e4\u06e5"

    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e0\u06e8\u06e5"

    invoke-static {v0}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_2
    sget v0, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v2, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    div-int/lit16 v2, v2, 0x21cb

    xor-int/2addr v0, v2

    if-gtz v0, :cond_1

    const/16 v0, 0x50

    sput v0, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    const-string v0, "\u06e5\u06e6\u06e1"

    :goto_1
    invoke-static {v0}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    sget v0, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v2, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sub-int/2addr v0, v2

    const v2, 0x1ab4b7

    add-int/2addr v0, v2

    goto :goto_0

    :sswitch_3
    const-string v0, "5b7fZiF4vUTPiXS"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟ۢۨۦۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v1

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۦۢۢۢ()I

    move-result v0

    if-gtz v0, :cond_2

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۧۡۥۦ()I

    const-string v0, "\u06e2\u06e4\u06e6"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_2
    sget v0, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v2, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    mul-int/2addr v0, v2

    const v2, -0x19263f

    xor-int/2addr v0, v2

    goto :goto_0

    :sswitch_4
    invoke-static {}, Landroidx/core/widget/۟ۡۦۢۥ;->ۡۧۡۦ()I

    move-result v0

    if-ltz v0, :cond_4

    sget v0, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v2, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    mul-int/lit16 v2, v2, 0x1e17

    mul-int/2addr v0, v2

    if-gtz v0, :cond_3

    invoke-static {}, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۡۥ()I

    const-string v0, "\u06e3\u06e8\u06e8"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_3
    sget v0, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v2, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    mul-int/2addr v0, v2

    const v2, 0x19676e

    add-int/2addr v0, v2

    goto/16 :goto_0

    :cond_4
    :sswitch_5
    const-string v0, "\u06e0\u06e8\u06e5"

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0x1aabdd -> :sswitch_0
        0x1ab2e4 -> :sswitch_4
        0x1ab723 -> :sswitch_1
        0x1aba65 -> :sswitch_5
        0x1abdc3 -> :sswitch_2
        0x1ac8e7 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 4

    const/4 v0, 0x0

    const-string v1, "\u06e4\u06e2\u06df"

    invoke-static {v1}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v3

    move-object v1, v0

    move-object v2, v0

    :goto_0
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :pswitch_0
    :sswitch_1
    sget v0, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v3, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sub-int/2addr v0, v3

    const v3, 0xe369

    add-int/2addr v0, v3

    move v3, v0

    goto :goto_0

    :sswitch_2
    iget-object v0, p0, Lin;->c:Lp00;

    iget-object v0, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    sget v2, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    if-gtz v2, :cond_0

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۦۢۢۢ()I

    :cond_0
    const-string v2, "\u06e4\u06e8\u06e1"

    invoke-static {v2}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v3

    move-object v2, v0

    goto :goto_0

    :sswitch_3
    iget-object v0, p0, Lin;->c:Lp00;

    iget-object v0, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    sget v1, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v3, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    or-int/lit16 v3, v3, 0x1a0c

    sub-int/2addr v1, v3

    if-ltz v1, :cond_1

    invoke-static {}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۧۡۥ۟()I

    const-string v1, "\u06e6\u06e4"

    invoke-static {v1}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v3

    move-object v1, v0

    goto :goto_0

    :cond_1
    sget v1, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v3, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    add-int/2addr v1, v3

    const v3, 0x1ac1d3

    add-int/2addr v3, v1

    move-object v1, v0

    goto :goto_0

    :sswitch_4
    iget v0, p0, Lin;->a:I

    packed-switch v0, :pswitch_data_0

    :sswitch_5
    sget v0, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v3, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    or-int/2addr v0, v3

    const v3, -0x1aaf0a

    xor-int/2addr v0, v3

    move v3, v0

    goto :goto_0

    :sswitch_6
    iget-object v0, p0, Lin;->b:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    sget v0, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v3, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    div-int/lit16 v3, v3, 0x1320

    or-int/2addr v0, v3

    if-gtz v0, :cond_3

    :cond_2
    const-string v0, "\u06e1\u06df"

    :goto_1
    invoke-static {v0}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e7\u06e8\u06e2"

    goto :goto_1

    :sswitch_7
    sget v0, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v3, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    mul-int/2addr v0, v3

    const v3, 0x20f8d3

    add-int/2addr v0, v3

    move v3, v0

    goto :goto_0

    :sswitch_8
    iget-object v0, p0, Lin;->b:Landroid/view/ViewGroup;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    sget v0, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v3, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    or-int/lit16 v3, v3, 0x1a67

    add-int/2addr v0, v3

    if-gtz v0, :cond_2

    const/16 v0, 0x3b

    sput v0, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    const-string v0, "\u06e7\u06e0"

    invoke-static {v0}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdc1e -> :sswitch_0
        0xdc23 -> :sswitch_1
        0xdcbe -> :sswitch_3
        0xdcd9 -> :sswitch_7
        0x1aabd9 -> :sswitch_5
        0x1aaea9 -> :sswitch_2
        0x1aba21 -> :sswitch_4
        0x1abadd -> :sswitch_8
        0x1abe27 -> :sswitch_6
        0x1ac621 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
