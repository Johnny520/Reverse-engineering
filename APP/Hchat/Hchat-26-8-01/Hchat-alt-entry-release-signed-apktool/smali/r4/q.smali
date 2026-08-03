.class public final Lr4/q;
.super Lr4/l0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final k:Lv4/d;

.field public l:[B


# direct methods
.method public constructor <init>(Lv4/d;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, -0x1

    .line 3
    invoke-direct {p0, v0, v1}, Lr4/l0;-><init>(II)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lr4/q;->k:Lv4/d;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Lr4/q;->l:[B

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Lr4/p;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr4/q;->k:Lv4/d;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lp4/t;->j(Lr4/p;Lv4/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final b()Lr4/b0;
    .locals 1

    .line 1
    sget-object v0, Lr4/b0;->B:Lr4/b0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e(Lr4/l0;)I
    .locals 1

    .line 1
    check-cast p1, Lr4/q;

    .line 2
    .line 3
    iget-object v0, p0, Lr4/q;->k:Lv4/d;

    .line 4
    .line 5
    iget-object p1, p1, Lr4/q;->k:Lv4/d;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lv4/a;->d(Lv4/a;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lr4/q;->k:Lv4/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv4/d;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final j(Lr4/k0;I)V
    .locals 2

    .line 1
    new-instance p2, Lz4/d;

    .line 2
    .line 3
    invoke-direct {p2}, Lz4/d;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lp4/t;

    .line 7
    .line 8
    iget-object p1, p1, Lr4/o0;->b:Lr4/p;

    .line 9
    .line 10
    invoke-direct {v0, p1, p2}, Lp4/t;-><init>(Lr4/p;Lz4/d;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lr4/q;->k:Lv4/d;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {v0, p1, v1}, Lp4/t;->J(Lv4/d;Z)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, Lz4/d;->h()[B

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lr4/q;->l:[B

    .line 24
    .line 25
    array-length p1, p1

    .line 26
    invoke-virtual {p0, p1}, Lr4/l0;->k(I)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lr4/q;->k:Lv4/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv4/d;->a()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final m(Lr4/p;Lz4/d;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lz4/d;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lr4/l0;->g()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, " encoded array"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-virtual {p2, v1, v0}, Lz4/d;->b(ILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Lp4/t;

    .line 22
    .line 23
    invoke-direct {v0, p1, p2}, Lp4/t;-><init>(Lr4/p;Lz4/d;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lr4/q;->k:Lv4/d;

    .line 27
    .line 28
    const/4 p2, 0x1

    .line 29
    invoke-virtual {v0, p1, p2}, Lp4/t;->J(Lv4/d;Z)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    iget-object p1, p0, Lr4/q;->l:[B

    .line 34
    .line 35
    invoke-virtual {p2, p1}, Lz4/d;->i([B)V

    .line 36
    .line 37
    .line 38
    return-void
.end method
