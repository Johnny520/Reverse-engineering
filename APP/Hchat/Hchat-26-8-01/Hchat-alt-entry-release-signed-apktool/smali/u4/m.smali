.class public final Lu4/m;
.super Lu4/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method public constructor <init>(Lu4/r;Lu4/t;Lu4/o;Lu4/o;)V
    .locals 0

    .line 37
    invoke-static {p4}, Lu4/p;->p(Lu4/o;)Lu4/p;

    move-result-object p4

    invoke-direct {p0, p1, p2, p3, p4}, Lu4/m;-><init>(Lu4/r;Lu4/t;Lu4/o;Lu4/p;)V

    return-void
.end method

.method public constructor <init>(Lu4/r;Lu4/t;Lu4/o;Lu4/p;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lu4/i;-><init>(Lu4/r;Lu4/t;Lu4/o;Lu4/p;)V

    .line 2
    .line 3
    .line 4
    iget p1, p1, Lu4/r;->e:I

    .line 5
    .line 6
    const/4 p2, 0x5

    .line 7
    if-eq p1, p2, :cond_2

    .line 8
    .line 9
    const/4 p2, 0x6

    .line 10
    if-eq p1, p2, :cond_2

    .line 11
    .line 12
    if-eqz p3, :cond_1

    .line 13
    .line 14
    const/4 p2, 0x1

    .line 15
    if-ne p1, p2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string p1, "can\'t mix branchingness with result"

    .line 19
    .line 20
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    throw p1

    .line 25
    :cond_1
    :goto_0
    return-void

    .line 26
    :cond_2
    const-string p2, "opcode with invalid branchingness: "

    .line 27
    .line 28
    invoke-static {p1, p2}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    throw p1
.end method


# virtual methods
.method public final d(Lu4/h;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lu4/h;->o(Lu4/m;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final e()Lw4/e;
    .locals 1

    .line 1
    sget-object v0, Lw4/b;->i:Lw4/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i(Lw4/c;)Lu4/i;
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "unsupported"

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method
