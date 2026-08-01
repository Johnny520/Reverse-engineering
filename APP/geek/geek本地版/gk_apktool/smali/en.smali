.class public final Len;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# virtual methods
.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 4

    const-wide/16 v0, 0x0

    const-string v2, "\u06e8\u06e0\u06e8"

    invoke-static {v2}, Landroidx/core/content/ۣ۟ۧ۠;->ۥۦۤ۠(Ljava/lang/Object;)I

    move-result v2

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v2, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v3, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    rem-int/2addr v2, v3

    const v3, 0x1ac92f

    add-int/2addr v2, v3

    goto :goto_0

    :cond_0
    :sswitch_1
    sget v2, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v3, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    mul-int/lit16 v3, v3, 0x269e

    div-int/2addr v2, v3

    if-eqz v2, :cond_1

    const/16 v2, 0x35

    sput v2, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    const-string v2, "\u06e4\u06e6\u06e8"

    :goto_1
    invoke-static {v2}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :cond_1
    const-string v2, "\u06e7\u06e5\u06e8"

    goto :goto_1

    :sswitch_2
    const-string v0, "Ad5fd62yzZxEps2ic2EpxpkN"

    invoke-static {v0}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۧۡ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget v2, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    if-gtz v2, :cond_2

    const/16 v2, 0x4a

    sput v2, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    const-string v2, "\u06e6\u06e7\u06e6"

    invoke-static {v2}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :cond_2
    const-string v2, "\u06e6\u06e7\u06e6"

    goto :goto_1

    :sswitch_3
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

    sget v2, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    if-ltz v2, :cond_3

    :cond_3
    const-string v2, "\u06e7\u06e5\u06e8"

    invoke-static {v2}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :sswitch_4
    invoke-static {}, Landroidx/lifecycle/۟۟ۡۨ;->ۦۣ۟ۦ()I

    move-result v2

    if-gtz v2, :cond_0

    sget v2, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v3, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    add-int/lit16 v3, v3, -0xef7

    mul-int/2addr v2, v3

    if-gtz v2, :cond_4

    const-string v2, "\u06df\u06e6\u06e7"

    invoke-static {v2}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :cond_4
    sget v2, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v3, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    mul-int/2addr v2, v3

    const v3, -0x1afed5

    xor-int/2addr v2, v3

    goto :goto_0

    :sswitch_5
    const-string v2, "pl2E\n"

    const-string v3, "xz7w2PqCZGw=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    sget v2, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v3, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    or-int/lit16 v3, v3, -0x157

    div-int/2addr v2, v3

    if-gtz v2, :cond_5

    const/16 v2, 0x46

    sput v2, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    const-string v2, "\u06e0\u06e1\u06e5"

    invoke-static {v2}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v2

    goto/16 :goto_0

    :cond_5
    const-string v2, "\u06e0\u06e1\u06e5"

    goto :goto_1

    :sswitch_6
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa7e0 -> :sswitch_0
        0x1aa800 -> :sswitch_1
        0x1aab04 -> :sswitch_4
        0x1abadb -> :sswitch_2
        0x1ac245 -> :sswitch_3
        0x1ac5ca -> :sswitch_6
        0x1ac8f0 -> :sswitch_5
    .end sparse-switch
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 3

    const/4 v0, 0x0

    const-string v1, "\u06e8\u06e7\u06e2"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Landroidx/fragment/app/۟ۧۡۦ;->ۧۤۨ۟()I

    move-result v1

    if-gtz v1, :cond_3

    sget v1, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    if-ltz v1, :cond_0

    const-string v1, "\u06e0\u06df\u06e7"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    sget v1, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v2, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    mul-int/2addr v1, v2

    const v2, 0x1df5c4

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_1
    const-string v1, "rs+T\n"

    const-string v2, "z6zn5nClTAQ=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    sget v1, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    if-gtz v1, :cond_1

    const/16 v1, 0xb

    sput v1, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    :cond_1
    const-string v1, "\u06e4\u06e5"

    :goto_1
    invoke-static {v1}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_2
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v1, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v2, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    or-int/lit16 v2, v2, 0x1ebc

    xor-int/2addr v1, v2

    if-ltz v1, :cond_2

    const/16 v1, 0x57

    sput v1, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    const-string v1, "\u06e8\u06e7\u06e2"

    invoke-static {v1}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    sget v1, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v2, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    div-int/2addr v1, v2

    const v2, 0x1aaad5

    add-int/2addr v1, v2

    goto :goto_0

    :cond_3
    :sswitch_3
    sget v1, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v2, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    add-int/lit16 v2, v2, -0x22aa

    rem-int/2addr v1, v2

    if-gtz v1, :cond_4

    const-string v1, "\u06e7\u06e4\u06e3"

    invoke-static {v1}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_4
    sget v1, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v2, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    div-int/2addr v1, v2

    const v2, 0x1aaac9

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_4
    sget v1, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    add-int/2addr v1, v2

    const v2, 0x1acca6

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_5
    const-string v0, "soiXpb"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۤۧۥۣ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget v1, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v2, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    add-int/lit16 v2, v2, -0x1c15

    xor-int/2addr v1, v2

    if-gtz v1, :cond_5

    const/4 v1, 0x1

    sput v1, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    const-string v1, "\u06e8\u06e0\u06df"

    invoke-static {v1}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_5
    const-string v1, "\u06e5\u06e6\u06e5"

    goto :goto_1

    :sswitch_6
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc81 -> :sswitch_0
        0x1aaac8 -> :sswitch_6
        0x1aabbe -> :sswitch_5
        0x1aaee0 -> :sswitch_4
        0x1abe64 -> :sswitch_2
        0x1ac8e7 -> :sswitch_3
        0x1ac9c3 -> :sswitch_1
    .end sparse-switch
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 3

    const/4 v0, 0x0

    const-string v1, "\u06e8\u06e4\u06e5"

    invoke-static {v1}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v2, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    mul-int/lit16 v2, v2, -0x1a4c

    mul-int/2addr v0, v2

    if-ltz v0, :cond_0

    invoke-static {}, L۟ۡۦۧۤ;->۟۟۠ۡۢ()I

    const-string v0, "\u06e2\u06e1\u06e0"

    :goto_1
    invoke-static {v0}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e8\u06e4\u06e5"

    goto :goto_1

    :cond_1
    :sswitch_1
    sget v0, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v2, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    or-int/2addr v0, v2

    const v2, 0x1ab396

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_2
    const-string v0, "CiWN\n"

    const-string v2, "a0b55eJghxw=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v2, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    xor-int/lit16 v2, v2, 0xea1

    rem-int/2addr v0, v2

    if-ltz v0, :cond_2

    invoke-static {}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۦۡۦۢ()I

    const-string v0, "\u06e3\u06e5\u06e6"

    invoke-static {v0}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_3
    invoke-static {}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۣ۟ۧۤۡ()I

    move-result v0

    if-ltz v0, :cond_1

    sget v0, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v2, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    or-int/2addr v0, v2

    const v2, -0x1acacb

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_4
    const-string v0, "05FqpLRgsOKS3mcv8VG3U"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۣ۟ۤ۟ۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget v1, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v2, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    or-int/2addr v1, v2

    const v2, 0x1ac1ab

    add-int/2addr v2, v1

    move-object v1, v0

    goto :goto_0

    :sswitch_5
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    invoke-static {}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۢۡۤ()I

    move-result v0

    if-ltz v0, :cond_3

    const/4 v0, 0x6

    sput v0, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    :cond_2
    const-string v0, "\u06e3\u06e5\u06e8"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_3
    sget v0, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v2, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    mul-int/2addr v0, v2

    const v2, 0x184e1d

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_6
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa71e -> :sswitch_0
        0x1ab6c4 -> :sswitch_6
        0x1ab6c6 -> :sswitch_3
        0x1ab6e1 -> :sswitch_1
        0x1abe63 -> :sswitch_5
        0x1ac8ea -> :sswitch_4
        0x1ac969 -> :sswitch_2
    .end sparse-switch
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 6

    const/4 v1, 0x0

    const/4 v0, 0x0

    const-string v2, "\u06e5\u06e4\u06e3"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v4

    move-object v5, v1

    move-object v2, v1

    move-object v3, v1

    :goto_0
    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sget v4, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v5, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    add-int/lit16 v5, v5, 0x689

    div-int/2addr v4, v5

    if-ltz v4, :cond_2

    invoke-static {}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟۟ۤۦۨ()I

    const-string v4, "\u06e5\u06e7\u06e4"

    invoke-static {v4}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v4

    move-object v5, v1

    goto :goto_0

    :sswitch_1
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v1, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v4, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    add-int/lit16 v4, v4, -0x3e0

    div-int/2addr v1, v4

    if-eqz v1, :cond_1

    const/16 v1, 0x21

    sput v1, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    :cond_0
    const-string v1, "\u06e5\u06e6\u06e3"

    :goto_1
    invoke-static {v1}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_2
    const-string v2, "\u06e1\u06e2\u06e6"

    invoke-static {v2}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۣ۠ۧۢ(Ljava/lang/Object;)I

    move-result v4

    move-object v2, v1

    goto :goto_0

    :cond_2
    sget v4, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v5, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    rem-int/2addr v4, v5

    const v5, 0x1ab1da

    add-int/2addr v4, v5

    move-object v5, v1

    goto :goto_0

    :sswitch_2
    const-string v1, "6AAA\n"

    const-string v4, "iWN09Dsl+Cg=\n"

    invoke-static {v1, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣۣۢۢ()I

    move-result v1

    if-gtz v1, :cond_3

    invoke-static {}, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۢۧ()I

    const-string v1, "\u06df\u06e8\u06e0"

    invoke-static {v1}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto :goto_0

    :cond_3
    const-string v1, "\u06e1\u06e4\u06df"

    goto :goto_1

    :sswitch_3
    sput-object v2, Lgn;->e:Ljava/lang/String;

    sget v1, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v4, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    rem-int/lit16 v4, v4, -0x67b

    rem-int/2addr v1, v4

    if-ltz v1, :cond_a

    const/16 v1, 0x2e

    sput v1, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    const-string v1, "\u06e1\u06e8\u06e3"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto :goto_0

    :sswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۦ۟ۥۣ()I

    move-result v2

    if-gtz v2, :cond_4

    invoke-static {}, Lkotlinx/coroutines/ۦۡۧۧ;->۟ۤۧۨۦ()I

    goto :goto_2

    :cond_4
    sget v2, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v4, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    xor-int/2addr v2, v4

    const v4, 0x1ac182

    add-int/2addr v4, v2

    move-object v2, v1

    goto/16 :goto_0

    :sswitch_5
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

    sget v1, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    if-gtz v1, :cond_5

    const/16 v1, 0x63

    sput v1, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    const-string v1, "\u06e8\u06e8\u06e0"

    invoke-static {v1}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto/16 :goto_0

    :cond_5
    const-string v1, "\u06e7\u06e2\u06e3"

    :goto_3
    invoke-static {v1}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto/16 :goto_0

    :sswitch_6
    sput-object v5, Lgn;->f:Ljava/lang/ref/WeakReference;

    sget v1, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v4, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    xor-int/2addr v1, v4

    const v4, 0x1aaaa3

    add-int/2addr v1, v4

    move v4, v1

    goto/16 :goto_0

    :sswitch_7
    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->۟ۡۥ۟ۨ()I

    move-result v1

    if-ltz v1, :cond_7

    sget v1, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    if-ltz v1, :cond_6

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->۟۠ۡۢۦ()I

    const-string v1, "\u06df\u06e1\u06df"

    goto :goto_3

    :cond_6
    sget v1, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v4, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    div-int/2addr v1, v4

    const v4, 0x1ac9e1

    xor-int/2addr v1, v4

    move v4, v1

    goto/16 :goto_0

    :cond_7
    :sswitch_8
    sget v1, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    if-ltz v1, :cond_8

    invoke-static {}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۠۠ۧ۟()I

    const-string v1, "\u06e1\u06e2\u06e0"

    invoke-static {v1}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto/16 :goto_0

    :cond_8
    sget v1, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v4, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    mul-int/2addr v1, v4

    const v4, -0x1f96f6

    xor-int/2addr v1, v4

    move v4, v1

    goto/16 :goto_0

    :sswitch_9
    const-string v1, "ANPNWd5DOQ==\n"

    const-string v4, "PKCoLfN8By8=\n"

    invoke-static {v1, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    sget v1, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v4, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    div-int/lit16 v4, v4, 0x8cc

    sub-int/2addr v1, v4

    if-gtz v1, :cond_9

    const/16 v1, 0x5a

    sput v1, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    const-string v4, "\u06e1\u06e4\u06df"

    move-object v1, v3

    :goto_4
    invoke-static {v4}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v4

    move-object v3, v1

    goto/16 :goto_0

    :cond_9
    sget v1, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v4, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sub-int/2addr v1, v4

    const v4, -0x1ac7d9

    xor-int/2addr v1, v4

    move v4, v1

    goto/16 :goto_0

    :sswitch_a
    const-string v0, "JBsG"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۧۨۧ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    invoke-static {}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۢ۟ۡۧ()I

    move-result v1

    if-ltz v1, :cond_0

    :cond_a
    const-string v1, "\u06e7\u06e5\u06e8"

    invoke-static {v1}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto/16 :goto_0

    :sswitch_b
    sget-object v1, Lgn;->a:Lgn;

    sget v3, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v4, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    rem-int/lit16 v4, v4, 0x959

    mul-int/2addr v3, v4

    if-ltz v3, :cond_b

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۣ۟ۡۧ۠()I

    const-string v3, "\u06e7\u06e2\u06e3"

    invoke-static {v3}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v4

    move-object v3, v1

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06df\u06e1\u06df"

    move-object v4, v3

    goto :goto_4

    :sswitch_c
    sget v1, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    if-ltz v1, :cond_c

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۣۡۧۢ()I

    const-string v1, "\u06e6\u06e7\u06df"

    invoke-static {v1}, L۠ۡۢۨ;->۟ۡۧۡۥ(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto/16 :goto_0

    :cond_c
    sget v1, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v4, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sub-int/2addr v1, v4

    const v4, 0x1abd86

    add-int/2addr v1, v4

    move v4, v1

    goto/16 :goto_0

    :sswitch_d
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa73d -> :sswitch_0
        0x1aa817 -> :sswitch_4
        0x1aaee5 -> :sswitch_6
        0x1aaf1c -> :sswitch_b
        0x1aaf9c -> :sswitch_c
        0x1ab26a -> :sswitch_1
        0x1abe24 -> :sswitch_2
        0x1abe62 -> :sswitch_5
        0x1abe82 -> :sswitch_8
        0x1ac222 -> :sswitch_9
        0x1ac50e -> :sswitch_3
        0x1ac568 -> :sswitch_d
        0x1ac5ca -> :sswitch_7
        0x1ac9e0 -> :sswitch_a
    .end sparse-switch
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "\u06e4\u06e5\u06e0"

    invoke-static {v0}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    if-gtz v0, :cond_0

    invoke-static {}, Landroid/view/ۢۥۢۦ;->ۤۦۢ۟()I

    const-string v0, "\u06e7\u06e1\u06e3"

    invoke-static {v0}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v1, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    div-int/2addr v0, v1

    const v1, 0x1aba7f

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_1
    const-string v0, "mcKkFT2mD30=\n"

    const-string v1, "9rfQRknHexg=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "\u06e3\u06e4\u06e5"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_2
    const-string v0, "1Pxy\n"

    const-string v1, "tZ8GfTARZZA=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۣۨ()I

    move-result v0

    if-gtz v0, :cond_1

    :cond_1
    const-string v0, "\u06e0\u06e4\u06e0"

    invoke-static {v0}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa7fd -> :sswitch_0
        0x1aab5c -> :sswitch_1
        0x1ab6a4 -> :sswitch_3
        0x1aba7f -> :sswitch_2
    .end sparse-switch
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 2

    const-string v0, "\u06e2\u06e6\u06e0"

    invoke-static {v0}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v1, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    or-int/2addr v0, v1

    const v1, -0x1ab31e

    xor-int/2addr v0, v1

    goto :goto_0

    :sswitch_1
    const-string v0, "TLc/\n"

    const-string v1, "LdRLKVTmox4=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v1, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    div-int/lit16 v1, v1, 0x130b

    mul-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/16 v0, 0x5f

    sput v0, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    const-string v0, "\u06df\u06e0\u06e4"

    invoke-static {v0}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v1, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    add-int/2addr v0, v1

    const v1, 0x1acf90

    xor-int/2addr v0, v1

    goto :goto_0

    :sswitch_2
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa723 -> :sswitch_0
        0x1ab31c -> :sswitch_1
        0x1ac92c -> :sswitch_2
    .end sparse-switch
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 2

    const-string v0, "\u06e5\u06e1\u06e3"

    invoke-static {v0}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۣ۟ۧۤۡ()I

    move-result v0

    if-ltz v0, :cond_1

    const/16 v0, 0x26

    sput v0, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    const-string v0, "\u06df\u06e3\u06e0"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۣ۠ۧۢ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    const-string v0, "mrq2\n"

    const-string v1, "+9nCnYbx/f0=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v1, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    div-int/lit16 v1, v1, 0x25f2

    add-int/2addr v0, v1

    if-ltz v0, :cond_0

    const/16 v0, 0x3c

    sput v0, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    const-string v0, "\u06e5\u06e1\u06e3"

    invoke-static {v0}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e7\u06e3\u06e2"

    invoke-static {v0}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e5\u06e1\u06e3"

    goto :goto_1

    :sswitch_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aab9f -> :sswitch_0
        0x1abdc7 -> :sswitch_1
        0x1ac586 -> :sswitch_2
    .end sparse-switch
.end method
