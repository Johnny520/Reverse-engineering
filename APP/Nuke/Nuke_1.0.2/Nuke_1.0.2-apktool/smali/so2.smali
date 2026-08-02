.class public interface abstract Lso2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# virtual methods
.method public a(Lin0;Lin0;)V
    .locals 1

    .line 1
    instance-of v0, p0, Lro2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lro2;

    .line 6
    .line 7
    iget-object p0, p0, Lro2;->a:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-interface {p1, p0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    instance-of p1, p0, Lqo2;

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    check-cast p0, Lqo2;

    .line 18
    .line 19
    iget-object p0, p0, Lqo2;->a:Ljo2;

    .line 20
    .line 21
    invoke-interface {p2, p0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    invoke-static {}, Lc80;->s()V

    .line 26
    .line 27
    .line 28
    return-void
.end method
