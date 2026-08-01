.class public Lkevin/fun/hook/gesture/GestureConfig;
.super Ljava/lang/Object;


# static fields
.field public static final ACTION_CAMERA:I = 0x8

.field public static final ACTION_COLLECT:I = 0x3

.field public static final ACTION_COMMENT:I = 0x4

.field public static final ACTION_DOWNLOAD:I = 0x1

.field public static final ACTION_EYE_LIST:I = 0x7

.field public static final ACTION_EYE_MARK:I = 0x6

.field public static final ACTION_NAMES:[Ljava/lang/String;

.field public static final ACTION_NONE:I = 0x0

.field public static final ACTION_VALUES:[I

.field public static final ACTION_VIDEO_INFO:I = 0x2

.field public static final ACTION_WATCH_HISTORY:I = 0x5

.field private static final PREFIX_DOUBLE_CLICK:Ljava/lang/String;

.field private static final PREFIX_LONG_PRESS:Ljava/lang/String;

.field public static final REGION_BOTTOM_LEFT:I = 0x2

.field public static final REGION_BOTTOM_RIGHT:I = 0x3

.field public static final REGION_TOP_LEFT:I = 0x0

.field public static final REGION_TOP_RIGHT:I = 0x1

.field private static final short:[S


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v0, 0xf6

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/gesture/GestureConfig;->short:[S

    invoke-static {}, Lkevin/fun/hook/gesture/GestureConfig;->ۣ۠۠ۢ()[S

    move-result-object v0

    const/4 v1, 0x0

    sget v2, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    xor-int/lit16 v2, v2, 0x176

    const/16 v3, 0x366

    invoke-static {v0, v1, v2, v3}, Lorg/luckypray/dexkit/۠۠ۥ;->۟ۥۧۦ۠([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/gesture/GestureConfig;->PREFIX_DOUBLE_CLICK:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/gesture/GestureConfig;->ۣ۠۠ۢ()[S

    move-result-object v0

    const/16 v1, 0xf

    sget v2, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    xor-int/lit16 v2, v2, -0x106

    const/16 v3, 0xb7f

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۨۦۣۨ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/gesture/GestureConfig;->PREFIX_LONG_PRESS:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/gesture/GestureConfig;->ۣ۠۠ۢ()[S

    move-result-object v0

    const/16 v1, 0x1c

    sget v2, Landroidx/activity/ۤۧۧۧ;->۟۟ۢ۠ۡ:I

    xor-int/lit16 v2, v2, 0x1ee

    const/16 v3, 0x5fc

    invoke-static {v0, v1, v2, v3}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۢ۠ۤۥ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/gesture/GestureConfig;->ۣ۠۠ۢ()[S

    move-result-object v1

    const/16 v2, 0x20

    sget v3, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    xor-int/lit16 v3, v3, -0x3c2

    const/16 v4, 0x3c3

    invoke-static {v1, v2, v3, v4}, Landroidx/loader/ۢۥ۟;->۟ۧ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/gesture/GestureConfig;->ۣ۠۠ۢ()[S

    move-result-object v2

    const/16 v3, 0x22

    sget v4, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/lit8 v4, v4, 0x74

    const/16 v5, 0x154

    invoke-static {v2, v3, v4, v5}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۧۡۥۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/gesture/GestureConfig;->ۣ۠۠ۢ()[S

    move-result-object v3

    const/16 v4, 0x28

    sget v5, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    xor-int/lit16 v5, v5, -0x321

    const/16 v6, 0x377

    invoke-static {v3, v4, v5, v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧ۠ۥ۟([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/gesture/GestureConfig;->ۣ۠۠ۢ()[S

    move-result-object v4

    const/16 v5, 0x2a

    sget v6, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v6, v6, 0x122

    const/16 v7, 0x9f9

    invoke-static {v4, v5, v6, v7}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/gesture/GestureConfig;->ۣ۠۠ۢ()[S

    move-result-object v5

    const/16 v6, 0x2e

    sget v7, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    xor-int/lit16 v7, v7, 0x30f

    const/16 v8, 0xca6

    invoke-static {v5, v6, v7, v8}, Landroidx/loader/ۥۧۨۤ;->۟ۢۢ۠ۥ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lkevin/fun/hook/gesture/GestureConfig;->ۣ۠۠ۢ()[S

    move-result-object v6

    const/16 v7, 0x30

    sget v8, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v8, v8, 0x31d

    const/16 v9, 0xcc9

    invoke-static {v6, v7, v8, v9}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۢۧۢ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Lkevin/fun/hook/gesture/GestureConfig;->ۣ۠۠ۢ()[S

    move-result-object v7

    const/16 v8, 0x32

    sget v9, Landroidx/activity/ۤۧۧۧ;->۟۟ۢ۠ۡ:I

    xor-int/lit16 v9, v9, 0x1ee

    const/16 v10, 0x4df

    invoke-static {v7, v8, v9, v10}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۧۡۥۡ([SIII)Ljava/lang/String;

    move-result-object v7

    invoke-static {}, Lkevin/fun/hook/gesture/GestureConfig;->ۣ۠۠ۢ()[S

    move-result-object v8

    const/16 v9, 0x36

    sget v10, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/lit8 v10, v10, -0x12

    const/16 v11, 0x7d6

    invoke-static {v8, v9, v10, v11}, Landroidx/core/ۧ۟ۤۨ;->ۡۥ۟ۥ([SIII)Ljava/lang/String;

    move-result-object v8

    const/16 v9, 0x9

    new-array v9, v9, [Ljava/lang/String;

    sget v10, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v10, v10, 0x20e

    aput-object v2, v9, v10

    sget v2, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    xor-int/lit16 v2, v2, 0xc2

    aput-object v3, v9, v2

    sget v2, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v2, v2, 0x124

    aput-object v4, v9, v2

    sget v2, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    xor-int/lit16 v2, v2, -0x3c1

    aput-object v5, v9, v2

    sget v2, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    xor-int/lit16 v2, v2, 0x3a4

    aput-object v6, v9, v2

    sget v2, Landroidx/customview/ۡۤۡۤ;->۟ۦ۟ۨۨ:I

    xor-int/lit16 v2, v2, 0xf6

    aput-object v7, v9, v2

    sget v2, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v2, v2, 0x2f8

    aput-object v8, v9, v2

    sget v2, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v2, v2, 0x2f9

    aput-object v0, v9, v2

    sget v0, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    xor-int/lit16 v0, v0, -0x1a8

    aput-object v1, v9, v0

    sput-object v9, Lkevin/fun/hook/gesture/GestureConfig;->ACTION_NAMES:[Ljava/lang/String;

    const/16 v0, 0x9

    new-array v0, v0, [I

    const/4 v1, 0x1

    const/4 v2, 0x1

    aput v2, v0, v1

    const/4 v1, 0x2

    const/4 v2, 0x2

    aput v2, v0, v1

    const/4 v1, 0x3

    const/4 v2, 0x3

    aput v2, v0, v1

    const/4 v1, 0x4

    const/4 v2, 0x4

    aput v2, v0, v1

    const/4 v1, 0x5

    const/4 v2, 0x5

    aput v2, v0, v1

    const/4 v1, 0x6

    const/4 v2, 0x6

    aput v2, v0, v1

    const/4 v1, 0x7

    const/4 v2, 0x7

    aput v2, v0, v1

    const/16 v1, 0x8

    const/16 v2, 0x8

    aput v2, v0, v1

    sput-object v0, Lkevin/fun/hook/gesture/GestureConfig;->ACTION_VALUES:[I

    return-void

    nop

    :array_0
    .array-data 2
        0x301s
        0x303s
        0x315s
        0x312s
        0x313s
        0x314s
        0x303s
        0x339s
        0x302s
        0x309s
        0x313s
        0x304s
        0x30as
        0x303s
        0x339s
        0xb18s
        0xb1as
        0xb0cs
        0xb0bs
        0xb0as
        0xb0ds
        0xb1as
        0xb20s
        0xb13s
        0xb10s
        0xb11s
        0xb18s
        0xb20s
        0x662es
        0x72c0s
        0x57ebs
        -0x726cs
        0x610es
        0x6787s
        0x64b4s
        -0x1a4s
        0x52cbs
        0x6599s
        0x4e08s
        -0x1a3s
        0x4d7cs
        -0x73f6s
        -0x7fc1s
        -0x6e98s
        0x4618s
        0x6996s
        0x6990s
        -0x7697s
        -0x78f3s
        -0x788ds
        -0x72e3s
        0x73d4s
        0x5759s
        0x572ds
        0x6404s
        0x70eas
        0x945s
        0x947s
        0x951s
        0x956s
        0x957s
        0x950s
        0x947s
        0x97ds
        0x946s
        0x94ds
        0x957s
        0x940s
        0x94es
        0x947s
        0x97ds
        0x42es
        0x42cs
        0x43as
        0x43ds
        0x43cs
        0x43bs
        0x42cs
        0x416s
        0x425s
        0x426s
        0x427s
        0x42es
        0x416s
        0xb9cs
        0xb9es
        0xb88s
        0xb8fs
        0xb8es
        0xb89s
        0xb9es
        0xba4s
        0xb9fs
        0xb92s
        0xb88s
        0xb9as
        0xb99s
        0xb97s
        0xb9es
        0xba4s
        0xb9fs
        0xb94s
        0xb8es
        0xb99s
        0xb97s
        0xb9es
        0xba4s
        0xb97s
        0xb92s
        0xb90s
        0xb9es
        0x666s
        0x664s
        0x672s
        0x675s
        0x674s
        0x673s
        0x664s
        0x65es
        0x665s
        0x668s
        0x672s
        0x660s
        0x663s
        0x66ds
        0x664s
        0x65es
        0x66ds
        0x66es
        0x66fs
        0x666s
        0x65es
        0x66cs
        0x664s
        0x66fs
        0x674s
        0x65bs
        0x659s
        0x64fs
        0x648s
        0x649s
        0x64es
        0x659s
        0x663s
        0x659s
        0x652s
        0x65ds
        0x65es
        0x650s
        0x659s
        0x658s
        0x1fes
        0x1fcs
        0x1eas
        0x1eds
        0x1ecs
        0x1ebs
        0x1fcs
        0x1c6s
        0x1fds
        0x1f0s
        0x1eas
        0x1f8s
        0x1fbs
        0x1f5s
        0x1fcs
        0x1c6s
        0x1fds
        0x1f6s
        0x1ecs
        0x1fbs
        0x1f5s
        0x1fcs
        0x1c6s
        0x1f5s
        0x1f0s
        0x1f2s
        0x1fcs
        0x6cfs
        0x6cds
        0x6dbs
        0x6dcs
        0x6dds
        0x6das
        0x6cds
        0x6f7s
        0x6ccs
        0x6c1s
        0x6dbs
        0x6c9s
        0x6cas
        0x6c4s
        0x6cds
        0x6f7s
        0x6c4s
        0x6c7s
        0x6c6s
        0x6cfs
        0x6f7s
        0x6c5s
        0x6cds
        0x6c6s
        0x6dds
        0x1e3s
        0x1e1s
        0x1f7s
        0x1f0s
        0x1f1s
        0x1f6s
        0x1e1s
        0x1dbs
        0x1e0s
        0x1ebs
        0x1f1s
        0x1e6s
        0x1e8s
        0x1e1s
        0x1dbs
        0xbf1s
        0xbf3s
        0xbe5s
        0xbe2s
        0xbe3s
        0xbe4s
        0xbf3s
        0xbc9s
        0xbf3s
        0xbf8s
        0xbf7s
        0xbf4s
        0xbfas
        0xbf3s
        0xbf2s
        0x9a5s
        0x9a7s
        0x9b1s
        0x9b6s
        0x9b7s
        0x9b0s
        0x9a7s
        0x99ds
        0x9aes
        0x9ads
        0x9acs
        0x9a5s
        0x99ds
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroidx/documentfile/ۡۢ۟ۥ;->۟۟ۧۢۡ()I

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
    const-string v0, "aY"

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۤۡۥۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

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

.method public static getActionName(I)Ljava/lang/String;
    .locals 4

    const/4 v1, 0x0

    move v0, v1

    :sswitch_0
    invoke-static {}, Landroidx/drawerlayout/ۤۨۡۤ;->ۡۢ۠ۧ()[I

    move-result-object v2

    array-length v3, v2

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_1
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_2
    if-lt v0, v3, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_3
    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟۟۠۟ۦ()[Ljava/lang/String;

    move-result-object v0

    aget-object v0, v0, v1

    :goto_1
    return-object v0

    :sswitch_4
    invoke-static {}, Landroidx/drawerlayout/ۤۨۡۤ;->ۡۢ۠ۧ()[I

    move-result-object v2

    aget v3, v2, v0

    const/16 v2, 0x6cc

    :goto_2
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_2

    :sswitch_5
    if-ne v3, p0, :cond_1

    const/16 v2, 0x729

    goto :goto_2

    :cond_1
    :sswitch_6
    const/16 v2, 0x70a

    goto :goto_2

    :sswitch_7
    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟۟۠۟ۦ()[Ljava/lang/String;

    move-result-object v1

    aget-object v0, v1, v0

    goto :goto_1

    :sswitch_8
    sget v2, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣ۠ۧ:I

    xor-int/lit16 v2, v2, -0x1eb

    add-int/2addr v0, v2

    const/16 v2, 0x748

    :goto_3
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_3

    :sswitch_9
    const v2, 0xbe22

    goto :goto_3

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x31 -> :sswitch_2
        0xcc -> :sswitch_3
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_6
        0x1d7 -> :sswitch_8
        0x1f4 -> :sswitch_7
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_9
        0xb97b -> :sswitch_0
    .end sparse-switch
.end method

.method public static getDoubleClickAction(I)I
    .locals 9

    const/4 v7, 0x0

    const/4 v1, 0x0

    const-string v5, "\u06e4\u06e8\u06e3"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move v6, v7

    move v8, v7

    :goto_0
    invoke-static {v5}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    xor-int/lit16 v6, v8, -0x211

    const-string v1, "\u06e7\u06e8\u06df"

    move-object v5, v1

    goto :goto_0

    :sswitch_0
    const/16 v1, 0x38

    const/16 v4, 0x922

    invoke-static {v2, v1, v6, v4}, Landroidx/loader/ۡۢۢ;->ۡ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v5, "\u06e0\u06e4\u06e8"

    move-object v4, v1

    goto :goto_0

    :sswitch_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\u06e5\u06e6\u06e8"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    invoke-static {v0, p0}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, "\u06e8\u06e8\u06e7"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    sget v8, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    const-string v1, "\u06e3\u06e5\u06e0"

    move-object v5, v1

    goto :goto_0

    :sswitch_4
    invoke-static {}, Lkevin/fun/hook/gesture/GestureConfig;->ۣ۠۠ۢ()[S

    move-result-object v1

    const-string v5, "\u06e6\u06e6\u06e6"

    move-object v2, v1

    goto :goto_0

    :sswitch_5
    invoke-static {v3}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v5, "\u06e2\u06df\u06e2"

    move-object v4, v1

    goto :goto_0

    :sswitch_6
    invoke-static {v3, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\u06e1\u06e1\u06e1"

    move-object v5, v1

    goto :goto_0

    :sswitch_7
    invoke-static {v4, v7}, Landroidx/activity/ۤۧۧۧ;->۟ۥۣ۟ۢ(Ljava/lang/Object;I)I

    move-result v8

    const-string v1, "\u06e1\u06e4\u06e0"

    move-object v5, v1

    goto :goto_0

    :sswitch_8
    return v8

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aab64 -> :sswitch_6
        0x1aaec1 -> :sswitch_2
        0x1aaf1d -> :sswitch_8
        0x1ab245 -> :sswitch_7
        0x1abadf -> :sswitch_1
        0x1abe67 -> :sswitch_4
        0x1ac226 -> :sswitch_3
        0x1ac61e -> :sswitch_0
        0x1ac9e7 -> :sswitch_5
    .end sparse-switch
.end method

.method public static getLongPressAction(I)I
    .locals 9

    const/4 v7, 0x0

    const/4 v1, 0x0

    const-string v5, "\u06e1\u06e1\u06e4"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move v6, v7

    move v8, v7

    :goto_0
    invoke-static {v5}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {v3, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\u06e8\u06e0"

    move-object v5, v1

    goto :goto_0

    :sswitch_0
    invoke-static {v4, v7}, Landroidx/activity/ۤۧۧۧ;->۟ۥۣ۟ۢ(Ljava/lang/Object;I)I

    move-result v8

    const-string v1, "\u06e5\u06e2\u06e4"

    move-object v5, v1

    goto :goto_0

    :sswitch_1
    invoke-static {}, Lkevin/fun/hook/gesture/GestureConfig;->ۣ۠۠ۢ()[S

    move-result-object v1

    const-string v5, "\u06df\u06e5\u06e4"

    move-object v2, v1

    goto :goto_0

    :sswitch_2
    sget v8, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۡۦۥۨ:I

    const-string v1, "\u06e7\u06e6\u06e6"

    move-object v5, v1

    goto :goto_0

    :sswitch_3
    invoke-static {v0, p0}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, "\u06e6\u06e3\u06e3"

    move-object v3, v1

    goto :goto_0

    :sswitch_4
    const/16 v1, 0x47

    const/16 v4, 0x449

    invoke-static {v2, v1, v6, v4}, Landroidx/activity/ۦۧۥۥ;->۟ۤۡۦۦ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v5, "\u06e2\u06df\u06e7"

    move-object v4, v1

    goto :goto_0

    :sswitch_5
    invoke-static {v3}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v5, "\u06e5\u06e1\u06e4"

    move-object v4, v1

    goto :goto_0

    :sswitch_6
    xor-int/lit16 v6, v8, 0x113

    const-string v1, "\u06e3\u06e5\u06e3"

    move-object v5, v1

    goto :goto_0

    :sswitch_7
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\u06e8\u06e0\u06e1"

    move-object v3, v1

    goto :goto_0

    :sswitch_8
    return v8

    nop

    :sswitch_data_0
    .sparse-switch
        0xdcf8 -> :sswitch_3
        0x1aa7be -> :sswitch_2
        0x1aaec4 -> :sswitch_7
        0x1ab6c1 -> :sswitch_4
        0x1abdc8 -> :sswitch_0
        0x1abde7 -> :sswitch_8
        0x1ac1c6 -> :sswitch_5
        0x1ac5e7 -> :sswitch_6
        0x1ac8e9 -> :sswitch_1
    .end sparse-switch
.end method

.method public static isDisableDoubleClickLike()Z
    .locals 8

    const/4 v1, 0x0

    const/4 v5, 0x0

    const-string v3, "\u06e0\u06e8\u06e2"

    move-object v0, v1

    move-object v2, v1

    move v4, v5

    move v6, v5

    move v7, v5

    :goto_0
    invoke-static {v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Lkevin/fun/hook/gesture/GestureConfig;->ۣ۠۠ۢ()[S

    move-result-object v1

    const-string v3, "\u06e5\u06e6\u06e3"

    move-object v2, v1

    goto :goto_0

    :sswitch_0
    invoke-static {v0, v5}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۥۣۤۧ(Ljava/lang/Object;Z)Z

    move-result v4

    const-string v1, "\u06e1\u06e1\u06e1"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    sget v7, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    const-string v1, "\u06df\u06e8\u06e0"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    xor-int/lit16 v6, v7, 0x399

    const-string v1, "\u06e7\u06e0\u06e0"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    const/16 v0, 0x54

    const/16 v1, 0xbfb

    invoke-static {v2, v0, v6, v1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧ۠ۥ۟([SIII)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e2\u06e0\u06e8"

    move-object v3, v1

    goto :goto_0

    :sswitch_4
    return v4

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa817 -> :sswitch_2
        0x1aaec1 -> :sswitch_4
        0x1ab26a -> :sswitch_0
        0x1abe62 -> :sswitch_1
        0x1ac527 -> :sswitch_3
    .end sparse-switch
.end method

.method public static isDisableLongPressMenu()Z
    .locals 8

    const/4 v1, 0x0

    const/4 v5, 0x0

    const-string v3, "\u06e1\u06e1\u06e7"

    move-object v0, v1

    move-object v2, v1

    move v4, v5

    move v6, v5

    move v7, v5

    :goto_0
    invoke-static {v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    xor-int/lit16 v7, v6, 0xea

    const-string v1, "\u06e2\u06e2\u06e2"

    move-object v3, v1

    goto :goto_0

    :sswitch_0
    invoke-static {v0, v5}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۥۣۤۧ(Ljava/lang/Object;Z)Z

    move-result v4

    const-string v1, "\u06e4\u06e5\u06e8"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    const/16 v0, 0x6f

    const/16 v1, 0x601

    invoke-static {v2, v0, v7, v1}, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۥۧۤ([SIII)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e5\u06e0\u06e4"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    sget v6, Landroidx/customview/ۡۤۡۤ;->۟ۦ۟ۨۨ:I

    const-string v1, "\u06e0\u06e8\u06e1"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    invoke-static {}, Lkevin/fun/hook/gesture/GestureConfig;->ۣ۠۠ۢ()[S

    move-result-object v1

    const-string v3, "\u06df\u06e2\u06e3"

    move-object v2, v1

    goto :goto_0

    :sswitch_4
    return v4

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa760 -> :sswitch_2
        0x1aaec7 -> :sswitch_3
        0x1ab2a2 -> :sswitch_1
        0x1aba87 -> :sswitch_4
        0x1abda9 -> :sswitch_0
    .end sparse-switch
.end method

.method public static isEnabled(Landroid/content/Context;)Z
    .locals 8

    const/4 v1, 0x0

    const/4 v4, 0x0

    const-string v7, "\u06e8\u06e4\u06df"

    move-object v0, v1

    move-object v2, v1

    move v3, v4

    move v5, v4

    move v6, v4

    :goto_0
    invoke-static {v7}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    const/16 v1, 0x88

    const/16 v2, 0x63c

    invoke-static {v0, v1, v5, v2}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۦۣۣۦ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e8\u06e4\u06e3"

    move-object v2, v1

    goto :goto_0

    :sswitch_0
    sget v1, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    const-string v7, "\u06e1\u06e0\u06e3"

    move v6, v1

    goto :goto_0

    :sswitch_1
    invoke-static {}, Lkevin/fun/hook/gesture/GestureConfig;->ۣ۠۠ۢ()[S

    move-result-object v0

    const-string v1, "\u06e5\u06e8\u06e2"

    move-object v7, v1

    goto :goto_0

    :sswitch_2
    invoke-static {v2, v4}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۥۣۤۧ(Ljava/lang/Object;Z)Z

    move-result v1

    const-string v7, "\u06e3\u06e4\u06e5"

    move v3, v1

    goto :goto_0

    :sswitch_3
    xor-int/lit16 v1, v6, -0x166

    const-string v7, "\u06e3\u06e0\u06e6"

    move v5, v1

    goto :goto_0

    :sswitch_4
    return v3

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aaea4 -> :sswitch_3
        0x1ab6a4 -> :sswitch_4
        0x1abe9f -> :sswitch_0
        0x1ac963 -> :sswitch_1
        0x1ac967 -> :sswitch_2
    .end sparse-switch
.end method

.method public static setDisableDoubleClickLike(Z)V
    .locals 7

    const/4 v1, 0x0

    const/4 v5, 0x0

    const-string v3, "\u06e3\u06e7\u06e2"

    move-object v0, v1

    move-object v2, v1

    move v4, v5

    move v6, v5

    :goto_0
    invoke-static {v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Lkevin/fun/hook/gesture/GestureConfig;->ۣ۠۠ۢ()[S

    move-result-object v1

    const-string v3, "\u06e6\u06e3\u06e0"

    move-object v2, v1

    goto :goto_0

    :sswitch_0
    const/16 v0, 0x97

    const/16 v1, 0x199

    invoke-static {v2, v0, v4, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->ۤ۠ۤ۠([SIII)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e2\u06e3\u06e4"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    sget v5, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    const-string v1, "\u06e6\u06e0\u06e0"

    move-object v3, v1

    move v6, v5

    goto :goto_0

    :sswitch_2
    invoke-static {v0, p0}, Landroidx/interpolator/ۣ۟ۤۢۧ;->۟ۥۥۥۤ(Ljava/lang/Object;Z)V

    const-string v1, "\u06e6\u06e3\u06e4"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    xor-int/lit16 v4, v6, 0x304

    const-string v1, "\u06e5\u06e5\u06df"

    move-object v3, v1

    goto :goto_0

    :sswitch_4
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1ab2c3 -> :sswitch_2
        0x1abe3f -> :sswitch_0
        0x1ac166 -> :sswitch_3
        0x1ac1c3 -> :sswitch_1
        0x1ac1c7 -> :sswitch_4
    .end sparse-switch
.end method

.method public static setDisableLongPressMenu(Z)V
    .locals 4

    invoke-static {}, Lkevin/fun/hook/gesture/GestureConfig;->ۣ۠۠ۢ()[S

    move-result-object v0

    const/16 v1, 0xb2

    sget v2, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    xor-int/lit16 v2, v2, 0xda

    const/16 v3, 0x6a8

    invoke-static {v0, v1, v2, v3}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣ۟۠ۢۡ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Landroidx/interpolator/ۣ۟ۤۢۧ;->۟ۥۥۥۤ(Ljava/lang/Object;Z)V

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "0LdY"

    invoke-static {v0}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۡۢۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

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

.method public static setDoubleClickAction(II)V
    .locals 9

    const/4 v7, 0x0

    const/4 v1, 0x0

    const-string v5, "\u06e8\u06df\u06e4"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move v6, v7

    move v8, v7

    :goto_0
    invoke-static {v5}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Lkevin/fun/hook/gesture/GestureConfig;->ۣ۠۠ۢ()[S

    move-result-object v1

    const-string v5, "\u06e8\u06e3\u06e8"

    move-object v2, v1

    goto :goto_0

    :sswitch_0
    const/16 v1, 0xcb

    const/16 v4, 0x184

    invoke-static {v2, v1, v8, v4}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v5, "\u06e8\u06e5\u06e3"

    move-object v4, v1

    goto :goto_0

    :sswitch_1
    invoke-static {v3}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v5, "\u06e1\u06e3\u06e2"

    move-object v4, v1

    goto :goto_0

    :sswitch_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\u06e4\u06e5\u06df"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    sget v6, Landroidx/appcompat/ۣۧۤۢ;->۟۠ۡۤۤ:I

    const-string v1, "\u06e5\u06e2"

    move-object v5, v1

    goto :goto_0

    :sswitch_4
    invoke-static {v4, p1}, Landroidx/core/ۧ۟ۤۨ;->ۥۧۤ(Ljava/lang/Object;I)V

    const-string v1, "\u06e4\u06e5\u06e2"

    move-object v5, v1

    goto :goto_0

    :sswitch_5
    invoke-static {v3, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\u06df\u06e8\u06df"

    move-object v5, v1

    goto :goto_0

    :sswitch_6
    invoke-static {v0, p0}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, "\u06df\u06e3\u06e0"

    move-object v3, v1

    goto :goto_0

    :sswitch_7
    xor-int/lit16 v7, v6, -0xe4

    const-string v1, "\u06e4\u06e7\u06df"

    move-object v5, v1

    move v8, v7

    goto :goto_0

    :sswitch_8
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc9d -> :sswitch_7
        0x1aa77c -> :sswitch_1
        0x1aa816 -> :sswitch_6
        0x1aaf00 -> :sswitch_4
        0x1aba81 -> :sswitch_8
        0x1ababc -> :sswitch_0
        0x1ac8cd -> :sswitch_2
        0x1ac94d -> :sswitch_3
        0x1ac986 -> :sswitch_5
    .end sparse-switch
.end method

.method public static setEnabled(Z)V
    .locals 4

    invoke-static {}, Lkevin/fun/hook/gesture/GestureConfig;->ۣ۠۠ۢ()[S

    move-result-object v0

    const/16 v1, 0xda

    sget v2, Landroidx/startup/۟ۦۤۨۧ;->ۧۡۡۦ:I

    xor-int/lit16 v2, v2, -0x11b

    const/16 v3, 0xb96

    invoke-static {v0, v1, v2, v3}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۦۥۢ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Landroidx/interpolator/ۣ۟ۤۢۧ;->۟ۥۥۥۤ(Ljava/lang/Object;Z)V

    invoke-static {}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۦۣۡۡ()I

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
    const-string v0, "Clg8S0mmIhJt9OoZbMBd"

    invoke-static {v0}, Landroidx/loader/۟۠ۢۧۡ;->ۨۧۦۧ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static setLongPressAction(II)V
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/gesture/GestureConfig;->ۣ۠۠ۢ()[S

    move-result-object v1

    const/16 v2, 0xe9

    sget v3, Lorg/luckypray/dexkit/۠۠ۥ;->ۣ۟ۡۢۡ:I

    xor-int/lit16 v3, v3, -0xf0

    const/16 v4, 0x9c2

    invoke-static {v1, v2, v3, v4}, Landroidx/startup/ۤۧۥۣ;->۟ۧۦ۠ۦ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0, p0}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Landroidx/core/ۧ۟ۤۨ;->ۥۧۤ(Ljava/lang/Object;I)V

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "hDtazws"

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۤۡۥۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣ۠۠ۢ()[S
    .locals 2

    invoke-static {}, Landroidx/loader/ۣۦ۟ۡ;->۟ۦ۠ۨ()I

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
    sget-object v0, Lkevin/fun/hook/gesture/GestureConfig;->short:[S

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
