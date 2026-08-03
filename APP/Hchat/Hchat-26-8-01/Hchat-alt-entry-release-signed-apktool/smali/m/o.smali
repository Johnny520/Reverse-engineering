.class public final Lm/o;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public h:Lgg/r;

.field public i:Li/l;

.field public j:I

.field public final synthetic k:F

.field public final synthetic l:Lm/p;

.field public final synthetic m:Lm/k2;


# direct methods
.method public constructor <init>(FLm/p;Lm/k2;Lwf/c;)V
    .locals 0

    .line 1
    iput p1, p0, Lm/o;->k:F

    .line 2
    .line 3
    iput-object p2, p0, Lm/o;->l:Lm/p;

    .line 4
    .line 5
    iput-object p3, p0, Lm/o;->m:Lm/k2;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lyf/i;-><init>(ILwf/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 3

    .line 1
    new-instance p1, Lm/o;

    .line 2
    .line 3
    iget-object v0, p0, Lm/o;->l:Lm/p;

    .line 4
    .line 5
    iget-object v1, p0, Lm/o;->m:Lm/k2;

    .line 6
    .line 7
    iget v2, p0, Lm/o;->k:F

    .line 8
    .line 9
    invoke-direct {p1, v2, v0, v1, p2}, Lm/o;-><init>(FLm/p;Lm/k2;Lwf/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lm/o;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lm/o;

    .line 10
    .line 11
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lm/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v0, p0, Lm/o;->j:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lm/o;->i:Li/l;

    .line 9
    .line 10
    iget-object v1, p0, Lm/o;->h:Lgg/r;

    .line 11
    .line 12
    :try_start_0
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    return-object p1

    .line 23
    :cond_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget p1, p0, Lm/o;->k:F

    .line 27
    .line 28
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/high16 v2, 0x3f800000    # 1.0f

    .line 33
    .line 34
    cmpl-float v0, v0, v2

    .line 35
    .line 36
    if-lez v0, :cond_3

    .line 37
    .line 38
    new-instance v5, Lgg/r;

    .line 39
    .line 40
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 41
    .line 42
    .line 43
    iput p1, v5, Lgg/r;->g:F

    .line 44
    .line 45
    new-instance v3, Lgg/r;

    .line 46
    .line 47
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    const/16 v2, 0x1c

    .line 52
    .line 53
    invoke-static {v0, p1, v2}, Li/d;->b(FFI)Li/l;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    :try_start_1
    iget-object v6, p0, Lm/o;->l:Lm/p;

    .line 58
    .line 59
    iget-object p1, v6, Lm/p;->a:Li/u;

    .line 60
    .line 61
    iget-object v4, p0, Lm/o;->m:Lm/k2;

    .line 62
    .line 63
    new-instance v2, Lc9/k;

    .line 64
    .line 65
    const/16 v7, 0x8

    .line 66
    .line 67
    invoke-direct/range {v2 .. v7}, Lc9/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 68
    .line 69
    .line 70
    iput-object v5, p0, Lm/o;->h:Lgg/r;

    .line 71
    .line 72
    iput-object v0, p0, Lm/o;->i:Li/l;

    .line 73
    .line 74
    iput v1, p0, Lm/o;->j:I

    .line 75
    .line 76
    invoke-static {v0, p1, v2, p0}, Li/d;->f(Li/l;Li/u;Lfg/l;Lyf/c;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 80
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 81
    .line 82
    if-ne p1, v0, :cond_2

    .line 83
    .line 84
    return-object v0

    .line 85
    :cond_2
    move-object v1, v5

    .line 86
    goto :goto_0

    .line 87
    :catch_0
    move-object v1, v5

    .line 88
    :catch_1
    iget-object p1, v0, Li/l;->g:Li/m1;

    .line 89
    .line 90
    iget-object p1, p1, Li/m1;->b:Lfg/l;

    .line 91
    .line 92
    iget-object v0, v0, Li/l;->i:Li/q;

    .line 93
    .line 94
    invoke-interface {p1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    check-cast p1, Ljava/lang/Number;

    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    iput p1, v1, Lgg/r;->g:F

    .line 105
    .line 106
    :goto_0
    iget p1, v1, Lgg/r;->g:F

    .line 107
    .line 108
    :cond_3
    new-instance v0, Ljava/lang/Float;

    .line 109
    .line 110
    invoke-direct {v0, p1}, Ljava/lang/Float;-><init>(F)V

    .line 111
    .line 112
    .line 113
    return-object v0
.end method
