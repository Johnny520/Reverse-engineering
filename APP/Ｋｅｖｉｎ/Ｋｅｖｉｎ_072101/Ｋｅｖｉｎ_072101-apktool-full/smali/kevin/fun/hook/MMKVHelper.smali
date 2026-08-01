.class public Lkevin/fun/hook/MMKVHelper;
.super Ljava/lang/Object;


# static fields
.field private static appContext:Landroid/content/Context;

.field private static volatile healingMode:Z

.field private static volatile initialized:Z

.field private static final lock:Ljava/lang/Object;

.field private static mmkv:Ljava/lang/Object;

.field private static mmkvClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static mmkvId:Ljava/lang/String;

.field private static final short:[S


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v3, 0x0

    const/16 v0, 0x216

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/MMKVHelper;->short:[S

    sput-boolean v3, Lkevin/fun/hook/MMKVHelper;->initialized:Z

    sput-boolean v3, Lkevin/fun/hook/MMKVHelper;->healingMode:Z

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v0

    sget v1, Landroidx/activity/ۤۧۧۧ;->۟۟ۢ۠ۡ:I

    xor-int/lit16 v1, v1, 0x1e6

    const/16 v2, 0x86c

    invoke-static {v0, v3, v1, v2}, Landroidx/drawerlayout/ۤۨۡۤ;->ۤ۠ۤ۠([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/MMKVHelper;->mmkvId:Ljava/lang/String;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lkevin/fun/hook/MMKVHelper;->lock:Ljava/lang/Object;

    return-void

    :array_0
    .array-data 2
        0x807s
        0x809s
        0x81as
        0x805s
        0x802s
        0x833s
        0x80fs
        0x803s
        0x802s
        0x80as
        0x805s
        0x80bs
        0x568s
        0x567s
        0x56es
        0x56as
        0x579s
        0x8dds
        0x8d2s
        0x8dbs
        0x8dfs
        0x8ccs
        0x8ffs
        0x8d2s
        0x8d2s
        0x4d6s
        0x4d9s
        0x4d0s
        0x4d4s
        0x4c7s
        0x6bcs
        0x6abs
        0x6a3s
        0x6a1s
        0x6b8s
        0x6abs
        0x3916s
        0x94ds
        0x963s
        0x970s
        0x96fs
        0x968s
        0x3917s
        0x926s
        0x965s
        0x96as
        0x963s
        0x967s
        0x974s
        0x947s
        0x96as
        0x96as
        0x926s
        0x5037s
        -0x7bdds
        0x93cs
        0x926s
        0x2dfs
        0x2d3s
        0x2d2s
        0x2c8s
        0x2dds
        0x2d5s
        0x2d2s
        0x2cfs
        0x2f7s
        0x2d9s
        0x2c5s
        0x129s
        0x12bs
        0x13as
        0x10fs
        0x122s
        0x122s
        0x3afds
        0xaa6s
        0xa88s
        0xa9bs
        0xa84s
        0xa83s
        0x3afcs
        0xacds
        0xa8as
        0xa88s
        0xa99s
        0xaacs
        0xa81s
        0xa81s
        0xacds
        0x53dcs
        -0x7838s
        0xad7s
        0xacds
        0x2aas
        0x2abs
        0x2ads
        0x2a1s
        0x2aas
        0x2abs
        0x28cs
        0x2a1s
        0x2a1s
        0x2a2s
        0x8e2s
        0x8e3s
        0x8e5s
        0x8e9s
        0x8e2s
        0x8e3s
        0x8d5s
        0x8f2s
        0x8f4s
        0x8efs
        0x8e8s
        0x8e1s
        0x3553s
        0x508s
        0x526s
        0x535s
        0x52as
        0x52ds
        0x3552s
        0x563s
        0x524s
        0x526s
        0x537s
        0x501s
        0x53as
        0x537s
        0x526s
        0x530s
        0x563s
        0x5c72s
        -0x779as
        0x518s
        0x741s
        0x726s
        0x73cs
        0x777s
        0x776s
        0x770s
        0x77cs
        0x777s
        0x776s
        0x757s
        0x77cs
        0x766s
        0x771s
        0x77fs
        0x776s
        0x30ds
        0x30cs
        0x30as
        0x306s
        0x30ds
        0x30cs
        0x32fs
        0x305s
        0x306s
        0x308s
        0x31ds
        0x5ccs
        0x5cds
        0x5cbs
        0x5c7s
        0x5ccs
        0x5cds
        0x5e1s
        0x5c6s
        0x5dcs
        0x66bs
        0x66as
        0x66cs
        0x660s
        0x66bs
        0x66as
        0x643s
        0x660s
        0x661s
        0x668s
        0x106s
        0x107s
        0x101s
        0x10ds
        0x106s
        0x107s
        0x131s
        0x116s
        0x110s
        0x10bs
        0x10cs
        0x105s
        0x3c54s
        0xc0fs
        0xc21s
        0xc32s
        0xc2ds
        0xc2as
        0x3c55s
        0xc64s
        0xc23s
        0xc21s
        0xc30s
        0xc17s
        0xc30s
        0xc36s
        0xc2ds
        0xc2as
        0xc23s
        0xc64s
        0x5575s
        -0x7e9fs
        0xc1fs
        0x8d5s
        0x8b2s
        0x8a8s
        0x3671s
        0x62as
        0x604s
        0x617s
        0x608s
        0x60fs
        0x3670s
        0x641s
        0x212ds
        0x641s
        0x62cs
        0x62cs
        0x62as
        0x637s
        0x629s
        0x604s
        0x60ds
        0x611s
        0x604s
        0x613s
        0x641s
        0x547cs
        0x5faas
        0x5577s
        0x5963s
        0x5859s
        0x65bs
        0x641s
        0xb0bs
        0xb07s
        0xb06s
        0xb1cs
        0xb09s
        0xb01s
        0xb06s
        0xb1bs
        0xb23s
        0xb0ds
        0xb11s
        0x5d1s
        0x5d1s
        0x5d1s
        0x5fas
        0x5ebs
        0x5fds
        0x5fas
        0x5d1s
        0x5d1s
        0x5d1s
        0xb5cs
        0xb57s
        0xb5as
        0xb56s
        0xb5ds
        0xb5cs
        0x564s
        0x56fs
        0x562s
        0x56es
        0x565s
        0x564s
        0x3bc6s
        0xb9ds
        0xbb3s
        0xba0s
        0xbbfs
        0xbb8s
        0x3bc7s
        0xbf6s
        0xba6s
        0xba3s
        0xba2s
        0xb94s
        0xbafs
        0xba2s
        0xbb3s
        0xba5s
        0xbf6s
        0x52e7s
        -0x790ds
        0xb8ds
        0x5e1s
        0x586s
        0x59cs
        0x82bs
        0x820s
        0x82ds
        0x821s
        0x82as
        0x82bs
        0xbafs
        0xba4s
        0xba9s
        0xba5s
        0xbaes
        0xbafs
        0x9das
        0x9d1s
        0x9dcs
        0x9d0s
        0x9dbs
        0x9das
        0x42as
        0x421s
        0x42cs
        0x420s
        0x42bs
        0x42as
        0x3b9s
        0x3b2s
        0x3bfs
        0x3b3s
        0x3b8s
        0x3b9s
        0x37ebs
        0x7b0s
        0x79es
        0x78ds
        0x792s
        0x795s
        0x37eas
        0x7dbs
        0x78bs
        0x78es
        0x78fs
        0x7a8s
        0x78fs
        0x789s
        0x792s
        0x795s
        0x79cs
        0x7dbs
        0x5ecas
        -0x7522s
        0x7a0s
        0x624s
        0x643s
        0x659s
        0x3497s
        0x4ccs
        0x4e2s
        0x4f1s
        0x4ees
        0x4e9s
        0x3496s
        0x4a7s
        0x4cas
        0x4cas
        0x4ccs
        0x4d1s
        0x4a7s
        0x4f5s
        0x4e2s
        0x4ces
        0x4e9s
        0x4ees
        0x4f3s
        0x4a7s
        0x6697s
        0x5618s
        0x3b6cs
        0xb37s
        0xb19s
        0xb0as
        0xb15s
        0xb12s
        0x3b6ds
        0xb5cs
        0xb31s
        0xb31s
        0xb37s
        0xb2as
        0xb5cs
        0xb0es
        0xb19s
        0xb35s
        0xb12s
        0xb15s
        0xb08s
        0xb5cs
        0xb1as
        0xb1ds
        0xb15s
        0xb10s
        0xb19s
        0xb18s
        0xb46s
        0xb5cs
        0xcb2s
        0xca5s
        0xcads
        0xcafs
        0xcb6s
        0xca5s
        0x1b8s
        0x1bcs
        0x71as
        0x736s
        0x720s
        0x729s
        0x723s
        0x71as
        0x726s
        0x72ds
        0x720s
        0x726s
        0x72es
        0x3607s
        0x65cs
        0x672s
        0x661s
        0x67es
        0x679s
        0x3606s
        0x637s
        0x20b7s
        -0x7e8s
        0x637s
        0x65as
        0x65as
        0x65cs
        0x641s
        0x637s
        -0x7803s
        0x6ed7s
        0x5f26s
        -0x74ces
        -0x6e5s
        -0x7214s
        0x578es
        0x5915s
        0x582fs
        0x36acs
        0x6f7s
        0x6d9s
        0x6cas
        0x6d5s
        0x6d2s
        0x36ads
        0x69cs
        0x21f0s
        0x69cs
        0x6f1s
        0x6f1s
        0x6f7s
        0x6eas
        0x69cs
        -0x78aas
        0x6e7cs
        0x59bes
        0x5884s
        0x686s
        0x69cs
        0x4d6s
        0x4dcs
        0x4cbs
        0x4c6s
        0xc69s
        0xc69s
        0xc6fs
        0xc72s
        0xc53s
        0xc6ds
        0xc70s
        0xc6cs
        0xc4ds
        0xc40s
        0x387bs
        0x820s
        0x80es
        0x81ds
        0x802s
        0x805s
        0x387as
        0x84bs
        0x2f27s
        0x84bs
        0x826s
        0x826s
        0x820s
        0x83ds
        0x84bs
        -0x767fs
        0x6963s
        0x515as
        -0x7ab2s
        -0x88fs
        -0x7424s
        0x5bbds
        0x53f5s
        0x47e0s
        0x4651s
        0x84bs
        0x805s
        0x81es
        0x807s
        0x807s
        0x3406s
        0x45ds
        0x473s
        0x460s
        0x47fs
        0x478s
        0x3407s
        0x436s
        0x235as
        0x436s
        0x45bs
        0x45bs
        0x45ds
        0x440s
        0x436s
        -0x7a04s
        0x651es
        0x5b14s
        0x5a2es
        0x42cs
        0x436s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "k36yd89mNessak6DC2AkTNbNCELrM"

    invoke-static {v0}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۦۣۣۧ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static clear()V
    .locals 5

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۨۥۦ()Z

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
    :try_start_0
    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->۟ۧۡۡۢ()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v1

    const/16 v2, 0xc

    sget v3, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    xor-int/lit16 v3, v3, 0x262

    const/16 v4, 0x50b

    invoke-static {v1, v2, v3, v4}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۢۤۤ([SIII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lkevin/fun/hook/MMKVHelper;->۟۟ۤ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :catchall_0
    move-exception v0

    :sswitch_4
    invoke-static {}, Landroidx/vectordrawable/۟ۤۨۥۣ;->۟ۥۧۨ()I

    move-result v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_5
    if-gtz v1, :cond_1

    const v0, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_6
    const v0, 0xbe41

    goto :goto_2

    :sswitch_7
    const-string v0, "FG3Df1ogmiARY4"

    invoke-static {v0}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :sswitch_8
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_8
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_5
        0xb918 -> :sswitch_8
        0xb939 -> :sswitch_7
        0xb97b -> :sswitch_6
    .end sparse-switch
.end method

.method public static clearAll()V
    .locals 7

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۨۥۦ()Z

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
    :try_start_0
    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->۟ۧۡۡۢ()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v1

    const/16 v2, 0x11

    sget v3, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    xor-int/lit8 v3, v3, -0x3d

    const/16 v4, 0x8be

    invoke-static {v1, v2, v3, v4}, Landroidx/customview/ۤۡۥ;->۟ۢۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lkevin/fun/hook/MMKVHelper;->۟۟ۤ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :catchall_0
    move-exception v0

    :try_start_1
    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->۟ۧۡۡۢ()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v1

    const/16 v2, 0x19

    sget v3, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    xor-int/lit16 v3, v3, 0x22b

    const/16 v4, 0x4b5

    invoke-static {v1, v2, v3, v4}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣ۟۠ۢۡ([SIII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lkevin/fun/hook/MMKVHelper;->۟۟ۤ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_4
    const v0, 0xbe22

    goto :goto_2

    :catchall_1
    move-exception v0

    :try_start_2
    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۢۥۣۦ()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Landroidx/activity/ۣۦۡۥ;->۟ۥۥۣۡ(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/۟ۥ۠۠;->ۣ۟۟ۤ۟(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v1

    :sswitch_5
    invoke-static {v1}, Landroidx/activity/ۣۦۡۥ;->ۣ۟ۧۧۡ(Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_1
    :sswitch_6
    const v0, 0xbebd

    goto :goto_3

    :sswitch_7
    if-nez v2, :cond_1

    const v0, 0xbedc

    goto :goto_3

    :sswitch_8
    const v0, 0xbefb

    :goto_4
    const v1, 0xbf0c

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :goto_5
    :sswitch_9
    return-void

    :sswitch_a
    const v0, 0xbf1a

    goto :goto_4

    :sswitch_b
    invoke-static {v1}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۦۥۦۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->۟ۧۡۡۢ()Ljava/lang/Object;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v3

    const/16 v4, 0x1e

    sget v5, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    xor-int/lit16 v5, v5, 0x228

    const/16 v6, 0x6ce

    invoke-static {v3, v4, v5, v6}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢۦۤ([SIII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    sget v5, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    xor-int/lit16 v5, v5, -0x1c5

    aput-object v0, v4, v5

    invoke-static {v2, v3, v4}, Lkevin/fun/hook/MMKVHelper;->۟۟ۤ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    const v0, 0xc202

    :goto_6
    const v2, 0xc213

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_c
    const v0, 0xc221

    goto :goto_6

    :catchall_2
    move-exception v0

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v2

    const/16 v3, 0x24

    sget v4, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v4, v4, 0x21b

    const/16 v5, 0x906

    invoke-static {v2, v3, v4, v5}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/MMKVHelper;->ۤۥۣۤ(Ljava/lang/Object;)V

    goto :goto_5

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_9
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_9
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_4
        0xb97b -> :sswitch_9
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_6
        0x2d -> :sswitch_b
        0x4c -> :sswitch_8
        0xef -> :sswitch_7
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_9
        0x1f7 -> :sswitch_a
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_c
        0x32 -> :sswitch_5
    .end sparse-switch
.end method

.method public static contains(Ljava/lang/String;)Z
    .locals 6

    const/4 v1, 0x0

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۨۥۦ()Z

    move-result v2

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
    if-nez v2, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    move v0, v1

    :goto_1
    return v0

    :sswitch_3
    :try_start_0
    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->۟ۧۡۡۢ()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v2

    const/16 v3, 0x39

    sget v4, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    xor-int/lit16 v4, v4, -0x32a

    const/16 v5, 0x2bc

    invoke-static {v2, v3, v4, v5}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۧۡۥۡ([SIII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    sget v4, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    xor-int/lit16 v4, v4, -0x1c5

    aput-object p0, v3, v4

    invoke-static {v0, v2, v3}, Lkevin/fun/hook/MMKVHelper;->۟۟ۤ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-static {v0}, Landroidx/activity/ۤۧۧۧ;->ۦۣۡ۠(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    goto :goto_1

    :catchall_0
    move-exception v0

    move v0, v1

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method public static getAll()Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "*>;"
        }
    .end annotation

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۨۥۦ()Z

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
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :goto_1
    return-object v0

    :sswitch_3
    :try_start_0
    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->۟ۧۡۡۢ()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v1

    const/16 v2, 0x44

    sget v3, Landroidx/appcompat/ۣۧۤۢ;->۟۠ۡۤۤ:I

    xor-int/lit16 v3, v3, -0xeb

    const/16 v4, 0x14e

    invoke-static {v1, v2, v3, v4}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۢۤۤ([SIII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lkevin/fun/hook/MMKVHelper;->۟۟ۤ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/util/Map;

    const/16 v1, 0x6cc

    :goto_2
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_2

    :sswitch_4
    if-eqz v2, :cond_1

    const/16 v1, 0x729

    goto :goto_2

    :cond_1
    :sswitch_5
    const/16 v1, 0x70a

    goto :goto_2

    :sswitch_6
    check-cast v0, Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v2

    const/16 v3, 0x4a

    sget v4, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    xor-int/lit8 v4, v4, -0x6a

    const/16 v5, 0xaed

    invoke-static {v2, v3, v4, v5}, Landroidx/activity/ۦۧۥۥ;->۟ۤۡۦۦ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/MMKVHelper;->ۤۥۣۤ(Ljava/lang/Object;)V

    :sswitch_7
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch
.end method

.method public static getBoolean(Ljava/lang/String;Z)Z
    .locals 5

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۨۥۦ()Z

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
    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->۟ۧۦۧۥ()V

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۨۥۦ()Z

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    :try_start_0
    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->۟ۧۡۡۢ()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v1

    const/16 v2, 0x5d

    sget v3, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۤۨۡ:I

    xor-int/lit16 v3, v3, -0x3b0

    const/16 v4, 0x2ce

    invoke-static {v1, v2, v3, v4}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۦۤۢۦ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Landroidx/loader/ۡۢۢ;->ۤۨۡۥ(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    sget v4, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    xor-int/lit16 v4, v4, 0x1bf

    aput-object p0, v3, v4

    sget v4, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۤۨۡ:I

    xor-int/lit16 v4, v4, -0x3a5

    aput-object v2, v3, v4

    invoke-static {v0, v1, v3}, Lkevin/fun/hook/MMKVHelper;->۟۟ۤ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-static {v0}, Landroidx/activity/ۤۧۧۧ;->ۦۣۡ۠(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result p1

    :goto_2
    :sswitch_6
    return p1

    :catchall_0
    move-exception v0

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_5
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_5
        0x1f4 -> :sswitch_6
    .end sparse-switch
.end method

.method public static getBytes(Ljava/lang/String;)[B
    .locals 8

    const/4 v7, 0x0

    const/4 v1, 0x0

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۨۥۦ()Z

    move-result v2

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
    if-nez v2, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->۟ۧۦۧۥ()V

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۨۥۦ()Z

    move-result v2

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v2, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    move-object v0, v1

    :goto_2
    return-object v0

    :sswitch_6
    :try_start_0
    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->۟ۧۡۡۢ()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v2

    const/16 v3, 0x67

    sget v4, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v4, v4, 0x313

    const/16 v5, 0x886

    invoke-static {v2, v3, v4, v5}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۨۤ۠۠([SIII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    sget v4, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    xor-int/lit16 v4, v4, 0x174

    aput-object p0, v3, v4

    sget v4, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۡۢ۟:I

    xor-int/lit16 v4, v4, 0x323

    const/4 v5, 0x0

    aput-object v5, v3, v4

    invoke-static {v0, v2, v3}, Lkevin/fun/hook/MMKVHelper;->۟۟ۤ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/16 v2, 0x748

    :goto_3
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_3

    :sswitch_7
    if-eqz v0, :cond_2

    const v2, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_8
    const v2, 0xbe41

    goto :goto_3

    :sswitch_9
    invoke-static {v0}, Landroidx/activity/ۨ۠۟ۧ;->۟ۧ۟ۡ۠(Ljava/lang/Object;)Z

    move-result v3

    const v2, 0xbe7f

    :goto_4
    const v4, 0xbe90

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_3

    goto :goto_4

    :cond_3
    :sswitch_a
    const v2, 0xbebd

    goto :goto_4

    :sswitch_b
    if-nez v3, :cond_3

    const v2, 0xbedc

    goto :goto_4

    :sswitch_c
    const/4 v2, 0x0

    invoke-static {v0, v2}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->۟۠۟ۤۥ(Ljava/lang/Object;I)[B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    goto :goto_2

    :catchall_0
    move-exception v0

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v3

    const/16 v4, 0x73

    sget v5, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v5, v5, 0x21a

    const/16 v6, 0x543

    invoke-static {v3, v4, v5, v6}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۤ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, p0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v3

    const/16 v4, 0x87

    sget v5, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۤۨۡ:I

    xor-int/lit16 v5, v5, -0x3a7

    const/16 v6, 0x71c

    invoke-static {v3, v4, v5, v6}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣ۟۠ۢۡ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/MMKVHelper;->ۤۥۣۤ(Ljava/lang/Object;)V

    sput-boolean v7, Lkevin/fun/hook/MMKVHelper;->initialized:Z

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->۟ۧۦۧۥ()V

    :sswitch_d
    move-object v0, v1

    goto/16 :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_6
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
        0x11 -> :sswitch_7
        0xb918 -> :sswitch_d
        0xb939 -> :sswitch_9
        0xb97b -> :sswitch_8
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_a
        0x2d -> :sswitch_d
        0x4c -> :sswitch_c
        0xef -> :sswitch_b
    .end sparse-switch
.end method

.method public static getDouble(Ljava/lang/String;D)D
    .locals 5

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۨۥۦ()Z

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
    :try_start_0
    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->۟ۧۡۡۢ()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v1

    const/16 v2, 0x8a

    sget v3, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    xor-int/lit16 v3, v3, -0x3d0

    const/16 v4, 0x713

    invoke-static {v1, v2, v3, v4}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۢ۠ۥۨ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, p2}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟۟ۧۢۡ(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    sget v4, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۢ۠۠ۨ:I

    xor-int/lit8 v4, v4, -0x4b

    aput-object p0, v3, v4

    sget v4, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/lit8 v4, v4, 0x73

    aput-object v2, v3, v4

    invoke-static {v0, v1, v3}, Lkevin/fun/hook/MMKVHelper;->۟۟ۤ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-static {v0}, Lorg/luckypray/dexkit/۠۠ۥ;->۟۟ۡۢۥ(Ljava/lang/Object;)D
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide p1

    :goto_1
    :sswitch_3
    return-wide p1

    :catchall_0
    move-exception v0

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_3
        0xef -> :sswitch_2
    .end sparse-switch
.end method

.method public static getFloat(Ljava/lang/String;F)F
    .locals 5

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۨۥۦ()Z

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
    :try_start_0
    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->۟ۧۡۡۢ()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v1

    const/16 v2, 0x96

    sget v3, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    xor-int/lit8 v3, v3, -0x72

    const/16 v4, 0x369

    invoke-static {v1, v2, v3, v4}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۢ۠ۤۥ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۠ۡۡۡ(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    sget v4, Landroidx/startup/۟ۦۤۨۧ;->ۧۡۡۦ:I

    xor-int/lit16 v4, v4, -0x116

    aput-object p0, v3, v4

    sget v4, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    xor-int/lit16 v4, v4, 0x30c

    aput-object v2, v3, v4

    invoke-static {v0, v1, v3}, Lkevin/fun/hook/MMKVHelper;->۟۟ۤ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-static {v0}, Landroidx/startup/ۤۧۥۣ;->ۣ۠(Ljava/lang/Object;)F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result p1

    :goto_1
    :sswitch_3
    return p1

    :catchall_0
    move-exception v0

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_3
        0xef -> :sswitch_2
    .end sparse-switch
.end method

.method public static getInt(Ljava/lang/String;I)I
    .locals 5

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۨۥۦ()Z

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
    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->۟ۧۦۧۥ()V

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۨۥۦ()Z

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    :try_start_0
    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->۟ۧۡۡۢ()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v1

    const/16 v2, 0xa1

    sget v3, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    xor-int/lit8 v3, v3, -0x3e

    const/16 v4, 0x5a8

    invoke-static {v1, v2, v3, v4}, Landroidx/loader/ۢۥ۟;->۟ۧ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    sget v4, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/lit8 v4, v4, -0x76

    aput-object p0, v3, v4

    sget v4, Landroidx/startup/۟ۦۤۨۧ;->ۧۡۡۦ:I

    xor-int/lit16 v4, v4, -0x115

    aput-object v2, v3, v4

    invoke-static {v0, v1, v3}, Lkevin/fun/hook/MMKVHelper;->۟۟ۤ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-static {v0}, Landroidx/interpolator/ۣ۟ۤۢۧ;->۟ۤۡۧ۠(Ljava/lang/Object;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result p1

    :goto_2
    :sswitch_6
    return p1

    :catchall_0
    move-exception v0

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_5
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_5
        0x1f4 -> :sswitch_6
    .end sparse-switch
.end method

.method public static getLong(Ljava/lang/String;J)J
    .locals 5

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۨۥۦ()Z

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
    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->۟ۧۦۧۥ()V

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۨۥۦ()Z

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    :try_start_0
    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->۟ۧۡۡۢ()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v1

    const/16 v2, 0xaa

    sget v3, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v3, v3, 0x2f4

    const/16 v4, 0x60f

    invoke-static {v1, v2, v3, v4}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣۣ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, p2}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟۟۟ۦۤ(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    sget v4, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۢ۟ۡ:I

    xor-int/lit16 v4, v4, -0x270

    aput-object p0, v3, v4

    sget v4, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    xor-int/lit16 v4, v4, 0x178

    aput-object v2, v3, v4

    invoke-static {v0, v1, v3}, Lkevin/fun/hook/MMKVHelper;->۟۟ۤ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-static {v0}, Landroidx/appcompat/resources/ۦۨۦۢ;->ۣۤ۠(Ljava/lang/Object;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide p1

    :goto_2
    :sswitch_6
    return-wide p1

    :catchall_0
    move-exception v0

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_5
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_5
        0x1f4 -> :sswitch_6
    .end sparse-switch
.end method

.method public static getMMKV()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->۟ۧۡۡۢ()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۨۥۦ()Z

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
    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->۟ۧۦۧۥ()V

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۨۥۦ()Z

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    :try_start_0
    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->۟ۧۡۡۢ()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v1

    const/16 v2, 0xb4

    sget v3, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    xor-int/lit8 v3, v3, 0x1f

    const/16 v4, 0x162

    invoke-static {v1, v2, v3, v4}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۦۤۢۦ([SIII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    sget v3, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    xor-int/lit16 v3, v3, -0x3c4

    aput-object p0, v2, v3

    sget v3, Landroidx/activity/ۤۧۧۧ;->۟۟ۢ۠ۡ:I

    xor-int/lit16 v3, v3, 0x1eb

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lkevin/fun/hook/MMKVHelper;->۟۟ۤ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object p1, v0

    :goto_2
    :sswitch_6
    return-object p1

    :catchall_0
    move-exception v0

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v2

    const/16 v3, 0xc0

    sget v4, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۤۥ:I

    xor-int/lit16 v4, v4, 0x3ac

    const/16 v5, 0xc44

    invoke-static {v2, v3, v4, v5}, Landroidx/startup/ۤۧۥۣ;->۟ۧۦ۠ۦ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, p0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v2

    const/16 v3, 0xd5

    sget v4, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    xor-int/lit16 v4, v4, -0x10c

    const/16 v5, 0x888

    invoke-static {v2, v3, v4, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۡۧۨ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/MMKVHelper;->ۤۥۣۤ(Ljava/lang/Object;)V

    const/4 v0, 0x0

    sput-boolean v0, Lkevin/fun/hook/MMKVHelper;->initialized:Z

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->۟ۧۦۧۥ()V

    goto :goto_2

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_5
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_5
        0x1f4 -> :sswitch_6
    .end sparse-switch
.end method

.method public static init(Ljava/lang/Object;)V
    .locals 7

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->۟ۡۡۢ()Z

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
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۧۥۧۥ()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->۟ۡۡۢ()Z

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
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :goto_2
    :sswitch_6
    return-void

    :sswitch_7
    :try_start_1
    sput-object p0, Lkevin/fun/hook/MMKVHelper;->mmkv:Ljava/lang/Object;

    const/16 v0, 0x748

    :goto_3
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :sswitch_8
    if-eqz p0, :cond_2

    const v0, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_9
    const v0, 0xbe41

    goto :goto_3

    :sswitch_a
    invoke-static {p0}, Landroidx/emoji2/ۢۧۡۧ;->۟ۤۤۨۢ(Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/MMKVHelper;->mmkvClass:Ljava/lang/Class;

    const/4 v0, 0x1

    sput-boolean v0, Lkevin/fun/hook/MMKVHelper;->initialized:Z

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۦۥۢۤ()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const v0, 0xbe7f

    :goto_4
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_4

    :goto_5
    :sswitch_b
    :try_start_2
    monitor-exit v1

    invoke-static {}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۡۢۦ()I

    move-result v2

    const v0, 0xbefb

    :goto_6
    const v3, 0xbf0c

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_4

    goto :goto_6

    :cond_3
    :sswitch_c
    const v0, 0xbf39

    goto :goto_6

    :sswitch_d
    const v0, 0xbe9e

    goto :goto_4

    :catchall_0
    move-exception v0

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v3

    const/16 v4, 0xd8

    sget v5, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v5, v5, -0x177

    const/16 v6, 0x661

    invoke-static {v3, v4, v5, v6}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۢ۠ۥۨ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/MMKVHelper;->ۤۥۣۤ(Ljava/lang/Object;)V

    goto :goto_5

    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    :sswitch_e
    if-gtz v2, :cond_3

    const v0, 0xc1e3

    goto :goto_6

    :sswitch_f
    :try_start_3
    const-string v0, "7Qcqgefwt"

    invoke-static {v0}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۨ۠ۦۣ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto/16 :goto_2

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_6
        0xef -> :sswitch_2
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
        0x11 -> :sswitch_8
        0xb918 -> :sswitch_b
        0xb939 -> :sswitch_a
        0xb97b -> :sswitch_9
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_b
        0xef -> :sswitch_d
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x35 -> :sswitch_6
        0x1f7 -> :sswitch_e
        0x7eef -> :sswitch_f
    .end sparse-switch
.end method

.method public static initWithContext(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "\u06e2\u06df\u06e7"

    :goto_0
    invoke-static {v0}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    sput-object p0, Lkevin/fun/hook/MMKVHelper;->appContext:Landroid/content/Context;

    const-string v0, "\u06e3\u06df\u06e1"

    goto :goto_0

    :sswitch_0
    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۦۥۢۤ()V

    const-string v0, "\u06e4\u06e1\u06e2"

    goto :goto_0

    :sswitch_1
    const/4 v0, 0x1

    sput-boolean v0, Lkevin/fun/hook/MMKVHelper;->initialized:Z

    const-string v0, "\u06e8\u06e6\u06e7"

    goto :goto_0

    :sswitch_2
    sput-object p3, Lkevin/fun/hook/MMKVHelper;->mmkvId:Ljava/lang/String;

    const-string v0, "\u06df\u06df\u06df"

    goto :goto_0

    :sswitch_3
    sput-object p1, Lkevin/fun/hook/MMKVHelper;->mmkvClass:Ljava/lang/Class;

    const-string v0, "\u06e6\u06e5\u06e4"

    goto :goto_0

    :sswitch_4
    sput-object p2, Lkevin/fun/hook/MMKVHelper;->mmkv:Ljava/lang/Object;

    const-string v0, "\u06e8\u06e4\u06e2"

    goto :goto_0

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa6ff -> :sswitch_1
        0x1ab605 -> :sswitch_3
        0x1aba05 -> :sswitch_5
        0x1ac205 -> :sswitch_4
        0x1ac966 -> :sswitch_2
        0x1ac9a9 -> :sswitch_0
    .end sparse-switch
.end method

.method public static isInitialized()Z
    .locals 2

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->۟ۡۡۢ()Z

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
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->۟ۧۡۡۢ()Ljava/lang/Object;

    move-result-object v1

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
    const/4 v0, 0x1

    :goto_2
    return v0

    :sswitch_6
    const/4 v0, 0x0

    goto :goto_2

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_6
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_6
        0x1f4 -> :sswitch_5
    .end sparse-switch
.end method

.method private static isMMKVValid()Z
    .locals 8

    const/4 v1, 0x1

    const/4 v0, 0x0

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->۟ۧۡۡۢ()Ljava/lang/Object;

    move-result-object v3

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
    if-nez v3, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    :try_start_0
    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->۟ۧۡۡۢ()Ljava/lang/Object;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v3

    const/16 v4, 0xf4

    sget v5, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/lit8 v5, v5, -0x3f

    const/16 v6, 0xb68

    invoke-static {v3, v4, v5, v6}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۤۦۢۧ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v4

    const/16 v5, 0xff

    sget v6, Landroidx/customview/ۤۡۥ;->ۣ۟ۢۥۢ:I

    xor-int/lit8 v6, v6, -0x70

    const/16 v7, 0x58e

    invoke-static {v4, v5, v6, v7}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۦۣۣۦ([SIII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    sget v6, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/lit8 v6, v6, 0x52

    aput-object v4, v5, v6

    invoke-static {v2, v3, v5}, Lkevin/fun/hook/MMKVHelper;->۟۟ۤ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v0, v1

    :goto_1
    :sswitch_3
    return v0

    :catchall_0
    move-exception v1

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_3
        0xef -> :sswitch_2
    .end sparse-switch
.end method

.method public static putBoolean(Ljava/lang/String;Z)V
    .locals 5

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۨۥۦ()Z

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
    :try_start_0
    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->۟ۧۡۡۢ()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v1

    const/16 v2, 0x109

    sget v3, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    xor-int/lit16 v3, v3, 0x282

    const/16 v4, 0xb39

    invoke-static {v1, v2, v3, v4}, Landroidx/activity/ۦۧۥۥ;->۟ۤۡۦۦ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Landroidx/loader/ۡۢۢ;->ۤۨۡۥ(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    sget v4, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    xor-int/lit16 v4, v4, 0x22e

    aput-object p0, v3, v4

    sget v4, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    xor-int/lit16 v4, v4, 0x266

    aput-object v2, v3, v4

    invoke-static {v0, v1, v3}, Lkevin/fun/hook/MMKVHelper;->۟۟ۤ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :catchall_0
    move-exception v0

    :sswitch_4
    invoke-static {}, Landroidx/activity/ۣۦۡۥ;->ۦۧۥۨ()I

    move-result v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_5
    if-gtz v1, :cond_1

    const v0, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_6
    const v0, 0xbe41

    goto :goto_2

    :sswitch_7
    const-string v0, "yuccgXTgxb8"

    invoke-static {v0}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->۟ۧۦ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_8
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_8
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_5
        0xb918 -> :sswitch_8
        0xb939 -> :sswitch_7
        0xb97b -> :sswitch_6
    .end sparse-switch
.end method

.method public static putBytes(Ljava/lang/String;[B)V
    .locals 7

    const/4 v6, 0x0

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۨۥۦ()Z

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
    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->۟ۧۦۧۥ()V

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۨۥۦ()Z

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    const/4 v0, 0x0

    :try_start_0
    invoke-static {p1, v0}, Landroidx/customview/ۤۡۥ;->۟ۧۧۥۥ(Ljava/lang/Object;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->۟ۧۡۡۢ()Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v2

    const/16 v3, 0x10f

    sget v4, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    xor-int/lit8 v4, v4, 0x15

    const/16 v5, 0x501

    invoke-static {v2, v3, v4, v5}, Lkevin/fun/hook/۟ۥ۠۠;->ۣۨۢ۟([SIII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    sget v4, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v4, v4, 0x2fe

    aput-object p0, v3, v4

    sget v4, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣ۠ۧ:I

    xor-int/lit16 v4, v4, -0x1eb

    aput-object v0, v3, v4

    invoke-static {v1, v2, v3}, Lkevin/fun/hook/MMKVHelper;->۟۟ۤ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :catchall_0
    move-exception v0

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v2

    const/16 v3, 0x115

    sget v4, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    xor-int/lit16 v4, v4, 0x287

    const/16 v5, 0xbd6

    invoke-static {v2, v3, v4, v5}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۧ۟ۧۢ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, p0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v2

    const/16 v3, 0x129

    sget v4, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    xor-int/lit16 v4, v4, -0x3c1

    const/16 v5, 0x5bc

    invoke-static {v2, v3, v4, v5}, Landroidx/activity/ۨ۠۟ۧ;->۟ۡۨۨۧ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/MMKVHelper;->ۤۥۣۤ(Ljava/lang/Object;)V

    sput-boolean v6, Lkevin/fun/hook/MMKVHelper;->initialized:Z

    :sswitch_7
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_5
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_5
        0x1f4 -> :sswitch_7
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_7
    .end sparse-switch
.end method

.method public static putDouble(Ljava/lang/String;D)V
    .locals 5

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۨۥۦ()Z

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
    invoke-static {}, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۥۢۦ()I

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
    const-string v0, "TGndQp"

    invoke-static {v0}, Lkevin/fun/hook/۟ۥ۠۠;->ۣۣۤۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :goto_2
    :sswitch_6
    return-void

    :sswitch_7
    :try_start_0
    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->۟ۧۡۡۢ()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v1

    const/16 v2, 0x12c

    sget v3, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۤۨۡ:I

    xor-int/lit16 v3, v3, -0x3a4

    const/16 v4, 0x84e

    invoke-static {v1, v2, v3, v4}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣ۟۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, p2}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟۟ۧۢۡ(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    sget v4, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    xor-int/lit16 v4, v4, 0x22e

    aput-object p0, v3, v4

    sget v4, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/lit8 v4, v4, 0x53

    aput-object v2, v3, v4

    invoke-static {v0, v1, v3}, Lkevin/fun/hook/MMKVHelper;->۟۟ۤ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
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

    goto :goto_2

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
        0xb97b -> :sswitch_6
    .end sparse-switch
.end method

.method public static putFloat(Ljava/lang/String;F)V
    .locals 5

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۨۥۦ()Z

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
    :try_start_0
    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->۟ۧۡۡۢ()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v1

    const/16 v2, 0x132

    sget v3, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    xor-int/lit16 v3, v3, -0x3c6

    const/16 v4, 0xbca

    invoke-static {v1, v2, v3, v4}, Landroidx/core/ۧ۟ۤۨ;->ۡۥ۟ۥ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۠ۡۡۡ(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    sget v4, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v4, v4, 0x2fe

    aput-object p0, v3, v4

    sget v4, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    xor-int/lit16 v4, v4, 0x22f

    aput-object v2, v3, v4

    invoke-static {v0, v1, v3}, Lkevin/fun/hook/MMKVHelper;->۟۟ۤ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :catchall_0
    move-exception v0

    :sswitch_4
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_4
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
    .end sparse-switch
.end method

.method public static putInt(Ljava/lang/String;I)V
    .locals 5

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۨۥۦ()Z

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
    :try_start_0
    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->۟ۧۡۡۢ()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v1

    const/16 v2, 0x138

    sget v3, Landroidx/loader/ۡۢۢ;->ۣۡۦ۟:I

    xor-int/lit16 v3, v3, -0x3b9

    const/16 v4, 0x9bf

    invoke-static {v1, v2, v3, v4}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢ۟ۥۨ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    sget v4, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/lit8 v4, v4, 0x52

    aput-object p0, v3, v4

    sget v4, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۡۦۥۨ:I

    xor-int/lit16 v4, v4, 0x11f

    aput-object v2, v3, v4

    invoke-static {v0, v1, v3}, Lkevin/fun/hook/MMKVHelper;->۟۟ۤ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :catchall_0
    move-exception v0

    :sswitch_4
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_4
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
    .end sparse-switch
.end method

.method public static putLong(Ljava/lang/String;J)V
    .locals 5

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۨۥۦ()Z

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
    :try_start_0
    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->۟ۧۡۡۢ()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v1

    const/16 v2, 0x13e

    sget v3, Landroidx/startup/۟ۦۤۨۧ;->ۧۡۡۦ:I

    xor-int/lit16 v3, v3, -0x114

    const/16 v4, 0x44f

    invoke-static {v1, v2, v3, v4}, Landroidx/loader/ۢۥ۟;->۟ۧ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, p2}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟۟۟ۦۤ(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    sget v4, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    xor-int/lit16 v4, v4, 0x8c

    aput-object p0, v3, v4

    sget v4, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    xor-int/lit16 v4, v4, 0x252

    aput-object v2, v3, v4

    invoke-static {v0, v1, v3}, Lkevin/fun/hook/MMKVHelper;->۟۟ۤ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :catchall_0
    move-exception v0

    :sswitch_4
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_4
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
    .end sparse-switch
.end method

.method public static putString(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۨۥۦ()Z

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
    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->۟ۧۦۧۥ()V

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۨۥۦ()Z

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    :try_start_0
    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->۟ۧۡۡۢ()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v1

    const/16 v2, 0x144

    sget v3, Landroidx/customview/ۤۡۥ;->ۣ۟ۢۥۢ:I

    xor-int/lit8 v3, v3, -0x64

    const/16 v4, 0x3dc

    invoke-static {v1, v2, v3, v4}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۢۧۢ([SIII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    sget v3, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v3, v3, 0x126

    aput-object p0, v2, v3

    sget v3, Landroidx/customview/ۡۤۡۤ;->۟ۦ۟ۨۨ:I

    xor-int/lit16 v3, v3, 0xf2

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lkevin/fun/hook/MMKVHelper;->۟۟ۤ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :catchall_0
    move-exception v0

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v2

    const/16 v3, 0x14a

    sget v4, Landroidx/customview/ۤۡۥ;->ۣ۟ۢۥۢ:I

    xor-int/lit8 v4, v4, -0x71

    const/16 v5, 0x7fb

    invoke-static {v2, v3, v4, v5}, Landroidx/core/ۤۦ۟ۢ;->ۣۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, p0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v2

    const/16 v3, 0x15f

    sget v4, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۨ۠ۧ:I

    xor-int/lit16 v4, v4, -0x1bf

    const/16 v5, 0x679

    invoke-static {v2, v3, v4, v5}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟ۧۢۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/MMKVHelper;->ۤۥۣۤ(Ljava/lang/Object;)V

    const/4 v0, 0x0

    sput-boolean v0, Lkevin/fun/hook/MMKVHelper;->initialized:Z

    :sswitch_7
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_5
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_5
        0x1f4 -> :sswitch_7
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_7
    .end sparse-switch
.end method

.method public static reInit(Landroid/content/Context;)V
    .locals 6

    :try_start_0
    invoke-static {p0}, Lkevin/fun/hook/MMKVHelper;->ۤۧۨۦ(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->۟ۡۨۦۦ()Ljava/lang/String;

    move-result-object v0

    sget v1, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    xor-int/lit16 v1, v1, 0x176

    invoke-static {v0, v1}, Lkevin/fun/hook/MMKVHelper;->ۦۡۤۨ(Ljava/lang/Object;I)Lcom/tencent/mmkv/MMKV;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/MMKVHelper;->mmkv:Ljava/lang/Object;

    const/4 v0, 0x1

    sput-boolean v0, Lkevin/fun/hook/MMKVHelper;->initialized:Z

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v0

    const/16 v1, 0x162

    sget v2, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    xor-int/lit16 v2, v2, -0x3d6

    const/16 v3, 0x487

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢ۟ۥۨ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/MMKVHelper;->ۤۥۣۤ(Ljava/lang/Object;)V
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

    const/4 v1, 0x0

    sput-boolean v1, Lkevin/fun/hook/MMKVHelper;->initialized:Z

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v2

    const/16 v3, 0x178

    sget v4, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۢ۠۠ۨ:I

    xor-int/lit8 v4, v4, -0x57

    const/16 v5, 0xb7c

    invoke-static {v2, v3, v4, v5}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۠ۤۤۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/MMKVHelper;->ۤۥۣۤ(Ljava/lang/Object;)V

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
    .end sparse-switch
.end method

.method public static remove(Ljava/lang/String;)V
    .locals 5

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۨۥۦ()Z

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
    invoke-static {}, Landroidx/appcompat/ۣۧۤۢ;->ۢ۟۟ۨ()I

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
    const-string v0, "58N9Rzd43YnzbItImQYM"

    invoke-static {v0}, Landroidx/startup/۟ۦۤۨۧ;->۟۟۟ۨۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :goto_2
    :sswitch_6
    return-void

    :sswitch_7
    :try_start_0
    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->۟ۧۡۡۢ()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v1

    const/16 v2, 0x194

    sget v3, Landroidx/loader/ۡۢۢ;->ۣۡۦ۟:I

    xor-int/lit16 v3, v3, -0x3b9

    const/16 v4, 0xcc0

    invoke-static {v1, v2, v3, v4}, Landroidx/drawerlayout/ۤۨۡۤ;->ۤ۠ۤ۠([SIII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    sget v3, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    xor-int/lit16 v3, v3, -0x1c5

    aput-object p0, v2, v3

    invoke-static {v0, v1, v2}, Lkevin/fun/hook/MMKVHelper;->۟۟ۤ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
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

    goto :goto_2

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
        0xb97b -> :sswitch_6
    .end sparse-switch
.end method

.method private static selfCheck()V
    .locals 6

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v0

    const/16 v1, 0x19a

    sget v2, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    xor-int/lit16 v2, v2, 0x176

    const/16 v3, 0x1d7

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/ۣۧۤۢ;->ۢۥۢ۟([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v1

    const/16 v2, 0x19c

    sget v3, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۨۨ:I

    xor-int/lit16 v3, v3, 0x107

    const/16 v4, 0x745

    invoke-static {v1, v2, v3, v4}, Landroidx/loader/۟۠ۢۧۡ;->ۢ۟ۨۥ([SIII)Ljava/lang/String;

    move-result-object v1

    :try_start_0
    invoke-static {v1, v0}, Landroidx/core/ۧ۟ۤۨ;->ۨۢۢۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۦۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

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
    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v0

    const/16 v1, 0x1a7

    sget v2, Lorg/luckypray/dexkit/۠۠ۥ;->ۣ۟ۡۢۡ:I

    xor-int/lit16 v2, v2, -0xfc

    const/16 v3, 0x617

    invoke-static {v0, v1, v2, v3}, Landroidx/activity/ۣۦۡۥ;->۟ۡۨ۟۟([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/MMKVHelper;->ۤۥۣۤ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v2

    const/16 v3, 0x1c0

    sget v4, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/lit8 v4, v4, 0x47

    const/16 v5, 0x6bc

    invoke-static {v2, v3, v4, v5}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۧۡۥۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/MMKVHelper;->ۤۥۣۤ(Ljava/lang/Object;)V

    :sswitch_4
    invoke-static {}, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣۤۥۥ()I

    move-result v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_5
    if-ltz v1, :cond_1

    const v0, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_6
    const v0, 0xbe41

    goto :goto_2

    :sswitch_7
    const-string v0, "h04U5y7Elky54KiAzEo9"

    invoke-static {v0}, Landroidx/loader/ۣ۟۟ۧ۠;->۟ۧ۠ۡۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_8
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_5
        0xb918 -> :sswitch_8
        0xb939 -> :sswitch_7
        0xb97b -> :sswitch_6
    .end sparse-switch
.end method

.method public static sync()V
    .locals 5

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۨۥۦ()Z

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
    :try_start_0
    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->۟ۧۡۡۢ()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v1

    const/16 v2, 0x1d5

    sget v3, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    xor-int/lit16 v3, v3, 0x170

    const/16 v4, 0x4a5

    invoke-static {v1, v2, v3, v4}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠۠ۧۥ([SIII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lkevin/fun/hook/MMKVHelper;->۟۟ۤ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :catchall_0
    move-exception v0

    :sswitch_4
    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۣ۟ۡۨۡ()I

    move-result v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_5
    if-gtz v1, :cond_1

    const v0, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_6
    const v0, 0xbe41

    goto :goto_2

    :sswitch_7
    const-string v0, "L3wl6tP9NZqCPuC"

    invoke-static {v0}, Landroidx/activity/ۦۧۥۥ;->ۧۧ۠ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_8
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_8
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_5
        0xb918 -> :sswitch_8
        0xb939 -> :sswitch_7
        0xb97b -> :sswitch_6
    .end sparse-switch
.end method

.method private static tryHeal()V
    .locals 7

    const/4 v2, 0x1

    const/4 v6, 0x0

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۡۦۣۣ()Z

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
    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۨۦۦۤ()Z

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    sput-boolean v2, Lkevin/fun/hook/MMKVHelper;->healingMode:Z

    :try_start_0
    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۣ۟۟۟ۤ()Landroid/content/Context;

    move-result-object v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz v1, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->۟ۦۣۨۡ()Ljava/lang/Class;

    move-result-object v1

    const v0, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_9
    const v0, 0xbebd

    goto :goto_3

    :sswitch_a
    if-eqz v1, :cond_3

    const v0, 0xbedc

    goto :goto_3

    :sswitch_b
    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->۟ۦۣۨۡ()Ljava/lang/Class;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v1

    const/16 v2, 0x1d9

    sget v3, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    xor-int/lit16 v3, v3, -0x329

    const/16 v4, 0xc04

    invoke-static {v1, v2, v3, v4}, Landroidx/activity/ۦۧۥۥ;->۟ۤۡۦۦ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->۟ۡۨۦۦ()Ljava/lang/String;

    move-result-object v2

    sget v3, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/lit8 v3, v3, 0x70

    invoke-static {v3}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    sget v5, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    xor-int/lit16 v5, v5, 0x293

    aput-object v2, v4, v5

    sget v2, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    xor-int/lit16 v2, v2, 0x1be

    aput-object v3, v4, v2

    invoke-static {v0, v1, v4}, Lkevin/fun/hook/MMKVHelper;->۠۠ۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const v0, 0xbefb

    :goto_4
    const v2, 0xbf0c

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :cond_4
    :sswitch_c
    const v0, 0xbf39

    goto :goto_4

    :sswitch_d
    if-eqz v1, :cond_4

    const v0, 0xc1e3

    goto :goto_4

    :sswitch_e
    sput-object v1, Lkevin/fun/hook/MMKVHelper;->mmkv:Ljava/lang/Object;

    const/4 v0, 0x1

    sput-boolean v0, Lkevin/fun/hook/MMKVHelper;->initialized:Z

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۦۥۢۤ()V

    const v0, 0xc202

    :goto_5
    const v1, 0xc213

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_5

    goto :goto_5

    :sswitch_f
    const v0, 0xc221

    goto :goto_5

    :sswitch_10
    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v0

    const/16 v1, 0x1e3

    sget v2, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    xor-int/lit16 v2, v2, 0x279

    const/16 v3, 0x86b

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۢۥ۠۟([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/MMKVHelper;->ۤۥۣۤ(Ljava/lang/Object;)V

    const/4 v0, 0x0

    sput-boolean v0, Lkevin/fun/hook/MMKVHelper;->initialized:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const v0, 0xc27e

    :goto_6
    const v1, 0xc28f

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_6

    goto :goto_6

    :goto_7
    :sswitch_11
    sput-boolean v6, Lkevin/fun/hook/MMKVHelper;->healingMode:Z

    :sswitch_12
    return-void

    :sswitch_13
    const v0, 0xc29d

    goto :goto_6

    :catchall_0
    move-exception v0

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->ۢۢۨۡ()[S

    move-result-object v2

    const/16 v3, 0x201

    sget v4, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    xor-int/lit16 v4, v4, -0x11e

    const/16 v5, 0x416

    invoke-static {v2, v3, v4, v5}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۡۤۧ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/MMKVHelper;->ۤۥۣۤ(Ljava/lang/Object;)V

    sput-boolean v6, Lkevin/fun/hook/MMKVHelper;->initialized:Z

    goto :goto_7

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_12
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_12
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_11
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_11
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x35 -> :sswitch_10
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_11
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_11
        0xf1 -> :sswitch_13
    .end sparse-switch
.end method

.method public static ۣ۟۟۟ۤ()Landroid/content/Context;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢ۠ۨ۟()I

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
    sget-object v0, Lkevin/fun/hook/MMKVHelper;->appContext:Landroid/content/Context;

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

.method public static ۟۟ۤ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۥۦۨ۠()I

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

.method public static ۟ۡۡۢ()Z
    .locals 2

    invoke-static {}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۢۢۥ()I

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
    sget-boolean v0, Lkevin/fun/hook/MMKVHelper;->initialized:Z

    :sswitch_3
    return v0

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

.method public static ۟ۡۨۦۦ()Ljava/lang/String;
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
    sget-object v0, Lkevin/fun/hook/MMKVHelper;->mmkvId:Ljava/lang/String;

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

.method public static ۟ۦۣۨۡ()Ljava/lang/Class;
    .locals 2

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->۟ۥ۟ۦ۟()I

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
    sget-object v0, Lkevin/fun/hook/MMKVHelper;->mmkvClass:Ljava/lang/Class;

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

.method public static ۟ۧۡۡۢ()Ljava/lang/Object;
    .locals 2

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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/MMKVHelper;->mmkv:Ljava/lang/Object;

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

.method public static ۟ۧۦۧۥ()V
    .locals 2

    invoke-static {}, Landroidx/vectordrawable/۟ۤۨۥۣ;->۟ۥۧۨ()I

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
    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->tryHeal()V

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

.method public static ۠۠ۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lkevin/fun/hook/۟ۥ۠۠;->ۥ۠۠ۤ()I

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
    check-cast p0, Ljava/lang/Class;

    check-cast p1, Ljava/lang/String;

    check-cast p2, [Ljava/lang/Object;

    invoke-static {p0, p1, p2}, Lde/robv/android/xposed/XposedHelpers;->callStaticMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

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

.method public static ۡۦۣۣ()Z
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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-boolean v0, Lkevin/fun/hook/MMKVHelper;->healingMode:Z

    :sswitch_3
    return v0

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

.method public static ۢۢۨۡ()[S
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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/MMKVHelper;->short:[S

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

.method public static ۤۥۣۤ(Ljava/lang/Object;)V
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
    invoke-static {}, Landroidx/loader/۟۠ۢۧۡ;->۟ۦۨ۠ۥ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-gtz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "93dCgPzR6U9XGVlf0"

    invoke-static {v0}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۢ۟ۡ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

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

.method public static ۤۧۨۦ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/startup/ۤۧۥۣ;->۟۠ۨۢۡ()I

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
    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lcom/tencent/mmkv/MMKV;->initialize(Landroid/content/Context;)Ljava/lang/String;

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

.method public static ۦۡۤۨ(Ljava/lang/Object;I)Lcom/tencent/mmkv/MMKV;
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

    invoke-static {p0, p1}, Lcom/tencent/mmkv/MMKV;->mmkvWithID(Ljava/lang/String;I)Lcom/tencent/mmkv/MMKV;

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

.method public static ۦۥۢۤ()V
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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->selfCheck()V

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

.method public static ۧۥۧۥ()Ljava/lang/Object;
    .locals 2

    invoke-static {}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۡۧۦۤ()I

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
    sget-object v0, Lkevin/fun/hook/MMKVHelper;->lock:Ljava/lang/Object;

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

.method public static ۨۦۦۤ()Z
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
    invoke-static {}, Lkevin/fun/hook/MMKVHelper;->isMMKVValid()Z

    move-result v0

    :sswitch_3
    return v0

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
