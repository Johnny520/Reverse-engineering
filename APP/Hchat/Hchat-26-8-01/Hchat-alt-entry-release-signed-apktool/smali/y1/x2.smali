.class public final Ly1/x2;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Li0/n;
.implements Landroidx/lifecycle/o;


# instance fields
.field public final g:Ly1/t;

.field public final h:Li0/q;

.field public i:Z

.field public j:Landroidx/lifecycle/s;

.field public k:Lfg/p;


# direct methods
.method public constructor <init>(Ly1/t;Li0/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly1/x2;->g:Ly1/t;

    .line 5
    .line 6
    iput-object p2, p0, Ly1/x2;->h:Li0/q;

    .line 7
    .line 8
    sget-object p1, Ly1/b1;->a:Ls0/d;

    .line 9
    .line 10
    iput-object p1, p0, Ly1/x2;->k:Lfg/p;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final b(Landroidx/lifecycle/q;Landroidx/lifecycle/k;)V
    .locals 0

    .line 1
    sget-object p1, Landroidx/lifecycle/k;->ON_DESTROY:Landroidx/lifecycle/k;

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ly1/x2;->e()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    sget-object p1, Landroidx/lifecycle/k;->ON_CREATE:Landroidx/lifecycle/k;

    .line 10
    .line 11
    if-ne p2, p1, :cond_1

    .line 12
    .line 13
    iget-boolean p1, p0, Ly1/x2;->i:Z

    .line 14
    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    iget-object p1, p0, Ly1/x2;->k:Lfg/p;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Ly1/x2;->f(Lfg/p;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    return-void
.end method

.method public final e()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Ly1/x2;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Ly1/x2;->i:Z

    .line 7
    .line 8
    iget-object v0, p0, Ly1/x2;->g:Ly1/t;

    .line 9
    .line 10
    invoke-virtual {v0}, Ly1/t;->getView()Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const v1, 0x7f060082

    .line 15
    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Ly1/x2;->j:Landroidx/lifecycle/s;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Landroidx/lifecycle/s;->f(Landroidx/lifecycle/p;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    iput-object v2, p0, Ly1/x2;->j:Landroidx/lifecycle/s;

    .line 29
    .line 30
    :cond_1
    iget-object v0, p0, Ly1/x2;->h:Li0/q;

    .line 31
    .line 32
    invoke-virtual {v0}, Li0/q;->m()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final f(Lfg/p;)V
    .locals 2

    .line 1
    new-instance v0, Lf1/p;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    invoke-direct {v0, p0, v1, p1}, Lf1/p;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Ly1/x2;->g:Ly1/t;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Ly1/t;->setOnReadyForComposition(Lfg/l;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
