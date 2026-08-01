.class public Lkevin/fun/hook/Pexellad;
.super Ljava/lang/Object;

# interfaces
.implements Lde/robv/android/xposed/IXposedHookLoadPackage;


# static fields
.field private static final PACKAGE_NAME:Ljava/lang/String;

.field private static final fontCache:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Landroid/graphics/Typeface;",
            ">;"
        }
    .end annotation
.end field

.field private static final short:[S


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/16 v0, 0xa5

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/Pexellad;->short:[S

    invoke-static {}, Lkevin/fun/hook/Pexellad;->۠ۦ۟ۡ()[S

    move-result-object v0

    const/4 v1, 0x0

    sget v2, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    xor-int/lit16 v2, v2, 0x277

    const/16 v3, 0x148

    invoke-static {v0, v1, v2, v3}, Landroidx/emoji2/ۢۧۡۧ;->۟ۥۢ۟ۢ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/Pexellad;->PACKAGE_NAME:Ljava/lang/String;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lkevin/fun/hook/Pexellad;->fontCache:Ljava/util/HashMap;

    return-void

    :array_0
    .array-data 2
        0x12bs
        0x127s
        0x125s
        0x166s
        0x121s
        0x125s
        0x129s
        0x12fs
        0x121s
        0x126s
        0x13bs
        0x13cs
        0x13ds
        0x12cs
        0x121s
        0x127s
        0x166s
        0x121s
        0x125s
        0x129s
        0x12fs
        0x12ds
        0x13cs
        0x127s
        0x127s
        0x124s
        0x13bs
        0x166s
        0x138s
        0x121s
        0x130s
        0x12ds
        0x124s
        0x124s
        0x129s
        0x12as
        0xbd2s
        0xbdes
        0xbdcs
        0xb9fs
        0xbd8s
        0xbdcs
        0xbd0s
        0xbd6s
        0xbd8s
        0xbdfs
        0xbc2s
        0xbc5s
        0xbc4s
        0xbd5s
        0xbd8s
        0xbdes
        0xb9fs
        0xbd8s
        0xbdcs
        0xbd0s
        0xbd6s
        0xbd4s
        0xbc5s
        0xbdes
        0xbdes
        0xbdds
        0xbc2s
        0xb9fs
        0xbc1s
        0xbd8s
        0xbc9s
        0xbd4s
        0xbdds
        0xbdds
        0xbd0s
        0xbd3s
        0x280s
        0x291s
        0x286s
        0x282s
        0x297s
        0x286s
        0x2a5s
        0x291s
        0x28cs
        0x28es
        0x2a2s
        0x290s
        0x290s
        0x286s
        0x297s
        0x5d0s
        0x5edcs
        0x4ad8s
        0x7a98s
        0x5ed3s
        0x4a65s
        0x5c86s
        0x5d6s
        0x5abs
        0x5c3s
        0x5e4s
        0x5e4s
        0x5e0s
        0x5cbas
        -0x7752s
        0x5b1s
        0x5abs
        0xbf4s
        0xbfbs
        0xbf1s
        0xbe7s
        0xbfas
        0xbfcs
        0xbf1s
        0xbbbs
        0xbf4s
        0xbe5s
        0xbe5s
        0xbbbs
        0xbd4s
        0xbf6s
        0xbe1s
        0xbfcs
        0xbe3s
        0xbfcs
        0xbe1s
        0xbecs
        0x499s
        0x498s
        0x4bas
        0x499s
        0x481s
        0x4bbs
        0x493s
        0x49bs
        0x499s
        0x484s
        0x48fs
        0x1f5s
        0x5af9s
        0x4efds
        0x7ebds
        0x5af6s
        0x4e40s
        0x58a3s
        0x1f3s
        0x18es
        0x1e6s
        0x1c1s
        0x1c1s
        0x1c5s
        0x18es
        0x1c1s
        0x1c0s
        0x1e2s
        0x1c1s
        0x1d9s
        0x1e3s
        0x1cbs
        0x1c3s
        0x1c1s
        0x1dcs
        0x1d7s
        0x18es
        0x589fs
        -0x7375s
        0x194s
        0x18es
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۣۨۧۥ()I

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
    const-string v0, "z9"

    invoke-static {v0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۣ۟ۧۢۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

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

.method static bridge synthetic _$$Nest$sfgetfontCache()Ljava/util/HashMap;
    .locals 1

    invoke-static {}, Lkevin/fun/hook/Pexellad;->۟ۤۥ()Ljava/util/HashMap;

    move-result-object v0

    return-object v0
.end method

.method public static ۟ۢ۟(Ljava/lang/Object;)V
    .locals 3

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V

    :sswitch_3
    invoke-static {}, Landroidx/appcompat/ۣۧۤۢ;->ۢ۟۟ۨ()I

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
    const-string v0, "xjj10K3wK0XiJe"

    invoke-static {v0}, Landroidx/activity/ۦۧۥۥ;->ۧۧ۠ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

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

.method public static ۟ۤۥ()Ljava/util/HashMap;
    .locals 2

    invoke-static {}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟ۢۡ۟()I

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
    sget-object v0, Lkevin/fun/hook/Pexellad;->fontCache:Ljava/util/HashMap;

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

.method public static ۣ۟ۧ۟(Ljava/lang/Object;)Ljava/lang/ClassLoader;
    .locals 2

    invoke-static {}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۤۦۥۥ()I

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
    check-cast p0, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    iget-object v0, p0, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

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

.method public static ۣ۠ۤۨ(Ljava/lang/Object;)Ljava/lang/String;
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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    iget-object v0, p0, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->packageName:Ljava/lang/String;

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

.method public static ۠ۦ۟ۡ()[S
    .locals 2

    invoke-static {}, Landroidx/customview/ۤۡۥ;->۟ۢۢۦ()I

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
    sget-object v0, Lkevin/fun/hook/Pexellad;->short:[S

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

.method public static ۢۦ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    .locals 2

    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۣ۟ۡۨۡ()I

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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Ljava/lang/String;

    check-cast p1, Ljava/lang/ClassLoader;

    check-cast p2, Ljava/lang/String;

    check-cast p3, [Ljava/lang/Object;

    invoke-static {p0, p1, p2, p3}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

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

.method public static ۥۥۧ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    .locals 2

    invoke-static {}, Landroidx/loader/۟۠ۢۧۡ;->۟ۦۨ۠ۥ()I

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
    check-cast p0, Ljava/lang/Class;

    check-cast p1, Ljava/lang/String;

    check-cast p2, [Ljava/lang/Object;

    invoke-static {p0, p1, p2}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

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


# virtual methods
.method public handleLoadPackage(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    invoke-static {}, Lkevin/fun/hook/Pexellad;->۠ۦ۟ۡ()[S

    move-result-object v0

    const/16 v1, 0x24

    sget v2, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    xor-int/lit8 v2, v2, -0x47

    const/16 v3, 0xbb1

    invoke-static {v0, v1, v2, v3}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۦۧۦ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Lkevin/fun/hook/Pexellad;->ۣ۠ۤۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    if-nez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۣۢۢۦ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-ltz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    const-string v0, "5U0K8y0U"

    invoke-static {v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۟ۡ۠ۢ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(D)V

    :goto_2
    :sswitch_6
    return-void

    :sswitch_7
    :try_start_0
    invoke-static {}, Lkevin/fun/hook/Pexellad;->۠ۦ۟ۡ()[S

    move-result-object v0

    const/16 v1, 0x48

    sget v2, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    xor-int/lit8 v2, v2, -0x76

    const/16 v3, 0x2e3

    invoke-static {v0, v1, v2, v3}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۤۦۢۧ([SIII)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lkevin/fun/hook/Pexellad$1;

    invoke-direct {v1, p0}, Lkevin/fun/hook/Pexellad$1;-><init>(Lkevin/fun/hook/Pexellad;)V

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    sget v3, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    xor-int/lit16 v3, v3, 0x267

    const-class v4, Landroid/content/res/AssetManager;

    aput-object v4, v2, v3

    sget v3, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۤۨۡ:I

    xor-int/lit16 v3, v3, -0x3a5

    const-class v4, Ljava/lang/String;

    aput-object v4, v2, v3

    sget v3, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/lit8 v3, v3, 0x50

    aput-object v1, v2, v3

    const-class v1, Landroid/graphics/Typeface;

    invoke-static {v1, v0, v2}, Lkevin/fun/hook/Pexellad;->ۥۥۧ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v0, 0x748

    :goto_3
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :sswitch_8
    const v0, 0xbe22

    goto :goto_3

    :catchall_0
    move-exception v0

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/Pexellad;->۠ۦ۟ۡ()[S

    move-result-object v2

    const/16 v3, 0x57

    sget v4, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/lit8 v4, v4, -0x65

    const/16 v5, 0x58b

    invoke-static {v2, v3, v4, v5}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣۣ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/Pexellad;->۟ۢ۟(Ljava/lang/Object;)V

    :sswitch_9
    :try_start_1
    invoke-static {}, Lkevin/fun/hook/Pexellad;->۠ۦ۟ۡ()[S

    move-result-object v0

    const/16 v1, 0x68

    sget v2, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۡۢ۟:I

    xor-int/lit16 v2, v2, 0x336

    const/16 v3, 0xb95

    invoke-static {v0, v1, v2, v3}, Landroidx/activity/ۤۧۧۧ;->ۣ۟۟۠ۡ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Lkevin/fun/hook/Pexellad;->ۣ۟ۧ۟(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/Pexellad;->۠ۦ۟ۡ()[S

    move-result-object v2

    const/16 v3, 0x7c

    sget v4, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v4, v4, -0x162

    const/16 v5, 0x4f6

    invoke-static {v2, v3, v4, v5}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۨۤ۠۠([SIII)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lkevin/fun/hook/Pexellad$2;

    invoke-direct {v3, p0}, Lkevin/fun/hook/Pexellad$2;-><init>(Lkevin/fun/hook/Pexellad;)V

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    sget v5, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/lit8 v5, v5, -0x14

    aput-object v3, v4, v5

    invoke-static {v0, v1, v2, v4}, Lkevin/fun/hook/Pexellad;->ۢۦ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const v0, 0xbe7f

    :goto_4
    const v1, 0xbe90

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_4

    :sswitch_a
    const v0, 0xbe9e

    goto :goto_4

    :catchall_1
    move-exception v0

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/Pexellad;->۠ۦ۟ۡ()[S

    move-result-object v2

    const/16 v3, 0x87

    sget v4, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۢ۠۠ۨ:I

    xor-int/lit8 v4, v4, -0x55

    const/16 v5, 0x1ae

    invoke-static {v2, v3, v4, v5}, Landroidx/emoji2/ۢۧۡۧ;->۟ۥۢ۟ۢ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/Pexellad;->۟ۢ۟(Ljava/lang/Object;)V

    goto/16 :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_7
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_6
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_8
        0xb97b -> :sswitch_9
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_6
        0xef -> :sswitch_a
    .end sparse-switch
.end method
