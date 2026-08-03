.class public final Lh0/v0;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public h:I

.field public final synthetic i:Lh0/d1;


# direct methods
.method public constructor <init>(Lh0/d1;Lwf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lh0/v0;->i:Lh0/d1;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1, p2}, Lyf/i;-><init>(ILwf/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Lwf/c;)Lwf/c;
    .locals 2

    .line 1
    new-instance v0, Lh0/v0;

    .line 2
    .line 3
    iget-object v1, p0, Lh0/v0;->i:Lh0/d1;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, Lh0/v0;-><init>(Lh0/d1;Lwf/c;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lwf/c;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lh0/v0;->create(Lwf/c;)Lwf/c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lh0/v0;

    .line 8
    .line 9
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lh0/v0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lh0/v0;->h:I

    .line 2
    .line 3
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, p0, Lh0/v0;->i:Lh0/d1;

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
    goto :goto_5

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
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iput v3, p0, Lh0/v0;->h:I

    .line 36
    .line 37
    invoke-virtual {v4, p0}, Lh0/d1;->s(Lyf/c;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-ne p1, v5, :cond_3

    .line 42
    .line 43
    goto :goto_4

    .line 44
    :cond_3
    :goto_0
    invoke-static {v4}, Lh0/d1;->a(Lh0/d1;)Lsf/e;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    if-eqz p1, :cond_7

    .line 49
    .line 50
    iget-object v0, p1, Lsf/e;->g:Ljava/lang/Object;

    .line 51
    .line 52
    move-object v8, v0

    .line 53
    check-cast v8, Ljava/lang/String;

    .line 54
    .line 55
    iget-object p1, p1, Lsf/e;->h:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p1, Li2/m0;

    .line 58
    .line 59
    iget-wide v9, p1, Li2/m0;->a:J

    .line 60
    .line 61
    iget-object v7, v4, Lh0/d1;->i:Lh0/p;

    .line 62
    .line 63
    if-eqz v7, :cond_7

    .line 64
    .line 65
    iput v2, p0, Lh0/v0;->h:I

    .line 66
    .line 67
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-nez p1, :cond_4

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_4
    invoke-static {v9, v10}, Li2/m0;->c(J)Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-eqz p1, :cond_5

    .line 79
    .line 80
    :goto_1
    move-object p1, v1

    .line 81
    goto :goto_2

    .line 82
    :cond_5
    new-instance v6, Lc0/i;

    .line 83
    .line 84
    const/4 v11, 0x0

    .line 85
    const/4 v12, 0x2

    .line 86
    invoke-direct/range {v6 .. v12}, Lc0/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;JLwf/c;I)V

    .line 87
    .line 88
    .line 89
    iget-object p1, v7, Lh0/p;->a:Lwf/g;

    .line 90
    .line 91
    new-instance v0, Lci/e;

    .line 92
    .line 93
    const/4 v2, 0x0

    .line 94
    invoke-direct {v0, v7, v6, v2}, Lci/e;-><init>(Lh0/p;Lfg/p;Lwf/c;)V

    .line 95
    .line 96
    .line 97
    invoke-static {p1, v0, p0}, Lqg/v;->x(Lwf/g;Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    :goto_2
    if-ne p1, v5, :cond_6

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_6
    move-object p1, v1

    .line 105
    :goto_3
    if-ne p1, v5, :cond_7

    .line 106
    .line 107
    :goto_4
    return-object v5

    .line 108
    :cond_7
    :goto_5
    iput-boolean v3, v4, Lh0/d1;->A:Z

    .line 109
    .line 110
    return-object v1
.end method
