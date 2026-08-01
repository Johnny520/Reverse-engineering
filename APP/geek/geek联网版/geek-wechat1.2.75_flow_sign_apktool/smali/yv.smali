.class public final Lyv;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final a:Lp00;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ln00;

.field public final d:Lp00;


# direct methods
.method public constructor <init>(Ln00;Lp00;Lp00;Ljava/util/ArrayList;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e1\u06e4\u06e8"

    invoke-static {v1}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iput-object p3, p0, Lyv;->d:Lp00;

    sget v1, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v2, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    div-int/lit16 v2, v2, -0xf50

    or-int/2addr v1, v2

    if-ltz v1, :cond_7

    invoke-static {}, Lkotlinx/coroutines/۠ۥۣۧ;->۠ۧۥ()I

    const-string v1, "\u06e6\u06e2\u06e3"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_1
    iput-object p4, p0, Lyv;->b:Ljava/util/ArrayList;

    sget v1, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v2, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    or-int/lit16 v2, v2, 0x252f

    div-int/2addr v1, v2

    if-eqz v1, :cond_1

    :cond_0
    const-string v1, "\u06e0\u06e1\u06e1"

    :goto_1
    invoke-static {v1}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    const-string v1, "\u06e3\u06e3\u06e3"

    goto :goto_1

    :sswitch_2
    sget v1, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    if-gtz v1, :cond_2

    invoke-static {}, Landroid/window/۟ۤ۟ۡۧ;->ۢۦۣۨ()I

    const-string v1, "\u06e0\u06e8\u06e0"

    :goto_2
    invoke-static {v1}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    sget v1, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v2, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    div-int/2addr v1, v2

    const v2, 0x1aaf25

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_3
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    invoke-static {}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۨ۠۟()I

    move-result v1

    if-ltz v1, :cond_3

    const/16 v1, 0x53

    sput v1, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    const-string v1, "\u06e0\u06e6\u06e5"

    invoke-static {v1}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_3
    const-string v1, "\u06e6\u06e2\u06e3"

    goto :goto_2

    :cond_4
    :sswitch_4
    sget v1, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v2, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    add-int/lit16 v2, v2, 0x18c5

    div-int/2addr v1, v2

    if-eqz v1, :cond_5

    invoke-static {}, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۦۣ۠()I

    const-string v1, "\u06e7\u06e0\u06e3"

    :goto_3
    invoke-static {v1}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_5
    sget v1, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v2, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    or-int/2addr v1, v2

    const v2, -0x1ac186

    xor-int/2addr v1, v2

    goto :goto_0

    :sswitch_5
    const-string v0, "PGhdcCwOHOAIj"

    invoke-static {v0}, Landroid/window/۟ۤ۟ۡۧ;->۟۟ۢۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget v1, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v2, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    mul-int/lit16 v2, v2, -0x17d0

    xor-int/2addr v1, v2

    if-gtz v1, :cond_0

    const-string v1, "\u06df\u06e2\u06e3"

    invoke-static {v1}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_6
    invoke-static {}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->ۤ۠ۡۧ()I

    move-result v1

    if-ltz v1, :cond_4

    :goto_4
    const-string v1, "\u06e4\u06e5\u06e7"

    invoke-static {v1}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_7
    iput-object p2, p0, Lyv;->a:Lp00;

    sget v1, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sget v2, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    rem-int/lit16 v2, v2, -0x1bec

    div-int/2addr v1, v2

    if-eqz v1, :cond_6

    const/16 v1, 0x18

    sput v1, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    const-string v1, "\u06e0\u06e3\u06e6"

    invoke-static {v1}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_6
    const-string v1, "\u06e8\u06e3\u06e7"

    goto :goto_3

    :cond_7
    sget v1, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v2, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    div-int/2addr v1, v2

    const v2, 0x1aabdb

    xor-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_8
    iput-object p1, p0, Lyv;->c:Ln00;

    sget v1, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    if-ltz v1, :cond_8

    const/16 v1, 0x3b

    sput v1, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    goto :goto_4

    :cond_8
    sget v1, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v2, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    add-int/2addr v1, v2

    const v2, 0x1aa1e7

    add-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_9
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa760 -> :sswitch_0
        0x1aab00 -> :sswitch_3
        0x1aab43 -> :sswitch_2
        0x1aab9f -> :sswitch_4
        0x1aabdb -> :sswitch_6
        0x1aaf25 -> :sswitch_7
        0x1ab683 -> :sswitch_8
        0x1aba86 -> :sswitch_5
        0x1ac1a7 -> :sswitch_9
        0x1ac94c -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 5

    const/4 v1, 0x0

    const-string v0, "\u06e4\u06e4\u06e4"

    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v3

    move-object v0, v1

    move-object v2, v1

    :goto_0
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v1, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v3, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    add-int/lit16 v3, v3, -0x1b7f

    or-int/2addr v1, v3

    if-ltz v1, :cond_1

    const-string v1, "\u06e2\u06df\u06e0"

    invoke-static {v1}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :sswitch_1
    iput-object v2, v0, Lp00;->b:Ljava/lang/Object;

    sget v1, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v3, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    div-int/lit16 v3, v3, -0xb61

    xor-int/2addr v1, v3

    if-ltz v1, :cond_0

    invoke-static {}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۡۤۥۧ()I

    const-string v1, "\u06e4\u06e4\u06e4"

    invoke-static {v1}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :cond_0
    sget v1, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v3, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    div-int/2addr v1, v3

    const v3, 0x1abdc4

    xor-int/2addr v1, v3

    move v3, v1

    goto :goto_0

    :sswitch_2
    iget-object v1, p0, Lyv;->c:Ln00;

    iget-object v3, p0, Lyv;->d:Lp00;

    iget-object v4, p0, Lyv;->b:Ljava/util/ArrayList;

    invoke-static {v1, v0, v3, v4}, Lbw;->g(Ln00;Lp00;Lp00;Ljava/util/ArrayList;)V

    sget v1, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v3, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    div-int/2addr v1, v3

    const v3, 0x1aba01

    add-int/2addr v1, v3

    move v3, v1

    goto :goto_0

    :sswitch_3
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    sget v2, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v3, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    rem-int/2addr v2, v3

    const v3, 0x1aacd9

    xor-int/2addr v3, v2

    move-object v2, v1

    goto :goto_0

    :cond_1
    sget v1, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v3, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sub-int/2addr v1, v3

    const v3, 0x1ab930

    add-int/2addr v1, v3

    move v3, v1

    goto :goto_0

    :sswitch_4
    iget-object v0, p0, Lyv;->a:Lp00;

    sget v1, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    if-ltz v1, :cond_2

    const/4 v1, 0x5

    sput v1, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    const-string v1, "\u06e5\u06e1\u06e0"

    invoke-static {v1}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :cond_2
    const-string v1, "\u06e0\u06e6\u06e2"

    invoke-static {v1}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa7bf -> :sswitch_0
        0x1aab9c -> :sswitch_1
        0x1aaf5d -> :sswitch_4
        0x1aba02 -> :sswitch_5
        0x1aba64 -> :sswitch_3
        0x1abdc4 -> :sswitch_2
    .end sparse-switch
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 3

    const/4 v0, 0x0

    const-string v1, "\u06e2\u06e0\u06e6"

    invoke-static {v1}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

    sget v1, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v2, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    add-int/lit16 v2, v2, 0xa24

    div-int/2addr v1, v2

    if-eqz v1, :cond_2

    invoke-static {}, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۦۣ۠()I

    const-string v1, "\u06e8\u06df\u06df"

    :goto_1
    invoke-static {v1}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    :sswitch_1
    sget v1, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sget v2, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    add-int/lit16 v2, v2, 0x2059

    mul-int/2addr v1, v2

    if-gtz v1, :cond_1

    const/4 v1, 0x1

    sput v1, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    const-string v1, "\u06e0\u06e4"

    :goto_2
    invoke-static {v1}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    const-string v1, "\u06e3\u06e5\u06e0"

    invoke-static {v1}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_2
    const-string v0, "xya1w59AKe5Thbf5KPi1ibrrTUiS"

    invoke-static {v0}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->ۥ۟۟ۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    const-string v1, "\u06df\u06df\u06e0"

    goto :goto_1

    :cond_2
    const-string v1, "\u06e3\u06e5\u06e0"

    goto :goto_2

    :sswitch_3
    sget v1, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    if-ltz v1, :cond_3

    invoke-static {}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۡۢۨۥ()I

    const-string v1, "\u06e8\u06e8\u06e6"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_3
    sget v1, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v2, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    xor-int/2addr v1, v2

    const v2, 0x1ab24c

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_4
    invoke-static {}, Lۤۤۥۤ;->۟ۤ۠()I

    move-result v1

    if-gtz v1, :cond_0

    const-string v1, "\u06e1\u06e1\u06e2"

    invoke-static {v1}, Landroidx/appcompat/app/۟۟ۥۨۤ;->ۤۤۡۡ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa700 -> :sswitch_0
        0x1aaec2 -> :sswitch_2
        0x1ab268 -> :sswitch_4
        0x1ab6be -> :sswitch_5
        0x1abaa2 -> :sswitch_3
        0x1ac8c8 -> :sswitch_1
    .end sparse-switch
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 1

    const-string v0, "\u06e5\u06df"

    invoke-static {v0}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    sget v0, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    if-gtz v0, :cond_0

    invoke-static {}, Lkotlinx/coroutines/ۤۢۢۥ;->ۡ۠ۥۡ()I

    const-string v0, "\u06e4\u06e8\u06e7"

    :goto_1
    invoke-static {v0}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e5\u06df"

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0xdc9a -> :sswitch_0
        0xdcf8 -> :sswitch_1
    .end sparse-switch
.end method
