.class public final Lvt1;
.super Lth1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lqf1;


# instance fields
.field public v:Lin0;

.field public w:J


# virtual methods
.method public final B0()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final c(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lvt1;->w:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1, p2}, Lh11;->a(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lvt1;->v:Lin0;

    .line 10
    .line 11
    new-instance v1, Lh11;

    .line 12
    .line 13
    invoke-direct {v1, p1, p2}, Lh11;-><init>(J)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v1}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    iput-wide p1, p0, Lvt1;->w:J

    .line 20
    .line 21
    :cond_0
    return-void
.end method
