.class public final Lx30;
.super Lde/robv/android/xposed/XC_MethodHook;


# instance fields
.field public final a:Ljava/util/concurrent/ConcurrentHashMap;

.field public final b:Lfs;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/ConcurrentHashMap;Lfs;)V
    .locals 3

    iput-object p1, p0, Lx30;->a:Ljava/util/concurrent/ConcurrentHashMap;

    iput-object p2, p0, Lx30;->b:Lfs;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06df\u06e2\u06e6"

    invoke-static {v1}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "tf81CQpXV68qsmP59"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧۥۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget v1, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v2, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    xor-int/lit16 v2, v2, -0xbc1

    mul-int/2addr v1, v2

    if-ltz v1, :cond_1

    const-string v1, "\u06e5\u06e0\u06e6"

    :goto_1
    invoke-static {v1}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣ۟ۦۥۥ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    :sswitch_1
    sget v1, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v2, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    or-int/2addr v1, v2

    const v2, 0x1abbb5

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_2
    invoke-static {}, Landroidx/core/widget/ۣۤۨۢ;->ۥۢۡۥ()I

    move-result v1

    if-ltz v1, :cond_0

    const-string v1, "\u06e7\u06e2"

    invoke-static {v1}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    const-string v1, "\u06e7\u06e8\u06e7"

    goto :goto_1

    :sswitch_3
    const-string v1, "\u06df\u06e2\u06e6"

    invoke-static {v1}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_4
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v1, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    if-ltz v1, :cond_2

    const-string v1, "\u06e0\u06e7\u06e7"

    invoke-static {v1}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    const-string v1, "\u06e5\u06e0\u06e6"

    goto :goto_1

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdcdb -> :sswitch_0
        0x1aa763 -> :sswitch_2
        0x1aaae6 -> :sswitch_1
        0x1aabc0 -> :sswitch_3
        0x1abdab -> :sswitch_5
        0x1ac626 -> :sswitch_4
    .end sparse-switch
.end method


# virtual methods
.method public final afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 5

    const/4 v0, 0x0

    const-string v1, "\u06e5\u06e1\u06e5"

    invoke-static {v1}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v2

    move-object v3, v0

    move-object v1, v0

    move v4, v2

    :goto_0
    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    sget v0, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v2, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    add-int/lit16 v2, v2, -0x9e4

    add-int/2addr v0, v2

    if-ltz v0, :cond_3

    const/16 v0, 0x24

    sput v0, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    const-string v0, "\u06df\u06e7\u06e5"

    :goto_1
    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, Lx30;->a:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    sget v0, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    if-ltz v0, :cond_1

    const-string v2, "\u06e1\u06e6\u06e4"

    move-object v0, v1

    :goto_2
    invoke-static {v2}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    move v4, v2

    goto :goto_0

    :cond_1
    const-string v0, "\u06e6\u06e1\u06e2"

    :goto_3
    invoke-static {v0}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :sswitch_2
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    sget v0, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v3, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    rem-int/lit16 v3, v3, 0x21b9

    div-int/2addr v0, v3

    if-eqz v0, :cond_2

    invoke-static {}, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۢۧ()I

    const-string v0, "\u06e6\u06e1\u06e2"

    :goto_4
    invoke-static {v0}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v0

    move-object v3, v2

    move v4, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e1\u06df\u06e6"

    goto :goto_4

    :sswitch_3
    const-string v0, "QM+8FDM=\n"

    const-string v2, "MK7OdV709a4=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v2, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    div-int/2addr v0, v2

    const v2, 0x1abd87

    add-int/2addr v0, v2

    move v4, v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e7\u06e5\u06e3"

    goto :goto_1

    :catchall_0
    move-exception v0

    sget v0, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v2, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    or-int/lit16 v2, v2, -0x45f

    mul-int/2addr v0, v2

    if-ltz v0, :cond_4

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟ۥۧۦۥ()I

    const-string v0, "\u06e1\u06df\u06e6"

    invoke-static {v0}, Landroidx/appcompat/widget/۟ۢۨۦ;->۠ۢۤۥ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_4
    sget v0, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v2, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    or-int/2addr v0, v2

    const v2, -0x1ac809

    xor-int/2addr v0, v2

    move v4, v0

    goto/16 :goto_0

    :sswitch_4
    :try_start_0
    sget-object v0, Lpb0;->o1:Ljava/lang/String;

    iget-object v2, p0, Lx30;->b:Lfs;

    invoke-static {v3, v0, v2}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget v0, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v2, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    add-int/lit16 v2, v2, -0x1b27

    xor-int/2addr v0, v2

    if-gtz v0, :cond_5

    const/16 v0, 0x60

    sput v0, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    :cond_5
    const-string v0, "\u06e7\u06e5\u06e3"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :sswitch_5
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v2, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    add-int/lit16 v2, v2, -0x181c

    div-int/2addr v1, v2

    if-eqz v1, :cond_6

    const/16 v1, 0x3f

    sput v1, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    const-string v1, "\u06e6\u06e0\u06e2"

    invoke-static {v1}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    move v4, v2

    goto/16 :goto_0

    :cond_6
    const-string v1, "\u06e1\u06e5\u06e2"

    move-object v2, v1

    goto/16 :goto_2

    :sswitch_6
    :try_start_1
    sget-object v0, Lpb0;->a:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sget v0, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v2, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sub-int/2addr v0, v2

    const v2, 0x1ab30c

    add-int/2addr v0, v2

    move v4, v0

    goto/16 :goto_0

    :sswitch_7
    const-string v0, "\u06e6\u06e1\u06e2"

    goto/16 :goto_3

    :sswitch_8
    sget v0, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v2, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    or-int/lit16 v2, v2, 0x1a4e

    mul-int/2addr v0, v2

    if-gtz v0, :cond_7

    const/16 v0, 0x63

    sput v0, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    const-string v0, "\u06e4\u06e4\u06e0"

    goto/16 :goto_3

    :cond_7
    sget v0, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sget v2, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    rem-int/2addr v0, v2

    const v2, 0x1abce1

    add-int/2addr v0, v2

    move v4, v0

    goto/16 :goto_0

    :sswitch_9
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc81 -> :sswitch_0
        0x1aae88 -> :sswitch_5
        0x1aaf3e -> :sswitch_1
        0x1aaf5f -> :sswitch_7
        0x1aaf7c -> :sswitch_4
        0x1abd86 -> :sswitch_2
        0x1abdc9 -> :sswitch_3
        0x1ac168 -> :sswitch_8
        0x1ac187 -> :sswitch_6
        0x1ac5c5 -> :sswitch_9
        0x1ac96a -> :sswitch_0
    .end sparse-switch
.end method
