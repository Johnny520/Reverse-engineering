.class public final Lu4/u;
.super Lu4/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic k:I

.field public final l:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lu4/r;Lu4/t;Lu4/o;Lu4/p;Lz4/g;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lu4/u;->k:I

    .line 36
    invoke-direct {p0, p1, p2, p3, p4}, Lu4/i;-><init>(Lu4/r;Lu4/t;Lu4/o;Lu4/p;)V

    .line 37
    iget p1, p1, Lu4/r;->e:I

    const/4 p2, 0x5

    if-ne p1, p2, :cond_1

    if-eqz p5, :cond_0

    .line 38
    iput-object p5, p0, Lu4/u;->l:Ljava/lang/Object;

    return-void

    .line 39
    :cond_0
    const-string p1, "cases == null"

    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    .line 40
    :cond_1
    const-string p1, "bogus branchingness"

    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public constructor <init>(Lu4/r;Lu4/t;Lu4/p;Lw4/e;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lu4/u;->k:I

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, p1, p2, v0, p3}, Lu4/i;-><init>(Lu4/r;Lu4/t;Lu4/o;Lu4/p;)V

    .line 6
    .line 7
    .line 8
    iget p1, p1, Lu4/r;->e:I

    .line 9
    .line 10
    const/4 p2, 0x6

    .line 11
    if-ne p1, p2, :cond_1

    .line 12
    .line 13
    if-eqz p4, :cond_0

    .line 14
    .line 15
    iput-object p4, p0, Lu4/u;->l:Ljava/lang/Object;

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const-string p1, "catches == null"

    .line 19
    .line 20
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    throw p1

    .line 25
    :cond_1
    const-string p2, "opcode with invalid branchingness: "

    .line 26
    .line 27
    invoke-static {p1, p2}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    throw p1
.end method

.method public static j(Lw4/e;)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x64

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const-string v1, "catch"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-interface {p0}, Lw4/e;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    :goto_0
    if-ge v2, v1, :cond_0

    .line 19
    .line 20
    const-string v3, " "

    .line 21
    .line 22
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-interface {p0, v2}, Lw4/e;->getType(I)Lw4/c;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v3}, Lw4/c;->a()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    add-int/lit8 v2, v2, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method


# virtual methods
.method public final d(Lu4/h;)V
    .locals 1

    .line 1
    iget v0, p0, Lu4/u;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, p0}, Lu4/h;->l(Lu4/u;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-interface {p1, p0}, Lu4/h;->x(Lu4/u;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e()Lw4/e;
    .locals 1

    .line 1
    iget v0, p0, Lu4/u;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lu4/u;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lw4/e;

    .line 9
    .line 10
    return-object v0

    .line 11
    :pswitch_0
    sget-object v0, Lw4/b;->i:Lw4/b;

    .line 12
    .line 13
    return-object v0

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lu4/u;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lu4/u;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lw4/e;

    .line 9
    .line 10
    invoke-static {v0}, Lu4/u;->j(Lw4/e;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :pswitch_0
    iget-object v0, p0, Lu4/u;->l:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lz4/g;

    .line 18
    .line 19
    invoke-virtual {v0}, Lz4/g;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Lw4/c;)Lu4/i;
    .locals 4

    .line 1
    iget v0, p0, Lu4/u;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lu4/u;

    .line 7
    .line 8
    iget-object v1, p0, Lu4/u;->l:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lw4/e;

    .line 11
    .line 12
    invoke-interface {v1, p1}, Lw4/e;->d(Lw4/c;)Lw4/e;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object v1, p0, Lu4/i;->g:Lu4/r;

    .line 17
    .line 18
    iget-object v2, p0, Lu4/i;->h:Lu4/t;

    .line 19
    .line 20
    iget-object v3, p0, Lu4/i;->j:Lu4/p;

    .line 21
    .line 22
    invoke-direct {v0, v1, v2, v3, p1}, Lu4/u;-><init>(Lu4/r;Lu4/t;Lu4/p;Lw4/e;)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 27
    .line 28
    const-string v0, "unsupported"

    .line 29
    .line 30
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p1

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
