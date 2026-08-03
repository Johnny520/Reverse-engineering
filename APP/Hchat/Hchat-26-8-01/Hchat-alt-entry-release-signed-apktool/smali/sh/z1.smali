.class public final Lsh/z1;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public synthetic h:Ljava/lang/Object;

.field public final synthetic i:Z

.field public final synthetic j:Li/c;

.field public final synthetic k:Li/c;


# direct methods
.method public constructor <init>(ZLi/c;Li/c;Lwf/c;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lsh/z1;->i:Z

    .line 2
    .line 3
    iput-object p2, p0, Lsh/z1;->j:Li/c;

    .line 4
    .line 5
    iput-object p3, p0, Lsh/z1;->k:Li/c;

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
    .locals 4

    .line 1
    new-instance v0, Lsh/z1;

    .line 2
    .line 3
    iget-object v1, p0, Lsh/z1;->j:Li/c;

    .line 4
    .line 5
    iget-object v2, p0, Lsh/z1;->k:Li/c;

    .line 6
    .line 7
    iget-boolean v3, p0, Lsh/z1;->i:Z

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v2, p2}, Lsh/z1;-><init>(ZLi/c;Li/c;Lwf/c;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Lsh/z1;->h:Ljava/lang/Object;

    .line 13
    .line 14
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
    invoke-virtual {p0, p1, p2}, Lsh/z1;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lsh/z1;

    .line 10
    .line 11
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lsh/z1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, Lsh/z1;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lqg/t;

    .line 4
    .line 5
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x4

    .line 9
    const-wide v1, 0x401921fb54442d18L    # 6.283185307179586

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    const/4 v3, 0x3

    .line 15
    iget-object v4, p0, Lsh/z1;->k:Li/c;

    .line 16
    .line 17
    const/high16 v5, 0x3f800000    # 1.0f

    .line 18
    .line 19
    const/4 v6, 0x0

    .line 20
    iget-boolean v7, p0, Lsh/z1;->i:Z

    .line 21
    .line 22
    iget-object v8, p0, Lsh/z1;->j:Li/c;

    .line 23
    .line 24
    if-eqz v7, :cond_0

    .line 25
    .line 26
    const v7, 0x3e99999a    # 0.3f

    .line 27
    .line 28
    .line 29
    float-to-double v9, v7

    .line 30
    div-double/2addr v1, v9

    .line 31
    mul-double/2addr v1, v1

    .line 32
    double-to-float v1, v1

    .line 33
    invoke-static {v5, v1, v6, p1}, Li/d;->o(FFLjava/lang/Object;I)Li/r0;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    new-instance v1, Lsh/y1;

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    invoke-direct {v1, v8, p1, v6, v2}, Lsh/y1;-><init>(Li/c;Li/r0;Lwf/c;I)V

    .line 41
    .line 42
    .line 43
    invoke-static {v0, v6, v1, v3}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 44
    .line 45
    .line 46
    new-instance v1, Lsh/y1;

    .line 47
    .line 48
    const/4 v2, 0x1

    .line 49
    invoke-direct {v1, v4, p1, v6, v2}, Lsh/y1;-><init>(Li/c;Li/r0;Lwf/c;I)V

    .line 50
    .line 51
    .line 52
    invoke-static {v0, v6, v1, v3}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    const v7, 0x3e19999a    # 0.15f

    .line 57
    .line 58
    .line 59
    float-to-double v9, v7

    .line 60
    div-double/2addr v1, v9

    .line 61
    mul-double/2addr v1, v1

    .line 62
    double-to-float v1, v1

    .line 63
    invoke-static {v5, v1, v6, p1}, Li/d;->o(FFLjava/lang/Object;I)Li/r0;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    new-instance v1, Lsh/y1;

    .line 68
    .line 69
    const/4 v2, 0x2

    .line 70
    invoke-direct {v1, v8, p1, v6, v2}, Lsh/y1;-><init>(Li/c;Li/r0;Lwf/c;I)V

    .line 71
    .line 72
    .line 73
    invoke-static {v0, v6, v1, v3}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 74
    .line 75
    .line 76
    new-instance v1, Lsh/y1;

    .line 77
    .line 78
    const/4 v2, 0x3

    .line 79
    invoke-direct {v1, v4, p1, v6, v2}, Lsh/y1;-><init>(Li/c;Li/r0;Lwf/c;I)V

    .line 80
    .line 81
    .line 82
    invoke-static {v0, v6, v1, v3}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 83
    .line 84
    .line 85
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 86
    .line 87
    return-object p1
.end method
