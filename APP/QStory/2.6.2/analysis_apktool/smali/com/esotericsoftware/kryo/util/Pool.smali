.class public abstract Lcom/esotericsoftware/kryo/util/Pool;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/esotericsoftware/kryo/util/Pool$SoftReferenceQueue;,
        Lcom/esotericsoftware/kryo/util/Pool$Poolable;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final freeObjects:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "TT;>;"
        }
    .end annotation
.end field

.field private peak:I


# direct methods
.method public constructor <init>(ZZ)V
    .locals 1

    const v0, 0x7fffffff

    .line 36
    invoke-direct {p0, p1, p2, v0}, Lcom/esotericsoftware/kryo/util/Pool;-><init>(ZZI)V

    return-void
.end method

.method public constructor <init>(ZZI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    new-instance p1, Lcom/esotericsoftware/kryo/util/Pool$1;

    .line 7
    .line 8
    invoke-direct {p1, p0, p3}, Lcom/esotericsoftware/kryo/util/Pool$1;-><init>(Lcom/esotericsoftware/kryo/util/Pool;I)V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    if-eqz p2, :cond_1

    .line 13
    .line 14
    new-instance p1, Lcom/esotericsoftware/kryo/util/Pool$2;

    .line 15
    .line 16
    invoke-direct {p1, p0, p3}, Lcom/esotericsoftware/kryo/util/Pool$2;-><init>(Lcom/esotericsoftware/kryo/util/Pool;I)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    new-instance p1, Lcom/esotericsoftware/kryo/util/Pool$3;

    .line 21
    .line 22
    invoke-direct {p1, p0, p3}, Lcom/esotericsoftware/kryo/util/Pool$3;-><init>(Lcom/esotericsoftware/kryo/util/Pool;I)V

    .line 23
    .line 24
    .line 25
    :goto_0
    if-eqz p2, :cond_2

    .line 26
    .line 27
    new-instance p2, Lcom/esotericsoftware/kryo/util/Pool$SoftReferenceQueue;

    .line 28
    .line 29
    invoke-direct {p2, p1}, Lcom/esotericsoftware/kryo/util/Pool$SoftReferenceQueue;-><init>(Ljava/util/Queue;)V

    .line 30
    .line 31
    .line 32
    move-object p1, p2

    .line 33
    :cond_2
    iput-object p1, p0, Lcom/esotericsoftware/kryo/util/Pool;->freeObjects:Ljava/util/Queue;

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public clean()V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/Pool;->freeObjects:Ljava/util/Queue;

    .line 2
    .line 3
    instance-of v0, p0, Lcom/esotericsoftware/kryo/util/Pool$SoftReferenceQueue;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Lcom/esotericsoftware/kryo/util/Pool$SoftReferenceQueue;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/util/Pool$SoftReferenceQueue;->clean()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public clear()V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/Pool;->freeObjects:Ljava/util/Queue;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Collection;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public abstract create()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public free(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/util/Pool;->reset(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/Pool;->freeObjects:Ljava/util/Queue;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/Pool;->freeObjects:Ljava/util/Queue;

    .line 15
    .line 16
    instance-of v1, v0, Lcom/esotericsoftware/kryo/util/Pool$SoftReferenceQueue;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    check-cast v0, Lcom/esotericsoftware/kryo/util/Pool$SoftReferenceQueue;

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/esotericsoftware/kryo/util/Pool$SoftReferenceQueue;->cleanOne()V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/Pool;->freeObjects:Ljava/util/Queue;

    .line 26
    .line 27
    invoke-interface {v0, p1}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    :cond_0
    iget p1, p0, Lcom/esotericsoftware/kryo/util/Pool;->peak:I

    .line 31
    .line 32
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/Pool;->freeObjects:Ljava/util/Queue;

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    iput p1, p0, Lcom/esotericsoftware/kryo/util/Pool;->peak:I

    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    const-string p0, "object cannot be null."

    .line 46
    .line 47
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public getFree()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/Pool;->freeObjects:Ljava/util/Queue;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getPeak()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/esotericsoftware/kryo/util/Pool;->peak:I

    .line 2
    .line 3
    return p0
.end method

.method public obtain()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/Pool;->freeObjects:Ljava/util/Queue;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/util/Pool;->create()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public reset(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    instance-of p0, p1, Lcom/esotericsoftware/kryo/util/Pool$Poolable;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lcom/esotericsoftware/kryo/util/Pool$Poolable;

    .line 6
    .line 7
    invoke-interface {p1}, Lcom/esotericsoftware/kryo/util/Pool$Poolable;->reset()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public resetPeak()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/esotericsoftware/kryo/util/Pool;->peak:I

    .line 3
    .line 4
    return-void
.end method
