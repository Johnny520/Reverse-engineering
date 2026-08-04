.class public final Lyyds/ᛵᛳᛳᛷ;
.super Lyyds/ᛲᛶᲁᛴ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final synthetic ᲇᲇᲇᛱ:Ljava/util/concurrent/atomic/AtomicReferenceArray;


# direct methods
.method public constructor <init>(JLyyds/ᛵᛳᛳᛷ;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lyyds/ᛲᛶᲁᛴ;-><init>(JLyyds/ᛵᛳᛳᛷ;I)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 5
    .line 6
    sget p2, Lyyds/ᛴᛷᛴᲇ;->ᲇᲇᲇᛱ:I

    .line 7
    .line 8
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lyyds/ᛵᛳᛳᛷ;->ᲇᲇᲇᛱ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "SemaphoreSegment[id="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-wide v1, p0, Lyyds/ᛲᛶᲁᛴ;->ᲀᛲᛳᲀ:J

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", hashCode="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const/16 p0, 0x5d

    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public final ᛲᛴᛳᛲ()I
    .locals 0

    .line 1
    sget p0, Lyyds/ᛴᛷᛴᲇ;->ᲇᲇᲇᛱ:I

    .line 2
    .line 3
    return p0
.end method

.method public final ᲇᲇᲇᛱ(I)V
    .locals 2

    .line 1
    sget-object v0, Lyyds/ᛴᛷᛴᲇ;->ᛲᛴᛳᛲ:Lyyds/ᛲᛸᛴᛶ;

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛵᛳᛳᛷ;->ᲇᲇᲇᛱ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 4
    .line 5
    invoke-virtual {v1, p1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    sget-object p1, Lyyds/ᛲᛶᲁᛴ;->ᲇᲈᛵᛷ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 9
    .line 10
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    sget v0, Lyyds/ᛴᛷᛴᲇ;->ᲇᲇᲇᛱ:I

    .line 15
    .line 16
    if-ne p1, v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Lyyds/ᛶᛱᛳᲇ;->ᲀᛲᛳᲀ()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method
