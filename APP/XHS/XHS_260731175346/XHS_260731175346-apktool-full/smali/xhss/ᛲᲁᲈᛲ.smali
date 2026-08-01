.class public Lxhss/ᛲᲁᲈᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᲇᛴᲇᛵ:Lxhss/ᛳᲁᲁᛲ;


# instance fields
.field public ᛱᛱᛲᲇ:J

.field public ᛳᲁᲇᛸ:J

.field public ᛷᛵᛵᲈ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lxhss/ᛳᲁᲁᛲ;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lxhss/ᛲᲁᲈᛲ;->ᲇᛴᲇᛵ:Lxhss/ᛳᲁᲁᛲ;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public ᛱᛱᛲᲇ()Lxhss/ᛲᲁᲈᛲ;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lxhss/ᛲᲁᲈᛲ;->ᛳᲁᲇᛸ:J

    .line 4
    .line 5
    return-object p0
.end method

.method public ᛳᲁᲇᛸ()J
    .locals 2

    .line 1
    iget-boolean v0, p0, Lxhss/ᛲᲁᲈᛲ;->ᛷᛵᛵᲈ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-wide v0, p0, Lxhss/ᛲᲁᲈᛲ;->ᛱᛱᛲᲇ:J

    .line 6
    .line 7
    return-wide v0

    .line 8
    :cond_0
    const-string p0, "No deadline"

    .line 9
    .line 10
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-wide/16 v0, 0x0

    .line 14
    .line 15
    return-wide v0
.end method

.method public ᛷᛴᛷᛱ()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lxhss/ᛲᲁᲈᛲ;->ᛷᛵᛵᲈ:Z

    .line 2
    .line 3
    return p0
.end method

.method public ᛷᛵᛵᲈ()Lxhss/ᛲᲁᲈᛲ;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lxhss/ᛲᲁᲈᛲ;->ᛷᛵᛵᲈ:Z

    .line 3
    .line 4
    return-object p0
.end method

.method public ᲀᲇᛳᲁ(J)Lxhss/ᛲᲁᲈᛲ;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide p1

    .line 13
    iput-wide p1, p0, Lxhss/ᛲᲁᲈᛲ;->ᛳᲁᲇᛸ:J

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    const-string p0, "timeout < 0: "

    .line 17
    .line 18
    invoke-static {p0, p1, p2}, Lxhss/ᛵᲈᲁᲈ;->ᛷᲁᲁ(Ljava/lang/String;J)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return-object p0
.end method

.method public ᲇᛴᲇᛵ(J)Lxhss/ᛲᲁᲈᛲ;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lxhss/ᛲᲁᲈᛲ;->ᛷᛵᛵᲈ:Z

    .line 3
    .line 4
    iput-wide p1, p0, Lxhss/ᛲᲁᲈᛲ;->ᛱᛱᛲᲇ:J

    .line 5
    .line 6
    return-object p0
.end method

.method public ᲇᛶᛴᲀ()V
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    iget-boolean v0, p0, Lxhss/ᛲᲁᲈᛲ;->ᛷᛵᛵᲈ:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-wide v0, p0, Lxhss/ᛲᲁᲈᛲ;->ᛱᛱᛲᲇ:J

    .line 16
    .line 17
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    sub-long/2addr v0, v2

    .line 22
    const-wide/16 v2, 0x0

    .line 23
    .line 24
    cmp-long p0, v0, v2

    .line 25
    .line 26
    if-lez p0, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    new-instance p0, Ljava/io/InterruptedIOException;

    .line 30
    .line 31
    const-string v0, "deadline reached"

    .line 32
    .line 33
    invoke-direct {p0, v0}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p0

    .line 37
    :cond_1
    :goto_0
    return-void

    .line 38
    :cond_2
    new-instance p0, Ljava/io/InterruptedIOException;

    .line 39
    .line 40
    const-string v0, "interrupted"

    .line 41
    .line 42
    invoke-direct {p0, v0}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p0
.end method
