.class public final Lpz0;
.super Lqe;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public P:Z


# virtual methods
.method public final z0(Lf01;)V
    .locals 3

    .line 1
    iget-boolean p0, p0, Lpz0;->P:Z

    .line 2
    .line 3
    sget-object v0, Ld01;->a:[Lu40;

    .line 4
    .line 5
    sget-object v0, Lb01;->G:Le01;

    .line 6
    .line 7
    sget-object v1, Ld01;->a:[Lu40;

    .line 8
    .line 9
    const/16 v2, 0x16

    .line 10
    .line 11
    aget-object v1, v1, v2

    .line 12
    .line 13
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {p1, v0, p0}, Lf01;->a(Le01;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
