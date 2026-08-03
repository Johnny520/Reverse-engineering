.class public final Lm/j;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Lm/k;

.field public final synthetic k:Lm/g3;

.field public final synthetic l:Lm/f;

.field public final synthetic m:J


# direct methods
.method public constructor <init>(Lm/k;Lm/g3;Lm/f;JLwf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm/j;->j:Lm/k;

    .line 2
    .line 3
    iput-object p2, p0, Lm/j;->k:Lm/g3;

    .line 4
    .line 5
    iput-object p3, p0, Lm/j;->l:Lm/f;

    .line 6
    .line 7
    iput-wide p4, p0, Lm/j;->m:J

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p6}, Lyf/i;-><init>(ILwf/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 7

    .line 1
    new-instance v0, Lm/j;

    .line 2
    .line 3
    iget-object v3, p0, Lm/j;->l:Lm/f;

    .line 4
    .line 5
    iget-wide v4, p0, Lm/j;->m:J

    .line 6
    .line 7
    iget-object v1, p0, Lm/j;->j:Lm/k;

    .line 8
    .line 9
    iget-object v2, p0, Lm/j;->k:Lm/g3;

    .line 10
    .line 11
    move-object v6, p2

    .line 12
    invoke-direct/range {v0 .. v6}, Lm/j;-><init>(Lm/k;Lm/g3;Lm/f;JLwf/c;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lm/j;->i:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lm/j;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lm/j;

    .line 10
    .line 11
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lm/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-object v2, p0, Lm/j;->j:Lm/k;

    .line 2
    .line 3
    iget-object v8, v2, Lm/k;->y:Lm/c;

    .line 4
    .line 5
    iget v0, p0, Lm/j;->h:I

    .line 6
    .line 7
    const/4 v9, 0x1

    .line 8
    const/4 v10, 0x0

    .line 9
    const/4 v11, 0x0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    if-ne v0, v9, :cond_0

    .line 13
    .line 14
    :try_start_0
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    move-object p1, v0

    .line 20
    goto :goto_2

    .line 21
    :catch_0
    move-exception v0

    .line 22
    move-object p1, v0

    .line 23
    move-object v11, p1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
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
    :cond_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lm/j;->i:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, Lqg/t;

    .line 38
    .line 39
    invoke-interface {p1}, Lqg/t;->n()Lwf/g;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {p1}, Lqg/v;->k(Lwf/g;)Lqg/r0;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    :try_start_1
    iput-boolean v9, v2, Lm/k;->B:Z

    .line 48
    .line 49
    iget-object p1, v2, Lm/k;->v:Lm/o2;

    .line 50
    .line 51
    sget-object v12, Lk/d1;->g:Lk/d1;

    .line 52
    .line 53
    new-instance v0, Lh0/a1;

    .line 54
    .line 55
    iget-object v1, p0, Lm/j;->k:Lm/g3;

    .line 56
    .line 57
    iget-object v3, p0, Lm/j;->l:Lm/f;

    .line 58
    .line 59
    iget-wide v4, p0, Lm/j;->m:J

    .line 60
    .line 61
    const/4 v7, 0x0

    .line 62
    invoke-direct/range {v0 .. v7}, Lh0/a1;-><init>(Lm/g3;Lm/k;Lm/f;JLqg/r0;Lwf/c;)V

    .line 63
    .line 64
    .line 65
    iput v9, p0, Lm/j;->h:I

    .line 66
    .line 67
    invoke-virtual {p1, v12, v0, p0}, Lm/o2;->f(Lk/d1;Lfg/p;Lyf/c;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 72
    .line 73
    if-ne p1, v0, :cond_2

    .line 74
    .line 75
    return-object v0

    .line 76
    :cond_2
    :goto_0
    :try_start_2
    invoke-virtual {v8}, Lm/c;->b()V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 77
    .line 78
    .line 79
    iput-boolean v10, v2, Lm/k;->B:Z

    .line 80
    .line 81
    invoke-virtual {v8, v11}, Lm/c;->a(Ljava/util/concurrent/CancellationException;)V

    .line 82
    .line 83
    .line 84
    iput-boolean v10, v2, Lm/k;->z:Z

    .line 85
    .line 86
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 87
    .line 88
    return-object p1

    .line 89
    :goto_1
    :try_start_3
    throw v11
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 90
    :goto_2
    iput-boolean v10, v2, Lm/k;->B:Z

    .line 91
    .line 92
    invoke-virtual {v8, v11}, Lm/c;->a(Ljava/util/concurrent/CancellationException;)V

    .line 93
    .line 94
    .line 95
    iput-boolean v10, v2, Lm/k;->z:Z

    .line 96
    .line 97
    throw p1
.end method
