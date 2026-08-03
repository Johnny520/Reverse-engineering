.class public abstract Lm7/b;
.super Ll7/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final o:Lr7/f;

.field public final p:Lr7/f;


# direct methods
.method public constructor <init>(II)V
    .locals 1

    .line 33
    new-instance v0, Lo7/g;

    .line 34
    invoke-direct {v0}, Lk7/a;-><init>()V

    .line 35
    invoke-direct {p0, p1, v0, p2}, Lm7/b;-><init>(ILo7/g;I)V

    return-void
.end method

.method public constructor <init>(ILo7/g;I)V
    .locals 1

    .line 1
    new-instance v0, Lp7/m;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lp7/m;-><init>(I)V

    .line 4
    .line 5
    .line 6
    add-int/lit8 p3, p3, 0x2

    .line 7
    .line 8
    invoke-direct {p0, v0, p2, p3}, Ll7/a;-><init>(Lp7/a;Lo7/g;I)V

    .line 9
    .line 10
    .line 11
    new-instance p1, Lr7/f;

    .line 12
    .line 13
    const/4 p2, -0x1

    .line 14
    invoke-direct {p1, p2}, Lr7/f;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lm7/b;->o:Lr7/f;

    .line 18
    .line 19
    new-instance p3, Lr7/f;

    .line 20
    .line 21
    invoke-direct {p3, p2}, Lr7/f;-><init>(I)V

    .line 22
    .line 23
    .line 24
    iput-object p3, p0, Lm7/b;->p:Lr7/f;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lo7/d;->P(Lk7/a;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p3}, Lo7/d;->P(Lk7/a;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public S()V
    .locals 0

    .line 1
    return-void
.end method

.method public U()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lm7/b;->p:Lr7/f;

    .line 2
    .line 3
    iget v0, v0, Lr7/f;->n:I

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lm7/b;->V(I)Lr7/o;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Lr7/r;->m:Ljava/lang/String;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return-object v0
.end method

.method public final V(I)Lr7/o;
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-object v1

    .line 6
    :cond_0
    invoke-virtual {p0}, Lm7/b;->W()Lu7/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lu7/c;->V(I)Lr7/s;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lr7/o;

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_1
    return-object v1
.end method

.method public final W()Lu7/a;
    .locals 2

    .line 1
    iget-object v0, p0, Lk7/a;->h:Lk7/a;

    .line 2
    .line 3
    :goto_0
    if-eqz v0, :cond_2

    .line 4
    .line 5
    instance-of v1, v0, Lm7/f;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Lm7/f;

    .line 10
    .line 11
    iget-object v0, v0, Lm7/q;->k:Lk7/c;

    .line 12
    .line 13
    check-cast v0, Lm7/g;

    .line 14
    .line 15
    iget-object v0, v0, Lm7/g;->o:Lu7/a;

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    instance-of v1, v0, Lm7/j;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    check-cast v0, Lm7/j;

    .line 23
    .line 24
    const-class v1, Lm7/f;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lk7/a;->v(Ljava/lang/Class;)Lk7/a;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lm7/f;

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    iget-object v0, v0, Lm7/q;->k:Lk7/c;

    .line 35
    .line 36
    check-cast v0, Lm7/g;

    .line 37
    .line 38
    iget-object v0, v0, Lm7/g;->o:Lu7/a;

    .line 39
    .line 40
    return-object v0

    .line 41
    :cond_1
    iget-object v0, v0, Lk7/a;->h:Lk7/a;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    const/4 v0, 0x0

    .line 45
    return-object v0
.end method

.method public final X(Lr7/f;)V
    .locals 1

    .line 1
    iget v0, p1, Lr7/f;->n:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lm7/b;->V(I)Lr7/o;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lr7/s;->P(Lr7/m;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public Y()V
    .locals 1

    .line 1
    iget-object v0, p0, Ll7/a;->m:Lp7/a;

    .line 2
    .line 3
    check-cast v0, Lp7/m;

    .line 4
    .line 5
    iget-object v0, v0, Lp7/m;->s:Lr7/f;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lm7/b;->X(Lr7/f;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lm7/b;->o:Lr7/f;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lm7/b;->X(Lr7/f;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lm7/b;->p:Lr7/f;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lm7/b;->X(Lr7/f;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public Z()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lm7/b;->W()Lu7/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v1, p0, Ll7/a;->m:Lp7/a;

    .line 9
    .line 10
    check-cast v1, Lp7/m;

    .line 11
    .line 12
    iget-object v1, v1, Lp7/m;->s:Lr7/f;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lu7/c;->b0(Lr7/m;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lm7/b;->o:Lr7/f;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lu7/c;->b0(Lr7/m;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lm7/b;->p:Lr7/f;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lu7/c;->b0(Lr7/m;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public a0(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lm7/b;->o:Lr7/f;

    .line 2
    .line 3
    iget v1, v0, Lr7/f;->n:I

    .line 4
    .line 5
    if-ne p1, v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0, v1}, Lm7/b;->V(I)Lr7/o;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Lr7/s;->a0(Lr7/m;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    invoke-virtual {v0, p1}, Lr7/f;->k(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lm7/b;->X(Lr7/f;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public b0(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lm7/b;->p:Lr7/f;

    .line 2
    .line 3
    iget v1, v0, Lr7/f;->n:I

    .line 4
    .line 5
    if-ne p1, v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0, v1}, Lm7/b;->V(I)Lr7/o;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Lr7/s;->a0(Lr7/m;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    invoke-virtual {v0, p1}, Lr7/f;->k(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lm7/b;->X(Lr7/f;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Ll7/a;->m:Lp7/a;

    .line 2
    .line 3
    check-cast v0, Lp7/m;

    .line 4
    .line 5
    invoke-virtual {v0}, Lp7/a;->Q()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-super {p0}, Ll7/a;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-static {v1}, Lj8/b;->b(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ": line="

    .line 29
    .line 30
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    iget-object v0, v0, Lp7/m;->r:Lr7/f;

    .line 34
    .line 35
    iget v0, v0, Lr7/f;->n:I

    .line 36
    .line 37
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v0, " {"

    .line 41
    .line 42
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lm7/b;->U()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v0, "}"

    .line 53
    .line 54
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    return-object v0
.end method
