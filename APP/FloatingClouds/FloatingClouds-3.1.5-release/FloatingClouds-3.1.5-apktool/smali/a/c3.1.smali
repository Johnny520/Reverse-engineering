.class public final La/c3;
.super La/u9;
.source "SourceFile"

# interfaces
.implements La/s7;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lorg/luckypray/dexkit/DexKitBridge;

.field public final synthetic d:La/b3;

.field public final synthetic e:I


# direct methods
.method public constructor <init>(La/b3;Lorg/luckypray/dexkit/DexKitBridge;I)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, La/c3;->b:I

    .line 1
    iput-object p1, p0, La/c3;->d:La/b3;

    iput-object p2, p0, La/c3;->c:Lorg/luckypray/dexkit/DexKitBridge;

    iput p3, p0, La/c3;->e:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, La/u9;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;La/b3;II)V
    .locals 0

    .line 2
    iput p4, p0, La/c3;->b:I

    iput-object p1, p0, La/c3;->c:Lorg/luckypray/dexkit/DexKitBridge;

    iput-object p2, p0, La/c3;->d:La/b3;

    iput p3, p0, La/c3;->e:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, La/u9;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 11

    const-string v0, "DexKitBridge is not valid"

    const-string v1, "wrap(res)"

    const-wide/16 v2, 0x0

    const/16 v4, 0xa

    const/4 v5, 0x0

    const/4 v6, 0x1

    iget v7, p0, La/c3;->b:I

    packed-switch v7, :pswitch_data_0

    iget-object v0, p0, La/c3;->d:La/b3;

    iget-object v0, v0, La/b3;->d:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget v2, p0, La/c3;->e:I

    invoke-static {v2, v0}, La/X1;->a(II)J

    move-result-wide v2

    new-array v0, v6, [J

    aput-wide v2, v0, v5

    iget-object v2, p0, La/c3;->c:Lorg/luckypray/dexkit/DexKitBridge;

    invoke-virtual {v2, v0}, Lorg/luckypray/dexkit/DexKitBridge;->r([J)La/d3;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, La/Y1;->a()Ljava/lang/Object;

    move-result-object v1

    :goto_0
    check-cast v1, La/b3;

    :cond_1
    return-object v1

    :pswitch_0
    iget-object v7, p0, La/c3;->d:La/b3;

    iget-object v7, v7, La/b3;->f:Ljava/util/ArrayList;

    new-instance v8, Ljava/util/ArrayList;

    invoke-static {v7, v4}, La/p3;->g0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v8, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    iget v9, p0, La/c3;->e:I

    invoke-static {v9, v7}, La/X1;->a(II)J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-static {v8}, La/t3;->x0(Ljava/util/ArrayList;)[J

    move-result-object v4

    iget-object v7, p0, La/c3;->c:Lorg/luckypray/dexkit/DexKitBridge;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v8, v7, Lorg/luckypray/dexkit/DexKitBridge;->b:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v8}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v8

    invoke-virtual {v8}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    :try_start_0
    iget-wide v9, v7, Lorg/luckypray/dexkit/DexKitBridge;->a:J

    cmp-long v2, v9, v2

    if-eqz v2, :cond_4

    invoke-static {v9, v10, v4}, Lorg/luckypray/dexkit/DexKitBridge;->j(J[J)[B

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v8}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0, v1}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, La/a;

    invoke-direct {v1}, La/Pe;-><init>()V

    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v3

    add-int/2addr v3, v2

    invoke-virtual {v1, v3, v0}, La/Pe;->c(ILjava/nio/ByteBuffer;)V

    new-instance v0, La/ob;

    invoke-direct {v0}, La/ob;-><init>()V

    invoke-virtual {v1}, La/a;->j()I

    move-result v2

    :goto_2
    if-ge v5, v2, :cond_3

    invoke-virtual {v1, v5}, La/a;->k(I)La/p;

    move-result-object v3

    invoke-static {v3}, La/i9;->b(Ljava/lang/Object;)V

    invoke-static {v7, v3}, La/lb$a;->a(Lorg/luckypray/dexkit/DexKitBridge;La/p;)La/lb;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/2addr v5, v6

    goto :goto_2

    :cond_3
    return-object v0

    :cond_4
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    invoke-virtual {v8}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    throw v0

    :pswitch_1
    iget-object v0, p0, La/c3;->d:La/b3;

    iget-object v0, v0, La/b3;->e:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0, v4}, La/p3;->g0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    iget v3, p0, La/c3;->e:I

    invoke-static {v3, v2}, La/X1;->a(II)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    invoke-static {v1}, La/t3;->x0(Ljava/util/ArrayList;)[J

    move-result-object v0

    iget-object v1, p0, La/c3;->c:Lorg/luckypray/dexkit/DexKitBridge;

    invoke-virtual {v1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->r([J)La/d3;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v7, p0, La/c3;->d:La/b3;

    iget-object v7, v7, La/b3;->g:Ljava/util/ArrayList;

    new-instance v8, Ljava/util/ArrayList;

    invoke-static {v7, v4}, La/p3;->g0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v8, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    iget v9, p0, La/c3;->e:I

    invoke-static {v9, v7}, La/X1;->a(II)J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_6
    invoke-static {v8}, La/t3;->x0(Ljava/util/ArrayList;)[J

    move-result-object v4

    iget-object v7, p0, La/c3;->c:Lorg/luckypray/dexkit/DexKitBridge;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v8, v7, Lorg/luckypray/dexkit/DexKitBridge;->b:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v8}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v8

    invoke-virtual {v8}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    :try_start_2
    iget-wide v9, v7, Lorg/luckypray/dexkit/DexKitBridge;->a:J

    cmp-long v2, v9, v2

    if-eqz v2, :cond_9

    invoke-static {v9, v10, v4}, Lorg/luckypray/dexkit/DexKitBridge;->g(J[J)[B

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-virtual {v8}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0, v1}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, La/a;

    invoke-direct {v1}, La/Pe;-><init>()V

    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v3

    add-int/2addr v3, v2

    invoke-virtual {v1, v3, v0}, La/Pe;->c(ILjava/nio/ByteBuffer;)V

    new-instance v0, La/s6;

    invoke-direct {v0}, La/s6;-><init>()V

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, La/Pe;->b(I)I

    move-result v2

    if-eqz v2, :cond_7

    invoke-virtual {v1, v2}, La/Pe;->f(I)I

    move-result v2

    goto :goto_5

    :cond_7
    move v2, v5

    :goto_5
    if-ge v5, v2, :cond_8

    invoke-virtual {v1, v5}, La/a;->i(I)La/o;

    move-result-object v3

    invoke-static {v3}, La/i9;->b(Ljava/lang/Object;)V

    invoke-static {v7, v3}, La/r6$a;->a(Lorg/luckypray/dexkit/DexKitBridge;La/o;)La/r6;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/2addr v5, v6

    goto :goto_5

    :cond_8
    return-object v0

    :cond_9
    :try_start_3
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    invoke-virtual {v8}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
