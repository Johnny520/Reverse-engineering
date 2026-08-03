.class public final Le/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Ljava/lang/Object;

.field private final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lh/b;)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lh/b;->a()Lj/c;

    move-result-object v0

    invoke-virtual {v0}, Ln/i;->F()I

    move-result v0

    new-array v1, v0, [Le/f;

    iput-object v1, p0, Le/a;->a:Ljava/lang/Object;

    new-array v1, v0, [Le/f;

    iput-object v1, p0, Le/a;->b:Ljava/lang/Object;

    new-array v0, v0, [Le/f;

    iput-object v0, p0, Le/a;->c:Ljava/lang/Object;

    .line 1
    invoke-virtual {p1}, Lh/b;->a()Lj/c;

    move-result-object p1

    invoke-virtual {p1}, Ln/e;->B()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_0

    invoke-virtual {p1, v2}, Lj/c;->n(I)Lj/a;

    move-result-object v3

    invoke-virtual {v3}, Lj/a;->c()I

    move-result v4

    invoke-virtual {v3}, Lj/a;->b()Lj/h;

    move-result-object v5

    invoke-virtual {v5, v1}, Lj/h;->o(I)Lj/g;

    move-result-object v5

    iget-object v6, p0, Le/a;->a:Ljava/lang/Object;

    check-cast v6, [Le/f;

    new-instance v7, Le/f;

    invoke-virtual {v5}, Lj/g;->i()Lj/s;

    move-result-object v5

    invoke-direct {v7, v5}, Le/f;-><init>(Lj/s;)V

    aput-object v7, v6, v4

    invoke-virtual {v3}, Lj/a;->d()Lj/g;

    move-result-object v3

    invoke-virtual {v3}, Lj/g;->i()Lj/s;

    move-result-object v3

    iget-object v5, p0, Le/a;->b:Ljava/lang/Object;

    check-cast v5, [Le/f;

    new-instance v6, Le/f;

    invoke-direct {v6, v3}, Le/f;-><init>(Lj/s;)V

    aput-object v6, v5, v4

    iget-object v5, p0, Le/a;->c:Ljava/lang/Object;

    check-cast v5, [Le/f;

    new-instance v6, Le/f;

    invoke-direct {v6, v3}, Le/f;-><init>(Lj/s;)V

    aput-object v6, v5, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>(Lh/b;[ILe/a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_2

    if-eqz p2, :cond_1

    if-eqz p3, :cond_0

    iput-object p1, p0, Le/a;->a:Ljava/lang/Object;

    iput-object p2, p0, Le/a;->b:Ljava/lang/Object;

    iput-object p3, p0, Le/a;->c:Ljava/lang/Object;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "addresses == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "order == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "method == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a()Le/e;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Le/a;->a:Ljava/lang/Object;

    check-cast v1, Lh/b;

    iget-object v2, v0, Le/a;->b:Ljava/lang/Object;

    check-cast v2, [I

    iget-object v3, v0, Le/a;->c:Ljava/lang/Object;

    check-cast v3, Le/a;

    array-length v4, v2

    invoke-virtual {v1}, Lh/b;->a()Lj/c;

    move-result-object v1

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(I)V

    sget-object v6, Le/c;->c:Le/c;

    const/4 v7, 0x0

    move-object v9, v7

    const/4 v10, 0x0

    :goto_0
    if-ge v10, v4, :cond_d

    aget v11, v2, v10

    invoke-virtual {v1, v11}, Lj/c;->K(I)Lj/a;

    move-result-object v11

    invoke-virtual {v11}, Lj/a;->a()Z

    move-result v12

    if-nez v12, :cond_0

    move-object/from16 v16, v1

    goto/16 :goto_8

    :cond_0
    invoke-virtual {v11}, Lj/a;->g()Ln/g;

    move-result-object v12

    invoke-virtual {v12}, Ln/g;->o()I

    move-result v13

    invoke-virtual {v11}, Lj/a;->e()I

    move-result v14

    invoke-virtual {v11}, Lj/a;->d()Lj/g;

    move-result-object v15

    invoke-virtual {v15}, Lj/g;->f()Ll/e;

    move-result-object v15

    move-object/from16 v16, v15

    check-cast v16, Ln/e;

    invoke-virtual/range {v16 .. v16}, Ln/e;->B()I

    move-result v8

    if-nez v8, :cond_1

    sget-object v8, Le/c;->c:Le/c;

    move-object/from16 v16, v1

    goto :goto_5

    :cond_1
    const/4 v0, -0x1

    if-ne v14, v0, :cond_2

    if-ne v13, v8, :cond_3

    :cond_2
    if-eq v14, v0, :cond_4

    add-int/lit8 v0, v8, 0x1

    if-ne v13, v0, :cond_3

    invoke-virtual {v12, v8}, Ln/g;->l(I)I

    move-result v0

    if-ne v14, v0, :cond_3

    goto :goto_1

    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "shouldn\'t happen: weird successors list"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_1
    const/4 v0, 0x0

    :goto_2
    if-ge v0, v8, :cond_6

    invoke-interface {v15, v0}, Ll/e;->b(I)Ll/c;

    move-result-object v13

    sget-object v14, Ll/c;->u:Ll/c;

    invoke-virtual {v13, v14}, Ll/c;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_5

    add-int/lit8 v8, v0, 0x1

    goto :goto_3

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_6
    :goto_3
    new-instance v0, Le/c;

    invoke-direct {v0, v8}, Le/c;-><init>(I)V

    const/4 v13, 0x0

    :goto_4
    if-ge v13, v8, :cond_7

    new-instance v14, Lk/u;

    move-object/from16 v16, v1

    invoke-interface {v15, v13}, Ll/e;->b(I)Ll/c;

    move-result-object v1

    invoke-direct {v14, v1}, Lk/u;-><init>(Ll/c;)V

    invoke-virtual {v12, v13}, Ln/g;->l(I)I

    move-result v1

    invoke-virtual {v3, v1}, Le/a;->e(I)Le/f;

    move-result-object v1

    invoke-virtual {v1}, Le/j;->h()I

    move-result v1

    invoke-virtual {v0, v13, v14, v1}, Le/c;->G(ILk/u;I)V

    add-int/lit8 v13, v13, 0x1

    move-object/from16 v1, v16

    goto :goto_4

    :cond_7
    move-object/from16 v16, v1

    invoke-virtual {v0}, Ln/j;->g()V

    move-object v8, v0

    :goto_5
    invoke-virtual {v6}, Ln/e;->B()I

    move-result v0

    if-nez v0, :cond_8

    goto :goto_7

    :cond_8
    invoke-virtual {v6, v8}, Ln/e;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    if-eqz v7, :cond_a

    invoke-virtual {v3, v7}, Le/a;->d(Lj/a;)Le/f;

    move-result-object v0

    invoke-virtual {v0}, Le/j;->h()I

    move-result v0

    invoke-virtual {v3, v11}, Le/a;->c(Lj/a;)Le/f;

    move-result-object v1

    invoke-virtual {v1}, Le/j;->h()I

    move-result v1

    sub-int/2addr v1, v0

    const v0, 0xffff

    if-gt v1, v0, :cond_9

    const/4 v0, 0x1

    goto :goto_6

    :cond_9
    const/4 v0, 0x0

    :goto_6
    if-eqz v0, :cond_b

    move-object v9, v11

    goto :goto_8

    :cond_a
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "start == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    invoke-virtual {v6}, Ln/e;->B()I

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual {v3, v7}, Le/a;->d(Lj/a;)Le/f;

    move-result-object v0

    invoke-virtual {v3, v9}, Le/a;->c(Lj/a;)Le/f;

    move-result-object v1

    new-instance v7, Le/d;

    invoke-virtual {v0}, Le/j;->h()I

    move-result v0

    invoke-virtual {v1}, Le/j;->h()I

    move-result v1

    invoke-direct {v7, v0, v1, v6}, Le/d;-><init>(IILe/c;)V

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_c
    :goto_7
    move-object v6, v8

    move-object v7, v11

    move-object v9, v7

    :goto_8
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, v16

    goto/16 :goto_0

    :cond_d
    invoke-virtual {v6}, Ln/e;->B()I

    move-result v0

    if-eqz v0, :cond_e

    invoke-virtual {v3, v7}, Le/a;->d(Lj/a;)Le/f;

    move-result-object v0

    invoke-virtual {v3, v9}, Le/a;->c(Lj/a;)Le/f;

    move-result-object v1

    new-instance v2, Le/d;

    invoke-virtual {v0}, Le/j;->h()I

    move-result v0

    invoke-virtual {v1}, Le/j;->h()I

    move-result v1

    invoke-direct {v2, v0, v1, v6}, Le/d;-><init>(IILe/c;)V

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_e
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_f

    sget-object v0, Le/e;->c:Le/e;

    goto :goto_a

    :cond_f
    new-instance v1, Le/e;

    invoke-direct {v1, v0}, Le/e;-><init>(I)V

    const/4 v8, 0x0

    :goto_9
    if-ge v8, v0, :cond_10

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le/d;

    invoke-virtual {v1, v8, v2}, Le/e;->u(ILe/d;)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_9

    :cond_10
    invoke-virtual {v1}, Ln/j;->g()V

    move-object v0, v1

    :goto_a
    return-object v0
.end method

.method public final b()Ljava/util/HashSet;
    .locals 9

    new-instance v0, Ljava/util/HashSet;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    iget-object v1, p0, Le/a;->a:Ljava/lang/Object;

    check-cast v1, Lh/b;

    invoke-virtual {v1}, Lh/b;->a()Lj/c;

    move-result-object v1

    invoke-virtual {v1}, Ln/e;->B()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_1

    invoke-virtual {v1, v4}, Lj/c;->n(I)Lj/a;

    move-result-object v5

    invoke-virtual {v5}, Lj/a;->d()Lj/g;

    move-result-object v5

    invoke-virtual {v5}, Lj/g;->f()Ll/e;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ln/e;

    invoke-virtual {v6}, Ln/e;->B()I

    move-result v6

    move v7, v3

    :goto_1
    if-ge v7, v6, :cond_0

    invoke-interface {v5, v7}, Ll/e;->b(I)Ll/c;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final c(Lj/a;)Le/f;
    .locals 1

    iget-object v0, p0, Le/a;->c:Ljava/lang/Object;

    check-cast v0, [Le/f;

    invoke-virtual {p1}, Lj/a;->c()I

    move-result p1

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final d(Lj/a;)Le/f;
    .locals 1

    iget-object v0, p0, Le/a;->b:Ljava/lang/Object;

    check-cast v0, [Le/f;

    invoke-virtual {p1}, Lj/a;->c()I

    move-result p1

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final e(I)Le/f;
    .locals 1

    iget-object v0, p0, Le/a;->a:Ljava/lang/Object;

    check-cast v0, [Le/f;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final f(Lj/a;)Le/f;
    .locals 1

    iget-object v0, p0, Le/a;->a:Ljava/lang/Object;

    check-cast v0, [Le/f;

    invoke-virtual {p1}, Lj/a;->c()I

    move-result p1

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final g()Z
    .locals 5

    iget-object v0, p0, Le/a;->a:Ljava/lang/Object;

    check-cast v0, Lh/b;

    invoke-virtual {v0}, Lh/b;->a()Lj/c;

    move-result-object v0

    invoke-virtual {v0}, Ln/e;->B()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-virtual {v0, v3}, Lj/c;->n(I)Lj/a;

    move-result-object v4

    invoke-virtual {v4}, Lj/a;->d()Lj/g;

    move-result-object v4

    invoke-virtual {v4}, Lj/g;->f()Ll/e;

    move-result-object v4

    check-cast v4, Ln/e;

    invoke-virtual {v4}, Ln/e;->B()I

    move-result v4

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method
