.class public final Ls7/b;
.super Ls7/d;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final p:Lce/n;


# instance fields
.field public final o:Lp7/k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lce/n;

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lce/n;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Ls7/b;->p:Lce/n;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lp7/k;Ls7/c;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lp7/k;->u:Lr7/f;

    .line 2
    .line 3
    sget-object v1, Lv7/d;->l:Lokio/a;

    .line 4
    .line 5
    invoke-direct {p0, v0, p2, v1}, Ls7/d;-><init>(Lr7/f;Lo7/c;Lk7/f;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Ls7/b;->o:Lp7/k;

    .line 9
    .line 10
    new-instance p2, Ls7/a;

    .line 11
    .line 12
    invoke-direct {p2, p0}, Ls7/a;-><init>(Ls7/b;)V

    .line 13
    .line 14
    .line 15
    iput-object p2, p1, Lp7/k;->w:Ls7/a;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final W(Lk7/a;)V
    .locals 1

    .line 1
    check-cast p1, Lv7/d;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, v0}, Lv7/d;->N(Lv7/g0;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final X()V
    .locals 4

    .line 1
    invoke-super {p0}, Ls7/d;->X()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ls7/b;->o:Lp7/k;

    .line 5
    .line 6
    iget-object v0, v0, Lp7/k;->s:Lr7/c;

    .line 7
    .line 8
    invoke-virtual {v0}, Lr7/c;->get()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    and-int/lit8 v1, v1, -0x4

    .line 13
    .line 14
    iget-object v2, p0, Ls7/d;->n:Lo7/c;

    .line 15
    .line 16
    check-cast v2, Ls7/c;

    .line 17
    .line 18
    iget-object v2, v2, Lo7/b;->l:Lk7/f;

    .line 19
    .line 20
    sget-object v3, Lr7/k;->n:Lokio/a;

    .line 21
    .line 22
    if-ne v2, v3, :cond_0

    .line 23
    .line 24
    const/4 v2, 0x2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    sget-object v3, Lr7/k;->p:Lokio/a;

    .line 27
    .line 28
    if-ne v2, v3, :cond_1

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 v2, 0x0

    .line 33
    :goto_0
    or-int/2addr v1, v2

    .line 34
    int-to-byte v1, v1

    .line 35
    invoke-virtual {v0, v1}, Lr7/c;->P(B)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final l0()Lo7/c;
    .locals 1

    .line 1
    iget-object v0, p0, Ls7/d;->n:Lo7/c;

    .line 2
    .line 3
    check-cast v0, Ls7/c;

    .line 4
    .line 5
    return-object v0
.end method

.method public final m0(I)Lv7/d;
    .locals 4

    .line 1
    iget-object v0, p0, Ls7/d;->n:Lo7/c;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Ls7/c;

    .line 5
    .line 6
    iget-object v1, v1, Lo7/b;->l:Lk7/f;

    .line 7
    .line 8
    sget-object v2, Lr7/k;->p:Lokio/a;

    .line 9
    .line 10
    if-ne v1, v2, :cond_2

    .line 11
    .line 12
    move-object v1, v0

    .line 13
    check-cast v1, Ls7/c;

    .line 14
    .line 15
    iget-object v1, v1, Lo7/b;->l:Lk7/f;

    .line 16
    .line 17
    if-ne v1, v2, :cond_2

    .line 18
    .line 19
    check-cast v0, Ls7/c;

    .line 20
    .line 21
    iget-object v1, v0, Lo7/b;->k:Lz7/c;

    .line 22
    .line 23
    invoke-virtual {v1}, Lz7/c;->size()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/4 v2, 0x0

    .line 28
    :goto_0
    if-ge v2, v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0, v2}, Lo7/b;->Q(I)Lk7/a;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Lr7/k;

    .line 35
    .line 36
    invoke-virtual {v3}, Lr7/k;->N()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-ne p1, v3, :cond_0

    .line 41
    .line 42
    move p1, v2

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const/4 p1, -0x1

    .line 48
    :cond_2
    :goto_1
    invoke-virtual {p0, p1}, Lo7/b;->Q(I)Lk7/a;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, Lv7/d;

    .line 53
    .line 54
    return-object p1
.end method

.method public final n0(Z)Ljava/util/Iterator;
    .locals 2

    .line 1
    iget-object v0, p0, Lo7/b;->k:Lz7/c;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1

    .line 10
    :cond_0
    invoke-virtual {v0}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    sget-object p1, Lz7/h;->g:Lz7/h;

    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_1
    new-instance v0, Lz7/k;

    .line 24
    .line 25
    sget-object v1, Ls7/b;->p:Lce/n;

    .line 26
    .line 27
    invoke-direct {v0, p1, v1}, Lz7/k;-><init>(Ljava/util/Iterator;Ljava/util/function/Predicate;)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method
