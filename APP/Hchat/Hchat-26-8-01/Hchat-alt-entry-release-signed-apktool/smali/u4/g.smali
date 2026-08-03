.class public final Lu4/g;
.super Lu4/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final k:Ljava/util/ArrayList;

.field public final l:Lv4/a;


# direct methods
.method public constructor <init>(Lu4/r;Lu4/t;Lu4/p;Ljava/util/ArrayList;Lv4/a;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0, p3}, Lu4/i;-><init>(Lu4/r;Lu4/t;Lu4/o;Lu4/p;)V

    .line 3
    .line 4
    .line 5
    iget p1, p1, Lu4/r;->e:I

    .line 6
    .line 7
    const/4 p2, 0x1

    .line 8
    if-ne p1, p2, :cond_0

    .line 9
    .line 10
    iput-object p4, p0, Lu4/g;->k:Ljava/util/ArrayList;

    .line 11
    .line 12
    iput-object p5, p0, Lu4/g;->l:Lv4/a;

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const-string p2, "opcode with invalid branchingness: "

    .line 16
    .line 17
    invoke-static {p1, p2}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    throw p1
.end method


# virtual methods
.method public final d(Lu4/h;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lu4/h;->u(Lu4/g;)V

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
