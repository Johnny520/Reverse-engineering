.class public final La/r6$b;
.super La/u9;
.source "SourceFile"

# interfaces
.implements La/s7;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/r6;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/u9;",
        "La/s7<",
        "Ljava/util/List<",
        "+",
        "La/x0;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:Lorg/luckypray/dexkit/DexKitBridge;

.field public final synthetic c:La/r6;

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;La/r6;II)V
    .locals 0

    iput-object p1, p0, La/r6$b;->b:Lorg/luckypray/dexkit/DexKitBridge;

    iput-object p2, p0, La/r6$b;->c:La/r6;

    iput p3, p0, La/r6$b;->d:I

    iput p4, p0, La/r6$b;->e:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, La/u9;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 8

    iget v0, p0, La/r6$b;->d:I

    iget v1, p0, La/r6$b;->e:I

    iget-object v2, p0, La/r6$b;->c:La/r6;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v1}, La/X1;->a(II)J

    move-result-wide v0

    iget-object v2, p0, La/r6$b;->b:Lorg/luckypray/dexkit/DexKitBridge;

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

    invoke-static {v4, v5, v0, v1}, Lorg/luckypray/dexkit/DexKitBridge;->f(JJ)[B

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
.end method
