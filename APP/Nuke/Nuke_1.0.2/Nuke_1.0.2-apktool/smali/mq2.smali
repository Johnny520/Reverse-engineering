.class public final Lmq2;
.super Lo3;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public a:J

.field public b:Lmp;


# virtual methods
.method public final a(Ln3;)Z
    .locals 4

    .line 1
    check-cast p1, Llq2;

    .line 2
    .line 3
    iget-wide v0, p0, Lmq2;->a:J

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    if-ltz v0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return p0

    .line 13
    :cond_0
    iget-wide v0, p1, Llq2;->p:J

    .line 14
    .line 15
    iget-wide v2, p1, Llq2;->q:J

    .line 16
    .line 17
    cmp-long v2, v0, v2

    .line 18
    .line 19
    if-gez v2, :cond_1

    .line 20
    .line 21
    iput-wide v0, p1, Llq2;->q:J

    .line 22
    .line 23
    :cond_1
    iput-wide v0, p0, Lmq2;->a:J

    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    return p0
.end method

.method public final b(Ln3;)[Lt00;
    .locals 4

    .line 1
    check-cast p1, Llq2;

    .line 2
    .line 3
    iget-wide v0, p0, Lmq2;->a:J

    .line 4
    .line 5
    const-wide/16 v2, -0x1

    .line 6
    .line 7
    iput-wide v2, p0, Lmq2;->a:J

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    iput-object v2, p0, Lmq2;->b:Lmp;

    .line 11
    .line 12
    invoke-virtual {p1, v0, v1}, Llq2;->u(J)[Lt00;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method
