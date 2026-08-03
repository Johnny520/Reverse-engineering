.class public final Lbe/v;
.super Lbe/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final g:Lmh/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lbe/v;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lbe/v;->g:Lmh/b;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final g(Lud/r;)V
    .locals 6

    .line 1
    iget-boolean v0, p1, Lud/r;->p:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_2

    .line 6
    .line 7
    :cond_0
    iget-object v0, p1, Lud/r;->z:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_6

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lud/a;

    .line 24
    .line 25
    iget-object v1, v1, Lud/a;->l:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Lud/p;

    .line 42
    .line 43
    iget-object v3, v2, Lud/p;->k:Lpd/k;

    .line 44
    .line 45
    sget-object v4, Lpd/k;->S:Lpd/k;

    .line 46
    .line 47
    if-ne v3, v4, :cond_2

    .line 48
    .line 49
    check-cast v2, Ltd/a;

    .line 50
    .line 51
    :try_start_0
    iget-object v3, v2, Lud/p;->l:Lqd/r;

    .line 52
    .line 53
    if-nez v3, :cond_3

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    iget-object v3, v3, Lqd/r;->m:Lqd/s;

    .line 57
    .line 58
    invoke-virtual {v3}, Lqd/s;->b()Lqd/k;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    iget-object v3, v3, Lqd/k;->b:Lqd/j;

    .line 63
    .line 64
    if-eqz v3, :cond_2

    .line 65
    .line 66
    invoke-virtual {v3}, Lqd/j;->j()Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    if-nez v4, :cond_4

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_4
    iget-object v4, p1, Lud/r;->l:Lud/e;

    .line 74
    .line 75
    iget-object v4, v4, Lud/e;->k:Lud/u;

    .line 76
    .line 77
    iget-object v5, v2, Ltd/a;->o:Lod/d;

    .line 78
    .line 79
    iget-object v5, v5, Lod/d;->j:Lod/a;

    .line 80
    .line 81
    invoke-virtual {v4, v5}, Lud/u;->f(Lod/a;)Lud/e;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    if-eqz v4, :cond_5

    .line 86
    .line 87
    iget-object v4, v4, Lud/e;->r:Ljava/util/List;

    .line 88
    .line 89
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    if-eqz v4, :cond_5

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :catch_0
    move-exception v2

    .line 97
    goto :goto_1

    .line 98
    :cond_5
    new-instance v4, Lnd/l;

    .line 99
    .line 100
    invoke-virtual {v3}, Lqd/j;->j()Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-direct {v4, v3}, Lnd/l;-><init>(Ljava/util/List;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2, v4}, Lmd/e;->y(Loc/b;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :goto_1
    sget-object v3, Lbe/v;->g:Lmh/b;

    .line 112
    .line 113
    const-string v4, "Failed to attach constructor generic info"

    .line 114
    .line 115
    invoke-interface {v3, v4, v2}, Lmh/b;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_6
    :goto_2
    return-void
.end method
