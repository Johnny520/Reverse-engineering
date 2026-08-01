.class public abstract Lxhss/ᛱᛲᛳᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field public static final ᛱᛱᛲᲇ:Lxhss/ᛳᛴᲀᲁ;

.field public static final ᛳᲁᲇᛸ:J

.field public static final ᲇᛴᲇᛵ:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lxhss/ᛳᛴᲀᲁ;

    .line 2
    .line 3
    const/16 v1, 0x16

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lxhss/ᛳᛴᲀᲁ;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lxhss/ᛱᛲᛳᲀ;->ᛱᛱᛲᲇ:Lxhss/ᛳᛴᲀᲁ;

    .line 9
    .line 10
    const-wide v0, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lxhss/ᛷᛸᲀᲀ;->ᛸᛶᛴᲈ(J)J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    sput-wide v0, Lxhss/ᛱᛲᛳᲀ;->ᛳᲁᲇᛸ:J

    .line 20
    .line 21
    const-wide v0, -0x3fffffffffffffffL    # -2.0000000000000004

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1}, Lxhss/ᛷᛸᲀᲀ;->ᛸᛶᛴᲈ(J)J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    sput-wide v0, Lxhss/ᛱᛲᛳᲀ;->ᲇᛴᲇᛵ:J

    .line 31
    .line 32
    return-void
.end method

.method public static final ᛱᛱᛲᲇ(JLxhss/ᛶᛲᛲᲁ;)J
    .locals 3

    .line 1
    sget-wide v0, Lxhss/ᛱᛲᛳᲀ;->ᛳᲁᲇᛸ:J

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-wide p0, 0x7fffffffffffffffL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    return-wide p0

    .line 13
    :cond_0
    sget-wide v0, Lxhss/ᛱᛲᛳᲀ;->ᲇᛴᲇᛵ:J

    .line 14
    .line 15
    cmp-long v0, p0, v0

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    const-wide/high16 p0, -0x8000000000000000L

    .line 20
    .line 21
    return-wide p0

    .line 22
    :cond_1
    const/4 v0, 0x1

    .line 23
    shr-long v1, p0, v0

    .line 24
    .line 25
    long-to-int p0, p0

    .line 26
    and-int/2addr p0, v0

    .line 27
    if-nez p0, :cond_2

    .line 28
    .line 29
    sget-object p0, Lxhss/ᛶᛲᛲᲁ;->ᛳᲁᲇᛸ:Lxhss/ᛶᛲᛲᲁ;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    sget-object p0, Lxhss/ᛶᛲᛲᲁ;->ᲇᛴᲇᛵ:Lxhss/ᛶᛲᛲᲁ;

    .line 33
    .line 34
    :goto_0
    iget-object p1, p2, Lxhss/ᛶᛲᛲᲁ;->ᛱᛱᛲᲇ:Ljava/util/concurrent/TimeUnit;

    .line 35
    .line 36
    iget-object p0, p0, Lxhss/ᛶᛲᛲᲁ;->ᛱᛱᛲᲇ:Ljava/util/concurrent/TimeUnit;

    .line 37
    .line 38
    invoke-virtual {p1, v1, v2, p0}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    .line 39
    .line 40
    .line 41
    move-result-wide p0

    .line 42
    return-wide p0
.end method

.method public static final ᛷᛵᛵᲈ(JJ)J
    .locals 6

    .line 1
    const-wide/32 v0, 0xf4240

    .line 2
    .line 3
    .line 4
    div-long v2, p2, v0

    .line 5
    .line 6
    invoke-static {p0, p1, v2, v3}, Lxhss/ᛷᛸᲀᲀ;->ᛱᛱᛲᲇ(JJ)J

    .line 7
    .line 8
    .line 9
    move-result-wide p0

    .line 10
    const-wide v4, -0x431bde82d7aL

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    cmp-long v4, v4, p0

    .line 16
    .line 17
    if-gtz v4, :cond_0

    .line 18
    .line 19
    const-wide v4, 0x431bde82d7bL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    cmp-long v4, p0, v4

    .line 25
    .line 26
    if-gez v4, :cond_0

    .line 27
    .line 28
    mul-long/2addr v2, v0

    .line 29
    sub-long/2addr p2, v2

    .line 30
    mul-long/2addr p0, v0

    .line 31
    add-long/2addr p0, p2

    .line 32
    const/4 p2, 0x1

    .line 33
    shl-long/2addr p0, p2

    .line 34
    sget p2, Lxhss/ᛴᛳᛲᛲ;->ᛷᛵᛵᲈ:I

    .line 35
    .line 36
    return-wide p0

    .line 37
    :cond_0
    invoke-static {p0, p1}, Lxhss/ᛷᛸᲀᲀ;->ᛸᛶᛴᲈ(J)J

    .line 38
    .line 39
    .line 40
    move-result-wide p0

    .line 41
    return-wide p0
.end method
