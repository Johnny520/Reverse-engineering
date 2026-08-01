.class public final Lcom/ljx/wechatmod/core/GeekConfig$registerUpdateReceiver$receiver$1;
.super Landroid/content/BroadcastReceiver;


# static fields
.field public static final a:I


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    const-wide/16 v0, 0x0

    const-string v2, "\u06e3\u06e5\u06df"

    invoke-static {v2}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v2

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    const-string v0, "Taydzr9kGhJ"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۨ۟۟ۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-static {}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->ۤۦۧۥ()I

    move-result v2

    if-ltz v2, :cond_0

    const-string v2, "\u06e3\u06e5\u06df"

    invoke-static {v2}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :sswitch_2
    invoke-static {}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟ۤۦۡ()I

    move-result v2

    if-ltz v2, :cond_2

    sget v2, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v3, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    add-int/lit16 v3, v3, 0xa95

    xor-int/2addr v2, v3

    if-ltz v2, :cond_1

    invoke-static {}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۢۧۥۧ()I

    :cond_0
    const-string v2, "\u06e2\u06e7\u06e4"

    invoke-static {v2}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :cond_1
    const-string v2, "\u06e5\u06e1\u06e7"

    invoke-static {v2}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :sswitch_3
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(D)V

    const-string v2, "\u06df\u06e1\u06e2"

    invoke-static {v2}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :sswitch_4
    const-string v2, "\u06e3\u06e5\u06df"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :cond_2
    :sswitch_5
    sget v2, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    if-gtz v2, :cond_3

    const/16 v2, 0x5d

    sput v2, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    const-string v2, "\u06e2\u06e0\u06e3"

    invoke-static {v2}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :cond_3
    sget v2, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v3, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    rem-int/2addr v2, v3

    const v3, -0x1aa7e8

    xor-int/2addr v2, v3

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa740 -> :sswitch_0
        0x1aae87 -> :sswitch_5
        0x1ab33f -> :sswitch_3
        0x1ab6bd -> :sswitch_2
        0x1abdcb -> :sswitch_1
        0x1abe81 -> :sswitch_4
    .end sparse-switch
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    const/4 v1, 0x0

    const-string v0, "\u06e0\u06e4"

    invoke-static {v0}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۢ۟ۡۧ()I

    move-result v0

    if-ltz v0, :cond_d

    sget v0, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    add-int/lit16 v2, v2, -0x1ff

    rem-int/2addr v0, v2

    if-gtz v0, :cond_6

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟ۢۡ۟۟()I

    const-string v0, "\u06e7\u06e7\u06e2"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    const/high16 v0, -0x40800000    # -1.0f

    :try_start_0
    sput v0, Ldy;->f:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget v0, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v2, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    mul-int/lit16 v2, v2, 0xdfd

    rem-int/2addr v0, v2

    if-ltz v0, :cond_0

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->۟ۡۥۥۣ()I

    const-string v0, "\u06df\u06e1\u06e6"

    invoke-static {v0}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v2, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    div-int/2addr v0, v2

    const v2, -0x1aaef9

    xor-int/2addr v0, v2

    goto :goto_0

    :sswitch_2
    sget v0, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v2, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    div-int/lit16 v2, v2, 0x5ec

    mul-int/2addr v0, v2

    if-eqz v0, :cond_1

    const-string v0, "\u06e7\u06df\u06e7"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e7\u06e7\u06e2"

    invoke-static {v0}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_3
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v2, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    add-int/lit16 v2, v2, 0x1970

    mul-int/2addr v0, v2

    if-gtz v0, :cond_2

    const-string v0, "\u06e0\u06e4"

    :goto_2
    invoke-static {v0}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e6\u06e1\u06e8"

    goto :goto_2

    :sswitch_4
    :try_start_1
    sget-object v0, Ldy;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sget v0, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v2, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    div-int/lit16 v2, v2, 0xb30

    xor-int/2addr v0, v2

    if-ltz v0, :cond_4

    :cond_3
    const-string v0, "\u06e0\u06e3\u06e0"

    invoke-static {v0}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_4
    sget v0, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    div-int/2addr v0, v2

    const v2, 0xdc1c

    xor-int/2addr v0, v2

    goto/16 :goto_0

    :sswitch_5
    :try_start_2
    sget-object v0, Ldy;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    sget v0, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v2, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    xor-int/2addr v0, v2

    const v2, 0x1aa473

    add-int/2addr v0, v2

    goto/16 :goto_0

    :sswitch_6
    :try_start_3
    sget-object v0, Ldy;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-static {}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۠۠ۧ۟()I

    move-result v0

    if-gtz v0, :cond_3

    const-string v0, "\u06df\u06e1\u06df"

    invoke-static {v0}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :sswitch_7
    invoke-static {}, Landroidx/fragment/app/۟ۧۡۦ;->ۧۤۨ۟()I

    move-result v0

    if-gtz v0, :cond_5

    invoke-static {}, L۟ۡۦۧۤ;->۟۟۠ۡۢ()I

    const-string v0, "\u06e6\u06df\u06e0"

    invoke-static {v0}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06e0\u06e4"

    invoke-static {v0}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_6
    const-string v0, "\u06e4\u06e1\u06e5"

    goto/16 :goto_1

    :sswitch_8
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v2, Lod;

    sget v3, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    xor-int/lit16 v3, v3, 0x92

    invoke-direct {v2, v3}, Lod;-><init>(I)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    sget v0, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v2, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    xor-int/lit16 v2, v2, -0xc6d

    xor-int/2addr v0, v2

    if-ltz v0, :cond_8

    invoke-static {}, Landroidx/core/content/ۣ۟ۧ۠;->۟۟۠ۢۨ()I

    :cond_7
    const-string v0, "\u06e8\u06e3\u06df"

    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_8
    sget v0, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v2, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    rem-int/2addr v0, v2

    const v2, 0xd9cb

    add-int/2addr v0, v2

    goto/16 :goto_0

    :sswitch_9
    sget v0, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v2, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    mul-int/lit16 v2, v2, -0x2600

    div-int/2addr v0, v2

    if-eqz v0, :cond_9

    const-string v0, "\u06e1\u06e1\u06e8"

    :goto_3
    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_9
    const-string v0, "\u06df\u06e1\u06df"

    :goto_4
    invoke-static {v0}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :sswitch_a
    sget v0, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sget v2, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    div-int/lit16 v2, v2, 0x50c

    sub-int/2addr v0, v2

    if-gtz v0, :cond_a

    invoke-static {}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۟ۤۥۧۤ()I

    const-string v0, "\u06e1\u06e0\u06e7"

    goto :goto_4

    :cond_a
    const-string v0, "\u06e8\u06e3\u06df"

    invoke-static {v0}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :sswitch_b
    sget v0, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v2, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    or-int/2addr v0, v2

    const v2, 0x1ac64a

    add-int/2addr v0, v2

    goto/16 :goto_0

    :sswitch_c
    const/4 v0, -0x1

    :try_start_4
    sput v0, Ldy;->d:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    sget v0, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v2, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    rem-int/lit16 v2, v2, 0x16a9

    add-int/2addr v0, v2

    if-ltz v0, :cond_b

    const-string v0, "\u06e8\u06e8\u06e7"

    :goto_5
    invoke-static {v0}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_b
    sget v0, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v2, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    or-int/2addr v0, v2

    const v2, -0x1ac50a

    xor-int/2addr v0, v2

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    const-string v0, "Nwje\n"

    const-string v2, "Q2m5jaPP2Zc=\n"

    const-string v3, "Mgo5b0ZBVgscCANUd0dODBYWFGtqRQ==\n"

    const-string v4, "dW9cBAUuOG0=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "Fg==\n"

    const-string v5, "c8HJlSTQVfc=\n"

    invoke-static {v0, v2, v3, v4, v5}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟ۥۧۦۥ()I

    move-result v0

    if-gtz v0, :cond_c

    const-string v0, "\u06e4\u06e1\u06e5"

    invoke-static {v0}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_c
    const-string v0, "\u06e7\u06df\u06e7"

    goto :goto_5

    :sswitch_d
    const-string v0, "dXHJcDbU3DvcNhkPE"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۦۦۣۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    sget v0, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v2, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    div-int/2addr v0, v2

    const v2, 0x1ac909

    add-int/2addr v0, v2

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Lac;->a()V

    sget v0, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v2, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    add-int/lit16 v2, v2, -0x1926

    or-int/2addr v0, v2

    if-ltz v0, :cond_7

    const/16 v0, 0x3a

    sput v0, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    const-string v0, "\u06e6\u06e1\u06e8"

    invoke-static {v0}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_d
    :sswitch_f
    sget v0, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v2, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    xor-int/lit16 v2, v2, 0x1dec

    mul-int/2addr v0, v2

    if-ltz v0, :cond_e

    invoke-static {}, Landroidx/activity/ۣ۟۠ۤۢ;->۟۠۠ۤۥ()I

    const-string v0, "\u06e3\u06e2\u06df"

    invoke-static {v0}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_e
    const-string v0, "\u06e6\u06e1\u06e8"

    goto/16 :goto_3

    :sswitch_10
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdbe5 -> :sswitch_0
        0xdc04 -> :sswitch_e
        0xdc1f -> :sswitch_6
        0x1aa73d -> :sswitch_2
        0x1aa744 -> :sswitch_7
        0x1aa7a2 -> :sswitch_f
        0x1aa800 -> :sswitch_a
        0x1aab3d -> :sswitch_5
        0x1aaefd -> :sswitch_4
        0x1aba08 -> :sswitch_d
        0x1ac18d -> :sswitch_10
        0x1ac509 -> :sswitch_1
        0x1ac50f -> :sswitch_b
        0x1ac602 -> :sswitch_b
        0x1ac8c9 -> :sswitch_8
        0x1ac908 -> :sswitch_3
        0x1ac944 -> :sswitch_c
        0x1ac9e7 -> :sswitch_9
    .end sparse-switch
.end method
