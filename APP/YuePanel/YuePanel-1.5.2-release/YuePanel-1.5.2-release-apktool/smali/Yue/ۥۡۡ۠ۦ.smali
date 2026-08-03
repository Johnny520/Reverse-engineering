.class public final LYue/ۥۡۡ۠ۦ;
.super LYue/ۥۣۢ۠ۧ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۡ۠ۦ$ۥ;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥۣۢ۠ۧ;-><init>()V

    return-void
.end method

.method public static ۥ۟۟۠ۤ()V
    .locals 0

    invoke-static {}, LYue/ۥ۟ۦۨۨ;->ۥ()V

    return-void
.end method

.method public static synthetic ۥ۟۟۠ۧ(ILjava/nio/ByteBuffer;)I
    .locals 0

    invoke-static {p0, p1}, LYue/ۥۣۢ۠ۧ;->ۥ۟۟(ILjava/nio/ByteBuffer;)I

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۠ۨ(LYue/ۥ۠ۢۢ;I)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, LYue/ۥ۠ۢۢ;->ۥ۟۟۠(III)V

    return-void
.end method

.method public static ۥ۟۟ۡ(LYue/ۥ۠ۢۢ;I)V
    .locals 2

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, LYue/ۥ۠ۢۢ;->ۥ۟۟۠(III)V

    return-void
.end method

.method public static ۥ۟۟ۡ۟(LYue/ۥ۠ۢۢ;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, v0}, LYue/ۥ۠ۢۢ;->ۥ۟۟۟ۥ(III)V

    return-void
.end method

.method public static ۥ۟۟ۡ۠(LYue/ۥ۠ۢۢ;[I)I
    .locals 2

    array-length v0, p1

    const/4 v1, 0x4

    invoke-virtual {p0, v1, v0, v1}, LYue/ۥ۠ۢۢ;->ۥ۟۟ۤ۟(III)V

    array-length v0, p1

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    aget v1, p1, v0

    invoke-virtual {p0, v1}, LYue/ۥ۠ۢۢ;->ۥ۟۟۟ۨ(I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LYue/ۥ۠ۢۢ;->ۥۣ۟۟ۡ()I

    move-result p0

    return p0
.end method

.method public static ۥ۟۟ۡۡ(LYue/ۥ۠ۢۢ;III)I
    .locals 1

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, LYue/ۥ۠ۢۢ;->ۥ۟۟ۤ(I)V

    invoke-static {p0, p3}, LYue/ۥۡۡ۠ۦ;->ۥ۟۟ۡ(LYue/ۥ۠ۢۢ;I)V

    invoke-static {p0, p2}, LYue/ۥۡۡ۠ۦ;->ۥ۟۟۠ۨ(LYue/ۥ۠ۢۢ;I)V

    invoke-static {p0, p1}, LYue/ۥۡۡ۠ۦ;->ۥ۟۟ۡ۟(LYue/ۥ۠ۢۢ;I)V

    invoke-static {p0}, LYue/ۥۡۡ۠ۦ;->ۥ۟۟ۡۢ(LYue/ۥ۠ۢۢ;)I

    move-result p0

    return p0
.end method

.method public static ۥ۟۟ۡۢ(LYue/ۥ۠ۢۢ;)I
    .locals 0

    invoke-virtual {p0}, LYue/ۥ۠ۢۢ;->ۥ۟۟ۡۢ()I

    move-result p0

    return p0
.end method

.method public static ۥۣ۟۟ۡ(LYue/ۥ۠ۢۢ;I)V
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۠ۢۢ;->ۥ۟۟ۡۤ(I)V

    return-void
.end method

.method public static ۥ۟۟ۡۤ(LYue/ۥ۠ۢۢ;I)V
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۠ۢۢ;->ۥ۟۟ۡۨ(I)V

    return-void
.end method

.method public static ۥ۟۟ۡۥ(Ljava/nio/ByteBuffer;)LYue/ۥۡۡ۠ۦ;
    .locals 1

    new-instance v0, LYue/ۥۡۡ۠ۦ;

    invoke-direct {v0}, LYue/ۥۡۡ۠ۦ;-><init>()V

    invoke-static {p0, v0}, LYue/ۥۡۡ۠ۦ;->ۥ۟۟ۡۦ(Ljava/nio/ByteBuffer;LYue/ۥۡۡ۠ۦ;)LYue/ۥۡۡ۠ۦ;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟ۡۦ(Ljava/nio/ByteBuffer;LYue/ۥۡۡ۠ۦ;)LYue/ۥۡۡ۠ۦ;
    .locals 2

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v0

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p1, v0, p0}, LYue/ۥۡۡ۠ۦ;->ۥ۟۟۠ۥ(ILjava/nio/ByteBuffer;)LYue/ۥۡۡ۠ۦ;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟ۢۤ(LYue/ۥ۠ۢۢ;I)V
    .locals 1

    const/4 v0, 0x4

    invoke-virtual {p0, v0, p1, v0}, LYue/ۥ۠ۢۢ;->ۥ۟۟ۤ۟(III)V

    return-void
.end method

.method public static ۥ۟۟ۢۥ(LYue/ۥ۠ۢۢ;)V
    .locals 1

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, LYue/ۥ۠ۢۢ;->ۥ۟۟ۤ(I)V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۠ۥ(ILjava/nio/ByteBuffer;)LYue/ۥۡۡ۠ۦ;
    .locals 0

    invoke-virtual {p0, p1, p2}, LYue/ۥۡۡ۠ۦ;->ۥ۟۟۠ۦ(ILjava/nio/ByteBuffer;)V

    return-object p0
.end method

.method public ۥ۟۟۠ۦ(ILjava/nio/ByteBuffer;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, LYue/ۥۣۢ۠ۧ;->ۥ۟۟۟ۡ(ILjava/nio/ByteBuffer;)V

    return-void
.end method

.method public ۥ۟۟ۡۧ(I)LYue/ۥۡۡ۠ۥ;
    .locals 1

    new-instance v0, LYue/ۥۡۡ۠ۥ;

    invoke-direct {v0}, LYue/ۥۡۡ۠ۥ;-><init>()V

    invoke-virtual {p0, v0, p1}, LYue/ۥۡۡ۠ۦ;->ۥ۟۟ۡۨ(LYue/ۥۡۡ۠ۥ;I)LYue/ۥۡۡ۠ۥ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟ۡۨ(LYue/ۥۡۡ۠ۥ;I)LYue/ۥۡۡ۠ۥ;
    .locals 1

    const/4 v0, 0x6

    invoke-virtual {p0, v0}, LYue/ۥۣۢ۠ۧ;->ۥ۟۟۟(I)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, LYue/ۥۣۢ۠ۧ;->ۥ۟۟۟ۦ(I)I

    move-result v0

    mul-int/lit8 p2, p2, 0x4

    add-int/2addr v0, p2

    invoke-virtual {p0, v0}, LYue/ۥۣۢ۠ۧ;->ۥ۟(I)I

    move-result p2

    iget-object v0, p0, LYue/ۥۣۢ۠ۧ;->ۥ۟:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, p2, v0}, LYue/ۥۡۡ۠ۥ;->ۥ۟۟۠ۥ(ILjava/nio/ByteBuffer;)LYue/ۥۡۡ۠ۥ;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public ۥ۟۟ۢ()I
    .locals 1

    const/4 v0, 0x6

    invoke-virtual {p0, v0}, LYue/ۥۣۢ۠ۧ;->ۥ۟۟۟(I)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, LYue/ۥۣۢ۠ۧ;->ۥ۟۟۠(I)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥ۟۟ۢ۟()LYue/ۥۡۡ۠ۥ$ۥ;
    .locals 1

    new-instance v0, LYue/ۥۡۡ۠ۥ$ۥ;

    invoke-direct {v0}, LYue/ۥۡۡ۠ۥ$ۥ;-><init>()V

    invoke-virtual {p0, v0}, LYue/ۥۡۡ۠ۦ;->ۥ۟۟ۢ۠(LYue/ۥۡۡ۠ۥ$ۥ;)LYue/ۥۡۡ۠ۥ$ۥ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۢ۠(LYue/ۥۡۡ۠ۥ$ۥ;)LYue/ۥۡۡ۠ۥ$ۥ;
    .locals 3

    const/4 v0, 0x6

    invoke-virtual {p0, v0}, LYue/ۥۣۢ۠ۧ;->ۥ۟۟۟(I)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, LYue/ۥۣۢ۠ۧ;->ۥ۟۟۟ۦ(I)I

    move-result v0

    const/4 v1, 0x4

    iget-object v2, p0, LYue/ۥۣۢ۠ۧ;->ۥ۟:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v0, v1, v2}, LYue/ۥۡۡ۠ۥ$ۥ;->ۥ۟۟۟۠(IILjava/nio/ByteBuffer;)LYue/ۥۡۡ۠ۥ$ۥ;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public ۥ۟۟ۢۡ()Ljava/lang/String;
    .locals 2

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, LYue/ۥۣۢ۠ۧ;->ۥ۟۟۟(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget v1, p0, LYue/ۥۣۢ۠ۧ;->ۥ:I

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, LYue/ۥۣۢ۠ۧ;->ۥ۟۟۟ۢ(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public ۥ۟۟ۢۢ()Ljava/nio/ByteBuffer;
    .locals 2

    const/16 v0, 0x8

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, LYue/ۥۣۢ۠ۧ;->ۥ۟۟۟ۧ(II)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public ۥۣ۟۟ۢ(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 2

    const/16 v0, 0x8

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, LYue/ۥۣۢ۠ۧ;->ۥ۟۟۟ۨ(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟ۢۦ()I
    .locals 3

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, LYue/ۥۣۢ۠ۧ;->ۥ۟۟۟(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LYue/ۥۣۢ۠ۧ;->ۥ۟:Ljava/nio/ByteBuffer;

    iget v2, p0, LYue/ۥۣۢ۠ۧ;->ۥ:I

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
