.class public final LHj;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:LWy;

.field public final b:Landroid/os/Handler;

.field public final c:Ljava/util/ArrayList;

.field public final d:Lgw;

.field public final e:LN5;

.field public f:Z

.field public g:Z

.field public h:Law;

.field public i:LEj;

.field public j:Z

.field public k:LEj;

.field public l:Landroid/graphics/Bitmap;

.field public m:LEj;

.field public n:I

.field public o:I

.field public p:I


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/a;LWy;IILandroid/graphics/Bitmap;)V
    .locals 6

    iget-object v0, p1, Lcom/bumptech/glide/a;->a:LN5;

    iget-object p1, p1, Lcom/bumptech/glide/a;->c:LRj;

    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lgw;

    move-result-object v1

    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lgw;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Law;

    iget-object v3, p1, Lgw;->a:Lcom/bumptech/glide/a;

    iget-object v4, p1, Lgw;->b:Landroid/content/Context;

    const-class v5, Landroid/graphics/Bitmap;

    invoke-direct {v2, v3, p1, v5, v4}, Law;-><init>(Lcom/bumptech/glide/a;Lgw;Ljava/lang/Class;Landroid/content/Context;)V

    sget-object p1, Lgw;->k:Lmw;

    invoke-virtual {v2, p1}, Law;->w(Ly5;)Law;

    move-result-object p1

    new-instance v2, Lmw;

    invoke-direct {v2}, Ly5;-><init>()V

    sget-object v3, LVd;->c:LVd;

    invoke-virtual {v2, v3}, Ly5;->e(LVd;)Ly5;

    move-result-object v2

    check-cast v2, Lmw;

    invoke-virtual {v2}, Ly5;->u()Ly5;

    move-result-object v2

    check-cast v2, Lmw;

    invoke-virtual {v2}, Ly5;->q()Ly5;

    move-result-object v2

    check-cast v2, Lmw;

    invoke-virtual {v2, p3, p4}, Ly5;->j(II)Ly5;

    move-result-object p3

    invoke-virtual {p1, p3}, Law;->w(Ly5;)Law;

    move-result-object p1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, LHj;->c:Ljava/util/ArrayList;

    iput-object v1, p0, LHj;->d:Lgw;

    new-instance p3, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p4

    new-instance v1, LGj;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p0}, LGj;-><init>(ILjava/lang/Object;)V

    invoke-direct {p3, p4, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, LHj;->e:LN5;

    iput-object p3, p0, LHj;->b:Landroid/os/Handler;

    iput-object p1, p0, LHj;->h:Law;

    iput-object p2, p0, LHj;->a:LWy;

    sget-object p1, LWC;->b:LWC;

    invoke-virtual {p0, p1, p5}, LHj;->c(LCB;Landroid/graphics/Bitmap;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    iget-boolean v0, p0, LHj;->f:Z

    if-eqz v0, :cond_5

    iget-boolean v0, p0, LHj;->g:Z

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, p0, LHj;->m:LEj;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    iput-object v1, p0, LHj;->m:LEj;

    invoke-virtual {p0, v0}, LHj;->b(LEj;)V

    return-void

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, LHj;->g:Z

    iget-object v1, p0, LHj;->a:LWy;

    iget-object v2, v1, LWy;->l:LIj;

    iget v3, v2, LIj;->c:I

    if-lez v3, :cond_4

    iget v4, v1, LWy;->k:I

    if-gez v4, :cond_2

    goto :goto_0

    :cond_2
    if-ltz v4, :cond_3

    if-ge v4, v3, :cond_3

    iget-object v2, v2, LIj;->e:Ljava/util/ArrayList;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LDj;

    iget v2, v2, LDj;->i:I

    goto :goto_1

    :cond_3
    const/4 v2, -0x1

    goto :goto_1

    :cond_4
    :goto_0
    const/4 v2, 0x0

    :goto_1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    int-to-long v5, v2

    add-long/2addr v3, v5

    iget v2, v1, LWy;->k:I

    add-int/2addr v2, v0

    iget-object v0, v1, LWy;->l:LIj;

    iget v0, v0, LIj;->c:I

    rem-int/2addr v2, v0

    iput v2, v1, LWy;->k:I

    new-instance v0, LEj;

    iget-object v5, p0, LHj;->b:Landroid/os/Handler;

    invoke-direct {v0, v5, v2, v3, v4}, LEj;-><init>(Landroid/os/Handler;IJ)V

    iput-object v0, p0, LHj;->k:LEj;

    iget-object v0, p0, LHj;->h:Law;

    new-instance v2, Let;

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-direct {v2, v3}, Let;-><init>(Ljava/lang/Object;)V

    new-instance v3, Lmw;

    invoke-direct {v3}, Ly5;-><init>()V

    invoke-virtual {v3, v2}, Ly5;->p(Let;)Ly5;

    move-result-object v2

    check-cast v2, Lmw;

    invoke-virtual {v0, v2}, Law;->w(Ly5;)Law;

    move-result-object v0

    invoke-virtual {v0, v1}, Law;->C(Ljava/lang/Object;)Law;

    move-result-object v0

    iget-object v1, p0, LHj;->k:LEj;

    invoke-virtual {v0, v1, v0}, Law;->z(LgA;Ly5;)V

    :cond_5
    :goto_2
    return-void
.end method

.method public final b(LEj;)V
    .locals 8

    const/4 v0, 0x0

    iput-boolean v0, p0, LHj;->g:Z

    iget-boolean v0, p0, LHj;->j:Z

    const/4 v1, 0x2

    iget-object v2, p0, LHj;->b:Landroid/os/Handler;

    if-eqz v0, :cond_0

    invoke-virtual {v2, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void

    :cond_0
    iget-boolean v0, p0, LHj;->f:Z

    if-nez v0, :cond_1

    iput-object p1, p0, LHj;->m:LEj;

    return-void

    :cond_1
    iget-object v0, p1, LEj;->g:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_9

    iget-object v0, p0, LHj;->l:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_2

    iget-object v3, p0, LHj;->e:LN5;

    invoke-interface {v3, v0}, LN5;->h(Landroid/graphics/Bitmap;)V

    const/4 v0, 0x0

    iput-object v0, p0, LHj;->l:Landroid/graphics/Bitmap;

    :cond_2
    iget-object v0, p0, LHj;->i:LEj;

    iput-object p1, p0, LHj;->i:LEj;

    iget-object p1, p0, LHj;->c:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    :goto_0
    if-ltz v3, :cond_8

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LFj;

    check-cast v4, LAj;

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v5

    :goto_1
    instance-of v6, v5, Landroid/graphics/drawable/Drawable;

    if-eqz v6, :cond_3

    check-cast v5, Landroid/graphics/drawable/Drawable;

    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v5

    goto :goto_1

    :cond_3
    if-nez v5, :cond_4

    invoke-virtual {v4}, LAj;->stop()V

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    goto :goto_3

    :cond_4
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    iget-object v5, v4, LAj;->a:LL2;

    iget-object v5, v5, LL2;->b:Ljava/lang/Object;

    check-cast v5, LHj;

    iget-object v6, v5, LHj;->i:LEj;

    const/4 v7, -0x1

    if-eqz v6, :cond_5

    iget v6, v6, LEj;->e:I

    goto :goto_2

    :cond_5
    move v6, v7

    :goto_2
    iget-object v5, v5, LHj;->a:LWy;

    iget-object v5, v5, LWy;->l:LIj;

    iget v5, v5, LIj;->c:I

    add-int/lit8 v5, v5, -0x1

    if-ne v6, v5, :cond_6

    iget v5, v4, LAj;->f:I

    add-int/lit8 v5, v5, 0x1

    iput v5, v4, LAj;->f:I

    :cond_6
    iget v5, v4, LAj;->g:I

    if-eq v5, v7, :cond_7

    iget v6, v4, LAj;->f:I

    if-lt v6, v5, :cond_7

    invoke-virtual {v4}, LAj;->stop()V

    :cond_7
    :goto_3
    add-int/lit8 v3, v3, -0x1

    goto :goto_0

    :cond_8
    if-eqz v0, :cond_9

    invoke-virtual {v2, v1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    :cond_9
    invoke-virtual {p0}, LHj;->a()V

    return-void
.end method

.method public final c(LCB;Landroid/graphics/Bitmap;)V
    .locals 3

    const-string v0, "Argument must not be null"

    invoke-static {v0, p1}, LQj;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v0, p2}, LQj;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p2, p0, LHj;->l:Landroid/graphics/Bitmap;

    iget-object v0, p0, LHj;->h:Law;

    new-instance v1, Lmw;

    invoke-direct {v1}, Ly5;-><init>()V

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v2}, Ly5;->s(LCB;Z)Ly5;

    move-result-object p1

    invoke-virtual {v0, p1}, Law;->w(Ly5;)Law;

    move-result-object p1

    iput-object p1, p0, LHj;->h:Law;

    invoke-static {p2}, LvD;->c(Landroid/graphics/Bitmap;)I

    move-result p1

    iput p1, p0, LHj;->n:I

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p1

    iput p1, p0, LHj;->o:I

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    iput p1, p0, LHj;->p:I

    return-void
.end method
