.class public final Lcom/ljx/wechatmod/core/GeekConfig$registerUpdateReceiver$receiver$1;
.super Landroid/content/BroadcastReceiver;


# static fields
.field public static final a:I


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e6\u06e7\u06e1"

    invoke-static {v1}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "Q33T"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣ۟ۧ۠۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget v1, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v2, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    add-int/lit16 v2, v2, 0x1c7a

    add-int/2addr v1, v2

    if-gtz v1, :cond_0

    invoke-static {}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۤ۟۠ۢ()I

    const-string v1, "\u06e6\u06e7\u06e1"

    invoke-static {v1}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :sswitch_1
    invoke-static {}, Landroidx/activity/ۣۢۦۨ;->۟ۦۣ۠ۢ()I

    move-result v0

    if-gtz v0, :cond_3

    sget v0, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v2, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    mul-int/2addr v0, v2

    const v2, -0x129fb7

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :cond_0
    sget v1, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v2, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    add-int/2addr v1, v2

    const v2, 0x1ac685

    add-int/2addr v2, v1

    move-object v1, v0

    goto :goto_0

    :sswitch_2
    sget v0, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v2, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    add-int/lit16 v2, v2, 0x9a

    xor-int/2addr v0, v2

    if-gtz v0, :cond_1

    invoke-static {}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۨۧ۟ۤ()I

    const-string v0, "\u06e2\u06e4\u06e6"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    sget v0, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v2, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    mul-int/2addr v0, v2

    const v2, 0x1b70b9    # 2.519996E-39f

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_3
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    if-ltz v0, :cond_2

    const-string v0, "\u06e0\u06e0\u06e7"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e0\u06e0\u06e7"

    goto :goto_1

    :cond_3
    :sswitch_4
    const-string v0, "\u06e0\u06e0\u06e7"

    invoke-static {v0}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa79b -> :sswitch_0
        0x1aaae7 -> :sswitch_5
        0x1ac240 -> :sswitch_1
        0x1ac988 -> :sswitch_3
        0x1ac9a8 -> :sswitch_2
        0x1ac9e4 -> :sswitch_4
    .end sparse-switch
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    const-string v0, "\u06e5\u06e1\u06e0"

    invoke-static {v0}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06e0\u06e1\u06e1"

    :goto_1
    invoke-static {v0}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    :try_start_0
    sget-object v0, Lly;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget v0, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    if-gtz v0, :cond_0

    const-string v0, "\u06e0\u06e1\u06e1"

    invoke-static {v0}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e7\u06e8\u06e2"

    goto :goto_1

    :sswitch_2
    sget v0, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    if-ltz v0, :cond_1

    const/16 v0, 0x1f

    sput v0, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    const-string v0, "\u06df\u06e2\u06e1"

    invoke-static {v0}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    sget v0, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v1, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    xor-int/2addr v0, v1

    const v1, -0x1ac12f

    xor-int/2addr v0, v1

    goto :goto_0

    :sswitch_3
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lgn;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lgn;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_2
    const-string v0, "\u06e0\u06e1\u06e7"

    invoke-static {v0}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_4
    sget v0, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    sget v1, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    div-int/lit16 v1, v1, 0x13fd

    mul-int/2addr v0, v1

    if-eqz v0, :cond_3

    :cond_2
    const-string v0, "\u06e0\u06e7\u06e3"

    invoke-static {v0}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_3
    sget v0, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sget v1, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    div-int/2addr v0, v1

    const v1, 0x1ac8ca

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_5
    const/4 v0, -0x1

    :try_start_1
    sput v0, Lly;->d:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sget v0, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    sget v1, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    add-int/2addr v0, v1

    const v1, 0x1ab210

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_6
    const/high16 v0, -0x40800000    # -1.0f

    :try_start_2
    sput v0, Lly;->f:F
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    sget v0, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v1, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sub-int/2addr v0, v1

    const v1, -0x1abda6

    xor-int/2addr v0, v1

    goto/16 :goto_0

    :sswitch_7
    :try_start_3
    sget-object v0, Lly;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-static {}, Landroidx/activity/۟ۥۥۧ۠;->۟ۥۥۤ۟()I

    move-result v0

    if-ltz v0, :cond_2

    invoke-static {}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۣۣ۟ۥ۟()I

    const-string v0, "\u06df\u06e6\u06df"

    invoke-static {v0}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :sswitch_8
    sget v0, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    if-gtz v0, :cond_4

    const/16 v0, 0x12

    sput v0, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    const-string v0, "\u06e0\u06e8\u06e6"

    goto/16 :goto_1

    :cond_4
    sget v0, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v1, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    rem-int/2addr v0, v1

    const v1, 0x1abe84

    add-int/2addr v0, v1

    goto/16 :goto_0

    :sswitch_9
    :try_start_4
    sget-object v0, Lly;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    sget v0, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v1, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    add-int/lit16 v1, v1, 0x1302

    rem-int/2addr v0, v1

    if-gtz v0, :cond_5

    const/16 v0, 0x63

    sput v0, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    goto :goto_2

    :cond_5
    sget v0, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v1, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    or-int/2addr v0, v1

    const v1, -0x1abe12

    xor-int/2addr v0, v1

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۡۥۥۦ()I

    move-result v0

    if-ltz v0, :cond_6

    invoke-static {}, Landroidx/core/app/ۡۤۡ۠;->ۨۥۨۧ()I

    const-string v0, "\u06e2\u06df\u06e4"

    invoke-static {v0}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_6
    const-string v0, "\u06e7\u06e8\u06e2"

    goto/16 :goto_1

    :sswitch_b
    invoke-static {}, Ljc;->a()V

    sget v0, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v1, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    xor-int/lit16 v1, v1, -0x95d

    or-int/2addr v0, v1

    if-ltz v0, :cond_7

    invoke-static {}, Landroid/window/ۣۤ۠ۢ;->ۧۢۦ۟()I

    const-string v0, "\u06e5\u06e3\u06e2"

    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_7
    const-string v0, "\u06e6\u06e1\u06e0"

    invoke-static {v0}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    const-string v0, "06ke\n"

    const-string v1, "p8h5VTpLcuY=\n"

    const-string v2, "zcuXKO+xq3njya0T3rezfunXuizDtQ==\n"

    const-string v3, "iq7yQ6zexR8=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "tw==\n"

    const-string v4, "0vI8ySRxU5w=\n"

    invoke-static {v0, v1, v2, v3, v4}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget v0, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v1, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    mul-int/lit16 v1, v1, 0xcdb

    div-int/2addr v0, v1

    if-eqz v0, :cond_8

    const-string v0, "\u06e7\u06e8\u06e2"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_8
    const-string v0, "\u06df\u06e6\u06df"

    goto/16 :goto_1

    :sswitch_c
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa7d8 -> :sswitch_0
        0x1aab00 -> :sswitch_3
        0x1aab06 -> :sswitch_c
        0x1aab42 -> :sswitch_6
        0x1aabbc -> :sswitch_1
        0x1aaf99 -> :sswitch_2
        0x1ab324 -> :sswitch_8
        0x1abdc4 -> :sswitch_b
        0x1abe04 -> :sswitch_7
        0x1abe27 -> :sswitch_9
        0x1ac185 -> :sswitch_5
        0x1ac526 -> :sswitch_a
        0x1ac621 -> :sswitch_4
        0x1ac8ca -> :sswitch_0
    .end sparse-switch
.end method
