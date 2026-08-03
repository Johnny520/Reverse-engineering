.class public final La/b3$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/b3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Lorg/luckypray/dexkit/DexKitBridge;La/d;)La/b3;
    .locals 18

    move-object/from16 v0, p1

    const/4 v1, 0x4

    const-string v2, "bridge"

    move-object/from16 v4, p0

    invoke-static {v4, v2}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, La/Pe;->b(I)I

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    iget-object v5, v0, La/Pe;->b:Ljava/nio/ByteBuffer;

    iget v6, v0, La/Pe;->a:I

    add-int/2addr v2, v6

    invoke-virtual {v5, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    move v5, v2

    goto :goto_0

    :cond_0
    move v5, v3

    :goto_0
    const/4 v2, 0x6

    invoke-virtual {v0, v2}, La/Pe;->b(I)I

    move-result v2

    if-eqz v2, :cond_1

    iget-object v6, v0, La/Pe;->b:Ljava/nio/ByteBuffer;

    iget v7, v0, La/Pe;->a:I

    add-int/2addr v2, v7

    invoke-virtual {v6, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    move v6, v2

    goto :goto_1

    :cond_1
    move v6, v3

    :goto_1
    const/16 v2, 0x8

    invoke-virtual {v0, v2}, La/Pe;->b(I)I

    move-result v2

    if-eqz v2, :cond_2

    iget v7, v0, La/Pe;->a:I

    add-int/2addr v2, v7

    invoke-virtual {v0, v2}, La/Pe;->d(I)Ljava/lang/String;

    :cond_2
    const/16 v2, 0xa

    invoke-virtual {v0, v2}, La/Pe;->b(I)I

    move-result v2

    if-eqz v2, :cond_3

    iget-object v7, v0, La/Pe;->b:Ljava/nio/ByteBuffer;

    iget v8, v0, La/Pe;->a:I

    add-int/2addr v2, v8

    invoke-virtual {v7, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    move v7, v2

    goto :goto_2

    :cond_3
    move v7, v3

    :goto_2
    const/16 v2, 0xc

    invoke-virtual {v0, v2}, La/Pe;->b(I)I

    move-result v2

    const/4 v8, 0x0

    if-eqz v2, :cond_4

    iget v9, v0, La/Pe;->a:I

    add-int/2addr v2, v9

    invoke-virtual {v0, v2}, La/Pe;->d(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_3

    :cond_4
    move-object v2, v8

    :goto_3
    if-nez v2, :cond_5

    const-string v2, ""

    :cond_5
    const/16 v9, 0xe

    invoke-virtual {v0, v9}, La/Pe;->b(I)I

    move-result v9

    if-eqz v9, :cond_6

    iget-object v10, v0, La/Pe;->b:Ljava/nio/ByteBuffer;

    iget v11, v0, La/Pe;->a:I

    add-int/2addr v9, v11

    invoke-virtual {v10, v9}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v9

    goto :goto_4

    :cond_6
    move v9, v3

    :goto_4
    const/4 v10, -0x1

    if-ne v9, v10, :cond_7

    :goto_5
    move-object v9, v8

    goto :goto_6

    :cond_7
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    goto :goto_5

    :goto_6
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    const/16 v8, 0x10

    invoke-virtual {v0, v8}, La/Pe;->b(I)I

    move-result v11

    if-eqz v11, :cond_8

    invoke-virtual {v0, v11}, La/Pe;->f(I)I

    move-result v11

    goto :goto_7

    :cond_8
    move v11, v3

    :goto_7
    move v12, v3

    :goto_8
    if-ge v12, v11, :cond_a

    invoke-virtual {v0, v8}, La/Pe;->b(I)I

    move-result v13

    if-eqz v13, :cond_9

    iget-object v14, v0, La/Pe;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v13}, La/Pe;->e(I)I

    move-result v13

    mul-int/lit8 v15, v12, 0x4

    add-int/2addr v15, v13

    invoke-virtual {v14, v15}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v13

    goto :goto_9

    :cond_9
    move v13, v3

    :goto_9
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v12, v12, 0x1

    goto :goto_8

    :cond_a
    sget-object v8, La/Wf;->a:La/Wf;

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    const/16 v8, 0x12

    invoke-virtual {v0, v8}, La/Pe;->b(I)I

    move-result v12

    if-eqz v12, :cond_b

    invoke-virtual {v0, v12}, La/Pe;->f(I)I

    move-result v12

    goto :goto_a

    :cond_b
    move v12, v3

    :goto_a
    move v13, v3

    :goto_b
    if-ge v13, v12, :cond_d

    invoke-virtual {v0, v8}, La/Pe;->b(I)I

    move-result v14

    if-eqz v14, :cond_c

    iget-object v15, v0, La/Pe;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v14}, La/Pe;->e(I)I

    move-result v14

    mul-int/lit8 v16, v13, 0x4

    add-int v14, v16, v14

    invoke-virtual {v15, v14}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v14

    goto :goto_c

    :cond_c
    move v14, v3

    :goto_c
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-virtual {v11, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v13, v13, 0x1

    goto :goto_b

    :cond_d
    sget-object v8, La/Wf;->a:La/Wf;

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    const/16 v8, 0x14

    invoke-virtual {v0, v8}, La/Pe;->b(I)I

    move-result v13

    if-eqz v13, :cond_e

    invoke-virtual {v0, v13}, La/Pe;->f(I)I

    move-result v13

    goto :goto_d

    :cond_e
    move v13, v3

    :goto_d
    move v14, v3

    :goto_e
    if-ge v14, v13, :cond_10

    invoke-virtual {v0, v8}, La/Pe;->b(I)I

    move-result v15

    move/from16 v16, v1

    if-eqz v15, :cond_f

    iget-object v1, v0, La/Pe;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v15}, La/Pe;->e(I)I

    move-result v15

    mul-int/lit8 v17, v14, 0x4

    add-int v15, v17, v15

    invoke-virtual {v1, v15}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v1

    goto :goto_f

    :cond_f
    move v1, v3

    :goto_f
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v12, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v14, v14, 0x1

    move/from16 v1, v16

    goto :goto_e

    :cond_10
    sget-object v0, La/Wf;->a:La/Wf;

    new-instance v3, La/b3;

    move-object v8, v2

    invoke-direct/range {v3 .. v12}, La/b3;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IIILjava/lang/String;Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    return-object v3
.end method
