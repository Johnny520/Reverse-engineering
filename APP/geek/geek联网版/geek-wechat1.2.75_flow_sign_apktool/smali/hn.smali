.class public final Lhn;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# virtual methods
.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "\u06e1\u06e4\u06e0"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "I/X/\n"

    const-string v1, "QpaLzcS1lRI=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v1, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    xor-int/2addr v0, v1

    const v1, 0x1ac432

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_1
    sget v0, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sget v1, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    mul-int/lit16 v1, v1, 0xe46

    rem-int/2addr v0, v1

    if-gtz v0, :cond_0

    invoke-static {}, Landroidx/activity/result/۟۠۟۠ۦ;->۟ۢۡ۠()I

    const-string v0, "\u06e3\u06e5\u06e0"

    :goto_1
    invoke-static {v0}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e1\u06e4\u06e0"

    goto :goto_1

    :sswitch_2
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aaf1d -> :sswitch_0
        0x1aba47 -> :sswitch_1
        0x1ac586 -> :sswitch_2
    .end sparse-switch
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 2

    const-string v0, "\u06df\u06e3\u06e1"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "vi4o\n"

    const-string v1, "301cFZZ89FU=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v1, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    div-int/lit16 v1, v1, -0x8ec

    xor-int/2addr v0, v1

    if-ltz v0, :cond_0

    const/16 v0, 0x11

    sput v0, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    const-string v0, "\u06e5\u06e3\u06e1"

    invoke-static {v0}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v1, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    xor-int/2addr v0, v1

    const v1, 0x1abe5c

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_1
    sget v0, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v1, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    add-int/lit16 v1, v1, -0x1ffd

    xor-int/2addr v0, v1

    if-gtz v0, :cond_1

    invoke-static {}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣۤۧۥ()I

    const-string v0, "\u06e0\u06e6\u06e4"

    :goto_1
    invoke-static {v0}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06df\u06e3\u06e1"

    goto :goto_1

    :sswitch_2
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa77d -> :sswitch_0
        0x1abe03 -> :sswitch_1
        0x1abea3 -> :sswitch_2
    .end sparse-switch
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 2

    const-string v0, "\u06df\u06e2\u06e0"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "vEhe\n"

    const-string v1, "3SsqG2nUei8=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    if-gtz v0, :cond_1

    const/16 v0, 0xd

    sput v0, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    const-string v0, "\u06df\u06e2\u06e0"

    invoke-static {v0}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    sget v0, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    if-ltz v0, :cond_0

    invoke-static {}, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢ۠ۨۦ()I

    const-string v0, "\u06e6\u06e4\u06e3"

    invoke-static {v0}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06df\u06e2\u06e0"

    invoke-static {v0}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    sget v0, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    sget v1, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    xor-int/2addr v0, v1

    const v1, 0x1ac304

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_2
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa75d -> :sswitch_0
        0x1aabbd -> :sswitch_1
        0x1ac5e8 -> :sswitch_2
    .end sparse-switch
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 7

    const/4 v2, 0x0

    const-wide/16 v4, 0x0

    const-string v0, "\u06e7\u06e0\u06e2"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v6

    move-object v0, v2

    move-object v3, v2

    move-object v1, v2

    :goto_0
    sparse-switch v6, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v4, v5}, Ljava/io/PrintStream;->println(D)V

    invoke-static {}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۦۢۧۧ()I

    move-result v2

    if-gtz v2, :cond_4

    const/16 v2, 0x14

    sput v2, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    const-string v2, "\u06e7\u06e0\u06e2"

    :goto_1
    invoke-static {v2}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto :goto_0

    :sswitch_1
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const-string v2, "\u06e0\u06e0\u06e1"

    :goto_2
    invoke-static {v2}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto :goto_0

    :sswitch_2
    const-string v2, "hNJq\n"

    const-string v6, "5bEeuaA/3gc=\n"

    invoke-static {v2, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "\u06e3\u06e8\u06e1"

    invoke-static {v2}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto :goto_0

    :sswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    sget v3, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v6, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    add-int/lit16 v6, v6, -0x26f6

    xor-int/2addr v3, v6

    if-ltz v3, :cond_0

    const-string v3, "\u06e0\u06e1\u06e6"

    invoke-static {v3}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v6

    move-object v3, v2

    goto :goto_0

    :cond_0
    sget v3, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    sget v6, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    div-int/2addr v3, v6

    const v6, 0x1aba49

    add-int/2addr v6, v3

    move-object v3, v2

    goto :goto_0

    :sswitch_4
    sput-object v3, Lkn;->e:Ljava/lang/String;

    const-string v2, "\u06e1\u06e6\u06e0"

    goto :goto_1

    :sswitch_5
    invoke-static {}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۦۢۢۢ()I

    move-result v2

    if-gtz v2, :cond_1

    const-string v2, "\u06e1\u06e7\u06e5"

    goto :goto_1

    :cond_1
    :sswitch_6
    sget v2, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v6, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    add-int/lit16 v6, v6, -0xb88

    add-int/2addr v2, v6

    if-ltz v2, :cond_2

    const-string v2, "\u06e7\u06e1\u06e5"

    invoke-static {v2}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto :goto_0

    :cond_2
    sget v2, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v6, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    rem-int/2addr v2, v6

    const v6, -0x1abcbd

    xor-int/2addr v2, v6

    move v6, v2

    goto/16 :goto_0

    :sswitch_7
    const-string v2, "evIVzhURi1hQRddLv5YspVye"

    invoke-static {v2}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۢ۠ۥۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v4

    invoke-static {}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۠۟ۥۧ()I

    move-result v2

    if-ltz v2, :cond_3

    const-string v2, "\u06df\u06e8\u06e2"

    :goto_3
    invoke-static {v2}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_3
    const-string v2, "\u06df\u06e1\u06e4"

    goto/16 :goto_2

    :sswitch_8
    const-string v2, "mejd3rtDEA==\n"

    const-string v6, "pZu4qpZ8Lro=\n"

    invoke-static {v2, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    sget v2, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v6, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    mul-int/2addr v2, v6

    const v6, 0x14be84

    add-int/2addr v2, v6

    move v6, v2

    goto/16 :goto_0

    :cond_4
    const-string v2, "\u06e5\u06e0\u06e3"

    invoke-static {v2}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :sswitch_9
    sput-object v1, Lkn;->f:Ljava/lang/ref/WeakReference;

    sget v2, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v6, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    rem-int/lit16 v6, v6, 0x1e00

    div-int/2addr v2, v6

    if-eqz v2, :cond_5

    invoke-static {}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣۤۧۥ()I

    const-string v2, "\u06e2\u06e2\u06e1"

    invoke-static {v2}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_5
    sget v2, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v6, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    mul-int/2addr v2, v6

    const v6, 0x1a6200

    add-int/2addr v2, v6

    move v6, v2

    goto/16 :goto_0

    :sswitch_a
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v2, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    if-gtz v2, :cond_6

    const-string v2, "\u06e4\u06e6\u06e6"

    invoke-static {v2}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠ۡۤ(Ljava/lang/Object;)I

    move-result v2

    move v6, v2

    goto/16 :goto_0

    :cond_6
    const-string v2, "\u06e4\u06e6\u06e6"

    goto :goto_3

    :sswitch_b
    sget v2, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    if-gtz v2, :cond_7

    const-string v2, "\u06e6\u06e6\u06e5"

    goto/16 :goto_2

    :cond_7
    sget v2, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sget v6, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    xor-int/2addr v2, v6

    const v6, 0x1ac772

    add-int/2addr v2, v6

    move v6, v2

    goto/16 :goto_0

    :sswitch_c
    sget-object v0, Lkn;->a:Lkn;

    const-string v2, "\u06e2\u06e2\u06e1"

    goto/16 :goto_2

    :sswitch_d
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa742 -> :sswitch_0
        0x1aa819 -> :sswitch_b
        0x1aaae1 -> :sswitch_a
        0x1aab05 -> :sswitch_3
        0x1aaee3 -> :sswitch_6
        0x1aaf5b -> :sswitch_5
        0x1aaf7f -> :sswitch_7
        0x1ab2a1 -> :sswitch_1
        0x1ab71c -> :sswitch_c
        0x1aba48 -> :sswitch_8
        0x1abaa4 -> :sswitch_9
        0x1abda8 -> :sswitch_d
        0x1abe80 -> :sswitch_4
        0x1ac529 -> :sswitch_2
    .end sparse-switch
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 3

    const/4 v0, 0x0

    const-string v1, "\u06df\u06e3"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "pcAr\n"

    const-string v2, "xKNfZbLYgIQ=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->۟ۢ۟ۥۣ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "\u06e2\u06e4\u06e0"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_1
    invoke-static {}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۠۟ۥۧ()I

    move-result v0

    if-ltz v0, :cond_3

    invoke-static {}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۣۣ۟ۥ۟()I

    move-result v0

    if-gtz v0, :cond_1

    const/16 v0, 0xc

    sput v0, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    :cond_0
    const-string v0, "\u06e1\u06e2\u06e7"

    invoke-static {v0}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    sget v0, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v2, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    mul-int/2addr v0, v2

    const v2, -0x79c0f

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_2
    const-string v0, "eSD2VZ15QSyFSjhr81MHVP"

    invoke-static {v0}, Lkotlinx/coroutines/ۤۢۢۥ;->ۣۨۡۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget v1, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v2, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    rem-int/2addr v1, v2

    const v2, 0x1ac909

    add-int/2addr v2, v1

    move-object v1, v0

    goto :goto_0

    :sswitch_3
    const-string v0, "92GyoJT1Ha8=\n"

    const-string v2, "mBTG8+CUaco=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_2
    const-string v0, "\u06e6\u06df\u06e6"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_3
    :sswitch_4
    invoke-static {}, Landroid/window/۟ۤ۟ۡۧ;->ۢۦۣۨ()I

    move-result v0

    if-gtz v0, :cond_4

    const-string v0, "\u06e8\u06e7\u06e2"

    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_4
    sget v0, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sget v2, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    mul-int/2addr v0, v2

    const v2, 0x199066

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_5
    invoke-static {}, Lkotlinx/coroutines/ۤۢۢۥ;->ۡ۠ۥۡ()I

    move-result v0

    if-ltz v0, :cond_5

    const/16 v0, 0x44

    sput v0, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    const-string v0, "\u06e2\u06e6\u06e0"

    :goto_2
    invoke-static {v0}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06df\u06e3"

    goto :goto_2

    :sswitch_6
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۧۡۥۦ()I

    move-result v0

    if-gez v0, :cond_2

    const-string v0, "\u06e8\u06df\u06e0"

    goto :goto_1

    :sswitch_7
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdbe4 -> :sswitch_0
        0xdc08 -> :sswitch_2
        0x1aab63 -> :sswitch_5
        0x1aaee6 -> :sswitch_3
        0x1ab2de -> :sswitch_4
        0x1ac14d -> :sswitch_1
        0x1ac8c9 -> :sswitch_7
        0x1ac90a -> :sswitch_6
    .end sparse-switch
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 2

    const-string v0, "\u06e4\u06e4\u06e5"

    invoke-static {v0}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "rbWt\n"

    const-string v1, "zNbZpY2oCMw=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "\u06e6\u06e2\u06e2"

    :goto_1
    invoke-static {v0}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    sget v0, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v1, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    xor-int/lit16 v1, v1, -0x390

    add-int/2addr v0, v1

    if-gtz v0, :cond_0

    const/16 v0, 0x36

    sput v0, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    const-string v0, "\u06e1\u06e2\u06e7"

    goto :goto_1

    :cond_0
    sget v0, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v1, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    add-int/2addr v0, v1

    const v1, 0x1abeac

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aba65 -> :sswitch_0
        0x1ac1a6 -> :sswitch_2
        0x1ac206 -> :sswitch_1
    .end sparse-switch
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 3

    const/4 v0, 0x0

    const-string v1, "\u06e5\u06e0\u06e0"

    invoke-static {v1}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    sget v1, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v2, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sub-int/2addr v1, v2

    const v2, 0x1ab06e

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_1
    sget v1, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v2, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    add-int/lit16 v2, v2, 0xc10

    div-int/2addr v1, v2

    if-eqz v1, :cond_1

    const/16 v1, 0x3e

    sput v1, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    const-string v1, "\u06e8\u06e4\u06e7"

    invoke-static {v1}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    sget v1, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v2, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sub-int/2addr v1, v2

    const v2, 0x1abfc3

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_2
    const-string v0, "xWkyCoU32xDk"

    invoke-static {v0}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->ۣۣ۟ۧۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    invoke-static {}, Landroidx/core/app/ۡۤۡ۠;->ۨۥۨۧ()I

    move-result v1

    if-ltz v1, :cond_2

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۧۡۥۦ()I

    const-string v1, "\u06df\u06e5\u06e1"

    :goto_1
    invoke-static {v1}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    sget v1, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v2, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    mul-int/2addr v1, v2

    const v2, 0x1a552b

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_3
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v1, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v2, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    or-int/lit16 v2, v2, 0x2017

    rem-int/2addr v1, v2

    if-ltz v1, :cond_3

    invoke-static {}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۡۢۨۥ()I

    const-string v1, "\u06e2\u06e0\u06e3"

    invoke-static {v1}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_3
    const-string v1, "\u06e2\u06e0\u06e3"

    goto :goto_1

    :sswitch_4
    const-string v1, "vSL2\n"

    const-string v2, "3EGCxKw0OyY=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟۠ۢۢ۠()I

    move-result v1

    if-ltz v1, :cond_5

    invoke-static {}, Lۤۤۥۤ;->۟ۤ۠()I

    :cond_4
    const-string v1, "\u06e2\u06e8\u06e3"

    invoke-static {v1}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_5
    sget v1, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v2, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    rem-int/2addr v1, v2

    const v2, 0x1ab978

    add-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_5
    invoke-static {}, Landroidx/activity/result/۟ۡۤۦۡ;->۟۟۟ۥۤ()I

    move-result v1

    if-gtz v1, :cond_0

    sget v1, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v2, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    div-int/lit16 v2, v2, -0xb1

    add-int/2addr v1, v2

    if-gtz v1, :cond_4

    invoke-static {}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۧۡۥ۟()I

    const-string v1, "\u06e4\u06e3\u06e0"

    invoke-static {v1}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_6
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa7bb -> :sswitch_0
        0x1aaee3 -> :sswitch_3
        0x1ab265 -> :sswitch_6
        0x1ab35d -> :sswitch_2
        0x1aba41 -> :sswitch_5
        0x1abaa1 -> :sswitch_1
        0x1abda5 -> :sswitch_4
    .end sparse-switch
.end method
