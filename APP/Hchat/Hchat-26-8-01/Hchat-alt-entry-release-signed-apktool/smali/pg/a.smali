.class public abstract Lpg/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field public static final g:Ll3/w;

.field public static final h:J

.field public static final i:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ll3/w;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ll3/w;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lpg/a;->g:Ll3/w;

    .line 9
    .line 10
    const-wide v0, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Loh/h;->v(J)J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    sput-wide v0, Lpg/a;->h:J

    .line 20
    .line 21
    const-wide v0, -0x3fffffffffffffffL    # -2.0000000000000004

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1}, Loh/h;->v(J)J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    sput-wide v0, Lpg/a;->i:J

    .line 31
    .line 32
    return-void
.end method

.method public static final a(JJ)J
    .locals 6

    .line 1
    const v0, 0xf4240

    .line 2
    .line 3
    .line 4
    int-to-long v0, v0

    .line 5
    div-long v2, p2, v0

    .line 6
    .line 7
    invoke-static {p0, p1, v2, v3}, Loh/h;->e(JJ)J

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    const-wide v4, -0x431bde82d7aL

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    cmp-long v4, v4, p0

    .line 17
    .line 18
    if-gtz v4, :cond_0

    .line 19
    .line 20
    const-wide v4, 0x431bde82d7bL

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    cmp-long v4, p0, v4

    .line 26
    .line 27
    if-gez v4, :cond_0

    .line 28
    .line 29
    mul-long/2addr v2, v0

    .line 30
    sub-long/2addr p2, v2

    .line 31
    mul-long/2addr p0, v0

    .line 32
    add-long/2addr p0, p2

    .line 33
    const/4 p2, 0x1

    .line 34
    shl-long/2addr p0, p2

    .line 35
    sget p2, Lpg/b;->a:I

    .line 36
    .line 37
    return-wide p0

    .line 38
    :cond_0
    invoke-static {p0, p1}, Loh/h;->v(J)J

    .line 39
    .line 40
    .line 41
    move-result-wide p0

    .line 42
    return-wide p0
.end method
