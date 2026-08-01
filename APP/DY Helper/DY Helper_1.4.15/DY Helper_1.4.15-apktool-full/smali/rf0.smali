.class public final Lrf0;
.super Lof0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public ι:J

.field public final synthetic κ:Luf0;


# direct methods
.method public constructor <init>(Luf0;Log0;J)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lrf0;->κ:Luf0;

    .line 5
    .line 6
    invoke-direct {p0, p1, p2}, Lof0;-><init>(Luf0;Log0;)V

    .line 7
    .line 8
    .line 9
    iput-wide p3, p0, Lrf0;->ι:J

    .line 10
    .line 11
    const-wide/16 p1, 0x0

    .line 12
    .line 13
    cmp-long p1, p3, p1

    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    sget-object p1, Lvc0;->ζ:Lvc0;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lof0;->δ(Lvc0;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lof0;->η:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-wide v0, p0, Lrf0;->ι:J

    .line 7
    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    cmp-long v0, v0, v2

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    sget-object v0, Lud2;->α:Ljava/util/TimeZone;

    .line 15
    .line 16
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const/16 v0, 0x64

    .line 22
    .line 23
    :try_start_0
    invoke-static {p0, v0}, Lud2;->ζ(Lrx1;I)Z

    .line 24
    .line 25
    .line 26
    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    goto :goto_0

    .line 28
    :catch_0
    const/4 v0, 0x0

    .line 29
    :goto_0
    if-nez v0, :cond_1

    .line 30
    .line 31
    iget-object v0, p0, Lrf0;->κ:Luf0;

    .line 32
    .line 33
    iget-object v0, v0, Luf0;->β:La00;

    .line 34
    .line 35
    invoke-interface {v0}, La00;->θ()V

    .line 36
    .line 37
    .line 38
    sget-object v0, Luf0;->ζ:Lvc0;

    .line 39
    .line 40
    invoke-virtual {p0, v0}, Lof0;->δ(Lvc0;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    const/4 v0, 0x1

    .line 44
    iput-boolean v0, p0, Lof0;->η:Z

    .line 45
    .line 46
    return-void
.end method

.method public final β(JLsc;)J
    .locals 7

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, Lof0;->η:Z

    .line 5
    .line 6
    if-nez p1, :cond_3

    .line 7
    .line 8
    iget-wide p1, p0, Lrf0;->ι:J

    .line 9
    .line 10
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    cmp-long v2, p1, v0

    .line 13
    .line 14
    const-wide/16 v3, -0x1

    .line 15
    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    return-wide v3

    .line 19
    :cond_0
    const-wide/16 v5, 0x2000

    .line 20
    .line 21
    invoke-static {p1, p2, v5, v6}, Ljava/lang/Math;->min(JJ)J

    .line 22
    .line 23
    .line 24
    move-result-wide p1

    .line 25
    invoke-super {p0, p1, p2, p3}, Lof0;->β(JLsc;)J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    cmp-long p3, p1, v3

    .line 30
    .line 31
    if-eqz p3, :cond_2

    .line 32
    .line 33
    iget-wide v2, p0, Lrf0;->ι:J

    .line 34
    .line 35
    sub-long/2addr v2, p1

    .line 36
    iput-wide v2, p0, Lrf0;->ι:J

    .line 37
    .line 38
    cmp-long p3, v2, v0

    .line 39
    .line 40
    if-nez p3, :cond_1

    .line 41
    .line 42
    sget-object p3, Lvc0;->ζ:Lvc0;

    .line 43
    .line 44
    invoke-virtual {p0, p3}, Lof0;->δ(Lvc0;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    return-wide p1

    .line 48
    :cond_2
    iget-object p1, p0, Lrf0;->κ:Luf0;

    .line 49
    .line 50
    iget-object p1, p1, Luf0;->β:La00;

    .line 51
    .line 52
    invoke-interface {p1}, La00;->θ()V

    .line 53
    .line 54
    .line 55
    new-instance p1, Ljava/net/ProtocolException;

    .line 56
    .line 57
    const-string p2, "unexpected end of stream"

    .line 58
    .line 59
    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    sget-object p2, Luf0;->ζ:Lvc0;

    .line 63
    .line 64
    invoke-virtual {p0, p2}, Lof0;->δ(Lvc0;)V

    .line 65
    .line 66
    .line 67
    throw p1

    .line 68
    :cond_3
    const-string p0, "closed"

    .line 69
    .line 70
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const-wide/16 p0, 0x0

    .line 74
    .line 75
    return-wide p0
.end method
