.class public final Lwb/qn;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public h:Lj8/h;

.field public i:Lj8/g;

.field public j:I

.field public k:I

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:Lj8/h;


# direct methods
.method public constructor <init>(Lj8/h;Lwf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lwb/qn;->m:Lj8/h;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lyf/i;-><init>(ILwf/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 2

    .line 1
    new-instance v0, Lwb/qn;

    .line 2
    .line 3
    iget-object v1, p0, Lwb/qn;->m:Lj8/h;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lwb/qn;-><init>(Lj8/h;Lwf/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lwb/qn;->l:Ljava/lang/Object;

    .line 9
    .line 10
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
    invoke-virtual {p0, p1, p2}, Lwb/qn;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lwb/qn;

    .line 10
    .line 11
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lwb/qn;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lwb/qn;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lqg/t;

    .line 4
    .line 5
    iget v0, p0, Lwb/qn;->k:I

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    if-ne v0, v1, :cond_1

    .line 11
    .line 12
    iget v0, p0, Lwb/qn;->j:I

    .line 13
    .line 14
    iget-object v2, p0, Lwb/qn;->i:Lj8/g;

    .line 15
    .line 16
    iget-object v3, p0, Lwb/qn;->h:Lj8/h;

    .line 17
    .line 18
    :try_start_0
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    :cond_0
    move-object p1, v2

    .line 22
    goto :goto_1

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    goto :goto_3

    .line 25
    :cond_1
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    return-object p1

    .line 32
    :cond_2
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lwb/qn;->m:Lj8/h;

    .line 36
    .line 37
    if-eqz p1, :cond_7

    .line 38
    .line 39
    :try_start_1
    iget-object v0, p1, Lj8/h;->b:Lh/Hchat/dexkit/DexFinder;

    .line 40
    .line 41
    invoke-virtual {v0}, Lh/Hchat/dexkit/DexFinder;->resolveFavoriteApi()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Lj8/h;->d()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_6

    .line 49
    .line 50
    new-instance v0, Lj8/g;

    .line 51
    .line 52
    sget-object v2, Ltf/t;->g:Ltf/t;

    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    invoke-direct {v0, v2, v3, v3}, Lj8/g;-><init>(Ljava/util/List;ZZ)V

    .line 56
    .line 57
    .line 58
    move v6, v3

    .line 59
    move-object v3, p1

    .line 60
    move-object p1, v0

    .line 61
    move v0, v6

    .line 62
    :goto_0
    const/4 v2, 0x3

    .line 63
    if-lt v0, v2, :cond_3

    .line 64
    .line 65
    goto :goto_4

    .line 66
    :cond_3
    invoke-virtual {v3}, Lj8/h;->u()Lj8/g;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    iget-object p1, v2, Lj8/g;->a:Ljava/util/List;

    .line 71
    .line 72
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p1, :cond_5

    .line 77
    .line 78
    const/4 p1, 0x2

    .line 79
    if-ne v0, p1, :cond_4

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_4
    const/4 p1, 0x0

    .line 83
    iput-object p1, p0, Lwb/qn;->l:Ljava/lang/Object;

    .line 84
    .line 85
    iput-object v3, p0, Lwb/qn;->h:Lj8/h;

    .line 86
    .line 87
    iput-object v2, p0, Lwb/qn;->i:Lj8/g;

    .line 88
    .line 89
    iput v0, p0, Lwb/qn;->j:I

    .line 90
    .line 91
    iput v1, p0, Lwb/qn;->k:I

    .line 92
    .line 93
    const-wide/16 v4, 0x15e

    .line 94
    .line 95
    invoke-static {v4, v5, p0}, Lqg/v;->f(JLwf/c;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 99
    sget-object v4, Lxf/a;->g:Lxf/a;

    .line 100
    .line 101
    if-ne p1, v4, :cond_0

    .line 102
    .line 103
    return-object v4

    .line 104
    :goto_1
    add-int/2addr v0, v1

    .line 105
    goto :goto_0

    .line 106
    :cond_5
    :goto_2
    move-object p1, v2

    .line 107
    goto :goto_4

    .line 108
    :cond_6
    :try_start_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 109
    .line 110
    const-string v0, "\u6536\u85cf\u5217\u8868\u4e0d\u53ef\u7528"

    .line 111
    .line 112
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw p1

    .line 116
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 117
    .line 118
    const-string v0, "\u6536\u85cf API \u672a\u5c31\u7eea"

    .line 119
    .line 120
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 124
    :goto_3
    new-instance v0, Lsf/f;

    .line 125
    .line 126
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 127
    .line 128
    .line 129
    move-object p1, v0

    .line 130
    :goto_4
    new-instance v0, Lsf/g;

    .line 131
    .line 132
    invoke-direct {v0, p1}, Lsf/g;-><init>(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    return-object v0
.end method
