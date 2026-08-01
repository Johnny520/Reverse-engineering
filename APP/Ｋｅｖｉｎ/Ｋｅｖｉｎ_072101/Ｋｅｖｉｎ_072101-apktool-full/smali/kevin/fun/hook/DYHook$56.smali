.class Lkevin/fun/hook/DYHook$56;
.super Lde/robv/android/xposed/XC_MethodHook;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkevin/fun/hook/DYHook;->hookFeedComponents(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field private static final short:[S


# instance fields
.field final this$0:Lkevin/fun/hook/DYHook;

.field private final val$className:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x21

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/DYHook$56;->short:[S

    return-void

    :array_0
    .array-data 2
        0x35b7s
        0x5ecs
        0x5c2s
        0x5d1s
        0x5ces
        0x5c9s
        0x35b6s
        0x587s
        0x5cfs
        0x5c8s
        0x5c8s
        0x5ccs
        0x587s
        0x582s
        0x5das
        0x5c5s
        0x5dfs
        0x5c5s
        0x5ces
        0x5c5s
        0x5c0s
        0x5c5s
        0x5d8s
        0x5d5s
        0x58cs
        0x5cas
        0x5cds
        0x5c5s
        0x5c0s
        0x5c9s
        0x5c8s
        0x596s
        0x58cs
    .end array-data
.end method

.method constructor <init>(Lkevin/fun/hook/DYHook;Ljava/lang/String;)V
    .locals 2

    iput-object p1, p0, Lkevin/fun/hook/DYHook$56;->this$0:Lkevin/fun/hook/DYHook;

    iput-object p2, p0, Lkevin/fun/hook/DYHook$56;->val$className:Ljava/lang/String;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    invoke-static {}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۢۦۥۢ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "lis21Bm2xTJhapC3UWBUH"

    invoke-static {v0}, Landroidx/core/ktx/۟۟ۡۢ۠;->۟ۥ۟ۨ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣ۟۠ۨۤ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    invoke-static {}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥۢۦ۠()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    invoke-virtual {p0, p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    :sswitch_3
    invoke-static {}, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣۤۥۥ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-ltz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "CdYB"

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->۟۟ۧۡۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(D)V

    :sswitch_7
    return-void

    :sswitch_8
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_9
    const v0, 0xbe22

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_9
        0xb97b -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۧۧۥۤ()[S
    .locals 2

    invoke-static {}, Landroidx/drawerlayout/ۤۨۡۤ;->ۨۧۢۤ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/DYHook$56;->short:[S

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۥۣ۟۟(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/customview/ۡۤۡۤ;->۟ۡ۠ۧ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook$56;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$56;->val$className:Ljava/lang/String;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۨۧۡ(Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۡ۟ۨۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method protected beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 7

    const/4 v6, 0x0

    const/4 v0, 0x0

    :try_start_0
    invoke-static {v0}, Landroidx/loader/ۡۢۢ;->ۤۨۡۥ(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {p1, v0}, Lkevin/fun/hook/DYHook$56;->ۣ۟۠ۨۤ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :goto_1
    :sswitch_0
    return-void

    :sswitch_1
    const/16 v0, 0x66f

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {p0}, Lkevin/fun/hook/DYHook$56;->ۥۣ۟۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣۡۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/DYHook$56;->۟ۧۧۥۤ()[S

    move-result-object v3

    sget v4, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/lit8 v4, v4, 0x7f

    const/16 v5, 0x5a7

    invoke-static {v3, v6, v4, v5}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۢۤۤ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/DYHook$56;->۟ۧۧۥۤ()[S

    move-result-object v2

    const/16 v3, 0xd

    sget v4, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/lit8 v4, v4, -0x22

    const/16 v5, 0x5ac

    invoke-static {v2, v3, v4, v5}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۧۨۦۦ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DYHook$56;->ۨۧۡ(Ljava/lang/Object;)V

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
    .end sparse-switch
.end method
