.class public abstract Ll7/a;
.super Lo7/d;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final m:Lp7/a;

.field public n:Lr7/a;


# direct methods
.method public constructor <init>(Lp7/a;I)V
    .locals 1

    .line 21
    new-instance v0, Lo7/g;

    .line 22
    invoke-direct {v0}, Lk7/a;-><init>()V

    .line 23
    invoke-direct {p0, p1, v0, p2}, Ll7/a;-><init>(Lp7/a;Lo7/g;I)V

    return-void
.end method

.method public constructor <init>(Lp7/a;Lo7/g;I)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 v0, 0x3

    .line 6
    :goto_0
    add-int/2addr p3, v0

    .line 7
    invoke-direct {p0, p3}, Lo7/d;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Ll7/a;->m:Lp7/a;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lo7/d;->P(Lk7/a;)V

    .line 13
    .line 14
    .line 15
    if-eqz p2, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0, p2}, Lo7/d;->P(Lk7/a;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    return-void
.end method


# virtual methods
.method public B(Lq7/b;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lp7/b;->T(Lq7/b;)Lp7/b;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p0, v0}, Ll7/a;->Q(Lp7/b;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, Lp7/a;->o:Lr7/f;

    .line 12
    .line 13
    iget v1, v1, Lr7/f;->n:I

    .line 14
    .line 15
    invoke-virtual {p1, v1}, Lq7/b;->a(I)Lq7/b;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {p0, v1}, Ll7/a;->T(Lq7/b;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, v0, Lp7/a;->o:Lr7/f;

    .line 23
    .line 24
    iget v0, v0, Lr7/f;->n:I

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Lq7/b;->c(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Lq7/b;->close()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Ll7/a;->R()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final N()V
    .locals 4

    .line 1
    iget-object v0, p0, Ll7/a;->n:Lr7/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lr7/a;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v0, v2, v1}, Lr7/a;-><init>(IZ)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lo7/d;->P(Lk7/a;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Ll7/a;->n:Lr7/a;

    .line 16
    .line 17
    :cond_0
    invoke-virtual {v0, v1}, Lr7/a;->O(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1, v1}, Lr7/b;->M(IZ)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lk7/c;->p()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {v0, v1}, Lr7/a;->N(I)I

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Ll7/a;->m:Lp7/a;

    .line 31
    .line 32
    invoke-virtual {v0}, Lk7/c;->p()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    int-to-short v1, v1

    .line 37
    iget-object v2, v0, Lp7/a;->n:Lr7/a;

    .line 38
    .line 39
    const v3, 0xffff

    .line 40
    .line 41
    .line 42
    and-int/2addr v1, v3

    .line 43
    invoke-virtual {v2, v1}, Lr7/a;->k(I)V

    .line 44
    .line 45
    .line 46
    iget-object v1, v0, Lk7/a;->h:Lk7/a;

    .line 47
    .line 48
    if-nez v1, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-virtual {v1}, Lk7/a;->p()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    iget-object v0, v0, Lp7/a;->o:Lr7/f;

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Lr7/f;->k(I)V

    .line 58
    .line 59
    .line 60
    :goto_0
    invoke-virtual {p0}, Ll7/a;->S()V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public Q(Lp7/b;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lp7/a;->Q()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const-string v0, "Invalid chunk: "

    .line 12
    .line 13
    invoke-static {p1, v0}, Lj8/o;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public R()V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract S()V
.end method

.method public final T(Lq7/b;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ll7/a;->n:Lr7/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lr7/a;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v0, v2, v1}, Lr7/a;-><init>(IZ)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lo7/d;->P(Lk7/a;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Ll7/a;->n:Lr7/a;

    .line 16
    .line 17
    :cond_0
    invoke-virtual {v0, v1}, Lr7/a;->O(I)V

    .line 18
    .line 19
    .line 20
    invoke-super {p0, p1}, Lk7/c;->B(Lq7/b;)V

    .line 21
    .line 22
    .line 23
    iget v1, p1, Lq7/b;->k:I

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lr7/a;->N(I)I

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Lr7/b;->p()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-virtual {p1}, Lq7/b;->available()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    if-lt v2, v1, :cond_1

    .line 39
    .line 40
    iget-object v0, v0, Lr7/b;->k:[B

    .line 41
    .line 42
    invoke-virtual {p1, v0, v1}, Lq7/b;->e([BI)I

    .line 43
    .line 44
    .line 45
    :cond_1
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, ": "

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Ll7/a;->m:Lp7/a;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0
.end method
