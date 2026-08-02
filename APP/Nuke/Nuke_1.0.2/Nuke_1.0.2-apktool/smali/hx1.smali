.class public final Lhx1;
.super Lqp0;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public t:Lat;


# virtual methods
.method public final D(Lmj0;)I
    .locals 2

    .line 1
    iget-object p0, p0, Lhx1;->t:Lat;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lat;->D(Lmj0;)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move p0, v0

    .line 12
    :goto_0
    const/4 v1, 0x2

    .line 13
    invoke-virtual {p1, v1}, Lmj0;->m(I)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-virtual {p1, v1, p0}, Lmj0;->c(II)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0, v0}, Lmj0;->c(II)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lmj0;->g()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    invoke-virtual {p1, p0}, Lmj0;->i(I)V

    .line 28
    .line 29
    .line 30
    return p0
.end method
