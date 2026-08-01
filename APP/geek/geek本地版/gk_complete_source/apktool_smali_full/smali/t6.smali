.class public abstract Lt6;
.super Ljava/lang/Object;


# static fields
.field public static a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "\u06e3\u06e8\u06e7"

    invoke-static {v0}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v1, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sub-int/2addr v0, v1

    const v1, 0x1ab868

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    const-string v0, "\u06e7\u06e6\u06e5"

    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_2
    const-string v0, ""

    sput-object v0, Lt6;->a:Ljava/lang/String;

    sget v0, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v1, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    mul-int/lit16 v1, v1, -0x197c

    add-int/2addr v0, v1

    if-gtz v0, :cond_0

    const-string v0, "\u06e7\u06e6\u06e5"

    invoke-static {v0}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v1, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sub-int/2addr v0, v1

    const v1, -0x1abec0

    xor-int/2addr v0, v1

    goto :goto_0

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1ab71e -> :sswitch_0
        0x1ab722 -> :sswitch_1
        0x1abade -> :sswitch_3
        0x1ac5e6 -> :sswitch_2
    .end sparse-switch
.end method

.method public static a(Landroid/app/Application;)V
    .locals 10

    const/4 v9, 0x0

    const/4 v0, 0x0

    const-string v1, "\u06e0\u06e7"

    invoke-static {v1}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v4

    move-object v1, v0

    move-object v8, v0

    move-object v6, v0

    move-object v2, v0

    move-object v3, v0

    move-object v7, v0

    :goto_0
    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "uaXKUzHrCg==\n"

    const-string v4, "2sqkJ1STfsA=\n"

    invoke-static {v0, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v0, "\u06e2\u06e0\u06e3"

    :goto_1
    invoke-static {v0}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :sswitch_1
    :try_start_0
    invoke-virtual {v7}, Ljava/lang/String;->length()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-lez v0, :cond_3

    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->۟ۡۥ۟ۨ()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {}, Landroidx/legacy/content/۠ۥۣۥ;->۟۠ۧ۟۟()I

    const-string v0, "\u06e4\u06df\u06e7"

    invoke-static {v0}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e4\u06df\u06e7"

    move-object v4, v0

    move-object v5, v3

    :goto_2
    invoke-static {v4}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v0

    move-object v3, v5

    move v4, v0

    goto :goto_0

    :sswitch_2
    sget v0, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v3, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    or-int/lit16 v3, v3, 0x376

    or-int/2addr v0, v3

    if-gtz v0, :cond_1

    const-string v0, "\u06e5\u06e5\u06e0"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v0

    move-object v3, v2

    move v4, v0

    goto :goto_0

    :cond_1
    move-object v0, v2

    :goto_3
    const-string v3, "\u06e7\u06e0\u06e7"

    move-object v4, v3

    move-object v5, v0

    goto :goto_2

    :sswitch_3
    sget v0, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v4, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    xor-int/lit16 v4, v4, 0x4e2

    xor-int/2addr v0, v4

    if-gtz v0, :cond_2

    const-string v0, "\u06e2\u06e3\u06e1"

    :goto_4
    invoke-static {v0}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e8\u06e3"

    :goto_5
    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :catchall_0
    move-exception v0

    const-string v0, "hKFKzkpqUXCGt0jE\n"

    const-string v3, "0e8BgAU9Hy8=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :goto_6
    const-string v0, "\u06e1\u06e5\u06e8"

    invoke-static {v0}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_3
    :sswitch_4
    const-string v0, "\u06e2\u06e7\u06e2"

    goto :goto_4

    :sswitch_5
    invoke-static {}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣ۟۠()I

    move-result v0

    if-gtz v0, :cond_4

    invoke-static {}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۦۤۨۢ()I

    const-string v0, "\u06e8\u06df\u06e4"

    invoke-static {v0}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_4
    const-string v0, "\u06e5\u06e8\u06e7"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :sswitch_6
    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۣۡ۠ۡ()I

    move-result v0

    if-gtz v0, :cond_5

    const/16 v0, 0xd

    sput v0, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    const-string v0, "\u06e2\u06e7\u06e2"

    invoke-static {v0}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v0

    move-object v7, v1

    move v4, v0

    goto/16 :goto_0

    :cond_5
    sget v0, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v4, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    mul-int/2addr v0, v4

    const v4, 0x1b4223

    xor-int/2addr v0, v4

    move-object v7, v1

    move v4, v0

    goto/16 :goto_0

    :sswitch_7
    :try_start_1
    const-string v0, "MGZcGKDldPMycF4S\n"

    const-string v4, "ZSgXVu+yOqw=\n"

    invoke-static {v0, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v2

    sget v0, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v4, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    xor-int/lit16 v4, v4, 0x26f1

    or-int/2addr v0, v4

    if-gtz v0, :cond_6

    const-string v0, "\u06e7\u06e4\u06e6"

    :goto_7
    invoke-static {v0}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_6
    sget v0, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v4, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    xor-int/2addr v0, v4

    const v4, 0x1aa766

    add-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->۟ۡۥۥۣ()I

    move-result v0

    if-gtz v0, :cond_7

    invoke-static {}, Landroid/app/ۦۥۡ۠;->ۥۣۡۧ()I

    const-string v0, "\u06e5\u06e1\u06e6"

    goto/16 :goto_5

    :cond_7
    const-string v0, "\u06e0\u06e7"

    goto/16 :goto_5

    :sswitch_9
    sget v0, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sget v4, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    rem-int/lit16 v4, v4, -0x1eef

    or-int/2addr v0, v4

    if-gtz v0, :cond_8

    const/16 v0, 0x41

    sput v0, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    const-string v0, "\u06df\u06e7\u06e5"

    invoke-static {v0}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v0

    move-object v7, v8

    move v4, v0

    goto/16 :goto_0

    :cond_8
    const-string v0, "\u06e4\u06e4\u06e2"

    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v0

    move-object v7, v8

    move v4, v0

    goto/16 :goto_0

    :sswitch_a
    :try_start_2
    const-string v0, "2X9Sr0wiwG3ffkuvVSrxfsh1WeRKIsBt32M=\n"

    const-string v4, "uhA/gThHrg4=\n"

    invoke-static {v0, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x0

    invoke-virtual {p0, v0, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v4, "BYhaKrl8G04An1QtiFYfThuJXC6y\n"

    const-string v5, "aec9Q9cjbCs=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, ""

    invoke-interface {v0, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v0

    sget v4, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v5, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    or-int/lit16 v5, v5, 0x17d

    xor-int/2addr v4, v5

    if-gtz v4, :cond_f

    const-string v4, "\u06e2\u06e1\u06e4"

    invoke-static {v4}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v4

    move-object v6, v0

    goto/16 :goto_0

    :sswitch_b
    sput-object v3, Lt6;->a:Ljava/lang/String;

    sget v0, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v4, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    add-int/lit16 v4, v4, 0x2389

    div-int/2addr v0, v4

    if-eqz v0, :cond_9

    invoke-static {}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۠۠ۧ۟()I

    move-object v0, v3

    goto/16 :goto_3

    :cond_9
    sget v0, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v4, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    rem-int/2addr v0, v4

    const v4, -0x1abf5b

    xor-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :cond_a
    :sswitch_c
    sget v0, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v4, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sub-int/2addr v0, v4

    const v4, 0x1acd0d

    add-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :sswitch_d
    sget v0, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    if-ltz v0, :cond_b

    invoke-static {}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟ۧۢ۟ۧ()I

    const-string v0, "\u06e4\u06e7\u06e5"

    goto/16 :goto_1

    :cond_b
    const-string v0, "\u06df\u06e3\u06e7"

    invoke-static {v0}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۣۤۧ()I

    move-result v0

    if-gtz v0, :cond_c

    invoke-static {}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۡۢۡۥ()I

    const-string v0, "\u06e8\u06e3\u06e6"

    invoke-static {v0}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_c
    sget v0, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v4, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    rem-int/2addr v0, v4

    const v4, 0x1aa9f8

    add-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :sswitch_f
    sget v0, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    if-ltz v0, :cond_d

    const/16 v0, 0x59

    sput v0, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    const-string v0, "\u06e7\u06e6\u06e4"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v0

    move-object v8, v6

    move v4, v0

    goto/16 :goto_0

    :cond_d
    sget v0, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v4, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    rem-int/2addr v0, v4

    const v4, 0x1abab0

    add-int/2addr v0, v4

    move-object v8, v6

    move v4, v0

    goto/16 :goto_0

    :sswitch_10
    const-string v0, "vIMIcHunIheOiQJIc7wzIKfZ\n"

    const-string v4, "0exsLxrSVn8=\n"

    invoke-static {v0, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, v9}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    sget v0, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v4, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    div-int/lit16 v4, v4, -0x16a3

    sub-int/2addr v0, v4

    if-gtz v0, :cond_e

    const/16 v0, 0x21

    sput v0, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    const-string v0, "\u06e4\u06e6\u06e8"

    invoke-static {v0}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_e
    const-string v0, "\u06e5\u06e6\u06df"

    move-object v4, v0

    move-object v5, v3

    goto/16 :goto_2

    :sswitch_11
    const-string v1, ""

    const-string v0, "\u06e8\u06e3"

    goto/16 :goto_7

    :sswitch_12
    sget v0, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v3, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    rem-int/lit16 v3, v3, -0x1aa2

    mul-int/2addr v0, v3

    if-ltz v0, :cond_10

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟۟ۤۥ۠()I

    move-object v0, v6

    move-object v3, v7

    :cond_f
    const-string v4, "\u06e6\u06e0\u06e5"

    invoke-static {v4}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v4

    move-object v6, v0

    goto/16 :goto_0

    :cond_10
    sget v0, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v3, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    xor-int/2addr v0, v3

    const v3, 0x1ac45c

    add-int/2addr v0, v3

    move-object v3, v7

    move v4, v0

    goto/16 :goto_0

    :sswitch_13
    invoke-static {}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۣ۟ۧۤۡ()I

    move-result v0

    if-ltz v0, :cond_11

    const/16 v0, 0x2c

    sput v0, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    const-string v0, "\u06e5\u06e4\u06e4"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_11
    sget v0, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v4, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    mul-int/2addr v0, v4

    const v4, 0x1f4398

    add-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :sswitch_14
    if-nez v6, :cond_a

    sget v0, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    if-ltz v0, :cond_12

    const/16 v0, 0xc

    sput v0, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    goto/16 :goto_6

    :cond_12
    sget v0, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v4, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    rem-int/2addr v0, v4

    const v4, 0x1ac84c

    xor-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :sswitch_15
    sget v0, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    if-gtz v0, :cond_13

    invoke-static {}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟۟ۤۦۨ()I

    const-string v0, "\u06e3\u06e1\u06e5"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_13
    sget v0, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v4, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sub-int/2addr v0, v4

    const v4, 0xd9d6

    add-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :sswitch_16
    sget v0, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v4, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    div-int/lit16 v4, v4, -0xa20

    xor-int/2addr v0, v4

    if-ltz v0, :cond_14

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->۟ۢۦۡۦ()I

    const-string v0, "\u06e5\u06e3\u06e5"

    invoke-static {v0}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_14
    sget v0, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v4, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    or-int/2addr v0, v4

    const v4, 0x1ac9b9

    add-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :sswitch_17
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc07 -> :sswitch_0
        0xdcfb -> :sswitch_a
        0xdd00 -> :sswitch_13
        0x1aa75c -> :sswitch_3
        0x1aa783 -> :sswitch_2
        0x1aa7fd -> :sswitch_b
        0x1aaf44 -> :sswitch_e
        0x1ab265 -> :sswitch_10
        0x1ab285 -> :sswitch_4
        0x1ab33d -> :sswitch_7
        0x1ab647 -> :sswitch_8
        0x1ab9cc -> :sswitch_12
        0x1aba62 -> :sswitch_1
        0x1abaa6 -> :sswitch_9
        0x1abe07 -> :sswitch_c
        0x1abe24 -> :sswitch_15
        0x1abe40 -> :sswitch_17
        0x1abe5e -> :sswitch_11
        0x1abea4 -> :sswitch_e
        0x1ac16b -> :sswitch_14
        0x1ac52e -> :sswitch_5
        0x1ac585 -> :sswitch_d
        0x1ac5a9 -> :sswitch_16
        0x1ac5e5 -> :sswitch_13
        0x1ac8cd -> :sswitch_f
        0x1ac963 -> :sswitch_6
        0x1ac986 -> :sswitch_e
    .end sparse-switch
.end method
