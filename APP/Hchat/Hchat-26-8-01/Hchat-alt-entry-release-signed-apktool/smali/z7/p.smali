.class public final Lz7/p;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public g:Ljava/lang/Object;

.field public final h:Lae/d;

.field public i:Z

.field public j:Ljava/lang/Object;

.field public k:Ljava/util/Iterator;

.field public l:Lz7/p;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lae/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz7/p;->g:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lz7/p;->h:Lae/d;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lz7/p;->j:Ljava/lang/Object;

    .line 2
    .line 3
    if-nez v0, :cond_4

    .line 4
    .line 5
    iget-boolean v0, p0, Lz7/p;->i:Z

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lz7/p;->i:Z

    .line 12
    .line 13
    iget-object v0, p0, Lz7/p;->g:Ljava/lang/Object;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iput-object v1, p0, Lz7/p;->g:Ljava/lang/Object;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v1, v0

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    iget-object v0, p0, Lz7/p;->g:Ljava/lang/Object;

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    iput-object v1, p0, Lz7/p;->g:Ljava/lang/Object;

    .line 27
    .line 28
    iget-object v2, p0, Lz7/p;->h:Lae/d;

    .line 29
    .line 30
    invoke-virtual {v2, v0}, Lae/d;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Ljava/util/Iterator;

    .line 35
    .line 36
    iput-object v0, p0, Lz7/p;->k:Ljava/util/Iterator;

    .line 37
    .line 38
    :cond_2
    invoke-virtual {p0}, Lz7/p;->b()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_3

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    :cond_3
    :goto_0
    iput-object v1, p0, Lz7/p;->j:Ljava/lang/Object;

    .line 55
    .line 56
    return-object v1

    .line 57
    :cond_4
    return-object v0
.end method

.method public final b()Ljava/util/Iterator;
    .locals 3

    .line 1
    iget-object v0, p0, Lz7/p;->l:Lz7/p;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lz7/p;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, Lz7/p;->l:Lz7/p;

    .line 14
    .line 15
    iget-object v1, p0, Lz7/p;->k:Ljava/util/Iterator;

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    new-instance v0, Lz7/p;

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget-object v2, p0, Lz7/p;->h:Lae/d;

    .line 32
    .line 33
    invoke-direct {v0, v1, v2}, Lz7/p;-><init>(Ljava/lang/Object;Lae/d;)V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Lz7/p;->l:Lz7/p;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    iput-object v0, p0, Lz7/p;->k:Ljava/util/Iterator;

    .line 40
    .line 41
    :goto_0
    if-eqz v0, :cond_2

    .line 42
    .line 43
    invoke-virtual {v0}, Lz7/p;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-nez v1, :cond_2

    .line 48
    .line 49
    invoke-virtual {p0}, Lz7/p;->b()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    :cond_2
    return-object v0
.end method

.method public final hasNext()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lz7/p;->a()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lz7/p;->a()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput-object v1, p0, Lz7/p;->j:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    invoke-static {}, Lbsh/j;->e()V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    return-object v0
.end method
