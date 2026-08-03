.class public final Ly1/k0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lqg/t;


# instance fields
.field public final g:Landroid/view/View;

.field public final h:Ln2/t;

.field public final i:Lqg/t;

.field public final j:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public constructor <init>(Landroid/view/View;Ln2/t;Lqg/t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly1/k0;->g:Landroid/view/View;

    .line 5
    .line 6
    iput-object p2, p0, Ly1/k0;->h:Ln2/t;

    .line 7
    .line 8
    iput-object p3, p0, Ly1/k0;->i:Lqg/t;

    .line 9
    .line 10
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 11
    .line 12
    const/4 p2, 0x0

    .line 13
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Ly1/k0;->j:Ljava/util/concurrent/atomic/AtomicReference;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(Lf0/u;Lyf/c;)V
    .locals 4

    .line 1
    instance-of v0, p2, Ly1/j0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Ly1/j0;

    .line 7
    .line 8
    iget v1, v0, Ly1/j0;->i:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Ly1/j0;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ly1/j0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Ly1/j0;-><init>(Ly1/k0;Lyf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Ly1/j0;->g:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Ly1/j0;->i:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-eq v1, v2, :cond_1

    .line 33
    .line 34
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 35
    .line 36
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    invoke-static {p2}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    invoke-static {p2}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    new-instance p2, Lf1/p;

    .line 48
    .line 49
    const/4 v1, 0x7

    .line 50
    invoke-direct {p2, p1, v1, p0}, Lf1/p;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    new-instance p1, Lci/j;

    .line 54
    .line 55
    const/16 v1, 0x1a

    .line 56
    .line 57
    const/4 v3, 0x0

    .line 58
    invoke-direct {p1, p0, v3, v1}, Lci/j;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 59
    .line 60
    .line 61
    iput v2, v0, Ly1/j0;->i:I

    .line 62
    .line 63
    new-instance v1, Lci/e;

    .line 64
    .line 65
    iget-object v2, p0, Ly1/k0;->j:Ljava/util/concurrent/atomic/AtomicReference;

    .line 66
    .line 67
    invoke-direct {v1, p2, v2, p1, v3}, Lci/e;-><init>(Lfg/l;Ljava/util/concurrent/atomic/AtomicReference;Lfg/p;Lwf/c;)V

    .line 68
    .line 69
    .line 70
    invoke-static {v1, v0}, Lqg/v;->e(Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    sget-object p2, Lxf/a;->g:Lxf/a;

    .line 75
    .line 76
    if-ne p1, p2, :cond_3

    .line 77
    .line 78
    return-void

    .line 79
    :cond_3
    :goto_1
    invoke-static {}, Lokio/a;->c()V

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method public final n()Lwf/g;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/k0;->i:Lqg/t;

    .line 2
    .line 3
    invoke-interface {v0}, Lqg/t;->n()Lwf/g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
