.class Lkevin/fun/hook/DYHook$WatchItem;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkevin/fun/hook/DYHook;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "WatchItem"
.end annotation


# static fields
.field private static final short:[S


# instance fields
.field authorName:Ljava/lang/String;

.field category:Ljava/lang/String;

.field commentAuthor:Ljava/lang/String;

.field commentId:Ljava/lang/String;

.field commentText:Ljava/lang/String;

.field exportId:Ljava/lang/String;

.field isComment:Z

.field isProfile:Z

.field note:Ljava/lang/String;

.field publishTime:J

.field timestamp:J

.field userAvatarUrl:Ljava/lang/String;

.field userNickname:Ljava/lang/String;

.field userSecUid:Ljava/lang/String;

.field userSignature:Ljava/lang/String;

.field userUid:Ljava/lang/String;

.field userUniqueId:Ljava/lang/String;

.field videoDesc:Ljava/lang/String;

.field videoId:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x212

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/DYHook$WatchItem;->short:[S

    return-void

    :array_0
    .array-data 2
        -0x6a86s
        -0x7ffas
        0x88ds
        -0x7cees
        -0x7c94s
        0x88bs
        0x8f6s
        0x6f9s
        0x6f9s
        0x6f9s
        0x6405s
        0x74cas
        0x7607s
        0x6118s
        -0x2d44s
        -0x29b3s
        0xaa1s
        0x44bas
        -0x6d0cs
        -0xa65s
        -0x6365s
        -0x7619s
        -0x6bd7s
        -0x7eabs
        0x3c2s
        0x3c4s
        0x3d2s
        0x3c5s
        0x3e2s
        0x3des
        0x3d3s
        0x845s
        0x85fs
        0x86fs
        0x843s
        0x841s
        0x841s
        0x849s
        0x842s
        0x858s
        0xc71s
        0xc6bs
        0xc48s
        0xc6as
        0xc77s
        0xc7es
        0xc71s
        0xc74s
        0xc7ds
        0x8dcs
        0x8des
        0x8cbs
        0x8das
        0x8d8s
        0x8d0s
        0x8cds
        0x8c6s
        0x55c1s
        -0x6bbfs
        0x524s
        0x525s
        0x53es
        0x52fs
        0x96es
        0x973s
        0x977s
        0x97fs
        0x969s
        0x96es
        0x97bs
        0x977s
        0x96as
        0x1bcs
        0x1bas
        0x1acs
        0x1bbs
        0x188s
        0x1bfs
        0x1a8s
        0x1bds
        0x1a8s
        0x1bbs
        0x19cs
        0x1bbs
        0x1a5s
        0x886s
        0x883s
        0x894s
        0x89as
        0x89fs
        0x885s
        0x89es
        0x8a2s
        0x89fs
        0x89bs
        0x893s
        0x9efs
        0x9f2s
        0x9fas
        0x9e5s
        0x9f8s
        0x9fes
        0x9c3s
        0x9ees
        0xae0s
        0xae6s
        0xaf0s
        0xae7s
        0xadbs
        0xafcs
        0xaf6s
        0xafes
        0xafbs
        0xaf4s
        0xaf8s
        0xaf0s
        0x877s
        0x871s
        0x867s
        0x870s
        0x857s
        0x86cs
        0x86bs
        0x873s
        0x877s
        0x867s
        0x84bs
        0x866s
        0xc5bs
        0xc5ds
        0xc4bs
        0xc5cs
        0xc7ds
        0xc47s
        0xc49s
        0xc40s
        0xc4fs
        0xc5as
        0xc5bs
        0xc5cs
        0xc4bs
        0x98bs
        0x98ds
        0x99bs
        0x98cs
        0x9ads
        0x99bs
        0x99ds
        0x9abs
        0x997s
        0x99as
        0x1e8s
        0x1f7s
        0x1fas
        0x1fbs
        0x1f1s
        0x1das
        0x1fbs
        0x1eds
        0x1fds
        0x212s
        0x20ds
        0x200s
        0x201s
        0x20bs
        0x22ds
        0x200s
        0x438s
        0x434s
        0x436s
        0x436s
        0x43es
        0x435s
        0x42fs
        0x412s
        0x43fs
        0x2a5s
        0x2a9s
        0x2abs
        0x2abs
        0x2a3s
        0x2a8s
        0x2b2s
        0x292s
        0x2a3s
        0x2bes
        0x2b2s
        0x896s
        0x89as
        0x898s
        0x898s
        0x890s
        0x89bs
        0x881s
        0x8b4s
        0x880s
        0x881s
        0x89ds
        0x89as
        0x887s
        0x2d6s
        0x2c2s
        0x2c3s
        0x2dfs
        0x2d8s
        0x2c5s
        0x2f9s
        0x2d6s
        0x2das
        0x2d2s
        0x31aes
        0x1f5s
        0x1dbs
        0x1c8s
        0x1d7s
        0x1d0s
        0x31afs
        0x19es
        0x1e9s
        0x1dfs
        0x1cas
        0x1dds
        0x1d6s
        0x1f7s
        0x1cas
        0x1dbs
        0x1d3s
        0x190s
        0x1d8s
        0x1ccs
        0x1d1s
        0x1d3s
        0x1f4s
        0x1cds
        0x1d1s
        0x1d0s
        0x588fs
        -0x7365s
        0x184s
        0x19es
        0xbc4s
        0x836s
        0x821s
        0x829s
        0x825s
        0x836s
        0x82fs
        0x527s
        0x52as
        0x4f6s
        0x4eas
        0x1cds
        0x1c7s
        0x1cas
        0x1eds
        0x1fbs
        0x1e9s
        0x1e1s
        0x1e9s
        0x1c5s
        0x1e8s
        0xb62s
        0xb6fs
        0xb66s
        0xb73s
        0x1fas
        0x1ees
        0x1efs
        0x1f3s
        0x1f4s
        0x1e9s
        0x1ces
        0x1f2s
        0x1ffs
        0x770s
        0x761s
        0x77cs
        0x770s
        0xcdfs
        0xcd9s
        0xccfs
        0xcd8s
        0x315s
        0x319s
        0x31bs
        0x31bs
        0x313s
        0x318s
        0x302s
        0x8fds
        0x8e2s
        0x8efs
        0x8ees
        0x8e4s
        0xc09s
        0xc18s
        0xc0fs
        0xc0bs
        0xc1es
        0xc0fs
        0xc3es
        0xc03s
        0xc07s
        0xc0fs
        0x8acs
        0x8aes
        0x8bbs
        0x8aas
        0x8a8s
        0x8a0s
        0x8bds
        0x8b6s
        0x5716s
        -0x696as
        0x200s
        0x214s
        0x215s
        0x209s
        0x20es
        0x213s
        0x22fs
        0x200s
        0x20cs
        0x204s
        0xcdcs
        0xcc8s
        0xcc9s
        0xcd5s
        0xcd2s
        0xccfs
        0xcfcs
        0xccbs
        0xcdcs
        0xcc9s
        0xcdcs
        0xccfs
        0xbfcs
        0xbees
        0xbf9s
        0xbeas
        0xbdbs
        0xbe6s
        0xbe2s
        0xbeas
        0x20fs
        0x21bs
        0x21as
        0x206s
        0x201s
        0x21cs
        0x220s
        0x20fs
        0x203s
        0x20bs
        0x9c5s
        0x9das
        0x9d7s
        0x9d6s
        0x9dcs
        0x9f7s
        0x9d6s
        0x9c0s
        0x9d0s
        0x243s
        0x25cs
        0x251s
        0x250s
        0x25as
        0x27cs
        0x251s
        0x5cds
        0x5d0s
        0x5d4s
        0x5dcs
        0x5cas
        0x5cds
        0x5d8s
        0x5d4s
        0x5c9s
        0x820s
        0x83as
        0x80as
        0x826s
        0x824s
        0x824s
        0x82cs
        0x827s
        0x83ds
        0x4efs
        0x4f5s
        0x4d6s
        0x4f4s
        0x4e9s
        0x4e0s
        0x4efs
        0x4eas
        0x4e3s
        0x4f9s
        0x4f5s
        0x4f7s
        0x4f7s
        0x4ffs
        0x4f4s
        0x4ees
        0x4d3s
        0x4fes
        0x669s
        0x665s
        0x667s
        0x667s
        0x66fs
        0x664s
        0x67es
        0x65es
        0x66fs
        0x672s
        0x67es
        0x5d3s
        0x5dfs
        0x5dds
        0x5dds
        0x5d5s
        0x5des
        0x5c4s
        0x5f1s
        0x5c5s
        0x5c4s
        0x5d8s
        0x5dfs
        0x5c2s
        0x989s
        0x98fs
        0x999s
        0x98es
        0x9b2s
        0x995s
        0x99fs
        0x997s
        0x992s
        0x99ds
        0x991s
        0x999s
        0x38fs
        0x389s
        0x39fs
        0x388s
        0x3afs
        0x394s
        0x393s
        0x38bs
        0x38fs
        0x39fs
        0x3b3s
        0x39es
        0x9cfs
        0x9c9s
        0x9dfs
        0x9c8s
        0x9e9s
        0x9d3s
        0x9dds
        0x9d4s
        0x9dbs
        0x9ces
        0x9cfs
        0x9c8s
        0x9dfs
        0x381s
        0x387s
        0x391s
        0x386s
        0x3a7s
        0x391s
        0x397s
        0x3a1s
        0x39ds
        0x390s
        0x2f0s
        0x2f6s
        0x2e0s
        0x2f7s
        0x2d0s
        0x2ecs
        0x2e1s
        0x714s
        0x712s
        0x704s
        0x713s
        0x720s
        0x717s
        0x700s
        0x715s
        0x700s
        0x713s
        0x734s
        0x713s
        0x70ds
        0x440s
        0x445s
        0x452s
        0x45cs
        0x459s
        0x443s
        0x458s
        0x464s
        0x459s
        0x45ds
        0x455s
        0xce3s
        0xce1s
        0xcf4s
        0xce5s
        0xce7s
        0xcefs
        0xcf2s
        0xcf9s
        0x5b5es
        -0x6522s
        0xad5s
        0xad4s
        0xacfs
        0xades
        0x98cs
        0x991s
        0x999s
        0x986s
        0x99bs
        0x99ds
        0x9a0s
        0x98ds
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V
    .locals 5

    const/4 v4, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/DYHook$WatchItem;->videoId:Ljava/lang/String;

    iput-object p2, p0, Lkevin/fun/hook/DYHook$WatchItem;->commentId:Ljava/lang/String;

    iput-object p3, p0, Lkevin/fun/hook/DYHook$WatchItem;->commentText:Ljava/lang/String;

    iput-object p4, p0, Lkevin/fun/hook/DYHook$WatchItem;->commentAuthor:Ljava/lang/String;

    iput-object p5, p0, Lkevin/fun/hook/DYHook$WatchItem;->userAvatarUrl:Ljava/lang/String;

    invoke-static {p6}, Landroidx/appcompat/resources/ۦۨۦۢ;->ۣۤ۠(Ljava/lang/Object;)J

    move-result-wide v0

    iput-wide v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->publishTime:J

    iput-object p7, p0, Lkevin/fun/hook/DYHook$WatchItem;->userUid:Ljava/lang/String;

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->۟ۦۡ۠ۡ()J

    move-result-wide v0

    iput-wide v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->timestamp:J

    const/4 v0, 0x1

    iput-boolean v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->isComment:Z

    iput-boolean v4, p0, Lkevin/fun/hook/DYHook$WatchItem;->isProfile:Z

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v0

    sget v1, Landroidx/startup/۟ۦۤۨۧ;->ۧۡۡۦ:I

    xor-int/lit16 v1, v1, -0x118

    const/16 v2, 0xba2

    invoke-static {v0, v4, v1, v2}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۤ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->category:Ljava/lang/String;

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->note:Ljava/lang/String;

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۧۢۦۣ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->exportId:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v0

    const/4 v1, 0x2

    sget v2, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    xor-int/lit16 v2, v2, -0x25d

    const/16 v3, 0x8d6

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۨۦۣۨ([SIII)Ljava/lang/String;

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
    if-eqz p3, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p3}, Landroidx/emoji2/ۢۧۡۧ;->ۤۥۨۢ(Ljava/lang/Object;)I

    move-result v2

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x32

    if-le v2, v0, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    sget v0, Lorg/luckypray/dexkit/۠۠ۥ;->ۣ۟ۡۢۡ:I

    xor-int/lit16 v0, v0, -0xce

    invoke-static {p3, v4, v0}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->۟ۦ۠ۡ۠(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v2, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v1

    const/4 v2, 0x7

    sget v3, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/lit8 v3, v3, -0x37

    const/16 v4, 0x6d7

    invoke-static {v1, v2, v3, v4}, Landroidx/startup/ۤۧۥۣ;->۟ۧۦ۠ۦ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->videoDesc:Ljava/lang/String;

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :sswitch_7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v0, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0, p3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->videoDesc:Ljava/lang/String;

    :sswitch_8
    invoke-static {}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۤۦۥۥ()I

    move-result v1

    const v0, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_9
    const v0, 0xbebd

    goto :goto_3

    :sswitch_a
    if-ltz v1, :cond_2

    const v0, 0xbedc

    goto :goto_3

    :sswitch_b
    const-string v0, "v52Zz3GFJyfXO4MrF"

    invoke-static {v0}, Landroidx/activity/ۦۧۥۥ;->ۧۧ۠ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

    :sswitch_c
    return-void

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
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_8
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_c
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/DYHook$WatchItem;->userNickname:Ljava/lang/String;

    iput-object p2, p0, Lkevin/fun/hook/DYHook$WatchItem;->userUniqueId:Ljava/lang/String;

    iput-object p3, p0, Lkevin/fun/hook/DYHook$WatchItem;->userSignature:Ljava/lang/String;

    iput-object p4, p0, Lkevin/fun/hook/DYHook$WatchItem;->userSecUid:Ljava/lang/String;

    iput-object p5, p0, Lkevin/fun/hook/DYHook$WatchItem;->userUid:Ljava/lang/String;

    iput-object p1, p0, Lkevin/fun/hook/DYHook$WatchItem;->authorName:Ljava/lang/String;

    iput-object p6, p0, Lkevin/fun/hook/DYHook$WatchItem;->userAvatarUrl:Ljava/lang/String;

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
    if-eqz p1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :sswitch_4
    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v0

    const/16 v1, 0xa

    sget v2, Landroidx/activity/ۣۦۡۥ;->ۣۢۤۡ:I

    xor-int/lit8 v2, v2, 0x6

    const/16 v3, 0x32f

    invoke-static {v0, v1, v2, v3}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۤ۠ۡ([SIII)Ljava/lang/String;

    move-result-object p1

    :sswitch_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v1

    const/16 v2, 0xe

    sget v3, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    xor-int/lit16 v3, v3, 0x295

    const/16 v4, 0xa81

    invoke-static {v1, v2, v3, v4}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟ۧۢۥ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0, p1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->videoDesc:Ljava/lang/String;

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->۟ۦۡ۠ۡ()J

    move-result-wide v0

    iput-wide v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->timestamp:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->isComment:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->isProfile:Z

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v0

    const/16 v1, 0x14

    sget v2, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v2, v2, 0x31d

    const/16 v3, 0x243

    invoke-static {v0, v1, v2, v3}, Landroidx/drawerlayout/ۤۨۡۤ;->ۤ۠ۤ۠([SIII)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->category:Ljava/lang/String;

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->note:Ljava/lang/String;

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۧۢۦۣ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->exportId:Ljava/lang/String;

    invoke-static {}, Landroidx/loader/ۥۧۨۤ;->ۣۡۧۨ()I

    move-result v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-ltz v1, :cond_1

    const v0, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    const-string v0, "zi5Li7G1kCbZWGidZ2rHnMKowygo"

    invoke-static {v0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۣ۠ۧ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_9
    return-void

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
        0x11 -> :sswitch_3
        0x36 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_9
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch
.end method

.method public constructor <init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V
    .locals 4

    const/4 v2, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lkevin/fun/hook/DYHook$WatchItem;->authorName:Ljava/lang/String;

    iput-object p5, p0, Lkevin/fun/hook/DYHook$WatchItem;->videoDesc:Ljava/lang/String;

    iput-object p3, p0, Lkevin/fun/hook/DYHook$WatchItem;->userUid:Ljava/lang/String;

    iput-object p4, p0, Lkevin/fun/hook/DYHook$WatchItem;->userAvatarUrl:Ljava/lang/String;

    iput-object p6, p0, Lkevin/fun/hook/DYHook$WatchItem;->videoId:Ljava/lang/String;

    invoke-static {p7}, Landroidx/appcompat/resources/ۦۨۦۢ;->ۣۤ۠(Ljava/lang/Object;)J

    move-result-wide v0

    iput-wide v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->publishTime:J

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->۟ۦۡ۠ۡ()J

    move-result-wide v0

    iput-wide v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->timestamp:J

    iput-boolean v2, p0, Lkevin/fun/hook/DYHook$WatchItem;->isComment:Z

    iput-boolean v2, p0, Lkevin/fun/hook/DYHook$WatchItem;->isProfile:Z

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v0

    const/16 v1, 0x16

    sget v2, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    xor-int/lit16 v2, v2, 0xc1

    const/16 v3, 0xaf1

    invoke-static {v0, v1, v2, v3}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣ۟۠ۢۡ([SIII)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->category:Ljava/lang/String;

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->note:Ljava/lang/String;

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۧۢۦۣ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->exportId:Ljava/lang/String;

    invoke-static {}, Landroidx/core/ۧ۟ۤۨ;->۟ۦ۠ۢ()I

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
    const-string v0, "iVs9RPqj41MyGoiuQ9PMnIz9x2f"

    invoke-static {v0}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۥ۟ۡۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

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

.method public static fromJson(Ljava/lang/String;)Lkevin/fun/hook/DYHook$WatchItem;
    .locals 26

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v2

    const/16 v3, 0x18

    sget v4, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    xor-int/lit16 v4, v4, -0x219

    const/16 v5, 0x3b7

    invoke-static {v2, v3, v4, v5}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v7

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    move-result-object v14

    :try_start_0
    new-instance v15, Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    move-object/from16 v0, p0

    invoke-direct {v15, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v2

    const/16 v3, 0x1f

    sget v4, Landroidx/startup/۟ۦۤۨۧ;->ۧۡۡۦ:I

    xor-int/lit16 v4, v4, -0x11d

    const/16 v5, 0x82c

    invoke-static {v2, v3, v4, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۡۧۨ([SIII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v15, v2, v3}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۨۢۦۡ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v3

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v2

    const/16 v4, 0x28

    sget v5, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    xor-int/lit16 v5, v5, 0x1b6

    const/16 v6, 0xc18

    invoke-static {v2, v4, v5, v6}, Landroidx/activity/ۣۦۡۥ;->۟ۡۨ۟۟([SIII)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    invoke-static {v15, v2, v4}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۨۢۦۡ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v4

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v2

    const/16 v5, 0x31

    sget v6, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v6, v6, 0x206

    const/16 v8, 0x8bf

    invoke-static {v2, v5, v6, v8}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v5

    const/16 v6, 0x39

    sget v8, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    xor-int/lit16 v8, v8, 0x28f

    const/16 v9, 0x4a9

    invoke-static {v5, v6, v8, v9}, Landroidx/loader/۟۠ۢۧۡ;->ۢ۟ۨۥ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v15, v2, v5}, Landroidx/loader/۟۠ۢۧۡ;->ۣ۟ۨ۠۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v19

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v2

    const/16 v5, 0x3b

    sget v6, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/lit8 v6, v6, 0x4d

    const/16 v8, 0x54a

    invoke-static {v2, v5, v6, v8}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۢ۠ۥۨ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v15, v2, v14}, Landroidx/loader/۟۠ۢۧۡ;->ۣ۟ۨ۠۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v20

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v2

    const/16 v5, 0x3f

    sget v6, Landroidx/activity/ۣۦۡۥ;->ۣۢۤۡ:I

    xor-int/lit8 v6, v6, 0xb

    const/16 v8, 0x91a

    invoke-static {v2, v5, v6, v8}, Landroidx/loader/ۢۥ۟;->۟ۧ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v2

    const-wide/16 v8, 0x382

    sget v5, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    int-to-long v10, v5

    xor-long/2addr v10, v8

    invoke-static {v15, v2, v10, v11}, Landroidx/drawerlayout/ۤۨۡۤ;->۟۠ۤۢۥ(Ljava/lang/Object;Ljava/lang/Object;J)J

    move-result-wide v22

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v2

    const/16 v5, 0x48

    sget v6, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/lit8 v6, v6, 0x44

    const/16 v8, 0x1c9

    invoke-static {v2, v5, v6, v8}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۦۤۢۦ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v15, v2, v14}, Landroidx/loader/۟۠ۢۧۡ;->ۣ۟ۨ۠۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v2

    const/16 v5, 0x55

    sget v6, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۢ۟ۡ:I

    xor-int/lit16 v6, v6, -0x265

    const/16 v9, 0x8f6

    invoke-static {v2, v5, v6, v9}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣ۟۠ۢۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v15, v2, v10, v11}, Landroidx/drawerlayout/ۤۨۡۤ;->۟۠ۤۢۥ(Ljava/lang/Object;Ljava/lang/Object;J)J

    move-result-wide v24

    invoke-static {v15, v7, v14}, Landroidx/loader/۟۠ۢۧۡ;->ۣ۟ۨ۠۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v2

    const/16 v5, 0x60

    sget v6, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v6, v6, 0x2f6

    const/16 v9, 0x98a

    invoke-static {v2, v5, v6, v9}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣ۟۠ۢۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v15, v2, v14}, Landroidx/loader/۟۠ۢۧۡ;->ۣ۟ۨ۠۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v21

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
    if-eqz v4, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    new-instance v2, Lkevin/fun/hook/DYHook$WatchItem;

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v3

    const/16 v4, 0x68

    sget v5, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۡۨۨۧ:I

    xor-int/lit16 v5, v5, -0x1ec

    const/16 v6, 0xa95

    invoke-static {v3, v4, v5, v6}, Landroidx/activity/ۤۧۧۧ;->ۣ۟۟۠ۡ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v15, v3, v14}, Landroidx/loader/۟۠ۢۧۡ;->ۣ۟ۨ۠۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v4

    const/16 v5, 0x74

    sget v6, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    xor-int/lit16 v6, v6, -0x3d0

    const/16 v9, 0x802

    invoke-static {v4, v5, v6, v9}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟ۧۢۥ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v15, v4, v14}, Landroidx/loader/۟۠ۢۧۡ;->ۣ۟ۨ۠۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v5

    const/16 v6, 0x80

    sget v9, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    xor-int/lit16 v9, v9, -0x255

    const/16 v10, 0xc2e

    invoke-static {v5, v6, v9, v10}, Landroidx/customview/ۤۡۥ;->۟ۢۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v15, v5, v14}, Landroidx/loader/۟۠ۢۧۡ;->ۣ۟ۨ۠۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v6

    const/16 v9, 0x8d

    sget v10, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    xor-int/lit16 v10, v10, 0x287

    const/16 v11, 0x9fe

    invoke-static {v6, v9, v10, v11}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢۦۤ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v15, v6, v14}, Landroidx/loader/۟۠ۢۧۡ;->ۣ۟ۨ۠۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v15, v7, v14}, Landroidx/loader/۟۠ۢۧۡ;->ۣ۟ۨ۠۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const/4 v9, 0x1

    invoke-direct/range {v2 .. v9}, Lkevin/fun/hook/DYHook$WatchItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-wide/from16 v0, v22

    iput-wide v0, v2, Lkevin/fun/hook/DYHook$WatchItem;->timestamp:J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const/16 v3, 0x6cc

    :goto_1
    xor-int/lit16 v3, v3, 0x6dd

    sparse-switch v3, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v3, 0x6eb

    goto :goto_1

    :sswitch_4
    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v2

    const/16 v4, 0x97

    sget v5, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v5, v5, 0x316

    const/16 v6, 0x19e

    invoke-static {v2, v4, v5, v6}, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۥۧۤ([SIII)Ljava/lang/String;

    move-result-object v16

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v2

    const/16 v4, 0xa0

    sget v5, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/lit8 v5, v5, -0x15

    const/16 v6, 0x264

    invoke-static {v2, v4, v5, v6}, Landroidx/core/ۤۦ۟ۢ;->ۣۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v4

    const/16 v2, 0x748

    :goto_2
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_2

    :sswitch_5
    if-eqz v3, :cond_1

    const v2, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_6
    const v2, 0xbe41

    goto :goto_2

    :sswitch_7
    :try_start_2
    new-instance v3, Lkevin/fun/hook/DYHook$WatchItem;

    invoke-static {v15, v4, v14}, Landroidx/loader/۟۠ۢۧۡ;->ۣ۟ۨ۠۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v2

    const/16 v5, 0xa7

    sget v6, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣ۠ۢۢ:I

    xor-int/lit8 v6, v6, -0x68

    const/16 v7, 0x45b

    invoke-static {v2, v5, v6, v7}, Lorg/luckypray/dexkit/۠۠ۥ;->۟ۥۧۦ۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v15, v2, v14}, Landroidx/loader/۟۠ۢۧۡ;->ۣ۟ۨ۠۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v2

    const/16 v6, 0xb0

    sget v7, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    xor-int/lit16 v7, v7, 0x26c

    const/16 v9, 0x2c6

    invoke-static {v2, v6, v7, v9}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۤۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v15, v2, v14}, Landroidx/loader/۟۠ۢۧۡ;->ۣ۟ۨ۠۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v2

    const/16 v7, 0xbb

    sget v9, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    xor-int/lit16 v9, v9, 0x25e

    const/16 v11, 0x8f5

    invoke-static {v2, v7, v9, v11}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣۣ۟ۤۤ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v15, v2, v14}, Landroidx/loader/۟۠ۢۧۡ;->ۣ۟ۨ۠۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-static/range {v24 .. v25}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟۟۟ۦۤ(J)Ljava/lang/Long;

    move-result-object v9

    invoke-direct/range {v3 .. v10}, Lkevin/fun/hook/DYHook$WatchItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V

    move-object/from16 v0, v16

    invoke-static {v15, v0, v14}, Landroidx/loader/۟۠ۢۧۡ;->ۣ۟ۨ۠۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v3, Lkevin/fun/hook/DYHook$WatchItem;->videoDesc:Ljava/lang/String;

    move-wide/from16 v0, v22

    iput-wide v0, v3, Lkevin/fun/hook/DYHook$WatchItem;->timestamp:J

    const v2, 0xbe7f

    :goto_3
    const v4, 0xbe90

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_3

    goto :goto_3

    :sswitch_8
    move-object v2, v3

    :goto_4
    :sswitch_9
    move-object/from16 v0, v19

    iput-object v0, v2, Lkevin/fun/hook/DYHook$WatchItem;->category:Ljava/lang/String;

    move-object/from16 v0, v20

    iput-object v0, v2, Lkevin/fun/hook/DYHook$WatchItem;->note:Ljava/lang/String;

    move-object/from16 v0, v21

    iput-object v0, v2, Lkevin/fun/hook/DYHook$WatchItem;->exportId:Ljava/lang/String;

    :goto_5
    return-object v2

    :sswitch_a
    const v2, 0xbe9e

    goto :goto_3

    :sswitch_b
    new-instance v11, Lkevin/fun/hook/DYHook$WatchItem;

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v2

    const/16 v3, 0xc8

    sget v5, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    xor-int/lit16 v5, v5, 0x86

    const/16 v6, 0x2b7

    invoke-static {v2, v3, v5, v6}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۢ۠ۥۨ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v15, v2, v14}, Landroidx/loader/۟۠ۢۧۡ;->ۣ۟ۨ۠۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    const/4 v12, 0x1

    move-object/from16 v0, v16

    invoke-static {v15, v0, v14}, Landroidx/loader/۟۠ۢۧۡ;->ۣ۟ۨ۠۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v16

    invoke-static {v15, v4, v14}, Landroidx/loader/۟۠ۢۧۡ;->ۣ۟ۨ۠۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v17

    invoke-static/range {v24 .. v25}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟۟۟ۦۤ(J)Ljava/lang/Long;

    move-result-object v18

    move-object v14, v10

    move-object v15, v8

    invoke-direct/range {v11 .. v18}, Lkevin/fun/hook/DYHook$WatchItem;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    move-wide/from16 v0, v22

    iput-wide v0, v11, Lkevin/fun/hook/DYHook$WatchItem;->timestamp:J
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    move-object v2, v11

    goto :goto_4

    :catch_0
    move-exception v2

    const v3, 0xbefb

    :goto_6
    const v4, 0xbf0c

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_4

    goto :goto_6

    :goto_7
    :sswitch_c
    invoke-static {v2}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۤ۟۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v4

    const/16 v5, 0xd2

    sget v6, Landroidx/customview/ۤۡۥ;->ۣ۟ۢۥۢ:I

    xor-int/lit8 v6, v6, -0x7c

    const/16 v7, 0x1be

    invoke-static {v4, v5, v6, v7}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۢۦۣ۠([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v3, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۥ۟ۦۤ(Ljava/lang/Object;)V

    const/4 v2, 0x0

    goto :goto_5

    :sswitch_d
    const v3, 0xbf1a

    goto :goto_6

    :catch_1
    move-exception v2

    goto :goto_7

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
        0x36 -> :sswitch_9
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_5
        0xb918 -> :sswitch_b
        0xb939 -> :sswitch_7
        0xb97b -> :sswitch_6
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x1f7 -> :sswitch_d
    .end sparse-switch
.end method

.method private generateExportId()Ljava/lang/String;
    .locals 10

    const/4 v1, 0x0

    const-wide/16 v8, 0x0

    const-string v7, "\u06e2\u06e1\u06e3"

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

    invoke-static {v2}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۤۦۧۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e1\u06df\u06e7"

    move-object v7, v1

    goto :goto_0

    :sswitch_0
    invoke-static {}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->۟ۡۡۥۡ()Ljava/util/UUID;

    move-result-object v1

    const-string v7, "\u06e1\u06e8\u06e2"

    move-object v2, v1

    goto :goto_0

    :sswitch_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "\u06df\u06e3\u06e1"

    move-object v4, v1

    goto :goto_0

    :sswitch_2
    invoke-static {v4, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v7, "\u06e8\u06e2\u06e1"

    move-object v6, v1

    goto :goto_0

    :sswitch_3
    invoke-static {v4, v8, v9}, Landroidx/loader/ۢۥ۟;->۟ۥۣۢۡ(Ljava/lang/Object;J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v7, "\u06e6\u06e7\u06e7"

    move-object v6, v1

    goto :goto_0

    :sswitch_4
    invoke-static {v6, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v7, "\u06e6\u06e0\u06e8"

    move-object v4, v1

    goto :goto_0

    :sswitch_5
    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v1

    const-string v7, "\u06e6\u06e1\u06e0"

    move-object v3, v1

    goto :goto_0

    :sswitch_6
    invoke-static {v6}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e8\u06e6\u06e7"

    move-object v5, v1

    goto :goto_0

    :sswitch_7
    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->۟ۦۡ۠ۡ()J

    move-result-wide v8

    const-string v1, "\u06e4\u06e7"

    move-object v7, v1

    goto :goto_0

    :sswitch_8
    const/16 v1, 0xf0

    const/4 v5, 0x1

    const/16 v7, 0xb9b

    invoke-static {v3, v1, v5, v7}, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۡۨۧ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e2\u06e4\u06e3"

    move-object v5, v1

    goto :goto_0

    :sswitch_9
    return-object v5

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc83 -> :sswitch_0
        0x1aa77d -> :sswitch_3
        0x1aae89 -> :sswitch_1
        0x1ab284 -> :sswitch_7
        0x1ab2e1 -> :sswitch_4
        0x1ac16e -> :sswitch_2
        0x1ac185 -> :sswitch_8
        0x1ac246 -> :sswitch_5
        0x1ac927 -> :sswitch_6
        0x1ac9a9 -> :sswitch_9
    .end sparse-switch
.end method

.method public static ۟۟ۨ۠ۥ(Ljava/lang/Object;)Ljava/lang/String;
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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook$WatchItem;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->userSignature:Ljava/lang/String;

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

.method public static ۟۠ۢۡۡ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/core/ۧ۟ۤۨ;->۟ۦ۠ۢ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$WatchItem;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->userNickname:Ljava/lang/String;

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

.method public static ۣ۟۠ۦۥ(Ljava/lang/Object;)Ljava/lang/String;
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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook$WatchItem;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->userUid:Ljava/lang/String;

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

.method public static ۟ۡۤ۠ۢ(Ljava/lang/Object;)Ljava/lang/String;
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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook$WatchItem;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->videoDesc:Ljava/lang/String;

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

.method public static ۣ۟ۡ۠ۤ(Ljava/lang/Object;)Ljava/lang/String;
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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook$WatchItem;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->commentText:Ljava/lang/String;

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

.method public static ۟ۤۡۥۧ(Ljava/lang/Object;)Z
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
    check-cast p0, Lkevin/fun/hook/DYHook$WatchItem;

    iget-boolean v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->isComment:Z

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

.method public static ۟ۤۤۨۡ()[S
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
    sget-object v0, Lkevin/fun/hook/DYHook$WatchItem;->short:[S

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

.method public static ۟ۥ۟ۥۣ(Ljava/lang/Object;)Ljava/lang/String;
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
    check-cast p0, Lkevin/fun/hook/DYHook$WatchItem;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->videoId:Ljava/lang/String;

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

.method public static ۟ۥ۟ۦۤ(Ljava/lang/Object;)V
    .locals 2

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
    if-ltz v1, :cond_0

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

.method public static ۟ۥ۠ۢ(Ljava/lang/Object;)Z
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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook$WatchItem;

    iget-boolean v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->isProfile:Z

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

.method public static ۟ۥۡ۠۟(Ljava/lang/Object;)Ljava/lang/String;
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
    check-cast p0, Lkevin/fun/hook/DYHook$WatchItem;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->exportId:Ljava/lang/String;

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

.method public static ۟ۦۥۧۡ(Ljava/lang/Object;)Ljava/lang/String;
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
    check-cast p0, Lkevin/fun/hook/DYHook$WatchItem;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->note:Ljava/lang/String;

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

.method public static ۠ۢ۟۟(Ljava/lang/Object;)Ljava/lang/String;
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
    check-cast p0, Lkevin/fun/hook/DYHook$WatchItem;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->userAvatarUrl:Ljava/lang/String;

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

.method public static ۣۢۢۧ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۡۢۦ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$WatchItem;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->commentAuthor:Ljava/lang/String;

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

.method public static ۣۨۥ(Ljava/lang/Object;)Ljava/lang/String;
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
    check-cast p0, Lkevin/fun/hook/DYHook$WatchItem;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->userUniqueId:Ljava/lang/String;

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

.method public static ۥۣۤۨ(Ljava/lang/Object;)J
    .locals 3

    invoke-static {}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۣۨ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$WatchItem;

    iget-wide v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->timestamp:J

    :sswitch_3
    return-wide v0

    :sswitch_4
    const-wide/16 v0, 0x0

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v2, 0x6eb

    goto :goto_1

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

.method public static ۦۦ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook$WatchItem;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->authorName:Ljava/lang/String;

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

.method public static ۧ۟ۨۡ(Ljava/lang/Object;)Ljava/lang/String;
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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook$WatchItem;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->category:Ljava/lang/String;

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

.method public static ۧۢۦۣ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/activity/ۨ۠۟ۧ;->ۤۥۡ۠()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$WatchItem;

    invoke-direct {p0}, Lkevin/fun/hook/DYHook$WatchItem;->generateExportId()Ljava/lang/String;

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

.method public static ۣۧۤۥ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۡۢۦ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$WatchItem;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->userSecUid:Ljava/lang/String;

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

.method public static ۧۦ۠۟(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/activity/ۦۧۥۥ;->ۣ۠ۦۤ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$WatchItem;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->commentId:Ljava/lang/String;

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

.method public static ۨۡۧۧ(Ljava/lang/Object;)J
    .locals 3

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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook$WatchItem;

    iget-wide v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->publishTime:J

    :sswitch_3
    return-wide v0

    :sswitch_4
    const-wide/16 v0, 0x0

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v2, 0x6eb

    goto :goto_1

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
.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    const/4 v1, 0x0

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
    if-ne p0, p1, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz p1, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {p0}, Landroidx/emoji2/ۢۧۡۧ;->۟ۤۤۨۢ(Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object v3

    invoke-static {p1}, Landroidx/emoji2/ۢۧۡۧ;->۟ۤۤۨۢ(Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object v4

    const/16 v2, 0x748

    :goto_2
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eq v3, v4, :cond_2

    const v2, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v2, 0xbe41

    goto :goto_2

    :sswitch_8
    const v0, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :sswitch_9
    move v0, v1

    :goto_4
    :sswitch_a
    return v0

    :sswitch_b
    const v0, 0xbe9e

    goto :goto_3

    :sswitch_c
    check-cast p1, Lkevin/fun/hook/DYHook$WatchItem;

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۥۡ۠۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const v2, 0xbefb

    :goto_5
    const v4, 0xbf0c

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_4

    goto :goto_5

    :cond_3
    :sswitch_d
    const v2, 0xbf39

    goto :goto_5

    :sswitch_e
    if-eqz v3, :cond_3

    const v2, 0xc1e3

    goto :goto_5

    :sswitch_f
    invoke-static {p1}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۥۡ۠۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const v2, 0xc202

    :goto_6
    const v4, 0xc213

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_5

    goto :goto_6

    :sswitch_10
    if-eqz v3, :cond_4

    const v2, 0xc25f

    goto :goto_6

    :cond_4
    :sswitch_11
    const v2, 0xc240

    goto :goto_6

    :sswitch_12
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۥۡ۠۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۥۡ۠۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    goto :goto_4

    :sswitch_13
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۡۥۧ(Ljava/lang/Object;)Z

    move-result v3

    const v2, 0xc27e

    :goto_7
    const v4, 0xc28f

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_6

    goto :goto_7

    :cond_5
    :sswitch_14
    const v2, 0xc2bc

    goto :goto_7

    :sswitch_15
    if-eqz v3, :cond_5

    const v2, 0xc2db

    goto :goto_7

    :sswitch_16
    invoke-static {p1}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۡۥۧ(Ljava/lang/Object;)Z

    move-result v3

    const v2, 0xc2fa

    :goto_8
    const v4, 0xc30b

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_7

    goto :goto_8

    :sswitch_17
    if-eqz v3, :cond_6

    const v2, 0xc5e2

    goto :goto_8

    :cond_6
    :sswitch_18
    const v2, 0xc5c3

    goto :goto_8

    :sswitch_19
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۥ۟ۥۣ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۥ۟ۥۣ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۣ۟ۡۥۤ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const v2, 0xc601

    :goto_9
    const v4, 0xc612

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_8

    goto :goto_9

    :sswitch_1a
    if-eqz v3, :cond_7

    const v2, 0xc65e

    goto :goto_9

    :cond_7
    :sswitch_1b
    const v2, 0xc63f

    goto :goto_9

    :sswitch_1c
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۧۦ۠۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Lkevin/fun/hook/DYHook$WatchItem;->ۧۦ۠۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۣ۟ۡۥۤ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const v2, 0xc67d

    :goto_a
    const v4, 0xc68e

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_9

    goto :goto_a

    :cond_8
    :sswitch_1d
    const v2, 0xc6bb

    goto :goto_a

    :sswitch_1e
    if-eqz v3, :cond_8

    const v2, 0xc965

    goto :goto_a

    :sswitch_1f
    move v0, v1

    goto/16 :goto_4

    :sswitch_20
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۥ۠ۢ(Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xc984

    :goto_b
    const v3, 0xc995

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_a

    goto :goto_b

    :sswitch_21
    if-eqz v2, :cond_9

    const v0, 0xc9e1

    goto :goto_b

    :cond_9
    :sswitch_22
    const v0, 0xc9c2

    goto :goto_b

    :sswitch_23
    invoke-static {p1}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۥ۠ۢ(Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xca00

    :goto_c
    const v3, 0xca11

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_b

    goto :goto_c

    :cond_a
    :sswitch_24
    const v0, 0xca3e

    goto :goto_c

    :sswitch_25
    if-eqz v2, :cond_a

    const v0, 0xca5d

    goto :goto_c

    :sswitch_26
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۣ۟۠ۦۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Lkevin/fun/hook/DYHook$WatchItem;->ۣ۟۠ۦۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۣ۟ۡۥۤ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    goto/16 :goto_4

    :sswitch_27
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۡۥۧ(Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xca7c

    :goto_d
    const v3, 0xca8d

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_c

    goto :goto_d

    :sswitch_28
    if-nez v2, :cond_b

    const v0, 0xcd64

    goto :goto_d

    :cond_b
    :sswitch_29
    const v0, 0xcd45

    goto :goto_d

    :sswitch_2a
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۥ۠ۢ(Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xcd83

    :goto_e
    const v3, 0xcd94

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_d

    goto :goto_e

    :sswitch_2b
    if-nez v2, :cond_c

    const v0, 0xcde0

    goto :goto_e

    :cond_c
    :sswitch_2c
    const v0, 0xcdc1

    goto :goto_e

    :sswitch_2d
    invoke-static {p1}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۡۥۧ(Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xcdff

    :goto_f
    const v3, 0xce10

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_e

    goto :goto_f

    :cond_d
    :sswitch_2e
    const v0, 0xce3d

    goto :goto_f

    :sswitch_2f
    if-nez v2, :cond_d

    const v0, 0xd0e7

    goto :goto_f

    :sswitch_30
    invoke-static {p1}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۥ۠ۢ(Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xd106

    :goto_10
    const v3, 0xd117

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_f

    goto :goto_10

    :sswitch_31
    if-nez v2, :cond_e

    const v0, 0xd163

    goto :goto_10

    :cond_e
    :sswitch_32
    const v0, 0xd144

    goto :goto_10

    :sswitch_33
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۥ۟ۥۣ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۥ۟ۥۣ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۣ۟ۡۥۤ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    goto/16 :goto_4

    :sswitch_34
    move v0, v1

    goto/16 :goto_4

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_a
        0xef -> :sswitch_2
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
        0x35 -> :sswitch_13
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
        0x33 -> :sswitch_20
        0x54 -> :sswitch_16
        0xf1 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_17
        0x6af -> :sswitch_18
        0x6c8 -> :sswitch_20
        0x6e9 -> :sswitch_19
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_1a
        0x2d -> :sswitch_1f
        0x32 -> :sswitch_1b
        0x4c -> :sswitch_1c
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1d
        0x35 -> :sswitch_1f
        0xf3 -> :sswitch_1e
        0xfeb -> :sswitch_a
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_21
        0x36 -> :sswitch_22
        0x57 -> :sswitch_27
        0x74 -> :sswitch_23
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_24
        0x11 -> :sswitch_25
        0x2f -> :sswitch_27
        0x4c -> :sswitch_26
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_28
        0x7ab -> :sswitch_29
        0x7c8 -> :sswitch_34
        0x7e9 -> :sswitch_2a
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_2b
        0x36 -> :sswitch_2c
        0x55 -> :sswitch_34
        0x74 -> :sswitch_2d
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_2e
        0x2d -> :sswitch_34
        0x3ef -> :sswitch_2f
        0x1ef7 -> :sswitch_30
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_31
        0x32 -> :sswitch_32
        0x53 -> :sswitch_34
        0x74 -> :sswitch_33
    .end sparse-switch
.end method

.method public hashCode()I
    .locals 5

    const/4 v3, 0x3

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۥۡ۠۟(Ljava/lang/Object;)Ljava/lang/String;

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
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۥۡ۠۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->۟۟ۢۦ۟(Ljava/lang/Object;)I

    move-result v0

    :goto_1
    return v0

    :sswitch_3
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۡۥۧ(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x6cc

    :goto_2
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    :sswitch_4
    if-eqz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_2

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_2

    :sswitch_6
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۥ۟ۥۣ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۧۦ۠۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۡۥۧ(Ljava/lang/Object;)Z

    move-result v2

    invoke-static {v2}, Landroidx/loader/ۡۢۢ;->ۤۨۡۥ(Z)Ljava/lang/Boolean;

    move-result-object v2

    new-array v3, v3, [Ljava/lang/Object;

    sget v4, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    xor-int/lit16 v4, v4, -0x220

    aput-object v0, v3, v4

    sget v0, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۤ۟ۧۤ:I

    xor-int/lit16 v0, v0, -0x1e7

    aput-object v1, v3, v0

    sget v0, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v0, v0, 0x2fc

    aput-object v2, v3, v0

    invoke-static {v3}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟۠ۤۦ۠(Ljava/lang/Object;)I

    move-result v0

    goto :goto_1

    :sswitch_7
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۥ۠ۢ(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x748

    :goto_3
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :sswitch_8
    if-eqz v1, :cond_2

    const v0, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_9
    const v0, 0xbe41

    goto :goto_3

    :sswitch_a
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۣ۟۠ۦۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۥ۠ۢ(Ljava/lang/Object;)Z

    move-result v1

    invoke-static {v1}, Landroidx/loader/ۡۢۢ;->ۤۨۡۥ(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    sget v3, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v3, v3, 0x126

    aput-object v0, v2, v3

    sget v0, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v0, v0, 0x2ff

    aput-object v1, v2, v0

    invoke-static {v2}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟۠ۤۦ۠(Ljava/lang/Object;)I

    move-result v0

    goto :goto_1

    :sswitch_b
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۥ۟ۥۣ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۡۥۧ(Ljava/lang/Object;)Z

    move-result v1

    invoke-static {v1}, Landroidx/loader/ۡۢۢ;->ۤۨۡۥ(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۥ۠ۢ(Ljava/lang/Object;)Z

    move-result v2

    invoke-static {v2}, Landroidx/loader/ۡۢۢ;->ۤۨۡۥ(Z)Ljava/lang/Boolean;

    move-result-object v2

    new-array v3, v3, [Ljava/lang/Object;

    sget v4, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    xor-int/lit8 v4, v4, -0x35

    aput-object v0, v3, v4

    sget v0, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v0, v0, -0x16c

    aput-object v1, v3, v0

    sget v0, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    xor-int/lit8 v0, v0, 0x11

    aput-object v2, v3, v0

    invoke-static {v3}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟۠ۤۦ۠(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_1

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

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_8
        0xb918 -> :sswitch_b
        0xb939 -> :sswitch_a
        0xb97b -> :sswitch_9
    .end sparse-switch
.end method

.method public toExportFormat()Lorg/json/JSONObject;
    .locals 12

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v0

    const/16 v1, 0xf1

    sget v2, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    xor-int/lit16 v2, v2, -0x1c3

    const/16 v4, 0x844

    invoke-static {v0, v1, v2, v4}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۢۦۣ۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۦۥۧۡ(Ljava/lang/Object;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    move-result-object v0

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
    if-nez v4, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v1, 0x6eb

    goto :goto_1

    :sswitch_4
    move-object v1, v0

    :goto_2
    :try_start_1
    invoke-static {v3, v2, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v1

    const/16 v2, 0xf7

    sget v4, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۡۢ۟:I

    xor-int/lit16 v4, v4, 0x320

    const/16 v5, 0x54e

    invoke-static {v1, v2, v4, v5}, Landroidx/customview/ۤۡۥ;->۟ۢۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۥۡ۠۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/16 v1, 0x748

    :goto_3
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_3

    :sswitch_5
    if-nez v2, :cond_1

    const v1, 0xbe60

    goto :goto_3

    :sswitch_6
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۦۥۧۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_1
    :sswitch_7
    const v1, 0xbe41

    goto :goto_3

    :sswitch_8
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۧۢۦۣ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const v2, 0xbe7f

    :goto_4
    const v5, 0xbe90

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_3

    goto :goto_4

    :goto_5
    :sswitch_9
    invoke-static {v3, v4, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۥ۠ۢ(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result v4

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v1

    const/16 v2, 0xf9

    sget v5, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۢ۟ۡ:I

    xor-int/lit16 v5, v5, -0x26e

    const/16 v6, 0x4db

    invoke-static {v1, v2, v5, v6}, Landroidx/activity/ۦۧۥۥ;->۟ۤۡۦۦ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v1

    const/16 v5, 0xfb

    sget v6, Landroidx/activity/ۣۦۡۥ;->ۣۢۤۡ:I

    xor-int/lit8 v6, v6, 0x1

    const/16 v7, 0x1ae

    invoke-static {v1, v5, v6, v7}, Landroidx/loader/۟۠ۢۧۡ;->ۢ۟ۨۥ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v1

    const/16 v6, 0xfe

    sget v7, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۣۧۢ:I

    xor-int/lit16 v7, v7, -0x3c2

    const/16 v8, 0x18c

    invoke-static {v1, v6, v7, v8}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۡۤۧ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v1

    const/16 v7, 0x105

    sget v8, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    xor-int/lit16 v8, v8, 0x170

    const/16 v9, 0xb16

    invoke-static {v1, v7, v8, v9}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۡۧۨ([SIII)Ljava/lang/String;

    move-result-object v7

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v1

    const/16 v8, 0x109

    sget v9, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    xor-int/lit16 v9, v9, 0x304

    const/16 v10, 0x19b

    invoke-static {v1, v8, v9, v10}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢ۟ۥۨ([SIII)Ljava/lang/String;

    move-result-object v8

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v1

    const/16 v9, 0x112

    sget v10, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    xor-int/lit16 v10, v10, -0x1c1

    const/16 v11, 0x704

    invoke-static {v1, v9, v10, v11}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۢۧۢ([SIII)Ljava/lang/String;

    move-result-object v9

    const v1, 0xbefb

    :goto_6
    const v10, 0xbf0c

    xor-int/2addr v1, v10

    sparse-switch v1, :sswitch_data_4

    goto :goto_6

    :cond_2
    :sswitch_a
    const v1, 0xbf39

    goto :goto_6

    :sswitch_b
    const v2, 0xbe9e

    goto/16 :goto_4

    :sswitch_c
    :try_start_2
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۥۡ۠۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_5

    :sswitch_d
    if-eqz v4, :cond_2

    const v1, 0xc1e3

    goto :goto_6

    :sswitch_e
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟۟ۨ۠ۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const v1, 0xc202

    :goto_7
    const v10, 0xc213

    xor-int/2addr v1, v10

    sparse-switch v1, :sswitch_data_5

    goto :goto_7

    :sswitch_f
    if-nez v4, :cond_3

    const v1, 0xc25f

    goto :goto_7

    :cond_3
    :sswitch_10
    const v1, 0xc240

    goto :goto_7

    :sswitch_11
    const v1, 0xc27e

    :goto_8
    const v4, 0xc28f

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_6

    goto :goto_8

    :sswitch_12
    move-object v1, v0

    :goto_9
    invoke-static {v3, v9, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۣ۟۠ۦۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const v1, 0xc2fa

    :goto_a
    const v9, 0xc30b

    xor-int/2addr v1, v9

    sparse-switch v1, :sswitch_data_7

    goto :goto_a

    :sswitch_13
    if-nez v4, :cond_4

    const v1, 0xc5e2

    goto :goto_a

    :sswitch_14
    const v1, 0xc29d

    goto :goto_8

    :sswitch_15
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟۟ۨ۠ۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_9

    :cond_4
    :sswitch_16
    const v1, 0xc5c3

    goto :goto_a

    :sswitch_17
    const v1, 0xc601

    :goto_b
    const v4, 0xc612

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_8

    goto :goto_b

    :sswitch_18
    const v1, 0xc620

    goto :goto_b

    :sswitch_19
    move-object v1, v0

    :goto_c
    invoke-static {v3, v8, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v1

    const/16 v4, 0x116

    sget v8, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۣۧۢ:I

    xor-int/lit16 v8, v8, -0x3c3

    const/16 v9, 0xcaa

    invoke-static {v1, v4, v8, v9}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۦۥۢ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v7, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۣ۟۠ۦۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const v1, 0xc67d

    :goto_d
    const v7, 0xc68e

    xor-int/2addr v1, v7

    sparse-switch v1, :sswitch_data_9

    goto :goto_d

    :cond_5
    :sswitch_1a
    const v1, 0xc6bb

    goto :goto_d

    :sswitch_1b
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۣ۟۠ۦۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_c

    :sswitch_1c
    if-nez v4, :cond_5

    const v1, 0xc965

    goto :goto_d

    :sswitch_1d
    const v1, 0xc984

    :goto_e
    const v4, 0xc995

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_a

    goto :goto_e

    :sswitch_1e
    const v1, 0xc9a3

    goto :goto_e

    :sswitch_1f
    move-object v1, v0

    :goto_f
    invoke-static {v3, v6, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {v3, v5, v2}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    const v1, 0xca00

    :goto_10
    const v2, 0xca11

    xor-int/2addr v1, v2

    packed-switch v1, :pswitch_data_0

    :pswitch_0
    goto :goto_10

    :goto_11
    :pswitch_1
    :sswitch_20
    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v1

    const/16 v2, 0x126

    sget v4, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    xor-int/lit16 v4, v4, 0x307

    const/16 v5, 0xc6a

    invoke-static {v1, v2, v4, v5}, Landroidx/appcompat/ۣۧۤۢ;->ۢۥۢ۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۨۡۧۧ(Ljava/lang/Object;)J

    move-result-wide v4

    invoke-static {v3, v1, v4, v5}, Landroidx/loader/ۣۦ۟ۡ;->ۦ۟ۢ۠(Ljava/lang/Object;Ljava/lang/Object;J)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v1

    const/16 v2, 0x130

    sget v4, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    xor-int/lit16 v4, v4, 0x38a

    const/16 v5, 0x8cf

    invoke-static {v1, v2, v4, v5}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۢ۠ۥۨ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۧ۟ۨۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const v1, 0x1704ae

    :goto_12
    const v5, 0x1704bf

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_b

    goto :goto_12

    :sswitch_21
    if-nez v2, :cond_e

    const v1, 0x17050b

    goto :goto_12

    :sswitch_22
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۣ۟۠ۦۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_f

    :pswitch_2
    const v1, 0xca1f

    goto :goto_10

    :sswitch_23
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۡۥۧ(Ljava/lang/Object;)Z

    move-result v4

    const v1, 0xca7c

    :goto_13
    const v10, 0xca8d

    xor-int/2addr v1, v10

    sparse-switch v1, :sswitch_data_c

    goto :goto_13

    :sswitch_24
    if-eqz v4, :cond_6

    const v1, 0xcd64

    goto :goto_13

    :cond_6
    :sswitch_25
    const v1, 0xcd45

    goto :goto_13

    :sswitch_26
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۣ۟ۡ۠ۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const v1, 0xcd83

    :goto_14
    const v10, 0xcd94

    xor-int/2addr v1, v10

    sparse-switch v1, :sswitch_data_d

    goto :goto_14

    :sswitch_27
    if-nez v4, :cond_7

    const v1, 0xcde0

    goto :goto_14

    :cond_7
    :sswitch_28
    const v1, 0xcdc1

    goto :goto_14

    :sswitch_29
    const v1, 0xcdff

    :goto_15
    const v4, 0xce10

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_e

    goto :goto_15

    :sswitch_2a
    move-object v1, v0

    :goto_16
    invoke-static {v3, v9, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۣ۟۠ۦۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const v1, 0xd106

    :goto_17
    const v9, 0xd117

    xor-int/2addr v1, v9

    sparse-switch v1, :sswitch_data_f

    goto :goto_17

    :sswitch_2b
    if-nez v4, :cond_8

    const v1, 0xd163

    goto :goto_17

    :sswitch_2c
    const v1, 0xce1e

    goto :goto_15

    :sswitch_2d
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۣ۟ۡ۠ۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_16

    :cond_8
    :sswitch_2e
    const v1, 0xd144

    goto :goto_17

    :sswitch_2f
    const v1, 0xd182

    :goto_18
    const v4, 0xd193

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_10

    goto :goto_18

    :sswitch_30
    const v1, 0xd1a1

    goto :goto_18

    :sswitch_31
    move-object v1, v0

    :goto_19
    invoke-static {v3, v8, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v1

    const/16 v4, 0x11a

    sget v8, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۤ۟ۧۤ:I

    xor-int/lit16 v8, v8, -0x1e1

    const/16 v9, 0x376

    invoke-static {v1, v4, v8, v9}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣ۟۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v7, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۥ۟ۥۣ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const v1, 0xd1fe

    :goto_1a
    const v7, 0xd20f

    xor-int/2addr v1, v7

    sparse-switch v1, :sswitch_data_11

    goto :goto_1a

    :sswitch_32
    if-nez v4, :cond_9

    const v1, 0xd4e6

    goto :goto_1a

    :sswitch_33
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۣ۟۠ۦۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_19

    :cond_9
    :sswitch_34
    const v1, 0xd4c7

    goto :goto_1a

    :sswitch_35
    const v1, 0xd505

    :goto_1b
    const v4, 0xd516

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_12

    goto :goto_1b

    :sswitch_36
    const v1, 0xd524

    goto :goto_1b

    :sswitch_37
    move-object v1, v0

    :goto_1c
    invoke-static {v3, v6, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۧۦ۠۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const v1, 0xd581

    :goto_1d
    const v6, 0xd592

    xor-int/2addr v1, v6

    sparse-switch v1, :sswitch_data_13

    goto :goto_1d

    :sswitch_38
    if-nez v4, :cond_a

    const v1, 0xd869

    goto :goto_1d

    :sswitch_39
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۥ۟ۥۣ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1c

    :cond_a
    :sswitch_3a
    const v1, 0xd5bf

    goto :goto_1d

    :sswitch_3b
    const v1, 0xd888

    :goto_1e
    const v4, 0xd899

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_14

    goto :goto_1e

    :sswitch_3c
    const v1, 0xd8a7

    goto :goto_1e

    :sswitch_3d
    move-object v1, v2

    :goto_1f
    invoke-static {v3, v5, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    const v1, 0xd904

    :goto_20
    const v2, 0xd915

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_15

    goto :goto_20

    :sswitch_3e
    const v1, 0xd923

    goto :goto_20

    :sswitch_3f
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۧۦ۠۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1f

    :sswitch_40
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۡۤ۠ۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const v1, 0xd980

    :goto_21
    const v10, 0xd991

    xor-int/2addr v1, v10

    sparse-switch v1, :sswitch_data_16

    goto :goto_21

    :sswitch_41
    if-nez v4, :cond_b

    const v1, 0xdc68

    goto :goto_21

    :cond_b
    :sswitch_42
    const v1, 0xdc49

    goto :goto_21

    :sswitch_43
    const v1, 0xdc87

    :goto_22
    const v4, 0xdc98

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_17

    goto :goto_22

    :sswitch_44
    const v1, 0xdca6

    goto :goto_22

    :sswitch_45
    move-object v1, v0

    :goto_23
    invoke-static {v3, v9, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۣ۟۠ۦۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const v1, 0xdd03

    :goto_24
    const v9, 0xdd14

    xor-int/2addr v1, v9

    sparse-switch v1, :sswitch_data_18

    goto :goto_24

    :sswitch_46
    if-nez v4, :cond_c

    const v1, 0x170090

    goto :goto_24

    :sswitch_47
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۡۤ۠ۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_23

    :cond_c
    :sswitch_48
    const v1, 0xdd41

    goto :goto_24

    :sswitch_49
    const v1, 0x1700af

    :goto_25
    const v4, 0x1700c0

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_19

    goto :goto_25

    :sswitch_4a
    move-object v1, v0

    :goto_26
    invoke-static {v3, v8, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v1

    const/16 v4, 0x121

    sget v8, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v8, v8, 0x2fb

    const/16 v9, 0x88b

    invoke-static {v1, v4, v8, v9}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۦۧۦ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v7, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۥ۟ۥۣ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const v1, 0x17012b

    :goto_27
    const v7, 0x17013c

    xor-int/2addr v1, v7

    sparse-switch v1, :sswitch_data_1a

    goto :goto_27

    :sswitch_4b
    if-nez v4, :cond_d

    const v1, 0x170188

    goto :goto_27

    :sswitch_4c
    const v1, 0x1700ce

    goto :goto_25

    :sswitch_4d
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۣ۟۠ۦۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_26

    :cond_d
    :sswitch_4e
    const v1, 0x170169

    goto :goto_27

    :sswitch_4f
    const v1, 0x1701a7

    :goto_28
    const v4, 0x1701b8

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_1b

    goto :goto_28

    :sswitch_50
    const v1, 0x170451

    goto :goto_28

    :sswitch_51
    move-object v1, v0

    :goto_29
    invoke-static {v3, v6, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {v3, v5, v2}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto/16 :goto_11

    :catch_0
    move-exception v0

    :sswitch_52
    return-object v3

    :sswitch_53
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۥ۟ۥۣ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_29

    :cond_e
    :sswitch_54
    const v1, 0x1704ec

    goto/16 :goto_12

    :sswitch_55
    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v1

    const/16 v2, 0x138

    sget v5, Landroidx/activity/ۤۧۧۧ;->۟۟ۢ۠ۡ:I

    xor-int/lit16 v5, v5, 0x1e8

    const/16 v6, 0x67e

    invoke-static {v1, v2, v5, v6}, Landroidx/core/ۧ۟ۤۨ;->ۡۥ۟ۥ([SIII)Ljava/lang/String;

    move-result-object v1

    const v2, 0x17052a

    :goto_2a
    const v5, 0x17053b

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_1c

    goto :goto_2a

    :sswitch_56
    const v2, 0x170549

    goto :goto_2a

    :sswitch_57
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۧ۟ۨۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    :sswitch_58
    invoke-static {v3, v4, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v1

    const/16 v2, 0x13a

    sget v4, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/lit8 v4, v4, 0x43

    const/16 v5, 0x261

    invoke-static {v1, v2, v4, v5}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧ۠ۥ۟([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۦۦ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const v1, 0x170831

    :goto_2b
    const v5, 0x170842

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_1d

    goto :goto_2b

    :cond_f
    :sswitch_59
    const v1, 0x17086f

    goto :goto_2b

    :sswitch_5a
    if-nez v4, :cond_f

    const v1, 0x17088e

    goto :goto_2b

    :sswitch_5b
    const v1, 0x1708ad

    :goto_2c
    const v4, 0x1708be

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_1e

    goto :goto_2c

    :sswitch_5c
    const v1, 0x1708cc

    goto :goto_2c

    :sswitch_5d
    move-object v1, v0

    :goto_2d
    invoke-static {v3, v2, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v1

    const/16 v2, 0x144

    sget v4, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    xor-int/lit8 v4, v4, 0x1f

    const/16 v5, 0xcbd

    invoke-static {v1, v2, v4, v5}, Lorg/luckypray/dexkit/۠۠ۥ;->۟ۥۧۦ۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۠ۢ۟۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const v1, 0x170929

    :goto_2e
    const v5, 0x17093a

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_1f

    goto :goto_2e

    :sswitch_5e
    if-nez v4, :cond_10

    const v1, 0x170c11

    goto :goto_2e

    :sswitch_5f
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۦۦ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_2d

    :cond_10
    :sswitch_60
    const v1, 0x170bf2

    goto :goto_2e

    :sswitch_61
    const v1, 0x170c30

    :goto_2f
    const v4, 0x170c41

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_20

    goto :goto_2f

    :goto_30
    :sswitch_62
    invoke-static {v3, v2, v0}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v0

    const/16 v1, 0x150

    sget v2, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    xor-int/lit16 v2, v2, 0x285

    const/16 v4, 0xb8f

    invoke-static {v0, v1, v2, v4}, Landroidx/activity/ۣۦۡۥ;->۟ۡۨ۟۟([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۥۣۤۨ(Ljava/lang/Object;)J

    move-result-wide v4

    invoke-static {v3, v0, v4, v5}, Landroidx/loader/ۣۦ۟ۡ;->ۦ۟ۢ۠(Ljava/lang/Object;Ljava/lang/Object;J)Lorg/json/JSONObject;

    const v0, 0x170cac

    :goto_31
    const v1, 0x170cbd

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_21

    goto :goto_31

    :sswitch_63
    const v0, 0x170ccb

    goto :goto_31

    :sswitch_64
    const v1, 0x170c4f

    goto :goto_2f

    :sswitch_65
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۠ۢ۟۟(Ljava/lang/Object;)Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    move-result-object v0

    goto :goto_30

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
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_5
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
        0x16 -> :sswitch_a
        0x35 -> :sswitch_23
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_10
        0x4c -> :sswitch_11
        0x53 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_12
        0xf1 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_13
        0x6af -> :sswitch_16
        0x6c8 -> :sswitch_1b
        0x6e9 -> :sswitch_17
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_18
        0x32 -> :sswitch_19
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1a
        0x35 -> :sswitch_22
        0xf3 -> :sswitch_1c
        0xfeb -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1e
        0x36 -> :sswitch_1f
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch

    :sswitch_data_b
    .sparse-switch
        0x11 -> :sswitch_21
        0x53 -> :sswitch_57
        0x72 -> :sswitch_54
        0x1b4 -> :sswitch_55
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_24
        0x7ab -> :sswitch_25
        0x7c8 -> :sswitch_40
        0x7e9 -> :sswitch_26
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_27
        0x36 -> :sswitch_28
        0x55 -> :sswitch_2d
        0x74 -> :sswitch_29
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_2a
        0x3ef -> :sswitch_2c
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_2b
        0x32 -> :sswitch_2e
        0x53 -> :sswitch_33
        0x74 -> :sswitch_2f
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x11 -> :sswitch_30
        0x32 -> :sswitch_31
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x3f1 -> :sswitch_32
        0x6a7 -> :sswitch_34
        0x6c8 -> :sswitch_39
        0x6e9 -> :sswitch_35
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x13 -> :sswitch_36
        0x32 -> :sswitch_37
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x13 -> :sswitch_38
        0x2d -> :sswitch_3f
        0x32 -> :sswitch_3a
        0xdfb -> :sswitch_3b
    .end sparse-switch

    :sswitch_data_14
    .sparse-switch
        0x11 -> :sswitch_3c
        0x3e -> :sswitch_3d
    .end sparse-switch

    :sswitch_data_15
    .sparse-switch
        0x11 -> :sswitch_3e
        0x36 -> :sswitch_20
    .end sparse-switch

    :sswitch_data_16
    .sparse-switch
        0x11 -> :sswitch_41
        0x5bb -> :sswitch_42
        0x5d8 -> :sswitch_47
        0x5f9 -> :sswitch_43
    .end sparse-switch

    :sswitch_data_17
    .sparse-switch
        0x1f -> :sswitch_44
        0x3e -> :sswitch_45
    .end sparse-switch

    :sswitch_data_18
    .sparse-switch
        0x17 -> :sswitch_46
        0x36 -> :sswitch_48
        0x55 -> :sswitch_4d
        0x17dd84 -> :sswitch_49
    .end sparse-switch

    :sswitch_data_19
    .sparse-switch
        0xe -> :sswitch_4a
        0x6f -> :sswitch_4c
    .end sparse-switch

    :sswitch_data_1a
    .sparse-switch
        0x17 -> :sswitch_4b
        0x55 -> :sswitch_53
        0x76 -> :sswitch_4e
        0xb4 -> :sswitch_4f
    .end sparse-switch

    :sswitch_data_1b
    .sparse-switch
        0x1f -> :sswitch_50
        0x5e9 -> :sswitch_51
    .end sparse-switch

    :sswitch_data_1c
    .sparse-switch
        0x11 -> :sswitch_56
        0x72 -> :sswitch_58
    .end sparse-switch

    :sswitch_data_1d
    .sparse-switch
        0x12 -> :sswitch_59
        0x2d -> :sswitch_5f
        0x73 -> :sswitch_5a
        0xcc -> :sswitch_5b
    .end sparse-switch

    :sswitch_data_1e
    .sparse-switch
        0x13 -> :sswitch_5c
        0x72 -> :sswitch_5d
    .end sparse-switch

    :sswitch_data_1f
    .sparse-switch
        0x13 -> :sswitch_5e
        0x2c8 -> :sswitch_65
        0x2e9 -> :sswitch_60
        0x52b -> :sswitch_61
    .end sparse-switch

    :sswitch_data_20
    .sparse-switch
        0xe -> :sswitch_62
        0x71 -> :sswitch_64
    .end sparse-switch

    :sswitch_data_21
    .sparse-switch
        0x11 -> :sswitch_63
        0x76 -> :sswitch_52
    .end sparse-switch
.end method

.method public toJson()Ljava/lang/String;
    .locals 7

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v0

    const/16 v1, 0x158

    sget v2, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣ۠ۧ:I

    xor-int/lit16 v2, v2, -0x1e2

    const/16 v4, 0x26e

    invoke-static {v0, v1, v2, v4}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣۣ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۦۦ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    move-result-object v0

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
    if-nez v4, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v1, 0x6eb

    goto :goto_1

    :sswitch_4
    move-object v1, v0

    :goto_2
    :try_start_1
    invoke-static {v3, v2, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v1

    const/16 v2, 0x162

    sget v4, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v4, v4, 0x2f7

    const/16 v5, 0x9b3

    invoke-static {v1, v2, v4, v5}, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۡۨۧ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۡۤ۠ۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const/16 v1, 0x748

    :goto_3
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_3

    :sswitch_5
    if-nez v4, :cond_1

    const v1, 0xbe60

    goto :goto_3

    :sswitch_6
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۦۦ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_1
    :sswitch_7
    const v1, 0xbe41

    goto :goto_3

    :sswitch_8
    const v1, 0xbe7f

    :goto_4
    const v4, 0xbe90

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_3

    goto :goto_4

    :sswitch_9
    move-object v1, v0

    :goto_5
    invoke-static {v3, v2, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v1

    const/16 v2, 0x16b

    sget v4, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    xor-int/lit16 v4, v4, 0xc4

    const/16 v5, 0x235

    invoke-static {v1, v2, v4, v5}, Landroidx/core/ktx/۟۟ۡۢ۠;->۟ۢۦۧ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۥ۟ۥۣ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const v1, 0xbefb

    :goto_6
    const v5, 0xbf0c

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_4

    goto :goto_6

    :cond_2
    :sswitch_a
    const v1, 0xbf39

    goto :goto_6

    :sswitch_b
    const v1, 0xbe9e

    goto :goto_4

    :sswitch_c
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۡۤ۠ۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_5

    :sswitch_d
    if-nez v4, :cond_2

    const v1, 0xc1e3

    goto :goto_6

    :sswitch_e
    const v1, 0xc202

    :goto_7
    const v4, 0xc213

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_5

    goto :goto_7

    :sswitch_f
    const v1, 0xc221

    goto :goto_7

    :sswitch_10
    move-object v1, v0

    :goto_8
    invoke-static {v3, v2, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v1

    const/16 v2, 0x172

    sget v4, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    xor-int/lit16 v4, v4, 0x304

    const/16 v5, 0x5b9

    invoke-static {v1, v2, v4, v5}, Landroidx/loader/ۣۦ۟ۡ;->ۣ۟ۤ۟ۦ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۥۣۤۨ(Ljava/lang/Object;)J

    move-result-wide v4

    invoke-static {v3, v1, v4, v5}, Landroidx/loader/ۣۦ۟ۡ;->ۦ۟ۢ۠(Ljava/lang/Object;Ljava/lang/Object;J)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v1

    const/16 v2, 0x17b

    sget v4, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۡۨۨۧ:I

    xor-int/lit16 v4, v4, -0x1ef

    const/16 v5, 0x849

    invoke-static {v1, v2, v4, v5}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۤۥ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۡۥۧ(Ljava/lang/Object;)Z

    move-result v2

    invoke-static {v3, v1, v2}, Landroidx/activity/ۦۧۥۥ;->ۡۨ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;Z)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v1

    const/16 v2, 0x184

    sget v4, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    xor-int/lit16 v4, v4, 0x25a

    const/16 v5, 0x486

    invoke-static {v1, v2, v4, v5}, Landroidx/emoji2/ۢۧۡۧ;->۟ۥۢ۟ۢ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۥ۠ۢ(Ljava/lang/Object;)Z

    move-result v2

    invoke-static {v3, v1, v2}, Landroidx/activity/ۦۧۥۥ;->ۡۨ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;Z)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v1

    const/16 v2, 0x18d

    sget v4, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v4, v4, 0x12f

    const/16 v5, 0x49a

    invoke-static {v1, v2, v4, v5}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣۣ۟ۤۤ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۧۦ۠۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const v1, 0xc27e

    :goto_9
    const v5, 0xc28f

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_6

    goto :goto_9

    :cond_3
    :sswitch_11
    const v1, 0xc2bc

    goto :goto_9

    :sswitch_12
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۥ۟ۥۣ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_8

    :sswitch_13
    if-nez v4, :cond_3

    const v1, 0xc2db

    goto :goto_9

    :sswitch_14
    const v1, 0xc2fa

    :goto_a
    const v4, 0xc30b

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_7

    goto :goto_a

    :sswitch_15
    const v1, 0xc5a4

    goto :goto_a

    :sswitch_16
    move-object v1, v0

    :goto_b
    invoke-static {v3, v2, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v1

    const/16 v2, 0x196

    sget v4, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    xor-int/lit8 v4, v4, -0x72

    const/16 v5, 0x60a

    invoke-static {v1, v2, v4, v5}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣ۟۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۣ۟ۡ۠ۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const v1, 0xc601

    :goto_c
    const v5, 0xc612

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_8

    goto :goto_c

    :sswitch_17
    if-nez v4, :cond_4

    const v1, 0xc65e

    goto :goto_c

    :sswitch_18
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۧۦ۠۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_b

    :cond_4
    :sswitch_19
    const v1, 0xc63f

    goto :goto_c

    :sswitch_1a
    const v1, 0xc67d

    :goto_d
    const v4, 0xc68e

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_9

    goto :goto_d

    :sswitch_1b
    move-object v1, v0

    :goto_e
    invoke-static {v3, v2, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v1

    const/16 v2, 0x1a1

    sget v4, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/lit8 v4, v4, -0x1f

    const/16 v5, 0x5b0

    invoke-static {v1, v2, v4, v5}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۦۤۢۦ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۣۢۢۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const v1, 0xc984

    :goto_f
    const v5, 0xc995

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_a

    goto :goto_f

    :sswitch_1c
    if-nez v4, :cond_5

    const v1, 0xc9e1

    goto :goto_f

    :sswitch_1d
    const v1, 0xc69c

    goto :goto_d

    :sswitch_1e
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۣ۟ۡ۠ۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_e

    :cond_5
    :sswitch_1f
    const v1, 0xc9c2

    goto :goto_f

    :sswitch_20
    const v1, 0xca00

    :goto_10
    const v4, 0xca11

    xor-int/2addr v1, v4

    packed-switch v1, :pswitch_data_0

    :pswitch_0
    goto :goto_10

    :pswitch_1
    move-object v1, v0

    :goto_11
    invoke-static {v3, v2, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v1

    const/16 v2, 0x1ae

    sget v4, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣ۠ۢۢ:I

    xor-int/lit8 v4, v4, -0x63

    const/16 v5, 0x9fc

    invoke-static {v1, v2, v4, v5}, Landroidx/customview/ۡۤۡۤ;->ۧ۟ۤۨ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟۠ۢۡۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const v1, 0xca7c

    :goto_12
    const v5, 0xca8d

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_b

    goto :goto_12

    :sswitch_21
    if-nez v4, :cond_6

    const v1, 0xcd64

    goto :goto_12

    :pswitch_2
    const v1, 0xca1f

    goto :goto_10

    :sswitch_22
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۣۢۢۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_11

    :cond_6
    :sswitch_23
    const v1, 0xcd45

    goto :goto_12

    :sswitch_24
    const v1, 0xcd83

    :goto_13
    const v4, 0xcd94

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_c

    goto :goto_13

    :sswitch_25
    const v1, 0xcda2

    goto :goto_13

    :sswitch_26
    move-object v1, v0

    :goto_14
    invoke-static {v3, v2, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v1

    const/16 v2, 0x1ba

    sget v4, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۣۧۢ:I

    xor-int/lit16 v4, v4, -0x3cb

    const/16 v5, 0x3fa

    invoke-static {v1, v2, v4, v5}, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۥۧۤ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۣۨۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const v1, 0xcdff

    :goto_15
    const v5, 0xce10

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_d

    goto :goto_15

    :cond_7
    :sswitch_27
    const v1, 0xce3d

    goto :goto_15

    :sswitch_28
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟۠ۢۡۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_14

    :sswitch_29
    if-nez v4, :cond_7

    const v1, 0xd0e7

    goto :goto_15

    :sswitch_2a
    const v1, 0xd106

    :goto_16
    const v4, 0xd117

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_e

    goto :goto_16

    :sswitch_2b
    const v1, 0xd125

    goto :goto_16

    :sswitch_2c
    move-object v1, v0

    :goto_17
    invoke-static {v3, v2, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v1

    const/16 v2, 0x1c6

    sget v4, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    xor-int/lit16 v4, v4, -0x330

    const/16 v5, 0x9ba

    invoke-static {v1, v2, v4, v5}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۧۨۦۦ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟۟ۨ۠ۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const v1, 0xd182

    :goto_18
    const v5, 0xd193

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_f

    goto :goto_18

    :sswitch_2d
    if-nez v4, :cond_8

    const v1, 0xd1df

    goto :goto_18

    :sswitch_2e
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۣۨۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_17

    :cond_8
    :sswitch_2f
    const v1, 0xd1c0

    goto :goto_18

    :sswitch_30
    const v1, 0xd1fe

    :goto_19
    const v4, 0xd20f

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_10

    goto :goto_19

    :sswitch_31
    const v1, 0xd4a8

    goto :goto_19

    :sswitch_32
    move-object v1, v0

    :goto_1a
    invoke-static {v3, v2, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v1

    const/16 v2, 0x1d3

    sget v4, Lorg/luckypray/dexkit/۠۠ۥ;->ۣ۟ۡۢۡ:I

    xor-int/lit16 v4, v4, -0xe9

    const/16 v5, 0x3f4

    invoke-static {v1, v2, v4, v5}, Lorg/luckypray/dexkit/۠۠ۥ;->۟ۥۧۦ۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۣۧۤۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const v1, 0xd505

    :goto_1b
    const v5, 0xd516

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_11

    goto :goto_1b

    :sswitch_33
    if-nez v4, :cond_9

    const v1, 0xd562

    goto :goto_1b

    :sswitch_34
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟۟ۨ۠ۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1a

    :cond_9
    :sswitch_35
    const v1, 0xd543

    goto :goto_1b

    :sswitch_36
    const v1, 0xd581

    :goto_1c
    const v4, 0xd592

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_12

    goto :goto_1c

    :sswitch_37
    const v1, 0xd5a0

    goto :goto_1c

    :sswitch_38
    move-object v1, v0

    :goto_1d
    invoke-static {v3, v2, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v1

    const/16 v2, 0x1dd

    sget v4, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/lit8 v4, v4, -0x33

    const/16 v5, 0x285

    invoke-static {v1, v2, v4, v5}, Landroidx/loader/۟۠ۢۧۡ;->ۢ۟ۨۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۣ۟۠ۦۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const v1, 0xd888

    :goto_1e
    const v5, 0xd899

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_13

    goto :goto_1e

    :sswitch_39
    if-nez v4, :cond_a

    const v1, 0xd8e5

    goto :goto_1e

    :sswitch_3a
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۣۧۤۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1d

    :cond_a
    :sswitch_3b
    const v1, 0xd8c6

    goto :goto_1e

    :sswitch_3c
    const v1, 0xd904

    :goto_1f
    const v4, 0xd915

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_14

    goto :goto_1f

    :sswitch_3d
    const v1, 0xd923

    goto :goto_1f

    :sswitch_3e
    move-object v1, v0

    :goto_20
    invoke-static {v3, v2, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v1

    const/16 v2, 0x1e4

    sget v4, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    xor-int/lit16 v4, v4, -0x106

    const/16 v5, 0x761

    invoke-static {v1, v2, v4, v5}, Landroidx/drawerlayout/ۤۨۡۤ;->ۤ۠ۤ۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۠ۢ۟۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const v1, 0xd980

    :goto_21
    const v5, 0xd991

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_15

    goto :goto_21

    :sswitch_3f
    if-nez v4, :cond_b

    const v1, 0xdc68

    goto :goto_21

    :sswitch_40
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۣ۟۠ۦۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_20

    :cond_b
    :sswitch_41
    const v1, 0xdc49

    goto :goto_21

    :sswitch_42
    const v1, 0xdc87

    :goto_22
    const v4, 0xdc98

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_16

    goto :goto_22

    :sswitch_43
    const v1, 0xdca6

    goto :goto_22

    :sswitch_44
    move-object v1, v0

    :goto_23
    invoke-static {v3, v2, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v1

    const/16 v2, 0x1f1

    sget v4, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    xor-int/lit16 v4, v4, -0x104

    const/16 v5, 0x430

    invoke-static {v1, v2, v4, v5}, Landroidx/loader/ۡۢۢ;->ۡ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۨۡۧۧ(Ljava/lang/Object;)J

    move-result-wide v4

    invoke-static {v3, v1, v4, v5}, Landroidx/loader/ۣۦ۟ۡ;->ۦ۟ۢ۠(Ljava/lang/Object;Ljava/lang/Object;J)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v1

    const/16 v2, 0x1fc

    sget v4, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    xor-int/lit16 v4, v4, 0x38a

    const/16 v5, 0xc80

    invoke-static {v1, v2, v4, v5}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۢۦۣ۠([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۧ۟ۨۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const v1, 0xdd03

    :goto_24
    const v5, 0xdd14

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_17

    goto :goto_24

    :sswitch_45
    if-nez v2, :cond_c

    const v1, 0x170090

    goto :goto_24

    :sswitch_46
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۠ۢ۟۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_23

    :cond_c
    :sswitch_47
    const v1, 0xdd41

    goto :goto_24

    :sswitch_48
    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v1

    const/16 v2, 0x204

    sget v5, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۡۦۥۨ:I

    xor-int/lit16 v5, v5, 0x11c

    const/16 v6, 0xa36

    invoke-static {v1, v2, v5, v6}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۡۤۧ([SIII)Ljava/lang/String;

    move-result-object v1

    const v2, 0x1700af

    :goto_25
    const v5, 0x1700c0

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_18

    goto :goto_25

    :goto_26
    :sswitch_49
    invoke-static {v3, v4, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v1

    const/16 v2, 0x206

    sget v4, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    xor-int/lit16 v4, v4, -0x3c8

    const/16 v5, 0xabb

    invoke-static {v1, v2, v4, v5}, Landroidx/loader/ۥۧۨۤ;->۟ۢۢ۠ۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۦۥۧۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const v1, 0x17012b

    :goto_27
    const v5, 0x17013c

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_19

    goto :goto_27

    :sswitch_4a
    if-nez v4, :cond_d

    const v1, 0x170188

    goto :goto_27

    :sswitch_4b
    const v2, 0x1700ce

    goto :goto_25

    :sswitch_4c
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->ۧ۟ۨۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_26

    :cond_d
    :sswitch_4d
    const v1, 0x170169

    goto :goto_27

    :sswitch_4e
    const v1, 0x1701a7

    :goto_28
    const v4, 0x1701b8

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_1a

    goto :goto_28

    :sswitch_4f
    const v1, 0x170451

    goto :goto_28

    :sswitch_50
    move-object v1, v0

    :goto_29
    invoke-static {v3, v2, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۤۤۨۡ()[S

    move-result-object v1

    const/16 v2, 0x20a

    sget v4, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    xor-int/lit8 v4, v4, -0x73

    const/16 v5, 0x9e9

    invoke-static {v1, v2, v4, v5}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۥۡ۠۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const v1, 0x1704ae

    :goto_2a
    const v5, 0x1704bf

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_1b

    goto :goto_2a

    :sswitch_51
    if-nez v4, :cond_e

    const v1, 0x17050b

    goto :goto_2a

    :sswitch_52
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۦۥۧۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_29

    :cond_e
    :sswitch_53
    const v1, 0x1704ec

    goto :goto_2a

    :sswitch_54
    const v1, 0x17052a

    :goto_2b
    const v4, 0x17053b

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_1c

    goto :goto_2b

    :sswitch_55
    const v1, 0x170549

    goto :goto_2b

    :sswitch_56
    invoke-static {p0}, Lkevin/fun/hook/DYHook$WatchItem;->۟ۥۡ۠۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :sswitch_57
    invoke-static {v3, v2, v0}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const v0, 0x170831

    :goto_2c
    const v1, 0x170842

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_1d

    goto :goto_2c

    :goto_2d
    :sswitch_58
    invoke-static {v3}, Landroidx/viewpager/ۣۢ۟ۤ;->ۣۧۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_59
    const v0, 0x170850

    goto :goto_2c

    :catch_0
    move-exception v0

    goto :goto_2d

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
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_5
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
        0x16 -> :sswitch_a
        0x35 -> :sswitch_12
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_10
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_11
        0x33 -> :sswitch_18
        0x54 -> :sswitch_14
        0xf1 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_15
        0x6af -> :sswitch_16
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_17
        0x2d -> :sswitch_1e
        0x32 -> :sswitch_19
        0x4c -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1b
        0xf3 -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1c
        0x36 -> :sswitch_1f
        0x57 -> :sswitch_22
        0x74 -> :sswitch_20
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch

    :sswitch_data_b
    .sparse-switch
        0xf1 -> :sswitch_21
        0x7ab -> :sswitch_23
        0x7c8 -> :sswitch_28
        0x7e9 -> :sswitch_24
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0x17 -> :sswitch_25
        0x36 -> :sswitch_26
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0xe -> :sswitch_27
        0x2d -> :sswitch_2e
        0x3ef -> :sswitch_29
        0x1ef7 -> :sswitch_2a
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0x11 -> :sswitch_2b
        0x32 -> :sswitch_2c
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_2d
        0x32 -> :sswitch_2f
        0x4c -> :sswitch_30
        0x53 -> :sswitch_34
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x3f1 -> :sswitch_31
        0x6a7 -> :sswitch_32
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x13 -> :sswitch_33
        0x32 -> :sswitch_35
        0x55 -> :sswitch_3a
        0x74 -> :sswitch_36
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x13 -> :sswitch_37
        0x32 -> :sswitch_38
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x11 -> :sswitch_39
        0x3e -> :sswitch_3b
        0x5f -> :sswitch_40
        0x7c -> :sswitch_3c
    .end sparse-switch

    :sswitch_data_14
    .sparse-switch
        0x11 -> :sswitch_3d
        0x36 -> :sswitch_3e
    .end sparse-switch

    :sswitch_data_15
    .sparse-switch
        0x11 -> :sswitch_3f
        0x5bb -> :sswitch_41
        0x5d8 -> :sswitch_46
        0x5f9 -> :sswitch_42
    .end sparse-switch

    :sswitch_data_16
    .sparse-switch
        0x1f -> :sswitch_43
        0x3e -> :sswitch_44
    .end sparse-switch

    :sswitch_data_17
    .sparse-switch
        0x17 -> :sswitch_45
        0x36 -> :sswitch_47
        0x55 -> :sswitch_4c
        0x17dd84 -> :sswitch_48
    .end sparse-switch

    :sswitch_data_18
    .sparse-switch
        0xe -> :sswitch_49
        0x6f -> :sswitch_4b
    .end sparse-switch

    :sswitch_data_19
    .sparse-switch
        0x17 -> :sswitch_4a
        0x55 -> :sswitch_52
        0x76 -> :sswitch_4d
        0xb4 -> :sswitch_4e
    .end sparse-switch

    :sswitch_data_1a
    .sparse-switch
        0x1f -> :sswitch_4f
        0x5e9 -> :sswitch_50
    .end sparse-switch

    :sswitch_data_1b
    .sparse-switch
        0x11 -> :sswitch_51
        0x53 -> :sswitch_56
        0x72 -> :sswitch_53
        0x1b4 -> :sswitch_54
    .end sparse-switch

    :sswitch_data_1c
    .sparse-switch
        0x11 -> :sswitch_55
        0x72 -> :sswitch_57
    .end sparse-switch

    :sswitch_data_1d
    .sparse-switch
        0x12 -> :sswitch_58
        0x73 -> :sswitch_59
    .end sparse-switch
.end method
