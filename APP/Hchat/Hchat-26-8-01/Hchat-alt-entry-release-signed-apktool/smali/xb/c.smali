.class public final Lxb/c;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic h:Lxb/i;

.field public final synthetic i:F

.field public final synthetic j:Lqg/t;


# direct methods
.method public constructor <init>(Lxb/i;FLqg/t;Lwf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxb/c;->h:Lxb/i;

    .line 2
    .line 3
    iput p2, p0, Lxb/c;->i:F

    .line 4
    .line 5
    iput-object p3, p0, Lxb/c;->j:Lqg/t;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1, p4}, Lyf/i;-><init>(ILwf/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Lwf/c;)Lwf/c;
    .locals 4

    .line 1
    new-instance v0, Lxb/c;

    .line 2
    .line 3
    iget v1, p0, Lxb/c;->i:F

    .line 4
    .line 5
    iget-object v2, p0, Lxb/c;->j:Lqg/t;

    .line 6
    .line 7
    iget-object v3, p0, Lxb/c;->h:Lxb/i;

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v2, p1}, Lxb/c;-><init>(Lxb/i;FLqg/t;Lwf/c;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lwf/c;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lxb/c;->create(Lwf/c;)Lwf/c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lxb/c;

    .line 8
    .line 9
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lxb/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lxb/c;->h:Lxb/i;

    .line 5
    .line 6
    iget-object v0, p1, Lxb/i;->q:Lm/a;

    .line 7
    .line 8
    iget-object v0, v0, Lm/a;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lt1/b;

    .line 11
    .line 12
    iget-object v1, v0, Lt1/b;->a:Lt1/d;

    .line 13
    .line 14
    iget-object v2, v1, Lt1/d;->d:[Lt1/a;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-static {v3, v2}, Ltf/l;->x0(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    iput v2, v1, Lt1/d;->e:I

    .line 22
    .line 23
    iget-object v1, v0, Lt1/b;->b:Lt1/d;

    .line 24
    .line 25
    iget-object v4, v1, Lt1/d;->d:[Lt1/a;

    .line 26
    .line 27
    invoke-static {v3, v4}, Ltf/l;->x0(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iput v2, v1, Lt1/d;->e:I

    .line 31
    .line 32
    const-wide/16 v1, 0x0

    .line 33
    .line 34
    iput-wide v1, v0, Lt1/b;->c:J

    .line 35
    .line 36
    iget-object v0, p1, Lxb/i;->a:Lqg/t;

    .line 37
    .line 38
    new-instance v1, Lci/u;

    .line 39
    .line 40
    const/4 v2, 0x7

    .line 41
    invoke-direct {v1, p1, v3, v2}, Lci/u;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 42
    .line 43
    .line 44
    const/4 v2, 0x3

    .line 45
    invoke-static {v0, v3, v1, v2}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 46
    .line 47
    .line 48
    new-instance v1, Ljava/lang/Float;

    .line 49
    .line 50
    iget v4, p0, Lxb/c;->i:F

    .line 51
    .line 52
    invoke-direct {v1, v4}, Ljava/lang/Float;-><init>(F)V

    .line 53
    .line 54
    .line 55
    iget-object v4, p1, Lxb/i;->b:Llg/a;

    .line 56
    .line 57
    invoke-static {v1, v4}, Lr9/e0;->t(Ljava/lang/Float;Llg/a;)Ljava/lang/Comparable;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    check-cast v1, Ljava/lang/Number;

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    new-instance v4, Lxb/a;

    .line 68
    .line 69
    const/4 v5, 0x0

    .line 70
    invoke-direct {v4, p1, v1, v3, v5}, Lxb/a;-><init>(Lxb/i;FLwf/c;I)V

    .line 71
    .line 72
    .line 73
    iget-object v1, p0, Lxb/c;->j:Lqg/t;

    .line 74
    .line 75
    invoke-static {v1, v3, v4, v2}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 76
    .line 77
    .line 78
    iget-object v4, p1, Lxb/i;->l:Li/c;

    .line 79
    .line 80
    invoke-virtual {v4}, Li/c;->d()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    check-cast v4, Ljava/lang/Number;

    .line 85
    .line 86
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    const/4 v5, 0x0

    .line 91
    cmpg-float v4, v4, v5

    .line 92
    .line 93
    if-nez v4, :cond_0

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_0
    new-instance v4, Lxb/b;

    .line 97
    .line 98
    const/4 v5, 0x0

    .line 99
    invoke-direct {v4, p1, v3, v5}, Lxb/b;-><init>(Lxb/i;Lwf/c;I)V

    .line 100
    .line 101
    .line 102
    invoke-static {v1, v3, v4, v2}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 103
    .line 104
    .line 105
    :goto_0
    new-instance v1, Lci/j;

    .line 106
    .line 107
    const/16 v4, 0x18

    .line 108
    .line 109
    invoke-direct {v1, p1, v3, v4}, Lci/j;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 110
    .line 111
    .line 112
    invoke-static {v0, v3, v1, v2}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 113
    .line 114
    .line 115
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 116
    .line 117
    return-object p1
.end method
