.class public final Law;
.super Ly5;
.source ""


# instance fields
.field public final A:Z

.field public B:Z

.field public C:Z

.field public final r:Landroid/content/Context;

.field public final s:Lgw;

.field public final t:Ljava/lang/Class;

.field public final u:LRj;

.field public v:Lzj;

.field public w:Ljava/lang/Object;

.field public x:Ljava/util/ArrayList;

.field public y:Law;

.field public z:Law;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lmw;

    invoke-direct {v0}, Ly5;-><init>()V

    sget-object v1, LVd;->d:LVd;

    invoke-virtual {v0, v1}, Ly5;->e(LVd;)Ly5;

    move-result-object v0

    check-cast v0, Lmw;

    invoke-virtual {v0}, Ly5;->l()Ly5;

    move-result-object v0

    check-cast v0, Lmw;

    invoke-virtual {v0}, Ly5;->q()Ly5;

    move-result-object v0

    check-cast v0, Lmw;

    return-void
.end method

.method public constructor <init>(Lcom/bumptech/glide/a;Lgw;Ljava/lang/Class;Landroid/content/Context;)V
    .locals 3

    invoke-direct {p0}, Ly5;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Law;->A:Z

    iput-object p2, p0, Law;->s:Lgw;

    iput-object p3, p0, Law;->t:Ljava/lang/Class;

    iput-object p4, p0, Law;->r:Landroid/content/Context;

    iget-object p4, p2, Lgw;->a:Lcom/bumptech/glide/a;

    iget-object p4, p4, Lcom/bumptech/glide/a;->c:LRj;

    iget-object p4, p4, LRj;->f:LM4;

    invoke-virtual {p4, p3}, Lsy;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzj;

    if-nez v0, :cond_1

    invoke-virtual {p4}, LM4;->entrySet()Ljava/util/Set;

    move-result-object p4

    check-cast p4, LH4;

    invoke-virtual {p4}, LH4;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :cond_0
    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Class;

    invoke-virtual {v2, p3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzj;

    goto :goto_0

    :cond_1
    if-nez v0, :cond_2

    sget-object v0, LRj;->k:Lzj;

    :cond_2
    iput-object v0, p0, Law;->v:Lzj;

    iget-object p1, p1, Lcom/bumptech/glide/a;->c:LRj;

    iput-object p1, p0, Law;->u:LRj;

    iget-object p1, p2, Lgw;->i:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lgk;

    invoke-virtual {p0, p3}, Law;->v(Lgk;)Law;

    goto :goto_1

    :cond_3
    monitor-enter p2

    :try_start_0
    iget-object p1, p2, Lgw;->j:Lmw;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p2

    invoke-virtual {p0, p1}, Law;->w(Ly5;)Law;

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method


# virtual methods
.method public final A(Landroid/widget/ImageView;)V
    .locals 4

    invoke-static {}, LvD;->a()V

    invoke-static {p1}, LQj;->i(Ljava/lang/Object;)V

    const/16 v0, 0x800

    iget v1, p0, Ly5;->a:I

    invoke-static {v1, v0}, Ly5;->h(II)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v0, LZv;->a:[I

    invoke-virtual {p1}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    invoke-virtual {p0}, Law;->y()Law;

    move-result-object v0

    sget-object v2, Lre;->c:Lre;

    new-instance v3, Lc7;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v2, v3, v1}, Ly5;->m(Lre;LP5;Z)Ly5;

    move-result-object v0

    goto :goto_1

    :pswitch_1
    invoke-virtual {p0}, Law;->y()Law;

    move-result-object v0

    sget-object v2, Lre;->b:Lre;

    new-instance v3, Lzh;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v2, v3, v1}, Ly5;->m(Lre;LP5;Z)Ly5;

    move-result-object v0

    goto :goto_1

    :pswitch_2
    invoke-virtual {p0}, Law;->y()Law;

    move-result-object v0

    sget-object v2, Lre;->c:Lre;

    new-instance v3, Lc7;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v2, v3, v1}, Ly5;->m(Lre;LP5;Z)Ly5;

    move-result-object v0

    goto :goto_1

    :pswitch_3
    invoke-virtual {p0}, Law;->y()Law;

    move-result-object v0

    sget-object v1, Lre;->d:Lre;

    new-instance v2, Lb7;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v1, v2}, Ly5;->i(Lre;LP5;)Ly5;

    move-result-object v0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v0, p0

    :goto_1
    iget-object v1, p0, Law;->u:LRj;

    iget-object v1, v1, LRj;->c:LPg;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-class v1, Landroid/graphics/Bitmap;

    iget-object v2, p0, Law;->t:Ljava/lang/Class;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, LM5;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, LM5;-><init>(Landroid/widget/ImageView;I)V

    goto :goto_2

    :cond_1
    const-class v1, Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, LM5;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, LM5;-><init>(Landroid/widget/ImageView;I)V

    :goto_2
    invoke-virtual {p0, v1, v0}, Law;->z(LgA;Ly5;)V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unhandled class: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", try .as*(Class).transcode(ResourceTranscoder)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final B(Lgk;)Law;
    .locals 1

    iget-boolean v0, p0, Ly5;->o:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Law;->y()Law;

    move-result-object v0

    invoke-virtual {v0, p1}, Law;->B(Lgk;)Law;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Law;->x:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Law;->v(Lgk;)Law;

    move-result-object p1

    return-object p1
.end method

.method public final C(Ljava/lang/Object;)Law;
    .locals 1

    iget-boolean v0, p0, Ly5;->o:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Law;->y()Law;

    move-result-object v0

    invoke-virtual {v0, p1}, Law;->C(Ljava/lang/Object;)Law;

    move-result-object p1

    return-object p1

    :cond_0
    iput-object p1, p0, Law;->w:Ljava/lang/Object;

    const/4 p1, 0x1

    iput-boolean p1, p0, Law;->B:Z

    invoke-virtual {p0}, Ly5;->n()V

    return-object p0
.end method

.method public final bridge synthetic a(Ly5;)Ly5;
    .locals 0

    invoke-virtual {p0, p1}, Law;->w(Ly5;)Law;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic c()Ly5;
    .locals 1

    invoke-virtual {p0}, Law;->y()Law;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Law;->y()Law;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Law;

    if-eqz v0, :cond_0

    check-cast p1, Law;

    invoke-super {p0, p1}, Ly5;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Law;->t:Ljava/lang/Class;

    iget-object v1, p1, Law;->t:Ljava/lang/Class;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Law;->v:Lzj;

    iget-object v1, p1, Law;->v:Lzj;

    invoke-virtual {v0, v1}, Lzj;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Law;->w:Ljava/lang/Object;

    iget-object v1, p1, Law;->w:Ljava/lang/Object;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Law;->x:Ljava/util/ArrayList;

    iget-object v1, p1, Law;->x:Ljava/util/ArrayList;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Law;->y:Law;

    iget-object v1, p1, Law;->y:Law;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Law;->z:Law;

    iget-object v1, p1, Law;->z:Law;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Law;->A:Z

    iget-boolean v1, p1, Law;->A:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Law;->B:Z

    iget-boolean p1, p1, Law;->B:Z

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    invoke-super {p0}, Ly5;->hashCode()I

    move-result v0

    iget-object v1, p0, Law;->t:Ljava/lang/Class;

    invoke-static {v0, v1}, LvD;->h(ILjava/lang/Object;)I

    move-result v0

    iget-object v1, p0, Law;->v:Lzj;

    invoke-static {v0, v1}, LvD;->h(ILjava/lang/Object;)I

    move-result v0

    iget-object v1, p0, Law;->w:Ljava/lang/Object;

    invoke-static {v0, v1}, LvD;->h(ILjava/lang/Object;)I

    move-result v0

    iget-object v1, p0, Law;->x:Ljava/util/ArrayList;

    invoke-static {v0, v1}, LvD;->h(ILjava/lang/Object;)I

    move-result v0

    iget-object v1, p0, Law;->y:Law;

    invoke-static {v0, v1}, LvD;->h(ILjava/lang/Object;)I

    move-result v0

    iget-object v1, p0, Law;->z:Law;

    invoke-static {v0, v1}, LvD;->h(ILjava/lang/Object;)I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, LvD;->h(ILjava/lang/Object;)I

    move-result v0

    iget-boolean v1, p0, Law;->A:Z

    invoke-static {v1, v0}, LvD;->g(II)I

    move-result v0

    iget-boolean v1, p0, Law;->B:Z

    invoke-static {v1, v0}, LvD;->g(II)I

    move-result v0

    return v0
.end method

.method public final v(Lgk;)Law;
    .locals 1

    iget-boolean v0, p0, Ly5;->o:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Law;->y()Law;

    move-result-object v0

    invoke-virtual {v0, p1}, Law;->v(Lgk;)Law;

    move-result-object p1

    return-object p1

    :cond_0
    if-eqz p1, :cond_2

    iget-object v0, p0, Law;->x:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Law;->x:Ljava/util/ArrayList;

    :cond_1
    iget-object v0, p0, Law;->x:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-virtual {p0}, Ly5;->n()V

    return-object p0
.end method

.method public final w(Ly5;)Law;
    .locals 0

    invoke-static {p1}, LQj;->i(Ljava/lang/Object;)V

    invoke-super {p0, p1}, Ly5;->a(Ly5;)Ly5;

    move-result-object p1

    check-cast p1, Law;

    return-object p1
.end method

.method public final x(Ljava/lang/Object;LgA;Lbw;Lzj;Lwu;IILy5;)LXv;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v1, p4

    move-object/from16 v7, p8

    iget-object v3, v0, Law;->z:Law;

    if-eqz v3, :cond_0

    new-instance v3, Lpg;

    move-object/from16 v4, p3

    invoke-direct {v3, v2, v4}, Lpg;-><init>(Ljava/lang/Object;Lbw;)V

    move-object v13, v3

    move-object/from16 v16, v13

    goto :goto_0

    :cond_0
    move-object/from16 v4, p3

    const/4 v3, 0x0

    move-object/from16 v16, v3

    move-object v13, v4

    :goto_0
    iget-object v3, v0, Law;->y:Law;

    if-eqz v3, :cond_8

    iget-boolean v4, v0, Law;->C:Z

    if-nez v4, :cond_7

    iget-object v4, v3, Law;->v:Lzj;

    iget-boolean v5, v3, Law;->A:Z

    if-eqz v5, :cond_1

    move-object/from16 v17, v1

    goto :goto_1

    :cond_1
    move-object/from16 v17, v4

    :goto_1
    const/16 v4, 0x8

    iget v3, v3, Ly5;->a:I

    invoke-static {v3, v4}, Ly5;->h(II)Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    iget-object v3, v0, Law;->y:Law;

    iget-object v3, v3, Ly5;->c:Lwu;

    :goto_2
    move-object/from16 v18, v3

    goto :goto_3

    :cond_2
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    if-eqz v3, :cond_5

    if-eq v3, v4, :cond_5

    const/4 v5, 0x2

    if-eq v3, v5, :cond_4

    const/4 v5, 0x3

    if-ne v3, v5, :cond_3

    sget-object v3, Lwu;->c:Lwu;

    goto :goto_2

    :cond_3
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "unknown priority: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, v0, Ly5;->c:Lwu;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    sget-object v3, Lwu;->b:Lwu;

    goto :goto_2

    :cond_5
    sget-object v3, Lwu;->a:Lwu;

    goto :goto_2

    :goto_3
    iget-object v3, v0, Law;->y:Law;

    iget v5, v3, Ly5;->h:I

    iget v3, v3, Ly5;->g:I

    invoke-static/range {p6 .. p7}, LvD;->i(II)Z

    move-result v6

    if-eqz v6, :cond_6

    iget-object v6, v0, Law;->y:Law;

    iget v8, v6, Ly5;->h:I

    iget v6, v6, Ly5;->g:I

    invoke-static {v8, v6}, LvD;->i(II)Z

    move-result v6

    if-nez v6, :cond_6

    iget v5, v7, Ly5;->h:I

    iget v3, v7, Ly5;->g:I

    :cond_6
    move/from16 v19, v3

    move/from16 v20, v5

    new-instance v3, LfB;

    invoke-direct {v3, v2, v13}, LfB;-><init>(Ljava/lang/Object;Lbw;)V

    iget-object v2, v0, Law;->r:Landroid/content/Context;

    move-object v13, v3

    iget-object v3, v0, Law;->u:LRj;

    iget-object v5, v0, Law;->w:Ljava/lang/Object;

    iget-object v6, v0, Law;->t:Ljava/lang/Class;

    iget-object v12, v0, Law;->x:Ljava/util/ArrayList;

    iget-object v14, v3, LRj;->g:Lcg;

    iget-object v15, v1, Lzj;->a:LPg;

    new-instance v1, Lty;

    move-object/from16 v4, p1

    move-object/from16 v11, p2

    move-object/from16 v10, p5

    move/from16 v8, p6

    move/from16 v9, p7

    invoke-direct/range {v1 .. v15}, Lty;-><init>(Landroid/content/Context;LRj;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;Ly5;IILwu;LgA;Ljava/util/ArrayList;Lbw;Lcg;LPg;)V

    move-object v10, v1

    const/4 v1, 0x1

    iput-boolean v1, v0, Law;->C:Z

    iget-object v1, v0, Law;->y:Law;

    move-object v9, v1

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object v4, v13

    move-object/from16 v5, v17

    move-object/from16 v6, v18

    move/from16 v8, v19

    move/from16 v7, v20

    invoke-virtual/range {v1 .. v9}, Law;->x(Ljava/lang/Object;LgA;Lbw;Lzj;Lwu;IILy5;)LXv;

    move-result-object v1

    const/4 v2, 0x0

    iput-boolean v2, v0, Law;->C:Z

    iput-object v10, v13, LfB;->c:Lty;

    iput-object v1, v13, LfB;->d:LXv;

    move-object/from16 v7, p8

    goto :goto_4

    :cond_7
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_8
    iget-object v2, v0, Law;->r:Landroid/content/Context;

    iget-object v3, v0, Law;->u:LRj;

    iget-object v5, v0, Law;->w:Ljava/lang/Object;

    iget-object v6, v0, Law;->t:Ljava/lang/Class;

    iget-object v12, v0, Law;->x:Ljava/util/ArrayList;

    iget-object v14, v3, LRj;->g:Lcg;

    iget-object v15, v1, Lzj;->a:LPg;

    new-instance v1, Lty;

    move-object/from16 v4, p1

    move-object/from16 v11, p2

    move-object/from16 v10, p5

    move/from16 v8, p6

    move/from16 v9, p7

    move-object/from16 v7, p8

    invoke-direct/range {v1 .. v15}, Lty;-><init>(Landroid/content/Context;LRj;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;Ly5;IILwu;LgA;Ljava/util/ArrayList;Lbw;Lcg;LPg;)V

    move-object v13, v1

    :goto_4
    if-nez v16, :cond_9

    return-object v13

    :cond_9
    iget-object v1, v0, Law;->z:Law;

    iget v2, v1, Ly5;->h:I

    iget v1, v1, Ly5;->g:I

    invoke-static/range {p6 .. p7}, LvD;->i(II)Z

    move-result v3

    if-eqz v3, :cond_a

    iget-object v3, v0, Law;->z:Law;

    iget v4, v3, Ly5;->h:I

    iget v3, v3, Ly5;->g:I

    invoke-static {v4, v3}, LvD;->i(II)Z

    move-result v3

    if-nez v3, :cond_a

    iget v2, v7, Ly5;->h:I

    iget v1, v7, Ly5;->g:I

    :cond_a
    move v8, v1

    move v7, v2

    iget-object v1, v0, Law;->z:Law;

    iget-object v5, v1, Law;->v:Lzj;

    iget-object v6, v1, Ly5;->c:Lwu;

    move-object v9, v1

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, v16

    invoke-virtual/range {v1 .. v9}, Law;->x(Ljava/lang/Object;LgA;Lbw;Lzj;Lwu;IILy5;)LXv;

    move-result-object v1

    iput-object v13, v4, Lpg;->c:LXv;

    iput-object v1, v4, Lpg;->d:LXv;

    return-object v4
.end method

.method public final y()Law;
    .locals 3

    invoke-super {p0}, Ly5;->c()Ly5;

    move-result-object v0

    check-cast v0, Law;

    iget-object v1, v0, Law;->v:Lzj;

    invoke-virtual {v1}, Lzj;->a()Lzj;

    move-result-object v1

    iput-object v1, v0, Law;->v:Lzj;

    iget-object v1, v0, Law;->x:Ljava/util/ArrayList;

    if-eqz v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, v0, Law;->x:Ljava/util/ArrayList;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v1, v0, Law;->x:Ljava/util/ArrayList;

    :cond_0
    iget-object v1, v0, Law;->y:Law;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Law;->y()Law;

    move-result-object v1

    iput-object v1, v0, Law;->y:Law;

    :cond_1
    iget-object v1, v0, Law;->z:Law;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Law;->y()Law;

    move-result-object v1

    iput-object v1, v0, Law;->z:Law;

    :cond_2
    return-object v0
.end method

.method public final z(LgA;Ly5;)V
    .locals 10

    invoke-static {p1}, LQj;->i(Ljava/lang/Object;)V

    iget-boolean v0, p0, Law;->B:Z

    if-eqz v0, :cond_4

    new-instance v2, Ljava/lang/Object;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iget-object v5, p0, Law;->v:Lzj;

    iget-object v6, p2, Ly5;->c:Lwu;

    iget v7, p2, Ly5;->h:I

    iget v8, p2, Ly5;->g:I

    const/4 v4, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v9, p2

    invoke-virtual/range {v1 .. v9}, Law;->x(Ljava/lang/Object;LgA;Lbw;Lzj;Lwu;IILy5;)LXv;

    move-result-object p1

    invoke-interface {v3}, LgA;->a()LXv;

    move-result-object p2

    invoke-interface {p1, p2}, LXv;->f(LXv;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, v9, Ly5;->f:Z

    if-nez v0, :cond_0

    invoke-interface {p2}, LXv;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "Argument must not be null"

    invoke-static {p1, p2}, LQj;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {p2}, LXv;->isRunning()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-interface {p2}, LXv;->j()V

    :cond_1
    return-void

    :cond_2
    :goto_0
    iget-object p2, v1, Law;->s:Lgw;

    invoke-virtual {p2, v3}, Lgw;->l(LgA;)V

    invoke-interface {v3, p1}, LgA;->g(LXv;)V

    iget-object p2, v1, Law;->s:Lgw;

    monitor-enter p2

    :try_start_0
    iget-object v0, p2, Lgw;->f:LhA;

    iget-object v0, v0, LhA;->a:Ljava/util/Set;

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v0, p2, Lgw;->d:Lwy;

    iget-object v2, v0, Lwy;->c:Ljava/lang/Object;

    check-cast v2, Ljava/util/Set;

    invoke-interface {v2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-boolean v2, v0, Lwy;->b:Z

    if-nez v2, :cond_3

    invoke-interface {p1}, LXv;->j()V

    goto :goto_1

    :cond_3
    invoke-interface {p1}, LXv;->clear()V

    iget-object v0, v0, Lwy;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    monitor-exit p2

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_4
    move-object v1, p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "You must call #load() before calling #into()"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
