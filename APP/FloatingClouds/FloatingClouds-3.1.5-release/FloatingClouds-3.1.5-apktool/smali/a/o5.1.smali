.class public final synthetic La/o5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/s7;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lorg/luckypray/dexkit/DexKitBridge;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/io/Serializable;


# direct methods
.method public synthetic constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, La/o5;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/o5;->b:Lorg/luckypray/dexkit/DexKitBridge;

    iput-object p2, p0, La/o5;->c:Ljava/lang/String;

    iput-object p3, p0, La/o5;->d:Ljava/io/Serializable;

    return-void
.end method

.method public synthetic constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;[Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, La/o5;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/o5;->b:Lorg/luckypray/dexkit/DexKitBridge;

    iput-object p2, p0, La/o5;->d:Ljava/io/Serializable;

    iput-object p3, p0, La/o5;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 8

    iget v0, p0, La/o5;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, La/y6;

    invoke-direct {v0}, La/y6;-><init>()V

    iget-object v1, p0, La/o5;->d:Ljava/io/Serializable;

    check-cast v1, [Ljava/lang/String;

    invoke-static {v1}, La/N1;->g0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    array-length v2, v1

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    const-string v2, "searchPackages"

    invoke-static {v1, v2}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, La/N1;->g0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, La/y6;->a:Ljava/util/List;

    new-instance v1, La/e3;

    invoke-direct {v1}, La/e3;-><init>()V

    iget-object v2, p0, La/o5;->c:Ljava/lang/String;

    invoke-static {v1, v2}, La/e3;->g(La/e3;Ljava/lang/String;)V

    iput-object v1, v0, La/y6;->b:La/e3;

    iget-object v1, p0, La/o5;->b:Lorg/luckypray/dexkit/DexKitBridge;

    invoke-virtual {v1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->p(La/y6;)La/d3;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, La/z6;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La/z6;-><init>(I)V

    new-instance v1, La/t6;

    invoke-direct {v1}, La/a2;-><init>()V

    iget-object v2, p0, La/o5;->c:Ljava/lang/String;

    const/4 v3, 0x0

    const/4 v4, 0x5

    if-eqz v2, :cond_0

    new-instance v5, La/e3;

    invoke-direct {v5}, La/e3;-><init>()V

    invoke-virtual {v5, v2, v4, v3}, La/e3;->h(Ljava/lang/String;IZ)V

    iput-object v5, v1, La/t6;->a:La/e3;

    :cond_0
    iget-object v2, p0, La/o5;->d:Ljava/io/Serializable;

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_1

    new-instance v5, La/e3;

    invoke-direct {v5}, La/e3;-><init>()V

    invoke-virtual {v5, v2, v4, v3}, La/e3;->h(Ljava/lang/String;IZ)V

    iput-object v5, v1, La/t6;->b:La/e3;

    :cond_1
    iput-object v1, v0, La/z6;->b:La/a2;

    iget-object v1, p0, La/o5;->b:Lorg/luckypray/dexkit/DexKitBridge;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, La/Z1;->g()[B

    move-result-object v0

    iget-object v2, v1, Lorg/luckypray/dexkit/DexKitBridge;->b:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    :try_start_0
    iget-wide v4, v1, Lorg/luckypray/dexkit/DexKitBridge;->a:J

    const-wide/16 v6, 0x0

    cmp-long v6, v4, v6

    if-eqz v6, :cond_5

    invoke-static {v4, v5, v0}, Lorg/luckypray/dexkit/DexKitBridge;->c(J[B)[B

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    const-string v2, "wrap(res)"

    invoke-static {v0, v2}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, La/a;

    invoke-direct {v2}, La/Pe;-><init>()V

    sget-object v4, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v4

    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v4

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v5

    add-int/2addr v5, v4

    invoke-virtual {v2, v5, v0}, La/Pe;->c(ILjava/nio/ByteBuffer;)V

    new-instance v0, La/s6;

    invoke-direct {v0}, La/s6;-><init>()V

    const/4 v4, 0x4

    invoke-virtual {v2, v4}, La/Pe;->b(I)I

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v2, v4}, La/Pe;->f(I)I

    move-result v4

    goto :goto_0

    :cond_2
    move v4, v3

    :goto_0
    if-ge v3, v4, :cond_3

    invoke-virtual {v2, v3}, La/a;->i(I)La/o;

    move-result-object v5

    invoke-static {v5}, La/i9;->b(Ljava/lang/Object;)V

    invoke-static {v1, v5}, La/r6$a;->a(Lorg/luckypray/dexkit/DexKitBridge;La/o;)La/r6;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_4

    new-instance v1, La/Z4;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, La/Z4;-><init>(I)V

    invoke-static {v0, v1}, La/s3;->j0(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_4
    return-object v0

    :cond_5
    :try_start_1
    const-string v0, "DexKitBridge is not valid"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
