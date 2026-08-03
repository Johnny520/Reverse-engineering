.class public abstract Lzi;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public A:Lb1;

.field public B:Lb1;

.field public C:Lb1;

.field public D:Ljava/util/ArrayDeque;

.field public E:Z

.field public F:Z

.field public G:Z

.field public H:Z

.field public I:Z

.field public J:Ljava/util/ArrayList;

.field public K:Ljava/util/ArrayList;

.field public L:Ljava/util/ArrayList;

.field public M:LDi;

.field public final N:LK0;

.field public final a:Ljava/util/ArrayList;

.field public b:Z

.field public final c:Lqs;

.field public d:Ljava/util/ArrayList;

.field public e:Ljava/util/ArrayList;

.field public final f:Lni;

.field public g:Lot;

.field public final h:Lri;

.field public final i:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final j:Ljava/util/Map;

.field public final k:Ljava/util/Map;

.field public final l:Ljava/util/Map;

.field public final m:LP3;

.field public final n:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final o:Lpi;

.field public final p:Lpi;

.field public final q:Lpi;

.field public final r:Lpi;

.field public final s:Lsi;

.field public t:I

.field public u:Lji;

.field public v:LTB;

.field public w:Lhi;

.field public x:Lhi;

.field public final y:Lti;

.field public final z:LPg;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lzi;->a:Ljava/util/ArrayList;

    new-instance v0, Lqs;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lqs;-><init>(I)V

    iput-object v0, p0, Lzi;->c:Lqs;

    new-instance v0, Lni;

    invoke-direct {v0, p0}, Lni;-><init>(Lzi;)V

    iput-object v0, p0, Lzi;->f:Lni;

    new-instance v0, Lri;

    invoke-direct {v0, p0}, Lri;-><init>(Lzi;)V

    iput-object v0, p0, Lzi;->h:Lri;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lzi;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lzi;->j:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lzi;->k:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lzi;->l:Ljava/util/Map;

    new-instance v0, LP3;

    invoke-direct {v0, p0}, LP3;-><init>(Lzi;)V

    iput-object v0, p0, Lzi;->m:LP3;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lzi;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v0, Lpi;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lpi;-><init>(Lzi;I)V

    iput-object v0, p0, Lzi;->o:Lpi;

    new-instance v0, Lpi;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lpi;-><init>(Lzi;I)V

    iput-object v0, p0, Lzi;->p:Lpi;

    new-instance v0, Lpi;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lpi;-><init>(Lzi;I)V

    iput-object v0, p0, Lzi;->q:Lpi;

    new-instance v0, Lpi;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Lpi;-><init>(Lzi;I)V

    iput-object v0, p0, Lzi;->r:Lpi;

    new-instance v0, Lsi;

    invoke-direct {v0, p0}, Lsi;-><init>(Lzi;)V

    iput-object v0, p0, Lzi;->s:Lsi;

    const/4 v0, -0x1

    iput v0, p0, Lzi;->t:I

    new-instance v0, Lti;

    invoke-direct {v0, p0}, Lti;-><init>(Lzi;)V

    iput-object v0, p0, Lzi;->y:Lti;

    new-instance v0, LPg;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, LPg;-><init>(I)V

    iput-object v0, p0, Lzi;->z:LPg;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lzi;->D:Ljava/util/ArrayDeque;

    new-instance v0, LK0;

    const/16 v1, 0x8

    invoke-direct {v0, v1, p0}, LK0;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Lzi;->N:LK0;

    return-void
.end method

.method public static G(I)Z
    .locals 1

    const-string v0, "FragmentManager"

    invoke-static {v0, p0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static H(Lhi;)Z
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p0, p0, Lhi;->t:LAi;

    iget-object p0, p0, Lzi;->c:Lqs;

    invoke-virtual {p0}, Lqs;->r()Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    move v1, v0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhi;

    if-eqz v2, :cond_1

    invoke-static {v2}, Lzi;->H(Lhi;)Z

    move-result v1

    :cond_1
    if-eqz v1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_2
    return v0
.end method

.method public static J(Lhi;)Z
    .locals 1

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lhi;->B:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lhi;->r:Lzi;

    if-eqz v0, :cond_1

    iget-object p0, p0, Lhi;->u:Lhi;

    invoke-static {p0}, Lzi;->J(Lhi;)Z

    move-result p0

    if-eqz p0, :cond_2

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static K(Lhi;)Z
    .locals 2

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lhi;->r:Lzi;

    iget-object v1, v0, Lzi;->x:Lhi;

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    iget-object p0, v0, Lzi;->w:Lhi;

    invoke-static {p0}, Lzi;->K(Lhi;)Z

    move-result p0

    if-eqz p0, :cond_1

    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final A(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V
    .locals 24

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move/from16 v3, p4

    iget-object v4, v1, Lzi;->c:Lqs;

    move/from16 v5, p3

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lh5;

    iget-boolean v6, v6, Lh5;->o:Z

    iget-object v7, v1, Lzi;->L:Ljava/util/ArrayList;

    if-nez v7, :cond_0

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, v1, Lzi;->L:Ljava/util/ArrayList;

    goto :goto_0

    :cond_0
    invoke-virtual {v7}, Ljava/util/ArrayList;->clear()V

    :goto_0
    iget-object v7, v1, Lzi;->L:Ljava/util/ArrayList;

    invoke-virtual {v4}, Lqs;->t()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v7, v1, Lzi;->x:Lhi;

    move v9, v5

    const/4 v10, 0x0

    :goto_1
    const/4 v13, 0x1

    if-ge v9, v3, :cond_13

    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lh5;

    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Boolean;

    invoke-virtual {v15}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v15

    if-nez v15, :cond_d

    iget-object v15, v1, Lzi;->L:Ljava/util/ArrayList;

    iget-object v8, v14, Lh5;->a:Ljava/util/ArrayList;

    const/4 v12, 0x0

    :goto_2
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v11

    if-ge v12, v11, :cond_c

    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LKi;

    iget v5, v11, LKi;->a:I

    if-eq v5, v13, :cond_b

    const/4 v13, 0x2

    if-eq v5, v13, :cond_5

    const/4 v13, 0x3

    if-eq v5, v13, :cond_4

    const/4 v13, 0x6

    if-eq v5, v13, :cond_4

    const/4 v13, 0x7

    if-eq v5, v13, :cond_3

    const/16 v13, 0x8

    if-eq v5, v13, :cond_1

    move/from16 v19, v6

    goto :goto_3

    :cond_1
    new-instance v5, LKi;

    move/from16 v19, v6

    const/16 v6, 0x9

    const/4 v13, 0x0

    invoke-direct {v5, v6, v7, v13}, LKi;-><init>(ILhi;I)V

    invoke-virtual {v8, v12, v5}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    const/4 v5, 0x1

    iput-boolean v5, v11, LKi;->c:Z

    add-int/lit8 v12, v12, 0x1

    iget-object v5, v11, LKi;->b:Lhi;

    move-object v7, v5

    :cond_2
    :goto_3
    move/from16 v22, v9

    move/from16 v21, v10

    const/4 v6, 0x1

    goto/16 :goto_9

    :cond_3
    move/from16 v19, v6

    const/4 v6, 0x1

    :goto_4
    move/from16 v22, v9

    move/from16 v21, v10

    goto/16 :goto_8

    :cond_4
    move/from16 v19, v6

    iget-object v5, v11, LKi;->b:Lhi;

    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v5, v11, LKi;->b:Lhi;

    if-ne v5, v7, :cond_2

    new-instance v6, LKi;

    const/16 v7, 0x9

    invoke-direct {v6, v7, v5}, LKi;-><init>(ILhi;)V

    invoke-virtual {v8, v12, v6}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v12, v12, 0x1

    move/from16 v22, v9

    move/from16 v21, v10

    const/4 v6, 0x1

    const/4 v7, 0x0

    goto/16 :goto_9

    :cond_5
    move/from16 v19, v6

    iget-object v5, v11, LKi;->b:Lhi;

    iget v6, v5, Lhi;->w:I

    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v13

    const/16 v17, 0x1

    add-int/lit8 v13, v13, -0x1

    const/16 v20, 0x0

    :goto_5
    if-ltz v13, :cond_9

    invoke-virtual {v15, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v21

    move/from16 v22, v9

    move-object/from16 v9, v21

    check-cast v9, Lhi;

    move/from16 v21, v10

    iget v10, v9, Lhi;->w:I

    if-ne v10, v6, :cond_8

    if-ne v9, v5, :cond_6

    move/from16 v18, v6

    const/4 v6, 0x1

    const/16 v20, 0x1

    goto :goto_7

    :cond_6
    if-ne v9, v7, :cond_7

    new-instance v7, LKi;

    move/from16 v18, v6

    const/16 v6, 0x9

    const/4 v10, 0x0

    invoke-direct {v7, v6, v9, v10}, LKi;-><init>(ILhi;I)V

    invoke-virtual {v8, v12, v7}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v12, v12, 0x1

    const/4 v7, 0x0

    goto :goto_6

    :cond_7
    move/from16 v18, v6

    const/16 v6, 0x9

    const/4 v10, 0x0

    :goto_6
    new-instance v6, LKi;

    move-object/from16 v23, v7

    const/4 v7, 0x3

    invoke-direct {v6, v7, v9, v10}, LKi;-><init>(ILhi;I)V

    iget v7, v11, LKi;->d:I

    iput v7, v6, LKi;->d:I

    iget v7, v11, LKi;->f:I

    iput v7, v6, LKi;->f:I

    iget v7, v11, LKi;->e:I

    iput v7, v6, LKi;->e:I

    iget v7, v11, LKi;->g:I

    iput v7, v6, LKi;->g:I

    invoke-virtual {v8, v12, v6}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    invoke-virtual {v15, v9}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 v6, 0x1

    add-int/2addr v12, v6

    move-object/from16 v7, v23

    goto :goto_7

    :cond_8
    move/from16 v18, v6

    const/4 v6, 0x1

    :goto_7
    add-int/lit8 v13, v13, -0x1

    move/from16 v6, v18

    move/from16 v10, v21

    move/from16 v9, v22

    goto :goto_5

    :cond_9
    move/from16 v22, v9

    move/from16 v21, v10

    const/4 v6, 0x1

    if-eqz v20, :cond_a

    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v12, v12, -0x1

    goto :goto_9

    :cond_a
    iput v6, v11, LKi;->a:I

    iput-boolean v6, v11, LKi;->c:Z

    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_b
    move/from16 v19, v6

    move v6, v13

    goto/16 :goto_4

    :goto_8
    iget-object v5, v11, LKi;->b:Lhi;

    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_9
    add-int/2addr v12, v6

    move/from16 v5, p3

    move v13, v6

    move/from16 v6, v19

    move/from16 v10, v21

    move/from16 v9, v22

    goto/16 :goto_2

    :cond_c
    move/from16 v19, v6

    move/from16 v22, v9

    move/from16 v21, v10

    goto :goto_c

    :cond_d
    move/from16 v19, v6

    move/from16 v22, v9

    move/from16 v21, v10

    move v6, v13

    iget-object v5, v1, Lzi;->L:Ljava/util/ArrayList;

    iget-object v8, v14, Lh5;->a:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v9

    sub-int/2addr v9, v6

    :goto_a
    if-ltz v9, :cond_10

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LKi;

    iget v11, v10, LKi;->a:I

    const/4 v13, 0x3

    if-eq v11, v6, :cond_f

    if-eq v11, v13, :cond_e

    packed-switch v11, :pswitch_data_0

    goto :goto_b

    :pswitch_0
    iget-object v6, v10, LKi;->h:LPn;

    iput-object v6, v10, LKi;->i:LPn;

    goto :goto_b

    :pswitch_1
    iget-object v6, v10, LKi;->b:Lhi;

    move-object v7, v6

    goto :goto_b

    :pswitch_2
    const/4 v7, 0x0

    goto :goto_b

    :cond_e
    :pswitch_3
    iget-object v6, v10, LKi;->b:Lhi;

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_f
    :pswitch_4
    iget-object v6, v10, LKi;->b:Lhi;

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :goto_b
    add-int/lit8 v9, v9, -0x1

    const/4 v6, 0x1

    goto :goto_a

    :cond_10
    :goto_c
    if-nez v21, :cond_12

    iget-boolean v5, v14, Lh5;->g:Z

    if-eqz v5, :cond_11

    goto :goto_d

    :cond_11
    const/4 v10, 0x0

    goto :goto_e

    :cond_12
    :goto_d
    const/4 v10, 0x1

    :goto_e
    add-int/lit8 v9, v22, 0x1

    move/from16 v5, p3

    move/from16 v6, v19

    goto/16 :goto_1

    :cond_13
    move/from16 v19, v6

    iget-object v5, v1, Lzi;->L:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    if-nez v19, :cond_16

    iget v5, v1, Lzi;->t:I

    const/4 v6, 0x1

    if-lt v5, v6, :cond_16

    move/from16 v5, p3

    :goto_f
    if-ge v5, v3, :cond_16

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lh5;

    iget-object v6, v6, Lh5;->a:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_14
    :goto_10
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_15

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LKi;

    iget-object v7, v7, LKi;->b:Lhi;

    if-eqz v7, :cond_14

    iget-object v8, v7, Lhi;->r:Lzi;

    if-eqz v8, :cond_14

    invoke-virtual {v1, v7}, Lzi;->f(Lhi;)LHi;

    move-result-object v7

    invoke-virtual {v4, v7}, Lqs;->u(LHi;)V

    goto :goto_10

    :cond_15
    add-int/lit8 v5, v5, 0x1

    goto :goto_f

    :cond_16
    const-string v4, "Unknown cmd: "

    move/from16 v5, p3

    :goto_11
    const/4 v6, -0x1

    if-ge v5, v3, :cond_29

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lh5;

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    if-eqz v8, :cond_21

    invoke-virtual {v7, v6}, Lh5;->c(I)V

    iget-object v6, v7, Lh5;->p:Lzi;

    iget-object v8, v7, Lh5;->a:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v9

    const/4 v10, 0x1

    sub-int/2addr v9, v10

    :goto_12
    if-ltz v9, :cond_20

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LKi;

    iget-object v12, v11, LKi;->b:Lhi;

    if-eqz v12, :cond_1c

    iget-object v13, v12, Lhi;->H:Lfi;

    if-nez v13, :cond_17

    goto :goto_13

    :cond_17
    invoke-virtual {v12}, Lhi;->b()Lfi;

    move-result-object v13

    iput-boolean v10, v13, Lfi;->a:Z

    :goto_13
    iget v10, v7, Lh5;->f:I

    const/16 v13, 0x2002

    const/16 v14, 0x1001

    if-eq v10, v14, :cond_1a

    if-eq v10, v13, :cond_18

    const/16 v13, 0x1004

    const/16 v14, 0x2005

    if-eq v10, v14, :cond_1a

    const/16 v15, 0x1003

    if-eq v10, v15, :cond_19

    if-eq v10, v13, :cond_18

    const/4 v13, 0x0

    goto :goto_14

    :cond_18
    move v13, v14

    goto :goto_14

    :cond_19
    move v13, v15

    :cond_1a
    :goto_14
    iget-object v10, v12, Lhi;->H:Lfi;

    if-nez v10, :cond_1b

    if-nez v13, :cond_1b

    goto :goto_15

    :cond_1b
    invoke-virtual {v12}, Lhi;->b()Lfi;

    iget-object v10, v12, Lhi;->H:Lfi;

    iput v13, v10, Lfi;->f:I

    :goto_15
    invoke-virtual {v12}, Lhi;->b()Lfi;

    iget-object v10, v12, Lhi;->H:Lfi;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_1c
    iget v10, v11, LKi;->a:I

    packed-switch v10, :pswitch_data_1

    :pswitch_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, v11, LKi;->a:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_6
    iget-object v10, v11, LKi;->h:LPn;

    invoke-virtual {v6, v12, v10}, Lzi;->X(Lhi;LPn;)V

    :cond_1d
    :goto_16
    const/4 v10, 0x1

    goto/16 :goto_17

    :pswitch_7
    invoke-virtual {v6, v12}, Lzi;->Y(Lhi;)V

    goto :goto_16

    :pswitch_8
    const/4 v10, 0x0

    invoke-virtual {v6, v10}, Lzi;->Y(Lhi;)V

    goto :goto_16

    :pswitch_9
    iget v10, v11, LKi;->d:I

    iget v13, v11, LKi;->e:I

    iget v14, v11, LKi;->f:I

    iget v11, v11, LKi;->g:I

    invoke-virtual {v12, v10, v13, v14, v11}, Lhi;->A(IIII)V

    const/4 v10, 0x1

    invoke-virtual {v6, v12, v10}, Lzi;->W(Lhi;Z)V

    invoke-virtual {v6, v12}, Lzi;->g(Lhi;)V

    goto :goto_16

    :pswitch_a
    iget v10, v11, LKi;->d:I

    iget v13, v11, LKi;->e:I

    iget v14, v11, LKi;->f:I

    iget v11, v11, LKi;->g:I

    invoke-virtual {v12, v10, v13, v14, v11}, Lhi;->A(IIII)V

    invoke-virtual {v6, v12}, Lzi;->c(Lhi;)V

    goto :goto_16

    :pswitch_b
    iget v10, v11, LKi;->d:I

    iget v13, v11, LKi;->e:I

    iget v14, v11, LKi;->f:I

    iget v11, v11, LKi;->g:I

    invoke-virtual {v12, v10, v13, v14, v11}, Lhi;->A(IIII)V

    const/4 v10, 0x1

    invoke-virtual {v6, v12, v10}, Lzi;->W(Lhi;Z)V

    const/16 v16, 0x2

    invoke-static/range {v16 .. v16}, Lzi;->G(I)Z

    move-result v11

    if-eqz v11, :cond_1e

    invoke-static {v12}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_1e
    iget-boolean v11, v12, Lhi;->y:Z

    if-nez v11, :cond_1d

    iput-boolean v10, v12, Lhi;->y:Z

    iget-boolean v11, v12, Lhi;->I:Z

    xor-int/2addr v11, v10

    iput-boolean v11, v12, Lhi;->I:Z

    invoke-virtual {v6, v12}, Lzi;->Z(Lhi;)V

    goto :goto_16

    :pswitch_c
    iget v10, v11, LKi;->d:I

    iget v13, v11, LKi;->e:I

    iget v14, v11, LKi;->f:I

    iget v11, v11, LKi;->g:I

    invoke-virtual {v12, v10, v13, v14, v11}, Lhi;->A(IIII)V

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v16, 0x2

    invoke-static/range {v16 .. v16}, Lzi;->G(I)Z

    move-result v10

    if-eqz v10, :cond_1f

    invoke-static {v12}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_1f
    iget-boolean v10, v12, Lhi;->y:Z

    if-eqz v10, :cond_1d

    const/4 v13, 0x0

    iput-boolean v13, v12, Lhi;->y:Z

    iget-boolean v10, v12, Lhi;->I:Z

    const/16 v17, 0x1

    xor-int/lit8 v10, v10, 0x1

    iput-boolean v10, v12, Lhi;->I:Z

    goto :goto_16

    :pswitch_d
    iget v10, v11, LKi;->d:I

    iget v13, v11, LKi;->e:I

    iget v14, v11, LKi;->f:I

    iget v11, v11, LKi;->g:I

    invoke-virtual {v12, v10, v13, v14, v11}, Lhi;->A(IIII)V

    invoke-virtual {v6, v12}, Lzi;->a(Lhi;)LHi;

    goto/16 :goto_16

    :pswitch_e
    iget v10, v11, LKi;->d:I

    iget v13, v11, LKi;->e:I

    iget v14, v11, LKi;->f:I

    iget v11, v11, LKi;->g:I

    invoke-virtual {v12, v10, v13, v14, v11}, Lhi;->A(IIII)V

    const/4 v10, 0x1

    invoke-virtual {v6, v12, v10}, Lzi;->W(Lhi;Z)V

    invoke-virtual {v6, v12}, Lzi;->R(Lhi;)V

    :goto_17
    add-int/lit8 v9, v9, -0x1

    goto/16 :goto_12

    :cond_20
    const/4 v14, 0x0

    const/16 v16, 0x2

    goto/16 :goto_1e

    :cond_21
    const/4 v10, 0x1

    invoke-virtual {v7, v10}, Lh5;->c(I)V

    iget-object v6, v7, Lh5;->p:Lzi;

    iget-object v8, v7, Lh5;->a:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v9

    const/4 v13, 0x0

    :goto_18
    if-ge v13, v9, :cond_20

    invoke-virtual {v8, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LKi;

    iget-object v11, v10, LKi;->b:Lhi;

    if-eqz v11, :cond_24

    iget-object v12, v11, Lhi;->H:Lfi;

    if-nez v12, :cond_22

    goto :goto_19

    :cond_22
    invoke-virtual {v11}, Lhi;->b()Lfi;

    move-result-object v12

    const/4 v14, 0x0

    iput-boolean v14, v12, Lfi;->a:Z

    :goto_19
    iget v12, v7, Lh5;->f:I

    iget-object v14, v11, Lhi;->H:Lfi;

    if-nez v14, :cond_23

    if-nez v12, :cond_23

    goto :goto_1a

    :cond_23
    invoke-virtual {v11}, Lhi;->b()Lfi;

    iget-object v14, v11, Lhi;->H:Lfi;

    iput v12, v14, Lfi;->f:I

    :goto_1a
    invoke-virtual {v11}, Lhi;->b()Lfi;

    iget-object v12, v11, Lhi;->H:Lfi;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_24
    iget v12, v10, LKi;->a:I

    packed-switch v12, :pswitch_data_2

    :pswitch_f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, v10, LKi;->a:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_10
    iget-object v10, v10, LKi;->i:LPn;

    invoke-virtual {v6, v11, v10}, Lzi;->X(Lhi;LPn;)V

    :cond_25
    :goto_1b
    const/4 v14, 0x0

    const/16 v16, 0x2

    goto/16 :goto_1d

    :pswitch_11
    const/4 v12, 0x0

    invoke-virtual {v6, v12}, Lzi;->Y(Lhi;)V

    goto :goto_1b

    :pswitch_12
    const/4 v12, 0x0

    invoke-virtual {v6, v11}, Lzi;->Y(Lhi;)V

    goto :goto_1b

    :pswitch_13
    const/4 v12, 0x0

    iget v14, v10, LKi;->d:I

    iget v15, v10, LKi;->e:I

    iget v12, v10, LKi;->f:I

    iget v10, v10, LKi;->g:I

    invoke-virtual {v11, v14, v15, v12, v10}, Lhi;->A(IIII)V

    const/4 v14, 0x0

    invoke-virtual {v6, v11, v14}, Lzi;->W(Lhi;Z)V

    invoke-virtual {v6, v11}, Lzi;->c(Lhi;)V

    goto :goto_1b

    :pswitch_14
    iget v12, v10, LKi;->d:I

    iget v14, v10, LKi;->e:I

    iget v15, v10, LKi;->f:I

    iget v10, v10, LKi;->g:I

    invoke-virtual {v11, v12, v14, v15, v10}, Lhi;->A(IIII)V

    invoke-virtual {v6, v11}, Lzi;->g(Lhi;)V

    goto :goto_1b

    :pswitch_15
    iget v12, v10, LKi;->d:I

    iget v14, v10, LKi;->e:I

    iget v15, v10, LKi;->f:I

    iget v10, v10, LKi;->g:I

    invoke-virtual {v11, v12, v14, v15, v10}, Lhi;->A(IIII)V

    const/4 v14, 0x0

    invoke-virtual {v6, v11, v14}, Lzi;->W(Lhi;Z)V

    const/16 v16, 0x2

    invoke-static/range {v16 .. v16}, Lzi;->G(I)Z

    move-result v10

    if-eqz v10, :cond_26

    invoke-static {v11}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_26
    iget-boolean v10, v11, Lhi;->y:Z

    if-eqz v10, :cond_25

    iput-boolean v14, v11, Lhi;->y:Z

    iget-boolean v10, v11, Lhi;->I:Z

    const/16 v17, 0x1

    xor-int/lit8 v10, v10, 0x1

    iput-boolean v10, v11, Lhi;->I:Z

    goto :goto_1b

    :pswitch_16
    iget v12, v10, LKi;->d:I

    iget v14, v10, LKi;->e:I

    iget v15, v10, LKi;->f:I

    iget v10, v10, LKi;->g:I

    invoke-virtual {v11, v12, v14, v15, v10}, Lhi;->A(IIII)V

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v16, 0x2

    invoke-static/range {v16 .. v16}, Lzi;->G(I)Z

    move-result v10

    if-eqz v10, :cond_27

    invoke-static {v11}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_27
    iget-boolean v10, v11, Lhi;->y:Z

    if-nez v10, :cond_28

    const/4 v10, 0x1

    iput-boolean v10, v11, Lhi;->y:Z

    iget-boolean v12, v11, Lhi;->I:Z

    xor-int/2addr v12, v10

    iput-boolean v12, v11, Lhi;->I:Z

    invoke-virtual {v6, v11}, Lzi;->Z(Lhi;)V

    :cond_28
    :goto_1c
    const/4 v14, 0x0

    goto :goto_1d

    :pswitch_17
    const/16 v16, 0x2

    iget v12, v10, LKi;->d:I

    iget v14, v10, LKi;->e:I

    iget v15, v10, LKi;->f:I

    iget v10, v10, LKi;->g:I

    invoke-virtual {v11, v12, v14, v15, v10}, Lhi;->A(IIII)V

    invoke-virtual {v6, v11}, Lzi;->R(Lhi;)V

    goto :goto_1c

    :pswitch_18
    const/16 v16, 0x2

    iget v12, v10, LKi;->d:I

    iget v14, v10, LKi;->e:I

    iget v15, v10, LKi;->f:I

    iget v10, v10, LKi;->g:I

    invoke-virtual {v11, v12, v14, v15, v10}, Lhi;->A(IIII)V

    const/4 v14, 0x0

    invoke-virtual {v6, v11, v14}, Lzi;->W(Lhi;Z)V

    invoke-virtual {v6, v11}, Lzi;->a(Lhi;)LHi;

    :goto_1d
    add-int/lit8 v13, v13, 0x1

    goto/16 :goto_18

    :goto_1e
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_11

    :cond_29
    add-int/lit8 v4, v3, -0x1

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    move/from16 v5, p3

    :goto_1f
    if-ge v5, v3, :cond_2e

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lh5;

    if-eqz v4, :cond_2b

    iget-object v8, v7, Lh5;->a:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    const/16 v17, 0x1

    add-int/lit8 v8, v8, -0x1

    :goto_20
    if-ltz v8, :cond_2d

    iget-object v9, v7, Lh5;->a:Ljava/util/ArrayList;

    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LKi;

    iget-object v9, v9, LKi;->b:Lhi;

    if-eqz v9, :cond_2a

    invoke-virtual {v1, v9}, Lzi;->f(Lhi;)LHi;

    move-result-object v9

    invoke-virtual {v9}, LHi;->k()V

    :cond_2a
    add-int/lit8 v8, v8, -0x1

    goto :goto_20

    :cond_2b
    iget-object v7, v7, Lh5;->a:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_2c
    :goto_21
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2d

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LKi;

    iget-object v8, v8, LKi;->b:Lhi;

    if-eqz v8, :cond_2c

    invoke-virtual {v1, v8}, Lzi;->f(Lhi;)LHi;

    move-result-object v8

    invoke-virtual {v8}, LHi;->k()V

    goto :goto_21

    :cond_2d
    add-int/lit8 v5, v5, 0x1

    goto :goto_1f

    :cond_2e
    iget v5, v1, Lzi;->t:I

    const/4 v10, 0x1

    invoke-virtual {v1, v5, v10}, Lzi;->M(IZ)V

    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    move/from16 v7, p3

    :goto_22
    if-ge v7, v3, :cond_32

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lh5;

    iget-object v8, v8, Lh5;->a:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_2f
    :goto_23
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_31

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LKi;

    iget-object v9, v9, LKi;->b:Lhi;

    if-eqz v9, :cond_2f

    iget-object v9, v9, Lhi;->D:Landroid/view/ViewGroup;

    if-eqz v9, :cond_2f

    invoke-virtual {v1}, Lzi;->F()LPg;

    const v10, 0x550a01fc

    invoke-virtual {v9, v10}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v11

    instance-of v12, v11, Lnd;

    if-eqz v12, :cond_30

    check-cast v11, Lnd;

    goto :goto_24

    :cond_30
    new-instance v11, Lnd;

    invoke-direct {v11, v9}, Lnd;-><init>(Landroid/view/ViewGroup;)V

    invoke-virtual {v9, v10, v11}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :goto_24
    invoke-virtual {v5, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_23

    :cond_31
    add-int/lit8 v7, v7, 0x1

    goto :goto_22

    :cond_32
    invoke-virtual {v5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_25
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_39

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lnd;

    iput-boolean v4, v7, Lnd;->d:Z

    iget-object v8, v7, Lnd;->b:Ljava/util/ArrayList;

    monitor-enter v8

    :try_start_0
    invoke-virtual {v7}, Lnd;->f()V

    iget-object v9, v7, Lnd;->b:Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v10

    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v9

    :cond_33
    invoke-interface {v9}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v10

    if-eqz v10, :cond_38

    invoke-interface {v9}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v10

    move-object v11, v10

    check-cast v11, LMy;

    iget-object v12, v11, LMy;->c:Lhi;

    iget-object v12, v12, Lhi;->E:Landroid/view/View;

    invoke-virtual {v12}, Landroid/view/View;->getAlpha()F

    move-result v13

    const/4 v14, 0x0

    cmpg-float v13, v13, v14

    const/4 v14, 0x2

    const/4 v15, 0x4

    if-nez v13, :cond_34

    invoke-virtual {v12}, Landroid/view/View;->getVisibility()I

    move-result v13

    if-nez v13, :cond_34

    goto :goto_26

    :cond_34
    invoke-virtual {v12}, Landroid/view/View;->getVisibility()I

    move-result v12

    if-eqz v12, :cond_36

    if-eq v12, v15, :cond_37

    const/16 v13, 0x8

    if-ne v12, v13, :cond_35

    const/4 v15, 0x3

    goto :goto_26

    :cond_35
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unknown visibility "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_36
    move v15, v14

    :cond_37
    :goto_26
    iget v11, v11, LMy;->a:I

    if-ne v11, v14, :cond_33

    if-eq v15, v14, :cond_33

    goto :goto_27

    :catchall_0
    move-exception v0

    goto :goto_28

    :cond_38
    const/4 v10, 0x0

    :goto_27
    check-cast v10, LMy;

    const/4 v9, 0x0

    iput-boolean v9, v7, Lnd;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v8

    invoke-virtual {v7}, Lnd;->c()V

    goto :goto_25

    :goto_28
    monitor-exit v8

    throw v0

    :cond_39
    move/from16 v4, p3

    :goto_29
    if-ge v4, v3, :cond_3b

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lh5;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-eqz v7, :cond_3a

    iget v7, v5, Lh5;->r:I

    if-ltz v7, :cond_3a

    iput v6, v5, Lh5;->r:I

    :cond_3a
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v4, v4, 0x1

    goto :goto_29

    :cond_3b
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_e
        :pswitch_5
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_18
        :pswitch_f
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
    .end packed-switch
.end method

.method public final B(I)Lhi;
    .locals 5

    iget-object v0, p0, Lzi;->c:Lqs;

    iget-object v1, v0, Lqs;->a:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    :goto_0
    if-ltz v2, :cond_1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lhi;

    if-eqz v3, :cond_0

    iget v4, v3, Lhi;->v:I

    if-ne v4, p1, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_1
    iget-object v0, v0, Lqs;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LHi;

    if-eqz v1, :cond_2

    iget-object v1, v1, LHi;->c:Lhi;

    iget v2, v1, Lhi;->v:I

    if-ne v2, p1, :cond_2

    return-object v1

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method public final C(Ljava/lang/String;)Lhi;
    .locals 5

    iget-object v0, p0, Lzi;->c:Lqs;

    iget-object v1, v0, Lqs;->a:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    if-eqz p1, :cond_1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    :goto_0
    if-ltz v2, :cond_1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lhi;

    if-eqz v3, :cond_0

    iget-object v4, v3, Lhi;->x:Ljava/lang/String;

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_3

    iget-object v0, v0, Lqs;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LHi;

    if-eqz v1, :cond_2

    iget-object v1, v1, LHi;->c:Lhi;

    iget-object v2, v1, Lhi;->x:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    return-object v1

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method public final D(Lhi;)Landroid/view/ViewGroup;
    .locals 1

    iget-object v0, p1, Lhi;->D:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget v0, p1, Lhi;->w:I

    if-gtz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lzi;->v:LTB;

    invoke-virtual {v0}, LTB;->z()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lzi;->v:LTB;

    iget p1, p1, Lhi;->w:I

    invoke-virtual {v0, p1}, LTB;->y(I)Landroid/view/View;

    move-result-object p1

    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    check-cast p1, Landroid/view/ViewGroup;

    return-object p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final E()Lti;
    .locals 1

    iget-object v0, p0, Lzi;->w:Lhi;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lhi;->r:Lzi;

    invoke-virtual {v0}, Lzi;->E()Lti;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lzi;->y:Lti;

    return-object v0
.end method

.method public final F()LPg;
    .locals 1

    iget-object v0, p0, Lzi;->w:Lhi;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lhi;->r:Lzi;

    invoke-virtual {v0}, Lzi;->F()LPg;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lzi;->z:LPg;

    return-object v0
.end method

.method public final I()Z
    .locals 2

    iget-object v0, p0, Lzi;->w:Lhi;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Lhi;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lzi;->w:Lhi;

    invoke-virtual {v0}, Lhi;->f()Lzi;

    move-result-object v0

    invoke-virtual {v0}, Lzi;->I()Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final L()Z
    .locals 1

    iget-boolean v0, p0, Lzi;->F:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lzi;->G:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final M(IZ)V
    .locals 3

    iget-object v0, p0, Lzi;->u:Lji;

    if-nez v0, :cond_1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "No activity"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-nez p2, :cond_2

    iget p2, p0, Lzi;->t:I

    if-ne p1, p2, :cond_2

    goto :goto_3

    :cond_2
    iput p1, p0, Lzi;->t:I

    iget-object p1, p0, Lzi;->c:Lqs;

    iget-object p2, p1, Lqs;->b:Ljava/lang/Object;

    check-cast p2, Ljava/util/HashMap;

    iget-object v0, p1, Lqs;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhi;

    iget-object v1, v1, Lhi;->e:Ljava/lang/String;

    invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LHi;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, LHi;->k()V

    goto :goto_1

    :cond_4
    invoke-virtual {p2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_5
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LHi;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, LHi;->k()V

    iget-object v1, v0, LHi;->c:Lhi;

    iget-boolean v2, v1, Lhi;->l:Z

    if-eqz v2, :cond_5

    invoke-virtual {v1}, Lhi;->k()Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {p1, v0}, Lqs;->v(LHi;)V

    goto :goto_2

    :cond_6
    invoke-virtual {p0}, Lzi;->a0()V

    iget-boolean p1, p0, Lzi;->E:Z

    if-eqz p1, :cond_7

    iget-object p1, p0, Lzi;->u:Lji;

    if-eqz p1, :cond_7

    iget p2, p0, Lzi;->t:I

    const/4 v0, 0x7

    if-ne p2, v0, :cond_7

    iget-object p1, p1, Lji;->p:Lc3;

    invoke-virtual {p1}, LTa;->invalidateMenu()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lzi;->E:Z

    :cond_7
    :goto_3
    return-void
.end method

.method public final N()V
    .locals 2

    iget-object v0, p0, Lzi;->u:Lji;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lzi;->F:Z

    iput-boolean v0, p0, Lzi;->G:Z

    iget-object v1, p0, Lzi;->M:LDi;

    iput-boolean v0, v1, LDi;->i:Z

    iget-object v0, p0, Lzi;->c:Lqs;

    invoke-virtual {v0}, Lqs;->t()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhi;

    if-eqz v1, :cond_1

    iget-object v1, v1, Lhi;->t:LAi;

    invoke-virtual {v1}, Lzi;->N()V

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public final O()Z
    .locals 2

    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lzi;->P(II)Z

    move-result v0

    return v0
.end method

.method public final P(II)Z
    .locals 3

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lzi;->y(Z)Z

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lzi;->x(Z)V

    iget-object v1, p0, Lzi;->x:Lhi;

    if-eqz v1, :cond_0

    if-gez p1, :cond_0

    invoke-virtual {v1}, Lhi;->c()Lzi;

    move-result-object v1

    invoke-virtual {v1}, Lzi;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lzi;->J:Ljava/util/ArrayList;

    iget-object v2, p0, Lzi;->K:Ljava/util/ArrayList;

    invoke-virtual {p0, v1, v2, p1, p2}, Lzi;->Q(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z

    move-result p1

    if-eqz p1, :cond_1

    iput-boolean v0, p0, Lzi;->b:Z

    :try_start_0
    iget-object p2, p0, Lzi;->J:Ljava/util/ArrayList;

    iget-object v0, p0, Lzi;->K:Ljava/util/ArrayList;

    invoke-virtual {p0, p2, v0}, Lzi;->S(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lzi;->d()V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lzi;->d()V

    throw p1

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lzi;->c0()V

    invoke-virtual {p0}, Lzi;->u()V

    iget-object p2, p0, Lzi;->c:Lqs;

    iget-object p2, p2, Lqs;->b:Ljava/lang/Object;

    check-cast p2, Ljava/util/HashMap;

    invoke-virtual {p2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p2

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    return p1
.end method

.method public final Q(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z
    .locals 5

    const/4 v0, 0x1

    and-int/2addr p4, v0

    const/4 v1, 0x0

    if-eqz p4, :cond_0

    move p4, v0

    goto :goto_0

    :cond_0
    move p4, v1

    :goto_0
    iget-object v2, p0, Lzi;->d:Ljava/util/ArrayList;

    const/4 v3, -0x1

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_4

    :cond_1
    if-gez p3, :cond_3

    if-eqz p4, :cond_2

    move v3, v1

    goto :goto_4

    :cond_2
    iget-object p3, p0, Lzi;->d:Ljava/util/ArrayList;

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p3

    add-int/lit8 v3, p3, -0x1

    goto :goto_4

    :cond_3
    iget-object v2, p0, Lzi;->d:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    sub-int/2addr v2, v0

    :goto_1
    if-ltz v2, :cond_5

    iget-object v4, p0, Lzi;->d:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lh5;

    if-ltz p3, :cond_4

    iget v4, v4, Lh5;->r:I

    if-ne p3, v4, :cond_4

    goto :goto_2

    :cond_4
    add-int/lit8 v2, v2, -0x1

    goto :goto_1

    :cond_5
    :goto_2
    if-gez v2, :cond_6

    move v3, v2

    goto :goto_4

    :cond_6
    if-eqz p4, :cond_7

    move v3, v2

    :goto_3
    if-lez v3, :cond_9

    iget-object p4, p0, Lzi;->d:Ljava/util/ArrayList;

    add-int/lit8 v2, v3, -0x1

    invoke-virtual {p4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lh5;

    if-ltz p3, :cond_9

    iget p4, p4, Lh5;->r:I

    if-ne p3, p4, :cond_9

    add-int/lit8 v3, v3, -0x1

    goto :goto_3

    :cond_7
    iget-object p3, p0, Lzi;->d:Ljava/util/ArrayList;

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p3

    sub-int/2addr p3, v0

    if-ne v2, p3, :cond_8

    goto :goto_4

    :cond_8
    add-int/lit8 v3, v2, 0x1

    :cond_9
    :goto_4
    if-gez v3, :cond_a

    return v1

    :cond_a
    iget-object p3, p0, Lzi;->d:Ljava/util/ArrayList;

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p3

    sub-int/2addr p3, v0

    :goto_5
    if-lt p3, v3, :cond_b

    iget-object p4, p0, Lzi;->d:Ljava/util/ArrayList;

    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lh5;

    invoke-virtual {p1, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p2, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p3, p3, -0x1

    goto :goto_5

    :cond_b
    return v0
.end method

.method public final R(Lhi;)V
    .locals 2

    const/4 v0, 0x2

    invoke-static {v0}, Lzi;->G(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    invoke-virtual {p1}, Lhi;->k()Z

    move-result v0

    iget-boolean v1, p1, Lhi;->z:Z

    if-eqz v1, :cond_2

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    :goto_0
    iget-object v0, p0, Lzi;->c:Lqs;

    iget-object v1, v0, Lqs;->a:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    monitor-enter v1

    :try_start_0
    iget-object v0, v0, Lqs;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    iput-boolean v0, p1, Lhi;->k:Z

    invoke-static {p1}, Lzi;->H(Lhi;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    iput-boolean v1, p0, Lzi;->E:Z

    :cond_3
    iput-boolean v1, p1, Lhi;->l:Z

    invoke-virtual {p0, p1}, Lzi;->Z(Lhi;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final S(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 4

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ne v0, v1, :cond_6

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_4

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lh5;

    iget-boolean v3, v3, Lh5;->o:Z

    if-nez v3, :cond_3

    if-eq v2, v1, :cond_1

    invoke-virtual {p0, p1, p2, v2, v1}, Lzi;->A(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    :cond_1
    add-int/lit8 v2, v1, 0x1

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_2

    :goto_1
    if-ge v2, v0, :cond_2

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lh5;

    iget-boolean v3, v3, Lh5;->o:Z

    if-nez v3, :cond_2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {p0, p1, p2, v1, v2}, Lzi;->A(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    add-int/lit8 v1, v2, -0x1

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    if-eq v2, v0, :cond_5

    invoke-virtual {p0, p1, p2, v2, v0}, Lzi;->A(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    :cond_5
    :goto_2
    return-void

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Internal error with the back stack records"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final T(Landroid/os/Bundle;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "result_"

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v4

    if-eqz v4, :cond_0

    iget-object v5, v0, Lzi;->u:Lji;

    iget-object v5, v5, Lji;->m:Lc3;

    invoke-virtual {v5}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    const/4 v5, 0x7

    invoke-virtual {v3, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    iget-object v5, v0, Lzi;->k:Ljava/util/Map;

    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const-string v5, "fragment_"

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v5

    if-eqz v5, :cond_2

    iget-object v6, v0, Lzi;->u:Lji;

    iget-object v6, v6, Lji;->m:Lc3;

    invoke-virtual {v6}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    const/16 v6, 0x9

    invoke-virtual {v4, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    iget-object v3, v0, Lzi;->c:Lqs;

    iget-object v4, v3, Lqs;->c:Ljava/lang/Object;

    check-cast v4, Ljava/util/HashMap;

    iget-object v5, v3, Lqs;->b:Ljava/lang/Object;

    check-cast v5, Ljava/util/HashMap;

    invoke-virtual {v4}, Ljava/util/HashMap;->clear()V

    invoke-virtual {v4, v2}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    const-string v2, "state"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, LBi;

    if-nez v1, :cond_4

    return-void

    :cond_4
    invoke-virtual {v5}, Ljava/util/HashMap;->clear()V

    iget-object v4, v1, LBi;->a:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_5
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    iget-object v7, v0, Lzi;->m:LP3;

    const/4 v8, 0x0

    const/4 v9, 0x2

    if-eqz v6, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v3, v8, v6}, Lqs;->D(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v15

    if-eqz v15, :cond_5

    invoke-virtual {v15, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v6

    check-cast v6, LGi;

    iget-object v8, v0, Lzi;->M:LDi;

    iget-object v6, v6, LGi;->b:Ljava/lang/String;

    iget-object v8, v8, LDi;->d:Ljava/util/HashMap;

    invoke-virtual {v8, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lhi;

    if-eqz v6, :cond_7

    invoke-static {v9}, Lzi;->G(I)Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-virtual {v6}, Lhi;->toString()Ljava/lang/String;

    :cond_6
    new-instance v8, LHi;

    invoke-direct {v8, v7, v3, v6, v15}, LHi;-><init>(LP3;Lqs;Lhi;Landroid/os/Bundle;)V

    goto :goto_3

    :cond_7
    new-instance v10, LHi;

    iget-object v6, v0, Lzi;->u:Lji;

    iget-object v6, v6, Lji;->m:Lc3;

    invoke-virtual {v6}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v13

    invoke-virtual {v0}, Lzi;->E()Lti;

    move-result-object v14

    iget-object v11, v0, Lzi;->m:LP3;

    iget-object v12, v0, Lzi;->c:Lqs;

    invoke-direct/range {v10 .. v15}, LHi;-><init>(LP3;Lqs;Ljava/lang/ClassLoader;Lti;Landroid/os/Bundle;)V

    move-object v8, v10

    :goto_3
    iget-object v6, v8, LHi;->c:Lhi;

    iput-object v15, v6, Lhi;->b:Landroid/os/Bundle;

    iput-object v0, v6, Lhi;->r:Lzi;

    invoke-static {v9}, Lzi;->G(I)Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-virtual {v6}, Lhi;->toString()Ljava/lang/String;

    :cond_8
    iget-object v6, v0, Lzi;->u:Lji;

    iget-object v6, v6, Lji;->m:Lc3;

    invoke-virtual {v6}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v6

    invoke-virtual {v8, v6}, LHi;->m(Ljava/lang/ClassLoader;)V

    invoke-virtual {v3, v8}, Lqs;->u(LHi;)V

    iget v6, v0, Lzi;->t:I

    iput v6, v8, LHi;->e:I

    goto :goto_2

    :cond_9
    iget-object v2, v0, Lzi;->M:LDi;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v4, Ljava/util/ArrayList;

    iget-object v2, v2, LDi;->d:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v6, 0x1

    if-eqz v4, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lhi;

    iget-object v10, v4, Lhi;->e:Ljava/lang/String;

    invoke-virtual {v5, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-eqz v10, :cond_a

    goto :goto_4

    :cond_a
    invoke-static {v9}, Lzi;->G(I)Z

    move-result v10

    if-eqz v10, :cond_b

    invoke-virtual {v4}, Lhi;->toString()Ljava/lang/String;

    iget-object v10, v1, LBi;->a:Ljava/util/ArrayList;

    invoke-static {v10}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_b
    iget-object v10, v0, Lzi;->M:LDi;

    invoke-virtual {v10, v4}, LDi;->d(Lhi;)V

    iput-object v0, v4, Lhi;->r:Lzi;

    new-instance v10, LHi;

    invoke-direct {v10, v7, v3, v4}, LHi;-><init>(LP3;Lqs;Lhi;)V

    iput v6, v10, LHi;->e:I

    invoke-virtual {v10}, LHi;->k()V

    iput-boolean v6, v4, Lhi;->l:Z

    invoke-virtual {v10}, LHi;->k()V

    goto :goto_4

    :cond_c
    iget-object v2, v1, LBi;->b:Ljava/util/ArrayList;

    iget-object v4, v3, Lqs;->a:Ljava/lang/Object;

    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    if-eqz v2, :cond_f

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v3, v4}, Lqs;->n(Ljava/lang/String;)Lhi;

    move-result-object v5

    if-eqz v5, :cond_e

    invoke-static {v9}, Lzi;->G(I)Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-virtual {v5}, Lhi;->toString()Ljava/lang/String;

    :cond_d
    invoke-virtual {v3, v5}, Lqs;->c(Lhi;)V

    goto :goto_5

    :cond_e
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "No instantiated fragment for ("

    const-string v3, ")"

    invoke-static {v2, v4, v3}, Lph;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_f
    iget-object v2, v1, LBi;->c:[Li5;

    if-eqz v2, :cond_17

    new-instance v2, Ljava/util/ArrayList;

    iget-object v5, v1, LBi;->c:[Li5;

    array-length v5, v5

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v2, v0, Lzi;->d:Ljava/util/ArrayList;

    const/4 v2, 0x0

    :goto_6
    iget-object v5, v1, LBi;->c:[Li5;

    array-length v7, v5

    if-ge v2, v7, :cond_16

    aget-object v5, v5, v2

    iget-object v7, v5, Li5;->b:Ljava/util/ArrayList;

    new-instance v8, Lh5;

    invoke-direct {v8, v0}, Lh5;-><init>(Lzi;)V

    iget-object v10, v5, Li5;->a:[I

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_7
    array-length v13, v10

    if-ge v11, v13, :cond_12

    new-instance v13, LKi;

    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    add-int/lit8 v14, v11, 0x1

    aget v15, v10, v11

    iput v15, v13, LKi;->a:I

    invoke-static {v9}, Lzi;->G(I)Z

    move-result v15

    if-eqz v15, :cond_10

    invoke-static {v8}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    aget v15, v10, v14

    :cond_10
    invoke-static {}, LPn;->values()[LPn;

    move-result-object v15

    move/from16 p1, v9

    iget-object v9, v5, Li5;->c:[I

    aget v9, v9, v12

    aget-object v9, v15, v9

    iput-object v9, v13, LKi;->h:LPn;

    invoke-static {}, LPn;->values()[LPn;

    move-result-object v9

    iget-object v15, v5, Li5;->d:[I

    aget v15, v15, v12

    aget-object v9, v9, v15

    iput-object v9, v13, LKi;->i:LPn;

    add-int/lit8 v9, v11, 0x2

    aget v14, v10, v14

    if-eqz v14, :cond_11

    move v14, v6

    goto :goto_8

    :cond_11
    const/4 v14, 0x0

    :goto_8
    iput-boolean v14, v13, LKi;->c:Z

    add-int/lit8 v14, v11, 0x3

    aget v9, v10, v9

    iput v9, v13, LKi;->d:I

    add-int/lit8 v15, v11, 0x4

    aget v14, v10, v14

    iput v14, v13, LKi;->e:I

    add-int/lit8 v16, v11, 0x5

    aget v15, v10, v15

    iput v15, v13, LKi;->f:I

    add-int/lit8 v11, v11, 0x6

    aget v4, v10, v16

    iput v4, v13, LKi;->g:I

    iput v9, v8, Lh5;->b:I

    iput v14, v8, Lh5;->c:I

    iput v15, v8, Lh5;->d:I

    iput v4, v8, Lh5;->e:I

    invoke-virtual {v8, v13}, Lh5;->b(LKi;)V

    add-int/lit8 v12, v12, 0x1

    move/from16 v9, p1

    goto :goto_7

    :cond_12
    move/from16 p1, v9

    iget v4, v5, Li5;->e:I

    iput v4, v8, Lh5;->f:I

    iget-object v4, v5, Li5;->f:Ljava/lang/String;

    iput-object v4, v8, Lh5;->h:Ljava/lang/String;

    iput-boolean v6, v8, Lh5;->g:Z

    iget v4, v5, Li5;->h:I

    iput v4, v8, Lh5;->i:I

    iget-object v4, v5, Li5;->i:Ljava/lang/CharSequence;

    iput-object v4, v8, Lh5;->j:Ljava/lang/CharSequence;

    iget v4, v5, Li5;->j:I

    iput v4, v8, Lh5;->k:I

    iget-object v4, v5, Li5;->k:Ljava/lang/CharSequence;

    iput-object v4, v8, Lh5;->l:Ljava/lang/CharSequence;

    iget-object v4, v5, Li5;->l:Ljava/util/ArrayList;

    iput-object v4, v8, Lh5;->m:Ljava/util/ArrayList;

    iget-object v4, v5, Li5;->m:Ljava/util/ArrayList;

    iput-object v4, v8, Lh5;->n:Ljava/util/ArrayList;

    iget-boolean v4, v5, Li5;->n:Z

    iput-boolean v4, v8, Lh5;->o:Z

    iget v4, v5, Li5;->g:I

    iput v4, v8, Lh5;->r:I

    const/4 v4, 0x0

    :goto_9
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v4, v5, :cond_14

    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_13

    iget-object v9, v8, Lh5;->a:Ljava/util/ArrayList;

    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LKi;

    invoke-virtual {v3, v5}, Lqs;->n(Ljava/lang/String;)Lhi;

    move-result-object v5

    iput-object v5, v9, LKi;->b:Lhi;

    :cond_13
    add-int/lit8 v4, v4, 0x1

    goto :goto_9

    :cond_14
    invoke-virtual {v8, v6}, Lh5;->c(I)V

    invoke-static/range {p1 .. p1}, Lzi;->G(I)Z

    move-result v4

    if-eqz v4, :cond_15

    invoke-virtual {v8}, Lh5;->toString()Ljava/lang/String;

    new-instance v4, Lip;

    invoke-direct {v4}, Lip;-><init>()V

    new-instance v5, Ljava/io/PrintWriter;

    invoke-direct {v5, v4}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    const-string v4, "  "

    const/4 v7, 0x0

    invoke-virtual {v8, v4, v5, v7}, Lh5;->f(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    invoke-virtual {v5}, Ljava/io/PrintWriter;->close()V

    goto :goto_a

    :cond_15
    const/4 v7, 0x0

    :goto_a
    iget-object v4, v0, Lzi;->d:Ljava/util/ArrayList;

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    move/from16 v9, p1

    goto/16 :goto_6

    :cond_16
    const/4 v7, 0x0

    goto :goto_b

    :cond_17
    const/4 v7, 0x0

    iput-object v8, v0, Lzi;->d:Ljava/util/ArrayList;

    :goto_b
    iget-object v2, v0, Lzi;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    iget v4, v1, LBi;->d:I

    invoke-virtual {v2, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    iget-object v2, v1, LBi;->e:Ljava/lang/String;

    if-eqz v2, :cond_18

    invoke-virtual {v3, v2}, Lqs;->n(Ljava/lang/String;)Lhi;

    move-result-object v2

    iput-object v2, v0, Lzi;->x:Lhi;

    invoke-virtual {v0, v2}, Lzi;->q(Lhi;)V

    :cond_18
    iget-object v2, v1, LBi;->f:Ljava/util/ArrayList;

    if-eqz v2, :cond_19

    move v4, v7

    :goto_c
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v4, v3, :cond_19

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-object v5, v1, LBi;->g:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lj5;

    iget-object v6, v0, Lzi;->j:Ljava/util/Map;

    invoke-interface {v6, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x1

    goto :goto_c

    :cond_19
    new-instance v2, Ljava/util/ArrayDeque;

    iget-object v1, v1, LBi;->h:Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayDeque;-><init>(Ljava/util/Collection;)V

    iput-object v2, v0, Lzi;->D:Ljava/util/ArrayDeque;

    return-void
.end method

.method public final U()Landroid/os/Bundle;
    .locals 11

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p0}, Lzi;->e()Ljava/util/HashSet;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnd;

    iget-boolean v4, v2, Lnd;->e:Z

    if-eqz v4, :cond_0

    iput-boolean v3, v2, Lnd;->e:Z

    invoke-virtual {v2}, Lnd;->c()V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lzi;->e()Ljava/util/HashSet;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnd;

    invoke-virtual {v2}, Lnd;->e()V

    goto :goto_1

    :cond_2
    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lzi;->y(Z)Z

    iput-boolean v1, p0, Lzi;->F:Z

    iget-object v2, p0, Lzi;->M:LDi;

    iput-boolean v1, v2, LDi;->i:Z

    iget-object v1, p0, Lzi;->c:Lqs;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Ljava/util/ArrayList;

    iget-object v4, v1, Lqs;->b:Ljava/lang/Object;

    check-cast v4, Ljava/util/HashMap;

    invoke-virtual {v4}, Ljava/util/HashMap;->size()I

    move-result v5

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v4}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x2

    if-eqz v5, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LHi;

    if-eqz v5, :cond_3

    iget-object v7, v5, LHi;->c:Lhi;

    iget-object v8, v7, Lhi;->e:Ljava/lang/String;

    invoke-virtual {v5}, LHi;->o()Landroid/os/Bundle;

    move-result-object v5

    invoke-virtual {v1, v5, v8}, Lqs;->D(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;

    iget-object v5, v7, Lhi;->e:Ljava/lang/String;

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v6}, Lzi;->G(I)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v7}, Lhi;->toString()Ljava/lang/String;

    iget-object v5, v7, Lhi;->b:Landroid/os/Bundle;

    invoke-static {v5}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lzi;->c:Lqs;

    iget-object v1, v1, Lqs;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_5

    goto/16 :goto_8

    :cond_5
    iget-object v4, p0, Lzi;->c:Lqs;

    iget-object v5, v4, Lqs;->a:Ljava/lang/Object;

    check-cast v5, Ljava/util/ArrayList;

    monitor-enter v5

    :try_start_0
    iget-object v7, v4, Lqs;->a:Ljava/lang/Object;

    check-cast v7, Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    const/4 v8, 0x0

    if-eqz v7, :cond_6

    monitor-exit v5

    move-object v7, v8

    goto :goto_4

    :catchall_0
    move-exception v0

    goto/16 :goto_9

    :cond_6
    new-instance v7, Ljava/util/ArrayList;

    iget-object v9, v4, Lqs;->a:Ljava/lang/Object;

    check-cast v9, Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v9

    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v4, v4, Lqs;->a:Ljava/lang/Object;

    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_7
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lhi;

    iget-object v10, v9, Lhi;->e:Ljava/lang/String;

    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v6}, Lzi;->G(I)Z

    move-result v10

    if-eqz v10, :cond_7

    invoke-virtual {v9}, Lhi;->toString()Ljava/lang/String;

    goto :goto_3

    :cond_8
    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_4
    iget-object v4, p0, Lzi;->d:Ljava/util/ArrayList;

    if-eqz v4, :cond_a

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-lez v4, :cond_a

    new-array v5, v4, [Li5;

    :goto_5
    if-ge v3, v4, :cond_b

    new-instance v9, Li5;

    iget-object v10, p0, Lzi;->d:Ljava/util/ArrayList;

    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lh5;

    invoke-direct {v9, v10}, Li5;-><init>(Lh5;)V

    aput-object v9, v5, v3

    invoke-static {v6}, Lzi;->G(I)Z

    move-result v9

    if-eqz v9, :cond_9

    iget-object v9, p0, Lzi;->d:Ljava/util/ArrayList;

    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    invoke-static {v9}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_9
    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_a
    move-object v5, v8

    :cond_b
    new-instance v3, LBi;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput-object v8, v3, LBi;->e:Ljava/lang/String;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v3, LBi;->f:Ljava/util/ArrayList;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, v3, LBi;->g:Ljava/util/ArrayList;

    iput-object v2, v3, LBi;->a:Ljava/util/ArrayList;

    iput-object v7, v3, LBi;->b:Ljava/util/ArrayList;

    iput-object v5, v3, LBi;->c:[Li5;

    iget-object v2, p0, Lzi;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    iput v2, v3, LBi;->d:I

    iget-object v2, p0, Lzi;->x:Lhi;

    if-eqz v2, :cond_c

    iget-object v2, v2, Lhi;->e:Ljava/lang/String;

    iput-object v2, v3, LBi;->e:Ljava/lang/String;

    :cond_c
    iget-object v2, p0, Lzi;->j:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v2, p0, Lzi;->j:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    new-instance v2, Ljava/util/ArrayList;

    iget-object v4, p0, Lzi;->D:Ljava/util/ArrayDeque;

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v3, LBi;->h:Ljava/util/ArrayList;

    const-string v2, "state"

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    iget-object v2, p0, Lzi;->k:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "result_"

    invoke-static {v4, v3}, LEy;->r(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lzi;->k:Ljava/util/Map;

    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/os/Bundle;

    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_6

    :cond_d
    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "fragment_"

    invoke-static {v4, v3}, LEy;->r(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/os/Bundle;

    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_7

    :cond_e
    :goto_8
    return-object v0

    :goto_9
    :try_start_1
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final V()V
    .locals 3

    iget-object v0, p0, Lzi;->a:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lzi;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lzi;->u:Lji;

    iget-object v1, v1, Lji;->n:Landroid/os/Handler;

    iget-object v2, p0, Lzi;->N:LK0;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v1, p0, Lzi;->u:Lji;

    iget-object v1, v1, Lji;->n:Landroid/os/Handler;

    iget-object v2, p0, Lzi;->N:LK0;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    invoke-virtual {p0}, Lzi;->c0()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final W(Lhi;Z)V
    .locals 1

    invoke-virtual {p0, p1}, Lzi;->D(Lhi;)Landroid/view/ViewGroup;

    move-result-object p1

    if-eqz p1, :cond_0

    instance-of v0, p1, Landroidx/fragment/app/FragmentContainerView;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/fragment/app/FragmentContainerView;

    xor-int/lit8 p2, p2, 0x1

    invoke-virtual {p1, p2}, Landroidx/fragment/app/FragmentContainerView;->setDrawDisappearingViewsLast(Z)V

    :cond_0
    return-void
.end method

.method public final X(Lhi;LPn;)V
    .locals 2

    iget-object v0, p1, Lhi;->e:Ljava/lang/String;

    iget-object v1, p0, Lzi;->c:Lqs;

    invoke-virtual {v1, v0}, Lqs;->n(Ljava/lang/String;)Lhi;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Lhi;->s:Lji;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lhi;->r:Lzi;

    if-ne v0, p0, :cond_1

    :cond_0
    iput-object p2, p1, Lhi;->L:LPn;

    return-void

    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Fragment "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not an active fragment of FragmentManager "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final Y(Lhi;)V
    .locals 3

    if-eqz p1, :cond_1

    iget-object v0, p1, Lhi;->e:Ljava/lang/String;

    iget-object v1, p0, Lzi;->c:Lqs;

    invoke-virtual {v1, v0}, Lqs;->n(Ljava/lang/String;)Lhi;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Lhi;->s:Lji;

    if-eqz v0, :cond_1

    iget-object v0, p1, Lhi;->r:Lzi;

    if-ne v0, p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not an active fragment of FragmentManager "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lzi;->x:Lhi;

    iput-object p1, p0, Lzi;->x:Lhi;

    invoke-virtual {p0, v0}, Lzi;->q(Lhi;)V

    iget-object p1, p0, Lzi;->x:Lhi;

    invoke-virtual {p0, p1}, Lzi;->q(Lhi;)V

    return-void
.end method

.method public final Z(Lhi;)V
    .locals 5

    invoke-virtual {p0, p1}, Lzi;->D(Lhi;)Landroid/view/ViewGroup;

    move-result-object v0

    if-eqz v0, :cond_7

    iget-object v1, p1, Lhi;->H:Lfi;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    iget v3, v1, Lfi;->b:I

    :goto_0
    if-nez v1, :cond_1

    move v4, v2

    goto :goto_1

    :cond_1
    iget v4, v1, Lfi;->c:I

    :goto_1
    add-int/2addr v4, v3

    if-nez v1, :cond_2

    move v3, v2

    goto :goto_2

    :cond_2
    iget v3, v1, Lfi;->d:I

    :goto_2
    add-int/2addr v3, v4

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    iget v1, v1, Lfi;->e:I

    :goto_3
    add-int/2addr v1, v3

    if-lez v1, :cond_7

    const v1, 0x550a0264

    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_4

    invoke-virtual {v0, v1, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_4
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhi;

    iget-object p1, p1, Lhi;->H:Lfi;

    if-nez p1, :cond_5

    goto :goto_4

    :cond_5
    iget-boolean v2, p1, Lfi;->a:Z

    :goto_4
    iget-object p1, v0, Lhi;->H:Lfi;

    if-nez p1, :cond_6

    goto :goto_5

    :cond_6
    invoke-virtual {v0}, Lhi;->b()Lfi;

    move-result-object p1

    iput-boolean v2, p1, Lfi;->a:Z

    :cond_7
    :goto_5
    return-void
.end method

.method public final a(Lhi;)LHi;
    .locals 3

    iget-object v0, p1, Lhi;->K:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {p1, v0}, LJi;->c(Lhi;Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x2

    invoke-static {v0}, Lzi;->G(I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lhi;->toString()Ljava/lang/String;

    :cond_1
    invoke-virtual {p0, p1}, Lzi;->f(Lhi;)LHi;

    move-result-object v0

    iput-object p0, p1, Lhi;->r:Lzi;

    iget-object v1, p0, Lzi;->c:Lqs;

    invoke-virtual {v1, v0}, Lqs;->u(LHi;)V

    iget-boolean v2, p1, Lhi;->z:Z

    if-nez v2, :cond_3

    invoke-virtual {v1, p1}, Lqs;->c(Lhi;)V

    const/4 v1, 0x0

    iput-boolean v1, p1, Lhi;->l:Z

    iget-object v2, p1, Lhi;->E:Landroid/view/View;

    if-nez v2, :cond_2

    iput-boolean v1, p1, Lhi;->I:Z

    :cond_2
    invoke-static {p1}, Lzi;->H(Lhi;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    iput-boolean p1, p0, Lzi;->E:Z

    :cond_3
    return-object v0
.end method

.method public final a0()V
    .locals 4

    iget-object v0, p0, Lzi;->c:Lqs;

    invoke-virtual {v0}, Lqs;->q()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LHi;

    iget-object v2, v1, LHi;->c:Lhi;

    iget-boolean v3, v2, Lhi;->F:Z

    if-eqz v3, :cond_0

    iget-boolean v3, p0, Lzi;->b:Z

    if-eqz v3, :cond_1

    const/4 v1, 0x1

    iput-boolean v1, p0, Lzi;->I:Z

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    iput-boolean v3, v2, Lhi;->F:Z

    invoke-virtual {v1}, LHi;->k()V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final b(Lji;LTB;Lhi;)V
    .locals 8

    iget-object v0, p0, Lzi;->u:Lji;

    if-nez v0, :cond_14

    iput-object p1, p0, Lzi;->u:Lji;

    iput-object p2, p0, Lzi;->v:LTB;

    iput-object p3, p0, Lzi;->w:Lhi;

    iget-object p2, p0, Lzi;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz p3, :cond_0

    new-instance v0, Lui;

    invoke-direct {v0, p3}, Lui;-><init>(Lhi;)V

    invoke-virtual {p2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p2, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    iget-object p2, p0, Lzi;->w:Lhi;

    if-eqz p2, :cond_2

    invoke-virtual {p0}, Lzi;->c0()V

    :cond_2
    if-eqz p1, :cond_5

    iget-object p2, p1, Lji;->p:Lc3;

    invoke-virtual {p2}, LTa;->getOnBackPressedDispatcher()Lot;

    move-result-object v3

    iput-object v3, p0, Lzi;->g:Lot;

    if-eqz p3, :cond_3

    move-object p2, p3

    goto :goto_1

    :cond_3
    move-object p2, p1

    :goto_1
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p2}, LYn;->getLifecycle()LRn;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Lao;

    iget-object v0, v0, Lao;->c:LPn;

    sget-object v1, LPn;->a:LPn;

    if-ne v0, v1, :cond_4

    goto :goto_2

    :cond_4
    new-instance v0, Llt;

    iget-object v7, p0, Lzi;->h:Lri;

    invoke-direct {v0, v3, p2, v7}, Llt;-><init>(Lot;LRn;Lri;)V

    iget-object p2, v7, Lri;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Lot;->d()V

    new-instance v0, Lnt;

    const-string v5, "updateEnabledCallbacks()V"

    const/4 v6, 0x0

    const/4 v1, 0x0

    const-class v2, Lot;

    const-string v4, "updateEnabledCallbacks"

    invoke-direct/range {v0 .. v6}, Lnt;-><init>(ILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;I)V

    iput-object v0, v7, Lri;->c:Lpj;

    :cond_5
    :goto_2
    if-eqz p3, :cond_7

    iget-object p1, p3, Lhi;->r:Lzi;

    iget-object p1, p1, Lzi;->M:LDi;

    iget-object p2, p1, LDi;->e:Ljava/util/HashMap;

    iget-object v0, p3, Lhi;->e:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LDi;

    if-nez v0, :cond_6

    new-instance v0, LDi;

    iget-boolean p1, p1, LDi;->g:Z

    invoke-direct {v0, p1}, LDi;-><init>(Z)V

    iget-object p1, p3, Lhi;->e:Ljava/lang/String;

    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    iput-object v0, p0, Lzi;->M:LDi;

    goto :goto_6

    :cond_7
    if-eqz p1, :cond_b

    iget-object p1, p1, Lji;->p:Lc3;

    invoke-virtual {p1}, LTa;->getViewModelStore()LxE;

    move-result-object p1

    sget-object p2, Ljc;->b:Ljc;

    const-class v0, LDi;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_a

    const-string v2, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p1, LxE;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LuE;

    invoke-virtual {v0, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v3

    sget-object v4, LDi;->j:LCi;

    if-eqz v3, :cond_8

    goto :goto_5

    :cond_8
    new-instance v2, Lts;

    invoke-direct {v2, p2}, Lts;-><init>(Llc;)V

    sget-object p2, Lgf;->n:Lgf;

    invoke-virtual {v2, p2, v1}, Lts;->a(Lkc;Ljava/lang/Object;)V

    :try_start_0
    invoke-interface {v4, v0, v2}, LwE;->b(Ljava/lang/Class;Lts;)LuE;

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    :goto_3
    move-object v2, p2

    goto :goto_4

    :catch_0
    invoke-interface {v4, v0}, LwE;->a(Ljava/lang/Class;)LuE;

    move-result-object p2

    goto :goto_3

    :goto_4
    iget-object p1, p1, LxE;->a:Ljava/util/LinkedHashMap;

    invoke-interface {p1, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LuE;

    if-eqz p1, :cond_9

    invoke-virtual {p1}, LuE;->b()V

    :cond_9
    :goto_5
    check-cast v2, LDi;

    iput-object v2, p0, Lzi;->M:LDi;

    goto :goto_6

    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Local and anonymous classes can not be ViewModels"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    new-instance p1, LDi;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, LDi;-><init>(Z)V

    iput-object p1, p0, Lzi;->M:LDi;

    :goto_6
    iget-object p1, p0, Lzi;->M:LDi;

    invoke-virtual {p0}, Lzi;->L()Z

    move-result p2

    iput-boolean p2, p1, LDi;->i:Z

    iget-object p1, p0, Lzi;->c:Lqs;

    iget-object p2, p0, Lzi;->M:LDi;

    iput-object p2, p1, Lqs;->d:Ljava/lang/Object;

    iget-object p1, p0, Lzi;->u:Lji;

    if-eqz p1, :cond_c

    if-nez p3, :cond_c

    iget-object p1, p1, Lji;->p:Lc3;

    invoke-virtual {p1}, LTa;->getSavedStateRegistry()Lhx;

    move-result-object p1

    new-instance p2, LIa;

    const/4 v0, 0x2

    invoke-direct {p2, v0, p0}, LIa;-><init>(ILjava/lang/Object;)V

    const-string v0, "android:support:fragments"

    invoke-virtual {p1, v0, p2}, Lhx;->c(Ljava/lang/String;Lgx;)V

    invoke-virtual {p1, v0}, Lhx;->a(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_c

    invoke-virtual {p0, p1}, Lzi;->T(Landroid/os/Bundle;)V

    :cond_c
    iget-object p1, p0, Lzi;->u:Lji;

    if-eqz p1, :cond_e

    iget-object p1, p1, Lji;->p:Lc3;

    invoke-virtual {p1}, LTa;->getActivityResultRegistry()Lc1;

    move-result-object p1

    if-eqz p3, :cond_d

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p3, Lhi;->e:Ljava/lang/String;

    const-string v1, ":"

    invoke-static {p2, v0, v1}, LEy;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_7

    :cond_d
    const-string p2, ""

    :goto_7
    const-string v0, "FragmentManager:"

    invoke-static {v0, p2}, LEy;->r(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "StartActivityForResult"

    invoke-static {p2, v0}, LEy;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, LU0;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, LU0;-><init>(I)V

    new-instance v2, Lqi;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3}, Lqi;-><init>(Lzi;I)V

    invoke-virtual {p1, v0, v1, v2}, Lc1;->c(Ljava/lang/String;LT0;LR0;)Lb1;

    move-result-object v0

    iput-object v0, p0, Lzi;->A:Lb1;

    const-string v0, "StartIntentSenderForResult"

    invoke-static {p2, v0}, LEy;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, LU0;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, LU0;-><init>(I)V

    new-instance v2, Lqi;

    const/4 v3, 0x2

    invoke-direct {v2, p0, v3}, Lqi;-><init>(Lzi;I)V

    invoke-virtual {p1, v0, v1, v2}, Lc1;->c(Ljava/lang/String;LT0;LR0;)Lb1;

    move-result-object v0

    iput-object v0, p0, Lzi;->B:Lb1;

    const-string v0, "RequestPermissions"

    invoke-static {p2, v0}, LEy;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-instance v0, LU0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LU0;-><init>(I)V

    new-instance v1, Lqi;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lqi;-><init>(Lzi;I)V

    invoke-virtual {p1, p2, v0, v1}, Lc1;->c(Ljava/lang/String;LT0;LR0;)Lb1;

    move-result-object p1

    iput-object p1, p0, Lzi;->C:Lb1;

    :cond_e
    iget-object p1, p0, Lzi;->u:Lji;

    if-eqz p1, :cond_f

    iget-object p2, p0, Lzi;->o:Lpi;

    iget-object p1, p1, Lji;->p:Lc3;

    invoke-virtual {p1, p2}, LTa;->addOnConfigurationChangedListener(Lub;)V

    :cond_f
    iget-object p1, p0, Lzi;->u:Lji;

    if-eqz p1, :cond_10

    iget-object p2, p0, Lzi;->p:Lpi;

    iget-object p1, p1, Lji;->p:Lc3;

    invoke-virtual {p1, p2}, LTa;->addOnTrimMemoryListener(Lub;)V

    :cond_10
    iget-object p1, p0, Lzi;->u:Lji;

    if-eqz p1, :cond_11

    iget-object p2, p0, Lzi;->q:Lpi;

    iget-object p1, p1, Lji;->p:Lc3;

    invoke-virtual {p1, p2}, LTa;->addOnMultiWindowModeChangedListener(Lub;)V

    :cond_11
    iget-object p1, p0, Lzi;->u:Lji;

    if-eqz p1, :cond_12

    iget-object p2, p0, Lzi;->r:Lpi;

    iget-object p1, p1, Lji;->p:Lc3;

    invoke-virtual {p1, p2}, LTa;->addOnPictureInPictureModeChangedListener(Lub;)V

    :cond_12
    iget-object p1, p0, Lzi;->u:Lji;

    if-eqz p1, :cond_13

    if-nez p3, :cond_13

    iget-object p2, p0, Lzi;->s:Lsi;

    iget-object p1, p1, Lji;->p:Lc3;

    invoke-virtual {p1, p2}, LTa;->addMenuProvider(LEr;)V

    :cond_13
    return-void

    :cond_14
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Already attached"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b0(Ljava/lang/IllegalStateException;)V
    .locals 5

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    new-instance v0, Lip;

    invoke-direct {v0}, Lip;-><init>()V

    new-instance v1, Ljava/io/PrintWriter;

    invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    iget-object v0, p0, Lzi;->u:Lji;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v4, "  "

    if-eqz v0, :cond_0

    :try_start_0
    new-array v2, v2, [Ljava/lang/String;

    iget-object v0, v0, Lji;->p:Lc3;

    invoke-virtual {v0, v4, v3, v1, v2}, Lki;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-array v0, v2, [Ljava/lang/String;

    invoke-virtual {p0, v4, v3, v1, v0}, Lzi;->v(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_0
    throw p1
.end method

.method public final c(Lhi;)V
    .locals 2

    const/4 v0, 0x2

    invoke-static {v0}, Lzi;->G(I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    iget-boolean v1, p1, Lhi;->z:Z

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    iput-boolean v1, p1, Lhi;->z:Z

    iget-boolean v1, p1, Lhi;->k:Z

    if-nez v1, :cond_2

    iget-object v1, p0, Lzi;->c:Lqs;

    invoke-virtual {v1, p1}, Lqs;->c(Lhi;)V

    invoke-static {v0}, Lzi;->G(I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lhi;->toString()Ljava/lang/String;

    :cond_1
    invoke-static {p1}, Lzi;->H(Lhi;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    iput-boolean p1, p0, Lzi;->E:Z

    :cond_2
    return-void
.end method

.method public final c0()V
    .locals 4

    iget-object v0, p0, Lzi;->a:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lzi;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_1

    iget-object v1, p0, Lzi;->h:Lri;

    iput-boolean v2, v1, Lri;->a:Z

    iget-object v1, v1, Lri;->c:Lpj;

    if-eqz v1, :cond_0

    invoke-interface {v1}, LUi;->a()Ljava/lang/Object;

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lzi;->h:Lri;

    iget-object v1, p0, Lzi;->d:Ljava/util/ArrayList;

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    goto :goto_0

    :cond_2
    move v1, v3

    :goto_0
    if-lez v1, :cond_3

    iget-object v1, p0, Lzi;->w:Lhi;

    invoke-static {v1}, Lzi;->K(Lhi;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    move v2, v3

    :goto_1
    iput-boolean v2, v0, Lri;->a:Z

    iget-object v0, v0, Lri;->c:Lpj;

    if-eqz v0, :cond_4

    invoke-interface {v0}, LUi;->a()Ljava/lang/Object;

    :cond_4
    return-void

    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final d()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lzi;->b:Z

    iget-object v0, p0, Lzi;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lzi;->J:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final e()Ljava/util/HashSet;
    .locals 6

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iget-object v1, p0, Lzi;->c:Lqs;

    invoke-virtual {v1}, Lqs;->q()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LHi;

    iget-object v2, v2, LHi;->c:Lhi;

    iget-object v2, v2, Lhi;->D:Landroid/view/ViewGroup;

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lzi;->F()LPg;

    const v3, 0x550a01fc

    invoke-virtual {v2, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Lnd;

    if-eqz v5, :cond_1

    check-cast v4, Lnd;

    goto :goto_1

    :cond_1
    new-instance v4, Lnd;

    invoke-direct {v4, v2}, Lnd;-><init>(Landroid/view/ViewGroup;)V

    invoke-virtual {v2, v3, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :goto_1
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public final f(Lhi;)LHi;
    .locals 3

    iget-object v0, p1, Lhi;->e:Ljava/lang/String;

    iget-object v1, p0, Lzi;->c:Lqs;

    iget-object v2, v1, Lqs;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LHi;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, LHi;

    iget-object v2, p0, Lzi;->m:LP3;

    invoke-direct {v0, v2, v1, p1}, LHi;-><init>(LP3;Lqs;Lhi;)V

    iget-object p1, p0, Lzi;->u:Lji;

    iget-object p1, p1, Lji;->m:Lc3;

    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    invoke-virtual {v0, p1}, LHi;->m(Ljava/lang/ClassLoader;)V

    iget p1, p0, Lzi;->t:I

    iput p1, v0, LHi;->e:I

    return-object v0
.end method

.method public final g(Lhi;)V
    .locals 3

    const/4 v0, 0x2

    invoke-static {v0}, Lzi;->G(I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    iget-boolean v1, p1, Lhi;->z:Z

    if-nez v1, :cond_3

    const/4 v1, 0x1

    iput-boolean v1, p1, Lhi;->z:Z

    iget-boolean v2, p1, Lhi;->k:Z

    if-eqz v2, :cond_3

    invoke-static {v0}, Lzi;->G(I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lhi;->toString()Ljava/lang/String;

    :cond_1
    iget-object v0, p0, Lzi;->c:Lqs;

    iget-object v2, v0, Lqs;->a:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    monitor-enter v2

    :try_start_0
    iget-object v0, v0, Lqs;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    iput-boolean v0, p1, Lhi;->k:Z

    invoke-static {p1}, Lzi;->H(Lhi;)Z

    move-result v0

    if-eqz v0, :cond_2

    iput-boolean v1, p0, Lzi;->E:Z

    :cond_2
    invoke-virtual {p0, p1}, Lzi;->Z(Lhi;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_3
    return-void
.end method

.method public final h(ZLandroid/content/res/Configuration;)V
    .locals 3

    if-eqz p1, :cond_1

    iget-object v0, p0, Lzi;->u:Lji;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lzi;->b0(Ljava/lang/IllegalStateException;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lzi;->c:Lqs;

    invoke-virtual {v0}, Lqs;->t()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhi;

    if-eqz v1, :cond_2

    invoke-virtual {v1, p2}, Lhi;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    if-eqz p1, :cond_2

    iget-object v1, v1, Lhi;->t:LAi;

    const/4 v2, 0x1

    invoke-virtual {v1, v2, p2}, Lzi;->h(ZLandroid/content/res/Configuration;)V

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final i()Z
    .locals 5

    iget v0, p0, Lzi;->t:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge v0, v2, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lzi;->c:Lqs;

    invoke-virtual {v0}, Lqs;->t()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lhi;

    if-eqz v3, :cond_1

    iget-boolean v4, v3, Lhi;->y:Z

    if-nez v4, :cond_2

    iget-object v3, v3, Lhi;->t:LAi;

    invoke-virtual {v3}, Lzi;->i()Z

    move-result v3

    goto :goto_0

    :cond_2
    move v3, v1

    :goto_0
    if-eqz v3, :cond_1

    return v2

    :cond_3
    :goto_1
    return v1
.end method

.method public final j()Z
    .locals 7

    iget v0, p0, Lzi;->t:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge v0, v2, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lzi;->c:Lqs;

    invoke-virtual {v0}, Lqs;->t()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v3, 0x0

    move v4, v1

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lhi;

    if-eqz v5, :cond_1

    invoke-static {v5}, Lzi;->J(Lhi;)Z

    move-result v6

    if-eqz v6, :cond_1

    iget-boolean v6, v5, Lhi;->y:Z

    if-nez v6, :cond_2

    iget-object v6, v5, Lhi;->t:LAi;

    invoke-virtual {v6}, Lzi;->j()Z

    move-result v6

    goto :goto_1

    :cond_2
    move v6, v1

    :goto_1
    if-eqz v6, :cond_1

    if-nez v3, :cond_3

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    :cond_3
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v4, v2

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lzi;->e:Ljava/util/ArrayList;

    if-eqz v0, :cond_7

    :goto_2
    iget-object v0, p0, Lzi;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_7

    iget-object v0, p0, Lzi;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhi;

    if-eqz v3, :cond_5

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    :cond_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_6
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_7
    iput-object v3, p0, Lzi;->e:Ljava/util/ArrayList;

    return v4
.end method

.method public final k()V
    .locals 5

    const/4 v0, 0x1

    iput-boolean v0, p0, Lzi;->H:Z

    invoke-virtual {p0, v0}, Lzi;->y(Z)Z

    invoke-virtual {p0}, Lzi;->e()Ljava/util/HashSet;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnd;

    invoke-virtual {v2}, Lnd;->e()V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lzi;->u:Lji;

    iget-object v2, p0, Lzi;->c:Lqs;

    if-eqz v1, :cond_1

    iget-object v0, v2, Lqs;->d:Ljava/lang/Object;

    check-cast v0, LDi;

    iget-boolean v0, v0, LDi;->h:Z

    goto :goto_1

    :cond_1
    iget-object v1, v1, Lji;->m:Lc3;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result v1

    xor-int/2addr v0, v1

    :cond_2
    :goto_1
    if-eqz v0, :cond_4

    iget-object v0, p0, Lzi;->j:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj5;

    iget-object v1, v1, Lj5;->a:Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-object v4, v2, Lqs;->d:Ljava/lang/Object;

    check-cast v4, LDi;

    invoke-virtual {v4, v3}, LDi;->c(Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lzi;->t(I)V

    iget-object v0, p0, Lzi;->u:Lji;

    if-eqz v0, :cond_5

    iget-object v1, p0, Lzi;->p:Lpi;

    iget-object v0, v0, Lji;->p:Lc3;

    invoke-virtual {v0, v1}, LTa;->removeOnTrimMemoryListener(Lub;)V

    :cond_5
    iget-object v0, p0, Lzi;->u:Lji;

    if-eqz v0, :cond_6

    iget-object v1, p0, Lzi;->o:Lpi;

    iget-object v0, v0, Lji;->p:Lc3;

    invoke-virtual {v0, v1}, LTa;->removeOnConfigurationChangedListener(Lub;)V

    :cond_6
    iget-object v0, p0, Lzi;->u:Lji;

    if-eqz v0, :cond_7

    iget-object v1, p0, Lzi;->q:Lpi;

    iget-object v0, v0, Lji;->p:Lc3;

    invoke-virtual {v0, v1}, LTa;->removeOnMultiWindowModeChangedListener(Lub;)V

    :cond_7
    iget-object v0, p0, Lzi;->u:Lji;

    if-eqz v0, :cond_8

    iget-object v1, p0, Lzi;->r:Lpi;

    iget-object v0, v0, Lji;->p:Lc3;

    invoke-virtual {v0, v1}, LTa;->removeOnPictureInPictureModeChangedListener(Lub;)V

    :cond_8
    iget-object v0, p0, Lzi;->u:Lji;

    if-eqz v0, :cond_9

    iget-object v1, p0, Lzi;->w:Lhi;

    if-nez v1, :cond_9

    iget-object v1, p0, Lzi;->s:Lsi;

    iget-object v0, v0, Lji;->p:Lc3;

    invoke-virtual {v0, v1}, LTa;->removeMenuProvider(LEr;)V

    :cond_9
    const/4 v0, 0x0

    iput-object v0, p0, Lzi;->u:Lji;

    iput-object v0, p0, Lzi;->v:LTB;

    iput-object v0, p0, Lzi;->w:Lhi;

    iget-object v1, p0, Lzi;->g:Lot;

    if-eqz v1, :cond_b

    iget-object v1, p0, Lzi;->h:Lri;

    iget-object v1, v1, Lri;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LL6;

    invoke-interface {v2}, LL6;->cancel()V

    goto :goto_3

    :cond_a
    iput-object v0, p0, Lzi;->g:Lot;

    :cond_b
    iget-object v0, p0, Lzi;->A:Lb1;

    if-eqz v0, :cond_c

    iget-object v1, v0, Lb1;->a:Lc1;

    iget-object v0, v0, Lb1;->b:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lc1;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lzi;->B:Lb1;

    iget-object v1, v0, Lb1;->a:Lc1;

    iget-object v0, v0, Lb1;->b:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lc1;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lzi;->C:Lb1;

    iget-object v1, v0, Lb1;->a:Lc1;

    iget-object v0, v0, Lb1;->b:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lc1;->e(Ljava/lang/String;)V

    :cond_c
    return-void
.end method

.method public final l(Z)V
    .locals 3

    if-eqz p1, :cond_1

    iget-object v0, p0, Lzi;->u:Lji;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lzi;->b0(Ljava/lang/IllegalStateException;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lzi;->c:Lqs;

    invoke-virtual {v0}, Lqs;->t()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhi;

    if-eqz v1, :cond_2

    const/4 v2, 0x1

    iput-boolean v2, v1, Lhi;->C:Z

    if-eqz p1, :cond_2

    iget-object v1, v1, Lhi;->t:LAi;

    invoke-virtual {v1, v2}, Lzi;->l(Z)V

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final m(Z)V
    .locals 3

    if-eqz p1, :cond_1

    iget-object v0, p0, Lzi;->u:Lji;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lzi;->b0(Ljava/lang/IllegalStateException;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lzi;->c:Lqs;

    invoke-virtual {v0}, Lqs;->t()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhi;

    if-eqz v1, :cond_2

    if-eqz p1, :cond_2

    iget-object v1, v1, Lhi;->t:LAi;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lzi;->m(Z)V

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final n()V
    .locals 2

    iget-object v0, p0, Lzi;->c:Lqs;

    invoke-virtual {v0}, Lqs;->r()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhi;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lhi;->j()Z

    iget-object v1, v1, Lhi;->t:LAi;

    invoke-virtual {v1}, Lzi;->n()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final o()Z
    .locals 5

    iget v0, p0, Lzi;->t:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge v0, v2, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lzi;->c:Lqs;

    invoke-virtual {v0}, Lqs;->t()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lhi;

    if-eqz v3, :cond_1

    iget-boolean v4, v3, Lhi;->y:Z

    if-nez v4, :cond_2

    iget-object v3, v3, Lhi;->t:LAi;

    invoke-virtual {v3}, Lzi;->o()Z

    move-result v3

    goto :goto_0

    :cond_2
    move v3, v1

    :goto_0
    if-eqz v3, :cond_1

    return v2

    :cond_3
    :goto_1
    return v1
.end method

.method public final p()V
    .locals 3

    iget v0, p0, Lzi;->t:I

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lzi;->c:Lqs;

    invoke-virtual {v0}, Lqs;->t()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhi;

    if-eqz v1, :cond_1

    iget-boolean v2, v1, Lhi;->y:Z

    if-nez v2, :cond_1

    iget-object v1, v1, Lhi;->t:LAi;

    invoke-virtual {v1}, Lzi;->p()V

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public final q(Lhi;)V
    .locals 2

    if-eqz p1, :cond_1

    iget-object v0, p1, Lhi;->e:Ljava/lang/String;

    iget-object v1, p0, Lzi;->c:Lqs;

    invoke-virtual {v1, v0}, Lqs;->n(Ljava/lang/String;)Lhi;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Lhi;->r:Lzi;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lzi;->K(Lhi;)Z

    move-result v0

    iget-object v1, p1, Lhi;->j:Ljava/lang/Boolean;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eq v1, v0, :cond_1

    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p1, Lhi;->j:Ljava/lang/Boolean;

    iget-object p1, p1, Lhi;->t:LAi;

    invoke-virtual {p1}, Lzi;->c0()V

    iget-object v0, p1, Lzi;->x:Lhi;

    invoke-virtual {p1, v0}, Lzi;->q(Lhi;)V

    :cond_1
    return-void
.end method

.method public final r(Z)V
    .locals 3

    if-eqz p1, :cond_1

    iget-object v0, p0, Lzi;->u:Lji;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lzi;->b0(Ljava/lang/IllegalStateException;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lzi;->c:Lqs;

    invoke-virtual {v0}, Lqs;->t()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhi;

    if-eqz v1, :cond_2

    if-eqz p1, :cond_2

    iget-object v1, v1, Lhi;->t:LAi;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lzi;->r(Z)V

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final s()Z
    .locals 6

    iget v0, p0, Lzi;->t:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge v0, v2, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lzi;->c:Lqs;

    invoke-virtual {v0}, Lqs;->t()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v3, v1

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lhi;

    if-eqz v4, :cond_1

    invoke-static {v4}, Lzi;->J(Lhi;)Z

    move-result v5

    if-eqz v5, :cond_1

    iget-boolean v5, v4, Lhi;->y:Z

    if-nez v5, :cond_2

    iget-object v4, v4, Lhi;->t:LAi;

    invoke-virtual {v4}, Lzi;->s()Z

    move-result v4

    goto :goto_1

    :cond_2
    move v4, v1

    :goto_1
    if-eqz v4, :cond_1

    move v3, v2

    goto :goto_0

    :cond_3
    return v3
.end method

.method public final t(I)V
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    iput-boolean v0, p0, Lzi;->b:Z

    iget-object v2, p0, Lzi;->c:Lqs;

    iget-object v2, v2, Lqs;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LHi;

    if-eqz v3, :cond_0

    iput p1, v3, LHi;->e:I

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1, v1}, Lzi;->M(IZ)V

    invoke-virtual {p0}, Lzi;->e()Ljava/util/HashSet;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnd;

    invoke-virtual {v2}, Lnd;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    iput-boolean v1, p0, Lzi;->b:Z

    invoke-virtual {p0, v0}, Lzi;->y(Z)Z

    return-void

    :goto_2
    iput-boolean v1, p0, Lzi;->b:Z

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "FragmentManager{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lzi;->w:Lhi;

    const-string v2, "}"

    const-string v3, "{"

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lzi;->w:Lhi;

    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lzi;->u:Lji;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lzi;->u:Lji;

    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    const-string v1, "}}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u()V
    .locals 1

    iget-boolean v0, p0, Lzi;->I:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lzi;->I:Z

    invoke-virtual {p0}, Lzi;->a0()V

    :cond_0
    return-void
.end method

.method public final v(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p3

    const-string v3, "    "

    invoke-static {v0, v3}, LEy;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, v1, Lzi;->c:Lqs;

    iget-object v5, v4, Lqs;->a:Ljava/lang/Object;

    check-cast v5, Ljava/util/ArrayList;

    const-string v6, "    "

    invoke-static {v0, v6}, LEy;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iget-object v4, v4, Lqs;->b:Ljava/lang/Object;

    check-cast v4, Ljava/util/HashMap;

    invoke-virtual {v4}, Ljava/util/HashMap;->isEmpty()Z

    move-result v7

    const/4 v8, 0x0

    if-nez v7, :cond_20

    invoke-virtual {v2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v7, "Active Fragments:"

    invoke-virtual {v2, v7}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_20

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LHi;

    invoke-virtual {v2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    if-eqz v7, :cond_1f

    iget-object v7, v7, LHi;->c:Lhi;

    invoke-virtual {v2, v7}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v9, "mFragmentId=#"

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v9, v7, Lhi;->v:I

    invoke-static {v9}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v9, " mContainerId=#"

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v9, v7, Lhi;->w:I

    invoke-static {v9}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v9, " mTag="

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v9, v7, Lhi;->x:Ljava/lang/String;

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {v2, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v9, "mState="

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v9, v7, Lhi;->a:I

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(I)V

    const-string v9, " mWho="

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v9, v7, Lhi;->e:Ljava/lang/String;

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v9, " mBackStackNesting="

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v9, v7, Lhi;->q:I

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->println(I)V

    invoke-virtual {v2, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v9, "mAdded="

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v9, v7, Lhi;->k:Z

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Z)V

    const-string v9, " mRemoving="

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v9, v7, Lhi;->l:Z

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Z)V

    const-string v9, " mFromLayout="

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v9, v7, Lhi;->m:Z

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Z)V

    const-string v9, " mInLayout="

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v9, v7, Lhi;->n:Z

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->println(Z)V

    invoke-virtual {v2, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v9, "mHidden="

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v9, v7, Lhi;->y:Z

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Z)V

    const-string v9, " mDetached="

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v9, v7, Lhi;->z:Z

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Z)V

    const-string v9, " mMenuVisible="

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v9, v7, Lhi;->B:Z

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Z)V

    const-string v9, " mHasMenu="

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v2, v8}, Ljava/io/PrintWriter;->println(Z)V

    invoke-virtual {v2, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v9, "mRetainInstance="

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v9, v7, Lhi;->A:Z

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Z)V

    const-string v9, " mUserVisibleHint="

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v9, v7, Lhi;->G:Z

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->println(Z)V

    iget-object v9, v7, Lhi;->r:Lzi;

    if-eqz v9, :cond_0

    invoke-virtual {v2, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v9, "mFragmentManager="

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v9, v7, Lhi;->r:Lzi;

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_0
    iget-object v9, v7, Lhi;->s:Lji;

    if-eqz v9, :cond_1

    invoke-virtual {v2, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v9, "mHost="

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v9, v7, Lhi;->s:Lji;

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_1
    iget-object v9, v7, Lhi;->u:Lhi;

    if-eqz v9, :cond_2

    invoke-virtual {v2, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v9, "mParentFragment="

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v9, v7, Lhi;->u:Lhi;

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_2
    iget-object v9, v7, Lhi;->f:Landroid/os/Bundle;

    if-eqz v9, :cond_3

    invoke-virtual {v2, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v9, "mArguments="

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v9, v7, Lhi;->f:Landroid/os/Bundle;

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_3
    iget-object v9, v7, Lhi;->b:Landroid/os/Bundle;

    if-eqz v9, :cond_4

    invoke-virtual {v2, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v9, "mSavedFragmentState="

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v9, v7, Lhi;->b:Landroid/os/Bundle;

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_4
    iget-object v9, v7, Lhi;->c:Landroid/util/SparseArray;

    if-eqz v9, :cond_5

    invoke-virtual {v2, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v9, "mSavedViewState="

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v9, v7, Lhi;->c:Landroid/util/SparseArray;

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_5
    iget-object v9, v7, Lhi;->d:Landroid/os/Bundle;

    if-eqz v9, :cond_6

    invoke-virtual {v2, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v9, "mSavedViewRegistryState="

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v9, v7, Lhi;->d:Landroid/os/Bundle;

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_6
    iget-object v9, v7, Lhi;->g:Lhi;

    const/4 v10, 0x0

    if-eqz v9, :cond_7

    goto :goto_1

    :cond_7
    iget-object v9, v7, Lhi;->r:Lzi;

    if-eqz v9, :cond_8

    iget-object v11, v7, Lhi;->h:Ljava/lang/String;

    if-eqz v11, :cond_8

    iget-object v9, v9, Lzi;->c:Lqs;

    invoke-virtual {v9, v11}, Lqs;->n(Ljava/lang/String;)Lhi;

    move-result-object v9

    goto :goto_1

    :cond_8
    move-object v9, v10

    :goto_1
    if-eqz v9, :cond_9

    invoke-virtual {v2, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v11, "mTarget="

    invoke-virtual {v2, v11}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    const-string v9, " mTargetRequestCode="

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v9, v7, Lhi;->i:I

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->println(I)V

    :cond_9
    invoke-virtual {v2, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v9, "mPopDirection="

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v9, v7, Lhi;->H:Lfi;

    if-nez v9, :cond_a

    move v9, v8

    goto :goto_2

    :cond_a
    iget-boolean v9, v9, Lfi;->a:Z

    :goto_2
    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->println(Z)V

    iget-object v9, v7, Lhi;->H:Lfi;

    if-nez v9, :cond_b

    move v9, v8

    goto :goto_3

    :cond_b
    iget v9, v9, Lfi;->b:I

    :goto_3
    if-eqz v9, :cond_d

    invoke-virtual {v2, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v9, "getEnterAnim="

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v9, v7, Lhi;->H:Lfi;

    if-nez v9, :cond_c

    move v9, v8

    goto :goto_4

    :cond_c
    iget v9, v9, Lfi;->b:I

    :goto_4
    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->println(I)V

    :cond_d
    iget-object v9, v7, Lhi;->H:Lfi;

    if-nez v9, :cond_e

    move v9, v8

    goto :goto_5

    :cond_e
    iget v9, v9, Lfi;->c:I

    :goto_5
    if-eqz v9, :cond_10

    invoke-virtual {v2, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v9, "getExitAnim="

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v9, v7, Lhi;->H:Lfi;

    if-nez v9, :cond_f

    move v9, v8

    goto :goto_6

    :cond_f
    iget v9, v9, Lfi;->c:I

    :goto_6
    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->println(I)V

    :cond_10
    iget-object v9, v7, Lhi;->H:Lfi;

    if-nez v9, :cond_11

    move v9, v8

    goto :goto_7

    :cond_11
    iget v9, v9, Lfi;->d:I

    :goto_7
    if-eqz v9, :cond_13

    invoke-virtual {v2, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v9, "getPopEnterAnim="

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v9, v7, Lhi;->H:Lfi;

    if-nez v9, :cond_12

    move v9, v8

    goto :goto_8

    :cond_12
    iget v9, v9, Lfi;->d:I

    :goto_8
    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->println(I)V

    :cond_13
    iget-object v9, v7, Lhi;->H:Lfi;

    if-nez v9, :cond_14

    move v9, v8

    goto :goto_9

    :cond_14
    iget v9, v9, Lfi;->e:I

    :goto_9
    if-eqz v9, :cond_16

    invoke-virtual {v2, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v9, "getPopExitAnim="

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v9, v7, Lhi;->H:Lfi;

    if-nez v9, :cond_15

    move v9, v8

    goto :goto_a

    :cond_15
    iget v9, v9, Lfi;->e:I

    :goto_a
    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->println(I)V

    :cond_16
    iget-object v9, v7, Lhi;->D:Landroid/view/ViewGroup;

    if-eqz v9, :cond_17

    invoke-virtual {v2, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v9, "mContainer="

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v9, v7, Lhi;->D:Landroid/view/ViewGroup;

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_17
    iget-object v9, v7, Lhi;->E:Landroid/view/View;

    if-eqz v9, :cond_18

    invoke-virtual {v2, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v9, "mView="

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v9, v7, Lhi;->E:Landroid/view/View;

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_18
    invoke-virtual {v7}, Lhi;->d()Landroid/content/Context;

    move-result-object v9

    if-eqz v9, :cond_1e

    invoke-interface {v7}, LyE;->getViewModelStore()LxE;

    move-result-object v9

    sget-object v11, LQo;->e:LCi;

    sget-object v12, Ljc;->b:Ljc;

    const-class v13, LQo;

    invoke-virtual {v13}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v14

    if-eqz v14, :cond_1d

    const-string v15, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    invoke-virtual {v15, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    iget-object v15, v9, LxE;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v15, v14}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, LuE;

    invoke-virtual {v13, v15}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_19

    goto :goto_d

    :cond_19
    new-instance v15, Lts;

    invoke-direct {v15, v12}, Lts;-><init>(Llc;)V

    sget-object v12, Lgf;->n:Lgf;

    invoke-virtual {v15, v12, v14}, Lts;->a(Lkc;Ljava/lang/Object;)V

    :try_start_0
    invoke-interface {v11, v13, v15}, LwE;->b(Ljava/lang/Class;Lts;)LuE;

    move-result-object v11
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    :goto_b
    move-object v15, v11

    goto :goto_c

    :catch_0
    invoke-interface {v11, v13}, LwE;->a(Ljava/lang/Class;)LuE;

    move-result-object v11

    goto :goto_b

    :goto_c
    iget-object v9, v9, LxE;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v9, v14, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LuE;

    if-eqz v9, :cond_1a

    invoke-virtual {v9}, LuE;->b()V

    :cond_1a
    :goto_d
    check-cast v15, LQo;

    iget-object v9, v15, LQo;->d:LKy;

    iget v11, v9, LKy;->c:I

    if-lez v11, :cond_1e

    invoke-virtual {v2, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v11, "Loaders:"

    invoke-virtual {v2, v11}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    iget v11, v9, LKy;->c:I

    if-gtz v11, :cond_1b

    goto :goto_e

    :cond_1b
    iget-object v0, v9, LKy;->b:[Ljava/lang/Object;

    aget-object v0, v0, v8

    if-nez v0, :cond_1c

    invoke-virtual {v2, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "  #"

    invoke-virtual {v2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, v9, LKy;->a:[I

    aget v0, v0, v8

    invoke-virtual {v2, v0}, Ljava/io/PrintWriter;->print(I)V

    const-string v0, ": "

    invoke-virtual {v2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    throw v10

    :cond_1c
    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0

    :cond_1d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "Local and anonymous classes can not be ViewModels"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1e
    :goto_e
    invoke-virtual {v2, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "Child "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v10, v7, Lhi;->t:LAi;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v10, ":"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    iget-object v7, v7, Lhi;->t:LAi;

    const-string v9, "  "

    invoke-static {v6, v9}, LEy;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v10, p2

    move-object/from16 v11, p4

    invoke-virtual {v7, v9, v10, v2, v11}, Lzi;->v(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_1f
    move-object/from16 v10, p2

    move-object/from16 v11, p4

    const-string v7, "null"

    invoke-virtual {v2, v7}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_20
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-lez v4, :cond_21

    invoke-virtual {v2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "Added Fragments:"

    invoke-virtual {v2, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move v6, v8

    :goto_f
    if-ge v6, v4, :cond_21

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lhi;

    invoke-virtual {v2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v9, "  #"

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v2, v6}, Ljava/io/PrintWriter;->print(I)V

    const-string v9, ": "

    invoke-virtual {v2, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v7}, Lhi;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_f

    :cond_21
    iget-object v4, v1, Lzi;->e:Ljava/util/ArrayList;

    if-eqz v4, :cond_22

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-lez v4, :cond_22

    invoke-virtual {v2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "Fragments Created Menus:"

    invoke-virtual {v2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move v5, v8

    :goto_10
    if-ge v5, v4, :cond_22

    iget-object v6, v1, Lzi;->e:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lhi;

    invoke-virtual {v2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v7, "  #"

    invoke-virtual {v2, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v2, v5}, Ljava/io/PrintWriter;->print(I)V

    const-string v7, ": "

    invoke-virtual {v2, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v6}, Lhi;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_10

    :cond_22
    iget-object v4, v1, Lzi;->d:Ljava/util/ArrayList;

    if-eqz v4, :cond_23

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-lez v4, :cond_23

    invoke-virtual {v2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "Back Stack:"

    invoke-virtual {v2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move v5, v8

    :goto_11
    if-ge v5, v4, :cond_23

    iget-object v6, v1, Lzi;->d:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lh5;

    invoke-virtual {v2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v7, "  #"

    invoke-virtual {v2, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v2, v5}, Ljava/io/PrintWriter;->print(I)V

    const-string v7, ": "

    invoke-virtual {v2, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v6}, Lh5;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    const/4 v7, 0x1

    invoke-virtual {v6, v3, v2, v7}, Lh5;->f(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_11

    :cond_23
    invoke-virtual {v2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Back Stack Index: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, v1, Lzi;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    iget-object v3, v1, Lzi;->a:Ljava/util/ArrayList;

    monitor-enter v3

    :try_start_1
    iget-object v4, v1, Lzi;->a:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-lez v4, :cond_24

    invoke-virtual {v2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "Pending Actions:"

    invoke-virtual {v2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :goto_12
    if-ge v8, v4, :cond_24

    iget-object v5, v1, Lzi;->a:Ljava/util/ArrayList;

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lxi;

    invoke-virtual {v2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "  #"

    invoke-virtual {v2, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v2, v8}, Ljava/io/PrintWriter;->print(I)V

    const-string v6, ": "

    invoke-virtual {v2, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_12

    :catchall_0
    move-exception v0

    goto :goto_13

    :cond_24
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "FragmentManager misc state:"

    invoke-virtual {v2, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "  mHost="

    invoke-virtual {v2, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v3, v1, Lzi;->u:Lji;

    invoke-virtual {v2, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    invoke-virtual {v2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "  mContainer="

    invoke-virtual {v2, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v3, v1, Lzi;->v:LTB;

    invoke-virtual {v2, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    iget-object v3, v1, Lzi;->w:Lhi;

    if-eqz v3, :cond_25

    invoke-virtual {v2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "  mParent="

    invoke-virtual {v2, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v3, v1, Lzi;->w:Lhi;

    invoke-virtual {v2, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_25
    invoke-virtual {v2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "  mCurState="

    invoke-virtual {v2, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v3, v1, Lzi;->t:I

    invoke-virtual {v2, v3}, Ljava/io/PrintWriter;->print(I)V

    const-string v3, " mStateSaved="

    invoke-virtual {v2, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v3, v1, Lzi;->F:Z

    invoke-virtual {v2, v3}, Ljava/io/PrintWriter;->print(Z)V

    const-string v3, " mStopped="

    invoke-virtual {v2, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v3, v1, Lzi;->G:Z

    invoke-virtual {v2, v3}, Ljava/io/PrintWriter;->print(Z)V

    const-string v3, " mDestroyed="

    invoke-virtual {v2, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v3, v1, Lzi;->H:Z

    invoke-virtual {v2, v3}, Ljava/io/PrintWriter;->println(Z)V

    iget-boolean v3, v1, Lzi;->E:Z

    if-eqz v3, :cond_26

    invoke-virtual {v2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "  mNeedMenuInvalidate="

    invoke-virtual {v2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, v1, Lzi;->E:Z

    invoke-virtual {v2, v0}, Ljava/io/PrintWriter;->println(Z)V

    :cond_26
    return-void

    :goto_13
    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public final w(Lxi;Z)V
    .locals 2

    if-nez p2, :cond_3

    iget-object v0, p0, Lzi;->u:Lji;

    if-nez v0, :cond_1

    iget-boolean p1, p0, Lzi;->H:Z

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "FragmentManager has been destroyed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "FragmentManager has not been attached to a host."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-virtual {p0}, Lzi;->L()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Can not perform this action after onSaveInstanceState"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_0
    iget-object v0, p0, Lzi;->a:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lzi;->u:Lji;

    if-nez v1, :cond_5

    if-eqz p2, :cond_4

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Activity has been destroyed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    iget-object p2, p0, Lzi;->a:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lzi;->V()V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final x(Z)V
    .locals 2

    iget-boolean v0, p0, Lzi;->b:Z

    if-nez v0, :cond_6

    iget-object v0, p0, Lzi;->u:Lji;

    if-nez v0, :cond_1

    iget-boolean p1, p0, Lzi;->H:Z

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "FragmentManager has been destroyed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "FragmentManager has not been attached to a host."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Lzi;->u:Lji;

    iget-object v1, v1, Lji;->n:Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_5

    if-nez p1, :cond_3

    invoke-virtual {p0}, Lzi;->L()Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Can not perform this action after onSaveInstanceState"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_0
    iget-object p1, p0, Lzi;->J:Ljava/util/ArrayList;

    if-nez p1, :cond_4

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lzi;->J:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lzi;->K:Ljava/util/ArrayList;

    :cond_4
    return-void

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Must be called from main thread of fragment host"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "FragmentManager is already executing transactions"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final y(Z)Z
    .locals 8

    invoke-virtual {p0, p1}, Lzi;->x(Z)V

    const/4 p1, 0x0

    move v0, p1

    :goto_0
    iget-object v1, p0, Lzi;->J:Ljava/util/ArrayList;

    iget-object v2, p0, Lzi;->K:Ljava/util/ArrayList;

    iget-object v3, p0, Lzi;->a:Ljava/util/ArrayList;

    monitor-enter v3

    :try_start_0
    iget-object v4, p0, Lzi;->a:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v6, p1

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_0
    :try_start_1
    iget-object v4, p0, Lzi;->a:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    move v5, p1

    move v6, v5

    :goto_1
    if-ge v5, v4, :cond_1

    iget-object v7, p0, Lzi;->a:Ljava/util/ArrayList;

    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lxi;

    invoke-interface {v7, v1, v2}, Lxi;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    move-result v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    or-int/2addr v6, v7

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_3

    :cond_1
    :try_start_2
    iget-object v1, p0, Lzi;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v1, p0, Lzi;->u:Lji;

    iget-object v1, v1, Lji;->n:Landroid/os/Handler;

    iget-object v2, p0, Lzi;->N:LK0;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_2
    if-eqz v6, :cond_2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lzi;->b:Z

    :try_start_3
    iget-object v1, p0, Lzi;->J:Ljava/util/ArrayList;

    iget-object v2, p0, Lzi;->K:Ljava/util/ArrayList;

    invoke-virtual {p0, v1, v2}, Lzi;->S(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    invoke-virtual {p0}, Lzi;->d()V

    goto :goto_0

    :catchall_2
    move-exception p1

    invoke-virtual {p0}, Lzi;->d()V

    throw p1

    :cond_2
    invoke-virtual {p0}, Lzi;->c0()V

    invoke-virtual {p0}, Lzi;->u()V

    iget-object p1, p0, Lzi;->c:Lqs;

    iget-object p1, p1, Lqs;->b:Ljava/lang/Object;

    check-cast p1, Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p1

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    return v0

    :goto_3
    :try_start_4
    iget-object v0, p0, Lzi;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lzi;->u:Lji;

    iget-object v0, v0, Lji;->n:Landroid/os/Handler;

    iget-object v1, p0, Lzi;->N:LK0;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    throw p1

    :goto_4
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method

.method public final z(Lh5;Z)V
    .locals 1

    if-eqz p2, :cond_1

    iget-object v0, p0, Lzi;->u:Lji;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lzi;->H:Z

    if-eqz v0, :cond_1

    :cond_0
    return-void

    :cond_1
    invoke-virtual {p0, p2}, Lzi;->x(Z)V

    iget-object p2, p0, Lzi;->J:Ljava/util/ArrayList;

    iget-object v0, p0, Lzi;->K:Ljava/util/ArrayList;

    invoke-virtual {p1, p2, v0}, Lh5;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Lzi;->b:Z

    :try_start_0
    iget-object p1, p0, Lzi;->J:Ljava/util/ArrayList;

    iget-object p2, p0, Lzi;->K:Ljava/util/ArrayList;

    invoke-virtual {p0, p1, p2}, Lzi;->S(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lzi;->d()V

    invoke-virtual {p0}, Lzi;->c0()V

    invoke-virtual {p0}, Lzi;->u()V

    iget-object p1, p0, Lzi;->c:Lqs;

    iget-object p1, p1, Lqs;->b:Ljava/lang/Object;

    check-cast p1, Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p2}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lzi;->d()V

    throw p1
.end method
