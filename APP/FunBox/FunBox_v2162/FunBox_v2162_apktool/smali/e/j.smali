.class public abstract Le/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private final b:Le/l;

.field private final c:Lj/s;

.field private final d:Lj/o;


# direct methods
.method public constructor <init>(Le/l;Lj/s;Lj/o;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_2

    if-eqz p2, :cond_1

    if-eqz p3, :cond_0

    const/4 v0, -0x1

    iput v0, p0, Le/j;->a:I

    iput-object p1, p0, Le/j;->b:Le/l;

    iput-object p2, p0, Le/j;->c:Lj/s;

    iput-object p3, p0, Le/j;->d:Lj/o;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "registers == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "position == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "opcode == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static r(Lj/s;Lj/m;Lj/m;)Le/E;
    .locals 5

    invoke-virtual {p1}, Lj/m;->g()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1}, Lj/m;->c()Ll/c;

    move-result-object v0

    invoke-virtual {v0}, Ll/c;->l()Z

    move-result v0

    invoke-virtual {p1}, Lj/m;->i()I

    move-result v2

    invoke-virtual {p2}, Lj/m;->i()I

    move-result v3

    or-int/2addr v3, v2

    const/16 v4, 0x10

    if-ge v3, v4, :cond_3

    if-eqz v0, :cond_1

    sget-object v0, Le/m;->j:Le/l;

    goto :goto_1

    :cond_1
    if-eqz v1, :cond_2

    sget-object v0, Le/m;->d:Le/l;

    goto :goto_1

    :cond_2
    sget-object v0, Le/m;->g:Le/l;

    goto :goto_1

    :cond_3
    const/16 v3, 0x100

    if-ge v2, v3, :cond_6

    if-eqz v0, :cond_4

    sget-object v0, Le/m;->k:Le/l;

    goto :goto_1

    :cond_4
    if-eqz v1, :cond_5

    sget-object v0, Le/m;->e:Le/l;

    goto :goto_1

    :cond_5
    sget-object v0, Le/m;->h:Le/l;

    goto :goto_1

    :cond_6
    if-eqz v0, :cond_7

    sget-object v0, Le/m;->l:Le/l;

    goto :goto_1

    :cond_7
    if-eqz v1, :cond_8

    sget-object v0, Le/m;->f:Le/l;

    goto :goto_1

    :cond_8
    sget-object v0, Le/m;->i:Le/l;

    :goto_1
    new-instance v1, Le/E;

    invoke-static {p1, p2}, Lj/o;->I(Lj/m;Lj/m;)Lj/o;

    move-result-object p1

    invoke-direct {v1, v0, p0, p1}, Le/E;-><init>(Le/l;Lj/s;Lj/o;)V

    return-object v1
.end method


# virtual methods
.method protected abstract a()Ljava/lang/String;
.end method

.method public abstract b()I
.end method

.method public c()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Not supported."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Not supported."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e(Ljava/util/BitSet;)Le/o;
    .locals 4

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    invoke-virtual {p0}, Le/j;->o()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1, v0}, Ljava/util/BitSet;->set(I)V

    :cond_0
    iget-object v2, p0, Le/j;->d:Lj/o;

    invoke-virtual {v2, p1}, Lj/o;->K(Ljava/util/BitSet;)Lj/o;

    move-result-object v2

    invoke-virtual {p0}, Le/j;->o()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p1, v0, v1}, Ljava/util/BitSet;->set(IZ)V

    :cond_1
    invoke-virtual {v2}, Ln/e;->B()I

    move-result p1

    if-nez p1, :cond_2

    const/4 p1, 0x0

    return-object p1

    :cond_2
    new-instance p1, Le/o;

    iget-object v0, p0, Le/j;->c:Lj/s;

    invoke-direct {p1, v0, v2}, Le/o;-><init>(Lj/s;Lj/o;)V

    return-object p1
.end method

.method public final f(Ljava/util/BitSet;)Le/E;
    .locals 2

    invoke-virtual {p0}, Le/j;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/BitSet;->get(I)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Le/j;->d:Lj/o;

    invoke-virtual {p1, v0}, Lj/o;->p(I)Lj/m;

    move-result-object p1

    invoke-virtual {p1, v0}, Lj/m;->r(I)Lj/m;

    move-result-object v0

    iget-object v1, p0, Le/j;->c:Lj/s;

    invoke-static {v1, p1, v0}, Le/j;->r(Lj/s;Lj/m;Lj/m;)Le/E;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final g(Ljava/util/BitSet;)Le/j;
    .locals 2

    invoke-virtual {p0}, Le/j;->o()Z

    move-result v0

    iget-object v1, p0, Le/j;->d:Lj/o;

    invoke-virtual {v1, v0, p1}, Lj/o;->L(ZLjava/util/BitSet;)Lj/o;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/j;->w(Lj/o;)Le/j;

    move-result-object p1

    return-object p1
.end method

.method public final h()I
    .locals 2

    iget v0, p0, Le/j;->a:I

    if-ltz v0, :cond_0

    return v0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "address not yet known"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final i()Le/j;
    .locals 3

    invoke-virtual {p0}, Le/j;->o()Z

    move-result v0

    const/4 v1, 0x0

    iget-object v2, p0, Le/j;->d:Lj/o;

    invoke-virtual {v2, v0, v1}, Lj/o;->L(ZLjava/util/BitSet;)Lj/o;

    move-result-object v0

    invoke-virtual {p0, v0}, Le/j;->w(Lj/o;)Le/j;

    move-result-object v0

    return-object v0
.end method

.method public final j(Ljava/util/BitSet;)I
    .locals 6

    invoke-virtual {p0}, Le/j;->o()Z

    move-result v0

    iget-object v1, p0, Le/j;->d:Lj/o;

    invoke-virtual {v1}, Ln/e;->B()I

    move-result v2

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p1, v3}, Ljava/util/BitSet;->get(I)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v1, v3}, Lj/o;->p(I)Lj/m;

    move-result-object v4

    invoke-virtual {v4}, Lj/m;->g()I

    move-result v4

    goto :goto_0

    :cond_0
    move v4, v3

    :goto_0
    if-ge v0, v2, :cond_2

    invoke-virtual {p1, v0}, Ljava/util/BitSet;->get(I)Z

    move-result v5

    if-nez v5, :cond_1

    invoke-virtual {v1, v0}, Lj/o;->p(I)Lj/m;

    move-result-object v5

    invoke-virtual {v5}, Lj/m;->g()I

    move-result v5

    add-int/2addr v5, v3

    move v3, v5

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1
.end method

.method public final k()Le/l;
    .locals 1

    iget-object v0, p0, Le/j;->b:Le/l;

    return-object v0
.end method

.method public final l()Lj/s;
    .locals 1

    iget-object v0, p0, Le/j;->c:Lj/s;

    return-object v0
.end method

.method public final m()Lj/o;
    .locals 1

    iget-object v0, p0, Le/j;->d:Lj/o;

    return-object v0
.end method

.method public final n()Z
    .locals 1

    iget v0, p0, Le/j;->a:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final o()Z
    .locals 1

    iget-object v0, p0, Le/j;->b:Le/l;

    invoke-virtual {v0}, Le/l;->g()Z

    move-result v0

    return v0
.end method

.method public final p()Ljava/lang/String;
    .locals 2

    iget v0, p0, Le/j;->a:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "%04x"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, La/b;->s(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected abstract q()Ljava/lang/String;
.end method

.method public final s(I)V
    .locals 1

    if-ltz p1, :cond_0

    iput p1, p0, Le/j;->a:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "address < 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public t(Lm/a;)Le/j;
    .locals 5

    iget-object v0, p0, Le/j;->d:Lj/o;

    invoke-virtual {v0}, Ln/e;->B()I

    move-result v1

    new-instance v2, Lj/o;

    invoke-direct {v2, v1}, Lj/o;-><init>(I)V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    invoke-virtual {v0, v3}, Lj/o;->p(I)Lj/m;

    move-result-object v4

    invoke-virtual {p1, v4}, Lm/a;->b(Lj/m;)Lj/m;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lj/o;->x(ILj/m;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ln/j;->g()V

    invoke-virtual {v2, v0}, Ln/e;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    move-object v0, v2

    :goto_1
    invoke-virtual {p0, v0}, Le/j;->w(Lj/o;)Le/j;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {p0}, Le/j;->p()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p0, Le/j;->c:Lj/s;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Le/j;->b:Le/l;

    invoke-virtual {v2}, Le/l;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Le/j;->d:Lj/o;

    invoke-virtual {v2}, Ln/e;->B()I

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x0

    const-string v4, " "

    invoke-virtual {v2, v4, v3}, Ln/e;->C(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p0}, Le/j;->a()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    if-eqz v2, :cond_1

    const/16 v2, 0x2c

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract u(Le/l;)Le/j;
.end method

.method public abstract v(I)Le/j;
.end method

.method public abstract w(Lj/o;)Le/j;
.end method

.method public abstract x(Ln/d;)V
.end method
