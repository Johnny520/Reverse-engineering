.class public final Lio/sentry/util/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final c:Ljava/util/concurrent/atomic/AtomicLong;


# instance fields
.field public a:J

.field public final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    sput-object v0, Lio/sentry/util/g;->c:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    invoke-static {}, Lio/sentry/util/g;->a()J

    move-result-wide v0

    invoke-static {}, Lio/sentry/util/g;->a()J

    move-result-wide v2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v4, 0x1

    shl-long/2addr v2, v4

    const-wide/16 v4, 0x1

    or-long/2addr v2, v4

    iput-wide v2, p0, Lio/sentry/util/g;->b:J

    add-long/2addr v2, v0

    iput-wide v2, p0, Lio/sentry/util/g;->a:J

    return-void
.end method

.method public static a()J
    .locals 7

    :cond_0
    sget-object v0, Lio/sentry/util/g;->c:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v1

    const/16 v3, 0xc

    shr-long v3, v1, v3

    xor-long/2addr v3, v1

    const/16 v5, 0x19

    shl-long v5, v3, v5

    xor-long/2addr v3, v5

    const/16 v5, 0x1b

    shr-long v5, v3, v5

    xor-long/2addr v3, v5

    const-wide v5, 0x2545f4914f6cdd1dL

    mul-long/2addr v3, v5

    invoke-virtual {v0, v1, v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    return-wide v3
.end method


# virtual methods
.method public final b([B)V
    .locals 7

    const/4 v0, 0x0

    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_0

    iget-wide v1, p0, Lio/sentry/util/g;->a:J

    const-wide v3, 0x5851f42d4c957f2dL    # 2.8296655102636685E117

    mul-long/2addr v1, v3

    iget-wide v3, p0, Lio/sentry/util/g;->b:J

    add-long/2addr v1, v3

    iput-wide v1, p0, Lio/sentry/util/g;->a:J

    const/16 v3, 0x16

    ushr-long v3, v1, v3

    xor-long/2addr v3, v1

    const/16 v5, 0x3d

    ushr-long/2addr v1, v5

    const-wide/16 v5, 0x16

    add-long/2addr v1, v5

    long-to-int v1, v1

    ushr-long v1, v3, v1

    const/16 v3, 0x18

    ushr-long/2addr v1, v3

    long-to-int v1, v1

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final c()D
    .locals 14

    iget-wide v0, p0, Lio/sentry/util/g;->a:J

    const-wide v2, 0x5851f42d4c957f2dL    # 2.8296655102636685E117

    mul-long/2addr v0, v2

    iget-wide v4, p0, Lio/sentry/util/g;->b:J

    add-long/2addr v0, v4

    const/16 v6, 0x16

    ushr-long v7, v0, v6

    xor-long/2addr v7, v0

    const/16 v9, 0x3d

    ushr-long v10, v0, v9

    const-wide/16 v12, 0x16

    add-long/2addr v10, v12

    long-to-int v10, v10

    ushr-long/2addr v7, v10

    const-wide v10, 0xffffffffL

    and-long/2addr v7, v10

    mul-long/2addr v0, v2

    add-long/2addr v0, v4

    iput-wide v0, p0, Lio/sentry/util/g;->a:J

    const/4 v2, 0x6

    ushr-long v2, v7, v2

    const/16 v4, 0x1b

    shl-long/2addr v2, v4

    ushr-long v4, v0, v6

    xor-long/2addr v4, v0

    ushr-long/2addr v0, v9

    add-long/2addr v0, v12

    long-to-int v0, v0

    ushr-long v0, v4, v0

    and-long/2addr v0, v10

    const/4 v4, 0x5

    ushr-long/2addr v0, v4

    add-long/2addr v2, v0

    long-to-double v0, v2

    const-wide/high16 v2, 0x4340000000000000L    # 9.007199254740992E15

    div-double/2addr v0, v2

    return-wide v0
.end method
