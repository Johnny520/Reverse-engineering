.class public final Lu4/l;
.super Lu4/d;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method public constructor <init>(Lu4/r;Lu4/t;Lu4/o;Lu4/p;Lv4/a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lu4/d;-><init>(Lu4/r;Lu4/t;Lu4/o;Lu4/p;Lv4/a;)V

    .line 2
    .line 3
    .line 4
    iget p1, p1, Lu4/r;->e:I

    .line 5
    .line 6
    const/4 p2, 0x1

    .line 7
    if-ne p1, p2, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-string p2, "opcode with invalid branchingness: "

    .line 11
    .line 12
    invoke-static {p1, p2}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    throw p1
.end method


# virtual methods
.method public final d(Lu4/h;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lu4/h;->m(Lu4/l;)V

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
