.class public final Le/x;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ld/a;

.field private final b:I

.field private c:Ljava/util/ArrayList;

.field private d:Z

.field private e:I

.field private f:I

.field private final g:I


# direct methods
.method public constructor <init>(Ld/a;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/x;->a:Ld/a;

    iput p3, p0, Le/x;->b:I

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Le/x;->c:Ljava/util/ArrayList;

    const/4 p1, -0x1

    iput p1, p0, Le/x;->e:I

    const/4 p1, 0x0

    iput-boolean p1, p0, Le/x;->d:Z

    iput p4, p0, Le/x;->g:I

    return-void
.end method

.method private b()V
    .locals 5

    iget-object v0, p0, Le/x;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x1

    if-ge v1, v0, :cond_1

    iget-object v3, p0, Le/x;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le/j;

    instance-of v4, v3, Le/f;

    if-nez v4, :cond_0

    iget-object v4, p0, Le/x;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Le/j;->v(I)Le/j;

    move-result-object v2

    invoke-virtual {v4, v1, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget v0, p0, Le/x;->e:I

    add-int/2addr v0, v2

    iput v0, p0, Le/x;->e:I

    return-void
.end method

.method private d(Le/j;)Le/l;
    .locals 3

    invoke-virtual {p1}, Le/j;->i()Le/j;

    move-result-object v0

    invoke-virtual {p1}, Le/j;->k()Le/l;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Le/x;->e(Le/j;Le/l;)Le/l;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, La/a;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "No expanded opcode for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, La/a;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private e(Le/j;Le/l;)Le/l;
    .locals 1

    :goto_0
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Le/l;->b()Le/p;

    move-result-object v0

    invoke-virtual {v0, p1}, Le/p;->i(Le/j;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Le/x;->a:Ld/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_1

    :cond_0
    invoke-static {p2}, Le/m;->a(Le/l;)Le/l;

    move-result-object p2

    goto :goto_0

    :cond_1
    :goto_1
    return-object p2
.end method

.method private k([Le/l;)Z
    .locals 9

    iget v0, p0, Le/x;->e:I

    const/4 v1, 0x0

    if-gez v0, :cond_0

    move v0, v1

    :cond_0
    move v2, v1

    :goto_0
    iget-object v3, p0, Le/x;->c:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    iget v4, p0, Le/x;->e:I

    move v5, v1

    :goto_1
    if-ge v5, v3, :cond_3

    iget-object v6, p0, Le/x;->c:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Le/j;

    aget-object v7, p1, v5

    invoke-direct {p0, v6, v7}, Le/x;->e(Le/j;Le/l;)Le/l;

    move-result-object v8

    if-nez v8, :cond_1

    invoke-direct {p0, v6}, Le/x;->d(Le/j;)Le/l;

    move-result-object v7

    invoke-virtual {v7}, Le/l;->b()Le/p;

    move-result-object v7

    invoke-virtual {v7, v6}, Le/p;->f(Le/j;)Ljava/util/BitSet;

    move-result-object v7

    invoke-virtual {v6, v7}, Le/j;->j(Ljava/util/BitSet;)I

    move-result v6

    if-le v6, v4, :cond_2

    move v4, v6

    goto :goto_2

    :cond_1
    if-ne v7, v8, :cond_2

    goto :goto_3

    :cond_2
    :goto_2
    aput-object v8, p1, v5

    :goto_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_3
    if-lt v0, v4, :cond_4

    iput v0, p0, Le/x;->e:I

    return v2

    :cond_4
    sub-int v0, v4, v0

    iget-object v2, p0, Le/x;->c:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    move v3, v1

    :goto_4
    if-ge v3, v2, :cond_6

    iget-object v5, p0, Le/x;->c:Ljava/util/ArrayList;

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Le/j;

    instance-of v6, v5, Le/f;

    if-nez v6, :cond_5

    iget-object v6, p0, Le/x;->c:Ljava/util/ArrayList;

    invoke-virtual {v5, v0}, Le/j;->v(I)Le/j;

    move-result-object v5

    invoke-virtual {v6, v3, v5}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_6
    const/4 v2, 0x1

    move v0, v4

    goto :goto_0
.end method


# virtual methods
.method public final a(Le/j;)V
    .locals 4

    iget-object v0, p0, Le/x;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-boolean v0, p0, Le/x;->d:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Le/j;->l()Lj/s;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    instance-of v0, p1, Le/u;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    check-cast p1, Le/u;

    invoke-virtual {p1}, Le/u;->y()Lj/p;

    move-result-object p1

    invoke-virtual {p1}, Lj/p;->p()I

    move-result v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_4

    invoke-virtual {p1, v2}, Lj/p;->k(I)Lj/m;

    move-result-object v3

    if-nez v3, :cond_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    throw v1

    :cond_2
    instance-of v0, p1, Le/v;

    if-eqz v0, :cond_4

    check-cast p1, Le/v;

    invoke-virtual {p1}, Le/v;->y()Lj/m;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    throw v1

    :cond_4
    :goto_1
    return-void
.end method

.method public final c(Le/h;)V
    .locals 4

    iget-object v0, p0, Le/x;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/j;

    instance-of v2, v1, Le/g;

    if-eqz v2, :cond_0

    check-cast v1, Le/g;

    invoke-virtual {v1}, Le/g;->y()Lk/a;

    move-result-object v2

    invoke-interface {p1, v2}, Le/h;->a(Lk/a;)I

    move-result v3

    if-ltz v3, :cond_1

    invoke-virtual {v1, v3}, Le/g;->B(I)V

    :cond_1
    instance-of v3, v2, Lk/p;

    if-eqz v3, :cond_0

    check-cast v2, Lk/p;

    invoke-virtual {v2}, Lk/p;->g()Lk/u;

    move-result-object v2

    invoke-interface {p1, v2}, Le/h;->a(Lk/a;)I

    move-result v2

    if-ltz v2, :cond_0

    invoke-virtual {v1, v2}, Le/g;->A(I)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final f()Le/k;
    .locals 15

    iget v0, p0, Le/x;->e:I

    if-gez v0, :cond_22

    iget-object v0, p0, Le/x;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v1, v0, [Le/l;

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_0

    iget-object v4, p0, Le/x;->c:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le/j;

    invoke-virtual {v4}, Le/j;->k()Le/l;

    move-result-object v4

    aput-object v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-direct {p0, v1}, Le/x;->k([Le/l;)Z

    iget-object v0, p0, Le/x;->a:Ld/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_1
    iget v0, p0, Le/x;->e:I

    iget v3, p0, Le/x;->b:I

    add-int/2addr v0, v3

    iget v4, p0, Le/x;->f:I

    add-int/2addr v0, v4

    iget v4, p0, Le/x;->g:I

    sub-int/2addr v0, v4

    iget-object v5, p0, Le/x;->c:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v6, v2

    move v7, v6

    move v8, v7

    move v9, v8

    :cond_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    const/4 v11, 0x1

    if-eqz v10, :cond_8

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Le/j;

    invoke-virtual {v10}, Le/j;->m()Lj/o;

    move-result-object v10

    move v12, v2

    :goto_1
    invoke-virtual {v10}, Ln/e;->B()I

    move-result v13

    if-ge v12, v13, :cond_2

    invoke-virtual {v10, v12}, Lj/o;->p(I)Lj/m;

    move-result-object v13

    invoke-virtual {v13}, Lj/m;->k()Z

    move-result v14

    if-eqz v14, :cond_7

    invoke-virtual {v13}, Lj/m;->i()I

    move-result v14

    if-lt v14, v0, :cond_3

    move v14, v11

    goto :goto_2

    :cond_3
    move v14, v2

    :goto_2
    invoke-virtual {v13}, Lj/m;->l()Z

    move-result v13

    if-eqz v13, :cond_5

    if-eqz v14, :cond_4

    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_4
    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    :cond_5
    if-eqz v14, :cond_6

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_6
    add-int/lit8 v8, v8, 0x1

    :cond_7
    :goto_3
    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    :cond_8
    if-le v6, v7, :cond_9

    if-le v8, v9, :cond_9

    invoke-direct {p0}, Le/x;->b()V

    goto :goto_8

    :cond_9
    if-le v6, v7, :cond_a

    goto :goto_4

    :cond_a
    if-le v8, v9, :cond_10

    invoke-direct {p0}, Le/x;->b()V

    if-eqz v4, :cond_f

    if-le v7, v6, :cond_f

    :goto_4
    iget-object v0, p0, Le/x;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v5, p0, Le/x;->e:I

    add-int/2addr v5, v3

    iget v6, p0, Le/x;->f:I

    add-int/2addr v5, v6

    sub-int v4, v5, v4

    new-instance v6, Lm/a;

    invoke-direct {v6, v5}, Lm/a;-><init>(I)V

    move v7, v2

    :goto_5
    if-ge v7, v5, :cond_c

    if-lt v7, v4, :cond_b

    add-int/lit8 v8, v7, 0x1

    invoke-virtual {v6, v7, v8}, Lm/a;->a(II)V

    goto :goto_6

    :cond_b
    invoke-virtual {v6, v7, v7}, Lm/a;->a(II)V

    :goto_6
    add-int/lit8 v7, v7, 0x1

    goto :goto_5

    :cond_c
    move v4, v2

    :goto_7
    if-ge v4, v0, :cond_e

    iget-object v5, p0, Le/x;->c:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Le/j;

    instance-of v7, v5, Le/f;

    if-nez v7, :cond_d

    iget-object v7, p0, Le/x;->c:Ljava/util/ArrayList;

    invoke-virtual {v5, v6}, Le/j;->t(Lm/a;)Le/j;

    move-result-object v5

    invoke-virtual {v7, v4, v5}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_d
    add-int/lit8 v4, v4, 0x1

    goto :goto_7

    :cond_e
    iget v0, p0, Le/x;->f:I

    add-int/2addr v0, v11

    iput v0, p0, Le/x;->f:I

    :cond_f
    :goto_8
    invoke-direct {p0, v1}, Le/x;->k([Le/l;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_10
    iget v0, p0, Le/x;->e:I

    if-nez v0, :cond_12

    iget-object v0, p0, Le/x;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    move v4, v2

    :goto_9
    if-ge v4, v0, :cond_1b

    iget-object v5, p0, Le/x;->c:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Le/j;

    invoke-virtual {v5}, Le/j;->k()Le/l;

    move-result-object v6

    aget-object v7, v1, v4

    if-eq v6, v7, :cond_11

    iget-object v6, p0, Le/x;->c:Ljava/util/ArrayList;

    invoke-virtual {v5, v7}, Le/j;->u(Le/l;)Le/j;

    move-result-object v5

    invoke-virtual {v6, v4, v5}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_11
    add-int/lit8 v4, v4, 0x1

    goto :goto_9

    :cond_12
    iget-object v0, p0, Le/x;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-instance v4, Ljava/util/ArrayList;

    mul-int/lit8 v5, v0, 0x2

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    move v6, v2

    :goto_a
    if-ge v6, v0, :cond_1a

    iget-object v7, p0, Le/x;->c:Ljava/util/ArrayList;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Le/j;

    invoke-virtual {v7}, Le/j;->k()Le/l;

    move-result-object v8

    aget-object v9, v1, v6

    if-eqz v9, :cond_13

    const/4 v10, 0x0

    move-object v13, v10

    goto :goto_b

    :cond_13
    invoke-direct {p0, v7}, Le/x;->d(Le/j;)Le/l;

    move-result-object v9

    invoke-virtual {v9}, Le/l;->b()Le/p;

    move-result-object v10

    invoke-virtual {v10, v7}, Le/p;->f(Le/j;)Ljava/util/BitSet;

    move-result-object v10

    invoke-virtual {v7, v10}, Le/j;->e(Ljava/util/BitSet;)Le/o;

    move-result-object v12

    invoke-virtual {v7, v10}, Le/j;->f(Ljava/util/BitSet;)Le/E;

    move-result-object v13

    invoke-virtual {v7, v10}, Le/j;->g(Ljava/util/BitSet;)Le/j;

    move-result-object v7

    move-object v10, v12

    :goto_b
    instance-of v12, v7, Le/f;

    if-eqz v12, :cond_14

    move-object v12, v7

    check-cast v12, Le/f;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_14
    if-eqz v10, :cond_15

    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_15
    instance-of v10, v7, Le/G;

    if-nez v10, :cond_17

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v10

    if-lez v10, :cond_17

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_c
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_16

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Le/f;

    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_c

    :cond_16
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    :cond_17
    if-eq v9, v8, :cond_18

    invoke-virtual {v7, v9}, Le/j;->u(Le/l;)Le/j;

    move-result-object v7

    :cond_18
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v13, :cond_19

    invoke-virtual {v4, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_19
    add-int/lit8 v6, v6, 0x1

    goto :goto_a

    :cond_1a
    iput-object v4, p0, Le/x;->c:Ljava/util/ArrayList;

    :cond_1b
    iget-object v0, p0, Le/x;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    move v1, v2

    move v4, v1

    :goto_d
    if-ge v1, v0, :cond_1c

    iget-object v5, p0, Le/x;->c:Ljava/util/ArrayList;

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Le/j;

    invoke-virtual {v5, v4}, Le/j;->s(I)V

    invoke-virtual {v5}, Le/j;->b()I

    move-result v5

    add-int/2addr v4, v5

    add-int/lit8 v1, v1, 0x1

    goto :goto_d

    :cond_1c
    iget-object v0, p0, Le/x;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    move v1, v2

    move v4, v1

    :goto_e
    if-ge v1, v0, :cond_21

    iget-object v5, p0, Le/x;->c:Ljava/util/ArrayList;

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Le/j;

    instance-of v6, v5, Le/F;

    if-nez v6, :cond_1d

    goto :goto_10

    :cond_1d
    invoke-virtual {v5}, Le/j;->k()Le/l;

    move-result-object v6

    move-object v7, v5

    check-cast v7, Le/F;

    invoke-virtual {v6}, Le/l;->b()Le/p;

    move-result-object v8

    invoke-virtual {v8, v7}, Le/p;->b(Le/F;)Z

    move-result v8

    if-eqz v8, :cond_1e

    goto :goto_10

    :cond_1e
    invoke-virtual {v6}, Le/l;->a()I

    move-result v4

    const/16 v8, 0x28

    if-ne v4, v8, :cond_20

    invoke-direct {p0, v5, v6}, Le/x;->e(Le/j;Le/l;)Le/l;

    move-result-object v4

    if-eqz v4, :cond_1f

    iget-object v6, p0, Le/x;->c:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Le/j;->u(Le/l;)Le/j;

    move-result-object v4

    invoke-virtual {v6, v1, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_f

    :cond_1f
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "method too long"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_20
    :try_start_0
    iget-object v4, p0, Le/x;->c:Ljava/util/ArrayList;

    add-int/lit8 v5, v1, 0x1

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le/f;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v6, Le/F;

    sget-object v8, Le/m;->I:Le/l;

    invoke-virtual {v7}, Le/j;->l()Lj/s;

    move-result-object v9

    sget-object v10, Lj/o;->c:Lj/o;

    invoke-virtual {v7}, Le/F;->y()Le/f;

    move-result-object v12

    invoke-direct {v6, v8, v9, v10, v12}, Le/F;-><init>(Le/l;Lj/s;Lj/o;Le/f;)V

    iget-object v8, p0, Le/x;->c:Ljava/util/ArrayList;

    invoke-virtual {v8, v1, v6}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    iget-object v6, p0, Le/x;->c:Ljava/util/ArrayList;

    invoke-virtual {v7}, Le/j;->k()Le/l;

    move-result-object v8

    invoke-virtual {v8}, Le/l;->f()Le/l;

    move-result-object v8

    new-instance v9, Le/F;

    invoke-virtual {v7}, Le/j;->l()Lj/s;

    move-result-object v10

    invoke-virtual {v7}, Le/j;->m()Lj/o;

    move-result-object v7

    invoke-direct {v9, v8, v10, v7, v4}, Le/F;-><init>(Le/l;Lj/s;Lj/o;Le/f;)V

    invoke-virtual {v6, v1, v9}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    move v1, v5

    :goto_f
    move v4, v11

    :goto_10
    add-int/2addr v1, v11

    goto/16 :goto_e

    :catch_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "unpaired TargetInsn"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "unpaired TargetInsn (dangling)"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_21
    if-nez v4, :cond_1b

    iget-object v0, p0, Le/x;->c:Ljava/util/ArrayList;

    iget v1, p0, Le/x;->e:I

    add-int/2addr v1, v3

    iget v2, p0, Le/x;->f:I

    add-int/2addr v1, v2

    invoke-static {v1, v0}, Le/k;->I(ILjava/util/ArrayList;)Le/k;

    move-result-object v0

    return-object v0

    :cond_22
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "already processed"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final g(I)Le/j;
    .locals 1

    iget-object v0, p0, Le/x;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/j;

    return-object p1
.end method

.method public final h()Ljava/util/HashSet;
    .locals 7

    new-instance v0, Ljava/util/HashSet;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    iget-object v1, p0, Le/x;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le/j;

    instance-of v3, v2, Le/g;

    if-eqz v3, :cond_1

    check-cast v2, Le/g;

    invoke-virtual {v2}, Le/g;->y()Lk/a;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    instance-of v3, v2, Le/u;

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    check-cast v2, Le/u;

    invoke-virtual {v2}, Le/u;->y()Lj/p;

    move-result-object v2

    invoke-virtual {v2}, Lj/p;->p()I

    move-result v3

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v3, :cond_0

    invoke-virtual {v2, v5}, Lj/p;->k(I)Lj/m;

    move-result-object v6

    if-nez v6, :cond_2

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    throw v4

    :cond_3
    instance-of v3, v2, Le/v;

    if-eqz v3, :cond_0

    check-cast v2, Le/v;

    invoke-virtual {v2}, Le/v;->y()Lj/m;

    move-result-object v2

    if-nez v2, :cond_4

    goto :goto_0

    :cond_4
    throw v4

    :cond_5
    return-object v0
.end method

.method public final i()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final j()Z
    .locals 1

    iget-boolean v0, p0, Le/x;->d:Z

    return v0
.end method

.method public final l(Le/f;)V
    .locals 6

    iget-object v0, p0, Le/x;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    add-int/lit8 v0, v0, -0x1

    :try_start_0
    iget-object v1, p0, Le/x;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/F;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v2, p0, Le/x;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Le/j;->k()Le/l;

    move-result-object v3

    invoke-virtual {v3}, Le/l;->f()Le/l;

    move-result-object v3

    new-instance v4, Le/F;

    invoke-virtual {v1}, Le/j;->l()Lj/s;

    move-result-object v5

    invoke-virtual {v1}, Le/j;->m()Lj/o;

    move-result-object v1

    invoke-direct {v4, v3, v5, v1, p1}, Le/F;-><init>(Le/l;Lj/s;Lj/o;Le/f;)V

    invoke-virtual {v2, v0, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void

    :catch_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "non-reversible instruction"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "too few instructions"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final m()I
    .locals 1

    iget-object v0, p0, Le/x;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method
