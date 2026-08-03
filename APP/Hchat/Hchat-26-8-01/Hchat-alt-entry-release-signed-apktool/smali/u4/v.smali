.class public final Lu4/v;
.super Lu4/d;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final l:Lw4/e;


# direct methods
.method public constructor <init>(Lu4/r;Lu4/t;Lu4/p;Lw4/e;Lv4/a;)V
    .locals 6

    .line 1
    const/4 v3, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move-object v1, p1

    .line 4
    move-object v2, p2

    .line 5
    move-object v4, p3

    .line 6
    move-object v5, p5

    .line 7
    invoke-direct/range {v0 .. v5}, Lu4/d;-><init>(Lu4/r;Lu4/t;Lu4/o;Lu4/p;Lv4/a;)V

    .line 8
    .line 9
    .line 10
    iget p1, v1, Lu4/r;->e:I

    .line 11
    .line 12
    const/4 p2, 0x6

    .line 13
    if-ne p1, p2, :cond_1

    .line 14
    .line 15
    if-eqz p4, :cond_0

    .line 16
    .line 17
    iput-object p4, v0, Lu4/v;->l:Lw4/e;

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const-string p1, "catches == null"

    .line 21
    .line 22
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    throw p1

    .line 27
    :cond_1
    const-string p2, "opcode with invalid branchingness: "

    .line 28
    .line 29
    invoke-static {p1, p2}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    throw p1
.end method


# virtual methods
.method public final d(Lu4/h;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lu4/h;->e(Lu4/v;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final e()Lw4/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lu4/v;->l:Lw4/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lu4/d;->k:Lv4/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lz4/k;->a()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    instance-of v2, v0, Lv4/c0;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    check-cast v0, Lv4/c0;

    .line 12
    .line 13
    invoke-virtual {v0}, Lv4/c0;->l()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    :cond_0
    const-string v0, " "

    .line 18
    .line 19
    invoke-static {v1, v0}, Lbc/e;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v1, p0, Lu4/v;->l:Lw4/e;

    .line 24
    .line 25
    invoke-static {v1}, Lu4/u;->j(Lw4/e;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0
.end method

.method public final i(Lw4/c;)Lu4/i;
    .locals 6

    .line 1
    new-instance v0, Lu4/v;

    .line 2
    .line 3
    iget-object v1, p0, Lu4/v;->l:Lw4/e;

    .line 4
    .line 5
    invoke-interface {v1, p1}, Lw4/e;->d(Lw4/c;)Lw4/e;

    .line 6
    .line 7
    .line 8
    move-result-object v4

    .line 9
    iget-object v5, p0, Lu4/d;->k:Lv4/a;

    .line 10
    .line 11
    iget-object v1, p0, Lu4/i;->g:Lu4/r;

    .line 12
    .line 13
    iget-object v2, p0, Lu4/i;->h:Lu4/t;

    .line 14
    .line 15
    iget-object v3, p0, Lu4/i;->j:Lu4/p;

    .line 16
    .line 17
    invoke-direct/range {v0 .. v5}, Lu4/v;-><init>(Lu4/r;Lu4/t;Lu4/p;Lw4/e;Lv4/a;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method
