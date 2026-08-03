.class public final Lwb/nn;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public h:I

.field public final synthetic i:Z

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;


# direct methods
.method public constructor <init>(ZLi0/a1;Li0/a1;Li0/a1;Lwf/c;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lwb/nn;->i:Z

    .line 2
    .line 3
    iput-object p2, p0, Lwb/nn;->j:Li0/a1;

    .line 4
    .line 5
    iput-object p3, p0, Lwb/nn;->k:Li0/a1;

    .line 6
    .line 7
    iput-object p4, p0, Lwb/nn;->l:Li0/a1;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lyf/i;-><init>(ILwf/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 6

    .line 1
    new-instance v0, Lwb/nn;

    .line 2
    .line 3
    iget-object v3, p0, Lwb/nn;->k:Li0/a1;

    .line 4
    .line 5
    iget-object v4, p0, Lwb/nn;->l:Li0/a1;

    .line 6
    .line 7
    iget-boolean v1, p0, Lwb/nn;->i:Z

    .line 8
    .line 9
    iget-object v2, p0, Lwb/nn;->j:Li0/a1;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lwb/nn;-><init>(ZLi0/a1;Li0/a1;Li0/a1;Lwf/c;)V

    .line 13
    .line 14
    .line 15
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
    invoke-virtual {p0, p1, p2}, Lwb/nn;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lwb/nn;

    .line 10
    .line 11
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lwb/nn;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lwb/nn;->h:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-ne v0, v2, :cond_0

    .line 8
    .line 9
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 14
    .line 15
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v1

    .line 19
    :cond_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sget-object p1, Lqg/c0;->a:Lxg/e;

    .line 23
    .line 24
    sget-object p1, Lxg/d;->i:Lxg/d;

    .line 25
    .line 26
    new-instance v0, Li0/v1;

    .line 27
    .line 28
    const/4 v3, 0x2

    .line 29
    invoke-direct {v0, v3, v1, v3}, Li0/v1;-><init>(ILwf/c;I)V

    .line 30
    .line 31
    .line 32
    iput v2, p0, Lwb/nn;->h:I

    .line 33
    .line 34
    invoke-static {p1, v0, p0}, Lqg/v;->x(Lwf/g;Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 39
    .line 40
    if-ne p1, v0, :cond_2

    .line 41
    .line 42
    return-object v0

    .line 43
    :cond_2
    :goto_0
    check-cast p1, Lsf/g;

    .line 44
    .line 45
    iget-object p1, p1, Lsf/g;->g:Ljava/lang/Object;

    .line 46
    .line 47
    instance-of v0, p1, Lsf/f;

    .line 48
    .line 49
    iget-object v1, p0, Lwb/nn;->l:Li0/a1;

    .line 50
    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    move-object v0, p1

    .line 54
    check-cast v0, Ljava/lang/String;

    .line 55
    .line 56
    sget-object v2, Lwb/ho;->a:Log/k;

    .line 57
    .line 58
    iget-object v2, p0, Lwb/nn;->j:Li0/a1;

    .line 59
    .line 60
    invoke-interface {v2, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    const-string v0, ""

    .line 64
    .line 65
    iget-object v2, p0, Lwb/nn;->k:Li0/a1;

    .line 66
    .line 67
    invoke-interface {v2, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iget-boolean v0, p0, Lwb/nn;->i:Z

    .line 71
    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    const-string v0, "\u8bf7\u8f93\u5165\u56fe\u5f62\u9a8c\u8bc1\u7801"

    .line 75
    .line 76
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    :cond_3
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    if-eqz p1, :cond_4

    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    const-string v0, "\u5237\u65b0\u56fe\u5f62\u9a8c\u8bc1\u7801\u5931\u8d25: "

    .line 90
    .line 91
    invoke-static {v0, p1}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    sget-object v0, Lwb/ho;->a:Log/k;

    .line 96
    .line 97
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    :cond_4
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 101
    .line 102
    return-object p1
.end method
