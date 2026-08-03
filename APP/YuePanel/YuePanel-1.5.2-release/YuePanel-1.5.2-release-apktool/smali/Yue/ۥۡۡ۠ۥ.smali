.class public final LYue/ۥۡۡ۠ۥ;
.super LYue/ۥۣۢ۠ۧ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۡ۠ۥ$ۥ;
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

    const/4 v0, 0x6

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, LYue/ۥ۠ۢۢ;->ۥ۟۟۠(III)V

    return-void
.end method

.method public static ۥ۟۟ۡ(LYue/ۥ۠ۢۢ;S)V
    .locals 2

    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, LYue/ۥ۠ۢۢ;->ۥ۟۟۠۟(ISI)V

    return-void
.end method

.method public static ۥ۟۟ۡ۟(LYue/ۥ۠ۢۢ;Z)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, LYue/ۥ۠ۢۢ;->ۥ۟(IZZ)V

    return-void
.end method

.method public static ۥ۟۟ۡ۠(LYue/ۥ۠ۢۢ;S)V
    .locals 2

    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, LYue/ۥ۠ۢۢ;->ۥ۟۟۠۟(ISI)V

    return-void
.end method

.method public static ۥ۟۟ۡۡ(LYue/ۥ۠ۢۢ;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, v0}, LYue/ۥ۠ۢۢ;->ۥ۟۟۟ۥ(III)V

    return-void
.end method

.method public static ۥ۟۟ۡۢ(LYue/ۥ۠ۢۢ;S)V
    .locals 2

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, LYue/ۥ۠ۢۢ;->ۥ۟۟۠۟(ISI)V

    return-void
.end method

.method public static ۥۣ۟۟ۡ(LYue/ۥ۠ۢۢ;S)V
    .locals 2

    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, LYue/ۥ۠ۢۢ;->ۥ۟۟۠۟(ISI)V

    return-void
.end method

.method public static ۥ۟۟ۢ۠(LYue/ۥ۠ۢۢ;[I)I
    .locals 2

    array-length v0, p1

    const/4 v1, 0x4

    invoke-virtual {p0, v1, v0, v1}, LYue/ۥ۠ۢۢ;->ۥ۟۟ۤ۟(III)V

    array-length v0, p1

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    aget v1, p1, v0

    invoke-virtual {p0, v1}, LYue/ۥ۠ۢۢ;->ۥ۟۟۟ۤ(I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LYue/ۥ۠ۢۢ;->ۥۣ۟۟ۡ()I

    move-result p0

    return p0
.end method

.method public static ۥ۟۟ۢۡ(LYue/ۥ۠ۢۢ;IZSSSSI)I
    .locals 1

    const/4 v0, 0x7

    invoke-virtual {p0, v0}, LYue/ۥ۠ۢۢ;->ۥ۟۟ۤ(I)V

    invoke-static {p0, p7}, LYue/ۥۡۡ۠ۥ;->ۥ۟۟۠ۨ(LYue/ۥ۠ۢۢ;I)V

    invoke-static {p0, p1}, LYue/ۥۡۡ۠ۥ;->ۥ۟۟ۡۡ(LYue/ۥ۠ۢۢ;I)V

    invoke-static {p0, p6}, LYue/ۥۡۡ۠ۥ;->ۥ۟۟ۡ۠(LYue/ۥ۠ۢۢ;S)V

    invoke-static {p0, p5}, LYue/ۥۡۡ۠ۥ;->ۥۣ۟۟ۡ(LYue/ۥ۠ۢۢ;S)V

    invoke-static {p0, p4}, LYue/ۥۡۡ۠ۥ;->ۥ۟۟ۡ(LYue/ۥ۠ۢۢ;S)V

    invoke-static {p0, p3}, LYue/ۥۡۡ۠ۥ;->ۥ۟۟ۡۢ(LYue/ۥ۠ۢۢ;S)V

    invoke-static {p0, p2}, LYue/ۥۡۡ۠ۥ;->ۥ۟۟ۡ۟(LYue/ۥ۠ۢۢ;Z)V

    invoke-static {p0}, LYue/ۥۡۡ۠ۥ;->ۥۣ۟۟ۢ(LYue/ۥ۠ۢۢ;)I

    move-result p0

    return p0
.end method

.method public static ۥۣ۟۟ۢ(LYue/ۥ۠ۢۢ;)I
    .locals 0

    invoke-virtual {p0}, LYue/ۥ۠ۢۢ;->ۥ۟۟ۡۢ()I

    move-result p0

    return p0
.end method

.method public static ۥ۟۟ۢۤ(Ljava/nio/ByteBuffer;)LYue/ۥۡۡ۠ۥ;
    .locals 1

    new-instance v0, LYue/ۥۡۡ۠ۥ;

    invoke-direct {v0}, LYue/ۥۡۡ۠ۥ;-><init>()V

    invoke-static {p0, v0}, LYue/ۥۡۡ۠ۥ;->ۥ۟۟ۢۥ(Ljava/nio/ByteBuffer;LYue/ۥۡۡ۠ۥ;)LYue/ۥۡۡ۠ۥ;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟ۢۥ(Ljava/nio/ByteBuffer;LYue/ۥۡۡ۠ۥ;)LYue/ۥۡۡ۠ۥ;
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

    invoke-virtual {p1, v0, p0}, LYue/ۥۡۡ۠ۥ;->ۥ۟۟۠ۥ(ILjava/nio/ByteBuffer;)LYue/ۥۡۡ۠ۥ;

    move-result-object p0

    return-object p0
.end method

.method public static ۥۣ۟۟(LYue/ۥ۠ۢۢ;I)V
    .locals 1

    const/4 v0, 0x4

    invoke-virtual {p0, v0, p1, v0}, LYue/ۥ۠ۢۢ;->ۥ۟۟ۤ۟(III)V

    return-void
.end method

.method public static ۥۣ۟۟۟(LYue/ۥ۠ۢۢ;)V
    .locals 1

    const/4 v0, 0x7

    invoke-virtual {p0, v0}, LYue/ۥ۠ۢۢ;->ۥ۟۟ۤ(I)V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۠ۥ(ILjava/nio/ByteBuffer;)LYue/ۥۡۡ۠ۥ;
    .locals 0

    invoke-virtual {p0, p1, p2}, LYue/ۥۡۡ۠ۥ;->ۥ۟۟۠ۦ(ILjava/nio/ByteBuffer;)V

    return-object p0
.end method

.method public ۥ۟۟۠ۦ(ILjava/nio/ByteBuffer;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, LYue/ۥۣۢ۠ۧ;->ۥ۟۟۟ۡ(ILjava/nio/ByteBuffer;)V

    return-void
.end method

.method public ۥ۟۟ۡۤ(I)I
    .locals 2

    const/16 v0, 0x10

    invoke-virtual {p0, v0}, LYue/ۥۣۢ۠ۧ;->ۥ۟۟۟(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LYue/ۥۣۢ۠ۧ;->ۥ۟:Ljava/nio/ByteBuffer;

    invoke-virtual {p0, v0}, LYue/ۥۣۢ۠ۧ;->ۥ۟۟۟ۦ(I)I

    move-result v0

    mul-int/lit8 p1, p1, 0x4

    add-int/2addr v0, p1

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public ۥ۟۟ۡۥ()Ljava/nio/ByteBuffer;
    .locals 2

    const/16 v0, 0x10

    const/4 v1, 0x4

    invoke-virtual {p0, v0, v1}, LYue/ۥۣۢ۠ۧ;->ۥ۟۟۟ۧ(II)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۡۦ(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 2

    const/16 v0, 0x10

    const/4 v1, 0x4

    invoke-virtual {p0, p1, v0, v1}, LYue/ۥۣۢ۠ۧ;->ۥ۟۟۟ۨ(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟ۡۧ()I
    .locals 1

    const/16 v0, 0x10

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

.method public ۥ۟۟ۡۨ()LYue/ۥ۠ۥۤ۠;
    .locals 1

    new-instance v0, LYue/ۥ۠ۥۤ۠;

    invoke-direct {v0}, LYue/ۥ۠ۥۤ۠;-><init>()V

    invoke-virtual {p0, v0}, LYue/ۥۡۡ۠ۥ;->ۥ۟۟ۢ(LYue/ۥ۠ۥۤ۠;)LYue/ۥ۠ۥۤ۠;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۢ(LYue/ۥ۠ۥۤ۠;)LYue/ۥ۠ۥۤ۠;
    .locals 2

    const/16 v0, 0x10

    invoke-virtual {p0, v0}, LYue/ۥۣۢ۠ۧ;->ۥ۟۟۟(I)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, LYue/ۥۣۢ۠ۧ;->ۥ۟۟۟ۦ(I)I

    move-result v0

    iget-object v1, p0, LYue/ۥۣۢ۠ۧ;->ۥ۟:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v0, v1}, LYue/ۥ۠ۥۤ۠;->ۥ۟۟۟۠(ILjava/nio/ByteBuffer;)LYue/ۥ۠ۥۤ۠;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public ۥ۟۟ۢ۟()S
    .locals 3

    const/16 v0, 0xa

    invoke-virtual {p0, v0}, LYue/ۥۣۢ۠ۧ;->ۥ۟۟۟(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LYue/ۥۣۢ۠ۧ;->ۥ۟:Ljava/nio/ByteBuffer;

    iget v2, p0, LYue/ۥۣۢ۠ۧ;->ۥ:I

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥ۟۟ۢۢ()Z
    .locals 4

    const/4 v0, 0x6

    invoke-virtual {p0, v0}, LYue/ۥۣۢ۠ۧ;->ۥ۟۟۟(I)I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v2, p0, LYue/ۥۣۢ۠ۧ;->ۥ۟:Ljava/nio/ByteBuffer;

    iget v3, p0, LYue/ۥۣۢ۠ۧ;->ۥ:I

    add-int/2addr v0, v3

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public ۥ۟۟ۢۦ()S
    .locals 3

    const/16 v0, 0xe

    invoke-virtual {p0, v0}, LYue/ۥۣۢ۠ۧ;->ۥ۟۟۟(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LYue/ۥۣۢ۠ۧ;->ۥ۟:Ljava/nio/ByteBuffer;

    iget v2, p0, LYue/ۥۣۢ۠ۧ;->ۥ:I

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥ۟۟ۢۧ()I
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

.method public ۥ۟۟ۢۨ()S
    .locals 3

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, LYue/ۥۣۢ۠ۧ;->ۥ۟۟۟(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LYue/ۥۣۢ۠ۧ;->ۥ۟:Ljava/nio/ByteBuffer;

    iget v2, p0, LYue/ۥۣۢ۠ۧ;->ۥ:I

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥۣ۟۟۠()S
    .locals 3

    const/16 v0, 0xc

    invoke-virtual {p0, v0}, LYue/ۥۣۢ۠ۧ;->ۥ۟۟۟(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LYue/ۥۣۢ۠ۧ;->ۥ۟:Ljava/nio/ByteBuffer;

    iget v2, p0, LYue/ۥۣۢ۠ۧ;->ۥ:I

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
