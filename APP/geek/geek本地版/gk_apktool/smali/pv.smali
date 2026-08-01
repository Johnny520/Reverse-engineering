.class public final Lpv;
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

    const-string v1, "\u06e6\u06e8\u06e5"

    invoke-static {v1}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Landroidx/savedstate/ۡۤۨۡ;->ۧۨۧ۠()I

    move-result v1

    if-gtz v1, :cond_6

    const/16 v1, 0x17

    sput v1, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    const-string v1, "\u06df\u06e6\u06e1"

    :goto_1
    invoke-static {v1}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_1
    iput p1, p0, Lpv;->a:I

    sget v1, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    if-gtz v1, :cond_0

    invoke-static {}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟۟ۤۦۨ()I

    const-string v1, "\u06e5\u06e1\u06e2"

    invoke-static {v1}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۣ۠ۧۢ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    const-string v1, "\u06e2\u06e0\u06e5"

    :goto_2
    invoke-static {v1}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_2
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    const-string v1, "\u06e7\u06e8\u06e0"

    invoke-static {v1}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_3
    iput p5, p0, Lpv;->e:I

    sget v1, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v2, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    div-int/lit16 v2, v2, -0x1c6

    or-int/2addr v1, v2

    if-ltz v1, :cond_1

    const-string v1, "\u06e7\u06e4\u06e1"

    invoke-static {v1}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    sget v1, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v2, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    add-int/2addr v1, v2

    const v2, 0x1acc93

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_4
    iput p8, p0, Lpv;->h:I

    sget v1, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v2, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    rem-int/lit16 v2, v2, -0x20fa

    or-int/2addr v1, v2

    if-ltz v1, :cond_2

    invoke-static {}, Landroidx/emoji2/text/ۣۣ۟۟۠;->ۢۡۢۦ()I

    const-string v1, "\u06e8\u06e8\u06e4"

    goto :goto_2

    :cond_2
    sget v1, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sub-int/2addr v1, v2

    const v2, -0x1ab5af

    xor-int/2addr v1, v2

    goto :goto_0

    :sswitch_5
    iput p7, p0, Lpv;->g:I

    sget v1, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v2, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    div-int/2addr v1, v2

    const v2, 0x1abdc8

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_6
    iput p4, p0, Lpv;->d:I

    invoke-static {}, Lcom/google/android/material/carousel/۟ۧۡۢ;->۟ۦۥۣۧ()I

    move-result v1

    if-ltz v1, :cond_3

    invoke-static {}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۦۡۧۨ()I

    const-string v1, "\u06e8\u06e2\u06e6"

    invoke-static {v1}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_3
    const-string v1, "\u06e0\u06e8\u06e4"

    goto :goto_2

    :sswitch_7
    iput p3, p0, Lpv;->c:I

    sget v1, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    if-gtz v1, :cond_4

    const-string v1, "\u06df\u06e8\u06e8"

    :goto_3
    invoke-static {v1}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_4
    const-string v1, "\u06e0\u06e0\u06e8"

    :goto_4
    invoke-static {v1}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->۟ۡۥ۟ۨ()I

    move-result v1

    if-ltz v1, :cond_8

    invoke-static {}, Landroidx/core/content/ۥۨۤۦ;->۟۠۠۠ۥ()I

    move-result v1

    if-ltz v1, :cond_5

    const/16 v1, 0x2d

    sput v1, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    const-string v1, "\u06e7\u06e8\u06e0"

    :goto_5
    invoke-static {v1}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_5
    const-string v1, "\u06e7\u06e4\u06e1"

    goto :goto_5

    :cond_6
    const-string v1, "\u06e6\u06e8\u06e5"

    goto/16 :goto_1

    :sswitch_9
    iput p6, p0, Lpv;->f:I

    invoke-static {}, Landroidx/core/content/ۣ۟ۧ۠;->۟۟۠ۢۨ()I

    move-result v1

    if-ltz v1, :cond_7

    const-string v1, "\u06e2\u06e0\u06e5"

    invoke-static {v1}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_7
    const-string v1, "\u06e1\u06e4\u06e3"

    goto :goto_3

    :cond_8
    :sswitch_a
    sget v1, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    if-gtz v1, :cond_9

    const-string v1, "\u06e1\u06e3\u06e7"

    goto :goto_4

    :cond_9
    const-string v1, "\u06e7\u06e8\u06e0"

    goto/16 :goto_1

    :sswitch_b
    iput p2, p0, Lpv;->b:I

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۣ۟ۡۧ۠()I

    move-result v1

    if-ltz v1, :cond_a

    const/16 v1, 0x28

    sput v1, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    const-string v1, "\u06e1\u06e4\u06e3"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_c
    const-string v0, "eGYExAXXMYZ1YAegOjUGYcT"

    invoke-static {v0}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟ۦۦ۟ۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget v1, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v2, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    div-int/lit16 v2, v2, 0x97b

    mul-int/2addr v1, v2

    if-eqz v1, :cond_b

    :cond_a
    const-string v1, "\u06e0\u06df\u06e8"

    invoke-static {v1}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_b
    sget v1, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v2, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    div-int/2addr v1, v2

    const v2, -0x1ac5c7

    xor-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_d
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa81f -> :sswitch_0
        0x1aaac9 -> :sswitch_7
        0x1aaae8 -> :sswitch_6
        0x1aabdc -> :sswitch_3
        0x1aaf20 -> :sswitch_5
        0x1ab267 -> :sswitch_b
        0x1ab625 -> :sswitch_8
        0x1abdc6 -> :sswitch_4
        0x1ac263 -> :sswitch_1
        0x1ac5a4 -> :sswitch_c
        0x1ac5c1 -> :sswitch_2
        0x1ac61f -> :sswitch_d
        0x1ac92c -> :sswitch_9
        0x1ac9e4 -> :sswitch_a
    .end sparse-switch
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v1, 0x0

    const-string v0, "\u06df\u06e8\u06e6"

    invoke-static {v0}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    :goto_0
    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    move v0, v3

    :goto_1
    return v0

    :sswitch_1
    if-ne p0, p1, :cond_15

    invoke-static {}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۥۣۢۡ()I

    move-result v0

    if-gtz v0, :cond_0

    :goto_2
    const-string v0, "\u06e6\u06e1\u06e4"

    invoke-static {v0}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_0
    sget v0, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v4, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    rem-int/2addr v0, v4

    const v4, 0x1ab75a

    add-int/2addr v0, v4

    move v4, v0

    goto :goto_0

    :cond_1
    :sswitch_2
    sget v0, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v4, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    mul-int/2addr v0, v4

    const v4, 0xea477

    add-int/2addr v0, v4

    move v4, v0

    goto :goto_0

    :sswitch_3
    move v0, v2

    goto :goto_1

    :cond_2
    :sswitch_4
    sget v0, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    if-gtz v0, :cond_3

    invoke-static {}, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۣۨ()I

    const-string v0, "\u06df\u06e8\u06e2"

    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e0\u06e1\u06e4"

    :goto_3
    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :sswitch_5
    move v0, v3

    goto :goto_1

    :cond_4
    :sswitch_6
    const-string v0, "\u06e2\u06e8\u06e5"

    invoke-static {v0}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :sswitch_7
    move v0, v3

    goto :goto_1

    :sswitch_8
    iget v0, p0, Lpv;->h:I

    iget v4, v1, Lpv;->h:I

    if-eq v0, v4, :cond_1

    goto :goto_2

    :sswitch_9
    iget v0, p0, Lpv;->g:I

    iget v4, v1, Lpv;->g:I

    if-eq v0, v4, :cond_e

    sget v0, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v4, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    rem-int/2addr v0, v4

    const v4, 0x1aae38

    add-int/2addr v0, v4

    move v4, v0

    goto :goto_0

    :sswitch_a
    iget v0, p0, Lpv;->f:I

    iget v4, v1, Lpv;->f:I

    if-eq v0, v4, :cond_12

    sget v0, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v4, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    div-int/lit16 v4, v4, 0xc89

    add-int/2addr v0, v4

    if-gtz v0, :cond_5

    const-string v0, "\u06e3\u06e8"

    :goto_4
    invoke-static {v0}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_5
    sget v0, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v4, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    xor-int/2addr v0, v4

    const v4, 0x1aa487

    xor-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :sswitch_b
    instance-of v0, p1, Lpv;

    if-nez v0, :cond_9

    sget v0, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v4, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    xor-int/lit16 v4, v4, 0x18ac

    or-int/2addr v0, v4

    if-ltz v0, :cond_6

    const-string v0, "\u06e1\u06e1\u06e6"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_6
    sget v0, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v4, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    or-int/2addr v0, v4

    const v4, 0xd869

    add-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :sswitch_c
    iget v0, p0, Lpv;->d:I

    iget v4, v1, Lpv;->d:I

    if-eq v0, v4, :cond_4

    sget v0, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    if-ltz v0, :cond_7

    const-string v0, "\u06e6\u06e1\u06e6"

    invoke-static {v0}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_7
    const-string v0, "\u06e5\u06e8\u06e3"

    invoke-static {v0}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :sswitch_d
    iget v0, p0, Lpv;->c:I

    iget v4, v1, Lpv;->c:I

    if-eq v0, v4, :cond_2

    const-string v0, "\u06e5\u06e0\u06e5"

    invoke-static {v0}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :sswitch_e
    move v0, v3

    goto/16 :goto_1

    :sswitch_f
    move v0, v3

    goto/16 :goto_1

    :sswitch_10
    move v0, v3

    goto/16 :goto_1

    :sswitch_11
    move v0, v3

    goto/16 :goto_1

    :sswitch_12
    move v0, v2

    goto/16 :goto_1

    :sswitch_13
    iget v0, p0, Lpv;->e:I

    iget v4, v1, Lpv;->e:I

    if-eq v0, v4, :cond_c

    sget v0, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v4, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    mul-int/lit16 v4, v4, 0xd00

    or-int/2addr v0, v4

    if-gtz v0, :cond_8

    invoke-static {}, Landroidx/startup/ۣۤۦۥ;->۠ۨ۟()I

    const-string v0, "\u06e0\u06e1\u06e6"

    invoke-static {v0}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_8
    const-string v0, "\u06e5\u06e7\u06e6"

    :goto_5
    invoke-static {v0}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_9
    :sswitch_14
    sget v0, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v4, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    rem-int/lit16 v4, v4, -0xffe

    rem-int/2addr v0, v4

    if-gtz v0, :cond_a

    invoke-static {}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۢۡۤ()I

    const-string v0, "\u06e8\u06e5\u06e6"

    invoke-static {v0}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۣ۠ۧۢ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_a
    sget v0, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v4, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    mul-int/2addr v0, v4

    const v4, 0x18172b

    add-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :sswitch_15
    sget v0, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v4, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    xor-int/lit16 v4, v4, -0x1a28

    rem-int/2addr v0, v4

    if-gtz v0, :cond_b

    invoke-static {}, Landroidx/appcompat/app/ۥۦۣ۠;->ۨۤ۠ۨ()I

    const-string v0, "\u06e0\u06df\u06e6"

    goto/16 :goto_3

    :cond_b
    sget v0, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v4, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    add-int/2addr v0, v4

    const v4, 0x1aa859

    add-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :sswitch_16
    move v0, v3

    goto/16 :goto_1

    :cond_c
    :sswitch_17
    const-string v0, "\u06e6\u06e1\u06e6"

    invoke-static {v0}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :sswitch_18
    move-object v0, p1

    check-cast v0, Lpv;

    iget v1, p0, Lpv;->a:I

    iget v4, v0, Lpv;->a:I

    if-eq v1, v4, :cond_14

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟۟ۤۥ۠()I

    move-result v1

    if-gtz v1, :cond_d

    const-string v1, "\u06e5\u06e8\u06e3"

    invoke-static {v1}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v4

    move-object v1, v0

    goto/16 :goto_0

    :cond_d
    sget v1, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v4, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sub-int/2addr v1, v4

    const v4, 0x1ac6ec

    add-int/2addr v4, v1

    move-object v1, v0

    goto/16 :goto_0

    :sswitch_19
    iget v0, p0, Lpv;->b:I

    iget v4, v1, Lpv;->b:I

    if-eq v0, v4, :cond_10

    const-string v0, "\u06e6\u06e3\u06e3"

    goto/16 :goto_4

    :cond_e
    :sswitch_1a
    sget v0, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v4, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    add-int/lit16 v4, v4, -0x217d

    add-int/2addr v0, v4

    if-ltz v0, :cond_f

    const-string v0, "\u06e8\u06e5\u06e3"

    goto/16 :goto_5

    :cond_f
    sget v0, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v4, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    add-int/2addr v0, v4

    const v4, 0x1ab74d

    add-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :cond_10
    :sswitch_1b
    sget v0, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v4, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    xor-int/lit16 v4, v4, -0x145f

    xor-int/2addr v0, v4

    if-ltz v0, :cond_11

    const-string v0, "\u06df\u06df\u06e7"

    invoke-static {v0}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_11
    sget v0, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v4, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    add-int/2addr v0, v4

    const v4, -0x1ab8b6

    xor-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :cond_12
    :sswitch_1c
    sget v0, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v4, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    or-int/lit16 v4, v4, -0xea9

    xor-int/2addr v0, v4

    if-ltz v0, :cond_13

    const-string v0, "\u06e6\u06e5\u06e6"

    invoke-static {v0}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_13
    sget v0, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v4, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    rem-int/2addr v0, v4

    const v4, 0x1ac8eb

    add-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :sswitch_1d
    move-object v0, v1

    :cond_14
    const-string v1, "\u06e7\u06e6\u06e0"

    invoke-static {v1}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v4

    move-object v1, v0

    goto/16 :goto_0

    :cond_15
    :sswitch_1e
    sget v0, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v4, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    or-int/lit16 v4, v4, -0x266e

    add-int/2addr v0, v4

    if-ltz v0, :cond_16

    const/16 v0, 0x5d

    sput v0, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    const-string v0, "\u06e4\u06e4\u06e5"

    invoke-static {v0}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_16
    sget v0, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v4, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    div-int/2addr v0, v4

    const v4, 0x1aaec6

    add-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :sswitch_1f
    move v0, v3

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc43 -> :sswitch_0
        0xdc65 -> :sswitch_1e
        0x1aa782 -> :sswitch_7
        0x1aa784 -> :sswitch_14
        0x1aa81d -> :sswitch_1
        0x1aab03 -> :sswitch_c
        0x1aab05 -> :sswitch_1c
        0x1aaba1 -> :sswitch_1d
        0x1aae82 -> :sswitch_e
        0x1aaec3 -> :sswitch_18
        0x1aaec6 -> :sswitch_b
        0x1aaf98 -> :sswitch_15
        0x1ab247 -> :sswitch_1b
        0x1ab2c2 -> :sswitch_1a
        0x1ab2c7 -> :sswitch_6
        0x1ab35f -> :sswitch_13
        0x1ab663 -> :sswitch_4
        0x1ab67f -> :sswitch_3
        0x1ab6a5 -> :sswitch_8
        0x1ab9c8 -> :sswitch_17
        0x1ab9e4 -> :sswitch_d
        0x1abd8e -> :sswitch_12
        0x1abdaa -> :sswitch_10
        0x1abe84 -> :sswitch_11
        0x1abea0 -> :sswitch_f
        0x1ac189 -> :sswitch_5
        0x1ac18b -> :sswitch_a
        0x1ac1c6 -> :sswitch_1f
        0x1ac5e1 -> :sswitch_19
        0x1ac8cf -> :sswitch_16
        0x1ac8f0 -> :sswitch_9
        0x1ac964 -> :sswitch_2
    .end sparse-switch
.end method

.method public final hashCode()I
    .locals 9

    const/4 v0, 0x0

    const-string v1, "\u06e6\u06e5\u06e8"

    invoke-static {v1}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v8

    move v3, v0

    move v5, v0

    move v6, v0

    move v7, v0

    move v4, v0

    move v1, v0

    move v2, v0

    :goto_0
    sparse-switch v8, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    if-gtz v0, :cond_3

    invoke-static {}, Landroidx/startup/ۣۤۦۥ;->۠ۨ۟()I

    const-string v0, "\u06df\u06e7\u06e1"

    :goto_1
    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto :goto_0

    :sswitch_1
    iget v0, p0, Lpv;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    sget v5, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    if-gtz v5, :cond_0

    const-string v5, "\u06e6\u06e5\u06df"

    invoke-static {v5}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v8

    move v5, v0

    goto :goto_0

    :cond_0
    sget v5, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v8, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    xor-int/2addr v5, v8

    const v8, 0x1abf47

    xor-int/2addr v8, v5

    move v5, v0

    goto :goto_0

    :sswitch_2
    iget v0, p0, Lpv;->d:I

    invoke-static {v0, v2, v1}, Lz30;->d(III)I

    move-result v0

    sget v6, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v8, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    mul-int/2addr v6, v8

    const v8, 0x1ad188

    add-int/2addr v8, v6

    move v6, v0

    goto :goto_0

    :sswitch_3
    iget v0, p0, Lpv;->b:I

    mul-int v3, v5, v1

    invoke-static {v0, v3, v1}, Lz30;->d(III)I

    move-result v0

    sget v3, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v8, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    add-int/lit16 v8, v8, 0x1c37

    mul-int/2addr v3, v8

    if-ltz v3, :cond_1

    :goto_2
    const-string v3, "\u06e4\u06e8\u06df"

    invoke-static {v3}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v8

    move v3, v0

    goto :goto_0

    :cond_1
    sget v3, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v8, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    xor-int/2addr v3, v8

    const v8, -0x1abdfa

    xor-int/2addr v8, v3

    move v3, v0

    goto :goto_0

    :sswitch_4
    iget v0, p0, Lpv;->e:I

    invoke-static {v0, v6, v1}, Lz30;->d(III)I

    move-result v0

    sget v7, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v8, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    xor-int/2addr v7, v8

    const v8, 0x1ac6c8

    add-int/2addr v8, v7

    move v7, v0

    goto :goto_0

    :sswitch_5
    iget v0, p0, Lpv;->c:I

    invoke-static {v0, v3, v1}, Lz30;->d(III)I

    move-result v2

    const-string v0, "\u06e6\u06e5\u06df"

    goto :goto_1

    :sswitch_6
    sget v0, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    xor-int/lit8 v1, v0, 0x6c

    sget v0, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v8, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    mul-int/lit16 v8, v8, 0x15db

    add-int/2addr v0, v8

    if-gtz v0, :cond_2

    invoke-static {}, Landroidx/savedstate/ۡۤۨۡ;->ۧۨۧ۠()I

    const-string v0, "\u06e0\u06e5\u06e6"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto/16 :goto_0

    :cond_2
    const-string v0, "\u06e6\u06e1\u06e0"

    goto/16 :goto_1

    :cond_3
    sget v0, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v8, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    or-int/2addr v0, v8

    const v8, 0x1ac213

    add-int/2addr v0, v8

    move v8, v0

    goto/16 :goto_0

    :sswitch_7
    iget v0, p0, Lpv;->g:I

    invoke-static {v0, v4, v1}, Lz30;->d(III)I

    move-result v0

    iget v1, p0, Lpv;->h:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    rsub-int/lit8 v1, v1, 0x0

    sub-int/2addr v0, v1

    return v0

    :sswitch_8
    iget v0, p0, Lpv;->f:I

    invoke-static {v0, v7, v1}, Lz30;->d(III)I

    move-result v4

    invoke-static {}, Landroidx/appcompat/widget/۟ۢۨۦ;->۟ۦۡ۟۠()I

    move-result v0

    if-ltz v0, :cond_4

    invoke-static {}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣ۟۠()I

    const-string v0, "\u06e6\u06e1\u06e0"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto/16 :goto_0

    :cond_4
    move v0, v3

    goto :goto_2

    :sswitch_data_0
    .sparse-switch
        0x1aaac8 -> :sswitch_0
        0x1aab81 -> :sswitch_4
        0x1abadb -> :sswitch_7
        0x1abdc9 -> :sswitch_5
        0x1abe01 -> :sswitch_6
        0x1ac185 -> :sswitch_3
        0x1ac200 -> :sswitch_2
        0x1ac209 -> :sswitch_1
        0x1ac58a -> :sswitch_8
    .end sparse-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    const-string v1, "\u06e1\u06e3\u06e6"

    invoke-static {v1}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget v0, p0, Lpv;->e:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-static {}, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۣۨ()I

    move-result v0

    if-gtz v0, :cond_8

    invoke-static {}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۡۢۡۥ()I

    const-string v0, "\u06e5\u06e2\u06e5"

    invoke-static {v0}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_1
    const-string v0, ", accentDark="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v0, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    if-gtz v0, :cond_0

    const/16 v0, 0x4f

    sput v0, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    :goto_1
    const-string v0, "\u06e8\u06e3\u06e5"

    invoke-static {v0}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e5\u06e2\u06e5"

    :goto_2
    invoke-static {v0}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣ۟ۦۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_2
    iget v0, p0, Lpv;->f:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    sget v0, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v2, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    or-int/lit16 v2, v2, -0x1543

    mul-int/2addr v0, v2

    if-ltz v0, :cond_1

    invoke-static {}, Landroid/app/ۦۥۡ۠;->ۥۣۡۧ()I

    const-string v0, "\u06e7\u06e5\u06e2"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e7\u06e5\u06e2"

    :goto_3
    invoke-static {v0}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_3
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ThemeConfig(bg="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget v1, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v2, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    or-int/2addr v1, v2

    const v2, -0x1aa7ba

    xor-int/2addr v2, v1

    move-object v1, v0

    goto :goto_0

    :sswitch_4
    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v0, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v2, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    rem-int/lit16 v2, v2, -0x1765

    add-int/2addr v0, v2

    if-gtz v0, :cond_3

    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->۟ۡۥ۟ۨ()I

    :cond_2
    const-string v0, "\u06e0\u06e3"

    goto :goto_2

    :cond_3
    sget v0, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v2, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    rem-int/2addr v0, v2

    const v2, 0x1ab9bc

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_5
    const-string v0, ", textSub="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v0, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v2, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    div-int/lit16 v2, v2, 0xfea

    or-int/2addr v0, v2

    if-gtz v0, :cond_4

    const/16 v0, 0x4d

    sput v0, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    const-string v0, "\u06e1\u06e3\u06e6"

    :goto_4
    invoke-static {v0}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_4
    sget v0, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v2, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    or-int/2addr v0, v2

    const v2, 0x1ab4c9

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_6
    iget v0, p0, Lpv;->g:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    sget v0, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v2, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    xor-int/lit16 v2, v2, -0x38b

    rem-int/2addr v0, v2

    if-gtz v0, :cond_5

    const/16 v0, 0x60

    sput v0, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    :cond_5
    const-string v0, "\u06e7\u06e8"

    invoke-static {v0}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_7
    iget v0, p0, Lpv;->d:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    sget v0, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v2, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    xor-int/lit16 v2, v2, -0x177b

    or-int/2addr v0, v2

    if-ltz v0, :cond_6

    const-string v0, "\u06e3\u06e5\u06e6"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_6
    sget v0, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v2, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    div-int/2addr v0, v2

    const v2, 0x1ac94f

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_8
    const-string v0, ", ripple="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/app/۟ۦۦۤۥ;->ۣۡ۠ۢ()I

    move-result v0

    if-ltz v0, :cond_7

    const-string v0, "\u06e3\u06e0\u06e1"

    :goto_5
    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_7
    const-string v0, "\u06e8\u06df\u06e2"

    goto :goto_5

    :cond_8
    const-string v0, "\u06df\u06e1\u06e3"

    goto :goto_4

    :sswitch_9
    iget v0, p0, Lpv;->b:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    sget v0, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v2, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    rem-int/lit16 v2, v2, -0x1650

    mul-int/2addr v0, v2

    if-ltz v0, :cond_a

    :cond_9
    const-string v0, "\u06e4\u06e2"

    :goto_6
    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_a
    sget v0, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    add-int/2addr v0, v2

    const v2, 0x1ab678

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_a
    sget v0, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v2, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    mul-int/lit16 v2, v2, -0x550

    rem-int/2addr v0, v2

    if-ltz v0, :cond_b

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->۟ۢۦۡۦ()I

    const-string v0, "\u06e8\u06e1\u06df"

    :goto_7
    invoke-static {v0}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_b
    const-string v0, "\u06e1\u06e3\u06e6"

    goto :goto_7

    :sswitch_b
    const-string v0, ", handle="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\u06e3\u06e5\u06e6"

    goto :goto_6

    :sswitch_c
    const-string v0, ", textMain="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v0, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v2, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    or-int/lit16 v2, v2, -0x20ca

    div-int/2addr v0, v2

    if-eqz v0, :cond_9

    const/16 v0, 0x2d

    sput v0, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    const-string v0, "\u06e4\u06e1\u06e1"

    invoke-static {v0}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_d
    const-string v0, ", accent="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\u06df\u06e3"

    invoke-static {v0}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_e
    const-string v0, ", card="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۢۧ()I

    move-result v0

    if-ltz v0, :cond_d

    :cond_c
    const-string v0, "\u06e1\u06e3\u06e7"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_d
    sget v0, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    add-int/2addr v0, v2

    const v2, 0x1ab766

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_f
    iget v0, p0, Lpv;->c:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-static {}, L۠ۡۢۨ;->ۥۡ۠ۨ()I

    move-result v0

    if-gtz v0, :cond_2

    invoke-static {}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->۟ۡۨۢ()I

    const-string v0, "\u06df\u06e1\u06e3"

    goto/16 :goto_3

    :sswitch_10
    iget v0, p0, Lpv;->a:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto/16 :goto_1

    :sswitch_11
    iget v0, p0, Lpv;->h:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    sget v0, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v2, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    or-int/lit16 v2, v2, -0xa3f

    add-int/2addr v0, v2

    if-ltz v0, :cond_c

    const/16 v0, 0x49

    sput v0, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    const-string v0, "\u06df\u06e3"

    invoke-static {v0}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_12
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0xdbe4 -> :sswitch_0
        0xdc03 -> :sswitch_5
        0xdc7e -> :sswitch_f
        0xdce1 -> :sswitch_8
        0x1aa705 -> :sswitch_a
        0x1aa741 -> :sswitch_1
        0x1aa79e -> :sswitch_10
        0x1aaf04 -> :sswitch_3
        0x1aaf05 -> :sswitch_4
        0x1ab624 -> :sswitch_7
        0x1ab62b -> :sswitch_c
        0x1ab661 -> :sswitch_9
        0x1ab6c4 -> :sswitch_6
        0x1aba04 -> :sswitch_12
        0x1abde8 -> :sswitch_2
        0x1ac5c4 -> :sswitch_b
        0x1ac8cb -> :sswitch_11
        0x1ac94a -> :sswitch_e
        0x1ac94c -> :sswitch_d
    .end sparse-switch
.end method
