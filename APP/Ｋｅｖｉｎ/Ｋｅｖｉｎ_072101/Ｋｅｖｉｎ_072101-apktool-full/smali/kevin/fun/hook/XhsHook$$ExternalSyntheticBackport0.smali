.class public final synthetic Lkevin/fun/hook/XhsHook$$ExternalSyntheticBackport0;
.super Ljava/lang/Object;


# static fields
.field private static final short:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x5f

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticBackport0;->short:[S

    return-void

    :array_0
    .array-data 2
        0x30cs
        0x33bs
        0x32es
        0x33bs
        0x33fs
        0x32as
        0x337s
        0x330s
        0x339s
        0x37es
        0x2ads
        0x2efs
        0x2f4s
        0x2f9s
        0x2e8s
        0x2fes
        0x2ads
        0x2des
        0x2f9s
        0x2ffs
        0x2e4s
        0x2e3s
        0x2eas
        0x2ads
        0x5fcs
        0x5a8s
        0x5b5s
        0x5b1s
        0x5b9s
        0x5afs
        0x5fcs
        0x5abs
        0x5b5s
        0x5b0s
        0x5b0s
        0x5fcs
        0x5acs
        0x5aes
        0x5b3s
        0x5b8s
        0x5a9s
        0x5bfs
        0x5b9s
        0x5fcs
        0x5bds
        0x5fcs
        0x58fs
        0x5a8s
        0x5aes
        0x5b5s
        0x5b2s
        0x5bbs
        0x5fcs
        0x5b9s
        0x5a4s
        0x5bfs
        0x5b9s
        0x5b9s
        0x5b8s
        0x5b5s
        0x5b2s
        0x5bbs
        0x5fcs
        0x5b1s
        0x5bds
        0x5a4s
        0x5b5s
        0x5b1s
        0x5a9s
        0x5b1s
        0x5fcs
        0x5afs
        0x5b5s
        0x5a6s
        0x5b9s
        0x5f2s
        0x5bfs
        0x5b3s
        0x5a9s
        0x5b2s
        0x5a8s
        0x5fcs
        0x5b5s
        0x5afs
        0x5fcs
        0x5b2s
        0x5b9s
        0x5bbs
        0x5bds
        0x5a8s
        0x5b5s
        0x5aas
        0x5b9s
        0x5e6s
        0x5fcs
    .end array-data
.end method

.method public static synthetic m(Ljava/lang/String;I)Ljava/lang/String;
    .locals 7

    const/16 v6, 0x5dc

    const/4 v0, 0x0

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz p1, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/emoji2/ۢۧۡۧ;->ۤۥۨۢ(Ljava/lang/Object;)I

    move-result v2

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz p1, :cond_1

    const/16 v1, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v1, 0x70a

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-nez v2, :cond_2

    const v1, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v1, 0xbe41

    goto :goto_2

    :sswitch_8
    const v0, 0xbe7f

    :goto_3
    const v1, 0xbe90

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :sswitch_9
    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    move-result-object p0

    :goto_4
    :sswitch_a
    return-object p0

    :sswitch_b
    const v0, 0xbe9e

    goto :goto_3

    :sswitch_c
    const v1, 0xbefb

    :goto_5
    const v3, 0xbf0c

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_4

    goto :goto_5

    :cond_3
    :sswitch_d
    const v1, 0xbf39

    goto :goto_5

    :sswitch_e
    const/4 v1, 0x1

    if-ne p1, v1, :cond_3

    const v1, 0xc1e3

    goto :goto_5

    :sswitch_f
    invoke-static {p0}, Landroidx/emoji2/ۢۧۡۧ;->ۤۥۨۢ(Ljava/lang/Object;)I

    move-result v3

    const v1, 0x7fffffff

    div-int v4, v1, p1

    const v1, 0xc202

    :goto_6
    const v5, 0xc213

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_5

    goto :goto_6

    :sswitch_10
    if-gt v3, v4, :cond_4

    const v1, 0xc25f

    goto :goto_6

    :cond_4
    :sswitch_11
    const v1, 0xc240

    goto :goto_6

    :sswitch_12
    new-instance v3, Ljava/lang/StringBuilder;

    mul-int v1, v2, p1

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    :sswitch_13
    const v1, 0xc27e

    :goto_7
    const v2, 0xc28f

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_6

    goto :goto_7

    :cond_5
    :sswitch_14
    const v1, 0xc2bc

    goto :goto_7

    :sswitch_15
    if-ge v0, p1, :cond_5

    const v1, 0xc2db

    goto :goto_7

    :sswitch_16
    invoke-static {v3, p0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget v1, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۢ۠۠ۨ:I

    xor-int/lit8 v1, v1, -0x4c

    add-int/2addr v0, v1

    const v1, 0xc2fa

    :goto_8
    const v2, 0xc30b

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_7

    goto :goto_8

    :sswitch_17
    const v1, 0xc5a4

    goto :goto_8

    :sswitch_18
    invoke-static {v3}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    goto :goto_4

    :sswitch_19
    new-instance v1, Ljava/lang/OutOfMemoryError;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/XhsHook$$ExternalSyntheticBackport0;->ۧۢۥۢ()[S

    move-result-object v3

    sget v4, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    xor-int/lit16 v4, v4, 0x26d

    const/16 v5, 0x35e

    invoke-static {v3, v0, v4, v5}, Landroidx/loader/ۣۦ۟ۡ;->ۣ۟ۤ۟ۦ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p0}, Landroidx/emoji2/ۢۧۡۧ;->ۤۥۨۢ(Ljava/lang/Object;)I

    move-result v2

    invoke-static {v0, v2}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/XhsHook$$ExternalSyntheticBackport0;->ۧۢۥۢ()[S

    move-result-object v2

    const/16 v3, 0xa

    sget v4, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۤ۟ۧۤ:I

    xor-int/lit16 v4, v4, -0x1ea

    const/16 v5, 0x28d

    invoke-static {v2, v3, v4, v5}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟۟۟ۦۢ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0, p1}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/XhsHook$$ExternalSyntheticBackport0;->ۧۢۥۢ()[S

    move-result-object v2

    const/16 v3, 0x18

    sget v4, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/lit8 v4, v4, -0x42

    invoke-static {v2, v3, v4, v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧ۠ۥ۟([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v1

    :sswitch_1a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/XhsHook$$ExternalSyntheticBackport0;->ۧۢۥۢ()[S

    move-result-object v2

    const/16 v3, 0x4c

    sget v4, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    xor-int/lit16 v4, v4, -0x1bd

    invoke-static {v2, v3, v4, v6}, Landroidx/startup/ۤۧۥۣ;->۟ۧۦ۠ۦ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, p1}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_9
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_c
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_d
        0x35 -> :sswitch_f
        0x1f7 -> :sswitch_e
        0x7eef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_11
        0x4c -> :sswitch_12
        0x53 -> :sswitch_19
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_14
        0x33 -> :sswitch_18
        0x54 -> :sswitch_16
        0xf1 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_17
        0x6af -> :sswitch_13
    .end sparse-switch
.end method

.method public static ۧۢۥۢ()[S
    .locals 2

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠ۦۤۦ()I

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
    sget-object v0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticBackport0;->short:[S

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
