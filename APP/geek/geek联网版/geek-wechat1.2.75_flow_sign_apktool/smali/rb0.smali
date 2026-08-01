.class public final Lrb0;
.super Ljava/lang/Object;


# instance fields
.field public final a:Landroid/view/View;

.field public final b:I

.field public final c:F

.field public final d:J


# direct methods
.method public constructor <init>(Landroid/view/View;IFJ)V
    .locals 4

    const-string v0, "F7KOCA==\n"

    const-string v1, "Ydvrf4l0h6g=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e0\u06e1\u06e1"

    invoke-static {v1}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v2, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    rem-int/lit16 v2, v2, 0x5d7

    mul-int/2addr v0, v2

    if-gtz v0, :cond_5

    invoke-static {}, Landroidx/legacy/content/ۨ۠ۦۥ;->۟ۢۦ۠ۦ()I

    :goto_1
    const-string v0, "\u06e7\u06e5\u06df"

    :goto_2
    invoke-static {v0}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    :sswitch_1
    sget v0, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    sget v2, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    xor-int/lit16 v2, v2, 0x9d7

    add-int/2addr v0, v2

    if-ltz v0, :cond_1

    const/16 v0, 0x1c

    sput v0, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    const-string v0, "\u06e2\u06e3\u06e5"

    invoke-static {v0}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    sget v0, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v2, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    mul-int/2addr v0, v2

    const v2, 0x1bbced

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_2
    iput-wide p4, p0, Lrb0;->d:J

    sget v0, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    if-ltz v0, :cond_2

    invoke-static {}, Landroid/window/ۦۣۦۥ;->ۡۥۥۥ()I

    const-string v0, "\u06e5\u06e0\u06df"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e5\u06e0\u06df"

    goto :goto_2

    :sswitch_3
    iput-object p1, p0, Lrb0;->a:Landroid/view/View;

    sget v0, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v2, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    div-int/2addr v0, v2

    const v2, 0x1ac8ec

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_4
    sget v0, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    xor-int/2addr v0, v2

    const v2, 0x1aab24

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_5
    iput p2, p0, Lrb0;->b:I

    invoke-static {}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۦۥۨۦ()I

    move-result v0

    if-ltz v0, :cond_3

    invoke-static {}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۨ۠۟()I

    const-string v0, "\u06e0\u06e1\u06e1"

    invoke-static {v0}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e5\u06e2"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_6
    iput p3, p0, Lrb0;->c:F

    const-string v0, "\u06e4\u06e1"

    invoke-static {v0}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_7
    invoke-static {}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦۥۣۥ()I

    move-result v0

    if-ltz v0, :cond_0

    goto/16 :goto_1

    :sswitch_8
    const-string v0, "7A9uJ"

    invoke-static {v0}, Landroidx/legacy/content/ۧۡ۠۠;->ۣۢۤ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget v1, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    if-gtz v1, :cond_4

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟ۡۡۦ()I

    const-string v1, "\u06e8\u06e0\u06e4"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto/16 :goto_0

    :cond_4
    sget v1, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v2, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    or-int/2addr v1, v2

    const v2, 0xdaa4

    add-int/2addr v2, v1

    move-object v1, v0

    goto/16 :goto_0

    :cond_5
    sget v0, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v2, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    xor-int/2addr v0, v2

    const v2, 0x1abdf9

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_9
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc41 -> :sswitch_0
        0xdc7d -> :sswitch_2
        0xdc9d -> :sswitch_6
        0x1aab00 -> :sswitch_3
        0x1abda4 -> :sswitch_7
        0x1abda6 -> :sswitch_4
        0x1abea1 -> :sswitch_9
        0x1ac5c1 -> :sswitch_8
        0x1ac8ec -> :sswitch_5
        0x1ac96c -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 8

    const/4 v3, 0x1

    const/4 v2, 0x0

    const/4 v0, 0x0

    const-string v1, "\u06e1\u06e8\u06e0"

    invoke-static {v1}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    sget v1, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v4, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    div-int/lit16 v4, v4, -0x1d26

    xor-int/2addr v1, v4

    if-ltz v1, :cond_c

    const/16 v1, 0x62

    sput v1, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    const-string v1, "\u06e8\u06e2\u06e0"

    invoke-static {v1}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_1
    if-ne p0, p1, :cond_0

    sget v1, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v4, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    rem-int/2addr v1, v4

    const v4, 0x1ab2bc

    xor-int/2addr v1, v4

    goto :goto_0

    :sswitch_2
    iget-wide v4, p0, Lrb0;->d:J

    iget-wide v6, v0, Lrb0;->d:J

    cmp-long v1, v4, v6

    if-eqz v1, :cond_4

    sget v1, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v4, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    mul-int/lit16 v4, v4, -0x1087

    sub-int/2addr v1, v4

    if-ltz v1, :cond_6

    :cond_1
    const-string v1, "\u06e1\u06e5\u06e5"

    invoke-static {v1}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_3
    sget v1, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v4, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    rem-int/lit16 v4, v4, 0x1b95

    or-int/2addr v1, v4

    if-ltz v1, :cond_2

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟ۧ۠ۧۢ()I

    const-string v1, "\u06e8\u06e6\u06e3"

    :goto_1
    invoke-static {v1}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    sget v1, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    sget v4, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    xor-int/2addr v1, v4

    const v4, 0x1aad53

    add-int/2addr v1, v4

    goto :goto_0

    :sswitch_4
    iget-object v1, p0, Lrb0;->a:Landroid/view/View;

    iget-object v4, v0, Lrb0;->a:Landroid/view/View;

    invoke-static {v1, v4}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    sget v1, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v4, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    add-int/lit16 v4, v4, -0x262a

    rem-int/2addr v1, v4

    if-gtz v1, :cond_3

    const-string v1, "\u06e7\u06e6\u06e5"

    invoke-static {v1}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠ۡۤ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_3
    sget v1, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v4, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    add-int/2addr v1, v4

    const v4, 0x1aa0c0

    add-int/2addr v1, v4

    goto :goto_0

    :sswitch_5
    move v0, v2

    :goto_2
    return v0

    :sswitch_6
    move v0, v2

    goto :goto_2

    :sswitch_7
    iget v1, p0, Lrb0;->b:I

    iget v4, v0, Lrb0;->b:I

    if-ne v1, v4, :cond_1

    :sswitch_8
    sget v1, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v4, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    div-int/lit16 v4, v4, 0x10df

    sub-int/2addr v1, v4

    if-gtz v1, :cond_8

    const/16 v1, 0x49

    sput v1, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    const-string v1, "\u06e2\u06df\u06e6"

    :goto_3
    invoke-static {v1}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_4
    :sswitch_9
    const-string v1, "\u06e5\u06e4\u06df"

    goto :goto_1

    :sswitch_a
    move v0, v3

    goto :goto_2

    :sswitch_b
    move v0, v3

    goto :goto_2

    :cond_5
    :sswitch_c
    sget v1, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v4, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    xor-int/2addr v1, v4

    const v4, -0x1aca57

    xor-int/2addr v1, v4

    goto/16 :goto_0

    :sswitch_d
    move-object v0, p1

    check-cast v0, Lrb0;

    sget v1, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v4, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    mul-int/lit16 v4, v4, -0x160

    div-int/2addr v1, v4

    if-eqz v1, :cond_7

    invoke-static {}, Landroidx/activity/result/۟ۡۧ۠ۥ;->۟ۥۥۧ۟()I

    :cond_6
    const-string v1, "\u06e1\u06e3\u06e5"

    invoke-static {v1}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_7
    const-string v1, "\u06e5\u06e2\u06e2"

    goto :goto_1

    :cond_8
    sget v1, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v4, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    rem-int/2addr v1, v4

    const v4, 0x1ab9b5

    add-int/2addr v1, v4

    goto/16 :goto_0

    :cond_9
    :sswitch_e
    invoke-static {}, Landroidx/activity/ۣۢۦۨ;->۟ۦۣ۠ۢ()I

    move-result v1

    if-gtz v1, :cond_a

    const-string v1, "\u06e8\u06e3\u06e7"

    invoke-static {v1}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_a
    sget v1, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v4, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    or-int/2addr v1, v4

    const v4, 0xe03e

    add-int/2addr v1, v4

    goto/16 :goto_0

    :sswitch_f
    instance-of v1, p1, Lrb0;

    if-nez v1, :cond_5

    sget v1, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sget v4, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    mul-int/lit16 v4, v4, -0x8d2

    mul-int/2addr v1, v4

    if-gtz v1, :cond_b

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟ۧ۠ۧۢ()I

    const-string v1, "\u06e4\u06df\u06e0"

    invoke-static {v1}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_b
    sget v1, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v4, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    xor-int/2addr v1, v4

    const v4, 0x1ac5b5

    add-int/2addr v1, v4

    goto/16 :goto_0

    :sswitch_10
    move v0, v2

    goto/16 :goto_2

    :sswitch_11
    move v0, v2

    goto/16 :goto_2

    :sswitch_12
    move v0, v2

    goto/16 :goto_2

    :cond_c
    sget v1, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v4, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    add-int/2addr v1, v4

    const v4, 0x1ac504

    add-int/2addr v1, v4

    goto/16 :goto_0

    :sswitch_13
    iget v1, p0, Lrb0;->c:F

    iget v4, v0, Lrb0;->c:F

    invoke-static {v1, v4}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_d

    sget v1, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v4, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    or-int/2addr v1, v4

    const v4, -0x1abbe1

    xor-int/2addr v1, v4

    goto/16 :goto_0

    :cond_d
    :sswitch_14
    invoke-static {}, Lcom/google/android/material/datepicker/ۨۧۤ;->۠ۤ۠ۧ()I

    move-result v1

    if-ltz v1, :cond_e

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۨۦ۠ۡ()I

    const-string v1, "\u06e7\u06e3\u06e7"

    invoke-static {v1}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_e
    const-string v1, "\u06e7\u06e6\u06e5"

    goto/16 :goto_3

    :sswitch_data_0
    .sparse-switch
        0xdc06 -> :sswitch_0
        0xdc21 -> :sswitch_e
        0xdc5c -> :sswitch_3
        0xdcba -> :sswitch_7
        0x1aa761 -> :sswitch_11
        0x1aaf03 -> :sswitch_10
        0x1aaf41 -> :sswitch_5
        0x1aaf5a -> :sswitch_8
        0x1aaf99 -> :sswitch_1
        0x1ab287 -> :sswitch_c
        0x1ab2a0 -> :sswitch_9
        0x1ab2a2 -> :sswitch_b
        0x1ab2dd -> :sswitch_14
        0x1ab9c5 -> :sswitch_13
        0x1abae1 -> :sswitch_12
        0x1abde5 -> :sswitch_4
        0x1abe20 -> :sswitch_a
        0x1ac5e6 -> :sswitch_2
        0x1ac925 -> :sswitch_d
        0x1ac968 -> :sswitch_6
        0x1ac987 -> :sswitch_f
    .end sparse-switch
.end method

.method public final hashCode()I
    .locals 6

    const/4 v0, 0x0

    const-string v1, "\u06e0\u06e2\u06df"

    invoke-static {v1}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v5

    move v1, v0

    move v3, v0

    move v4, v0

    move v2, v0

    :goto_0
    sparse-switch v5, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget v0, p0, Lrb0;->b:I

    mul-int v1, v4, v3

    invoke-static {v0, v1, v3}, Lg40;->d(III)I

    move-result v1

    sget v0, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v5, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    add-int/lit16 v5, v5, 0x1532

    div-int/2addr v0, v5

    if-eqz v0, :cond_0

    :cond_0
    const-string v0, "\u06e8\u06e7\u06e7"

    :goto_1
    invoke-static {v0}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto :goto_0

    :sswitch_1
    sget v0, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    xor-int/lit16 v0, v0, 0x3c6

    sget v3, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v5, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    div-int/lit16 v5, v5, 0x212c

    xor-int/2addr v3, v5

    if-gtz v3, :cond_1

    const/16 v3, 0x62

    sput v3, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    const-string v3, "\u06df\u06e8\u06e6"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v5

    move v3, v0

    goto :goto_0

    :cond_1
    sget v3, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v5, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    mul-int/2addr v3, v5

    const v5, 0x939c4

    sub-int v5, v3, v5

    move v3, v0

    goto :goto_0

    :sswitch_2
    iget-wide v4, p0, Lrb0;->d:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    rsub-int/lit8 v2, v2, 0x0

    sub-int v1, v2, v1

    rsub-int/lit8 v1, v1, 0x0

    mul-int/2addr v1, v3

    rsub-int/lit8 v1, v1, 0x0

    sub-int/2addr v0, v1

    return v0

    :sswitch_3
    invoke-static {}, Landroid/window/ۣۤ۠ۢ;->ۧۢۦ۟()I

    move-result v0

    if-gtz v0, :cond_2

    invoke-static {}, Landroid/window/ۣۤ۠ۢ;->ۧۢۦ۟()I

    const-string v0, "\u06e6\u06e3"

    invoke-static {v0}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto :goto_0

    :cond_2
    sget v0, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v5, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    mul-int/2addr v0, v5

    const v5, 0x1b512d

    xor-int/2addr v0, v5

    move v5, v0

    goto :goto_0

    :sswitch_4
    iget v0, p0, Lrb0;->c:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v2

    invoke-static {}, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۦۣ۠()I

    move-result v0

    if-ltz v0, :cond_3

    const/16 v0, 0x53

    sput v0, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    const-string v0, "\u06e4\u06e6\u06e7"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto/16 :goto_0

    :cond_3
    const-string v0, "\u06df\u06e8\u06e6"

    goto :goto_1

    :sswitch_5
    iget-object v0, p0, Lrb0;->a:Landroid/view/View;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    sget v4, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    if-gtz v4, :cond_4

    const-string v4, "\u06e1\u06e8\u06e5"

    invoke-static {v4}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v5

    move v4, v0

    goto/16 :goto_0

    :cond_4
    sget v4, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    sget v5, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sub-int/2addr v4, v5

    const v5, 0x1aba9f

    xor-int/2addr v5, v4

    move v4, v0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc03 -> :sswitch_0
        0x1aa81d -> :sswitch_2
        0x1aab1d -> :sswitch_5
        0x1aaf9e -> :sswitch_3
        0x1abaa5 -> :sswitch_1
        0x1ac9c8 -> :sswitch_4
    .end sparse-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    const-string v1, "\u06e0\u06e8\u06e4"

    invoke-static {v1}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, ", position="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v1, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v2, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    mul-int/lit16 v2, v2, -0x1152

    add-int/2addr v1, v2

    if-ltz v1, :cond_1

    const/16 v1, 0xd

    sput v1, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    :cond_0
    const-string v1, "\u06e8\u06e8\u06e5"

    :goto_1
    invoke-static {v1}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_2
    iget-wide v2, p0, Lrb0;->d:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    sget v1, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v2, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    xor-int/2addr v1, v2

    const v2, 0x1abc52

    add-int/2addr v1, v2

    goto :goto_0

    :cond_1
    const-string v1, "\u06e6\u06e7\u06e2"

    :goto_2
    invoke-static {v1}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_3
    iget v1, p0, Lrb0;->c:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    sget v1, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    if-ltz v1, :cond_2

    invoke-static {}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->۟ۦۥۨ۠()I

    const-string v1, "\u06e4\u06df\u06e8"

    goto :goto_2

    :cond_2
    sget v1, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v2, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    rem-int/2addr v1, v2

    const v2, 0x1abe62

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_4
    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lۤۤۥۤ;->۟ۤ۠()I

    move-result v1

    if-gtz v1, :cond_0

    const-string v1, "\u06e5\u06e8\u06e3"

    :goto_3
    invoke-static {v1}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_5
    const-string v1, ", startX="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroidx/legacy/content/ۧۡ۠۠;->ۥۧۡۦ()I

    move-result v1

    if-gtz v1, :cond_3

    invoke-static {}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟۠ۢۨۦ()I

    const-string v1, "\u06e5\u06e7\u06e7"

    invoke-static {v1}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_3
    const-string v1, "\u06e5\u06e7\u06e5"

    goto :goto_3

    :sswitch_6
    invoke-static {}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۟۟۟ۢ()I

    move-result v1

    if-gtz v1, :cond_4

    const-string v1, "\u06e5\u06df\u06e6"

    :goto_4
    invoke-static {v1}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_4
    sget v1, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v2, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    rem-int/2addr v1, v2

    const v2, 0x1aa844

    add-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_7
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AnimRequest(view="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "\u06e3\u06e3\u06e1"

    goto :goto_4

    :sswitch_8
    iget-object v1, p0, Lrb0;->a:Landroid/view/View;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget v1, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v2, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    div-int/lit16 v2, v2, -0x2446

    add-int/2addr v1, v2

    if-ltz v1, :cond_5

    const/16 v1, 0x11

    sput v1, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    const-string v1, "\u06e6\u06e7\u06e2"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_5
    const-string v1, "\u06df\u06e2\u06e1"

    invoke-static {v1}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_9
    const-string v1, ", msgId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\u06e4\u06df\u06e8"

    goto :goto_4

    :sswitch_a
    iget v1, p0, Lrb0;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\u06e5\u06e7\u06e7"

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        0x1aa75e -> :sswitch_0
        0x1aabdc -> :sswitch_7
        0x1ab681 -> :sswitch_8
        0x1ab9cd -> :sswitch_2
        0x1aba7e -> :sswitch_4
        0x1abe83 -> :sswitch_3
        0x1abe85 -> :sswitch_5
        0x1abea0 -> :sswitch_9
        0x1ac241 -> :sswitch_a
        0x1ac549 -> :sswitch_6
        0x1ac9e5 -> :sswitch_1
    .end sparse-switch
.end method
