.class Lkevin/fun/hook/DYHook$7;
.super Lde/robv/android/xposed/XC_MethodHook;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkevin/fun/hook/DYHook;->hookConversationSession(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field private static final short:[S


# instance fields
.field private final val$processedSessions:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x34

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/DYHook$7;->short:[S

    return-void

    :array_0
    .array-data 2
        0x442s
        0x45fs
        0x442s
        0x45as
        0x453s
        0x4efs
        0x4eds
        0x4fcs
        0x4dcs
        0x4e1s
        0x4fcs
        0x4e4s
        0x4eds
        0x28es
        0x283s
        0xa8es
        0xa8cs
        0xa9ds
        0xaa0s
        0xa8ds
        0x52as
        0x531s
        0x528s
        0x528s
        0xb51s
        0xb5ds
        0xb5cs
        0xb44s
        0xb57s
        0xb40s
        0xb41s
        0xb53s
        0xb46s
        0xb5bs
        0xb5ds
        0xb5cs
        0x3dbs
        0x343ds
        0x466s
        0x448s
        0x45bs
        0x444s
        0x443s
        0x343cs
        0x5d29s
        0x702bs
        0x4b37s
        -0x7010s
        0x5d1cs
        -0x76f8s
        0x417s
        0x40ds
    .end array-data
.end method

.method constructor <init>(Ljava/util/Set;)V
    .locals 3

    iput-object p1, p0, Lkevin/fun/hook/DYHook$7;->val$processedSessions:Ljava/util/Set;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    invoke-static {}, Landroidx/appcompat/ۣۧۤۢ;->ۢ۟۟ۨ()I

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
    const-string v0, "wMXW6"

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۤۡۥۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(D)V

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

.method public static ۟ۡۥۦۧ(Ljava/lang/Object;)Ljava/util/Set;
    .locals 2

    invoke-static {}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۤ۠ۧۡ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$7;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$7;->val$processedSessions:Ljava/util/Set;

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

.method public static ۟ۢۤ۠(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۢۥ۠()I

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

    iget-object v0, p0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

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

.method public static ۟ۦۧۢۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
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
    check-cast p1, Ljava/lang/String;

    invoke-static {p0, p1}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

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

.method public static ۟ۧۥۣۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣۤۥۥ()I

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
    check-cast p1, Ljava/lang/String;

    check-cast p2, [Ljava/lang/Object;

    invoke-static {p0, p1, p2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

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

.method public static ۣ۟ۧۧ۠()Ljava/util/Map;
    .locals 2

    invoke-static {}, Landroidx/activity/ۣۦۡۥ;->ۦۧۥۨ()I

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
    invoke-static {}, Lkevin/fun/hook/DYHook;->_$$Nest$sfgetallConversationItems()Ljava/util/Map;

    move-result-object v0

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

.method public static ۠ۧۥۤ(Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣۣ۟۠()I

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

.method public static ۢۥۣۤ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/viewpager/ۣۢ۟ۤ;->ۥ۠ۤ()I

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

    check-cast p1, Ljava/lang/String;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$smsaveConversationName(Ljava/lang/String;Ljava/lang/String;)V

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

.method public static ۣۨ۟ۤ()[S
    .locals 2

    invoke-static {}, Landroidx/loader/ۥۧۨۤ;->ۣۡۧۨ()I

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
    sget-object v0, Lkevin/fun/hook/DYHook$7;->short:[S

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


# virtual methods
.method protected afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 7

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    move-result-object v1

    :try_start_0
    invoke-static {p1}, Lkevin/fun/hook/DYHook$7;->۟ۢۤ۠(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    move-result-object v3

    :try_start_1
    invoke-static {}, Lkevin/fun/hook/DYHook$7;->ۣۨ۟ۤ()[S

    move-result-object v0

    const/4 v2, 0x0

    sget v4, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v4, v4, 0x20b

    const/16 v5, 0x436

    invoke-static {v0, v2, v4, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۡۧۨ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkevin/fun/hook/DYHook$7;->۟ۦۧۢۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

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
    if-eqz v2, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v2}, Landroidx/startup/ۤۧۥۣ;->۟۠ۧۨۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/documentfile/ۡۢ۟ۥ;->۠۠ۦۦ(Ljava/lang/Object;)Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v2, 0x6eb

    goto :goto_1

    :sswitch_4
    move-object v2, v0

    :goto_2
    :try_start_2
    invoke-static {}, Lkevin/fun/hook/DYHook$7;->ۣۨ۟ۤ()[S

    move-result-object v0

    const/16 v4, 0xd

    sget v5, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v5, v5, 0x124

    const/16 v6, 0x2e7

    invoke-static {v0, v4, v5, v6}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۤ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkevin/fun/hook/DYHook$7;->۟ۦۧۢۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-result-object v4

    const v0, 0xc202

    :goto_3
    const v5, 0xc213

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :sswitch_5
    if-eqz v4, :cond_2

    const v0, 0xc25f

    goto :goto_3

    :catchall_0
    move-exception v0

    :try_start_3
    invoke-static {}, Lkevin/fun/hook/DYHook$7;->ۣۨ۟ۤ()[S

    move-result-object v0

    const/4 v2, 0x5

    sget v4, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    xor-int/lit16 v4, v4, -0x252

    const/16 v5, 0x488

    invoke-static {v0, v2, v4, v5}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢ۟ۥۨ([SIII)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v3, v0, v2}, Lkevin/fun/hook/DYHook$7;->۟ۧۥۣۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/16 v0, 0x748

    :goto_4
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_3

    goto :goto_4

    :sswitch_6
    if-eqz v2, :cond_1

    const v0, 0xbe60

    goto :goto_4

    :cond_1
    :sswitch_7
    const v0, 0xbe41

    goto :goto_4

    :sswitch_8
    invoke-static {v2}, Landroidx/startup/ۤۧۥۣ;->۟۠ۧۨۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/documentfile/ۡۢ۟ۥ;->۠۠ۦۦ(Ljava/lang/Object;)Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-result-object v0

    :goto_5
    const v2, 0xbe7f

    :goto_6
    const v4, 0xbe90

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_4

    goto :goto_6

    :sswitch_9
    move-object v2, v0

    goto :goto_2

    :sswitch_a
    const v2, 0xbe9e

    goto :goto_6

    :catchall_1
    move-exception v0

    const v0, 0xbefb

    :goto_7
    const v2, 0xbf0c

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_5

    goto :goto_7

    :sswitch_b
    move-object v0, v1

    goto :goto_5

    :sswitch_c
    const v0, 0xbf1a

    goto :goto_7

    :cond_2
    :sswitch_d
    const v0, 0xc240

    goto :goto_3

    :sswitch_e
    :try_start_4
    invoke-static {v4}, Landroidx/startup/ۤۧۥۣ;->۟۠ۧۨۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/documentfile/ۡۢ۟ۥ;->۠۠ۦۦ(Ljava/lang/Object;)Ljava/lang/String;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    move-result-object v1

    const v0, 0xc27e

    :goto_8
    const v3, 0xc28f

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_6

    goto :goto_8

    :sswitch_f
    :try_start_5
    invoke-static {v1}, Landroidx/activity/ۨ۠۟ۧ;->۟ۧ۟ۡ۠(Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    move-result v3

    const v0, 0xc984

    :goto_9
    const v4, 0xc995

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_7

    goto :goto_9

    :sswitch_10
    if-nez v3, :cond_4

    const v0, 0xc9e1

    goto :goto_9

    :sswitch_11
    const v0, 0xc29d

    goto :goto_8

    :catchall_2
    move-exception v0

    :try_start_6
    invoke-static {}, Lkevin/fun/hook/DYHook$7;->ۣۨ۟ۤ()[S

    move-result-object v0

    const/16 v4, 0xf

    sget v5, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/lit8 v5, v5, 0x57

    const/16 v6, 0xae9

    invoke-static {v0, v4, v5, v6}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۦۤۢۦ([SIII)Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v3, v0, v4}, Lkevin/fun/hook/DYHook$7;->۟ۧۥۣۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const v0, 0xc2fa

    :goto_a
    const v4, 0xc30b

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_8

    goto :goto_a

    :sswitch_12
    if-eqz v3, :cond_3

    const v0, 0xc5e2

    goto :goto_a

    :cond_3
    :sswitch_13
    const v0, 0xc5c3

    goto :goto_a

    :sswitch_14
    invoke-static {v3}, Landroidx/startup/ۤۧۥۣ;->۟۠ۧۨۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/documentfile/ۡۢ۟ۥ;->۠۠ۦۦ(Ljava/lang/Object;)Ljava/lang/String;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    move-result-object v1

    :sswitch_15
    const v0, 0xc601

    :goto_b
    const v3, 0xc612

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_9

    goto :goto_b

    :sswitch_16
    const v0, 0xc620

    goto :goto_b

    :catchall_3
    move-exception v0

    const v0, 0xc67d

    :goto_c
    const v3, 0xc68e

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_a

    goto :goto_c

    :sswitch_17
    const v0, 0xc69c

    goto :goto_c

    :cond_4
    :sswitch_18
    const v0, 0xc9c2

    goto :goto_9

    :sswitch_19
    :try_start_7
    invoke-static {v2}, Landroidx/activity/ۨ۠۟ۧ;->۟ۧ۟ۡ۠(Ljava/lang/Object;)Z

    move-result v3

    const v0, 0xca00

    :goto_d
    const v4, 0xca11

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_b

    goto :goto_d

    :cond_5
    :sswitch_1a
    const v0, 0xca3e

    goto :goto_d

    :sswitch_1b
    if-eqz v3, :cond_5

    const v0, 0xca5d

    goto :goto_d

    :sswitch_1c
    const v0, 0xca7c

    :goto_e
    const v1, 0xca8d

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_c

    goto :goto_e

    :sswitch_1d
    const v0, 0xcd26

    goto :goto_e

    :sswitch_1e
    invoke-static {}, Lkevin/fun/hook/DYHook$7;->ۣۨ۟ۤ()[S

    move-result-object v0

    const/16 v3, 0x14

    sget v4, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣ۠ۢۢ:I

    xor-int/lit8 v4, v4, -0x6b

    const/16 v5, 0x544

    invoke-static {v0, v3, v4, v5}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۢۦۣ۠([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const v0, 0xcd83

    :goto_f
    const v4, 0xcd94

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_d

    goto :goto_f

    :sswitch_1f
    if-nez v3, :cond_6

    const v0, 0xcde0

    goto :goto_f

    :cond_6
    :sswitch_20
    const v0, 0xcdc1

    goto :goto_f

    :sswitch_21
    invoke-static {}, Lkevin/fun/hook/DYHook$7;->ۣۨ۟ۤ()[S

    move-result-object v0

    const/16 v3, 0x18

    sget v4, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣ۠ۧ:I

    xor-int/lit16 v4, v4, -0x1e8

    const/16 v5, 0xb32

    invoke-static {v0, v3, v4, v5}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۢۧۢ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroidx/core/ۧ۟ۤۨ;->ۨۨ۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const v0, 0xcdff

    :goto_10
    const v4, 0xce10

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_e

    goto :goto_10

    :cond_7
    :sswitch_22
    const v0, 0xce3d

    goto :goto_10

    :sswitch_23
    if-eqz v3, :cond_7

    const v0, 0xd0e7

    goto :goto_10

    :sswitch_24
    const v0, 0xd106

    :goto_11
    const v1, 0xd117

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_f

    goto :goto_11

    :sswitch_25
    const v0, 0xd125

    goto :goto_11

    :sswitch_26
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v0, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DYHook$7;->ۣۨ۟ۤ()[S

    move-result-object v3

    const/16 v4, 0x24

    const/4 v5, 0x1

    const/16 v6, 0x384

    invoke-static {v3, v4, v5, v6}, Landroidx/drawerlayout/ۤۨۡۤ;->ۤ۠ۤ۠([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {p0}, Lkevin/fun/hook/DYHook$7;->۟ۡۥۦۧ(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-static {v0, v3}, Landroidx/customview/ۤۡۥ;->۟ۤ۟ۤۢ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const v0, 0xd182

    :goto_12
    const v5, 0xd193

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_10

    goto :goto_12

    :sswitch_27
    if-eqz v4, :cond_8

    const v0, 0xd1df

    goto :goto_12

    :cond_8
    :sswitch_28
    const v0, 0xd1c0

    goto :goto_12

    :sswitch_29
    invoke-static {}, Landroidx/loader/ۥۧۨۤ;->ۣۡۧۨ()I

    move-result v1

    const v0, 0xd1fe

    :goto_13
    const v2, 0xd20f

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_11

    goto :goto_13

    :sswitch_2a
    if-ltz v1, :cond_9

    const v0, 0xd4e6

    goto :goto_13

    :cond_9
    :sswitch_2b
    const v0, 0xd4c7

    goto :goto_13

    :sswitch_2c
    const-string v0, "XimkP4rcECTohPrzjB"

    invoke-static {v0}, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۣ۟ۤۧۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :goto_14
    :sswitch_2d
    return-void

    :sswitch_2e
    invoke-static {p0}, Lkevin/fun/hook/DYHook$7;->۟ۡۥۦۧ(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-static {v0, v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۤۢۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-static {}, Lkevin/fun/hook/DYHook$7;->ۣ۟ۧۧ۠()Ljava/util/Map;

    move-result-object v0

    new-instance v3, Lkevin/fun/hook/DYHook$ConversationItem;

    invoke-direct {v3, v1, v2}, Lkevin/fun/hook/DYHook$ConversationItem;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0, v1, v3}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۣۢۢۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1, v2}, Lkevin/fun/hook/DYHook$7;->ۢۥۣۤ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    const v0, 0xd505

    :goto_15
    const v1, 0xd516

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_12

    goto :goto_15

    :sswitch_2f
    const v0, 0xd524

    goto :goto_15

    :catchall_4
    move-exception v0

    invoke-static {v0}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣۡۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/DYHook$7;->ۣۨ۟ۤ()[S

    move-result-object v2

    const/16 v3, 0x25

    sget v4, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    xor-int/lit16 v4, v4, 0x29c

    const/16 v5, 0x42d

    invoke-static {v2, v3, v4, v5}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۦۣۣۦ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DYHook$7;->۠ۧۥۤ(Ljava/lang/Object;)V

    goto :goto_14

    :sswitch_30
    move-object v2, v1

    goto/16 :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_30
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_5
        0x32 -> :sswitch_d
        0x4c -> :sswitch_e
        0x53 -> :sswitch_f
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_30
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0xe -> :sswitch_9
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x16 -> :sswitch_b
        0x1f7 -> :sswitch_c
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_f
        0xf1 -> :sswitch_11
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x11 -> :sswitch_10
        0x36 -> :sswitch_18
        0x57 -> :sswitch_2d
        0x74 -> :sswitch_19
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x1f1 -> :sswitch_12
        0x6af -> :sswitch_13
        0x6c8 -> :sswitch_f
        0x6e9 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x13 -> :sswitch_16
        0x32 -> :sswitch_f
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x12 -> :sswitch_15
        0xf3 -> :sswitch_17
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_1a
        0x11 -> :sswitch_1b
        0x2f -> :sswitch_1e
        0x4c -> :sswitch_1c
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_1d
        0x7ab -> :sswitch_2d
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_1f
        0x36 -> :sswitch_20
        0x55 -> :sswitch_2d
        0x74 -> :sswitch_21
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_22
        0x2d -> :sswitch_26
        0x3ef -> :sswitch_23
        0x1ef7 -> :sswitch_24
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_25
        0x32 -> :sswitch_2d
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x11 -> :sswitch_27
        0x32 -> :sswitch_28
        0x4c -> :sswitch_29
        0x53 -> :sswitch_2e
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x3f1 -> :sswitch_2a
        0x6a7 -> :sswitch_2b
        0x6c8 -> :sswitch_2d
        0x6e9 -> :sswitch_2c
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x13 -> :sswitch_2f
        0x32 -> :sswitch_2d
    .end sparse-switch
.end method
