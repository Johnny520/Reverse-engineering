.class public final Lio/sentry/android/core/internal/util/f;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:J

.field public final b:Lio/sentry/android/core/internal/util/c;

.field public final c:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final d:I

.field public final e:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method public constructor <init>(IJ)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lio/sentry/android/core/internal/util/f;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Lio/sentry/android/core/internal/util/f;->e:Ljava/util/concurrent/atomic/AtomicLong;

    sget-object v0, Lio/sentry/android/core/internal/util/c;->a:Lio/sentry/android/core/internal/util/c;

    iput-object v0, p0, Lio/sentry/android/core/internal/util/f;->b:Lio/sentry/android/core/internal/util/c;

    iput-wide p2, p0, Lio/sentry/android/core/internal/util/f;->a:J

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    :cond_0
    iput p1, p0, Lio/sentry/android/core/internal/util/f;->d:I

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 10

    iget-object v0, p0, Lio/sentry/android/core/internal/util/f;->b:Lio/sentry/android/core/internal/util/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lio/sentry/android/core/internal/util/f;->e:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    iget-object v4, p0, Lio/sentry/android/core/internal/util/f;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v5, 0x0

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v6

    iget-wide v8, p0, Lio/sentry/android/core/internal/util/f;->a:J

    add-long/2addr v6, v8

    cmp-long v3, v6, v0

    if-gtz v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    iget v1, p0, Lio/sentry/android/core/internal/util/f;->d:I

    if-ge v0, v1, :cond_1

    return v5

    :cond_1
    invoke-virtual {v4, v5}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    const/4 v0, 0x1

    return v0

    :cond_2
    :goto_0
    invoke-virtual {v4, v5}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    return v5
.end method
