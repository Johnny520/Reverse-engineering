.class public final LYue/ۥ۠ۥۤ۠;
.super LYue/ۥ۟ۢۦ;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۟ۢۦ;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟۠(ILjava/nio/ByteBuffer;)LYue/ۥ۠ۥۤ۠;
    .locals 1

    const/4 v0, 0x4

    invoke-virtual {p0, p1, v0, p2}, LYue/ۥ۟ۢۦ;->ۥ۟(IILjava/nio/ByteBuffer;)V

    return-object p0
.end method

.method public ۥ۟۟۟ۡ(I)I
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۢۦ;->ۥ۟۟۟:Ljava/nio/ByteBuffer;

    invoke-virtual {p0, p1}, LYue/ۥ۟ۢۦ;->ۥ(I)I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟ۢ(I)J
    .locals 4

    invoke-virtual {p0, p1}, LYue/ۥ۠ۥۤ۠;->ۥ۟۟۟ۡ(I)I

    move-result p1

    int-to-long v0, p1

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    return-wide v0
.end method
