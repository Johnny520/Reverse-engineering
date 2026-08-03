.class public final Lg/p;
.super Lg/r;
.source "SourceFile"


# virtual methods
.method public final a(Lg/k;)V
    .locals 0

    return-void
.end method

.method public final b()Lg/t;
    .locals 1

    sget-object v0, Lg/t;->d:Lg/t;

    return-object v0
.end method

.method public final c()I
    .locals 1

    const/16 v0, 0x70

    return v0
.end method

.method public final d(Lg/k;Ln/d;)V
    .locals 11

    invoke-virtual {p1}, Lg/k;->k()Lg/B;

    move-result-object v0

    invoke-virtual {v0}, Lg/E;->e()I

    move-result v0

    invoke-virtual {p1}, Lg/k;->i()Lg/B;

    move-result-object v1

    invoke-virtual {p1}, Lg/k;->j()Lg/B;

    move-result-object v2

    invoke-virtual {v1}, Lg/E;->e()I

    move-result v1

    invoke-virtual {v2}, Lg/E;->e()I

    move-result v3

    invoke-virtual {v2}, Lg/B;->l()I

    move-result v2

    add-int/2addr v2, v3

    sub-int/2addr v2, v1

    invoke-virtual {p1}, Lg/k;->f()Ld/a;

    move-result-object v3

    iget v3, v3, Ld/a;->a:I

    const/16 v4, 0x18

    const/16 v5, 0x1c

    if-lt v3, v5, :cond_0

    goto :goto_0

    :cond_0
    const/16 v6, 0x2710

    if-lt v3, v6, :cond_1

    const-string v3, "040"

    goto :goto_1

    :cond_1
    if-lt v3, v5, :cond_2

    :goto_0
    const-string v3, "039"

    goto :goto_1

    :cond_2
    const/16 v5, 0x1a

    if-lt v3, v5, :cond_3

    const-string v3, "038"

    goto :goto_1

    :cond_3
    if-lt v3, v4, :cond_4

    const-string v3, "037"

    goto :goto_1

    :cond_4
    const-string v3, "035"

    :goto_1
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "dex\n"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\u0000"

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Ln/d;->d()Z

    move-result v5

    const v6, 0x12345678

    const/16 v7, 0x70

    const/16 v8, 0x8

    const/4 v9, 0x4

    if-eqz v5, :cond_5

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v10, "magic: "

    invoke-direct {v5, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v10, Lk/t;

    invoke-direct {v10, v3}, Lk/t;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10}, Lk/t;->k()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2, v8, v5}, Ln/d;->b(ILjava/lang/String;)V

    const-string v5, "checksum"

    invoke-virtual {p2, v9, v5}, Ln/d;->b(ILjava/lang/String;)V

    const/16 v5, 0x14

    const-string v10, "signature"

    invoke-virtual {p2, v5, v10}, Ln/d;->b(ILjava/lang/String;)V

    invoke-virtual {p1}, Lg/k;->h()I

    move-result v5

    invoke-static {v5}, La/b;->s(I)Ljava/lang/String;

    move-result-object v5

    const-string v10, "file_size:       "

    invoke-virtual {v10, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2, v9, v5}, Ln/d;->b(ILjava/lang/String;)V

    invoke-static {v7}, La/b;->s(I)Ljava/lang/String;

    move-result-object v5

    const-string v10, "header_size:     "

    invoke-virtual {v10, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2, v9, v5}, Ln/d;->b(ILjava/lang/String;)V

    invoke-static {v6}, La/b;->s(I)Ljava/lang/String;

    move-result-object v5

    const-string v10, "endian_tag:      "

    invoke-virtual {v10, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2, v9, v5}, Ln/d;->b(ILjava/lang/String;)V

    const-string v5, "link_size:       0"

    invoke-virtual {p2, v9, v5}, Ln/d;->b(ILjava/lang/String;)V

    const-string v5, "link_off:        0"

    invoke-virtual {p2, v9, v5}, Ln/d;->b(ILjava/lang/String;)V

    invoke-static {v0}, La/b;->s(I)Ljava/lang/String;

    move-result-object v5

    const-string v10, "map_off:         "

    invoke-virtual {v10, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2, v9, v5}, Ln/d;->b(ILjava/lang/String;)V

    :cond_5
    const/4 v5, 0x0

    :goto_2
    if-ge v5, v8, :cond_6

    invoke-virtual {v3, v5}, Ljava/lang/String;->charAt(I)C

    move-result v10

    invoke-virtual {p2, v10}, Ln/d;->p(I)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_6
    invoke-virtual {p2, v4}, Ln/d;->u(I)V

    invoke-virtual {p1}, Lg/k;->h()I

    move-result v3

    invoke-virtual {p2, v3}, Ln/d;->q(I)V

    invoke-virtual {p2, v7}, Ln/d;->q(I)V

    invoke-virtual {p2, v6}, Ln/d;->q(I)V

    invoke-virtual {p2, v8}, Ln/d;->u(I)V

    invoke-virtual {p2, v0}, Ln/d;->q(I)V

    invoke-virtual {p1}, Lg/k;->p()Lg/x;

    move-result-object v0

    invoke-virtual {v0, p2}, Lg/x;->y(Ln/d;)V

    invoke-virtual {p1}, Lg/k;->q()Lg/x;

    move-result-object v0

    invoke-virtual {v0, p2}, Lg/x;->y(Ln/d;)V

    invoke-virtual {p1}, Lg/k;->n()Lg/x;

    move-result-object v0

    invoke-virtual {v0, p2}, Lg/x;->y(Ln/d;)V

    invoke-virtual {p1}, Lg/k;->g()Lg/o;

    move-result-object v0

    invoke-virtual {v0, p2}, Lg/o;->p(Ln/d;)V

    invoke-virtual {p1}, Lg/k;->m()Lg/z;

    move-result-object v0

    invoke-virtual {v0, p2}, Lg/z;->s(Ln/d;)V

    invoke-virtual {p1}, Lg/k;->e()Lg/b;

    move-result-object p1

    invoke-virtual {p1, p2}, Lg/b;->r(Ln/d;)V

    invoke-virtual {p2}, Ln/d;->d()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {v2}, La/b;->s(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "data_size:       "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v9, p1}, Ln/d;->b(ILjava/lang/String;)V

    invoke-static {v1}, La/b;->s(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "data_off:        "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v9, p1}, Ln/d;->b(ILjava/lang/String;)V

    :cond_7
    invoke-virtual {p2, v2}, Ln/d;->q(I)V

    invoke-virtual {p2, v1}, Ln/d;->q(I)V

    return-void
.end method
