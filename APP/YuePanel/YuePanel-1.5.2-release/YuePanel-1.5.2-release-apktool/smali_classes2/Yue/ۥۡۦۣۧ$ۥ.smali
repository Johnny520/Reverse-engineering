.class public final LYue/ۥۡۦۣۧ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۦۣۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥ۟ۨۥۢ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LYue/ۥۡۦۣۧ$ۥ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ(Ljava/io/File;LYue/ۥۣۢ۟ۦ;LYue/ۥۣ۟ۥۤ;J)LYue/ۥۡۦۣۧ;
    .locals 10
    .param p1    # Ljava/io/File;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣۢ۟ۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣ۟ۥۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "file"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "upstream"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metadata"

    invoke-static {p3, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/io/RandomAccessFile;

    const-string v1, "rw"

    invoke-direct {v0, p1, v1}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance p1, LYue/ۥۡۦۣۧ;

    const-wide/16 v4, 0x0

    const/4 v9, 0x0

    move-object v1, p1

    move-object v2, v0

    move-object v3, p2

    move-object v6, p3

    move-wide v7, p4

    invoke-direct/range {v1 .. v9}, LYue/ۥۡۦۣۧ;-><init>(Ljava/io/RandomAccessFile;LYue/ۥۣۢ۟ۦ;JLYue/ۥۣ۟ۥۤ;JLYue/ۥ۟ۨۥۢ;)V

    const-wide/16 p2, 0x0

    invoke-virtual {v0, p2, p3}, Ljava/io/RandomAccessFile;->setLength(J)V

    sget-object v3, LYue/ۥۡۦۣۧ;->ۥ۟۟۠:LYue/ۥۣ۟ۥۤ;

    const-wide/16 v4, -0x1

    const-wide/16 v6, -0x1

    move-object v2, p1

    invoke-static/range {v2 .. v7}, LYue/ۥۡۦۣۧ;->ۥ(LYue/ۥۡۦۣۧ;LYue/ۥۣ۟ۥۤ;JJ)V

    return-object p1
.end method

.method public final ۥ۟(Ljava/io/File;)LYue/ۥۡۦۣۧ;
    .locals 11
    .param p1    # Ljava/io/File;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "file"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/io/RandomAccessFile;

    const-string v0, "rw"

    invoke-direct {v2, p1, v0}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance p1, LYue/ۥ۠ۡۨ۟;

    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v0

    const-string v1, "randomAccessFile.channel"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, v0}, LYue/ۥ۠ۡۨ۟;-><init>(Ljava/nio/channels/FileChannel;)V

    new-instance v0, LYue/ۥۣ۟ۢۨ;

    invoke-direct {v0}, LYue/ۥۣ۟ۢۨ;-><init>()V

    const-wide/16 v4, 0x0

    const-wide/16 v7, 0x20

    move-object v3, p1

    move-object v6, v0

    invoke-virtual/range {v3 .. v8}, LYue/ۥ۠ۡۨ۟;->ۥ(JLYue/ۥۣ۟ۢۨ;J)V

    sget-object v1, LYue/ۥۡۦۣۧ;->ۥ۟۟۟ۨ:LYue/ۥۣ۟ۥۤ;

    invoke-virtual {v1}, LYue/ۥۣ۟ۥۤ;->ۥ۟۟ۤ۠()I

    move-result v3

    int-to-long v3, v3

    invoke-virtual {v0, v3, v4}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟۠۟(J)LYue/ۥۣ۟ۥۤ;

    move-result-object v3

    invoke-static {v3, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, LYue/ۥۣ۟ۢۨ;->readLong()J

    move-result-wide v9

    invoke-virtual {v0}, LYue/ۥۣ۟ۢۨ;->readLong()J

    move-result-wide v7

    new-instance v0, LYue/ۥۣ۟ۢۨ;

    invoke-direct {v0}, LYue/ۥۣ۟ۢۨ;-><init>()V

    const-wide/16 v3, 0x20

    add-long v4, v9, v3

    move-object v3, p1

    move-object v6, v0

    invoke-virtual/range {v3 .. v8}, LYue/ۥ۠ۡۨ۟;->ۥ(JLYue/ۥۣ۟ۢۨ;J)V

    invoke-virtual {v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۤ۠()LYue/ۥۣ۟ۥۤ;

    move-result-object v6

    new-instance p1, LYue/ۥۡۦۣۧ;

    const-wide/16 v7, 0x0

    const/4 v0, 0x0

    const/4 v3, 0x0

    move-object v1, p1

    move-wide v4, v9

    move-object v9, v0

    invoke-direct/range {v1 .. v9}, LYue/ۥۡۦۣۧ;-><init>(Ljava/io/RandomAccessFile;LYue/ۥۣۢ۟ۦ;JLYue/ۥۣ۟ۥۤ;JLYue/ۥ۟ۨۥۢ;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "unreadable cache file"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
