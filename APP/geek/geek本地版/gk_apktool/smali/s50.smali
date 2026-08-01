.class public final Ls50;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    const-string v0, "x9B9wQ==\n"

    const-string v1, "qbEQpFyTRdE=\n"

    const-string v2, "AlHoKsPXTM0PdeM3\n"

    const-string v3, "YT6GTqqjJaI=\n"

    invoke-static {v0, v1, p1, v2, v3}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    const-string v0, "\u06e4\u06e5\u06e1"

    invoke-static {v0}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iput-object p2, p0, Ls50;->b:Ljava/lang/String;

    invoke-static {}, Landroidx/emoji2/text/ۣۣ۟۟۠;->ۢۡۢۦ()I

    move-result v0

    if-gtz v0, :cond_6

    const-string v0, "\u06e8\u06e0\u06e0"

    invoke-static {v0}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_1
    iput-object p1, p0, Ls50;->a:Ljava/lang/String;

    sget v0, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v2, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    xor-int/lit16 v2, v2, 0xc4f

    div-int/2addr v0, v2

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->۟ۢۦۡۦ()I

    const-string v0, "\u06e8\u06e8\u06e5"

    invoke-static {v0}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    sget v0, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v2, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    mul-int/2addr v0, v2

    const v2, -0x1afa70

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_2
    invoke-static {}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۠۠ۧ۟()I

    move-result v0

    if-gtz v0, :cond_1

    const/16 v0, 0x2e

    sput v0, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    const-string v0, "\u06e4\u06e0\u06df"

    :goto_1
    invoke-static {v0}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    sget v0, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v2, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    or-int/2addr v0, v2

    const v2, -0x1ab8fd

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_3
    invoke-static {}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۣۣۡ۟()I

    move-result v0

    if-gtz v0, :cond_4

    sget v0, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    if-ltz v0, :cond_2

    const-string v0, "\u06e5\u06e3\u06e3"

    invoke-static {v0}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    sget v0, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v2, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    div-int/2addr v0, v2

    const v2, 0x1aaea4

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_4
    const-string v0, "TpMw6c8"

    invoke-static {v0}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۣۧۡۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget v1, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    add-int/lit16 v2, v2, 0x125

    div-int/2addr v1, v2

    if-gtz v1, :cond_3

    const-string v1, "\u06e4\u06e5\u06e1"

    move-object v2, v1

    :goto_2
    invoke-static {v2}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto/16 :goto_0

    :cond_3
    const-string v1, "\u06e8\u06e0\u06e0"

    invoke-static {v1}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto/16 :goto_0

    :cond_4
    :sswitch_5
    sget v0, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v2, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    rem-int/lit16 v2, v2, 0xbf1

    sub-int/2addr v0, v2

    if-ltz v0, :cond_5

    const-string v0, "\u06e7\u06e2\u06e1"

    invoke-static {v0}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_5
    sget v0, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v2, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    xor-int/2addr v0, v2

    const v2, 0x1ab441

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :cond_6
    const-string v0, "\u06e7\u06e1\u06df"

    goto :goto_1

    :sswitch_6
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v2, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    add-int/lit16 v2, v2, -0xe22

    add-int/2addr v0, v2

    if-ltz v0, :cond_7

    const-string v0, "\u06e2\u06e2\u06e4"

    invoke-static {v0}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_7
    const-string v2, "\u06e2\u06e2\u06e4"

    move-object v0, v1

    goto :goto_2

    :sswitch_7
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aabd9 -> :sswitch_0
        0x1aaea5 -> :sswitch_4
        0x1ab2a4 -> :sswitch_7
        0x1aba80 -> :sswitch_1
        0x1abe05 -> :sswitch_5
        0x1ac545 -> :sswitch_3
        0x1ac8e8 -> :sswitch_6
        0x1ac9e5 -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v0, 0x0

    const-string v1, "\u06e3\u06df\u06e4"

    invoke-static {v1}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    invoke-static {}, Landroid/view/ۢۥۢۦ;->ۤۦۢ۟()I

    move-result v1

    if-ltz v1, :cond_b

    const/16 v1, 0x3e

    sput v1, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    const-string v1, "\u06e5\u06e5\u06df"

    invoke-static {v1}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    :sswitch_1
    sget v1, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v4, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    rem-int/2addr v1, v4

    const v4, 0x1aaf90

    xor-int/2addr v1, v4

    goto :goto_0

    :sswitch_2
    move v0, v2

    :goto_1
    return v0

    :sswitch_3
    move-object v0, p1

    check-cast v0, Ls50;

    sget v1, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v4, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    xor-int/lit16 v4, v4, -0xb53

    xor-int/2addr v1, v4

    if-gtz v1, :cond_2

    :cond_2
    const-string v1, "\u06e5\u06e6\u06e7"

    :goto_2
    invoke-static {v1}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_4
    move v0, v3

    goto :goto_1

    :sswitch_5
    move v0, v2

    goto :goto_1

    :sswitch_6
    instance-of v1, p1, Ls50;

    if-nez v1, :cond_6

    sget v1, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    if-gtz v1, :cond_3

    const-string v1, "\u06e6\u06e8\u06e4"

    invoke-static {v1}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_3
    const-string v1, "\u06e0\u06e3\u06e1"

    goto :goto_2

    :sswitch_7
    sget v1, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v4, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    add-int/lit16 v4, v4, -0x15fd

    div-int/2addr v1, v4

    if-eqz v1, :cond_4

    const-string v1, "\u06e2\u06df\u06e1"

    invoke-static {v1}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_4
    sget v1, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v4, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    add-int/2addr v1, v4

    const v4, 0x1ab676

    xor-int/2addr v1, v4

    goto :goto_0

    :sswitch_8
    move v0, v3

    goto :goto_1

    :sswitch_9
    if-ne p0, p1, :cond_9

    sget v1, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    if-ltz v1, :cond_5

    const/16 v1, 0x55

    sput v1, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    const-string v1, "\u06e4\u06e1\u06e3"

    invoke-static {v1}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_5
    sget v1, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v4, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    add-int/2addr v1, v4

    const v4, -0x1ac77f

    xor-int/2addr v1, v4

    goto :goto_0

    :cond_6
    :sswitch_a
    sget v1, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    if-ltz v1, :cond_7

    invoke-static {}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟ۢۡ۠ۦ()I

    const-string v1, "\u06e6\u06e3\u06e2"

    invoke-static {v1}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_7
    const-string v1, "\u06e3\u06df\u06e7"

    invoke-static {v1}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_b
    move v0, v3

    goto :goto_1

    :sswitch_c
    iget-object v1, p0, Ls50;->a:Ljava/lang/String;

    iget-object v4, v0, Ls50;->a:Ljava/lang/String;

    invoke-static {v1, v4}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->۟ۢۦۡۦ()I

    move-result v1

    if-ltz v1, :cond_8

    const/16 v1, 0xa

    sput v1, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    const-string v1, "\u06e8\u06df\u06e8"

    invoke-static {v1}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_8
    sget v1, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v4, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    add-int/2addr v1, v4

    const v4, 0x1aae50

    add-int/2addr v1, v4

    goto/16 :goto_0

    :sswitch_d
    iget-object v1, p0, Ls50;->b:Ljava/lang/String;

    iget-object v4, v0, Ls50;->b:Ljava/lang/String;

    invoke-static {v1, v4}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "\u06e7\u06e5\u06e0"

    invoke-static {v1}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_9
    :sswitch_e
    sget v1, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v4, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    add-int/lit16 v4, v4, 0x15c8

    div-int/2addr v1, v4

    if-eqz v1, :cond_a

    const/16 v1, 0x49

    sput v1, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    const-string v1, "\u06e6\u06e3\u06e6"

    invoke-static {v1}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_a
    sget v1, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v4, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    div-int/2addr v1, v4

    const v4, -0x1ac8d2

    xor-int/2addr v1, v4

    goto/16 :goto_0

    :cond_b
    sget v1, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v4, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    xor-int/2addr v1, v4

    const v4, 0x1ac02a

    add-int/2addr v1, v4

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa7a1 -> :sswitch_0
        0x1aab1d -> :sswitch_b
        0x1aab3e -> :sswitch_8
        0x1aaf1e -> :sswitch_e
        0x1aaf99 -> :sswitch_d
        0x1ab608 -> :sswitch_9
        0x1ab60b -> :sswitch_3
        0x1aba06 -> :sswitch_1
        0x1aba9f -> :sswitch_7
        0x1abe66 -> :sswitch_c
        0x1ac146 -> :sswitch_2
        0x1ac262 -> :sswitch_a
        0x1ac5c2 -> :sswitch_4
        0x1ac61e -> :sswitch_5
        0x1ac8d1 -> :sswitch_6
    .end sparse-switch
.end method

.method public final hashCode()I
    .locals 4

    const/4 v2, 0x0

    const-string v0, "\u06e4\u06e7\u06e2"

    invoke-static {v0}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v3

    move v0, v2

    move v1, v2

    :goto_0
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget-object v2, p0, Ls50;->b:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/lit8 v2, v2, -0x19

    xor-int/lit16 v1, v1, -0x1b2

    mul-int/2addr v0, v1

    add-int/2addr v0, v2

    add-int/lit8 v0, v0, 0x19

    return v0

    :sswitch_1
    sget v1, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v2, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v3, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    mul-int/lit16 v3, v3, -0xfbc

    mul-int/2addr v2, v3

    if-ltz v2, :cond_1

    invoke-static {}, Landroid/app/ۦۥۡ۠;->ۥۣۡۧ()I

    const-string v2, "\u06e4\u06e7\u06e2"

    invoke-static {v2}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v2

    move v3, v2

    goto :goto_0

    :sswitch_2
    sget v2, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    if-gtz v2, :cond_0

    invoke-static {}, Landroid/view/ۢۥۢۦ;->ۤۦۢ۟()I

    const-string v2, "\u06e7\u06e1\u06e0"

    invoke-static {v2}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v2

    move v3, v2

    goto :goto_0

    :cond_0
    sget v2, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v3, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    div-int/2addr v2, v3

    const v3, 0x1abac1

    add-int/2addr v2, v3

    move v3, v2

    goto :goto_0

    :sswitch_3
    iget-object v0, p0, Ls50;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    invoke-static {}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۦۡۦۢ()I

    move-result v2

    if-ltz v2, :cond_2

    invoke-static {}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۢۧۥۧ()I

    :cond_1
    const-string v2, "\u06e3\u06df\u06df"

    invoke-static {v2}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v2

    move v3, v2

    goto :goto_0

    :cond_2
    sget v2, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v3, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    xor-int/2addr v2, v3

    const v3, 0x1aca7f

    add-int/2addr v2, v3

    move v3, v2

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x1ab603 -> :sswitch_0
        0x1ababf -> :sswitch_3
        0x1abe63 -> :sswitch_2
        0x1ac909 -> :sswitch_1
    .end sparse-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    const-string v1, "\u06e0\u06e8\u06e7"

    invoke-static {v1}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v0, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v2, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    mul-int/2addr v0, v2

    const v2, 0x1a33c2

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, Ls50;->b:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟ۢۧۨۡ()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-static {}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->۟ۡۨۢ()I

    const-string v0, "\u06e0\u06e8\u06e7"

    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e2\u06e0"

    :goto_1
    invoke-static {v0}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TabDef(name="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget v1, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v2, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    xor-int/lit16 v2, v2, 0x1e17

    rem-int/2addr v1, v2

    if-gtz v1, :cond_1

    const/16 v1, 0x3a

    sput v1, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    const-string v1, "\u06e2\u06e0"

    invoke-static {v1}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :cond_1
    sget v1, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v2, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    mul-int/2addr v1, v2

    const v2, 0x1a5301

    add-int/2addr v2, v1

    move-object v1, v0

    goto :goto_0

    :sswitch_3
    const-string v0, ", conditionKey="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v0, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v2, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    mul-int/lit16 v2, v2, 0xe0f

    rem-int/2addr v0, v2

    if-gtz v0, :cond_2

    const/16 v0, 0x9

    sput v0, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    :goto_2
    const-string v0, "\u06e3\u06e7\u06e8"

    :goto_3
    invoke-static {v0}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06df\u06e2\u06e6"

    goto :goto_3

    :sswitch_4
    iget-object v0, p0, Ls50;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :sswitch_5
    sget v0, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v2, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    add-int/lit16 v2, v2, -0x20c2

    sub-int/2addr v0, v2

    if-gtz v0, :cond_3

    const/16 v0, 0x4a

    sput v0, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    const-string v0, "\u06e1\u06e5\u06e4"

    goto :goto_1

    :cond_3
    sget v0, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v2, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    div-int/2addr v0, v2

    const v2, 0x1aabe1

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_6
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc3e -> :sswitch_0
        0x1aa763 -> :sswitch_1
        0x1aabdf -> :sswitch_2
        0x1aaf7a -> :sswitch_6
        0x1ab704 -> :sswitch_3
        0x1abe04 -> :sswitch_5
        0x1ac16d -> :sswitch_4
    .end sparse-switch
.end method
