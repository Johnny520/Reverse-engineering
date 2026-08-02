.class public final Lsr0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lg22;


# instance fields
.field public final h:Lr5;

.field public final i:Lws1;

.field public j:J


# direct methods
.method public constructor <init>(Lr5;Lws1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsr0;->h:Lr5;

    .line 5
    .line 6
    iput-object p2, p0, Lsr0;->i:Lws1;

    .line 7
    .line 8
    const-wide/16 p1, 0x0

    .line 9
    .line 10
    iput-wide p1, p0, Lsr0;->j:J

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Ld11;JLd61;J)J
    .locals 6

    .line 1
    iget-object p2, p0, Lsr0;->i:Lws1;

    .line 2
    .line 3
    invoke-interface {p2}, Lws1;->a()J

    .line 4
    .line 5
    .line 6
    move-result-wide p2

    .line 7
    const-wide v0, 0x7fffffff7fffffffL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    and-long/2addr v0, p2

    .line 13
    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    cmp-long v0, v0, v2

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-wide p2, p0, Lsr0;->j:J

    .line 24
    .line 25
    :goto_0
    iput-wide p2, p0, Lsr0;->j:J

    .line 26
    .line 27
    iget-object v0, p0, Lsr0;->h:Lr5;

    .line 28
    .line 29
    const-wide/16 v3, 0x0

    .line 30
    .line 31
    move-object v5, p4

    .line 32
    move-wide v1, p5

    .line 33
    invoke-interface/range {v0 .. v5}, Lr5;->a(JJLd61;)J

    .line 34
    .line 35
    .line 36
    move-result-wide p4

    .line 37
    iget p0, p1, Ld11;->a:I

    .line 38
    .line 39
    iget p1, p1, Ld11;->b:I

    .line 40
    .line 41
    int-to-long v0, p0

    .line 42
    const/16 p0, 0x20

    .line 43
    .line 44
    shl-long/2addr v0, p0

    .line 45
    int-to-long p0, p1

    .line 46
    const-wide v2, 0xffffffffL

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    and-long/2addr p0, v2

    .line 52
    or-long/2addr p0, v0

    .line 53
    invoke-static {p2, p3}, Ltp0;->J(J)J

    .line 54
    .line 55
    .line 56
    move-result-wide p2

    .line 57
    invoke-static {p0, p1, p2, p3}, Lz01;->c(JJ)J

    .line 58
    .line 59
    .line 60
    move-result-wide p0

    .line 61
    invoke-static {p0, p1, p4, p5}, Lz01;->c(JJ)J

    .line 62
    .line 63
    .line 64
    move-result-wide p0

    .line 65
    return-wide p0
.end method
