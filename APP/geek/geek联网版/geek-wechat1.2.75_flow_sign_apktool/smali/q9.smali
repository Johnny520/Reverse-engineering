.class public final Lq9;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:I

.field public final c:Ljava/lang/String;

.field public final d:J

.field public final e:I


# direct methods
.method public constructor <init>(Ljava/lang/Object;ILjava/lang/String;JI)V
    .locals 4

    const-string v0, "Bi9ppds8FA==\n"

    const-string v1, "a1wO7LVaewg=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v0, "ODLbp2cZ\n"

    const-string v1, "TFO3zAJrV/Q=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e2\u06e1\u06e2"

    invoke-static {v1}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iput-object p3, p0, Lq9;->c:Ljava/lang/String;

    invoke-static {}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۠۟ۥۧ()I

    move-result v1

    if-ltz v1, :cond_6

    const/16 v1, 0x47

    sput v1, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    const-string v1, "\u06e3\u06e0\u06e3"

    :goto_1
    invoke-static {v1}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    :sswitch_1
    invoke-static {}, Lۤۨۤۨ;->۟ۢۦۣۢ()I

    move-result v1

    if-ltz v1, :cond_1

    invoke-static {}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->ۤ۠ۡۧ()I

    const-string v1, "\u06df\u06e6\u06e8"

    invoke-static {v1}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    const-string v1, "\u06e7\u06e5\u06e5"

    invoke-static {v1}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_2
    iput p2, p0, Lq9;->b:I

    sget v1, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v2, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    sub-int/2addr v1, v2

    const v2, 0x1aa946

    xor-int/2addr v1, v2

    goto :goto_0

    :sswitch_3
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v1, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v2, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    mul-int/lit16 v2, v2, 0x558

    mul-int/2addr v1, v2

    if-ltz v1, :cond_2

    :goto_2
    const-string v1, "\u06e6\u06e6\u06df"

    invoke-static {v1}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    sget v1, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v2, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    rem-int/2addr v1, v2

    const v2, 0x1ac630

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_4
    iput p6, p0, Lq9;->e:I

    goto :goto_2

    :sswitch_5
    iput-wide p4, p0, Lq9;->d:J

    sget v1, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    if-ltz v1, :cond_4

    invoke-static {}, Lۤۨۤۨ;->۟ۢۦۣۢ()I

    const-string v1, "\u06e2\u06e1\u06e2"

    invoke-static {v1}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_6
    sget v1, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    or-int/lit16 v2, v2, 0x17a5

    xor-int/2addr v1, v2

    if-ltz v1, :cond_3

    const-string v1, "\u06e3\u06e1\u06e7"

    :goto_3
    invoke-static {v1}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_3
    const-string v1, "\u06e2\u06e1\u06e2"

    goto :goto_3

    :sswitch_7
    iput-object p1, p0, Lq9;->a:Ljava/lang/Object;

    sget v1, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    if-ltz v1, :cond_5

    :cond_4
    const-string v1, "\u06e2\u06e0\u06e1"

    :goto_4
    invoke-static {v1}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_5
    const-string v1, "\u06e7\u06e5\u06e0"

    goto :goto_4

    :sswitch_8
    invoke-static {}, Lkotlinx/coroutines/۠ۥۣۧ;->۠ۧۥ()I

    move-result v1

    if-ltz v1, :cond_0

    const-string v1, "\u06e3\u06e0\u06e3"

    goto/16 :goto_1

    :cond_6
    sget v1, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v2, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    xor-int/2addr v1, v2

    const v2, 0x1abd2d

    add-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_9
    const-string v0, "YWSiBkcZp206sGji01"

    invoke-static {v0}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۣ۟ۨۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "\u06e6\u06df\u06e0"

    goto :goto_4

    :sswitch_a
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aaac5 -> :sswitch_0
        0x1aaae6 -> :sswitch_1
        0x1ab263 -> :sswitch_4
        0x1ab283 -> :sswitch_7
        0x1ab626 -> :sswitch_9
        0x1aba7f -> :sswitch_5
        0x1ac147 -> :sswitch_3
        0x1ac21f -> :sswitch_8
        0x1ac225 -> :sswitch_6
        0x1ac5c2 -> :sswitch_2
        0x1ac5c7 -> :sswitch_a
    .end sparse-switch
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 8

    const/4 v3, 0x1

    const/4 v2, 0x0

    const/4 v0, 0x0

    const-string v1, "\u06e5\u06e3\u06e4"

    invoke-static {v1}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget-object v1, p0, Lq9;->c:Ljava/lang/String;

    iget-object v4, v0, Lq9;->c:Ljava/lang/String;

    invoke-static {v1, v4}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "\u06e7\u06df\u06e3"

    :goto_1
    invoke-static {v1}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    :sswitch_1
    sget v1, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v4, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    add-int/lit16 v4, v4, -0x2219

    sub-int/2addr v1, v4

    if-gtz v1, :cond_1

    const/16 v1, 0x4d

    sput v1, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    const-string v1, "\u06e2\u06e0\u06e6"

    :goto_2
    invoke-static {v1}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    sget v1, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v4, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    div-int/2addr v1, v4

    const v4, 0xdc5e

    add-int/2addr v1, v4

    goto :goto_0

    :sswitch_2
    move-object v0, p1

    check-cast v0, Lq9;

    sget v1, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    if-gtz v1, :cond_2

    invoke-static {}, Landroid/window/ۦۣۦۥ;->ۡۥۥۥ()I

    const-string v1, "\u06e7\u06df\u06e3"

    goto :goto_1

    :cond_2
    sget v1, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v4, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    add-int/2addr v1, v4

    const v4, 0x1ab3e6

    xor-int/2addr v1, v4

    goto :goto_0

    :sswitch_3
    iget-wide v4, p0, Lq9;->d:J

    iget-wide v6, v0, Lq9;->d:J

    cmp-long v1, v4, v6

    if-eqz v1, :cond_5

    sget v1, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v4, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    add-int/lit16 v4, v4, 0x696

    div-int/2addr v1, v4

    if-eqz v1, :cond_12

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۨۦ۠ۡ()I

    const-string v1, "\u06e8\u06df\u06e0"

    invoke-static {v1}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_4
    if-ne p0, p1, :cond_d

    const-string v1, "\u06e7\u06e7\u06e5"

    goto :goto_2

    :sswitch_5
    move v0, v2

    :goto_3
    return v0

    :sswitch_6
    move v0, v3

    goto :goto_3

    :sswitch_7
    move v0, v2

    goto :goto_3

    :cond_3
    :sswitch_8
    sget v1, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    if-ltz v1, :cond_4

    const/16 v1, 0x25

    sput v1, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    const-string v1, "\u06e8\u06e8\u06e2"

    invoke-static {v1}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_4
    sget v1, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v4, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    rem-int/2addr v1, v4

    const v4, 0x1acabe

    add-int/2addr v1, v4

    goto/16 :goto_0

    :cond_5
    :sswitch_9
    sget v1, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    if-ltz v1, :cond_6

    const-string v1, "\u06e5\u06e4"

    :goto_4
    invoke-static {v1}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_6
    sget v1, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v4, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    rem-int/2addr v1, v4

    const v4, 0x1ac971

    xor-int/2addr v1, v4

    goto/16 :goto_0

    :cond_7
    :sswitch_a
    const-string v1, "\u06e7\u06e1\u06e4"

    :goto_5
    invoke-static {v1}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_b
    move v0, v2

    goto :goto_3

    :sswitch_c
    iget v1, p0, Lq9;->b:I

    iget v4, v0, Lq9;->b:I

    if-eq v1, v4, :cond_0

    sget v1, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    if-ltz v1, :cond_8

    const/16 v1, 0x57

    sput v1, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    const-string v1, "\u06e7\u06e1\u06e4"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_8
    const-string v1, "\u06e2\u06e2\u06e6"

    goto :goto_4

    :cond_9
    :sswitch_d
    sget v1, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    if-gtz v1, :cond_a

    const/16 v1, 0x1c

    sput v1, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    const-string v1, "\u06e8\u06e2\u06e1"

    invoke-static {v1}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_a
    sget v1, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v4, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    add-int/2addr v1, v4

    const v4, 0x1ab014

    add-int/2addr v1, v4

    goto/16 :goto_0

    :cond_b
    :sswitch_e
    sget v1, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v4, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    rem-int/lit16 v4, v4, -0x1c08

    add-int/2addr v1, v4

    if-ltz v1, :cond_c

    const-string v1, "\u06e4\u06e2\u06e2"

    goto :goto_5

    :cond_c
    sget v1, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v4, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sub-int/2addr v1, v4

    const v4, 0x1acab0

    add-int/2addr v1, v4

    goto/16 :goto_0

    :cond_d
    :sswitch_f
    sget v1, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sget v4, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    add-int/lit16 v4, v4, 0x1d60

    mul-int/2addr v1, v4

    if-ltz v1, :cond_e

    const/16 v1, 0x17

    sput v1, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    const-string v1, "\u06e6\u06e8\u06e8"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_e
    sget v1, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v4, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    add-int/2addr v1, v4

    const v4, -0x1ac86c

    xor-int/2addr v1, v4

    goto/16 :goto_0

    :sswitch_10
    instance-of v1, p1, Lq9;

    if-nez v1, :cond_b

    invoke-static {}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟ۧ۟ۥۧ()I

    move-result v1

    if-gtz v1, :cond_10

    invoke-static {}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۦۥۨۦ()I

    :cond_f
    const-string v1, "\u06df\u06e6\u06e8"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_10
    sget v1, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v4, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    rem-int/2addr v1, v4

    const v4, 0x1abadd

    add-int/2addr v1, v4

    goto/16 :goto_0

    :sswitch_11
    move v0, v2

    goto/16 :goto_3

    :sswitch_12
    move v0, v3

    goto/16 :goto_3

    :sswitch_13
    move v0, v2

    goto/16 :goto_3

    :sswitch_14
    iget v1, p0, Lq9;->e:I

    iget v4, v0, Lq9;->e:I

    if-eq v1, v4, :cond_9

    const-string v1, "\u06e6\u06df"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_15
    sget v1, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sget v4, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    add-int/lit16 v4, v4, 0x5a0

    div-int/2addr v1, v4

    if-eqz v1, :cond_11

    invoke-static {}, Landroidx/activity/result/۟۠۟۠ۦ;->۟ۢۡ۠()I

    const-string v1, "\u06e1\u06e2"

    invoke-static {v1}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_11
    sget v1, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v4, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    div-int/2addr v1, v4

    const v4, 0x1abe06

    xor-int/2addr v1, v4

    goto/16 :goto_0

    :sswitch_16
    iget-object v1, p0, Lq9;->a:Ljava/lang/Object;

    iget-object v4, v0, Lq9;->a:Ljava/lang/Object;

    invoke-static {v1, v4}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    invoke-static {}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۤۥۣ۟()I

    move-result v1

    if-ltz v1, :cond_f

    :cond_12
    const-string v1, "\u06e6\u06e5\u06e2"

    invoke-static {v1}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_17
    move v0, v2

    goto/16 :goto_3

    :sswitch_data_0
    .sparse-switch
        0xdc5e -> :sswitch_0
        0xdcb9 -> :sswitch_7
        0xdcff -> :sswitch_d
        0x1aa7e1 -> :sswitch_17
        0x1aab41 -> :sswitch_e
        0x1aaf25 -> :sswitch_6
        0x1ab24a -> :sswitch_16
        0x1ab2a6 -> :sswitch_b
        0x1aba7e -> :sswitch_8
        0x1aba9d -> :sswitch_11
        0x1abe06 -> :sswitch_4
        0x1ac203 -> :sswitch_5
        0x1ac50b -> :sswitch_13
        0x1ac54a -> :sswitch_c
        0x1ac587 -> :sswitch_f
        0x1ac5e3 -> :sswitch_a
        0x1ac605 -> :sswitch_12
        0x1ac8c9 -> :sswitch_10
        0x1ac8cf -> :sswitch_2
        0x1ac8ec -> :sswitch_14
        0x1ac908 -> :sswitch_9
        0x1ac94a -> :sswitch_1
        0x1ac9a1 -> :sswitch_15
        0x1ac9e0 -> :sswitch_3
    .end sparse-switch
.end method

.method public final hashCode()I
    .locals 7

    const/4 v2, 0x0

    const-string v0, "\u06e3\u06e4\u06e8"

    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v6

    move v3, v2

    move v0, v2

    move v4, v2

    move v1, v2

    move v5, v2

    :goto_0
    sparse-switch v6, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v2, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v6, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    mul-int/lit16 v6, v6, 0x23fd

    rem-int/2addr v2, v6

    if-ltz v2, :cond_4

    invoke-static {}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣۢ۠۠()I

    const-string v2, "\u06e0\u06e6\u06e8"

    invoke-static {v2}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto :goto_0

    :sswitch_1
    iget-wide v2, p0, Lq9;->d:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    sget v3, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v6, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sub-int/2addr v3, v6

    const v6, 0x1aab1e

    add-int/2addr v6, v3

    move v3, v2

    goto :goto_0

    :sswitch_2
    iget v1, p0, Lq9;->e:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/lit8 v1, v1, -0x13

    rsub-int/lit8 v2, v3, 0x0

    sub-int v0, v2, v0

    rsub-int/lit8 v0, v0, 0x0

    mul-int/2addr v0, v4

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x13

    return v0

    :sswitch_3
    iget-object v1, p0, Lq9;->a:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    sget v2, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sget v6, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    div-int/lit16 v6, v6, 0x974

    sub-int/2addr v2, v6

    if-gtz v2, :cond_1

    :cond_0
    const-string v2, "\u06e7\u06e1\u06e3"

    :goto_1
    invoke-static {v2}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto :goto_0

    :cond_1
    const-string v2, "\u06e4\u06e6\u06e0"

    goto :goto_1

    :sswitch_4
    sget v2, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    xor-int/lit16 v2, v2, 0x273

    sget v4, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v6, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    add-int/lit16 v6, v6, 0x208

    div-int/2addr v4, v6

    if-eqz v4, :cond_2

    const-string v4, "\u06e3\u06e4\u06e8"

    invoke-static {v4}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v6

    move v4, v2

    goto :goto_0

    :cond_2
    const-string v4, "\u06e1\u06e5\u06e3"

    invoke-static {v4}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v6

    move v4, v2

    goto :goto_0

    :sswitch_5
    iget-object v0, p0, Lq9;->c:Ljava/lang/String;

    invoke-static {v0, v5, v4}, Lg40;->e(Ljava/lang/String;II)I

    move-result v0

    sget v2, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v6, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    or-int/lit16 v6, v6, -0x8f1

    rem-int/2addr v2, v6

    if-gtz v2, :cond_0

    invoke-static {}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۨۧ۟ۤ()I

    const-string v2, "\u06e4\u06e6\u06e0"

    invoke-static {v2}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :sswitch_6
    iget v2, p0, Lq9;->b:I

    mul-int v5, v1, v4

    invoke-static {v2, v5, v4}, Lg40;->d(III)I

    move-result v2

    sget v5, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    if-ltz v5, :cond_3

    const/16 v5, 0x3b

    sput v5, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    :cond_3
    const-string v5, "\u06df\u06e1\u06e7"

    invoke-static {v5}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v6

    move v5, v2

    goto/16 :goto_0

    :cond_4
    sget v2, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    sget v6, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    rem-int/2addr v2, v6

    const v6, 0x1ab8cb

    add-int/2addr v2, v6

    move v6, v2

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc84 -> :sswitch_0
        0x1aa745 -> :sswitch_5
        0x1aa762 -> :sswitch_2
        0x1aaf3f -> :sswitch_6
        0x1ab6a7 -> :sswitch_3
        0x1aba9e -> :sswitch_4
        0x1ac549 -> :sswitch_1
    .end sparse-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const/16 v4, 0x1c

    const/4 v1, 0x0

    const-string v0, "\u06e0\u06e5\u06df"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget-object v0, p0, Lq9;->c:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟۠ۢۨۦ()I

    move-result v0

    if-gtz v0, :cond_8

    :cond_0
    const-string v0, "\u06e5\u06e8\u06e2"

    :goto_1
    invoke-static {v0}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_1
    iget v0, p0, Lq9;->e:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    sget v0, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v2, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    or-int/lit16 v2, v2, 0x1ca7

    sub-int/2addr v0, v2

    if-gtz v0, :cond_1

    invoke-static {}, Lcom/google/android/material/button/ۥۤ۠;->۠۠ۨۢ()I

    const-string v0, "\u06e5\u06e1"

    :goto_2
    invoke-static {v0}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e3\u06e3\u06e7"

    goto :goto_2

    :sswitch_2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MsgData(msgInfo="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget v1, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    if-gtz v1, :cond_2

    const-string v1, "\u06e3\u06e3\u06e7"

    invoke-static {v1}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :cond_2
    const-string v1, "\u06e4\u06e0\u06e2"

    move-object v2, v1

    :goto_3
    invoke-static {v2}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :sswitch_3
    sget v0, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v2, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    xor-int/lit16 v2, v2, 0x1479

    or-int/2addr v0, v2

    if-ltz v0, :cond_3

    const-string v0, "\u06e2\u06e3"

    :goto_4
    invoke-static {v0}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e0\u06e5\u06df"

    invoke-static {v0}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_4
    iget-wide v2, p0, Lq9;->d:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, "\u06e1\u06df\u06e2"

    :goto_5
    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_5
    iget v0, p0, Lq9;->b:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    sget v0, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v2, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    xor-int/lit16 v2, v2, 0x42f

    div-int/2addr v0, v2

    if-eqz v0, :cond_4

    const/4 v0, 0x4

    sput v0, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    const-string v0, "\u06e6\u06e0\u06e7"

    :goto_6
    invoke-static {v0}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_4
    const-string v0, "\u06e2\u06e8\u06e6"

    goto :goto_6

    :sswitch_6
    const-string v0, ", msgId="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۟۟۟ۢ()I

    move-result v0

    if-gtz v0, :cond_0

    sput v4, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    const-string v0, "\u06e3\u06e8\u06e7"

    invoke-static {v0}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_7
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_8
    const-string v0, ", talker="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\u06e5\u06e1"

    goto/16 :goto_1

    :sswitch_9
    const-string v0, ", type="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v0, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    if-gtz v0, :cond_5

    const-string v0, "\u06e0\u06e5\u06e5"

    :goto_7
    invoke-static {v0}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06e3\u06e8\u06e7"

    goto :goto_7

    :sswitch_a
    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v0, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v2, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    add-int/lit16 v2, v2, -0x39a

    mul-int/2addr v0, v2

    if-gtz v0, :cond_6

    sput v4, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    const-string v2, "\u06e0\u06e5\u06df"

    move-object v0, v1

    goto/16 :goto_3

    :cond_6
    const-string v0, "\u06e6\u06e0\u06e7"

    goto/16 :goto_1

    :sswitch_b
    iget-object v0, p0, Lq9;->a:Ljava/lang/Object;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget v0, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    if-ltz v0, :cond_7

    const-string v0, "\u06e4\u06e0\u06e2"

    goto :goto_5

    :cond_7
    sget v0, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v2, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    add-int/2addr v0, v2

    const v2, 0x1ac1c5

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :cond_8
    const-string v0, "\u06e0\u06e4\u06e3"

    goto/16 :goto_4

    :sswitch_c
    const-string v0, ", isSend="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v0, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v2, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    rem-int/lit16 v2, v2, -0x2500

    rem-int/2addr v0, v2

    if-gtz v0, :cond_9

    const/16 v0, 0x4f

    sput v0, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    const-string v0, "\u06e2\u06e8\u06e6"

    invoke-static {v0}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_9
    sget v0, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v2, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    div-int/2addr v0, v2

    const v2, 0x1aab90

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc9c -> :sswitch_0
        0x1aab5f -> :sswitch_6
        0x1aab7a -> :sswitch_2
        0x1aab80 -> :sswitch_1
        0x1aae84 -> :sswitch_c
        0x1ab360 -> :sswitch_8
        0x1ab687 -> :sswitch_a
        0x1ab722 -> :sswitch_5
        0x1ab9e6 -> :sswitch_b
        0x1abe9f -> :sswitch_4
        0x1ac16d -> :sswitch_7
        0x1ac1c7 -> :sswitch_9
        0x1ac266 -> :sswitch_3
    .end sparse-switch
.end method
