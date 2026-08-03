.class public final LU/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final e:Ljava/lang/ThreadLocal;

.field public static final f:LU/k;


# instance fields
.field public a:Ljava/util/ArrayList;

.field public b:J

.field public c:J

.field public d:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, LU/n;->e:Ljava/lang/ThreadLocal;

    new-instance v0, LU/k;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LU/k;-><init>(I)V

    sput-object v0, LU/n;->f:LU/k;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 4

    iget-boolean v0, p1, Landroidx/recyclerview/widget/RecyclerView;->n:Z

    if-eqz v0, :cond_0

    iget-wide v0, p0, LU/n;->b:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    move-result-wide v0

    iput-wide v0, p0, LU/n;->b:J

    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_0
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->V:LU/l;

    iput p2, p1, LU/l;->a:I

    iput p3, p1, LU/l;->b:I

    return-void
.end method

.method public final b(J)V
    .locals 12

    const/4 v0, 0x0

    const/4 v1, 0x0

    iget-object v2, p0, LU/n;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v4, v0

    move v5, v4

    :goto_0
    if-ge v4, v3, :cond_1

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v6}, Landroid/view/View;->getWindowVisibility()I

    move-result v7

    if-nez v7, :cond_0

    iget-object v7, v6, Landroidx/recyclerview/widget/RecyclerView;->V:LU/l;

    invoke-virtual {v7, v6, v0}, LU/l;->a(Landroidx/recyclerview/widget/RecyclerView;Z)V

    iget v6, v7, LU/l;->c:I

    add-int/2addr v5, v6

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    iget-object v4, p0, LU/n;->d:Ljava/util/ArrayList;

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->ensureCapacity(I)V

    move v5, v0

    :goto_1
    if-ge v5, v3, :cond_5

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v6}, Landroid/view/View;->getWindowVisibility()I

    move-result v7

    if-eqz v7, :cond_2

    goto :goto_3

    :cond_2
    iget-object v6, v6, Landroidx/recyclerview/widget/RecyclerView;->V:LU/l;

    iget v7, v6, LU/l;->a:I

    invoke-static {v7}, Ljava/lang/Math;->abs(I)I

    iget v7, v6, LU/l;->b:I

    invoke-static {v7}, Ljava/lang/Math;->abs(I)I

    iget v7, v6, LU/l;->c:I

    mul-int/lit8 v7, v7, 0x2

    if-lez v7, :cond_4

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-gtz p1, :cond_3

    new-instance p1, LU/m;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LU/m;

    :goto_2
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw v1

    :cond_4
    :goto_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_5
    sget-object v2, LU/n;->f:LU/k;

    invoke-static {v4, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    move v2, v0

    :goto_4
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_b

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LU/m;

    iget-object v5, v3, LU/m;->d:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v5, :cond_6

    goto :goto_a

    :cond_6
    iget-boolean v6, v3, LU/m;->a:Z

    if-eqz v6, :cond_7

    const-wide v6, 0x7fffffffffffffffL

    goto :goto_5

    :cond_7
    move-wide v6, p1

    :goto_5
    iget v8, v3, LU/m;->e:I

    iget-object v9, v5, Landroidx/recyclerview/widget/RecyclerView;->d:LJ0/d;

    invoke-virtual {v9}, LJ0/d;->m()I

    move-result v9

    move v10, v0

    :goto_6
    if-ge v10, v9, :cond_9

    iget-object v11, v5, Landroidx/recyclerview/widget/RecyclerView;->d:LJ0/d;

    invoke-virtual {v11, v10}, LJ0/d;->l(I)Landroid/view/View;

    move-result-object v11

    invoke-static {v11}, Landroidx/recyclerview/widget/RecyclerView;->u(Landroid/view/View;)LU/O;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez v8, :cond_8

    invoke-virtual {v1}, LU/O;->g()Z

    move-result v11

    if-nez v11, :cond_8

    goto :goto_8

    :cond_8
    add-int/lit8 v10, v10, 0x1

    goto :goto_6

    :cond_9
    iget-object v9, v5, Landroidx/recyclerview/widget/RecyclerView;->a:LU/I;

    :try_start_0
    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView;->z()V

    invoke-virtual {v9, v8, v6, v7}, LU/I;->i(IJ)LU/O;

    invoke-virtual {v1}, LU/O;->f()Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-virtual {v1}, LU/O;->g()Z

    move-result v6

    if-nez v6, :cond_a

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v9, v1}, LU/I;->f(Landroid/view/View;)V

    goto :goto_7

    :catchall_0
    move-exception p1

    goto :goto_9

    :cond_a
    invoke-virtual {v9, v1, v0}, LU/I;->a(LU/O;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_7
    invoke-virtual {v5, v0}, Landroidx/recyclerview/widget/RecyclerView;->A(Z)V

    :goto_8
    iput-boolean v0, v3, LU/m;->a:Z

    iput v0, v3, LU/m;->b:I

    iput v0, v3, LU/m;->c:I

    iput-object v1, v3, LU/m;->d:Landroidx/recyclerview/widget/RecyclerView;

    iput v0, v3, LU/m;->e:I

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :goto_9
    invoke-virtual {v5, v0}, Landroidx/recyclerview/widget/RecyclerView;->A(Z)V

    throw p1

    :cond_b
    :goto_a
    return-void
.end method

.method public final run()V
    .locals 9

    const-wide/16 v0, 0x0

    :try_start_0
    const-string v2, "RV Prefetch"

    sget v3, Lz/a;->a:I

    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v2, p0, LU/n;->a:Ljava/util/ArrayList;

    :try_start_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v3, :cond_0

    iput-wide v0, p0, LU/n;->b:J

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void

    :cond_0
    :try_start_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    move-wide v5, v0

    :goto_0
    if-ge v4, v3, :cond_2

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v7}, Landroid/view/View;->getWindowVisibility()I

    move-result v8

    if-nez v8, :cond_1

    invoke-virtual {v7}, Landroid/view/View;->getDrawingTime()J

    move-result-wide v7

    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v2

    goto :goto_2

    :cond_1
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    cmp-long v2, v5, v0

    if-nez v2, :cond_3

    iput-wide v0, p0, LU/n;->b:J

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void

    :cond_3
    :try_start_3
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v5, v6}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v2

    iget-wide v4, p0, LU/n;->c:J

    add-long/2addr v2, v4

    invoke-virtual {p0, v2, v3}, LU/n;->b(J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    iput-wide v0, p0, LU/n;->b:J

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void

    :goto_2
    iput-wide v0, p0, LU/n;->b:J

    sget v0, Lz/a;->a:I

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v2
.end method
