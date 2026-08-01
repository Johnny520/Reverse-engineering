.class public final Lxv;
.super Ljava/lang/Object;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I


# direct methods
.method public constructor <init>(IIIIIIII)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e5\u06e6\u06e7"

    invoke-static {v1}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Landroidx/core/app/ۡۤۡ۠;->ۨۥۨۧ()I

    move-result v0

    if-ltz v0, :cond_4

    sget v0, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    if-gtz v0, :cond_9

    const-string v0, "\u06e2\u06e4\u06e4"

    invoke-static {v0}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_1
    iput p3, p0, Lxv;->c:I

    sget v0, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v2, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    mul-int/lit16 v2, v2, -0x2067

    sub-int/2addr v0, v2

    if-gtz v0, :cond_0

    const/16 v0, 0x2a

    sput v0, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    const-string v0, "\u06e1\u06e2\u06e0"

    invoke-static {v0}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    sget v0, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v2, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    mul-int/2addr v0, v2

    const v2, 0x200c6d

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_2
    iput p6, p0, Lxv;->f:I

    invoke-static {}, Landroid/window/ۣۤ۠ۢ;->ۧۢۦ۟()I

    move-result v0

    if-gtz v0, :cond_1

    const/16 v0, 0x1c

    sput v0, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    const-string v0, "\u06e8\u06e0\u06e2"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e8\u06e0\u06e4"

    goto :goto_1

    :sswitch_3
    iput p7, p0, Lxv;->g:I

    sget v0, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    if-ltz v0, :cond_3

    invoke-static {}, Lcom/google/android/material/button/ۥۤ۠;->۠۠ۨۢ()I

    :cond_2
    const-string v0, "\u06e4\u06e8\u06e2"

    :goto_2
    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e2\u06e4\u06e1"

    :goto_3
    invoke-static {v0}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_4
    :sswitch_4
    sget v0, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v2, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    or-int/lit16 v2, v2, -0x94f

    mul-int/2addr v0, v2

    if-gtz v0, :cond_5

    const-string v0, "\u06e5\u06e0\u06e6"

    goto :goto_3

    :cond_5
    sget v0, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v2, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sub-int/2addr v0, v2

    const v2, 0x1aace1

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_5
    iput p2, p0, Lxv;->b:I

    const-string v0, "\u06e8\u06e0\u06e2"

    goto :goto_2

    :sswitch_6
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v2, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    or-int/lit16 v2, v2, 0x13b7

    add-int/2addr v0, v2

    if-ltz v0, :cond_6

    invoke-static {}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۤۥۣ۟()I

    const-string v0, "\u06e8\u06e2\u06e5"

    invoke-static {v0}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_6
    const-string v0, "\u06e1\u06e2\u06e0"

    goto :goto_3

    :sswitch_7
    iput p8, p0, Lxv;->h:I

    sget v0, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    if-gtz v0, :cond_7

    const-string v0, "\u06df\u06e1\u06e7"

    invoke-static {v0}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_7
    const-string v0, "\u06e5\u06e4"

    :goto_4
    invoke-static {v0}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_8
    iput p1, p0, Lxv;->a:I

    sget v0, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v2, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    rem-int/lit16 v2, v2, -0xdc4

    rem-int/2addr v0, v2

    if-gtz v0, :cond_2

    const/16 v0, 0x60

    sput v0, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    const-string v0, "\u06e5\u06e6\u06e7"

    goto :goto_4

    :sswitch_9
    iput p4, p0, Lxv;->d:I

    sget v0, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v2, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    xor-int/lit16 v2, v2, 0xc2e

    add-int/2addr v0, v2

    if-gtz v0, :cond_8

    invoke-static {}, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۦۣ۠()I

    const-string v0, "\u06e0\u06e5\u06e2"

    :goto_5
    invoke-static {v0}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_8
    const-string v0, "\u06df\u06e6\u06df"

    goto :goto_5

    :cond_9
    const-string v0, "\u06df\u06e1\u06e7"

    goto :goto_4

    :sswitch_a
    sget v0, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v2, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    rem-int/2addr v0, v2

    const v2, -0x1abe39

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_b
    iput p5, p0, Lxv;->e:I

    sget v0, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v2, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    mul-int/lit16 v2, v2, 0x1a23

    sub-int/2addr v0, v2

    if-ltz v0, :cond_a

    invoke-static {}, Landroidx/core/content/ۣۧۡۤ;->۟ۦۦ۠ۡ()I

    const-string v0, "\u06e5\u06e4"

    invoke-static {v0}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_a
    sget v0, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v2, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    or-int/2addr v0, v2

    const v2, 0x1aac87

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_c
    const-string v0, "F712MqZe"

    invoke-static {v0}, Lcom/google/android/material/button/ۥۤ۠;->ۧ۠۠ۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    invoke-static {}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->۠ۨۦۥ()I

    move-result v0

    if-gtz v0, :cond_b

    const-string v0, "\u06df\u06e6\u06df"

    :goto_6
    invoke-static {v0}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_b
    const-string v0, "\u06e0\u06e3\u06e5"

    goto :goto_6

    :sswitch_d
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc9f -> :sswitch_0
        0x1aa745 -> :sswitch_c
        0x1aa7d8 -> :sswitch_b
        0x1aab42 -> :sswitch_6
        0x1aab7d -> :sswitch_2
        0x1aaedf -> :sswitch_d
        0x1ab2df -> :sswitch_7
        0x1ab2e2 -> :sswitch_a
        0x1ab9e3 -> :sswitch_9
        0x1abade -> :sswitch_5
        0x1abe66 -> :sswitch_8
        0x1ac8ea -> :sswitch_1
        0x1ac8ec -> :sswitch_3
        0x1ac92b -> :sswitch_4
    .end sparse-switch
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v4, 0x1

    const/4 v3, 0x0

    const/4 v1, 0x0

    const-string v0, "\u06e1\u06e7\u06e5"

    invoke-static {v0}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    move v0, v3

    :goto_1
    return v0

    :sswitch_1
    iget v0, p0, Lxv;->b:I

    iget v2, v1, Lxv;->b:I

    if-eq v0, v2, :cond_15

    const-string v0, "\u06e5\u06e2\u06e1"

    :goto_2
    invoke-static {v0}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    :sswitch_2
    sget v0, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v2, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    div-int/lit16 v2, v2, -0x1d6

    mul-int/2addr v0, v2

    if-gtz v0, :cond_1

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟ۧ۠ۧۢ()I

    const-string v0, "\u06e5\u06e1\u06e5"

    :goto_3
    invoke-static {v0}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    sget v0, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v2, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    or-int/2addr v0, v2

    const v2, 0x1aacc6

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :cond_2
    :sswitch_3
    sget v0, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v2, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    div-int/lit16 v2, v2, 0x15b8

    mul-int/2addr v0, v2

    if-eqz v0, :cond_3

    invoke-static {}, Lcom/google/android/material/carousel/۠۟ۧۤ;->۟ۡۡۨۥ()I

    const-string v0, "\u06e2\u06e3"

    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e6\u06e5\u06e1"

    :goto_4
    invoke-static {v0}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_4
    move v0, v3

    goto :goto_1

    :sswitch_5
    iget v0, p0, Lxv;->c:I

    iget v2, v1, Lxv;->c:I

    if-eq v0, v2, :cond_b

    invoke-static {}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦۥۣۥ()I

    move-result v0

    if-ltz v0, :cond_4

    const-string v0, "\u06e6\u06e5\u06e1"

    invoke-static {v0}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_4
    sget v0, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v2, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    add-int/2addr v0, v2

    const v2, -0xdc0e

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_6
    move v0, v3

    goto :goto_1

    :cond_5
    :sswitch_7
    sget v0, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v2, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    or-int/lit16 v2, v2, 0xc2f

    rem-int/2addr v0, v2

    if-ltz v0, :cond_6

    const/16 v0, 0x23

    sput v0, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    const-string v0, "\u06e8\u06e8\u06e6"

    invoke-static {v0}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_6
    const-string v0, "\u06e1\u06e4\u06e4"

    goto :goto_3

    :cond_7
    :sswitch_8
    sget v0, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    if-ltz v0, :cond_8

    const/16 v0, 0x1c

    sput v0, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    const-string v0, "\u06e7\u06e6\u06e2"

    :goto_5
    invoke-static {v0}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_8
    const-string v0, "\u06e0\u06df\u06e5"

    goto :goto_5

    :cond_9
    :sswitch_9
    invoke-static {}, Landroidx/activity/۟ۥۥۧ۠;->۟ۥۥۤ۟()I

    move-result v0

    if-ltz v0, :cond_a

    const/16 v0, 0x1f

    sput v0, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    const-string v0, "\u06e3\u06e7\u06e4"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_a
    const-string v0, "\u06e7\u06e5\u06e5"

    invoke-static {v0}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_a
    move v0, v4

    goto/16 :goto_1

    :cond_b
    :sswitch_b
    invoke-static {}, Landroidx/core/app/ۡۤۡ۠;->ۨۥۨۧ()I

    move-result v0

    if-ltz v0, :cond_c

    const/16 v0, 0x8

    sput v0, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    const-string v0, "\u06e5\u06e3\u06e5"

    goto/16 :goto_4

    :cond_c
    const-string v0, "\u06df\u06e7\u06e2"

    :goto_6
    invoke-static {v0}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_d
    :sswitch_c
    sget v0, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    if-gtz v0, :cond_e

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۤ۠ۤۢ()I

    const-string v2, "\u06e7\u06e6\u06df"

    move-object v0, v1

    :goto_7
    invoke-static {v2}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto/16 :goto_0

    :cond_e
    const-string v0, "\u06e0\u06e8\u06df"

    invoke-static {v0}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_d
    if-ne p0, p1, :cond_d

    invoke-static {}, L۟ۤۧۦۢ;->ۣ۟۟ۢ۟()I

    move-result v0

    if-ltz v0, :cond_f

    invoke-static {}, Lcom/google/android/material/carousel/۠۟ۧۤ;->۟ۡۡۨۥ()I

    const-string v0, "\u06e4\u06e1\u06e3"

    invoke-static {v0}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_f
    const-string v0, "\u06df\u06e7\u06e3"

    invoke-static {v0}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_e
    iget v0, p0, Lxv;->h:I

    iget v2, v1, Lxv;->h:I

    if-eq v0, v2, :cond_13

    invoke-static {}, Landroidx/activity/۟ۥۥۧ۠;->۟ۥۥۤ۟()I

    move-result v0

    if-ltz v0, :cond_16

    :cond_10
    const-string v0, "\u06e8\u06e2"

    invoke-static {v0}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_f
    sget v0, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v2, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    rem-int/lit16 v2, v2, -0x1beb

    add-int/2addr v0, v2

    if-ltz v0, :cond_11

    const/16 v0, 0x53

    sput v0, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    const-string v0, "\u06e5\u06e2\u06e3"

    goto :goto_6

    :cond_11
    const-string v0, "\u06e1\u06e7\u06e5"

    goto :goto_6

    :sswitch_10
    move v0, v4

    goto/16 :goto_1

    :sswitch_11
    move-object v0, p1

    check-cast v0, Lxv;

    iget v1, p0, Lxv;->a:I

    iget v2, v0, Lxv;->a:I

    if-eq v1, v2, :cond_14

    sget v1, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v2, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    div-int/lit16 v2, v2, -0x520

    xor-int/2addr v1, v2

    if-gtz v1, :cond_12

    const/16 v1, 0x39

    sput v1, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    const-string v1, "\u06e0\u06df\u06e5"

    invoke-static {v1}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto/16 :goto_0

    :cond_12
    const-string v1, "\u06e4\u06e1\u06e3"

    move-object v2, v1

    goto :goto_7

    :cond_13
    :sswitch_12
    sget v0, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v2, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sub-int/2addr v0, v2

    const v2, 0x1aa24e

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_13
    move-object v0, v1

    :cond_14
    sget v1, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v2, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    rem-int/2addr v1, v2

    const v2, 0x1ab643

    add-int/2addr v2, v1

    move-object v1, v0

    goto/16 :goto_0

    :cond_15
    :sswitch_14
    const-string v0, "\u06e1\u06e7"

    goto/16 :goto_6

    :sswitch_15
    iget v0, p0, Lxv;->e:I

    iget v2, v1, Lxv;->e:I

    if-eq v0, v2, :cond_2

    const-string v0, "\u06e2\u06e0\u06e1"

    goto/16 :goto_6

    :sswitch_16
    move v0, v3

    goto/16 :goto_1

    :sswitch_17
    move v0, v3

    goto/16 :goto_1

    :sswitch_18
    instance-of v0, p1, Lxv;

    if-nez v0, :cond_9

    const-string v0, "\u06e8\u06e4\u06df"

    invoke-static {v0}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_19
    move v0, v3

    goto/16 :goto_1

    :sswitch_1a
    move v0, v3

    goto/16 :goto_1

    :sswitch_1b
    iget v0, p0, Lxv;->g:I

    iget v2, v1, Lxv;->g:I

    if-eq v0, v2, :cond_5

    invoke-static {}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۨۧ۟ۤ()I

    move-result v0

    if-ltz v0, :cond_10

    const/16 v0, 0x31

    sput v0, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    const-string v0, "\u06e2\u06e0\u06e1"

    invoke-static {v0}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_1c
    move v0, v3

    goto/16 :goto_1

    :sswitch_1d
    iget v0, p0, Lxv;->d:I

    iget v2, v1, Lxv;->d:I

    if-eq v0, v2, :cond_7

    sget v0, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v2, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    add-int/lit16 v2, v2, 0xbbe

    mul-int/2addr v0, v2

    if-ltz v0, :cond_17

    :cond_16
    const-string v0, "\u06e7\u06e4\u06e5"

    invoke-static {v0}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_17
    sget v0, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v2, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    mul-int/2addr v0, v2

    const v2, 0x1612e8

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_1e
    move v0, v3

    goto/16 :goto_1

    :sswitch_1f
    iget v0, p0, Lxv;->f:I

    iget v2, v1, Lxv;->f:I

    if-eq v0, v2, :cond_0

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۧۡۥۦ()I

    move-result v0

    if-ltz v0, :cond_18

    invoke-static {}, Lۤۨۤۨ;->۟ۢۦۣۢ()I

    const-string v0, "\u06e0\u06e7\u06e2"

    goto/16 :goto_2

    :cond_18
    sget v0, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v2, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    add-int/2addr v0, v2

    const v2, 0x1ab635

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdc00 -> :sswitch_0
        0xdc26 -> :sswitch_5
        0xdcde -> :sswitch_b
        0xdcfa -> :sswitch_17
        0x1aa71e -> :sswitch_10
        0x1aa7fa -> :sswitch_1d
        0x1aa7fb -> :sswitch_a
        0x1aaac6 -> :sswitch_15
        0x1aaac9 -> :sswitch_8
        0x1aabbb -> :sswitch_12
        0x1aabd7 -> :sswitch_18
        0x1aaf21 -> :sswitch_e
        0x1aaf41 -> :sswitch_1b
        0x1aaf7f -> :sswitch_d
        0x1ab263 -> :sswitch_1e
        0x1ab684 -> :sswitch_1
        0x1ab69f -> :sswitch_1a
        0x1aba06 -> :sswitch_4
        0x1aba29 -> :sswitch_3
        0x1aba61 -> :sswitch_14
        0x1aba87 -> :sswitch_f
        0x1abaa1 -> :sswitch_7
        0x1abaa2 -> :sswitch_c
        0x1abde4 -> :sswitch_16
        0x1abe7e -> :sswitch_1c
        0x1ac202 -> :sswitch_1f
        0x1ac52f -> :sswitch_2
        0x1ac5a7 -> :sswitch_13
        0x1ac5a8 -> :sswitch_6
        0x1ac5c7 -> :sswitch_11
        0x1ac92c -> :sswitch_9
        0x1ac963 -> :sswitch_19
    .end sparse-switch
.end method

.method public final hashCode()I
    .locals 10

    const/4 v0, 0x0

    const-string v1, "\u06e3\u06e0\u06e1"

    invoke-static {v1}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v9

    move v2, v0

    move v4, v0

    move v5, v0

    move v3, v0

    move v1, v0

    move v6, v0

    move v7, v0

    move v8, v0

    :goto_0
    sparse-switch v9, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v9, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    mul-int/lit16 v9, v9, 0x1819

    rem-int/2addr v0, v9

    if-gtz v0, :cond_4

    invoke-static {}, Landroid/window/ۣۧ۟۠;->ۣۡ۟ۢ()I

    const-string v0, "\u06e2\u06e3\u06e0"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto :goto_0

    :sswitch_1
    iget v0, p0, Lxv;->c:I

    invoke-static {v0, v7, v5}, Lg40;->d(III)I

    move-result v0

    sget v6, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v9, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    add-int/lit16 v9, v9, -0x1df4

    sub-int/2addr v6, v9

    if-gtz v6, :cond_0

    const/16 v6, 0x2c

    sput v6, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    const-string v6, "\u06e0\u06e4\u06e6"

    invoke-static {v6}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v9

    move v6, v0

    goto :goto_0

    :cond_0
    sget v6, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v9, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    xor-int/2addr v6, v9

    const v9, -0x1ab730

    xor-int/2addr v9, v6

    move v6, v0

    goto :goto_0

    :sswitch_2
    iget v0, p0, Lxv;->g:I

    invoke-static {v0, v8, v5}, Lg40;->d(III)I

    move-result v0

    sget v4, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    if-ltz v4, :cond_1

    :cond_1
    const-string v4, "\u06e8\u06e2\u06e2"

    invoke-static {v4}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v9

    move v4, v0

    goto :goto_0

    :sswitch_3
    iget v0, p0, Lxv;->e:I

    invoke-static {v0, v3, v5}, Lg40;->d(III)I

    move-result v1

    sget v0, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v9, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    add-int/lit16 v9, v9, 0x222d

    rem-int/2addr v0, v9

    if-gtz v0, :cond_2

    const/16 v0, 0xc

    sput v0, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    const-string v0, "\u06df\u06e3"

    invoke-static {v0}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e3\u06e6\u06e3"

    goto :goto_1

    :sswitch_4
    sget v0, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    xor-int/lit16 v0, v0, -0x2f0

    sget v5, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v9, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    rem-int/lit16 v9, v9, 0x20cb

    div-int/2addr v5, v9

    if-ltz v5, :cond_3

    const/16 v5, 0x20

    sput v5, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    const-string v5, "\u06e4\u06e2\u06e2"

    invoke-static {v5}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v9

    move v5, v0

    goto/16 :goto_0

    :cond_3
    sget v5, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v9, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    rem-int/2addr v5, v9

    const v9, 0x1aa523

    add-int/2addr v9, v5

    move v5, v0

    goto/16 :goto_0

    :cond_4
    sget v0, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v9, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    rem-int/2addr v0, v9

    const v9, 0x1ab614

    xor-int/2addr v0, v9

    move v9, v0

    goto/16 :goto_0

    :sswitch_5
    iget v0, p0, Lxv;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    sget v0, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v9, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    add-int/lit16 v9, v9, -0x15b6

    add-int/2addr v0, v9

    if-ltz v0, :cond_5

    const/16 v0, 0x57

    sput v0, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    const-string v0, "\u06df\u06df\u06e0"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06e4\u06e2\u06e2"

    :goto_2
    invoke-static {v0}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto/16 :goto_0

    :sswitch_6
    iget v0, p0, Lxv;->h:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    rsub-int/lit8 v0, v0, 0x0

    sub-int/2addr v0, v4

    rsub-int/lit8 v0, v0, 0x0

    return v0

    :sswitch_7
    iget v0, p0, Lxv;->f:I

    invoke-static {v0, v1, v5}, Lg40;->d(III)I

    move-result v0

    sget v8, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v9, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    rem-int/2addr v8, v9

    const v9, 0x1aaa0d

    add-int/2addr v9, v8

    move v8, v0

    goto/16 :goto_0

    :sswitch_8
    iget v0, p0, Lxv;->d:I

    invoke-static {v0, v6, v5}, Lg40;->d(III)I

    move-result v3

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۤ۟ۦ۟()I

    move-result v0

    if-ltz v0, :cond_6

    const/16 v0, 0x18

    sput v0, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    const-string v0, "\u06e3\u06e0\u06e1"

    goto :goto_2

    :cond_6
    sget v0, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v9, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    mul-int/2addr v0, v9

    const v9, 0x1c4102

    add-int/2addr v0, v9

    move v9, v0

    goto/16 :goto_0

    :sswitch_9
    iget v0, p0, Lxv;->b:I

    mul-int v7, v2, v5

    invoke-static {v0, v7, v5}, Lg40;->d(III)I

    move-result v0

    sget v7, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    if-ltz v7, :cond_7

    const-string v7, "\u06e3\u06e6\u06e3"

    invoke-static {v7}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v9

    move v7, v0

    goto/16 :goto_0

    :cond_7
    const-string v7, "\u06df\u06df\u06e0"

    invoke-static {v7}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v9

    move v7, v0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe4 -> :sswitch_0
        0x1aa700 -> :sswitch_1
        0x1aa7e1 -> :sswitch_9
        0x1aa81a -> :sswitch_2
        0x1aab62 -> :sswitch_3
        0x1ab624 -> :sswitch_5
        0x1ab688 -> :sswitch_8
        0x1ab6e0 -> :sswitch_7
        0x1aba24 -> :sswitch_4
        0x1ac928 -> :sswitch_6
    .end sparse-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    const-string v1, "\u06e7\u06e7\u06df"

    invoke-static {v1}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v0, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    if-gtz v0, :cond_b

    const/16 v0, 0x45

    sput v0, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    const-string v0, "\u06e7\u06e7\u06df"

    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_1
    const-string v0, ", ripple="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v0, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v2, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    or-int/lit16 v2, v2, -0xef4

    or-int/2addr v0, v2

    if-ltz v0, :cond_c

    const/16 v0, 0x24

    sput v0, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    const-string v0, "\u06e7\u06e5\u06e6"

    invoke-static {v0}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_2
    const-string v0, ", textSub="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    const-string v0, "\u06e5\u06e8\u06e0"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_3
    const-string v0, ", textMain="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v0, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v2, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    mul-int/2addr v0, v2

    const v2, 0x149cdb

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_4
    iget v0, p0, Lxv;->h:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    sget v0, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sget v2, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    add-int/lit16 v2, v2, -0x18d7

    rem-int/2addr v0, v2

    if-ltz v0, :cond_2

    const/16 v0, 0x12

    sput v0, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    :cond_1
    const-string v0, "\u06e2\u06e3\u06e2"

    invoke-static {v0}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    sget v0, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v2, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    div-int/2addr v0, v2

    const v2, 0x1aa764

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_5
    const-string v0, ", handle="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v0, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v2, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    rem-int/2addr v0, v2

    const v2, 0x1acaf8

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_6
    const-string v0, ", accentDark="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->ۤ۠ۡۧ()I

    move-result v0

    if-ltz v0, :cond_3

    const/16 v0, 0xb

    sput v0, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    :cond_3
    const-string v0, "\u06e3\u06e4\u06e4"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_7
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ThemeConfig(bg="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget v1, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v2, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    rem-int/lit16 v2, v2, 0x1cac

    add-int/2addr v1, v2

    if-gtz v1, :cond_4

    const/16 v1, 0x19

    sput v1, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    const-string v1, "\u06e5\u06e7\u06e6"

    invoke-static {v1}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto/16 :goto_0

    :cond_4
    sget v1, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v2, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    or-int/2addr v1, v2

    const v2, 0x1ac9c8

    add-int/2addr v2, v1

    move-object v1, v0

    goto/16 :goto_0

    :sswitch_8
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_9
    iget v0, p0, Lxv;->d:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "\u06e1\u06e2\u06e7"

    :goto_2
    invoke-static {v0}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_a
    sget v0, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v2, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    div-int/2addr v0, v2

    const v2, 0x1ac5fe

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_b
    iget v0, p0, Lxv;->b:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    sget v0, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v2, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    add-int/lit16 v2, v2, -0x9a0

    div-int/2addr v0, v2

    if-eqz v0, :cond_6

    :cond_5
    const-string v0, "\u06e0\u06e4\u06e3"

    invoke-static {v0}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_6
    sget v0, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v2, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    mul-int/2addr v0, v2

    const v2, -0x1d275e

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_c
    const-string v0, ", accent="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟۠ۢۧۡ()I

    move-result v0

    if-ltz v0, :cond_7

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۦۢۢۢ()I

    const-string v0, "\u06e1\u06e2\u06e7"

    invoke-static {v0}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_7
    const-string v0, "\u06e4\u06e7\u06df"

    :goto_3
    invoke-static {v0}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_d
    const-string v0, ", card="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v0, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v2, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    add-int/lit16 v2, v2, -0x19e

    or-int/2addr v0, v2

    if-ltz v0, :cond_8

    const/16 v0, 0x3c

    sput v0, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    const-string v0, "\u06e1\u06e7\u06df"

    goto :goto_2

    :cond_8
    const-string v0, "\u06e5\u06e7\u06e6"

    goto/16 :goto_1

    :sswitch_e
    iget v0, p0, Lxv;->e:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    sget v0, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v2, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    add-int/lit8 v2, v2, -0x14

    sub-int/2addr v0, v2

    if-ltz v0, :cond_9

    invoke-static {}, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۡۥ()I

    const-string v0, "\u06e0\u06e0\u06e2"

    goto :goto_3

    :cond_9
    sget v0, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    sget v2, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    add-int/2addr v0, v2

    const v2, 0x1acdea

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_f
    iget v0, p0, Lxv;->f:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    sget v0, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v2, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    add-int/lit16 v2, v2, -0x202a

    add-int/2addr v0, v2

    if-ltz v0, :cond_5

    const/16 v0, 0x52

    sput v0, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    const-string v0, "\u06e4\u06e7\u06df"

    invoke-static {v0}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_10
    iget v0, p0, Lxv;->c:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    sget v0, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v2, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    div-int/lit16 v2, v2, 0xd81

    xor-int/2addr v0, v2

    if-gtz v0, :cond_a

    const/16 v0, 0x22

    sput v0, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    const-string v0, "\u06e1\u06df\u06df"

    invoke-static {v0}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_a
    const-string v0, "\u06e5\u06e6\u06e7"

    invoke-static {v0}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_b
    sget v0, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v2, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    or-int/2addr v0, v2

    const v2, 0x1aaaef

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_11
    iget v0, p0, Lxv;->a:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    sget v0, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v2, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    mul-int/lit16 v2, v2, -0x8f7

    or-int/2addr v0, v2

    if-lez v0, :cond_0

    const-string v0, "\u06e3\u06df\u06e4"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_12
    iget v0, p0, Lxv;->g:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    sget v0, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    if-gtz v0, :cond_1

    const/16 v0, 0x32

    sput v0, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    :cond_c
    const-string v0, "\u06e5\u06e4\u06e5"

    invoke-static {v0}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0x1aa764 -> :sswitch_0
        0x1aaae2 -> :sswitch_8
        0x1aab5f -> :sswitch_5
        0x1aae81 -> :sswitch_10
        0x1aaee6 -> :sswitch_c
        0x1aaf79 -> :sswitch_a
        0x1ab2c1 -> :sswitch_1
        0x1ab608 -> :sswitch_d
        0x1ab6a3 -> :sswitch_f
        0x1ababc -> :sswitch_e
        0x1abe26 -> :sswitch_4
        0x1abe66 -> :sswitch_2
        0x1abe84 -> :sswitch_b
        0x1abe9d -> :sswitch_9
        0x1ac5c8 -> :sswitch_3
        0x1ac5ff -> :sswitch_7
        0x1ac8ed -> :sswitch_12
        0x1ac9a3 -> :sswitch_11
        0x1ac9c0 -> :sswitch_6
    .end sparse-switch
.end method
