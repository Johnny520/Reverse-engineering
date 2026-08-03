.class public final Lwb/jt;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public h:I

.field public i:I

.field public final synthetic j:Ljava/util/List;

.field public final synthetic k:Ljava/util/List;

.field public final synthetic l:Lr/z;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Li0/a1;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/List;Lr/z;Li0/a1;Li0/a1;Lwf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lwb/jt;->j:Ljava/util/List;

    .line 2
    .line 3
    iput-object p2, p0, Lwb/jt;->k:Ljava/util/List;

    .line 4
    .line 5
    iput-object p3, p0, Lwb/jt;->l:Lr/z;

    .line 6
    .line 7
    iput-object p4, p0, Lwb/jt;->m:Li0/a1;

    .line 8
    .line 9
    iput-object p5, p0, Lwb/jt;->n:Li0/a1;

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
    new-instance v0, Lwb/jt;

    .line 2
    .line 3
    iget-object v4, p0, Lwb/jt;->m:Li0/a1;

    .line 4
    .line 5
    iget-object v5, p0, Lwb/jt;->n:Li0/a1;

    .line 6
    .line 7
    iget-object v1, p0, Lwb/jt;->j:Ljava/util/List;

    .line 8
    .line 9
    iget-object v2, p0, Lwb/jt;->k:Ljava/util/List;

    .line 10
    .line 11
    iget-object v3, p0, Lwb/jt;->l:Lr/z;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Lwb/jt;-><init>(Ljava/util/List;Ljava/util/List;Lr/z;Li0/a1;Li0/a1;Lwf/c;)V

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
    invoke-virtual {p0, p1, p2}, Lwb/jt;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lwb/jt;

    .line 10
    .line 11
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lwb/jt;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lwb/jt;->i:I

    .line 2
    .line 3
    iget-object v1, p0, Lwb/jt;->l:Lr/z;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, p0, Lwb/jt;->j:Ljava/util/List;

    .line 8
    .line 9
    sget-object v5, Lxf/a;->g:Lxf/a;

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    if-eq v0, v3, :cond_1

    .line 14
    .line 15
    if-ne v0, v2, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_0
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    return-object p1

    .line 28
    :cond_1
    iget v0, p0, Lwb/jt;->h:I

    .line 29
    .line 30
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lwb/jt;->m:Li0/a1;

    .line 38
    .line 39
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Ljava/lang/Number;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    invoke-interface {p1, v6}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, Lwb/jt;->k:Ljava/util/List;

    .line 61
    .line 62
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-nez p1, :cond_5

    .line 67
    .line 68
    iget-object p1, p0, Lwb/jt;->n:Li0/a1;

    .line 69
    .line 70
    invoke-static {p1, v3}, Lwb/y2;->Q(Li0/a1;Z)V

    .line 71
    .line 72
    .line 73
    if-ltz v0, :cond_3

    .line 74
    .line 75
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-ge p1, v0, :cond_3

    .line 80
    .line 81
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    invoke-static {v1, p1}, Lr/z;->l(Lr/z;I)V

    .line 86
    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_3
    iput v0, p0, Lwb/jt;->h:I

    .line 90
    .line 91
    iput v3, p0, Lwb/jt;->i:I

    .line 92
    .line 93
    const-wide/16 v6, 0x50

    .line 94
    .line 95
    invoke-static {v6, v7, p0}, Lqg/v;->f(JLwf/c;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    if-ne p1, v5, :cond_4

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_4
    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    iput v0, p0, Lwb/jt;->h:I

    .line 107
    .line 108
    iput v2, p0, Lwb/jt;->i:I

    .line 109
    .line 110
    sget-object v0, Lr/z;->y:Lp4/t;

    .line 111
    .line 112
    invoke-virtual {v1, p1, p0}, Lr/z;->f(ILyf/c;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    if-ne p1, v5, :cond_5

    .line 117
    .line 118
    :goto_1
    return-object v5

    .line 119
    :cond_5
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 120
    .line 121
    return-object p1
.end method
