.class public abstract Lk7/b;
.super Lo7/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lk7/f;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lo7/b;-><init>(Lk7/f;)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p0}, Lo7/b;->b0(Lk7/f;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public B(Lq7/b;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lo7/b;->Y(Lq7/b;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final W(Lk7/a;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Lk7/a;->J(Lk7/a;)V

    .line 3
    .line 4
    .line 5
    const/4 v0, -0x1

    .line 6
    invoke-virtual {p1, v0}, Lk7/a;->H(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final c0(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lo7/b;->k:Lz7/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz7/c;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    move v1, p1

    .line 8
    :goto_0
    if-ge v1, v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lo7/b;->Q(I)Lk7/a;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {p0, v2}, Lk7/b;->W(Lk7/a;)V

    .line 15
    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p0, p1, v0}, Lo7/b;->d0(IZ)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final j0(Z)Ljava/util/Iterator;
    .locals 2

    .line 1
    iget-object v0, p0, Lo7/b;->k:Lz7/c;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    new-instance p1, Lce/n;

    .line 6
    .line 7
    const/16 v1, 0x9

    .line 8
    .line 9
    invoke-direct {p1, v1}, Lce/n;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    sget-object p1, Lz7/h;->g:Lz7/h;

    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_0
    new-instance v1, Lz7/k;

    .line 26
    .line 27
    invoke-direct {v1, v0, p1}, Lz7/k;-><init>(Ljava/util/Iterator;Ljava/util/function/Predicate;)V

    .line 28
    .line 29
    .line 30
    return-object v1

    .line 31
    :cond_1
    invoke-virtual {v0}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1
.end method
