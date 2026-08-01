.class public Lkevin/fun/hook/webdav/WebDAVConfig$BackupFileInfo;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkevin/fun/hook/webdav/WebDAVConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "BackupFileInfo"
.end annotation


# static fields
.field private static final short:[S


# instance fields
.field public modifiedTime:J

.field public name:Ljava/lang/String;

.field public path:Ljava/lang/String;

.field public size:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x23

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/webdav/WebDAVConfig$BackupFileInfo;->short:[S

    return-void

    :array_0
    .array-data 2
        0xbdas
        0xbb8s
        0x525s
        0x52es
        0x532s
        0x566s
        0x520s
        0x54bs
        0x542s
        0x974s
        0x97fs
        0x963s
        0x937s
        0x971s
        0x91cs
        0x913s
        0x1b6s
        0x1b6s
        0x1b6s
        0x1b6s
        0x1e2s
        0x182s
        0x182s
        0x1e2s
        0x1abs
        0x1abs
        0x1efs
        0x187s
        0x187s
        0x1f5s
        0x1a2s
        0x1a2s
        0x1f5s
        0x1bcs
        0x1bcs
    .end array-data
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۣۢۢۦ()I

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
    const-string v0, "6GgO1GTH"

    invoke-static {v0}, Landroidx/loader/ۢۥ۟;->۟ۦۡۨ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۣ۟۠ۧۢ()[S
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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/webdav/WebDAVConfig$BackupFileInfo;->short:[S

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
.method public getFormattedSize()Ljava/lang/String;
    .locals 5

    const/4 v4, 0x1

    invoke-static {p0}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣۢۧۡ(Ljava/lang/Object;)J

    move-result-wide v2

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
    const-wide/16 v0, 0x400

    cmp-long v0, v2, v0

    if-gez v0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣۢۧۡ(Ljava/lang/Object;)J

    move-result-wide v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v2, v0, v1}, Landroidx/loader/ۢۥ۟;->۟ۥۣۢۡ(Ljava/lang/Object;J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVConfig$BackupFileInfo;->ۣ۟۠ۧۢ()[S

    move-result-object v1

    const/4 v2, 0x0

    sget v3, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    xor-int/lit16 v3, v3, -0x1c7

    const/16 v4, 0xbfa

    invoke-static {v1, v2, v3, v4}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۨۤ۠۠([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    return-object v0

    :sswitch_3
    invoke-static {p0}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣۢۧۡ(Ljava/lang/Object;)J

    move-result-wide v2

    const/16 v0, 0x6cc

    :goto_2
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    :sswitch_4
    const-wide/32 v0, 0x100000

    cmp-long v0, v2, v0

    if-gez v0, :cond_1

    const/16 v0, 0x729

    goto :goto_2

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_2

    :sswitch_6
    invoke-static {p0}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣۢۧۡ(Ljava/lang/Object;)J

    move-result-wide v0

    long-to-double v0, v0

    const-wide/high16 v2, 0x4090000000000000L    # 1024.0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟۟ۧۢۡ(D)Ljava/lang/Double;

    move-result-object v0

    new-array v1, v4, [Ljava/lang/Object;

    sget v2, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v2, v2, 0x20e

    aput-object v0, v1, v2

    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVConfig$BackupFileInfo;->ۣ۟۠ۧۢ()[S

    move-result-object v0

    const/4 v2, 0x2

    sget v3, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    xor-int/lit8 v3, v3, -0x66

    const/16 v4, 0x500

    invoke-static {v0, v2, v3, v4}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۢ۠ۥۨ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۣۢ۠ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :sswitch_7
    invoke-static {p0}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣۢۧۡ(Ljava/lang/Object;)J

    move-result-wide v0

    long-to-double v0, v0

    const-wide/high16 v2, 0x4130000000000000L    # 1048576.0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟۟ۧۢۡ(D)Ljava/lang/Double;

    move-result-object v0

    new-array v1, v4, [Ljava/lang/Object;

    sget v2, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    xor-int/lit8 v2, v2, -0x35

    aput-object v0, v1, v2

    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVConfig$BackupFileInfo;->ۣ۟۠ۧۢ()[S

    move-result-object v0

    const/16 v2, 0x9

    sget v3, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۢ۠۠ۨ:I

    xor-int/lit8 v3, v3, -0x4e

    const/16 v4, 0x951

    invoke-static {v0, v2, v3, v4}, Landroidx/core/ۧ۟ۤۨ;->ۡۥ۟ۥ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۣۢ۠ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

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

.method public getFormattedTime()Ljava/lang/String;
    .locals 12

    const/4 v10, 0x0

    const/4 v1, 0x0

    const-wide/16 v8, 0x0

    const-string v6, "\u06e6\u06e2\u06e0"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move v7, v10

    move v11, v10

    :goto_0
    invoke-static {v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    return-object v5

    :sswitch_0
    xor-int/lit16 v10, v7, -0x3d1

    const-string v1, "\u06e3\u06e8\u06e2"

    move-object v6, v1

    move v11, v10

    goto :goto_0

    :sswitch_1
    new-instance v1, Ljava/text/SimpleDateFormat;

    invoke-direct {v1, v5, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const-string v6, "\u06df\u06e3\u06e6"

    move-object v4, v1

    goto :goto_0

    :sswitch_2
    const/16 v1, 0x10

    const/16 v5, 0x1cf

    invoke-static {v0, v1, v11, v5}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۢ۠ۥۨ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e6\u06e7\u06e2"

    move-object v5, v1

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->۠ۥۣۨ(Ljava/lang/Object;)J

    move-result-wide v8

    const-string v1, "\u06e6\u06e5\u06e5"

    move-object v6, v1

    goto :goto_0

    :sswitch_4
    invoke-static {v4, v3}, Landroidx/appcompat/resources/ۦۨۦۢ;->ۣ۟ۧۡۡ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e2\u06e5"

    move-object v5, v1

    goto :goto_0

    :sswitch_5
    invoke-static {}, Landroidx/activity/ۤۧۧۧ;->ۦۥۣ۟()Ljava/util/Locale;

    move-result-object v1

    const-string v6, "\u06e5\u06e1\u06e8"

    move-object v2, v1

    goto :goto_0

    :sswitch_6
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1, v8, v9}, Ljava/util/Date;-><init>(J)V

    const-string v6, "\u06e5\u06e4\u06e1"

    move-object v3, v1

    goto :goto_0

    :sswitch_7
    invoke-static {}, Lkevin/fun/hook/webdav/WebDAVConfig$BackupFileInfo;->ۣ۟۠ۧۢ()[S

    move-result-object v0

    const-string v1, "\u06e4\u06e3"

    move-object v6, v1

    goto :goto_0

    :sswitch_8
    sget v7, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    const-string v1, "\u06e8\u06e0\u06e6"

    move-object v6, v1

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdc7f -> :sswitch_8
        0x1aa782 -> :sswitch_3
        0x1ab71d -> :sswitch_2
        0x1abdcc -> :sswitch_1
        0x1abe22 -> :sswitch_4
        0x1ac1a4 -> :sswitch_7
        0x1ac206 -> :sswitch_6
        0x1ac241 -> :sswitch_5
        0x1ac8ee -> :sswitch_0
    .end sparse-switch
.end method
