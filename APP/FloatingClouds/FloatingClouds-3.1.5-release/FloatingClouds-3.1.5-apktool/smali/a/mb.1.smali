.class public final La/mb;
.super La/u9;
.source "SourceFile"

# interfaces
.implements La/s7;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lorg/luckypray/dexkit/DexKitBridge;

.field public final synthetic d:La/X1;

.field public final synthetic e:I

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;La/X1;III)V
    .locals 0

    iput p5, p0, La/mb;->b:I

    iput-object p1, p0, La/mb;->c:Lorg/luckypray/dexkit/DexKitBridge;

    iput-object p2, p0, La/mb;->d:La/X1;

    iput p3, p0, La/mb;->e:I

    iput p4, p0, La/mb;->f:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, La/u9;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 13

    iget v0, p0, La/mb;->b:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, La/mb;->e:I

    iget v1, p0, La/mb;->f:I

    iget-object v2, p0, La/mb;->d:La/X1;

    check-cast v2, La/b3;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v1}, La/X1;->a(II)J

    move-result-wide v0

    iget-object v2, p0, La/mb;->c:Lorg/luckypray/dexkit/DexKitBridge;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v2, Lorg/luckypray/dexkit/DexKitBridge;->b:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    :try_start_0
    iget-wide v4, v2, Lorg/luckypray/dexkit/DexKitBridge;->a:J

    const-wide/16 v6, 0x0

    cmp-long v6, v4, v6

    if-eqz v6, :cond_2

    invoke-static {v4, v5, v0, v1}, Lorg/luckypray/dexkit/DexKitBridge;->e(JJ)[B

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    const-string v1, "wrap(res)"

    invoke-static {v0, v1}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, La/a;

    invoke-direct {v1}, La/Pe;-><init>()V

    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v3

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v4

    add-int/2addr v4, v3

    invoke-virtual {v1, v4, v0}, La/Pe;->c(ILjava/nio/ByteBuffer;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x4

    invoke-virtual {v1, v3}, La/Pe;->b(I)I

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    invoke-virtual {v1, v3}, La/Pe;->f(I)I

    move-result v3

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    if-ge v4, v3, :cond_1

    invoke-virtual {v1, v4}, La/a;->g(I)La/c;

    move-result-object v5

    invoke-static {v5}, La/i9;->b(Ljava/lang/Object;)V

    invoke-static {v2, v5}, La/x0$a;->a(Lorg/luckypray/dexkit/DexKitBridge;La/c;)La/x0;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    return-object v0

    :cond_2
    :try_start_1
    const-string v0, "DexKitBridge is not valid"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    throw v0

    :pswitch_0
    iget v0, p0, La/mb;->e:I

    iget v1, p0, La/mb;->f:I

    iget-object v2, p0, La/mb;->d:La/X1;

    check-cast v2, La/lb;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v1}, La/X1;->a(II)J

    move-result-wide v0

    iget-object v2, p0, La/mb;->c:Lorg/luckypray/dexkit/DexKitBridge;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v2, Lorg/luckypray/dexkit/DexKitBridge;->b:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    :try_start_2
    iget-wide v4, v2, Lorg/luckypray/dexkit/DexKitBridge;->a:J

    const-wide/16 v6, 0x0

    cmp-long v2, v4, v6

    if-eqz v2, :cond_3

    invoke-static {v4, v5, v0, v1}, Lorg/luckypray/dexkit/DexKitBridge;->m(JJ)[Ljava/lang/String;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    invoke-static {v0}, La/N1;->g0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_3
    :try_start_3
    const-string v0, "DexKitBridge is not valid"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    throw v0

    :pswitch_1
    iget v0, p0, La/mb;->e:I

    iget v1, p0, La/mb;->f:I

    iget-object v2, p0, La/mb;->d:La/X1;

    check-cast v2, La/lb;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v1}, La/X1;->a(II)J

    move-result-wide v0

    iget-object v2, p0, La/mb;->c:Lorg/luckypray/dexkit/DexKitBridge;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v2, Lorg/luckypray/dexkit/DexKitBridge;->b:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    :try_start_4
    iget-wide v4, v2, Lorg/luckypray/dexkit/DexKitBridge;->a:J

    const-wide/16 v6, 0x0

    cmp-long v6, v4, v6

    if-eqz v6, :cond_c

    invoke-static {v4, v5, v0, v1}, Lorg/luckypray/dexkit/DexKitBridge;->l(JJ)[B

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    const-string v1, "wrap(res)"

    invoke-static {v0, v1}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, La/a;

    invoke-direct {v1}, La/Pe;-><init>()V

    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v3

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v4

    add-int/2addr v4, v3

    invoke-virtual {v1, v4, v0}, La/Pe;->c(ILjava/nio/ByteBuffer;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x4

    invoke-virtual {v1, v3}, La/Pe;->b(I)I

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_4

    invoke-virtual {v1, v4}, La/Pe;->f(I)I

    move-result v4

    goto :goto_1

    :cond_4
    move v4, v5

    :goto_1
    move v6, v5

    :goto_2
    if-ge v6, v4, :cond_b

    new-instance v7, La/a;

    invoke-direct {v7}, La/Pe;-><init>()V

    invoke-virtual {v1, v3}, La/Pe;->b(I)I

    move-result v8

    const/4 v9, 0x0

    const-string v10, "bb"

    if-eqz v8, :cond_5

    invoke-virtual {v1, v8}, La/Pe;->e(I)I

    move-result v8

    mul-int/lit8 v11, v6, 0x4

    add-int/2addr v11, v8

    invoke-virtual {v1, v11}, La/Pe;->a(I)I

    move-result v8

    iget-object v11, v1, La/Pe;->b:Ljava/nio/ByteBuffer;

    invoke-static {v11, v10}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7, v8, v11}, La/Pe;->c(ILjava/nio/ByteBuffer;)V

    goto :goto_3

    :cond_5
    move-object v7, v9

    :goto_3
    invoke-static {v7}, La/i9;->b(Ljava/lang/Object;)V

    new-instance v8, La/o;

    invoke-direct {v8}, La/o;-><init>()V

    invoke-virtual {v7, v3}, La/Pe;->b(I)I

    move-result v11

    if-eqz v11, :cond_6

    iget v9, v7, La/Pe;->a:I

    add-int/2addr v11, v9

    invoke-virtual {v7, v11}, La/Pe;->a(I)I

    move-result v9

    iget-object v11, v7, La/Pe;->b:Ljava/nio/ByteBuffer;

    invoke-static {v11, v10}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v8, v9, v11}, La/Pe;->c(ILjava/nio/ByteBuffer;)V

    move-object v9, v8

    :cond_6
    invoke-static {v9}, La/i9;->b(Ljava/lang/Object;)V

    invoke-static {v2, v9}, La/r6$a;->a(Lorg/luckypray/dexkit/DexKitBridge;La/o;)La/r6;

    move-result-object v8

    const/4 v9, 0x6

    invoke-virtual {v7, v9}, La/Pe;->b(I)I

    move-result v10

    if-eqz v10, :cond_7

    iget-object v11, v7, La/Pe;->b:Ljava/nio/ByteBuffer;

    iget v12, v7, La/Pe;->a:I

    add-int/2addr v10, v12

    invoke-virtual {v11, v10}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v10

    goto :goto_4

    :cond_7
    move v10, v5

    :goto_4
    const/4 v11, 0x1

    if-ne v10, v11, :cond_8

    sget-object v7, La/u6;->a:La/u6;

    goto :goto_5

    :cond_8
    const/4 v11, 0x2

    if-ne v10, v11, :cond_9

    sget-object v7, La/u6;->b:La/u6;

    :goto_5
    new-instance v9, La/Yf;

    invoke-direct {v9, v8, v7}, La/Yf;-><init>(La/r6;La/u6;)V

    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v7, v9}, La/Pe;->b(I)I

    move-result v1

    if-eqz v1, :cond_a

    iget-object v2, v7, La/Pe;->b:Ljava/nio/ByteBuffer;

    iget v3, v7, La/Pe;->a:I

    add-int/2addr v1, v3

    invoke-virtual {v2, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    :cond_a
    const-string v1, "Unknown using type: "

    invoke-static {v1, v5}, La/z;->e(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    return-object v0

    :cond_c
    :try_start_5
    const-string v0, "DexKitBridge is not valid"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception v0

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    throw v0

    :pswitch_2
    iget v0, p0, La/mb;->e:I

    iget v1, p0, La/mb;->f:I

    iget-object v2, p0, La/mb;->d:La/X1;

    check-cast v2, La/lb;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v1}, La/X1;->a(II)J

    move-result-wide v0

    iget-object v2, p0, La/mb;->c:Lorg/luckypray/dexkit/DexKitBridge;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v2, Lorg/luckypray/dexkit/DexKitBridge;->b:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    :try_start_6
    iget-wide v4, v2, Lorg/luckypray/dexkit/DexKitBridge;->a:J

    const-wide/16 v6, 0x0

    cmp-long v2, v4, v6

    if-eqz v2, :cond_f

    invoke-static {v4, v5, v0, v1}, Lorg/luckypray/dexkit/DexKitBridge;->o(JJ)[Ljava/lang/String;

    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    if-eqz v0, :cond_d

    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, v0

    const/4 v3, 0x0

    :goto_6
    if-ge v3, v2, :cond_e

    aget-object v4, v0, v3

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    :cond_d
    const/4 v1, 0x0

    :cond_e
    return-object v1

    :cond_f
    :try_start_7
    const-string v0, "DexKitBridge is not valid"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :catchall_3
    move-exception v0

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    throw v0

    :pswitch_3
    iget v0, p0, La/mb;->e:I

    iget v1, p0, La/mb;->f:I

    iget-object v2, p0, La/mb;->d:La/X1;

    check-cast v2, La/lb;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v1}, La/X1;->a(II)J

    move-result-wide v0

    iget-object v2, p0, La/mb;->c:Lorg/luckypray/dexkit/DexKitBridge;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v2, Lorg/luckypray/dexkit/DexKitBridge;->b:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    :try_start_8
    iget-wide v4, v2, Lorg/luckypray/dexkit/DexKitBridge;->a:J

    const-wide/16 v6, 0x0

    cmp-long v6, v4, v6

    if-eqz v6, :cond_15

    invoke-static {v4, v5, v0, v1}, Lorg/luckypray/dexkit/DexKitBridge;->n(JJ)[B

    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    const-string v1, "wrap(res)"

    invoke-static {v0, v1}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, La/a;

    invoke-direct {v1}, La/Pe;-><init>()V

    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v3

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v4

    add-int/2addr v4, v3

    invoke-virtual {v1, v4, v0}, La/Pe;->c(ILjava/nio/ByteBuffer;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x4

    invoke-virtual {v1, v3}, La/Pe;->b(I)I

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_10

    invoke-virtual {v1, v4}, La/Pe;->f(I)I

    move-result v4

    goto :goto_7

    :cond_10
    move v4, v5

    :goto_7
    move v6, v5

    :goto_8
    if-ge v6, v4, :cond_14

    new-instance v7, La/a;

    invoke-direct {v7}, La/Pe;-><init>()V

    invoke-virtual {v1, v3}, La/Pe;->b(I)I

    move-result v8

    if-eqz v8, :cond_11

    invoke-virtual {v1, v8}, La/Pe;->e(I)I

    move-result v8

    mul-int/lit8 v9, v6, 0x4

    add-int/2addr v9, v8

    invoke-virtual {v1, v9}, La/Pe;->a(I)I

    move-result v8

    iget-object v9, v1, La/Pe;->b:Ljava/nio/ByteBuffer;

    const-string v10, "bb"

    invoke-static {v9, v10}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7, v8, v9}, La/Pe;->c(ILjava/nio/ByteBuffer;)V

    goto :goto_9

    :cond_11
    const/4 v7, 0x0

    :goto_9
    invoke-static {v7}, La/i9;->b(Ljava/lang/Object;)V

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v7, v3}, La/Pe;->b(I)I

    move-result v9

    if-eqz v9, :cond_12

    invoke-virtual {v7, v9}, La/Pe;->f(I)I

    move-result v9

    goto :goto_a

    :cond_12
    move v9, v5

    :goto_a
    move v10, v5

    :goto_b
    if-ge v10, v9, :cond_13

    invoke-virtual {v7, v10}, La/a;->g(I)La/c;

    move-result-object v11

    invoke-static {v11}, La/i9;->b(Ljava/lang/Object;)V

    invoke-static {v2, v11}, La/x0$a;->a(Lorg/luckypray/dexkit/DexKitBridge;La/c;)La/x0;

    move-result-object v11

    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x1

    goto :goto_b

    :cond_13
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_8

    :cond_14
    return-object v0

    :cond_15
    :try_start_9
    const-string v0, "DexKitBridge is not valid"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    :catchall_4
    move-exception v0

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    throw v0

    :pswitch_4
    iget v0, p0, La/mb;->e:I

    iget v1, p0, La/mb;->f:I

    iget-object v2, p0, La/mb;->d:La/X1;

    check-cast v2, La/lb;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v1}, La/X1;->a(II)J

    move-result-wide v0

    iget-object v2, p0, La/mb;->c:Lorg/luckypray/dexkit/DexKitBridge;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v2, Lorg/luckypray/dexkit/DexKitBridge;->b:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    :try_start_a
    iget-wide v4, v2, Lorg/luckypray/dexkit/DexKitBridge;->a:J

    const-wide/16 v6, 0x0

    cmp-long v2, v4, v6

    if-eqz v2, :cond_19

    invoke-static {v4, v5, v0, v1}, Lorg/luckypray/dexkit/DexKitBridge;->k(JJ)[I

    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    const-string v1, "<this>"

    invoke-static {v0, v1}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, v0

    if-eqz v1, :cond_17

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v1, v2, :cond_16

    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, v0

    :goto_c
    if-ge v3, v2, :cond_18

    aget v4, v0, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_c

    :cond_16
    aget v0, v0, v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, La/w1;->K(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    goto :goto_d

    :cond_17
    sget-object v1, La/Y5;->a:La/Y5;

    :cond_18
    :goto_d
    return-object v1

    :cond_19
    :try_start_b
    const-string v0, "DexKitBridge is not valid"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    :catchall_5
    move-exception v0

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    throw v0

    :pswitch_5
    iget v0, p0, La/mb;->e:I

    iget v1, p0, La/mb;->f:I

    iget-object v2, p0, La/mb;->d:La/X1;

    check-cast v2, La/lb;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v1}, La/X1;->a(II)J

    move-result-wide v0

    iget-object v2, p0, La/mb;->c:Lorg/luckypray/dexkit/DexKitBridge;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v2, Lorg/luckypray/dexkit/DexKitBridge;->b:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    :try_start_c
    iget-wide v4, v2, Lorg/luckypray/dexkit/DexKitBridge;->a:J

    const-wide/16 v6, 0x0

    cmp-long v6, v4, v6

    if-eqz v6, :cond_1b

    invoke-static {v4, v5, v0, v1}, Lorg/luckypray/dexkit/DexKitBridge;->h(JJ)[B

    move-result-object v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    const-string v1, "wrap(res)"

    invoke-static {v0, v1}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, La/a;

    invoke-direct {v1}, La/Pe;-><init>()V

    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v3

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v4

    add-int/2addr v4, v3

    invoke-virtual {v1, v4, v0}, La/Pe;->c(ILjava/nio/ByteBuffer;)V

    new-instance v0, La/ob;

    invoke-direct {v0}, La/ob;-><init>()V

    invoke-virtual {v1}, La/a;->j()I

    move-result v3

    const/4 v4, 0x0

    :goto_e
    if-ge v4, v3, :cond_1a

    invoke-virtual {v1, v4}, La/a;->k(I)La/p;

    move-result-object v5

    invoke-static {v5}, La/i9;->b(Ljava/lang/Object;)V

    invoke-static {v2, v5}, La/lb$a;->a(Lorg/luckypray/dexkit/DexKitBridge;La/p;)La/lb;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_e

    :cond_1a
    return-object v0

    :cond_1b
    :try_start_d
    const-string v0, "DexKitBridge is not valid"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    :catchall_6
    move-exception v0

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    throw v0

    :pswitch_6
    iget v0, p0, La/mb;->e:I

    iget v1, p0, La/mb;->f:I

    iget-object v2, p0, La/mb;->d:La/X1;

    check-cast v2, La/lb;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v1}, La/X1;->a(II)J

    move-result-wide v0

    iget-object v2, p0, La/mb;->c:Lorg/luckypray/dexkit/DexKitBridge;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v2, Lorg/luckypray/dexkit/DexKitBridge;->b:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    :try_start_e
    iget-wide v4, v2, Lorg/luckypray/dexkit/DexKitBridge;->a:J

    const-wide/16 v6, 0x0

    cmp-long v6, v4, v6

    if-eqz v6, :cond_1d

    invoke-static {v4, v5, v0, v1}, Lorg/luckypray/dexkit/DexKitBridge;->d(JJ)[B

    move-result-object v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    const-string v1, "wrap(res)"

    invoke-static {v0, v1}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, La/a;

    invoke-direct {v1}, La/Pe;-><init>()V

    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v3

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v4

    add-int/2addr v4, v3

    invoke-virtual {v1, v4, v0}, La/Pe;->c(ILjava/nio/ByteBuffer;)V

    new-instance v0, La/ob;

    invoke-direct {v0}, La/ob;-><init>()V

    invoke-virtual {v1}, La/a;->j()I

    move-result v3

    const/4 v4, 0x0

    :goto_f
    if-ge v4, v3, :cond_1c

    invoke-virtual {v1, v4}, La/a;->k(I)La/p;

    move-result-object v5

    invoke-static {v5}, La/i9;->b(Ljava/lang/Object;)V

    invoke-static {v2, v5}, La/lb$a;->a(Lorg/luckypray/dexkit/DexKitBridge;La/p;)La/lb;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_f

    :cond_1c
    return-object v0

    :cond_1d
    :try_start_f
    const-string v0, "DexKitBridge is not valid"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    :catchall_7
    move-exception v0

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    throw v0

    :pswitch_7
    iget v0, p0, La/mb;->e:I

    iget v1, p0, La/mb;->f:I

    iget-object v2, p0, La/mb;->d:La/X1;

    check-cast v2, La/lb;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v1}, La/X1;->a(II)J

    move-result-wide v0

    iget-object v2, p0, La/mb;->c:Lorg/luckypray/dexkit/DexKitBridge;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v2, Lorg/luckypray/dexkit/DexKitBridge;->b:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    :try_start_10
    iget-wide v4, v2, Lorg/luckypray/dexkit/DexKitBridge;->a:J

    const-wide/16 v6, 0x0

    cmp-long v6, v4, v6

    if-eqz v6, :cond_20

    invoke-static {v4, v5, v0, v1}, Lorg/luckypray/dexkit/DexKitBridge;->i(JJ)[B

    move-result-object v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    const-string v1, "wrap(res)"

    invoke-static {v0, v1}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, La/a;

    invoke-direct {v1}, La/Pe;-><init>()V

    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v3

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v4

    add-int/2addr v4, v3

    invoke-virtual {v1, v4, v0}, La/Pe;->c(ILjava/nio/ByteBuffer;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x4

    invoke-virtual {v1, v3}, La/Pe;->b(I)I

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1e

    invoke-virtual {v1, v3}, La/Pe;->f(I)I

    move-result v3

    goto :goto_10

    :cond_1e
    move v3, v4

    :goto_10
    if-ge v4, v3, :cond_1f

    invoke-virtual {v1, v4}, La/a;->g(I)La/c;

    move-result-object v5

    invoke-static {v5}, La/i9;->b(Ljava/lang/Object;)V

    invoke-static {v2, v5}, La/x0$a;->a(Lorg/luckypray/dexkit/DexKitBridge;La/c;)La/x0;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_10

    :cond_1f
    return-object v0

    :cond_20
    :try_start_11
    const-string v0, "DexKitBridge is not valid"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    :catchall_8
    move-exception v0

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
