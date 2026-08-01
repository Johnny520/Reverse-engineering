.class public Lkevin/fun/hook/OriginalVideoParser;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkevin/fun/hook/OriginalVideoParser$ParseCallback;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String;

.field private static final short:[S


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/16 v0, 0x1bc

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/OriginalVideoParser;->short:[S

    invoke-static {}, Lkevin/fun/hook/OriginalVideoParser;->ۤۥۣ()[S

    move-result-object v0

    const/4 v1, 0x0

    sget v2, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    xor-int/lit16 v2, v2, 0x17e

    const/16 v3, 0x84e

    invoke-static {v0, v1, v2, v3}, Landroidx/activity/ۣۦۡۥ;->۟ۡۨ۟۟([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/OriginalVideoParser;->TAG:Ljava/lang/String;

    return-void

    nop

    :array_0
    .array-data 2
        0x385es
        0x805s
        0x82bs
        0x838s
        0x827s
        0x820s
        0x385fs
        0x218s
        0x21as
        0x20bs
        0x7f5s
        0x7d3s
        0x7c5s
        0x7d2s
        0x78ds
        0x7e1s
        0x7c7s
        0x7c5s
        0x7ces
        0x7d4s
        0xb7ds
        0xb5fs
        0xb4as
        0xb59s
        0xb5cs
        0xb5cs
        0xb51s
        0xb1fs
        0xb05s
        0xb1es
        0xb00s
        0xb10s
        0xb18s
        0xb59s
        0xb60s
        0xb58s
        0xb5fs
        0xb5es
        0xb55s
        0xb0bs
        0xb10s
        0xb73s
        0xb60s
        0xb65s
        0xb10s
        0xb59s
        0xb60s
        0xb58s
        0xb5fs
        0xb5es
        0xb55s
        0xb10s
        0xb7fs
        0xb63s
        0xb10s
        0xb01s
        0xb06s
        0xb6fs
        0xb00s
        0xb10s
        0xb5cs
        0xb59s
        0xb5bs
        0xb55s
        0xb10s
        0xb7ds
        0xb51s
        0xb53s
        0xb10s
        0xb7fs
        0xb63s
        0xb10s
        0xb68s
        0xb19s
        0xb10s
        0xb71s
        0xb40s
        0xb40s
        0xb5cs
        0xb55s
        0xb67s
        0xb55s
        0xb52s
        0xb7bs
        0xb59s
        0xb44s
        0xb1fs
        0xb06s
        0xb00s
        0xb05s
        0xb1es
        0xb01s
        0xb1es
        0xb01s
        0xb05s
        0xb10s
        0xb18s
        0xb7bs
        0xb78s
        0xb64s
        0xb7ds
        0xb7cs
        0xb1cs
        0xb10s
        0xb5cs
        0xb59s
        0xb5bs
        0xb55s
        0xb10s
        0xb77s
        0xb55s
        0xb53s
        0xb5bs
        0xb5fs
        0xb19s
        0xb10s
        0xb66s
        0xb55s
        0xb42s
        0xb43s
        0xb59s
        0xb5fs
        0xb5es
        0xb1fs
        0xb01s
        0xb06s
        0xb1es
        0xb00s
        0xb10s
        0xb7ds
        0xb5fs
        0xb52s
        0xb59s
        0xb5cs
        0xb55s
        0xb1fs
        0xb01s
        0xb05s
        0xb75s
        0xb01s
        0xb04s
        0xb08s
        0xb10s
        0xb63s
        0xb51s
        0xb56s
        0xb51s
        0xb42s
        0xb59s
        0xb1fs
        0xb06s
        0xb00s
        0xb04s
        0xb1es
        0xb01s
        0x74es
        0x752s
        0x752s
        0x756s
        0x53cbs
        0x5992s
        -0x6de1s
        -0x7317s
        0x73cs
        0x726s
        0x297s
        0x296s
        0x284s
        0x2efs
        0x2fas
        0x961s
        0x933s
        0x92fs
        0x922s
        0x93as
        0x91cs
        0x922s
        0x927s
        0x927s
        0x931s
        0x961s
        0x91fs
        0x930s
        0x969s
        0x979s
        0x91fs
        0x930s
        0x969s
        0x91fs
        0x938s
        0x91fs
        0x930s
        0x969s
        0x961s
        0x936s
        0x931s
        0x92as
        0x961s
        0x91fs
        0x930s
        0x969s
        0x979s
        0x91fs
        0x930s
        0x969s
        0x961s
        0x96bs
        0x918s
        0x91ds
        0x961s
        0x91es
        0x968s
        0x96as
        0x961s
        0x9dds
        0x989s
        0x996s
        0x99bs
        0x99as
        0x990s
        0x9a0s
        0x996s
        0x99bs
        0x9dds
        0x9a3s
        0x98cs
        0x9d5s
        0x9c5s
        0x9a3s
        0x98cs
        0x9d5s
        0x9dds
        0x9d7s
        0x9a4s
        0x9a1s
        0x9dds
        0x9a2s
        0x9d4s
        0x9d6s
        0x9dds
        0xa68s
        0xa2bs
        0xa3ds
        0xa2fs
        0xa27s
        0xa2fs
        0xa15s
        0xa23s
        0xa2es
        0xa68s
        0xa16s
        0xa39s
        0xa60s
        0xa70s
        0xa16s
        0xa39s
        0xa60s
        0xa68s
        0xa62s
        0xa11s
        0xa14s
        0xa68s
        0xa17s
        0xa61s
        0xa63s
        0xa68s
        0x97bs
        0x967s
        0x967s
        0x963s
        0x960s
        0x929s
        0x93cs
        0x93cs
        0x964s
        0x964s
        0x964s
        0x93ds
        0x97as
        0x976s
        0x960s
        0x977s
        0x97cs
        0x966s
        0x96as
        0x97as
        0x97ds
        0x93ds
        0x970s
        0x97cs
        0x97es
        0x93cs
        0x972s
        0x964s
        0x976s
        0x97es
        0x976s
        0x93cs
        0x965s
        0x922s
        0x93cs
        0x963s
        0x97fs
        0x972s
        0x96as
        0x93cs
        0x92cs
        0x965s
        0x97as
        0x977s
        0x976s
        0x97cs
        0x94cs
        0x97as
        0x977s
        0x92es
        0x159s
        0x10ds
        0x11es
        0x10bs
        0x116s
        0x110s
        0x142s
        0x11bs
        0x11as
        0x119s
        0x11es
        0x10as
        0x113s
        0x10bs
        0x159s
        0x113s
        0x116s
        0x111s
        0x11as
        0x142s
        0x14fs
        0x159s
        0x116s
        0x10cs
        0x120s
        0x10fs
        0x113s
        0x11es
        0x106s
        0x120s
        0x10as
        0x10ds
        0x113s
        0x142s
        0x14es
        0x159s
        0x108s
        0x11es
        0x10bs
        0x11as
        0x10ds
        0x112s
        0x11es
        0x10ds
        0x114s
        0x142s
        0x14fs
        0x159s
        0x10cs
        0x110s
        0x10as
        0x10ds
        0x11cs
        0x11as
        0x142s
        0x12fs
        0x11es
        0x11cs
        0x114s
        0x12cs
        0x110s
        0x10as
        0x10ds
        0x11cs
        0x11as
        0x13as
        0x111s
        0x10as
        0x112s
        0x120s
        0x12fs
        0x12as
        0x13ds
        0x133s
        0x136s
        0x12cs
        0x137s
        0x3736s
        0x76ds
        0x743s
        0x750s
        0x74fs
        0x748s
        0x3737s
        0x600cs
        0x6558s
        0x5516s
        -0x7120s
        -0x6049s
        0x773s
        0x774s
        0x76fs
        0x6d9ds
        0x68c9s
        0x5887s
        -0x7c8fs
        -0x6ddas
        -0x61b7s
        0x6912s
        0x6b3s
        0x3552s
        0x509s
        0x527s
        0x534s
        0x52bs
        0x52cs
        0x3553s
        -0x714bs
        0x6900s
        0x6754s
        -0x735fs
        0x62d2s
        0x5c73s
        -0x7799s
        0x578s
        0x562s
        -0x7520s
        0x6493s
        0x5c01s
        0x5d3bs
        0x339s
        0x323s
        0x5156s
        0x4dfbs
        -0x6852s
        0x60f5s
        0x4d6as
        0x792as
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    const-string v0, "VBTOGIqMxZfxOKfOIDxXqKG"

    invoke-static {v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟ۡۨۢۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

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

.method static synthetic lambda$0(Ljava/lang/String;Lkevin/fun/hook/OriginalVideoParser$ParseCallback;)V
    .locals 9

    const/4 v1, 0x0

    :try_start_0
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۡۨۢ(Ljava/lang/Object;)Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    sget v2, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    xor-int/lit16 v2, v2, 0x391a

    invoke-static {v0, v2}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۧ۟ۦۥ(Ljava/lang/Object;I)V

    invoke-static {v0, v2}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣ۟۟ۦ(Ljava/lang/Object;I)V

    invoke-static {}, Lkevin/fun/hook/OriginalVideoParser;->ۤۥۣ()[S

    move-result-object v2

    const/4 v3, 0x7

    sget v4, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    xor-int/lit16 v4, v4, -0x1ad

    const/16 v5, 0x25f

    invoke-static {v2, v3, v4, v5}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۦۣۣۦ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۤ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/OriginalVideoParser;->ۤۥۣ()[S

    move-result-object v2

    const/16 v3, 0xa

    sget v4, Landroidx/appcompat/ۣۧۤۢ;->۟۠ۡۤۤ:I

    xor-int/lit16 v4, v4, -0xe7

    const/16 v5, 0x7a0

    invoke-static {v2, v3, v4, v5}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۨۦۣۨ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/OriginalVideoParser;->ۤۥۣ()[S

    move-result-object v3

    const/16 v4, 0x14

    sget v5, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    xor-int/lit16 v5, v5, 0x2e0

    const/16 v6, 0xb30

    invoke-static {v3, v4, v5, v6}, Landroidx/customview/ۤۡۥ;->۟ۢۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v2, v3}, Landroidx/activity/ۤۧۧۧ;->ۣ۠ۧۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Landroidx/loader/ۣ۟۟ۧ۠;->۟ۤ(Ljava/lang/Object;)I

    move-result v3

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    const/16 v2, 0xc8

    if-eq v3, v2, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/OriginalVideoParser;->ۤۥۣ()[S

    move-result-object v4

    const/16 v5, 0x9b

    sget v6, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۣۧۢ:I

    xor-int/lit16 v6, v6, -0x3cd

    const/16 v7, 0x706

    invoke-static {v4, v5, v6, v7}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۢۧۢ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v3}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Landroidx/startup/۟ۦۤۨۧ;->۟ۤۡۡ۟(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_5
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v1, 0x70a

    goto :goto_1

    :sswitch_4
    const/4 v1, 0x0

    :try_start_2
    invoke-static {v1}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۨ۠ۦ۟(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_5
    const v1, 0xbe22

    goto :goto_2

    :catch_0
    move-exception v1

    :sswitch_6
    const v1, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :cond_1
    :sswitch_7
    const v1, 0xbebd

    goto :goto_3

    :sswitch_8
    if-eqz v0, :cond_1

    const v1, 0xbedc

    goto :goto_3

    :sswitch_9
    invoke-static {v0}, Landroidx/emoji2/ۢۧۡۧ;->ۢۤۤۡ(Ljava/lang/Object;)V

    :goto_4
    :sswitch_a
    return-void

    :sswitch_b
    :try_start_3
    new-instance v3, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/InputStreamReader;

    invoke-static {v0}, Landroidx/customview/ۤۡۥ;->۠ۢ۠۟(Ljava/lang/Object;)Ljava/io/InputStream;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/OriginalVideoParser;->ۤۥۣ()[S

    move-result-object v5

    const/16 v6, 0xa5

    sget v7, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    xor-int/lit8 v7, v7, -0x68

    const/16 v8, 0x2c2

    invoke-static {v5, v6, v7, v8}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۢۤۤ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v4, v5}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    invoke-direct {v3, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_5
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    :sswitch_c
    invoke-static {v3}, Landroidx/loader/ۥۧۨۤ;->ۦۥۢ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const v2, 0xbefb

    :goto_5
    const v6, 0xbf0c

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_4

    goto :goto_5

    :cond_2
    :sswitch_d
    const v2, 0xbf39

    goto :goto_5

    :sswitch_e
    if-nez v5, :cond_2

    const v2, 0xc1e3

    goto :goto_5

    :sswitch_f
    invoke-static {v4}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/OriginalVideoParser;->ۤۥۣ()[S

    move-result-object v2

    const/16 v5, 0xaa

    sget v6, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    xor-int/lit16 v6, v6, 0x24b

    const/16 v7, 0x943

    invoke-static {v2, v5, v6, v7}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠۠ۧۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۦ۠۠۟(Ljava/lang/Object;)Ljava/util/regex/Pattern;

    move-result-object v2

    invoke-static {v2, v4}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۦۢۡۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/regex/Matcher;

    move-result-object v5

    invoke-static {v5}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۡ۠ۤۧ(Ljava/lang/Object;)Z

    move-result v6

    const v2, 0xc202

    :goto_6
    const v7, 0xc213

    xor-int/2addr v2, v7

    sparse-switch v2, :sswitch_data_5

    goto :goto_6

    :sswitch_10
    if-eqz v6, :cond_3

    const v2, 0xc25f

    goto :goto_6

    :cond_3
    :sswitch_11
    const v2, 0xc240

    goto :goto_6

    :sswitch_12
    const/4 v1, 0x1

    invoke-static {v5, v1}, Landroidx/emoji2/ۢۧۡۧ;->۟ۤۤۧۢ(Ljava/lang/Object;I)Ljava/lang/String;

    move-result-object v1

    :sswitch_13
    const v2, 0xc27e

    :goto_7
    const v5, 0xc28f

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_6

    goto :goto_7

    :cond_4
    :sswitch_14
    const v2, 0xc2bc

    goto :goto_7

    :sswitch_15
    if-nez v1, :cond_4

    const v2, 0xc2db

    goto :goto_7

    :sswitch_16
    invoke-static {}, Lkevin/fun/hook/OriginalVideoParser;->ۤۥۣ()[S

    move-result-object v2

    const/16 v5, 0xd6

    sget v6, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    xor-int/lit16 v6, v6, -0x113

    const/16 v7, 0x9ff

    invoke-static {v2, v5, v6, v7}, Landroidx/customview/ۤۡۥ;->۟ۢۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۦ۠۠۟(Ljava/lang/Object;)Ljava/util/regex/Pattern;

    move-result-object v2

    invoke-static {v2, v4}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۦۢۡۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/regex/Matcher;

    move-result-object v5

    invoke-static {v5}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۡ۠ۤۧ(Ljava/lang/Object;)Z

    move-result v6

    const v2, 0xc2fa

    :goto_8
    const v7, 0xc30b

    xor-int/2addr v2, v7

    sparse-switch v2, :sswitch_data_7

    goto :goto_8

    :sswitch_17
    if-eqz v6, :cond_5

    const v2, 0xc5e2

    goto :goto_8

    :cond_5
    :sswitch_18
    const v2, 0xc5c3

    goto :goto_8

    :sswitch_19
    const/4 v1, 0x1

    invoke-static {v5, v1}, Landroidx/emoji2/ۢۧۡۧ;->۟ۤۤۧۢ(Ljava/lang/Object;I)Ljava/lang/String;

    move-result-object v1

    :sswitch_1a
    const v2, 0xc601

    :goto_9
    const v5, 0xc612

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_8

    goto :goto_9

    :sswitch_1b
    if-nez v1, :cond_6

    const v2, 0xc65e

    goto :goto_9

    :cond_6
    :sswitch_1c
    const v2, 0xc63f

    goto :goto_9

    :sswitch_1d
    invoke-static {}, Lkevin/fun/hook/OriginalVideoParser;->ۤۥۣ()[S

    move-result-object v2

    const/16 v5, 0xf0

    sget v6, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/lit8 v6, v6, 0x53

    const/16 v7, 0xa4a

    invoke-static {v2, v5, v6, v7}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۧۨۦۦ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۦ۠۠۟(Ljava/lang/Object;)Ljava/util/regex/Pattern;

    move-result-object v2

    invoke-static {v2, v4}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۦۢۡۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/regex/Matcher;

    move-result-object v4

    invoke-static {v4}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۡ۠ۤۧ(Ljava/lang/Object;)Z

    move-result v5

    const v2, 0xc67d

    :goto_a
    const v6, 0xc68e

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_9

    goto :goto_a

    :cond_7
    :sswitch_1e
    const v2, 0xc6bb

    goto :goto_a

    :sswitch_1f
    if-eqz v5, :cond_7

    const v2, 0xc965

    goto :goto_a

    :sswitch_20
    const/4 v1, 0x1

    invoke-static {v4, v1}, Landroidx/emoji2/ۢۧۡۧ;->۟ۤۤۧۢ(Ljava/lang/Object;I)Ljava/lang/String;

    move-result-object v1

    :sswitch_21
    const v2, 0xc984

    :goto_b
    const v4, 0xc995

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_a

    goto :goto_b

    :sswitch_22
    if-eqz v1, :cond_8

    const v2, 0xc9e1

    goto :goto_b

    :cond_8
    :sswitch_23
    const v2, 0xc9c2

    goto :goto_b

    :sswitch_24
    invoke-static {v1}, Landroidx/activity/ۨ۠۟ۧ;->۟ۧ۟ۡ۠(Ljava/lang/Object;)Z

    move-result v4

    const v2, 0xca00

    :goto_c
    const v5, 0xca11

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_b

    goto :goto_c

    :cond_9
    :sswitch_25
    const v2, 0xca3e

    goto :goto_c

    :sswitch_26
    if-nez v4, :cond_9

    const v2, 0xca5d

    goto :goto_c

    :sswitch_27
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/OriginalVideoParser;->ۤۥۣ()[S

    move-result-object v4

    const/16 v5, 0x10a

    sget v6, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v6, v6, 0x114

    const/16 v7, 0x913

    invoke-static {v4, v5, v6, v7}, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۥۧۤ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/OriginalVideoParser;->ۤۥۣ()[S

    move-result-object v2

    const/16 v4, 0x13c

    sget v5, Landroidx/startup/۟ۦۤۨۧ;->ۧۡۡۦ:I

    xor-int/lit16 v5, v5, -0x159

    const/16 v6, 0x17f

    invoke-static {v2, v4, v5, v6}, Landroidx/activity/ۣۦۡۥ;->۟ۡۨ۟۟([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣ۟۟۟(Ljava/lang/Object;Ljava/lang/Object;)V

    const v1, 0xca7c

    :goto_d
    const v2, 0xca8d

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_c

    goto :goto_d

    :sswitch_28
    const v1, 0xcd26

    goto :goto_d

    :sswitch_29
    invoke-static {}, Lkevin/fun/hook/OriginalVideoParser;->ۤۥۣ()[S

    move-result-object v1

    const/16 v2, 0x189

    sget v4, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    xor-int/lit16 v4, v4, 0x268

    const/16 v5, 0x726

    invoke-static {v1, v2, v4, v5}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۧۡۥۡ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/OriginalVideoParser;->ۧۨۢۢ(Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/OriginalVideoParser;->ۤۥۣ()[S

    move-result-object v1

    const/16 v2, 0x198

    sget v4, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    xor-int/lit16 v4, v4, 0x229

    const/16 v5, 0xab7

    invoke-static {v1, v2, v4, v5}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۨۦۣۨ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Landroidx/startup/۟ۦۤۨۧ;->۟ۤۡۡ۟(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_6
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :sswitch_2a
    :try_start_5
    invoke-static {v3}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۨ۠ۦ۟(Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    const v1, 0xcd83

    :goto_e
    const v2, 0xcd94

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_d

    goto :goto_e

    :sswitch_2b
    const v1, 0xcda2

    goto :goto_e

    :catch_1
    move-exception v1

    :sswitch_2c
    const v1, 0xcdff

    :goto_f
    const v2, 0xce10

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_e

    goto :goto_f

    :cond_a
    :sswitch_2d
    const v1, 0xce3d

    goto :goto_f

    :sswitch_2e
    if-eqz v0, :cond_a

    const v1, 0xd0e7

    goto :goto_f

    :sswitch_2f
    const v1, 0xd106

    :goto_10
    const v2, 0xd117

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_f

    goto :goto_10

    :sswitch_30
    const v1, 0xd125

    goto :goto_10

    :sswitch_31
    :try_start_6
    invoke-static {v4, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/OriginalVideoParser;->ۤۥۣ()[S

    move-result-object v5

    const/16 v6, 0x19f

    const/4 v7, 0x1

    const/16 v8, 0x6b9

    invoke-static {v5, v6, v7, v8}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۧۢۨۡ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    const v2, 0xd182

    :goto_11
    const v5, 0xd193

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_10

    goto :goto_11

    :sswitch_32
    const v2, 0xd1a1

    goto :goto_11

    :catchall_0
    move-exception v0

    move-object v2, v0

    move-object v3, v1

    move-object v4, v1

    :goto_12
    const v0, 0xd1fe

    :goto_13
    const v1, 0xd20f

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_11

    goto :goto_13

    :sswitch_33
    const v0, 0xd4a8

    goto :goto_13

    :catch_2
    move-exception v2

    move-object v3, v1

    move-object v0, v1

    :goto_14
    :try_start_7
    invoke-static {v2}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۤ۟۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/OriginalVideoParser;->ۤۥۣ()[S

    move-result-object v5

    const/16 v6, 0x1a0

    sget v7, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    xor-int/lit16 v7, v7, -0x333

    const/16 v8, 0x542

    invoke-static {v5, v6, v7, v8}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣۣ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {v4, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/OriginalVideoParser;->ۧۨۢۢ(Ljava/lang/Object;)V

    invoke-static {v2}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۤ۟۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/OriginalVideoParser;->ۤۥۣ()[S

    move-result-object v4

    const/16 v5, 0x1b0

    sget v6, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    xor-int/lit16 v6, v6, 0x384

    const/16 v7, 0x303

    invoke-static {v4, v5, v6, v7}, Landroidx/activity/ۤۧۧۧ;->ۣ۟۟۠ۡ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Landroidx/startup/۟ۦۤۨۧ;->۟ۤۡۡ۟(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    const v1, 0xd505

    :goto_15
    const v2, 0xd516

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_12

    goto :goto_15

    :sswitch_34
    if-eqz v3, :cond_b

    const v1, 0xd562

    goto :goto_15

    :cond_b
    :sswitch_35
    const v1, 0xd543

    goto :goto_15

    :sswitch_36
    :try_start_8
    invoke-static {v3}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۨ۠ۦ۟(Ljava/lang/Object;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3

    const v1, 0xd581

    :goto_16
    const v2, 0xd592

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_13

    goto :goto_16

    :sswitch_37
    const v1, 0xd5a0

    goto :goto_16

    :catch_3
    move-exception v1

    :sswitch_38
    const v1, 0xd888

    :goto_17
    const v2, 0xd899

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_14

    goto :goto_17

    :sswitch_39
    if-eqz v0, :cond_c

    const v1, 0xd8e5

    goto :goto_17

    :cond_c
    :sswitch_3a
    const v1, 0xd8c6

    goto :goto_17

    :sswitch_3b
    invoke-static {v0}, Landroidx/emoji2/ۢۧۡۧ;->ۢۤۤۡ(Ljava/lang/Object;)V

    goto/16 :goto_4

    :sswitch_3c
    const v0, 0xd904

    :goto_18
    const v1, 0xd915

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_15

    goto :goto_18

    :sswitch_3d
    if-eqz v3, :cond_d

    const v0, 0xd961

    goto :goto_18

    :cond_d
    :sswitch_3e
    const v0, 0xd942

    goto :goto_18

    :sswitch_3f
    :try_start_9
    invoke-static {v3}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۨ۠ۦ۟(Ljava/lang/Object;)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_4

    const v0, 0xd980

    :goto_19
    const v1, 0xd991

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_16

    goto :goto_19

    :sswitch_40
    const v0, 0xdc2a

    goto :goto_19

    :catch_4
    move-exception v0

    :sswitch_41
    const v0, 0xdc87

    :goto_1a
    const v1, 0xdc98

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_17

    goto :goto_1a

    :sswitch_42
    if-eqz v4, :cond_e

    const v0, 0xdce4

    goto :goto_1a

    :cond_e
    :sswitch_43
    const v0, 0xdcc5

    goto :goto_1a

    :sswitch_44
    invoke-static {v4}, Landroidx/emoji2/ۢۧۡۧ;->ۢۤۤۡ(Ljava/lang/Object;)V

    :sswitch_45
    throw v2

    :catch_5
    move-exception v2

    move-object v3, v1

    goto/16 :goto_14

    :catch_6
    move-exception v1

    move-object v2, v1

    goto/16 :goto_14

    :catchall_1
    move-exception v2

    move-object v3, v1

    move-object v4, v0

    goto/16 :goto_12

    :catchall_2
    move-exception v1

    move-object v2, v1

    move-object v4, v0

    goto/16 :goto_12

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_3
        0x1d7 -> :sswitch_6
        0x1f4 -> :sswitch_4
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_5
        0xb97b -> :sswitch_6
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_7
        0x2d -> :sswitch_a
        0x4c -> :sswitch_9
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_d
        0x35 -> :sswitch_31
        0x1f7 -> :sswitch_e
        0x7eef -> :sswitch_f
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_11
        0x4c -> :sswitch_12
        0x53 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_14
        0x33 -> :sswitch_1a
        0x54 -> :sswitch_16
        0xf1 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_17
        0x6af -> :sswitch_18
        0x6c8 -> :sswitch_1a
        0x6e9 -> :sswitch_19
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_1b
        0x2d -> :sswitch_21
        0x32 -> :sswitch_1c
        0x4c -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1e
        0x35 -> :sswitch_21
        0xf3 -> :sswitch_1f
        0xfeb -> :sswitch_20
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_22
        0x36 -> :sswitch_23
        0x57 -> :sswitch_29
        0x74 -> :sswitch_24
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_25
        0x11 -> :sswitch_26
        0x2f -> :sswitch_29
        0x4c -> :sswitch_27
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_28
        0x7ab -> :sswitch_2a
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_2b
        0x36 -> :sswitch_2c
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_2d
        0x2d -> :sswitch_a
        0x3ef -> :sswitch_2e
        0x1ef7 -> :sswitch_2f
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_30
        0x32 -> :sswitch_3b
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x11 -> :sswitch_32
        0x32 -> :sswitch_c
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x3f1 -> :sswitch_33
        0x6a7 -> :sswitch_3c
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x13 -> :sswitch_34
        0x32 -> :sswitch_35
        0x55 -> :sswitch_38
        0x74 -> :sswitch_36
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x13 -> :sswitch_37
        0x32 -> :sswitch_38
    .end sparse-switch

    :sswitch_data_14
    .sparse-switch
        0x11 -> :sswitch_39
        0x3e -> :sswitch_3a
        0x5f -> :sswitch_a
        0x7c -> :sswitch_3b
    .end sparse-switch

    :sswitch_data_15
    .sparse-switch
        0x11 -> :sswitch_3d
        0x36 -> :sswitch_3e
        0x57 -> :sswitch_41
        0x74 -> :sswitch_3f
    .end sparse-switch

    :sswitch_data_16
    .sparse-switch
        0x11 -> :sswitch_40
        0x5bb -> :sswitch_41
    .end sparse-switch

    :sswitch_data_17
    .sparse-switch
        0x1f -> :sswitch_42
        0x3e -> :sswitch_43
        0x5d -> :sswitch_45
        0x7c -> :sswitch_44
    .end sparse-switch
.end method

.method public static parseOriginalVideo(Ljava/lang/String;Lkevin/fun/hook/OriginalVideoParser$ParseCallback;)V
    .locals 4

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
    if-eqz p0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/activity/ۨ۠۟ۧ;->۟ۧ۟ۡ۠(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :sswitch_7
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lkevin/fun/hook/OriginalVideoParser$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0, p1}, Lkevin/fun/hook/OriginalVideoParser$$ExternalSyntheticLambda0;-><init>(Ljava/lang/String;Lkevin/fun/hook/OriginalVideoParser$ParseCallback;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۥۦۤۡ(Ljava/lang/Object;)V

    :goto_3
    :sswitch_8
    return-void

    :sswitch_9
    invoke-static {}, Lkevin/fun/hook/OriginalVideoParser;->ۤۥۣ()[S

    move-result-object v0

    const/16 v1, 0x1b6

    sget v2, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v2, v2, 0x120

    const/16 v3, 0x350

    invoke-static {v0, v1, v2, v3}, Landroidx/loader/ۡۢۢ;->ۡ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroidx/startup/۟ۦۤۨۧ;->۟ۤۡۡ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۤ۠ۧۡ()I

    move-result v1

    const v0, 0xbe7f

    :goto_4
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_4

    :cond_2
    :sswitch_a
    const v0, 0xbebd

    goto :goto_4

    :sswitch_b
    if-gtz v1, :cond_2

    const v0, 0xbedc

    goto :goto_4

    :sswitch_c
    const-string v0, "bfLkrPD43AifmvUvmbKKSz96aG"

    invoke-static {v0}, Landroidx/customview/ۤۡۥ;->ۥۣۢۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

    goto :goto_3

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_9
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_9
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_a
        0x2d -> :sswitch_8
        0x4c -> :sswitch_c
        0xef -> :sswitch_b
    .end sparse-switch
.end method

.method public static ۤۥۣ()[S
    .locals 2

    invoke-static {}, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۤۥ()I

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
    sget-object v0, Lkevin/fun/hook/OriginalVideoParser;->short:[S

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

.method public static ۧۨۢۢ(Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/loader/ۡۢۢ;->ۢۥۧ۟()I

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
