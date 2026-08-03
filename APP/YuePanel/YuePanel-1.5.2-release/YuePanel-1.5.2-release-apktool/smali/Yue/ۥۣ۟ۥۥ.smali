.class public final LYue/ۥۣ۟ۥۥ;
.super LYue/ۥ۟ۢۦ;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۟ۢۦ;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟۠(ILjava/nio/ByteBuffer;)LYue/ۥۣ۟ۥۥ;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0, p2}, LYue/ۥ۟ۢۦ;->ۥ۟(IILjava/nio/ByteBuffer;)V

    return-object p0
.end method

.method public ۥ۟۟۟ۡ(I)B
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۢۦ;->ۥ۟۟۟:Ljava/nio/ByteBuffer;

    invoke-virtual {p0, p1}, LYue/ۥ۟ۢۦ;->ۥ(I)I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟ۢ(I)I
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥۣ۟ۥۥ;->ۥ۟۟۟ۡ(I)B

    move-result p1

    and-int/lit16 p1, p1, 0xff

    return p1
.end method
