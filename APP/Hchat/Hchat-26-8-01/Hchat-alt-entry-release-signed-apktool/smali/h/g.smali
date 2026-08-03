.class public final Lh/g;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:Lw0/p;

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Lh/t;

.field public final synthetic j:Ls0/d;


# direct methods
.method public constructor <init>(Lw0/p;Ljava/lang/Object;Lh/t;Ls0/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lh/g;->g:Lw0/p;

    .line 2
    .line 3
    iput-object p2, p0, Lh/g;->h:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lh/g;->i:Lh/t;

    .line 6
    .line 7
    iput-object p4, p0, Lh/g;->j:Ls0/d;

    .line 8
    .line 9
    const/4 p1, 0x3

    .line 10
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, Lh/b0;

    .line 2
    .line 3
    check-cast p2, Li0/h0;

    .line 4
    .line 5
    check-cast p3, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    and-int/lit8 v0, p3, 0x6

    .line 12
    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    and-int/lit8 v0, p3, 0x8

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p2, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p2, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    :goto_0
    if-eqz v0, :cond_1

    .line 29
    .line 30
    const/4 v0, 0x4

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    const/4 v0, 0x2

    .line 33
    :goto_1
    or-int/2addr p3, v0

    .line 34
    :cond_2
    and-int/lit8 v0, p3, 0x13

    .line 35
    .line 36
    const/16 v1, 0x12

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    const/4 v3, 0x1

    .line 40
    if-eq v0, v1, :cond_3

    .line 41
    .line 42
    move v0, v3

    .line 43
    goto :goto_2

    .line 44
    :cond_3
    move v0, v2

    .line 45
    :goto_2
    and-int/2addr p3, v3

    .line 46
    invoke-virtual {p2, p3, v0}, Li0/h0;->S(IZ)Z

    .line 47
    .line 48
    .line 49
    move-result p3

    .line 50
    if-eqz p3, :cond_7

    .line 51
    .line 52
    iget-object p3, p0, Lh/g;->g:Lw0/p;

    .line 53
    .line 54
    invoke-virtual {p2, p3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-object v1, p0, Lh/g;->h:Ljava/lang/Object;

    .line 59
    .line 60
    invoke-virtual {p2, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    or-int/2addr v0, v3

    .line 65
    iget-object v3, p0, Lh/g;->i:Lh/t;

    .line 66
    .line 67
    invoke-virtual {p2, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    or-int/2addr v0, v4

    .line 72
    invoke-virtual {p2}, Li0/h0;->P()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    sget-object v5, Li0/l;->a:Li0/e;

    .line 77
    .line 78
    if-nez v0, :cond_4

    .line 79
    .line 80
    if-ne v4, v5, :cond_5

    .line 81
    .line 82
    :cond_4
    new-instance v4, Lb1/g;

    .line 83
    .line 84
    const/4 v0, 0x2

    .line 85
    invoke-direct {v4, p3, v1, v3, v0}, Lb1/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p2, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_5
    check-cast v4, Lfg/l;

    .line 92
    .line 93
    invoke-static {p1, v4, p2}, Li0/r;->c(Ljava/lang/Object;Lfg/l;Li0/h0;)V

    .line 94
    .line 95
    .line 96
    iget-object p3, v3, Lh/t;->c:Lf/k0;

    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    check-cast p1, Lh/c0;

    .line 102
    .line 103
    iget-object p1, p1, Lh/c0;->a:Li0/j1;

    .line 104
    .line 105
    invoke-virtual {p3, v1, p1}, Lf/k0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p2}, Li0/h0;->P()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    if-ne p1, v5, :cond_6

    .line 113
    .line 114
    new-instance p1, Lh/n;

    .line 115
    .line 116
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p2, p1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    :cond_6
    check-cast p1, Lh/n;

    .line 123
    .line 124
    iget-object p3, p0, Lh/g;->j:Ls0/d;

    .line 125
    .line 126
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-virtual {p3, p1, v1, p2, v0}, Ls0/d;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_7
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 135
    .line 136
    .line 137
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 138
    .line 139
    return-object p1
.end method
