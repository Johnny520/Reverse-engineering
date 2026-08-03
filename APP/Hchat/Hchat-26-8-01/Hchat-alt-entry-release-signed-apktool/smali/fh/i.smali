.class public final Lfh/i;
.super Lx6/d;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public g:Lfh/a;


# virtual methods
.method public final G(Lg6/b;)I
    .locals 3

    .line 1
    iget-object v0, p0, Lfh/i;->g:Lfh/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lfh/a;->G(Lg6/b;)I

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
    const/4 v2, 0x7

    .line 13
    invoke-virtual {p1, v2}, Lg6/b;->n(I)V

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x6

    .line 17
    invoke-virtual {p1, v2, v1}, Lg6/b;->c(II)V

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x5

    .line 21
    invoke-virtual {p1, v2, v1}, Lg6/b;->c(II)V

    .line 22
    .line 23
    .line 24
    const/4 v2, 0x4

    .line 25
    invoke-virtual {p1, v2, v1}, Lg6/b;->c(II)V

    .line 26
    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    invoke-virtual {p1, v2, v0}, Lg6/b;->c(II)V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x2

    .line 33
    invoke-virtual {p1, v0, v1}, Lg6/b;->c(II)V

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    invoke-virtual {p1, v0, v1}, Lg6/b;->c(II)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v1, v1}, Lg6/b;->c(II)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Lg6/b;->g()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-virtual {p1, v0}, Lg6/b;->i(I)V

    .line 48
    .line 49
    .line 50
    return v0
.end method
