.class public final Lwa;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:I

.field public final d:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;II)V
    .locals 3

    const-string v0, "qP9YkA==\n"

    const-string v1, "3Jog5N7t4LM=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    const-string v0, "\u06e0\u06e0\u06df"

    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iput p3, p0, Lwa;->c:I

    sget v0, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v2, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    rem-int/lit16 v2, v2, -0xf75

    div-int/2addr v0, v2

    if-ltz v0, :cond_0

    invoke-static {}, Landroid/app/ۦۥۡ۠;->ۥۣۡۧ()I

    const-string v0, "\u06e6\u06e8\u06e3"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    sget v0, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v2, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    or-int/2addr v0, v2

    const v2, -0x1aad80

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lwa;->d:Z

    const-string v0, "\u06e2\u06e5\u06e8"

    :goto_2
    invoke-static {v0}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_2
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    if-gtz v0, :cond_1

    const/16 v0, 0x36

    sput v0, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    const-string v0, "\u06e1\u06e6\u06e2"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    sget v0, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v2, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    or-int/2addr v0, v2

    const v2, 0x1aac47

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_3
    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۣۡۧۢ()I

    move-result v0

    if-gtz v0, :cond_2

    const-string v0, "\u06e5\u06e5\u06e2"

    :goto_3
    invoke-static {v0}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    sget v0, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v2, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    rem-int/2addr v0, v2

    const v2, 0x1aad1b

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_4
    iput-object p1, p0, Lwa;->a:Ljava/lang/String;

    sget v0, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    if-gtz v0, :cond_3

    invoke-static {}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۥ۟۟ۢ()I

    const-string v0, "\u06df\u06e3\u06e4"

    invoke-static {v0}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_3
    sget v0, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v2, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    rem-int/2addr v0, v2

    const v2, 0x1aab82

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_5
    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۣۤۧ()I

    move-result v0

    if-gtz v0, :cond_6

    sget v0, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v2, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    mul-int/lit16 v2, v2, 0xe26

    div-int/2addr v0, v2

    if-eqz v0, :cond_4

    const/16 v0, 0xc

    sput v0, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    const-string v0, "\u06e6\u06e6\u06e7"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_4
    sget v0, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v2, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    xor-int/2addr v0, v2

    const v2, -0x1ac3f3

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_6
    iput p2, p0, Lwa;->b:I

    sget v0, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v2, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    xor-int/lit16 v2, v2, 0x24da

    add-int/2addr v0, v2

    if-gtz v0, :cond_5

    invoke-static {}, Landroidx/savedstate/۠ۡۢ۠;->ۣ۟ۨۤۨ()I

    const-string v2, "\u06e0\u06e0\u06df"

    move-object v0, v1

    :goto_4
    invoke-static {v2}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06e0\u06e1"

    goto/16 :goto_1

    :cond_6
    :sswitch_7
    sget v0, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    if-gtz v0, :cond_7

    const/16 v0, 0x2d

    sput v0, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    const-string v0, "\u06e3\u06e1"

    goto/16 :goto_2

    :cond_7
    const-string v0, "\u06e0\u06e5\u06e0"

    goto :goto_3

    :sswitch_8
    const-string v0, "v5"

    invoke-static {v0}, Landroidx/emoji2/text/ۣۣ۟۟۠;->ۧۦۦۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget v1, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v2, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    add-int/lit16 v2, v2, 0x2033

    add-int/2addr v1, v2

    if-gtz v1, :cond_8

    invoke-static {}, Landroidx/startup/ۣۤۦۥ;->۠ۨ۟()I

    const-string v1, "\u06e1\u06e8\u06e0"

    invoke-static {v1}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto/16 :goto_0

    :cond_8
    const-string v1, "\u06e1\u06e8\u06e0"

    move-object v2, v1

    goto :goto_4

    :sswitch_9
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc01 -> :sswitch_0
        0x1aa780 -> :sswitch_3
        0x1aaac9 -> :sswitch_6
        0x1aaadf -> :sswitch_4
        0x1aab7b -> :sswitch_9
        0x1aaf5d -> :sswitch_1
        0x1aaf99 -> :sswitch_2
        0x1ab305 -> :sswitch_5
        0x1ac227 -> :sswitch_7
        0x1ac261 -> :sswitch_8
    .end sparse-switch
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/16 v3, 0x31

    const/4 v1, 0x0

    const-string v0, "\u06e1\u06e6\u06e0"

    invoke-static {v0}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const/4 v0, 0x0

    :goto_1
    return v0

    :sswitch_1
    iget-object v0, p0, Lwa;->a:Ljava/lang/String;

    iget-object v2, v1, Lwa;->a:Ljava/lang/String;

    invoke-static {v0, v2}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    sget v0, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v2, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    add-int/lit16 v2, v2, -0x1240

    xor-int/2addr v0, v2

    if-ltz v0, :cond_0

    const/16 v0, 0x5e

    sput v0, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    const-string v0, "\u06df\u06e6\u06e6"

    invoke-static {v0}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e2\u06e1"

    :goto_2
    invoke-static {v0}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_2
    const-string v0, "\u06e0\u06e4\u06e2"

    :goto_3
    invoke-static {v0}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    :sswitch_3
    invoke-static {}, Landroidx/recyclerview/widget/ۧۧۦۢ;->ۣۢۦۨ()I

    move-result v0

    if-ltz v0, :cond_2

    const-string v0, "\u06e5\u06e3\u06e6"

    goto :goto_3

    :cond_2
    const-string v0, "\u06e3\u06df\u06e2"

    goto :goto_3

    :sswitch_4
    sget v0, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v2, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    rem-int/lit16 v2, v2, -0x1375

    mul-int/2addr v0, v2

    if-gtz v0, :cond_3

    const/16 v0, 0x18

    sput v0, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    const-string v0, "\u06e5\u06e2\u06df"

    invoke-static {v0}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_3
    sget v0, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    add-int/2addr v0, v2

    const v2, 0x1aa948

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_5
    const/4 v0, 0x1

    goto :goto_1

    :sswitch_6
    if-ne p0, p1, :cond_14

    invoke-static {}, Lio/fastkv/ۦۣ۠ۨ;->۠ۡۨۧ()I

    move-result v0

    if-ltz v0, :cond_4

    invoke-static {}, Landroidx/recyclerview/widget/ۧۧۦۢ;->ۣۢۦۨ()I

    const-string v0, "\u06df\u06e3"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_4
    sget v0, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v2, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    div-int/2addr v0, v2

    const v2, 0x1abd8d

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_7
    instance-of v0, p1, Lwa;

    if-nez v0, :cond_9

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->۟ۢۦۡۦ()I

    move-result v0

    if-ltz v0, :cond_5

    invoke-static {}, Lcom/google/android/material/carousel/۠ۨۡۢ;->ۦۧۢ۟()I

    const-string v0, "\u06e1\u06e8\u06e5"

    invoke-static {v0}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_5
    sget v0, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v2, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    add-int/2addr v0, v2

    const v2, 0x1ac98a

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_8
    sget v0, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    if-ltz v0, :cond_6

    const-string v0, "\u06e0\u06e7\u06e1"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_6
    sget v0, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v2, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    mul-int/2addr v0, v2

    const v2, 0x323c4

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_9
    sget v0, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    xor-int/2addr v0, v2

    const v2, 0x1ab0d6

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :cond_7
    :sswitch_a
    sget v0, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v2, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    div-int/lit16 v2, v2, 0x456

    xor-int/2addr v0, v2

    if-gtz v0, :cond_8

    const-string v0, "\u06e7\u06e0\u06e6"

    invoke-static {v0}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_8
    sget v0, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v2, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sub-int/2addr v0, v2

    const v2, 0x1abd66

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :cond_9
    :sswitch_b
    sget v0, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v2, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    add-int/lit16 v2, v2, -0x164e

    rem-int/2addr v0, v2

    if-ltz v0, :cond_a

    invoke-static {}, Lcom/google/android/material/carousel/۟ۧۡۢ;->۟ۦۥۣۧ()I

    const-string v0, "\u06e7\u06df\u06e7"

    goto/16 :goto_2

    :cond_a
    sget v0, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v2, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    add-int/2addr v0, v2

    const v2, -0x1aa87f

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_c
    sget v0, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v2, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    add-int/lit16 v2, v2, -0x2260

    rem-int/2addr v0, v2

    if-ltz v0, :cond_b

    const-string v0, "\u06e8\u06e4\u06e4"

    invoke-static {v0}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_b
    const-string v0, "\u06e4\u06e6\u06e8"

    :goto_4
    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_d
    const-string v0, "\u06e6\u06e8\u06e5"

    goto :goto_4

    :cond_c
    :sswitch_e
    sget v0, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v2, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    div-int/lit16 v2, v2, -0x4bd

    mul-int/2addr v0, v2

    if-eqz v0, :cond_d

    invoke-static {}, Landroidx/core/content/ۥۨۤۦ;->۟۠۠۠ۥ()I

    const-string v0, "\u06e8\u06e2\u06e7"

    :goto_5
    invoke-static {v0}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_d
    const-string v0, "\u06e6\u06e6\u06e8"

    goto :goto_5

    :sswitch_f
    iget v0, p0, Lwa;->c:I

    iget v2, v1, Lwa;->c:I

    if-eq v0, v2, :cond_7

    sget v0, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v2, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    xor-int/2addr v0, v2

    const v2, 0xde0c

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_10
    iget v0, p0, Lwa;->b:I

    iget v2, v1, Lwa;->b:I

    if-eq v0, v2, :cond_1

    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۢۨۨۤ()I

    move-result v0

    if-ltz v0, :cond_e

    const/4 v0, 0x2

    sput v0, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    const-string v2, "\u06e2\u06e2"

    move-object v0, v1

    :goto_6
    invoke-static {v2}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto/16 :goto_0

    :cond_e
    const-string v0, "\u06e6\u06e1\u06e8"

    goto/16 :goto_3

    :sswitch_11
    iget-boolean v0, p0, Lwa;->d:Z

    iget-boolean v2, v1, Lwa;->d:Z

    if-eq v0, v2, :cond_12

    sget v0, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v2, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    div-int/lit16 v2, v2, -0x112b

    add-int/2addr v0, v2

    if-gtz v0, :cond_f

    const-string v0, "\u06e2\u06e1"

    invoke-static {v0}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_f
    const-string v0, "\u06df\u06e3"

    invoke-static {v0}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_12
    move-object v0, p1

    check-cast v0, Lwa;

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->۟۠ۡۢۦ()I

    move-result v1

    if-gtz v1, :cond_10

    const-string v1, "\u06e8\u06e0\u06df"

    invoke-static {v1}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto/16 :goto_0

    :cond_10
    const-string v1, "\u06e0\u06e0\u06e6"

    move-object v2, v1

    goto :goto_6

    :sswitch_13
    sget v0, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v2, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    add-int/lit16 v2, v2, -0x221

    sub-int/2addr v0, v2

    if-gtz v0, :cond_11

    sput v3, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    const-string v0, "\u06e6\u06e0\u06e1"

    invoke-static {v0}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_11
    const-string v0, "\u06e8\u06e4\u06e4"

    invoke-static {v0}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_12
    :sswitch_14
    sget v0, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v2, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    rem-int/lit16 v2, v2, 0x13bc

    add-int/2addr v0, v2

    if-gtz v0, :cond_13

    const/16 v0, 0x57

    sput v0, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    const-string v0, "\u06e6\u06e1"

    :goto_7
    invoke-static {v0}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_13
    const-string v0, "\u06e6\u06e0\u06e1"

    goto :goto_7

    :cond_14
    :sswitch_15
    sget v0, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v2, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    div-int/lit16 v2, v2, 0x19d5

    or-int/2addr v0, v2

    if-ltz v0, :cond_15

    sput v3, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    const-string v0, "\u06e7\u06e6\u06e5"

    goto/16 :goto_4

    :cond_15
    sget v0, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v2, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    or-int/2addr v0, v2

    const v2, -0x1ac7de

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe4 -> :sswitch_0
        0xdc3f -> :sswitch_c
        0xdc40 -> :sswitch_e
        0xdcc0 -> :sswitch_2
        0x1aa79e -> :sswitch_3
        0x1aa7df -> :sswitch_8
        0x1aaae6 -> :sswitch_1
        0x1aab5e -> :sswitch_8
        0x1aae81 -> :sswitch_12
        0x1aaf5b -> :sswitch_6
        0x1aaf9e -> :sswitch_15
        0x1ab2c4 -> :sswitch_b
        0x1ab606 -> :sswitch_f
        0x1abaa6 -> :sswitch_8
        0x1abd8d -> :sswitch_13
        0x1abdc4 -> :sswitch_14
        0x1abde2 -> :sswitch_11
        0x1ac167 -> :sswitch_5
        0x1ac18d -> :sswitch_d
        0x1ac1e4 -> :sswitch_8
        0x1ac228 -> :sswitch_10
        0x1ac263 -> :sswitch_8
        0x1ac5e7 -> :sswitch_7
        0x1ac8e7 -> :sswitch_a
        0x1ac968 -> :sswitch_14
        0x1ac96c -> :sswitch_4
        0x1ac9a5 -> :sswitch_9
    .end sparse-switch
.end method

.method public final hashCode()I
    .locals 6

    const/4 v1, 0x0

    const-string v0, "\u06e8\u06e0\u06e5"

    invoke-static {v0}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v5

    move v0, v1

    move v2, v1

    move v3, v1

    move v4, v1

    :goto_0
    sparse-switch v5, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v1, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    xor-int/lit16 v1, v1, -0x89

    sget v4, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    if-ltz v4, :cond_2

    const-string v4, "\u06e3\u06e6\u06e5"

    invoke-static {v4}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v5

    move v4, v1

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, Lwa;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    sget v0, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v5, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    add-int/lit16 v5, v5, 0x8bf

    xor-int/2addr v0, v5

    if-ltz v0, :cond_0

    invoke-static {}, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۢ۠ۨ۟()I

    const-string v0, "\u06e8\u06e0\u06e6"

    :goto_1
    invoke-static {v0}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v5

    move v0, v1

    goto :goto_0

    :cond_0
    const-string v0, "\u06e5\u06e7"

    goto :goto_1

    :sswitch_2
    iget-boolean v0, p0, Lwa;->d:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    add-int/lit8 v0, v0, -0x1d

    add-int/2addr v0, v3

    add-int/lit8 v0, v0, 0x1d

    return v0

    :sswitch_3
    iget v1, p0, Lwa;->b:I

    mul-int v2, v0, v4

    invoke-static {v1, v2, v4}, Lz30;->d(III)I

    move-result v1

    sget v2, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v5, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    or-int/lit16 v5, v5, 0x85e

    sub-int/2addr v2, v5

    if-gtz v2, :cond_1

    invoke-static {}, L۟ۡۦۧۤ;->۟۟۠ۡۢ()I

    const-string v2, "\u06e5\u06e7"

    invoke-static {v2}, Landroidx/core/content/ۣ۟ۧ۠;->ۥۦۤ۠(Ljava/lang/Object;)I

    move-result v5

    move v2, v1

    goto :goto_0

    :cond_1
    sget v2, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v5, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    add-int/2addr v2, v5

    const v5, 0x1ab4d9

    xor-int/2addr v5, v2

    move v2, v1

    goto :goto_0

    :sswitch_4
    iget v1, p0, Lwa;->c:I

    invoke-static {v1, v2, v4}, Lz30;->d(III)I

    move-result v1

    const-string v3, "\u06e1\u06e1\u06e1"

    invoke-static {v3}, Landroid/app/۟ۦۦۤۥ;->ۦۨۥ۟(Ljava/lang/Object;)I

    move-result v5

    move v3, v1

    goto :goto_0

    :sswitch_5
    const-string v1, "\u06e8\u06e0\u06e5"

    invoke-static {v1}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v1

    move v5, v1

    goto :goto_0

    :cond_2
    sget v4, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v5, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    div-int/2addr v4, v5

    const v5, 0xdcfd

    add-int/2addr v5, v4

    move v4, v1

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdca2 -> :sswitch_0
        0xdcfd -> :sswitch_3
        0x1aaec1 -> :sswitch_2
        0x1ab6e2 -> :sswitch_4
        0x1ac8ed -> :sswitch_1
        0x1ac8ee -> :sswitch_5
    .end sparse-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    const/4 v1, 0x0

    const-string v0, "\u06e3\u06e2"

    invoke-static {v0}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TagData(text="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget v1, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v2, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    xor-int/lit16 v2, v2, -0x6a6

    sub-int/2addr v1, v2

    if-gtz v1, :cond_2

    const/16 v1, 0x4c

    sput v1, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    const-string v1, "\u06e3\u06e2"

    invoke-static {v1}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :sswitch_1
    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۥۧۧ()I

    move-result v0

    if-gtz v0, :cond_0

    const/16 v0, 0x57

    sput v0, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    const-string v0, "\u06e0\u06e6\u06e6"

    invoke-static {v0}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e0\u06e6\u06e7"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_2
    iget v0, p0, Lwa;->b:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    sget v0, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v2, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    xor-int/2addr v0, v2

    const v2, 0x1aaef4

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_3
    const-string v0, ", bgColor="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v0, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    if-ltz v0, :cond_5

    invoke-static {}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟ۢۡ۠ۦ()I

    const-string v0, "\u06e4\u06e8\u06e4"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_4
    const-string v0, ", textColor="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v0, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v2, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    rem-int/lit16 v2, v2, 0x1fd3

    or-int/2addr v0, v2

    if-ltz v0, :cond_1

    const-string v0, "\u06e3\u06e3\u06e3"

    :goto_1
    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    sget v0, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v2, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    rem-int/2addr v0, v2

    const v2, 0x1ac370

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :cond_2
    const-string v1, "\u06e3\u06e3\u06e3"

    move-object v2, v1

    :goto_2
    invoke-static {v2}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto/16 :goto_0

    :sswitch_5
    iget-object v0, p0, Lwa;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\u06e8\u06e2\u06e6"

    goto :goto_1

    :sswitch_6
    iget v0, p0, Lwa;->c:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    sget v0, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v2, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    add-int/lit16 v2, v2, 0x1b99

    xor-int/2addr v0, v2

    if-gtz v0, :cond_3

    const/16 v0, 0x51

    sput v0, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    const-string v0, "\u06e0\u06e6\u06e7"

    invoke-static {v0}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_3
    sget v0, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v2, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    add-int/2addr v0, v2

    const v2, -0x1aba82

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_7
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_8
    iget-boolean v0, p0, Lwa;->d:Z

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    sget v0, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v2, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    add-int/lit16 v2, v2, -0x1823

    or-int/2addr v0, v2

    if-ltz v0, :cond_4

    invoke-static {}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣ۟۠()I

    const-string v2, "\u06e6\u06e3\u06e5"

    move-object v0, v1

    goto :goto_2

    :cond_4
    const-string v0, "\u06e6\u06e5\u06e2"

    :goto_3
    invoke-static {v0}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_9
    sget v0, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v2, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    div-int/2addr v0, v2

    const v2, 0xdc5f

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_a
    const-string v0, ", isDynamic="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v0, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v2, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    add-int/lit16 v2, v2, -0x10f4

    mul-int/2addr v0, v2

    if-ltz v0, :cond_6

    :cond_5
    const-string v0, "\u06e0\u06e4\u06e3"

    goto :goto_3

    :cond_6
    const-string v0, "\u06e2\u06df\u06e2"

    goto :goto_3

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc5f -> :sswitch_0
        0x1aab5f -> :sswitch_2
        0x1aaba0 -> :sswitch_9
        0x1aaba1 -> :sswitch_7
        0x1aaf5d -> :sswitch_4
        0x1ab245 -> :sswitch_8
        0x1ab683 -> :sswitch_5
        0x1abae0 -> :sswitch_a
        0x1ac1c8 -> :sswitch_6
        0x1ac203 -> :sswitch_1
        0x1ac92c -> :sswitch_3
    .end sparse-switch
.end method
