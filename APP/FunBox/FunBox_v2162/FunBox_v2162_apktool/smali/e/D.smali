.class public final Le/D;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lh/b;

.field private final b:I

.field private final c:Le/a;

.field private final d:Le/w;

.field private final e:Le/C;

.field private final f:I

.field private g:[I

.field private final h:I

.field private final i:Z


# direct methods
.method private constructor <init>(Lh/b;ILd/a;)V
    .locals 10

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/D;->a:Lh/b;

    const/4 v0, 0x1

    iput v0, p0, Le/D;->b:I

    new-instance v1, Le/a;

    invoke-direct {v1, p1}, Le/a;-><init>(Lh/b;)V

    iput-object v1, p0, Le/D;->c:Le/a;

    iput p2, p0, Le/D;->h:I

    const/4 v1, 0x0

    iput-object v1, p0, Le/D;->g:[I

    new-array v1, v0, [Z

    const/4 v2, 0x0

    aput-boolean v0, v1, v2

    invoke-virtual {p1}, Lh/b;->a()Lj/c;

    move-result-object v0

    invoke-virtual {v0}, Lj/c;->J()I

    move-result v0

    invoke-virtual {p1}, Lh/b;->a()Lj/c;

    move-result-object v3

    new-instance v4, Le/B;

    invoke-direct {v4, v1, v0, p2}, Le/B;-><init>([ZII)V

    invoke-virtual {v3}, Ln/e;->B()I

    move-result v0

    move v5, v2

    :goto_0
    if-ge v5, v0, :cond_1

    invoke-virtual {v3, v5}, Lj/c;->n(I)Lj/a;

    move-result-object v6

    invoke-virtual {v6}, Lj/a;->b()Lj/h;

    move-result-object v6

    invoke-virtual {v6}, Ln/e;->B()I

    move-result v7

    move v8, v2

    :goto_1
    if-ge v8, v7, :cond_0

    invoke-virtual {v6, v8}, Lj/h;->o(I)Lj/g;

    move-result-object v9

    invoke-virtual {v9, v4}, Lj/g;->b(Lj/f;)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    aget-boolean v0, v1, v2

    iput-boolean v0, p0, Le/D;->i:Z

    invoke-virtual {p1}, Lh/b;->a()Lj/c;

    move-result-object p1

    invoke-virtual {p1}, Ln/e;->B()I

    move-result v1

    mul-int/lit8 v6, v1, 0x3

    invoke-virtual {p1}, Lj/c;->I()I

    move-result v1

    add-int v5, v1, v6

    invoke-virtual {p1}, Lj/c;->J()I

    move-result p1

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    move v2, p2

    :goto_2
    add-int v7, p1, v2

    iput v7, p0, Le/D;->f:I

    new-instance p1, Le/w;

    move-object v3, p1

    move-object v4, p3

    move v8, p2

    invoke-direct/range {v3 .. v8}, Le/w;-><init>(Ld/a;IIII)V

    iput-object p1, p0, Le/D;->d:Le/w;

    new-instance p2, Le/C;

    invoke-direct {p2, p0, p1}, Le/C;-><init>(Le/D;Le/w;)V

    iput-object p2, p0, Le/D;->e:Le/C;

    return-void
.end method

.method static bridge synthetic a(Le/D;)Le/a;
    .locals 0

    iget-object p0, p0, Le/D;->c:Le/a;

    return-object p0
.end method

.method static bridge synthetic b(Le/D;)Lh/b;
    .locals 0

    iget-object p0, p0, Le/D;->a:Lh/b;

    return-object p0
.end method

.method static bridge synthetic c(Le/D;)I
    .locals 0

    iget p0, p0, Le/D;->h:I

    return p0
.end method

.method static bridge synthetic d(Le/D;)Z
    .locals 0

    iget-boolean p0, p0, Le/D;->i:Z

    return p0
.end method

.method static bridge synthetic e(Le/D;)I
    .locals 0

    iget p0, p0, Le/D;->f:I

    return p0
.end method

.method static f(Lj/g;)Lj/o;
    .locals 1

    invoke-virtual {p0}, Lj/g;->j()Lj/m;

    move-result-object v0

    invoke-static {p0, v0}, Le/D;->h(Lj/g;Lj/m;)Lj/o;

    move-result-object p0

    return-object p0
.end method

.method static bridge synthetic g(Lj/g;Lj/m;)Lj/o;
    .locals 0

    invoke-static {p0, p1}, Le/D;->h(Lj/g;Lj/m;)Lj/o;

    move-result-object p0

    return-object p0
.end method

.method private static h(Lj/g;Lj/m;)Lj/o;
    .locals 3

    invoke-virtual {p0}, Lj/g;->k()Lj/o;

    move-result-object v0

    invoke-virtual {p0}, Lj/g;->h()Lj/q;

    move-result-object p0

    invoke-virtual {p0}, Lj/q;->f()Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-virtual {v0}, Ln/e;->B()I

    move-result p0

    const/4 v1, 0x2

    if-ne p0, v1, :cond_0

    invoke-virtual {p1}, Lj/m;->i()I

    move-result p0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lj/o;->p(I)Lj/m;

    move-result-object v2

    invoke-virtual {v2}, Lj/m;->i()I

    move-result v2

    if-ne p0, v2, :cond_0

    invoke-virtual {v0, v1}, Lj/o;->p(I)Lj/m;

    move-result-object p0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lj/o;->p(I)Lj/m;

    move-result-object v0

    invoke-static {p0, v0}, Lj/o;->I(Lj/m;Lj/m;)Lj/o;

    move-result-object v0

    :cond_0
    if-nez p1, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {v0, p1}, Lj/o;->M(Lj/m;)Lj/o;

    move-result-object p0

    return-object p0
.end method

.method public static i(Lh/b;ILd/a;)Le/i;
    .locals 17

    move-object/from16 v0, p0

    new-instance v1, Le/D;

    move/from16 v2, p1

    move-object/from16 v3, p2

    invoke-direct {v1, v0, v2, v3}, Le/D;-><init>(Lh/b;ILd/a;)V

    invoke-virtual/range {p0 .. p0}, Lh/b;->a()Lj/c;

    move-result-object v2

    invoke-virtual {v2}, Ln/e;->B()I

    move-result v3

    invoke-virtual {v2}, Ln/i;->F()I

    move-result v4

    add-int/lit8 v4, v4, 0x1f

    shr-int/lit8 v4, v4, 0x5

    new-array v5, v4, [I

    new-array v6, v4, [I

    const/4 v8, 0x0

    :goto_0
    const/4 v9, 0x1

    if-ge v8, v3, :cond_0

    invoke-virtual {v2, v8}, Lj/c;->n(I)Lj/a;

    move-result-object v10

    invoke-virtual {v10}, Lj/a;->c()I

    move-result v10

    shr-int/lit8 v11, v10, 0x5

    and-int/lit8 v10, v10, 0x1f

    shl-int/2addr v9, v10

    aget v10, v5, v11

    or-int/2addr v9, v10

    aput v9, v5, v11

    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_0
    new-array v8, v3, [I

    invoke-virtual/range {p0 .. p0}, Lh/b;->b()I

    move-result v10

    const/4 v11, 0x0

    :goto_1
    const/4 v12, -0x1

    if-eq v10, v12, :cond_11

    :goto_2
    invoke-virtual {v0, v10}, Lh/b;->e(I)Ln/g;

    move-result-object v13

    invoke-virtual {v13}, Ln/g;->o()I

    move-result v14

    const/4 v15, 0x0

    :goto_3
    if-ge v15, v14, :cond_4

    invoke-virtual {v13, v15}, Ln/g;->l(I)I

    move-result v7

    invoke-static {v6, v7}, La/b;->g([II)Z

    move-result v16

    if-eqz v16, :cond_1

    goto :goto_5

    :cond_1
    invoke-static {v5, v7}, La/b;->g([II)Z

    move-result v16

    if-nez v16, :cond_2

    goto :goto_4

    :cond_2
    invoke-virtual {v2, v7}, Lj/c;->K(I)Lj/a;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lj/a;->e()I

    move-result v12

    if-ne v12, v10, :cond_3

    shr-int/lit8 v10, v7, 0x5

    and-int/lit8 v12, v7, 0x1f

    shl-int v12, v9, v12

    aget v13, v6, v10

    or-int/2addr v12, v13

    aput v12, v6, v10

    move v10, v7

    const/4 v12, -0x1

    goto :goto_2

    :cond_3
    :goto_4
    add-int/lit8 v15, v15, 0x1

    const/4 v12, -0x1

    goto :goto_3

    :cond_4
    :goto_5
    const/4 v7, -0x1

    :goto_6
    if-eq v10, v7, :cond_d

    shr-int/lit8 v7, v10, 0x5

    and-int/lit8 v12, v10, 0x1f

    shl-int v12, v9, v12

    aget v13, v5, v7

    not-int v12, v12

    and-int/2addr v13, v12

    aput v13, v5, v7

    aget v13, v6, v7

    and-int/2addr v12, v13

    aput v12, v6, v7

    aput v10, v8, v11

    add-int/lit8 v11, v11, 0x1

    invoke-virtual {v2, v10}, Lj/c;->K(I)Lj/a;

    move-result-object v7

    invoke-virtual {v7}, Lj/a;->e()I

    move-result v10

    invoke-virtual {v7}, Lj/a;->g()Ln/g;

    move-result-object v12

    invoke-virtual {v12}, Ln/g;->o()I

    move-result v13

    if-eqz v13, :cond_7

    if-eq v13, v9, :cond_5

    const/4 v13, -0x1

    if-eq v10, v13, :cond_6

    move v12, v10

    const/4 v10, 0x0

    goto :goto_7

    :cond_5
    const/4 v13, -0x1

    :cond_6
    const/4 v10, 0x0

    invoke-virtual {v12, v10}, Ln/g;->l(I)I

    move-result v12

    :goto_7
    invoke-virtual {v2, v12}, Lj/c;->K(I)Lj/a;

    move-result-object v12

    goto :goto_8

    :cond_7
    const/4 v10, 0x0

    const/4 v13, -0x1

    const/4 v12, 0x0

    :goto_8
    if-nez v12, :cond_8

    goto :goto_a

    :cond_8
    invoke-virtual {v12}, Lj/a;->c()I

    move-result v12

    invoke-virtual {v7}, Lj/a;->e()I

    move-result v14

    invoke-static {v5, v12}, La/b;->g([II)Z

    move-result v15

    if-eqz v15, :cond_9

    move v10, v12

    move v7, v13

    goto :goto_6

    :cond_9
    if-eq v14, v12, :cond_a

    if-ltz v14, :cond_a

    invoke-static {v5, v14}, La/b;->g([II)Z

    move-result v12

    if-eqz v12, :cond_a

    move v7, v13

    move v10, v14

    goto :goto_6

    :cond_a
    invoke-virtual {v7}, Lj/a;->g()Ln/g;

    move-result-object v7

    invoke-virtual {v7}, Ln/g;->o()I

    move-result v12

    move v14, v10

    :goto_9
    if-ge v14, v12, :cond_c

    invoke-virtual {v7, v14}, Ln/g;->l(I)I

    move-result v15

    invoke-static {v5, v15}, La/b;->g([II)Z

    move-result v16

    if-eqz v16, :cond_b

    move v7, v13

    move v10, v15

    goto :goto_6

    :cond_b
    add-int/lit8 v14, v14, 0x1

    goto :goto_9

    :cond_c
    move v7, v13

    move v10, v7

    goto :goto_6

    :cond_d
    move v13, v7

    const/4 v10, 0x0

    :goto_a
    move v7, v10

    :goto_b
    if-ge v7, v4, :cond_10

    aget v12, v5, v7

    if-eqz v12, :cond_f

    and-int/lit8 v12, v12, -0x1

    invoke-static {v12}, Ljava/lang/Integer;->numberOfTrailingZeros(I)I

    move-result v12

    const/16 v14, 0x20

    if-ne v12, v14, :cond_e

    move v12, v13

    :cond_e
    if-ltz v12, :cond_f

    shl-int/lit8 v7, v7, 0x5

    add-int/2addr v7, v12

    move v10, v7

    goto/16 :goto_1

    :cond_f
    add-int/lit8 v7, v7, 0x1

    goto :goto_b

    :cond_10
    move v10, v13

    goto/16 :goto_1

    :cond_11
    move v13, v12

    const/4 v10, 0x0

    if-ne v11, v3, :cond_17

    iput-object v8, v1, Le/D;->g:[I

    invoke-virtual/range {p0 .. p0}, Lh/b;->a()Lj/c;

    move-result-object v2

    iget-object v3, v1, Le/D;->g:[I

    array-length v4, v3

    move v5, v10

    :goto_c
    iget-object v6, v1, Le/D;->d:Le/w;

    iget-object v7, v1, Le/D;->c:Le/a;

    if-ge v5, v4, :cond_16

    add-int/lit8 v8, v5, 0x1

    array-length v9, v3

    if-ne v8, v9, :cond_12

    move v9, v13

    goto :goto_d

    :cond_12
    aget v9, v3, v8

    :goto_d
    aget v5, v3, v5

    invoke-virtual {v2, v5}, Lj/c;->K(I)Lj/a;

    move-result-object v5

    invoke-virtual {v7, v5}, Le/a;->f(Lj/a;)Le/f;

    move-result-object v11

    invoke-virtual {v6, v11}, Le/w;->a(Le/j;)V

    invoke-virtual {v7, v5}, Le/a;->d(Lj/a;)Le/f;

    move-result-object v11

    iget-object v12, v1, Le/D;->e:Le/C;

    invoke-virtual {v12, v5, v11}, Le/C;->g(Lj/a;Le/f;)V

    invoke-virtual {v5}, Lj/a;->b()Lj/h;

    move-result-object v11

    invoke-virtual {v11}, Ln/e;->B()I

    move-result v14

    move v15, v10

    :goto_e
    if-ge v15, v14, :cond_13

    invoke-virtual {v11, v15}, Lj/h;->o(I)Lj/g;

    move-result-object v10

    invoke-virtual {v10, v12}, Lj/g;->b(Lj/f;)V

    add-int/lit8 v15, v15, 0x1

    const/4 v10, 0x0

    goto :goto_e

    :cond_13
    invoke-virtual {v7, v5}, Le/a;->c(Lj/a;)Le/f;

    move-result-object v10

    invoke-virtual {v6, v10}, Le/w;->a(Le/j;)V

    invoke-virtual {v5}, Lj/a;->e()I

    move-result v10

    invoke-virtual {v5}, Lj/a;->d()Lj/g;

    move-result-object v11

    if-ltz v10, :cond_15

    if-eq v10, v9, :cond_15

    invoke-virtual {v11}, Lj/g;->h()Lj/q;

    move-result-object v12

    invoke-virtual {v12}, Lj/q;->b()I

    move-result v12

    const/4 v14, 0x4

    if-ne v12, v14, :cond_14

    invoke-virtual {v5}, Lj/a;->f()I

    move-result v5

    if-ne v5, v9, :cond_14

    invoke-virtual {v7, v10}, Le/a;->e(I)Le/f;

    move-result-object v5

    invoke-virtual {v6, v5}, Le/w;->d(Le/f;)V

    goto :goto_f

    :cond_14
    new-instance v5, Le/F;

    sget-object v9, Le/m;->I:Le/l;

    invoke-virtual {v11}, Lj/g;->i()Lj/s;

    move-result-object v11

    sget-object v12, Lj/o;->c:Lj/o;

    invoke-virtual {v7, v10}, Le/a;->e(I)Le/f;

    move-result-object v7

    invoke-direct {v5, v9, v11, v12, v7}, Le/F;-><init>(Le/l;Lj/s;Lj/o;Le/f;)V

    invoke-virtual {v6, v5}, Le/w;->a(Le/j;)V

    :cond_15
    :goto_f
    move v5, v8

    const/4 v10, 0x0

    goto :goto_c

    :cond_16
    new-instance v2, Le/a;

    iget-object v3, v1, Le/D;->g:[I

    invoke-direct {v2, v0, v3, v7}, Le/a;-><init>(Lh/b;[ILe/a;)V

    new-instance v0, Le/i;

    iget v1, v1, Le/D;->b:I

    invoke-virtual {v6}, Le/w;->c()Le/x;

    move-result-object v3

    invoke-direct {v0, v1, v3, v2}, Le/i;-><init>(ILe/x;Le/a;)V

    return-object v0

    :cond_17
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "shouldn\'t happen"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
