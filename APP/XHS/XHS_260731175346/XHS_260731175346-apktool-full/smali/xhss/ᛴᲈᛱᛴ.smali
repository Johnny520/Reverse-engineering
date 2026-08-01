.class public final Lxhss/ᛴᲈᛱᛴ;
.super Lxhss/ᛵᛵᛲᲈ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛷᲁᲁ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public final ᛸᛶᲈᛶ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public final ᛸᛷᲈᲈ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public final ᲇᛸᛳᲁ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public final ᲈᛳᲀ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛴᲈᛱᛴ;->ᛸᛷᲈᲈ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 5
    .line 6
    iput-object p2, p0, Lxhss/ᛴᲈᛱᛴ;->ᲈᛳᲀ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 7
    .line 8
    iput-object p3, p0, Lxhss/ᛴᲈᛱᛴ;->ᛷᲁᲁ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 9
    .line 10
    iput-object p4, p0, Lxhss/ᛴᲈᛱᛴ;->ᛸᛶᲈᛶ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 11
    .line 12
    iput-object p5, p0, Lxhss/ᛴᲈᛱᛴ;->ᲇᛸᛳᲁ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final ᛳᲁᲇᛸ(Lxhss/ᲈᛲᛵᲁ;Lxhss/ᛸᛲᛷᛱ;)Z
    .locals 2

    .line 1
    :cond_0
    iget-object v0, p0, Lxhss/ᛴᲈᛱᛴ;->ᛸᛶᲈᛶ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    sget-object v1, Lxhss/ᛸᛲᛷᛱ;->ᛱᛱᛲᲇ:Lxhss/ᛸᛲᛷᛱ;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_1
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eq v0, p2, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public final ᛷᛴᛷᛱ(Lxhss/ᲈᛲᛵᲁ;Lxhss/ᲁᛲᛴᛴ;Lxhss/ᲁᛲᛴᛴ;)Z
    .locals 2

    .line 1
    :cond_0
    iget-object v0, p0, Lxhss/ᛴᲈᛱᛴ;->ᛷᲁᲁ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_1
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eq v0, p2, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public final ᛸᛲᛷᛱ(Lxhss/ᲁᛲᛴᛴ;Ljava/lang/Thread;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛴᲈᛱᛴ;->ᛸᛷᲈᲈ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final ᛸᛶᛴᲈ(Lxhss/ᲁᛲᛴᛴ;Lxhss/ᲁᛲᛴᛴ;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛴᲈᛱᛴ;->ᲈᛳᲀ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final ᲇᛴᲇᛵ(Lxhss/ᲈᛲᛵᲁ;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    .line 1
    :cond_0
    iget-object v0, p0, Lxhss/ᛴᲈᛱᛴ;->ᲇᛸᛳᲁ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_1
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eq v0, p2, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return p0
.end method
