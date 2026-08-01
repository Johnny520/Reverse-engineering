.class public final synthetic Lds;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:I

.field public final b:Landroid/widget/ScrollView;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/ScrollView;I)V
    .locals 3

    iput p2, p0, Lds;->a:I

    iput-object p1, p0, Lds;->b:Landroid/widget/ScrollView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06df\u06df\u06e1"

    invoke-static {v1}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۨۧ۟ۤ()I

    move-result v1

    if-ltz v1, :cond_3

    invoke-static {}, Landroid/window/ۣۧ۟۠;->ۣۡ۟ۢ()I

    move-result v1

    if-gtz v1, :cond_0

    invoke-static {}, Landroidx/activity/۟ۥۥۧ۠;->۟ۥۥۤ۟()I

    const-string v1, "\u06e7\u06e7\u06e0"

    invoke-static {v1}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_1
    const-string v0, "pjDlcDRNEQEPpv08Hwh71j"

    invoke-static {v0}, Landroidx/legacy/content/ۧۡ۠۠;->ۣۢۤ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟۠ۢۨۦ()I

    move-result v1

    if-gtz v1, :cond_1

    invoke-static {}, Landroid/window/ۣۤ۠ۢ;->ۧۢۦ۟()I

    :cond_0
    const-string v1, "\u06e7\u06df\u06e6"

    invoke-static {v1}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    sget v1, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sget v2, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    rem-int/2addr v1, v2

    const v2, -0x1ac171

    xor-int/2addr v1, v2

    goto :goto_0

    :sswitch_2
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    invoke-static {}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->۟ۢ۟ۥۣ()I

    move-result v1

    if-ltz v1, :cond_2

    const-string v1, "\u06e6\u06e3\u06e3"

    invoke-static {v1}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    const-string v1, "\u06e1\u06e4\u06e2"

    :goto_1
    invoke-static {v1}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_3
    :sswitch_3
    const-string v1, "\u06e1\u06e4\u06e2"

    goto :goto_1

    :sswitch_4
    invoke-static {}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟۠ۢۨۦ()I

    move-result v1

    if-gtz v1, :cond_4

    invoke-static {}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟۠ۢۢ۠()I

    const-string v1, "\u06e0\u06e1\u06df"

    goto :goto_1

    :cond_4
    const-string v1, "\u06df\u06df\u06e1"

    goto :goto_1

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa701 -> :sswitch_0
        0x1aaf1f -> :sswitch_5
        0x1ac146 -> :sswitch_4
        0x1ac1c6 -> :sswitch_2
        0x1ac50e -> :sswitch_1
        0x1ac600 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 3

    const/4 v1, 0x0

    const-string v0, "\u06e3\u06e5\u06e6"

    invoke-static {v0}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    iget v0, p0, Lds;->a:I

    packed-switch v0, :pswitch_data_0

    :sswitch_2
    const-string v0, "\u06e7\u06e5\u06e6"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠ۡۤ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_3
    iget-object v0, p0, Lds;->b:Landroid/widget/ScrollView;

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    xor-int/lit16 v2, v2, -0xf2

    invoke-virtual {v0, v2}, Landroid/widget/ScrollView;->fullScroll(I)Z

    sget v0, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v2, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    rem-int/2addr v0, v2

    const v2, 0x1abee6

    xor-int/2addr v0, v2

    goto :goto_0

    :sswitch_4
    invoke-static {}, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۡۥ()I

    move-result v0

    if-gtz v0, :cond_1

    sget v0, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v2, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    rem-int/lit16 v2, v2, 0x26b1

    mul-int/2addr v0, v2

    if-gtz v0, :cond_0

    invoke-static {}, Lio/fastkv/ۣ۟ۧۦۡ;->ۥۥۤۥ()I

    const-string v0, "\u06e3\u06e2\u06e3"

    invoke-static {v0}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v2, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    div-int/2addr v0, v2

    const v2, 0x1aab80

    add-int/2addr v0, v2

    goto :goto_0

    :sswitch_5
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(F)V

    sget v0, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v2, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    xor-int/2addr v0, v2

    const v2, 0xdb52

    add-int/2addr v0, v2

    goto :goto_0

    :cond_1
    :sswitch_6
    sget v0, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v2, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    rem-int/lit16 v2, v2, -0x1fa6

    xor-int/2addr v0, v2

    if-ltz v0, :cond_2

    const/16 v0, 0x55

    sput v0, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    const-string v0, "\u06e5\u06e7\u06e6"

    invoke-static {v0}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_2
    sget v0, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v2, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sub-int/2addr v0, v2

    const v2, 0xdd0c

    add-int/2addr v0, v2

    goto :goto_0

    :pswitch_0
    :sswitch_7
    invoke-static {}, Lkotlinx/coroutines/۠ۥۣۧ;->۠ۧۥ()I

    move-result v0

    if-ltz v0, :cond_3

    const-string v0, "\u06e4\u06e5\u06e3"

    invoke-static {v0}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_3
    sget v0, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v2, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    or-int/2addr v0, v2

    const v2, 0x1aa925

    add-int/2addr v0, v2

    goto/16 :goto_0

    :sswitch_8
    sget v0, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    if-gtz v0, :cond_4

    const-string v0, "\u06e3\u06e2\u06e0"

    goto/16 :goto_1

    :cond_4
    sget v0, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v2, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sub-int/2addr v0, v2

    const v2, -0x1ab375

    xor-int/2addr v0, v2

    goto/16 :goto_0

    :sswitch_9
    iget-object v0, p0, Lds;->b:Landroid/widget/ScrollView;

    sget v2, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    xor-int/lit16 v2, v2, -0x3f0

    invoke-virtual {v0, v2}, Landroid/widget/ScrollView;->fullScroll(I)Z

    sget v0, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v2, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    or-int/2addr v0, v2

    const v2, 0x1ab765

    add-int/2addr v0, v2

    goto/16 :goto_0

    :sswitch_a
    const-string v0, "VPjmWqd7FVH36nE0IyfM6tA02"

    invoke-static {v0}, Landroidx/startup/ۣۣۡ۟;->۟ۢۦۢۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    sget v0, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v2, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    add-int/lit16 v2, v2, 0xef3

    or-int/2addr v0, v2

    if-ltz v0, :cond_5

    const/16 v0, 0x27

    sput v0, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    const-string v0, "\u06e0\u06e7\u06e5"

    invoke-static {v0}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_5
    sget v0, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    mul-int/2addr v0, v2

    const v2, 0x195c5d

    add-int/2addr v0, v2

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdbff -> :sswitch_0
        0x1aa704 -> :sswitch_9
        0x1aab7c -> :sswitch_7
        0x1aab7e -> :sswitch_a
        0x1aabbe -> :sswitch_6
        0x1ab664 -> :sswitch_4
        0x1ab6c4 -> :sswitch_1
        0x1abe24 -> :sswitch_0
        0x1ac168 -> :sswitch_2
        0x1ac16d -> :sswitch_5
        0x1ac18a -> :sswitch_8
        0x1ac5c8 -> :sswitch_3
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
