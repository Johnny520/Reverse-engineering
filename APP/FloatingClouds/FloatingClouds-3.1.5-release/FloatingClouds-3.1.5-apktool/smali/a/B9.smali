.class public final La/B9;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/B9$a;,
        La/B9$b;
    }
.end annotation


# static fields
.field public static o:I = 0x3e8

.field public static p:Z = true


# instance fields
.field public a:I

.field public final b:La/Hc;

.field public c:I

.field public d:I

.field public e:[La/K1;

.field public f:Z

.field public g:[Z

.field public h:I

.field public i:I

.field public j:I

.field public final k:La/A2;

.field public l:[La/le;

.field public m:I

.field public n:La/K1;


# direct methods
.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, La/B9;->a:I

    const/16 v1, 0x20

    iput v1, p0, La/B9;->c:I

    iput v1, p0, La/B9;->d:I

    const/4 v2, 0x0

    iput-object v2, p0, La/B9;->e:[La/K1;

    iput-boolean v0, p0, La/B9;->f:Z

    new-array v2, v1, [Z

    iput-object v2, p0, La/B9;->g:[Z

    const/4 v2, 0x1

    iput v2, p0, La/B9;->h:I

    iput v0, p0, La/B9;->i:I

    iput v1, p0, La/B9;->j:I

    sget v2, La/B9;->o:I

    new-array v2, v2, [La/le;

    iput-object v2, p0, La/B9;->l:[La/le;

    iput v0, p0, La/B9;->m:I

    new-array v2, v1, [La/K1;

    iput-object v2, p0, La/B9;->e:[La/K1;

    invoke-virtual {p0}, La/B9;->q()V

    new-instance v2, La/A2;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    new-instance v3, La/Cc;

    invoke-direct {v3}, La/Cc;-><init>()V

    iput-object v3, v2, La/A2;->a:Ljava/lang/Object;

    new-instance v3, La/Cc;

    invoke-direct {v3}, La/Cc;-><init>()V

    iput-object v3, v2, La/A2;->b:Ljava/lang/Object;

    new-instance v3, La/Cc;

    invoke-direct {v3}, La/Cc;-><init>()V

    iput-object v3, v2, La/A2;->c:Ljava/lang/Object;

    new-array v1, v1, [La/le;

    iput-object v1, v2, La/A2;->d:Ljava/lang/Object;

    iput-object v2, p0, La/B9;->k:La/A2;

    new-instance v1, La/Hc;

    invoke-direct {v1, v2}, La/K1;-><init>(La/A2;)V

    const/16 v3, 0x80

    new-array v4, v3, [La/le;

    iput-object v4, v1, La/Hc;->f:[La/le;

    new-array v3, v3, [La/le;

    iput-object v3, v1, La/Hc;->g:[La/le;

    iput v0, v1, La/Hc;->h:I

    new-instance v0, La/Hc$b;

    invoke-direct {v0, v1}, La/Hc$b;-><init>(La/Hc;)V

    iput-object v0, v1, La/Hc;->i:La/Hc$b;

    iput-object v1, p0, La/B9;->b:La/Hc;

    sget-boolean v0, La/B9;->p:Z

    if-eqz v0, :cond_0

    new-instance v0, La/B9$b;

    invoke-direct {v0, v2}, La/B9$b;-><init>(La/A2;)V

    iput-object v0, p0, La/B9;->n:La/K1;

    return-void

    :cond_0
    new-instance v0, La/K1;

    invoke-direct {v0, v2}, La/K1;-><init>(La/A2;)V

    iput-object v0, p0, La/B9;->n:La/K1;

    return-void
.end method

.method public static m(Ljava/lang/Object;)I
    .locals 1

    check-cast p0, La/M3;

    iget-object p0, p0, La/M3;->g:La/le;

    if-eqz p0, :cond_0

    iget p0, p0, La/le;->e:F

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p0, v0

    float-to-int p0, p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final a(La/le$a;)La/le;
    .locals 3

    iget-object v0, p0, La/B9;->k:La/A2;

    iget-object v0, v0, La/A2;->c:Ljava/lang/Object;

    check-cast v0, La/Cc;

    invoke-virtual {v0}, La/Cc;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/le;

    if-nez v0, :cond_0

    new-instance v0, La/le;

    invoke-direct {v0, p1}, La/le;-><init>(La/le$a;)V

    iput-object p1, v0, La/le;->i:La/le$a;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, La/le;->c()V

    iput-object p1, v0, La/le;->i:La/le$a;

    :goto_0
    iget p1, p0, La/B9;->m:I

    sget v1, La/B9;->o:I

    if-lt p1, v1, :cond_1

    mul-int/lit8 v1, v1, 0x2

    sput v1, La/B9;->o:I

    iget-object p1, p0, La/B9;->l:[La/le;

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [La/le;

    iput-object p1, p0, La/B9;->l:[La/le;

    :cond_1
    iget-object p1, p0, La/B9;->l:[La/le;

    iget v1, p0, La/B9;->m:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, La/B9;->m:I

    aput-object v0, p1, v1

    return-object v0
.end method

.method public final b(La/le;La/le;IFLa/le;La/le;II)V
    .locals 6

    invoke-virtual {p0}, La/B9;->k()La/K1;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    if-ne p2, p5, :cond_0

    iget-object p3, v0, La/K1;->d:La/K1$a;

    invoke-interface {p3, p1, v1}, La/K1$a;->c(La/le;F)V

    iget-object p1, v0, La/K1;->d:La/K1$a;

    invoke-interface {p1, p6, v1}, La/K1$a;->c(La/le;F)V

    iget-object p1, v0, La/K1;->d:La/K1$a;

    const/high16 p3, -0x40000000    # -2.0f

    invoke-interface {p1, p2, p3}, La/K1$a;->c(La/le;F)V

    goto/16 :goto_0

    :cond_0
    const/high16 v2, 0x3f000000    # 0.5f

    cmpl-float v2, p4, v2

    const/high16 v3, -0x40800000    # -1.0f

    if-nez v2, :cond_2

    iget-object p4, v0, La/K1;->d:La/K1$a;

    invoke-interface {p4, p1, v1}, La/K1$a;->c(La/le;F)V

    iget-object p1, v0, La/K1;->d:La/K1$a;

    invoke-interface {p1, p2, v3}, La/K1$a;->c(La/le;F)V

    iget-object p1, v0, La/K1;->d:La/K1$a;

    invoke-interface {p1, p5, v3}, La/K1$a;->c(La/le;F)V

    iget-object p1, v0, La/K1;->d:La/K1$a;

    invoke-interface {p1, p6, v1}, La/K1$a;->c(La/le;F)V

    if-gtz p3, :cond_1

    if-lez p7, :cond_6

    :cond_1
    neg-int p1, p3

    add-int/2addr p1, p7

    int-to-float p1, p1

    iput p1, v0, La/K1;->b:F

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    cmpg-float v2, p4, v2

    if-gtz v2, :cond_3

    iget-object p4, v0, La/K1;->d:La/K1$a;

    invoke-interface {p4, p1, v3}, La/K1$a;->c(La/le;F)V

    iget-object p1, v0, La/K1;->d:La/K1$a;

    invoke-interface {p1, p2, v1}, La/K1$a;->c(La/le;F)V

    int-to-float p1, p3

    iput p1, v0, La/K1;->b:F

    goto :goto_0

    :cond_3
    cmpl-float v2, p4, v1

    if-ltz v2, :cond_4

    iget-object p1, v0, La/K1;->d:La/K1$a;

    invoke-interface {p1, p6, v3}, La/K1$a;->c(La/le;F)V

    iget-object p1, v0, La/K1;->d:La/K1$a;

    invoke-interface {p1, p5, v1}, La/K1$a;->c(La/le;F)V

    neg-int p1, p7

    int-to-float p1, p1

    iput p1, v0, La/K1;->b:F

    goto :goto_0

    :cond_4
    iget-object v2, v0, La/K1;->d:La/K1$a;

    sub-float v4, v1, p4

    mul-float v5, v4, v1

    invoke-interface {v2, p1, v5}, La/K1$a;->c(La/le;F)V

    iget-object p1, v0, La/K1;->d:La/K1$a;

    mul-float v2, v4, v3

    invoke-interface {p1, p2, v2}, La/K1$a;->c(La/le;F)V

    iget-object p1, v0, La/K1;->d:La/K1$a;

    mul-float/2addr v3, p4

    invoke-interface {p1, p5, v3}, La/K1$a;->c(La/le;F)V

    iget-object p1, v0, La/K1;->d:La/K1$a;

    mul-float/2addr v1, p4

    invoke-interface {p1, p6, v1}, La/K1$a;->c(La/le;F)V

    if-gtz p3, :cond_5

    if-lez p7, :cond_6

    :cond_5
    neg-int p1, p3

    int-to-float p1, p1

    mul-float/2addr p1, v4

    int-to-float p2, p7

    mul-float/2addr p2, p4

    add-float/2addr p2, p1

    iput p2, v0, La/K1;->b:F

    :cond_6
    :goto_0
    const/16 p1, 0x8

    if-eq p8, p1, :cond_7

    invoke-virtual {v0, p0, p8}, La/K1;->b(La/B9;I)V

    :cond_7
    invoke-virtual {p0, v0}, La/B9;->c(La/K1;)V

    return-void
.end method

.method public final c(La/K1;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, La/B9;->i:I

    const/4 v3, 0x1

    add-int/2addr v2, v3

    iget v4, v0, La/B9;->j:I

    if-ge v2, v4, :cond_0

    iget v2, v0, La/B9;->h:I

    add-int/2addr v2, v3

    iget v4, v0, La/B9;->d:I

    if-lt v2, v4, :cond_1

    :cond_0
    invoke-virtual {v0}, La/B9;->n()V

    :cond_1
    iget-boolean v2, v1, La/K1;->e:Z

    if-nez v2, :cond_1f

    iget-object v2, v0, La/B9;->e:[La/K1;

    array-length v2, v2

    const/4 v5, -0x1

    if-nez v2, :cond_2

    goto :goto_3

    :cond_2
    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_9

    iget-object v6, v1, La/K1;->d:La/K1$a;

    invoke-interface {v6}, La/K1$a;->k()I

    move-result v6

    const/4 v7, 0x0

    :goto_1
    iget-object v8, v1, La/K1;->c:Ljava/util/ArrayList;

    if-ge v7, v6, :cond_5

    iget-object v9, v1, La/K1;->d:La/K1$a;

    invoke-interface {v9, v7}, La/K1$a;->f(I)La/le;

    move-result-object v9

    iget v10, v9, La/le;->c:I

    if-ne v10, v5, :cond_3

    iget-boolean v10, v9, La/le;->f:Z

    if-eqz v10, :cond_4

    :cond_3
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_5
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-lez v6, :cond_8

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, La/le;

    iget-boolean v9, v7, La/le;->f:Z

    if-eqz v9, :cond_6

    invoke-virtual {v1, v7, v3}, La/K1;->g(La/le;Z)V

    goto :goto_2

    :cond_6
    iget-object v9, v0, La/B9;->e:[La/K1;

    iget v7, v7, La/le;->c:I

    aget-object v7, v9, v7

    invoke-virtual {v1, v7, v3}, La/K1;->h(La/K1;Z)V

    goto :goto_2

    :cond_7
    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    goto :goto_0

    :cond_8
    move v2, v3

    goto :goto_0

    :cond_9
    :goto_3
    iget-object v2, v1, La/K1;->a:La/le;

    const/4 v6, 0x0

    if-nez v2, :cond_a

    iget v2, v1, La/K1;->b:F

    cmpl-float v2, v2, v6

    if-nez v2, :cond_a

    iget-object v2, v1, La/K1;->d:La/K1$a;

    invoke-interface {v2}, La/K1$a;->k()I

    move-result v2

    if-nez v2, :cond_a

    goto/16 :goto_f

    :cond_a
    iget v2, v1, La/K1;->b:F

    cmpg-float v7, v2, v6

    if-gez v7, :cond_b

    const/high16 v7, -0x40800000    # -1.0f

    mul-float/2addr v2, v7

    iput v2, v1, La/K1;->b:F

    iget-object v2, v1, La/K1;->d:La/K1$a;

    invoke-interface {v2}, La/K1$a;->j()V

    :cond_b
    iget-object v2, v1, La/K1;->d:La/K1$a;

    invoke-interface {v2}, La/K1$a;->k()I

    move-result v2

    const/4 v7, 0x0

    move v11, v6

    move v13, v11

    move-object v9, v7

    move-object v10, v9

    const/4 v8, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    :goto_4
    sget-object v15, La/le$a;->a:La/le$a;

    if-ge v8, v2, :cond_14

    iget-object v4, v1, La/K1;->d:La/K1$a;

    invoke-interface {v4, v8}, La/K1$a;->a(I)F

    move-result v4

    move/from16 v16, v6

    iget-object v6, v1, La/K1;->d:La/K1$a;

    invoke-interface {v6, v8}, La/K1$a;->f(I)La/le;

    move-result-object v6

    iget-object v5, v6, La/le;->i:La/le$a;

    if-ne v5, v15, :cond_f

    if-nez v9, :cond_d

    iget v5, v6, La/le;->l:I

    if-gt v5, v3, :cond_c

    goto :goto_6

    :cond_c
    const/4 v12, 0x0

    :goto_5
    move v11, v4

    move-object v9, v6

    goto :goto_9

    :cond_d
    cmpl-float v5, v11, v4

    if-lez v5, :cond_e

    iget v5, v6, La/le;->l:I

    if-gt v5, v3, :cond_c

    goto :goto_6

    :cond_e
    if-nez v12, :cond_13

    iget v5, v6, La/le;->l:I

    if-gt v5, v3, :cond_13

    :goto_6
    move v12, v3

    goto :goto_5

    :cond_f
    if-nez v9, :cond_13

    cmpg-float v5, v4, v16

    if-gez v5, :cond_13

    if-nez v10, :cond_11

    iget v5, v6, La/le;->l:I

    if-gt v5, v3, :cond_10

    goto :goto_8

    :cond_10
    const/4 v14, 0x0

    :goto_7
    move v13, v4

    move-object v10, v6

    goto :goto_9

    :cond_11
    cmpl-float v5, v13, v4

    if-lez v5, :cond_12

    iget v5, v6, La/le;->l:I

    if-gt v5, v3, :cond_10

    goto :goto_8

    :cond_12
    if-nez v14, :cond_13

    iget v5, v6, La/le;->l:I

    if-gt v5, v3, :cond_13

    :goto_8
    move v14, v3

    goto :goto_7

    :cond_13
    :goto_9
    add-int/lit8 v8, v8, 0x1

    move/from16 v6, v16

    const/4 v5, -0x1

    goto :goto_4

    :cond_14
    move/from16 v16, v6

    if-eqz v9, :cond_15

    goto :goto_a

    :cond_15
    move-object v9, v10

    :goto_a
    if-nez v9, :cond_16

    move v2, v3

    goto :goto_b

    :cond_16
    invoke-virtual {v1, v9}, La/K1;->f(La/le;)V

    const/4 v2, 0x0

    :goto_b
    iget-object v4, v1, La/K1;->d:La/K1$a;

    invoke-interface {v4}, La/K1$a;->k()I

    move-result v4

    if-nez v4, :cond_17

    iput-boolean v3, v1, La/K1;->e:Z

    :cond_17
    if-eqz v2, :cond_1c

    iget v2, v0, La/B9;->h:I

    add-int/2addr v2, v3

    iget v4, v0, La/B9;->d:I

    if-lt v2, v4, :cond_18

    invoke-virtual {v0}, La/B9;->n()V

    :cond_18
    sget-object v2, La/le$a;->b:La/le$a;

    invoke-virtual {v0, v2}, La/B9;->a(La/le$a;)La/le;

    move-result-object v2

    iget v4, v0, La/B9;->a:I

    add-int/2addr v4, v3

    iput v4, v0, La/B9;->a:I

    iget v5, v0, La/B9;->h:I

    add-int/2addr v5, v3

    iput v5, v0, La/B9;->h:I

    iput v4, v2, La/le;->b:I

    iget-object v5, v0, La/B9;->k:La/A2;

    iget-object v5, v5, La/A2;->d:Ljava/lang/Object;

    check-cast v5, [La/le;

    aput-object v2, v5, v4

    iput-object v2, v1, La/K1;->a:La/le;

    invoke-virtual/range {p0 .. p1}, La/B9;->h(La/K1;)V

    iget-object v4, v0, La/B9;->n:La/K1;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v7, v4, La/K1;->a:La/le;

    iget-object v5, v4, La/K1;->d:La/K1$a;

    invoke-interface {v5}, La/K1$a;->clear()V

    const/4 v5, 0x0

    :goto_c
    iget-object v6, v1, La/K1;->d:La/K1$a;

    invoke-interface {v6}, La/K1$a;->k()I

    move-result v6

    if-ge v5, v6, :cond_19

    iget-object v6, v1, La/K1;->d:La/K1$a;

    invoke-interface {v6, v5}, La/K1$a;->f(I)La/le;

    move-result-object v6

    iget-object v8, v1, La/K1;->d:La/K1$a;

    invoke-interface {v8, v5}, La/K1$a;->a(I)F

    move-result v8

    iget-object v9, v4, La/K1;->d:La/K1$a;

    invoke-interface {v9, v6, v8, v3}, La/K1$a;->e(La/le;FZ)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_c

    :cond_19
    iget-object v4, v0, La/B9;->n:La/K1;

    invoke-virtual {v0, v4}, La/B9;->p(La/K1;)V

    iget v4, v2, La/le;->c:I

    const/4 v5, -0x1

    if-ne v4, v5, :cond_1d

    iget-object v4, v1, La/K1;->a:La/le;

    if-ne v4, v2, :cond_1a

    invoke-virtual {v1, v7, v2}, La/K1;->e([ZLa/le;)La/le;

    move-result-object v2

    if-eqz v2, :cond_1a

    invoke-virtual {v1, v2}, La/K1;->f(La/le;)V

    :cond_1a
    iget-boolean v2, v1, La/K1;->e:Z

    if-nez v2, :cond_1b

    iget-object v2, v1, La/K1;->a:La/le;

    invoke-virtual {v2, v1}, La/le;->d(La/K1;)V

    :cond_1b
    iget v2, v0, La/B9;->i:I

    sub-int/2addr v2, v3

    iput v2, v0, La/B9;->i:I

    goto :goto_d

    :cond_1c
    const/4 v3, 0x0

    :cond_1d
    :goto_d
    iget-object v2, v1, La/K1;->a:La/le;

    if-eqz v2, :cond_20

    iget-object v2, v2, La/le;->i:La/le$a;

    if-eq v2, v15, :cond_1e

    iget v2, v1, La/K1;->b:F

    cmpg-float v2, v2, v16

    if-ltz v2, :cond_20

    :cond_1e
    move v4, v3

    goto :goto_e

    :cond_1f
    const/4 v4, 0x0

    :goto_e
    if-nez v4, :cond_20

    invoke-virtual/range {p0 .. p1}, La/B9;->h(La/K1;)V

    :cond_20
    :goto_f
    return-void
.end method

.method public final d(La/le;I)V
    .locals 4

    iget v0, p1, La/le;->c:I

    const/4 v1, 0x1

    const/4 v2, -0x1

    if-ne v0, v2, :cond_1

    int-to-float p2, p2

    iput p2, p1, La/le;->e:F

    iput-boolean v1, p1, La/le;->f:Z

    iget p2, p1, La/le;->k:I

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, p2, :cond_0

    iget-object v2, p1, La/le;->j:[La/K1;

    aget-object v2, v2, v1

    invoke-virtual {v2, p1, v0}, La/K1;->g(La/le;Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iput v0, p1, La/le;->k:I

    return-void

    :cond_1
    if-eq v0, v2, :cond_5

    iget-object v3, p0, La/B9;->e:[La/K1;

    aget-object v0, v3, v0

    iget-boolean v3, v0, La/K1;->e:Z

    if-eqz v3, :cond_2

    int-to-float p1, p2

    iput p1, v0, La/K1;->b:F

    return-void

    :cond_2
    iget-object v3, v0, La/K1;->d:La/K1$a;

    invoke-interface {v3}, La/K1$a;->k()I

    move-result v3

    if-nez v3, :cond_3

    iput-boolean v1, v0, La/K1;->e:Z

    int-to-float p1, p2

    iput p1, v0, La/K1;->b:F

    return-void

    :cond_3
    invoke-virtual {p0}, La/B9;->k()La/K1;

    move-result-object v0

    if-gez p2, :cond_4

    mul-int/2addr p2, v2

    int-to-float p2, p2

    iput p2, v0, La/K1;->b:F

    iget-object p2, v0, La/K1;->d:La/K1$a;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-interface {p2, p1, v1}, La/K1$a;->c(La/le;F)V

    goto :goto_1

    :cond_4
    int-to-float p2, p2

    iput p2, v0, La/K1;->b:F

    iget-object p2, v0, La/K1;->d:La/K1$a;

    const/high16 v1, -0x40800000    # -1.0f

    invoke-interface {p2, p1, v1}, La/K1$a;->c(La/le;F)V

    :goto_1
    invoke-virtual {p0, v0}, La/B9;->c(La/K1;)V

    return-void

    :cond_5
    invoke-virtual {p0}, La/B9;->k()La/K1;

    move-result-object v0

    iput-object p1, v0, La/K1;->a:La/le;

    int-to-float p2, p2

    iput p2, p1, La/le;->e:F

    iput p2, v0, La/K1;->b:F

    iput-boolean v1, v0, La/K1;->e:Z

    invoke-virtual {p0, v0}, La/B9;->c(La/K1;)V

    return-void
.end method

.method public final e(La/le;La/le;II)V
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/16 v2, 0x8

    if-ne p4, v2, :cond_1

    iget-boolean v3, p2, La/le;->f:Z

    if-eqz v3, :cond_1

    iget v3, p1, La/le;->c:I

    const/4 v4, -0x1

    if-ne v3, v4, :cond_1

    iget p2, p2, La/le;->e:F

    int-to-float p3, p3

    add-float/2addr p2, p3

    iput p2, p1, La/le;->e:F

    iput-boolean v1, p1, La/le;->f:Z

    iget p2, p1, La/le;->k:I

    move p3, v0

    :goto_0
    if-ge p3, p2, :cond_0

    iget-object p4, p1, La/le;->j:[La/K1;

    aget-object p4, p4, p3

    invoke-virtual {p4, p1, v0}, La/K1;->g(La/le;Z)V

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_0
    iput v0, p1, La/le;->k:I

    return-void

    :cond_1
    invoke-virtual {p0}, La/B9;->k()La/K1;

    move-result-object v3

    if-eqz p3, :cond_3

    if-gez p3, :cond_2

    mul-int/lit8 p3, p3, -0x1

    move v0, v1

    :cond_2
    int-to-float p3, p3

    iput p3, v3, La/K1;->b:F

    :cond_3
    const/high16 p3, 0x3f800000    # 1.0f

    const/high16 v1, -0x40800000    # -1.0f

    if-nez v0, :cond_4

    iget-object v0, v3, La/K1;->d:La/K1$a;

    invoke-interface {v0, p1, v1}, La/K1$a;->c(La/le;F)V

    iget-object p1, v3, La/K1;->d:La/K1$a;

    invoke-interface {p1, p2, p3}, La/K1$a;->c(La/le;F)V

    goto :goto_1

    :cond_4
    iget-object v0, v3, La/K1;->d:La/K1$a;

    invoke-interface {v0, p1, p3}, La/K1$a;->c(La/le;F)V

    iget-object p1, v3, La/K1;->d:La/K1$a;

    invoke-interface {p1, p2, v1}, La/K1$a;->c(La/le;F)V

    :goto_1
    if-eq p4, v2, :cond_5

    invoke-virtual {v3, p0, p4}, La/K1;->b(La/B9;I)V

    :cond_5
    invoke-virtual {p0, v3}, La/B9;->c(La/K1;)V

    return-void
.end method

.method public final f(La/le;La/le;II)V
    .locals 3

    invoke-virtual {p0}, La/B9;->k()La/K1;

    move-result-object v0

    invoke-virtual {p0}, La/B9;->l()La/le;

    move-result-object v1

    const/4 v2, 0x0

    iput v2, v1, La/le;->d:I

    invoke-virtual {v0, p1, p2, v1, p3}, La/K1;->c(La/le;La/le;La/le;I)V

    const/16 p1, 0x8

    if-eq p4, p1, :cond_0

    iget-object p1, v0, La/K1;->d:La/K1$a;

    invoke-interface {p1, v1}, La/K1$a;->i(La/le;)F

    move-result p1

    const/high16 p2, -0x40800000    # -1.0f

    mul-float/2addr p1, p2

    float-to-int p1, p1

    invoke-virtual {p0, p4}, La/B9;->i(I)La/le;

    move-result-object p2

    iget-object p3, v0, La/K1;->d:La/K1$a;

    int-to-float p1, p1

    invoke-interface {p3, p2, p1}, La/K1$a;->c(La/le;F)V

    :cond_0
    invoke-virtual {p0, v0}, La/B9;->c(La/K1;)V

    return-void
.end method

.method public final g(La/le;La/le;II)V
    .locals 3

    invoke-virtual {p0}, La/B9;->k()La/K1;

    move-result-object v0

    invoke-virtual {p0}, La/B9;->l()La/le;

    move-result-object v1

    const/4 v2, 0x0

    iput v2, v1, La/le;->d:I

    invoke-virtual {v0, p1, p2, v1, p3}, La/K1;->d(La/le;La/le;La/le;I)V

    const/16 p1, 0x8

    if-eq p4, p1, :cond_0

    iget-object p1, v0, La/K1;->d:La/K1$a;

    invoke-interface {p1, v1}, La/K1$a;->i(La/le;)F

    move-result p1

    const/high16 p2, -0x40800000    # -1.0f

    mul-float/2addr p1, p2

    float-to-int p1, p1

    invoke-virtual {p0, p4}, La/B9;->i(I)La/le;

    move-result-object p2

    iget-object p3, v0, La/K1;->d:La/K1$a;

    int-to-float p1, p1

    invoke-interface {p3, p2, p1}, La/K1$a;->c(La/le;F)V

    :cond_0
    invoke-virtual {p0, v0}, La/B9;->c(La/K1;)V

    return-void
.end method

.method public final h(La/K1;)V
    .locals 3

    sget-boolean v0, La/B9;->p:Z

    iget-object v1, p0, La/B9;->k:La/A2;

    if-eqz v0, :cond_0

    iget-object v0, p0, La/B9;->e:[La/K1;

    iget v2, p0, La/B9;->i:I

    aget-object v0, v0, v2

    if-eqz v0, :cond_1

    iget-object v1, v1, La/A2;->a:Ljava/lang/Object;

    check-cast v1, La/Cc;

    invoke-virtual {v1, v0}, La/Cc;->b(La/K1;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, La/B9;->e:[La/K1;

    iget v2, p0, La/B9;->i:I

    aget-object v0, v0, v2

    if-eqz v0, :cond_1

    iget-object v1, v1, La/A2;->b:Ljava/lang/Object;

    check-cast v1, La/Cc;

    invoke-virtual {v1, v0}, La/Cc;->b(La/K1;)V

    :cond_1
    :goto_0
    iget-object v0, p0, La/B9;->e:[La/K1;

    iget v1, p0, La/B9;->i:I

    aput-object p1, v0, v1

    iget-object v0, p1, La/K1;->a:La/le;

    iput v1, v0, La/le;->c:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, La/B9;->i:I

    invoke-virtual {v0, p1}, La/le;->d(La/K1;)V

    return-void
.end method

.method public final i(I)La/le;
    .locals 4

    iget v0, p0, La/B9;->h:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, La/B9;->d:I

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, La/B9;->n()V

    :cond_0
    sget-object v0, La/le$a;->c:La/le$a;

    invoke-virtual {p0, v0}, La/B9;->a(La/le$a;)La/le;

    move-result-object v0

    iget v1, p0, La/B9;->a:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, La/B9;->a:I

    iget v2, p0, La/B9;->h:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, La/B9;->h:I

    iput v1, v0, La/le;->b:I

    iput p1, v0, La/le;->d:I

    iget-object p1, p0, La/B9;->k:La/A2;

    iget-object p1, p1, La/A2;->d:Ljava/lang/Object;

    check-cast p1, [La/le;

    aput-object v0, p1, v1

    iget-object p1, p0, La/B9;->b:La/Hc;

    iget-object v1, p1, La/Hc;->i:La/Hc$b;

    iput-object v0, v1, La/Hc$b;->a:La/le;

    iget-object v1, v0, La/le;->h:[F

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([FF)V

    iget v2, v0, La/le;->d:I

    const/high16 v3, 0x3f800000    # 1.0f

    aput v3, v1, v2

    invoke-virtual {p1, v0}, La/Hc;->i(La/le;)V

    return-object v0
.end method

.method public final j(Ljava/lang/Object;)La/le;
    .locals 4

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    iget v0, p0, La/B9;->h:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, La/B9;->d:I

    if-lt v0, v1, :cond_1

    invoke-virtual {p0}, La/B9;->n()V

    :cond_1
    instance-of v0, p1, La/M3;

    if-eqz v0, :cond_6

    check-cast p1, La/M3;

    iget-object v0, p1, La/M3;->g:La/le;

    if-nez v0, :cond_2

    invoke-virtual {p1}, La/M3;->i()V

    iget-object v0, p1, La/M3;->g:La/le;

    :cond_2
    iget p1, v0, La/le;->b:I

    iget-object v1, p0, La/B9;->k:La/A2;

    const/4 v2, -0x1

    if-eq p1, v2, :cond_4

    iget v3, p0, La/B9;->a:I

    if-gt p1, v3, :cond_4

    iget-object v3, v1, La/A2;->d:Ljava/lang/Object;

    check-cast v3, [La/le;

    aget-object v3, v3, p1

    if-nez v3, :cond_3

    goto :goto_0

    :cond_3
    return-object v0

    :cond_4
    :goto_0
    if-eq p1, v2, :cond_5

    invoke-virtual {v0}, La/le;->c()V

    :cond_5
    iget p1, p0, La/B9;->a:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, La/B9;->a:I

    iget v2, p0, La/B9;->h:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, La/B9;->h:I

    iput p1, v0, La/le;->b:I

    sget-object v2, La/le$a;->a:La/le$a;

    iput-object v2, v0, La/le;->i:La/le$a;

    iget-object v1, v1, La/A2;->d:Ljava/lang/Object;

    check-cast v1, [La/le;

    aput-object v0, v1, p1

    return-object v0

    :cond_6
    :goto_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final k()La/K1;
    .locals 5

    sget-boolean v0, La/B9;->p:Z

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget-object v4, p0, La/B9;->k:La/A2;

    if-eqz v0, :cond_1

    iget-object v0, v4, La/A2;->a:Ljava/lang/Object;

    check-cast v0, La/Cc;

    invoke-virtual {v0}, La/Cc;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/K1;

    if-nez v0, :cond_0

    new-instance v0, La/B9$b;

    invoke-direct {v0, v4}, La/B9$b;-><init>(La/A2;)V

    goto :goto_0

    :cond_0
    iput-object v3, v0, La/K1;->a:La/le;

    iget-object v3, v0, La/K1;->d:La/K1$a;

    invoke-interface {v3}, La/K1$a;->clear()V

    iput v2, v0, La/K1;->b:F

    iput-boolean v1, v0, La/K1;->e:Z

    goto :goto_0

    :cond_1
    iget-object v0, v4, La/A2;->b:Ljava/lang/Object;

    check-cast v0, La/Cc;

    invoke-virtual {v0}, La/Cc;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/K1;

    if-nez v0, :cond_2

    new-instance v0, La/K1;

    invoke-direct {v0, v4}, La/K1;-><init>(La/A2;)V

    goto :goto_0

    :cond_2
    iput-object v3, v0, La/K1;->a:La/le;

    iget-object v3, v0, La/K1;->d:La/K1$a;

    invoke-interface {v3}, La/K1$a;->clear()V

    iput v2, v0, La/K1;->b:F

    iput-boolean v1, v0, La/K1;->e:Z

    :goto_0
    return-object v0
.end method

.method public final l()La/le;
    .locals 3

    iget v0, p0, La/B9;->h:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, La/B9;->d:I

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, La/B9;->n()V

    :cond_0
    sget-object v0, La/le$a;->b:La/le$a;

    invoke-virtual {p0, v0}, La/B9;->a(La/le$a;)La/le;

    move-result-object v0

    iget v1, p0, La/B9;->a:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, La/B9;->a:I

    iget v2, p0, La/B9;->h:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, La/B9;->h:I

    iput v1, v0, La/le;->b:I

    iget-object v2, p0, La/B9;->k:La/A2;

    iget-object v2, v2, La/A2;->d:Ljava/lang/Object;

    check-cast v2, [La/le;

    aput-object v0, v2, v1

    return-object v0
.end method

.method public final n()V
    .locals 3

    iget v0, p0, La/B9;->c:I

    mul-int/lit8 v0, v0, 0x2

    iput v0, p0, La/B9;->c:I

    iget-object v1, p0, La/B9;->e:[La/K1;

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La/K1;

    iput-object v0, p0, La/B9;->e:[La/K1;

    iget-object v0, p0, La/B9;->k:La/A2;

    iget-object v1, v0, La/A2;->d:Ljava/lang/Object;

    check-cast v1, [La/le;

    iget v2, p0, La/B9;->c:I

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [La/le;

    iput-object v1, v0, La/A2;->d:Ljava/lang/Object;

    iget v0, p0, La/B9;->c:I

    new-array v1, v0, [Z

    iput-object v1, p0, La/B9;->g:[Z

    iput v0, p0, La/B9;->d:I

    iput v0, p0, La/B9;->j:I

    return-void
.end method

.method public final o(La/Hc;)V
    .locals 19

    move-object/from16 v0, p0

    const/4 v2, 0x0

    :goto_0
    iget v3, v0, La/B9;->i:I

    if-ge v2, v3, :cond_d

    iget-object v3, v0, La/B9;->e:[La/K1;

    aget-object v3, v3, v2

    iget-object v4, v3, La/K1;->a:La/le;

    iget-object v4, v4, La/le;->i:La/le$a;

    sget-object v5, La/le$a;->a:La/le$a;

    if-ne v4, v5, :cond_0

    goto/16 :goto_8

    :cond_0
    iget v3, v3, La/K1;->b:F

    const/4 v4, 0x0

    cmpg-float v3, v3, v4

    if-gez v3, :cond_c

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_1
    if-nez v2, :cond_d

    const/4 v6, 0x1

    add-int/2addr v3, v6

    const v8, 0x7f7fffff    # Float.MAX_VALUE

    const/4 v9, 0x0

    const/4 v10, -0x1

    const/4 v11, -0x1

    const/4 v12, 0x0

    :goto_2
    iget v13, v0, La/B9;->i:I

    iget-object v14, v0, La/B9;->k:La/A2;

    if-ge v9, v13, :cond_9

    iget-object v13, v0, La/B9;->e:[La/K1;

    aget-object v13, v13, v9

    iget-object v15, v13, La/K1;->a:La/le;

    iget-object v15, v15, La/le;->i:La/le$a;

    if-ne v15, v5, :cond_1

    goto :goto_6

    :cond_1
    iget-boolean v15, v13, La/K1;->e:Z

    if-eqz v15, :cond_2

    goto :goto_6

    :cond_2
    iget v15, v13, La/K1;->b:F

    cmpg-float v15, v15, v4

    if-gez v15, :cond_8

    move v15, v6

    :goto_3
    iget v1, v0, La/B9;->h:I

    if-ge v15, v1, :cond_8

    iget-object v1, v14, La/A2;->d:Ljava/lang/Object;

    check-cast v1, [La/le;

    aget-object v1, v1, v15

    move/from16 v16, v4

    iget-object v4, v13, La/K1;->d:La/K1$a;

    invoke-interface {v4, v1}, La/K1$a;->i(La/le;)F

    move-result v4

    cmpg-float v17, v4, v16

    if-gtz v17, :cond_3

    goto :goto_5

    :cond_3
    const/4 v6, 0x0

    :goto_4
    const/16 v7, 0x9

    if-ge v6, v7, :cond_7

    iget-object v7, v1, La/le;->g:[F

    aget v7, v7, v6

    div-float/2addr v7, v4

    cmpg-float v18, v7, v8

    if-gez v18, :cond_4

    if-eq v6, v12, :cond_5

    :cond_4
    if-le v6, v12, :cond_6

    :cond_5
    move v12, v6

    move v8, v7

    move v10, v9

    move v11, v15

    :cond_6
    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :cond_7
    :goto_5
    add-int/lit8 v15, v15, 0x1

    move/from16 v4, v16

    const/4 v6, 0x1

    goto :goto_3

    :cond_8
    :goto_6
    move/from16 v16, v4

    add-int/lit8 v9, v9, 0x1

    move/from16 v4, v16

    const/4 v6, 0x1

    goto :goto_2

    :cond_9
    move/from16 v16, v4

    const/4 v1, -0x1

    if-eq v10, v1, :cond_a

    iget-object v4, v0, La/B9;->e:[La/K1;

    aget-object v4, v4, v10

    iget-object v6, v4, La/K1;->a:La/le;

    iput v1, v6, La/le;->c:I

    iget-object v1, v14, La/A2;->d:Ljava/lang/Object;

    check-cast v1, [La/le;

    aget-object v1, v1, v11

    invoke-virtual {v4, v1}, La/K1;->f(La/le;)V

    iget-object v1, v4, La/K1;->a:La/le;

    iput v10, v1, La/le;->c:I

    invoke-virtual {v1, v4}, La/le;->d(La/K1;)V

    goto :goto_7

    :cond_a
    const/4 v2, 0x1

    :goto_7
    iget v1, v0, La/B9;->h:I

    div-int/lit8 v1, v1, 0x2

    if-le v3, v1, :cond_b

    const/4 v2, 0x1

    :cond_b
    move/from16 v4, v16

    goto/16 :goto_1

    :cond_c
    :goto_8
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_d
    invoke-virtual/range {p0 .. p1}, La/B9;->p(La/K1;)V

    const/4 v1, 0x0

    :goto_9
    iget v2, v0, La/B9;->i:I

    if-ge v1, v2, :cond_e

    iget-object v2, v0, La/B9;->e:[La/K1;

    aget-object v2, v2, v1

    iget-object v3, v2, La/K1;->a:La/le;

    iget v2, v2, La/K1;->b:F

    iput v2, v3, La/le;->e:F

    add-int/lit8 v1, v1, 0x1

    goto :goto_9

    :cond_e
    return-void
.end method

.method public final p(La/K1;)V
    .locals 11

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget v2, p0, La/B9;->h:I

    if-ge v1, v2, :cond_0

    iget-object v2, p0, La/B9;->g:[Z

    aput-boolean v0, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v0

    move v2, v1

    :cond_1
    :goto_1
    if-nez v1, :cond_b

    const/4 v3, 0x1

    add-int/2addr v2, v3

    iget v4, p0, La/B9;->h:I

    mul-int/lit8 v4, v4, 0x2

    if-lt v2, v4, :cond_2

    goto/16 :goto_4

    :cond_2
    iget-object v4, p1, La/K1;->a:La/le;

    if-eqz v4, :cond_3

    iget-object v5, p0, La/B9;->g:[Z

    iget v4, v4, La/le;->b:I

    aput-boolean v3, v5, v4

    :cond_3
    iget-object v4, p0, La/B9;->g:[Z

    invoke-interface {p1, v4}, La/B9$a;->a([Z)La/le;

    move-result-object v4

    if-eqz v4, :cond_5

    iget-object v5, p0, La/B9;->g:[Z

    iget v6, v4, La/le;->b:I

    aget-boolean v7, v5, v6

    if-eqz v7, :cond_4

    goto :goto_4

    :cond_4
    aput-boolean v3, v5, v6

    :cond_5
    if-eqz v4, :cond_a

    const/4 v3, -0x1

    const v5, 0x7f7fffff    # Float.MAX_VALUE

    move v6, v0

    move v7, v3

    :goto_2
    iget v8, p0, La/B9;->i:I

    if-ge v6, v8, :cond_9

    iget-object v8, p0, La/B9;->e:[La/K1;

    aget-object v8, v8, v6

    iget-object v9, v8, La/K1;->a:La/le;

    iget-object v9, v9, La/le;->i:La/le$a;

    sget-object v10, La/le$a;->a:La/le$a;

    if-ne v9, v10, :cond_6

    goto :goto_3

    :cond_6
    iget-boolean v9, v8, La/K1;->e:Z

    if-eqz v9, :cond_7

    goto :goto_3

    :cond_7
    iget-object v9, v8, La/K1;->d:La/K1$a;

    invoke-interface {v9, v4}, La/K1$a;->d(La/le;)Z

    move-result v9

    if-eqz v9, :cond_8

    iget-object v9, v8, La/K1;->d:La/K1$a;

    invoke-interface {v9, v4}, La/K1$a;->i(La/le;)F

    move-result v9

    const/4 v10, 0x0

    cmpg-float v10, v9, v10

    if-gez v10, :cond_8

    iget v8, v8, La/K1;->b:F

    neg-float v8, v8

    div-float/2addr v8, v9

    cmpg-float v9, v8, v5

    if-gez v9, :cond_8

    move v7, v6

    move v5, v8

    :cond_8
    :goto_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_9
    if-le v7, v3, :cond_1

    iget-object v5, p0, La/B9;->e:[La/K1;

    aget-object v5, v5, v7

    iget-object v6, v5, La/K1;->a:La/le;

    iput v3, v6, La/le;->c:I

    invoke-virtual {v5, v4}, La/K1;->f(La/le;)V

    iget-object v3, v5, La/K1;->a:La/le;

    iput v7, v3, La/le;->c:I

    invoke-virtual {v3, v5}, La/le;->d(La/K1;)V

    goto :goto_1

    :cond_a
    move v1, v3

    goto :goto_1

    :cond_b
    :goto_4
    return-void
.end method

.method public final q()V
    .locals 5

    sget-boolean v0, La/B9;->p:Z

    const/4 v1, 0x0

    iget-object v2, p0, La/B9;->k:La/A2;

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    :goto_0
    iget-object v0, p0, La/B9;->e:[La/K1;

    array-length v4, v0

    if-ge v3, v4, :cond_3

    aget-object v0, v0, v3

    if-eqz v0, :cond_0

    iget-object v4, v2, La/A2;->a:Ljava/lang/Object;

    check-cast v4, La/Cc;

    invoke-virtual {v4, v0}, La/Cc;->b(La/K1;)V

    :cond_0
    iget-object v0, p0, La/B9;->e:[La/K1;

    aput-object v1, v0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    iget-object v0, p0, La/B9;->e:[La/K1;

    array-length v4, v0

    if-ge v3, v4, :cond_3

    aget-object v0, v0, v3

    if-eqz v0, :cond_2

    iget-object v4, v2, La/A2;->b:Ljava/lang/Object;

    check-cast v4, La/Cc;

    invoke-virtual {v4, v0}, La/Cc;->b(La/K1;)V

    :cond_2
    iget-object v0, p0, La/B9;->e:[La/K1;

    aput-object v1, v0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final r()V
    .locals 10

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, La/B9;->k:La/A2;

    iget-object v3, v2, La/A2;->d:Ljava/lang/Object;

    check-cast v3, [La/le;

    array-length v4, v3

    if-ge v1, v4, :cond_1

    aget-object v2, v3, v1

    if-eqz v2, :cond_0

    invoke-virtual {v2}, La/le;->c()V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, v2, La/A2;->c:Ljava/lang/Object;

    check-cast v1, La/Cc;

    iget-object v3, p0, La/B9;->l:[La/le;

    iget v4, p0, La/B9;->m:I

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    array-length v5, v3

    if-le v4, v5, :cond_2

    array-length v4, v3

    :cond_2
    move v5, v0

    :goto_1
    if-ge v5, v4, :cond_4

    aget-object v6, v3, v5

    iget v7, v1, La/Cc;->c:I

    iget-object v8, v1, La/Cc;->b:[Ljava/lang/Object;

    array-length v9, v8

    if-ge v7, v9, :cond_3

    aput-object v6, v8, v7

    add-int/lit8 v7, v7, 0x1

    iput v7, v1, La/Cc;->c:I

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_4
    iput v0, p0, La/B9;->m:I

    iget-object v1, v2, La/A2;->d:Ljava/lang/Object;

    check-cast v1, [La/le;

    const/4 v3, 0x0

    invoke-static {v1, v3}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    iput v0, p0, La/B9;->a:I

    iget-object v1, p0, La/B9;->b:La/Hc;

    iput v0, v1, La/Hc;->h:I

    const/4 v3, 0x0

    iput v3, v1, La/K1;->b:F

    const/4 v1, 0x1

    iput v1, p0, La/B9;->h:I

    move v1, v0

    :goto_2
    iget v3, p0, La/B9;->i:I

    if-ge v1, v3, :cond_5

    iget-object v3, p0, La/B9;->e:[La/K1;

    aget-object v3, v3, v1

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, La/B9;->q()V

    iput v0, p0, La/B9;->i:I

    sget-boolean v0, La/B9;->p:Z

    if-eqz v0, :cond_6

    new-instance v0, La/B9$b;

    invoke-direct {v0, v2}, La/B9$b;-><init>(La/A2;)V

    iput-object v0, p0, La/B9;->n:La/K1;

    return-void

    :cond_6
    new-instance v0, La/K1;

    invoke-direct {v0, v2}, La/K1;-><init>(La/A2;)V

    iput-object v0, p0, La/B9;->n:La/K1;

    return-void
.end method
