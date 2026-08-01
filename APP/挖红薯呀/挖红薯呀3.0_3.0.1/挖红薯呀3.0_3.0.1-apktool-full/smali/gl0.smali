.class public final Lgl0;
.super Loe0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lg50;


# instance fields
.field public r:Lsw;

.field public s:J


# virtual methods
.method public final l(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lgl0;->s:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1, p2}, Ld30;->a(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lgl0;->r:Lsw;

    .line 10
    .line 11
    new-instance v1, Ld30;

    .line 12
    .line 13
    invoke-direct {v1, p1, p2}, Ld30;-><init>(J)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v1}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    iput-wide p1, p0, Lgl0;->s:J

    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final l0()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
