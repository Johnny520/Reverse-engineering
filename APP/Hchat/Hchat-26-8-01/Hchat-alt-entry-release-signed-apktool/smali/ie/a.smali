.class public final Lie/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lud/m;


# instance fields
.field public final g:Lod/d;

.field public h:Lqd/j;

.field public i:Ljava/util/List;

.field public final j:Ljava/util/List;

.field public final k:Ljava/util/List;

.field public final l:Z

.field public final m:I


# direct methods
.method public constructor <init>(Lud/m;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Lud/m;->q()Lod/d;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lie/a;->g:Lod/d;

    .line 9
    .line 10
    invoke-interface {p1}, Lud/m;->e()Lqd/j;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lie/a;->h:Lqd/j;

    .line 15
    .line 16
    invoke-interface {p1}, Lud/m;->c()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lie/a;->i:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {p1}, Lud/m;->getTypeParameters()Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Lie/a;->j:Ljava/util/List;

    .line 35
    .line 36
    invoke-interface {p1}, Lud/m;->s()Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, Lie/a;->k:Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {p1}, Lud/m;->v()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iput-boolean v0, p0, Lie/a;->l:Z

    .line 51
    .line 52
    invoke-interface {p1}, Lud/m;->o()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    iput p1, p0, Lie/a;->m:I

    .line 57
    .line 58
    return-void
.end method


# virtual methods
.method public final c()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lie/a;->i:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-super {p0}, Lud/m;->d()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, " (mut)"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final e()Lqd/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lie/a;->h:Lqd/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTypeParameters()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lie/a;->j:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final o()I
    .locals 1

    .line 1
    iget v0, p0, Lie/a;->m:I

    .line 2
    .line 3
    return v0
.end method

.method public final q()Lod/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lie/a;->g:Lod/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lie/a;->k:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lie/a;->d()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "Mutable"

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final v()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lie/a;->l:Z

    .line 2
    .line 3
    return v0
.end method
