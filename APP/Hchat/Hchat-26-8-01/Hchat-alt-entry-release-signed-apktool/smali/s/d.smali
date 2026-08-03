.class public final Ls/d;
.super Ly0/n;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public u:Lg2/d;

.field public final synthetic v:Ls/e;


# direct methods
.method public constructor <init>(Ls/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ls/d;->v:Ls/e;

    .line 2
    .line 3
    invoke-direct {p0}, Ly0/n;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c1()V
    .locals 1

    .line 1
    iget-object v0, p0, Ls/d;->v:Ls/e;

    .line 2
    .line 3
    iput-object p0, v0, Ls/e;->a:Ls/d;

    .line 4
    .line 5
    iget-object v0, v0, Ls/e;->b:Lqg/l;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Ls/d;->k1()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final d1()V
    .locals 3

    .line 1
    iget-object v0, p0, Ls/d;->v:Ls/e;

    .line 2
    .line 3
    iget-object v1, v0, Ls/e;->a:Ls/d;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ne v1, p0, :cond_0

    .line 7
    .line 8
    iput-object v2, v0, Ls/e;->a:Ls/d;

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Ls/d;->u:Lg2/d;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Lg2/d;->b()V

    .line 15
    .line 16
    .line 17
    :cond_1
    iput-object v2, p0, Ls/d;->u:Lg2/d;

    .line 18
    .line 19
    return-void
.end method

.method public final k1()V
    .locals 6

    .line 1
    new-instance v0, Lm/b;

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    iget-object v2, p0, Ls/d;->v:Ls/e;

    .line 6
    .line 7
    invoke-direct {v0, p0, v1, v2}, Lm/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget v2, v1, Lx1/f0;->h:I

    .line 15
    .line 16
    invoke-static {v1}, Lx1/i0;->a(Lx1/f0;)Lx1/r1;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ly1/t;

    .line 21
    .line 22
    invoke-virtual {v1}, Ly1/t;->getRectManager()Lg2/b;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget-object v3, v1, Lg2/b;->c:Lg2/e;

    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-object v4, v3, Lg2/e;->a:Lf/w;

    .line 32
    .line 33
    new-instance v5, Lg2/d;

    .line 34
    .line 35
    invoke-direct {v5, v3, v2, p0, v0}, Lg2/d;-><init>(Lg2/e;ILs/d;Lm/b;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v4, v2}, Lf/k;->b(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-nez v0, :cond_0

    .line 43
    .line 44
    invoke-virtual {v4, v2, v5}, Lf/w;->h(ILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    move-object v0, v5

    .line 48
    :cond_0
    check-cast v0, Lg2/d;

    .line 49
    .line 50
    if-eq v0, v5, :cond_2

    .line 51
    .line 52
    :goto_0
    iget-object v3, v0, Lg2/d;->d:Lg2/d;

    .line 53
    .line 54
    if-eqz v3, :cond_1

    .line 55
    .line 56
    move-object v0, v3

    .line 57
    goto :goto_0

    .line 58
    :cond_1
    iput-object v5, v0, Lg2/d;->d:Lg2/d;

    .line 59
    .line 60
    :cond_2
    iget-object v0, p0, Ly0/n;->g:Ly0/n;

    .line 61
    .line 62
    invoke-static {v0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iget-boolean v0, v0, Lx1/f0;->m:Z

    .line 67
    .line 68
    const/4 v3, 0x1

    .line 69
    if-eqz v0, :cond_3

    .line 70
    .line 71
    iget-object v0, v1, Lg2/b;->b:Lac/k;

    .line 72
    .line 73
    invoke-virtual {v0, v2, v3}, Lac/k;->N(IZ)V

    .line 74
    .line 75
    .line 76
    :cond_3
    iput-boolean v3, v1, Lg2/b;->e:Z

    .line 77
    .line 78
    invoke-virtual {v1}, Lg2/b;->i()V

    .line 79
    .line 80
    .line 81
    iput-object v5, p0, Ls/d;->u:Lg2/d;

    .line 82
    .line 83
    return-void
.end method
