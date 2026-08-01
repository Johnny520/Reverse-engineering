.class public final Lia;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final a:J

.field public final b:Ljava/lang/ref/WeakReference;

.field public final c:Ljava/lang/String;

.field public final d:I

.field public final e:I

.field public final f:J

.field public g:Z

.field public h:J


# direct methods
.method public constructor <init>(JLandroid/widget/EditText;Ljava/lang/String;IIJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lia;->a:J

    .line 5
    .line 6
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    invoke-direct {p1, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lia;->b:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    if-nez p4, :cond_0

    .line 14
    .line 15
    const-string p4, ""

    .line 16
    .line 17
    :cond_0
    iput-object p4, p0, Lia;->c:Ljava/lang/String;

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    invoke-static {p1, p5}, Ljava/lang/Math;->max(II)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iput p1, p0, Lia;->d:I

    .line 25
    .line 26
    iput p6, p0, Lia;->e:I

    .line 27
    .line 28
    const-wide/16 p1, 0x1

    .line 29
    .line 30
    const-wide/16 p3, 0x708

    .line 31
    .line 32
    invoke-static {p1, p2, p3, p4}, Ljava/lang/Math;->max(JJ)J

    .line 33
    .line 34
    .line 35
    move-result-wide p1

    .line 36
    add-long/2addr p1, p7

    .line 37
    iput-wide p1, p0, Lia;->f:J

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final declared-synchronized a(J)V
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lia;->g:Z

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-wide v0, p0, Lia;->f:J

    .line 7
    .line 8
    cmp-long v2, p1, v0

    .line 9
    .line 10
    if-lez v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-wide/16 v2, 0x1

    .line 14
    .line 15
    const-wide/16 v4, 0x4b0

    .line 16
    .line 17
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    add-long/2addr p1, v2

    .line 22
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->min(JJ)J

    .line 23
    .line 24
    .line 25
    move-result-wide p1

    .line 26
    iput-wide p1, p0, Lia;->h:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    monitor-exit p0

    .line 29
    return-void

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    monitor-exit p0

    .line 33
    return-void

    .line 34
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    throw p1
.end method
