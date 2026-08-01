.class public Lkevin/fun/hook/XhsHook$LivePhotoCreator;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkevin/fun/hook/XhsHook;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LivePhotoCreator"
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String;

.field private static final short:[S


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/16 v0, 0x225

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->short:[S

    invoke-static {}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۥۥۣۧ()[S

    move-result-object v0

    const/4 v1, 0x0

    sget v2, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/lit8 v2, v2, 0x42

    const/16 v3, 0x9f3

    invoke-static {v0, v1, v2, v3}, Landroidx/loader/ۥۧۨۤ;->۟ۢۢ۠ۥ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->TAG:Ljava/lang/String;

    return-void

    nop

    :array_0
    .array-data 2
        0x9bfs
        0x99as
        0x985s
        0x996s
        0x9a3s
        0x99bs
        0x99cs
        0x987s
        0x99cs
        0x9b0s
        0x981s
        0x996s
        0x992s
        0x987s
        0x99cs
        0x981s
        0x8e5s
        0x8c0s
        0x8dfs
        0x8ccs
        0x8f9s
        0x8c1s
        0x8c6s
        0x8dds
        0x8c6s
        0x8eas
        0x8dbs
        0x8ccs
        0x8c8s
        0x8dds
        0x8c6s
        0x8dbs
        0x889s
        0x8cas
        0x8dbs
        0x8ccs
        0x8c8s
        0x8dds
        0x8ccs
        0x8e5s
        0x8c0s
        0x8dfs
        0x8ccs
        0x8f9s
        0x8c1s
        0x8c6s
        0x8dds
        0x8c6s
        0x889s
        0x5198s
        -0x7a74s
        0x893s
        0x889s
        0x948s
        0x949s
        0x95bs
        0x930s
        0x925s
        0x302s
        0x327s
        0x338s
        0x32bs
        0x31es
        0x326s
        0x321s
        0x33as
        0x321s
        0x30ds
        0x33cs
        0x32bs
        0x32fs
        0x33as
        0x321s
        0x33cs
        0x36es
        0x58d0s
        0x52fbs
        0x55b0s
        0x7109s
        0x5155s
        0x5db4s
        0x5a7fs
        -0x7195s
        0x3d5s
        0x3f0s
        0x3efs
        0x3fcs
        0x3c9s
        0x3f1s
        0x3f6s
        0x3eds
        0x3f6s
        0x3das
        0x3ebs
        0x3fcs
        0x3f8s
        0x3eds
        0x3f6s
        0x3ebs
        0x3b9s
        -0x73f6s
        0x52fcs
        0x661es
        0x4d6fs
        0x4da3s
        0x79e3s
        0x63bs
        0x61es
        0x601s
        0x612s
        0x627s
        0x61fs
        0x618s
        0x603s
        0x618s
        0x634s
        0x605s
        0x612s
        0x616s
        0x603s
        0x618s
        0x605s
        0x657s
        -0x761cs
        0x5712s
        0x63f0s
        0x4881s
        0x487as
        0x5d2fs
        0x515fs
        0x83es
        0x81bs
        0x804s
        0x817s
        0x822s
        0x81as
        0x81ds
        0x806s
        0x81ds
        0x831s
        0x800s
        0x817s
        0x813s
        0x806s
        0x81ds
        0x800s
        0x852s
        0x5a69s
        0x5688s
        0x53ecs
        0x59c7s
        0x5e8cs
        0x7a35s
        0x5988s
        -0x6295s
        0x848s
        0x852s
        0xc1es
        0xc3bs
        0xc24s
        0xc37s
        0xc02s
        0xc3as
        0xc3ds
        0xc26s
        0xc3ds
        0xc11s
        0xc20s
        0xc37s
        0xc33s
        0xc26s
        0xc3ds
        0xc20s
        0xc72s
        0xc18s
        0xc02s
        0xc17s
        0xc15s
        0xc72s
        0xc01s
        0xc1ds
        0xc1bs
        0xc72s
        0x69b2s
        0x691as
        0x6e7s
        0x6c2s
        0x6dds
        0x6ces
        0x6fbs
        0x6c3s
        0x6c4s
        0x6dfs
        0x6c4s
        0x6e8s
        0x6d9s
        0x6ces
        0x6cas
        0x6dfs
        0x6c4s
        0x6d9s
        0x68bs
        0x6c8s
        0x6d9s
        0x6ces
        0x6cas
        0x6dfs
        0x6ces
        0x6e7s
        0x6c2s
        0x6dds
        0x6ces
        0x6fbs
        0x6c3s
        0x6c4s
        0x6dfs
        0x6c4s
        0x6f8s
        0x6dfs
        0x6d9s
        0x6ces
        0x6cas
        0x6c6s
        0x6c2s
        0x6c5s
        0x6ccs
        0x68bs
        0x5751s
        -0x6c4es
        0x691s
        0x68bs
        0x1dbs
        0x1c7s
        0x1c7s
        0x1c3s
        0x189s
        0x19cs
        0x19cs
        0x1dds
        0x1c0s
        0x19ds
        0x1d2s
        0x1d7s
        0x1dcs
        0x1d1s
        0x1d6s
        0x19ds
        0x1d0s
        0x1dcs
        0x1des
        0x19cs
        0x1cbs
        0x1d2s
        0x1c3s
        0x19cs
        0x182s
        0x19ds
        0x183s
        0x19cs
        0x1b3s
        0x48ds
        0x48cs
        0x49es
        0x4f5s
        0x4e0s
        0x7a3s
        0x786s
        0x799s
        0x78as
        0x7bfs
        0x787s
        0x780s
        0x79bs
        0x780s
        0x7acs
        0x79ds
        0x78as
        0x78es
        0x79bs
        0x780s
        0x79ds
        0x7cfs
        0x6268s
        0x4919s
        0x49e2s
        0x5cb7s
        0x50c7s
        0x1f0s
        0x1d5s
        0x1cas
        0x1d9s
        0x1ecs
        0x1d4s
        0x1d3s
        0x1c8s
        0x1d3s
        0x1ffs
        0x1ces
        0x1d9s
        0x1dds
        0x1c8s
        0x1d3s
        0x1ces
        0x19cs
        0x643bs
        0x4f4as
        0x5896s
        0x5db3s
        0x186s
        0x19cs
        0xc22s
        0x5755s
        -0x7180s
        0x95cs
        0x979s
        0x966s
        0x975s
        0x940s
        0x978s
        0x97fs
        0x964s
        0x97fs
        0x953s
        0x962s
        0x975s
        0x971s
        0x964s
        0x97fs
        0x962s
        0x930s
        0x6cf0s
        0x65c5s
        -0x7d15s
        0x5ac6s
        0x6c97s
        0x47e6s
        0x10ds
        0x10cs
        0x11es
        0x175s
        0x160s
        0x552s
        0x547s
        0x55as
        0x547s
        0x54fs
        0x55es
        0x54bs
        0xb90s
        0xbb2s
        0xba9s
        0xbb4s
        0xbb2s
        0xbb3s
        0xb8ds
        0xbb5s
        0xbb2s
        0xba9s
        0xbb2s
        0x906s
        0x922s
        0x928s
        0x939s
        0x924s
        0x91ds
        0x922s
        0x92fs
        0x92es
        0x924s
        0xccas
        0xcefs
        0xcf0s
        0xce3s
        0xcd6s
        0xcees
        0xce9s
        0xcf2s
        0xce9s
        0xcc5s
        0xcf4s
        0xce3s
        0xce7s
        0xcf2s
        0xce9s
        0xcf4s
        0xca6s
        0xcdes
        0xccbs
        0xcd6s
        0x6446s
        0x6b63s
        0xca6s
        0xcabs
        0xca6s
        0xcfes
        0xcebs
        0xcf6s
        0xcebs
        0xce3s
        0xcf2s
        0xce7s
        0xcbcs
        0xca6s
        0x6d4s
        0x6d8s
        0x6b5s
        0x697s
        0x68cs
        0x691s
        0x697s
        0x696s
        0x6a8s
        0x690s
        0x697s
        0x68cs
        0x697s
        0x6c2s
        0x6d8s
        0x9b9s
        0x9b5s
        0x9d8s
        0x9fcs
        0x9f6s
        0x9e7s
        0x9fas
        0x9c3s
        0x9fcs
        0x9f1s
        0x9f0s
        0x9fas
        0x9afs
        0x9b5s
        0xae7s
        0xac2s
        0xadds
        0xaces
        0xafbs
        0xac3s
        0xac4s
        0xadfs
        0xac4s
        0xae8s
        0xad9s
        0xaces
        0xacas
        0xadfs
        0xac4s
        0xad9s
        0xa8bs
        0x7591s
        0x56bas
        0xae6s
        0xac4s
        0xadfs
        0xac2s
        0xac4s
        0xac5s
        0xafbs
        0xac3s
        0xac4s
        0xadfs
        0xac4s
        0x5be8s
        0x6fdbs
        0x69c5s
        0x66fs
        0x64as
        0x655s
        0x646s
        0x673s
        0x64bs
        0x64cs
        0x657s
        0x64cs
        0x660s
        0x651s
        0x646s
        0x642s
        0x657s
        0x64cs
        0x651s
        0x603s
        -0x6351s
        -0x721es
        0x63a4s
        0x48d5s
        0x63d5s
        0x57d9s
        -0x6cc6s
        0x619s
        0x603s
        0xb9as
        0xbbfs
        0xba0s
        0xbb3s
        0xb86s
        0xbbes
        0xbb9s
        0xba2s
        0xbb9s
        0xb95s
        0xba4s
        0xbb3s
        0xbb7s
        0xba2s
        0xbb9s
        0xba4s
        0xbf6s
        -0x6ea6s
        -0x7fe9s
        0x5048s
        0x5a63s
        0x5d28s
        0x7991s
        0x6e20s
        0x5a2cs
        -0x6131s
        0xbecs
        0xbf6s
        0xccds
        0xcdas
        0xcdas
        0xcd1s
        0xcdcs
        0xcd0s
        0xcdbs
        0xcdas
        0xcdbs
        0xce0s
        0x562s
        0x526s
        0x53cs
        0x52bs
        0x5786s
        0x733fs
        -0x7765s
        0x7979s
        0x5849s
        -0x73a3s
        -0x18cs
        0x6498s
        0x6dads
        -0x71ecs
        0x4f42s
        0x158s
        0x132s
        0x128s
        0x13ds
        0x13fs
    .end array-data
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "QEVSYFsRMsJE6LJAoSLLJZiOusd"

    invoke-static {v0}, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۧۢۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

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

.method public static createLivePhoto(Landroid/content/Context;Ljava/io/File;Ljava/io/File;Ljava/io/File;)Z
    .locals 7

    const/4 v1, 0x0

    :try_start_0
    invoke-static {p0, p1}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۣ۟۟۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/io/File;

    move-result-object v1

    invoke-static {p2}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۣۣ۟۠۟(Ljava/lang/Object;)J

    move-result-wide v2

    long-to-int v0, v2

    long-to-int v2, v2

    invoke-static {v0, v2}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۤۥ۟(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Landroidx/activity/ۣۦۡۥ;->ۨۥۢۡ()Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-static {v0, v2}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۥ۟۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)[B

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->۟ۤۧ(Ljava/lang/Object;)[B

    move-result-object v0

    invoke-static {v1, p2, p3, v0}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۣ۟ۤۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

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
    if-eqz v1, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v1}, Landroidx/loader/۟۠ۢۧۡ;->ۣۣ۟ۢۤ(Ljava/lang/Object;)Z

    :goto_1
    :sswitch_3
    return v0

    :catchall_0
    move-exception v0

    const/16 v2, 0x6cc

    :goto_2
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_2

    :sswitch_4
    const/16 v2, 0x6eb

    goto :goto_2

    :catch_0
    move-exception v0

    :try_start_1
    invoke-static {v0}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۤ۟۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۥۥۣۧ()[S

    move-result-object v3

    const/16 v4, 0x10

    sget v5, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    xor-int/lit8 v5, v5, -0x12

    const/16 v6, 0x8a9

    invoke-static {v3, v4, v5, v6}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۢ۠ۤۥ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۧ۠۠ۤ(Ljava/lang/Object;)V

    invoke-static {p3}, Landroidx/vectordrawable/ۢۤۡۤ;->ۡ۠ۤ۠(Ljava/lang/Object;)Z

    move-result v2

    const/16 v0, 0x748

    :goto_3
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :sswitch_5
    if-eqz v2, :cond_1

    const v0, 0xbe60

    goto :goto_3

    :cond_1
    :sswitch_6
    const v0, 0xbe41

    goto :goto_3

    :sswitch_7
    invoke-static {p3}, Landroidx/loader/۟۠ۢۧۡ;->ۣۣ۟ۢۤ(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :sswitch_8
    const v0, 0xbe7f

    :goto_4
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_4

    :cond_2
    :sswitch_9
    const v0, 0xbebd

    goto :goto_4

    :sswitch_a
    if-eqz v1, :cond_2

    const v0, 0xbedc

    goto :goto_4

    :sswitch_b
    invoke-static {v1}, Landroidx/loader/۟۠ۢۧۡ;->ۣۣ۟ۢۤ(Ljava/lang/Object;)Z

    :sswitch_c
    const/4 v0, 0x0

    goto :goto_1

    :sswitch_d
    const v2, 0xbefb

    :goto_5
    const v3, 0xbf0c

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_4

    goto :goto_5

    :cond_3
    :sswitch_e
    const v2, 0xbf39

    goto :goto_5

    :sswitch_f
    if-eqz v1, :cond_3

    const v2, 0xc1e3

    goto :goto_5

    :sswitch_10
    invoke-static {v1}, Landroidx/loader/۟۠ۢۧۡ;->ۣۣ۟ۢۤ(Ljava/lang/Object;)Z

    :sswitch_11
    throw v0

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
        0x36 -> :sswitch_d
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_5
        0xb918 -> :sswitch_8
        0xb939 -> :sswitch_7
        0xb97b -> :sswitch_6
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_c
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_e
        0x35 -> :sswitch_11
        0x1f7 -> :sswitch_f
        0x7eef -> :sswitch_10
    .end sparse-switch
.end method

.method public static createLivePhoto(Ljava/io/File;Ljava/io/File;Ljava/io/File;)Z
    .locals 8

    const-wide/16 v6, 0x0

    const/4 v0, 0x0

    :try_start_0
    invoke-static {p0}, Landroidx/vectordrawable/ۢۤۡۤ;->ۡ۠ۤ۠(Ljava/lang/Object;)Z

    move-result v2

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
    if-eqz v2, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p1}, Landroidx/vectordrawable/ۢۤۡۤ;->ۡ۠ۤ۠(Ljava/lang/Object;)Z

    move-result v2

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v2, :cond_1

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
    const v1, 0xbe22

    goto :goto_2

    :sswitch_7
    invoke-static {p0}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۣۣ۟۠۟(Ljava/lang/Object;)J

    move-result-wide v2

    const v1, 0xbe7f

    :goto_3
    const v4, 0xbe90

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_8
    const v1, 0xbebd

    goto :goto_3

    :sswitch_9
    cmp-long v1, v2, v6

    if-eqz v1, :cond_2

    const v1, 0xbedc

    goto :goto_3

    :sswitch_a
    invoke-static {p1}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۣۣ۟۠۟(Ljava/lang/Object;)J

    move-result-wide v2

    const v1, 0xbefb

    :goto_4
    const v4, 0xbf0c

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_4

    goto :goto_4

    :cond_3
    :sswitch_b
    const v1, 0xbf39

    goto :goto_4

    :sswitch_c
    cmp-long v1, v2, v6

    if-nez v1, :cond_3

    const v1, 0xc1e3

    goto :goto_4

    :sswitch_d
    const v1, 0xc202

    :goto_5
    const v2, 0xc213

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_5

    goto :goto_5

    :sswitch_e
    const v1, 0xc221

    goto :goto_5

    :sswitch_f
    invoke-static {p1}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۣۣ۟۠۟(Ljava/lang/Object;)J

    move-result-wide v2

    long-to-int v1, v2

    long-to-int v2, v2

    invoke-static {v1, v2}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۤۥ۟(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۥۥۣۧ()[S

    move-result-object v2

    const/16 v3, 0x35

    sget v4, Landroidx/appcompat/ۣۧۤۢ;->۟۠ۡۤۤ:I

    xor-int/lit16 v4, v4, -0xea

    const/16 v5, 0x91d

    invoke-static {v2, v3, v4, v5}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧ۠ۥ۟([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/emoji2/ۢۧۡۧ;->۟ۥۥۥ۠(Ljava/lang/Object;Ljava/lang/Object;)[B

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->۟ۤۧ(Ljava/lang/Object;)[B

    move-result-object v1

    invoke-static {p0, p1, p2, v1}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۣ۟ۤۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const v1, 0xc27e

    :goto_6
    const v3, 0xc28f

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_6

    goto :goto_6

    :cond_4
    :sswitch_10
    const v1, 0xc2bc

    goto :goto_6

    :sswitch_11
    if-eqz v2, :cond_4

    const v1, 0xc2db

    goto :goto_6

    :sswitch_12
    const/4 v0, 0x1

    :goto_7
    :sswitch_13
    return v0

    :sswitch_14
    invoke-static {}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۥۥۣۧ()[S

    move-result-object v1

    const/16 v2, 0x3a

    sget v3, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    xor-int/lit16 v3, v3, 0xda

    const/16 v4, 0x34e

    invoke-static {v1, v2, v3, v4}, Landroidx/core/ktx/۟۟ۡۢ۠;->۟ۢۦۧ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۧ۠۠ۤ(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_7

    :catch_0
    move-exception v1

    invoke-static {v1}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۤ۟۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۥۥۣۧ()[S

    move-result-object v4

    const/16 v5, 0x82

    sget v6, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    xor-int/lit16 v6, v6, 0xd8

    const/16 v7, 0x872

    invoke-static {v4, v5, v6, v7}, Lkevin/fun/hook/۟ۥ۠۠;->ۣۨۢ۟([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v3, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۧ۠۠ۤ(Ljava/lang/Object;)V

    invoke-static {v1}, Landroidx/customview/ۤۡۥ;->ۡۨۧ۟(Ljava/lang/Object;)V

    invoke-static {p2}, Landroidx/vectordrawable/ۢۤۡۤ;->ۡ۠ۤ۠(Ljava/lang/Object;)Z

    move-result v2

    const v1, 0xc2fa

    :goto_8
    const v3, 0xc30b

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_7

    goto :goto_8

    :sswitch_15
    if-eqz v2, :cond_5

    const v1, 0xc5e2

    goto :goto_8

    :sswitch_16
    :try_start_1
    invoke-static {}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۥۥۣۧ()[S

    move-result-object v1

    const/16 v2, 0x53

    sget v3, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    xor-int/lit16 v3, v3, 0x270

    const/16 v4, 0x399

    invoke-static {v1, v2, v3, v4}, Lorg/luckypray/dexkit/۠۠ۥ;->۟ۥۧۦ۠([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۧ۠۠ۤ(Ljava/lang/Object;)V

    goto :goto_7

    :sswitch_17
    invoke-static {}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۥۥۣۧ()[S

    move-result-object v1

    const/16 v2, 0x6a

    sget v3, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    xor-int/lit16 v3, v3, 0x236

    const/16 v4, 0x677

    invoke-static {v1, v2, v3, v4}, Landroidx/customview/ۤۡۥ;->۟ۢۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۧ۠۠ۤ(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_7

    :cond_5
    :sswitch_18
    const v1, 0xc5c3

    goto :goto_8

    :sswitch_19
    invoke-static {p2}, Landroidx/loader/۟۠ۢۧۡ;->ۣۣ۟ۢۤ(Ljava/lang/Object;)Z

    goto/16 :goto_7

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_17
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
        0xb97b -> :sswitch_17
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0x2d -> :sswitch_16
        0x4c -> :sswitch_a
        0xef -> :sswitch_9
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_b
        0x35 -> :sswitch_f
        0x1f7 -> :sswitch_c
        0x7eef -> :sswitch_d
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_e
        0x32 -> :sswitch_16
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_10
        0x33 -> :sswitch_14
        0x54 -> :sswitch_12
        0xf1 -> :sswitch_11
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_15
        0x6af -> :sswitch_18
        0x6c8 -> :sswitch_13
        0x6e9 -> :sswitch_19
    .end sparse-switch
.end method

.method private static createLivePhotoStreaming(Ljava/io/File;Ljava/io/File;Ljava/io/File;[B)Z
    .locals 10

    const/4 v8, 0x2

    const/4 v3, 0x0

    const/4 v9, -0x1

    const/4 v2, 0x0

    :try_start_0
    new-instance v4, Ljava/io/FileInputStream;

    invoke-direct {v4, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    new-instance v5, Ljava/io/FileInputStream;

    invoke-direct {v5, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    :try_start_2
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    const/4 v0, 0x2

    :try_start_3
    new-array v6, v0, [B

    invoke-static {v4, v6}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣ۟ۨۧ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v7

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
    if-ne v7, v8, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const/4 v0, 0x0

    aget-byte v7, v6, v0

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-ne v7, v9, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    const/4 v0, 0x1

    aget-byte v7, v6, v0

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const/16 v0, -0x28

    if-eq v7, v0, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    const v0, 0xbe7f

    :goto_3
    const v6, 0xbe90

    xor-int/2addr v0, v6

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :sswitch_9
    invoke-static {}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۥۥۣۧ()[S

    move-result-object v0

    const/16 v6, 0x9d

    sget v7, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    xor-int/lit16 v7, v7, 0x90

    const/16 v8, 0xc52

    invoke-static {v0, v6, v7, v8}, Landroidx/emoji2/ۢۧۡۧ;->۟ۥۢ۟ۢ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۧ۠۠ۤ(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-static {v1}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۡ۠ۨ۠(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    :try_start_5
    invoke-static {v5}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۥ۟ۢ۟(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :try_start_6
    invoke-static {v4}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۥ۟ۢ۟(Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move v0, v2

    :goto_4
    return v0

    :sswitch_a
    const v0, 0xbe9e

    goto :goto_3

    :sswitch_b
    :try_start_7
    invoke-static {v1, v6}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۣ۟۠۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, p3}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۣ۟۠۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v0, 0x2000

    new-array v6, v0, [B

    :sswitch_c
    invoke-static {v4, v6}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣ۟ۨۧ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v7

    const v0, 0xbefb

    :goto_5
    const v8, 0xbf0c

    xor-int/2addr v0, v8

    sparse-switch v0, :sswitch_data_4

    goto :goto_5

    :cond_3
    :sswitch_d
    const v0, 0xbf39

    goto :goto_5

    :sswitch_e
    if-ne v7, v9, :cond_3

    const v0, 0xc1e3

    goto :goto_5

    :sswitch_f
    invoke-static {v5, v6}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣ۟ۨۧ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v7

    const v0, 0xc202

    :goto_6
    const v8, 0xc213

    xor-int/2addr v0, v8

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_10
    if-ne v7, v9, :cond_4

    const v0, 0xc25f

    goto :goto_6

    :cond_4
    :sswitch_11
    const v0, 0xc240

    goto :goto_6

    :sswitch_12
    invoke-static {v1}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۦۢۡۢ(Ljava/lang/Object;)V

    invoke-static {p2}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->۟ۦۤۦۨ(Ljava/lang/Object;)Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    move-result v0

    :try_start_8
    invoke-static {v1}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۡ۠ۨ۠(Ljava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    :try_start_9
    invoke-static {v5}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۥ۟ۢ۟(Ljava/lang/Object;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    :try_start_a
    invoke-static {v4}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۥ۟ۢ۟(Ljava/lang/Object;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v1

    move-object v0, v3

    :goto_7
    const v3, 0xcdff

    :goto_8
    const v4, 0xce10

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_6

    goto :goto_8

    :cond_5
    :sswitch_13
    const v3, 0xce3d

    goto :goto_8

    :sswitch_14
    const/4 v0, 0x0

    :try_start_b
    invoke-static {v1, v6, v0, v7}, Landroidx/drawerlayout/ۤۨۡۤ;->۟۠ۦۤۧ(Ljava/lang/Object;Ljava/lang/Object;II)V

    const v0, 0xc27e

    :goto_9
    const v7, 0xc28f

    xor-int/2addr v0, v7

    sparse-switch v0, :sswitch_data_7

    goto :goto_9

    :sswitch_15
    const v0, 0xc29d

    goto :goto_9

    :sswitch_16
    const/4 v0, 0x0

    invoke-static {v1, v6, v0, v7}, Landroidx/drawerlayout/ۤۨۡۤ;->۟۠ۦۤۧ(Ljava/lang/Object;Ljava/lang/Object;II)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    const v0, 0xc2fa

    :goto_a
    const v7, 0xc30b

    xor-int/2addr v0, v7

    sparse-switch v0, :sswitch_data_8

    goto :goto_a

    :sswitch_17
    const v0, 0xc5a4

    goto :goto_a

    :catchall_1
    move-exception v0

    :try_start_c
    invoke-static {v1}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۡ۠ۨ۠(Ljava/lang/Object;)V

    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    :catchall_2
    move-exception v1

    move-object v3, v0

    :goto_b
    const v0, 0xc601

    :goto_c
    const v6, 0xc612

    xor-int/2addr v0, v6

    sparse-switch v0, :sswitch_data_9

    goto :goto_c

    :sswitch_18
    if-eqz v3, :cond_6

    const v0, 0xc65e

    goto :goto_c

    :cond_6
    :sswitch_19
    const v0, 0xc63f

    goto :goto_c

    :sswitch_1a
    const v0, 0xc67d

    :goto_d
    const v6, 0xc68e

    xor-int/2addr v0, v6

    sparse-switch v0, :sswitch_data_a

    goto :goto_d

    :cond_7
    :sswitch_1b
    const v0, 0xc6bb

    goto :goto_d

    :sswitch_1c
    if-eq v3, v1, :cond_7

    const v0, 0xc965

    goto :goto_d

    :sswitch_1d
    :try_start_d
    invoke-static {v3, v1}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۨ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0xc984

    :goto_e
    const v1, 0xc995

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_b

    goto :goto_e

    :sswitch_1e
    const v0, 0xc9a3

    goto :goto_e

    :sswitch_1f
    move-object v3, v1

    :sswitch_20
    invoke-static {v5}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۥ۟ۢ۟(Ljava/lang/Object;)V

    throw v3
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    :catchall_3
    move-exception v0

    const v1, 0xca00

    :goto_f
    const v5, 0xca11

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_c

    goto :goto_f

    :cond_8
    :sswitch_21
    const v1, 0xca3e

    goto :goto_f

    :sswitch_22
    if-eqz v3, :cond_8

    const v1, 0xca5d

    goto :goto_f

    :sswitch_23
    const v1, 0xca7c

    :goto_10
    const v5, 0xca8d

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_d

    goto :goto_10

    :sswitch_24
    if-eq v3, v0, :cond_9

    const v1, 0xcd64

    goto :goto_10

    :cond_9
    :sswitch_25
    const v1, 0xcd45

    goto :goto_10

    :sswitch_26
    :try_start_e
    invoke-static {v3, v0}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۨ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0xcd83

    :goto_11
    const v1, 0xcd94

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_e

    goto :goto_11

    :sswitch_27
    const v0, 0xcda2

    goto :goto_11

    :sswitch_28
    move-object v3, v0

    :sswitch_29
    invoke-static {v4}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۥ۟ۢ۟(Ljava/lang/Object;)V

    throw v3
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    :catchall_4
    move-exception v1

    move-object v0, v3

    goto/16 :goto_7

    :sswitch_2a
    if-eqz v0, :cond_5

    const v3, 0xd0e7

    goto/16 :goto_8

    :sswitch_2b
    const v3, 0xd106

    :goto_12
    const v4, 0xd117

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_f

    goto :goto_12

    :sswitch_2c
    if-eq v0, v1, :cond_a

    const v3, 0xd163

    goto :goto_12

    :cond_a
    :sswitch_2d
    const v3, 0xd144

    goto :goto_12

    :sswitch_2e
    :try_start_f
    invoke-static {v0, v1}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۨ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v1, 0xd182

    :goto_13
    const v3, 0xd193

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_10

    goto :goto_13

    :sswitch_2f
    const v1, 0xd1a1

    goto :goto_13

    :sswitch_30
    move-object v0, v1

    :sswitch_31
    throw v0
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_0

    :catch_0
    move-exception v0

    invoke-static {v0}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۤ۟۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۥۥۣۧ()[S

    move-result-object v3

    const/16 v4, 0xb9

    sget v5, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    xor-int/lit16 v5, v5, -0x3ee

    const/16 v6, 0x6ab

    invoke-static {v3, v4, v5, v6}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۢۧۢ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۧ۠۠ۤ(Ljava/lang/Object;)V

    invoke-static {p2}, Landroidx/vectordrawable/ۢۤۡۤ;->ۡ۠ۤ۠(Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xd1fe

    :goto_14
    const v3, 0xd20f

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_11

    goto :goto_14

    :sswitch_32
    if-eqz v1, :cond_b

    const v0, 0xd4e6

    goto :goto_14

    :cond_b
    :sswitch_33
    const v0, 0xd4c7

    goto :goto_14

    :sswitch_34
    invoke-static {p2}, Landroidx/loader/۟۠ۢۧۡ;->ۣۣ۟ۢۤ(Ljava/lang/Object;)Z

    :sswitch_35
    move v0, v2

    goto/16 :goto_4

    :catchall_5
    move-exception v0

    move-object v1, v0

    goto/16 :goto_b

    nop

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
        0x1d7 -> :sswitch_9
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_b
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_d
        0x35 -> :sswitch_16
        0x1f7 -> :sswitch_e
        0x7eef -> :sswitch_f
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_11
        0x4c -> :sswitch_12
        0x53 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0xe -> :sswitch_13
        0x2d -> :sswitch_30
        0x3ef -> :sswitch_2a
        0x1ef7 -> :sswitch_2b
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x12 -> :sswitch_f
        0xf1 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x1f1 -> :sswitch_17
        0x6af -> :sswitch_c
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x13 -> :sswitch_18
        0x2d -> :sswitch_1f
        0x32 -> :sswitch_19
        0x4c -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x12 -> :sswitch_1b
        0x35 -> :sswitch_20
        0xf3 -> :sswitch_1c
        0xfeb -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0x11 -> :sswitch_1e
        0x36 -> :sswitch_20
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xe -> :sswitch_21
        0x11 -> :sswitch_22
        0x2f -> :sswitch_28
        0x4c -> :sswitch_23
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0xf1 -> :sswitch_24
        0x7ab -> :sswitch_25
        0x7c8 -> :sswitch_29
        0x7e9 -> :sswitch_26
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0x17 -> :sswitch_27
        0x36 -> :sswitch_29
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_2c
        0x32 -> :sswitch_2d
        0x53 -> :sswitch_31
        0x74 -> :sswitch_2e
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x11 -> :sswitch_2f
        0x32 -> :sswitch_31
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x3f1 -> :sswitch_32
        0x6a7 -> :sswitch_33
        0x6c8 -> :sswitch_35
        0x6e9 -> :sswitch_34
    .end sparse-switch
.end method

.method private static createXmpApp1Segment([B)[B
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v1, 0x0

    const/4 v8, 0x0

    const-string v6, "\u06df\u06e4"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move v7, v8

    move v9, v8

    move v10, v8

    move v11, v8

    move v12, v8

    :goto_0
    invoke-static {v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {v3, p0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۨۤۦ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06df\u06e1\u06e6"

    move-object v6, v1

    goto :goto_0

    :sswitch_0
    xor-int/lit16 v8, v11, -0x143

    const-string v1, "\u06e1\u06e2\u06e3"

    move-object v6, v1

    move v12, v8

    goto :goto_0

    :sswitch_1
    const/16 v1, 0x104

    const/16 v2, 0x4d8

    invoke-static {v4, v1, v12, v2}, Landroidx/loader/۟۠ۢۧۡ;->ۢ۟ۨۥ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e0\u06e7\u06e7"

    move-object v2, v1

    goto :goto_0

    :sswitch_2
    add-int v8, v10, v12

    const-string v1, "\u06e7\u06e1\u06e5"

    move-object v6, v1

    move v11, v8

    goto :goto_0

    :sswitch_3
    sget v8, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    const-string v1, "\u06e5\u06e1\u06e0"

    move-object v6, v1

    move v11, v8

    goto :goto_0

    :sswitch_4
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const-string v6, "\u06e6\u06e0\u06e0"

    move-object v3, v1

    goto :goto_0

    :sswitch_5
    sget v8, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۣۧۢ:I

    const-string v1, "\u06e8\u06e6\u06e2"

    move-object v6, v1

    move v10, v8

    goto :goto_0

    :sswitch_6
    invoke-static {v3, v11}, Landroidx/emoji2/ۢۧۡۧ;->۟ۤۡ۟ۤ(Ljava/lang/Object;I)V

    const-string v1, "\u06e1\u06e1\u06e0"

    move-object v6, v1

    goto :goto_0

    :sswitch_7
    sget v8, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    const-string v1, "\u06df\u06e0"

    move-object v6, v1

    move v10, v8

    goto :goto_0

    :sswitch_8
    and-int v7, v12, v11

    const-string v1, "\u06df\u06e3\u06e4"

    move-object v6, v1

    goto :goto_0

    :sswitch_9
    invoke-static {}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۥۥۣۧ()[S

    move-result-object v1

    const-string v6, "\u06e7\u06df\u06e2"

    move-object v4, v1

    goto :goto_0

    :sswitch_a
    sget v8, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    const-string v1, "\u06e5\u06e8\u06e8"

    move-object v6, v1

    move v11, v8

    goto :goto_0

    :sswitch_b
    sget v8, Landroidx/appcompat/ۣۧۤۢ;->۟۠ۡۤۤ:I

    const-string v1, "\u06e1\u06e5\u06df"

    move-object v6, v1

    move v9, v8

    goto :goto_0

    :sswitch_c
    invoke-static {v0, v2}, Landroidx/emoji2/ۢۧۡۧ;->۟ۥۥۥ۠(Ljava/lang/Object;Ljava/lang/Object;)[B

    move-result-object v1

    const-string v6, "\u06e5\u06e8\u06e7"

    move-object v5, v1

    goto :goto_0

    :sswitch_d
    invoke-static {v3, v7}, Landroidx/emoji2/ۢۧۡۧ;->۟ۤۡ۟ۤ(Ljava/lang/Object;I)V

    const-string v1, "\u06e2\u06e5\u06e5"

    move-object v6, v1

    goto :goto_0

    :sswitch_e
    invoke-static {v3, v5}, Landroidx/documentfile/ۡۢ۟ۥ;->ۨۤۦ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e2\u06e8\u06e0"

    move-object v6, v1

    goto :goto_0

    :sswitch_f
    and-int v8, v10, v12

    const-string v1, "\u06e6\u06e3\u06e7"

    move-object v6, v1

    move v11, v8

    goto/16 :goto_0

    :sswitch_10
    add-int v8, v11, v12

    const-string v1, "\u06e0\u06e8"

    move-object v6, v1

    move v10, v8

    goto/16 :goto_0

    :sswitch_11
    xor-int/lit16 v8, v11, 0x305

    const-string v1, "\u06e5\u06e2\u06e8"

    move-object v6, v1

    move v9, v8

    goto/16 :goto_0

    :sswitch_12
    invoke-static {v3}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۥ۟۠ۡ(Ljava/lang/Object;)[B

    move-result-object v1

    const-string v6, "\u06e8\u06e6\u06e8"

    move-object v5, v1

    goto/16 :goto_0

    :sswitch_13
    xor-int/lit16 v8, v10, -0x3c2

    const-string v1, "\u06e4\u06e5\u06e8"

    move-object v6, v1

    move v12, v8

    goto/16 :goto_0

    :sswitch_14
    xor-int/lit8 v8, v9, -0x14

    const-string v1, "\u06e4\u06e1\u06e3"

    move-object v6, v1

    move v12, v8

    goto/16 :goto_0

    :sswitch_15
    invoke-static {}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۥۥۣۧ()[S

    move-result-object v1

    const-string v6, "\u06e6\u06e2\u06e3"

    move-object v4, v1

    goto/16 :goto_0

    :sswitch_16
    shr-int v8, v10, v9

    const-string v1, "\u06e7\u06e1\u06e8"

    move-object v6, v1

    move v11, v8

    goto/16 :goto_0

    :sswitch_17
    invoke-static {v3, v12}, Landroidx/emoji2/ۢۧۡۧ;->۟ۤۡ۟ۤ(Ljava/lang/Object;I)V

    const-string v1, "\u06e1\u06e1\u06e2"

    move-object v6, v1

    goto/16 :goto_0

    :sswitch_18
    array-length v8, p0

    const-string v1, "\u06e1\u06e8\u06e6"

    move-object v6, v1

    move v12, v8

    goto/16 :goto_0

    :sswitch_19
    const/16 v0, 0xe7

    const/16 v1, 0x1b3

    invoke-static {v4, v0, v12, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->ۤ۠ۤ۠([SIII)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e6\u06df\u06e8"

    move-object v6, v1

    goto/16 :goto_0

    :sswitch_1a
    sget v8, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۨ۠ۧ:I

    const-string v1, "\u06e0\u06e6\u06e1"

    move-object v6, v1

    move v11, v8

    goto/16 :goto_0

    :sswitch_1b
    sget v8, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۤۥ:I

    const-string v1, "\u06e4\u06e4\u06e4"

    move-object v6, v1

    move v10, v8

    goto/16 :goto_0

    :sswitch_1c
    xor-int/lit16 v8, v10, 0x3a4

    const-string v1, "\u06e5\u06e8\u06e4"

    move-object v6, v1

    move v12, v8

    goto/16 :goto_0

    :sswitch_1d
    xor-int/lit16 v8, v10, -0x3c4

    const-string v1, "\u06e2\u06e5"

    move-object v6, v1

    move v12, v8

    goto/16 :goto_0

    :sswitch_1e
    array-length v8, v5

    const-string v1, "\u06e8\u06e4\u06df"

    move-object v6, v1

    move v10, v8

    goto/16 :goto_0

    :sswitch_1f
    xor-int/lit16 v8, v11, -0x95

    const-string v1, "\u06e6\u06e2\u06e1"

    move-object v6, v1

    move v9, v8

    goto/16 :goto_0

    :sswitch_20
    invoke-static {v3, v9}, Landroidx/emoji2/ۢۧۡۧ;->۟ۤۡ۟ۤ(Ljava/lang/Object;I)V

    const-string v1, "\u06e0\u06e2\u06df"

    move-object v6, v1

    goto/16 :goto_0

    :sswitch_21
    return-object v5

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe1 -> :sswitch_13
        0xdbe5 -> :sswitch_15
        0xdc08 -> :sswitch_4
        0xdc43 -> :sswitch_1
        0x1aa744 -> :sswitch_12
        0x1aa780 -> :sswitch_d
        0x1aab1d -> :sswitch_3
        0x1aab9b -> :sswitch_0
        0x1aabc0 -> :sswitch_c
        0x1aaec0 -> :sswitch_e
        0x1aaec2 -> :sswitch_a
        0x1aaee2 -> :sswitch_17
        0x1aaf3b -> :sswitch_14
        0x1aaf9f -> :sswitch_2
        0x1ab302 -> :sswitch_b
        0x1aba06 -> :sswitch_f
        0x1aba64 -> :sswitch_1c
        0x1aba87 -> :sswitch_10
        0x1abdc4 -> :sswitch_11
        0x1abdeb -> :sswitch_16
        0x1abea1 -> :sswitch_19
        0x1abea4 -> :sswitch_1e
        0x1abea5 -> :sswitch_1f
        0x1ac14f -> :sswitch_9
        0x1ac166 -> :sswitch_1a
        0x1ac1a5 -> :sswitch_20
        0x1ac1a7 -> :sswitch_1b
        0x1ac1ca -> :sswitch_6
        0x1ac50a -> :sswitch_5
        0x1ac54b -> :sswitch_7
        0x1ac54e -> :sswitch_8
        0x1ac963 -> :sswitch_18
        0x1ac9a4 -> :sswitch_1d
        0x1ac9aa -> :sswitch_21
    .end sparse-switch
.end method

.method private static generateXMPMetadata(II)Ljava/lang/String;
    .locals 8

    const/4 v1, 0x0

    const-string v7, "\u06e0\u06e1\u06e0"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    :goto_0
    invoke-static {v7}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    const-string v1, "\u06e4\u06e6\u06e7"

    move-object v7, v1

    goto :goto_0

    :sswitch_0
    sget p1, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    const-string v1, "\u06e8\u06e6\u06df"

    move-object v7, v1

    goto :goto_0

    :sswitch_1
    aput-object v6, v2, p0

    const-string v1, "\u06e1\u06e2\u06e2"

    move-object v7, v1

    goto :goto_0

    :sswitch_2
    aput-object v4, v2, p0

    const-string v1, "\u06e1\u06e1\u06df"

    move-object v7, v1

    goto :goto_0

    :sswitch_3
    aput-object v5, v2, p0

    const-string v1, "\u06e3\u06e3\u06e0"

    move-object v7, v1

    goto :goto_0

    :sswitch_4
    invoke-static {p1}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v7, "\u06e8\u06e3\u06e0"

    move-object v4, v1

    goto :goto_0

    :sswitch_5
    invoke-static {}, Landroidx/activity/ۦۧۥۥ;->۟ۤۤۧۤ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e7\u06e8\u06e6"

    move-object v7, v1

    goto :goto_0

    :sswitch_6
    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v7, "\u06e3\u06e2\u06e5"

    move-object v2, v1

    goto :goto_0

    :sswitch_7
    xor-int/lit16 p0, p1, -0x3c4

    const-string v1, "\u06e8\u06e2\u06e2"

    move-object v7, v1

    goto :goto_0

    :sswitch_8
    sget p1, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    const-string v1, "\u06e7\u06e1\u06e1"

    move-object v7, v1

    goto :goto_0

    :sswitch_9
    xor-int/lit16 p0, p1, 0x124

    const-string v1, "\u06e7\u06e8\u06e4"

    move-object v7, v1

    goto :goto_0

    :sswitch_a
    sget p1, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    const-string v1, "\u06e6\u06e4\u06df"

    move-object v7, v1

    goto :goto_0

    :sswitch_b
    xor-int/lit16 p0, p1, 0x266

    const-string v1, "\u06e0\u06e0\u06e8"

    move-object v7, v1

    goto :goto_0

    :sswitch_c
    invoke-static {p0}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v7, "\u06e1\u06e0\u06df"

    move-object v6, v1

    goto :goto_0

    :sswitch_d
    invoke-static {p0}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v7, "\u06e5\u06e5\u06e1"

    move-object v5, v1

    goto :goto_0

    :sswitch_e
    invoke-static {v0, v2}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۣۢ۠ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e8\u06e2\u06e3"

    move-object v3, v1

    goto :goto_0

    :sswitch_f
    return-object v3

    :sswitch_data_0
    .sparse-switch
        0x1aaae8 -> :sswitch_2
        0x1aaea0 -> :sswitch_4
        0x1aaebf -> :sswitch_0
        0x1aaee1 -> :sswitch_8
        0x1ab666 -> :sswitch_a
        0x1ab680 -> :sswitch_5
        0x1abaa5 -> :sswitch_c
        0x1abe41 -> :sswitch_6
        0x1ac1e1 -> :sswitch_7
        0x1ac547 -> :sswitch_b
        0x1ac623 -> :sswitch_3
        0x1ac625 -> :sswitch_e
        0x1ac928 -> :sswitch_1
        0x1ac929 -> :sswitch_f
        0x1ac945 -> :sswitch_d
        0x1ac9a1 -> :sswitch_9
    .end sparse-switch
.end method

.method private static isLivePhotoValid(Ljava/io/File;)Z
    .locals 11

    const/4 v2, 0x0

    :try_start_0
    invoke-static {p0}, Landroidx/vectordrawable/ۢۤۡۤ;->ۡ۠ۤ۠(Ljava/lang/Object;)Z

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
    invoke-static {}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۥۥۣۧ()[S

    move-result-object v0

    const/16 v1, 0x109

    sget v3, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    xor-int/lit16 v3, v3, 0x245

    const/16 v4, 0x7ef

    invoke-static {v0, v1, v3, v4}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۢۥ۠۟([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۧ۠۠ۤ(Ljava/lang/Object;)V

    move v0, v2

    :goto_1
    return v0

    :sswitch_3
    invoke-static {p0}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۣۣ۟۠۟(Ljava/lang/Object;)J

    move-result-wide v4

    const/16 v0, 0x6cc

    :goto_2
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    :sswitch_4
    const-wide/16 v0, 0x64

    cmp-long v0, v4, v0

    if-gez v0, :cond_1

    const/16 v0, 0x729

    goto :goto_2

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_2

    :sswitch_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۥۥۣۧ()[S

    move-result-object v1

    const/16 v3, 0x11f

    sget v6, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v6, v6, 0x219

    const/16 v7, 0x1bc

    invoke-static {v1, v3, v6, v7}, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۡۨۧ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0, v4, v5}, Landroidx/loader/ۢۥ۟;->۟ۥۣۢۡ(Ljava/lang/Object;J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۥۥۣۧ()[S

    move-result-object v1

    const/16 v3, 0x136

    sget v4, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    xor-int/lit16 v4, v4, -0x21d

    const/16 v5, 0xc02

    invoke-static {v1, v3, v4, v5}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۢۥ۠۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۧ۠۠ۤ(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move v0, v2

    goto :goto_1

    :sswitch_7
    const/4 v0, 0x0

    :try_start_1
    new-instance v3, Ljava/io/FileInputStream;

    invoke-direct {v3, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/16 v1, 0x4000

    :try_start_2
    new-array v4, v1, [B

    invoke-static {v3, v4}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣ۟ۨۧ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v5

    const/16 v1, 0x748

    :goto_3
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_3

    :sswitch_8
    if-gtz v5, :cond_2

    const v1, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_9
    const v1, 0xbe41

    goto :goto_3

    :sswitch_a
    invoke-static {}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۥۥۣۧ()[S

    move-result-object v1

    const/16 v4, 0x139

    sget v5, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    xor-int/lit16 v5, v5, 0xd4

    const/16 v6, 0x910

    invoke-static {v1, v4, v5, v6}, Landroidx/activity/ۨ۠۟ۧ;->۟ۡۨۨۧ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۧ۠۠ۤ(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-static {v3}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۥ۟ۢ۟(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move v0, v2

    goto/16 :goto_1

    :sswitch_b
    :try_start_4
    new-instance v1, Ljava/lang/String;

    const/4 v6, 0x0

    invoke-static {}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۥۥۣۧ()[S

    move-result-object v7

    const/16 v8, 0x150

    sget v9, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    xor-int/lit16 v9, v9, 0x3a5

    const/16 v10, 0x158

    invoke-static {v7, v8, v9, v10}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v1, v4, v6, v5, v7}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    invoke-static {}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۥۥۣۧ()[S

    move-result-object v4

    const/16 v5, 0x155

    sget v6, Landroidx/activity/ۨ۠۟ۧ;->۟ۦۥۢۢ:I

    xor-int/lit16 v6, v6, 0x332

    const/16 v7, 0x52a

    invoke-static {v4, v5, v6, v7}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۢ۠ۤۥ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    invoke-static {}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۥۥۣۧ()[S

    move-result-object v5

    const/16 v6, 0x15c

    sget v7, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    xor-int/lit16 v7, v7, 0xc8

    const/16 v8, 0xbdd

    invoke-static {v5, v6, v7, v8}, Landroidx/loader/ۡۢۢ;->ۡ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v1, v5}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    invoke-static {}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۥۥۣۧ()[S

    move-result-object v6

    const/16 v7, 0x167

    sget v8, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۢ۟ۡ:I

    xor-int/lit16 v8, v8, -0x266

    const/16 v9, 0x94b

    invoke-static {v6, v7, v8, v9}, Lorg/luckypray/dexkit/۠۠ۥ;->۟ۥۧۦ۠([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v1, v6}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۥۥۣۧ()[S

    move-result-object v7

    const/16 v8, 0x171

    sget v9, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v9, v9, 0x22c

    const/16 v10, 0xc86

    invoke-static {v7, v8, v9, v10}, Landroidx/activity/ۦۧۥۥ;->۟ۤۡۦۦ([SIII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-static {v6, v4}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->۟ۧۦ۟ۡ(Ljava/lang/Object;Z)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۥۥۣۧ()[S

    move-result-object v6

    const/16 v7, 0x193

    sget v8, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۢ۟ۡ:I

    xor-int/lit16 v8, v8, -0x261

    const/16 v9, 0x6f8

    invoke-static {v6, v7, v8, v9}, Landroidx/startup/۟ۦۤۨۧ;->۟ۦۦۦ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {v4, v5}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->۟ۧۦ۟ۡ(Ljava/lang/Object;Z)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۥۥۣۧ()[S

    move-result-object v6

    const/16 v7, 0x1a2

    sget v8, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/lit8 v8, v8, -0x1e

    const/16 v9, 0x995

    invoke-static {v6, v7, v8, v9}, Landroidx/loader/ۢۥ۟;->۟ۧ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {v4, v1}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->۟ۧۦ۟ۡ(Ljava/lang/Object;Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۧ۠۠ۤ(Ljava/lang/Object;)V

    const v1, 0xbe7f

    :goto_4
    const v4, 0xbe90

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_3

    goto :goto_4

    :cond_3
    :sswitch_c
    const v1, 0xbebd

    goto :goto_4

    :sswitch_d
    if-nez v5, :cond_3

    const v1, 0xbedc

    goto :goto_4

    :sswitch_e
    invoke-static {}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۥۥۣۧ()[S

    move-result-object v1

    const/16 v4, 0x1b0

    sget v5, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۨۨ:I

    xor-int/lit16 v5, v5, 0x12d

    const/16 v6, 0xaab

    invoke-static {v1, v4, v5, v6}, Landroidx/customview/ۡۤۡۤ;->ۧ۟ۤۨ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۧ۠۠ۤ(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    invoke-static {v3}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۥ۟ۢ۟(Ljava/lang/Object;)V

    move v0, v2

    goto/16 :goto_1

    :sswitch_f
    invoke-static {v3}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۥ۟ۢ۟(Ljava/lang/Object;)V

    const/4 v0, 0x1

    goto/16 :goto_1

    :catchall_0
    move-exception v0

    invoke-static {v3}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۥ۟ۢ۟(Ljava/lang/Object;)V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception v1

    const v3, 0xbefb

    :goto_5
    const v4, 0xbf0c

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_4

    goto :goto_5

    :cond_4
    :sswitch_10
    const v3, 0xbf39

    goto :goto_5

    :sswitch_11
    if-eqz v0, :cond_4

    const v3, 0xc1e3

    goto :goto_5

    :sswitch_12
    const v3, 0xc202

    :goto_6
    const v4, 0xc213

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_5

    goto :goto_6

    :sswitch_13
    if-eq v0, v1, :cond_5

    const v3, 0xc25f

    goto :goto_6

    :cond_5
    :sswitch_14
    const v3, 0xc240

    goto :goto_6

    :sswitch_15
    :try_start_6
    invoke-static {v0, v1}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۨ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v1, 0xc27e

    :goto_7
    const v3, 0xc28f

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_6

    goto :goto_7

    :goto_8
    :sswitch_16
    throw v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    :catch_0
    move-exception v0

    :try_start_7
    invoke-static {v0}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۤ۟۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۥۥۣۧ()[S

    move-result-object v3

    const/16 v4, 0x1d1

    sget v5, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    xor-int/lit16 v5, v5, -0x1b6

    const/16 v6, 0x623

    invoke-static {v3, v4, v5, v6}, Landroidx/activity/ۣۦۡۥ;->۟ۡۨ۟۟([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۧ۠۠ۤ(Ljava/lang/Object;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    move v0, v2

    goto/16 :goto_1

    :sswitch_17
    const v1, 0xc29d

    goto :goto_7

    :sswitch_18
    move-object v0, v1

    goto :goto_8

    :catch_1
    move-exception v0

    invoke-static {v0}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۤ۟۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۥۥۣۧ()[S

    move-result-object v3

    const/16 v4, 0x1eb

    sget v5, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    xor-int/lit16 v5, v5, -0x1b4

    const/16 v6, 0xbd6

    invoke-static {v3, v4, v5, v6}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۡۤۧ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۧ۠۠ۤ(Ljava/lang/Object;)V

    move v0, v2

    goto/16 :goto_1

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

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_8
        0xb918 -> :sswitch_b
        0xb939 -> :sswitch_a
        0xb97b -> :sswitch_9
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_c
        0x2d -> :sswitch_f
        0x4c -> :sswitch_e
        0xef -> :sswitch_d
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_10
        0x35 -> :sswitch_18
        0x1f7 -> :sswitch_11
        0x7eef -> :sswitch_12
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_13
        0x32 -> :sswitch_14
        0x4c -> :sswitch_15
        0x53 -> :sswitch_16
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_16
        0xf1 -> :sswitch_17
    .end sparse-switch
.end method

.method private static reencodeToJpeg(Landroid/content/Context;Ljava/io/File;)Ljava/io/File;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p1}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۦ۠ۤۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/activity/ۨ۠۟ۧ;->ۡۧۧۦ(Ljava/lang/Object;)Landroid/graphics/Bitmap;

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
    invoke-static {p0}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۧ۠ۥۨ(Ljava/lang/Object;)Ljava/io/File;

    move-result-object v0

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->۟ۦۡ۠ۡ()J

    move-result-wide v2

    new-instance v4, Ljava/io/File;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۥۥۣۧ()[S

    move-result-object v6

    const/16 v7, 0x207

    sget v8, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    xor-int/lit16 v8, v8, 0x224

    const/16 v9, 0xcbf

    invoke-static {v6, v7, v8, v9}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟۟۟ۦۢ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {v5, v2, v3}, Landroidx/loader/ۢۥ۟;->۟ۥۣۢۡ(Ljava/lang/Object;J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۥۥۣۧ()[S

    move-result-object v3

    const/16 v5, 0x211

    sget v6, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۨۨ:I

    xor-int/lit16 v6, v6, 0x108

    const/16 v7, 0x54c

    invoke-static {v3, v5, v6, v7}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_0
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-static {}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۣۥۢۢ()Landroid/graphics/Bitmap$CompressFormat;

    move-result-object v3

    sget v5, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v5, v5, 0x179

    invoke-static {v1, v3, v5, v2}, Landroidx/vectordrawable/۟ۤۨۥۣ;->۟ۡۤ۟۠(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)Z

    invoke-static {v2}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۦۢۡۢ(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {v2}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۡ۠ۨ۠(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-static {v1}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۤۡ۠(Ljava/lang/Object;)V

    return-object v4

    :catchall_0
    move-exception v0

    :try_start_3
    invoke-static {v2}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۡ۠ۨ۠(Ljava/lang/Object;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v1

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v0, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    const/16 v2, 0x748

    :goto_2
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eq v0, v1, :cond_2

    const v2, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v2, 0xbe41

    goto :goto_2

    :sswitch_8
    invoke-static {v0, v1}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۨ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v1, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :goto_4
    :sswitch_9
    throw v0

    :sswitch_a
    const v1, 0xbe9e

    goto :goto_3

    :sswitch_b
    move-object v0, v1

    goto :goto_4

    :sswitch_c
    new-instance v0, Ljava/io/IOException;

    invoke-static {}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->ۥۥۣۧ()[S

    move-result-object v1

    const/16 v2, 0x215

    sget v3, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    xor-int/lit16 v3, v3, 0xd3

    const/16 v4, 0x178

    invoke-static {v1, v2, v3, v4}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟۟۠ۤۤ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_c
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_b
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_9
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0xef -> :sswitch_a
    .end sparse-switch
.end method

.method public static ۣ۟۟۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/io/File;
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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/content/Context;

    check-cast p1, Ljava/io/File;

    invoke-static {p0, p1}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->reencodeToJpeg(Landroid/content/Context;Ljava/io/File;)Ljava/io/File;

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

.method public static ۣ۟ۤۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Ljava/io/File;

    check-cast p1, Ljava/io/File;

    check-cast p2, Ljava/io/File;

    check-cast p3, [B

    invoke-static {p0, p1, p2, p3}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->createLivePhotoStreaming(Ljava/io/File;Ljava/io/File;Ljava/io/File;[B)Z

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

.method public static ۟ۤۧ(Ljava/lang/Object;)[B
    .locals 2

    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣ۟()I

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
    check-cast p0, [B

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->createXmpApp1Segment([B)[B

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

.method public static ۟ۦۤۦۨ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣ۟()I

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
    check-cast p0, Ljava/io/File;

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->isLivePhotoValid(Ljava/io/File;)Z

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

.method public static ۤۥ۟(II)Ljava/lang/String;
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
    invoke-static {p0, p1}, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->generateXMPMetadata(II)Ljava/lang/String;

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

.method public static ۥۥۣۧ()[S
    .locals 2

    invoke-static {}, Landroidx/startup/۟ۦۤۨۧ;->ۣۨۢۤ()I

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
    sget-object v0, Lkevin/fun/hook/XhsHook$LivePhotoCreator;->short:[S

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

.method public static ۧ۠۠ۤ(Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۣ۟ۦۣۡ()I

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
    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V

    :sswitch_3
    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->۟ۥ۟ۦ۟()I

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
    const-string v0, "rndeEx8tPQNtECowYd"

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۧ۟۠ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

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
