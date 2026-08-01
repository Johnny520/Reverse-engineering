.class public Lnet/bytebuddy/pool/TypePool$CacheProvider$Simple$UsingSoftReference;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/pool/TypePool$CacheProvider;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/pool/TypePool$CacheProvider$Simple;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "UsingSoftReference"
.end annotation


# instance fields
.field private final delegate:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Ljava/lang/ref/SoftReference<",
            "Lnet/bytebuddy/pool/TypePool$CacheProvider$Simple;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    new-instance v1, Ljava/lang/ref/SoftReference;

    .line 7
    .line 8
    new-instance v2, Lnet/bytebuddy/pool/TypePool$CacheProvider$Simple;

    .line 9
    .line 10
    invoke-direct {v2}, Lnet/bytebuddy/pool/TypePool$CacheProvider$Simple;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, v2}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lnet/bytebuddy/pool/TypePool$CacheProvider$Simple$UsingSoftReference;->delegate:Ljava/util/concurrent/atomic/AtomicReference;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public clear()V
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$CacheProvider$Simple$UsingSoftReference;->delegate:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/ref/SoftReference;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Lnet/bytebuddy/pool/TypePool$CacheProvider;

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    invoke-interface {p0}, Lnet/bytebuddy/pool/TypePool$CacheProvider;->clear()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public find(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$CacheProvider$Simple$UsingSoftReference;->delegate:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/ref/SoftReference;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Lnet/bytebuddy/pool/TypePool$CacheProvider;

    .line 14
    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    sget-object p0, Lnet/bytebuddy/pool/TypePool$CacheProvider;->UNRESOLVED:Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    invoke-interface {p0, p1}, Lnet/bytebuddy/pool/TypePool$CacheProvider;->find(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public register(Ljava/lang/String;Lnet/bytebuddy/pool/TypePool$Resolution;)Lnet/bytebuddy/pool/TypePool$Resolution;
    .locals 5

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$CacheProvider$Simple$UsingSoftReference;->delegate:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/ref/SoftReference;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lnet/bytebuddy/pool/TypePool$CacheProvider$Simple;

    .line 14
    .line 15
    if-nez v1, :cond_3

    .line 16
    .line 17
    new-instance v2, Lnet/bytebuddy/pool/TypePool$CacheProvider$Simple;

    .line 18
    .line 19
    invoke-direct {v2}, Lnet/bytebuddy/pool/TypePool$CacheProvider$Simple;-><init>()V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object v3, p0, Lnet/bytebuddy/pool/TypePool$CacheProvider$Simple$UsingSoftReference;->delegate:Ljava/util/concurrent/atomic/AtomicReference;

    .line 23
    .line 24
    new-instance v4, Ljava/lang/ref/SoftReference;

    .line 25
    .line 26
    invoke-direct {v4, v2}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {v3, v0, v4}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    move-object v1, v2

    .line 36
    goto :goto_0

    .line 37
    :cond_2
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-eq v1, v0, :cond_1

    .line 42
    .line 43
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$CacheProvider$Simple$UsingSoftReference;->delegate:Ljava/util/concurrent/atomic/AtomicReference;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Ljava/lang/ref/SoftReference;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    check-cast v1, Lnet/bytebuddy/pool/TypePool$CacheProvider$Simple;

    .line 56
    .line 57
    if-eqz v1, :cond_0

    .line 58
    .line 59
    :cond_3
    :goto_0
    invoke-virtual {v1, p1, p2}, Lnet/bytebuddy/pool/TypePool$CacheProvider$Simple;->register(Ljava/lang/String;Lnet/bytebuddy/pool/TypePool$Resolution;)Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0
.end method
