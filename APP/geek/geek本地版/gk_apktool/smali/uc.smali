.class public final Luc;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Z

.field public d:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 3

    const-string v0, "zwu0ng==\n"

    const-string v1, "uHPd+hipcgU=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v0, "UrjZdw==\n"

    const-string v1, "PNm0EhY6NnM=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    const-string v0, "\u06e8\u06e5\u06e7"

    invoke-static {v0}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Luc;->d:Z

    const-string v0, "\u06e3\u06e4\u06e5"

    :goto_1
    invoke-static {v0}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_1
    const-string v0, "64kakP58rJ7UjEZnpFSEP"

    invoke-static {v0}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟ۦۦ۟ۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    invoke-static {}, Landroidx/recyclerview/widget/ۧۧۦۢ;->ۣۢۦۨ()I

    move-result v1

    if-ltz v1, :cond_3

    const/16 v1, 0x5e

    sput v1, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    const-string v1, "\u06df\u06e8\u06e0"

    invoke-static {v1}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :sswitch_2
    sget v0, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v2, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    add-int/lit16 v2, v2, -0x7cb

    mul-int/2addr v0, v2

    if-ltz v0, :cond_0

    const/16 v0, 0x60

    sput v0, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    const-string v0, "\u06e4\u06e7\u06e3"

    goto :goto_1

    :cond_0
    const-string v0, "\u06e8\u06e5\u06e7"

    goto :goto_1

    :sswitch_3
    iput-boolean p3, p0, Luc;->c:Z

    invoke-static {}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۣۣۡ۟()I

    move-result v0

    if-gtz v0, :cond_2

    :cond_1
    const-string v0, "\u06e0\u06e1\u06e0"

    :goto_2
    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e8\u06e3"

    goto :goto_2

    :sswitch_4
    iput-object p2, p0, Luc;->b:Ljava/lang/String;

    sget v0, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v2, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    xor-int/lit16 v2, v2, -0x342

    xor-int/2addr v0, v2

    if-gtz v0, :cond_1

    invoke-static {}, Lkotlinx/coroutines/ۦۡۧۧ;->۟ۤۧۨۦ()I

    move-object v0, v1

    :cond_3
    const-string v1, "\u06e0\u06e3\u06e4"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :sswitch_5
    invoke-static {}, Landroidx/emoji2/text/ۣۣ۟۟۠;->ۢۡۢۦ()I

    move-result v0

    if-gtz v0, :cond_7

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۦۥ()I

    move-result v0

    if-gtz v0, :cond_6

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۦۥ()I

    const-string v0, "\u06e2\u06e3\u06e2"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_6
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->۟۠ۡۢۦ()I

    move-result v0

    if-gtz v0, :cond_5

    :cond_4
    const-string v0, "\u06e5\u06e0\u06e2"

    invoke-static {v0}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_5
    sget v0, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v2, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    rem-int/2addr v0, v2

    const v2, 0x1ab359

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_7
    iput-object p1, p0, Luc;->a:Ljava/lang/String;

    invoke-static {}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۢۨۤ۟()I

    move-result v0

    if-gtz v0, :cond_4

    invoke-static {}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۢ۟ۡۧ()I

    :cond_6
    const-string v0, "\u06e8\u06df\u06e0"

    invoke-static {v0}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_7
    :sswitch_8
    sget v0, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    if-gtz v0, :cond_8

    const-string v0, "\u06e6\u06df\u06e3"

    invoke-static {v0}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_8
    sget v0, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v2, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    add-int/2addr v0, v2

    const v2, 0x1ab1a9

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_9
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdcfb -> :sswitch_0
        0x1aa817 -> :sswitch_2
        0x1aaaff -> :sswitch_3
        0x1aab41 -> :sswitch_6
        0x1ab2c1 -> :sswitch_9
        0x1ab6a4 -> :sswitch_5
        0x1ab6e0 -> :sswitch_8
        0x1abda7 -> :sswitch_4
        0x1ac8c9 -> :sswitch_1
        0x1ac98a -> :sswitch_7
    .end sparse-switch
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v1, 0x0

    const-string v0, "\u06df\u06e1\u06e4"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    move v0, v4

    :goto_1
    return v0

    :sswitch_1
    iget-boolean v0, p0, Luc;->c:Z

    iget-boolean v2, v1, Luc;->c:Z

    if-eq v0, v2, :cond_6

    invoke-static {}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۥۣۢۡ()I

    move-result v0

    if-gtz v0, :cond_0

    const/16 v0, 0x20

    sput v0, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    const-string v0, "\u06df\u06e1\u06e4"

    invoke-static {v0}, Landroidx/appcompat/widget/۟ۢۨۦ;->۠ۢۤۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    const-string v2, "\u06e1\u06e2\u06e8"

    move-object v0, v1

    :goto_2
    invoke-static {v2}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :sswitch_2
    if-ne p0, p1, :cond_2

    sget v0, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    if-ltz v0, :cond_1

    invoke-static {}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۦ۟ۥۣ()I

    const-string v0, "\u06e4\u06e5\u06e5"

    :goto_3
    invoke-static {v0}, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۧۦۢ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e3\u06e6\u06e4"

    goto :goto_3

    :cond_2
    :sswitch_3
    sget v0, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    rem-int/lit16 v2, v2, 0x14a2

    xor-int/2addr v0, v2

    if-gtz v0, :cond_3

    invoke-static {}, Landroidx/lifecycle/۟۟ۡۨ;->ۦۣ۟ۦ()I

    const-string v0, "\u06e8\u06df\u06df"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_3
    sget v0, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v2, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    or-int/2addr v0, v2

    const v2, 0x1aca5d

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_4
    move v0, v3

    goto :goto_1

    :sswitch_5
    move v0, v4

    goto :goto_1

    :cond_4
    :sswitch_6
    const-string v0, "\u06e3\u06e8\u06e2"

    invoke-static {v0}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_7
    move v0, v3

    goto :goto_1

    :sswitch_8
    instance-of v0, p1, Luc;

    if-nez v0, :cond_4

    :cond_5
    const-string v0, "\u06e5\u06e7"

    invoke-static {v0}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣ۟ۦۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_6
    :sswitch_9
    sget v0, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v2, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    rem-int/lit8 v2, v2, -0x3e

    add-int/2addr v0, v2

    if-ltz v0, :cond_7

    const-string v2, "\u06e8\u06e4\u06e1"

    move-object v0, v1

    goto :goto_2

    :cond_7
    const-string v0, "\u06e5\u06e8\u06e1"

    :goto_4
    invoke-static {v0}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_a
    iget-object v0, p0, Luc;->b:Ljava/lang/String;

    iget-object v2, v1, Luc;->b:Ljava/lang/String;

    invoke-static {v0, v2}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    sget v0, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v2, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    mul-int/lit16 v2, v2, 0x2447

    or-int/2addr v0, v2

    if-gez v0, :cond_5

    const-string v0, "\u06e2\u06e1\u06e4"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_b
    move v0, v4

    goto/16 :goto_1

    :sswitch_c
    iget-object v0, p0, Luc;->a:Ljava/lang/String;

    iget-object v2, v1, Luc;->a:Ljava/lang/String;

    invoke-static {v0, v2}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    sget v0, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v2, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    add-int/lit16 v2, v2, -0x1e84

    xor-int/2addr v0, v2

    if-gtz v0, :cond_8

    const-string v0, "\u06e7\u06e2\u06e4"

    invoke-static {v0}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_8
    sget v0, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v2, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    mul-int/2addr v0, v2

    const v2, 0x159eae

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :cond_9
    :sswitch_d
    invoke-static {}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۦ۟ۥۣ()I

    move-result v0

    if-gtz v0, :cond_a

    const/16 v0, 0x10

    sput v0, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    const-string v0, "\u06e0\u06e3\u06e1"

    invoke-static {v0}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_a
    sget v0, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v2, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    div-int/2addr v0, v2

    const v2, 0x1aaad5

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_e
    move-object v0, p1

    check-cast v0, Luc;

    invoke-static {}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۥۣۢۡ()I

    move-result v1

    if-gtz v1, :cond_b

    const/16 v1, 0x25

    sput v1, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    const-string v1, "\u06e0\u06df\u06e4"

    invoke-static {v1}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto/16 :goto_0

    :cond_b
    const-string v1, "\u06e1\u06e7\u06e1"

    move-object v2, v1

    goto/16 :goto_2

    :cond_c
    :sswitch_f
    invoke-static {}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣۣۢۢ()I

    move-result v0

    if-gtz v0, :cond_d

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۣۡۧۢ()I

    const-string v0, "\u06df\u06e0\u06e8"

    goto/16 :goto_4

    :cond_d
    sget v0, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v2, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    mul-int/2addr v0, v2

    const v2, 0x1aa5b7

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :cond_e
    :sswitch_10
    sget v0, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v2, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    div-int/2addr v0, v2

    const v2, 0x1abe82

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_11
    iget-boolean v0, p0, Luc;->d:Z

    iget-boolean v2, v1, Luc;->d:Z

    if-eq v0, v2, :cond_9

    const-string v0, "\u06df\u06e1\u06e7"

    goto/16 :goto_3

    :sswitch_12
    sget v0, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v2, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    or-int/2addr v0, v2

    const v2, 0x1aa7c3

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_13
    move v0, v4

    goto/16 :goto_1

    :sswitch_14
    move v0, v4

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        0xdca2 -> :sswitch_0
        0x1aa742 -> :sswitch_2
        0x1aa745 -> :sswitch_14
        0x1aa77b -> :sswitch_5
        0x1aaac5 -> :sswitch_4
        0x1aaee7 -> :sswitch_b
        0x1aaf7b -> :sswitch_c
        0x1aaf98 -> :sswitch_a
        0x1ab285 -> :sswitch_13
        0x1ab33e -> :sswitch_10
        0x1ab6e1 -> :sswitch_7
        0x1ab6e4 -> :sswitch_9
        0x1ab71d -> :sswitch_e
        0x1ab9c6 -> :sswitch_6
        0x1aba84 -> :sswitch_12
        0x1abe82 -> :sswitch_1
        0x1abe9e -> :sswitch_11
        0x1ac240 -> :sswitch_f
        0x1ac569 -> :sswitch_3
        0x1ac96c -> :sswitch_8
        0x1ac9c4 -> :sswitch_d
    .end sparse-switch
.end method

.method public final hashCode()I
    .locals 5

    const/4 v1, 0x0

    const-string v0, "\u06e0\u06e6\u06e8"

    invoke-static {v0}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v4

    move v0, v1

    move v2, v1

    move v3, v1

    :goto_0
    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget-object v1, p0, Luc;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    sget v3, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v4, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    rem-int/2addr v3, v4

    const v4, 0x1ab5c8

    add-int/2addr v4, v3

    move v3, v1

    goto :goto_0

    :sswitch_1
    sget v1, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    xor-int/lit16 v1, v1, -0xef

    const-string v2, "\u06e1\u06e6\u06e2"

    invoke-static {v2}, Landroidx/core/content/ۣ۟ۧ۠;->ۥۦۤ۠(Ljava/lang/Object;)I

    move-result v4

    move v2, v1

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lcom/google/android/material/carousel/۟ۧۡۢ;->۟ۦۥۣۧ()I

    move-result v1

    if-ltz v1, :cond_0

    invoke-static {}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣ۟۠()I

    const-string v1, "\u06e0\u06e0\u06e4"

    invoke-static {v1}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto :goto_0

    :cond_0
    sget v1, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v4, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    div-int/2addr v1, v4

    const v4, 0x1aaba2

    add-int/2addr v1, v4

    move v4, v1

    goto :goto_0

    :sswitch_3
    iget-object v0, p0, Luc;->b:Ljava/lang/String;

    mul-int v1, v3, v2

    invoke-static {v0, v1, v2}, Lz30;->e(Ljava/lang/String;II)I

    move-result v0

    sget v1, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v4, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    add-int/lit16 v4, v4, -0x2173

    mul-int/2addr v1, v4

    if-ltz v1, :cond_1

    invoke-static {}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۟ۤۥۧۤ()I

    const-string v1, "\u06e2\u06e8\u06df"

    invoke-static {v1}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto :goto_0

    :cond_1
    const-string v1, "\u06e5\u06e0\u06e7"

    invoke-static {v1}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto :goto_0

    :sswitch_4
    iget-boolean v1, p0, Luc;->c:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    rsub-int/lit8 v0, v0, 0x0

    sub-int v0, v1, v0

    mul-int/2addr v0, v2

    iget-boolean v1, p0, Luc;->d:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    rsub-int/lit8 v1, v1, 0x0

    sub-int/2addr v0, v1

    return v0

    :sswitch_data_0
    .sparse-switch
        0x1aaba2 -> :sswitch_0
        0x1aaf5d -> :sswitch_3
        0x1ab359 -> :sswitch_1
        0x1abdac -> :sswitch_4
        0x1abdc6 -> :sswitch_2
    .end sparse-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    const/4 v1, 0x0

    const/4 v0, 0x0

    const-string v2, "\u06e8\u06e6\u06e4"

    invoke-static {v2}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v3

    move-object v2, v0

    :goto_0
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget-boolean v0, p0, Luc;->c:Z

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    sget v0, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    if-ltz v0, :cond_2

    const-string v0, "\u06e8\u06e7\u06e7"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :sswitch_1
    const-string v0, ", name="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v0, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v3, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    rem-int/2addr v0, v3

    const v3, 0x1ab24b

    add-int/2addr v0, v3

    move v3, v0

    goto :goto_0

    :sswitch_2
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_3
    sget v0, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v3, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    rem-int/lit16 v3, v3, 0x265

    add-int/2addr v0, v3

    if-ltz v0, :cond_0

    const/16 v0, 0x1f

    sput v0, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    const-string v0, "\u06e8\u06e0\u06df"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e8\u06e6\u06e4"

    invoke-static {v0}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :sswitch_4
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Contact(wxid="

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget v2, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v3, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    add-int/lit16 v3, v3, -0x1df1

    rem-int/2addr v2, v3

    if-ltz v2, :cond_1

    const/16 v2, 0x58

    sput v2, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    const-string v2, "\u06e2\u06df\u06e2"

    invoke-static {v2}, Landroid/app/۟ۦۦۤۥ;->ۦۨۥ۟(Ljava/lang/Object;)I

    move-result v3

    move-object v2, v0

    goto :goto_0

    :cond_1
    const-string v2, "\u06e1\u06e8\u06e3"

    invoke-static {v2}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v3

    move-object v2, v0

    goto :goto_0

    :sswitch_5
    iget-object v0, p0, Luc;->b:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\u06e1\u06e7\u06e6"

    goto :goto_1

    :sswitch_6
    const-string v0, ", isGroup="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v0, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v3, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    add-int/2addr v0, v3

    const v3, 0xe291

    add-int/2addr v0, v3

    move v3, v0

    goto/16 :goto_0

    :cond_2
    const-string v0, "\u06e4\u06df\u06df"

    goto :goto_1

    :sswitch_7
    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۢۨۨۤ()I

    move-result v0

    if-ltz v0, :cond_3

    const/16 v0, 0x36

    sput v0, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    const-string v0, "\u06e4\u06df\u06df"

    :goto_2
    invoke-static {v0}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_3
    const-string v0, "\u06e6\u06e8\u06e4"

    goto :goto_1

    :sswitch_8
    const-string v0, ", isSelected="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v0, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v3, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    xor-int/2addr v0, v3

    const v3, 0x1abaf0

    add-int/2addr v0, v3

    move v3, v0

    goto/16 :goto_0

    :sswitch_9
    iget-object v0, p0, Luc;->a:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v0, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v3, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    mul-int/lit16 v3, v3, -0x209d

    rem-int/2addr v0, v3

    if-gtz v0, :cond_4

    const-string v0, "\u06e6\u06e8\u06e4"

    invoke-static {v0}, Landroidx/core/content/ۣ۟ۧ۠;->ۥۦۤ۠(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_4
    sget v0, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v3, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    xor-int/2addr v0, v3

    const v3, 0x1ac0d5

    add-int/2addr v0, v3

    move v3, v0

    goto/16 :goto_0

    :sswitch_a
    iget-boolean v1, p0, Luc;->d:Z

    const-string v0, "\u06e8\u06e0\u06e0"

    goto :goto_2

    :sswitch_b
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    sget v0, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v3, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    rem-int/2addr v0, v3

    const v3, 0x1ac938

    add-int/2addr v0, v3

    move v3, v0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdcf9 -> :sswitch_0
        0x1aa81d -> :sswitch_3
        0x1aaf80 -> :sswitch_6
        0x1aaf9c -> :sswitch_9
        0x1ab245 -> :sswitch_5
        0x1ab9c4 -> :sswitch_8
        0x1abe3f -> :sswitch_b
        0x1ac221 -> :sswitch_1
        0x1ac262 -> :sswitch_2
        0x1ac8e8 -> :sswitch_4
        0x1ac9a6 -> :sswitch_a
        0x1ac9c8 -> :sswitch_7
    .end sparse-switch
.end method
