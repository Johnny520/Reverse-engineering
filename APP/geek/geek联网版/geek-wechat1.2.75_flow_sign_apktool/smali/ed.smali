.class public final Led;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Z

.field public d:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 5

    const-string v0, "jti0wQ==\n"

    const-string v1, "+aDdpbsC9Ok=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v0, "hkyWwA==\n"

    const-string v1, "6C37paJfyGs=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    const-string v2, "\u06e3\u06e8\u06e1"

    invoke-static {v2}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v4

    move-wide v2, v0

    :goto_0
    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    invoke-static {}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۡۥۥۦ()I

    move-result v0

    if-ltz v0, :cond_4

    sget v0, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v1, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    mul-int/lit16 v1, v1, -0x5db

    div-int/2addr v0, v1

    if-eqz v0, :cond_0

    :goto_1
    const-string v0, "\u06e4\u06e3\u06e2"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_0
    sget v0, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v1, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    mul-int/2addr v0, v1

    const v1, 0x19f46d

    add-int/2addr v0, v1

    move v4, v0

    goto :goto_0

    :sswitch_2
    iput-object p2, p0, Led;->b:Ljava/lang/String;

    sget v0, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    if-ltz v0, :cond_1

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۤ۠ۤۢ()I

    const-string v0, "\u06e7\u06e0\u06e5"

    invoke-static {v0}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_1
    sget v0, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v1, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    xor-int/2addr v0, v1

    const v1, -0x1ac7aa

    xor-int/2addr v0, v1

    move v4, v0

    goto :goto_0

    :sswitch_3
    iput-boolean p3, p0, Led;->c:Z

    sget v0, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v1, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    mul-int/lit16 v1, v1, -0x539

    add-int/2addr v0, v1

    if-gtz v0, :cond_2

    const/16 v0, 0x3c

    sput v0, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    const-string v0, "\u06e7\u06e0\u06e0"

    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_2
    sget v0, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v1, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    mul-int/2addr v0, v1

    const v1, 0x1b4e98

    xor-int/2addr v0, v1

    move v4, v0

    goto :goto_0

    :sswitch_4
    iput-object p1, p0, Led;->a:Ljava/lang/String;

    goto :goto_1

    :sswitch_5
    sget v0, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    if-ltz v0, :cond_3

    const/16 v0, 0x4b

    sput v0, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    const-string v0, "\u06e3\u06e7\u06e5"

    :goto_2
    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e3\u06e8\u06e1"

    goto :goto_2

    :cond_4
    :sswitch_6
    sget v0, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    if-ltz v0, :cond_5

    const-string v0, "\u06e1\u06e6\u06e8"

    invoke-static {v0}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_5
    sget v0, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v1, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    xor-int/2addr v0, v1

    const v1, 0x1aad54

    xor-int/2addr v0, v1

    move v4, v0

    goto/16 :goto_0

    :sswitch_7
    const-string v0, "QDybmU8UbKIUu"

    invoke-static {v0}, Landroidx/core/content/ۣۧۡۤ;->ۣۣ۟ۥۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget v2, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    if-gtz v2, :cond_6

    const-string v2, "\u06e7\u06e7\u06e6"

    invoke-static {v2}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v4

    move-wide v2, v0

    goto/16 :goto_0

    :cond_6
    sget v2, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v3, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sub-int/2addr v2, v3

    const v3, -0x1ac598

    xor-int v4, v2, v3

    move-wide v2, v0

    goto/16 :goto_0

    :sswitch_8
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v2, v3}, Ljava/io/PrintStream;->println(J)V

    invoke-static {}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۡۥ۟()I

    move-result v0

    if-gtz v0, :cond_7

    invoke-static {}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۡۤۥۧ()I

    const-string v0, "\u06e5\u06df\u06e6"

    invoke-static {v0}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_7
    sget v0, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v1, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    rem-int/2addr v0, v1

    const v1, -0x1aaebd

    xor-int/2addr v0, v1

    move v4, v0

    goto/16 :goto_0

    :sswitch_9
    const/4 v0, 0x0

    iput-boolean v0, p0, Led;->d:Z

    sget v0, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v1, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    rem-int/lit16 v1, v1, -0x548

    rem-int/2addr v0, v1

    if-ltz v0, :cond_8

    invoke-static {}, Landroidx/activity/ۣۢۦۨ;->۟ۦۣ۠ۢ()I

    const-string v0, "\u06e1\u06e5\u06e0"

    invoke-static {v0}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_8
    sget v0, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v1, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    rem-int/2addr v0, v1

    const v1, -0x1ac4e9

    xor-int/2addr v0, v1

    move v4, v0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aaea6 -> :sswitch_0
        0x1aaf3c -> :sswitch_6
        0x1aaf99 -> :sswitch_7
        0x1ab71c -> :sswitch_4
        0x1aba43 -> :sswitch_2
        0x1abd8c -> :sswitch_9
        0x1ac527 -> :sswitch_5
        0x1ac52c -> :sswitch_1
        0x1ac5c4 -> :sswitch_8
        0x1ac606 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v2, 0x1

    const/4 v1, 0x0

    const/4 v0, 0x0

    const-string v3, "\u06e2\u06e6\u06e0"

    invoke-static {v3}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v4

    move-object v3, v0

    :goto_0
    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    invoke-static {}, Landroidx/activity/result/۟ۡۤۦۡ;->۟۟۟ۥۤ()I

    move-result v0

    if-gtz v0, :cond_4

    invoke-static {}, Landroid/window/ۣۤ۠ۢ;->ۧۢۦ۟()I

    const-string v0, "\u06e4\u06df\u06e7"

    :goto_1
    invoke-static {v0}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :sswitch_1
    move v0, v1

    :goto_2
    return v0

    :sswitch_2
    move-object v0, p1

    check-cast v0, Led;

    invoke-static {}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۦۥۨۦ()I

    move-result v3

    if-ltz v3, :cond_1

    invoke-static {}, Lcom/google/android/material/carousel/۠۟ۧۤ;->۟ۡۡۨۥ()I

    const-string v3, "\u06e4\u06e3\u06e4"

    invoke-static {v3}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v4

    move-object v3, v0

    goto :goto_0

    :cond_1
    const-string v3, "\u06e4\u06e2\u06e6"

    invoke-static {v3}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v4

    move-object v3, v0

    goto :goto_0

    :cond_2
    :sswitch_3
    invoke-static {}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۢۧۥ()I

    move-result v0

    if-ltz v0, :cond_3

    const/16 v0, 0x43

    sput v0, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    const-string v0, "\u06e2\u06df\u06e8"

    invoke-static {v0}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_3
    sget v0, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v4, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sub-int/2addr v0, v4

    const v4, 0x1ac4d5

    xor-int/2addr v0, v4

    move v4, v0

    goto :goto_0

    :cond_4
    sget v0, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v4, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    mul-int/2addr v0, v4

    const v4, -0x1f717f

    xor-int/2addr v0, v4

    move v4, v0

    goto :goto_0

    :sswitch_4
    instance-of v0, p1, Led;

    if-nez v0, :cond_c

    sget v0, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v4, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    div-int/lit16 v4, v4, -0x7b4

    sub-int/2addr v0, v4

    if-gtz v0, :cond_5

    const-string v0, "\u06e0\u06df\u06e7"

    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_5
    const-string v0, "\u06e3\u06df\u06e1"

    goto :goto_1

    :sswitch_5
    move v0, v1

    goto :goto_2

    :sswitch_6
    iget-boolean v0, p0, Led;->d:Z

    iget-boolean v4, v3, Led;->d:Z

    if-eq v0, v4, :cond_f

    sget v0, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v4, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    or-int/lit16 v4, v4, 0xf9b

    rem-int/2addr v0, v4

    if-eqz v0, :cond_6

    invoke-static {}, Landroidx/legacy/content/ۨ۠ۦۥ;->۟ۢۦ۠ۦ()I

    const-string v0, "\u06e3\u06e3\u06e6"

    invoke-static {v0}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_6
    sget v0, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v4, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    rem-int/2addr v0, v4

    const v4, 0x1abb11

    add-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :cond_7
    :sswitch_7
    const-string v0, "\u06e1\u06e7\u06e4"

    goto/16 :goto_1

    :sswitch_8
    move v0, v1

    goto/16 :goto_2

    :sswitch_9
    iget-object v0, p0, Led;->b:Ljava/lang/String;

    iget-object v4, v3, Led;->b:Ljava/lang/String;

    invoke-static {v0, v4}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    sget v0, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v4, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    add-int/lit16 v4, v4, -0x1c1c

    rem-int/2addr v0, v4

    if-gtz v0, :cond_8

    const/16 v0, 0x57

    sput v0, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    const-string v0, "\u06e6\u06df\u06e7"

    invoke-static {v0}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_8
    sget v0, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v4, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    mul-int/2addr v0, v4

    const v4, -0x1c8b42

    xor-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :sswitch_a
    sget v0, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v4, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    div-int/2addr v0, v4

    const v4, 0x1ab31c

    add-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :cond_9
    :sswitch_b
    invoke-static {}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟ۥۦۧۡ()I

    move-result v0

    if-ltz v0, :cond_a

    const-string v0, "\u06e1\u06e7\u06e7"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_a
    sget v0, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v4, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    or-int/2addr v0, v4

    const v4, 0x1aba48

    add-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :sswitch_c
    move v0, v1

    goto/16 :goto_2

    :sswitch_d
    move v0, v1

    goto/16 :goto_2

    :sswitch_e
    move v0, v2

    goto/16 :goto_2

    :sswitch_f
    if-ne p0, p1, :cond_0

    sget v0, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v4, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    add-int/lit16 v4, v4, -0x16d8

    xor-int/2addr v0, v4

    if-ltz v0, :cond_b

    const-string v0, "\u06e7\u06e7\u06e7"

    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_b
    const-string v0, "\u06e6\u06e0\u06e1"

    :goto_3
    invoke-static {v0}, Landroidx/appcompat/app/۟۟ۥۨۤ;->ۤۤۡۡ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_c
    :sswitch_10
    sget v0, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v4, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    mul-int/2addr v0, v4

    const v4, 0x1a0c2e

    xor-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :sswitch_11
    iget-boolean v0, p0, Led;->c:Z

    iget-boolean v4, v3, Led;->c:Z

    if-eq v0, v4, :cond_7

    sget v0, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v4, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    mul-int/lit16 v4, v4, -0xb12

    rem-int/2addr v0, v4

    if-gtz v0, :cond_d

    const-string v0, "\u06e2\u06e5\u06e1"

    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_d
    sget v0, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v4, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    rem-int/2addr v0, v4

    const v4, 0x1ac2d8

    add-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :sswitch_12
    iget-object v0, p0, Led;->a:Ljava/lang/String;

    iget-object v4, v3, Led;->a:Ljava/lang/String;

    invoke-static {v0, v4}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟۠ۢۨۦ()I

    move-result v0

    if-gtz v0, :cond_e

    invoke-static {}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۨ۠۟()I

    const-string v0, "\u06e1\u06e7\u06e0"

    goto :goto_3

    :cond_e
    sget v0, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v4, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    add-int/2addr v0, v4

    const v4, 0x1abb38

    add-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :sswitch_13
    move v0, v2

    goto/16 :goto_2

    :cond_f
    :sswitch_14
    invoke-static {}, Landroidx/activity/ۣۢۦۨ;->۟ۦۣ۠ۢ()I

    move-result v0

    if-gtz v0, :cond_10

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۨۦ۠ۡ()I

    const-string v0, "\u06e0\u06e8\u06e2"

    invoke-static {v0}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_10
    sget v0, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v4, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    add-int/2addr v0, v4

    const v4, 0x1abf02

    add-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc9b -> :sswitch_0
        0x1aaac8 -> :sswitch_3
        0x1aaf7a -> :sswitch_a
        0x1aaf7e -> :sswitch_6
        0x1ab2fe -> :sswitch_10
        0x1ab31c -> :sswitch_f
        0x1ab605 -> :sswitch_c
        0x1ab625 -> :sswitch_b
        0x1ab686 -> :sswitch_8
        0x1ab6dd -> :sswitch_7
        0x1aba28 -> :sswitch_12
        0x1aba45 -> :sswitch_11
        0x1abaa3 -> :sswitch_1
        0x1abd88 -> :sswitch_d
        0x1ac14e -> :sswitch_14
        0x1ac167 -> :sswitch_13
        0x1ac16a -> :sswitch_2
        0x1ac18a -> :sswitch_e
        0x1ac266 -> :sswitch_5
        0x1ac5c6 -> :sswitch_9
        0x1ac607 -> :sswitch_4
    .end sparse-switch
.end method

.method public final hashCode()I
    .locals 6

    const/4 v3, 0x0

    const-string v0, "\u06e2\u06e4\u06e8"

    invoke-static {v0}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v5

    move v2, v3

    move v4, v3

    move v0, v3

    move v1, v3

    :goto_0
    sparse-switch v5, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v3, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sget v5, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    div-int/lit16 v5, v5, 0x2688

    add-int/2addr v3, v5

    if-ltz v3, :cond_0

    const-string v3, "\u06e6\u06e5\u06e8"

    invoke-static {v3}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v3

    move v5, v3

    goto :goto_0

    :cond_0
    sget v3, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v5, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    div-int/2addr v3, v5

    const v5, 0x1ab2e6

    add-int/2addr v3, v5

    move v5, v3

    goto :goto_0

    :sswitch_1
    iget-boolean v1, p0, Led;->d:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    rsub-int/lit8 v1, v1, 0x0

    rsub-int/lit8 v2, v2, 0x0

    sub-int v0, v2, v0

    rsub-int/lit8 v0, v0, 0x0

    mul-int/2addr v0, v4

    sub-int v0, v1, v0

    rsub-int/lit8 v0, v0, 0x0

    return v0

    :sswitch_2
    sget v3, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    xor-int/lit8 v3, v3, 0xf

    sget v4, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v5, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    xor-int/lit16 v5, v5, 0x1d96

    rem-int/2addr v4, v5

    if-ltz v4, :cond_1

    const/16 v4, 0x28

    sput v4, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    :cond_1
    const-string v4, "\u06e7\u06e4\u06e4"

    invoke-static {v4}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v5

    move v4, v3

    goto :goto_0

    :sswitch_3
    iget-boolean v2, p0, Led;->c:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    sget v3, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    sget v5, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    xor-int/lit16 v5, v5, -0x1ae7

    or-int/2addr v3, v5

    if-ltz v3, :cond_2

    const-string v3, "\u06e2\u06e4\u06e8"

    invoke-static {v3}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v3

    move v5, v3

    goto :goto_0

    :cond_2
    sget v3, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v5, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    div-int/2addr v3, v5

    const v5, 0x1ac1e4

    add-int/2addr v3, v5

    move v5, v3

    goto :goto_0

    :sswitch_4
    iget-object v0, p0, Led;->b:Ljava/lang/String;

    mul-int v3, v1, v4

    invoke-static {v0, v3, v4}, Lg40;->e(Ljava/lang/String;II)I

    move-result v0

    sget v3, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v5, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    mul-int/lit16 v5, v5, 0x7ba

    add-int/2addr v3, v5

    if-ltz v3, :cond_3

    invoke-static {}, Landroidx/activity/result/۟۠۟۠ۦ;->۟ۢۡ۠()I

    const-string v3, "\u06e0\u06e6\u06e3"

    invoke-static {v3}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v3

    move v5, v3

    goto/16 :goto_0

    :sswitch_5
    iget-object v1, p0, Led;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    sget v3, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v5, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    div-int/lit16 v5, v5, -0x11e9

    add-int/2addr v3, v5

    if-ltz v3, :cond_4

    :cond_3
    const-string v3, "\u06e7\u06e3\u06e2"

    invoke-static {v3}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v3

    move v5, v3

    goto/16 :goto_0

    :cond_4
    sget v3, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v5, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    div-int/2addr v3, v5

    const v5, 0x1ac8e8

    add-int/2addr v3, v5

    move v5, v3

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aab9d -> :sswitch_0
        0x1ab2e6 -> :sswitch_5
        0x1ac1e4 -> :sswitch_1
        0x1ac586 -> :sswitch_3
        0x1ac5a7 -> :sswitch_4
        0x1ac8e7 -> :sswitch_2
    .end sparse-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    const/4 v2, 0x0

    const/4 v0, 0x0

    const-string v1, "\u06e4\u06e7\u06df"

    invoke-static {v1}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v3

    move-object v1, v0

    :goto_0
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, ", name="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\u06e4\u06df\u06e6"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :sswitch_1
    iget-boolean v0, p0, Led;->d:Z

    sget v2, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v3, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    add-int/2addr v2, v3

    const v3, 0x1aaec0

    xor-int/2addr v3, v2

    move v2, v0

    goto :goto_0

    :sswitch_2
    const-string v0, ", isGroup="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v0, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    if-ltz v0, :cond_0

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟ۧ۠ۧۢ()I

    const-string v0, "\u06e0\u06e3\u06e3"

    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :cond_0
    sget v0, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v3, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    rem-int/2addr v0, v3

    const v3, -0x1aa775

    xor-int/2addr v0, v3

    move v3, v0

    goto :goto_0

    :sswitch_3
    sget v0, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v3, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    rem-int/lit16 v3, v3, 0x1d32

    add-int/2addr v0, v3

    if-ltz v0, :cond_1

    const/16 v0, 0x5e

    sput v0, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    const-string v0, "\u06e1\u06e3\u06e7"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e4\u06e7\u06df"

    goto :goto_1

    :sswitch_4
    iget-object v0, p0, Led;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v0, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v3, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    mul-int/lit16 v3, v3, 0x1e2a

    sub-int/2addr v0, v3

    if-ltz v0, :cond_2

    const/16 v0, 0x35

    sput v0, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    const-string v0, "\u06e1\u06e5\u06e5"

    :goto_2
    invoke-static {v0}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :cond_2
    sget v0, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v3, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    or-int/2addr v0, v3

    const v3, 0xd8e0

    add-int/2addr v0, v3

    move v3, v0

    goto :goto_0

    :sswitch_5
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_6
    iget-boolean v0, p0, Led;->c:Z

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    :cond_3
    const-string v0, "\u06e7\u06e7\u06e3"

    :goto_3
    invoke-static {v0}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :sswitch_7
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, "\u06df\u06e4\u06e6"

    goto :goto_3

    :sswitch_8
    iget-object v0, p0, Led;->b:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\u06df\u06e0\u06e8"

    goto :goto_2

    :sswitch_9
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Contact(wxid="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget v1, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v3, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    mul-int/lit16 v3, v3, -0x14b7

    rem-int/2addr v1, v3

    if-ltz v1, :cond_4

    const-string v1, "\u06e4\u06e5\u06e7"

    invoke-static {v1}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v3

    move-object v1, v0

    goto/16 :goto_0

    :cond_4
    sget v1, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v3, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sub-int/2addr v1, v3

    const v3, 0x1ac01e

    add-int/2addr v3, v1

    move-object v1, v0

    goto/16 :goto_0

    :sswitch_a
    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۤ۠ۤۢ()I

    move-result v0

    if-gez v0, :cond_3

    sget v0, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v3, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    mul-int/2addr v0, v3

    const v3, 0x1a6a5a

    xor-int/2addr v0, v3

    move v3, v0

    goto/16 :goto_0

    :sswitch_b
    const-string v0, ", isSelected="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v0, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v3, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    rem-int/2addr v0, v3

    const v3, -0x1aaf58

    xor-int/2addr v0, v3

    move v3, v0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdcbd -> :sswitch_0
        0x1aa723 -> :sswitch_6
        0x1aa727 -> :sswitch_2
        0x1aa7a1 -> :sswitch_a
        0x1aab40 -> :sswitch_5
        0x1aaf41 -> :sswitch_7
        0x1aafa1 -> :sswitch_9
        0x1ab9cb -> :sswitch_8
        0x1aba86 -> :sswitch_3
        0x1ababc -> :sswitch_1
        0x1ac1cb -> :sswitch_4
        0x1ac603 -> :sswitch_b
    .end sparse-switch
.end method
