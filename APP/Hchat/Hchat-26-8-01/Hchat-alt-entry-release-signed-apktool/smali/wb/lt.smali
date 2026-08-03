.class public final Lwb/lt;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public h:I

.field public final synthetic i:Z

.field public final synthetic j:Z

.field public final synthetic k:Ljava/util/List;

.field public final synthetic l:Lr/z;

.field public final synthetic m:Ljava/util/List;

.field public final synthetic n:Li0/a1;


# direct methods
.method public constructor <init>(ZZLjava/util/List;Lr/z;Ljava/util/List;Li0/a1;Lwf/c;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lwb/lt;->i:Z

    .line 2
    .line 3
    iput-boolean p2, p0, Lwb/lt;->j:Z

    .line 4
    .line 5
    iput-object p3, p0, Lwb/lt;->k:Ljava/util/List;

    .line 6
    .line 7
    iput-object p4, p0, Lwb/lt;->l:Lr/z;

    .line 8
    .line 9
    iput-object p5, p0, Lwb/lt;->m:Ljava/util/List;

    .line 10
    .line 11
    iput-object p6, p0, Lwb/lt;->n:Li0/a1;

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p7}, Lyf/i;-><init>(ILwf/c;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 8

    .line 1
    new-instance v0, Lwb/lt;

    .line 2
    .line 3
    iget-object v5, p0, Lwb/lt;->m:Ljava/util/List;

    .line 4
    .line 5
    iget-object v6, p0, Lwb/lt;->n:Li0/a1;

    .line 6
    .line 7
    iget-boolean v1, p0, Lwb/lt;->i:Z

    .line 8
    .line 9
    iget-boolean v2, p0, Lwb/lt;->j:Z

    .line 10
    .line 11
    iget-object v3, p0, Lwb/lt;->k:Ljava/util/List;

    .line 12
    .line 13
    iget-object v4, p0, Lwb/lt;->l:Lr/z;

    .line 14
    .line 15
    move-object v7, p2

    .line 16
    invoke-direct/range {v0 .. v7}, Lwb/lt;-><init>(ZZLjava/util/List;Lr/z;Ljava/util/List;Li0/a1;Lwf/c;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lqg/t;

    .line 2
    .line 3
    check-cast p2, Lwf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lwb/lt;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lwb/lt;

    .line 10
    .line 11
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lwb/lt;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lwb/lt;->h:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    sget-object v3, Lxf/a;->g:Lxf/a;

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    if-eq v0, v2, :cond_1

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto :goto_2

    .line 17
    :cond_0
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 18
    .line 19
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    return-object p1

    .line 24
    :cond_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-boolean p1, p0, Lwb/lt;->i:Z

    .line 32
    .line 33
    if-eqz p1, :cond_4

    .line 34
    .line 35
    iget-boolean p1, p0, Lwb/lt;->j:Z

    .line 36
    .line 37
    if-nez p1, :cond_4

    .line 38
    .line 39
    iget-object p1, p0, Lwb/lt;->k:Ljava/util/List;

    .line 40
    .line 41
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-nez p1, :cond_4

    .line 46
    .line 47
    iget-object p1, p0, Lwb/lt;->n:Li0/a1;

    .line 48
    .line 49
    invoke-static {p1, v2}, Lwb/y2;->Q(Li0/a1;Z)V

    .line 50
    .line 51
    .line 52
    iput v2, p0, Lwb/lt;->h:I

    .line 53
    .line 54
    const-wide/16 v4, 0x28

    .line 55
    .line 56
    invoke-static {v4, v5, p0}, Lqg/v;->f(JLwf/c;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-ne p1, v3, :cond_3

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    :goto_0
    iget-object p1, p0, Lwb/lt;->m:Ljava/util/List;

    .line 64
    .line 65
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    iput v1, p0, Lwb/lt;->h:I

    .line 70
    .line 71
    sget-object v0, Lr/z;->y:Lp4/t;

    .line 72
    .line 73
    iget-object v0, p0, Lwb/lt;->l:Lr/z;

    .line 74
    .line 75
    invoke-virtual {v0, p1, p0}, Lr/z;->f(ILyf/c;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    if-ne p1, v3, :cond_4

    .line 80
    .line 81
    :goto_1
    return-object v3

    .line 82
    :cond_4
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 83
    .line 84
    return-object p1
.end method
