.class public final La/r6$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/r6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Lorg/luckypray/dexkit/DexKitBridge;La/o;)La/r6;
    .locals 9

    const-string v0, "bridge"

    invoke-static {p0, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, La/r6;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, La/Pe;->b(I)I

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-object v3, p1, La/Pe;->b:Ljava/nio/ByteBuffer;

    iget v4, p1, La/Pe;->a:I

    add-int/2addr v0, v4

    invoke-virtual {v3, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    move v3, v0

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    const/4 v0, 0x6

    invoke-virtual {p1, v0}, La/Pe;->b(I)I

    move-result v0

    if-eqz v0, :cond_1

    iget-object v4, p1, La/Pe;->b:Ljava/nio/ByteBuffer;

    iget v5, p1, La/Pe;->a:I

    add-int/2addr v0, v5

    invoke-virtual {v4, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    move v4, v0

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    const/16 v0, 0x8

    invoke-virtual {p1, v0}, La/Pe;->b(I)I

    move-result v0

    if-eqz v0, :cond_2

    iget-object v5, p1, La/Pe;->b:Ljava/nio/ByteBuffer;

    iget v6, p1, La/Pe;->a:I

    add-int/2addr v0, v6

    invoke-virtual {v5, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    move v5, v0

    goto :goto_2

    :cond_2
    move v5, v2

    :goto_2
    const/16 v0, 0xa

    invoke-virtual {p1, v0}, La/Pe;->b(I)I

    move-result v0

    if-eqz v0, :cond_3

    iget-object v6, p1, La/Pe;->b:Ljava/nio/ByteBuffer;

    iget v7, p1, La/Pe;->a:I

    add-int/2addr v0, v7

    invoke-virtual {v6, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    move v6, v0

    goto :goto_3

    :cond_3
    move v6, v2

    :goto_3
    const/16 v0, 0xc

    invoke-virtual {p1, v0}, La/Pe;->b(I)I

    move-result v0

    if-eqz v0, :cond_4

    iget v7, p1, La/Pe;->a:I

    add-int/2addr v0, v7

    invoke-virtual {p1, v0}, La/Pe;->d(I)Ljava/lang/String;

    move-result-object v0

    :goto_4
    move-object v7, v0

    goto :goto_5

    :cond_4
    const/4 v0, 0x0

    goto :goto_4

    :goto_5
    invoke-static {v7}, La/i9;->b(Ljava/lang/Object;)V

    const/16 v0, 0xe

    invoke-virtual {p1, v0}, La/Pe;->b(I)I

    move-result v0

    if-eqz v0, :cond_5

    iget-object v2, p1, La/Pe;->b:Ljava/nio/ByteBuffer;

    iget p1, p1, La/Pe;->a:I

    add-int/2addr v0, p1

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    :cond_5
    move v8, v2

    move-object v2, p0

    invoke-direct/range {v1 .. v8}, La/r6;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;I)V

    return-object v1
.end method
