.class public final Lm20;
.super Lgd1;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Ljava/lang/Runnable;
.implements Lrk0;
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final e:Lde1;

.field public f:Z

.field public g:Z

.field public h:Lbe1;


# direct methods
.method public constructor <init>(Lde1;)V
    .locals 1

    .line 1
    iget-boolean v0, p1, Lde1;->s:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-direct {p0, v0}, Lgd1;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lm20;->e:Lde1;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Lbe1;)Lbe1;
    .locals 5

    .line 1
    iput-object p2, p0, Lm20;->h:Lbe1;

    .line 2
    .line 3
    iget-object v0, p0, Lm20;->e:Lde1;

    .line 4
    .line 5
    iget-object v1, v0, Lde1;->q:Ldb1;

    .line 6
    .line 7
    iget-object v2, p2, Lbe1;->a:Lyd1;

    .line 8
    .line 9
    const/16 v3, 0x8

    .line 10
    .line 11
    invoke-virtual {v2, v3}, Lyd1;->h(I)Li20;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-static {v4}, Lu50;->C(Li20;)Lq20;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-virtual {v1, v4}, Ldb1;->f(Lq20;)V

    .line 20
    .line 21
    .line 22
    iget-boolean v1, p0, Lm20;->f:Z

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 27
    .line 28
    const/16 v2, 0x1e

    .line 29
    .line 30
    if-ne v1, v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-boolean p0, p0, Lm20;->g:Z

    .line 37
    .line 38
    if-nez p0, :cond_1

    .line 39
    .line 40
    iget-object p0, v0, Lde1;->r:Ldb1;

    .line 41
    .line 42
    invoke-virtual {v2, v3}, Lyd1;->h(I)Li20;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-static {p1}, Lu50;->C(Li20;)Lq20;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p0, p1}, Ldb1;->f(Lq20;)V

    .line 51
    .line 52
    .line 53
    invoke-static {v0, p2}, Lde1;->a(Lde1;Lbe1;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    :goto_0
    iget-boolean p0, v0, Lde1;->s:Z

    .line 57
    .line 58
    if-eqz p0, :cond_2

    .line 59
    .line 60
    sget-object p0, Lbe1;->b:Lbe1;

    .line 61
    .line 62
    return-object p0

    .line 63
    :cond_2
    return-object p2
.end method

.method public final b(Lid1;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lm20;->f:Z

    .line 3
    .line 4
    iput-boolean v0, p0, Lm20;->g:Z

    .line 5
    .line 6
    iget-object v0, p0, Lm20;->h:Lbe1;

    .line 7
    .line 8
    iget-object p1, p1, Lid1;->a:Lqb1;

    .line 9
    .line 10
    iget-object p1, p1, Lqb1;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Landroid/view/WindowInsetsAnimation;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/WindowInsetsAnimation;->getDurationMillis()J

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    const-wide/16 v3, 0x0

    .line 19
    .line 20
    cmp-long p1, v1, v3

    .line 21
    .line 22
    if-lez p1, :cond_0

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iget-object p1, v0, Lbe1;->a:Lyd1;

    .line 27
    .line 28
    iget-object v1, p0, Lm20;->e:Lde1;

    .line 29
    .line 30
    iget-object v2, v1, Lde1;->r:Ldb1;

    .line 31
    .line 32
    const/16 v3, 0x8

    .line 33
    .line 34
    invoke-virtual {p1, v3}, Lyd1;->h(I)Li20;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-static {v4}, Lu50;->C(Li20;)Lq20;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-virtual {v2, v4}, Ldb1;->f(Lq20;)V

    .line 43
    .line 44
    .line 45
    iget-object v2, v1, Lde1;->q:Ldb1;

    .line 46
    .line 47
    invoke-virtual {p1, v3}, Lyd1;->h(I)Li20;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-static {p1}, Lu50;->C(Li20;)Lq20;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {v2, p1}, Ldb1;->f(Lq20;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v1, v0}, Lde1;->a(Lde1;Lbe1;)V

    .line 59
    .line 60
    .line 61
    :cond_0
    const/4 p1, 0x0

    .line 62
    iput-object p1, p0, Lm20;->h:Lbe1;

    .line 63
    .line 64
    return-void
.end method

.method public final c(Lid1;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lm20;->f:Z

    .line 3
    .line 4
    iput-boolean p1, p0, Lm20;->g:Z

    .line 5
    .line 6
    return-void
.end method

.method public final d(Lbe1;Ljava/util/List;)Lbe1;
    .locals 0

    .line 1
    iget-object p0, p0, Lm20;->e:Lde1;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lde1;->a(Lde1;Lbe1;)V

    .line 4
    .line 5
    .line 6
    iget-boolean p0, p0, Lde1;->s:Z

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    sget-object p0, Lbe1;->b:Lbe1;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    return-object p1
.end method

.method public final e(Lid1;Ld;)Ld;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lm20;->f:Z

    .line 3
    .line 4
    return-object p2
.end method

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->requestApplyInsets()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final run()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lm20;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lm20;->f:Z

    .line 7
    .line 8
    iput-boolean v0, p0, Lm20;->g:Z

    .line 9
    .line 10
    iget-object v0, p0, Lm20;->h:Lbe1;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v1, p0, Lm20;->e:Lde1;

    .line 15
    .line 16
    iget-object v2, v1, Lde1;->r:Ldb1;

    .line 17
    .line 18
    const/16 v3, 0x8

    .line 19
    .line 20
    iget-object v4, v0, Lbe1;->a:Lyd1;

    .line 21
    .line 22
    invoke-virtual {v4, v3}, Lyd1;->h(I)Li20;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-static {v3}, Lu50;->C(Li20;)Lq20;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v2, v3}, Ldb1;->f(Lq20;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v1, v0}, Lde1;->a(Lde1;Lbe1;)V

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    iput-object v0, p0, Lm20;->h:Lbe1;

    .line 38
    .line 39
    :cond_0
    return-void
.end method
