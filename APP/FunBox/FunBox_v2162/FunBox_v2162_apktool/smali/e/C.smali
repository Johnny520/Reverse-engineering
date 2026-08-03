.class Le/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj/f;


# instance fields
.field private final a:Le/w;

.field private b:Lj/a;

.field private c:Le/f;

.field final synthetic d:Le/D;


# direct methods
.method public constructor <init>(Le/D;Le/w;)V
    .locals 0

    iput-object p1, p0, Le/C;->d:Le/D;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Le/C;->a:Le/w;

    return-void
.end method

.method private f()Lj/m;
    .locals 4

    iget-object v0, p0, Le/C;->b:Lj/a;

    invoke-virtual {v0}, Lj/a;->e()I

    move-result v0

    const/4 v1, 0x0

    if-gez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v2, p0, Le/C;->d:Le/D;

    invoke-static {v2}, Le/D;->b(Le/D;)Lh/b;

    move-result-object v2

    invoke-virtual {v2}, Lh/b;->a()Lj/c;

    move-result-object v2

    invoke-virtual {v2, v0}, Lj/c;->K(I)Lj/a;

    move-result-object v0

    invoke-virtual {v0}, Lj/a;->b()Lj/h;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lj/h;->o(I)Lj/g;

    move-result-object v0

    invoke-virtual {v0}, Lj/g;->h()Lj/q;

    move-result-object v2

    invoke-virtual {v2}, Lj/q;->d()I

    move-result v2

    const/16 v3, 0x38

    if-eq v2, v3, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {v0}, Lj/g;->j()Lj/m;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lj/u;)V
    .locals 5

    invoke-virtual {p1}, Lj/g;->i()Lj/s;

    move-result-object v0

    invoke-static {p1}, Le/A;->a(Lj/g;)Le/l;

    move-result-object v1

    invoke-virtual {p1}, Lj/g;->h()Lj/q;

    move-result-object v2

    invoke-virtual {v2}, Lj/q;->b()I

    move-result v2

    const/4 v3, 0x6

    if-ne v2, v3, :cond_2

    invoke-direct {p0}, Le/C;->f()Lj/m;

    move-result-object v2

    invoke-virtual {v1}, Le/l;->g()Z

    move-result v3

    if-eqz v2, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-ne v3, v4, :cond_1

    iget-object v3, p0, Le/C;->c:Le/f;

    invoke-virtual {p0, v3}, Le/C;->e(Le/j;)V

    new-instance v3, Le/E;

    invoke-static {p1, v2}, Le/D;->g(Lj/g;Lj/m;)Lj/o;

    move-result-object p1

    invoke-direct {v3, v1, v0, p1}, Le/E;-><init>(Le/l;Lj/s;Lj/o;)V

    invoke-virtual {p0, v3}, Le/C;->e(Le/j;)V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Insn with result/move-result-pseudo mismatch"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "shouldn\'t happen"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(Lj/i;)V
    .locals 5

    invoke-virtual {p1}, Lj/g;->i()Lj/s;

    move-result-object v0

    invoke-static {p1}, Le/A;->a(Lj/g;)Le/l;

    move-result-object v1

    invoke-virtual {p1}, Lj/g;->h()Lj/q;

    move-result-object v2

    invoke-virtual {v2}, Lj/q;->d()I

    move-result v3

    invoke-virtual {v2}, Lj/q;->b()I

    move-result v2

    const/4 v4, 0x1

    if-ne v2, v4, :cond_2

    const/4 v2, 0x3

    if-ne v3, v2, :cond_0

    iget-object v2, p0, Le/C;->d:Le/D;

    invoke-static {v2}, Le/D;->d(Le/D;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {p1}, Lj/g;->j()Lj/m;

    move-result-object v3

    invoke-virtual {p1}, Lj/d;->l()Lk/a;

    move-result-object p1

    check-cast p1, Lk/j;

    invoke-virtual {p1}, Lk/l;->h()I

    move-result p1

    invoke-static {v2}, Le/D;->e(Le/D;)I

    move-result v4

    invoke-static {v2}, Le/D;->c(Le/D;)I

    move-result v2

    sub-int/2addr v4, v2

    add-int/2addr v4, p1

    invoke-virtual {v3}, Lj/m;->c()Ll/c;

    move-result-object p1

    invoke-static {v4, p1}, Lj/m;->m(ILl/c;)Lj/m;

    move-result-object p1

    new-instance v2, Le/E;

    invoke-static {v3, p1}, Lj/o;->I(Lj/m;Lj/m;)Lj/o;

    move-result-object p1

    invoke-direct {v2, v1, v0, p1}, Le/E;-><init>(Le/l;Lj/s;Lj/o;)V

    invoke-virtual {p0, v2}, Le/C;->e(Le/j;)V

    goto :goto_0

    :cond_0
    invoke-static {p1}, Le/D;->f(Lj/g;)Lj/o;

    move-result-object v2

    new-instance v3, Le/g;

    invoke-virtual {p1}, Lj/d;->l()Lk/a;

    move-result-object p1

    invoke-direct {v3, v1, v0, v2, p1}, Le/g;-><init>(Le/l;Lj/s;Lj/o;Lk/a;)V

    invoke-virtual {p0, v3}, Le/C;->e(Le/j;)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "shouldn\'t happen"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c(Lj/j;)V
    .locals 5

    invoke-virtual {p1}, Lj/g;->h()Lj/q;

    move-result-object v0

    invoke-virtual {v0}, Lj/q;->d()I

    move-result v1

    const/16 v2, 0x36

    if-ne v1, v2, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lj/q;->d()I

    move-result v1

    const/16 v2, 0x38

    if-ne v1, v2, :cond_1

    return-void

    :cond_1
    invoke-virtual {p1}, Lj/g;->i()Lj/s;

    move-result-object v1

    invoke-static {p1}, Le/A;->a(Lj/g;)Le/l;

    move-result-object v2

    invoke-virtual {v0}, Lj/q;->b()I

    move-result v0

    const/4 v3, 0x1

    if-eq v0, v3, :cond_5

    const/4 v4, 0x2

    if-eq v0, v4, :cond_5

    const/4 v4, 0x3

    if-eq v0, v4, :cond_4

    const/4 v4, 0x4

    if-eq v0, v4, :cond_3

    const/4 v3, 0x6

    if-ne v0, v3, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "shouldn\'t happen"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    iget-object v0, p0, Le/C;->b:Lj/a;

    invoke-virtual {v0}, Lj/a;->g()Ln/g;

    move-result-object v0

    invoke-virtual {v0, v3}, Ln/g;->l(I)I

    move-result v0

    new-instance v3, Le/F;

    invoke-static {p1}, Le/D;->f(Lj/g;)Lj/o;

    move-result-object p1

    iget-object v4, p0, Le/C;->d:Le/D;

    invoke-static {v4}, Le/D;->a(Le/D;)Le/a;

    move-result-object v4

    invoke-virtual {v4, v0}, Le/a;->e(I)Le/f;

    move-result-object v0

    invoke-direct {v3, v2, v1, p1, v0}, Le/F;-><init>(Le/l;Lj/s;Lj/o;Le/f;)V

    goto :goto_1

    :cond_4
    return-void

    :cond_5
    :goto_0
    new-instance v3, Le/E;

    invoke-static {p1}, Le/D;->f(Lj/g;)Lj/o;

    move-result-object p1

    invoke-direct {v3, v2, v1, p1}, Le/E;-><init>(Le/l;Lj/s;Lj/o;)V

    :goto_1
    invoke-virtual {p0, v3}, Le/C;->e(Le/j;)V

    return-void
.end method

.method public d(Lj/t;)V
    .locals 10

    invoke-virtual {p1}, Lj/g;->i()Lj/s;

    move-result-object v0

    invoke-static {p1}, Le/A;->a(Lj/g;)Le/l;

    move-result-object v1

    invoke-virtual {p1}, Lj/g;->h()Lj/q;

    move-result-object v2

    invoke-virtual {p1}, Lj/d;->l()Lk/a;

    move-result-object v3

    invoke-virtual {v2}, Lj/q;->b()I

    move-result v4

    const/4 v5, 0x6

    if-ne v4, v5, :cond_a

    iget-object v4, p0, Le/C;->c:Le/f;

    invoke-virtual {p0, v4}, Le/C;->e(Le/j;)V

    invoke-virtual {v2}, Lj/q;->e()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {p1}, Lj/g;->k()Lj/o;

    move-result-object p1

    new-instance v2, Le/g;

    invoke-direct {v2, v1, v0, p1, v3}, Le/g;-><init>(Le/l;Lj/s;Lj/o;Lk/a;)V

    invoke-virtual {p0, v2}, Le/C;->e(Le/j;)V

    goto/16 :goto_6

    :cond_0
    invoke-direct {p0}, Le/C;->f()Lj/m;

    move-result-object v4

    invoke-static {p1, v4}, Le/D;->g(Lj/g;Lj/m;)Lj/o;

    move-result-object v5

    invoke-virtual {v1}, Le/l;->g()Z

    move-result v6

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-nez v6, :cond_2

    invoke-virtual {v2}, Lj/q;->d()I

    move-result v6

    const/16 v9, 0x2b

    if-ne v6, v9, :cond_1

    goto :goto_0

    :cond_1
    move v6, v7

    goto :goto_1

    :cond_2
    :goto_0
    move v6, v8

    :goto_1
    if-eqz v4, :cond_3

    move v4, v8

    goto :goto_2

    :cond_3
    move v4, v7

    :goto_2
    if-ne v6, v4, :cond_9

    invoke-virtual {v2}, Lj/q;->d()I

    move-result p1

    const/16 v2, 0x29

    if-ne p1, v2, :cond_4

    invoke-virtual {v1}, Le/l;->e()I

    move-result p1

    const/16 v2, 0x23

    if-eq p1, v2, :cond_4

    new-instance p1, Le/E;

    invoke-direct {p1, v1, v0, v5}, Le/E;-><init>(Le/l;Lj/s;Lj/o;)V

    goto :goto_3

    :cond_4
    new-instance p1, Le/g;

    invoke-direct {p1, v1, v0, v5, v3}, Le/g;-><init>(Le/l;Lj/s;Lj/o;Lk/a;)V

    :goto_3
    iget-object v2, p0, Le/C;->a:Le/w;

    invoke-virtual {v2}, Le/w;->e()I

    move-result v3

    const/4 v4, -0x1

    add-int/2addr v3, v4

    :goto_4
    if-ltz v3, :cond_6

    invoke-virtual {v2, v3}, Le/w;->b(I)Le/j;

    move-result-object v5

    invoke-virtual {v5}, Le/j;->k()Le/l;

    move-result-object v6

    invoke-virtual {v6}, Le/l;->e()I

    move-result v6

    if-eq v6, v4, :cond_5

    goto :goto_5

    :cond_5
    add-int/lit8 v3, v3, -0x1

    goto :goto_4

    :cond_6
    const/4 v5, 0x0

    :goto_5
    invoke-virtual {v1}, Le/l;->e()I

    move-result v1

    const/16 v2, 0x20

    if-ne v1, v2, :cond_8

    if-eqz v5, :cond_8

    invoke-virtual {v5}, Le/j;->k()Le/l;

    move-result-object v1

    invoke-virtual {v1}, Le/l;->e()I

    move-result v1

    const/4 v2, 0x7

    if-eq v1, v2, :cond_7

    const/16 v2, 0x8

    if-eq v1, v2, :cond_7

    const/16 v2, 0x9

    if-ne v1, v2, :cond_8

    :cond_7
    invoke-virtual {p1}, Le/j;->m()Lj/o;

    move-result-object v1

    invoke-virtual {v1}, Ln/e;->B()I

    move-result v1

    if-lez v1, :cond_8

    invoke-virtual {v5}, Le/j;->m()Lj/o;

    move-result-object v1

    invoke-virtual {v1}, Ln/e;->B()I

    move-result v1

    if-le v1, v8, :cond_8

    invoke-virtual {p1}, Le/j;->m()Lj/o;

    move-result-object v1

    invoke-virtual {v1, v7}, Lj/o;->p(I)Lj/m;

    move-result-object v1

    invoke-virtual {v1}, Lj/m;->i()I

    move-result v1

    invoke-virtual {v5}, Le/j;->m()Lj/o;

    move-result-object v2

    invoke-virtual {v2, v8}, Lj/o;->p(I)Lj/m;

    move-result-object v2

    invoke-virtual {v2}, Lj/m;->i()I

    move-result v2

    if-ne v1, v2, :cond_8

    new-instance v1, Le/E;

    sget-object v2, Le/m;->c:Le/l;

    sget-object v3, Lj/o;->c:Lj/o;

    invoke-direct {v1, v2, v0, v3}, Le/E;-><init>(Le/l;Lj/s;Lj/o;)V

    invoke-virtual {p0, v1}, Le/C;->e(Le/j;)V

    :cond_8
    invoke-virtual {p0, p1}, Le/C;->e(Le/j;)V

    :goto_6
    return-void

    :cond_9
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Insn with result/move-result-pseudo mismatch "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Expected BRANCH_THROW got "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Lj/q;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected final e(Le/j;)V
    .locals 1

    iget-object v0, p0, Le/C;->a:Le/w;

    invoke-virtual {v0, p1}, Le/w;->a(Le/j;)V

    return-void
.end method

.method public final g(Lj/a;Le/f;)V
    .locals 0

    iput-object p1, p0, Le/C;->b:Lj/a;

    iput-object p2, p0, Le/C;->c:Le/f;

    return-void
.end method
