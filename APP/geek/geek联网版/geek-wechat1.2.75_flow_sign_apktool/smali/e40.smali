.class public final Le40;
.super Lde/robv/android/xposed/XC_MethodHook;


# instance fields
.field public final a:Ljava/util/concurrent/ConcurrentHashMap;

.field public final b:Ljs;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/ConcurrentHashMap;Ljs;)V
    .locals 3

    iput-object p1, p0, Le40;->a:Ljava/util/concurrent/ConcurrentHashMap;

    iput-object p2, p0, Le40;->b:Ljs;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    const/4 v1, 0x0

    const-string v0, "\u06e2\u06e2\u06e6"

    invoke-static {v0}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v2, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    div-int/lit16 v2, v2, 0xe16

    xor-int/2addr v0, v2

    if-ltz v0, :cond_0

    const/16 v0, 0x4e

    sput v0, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    const-string v0, "\u06df\u06e0\u06e2"

    invoke-static {v0}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    const-string v0, "z2b4ybgFbSD6kY"

    invoke-static {v0}, Lio/fastkv/۟ۢ۟ۢۥ;->ۣ۟ۧۥۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v1

    sget v0, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v2, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    add-int/2addr v0, v2

    const v2, 0xdc76

    add-int/2addr v0, v2

    goto :goto_0

    :cond_0
    const-string v0, "\u06e0\u06e7\u06e8"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_2
    sget v0, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v2, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    rem-int/2addr v0, v2

    const v2, 0x1ab287

    xor-int/2addr v0, v2

    goto :goto_0

    :sswitch_3
    invoke-static {}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۠۟ۥۧ()I

    move-result v0

    if-ltz v0, :cond_1

    const-string v0, "\u06e6\u06e0\u06e8"

    invoke-static {v0}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    :sswitch_4
    invoke-static {}, Landroidx/legacy/content/ۧۡ۠۠;->ۥۧۡۦ()I

    move-result v0

    if-gtz v0, :cond_2

    const/16 v0, 0x47

    sput v0, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    const-string v0, "\u06e7\u06e0\u06e6"

    goto :goto_1

    :cond_2
    sget v0, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v2, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    div-int/2addr v0, v2

    const v2, 0x1aabc1

    add-int/2addr v0, v2

    goto :goto_0

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdcf7 -> :sswitch_0
        0x1aa721 -> :sswitch_4
        0x1aabc1 -> :sswitch_5
        0x1ab2a6 -> :sswitch_3
        0x1ab33b -> :sswitch_2
        0x1ac16e -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 4

    const/4 v1, 0x0

    const-string v0, "\u06e8\u06e8\u06e1"

    invoke-static {v0}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v3

    move-object v0, v1

    move-object v2, v1

    :goto_0
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    sget v1, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v3, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    or-int/lit16 v3, v3, -0x10b4

    div-int/2addr v1, v3

    if-eqz v1, :cond_6

    const-string v1, "\u06df\u06e2\u06e0"

    :goto_1
    invoke-static {v1}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :sswitch_1
    :try_start_0
    sget-object v1, Lub0;->a:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v1, "\u06e1\u06e6\u06e2"

    :goto_2
    invoke-static {v1}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :sswitch_2
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    sget v2, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    if-gtz v2, :cond_1

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۢ۠۟ۨ()I

    const-string v2, "\u06e0\u06e2\u06e5"

    invoke-static {v2}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v3

    move-object v2, v1

    goto :goto_0

    :cond_1
    const-string v2, "\u06e3\u06e6\u06e3"

    invoke-static {v2}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v3

    move-object v2, v1

    goto :goto_0

    :sswitch_3
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lkotlinx/coroutines/ۤۢۢۥ;->ۡ۠ۥۡ()I

    move-result v1

    if-ltz v1, :cond_2

    :goto_3
    const-string v1, "\u06e3\u06e4\u06e8"

    :goto_4
    invoke-static {v1}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :cond_2
    const-string v1, "\u06e8\u06df\u06e1"

    goto :goto_4

    :sswitch_4
    :try_start_1
    sget-object v1, Lub0;->o1:Ljava/lang/String;

    iget-object v3, p0, Le40;->b:Ljs;

    invoke-static {v2, v1, v3}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟۠ۢۨۦ()I

    move-result v1

    if-gtz v1, :cond_3

    invoke-static {}, Lkotlinx/coroutines/ۤۢۢۥ;->ۡ۠ۥۡ()I

    const-string v1, "\u06e8\u06e8\u06e1"

    invoke-static {v1}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :cond_3
    sget v1, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v3, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    mul-int/2addr v1, v3

    const v3, 0x234a75

    add-int/2addr v1, v3

    move v3, v1

    goto :goto_0

    :sswitch_5
    sget v1, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v3, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    div-int/lit16 v3, v3, 0x3ad

    xor-int/2addr v1, v3

    if-ltz v1, :cond_4

    const/16 v1, 0xb

    sput v1, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    const-string v1, "\u06e6\u06e5\u06e7"

    goto :goto_2

    :cond_4
    sget v1, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v3, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    div-int/2addr v1, v3

    const v3, -0x1ac9e1

    xor-int/2addr v1, v3

    move v3, v1

    goto/16 :goto_0

    :sswitch_6
    const-string v1, "CSw4vT4=\n"

    const-string v3, "eU1K3FMalOI=\n"

    invoke-static {v1, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣۣ۟ۡ()I

    move-result v1

    if-gtz v1, :cond_5

    const-string v1, "\u06e3\u06e6\u06e3"

    invoke-static {v1}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :cond_5
    const-string v1, "\u06e2\u06df\u06e8"

    goto/16 :goto_1

    :sswitch_7
    sget v1, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v3, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    add-int/2addr v1, v3

    const v3, 0x1ab6b6

    add-int/2addr v1, v3

    move v3, v1

    goto/16 :goto_0

    :cond_6
    const-string v1, "\u06e8\u06e2\u06e3"

    goto/16 :goto_2

    :catchall_0
    move-exception v1

    sget v1, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v3, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    mul-int/lit16 v3, v3, -0xc87

    xor-int/2addr v1, v3

    if-gtz v1, :cond_7

    const/4 v1, 0x2

    sput v1, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    const-string v1, "\u06e1\u06e6\u06e2"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :cond_7
    const-string v1, "\u06e1\u06e4\u06e8"

    invoke-static {v1}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :sswitch_8
    iget-object v1, p0, Le40;->a:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    goto/16 :goto_3

    :sswitch_9
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aab23 -> :sswitch_0
        0x1aaf25 -> :sswitch_0
        0x1aaf5d -> :sswitch_4
        0x1ab24b -> :sswitch_2
        0x1ab609 -> :sswitch_5
        0x1ab6a7 -> :sswitch_1
        0x1ab6e0 -> :sswitch_3
        0x1ababc -> :sswitch_7
        0x1ac8ca -> :sswitch_8
        0x1ac929 -> :sswitch_9
        0x1ac9e1 -> :sswitch_6
    .end sparse-switch
.end method
