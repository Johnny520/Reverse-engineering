.class public final LFt;
.super LTB;
.source ""


# instance fields
.field public l:LE9;


# virtual methods
.method public final N(LCh;)I
    .locals 3

    iget-object v0, p0, LFt;->l:LE9;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LE9;->N(LCh;)I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const/4 v2, 0x2

    invoke-virtual {p1, v2}, LCh;->i(I)V

    const/4 v2, 0x1

    invoke-virtual {p1, v2, v0}, LCh;->a(II)V

    invoke-virtual {p1, v1, v1}, LCh;->a(II)V

    invoke-virtual {p1}, LCh;->d()I

    move-result v0

    invoke-virtual {p1, v0}, LCh;->e(I)V

    return v0
.end method
