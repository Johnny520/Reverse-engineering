.class public final LZ0/d;
.super LD/h;
.source "SourceFile"


# instance fields
.field public d:LZ0/a;


# virtual methods
.method public final Y(LS/b;)I
    .locals 3

    .line 1
    iget-object v0, p0, LZ0/d;->d:LZ0/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0, p1}, LZ0/a;->Z(LS/b;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    const/4 v2, 0x2

    .line 13
    invoke-virtual {p1, v2}, LS/b;->j(I)V

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-virtual {p1, v2, v0}, LS/b;->a(II)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v1, v1}, LS/b;->a(II)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, LS/b;->e()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p1, v0}, LS/b;->f(I)V

    .line 28
    .line 29
    .line 30
    return v0
.end method
