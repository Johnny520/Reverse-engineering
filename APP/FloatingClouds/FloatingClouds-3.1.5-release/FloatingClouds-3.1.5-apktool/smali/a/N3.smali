.class public La/N3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/N3$a;
    }
.end annotation


# instance fields
.field public final A:La/M3;

.field public final B:La/M3;

.field public final C:La/M3;

.field public final D:La/M3;

.field public final E:La/M3;

.field public final F:La/M3;

.field public final G:[La/M3;

.field public final H:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "La/M3;",
            ">;"
        }
    .end annotation
.end field

.field public final I:[Z

.field public final J:[La/N3$a;

.field public K:La/N3;

.field public L:I

.field public M:I

.field public N:F

.field public O:I

.field public P:I

.field public Q:I

.field public R:I

.field public S:I

.field public T:I

.field public U:F

.field public V:F

.field public W:Landroid/view/View;

.field public X:I

.field public Y:Ljava/lang/String;

.field public Z:I

.field public a:Z

.field public a0:I

.field public b:La/U2;

.field public final b0:[F

.field public c:La/U2;

.field public final c0:[La/N3;

.field public final d:La/K8;

.field public final d0:[La/N3;

.field public final e:La/og;

.field public final f:[Z

.field public final g:[I

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public final l:[I

.field public m:I

.field public n:I

.field public o:F

.field public p:I

.field public q:I

.field public r:F

.field public s:I

.field public t:F

.field public final u:[I

.field public v:F

.field public w:Z

.field public x:Z

.field public final y:La/M3;

.field public final z:La/M3;


# direct methods
.method public constructor <init>()V
    .locals 15

    const/4 v0, 0x2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    iput-boolean v1, p0, La/N3;->a:Z

    new-instance v2, La/K8;

    invoke-direct {v2, p0}, La/ih;-><init>(La/N3;)V

    iget-object v3, v2, La/ih;->h:La/V4;

    sget-object v4, La/V4$a;->d:La/V4$a;

    iput-object v4, v3, La/V4;->e:La/V4$a;

    iget-object v3, v2, La/ih;->i:La/V4;

    sget-object v4, La/V4$a;->e:La/V4$a;

    iput-object v4, v3, La/V4;->e:La/V4$a;

    iput v1, v2, La/ih;->f:I

    iput-object v2, p0, La/N3;->d:La/K8;

    new-instance v2, La/og;

    invoke-direct {v2, p0}, La/ih;-><init>(La/N3;)V

    new-instance v3, La/V4;

    invoke-direct {v3, v2}, La/V4;-><init>(La/ih;)V

    iput-object v3, v2, La/og;->k:La/V4;

    const/4 v4, 0x0

    iput-object v4, v2, La/og;->l:La/d2;

    iget-object v5, v2, La/ih;->h:La/V4;

    sget-object v6, La/V4$a;->f:La/V4$a;

    iput-object v6, v5, La/V4;->e:La/V4$a;

    iget-object v5, v2, La/ih;->i:La/V4;

    sget-object v6, La/V4$a;->g:La/V4$a;

    iput-object v6, v5, La/V4;->e:La/V4$a;

    sget-object v5, La/V4$a;->h:La/V4$a;

    iput-object v5, v3, La/V4;->e:La/V4$a;

    const/4 v3, 0x1

    iput v3, v2, La/ih;->f:I

    iput-object v2, p0, La/N3;->e:La/og;

    new-array v2, v0, [Z

    fill-array-data v2, :array_0

    iput-object v2, p0, La/N3;->f:[Z

    filled-new-array {v1, v1, v1, v1}, [I

    move-result-object v2

    iput-object v2, p0, La/N3;->g:[I

    const/4 v2, -0x1

    iput v2, p0, La/N3;->h:I

    iput v2, p0, La/N3;->i:I

    iput v1, p0, La/N3;->j:I

    iput v1, p0, La/N3;->k:I

    new-array v3, v0, [I

    iput-object v3, p0, La/N3;->l:[I

    iput v1, p0, La/N3;->m:I

    iput v1, p0, La/N3;->n:I

    const/high16 v3, 0x3f800000    # 1.0f

    iput v3, p0, La/N3;->o:F

    iput v1, p0, La/N3;->p:I

    iput v1, p0, La/N3;->q:I

    iput v3, p0, La/N3;->r:F

    iput v2, p0, La/N3;->s:I

    iput v3, p0, La/N3;->t:F

    const v3, 0x7fffffff

    filled-new-array {v3, v3}, [I

    move-result-object v3

    iput-object v3, p0, La/N3;->u:[I

    const/4 v3, 0x0

    iput v3, p0, La/N3;->v:F

    iput-boolean v1, p0, La/N3;->w:Z

    new-instance v5, La/M3;

    sget-object v6, La/M3$a;->a:La/M3$a;

    invoke-direct {v5, p0, v6}, La/M3;-><init>(La/N3;La/M3$a;)V

    iput-object v5, p0, La/N3;->y:La/M3;

    new-instance v7, La/M3;

    sget-object v6, La/M3$a;->b:La/M3$a;

    invoke-direct {v7, p0, v6}, La/M3;-><init>(La/N3;La/M3$a;)V

    iput-object v7, p0, La/N3;->z:La/M3;

    new-instance v6, La/M3;

    sget-object v8, La/M3$a;->c:La/M3$a;

    invoke-direct {v6, p0, v8}, La/M3;-><init>(La/N3;La/M3$a;)V

    iput-object v6, p0, La/N3;->A:La/M3;

    new-instance v8, La/M3;

    sget-object v9, La/M3$a;->d:La/M3$a;

    invoke-direct {v8, p0, v9}, La/M3;-><init>(La/N3;La/M3$a;)V

    iput-object v8, p0, La/N3;->B:La/M3;

    new-instance v9, La/M3;

    sget-object v10, La/M3$a;->e:La/M3$a;

    invoke-direct {v9, p0, v10}, La/M3;-><init>(La/N3;La/M3$a;)V

    iput-object v9, p0, La/N3;->C:La/M3;

    new-instance v11, La/M3;

    sget-object v10, La/M3$a;->g:La/M3$a;

    invoke-direct {v11, p0, v10}, La/M3;-><init>(La/N3;La/M3$a;)V

    iput-object v11, p0, La/N3;->D:La/M3;

    new-instance v12, La/M3;

    sget-object v10, La/M3$a;->h:La/M3$a;

    invoke-direct {v12, p0, v10}, La/M3;-><init>(La/N3;La/M3$a;)V

    iput-object v12, p0, La/N3;->E:La/M3;

    new-instance v10, La/M3;

    sget-object v13, La/M3$a;->f:La/M3$a;

    invoke-direct {v10, p0, v13}, La/M3;-><init>(La/N3;La/M3$a;)V

    iput-object v10, p0, La/N3;->F:La/M3;

    filled-new-array/range {v5 .. v10}, [La/M3;

    move-result-object v13

    iput-object v13, p0, La/N3;->G:[La/M3;

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    iput-object v13, p0, La/N3;->H:Ljava/util/ArrayList;

    new-array v14, v0, [Z

    iput-object v14, p0, La/N3;->I:[Z

    sget-object v14, La/N3$a;->a:La/N3$a;

    filled-new-array {v14, v14}, [La/N3$a;

    move-result-object v14

    iput-object v14, p0, La/N3;->J:[La/N3$a;

    iput-object v4, p0, La/N3;->K:La/N3;

    iput v1, p0, La/N3;->L:I

    iput v1, p0, La/N3;->M:I

    iput v3, p0, La/N3;->N:F

    iput v2, p0, La/N3;->O:I

    iput v1, p0, La/N3;->P:I

    iput v1, p0, La/N3;->Q:I

    iput v1, p0, La/N3;->R:I

    const/high16 v2, 0x3f000000    # 0.5f

    iput v2, p0, La/N3;->U:F

    iput v2, p0, La/N3;->V:F

    iput v1, p0, La/N3;->X:I

    iput-object v4, p0, La/N3;->Y:Ljava/lang/String;

    iput v1, p0, La/N3;->Z:I

    iput v1, p0, La/N3;->a0:I

    new-array v0, v0, [F

    fill-array-data v0, :array_1

    iput-object v0, p0, La/N3;->b0:[F

    filled-new-array {v4, v4}, [La/N3;

    move-result-object v0

    iput-object v0, p0, La/N3;->c0:[La/N3;

    filled-new-array {v4, v4}, [La/N3;

    move-result-object v0

    iput-object v0, p0, La/N3;->d0:[La/N3;

    invoke-virtual {v13, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v13, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v13, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v13, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v13, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v13, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v13, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v13, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    nop

    :array_0
    .array-data 1
        0x1t
        0x1t
    .end array-data

    nop

    :array_1
    .array-data 4
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
    .end array-data
.end method


# virtual methods
.method public A(La/B9;)V
    .locals 6

    iget-object v0, p0, La/N3;->y:La/M3;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/B9;->m(Ljava/lang/Object;)I

    move-result p1

    iget-object v0, p0, La/N3;->z:La/M3;

    invoke-static {v0}, La/B9;->m(Ljava/lang/Object;)I

    move-result v0

    iget-object v1, p0, La/N3;->A:La/M3;

    invoke-static {v1}, La/B9;->m(Ljava/lang/Object;)I

    move-result v1

    iget-object v2, p0, La/N3;->B:La/M3;

    invoke-static {v2}, La/B9;->m(Ljava/lang/Object;)I

    move-result v2

    iget-object v3, p0, La/N3;->d:La/K8;

    iget-object v4, v3, La/ih;->h:La/V4;

    iget-boolean v5, v4, La/V4;->j:Z

    if-eqz v5, :cond_0

    iget-object v3, v3, La/ih;->i:La/V4;

    iget-boolean v5, v3, La/V4;->j:Z

    if-eqz v5, :cond_0

    iget p1, v4, La/V4;->g:I

    iget v1, v3, La/V4;->g:I

    :cond_0
    iget-object v3, p0, La/N3;->e:La/og;

    iget-object v4, v3, La/ih;->h:La/V4;

    iget-boolean v5, v4, La/V4;->j:Z

    if-eqz v5, :cond_1

    iget-object v3, v3, La/ih;->i:La/V4;

    iget-boolean v5, v3, La/V4;->j:Z

    if-eqz v5, :cond_1

    iget v0, v4, La/V4;->g:I

    iget v2, v3, La/V4;->g:I

    :cond_1
    sub-int v3, v1, p1

    sub-int v4, v2, v0

    const/4 v5, 0x0

    if-ltz v3, :cond_2

    if-ltz v4, :cond_2

    const/high16 v3, -0x80000000

    if-eq p1, v3, :cond_2

    const v4, 0x7fffffff

    if-eq p1, v4, :cond_2

    if-eq v0, v3, :cond_2

    if-eq v0, v4, :cond_2

    if-eq v1, v3, :cond_2

    if-eq v1, v4, :cond_2

    if-eq v2, v3, :cond_2

    if-ne v2, v4, :cond_3

    :cond_2
    move p1, v5

    move v0, p1

    move v1, v0

    move v2, v1

    :cond_3
    sub-int/2addr v1, p1

    sub-int/2addr v2, v0

    iput p1, p0, La/N3;->P:I

    iput v0, p0, La/N3;->Q:I

    iget p1, p0, La/N3;->X:I

    const/16 v0, 0x8

    if-ne p1, v0, :cond_4

    iput v5, p0, La/N3;->L:I

    iput v5, p0, La/N3;->M:I

    return-void

    :cond_4
    iget-object p1, p0, La/N3;->J:[La/N3$a;

    aget-object v0, p1, v5

    sget-object v3, La/N3$a;->a:La/N3$a;

    if-ne v0, v3, :cond_5

    iget v0, p0, La/N3;->L:I

    if-ge v1, v0, :cond_5

    move v1, v0

    :cond_5
    const/4 v0, 0x1

    aget-object p1, p1, v0

    if-ne p1, v3, :cond_6

    iget p1, p0, La/N3;->M:I

    if-ge v2, p1, :cond_6

    move v2, p1

    :cond_6
    iput v1, p0, La/N3;->L:I

    iput v2, p0, La/N3;->M:I

    iget p1, p0, La/N3;->T:I

    if-ge v2, p1, :cond_7

    iput p1, p0, La/N3;->M:I

    :cond_7
    iget p1, p0, La/N3;->S:I

    if-ge v1, p1, :cond_8

    iput p1, p0, La/N3;->L:I

    :cond_8
    return-void
.end method

.method public a(La/B9;)V
    .locals 58

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, La/N3;->y:La/M3;

    invoke-virtual {v1, v2}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v3

    iget-object v4, v0, La/N3;->A:La/M3;

    invoke-virtual {v1, v4}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v5

    iget-object v6, v0, La/N3;->z:La/M3;

    invoke-virtual {v1, v6}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v7

    iget-object v8, v0, La/N3;->B:La/M3;

    invoke-virtual {v1, v8}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v9

    iget-object v10, v0, La/N3;->C:La/M3;

    invoke-virtual {v1, v10}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v11

    iget-object v12, v0, La/N3;->d:La/K8;

    iget-object v13, v12, La/ih;->h:La/V4;

    iget-boolean v14, v13, La/V4;->j:Z

    sget-object v15, La/N3$a;->b:La/N3$a;

    move-object/from16 v16, v10

    iget-object v10, v0, La/N3;->f:[Z

    move-object/from16 v17, v10

    iget-object v10, v0, La/N3;->e:La/og;

    move/from16 v18, v14

    const/16 v20, 0x1

    if-eqz v18, :cond_3

    const/16 v18, 0x0

    iget-object v14, v12, La/ih;->i:La/V4;

    iget-boolean v14, v14, La/V4;->j:Z

    if-eqz v14, :cond_3

    iget-object v14, v10, La/ih;->h:La/V4;

    iget-boolean v14, v14, La/V4;->j:Z

    if-eqz v14, :cond_3

    iget-object v14, v10, La/ih;->i:La/V4;

    iget-boolean v14, v14, La/V4;->j:Z

    if-eqz v14, :cond_3

    iget v2, v13, La/V4;->g:I

    invoke-virtual {v1, v3, v2}, La/B9;->d(La/le;I)V

    iget-object v2, v12, La/ih;->i:La/V4;

    iget v2, v2, La/V4;->g:I

    invoke-virtual {v1, v5, v2}, La/B9;->d(La/le;I)V

    iget-object v2, v10, La/ih;->h:La/V4;

    iget v2, v2, La/V4;->g:I

    invoke-virtual {v1, v7, v2}, La/B9;->d(La/le;I)V

    iget-object v2, v10, La/ih;->i:La/V4;

    iget v2, v2, La/V4;->g:I

    invoke-virtual {v1, v9, v2}, La/B9;->d(La/le;I)V

    iget-object v2, v10, La/og;->k:La/V4;

    iget v2, v2, La/V4;->g:I

    invoke-virtual {v1, v11, v2}, La/B9;->d(La/le;I)V

    iget-object v2, v0, La/N3;->K:La/N3;

    if-eqz v2, :cond_40

    iget-object v2, v2, La/N3;->J:[La/N3$a;

    aget-object v3, v2, v18

    if-ne v3, v15, :cond_0

    move/from16 v3, v20

    goto :goto_0

    :cond_0
    move/from16 v3, v18

    :goto_0
    aget-object v2, v2, v20

    if-ne v2, v15, :cond_1

    move/from16 v2, v20

    goto :goto_1

    :cond_1
    move/from16 v2, v18

    :goto_1
    if-eqz v3, :cond_2

    aget-boolean v3, v17, v18

    if-eqz v3, :cond_2

    invoke-virtual {v0}, La/N3;->q()Z

    move-result v3

    if-nez v3, :cond_2

    iget-object v3, v0, La/N3;->K:La/N3;

    iget-object v3, v3, La/N3;->A:La/M3;

    invoke-virtual {v1, v3}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v3

    move/from16 v6, v18

    const/16 v4, 0x8

    invoke-virtual {v1, v3, v5, v6, v4}, La/B9;->f(La/le;La/le;II)V

    :cond_2
    if-eqz v2, :cond_40

    aget-boolean v2, v17, v20

    if-eqz v2, :cond_40

    invoke-virtual {v0}, La/N3;->r()Z

    move-result v2

    if-nez v2, :cond_40

    iget-object v2, v0, La/N3;->K:La/N3;

    iget-object v2, v2, La/N3;->B:La/M3;

    invoke-virtual {v1, v2}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v2

    const/16 v4, 0x8

    const/4 v6, 0x0

    invoke-virtual {v1, v2, v9, v6, v4}, La/B9;->f(La/le;La/le;II)V

    return-void

    :cond_3
    iget-object v13, v0, La/N3;->K:La/N3;

    if-eqz v13, :cond_b

    iget-object v13, v13, La/N3;->J:[La/N3$a;

    const/16 v18, 0x0

    aget-object v14, v13, v18

    if-ne v14, v15, :cond_4

    move/from16 v14, v20

    goto :goto_2

    :cond_4
    move/from16 v14, v18

    :goto_2
    aget-object v13, v13, v20

    move-object/from16 v21, v7

    move/from16 v7, v18

    if-ne v13, v15, :cond_5

    move/from16 v13, v20

    goto :goto_3

    :cond_5
    move v13, v7

    :goto_3
    invoke-virtual {v0, v7}, La/N3;->p(I)Z

    move-result v18

    if-eqz v18, :cond_6

    move-object/from16 v22, v10

    iget-object v10, v0, La/N3;->K:La/N3;

    check-cast v10, La/O3;

    invoke-virtual {v10, v0, v7}, La/O3;->C(La/N3;I)V

    move/from16 v7, v20

    move v10, v7

    goto :goto_4

    :cond_6
    move-object/from16 v22, v10

    invoke-virtual {v0}, La/N3;->q()Z

    move-result v7

    move/from16 v10, v20

    :goto_4
    invoke-virtual {v0, v10}, La/N3;->p(I)Z

    move-result v20

    if-eqz v20, :cond_7

    move/from16 v23, v7

    iget-object v7, v0, La/N3;->K:La/N3;

    check-cast v7, La/O3;

    invoke-virtual {v7, v0, v10}, La/O3;->C(La/N3;I)V

    const/4 v7, 0x1

    goto :goto_5

    :cond_7
    move/from16 v23, v7

    invoke-virtual {v0}, La/N3;->r()Z

    move-result v7

    :goto_5
    if-nez v23, :cond_9

    if-eqz v14, :cond_9

    iget v10, v0, La/N3;->X:I

    move/from16 v24, v7

    const/16 v7, 0x8

    if-eq v10, v7, :cond_8

    iget-object v7, v2, La/M3;->d:La/M3;

    if-nez v7, :cond_8

    iget-object v7, v4, La/M3;->d:La/M3;

    if-nez v7, :cond_8

    iget-object v7, v0, La/N3;->K:La/N3;

    iget-object v7, v7, La/N3;->A:La/M3;

    invoke-virtual {v1, v7}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v7

    move-object/from16 v25, v2

    const/4 v2, 0x0

    const/4 v10, 0x1

    invoke-virtual {v1, v7, v5, v2, v10}, La/B9;->f(La/le;La/le;II)V

    goto :goto_6

    :cond_8
    move-object/from16 v25, v2

    goto :goto_6

    :cond_9
    move-object/from16 v25, v2

    move/from16 v24, v7

    :goto_6
    if-nez v24, :cond_a

    if-eqz v13, :cond_a

    iget v2, v0, La/N3;->X:I

    const/16 v7, 0x8

    if-eq v2, v7, :cond_a

    iget-object v2, v6, La/M3;->d:La/M3;

    if-nez v2, :cond_a

    iget-object v2, v8, La/M3;->d:La/M3;

    if-nez v2, :cond_a

    if-nez v16, :cond_a

    iget-object v2, v0, La/N3;->K:La/N3;

    iget-object v2, v2, La/N3;->B:La/M3;

    invoke-virtual {v1, v2}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v2

    const/4 v7, 0x0

    const/4 v10, 0x1

    invoke-virtual {v1, v2, v9, v7, v10}, La/B9;->f(La/le;La/le;II)V

    :cond_a
    move-object v2, v4

    move v4, v13

    goto :goto_7

    :cond_b
    move-object/from16 v25, v2

    move-object/from16 v21, v7

    move-object/from16 v22, v10

    move-object v2, v4

    const/4 v4, 0x0

    const/4 v14, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    :goto_7
    iget v7, v0, La/N3;->L:I

    iget v10, v0, La/N3;->S:I

    if-ge v7, v10, :cond_c

    goto :goto_8

    :cond_c
    move v10, v7

    :goto_8
    iget v13, v0, La/N3;->M:I

    move-object/from16 v26, v2

    iget v2, v0, La/N3;->T:I

    if-ge v13, v2, :cond_d

    move/from16 v27, v2

    goto :goto_9

    :cond_d
    move/from16 v27, v13

    :goto_9
    iget-object v2, v0, La/N3;->J:[La/N3$a;

    move-object/from16 v28, v2

    const/16 v18, 0x0

    aget-object v2, v28, v18

    move/from16 v29, v4

    sget-object v4, La/N3$a;->c:La/N3$a;

    if-eq v2, v4, :cond_e

    const/16 v30, 0x1

    :goto_a
    move-object/from16 v31, v6

    const/16 v20, 0x1

    goto :goto_b

    :cond_e
    const/16 v30, 0x0

    goto :goto_a

    :goto_b
    aget-object v6, v28, v20

    if-eq v6, v4, :cond_f

    const/16 v32, 0x1

    :goto_c
    move-object/from16 v33, v8

    goto :goto_d

    :cond_f
    const/16 v32, 0x0

    goto :goto_c

    :goto_d
    iget v8, v0, La/N3;->O:I

    iput v8, v0, La/N3;->s:I

    move-object/from16 v34, v9

    iget v9, v0, La/N3;->N:F

    iput v9, v0, La/N3;->t:F

    move/from16 v35, v9

    iget v9, v0, La/N3;->j:I

    move/from16 v36, v9

    iget v9, v0, La/N3;->k:I

    const/16 v37, 0x0

    cmpl-float v37, v35, v37

    move/from16 v38, v9

    const/high16 v39, 0x3f800000    # 1.0f

    if-lez v37, :cond_23

    iget v9, v0, La/N3;->X:I

    move/from16 v40, v10

    const/16 v10, 0x8

    if-eq v9, v10, :cond_22

    const/4 v9, 0x3

    if-ne v2, v4, :cond_10

    if-nez v36, :cond_10

    move v10, v9

    goto :goto_e

    :cond_10
    move/from16 v10, v36

    :goto_e
    if-ne v6, v4, :cond_11

    if-nez v38, :cond_11

    move/from16 v41, v9

    goto :goto_f

    :cond_11
    move/from16 v41, v38

    :goto_f
    if-ne v2, v4, :cond_1c

    if-ne v6, v4, :cond_1c

    if-ne v10, v9, :cond_1c

    move-object/from16 v42, v11

    move/from16 v11, v41

    if-ne v11, v9, :cond_1d

    const/4 v9, -0x1

    if-ne v8, v9, :cond_13

    if-eqz v30, :cond_12

    if-nez v32, :cond_12

    const/4 v6, 0x0

    iput v6, v0, La/N3;->s:I

    goto :goto_10

    :cond_12
    if-nez v30, :cond_13

    if-eqz v32, :cond_13

    const/4 v2, 0x1

    iput v2, v0, La/N3;->s:I

    if-ne v8, v9, :cond_13

    div-float v9, v39, v35

    iput v9, v0, La/N3;->t:F

    :cond_13
    :goto_10
    iget v2, v0, La/N3;->s:I

    if-nez v2, :cond_15

    invoke-virtual/range {v31 .. v31}, La/M3;->f()Z

    move-result v2

    if-eqz v2, :cond_14

    invoke-virtual/range {v33 .. v33}, La/M3;->f()Z

    move-result v2

    if-nez v2, :cond_15

    :cond_14
    const/4 v2, 0x1

    goto :goto_11

    :cond_15
    const/4 v2, 0x1

    goto :goto_12

    :goto_11
    iput v2, v0, La/N3;->s:I

    goto :goto_13

    :goto_12
    iget v4, v0, La/N3;->s:I

    if-ne v4, v2, :cond_17

    invoke-virtual/range {v25 .. v25}, La/M3;->f()Z

    move-result v2

    if-eqz v2, :cond_16

    invoke-virtual/range {v26 .. v26}, La/M3;->f()Z

    move-result v2

    if-nez v2, :cond_17

    :cond_16
    const/4 v6, 0x0

    iput v6, v0, La/N3;->s:I

    :cond_17
    :goto_13
    iget v2, v0, La/N3;->s:I

    const/4 v9, -0x1

    if-ne v2, v9, :cond_1a

    invoke-virtual/range {v31 .. v31}, La/M3;->f()Z

    move-result v2

    if-eqz v2, :cond_18

    invoke-virtual/range {v33 .. v33}, La/M3;->f()Z

    move-result v2

    if-eqz v2, :cond_18

    invoke-virtual/range {v25 .. v25}, La/M3;->f()Z

    move-result v2

    if-eqz v2, :cond_18

    invoke-virtual/range {v26 .. v26}, La/M3;->f()Z

    move-result v2

    if-nez v2, :cond_1a

    :cond_18
    invoke-virtual/range {v31 .. v31}, La/M3;->f()Z

    move-result v2

    if-eqz v2, :cond_19

    invoke-virtual/range {v33 .. v33}, La/M3;->f()Z

    move-result v2

    if-eqz v2, :cond_19

    const/4 v6, 0x0

    iput v6, v0, La/N3;->s:I

    goto :goto_14

    :cond_19
    invoke-virtual/range {v25 .. v25}, La/M3;->f()Z

    move-result v2

    if-eqz v2, :cond_1a

    invoke-virtual/range {v26 .. v26}, La/M3;->f()Z

    move-result v2

    if-eqz v2, :cond_1a

    iget v2, v0, La/N3;->t:F

    div-float v9, v39, v2

    iput v9, v0, La/N3;->t:F

    const/4 v2, 0x1

    iput v2, v0, La/N3;->s:I

    :cond_1a
    :goto_14
    iget v2, v0, La/N3;->s:I

    const/4 v9, -0x1

    if-ne v2, v9, :cond_1e

    iget v2, v0, La/N3;->m:I

    if-lez v2, :cond_1b

    iget v4, v0, La/N3;->p:I

    if-nez v4, :cond_1b

    const/4 v6, 0x0

    iput v6, v0, La/N3;->s:I

    goto :goto_16

    :cond_1b
    if-nez v2, :cond_1e

    iget v2, v0, La/N3;->p:I

    if-lez v2, :cond_1e

    iget v2, v0, La/N3;->t:F

    div-float v9, v39, v2

    iput v9, v0, La/N3;->t:F

    const/4 v2, 0x1

    iput v2, v0, La/N3;->s:I

    goto :goto_16

    :cond_1c
    move-object/from16 v42, v11

    move/from16 v11, v41

    :cond_1d
    if-ne v2, v4, :cond_20

    const/4 v9, 0x3

    if-ne v10, v9, :cond_20

    const/4 v9, 0x0

    iput v9, v0, La/N3;->s:I

    int-to-float v2, v13

    mul-float v9, v35, v2

    float-to-int v2, v9

    move/from16 v40, v2

    if-eq v6, v4, :cond_1e

    move-object/from16 v2, v22

    const/4 v9, 0x4

    const/16 v30, 0x0

    :goto_15
    move/from16 v22, v11

    goto :goto_1a

    :cond_1e
    :goto_16
    move v9, v10

    :cond_1f
    move-object/from16 v2, v22

    const/16 v30, 0x1

    goto :goto_15

    :cond_20
    if-ne v6, v4, :cond_1e

    const/4 v9, 0x3

    if-ne v11, v9, :cond_1e

    const/4 v6, 0x1

    iput v6, v0, La/N3;->s:I

    const/4 v9, -0x1

    if-ne v8, v9, :cond_21

    div-float v9, v39, v35

    iput v9, v0, La/N3;->t:F

    :cond_21
    iget v6, v0, La/N3;->t:F

    int-to-float v7, v7

    mul-float/2addr v6, v7

    float-to-int v6, v6

    move/from16 v27, v6

    move v9, v10

    if-eq v2, v4, :cond_1f

    move-object/from16 v2, v22

    const/16 v22, 0x4

    :goto_17
    const/16 v30, 0x0

    goto :goto_1a

    :cond_22
    :goto_18
    move-object/from16 v42, v11

    goto :goto_19

    :cond_23
    move/from16 v40, v10

    goto :goto_18

    :goto_19
    move-object/from16 v2, v22

    move/from16 v9, v36

    move/from16 v22, v38

    goto :goto_17

    :goto_1a
    iget-object v4, v0, La/N3;->l:[I

    const/16 v18, 0x0

    aput v9, v4, v18

    const/16 v20, 0x1

    aput v22, v4, v20

    if-eqz v30, :cond_25

    iget v4, v0, La/N3;->s:I

    const/4 v6, -0x1

    if-eqz v4, :cond_24

    if-ne v4, v6, :cond_26

    :cond_24
    const/4 v4, 0x1

    :goto_1b
    const/16 v18, 0x0

    goto :goto_1c

    :cond_25
    const/4 v6, -0x1

    :cond_26
    const/4 v4, 0x0

    goto :goto_1b

    :goto_1c
    aget-object v7, v28, v18

    if-ne v7, v15, :cond_27

    instance-of v7, v0, La/O3;

    if-eqz v7, :cond_27

    move-object/from16 v7, v21

    move/from16 v21, v9

    const/4 v9, 0x1

    goto :goto_1d

    :cond_27
    move-object/from16 v7, v21

    move/from16 v21, v9

    const/4 v9, 0x0

    :goto_1d
    if-eqz v9, :cond_28

    const/4 v13, 0x0

    goto :goto_1e

    :cond_28
    move/from16 v13, v40

    :goto_1e
    iget-object v8, v0, La/N3;->F:La/M3;

    invoke-virtual {v8}, La/M3;->f()Z

    move-result v10

    const/16 v20, 0x1

    xor-int/lit8 v26, v10, 0x1

    iget-object v10, v0, La/N3;->I:[Z

    move/from16 v11, v20

    const/16 v18, 0x0

    aget-boolean v20, v10, v18

    aget-boolean v31, v10, v11

    iget v10, v0, La/N3;->h:I

    move-object/from16 v25, v2

    iget-object v2, v0, La/N3;->u:[I

    move-object/from16 v32, v2

    const/4 v2, 0x2

    const/16 v35, 0x0

    if-eq v10, v2, :cond_2e

    iget-object v10, v12, La/ih;->h:La/V4;

    iget-boolean v2, v10, La/V4;->j:Z

    if-eqz v2, :cond_29

    iget-object v2, v12, La/ih;->i:La/V4;

    iget-boolean v2, v2, La/V4;->j:Z

    if-nez v2, :cond_2a

    :cond_29
    const/16 v10, 0x8

    goto :goto_1f

    :cond_2a
    iget v2, v10, La/V4;->g:I

    invoke-virtual {v1, v3, v2}, La/B9;->d(La/le;I)V

    iget-object v2, v12, La/ih;->i:La/V4;

    iget v2, v2, La/V4;->g:I

    invoke-virtual {v1, v5, v2}, La/B9;->d(La/le;I)V

    iget-object v2, v0, La/N3;->K:La/N3;

    if-eqz v2, :cond_2b

    if-eqz v14, :cond_2b

    const/4 v2, 0x0

    aget-boolean v4, v17, v2

    if-eqz v4, :cond_2b

    invoke-virtual {v0}, La/N3;->q()Z

    move-result v4

    if-nez v4, :cond_2b

    iget-object v4, v0, La/N3;->K:La/N3;

    iget-object v4, v4, La/N3;->A:La/M3;

    invoke-virtual {v1, v4}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v4

    const/16 v10, 0x8

    invoke-virtual {v1, v4, v5, v2, v10}, La/B9;->f(La/le;La/le;II)V

    :cond_2b
    move-object/from16 v47, v3

    move-object/from16 v48, v5

    move-object/from16 v49, v7

    move-object/from16 v37, v8

    move v3, v14

    move-object/from16 v54, v15

    move-object/from16 v52, v16

    move/from16 v18, v23

    move/from16 v19, v24

    move-object/from16 v2, v25

    move/from16 v4, v29

    move-object/from16 v50, v33

    move-object/from16 v51, v34

    move-object/from16 v53, v42

    move-object/from16 v29, v28

    move-object/from16 v28, v17

    goto/16 :goto_23

    :goto_1f
    iget-object v2, v0, La/N3;->K:La/N3;

    if-eqz v2, :cond_2c

    iget-object v2, v2, La/N3;->A:La/M3;

    invoke-virtual {v1, v2}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v2

    goto :goto_20

    :cond_2c
    move-object/from16 v2, v35

    :goto_20
    iget-object v12, v0, La/N3;->K:La/N3;

    if-eqz v12, :cond_2d

    iget-object v12, v12, La/N3;->y:La/M3;

    invoke-virtual {v1, v12}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v12

    :goto_21
    move-object/from16 v19, v5

    const/16 v18, 0x0

    goto :goto_22

    :cond_2d
    move-object/from16 v12, v35

    goto :goto_21

    :goto_22
    aget-boolean v5, v17, v18

    move-object/from16 v37, v8

    aget-object v8, v28, v18

    move/from16 v38, v6

    move-object v6, v12

    iget v12, v0, La/N3;->P:I

    move-object/from16 v40, v3

    move v3, v14

    iget v14, v0, La/N3;->S:I

    move-object/from16 v41, v15

    aget v15, v32, v18

    iget v10, v0, La/N3;->U:F

    iget v11, v0, La/N3;->m:I

    iget v1, v0, La/N3;->n:I

    move/from16 v43, v1

    iget v1, v0, La/N3;->o:F

    move-object/from16 v44, v16

    move/from16 v16, v10

    iget-object v10, v0, La/N3;->y:La/M3;

    move/from16 v45, v18

    move/from16 v18, v23

    move/from16 v23, v11

    iget-object v11, v0, La/N3;->A:La/M3;

    move-object/from16 v46, v7

    move-object v7, v2

    const/4 v2, 0x1

    move-object/from16 v47, v17

    move/from16 v17, v4

    move/from16 v4, v29

    move-object/from16 v29, v28

    move-object/from16 v28, v47

    move-object/from16 v48, v19

    move/from16 v19, v24

    move-object/from16 v55, v25

    move-object/from16 v50, v33

    move-object/from16 v51, v34

    move-object/from16 v47, v40

    move-object/from16 v54, v41

    move-object/from16 v53, v42

    move/from16 v24, v43

    move-object/from16 v52, v44

    move-object/from16 v49, v46

    move/from16 v25, v1

    move-object/from16 v1, p1

    invoke-virtual/range {v0 .. v26}, La/N3;->c(La/B9;ZZZZLa/le;La/le;La/N3$a;ZLa/M3;La/M3;IIIIFZZZZIIIIFZ)V

    move-object/from16 v2, v55

    goto :goto_23

    :cond_2e
    move-object/from16 v47, v3

    move-object/from16 v48, v5

    move-object/from16 v49, v7

    move-object/from16 v37, v8

    move v3, v14

    move-object/from16 v54, v15

    move-object/from16 v52, v16

    move/from16 v18, v23

    move/from16 v19, v24

    move/from16 v4, v29

    move-object/from16 v50, v33

    move-object/from16 v51, v34

    move-object/from16 v53, v42

    move-object/from16 v29, v28

    move-object/from16 v28, v17

    move-object/from16 v2, v25

    :goto_23
    iget-object v5, v2, La/ih;->h:La/V4;

    iget-boolean v6, v5, La/V4;->j:Z

    if-eqz v6, :cond_31

    iget-object v6, v2, La/ih;->i:La/V4;

    iget-boolean v6, v6, La/V4;->j:Z

    if-eqz v6, :cond_31

    iget v5, v5, La/V4;->g:I

    move-object/from16 v6, v49

    invoke-virtual {v1, v6, v5}, La/B9;->d(La/le;I)V

    iget-object v5, v2, La/ih;->i:La/V4;

    iget v5, v5, La/V4;->g:I

    move-object/from16 v7, v51

    invoke-virtual {v1, v7, v5}, La/B9;->d(La/le;I)V

    iget-object v2, v2, La/og;->k:La/V4;

    iget v2, v2, La/V4;->g:I

    move-object/from16 v5, v53

    invoke-virtual {v1, v5, v2}, La/B9;->d(La/le;I)V

    iget-object v2, v0, La/N3;->K:La/N3;

    if-eqz v2, :cond_30

    if-nez v19, :cond_30

    if-eqz v4, :cond_30

    const/4 v8, 0x1

    aget-boolean v9, v28, v8

    if-eqz v9, :cond_2f

    iget-object v2, v2, La/N3;->B:La/M3;

    invoke-virtual {v1, v2}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v2

    const/4 v9, 0x0

    const/16 v10, 0x8

    invoke-virtual {v1, v2, v7, v9, v10}, La/B9;->f(La/le;La/le;II)V

    goto :goto_25

    :cond_2f
    :goto_24
    const/4 v9, 0x0

    const/16 v10, 0x8

    goto :goto_25

    :cond_30
    const/4 v8, 0x1

    goto :goto_24

    :goto_25
    move v14, v9

    goto :goto_26

    :cond_31
    move-object/from16 v6, v49

    move-object/from16 v7, v51

    move-object/from16 v5, v53

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/16 v10, 0x8

    move v14, v8

    :goto_26
    iget v2, v0, La/N3;->i:I

    const/4 v11, 0x2

    if-ne v2, v11, :cond_32

    move v14, v9

    :cond_32
    if-eqz v14, :cond_3d

    aget-object v2, v29, v8

    move-object/from16 v11, v54

    if-ne v2, v11, :cond_33

    instance-of v2, v0, La/O3;

    if-eqz v2, :cond_33

    move v14, v8

    goto :goto_27

    :cond_33
    move v14, v9

    :goto_27
    if-eqz v14, :cond_34

    move v13, v9

    goto :goto_28

    :cond_34
    move/from16 v13, v27

    :goto_28
    if-eqz v30, :cond_36

    iget v2, v0, La/N3;->s:I

    if-eq v2, v8, :cond_35

    const/4 v11, -0x1

    if-ne v2, v11, :cond_36

    :cond_35
    move/from16 v17, v8

    goto :goto_29

    :cond_36
    move/from16 v17, v9

    :goto_29
    iget-object v2, v0, La/N3;->K:La/N3;

    if-eqz v2, :cond_37

    iget-object v2, v2, La/N3;->B:La/M3;

    invoke-virtual {v1, v2}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v2

    goto :goto_2a

    :cond_37
    move-object/from16 v2, v35

    :goto_2a
    iget-object v11, v0, La/N3;->K:La/N3;

    if-eqz v11, :cond_38

    iget-object v11, v11, La/N3;->z:La/M3;

    invoke-virtual {v1, v11}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v35

    :cond_38
    iget v11, v0, La/N3;->R:I

    if-gtz v11, :cond_39

    iget v12, v0, La/N3;->X:I

    if-ne v12, v10, :cond_3c

    :cond_39
    invoke-virtual {v1, v5, v6, v11, v10}, La/B9;->e(La/le;La/le;II)V

    move-object/from16 v11, v52

    iget-object v11, v11, La/M3;->d:La/M3;

    if-eqz v11, :cond_3b

    invoke-virtual {v1, v11}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v11

    invoke-virtual {v1, v5, v11, v9, v10}, La/B9;->e(La/le;La/le;II)V

    if-eqz v4, :cond_3a

    move-object/from16 v5, v50

    invoke-virtual {v1, v5}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v5

    const/4 v10, 0x5

    invoke-virtual {v1, v2, v5, v9, v10}, La/B9;->f(La/le;La/le;II)V

    :cond_3a
    move/from16 v26, v9

    goto :goto_2b

    :cond_3b
    iget v11, v0, La/N3;->X:I

    if-ne v11, v10, :cond_3c

    invoke-virtual {v1, v5, v6, v9, v10}, La/B9;->e(La/le;La/le;II)V

    :cond_3c
    :goto_2b
    aget-boolean v5, v28, v8

    aget-object v9, v29, v8

    iget v12, v0, La/N3;->Q:I

    move/from16 v20, v8

    move-object v8, v9

    move v9, v14

    iget v14, v0, La/N3;->T:I

    aget v15, v32, v20

    iget v10, v0, La/N3;->V:F

    iget v11, v0, La/N3;->p:I

    iget v1, v0, La/N3;->q:I

    move/from16 v24, v1

    iget v1, v0, La/N3;->r:F

    move/from16 v16, v10

    iget-object v10, v0, La/N3;->z:La/M3;

    move/from16 v23, v11

    iget-object v11, v0, La/N3;->B:La/M3;

    move-object/from16 v34, v7

    move-object v7, v2

    const/4 v2, 0x0

    move/from16 v20, v4

    move v4, v3

    move/from16 v3, v20

    move/from16 v20, v19

    move/from16 v19, v18

    move/from16 v18, v20

    move/from16 v20, v22

    move/from16 v22, v21

    move/from16 v21, v20

    move/from16 v25, v1

    move-object/from16 v56, v6

    move/from16 v20, v31

    move-object/from16 v57, v34

    move-object/from16 v6, v35

    move-object/from16 v1, p1

    invoke-virtual/range {v0 .. v26}, La/N3;->c(La/B9;ZZZZLa/le;La/le;La/N3$a;ZLa/M3;La/M3;IIIIFZZZZIIIIFZ)V

    goto :goto_2c

    :cond_3d
    move-object/from16 v56, v6

    move-object/from16 v57, v7

    :goto_2c
    if-eqz v30, :cond_3f

    iget v2, v0, La/N3;->s:I

    const/high16 v3, -0x40800000    # -1.0f

    const/4 v10, 0x1

    if-ne v2, v10, :cond_3e

    iget v2, v0, La/N3;->t:F

    invoke-virtual {v1}, La/B9;->k()La/K1;

    move-result-object v4

    iget-object v5, v4, La/K1;->d:La/K1$a;

    move-object/from16 v7, v57

    invoke-interface {v5, v7, v3}, La/K1$a;->c(La/le;F)V

    iget-object v3, v4, La/K1;->d:La/K1$a;

    move-object/from16 v6, v56

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-interface {v3, v6, v5}, La/K1$a;->c(La/le;F)V

    iget-object v3, v4, La/K1;->d:La/K1$a;

    move-object/from16 v8, v48

    invoke-interface {v3, v8, v2}, La/K1$a;->c(La/le;F)V

    iget-object v3, v4, La/K1;->d:La/K1$a;

    neg-float v2, v2

    move-object/from16 v9, v47

    invoke-interface {v3, v9, v2}, La/K1$a;->c(La/le;F)V

    invoke-virtual {v1, v4}, La/B9;->c(La/K1;)V

    goto :goto_2d

    :cond_3e
    move-object/from16 v9, v47

    move-object/from16 v8, v48

    move-object/from16 v6, v56

    move-object/from16 v7, v57

    const/high16 v5, 0x3f800000    # 1.0f

    iget v2, v0, La/N3;->t:F

    invoke-virtual {v1}, La/B9;->k()La/K1;

    move-result-object v4

    iget-object v10, v4, La/K1;->d:La/K1$a;

    invoke-interface {v10, v8, v3}, La/K1$a;->c(La/le;F)V

    iget-object v3, v4, La/K1;->d:La/K1$a;

    invoke-interface {v3, v9, v5}, La/K1$a;->c(La/le;F)V

    iget-object v3, v4, La/K1;->d:La/K1$a;

    invoke-interface {v3, v7, v2}, La/K1$a;->c(La/le;F)V

    iget-object v3, v4, La/K1;->d:La/K1$a;

    neg-float v2, v2

    invoke-interface {v3, v6, v2}, La/K1$a;->c(La/le;F)V

    invoke-virtual {v1, v4}, La/B9;->c(La/K1;)V

    :cond_3f
    :goto_2d
    invoke-virtual/range {v37 .. v37}, La/M3;->f()Z

    move-result v2

    if-eqz v2, :cond_40

    move-object/from16 v2, v37

    iget-object v3, v2, La/M3;->d:La/M3;

    iget-object v3, v3, La/M3;->b:La/N3;

    iget v4, v0, La/N3;->v:F

    const/high16 v5, 0x42b40000    # 90.0f

    add-float/2addr v4, v5

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    double-to-float v4, v4

    invoke-virtual {v2}, La/M3;->c()I

    move-result v2

    sget-object v5, La/M3$a;->a:La/M3$a;

    invoke-virtual {v0, v5}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object v6

    invoke-virtual {v1, v6}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v6

    sget-object v7, La/M3$a;->b:La/M3$a;

    invoke-virtual {v0, v7}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object v8

    invoke-virtual {v1, v8}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v8

    sget-object v9, La/M3$a;->c:La/M3$a;

    invoke-virtual {v0, v9}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object v10

    invoke-virtual {v1, v10}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v10

    sget-object v11, La/M3$a;->d:La/M3$a;

    invoke-virtual {v0, v11}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object v12

    invoke-virtual {v1, v12}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v12

    invoke-virtual {v3, v5}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object v5

    invoke-virtual {v1, v5}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v5

    invoke-virtual {v3, v7}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object v7

    invoke-virtual {v1, v7}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v7

    invoke-virtual {v3, v9}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object v9

    invoke-virtual {v1, v9}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v9

    invoke-virtual {v3, v11}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object v3

    invoke-virtual {v1, v3}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v3

    invoke-virtual {v1}, La/B9;->k()La/K1;

    move-result-object v11

    float-to-double v13, v4

    invoke-static {v13, v14}, Ljava/lang/Math;->sin(D)D

    move-result-wide v15

    move-wide/from16 v17, v13

    int-to-double v13, v2

    move-wide/from16 v19, v13

    mul-double v13, v15, v19

    double-to-float v2, v13

    iget-object v4, v11, La/K1;->d:La/K1$a;

    const/high16 v13, 0x3f000000    # 0.5f

    invoke-interface {v4, v7, v13}, La/K1$a;->c(La/le;F)V

    iget-object v4, v11, La/K1;->d:La/K1$a;

    invoke-interface {v4, v3, v13}, La/K1$a;->c(La/le;F)V

    iget-object v3, v11, La/K1;->d:La/K1$a;

    const/high16 v4, -0x41000000    # -0.5f

    invoke-interface {v3, v8, v4}, La/K1$a;->c(La/le;F)V

    iget-object v3, v11, La/K1;->d:La/K1$a;

    invoke-interface {v3, v12, v4}, La/K1$a;->c(La/le;F)V

    neg-float v2, v2

    iput v2, v11, La/K1;->b:F

    invoke-virtual {v1, v11}, La/B9;->c(La/K1;)V

    invoke-virtual {v1}, La/B9;->k()La/K1;

    move-result-object v2

    invoke-static/range {v17 .. v18}, Ljava/lang/Math;->cos(D)D

    move-result-wide v7

    mul-double v7, v7, v19

    double-to-float v3, v7

    iget-object v7, v2, La/K1;->d:La/K1$a;

    invoke-interface {v7, v5, v13}, La/K1$a;->c(La/le;F)V

    iget-object v5, v2, La/K1;->d:La/K1$a;

    invoke-interface {v5, v9, v13}, La/K1$a;->c(La/le;F)V

    iget-object v5, v2, La/K1;->d:La/K1$a;

    invoke-interface {v5, v6, v4}, La/K1$a;->c(La/le;F)V

    iget-object v5, v2, La/K1;->d:La/K1$a;

    invoke-interface {v5, v10, v4}, La/K1$a;->c(La/le;F)V

    neg-float v3, v3

    iput v3, v2, La/K1;->b:F

    invoke-virtual {v1, v2}, La/B9;->c(La/K1;)V

    :cond_40
    return-void
.end method

.method public b()Z
    .locals 2

    iget v0, p0, La/N3;->X:I

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final c(La/B9;ZZZZLa/le;La/le;La/N3$a;ZLa/M3;La/M3;IIIIFZZZZIIIIFZ)V
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    move/from16 v14, p14

    move/from16 v2, p15

    move/from16 v4, p23

    move/from16 v5, p24

    move/from16 v6, p25

    invoke-virtual {v1, v12}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v7

    invoke-virtual {v1, v13}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v8

    iget-object v9, v12, La/M3;->d:La/M3;

    invoke-virtual {v1, v9}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v9

    iget-object v15, v13, La/M3;->d:La/M3;

    invoke-virtual {v1, v15}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v15

    invoke-virtual {v12}, La/M3;->f()Z

    move-result v16

    invoke-virtual {v13}, La/M3;->f()Z

    move-result v17

    iget-object v11, v0, La/N3;->F:La/M3;

    invoke-virtual {v11}, La/M3;->f()Z

    move-result v11

    if-eqz v17, :cond_0

    add-int/lit8 v18, v16, 0x1

    goto :goto_0

    :cond_0
    move/from16 v18, v16

    :goto_0
    if-eqz v11, :cond_1

    add-int/lit8 v18, v18, 0x1

    :cond_1
    move/from16 v19, v11

    move/from16 v11, v18

    if-eqz p17, :cond_2

    const/4 v3, 0x3

    goto :goto_1

    :cond_2
    move/from16 v3, p21

    :goto_1
    invoke-virtual/range {p8 .. p8}, Ljava/lang/Enum;->ordinal()I

    move-result v13

    if-eqz v13, :cond_3

    const/4 v10, 0x1

    if-eq v13, v10, :cond_3

    const/4 v10, 0x2

    if-eq v13, v10, :cond_4

    :cond_3
    :goto_2
    const/4 v13, 0x0

    goto :goto_3

    :cond_4
    const/4 v10, 0x4

    if-ne v3, v10, :cond_5

    goto :goto_2

    :cond_5
    const/4 v13, 0x1

    :goto_3
    iget v10, v0, La/N3;->X:I

    move/from16 v21, v13

    const/16 v13, 0x8

    if-ne v10, v13, :cond_6

    const/4 v10, 0x0

    const/16 v21, 0x0

    goto :goto_4

    :cond_6
    move/from16 v10, p13

    :goto_4
    if-eqz p26, :cond_9

    if-nez v16, :cond_8

    if-nez v17, :cond_8

    if-nez v19, :cond_8

    move/from16 v13, p12

    invoke-virtual {v1, v7, v13}, La/B9;->d(La/le;I)V

    :cond_7
    move-object/from16 v23, v15

    const/16 v15, 0x8

    goto :goto_5

    :cond_8
    if-eqz v16, :cond_7

    if-nez v17, :cond_7

    invoke-virtual {v12}, La/M3;->c()I

    move-result v13

    move-object/from16 v23, v15

    const/16 v15, 0x8

    invoke-virtual {v1, v7, v9, v13, v15}, La/B9;->e(La/le;La/le;II)V

    goto :goto_5

    :cond_9
    move-object/from16 v23, v15

    move v15, v13

    :goto_5
    if-nez v21, :cond_d

    if-eqz p9, :cond_b

    const/4 v6, 0x3

    const/4 v13, 0x0

    invoke-virtual {v1, v8, v7, v13, v6}, La/B9;->e(La/le;La/le;II)V

    if-lez v14, :cond_a

    invoke-virtual {v1, v8, v7, v14, v15}, La/B9;->f(La/le;La/le;II)V

    :cond_a
    const v6, 0x7fffffff

    if-ge v2, v6, :cond_c

    invoke-virtual {v1, v8, v7, v2, v15}, La/B9;->g(La/le;La/le;II)V

    goto :goto_6

    :cond_b
    invoke-virtual {v1, v8, v7, v10, v15}, La/B9;->e(La/le;La/le;II)V

    :cond_c
    :goto_6
    move/from16 v10, p5

    move v13, v4

    goto/16 :goto_b

    :cond_d
    const/4 v2, 0x2

    if-eq v11, v2, :cond_10

    if-nez p17, :cond_10

    const/4 v2, 0x1

    if-eq v3, v2, :cond_e

    if-nez v3, :cond_10

    :cond_e
    invoke-static {v4, v10}, Ljava/lang/Math;->max(II)I

    move-result v2

    if-lez v5, :cond_f

    invoke-static {v5, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    :cond_f
    const/16 v15, 0x8

    invoke-virtual {v1, v8, v7, v2, v15}, La/B9;->e(La/le;La/le;II)V

    move/from16 v10, p5

    move v13, v4

    :goto_7
    const/16 v21, 0x0

    goto/16 :goto_b

    :cond_10
    const/4 v2, -0x2

    if-ne v4, v2, :cond_11

    move v4, v10

    :cond_11
    if-ne v5, v2, :cond_12

    move v5, v10

    :cond_12
    if-lez v10, :cond_13

    const/4 v2, 0x1

    if-eq v3, v2, :cond_13

    const/4 v10, 0x0

    :cond_13
    const/16 v15, 0x8

    if-lez v4, :cond_14

    invoke-virtual {v1, v8, v7, v4, v15}, La/B9;->f(La/le;La/le;II)V

    invoke-static {v10, v4}, Ljava/lang/Math;->max(II)I

    move-result v10

    :cond_14
    const/4 v2, 0x1

    if-lez v5, :cond_16

    if-eqz p3, :cond_15

    if-ne v3, v2, :cond_15

    goto :goto_8

    :cond_15
    invoke-virtual {v1, v8, v7, v5, v15}, La/B9;->g(La/le;La/le;II)V

    :goto_8
    invoke-static {v10, v5}, Ljava/lang/Math;->min(II)I

    move-result v10

    :cond_16
    if-ne v3, v2, :cond_19

    if-eqz p3, :cond_17

    invoke-virtual {v1, v8, v7, v10, v15}, La/B9;->e(La/le;La/le;II)V

    goto :goto_6

    :cond_17
    if-eqz p18, :cond_18

    const/4 v2, 0x5

    invoke-virtual {v1, v8, v7, v10, v2}, La/B9;->e(La/le;La/le;II)V

    invoke-virtual {v1, v8, v7, v10, v15}, La/B9;->g(La/le;La/le;II)V

    goto :goto_6

    :cond_18
    const/4 v2, 0x5

    invoke-virtual {v1, v8, v7, v10, v2}, La/B9;->e(La/le;La/le;II)V

    invoke-virtual {v1, v8, v7, v10, v15}, La/B9;->g(La/le;La/le;II)V

    goto :goto_6

    :cond_19
    const/4 v10, 0x2

    if-ne v3, v10, :cond_1c

    sget-object v2, La/M3$a;->b:La/M3$a;

    sget-object v10, La/M3$a;->d:La/M3$a;

    iget-object v13, v12, La/M3;->c:La/M3$a;

    if-eq v13, v2, :cond_1b

    if-ne v13, v10, :cond_1a

    goto :goto_9

    :cond_1a
    iget-object v2, v0, La/N3;->K:La/N3;

    sget-object v10, La/M3$a;->a:La/M3$a;

    invoke-virtual {v2, v10}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object v2

    invoke-virtual {v1, v2}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v2

    iget-object v10, v0, La/N3;->K:La/N3;

    sget-object v13, La/M3$a;->c:La/M3$a;

    invoke-virtual {v10, v13}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object v10

    invoke-virtual {v1, v10}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v10

    goto :goto_a

    :cond_1b
    :goto_9
    iget-object v13, v0, La/N3;->K:La/N3;

    invoke-virtual {v13, v2}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object v2

    invoke-virtual {v1, v2}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v2

    iget-object v13, v0, La/N3;->K:La/N3;

    invoke-virtual {v13, v10}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object v10

    invoke-virtual {v1, v10}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v10

    :goto_a
    invoke-virtual {v1}, La/B9;->k()La/K1;

    move-result-object v13

    iget-object v15, v13, La/K1;->d:La/K1$a;

    move/from16 p9, v4

    const/high16 v4, -0x40800000    # -1.0f

    invoke-interface {v15, v8, v4}, La/K1$a;->c(La/le;F)V

    iget-object v4, v13, La/K1;->d:La/K1$a;

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-interface {v4, v7, v15}, La/K1$a;->c(La/le;F)V

    iget-object v4, v13, La/K1;->d:La/K1$a;

    invoke-interface {v4, v10, v6}, La/K1$a;->c(La/le;F)V

    iget-object v4, v13, La/K1;->d:La/K1$a;

    neg-float v6, v6

    invoke-interface {v4, v2, v6}, La/K1$a;->c(La/le;F)V

    invoke-virtual {v1, v13}, La/B9;->c(La/K1;)V

    move/from16 v10, p5

    move/from16 v13, p9

    goto/16 :goto_7

    :cond_1c
    move/from16 p9, v4

    move/from16 v13, p9

    const/4 v10, 0x1

    :goto_b
    if-eqz p26, :cond_1d

    if-eqz p18, :cond_1e

    :cond_1d
    move-object/from16 v15, p6

    move-object/from16 v3, p7

    move-object v2, v7

    move-object v7, v8

    move/from16 p5, v10

    const/4 v10, 0x2

    goto/16 :goto_25

    :cond_1e
    if-nez v16, :cond_1f

    if-nez v17, :cond_1f

    if-nez v19, :cond_1f

    :goto_c
    move-object/from16 v12, p11

    move-object v7, v8

    move/from16 p5, v10

    move-object/from16 v6, v23

    goto/16 :goto_22

    :cond_1f
    if-eqz v16, :cond_20

    if-nez v17, :cond_20

    goto :goto_c

    :cond_20
    if-nez v16, :cond_22

    if-eqz v17, :cond_22

    invoke-virtual/range {p11 .. p11}, La/M3;->c()I

    move-result v2

    neg-int v2, v2

    move-object/from16 v6, v23

    const/16 v15, 0x8

    invoke-virtual {v1, v8, v6, v2, v15}, La/B9;->e(La/le;La/le;II)V

    if-eqz p3, :cond_21

    move-object/from16 v15, p6

    const/4 v2, 0x5

    const/4 v13, 0x0

    invoke-virtual {v1, v7, v15, v13, v2}, La/B9;->f(La/le;La/le;II)V

    :cond_21
    move-object/from16 v12, p11

    move-object v7, v8

    move/from16 p5, v10

    goto/16 :goto_22

    :cond_22
    move-object/from16 v15, p6

    move-object/from16 v6, v23

    if-eqz v16, :cond_21

    if-eqz v17, :cond_21

    iget-object v2, v12, La/M3;->d:La/M3;

    iget-object v11, v2, La/M3;->b:La/N3;

    move-object/from16 v2, p11

    iget-object v4, v2, La/M3;->d:La/M3;

    iget-object v4, v4, La/M3;->b:La/N3;

    move/from16 p5, v10

    iget-object v10, v0, La/N3;->K:La/N3;

    const/16 v16, 0x6

    if-eqz v21, :cond_33

    if-nez v3, :cond_26

    if-nez v5, :cond_23

    if-nez v13, :cond_23

    const/4 v5, 0x0

    const/16 v17, 0x1

    const/16 v19, 0x8

    const/16 v23, 0x8

    goto :goto_d

    :cond_23
    const/4 v5, 0x1

    const/16 v17, 0x0

    const/16 v19, 0x5

    const/16 v23, 0x5

    :goto_d
    instance-of v1, v11, La/V1;

    if-nez v1, :cond_25

    instance-of v1, v4, La/V1;

    if-eqz v1, :cond_24

    goto :goto_e

    :cond_24
    move/from16 v2, v16

    const/4 v1, 0x0

    goto/16 :goto_17

    :cond_25
    :goto_e
    move/from16 v2, v16

    const/4 v1, 0x0

    :goto_f
    const/16 v23, 0x4

    goto/16 :goto_17

    :cond_26
    const/4 v1, 0x1

    if-ne v3, v1, :cond_27

    move/from16 v2, v16

    const/4 v1, 0x1

    const/4 v5, 0x1

    const/16 v17, 0x0

    const/16 v19, 0x8

    goto :goto_f

    :cond_27
    const/4 v1, 0x3

    if-ne v3, v1, :cond_32

    iget v1, v0, La/N3;->s:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_2a

    if-eqz p19, :cond_29

    const/4 v1, 0x1

    if-eqz p3, :cond_28

    const/4 v2, 0x5

    :goto_10
    const/4 v5, 0x1

    const/16 v17, 0x1

    const/16 v19, 0x8

    :goto_11
    const/16 v23, 0x5

    goto/16 :goto_17

    :cond_28
    const/4 v2, 0x4

    goto :goto_10

    :cond_29
    const/4 v1, 0x1

    const/16 v2, 0x8

    goto :goto_10

    :cond_2a
    if-eqz p17, :cond_2d

    move/from16 v1, p22

    const/4 v2, 0x2

    if-eq v1, v2, :cond_2c

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2b

    goto :goto_12

    :cond_2b
    const/16 v1, 0x8

    const/4 v2, 0x5

    goto :goto_13

    :cond_2c
    :goto_12
    const/4 v1, 0x5

    const/4 v2, 0x4

    :goto_13
    move/from16 v19, v1

    move/from16 v23, v2

    move/from16 v2, v16

    const/4 v1, 0x1

    const/4 v5, 0x1

    const/16 v17, 0x1

    goto :goto_17

    :cond_2d
    if-lez v5, :cond_2e

    move/from16 v2, v16

    const/4 v1, 0x1

    const/4 v5, 0x1

    const/16 v17, 0x1

    const/16 v19, 0x5

    goto :goto_11

    :cond_2e
    if-nez v5, :cond_31

    if-nez v13, :cond_31

    if-nez p19, :cond_2f

    move/from16 v2, v16

    const/4 v1, 0x1

    const/4 v5, 0x1

    const/16 v17, 0x1

    const/16 v19, 0x5

    const/16 v23, 0x8

    goto :goto_17

    :cond_2f
    if-eq v11, v10, :cond_30

    if-eq v4, v10, :cond_30

    const/4 v1, 0x4

    goto :goto_14

    :cond_30
    const/4 v1, 0x5

    :goto_14
    move/from16 v19, v1

    move/from16 v2, v16

    const/4 v1, 0x1

    const/4 v5, 0x1

    const/16 v17, 0x1

    goto :goto_f

    :cond_31
    move/from16 v2, v16

    const/4 v1, 0x1

    const/4 v5, 0x1

    const/16 v17, 0x1

    :goto_15
    const/16 v19, 0x5

    goto :goto_f

    :cond_32
    move/from16 v2, v16

    const/4 v1, 0x0

    const/4 v5, 0x0

    :goto_16
    const/16 v17, 0x0

    goto :goto_15

    :cond_33
    move/from16 v2, v16

    const/4 v1, 0x1

    const/4 v5, 0x1

    goto :goto_16

    :goto_17
    if-eqz v1, :cond_34

    if-ne v9, v6, :cond_34

    if-eq v11, v10, :cond_34

    const/16 v24, 0x0

    const/16 v25, 0x0

    goto :goto_18

    :cond_34
    move/from16 v24, v1

    const/16 v25, 0x1

    :goto_18
    if-eqz v5, :cond_36

    iget v1, v0, La/N3;->X:I

    const/16 v5, 0x8

    if-ne v1, v5, :cond_35

    const/4 v2, 0x4

    :cond_35
    move-object v1, v4

    invoke-virtual {v12}, La/M3;->c()I

    move-result v4

    move/from16 v22, v3

    move-object v3, v9

    move v9, v2

    move-object v2, v7

    move-object v7, v8

    invoke-virtual/range {p11 .. p11}, La/M3;->c()I

    move-result v8

    move-object/from16 v12, p11

    move-object/from16 v26, v1

    move/from16 p9, v13

    move/from16 v14, v22

    move-object/from16 v1, p1

    move v13, v5

    move/from16 v5, p16

    invoke-virtual/range {v1 .. v9}, La/B9;->b(La/le;La/le;IFLa/le;La/le;II)V

    goto :goto_19

    :cond_36
    move-object/from16 v1, p1

    move-object/from16 v12, p11

    move v14, v3

    move-object/from16 v26, v4

    move-object v2, v7

    move-object v7, v8

    move-object v3, v9

    move/from16 p9, v13

    const/16 v13, 0x8

    :goto_19
    iget v4, v0, La/N3;->X:I

    if-ne v4, v13, :cond_37

    goto/16 :goto_29

    :cond_37
    if-eqz v24, :cond_3b

    if-eqz p3, :cond_39

    if-eq v3, v6, :cond_39

    if-nez v21, :cond_39

    instance-of v4, v11, La/V1;

    if-nez v4, :cond_38

    move-object/from16 v4, v26

    instance-of v5, v4, La/V1;

    if-eqz v5, :cond_3a

    goto :goto_1a

    :cond_38
    move-object/from16 v4, v26

    :goto_1a
    move/from16 v5, v16

    goto :goto_1b

    :cond_39
    move-object/from16 v4, v26

    :cond_3a
    move/from16 v5, v19

    :goto_1b
    invoke-virtual/range {p10 .. p10}, La/M3;->c()I

    move-result v8

    invoke-virtual {v1, v2, v3, v8, v5}, La/B9;->f(La/le;La/le;II)V

    invoke-virtual {v12}, La/M3;->c()I

    move-result v8

    neg-int v8, v8

    invoke-virtual {v1, v7, v6, v8, v5}, La/B9;->g(La/le;La/le;II)V

    move/from16 v19, v5

    goto :goto_1c

    :cond_3b
    move-object/from16 v4, v26

    :goto_1c
    if-eqz p3, :cond_3c

    if-eqz p20, :cond_3c

    instance-of v5, v11, La/V1;

    if-nez v5, :cond_3c

    instance-of v5, v4, La/V1;

    if-nez v5, :cond_3c

    move/from16 v5, v16

    move v8, v5

    const/16 v25, 0x1

    goto :goto_1d

    :cond_3c
    move/from16 v5, v19

    move/from16 v8, v23

    :goto_1d
    if-eqz v25, :cond_49

    if-eqz v17, :cond_45

    if-eqz p19, :cond_3d

    if-eqz p4, :cond_45

    :cond_3d
    if-eq v11, v10, :cond_3f

    if-ne v4, v10, :cond_3e

    goto :goto_1e

    :cond_3e
    move/from16 v16, v8

    :cond_3f
    :goto_1e
    instance-of v9, v11, La/a8;

    if-nez v9, :cond_40

    instance-of v9, v4, La/a8;

    if-eqz v9, :cond_41

    :cond_40
    const/16 v16, 0x5

    :cond_41
    instance-of v9, v11, La/V1;

    if-nez v9, :cond_42

    instance-of v9, v4, La/V1;

    if-eqz v9, :cond_43

    :cond_42
    const/16 v16, 0x5

    :cond_43
    if-eqz p19, :cond_44

    const/4 v9, 0x5

    goto :goto_1f

    :cond_44
    move/from16 v9, v16

    :goto_1f
    invoke-static {v9, v8}, Ljava/lang/Math;->max(II)I

    move-result v8

    :cond_45
    if-eqz p3, :cond_48

    invoke-static {v5, v8}, Ljava/lang/Math;->min(II)I

    move-result v5

    if-eqz p17, :cond_47

    if-nez p19, :cond_47

    if-eq v11, v10, :cond_46

    if-ne v4, v10, :cond_47

    :cond_46
    const/4 v10, 0x4

    goto :goto_20

    :cond_47
    move v10, v5

    goto :goto_20

    :cond_48
    move v10, v8

    :goto_20
    invoke-virtual/range {p10 .. p10}, La/M3;->c()I

    move-result v4

    invoke-virtual {v1, v2, v3, v4, v10}, La/B9;->e(La/le;La/le;II)V

    invoke-virtual {v12}, La/M3;->c()I

    move-result v4

    neg-int v4, v4

    invoke-virtual {v1, v7, v6, v4, v10}, La/B9;->e(La/le;La/le;II)V

    :cond_49
    if-eqz p3, :cond_4b

    if-ne v15, v3, :cond_4a

    invoke-virtual/range {p10 .. p10}, La/M3;->c()I

    move-result v4

    goto :goto_21

    :cond_4a
    const/4 v4, 0x0

    :goto_21
    if-eq v3, v15, :cond_4b

    const/4 v3, 0x5

    invoke-virtual {v1, v2, v15, v4, v3}, La/B9;->f(La/le;La/le;II)V

    :cond_4b
    if-eqz p3, :cond_4d

    if-eqz v21, :cond_4d

    if-nez p14, :cond_4d

    if-nez p9, :cond_4d

    if-eqz v21, :cond_4c

    const/4 v3, 0x3

    if-ne v14, v3, :cond_4c

    const/4 v13, 0x0

    const/16 v15, 0x8

    invoke-virtual {v1, v7, v2, v13, v15}, La/B9;->f(La/le;La/le;II)V

    goto :goto_22

    :cond_4c
    const/4 v13, 0x0

    const/4 v3, 0x5

    invoke-virtual {v1, v7, v2, v13, v3}, La/B9;->f(La/le;La/le;II)V

    :cond_4d
    :goto_22
    if-eqz p3, :cond_53

    if-eqz p5, :cond_53

    iget-object v2, v12, La/M3;->d:La/M3;

    if-eqz v2, :cond_4e

    invoke-virtual {v12}, La/M3;->c()I

    move-result v10

    :goto_23
    move-object/from16 v3, p7

    goto :goto_24

    :cond_4e
    const/4 v10, 0x0

    goto :goto_23

    :goto_24
    if-eq v6, v3, :cond_53

    const/4 v2, 0x5

    invoke-virtual {v1, v3, v7, v10, v2}, La/B9;->f(La/le;La/le;II)V

    return-void

    :goto_25
    if-ge v11, v10, :cond_53

    if-eqz p3, :cond_53

    if-eqz p5, :cond_53

    const/16 v5, 0x8

    const/4 v13, 0x0

    invoke-virtual {v1, v2, v15, v13, v5}, La/B9;->f(La/le;La/le;II)V

    iget-object v2, v0, La/N3;->C:La/M3;

    if-nez p2, :cond_50

    iget-object v4, v2, La/M3;->d:La/M3;

    if-nez v4, :cond_4f

    goto :goto_26

    :cond_4f
    const/4 v10, 0x0

    goto :goto_27

    :cond_50
    :goto_26
    const/4 v10, 0x1

    :goto_27
    if-nez p2, :cond_52

    iget-object v2, v2, La/M3;->d:La/M3;

    if-eqz v2, :cond_52

    iget-object v2, v2, La/M3;->b:La/N3;

    iget v4, v2, La/N3;->N:F

    const/4 v5, 0x0

    cmpl-float v4, v4, v5

    if-eqz v4, :cond_51

    iget-object v2, v2, La/N3;->J:[La/N3$a;

    const/16 v20, 0x0

    aget-object v4, v2, v20

    sget-object v5, La/N3$a;->c:La/N3$a;

    if-ne v4, v5, :cond_51

    const/4 v10, 0x1

    aget-object v2, v2, v10

    if-ne v2, v5, :cond_51

    goto :goto_28

    :cond_51
    const/4 v10, 0x0

    :cond_52
    :goto_28
    if-eqz v10, :cond_53

    const/4 v13, 0x0

    const/16 v15, 0x8

    invoke-virtual {v1, v3, v7, v13, v15}, La/B9;->f(La/le;La/le;II)V

    :cond_53
    :goto_29
    return-void
.end method

.method public final d(La/M3$a;La/N3;La/M3$a;I)V
    .locals 10

    sget-object v0, La/M3$a;->f:La/M3$a;

    sget-object v1, La/M3$a;->h:La/M3$a;

    sget-object v2, La/M3$a;->g:La/M3$a;

    sget-object v3, La/M3$a;->a:La/M3$a;

    sget-object v4, La/M3$a;->b:La/M3$a;

    sget-object v5, La/M3$a;->c:La/M3$a;

    sget-object v6, La/M3$a;->d:La/M3$a;

    const/4 v7, 0x0

    if-ne p1, v0, :cond_c

    if-ne p3, v0, :cond_8

    invoke-virtual {p0, v3}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p1

    invoke-virtual {p0, v5}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p3

    invoke-virtual {p0, v4}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p4

    invoke-virtual {p0, v6}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object v8

    const/4 v9, 0x1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, La/M3;->f()Z

    move-result p1

    if-nez p1, :cond_1

    :cond_0
    if-eqz p3, :cond_2

    invoke-virtual {p3}, La/M3;->f()Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    move p1, v7

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v3, p2, v3, v7}, La/N3;->d(La/M3$a;La/N3;La/M3$a;I)V

    invoke-virtual {p0, v5, p2, v5, v7}, La/N3;->d(La/M3$a;La/N3;La/M3$a;I)V

    move p1, v9

    :goto_0
    if-eqz p4, :cond_3

    invoke-virtual {p4}, La/M3;->f()Z

    move-result p3

    if-nez p3, :cond_4

    :cond_3
    if-eqz v8, :cond_5

    invoke-virtual {v8}, La/M3;->f()Z

    move-result p3

    if-eqz p3, :cond_5

    :cond_4
    move v9, v7

    goto :goto_1

    :cond_5
    invoke-virtual {p0, v4, p2, v4, v7}, La/N3;->d(La/M3$a;La/N3;La/M3$a;I)V

    invoke-virtual {p0, v6, p2, v6, v7}, La/N3;->d(La/M3$a;La/N3;La/M3$a;I)V

    :goto_1
    if-eqz p1, :cond_6

    if-eqz v9, :cond_6

    invoke-virtual {p0, v0}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p1

    invoke-virtual {p2, v0}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p2

    invoke-virtual {p1, p2, v7}, La/M3;->a(La/M3;I)V

    return-void

    :cond_6
    if-eqz p1, :cond_7

    invoke-virtual {p0, v2}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p1

    invoke-virtual {p2, v2}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p2

    invoke-virtual {p1, p2, v7}, La/M3;->a(La/M3;I)V

    return-void

    :cond_7
    if-eqz v9, :cond_1d

    invoke-virtual {p0, v1}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p1

    invoke-virtual {p2, v1}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p2

    invoke-virtual {p1, p2, v7}, La/M3;->a(La/M3;I)V

    return-void

    :cond_8
    if-eq p3, v3, :cond_b

    if-ne p3, v5, :cond_9

    goto :goto_2

    :cond_9
    if-eq p3, v4, :cond_a

    if-ne p3, v6, :cond_1d

    :cond_a
    invoke-virtual {p0, v4, p2, p3, v7}, La/N3;->d(La/M3$a;La/N3;La/M3$a;I)V

    invoke-virtual {p0, v6, p2, p3, v7}, La/N3;->d(La/M3$a;La/N3;La/M3$a;I)V

    invoke-virtual {p0, v0}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p1

    invoke-virtual {p2, p3}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p2

    invoke-virtual {p1, p2, v7}, La/M3;->a(La/M3;I)V

    return-void

    :cond_b
    :goto_2
    invoke-virtual {p0, v3, p2, p3, v7}, La/N3;->d(La/M3$a;La/N3;La/M3$a;I)V

    invoke-virtual {p0, v5, p2, p3, v7}, La/N3;->d(La/M3$a;La/N3;La/M3$a;I)V

    invoke-virtual {p0, v0}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p1

    invoke-virtual {p2, p3}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p2

    invoke-virtual {p1, p2, v7}, La/M3;->a(La/M3;I)V

    return-void

    :cond_c
    if-ne p1, v2, :cond_e

    if-eq p3, v3, :cond_d

    if-ne p3, v5, :cond_e

    :cond_d
    invoke-virtual {p0, v3}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p1

    invoke-virtual {p2, p3}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p2

    invoke-virtual {p0, v5}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p3

    invoke-virtual {p1, p2, v7}, La/M3;->a(La/M3;I)V

    invoke-virtual {p3, p2, v7}, La/M3;->a(La/M3;I)V

    invoke-virtual {p0, v2}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p1

    invoke-virtual {p1, p2, v7}, La/M3;->a(La/M3;I)V

    return-void

    :cond_e
    if-ne p1, v1, :cond_10

    if-eq p3, v4, :cond_f

    if-ne p3, v6, :cond_10

    :cond_f
    invoke-virtual {p2, p3}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p1

    invoke-virtual {p0, v4}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p2

    invoke-virtual {p2, p1, v7}, La/M3;->a(La/M3;I)V

    invoke-virtual {p0, v6}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p2

    invoke-virtual {p2, p1, v7}, La/M3;->a(La/M3;I)V

    invoke-virtual {p0, v1}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p2

    invoke-virtual {p2, p1, v7}, La/M3;->a(La/M3;I)V

    return-void

    :cond_10
    if-ne p1, v2, :cond_11

    if-ne p3, v2, :cond_11

    invoke-virtual {p0, v3}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p1

    invoke-virtual {p2, v3}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p4

    invoke-virtual {p1, p4, v7}, La/M3;->a(La/M3;I)V

    invoke-virtual {p0, v5}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p1

    invoke-virtual {p2, v5}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p4

    invoke-virtual {p1, p4, v7}, La/M3;->a(La/M3;I)V

    invoke-virtual {p0, v2}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p1

    invoke-virtual {p2, p3}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p2

    invoke-virtual {p1, p2, v7}, La/M3;->a(La/M3;I)V

    return-void

    :cond_11
    if-ne p1, v1, :cond_12

    if-ne p3, v1, :cond_12

    invoke-virtual {p0, v4}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p1

    invoke-virtual {p2, v4}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p4

    invoke-virtual {p1, p4, v7}, La/M3;->a(La/M3;I)V

    invoke-virtual {p0, v6}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p1

    invoke-virtual {p2, v6}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p4

    invoke-virtual {p1, p4, v7}, La/M3;->a(La/M3;I)V

    invoke-virtual {p0, v1}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p1

    invoke-virtual {p2, p3}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p2

    invoke-virtual {p1, p2, v7}, La/M3;->a(La/M3;I)V

    return-void

    :cond_12
    invoke-virtual {p0, p1}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object v8

    invoke-virtual {p2, p3}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p2

    invoke-virtual {v8, p2}, La/M3;->g(La/M3;)Z

    move-result p3

    if-eqz p3, :cond_1d

    sget-object p3, La/M3$a;->e:La/M3$a;

    if-ne p1, p3, :cond_15

    invoke-virtual {p0, v4}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p1

    invoke-virtual {p0, v6}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p3

    if-eqz p1, :cond_13

    invoke-virtual {p1}, La/M3;->h()V

    :cond_13
    if-eqz p3, :cond_14

    invoke-virtual {p3}, La/M3;->h()V

    :cond_14
    move p4, v7

    goto :goto_4

    :cond_15
    if-eq p1, v4, :cond_19

    if-ne p1, v6, :cond_16

    goto :goto_3

    :cond_16
    if-eq p1, v3, :cond_17

    if-ne p1, v5, :cond_1c

    :cond_17
    invoke-virtual {p0, v0}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p3

    iget-object v0, p3, La/M3;->d:La/M3;

    if-eq v0, p2, :cond_18

    invoke-virtual {p3}, La/M3;->h()V

    :cond_18
    invoke-virtual {p0, p1}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p1

    invoke-virtual {p1}, La/M3;->d()La/M3;

    move-result-object p1

    invoke-virtual {p0, v2}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p3

    invoke-virtual {p3}, La/M3;->f()Z

    move-result v0

    if-eqz v0, :cond_1c

    invoke-virtual {p1}, La/M3;->h()V

    invoke-virtual {p3}, La/M3;->h()V

    goto :goto_4

    :cond_19
    :goto_3
    invoke-virtual {p0, p3}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p3

    if-eqz p3, :cond_1a

    invoke-virtual {p3}, La/M3;->h()V

    :cond_1a
    invoke-virtual {p0, v0}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p3

    iget-object v0, p3, La/M3;->d:La/M3;

    if-eq v0, p2, :cond_1b

    invoke-virtual {p3}, La/M3;->h()V

    :cond_1b
    invoke-virtual {p0, p1}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p1

    invoke-virtual {p1}, La/M3;->d()La/M3;

    move-result-object p1

    invoke-virtual {p0, v1}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p3

    invoke-virtual {p3}, La/M3;->f()Z

    move-result v0

    if-eqz v0, :cond_1c

    invoke-virtual {p1}, La/M3;->h()V

    invoke-virtual {p3}, La/M3;->h()V

    :cond_1c
    :goto_4
    invoke-virtual {v8, p2, p4}, La/M3;->a(La/M3;I)V

    :cond_1d
    return-void
.end method

.method public final e(La/M3;La/M3;I)V
    .locals 1

    iget-object v0, p1, La/M3;->b:La/N3;

    if-ne v0, p0, :cond_0

    iget-object v0, p2, La/M3;->b:La/N3;

    iget-object p1, p1, La/M3;->c:La/M3$a;

    iget-object p2, p2, La/M3;->c:La/M3$a;

    invoke-virtual {p0, p1, v0, p2, p3}, La/N3;->d(La/M3$a;La/N3;La/M3$a;I)V

    :cond_0
    return-void
.end method

.method public final f(La/B9;)V
    .locals 1

    iget-object v0, p0, La/N3;->y:La/M3;

    invoke-virtual {p1, v0}, La/B9;->j(Ljava/lang/Object;)La/le;

    iget-object v0, p0, La/N3;->z:La/M3;

    invoke-virtual {p1, v0}, La/B9;->j(Ljava/lang/Object;)La/le;

    iget-object v0, p0, La/N3;->A:La/M3;

    invoke-virtual {p1, v0}, La/B9;->j(Ljava/lang/Object;)La/le;

    iget-object v0, p0, La/N3;->B:La/M3;

    invoke-virtual {p1, v0}, La/B9;->j(Ljava/lang/Object;)La/le;

    iget v0, p0, La/N3;->R:I

    if-lez v0, :cond_0

    iget-object v0, p0, La/N3;->C:La/M3;

    invoke-virtual {p1, v0}, La/B9;->j(Ljava/lang/Object;)La/le;

    :cond_0
    return-void
.end method

.method public g(La/M3$a;)La/M3;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :pswitch_0
    iget-object p1, p0, La/N3;->E:La/M3;

    return-object p1

    :pswitch_1
    iget-object p1, p0, La/N3;->D:La/M3;

    return-object p1

    :pswitch_2
    iget-object p1, p0, La/N3;->F:La/M3;

    return-object p1

    :pswitch_3
    iget-object p1, p0, La/N3;->C:La/M3;

    return-object p1

    :pswitch_4
    iget-object p1, p0, La/N3;->B:La/M3;

    return-object p1

    :pswitch_5
    iget-object p1, p0, La/N3;->A:La/M3;

    return-object p1

    :pswitch_6
    iget-object p1, p0, La/N3;->z:La/M3;

    return-object p1

    :pswitch_7
    iget-object p1, p0, La/N3;->y:La/M3;

    return-object p1

    :pswitch_8
    const/4 p1, 0x0

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final h(I)La/N3$a;
    .locals 2

    iget-object v0, p0, La/N3;->J:[La/N3$a;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    aget-object p1, v0, p1

    return-object p1

    :cond_0
    const/4 v1, 0x1

    if-ne p1, v1, :cond_1

    aget-object p1, v0, v1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final i()I
    .locals 2

    iget v0, p0, La/N3;->X:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, p0, La/N3;->M:I

    return v0
.end method

.method public final j(I)La/N3;
    .locals 2

    if-nez p1, :cond_0

    iget-object p1, p0, La/N3;->A:La/M3;

    iget-object v0, p1, La/M3;->d:La/M3;

    if-eqz v0, :cond_1

    iget-object v1, v0, La/M3;->d:La/M3;

    if-ne v1, p1, :cond_1

    iget-object p1, v0, La/M3;->b:La/N3;

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, La/N3;->B:La/M3;

    iget-object v0, p1, La/M3;->d:La/M3;

    if-eqz v0, :cond_1

    iget-object v1, v0, La/M3;->d:La/M3;

    if-ne v1, p1, :cond_1

    iget-object p1, v0, La/M3;->b:La/N3;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final k(I)La/N3;
    .locals 2

    if-nez p1, :cond_0

    iget-object p1, p0, La/N3;->y:La/M3;

    iget-object v0, p1, La/M3;->d:La/M3;

    if-eqz v0, :cond_1

    iget-object v1, v0, La/M3;->d:La/M3;

    if-ne v1, p1, :cond_1

    iget-object p1, v0, La/M3;->b:La/N3;

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, La/N3;->z:La/M3;

    iget-object v0, p1, La/M3;->d:La/M3;

    if-eqz v0, :cond_1

    iget-object v1, v0, La/M3;->d:La/M3;

    if-ne v1, p1, :cond_1

    iget-object p1, v0, La/M3;->b:La/N3;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final l()I
    .locals 2

    iget v0, p0, La/N3;->X:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, p0, La/N3;->L:I

    return v0
.end method

.method public final m()I
    .locals 2

    iget-object v0, p0, La/N3;->K:La/N3;

    if-eqz v0, :cond_0

    instance-of v1, v0, La/O3;

    if-eqz v1, :cond_0

    check-cast v0, La/O3;

    iget v0, v0, La/O3;->k0:I

    iget v1, p0, La/N3;->P:I

    add-int/2addr v0, v1

    return v0

    :cond_0
    iget v0, p0, La/N3;->P:I

    return v0
.end method

.method public final n()I
    .locals 2

    iget-object v0, p0, La/N3;->K:La/N3;

    if-eqz v0, :cond_0

    instance-of v1, v0, La/O3;

    if-eqz v1, :cond_0

    check-cast v0, La/O3;

    iget v0, v0, La/O3;->l0:I

    iget v1, p0, La/N3;->Q:I

    add-int/2addr v0, v1

    return v0

    :cond_0
    iget v0, p0, La/N3;->Q:I

    return v0
.end method

.method public final o(La/M3$a;La/N3;La/M3$a;II)V
    .locals 0

    invoke-virtual {p0, p1}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p1

    invoke-virtual {p2, p3}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object p2

    const/4 p3, 0x1

    invoke-virtual {p1, p2, p4, p5, p3}, La/M3;->b(La/M3;IIZ)Z

    return-void
.end method

.method public final p(I)Z
    .locals 3

    mul-int/lit8 p1, p1, 0x2

    iget-object v0, p0, La/N3;->G:[La/M3;

    aget-object v1, v0, p1

    iget-object v2, v1, La/M3;->d:La/M3;

    if-eqz v2, :cond_0

    iget-object v2, v2, La/M3;->d:La/M3;

    if-eq v2, v1, :cond_0

    const/4 v1, 0x1

    add-int/2addr p1, v1

    aget-object p1, v0, p1

    iget-object v0, p1, La/M3;->d:La/M3;

    if-eqz v0, :cond_0

    iget-object v0, v0, La/M3;->d:La/M3;

    if-ne v0, p1, :cond_0

    return v1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final q()Z
    .locals 2

    iget-object v0, p0, La/N3;->y:La/M3;

    iget-object v1, v0, La/M3;->d:La/M3;

    if-eqz v1, :cond_0

    iget-object v1, v1, La/M3;->d:La/M3;

    if-eq v1, v0, :cond_1

    :cond_0
    iget-object v0, p0, La/N3;->A:La/M3;

    iget-object v1, v0, La/M3;->d:La/M3;

    if-eqz v1, :cond_2

    iget-object v1, v1, La/M3;->d:La/M3;

    if-ne v1, v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public final r()Z
    .locals 2

    iget-object v0, p0, La/N3;->z:La/M3;

    iget-object v1, v0, La/M3;->d:La/M3;

    if-eqz v1, :cond_0

    iget-object v1, v1, La/M3;->d:La/M3;

    if-eq v1, v0, :cond_1

    :cond_0
    iget-object v0, p0, La/N3;->B:La/M3;

    iget-object v1, v0, La/M3;->d:La/M3;

    if-eqz v1, :cond_2

    iget-object v1, v1, La/M3;->d:La/M3;

    if-ne v1, v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public s()V
    .locals 6

    iget-object v0, p0, La/N3;->y:La/M3;

    invoke-virtual {v0}, La/M3;->h()V

    iget-object v0, p0, La/N3;->z:La/M3;

    invoke-virtual {v0}, La/M3;->h()V

    iget-object v0, p0, La/N3;->A:La/M3;

    invoke-virtual {v0}, La/M3;->h()V

    iget-object v0, p0, La/N3;->B:La/M3;

    invoke-virtual {v0}, La/M3;->h()V

    iget-object v0, p0, La/N3;->C:La/M3;

    invoke-virtual {v0}, La/M3;->h()V

    iget-object v0, p0, La/N3;->D:La/M3;

    invoke-virtual {v0}, La/M3;->h()V

    iget-object v0, p0, La/N3;->E:La/M3;

    invoke-virtual {v0}, La/M3;->h()V

    iget-object v0, p0, La/N3;->F:La/M3;

    invoke-virtual {v0}, La/M3;->h()V

    const/4 v0, 0x0

    iput-object v0, p0, La/N3;->K:La/N3;

    const/4 v1, 0x0

    iput v1, p0, La/N3;->v:F

    const/4 v2, 0x0

    iput v2, p0, La/N3;->L:I

    iput v2, p0, La/N3;->M:I

    iput v1, p0, La/N3;->N:F

    const/4 v1, -0x1

    iput v1, p0, La/N3;->O:I

    iput v2, p0, La/N3;->P:I

    iput v2, p0, La/N3;->Q:I

    iput v2, p0, La/N3;->R:I

    iput v2, p0, La/N3;->S:I

    iput v2, p0, La/N3;->T:I

    const/high16 v3, 0x3f000000    # 0.5f

    iput v3, p0, La/N3;->U:F

    iput v3, p0, La/N3;->V:F

    sget-object v3, La/N3$a;->a:La/N3$a;

    iget-object v4, p0, La/N3;->J:[La/N3$a;

    aput-object v3, v4, v2

    const/4 v5, 0x1

    aput-object v3, v4, v5

    iput-object v0, p0, La/N3;->W:Landroid/view/View;

    iput v2, p0, La/N3;->X:I

    iput v2, p0, La/N3;->Z:I

    iput v2, p0, La/N3;->a0:I

    iget-object v0, p0, La/N3;->b0:[F

    const/high16 v3, -0x40800000    # -1.0f

    aput v3, v0, v2

    aput v3, v0, v5

    iput v1, p0, La/N3;->h:I

    iput v1, p0, La/N3;->i:I

    iget-object v0, p0, La/N3;->u:[I

    const v3, 0x7fffffff

    aput v3, v0, v2

    aput v3, v0, v5

    iput v2, p0, La/N3;->j:I

    iput v2, p0, La/N3;->k:I

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, La/N3;->o:F

    iput v0, p0, La/N3;->r:F

    iput v3, p0, La/N3;->n:I

    iput v3, p0, La/N3;->q:I

    iput v2, p0, La/N3;->m:I

    iput v2, p0, La/N3;->p:I

    iput v1, p0, La/N3;->s:I

    iput v0, p0, La/N3;->t:F

    iget-object v0, p0, La/N3;->f:[Z

    aput-boolean v5, v0, v2

    aput-boolean v5, v0, v5

    iget-object v0, p0, La/N3;->I:[Z

    aput-boolean v2, v0, v2

    aput-boolean v2, v0, v5

    return-void
.end method

.method public final t()V
    .locals 4

    iget-object v0, p0, La/N3;->K:La/N3;

    if-eqz v0, :cond_0

    instance-of v1, v0, La/O3;

    if-eqz v1, :cond_0

    check-cast v0, La/O3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    iget-object v0, p0, La/N3;->H:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La/M3;

    invoke-virtual {v3}, La/M3;->h()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, La/N3;->Y:Ljava/lang/String;

    if-eqz v2, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "id: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, La/N3;->Y:Ljava/lang/String;

    const-string v3, " "

    invoke-static {v1, v2, v3}, La/z;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, La/N3;->P:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, La/N3;->Q:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") - ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, La/N3;->L:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " x "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, La/N3;->M:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u(La/A2;)V
    .locals 0

    iget-object p1, p0, La/N3;->y:La/M3;

    invoke-virtual {p1}, La/M3;->i()V

    iget-object p1, p0, La/N3;->z:La/M3;

    invoke-virtual {p1}, La/M3;->i()V

    iget-object p1, p0, La/N3;->A:La/M3;

    invoke-virtual {p1}, La/M3;->i()V

    iget-object p1, p0, La/N3;->B:La/M3;

    invoke-virtual {p1}, La/M3;->i()V

    iget-object p1, p0, La/N3;->C:La/M3;

    invoke-virtual {p1}, La/M3;->i()V

    iget-object p1, p0, La/N3;->F:La/M3;

    invoke-virtual {p1}, La/M3;->i()V

    iget-object p1, p0, La/N3;->D:La/M3;

    invoke-virtual {p1}, La/M3;->i()V

    iget-object p1, p0, La/N3;->E:La/M3;

    invoke-virtual {p1}, La/M3;->i()V

    return-void
.end method

.method public final v(I)V
    .locals 1

    iput p1, p0, La/N3;->M:I

    iget v0, p0, La/N3;->T:I

    if-ge p1, v0, :cond_0

    iput v0, p0, La/N3;->M:I

    :cond_0
    return-void
.end method

.method public final w(La/N3$a;)V
    .locals 2

    iget-object v0, p0, La/N3;->J:[La/N3$a;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    return-void
.end method

.method public final x(La/N3$a;)V
    .locals 2

    iget-object v0, p0, La/N3;->J:[La/N3$a;

    const/4 v1, 0x1

    aput-object p1, v0, v1

    return-void
.end method

.method public final y(I)V
    .locals 1

    iput p1, p0, La/N3;->L:I

    iget v0, p0, La/N3;->S:I

    if-ge p1, v0, :cond_0

    iput v0, p0, La/N3;->L:I

    :cond_0
    return-void
.end method

.method public z(ZZ)V
    .locals 7

    iget-object v0, p0, La/N3;->d:La/K8;

    iget-boolean v1, v0, La/ih;->g:Z

    and-int/2addr p1, v1

    iget-object v1, p0, La/N3;->e:La/og;

    iget-boolean v2, v1, La/ih;->g:Z

    and-int/2addr p2, v2

    iget-object v2, v0, La/ih;->h:La/V4;

    iget v2, v2, La/V4;->g:I

    iget-object v3, v1, La/ih;->h:La/V4;

    iget v3, v3, La/V4;->g:I

    iget-object v0, v0, La/ih;->i:La/V4;

    iget v0, v0, La/V4;->g:I

    iget-object v1, v1, La/ih;->i:La/V4;

    iget v1, v1, La/V4;->g:I

    sub-int v4, v0, v2

    sub-int v5, v1, v3

    const/4 v6, 0x0

    if-ltz v4, :cond_0

    if-ltz v5, :cond_0

    const/high16 v4, -0x80000000

    if-eq v2, v4, :cond_0

    const v5, 0x7fffffff

    if-eq v2, v5, :cond_0

    if-eq v3, v4, :cond_0

    if-eq v3, v5, :cond_0

    if-eq v0, v4, :cond_0

    if-eq v0, v5, :cond_0

    if-eq v1, v4, :cond_0

    if-ne v1, v5, :cond_1

    :cond_0
    move v0, v6

    move v1, v0

    move v2, v1

    move v3, v2

    :cond_1
    sub-int/2addr v0, v2

    sub-int/2addr v1, v3

    if-eqz p1, :cond_2

    iput v2, p0, La/N3;->P:I

    :cond_2
    if-eqz p2, :cond_3

    iput v3, p0, La/N3;->Q:I

    :cond_3
    iget v2, p0, La/N3;->X:I

    const/16 v3, 0x8

    if-ne v2, v3, :cond_4

    iput v6, p0, La/N3;->L:I

    iput v6, p0, La/N3;->M:I

    return-void

    :cond_4
    sget-object v2, La/N3$a;->a:La/N3$a;

    iget-object v3, p0, La/N3;->J:[La/N3$a;

    if-eqz p1, :cond_6

    aget-object p1, v3, v6

    if-ne p1, v2, :cond_5

    iget p1, p0, La/N3;->L:I

    if-ge v0, p1, :cond_5

    move v0, p1

    :cond_5
    iput v0, p0, La/N3;->L:I

    iget p1, p0, La/N3;->S:I

    if-ge v0, p1, :cond_6

    iput p1, p0, La/N3;->L:I

    :cond_6
    if-eqz p2, :cond_8

    const/4 p1, 0x1

    aget-object p1, v3, p1

    if-ne p1, v2, :cond_7

    iget p1, p0, La/N3;->M:I

    if-ge v1, p1, :cond_7

    move v1, p1

    :cond_7
    iput v1, p0, La/N3;->M:I

    iget p1, p0, La/N3;->T:I

    if-ge v1, p1, :cond_8

    iput p1, p0, La/N3;->M:I

    :cond_8
    return-void
.end method
