.class public final Lc/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lc/i;

.field private final b:Ljava/util/ArrayList;

.field private c:Lc/g;

.field private d:Z

.field private final e:Lc/h;

.field private final f:Ljava/util/ArrayList;

.field private final g:Ljava/util/ArrayList;

.field private h:Lj/s;

.field private final i:Ljava/util/ArrayList;

.field private j:Ll/b;


# direct methods
.method constructor <init>(Lc/c;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lc/a;->b:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lc/a;->f:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lc/a;->g:Ljava/util/ArrayList;

    sget-object v1, Lj/s;->a:Lj/s;

    iput-object v1, p0, Lc/a;->h:Lj/s;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lc/a;->i:Ljava/util/ArrayList;

    sget-object v1, Ll/b;->c:Ll/b;

    iput-object v1, p0, Lc/a;->j:Ll/b;

    iget-object v1, p1, Lc/c;->a:Lc/i;

    iput-object v1, p0, Lc/a;->a:Lc/i;

    invoke-virtual {p1}, Lc/c;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lc/a;->e:Lc/h;

    goto :goto_0

    :cond_0
    iget-object p1, v1, Lc/i;->a:Lc/j;

    invoke-static {p0, p1}, Lc/h;->a(Lc/a;Lc/j;)Lc/h;

    move-result-object p1

    iput-object p1, p0, Lc/a;->e:Lc/h;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    iget-object p1, v1, Lc/i;->d:Lc/k;

    iget-object p1, p1, Lc/k;->a:[Lc/j;

    array-length v0, p1

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    iget-object v3, p0, Lc/a;->f:Ljava/util/ArrayList;

    invoke-static {p0, v2}, Lc/h;->a(Lc/a;Lc/j;)Lc/h;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    new-instance p1, Lc/g;

    invoke-direct {p1}, Lc/g;-><init>()V

    iput-object p1, p0, Lc/a;->c:Lc/g;

    iget-object v0, p1, Lc/g;->b:Lc/a;

    if-ne v0, p0, :cond_2

    goto :goto_2

    :cond_2
    if-nez v0, :cond_3

    iput-object p0, p1, Lc/g;->b:Lc/a;

    iget-object v0, p0, Lc/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_2
    iget-object p1, p0, Lc/a;->c:Lc/g;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lc/g;->c:Z

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot adopt label; it belongs to another Code"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private a(Lj/g;)V
    .locals 4

    iget-object v0, p0, Lc/a;->c:Lc/g;

    if-eqz v0, :cond_7

    iget-boolean v1, v0, Lc/g;->c:Z

    if-eqz v1, :cond_7

    iget-object v0, v0, Lc/g;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lj/g;->h()Lj/q;

    move-result-object p1

    invoke-virtual {p1}, Lj/q;->b()I

    move-result p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_6

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eq p1, v1, :cond_5

    const/4 v1, 0x3

    const-string v3, "branch == null"

    if-eq p1, v1, :cond_4

    const/4 v1, 0x4

    if-eq p1, v1, :cond_3

    const/4 v1, 0x6

    if-ne p1, v1, :cond_2

    new-instance p1, Ljava/util/ArrayList;

    iget-object v1, p0, Lc/a;->i:Ljava/util/ArrayList;

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v1, Lc/g;

    invoke-direct {v1}, Lc/g;-><init>()V

    iget-object v3, v1, Lc/g;->b:Lc/a;

    if-ne v3, p0, :cond_0

    goto :goto_0

    :cond_0
    if-nez v3, :cond_1

    iput-object p0, v1, Lc/g;->b:Lc/a;

    iget-object v3, p0, Lc/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    iget-object v3, p0, Lc/a;->c:Lc/g;

    iput-object v1, v3, Lc/g;->e:Lc/g;

    iput-object v2, v3, Lc/g;->f:Lc/g;

    iput-object p1, v3, Lc/g;->d:Ljava/util/List;

    iput-object v1, p0, Lc/a;->c:Lc/g;

    iput-boolean v0, v1, Lc/g;->c:Z

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot adopt label; it belongs to another Code"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    iput-object v2, p0, Lc/a;->c:Lc/g;

    :cond_6
    :goto_1
    return-void

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "no current label"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static d(Lc/h;Lc/j;)V
    .locals 3

    iget-object v0, p0, Lc/h;->b:Lc/j;

    invoke-virtual {v0, p1}, Lc/j;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "requested "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " but was "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lc/h;->b:Lc/j;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private varargs h(Lj/q;Lc/i;Lc/h;Lc/h;[Lc/h;)V
    .locals 8

    new-instance v6, Lj/t;

    iget-object v2, p0, Lc/a;->h:Lj/s;

    const/4 v7, 0x0

    if-eqz p4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v7

    :goto_0
    new-instance v3, Lj/o;

    array-length v1, p5

    add-int/2addr v1, v0

    invoke-direct {v3, v1}, Lj/o;-><init>(I)V

    if-eqz p4, :cond_1

    invoke-virtual {p4}, Lc/h;->c()Lj/m;

    move-result-object p4

    invoke-virtual {v3, v7, p4}, Lj/o;->x(ILj/m;)V

    :cond_1
    move p4, v7

    :goto_1
    array-length v1, p5

    if-ge p4, v1, :cond_2

    add-int v1, p4, v0

    aget-object v4, p5, p4

    invoke-virtual {v4}, Lc/h;->c()Lj/m;

    move-result-object v4

    invoke-virtual {v3, v1, v4}, Lj/o;->x(ILj/m;)V

    add-int/lit8 p4, p4, 0x1

    goto :goto_1

    :cond_2
    iget-object v4, p0, Lc/a;->j:Ll/b;

    iget-object v5, p2, Lc/i;->e:Lk/q;

    move-object v0, v6

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lj/t;-><init>(Lj/q;Lj/s;Lj/o;Ll/b;Lk/v;)V

    invoke-direct {p0, v6}, Lc/a;->a(Lj/g;)V

    invoke-direct {p0, p3, v7}, Lc/a;->l(Lc/h;Z)V

    return-void
.end method

.method private l(Lc/h;Z)V
    .locals 4

    iget-object v0, p1, Lc/h;->b:Lc/j;

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    iget-object p2, v0, Lc/j;->b:Ll/c;

    sget-object v0, Lj/r;->a:Lj/q;

    new-instance v0, Lj/q;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Ll/b;->c:Ll/b;

    const/16 v3, 0x38

    invoke-direct {v0, v3, p2, v2, v1}, Lj/q;-><init>(ILl/c;Ll/b;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object p2, v0, Lc/j;->b:Ll/c;

    sget-object v0, Lj/r;->a:Lj/q;

    new-instance v0, Lj/q;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Ll/b;->c:Ll/b;

    const/16 v3, 0x37

    invoke-direct {v0, v3, p2, v2, v1}, Lj/q;-><init>(ILl/c;Ll/b;Ljava/lang/String;)V

    :goto_0
    new-instance p2, Lj/j;

    iget-object v1, p0, Lc/a;->h:Lj/s;

    invoke-virtual {p1}, Lc/h;->c()Lj/m;

    move-result-object p1

    sget-object v2, Lj/o;->c:Lj/o;

    invoke-direct {p2, v0, v1, p1, v2}, Lj/j;-><init>(Lj/q;Lj/s;Lj/m;Lj/o;)V

    invoke-direct {p0, p2}, Lc/a;->a(Lj/g;)V

    return-void
.end method


# virtual methods
.method public final b(Lc/h;Lc/h;Lc/h;)V
    .locals 3

    new-instance v0, Lj/u;

    iget-object v1, p3, Lc/h;->b:Lc/j;

    iget-object v1, v1, Lc/j;->b:Ll/c;

    invoke-static {v1}, Lj/r;->a(Ll/c;)Lj/q;

    move-result-object v1

    iget-object v2, p0, Lc/a;->h:Lj/s;

    invoke-virtual {p3}, Lc/h;->c()Lj/m;

    move-result-object p3

    invoke-virtual {p1}, Lc/h;->c()Lj/m;

    move-result-object p1

    invoke-virtual {p2}, Lc/h;->c()Lj/m;

    move-result-object p2

    invoke-static {p3, p1, p2}, Lj/o;->J(Lj/m;Lj/m;Lj/m;)Lj/o;

    move-result-object p1

    iget-object p2, p0, Lc/a;->j:Ll/b;

    invoke-direct {v0, v1, v2, p1, p2}, Lj/u;-><init>(Lj/q;Lj/s;Lj/o;Ll/b;)V

    invoke-direct {p0, v0}, Lc/a;->a(Lj/g;)V

    return-void
.end method

.method public final c(Lc/h;Lc/h;)V
    .locals 9

    iget-object v0, p2, Lc/h;->b:Lc/j;

    iget-object v1, v0, Lc/j;->b:Ll/c;

    invoke-virtual {v1}, Ll/c;->l()Z

    move-result v1

    iget-object v2, p1, Lc/h;->b:Lc/j;

    if-eqz v1, :cond_0

    new-instance v0, Lj/t;

    sget-object v4, Lj/r;->L1:Lj/q;

    iget-object v5, p0, Lc/a;->h:Lj/s;

    invoke-virtual {p2}, Lc/h;->c()Lj/m;

    move-result-object p2

    invoke-static {p2}, Lj/o;->H(Lj/m;)Lj/o;

    move-result-object v6

    iget-object v7, p0, Lc/a;->j:Ll/b;

    iget-object v8, v2, Lc/j;->c:Lk/u;

    move-object v3, v0

    invoke-direct/range {v3 .. v8}, Lj/t;-><init>(Lj/q;Lj/s;Lj/o;Ll/b;Lk/v;)V

    invoke-direct {p0, v0}, Lc/a;->a(Lj/g;)V

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lc/a;->l(Lc/h;Z)V

    goto/16 :goto_5

    :cond_0
    new-instance v1, Lj/j;

    iget-object v0, v0, Lc/j;->b:Ll/c;

    iget-object v2, v2, Lc/j;->b:Ll/c;

    invoke-virtual {v0}, Ll/c;->d()I

    move-result v3

    const/4 v4, 0x6

    if-ne v3, v4, :cond_4

    invoke-virtual {v2}, Ll/c;->d()I

    move-result v3

    const/4 v5, 0x2

    if-eq v3, v5, :cond_3

    const/4 v5, 0x3

    if-eq v3, v5, :cond_2

    const/16 v5, 0x8

    if-eq v3, v5, :cond_1

    goto :goto_0

    :cond_1
    sget-object v0, Lj/r;->Z0:Lj/q;

    goto/16 :goto_4

    :cond_2
    sget-object v0, Lj/r;->Y0:Lj/q;

    goto/16 :goto_4

    :cond_3
    sget-object v0, Lj/r;->X0:Lj/q;

    goto/16 :goto_4

    :cond_4
    :goto_0
    sget-object v3, Lj/r;->a:Lj/q;

    invoke-virtual {v2}, Ll/c;->e()I

    move-result v3

    invoke-virtual {v0}, Ll/c;->e()I

    move-result v5

    const/4 v6, 0x7

    const/4 v7, 0x5

    const/4 v8, 0x4

    if-eq v5, v8, :cond_10

    if-eq v5, v7, :cond_c

    if-eq v5, v4, :cond_5

    if-ne v5, v6, :cond_11

    goto :goto_1

    :cond_5
    if-eq v3, v8, :cond_b

    if-eq v3, v7, :cond_a

    if-eq v3, v6, :cond_9

    :goto_1
    if-eq v3, v8, :cond_8

    if-eq v3, v7, :cond_7

    if-eq v3, v4, :cond_6

    goto :goto_2

    :cond_6
    sget-object v0, Lj/r;->L0:Lj/q;

    goto :goto_4

    :cond_7
    sget-object v0, Lj/r;->S0:Lj/q;

    goto :goto_4

    :cond_8
    sget-object v0, Lj/r;->V0:Lj/q;

    goto :goto_4

    :cond_9
    sget-object v0, Lj/r;->O0:Lj/q;

    goto :goto_4

    :cond_a
    sget-object v0, Lj/r;->R0:Lj/q;

    goto :goto_4

    :cond_b
    sget-object v0, Lj/r;->U0:Lj/q;

    goto :goto_4

    :cond_c
    :goto_2
    if-eq v3, v8, :cond_f

    if-eq v3, v4, :cond_e

    if-eq v3, v6, :cond_d

    goto :goto_3

    :cond_d
    sget-object v0, Lj/r;->P0:Lj/q;

    goto :goto_4

    :cond_e
    sget-object v0, Lj/r;->M0:Lj/q;

    goto :goto_4

    :cond_f
    sget-object v0, Lj/r;->W0:Lj/q;

    goto :goto_4

    :cond_10
    :goto_3
    if-eq v3, v7, :cond_13

    if-eq v3, v4, :cond_12

    if-ne v3, v6, :cond_11

    sget-object v0, Lj/r;->Q0:Lj/q;

    goto :goto_4

    :cond_11
    invoke-static {v2, v0}, Ll/b;->G(Ll/c;Ll/c;)Ll/b;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "bad types: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_12
    sget-object v0, Lj/r;->N0:Lj/q;

    goto :goto_4

    :cond_13
    sget-object v0, Lj/r;->T0:Lj/q;

    :goto_4
    iget-object v2, p0, Lc/a;->h:Lj/s;

    invoke-virtual {p1}, Lc/h;->c()Lj/m;

    move-result-object p1

    invoke-virtual {p2}, Lc/h;->c()Lj/m;

    move-result-object p2

    invoke-static {p2}, Lj/o;->H(Lj/m;)Lj/o;

    move-result-object p2

    invoke-direct {v1, v0, v2, p1, p2}, Lj/j;-><init>(Lj/q;Lj/s;Lj/m;Lj/o;)V

    invoke-direct {p0, v1}, Lc/a;->a(Lj/g;)V

    :goto_5
    return-void
.end method

.method public final e(ILc/j;)Lc/h;
    .locals 1

    iget-object v0, p0, Lc/a;->e:Lc/h;

    if-eqz v0, :cond_0

    add-int/lit8 p1, p1, 0x1

    :cond_0
    iget-object v0, p0, Lc/a;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/h;

    invoke-static {p1, p2}, Lc/a;->d(Lc/h;Lc/j;)V

    return-object p1
.end method

.method public final f(Lc/j;)Lc/h;
    .locals 1

    iget-object v0, p0, Lc/a;->e:Lc/h;

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, Lc/a;->d(Lc/h;Lc/j;)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "static methods cannot access \'this\'"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method final g()V
    .locals 13

    iget-boolean v0, p0, Lc/a;->d:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lc/a;->d:Z

    iget-object v0, p0, Lc/a;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/h;

    invoke-virtual {v3, v2}, Lc/h;->b(I)I

    move-result v3

    add-int/2addr v2, v3

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v3, p0, Lc/a;->f:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v4, v2

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lc/h;

    sub-int v6, v4, v2

    invoke-static {v6}, Lk/j;->j(I)Lk/j;

    move-result-object v12

    invoke-virtual {v5, v4}, Lc/h;->b(I)I

    move-result v6

    add-int/2addr v4, v6

    new-instance v6, Lj/i;

    iget-object v7, v5, Lc/h;->b:Lc/j;

    iget-object v7, v7, Lc/j;->b:Ll/c;

    invoke-static {v7}, Lj/r;->c(Ll/c;)Lj/q;

    move-result-object v8

    iget-object v9, p0, Lc/a;->h:Lj/s;

    invoke-virtual {v5}, Lc/h;->c()Lj/m;

    move-result-object v10

    sget-object v11, Lj/o;->c:Lj/o;

    move-object v7, v6

    invoke-direct/range {v7 .. v12}, Lj/i;-><init>(Lj/q;Lj/s;Lj/m;Lj/o;Lk/v;)V

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lc/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/g;

    iget-object v2, v2, Lc/g;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v1, v0}, Ljava/util/ArrayList;->addAll(ILjava/util/Collection;)Z

    return-void

    :cond_2
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public final varargs i(Lc/i;Lc/h;[Lc/h;)V
    .locals 8

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lc/i;->a(Z)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/a;->f(Ljava/lang/String;)Ll/a;

    move-result-object v0

    sget-object v1, Lj/r;->a:Lj/q;

    new-instance v3, Lj/q;

    invoke-virtual {v0}, Ll/a;->c()Ll/b;

    move-result-object v0

    sget-object v1, Ll/b;->j:Ll/b;

    const/16 v2, 0x31

    invoke-direct {v3, v2, v0, v1}, Lj/q;-><init>(ILl/b;Ll/b;)V

    const/4 v6, 0x0

    move-object v2, p0

    move-object v4, p1

    move-object v5, p2

    move-object v7, p3

    invoke-direct/range {v2 .. v7}, Lc/a;->h(Lj/q;Lc/i;Lc/h;Lc/h;[Lc/h;)V

    return-void
.end method

.method public final varargs j(Lc/i;Lc/h;Lc/h;[Lc/h;)V
    .locals 8

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lc/i;->a(Z)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/a;->f(Ljava/lang/String;)Ll/a;

    move-result-object v0

    sget-object v1, Lj/r;->a:Lj/q;

    new-instance v3, Lj/q;

    invoke-virtual {v0}, Ll/a;->c()Ll/b;

    move-result-object v0

    sget-object v1, Ll/b;->j:Ll/b;

    const/16 v2, 0x32

    invoke-direct {v3, v2, v0, v1}, Lj/q;-><init>(ILl/b;Ll/b;)V

    move-object v2, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    invoke-direct/range {v2 .. v7}, Lc/a;->h(Lj/q;Lc/i;Lc/h;Lc/h;[Lc/h;)V

    return-void
.end method

.method public final k(Lc/h;Ljava/lang/Integer;)V
    .locals 8

    if-nez p2, :cond_0

    sget-object v0, Lj/r;->q:Lj/q;

    goto :goto_0

    :cond_0
    iget-object v0, p1, Lc/h;->b:Lc/j;

    iget-object v0, v0, Lc/j;->b:Ll/c;

    invoke-static {v0}, Lj/r;->b(Ll/c;)Lj/q;

    move-result-object v0

    :goto_0
    move-object v2, v0

    invoke-virtual {v2}, Lj/q;->b()I

    move-result v0

    const/4 v7, 0x1

    if-ne v0, v7, :cond_1

    new-instance v0, Lj/i;

    iget-object v3, p0, Lc/a;->h:Lj/s;

    invoke-virtual {p1}, Lc/h;->c()Lj/m;

    move-result-object v4

    sget-object v5, Lj/o;->c:Lj/o;

    invoke-static {p2}, Lc/b;->a(Ljava/lang/Integer;)Lk/v;

    move-result-object v6

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lj/i;-><init>(Lj/q;Lj/s;Lj/m;Lj/o;Lk/v;)V

    invoke-direct {p0, v0}, Lc/a;->a(Lj/g;)V

    goto :goto_1

    :cond_1
    new-instance v0, Lj/t;

    iget-object v3, p0, Lc/a;->h:Lj/s;

    sget-object v4, Lj/o;->c:Lj/o;

    iget-object v5, p0, Lc/a;->j:Ll/b;

    invoke-static {p2}, Lc/b;->a(Ljava/lang/Integer;)Lk/v;

    move-result-object v6

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lj/t;-><init>(Lj/q;Lj/s;Lj/o;Ll/b;Lk/v;)V

    invoke-direct {p0, v0}, Lc/a;->a(Lj/g;)V

    invoke-direct {p0, p1, v7}, Lc/a;->l(Lc/h;Z)V

    :goto_1
    return-void
.end method

.method public final m(Lc/h;Lc/h;)V
    .locals 7

    new-instance v6, Lj/t;

    iget-object v0, p1, Lc/h;->b:Lc/j;

    iget-object v1, v0, Lc/j;->b:Ll/c;

    invoke-static {v1}, Lj/r;->d(Ll/c;)Lj/q;

    move-result-object v1

    iget-object v2, p0, Lc/a;->h:Lj/s;

    invoke-virtual {p2}, Lc/h;->c()Lj/m;

    move-result-object p2

    invoke-static {p2}, Lj/o;->H(Lj/m;)Lj/o;

    move-result-object v3

    iget-object v4, p0, Lc/a;->j:Ll/b;

    iget-object v5, v0, Lc/j;->c:Lk/u;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lj/t;-><init>(Lj/q;Lj/s;Lj/o;Ll/b;Lk/v;)V

    invoke-direct {p0, v6}, Lc/a;->a(Lj/g;)V

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lc/a;->l(Lc/h;Z)V

    return-void
.end method

.method public final n(Lc/j;)Lc/h;
    .locals 1

    iget-boolean v0, p0, Lc/a;->d:Z

    if-nez v0, :cond_0

    invoke-static {p0, p1}, Lc/h;->a(Lc/a;Lc/j;)Lc/h;

    move-result-object p1

    iget-object v0, p0, Lc/a;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot allocate locals after adding instructions"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method final o()I
    .locals 3

    iget-object v0, p0, Lc/a;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/h;

    iget-object v2, v2, Lc/h;->b:Lc/j;

    iget-object v2, v2, Lc/j;->b:Ll/c;

    invoke-virtual {v2}, Ll/c;->f()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    :cond_0
    return v1
.end method

.method public final p(Lc/h;)V
    .locals 4

    iget-object v0, p0, Lc/a;->a:Lc/i;

    iget-object v1, v0, Lc/i;->b:Lc/j;

    iget-object v2, p1, Lc/h;->b:Lc/j;

    invoke-virtual {v2, v1}, Lc/j;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v0, Lj/j;

    iget-object v1, v2, Lc/j;->b:Ll/c;

    invoke-static {v1}, Lj/r;->e(Ll/c;)Lj/q;

    move-result-object v1

    iget-object v2, p0, Lc/a;->h:Lj/s;

    invoke-virtual {p1}, Lc/h;->c()Lj/m;

    move-result-object p1

    invoke-static {p1}, Lj/o;->H(Lj/m;)Lj/o;

    move-result-object p1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3, p1}, Lj/j;-><init>(Lj/q;Lj/s;Lj/m;Lj/o;)V

    invoke-direct {p0, v0}, Lc/a;->a(Lj/g;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "declared "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, Lc/i;->b:Lc/j;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " but returned "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final q()V
    .locals 5

    iget-object v0, p0, Lc/a;->a:Lc/i;

    iget-object v1, v0, Lc/i;->b:Lc/j;

    sget-object v2, Lc/j;->l:Lc/j;

    invoke-virtual {v1, v2}, Lc/j;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v0, Lj/j;

    sget-object v1, Lj/r;->a1:Lj/q;

    iget-object v2, p0, Lc/a;->h:Lj/s;

    const/4 v3, 0x0

    sget-object v4, Lj/o;->c:Lj/o;

    invoke-direct {v0, v1, v2, v3, v4}, Lj/j;-><init>(Lj/q;Lj/s;Lj/m;Lj/o;)V

    invoke-direct {p0, v0}, Lc/a;->a(Lj/g;)V

    return-void

    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "declared "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, Lc/i;->b:Lc/j;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " but returned void"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method final r()Lj/c;
    .locals 9

    iget-boolean v0, p0, Lc/a;->d:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lc/a;->g()V

    :cond_0
    iget-object v0, p0, Lc/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc/g;

    iget-object v5, v4, Lc/g;->a:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    move v5, v2

    :goto_1
    iget-object v6, v4, Lc/g;->d:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_3

    :goto_2
    iget-object v6, v4, Lc/g;->d:Ljava/util/List;

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lc/g;

    iget-object v6, v6, Lc/g;->a:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_2

    iget-object v6, v4, Lc/g;->d:Ljava/util/List;

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lc/g;

    iget-object v7, v7, Lc/g;->e:Lc/g;

    invoke-interface {v6, v5, v7}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_3
    :goto_3
    iget-object v5, v4, Lc/g;->e:Lc/g;

    if-eqz v5, :cond_4

    iget-object v5, v5, Lc/g;->a:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_4

    iget-object v5, v4, Lc/g;->e:Lc/g;

    iget-object v5, v5, Lc/g;->e:Lc/g;

    iput-object v5, v4, Lc/g;->e:Lc/g;

    goto :goto_3

    :cond_4
    :goto_4
    iget-object v5, v4, Lc/g;->f:Lc/g;

    if-eqz v5, :cond_5

    iget-object v5, v5, Lc/g;->a:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_5

    iget-object v5, v4, Lc/g;->f:Lc/g;

    iget-object v5, v5, Lc/g;->e:Lc/g;

    iput-object v5, v4, Lc/g;->f:Lc/g;

    goto :goto_4

    :cond_5
    add-int/lit8 v5, v3, 0x1

    iput v3, v4, Lc/g;->g:I

    move v3, v5

    goto :goto_0

    :cond_6
    new-instance v1, Lj/c;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-direct {v1, v3}, Lj/c;-><init>(I)V

    move v3, v2

    :goto_5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_b

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc/g;

    new-instance v5, Lj/h;

    iget-object v6, v4, Lc/g;->a:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v7

    invoke-direct {v5, v7}, Lj/h;-><init>(I)V

    move v7, v2

    :goto_6
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-ge v7, v8, :cond_7

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lj/g;

    invoke-virtual {v5, v7, v8}, Lj/h;->w(ILj/g;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_6

    :cond_7
    invoke-virtual {v5}, Ln/j;->g()V

    new-instance v6, Ln/g;

    const/4 v7, 0x4

    invoke-direct {v6, v7}, Ln/g;-><init>(I)V

    iget-object v7, v4, Lc/g;->d:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_7
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lc/g;

    iget v8, v8, Lc/g;->g:I

    invoke-virtual {v6, v8}, Ln/g;->j(I)V

    goto :goto_7

    :cond_8
    iget-object v7, v4, Lc/g;->e:Lc/g;

    if-eqz v7, :cond_9

    iget v7, v7, Lc/g;->g:I

    invoke-virtual {v6, v7}, Ln/g;->j(I)V

    goto :goto_8

    :cond_9
    const/4 v7, -0x1

    :goto_8
    iget-object v8, v4, Lc/g;->f:Lc/g;

    if-eqz v8, :cond_a

    iget v8, v8, Lc/g;->g:I

    invoke-virtual {v6, v8}, Ln/g;->j(I)V

    :cond_a
    invoke-virtual {v6}, Ln/j;->g()V

    new-instance v8, Lj/a;

    iget v4, v4, Lc/g;->g:I

    invoke-direct {v8, v4, v5, v6, v7}, Lj/a;-><init>(ILj/h;Ln/g;I)V

    invoke-virtual {v1, v3, v8}, Lj/c;->L(ILj/a;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_b
    return-object v1
.end method
