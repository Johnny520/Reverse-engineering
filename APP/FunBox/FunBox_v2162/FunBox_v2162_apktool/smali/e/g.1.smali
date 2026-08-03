.class public final Le/g;
.super Le/n;
.source "SourceFile"


# instance fields
.field private final e:Lk/a;

.field private f:I

.field private g:I


# direct methods
.method public constructor <init>(Le/l;Lj/s;Lj/o;Lk/a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Le/n;-><init>(Le/l;Lj/s;Lj/o;)V

    if-eqz p4, :cond_0

    iput-object p4, p0, Le/g;->e:Lk/a;

    const/4 p1, -0x1

    iput p1, p0, Le/g;->f:I

    iput p1, p0, Le/g;->g:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "constant == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final A(I)V
    .locals 1

    if-ltz p1, :cond_1

    iget v0, p0, Le/g;->g:I

    if-gez v0, :cond_0

    iput p1, p0, Le/g;->g:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "class index already set"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "index < 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final B(I)V
    .locals 1

    if-ltz p1, :cond_1

    iget v0, p0, Le/g;->f:I

    if-gez v0, :cond_0

    iput p1, p0, Le/g;->f:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "index already set"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "index < 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Le/g;->e:Lk/a;

    invoke-interface {v0}, Ln/k;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 3

    iget v0, p0, Le/g;->f:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const-string v0, ""

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    iget-object v1, p0, Le/g;->e:Lk/a;

    invoke-virtual {v1}, Lk/a;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v1, p0, Le/g;->f:I

    const/high16 v2, 0x10000

    if-ge v1, v2, :cond_2

    invoke-static {v1}, La/b;->q(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_2
    invoke-static {v1}, La/b;->s(I)Ljava/lang/String;

    move-result-object v1

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Le/g;->e:Lk/a;

    instance-of v1, v0, Lk/t;

    if-eqz v1, :cond_0

    check-cast v0, Lk/t;

    invoke-virtual {v0}, Lk/t;->k()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-interface {v0}, Ln/k;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(Le/l;)Le/j;
    .locals 4

    new-instance v0, Le/g;

    invoke-virtual {p0}, Le/j;->l()Lj/s;

    move-result-object v1

    invoke-virtual {p0}, Le/j;->m()Lj/o;

    move-result-object v2

    iget-object v3, p0, Le/g;->e:Lk/a;

    invoke-direct {v0, p1, v1, v2, v3}, Le/g;-><init>(Le/l;Lj/s;Lj/o;Lk/a;)V

    iget p1, p0, Le/g;->f:I

    if-ltz p1, :cond_0

    invoke-virtual {v0, p1}, Le/g;->B(I)V

    :cond_0
    iget p1, p0, Le/g;->g:I

    if-ltz p1, :cond_1

    invoke-virtual {v0, p1}, Le/g;->A(I)V

    :cond_1
    return-object v0
.end method

.method public final w(Lj/o;)Le/j;
    .locals 4

    new-instance v0, Le/g;

    invoke-virtual {p0}, Le/j;->k()Le/l;

    move-result-object v1

    invoke-virtual {p0}, Le/j;->l()Lj/s;

    move-result-object v2

    iget-object v3, p0, Le/g;->e:Lk/a;

    invoke-direct {v0, v1, v2, p1, v3}, Le/g;-><init>(Le/l;Lj/s;Lj/o;Lk/a;)V

    iget p1, p0, Le/g;->f:I

    if-ltz p1, :cond_0

    invoke-virtual {v0, p1}, Le/g;->B(I)V

    :cond_0
    iget p1, p0, Le/g;->g:I

    if-ltz p1, :cond_1

    invoke-virtual {v0, p1}, Le/g;->A(I)V

    :cond_1
    return-object v0
.end method

.method public final y()Lk/a;
    .locals 1

    iget-object v0, p0, Le/g;->e:Lk/a;

    return-object v0
.end method

.method public final z()I
    .locals 3

    iget v0, p0, Le/g;->f:I

    if-ltz v0, :cond_0

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "index not yet set for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Le/g;->e:Lk/a;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
