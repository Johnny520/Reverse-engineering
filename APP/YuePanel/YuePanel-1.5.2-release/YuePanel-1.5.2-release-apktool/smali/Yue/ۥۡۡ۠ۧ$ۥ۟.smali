.class public LYue/ۥۡۡ۠ۧ$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡۡ۠ۧ$ۥ۟۟۟;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۡ۠ۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df"
.end annotation


# instance fields
.field public final ۥ۟۟:[B
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field

.field public final ۥ۟۟۟:Ljava/nio/ByteBuffer;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field

.field public final ۥ۟۟۟۟:Ljava/io/InputStream;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field

.field public ۥ۟۟۟۠:J


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 2
    .param p1    # Ljava/io/InputStream;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, LYue/ۥۡۡ۠ۧ$ۥ۟;->ۥ۟۟۟۠:J

    iput-object p1, p0, LYue/ۥۡۡ۠ۧ$ۥ۟;->ۥ۟۟۟۟:Ljava/io/InputStream;

    const/4 p1, 0x4

    new-array p1, p1, [B

    iput-object p1, p0, LYue/ۥۡۡ۠ۧ$ۥ۟;->ۥ۟۟:[B

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۡۡ۠ۧ$ۥ۟;->ۥ۟۟۟:Ljava/nio/ByteBuffer;

    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    return-void
.end method


# virtual methods
.method public getPosition()J
    .locals 2

    iget-wide v0, p0, LYue/ۥۡۡ۠ۧ$ۥ۟;->ۥ۟۟۟۠:J

    return-wide v0
.end method

.method public readUnsignedShort()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۡ۠ۧ$ۥ۟;->ۥ۟۟۟:Ljava/nio/ByteBuffer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, LYue/ۥۡۡ۠ۧ$ۥ۟;->ۥ۟۟۟(I)V

    iget-object v0, p0, LYue/ۥۡۡ۠ۧ$ۥ۟;->ۥ۟۟۟:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v0

    invoke-static {v0}, LYue/ۥۡۡ۠ۧ;->ۥ۟۟۟۠(S)I

    move-result v0

    return v0
.end method

.method public ۥ()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۡ۠ۧ$ۥ۟;->ۥ۟۟۟:Ljava/nio/ByteBuffer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, LYue/ۥۡۡ۠ۧ$ۥ۟;->ۥ۟۟۟(I)V

    iget-object v0, p0, LYue/ۥۡۡ۠ۧ$ۥ۟;->ۥ۟۟۟:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    return v0
.end method

.method public ۥ۟(I)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    :goto_0
    if-lez p1, :cond_1

    iget-object v0, p0, LYue/ۥۡۡ۠ۧ$ۥ۟;->ۥ۟۟۟۟:Ljava/io/InputStream;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v0

    long-to-int v0, v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_0

    sub-int/2addr p1, v0

    iget-wide v1, p0, LYue/ۥۡۡ۠ۧ$ۥ۟;->ۥ۟۟۟۠:J

    int-to-long v3, v0

    add-long/2addr v1, v3

    iput-wide v1, p0, LYue/ۥۡۡ۠ۧ$ۥ۟;->ۥ۟۟۟۠:J

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Skip didn\'t move at least 1 byte forward"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-void
.end method

.method public ۥ۟۟()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۡ۠ۧ$ۥ۟;->ۥ۟۟۟:Ljava/nio/ByteBuffer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, LYue/ۥۡۡ۠ۧ$ۥ۟;->ۥ۟۟۟(I)V

    iget-object v0, p0, LYue/ۥۡۡ۠ۧ$ۥ۟;->ۥ۟۟۟:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    invoke-static {v0}, LYue/ۥۡۡ۠ۧ;->ۥ۟۟۟۟(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۥ۟۟۟(I)V
    .locals 4
    .param p1    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
            to = 0x4L
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۡ۠ۧ$ۥ۟;->ۥ۟۟۟۟:Ljava/io/InputStream;

    iget-object v1, p0, LYue/ۥۡۡ۠ۧ$ۥ۟;->ۥ۟۟:[B

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p1}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    if-ne v0, p1, :cond_0

    iget-wide v0, p0, LYue/ۥۡۡ۠ۧ$ۥ۟;->ۥ۟۟۟۠:J

    int-to-long v2, p1

    add-long/2addr v0, v2

    iput-wide v0, p0, LYue/ۥۡۡ۠ۧ$ۥ۟;->ۥ۟۟۟۠:J

    return-void

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "read failed"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
