.class public final Lwb/kt;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public h:I

.field public final synthetic i:Z

.field public final synthetic j:Ljava/util/List;

.field public final synthetic k:Lr/z;

.field public final synthetic l:Ljava/util/List;

.field public final synthetic m:Li0/a1;


# direct methods
.method public constructor <init>(ZLjava/util/List;Lr/z;Ljava/util/List;Li0/a1;Lwf/c;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lwb/kt;->i:Z

    .line 2
    .line 3
    iput-object p2, p0, Lwb/kt;->j:Ljava/util/List;

    .line 4
    .line 5
    iput-object p3, p0, Lwb/kt;->k:Lr/z;

    .line 6
    .line 7
    iput-object p4, p0, Lwb/kt;->l:Ljava/util/List;

    .line 8
    .line 9
    iput-object p5, p0, Lwb/kt;->m:Li0/a1;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, Lyf/i;-><init>(ILwf/c;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 7

    .line 1
    new-instance v0, Lwb/kt;

    .line 2
    .line 3
    iget-object v4, p0, Lwb/kt;->l:Ljava/util/List;

    .line 4
    .line 5
    iget-object v5, p0, Lwb/kt;->m:Li0/a1;

    .line 6
    .line 7
    iget-boolean v1, p0, Lwb/kt;->i:Z

    .line 8
    .line 9
    iget-object v2, p0, Lwb/kt;->j:Ljava/util/List;

    .line 10
    .line 11
    iget-object v3, p0, Lwb/kt;->k:Lr/z;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Lwb/kt;-><init>(ZLjava/util/List;Lr/z;Ljava/util/List;Li0/a1;Lwf/c;)V

    .line 15
    .line 16
    .line 17
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
    invoke-virtual {p0, p1, p2}, Lwb/kt;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lwb/kt;

    .line 10
    .line 11
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lwb/kt;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v0, p0, Lwb/kt;->h:I

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
    iget-boolean p1, p0, Lwb/kt;->i:Z

    .line 32
    .line 33
    if-eqz p1, :cond_4

    .line 34
    .line 35
    iget-object p1, p0, Lwb/kt;->m:Li0/a1;

    .line 36
    .line 37
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Ljava/lang/Boolean;

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_4

    .line 48
    .line 49
    iget-object p1, p0, Lwb/kt;->j:Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-nez p1, :cond_4

    .line 56
    .line 57
    iput v2, p0, Lwb/kt;->h:I

    .line 58
    .line 59
    const-wide/16 v4, 0xb4

    .line 60
    .line 61
    invoke-static {v4, v5, p0}, Lqg/v;->f(JLwf/c;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-ne p1, v3, :cond_3

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    :goto_0
    iget-object p1, p0, Lwb/kt;->l:Ljava/util/List;

    .line 69
    .line 70
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    iput v1, p0, Lwb/kt;->h:I

    .line 75
    .line 76
    iget-object v0, p0, Lwb/kt;->k:Lr/z;

    .line 77
    .line 78
    invoke-static {v0, p1, p0}, Lr/z;->m(Lr/z;ILyf/i;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    if-ne p1, v3, :cond_4

    .line 83
    .line 84
    :goto_1
    return-object v3

    .line 85
    :cond_4
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 86
    .line 87
    return-object p1
.end method
