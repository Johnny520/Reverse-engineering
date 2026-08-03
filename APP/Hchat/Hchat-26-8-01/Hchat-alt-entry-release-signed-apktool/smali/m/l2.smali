.class public final Lm/l2;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public h:Lm/o2;

.field public i:Lgg/t;

.field public j:J

.field public k:I

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:Lm/o2;

.field public final synthetic n:Lgg/t;

.field public final synthetic o:J


# direct methods
.method public constructor <init>(Lm/o2;Lgg/t;JLwf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm/l2;->m:Lm/o2;

    .line 2
    .line 3
    iput-object p2, p0, Lm/l2;->n:Lgg/t;

    .line 4
    .line 5
    iput-wide p3, p0, Lm/l2;->o:J

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p5}, Lyf/i;-><init>(ILwf/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 6

    .line 1
    new-instance v0, Lm/l2;

    .line 2
    .line 3
    iget-object v2, p0, Lm/l2;->n:Lgg/t;

    .line 4
    .line 5
    iget-wide v3, p0, Lm/l2;->o:J

    .line 6
    .line 7
    iget-object v1, p0, Lm/l2;->m:Lm/o2;

    .line 8
    .line 9
    move-object v5, p2

    .line 10
    invoke-direct/range {v0 .. v5}, Lm/l2;-><init>(Lm/o2;Lgg/t;JLwf/c;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, v0, Lm/l2;->l:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lm/m2;

    .line 2
    .line 3
    check-cast p2, Lwf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lm/l2;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lm/l2;

    .line 10
    .line 11
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lm/l2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lm/l2;->k:I

    .line 2
    .line 3
    sget-object v1, Lm/p1;->h:Lm/p1;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    if-ne v0, v2, :cond_0

    .line 9
    .line 10
    iget-wide v3, p0, Lm/l2;->j:J

    .line 11
    .line 12
    iget-object v0, p0, Lm/l2;->i:Lgg/t;

    .line 13
    .line 14
    iget-object v5, p0, Lm/l2;->h:Lm/o2;

    .line 15
    .line 16
    iget-object v6, p0, Lm/l2;->l:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v6, Lm/o2;

    .line 19
    .line 20
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    return-object p1

    .line 31
    :cond_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lm/l2;->l:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, Lm/m2;

    .line 37
    .line 38
    new-instance v0, Lm/k2;

    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    iget-object v5, p0, Lm/l2;->m:Lm/o2;

    .line 42
    .line 43
    invoke-direct {v0, v5, v3, p1}, Lm/k2;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget-object p1, v5, Lm/o2;->c:Lm/p;

    .line 47
    .line 48
    iget-object v3, p0, Lm/l2;->n:Lgg/t;

    .line 49
    .line 50
    iget-wide v6, v3, Lgg/t;->g:J

    .line 51
    .line 52
    iget-object v4, v5, Lm/o2;->d:Lm/p1;

    .line 53
    .line 54
    iget-wide v8, p0, Lm/l2;->o:J

    .line 55
    .line 56
    if-ne v4, v1, :cond_2

    .line 57
    .line 58
    invoke-static {v8, v9}, Lu2/q;->b(J)F

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    goto :goto_0

    .line 63
    :cond_2
    invoke-static {v8, v9}, Lu2/q;->c(J)F

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    :goto_0
    invoke-virtual {v5, v4}, Lm/o2;->d(F)F

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    iput-object v5, p0, Lm/l2;->l:Ljava/lang/Object;

    .line 72
    .line 73
    iput-object v5, p0, Lm/l2;->h:Lm/o2;

    .line 74
    .line 75
    iput-object v3, p0, Lm/l2;->i:Lgg/t;

    .line 76
    .line 77
    iput-wide v6, p0, Lm/l2;->j:J

    .line 78
    .line 79
    iput v2, p0, Lm/l2;->k:I

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    iget-object v8, p1, Lm/p;->b:Lm/w1;

    .line 85
    .line 86
    new-instance v9, Lm/o;

    .line 87
    .line 88
    const/4 v10, 0x0

    .line 89
    invoke-direct {v9, v4, p1, v0, v10}, Lm/o;-><init>(FLm/p;Lm/k2;Lwf/c;)V

    .line 90
    .line 91
    .line 92
    invoke-static {v8, v9, p0}, Lqg/v;->x(Lwf/g;Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 97
    .line 98
    if-ne p1, v0, :cond_3

    .line 99
    .line 100
    return-object v0

    .line 101
    :cond_3
    move-object v0, v3

    .line 102
    move-wide v3, v6

    .line 103
    move-object v6, v5

    .line 104
    :goto_1
    check-cast p1, Ljava/lang/Number;

    .line 105
    .line 106
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    invoke-virtual {v6, p1}, Lm/o2;->d(F)F

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    iget-object v5, v5, Lm/o2;->d:Lm/p1;

    .line 115
    .line 116
    const/4 v6, 0x0

    .line 117
    if-ne v5, v1, :cond_4

    .line 118
    .line 119
    const/4 v1, 0x2

    .line 120
    invoke-static {p1, v6, v1, v3, v4}, Lu2/q;->a(FFIJ)J

    .line 121
    .line 122
    .line 123
    move-result-wide v1

    .line 124
    goto :goto_2

    .line 125
    :cond_4
    invoke-static {v6, p1, v2, v3, v4}, Lu2/q;->a(FFIJ)J

    .line 126
    .line 127
    .line 128
    move-result-wide v1

    .line 129
    :goto_2
    iput-wide v1, v0, Lgg/t;->g:J

    .line 130
    .line 131
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 132
    .line 133
    return-object p1
.end method
