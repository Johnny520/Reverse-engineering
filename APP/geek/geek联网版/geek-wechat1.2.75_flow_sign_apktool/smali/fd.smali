.class public final Lfd;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final a:Lp00;

.field public final b:Lgd;

.field public final c:Ljava/util/ArrayList;

.field public final d:I

.field public final e:Ljava/util/ArrayList;

.field public final f:Ll00;


# direct methods
.method public constructor <init>(Lp00;Lgd;Ljava/util/ArrayList;ILjava/util/ArrayList;Ll00;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    const-string v2, "\u06e3\u06e4\u06df"

    invoke-static {v2}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v2

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v2, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    if-ltz v2, :cond_0

    const-string v2, "\u06e4\u06e8\u06e7"

    invoke-static {v2}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :sswitch_1
    const-string v0, "vtDLGnBgKN3O5QRdBsenmISpI"

    invoke-static {v0}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟ۡۧ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget v2, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v3, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    or-int/lit16 v3, v3, -0x860

    rem-int/2addr v2, v3

    if-ltz v2, :cond_3

    const-string v2, "\u06e3\u06e4\u06df"

    invoke-static {v2}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :cond_0
    sget v2, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v3, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    add-int/2addr v2, v3

    const v3, 0x1ab08d

    add-int/2addr v2, v3

    goto :goto_0

    :sswitch_2
    iput-object p1, p0, Lfd;->a:Lp00;

    sget v2, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v3, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    mul-int/2addr v2, v3

    const v3, 0x1b1d8f

    add-int/2addr v2, v3

    goto :goto_0

    :sswitch_3
    iput-object p3, p0, Lfd;->c:Ljava/util/ArrayList;

    sget v2, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v3, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    rem-int/lit16 v3, v3, 0x4a0

    add-int/2addr v2, v3

    if-ltz v2, :cond_1

    :cond_1
    const-string v2, "\u06e0\u06e2\u06e6"

    invoke-static {v2}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :sswitch_4
    iput-object p6, p0, Lfd;->f:Ll00;

    sget v2, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    if-gtz v2, :cond_2

    const-string v2, "\u06e1\u06e1\u06e8"

    invoke-static {v2}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :cond_2
    sget v2, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v3, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    rem-int/2addr v2, v3

    const v3, 0x1ab54b

    add-int/2addr v2, v3

    goto :goto_0

    :sswitch_5
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

    sget v2, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v3, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    xor-int/lit16 v3, v3, -0xd15

    mul-int/2addr v2, v3

    if-gtz v2, :cond_4

    const/16 v2, 0x58

    sput v2, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    :cond_3
    const-string v2, "\u06e4\u06df\u06e3"

    :goto_1
    invoke-static {v2}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :cond_4
    const-string v2, "\u06e1\u06e1\u06e8"

    :goto_2
    invoke-static {v2}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v2

    goto/16 :goto_0

    :sswitch_6
    invoke-static {}, Landroidx/activity/result/۟۠۟۠ۦ;->۟ۢۡ۠()I

    move-result v2

    if-ltz v2, :cond_7

    sget v2, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v3, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sub-int/2addr v2, v3

    const v3, 0x1acaf1

    add-int/2addr v2, v3

    goto/16 :goto_0

    :sswitch_7
    iput p4, p0, Lfd;->d:I

    sget v2, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v3, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    div-int/2addr v2, v3

    const v3, 0x1aaac8

    add-int/2addr v2, v3

    goto/16 :goto_0

    :sswitch_8
    iput-object p2, p0, Lfd;->b:Lgd;

    sget v2, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    if-ltz v2, :cond_5

    const/16 v2, 0x53

    sput v2, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    const-string v2, "\u06df\u06e7\u06e6"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v2

    goto/16 :goto_0

    :cond_5
    sget v2, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v3, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    rem-int/2addr v2, v3

    const v3, -0x1aba22

    xor-int/2addr v2, v3

    goto/16 :goto_0

    :sswitch_9
    iput-object p5, p0, Lfd;->e:Ljava/util/ArrayList;

    sget v2, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v3, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    rem-int/lit16 v3, v3, -0x231f

    sub-int/2addr v2, v3

    if-gtz v2, :cond_6

    const/16 v2, 0x31

    sput v2, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    const-string v2, "\u06e1\u06e0\u06e6"

    invoke-static {v2}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v2

    goto/16 :goto_0

    :cond_6
    const-string v2, "\u06e1\u06e2\u06e1"

    goto :goto_1

    :cond_7
    :sswitch_a
    sget v2, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    if-ltz v2, :cond_8

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۥۣ۠ۦ()I

    const-string v2, "\u06e1\u06e1\u06e6"

    goto :goto_2

    :cond_8
    sget v2, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v3, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    or-int/2addr v2, v3

    const v3, 0x1ab149

    add-int/2addr v2, v3

    goto/16 :goto_0

    :sswitch_b
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa7fe -> :sswitch_0
        0x1aaac7 -> :sswitch_9
        0x1aab24 -> :sswitch_7
        0x1aaea7 -> :sswitch_a
        0x1aaec8 -> :sswitch_b
        0x1aaee0 -> :sswitch_4
        0x1ab642 -> :sswitch_6
        0x1ab69e -> :sswitch_2
        0x1ab9c8 -> :sswitch_5
        0x1aba67 -> :sswitch_3
        0x1abdab -> :sswitch_8
        0x1ac908 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 11

    const/4 v0, 0x0

    const-string v1, "\u06e4\u06e2\u06df"

    invoke-static {v1}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v1

    move-object v10, v0

    move-object v5, v0

    move-object v3, v0

    move-object v7, v0

    move-object v4, v0

    move-object v9, v0

    move-object v6, v0

    move-object v8, v0

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    invoke-static {}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۤ۟۠ۢ()I

    move-result v0

    if-gtz v0, :cond_b

    const/16 v0, 0x4f

    sput v0, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    const-string v0, "\u06e5\u06e2\u06e1"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto :goto_0

    :sswitch_1
    const-string v0, "d+jY3B06++ti9PGbRHGngQ==\n"

    const-string v1, "A4eUs2pfiag=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "\u06e2\u06e0\u06e8"

    :goto_2
    invoke-static {v0}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto :goto_0

    :sswitch_2
    sget v0, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v1, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    div-int/lit16 v1, v1, -0x3bc

    mul-int/2addr v0, v1

    if-eqz v0, :cond_1

    const-string v0, "\u06e7\u06e8\u06df"

    invoke-static {v0}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move-object v8, v6

    move v1, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e4\u06df\u06e7"

    move-object v1, v0

    move-object v2, v6

    :goto_3
    invoke-static {v1}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v0

    move-object v8, v2

    move v1, v0

    goto :goto_0

    :sswitch_3
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v7, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v2, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    rem-int/lit16 v2, v2, 0x7cb

    sub-int/2addr v1, v2

    if-ltz v1, :cond_4

    const/16 v1, 0x14

    sput v1, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    const-string v1, "\u06e2\u06e4\u06e5"

    invoke-static {v1}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v1

    move-object v6, v0

    goto :goto_0

    :sswitch_4
    sget v0, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v1, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    div-int/lit16 v1, v1, -0x1df9

    xor-int/2addr v0, v1

    if-gtz v0, :cond_2

    const/16 v0, 0x3c

    sput v0, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    const-string v0, "\u06e2\u06e6"

    invoke-static {v0}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v0

    move-object v8, v9

    move v1, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06df\u06e3\u06e3"

    move-object v8, v9

    goto :goto_1

    :sswitch_5
    invoke-static {}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۢۧۥ()I

    move-result v0

    if-ltz v0, :cond_0

    sget v0, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v1, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    xor-int/lit16 v1, v1, -0x103f

    rem-int/2addr v0, v1

    if-ltz v0, :cond_3

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۧۡۥۦ()I

    const-string v0, "\u06e4\u06df\u06e7"

    invoke-static {v0}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto/16 :goto_0

    :cond_3
    sget v0, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v1, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    div-int/2addr v0, v1

    const v1, 0x1ab33c

    add-int/2addr v0, v1

    move v1, v0

    goto/16 :goto_0

    :sswitch_6
    if-eqz v7, :cond_8

    sget v0, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v1, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    add-int/lit16 v1, v1, 0x22e3

    rem-int/2addr v0, v1

    if-gtz v0, :cond_5

    move-object v0, v6

    :cond_4
    const-string v1, "\u06e6\u06e3\u06e3"

    invoke-static {v1}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v1

    move-object v6, v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06e6\u06df\u06df"

    goto/16 :goto_1

    :sswitch_7
    const-string v9, ""

    sget v0, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    if-gtz v0, :cond_6

    const/16 v0, 0x3f

    sput v0, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    const-string v0, "\u06e3\u06e7\u06e8"

    invoke-static {v0}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto/16 :goto_0

    :cond_6
    sget v0, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v1, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    or-int/2addr v0, v1

    const v1, 0x1ac82f

    add-int/2addr v0, v1

    move v1, v0

    goto/16 :goto_0

    :sswitch_8
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_4
    const-string v1, "\u06df\u06e2\u06e8"

    move-object v7, v0

    move-object v2, v8

    goto/16 :goto_3

    :sswitch_9
    sget v0, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    sget v1, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    rem-int/lit16 v1, v1, -0x2516

    rem-int/2addr v0, v1

    if-ltz v0, :cond_7

    invoke-static {}, Landroid/window/۟ۤ۟ۡۧ;->ۢۦۣۨ()I

    const-string v0, "\u06e6\u06e1"

    goto/16 :goto_2

    :cond_7
    sget v0, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v1, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    add-int/2addr v0, v1

    const v1, 0x1aa964

    add-int/2addr v0, v1

    move v1, v0

    goto/16 :goto_0

    :cond_8
    :sswitch_a
    invoke-static {}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۡۢۨۥ()I

    move-result v0

    if-ltz v0, :cond_9

    const-string v0, "\u06e1\u06e7\u06e5"

    invoke-static {v0}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto/16 :goto_0

    :cond_9
    sget v0, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v1, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sub-int/2addr v0, v1

    const v1, 0x1ab323

    add-int/2addr v0, v1

    move v1, v0

    goto/16 :goto_0

    :sswitch_b
    iget-object v5, p0, Lfd;->b:Lgd;

    sget v0, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v1, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    or-int/lit16 v1, v1, 0x11b3

    mul-int/2addr v0, v1

    if-ltz v0, :cond_a

    move-object v0, v7

    goto :goto_4

    :cond_a
    const-string v0, "\u06e1\u06e1\u06df"

    invoke-static {v0}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto/16 :goto_0

    :cond_b
    sget v0, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v1, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    add-int/2addr v0, v1

    const v1, 0x1aae07

    add-int/2addr v0, v1

    move v1, v0

    goto/16 :goto_0

    :sswitch_c
    sget v0, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v1, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    div-int/2addr v0, v1

    const v1, 0x1aba22

    add-int/2addr v0, v1

    move v1, v0

    goto/16 :goto_0

    :sswitch_d
    iget-object v3, p0, Lfd;->a:Lp00;

    sget v0, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    if-gtz v0, :cond_c

    invoke-static {}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۟ۦۣۣۧ()I

    const-string v0, "\u06e0\u06e3\u06e4"

    invoke-static {v0}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠ۡۤ(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto/16 :goto_0

    :sswitch_e
    sget v0, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v1, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    or-int/lit16 v1, v1, -0x147d

    rem-int/2addr v0, v1

    if-gtz v0, :cond_d

    const/4 v0, 0x0

    sput v0, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    :cond_c
    const-string v0, "\u06e6\u06e0\u06e4"

    invoke-static {v0}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto/16 :goto_0

    :cond_d
    sget v0, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v1, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    xor-int/2addr v0, v1

    const v1, 0x1aab45

    add-int/2addr v0, v1

    move v1, v0

    goto/16 :goto_0

    :sswitch_f
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v10}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v1, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    div-int/2addr v0, v1

    const v1, 0x1aaec7

    xor-int/2addr v0, v1

    move v1, v0

    goto/16 :goto_0

    :sswitch_10
    iget-object v4, p0, Lfd;->f:Ll00;

    invoke-static {}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۨۧ۟ۤ()I

    move-result v0

    if-ltz v0, :cond_e

    const-string v0, "\u06e1\u06e2\u06e0"

    invoke-static {v0}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto/16 :goto_0

    :cond_e
    sget v0, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v1, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    rem-int/2addr v0, v1

    const v1, 0x1ab35c

    add-int/2addr v0, v1

    move v1, v0

    goto/16 :goto_0

    :sswitch_11
    const-string v0, "QTVmRyFrp7lbqJUWF0dNm"

    invoke-static {v0}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟ۧۧۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget v1, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    if-gtz v1, :cond_f

    invoke-static {}, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۡۥ()I

    const-string v1, "\u06e3\u06e6\u06e5"

    invoke-static {v1}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v1

    move-object v10, v0

    goto/16 :goto_0

    :cond_f
    sget v1, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v2, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    add-int/2addr v1, v2

    const v2, 0x1aae49

    add-int/2addr v1, v2

    move-object v10, v0

    goto/16 :goto_0

    :sswitch_12
    iput-object v8, v3, Lp00;->b:Ljava/lang/Object;

    sget v0, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v1, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    xor-int/lit16 v1, v1, 0x108f

    xor-int/2addr v0, v1

    if-ltz v0, :cond_10

    const/16 v0, 0x33

    sput v0, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    const-string v0, "\u06e2\u06e3\u06e3"

    invoke-static {v0}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto/16 :goto_0

    :cond_10
    sget v0, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v1, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    add-int/2addr v0, v1

    const v1, 0x1aaeb3

    add-int/2addr v0, v1

    move v1, v0

    goto/16 :goto_0

    :sswitch_13
    if-eqz p1, :cond_8

    const-string v0, "\u06e2\u06e4\u06e5"

    move-object v1, v0

    move-object v2, v8

    goto/16 :goto_3

    :sswitch_14
    iget-object v0, p0, Lfd;->c:Ljava/util/ArrayList;

    iget v1, p0, Lfd;->d:I

    iget-object v2, p0, Lfd;->e:Ljava/util/ArrayList;

    invoke-static/range {v0 .. v5}, Lhd;->c(Ljava/util/ArrayList;ILjava/util/ArrayList;Lp00;Ll00;Landroid/widget/BaseAdapter;)V

    const-string v0, "\u06e3\u06e6\u06e5"

    invoke-static {v0}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto/16 :goto_0

    :sswitch_15
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc44 -> :sswitch_0
        0x1aa765 -> :sswitch_6
        0x1aa77f -> :sswitch_d
        0x1aab41 -> :sswitch_10
        0x1aae82 -> :sswitch_9
        0x1aaebf -> :sswitch_14
        0x1aaec7 -> :sswitch_15
        0x1aaedf -> :sswitch_c
        0x1ab26a -> :sswitch_2
        0x1ab2a0 -> :sswitch_f
        0x1ab2c2 -> :sswitch_a
        0x1ab2e3 -> :sswitch_8
        0x1ab323 -> :sswitch_7
        0x1ab33b -> :sswitch_11
        0x1ab6e2 -> :sswitch_5
        0x1ab704 -> :sswitch_b
        0x1ab9cc -> :sswitch_e
        0x1aba21 -> :sswitch_13
        0x1ac146 -> :sswitch_3
        0x1ac16a -> :sswitch_12
        0x1ac1c6 -> :sswitch_1
        0x1ac529 -> :sswitch_9
        0x1ac61e -> :sswitch_4
    .end sparse-switch
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 3

    const/4 v0, 0x0

    const-string v1, "\u06e3\u06e3\u06e2"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "kX3lAeHT"

    invoke-static {v0}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۢ۠ۥۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v1

    invoke-static {}, Lۤۤۥۤ;->۟ۤ۠()I

    move-result v0

    if-gtz v0, :cond_1

    const-string v0, "\u06e6\u06e8\u06e6"

    :goto_1
    invoke-static {v0}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_1
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v2, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    mul-int/lit16 v2, v2, -0x154b

    rem-int/2addr v0, v2

    if-gtz v0, :cond_0

    const-string v0, "\u06e5\u06e6\u06e0"

    :goto_2
    invoke-static {v0}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    sget v0, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v2, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    xor-int/2addr v0, v2

    const v2, 0x1abc82

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e4\u06e8\u06e2"

    goto :goto_1

    :cond_2
    :sswitch_2
    sget v0, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v2, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    add-int/lit16 v2, v2, 0x1c70

    div-int/2addr v0, v2

    if-eqz v0, :cond_3

    const-string v0, "\u06e4\u06e6"

    invoke-static {v0}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_3
    sget v0, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v2, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    rem-int/2addr v0, v2

    const v2, 0x1abdca

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_3
    sget v0, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v2, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sub-int/2addr v0, v2

    const v2, 0x1ab3d9

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_4
    invoke-static {}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۟ۦۣۣۧ()I

    move-result v0

    if-gtz v0, :cond_2

    sget v0, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v2, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    add-int/lit16 v2, v2, 0x11b7

    xor-int/2addr v0, v2

    if-gtz v0, :cond_4

    const/4 v0, 0x5

    sput v0, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    const-string v0, "\u06e3\u06e3\u06e2"

    invoke-static {v0}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_4
    const-string v0, "\u06e0\u06e8\u06e0"

    goto :goto_2

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aabd8 -> :sswitch_0
        0x1ab682 -> :sswitch_4
        0x1abade -> :sswitch_1
        0x1abdca -> :sswitch_5
        0x1abe5f -> :sswitch_3
        0x1ac264 -> :sswitch_2
    .end sparse-switch
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 2

    const-string v0, "\u06e4\u06e6\u06e0"

    invoke-static {v0}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v1, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    mul-int/lit16 v1, v1, -0x231f

    or-int/2addr v0, v1

    if-ltz v0, :cond_0

    const-string v0, "\u06e8\u06e5\u06e3"

    invoke-static {v0}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v1, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    div-int/2addr v0, v1

    const v1, 0x1aba9a

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aba04 -> :sswitch_0
        0x1aba9e -> :sswitch_1
    .end sparse-switch
.end method
