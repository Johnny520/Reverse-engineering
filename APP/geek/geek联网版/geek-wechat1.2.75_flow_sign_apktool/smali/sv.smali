.class public final synthetic Lsv;
.super Ljava/lang/Object;

# interfaces
.implements Lum;


# instance fields
.field public final a:I

.field public final b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 3

    iput p2, p0, Lsv;->a:I

    iput-object p1, p0, Lsv;->b:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e7\u06e1\u06e8"

    invoke-static {v1}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "wdW29zb5aa857Jv"

    invoke-static {v0}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟۠ۨۤۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {}, Landroidx/activity/۟ۥۥۧ۠;->۟ۥۥۤ۟()I

    move-result v1

    if-ltz v1, :cond_3

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟ۧ۠ۧۢ()I

    :cond_0
    const-string v1, "\u06e1\u06e3\u06e6"

    invoke-static {v1}, Landroidx/appcompat/app/۟۟ۥۨۤ;->ۤۤۡۡ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_1
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v1, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sub-int/2addr v1, v2

    const v2, 0x1ac65e

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_2
    sget v1, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v2, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    div-int/lit16 v2, v2, -0x250a

    xor-int/2addr v1, v2

    if-ltz v1, :cond_1

    const/16 v1, 0x31

    sput v1, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    const-string v1, "\u06e3\u06e0\u06e0"

    :goto_1
    invoke-static {v1}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    const-string v1, "\u06e7\u06e1\u06e8"

    goto :goto_1

    :sswitch_3
    invoke-static {}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟۠ۢۢ۠()I

    move-result v1

    if-gez v1, :cond_0

    :sswitch_4
    sget v1, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v2, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    mul-int/lit16 v2, v2, -0x19d5

    or-int/2addr v1, v2

    if-ltz v1, :cond_2

    const/16 v1, 0x5a

    sput v1, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    const-string v1, "\u06e0\u06e6\u06e5"

    :goto_2
    invoke-static {v1}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    const-string v1, "\u06e8\u06e3\u06e4"

    goto :goto_2

    :cond_3
    sget v1, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v2, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    div-int/2addr v1, v2

    const v2, 0x1ab343

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aaf04 -> :sswitch_0
        0x1ab33b -> :sswitch_4
        0x1ab342 -> :sswitch_1
        0x1ab649 -> :sswitch_2
        0x1ac54e -> :sswitch_3
        0x1ac949 -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const-string v0, "\u06e8\u06e1\u06e7"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v1, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    rem-int/2addr v0, v1

    const v1, -0x1ac92d

    xor-int/2addr v0, v1

    goto :goto_0

    :pswitch_0
    :sswitch_1
    sget v0, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v1, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    xor-int/lit16 v1, v1, 0x21e5

    or-int/2addr v0, v1

    if-ltz v0, :cond_0

    invoke-static {}, Landroid/window/۟ۤ۟ۡۧ;->ۢۦۣۨ()I

    const-string v0, "\u06e4\u06e1\u06e2"

    invoke-static {v0}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v1, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    mul-int/2addr v0, v1

    const v1, 0x11be3a

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_2
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iget-object v1, p0, Lsv;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    :goto_1
    return-object v0

    :sswitch_3
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lsv;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_1

    :sswitch_4
    iget v0, p0, Lsv;->a:I

    packed-switch v0, :pswitch_data_0

    :sswitch_5
    invoke-static {}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟۠ۢۢ۠()I

    move-result v0

    if-ltz v0, :cond_1

    const-string v0, "\u06e1\u06e7\u06e0"

    :goto_2
    invoke-static {v0}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e1\u06e8\u06e7"

    goto :goto_2

    :sswitch_data_0
    .sparse-switch
        0xdbe4 -> :sswitch_0
        0xdcc0 -> :sswitch_5
        0x1aa7ba -> :sswitch_3
        0x1aafa0 -> :sswitch_2
        0x1ac510 -> :sswitch_1
        0x1ac90e -> :sswitch_4
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
