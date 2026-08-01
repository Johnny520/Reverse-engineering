.class public Lkevin/fun/hook/DownloadPathConfig;
.super Ljava/lang/Object;


# static fields
.field private static final DEFAULT_SAVE_PATH:Ljava/lang/String;

.field private static final KEY_SAVE_PATH:Ljava/lang/String;

.field private static final KEY_TREE_URI:Ljava/lang/String;

.field private static final PREFS_NAME:Ljava/lang/String;

.field private static final short:[S


# instance fields
.field private final prefs:Landroid/content/SharedPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/16 v0, 0x82

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/DownloadPathConfig;->short:[S

    invoke-static {}, Lkevin/fun/hook/DownloadPathConfig;->۠ۦۨ۟()[S

    move-result-object v0

    const/4 v1, 0x0

    sget v2, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    xor-int/lit16 v2, v2, 0x281

    const/16 v3, 0x813

    invoke-static {v0, v1, v2, v3}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣۣ۟ۤۤ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/DownloadPathConfig;->DEFAULT_SAVE_PATH:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/DownloadPathConfig;->۠ۦۨ۟()[S

    move-result-object v0

    const/4 v1, 0x5

    sget v2, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣ۠ۧ:I

    xor-int/lit16 v2, v2, -0x1e3

    const/16 v3, 0x954

    invoke-static {v0, v1, v2, v3}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۦ۠ۧۨ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/DownloadPathConfig;->KEY_SAVE_PATH:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/DownloadPathConfig;->۠ۦۨ۟()[S

    move-result-object v0

    const/16 v1, 0xe

    sget v2, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    xor-int/lit16 v2, v2, 0x26b

    const/16 v3, 0x310

    invoke-static {v0, v1, v2, v3}, Landroidx/customview/ۡۤۡۤ;->ۧ۟ۤۨ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/DownloadPathConfig;->KEY_TREE_URI:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/DownloadPathConfig;->۠ۦۨ۟()[S

    move-result-object v0

    const/16 v1, 0x1a

    sget v2, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    xor-int/lit8 v2, v2, -0x6a

    const/16 v3, 0x248

    invoke-static {v0, v1, v2, v3}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/DownloadPathConfig;->PREFS_NAME:Ljava/lang/String;

    return-void

    :array_0
    .array-data 2
        0x6f39s
        -0x67e6s
        0x6afas
        0x7efds
        0x5746s
        0x927s
        0x935s
        0x922s
        0x931s
        0x90bs
        0x924s
        0x935s
        0x920s
        0x93cs
        0x374s
        0x37fs
        0x367s
        0x37es
        0x37cs
        0x37fs
        0x371s
        0x374s
        0x34fs
        0x365s
        0x362s
        0x379s
        0x223s
        0x22ds
        0x23es
        0x221s
        0x226s
        0x217s
        0x238s
        0x23as
        0x22ds
        0x22es
        0x23bs
        0xa3cs
        0xa32s
        0xa21s
        0xa3es
        0xa39s
        0xa08s
        0xa27s
        0xa25s
        0xa32s
        0xa31s
        0xa24s
        0x375s
        0x367s
        0x370s
        0x363s
        0x359s
        0x376s
        0x367s
        0x372s
        0x36es
        0x6b77s
        -0x63acs
        0x6eb4s
        0x7ab3s
        0x5308s
        0x483s
        0x488s
        0x490s
        0x489s
        0x48bs
        0x488s
        0x486s
        0x483s
        0x4b8s
        0x492s
        0x495s
        0x48es
        0x23es
        0x235s
        0x22ds
        0x234s
        0x236s
        0x235s
        0x23bs
        0x23es
        0x205s
        0x22fs
        0x228s
        0x233s
        0x62ds
        0x63fs
        0x628s
        0x63bs
        0x601s
        0x62es
        0x63fs
        0x62as
        0x636s
        0x6f4es
        -0x6793s
        0x6a8ds
        0x7e8as
        0x5731s
        0x413s
        0x401s
        0x416s
        0x405s
        0x43fs
        0x410s
        0x401s
        0x414s
        0x408s
        0x115s
        0x11es
        0x106s
        0x11fs
        0x11ds
        0x11es
        0x110s
        0x115s
        0x12es
        0x104s
        0x103s
        0x118s
        0x322s
        0x330s
        0x327s
        0x334s
        0x30es
        0x321s
        0x330s
        0x325s
        0x339s
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۦۧۡۨ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DownloadPathConfig;->۠ۦۨ۟()[S

    move-result-object v1

    const/16 v2, 0x25

    sget v3, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۣۧۢ:I

    xor-int/lit16 v3, v3, -0x3ce

    const/16 v4, 0xa57

    invoke-static {v1, v2, v3, v4}, Landroidx/emoji2/ۢۧۡۧ;->۟ۥۢ۟ۢ([SIII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroidx/drawerlayout/ۤۨۡۤ;->۠ۡۤۨ(Ljava/lang/Object;Ljava/lang/Object;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lkevin/fun/hook/DownloadPathConfig;->prefs:Landroid/content/SharedPreferences;

    invoke-static {}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۤۧۢ()I

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
    const-string v0, "7cNlpvLmY0G7AvIgnLO"

    invoke-static {v0}, Landroidx/loader/ۡۢۢ;->ۨۦۦۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

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

.method public static ۟ۦۢۦۢ(Ljava/lang/Object;)Landroid/content/SharedPreferences;
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
    check-cast p0, Lkevin/fun/hook/DownloadPathConfig;

    iget-object v0, p0, Lkevin/fun/hook/DownloadPathConfig;->prefs:Landroid/content/SharedPreferences;

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

.method public static ۠ۦۨ۟()[S
    .locals 2

    invoke-static {}, Landroidx/activity/ۤۧۧۧ;->ۥۢۧۡ()I

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
    sget-object v0, Lkevin/fun/hook/DownloadPathConfig;->short:[S

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
.method public getSavePath()Ljava/lang/String;
    .locals 10

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-string v6, "\u06e3\u06e4\u06e3"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move v7, v8

    move v9, v8

    :goto_0
    invoke-static {v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {v0, v4, v3}, Landroidx/loader/ۡۢۢ;->ۢۨۥ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e7\u06e7\u06e8"

    move-object v2, v1

    goto :goto_0

    :sswitch_0
    invoke-static {}, Lkevin/fun/hook/DownloadPathConfig;->۠ۦۨ۟()[S

    move-result-object v1

    const-string v6, "\u06e0\u06e2\u06e7"

    move-object v5, v1

    goto :goto_0

    :sswitch_1
    xor-int/lit16 v8, v7, 0x32b

    const-string v1, "\u06e6\u06e4\u06e3"

    move-object v6, v1

    move v9, v8

    goto :goto_0

    :sswitch_2
    xor-int/lit16 v8, v7, 0xc6

    const-string v1, "\u06e4\u06e2\u06e4"

    move-object v6, v1

    move v9, v8

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Lkevin/fun/hook/DownloadPathConfig;->۟ۦۢۦۢ(Ljava/lang/Object;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "\u06e2\u06e3\u06e0"

    move-object v6, v1

    goto :goto_0

    :sswitch_4
    sget v7, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    const-string v1, "\u06e0\u06e7\u06e4"

    move-object v6, v1

    goto :goto_0

    :sswitch_5
    const/16 v1, 0x39

    const/16 v3, 0xc5d

    invoke-static {v5, v1, v9, v3}, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۡۨۧ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e5\u06df\u06e4"

    move-object v3, v1

    goto :goto_0

    :sswitch_6
    invoke-static {}, Lkevin/fun/hook/DownloadPathConfig;->۠ۦۨ۟()[S

    move-result-object v1

    const-string v6, "\u06e8\u06e8\u06e6"

    move-object v5, v1

    goto :goto_0

    :sswitch_7
    sget v7, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۡۢ۟:I

    const-string v1, "\u06e5\u06df\u06e7"

    move-object v6, v1

    goto :goto_0

    :sswitch_8
    const/16 v1, 0x30

    const/16 v4, 0x306

    invoke-static {v5, v1, v9, v4}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۦ۠ۧۨ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e3\u06e0\u06e1"

    move-object v4, v1

    goto :goto_0

    :sswitch_9
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aab25 -> :sswitch_7
        0x1aabbd -> :sswitch_2
        0x1ab2bf -> :sswitch_0
        0x1ab624 -> :sswitch_6
        0x1ab6a2 -> :sswitch_3
        0x1aba26 -> :sswitch_5
        0x1abd8d -> :sswitch_1
        0x1ac1e5 -> :sswitch_8
        0x1ac608 -> :sswitch_9
        0x1ac9e6 -> :sswitch_4
    .end sparse-switch
.end method

.method public getTreeUri()Landroid/net/Uri;
    .locals 3

    invoke-static {p0}, Landroidx/loader/ۥۧۨۤ;->ۡ۠ۥۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

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
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v1}, Landroidx/activity/ۨ۠۟ۧ;->۟ۧ۟ۡ۠(Ljava/lang/Object;)Z

    move-result v2

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v2, :cond_1

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
    invoke-static {v1}, Landroidx/activity/ۣۦۡۥ;->۟ۡۦۧۥ(Ljava/lang/Object;)Landroid/net/Uri;

    move-result-object v0

    :goto_3
    return-object v0

    :sswitch_8
    const/4 v0, 0x0

    goto :goto_3

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
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_8
    .end sparse-switch
.end method

.method public getTreeUriString()Ljava/lang/String;
    .locals 9

    const/4 v7, 0x0

    const/4 v1, 0x0

    const-string v5, "\u06e5\u06e1\u06e7"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move v6, v7

    move v8, v7

    :goto_0
    invoke-static {v5}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v5

    sparse-switch v5, :sswitch_data_0

    return-object v3

    :sswitch_0
    invoke-static {p0}, Lkevin/fun/hook/DownloadPathConfig;->۟ۦۢۦۢ(Ljava/lang/Object;)Landroid/content/SharedPreferences;

    move-result-object v2

    const-string v5, "\u06e7\u06e3"

    goto :goto_0

    :sswitch_1
    xor-int/lit8 v7, v6, -0x3a

    const-string v5, "\u06e4\u06e1\u06e0"

    move v8, v7

    goto :goto_0

    :sswitch_2
    sget v6, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    const-string v5, "\u06e1\u06e4"

    goto :goto_0

    :sswitch_3
    const/16 v0, 0x3e

    const/16 v5, 0x4e7

    invoke-static {v4, v0, v8, v5}, Landroidx/loader/ۥۧۨۤ;->۟ۢۢ۠ۥ([SIII)Ljava/lang/String;

    move-result-object v0

    const-string v5, "\u06df\u06e0\u06e2"

    goto :goto_0

    :sswitch_4
    invoke-static {v2, v0, v1}, Landroidx/loader/ۡۢۢ;->ۢۨۥ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v5, "\u06e6\u06e4\u06e8"

    goto :goto_0

    :sswitch_5
    invoke-static {}, Lkevin/fun/hook/DownloadPathConfig;->۠ۦۨ۟()[S

    move-result-object v4

    const-string v5, "\u06e0\u06e6\u06e5"

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc23 -> :sswitch_1
        0xdcdc -> :sswitch_5
        0x1aa721 -> :sswitch_4
        0x1aab9f -> :sswitch_2
        0x1aba03 -> :sswitch_3
        0x1abdcb -> :sswitch_0
    .end sparse-switch
.end method

.method public hasTreeUri()Z
    .locals 2

    invoke-static {p0}, Landroidx/loader/ۥۧۨۤ;->ۡ۠ۥۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

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
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const/4 v0, 0x1

    :goto_1
    return v0

    :sswitch_3
    const/4 v0, 0x0

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method public resetToDefault()V
    .locals 6

    invoke-static {p0}, Lkevin/fun/hook/DownloadPathConfig;->۟ۦۢۦۢ(Ljava/lang/Object;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-static {v0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۣ۟ۦۣ۟(Ljava/lang/Object;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DownloadPathConfig;->۠ۦۨ۟()[S

    move-result-object v1

    const/16 v2, 0x4a

    sget v3, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۤ۟ۧۤ:I

    xor-int/lit16 v3, v3, -0x1ec

    const/16 v4, 0x25a

    invoke-static {v1, v2, v3, v4}, Landroidx/emoji2/ۢۧۡۧ;->۟ۥۢ۟ۢ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣ۟۠۠ۥ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DownloadPathConfig;->۠ۦۨ۟()[S

    move-result-object v1

    const/16 v2, 0x56

    sget v3, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v3, v3, -0x164

    const/16 v4, 0x65e

    invoke-static {v1, v2, v3, v4}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣۣ۟ۤۤ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/DownloadPathConfig;->۠ۦۨ۟()[S

    move-result-object v2

    const/16 v3, 0x5f

    sget v4, Landroidx/customview/ۤۡۥ;->ۣ۟ۢۥۢ:I

    xor-int/lit8 v4, v4, -0x61

    const/16 v5, 0x864

    invoke-static {v2, v3, v4, v5}, Landroidx/loader/ۥۧۨۤ;->۟ۢۢ۠ۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Landroidx/core/ۧ۟ۤۨ;->۟۠ۨۨۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-static {v0}, Landroidx/vectordrawable/۟ۧۢۧۨ;->۠ۤۦۥ(Ljava/lang/Object;)V

    invoke-static {}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۢۡۡۨ()I

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
    const-string v0, "9TU2KkmApNH0Mmf6hI"

    invoke-static {v0}, Lkevin/fun/hook/۟ۥ۠۠;->ۣۣۤۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

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

.method public setSavePath(Ljava/lang/String;)V
    .locals 10

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-string v6, "\u06e1\u06e4\u06e8"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move v7, v8

    move v9, v8

    :goto_0
    invoke-static {v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Lkevin/fun/hook/DownloadPathConfig;->۠ۦۨ۟()[S

    move-result-object v1

    const-string v6, "\u06df\u06e2\u06e7"

    move-object v3, v1

    goto :goto_0

    :sswitch_0
    invoke-static {v4}, Landroidx/vectordrawable/۟ۧۢۧۨ;->۠ۤۦۥ(Ljava/lang/Object;)V

    const-string v1, "\u06e1\u06e6\u06e3"

    move-object v6, v1

    goto :goto_0

    :sswitch_1
    invoke-static {v2, v5, p1}, Landroidx/core/ۧ۟ۤۨ;->۟۠ۨۨۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v6, "\u06e7\u06e0\u06e4"

    move-object v4, v1

    goto :goto_0

    :sswitch_2
    const/16 v1, 0x64

    const/16 v5, 0x460

    invoke-static {v3, v1, v9, v5}, Landroidx/loader/ۡۢۢ;->ۡ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e0\u06e7\u06df"

    move-object v5, v1

    goto :goto_0

    :sswitch_3
    xor-int/lit16 v8, v7, 0x1b6

    const-string v1, "\u06e8\u06df\u06e5"

    move-object v6, v1

    move v9, v8

    goto :goto_0

    :sswitch_4
    invoke-static {v0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۣ۟ۦۣ۟(Ljava/lang/Object;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v6, "\u06e8\u06e4\u06e7"

    move-object v2, v1

    goto :goto_0

    :sswitch_5
    sget v7, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    const-string v1, "\u06e0\u06df\u06df"

    move-object v6, v1

    goto :goto_0

    :sswitch_6
    invoke-static {p0}, Lkevin/fun/hook/DownloadPathConfig;->۟ۦۢۦۢ(Ljava/lang/Object;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "\u06e5\u06e2\u06e3"

    move-object v6, v1

    goto :goto_0

    :sswitch_7
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa764 -> :sswitch_5
        0x1aaac0 -> :sswitch_3
        0x1aabb8 -> :sswitch_1
        0x1aaf25 -> :sswitch_6
        0x1aaf5e -> :sswitch_7
        0x1abde6 -> :sswitch_4
        0x1ac52b -> :sswitch_0
        0x1ac8ce -> :sswitch_2
    .end sparse-switch
.end method

.method public setTreeUri(Landroid/net/Uri;Ljava/lang/String;)V
    .locals 5

    invoke-static {p0}, Lkevin/fun/hook/DownloadPathConfig;->۟ۦۢۦۢ(Ljava/lang/Object;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-static {v0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۣ۟ۦۣ۟(Ljava/lang/Object;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DownloadPathConfig;->۠ۦۨ۟()[S

    move-result-object v1

    const/16 v2, 0x6d

    sget v3, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    xor-int/lit16 v3, v3, 0x25f

    const/16 v4, 0x171

    invoke-static {v1, v2, v3, v4}, Landroidx/loader/۟۠ۢۧۡ;->ۢ۟ۨۥ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۦۧۤۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Landroidx/core/ۧ۟ۤۨ;->۟۠ۨۨۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DownloadPathConfig;->۠ۦۨ۟()[S

    move-result-object v1

    const/16 v2, 0x79

    sget v3, Landroidx/loader/ۡۢۢ;->ۣۡۦ۟:I

    xor-int/lit16 v3, v3, -0x3b8

    const/16 v4, 0x351

    invoke-static {v1, v2, v3, v4}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p2}, Landroidx/core/ۧ۟ۤۨ;->۟۠ۨۨۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-static {v0}, Landroidx/vectordrawable/۟ۧۢۧۨ;->۠ۤۦۥ(Ljava/lang/Object;)V

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
    const-string v0, "ZqwPeIYeNHyHVLnWLBsRioktFB"

    invoke-static {v0}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۣ۟ۧۦۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

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
