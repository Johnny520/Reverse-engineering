.class public final synthetic Lc6;
.super Ljava/lang/Object;

# interfaces
.implements Luh;


# instance fields
.field public final a:I

.field public final b:Landroid/view/KeyEvent$Callback;


# direct methods
.method public synthetic constructor <init>(Landroid/view/KeyEvent$Callback;I)V
    .locals 3

    iput p2, p0, Lc6;->a:I

    iput-object p1, p0, Lc6;->b:Landroid/view/KeyEvent$Callback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06df\u06e5\u06e5"

    invoke-static {v1}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    invoke-static {}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۥۧۤ۠()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۡۥۥۦ()I

    :cond_0
    const-string v0, "\u06e7\u06e5\u06e5"

    invoke-static {v0}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠ۡۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_1
    const-string v0, "IIz9pGd3qFaD5zePb7WL0a"

    invoke-static {v0}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->ۣ۟ۨۥ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget v1, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v2, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    rem-int/2addr v1, v2

    const v2, 0xda6a

    add-int/2addr v2, v1

    move-object v1, v0

    goto :goto_0

    :cond_1
    :sswitch_2
    sget v0, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    if-gtz v0, :cond_2

    const/16 v0, 0x2f

    sput v0, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    const-string v0, "\u06e4\u06e5\u06e8"

    invoke-static {v0}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    sget v0, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v2, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    rem-int/2addr v0, v2

    const v2, 0x1ac7fd

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_3
    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۨۦ۠ۡ()I

    move-result v0

    if-ltz v0, :cond_1

    sget v0, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v2, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    xor-int/lit16 v2, v2, -0x276

    div-int/2addr v0, v2

    if-ltz v0, :cond_3

    const/16 v0, 0x60

    sput v0, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    const-string v0, "\u06e2\u06e8\u06e0"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e1\u06e3\u06e7"

    goto :goto_1

    :sswitch_4
    const-string v0, "\u06df\u06e5\u06e5"

    invoke-static {v0}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc61 -> :sswitch_0
        0x1aa7bf -> :sswitch_3
        0x1aaf05 -> :sswitch_1
        0x1ab35a -> :sswitch_2
        0x1abe80 -> :sswitch_4
        0x1ac5c7 -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final a()V
    .locals 4

    const/4 v2, 0x0

    const-string v0, "\u06e6\u06e1\u06e1"

    invoke-static {v0}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v0

    move v1, v2

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(I)V

    sget v0, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v3, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    add-int/lit16 v3, v3, 0x2611

    mul-int/2addr v0, v3

    if-gtz v0, :cond_4

    const-string v0, "\u06e5\u06e1\u06e4"

    invoke-static {v0}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    invoke-static {}, Landroidx/core/app/ۡۤۡ۠;->ۨۥۨۧ()I

    move-result v0

    if-ltz v0, :cond_a

    sget v0, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    if-ltz v0, :cond_0

    const/16 v0, 0x32

    sput v0, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    const-string v0, "\u06e6\u06e4\u06e5"

    invoke-static {v0}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v3, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sub-int/2addr v0, v3

    const v3, 0x1aa8be

    add-int/2addr v0, v3

    goto :goto_0

    :sswitch_2
    sget v0, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v3, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    rem-int/lit16 v3, v3, 0x17d6

    mul-int/2addr v0, v3

    if-ltz v0, :cond_1

    const-string v0, "\u06e3\u06e8\u06e4"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e6\u06e1\u06e1"

    goto :goto_1

    :sswitch_3
    const-string v0, "qyCTcjLgQ7lietU"

    invoke-static {v0}, Landroid/window/ۣۤ۠ۢ;->۟۟ۦۤۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {}, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۦۣ۠()I

    move-result v0

    if-ltz v0, :cond_2

    const-string v0, "\u06e5\u06e7\u06e8"

    invoke-static {v0}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e6\u06e3"

    :goto_2
    invoke-static {v0}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :pswitch_0
    :sswitch_4
    sget v0, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v3, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    xor-int/lit16 v3, v3, 0x74d

    xor-int/2addr v0, v3

    if-ltz v0, :cond_3

    const/16 v0, 0x47

    sput v0, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    const-string v0, "\u06e2\u06e1\u06e6"

    goto :goto_2

    :cond_3
    sget v0, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v3, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    add-int/2addr v0, v3

    const v3, 0x1ac107

    add-int/2addr v0, v3

    goto/16 :goto_0

    :cond_4
    sget v0, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v3, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    rem-int/2addr v0, v3

    const v3, 0x1abedb

    xor-int/2addr v0, v3

    goto/16 :goto_0

    :sswitch_5
    iget v0, p0, Lc6;->a:I

    packed-switch v0, :pswitch_data_0

    :sswitch_6
    sget v0, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    if-gtz v0, :cond_5

    invoke-static {}, Lcom/google/android/material/carousel/ۢۢۢۥ;->۟ۡ۟۠ۧ()I

    const-string v0, "\u06e4\u06e5\u06e1"

    invoke-static {v0}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_5
    sget v0, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v3, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    or-int/2addr v0, v3

    const v3, -0x1ab57d

    xor-int/2addr v0, v3

    goto/16 :goto_0

    :sswitch_7
    iget-object v0, p0, Lc6;->b:Landroid/view/KeyEvent$Callback;

    check-cast v0, Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    sget v0, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v3, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    xor-int/lit16 v3, v3, 0xb2d

    div-int/2addr v0, v3

    if-eqz v0, :cond_6

    invoke-static {}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۡۢۨۥ()I

    const-string v0, "\u06e5\u06e2\u06e2"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_6
    sget v0, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v3, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    or-int/2addr v0, v3

    const v3, 0x1ac22a

    add-int/2addr v0, v3

    goto/16 :goto_0

    :sswitch_8
    iget-object v0, p0, Lc6;->b:Landroid/view/KeyEvent$Callback;

    check-cast v0, Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    sget v0, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v3, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    add-int/lit16 v3, v3, -0x9af

    div-int/2addr v0, v3

    if-eqz v0, :cond_7

    const/16 v0, 0xc

    sput v0, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    const-string v0, "\u06e6\u06e6\u06e7"

    invoke-static {v0}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_7
    const-string v0, "\u06df\u06e0\u06e6"

    :goto_3
    invoke-static {v0}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :sswitch_9
    iget-object v0, p0, Lc6;->b:Landroid/view/KeyEvent$Callback;

    check-cast v0, Landroid/view/View;

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    sget v0, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    if-ltz v0, :cond_8

    const-string v0, "\u06df\u06e0\u06e6"

    invoke-static {v0}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_8
    const-string v0, "\u06e6\u06e4\u06e5"

    goto/16 :goto_1

    :pswitch_1
    :sswitch_a
    sget v0, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    if-ltz v0, :cond_9

    const/16 v0, 0x37

    sput v0, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    const-string v0, "\u06e5\u06e6"

    goto :goto_3

    :cond_9
    sget v0, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v3, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    rem-int/2addr v0, v3

    const v3, 0x1abe57

    add-int/2addr v0, v3

    goto/16 :goto_0

    :cond_a
    :sswitch_b
    invoke-static {}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۦۥۨۦ()I

    move-result v0

    if-ltz v0, :cond_b

    const/16 v0, 0x8

    sput v0, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    const-string v0, "\u06e1\u06e2\u06e3"

    invoke-static {v0}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_b
    sget v0, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    sget v3, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    add-int/2addr v0, v3

    const v3, -0x1abec2

    xor-int/2addr v0, v3

    goto/16 :goto_0

    :sswitch_c
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdcbd -> :sswitch_0
        0x1aa725 -> :sswitch_c
        0x1aa7fc -> :sswitch_3
        0x1aab61 -> :sswitch_a
        0x1ab6fe -> :sswitch_9
        0x1abdc8 -> :sswitch_b
        0x1abde5 -> :sswitch_7
        0x1abe28 -> :sswitch_2
        0x1abe86 -> :sswitch_c
        0x1ac16a -> :sswitch_8
        0x1ac186 -> :sswitch_5
        0x1ac1c3 -> :sswitch_4
        0x1ac1e7 -> :sswitch_1
        0x1ac227 -> :sswitch_c
        0x1ac98b -> :sswitch_6
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
