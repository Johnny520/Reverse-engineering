.class public final Lty;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LXv;
.implements LAy;


# static fields
.field public static final A:Z


# instance fields
.field public final a:Lfz;

.field public final b:Ljava/lang/Object;

.field public final c:Lbw;

.field public final d:Landroid/content/Context;

.field public final e:LRj;

.field public final f:Ljava/lang/Object;

.field public final g:Ljava/lang/Class;

.field public final h:Ly5;

.field public final i:I

.field public final j:I

.field public final k:Lwu;

.field public final l:LgA;

.field public final m:Ljava/util/List;

.field public final n:LPg;

.field public final o:Lp3;

.field public p:Lpw;

.field public q:Lw4;

.field public volatile r:Lcg;

.field public s:Landroid/graphics/drawable/Drawable;

.field public t:Landroid/graphics/drawable/Drawable;

.field public u:Landroid/graphics/drawable/Drawable;

.field public v:I

.field public w:I

.field public x:Z

.field public final y:Ljava/lang/RuntimeException;

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "GlideRequest"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    sput-boolean v0, Lty;->A:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LRj;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;Ly5;IILwu;LgA;Ljava/util/ArrayList;Lbw;Lcg;LPg;)V
    .locals 2

    sget-object v0, LPj;->b:Lp3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-boolean v1, Lty;->A:Z

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    :cond_0
    new-instance v1, Lfz;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lty;->a:Lfz;

    iput-object p3, p0, Lty;->b:Ljava/lang/Object;

    iput-object p1, p0, Lty;->d:Landroid/content/Context;

    iput-object p2, p0, Lty;->e:LRj;

    iput-object p4, p0, Lty;->f:Ljava/lang/Object;

    iput-object p5, p0, Lty;->g:Ljava/lang/Class;

    iput-object p6, p0, Lty;->h:Ly5;

    iput p7, p0, Lty;->i:I

    iput p8, p0, Lty;->j:I

    iput-object p9, p0, Lty;->k:Lwu;

    iput-object p10, p0, Lty;->l:LgA;

    iput-object p11, p0, Lty;->m:Ljava/util/List;

    iput-object p12, p0, Lty;->c:Lbw;

    iput-object p13, p0, Lty;->r:Lcg;

    move-object/from16 p1, p14

    iput-object p1, p0, Lty;->n:LPg;

    iput-object v0, p0, Lty;->o:Lp3;

    const/4 p1, 0x1

    iput p1, p0, Lty;->z:I

    iget-object p1, p0, Lty;->y:Ljava/lang/RuntimeException;

    if-nez p1, :cond_1

    iget-object p1, p2, LRj;->h:LD2;

    iget-object p1, p1, LD2;->b:Ljava/lang/Object;

    check-cast p1, Ljava/util/Map;

    const-class p2, LOj;

    invoke-interface {p1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Glide request origin trace"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lty;->y:Ljava/lang/RuntimeException;

    :cond_1
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-boolean v0, p0, Lty;->x:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lty;->a:Lfz;

    invoke-virtual {v0}, Lfz;->a()V

    iget-object v0, p0, Lty;->l:LgA;

    invoke-interface {v0, p0}, LgA;->e(Lty;)V

    iget-object v0, p0, Lty;->q:Lw4;

    if-eqz v0, :cond_0

    iget-object v1, v0, Lw4;->d:Ljava/lang/Object;

    check-cast v1, Lcg;

    monitor-enter v1

    :try_start_0
    iget-object v2, v0, Lw4;->b:Ljava/lang/Object;

    check-cast v2, Lig;

    iget-object v0, v0, Lw4;->c:Ljava/lang/Object;

    check-cast v0, Lty;

    invoke-virtual {v2, v0}, Lig;->h(Lty;)V

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    iput-object v0, p0, Lty;->q:Lw4;

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_0
    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You can\'t start or clear loads in RequestListener or Target callbacks. If you\'re trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b()Landroid/graphics/drawable/Drawable;
    .locals 3

    iget-object v0, p0, Lty;->t:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    iget-object v0, p0, Lty;->h:Ly5;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    iput-object v1, p0, Lty;->t:Landroid/graphics/drawable/Drawable;

    iget v1, v0, Ly5;->e:I

    if-lez v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lty;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    invoke-static {v0, v0, v1, v2}, LDc;->k(Landroid/content/Context;Landroid/content/Context;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lty;->t:Landroid/graphics/drawable/Drawable;

    :cond_0
    iget-object v0, p0, Lty;->t:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final c(LTj;I)V
    .locals 5

    iget-object v0, p0, Lty;->a:Lfz;

    invoke-virtual {v0}, Lfz;->a()V

    iget-object v0, p0, Lty;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Lty;->e:LRj;

    iget v1, v1, LRj;->i:I

    const/4 v2, 0x0

    if-gt v1, p2, :cond_0

    iget-object p2, p0, Lty;->f:Ljava/lang/Object;

    invoke-static {p2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    const/4 p2, 0x4

    if-gt v1, p2, :cond_0

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p1, p2}, LTj;->a(Ljava/lang/Throwable;Ljava/util/ArrayList;)V

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p1

    move v1, v2

    :goto_0
    if-ge v1, p1, :cond_0

    add-int/lit8 v3, v1, 0x1

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    move v1, v3

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_6

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lty;->q:Lw4;

    const/4 p2, 0x5

    iput p2, p0, Lty;->z:I

    iget-object p2, p0, Lty;->c:Lbw;

    if-eqz p2, :cond_1

    invoke-interface {p2, p0}, Lbw;->c(LXv;)V

    :cond_1
    const/4 p2, 0x1

    iput-boolean p2, p0, Lty;->x:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v1, p0, Lty;->m:Ljava/util/List;

    if-eqz v1, :cond_3

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lgk;

    iget-object v4, p0, Lty;->c:Lbw;

    if-eqz v4, :cond_2

    invoke-interface {v4}, Lbw;->getRoot()Lbw;

    move-result-object v4

    invoke-interface {v4}, Lbw;->e()Z

    move-result v4

    :cond_2
    iget v4, v3, Lgk;->a:I

    packed-switch v4, :pswitch_data_0

    iget-object v3, v3, Lgk;->b:Ljava/lang/Object;

    check-cast v3, LKA;

    iget-object v3, v3, Landroidx/recyclerview/widget/o;->itemView:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->requestLayout()V

    goto :goto_1

    :pswitch_0
    iget-object v3, v3, Lgk;->b:Ljava/lang/Object;

    check-cast v3, Landroid/widget/ProgressBar;

    const/16 v4, 0x8

    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    :pswitch_1
    const-wide v3, -0x4149fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_5

    :cond_3
    iget-object v1, p0, Lty;->c:Lbw;

    if-eqz v1, :cond_5

    invoke-interface {v1, p0}, Lbw;->b(LXv;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    move p2, v2

    :cond_5
    :goto_2
    if-nez p2, :cond_6

    goto :goto_4

    :cond_6
    iget-object p2, p0, Lty;->f:Ljava/lang/Object;

    if-nez p2, :cond_8

    iget-object p2, p0, Lty;->u:Landroid/graphics/drawable/Drawable;

    if-nez p2, :cond_7

    iget-object p2, p0, Lty;->h:Ly5;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lty;->u:Landroid/graphics/drawable/Drawable;

    :cond_7
    iget-object p2, p0, Lty;->u:Landroid/graphics/drawable/Drawable;

    goto :goto_3

    :cond_8
    move-object p2, p1

    :goto_3
    if-nez p2, :cond_a

    iget-object p2, p0, Lty;->s:Landroid/graphics/drawable/Drawable;

    if-nez p2, :cond_9

    iget-object p2, p0, Lty;->h:Ly5;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lty;->s:Landroid/graphics/drawable/Drawable;

    iget p1, p2, Ly5;->d:I

    if-lez p1, :cond_9

    iget-object p2, p0, Lty;->d:Landroid/content/Context;

    iget-object v1, p0, Lty;->h:Ly5;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    invoke-static {p2, p2, p1, v1}, LDc;->k(Landroid/content/Context;Landroid/content/Context;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Lty;->s:Landroid/graphics/drawable/Drawable;

    :cond_9
    iget-object p2, p0, Lty;->s:Landroid/graphics/drawable/Drawable;

    :cond_a
    if-nez p2, :cond_b

    invoke-virtual {p0}, Lty;->b()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    :cond_b
    iget-object p1, p0, Lty;->l:LgA;

    invoke-interface {p1, p2}, LgA;->c(Landroid/graphics/drawable/Drawable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_4
    :try_start_2
    iput-boolean v2, p0, Lty;->x:Z

    monitor-exit v0

    return-void

    :goto_5
    iput-boolean v2, p0, Lty;->x:Z

    throw p1

    :goto_6
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final clear()V
    .locals 5

    iget-object v0, p0, Lty;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lty;->x:Z

    if-nez v1, :cond_5

    iget-object v1, p0, Lty;->a:Lfz;

    invoke-virtual {v1}, Lfz;->a()V

    iget v1, p0, Lty;->z:I

    const/4 v2, 0x6

    if-ne v1, v2, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lty;->a()V

    iget-object v1, p0, Lty;->p:Lpw;

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    iput-object v3, p0, Lty;->p:Lpw;

    goto :goto_0

    :cond_1
    move-object v1, v3

    :goto_0
    iget-object v3, p0, Lty;->c:Lbw;

    if-eqz v3, :cond_2

    invoke-interface {v3, p0}, Lbw;->a(LXv;)Z

    move-result v3

    if-eqz v3, :cond_3

    :cond_2
    iget-object v3, p0, Lty;->l:LgA;

    invoke-virtual {p0}, Lty;->b()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-interface {v3, v4}, LgA;->i(Landroid/graphics/drawable/Drawable;)V

    :cond_3
    iput v2, p0, Lty;->z:I

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_4

    iget-object v0, p0, Lty;->r:Lcg;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Lcg;->e(Lpw;)V

    :cond_4
    return-void

    :cond_5
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "You can\'t start or clear loads in RequestListener or Target callbacks. If you\'re trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, Lty;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lty;->isRunning()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lty;->clear()V

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

.method public final e()Z
    .locals 3

    iget-object v0, p0, Lty;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lty;->z:I

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final f(LXv;)Z
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    instance-of v2, v0, Lty;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    return v3

    :cond_0
    iget-object v2, v1, Lty;->b:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget v4, v1, Lty;->i:I

    iget v5, v1, Lty;->j:I

    iget-object v6, v1, Lty;->f:Ljava/lang/Object;

    iget-object v7, v1, Lty;->g:Ljava/lang/Class;

    iget-object v8, v1, Lty;->h:Ly5;

    iget-object v9, v1, Lty;->k:Lwu;

    iget-object v10, v1, Lty;->m:Ljava/util/List;

    if-eqz v10, :cond_1

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v10

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_5

    :cond_1
    move v10, v3

    :goto_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    check-cast v0, Lty;

    iget-object v11, v0, Lty;->b:Ljava/lang/Object;

    monitor-enter v11

    :try_start_1
    iget v2, v0, Lty;->i:I

    iget v12, v0, Lty;->j:I

    iget-object v13, v0, Lty;->f:Ljava/lang/Object;

    iget-object v14, v0, Lty;->g:Ljava/lang/Class;

    iget-object v15, v0, Lty;->h:Ly5;

    move/from16 v16, v3

    iget-object v3, v0, Lty;->k:Lwu;

    iget-object v0, v0, Lty;->m:Ljava/util/List;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_1

    :catchall_1
    move-exception v0

    goto :goto_4

    :cond_2
    move/from16 v0, v16

    :goto_1
    monitor-exit v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v4, v2, :cond_7

    if-ne v5, v12, :cond_7

    sget-object v2, LvD;->a:[C

    const/4 v2, 0x1

    if-nez v6, :cond_4

    if-nez v13, :cond_3

    move v4, v2

    goto :goto_2

    :cond_3
    move/from16 v4, v16

    goto :goto_2

    :cond_4
    invoke-virtual {v6, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    :goto_2
    if-eqz v4, :cond_7

    invoke-virtual {v7, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    if-nez v8, :cond_6

    if-nez v15, :cond_5

    move v4, v2

    goto :goto_3

    :cond_5
    move/from16 v4, v16

    goto :goto_3

    :cond_6
    invoke-virtual {v8, v15}, Ly5;->g(Ly5;)Z

    move-result v4

    :goto_3
    if-eqz v4, :cond_7

    if-ne v9, v3, :cond_7

    if-ne v10, v0, :cond_7

    return v2

    :cond_7
    return v16

    :goto_4
    :try_start_2
    monitor-exit v11
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    :goto_5
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method

.method public final g(Lpw;IZ)V
    .locals 6

    const-string p3, "Expected to receive an object of "

    const-string v0, "Expected to receive a Resource<R> with an object of "

    iget-object v1, p0, Lty;->a:Lfz;

    invoke-virtual {v1}, Lfz;->a()V

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lty;->b:Ljava/lang/Object;

    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    iput-object v1, p0, Lty;->q:Lw4;

    const/4 v3, 0x5

    if-nez p1, :cond_0

    new-instance p1, LTj;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p3, p0, Lty;->g:Ljava/lang/Class;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " inside, but instead got null."

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, LTj;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, v3}, Lty;->c(LTj;I)V

    monitor-exit v2

    return-void

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :cond_0
    invoke-interface {p1}, Lpw;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v4, p0, Lty;->g:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_2

    :cond_1
    iget-object p3, p0, Lty;->c:Lbw;

    if-eqz p3, :cond_3

    invoke-interface {p3, p0}, Lbw;->g(LXv;)Z

    move-result p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p3, :cond_2

    goto :goto_1

    :cond_2
    :try_start_2
    iput-object v1, p0, Lty;->p:Lpw;

    const/4 p2, 0x4

    iput p2, p0, Lty;->z:I

    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_0
    iget-object p2, p0, Lty;->r:Lcg;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lcg;->e(Lpw;)V

    return-void

    :catchall_1
    move-exception p2

    move-object v1, p1

    move-object p1, p2

    goto :goto_5

    :cond_3
    :goto_1
    :try_start_3
    invoke-virtual {p0, p1, v0, p2}, Lty;->h(Lpw;Ljava/lang/Object;I)V

    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    return-void

    :cond_4
    :goto_2
    :try_start_4
    iput-object v1, p0, Lty;->p:Lpw;

    new-instance p2, LTj;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p3, p0, Lty;->g:Ljava/lang/Class;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " but instead got "

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    goto :goto_3

    :cond_5
    const-string p3, ""

    :goto_3
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, "{"

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, "} inside Resource{"

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, "}."

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v0, :cond_6

    const-string p3, ""

    goto :goto_4

    :cond_6
    const-string p3, " To indicate failure return a null Resource object, rather than a Resource object containing null data."

    :goto_4
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, LTj;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p2, v3}, Lty;->c(LTj;I)V

    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_0

    :goto_5
    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception p1

    if-eqz v1, :cond_7

    iget-object p2, p0, Lty;->r:Lcg;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Lcg;->e(Lpw;)V

    :cond_7
    throw p1
.end method

.method public final h(Lpw;Ljava/lang/Object;I)V
    .locals 1

    iget-object p3, p0, Lty;->c:Lbw;

    if-eqz p3, :cond_0

    invoke-interface {p3}, Lbw;->getRoot()Lbw;

    move-result-object v0

    invoke-interface {v0}, Lbw;->e()Z

    move-result v0

    :cond_0
    const/4 v0, 0x4

    iput v0, p0, Lty;->z:I

    iput-object p1, p0, Lty;->p:Lpw;

    iget-object p1, p0, Lty;->e:LRj;

    iget p1, p1, LRj;->i:I

    const/4 v0, 0x3

    if-gt p1, v0, :cond_1

    iget-object p1, p0, Lty;->f:Ljava/lang/Object;

    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    sget p1, Lhp;->a:I

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    :cond_1
    if-eqz p3, :cond_2

    invoke-interface {p3, p0}, Lbw;->h(LXv;)V

    :cond_2
    const/4 p1, 0x1

    iput-boolean p1, p0, Lty;->x:Z

    const/4 p1, 0x0

    :try_start_0
    iget-object p3, p0, Lty;->m:Ljava/util/List;

    if-eqz p3, :cond_3

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgk;

    invoke-virtual {v0, p2}, Lgk;->a(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_3
    iget-object p3, p0, Lty;->n:LPg;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p3, p0, Lty;->l:LgA;

    invoke-interface {p3, p2}, LgA;->j(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean p1, p0, Lty;->x:Z

    return-void

    :goto_1
    iput-boolean p1, p0, Lty;->x:Z

    throw p2
.end method

.method public final i()Z
    .locals 3

    iget-object v0, p0, Lty;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lty;->z:I

    const/4 v2, 0x6

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final isRunning()Z
    .locals 3

    iget-object v0, p0, Lty;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lty;->z:I

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final j()V
    .locals 7

    iget-object v0, p0, Lty;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lty;->x:Z

    if-nez v1, :cond_e

    iget-object v1, p0, Lty;->a:Lfz;

    invoke-virtual {v1}, Lfz;->a()V

    sget v1, Lhp;->a:I

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    iget-object v1, p0, Lty;->f:Ljava/lang/Object;

    const/4 v2, 0x3

    const/4 v3, 0x5

    if-nez v1, :cond_3

    iget v1, p0, Lty;->i:I

    iget v4, p0, Lty;->j:I

    invoke-static {v1, v4}, LvD;->i(II)Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, p0, Lty;->i:I

    iput v1, p0, Lty;->v:I

    iget v1, p0, Lty;->j:I

    iput v1, p0, Lty;->w:I

    goto :goto_0

    :catchall_0
    move-exception v1

    goto/16 :goto_4

    :cond_0
    :goto_0
    iget-object v1, p0, Lty;->u:Landroid/graphics/drawable/Drawable;

    if-nez v1, :cond_1

    iget-object v1, p0, Lty;->h:Ly5;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    iput-object v1, p0, Lty;->u:Landroid/graphics/drawable/Drawable;

    :cond_1
    iget-object v1, p0, Lty;->u:Landroid/graphics/drawable/Drawable;

    if-nez v1, :cond_2

    move v2, v3

    :cond_2
    new-instance v1, LTj;

    const-string v3, "Received null model"

    invoke-direct {v1, v3}, LTj;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v1, v2}, Lty;->c(LTj;I)V

    monitor-exit v0

    return-void

    :cond_3
    iget v1, p0, Lty;->z:I

    const/4 v4, 0x2

    if-eq v1, v4, :cond_d

    const/4 v5, 0x4

    const/4 v6, 0x0

    if-ne v1, v5, :cond_4

    iget-object v1, p0, Lty;->p:Lpw;

    invoke-virtual {p0, v1, v3, v6}, Lty;->g(Lpw;IZ)V

    monitor-exit v0

    return-void

    :cond_4
    iget-object v1, p0, Lty;->m:Ljava/util/List;

    if-nez v1, :cond_5

    goto :goto_2

    :cond_5
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lgk;

    goto :goto_1

    :cond_6
    :goto_2
    iput v2, p0, Lty;->z:I

    iget v1, p0, Lty;->i:I

    iget v3, p0, Lty;->j:I

    invoke-static {v1, v3}, LvD;->i(II)Z

    move-result v1

    if-eqz v1, :cond_7

    iget v1, p0, Lty;->i:I

    iget v3, p0, Lty;->j:I

    invoke-virtual {p0, v1, v3}, Lty;->l(II)V

    goto :goto_3

    :cond_7
    iget-object v1, p0, Lty;->l:LgA;

    invoke-interface {v1, p0}, LgA;->f(Lty;)V

    :goto_3
    iget v1, p0, Lty;->z:I

    if-eq v1, v4, :cond_8

    if-ne v1, v2, :cond_b

    :cond_8
    iget-object v1, p0, Lty;->c:Lbw;

    if-eqz v1, :cond_9

    invoke-interface {v1, p0}, Lbw;->b(LXv;)Z

    move-result v1

    if-eqz v1, :cond_a

    :cond_9
    const/4 v6, 0x1

    :cond_a
    if-eqz v6, :cond_b

    iget-object v1, p0, Lty;->l:LgA;

    invoke-virtual {p0}, Lty;->b()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-interface {v1, v2}, LgA;->h(Landroid/graphics/drawable/Drawable;)V

    :cond_b
    sget-boolean v1, Lty;->A:Z

    if-eqz v1, :cond_c

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    :cond_c
    monitor-exit v0

    return-void

    :cond_d
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot restart a running request"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_e
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "You can\'t start or clear loads in RequestListener or Target callbacks. If you\'re trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :goto_4
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final k()Z
    .locals 3

    iget-object v0, p0, Lty;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lty;->z:I

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final l(II)V
    .locals 22

    move-object/from16 v1, p0

    move/from16 v0, p1

    move/from16 v2, p2

    iget-object v3, v1, Lty;->a:Lfz;

    invoke-virtual {v3}, Lfz;->a()V

    iget-object v3, v1, Lty;->b:Ljava/lang/Object;

    monitor-enter v3

    :try_start_0
    sget-boolean v20, Lty;->A:Z

    if-eqz v20, :cond_0

    sget v4, Lhp;->a:I

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    goto :goto_1

    :goto_0
    move-object/from16 v21, v3

    move-object v3, v1

    move-object/from16 v1, v21

    goto/16 :goto_5

    :cond_0
    :goto_1
    iget v4, v1, Lty;->z:I

    const/4 v5, 0x3

    if-eq v4, v5, :cond_1

    monitor-exit v3

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    iput v4, v1, Lty;->z:I

    iget-object v5, v1, Lty;->h:Ly5;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/high16 v5, -0x80000000

    const/high16 v6, 0x3f800000    # 1.0f

    if-ne v0, v5, :cond_2

    goto :goto_2

    :cond_2
    int-to-float v0, v0

    mul-float/2addr v0, v6

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    :goto_2
    iput v0, v1, Lty;->v:I

    if-ne v2, v5, :cond_3

    move v0, v2

    goto :goto_3

    :cond_3
    int-to-float v0, v2

    mul-float/2addr v6, v0

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v0

    :goto_3
    iput v0, v1, Lty;->w:I

    if-eqz v20, :cond_4

    sget v0, Lhp;->a:I

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    :cond_4
    iget-object v2, v1, Lty;->r:Lcg;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v5, v3

    :try_start_1
    iget-object v3, v1, Lty;->e:LRj;

    move v0, v4

    iget-object v4, v1, Lty;->f:Ljava/lang/Object;

    iget-object v6, v1, Lty;->h:Ly5;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_9

    move-object v7, v5

    :try_start_2
    iget-object v5, v6, Ly5;->i:LSm;

    iget v8, v1, Lty;->v:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_8

    move-object v9, v7

    :try_start_3
    iget v7, v1, Lty;->w:I

    move v10, v8

    iget-object v8, v6, Ly5;->m:Ljava/lang/Class;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_7

    move-object v11, v9

    :try_start_4
    iget-object v9, v1, Lty;->g:Ljava/lang/Class;

    move v12, v10

    iget-object v10, v1, Lty;->k:Lwu;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_6

    move-object v13, v11

    :try_start_5
    iget-object v11, v6, Ly5;->b:LVd;

    move v14, v12

    iget-object v12, v6, Ly5;->l:LA6;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    move-object v15, v13

    :try_start_6
    iget-boolean v13, v6, Ly5;->j:Z

    move/from16 v16, v14

    iget-boolean v14, v6, Ly5;->p:Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    move-object/from16 v17, v15

    :try_start_7
    iget-object v15, v6, Ly5;->k:Lvt;

    iget-boolean v0, v6, Ly5;->f:Z

    iget-boolean v6, v6, Ly5;->q:Z

    move/from16 v18, v0

    iget-object v0, v1, Lty;->o:Lp3;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    move/from16 v19, v18

    move-object/from16 v18, v1

    move-object/from16 v1, v17

    move/from16 v17, v6

    move/from16 v6, v16

    move/from16 v16, v19

    move-object/from16 v19, v0

    const/4 v0, 0x2

    :try_start_8
    invoke-virtual/range {v2 .. v19}, Lcg;->a(LRj;Ljava/lang/Object;LSm;IILjava/lang/Class;Ljava/lang/Class;Lwu;LVd;LA6;ZZLvt;ZZLty;Lp3;)Lw4;

    move-result-object v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    move-object/from16 v3, v18

    :try_start_9
    iput-object v2, v3, Lty;->q:Lw4;

    iget v2, v3, Lty;->z:I

    if-eq v2, v0, :cond_5

    const/4 v0, 0x0

    iput-object v0, v3, Lty;->q:Lw4;

    goto :goto_4

    :catchall_1
    move-exception v0

    goto :goto_5

    :cond_5
    :goto_4
    if-eqz v20, :cond_6

    sget v0, Lhp;->a:I

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    :cond_6
    monitor-exit v1

    return-void

    :catchall_2
    move-exception v0

    move-object/from16 v3, v18

    goto :goto_5

    :catchall_3
    move-exception v0

    move-object v3, v1

    move-object/from16 v1, v17

    goto :goto_5

    :catchall_4
    move-exception v0

    move-object v3, v1

    move-object v1, v15

    goto :goto_5

    :catchall_5
    move-exception v0

    move-object v3, v1

    move-object v1, v13

    goto :goto_5

    :catchall_6
    move-exception v0

    move-object v3, v1

    move-object v1, v11

    goto :goto_5

    :catchall_7
    move-exception v0

    move-object v3, v1

    move-object v1, v9

    goto :goto_5

    :catchall_8
    move-exception v0

    move-object v3, v1

    move-object v1, v7

    goto :goto_5

    :catchall_9
    move-exception v0

    move-object v3, v1

    move-object v1, v5

    :goto_5
    monitor-exit v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lty;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lty;->f:Ljava/lang/Object;

    iget-object v2, p0, Lty;->g:Ljava/lang/Class;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "[model="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", transcodeClass="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
