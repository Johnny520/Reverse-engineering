.class public final Lg/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Le/z;

.field private final b:Le/t;

.field private final c:Ln/d;

.field private final d:I

.field private final e:I

.field private final f:Ll/a;

.field private final g:Z

.field private h:I

.field private i:I

.field private j:Ln/a;

.field private k:Ljava/io/PrintWriter;

.field private l:Ljava/lang/String;

.field private m:Z

.field private final n:[Le/r;


# direct methods
.method public constructor <init>(Le/z;Le/t;Lg/k;IIZLk/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p3, 0x0

    iput p3, p0, Lg/i;->h:I

    const/4 p3, 0x1

    iput p3, p0, Lg/i;->i:I

    iput-object p1, p0, Lg/i;->a:Le/z;

    iput-object p2, p0, Lg/i;->b:Le/t;

    invoke-virtual {p7}, Lk/d;->j()Ll/a;

    move-result-object p1

    iput-object p1, p0, Lg/i;->f:Ll/a;

    iput-boolean p6, p0, Lg/i;->g:Z

    iput p4, p0, Lg/i;->d:I

    iput p5, p0, Lg/i;->e:I

    new-instance p1, Ln/d;

    invoke-direct {p1}, Ln/d;-><init>()V

    iput-object p1, p0, Lg/i;->c:Ln/d;

    new-array p1, p5, [Le/r;

    iput-object p1, p0, Lg/i;->n:[Le/r;

    return-void
.end method

.method private a(ILjava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lg/i;->l:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lg/i;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    :cond_0
    iget-object v0, p0, Lg/i;->j:Ln/a;

    if-eqz v0, :cond_2

    iget-boolean v1, p0, Lg/i;->m:Z

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    check-cast v0, Ln/d;

    invoke-virtual {v0, p1, p2}, Ln/d;->b(ILjava/lang/String;)V

    :cond_2
    iget-object p1, p0, Lg/i;->k:Ljava/io/PrintWriter;

    if-eqz p1, :cond_3

    invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :cond_3
    return-void
.end method

.method private static b(II)I
    .locals 2

    const/4 v0, -0x4

    if-lt p0, v0, :cond_0

    const/16 v1, 0xa

    if-gt p0, v1, :cond_0

    sub-int/2addr p0, v0

    mul-int/lit8 p1, p1, 0xf

    add-int/2addr p1, p0

    add-int/2addr p1, v1

    return p1

    :cond_0
    new-instance p0, Ljava/lang/RuntimeException;

    const-string p1, "Parameter out of range"

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private d()[B
    .locals 17

    move-object/from16 v0, p0

    const/4 v1, 0x0

    iget-object v2, v0, Lg/i;->a:Le/z;

    if-nez v2, :cond_0

    move v3, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ln/e;->B()I

    move-result v3

    :goto_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    move v5, v1

    :goto_1
    if-ge v5, v3, :cond_1

    invoke-virtual {v2, v5}, Le/z;->m(I)Le/y;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    new-instance v2, Lg/h;

    invoke-direct {v2, v1}, Lg/h;-><init>(I)V

    invoke-static {v4, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, v0, Lg/i;->f:Ll/a;

    invoke-virtual {v3}, Ll/a;->d()Ll/b;

    move-result-object v5

    invoke-virtual {v5}, Ln/e;->B()I

    move-result v5

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v3}, Ll/a;->d()Ll/b;

    move-result-object v5

    invoke-virtual {v5}, Ln/e;->B()I

    move-result v6

    move v7, v1

    move v8, v7

    :goto_2
    if-ge v7, v6, :cond_2

    invoke-virtual {v5, v7}, Ll/b;->r(I)Ll/c;

    move-result-object v9

    invoke-virtual {v9}, Ll/c;->f()I

    move-result v9

    add-int/2addr v8, v9

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_2
    iget v5, v0, Lg/i;->e:I

    sub-int v6, v5, v8

    iget-boolean v7, v0, Lg/i;->g:Z

    xor-int/lit8 v8, v7, 0x1

    sub-int/2addr v6, v8

    new-instance v8, Ljava/util/BitSet;

    sub-int v6, v5, v6

    invoke-direct {v8, v6}, Ljava/util/BitSet;-><init>(I)V

    iget-object v6, v0, Lg/i;->b:Le/t;

    invoke-virtual {v6}, Ln/e;->B()I

    move-result v8

    const/4 v9, 0x0

    if-gtz v8, :cond_1c

    new-instance v8, Lg/h;

    const/4 v10, 0x1

    invoke-direct {v8, v10}, Lg/h;-><init>(I)V

    invoke-static {v2, v8}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    iget-object v8, v0, Lg/i;->j:Ln/a;

    if-nez v8, :cond_4

    iget-object v8, v0, Lg/i;->k:Ljava/io/PrintWriter;

    if-eqz v8, :cond_3

    goto :goto_3

    :cond_3
    move v8, v1

    goto :goto_4

    :cond_4
    :goto_3
    move v8, v10

    :goto_4
    iget-object v11, v0, Lg/i;->c:Ln/d;

    invoke-virtual {v11}, Ln/d;->j()I

    move-result v12

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v13

    if-lez v13, :cond_5

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Le/y;

    invoke-virtual {v13}, Le/y;->b()Lj/s;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v13, -0x1

    iput v13, v0, Lg/i;->i:I

    :cond_5
    iget v13, v0, Lg/i;->i:I

    invoke-virtual {v11, v13}, Ln/d;->t(I)I

    if-eqz v8, :cond_6

    invoke-virtual {v11}, Ln/d;->j()I

    move-result v13

    sub-int/2addr v13, v12

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v14, "line_start: "

    invoke-direct {v12, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v14, v0, Lg/i;->i:I

    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-direct {v0, v13, v12}, Lg/i;->a(ILjava/lang/String;)V

    :cond_6
    invoke-virtual {v3}, Ll/a;->d()Ll/b;

    move-result-object v12

    invoke-virtual {v12}, Ln/e;->B()I

    move-result v13

    move v14, v1

    move v15, v14

    :goto_5
    if-ge v14, v13, :cond_7

    invoke-virtual {v12, v14}, Ll/b;->r(I)Ll/c;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ll/c;->f()I

    move-result v16

    add-int v15, v16, v15

    add-int/lit8 v14, v14, 0x1

    goto :goto_5

    :cond_7
    sub-int/2addr v5, v15

    xor-int/lit8 v12, v7, 0x1

    sub-int/2addr v5, v12

    invoke-virtual {v3}, Ll/a;->d()Ll/b;

    move-result-object v3

    invoke-virtual {v3}, Ln/e;->B()I

    move-result v12

    if-nez v7, :cond_9

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-nez v13, :cond_8

    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    :cond_8
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/r;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw v9

    :cond_9
    :goto_6
    invoke-virtual {v11}, Ln/d;->j()I

    move-result v7

    invoke-virtual {v11, v12}, Ln/d;->t(I)I

    if-eqz v8, :cond_a

    invoke-virtual {v11}, Ln/d;->j()I

    move-result v13

    sub-int/2addr v13, v7

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    const-string v14, "parameters_size: %04x"

    invoke-static {v14, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v0, v13, v7}, Lg/i;->a(ILjava/lang/String;)V

    :cond_a
    move v7, v1

    :goto_7
    if-ge v7, v12, :cond_d

    invoke-virtual {v3, v7}, Ll/b;->r(I)Ll/c;

    move-result-object v13

    invoke-virtual {v11}, Ln/d;->j()I

    move-result v14

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v15

    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-nez v16, :cond_c

    invoke-virtual {v11, v1}, Ln/d;->t(I)I

    if-eqz v8, :cond_b

    invoke-virtual {v11}, Ln/d;->j()I

    move-result v15

    sub-int/2addr v15, v14

    new-instance v14, Ljava/lang/StringBuilder;

    const-string v1, "parameter <unnamed> v"

    invoke-direct {v14, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v15, v1}, Lg/i;->a(ILjava/lang/String;)V

    :cond_b
    invoke-virtual {v13}, Ll/c;->f()I

    move-result v1

    add-int/2addr v5, v1

    add-int/lit8 v7, v7, 0x1

    const/4 v1, 0x0

    goto :goto_7

    :cond_c
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/r;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw v9

    :cond_d
    iget-object v1, v0, Lg/i;->n:[Le/r;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_8
    if-ge v3, v2, :cond_f

    aget-object v5, v1, v3

    if-nez v5, :cond_e

    add-int/lit8 v3, v3, 0x1

    goto :goto_8

    :cond_e
    throw v9

    :cond_f
    const/4 v1, 0x7

    invoke-virtual {v11, v1}, Ln/d;->p(I)V

    iget-object v1, v0, Lg/i;->j:Ln/a;

    if-nez v1, :cond_10

    iget-object v1, v0, Lg/i;->k:Ljava/io/PrintWriter;

    if-eqz v1, :cond_11

    :cond_10
    iget v1, v0, Lg/i;->h:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "%04x: prologue end"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v10, v1}, Lg/i;->a(ILjava/lang/String;)V

    :cond_11
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v6}, Ln/e;->B()I

    move-result v2

    const/4 v3, 0x0

    :goto_9
    invoke-virtual {v6}, Ln/e;->B()I

    move-result v5

    if-lez v5, :cond_13

    invoke-virtual {v6}, Le/t;->F()V

    iget v5, v0, Lg/i;->h:I

    if-eqz v5, :cond_12

    goto :goto_a

    :cond_12
    invoke-virtual {v6}, Le/t;->F()V

    throw v9

    :cond_13
    :goto_a
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    :goto_b
    if-ge v3, v5, :cond_14

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Le/y;

    invoke-virtual {v7}, Le/y;->a()I

    move-result v7

    iget v8, v0, Lg/i;->h:I

    if-ne v7, v8, :cond_14

    add-int/lit8 v7, v3, 0x1

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le/y;

    invoke-direct {v0, v3}, Lg/i;->h(Le/y;)V

    move v3, v7

    goto :goto_b

    :cond_14
    const v5, 0x7fffffff

    if-lez v2, :cond_15

    invoke-virtual {v6}, Le/t;->F()V

    const/4 v7, 0x0

    goto :goto_c

    :cond_15
    move v7, v5

    :goto_c
    if-ge v3, v1, :cond_16

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Le/y;

    invoke-virtual {v8}, Le/y;->a()I

    move-result v8

    goto :goto_d

    :cond_16
    move v8, v5

    :goto_d
    invoke-static {v8, v7}, Ljava/lang/Math;->min(II)I

    move-result v12

    if-ne v12, v5, :cond_17

    :goto_e
    const/4 v5, 0x0

    goto :goto_f

    :cond_17
    iget v13, v0, Lg/i;->d:I

    if-ne v12, v13, :cond_1a

    if-ne v7, v5, :cond_1a

    if-ne v8, v5, :cond_1a

    goto :goto_e

    :goto_f
    invoke-virtual {v11, v5}, Ln/d;->p(I)V

    iget-object v1, v0, Lg/i;->j:Ln/a;

    if-nez v1, :cond_18

    iget-object v1, v0, Lg/i;->k:Ljava/io/PrintWriter;

    if-eqz v1, :cond_19

    :cond_18
    const-string v1, "end sequence"

    invoke-direct {v0, v10, v1}, Lg/i;->a(ILjava/lang/String;)V

    :cond_19
    invoke-virtual {v11}, Ln/d;->m()[B

    move-result-object v1

    return-object v1

    :cond_1a
    const/4 v5, 0x0

    if-ne v12, v8, :cond_1b

    add-int/lit8 v7, v3, 0x1

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le/y;

    invoke-direct {v0, v3}, Lg/i;->h(Le/y;)V

    move v3, v7

    goto/16 :goto_9

    :cond_1b
    iget v7, v0, Lg/i;->h:I

    sub-int/2addr v12, v7

    invoke-direct {v0, v12}, Lg/i;->g(I)V

    goto/16 :goto_9

    :cond_1c
    invoke-virtual {v6}, Le/t;->F()V

    throw v9
.end method

.method private f(I)V
    .locals 3

    iget-object v0, p0, Lg/i;->c:Ln/d;

    invoke-virtual {v0}, Ln/d;->j()I

    move-result v1

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Ln/d;->p(I)V

    invoke-virtual {v0, p1}, Ln/d;->s(I)V

    iget v2, p0, Lg/i;->i:I

    add-int/2addr v2, p1

    iput v2, p0, Lg/i;->i:I

    iget-object p1, p0, Lg/i;->j:Ln/a;

    if-nez p1, :cond_0

    iget-object p1, p0, Lg/i;->k:Ljava/io/PrintWriter;

    if-eqz p1, :cond_1

    :cond_0
    invoke-virtual {v0}, Ln/d;->j()I

    move-result p1

    sub-int/2addr p1, v1

    iget v0, p0, Lg/i;->i:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "line = %d"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lg/i;->a(ILjava/lang/String;)V

    :cond_1
    return-void
.end method

.method private g(I)V
    .locals 3

    iget-object v0, p0, Lg/i;->c:Ln/d;

    invoke-virtual {v0}, Ln/d;->j()I

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ln/d;->p(I)V

    invoke-virtual {v0, p1}, Ln/d;->t(I)I

    iget v2, p0, Lg/i;->h:I

    add-int/2addr v2, p1

    iput v2, p0, Lg/i;->h:I

    iget-object p1, p0, Lg/i;->j:Ln/a;

    if-nez p1, :cond_0

    iget-object p1, p0, Lg/i;->k:Ljava/io/PrintWriter;

    if-eqz p1, :cond_1

    :cond_0
    invoke-virtual {v0}, Ln/d;->j()I

    move-result p1

    sub-int/2addr p1, v1

    iget v0, p0, Lg/i;->h:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "%04x: advance pc"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lg/i;->a(ILjava/lang/String;)V

    :cond_1
    return-void
.end method

.method private h(Le/y;)V
    .locals 4

    invoke-virtual {p1}, Le/y;->b()Lj/s;

    move-result-object v0

    invoke-virtual {v0}, Lj/s;->a()I

    move-result v0

    invoke-virtual {p1}, Le/y;->a()I

    move-result p1

    iget v1, p0, Lg/i;->i:I

    sub-int/2addr v0, v1

    iget v1, p0, Lg/i;->h:I

    sub-int/2addr p1, v1

    if-ltz p1, :cond_6

    const/4 v1, -0x4

    const/4 v2, 0x0

    if-lt v0, v1, :cond_0

    const/16 v1, 0xa

    if-le v0, v1, :cond_1

    :cond_0
    invoke-direct {p0, v0}, Lg/i;->f(I)V

    move v0, v2

    :cond_1
    invoke-static {v0, p1}, Lg/i;->b(II)I

    move-result v1

    and-int/lit16 v3, v1, -0x100

    if-lez v3, :cond_3

    invoke-direct {p0, p1}, Lg/i;->g(I)V

    invoke-static {v0, v2}, Lg/i;->b(II)I

    move-result v1

    and-int/lit16 p1, v1, -0x100

    if-lez p1, :cond_2

    invoke-direct {p0, v0}, Lg/i;->f(I)V

    invoke-static {v2, v2}, Lg/i;->b(II)I

    move-result v1

    move p1, v2

    goto :goto_0

    :cond_2
    move p1, v2

    :cond_3
    move v2, v0

    :goto_0
    iget-object v0, p0, Lg/i;->c:Ln/d;

    invoke-virtual {v0, v1}, Ln/d;->p(I)V

    iget v0, p0, Lg/i;->i:I

    add-int/2addr v0, v2

    iput v0, p0, Lg/i;->i:I

    iget v0, p0, Lg/i;->h:I

    add-int/2addr v0, p1

    iput v0, p0, Lg/i;->h:I

    iget-object p1, p0, Lg/i;->j:Ln/a;

    if-nez p1, :cond_4

    iget-object p1, p0, Lg/i;->k:Ljava/io/PrintWriter;

    if-eqz p1, :cond_5

    :cond_4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget v0, p0, Lg/i;->i:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {p1, v0}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "%04x: line %d"

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Lg/i;->a(ILjava/lang/String;)V

    :cond_5
    return-void

    :cond_6
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Position entries must be in ascending address order"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final c()[B
    .locals 2

    :try_start_0
    invoke-direct {p0}, Lg/i;->d()[B

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "...while encoding debug info"

    invoke-static {v1, v0}, Lb/a;->b(Ljava/lang/String;Ljava/lang/Exception;)Lb/a;

    move-result-object v0

    throw v0
.end method

.method public final e(Ljava/lang/String;Ln/d;Z)[B
    .locals 0

    iput-object p1, p0, Lg/i;->l:Ljava/lang/String;

    const/4 p1, 0x0

    iput-object p1, p0, Lg/i;->k:Ljava/io/PrintWriter;

    iput-object p2, p0, Lg/i;->j:Ln/a;

    iput-boolean p3, p0, Lg/i;->m:Z

    invoke-virtual {p0}, Lg/i;->c()[B

    move-result-object p1

    return-object p1
.end method
