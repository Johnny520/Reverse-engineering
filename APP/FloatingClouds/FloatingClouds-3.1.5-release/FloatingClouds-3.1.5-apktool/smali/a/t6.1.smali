.class public final La/t6;
.super La/a2;
.source "SourceFile"


# instance fields
.field public a:La/e3;

.field public b:La/e3;


# virtual methods
.method public final b(La/B6;)I
    .locals 4

    iget-object v0, p0, La/t6;->a:La/e3;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, La/e3;->b(La/B6;)I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-object v2, p0, La/t6;->b:La/e3;

    if-eqz v2, :cond_1

    invoke-virtual {v2, p1}, La/e3;->b(La/B6;)I

    move-result v2

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    const/16 v3, 0xa

    invoke-virtual {p1, v3}, La/B6;->i(I)V

    const/16 v3, 0x9

    invoke-virtual {p1, v3, v1}, La/B6;->a(II)V

    const/16 v3, 0x8

    invoke-virtual {p1, v3, v1}, La/B6;->a(II)V

    const/4 v3, 0x7

    invoke-virtual {p1, v3, v1}, La/B6;->a(II)V

    const/4 v3, 0x6

    invoke-virtual {p1, v3, v1}, La/B6;->a(II)V

    const/4 v3, 0x5

    invoke-virtual {p1, v3, v1}, La/B6;->a(II)V

    const/4 v3, 0x4

    invoke-virtual {p1, v3, v1}, La/B6;->a(II)V

    const/4 v3, 0x3

    invoke-virtual {p1, v3, v2}, La/B6;->a(II)V

    const/4 v2, 0x2

    invoke-virtual {p1, v2, v0}, La/B6;->a(II)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0, v1}, La/B6;->a(II)V

    invoke-virtual {p1, v1, v1}, La/B6;->a(II)V

    invoke-virtual {p1}, La/B6;->e()I

    move-result v0

    invoke-virtual {p1, v0}, La/B6;->f(I)V

    return v0
.end method
