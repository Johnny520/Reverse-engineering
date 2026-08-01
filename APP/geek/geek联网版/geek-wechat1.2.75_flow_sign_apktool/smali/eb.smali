.class public final Leb;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:I

.field public final d:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;IIZ)V
    .locals 3

    const-string v0, "3xd84w==\n"

    const-string v1, "q3IEl1zxXXc=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e8\u06e5\u06e0"

    invoke-static {v1}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iput p3, p0, Leb;->c:I

    sget v1, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v2, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    add-int/lit16 v2, v2, 0x1129

    or-int/2addr v1, v2

    if-ltz v1, :cond_7

    invoke-static {}, Lio/fastkv/ۣ۟ۧۦۡ;->ۥۥۤۥ()I

    :cond_0
    const-string v1, "\u06e0\u06e0\u06df"

    invoke-static {v1}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    :sswitch_1
    invoke-static {}, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢ۠ۨۦ()I

    move-result v1

    if-ltz v1, :cond_2

    invoke-static {}, Landroidx/activity/result/۟ۡۧ۠ۥ;->۟ۥۥۧ۟()I

    const-string v1, "\u06e8\u06e3\u06e0"

    invoke-static {v1}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    sget v1, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v2, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    add-int/2addr v1, v2

    const v2, 0x1ab288

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkotlinx/coroutines/ۤۢۢۥ;->ۡ۠ۥۡ()I

    move-result v1

    if-ltz v1, :cond_1

    sget v1, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v2, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    add-int/lit16 v2, v2, -0x1ef6

    div-int/2addr v1, v2

    if-eqz v1, :cond_4

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۥۥۢۧ()I

    :cond_3
    const-string v1, "\u06e2\u06e6\u06e2"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_4
    sget v1, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v2, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sub-int/2addr v1, v2

    const v2, 0x1ac044

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_3
    sget v1, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v2, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    or-int/2addr v1, v2

    const v2, 0x1ac984

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_4
    iput p2, p0, Leb;->b:I

    sget v1, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v2, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    or-int/lit16 v2, v2, -0x1a06

    div-int/2addr v1, v2

    if-eqz v1, :cond_0

    const/4 v1, 0x6

    sput v1, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    const-string v1, "\u06e8\u06e5\u06e0"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_5
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    const-string v1, "\u06e4\u06e0\u06e2"

    invoke-static {v1}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_6
    const-string v0, "V1C"

    invoke-static {v0}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟ۧ۠ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget v1, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v2, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    mul-int/lit16 v2, v2, -0x2500

    or-int/2addr v1, v2

    if-ltz v1, :cond_6

    const/16 v1, 0x5c

    sput v1, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    :cond_5
    const-string v1, "\u06e5\u06e1\u06e2"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_6
    const-string v1, "\u06e0\u06e8\u06e3"

    :goto_1
    invoke-static {v1}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_7
    sget v1, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v2, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    xor-int/2addr v1, v2

    const v2, 0x1ac0d8

    xor-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_7
    iput-boolean p4, p0, Leb;->d:Z

    invoke-static {}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۡۢۨۥ()I

    move-result v1

    if-ltz v1, :cond_3

    const-string v1, "\u06e7\u06e4\u06e3"

    goto :goto_1

    :sswitch_8
    iput-object p1, p0, Leb;->a:Ljava/lang/String;

    sget v1, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    if-gtz v1, :cond_5

    const/16 v1, 0x23

    sput v1, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    const-string v1, "\u06e4\u06e4\u06e5"

    invoke-static {v1}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_9
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aaadf -> :sswitch_0
        0x1aabdb -> :sswitch_5
        0x1ab31e -> :sswitch_2
        0x1ab35e -> :sswitch_3
        0x1ab9e6 -> :sswitch_9
        0x1aba65 -> :sswitch_6
        0x1abdc6 -> :sswitch_4
        0x1ac1e8 -> :sswitch_7
        0x1ac5a6 -> :sswitch_1
        0x1ac983 -> :sswitch_8
    .end sparse-switch
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v0, 0x0

    const-string v3, "\u06e8\u06e2\u06e0"

    invoke-static {v3}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v4

    move-object v3, v0

    :goto_0
    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    sget v0, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v4, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    mul-int/lit16 v4, v4, -0x1b77

    add-int/2addr v0, v4

    if-gtz v0, :cond_4

    const-string v0, "\u06e7\u06df\u06e2"

    invoke-static {v0}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :sswitch_1
    move v0, v1

    :goto_1
    return v0

    :cond_1
    :sswitch_2
    sget v0, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v4, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    rem-int/lit16 v4, v4, -0x21fc

    div-int/2addr v0, v4

    if-eqz v0, :cond_2

    invoke-static {}, Landroidx/startup/ۣۣۡ۟;->۠ۢۢۧ()I

    const-string v0, "\u06e8\u06e3\u06e3"

    :goto_2
    invoke-static {v0}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e5\u06e1\u06e1"

    :goto_3
    invoke-static {v0}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :sswitch_3
    if-ne p0, p1, :cond_1

    sget v0, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v4, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    add-int/lit16 v4, v4, -0x123f

    div-int/2addr v0, v4

    if-eqz v0, :cond_3

    const-string v0, "\u06e0\u06e1\u06e4"

    invoke-static {v0}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e0\u06e4\u06e2"

    :goto_4
    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_4
    sget v0, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v4, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    xor-int/2addr v0, v4

    const v4, 0x1ab23d

    xor-int/2addr v0, v4

    move v4, v0

    goto :goto_0

    :sswitch_4
    move v0, v2

    goto :goto_1

    :sswitch_5
    move v0, v2

    goto :goto_1

    :sswitch_6
    move v0, v2

    goto :goto_1

    :sswitch_7
    iget-object v0, p0, Leb;->a:Ljava/lang/String;

    iget-object v4, v3, Leb;->a:Ljava/lang/String;

    invoke-static {v0, v4}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    sget v0, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v4, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    xor-int/2addr v0, v4

    const v4, -0x1abd00

    xor-int/2addr v0, v4

    move v4, v0

    goto :goto_0

    :sswitch_8
    move v0, v1

    goto :goto_1

    :sswitch_9
    sget v0, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v4, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    add-int/lit16 v4, v4, -0x25d2

    sub-int/2addr v0, v4

    if-gtz v0, :cond_5

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۤ۟ۦ۟()I

    const-string v0, "\u06e2\u06e0"

    goto :goto_3

    :cond_5
    const-string v0, "\u06e8\u06e2\u06e0"

    invoke-static {v0}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :sswitch_a
    iget v0, p0, Leb;->b:I

    iget v4, v3, Leb;->b:I

    if-eq v0, v4, :cond_e

    const-string v0, "\u06e4\u06e4\u06e8"

    goto :goto_3

    :sswitch_b
    iget-boolean v0, p0, Leb;->d:Z

    iget-boolean v4, v3, Leb;->d:Z

    if-eq v0, v4, :cond_c

    sget v0, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v4, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    div-int/lit16 v4, v4, 0x17e4

    mul-int/2addr v0, v4

    if-eqz v0, :cond_6

    invoke-static {}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۢۧۥ()I

    const-string v0, "\u06e6\u06df\u06e0"

    invoke-static {v0}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_6
    const-string v0, "\u06e6\u06df\u06e0"

    goto/16 :goto_2

    :sswitch_c
    move-object v0, p1

    check-cast v0, Leb;

    invoke-static {}, Lۤۤۥۤ;->۟ۤ۠()I

    move-result v3

    if-gtz v3, :cond_7

    :cond_7
    const-string v3, "\u06e6\u06e6\u06e7"

    invoke-static {v3}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v4

    move-object v3, v0

    goto/16 :goto_0

    :cond_8
    :sswitch_d
    sget v0, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v4, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    div-int/lit16 v4, v4, 0x1db7

    xor-int/2addr v0, v4

    if-gtz v0, :cond_9

    const-string v0, "\u06e3\u06e6\u06e3"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_9
    sget v0, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v4, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    div-int/2addr v0, v4

    const v4, 0x1aab7e

    add-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :cond_a
    :sswitch_e
    sget v0, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    sget v4, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    add-int/2addr v0, v4

    const v4, 0x1ab606

    add-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :sswitch_f
    instance-of v0, p1, Leb;

    if-nez v0, :cond_a

    sget v0, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    if-gtz v0, :cond_b

    const/16 v0, 0x38

    sput v0, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    const-string v0, "\u06e7\u06e6\u06e2"

    invoke-static {v0}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_b
    const-string v0, "\u06e6\u06e3\u06e1"

    invoke-static {v0}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_c
    :sswitch_10
    sget v0, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v4, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    mul-int/lit16 v4, v4, 0x22e6

    mul-int/2addr v0, v4

    if-ltz v0, :cond_d

    const/16 v0, 0x13

    sput v0, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    const-string v0, "\u06e3\u06e0\u06df"

    goto/16 :goto_4

    :cond_d
    const-string v0, "\u06e3\u06e6\u06e6"

    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_e
    :sswitch_11
    sget v0, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v4, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    mul-int/lit16 v4, v4, -0x3a6

    sub-int/2addr v0, v4

    if-ltz v0, :cond_f

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۥۥۢۧ()I

    const-string v0, "\u06e2\u06e4\u06e7"

    invoke-static {v0}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_f
    sget v0, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v4, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    rem-int/2addr v0, v4

    const v4, 0x1ac245

    xor-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :sswitch_12
    iget v0, p0, Leb;->c:I

    iget v4, v3, Leb;->c:I

    if-eq v0, v4, :cond_0

    sget v0, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v4, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    add-int/2addr v0, v4

    const v4, 0x1ac59e

    xor-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :sswitch_13
    move v0, v2

    goto/16 :goto_1

    :sswitch_14
    move v0, v2

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aab03 -> :sswitch_0
        0x1aab5e -> :sswitch_1
        0x1aab7f -> :sswitch_a
        0x1aabd9 -> :sswitch_11
        0x1aaf24 -> :sswitch_10
        0x1ab269 -> :sswitch_9
        0x1ab280 -> :sswitch_b
        0x1ab2c2 -> :sswitch_c
        0x1ab2c6 -> :sswitch_d
        0x1ab6e3 -> :sswitch_8
        0x1aba68 -> :sswitch_13
        0x1abdc5 -> :sswitch_f
        0x1abe20 -> :sswitch_14
        0x1ac147 -> :sswitch_4
        0x1ac1c4 -> :sswitch_6
        0x1ac227 -> :sswitch_7
        0x1ac245 -> :sswitch_12
        0x1ac527 -> :sswitch_5
        0x1ac5e3 -> :sswitch_2
        0x1ac926 -> :sswitch_3
        0x1ac9c6 -> :sswitch_e
    .end sparse-switch
.end method

.method public final hashCode()I
    .locals 6

    const/4 v0, 0x0

    const-string v1, "\u06e5\u06e1\u06e6"

    invoke-static {v1}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v5

    move v1, v0

    move v3, v0

    move v4, v0

    move v2, v0

    :goto_0
    sparse-switch v5, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    xor-int/lit16 v2, v0, -0x30d

    sget v0, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    if-gtz v0, :cond_1

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۨۦ۠ۡ()I

    const-string v0, "\u06e6\u06e5"

    :goto_1
    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto :goto_0

    :sswitch_1
    iget v0, p0, Leb;->c:I

    invoke-static {v0, v4, v2}, Lg40;->d(III)I

    move-result v0

    const-string v3, "\u06e5\u06e6\u06df"

    invoke-static {v3}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v5

    move v3, v0

    goto :goto_0

    :sswitch_2
    iget-boolean v0, p0, Leb;->d:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    rsub-int/lit8 v1, v3, 0x0

    sub-int/2addr v0, v1

    return v0

    :sswitch_3
    iget v0, p0, Leb;->b:I

    mul-int v4, v1, v2

    invoke-static {v0, v4, v2}, Lg40;->d(III)I

    move-result v4

    sget v0, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v5, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    div-int/lit16 v5, v5, 0x11aa

    or-int/2addr v0, v5

    if-gtz v0, :cond_0

    const/16 v0, 0xa

    sput v0, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    const-string v0, "\u06e6\u06e3\u06e4"

    :goto_2
    invoke-static {v0}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e6\u06e3\u06e4"

    goto :goto_2

    :cond_1
    sget v0, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v5, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    mul-int/2addr v0, v5

    const v5, 0x13e980

    xor-int/2addr v0, v5

    move v5, v0

    goto :goto_0

    :sswitch_4
    sget v0, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    if-ltz v0, :cond_2

    invoke-static {}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۣۣ۟ۥ۟()I

    const-string v0, "\u06e8\u06e4\u06e4"

    invoke-static {v0}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e5\u06e1\u06e6"

    invoke-static {v0}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto :goto_0

    :sswitch_5
    iget-object v0, p0, Leb;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    sget v0, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v5, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    xor-int/lit16 v5, v5, -0x2654

    div-int/2addr v0, v5

    if-eqz v0, :cond_3

    invoke-static {}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۡۤۥۧ()I

    const-string v0, "\u06e5\u06e1\u06e6"

    invoke-static {v0}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto/16 :goto_0

    :cond_3
    const-string v0, "\u06e6\u06e5"

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0xdcbf -> :sswitch_0
        0x1aba08 -> :sswitch_3
        0x1ababd -> :sswitch_4
        0x1abdca -> :sswitch_5
        0x1abe5e -> :sswitch_2
        0x1ac1c7 -> :sswitch_1
    .end sparse-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    const-string v1, "\u06df\u06e2\u06e3"

    invoke-static {v1}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    const-string v0, "\u06e8\u06e0\u06e5"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_1
    iget-boolean v0, p0, Leb;->d:Z

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    sget v0, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v2, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    div-int/lit16 v2, v2, 0x3a4

    xor-int/2addr v0, v2

    if-gtz v0, :cond_0

    invoke-static {}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟۠ۢۨۦ()I

    :cond_0
    const-string v0, "\u06df\u06e0\u06e0"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_2
    const-string v0, ", isDynamic="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v0, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    rem-int/lit16 v2, v2, -0x1a4b

    xor-int/2addr v0, v2

    if-gtz v0, :cond_2

    const/16 v0, 0x3e

    sput v0, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    :cond_1
    const-string v0, "\u06e8\u06e1\u06e5"

    invoke-static {v0}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    sget v0, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v2, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    mul-int/2addr v0, v2

    const v2, 0x19ddbe

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_3
    const-string v0, ", bgColor="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v0, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v2, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    or-int/lit16 v2, v2, -0x6fc

    rem-int/2addr v0, v2

    if-gtz v0, :cond_3

    const-string v0, "\u06e5\u06e7\u06e8"

    invoke-static {v0}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_3
    sget v0, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v2, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sub-int/2addr v0, v2

    const v2, 0x1ab684

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_4
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_5
    iget v0, p0, Leb;->b:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "\u06e5\u06e7\u06e8"

    :goto_2
    invoke-static {v0}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_6
    iget-object v0, p0, Leb;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v0, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v2, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    rem-int/lit16 v2, v2, -0x2605

    rem-int/2addr v0, v2

    if-gtz v0, :cond_4

    invoke-static {}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۟۟۟ۢ()I

    const-string v0, "\u06df\u06e2\u06e3"

    invoke-static {v0}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_4
    sget v0, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v2, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    add-int/2addr v0, v2

    const v2, 0x1abd80

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_7
    const-string v0, ", textColor="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v0, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v2, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    add-int/lit16 v2, v2, 0xc0f

    sub-int/2addr v0, v2

    if-ltz v0, :cond_5

    const-string v0, "\u06e8\u06e0\u06df"

    :goto_3
    invoke-static {v0}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06e8\u06e0\u06df"

    goto :goto_3

    :sswitch_8
    sget v0, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    if-gtz v0, :cond_6

    const/16 v0, 0x4f

    sput v0, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    const-string v0, "\u06e1\u06e2\u06e0"

    goto :goto_2

    :cond_6
    sget v0, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v2, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    add-int/2addr v0, v2

    const v2, 0x1aa2a1

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_9
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TagData(text="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Landroid/window/ۦۣۦۥ;->ۡۥۥۥ()I

    move-result v1

    if-gtz v1, :cond_7

    const/16 v1, 0x24

    sput v1, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    :cond_7
    const-string v1, "\u06e3\u06e8\u06e5"

    invoke-static {v1}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto/16 :goto_0

    :sswitch_a
    iget v0, p0, Leb;->c:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    sget v0, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v2, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    mul-int/lit16 v2, v2, -0x1449

    or-int/2addr v0, v2

    if-ltz v0, :cond_1

    invoke-static {}, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢ۠ۨۦ()I

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa71f -> :sswitch_0
        0x1aa760 -> :sswitch_9
        0x1ab268 -> :sswitch_5
        0x1ab720 -> :sswitch_6
        0x1abd8d -> :sswitch_3
        0x1abe40 -> :sswitch_8
        0x1abe86 -> :sswitch_7
        0x1ac5e4 -> :sswitch_1
        0x1ac8e7 -> :sswitch_a
        0x1ac8ed -> :sswitch_4
        0x1ac90c -> :sswitch_2
    .end sparse-switch
.end method
