.class public final La/lb$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/lb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Lorg/luckypray/dexkit/DexKitBridge;La/p;)La/lb;
    .locals 17

    move-object/from16 v0, p1

    const/4 v1, 0x4

    const-string v2, "bridge"

    move-object/from16 v4, p0

    invoke-static {v4, v2}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v2, 0xa

    invoke-virtual {v0, v2}, La/Pe;->b(I)I

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    iget-object v5, v0, La/Pe;->b:Ljava/nio/ByteBuffer;

    iget v6, v0, La/Pe;->a:I

    add-int/2addr v2, v6

    invoke-virtual {v5, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    const/high16 v5, 0x20000

    and-int v6, v2, v5

    if-lez v6, :cond_1

    xor-int/2addr v2, v5

    or-int/lit8 v2, v2, 0x20

    :cond_1
    move v8, v2

    invoke-virtual {v0, v1}, La/Pe;->b(I)I

    move-result v2

    if-eqz v2, :cond_2

    iget-object v5, v0, La/Pe;->b:Ljava/nio/ByteBuffer;

    iget v6, v0, La/Pe;->a:I

    add-int/2addr v2, v6

    invoke-virtual {v5, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    move v5, v2

    goto :goto_1

    :cond_2
    move v5, v3

    :goto_1
    const/4 v2, 0x6

    invoke-virtual {v0, v2}, La/Pe;->b(I)I

    move-result v2

    if-eqz v2, :cond_3

    iget-object v6, v0, La/Pe;->b:Ljava/nio/ByteBuffer;

    iget v7, v0, La/Pe;->a:I

    add-int/2addr v2, v7

    invoke-virtual {v6, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    move v6, v2

    goto :goto_2

    :cond_3
    move v6, v3

    :goto_2
    const/16 v2, 0x8

    invoke-virtual {v0, v2}, La/Pe;->b(I)I

    move-result v2

    if-eqz v2, :cond_4

    iget-object v7, v0, La/Pe;->b:Ljava/nio/ByteBuffer;

    iget v9, v0, La/Pe;->a:I

    add-int/2addr v2, v9

    invoke-virtual {v7, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    move v7, v2

    goto :goto_3

    :cond_4
    move v7, v3

    :goto_3
    const/16 v2, 0xc

    invoke-virtual {v0, v2}, La/Pe;->b(I)I

    move-result v2

    if-eqz v2, :cond_5

    iget v9, v0, La/Pe;->a:I

    add-int/2addr v2, v9

    invoke-virtual {v0, v2}, La/Pe;->d(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_4

    :cond_5
    const/4 v2, 0x0

    :goto_4
    if-nez v2, :cond_6

    const-string v2, ""

    :cond_6
    move-object v9, v2

    const/16 v2, 0xe

    invoke-virtual {v0, v2}, La/Pe;->b(I)I

    move-result v2

    if-eqz v2, :cond_7

    iget-object v10, v0, La/Pe;->b:Ljava/nio/ByteBuffer;

    iget v11, v0, La/Pe;->a:I

    add-int/2addr v2, v11

    invoke-virtual {v10, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    move v10, v2

    goto :goto_5

    :cond_7
    move v10, v3

    :goto_5
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    const/16 v2, 0x10

    invoke-virtual {v0, v2}, La/Pe;->b(I)I

    move-result v12

    if-eqz v12, :cond_8

    invoke-virtual {v0, v12}, La/Pe;->f(I)I

    move-result v12

    goto :goto_6

    :cond_8
    move v12, v3

    :goto_6
    move v13, v3

    :goto_7
    if-ge v13, v12, :cond_a

    invoke-virtual {v0, v2}, La/Pe;->b(I)I

    move-result v14

    if-eqz v14, :cond_9

    iget-object v15, v0, La/Pe;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v14}, La/Pe;->e(I)I

    move-result v14

    mul-int/lit8 v16, v13, 0x4

    add-int v14, v16, v14

    invoke-virtual {v15, v14}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v14

    goto :goto_8

    :cond_9
    move v14, v3

    :goto_8
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-virtual {v11, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v13, v13, 0x1

    goto :goto_7

    :cond_a
    sget-object v0, La/Wf;->a:La/Wf;

    new-instance v3, La/lb;

    invoke-direct/range {v3 .. v11}, La/lb;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;ILjava/util/ArrayList;)V

    return-object v3
.end method
