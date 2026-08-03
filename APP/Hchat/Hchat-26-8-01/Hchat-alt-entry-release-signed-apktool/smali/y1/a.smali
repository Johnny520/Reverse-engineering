.class public abstract Ly1/a;
.super Landroid/view/ViewGroup;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public g:Ljava/lang/ref/WeakReference;

.field public h:Landroid/os/IBinder;

.field public i:Ly1/x2;

.field public j:Li0/o;

.field public k:Ly1/f1;

.field public l:Lfg/a;

.field public m:Z

.field public n:Z

.field public o:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-direct {p0, p1, v0, v1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    invoke-virtual {p0, p1}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 14
    .line 15
    .line 16
    new-instance p1, Ly1/i2;

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    invoke-direct {p1, p0, v0}, Ly1/i2;-><init>(Ly1/a;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Lokio/a;

    .line 26
    .line 27
    const/16 v1, 0x1b

    .line 28
    .line 29
    invoke-direct {v0, v1}, Lokio/a;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-static {p0}, La7/a;->w(Landroid/view/View;)Lk3/a;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget-object v1, v1, Lk3/a;->a:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    new-instance v1, Ly1/j2;

    .line 42
    .line 43
    invoke-direct {v1, p0, p1, v0}, Ly1/j2;-><init>(Ly1/a;Ly1/i2;Lokio/a;)V

    .line 44
    .line 45
    .line 46
    iput-object v1, p0, Ly1/a;->l:Lfg/a;

    .line 47
    .line 48
    return-void
.end method

.method public static synthetic getComposeViewContext$ui$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method private static synthetic getDisposeViewCompositionStrategy$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic getShowLayoutBounds$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method private final setParentContext(Li0/o;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/a;->j:Li0/o;

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    iput-object p1, p0, Ly1/a;->j:Li0/o;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iput-object v0, p0, Ly1/a;->g:Ljava/lang/ref/WeakReference;

    .line 11
    .line 12
    :cond_0
    iget-object p1, p0, Ly1/a;->i:Ly1/x2;

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p1}, Ly1/x2;->e()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Ly1/a;->i:Ly1/x2;

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0}, Ly1/a;->g()V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void
.end method

.method private final setPreviousAttachedWindowToken(Landroid/os/IBinder;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/a;->h:Landroid/os/IBinder;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Ly1/a;->h:Landroid/os/IBinder;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iput-object p1, p0, Ly1/a;->g:Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    :cond_0
    return-void
.end method


# virtual methods
.method public abstract a(Li0/h0;I)V
.end method

.method public final addView(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ly1/a;->d()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final addView(Landroid/view/View;I)V
    .locals 0

    .line 8
    invoke-virtual {p0}, Ly1/a;->d()V

    .line 9
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    return-void
.end method

.method public final addView(Landroid/view/View;II)V
    .locals 0

    .line 10
    invoke-virtual {p0}, Ly1/a;->d()V

    .line 11
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    return-void
.end method

.method public final addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 14
    invoke-virtual {p0}, Ly1/a;->d()V

    .line 15
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 12
    invoke-virtual {p0}, Ly1/a;->d()V

    .line 13
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Ly1/a;->d()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    return p1
.end method

.method public final addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z
    .locals 0

    .line 9
    invoke-virtual {p0}, Ly1/a;->d()V

    .line 10
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z

    move-result p1

    return p1
.end method

.method public final b()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-direct {p0, v0}, Ly1/a;->setPreviousAttachedWindowToken(Landroid/os/IBinder;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Ly1/a;->k:Ly1/f1;

    .line 16
    .line 17
    if-nez v0, :cond_3

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v1, 0x0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 v0, 0x0

    .line 28
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    instance-of v2, v0, Ly1/t;

    .line 33
    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    move-object v1, v0

    .line 37
    check-cast v1, Ly1/t;

    .line 38
    .line 39
    :cond_2
    :goto_0
    if-eqz v1, :cond_3

    .line 40
    .line 41
    invoke-virtual {v1}, Ly1/t;->getComposeViewContext()Ly1/f1;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {p0}, Ly1/g0;->i(Landroid/view/View;)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {p0, v2, v0}, Ly1/a;->l(Landroid/view/View;Ly1/f1;)Ly1/f1;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v1, v0}, Ly1/t;->setComposeViewContext(Ly1/f1;)V

    .line 54
    .line 55
    .line 56
    :cond_3
    invoke-virtual {p0}, Ly1/a;->getShouldCreateCompositionOnAttachedToWindow()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_4

    .line 61
    .line 62
    invoke-virtual {p0}, Ly1/a;->g()V

    .line 63
    .line 64
    .line 65
    :cond_4
    :goto_1
    return-void
.end method

.method public final d()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Ly1/a;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    new-instance v2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v3, "Cannot add views to "

    .line 19
    .line 20
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, "; only Compose content is supported"

    .line 27
    .line 28
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v0
.end method

.method public final e()V
    .locals 2

    .line 1
    iget-object v0, p0, Ly1/a;->j:Li0/o;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Ly1/a;->k:Ly1/f1;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, v0, Ly1/f1;->a:Landroid/view/View;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v1, 0x1

    .line 24
    if-ne v0, v1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-string v0, "createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference."

    .line 28
    .line 29
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ly1/a;->g()V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final f()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    instance-of v2, v1, Ly1/t;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    check-cast v1, Ly1/t;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v1, v3

    .line 15
    :goto_0
    if-eqz v1, :cond_1

    .line 16
    .line 17
    iget-boolean v2, v1, Ly1/t;->P0:Z

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {v1}, Ly1/t;->getComposeViewContext()Ly1/f1;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Ly1/f1;->b()V

    .line 26
    .line 27
    .line 28
    iput-boolean v0, v1, Ly1/t;->P0:Z

    .line 29
    .line 30
    :cond_1
    iget-object v0, p0, Ly1/a;->i:Ly1/x2;

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-virtual {v0}, Ly1/x2;->e()V

    .line 35
    .line 36
    .line 37
    :cond_2
    iput-object v3, p0, Ly1/a;->i:Ly1/x2;

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final g()V
    .locals 6

    .line 1
    iget-object v0, p0, Ly1/a;->i:Ly1/x2;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    :try_start_0
    iput-boolean v1, p0, Ly1/a;->n:Z

    .line 8
    .line 9
    const-string v2, "Compose:initializeView"

    .line 10
    .line 11
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 12
    .line 13
    .line 14
    :try_start_1
    iget-object v2, p0, Ly1/a;->k:Ly1/f1;

    .line 15
    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Ly1/a;->j()Ly1/f1;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    :goto_0
    new-instance v3, La1/h;

    .line 26
    .line 27
    const/4 v4, 0x3

    .line 28
    invoke-direct {v3, p0, v4}, La1/h;-><init>(Ljava/lang/Object;I)V

    .line 29
    .line 30
    .line 31
    new-instance v4, Ls0/d;

    .line 32
    .line 33
    const v5, 0x3bca7461

    .line 34
    .line 35
    .line 36
    invoke-direct {v4, v5, v3, v1}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 37
    .line 38
    .line 39
    invoke-static {p0, v2, v4}, Ly1/z2;->a(Ly1/a;Ly1/f1;Ls0/d;)Ly1/x2;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iput-object v1, p0, Ly1/a;->i:Ly1/x2;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    .line 45
    :try_start_2
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 46
    .line 47
    .line 48
    iput-boolean v0, p0, Ly1/a;->n:Z

    .line 49
    .line 50
    return-void

    .line 51
    :catchall_1
    move-exception v1

    .line 52
    goto :goto_2

    .line 53
    :goto_1
    :try_start_3
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 54
    .line 55
    .line 56
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 57
    :goto_2
    iput-boolean v0, p0, Ly1/a;->n:Z

    .line 58
    .line 59
    throw v1

    .line 60
    :cond_1
    return-void
.end method

.method public final getAutoClearFocusBehavior-4UtRPd4()I
    .locals 2

    .line 1
    const v0, 0x7f06002e

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    instance-of v1, v0, Ly1/u0;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    check-cast v0, Ly1/u0;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget v0, v0, Ly1/u0;->a:I

    .line 19
    .line 20
    return v0

    .line 21
    :cond_1
    const/4 v0, 0x1

    .line 22
    return v0
.end method

.method public final getComposeViewContext$ui()Ly1/f1;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/a;->k:Ly1/f1;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getHasComposition()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/a;->i:Ly1/x2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public getShouldCreateCompositionOnAttachedToWindow()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final getShowLayoutBounds()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ly1/a;->m:Z

    .line 2
    .line 3
    return v0
.end method

.method public h(ZIIII)V
    .locals 2

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    sub-int/2addr p4, p2

    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    sub-int/2addr p4, p2

    .line 22
    sub-int/2addr p5, p3

    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    sub-int/2addr p5, p2

    .line 28
    invoke-virtual {p1, v0, v1, p4, p5}, Landroid/view/View;->layout(IIII)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public i(II)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    sub-int/2addr v2, v3

    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    sub-int/2addr v2, v3

    .line 26
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    sub-int/2addr v3, v4

    .line 39
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    sub-int/2addr v3, v4

    .line 44
    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    invoke-static {v2, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    invoke-static {v0, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    invoke-virtual {v1, p1, p2}, Landroid/view/View;->measure(II)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    add-int/2addr p2, p1

    .line 76
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    add-int/2addr p1, p2

    .line 81
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    add-int/2addr v0, p2

    .line 90
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    add-int/2addr p2, v0

    .line 95
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 96
    .line 97
    .line 98
    return-void
.end method

.method public final isTransitionGroup()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ly1/a;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-super {p0}, Landroid/view/ViewGroup;->isTransitionGroup()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0

    .line 14
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 15
    return v0
.end method

.method public final j()Ly1/f1;
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    :cond_0
    move-object v0, v1

    .line 9
    goto :goto_1

    .line 10
    :cond_1
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    instance-of v2, v0, Ly1/t;

    .line 16
    .line 17
    if-eqz v2, :cond_2

    .line 18
    .line 19
    check-cast v0, Ly1/t;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    move-object v0, v1

    .line 23
    :goto_0
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0}, Ly1/t;->getComposeViewContext()Ly1/f1;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :goto_1
    invoke-static {p0}, Ly1/g0;->i(Landroid/view/View;)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-static {v4}, Ly1/g0;->j(Landroid/view/View;)Ly1/f1;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    if-nez v2, :cond_b

    .line 38
    .line 39
    invoke-virtual {p0}, Ly1/a;->k()Li0/o;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-static {v4}, Landroidx/lifecycle/d0;->a(Landroid/view/View;)Landroidx/lifecycle/q;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    if-nez v2, :cond_4

    .line 48
    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    iget-object v2, v0, Ly1/f1;->c:Landroidx/lifecycle/q;

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_3
    move-object v2, v1

    .line 55
    :goto_2
    if-eqz v2, :cond_5

    .line 56
    .line 57
    :cond_4
    move-object v6, v2

    .line 58
    goto :goto_3

    .line 59
    :cond_5
    const-string v0, "Composed into the View which doesn\'t propagate ViewTreeLifecycleOwner!"

    .line 60
    .line 61
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-object v1

    .line 65
    :goto_3
    invoke-static {v4}, Lac/p;->t(Landroid/view/View;)Lu3/c;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    if-nez v2, :cond_7

    .line 70
    .line 71
    if-eqz v0, :cond_6

    .line 72
    .line 73
    iget-object v2, v0, Ly1/f1;->d:Lu3/c;

    .line 74
    .line 75
    goto :goto_4

    .line 76
    :cond_6
    move-object v2, v1

    .line 77
    :goto_4
    if-eqz v2, :cond_8

    .line 78
    .line 79
    :cond_7
    move-object v7, v2

    .line 80
    goto :goto_5

    .line 81
    :cond_8
    const-string v0, "Composed into the View which doesn\'t propagate ViewTreeSavedStateRegistryOwner!"

    .line 82
    .line 83
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    return-object v1

    .line 87
    :goto_5
    invoke-static {v4}, Landroidx/lifecycle/d0;->b(Landroid/view/View;)Lc9/a1;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    if-nez v2, :cond_a

    .line 92
    .line 93
    if-eqz v0, :cond_9

    .line 94
    .line 95
    iget-object v1, v0, Ly1/f1;->e:Lc9/a1;

    .line 96
    .line 97
    :cond_9
    move-object v8, v1

    .line 98
    goto :goto_6

    .line 99
    :cond_a
    move-object v8, v2

    .line 100
    :goto_6
    new-instance v2, Ly1/f1;

    .line 101
    .line 102
    invoke-static {v4}, Ly1/g0;->i(Landroid/view/View;)Landroid/view/View;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-static {v0}, Ly1/g0;->j(Landroid/view/View;)Ly1/f1;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-direct/range {v2 .. v8}, Ly1/f1;-><init>(Ly1/f1;Landroid/view/View;Li0/o;Landroidx/lifecycle/q;Lu3/c;Lc9/a1;)V

    .line 111
    .line 112
    .line 113
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 114
    .line 115
    invoke-direct {v0, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    const v1, 0x7f06002a

    .line 119
    .line 120
    .line 121
    invoke-virtual {v4, v1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    return-object v2

    .line 125
    :cond_b
    invoke-virtual {p0, v4, v2}, Ly1/a;->l(Landroid/view/View;Ly1/f1;)Ly1/f1;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    return-object v0
.end method

.method public final k()Li0/o;
    .locals 11

    .line 1
    iget-object v0, p0, Ly1/a;->j:Li0/o;

    .line 2
    .line 3
    if-nez v0, :cond_1a

    .line 4
    .line 5
    invoke-static {p0}, Ly1/v2;->a(Landroid/view/View;)Li0/o;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :goto_0
    if-nez v0, :cond_1

    .line 17
    .line 18
    instance-of v2, v1, Landroid/view/View;

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    check-cast v1, Landroid/view/View;

    .line 23
    .line 24
    invoke-static {v1}, Ly1/v2;->a(Landroid/view/View;)Li0/o;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v1}, Lfb/v0;->t(Landroid/view/View;)Landroid/view/ViewParent;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    :goto_1
    const/4 v1, 0x0

    .line 34
    if-eqz v0, :cond_4

    .line 35
    .line 36
    instance-of v2, v0, Li0/y1;

    .line 37
    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    move-object v2, v0

    .line 41
    check-cast v2, Li0/y1;

    .line 42
    .line 43
    iget-object v2, v2, Li0/y1;->u:Ltg/b0;

    .line 44
    .line 45
    invoke-virtual {v2}, Ltg/b0;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Li0/u1;

    .line 50
    .line 51
    sget-object v3, Li0/u1;->h:Li0/u1;

    .line 52
    .line 53
    invoke-virtual {v2, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-lez v2, :cond_2

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_2
    move-object v2, v1

    .line 61
    goto :goto_3

    .line 62
    :cond_3
    :goto_2
    move-object v2, v0

    .line 63
    :goto_3
    if-eqz v2, :cond_5

    .line 64
    .line 65
    new-instance v3, Ljava/lang/ref/WeakReference;

    .line 66
    .line 67
    invoke-direct {v3, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iput-object v3, p0, Ly1/a;->g:Ljava/lang/ref/WeakReference;

    .line 71
    .line 72
    goto :goto_4

    .line 73
    :cond_4
    move-object v0, v1

    .line 74
    :cond_5
    :goto_4
    if-nez v0, :cond_1a

    .line 75
    .line 76
    iget-object v0, p0, Ly1/a;->g:Ljava/lang/ref/WeakReference;

    .line 77
    .line 78
    if-eqz v0, :cond_6

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Li0/o;

    .line 85
    .line 86
    if-eqz v0, :cond_6

    .line 87
    .line 88
    instance-of v2, v0, Li0/y1;

    .line 89
    .line 90
    if-eqz v2, :cond_7

    .line 91
    .line 92
    move-object v2, v0

    .line 93
    check-cast v2, Li0/y1;

    .line 94
    .line 95
    iget-object v2, v2, Li0/y1;->u:Ltg/b0;

    .line 96
    .line 97
    invoke-virtual {v2}, Ltg/b0;->getValue()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    check-cast v2, Li0/u1;

    .line 102
    .line 103
    sget-object v3, Li0/u1;->h:Li0/u1;

    .line 104
    .line 105
    invoke-virtual {v2, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-lez v2, :cond_6

    .line 110
    .line 111
    goto :goto_5

    .line 112
    :cond_6
    move-object v0, v1

    .line 113
    :cond_7
    :goto_5
    if-nez v0, :cond_1a

    .line 114
    .line 115
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-nez v0, :cond_8

    .line 120
    .line 121
    new-instance v0, Ljava/lang/StringBuilder;

    .line 122
    .line 123
    const-string v2, "Cannot locate windowRecomposer; View "

    .line 124
    .line 125
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    const-string v2, " is not attached to a window"

    .line 132
    .line 133
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-static {v0}, Lu1/a;->b(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    :cond_8
    invoke-static {p0}, Lfb/v0;->t(Landroid/view/View;)Landroid/view/ViewParent;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    move-object v2, p0

    .line 148
    :goto_6
    instance-of v3, v0, Landroid/view/View;

    .line 149
    .line 150
    if-eqz v3, :cond_a

    .line 151
    .line 152
    check-cast v0, Landroid/view/View;

    .line 153
    .line 154
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    const v4, 0x1020002

    .line 159
    .line 160
    .line 161
    if-ne v3, v4, :cond_9

    .line 162
    .line 163
    goto :goto_7

    .line 164
    :cond_9
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    move-object v10, v2

    .line 169
    move-object v2, v0

    .line 170
    move-object v0, v10

    .line 171
    goto :goto_6

    .line 172
    :cond_a
    :goto_7
    invoke-static {v2}, Ly1/v2;->a(Landroid/view/View;)Li0/o;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    if-nez v0, :cond_16

    .line 177
    .line 178
    sget-object v0, Ly1/r2;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 179
    .line 180
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    check-cast v0, Ly1/q2;

    .line 185
    .line 186
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    sget-object v0, Lwf/h;->g:Lwf/h;

    .line 190
    .line 191
    sget-object v3, Ly1/n0;->s:Lsf/i;

    .line 192
    .line 193
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    if-ne v3, v4, :cond_b

    .line 202
    .line 203
    sget-object v3, Ly1/n0;->s:Lsf/i;

    .line 204
    .line 205
    invoke-virtual {v3}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    check-cast v3, Lwf/g;

    .line 210
    .line 211
    goto :goto_8

    .line 212
    :cond_b
    sget-object v3, Ly1/n0;->t:Ld6/m;

    .line 213
    .line 214
    invoke-virtual {v3}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    check-cast v3, Lwf/g;

    .line 219
    .line 220
    if-eqz v3, :cond_15

    .line 221
    .line 222
    :goto_8
    invoke-interface {v3, v0}, Lwf/g;->e(Lwf/g;)Lwf/g;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    sget-object v4, Li0/e;->i:Li0/e;

    .line 227
    .line 228
    invoke-interface {v3, v4}, Lwf/g;->s(Lwf/f;)Lwf/e;

    .line 229
    .line 230
    .line 231
    move-result-object v4

    .line 232
    check-cast v4, Li0/d;

    .line 233
    .line 234
    const/4 v5, 0x0

    .line 235
    if-eqz v4, :cond_c

    .line 236
    .line 237
    new-instance v6, Li0/d;

    .line 238
    .line 239
    invoke-direct {v6, v4}, Li0/d;-><init>(Li0/d;)V

    .line 240
    .line 241
    .line 242
    iget-object v4, v6, Li0/d;->i:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast v4, Lj8/f;

    .line 245
    .line 246
    iget-object v7, v4, Lj8/f;->b:Ljava/lang/Object;

    .line 247
    .line 248
    monitor-enter v7

    .line 249
    :try_start_0
    iput-boolean v5, v4, Lj8/f;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 250
    .line 251
    monitor-exit v7

    .line 252
    goto :goto_9

    .line 253
    :catchall_0
    move-exception v0

    .line 254
    monitor-exit v7

    .line 255
    throw v0

    .line 256
    :cond_c
    move-object v6, v1

    .line 257
    :goto_9
    new-instance v4, Lgg/u;

    .line 258
    .line 259
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 260
    .line 261
    .line 262
    sget-object v7, Ly0/b;->v:Ly0/b;

    .line 263
    .line 264
    invoke-interface {v3, v7}, Lwf/g;->s(Lwf/f;)Lwf/e;

    .line 265
    .line 266
    .line 267
    move-result-object v7

    .line 268
    check-cast v7, Ly0/p;

    .line 269
    .line 270
    if-nez v7, :cond_d

    .line 271
    .line 272
    new-instance v7, Ly1/z1;

    .line 273
    .line 274
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 275
    .line 276
    .line 277
    move-result-object v8

    .line 278
    invoke-virtual {v8}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 279
    .line 280
    .line 281
    move-result-object v8

    .line 282
    invoke-direct {v7, v8}, Ly1/z1;-><init>(Landroid/content/Context;)V

    .line 283
    .line 284
    .line 285
    iput-object v7, v4, Lgg/u;->g:Ljava/lang/Object;

    .line 286
    .line 287
    :cond_d
    if-eqz v6, :cond_e

    .line 288
    .line 289
    move-object v0, v6

    .line 290
    :cond_e
    invoke-interface {v3, v0}, Lwf/g;->e(Lwf/g;)Lwf/g;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    invoke-interface {v0, v7}, Lwf/g;->e(Lwf/g;)Lwf/g;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    new-instance v3, Li0/y1;

    .line 299
    .line 300
    invoke-direct {v3, v0}, Li0/y1;-><init>(Lwf/g;)V

    .line 301
    .line 302
    .line 303
    iget-object v7, v3, Li0/y1;->c:Ljava/lang/Object;

    .line 304
    .line 305
    monitor-enter v7

    .line 306
    const/4 v8, 0x1

    .line 307
    :try_start_1
    iput-boolean v8, v3, Li0/y1;->t:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 308
    .line 309
    monitor-exit v7

    .line 310
    invoke-static {v0}, Lqg/v;->a(Lwf/g;)Lvg/c;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    invoke-static {v2}, Landroidx/lifecycle/d0;->a(Landroid/view/View;)Landroidx/lifecycle/q;

    .line 315
    .line 316
    .line 317
    move-result-object v7

    .line 318
    if-eqz v7, :cond_f

    .line 319
    .line 320
    invoke-interface {v7}, Landroidx/lifecycle/q;->f()Landroidx/lifecycle/s;

    .line 321
    .line 322
    .line 323
    move-result-object v7

    .line 324
    goto :goto_a

    .line 325
    :cond_f
    move-object v7, v1

    .line 326
    :goto_a
    if-eqz v7, :cond_14

    .line 327
    .line 328
    new-instance v9, Ly1/s2;

    .line 329
    .line 330
    invoke-direct {v9, v2, v3}, Ly1/s2;-><init>(Landroid/view/View;Li0/y1;)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v2, v9}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 334
    .line 335
    .line 336
    new-instance v9, Lb/d;

    .line 337
    .line 338
    invoke-direct {v9, v0, v6, v3, v4}, Lb/d;-><init>(Lvg/c;Li0/d;Li0/y1;Lgg/u;)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v7, v9}, Landroidx/lifecycle/s;->a(Landroidx/lifecycle/p;)V

    .line 342
    .line 343
    .line 344
    const v0, 0x7f06002b

    .line 345
    .line 346
    .line 347
    invoke-virtual {v2, v0, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v2}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    const-string v4, "windowRecomposer cleanup"

    .line 355
    .line 356
    sget v6, Lrg/g;->a:I

    .line 357
    .line 358
    new-instance v6, Lrg/e;

    .line 359
    .line 360
    invoke-direct {v6, v0, v4, v5}, Lrg/e;-><init>(Landroid/os/Handler;Ljava/lang/String;Z)V

    .line 361
    .line 362
    .line 363
    iget-object v0, v6, Lrg/e;->l:Lrg/e;

    .line 364
    .line 365
    new-instance v4, Lci/j;

    .line 366
    .line 367
    const/16 v5, 0x1c

    .line 368
    .line 369
    invoke-direct {v4, v3, v2, v1, v5}, Lci/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 370
    .line 371
    .line 372
    sget-object v5, Lqg/u;->j:Lqg/u;

    .line 373
    .line 374
    const/4 v6, 0x2

    .line 375
    and-int/2addr v6, v8

    .line 376
    if-eqz v6, :cond_10

    .line 377
    .line 378
    sget-object v0, Lwf/h;->g:Lwf/h;

    .line 379
    .line 380
    :cond_10
    const/4 v6, 0x2

    .line 381
    and-int v7, v6, v6

    .line 382
    .line 383
    if-eqz v7, :cond_11

    .line 384
    .line 385
    sget-object v5, Lqg/u;->g:Lqg/u;

    .line 386
    .line 387
    :cond_11
    sget-object v7, Lwf/h;->g:Lwf/h;

    .line 388
    .line 389
    invoke-static {v7, v0, v8}, Lqg/v;->h(Lwf/g;Lwf/g;Z)Lwf/g;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    sget-object v7, Lqg/c0;->a:Lxg/e;

    .line 394
    .line 395
    if-eq v0, v7, :cond_12

    .line 396
    .line 397
    sget-object v9, Lwf/d;->g:Lwf/d;

    .line 398
    .line 399
    invoke-interface {v0, v9}, Lwf/g;->s(Lwf/f;)Lwf/e;

    .line 400
    .line 401
    .line 402
    move-result-object v9

    .line 403
    if-nez v9, :cond_12

    .line 404
    .line 405
    invoke-interface {v0, v7}, Lwf/g;->e(Lwf/g;)Lwf/g;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    :cond_12
    sget-object v7, Lqg/u;->h:Lqg/u;

    .line 410
    .line 411
    if-ne v5, v7, :cond_13

    .line 412
    .line 413
    new-instance v7, Lqg/z0;

    .line 414
    .line 415
    invoke-direct {v7, v0, v4}, Lqg/z0;-><init>(Lwf/g;Lfg/p;)V

    .line 416
    .line 417
    .line 418
    goto :goto_b

    .line 419
    :cond_13
    new-instance v7, Lqg/e1;

    .line 420
    .line 421
    invoke-direct {v7, v0, v8}, Lqg/a;-><init>(Lwf/g;Z)V

    .line 422
    .line 423
    .line 424
    :goto_b
    invoke-virtual {v7, v5, v7, v4}, Lqg/a;->c0(Lqg/u;Lqg/a;Lfg/p;)V

    .line 425
    .line 426
    .line 427
    new-instance v0, Lf1/e;

    .line 428
    .line 429
    invoke-direct {v0, v7, v6}, Lf1/e;-><init>(Ljava/lang/Object;I)V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v2, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 433
    .line 434
    .line 435
    goto :goto_c

    .line 436
    :cond_14
    new-instance v0, Ljava/lang/StringBuilder;

    .line 437
    .line 438
    const-string v3, "ViewTreeLifecycleOwner not found from "

    .line 439
    .line 440
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    invoke-static {v0}, Lu1/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    .line 451
    .line 452
    .line 453
    invoke-static {}, Lokio/a;->c()V

    .line 454
    .line 455
    .line 456
    return-object v1

    .line 457
    :catchall_1
    move-exception v0

    .line 458
    monitor-exit v7

    .line 459
    throw v0

    .line 460
    :cond_15
    const-string v0, "no AndroidUiDispatcher for this thread"

    .line 461
    .line 462
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 463
    .line 464
    .line 465
    return-object v1

    .line 466
    :cond_16
    instance-of v2, v0, Li0/y1;

    .line 467
    .line 468
    if-eqz v2, :cond_19

    .line 469
    .line 470
    move-object v3, v0

    .line 471
    check-cast v3, Li0/y1;

    .line 472
    .line 473
    :goto_c
    iget-object v0, v3, Li0/y1;->u:Ltg/b0;

    .line 474
    .line 475
    invoke-virtual {v0}, Ltg/b0;->getValue()Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    check-cast v0, Li0/u1;

    .line 480
    .line 481
    sget-object v2, Li0/u1;->h:Li0/u1;

    .line 482
    .line 483
    invoke-virtual {v0, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 484
    .line 485
    .line 486
    move-result v0

    .line 487
    if-lez v0, :cond_17

    .line 488
    .line 489
    move-object v1, v3

    .line 490
    :cond_17
    if-eqz v1, :cond_18

    .line 491
    .line 492
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 493
    .line 494
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 495
    .line 496
    .line 497
    iput-object v0, p0, Ly1/a;->g:Ljava/lang/ref/WeakReference;

    .line 498
    .line 499
    :cond_18
    return-object v3

    .line 500
    :cond_19
    const-string v0, "root viewTreeParentCompositionContext is not a Recomposer"

    .line 501
    .line 502
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 503
    .line 504
    .line 505
    return-object v1

    .line 506
    :cond_1a
    return-object v0
.end method

.method public final l(Landroid/view/View;Ly1/f1;)Ly1/f1;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ly1/a;->k()Li0/o;

    .line 2
    .line 3
    .line 4
    move-result-object v3

    .line 5
    invoke-static {p1}, Landroidx/lifecycle/d0;->a(Landroid/view/View;)Landroidx/lifecycle/q;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {p1}, Landroidx/lifecycle/d0;->b(Landroid/view/View;)Lc9/a1;

    .line 10
    .line 11
    .line 12
    move-result-object v6

    .line 13
    invoke-static {p1}, Lac/p;->t(Landroid/view/View;)Lu3/c;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v2, p2, Ly1/f1;->b:Li0/o;

    .line 18
    .line 19
    iget-object v4, p2, Ly1/f1;->d:Lu3/c;

    .line 20
    .line 21
    iget-object v5, p2, Ly1/f1;->c:Landroidx/lifecycle/q;

    .line 22
    .line 23
    if-ne v3, v2, :cond_0

    .line 24
    .line 25
    if-ne v0, v5, :cond_0

    .line 26
    .line 27
    iget-object v2, p2, Ly1/f1;->e:Lc9/a1;

    .line 28
    .line 29
    if-ne v6, v2, :cond_0

    .line 30
    .line 31
    if-ne v1, v4, :cond_0

    .line 32
    .line 33
    return-object p2

    .line 34
    :cond_0
    invoke-virtual {v3}, Li0/o;->j()Lwf/g;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iget-object v7, p2, Ly1/f1;->b:Li0/o;

    .line 39
    .line 40
    invoke-virtual {v7}, Li0/o;->j()Lwf/g;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    if-eq v2, v7, :cond_1

    .line 45
    .line 46
    invoke-virtual {p0}, Ly1/a;->f()V

    .line 47
    .line 48
    .line 49
    :cond_1
    if-nez v0, :cond_2

    .line 50
    .line 51
    move-object v0, v5

    .line 52
    :cond_2
    if-nez v1, :cond_3

    .line 53
    .line 54
    move-object v5, v4

    .line 55
    :goto_0
    move-object v4, v0

    .line 56
    goto :goto_1

    .line 57
    :cond_3
    move-object v5, v1

    .line 58
    goto :goto_0

    .line 59
    :goto_1
    new-instance v0, Ly1/f1;

    .line 60
    .line 61
    move-object v2, p1

    .line 62
    move-object v1, p2

    .line 63
    invoke-direct/range {v0 .. v6}, Ly1/f1;-><init>(Ly1/f1;Landroid/view/View;Li0/o;Landroidx/lifecycle/q;Lu3/c;Lc9/a1;)V

    .line 64
    .line 65
    .line 66
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 67
    .line 68
    invoke-direct {p1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    const p2, 0x7f06002a

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2, p2, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    return-object v0
.end method

.method public onAttachedToWindow()V
    .locals 5

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ly1/v2;->a:Lf/k0;

    .line 5
    .line 6
    invoke-static {p0}, Lfb/v0;->t(Landroid/view/View;)Landroid/view/ViewParent;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    move-object v1, p0

    .line 11
    :goto_0
    instance-of v2, v0, Landroid/view/View;

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    check-cast v0, Landroid/view/View;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const v3, 0x1020002

    .line 22
    .line 23
    .line 24
    if-ne v2, v3, :cond_0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    move-object v4, v1

    .line 32
    move-object v1, v0

    .line 33
    move-object v0, v4

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    :goto_1
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-nez v0, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    new-instance v1, Lwb/cr;

    .line 46
    .line 47
    const/4 v2, 0x6

    .line 48
    invoke-direct {v1, p0, v2}, Lwb/cr;-><init>(Ljava/lang/Object;I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_2
    invoke-virtual {p0}, Ly1/a;->b()V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p5}, Ly1/a;->h(ZIIII)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onMeasure(II)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ly1/a;->g()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Ly1/a;->i(II)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final onRtlPropertiesChanged(I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutDirection(I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final setAutoClearFocusBehavior-17tfJxM(I)V
    .locals 1

    .line 1
    new-instance v0, Ly1/u0;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ly1/u0;-><init>(I)V

    .line 4
    .line 5
    .line 6
    const p1, 0x7f06002e

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setComposeViewContext$ui(Ly1/f1;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ly1/a;->k:Ly1/f1;

    .line 2
    .line 3
    if-eq v0, p1, :cond_4

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ly1/a;->f()V

    .line 8
    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    instance-of v1, v0, Ly1/t;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    check-cast v0, Ly1/t;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v0, 0x0

    .line 30
    :goto_0
    if-eqz v0, :cond_3

    .line 31
    .line 32
    invoke-virtual {v0}, Ly1/t;->getCoroutineContext()Lwf/g;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget-object v2, p1, Ly1/f1;->b:Li0/o;

    .line 37
    .line 38
    invoke-virtual {v2}, Li0/o;->j()Lwf/g;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    if-eq v1, v2, :cond_2

    .line 43
    .line 44
    invoke-virtual {p0}, Ly1/a;->f()V

    .line 45
    .line 46
    .line 47
    :cond_2
    invoke-virtual {v0, p1}, Ly1/t;->setComposeViewContext(Ly1/f1;)V

    .line 48
    .line 49
    .line 50
    :cond_3
    :goto_1
    iput-object p1, p0, Ly1/a;->k:Ly1/f1;

    .line 51
    .line 52
    :cond_4
    return-void
.end method

.method public final setParentCompositionContext(Li0/o;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ly1/a;->setParentContext(Li0/o;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final setShowLayoutBounds(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Ly1/a;->m:Z

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast v0, Lx1/r1;

    .line 11
    .line 12
    check-cast v0, Ly1/t;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ly1/t;->setShowLayoutBounds(Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public setTransitionGroup(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setTransitionGroup(Z)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Ly1/a;->o:Z

    .line 6
    .line 7
    return-void
.end method

.method public final setViewCompositionStrategy(Ly1/k2;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/a;->l:Lfg/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-interface {p1, p0}, Ly1/k2;->a(Ly1/a;)Lfg/a;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Ly1/a;->l:Lfg/a;

    .line 13
    .line 14
    return-void
.end method

.method public final shouldDelayChildPressedState()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method
