.class public abstract La/e7;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/e7$h;,
        La/e7$i;,
        La/e7$j;,
        La/e7$k;,
        La/e7$f;,
        La/e7$g;
    }
.end annotation


# instance fields
.field public final A:La/e7$d;

.field public B:La/d0;

.field public C:La/d0;

.field public D:La/d0;

.field public E:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "La/e7$g;",
            ">;"
        }
    .end annotation
.end field

.field public F:Z

.field public G:Z

.field public H:Z

.field public I:Z

.field public J:Z

.field public K:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "La/S1;",
            ">;"
        }
    .end annotation
.end field

.field public L:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public M:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/fragment/app/b;",
            ">;"
        }
    .end annotation
.end field

.field public N:La/k7;

.field public final O:La/e7$e;

.field public final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "La/e7$i;",
            ">;"
        }
    .end annotation
.end field

.field public b:Z

.field public final c:La/A2;

.field public d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "La/S1;",
            ">;"
        }
    .end annotation
.end field

.field public e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/fragment/app/b;",
            ">;"
        }
    .end annotation
.end field

.field public final f:La/a7;

.field public g:Landroidx/activity/OnBackPressedDispatcher;

.field public h:La/S1;

.field public final i:La/e7$a;

.field public final j:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "La/U1;",
            ">;"
        }
    .end annotation
.end field

.field public final l:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation
.end field

.field public final m:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "La/e7$h;",
            ">;"
        }
    .end annotation
.end field

.field public final n:La/b7;

.field public final o:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "La/l7;",
            ">;"
        }
    .end annotation
.end field

.field public final p:La/c7;

.field public final q:La/c7;

.field public final r:La/c7;

.field public final s:La/c7;

.field public final t:La/e7$b;

.field public u:I

.field public v:La/X6$a;

.field public w:La/a2;

.field public x:Landroidx/fragment/app/b;

.field public y:Landroidx/fragment/app/b;

.field public final z:La/e7$c;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, La/e7;->a:Ljava/util/ArrayList;

    new-instance v0, La/A2;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, La/A2;-><init>(I)V

    iput-object v0, p0, La/e7;->c:La/A2;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, La/e7;->d:Ljava/util/ArrayList;

    new-instance v0, La/a7;

    invoke-direct {v0, p0}, La/a7;-><init>(La/e7;)V

    iput-object v0, p0, La/e7;->f:La/a7;

    const/4 v0, 0x0

    iput-object v0, p0, La/e7;->h:La/S1;

    new-instance v0, La/e7$a;

    invoke-direct {v0, p0}, La/e7$a;-><init>(La/e7;)V

    iput-object v0, p0, La/e7;->i:La/e7$a;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, La/e7;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, La/e7;->k:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, La/e7;->l:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, La/e7;->m:Ljava/util/ArrayList;

    new-instance v0, La/b7;

    invoke-direct {v0, p0}, La/b7;-><init>(La/e7;)V

    iput-object v0, p0, La/e7;->n:La/b7;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, La/e7;->o:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v0, La/c7;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, La/c7;-><init>(La/e7;I)V

    iput-object v0, p0, La/e7;->p:La/c7;

    new-instance v0, La/c7;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, La/c7;-><init>(La/e7;I)V

    iput-object v0, p0, La/e7;->q:La/c7;

    new-instance v0, La/c7;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, La/c7;-><init>(La/e7;I)V

    iput-object v0, p0, La/e7;->r:La/c7;

    new-instance v0, La/c7;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, La/c7;-><init>(La/e7;I)V

    iput-object v0, p0, La/e7;->s:La/c7;

    new-instance v0, La/e7$b;

    invoke-direct {v0, p0}, La/e7$b;-><init>(La/e7;)V

    iput-object v0, p0, La/e7;->t:La/e7$b;

    const/4 v0, -0x1

    iput v0, p0, La/e7;->u:I

    new-instance v0, La/e7$c;

    invoke-direct {v0, p0}, La/e7$c;-><init>(La/e7;)V

    iput-object v0, p0, La/e7;->z:La/e7$c;

    new-instance v0, La/e7$d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, La/e7;->A:La/e7$d;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, La/e7;->E:Ljava/util/ArrayDeque;

    new-instance v0, La/e7$e;

    invoke-direct {v0, p0}, La/e7$e;-><init>(La/e7;)V

    iput-object v0, p0, La/e7;->O:La/e7$e;

    return-void
.end method

.method public static E(La/S1;)Ljava/util/HashSet;
    .locals 4

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, La/p7;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    iget-object v2, p0, La/p7;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/p7$a;

    iget-object v2, v2, La/p7$a;->b:Landroidx/fragment/app/b;

    if-eqz v2, :cond_0

    iget-boolean v3, p0, La/p7;->g:Z

    if-eqz v3, :cond_0

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static J(I)Z
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

.method public static K(Landroidx/fragment/app/b;)Z
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p0, p0, Landroidx/fragment/app/b;->v:La/i7;

    iget-object p0, p0, La/e7;->c:La/A2;

    invoke-virtual {p0}, La/A2;->f()Ljava/util/ArrayList;

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

    check-cast v2, Landroidx/fragment/app/b;

    if-eqz v2, :cond_1

    invoke-static {v2}, La/e7;->K(Landroidx/fragment/app/b;)Z

    move-result v1

    :cond_1
    if-eqz v1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_2
    return v0
.end method

.method public static M(Landroidx/fragment/app/b;)Z
    .locals 1

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Landroidx/fragment/app/b;->D:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/fragment/app/b;->t:La/e7;

    if-eqz v0, :cond_1

    iget-object p0, p0, Landroidx/fragment/app/b;->w:Landroidx/fragment/app/b;

    invoke-static {p0}, La/e7;->M(Landroidx/fragment/app/b;)Z

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

.method public static N(Landroidx/fragment/app/b;)Z
    .locals 2

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/b;->t:La/e7;

    iget-object v1, v0, La/e7;->y:Landroidx/fragment/app/b;

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    iget-object p0, v0, La/e7;->x:Landroidx/fragment/app/b;

    invoke-static {p0}, La/e7;->N(Landroidx/fragment/app/b;)Z

    move-result p0

    if-eqz p0, :cond_1

    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static c0(Landroidx/fragment/app/b;)V
    .locals 2

    const/4 v0, 0x2

    invoke-static {v0}, La/e7;->J(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "show: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-boolean v0, p0, Landroidx/fragment/app/b;->A:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/b;->A:Z

    iget-boolean v0, p0, Landroidx/fragment/app/b;->K:Z

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/b;->K:Z

    :cond_1
    return-void
.end method


# virtual methods
.method public final A(La/S1;Z)V
    .locals 1

    if-eqz p2, :cond_1

    iget-object v0, p0, La/e7;->v:La/X6$a;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, La/e7;->I:Z

    if-eqz v0, :cond_1

    :cond_0
    return-void

    :cond_1
    invoke-virtual {p0, p2}, La/e7;->y(Z)V

    iget-object p2, p0, La/e7;->K:Ljava/util/ArrayList;

    iget-object v0, p0, La/e7;->L:Ljava/util/ArrayList;

    invoke-virtual {p1, p2, v0}, La/S1;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    const/4 p1, 0x1

    iput-boolean p1, p0, La/e7;->b:Z

    :try_start_0
    iget-object p1, p0, La/e7;->K:Ljava/util/ArrayList;

    iget-object p2, p0, La/e7;->L:Ljava/util/ArrayList;

    invoke-virtual {p0, p1, p2}, La/e7;->U(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, La/e7;->d()V

    invoke-virtual {p0}, La/e7;->f0()V

    iget-boolean p1, p0, La/e7;->J:Z

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    iput-boolean p1, p0, La/e7;->J:Z

    invoke-virtual {p0}, La/e7;->d0()V

    :cond_2
    iget-object p1, p0, La/e7;->c:La/A2;

    iget-object p1, p1, La/A2;->b:Ljava/lang/Object;

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

    invoke-virtual {p0}, La/e7;->d()V

    throw p1
.end method

.method public final B(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "La/S1;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    const/4 v9, 0x1

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, La/S1;

    iget-boolean v10, v10, La/p7;->o:Z

    iget-object v11, v1, La/e7;->M:Ljava/util/ArrayList;

    if-nez v11, :cond_0

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    iput-object v11, v1, La/e7;->M:Ljava/util/ArrayList;

    goto :goto_0

    :cond_0
    invoke-virtual {v11}, Ljava/util/ArrayList;->clear()V

    :goto_0
    iget-object v11, v1, La/e7;->M:Ljava/util/ArrayList;

    iget-object v12, v1, La/e7;->c:La/A2;

    invoke-virtual {v12}, La/A2;->g()Ljava/util/List;

    move-result-object v13

    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v11, v1, La/e7;->y:Landroidx/fragment/app/b;

    move v13, v3

    const/4 v14, 0x0

    :goto_1
    if-ge v13, v4, :cond_13

    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, La/S1;

    invoke-virtual {v2, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ljava/lang/Boolean;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v16

    if-nez v16, :cond_d

    const/16 v16, -0x1

    iget-object v8, v1, La/e7;->M:Ljava/util/ArrayList;

    const/4 v7, 0x0

    :goto_2
    iget-object v5, v15, La/p7;->a:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v7, v6, :cond_c

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, La/p7$a;

    move/from16 v18, v10

    iget v10, v6, La/p7$a;->a:I

    if-eq v10, v9, :cond_b

    const/4 v9, 0x2

    move/from16 v20, v13

    const/16 v13, 0x9

    if-eq v10, v9, :cond_5

    const/4 v9, 0x3

    if-eq v10, v9, :cond_3

    const/4 v9, 0x6

    if-eq v10, v9, :cond_3

    const/4 v9, 0x7

    if-eq v10, v9, :cond_2

    const/16 v9, 0x8

    if-eq v10, v9, :cond_1

    goto :goto_3

    :cond_1
    new-instance v9, La/p7$a;

    const/4 v10, 0x0

    invoke-direct {v9, v13, v11, v10}, La/p7$a;-><init>(ILandroidx/fragment/app/b;I)V

    invoke-virtual {v5, v7, v9}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    const/4 v5, 0x1

    iput-boolean v5, v6, La/p7$a;->c:Z

    add-int/2addr v7, v5

    iget-object v5, v6, La/p7$a;->b:Landroidx/fragment/app/b;

    move-object v11, v5

    :goto_3
    move/from16 v23, v14

    const/4 v10, 0x1

    goto/16 :goto_9

    :cond_2
    const/4 v10, 0x1

    :goto_4
    move/from16 v23, v14

    goto/16 :goto_8

    :cond_3
    iget-object v9, v6, La/p7$a;->b:Landroidx/fragment/app/b;

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v6, v6, La/p7$a;->b:Landroidx/fragment/app/b;

    if-ne v6, v11, :cond_4

    new-instance v9, La/p7$a;

    invoke-direct {v9, v13, v6}, La/p7$a;-><init>(ILandroidx/fragment/app/b;)V

    invoke-virtual {v5, v7, v9}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    const/16 v19, 0x1

    add-int/lit8 v7, v7, 0x1

    move/from16 v23, v14

    move/from16 v10, v19

    const/4 v11, 0x0

    goto/16 :goto_9

    :cond_4
    const/16 v19, 0x1

    move/from16 v23, v14

    move/from16 v10, v19

    goto/16 :goto_9

    :cond_5
    const/16 v19, 0x1

    iget-object v9, v6, La/p7$a;->b:Landroidx/fragment/app/b;

    iget v10, v9, Landroidx/fragment/app/b;->y:I

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v21

    add-int/lit8 v21, v21, -0x1

    move/from16 v13, v21

    const/16 v21, 0x0

    :goto_5
    if-ltz v13, :cond_9

    invoke-virtual {v8, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v23

    move/from16 v24, v13

    move-object/from16 v13, v23

    check-cast v13, Landroidx/fragment/app/b;

    move/from16 v23, v14

    iget v14, v13, Landroidx/fragment/app/b;->y:I

    if-ne v14, v10, :cond_8

    if-ne v13, v9, :cond_6

    move/from16 v22, v10

    const/4 v10, 0x1

    const/16 v21, 0x1

    goto :goto_7

    :cond_6
    if-ne v13, v11, :cond_7

    new-instance v11, La/p7$a;

    move/from16 v22, v10

    const/4 v10, 0x0

    const/16 v14, 0x9

    invoke-direct {v11, v14, v13, v10}, La/p7$a;-><init>(ILandroidx/fragment/app/b;I)V

    invoke-virtual {v5, v7, v11}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    const/16 v19, 0x1

    add-int/lit8 v7, v7, 0x1

    const/4 v11, 0x0

    goto :goto_6

    :cond_7
    move/from16 v22, v10

    const/4 v10, 0x0

    const/16 v14, 0x9

    :goto_6
    new-instance v14, La/p7$a;

    move-object/from16 v25, v11

    const/4 v11, 0x3

    invoke-direct {v14, v11, v13, v10}, La/p7$a;-><init>(ILandroidx/fragment/app/b;I)V

    iget v10, v6, La/p7$a;->d:I

    iput v10, v14, La/p7$a;->d:I

    iget v10, v6, La/p7$a;->f:I

    iput v10, v14, La/p7$a;->f:I

    iget v10, v6, La/p7$a;->e:I

    iput v10, v14, La/p7$a;->e:I

    iget v10, v6, La/p7$a;->g:I

    iput v10, v14, La/p7$a;->g:I

    invoke-virtual {v5, v7, v14}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    invoke-virtual {v8, v13}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 v10, 0x1

    add-int/2addr v7, v10

    move-object/from16 v11, v25

    goto :goto_7

    :cond_8
    move/from16 v22, v10

    const/4 v10, 0x1

    :goto_7
    add-int/lit8 v13, v24, -0x1

    move/from16 v10, v22

    move/from16 v14, v23

    goto :goto_5

    :cond_9
    move/from16 v23, v14

    const/4 v10, 0x1

    if-eqz v21, :cond_a

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v7, v7, -0x1

    goto :goto_9

    :cond_a
    iput v10, v6, La/p7$a;->a:I

    iput-boolean v10, v6, La/p7$a;->c:Z

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_b
    move v10, v9

    move/from16 v20, v13

    goto/16 :goto_4

    :goto_8
    iget-object v5, v6, La/p7$a;->b:Landroidx/fragment/app/b;

    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_9
    add-int/2addr v7, v10

    move v9, v10

    move/from16 v10, v18

    move/from16 v13, v20

    move/from16 v14, v23

    goto/16 :goto_2

    :cond_c
    move/from16 v18, v10

    move/from16 v20, v13

    move/from16 v23, v14

    goto :goto_c

    :cond_d
    move/from16 v18, v10

    move/from16 v20, v13

    move/from16 v23, v14

    const/16 v16, -0x1

    move v10, v9

    iget-object v5, v1, La/e7;->M:Ljava/util/ArrayList;

    iget-object v6, v15, La/p7;->a:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v7

    sub-int/2addr v7, v10

    :goto_a
    if-ltz v7, :cond_10

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, La/p7$a;

    iget v9, v8, La/p7$a;->a:I

    if-eq v9, v10, :cond_f

    const/4 v10, 0x3

    if-eq v9, v10, :cond_e

    packed-switch v9, :pswitch_data_0

    goto :goto_b

    :pswitch_0
    iget-object v9, v8, La/p7$a;->h:Landroidx/lifecycle/e$b;

    iput-object v9, v8, La/p7$a;->i:Landroidx/lifecycle/e$b;

    goto :goto_b

    :pswitch_1
    iget-object v8, v8, La/p7$a;->b:Landroidx/fragment/app/b;

    move-object v11, v8

    goto :goto_b

    :pswitch_2
    const/4 v11, 0x0

    goto :goto_b

    :cond_e
    :pswitch_3
    iget-object v8, v8, La/p7$a;->b:Landroidx/fragment/app/b;

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_f
    const/4 v10, 0x3

    :pswitch_4
    iget-object v8, v8, La/p7$a;->b:Landroidx/fragment/app/b;

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :goto_b
    add-int/lit8 v7, v7, -0x1

    const/4 v10, 0x1

    goto :goto_a

    :cond_10
    :goto_c
    if-nez v23, :cond_12

    iget-boolean v5, v15, La/p7;->g:Z

    if-eqz v5, :cond_11

    goto :goto_e

    :cond_11
    const/4 v14, 0x0

    :goto_d
    const/4 v5, 0x1

    goto :goto_f

    :cond_12
    :goto_e
    const/4 v14, 0x1

    goto :goto_d

    :goto_f
    add-int/lit8 v13, v20, 0x1

    move v9, v5

    move/from16 v10, v18

    goto/16 :goto_1

    :cond_13
    move v5, v9

    move/from16 v18, v10

    move/from16 v23, v14

    const/16 v16, -0x1

    iget-object v6, v1, La/e7;->M:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    if-nez v18, :cond_16

    iget v6, v1, La/e7;->u:I

    if-lt v6, v5, :cond_16

    move v5, v3

    :goto_10
    if-ge v5, v4, :cond_16

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, La/S1;

    iget-object v6, v6, La/p7;->a:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_14
    :goto_11
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_15

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, La/p7$a;

    iget-object v7, v7, La/p7$a;->b:Landroidx/fragment/app/b;

    if-eqz v7, :cond_14

    iget-object v8, v7, Landroidx/fragment/app/b;->t:La/e7;

    if-eqz v8, :cond_14

    invoke-virtual {v1, v7}, La/e7;->g(Landroidx/fragment/app/b;)Landroidx/fragment/app/e;

    move-result-object v7

    invoke-virtual {v12, v7}, La/A2;->h(Landroidx/fragment/app/e;)V

    goto :goto_11

    :cond_15
    const/16 v19, 0x1

    add-int/lit8 v5, v5, 0x1

    goto :goto_10

    :cond_16
    move v5, v3

    :goto_12
    if-ge v5, v4, :cond_23

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, La/S1;

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    const-string v8, "Unknown cmd: "

    if-eqz v7, :cond_1e

    move/from16 v7, v16

    invoke-virtual {v6, v7}, La/S1;->c(I)V

    iget-object v7, v6, La/p7;->a:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v9

    const/4 v10, 0x1

    sub-int/2addr v9, v10

    :goto_13
    if-ltz v9, :cond_1d

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, La/p7$a;

    iget-object v12, v11, La/p7$a;->b:Landroidx/fragment/app/b;

    if-eqz v12, :cond_1c

    iget-object v13, v12, Landroidx/fragment/app/b;->J:Landroidx/fragment/app/b$d;

    if-nez v13, :cond_17

    goto :goto_14

    :cond_17
    invoke-virtual {v12}, Landroidx/fragment/app/b;->b()Landroidx/fragment/app/b$d;

    move-result-object v13

    iput-boolean v10, v13, Landroidx/fragment/app/b$d;->a:Z

    :goto_14
    iget v10, v6, La/p7;->f:I

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

    goto :goto_15

    :cond_18
    move v13, v14

    goto :goto_15

    :cond_19
    move v13, v15

    :cond_1a
    :goto_15
    iget-object v10, v12, Landroidx/fragment/app/b;->J:Landroidx/fragment/app/b$d;

    if-nez v10, :cond_1b

    if-nez v13, :cond_1b

    goto :goto_16

    :cond_1b
    invoke-virtual {v12}, Landroidx/fragment/app/b;->b()Landroidx/fragment/app/b$d;

    iget-object v10, v12, Landroidx/fragment/app/b;->J:Landroidx/fragment/app/b$d;

    iput v13, v10, Landroidx/fragment/app/b$d;->f:I

    :goto_16
    invoke-virtual {v12}, Landroidx/fragment/app/b;->b()Landroidx/fragment/app/b$d;

    iget-object v10, v12, Landroidx/fragment/app/b;->J:Landroidx/fragment/app/b$d;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_1c
    iget v10, v11, La/p7$a;->a:I

    iget-object v13, v6, La/S1;->q:La/e7;

    packed-switch v10, :pswitch_data_1

    :pswitch_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, v11, La/p7$a;->a:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_6
    iget-object v10, v11, La/p7$a;->h:Landroidx/lifecycle/e$b;

    invoke-virtual {v13, v12, v10}, La/e7;->Z(Landroidx/fragment/app/b;Landroidx/lifecycle/e$b;)V

    :goto_17
    const/4 v10, 0x1

    :goto_18
    const/16 v16, -0x1

    goto/16 :goto_19

    :pswitch_7
    invoke-virtual {v13, v12}, La/e7;->a0(Landroidx/fragment/app/b;)V

    goto :goto_17

    :pswitch_8
    const/4 v10, 0x0

    invoke-virtual {v13, v10}, La/e7;->a0(Landroidx/fragment/app/b;)V

    goto :goto_17

    :pswitch_9
    iget v10, v11, La/p7$a;->d:I

    iget v14, v11, La/p7$a;->e:I

    iget v15, v11, La/p7$a;->f:I

    iget v11, v11, La/p7$a;->g:I

    invoke-virtual {v12, v10, v14, v15, v11}, Landroidx/fragment/app/b;->D(IIII)V

    const/4 v10, 0x1

    invoke-virtual {v13, v12, v10}, La/e7;->Y(Landroidx/fragment/app/b;Z)V

    invoke-virtual {v13, v12}, La/e7;->h(Landroidx/fragment/app/b;)V

    goto :goto_17

    :pswitch_a
    iget v10, v11, La/p7$a;->d:I

    iget v14, v11, La/p7$a;->e:I

    iget v15, v11, La/p7$a;->f:I

    iget v11, v11, La/p7$a;->g:I

    invoke-virtual {v12, v10, v14, v15, v11}, Landroidx/fragment/app/b;->D(IIII)V

    invoke-virtual {v13, v12}, La/e7;->c(Landroidx/fragment/app/b;)V

    goto :goto_17

    :pswitch_b
    iget v10, v11, La/p7$a;->d:I

    iget v14, v11, La/p7$a;->e:I

    iget v15, v11, La/p7$a;->f:I

    iget v11, v11, La/p7$a;->g:I

    invoke-virtual {v12, v10, v14, v15, v11}, Landroidx/fragment/app/b;->D(IIII)V

    const/4 v10, 0x1

    invoke-virtual {v13, v12, v10}, La/e7;->Y(Landroidx/fragment/app/b;Z)V

    invoke-virtual {v13, v12}, La/e7;->I(Landroidx/fragment/app/b;)V

    goto :goto_17

    :pswitch_c
    iget v10, v11, La/p7$a;->d:I

    iget v14, v11, La/p7$a;->e:I

    iget v15, v11, La/p7$a;->f:I

    iget v11, v11, La/p7$a;->g:I

    invoke-virtual {v12, v10, v14, v15, v11}, Landroidx/fragment/app/b;->D(IIII)V

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v12}, La/e7;->c0(Landroidx/fragment/app/b;)V

    goto :goto_17

    :pswitch_d
    iget v10, v11, La/p7$a;->d:I

    iget v14, v11, La/p7$a;->e:I

    iget v15, v11, La/p7$a;->f:I

    iget v11, v11, La/p7$a;->g:I

    invoke-virtual {v12, v10, v14, v15, v11}, Landroidx/fragment/app/b;->D(IIII)V

    invoke-virtual {v13, v12}, La/e7;->a(Landroidx/fragment/app/b;)Landroidx/fragment/app/e;

    goto :goto_17

    :pswitch_e
    iget v10, v11, La/p7$a;->d:I

    iget v14, v11, La/p7$a;->e:I

    iget v15, v11, La/p7$a;->f:I

    iget v11, v11, La/p7$a;->g:I

    invoke-virtual {v12, v10, v14, v15, v11}, Landroidx/fragment/app/b;->D(IIII)V

    const/4 v10, 0x1

    invoke-virtual {v13, v12, v10}, La/e7;->Y(Landroidx/fragment/app/b;Z)V

    invoke-virtual {v13, v12}, La/e7;->T(Landroidx/fragment/app/b;)V

    goto :goto_18

    :goto_19
    add-int/lit8 v9, v9, -0x1

    goto/16 :goto_13

    :cond_1d
    move/from16 v19, v10

    :goto_1a
    move/from16 v17, v5

    goto/16 :goto_21

    :cond_1e
    const/4 v10, 0x1

    invoke-virtual {v6, v10}, La/S1;->c(I)V

    iget-object v7, v6, La/p7;->a:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v9

    const/4 v10, 0x0

    :goto_1b
    if-ge v10, v9, :cond_22

    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, La/p7$a;

    iget-object v12, v11, La/p7$a;->b:Landroidx/fragment/app/b;

    if-eqz v12, :cond_21

    iget-object v13, v12, Landroidx/fragment/app/b;->J:Landroidx/fragment/app/b$d;

    if-nez v13, :cond_1f

    goto :goto_1c

    :cond_1f
    invoke-virtual {v12}, Landroidx/fragment/app/b;->b()Landroidx/fragment/app/b$d;

    move-result-object v13

    const/4 v14, 0x0

    iput-boolean v14, v13, Landroidx/fragment/app/b$d;->a:Z

    :goto_1c
    iget v13, v6, La/p7;->f:I

    iget-object v14, v12, Landroidx/fragment/app/b;->J:Landroidx/fragment/app/b$d;

    if-nez v14, :cond_20

    if-nez v13, :cond_20

    goto :goto_1d

    :cond_20
    invoke-virtual {v12}, Landroidx/fragment/app/b;->b()Landroidx/fragment/app/b$d;

    iget-object v14, v12, Landroidx/fragment/app/b;->J:Landroidx/fragment/app/b$d;

    iput v13, v14, Landroidx/fragment/app/b$d;->f:I

    :goto_1d
    invoke-virtual {v12}, Landroidx/fragment/app/b;->b()Landroidx/fragment/app/b$d;

    iget-object v13, v12, Landroidx/fragment/app/b;->J:Landroidx/fragment/app/b$d;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_21
    iget v13, v11, La/p7$a;->a:I

    iget-object v14, v6, La/S1;->q:La/e7;

    packed-switch v13, :pswitch_data_2

    :pswitch_f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, v11, La/p7$a;->a:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_10
    iget-object v11, v11, La/p7$a;->i:Landroidx/lifecycle/e$b;

    invoke-virtual {v14, v12, v11}, La/e7;->Z(Landroidx/fragment/app/b;Landroidx/lifecycle/e$b;)V

    :goto_1e
    move/from16 v17, v5

    :goto_1f
    const/16 v19, 0x1

    goto/16 :goto_20

    :pswitch_11
    const/4 v11, 0x0

    invoke-virtual {v14, v11}, La/e7;->a0(Landroidx/fragment/app/b;)V

    goto :goto_1e

    :pswitch_12
    invoke-virtual {v14, v12}, La/e7;->a0(Landroidx/fragment/app/b;)V

    goto :goto_1e

    :pswitch_13
    iget v13, v11, La/p7$a;->d:I

    iget v15, v11, La/p7$a;->e:I

    move/from16 v17, v5

    iget v5, v11, La/p7$a;->f:I

    iget v11, v11, La/p7$a;->g:I

    invoke-virtual {v12, v13, v15, v5, v11}, Landroidx/fragment/app/b;->D(IIII)V

    const/4 v5, 0x0

    invoke-virtual {v14, v12, v5}, La/e7;->Y(Landroidx/fragment/app/b;Z)V

    invoke-virtual {v14, v12}, La/e7;->c(Landroidx/fragment/app/b;)V

    goto :goto_1f

    :pswitch_14
    move/from16 v17, v5

    iget v5, v11, La/p7$a;->d:I

    iget v13, v11, La/p7$a;->e:I

    iget v15, v11, La/p7$a;->f:I

    iget v11, v11, La/p7$a;->g:I

    invoke-virtual {v12, v5, v13, v15, v11}, Landroidx/fragment/app/b;->D(IIII)V

    invoke-virtual {v14, v12}, La/e7;->h(Landroidx/fragment/app/b;)V

    goto :goto_1f

    :pswitch_15
    move/from16 v17, v5

    iget v5, v11, La/p7$a;->d:I

    iget v13, v11, La/p7$a;->e:I

    iget v15, v11, La/p7$a;->f:I

    iget v11, v11, La/p7$a;->g:I

    invoke-virtual {v12, v5, v13, v15, v11}, Landroidx/fragment/app/b;->D(IIII)V

    const/4 v5, 0x0

    invoke-virtual {v14, v12, v5}, La/e7;->Y(Landroidx/fragment/app/b;Z)V

    invoke-static {v12}, La/e7;->c0(Landroidx/fragment/app/b;)V

    goto :goto_1f

    :pswitch_16
    move/from16 v17, v5

    iget v5, v11, La/p7$a;->d:I

    iget v13, v11, La/p7$a;->e:I

    iget v15, v11, La/p7$a;->f:I

    iget v11, v11, La/p7$a;->g:I

    invoke-virtual {v12, v5, v13, v15, v11}, Landroidx/fragment/app/b;->D(IIII)V

    invoke-virtual {v14, v12}, La/e7;->I(Landroidx/fragment/app/b;)V

    goto :goto_1f

    :pswitch_17
    move/from16 v17, v5

    iget v5, v11, La/p7$a;->d:I

    iget v13, v11, La/p7$a;->e:I

    iget v15, v11, La/p7$a;->f:I

    iget v11, v11, La/p7$a;->g:I

    invoke-virtual {v12, v5, v13, v15, v11}, Landroidx/fragment/app/b;->D(IIII)V

    invoke-virtual {v14, v12}, La/e7;->T(Landroidx/fragment/app/b;)V

    goto :goto_1f

    :pswitch_18
    move/from16 v17, v5

    iget v5, v11, La/p7$a;->d:I

    iget v13, v11, La/p7$a;->e:I

    iget v15, v11, La/p7$a;->f:I

    iget v11, v11, La/p7$a;->g:I

    invoke-virtual {v12, v5, v13, v15, v11}, Landroidx/fragment/app/b;->D(IIII)V

    const/4 v5, 0x0

    invoke-virtual {v14, v12, v5}, La/e7;->Y(Landroidx/fragment/app/b;Z)V

    invoke-virtual {v14, v12}, La/e7;->a(Landroidx/fragment/app/b;)Landroidx/fragment/app/e;

    goto :goto_1f

    :goto_20
    add-int/lit8 v10, v10, 0x1

    move/from16 v5, v17

    goto/16 :goto_1b

    :cond_22
    const/16 v19, 0x1

    goto/16 :goto_1a

    :goto_21
    add-int/lit8 v5, v17, 0x1

    const/16 v16, -0x1

    goto/16 :goto_12

    :cond_23
    const/16 v19, 0x1

    add-int/lit8 v5, v4, -0x1

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    iget-object v6, v1, La/e7;->m:Ljava/util/ArrayList;

    if-eqz v23, :cond_28

    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_28

    new-instance v7, Ljava/util/LinkedHashSet;

    invoke-direct {v7}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_22
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_24

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, La/S1;

    invoke-static {v9}, La/e7;->E(La/S1;)Ljava/util/HashSet;

    move-result-object v9

    invoke-interface {v7, v9}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_22

    :cond_24
    iget-object v8, v1, La/e7;->h:La/S1;

    if-nez v8, :cond_28

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_25
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_26

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, La/e7$h;

    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_23
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_25

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroidx/fragment/app/b;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_23

    :cond_26
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_27
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_28

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, La/e7$h;

    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_24
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_27

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroidx/fragment/app/b;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_24

    :cond_28
    move v7, v3

    :goto_25
    if-ge v7, v4, :cond_2d

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, La/S1;

    if-eqz v5, :cond_2b

    iget-object v9, v8, La/p7;->a:Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v9

    const/16 v19, 0x1

    add-int/lit8 v9, v9, -0x1

    :goto_26
    if-ltz v9, :cond_2a

    iget-object v10, v8, La/p7;->a:Ljava/util/ArrayList;

    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, La/p7$a;

    iget-object v10, v10, La/p7$a;->b:Landroidx/fragment/app/b;

    if-eqz v10, :cond_29

    invoke-virtual {v1, v10}, La/e7;->g(Landroidx/fragment/app/b;)Landroidx/fragment/app/e;

    move-result-object v10

    invoke-virtual {v10}, Landroidx/fragment/app/e;->k()V

    :cond_29
    const/16 v16, -0x1

    add-int/lit8 v9, v9, -0x1

    goto :goto_26

    :cond_2a
    const/4 v10, 0x1

    goto :goto_28

    :cond_2b
    iget-object v8, v8, La/p7;->a:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_2c
    :goto_27
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_2a

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, La/p7$a;

    iget-object v9, v9, La/p7$a;->b:Landroidx/fragment/app/b;

    if-eqz v9, :cond_2c

    invoke-virtual {v1, v9}, La/e7;->g(Landroidx/fragment/app/b;)Landroidx/fragment/app/e;

    move-result-object v9

    invoke-virtual {v9}, Landroidx/fragment/app/e;->k()V

    goto :goto_27

    :goto_28
    add-int/2addr v7, v10

    goto :goto_25

    :cond_2d
    const/4 v10, 0x1

    iget v7, v1, La/e7;->u:I

    invoke-virtual {v1, v7, v10}, La/e7;->O(IZ)V

    invoke-virtual {v1, v0, v3, v4}, La/e7;->f(Ljava/util/ArrayList;II)Ljava/util/HashSet;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_29
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_34

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/fragment/app/f;

    iput-boolean v5, v8, Landroidx/fragment/app/f;->d:Z

    iget-object v9, v8, Landroidx/fragment/app/f;->b:Ljava/util/ArrayList;

    monitor-enter v9

    :try_start_0
    invoke-virtual {v8}, Landroidx/fragment/app/f;->k()V

    iget-object v10, v8, Landroidx/fragment/app/f;->b:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v11

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v10

    :cond_2e
    invoke-interface {v10}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v11

    if-eqz v11, :cond_33

    invoke-interface {v10}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Landroidx/fragment/app/f$c;

    iget-object v13, v12, Landroidx/fragment/app/f$c;->c:Landroidx/fragment/app/b;

    iget-object v13, v13, Landroidx/fragment/app/b;->G:Landroid/view/View;

    const-string v14, "operation.fragment.mView"

    invoke-static {v13, v14}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v13}, Landroid/view/View;->getAlpha()F

    move-result v14

    const/4 v15, 0x0

    cmpg-float v14, v14, v15

    if-nez v14, :cond_2f

    invoke-virtual {v13}, Landroid/view/View;->getVisibility()I

    move-result v14

    if-nez v14, :cond_2f

    sget-object v13, Landroidx/fragment/app/f$c$b;->d:Landroidx/fragment/app/f$c$b;

    const/16 v14, 0x8

    goto :goto_2a

    :cond_2f
    invoke-virtual {v13}, Landroid/view/View;->getVisibility()I

    move-result v13

    if-eqz v13, :cond_32

    const/4 v14, 0x4

    if-eq v13, v14, :cond_31

    const/16 v14, 0x8

    if-ne v13, v14, :cond_30

    sget-object v13, Landroidx/fragment/app/f$c$b;->c:Landroidx/fragment/app/f$c$b;

    goto :goto_2a

    :cond_30
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unknown visibility "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_31
    const/16 v14, 0x8

    sget-object v13, Landroidx/fragment/app/f$c$b;->d:Landroidx/fragment/app/f$c$b;

    goto :goto_2a

    :cond_32
    const/16 v14, 0x8

    sget-object v13, Landroidx/fragment/app/f$c$b;->b:Landroidx/fragment/app/f$c$b;

    :goto_2a
    iget-object v12, v12, Landroidx/fragment/app/f$c;->a:Landroidx/fragment/app/f$c$b;

    sget-object v15, Landroidx/fragment/app/f$c$b;->b:Landroidx/fragment/app/f$c$b;

    if-ne v12, v15, :cond_2e

    if-eq v13, v15, :cond_2e

    move-object v10, v11

    goto :goto_2b

    :catchall_0
    move-exception v0

    goto :goto_2c

    :cond_33
    const/16 v14, 0x8

    const/4 v10, 0x0

    :goto_2b
    check-cast v10, Landroidx/fragment/app/f$c;

    const/4 v10, 0x0

    iput-boolean v10, v8, Landroidx/fragment/app/f;->e:Z

    sget-object v11, La/Wf;->a:La/Wf;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v9

    invoke-virtual {v8}, Landroidx/fragment/app/f;->e()V

    goto/16 :goto_29

    :goto_2c
    monitor-exit v9

    throw v0

    :cond_34
    const/4 v10, 0x0

    :goto_2d
    if-ge v3, v4, :cond_38

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, La/S1;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-eqz v7, :cond_35

    iget v7, v5, La/S1;->s:I

    if-ltz v7, :cond_35

    const/4 v7, -0x1

    iput v7, v5, La/S1;->s:I

    goto :goto_2e

    :cond_35
    const/4 v7, -0x1

    :goto_2e
    iget-object v8, v5, La/p7;->p:Ljava/util/ArrayList;

    if-eqz v8, :cond_37

    move v8, v10

    :goto_2f
    iget-object v9, v5, La/p7;->p:Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-ge v8, v9, :cond_36

    iget-object v9, v5, La/p7;->p:Ljava/util/ArrayList;

    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Runnable;

    invoke-interface {v9}, Ljava/lang/Runnable;->run()V

    const/16 v19, 0x1

    add-int/lit8 v8, v8, 0x1

    goto :goto_2f

    :cond_36
    const/4 v11, 0x0

    const/16 v19, 0x1

    iput-object v11, v5, La/p7;->p:Ljava/util/ArrayList;

    goto :goto_30

    :cond_37
    const/4 v11, 0x0

    const/16 v19, 0x1

    :goto_30
    add-int/lit8 v3, v3, 0x1

    goto :goto_2d

    :cond_38
    const/16 v19, 0x1

    if-eqz v23, :cond_39

    move v7, v10

    :goto_31
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v7, v0, :cond_39

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/e7$h;

    invoke-interface {v0}, La/e7$h;->a()V

    add-int/lit8 v7, v7, 0x1

    goto :goto_31

    :cond_39
    return-void

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

.method public final C(I)Landroidx/fragment/app/b;
    .locals 5

    iget-object v0, p0, La/e7;->c:La/A2;

    iget-object v1, v0, La/A2;->a:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    :goto_0
    if-ltz v2, :cond_1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/b;

    if-eqz v3, :cond_0

    iget v4, v3, Landroidx/fragment/app/b;->x:I

    if-ne v4, p1, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_1
    iget-object v0, v0, La/A2;->b:Ljava/lang/Object;

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

    check-cast v1, Landroidx/fragment/app/e;

    if-eqz v1, :cond_2

    iget-object v1, v1, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/b;

    iget v2, v1, Landroidx/fragment/app/b;->x:I

    if-ne v2, p1, :cond_2

    return-object v1

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method public final D()V
    .locals 4

    invoke-virtual {p0}, La/e7;->e()Ljava/util/HashSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/f;

    iget-boolean v2, v1, Landroidx/fragment/app/f;->e:Z

    if-eqz v2, :cond_0

    const/4 v2, 0x2

    invoke-static {v2}, La/e7;->J(I)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "FragmentManager"

    const-string v3, "SpecialEffectsController: Forcing postponed operations"

    invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    const/4 v2, 0x0

    iput-boolean v2, v1, Landroidx/fragment/app/f;->e:Z

    invoke-virtual {v1}, Landroidx/fragment/app/f;->e()V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final F(Landroidx/fragment/app/b;)Landroid/view/ViewGroup;
    .locals 1

    iget-object v0, p1, Landroidx/fragment/app/b;->F:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget v0, p1, Landroidx/fragment/app/b;->y:I

    if-gtz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, La/e7;->w:La/a2;

    invoke-virtual {v0}, La/a2;->f()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, La/e7;->w:La/a2;

    iget p1, p1, Landroidx/fragment/app/b;->y:I

    invoke-virtual {v0, p1}, La/a2;->c(I)Landroid/view/View;

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

.method public final G()Landroidx/fragment/app/d;
    .locals 1

    iget-object v0, p0, La/e7;->x:Landroidx/fragment/app/b;

    if-eqz v0, :cond_0

    iget-object v0, v0, Landroidx/fragment/app/b;->t:La/e7;

    invoke-virtual {v0}, La/e7;->G()Landroidx/fragment/app/d;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, La/e7;->z:La/e7$c;

    return-object v0
.end method

.method public final H()La/qe;
    .locals 1

    iget-object v0, p0, La/e7;->x:Landroidx/fragment/app/b;

    if-eqz v0, :cond_0

    iget-object v0, v0, Landroidx/fragment/app/b;->t:La/e7;

    invoke-virtual {v0}, La/e7;->H()La/qe;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, La/e7;->A:La/e7$d;

    return-object v0
.end method

.method public final I(Landroidx/fragment/app/b;)V
    .locals 2

    const/4 v0, 0x2

    invoke-static {v0}, La/e7;->J(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "hide: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-boolean v0, p1, Landroidx/fragment/app/b;->A:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p1, Landroidx/fragment/app/b;->A:Z

    iget-boolean v1, p1, Landroidx/fragment/app/b;->K:Z

    xor-int/2addr v0, v1

    iput-boolean v0, p1, Landroidx/fragment/app/b;->K:Z

    invoke-virtual {p0, p1}, La/e7;->b0(Landroidx/fragment/app/b;)V

    :cond_1
    return-void
.end method

.method public final L()Z
    .locals 2

    iget-object v0, p0, La/e7;->x:Landroidx/fragment/app/b;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/b;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, La/e7;->x:Landroidx/fragment/app/b;

    invoke-virtual {v0}, Landroidx/fragment/app/b;->f()La/e7;

    move-result-object v0

    invoke-virtual {v0}, La/e7;->L()Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final O(IZ)V
    .locals 3

    iget-object v0, p0, La/e7;->v:La/X6$a;

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

    iget p2, p0, La/e7;->u:I

    if-ne p1, p2, :cond_2

    goto :goto_3

    :cond_2
    iput p1, p0, La/e7;->u:I

    iget-object p1, p0, La/e7;->c:La/A2;

    iget-object p2, p1, La/A2;->a:Ljava/lang/Object;

    check-cast p2, Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_3
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    iget-object v1, p1, La/A2;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    if-eqz v0, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/b;

    iget-object v0, v0, Landroidx/fragment/app/b;->e:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/e;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroidx/fragment/app/e;->k()V

    goto :goto_1

    :cond_4
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

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

    check-cast v0, Landroidx/fragment/app/e;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Landroidx/fragment/app/e;->k()V

    iget-object v1, v0, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/b;

    iget-boolean v2, v1, Landroidx/fragment/app/b;->l:Z

    if-eqz v2, :cond_5

    invoke-virtual {v1}, Landroidx/fragment/app/b;->k()Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {p1, v0}, La/A2;->i(Landroidx/fragment/app/e;)V

    goto :goto_2

    :cond_6
    invoke-virtual {p0}, La/e7;->d0()V

    iget-boolean p1, p0, La/e7;->F:Z

    if-eqz p1, :cond_7

    iget-object p1, p0, La/e7;->v:La/X6$a;

    if-eqz p1, :cond_7

    iget p2, p0, La/e7;->u:I

    const/4 v0, 0x7

    if-ne p2, v0, :cond_7

    iget-object p1, p1, La/X6$a;->e:La/X6;

    invoke-virtual {p1}, Landroidx/activity/ComponentActivity;->invalidateMenu()V

    const/4 p1, 0x0

    iput-boolean p1, p0, La/e7;->F:Z

    :cond_7
    :goto_3
    return-void
.end method

.method public final P()V
    .locals 2

    iget-object v0, p0, La/e7;->v:La/X6$a;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, La/e7;->G:Z

    iput-boolean v0, p0, La/e7;->H:Z

    iget-object v1, p0, La/e7;->N:La/k7;

    iput-boolean v0, v1, La/k7;->i:Z

    iget-object v0, p0, La/e7;->c:La/A2;

    invoke-virtual {v0}, La/A2;->g()Ljava/util/List;

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

    check-cast v1, Landroidx/fragment/app/b;

    if-eqz v1, :cond_1

    iget-object v1, v1, Landroidx/fragment/app/b;->v:La/i7;

    invoke-virtual {v1}, La/e7;->P()V

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public final Q()Z
    .locals 2

    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, La/e7;->R(II)Z

    move-result v0

    return v0
.end method

.method public final R(II)Z
    .locals 4

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, La/e7;->z(Z)Z

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, La/e7;->y(Z)V

    iget-object v2, p0, La/e7;->y:Landroidx/fragment/app/b;

    if-eqz v2, :cond_0

    if-gez p1, :cond_0

    invoke-virtual {v2}, Landroidx/fragment/app/b;->c()La/e7;

    move-result-object v2

    invoke-virtual {v2}, La/e7;->Q()Z

    move-result v2

    if-eqz v2, :cond_0

    return v1

    :cond_0
    iget-object v2, p0, La/e7;->K:Ljava/util/ArrayList;

    iget-object v3, p0, La/e7;->L:Ljava/util/ArrayList;

    invoke-virtual {p0, v2, v3, p1, p2}, La/e7;->S(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z

    move-result p1

    if-eqz p1, :cond_1

    iput-boolean v1, p0, La/e7;->b:Z

    :try_start_0
    iget-object p2, p0, La/e7;->K:Ljava/util/ArrayList;

    iget-object v1, p0, La/e7;->L:Ljava/util/ArrayList;

    invoke-virtual {p0, p2, v1}, La/e7;->U(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, La/e7;->d()V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, La/e7;->d()V

    throw p1

    :cond_1
    :goto_0
    invoke-virtual {p0}, La/e7;->f0()V

    iget-boolean p2, p0, La/e7;->J:Z

    if-eqz p2, :cond_2

    iput-boolean v0, p0, La/e7;->J:Z

    invoke-virtual {p0}, La/e7;->d0()V

    :cond_2
    iget-object p2, p0, La/e7;->c:La/A2;

    iget-object p2, p2, La/A2;->b:Ljava/lang/Object;

    check-cast p2, Ljava/util/HashMap;

    invoke-virtual {p2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p2

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    return p1
.end method

.method public final S(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z
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
    iget-object v2, p0, La/e7;->d:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    const/4 v3, -0x1

    if-eqz v2, :cond_1

    goto :goto_4

    :cond_1
    if-gez p3, :cond_3

    if-eqz p4, :cond_2

    move v3, v1

    goto :goto_4

    :cond_2
    iget-object p3, p0, La/e7;->d:Ljava/util/ArrayList;

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p3

    add-int/lit8 v3, p3, -0x1

    goto :goto_4

    :cond_3
    iget-object v2, p0, La/e7;->d:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    sub-int/2addr v2, v0

    :goto_1
    if-ltz v2, :cond_5

    iget-object v4, p0, La/e7;->d:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/S1;

    if-ltz p3, :cond_4

    iget v4, v4, La/S1;->s:I

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

    iget-object p4, p0, La/e7;->d:Ljava/util/ArrayList;

    add-int/lit8 v2, v3, -0x1

    invoke-virtual {p4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, La/S1;

    if-ltz p3, :cond_9

    iget p4, p4, La/S1;->s:I

    if-ne p3, p4, :cond_9

    add-int/lit8 v3, v3, -0x1

    goto :goto_3

    :cond_7
    iget-object p3, p0, La/e7;->d:Ljava/util/ArrayList;

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
    iget-object p3, p0, La/e7;->d:Ljava/util/ArrayList;

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p3

    sub-int/2addr p3, v0

    :goto_5
    if-lt p3, v3, :cond_b

    iget-object p4, p0, La/e7;->d:Ljava/util/ArrayList;

    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, La/S1;

    invoke-virtual {p1, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p2, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p3, p3, -0x1

    goto :goto_5

    :cond_b
    return v0
.end method

.method public final T(Landroidx/fragment/app/b;)V
    .locals 2

    const/4 v0, 0x2

    invoke-static {v0}, La/e7;->J(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "remove: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " nesting="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p1, Landroidx/fragment/app/b;->s:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-virtual {p1}, Landroidx/fragment/app/b;->k()Z

    move-result v0

    iget-boolean v1, p1, Landroidx/fragment/app/b;->B:Z

    if-eqz v1, :cond_2

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    :goto_0
    iget-object v0, p0, La/e7;->c:La/A2;

    iget-object v1, v0, La/A2;->a:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    monitor-enter v1

    :try_start_0
    iget-object v0, v0, La/A2;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    iput-boolean v0, p1, Landroidx/fragment/app/b;->k:Z

    invoke-static {p1}, La/e7;->K(Landroidx/fragment/app/b;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    iput-boolean v1, p0, La/e7;->F:Z

    :cond_3
    iput-boolean v1, p1, Landroidx/fragment/app/b;->l:Z

    invoke-virtual {p0, p1}, La/e7;->b0(Landroidx/fragment/app/b;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final U(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "La/S1;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

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

    check-cast v3, La/S1;

    iget-boolean v3, v3, La/p7;->o:Z

    if-nez v3, :cond_3

    if-eq v2, v1, :cond_1

    invoke-virtual {p0, p1, p2, v2, v1}, La/e7;->B(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

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

    check-cast v3, La/S1;

    iget-boolean v3, v3, La/p7;->o:Z

    if-nez v3, :cond_2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {p0, p1, p2, v1, v2}, La/e7;->B(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    add-int/lit8 v1, v2, -0x1

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    if-eq v2, v0, :cond_5

    invoke-virtual {p0, p1, p2, v2, v0}, La/e7;->B(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    :cond_5
    :goto_2
    return-void

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Internal error with the back stack records"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final V(Landroid/os/Bundle;)V
    .locals 18

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

    iget-object v5, v0, La/e7;->v:La/X6$a;

    iget-object v5, v5, La/Z6;->b:La/X6;

    invoke-virtual {v5}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    const/4 v5, 0x7

    invoke-virtual {v3, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    iget-object v5, v0, La/e7;->l:Ljava/util/Map;

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

    iget-object v6, v0, La/e7;->v:La/X6$a;

    iget-object v6, v6, La/Z6;->b:La/X6;

    invoke-virtual {v6}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    const/16 v6, 0x9

    invoke-virtual {v4, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    iget-object v3, v0, La/e7;->c:La/A2;

    iget-object v4, v3, La/A2;->c:Ljava/lang/Object;

    check-cast v4, Ljava/util/HashMap;

    invoke-virtual {v4}, Ljava/util/HashMap;->clear()V

    invoke-virtual {v4, v2}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    const-string v2, "state"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, La/j7;

    if-nez v1, :cond_4

    return-void

    :cond_4
    iget-object v4, v3, La/A2;->b:Ljava/lang/Object;

    check-cast v4, Ljava/util/HashMap;

    invoke-virtual {v4}, Ljava/util/HashMap;->clear()V

    iget-object v5, v1, La/j7;->a:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_5
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x2

    iget-object v8, v0, La/e7;->n:La/b7;

    const-string v9, "): "

    const-string v10, "FragmentManager"

    if-eqz v6, :cond_9

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    const/4 v11, 0x0

    invoke-virtual {v3, v6, v11}, La/A2;->j(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v6

    if-eqz v6, :cond_5

    invoke-virtual {v6, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v11

    check-cast v11, La/n7;

    iget-object v12, v0, La/e7;->N:La/k7;

    iget-object v11, v11, La/n7;->b:Ljava/lang/String;

    iget-object v12, v12, La/k7;->d:Ljava/util/HashMap;

    invoke-virtual {v12, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroidx/fragment/app/b;

    if-eqz v11, :cond_7

    invoke-static {v7}, La/e7;->J(I)Z

    move-result v12

    if-eqz v12, :cond_6

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "restoreSaveState: re-attaching retained "

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v10, v12}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_6
    new-instance v12, Landroidx/fragment/app/e;

    invoke-direct {v12, v8, v3, v11, v6}, Landroidx/fragment/app/e;-><init>(La/b7;La/A2;Landroidx/fragment/app/b;Landroid/os/Bundle;)V

    goto :goto_3

    :cond_7
    new-instance v12, Landroidx/fragment/app/e;

    iget-object v8, v0, La/e7;->v:La/X6$a;

    iget-object v8, v8, La/Z6;->b:La/X6;

    invoke-virtual {v8}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v15

    invoke-virtual {v0}, La/e7;->G()Landroidx/fragment/app/d;

    move-result-object v16

    iget-object v13, v0, La/e7;->n:La/b7;

    iget-object v14, v0, La/e7;->c:La/A2;

    move-object/from16 v17, v6

    invoke-direct/range {v12 .. v17}, Landroidx/fragment/app/e;-><init>(La/b7;La/A2;Ljava/lang/ClassLoader;Landroidx/fragment/app/d;Landroid/os/Bundle;)V

    :goto_3
    iget-object v8, v12, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/b;

    iput-object v6, v8, Landroidx/fragment/app/b;->b:Landroid/os/Bundle;

    iput-object v0, v8, Landroidx/fragment/app/b;->t:La/e7;

    invoke-static {v7}, La/e7;->J(I)Z

    move-result v6

    if-eqz v6, :cond_8

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "restoreSaveState: active ("

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v7, v8, Landroidx/fragment/app/b;->e:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v10, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_8
    iget-object v6, v0, La/e7;->v:La/X6$a;

    iget-object v6, v6, La/Z6;->b:La/X6;

    invoke-virtual {v6}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v6

    invoke-virtual {v12, v6}, Landroidx/fragment/app/e;->m(Ljava/lang/ClassLoader;)V

    invoke-virtual {v3, v12}, La/A2;->h(Landroidx/fragment/app/e;)V

    iget v6, v0, La/e7;->u:I

    iput v6, v12, Landroidx/fragment/app/e;->e:I

    goto/16 :goto_2

    :cond_9
    iget-object v2, v0, La/e7;->N:La/k7;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v5, Ljava/util/ArrayList;

    iget-object v2, v2, La/k7;->d:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-direct {v5, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x1

    if-eqz v5, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/b;

    iget-object v11, v5, Landroidx/fragment/app/b;->e:Ljava/lang/String;

    invoke-virtual {v4, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    if-eqz v11, :cond_a

    goto :goto_4

    :cond_a
    invoke-static {v7}, La/e7;->J(I)Z

    move-result v11

    if-eqz v11, :cond_b

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "Discarding retained Fragment "

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v12, " that was not found in the set of active Fragments "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v12, v1, La/j7;->a:Ljava/util/ArrayList;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_b
    iget-object v11, v0, La/e7;->N:La/k7;

    invoke-virtual {v11, v5}, La/k7;->f(Landroidx/fragment/app/b;)V

    iput-object v0, v5, Landroidx/fragment/app/b;->t:La/e7;

    new-instance v11, Landroidx/fragment/app/e;

    invoke-direct {v11, v8, v3, v5}, Landroidx/fragment/app/e;-><init>(La/b7;La/A2;Landroidx/fragment/app/b;)V

    iput v6, v11, Landroidx/fragment/app/e;->e:I

    invoke-virtual {v11}, Landroidx/fragment/app/e;->k()V

    iput-boolean v6, v5, Landroidx/fragment/app/b;->l:Z

    invoke-virtual {v11}, Landroidx/fragment/app/e;->k()V

    goto :goto_4

    :cond_c
    iget-object v2, v1, La/j7;->b:Ljava/util/ArrayList;

    iget-object v4, v3, La/A2;->a:Ljava/lang/Object;

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

    invoke-virtual {v3, v4}, La/A2;->c(Ljava/lang/String;)Landroidx/fragment/app/b;

    move-result-object v5

    if-eqz v5, :cond_e

    invoke-static {v7}, La/e7;->J(I)Z

    move-result v8

    if-eqz v8, :cond_d

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v11, "restoreSaveState: added ("

    invoke-direct {v8, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v10, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_d
    invoke-virtual {v3, v5}, La/A2;->a(Landroidx/fragment/app/b;)V

    goto :goto_5

    :cond_e
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "No instantiated fragment for ("

    const-string v3, ")"

    invoke-static {v2, v4, v3}, La/z;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_f
    iget-object v2, v1, La/j7;->c:[La/T1;

    if-eqz v2, :cond_17

    new-instance v2, Ljava/util/ArrayList;

    iget-object v5, v1, La/j7;->c:[La/T1;

    array-length v5, v5

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v2, v0, La/e7;->d:Ljava/util/ArrayList;

    const/4 v2, 0x0

    :goto_6
    iget-object v5, v1, La/j7;->c:[La/T1;

    array-length v8, v5

    if-ge v2, v8, :cond_16

    aget-object v5, v5, v2

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v8, La/S1;

    invoke-direct {v8, v0}, La/S1;-><init>(La/e7;)V

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_7
    iget-object v13, v5, La/T1;->a:[I

    array-length v14, v13

    if-ge v11, v14, :cond_12

    new-instance v14, La/p7$a;

    invoke-direct {v14}, La/p7$a;-><init>()V

    add-int/lit8 v15, v11, 0x1

    move/from16 p1, v7

    aget v7, v13, v11

    iput v7, v14, La/p7$a;->a:I

    invoke-static/range {p1 .. p1}, La/e7;->J(I)Z

    move-result v7

    if-eqz v7, :cond_10

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v4, "Instantiate "

    invoke-direct {v7, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " op #"

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " base fragment #"

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget v4, v13, v15

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v10, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_10
    invoke-static {}, Landroidx/lifecycle/e$b;->values()[Landroidx/lifecycle/e$b;

    move-result-object v4

    iget-object v7, v5, La/T1;->c:[I

    aget v7, v7, v12

    aget-object v4, v4, v7

    iput-object v4, v14, La/p7$a;->h:Landroidx/lifecycle/e$b;

    invoke-static {}, Landroidx/lifecycle/e$b;->values()[Landroidx/lifecycle/e$b;

    move-result-object v4

    iget-object v7, v5, La/T1;->d:[I

    aget v7, v7, v12

    aget-object v4, v4, v7

    iput-object v4, v14, La/p7$a;->i:Landroidx/lifecycle/e$b;

    add-int/lit8 v4, v11, 0x2

    aget v7, v13, v15

    if-eqz v7, :cond_11

    move v7, v6

    goto :goto_8

    :cond_11
    const/4 v7, 0x0

    :goto_8
    iput-boolean v7, v14, La/p7$a;->c:Z

    add-int/lit8 v7, v11, 0x3

    aget v4, v13, v4

    iput v4, v14, La/p7$a;->d:I

    add-int/lit8 v15, v11, 0x4

    aget v7, v13, v7

    iput v7, v14, La/p7$a;->e:I

    add-int/lit8 v17, v11, 0x5

    aget v15, v13, v15

    iput v15, v14, La/p7$a;->f:I

    add-int/lit8 v11, v11, 0x6

    aget v13, v13, v17

    iput v13, v14, La/p7$a;->g:I

    iput v4, v8, La/p7;->b:I

    iput v7, v8, La/p7;->c:I

    iput v15, v8, La/p7;->d:I

    iput v13, v8, La/p7;->e:I

    invoke-virtual {v8, v14}, La/p7;->b(La/p7$a;)V

    add-int/lit8 v12, v12, 0x1

    move/from16 v7, p1

    goto/16 :goto_7

    :cond_12
    move/from16 p1, v7

    iget v4, v5, La/T1;->e:I

    iput v4, v8, La/p7;->f:I

    iget-object v4, v5, La/T1;->f:Ljava/lang/String;

    iput-object v4, v8, La/p7;->h:Ljava/lang/String;

    iput-boolean v6, v8, La/p7;->g:Z

    iget v4, v5, La/T1;->h:I

    iput v4, v8, La/p7;->i:I

    iget-object v4, v5, La/T1;->i:Ljava/lang/CharSequence;

    iput-object v4, v8, La/p7;->j:Ljava/lang/CharSequence;

    iget v4, v5, La/T1;->j:I

    iput v4, v8, La/p7;->k:I

    iget-object v4, v5, La/T1;->k:Ljava/lang/CharSequence;

    iput-object v4, v8, La/p7;->l:Ljava/lang/CharSequence;

    iget-object v4, v5, La/T1;->l:Ljava/util/ArrayList;

    iput-object v4, v8, La/p7;->m:Ljava/util/ArrayList;

    iget-object v4, v5, La/T1;->m:Ljava/util/ArrayList;

    iput-object v4, v8, La/p7;->n:Ljava/util/ArrayList;

    iget-boolean v4, v5, La/T1;->n:Z

    iput-boolean v4, v8, La/p7;->o:Z

    iget v4, v5, La/T1;->g:I

    iput v4, v8, La/S1;->s:I

    const/4 v4, 0x0

    :goto_9
    iget-object v7, v5, La/T1;->b:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v11

    if-ge v4, v11, :cond_14

    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    if-eqz v7, :cond_13

    iget-object v11, v8, La/p7;->a:Ljava/util/ArrayList;

    invoke-virtual {v11, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, La/p7$a;

    invoke-virtual {v3, v7}, La/A2;->c(Ljava/lang/String;)Landroidx/fragment/app/b;

    move-result-object v7

    iput-object v7, v11, La/p7$a;->b:Landroidx/fragment/app/b;

    :cond_13
    add-int/lit8 v4, v4, 0x1

    goto :goto_9

    :cond_14
    invoke-virtual {v8, v6}, La/S1;->c(I)V

    invoke-static/range {p1 .. p1}, La/e7;->J(I)Z

    move-result v4

    if-eqz v4, :cond_15

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "restoreAllState: back stack #"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, " (index "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v5, v8, La/S1;->s:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v10, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v4, La/M9;

    invoke-direct {v4}, La/M9;-><init>()V

    new-instance v5, Ljava/io/PrintWriter;

    invoke-direct {v5, v4}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    const-string v4, "  "

    const/4 v7, 0x0

    invoke-virtual {v8, v4, v5, v7}, La/S1;->f(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    invoke-virtual {v5}, Ljava/io/PrintWriter;->close()V

    goto :goto_a

    :cond_15
    const/4 v7, 0x0

    :goto_a
    iget-object v4, v0, La/e7;->d:Ljava/util/ArrayList;

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    move/from16 v7, p1

    goto/16 :goto_6

    :cond_16
    const/4 v7, 0x0

    goto :goto_b

    :cond_17
    const/4 v7, 0x0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v0, La/e7;->d:Ljava/util/ArrayList;

    :goto_b
    iget-object v2, v0, La/e7;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    iget v4, v1, La/j7;->d:I

    invoke-virtual {v2, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    iget-object v2, v1, La/j7;->e:Ljava/lang/String;

    if-eqz v2, :cond_18

    invoke-virtual {v3, v2}, La/A2;->c(Ljava/lang/String;)Landroidx/fragment/app/b;

    move-result-object v2

    iput-object v2, v0, La/e7;->y:Landroidx/fragment/app/b;

    invoke-virtual {v0, v2}, La/e7;->r(Landroidx/fragment/app/b;)V

    :cond_18
    iget-object v2, v1, La/j7;->f:Ljava/util/ArrayList;

    if-eqz v2, :cond_19

    move v4, v7

    :goto_c
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v4, v3, :cond_19

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-object v5, v1, La/j7;->g:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, La/U1;

    iget-object v6, v0, La/e7;->k:Ljava/util/Map;

    invoke-interface {v6, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x1

    goto :goto_c

    :cond_19
    new-instance v2, Ljava/util/ArrayDeque;

    iget-object v1, v1, La/j7;->h:Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayDeque;-><init>(Ljava/util/Collection;)V

    iput-object v2, v0, La/e7;->E:Ljava/util/ArrayDeque;

    return-void
.end method

.method public final W()Landroid/os/Bundle;
    .locals 14

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p0}, La/e7;->D()V

    invoke-virtual {p0}, La/e7;->w()V

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, La/e7;->z(Z)Z

    iput-boolean v1, p0, La/e7;->G:Z

    iget-object v2, p0, La/e7;->N:La/k7;

    iput-boolean v1, v2, La/k7;->i:Z

    iget-object v1, p0, La/e7;->c:La/A2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, v1, La/A2;->b:Ljava/lang/Object;

    check-cast v3, Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->size()I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x2

    if-eqz v4, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/fragment/app/e;

    if-eqz v4, :cond_0

    iget-object v7, v4, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/b;

    iget-object v8, v7, Landroidx/fragment/app/b;->e:Ljava/lang/String;

    new-instance v9, Landroid/os/Bundle;

    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    iget-object v10, v4, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/b;

    iget v11, v10, Landroidx/fragment/app/b;->a:I

    const/4 v12, -0x1

    if-ne v11, v12, :cond_1

    iget-object v11, v10, Landroidx/fragment/app/b;->b:Landroid/os/Bundle;

    if-eqz v11, :cond_1

    invoke-virtual {v9, v11}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_1
    new-instance v11, La/n7;

    invoke-direct {v11, v10}, La/n7;-><init>(Landroidx/fragment/app/b;)V

    const-string v13, "state"

    invoke-virtual {v9, v13, v11}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    iget v11, v10, Landroidx/fragment/app/b;->a:I

    if-le v11, v12, :cond_7

    new-instance v11, Landroid/os/Bundle;

    invoke-direct {v11}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v10, v11}, Landroidx/fragment/app/b;->t(Landroid/os/Bundle;)V

    invoke-virtual {v11}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_2

    const-string v12, "savedInstanceState"

    invoke-virtual {v9, v12, v11}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_2
    iget-object v12, v4, Landroidx/fragment/app/e;->a:La/b7;

    invoke-virtual {v12, v10, v11, v5}, La/b7;->j(Landroidx/fragment/app/b;Landroid/os/Bundle;Z)V

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    iget-object v11, v10, Landroidx/fragment/app/b;->R:La/Kd;

    invoke-virtual {v11, v5}, La/Kd;->c(Landroid/os/Bundle;)V

    invoke-virtual {v5}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_3

    const-string v11, "registryState"

    invoke-virtual {v9, v11, v5}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_3
    iget-object v5, v10, Landroidx/fragment/app/b;->v:La/i7;

    invoke-virtual {v5}, La/e7;->W()Landroid/os/Bundle;

    move-result-object v5

    invoke-virtual {v5}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_4

    const-string v11, "childFragmentManager"

    invoke-virtual {v9, v11, v5}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_4
    iget-object v5, v10, Landroidx/fragment/app/b;->G:Landroid/view/View;

    if-eqz v5, :cond_5

    invoke-virtual {v4}, Landroidx/fragment/app/e;->o()V

    :cond_5
    iget-object v4, v10, Landroidx/fragment/app/b;->c:Landroid/util/SparseArray;

    if-eqz v4, :cond_6

    const-string v5, "viewState"

    invoke-virtual {v9, v5, v4}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    :cond_6
    iget-object v4, v10, Landroidx/fragment/app/b;->d:Landroid/os/Bundle;

    if-eqz v4, :cond_7

    const-string v5, "viewRegistryState"

    invoke-virtual {v9, v5, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_7
    iget-object v4, v10, Landroidx/fragment/app/b;->f:Landroid/os/Bundle;

    if-eqz v4, :cond_8

    const-string v5, "arguments"

    invoke-virtual {v9, v5, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_8
    invoke-virtual {v1, v8, v9}, La/A2;->j(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    iget-object v4, v7, Landroidx/fragment/app/b;->e:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v6}, La/e7;->J(I)Z

    move-result v4

    if-eqz v4, :cond_0

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Saved state of "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, ": "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v7, Landroidx/fragment/app/b;->b:Landroid/os/Bundle;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "FragmentManager"

    invoke-static {v5, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    :cond_9
    iget-object v1, p0, La/e7;->c:La/A2;

    iget-object v1, v1, La/A2;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-static {v6}, La/e7;->J(I)Z

    move-result v1

    if-eqz v1, :cond_12

    const-string v1, "FragmentManager"

    const-string v2, "saveAllState: no fragments!"

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-object v0

    :cond_a
    iget-object v3, p0, La/e7;->c:La/A2;

    iget-object v4, v3, La/A2;->a:Ljava/lang/Object;

    check-cast v4, Ljava/util/ArrayList;

    monitor-enter v4

    :try_start_0
    iget-object v7, v3, La/A2;->a:Ljava/lang/Object;

    check-cast v7, Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    const/4 v8, 0x0

    if-eqz v7, :cond_b

    monitor-exit v4

    move-object v7, v8

    goto :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_6

    :cond_b
    new-instance v7, Ljava/util/ArrayList;

    iget-object v9, v3, La/A2;->a:Ljava/lang/Object;

    check-cast v9, Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v9

    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v3, v3, La/A2;->a:Ljava/lang/Object;

    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_c
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/fragment/app/b;

    iget-object v10, v9, Landroidx/fragment/app/b;->e:Ljava/lang/String;

    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v6}, La/e7;->J(I)Z

    move-result v10

    if-eqz v10, :cond_c

    const-string v10, "FragmentManager"

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "saveAllState: adding fragment ("

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v12, v9, Landroidx/fragment/app/b;->e:Ljava/lang/String;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, "): "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v10, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_d
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_2
    iget-object v3, p0, La/e7;->d:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v3, :cond_f

    new-array v8, v3, [La/T1;

    :goto_3
    if-ge v5, v3, :cond_f

    new-instance v4, La/T1;

    iget-object v9, p0, La/e7;->d:Ljava/util/ArrayList;

    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, La/S1;

    invoke-direct {v4, v9}, La/T1;-><init>(La/S1;)V

    aput-object v4, v8, v5

    invoke-static {v6}, La/e7;->J(I)Z

    move-result v4

    if-eqz v4, :cond_e

    const-string v4, "FragmentManager"

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "saveAllState: adding back stack #"

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v10, ": "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v10, p0, La/e7;->d:Ljava/util/ArrayList;

    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v4, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_e
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_f
    new-instance v3, La/j7;

    invoke-direct {v3}, La/j7;-><init>()V

    iput-object v2, v3, La/j7;->a:Ljava/util/ArrayList;

    iput-object v7, v3, La/j7;->b:Ljava/util/ArrayList;

    iput-object v8, v3, La/j7;->c:[La/T1;

    iget-object v2, p0, La/e7;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    iput v2, v3, La/j7;->d:I

    iget-object v2, p0, La/e7;->y:Landroidx/fragment/app/b;

    if-eqz v2, :cond_10

    iget-object v2, v2, Landroidx/fragment/app/b;->e:Ljava/lang/String;

    iput-object v2, v3, La/j7;->e:Ljava/lang/String;

    :cond_10
    iget-object v2, v3, La/j7;->f:Ljava/util/ArrayList;

    iget-object v4, p0, La/e7;->k:Ljava/util/Map;

    invoke-interface {v4}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v2, v3, La/j7;->g:Ljava/util/ArrayList;

    iget-object v4, p0, La/e7;->k:Ljava/util/Map;

    invoke-interface {v4}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    new-instance v2, Ljava/util/ArrayList;

    iget-object v4, p0, La/e7;->E:Ljava/util/ArrayDeque;

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v3, La/j7;->h:Ljava/util/ArrayList;

    const-string v2, "state"

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    iget-object v2, p0, La/e7;->l:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "result_"

    invoke-static {v4, v3}, La/z;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, La/e7;->l:Ljava/util/Map;

    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/os/Bundle;

    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_4

    :cond_11
    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "fragment_"

    invoke-static {v4, v3}, La/z;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/os/Bundle;

    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_5

    :cond_12
    return-object v0

    :goto_6
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final X()V
    .locals 3

    iget-object v0, p0, La/e7;->a:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, La/e7;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, La/e7;->v:La/X6$a;

    iget-object v1, v1, La/Z6;->c:Landroid/os/Handler;

    iget-object v2, p0, La/e7;->O:La/e7$e;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v1, p0, La/e7;->v:La/X6$a;

    iget-object v1, v1, La/Z6;->c:Landroid/os/Handler;

    iget-object v2, p0, La/e7;->O:La/e7$e;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    invoke-virtual {p0}, La/e7;->f0()V

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

.method public final Y(Landroidx/fragment/app/b;Z)V
    .locals 1

    invoke-virtual {p0, p1}, La/e7;->F(Landroidx/fragment/app/b;)Landroid/view/ViewGroup;

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

.method public final Z(Landroidx/fragment/app/b;Landroidx/lifecycle/e$b;)V
    .locals 2

    iget-object v0, p1, Landroidx/fragment/app/b;->e:Ljava/lang/String;

    iget-object v1, p0, La/e7;->c:La/A2;

    invoke-virtual {v1, v0}, La/A2;->c(Ljava/lang/String;)Landroidx/fragment/app/b;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Landroidx/fragment/app/b;->u:La/X6$a;

    if-eqz v0, :cond_0

    iget-object v0, p1, Landroidx/fragment/app/b;->t:La/e7;

    if-ne v0, p0, :cond_1

    :cond_0
    iput-object p2, p1, Landroidx/fragment/app/b;->N:Landroidx/lifecycle/e$b;

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

.method public final a(Landroidx/fragment/app/b;)Landroidx/fragment/app/e;
    .locals 3

    iget-object v0, p1, Landroidx/fragment/app/b;->M:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {p1, v0}, La/o7;->c(Landroidx/fragment/app/b;Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x2

    invoke-static {v0}, La/e7;->J(I)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "add: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    invoke-virtual {p0, p1}, La/e7;->g(Landroidx/fragment/app/b;)Landroidx/fragment/app/e;

    move-result-object v0

    iput-object p0, p1, Landroidx/fragment/app/b;->t:La/e7;

    iget-object v1, p0, La/e7;->c:La/A2;

    invoke-virtual {v1, v0}, La/A2;->h(Landroidx/fragment/app/e;)V

    iget-boolean v2, p1, Landroidx/fragment/app/b;->B:Z

    if-nez v2, :cond_3

    invoke-virtual {v1, p1}, La/A2;->a(Landroidx/fragment/app/b;)V

    const/4 v1, 0x0

    iput-boolean v1, p1, Landroidx/fragment/app/b;->l:Z

    iget-object v2, p1, Landroidx/fragment/app/b;->G:Landroid/view/View;

    if-nez v2, :cond_2

    iput-boolean v1, p1, Landroidx/fragment/app/b;->K:Z

    :cond_2
    invoke-static {p1}, La/e7;->K(Landroidx/fragment/app/b;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    iput-boolean p1, p0, La/e7;->F:Z

    :cond_3
    return-object v0
.end method

.method public final a0(Landroidx/fragment/app/b;)V
    .locals 3

    if-eqz p1, :cond_1

    iget-object v0, p1, Landroidx/fragment/app/b;->e:Ljava/lang/String;

    iget-object v1, p0, La/e7;->c:La/A2;

    invoke-virtual {v1, v0}, La/A2;->c(Ljava/lang/String;)Landroidx/fragment/app/b;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Landroidx/fragment/app/b;->u:La/X6$a;

    if-eqz v0, :cond_1

    iget-object v0, p1, Landroidx/fragment/app/b;->t:La/e7;

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
    iget-object v0, p0, La/e7;->y:Landroidx/fragment/app/b;

    iput-object p1, p0, La/e7;->y:Landroidx/fragment/app/b;

    invoke-virtual {p0, v0}, La/e7;->r(Landroidx/fragment/app/b;)V

    iget-object p1, p0, La/e7;->y:Landroidx/fragment/app/b;

    invoke-virtual {p0, p1}, La/e7;->r(Landroidx/fragment/app/b;)V

    return-void
.end method

.method public final b(La/X6$a;La/a2;Landroidx/fragment/app/b;)V
    .locals 3

    iget-object v0, p0, La/e7;->v:La/X6$a;

    if-nez v0, :cond_13

    iput-object p1, p0, La/e7;->v:La/X6$a;

    iput-object p2, p0, La/e7;->w:La/a2;

    iput-object p3, p0, La/e7;->x:Landroidx/fragment/app/b;

    iget-object p2, p0, La/e7;->o:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz p3, :cond_0

    new-instance v0, La/f7;

    invoke-direct {v0, p3}, La/f7;-><init>(Landroidx/fragment/app/b;)V

    invoke-virtual {p2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p2, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    iget-object p2, p0, La/e7;->x:Landroidx/fragment/app/b;

    if-eqz p2, :cond_2

    invoke-virtual {p0}, La/e7;->f0()V

    :cond_2
    if-eqz p1, :cond_4

    invoke-interface {p1}, La/Yb;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    move-result-object p2

    iput-object p2, p0, La/e7;->g:Landroidx/activity/OnBackPressedDispatcher;

    if-eqz p3, :cond_3

    move-object v0, p3

    goto :goto_1

    :cond_3
    move-object v0, p1

    :goto_1
    iget-object v1, p0, La/e7;->i:La/e7$a;

    invoke-virtual {p2, v0, v1}, Landroidx/activity/OnBackPressedDispatcher;->a(La/y9;La/e7$a;)V

    :cond_4
    const/4 p2, 0x0

    if-eqz p3, :cond_6

    iget-object p1, p3, Landroidx/fragment/app/b;->t:La/e7;

    iget-object p1, p1, La/e7;->N:La/k7;

    iget-object v0, p1, La/k7;->e:Ljava/util/HashMap;

    iget-object v1, p3, Landroidx/fragment/app/b;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/k7;

    if-nez v1, :cond_5

    new-instance v1, La/k7;

    iget-boolean p1, p1, La/k7;->g:Z

    invoke-direct {v1, p1}, La/k7;-><init>(Z)V

    iget-object p1, p3, Landroidx/fragment/app/b;->e:Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    iput-object v1, p0, La/e7;->N:La/k7;

    goto :goto_2

    :cond_6
    if-eqz p1, :cond_8

    invoke-interface {p1}, La/Gg;->getViewModelStore()La/Fg;

    move-result-object p1

    new-instance v0, Landroidx/lifecycle/q;

    sget-object v1, La/k7;->j:La/k7$a;

    invoke-direct {v0, p1, v1}, Landroidx/lifecycle/q;-><init>(La/Fg;Landroidx/lifecycle/q$b;)V

    const-class p1, La/k7;

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_7

    const-string v2, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Landroidx/lifecycle/q;->a(Ljava/lang/Class;Ljava/lang/String;)La/Dg;

    move-result-object p1

    check-cast p1, La/k7;

    iput-object p1, p0, La/e7;->N:La/k7;

    goto :goto_2

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Local and anonymous classes can not be ViewModels"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p1, La/k7;

    invoke-direct {p1, p2}, La/k7;-><init>(Z)V

    iput-object p1, p0, La/e7;->N:La/k7;

    :goto_2
    iget-object p1, p0, La/e7;->N:La/k7;

    iget-boolean v0, p0, La/e7;->G:Z

    if-nez v0, :cond_9

    iget-boolean v0, p0, La/e7;->H:Z

    if-eqz v0, :cond_a

    :cond_9
    const/4 p2, 0x1

    :cond_a
    iput-boolean p2, p1, La/k7;->i:Z

    iget-object p2, p0, La/e7;->c:La/A2;

    iput-object p1, p2, La/A2;->d:Ljava/lang/Object;

    iget-object p1, p0, La/e7;->v:La/X6$a;

    if-eqz p1, :cond_b

    if-nez p3, :cond_b

    invoke-interface {p1}, La/Ld;->getSavedStateRegistry()Landroidx/savedstate/a;

    move-result-object p1

    new-instance p2, La/B3;

    const/4 v0, 0x2

    invoke-direct {p2, v0, p0}, La/B3;-><init>(ILjava/lang/Object;)V

    const-string v0, "android:support:fragments"

    invoke-virtual {p1, v0, p2}, Landroidx/savedstate/a;->c(Ljava/lang/String;Landroidx/savedstate/a$b;)V

    invoke-virtual {p1, v0}, Landroidx/savedstate/a;->a(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_b

    invoke-virtual {p0, p1}, La/e7;->V(Landroid/os/Bundle;)V

    :cond_b
    iget-object p1, p0, La/e7;->v:La/X6$a;

    if-eqz p1, :cond_d

    invoke-interface {p1}, La/e0;->getActivityResultRegistry()Landroidx/activity/result/a;

    move-result-object p1

    if-eqz p3, :cond_c

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p3, Landroidx/fragment/app/b;->e:Ljava/lang/String;

    const-string v1, ":"

    invoke-static {p2, v0, v1}, La/z;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_3

    :cond_c
    const-string p2, ""

    :goto_3
    const-string v0, "FragmentManager:"

    invoke-static {v0, p2}, La/z;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "StartActivityForResult"

    invoke-static {p2, v0}, La/z;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, La/a0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-instance v2, La/g7;

    invoke-direct {v2, p0}, La/g7;-><init>(La/e7;)V

    invoke-virtual {p1, v0, v1, v2}, Landroidx/activity/result/a;->d(Ljava/lang/String;La/Y;La/X;)La/d0;

    move-result-object v0

    iput-object v0, p0, La/e7;->B:La/d0;

    const-string v0, "StartIntentSenderForResult"

    invoke-static {p2, v0}, La/z;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, La/e7$f;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-instance v2, La/h7;

    invoke-direct {v2, p0}, La/h7;-><init>(La/e7;)V

    invoke-virtual {p1, v0, v1, v2}, Landroidx/activity/result/a;->d(Ljava/lang/String;La/Y;La/X;)La/d0;

    move-result-object v0

    iput-object v0, p0, La/e7;->C:La/d0;

    const-string v0, "RequestPermissions"

    invoke-static {p2, v0}, La/z;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-instance v0, La/Z;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, La/d7;

    invoke-direct {v1, p0}, La/d7;-><init>(La/e7;)V

    invoke-virtual {p1, p2, v0, v1}, Landroidx/activity/result/a;->d(Ljava/lang/String;La/Y;La/X;)La/d0;

    move-result-object p1

    iput-object p1, p0, La/e7;->D:La/d0;

    :cond_d
    iget-object p1, p0, La/e7;->v:La/X6$a;

    if-eqz p1, :cond_e

    iget-object p2, p0, La/e7;->p:La/c7;

    invoke-interface {p1, p2}, La/Zb;->addOnConfigurationChangedListener(La/Q3;)V

    :cond_e
    iget-object p1, p0, La/e7;->v:La/X6$a;

    if-eqz p1, :cond_f

    iget-object p2, p0, La/e7;->q:La/c7;

    invoke-interface {p1, p2}, La/gc;->addOnTrimMemoryListener(La/Q3;)V

    :cond_f
    iget-object p1, p0, La/e7;->v:La/X6$a;

    if-eqz p1, :cond_10

    iget-object p2, p0, La/e7;->r:La/c7;

    invoke-interface {p1, p2}, La/bc;->addOnMultiWindowModeChangedListener(La/Q3;)V

    :cond_10
    iget-object p1, p0, La/e7;->v:La/X6$a;

    if-eqz p1, :cond_11

    iget-object p2, p0, La/e7;->s:La/c7;

    invoke-interface {p1, p2}, La/cc;->addOnPictureInPictureModeChangedListener(La/Q3;)V

    :cond_11
    iget-object p1, p0, La/e7;->v:La/X6$a;

    if-eqz p1, :cond_12

    if-nez p3, :cond_12

    iget-object p2, p0, La/e7;->t:La/e7$b;

    invoke-interface {p1, p2}, La/Xa;->addMenuProvider(La/gb;)V

    :cond_12
    return-void

    :cond_13
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Already attached"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b0(Landroidx/fragment/app/b;)V
    .locals 5

    invoke-virtual {p0, p1}, La/e7;->F(Landroidx/fragment/app/b;)Landroid/view/ViewGroup;

    move-result-object v0

    if-eqz v0, :cond_7

    iget-object v1, p1, Landroidx/fragment/app/b;->J:Landroidx/fragment/app/b$d;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    iget v3, v1, Landroidx/fragment/app/b$d;->b:I

    :goto_0
    if-nez v1, :cond_1

    move v4, v2

    goto :goto_1

    :cond_1
    iget v4, v1, Landroidx/fragment/app/b$d;->c:I

    :goto_1
    add-int/2addr v4, v3

    if-nez v1, :cond_2

    move v3, v2

    goto :goto_2

    :cond_2
    iget v3, v1, Landroidx/fragment/app/b$d;->d:I

    :goto_2
    add-int/2addr v3, v4

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    iget v1, v1, Landroidx/fragment/app/b$d;->e:I

    :goto_3
    add-int/2addr v1, v3

    if-lez v1, :cond_7

    sget v1, Landroidx/fragment/R$id;->visible_removing_fragment_view_tag:I

    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_4

    sget v1, Landroidx/fragment/R$id;->visible_removing_fragment_view_tag:I

    invoke-virtual {v0, v1, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_4
    sget v1, Landroidx/fragment/R$id;->visible_removing_fragment_view_tag:I

    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/b;

    iget-object p1, p1, Landroidx/fragment/app/b;->J:Landroidx/fragment/app/b$d;

    if-nez p1, :cond_5

    goto :goto_4

    :cond_5
    iget-boolean v2, p1, Landroidx/fragment/app/b$d;->a:Z

    :goto_4
    iget-object p1, v0, Landroidx/fragment/app/b;->J:Landroidx/fragment/app/b$d;

    if-nez p1, :cond_6

    goto :goto_5

    :cond_6
    invoke-virtual {v0}, Landroidx/fragment/app/b;->b()Landroidx/fragment/app/b$d;

    move-result-object p1

    iput-boolean v2, p1, Landroidx/fragment/app/b$d;->a:Z

    :cond_7
    :goto_5
    return-void
.end method

.method public final c(Landroidx/fragment/app/b;)V
    .locals 4

    const/4 v0, 0x2

    invoke-static {v0}, La/e7;->J(I)Z

    move-result v1

    const-string v2, "FragmentManager"

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "attach: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-boolean v1, p1, Landroidx/fragment/app/b;->B:Z

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    iput-boolean v1, p1, Landroidx/fragment/app/b;->B:Z

    iget-boolean v1, p1, Landroidx/fragment/app/b;->k:Z

    if-nez v1, :cond_2

    iget-object v1, p0, La/e7;->c:La/A2;

    invoke-virtual {v1, p1}, La/A2;->a(Landroidx/fragment/app/b;)V

    invoke-static {v0}, La/e7;->J(I)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "add from attach: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    invoke-static {p1}, La/e7;->K(Landroidx/fragment/app/b;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    iput-boolean p1, p0, La/e7;->F:Z

    :cond_2
    return-void
.end method

.method public final d()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, La/e7;->b:Z

    iget-object v0, p0, La/e7;->L:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, La/e7;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final d0()V
    .locals 4

    iget-object v0, p0, La/e7;->c:La/A2;

    invoke-virtual {v0}, La/A2;->e()Ljava/util/ArrayList;

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

    check-cast v1, Landroidx/fragment/app/e;

    iget-object v2, v1, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/b;

    iget-boolean v3, v2, Landroidx/fragment/app/b;->H:Z

    if-eqz v3, :cond_0

    iget-boolean v3, p0, La/e7;->b:Z

    if-eqz v3, :cond_1

    const/4 v1, 0x1

    iput-boolean v1, p0, La/e7;->J:Z

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    iput-boolean v3, v2, Landroidx/fragment/app/b;->H:Z

    invoke-virtual {v1}, Landroidx/fragment/app/e;->k()V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final e()Ljava/util/HashSet;
    .locals 5

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iget-object v1, p0, La/e7;->c:La/A2;

    invoke-virtual {v1}, La/A2;->e()Ljava/util/ArrayList;

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

    check-cast v2, Landroidx/fragment/app/e;

    iget-object v2, v2, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/b;

    iget-object v2, v2, Landroidx/fragment/app/b;->F:Landroid/view/ViewGroup;

    if-eqz v2, :cond_0

    invoke-virtual {p0}, La/e7;->H()La/qe;

    move-result-object v3

    const-string v4, "factory"

    invoke-static {v3, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget v3, Landroidx/fragment/R$id;->special_effects_controller_view_tag:I

    invoke-virtual {v2, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Landroidx/fragment/app/f;

    if-eqz v4, :cond_1

    check-cast v3, Landroidx/fragment/app/f;

    goto :goto_1

    :cond_1
    new-instance v3, Landroidx/fragment/app/a;

    invoke-direct {v3, v2}, Landroidx/fragment/app/f;-><init>(Landroid/view/ViewGroup;)V

    sget v4, Landroidx/fragment/R$id;->special_effects_controller_view_tag:I

    invoke-virtual {v2, v4, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :goto_1
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public final e0(Ljava/lang/IllegalStateException;)V
    .locals 7

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "Activity state:"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, La/M9;

    invoke-direct {v0}, La/M9;-><init>()V

    new-instance v2, Ljava/io/PrintWriter;

    invoke-direct {v2, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    iget-object v0, p0, La/e7;->v:La/X6$a;

    const-string v3, "Failed dumping state"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v6, "  "

    if-eqz v0, :cond_0

    :try_start_0
    new-array v4, v4, [Ljava/lang/String;

    iget-object v0, v0, La/X6$a;->e:La/X6;

    invoke-virtual {v0, v6, v5, v2, v4}, La/X6;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {v1, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :cond_0
    :try_start_1
    new-array v0, v4, [Ljava/lang/String;

    invoke-virtual {p0, v6, v5, v2, v0}, La/e7;->v(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    invoke-static {v1, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    throw p1
.end method

.method public final f(Ljava/util/ArrayList;II)Ljava/util/HashSet;
    .locals 3

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    :goto_0
    if-ge p2, p3, :cond_2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/S1;

    iget-object v1, v1, La/p7;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/p7$a;

    iget-object v2, v2, La/p7$a;->b:Landroidx/fragment/app/b;

    if-eqz v2, :cond_0

    iget-object v2, v2, Landroidx/fragment/app/b;->F:Landroid/view/ViewGroup;

    if-eqz v2, :cond_0

    invoke-static {v2, p0}, Landroidx/fragment/app/f;->i(Landroid/view/ViewGroup;La/e7;)Landroidx/fragment/app/f;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public final f0()V
    .locals 5

    const-string v0, "FragmentManager "

    iget-object v1, p0, La/e7;->a:Ljava/util/ArrayList;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, La/e7;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    const/4 v3, 0x3

    const/4 v4, 0x1

    if-nez v2, :cond_2

    iget-object v2, p0, La/e7;->i:La/e7$a;

    iput-boolean v4, v2, La/Ub;->a:Z

    iget-object v2, v2, La/Ub;->c:La/S7;

    if-eqz v2, :cond_0

    invoke-interface {v2}, La/s7;->a()Ljava/lang/Object;

    :cond_0
    invoke-static {v3}, La/e7;->J(I)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "FragmentManager"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " enabling OnBackPressedCallback, caused by non-empty pending actions"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_1
    :goto_0
    monitor-exit v1

    return-void

    :cond_2
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, La/e7;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, La/e7;->h:La/S1;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    move v1, v4

    goto :goto_1

    :cond_3
    move v1, v2

    :goto_1
    add-int/2addr v0, v1

    if-lez v0, :cond_4

    iget-object v0, p0, La/e7;->x:Landroidx/fragment/app/b;

    invoke-static {v0}, La/e7;->N(Landroidx/fragment/app/b;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    move v4, v2

    :goto_2
    invoke-static {v3}, La/e7;->J(I)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "OnBackPressedCallback for FragmentManager "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " enabled state is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_5
    iget-object v0, p0, La/e7;->i:La/e7$a;

    iput-boolean v4, v0, La/Ub;->a:Z

    iget-object v0, v0, La/Ub;->c:La/S7;

    if-eqz v0, :cond_6

    invoke-interface {v0}, La/s7;->a()Ljava/lang/Object;

    :cond_6
    return-void

    :goto_3
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final g(Landroidx/fragment/app/b;)Landroidx/fragment/app/e;
    .locals 3

    iget-object v0, p1, Landroidx/fragment/app/b;->e:Ljava/lang/String;

    iget-object v1, p0, La/e7;->c:La/A2;

    iget-object v2, v1, La/A2;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/e;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Landroidx/fragment/app/e;

    iget-object v2, p0, La/e7;->n:La/b7;

    invoke-direct {v0, v2, v1, p1}, Landroidx/fragment/app/e;-><init>(La/b7;La/A2;Landroidx/fragment/app/b;)V

    iget-object p1, p0, La/e7;->v:La/X6$a;

    iget-object p1, p1, La/Z6;->b:La/X6;

    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/fragment/app/e;->m(Ljava/lang/ClassLoader;)V

    iget p1, p0, La/e7;->u:I

    iput p1, v0, Landroidx/fragment/app/e;->e:I

    return-object v0
.end method

.method public final h(Landroidx/fragment/app/b;)V
    .locals 4

    const/4 v0, 0x2

    invoke-static {v0}, La/e7;->J(I)Z

    move-result v1

    const-string v2, "FragmentManager"

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "detach: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-boolean v1, p1, Landroidx/fragment/app/b;->B:Z

    if-nez v1, :cond_3

    const/4 v1, 0x1

    iput-boolean v1, p1, Landroidx/fragment/app/b;->B:Z

    iget-boolean v3, p1, Landroidx/fragment/app/b;->k:Z

    if-eqz v3, :cond_3

    invoke-static {v0}, La/e7;->J(I)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "remove from detach: "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    iget-object v0, p0, La/e7;->c:La/A2;

    iget-object v2, v0, La/A2;->a:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    monitor-enter v2

    :try_start_0
    iget-object v0, v0, La/A2;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    iput-boolean v0, p1, Landroidx/fragment/app/b;->k:Z

    invoke-static {p1}, La/e7;->K(Landroidx/fragment/app/b;)Z

    move-result v0

    if-eqz v0, :cond_2

    iput-boolean v1, p0, La/e7;->F:Z

    :cond_2
    invoke-virtual {p0, p1}, La/e7;->b0(Landroidx/fragment/app/b;)V

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

.method public final i(Z)V
    .locals 3

    if-eqz p1, :cond_1

    iget-object v0, p0, La/e7;->v:La/X6$a;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, La/e7;->e0(Ljava/lang/IllegalStateException;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, La/e7;->c:La/A2;

    invoke-virtual {v0}, La/A2;->g()Ljava/util/List;

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

    check-cast v1, Landroidx/fragment/app/b;

    if-eqz v1, :cond_2

    const/4 v2, 0x1

    iput-boolean v2, v1, Landroidx/fragment/app/b;->E:Z

    if-eqz p1, :cond_2

    iget-object v1, v1, Landroidx/fragment/app/b;->v:La/i7;

    invoke-virtual {v1, v2}, La/e7;->i(Z)V

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final j()Z
    .locals 4

    iget v0, p0, La/e7;->u:I

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, La/e7;->c:La/A2;

    invoke-virtual {v0}, La/A2;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/b;

    if-eqz v2, :cond_1

    iget-boolean v3, v2, Landroidx/fragment/app/b;->A:Z

    if-nez v3, :cond_2

    iget-object v2, v2, Landroidx/fragment/app/b;->v:La/i7;

    invoke-virtual {v2}, La/e7;->j()Z

    move-result v2

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_1

    return v1

    :cond_3
    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method public final k()Z
    .locals 7

    iget v0, p0, La/e7;->u:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge v0, v2, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, La/e7;->c:La/A2;

    invoke-virtual {v0}, La/A2;->g()Ljava/util/List;

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

    check-cast v5, Landroidx/fragment/app/b;

    if-eqz v5, :cond_1

    invoke-static {v5}, La/e7;->M(Landroidx/fragment/app/b;)Z

    move-result v6

    if-eqz v6, :cond_1

    iget-boolean v6, v5, Landroidx/fragment/app/b;->A:Z

    if-nez v6, :cond_2

    iget-object v6, v5, Landroidx/fragment/app/b;->v:La/i7;

    invoke-virtual {v6}, La/e7;->k()Z

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
    iget-object v0, p0, La/e7;->e:Ljava/util/ArrayList;

    if-eqz v0, :cond_7

    :goto_2
    iget-object v0, p0, La/e7;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_7

    iget-object v0, p0, La/e7;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/b;

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
    iput-object v3, p0, La/e7;->e:Ljava/util/ArrayList;

    return v4
.end method

.method public final l()V
    .locals 6

    const/4 v0, 0x1

    iput-boolean v0, p0, La/e7;->I:Z

    invoke-virtual {p0, v0}, La/e7;->z(Z)Z

    invoke-virtual {p0}, La/e7;->w()V

    iget-object v1, p0, La/e7;->v:La/X6$a;

    iget-object v2, p0, La/e7;->c:La/A2;

    if-eqz v1, :cond_0

    iget-object v0, v2, La/A2;->d:Ljava/lang/Object;

    check-cast v0, La/k7;

    iget-boolean v0, v0, La/k7;->h:Z

    goto :goto_0

    :cond_0
    iget-object v1, v1, La/Z6;->b:La/X6;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result v1

    xor-int/2addr v0, v1

    :cond_1
    :goto_0
    if-eqz v0, :cond_3

    iget-object v0, p0, La/e7;->k:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/U1;

    iget-object v1, v1, La/U1;->a:Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-object v4, v2, La/A2;->d:Ljava/lang/Object;

    check-cast v4, La/k7;

    const/4 v5, 0x0

    invoke-virtual {v4, v3, v5}, La/k7;->d(Ljava/lang/String;Z)V

    goto :goto_1

    :cond_3
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, La/e7;->u(I)V

    iget-object v0, p0, La/e7;->v:La/X6$a;

    if-eqz v0, :cond_4

    iget-object v1, p0, La/e7;->q:La/c7;

    invoke-interface {v0, v1}, La/gc;->removeOnTrimMemoryListener(La/Q3;)V

    :cond_4
    iget-object v0, p0, La/e7;->v:La/X6$a;

    if-eqz v0, :cond_5

    iget-object v1, p0, La/e7;->p:La/c7;

    invoke-interface {v0, v1}, La/Zb;->removeOnConfigurationChangedListener(La/Q3;)V

    :cond_5
    iget-object v0, p0, La/e7;->v:La/X6$a;

    if-eqz v0, :cond_6

    iget-object v1, p0, La/e7;->r:La/c7;

    invoke-interface {v0, v1}, La/bc;->removeOnMultiWindowModeChangedListener(La/Q3;)V

    :cond_6
    iget-object v0, p0, La/e7;->v:La/X6$a;

    if-eqz v0, :cond_7

    iget-object v1, p0, La/e7;->s:La/c7;

    invoke-interface {v0, v1}, La/cc;->removeOnPictureInPictureModeChangedListener(La/Q3;)V

    :cond_7
    iget-object v0, p0, La/e7;->v:La/X6$a;

    if-eqz v0, :cond_8

    iget-object v1, p0, La/e7;->x:Landroidx/fragment/app/b;

    if-nez v1, :cond_8

    iget-object v1, p0, La/e7;->t:La/e7$b;

    invoke-interface {v0, v1}, La/Xa;->removeMenuProvider(La/gb;)V

    :cond_8
    const/4 v0, 0x0

    iput-object v0, p0, La/e7;->v:La/X6$a;

    iput-object v0, p0, La/e7;->w:La/a2;

    iput-object v0, p0, La/e7;->x:Landroidx/fragment/app/b;

    iget-object v1, p0, La/e7;->g:Landroidx/activity/OnBackPressedDispatcher;

    if-eqz v1, :cond_a

    iget-object v1, p0, La/e7;->i:La/e7$a;

    iget-object v1, v1, La/Ub;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/K2;

    invoke-interface {v2}, La/K2;->cancel()V

    goto :goto_2

    :cond_9
    iput-object v0, p0, La/e7;->g:Landroidx/activity/OnBackPressedDispatcher;

    :cond_a
    iget-object v0, p0, La/e7;->B:La/d0;

    if-eqz v0, :cond_b

    iget-object v1, v0, La/d0;->c:Landroidx/activity/result/a;

    iget-object v0, v0, La/d0;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Landroidx/activity/result/a;->f(Ljava/lang/String;)V

    iget-object v0, p0, La/e7;->C:La/d0;

    iget-object v1, v0, La/d0;->c:Landroidx/activity/result/a;

    iget-object v0, v0, La/d0;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Landroidx/activity/result/a;->f(Ljava/lang/String;)V

    iget-object v0, p0, La/e7;->D:La/d0;

    iget-object v1, v0, La/d0;->c:Landroidx/activity/result/a;

    iget-object v0, v0, La/d0;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Landroidx/activity/result/a;->f(Ljava/lang/String;)V

    :cond_b
    return-void
.end method

.method public final m(Z)V
    .locals 3

    if-eqz p1, :cond_1

    iget-object v0, p0, La/e7;->v:La/X6$a;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, La/e7;->e0(Ljava/lang/IllegalStateException;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, La/e7;->c:La/A2;

    invoke-virtual {v0}, La/A2;->g()Ljava/util/List;

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

    check-cast v1, Landroidx/fragment/app/b;

    if-eqz v1, :cond_2

    const/4 v2, 0x1

    iput-boolean v2, v1, Landroidx/fragment/app/b;->E:Z

    if-eqz p1, :cond_2

    iget-object v1, v1, Landroidx/fragment/app/b;->v:La/i7;

    invoke-virtual {v1, v2}, La/e7;->m(Z)V

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final n(Z)V
    .locals 3

    if-eqz p1, :cond_1

    iget-object v0, p0, La/e7;->v:La/X6$a;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, La/e7;->e0(Ljava/lang/IllegalStateException;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, La/e7;->c:La/A2;

    invoke-virtual {v0}, La/A2;->g()Ljava/util/List;

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

    check-cast v1, Landroidx/fragment/app/b;

    if-eqz v1, :cond_2

    if-eqz p1, :cond_2

    iget-object v1, v1, Landroidx/fragment/app/b;->v:La/i7;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, La/e7;->n(Z)V

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final o()V
    .locals 2

    iget-object v0, p0, La/e7;->c:La/A2;

    invoke-virtual {v0}, La/A2;->f()Ljava/util/ArrayList;

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

    check-cast v1, Landroidx/fragment/app/b;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/fragment/app/b;->j()Z

    iget-object v1, v1, Landroidx/fragment/app/b;->v:La/i7;

    invoke-virtual {v1}, La/e7;->o()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final p()Z
    .locals 5

    iget v0, p0, La/e7;->u:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge v0, v2, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, La/e7;->c:La/A2;

    invoke-virtual {v0}, La/A2;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/b;

    if-eqz v3, :cond_1

    iget-boolean v4, v3, Landroidx/fragment/app/b;->A:Z

    if-nez v4, :cond_2

    iget-object v3, v3, Landroidx/fragment/app/b;->v:La/i7;

    invoke-virtual {v3}, La/e7;->p()Z

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

.method public final q()V
    .locals 3

    iget v0, p0, La/e7;->u:I

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, La/e7;->c:La/A2;

    invoke-virtual {v0}, La/A2;->g()Ljava/util/List;

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

    check-cast v1, Landroidx/fragment/app/b;

    if-eqz v1, :cond_1

    iget-boolean v2, v1, Landroidx/fragment/app/b;->A:Z

    if-nez v2, :cond_1

    iget-object v1, v1, Landroidx/fragment/app/b;->v:La/i7;

    invoke-virtual {v1}, La/e7;->q()V

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public final r(Landroidx/fragment/app/b;)V
    .locals 2

    if-eqz p1, :cond_1

    iget-object v0, p1, Landroidx/fragment/app/b;->e:Ljava/lang/String;

    iget-object v1, p0, La/e7;->c:La/A2;

    invoke-virtual {v1, v0}, La/A2;->c(Ljava/lang/String;)Landroidx/fragment/app/b;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Landroidx/fragment/app/b;->t:La/e7;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, La/e7;->N(Landroidx/fragment/app/b;)Z

    move-result v0

    iget-object v1, p1, Landroidx/fragment/app/b;->j:Ljava/lang/Boolean;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eq v1, v0, :cond_1

    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p1, Landroidx/fragment/app/b;->j:Ljava/lang/Boolean;

    iget-object p1, p1, Landroidx/fragment/app/b;->v:La/i7;

    invoke-virtual {p1}, La/e7;->f0()V

    iget-object v0, p1, La/e7;->y:Landroidx/fragment/app/b;

    invoke-virtual {p1, v0}, La/e7;->r(Landroidx/fragment/app/b;)V

    :cond_1
    return-void
.end method

.method public final s(Z)V
    .locals 3

    if-eqz p1, :cond_1

    iget-object v0, p0, La/e7;->v:La/X6$a;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, La/e7;->e0(Ljava/lang/IllegalStateException;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, La/e7;->c:La/A2;

    invoke-virtual {v0}, La/A2;->g()Ljava/util/List;

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

    check-cast v1, Landroidx/fragment/app/b;

    if-eqz v1, :cond_2

    if-eqz p1, :cond_2

    iget-object v1, v1, Landroidx/fragment/app/b;->v:La/i7;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, La/e7;->s(Z)V

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final t()Z
    .locals 6

    iget v0, p0, La/e7;->u:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge v0, v2, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, La/e7;->c:La/A2;

    invoke-virtual {v0}, La/A2;->g()Ljava/util/List;

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

    check-cast v4, Landroidx/fragment/app/b;

    if-eqz v4, :cond_1

    invoke-static {v4}, La/e7;->M(Landroidx/fragment/app/b;)Z

    move-result v5

    if-eqz v5, :cond_1

    iget-boolean v5, v4, Landroidx/fragment/app/b;->A:Z

    if-nez v5, :cond_2

    iget-object v4, v4, Landroidx/fragment/app/b;->v:La/i7;

    invoke-virtual {v4}, La/e7;->t()Z

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

    iget-object v1, p0, La/e7;->x:Landroidx/fragment/app/b;

    const-string v2, "}"

    const-string v3, "{"

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, La/e7;->x:Landroidx/fragment/app/b;

    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    iget-object v1, p0, La/e7;->v:La/X6$a;

    if-eqz v1, :cond_1

    const-class v1, La/X6$a;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, La/e7;->v:La/X6$a;

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

.method public final u(I)V
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    iput-boolean v0, p0, La/e7;->b:Z

    iget-object v2, p0, La/e7;->c:La/A2;

    iget-object v2, v2, La/A2;->b:Ljava/lang/Object;

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

    check-cast v3, Landroidx/fragment/app/e;

    if-eqz v3, :cond_0

    iput p1, v3, Landroidx/fragment/app/e;->e:I

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1, v1}, La/e7;->O(IZ)V

    invoke-virtual {p0}, La/e7;->e()Ljava/util/HashSet;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/f;

    invoke-virtual {v2}, Landroidx/fragment/app/f;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    iput-boolean v1, p0, La/e7;->b:Z

    invoke-virtual {p0, v0}, La/e7;->z(Z)Z

    return-void

    :goto_2
    iput-boolean v1, p0, La/e7;->b:Z

    throw p1
.end method

.method public final v(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 8

    const-string v0, "    "

    invoke-static {p1, v0}, La/z;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, La/e7;->c:La/A2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "    "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v1, La/A2;->b:Ljava/lang/Object;

    check-cast v3, Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->isEmpty()Z

    move-result v4

    const/4 v5, 0x0

    if-nez v4, :cond_1b

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v4, "Active Fragments:"

    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/fragment/app/e;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    if-eqz v4, :cond_1a

    iget-object v4, v4, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/b;

    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mFragmentId=#"

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v6, v4, Landroidx/fragment/app/b;->x:I

    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, " mContainerId=#"

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v6, v4, Landroidx/fragment/app/b;->y:I

    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, " mTag="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Landroidx/fragment/app/b;->z:Ljava/lang/String;

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mState="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v6, v4, Landroidx/fragment/app/b;->a:I

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(I)V

    const-string v6, " mWho="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Landroidx/fragment/app/b;->e:Ljava/lang/String;

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, " mBackStackNesting="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v6, v4, Landroidx/fragment/app/b;->s:I

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mAdded="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v6, v4, Landroidx/fragment/app/b;->k:Z

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    const-string v6, " mRemoving="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v6, v4, Landroidx/fragment/app/b;->l:Z

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    const-string v6, " mFromLayout="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v6, v4, Landroidx/fragment/app/b;->n:Z

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    const-string v6, " mInLayout="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v6, v4, Landroidx/fragment/app/b;->o:Z

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Z)V

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mHidden="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v6, v4, Landroidx/fragment/app/b;->A:Z

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    const-string v6, " mDetached="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v6, v4, Landroidx/fragment/app/b;->B:Z

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    const-string v6, " mMenuVisible="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v6, v4, Landroidx/fragment/app/b;->D:Z

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    const-string v6, " mHasMenu="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Z)V

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mRetainInstance="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v6, v4, Landroidx/fragment/app/b;->C:Z

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    const-string v6, " mUserVisibleHint="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v6, v4, Landroidx/fragment/app/b;->I:Z

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Z)V

    iget-object v6, v4, Landroidx/fragment/app/b;->t:La/e7;

    if-eqz v6, :cond_0

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mFragmentManager="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Landroidx/fragment/app/b;->t:La/e7;

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_0
    iget-object v6, v4, Landroidx/fragment/app/b;->u:La/X6$a;

    if-eqz v6, :cond_1

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mHost="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Landroidx/fragment/app/b;->u:La/X6$a;

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_1
    iget-object v6, v4, Landroidx/fragment/app/b;->w:Landroidx/fragment/app/b;

    if-eqz v6, :cond_2

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mParentFragment="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Landroidx/fragment/app/b;->w:Landroidx/fragment/app/b;

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_2
    iget-object v6, v4, Landroidx/fragment/app/b;->f:Landroid/os/Bundle;

    if-eqz v6, :cond_3

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mArguments="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Landroidx/fragment/app/b;->f:Landroid/os/Bundle;

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_3
    iget-object v6, v4, Landroidx/fragment/app/b;->b:Landroid/os/Bundle;

    if-eqz v6, :cond_4

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mSavedFragmentState="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Landroidx/fragment/app/b;->b:Landroid/os/Bundle;

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_4
    iget-object v6, v4, Landroidx/fragment/app/b;->c:Landroid/util/SparseArray;

    if-eqz v6, :cond_5

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mSavedViewState="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Landroidx/fragment/app/b;->c:Landroid/util/SparseArray;

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_5
    iget-object v6, v4, Landroidx/fragment/app/b;->d:Landroid/os/Bundle;

    if-eqz v6, :cond_6

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mSavedViewRegistryState="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Landroidx/fragment/app/b;->d:Landroid/os/Bundle;

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_6
    iget-object v6, v4, Landroidx/fragment/app/b;->g:Landroidx/fragment/app/b;

    if-eqz v6, :cond_7

    goto :goto_1

    :cond_7
    iget-object v6, v4, Landroidx/fragment/app/b;->t:La/e7;

    if-eqz v6, :cond_8

    iget-object v7, v4, Landroidx/fragment/app/b;->h:Ljava/lang/String;

    if-eqz v7, :cond_8

    iget-object v6, v6, La/e7;->c:La/A2;

    invoke-virtual {v6, v7}, La/A2;->c(Ljava/lang/String;)Landroidx/fragment/app/b;

    move-result-object v6

    goto :goto_1

    :cond_8
    const/4 v6, 0x0

    :goto_1
    if-eqz v6, :cond_9

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v7, "mTarget="

    invoke-virtual {p3, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    const-string v6, " mTargetRequestCode="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v6, v4, Landroidx/fragment/app/b;->i:I

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    :cond_9
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mPopDirection="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Landroidx/fragment/app/b;->J:Landroidx/fragment/app/b$d;

    if-nez v6, :cond_a

    move v6, v5

    goto :goto_2

    :cond_a
    iget-boolean v6, v6, Landroidx/fragment/app/b$d;->a:Z

    :goto_2
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Z)V

    iget-object v6, v4, Landroidx/fragment/app/b;->J:Landroidx/fragment/app/b$d;

    if-nez v6, :cond_b

    move v6, v5

    goto :goto_3

    :cond_b
    iget v6, v6, Landroidx/fragment/app/b$d;->b:I

    :goto_3
    if-eqz v6, :cond_d

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "getEnterAnim="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Landroidx/fragment/app/b;->J:Landroidx/fragment/app/b$d;

    if-nez v6, :cond_c

    move v6, v5

    goto :goto_4

    :cond_c
    iget v6, v6, Landroidx/fragment/app/b$d;->b:I

    :goto_4
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    :cond_d
    iget-object v6, v4, Landroidx/fragment/app/b;->J:Landroidx/fragment/app/b$d;

    if-nez v6, :cond_e

    move v6, v5

    goto :goto_5

    :cond_e
    iget v6, v6, Landroidx/fragment/app/b$d;->c:I

    :goto_5
    if-eqz v6, :cond_10

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "getExitAnim="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Landroidx/fragment/app/b;->J:Landroidx/fragment/app/b$d;

    if-nez v6, :cond_f

    move v6, v5

    goto :goto_6

    :cond_f
    iget v6, v6, Landroidx/fragment/app/b$d;->c:I

    :goto_6
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    :cond_10
    iget-object v6, v4, Landroidx/fragment/app/b;->J:Landroidx/fragment/app/b$d;

    if-nez v6, :cond_11

    move v6, v5

    goto :goto_7

    :cond_11
    iget v6, v6, Landroidx/fragment/app/b$d;->d:I

    :goto_7
    if-eqz v6, :cond_13

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "getPopEnterAnim="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Landroidx/fragment/app/b;->J:Landroidx/fragment/app/b$d;

    if-nez v6, :cond_12

    move v6, v5

    goto :goto_8

    :cond_12
    iget v6, v6, Landroidx/fragment/app/b$d;->d:I

    :goto_8
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    :cond_13
    iget-object v6, v4, Landroidx/fragment/app/b;->J:Landroidx/fragment/app/b$d;

    if-nez v6, :cond_14

    move v6, v5

    goto :goto_9

    :cond_14
    iget v6, v6, Landroidx/fragment/app/b$d;->e:I

    :goto_9
    if-eqz v6, :cond_16

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "getPopExitAnim="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Landroidx/fragment/app/b;->J:Landroidx/fragment/app/b$d;

    if-nez v6, :cond_15

    move v6, v5

    goto :goto_a

    :cond_15
    iget v6, v6, Landroidx/fragment/app/b$d;->e:I

    :goto_a
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    :cond_16
    iget-object v6, v4, Landroidx/fragment/app/b;->F:Landroid/view/ViewGroup;

    if-eqz v6, :cond_17

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mContainer="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Landroidx/fragment/app/b;->F:Landroid/view/ViewGroup;

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_17
    iget-object v6, v4, Landroidx/fragment/app/b;->G:Landroid/view/View;

    if-eqz v6, :cond_18

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mView="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Landroidx/fragment/app/b;->G:Landroid/view/View;

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_18
    invoke-virtual {v4}, Landroidx/fragment/app/b;->d()Landroid/content/Context;

    move-result-object v6

    if-eqz v6, :cond_19

    new-instance v6, La/I9;

    invoke-interface {v4}, La/Gg;->getViewModelStore()La/Fg;

    move-result-object v7

    invoke-direct {v6, v4, v7}, La/I9;-><init>(La/y9;La/Fg;)V

    invoke-virtual {v6, v2, p3}, La/I9;->a(Ljava/lang/String;Ljava/io/PrintWriter;)V

    :cond_19
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Child "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v7, v4, Landroidx/fragment/app/b;->v:La/i7;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, ":"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    iget-object v4, v4, Landroidx/fragment/app/b;->v:La/i7;

    const-string v6, "  "

    invoke-static {v2, v6}, La/z;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6, p2, p3, p4}, La/e7;->v(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_1a
    const-string v4, "null"

    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_1b
    iget-object p2, v1, La/A2;->a:Ljava/lang/Object;

    check-cast p2, Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p4

    if-lez p4, :cond_1c

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "Added Fragments:"

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move v1, v5

    :goto_b
    if-ge v1, p4, :cond_1c

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/b;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "  #"

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    const-string v3, ": "

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v2}, Landroidx/fragment/app/b;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_b

    :cond_1c
    iget-object p2, p0, La/e7;->e:Ljava/util/ArrayList;

    if-eqz p2, :cond_1d

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-lez p2, :cond_1d

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p4, "Fragments Created Menus:"

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move p4, v5

    :goto_c
    if-ge p4, p2, :cond_1d

    iget-object v1, p0, La/e7;->e:Ljava/util/ArrayList;

    invoke-virtual {v1, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/b;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v2, "  #"

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(I)V

    const-string v2, ": "

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v1}, Landroidx/fragment/app/b;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    add-int/lit8 p4, p4, 0x1

    goto :goto_c

    :cond_1d
    iget-object p2, p0, La/e7;->d:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-lez p2, :cond_1e

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p4, "Back Stack:"

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move p4, v5

    :goto_d
    if-ge p4, p2, :cond_1e

    iget-object v1, p0, La/e7;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/S1;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v2, "  #"

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(I)V

    const-string v2, ": "

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v1}, La/S1;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-virtual {v1, v0, p3, v2}, La/S1;->f(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    add-int/lit8 p4, p4, 0x1

    goto :goto_d

    :cond_1e
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p4, "Back Stack Index: "

    invoke-direct {p2, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p4, p0, La/e7;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p4}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p4

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    iget-object p2, p0, La/e7;->a:Ljava/util/ArrayList;

    monitor-enter p2

    :try_start_0
    iget-object p4, p0, La/e7;->a:Ljava/util/ArrayList;

    invoke-virtual {p4}, Ljava/util/ArrayList;->size()I

    move-result p4

    if-lez p4, :cond_1f

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Pending Actions:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :goto_e
    if-ge v5, p4, :cond_1f

    iget-object v0, p0, La/e7;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/e7$i;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "  #"

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(I)V

    const-string v1, ": "

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_e

    :catchall_0
    move-exception p1

    goto :goto_f

    :cond_1f
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "FragmentManager misc state:"

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "  mHost="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, La/e7;->v:La/X6$a;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "  mContainer="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, La/e7;->w:La/a2;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    iget-object p2, p0, La/e7;->x:Landroidx/fragment/app/b;

    if-eqz p2, :cond_20

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "  mParent="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, La/e7;->x:Landroidx/fragment/app/b;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_20
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "  mCurState="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget p2, p0, La/e7;->u:I

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(I)V

    const-string p2, " mStateSaved="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean p2, p0, La/e7;->G:Z

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    const-string p2, " mStopped="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean p2, p0, La/e7;->H:Z

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    const-string p2, " mDestroyed="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean p2, p0, La/e7;->I:Z

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Z)V

    iget-boolean p2, p0, La/e7;->F:Z

    if-eqz p2, :cond_21

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p1, "  mNeedMenuInvalidate="

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean p1, p0, La/e7;->F:Z

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->println(Z)V

    :cond_21
    return-void

    :goto_f
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final w()V
    .locals 2

    invoke-virtual {p0}, La/e7;->e()Ljava/util/HashSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/f;

    invoke-virtual {v1}, Landroidx/fragment/app/f;->h()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final x(La/e7$i;Z)V
    .locals 2

    if-nez p2, :cond_3

    iget-object v0, p0, La/e7;->v:La/X6$a;

    if-nez v0, :cond_1

    iget-boolean p1, p0, La/e7;->I:Z

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
    iget-boolean v0, p0, La/e7;->G:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, La/e7;->H:Z

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Can not perform this action after onSaveInstanceState"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_0
    iget-object v0, p0, La/e7;->a:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, La/e7;->v:La/X6$a;

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
    iget-object p2, p0, La/e7;->a:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, La/e7;->X()V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final y(Z)V
    .locals 2

    iget-boolean v0, p0, La/e7;->b:Z

    if-nez v0, :cond_6

    iget-object v0, p0, La/e7;->v:La/X6$a;

    if-nez v0, :cond_1

    iget-boolean p1, p0, La/e7;->I:Z

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

    iget-object v1, p0, La/e7;->v:La/X6$a;

    iget-object v1, v1, La/Z6;->c:Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_5

    if-nez p1, :cond_3

    iget-boolean p1, p0, La/e7;->G:Z

    if-nez p1, :cond_2

    iget-boolean p1, p0, La/e7;->H:Z

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Can not perform this action after onSaveInstanceState"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_0
    iget-object p1, p0, La/e7;->K:Ljava/util/ArrayList;

    if-nez p1, :cond_4

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, La/e7;->K:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, La/e7;->L:Ljava/util/ArrayList;

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

.method public final z(Z)Z
    .locals 8

    invoke-virtual {p0, p1}, La/e7;->y(Z)V

    const/4 p1, 0x0

    move v0, p1

    :goto_0
    iget-object v1, p0, La/e7;->K:Ljava/util/ArrayList;

    iget-object v2, p0, La/e7;->L:Ljava/util/ArrayList;

    iget-object v3, p0, La/e7;->a:Ljava/util/ArrayList;

    monitor-enter v3

    :try_start_0
    iget-object v4, p0, La/e7;->a:Ljava/util/ArrayList;

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
    iget-object v4, p0, La/e7;->a:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    move v5, p1

    move v6, v5

    :goto_1
    if-ge v5, v4, :cond_1

    iget-object v7, p0, La/e7;->a:Ljava/util/ArrayList;

    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, La/e7$i;

    invoke-interface {v7, v1, v2}, La/e7$i;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

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
    iget-object v1, p0, La/e7;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v1, p0, La/e7;->v:La/X6$a;

    iget-object v1, v1, La/Z6;->c:Landroid/os/Handler;

    iget-object v2, p0, La/e7;->O:La/e7$e;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_2
    if-eqz v6, :cond_2

    const/4 v0, 0x1

    iput-boolean v0, p0, La/e7;->b:Z

    :try_start_3
    iget-object v1, p0, La/e7;->K:Ljava/util/ArrayList;

    iget-object v2, p0, La/e7;->L:Ljava/util/ArrayList;

    invoke-virtual {p0, v1, v2}, La/e7;->U(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    invoke-virtual {p0}, La/e7;->d()V

    goto :goto_0

    :catchall_2
    move-exception p1

    invoke-virtual {p0}, La/e7;->d()V

    throw p1

    :cond_2
    invoke-virtual {p0}, La/e7;->f0()V

    iget-boolean v1, p0, La/e7;->J:Z

    if-eqz v1, :cond_3

    iput-boolean p1, p0, La/e7;->J:Z

    invoke-virtual {p0}, La/e7;->d0()V

    :cond_3
    iget-object p1, p0, La/e7;->c:La/A2;

    iget-object p1, p1, La/A2;->b:Ljava/lang/Object;

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
    iget-object v0, p0, La/e7;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, La/e7;->v:La/X6$a;

    iget-object v0, v0, La/Z6;->c:Landroid/os/Handler;

    iget-object v1, p0, La/e7;->O:La/e7$e;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    throw p1

    :goto_4
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method
